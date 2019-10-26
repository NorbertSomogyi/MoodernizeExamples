package application;

/* control current object in current chunk */
public class obstack {
	private long chunk_size;
	private _obstack_chunk chunk;
	private Byte object_base;
	private Byte next_free;
	private Byte chunk_limit;
	private  temp;
	private int alignment_mask;
	private  chunkfun;
	private  freefun;
	private Object extra_arg;
	private int use_extra_arg;
	private int maybe_empty_object;
	private int alloc_failed;
	
	public obstack(long chunk_size, _obstack_chunk chunk, Byte object_base, Byte next_free, Byte chunk_limit,  temp, int alignment_mask,  chunkfun,  freefun, Object extra_arg, int use_extra_arg, int maybe_empty_object, int alloc_failed) {
		setChunk_size(chunk_size);
		setChunk(chunk);
		setObject_base(object_base);
		setNext_free(next_free);
		setChunk_limit(chunk_limit);
		setTemp(temp);
		setAlignment_mask(alignment_mask);
		setChunkfun(chunkfun);
		setFreefun(freefun);
		setExtra_arg(extra_arg);
		setUse_extra_arg(use_extra_arg);
		setMaybe_empty_object(maybe_empty_object);
		setAlloc_failed(alloc_failed);
	}
	public obstack() {
	}
	
