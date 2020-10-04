package application;

/* A Pos is an index in the character window. We use short instead of int to
 * save space in the various tables. IPos is used only for parameter passing.
 */
public class internal_state {
	private Object strm;
	private int status;
	private Object[] pending_buf;
	private Object pending_buf_size;
	private Object pending_out;
	private Object pending;
	private int wrap;
	private Object gzhead;
	private Object gzindex;
	private Object method;
	private int last_flush;
	private Object w_size;
	private Object w_bits;
	private Object w_mask;
	private Object[] window;
	private Object window_size;
	private Object[] prev;
	private Object[] head;
	private Object ins_h;
	private Object hash_size;
	private Object hash_bits;
	private Object hash_mask;
	private Object hash_shift;
	private long block_start;
	private Object match_length;
	private Object prev_match;
	private int match_available;
	private Object strstart;
	private Object match_start;
	private Object lookahead;
	private Object prev_length;
	private Object max_chain_length;
	private Object max_lazy_match;
	private int level;
	private int strategy;
	private Object good_match;
	private int nice_match;
	private Object[] dyn_ltree;
	private Object[] dyn_dtree;
	private Object[] bl_tree;
	private tree_desc_s l_desc;
	private tree_desc_s d_desc;
	private tree_desc_s bl_desc;
	private Object[] bl_count;
	private Object[] heap;
	private int heap_len;
	private int heap_max;
	private Object[] depth;
	private Object[] l_buf;
	private Object lit_bufsize;
	private Object last_lit;
	private Object[] d_buf;
	private Object opt_len;
	private Object static_len;
	private Object matches;
	private Object insert;
	private Object bi_buf;
	private int bi_valid;
	private Object high_water;
	
	public internal_state(Object strm, int status, Object[] pending_buf, Object pending_buf_size, Object pending_out, Object pending, int wrap, Object gzhead, Object gzindex, Object method, int last_flush, Object w_size, Object w_bits, Object w_mask, Object[] window, Object window_size, Object[] prev, Object[] head, Object ins_h, Object hash_size, Object hash_bits, Object hash_mask, Object hash_shift, long block_start, Object match_length, Object prev_match, int match_available, Object strstart, Object match_start, Object lookahead, Object prev_length, Object max_chain_length, Object max_lazy_match, int level, int strategy, Object good_match, int nice_match, Object[] dyn_ltree, Object[] dyn_dtree, Object[] bl_tree, tree_desc_s l_desc, tree_desc_s d_desc, tree_desc_s bl_desc, Object[] bl_count, Object[] heap, int heap_len, int heap_max, Object[] depth, Object[] l_buf, Object lit_bufsize, Object last_lit, Object[] d_buf, Object opt_len, Object static_len, Object matches, Object insert, Object bi_buf, int bi_valid, Object high_water) {
		setStrm(strm);
		setStatus(status);
		setPending_buf(pending_buf);
		setPending_buf_size(pending_buf_size);
		setPending_out(pending_out);
		setPending(pending);
		setWrap(wrap);
		setGzhead(gzhead);
		setGzindex(gzindex);
		setMethod(method);
		setLast_flush(last_flush);
		setW_size(w_size);
		setW_bits(w_bits);
		setW_mask(w_mask);
		setWindow(window);
		setWindow_size(window_size);
		setPrev(prev);
		setHead(head);
		setIns_h(ins_h);
		setHash_size(hash_size);
		setHash_bits(hash_bits);
		setHash_mask(hash_mask);
		setHash_shift(hash_shift);
		setBlock_start(block_start);
		setMatch_length(match_length);
		setPrev_match(prev_match);
		setMatch_available(match_available);
		setStrstart(strstart);
		setMatch_start(match_start);
		setLookahead(lookahead);
		setPrev_length(prev_length);
		setMax_chain_length(max_chain_length);
		setMax_lazy_match(max_lazy_match);
		setLevel(level);
		setStrategy(strategy);
		setGood_match(good_match);
		setNice_match(nice_match);
		setDyn_ltree(dyn_ltree);
		setDyn_dtree(dyn_dtree);
		setBl_tree(bl_tree);
		setL_desc(l_desc);
		setD_desc(d_desc);
		setBl_desc(bl_desc);
		setBl_count(bl_count);
		setHeap(heap);
		setHeap_len(heap_len);
		setHeap_max(heap_max);
		setDepth(depth);
		setL_buf(l_buf);
		setLit_bufsize(lit_bufsize);
		setLast_lit(last_lit);
		setD_buf(d_buf);
		setOpt_len(opt_len);
		setStatic_len(static_len);
		setMatches(matches);
		setInsert(insert);
		setBi_buf(bi_buf);
		setBi_valid(bi_valid);
		setHigh_water(high_water);
	}
	public internal_state() {
	}
	
