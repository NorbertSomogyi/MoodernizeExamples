package application;

public class block_hdr {
	private mf_hashitem_S bh_hashitem;
	private block_hdr bh_next;
	private block_hdr bh_prev;
	private Object bh_data;
	private int bh_page_count;
	private byte bh_flags;
	
	public block_hdr(mf_hashitem_S bh_hashitem, block_hdr bh_next, block_hdr bh_prev, Object bh_data, int bh_page_count, byte bh_flags) {
		setBh_hashitem(bh_hashitem);
		setBh_next(bh_next);
		setBh_prev(bh_prev);
		setBh_data(bh_data);
		setBh_page_count(bh_page_count);
		setBh_flags(bh_flags);
	}
	public block_hdr() {
	}
	
	public block_hdr ml_new_data(memfile mfp, int negative, int page_count) {
		bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.mf_new(mfp, negative, page_count)) == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedBh_data = hp.getBh_data();
		dp = (DATA_BL)(generatedBh_data);
		dp.setDb_id((((byte)'d' << 8) + (byte)'a'));
		int generatedMf_page_size = mfp.getMf_page_size();
		dp.setDb_txt_start(dp.setDb_txt_end(page_count * generatedMf_page_size));
		int generatedDb_txt_start = dp.getDb_txt_start();
		dp.setDb_free(generatedDb_txt_start - (/*Error: Unsupported expression*/ - (/*Error: Unsupported expression*/)));
		dp.setDb_line_count(0);
		return hp/*
		 * create a new, empty, pointer block
		 */;
	}
	public block_hdr ml_new_ptr(memfile mfp) {
		bhdr_T hp = new bhdr_T();
		PTR_BL pp = new PTR_BL();
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.mf_new(mfp, 0, 1)) == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedBh_data = hp.getBh_data();
		pp = (PTR_BL)(generatedBh_data);
		pp.setPb_id((((byte)'p' << 8) + (byte)'t'));
		pp.setPb_count(0);
		int generatedMf_page_size = mfp.getMf_page_size();
		pp.setPb_count_max((short_u)((generatedMf_page_size - /*Error: Unsupported expression*/) / /*Error: Unsupported expression*/ + 1));
		return hp/*
		 * Lookup line 'lnum' in a memline.
		 *
		 *   action: if ML_DELETE or ML_INSERT the line count is updated while searching
		 *	     if ML_FLUSH only flush a locked block
		 *	     if ML_FIND just find the line
		 *
		 * If the block was found it is locked and put in ml_locked.
		 * The stack is updated to lead to the locked block. The ip_high field in
		 * the stack is updated to reflect the last line in the block AFTER the
		 * insert or delete, also if the pointer block has not been updated yet. But
		 * if ml_locked != NULL ml_locked_lineadd must be added to ip_high.
		 *
		 * return: NULL for failure, pointer to block header otherwise
		 */;
	}
	public block_hdr ml_find_line(file_buffer buf, Object lnum, int action) {
		DATA_BL dp = new DATA_BL();
		PTR_BL pp = new PTR_BL();
		infoptr_T ip = new infoptr_T();
		bhdr_T hp = new bhdr_T();
		memfile_T mfp = new memfile_T();
		linenr_T t = new linenr_T();
		blocknr_T bnum = new blocknr_T();
		blocknr_T bnum2 = new blocknr_T();
		int dirty;
		linenr_T low = new linenr_T();
		linenr_T high = new linenr_T();
		int top;
		int page_count;
		int idx;
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		block_hdr generatedMl_locked = generatedB_ml.getMl_locked();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		int generatedMl_locked_lineadd = generatedB_ml.getMl_locked_lineadd();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (generatedMl_locked) {
			if ((action & -1024) && generatedMl_locked_low <= lnum && generatedMl_locked_high >= lnum && !mf_dont_release) {
				if (action == /* remember to update pointer blocks and stack later */-1024) {
					++(generatedMl_locked_lineadd);
					++(generatedMl_locked_high);
				}  else if (action == -1024) {
					--(generatedMl_locked_lineadd);
					--(generatedMl_locked_high);
				} 
				return (generatedMl_locked);
			} 
			ModernizedCProgram.mf_put(mfp, generatedMl_locked, generatedMl_flags & 4, generatedMl_flags & 8);
			generatedB_ml.setMl_locked(((Object)0/*
				 * If lines have been added or deleted in the locked block, need to
				 * update the line count in pointer blocks.
				 */));
			if (generatedMl_locked_lineadd != 0) {
				buf.ml_lineadd(generatedMl_locked_lineadd);
			} 
		} 
		if (action == /* nothing else to do */-1024) {
			return ((Object)0);
		} 
		bnum = /* start at the root of the tree */1;
		page_count = 1;
		low = 1;
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		high = generatedMl_line_count;
		info_pointer[] generatedMl_stack = generatedB_ml.getMl_stack();
		Object generatedIp_low = ip.getIp_low();
		Object generatedIp_high = ip.getIp_high();
		Object generatedIp_bnum = ip.getIp_bnum();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		if (action == /* first try stack entries */-1024) {
			for (top = generatedMl_stack_top - 1; top >= 0; --top) {
				ip = (generatedMl_stack[top]);
				if (generatedIp_low <= lnum && generatedIp_high >= lnum) {
					bnum = generatedIp_bnum;
					low = generatedIp_low;
					high = generatedIp_high;
					generatedB_ml.setMl_stack_top(/* truncate stack at prev entry */top);
					break;
				} 
			}
			if (top < 0) {
				generatedB_ml.setMl_stack_top(/* not found, start at the root */0);
			} 
		} else {
				generatedB_ml.setMl_stack_top(/* ML_DELETE or ML_INSERT *//* start at the root */0/*
				 * search downwards in the tree until a data block is found
				 */);
		} 
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedDb_id = dp.getDb_id();
		Object generatedPb_id = pp.getPb_id();
		Object generatedPb_count = pp.getPb_count();
		Object generatedPb_pointer = pp.getPb_pointer();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if ((hp = block_hdr.mf_get(mfp, bnum, page_count)) == ((Object)0)) {
				;
			} 
			if (action == -1024) {
				++high;
			}  else if (action == -1024) {
				--high;
			} 
			dp = (DATA_BL)(generatedBh_data);
			if (generatedDb_id == (((byte)'d' << 8) + /* data block */(byte)'a')) {
				generatedB_ml.setMl_locked(hp);
				generatedB_ml.setMl_locked_low(low);
				generatedB_ml.setMl_locked_high(high);
				generatedB_ml.setMl_locked_lineadd(0);
				generatedMl_flags &=  ~(4 | 8);
				return hp;
			} 
			pp = (PTR_BL)(/* must be pointer block */dp);
			if (generatedPb_id != (((byte)'p' << 8) + (byte)'t')) {
				ModernizedCProgram.iemsg(((byte)("E317: pointer block id wrong")));
				;
			} 
			if ((top = buf.ml_add_stack()) < /* add new entry to stack */0) {
				;
			} 
			ip = (generatedMl_stack[top]);
			ip.setIp_bnum(bnum);
			ip.setIp_low(low);
			ip.setIp_high(high);
			ip.setIp_index(-/* index not known yet */1);
			dirty = 0;
			for (idx = 0; idx < (int)generatedPb_count; ++idx) {
				t = generatedPb_pointer[idx].getPe_line_count();
				do {
				} while (0);
				if ((low += t) > lnum) {
					ip.setIp_index(idx);
					bnum = generatedPb_pointer[idx].getPe_bnum();
					page_count = generatedPb_pointer[idx].getPe_page_count();
					high = low - 1;
					low -= t/*
							 * a negative block number may have been changed
							 */;
					if (bnum < 0) {
						bnum2 = mfp.mf_trans_del(bnum);
						if (bnum != bnum2) {
							bnum = bnum2;
							generatedPb_pointer[idx].setPe_bnum(bnum);
							dirty = 1;
						} 
					} 
					break;
				} 
			}
			if (idx >= (int)generatedPb_count) {
				if (lnum > generatedMl_line_count) {
					ModernizedCProgram.siemsg(((byte)("E322: line number out of range: %ld past the end")), lnum - generatedMl_line_count);
				} else {
						ModernizedCProgram.siemsg(((byte)("E323: line count wrong in block %ld")), bnum);
				} 
				;
			} 
			if (action == -1024) {
				generatedPb_pointer[idx].getPe_line_count()--;
				dirty = 1;
			}  else if (action == -1024) {
				generatedPb_pointer[idx].getPe_line_count()++;
				dirty = 1;
			} 
			ModernizedCProgram.mf_put(mfp, hp, dirty, 0);
		}
		generatedB_ml.setMl_stack_top(0);
		return ((Object)0/*
		 * add an entry to the info pointer stack
		 *
		 * return -1 for failure, number of the new entry otherwise
		 */);
	}
	public block_hdr mf_new(memfile mfp, int negative, int page_count) {
		/* new bhdr_T */bhdr_T hp = new bhdr_T();
		/* first block in free list */bhdr_T freep = new bhdr_T();
		char_u p = new char_u();
		/*
		     * If we reached the maximum size for the used memory blocks, release one
		     * If a bhdr_T is returned, use it and adjust the page_count if necessary.
		     */
		block_hdr block_hdr = new block_hdr();
		hp = block_hdr.mf_release(mfp, page_count/*
		 * Decide on the number to use:
		 * If there is a free block, use its number.
		 * Otherwise use mf_block_min for a negative number, mf_block_max for
		 * a positive number.
		 */);
		block_hdr generatedMf_free_first = mfp.getMf_free_first();
		freep = generatedMf_free_first;
		int generatedBh_page_count = freep.getBh_page_count();
		block_hdr block_hdr = new block_hdr();
		mf_hashitem_S generatedBh_hashitem = freep.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		int generatedMf_page_size = mfp.getMf_page_size();
		block_hdr block_hdr = new block_hdr();
		Object generatedMf_blocknr_min = mfp.getMf_blocknr_min();
		Object generatedMf_neg_count = mfp.getMf_neg_count();
		Object generatedMf_blocknr_max = mfp.getMf_blocknr_max();
		if (!negative && freep != ((Object)0) && generatedBh_page_count >= page_count/*
			 * If the block in the free list has more pages, take only the number
			 * of pages needed and allocate a new bhdr_T with data
			 *
			 * If the number of pages matches and mf_release() did not return a
			 * bhdr_T, use the bhdr_T from the free list and allocate the data
			 *
			 * If the number of pages matches and mf_release() returned a bhdr_T,
			 * just use the number and free the bhdr_T from the free list
			 */) {
			if (generatedBh_page_count > page_count) {
				if (hp == ((Object)0) && (hp = block_hdr.mf_alloc_bhdr(mfp, page_count)) == ((Object)0)) {
					return ((Object)0);
				} 
				generatedBh_hashitem.setMhi_key(generatedMhi_key);
				generatedMhi_key += page_count;
				generatedBh_page_count -= page_count;
			}  else if (hp == ((Object)/* need to allocate memory for this block */0)) {
				if ((p = ModernizedCProgram.alloc(generatedMf_page_size * page_count)) == ((Object)0)) {
					return ((Object)0);
				} 
				hp = block_hdr.mf_rem_free(mfp);
				hp.setBh_data(p);
			} else {
					freep = block_hdr.mf_rem_free(/* use the number, remove entry from free list */mfp);
					generatedBh_hashitem.setMhi_key(generatedMhi_key);
					ModernizedCProgram.vim_free(freep);
			} 
		} else {
				if (hp == ((Object)0) && (hp = block_hdr.mf_alloc_bhdr(mfp, page_count)) == ((Object)/* get a new number */0)) {
					return ((Object)0);
				} 
				if (negative) {
					generatedBh_hashitem.setMhi_key(generatedMf_blocknr_min--);
					generatedMf_neg_count++;
				} else {
						generatedBh_hashitem.setMhi_key(generatedMf_blocknr_max);
						generatedMf_blocknr_max += page_count;
				} 
		} 
		hp.setBh_flags(2 | /* new block is always dirty */1);
		mfp.setMf_dirty(1);
		hp.setBh_page_count(page_count);
		ModernizedCProgram.mf_ins_used(mfp, hp);
		ModernizedCProgram.mf_ins_hash(mfp, hp/*
		     * Init the data to all zero, to avoid reading uninitialized data.
		     * This also avoids that the passwd file ends up in the swap file!
		     */);
		Object generatedBh_data = hp.getBh_data();
		(Object)/*Error: Function owner not recognized*/memset(((byte)(generatedBh_data)), (false), ((size_t)generatedMf_page_size * page_count));
		return hp/*
		 * Get existing block "nr" with "page_count" pages.
		 *
		 * Note: The caller should first check a negative nr with mf_trans_del()
		 */;
	}
	public block_hdr mf_get(memfile mfp, Object nr, int page_count) {
		bhdr_T hp = new bhdr_T();
		Object generatedMf_blocknr_max = mfp.getMf_blocknr_max();
		Object generatedMf_blocknr_min = mfp.getMf_blocknr_min();
		if (nr >= generatedMf_blocknr_max || nr <= generatedMf_blocknr_min) {
			return ((Object)0/*
			     * see if it is in the cache
			     */);
		} 
		block_hdr block_hdr = new block_hdr();
		hp = block_hdr.mf_find_hash(mfp, nr);
		Object generatedMf_infile_count = mfp.getMf_infile_count();
		block_hdr block_hdr = new block_hdr();
		block_hdr block_hdr = new block_hdr();
		mf_hashitem_S generatedBh_hashitem = hp.getBh_hashitem();
		if (hp == ((Object)/* not in the hash list */0)) {
			if (nr < 0 || nr >= generatedMf_infile_count) {
				return ((Object)0/* could check here if the block is in the free list *//*
					 * Check if we need to flush an existing block.
					 * If so, use that block.
					 * If not, allocate a new block.
					 */);
			} 
			hp = block_hdr.mf_release(mfp, page_count);
			if (hp == ((Object)0) && (hp = block_hdr.mf_alloc_bhdr(mfp, page_count)) == ((Object)0)) {
				return ((Object)0);
			} 
			generatedBh_hashitem.setMhi_key(nr);
			hp.setBh_flags(0);
			hp.setBh_page_count(page_count);
			if (ModernizedCProgram.mf_read(mfp, hp) == /* cannot read the block! */0) {
				hp.mf_free_bhdr();
				return ((Object)0);
			} 
		} else {
				ModernizedCProgram.mf_rem_used(mfp, /* remove from list, insert in front below */hp);
				ModernizedCProgram.mf_rem_hash(mfp, hp);
		} 
		byte generatedBh_flags = hp.getBh_flags();
		generatedBh_flags |=  2;
		ModernizedCProgram.mf_ins_used(mfp, /* put in front of used list */hp);
		ModernizedCProgram.mf_ins_hash(mfp, /* put in front of hash list */hp);
		return hp/*
		 * release the block *hp
		 *
		 *   dirty: Block must be written to file later
		 *   infile: Block should be in file (needed for recovery)
		 *
		 *  no return value, function cannot fail
		 */;
	}
	public block_hdr mf_find_hash(memfile mfp, Object nr) {
		mf_hashtab_S generatedMf_hash = mfp.getMf_hash();
		mf_hashitem_S mf_hashitem_S = new mf_hashitem_S();
		return (bhdr_T)mf_hashitem_S.mf_hash_find(generatedMf_hash, nr/*
		 * insert block *hp in front of used list of memfile *mfp
		 */);
	}
	public block_hdr mf_release(memfile mfp, int page_count) {
		bhdr_T hp = new bhdr_T();
		int need_release;
		buf_T buf = new buf_T();
		if (/* don't release while in mf_close_file() */mf_dont_release) {
			return ((Object)0/*
			     * Need to release a block if the number of blocks for this memfile is
			     * higher than the maximum or total memory used is over 'maxmemtot'
			     */);
		} 
		int generatedMf_used_count = mfp.getMf_used_count();
		int generatedMf_used_count_max = mfp.getMf_used_count_max();
		need_release = ((generatedMf_used_count >= generatedMf_used_count_max) || (ModernizedCProgram.total_mem_used >> 10) >= (long_u)ModernizedCProgram.p_mmt/*
		     * Try to create a swap file if the amount of memory used is getting too
		     * high.
		     */);
		int generatedMf_fd = mfp.getMf_fd();
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_next = buf.getB_next();
		int generatedB_may_swap = buf.getB_may_swap();
		if (generatedMf_fd < 0 && need_release && ModernizedCProgram.p_uc) {
			for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
				if (generatedMl_mfp == mfp) {
					break;
				} 
			}
			if (buf != ((Object)0) && generatedB_may_swap) {
				buf/*
				     * don't release a block if
				     *	there is no file for this memfile
				     * or
				     *	the number of blocks for this memfile is lower than the maximum
				     *	  and
				     *	total memory used is not up to 'maxmemtot'
				     */.ml_open_file();
			} 
		} 
		if (generatedMf_fd < 0 || !need_release) {
			return ((Object)0);
		} 
		byte generatedBh_flags = hp.getBh_flags();
		block_hdr generatedBh_prev = hp.getBh_prev();
		block_hdr generatedMf_used_last = mfp.getMf_used_last();
		for (hp = generatedMf_used_last; hp != ((Object)0); hp = generatedBh_prev) {
			if (!(generatedBh_flags & 2)) {
				break;
			} 
		}
		if (hp == ((Object)/* not a single one that can be released */0)) {
			return ((Object)0/*
			     * If the block is dirty, write it.
			     * If the write fails we don't free it.
			     */);
		} 
		if ((generatedBh_flags & 1) && ModernizedCProgram.mf_write(mfp, hp) == 0) {
			return ((Object)0);
		} 
		ModernizedCProgram.mf_rem_used(mfp, hp);
		ModernizedCProgram.mf_rem_hash(mfp, hp/*
		     * If a bhdr_T is returned, make sure that the page_count of bh_data is
		     * right
		     */);
		int generatedBh_page_count = hp.getBh_page_count();
		Object generatedBh_data = hp.getBh_data();
		int generatedMf_page_size = mfp.getMf_page_size();
		if (generatedBh_page_count != page_count) {
			ModernizedCProgram.vim_free(generatedBh_data);
			if ((hp.setBh_data(ModernizedCProgram.alloc(generatedMf_page_size * page_count))) == ((Object)0)) {
				ModernizedCProgram.vim_free(hp);
				return ((Object)0);
			} 
			hp.setBh_page_count(page_count);
		} 
		return hp/*
		 * release as many blocks as possible
		 * Used in case of out of memory
		 *
		 * return TRUE if any memory was released
		 */;
	}
	public block_hdr mf_alloc_bhdr(memfile mfp, int page_count) {
		bhdr_T hp = new bhdr_T();
		int generatedMf_page_size = mfp.getMf_page_size();
		if ((hp = (bhdr_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/)) != ((Object)0)) {
			if ((hp.setBh_data(ModernizedCProgram.alloc(generatedMf_page_size * page_count))) == ((Object)0)) {
				ModernizedCProgram.vim_free(/* not enough memory */hp);
				return ((Object)0);
			} 
			hp.setBh_page_count(page_count);
		} 
		return hp/*
		 * Free a block header and the block of memory for it
		 */;
	}
	public void mf_free_bhdr() {
		Object generatedBh_data = this.getBh_data();
		ModernizedCProgram.vim_free(generatedBh_data);
		ModernizedCProgram.vim_free(hp/*
		 * insert entry *hp in the free list
		 */);
	}
	public block_hdr mf_rem_free(memfile mfp) {
		bhdr_T hp = new bhdr_T();
		block_hdr generatedMf_free_first = mfp.getMf_free_first();
		hp = generatedMf_free_first;
		block_hdr generatedBh_next = hp.getBh_next();
		mfp.setMf_free_first(generatedBh_next);
		return hp/*
		 * read a block from disk
		 *
		 * Return FAIL for failure, OK otherwise
		 */;
	}
	public mf_hashitem_S getBh_hashitem() {
		return bh_hashitem;
	}
	public void setBh_hashitem(mf_hashitem_S newBh_hashitem) {
		bh_hashitem = newBh_hashitem;
	}
	public block_hdr getBh_next() {
		return bh_next;
	}
	public void setBh_next(block_hdr newBh_next) {
		bh_next = newBh_next;
	}
	public block_hdr getBh_prev() {
		return bh_prev;
	}
	public void setBh_prev(block_hdr newBh_prev) {
		bh_prev = newBh_prev;
	}
	public Object getBh_data() {
		return bh_data;
	}
	public void setBh_data(Object newBh_data) {
		bh_data = newBh_data;
	}
	public int getBh_page_count() {
		return bh_page_count;
	}
	public void setBh_page_count(int newBh_page_count) {
		bh_page_count = newBh_page_count;
	}
	public byte getBh_flags() {
		return bh_flags;
	}
	public void setBh_flags(byte newBh_flags) {
		bh_flags = newBh_flags;
	}
}