	/* Initialize an obstack H for use.  Specify chunk size SIZE (0 means default).
	   Objects start on multiples of ALIGNMENT (0 means use default).
	   CHUNKFUN is the function to use to allocate chunks,
	   and FREEFUN the function to free them.
	
	   Return nonzero if successful, calls obstack_alloc_failed_handler if
	   allocation fails.  */
	public int _obstack_begin(int size, int alignment, Object chunkfun, Object freefun) {
		/* points to new chunk */_obstack_chunk chunk = new _obstack_chunk();
		if (alignment == 0) {
			alignment = .DEFAULT_ALIGNMENT;
		} 
		if (size == 0/* Default size is what GNU malloc can fit in a 4096-byte block.  *//* 12 is sizeof (mhead) and 4 is EXTRA from GNU malloc.
			 Use the values for range checking, because if range checking is off,
			 the extra bytes won't be missed terribly, but if range checking is on
			 and we used a larger request, a whole extra 4096 bytes would be
			 allocated.
		
			 These number are irrelevant to the new GNU malloc.  I suspect it is
			 less sensitive to the size of the request.  */) {
			int extra = ((((12 + .DEFAULT_ROUNDING - 1) & ~(.DEFAULT_ROUNDING - 1)) + 4 + .DEFAULT_ROUNDING - 1) & ~(.DEFAULT_ROUNDING - 1));
			size = 4096 - extra;
		} 
		 generatedChunkfun = this.getChunkfun();
		generatedChunkfun.setPlain(chunkfun);
		 generatedFreefun = this.getFreefun();
		generatedFreefun.setPlain(freefun);
		this.setChunk_size(size);
		this.setAlignment_mask(alignment - 1);
		this.setUse_extra_arg(0);
		int generatedUse_extra_arg = (h).getUse_extra_arg();
		Object generatedExtra_arg = (h).getExtra_arg();
		long generatedChunk_size = this.getChunk_size();
		chunk = this.setChunk(((generatedUse_extra_arg) ? .UNRECOGNIZEDFUNCTIONNAME(generatedExtra_arg, (generatedChunk_size)) : .UNRECOGNIZEDFUNCTIONNAME((generatedChunk_size))));
		if (!chunk) {
			.UNRECOGNIZEDFUNCTIONNAME();
		} 
		Object generatedContents = chunk.getContents();
		this.setNext_free(this.setObject_base((( <  ? ((byte)chunk) : (byte)0) + (((generatedContents) - ( <  ? ((byte)chunk) : (byte)0) + (alignment - 1)) & ~(alignment - 1)))));
		this.setChunk_limit(chunk.setLimit((byte)chunk + generatedChunk_size));
		chunk.setPrev(((Object)0));
		this.setMaybe_empty_object(/* The initial chunk now contains no empty object.  */0);
		this.setAlloc_failed(0);
		return 1;
	}
	public int _obstack_begin_1(int size, int alignment, Object chunkfun, Object freefun, Object arg) {
		/* points to new chunk */_obstack_chunk chunk = new _obstack_chunk();
		if (alignment == 0) {
			alignment = .DEFAULT_ALIGNMENT;
		} 
		if (size == 0/* Default size is what GNU malloc can fit in a 4096-byte block.  *//* 12 is sizeof (mhead) and 4 is EXTRA from GNU malloc.
			 Use the values for range checking, because if range checking is off,
			 the extra bytes won't be missed terribly, but if range checking is on
			 and we used a larger request, a whole extra 4096 bytes would be
			 allocated.
		
			 These number are irrelevant to the new GNU malloc.  I suspect it is
			 less sensitive to the size of the request.  */) {
			int extra = ((((12 + .DEFAULT_ROUNDING - 1) & ~(.DEFAULT_ROUNDING - 1)) + 4 + .DEFAULT_ROUNDING - 1) & ~(.DEFAULT_ROUNDING - 1));
			size = 4096 - extra;
		} 
		 generatedChunkfun = this.getChunkfun();
		generatedChunkfun.setExtra((_obstack_chunk)chunkfun);
		 generatedFreefun = this.getFreefun();
		generatedFreefun.setExtra((Object)freefun);
		this.setChunk_size(size);
		this.setAlignment_mask(alignment - 1);
		this.setExtra_arg(arg);
		this.setUse_extra_arg(1);
		int generatedUse_extra_arg = (h).getUse_extra_arg();
		Object generatedExtra_arg = (h).getExtra_arg();
		long generatedChunk_size = this.getChunk_size();
		chunk = this.setChunk(((generatedUse_extra_arg) ? .UNRECOGNIZEDFUNCTIONNAME(generatedExtra_arg, (generatedChunk_size)) : .UNRECOGNIZEDFUNCTIONNAME((generatedChunk_size))));
		if (!chunk) {
			.UNRECOGNIZEDFUNCTIONNAME();
		} 
		Object generatedContents = chunk.getContents();
		this.setNext_free(this.setObject_base((( <  ? ((byte)chunk) : (byte)0) + (((generatedContents) - ( <  ? ((byte)chunk) : (byte)0) + (alignment - 1)) & ~(alignment - 1)))));
		this.setChunk_limit(chunk.setLimit((byte)chunk + generatedChunk_size));
		chunk.setPrev(((Object)0));
		this.setMaybe_empty_object(/* The initial chunk now contains no empty object.  */0);
		this.setAlloc_failed(0);
		return 1/* Allocate a new current chunk for the obstack *H
		   on the assumption that LENGTH bytes need to be added
		   to the current object, or a new object of length LENGTH allocated.
		   Copies any partial object from the end of the old chunk
		   to the beginning of the new one.  */;
	}
	public void _obstack_newchunk(int length) {
		_obstack_chunk generatedChunk = this.getChunk();
		_obstack_chunk old_chunk = generatedChunk;
		_obstack_chunk new_chunk = new _obstack_chunk();
		long new_size;
		Byte generatedNext_free = this.getNext_free();
		Byte generatedObject_base = this.getObject_base();
		long obj_size = generatedNext_free - generatedObject_base;
		long i;
		long already;
		byte object_base;
		int generatedAlignment_mask = this.getAlignment_mask();
		new_size = (obj_size + length) + (obj_size >> 3) + generatedAlignment_mask + /* Compute size for new chunk.  */100;
		long generatedChunk_size = this.getChunk_size();
		if (new_size < generatedChunk_size) {
			new_size = generatedChunk_size;
		} 
		int generatedUse_extra_arg = (h).getUse_extra_arg();
		Object generatedExtra_arg = (h).getExtra_arg();
		new_chunk = ((generatedUse_extra_arg) ? .UNRECOGNIZEDFUNCTIONNAME(generatedExtra_arg, (new_size)) : .UNRECOGNIZEDFUNCTIONNAME((/* Allocate and initialize the new chunk.  */new_size)));
		if (!new_chunk) {
			.UNRECOGNIZEDFUNCTIONNAME();
		} 
		this.setChunk(new_chunk);
		new_chunk.setPrev(old_chunk);
		new_chunk.setLimit(this.setChunk_limit((byte)new_chunk + new_size));
		Object generatedContents = new_chunk.getContents();
		/* Compute an aligned object_base in the new chunk */object_base = (( <  ? ((byte)new_chunk) : (byte)0) + (((generatedContents) - ( <  ? ((byte)new_chunk) : (byte)0) + (generatedAlignment_mask)) & ~(generatedAlignment_mask)));
		if (generatedAlignment_mask + 1 >= .DEFAULT_ALIGNMENT) {
			for (i = obj_size /  - 1; i >= 0; i--) {
				((int)object_base)[i] = ((int)generatedObject_base)[i/* We used to copy the odd few remaining bytes as one extra COPYING_UNIT,
					 but that can cross a page boundary on a machine
					 which does not do strict alignment for COPYING_UNITS.  */];
			}
			already = obj_size /  * ;
		} else {
				already = 0;
		} 
		for (i = already; i < obj_size; /* Copy remaining bytes one by one.  */i++) {
			object_base[i] = generatedObject_base[i/* If the object just copied was the only data in OLD_CHUNK,
			     free that chunk and remove it from the chain.
			     But not if that chunk might contain an empty object.  */];
		}
		int generatedMaybe_empty_object = this.getMaybe_empty_object();
		_obstack_chunk generatedPrev = old_chunk.getPrev();
		if (!generatedMaybe_empty_object && (generatedObject_base == (( <  ? ((byte)old_chunk) : (byte)0) + (((generatedContents) - ( <  ? ((byte)old_chunk) : (byte)0) + (generatedAlignment_mask)) & ~(generatedAlignment_mask))))) {
			new_chunk.setPrev(generatedPrev);
			do {
				if (generatedUse_extra_arg) {
					.UNRECOGNIZEDFUNCTIONNAME(generatedExtra_arg, (old_chunk));
				} else {
						.UNRECOGNIZEDFUNCTIONNAME((old_chunk));
				} 
			} while (0);
		} 
		this.setObject_base(object_base);
		this.setNext_free(generatedObject_base + obj_size);
		this.setMaybe_empty_object(/* The new chunk certainly contains no empty object yet.  */0)/* Return nonzero if object OBJ has been allocated from obstack H.
		   This is here for debugging.
		   If you use it in a program, you are probably losing.  */;/* Return nonzero if object OBJ has been allocated from obstack H.
		   This is here for debugging.
		   If you use it in a program, you are probably losing.  */
	}
	/* Suppress -Wmissing-prototypes warning.  We don't want to declare this in
	   obstack.h because it is just for debugging.  */
	public int _obstack_allocated_p(Object obj) {
		/* below addr of any objects in this chunk */_obstack_chunk lp = new _obstack_chunk();
		/* point to previous chunk if any */_obstack_chunk plp = new _obstack_chunk();
		_obstack_chunk generatedChunk = (h).getChunk();
		lp = generatedChunk;
		Byte generatedLimit = (lp).getLimit();
		_obstack_chunk generatedPrev = lp.getPrev();
		while (lp != ((Object)0) && ((Object)lp >= obj || (Object)generatedLimit < obj)) {
			plp = generatedPrev;
			lp = plp;
		}
		return lp != ((Object)0/* Free objects in obstack H, including OBJ and everything allocate
		   more recently than OBJ.  If OBJ is zero, free everything in H.  */);
	}
	public void obstack_free(Object obj) {
		/* below addr of any objects in this chunk */_obstack_chunk lp = new _obstack_chunk();
		/* point to previous chunk if any */_obstack_chunk plp = new _obstack_chunk();
		_obstack_chunk generatedChunk = this.getChunk();
		lp = generatedChunk;
		Byte generatedLimit = (lp).getLimit();
		_obstack_chunk generatedPrev = lp.getPrev();
		int generatedUse_extra_arg = (h).getUse_extra_arg();
		Object generatedExtra_arg = (h).getExtra_arg();
		while (lp != ((Object)0) && ((Object)lp >= obj || (Object)generatedLimit < obj)) {
			plp = generatedPrev;
			do {
				if (generatedUse_extra_arg) {
					.UNRECOGNIZEDFUNCTIONNAME(generatedExtra_arg, (lp));
				} else {
						.UNRECOGNIZEDFUNCTIONNAME((lp));
				} 
			} while (0);
			lp = plp/* If we switch chunks, we can't tell whether the new current
				 chunk contains an empty object, so assume that it may.  */;
			this.setMaybe_empty_object(1);
		}
		if (lp) {
			this.setObject_base(this.setNext_free((byte)(obj)));
			this.setChunk_limit(generatedLimit);
			this.setChunk(lp);
		}  else if (obj != ((Object)0)) {
			.abort();
		} 
	}
	public int _obstack_memory_used() {
		_obstack_chunk lp = new _obstack_chunk();
		int nbytes = 0;
		Byte generatedLimit = lp.getLimit();
		_obstack_chunk generatedPrev = lp.getPrev();
		_obstack_chunk generatedChunk = this.getChunk();
		for (lp = generatedChunk; lp != ((Object)0); lp = generatedPrev) {
			nbytes += generatedLimit - (byte)lp;
		}
		return nbytes;
	}
	public long getChunk_size() {
		return chunk_size;
	}
	public void setChunk_size(long newChunk_size) {
		chunk_size = newChunk_size;
	}
	public _obstack_chunk getChunk() {
		return chunk;
	}
	public void setChunk(_obstack_chunk newChunk) {
		chunk = newChunk;
	}
	public Byte getObject_base() {
		return object_base;
	}
	public void setObject_base(Byte newObject_base) {
		object_base = newObject_base;
	}
	public Byte getNext_free() {
		return next_free;
	}
	public void setNext_free(Byte newNext_free) {
		next_free = newNext_free;
	}
	public Byte getChunk_limit() {
		return chunk_limit;
	}
	public void setChunk_limit(Byte newChunk_limit) {
		chunk_limit = newChunk_limit;
	}
	public  getTemp() {
		return temp;
	}
	public void setTemp( newTemp) {
		temp = newTemp;
	}
	public int getAlignment_mask() {
		return alignment_mask;
	}
	public void setAlignment_mask(int newAlignment_mask) {
		alignment_mask = newAlignment_mask;
	}
	public  getChunkfun() {
		return chunkfun;
	}
	public void setChunkfun( newChunkfun) {
		chunkfun = newChunkfun;
	}
	public  getFreefun() {
		return freefun;
	}
	public void setFreefun( newFreefun) {
		freefun = newFreefun;
	}
	public Object getExtra_arg() {
		return extra_arg;
	}
	public void setExtra_arg(Object newExtra_arg) {
		extra_arg = newExtra_arg;
	}
	public int getUse_extra_arg() {
		return use_extra_arg;
	}
	public void setUse_extra_arg(int newUse_extra_arg) {
		use_extra_arg = newUse_extra_arg;
	}
	public int getMaybe_empty_object() {
		return maybe_empty_object;
	}
	public void setMaybe_empty_object(int newMaybe_empty_object) {
		maybe_empty_object = newMaybe_empty_object;
	}
	public int getAlloc_failed() {
		return alloc_failed;
	}
	public void setAlloc_failed(int newAlloc_failed) {
		alloc_failed = newAlloc_failed;
	}
}
