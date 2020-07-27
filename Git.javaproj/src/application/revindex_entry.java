package application;

public class revindex_entry {
	private Object offset;
	private int nr;
	
	public revindex_entry(Object offset, int nr) {
		setOffset(offset);
		setNr(nr);
	}
	public revindex_entry() {
	}
	
	/*
	 * Pack index for existing packs give us easy access to the offsets into
	 * corresponding pack file where each object's data starts, but the entries
	 * do not store the size of the compressed representation (uncompressed
	 * size is easily available by examining the pack entry header).  It is
	 * also rather expensive to find the sha1 for an object given its offset.
	 *
	 * The pack index file is sorted by object name mapping to offset;
	 * this revindex array is a list of offset/index_nr pairs
	 * ordered by offset, so if you know the offset of an object, next offset
	 * is where its packed representation ends and the index_nr can be used to
	 * get the object sha1 from the main index.
	 */
	/*
	 * This is a least-significant-digit radix sort.
	 *
	 * It sorts each of the "n" items in "entries" by its offset field. The "max"
	 * parameter must be at least as large as the largest offset in the array,
	 * and lets us quit the sort early.
	 */
	public void sort_revindex(int n, Object max) {
		/*
			 * We need O(n) temporary storage. Rather than do an extra copy of the
			 * partial results into "entries", we sort back and forth between the
			 * real array and temporary storage. In each iteration of the loop, we
			 * keep track of them with alias pointers, always sorting from "from"
			 * to "to".
			 */revindex_entry tmp = new revindex_entry();
		revindex_entry from = new revindex_entry();
		revindex_entry to = new revindex_entry();
		int bits;
		int pos;
		(pos) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, ((1 << (true)))));
		(tmp) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (n)));
		from = ModernizedCProgram.entries;
		to = tmp/*
			 * If (max >> bits) is zero, then we know that the radix digit we are
			 * on (and any higher) will be zero for all entries, and our loop will
			 * be a no-op, as everybody lands in the same zero-th bucket.
			 */;
		for (bits = 0; max >> bits; bits += (true)) {
			int i;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pos, 0, (1 << (true)) * /*Error: sizeof expression not supported yet*/);
			for (i = 0; i < n; i++) {
				pos[(((from)[(i)].getOffset() >> (bits)) & ((1 << (true)) - 1))]++;
			}
			for (i = 1; i < (1 << (true)); i++) {
				pos[i] += pos[i - 1/*
						 * Now we can drop the elements into their correct buckets (in
						 * our temporary array).  We iterate the pos counter backwards
						 * to avoid using an extra index to count up. And since we are
						 * going backwards there, we must also go backwards through the
						 * array itself, to keep the sort stable.
						 *
						 * Note that we use an unsigned iterator to make sure we can
						 * handle 2^32-1 objects, even on a 32-bit system. But this
						 * means we cannot use the more obvious "i >= 0" loop condition
						 * for counting backwards, and must instead check for
						 * wrap-around with UINT_MAX.
						 */];
			}
			for (i = n - 1; i != -1024; i--) {
				to[--pos[(((from)[(i)].getOffset() >> (bits)) & ((1 << (true)) - 1))]] = from[i/*
						 * Now "to" contains the most sorted list, so we swap "from" and
						 * "to" for the next iteration.
						 */];
			}
			do {
				Object _swap_a_ptr = (from);
				Object _swap_b_ptr = (to);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0/*
				 * If we ended with our data in the original array, great. If not,
				 * we have to move it back from the temporary storage.
				 */);
		}
		if (from != ModernizedCProgram.entries) {
			ModernizedCProgram.copy_array((ModernizedCProgram.entries), (tmp), (n), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		} 
		ModernizedCProgram.free(tmp);
		ModernizedCProgram.free(pos);
	}
	/*
		 * We use a "digit" size of 16 bits. That keeps our memory
		 * usage reasonable, and we can generally (for a 4G or smaller
		 * packfile) quit after two rounds of radix-sorting.
		 */
	/*
		 * We want to know the bucket that a[i] will go into when we are using
		 * the digit that is N bits from the (least significant) end.
		 */
	public revindex_entry find_pack_revindex(packed_git p, Object ofs) {
		int pos;
		if (p.load_pack_revindex()) {
			return ((Object)0);
		} 
		pos = p.find_revindex_position(ofs);
		if (pos < 0) {
			return ((Object)0);
		} 
		revindex_entry[] generatedRevindex = p.getRevindex();
		return generatedRevindex + pos;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
}
