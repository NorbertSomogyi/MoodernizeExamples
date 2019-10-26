package application;

public class growarray {
	private int ga_len;
	private int ga_maxlen;
	private int ga_itemsize;
	private int ga_growsize;
	private Object ga_data;
	
	public growarray(int ga_len, int ga_maxlen, int ga_itemsize, int ga_growsize, Object ga_data) {
		setGa_len(ga_len);
		setGa_maxlen(ga_maxlen);
		setGa_itemsize(ga_itemsize);
		setGa_growsize(ga_growsize);
		setGa_data(ga_data);
	}
	public growarray() {
	}
	
	public void globpath(Object path, Object file, int expand_options) {
		expand_T xpc = new expand_T();
		char_u buf = new char_u();
		int i;
		int num_p;
		char_u p = new char_u();
		buf = ModernizedCProgram.alloc(1024);
		if (buf == ((Object)0)) {
			return ;
		} 
		xpc.ExpandInit();
		xpc.setXp_context(2);
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		// Loop over all entries in {path}.while (path != (byte)'\000') {
			ModernizedCProgram.copy_option_part(path, buf, 1024, ",");
			if (.strlen((byte)(buf)) + .strlen((byte)(file)) + 2 < 1024) {
				if (buf != (byte)'\000' && !ModernizedCProgram.after_pathsep(buf, buf + .strlen((byte)(buf)))) {
					.strcat((byte)(buf), (byte)("/"));
				} 
				.strcat((byte)(buf), (byte)(file));
				if (xpc.ExpandFromContext(buf, num_p, p, -1024 | expand_options) != 0 && num_p > 0) {
					xpc.ExpandEscape(buf, num_p, p, -1024 | expand_options);
					if (ga.ga_grow(num_p) == 1) {
						for (i = 0; i < num_p; ++i) {
							((char_u)generatedGa_data)[generatedGa_len] = ModernizedCProgram.vim_strnsave(p[i], (int).strlen((byte)(p[i])));
							++generatedGa_len;
						}
					} 
					ModernizedCProgram.FreeWild(num_p, p);
				} 
			} 
		}
		ModernizedCProgram.vim_free(buf/*
		 * "getcompletion()" function
		 */);
	}
	/* checkCloseRec() {{{2 */
	public int checkCloseRec(Object lnum, int level) {
		fold_T fp = new fold_T();
		int retval = 0;
		int i;
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data;
		int generatedGa_len = this.getGa_len();
		for (i = 0; i < generatedGa_len; ++i) {
			if (fp[i].getFd_flags() == /* Only manually opened folds may need to be closed. */0) {
				if (level <= 0 && (lnum < fp[i].getFd_top() || lnum >= fp[i].getFd_top() + fp[i].getFd_len())) {
					fp[i].setFd_flags(2);
					retval = 1;
				} else {
						retval |=  fp[i].getFd_nested().checkCloseRec(lnum - fp[i].getFd_top(), level - 1);
				} 
			} 
		}
		return retval/* foldCreateAllowed() {{{2 *//*
		 * Return TRUE if it's allowed to manually create or delete a fold.
		 * Give an error message and return FALSE if not.
		 */;
	}
	public void cloneFoldGrowArray(growarray to) {
		int i;
		fold_T from_p = new fold_T();
		fold_T to_p = new fold_T();
		int generatedGa_itemsize = this.getGa_itemsize();
		int generatedGa_growsize = this.getGa_growsize();
		to.ga_init2(generatedGa_itemsize, generatedGa_growsize);
		int generatedGa_len = this.getGa_len();
		if (generatedGa_len == 0 || to.ga_grow(generatedGa_len) == 0) {
			return ;
		} 
		Object generatedGa_data = this.getGa_data();
		from_p = (fold_T)generatedGa_data;
		to_p = (fold_T)generatedGa_data;
		Object generatedFd_top = from_p.getFd_top();
		Object generatedFd_len = from_p.getFd_len();
		Object generatedFd_flags = from_p.getFd_flags();
		Object generatedFd_small = from_p.getFd_small();
		Object generatedFd_nested = from_p.getFd_nested();
		for (i = 0; i < generatedGa_len; i++) {
			to_p.setFd_top(generatedFd_top);
			to_p.setFd_len(generatedFd_len);
			to_p.setFd_flags(generatedFd_flags);
			to_p.setFd_small(generatedFd_small);
			generatedFd_nested.cloneFoldGrowArray(generatedFd_nested);
			++generatedGa_len;
			++from_p;
			++to_p/* foldFind() {{{2 *//*
			 * Search for line "lnum" in folds of growarray "gap".
			 * Set *fpp to the fold struct for the fold that contains "lnum" or
			 * the first fold below it (careful: it can be beyond the end of the array!).
			 * Returns FALSE when there is no fold that contains "lnum".
			 */;
		}
	}
	public void deleteFoldEntry(int idx, int recursive) {
		fold_T fp = new fold_T();
		int i;
		long moved;
		fold_T nfp = new fold_T();
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data + idx;
		Object generatedFd_nested = fp.getFd_nested();
		int generatedGa_len = this.getGa_len();
		Object generatedFd_top = fp.getFd_top();
		Object generatedFd_flags = fp.getFd_flags();
		Object generatedFd_small = fp.getFd_small();
		if (recursive || generatedFd_nested.getGa_len() == 0) {
			generatedFd_nested.deleteFoldRecurse();
			--generatedGa_len;
			if (idx < generatedGa_len) {
				.memmove((byte)(fp), (byte)(fp + 1), (size_t)( * (generatedGa_len - idx)));
			} 
		} else {
				moved = generatedGa_len;
				if (gap.ga_grow((int)(moved - 1)) == 1) {
					fp = (fold_T)generatedGa_data + /* Get "fp" again, the array may have been reallocated. */idx;
					nfp = (fold_T)generatedGa_data;
					for (i = 0; i < moved; ++i) {
						nfp[i].getFd_top() += generatedFd_top;
						if (generatedFd_flags == 2) {
							nfp[i].setFd_flags(2);
						} 
						if (generatedFd_small == 2) {
							nfp[i].setFd_small(2);
						} 
					}
					if (idx + 1 < generatedGa_len) {
						.memmove((byte)(fp + moved), (byte)(fp + 1), (size_t)( * (generatedGa_len - (idx + 1))));
					} 
					.memmove((byte)(fp), (byte)(nfp), (size_t)((size_t)( * /* move the contained folds one level up */moved)));
					ModernizedCProgram.vim_free(nfp);
					generatedGa_len += moved - 1/* deleteFoldRecurse() {{{2 */;
				} 
		} 
	}
	/*
	 * Delete nested folds in a fold.
	 */
	public void deleteFoldRecurse() {
		int i;
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		for (i = 0; i < generatedGa_len; ++i) {
			(((fold_T)(generatedGa_data))[i].getFd_nested()).deleteFoldRecurse();
		}
		gap/* foldMarkAdjust() {{{2 *//*
		 * Update line numbers of folds for inserted/deleted lines.
		 */.ga_clear();
	}
	/* foldMarkAdjustRecurse() {{{2 */
	public void foldMarkAdjustRecurse(Object line1, Object line2, long amount, long amount_after) {
		fold_T fp = new fold_T();
		int i;
		linenr_T last = new linenr_T();
		linenr_T top = new linenr_T();
		if ((State & -1024) && amount == (linenr_T)1 && line2 == /* In Insert mode an inserted line at the top of a fold is considered part
		     * of the fold, otherwise it isn't. */LONG_MAX) {
			top = line1 + 1;
		} else {
				top = line1;
		} 
		(Object)ModernizedCProgram.foldFind(gap, line1, /* Find the fold containing or just below "line1". */fp/*
		     * Adjust all folds below "line1" that are affected.
		     */);
		int generatedGa_len = this.getGa_len();
		Object generatedFd_top = fp.getFd_top();
		Object generatedFd_len = fp.getFd_len();
		Object generatedFd_nested = fp.getFd_nested();
		Object generatedGa_data = this.getGa_data();
		for (i = (int)(fp - (fold_T)generatedGa_data); i < generatedGa_len; ) {
			last = generatedFd_top + generatedFd_len - /* last line of fold */1;
			if (last < /* 1. fold completely above line1: nothing to do */line1) {
				continue;
			} 
			if (generatedFd_top > /* 6. fold below line2: only adjust for amount_after */line2) {
				if (amount_after == 0) {
					break;
				} 
				generatedFd_top += amount_after;
			} else {
					if (generatedFd_top >= top && last <= line2) {
						if (amount == /* 4. fold completely contained in range */LONG_MAX) {
							gap.deleteFoldEntry(i, /* Deleting lines: delete the fold completely */1);
							--/* adjust index for deletion */i;
							--fp;
						} else {
								generatedFd_top += amount;
						} 
					} else {
							if (generatedFd_top < top) {
								generatedFd_nested.foldMarkAdjustRecurse(line1 - generatedFd_top, line2 - generatedFd_top, amount, amount_after);
								if (last <= line2) {
									if (amount == /* 2. fold contains line1, line2 is below fold */LONG_MAX) {
										fp.setFd_len(line1 - generatedFd_top);
									} else {
											generatedFd_len += amount;
									} 
								} else {
										generatedFd_len += /* 3. fold contains line1 and line2 */amount_after;
								} 
							} else {
									if (amount == /* 5. fold is below line1 and contains line2; need to
											     * correct nested folds too */LONG_MAX) {
										generatedFd_nested.foldMarkAdjustRecurse(line1 - generatedFd_top, line2 - generatedFd_top, amount, amount_after + (generatedFd_top - top));
										generatedFd_len -= line2 - generatedFd_top + 1;
										fp.setFd_top(line1);
									} else {
											generatedFd_nested.foldMarkAdjustRecurse(line1 - generatedFd_top, line2 - generatedFd_top, amount, amount_after - amount);
											generatedFd_len += amount_after - amount;
											generatedFd_top += amount;
									} 
							} 
					} 
			} 
		}
	}
	public int getDeepestNestingRecurse() {
		int i;
		int level;
		int maxlevel = 0;
		fold_T fp = new fold_T();
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data;
		int generatedGa_len = this.getGa_len();
		for (i = 0; i < generatedGa_len; ++i) {
			level = fp[i].getFd_nested().getDeepestNestingRecurse() + 1;
			if (level > maxlevel) {
				maxlevel = level;
			} 
		}
		return maxlevel/* check_closed() {{{2 *//*
		 * Check if a fold is closed and update the info needed to check nested folds.
		 */;
	}
	/*
	 * Set small flags in "gap" to MAYBE.
	 */
	public void setSmallMaybe() {
		int i;
		fold_T fp = new fold_T();
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data;
		int generatedGa_len = this.getGa_len();
		for (i = 0; i < generatedGa_len; ++i) {
			fp[i].setFd_small(2/* foldCreateMarkers() {{{2 *//*
			 * Create a fold from line "start" to line "end" (inclusive) in the current
			 * window by adding markers.
			 */);
		}
	}
	public int foldInsert(int i) {
		fold_T fp = new fold_T();
		if (gap.ga_grow(1) != 1) {
			return 0;
		} 
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data + i;
		int generatedGa_len = this.getGa_len();
		if (i < generatedGa_len) {
			.memmove((byte)(fp + 1), (byte)(fp), (size_t)( * (generatedGa_len - i)));
		} 
		++generatedGa_len;
		Object generatedFd_nested = fp.getFd_nested();
		generatedFd_nested.ga_init2((int), 10);
		return 1/* foldSplit() {{{2 *//*
		 * Split the "i"th fold in "gap", which starts before "top" and ends below
		 * "bot" in two pieces, one ending above "top" and the other starting below
		 * "bot".
		 * The caller must first have taken care of any nested folds from "top" to
		 * "bot"!
		 */;
	}
	public void foldSplit(int i, Object top, Object bot) {
		fold_T fp = new fold_T();
		fold_T fp2 = new fold_T();
		garray_T gap1 = new garray_T();
		garray_T gap2 = new garray_T();
		int idx;
		int len;
		if (gap.foldInsert(i + 1) == /* The fold continues below bot, need to split it. */0) {
			return ;
		} 
		Object generatedGa_data = this.getGa_data();
		fp = (fold_T)generatedGa_data + i;
		fp[1].setFd_top(bot + 1);
		Object generatedFd_len = fp.getFd_len();
		Object generatedFd_top = fp.getFd_top();
		fp[1].setFd_len(generatedFd_len - (fp[1].getFd_top() - generatedFd_top));
		Object generatedFd_flags = fp.getFd_flags();
		fp[1].setFd_flags(generatedFd_flags);
		fp[1].setFd_small(2);
		fp.setFd_small(2);
		Object generatedFd_nested = fp.getFd_nested();
		gap1 = generatedFd_nested;
		gap2 = generatedFd_nested;
		(Object)(ModernizedCProgram.foldFind(gap1, bot + 1 - generatedFd_top, fp2));
		int generatedGa_len = gap1.getGa_len();
		len = (int)((fold_T)generatedGa_data + generatedGa_len - fp2);
		if (len > 0 && gap2.ga_grow(len) == 1) {
			for (idx = 0; idx < len; ++idx) {
				((fold_T)generatedGa_data)[idx] = fp2[idx];
				generatedFd_top -= generatedFd_top - generatedFd_top;
			}
			gap2.setGa_len(len);
			generatedGa_len -= len;
		} 
		fp.setFd_len(top - generatedFd_top);
		ModernizedCProgram.fold_changed = 1/* foldRemove() {{{2 *//*
		 * Remove folds within the range "top" to and including "bot".
		 * Check for these situations:
		 *      1  2  3
		 *      1  2  3
		 * top     2  3  4  5
		 *	   2  3  4  5
		 * bot	   2  3  4  5
		 *	      3     5  6
		 *	      3     5  6
		 *
		 * 1: not changed
		 * 2: truncate to stop above "top"
		 * 3: split in two parts, one stops above "top", other starts below "bot".
		 * 4: deleted
		 * 5: made to start below "bot".
		 * 6: not changed
		 */;
	}
	public void foldRemove(Object top, Object bot) {
		fold_T fp = ((Object)0);
		if (bot < top) {
			return ;
		} 
		Object generatedFd_top = fp.getFd_top();
		Object generatedFd_nested = fp.getFd_nested();
		Object generatedFd_len = fp.getFd_len();
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		for (; ; ) {
			if (ModernizedCProgram.foldFind(gap, top, fp) && generatedFd_top < /* Find fold that includes top or a following one. */top) {
				generatedFd_nested.foldRemove(top - generatedFd_top, bot - generatedFd_top);
				if (generatedFd_top + generatedFd_len - 1 > bot) {
					gap.foldSplit((int)(fp - (fold_T)generatedGa_data), top, /* 3: need to split it. */bot);
				} else {
						fp.setFd_len(top - generatedFd_top);
				} 
				ModernizedCProgram.fold_changed = 1;
				continue;
			} 
			if (fp >= (fold_T)(generatedGa_data) + generatedGa_len || generatedFd_top > bot) {
				break;
			} 
			if (generatedFd_top >= top) {
				ModernizedCProgram.fold_changed = /* Found an entry below top. */1;
				if (generatedFd_top + generatedFd_len - 1 > bot) {
					generatedFd_nested.foldMarkAdjustRecurse((linenr_T)0, (long)(bot - generatedFd_top), (linenr_T)LONG_MAX, (long)(generatedFd_top - bot - 1));
					generatedFd_len -= bot - generatedFd_top + 1;
					fp.setFd_top(bot + 1);
					break;
				} 
				gap.deleteFoldEntry((int)(fp - (fold_T)generatedGa_data), /* 4: Delete completely contained fold. */1);
			} 
		}
	}
	/* foldReverseOrder() {{{2 */
	public void foldReverseOrder(Object start_arg, Object end_arg) {
		fold_T left = new fold_T();
		fold_T right = new fold_T();
		fold_T tmp = new fold_T();
		linenr_T start = start_arg;
		linenr_T end = end_arg;
		Object generatedGa_data = this.getGa_data();
		for (; start < end; ) {
			left = (fold_T)generatedGa_data + start;
			right = (fold_T)generatedGa_data + end;
			tmp = left;
			left = right;
			right = tmp/* foldMoveRange() {{{2 *//*
			 * Move folds within the inclusive range "line1" to "line2" to after "dest"
			 * requires "line1" <= "line2" <= "dest"
			 *
			 * There are the following situations for the first fold at or below line1 - 1.
			 *       1  2  3  4
			 *       1  2  3  4
			 * line1    2  3  4
			 *          2  3  4  5  6  7
			 * line2       3  4  5  6  7
			 *             3  4     6  7  8  9
			 * dest           4        7  8  9
			 *                4        7  8    10
			 *                4        7  8    10
			 *
			 * In the following descriptions, "moved" means moving in the buffer, *and* in
			 * the fold array.
			 * Meanwhile, "shifted" just means moving in the buffer.
			 * 1. not changed
			 * 2. truncated above line1
			 * 3. length reduced by  line2 - line1, folds starting between the end of 3 and
			 *    dest are truncated and shifted up
			 * 4. internal folds moved (from [line1, line2] to dest)
			 * 5. moved to dest.
			 * 6. truncated below line2 and moved.
			 * 7. length reduced by line2 - dest, folds starting between line2 and dest are
			 *    removed, top is moved down by move_len.
			 * 8. truncated below dest and shifted up.
			 * 9. shifted up
			 * 10. not changed
			 */;
		}
	}
	public void foldMoveRange(Object line1, Object line2, Object dest) {
		fold_T fp = new fold_T();
		linenr_T range_len = line2 - line1 + 1;
		linenr_T move_len = dest - line2;
		int at_start = ModernizedCProgram.foldFind(gap, line1 - 1, fp);
		size_t move_start = 0;
		size_t move_end = 0;
		size_t dest_index = 0;
		Object generatedFd_top = (fp).getFd_top();
		Object generatedFd_len = (fp).getFd_len();
		Object generatedFd_nested = fp.getFd_nested();
		if (at_start) {
			if ((generatedFd_top + generatedFd_len - 1) > dest/* Case 4
				    * don't have to change this fold, but have to move nested folds.
				    */) {
				generatedFd_nested.foldMoveRange(line1 - generatedFd_top, line2 - generatedFd_top, dest - generatedFd_top);
				return ;
			}  else if ((generatedFd_top + generatedFd_len - 1) > line2/* Case 3
				     * Remove nested folds between line1 and line2 & reduce the
				     * length of fold by "range_len".
				     * Folds after this one must be dealt with.
				     */) {
				generatedFd_nested.foldMarkAdjustRecurse(line1 - generatedFd_top, line2 - generatedFd_top, LONG_MAX, -range_len);
				generatedFd_len -= range_len;
			} else {
					fp.truncate_fold(line1 - /* Case 2 truncate fold, folds after this one must be dealt with. */1);
			} 
			fp = fp + /* Look at the next fold, and treat that one as if it were the first
				 * after  "line1" (because now it is). */1;
		} 
		Object generatedGa_data = (gap).getGa_data();
		int generatedGa_len = (gap).getGa_len();
		if (!((fp) < ((fold_T)generatedGa_data + generatedGa_len)) || generatedFd_top > dest/* Case 10
			 * No folds after "line1" and before "dest"
			 */) {
			return ;
		}  else if (generatedFd_top > line2) {
			for (; ((fp) < ((fold_T)generatedGa_data + generatedGa_len)) && (generatedFd_top + generatedFd_len - 1) <= dest; fp++) {
				generatedFd_top -= /* Case 9. (for all case 9's) -- shift up. */range_len;
			}
			if (((fp) < ((fold_T)generatedGa_data + generatedGa_len)) && generatedFd_top <= dest) {
				fp.truncate_fold(/* Case 8. -- ensure truncated at dest, shift up */dest);
				generatedFd_top -= range_len;
			} 
			return ;
		}  else if ((generatedFd_top + generatedFd_len - 1) > dest) {
			generatedFd_nested.foldMarkAdjustRecurse(line2 + 1 - generatedFd_top, /* Case 7 -- remove nested folds and shrink */dest - generatedFd_top, LONG_MAX, -move_len);
			generatedFd_len -= move_len;
			generatedFd_top += move_len;
			return ;
		} 
		move_start = ((size_t)(fp - ((fold_T)generatedGa_data)));
		for (; ((fp) < ((fold_T)generatedGa_data + generatedGa_len)) && generatedFd_top <= dest; fp++) {
			if (generatedFd_top <= line2) {
				if ((generatedFd_top + generatedFd_len - 1) > /* 1. 2. or 3. */line2) {
					fp.truncate_fold(/* 2. or 3., truncate before moving */line2);
				} 
				generatedFd_top += move_len;
				continue;
			} 
			if (move_end == /* Record index of the first fold after the moved range. */0) {
				move_end = ((size_t)(fp - ((fold_T)generatedGa_data)));
			} 
			if ((generatedFd_top + generatedFd_len - 1) > dest) {
				fp.truncate_fold(dest);
			} 
			generatedFd_top -= range_len;
		}
		dest_index = ((size_t)(fp - ((fold_T)generatedGa_data)));
		if (move_end == 0/* There are no folds after those moved, hence no folds have been moved
			 * out of order. */) {
			return ;
		} 
		gap.foldReverseOrder((linenr_T)move_start, (linenr_T)dest_index - 1);
		gap.foldReverseOrder((linenr_T)move_start, (linenr_T)(move_start + dest_index - move_end - 1));
		gap.foldReverseOrder((linenr_T)(move_start + dest_index - move_end), (linenr_T)(dest_index - 1))/* foldMerge() {{{2 */;/* foldMerge() {{{2 */
	}
	public void may_add_state_char(Object include, int c) {
		if (include == ((Object)0) || ModernizedCProgram.vim_strchr(include, c) != ((Object)0)) {
			gap.ga_append(c/*
			 * "state()" function
			 */);
		} 
	}
	public int mch_expandpath(Object path, int flags) {
		int i;
		int cnt = 0;
		byte result;
		ModernizedCProgram.vms_match_num = 0/* the result from the decc$translate_vms needs to be handled */;
		result = .decc$translate_vms(ModernizedCProgram.vms_fixfilename(/* otherwise it might create ACCVIO error in decc$to_vms      */path));
		if ((int)result == 0 || (int)result == -1) {
			cnt = 0;
		} else {
				cnt = .decc$to_vms(result, vms_wproc, 1, (flags & -1024 ? 0 : /*allow_wild*//*allow directory*/1));
		} 
		if (cnt > 0) {
			cnt = ModernizedCProgram.vms_match_num;
		} 
		for (i = 0; i < cnt; i++) {
			if (ModernizedCProgram.mch_getperm(ModernizedCProgram.vms_fmatch[i]) >= /* add existing file */0) {
				gap.addfile(ModernizedCProgram.vms_fmatch[i], flags);
			} 
		}
		return cnt/*
		 * attempt to translate a mixed unix-vms file specification to pure vms
		 */;
		return .unix_expandpath(gap, path, 0, flags, /* EW_* flags */0/*
		 * mch_expand_wildcards() - this code does wild-card pattern matching using
		 * the shell
		 *
		 * return OK for success, FAIL for error (you may lose some memory) and put
		 * an error message in *file.
		 *
		 * num_pat is number of input patterns
		 * pat is array of pointers to input patterns
		 * num_file is pointer to number of matched file names
		 * file is pointer to array of pointers to matched file names
		 */);
		// EW_* flagsreturn gap.dos_expandpath(path, 0, flags, 0);// MSWIN/*
		 * Unix style wildcard expansion code.
		 * It's here because it's used both for Unix and Mac.
		 */
		/* EW_* flags */AnchorPath Anchor = new AnchorPath();
		LONG Result = new LONG();
		char_u starbuf = new char_u();
		char_u sp = new char_u();
		char_u dp = new char_u();
		int start_len;
		int matches;
		int generatedGa_len = this.getGa_len();
		start_len = generatedGa_len;
		Anchor = ModernizedCProgram.alloc_clear(( + (true)));
		if (Anchor == ((Object)0)) {
			return 0;
		} 
		Anchor.setAnchorPath((/* ap_Length not supported anymore */true));
		Anchor.setAnchorPath(APF_DoDot | /* allow '.' for current dir *//* allow '.' for current dir */APF_DoWild);
		if (ModernizedCProgram.dos2) {
			starbuf = ModernizedCProgram.alloc(2 * .strlen((byte)(pat)) + /* hack to replace '*' by '#?' */1);
			if (starbuf == ((Object)0)) {
				;
			} 
			for (; sp; ++sp) {
				if (sp == (byte)'*') {
					dp++ = (byte)'#';
					dp++ = (byte)'?';
				} else {
						dp++ = sp;
				} 
			}
			dp = (byte)'\000';
			Result = .MatchFirst(()starbuf, Anchor);
			ModernizedCProgram.vim_free(starbuf);
		} else {
				Result = .FindFirst((byte)pat, Anchor);
		} 
		Object generatedAnchorPath = Anchor.getAnchorPath();
		while (Result == /*
		     * Loop to get all matches.
		     */0) {
			gap.addfile((char_u)generatedAnchorPath, flags);
			if (ModernizedCProgram.dos2) {
				Result = .MatchNext(Anchor);
			} else {
					Result = .FindNext(Anchor);
			} 
		}
		matches = generatedGa_len - start_len;
		if (Result == -1024) {
			ModernizedCProgram.emsg(((byte)("ANCHOR_BUF_SIZE too small.")));
		}  else if (matches == 0 && Result != -1024 && Result != ERROR_DEVICE_NOT_MOUNTED && Result != ERROR_NO_MORE_ENTRIES) {
			ModernizedCProgram.emsg(((byte)("I/O ERROR"/*
			     * Sort the files for this pattern.
			     */)));
		} 
		Object generatedGa_data = this.getGa_data();
		if (matches) {
			.qsort((Object)(((char_u)generatedGa_data) + start_len), (size_t)matches, , ModernizedCProgram.sortcmp);
		} 
		if (/* Free the wildcard stuff */ModernizedCProgram.dos2) {
			.MatchEnd(Anchor);
		} else {
				.FreeAnchorChain(Anchor);
		} 
		return matches;
	}
	public int store_loop_line(Object line) {
		if (gap.ga_grow(1) == 0) {
			return 0;
		} 
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		((wcmd_T)(generatedGa_data))[generatedGa_len].setLine(ModernizedCProgram.vim_strsave(line));
		((wcmd_T)(generatedGa_data))[generatedGa_len].setLnum(sourcing_lnum);
		++generatedGa_len;
		return 1/*
		 * Free the lines stored for a ":while" or ":for" loop.
		 */;
	}
	public void free_cmdlines() {
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		while (generatedGa_len > 0) {
			ModernizedCProgram.vim_free(((wcmd_T)(generatedGa_data))[generatedGa_len - 1].getLine());
			--generatedGa_len;
		}
	}
	public int match_checkcompoundpattern(Object ptr, int wlen) {
		/* &sl_comppat */int i;
		char_u p = new char_u();
		int len;
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		for (i = 0; i + 1 < generatedGa_len; i += 2) {
			p = ((char_u)generatedGa_data)[i + 1];
			if (.strncmp((byte)(ptr + wlen), (byte)(p), (size_t)(.strlen((byte)(p)))) == 0) {
				p = ((char_u)generatedGa_data)[/* Second part matches at start of following compound word, now
					     * check if first part matches at end of previous word. */i];
				len = (int).strlen((byte)(p));
				if (len <= wlen && .strncmp((byte)(ptr + wlen - len), (byte)(p), (size_t)(len)) == 0) {
					return 1;
				} 
			} 
		}
		return 0/*
		 * Return TRUE if "flags" is a valid sequence of compound flags and "word"
		 * does not have too many syllables.
		 */;
	}
	public int expand_backtick(Object pat, int flags) {
		// EW_* flagschar_u p = new char_u();
		char_u cmd = new char_u();
		char_u buffer = new char_u();
		int cnt = 0;
		int i;
		// Create the command: lop off the backticks.// Create the command: lop off the backticks.cmd = ModernizedCProgram.vim_strnsave(pat + 1, (int).strlen((byte)(pat)) - 2);
		if (cmd == ((Object)0)) {
			return -1;
		} 
		// `={expr}`: Expand expressionif (cmd == (byte)'=') {
			buffer = ModernizedCProgram.eval_to_string(cmd + 1, p, 1);
		} else {
				buffer = ModernizedCProgram.get_cmd_output(cmd, ((Object)0), (flags & -1024) ? 16 : 0, ((Object)0));
		} 
		ModernizedCProgram.vim_free(cmd);
		if (buffer == ((Object)0)) {
			return -1;
		} 
		cmd = buffer;
		while (cmd != (byte)'\000') {
			cmd = ModernizedCProgram.skipwhite(cmd);
			p = cmd;
			while (p != (byte)'\000' && p != (byte)'\r' && p != (byte)'\n') {
				++p;
			}
			if (p > cmd) {
				i = p;
				p = (byte)'\000';
				gap.addfile(cmd, flags);
				p = i;
				++cnt;
			} 
			cmd = p;
			while (cmd != (byte)'\000' && (cmd == (byte)'\r' || cmd == (byte)'\n')) {
				++cmd;
			}
		}
		ModernizedCProgram.vim_free(buffer);
		return cnt/*
		 * File name expansion code for MS-DOS, Win16 and Win32.  It's here because
		 * it's shared between these systems.
		 */;// VIM_BACKTICK
	}
	public int dos_expandpath(Object path, int wildoff, int flags, int didstar) {
		// EW_* flags// expanded "**" once alreadychar_u buf = new char_u();
		char_u path_end = new char_u();
		char_u p = new char_u();
		char_u s = new char_u();
		char_u e = new char_u();
		int generatedGa_len = this.getGa_len();
		int start_len = generatedGa_len;
		char_u pat = new char_u();
		regmatch_T regmatch = new regmatch_T();
		int starts_with_dot;
		int matches;
		int len;
		int starstar = 0;
		// depth for "**" expansionint stardepth = 0;
		HANDLE hFind = (HANDLE)(true);
		WIN32_FIND_DATAW wfb = new WIN32_FIND_DATAW();
		// UCS-2 name, NULL when not used.WCHAR wn = ((Object)0);
		char_u matchname = new char_u();
		int ok;
		// Expanding "**" may take a long time, check for CTRL-C.if (stardepth > 0) {
			ModernizedCProgram.ui_breakcheck();
			if (got_int) {
				return 0;
			} 
		} 
		// Make room for file name.  When doing encoding conversion the actual// length may be quite a bit longer, thus use the maximum possible length.// Make room for file name.  When doing encoding conversion the actual// length may be quite a bit longer, thus use the maximum possible length.buf = ModernizedCProgram.alloc(1024);
		if (buf == ((Object)0)) {
			return 0/*
			     * Find the first part in the path name that contains a wildcard or a ~1.
			     * Copy it into buf, including the preceding characters.
			     */;
		} 
		p = buf;
		s = buf;
		e = ((Object)0);
		path_end = path;
		while (path_end != (byte)'\000') {
			if (path_end >= path + wildoff && ModernizedCProgram.rem_backslash(path_end)) {
				p++ = path_end++;
			}  else if (path_end == (byte)'\\' || path_end == (byte)':' || path_end == (byte)'/') {
				if (e != ((Object)0)) {
					break;
				} 
				s = p + 1;
			}  else if (path_end >= path + wildoff && ModernizedCProgram.vim_strchr((char_u)"*?[~", path_end) != ((Object)0)) {
				e = p;
			} 
			if (has_mbyte) {
				len = .UNRECOGNIZEDFUNCTIONNAME(path_end);
				.strncpy((byte)(p), (byte)(path_end), (size_t)(len));
				p += len;
				path_end += len;
			} else {
					p++ = path_end++;
			} 
		}// May ignore a wildcard that has a backslash before it; it will
		e = p;
		e = (byte)'\000'// now we have one wildcard component between s and e;// now we have one wildcard component between s and e
		// Remove backslashes between "wildoff" and the start of the wildcard// component.for (p = buf + wildoff; p < s; ++p) {
			if (ModernizedCProgram.rem_backslash(p)) {
				.memmove((byte)((p)), (byte)((p + 1)), (size_t)(.strlen((byte)(p + 1)) + 1));
				--e;
				--s;
			} 
		}
		// Check for "**" between "s" and "e".for (p = s; p < e; ++p) {
			if (p[0] == (byte)'*' && p[1] == (byte)'*') {
				starstar = 1;
			} 
		}
		starts_with_dot = s == (byte)'.';
		pat = ModernizedCProgram.file_pat_to_reg_pat(s, e, ((Object)0), 0);
		if (pat == ((Object)0)) {
			ModernizedCProgram.vim_free(buf);
			return 0;
		} 
		// compile the regexp into a programif (flags & (-1024 | -1024)) {
			++emsg_silent;
		} 
		// Always ignore case// Always ignore caseregmatch.setRm_ic(1);
		regprog regprog = new regprog();
		regmatch.setRegprog(regprog.vim_regcomp(pat, 1));
		if (flags & (-1024 | -1024)) {
			--emsg_silent;
		} 
		ModernizedCProgram.vim_free(pat);
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedRegprog == ((Object)0) && (flags & -1024) == 0) {
			ModernizedCProgram.vim_free(buf);
			return 0;
		} 
		// remember the pattern or file name being looked for// remember the pattern or file name being looked formatchname = ModernizedCProgram.vim_strsave(s)// If "**" is by itself, this is the first time we encounter it and more;// If "**" is by itself, this is the first time we encounter it and more
		// is following then find matches without any directory.if (!didstar && stardepth < 100 && starstar && e - s == 2 && path_end == (byte)'/') {
			.strcpy((byte)(s), (byte)(path_end + 1));
			++stardepth;
			(Object)gap.dos_expandpath(buf, (int)(s - buf), flags, 1);
			--stardepth;
		} 
		// Scan all files in the directory with "dir/ *.*"// Scan all files in the directory with "dir/ *.*".strcpy((byte)(s), (byte)("*.*"));
		wn = ModernizedCProgram.enc_to_utf16(buf, ((Object)0));
		if (wn != ((Object)0)) {
			hFind = .FindFirstFileW(wn, wfb);
		} 
		ok = (hFind != (HANDLE)(true));
		Object generatedCFileName = wfb.getCFileName();
		while (ok) {
			p = ModernizedCProgram.utf16_to_enc(generatedCFileName, ((Object)0));
			if (p == ((Object)0)) {
				break;
			} 
			if ((p[0] != (byte)'.' || starts_with_dot || ((flags & -1024) && p[1] != (byte)'\000' && (p[1] != (byte)'.' || p[2] != (byte)'\000'))) && (matchname == ((Object)0) || (generatedRegprog != ((Object)0) && regmatch.vim_regexec(p, (colnr_T)0)) || ((flags & -1024) && ModernizedCProgram.vim_fnamencmp((char_u)(path + (s - buf)), (char_u)(p), (size_t)(e - s)) == 0))) {
				.strcpy((byte)(s), (byte)(p));
				len = (int).strlen((byte)(buf));
				if (starstar && stardepth < 100) {
					.strcpy((byte)(buf + len), (byte)("/**"));
					.strcpy((byte)(buf + len + 3), (byte)(path_end));
					++stardepth;
					(Object)gap.dos_expandpath(buf, len + 1, flags, 1);
					--stardepth;
				} 
				.strcpy((byte)(buf + len), (byte)(path_end));
				if (ModernizedCProgram.mch_has_exp_wildcard(path_end)) {
					(Object)gap.dos_expandpath(buf, len + 1, flags, 0);
				} else {
						if (path_end != 0) {
							ModernizedCProgram.backslash_halve(buf + len + 1);
						} 
						if (ModernizedCProgram.mch_getperm(buf) >= 0) {
							gap.addfile(buf, flags);
						} 
				} 
			} 
			ModernizedCProgram.vim_free(p);
			ok = .FindNextFileW(hFind, wfb);
			if (!ok && matchname != ((Object)0) && generatedGa_len == start_len) {
				.strcpy((byte)(s), (byte)(matchname));
				.FindClose(hFind);
				ModernizedCProgram.vim_free(wn);
				wn = ModernizedCProgram.enc_to_utf16(buf, ((Object)0));
				if (wn != ((Object)0)) {
					hFind = .FindFirstFileW(wn, wfb);
				} else {
						hFind = (HANDLE)(true);
				} 
				ok = (hFind != (HANDLE)(true));
				do {
					if ((matchname) != ((Object)0)) {
						ModernizedCProgram.vim_free(matchname);
						(matchname) = ((Object)0);
					} 
				} while (0);
			} 
		}
		.FindClose(hFind);
		ModernizedCProgram.vim_free(wn);
		ModernizedCProgram.vim_free(buf);
		generatedRegprog.vim_regfree();
		ModernizedCProgram.vim_free(matchname);
		matches = generatedGa_len - start_len;
		Object generatedGa_data = this.getGa_data();
		if (matches > 0) {
			.qsort(((char_u)generatedGa_data) + start_len, (size_t)matches, , pstrcmp);
		} 
		return matches;
	}
	public void addfile(Object f, int flags) {
		char_u p = new char_u();
		int isdir;
		stat_T sb = new stat_T();
		// if the file/dir/link doesn't exist, may not add itif (!(flags & -1024) && ((flags & -1024) ? ((sb)).vim_stat((((byte)f))) < 0 : ModernizedCProgram.mch_getperm(f) < 0)) {
			return ;
		} 
		// if the file/dir contains illegal characters, don't add itif (ModernizedCProgram.vim_strpbrk(f, (char_u)"\"*?><|") != ((Object)0)) {
			return ;
		} 
		isdir = ModernizedCProgram.mch_isdir(f);
		if ((isdir && !(flags & -1024)) || (!isdir && !(flags & -1024))) {
			return ;
		} 
		// When invoked from expand_shellcmd() do not use $PATH.if (!isdir && (flags & -1024) && !ModernizedCProgram.mch_can_exe(f, ((Object)0), !(flags & -1024))) {
			return ;
		} 
		// Make room for another item in the file list.if (gap.ga_grow(1) == 0) {
			return ;
		} 
		p = ModernizedCProgram.alloc(.strlen((byte)(f)) + 1 + isdir);
		if (p == ((Object)0)) {
			return ;
		} 
		.strcpy((byte)(p), (byte)(f));
		ModernizedCProgram.slash_adjust(p/*
		     * Append a slash or backslash after directory names if none is present.
		     */);
		if (isdir && (flags & -1024)) {
			ModernizedCProgram.add_pathsep(p);
		} 
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		((char_u)generatedGa_data)[generatedGa_len++] = p/*
		 * Free the list of files returned by expand_wildcards() or other expansion
		 * functions.
		 */;
	}
	/* filename */
	public void write_string(Object str) {
		char_u res = str;
		char_u[] numbuf = new char_u();
		if (res == ((Object)0)) {
			gap.ga_concat((char_u)"\"\"");
		} else {
				gap.ga_append((byte)'"');
				while (res != (byte)'\000') {
					int c;
					c = ModernizedCProgram.utf_ptr2char(/* always use utf-8 encoding, ignore 'encoding' */res);
					switch (c) {
					case -1024:
							gap.ga_append((byte)'\\');
							gap.ga_append((byte)'b');
							break;
					case -1024:
							gap.ga_append((byte)'\\');
							gap.ga_append((byte)'f');
							break;
					case /* \ */-1024:
							gap.ga_append((byte)'\\');
							gap.ga_append(c);
							break;
					case -1024:
							gap.ga_append((byte)'\\');
							gap.ga_append((byte)'n');
							break;
					case -1024:
							gap.ga_append((byte)'\\');
							gap.ga_append((byte)'r');
							break;
					case -1024:
							gap.ga_append((byte)'\\');
							gap.ga_append((byte)'t');
							break;
					case /* " */-1024:
					default:
							if (c >= -1024) {
								numbuf[ModernizedCProgram.utf_char2bytes(c, numbuf)] = (byte)'\000';
								gap.ga_concat(numbuf);
							} else {
									ModernizedCProgram.vim_snprintf((byte)numbuf, 65, "\\u%04lx", (long)c);
									gap.ga_concat(numbuf);
							} 
					}
					res += ModernizedCProgram.utf_ptr2len(res);
				}
				gap.ga_append((byte)'"');
		} 
	}
	public int find_tagfunc_tags(Object pat, int match_count, int flags, Object buf_ffname) {
		// flags from find_tags (TAG_*)// name of buffer for prioritypos_T save_pos = new pos_T();
		list_T taglist = new list_T();
		listitem_T item = new listitem_T();
		int ntags = 0;
		int result = 0;
		typval_T[] args = new typval_T();
		typval_T rettv = new typval_T();
		char_u[] flagString = new char_u();
		dict_T d = new dict_T();
		taggy_T tag = ModernizedCProgram.curwin.getW_tagstack()[ModernizedCProgram.curwin.getW_tagstackidx()];
		Object generatedB_p_tfu = curbuf.getB_p_tfu();
		if (generatedB_p_tfu == (byte)'\000') {
			return 0;
		} 
		args[0].setV_type(.VAR_STRING);
		args[0].getVval().setV_string(pat);
		args[1].setV_type(.VAR_STRING);
		args[1].getVval().setV_string(flagString);
		dictvar_S dictvar_S = new dictvar_S();
		// create 'info' dict argumentif ((d = dictvar_S.dict_alloc_lock(2)) == ((Object)0)) {
			return 0;
		} 
		Object generatedUser_data = tag.getUser_data();
		if (generatedUser_data != ((Object)0)) {
			d.dict_add_string("user_data", generatedUser_data);
		} 
		if (buf_ffname != ((Object)0)) {
			d.dict_add_string("buf_ffname", buf_ffname);
		} 
		int generatedDv_refcount = d.getDv_refcount();
		++generatedDv_refcount;
		args[2].setV_type(.VAR_DICT);
		args[2].getVval().setV_dict(d);
		args[3].setV_type(.VAR_UNKNOWN);
		ModernizedCProgram.vim_snprintf((byte)flagString, , "%s%s", g_tag_at_cursor ? "c" : "", flags & 64 ? "i" : "");
		save_pos = ModernizedCProgram.curwin.getW_cursor();
		result = args.call_vim_function(generatedB_p_tfu, 3, rettv);
		// restore the cursor position// restore the cursor positionModernizedCProgram.curwin.setW_cursor(save_pos);
		--generatedDv_refcount;
		if (result == 0) {
			return 0;
		} 
		Object generatedV_type = rettv.getV_type();
		Object generatedVval = rettv.getVval();
		if (generatedV_type == .VAR_SPECIAL && generatedVval.getV_number() == -1024) {
			rettv.clear_tv();
			return 2;
		} 
		if (generatedV_type != .VAR_LIST || !generatedVval.getV_list()) {
			rettv.clear_tv();
			ModernizedCProgram.emsg(((byte)(ModernizedCProgram.tfu_inv_ret_msg)));
			return 0;
		} 
		taglist = generatedVval.getV_list();
		 generatedLi_tv = item.getLi_tv();
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		listitem_S generatedLi_next = item.getLi_next();
		listitem_S generatedLv_first = taglist.getLv_first();
		for (item = generatedLv_first; item != ((Object)0); item = generatedLi_next) {
			char_u mfp = new char_u();
			char_u res_name = new char_u();
			char_u res_fname = new char_u();
			char_u res_cmd = new char_u();
			char_u res_kind = new char_u();
			int len;
			dict_iterator_T iter = new dict_iterator_T();
			char_u dict_key = new char_u();
			typval_T tv = new typval_T();
			int has_extra = 0;
			int name_only = flags & 2;
			if (generatedV_type != .VAR_DICT) {
				ModernizedCProgram.emsg(((byte)(ModernizedCProgram.tfu_inv_ret_msg)));
				break;
			} 
			len = 3;
			res_name = ((Object)0);
			res_fname = ((Object)0);
			res_cmd = ((Object)0);
			res_kind = ((Object)0);
			generatedLi_tv.dict_iterate_start(iter);
			while (((Object)0) != (dict_key = iter.dict_iterate_next(tv))) {
				if (generatedV_type != .VAR_STRING || generatedVval.getV_string() == ((Object)0)) {
					continue;
				} 
				len += (int).strlen((byte)(generatedVval.getV_string())) + 1;
				if (!.strcmp((byte)(dict_key), (byte)("name"))) {
					res_name = generatedVval.getV_string();
					continue;
				} 
				if (!.strcmp((byte)(dict_key), (byte)("filename"))) {
					res_fname = generatedVval.getV_string();
					continue;
				} 
				if (!.strcmp((byte)(dict_key), (byte)("cmd"))) {
					res_cmd = generatedVval.getV_string();
					continue;
				} 
				has_extra = 1;
				if (!.strcmp((byte)(dict_key), (byte)("kind"))) {
					res_kind = generatedVval.getV_string();
					continue;
				} 
				len += (int).strlen((byte)(dict_key)) + 1;
			}
			if (has_extra) {
				len += 2;
			} 
			if (!res_name || !res_fname || !res_cmd) {
				ModernizedCProgram.emsg(((byte)(ModernizedCProgram.tfu_inv_ret_msg)));
				break;
			} 
			if (name_only) {
				mfp = ModernizedCProgram.vim_strsave(res_name);
			} else {
					mfp = ModernizedCProgram.alloc( + len + 1);
			} 
			if (mfp == ((Object)0)) {
				continue;
			} 
			if (!name_only) {
				char_u p = mfp;
				p++ = 2 + 1;
				p++ = -1024;
				p++ = -1024;
				.strcpy((byte)(p), (byte)(res_name));
				p += .strlen((byte)(p));
				p++ = (byte)'\011';
				.strcpy((byte)(p), (byte)(res_fname));
				p += .strlen((byte)(p));
				p++ = (byte)'\011';
				.strcpy((byte)(p), (byte)(res_cmd));
				p += .strlen((byte)(p));
				if (has_extra) {
					.strcpy((byte)(p), (byte)(";\""));
					p += .strlen((byte)(p));
					if (res_kind) {
						p++ = (byte)'\011';
						.strcpy((byte)(p), (byte)(res_kind));
						p += .strlen((byte)(p));
					} 
					generatedLi_tv.dict_iterate_start(iter);
					while (((Object)0) != (dict_key = iter.dict_iterate_next(tv))) {
						if (generatedV_type != .VAR_STRING || generatedVval.getV_string() == ((Object)0)) {
							continue;
						} 
						if (!.strcmp((byte)(dict_key), (byte)("name"))) {
							continue;
						} 
						if (!.strcmp((byte)(dict_key), (byte)("filename"))) {
							continue;
						} 
						if (!.strcmp((byte)(dict_key), (byte)("cmd"))) {
							continue;
						} 
						if (!.strcmp((byte)(dict_key), (byte)("kind"))) {
							continue;
						} 
						p++ = (byte)'\011';
						.strcpy((byte)(p), (byte)(dict_key));
						p += .strlen((byte)(p));
						.strcpy((byte)(p), (byte)(":"));
						p += .strlen((byte)(p));
						.strcpy((byte)(p), (byte)(generatedVval.getV_string()));
						p += .strlen((byte)(p));
					}
				} 
			} 
			if (ga.ga_grow(1) == 1) {
				((char_u)(generatedGa_data))[generatedGa_len++] = mfp;
				++ntags;
				result = 1;
			} else {
					ModernizedCProgram.vim_free(mfp);
					break;
			} 
		}
		rettv.clear_tv();
		match_count = ntags;
		return result/*
		 * find_tags() - search for tags in tags files
		 *
		 * Return FAIL if search completely failed (*num_matches will be 0, *matchesp
		 * will be NULL), OK otherwise.
		 *
		 * There is a priority in which type of tag is recognized.
		 *
		 *  6.	A static or global tag with a full matching tag for the current file.
		 *  5.	A global tag with a full matching tag for another file.
		 *  4.	A static tag with a full matching tag for another file.
		 *  3.	A static or global tag with an ignore-case matching tag for the
		 *	current file.
		 *  2.	A global tag with an ignore-case matching tag for another file.
		 *  1.	A static tag with an ignore-case matching tag for another file.
		 *
		 * Tags in an emacs-style tags file are always global.
		 *
		 * flags:
		 * TAG_HELP	  only search for help tags
		 * TAG_NAMES	  only return name of tag
		 * TAG_REGEXP	  use "pat" as a regexp
		 * TAG_NOIC	  don't always ignore case
		 * TAG_KEEP_LANG  keep language
		 * TAG_CSCOPE	  use cscope results for tags
		 * TAG_NO_TAGFUNC do not call the 'tagfunc' function
		 */;
	}
	// pattern supplied to the user-defined function
	// the tags will be placed here
	// here the number of tags found will be placed
	public int dbg_parsearg(Object arg) {
		// either &dbg_breakp or &prof_gachar_u p = arg;
		char_u q = new char_u();
		debuggy bp = new debuggy();
		int here = 0;
		if (gap.ga_grow(1) == 0) {
			return 0;
		} 
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		bp = (((debuggy)generatedGa_data)[generatedGa_len]);
		Object generatedB_ffname = curbuf.getB_ffname();
		// Find "func" or "file".if (.strncmp((byte)(p), (byte)("func"), (size_t)(true)) == 0) {
			bp.setDbg_type(1);
		}  else if (.strncmp((byte)(p), (byte)("file"), (size_t)(true)) == 0) {
			bp.setDbg_type(2);
		}  else if (gap != ModernizedCProgram.prof_ga && .strncmp((byte)(p), (byte)("here"), (size_t)(true)) == 0) {
			if (generatedB_ffname == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_noname)));
				return 0;
			} 
			bp.setDbg_type(2);
			here = 1;
		}  else if (gap != ModernizedCProgram.prof_ga && .strncmp((byte)(p), (byte)("expr"), (size_t)(true)) == 0) {
			bp.setDbg_type(3);
		} else {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), p);
				return 0;
		} 
		p = ModernizedCProgram.skipwhite(p + 4);
		// Find optional line number.if (here) {
			bp.setDbg_lnum(ModernizedCProgram.curwin.getW_cursor().getLnum());
		}  else if (gap != ModernizedCProgram.prof_ga && ((int)(p) - (byte)'0' < 10)) {
			bp.setDbg_lnum(ModernizedCProgram.getdigits(p));
			p = ModernizedCProgram.skipwhite(p);
		} else {
				bp.setDbg_lnum(0);
		} 
		int generatedDbg_type = bp.getDbg_type();
		// Find the function or file name.  Don't accept a function name with ().if ((!here && p == (byte)'\000') || (here && p != (byte)'\000') || (generatedDbg_type == 1 && .strstr((byte)p, "()") != ((Object)0))) {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), arg);
			return 0;
		} 
		Object generatedDbg_name = bp.getDbg_name();
		if (generatedDbg_type == 1) {
			bp.setDbg_name(ModernizedCProgram.vim_strsave(p));
		}  else if (here) {
			bp.setDbg_name(ModernizedCProgram.vim_strsave(generatedB_ffname));
		}  else if (generatedDbg_type == 3) {
			bp.setDbg_name(ModernizedCProgram.vim_strsave(p));
			if (generatedDbg_name != ((Object)0)) {
				bp.setDbg_val(ModernizedCProgram.eval_expr(generatedDbg_name, ((Object)0)));
			} 
		} else {
				q = ModernizedCProgram.expand_env_save(p);
				if (q == ((Object)0)) {
					return 0;
				} 
				p = ModernizedCProgram.expand_env_save(q);
				ModernizedCProgram.vim_free(q);
				if (p == ((Object)0)) {
					return 0;
				} 
				if (p != (byte)'*') {
					bp.setDbg_name(ModernizedCProgram.fix_fname(p));
					ModernizedCProgram.vim_free(p);
				} else {
						bp.setDbg_name(p);
				} 
		} 
		if (generatedDbg_name == ((Object)0)) {
			return 0;
		} 
		return 1/*
		 * ":breakadd".  Also used for ":profile".
		 */;
	}
	public Object debuggy_find(int file, Object fname, Object after, int fp) {
		// either &dbg_breakp or &prof_ga// if not NULL: return forceitdebuggy bp = new debuggy();
		int i;
		linenr_T lnum = 0;
		char_u name = fname;
		int prev_got_int;
		int generatedGa_len = this.getGa_len();
		// Return quickly when there are no breakpoints.if (generatedGa_len == 0) {
			return (linenr_T)0;
		} 
		// Replace K_SNR in function name with "<SNR>".if (!file && fname[0] == (true)) {
			name = ModernizedCProgram.alloc(.strlen((byte)(fname)) + 3);
			if (name == ((Object)0)) {
				name = fname;
			} else {
					.strcpy((byte)(name), (byte)("<SNR>"));
					.strcpy((byte)(name + 5), (byte)(fname + 3));
			} 
		} 
		Object generatedGa_data = this.getGa_data();
		int generatedDbg_type = bp.getDbg_type();
		Object generatedDbg_lnum = bp.getDbg_lnum();
		regprog generatedDbg_prog = bp.getDbg_prog();
		int generatedDbg_forceit = bp.getDbg_forceit();
		Object generatedDbg_name = bp.getDbg_name();
		 generatedDbg_val = bp.getDbg_val();
		Object generatedVval = tv.getVval();
		for (i = 0; i < generatedGa_len; ++i) {
			bp = (((debuggy)generatedGa_data)[i]);
			if (((generatedDbg_type == 2) == file && generatedDbg_type != 3 && (gap == ModernizedCProgram.prof_ga || (generatedDbg_lnum > after && (lnum == 0 || generatedDbg_lnum < lnum))))) {
				prev_got_int = got_int;
				got_int = 0;
				if (generatedDbg_prog.vim_regexec_prog(0, name, (colnr_T)0)) {
					lnum = generatedDbg_lnum;
					if (fp != ((Object)0)) {
						fp = generatedDbg_forceit;
					} 
				} 
				got_int |=  prev_got_int;
			}  else if (generatedDbg_type == 3) {
				typval_T tv = new typval_T();
				int line = 0;
				prev_got_int = got_int;
				got_int = 0;
				tv = ModernizedCProgram.eval_expr(generatedDbg_name, ((Object)0));
				if (tv != ((Object)0)) {
					if (generatedDbg_val == ((Object)0)) {
						ModernizedCProgram.debug_oldval = ((Object)0).typval_tostring();
						bp.setDbg_val(tv);
						ModernizedCProgram.debug_newval = generatedDbg_val.typval_tostring();
						ModernizedCProgram.line = 1;
					} else {
							if (tv.typval_compare(generatedDbg_val, .TYPE_EQUAL, 1, 0) == 1 && generatedVval.getV_number() == 0) {
								typval_T v = new typval_T();
								ModernizedCProgram.line = 1;
								ModernizedCProgram.debug_oldval = generatedDbg_val.typval_tostring();
								v = ModernizedCProgram.eval_expr(generatedDbg_name, ((Object)0));
								ModernizedCProgram.debug_newval = v.typval_tostring();
								generatedDbg_val.free_tv();
								bp.setDbg_val(v);
							} 
							tv.free_tv();
					} 
				}  else if (generatedDbg_val != ((Object)0)) {
					ModernizedCProgram.debug_oldval = generatedDbg_val.typval_tostring();
					ModernizedCProgram.debug_newval = ((Object)0).typval_tostring();
					generatedDbg_val.free_tv();
					bp.setDbg_val(((Object)0));
					ModernizedCProgram.line = 1;
				} 
				if (ModernizedCProgram.line) {
					lnum = after > 0 ? after : 1;
					break;
				} 
				got_int |=  prev_got_int;
			} 
		}// Skip entries that are not useful or are for a line that is beyond
		if (name != fname) {
			ModernizedCProgram.vim_free(name);
		} 
		return lnum/*
		 * Called when a breakpoint was encountered.
		 */;
	}
	/*
	 * Parse the arguments of ":profile", ":breakadd" or ":breakdel" and put them
	 * in the entry just after the last one in dbg_breakp.  Note that "dbg_name"
	 * is allocated.
	 * Returns FAIL for failure.
	 */
	// TRUE for a file, FALSE for a function
	// file or function name
	// after this line number
	public int get_arglist(Object str, int escaped) {
		gap.ga_init2((int), 20);
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		while (str != (byte)'\000') {
			if (gap.ga_grow(1) == 0) {
				gap.ga_clear();
				return 0;
			} 
			((char_u)generatedGa_data)[generatedGa_len++] = str;
			if (!escaped) {
				return 1;
			} 
			str = ModernizedCProgram.do_one_arg(str);
		}
		return 1/*
		 * Parse a list of arguments (file names), expand them and return in
		 * "fnames[fcountp]".  When "wig" is TRUE, removes files matching 'wildignore'.
		 * Return FAIL or OK.
		 */;
	}
	/*
	 * Save the size of all windows in "gap".
	 */
	public void win_size_save() {
		win_T wp = new win_T();
		gap.ga_init2((int), 1);
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		int generatedW_width = wp.getW_width();
		int generatedW_vsep_width = wp.getW_vsep_width();
		int generatedW_height = wp.getW_height();
		window_S generatedW_next = wp.getW_next();
		if (gap.ga_grow(ModernizedCProgram.win_count() * 2) == 1) {
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				((int)generatedGa_data)[generatedGa_len++] = generatedW_width + generatedW_vsep_width;
				((int)generatedGa_data)[generatedGa_len++] = generatedW_height;
			}
		} 
	}
	public void win_size_restore() {
		win_T wp = new win_T();
		int i;
		int j;
		int generatedGa_len = this.getGa_len();
		frame_S generatedW_frame = wp.getW_frame();
		Object generatedGa_data = this.getGa_data();
		window_S generatedW_next = wp.getW_next();
		if (ModernizedCProgram.win_count() * 2 == generatedGa_len) {
			for (j = 0; j < 2; ++/* The order matters, because frames contain other frames, but it's
				 * difficult to get right. The easy way out is to do it twice. */j) {
				i = 0;
				for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
					generatedW_frame.frame_setwidth(((int)generatedGa_data)[i++]);
					wp.win_setheight_win(((int)generatedGa_data)[i++]);
				}
			}
			(Object)ModernizedCProgram.win_comp_pos();
		} 
	}
	public void remove_duplicates() {
		int i;
		int j;
		Object generatedGa_data = this.getGa_data();
		char_u fnames = (char_u)generatedGa_data;
		int generatedGa_len = this.getGa_len();
		ModernizedCProgram.sort_strings(fnames, generatedGa_len);
		for (i = generatedGa_len - 1; i > 0; --i) {
			if (ModernizedCProgram.vim_fnamecmp((char_u)(fnames[i - 1]), (char_u)(fnames[i])) == 0) {
				ModernizedCProgram.vim_free(fnames[i]);
				for (j = i + 1; j < generatedGa_len; ++j) {
					fnames[j - 1] = fnames[j];
				}
				--generatedGa_len;
			} 
		}
	}
	public int is_unique(Object maybe_unique, int i) {
		int j;
		int candidate_len;
		int other_path_len;
		Object generatedGa_data = this.getGa_data();
		char_u other_paths = (char_u)generatedGa_data;
		char_u rival = new char_u();
		int generatedGa_len = this.getGa_len();
		for (j = 0; j < generatedGa_len; j++) {
			if (j == i) {
				continue;
			} 
			candidate_len = (int).strlen((byte)(maybe_unique));
			other_path_len = (int).strlen((byte)(other_paths[j]));
			if (other_path_len < candidate_len) {
				continue;
			} 
			rival = other_paths[j] + other_path_len - candidate_len;
			if (ModernizedCProgram.vim_fnamecmp((char_u)(maybe_unique), (char_u)(rival)) == 0 && (rival == other_paths[j] || ModernizedCProgram.vim_ispathsep((rival - 1)))) {
				return 0;
			} 
		}
		// no match foundreturn 1/*
		 * Split the 'path' option into an array of strings in garray_T.  Relative
		 * paths are expanded to their equivalent fullpath.  This includes the "."
		 * (relative to current buffer directory) and empty path (relative to current
		 * directory) notations.
		 *
		 * TODO: handle upward search (;) and path limiter (**N) notations by
		 * expanding each into their equivalent path(s).
		 */;
	}
	public void expand_path_option(Object curdir) {
		Object generatedB_p_path = curbuf.getB_p_path();
		char_u path_option = generatedB_p_path == (byte)'\000' ? ModernizedCProgram.p_path : generatedB_p_path;
		char_u buf = new char_u();
		char_u p = new char_u();
		int len;
		if ((buf = ModernizedCProgram.alloc(1024)) == ((Object)0)) {
			return ;
		} 
		Object generatedB_ffname = curbuf.getB_ffname();
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		while (path_option != (byte)'\000') {
			ModernizedCProgram.copy_option_part(path_option, buf, 1024, " ,");
			if (buf[0] == (byte)'.' && (buf[1] == (byte)'\000' || ModernizedCProgram.vim_ispathsep(buf[1]))) {
				if (generatedB_ffname == ((Object)0)) {
					continue;
				} 
				p = ModernizedCProgram.gettail(generatedB_ffname);
				len = (int)(p - generatedB_ffname);
				if (len + (int).strlen((byte)(buf)) >= 1024) {
					continue;
				} 
				if (buf[1] == (byte)'\000') {
					buf[len] = (byte)'\000';
				} else {
						.memmove((byte)((buf + len)), (byte)((buf + 2)), (size_t)(.strlen((byte)(buf + 2)) + 1));
				} 
				.memmove((byte)(buf), (byte)(generatedB_ffname), (size_t)(len));
				ModernizedCProgram.simplify_filename(buf);
			}  else if (buf[0] == (byte)'\000') {
				.strcpy((byte)(buf), (byte)(curdir));
			}  else if (ModernizedCProgram.path_with_url(buf)) {
				continue;
			}  else if (!ModernizedCProgram.mch_isFullName(buf)) {
				len = (int).strlen((byte)(curdir));
				if (len + (int).strlen((byte)(buf)) + 3 > 1024) {
					continue;
				} 
				.memmove((byte)((buf + len + 1)), (byte)((buf)), (size_t)(.strlen((byte)(buf)) + 1));
				.strcpy((byte)(buf), (byte)(curdir));
				buf[len] = psepc;
				ModernizedCProgram.simplify_filename(buf);
			} 
			if (gap.ga_grow(1) == 0) {
				break;
			} 
			len = (int).strlen((byte)(buf));
			if (buf[len - 1] == (byte)'\\') {
				buf[len - 1] = (byte)'/';
			} 
			p = ModernizedCProgram.vim_strsave(buf);
			if (p == ((Object)0)) {
				break;
			} 
			((char_u)generatedGa_data)[generatedGa_len++] = p;
		}
		ModernizedCProgram.vim_free(buf/*
		 * Returns a pointer to the file or directory name in "fname" that matches the
		 * longest path in "ga"p, or NULL if there is no match. For example:
		 *
		 *    path: /foo/bar/baz
		 *   fname: /foo/bar/baz/quux.txt
		 * returns:		 ^this
		 */);
	}
	public Object get_path_cutoff(Object fname) {
		int i;
		int maxlen = 0;
		Object generatedGa_data = this.getGa_data();
		char_u path_part = (char_u)generatedGa_data;
		char_u cutoff = ((Object)0);
		int generatedGa_len = this.getGa_len();
		for (i = 0; i < generatedGa_len; i++) {
			int j = 0;
			while ((fname[j] == path_part[i][j] || (ModernizedCProgram.vim_ispathsep(fname[j]) && ModernizedCProgram.vim_ispathsep(path_part[i][j]))) && fname[j] != (byte)'\000' && path_part[i][j] != (byte)'\000') {
				j++;
			}
			if (j > maxlen) {
				maxlen = j;
				cutoff = fname[j];
			} 
		}
		// skip to the file or directory nameif (cutoff != ((Object)0)) {
			while (ModernizedCProgram.vim_ispathsep(cutoff)) {
				cutoff += .UNRECOGNIZEDFUNCTIONNAME(cutoff);
			}
		} 
		return cutoff/*
		 * Sorts, removes duplicates and modifies all the fullpath names in "gap" so
		 * that they are unique with respect to each other while conserving the part
		 * that matches the pattern. Beware, this is at least O(n^2) wrt "gap->ga_len".
		 */;
	}
	public void uniquefy_paths(Object pattern) {
		int i;
		int len;
		Object generatedGa_data = this.getGa_data();
		char_u fnames = (char_u)generatedGa_data;
		int sort_again = 0;
		char_u pat = new char_u();
		char_u file_pattern = new char_u();
		char_u curdir = new char_u();
		regmatch_T regmatch = new regmatch_T();
		garray_T path_ga = new garray_T();
		char_u in_curdir = ((Object)0);
		char_u short_name = new char_u();
		gap.remove_duplicates();
		path_ga.ga_init2((int), 1/*
		     * We need to prepend a '*' at the beginning of file_pattern so that the
		     * regex matches anywhere in the path. FIXME: is this valid for all
		     * possible patterns?
		     */);
		len = (int).strlen((byte)(pattern));
		file_pattern = ModernizedCProgram.alloc(len + 2);
		if (file_pattern == ((Object)0)) {
			return ;
		} 
		file_pattern[0] = (byte)'*';
		file_pattern[1] = (byte)'\000';
		.strcat((byte)(file_pattern), (byte)(pattern));
		pat = ModernizedCProgram.file_pat_to_reg_pat(file_pattern, ((Object)0), ((Object)0), 1);
		ModernizedCProgram.vim_free(file_pattern);
		if (pat == ((Object)0)) {
			return ;
		} 
		// always ignore case// always ignore caseregmatch.setRm_ic(1);
		regprog regprog = new regprog();
		regmatch.setRegprog(regprog.vim_regcomp(pat, 1 + 2));
		ModernizedCProgram.vim_free(pat);
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedRegprog == ((Object)0)) {
			return ;
		} 
		if ((curdir = ModernizedCProgram.alloc(1024)) == ((Object)0)) {
			;
		} 
		ModernizedCProgram.mch_dirname(curdir, 1024);
		path_ga.expand_path_option(curdir);
		int generatedGa_len = this.getGa_len();
		in_curdir = (char_u)ModernizedCProgram.alloc_clear( * (generatedGa_len));
		if (in_curdir == ((Object)0)) {
			;
		} 
		for (i = 0; i < generatedGa_len && !got_int; i++) {
			char_u path = fnames[i];
			int is_in_curdir;
			char_u dir_end = ModernizedCProgram.gettail_dir(path);
			char_u pathsep_p = new char_u();
			char_u path_cutoff = new char_u();
			len = (int).strlen((byte)(path));
			is_in_curdir = ModernizedCProgram.vim_fnamencmp((char_u)(curdir), (char_u)(path), (size_t)(dir_end - path)) == 0 && curdir[dir_end - path] == (byte)'\000';
			if (is_in_curdir) {
				in_curdir[i] = ModernizedCProgram.vim_strsave(path);
			} 
			path_cutoff = path_ga.get_path_cutoff(path);
			if (pattern[0] == (byte)'*' && pattern[1] == (byte)'*' && ModernizedCProgram.vim_ispathsep_nocolon(pattern[2]) && path_cutoff != ((Object)0) && regmatch.vim_regexec(path_cutoff, (colnr_T)0) && gap.is_unique(path_cutoff, i)) {
				sort_again = 1;
				.memmove((byte)(path), (byte)(path_cutoff), (size_t)(.strlen((byte)(path_cutoff)) + 1));
			} else {
					pathsep_p = path + len - 1;
					while (ModernizedCProgram.find_previous_pathsep(path, pathsep_p)) {
						if (regmatch.vim_regexec(pathsep_p + 1, (colnr_T)0) && gap.is_unique(pathsep_p + 1, i) && path_cutoff != ((Object)0) && pathsep_p + 1 >= path_cutoff) {
							sort_again = 1;
							.memmove((byte)(path), (byte)(pathsep_p + 1), (size_t)(.strlen((byte)(pathsep_p))));
							break;
						} 
					}
			} 
			if (ModernizedCProgram.mch_isFullName(path/*
				     * Last resort: shorten relative to curdir if possible.
				     * 'possible' means:
				     * 1. It is under the current directory.
				     * 2. The result is actually shorter than the original.
				     *
				     *	    Before		  curdir	After
				     *	    /foo/bar/file.txt	  /foo/bar	./file.txt
				     *	    c:\foo\bar\file.txt   c:\foo\bar	.\file.txt
				     *	    /file.txt		  /		/file.txt
				     *	    c:\file.txt		  c:\		.\file.txt
				     */)) {
				short_name = ModernizedCProgram.shorten_fname(path, curdir);
				if (short_name != ((Object)0) && short_name > path + 1 && !ModernizedCProgram.vim_ispathsep(short_name)) {
					.strcpy((byte)(path), (byte)("."));
					ModernizedCProgram.add_pathsep(path);
					.memmove((byte)((path + .strlen((byte)(path)))), (byte)((short_name)), (size_t)(.strlen((byte)(short_name)) + 1));
				} 
			} 
			ModernizedCProgram.ui_breakcheck();
		}
		// Shorten filenames in /in/current/directory/{filename}for (i = 0; i < generatedGa_len && !got_int; i++) {
			char_u rel_path = new char_u();
			char_u path = in_curdir[i];
			if (path == ((Object)0)) {
				continue;
			} 
			short_name = ModernizedCProgram.shorten_fname(path, curdir);
			if (short_name == ((Object)0)) {
				short_name = path;
			} 
			if (gap.is_unique(short_name, i)) {
				.strcpy((byte)(fnames[i]), (byte)(short_name));
				continue;
			} 
			rel_path = ModernizedCProgram.alloc(.strlen((byte)(short_name)) + .strlen((byte)(pseps)) + 2);
			if (rel_path == ((Object)0)) {
				;
			} 
			.strcpy((byte)(rel_path), (byte)("."));
			ModernizedCProgram.add_pathsep(rel_path);
			.strcat((byte)(rel_path), (byte)(short_name));
			ModernizedCProgram.vim_free(fnames[i]);
			fnames[i] = rel_path;
			sort_again = 1;
			ModernizedCProgram.ui_breakcheck();
		}
		if (in_curdir != ((Object)0)) {
			for (i = 0; i < generatedGa_len; i++) {
				ModernizedCProgram.vim_free(in_curdir[i]);
			}
			ModernizedCProgram.vim_free(in_curdir);
		} 
		path_ga.ga_clear_strings();
		generatedRegprog.vim_regfree();
		if (sort_again) {
			gap/*
			 * Calls globpath() with 'path' values for the given pattern and stores the
			 * result in "gap".
			 * Returns the total number of matches.
			 */.remove_duplicates();
		} 
	}
	public int expand_in_path(Object pattern, int flags) {
		// EW_* flagschar_u curdir = new char_u();
		garray_T path_ga = new garray_T();
		char_u paths = ((Object)0);
		int glob_flags = 0;
		if ((curdir = ModernizedCProgram.alloc(1024)) == ((Object)0)) {
			return 0;
		} 
		ModernizedCProgram.mch_dirname(curdir, 1024);
		path_ga.ga_init2((int), 1);
		path_ga.expand_path_option(curdir);
		ModernizedCProgram.vim_free(curdir);
		int generatedGa_len = path_ga.getGa_len();
		if (generatedGa_len == 0) {
			return 0;
		} 
		paths = path_ga.ga_concat_strings(",");
		path_ga.ga_clear_strings();
		if (paths == ((Object)0)) {
			return 0;
		} 
		if (flags & -1024) {
			glob_flags |=  -1024;
		} 
		if (flags & -1024) {
			glob_flags |=  -1024;
		} 
		gap.globpath(paths, pattern, glob_flags);
		ModernizedCProgram.vim_free(paths);
		return generatedGa_len;// FEAT_SEARCHPATH
	}
	public int bracketed_paste( mode, int drop) {
		int c;
		char_u[] buf = new char_u();
		int idx = 0;
		char_u end = ModernizedCProgram.find_termcode((char_u)"PE");
		int ret_char = -1;
		int save_allow_keys = allow_keys;
		int save_paste = ModernizedCProgram.p_paste;
		if (.strlen((byte)(end)) >= /* If the end code is too long we can't detect it, read everything. */65) {
			end = ((Object)0);
		} 
		++no_mapping;
		allow_keys = 0;
		if (!ModernizedCProgram.p_paste) {
			ModernizedCProgram.set_option_value((char_u)"paste", 1, ((Object)0), 0);
		} 
		// Also have the side effects of setting 'paste' to make it work much
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		for (; ; ) {
			if (end == ((Object)0) && ModernizedCProgram.vpeekc() == (byte)'\000') {
				break;
			} 
			do {
				c = ModernizedCProgram.vgetc();
			} while (c == (-((true) + ((int)(key_extra.KE_IGNORE) << 8))) || c == (-((true) + ((int)(((byte)'X')) << 8))) || c == (-((true) + ((int)(((byte)'X')) << 8))));
			if (c == (byte)'\000' || got_int) {
				break;
			} 
			if (has_mbyte) {
				idx += .UNRECOGNIZEDFUNCTIONNAME(c, buf + idx);
			} else {
					buf[idx++] = c;
			} 
			buf[idx] = (byte)'\000';
			if (end != ((Object)0) && .strncmp((byte)(buf), (byte)(end), (size_t)(idx)) == 0) {
				if (end[idx] == (byte)'\000') {
					break;
				} 
				continue;
			} 
			if (!drop) {
				switch (mode) {
				case .PASTE_EX:
						if (gap != ((Object)0) && gap.ga_grow(idx) == 1) {
							.memmove((byte)((byte)generatedGa_data + generatedGa_len), (byte)(buf), (size_t)((size_t)idx));
							generatedGa_len += idx;
						} 
						break;
				case .PASTE_CMDLINE:
						ModernizedCProgram.put_on_cmdline(buf, idx, 1);
						break;
				case .PASTE_INSERT:
						if (ModernizedCProgram.stop_arrow() == 1) {
							c = buf[0];
							if (idx == 1 && (c == (byte)'\015' || c == (-(((byte)'K') + ((int)((byte)'A') << 8))) || c == (byte)'\012')) {
								ModernizedCProgram.ins_eol(c);
							} else {
									ModernizedCProgram.ins_char_bytes(buf, idx);
									ModernizedCProgram.AppendToRedobuffLit(buf, idx);
							} 
						} 
						break;
				case .PASTE_ONE_CHAR:
						if (ret_char == -1) {
							if (has_mbyte) {
								ret_char = .UNRECOGNIZEDFUNCTIONNAME(buf);
							} else {
									ret_char = buf[0];
							} 
						} 
						break;
				}
			} 
			idx = 0;
		}
		--no_mapping;
		allow_keys = save_allow_keys;
		if (!save_paste) {
			ModernizedCProgram.set_option_value((char_u)"paste", 0, ((Object)0), 0);
		} 
		return ret_char;
	}
	public int readdir_core(Object path, Object context, Object checkitem) {
		int failed = 0;
		char_u buf = new char_u();
		char_u p = new char_u();
		int ok;
		HANDLE hFind = (HANDLE)(true);
		WIN32_FIND_DATAW wfb = new WIN32_FIND_DATAW();
		// UTF-16 name, NULL when not used.WCHAR wn = ((Object)0);
		gap.ga_init2((int), 20);
		buf = ModernizedCProgram.alloc(1024);
		if (buf == ((Object)0)) {
			return 0;
		} 
		.strncpy((byte)(buf), (byte)(path), (size_t)(1024 - 5));
		p = buf + .strlen((byte)(buf));
		p -= has_mbyte ? (.UNRECOGNIZEDFUNCTIONNAME(buf, p - 1) + 1) : 1;
		if (p == (byte)'\\' || p == (byte)'/') {
			p = (byte)'\000';
		} 
		.strcat((byte)(buf), (byte)("\\*"));
		wn = ModernizedCProgram.enc_to_utf16(buf, ((Object)0));
		if (wn != ((Object)0)) {
			hFind = .FindFirstFileW(wn, wfb);
		} 
		ok = (hFind != (HANDLE)(true));
		Object generatedCFileName = wfb.getCFileName();
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		if (!ok) {
			failed = 1;
			ModernizedCProgram.smsg(((byte)(e_notopen)), path);
		} else {
				while (ok) {
					int ignore;
					p = ModernizedCProgram.utf16_to_enc(generatedCFileName, ((Object)0));
					if (p == ((Object)0)) {
						break;
					} 
					ignore = p[0] == (byte)'.' && (p[1] == (byte)'\000' || (p[1] == (byte)'.' && p[2] == (byte)'\000'));
					if (!ignore && checkitem != ((Object)0)) {
						int r = .checkitem(context, p);
						if (r < 0) {
							ModernizedCProgram.vim_free(p);
							break;
						} 
						if (r == 0) {
							ignore = 1;
						} 
					} 
					if (!ignore) {
						if (gap.ga_grow(1) == 1) {
							((char_u)generatedGa_data)[generatedGa_len++] = ModernizedCProgram.vim_strsave(p);
						} else {
								failed = 1;
								ModernizedCProgram.vim_free(p);
								break;
						} 
					} 
					ModernizedCProgram.vim_free(p);
					ok = .FindNextFileW(hFind, wfb);
				}
				.FindClose(hFind);
		} 
		ModernizedCProgram.vim_free(buf);
		ModernizedCProgram.vim_free(wn);
		if (!failed && generatedGa_len > 0) {
			ModernizedCProgram.sort_strings((char_u)generatedGa_data, generatedGa_len);
		} 
		return failed ? 0 : 1/*
		 * Delete "name" and everything in it, recursively.
		 * return 0 for success, -1 if some file was not deleted.
		 */;
	}
	public void keymap_clear() {
		int i;
		Object generatedGa_data = this.getGa_data();
		kmap_T kp = (kmap_T)generatedGa_data;
		int generatedGa_len = this.getGa_len();
		for (i = 0; i < generatedGa_len; ++i) {
			ModernizedCProgram.vim_free(kp[i].getFrom());
			ModernizedCProgram.vim_free(kp[i].getTo());
		}
	}
	/*
	 * Clear an allocated growing array.
	 */
	public void ga_clear() {
		Object generatedGa_data = this.getGa_data();
		ModernizedCProgram.vim_free(generatedGa_data);
		gap/*
		 * Clear a growing array that contains a list of strings.
		 */.ga_init();
	}
	public void ga_clear_strings() {
		int i;
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		for (i = 0; i < generatedGa_len; ++i) {
			ModernizedCProgram.vim_free(((char_u)(generatedGa_data))[i]);
		}
		gap/*
		 * Initialize a growing array.	Don't forget to set ga_itemsize and
		 * ga_growsize!  Or use ga_init2().
		 */.ga_clear();
	}
	public void ga_init() {
		this.setGa_data(((Object)0));
		this.setGa_maxlen(0);
		this.setGa_len(0);
	}
	public void ga_init2(int itemsize, int growsize) {
		gap.ga_init();
		this.setGa_itemsize(itemsize);
		this.setGa_growsize(growsize/*
		 * Make room in growing array "gap" for at least "n" items.
		 * Return FAIL for failure, OK otherwise.
		 */);
	}
	public int ga_grow(int n) {
		size_t old_len = new size_t();
		size_t new_len = new size_t();
		char_u pp = new char_u();
		int generatedGa_maxlen = this.getGa_maxlen();
		int generatedGa_len = this.getGa_len();
		int generatedGa_growsize = this.getGa_growsize();
		int generatedGa_itemsize = this.getGa_itemsize();
		Object generatedGa_data = this.getGa_data();
		if (generatedGa_maxlen - generatedGa_len < n) {
			if (n < generatedGa_growsize) {
				n = generatedGa_growsize;
			} 
			if (n < generatedGa_len / 2) {
				n = generatedGa_len / 2;
			} 
			new_len = generatedGa_itemsize * (generatedGa_len + n);
			pp = .realloc((generatedGa_data), (new_len));
			if (pp == ((Object)0)) {
				return 0;
			} 
			old_len = generatedGa_itemsize * generatedGa_maxlen;
			.memset((pp + old_len), (false), (new_len - old_len));
			this.setGa_maxlen(generatedGa_len + n);
			this.setGa_data(pp);
		} 
		return 1/*
		 * For a growing array that contains a list of strings: concatenate all the
		 * strings with a separating "sep".
		 * Returns NULL when out of memory.
		 */;
	}
	public Object ga_concat_strings(Byte sep) {
		int i;
		int len = 0;
		int sep_len = (int).strlen((byte)(sep));
		char_u s = new char_u();
		char_u p = new char_u();
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		for (i = 0; i < generatedGa_len; ++i) {
			len += (int).strlen((byte)(((char_u)(generatedGa_data))[i])) + sep_len;
		}
		s = ModernizedCProgram.alloc(len + 1);
		if (s != ((Object)0)) {
			s = (byte)'\000';
			p = s;
			for (i = 0; i < generatedGa_len; ++i) {
				if (p != s) {
					.strcpy((byte)(p), (byte)(sep));
					p += sep_len;
				} 
				.strcpy((byte)(p), (byte)(((char_u)(generatedGa_data))[i]));
				p += .strlen((byte)(p));
			}
		} 
		return s/*
		 * Make a copy of string "p" and add it to "gap".
		 * When out of memory nothing changes.
		 */;
	}
	public void ga_add_string(Object p) {
		char_u cp = ModernizedCProgram.vim_strsave(p);
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		if (cp != ((Object)0)) {
			if (gap.ga_grow(1) == 1) {
				((char_u)(generatedGa_data))[generatedGa_len++] = cp;
			} else {
					ModernizedCProgram.vim_free(cp/*
					 * Concatenate a string to a growarray which contains bytes.
					 * When "s" is NULL does not do anything.
					 * Note: Does NOT copy the NUL at the end!
					 */);
			} 
		} 
	}
	public void ga_concat(Object s) {
		int len;
		if (s == ((Object)0) || s == (byte)'\000') {
			return ;
		} 
		len = (int).strlen((byte)(s));
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		if (gap.ga_grow(len) == 1) {
			.memmove((byte)((byte)generatedGa_data + generatedGa_len), (byte)(s), (size_t)((size_t)len));
			generatedGa_len += len/*
			 * Append one byte to a growarray which contains bytes.
			 */;
		} 
	}
	public void ga_append(int c) {
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		if (gap.ga_grow(1) == 1) {
			((byte)generatedGa_data + generatedGa_len) = c;
			++generatedGa_len;
		} 
	}
	/*
	 * Append the text in "gap" below the cursor line and clear "gap".
	 */
	public void append_ga_line() {
		int generatedGa_len = this.getGa_len();
		int generatedB_p_bin = curbuf.getB_p_bin();
		Object generatedGa_data = this.getGa_data();
		if (generatedGa_len > /* Remove trailing CR. */0 && !generatedB_p_bin && ((char_u)generatedGa_data)[generatedGa_len - 1] == (byte)'\015') {
			--generatedGa_len;
		} 
		gap.ga_append((byte)'\000');
		ModernizedCProgram.ml_append(ModernizedCProgram.curwin.getW_cursor().getLnum()++, generatedGa_data, 0, 0);
		this.setGa_len(0/************************************************************************
		 * functions that use lookup tables for various things, generally to do with
		 * special key codes.
		 */);
	}
	public void handle_viminfo_history(int writing) {
		int type;
		long_u len = new long_u();
		char_u val = new char_u();
		char_u p = new char_u();
		Object generatedGa_data = this.getGa_data();
		bval_T vp = (bval_T)generatedGa_data;
		// Check the format:
		int generatedGa_len = this.getGa_len();
		// |{bartype},{histtype},{timestamp},{separator},"text"if (generatedGa_len < 4 || vp[0].getBv_type() != .BVAL_NR || vp[1].getBv_type() != .BVAL_NR || (vp[2].getBv_type() != .BVAL_NR && vp[2].getBv_type() != .BVAL_EMPTY) || vp[3].getBv_type() != .BVAL_STRING) {
			return ;
		} 
		type = vp[0].getBv_nr();
		if (type >= 5) {
			return ;
		} 
		if (ModernizedCProgram.viminfo_hisidx[type] < ModernizedCProgram.viminfo_hislen[type]) {
			val = vp[3].getBv_string();
			if (val != ((Object)0) && val != (byte)'\000') {
				int sep = type == 1 && vp[2].getBv_type() == .BVAL_NR ? vp[2].getBv_nr() : (byte)'\000';
				int idx;
				int overwrite = 0;
				if (!ModernizedCProgram.in_history(type, val, ModernizedCProgram.viminfo_add_at_front, sep, writing)) {
					for (idx = 0; idx < ModernizedCProgram.viminfo_hisidx[type]; ++idx) {
						p = ModernizedCProgram.viminfo_history[type][idx].getHisstr();
						if (.strcmp((byte)(val), (byte)(p)) == 0 && (type != 1 || sep == p[.strlen((byte)(p)) + 1])) {
							overwrite = 1;
							break;
						} 
					}
					if (!overwrite) {
						len = vp[3].getBv_len();
						p = ModernizedCProgram.alloc(len + 2);
					} else {
							len = 0;
					} 
					if (p != ((Object)0)) {
						ModernizedCProgram.viminfo_history[type][idx].setTime_set(vp[1].getBv_nr());
						if (!overwrite) {
							.memmove((byte)(p), (byte)(val), (size_t)((size_t)len + 1));
							p[len + 1] = sep;
							ModernizedCProgram.viminfo_history[type][idx].setHisstr(p);
							ModernizedCProgram.viminfo_history[type][idx].setHisnum(0);
							ModernizedCProgram.viminfo_history[type][idx].setViminfo(1);
							ModernizedCProgram.viminfo_hisidx[type]++;
						} 
					} 
				} 
			} 
		} 
	}
	public void handle_viminfo_register(int force) {
		Object generatedGa_data = this.getGa_data();
		bval_T vp = (bval_T)generatedGa_data;
		int flags;
		int name;
		int type;
		int linecount;
		int width;
		time_t timestamp = new time_t();
		yankreg_T y_ptr = new yankreg_T();
		yankreg_T y_regs_p = ModernizedCProgram.get_y_regs();
		int i;
		// Check the format:
		int generatedGa_len = this.getGa_len();
		// |{bartype},{flags},{name},{type},//      {linecount},{width},{timestamp},"line1","line2"if (generatedGa_len < 6 || vp[0].getBv_type() != .BVAL_NR || vp[1].getBv_type() != .BVAL_NR || vp[2].getBv_type() != .BVAL_NR || vp[3].getBv_type() != .BVAL_NR || vp[4].getBv_type() != .BVAL_NR || vp[5].getBv_type() != .BVAL_NR) {
			return ;
		} 
		flags = vp[0].getBv_nr();
		name = vp[1].getBv_nr();
		if (name < 0 || name >= (37 + 1)) {
			return ;
		} 
		type = vp[2].getBv_nr();
		if (type != 0 && type != 1 && type != 2) {
			return ;
		} 
		linecount = vp[3].getBv_nr();
		if (generatedGa_len < 6 + linecount) {
			return ;
		} 
		width = vp[4].getBv_nr();
		if (width < 0) {
			return ;
		} 
		if (ModernizedCProgram.y_read_regs != ((Object)0)) {
			y_ptr = ModernizedCProgram.y_read_regs[name];
		} else {
				y_ptr = y_regs_p[name];
		} 
		// Reading viminfo for merging and writing.  Store the register
		// Do not overwrite unless forced or the timestamp is newer.// Do not overwrite unless forced or the timestamp is newer.timestamp = (time_t)vp[5].getBv_nr();
		Object generatedY_array = y_ptr.getY_array();
		Object generatedY_time_set = y_ptr.getY_time_set();
		if (generatedY_array != ((Object)0) && !force && (timestamp == 0 || generatedY_time_set > timestamp)) {
			return ;
		} 
		Object generatedY_size = y_ptr.getY_size();
		if (generatedY_array != ((Object)0)) {
			for (i = 0; i < generatedY_size; i++) {
				ModernizedCProgram.vim_free(generatedY_array[i]);
			}
		} 
		ModernizedCProgram.vim_free(generatedY_array);
		if (ModernizedCProgram.y_read_regs == ((Object)0)) {
			if (flags & 1) {
				y_ptr.set_y_previous();
			} 
			if ((flags & 2) && (force || ModernizedCProgram.get_execreg_lastc() == (byte)'\000')) {
				ModernizedCProgram.set_execreg_lastc(ModernizedCProgram.get_register_name(name));
			} 
		} 
		y_ptr.setY_type(type);
		y_ptr.setY_width(width);
		y_ptr.setY_size(linecount);
		y_ptr.setY_time_set(timestamp);
		if (linecount == 0) {
			y_ptr.setY_array(((Object)0));
			return ;
		} 
		y_ptr.setY_array((char_u)ModernizedCProgram.alloc( * (linecount)));
		if (generatedY_array == ((Object)0)) {
			y_ptr.setY_size(0);
			return ;
		} 
		for (i = 0; i < linecount; i++) {
			if (vp[i + 6].getBv_allocated()) {
				generatedY_array[i] = vp[i + 6].getBv_string();
				vp[i + 6].setBv_string(((Object)0));
			} else {
					generatedY_array[i] = ModernizedCProgram.vim_strsave(vp[i + 6].getBv_string());
			} 
		}
	}
	/*
	 * Accept a new style mark line from the viminfo, store it when it's new.
	 */
	public void handle_viminfo_mark(int force) {
		Object generatedGa_data = this.getGa_data();
		bval_T vp = (bval_T)generatedGa_data;
		int name;
		linenr_T lnum = new linenr_T();
		colnr_T col = new colnr_T();
		time_t timestamp = new time_t();
		xfmark_T fm = ((Object)0);
		// Check the format:
		int generatedGa_len = this.getGa_len();
		// |{bartype},{name},{lnum},{col},{timestamp},{filename}if (generatedGa_len < 5 || vp[0].getBv_type() != .BVAL_NR || vp[1].getBv_type() != .BVAL_NR || vp[2].getBv_type() != .BVAL_NR || vp[3].getBv_type() != .BVAL_NR || vp[4].getBv_type() != .BVAL_STRING) {
			return ;
		} 
		name = vp[0].getBv_nr();
		if (name != (byte)'\'' && !((int)(name) - (byte)'0' < 10) && !((int)(name) - (byte)'A' < 26)) {
			return ;
		} 
		lnum = vp[1].getBv_nr();
		col = vp[2].getBv_nr();
		if (lnum <= 0 || col < 0) {
			return ;
		} 
		timestamp = (time_t)vp[3].getBv_nr();
		filemark generatedFmark = fm.getFmark();
		 generatedMark = generatedFmark.getMark();
		xfilemark xfilemark = new xfilemark();
		if (name == (byte)'\'') {
			if (ModernizedCProgram.vi_jumplist != ((Object)0)) {
				if (ModernizedCProgram.vi_jumplist_len < 100) {
					fm = ModernizedCProgram.vi_jumplist[ModernizedCProgram.vi_jumplist_len++];
				} 
			} else {
					int idx;
					int i;
					if (timestamp != 0) {
						for (idx = ModernizedCProgram.curwin.getW_jumplistlen() - 1; idx >= 0; --idx) {
							if (ModernizedCProgram.curwin.getW_jumplist()[idx].getTime_set() < timestamp) {
								++idx;
								break;
							} 
						}
						if (idx < 0 && ModernizedCProgram.curwin.getW_jumplistlen() < 100) {
							idx = 0;
						} 
					}  else if (ModernizedCProgram.curwin.getW_jumplistlen() < 100) {
						idx = 0;
					} else {
							idx = -1;
					} 
					if (idx >= 0) {
						if (ModernizedCProgram.curwin.getW_jumplistlen() == 100) {
							--idx;
							ModernizedCProgram.vim_free(ModernizedCProgram.curwin.getW_jumplist()[0].getFname());
							for (i = 0; i < idx; ++i) {
								ModernizedCProgram.curwin.getW_jumplist()[i] = ModernizedCProgram.curwin.getW_jumplist()[i + 1];
							}
						} else {
								for (i = ModernizedCProgram.curwin.getW_jumplistlen(); i > idx; --i) {
									ModernizedCProgram.curwin.getW_jumplist()[i] = ModernizedCProgram.curwin.getW_jumplist()[i - 1];
								}
								++ModernizedCProgram.curwin.getW_jumplistidx();
								++ModernizedCProgram.curwin.getW_jumplistlen();
						} 
						fm = ModernizedCProgram.curwin.getW_jumplist()[idx];
						generatedMark.setLnum(0);
						fm.setFname(((Object)0));
						fm.setTime_set(0);
					} 
			} 
		} else {
				int idx;
				xfmark_T namedfm_p = xfilemark.get_namedfm();
				if (((int)(name) - (byte)'0' < 10)) {
					if (ModernizedCProgram.vi_namedfm != ((Object)0)) {
						idx = name - (byte)'0' + ((byte)'z' - (byte)'a' + 1);
					} else {
							int i;
							for (idx = ((byte)'z' - (byte)'a' + 1); idx < ((byte)'z' - (byte)'a' + 1) + 10; ++idx) {
								if (namedfm_p[idx].getTime_set() < timestamp) {
									break;
								} 
							}
							if (idx == ((byte)'z' - (byte)'a' + 1) + 10) {
								return ;
							} 
							i = ((byte)'z' - (byte)'a' + 1) + 10 - 1;
							ModernizedCProgram.vim_free(namedfm_p[i].getFname());
							for (; i > idx; --i) {
								namedfm_p[i] = namedfm_p[i - 1];
							}
							namedfm_p[idx].setFname(((Object)0));
					} 
				} else {
						idx = name - (byte)'A';
				} 
				if (ModernizedCProgram.vi_namedfm != ((Object)0)) {
					fm = ModernizedCProgram.vi_namedfm[idx];
				} else {
						fm = namedfm_p[idx];
				} 
		} 
		Object generatedLnum = generatedMark.getLnum();
		Object generatedTime_set = fm.getTime_set();
		Object generatedFname = fm.getFname();
		if (fm != ((Object)0)) {
			if (ModernizedCProgram.vi_namedfm != ((Object)0) || generatedLnum == 0 || generatedTime_set < timestamp || force) {
				generatedMark.setLnum(lnum);
				generatedMark.setCol(col);
				generatedMark.setColadd(0);
				generatedFmark.setFnum(0);
				ModernizedCProgram.vim_free(generatedFname);
				if (vp[4].getBv_allocated()) {
					fm.setFname(vp[4].getBv_string());
					vp[4].setBv_string(((Object)0));
				} else {
						fm.setFname(ModernizedCProgram.vim_strsave(vp[4].getBv_string()));
				} 
				fm.setTime_set(timestamp);
			} 
		} 
	}
	public int get_function_args(Object argp, Object endchar, int varargs, growarray default_args, int skip) {
		int mustend = 0;
		char_u arg = argp;
		char_u p = arg;
		int c;
		int i;
		int any_default = 0;
		char_u expr = new char_u();
		if (newargs != ((Object)0)) {
			newargs.ga_init2((int), 3);
		} 
		if (default_args != ((Object)0)) {
			default_args.ga_init2((int), 3);
		} 
		if (varargs != ((Object)0)) {
			varargs = 0/*
			     * Isolate the arguments: "arg1, arg2, ...)"
			     */;
		} 
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = this.getGa_data();
		while (p != endchar) {
			if (p[0] == (byte)'.' && p[1] == (byte)'.' && p[2] == (byte)'.') {
				if (varargs != ((Object)0)) {
					varargs = 1;
				} 
				p += 3;
				mustend = 1;
			} else {
					arg = p;
					while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10)) || p == (byte)'_') {
						++p;
					}
					if (arg == p || .isdigit(arg) || (p - arg == 9 && .strncmp((byte)(arg), (byte)("firstline"), (size_t)(true)) == 0) || (p - arg == 8 && .strncmp((byte)(arg), (byte)("lastline"), (size_t)(true)) == 0)) {
						if (!skip) {
							ModernizedCProgram.semsg(((byte)("E125: Illegal argument: %s")), arg);
						} 
						break;
					} 
					if (newargs != ((Object)0) && newargs.ga_grow(1) == 0) {
						;
					} 
					if (newargs != ((Object)0)) {
						c = p;
						p = (byte)'\000';
						arg = ModernizedCProgram.vim_strsave(arg);
						if (arg == ((Object)0)) {
							p = c;
							;
						} 
						for (i = 0; i < generatedGa_len; ++/* Check for duplicate argument name. */i) {
							if (.strcmp((byte)(((char_u)(generatedGa_data))[i]), (byte)(arg)) == 0) {
								ModernizedCProgram.semsg(((byte)("E853: Duplicate argument name: %s")), arg);
								ModernizedCProgram.vim_free(arg);
								;
							} 
						}
						((char_u)(generatedGa_data))[generatedGa_len] = arg;
						generatedGa_len++;
						p = c;
					} 
					if (ModernizedCProgram.skipwhite(p) == (byte)'=' && default_args != ((Object)0)) {
						typval_T rettv = new typval_T();
						any_default = 1;
						p = ModernizedCProgram.skipwhite(p) + 1;
						p = ModernizedCProgram.skipwhite(p);
						expr = p;
						if (rettv.eval1(p, 0) != 0) {
							if (default_args.ga_grow(1) == 0) {
								;
							} 
							while (p > expr && ((p[-1]) == (byte)' ' || (p[-1]) == (byte)'\t')) {
								p--;
							}
							c = p;
							p = (byte)'\000';
							expr = ModernizedCProgram.vim_strsave(expr);
							if (expr == ((Object)0)) {
								p = c;
								;
							} 
							((char_u)(generatedGa_data))[generatedGa_len] = expr;
							generatedGa_len++;
							p = c;
						} else {
								mustend = 1;
						} 
					}  else if (any_default) {
						ModernizedCProgram.emsg(((byte)("E989: Non-default argument follows default argument")));
						mustend = 1;
					} 
					if (p == (byte)',') {
						++p;
					} else {
							mustend = 1;
					} 
			} 
			p = ModernizedCProgram.skipwhite(p);
			if (mustend && p != endchar) {
				if (!skip) {
					ModernizedCProgram.semsg(((byte)(e_invarg2)), argp);
				} 
				break;
			} 
		}
		if (p != endchar) {
			;
		} 
		++/* skip "endchar" */p;
		argp = p;
		return 1;
		if (default_args != ((Object)0)) {
			default_args.ga_clear_strings();
		} 
		return 0/*
		 * Register function "fp" as using "current_funccal" as its scope.
		 */;
	}
	public void assert_error() {
		vimvar vp = vimvars[67];
		dictitem16_S generatedVv_di = vp.getVv_di();
		 generatedDi_tv = generatedVv_di.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedVval = generatedDi_tv.getVval();
		listvar_S listvar_S = new listvar_S();
		if (generatedV_type != .VAR_LIST || generatedVval.getV_list() == ((Object)0)) {
			listvar_S.list_alloc().set_vim_var_list(67);
		} 
		// Make sure v:errors is a list.
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		generatedVval.getV_list().list_append_string(generatedGa_data, generatedGa_len);
	}
	public void spell_suggest_list(Object word, int maxcount, int need_cap, int interactive) {
		// 'spellcapcheck' matchedsuginfo_T sug = new suginfo_T();
		int i;
		suggest_T stp = new suggest_T();
		char_u wcopy = new char_u();
		sug.spell_find_suggest(word, 0, maxcount, 0, need_cap, interactive);
		growarray generatedSu_ga = sug.getSu_ga();
		int generatedGa_len = generatedSu_ga.getGa_len();
		// Make room in "gap".// Make room in "gap".gap.ga_init2(, generatedGa_len + 1);
		Object generatedGa_data = (generatedSu_ga).getGa_data();
		int generatedSt_wordlen = stp.getSt_wordlen();
		Object generatedSu_badptr = sug.getSu_badptr();
		int generatedSt_orglen = stp.getSt_orglen();
		Object generatedSt_word = stp.getSt_word();
		if (gap.ga_grow(generatedGa_len) == 1) {
			for (i = 0; i < generatedGa_len; ++i) {
				stp = (((suggest_T)generatedGa_data)[i]);
				wcopy = ModernizedCProgram.alloc(generatedSt_wordlen + (int).strlen((byte)(generatedSu_badptr + generatedSt_orglen)) + 1);
				if (wcopy == ((Object)0)) {
					break;
				} 
				.strcpy((byte)(wcopy), (byte)(generatedSt_word));
				.strcpy((byte)(wcopy + generatedSt_wordlen), (byte)(generatedSu_badptr + generatedSt_orglen));
				((char_u)generatedGa_data)[generatedGa_len++] = wcopy;
			}
		} 
		sug/*
		 * Find spell suggestions for the word at the start of "badptr".
		 * Return the suggestions in "su->su_ga".
		 * The maximum number of suggestions is "maxcount".
		 * Note: does use info for the current window.
		 * This is based on the mechanisms of Aspell, but completely reimplemented.
		 */.spell_find_cleanup();
	}
	// maximum nr of suggestions
	public int cleanup_suggestions(int maxscore, int keep) {
		Object generatedGa_data = (gap).getGa_data();
		// nr of suggestions to keepsuggest_T stp = (((suggest_T)generatedGa_data)[0]);
		int i;
		int generatedGa_len = this.getGa_len();
		// Sort the list.// Sort the list..qsort(generatedGa_data, (size_t)generatedGa_len, , ModernizedCProgram.sug_compare);
		// Truncate the list to the number of suggestions that will be displayed.if (generatedGa_len > keep) {
			for (i = keep; i < generatedGa_len; ++i) {
				ModernizedCProgram.vim_free(stp[i].getSt_word());
			}
			this.setGa_len(keep);
			return stp[keep - 1].getSt_score();
		} 
		return maxscore/*
		 * Compute a score for two sound-a-like words.
		 * This permits up to two inserts/deletes/swaps/etc. to keep things fast.
		 * Instead of a generic loop we write out the code.  That keeps it fast by
		 * avoiding checks that will not be possible.
		 */;
	}
	public void uc_clear() {
		int i;
		ucmd_T cmd = new ucmd_T();
		int generatedGa_len = this.getGa_len();
		Object generatedGa_data = (gap).getGa_data();
		Object generatedUc_name = cmd.getUc_name();
		Object generatedUc_rep = cmd.getUc_rep();
		Object generatedUc_compl_arg = cmd.getUc_compl_arg();
		for (i = 0; i < generatedGa_len; ++i) {
			cmd = (((ucmd_T)(generatedGa_data))[i]);
			ModernizedCProgram.vim_free(generatedUc_name);
			ModernizedCProgram.vim_free(generatedUc_rep);
			ModernizedCProgram.vim_free(generatedUc_compl_arg);
		}
		gap/*
		 * ":delcommand" implementation
		 */.ga_clear();
	}
	public int did_match_already(int idx) {
		int i;
		for (i = ModernizedCProgram.current_state.getGa_len(); --i >= 0; ) {
			if (((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[i].getSi_m_startcol() == (int)ModernizedCProgram.current_col && ((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[i].getSi_m_lnum() == (int)ModernizedCProgram.current_lnum && ((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[i].getSi_idx() == idx) {
				return 1;
			} 
		}
		Object generatedGa_data = this.getGa_data();
		int generatedGa_len = this.getGa_len();
		for (i = generatedGa_len; --i >= /* Zero-width matches with a nextgroup argument are not put on the syntax
		     * stack, and can only be matched once anyway. */0; ) {
			if (((int)(generatedGa_data))[i] == idx) {
				return 1;
			} 
		}
		return 0/*
		 * Push the next match onto the stack.
		 */;
	}
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * testing.c: Support for tests.
	 */
	/*
	 * Prepare "gap" for an assert error and add the sourcing position.
	 */
	public void prepare_assert_error() {
		byte[] buf = new byte[65];
		gap.ga_init2(1, 100);
		if (sourcing_name != ((Object)0)) {
			gap.ga_concat(sourcing_name);
			if (sourcing_lnum > 0) {
				gap.ga_concat((char_u)" ");
			} 
		} 
		if (sourcing_lnum > 0) {
			.sprintf(buf, "line %ld", (long)sourcing_lnum);
			gap.ga_concat((char_u)buf);
		} 
		if (sourcing_name != ((Object)0) || sourcing_lnum > 0) {
			gap.ga_concat((char_u)": "/*
			 * Append "p[clen]" to "gap", escaping unprintable characters.
			 * Changes NL to \n, CR to \r, etc.
			 */);
		} 
	}
	public void ga_concat_esc(Object p, int clen) {
		char_u[] buf = new char_u();
		if (clen > 1) {
			.memmove((byte)(buf), (byte)(p), (size_t)(clen));
			buf[clen] = (byte)'\000';
			gap.ga_concat(buf);
		} else {
				switch (p) {
				case (byte)'\014':
						gap.ga_concat((char_u)"\\f");
						break;
				case (byte)'\\':
						gap.ga_concat((char_u)"\\\\");
						break;
				case (byte)'\011':
						gap.ga_concat((char_u)"\\t");
						break;
				case (byte)'\012':
						gap.ga_concat((char_u)"\\n");
						break;
				case (byte)'\010':
						gap.ga_concat((char_u)"\\b");
						break;
				case (byte)'\033':
						gap.ga_concat((char_u)"\\e");
						break;
				case (byte)'\015':
						gap.ga_concat((char_u)"\\r");
						break;
				default:
						if (p < (byte)' ') {
							ModernizedCProgram.vim_snprintf((byte)buf, 65, "\\x%02x", p);
							gap.ga_concat(buf);
						} else {
								gap.ga_append(p);
						} 
						break;
				}
		} 
	}
	public void ga_concat_shorten_esc(Object str) {
		char_u p = new char_u();
		char_u s = new char_u();
		int c;
		int clen;
		char_u[] buf = new char_u();
		int same_len;
		if (str == ((Object)0)) {
			gap.ga_concat((char_u)"NULL");
			return ;
		} 
		for (p = str; p != (byte)'\000'; ++p) {
			same_len = 1;
			s = p;
			c = ModernizedCProgram.mb_ptr2char_adv(s);
			clen = s - p;
			while (s != (byte)'\000' && c == .mb_ptr2char(s)) {
				++same_len;
				s += clen;
			}
			if (same_len > 20) {
				gap.ga_concat((char_u)"\\[");
				gap.ga_concat_esc(p, clen);
				gap.ga_concat((char_u)" occurs ");
				ModernizedCProgram.vim_snprintf((byte)buf, 65, "%d", same_len);
				gap.ga_concat(buf);
				gap.ga_concat((char_u)" times]");
				p = s - 1;
			} else {
					gap.ga_concat_esc(p, clen/*
					 * Fill "gap" with information about an assert error.
					 */);
			} 
		}
	}
	public int getGa_len() {
		return ga_len;
	}
	public void setGa_len(int newGa_len) {
		ga_len = newGa_len;
	}
	public int getGa_maxlen() {
		return ga_maxlen;
	}
	public void setGa_maxlen(int newGa_maxlen) {
		ga_maxlen = newGa_maxlen;
	}
	public int getGa_itemsize() {
		return ga_itemsize;
	}
	public void setGa_itemsize(int newGa_itemsize) {
		ga_itemsize = newGa_itemsize;
	}
	public int getGa_growsize() {
		return ga_growsize;
	}
	public void setGa_growsize(int newGa_growsize) {
		ga_growsize = newGa_growsize;
	}
	public Object getGa_data() {
		return ga_data;
	}
	public void setGa_data(Object newGa_data) {
		ga_data = newGa_data;
	}
}