	/* ===========================================================================
	 * Initialize the hash table (avoiding 64K overflow for 16 bit systems).
	 * prev[] will be initialized on the fly.
	 */
	/* ===========================================================================
	 * Slide the hash table when sliding the window down (could be avoided with 32
	 * bit values at the expense of memory usage). We slide even when level == 0 to
	 * keep the hash table consistent if we switch back to level > 0 later.
	 */
	public void slide_hash() {
		int n;
		int m;
		Posf p = new Posf();
		Object generatedW_size = this.getW_size();
		uInt wsize = generatedW_size;
		Object generatedHash_size = this.getHash_size();
		n = generatedHash_size;
		Object[] generatedHead = this.getHead();
		p = generatedHead[n];
		do {
			m = --p;
			p = (Pos)(m >= wsize ? m - wsize : 0);
		} while (--n);
		n = wsize;
		Object[] generatedPrev = this.getPrev();
		p = generatedPrev[n];
		do {
			m = --p;
			p = (Pos)(m >= wsize ? m - wsize : 0/* If n is not on any hash chain, prev[n] is garbage but
			         * its value will never be used.
			         */);
		} while (--n);
	}
	public void putShortMSB(Object b) {
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		{ 
			generatedPending_buf[generatedPending++] = (Bytef)((Byte)(b >> 8));
		}
		;
		{ 
			generatedPending_buf[generatedPending++] = (Bytef)((Byte)(b & -1024/* =========================================================================
			 * Flush as much pending output as possible. All deflate() output, except for
			 * some deflate_stored() output, goes through this function so some
			 * applications may wish to modify it to avoid allocating a large
			 * strm->next_out buffer and copying into it. (See also read_buf()).
			 */));
		}
		;
	}
	public void lm_init() {
		Object generatedW_size = this.getW_size();
		this.setWindow_size((ulg)-1024 * generatedW_size);
		Object[] generatedHead = this.getHead();
		Object generatedHash_size = this.getHash_size();
		generatedHead[generatedHash_size - 1] = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((Bytef)generatedHead, 0, (int)(generatedHash_size - 1) * /*Error: sizeof expression not supported yet*/);
		;
		int generatedLevel = this.getLevel();
		this.setMax_lazy_match(ModernizedCProgram.configuration_table[generatedLevel].getMax_lazy());
		this.setGood_match(ModernizedCProgram.configuration_table[generatedLevel].getGood_length());
		this.setNice_match(ModernizedCProgram.configuration_table[generatedLevel].getNice_length());
		this.setMax_chain_length(ModernizedCProgram.configuration_table[generatedLevel].getMax_chain());
		this.setStrstart(0);
		this.setBlock_start(-1024);
		this.setLookahead(0);
		this.setInsert(0);
		this.setMatch_length(this.setPrev_length(3 - 1));
		this.setMatch_available(0);
		this.setIns_h(0/* initialize the asm code */)/* ===========================================================================
		 * Set match_start to the longest match starting at the given string and
		 * return its length. Matches shorter or equal to prev_length are discarded,
		 * in which case the result is equal to prev_length and match_start is
		 * garbage.
		 * IN assertions: cur_match is the head of the hash chain for the current
		 *   string (strstart) and its distance is <= MAX_DIST, and prev_length >= 1
		 * OUT assertion: the match length is not greater than s->lookahead.
		 *//* ===========================================================================
		 * Set match_start to the longest match starting at the given string and
		 * return its length. Matches shorter or equal to prev_length are discarded,
		 * in which case the result is equal to prev_length and match_start is
		 * garbage.
		 * IN assertions: cur_match is the head of the hash chain for the current
		 *   string (strstart) and its distance is <= MAX_DIST, and prev_length >= 1
		 * OUT assertion: the match length is not greater than s->lookahead.
		 */;/* ===========================================================================
		 * Set match_start to the longest match starting at the given string and
		 * return its length. Matches shorter or equal to prev_length are discarded,
		 * in which case the result is equal to prev_length and match_start is
		 * garbage.
		 * IN assertions: cur_match is the head of the hash chain for the current
		 *   string (strstart) and its distance is <= MAX_DIST, and prev_length >= 1
		 * OUT assertion: the match length is not greater than s->lookahead.
		 *//* ===========================================================================
		 * Set match_start to the longest match starting at the given string and
		 * return its length. Matches shorter or equal to prev_length are discarded,
		 * in which case the result is equal to prev_length and match_start is
		 * garbage.
		 * IN assertions: cur_match is the head of the hash chain for the current
		 *   string (strstart) and its distance is <= MAX_DIST, and prev_length >= 1
		 * OUT assertion: the match length is not greater than s->lookahead.
		 */
	}
	/* For 80x86 and 680x0, an optimized version will be provided in match.asm or
	 * match.S. The code will be functionally equivalent.
	 */
	/* For 80x86 and 680x0, an optimized version will be provided in match.asm or
	 * match.S. The code will be functionally equivalent.
	 */
	public Object longest_match(Object cur_match) {
		Object generatedMax_chain_length = this.getMax_chain_length();
		int chain_length = generatedMax_chain_length;
		Object[] generatedWindow = this.getWindow();
		Object generatedStrstart = this.getStrstart();
		Bytef[] scan = generatedWindow + generatedStrstart;
		/* matched string */Bytef[] match = new Bytef();
		/* length of current match */int len;
		Object generatedPrev_length = this.getPrev_length();
		int best_len = (int)generatedPrev_length;
		int generatedNice_match = this.getNice_match();
		int nice_match = generatedNice_match;
		Object generatedW_size = (s).getW_size();
		IPos limit = generatedStrstart > (IPos)(generatedW_size - (258 + 3 + 1)) ? generatedStrstart - (IPos)(generatedW_size - (258 + 3 + 1)) : 0/* Stop when cur_match becomes <= limit. To simplify the code,
		     * we prevent matches with the string of window index 0.
		     */;
		Object[] generatedPrev = this.getPrev();
		Posf[] prev = generatedPrev;
		Object generatedW_mask = this.getW_mask();
		uInt wmask = generatedW_mask;
		Bytef strend = generatedWindow + generatedStrstart + 258;
		Byte scan_end1 = scan[best_len - 1];
		Byte scan_end = scan[best_len/* The code is optimized for HASH_BITS >= 8 and MAX_MATCH-2 multiple of 16.
		     * It is easy to get rid of this optimization if necessary.
		     */];
		;
		Object generatedGood_match = this.getGood_match();
		if (generatedPrev_length >= generatedGood_match) {
			chain_length >>=  2/* Do not look for matches beyond the end of the input. This is necessary
			     * to make deflate deterministic.
			     */;
		} 
		Object generatedLookahead = this.getLookahead();
		if ((uInt)nice_match > generatedLookahead) {
			nice_match = (int)generatedLookahead;
		} 
		;
		do {
			;
			match = generatedWindow + cur_match/* Skip to next match if the match length cannot increase
			         * or if the match length is less than 2.  Note that the checks below
			         * for insufficient lookahead only occur occasionally for performance
			         * reasons.  Therefore uninitialized memory will be accessed, and
			         * conditional jumps will be made that depend on those values.
			         * However the length of the match is limited to the lookahead, so
			         * the output of deflate is not affected by the uninitialized values.
			         */;
			if (match[best_len] != /* UNALIGNED_OK */scan_end || match[best_len - 1] != scan_end1 || match != scan || ++match != scan[1/* The check at best_len-1 can be removed because it will be made
			         * again later. (This heuristic is not always a win.)
			         * It is not necessary to compare scan[2] and match[2] since they
			         * are always equal when the other bytes match, given that
			         * the hash keys are equal and that HASH_BITS >= 8.
			         */]) {
				continue;
			} 
			;
			;
			do {
			} while (++scan == ++match && ++scan == ++match && ++scan == ++match && ++scan == ++match && ++scan == ++match && ++scan == ++match && ++scan == ++match && ++scan == ++match && scan < strend);
			;
			len = 258 - (int)(strend - scan);
			scan = strend - 258;
			if (len > /* UNALIGNED_OK */best_len) {
				this.setMatch_start(cur_match);
				best_len = len;
				if (len >= nice_match) {
					break;
				} 
				scan_end1 = scan[best_len - 1];
				scan_end = scan[best_len];
			} 
		} while ((cur_match = prev[cur_match & wmask]) > limit && --chain_length != 0);
		if ((uInt)best_len <= generatedLookahead) {
			return (uInt)best_len;
		} 
		return generatedLookahead;/* ---------------------------------------------------------------------------
		 * Optimized version for FASTEST only
		 */
	}
	/* ===========================================================================
	 * Local data
	 */
	/* current match */
	/* current string */
	/* matched string */
	/* length of current match */
	/* The code is optimized for HASH_BITS >= 8 and MAX_MATCH-2 multiple of 16.
	     * It is easy to get rid of this optimization if necessary.
	     */
	/* Return failure if the match length is less than 2:
	     */
	/* The check at best_len-1 can be removed because it will be made
	     * again later. (This heuristic is not always a win.)
	     * It is not necessary to compare scan[2] and match[2] since they
	     * are always equal when the other bytes match, given that
	     * the hash keys are equal and that HASH_BITS >= 8.
	     */
	/* We check for insufficient lookahead only every 8th comparison;
	     * the 256th check will be made at strstart+258.
	     */
	/* FASTEST */
	/* result of memcmp for equal strings */
	/* ===========================================================================
	 * Check that the match at match_start is indeed a match.
	 */
	/* check that the match is indeed a match */
	/* ZLIB_DEBUG */
	/* ===========================================================================
	 * Fill the window when the lookahead becomes insufficient.
	 * Updates strstart and lookahead.
	 *
	 * IN assertion: lookahead < MIN_LOOKAHEAD
	 * OUT assertions: strstart <= window_size-MIN_LOOKAHEAD
	 *    At least one byte has been read, or avail_in == 0; reads are
	 *    performed for at least two bytes (required for the zip translate_eol
	 *    option -- not supported here).
	 */
	public void fill_window() {
		int n;
		/* Amount of free space at the end of the window. */int more;
		Object generatedW_size = this.getW_size();
		uInt wsize = generatedW_size;
		;
		Object generatedLookahead = this.getLookahead();
		Object generatedStrm = this.getStrm();
		Object generatedWindow_size = this.getWindow_size();
		Object generatedStrstart = this.getStrstart();
		Object[] generatedWindow = this.getWindow();
		Object generatedMatch_start = this.getMatch_start();
		long generatedBlock_start = this.getBlock_start();
		Object generatedInsert = this.getInsert();
		Object generatedIns_h = this.getIns_h();
		Object generatedHash_shift = this.getHash_shift();
		Object generatedHash_mask = this.getHash_mask();
		Object[] generatedPrev = this.getPrev();
		Object generatedW_mask = this.getW_mask();
		Object[] generatedHead = this.getHead();
		do {
			more = (int)(generatedWindow_size - (ulg)generatedLookahead - (ulg)generatedStrstart);
			if (/*Error: Unsupported expression*/ <= /* Deal with !@#$% 64K limit: */2) {
				if (more == 0 && generatedStrstart == 0 && generatedLookahead == 0) {
					more = wsize;
				}  else if (more == (int)(true/* Very unlikely, but possible on 16 bit machine if
				                 * strstart == 0 && lookahead == 1 (input done a byte at time)
				                 */)) {
					more--;
				} 
			} 
			if (generatedStrstart >= wsize + (generatedW_size - (258 + 3 + /* If the window is almost full and there is insufficient lookahead,
			         * move the upper half to the lower one to make room in the upper half.
			         */1))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow, generatedWindow + wsize, (int)wsize - more);
				generatedMatch_start -= wsize;
				generatedStrstart -= /* we now have strstart >= MAX_DIST */wsize;
				generatedBlock_start -= (long)wsize;
				s.slide_hash();
				more += wsize;
			} 
			if (generatedStrm.getAvail_in() == 0/* If there was no sliding:
			         *    strstart <= WSIZE+MAX_DIST-1 && lookahead <= MIN_LOOKAHEAD - 1 &&
			         *    more == window_size - lookahead - strstart
			         * => more >= window_size - (MIN_LOOKAHEAD-1 + WSIZE + MAX_DIST-1)
			         * => more >= window_size - 2*WSIZE + 2
			         * In the BIG_MEM or MMAP case (not yet supported),
			         *   window_size == input_size + MIN_LOOKAHEAD  &&
			         *   strstart + s->lookahead <= input_size => more >= MIN_LOOKAHEAD.
			         * Otherwise, window_size == 2*WSIZE so more >= 2.
			         * If there was sliding, more >= WSIZE. So in all cases, more >= 2.
			         */) {
				break;
			} 
			;
			n = ModernizedCProgram.read_buf(generatedStrm, generatedWindow + generatedStrstart + generatedLookahead, more);
			generatedLookahead += n;
			if (generatedLookahead + generatedInsert >= /* Initialize the hash value now that we have some input: */3) {
				uInt str = generatedStrstart - generatedInsert;
				this.setIns_h(generatedWindow[str]);
				(this.setIns_h((((generatedIns_h) << generatedHash_shift) ^ (generatedWindow[str + 1])) & generatedHash_mask));
				while (generatedInsert) {
					(this.setIns_h((((generatedIns_h) << generatedHash_shift) ^ (generatedWindow[str + 3 - 1])) & generatedHash_mask));
					generatedPrev[str & generatedW_mask] = generatedHead[generatedIns_h];
					generatedHead[generatedIns_h] = (Pos)str;
					str++;
					generatedInsert--;
					if (generatedLookahead + generatedInsert < 3) {
						break;
					} 
				}
			} 
		} while (generatedLookahead < (258 + 3 + 1) && generatedStrm.getAvail_in() != 0/* If the WIN_INIT bytes after the end of the current data have never been
		     * written, then zero those bytes in order to avoid memory check reports of
		     * the use of uninitialized (or uninitialised as Julian writes) bytes by
		     * the longest match routines.  Update the high water mark for the next
		     * time through here.  WIN_INIT is set to MAX_MATCH since the longest match
		     * routines allow scanning to strstart + MAX_MATCH, ignoring lookahead.
		     */);
		Object generatedHigh_water = this.getHigh_water();
		if (generatedHigh_water < generatedWindow_size) {
			ulg curr = generatedStrstart + (ulg)(generatedLookahead);
			ulg init = new ulg();
			if (generatedHigh_water < curr/* Previous high water mark below current data -- zero WIN_INIT
			             * bytes or up to end of window, whichever is less.
			             */) {
				init = generatedWindow_size - curr;
				if (init > 258) {
					init = 258;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedWindow + curr, 0, (int)init);
				this.setHigh_water(curr + init);
			}  else if (generatedHigh_water < (ulg)curr + 258/* High water mark at or above current data, but below current data
			             * plus WIN_INIT -- zero out to current data plus WIN_INIT, or up
			             * to end of window, whichever is less.
			             */) {
				init = (ulg)curr + 258 - generatedHigh_water;
				if (init > generatedWindow_size - generatedHigh_water) {
					init = generatedWindow_size - generatedHigh_water;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedWindow + generatedHigh_water, 0, (int)init);
				generatedHigh_water += init;
			} 
		} 
		;/* ===========================================================================
		 * Flush the current block, with given end-of-file flag.
		 * IN assertion: strstart is set to the end of the current match.
		 */
	}
	/* Same but force premature exit if necessary. */
	/* Maximum stored block length in deflate format (not including header). */
	/* Minimum of a and b. */
	/* ===========================================================================
	 * Copy without compression as much as possible from the input stream, return
	 * the current block state.
	 *
	 * In case deflateParams() is used to later switch to a non-zero compression
	 * level, s->matches (otherwise unused when storing) keeps track of the number
	 * of hash table slides to perform. If s->matches is 1, then one hash table
	 * slide will be done when switching. If s->matches is 2, the maximum value
	 * allowed here, then the hash table will be cleared, since two or more slides
	 * is the same as a clear.
	 *
	 * deflate_stored() is written to minimize the number of times an input byte is
	 * copied. It is most efficient with large input and output buffers, which
	 * maximizes the opportunites to have a single copy from next_in to next_out.
	 */
	public  deflate_stored(int flush) {
		Object generatedPending_buf_size = this.getPending_buf_size();
		Object generatedW_size = this.getW_size();
		int min_block = ((generatedPending_buf_size - 5) > (generatedW_size) ? (generatedW_size) : (generatedPending_buf_size - /* Smallest worthy block size when not flushing or finishing. By default
		     * this is 32K. This can be as small as 507 bytes for memLevel == 1. For
		     * large input and output buffers, the stored block size will be larger.
		     */5/* Copy as many min_block or larger stored blocks directly to next_out as
		     * possible. If flushing, copy the remaining available input to next_out as
		     * stored blocks, if there is enough space.
		     */));
		int len;
		int left;
		int have;
		int last = 0;
		Object generatedStrm = this.getStrm();
		int used = generatedStrm.getAvail_in();
		int generatedBi_valid = this.getBi_valid();
		Object generatedStrstart = this.getStrstart();
		long generatedBlock_start = this.getBlock_start();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		Object[] generatedWindow = this.getWindow();
		do {
			len = /* maximum deflate stored block length */65535;
			have = (generatedBi_valid + 42) >> /* number of header bytes */3;
			if (generatedStrm.getAvail_out() < /* need room for header */have) {
				break;
			} 
			have = generatedStrm.getAvail_out() - /* maximum stored block length that will fit in avail_out: */have;
			left = generatedStrstart - generatedBlock_start;
			if (len > (ulg)left + generatedStrm.getAvail_in()) {
				len = left + generatedStrm.getAvail_in();
			} 
			if (len > have) {
				len = /* limit len to the output */have/* If the stored block would be less than min_block in length, or if
				         * unable to copy all of the available input when flushing, then try
				         * copying to the window and the pending buffer instead. Also don't
				         * write an empty block when flushing -- deflate() does that.
				         */;
			} 
			if (len < min_block && ((len == 0 && flush != 4) || flush == 0 || len != left + generatedStrm.getAvail_in())) {
				break;
			} 
			last = flush == 4 && len == left + generatedStrm.getAvail_in() ? 1 : 0;
			s._tr_stored_block((byte)0, -1024, last);
			generatedPending_buf[generatedPending - 4] = /* Replace the lengths in the dummy stored block with len. */len;
			generatedPending_buf[generatedPending - 3] = len >> 8;
			generatedPending_buf[generatedPending - 2] = ~len;
			generatedPending_buf[generatedPending - 1] = ~len >> 8;
			ModernizedCProgram.flush_pending(generatedStrm);
			if (/* Copy uncompressed bytes from the window to next_out. */left) {
				if (left > len) {
					left = len;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedStrm.getNext_out(), generatedWindow + generatedBlock_start, left);
				generatedStrm.getNext_out() += left;
				generatedStrm.getAvail_out() -= left;
				generatedStrm.getTotal_out() += left;
				generatedBlock_start += left;
				len -= left;
			} 
			if (/* Copy uncompressed bytes directly from next_in to next_out, updating
			         * the check value.
			         */len) {
				ModernizedCProgram.read_buf(generatedStrm, generatedStrm.getNext_out(), len);
				generatedStrm.getNext_out() += len;
				generatedStrm.getAvail_out() -= len;
				generatedStrm.getTotal_out() += len;
			} 
		} while (last == 0/* Update the sliding window with the last s->w_size bytes of the copied
		     * data, or append all of the copied data to the existing window if less
		     * than s->w_size bytes were copied. Also update the number of bytes to
		     * insert in the hash tables, in the event that deflateParams() switches to
		     * a non-zero compression level.
		     */);/* Set len to the maximum size block that we can copy directly with the
		         * available input data and output space. Set left to how much of that
		         * would be copied from what's left in the window.
		         */
		used -= generatedStrm.getAvail_in();
		Object generatedWindow_size = this.getWindow_size();
		Object generatedMatches = this.getMatches();
		Object generatedInsert = this.getInsert();
		if (used/* If any input was used, then no unused input remains in the window,
		         * therefore s->block_start == s->strstart.
		         */) {
			if (used >= generatedW_size) {
				this.setMatches(/* clear hash */2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow, generatedStrm.getNext_in() - generatedW_size, generatedW_size);
				this.setStrstart(generatedW_size);
			} else {
					if (generatedWindow_size - generatedStrstart <= used) {
						generatedStrstart -= generatedW_size;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow, generatedWindow + generatedW_size, generatedStrstart);
						if (generatedMatches < 2) {
							generatedMatches++;
						} 
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow + generatedStrstart, generatedStrm.getNext_in() - used, used);
					generatedStrstart += used;
			} 
			this.setBlock_start(generatedStrstart);
			generatedInsert += ((used) > (generatedW_size - generatedInsert) ? (generatedW_size - generatedInsert) : (used));
		} 
		Object generatedHigh_water = this.getHigh_water();
		if (generatedHigh_water < generatedStrstart) {
			this.setHigh_water(generatedStrstart);
		} 
		if (/* If the last block was written to next_out, then done. */last) {
			return .finish_done;
		} 
		if (flush != 0 && flush != /* If flushing and all input has been consumed, then done. */4 && generatedStrm.getAvail_in() == 0 && (long)generatedStrstart == generatedBlock_start) {
			return .block_done;
		} 
		have = generatedWindow_size - generatedStrstart - /* Fill the window with any remaining input. */1;
		if (generatedStrm.getAvail_in() > have && generatedBlock_start >= (long)generatedW_size) {
			generatedBlock_start -= generatedW_size;
			generatedStrstart -= generatedW_size;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow, generatedWindow + generatedW_size, generatedStrstart);
			if (generatedMatches < 2) {
				generatedMatches++;
			} 
			have += generatedW_size;
		} 
		if (have > generatedStrm.getAvail_in()) {
			have = generatedStrm.getAvail_in();
		} 
		if (have) {
			ModernizedCProgram.read_buf(generatedStrm, generatedWindow + generatedStrstart, have);
			generatedStrstart += have;
		} 
		if (generatedHigh_water < generatedStrstart) {
			this.setHigh_water(generatedStrstart);
		} 
		have = (generatedBi_valid + 42) >> /* number of header bytes */3;
		have = ((generatedPending_buf_size - have) > (true) ? (true) : (generatedPending_buf_size - /* maximum stored block length that will fit in pending: */have));
		min_block = ((have) > (generatedW_size) ? (generatedW_size) : (have));
		left = generatedStrstart - generatedBlock_start;
		if (left >= min_block || ((left || flush == 4) && flush != 0 && generatedStrm.getAvail_in() == 0 && left <= have)) {
			len = ((left) > (have) ? (have) : (left));
			last = flush == 4 && generatedStrm.getAvail_in() == 0 && len == left ? 1 : 0;
			s._tr_stored_block((charf)generatedWindow + generatedBlock_start, len, last);
			generatedBlock_start += len;
			ModernizedCProgram.flush_pending(generatedStrm);
		} 
		return last ? .finish_started : /* We've done all we can with the available input and output. */.need_more/* ===========================================================================
		 * Compress as much as possible from the input stream, return the current
		 * block state.
		 * This function does not perform lazy evaluation of matches and inserts
		 * new strings in the dictionary only for unmatched strings or for short
		 * matches. It is used only for the fast compression options.
		 */;
	}
	public  deflate_fast(int flush) {
		/* head of the hash chain */IPos hash_head = new IPos();
		/* set if current block must be flushed */int bflush;
		Object generatedLookahead = this.getLookahead();
		Object generatedStrstart = this.getStrstart();
		Object generatedW_size = (s).getW_size();
		Object generatedMatch_length = this.getMatch_length();
		Object generatedMatch_start = this.getMatch_start();
		Object[] generatedD_buf = this.getD_buf();
		Object generatedLast_lit = this.getLast_lit();
		Object[] generatedL_buf = this.getL_buf();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		Object generatedLit_bufsize = this.getLit_bufsize();
		Object generatedMax_lazy_match = this.getMax_lazy_match();
		Object[] generatedWindow = this.getWindow();
		Object generatedIns_h = this.getIns_h();
		Object generatedHash_shift = this.getHash_shift();
		Object generatedHash_mask = this.getHash_mask();
		long generatedBlock_start = this.getBlock_start();
		Object generatedStrm = this.getStrm();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedLookahead < (258 + 3 + 1)) {
				s.fill_window();
				if (generatedLookahead < (258 + 3 + 1) && flush == 0) {
					return .need_more;
				} 
				if (generatedLookahead == /* flush the current block */0) {
					break;
				} 
			} 
			hash_head = /* Insert the string window[strstart .. strstart+2] in the
			         * dictionary, and set hash_head to the head of the hash chain:
			         */0;
			if (generatedLookahead >= 3) {
				();
			} 
			if (hash_head != 0 && generatedStrstart - hash_head <= (generatedW_size - (258 + 3 + /* Find the longest match, discarding those <= prev_length.
			         * At this point we have always match_length < MIN_MATCH
			         */1/* To simplify the code, we prevent matches with the string
			             * of window index 0 (in particular we have to avoid a match
			             * of the string with itself at the start of the input file).
			             */))) {
				this.setMatch_length(s.longest_match(hash_head/* longest_match() sets match_start */));
			} 
			if (generatedMatch_length >= 3) {
				;
				{ 
					uch len = (uch)(generatedMatch_length - 3);
					ush dist = (ush)(generatedStrstart - generatedMatch_start);
					generatedD_buf[generatedLast_lit] = dist;
					generatedL_buf[generatedLast_lit++] = len;
					dist--;
					generatedDyn_ltree[ModernizedCProgram._length_code[len] + 256 + 1].getFc().getFreq()++;
					generatedDyn_dtree[((dist) < 256 ? ModernizedCProgram._dist_code[dist] : ModernizedCProgram._dist_code[256 + ((dist) >> 7)])].getFc().getFreq()++;
					bflush = (generatedLast_lit == generatedLit_bufsize - 1);
				}
				;
				generatedLookahead -= generatedMatch_length;
				if (generatedMatch_length <= generatedMax_lazy_match && generatedLookahead >= 3) {
					generatedMatch_length--;
					do {
						generatedStrstart++;
						();
					} while (--generatedMatch_length != 0);
					generatedStrstart++;
				} else {
						generatedStrstart += generatedMatch_length;
						this.setMatch_length(0);
						this.setIns_h(generatedWindow[generatedStrstart]);
						(this.setIns_h((((generatedIns_h) << generatedHash_shift) ^ (generatedWindow[generatedStrstart + 1])) & generatedHash_mask));
				} 
			} else {
					;
					{ 
						uch cc = (generatedWindow[generatedStrstart]);
						generatedD_buf[generatedLast_lit] = 0;
						generatedL_buf[generatedLast_lit++] = cc;
						generatedDyn_ltree[cc].getFc().getFreq()++;
						bflush = (generatedLast_lit == generatedLit_bufsize - 1);
					}
					;
					generatedLookahead--;
					generatedStrstart++;
			} 
			if (bflush) {
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (false) ? .finish_started : .need_more;
				} 
			} 
			;
		}/* Make sure that we always have enough lookahead, except
		         * at the end of the input file. We need MAX_MATCH bytes
		         * for the next match, plus MIN_MATCH bytes to insert the
		         * string following the next match.
		         */
		this.setInsert(generatedStrstart < 3 - 1 ? generatedStrstart : 3 - 1);
		if (flush == 4) {
			{ 
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (true));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (true) ? .finish_started : .need_more;
				} 
			}
			;
			return .finish_done;
		} 
		if (generatedLast_lit) {
			{ 
				s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
				this.setBlock_start(generatedStrstart);
				ModernizedCProgram.flush_pending(generatedStrm);
				;
			}
			;
			if (generatedStrm.getAvail_out() == 0) {
				return (false) ? .finish_started : .need_more;
			} 
		} 
		;
		return .block_done/* ===========================================================================
		 * Same as above, but achieves better compression. We use a lazy
		 * evaluation for matches: a match is finally adopted only if there is
		 * no better match at the next window position.
		 *//* ===========================================================================
		 * Same as above, but achieves better compression. We use a lazy
		 * evaluation for matches: a match is finally adopted only if there is
		 * no better match at the next window position.
		 */;
	}
	public  deflate_slow(int flush) {
		/* head of hash chain */IPos hash_head = new IPos();
		/* set if current block must be flushed */int bflush;
		Object generatedLookahead = this.getLookahead();
		Object generatedPrev_length = this.getPrev_length();
		Object generatedMax_lazy_match = this.getMax_lazy_match();
		Object generatedStrstart = this.getStrstart();
		Object generatedW_size = (s).getW_size();
		Object generatedMatch_length = this.getMatch_length();
		int generatedStrategy = this.getStrategy();
		Object generatedMatch_start = this.getMatch_start();
		Object generatedPrev_match = this.getPrev_match();
		Object[] generatedD_buf = this.getD_buf();
		Object generatedLast_lit = this.getLast_lit();
		Object[] generatedL_buf = this.getL_buf();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		Object generatedLit_bufsize = this.getLit_bufsize();
		long generatedBlock_start = this.getBlock_start();
		Object[] generatedWindow = this.getWindow();
		Object generatedStrm = this.getStrm();
		int generatedMatch_available = this.getMatch_available();
		/* Process the input block. */for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedLookahead < (258 + 3 + 1)) {
				s.fill_window();
				if (generatedLookahead < (258 + 3 + 1) && flush == 0) {
					return .need_more;
				} 
				if (generatedLookahead == /* flush the current block */0) {
					break;
				} 
			} 
			hash_head = /* Insert the string window[strstart .. strstart+2] in the
			         * dictionary, and set hash_head to the head of the hash chain:
			         */0;
			if (generatedLookahead >= 3) {
				();
			} 
			;
			this.setMatch_length(3 - 1);
			if (hash_head != 0 && generatedPrev_length < generatedMax_lazy_match && generatedStrstart - hash_head <= (generatedW_size - (258 + 3 + 1/* To simplify the code, we prevent matches with the string
			             * of window index 0 (in particular we have to avoid a match
			             * of the string with itself at the start of the input file).
			             */))) {
				this.setMatch_length(s.longest_match(hash_head/* longest_match() sets match_start */));
				if (generatedMatch_length <= 5 && (generatedStrategy == 1 || (generatedMatch_length == 3 && generatedStrstart - generatedMatch_start > 4096))) {
					this.setMatch_length(3 - /* If prev_match is also MIN_MATCH, match_start is garbage
					                 * but we will ignore the current match anyway.
					                 */1);
				} 
			} 
			if (generatedPrev_length >= 3 && generatedMatch_length <= generatedPrev_length) {
				uInt max_insert = generatedStrstart + generatedLookahead - 3/* Do not insert strings in hash table beyond this. */;
				;
				{ 
					uch len = (uch)(generatedPrev_length - 3);
					ush dist = (ush)(generatedStrstart - 1 - generatedPrev_match);
					generatedD_buf[generatedLast_lit] = dist;
					generatedL_buf[generatedLast_lit++] = len;
					dist--;
					generatedDyn_ltree[ModernizedCProgram._length_code[len] + 256 + 1].getFc().getFreq()++;
					generatedDyn_dtree[((dist) < 256 ? ModernizedCProgram._dist_code[dist] : ModernizedCProgram._dist_code[256 + ((dist) >> 7)])].getFc().getFreq()++;
					bflush = (generatedLast_lit == generatedLit_bufsize - 1);
				}
				;
				generatedLookahead -= generatedPrev_length - 1;
				generatedPrev_length -= 2;
				do {
					if (++generatedStrstart <= max_insert) {
						();
					} 
				} while (--generatedPrev_length != 0);
				this.setMatch_available(0);
				this.setMatch_length(3 - 1);
				generatedStrstart++;
				if (bflush) {
					{ 
						s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
						this.setBlock_start(generatedStrstart);
						ModernizedCProgram.flush_pending(generatedStrm);
						;
					}
					;
					if (generatedStrm.getAvail_out() == 0) {
						return (false) ? .finish_started : .need_more;
					} 
				} 
				;
			}  else if (generatedMatch_available) {
				;
				{ 
					uch cc = (generatedWindow[generatedStrstart - 1]);
					generatedD_buf[generatedLast_lit] = 0;
					generatedL_buf[generatedLast_lit++] = cc;
					generatedDyn_ltree[cc].getFc().getFreq()++;
					bflush = (generatedLast_lit == generatedLit_bufsize - 1);
				}
				;
				if (bflush) {
					{ 
						s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
						this.setBlock_start(generatedStrstart);
						ModernizedCProgram.flush_pending(generatedStrm);
						;
					}
					;
				} 
				generatedStrstart++;
				generatedLookahead--;
				if (generatedStrm.getAvail_out() == 0) {
					return .need_more/* There is no previous match to compare with, wait for
					             * the next step to decide.
					             */;
				} 
			} else {
					this.setMatch_available(1);
					generatedStrstart++;
					generatedLookahead--;
			} 
		}/* Make sure that we always have enough lookahead, except
		         * at the end of the input file. We need MAX_MATCH bytes
		         * for the next match, plus MIN_MATCH bytes to insert the
		         * string following the next match.
		         */
		;
		if (generatedMatch_available) {
			;
			{ 
				uch cc = (generatedWindow[generatedStrstart - 1]);
				generatedD_buf[generatedLast_lit] = 0;
				generatedL_buf[generatedLast_lit++] = cc;
				generatedDyn_ltree[cc].getFc().getFreq()++;
				bflush = (generatedLast_lit == generatedLit_bufsize - 1);
			}
			;
			this.setMatch_available(0);
		} 
		this.setInsert(generatedStrstart < 3 - 1 ? generatedStrstart : 3 - 1);
		if (flush == 4) {
			{ 
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (true));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (true) ? .finish_started : .need_more;
				} 
			}
			;
			return .finish_done;
		} 
		if (generatedLast_lit) {
			{ 
				s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
				this.setBlock_start(generatedStrstart);
				ModernizedCProgram.flush_pending(generatedStrm);
				;
			}
			;
			if (generatedStrm.getAvail_out() == 0) {
				return (false) ? .finish_started : .need_more;
			} 
		} 
		;
		return .block_done/* FASTEST *//* ===========================================================================
		 * For Z_RLE, simply look for runs of bytes, generate matches only of distance
		 * one.  Do not maintain a hash table.  (It will be regenerated if this run of
		 * deflate switches away from Z_RLE.)
		 */;
	}
	public  deflate_rle(int flush) {
		/* set if current block must be flushed */int bflush;
		/* byte at distance one to match */uInt prev = new uInt();
		/* scan goes up to strend for length of run */Bytef scan = new Bytef();
		Bytef strend = new Bytef();
		Object generatedLookahead = this.getLookahead();
		Object generatedStrstart = this.getStrstart();
		Object[] generatedWindow = this.getWindow();
		Object generatedMatch_length = this.getMatch_length();
		Object[] generatedD_buf = this.getD_buf();
		Object generatedLast_lit = this.getLast_lit();
		Object[] generatedL_buf = this.getL_buf();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		Object generatedLit_bufsize = this.getLit_bufsize();
		long generatedBlock_start = this.getBlock_start();
		Object generatedStrm = this.getStrm();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedLookahead <= 258) {
				s.fill_window();
				if (generatedLookahead <= 258 && flush == 0) {
					return .need_more;
				} 
				if (generatedLookahead == /* flush the current block */0) {
					break;
				} 
			} 
			this.setMatch_length(/* See how many times the previous byte repeats */0);
			if (generatedLookahead >= 3 && generatedStrstart > 0) {
				scan = generatedWindow + generatedStrstart - 1;
				prev = scan;
				if (prev == ++scan && prev == ++scan && prev == ++scan) {
					strend = generatedWindow + generatedStrstart + 258;
					do {
					} while (prev == ++scan && prev == ++scan && prev == ++scan && prev == ++scan && prev == ++scan && prev == ++scan && prev == ++scan && prev == ++scan && scan < strend);
					this.setMatch_length(258 - (uInt)(strend - scan));
					if (generatedMatch_length > generatedLookahead) {
						this.setMatch_length(generatedLookahead);
					} 
				} 
				;
			} 
			if (generatedMatch_length >= /* Emit match if have run of MIN_MATCH or longer, else emit literal */3) {
				;
				{ 
					uch len = (uch)(generatedMatch_length - 3);
					ush dist = (ush)(true);
					generatedD_buf[generatedLast_lit] = dist;
					generatedL_buf[generatedLast_lit++] = len;
					dist--;
					generatedDyn_ltree[ModernizedCProgram._length_code[len] + 256 + 1].getFc().getFreq()++;
					generatedDyn_dtree[((dist) < 256 ? ModernizedCProgram._dist_code[dist] : ModernizedCProgram._dist_code[256 + ((dist) >> 7)])].getFc().getFreq()++;
					bflush = (generatedLast_lit == generatedLit_bufsize - 1);
				}
				;
				generatedLookahead -= generatedMatch_length;
				generatedStrstart += generatedMatch_length;
				this.setMatch_length(0);
			} else {
					;
					{ 
						uch cc = (generatedWindow[generatedStrstart]);
						generatedD_buf[generatedLast_lit] = 0;
						generatedL_buf[generatedLast_lit++] = cc;
						generatedDyn_ltree[cc].getFc().getFreq()++;
						bflush = (generatedLast_lit == generatedLit_bufsize - 1);
					}
					;
					generatedLookahead--;
					generatedStrstart++;
			} 
			if (bflush) {
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (false) ? .finish_started : .need_more;
				} 
			} 
			;
		}/* Make sure that we always have enough lookahead, except
		         * at the end of the input file. We need MAX_MATCH bytes
		         * for the longest run, plus one for the unrolled loop.
		         */
		this.setInsert(0);
		if (flush == 4) {
			{ 
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (true));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (true) ? .finish_started : .need_more;
				} 
			}
			;
			return .finish_done;
		} 
		if (generatedLast_lit) {
			{ 
				s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
				this.setBlock_start(generatedStrstart);
				ModernizedCProgram.flush_pending(generatedStrm);
				;
			}
			;
			if (generatedStrm.getAvail_out() == 0) {
				return (false) ? .finish_started : .need_more;
			} 
		} 
		;
		return .block_done/* ===========================================================================
		 * For Z_HUFFMAN_ONLY, do not look for matches.  Do not maintain a hash table.
		 * (It will be regenerated if this run of deflate switches away from Huffman.)
		 */;
	}
	public  deflate_huff(int flush) {
		/* set if current block must be flushed */int bflush;
		Object generatedLookahead = this.getLookahead();
		Object[] generatedWindow = this.getWindow();
		Object generatedStrstart = this.getStrstart();
		Object[] generatedD_buf = this.getD_buf();
		Object generatedLast_lit = this.getLast_lit();
		Object[] generatedL_buf = this.getL_buf();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object generatedLit_bufsize = this.getLit_bufsize();
		long generatedBlock_start = this.getBlock_start();
		Object generatedStrm = this.getStrm();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedLookahead == /* Make sure that we have a literal to write. */0) {
				s.fill_window();
				if (generatedLookahead == 0) {
					if (flush == 0) {
						return .need_more;
					} 
					break;
				} 
			} 
			this.setMatch_length(/* Output a literal byte */0);
			;
			{ 
				uch cc = (generatedWindow[generatedStrstart]);
				generatedD_buf[generatedLast_lit] = 0;
				generatedL_buf[generatedLast_lit++] = cc;
				generatedDyn_ltree[cc].getFc().getFreq()++;
				bflush = (generatedLast_lit == generatedLit_bufsize - 1);
			}
			;
			generatedLookahead--;
			generatedStrstart++;
			if (bflush) {
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (false) ? .finish_started : .need_more;
				} 
			} 
			;
		}
		this.setInsert(0);
		if (flush == 4) {
			{ 
				{ 
					s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (true));
					this.setBlock_start(generatedStrstart);
					ModernizedCProgram.flush_pending(generatedStrm);
					;
				}
				;
				if (generatedStrm.getAvail_out() == 0) {
					return (true) ? .finish_started : .need_more;
				} 
			}
			;
			return .finish_done;
		} 
		if (generatedLast_lit) {
			{ 
				s._tr_flush_block((generatedBlock_start >= -1024 ? (charf)generatedWindow[(int)generatedBlock_start] : (charf)0), (ulg)((long)generatedStrstart - generatedBlock_start), (false));
				this.setBlock_start(generatedStrstart);
				ModernizedCProgram.flush_pending(generatedStrm);
				;
			}
			;
			if (generatedStrm.getAvail_out() == 0) {
				return (false) ? .finish_started : .need_more;
			} 
		} 
		;
		return .block_done;
	}
	/* defined(GEN_TREES_H) || !defined(STDC) */
	/* ===========================================================================
	 * Genererate the file trees.h describing the static trees.
	 */
	/* GEN_TREES_H */
	/* ===========================================================================
	 * Initialize the tree data structures for a new zlib stream.
	 */
	public void _tr_init() {
		ModernizedCProgram.tr_static_init();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		tree_desc_s generatedL_desc = this.getL_desc();
		generatedL_desc.setDyn_tree(generatedDyn_ltree);
		generatedL_desc.setStat_desc(ModernizedCProgram.static_l_desc);
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		tree_desc_s generatedD_desc = this.getD_desc();
		generatedD_desc.setDyn_tree(generatedDyn_dtree);
		generatedD_desc.setStat_desc(ModernizedCProgram.static_d_desc);
		Object[] generatedBl_tree = this.getBl_tree();
		tree_desc_s generatedBl_desc = this.getBl_desc();
		generatedBl_desc.setDyn_tree(generatedBl_tree);
		generatedBl_desc.setStat_desc(ModernizedCProgram.static_bl_desc);
		this.setBi_buf(0);
		this.setBi_valid(0);
		/* Initialize the first block of the first file: */s/* ===========================================================================
		 * Initialize a new block.
		 */.init_block();
	}
	public void init_block() {
		/* iterates over tree elements */int n;
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		for (n = 0; n < (256 + 1 + 29); n++) {
			generatedDyn_ltree[n].getFc().setFreq(/* Initialize the trees. */0);
		}
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		for (n = 0; n < 30; n++) {
			generatedDyn_dtree[n].getFc().setFreq(0);
		}
		Object[] generatedBl_tree = this.getBl_tree();
		for (n = 0; n < 19; n++) {
			generatedBl_tree[n].getFc().setFreq(0);
		}
		generatedDyn_ltree[256].getFc().setFreq(1);
		this.setOpt_len(this.setStatic_len(-1024));
		this.setLast_lit(this.setMatches(0/* Index within the heap array of least frequent node in the Huffman tree */));
	}
	/* ===========================================================================
	 * Remove the smallest element from the heap and recreate the heap with
	 * one less element. Updates heap and heap_len.
	 */
	/* ===========================================================================
	 * Construct the Huffman tree for the bit lengths and return the index in
	 * bl_order of the last bit length code to send.
	 */
	public int build_bl_tree() {
		/* index of last bit length code of non zero freq */int max_blindex;
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		tree_desc_s generatedL_desc = this.getL_desc();
		int generatedMax_code = generatedL_desc.getMax_code();
		ModernizedCProgram.scan_tree(s, (ct_data)generatedDyn_ltree, generatedMax_code);
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		ModernizedCProgram.scan_tree(s, (ct_data)generatedDyn_dtree, generatedMax_code);
		tree_desc_s generatedBl_desc = this.getBl_desc();
		ModernizedCProgram.build_tree(s, (tree_desc)((generatedBl_desc)));
		Object[] generatedBl_tree = this.getBl_tree();
		for (max_blindex = 19 - 1; max_blindex >= 3; /* Determine the number of bit length codes to send. The pkzip format
		     * requires that at least 4 bit length codes be sent. (appnote.txt says
		     * 3 but the actual value used is 4.)
		     */max_blindex--) {
			if (generatedBl_tree[ModernizedCProgram.bl_order[max_blindex]].getDl().getLen() != 0) {
				break;
			} 
		}
		Object generatedOpt_len = this.getOpt_len();
		generatedOpt_len += 3 * ((ulg)max_blindex + 1) + 5 + 5 + /* Update opt_len to include the bit length tree and counts */4;
		;
		return max_blindex/* ===========================================================================
		 * Send the header for a block using dynamic Huffman trees: the counts, the
		 * lengths of the bit length codes, the literal tree and the distance tree.
		 * IN assertion: lcodes >= 257, dcodes >= 1, blcodes >= 4.
		 */;
	}
	public void send_all_trees(int lcodes, int dcodes, int blcodes) {
		/* number of codes for each tree *//* index in bl_order */int rank;
		;
		;
		;
		int generatedBi_valid = this.getBi_valid();
		Object generatedBi_buf = this.getBi_buf();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		{ 
			int len = 5;
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)lcodes - 257;
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(lcodes - 257) << generatedBi_valid;
					generatedBi_valid += /* not +255 as stated in appnote.txt */len;
			} 
		}
		;
		{ 
			int len = 5;
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)dcodes - 1;
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(dcodes - 1) << generatedBi_valid;
					generatedBi_valid += len;
			} 
		}
		;
		{ 
			int len = 4;
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)blcodes - 4;
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(blcodes - 4) << generatedBi_valid;
					generatedBi_valid += /* not -3 as stated in appnote.txt */len;
			} 
		}
		;
		Object[] generatedBl_tree = this.getBl_tree();
		for (rank = 0; rank < blcodes; rank++) {
			;
			{ 
				int len = 3;
				if (generatedBi_valid > (int)16 - len) {
					int val = (int)generatedBl_tree[ModernizedCProgram.bl_order[rank]].getDl().getLen();
					generatedBi_buf |=  (ush)val << generatedBi_valid;
					{ 
						{ 
							generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
						}
						;
						{ 
							generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
						}
						;
					}
					;
					this.setBi_buf((ush)val >> (16 - generatedBi_valid));
					generatedBi_valid += len - 16;
				} else {
						generatedBi_buf |=  (ush)(generatedBl_tree[ModernizedCProgram.bl_order[rank]].getDl().getLen()) << generatedBi_valid;
						generatedBi_valid += len;
				} 
			}
			;
		}
		;
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		ModernizedCProgram.send_tree(s, (ct_data)generatedDyn_ltree, lcodes - /* literal tree */1);
		;
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		ModernizedCProgram.send_tree(s, (ct_data)generatedDyn_dtree, dcodes - /* distance tree */1);
		;/* ===========================================================================
		 * Send a stored block
		 */
	}
	public void _tr_stored_block(Object buf, Object stored_len, int last) {
		int generatedBi_valid = this.getBi_valid();
		Object generatedBi_buf = this.getBi_buf();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		{ 
			int len = 3;
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)(0 << 1) + last;
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)((0 << 1) + last) << generatedBi_valid;
					generatedBi_valid += /* length of input block *//* one if this is the last block for a file *//* send block type */len;
			} 
		}
		;
		/* align on byte boundary */s.bi_windup();
		{ 
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((uch)(((ush)stored_len) & -1024));
			}
			;
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)((ush)stored_len) >> 8));
			}
			;
		}
		;
		{ 
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((uch)(((ush)~stored_len) & -1024));
			}
			;
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)((ush)~stored_len) >> 8));
			}
			;
		}
		;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPending_buf + generatedPending, (Bytef)buf, stored_len);
		generatedPending += stored_len;
	}
	/* input block */
	/* ===========================================================================
	 * Flush the bits in the bit buffer to pending output (leaves at most 7 bits)
	 */
	public void _tr_flush_bits() {
		s/* ===========================================================================
		 * Send one empty static block to give enough lookahead for inflate.
		 * This takes 10 bits, of which 7 may remain in the bit buffer.
		 */.bi_flush();
	}
	public void _tr_align() {
		int generatedBi_valid = this.getBi_valid();
		Object generatedBi_buf = this.getBi_buf();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		{ 
			int len = 3;
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)1 << 1;
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(1 << 1) << generatedBi_valid;
					generatedBi_valid += len;
			} 
		}
		;
		{ 
			int len = ModernizedCProgram.static_ltree[256].getDl().getLen();
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)ModernizedCProgram.static_ltree[256].getFc().getCode();
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(ModernizedCProgram.static_ltree[256].getFc().getCode()) << generatedBi_valid;
					generatedBi_valid += len;
			} 
		}
		;
		/* 3 for block type, 7 for EOB */s/* ===========================================================================
		 * Determine the best encoding for the current block: dynamic trees, static
		 * trees or store, and write out the encoded block.
		 */.bi_flush();
	}
	public void _tr_flush_block(Object buf, Object stored_len, int last) {
		/* length of input block *//* one if this is the last block for a file *//* opt_len and static_len in bytes */ulg opt_lenb = new ulg();
		ulg static_lenb = new ulg();
		int max_blindex = /* index of last bit length code of non zero freq */0;
		int generatedLevel = this.getLevel();
		Object generatedStrm = this.getStrm();
		tree_desc_s generatedL_desc = this.getL_desc();
		tree_desc_s generatedD_desc = this.getD_desc();
		Object generatedOpt_len = this.getOpt_len();
		Object generatedStatic_len = this.getStatic_len();
		if (generatedLevel > /* Build the Huffman trees unless a stored block is forced */0) {
			if (generatedStrm.getData_type() == /* Check if the file is binary or text */2) {
				generatedStrm.setData_type(s.detect_data_type());
			} 
			ModernizedCProgram.build_tree(s, (tree_desc)((generatedL_desc)));
			;
			ModernizedCProgram.build_tree(s, (tree_desc)((generatedD_desc)));
			;
			max_blindex = /* Build the bit length tree for the above two trees, and get the index
			         * in bl_order of the last bit length code to send.
			         */s.build_bl_tree();
			opt_lenb = (generatedOpt_len + 3 + 7) >> /* Determine the best encoding. Compute the block lengths in bytes. */3;
			static_lenb = (generatedStatic_len + 3 + 7) >> 3;
			;
			if (static_lenb <= opt_lenb) {
				opt_lenb = static_lenb;
			} 
		} else {
				;
				opt_lenb = static_lenb = stored_len + /* force a stored block */5;
		} 
		int generatedStrategy = this.getStrategy();
		int generatedBi_valid = this.getBi_valid();
		Object generatedBi_buf = this.getBi_buf();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		int generatedMax_code = generatedL_desc.getMax_code();
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		if (stored_len + 4 <= opt_lenb && buf != (byte)/* force stored block */0/* 4: two words for the lengths *//* The test buf != NULL is only necessary if LIT_BUFSIZE > WSIZE.
		         * Otherwise we can't have processed more than WSIZE input bytes since
		         * the last block flush, because compression would have been
		         * successful. If LIT_BUFSIZE <= WSIZE, it is never too late to
		         * transform a block into a stored block.
		         */) {
			s._tr_stored_block(buf, stored_len, last);
		}  else if (generatedStrategy == 4 || static_lenb == /* force static trees */opt_lenb) {
			{ 
				int len = 3;
				if (generatedBi_valid > (int)16 - len) {
					int val = (int)(1 << 1) + last;
					generatedBi_buf |=  (ush)val << generatedBi_valid;
					{ 
						{ 
							generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
						}
						;
						{ 
							generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
						}
						;
					}
					;
					this.setBi_buf((ush)val >> (16 - generatedBi_valid));
					generatedBi_valid += len - 16;
				} else {
						generatedBi_buf |=  (ush)((1 << 1) + last) << generatedBi_valid;
						generatedBi_valid += len;
				} 
			}
			;
			s.compress_block((ct_data)ModernizedCProgram.static_ltree, (ct_data)ModernizedCProgram.static_dtree);
		} else {
				{ 
					int len = 3;
					if (generatedBi_valid > (int)16 - len) {
						int val = (int)(2 << 1) + last;
						generatedBi_buf |=  (ush)val << generatedBi_valid;
						{ 
							{ 
								generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
							}
							;
							{ 
								generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
							}
							;
						}
						;
						this.setBi_buf((ush)val >> (16 - generatedBi_valid));
						generatedBi_valid += len - 16;
					} else {
							generatedBi_buf |=  (ush)((2 << 1) + last) << generatedBi_valid;
							generatedBi_valid += len;
					} 
				}
				;
				s.send_all_trees(generatedMax_code + 1, generatedMax_code + 1, max_blindex + 1);
				s.compress_block((ct_data)generatedDyn_ltree, (ct_data)generatedDyn_dtree);
		} 
		;/* The above check is made mod 2^32, for files larger than 512 MB
		     * and uLong implemented on 32 bits.
		     */
		s.init_block();
		if (last) {
			s/* align on byte boundary */.bi_windup();
		} 
		;/* ===========================================================================
		 * Save the match info and tally the frequency counts. Return true if
		 * the current block must be flushed.
		 */
	}
	/* input block, or NULL if too old */
	public int _tr_tally(int dist, int lc) {
		Object[] generatedD_buf = this.getD_buf();
		Object generatedLast_lit = this.getLast_lit();
		generatedD_buf[generatedLast_lit] = (ush)/* match length-MIN_MATCH or unmatched char (if dist==0) */dist;
		Object[] generatedL_buf = this.getL_buf();
		generatedL_buf[generatedLast_lit++] = (uch)lc;
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		Object generatedMatches = this.getMatches();
		Object[] generatedDyn_dtree = this.getDyn_dtree();
		if (dist == 0) {
			generatedDyn_ltree[lc].getFc().getFreq()++;
		} else {
				generatedMatches++;
				/* Here, lc is the match length - MIN_MATCH *//* dist = match distance - 1 */dist--;
				;
				generatedDyn_ltree[ModernizedCProgram._length_code[lc] + 256 + 1].getFc().getFreq()++;
				generatedDyn_dtree[((dist) < 256 ? ModernizedCProgram._dist_code[dist] : ModernizedCProgram._dist_code[256 + ((dist) >> 7)])].getFc().getFreq()++;
		} 
		Object generatedLit_bufsize = this.getLit_bufsize();
		return (generatedLast_lit == generatedLit_bufsize - 1/* We avoid equality with lit_bufsize because of wraparound at 64K
		     * on 16 bit machines and because stored blocks are restricted to
		     * 64K-1 bytes.
		     */);
	}
	/* distance of matched string */
	/* ===========================================================================
	 * Send the block data compressed using the given Huffman trees
	 */
	public void compress_block(Object[] ltree, Object[] dtree) {
		/* distance tree *//* distance of matched string */int dist;
		/* match length or unmatched char (if dist == 0) */int lc;
		int lx = /* running index in l_buf */0;
		/* the code to send */int code;
		/* number of extra bits to send */int extra;
		Object generatedLast_lit = this.getLast_lit();
		Object[] generatedD_buf = this.getD_buf();
		Object[] generatedL_buf = this.getL_buf();
		int generatedBi_valid = this.getBi_valid();
		Object generatedBi_buf = this.getBi_buf();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		if (generatedLast_lit != 0) {
			do {
				dist = generatedD_buf[lx];
				lc = generatedL_buf[lx++];
				if (dist == 0) {
					{ 
						int len = ltree[lc].getDl().getLen();
						if (generatedBi_valid > (int)16 - len) {
							int val = (int)ltree[lc].getFc().getCode();
							generatedBi_buf |=  (ush)val << generatedBi_valid;
							{ 
								{ 
									generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
								}
								;
								{ 
									generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
								}
								;
							}
							;
							this.setBi_buf((ush)val >> (16 - generatedBi_valid));
							generatedBi_valid += len - 16;
						} else {
								generatedBi_buf |=  (ush)(ltree[lc].getFc().getCode()) << generatedBi_valid;
								generatedBi_valid += /* send a literal byte */len;
						} 
					}
					;
					;
				} else {
						code = ModernizedCProgram._length_code[/* Here, lc is the match length - MIN_MATCH */lc];
						{ 
							int len = ltree[code + 256 + 1].getDl().getLen();
							if (generatedBi_valid > (int)16 - len) {
								int val = (int)ltree[code + 256 + 1].getFc().getCode();
								generatedBi_buf |=  (ush)val << generatedBi_valid;
								{ 
									{ 
										generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
									}
									;
									{ 
										generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
									}
									;
								}
								;
								this.setBi_buf((ush)val >> (16 - generatedBi_valid));
								generatedBi_valid += len - 16;
							} else {
									generatedBi_buf |=  (ush)(ltree[code + 256 + 1].getFc().getCode()) << generatedBi_valid;
									generatedBi_valid += /* send the length code */len;
							} 
						}
						;
						extra = ModernizedCProgram.extra_lbits[code];
						if (extra != 0) {
							lc -= ModernizedCProgram.base_length[code];
							{ 
								int len = extra;
								if (generatedBi_valid > (int)16 - len) {
									int val = (int)lc;
									generatedBi_buf |=  (ush)val << generatedBi_valid;
									{ 
										{ 
											generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
										}
										;
										{ 
											generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
										}
										;
									}
									;
									this.setBi_buf((ush)val >> (16 - generatedBi_valid));
									generatedBi_valid += len - 16;
								} else {
										generatedBi_buf |=  (ush)(lc) << generatedBi_valid;
										generatedBi_valid += /* send the extra length bits */len;
								} 
							}
							;
						} 
						/* dist is now the match distance - 1 */dist--;
						code = ((dist) < 256 ? ModernizedCProgram._dist_code[dist] : ModernizedCProgram._dist_code[256 + ((dist) >> 7)]);
						;
						{ 
							int len = dtree[code].getDl().getLen();
							if (generatedBi_valid > (int)16 - len) {
								int val = (int)dtree[code].getFc().getCode();
								generatedBi_buf |=  (ush)val << generatedBi_valid;
								{ 
									{ 
										generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
									}
									;
									{ 
										generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
									}
									;
								}
								;
								this.setBi_buf((ush)val >> (16 - generatedBi_valid));
								generatedBi_valid += len - 16;
							} else {
									generatedBi_buf |=  (ush)(dtree[code].getFc().getCode()) << generatedBi_valid;
									generatedBi_valid += /* send the distance code */len;
							} 
						}
						;
						extra = ModernizedCProgram.extra_dbits[code];
						if (extra != 0) {
							dist -= (int)ModernizedCProgram.base_dist[code];
							{ 
								int len = extra;
								if (generatedBi_valid > (int)16 - len) {
									int val = (int)dist;
									generatedBi_buf |=  (ush)val << generatedBi_valid;
									{ 
										{ 
											generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
										}
										;
										{ 
											generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
										}
										;
									}
									;
									this.setBi_buf((ush)val >> (16 - generatedBi_valid));
									generatedBi_valid += len - 16;
								} else {
										generatedBi_buf |=  (ush)(dist) << generatedBi_valid;
										generatedBi_valid += /* send the extra distance bits */len/* literal or match pair ? */;
								} 
							}
							;
						} 
				} 
				;
			} while (lx < generatedLast_lit);
		} 
		{ 
			int len = ltree[256].getDl().getLen();
			if (generatedBi_valid > (int)16 - len) {
				int val = (int)ltree[256].getFc().getCode();
				generatedBi_buf |=  (ush)val << generatedBi_valid;
				{ 
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
					}
					;
					{ 
						generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
					}
					;
				}
				;
				this.setBi_buf((ush)val >> (16 - generatedBi_valid));
				generatedBi_valid += len - 16;
			} else {
					generatedBi_buf |=  (ush)(ltree[256].getFc().getCode()) << generatedBi_valid;
					generatedBi_valid += len/* ===========================================================================
					 * Check if the data type is TEXT or BINARY, using the following algorithm:
					 * - TEXT if the two conditions below are satisfied:
					 *    a) There are no non-portable control characters belonging to the
					 *       "black list" (0..6, 14..25, 28..31).
					 *    b) There is at least one printable character belonging to the
					 *       "white list" (9 {TAB}, 10 {LF}, 13 {CR}, 32..255).
					 * - BINARY otherwise.
					 * - The following partially-portable control characters form a
					 *   "gray list" that is ignored in this detection algorithm:
					 *   (7 {BEL}, 8 {BS}, 11 {VT}, 12 {FF}, 26 {SUB}, 27 {ESC}).
					 * IN assertion: the fields Freq of dyn_ltree are set.
					 */;
			} 
		}
		;
	}
	/* literal tree */
	public int detect_data_type() {
		long black_mask = -1024;
		int n;
		Object[] generatedDyn_ltree = this.getDyn_ltree();
		for (n = 0; n <= 31; ) {
			if ((black_mask & 1) && (generatedDyn_ltree[n].getFc().getFreq() != 0)) {
				return 0;
			} 
		}
		if (generatedDyn_ltree[9].getFc().getFreq() != 0 || generatedDyn_ltree[10].getFc().getFreq() != /* Check for textual ("white-listed") bytes. */0 || generatedDyn_ltree[13].getFc().getFreq() != 0) {
			return 1;
		} 
		for (n = 32; n < 256; n++) {
			if (generatedDyn_ltree[n].getFc().getFreq() != 0) {
				return 1/* There are no "black-listed" or "white-listed" bytes:
				     * this stream either is empty or has tolerated ("gray-listed") bytes only.
				     */;
			} 
		}
		return 0/* ===========================================================================
		 * Reverse the first len bits of a code, using straightforward code (a faster
		 * method would use a table)
		 * IN assertion: 1 <= len <= 15
		 */;
	}
	/* black_mask is the bit mask of black-listed bytes
	     * set bits 0..6, 14..25, and 28..31
	     * 0xf3ffc07f = binary 11110011111111111100000001111111
	     */
	public void bi_flush() {
		int generatedBi_valid = this.getBi_valid();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		Object generatedBi_buf = this.getBi_buf();
		if (generatedBi_valid == 16) {
			{ 
				{ 
					generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
				}
				;
				{ 
					generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
				}
				;
			}
			;
			this.setBi_buf(0);
			this.setBi_valid(0);
		}  else if (generatedBi_valid >= 8) {
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((Byte)generatedBi_buf);
			}
			;
			generatedBi_buf >>=  8;
			generatedBi_valid -= 8;
		} 
	}
	/* Send a code of the given tree. c and tree must not have side effects */
	/* !ZLIB_DEBUG */
	/* ===========================================================================
	 * Output a short LSB first on the stream.
	 * IN assertion: there is enough room in pendingBuf.
	 */
	/* ===========================================================================
	 * Send a value on a given number of bits.
	 * IN assertion: length <= 16 and value fits in length bits.
	 */
	/* value to send */
	/* number of bits */
	/* ===========================================================================
	 * Flush the bit buffer and align the output on a byte boundary
	 */
	public void bi_windup() {
		int generatedBi_valid = this.getBi_valid();
		Object[] generatedPending_buf = this.getPending_buf();
		Object generatedPending = this.getPending();
		Object generatedBi_buf = this.getBi_buf();
		if (generatedBi_valid > 8) {
			{ 
				{ 
					generatedPending_buf[generatedPending++] = (Bytef)((uch)((generatedBi_buf) & -1024));
				}
				;
				{ 
					generatedPending_buf[generatedPending++] = (Bytef)((uch)((ush)(generatedBi_buf) >> 8));
				}
				;
			}
			;
		}  else if (generatedBi_valid > 0) {
			{ 
				generatedPending_buf[generatedPending++] = (Bytef)((Byte)generatedBi_buf);
			}
			;
		} 
		this.setBi_buf(0);
		this.setBi_valid(0);
	}
	public Object getStrm() {
		return strm;
	}
	public void setStrm(Object newStrm) {
		strm = newStrm;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
	public Object[] getPending_buf() {
		return pending_buf;
	}
	public void setPending_buf(Object[] newPending_buf) {
		pending_buf = newPending_buf;
	}
	public Object getPending_buf_size() {
		return pending_buf_size;
	}
	public void setPending_buf_size(Object newPending_buf_size) {
		pending_buf_size = newPending_buf_size;
	}
	public Object getPending_out() {
		return pending_out;
	}
	public void setPending_out(Object newPending_out) {
		pending_out = newPending_out;
	}
	public Object getPending() {
		return pending;
	}
	public void setPending(Object newPending) {
		pending = newPending;
	}
	public int getWrap() {
		return wrap;
	}
	public void setWrap(int newWrap) {
		wrap = newWrap;
	}
	public Object getGzhead() {
		return gzhead;
	}
	public void setGzhead(Object newGzhead) {
		gzhead = newGzhead;
	}
	public Object getGzindex() {
		return gzindex;
	}
	public void setGzindex(Object newGzindex) {
		gzindex = newGzindex;
	}
	public Object getMethod() {
		return method;
	}
	public void setMethod(Object newMethod) {
		method = newMethod;
	}
	public int getLast_flush() {
		return last_flush;
	}
	public void setLast_flush(int newLast_flush) {
		last_flush = newLast_flush;
	}
	public Object getW_size() {
		return w_size;
	}
	public void setW_size(Object newW_size) {
		w_size = newW_size;
	}
	public Object getW_bits() {
		return w_bits;
	}
	public void setW_bits(Object newW_bits) {
		w_bits = newW_bits;
	}
	public Object getW_mask() {
		return w_mask;
	}
	public void setW_mask(Object newW_mask) {
		w_mask = newW_mask;
	}
	public Object[] getWindow() {
		return window;
	}
	public void setWindow(Object[] newWindow) {
		window = newWindow;
	}
	public Object getWindow_size() {
		return window_size;
	}
	public void setWindow_size(Object newWindow_size) {
		window_size = newWindow_size;
	}
	public Object[] getPrev() {
		return prev;
	}
	public void setPrev(Object[] newPrev) {
		prev = newPrev;
	}
	public Object[] getHead() {
		return head;
	}
	public void setHead(Object[] newHead) {
		head = newHead;
	}
	public Object getIns_h() {
		return ins_h;
	}
	public void setIns_h(Object newIns_h) {
		ins_h = newIns_h;
	}
	public Object getHash_size() {
		return hash_size;
	}
	public void setHash_size(Object newHash_size) {
		hash_size = newHash_size;
	}
	public Object getHash_bits() {
		return hash_bits;
	}
	public void setHash_bits(Object newHash_bits) {
		hash_bits = newHash_bits;
	}
	public Object getHash_mask() {
		return hash_mask;
	}
	public void setHash_mask(Object newHash_mask) {
		hash_mask = newHash_mask;
	}
	public Object getHash_shift() {
		return hash_shift;
	}
	public void setHash_shift(Object newHash_shift) {
		hash_shift = newHash_shift;
	}
	public long getBlock_start() {
		return block_start;
	}
	public void setBlock_start(long newBlock_start) {
		block_start = newBlock_start;
	}
	public Object getMatch_length() {
		return match_length;
	}
	public void setMatch_length(Object newMatch_length) {
		match_length = newMatch_length;
	}
	public Object getPrev_match() {
		return prev_match;
	}
	public void setPrev_match(Object newPrev_match) {
		prev_match = newPrev_match;
	}
	public int getMatch_available() {
		return match_available;
	}
	public void setMatch_available(int newMatch_available) {
		match_available = newMatch_available;
	}
	public Object getStrstart() {
		return strstart;
	}
	public void setStrstart(Object newStrstart) {
		strstart = newStrstart;
	}
	public Object getMatch_start() {
		return match_start;
	}
	public void setMatch_start(Object newMatch_start) {
		match_start = newMatch_start;
	}
	public Object getLookahead() {
		return lookahead;
	}
	public void setLookahead(Object newLookahead) {
		lookahead = newLookahead;
	}
	public Object getPrev_length() {
		return prev_length;
	}
	public void setPrev_length(Object newPrev_length) {
		prev_length = newPrev_length;
	}
	public Object getMax_chain_length() {
		return max_chain_length;
	}
	public void setMax_chain_length(Object newMax_chain_length) {
		max_chain_length = newMax_chain_length;
	}
	public Object getMax_lazy_match() {
		return max_lazy_match;
	}
	public void setMax_lazy_match(Object newMax_lazy_match) {
		max_lazy_match = newMax_lazy_match;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public int getStrategy() {
		return strategy;
	}
	public void setStrategy(int newStrategy) {
		strategy = newStrategy;
	}
	public Object getGood_match() {
		return good_match;
	}
	public void setGood_match(Object newGood_match) {
		good_match = newGood_match;
	}
	public int getNice_match() {
		return nice_match;
	}
	public void setNice_match(int newNice_match) {
		nice_match = newNice_match;
	}
	public Object[] getDyn_ltree() {
		return dyn_ltree;
	}
	public void setDyn_ltree(Object[] newDyn_ltree) {
		dyn_ltree = newDyn_ltree;
	}
	public Object[] getDyn_dtree() {
		return dyn_dtree;
	}
	public void setDyn_dtree(Object[] newDyn_dtree) {
		dyn_dtree = newDyn_dtree;
	}
	public Object[] getBl_tree() {
		return bl_tree;
	}
	public void setBl_tree(Object[] newBl_tree) {
		bl_tree = newBl_tree;
	}
	public tree_desc_s getL_desc() {
		return l_desc;
	}
	public void setL_desc(tree_desc_s newL_desc) {
		l_desc = newL_desc;
	}
	public tree_desc_s getD_desc() {
		return d_desc;
	}
	public void setD_desc(tree_desc_s newD_desc) {
		d_desc = newD_desc;
	}
	public tree_desc_s getBl_desc() {
		return bl_desc;
	}
	public void setBl_desc(tree_desc_s newBl_desc) {
		bl_desc = newBl_desc;
	}
	public Object[] getBl_count() {
		return bl_count;
	}
	public void setBl_count(Object[] newBl_count) {
		bl_count = newBl_count;
	}
	public Object[] getHeap() {
		return heap;
	}
	public void setHeap(Object[] newHeap) {
		heap = newHeap;
	}
	public int getHeap_len() {
		return heap_len;
	}
	public void setHeap_len(int newHeap_len) {
		heap_len = newHeap_len;
	}
	public int getHeap_max() {
		return heap_max;
	}
	public void setHeap_max(int newHeap_max) {
		heap_max = newHeap_max;
	}
	public Object[] getDepth() {
		return depth;
	}
	public void setDepth(Object[] newDepth) {
		depth = newDepth;
	}
	public Object[] getL_buf() {
		return l_buf;
	}
	public void setL_buf(Object[] newL_buf) {
		l_buf = newL_buf;
	}
	public Object getLit_bufsize() {
		return lit_bufsize;
	}
	public void setLit_bufsize(Object newLit_bufsize) {
		lit_bufsize = newLit_bufsize;
	}
	public Object getLast_lit() {
		return last_lit;
	}
	public void setLast_lit(Object newLast_lit) {
		last_lit = newLast_lit;
	}
	public Object[] getD_buf() {
		return d_buf;
	}
	public void setD_buf(Object[] newD_buf) {
		d_buf = newD_buf;
	}
	public Object getOpt_len() {
		return opt_len;
	}
	public void setOpt_len(Object newOpt_len) {
		opt_len = newOpt_len;
	}
	public Object getStatic_len() {
		return static_len;
	}
	public void setStatic_len(Object newStatic_len) {
		static_len = newStatic_len;
	}
	public Object getMatches() {
		return matches;
	}
	public void setMatches(Object newMatches) {
		matches = newMatches;
	}
	public Object getInsert() {
		return insert;
	}
	public void setInsert(Object newInsert) {
		insert = newInsert;
	}
	public Object getBi_buf() {
		return bi_buf;
	}
	public void setBi_buf(Object newBi_buf) {
		bi_buf = newBi_buf;
	}
	public int getBi_valid() {
		return bi_valid;
	}
	public void setBi_valid(int newBi_valid) {
		bi_valid = newBi_valid;
	}
	public Object getHigh_water() {
		return high_water;
	}
	public void setHigh_water(Object newHigh_water) {
		high_water = newHigh_water;
	}
}
