package application;

/*
  This is a version (aka dlmalloc) of malloc/free/realloc written by
  Doug Lea and released to the public domain, as explained at
  http://creativecommons.org/licenses/publicdomain.  Send questions,
  comments, complaints, performance data, etc to dl@cs.oswego.edu

* Version pre-2.8.4 Mon Nov 27 11:22:37 2006    (dl at gee)

   Note: There may be an updated version of this malloc obtainable at
	   ftp://gee.cs.oswego.edu/pub/misc/malloc.c
	 Check before installing!

* Quickstart

  This library is all in one file to simplify the most common usage:
  ftp it, compile it (-O3), and link it into another program. All of
  the compile-time options default to reasonable values for use on
  most platforms.  You might later want to step through various
  compile-time and dynamic tuning options.

  For convenience, an include file for code using this malloc is at:
     ftp://gee.cs.oswego.edu/pub/misc/malloc-2.8.4.h
  You don't really need this .h file unless you call functions not
  defined in your system include files.  The .h file contains only the
  excerpts from this file needed for using this malloc on ANSI C/C++
  systems, so long as you haven't changed compile-time options about
  naming and tuning parameters.  If you do, then you can create your
  own malloc.h that does include all settings by cutting at the point
  indicated below. Note that you may already by default be using a C
  library containing a malloc that is based on some version of this
  malloc (for example in linux). You might still want to use the one
  in this file to customize settings or to avoid overheads associated
  with library versions.

* Vital statistics:

  Supported pointer/size_t representation:       4 or 8 bytes
       size_t MUST be an unsigned type of the same width as
       pointers. (If you are using an ancient system that declares
       size_t as a signed type, or need it to be a different width
       than pointers, you can use a previous release of this malloc
       (e.g. 2.7.2) supporting these.)

  Alignment:                                     8 bytes (default)
       This suffices for nearly all current machines and C compilers.
       However, you can define MALLOC_ALIGNMENT to be wider than this
       if necessary (up to 128bytes), at the expense of using more space.

  Minimum overhead per allocated chunk:   4 or  8 bytes (if 4byte sizes)
					  8 or 16 bytes (if 8byte sizes)
       Each malloced chunk has a hidden word of overhead holding size
       and status information, and additional cross-check word
       if FOOTERS is defined.

  Minimum allocated size: 4-byte ptrs:  16 bytes    (including overhead)
			  8-byte ptrs:  32 bytes    (including overhead)

       Even a request for zero bytes (i.e., malloc(0)) returns a
       pointer to something of the minimum allocatable size.
       The maximum overhead wastage (i.e., number of extra bytes
       allocated than were requested in malloc) is less than or equal
       to the minimum size, except for requests >= mmap_threshold that
       are serviced via mmap(), where the worst case wastage is about
       32 bytes plus the remainder from a system page (the minimal
       mmap unit); typically 4096 or 8192 bytes.

  Security: static-safe; optionally more or less
       The "security" of malloc refers to the ability of malicious
       code to accentuate the effects of errors (for example, freeing
       space that is not currently malloc'ed or overwriting past the
       ends of chunks) in code that calls malloc.  This malloc
       guarantees not to modify any memory locations below the base of
       heap, i.e., static variables, even in the presence of usage
       errors.  The routines additionally detect most improper frees
       and reallocs.  All this holds as long as the static bookkeeping
       for malloc itself is not corrupted by some other means.  This
       is only one aspect of security -- these checks do not, and
       cannot, detect all possible programming errors.

       If FOOTERS is defined nonzero, then each allocated chunk
       carries an additional check word to verify that it was malloced
       from its space.  These check words are the same within each
       execution of a program using malloc, but differ across
       executions, so externally crafted fake chunks cannot be
       freed. This improves security by rejecting frees/reallocs that
       could corrupt heap memory, in addition to the checks preventing
       writes to statics that are always on.  This may further improve
       security at the expense of time and space overhead.  (Note that
       FOOTERS may also be worth using with MSPACES.)

       By default detected errors cause the program to abort (calling
       "abort()"). You can override this to instead proceed past
       errors by defining PROCEED_ON_ERROR.  In this case, a bad free
       has no effect, and a malloc that encounters a bad address
       caused by user overwrites will ignore the bad address by
       dropping pointers and indices to all known memory. This may
       be appropriate for programs that should continue if at all
       possible in the face of programming errors, although they may
       run out of memory because dropped memory is never reclaimed.

       If you don't like either of these options, you can define
       CORRUPTION_ERROR_ACTION and USAGE_ERROR_ACTION to do anything
       else. And if you are sure that your program using malloc has
       no errors or vulnerabilities, you can define INSECURE to 1,
       which might (or might not) provide a small performance improvement.

  Thread-safety: NOT thread-safe unless USE_LOCKS defined
       When USE_LOCKS is defined, each public call to malloc, free,
       etc is surrounded with either a pthread mutex or a win32
       spinlock (depending on WIN32). This is not especially fast, and
       can be a major bottleneck.  It is designed only to provide
       minimal protection in concurrent environments, and to provide a
       basis for extensions.  If you are using malloc in a concurrent
       program, consider instead using nedmalloc
       (http://www.nedprod.com/programs/portable/nedmalloc/) or
       ptmalloc (See http://www.malloc.de), which are derived
       from versions of this malloc.

  System requirements: Any combination of MORECORE and/or MMAP/MUNMAP
       This malloc can use unix sbrk or any emulation (invoked using
       the CALL_MORECORE macro) and/or mmap/munmap or any emulation
       (invoked using CALL_MMAP/CALL_MUNMAP) to get and release system
       memory.  On most unix systems, it tends to work best if both
       MORECORE and MMAP are enabled.  On Win32, it uses emulations
       based on VirtualAlloc. It also uses common C library functions
       like memset.

  Compliance: I believe it is compliant with the Single Unix Specification
       (See http://www.unix.org). Also SVID/XPG, ANSI C, and probably
       others as well.

* Overview of algorithms

  This is not the fastest, most space-conserving, most portable, or
  most tunable malloc ever written. However it is among the fastest
  while also being among the most space-conserving, portable and
  tunable.  Consistent balance across these factors results in a good
  general-purpose allocator for malloc-intensive programs.

  In most ways, this malloc is a best-fit allocator. Generally, it
  chooses the best-fitting existing chunk for a request, with ties
  broken in approximately least-recently-used order. (This strategy
  normally maintains low fragmentation.) However, for requests less
  than 256bytes, it deviates from best-fit when there is not an
  exactly fitting available chunk by preferring to use space adjacent
  to that used for the previous small request, as well as by breaking
  ties in approximately most-recently-used order. (These enhance
  locality of series of small allocations.)  And for very large requests
  (>= 256Kb by default), it relies on system memory mapping
  facilities, if supported.  (This helps avoid carrying around and
  possibly fragmenting memory used only for large chunks.)

  All operations (except malloc_stats and mallinfo) have execution
  times that are bounded by a constant factor of the number of bits in
  a size_t, not counting any clearing in calloc or copying in realloc,
  or actions surrounding MORECORE and MMAP that have times
  proportional to the number of non-contiguous regions returned by
  system allocation routines, which is often just 1. In real-time
  applications, you can optionally suppress segment traversals using
  NO_SEGMENT_TRAVERSAL, which assures bounded execution even when
  system allocators return non-contiguous spaces, at the typical
  expense of carrying around more memory and increased fragmentation.

  The implementation is not very modular and seriously overuses
  macros. Perhaps someday all C compilers will do as good a job
  inlining modular code as can now be done by brute-force expansion,
  but now, enough of them seem not to.

  Some compilers issue a lot of warnings about code that is
  dead/unreachable only on some platforms, and also about intentional
  uses of negation on unsigned types. All known cases of each can be
  ignored.

  For a longer but out of date high-level description, see
     http://gee.cs.oswego.edu/dl/html/malloc.html

* MSPACES
  If MSPACES is defined, then in addition to malloc, free, etc.,
  this file also defines mspace_malloc, mspace_free, etc. These
  are versions of malloc routines that take an "mspace" argument
  obtained using create_mspace, to control all internal bookkeeping.
  If ONLY_MSPACES is defined, only these versions are compiled.
  So if you would like to use this allocator for only some allocations,
  and your system malloc for others, you can compile with
  ONLY_MSPACES and then do something like...
    static mspace mymspace = create_mspace(0,0); // for example
    #define mymalloc(bytes)  mspace_malloc(mymspace, bytes)

  (Note: If you only need one instance of an mspace, you can instead
  use "USE_DL_PREFIX" to relabel the global malloc.)

  You can similarly create thread-local allocators by storing
  mspaces as thread-locals. For example:
    static __thread mspace tlms = 0;
    void*  tlmalloc(size_t bytes) {
      if (tlms == 0) tlms = create_mspace(0, 0);
      return mspace_malloc(tlms, bytes);
    }
    void  tlfree(void* mem) { mspace_free(tlms, mem); }

  Unless FOOTERS is defined, each mspace is completely independent.
  You cannot allocate from one and free to another (although
  conformance is only weakly checked, so usage errors are not always
  caught). If FOOTERS is defined, then each chunk carries around a tag
  indicating its originating mspace, and frees are directed to their
  originating spaces.

 -------------------------  Compile-time options ---------------------------

Be careful in setting #define values for numerical constants of type
size_t. On some systems, literal values are not automatically extended
to size_t precision unless they are explicitly casted. You can also
use the symbolic values MAX_SIZE_T, SIZE_T_ONE, etc below.

WIN32                    default: defined if _WIN32 defined
  Defining WIN32 sets up defaults for MS environment and compilers.
  Otherwise defaults are for unix. Beware that there seem to be some
  cases where this malloc might not be a pure drop-in replacement for
  Win32 malloc: Random-looking failures from Win32 GDI API's (eg;
  SetDIBits()) may be due to bugs in some video driver implementations
  when pixel buffers are malloc()ed, and the region spans more than
  one VirtualAlloc()ed region. Because dlmalloc uses a small (64Kb)
  default granularity, pixel buffers may straddle virtual allocation
  regions more often than when using the Microsoft allocator.  You can
  avoid this by using VirtualAlloc() and VirtualFree() for all pixel
  buffers rather than using malloc().  If this is not possible,
  recompile this malloc with a larger DEFAULT_GRANULARITY.

MALLOC_ALIGNMENT         default: (size_t)8
  Controls the minimum alignment for malloc'ed chunks.  It must be a
  power of two and at least 8, even on machines for which smaller
  alignments would suffice. It may be defined as larger than this
  though. Note however that code and data structures are optimized for
  the case of 8-byte alignment.

MSPACES                  default: 0 (false)
  If true, compile in support for independent allocation spaces.
  This is only supported if HAVE_MMAP is true.

ONLY_MSPACES             default: 0 (false)
  If true, only compile in mspace versions, not regular versions.

USE_LOCKS                default: 0 (false)
  Causes each call to each public routine to be surrounded with
  pthread or WIN32 mutex lock/unlock. (If set true, this can be
  overridden on a per-mspace basis for mspace versions.) If set to a
  non-zero value other than 1, locks are used, but their
  implementation is left out, so lock functions must be supplied manually.

USE_SPIN_LOCKS           default: 1 iff USE_LOCKS and on x86 using gcc or MSC
  If true, uses custom spin locks for locking. This is currently
  supported only for x86 platforms using gcc or recent MS compilers.
  Otherwise, posix locks or win32 critical sections are used.

FOOTERS                  default: 0
  If true, provide extra checking and dispatching by placing
  information in the footers of allocated chunks. This adds
  space and time overhead.

INSECURE                 default: 0
  If true, omit checks for usage errors and heap space overwrites.

USE_DL_PREFIX            default: NOT defined
  Causes compiler to prefix all public routines with the string 'dl'.
  This can be useful when you only want to use this malloc in one part
  of a program, using your regular system malloc elsewhere.

ABORT                    default: defined as abort()
  Defines how to abort on failed checks.  On most systems, a failed
  check cannot die with an "assert" or even print an informative
  message, because the underlying print routines in turn call malloc,
  which will fail again.  Generally, the best policy is to simply call
  abort(). It's not very useful to do more than this because many
  errors due to overwriting will show up as address faults (null, odd
  addresses etc) rather than malloc-triggered checks, so will also
  abort.  Also, most compilers know that abort() does not return, so
  can better optimize code conditionally calling it.

PROCEED_ON_ERROR           default: defined as 0 (false)
  Controls whether detected bad addresses cause them to bypassed
  rather than aborting. If set, detected bad arguments to free and
  realloc are ignored. And all bookkeeping information is zeroed out
  upon a detected overwrite of freed heap space, thus losing the
  ability to ever return it from malloc again, but enabling the
  application to proceed. If PROCEED_ON_ERROR is defined, the
  static variable malloc_corruption_error_count is compiled in
  and can be examined to see if errors have occurred. This option
  generates slower code than the default abort policy.

DEBUG                    default: NOT defined
  The DEBUG setting is mainly intended for people trying to modify
  this code or diagnose problems when porting to new platforms.
  However, it may also be able to better isolate user errors than just
  using runtime checks.  The assertions in the check routines spell
  out in more detail the assumptions and invariants underlying the
  algorithms.  The checking is fairly extensive, and will slow down
  execution noticeably. Calling malloc_stats or mallinfo with DEBUG
  set will attempt to check every non-mmapped allocated and free chunk
  in the course of computing the summaries.

ABORT_ON_ASSERT_FAILURE   default: defined as 1 (true)
  Debugging assertion failures can be nearly impossible if your
  version of the assert macro causes malloc to be called, which will
  lead to a cascade of further failures, blowing the runtime stack.
  ABORT_ON_ASSERT_FAILURE cause assertions failures to call abort(),
  which will usually make debugging easier.

MALLOC_FAILURE_ACTION     default: sets errno to ENOMEM, or no-op on win32
  The action to take before "return 0" when malloc fails to be able to
  return memory because there is none available.

HAVE_MORECORE             default: 1 (true) unless win32 or ONLY_MSPACES
  True if this system supports sbrk or an emulation of it.

MORECORE                  default: sbrk
  The name of the sbrk-style system routine to call to obtain more
  memory.  See below for guidance on writing custom MORECORE
  functions. The type of the argument to sbrk/MORECORE varies across
  systems.  It cannot be size_t, because it supports negative
  arguments, so it is normally the signed type of the same width as
  size_t (sometimes declared as "intptr_t").  It doesn't much matter
  though. Internally, we only call it with arguments less than half
  the max value of a size_t, which should work across all reasonable
  possibilities, although sometimes generating compiler warnings.

MORECORE_CONTIGUOUS       default: 1 (true) if HAVE_MORECORE
  If true, take advantage of fact that consecutive calls to MORECORE
  with positive arguments always return contiguous increasing
  addresses.  This is true of unix sbrk. It does not hurt too much to
  set it true anyway, since malloc copes with non-contiguities.
  Setting it false when definitely non-contiguous saves time
  and possibly wasted space it would take to discover this though.

MORECORE_CANNOT_TRIM      default: NOT defined
  True if MORECORE cannot release space back to the system when given
  negative arguments. This is generally necessary only if you are
  using a hand-crafted MORECORE function that cannot handle negative
  arguments.

NO_SEGMENT_TRAVERSAL       default: 0
  If non-zero, suppresses traversals of memory segments
  returned by either MORECORE or CALL_MMAP. This disables
  merging of segments that are contiguous, and selectively
  releasing them to the OS if unused, but bounds execution times.

HAVE_MMAP                 default: 1 (true)
  True if this system supports mmap or an emulation of it.  If so, and
  HAVE_MORECORE is not true, MMAP is used for all system
  allocation. If set and HAVE_MORECORE is true as well, MMAP is
  primarily used to directly allocate very large blocks. It is also
  used as a backup strategy in cases where MORECORE fails to provide
  space from system. Note: A single call to MUNMAP is assumed to be
  able to unmap memory that may have be allocated using multiple calls
  to MMAP, so long as they are adjacent.

HAVE_MREMAP               default: 1 on linux, else 0
  If true realloc() uses mremap() to re-allocate large blocks and
  extend or shrink allocation spaces.

MMAP_CLEARS               default: 1 except on WINCE.
  True if mmap clears memory so calloc doesn't need to. This is true
  for standard unix mmap using /dev/zero and on WIN32 except for WINCE.

USE_BUILTIN_FFS            default: 0 (i.e., not used)
  Causes malloc to use the builtin ffs() function to compute indices.
  Some compilers may recognize and intrinsify ffs to be faster than the
  supplied C version. Also, the case of x86 using gcc is special-cased
  to an asm instruction, so is already as fast as it can be, and so
  this setting has no effect. Similarly for Win32 under recent MS compilers.
  (On most x86s, the asm version is only slightly faster than the C version.)

malloc_getpagesize         default: derive from system includes, or 4096.
  The system page size. To the extent possible, this malloc manages
  memory from the system in page-size units.  This may be (and
  usually is) a function rather than a constant. This is ignored
  if WIN32, where page size is determined using getSystemInfo during
  initialization.

USE_DEV_RANDOM             default: 0 (i.e., not used)
  Causes malloc to use /dev/random to initialize secure magic seed for
  stamping footers. Otherwise, the current time is used.

NO_MALLINFO                default: 0
  If defined, don't compile "mallinfo". This can be a simple way
  of dealing with mismatches between system declarations and
  those in this file.

MALLINFO_FIELD_TYPE        default: size_t
  The type of the fields in the mallinfo struct. This was originally
  defined as "int" in SVID etc, but is more usefully defined as
  size_t. The value is used only if  HAVE_USR_INCLUDE_MALLOC_H is not set

REALLOC_ZERO_BYTES_FREES    default: not defined
  This should be set if a call to realloc with zero bytes should
  be the same as a call to free. Some people think it should. Otherwise,
  since this malloc returns a unique pointer for malloc(0), so does
  realloc(p, 0).

LACKS_UNISTD_H, LACKS_FCNTL_H, LACKS_SYS_PARAM_H, LACKS_SYS_MMAN_H
LACKS_STRINGS_H, LACKS_STRING_H, LACKS_SYS_TYPES_H,  LACKS_ERRNO_H
LACKS_STDLIB_H                default: NOT defined unless on WIN32
  Define these if your system does not have these header files.
  You might need to manually insert some of the declarations they provide.

DEFAULT_GRANULARITY        default: page size if MORECORE_CONTIGUOUS,
				system_info.dwAllocationGranularity in WIN32,
				otherwise 64K.
      Also settable using mallopt(M_GRANULARITY, x)
  The unit for allocating and deallocating memory from the system.  On
  most systems with contiguous MORECORE, there is no reason to
  make this more than a page. However, systems with MMAP tend to
  either require or encourage larger granularities.  You can increase
  this value to prevent system allocation functions to be called so
  often, especially if they are slow.  The value must be at least one
  page and must be a power of two.  Setting to 0 causes initialization
  to either page size or win32 region size.  (Note: In previous
  versions of malloc, the equivalent of this option was called
  "TOP_PAD")

DEFAULT_TRIM_THRESHOLD    default: 2MB
      Also settable using mallopt(M_TRIM_THRESHOLD, x)
  The maximum amount of unused top-most memory to keep before
  releasing via malloc_trim in free().  Automatic trimming is mainly
  useful in long-lived programs using contiguous MORECORE.  Because
  trimming via sbrk can be slow on some systems, and can sometimes be
  wasteful (in cases where programs immediately afterward allocate
  more large chunks) the value should be high enough so that your
  overall system performance would improve by releasing this much
  memory.  As a rough guide, you might set to a value close to the
  average size of a process (program) running on your system.
  Releasing this much memory would allow such a process to run in
  memory.  Generally, it is worth tuning trim thresholds when a
  program undergoes phases where several large chunks are allocated
  and released in ways that can reuse each other's storage, perhaps
  mixed with phases where there are no such chunks at all. The trim
  value must be greater than page size to have any useful effect.  To
  disable trimming completely, you can set to MAX_SIZE_T. Note that the trick
  some people use of mallocing a huge space and then freeing it at
  program startup, in an attempt to reserve system memory, doesn't
  have the intended effect under automatic trimming, since that memory
  will immediately be returned to the system.

DEFAULT_MMAP_THRESHOLD       default: 256K
      Also settable using mallopt(M_MMAP_THRESHOLD, x)
  The request size threshold for using MMAP to directly service a
  request. Requests of at least this size that cannot be allocated
  using already-existing space will be serviced via mmap.  (If enough
  normal freed space already exists it is used instead.)  Using mmap
  segregates relatively large chunks of memory so that they can be
  individually obtained and released from the host system. A request
  serviced through mmap is never reused by any other request (at least
  not directly; the system may just so happen to remap successive
  requests to the same locations).  Segregating space in this way has
  the benefits that: Mmapped space can always be individually released
  back to the system, which helps keep the system level memory demands
  of a long-lived program low.  Also, mapped memory doesn't become
  `locked' between other chunks, as can happen with normally allocated
  chunks, which means that even trimming via malloc_trim would not
  release them.  However, it has the disadvantage that the space
  cannot be reclaimed, consolidated, and then used to service later
  requests, as happens with normal chunks.  The advantages of mmap
  nearly always outweigh disadvantages for "large" chunks, but the
  value of "large" may vary across systems.  The default is an
  empirically derived value that works well in most systems. You can
  disable mmap by setting to MAX_SIZE_T.

MAX_RELEASE_CHECK_RATE   default: 4095 unless not HAVE_MMAP
  The number of consolidated frees between checks to release
  unused segments when freeing. When using non-contiguous segments,
  especially with multiple mspaces, checking only for topmost space
  doesn't always suffice to trigger trimming. To compensate for this,
  free() will, with a period of MAX_RELEASE_CHECK_RATE (or the
  current number of segments, if greater) try to release unused
  segments to the OS when freeing chunks that result in
  consolidation. The best value for this parameter is a compromise
  between slowing down frees with relatively costly checks that
  rarely trigger versus holding on to unused memory. To effectively
  disable, set to MAX_SIZE_T. This may lead to a very slight speed
  improvement at the expense of carrying around more memory.
*/
/* Version identifier to allow people to support multiple versions */
/* DLMALLOC_VERSION */
/* _WIN32 */
/* _WIN32_WCE */
/* WIN32 */
/* MALLOC_FAILURE_ACTION */
/* WINCE reportedly does not clear */
/* _WIN32_WCE */
/* WIN32 */
/* Mac OSX docs advise not to use sbrk; it seems better to use mmap */
/* OSX allocators provide 16 byte alignment */
/* HAVE_MORECORE */
/* DARWIN */
/* For size_t */
/* For size_t */
/* LACKS_SYS_TYPES_H */
/* The maximum possible size_t value has all bits set */
/* define to a value */
/* ONLY_MSPACES */
/* ONLY_MSPACES */
/* ONLY_MSPACES */
/* MSPACES */
/* MALLOC_ALIGNMENT */
/* FOOTERS */
/* ABORT */
/* ABORT_ON_ASSERT_FAILURE */
/* PROCEED_ON_ERROR */
/* USE_LOCKS */
/* USE_LOCKS && ... */
/* USE_SPIN_LOCKS */
/* INSECURE */
/* HAVE_MMAP */
/* MMAP_CLEARS */
/* linux */
/* linux */
/* HAVE_MREMAP */
/* MALLOC_FAILURE_ACTION */
/* ONLY_MSPACES */
/* ONLY_MSPACES */
/* HAVE_MORECORE */
/* !HAVE_MORECORE */
/* MORECORE_CONTIGUOUS */
/* HAVE_MORECORE */
/* 0 means to compute in init_mparams */
/* MORECORE_CONTIGUOUS */
/* MORECORE_CONTIGUOUS */
/* DEFAULT_GRANULARITY */
/* MORECORE_CANNOT_TRIM */
/* MORECORE_CANNOT_TRIM */
/* DEFAULT_TRIM_THRESHOLD */
/* HAVE_MMAP */
/* HAVE_MMAP */
/* DEFAULT_MMAP_THRESHOLD */
/* HAVE_MMAP */
/* MAX_RELEASE_CHECK_RATE */
/* USE_BUILTIN_FFS */
/* USE_DEV_RANDOM */
/* NO_MALLINFO */
/* MALLINFO_FIELD_TYPE */
/* NO_SEGMENT_TRAVERSAL */
/*
  mallopt tuning options.  SVID/XPG defines four standard parameter
  numbers for mallopt, normally defined in malloc.h.  None of these
  are used in this malloc, so setting them has no effect. But this
  malloc does support the following options.
*/
/* ------------------------ Mallinfo declarations ------------------------ */
/*
  This version of malloc supports the standard SVID/XPG mallinfo
  routine that returns a struct containing usage properties and
  statistics. It should work on any system that has a
  /usr/include/malloc.h defining struct mallinfo.  The main
  declaration needed is the mallinfo struct that is returned (by-copy)
  by mallinfo().  The malloinfo struct contains a bunch of fields that
  are not even meaningful in this version of malloc.  These fields are
  are instead filled by mallinfo() with other numbers that might be of
  interest.

  HAVE_USR_INCLUDE_MALLOC_H should be set if you have a
  /usr/include/malloc.h file that includes a declaration of struct
  mallinfo.  If so, it is included; else a compliant version is
  declared below.  These must be precisely the same for mallinfo() to
  work.  The original SVID version of this struct, defined on most
  systems with mallinfo, declares all fields as ints. But some others
  define as unsigned long. If your system defines the fields using a
  type of different width than listed here, you MUST #include your
  system version and #define HAVE_USR_INCLUDE_MALLOC_H.
*/
/* #define HAVE_USR_INCLUDE_MALLOC_H */
/* HAVE_USR_INCLUDE_MALLOC_H */
/*  Check all the chunks in a treebin.  */
/*  Check all the chunks in a smallbin.  */
/* each chunk claims to be free */
/* chunk belongs in bin */
/* chunk is followed by an inuse chunk */
/* Find x in a bin. Used in other check functions. */
/* Traverse each chunk and check it; return total */
/* Not 2 consecutive free */
/* Check all properties of malloc_state. */
/* check bins */
/* check dv chunk */
/* check top chunk */
/*assert(m->topsize == chunksize(m->top)); redundant */
/* DEBUG */
/* ----------------------------- statistics ------------------------------ */
public class mallinfo {
	private Object arena;
	private Object ordblks;
	private Object smblks;
	private Object hblks;
	private Object hblkhd;
	private Object usmblks;
	private Object fsmblks;
	private Object uordblks;
	private Object fordblks;
	private Object keepcost;
	
