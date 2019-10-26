package application;

/* WIN32 */
/* USE_SPIN_LOCKS */
/* pthreads-based locks */
/* Cope with old-style linux recursive lock initialization by adding */
/* skipped internal declaration from pthread.h */
/* WIN32 */
/* Win32 critical sections */
/* Use spin loop to initialize global lock */
/* transition to < 0 while initializing, then to > 0) */
/* WIN32 */
/* USE_SPIN_LOCKS */
/* USE_LOCKS == 1 */
/* -----------------------  User-defined locks ------------------------ */
/* Define your own lock implementation here */
/* #define INITIAL_LOCK(sl)  ... */
/* #define ACQUIRE_LOCK(sl)  ... */
/* #define RELEASE_LOCK(sl)  ... */
/* #define TRY_LOCK(sl) ... */
/* static MLOCK_T malloc_global_mutex = ... */
/* USE_LOCKS > 1 */
/* -----------------------  Lock-based state ------------------------ */
/* USE_LOCKS */
/* USE_LOCKS */
/* USE_LOCKS */
/* USE_LOCKS */
/* -----------------------  Chunk representations ------------------------ */
/*
  (The following includes lightly edited explanations by Colin Plumb.)

  The malloc_chunk declaration below is misleading (but accurate and
  necessary).  It declares a "view" into memory allowing access to
  necessary fields at known offsets from a given base.

  Chunks of memory are maintained using a `boundary tag' method as
  originally described by Knuth.  (See the paper by Paul Wilson
  ftp://ftp.cs.utexas.edu/pub/garbage/allocsrv.ps for a survey of such
  techniques.)  Sizes of free chunks are stored both in the front of
  each chunk and at the end.  This makes consolidating fragmented
  chunks into bigger chunks fast.  The head fields also hold bits
  representing whether chunks are free or in use.

  Here are some pictures to make it clearer.  They are "exploded" to
  show that the state of a chunk can be thought of as extending from
  the high 31 bits of the head field of its header through the
  prev_foot and PINUSE_BIT bit of the following chunk header.

  A chunk that's in use looks like:

   chunk-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	   | Size of previous chunk (if P = 0)                             |
	   +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ |P|
	 | Size of this chunk                                         1| +-+
   mem-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 |                                                               |
	 +-                                                             -+
	 |                                                               |
	 +-                                                             -+
	 |                                                               :
	 +-      size - sizeof(size_t) available payload bytes          -+
	 :                                                               |
 chunk-> +-                                                             -+
	 |                                                               |
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
       +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ |1|
       | Size of next chunk (may or may not be in use)               | +-+
 mem-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+

    And if it's free, it looks like this:

   chunk-> +-                                                             -+
	   | User payload (must be in use, or we would have merged!)       |
	   +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ |P|
	 | Size of this chunk                                         0| +-+
   mem-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 | Next pointer                                                  |
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 | Prev pointer                                                  |
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 |                                                               :
	 +-      size - sizeof(struct chunk) unused bytes               -+
	 :                                                               |
 chunk-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 | Size of this chunk                                            |
	 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
       +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ |0|
       | Size of next chunk (must be in use, or we would have merged)| +-+
 mem-> +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
       |                                                               :
       +- User payload                                                -+
       :                                                               |
       +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
								     |0|
								     +-+
  Note that since we always merge adjacent free chunks, the chunks
  adjacent to a free chunk must be in use.

  Given a pointer to a chunk (which can be derived trivially from the
  payload pointer) we can, in O(1) time, find out whether the adjacent
  chunks are free, and if so, unlink them from the lists that they
  are on and merge them with the current chunk.

  Chunks always begin on even word boundaries, so the mem portion
  (which is returned to the user) is also on an even word boundary, and
  thus at least double-word aligned.

  The P (PINUSE_BIT) bit, stored in the unused low-order bit of the
  chunk size (which is always a multiple of two words), is an in-use
  bit for the *previous* chunk.  If that bit is *clear*, then the
  word before the current chunk size contains the previous chunk
  size, and can be used to find the front of the previous chunk.
  The very first chunk allocated always has this bit set, preventing
  access to non-existent (or non-owned) memory. If pinuse is set for
  any given chunk, then you CANNOT determine the size of the
  previous chunk, and might even get a memory addressing fault when
  trying to do so.

  The C (CINUSE_BIT) bit, stored in the unused second-lowest bit of
  the chunk size redundantly records whether the current chunk is
  inuse. This redundancy enables usage checks within free and realloc,
  and reduces indirection when freeing and consolidating chunks.

  Each freshly allocated chunk must have both cinuse and pinuse set.
  That is, each allocated chunk borders either a previously allocated
  and still in-use chunk, or the base of its memory arena. This is
  ensured by making all allocations from the `lowest' part of any
  found chunk.  Further, no free chunk physically borders another one,
  so each free chunk is known to be preceded and followed by either
  inuse chunks or the ends of memory.

  Note that the `foot' of the current chunk is actually represented
  as the prev_foot of the NEXT chunk. This makes it easier to
  deal with alignments etc but can be very confusing when trying
  to extend or adapt this code.

  The exceptions to all this are

     1. The special chunk `top' is the top-most available chunk (i.e.,
	the one bordering the end of available memory). It is treated
	specially.  Top is never included in any bin, is used only if
	no other chunk is available, and is released back to the
	system if it is very large (see M_TRIM_THRESHOLD).  In effect,
	the top chunk is treated as larger (and thus less well
	fitting) than any other available chunk.  The top chunk
	doesn't update its trailing size field since there is no next
	contiguous chunk that would have to index off it. However,
	space is still allocated for it (TOP_FOOT_SIZE) to enable
	separation or merging when space is extended.

     3. Chunks allocated via mmap, which have the lowest-order bit
	(IS_MMAPPED_BIT) set in their prev_foot fields, and do not set
	PINUSE_BIT in their head fields.  Because they are allocated
	one-by-one, each must carry its own prev_foot field, which is
	also used to hold the offset this chunk has within its mmapped
	region, which is needed to preserve alignment. Each mmapped
	chunk is trailed by the first two fields of a fake next-chunk
	for sake of usage checks.

*/
/* double links -- used only if free. */
/* The type of bins of chunks */
public class malloc_chunk {
	private Object prev_foot;
	private Object head;
	private malloc_chunk fd;
	private malloc_chunk bk;
	
