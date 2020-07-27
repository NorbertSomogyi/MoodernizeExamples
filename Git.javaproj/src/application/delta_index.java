package application;

public class delta_index {
	private long memsize;
	private Object src_buf;
	private long src_size;
	private int hash_mask;
	private Object hash;
	
	public delta_index(long memsize, Object src_buf, long src_size, int hash_mask, Object hash) {
		setMemsize(memsize);
		setSrc_buf(src_buf);
		setSrc_size(src_size);
		setHash_mask(hash_mask);
		setHash(hash);
	}
	public delta_index() {
	}
	
	public delta_index create_delta_index(Object buf, long bufsize) {
		int i;
		int hsize;
		int hmask;
		int entries;
		int prev_val;
		int hash_count;
		byte data;
		byte buffer = buf;
		delta_index index = new delta_index();
		unpacked_index_entry entry = new unpacked_index_entry();
		unpacked_index_entry hash = new unpacked_index_entry();
		index_entry packed_entry = new index_entry();
		index_entry packed_hash = new index_entry();
		Object mem;
		long memsize;
		if (!buf || !bufsize) {
			return ((Object)0/* Determine index hash size.  Note that indexing skips the
				   first byte to allow for optimizing the Rabin's polynomial
				   initialization in create_delta(). */);
		} 
		entries = (bufsize - 1) / 16;
		if (bufsize >= -1024/*
				 * Current delta format can't encode offsets into
				 * reference buffer with more than 32 bits.
				 */) {
			entries = -1024 / 16;
		} 
		hsize = entries / 4;
		for (i = 4; (-1024 << i) < hsize; i++) {
			;
		}
		hsize = 1 << i;
		hmask = hsize - 1;
		memsize = /*Error: sizeof expression not supported yet*/ * /* allocate lookup index */hsize + /*Error: sizeof expression not supported yet*/ * entries;
		mem = ModernizedCProgram.malloc(memsize);
		if (!mem) {
			return ((Object)0);
		} 
		hash = mem;
		mem = hash + hsize;
		entry = mem;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hash, 0, hsize * /*Error: sizeof expression not supported yet*/);
		hash_count = ModernizedCProgram.calloc(hsize, /*Error: sizeof expression not supported yet*/);
		if (!hash_count) {
			ModernizedCProgram.free(hash);
			return ((Object)0);
		} 
		prev_val = ~/* then populate the index */0;
		index_entry generatedEntry = entry.getEntry();
		for (data = buffer + entries * 16 - 16; data >= buffer; data -= 16) {
			int val = 0;
			for (i = 1; i <= 16; i++) {
				val = ((val << 8) | data[i]) ^ ModernizedCProgram.T[val >> 23];
			}
			if (val == prev_val) {
				entry[-1].getEntry().setPtr(data + /* keep the lowest of consecutive identical blocks */16);
				--entries;
			} else {
					prev_val = val;
					i = val & hmask;
					generatedEntry.setPtr(data + 16);
					generatedEntry.setVal(val);
					entry.setNext(hash[i]);
					hash[i] = entry++;
					hash_count[i/*
						 * Determine a limit on the number of entries in the same hash
						 * bucket.  This guards us against pathological data sets causing
						 * really bad hash distribution with most entries in the same hash
						 * bucket that would bring us to O(m*n) computing costs (m and n
						 * corresponding to reference and target buffer sizes).
						 *
						 * Make sure none of the hash buckets has more entries than
						 * we're willing to test.  Otherwise we cull the entry list
						 * uniformly to still preserve a good repartition across
						 * the reference buffer.
						 */]++;
			} 
		}
		unpacked_index_entry generatedNext = entry.getNext();
		for (i = 0; i < hsize; i++) {
			int acc;
			if (hash_count[i] <= 64) {
				continue;
			} 
			entries -= hash_count[i] - /* We leave exactly HASH_LIMIT entries in the bucket */64;
			entry = hash[i];
			acc = 0/*
					 * Assume that this loop is gone through exactly
					 * HASH_LIMIT times and is entered and left with
					 * acc==0.  So the first statement in the loop
					 * contributes (hash_count[i]-HASH_LIMIT)*HASH_LIMIT
					 * to the accumulator, and the inner loop consequently
					 * is run (hash_count[i]-HASH_LIMIT) times, removing
					 * one element from the list each time.  Since acc
					 * balances out to 0 at the final run, the inner loop
					 * body can't be left with entry==NULL.  So we indeed
					 * encounter entry==NULL in the outer loop only.
					 */;
			do {
				acc += hash_count[i] - 64;
				if (acc > 0) {
					unpacked_index_entry keep = entry;
					do {
						entry = generatedNext;
						acc -= 64;
					} while (acc > 0);
					ModernizedCProgram.keep.setNext(generatedNext);
				} 
				entry = generatedNext;
			} while (entry);
		}
		ModernizedCProgram.free(hash_count/*
			 * Now create the packed index in array form
			 * rather than linked lists.
			 */);
		memsize = /*Error: sizeof expression not supported yet*/ + /*Error: sizeof expression not supported yet*/ * (hsize + 1) + /*Error: sizeof expression not supported yet*/ * entries;
		mem = ModernizedCProgram.malloc(memsize);
		if (!mem) {
			ModernizedCProgram.free(hash);
			return ((Object)0);
		} 
		index = mem;
		index.setMemsize(memsize);
		index.setSrc_buf(buf);
		index.setSrc_size(bufsize);
		index.setHash_mask(hmask);
		Object generatedHash = index.getHash();
		mem = generatedHash;
		packed_hash = mem;
		mem = packed_hash + (hsize + 1);
		packed_entry = mem;
		for (i = 0; i < hsize; i/*
				 * Coalesce all entries belonging to one linked list
				 * into consecutive array entries.
				 */++) {
			packed_hash[i] = packed_entry;
			for (entry = hash[i]; entry; entry = generatedNext) {
				packed_entry++ = generatedEntry;
			}
		}
		packed_hash[hsize] = /* Sentinel value to indicate the length of the last hash bucket */packed_entry;
		((packed_entry - (index_entry)mem == entries) ? (Object)0 : /*Error: Function owner not recognized*/_assert("packed_entry - (struct index_entry *)mem == entries", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-delta.c", 292));
		ModernizedCProgram.free(hash);
		return index;
	}
	public void free_delta_index() {
		ModernizedCProgram.free(index);
	}
	public long sizeof_delta_index() {
		long generatedMemsize = this.getMemsize();
		if (index) {
			return generatedMemsize;
		} else {
				return 0/*
				 * The maximum size for any opcode sequence, including the initial header
				 * plus Rabin window plus biggest copy.
				 */;
		} 
	}
	public long getMemsize() {
		return memsize;
	}
	public void setMemsize(long newMemsize) {
		memsize = newMemsize;
	}
	public Object getSrc_buf() {
		return src_buf;
	}
	public void setSrc_buf(Object newSrc_buf) {
		src_buf = newSrc_buf;
	}
	public long getSrc_size() {
		return src_size;
	}
	public void setSrc_size(long newSrc_size) {
		src_size = newSrc_size;
	}
	public int getHash_mask() {
		return hash_mask;
	}
	public void setHash_mask(int newHash_mask) {
		hash_mask = newHash_mask;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
}