	public mallinfo(Object arena, Object ordblks, Object smblks, Object hblks, Object hblkhd, Object usmblks, Object fsmblks, Object uordblks, Object fordblks, Object keepcost) {
		setArena(arena);
		setOrdblks(ordblks);
		setSmblks(smblks);
		setHblks(hblks);
		setHblkhd(hblkhd);
		setUsmblks(usmblks);
		setFsmblks(fsmblks);
		setUordblks(uordblks);
		setFordblks(fordblks);
		setKeepcost(keepcost);
	}
	public mallinfo() {
	}
	
	public mallinfo nedmallinfo() {
		mallinfo mallinfo = new mallinfo();
		return mallinfo.nedpmallinfo(0);
	}
	public mallinfo nedpmallinfo(nedpool_t p) {
		int n;
		mallinfo ret = new mallinfo(0);
		if (!p) {
			p = ModernizedCProgram.syspool;
			if (!ModernizedCProgram.syspool.getThreads()) {
				ModernizedCProgram.syspool.InitPool(0, -1);
			} 
		} 
		Object generatedM = p.getM();
		Object generatedArena = ret.getArena();
		Object generatedOrdblks = ret.getOrdblks();
		Object generatedHblkhd = ret.getHblkhd();
		Object generatedUsmblks = ret.getUsmblks();
		Object generatedUordblks = ret.getUordblks();
		Object generatedFordblks = ret.getFordblks();
		Object generatedKeepcost = ret.getKeepcost();
		for (n = 0; generatedM[n]; n++) {
			mallinfo t = /*Error: Function owner not recognized*/mspace_mallinfo(generatedM[n]);
			generatedArena += generatedArena;
			generatedOrdblks += generatedOrdblks;
			generatedHblkhd += generatedHblkhd;
			generatedUsmblks += generatedUsmblks;
			generatedUordblks += generatedUordblks;
			generatedFordblks += generatedFordblks;
			generatedKeepcost += generatedKeepcost;
		}
		return ret;
	}
	public mallinfo internal_mallinfo(Object m) {
		mallinfo nm = new mallinfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		((Object)(ModernizedCProgram.mparams.getMagic() != 0 || ModernizedCProgram.init_mparams()));
		if (!(false)) {
			;
			if (((m).getTop() != 0)) {
				size_t nfree = ((size_t)/* top always free */1);
				size_t mfree = m.getTopsize() + (((((size_t)(((Object)((byte)(false) + ((/*Error: Unsupported expression*/) << 1)))) & (((size_t)-1024) - ((size_t)1))) == 0) ? 0 : ((((size_t)-1024) - ((size_t)(((Object)((byte)(false) + ((/*Error: Unsupported expression*/) << 1)))) & (((size_t)-1024) - ((size_t)1)))) & (((size_t)-1024) - ((size_t)1)))) + (((/*Error: Unsupported expression*/) + ((/*Error: Unsupported expression*/)) + (((size_t)-1024) - ((size_t)1))) & ~(((size_t)-1024) - ((size_t)1))) + (((/*Error: Unsupported expression*/) + (((size_t)-1024) - ((size_t)1))) & ~(((size_t)-1024) - ((size_t)1))));
				size_t sum = mfree;
				msegmentptr s = m.getSeg();
				while (s != 0) {
					mchunkptr q = (mchunkptr)((s.getBase()) + ((((size_t)(((Object)((byte)(s.getBase()) + ((/*Error: Unsupported expression*/) << 1)))) & (((size_t)-1024) - ((size_t)1))) == 0) ? 0 : ((((size_t)-1024) - ((size_t)(((Object)((byte)(s.getBase()) + ((/*Error: Unsupported expression*/) << 1)))) & (((size_t)-1024) - ((size_t)1)))) & (((size_t)-1024) - ((size_t)1)))));
					while (((byte)(q) >= s.getBase() && (byte)(q) < s.getBase() + s.getSize()) && q != m.getTop() && q.getHead() != (((((size_t)1)) | (((size_t)2))) | (/*Error: Unsupported expression*/))) {
						size_t sz = ((q).getHead() & ~(((((size_t)1)) | (((size_t)2)) | (((size_t)4)))));
						sum += sz;
						if (!((q).getHead() & (((size_t)2)))) {
							mfree += sz;
							++nfree;
						} 
						q = ((mchunkptr)(((byte)(q)) + ((q).getHead() & ~((((size_t)1)) | (((size_t)2)) | (((size_t)4))))));
					}
					s = s.getNext();
				}
				nm.setArena(sum);
				nm.setOrdblks(nfree);
				nm.setHblkhd(m.getFootprint() - sum);
				nm.setUsmblks(m.getMax_footprint());
				nm.setUordblks(m.getFootprint() - mfree);
				nm.setFordblks(mfree);
				nm.setKeepcost(m.getTopsize());
			} 
			;
		} 
		return nm/* !NO_MALLINFO */;
	}
	public mallinfo mallinfo() {
		mallinfo mallinfo = new mallinfo();
		return mallinfo.internal_mallinfo((ModernizedCProgram._gm_/* NO_MALLINFO */));
	}
	public Object getArena() {
		return arena;
	}
	public void setArena(Object newArena) {
		arena = newArena;
	}
	public Object getOrdblks() {
		return ordblks;
	}
	public void setOrdblks(Object newOrdblks) {
		ordblks = newOrdblks;
	}
	public Object getSmblks() {
		return smblks;
	}
	public void setSmblks(Object newSmblks) {
		smblks = newSmblks;
	}
	public Object getHblks() {
		return hblks;
	}
	public void setHblks(Object newHblks) {
		hblks = newHblks;
	}
	public Object getHblkhd() {
		return hblkhd;
	}
	public void setHblkhd(Object newHblkhd) {
		hblkhd = newHblkhd;
	}
	public Object getUsmblks() {
		return usmblks;
	}
	public void setUsmblks(Object newUsmblks) {
		usmblks = newUsmblks;
	}
	public Object getFsmblks() {
		return fsmblks;
	}
	public void setFsmblks(Object newFsmblks) {
		fsmblks = newFsmblks;
	}
	public Object getUordblks() {
		return uordblks;
	}
	public void setUordblks(Object newUordblks) {
		uordblks = newUordblks;
	}
	public Object getFordblks() {
		return fordblks;
	}
	public void setFordblks(Object newFordblks) {
		fordblks = newFordblks;
	}
	public Object getKeepcost() {
		return keepcost;
	}
	public void setKeepcost(Object newKeepcost) {
		keepcost = newKeepcost;
	}
}
/* NO_MALLINFO */
/*
  independent_calloc(size_t n_elements, size_t element_size, void* chunks[]);

  independent_calloc is similar to calloc, but instead of returning a
  single cleared space, it returns an array of pointers to n_elements
  independent elements that can hold contents of size elem_size, each
  of which starts out cleared, and can be independently freed,
  realloc'ed etc. The elements are guaranteed to be adjacently
  allocated (this is not guaranteed to occur with multiple callocs or
  mallocs), which may also improve cache locality in some
  applications.

  The "chunks" argument is optional (i.e., may be null, which is
  probably the most typical usage). If it is null, the returned array
  is itself dynamically allocated and should also be freed when it is
  no longer needed. Otherwise, the chunks array must be of at least
  n_elements in length. It is filled in with the pointers to the
  chunks.

  In either case, independent_calloc returns this pointer array, or
  null if the allocation failed.  If n_elements is zero and "chunks"
  is null, it returns a chunk representing an array with zero elements
  (which should be freed if not wanted).

  Each element must be individually freed when it is no longer
  needed. If you'd like to instead be able to free all at once, you
  should instead use regular calloc and assign pointers into this
  space to represent elements.  (In this case though, you cannot
  independently free elements.)

  independent_calloc simplifies and speeds up implementations of many
  kinds of pools.  It may also be useful when constructing large data
  structures that initially have a fixed number of fixed-sized nodes,
  but the number is not known at compile time, and some of the nodes
  may later need to be freed. For example:

  struct Node { int item; struct Node* next; };

  struct Node* build_list() {
    struct Node** pool;
    int n = read_number_of_nodes_needed();
    if (n <= 0) return 0;
    pool = (struct Node**)(independent_calloc(n, sizeof(struct Node), 0);
    if (pool == 0) die();
    // organize into a linked list...
    struct Node* first = pool[0];
    for (i = 0; i < n-1; ++i)
      pool[i]->next = pool[i+1];
    free(pool);     // Can now free the array (or not, if it is needed later)
    return first;
  }
*/