	public malloc_chunk(Object prev_foot, Object head, malloc_chunk fd, malloc_chunk bk) {
		setPrev_foot(prev_foot);
		setHead(head);
		setFd(fd);
		setBk(bk);
	}
	public malloc_chunk() {
	}
	
	public Object getPrev_foot() {
		return prev_foot;
	}
	public void setPrev_foot(Object newPrev_foot) {
		prev_foot = newPrev_foot;
	}
	public Object getHead() {
		return head;
	}
	public void setHead(Object newHead) {
		head = newHead;
	}
	public malloc_chunk getFd() {
		return fd;
	}
	public void setFd(malloc_chunk newFd) {
		fd = newFd;
	}
	public malloc_chunk getBk() {
		return bk;
	}
	public void setBk(malloc_chunk newBk) {
		bk = newBk;
	}
}
/* Described below */
/* Described below */
/* The type of various bit flag sets */
/* ------------------- Chunks sizes and alignments ----------------------- */
/* FOOTERS */
/* FOOTERS */
/* MMapped chunks need a second word of overhead ... */
/* ... and additional padding for fake next-chunk at foot */
/* The smallest size we can malloc is an aligned minimal chunk */
/* conversion from malloc headers to user pointers, and back */
/* chunk associated with aligned address A */
/* Bounds on request (not chunk) sizes. */
/* pad request bytes into a usable size */
/* pad request, checking for minimum (but not maximum) */
/* ------------------ Operations on head and foot fields ----------------- */
/*
  The head field of a chunk is or'ed with PINUSE_BIT when previous
  adjacent chunk in use, and or'ed with CINUSE_BIT if this chunk is in
  use. If the chunk was obtained with mmap, the prev_foot field has
  IS_MMAPPED_BIT set, otherwise holding the offset of the base of the
  mmapped region to the base of the chunk.

  FLAG4_BIT is not used by this malloc, but might be useful in extensions.
*/
/* Head value for fenceposts */
/* extraction of fields from head words */
/* Treat space at ptr +/- offset as a chunk */
/* Ptr to next or previous physical malloc_chunk. */
/* extract next chunk's pinuse bit */
/* Get/set size at footer */
/* Set size, pinuse bit, and foot */
/* Set size, pinuse bit, foot, and clear next pinuse */
/* Get the internal overhead associated with chunk p */
