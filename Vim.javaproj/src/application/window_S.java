package application;

/*
 * Structure which contains all information that belongs to a window
 *
 * All row numbers are relative to the start of the window, except w_winrow.
 */
public class window_S {
	private int w_id;
	private file_buffer w_buffer;
	private window_S w_prev;
	private window_S w_next;
	private int w_closing;
	private frame_S w_frame;
	private  w_cursor;
	private Object w_curswant;
	private int w_set_curswant;
	private byte w_old_visual_mode;
	private Object w_old_cursor_lnum;
	private Object w_old_cursor_fcol;
	private Object w_old_cursor_lcol;
	private Object w_old_visual_lnum;
	private Object w_old_visual_col;
	private Object w_old_curswant;
	private Object w_topline;
	private byte w_topline_was_set;
	private Object w_leftcol;
	private Object w_skipcol;
	private int w_winrow;
	private int w_height;
	private int w_status_height;
	private int w_wincol;
	private int w_width;
	private int w_vsep_width;
	private  w_save_cursor;
	private int w_valid;
	private  w_valid_cursor;
	private Object w_valid_leftcol;
	private int w_cline_height;
	private int w_cline_row;
	private Object w_virtcol;
	private int w_wrow;
	private int w_wcol;
	private Object w_botline;
	private int w_empty_rows;
	private int w_lines_valid;
	private w_line[] w_lines;
	private int w_redr_type;
	private int w_upd_rows;
	private Object w_redraw_top;
	private Object w_redraw_bot;
	private int w_redr_status;
	private int w_alt_fnum;
	private arglist w_alist;
	private int w_arg_idx;
	private int w_arg_idx_invalid;
	private Object w_localdir;
	private  w_onebuf_opt;
	private  w_allbuf_opt;
	private long w_p_siso;
	private long w_p_so;
	private long w_scbind_pos;
	private  w_pcmark;
	private  w_prev_pcmark;
	private Object w_tagstack;
	private int w_tagstackidx;
	private int w_tagstacklen;
	private int w_fraction;
	private int w_prev_fraction_row;
	
	public window_S(int w_id, file_buffer w_buffer, window_S w_prev, window_S w_next, int w_closing, frame_S w_frame,  w_cursor, Object w_curswant, int w_set_curswant, byte w_old_visual_mode, Object w_old_cursor_lnum, Object w_old_cursor_fcol, Object w_old_cursor_lcol, Object w_old_visual_lnum, Object w_old_visual_col, Object w_old_curswant, Object w_topline, byte w_topline_was_set, Object w_leftcol, Object w_skipcol, int w_winrow, int w_height, int w_status_height, int w_wincol, int w_width, int w_vsep_width,  w_save_cursor, int w_valid,  w_valid_cursor, Object w_valid_leftcol, int w_cline_height, int w_cline_row, Object w_virtcol, int w_wrow, int w_wcol, Object w_botline, int w_empty_rows, int w_lines_valid, w_line[] w_lines, int w_redr_type, int w_upd_rows, Object w_redraw_top, Object w_redraw_bot, int w_redr_status, int w_alt_fnum, arglist w_alist, int w_arg_idx, int w_arg_idx_invalid, Object w_localdir,  w_onebuf_opt,  w_allbuf_opt, long w_p_siso, long w_p_so, long w_scbind_pos,  w_pcmark,  w_prev_pcmark, Object w_tagstack, int w_tagstackidx, int w_tagstacklen, int w_fraction, int w_prev_fraction_row) {
		setW_id(w_id);
		setW_buffer(w_buffer);
		setW_prev(w_prev);
		setW_next(w_next);
		setW_closing(w_closing);
		setW_frame(w_frame);
		setW_cursor(w_cursor);
		setW_curswant(w_curswant);
		setW_set_curswant(w_set_curswant);
		setW_old_visual_mode(w_old_visual_mode);
		setW_old_cursor_lnum(w_old_cursor_lnum);
		setW_old_cursor_fcol(w_old_cursor_fcol);
		setW_old_cursor_lcol(w_old_cursor_lcol);
		setW_old_visual_lnum(w_old_visual_lnum);
		setW_old_visual_col(w_old_visual_col);
		setW_old_curswant(w_old_curswant);
		setW_topline(w_topline);
		setW_topline_was_set(w_topline_was_set);
		setW_leftcol(w_leftcol);
		setW_skipcol(w_skipcol);
		setW_winrow(w_winrow);
		setW_height(w_height);
		setW_status_height(w_status_height);
		setW_wincol(w_wincol);
		setW_width(w_width);
		setW_vsep_width(w_vsep_width);
		setW_save_cursor(w_save_cursor);
		setW_valid(w_valid);
		setW_valid_cursor(w_valid_cursor);
		setW_valid_leftcol(w_valid_leftcol);
		setW_cline_height(w_cline_height);
		setW_cline_row(w_cline_row);
		setW_virtcol(w_virtcol);
		setW_wrow(w_wrow);
		setW_wcol(w_wcol);
		setW_botline(w_botline);
		setW_empty_rows(w_empty_rows);
		setW_lines_valid(w_lines_valid);
		setW_lines(w_lines);
		setW_redr_type(w_redr_type);
		setW_upd_rows(w_upd_rows);
		setW_redraw_top(w_redraw_top);
		setW_redraw_bot(w_redraw_bot);
		setW_redr_status(w_redr_status);
		setW_alt_fnum(w_alt_fnum);
		setW_alist(w_alist);
		setW_arg_idx(w_arg_idx);
		setW_arg_idx_invalid(w_arg_idx_invalid);
		setW_localdir(w_localdir);
		setW_onebuf_opt(w_onebuf_opt);
		setW_allbuf_opt(w_allbuf_opt);
		setW_p_siso(w_p_siso);
		setW_p_so(w_p_so);
		setW_scbind_pos(w_scbind_pos);
		setW_pcmark(w_pcmark);
		setW_prev_pcmark(w_prev_pcmark);
		setW_tagstack(w_tagstack);
		setW_tagstackidx(w_tagstackidx);
		setW_tagstacklen(w_tagstacklen);
		setW_fraction(w_fraction);
		setW_prev_fraction_row(w_prev_fraction_row);
	}
	public window_S() {
	}
	
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *			Visual Workshop integration by Gordon Prieur
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * Find text under the mouse position "row" / "col".
	 * If "getword" is TRUE the returned text in "*textp" is not the whole line but
	 * the relevant word in allocated memory.
	 * Return OK if found.
	 * Return FAIL if not found, no text at the mouse position.
	 */
	public int find_word_under_cursor(int mouserow, int mousecol, int getword, int flags, Object lnump, Object textp, Integer colp, Integer startcolp) {
		// can be NULL// column where mouse hovers, can be NULL// column where text starts, can be NULLint row = mouserow;
		int col = mousecol;
		int scol;
		win_T wp = new win_T();
		char_u lbuf = new char_u();
		linenr_T lnum = new linenr_T();
		textp = ((Object)0);
		wp = /*Error: Function owner not recognized*/mouse_find_win(row, col, .FAIL_POPUP);
		int generatedW_height = wp.getW_height();
		int generatedW_width = wp.getW_width();
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedLnum = spos.getLnum();
		Object generatedCol = spos.getCol();
		if (wp != ((Object)0) && row >= 0 && row < generatedW_height && col < generatedW_width) {
			if (!/*Error: Function owner not recognized*/mouse_comp_pos(wp, row, col, lnum, ((Object)0))) {
				lbuf = generatedW_buffer.ml_get_buf(lnum, 0);
				if (col <= wp.win_linetabsize(lbuf, (colnr_T)INT_MAX)) {
					if (getword) {
						int len;
						pos_T spos = ((Object)0);
						pos_T epos = ((Object)0);
						if (VIsual_active) {
							if ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
								spos = ModernizedCProgram.VIsual;
								epos = ModernizedCProgram.curwin.getW_cursor();
							} else {
									spos = ModernizedCProgram.curwin.getW_cursor();
									epos = ModernizedCProgram.VIsual;
							} 
						} 
						col = /*Error: Function owner not recognized*/vcol2col(wp, lnum, col);
						scol = col;
						if (VIsual_active && generatedW_buffer == generatedW_buffer && (lnum == generatedLnum ? col >= (int)generatedCol : lnum > generatedLnum) && (lnum == generatedLnum ? col <= (int)generatedCol : lnum < generatedLnum)) {
							if (generatedLnum != generatedLnum || generatedCol == generatedCol) {
								return 0;
							} 
							lbuf = generatedW_buffer.ml_get_buf(generatedLnum, 0);
							len = generatedCol - generatedCol;
							if (ModernizedCProgram.p_sel != (byte)'e') {
								len += /*Error: Function owner not recognized*/mb_ptr2len(lbuf + generatedCol);
							} 
							lbuf = ModernizedCProgram.vim_strnsave(lbuf + generatedCol, len);
							lnum = generatedLnum;
							col = generatedCol;
							scol = col;
						} else {
								++emsg_off;
								len = wp.find_ident_at_pos(lnum, (colnr_T)col, lbuf, scol, flags);
								--emsg_off;
								if (len == 0) {
									return 0;
								} 
								lbuf = ModernizedCProgram.vim_strnsave(lbuf, len);
						} 
					} 
					if (winp != ((Object)0)) {
						winp = wp;
					} 
					if (lnump != ((Object)0)) {
						lnump = lnum;
					} 
					textp = lbuf;
					if (colp != ((Object)0)) {
						colp = col;
					} 
					if (startcolp != ((Object)0)) {
						startcolp = scol;
					} 
					return 1;
				} 
			} 
		} 
		// Found a window and the cursor is in the text.  Now find the line
		return 0;/*
		 * Get the text and position to be evaluated for "beval".
		 * If "getword" is TRUE the returned text is not the whole line but the
		 * relevant word in allocated memory.
		 * Returns OK or FAIL.
		 */
	}
	// flags for find_ident_at_pos()
	// can be NULL
	/* Exported folding functions. {{{1 */
	/* copyFoldingState() {{{2 */
	/*
	 * Copy that folding state from window "wp_from" to window "wp_to".
	 */
	public void copyFoldingState(window_S wp_to) {
		Object generatedW_fold_manual = this.getW_fold_manual();
		wp_to.setW_fold_manual(generatedW_fold_manual);
		Object generatedW_foldinvalid = this.getW_foldinvalid();
		wp_to.setW_foldinvalid(generatedW_foldinvalid);
		Object generatedW_folds = this.getW_folds();
		generatedW_folds.cloneFoldGrowArray(generatedW_folds);
	}
	public int hasAnyFolding() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fen = generatedW_onebuf_opt.getWo_fen();
		Object generatedW_folds = this.getW_folds();
		return (generatedWo_fen && (!win.foldmethodIsManual() || generatedW_folds.getGa_len() > 0/* hasFolding() {{{2 *//*
		 * Return TRUE if line "lnum" in the current window is part of a closed
		 * fold.
		 * When returning TRUE, *firstp and *lastp are set to the first and last
		 * lnum of the sequence of folded lines (skipped when NULL).
		 */));
	}
	public int lineFolded(Object lnum) {
		return ModernizedCProgram.foldedCount(win, lnum, ((Object)0)) != 0/* foldedCount() {{{2 *//*
		 * Count the number of lines that are folded at line number "lnum".
		 * Normally "lnum" is the first line of a possible fold, and the returned
		 * number is the number of lines in the fold.
		 * Doesn't use caching from the displayed window.
		 * Returns number of folded lines from "lnum", or 0 if line is not folded.
		 * When "infop" is not NULL, fills *infop with the fold level info.
		 */;
	}
	public int foldmethodIsManual() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[3] == (byte)'u'/* foldmethodIsIndent() {{{2 *//*
		 * Return TRUE if 'foldmethod' is "indent"
		 */);
	}
	public int foldmethodIsIndent() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[0] == (byte)'i'/* foldmethodIsExpr() {{{2 *//*
		 * Return TRUE if 'foldmethod' is "expr"
		 */);
	}
	public int foldmethodIsExpr() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[1] == (byte)'x'/* foldmethodIsMarker() {{{2 *//*
		 * Return TRUE if 'foldmethod' is "marker"
		 */);
	}
	public int foldmethodIsMarker() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[2] == (byte)'r'/* foldmethodIsSyntax() {{{2 *//*
		 * Return TRUE if 'foldmethod' is "syntax"
		 */);
	}
	public int foldmethodIsSyntax() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[0] == (byte)'s'/* foldmethodIsDiff() {{{2 *//*
		 * Return TRUE if 'foldmethod' is "diff"
		 */);
	}
	public int foldmethodIsDiff() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		return (generatedWo_fdm[0] == (byte)'d'/* closeFold() {{{2 *//*
		 * Close fold for current window at line "lnum".
		 * Repeat "count" times.
		 */);
	}
	/* depends on 'foldlevel' (nested folds too) */
	/* maximum fold depth */
	/* static functions {{{2 */
	public void newFoldLevelWin() {
		fold_T fp = new fold_T();
		int i;
		wp.checkupdate();
		Object generatedW_fold_manual = this.getW_fold_manual();
		Object generatedW_folds = this.getW_folds();
		if (generatedW_fold_manual) {
			fp = (fold_T)generatedW_folds.getGa_data();
			for (i = 0; i < generatedW_folds.getGa_len(); ++i) {
				fp[i].setFd_flags(2);
			}
			this.setW_fold_manual(0);
		} 
		wp/* foldCheckClose() {{{2 *//*
		 * Apply 'foldlevel' to all folds that don't contain the cursor.
		 */.changed_window_setting_win();
	}
	public void clearFolding() {
		Object generatedW_folds = this.getW_folds();
		generatedW_folds.deleteFoldRecurse();
		this.setW_foldinvalid(0/* foldUpdate() {{{2 *//*
		 * Update folds for changes in the buffer of a window.
		 * Note that inserted/deleted lines must have already been taken care of by
		 * calling foldMarkAdjust().
		 * The changes in lines from top to bot (inclusive).
		 */);
	}
	public void foldUpdate(Object top, Object bot) {
		fold_T fp = new fold_T();
		if (disable_fold_update > 0) {
			return /*Error: Unsupported expression*/;
		} 
		if (need_diff_redraw) {
			return /*Error: Unsupported expression*/;
		} 
		// will update later
		Object generatedW_folds = this.getW_folds();
		(Object)ModernizedCProgram.foldFind(generatedW_folds, top, /* Mark all folds from top to bot as maybe-small. */fp);
		Object generatedFd_top = fp.getFd_top();
		while (fp < (fold_T)generatedW_folds.getGa_data() + generatedW_folds.getGa_len() && generatedFd_top < bot) {
			fp.setFd_small(2);
			++fp;
		}
		if (wp.foldmethodIsIndent() || wp.foldmethodIsExpr() || wp.foldmethodIsMarker() || wp.foldmethodIsDiff() || wp.foldmethodIsSyntax()) {
			int save_got_int = got_int;
			got_int = /* reset got_int here, otherwise it won't work */0;
			wp.foldUpdateIEMS(top, bot);
			got_int |=  save_got_int/* foldUpdateAll() {{{2 *//*
			 * Update all lines in a window for folding.
			 * Used when a fold setting changes or after reloading the buffer.
			 * The actual updating is postponed until fold info is used, to avoid doing
			 * every time a setting is changed or a syntax item is added.
			 */;
		} 
	}
	public void foldUpdateAll() {
		this.setW_foldinvalid(1);
		win.redraw_win_later(40/* foldMoveTo() {{{2 *//*
		 * If "updown" is FALSE: Move to the start or end of the fold.
		 * If "updown" is TRUE: move to fold at the same level.
		 * If not moved return FAIL.
		 */);
	}
	public void foldInitWin() {
		Object generatedW_folds = this.getW_folds();
		generatedW_folds.ga_init2((int)/*Error: Unsupported expression*/, 10/* find_wl_entry() {{{2 *//*
		 * Find an entry in the win->w_lines[] array for buffer line "lnum".
		 * Only valid entries are considered (for entries where wl_valid is FALSE the
		 * line number can be wrong).
		 * Returns index of entry or -1 if not found.
		 */);
	}
	public int find_wl_entry(Object lnum) {
		int i;
		int generatedW_lines_valid = this.getW_lines_valid();
		w_line[] generatedW_lines = this.getW_lines();
		for (i = 0; i < generatedW_lines_valid; ++i) {
			if (generatedW_lines[i].getWl_valid()) {
				if (lnum < generatedW_lines[i].getWl_lnum()) {
					return -1;
				} 
				if (lnum <= generatedW_lines[i].getWl_lastlnum()) {
					return i;
				} 
			} 
		}
		return -1/* foldAdjustVisual() {{{2 *//*
		 * Adjust the Visual area to include any fold at the start or end completely.
		 */;
	}
	public int foldLevelWin(Object lnum) {
		fold_T fp = new fold_T();
		linenr_T lnum_rel = lnum;
		int level = 0;
		garray_T gap = new garray_T();
		Object generatedW_folds = this.getW_folds();
		gap = generatedW_folds;
		Object generatedFd_nested = fp.getFd_nested();
		Object generatedFd_top = fp.getFd_top();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (!ModernizedCProgram.foldFind(gap, lnum_rel, fp)) {
				break;
			} 
			gap = generatedFd_nested;
			lnum_rel -= generatedFd_top;
			++level;
		}
		return level/* checkupdate() {{{2 *//*
		 * Check if the folds in window "wp" are invalid and update them if needed.
		 */;
	}
	public void checkupdate() {
		Object generatedW_foldinvalid = this.getW_foldinvalid();
		if (generatedW_foldinvalid) {
			wp.foldUpdate((linenr_T)1, (linenr_T)/* will update all */LONG_MAX);
			this.setW_foldinvalid(0/* setFoldRepeat() {{{2 *//*
			 * Open or close fold for current window at line "lnum".
			 * Repeat "count" times.
			 */);
		} 
	}
	public Object setManualFoldWin(Object lnum, int opening, int recurse, Integer donep) {
		/* TRUE when closing/opening recursive */fold_T fp = new fold_T();
		fold_T fp2 = new fold_T();
		fold_T found = ((Object)0);
		int j;
		int level = 0;
		int use_level = 0;
		int found_fold = 0;
		garray_T gap = new garray_T();
		linenr_T next = LONG_MAX;
		linenr_T off = 0;
		int done = 0;
		wp/*
		     * Find the fold, open or close it.
		     */.checkupdate();
		Object generatedW_folds = this.getW_folds();
		gap = generatedW_folds;
		Object generatedGa_data = gap.getGa_data();
		int generatedGa_len = gap.getGa_len();
		Object generatedFd_top = fp.getFd_top();
		Object generatedFd_flags = fp.getFd_flags();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdl = generatedW_onebuf_opt.getWo_fdl();
		Object generatedFd_nested = fp.getFd_nested();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (!ModernizedCProgram.foldFind(gap, lnum, fp)) {
				if (fp < (fold_T)generatedGa_data + generatedGa_len) {
					next = generatedFd_top + off;
				} 
				break;
			} 
			found_fold = /* lnum is inside this fold */1;
			if (fp + 1 < (fold_T)generatedGa_data + generatedGa_len) {
				next = generatedFd_top + off;
			} 
			if (use_level || generatedFd_flags == /* Change from level-dependent folding to manual. */2) {
				use_level = 1;
				if (level >= generatedWo_fdl) {
					fp.setFd_flags(1);
				} else {
						fp.setFd_flags(0);
				} 
				fp2 = (fold_T)generatedGa_data;
				for (j = 0; j < generatedGa_len; ++j) {
					fp2[j].setFd_flags(2);
				}
			} 
			if (!opening && /* Simple case: Close recursively means closing the fold. */recurse) {
				if (generatedFd_flags != 1) {
					done |=  1;
					fp.setFd_flags(1);
				} 
			}  else if (generatedFd_flags == 1) {
				if (/* When opening, open topmost closed fold. */opening) {
					fp.setFd_flags(0);
					done |=  1;
					if (recurse) {
						fp.foldOpenNested();
					} 
				} 
				break;
			} 
			found = /* fold is open, check nested folds */fp;
			gap = generatedFd_nested;
			lnum -= generatedFd_top;
			off += generatedFd_top;
			++level;
		}
		if (found_fold) {
			if (!opening && found != ((Object)/* When closing and not recurse, close deepest open fold. */0)) {
				found.setFd_flags(1);
				done |=  1;
			} 
			this.setW_fold_manual(1);
			if (done & 1) {
				wp.changed_window_setting_win();
			} 
			done |=  2;
		}  else if (donep == ((Object)0) && wp == ModernizedCProgram.curwin) {
			ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_nofold)));
		} 
		if (donep != ((Object)0)) {
			donep |=  done;
		} 
		return next/* foldOpenNested() {{{2 *//*
		 * Open all nested folds in fold "fpr" recursively.
		 */;
	}
	/* TRUE when opening, FALSE when closing */
	public void foldMarkAdjust(Object line1, Object line2, long amount, long amount_after) {
		if (amount == LONG_MAX && line2 >= line1 && line2 - line1 >= -/* If deleting marks from line1 to line2, but not deleting all those
		     * lines, set line2 so that only deleted lines have their folds removed. */amount_after) {
			line2 = line1 - amount_after - 1/* If appending a line in Insert mode, it should be included in the fold
			     * just above the line. */;
		} 
		if ((State & -1024) && amount == (linenr_T)1 && line2 == LONG_MAX) {
			--line1;
		} 
		Object generatedW_folds = this.getW_folds();
		generatedW_folds.foldMarkAdjustRecurse(line1, line2, amount, amount_after);
	}
	public void foldUpdateIEMS(Object top, Object bot) {
		linenr_T start = new linenr_T();
		linenr_T end = new linenr_T();
		fline_T fline = new fline_T();
		Object getlevel;
		int level;
		fold_T fp = new fold_T();
		if (ModernizedCProgram.invalid_top != (linenr_T)/* Avoid problems when being called recursively. */0) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedW_foldinvalid = this.getW_foldinvalid();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_folds = this.getW_folds();
		if (generatedW_foldinvalid) {
			top = /* Need to update all folds. */1;
			bot = generatedMl_line_count;
			this.setW_foldinvalid(0);
			generatedW_folds.setSmallMaybe();
		} 
		if (/* add the context for "diff" folding */wp.foldmethodIsDiff()) {
			if (top > diff_context) {
				top -= diff_context;
			} else {
					top = 1;
			} 
			bot += diff_context;
		} 
		if (top > generatedMl_line_count) {
			top = generatedMl_line_count;
		} 
		ModernizedCProgram.fold_changed = 0;
		fline.setWp(wp);
		fline.setOff(0);
		fline.setLvl(0);
		fline.setLvl_next(-1);
		fline.setStart(0);
		fline.setEnd(20 + 1);
		fline.setHad_end(20 + 1);
		ModernizedCProgram.invalid_top = top;
		ModernizedCProgram.invalid_bot = bot;
		Object generatedLvl = fline.getLvl();
		Object generatedLvl_next = fline.getLvl_next();
		Object generatedLnum = fline.getLnum();
		if (wp.foldmethodIsMarker()) {
			getlevel = ModernizedCProgram.foldlevelMarker;
			/* Init marker variables to speed up foldlevelMarker(). */wp.parseMarker();
			if (top > /* Need to get the level of the line above top, it is used if there is
				 * no marker at the top. */1) {
				level = wp.foldLevelWin(top - /* Get the fold level at top - 1. */1);
				fline.setLnum(top - /* The fold may end just above the top, check for that. */1);
				fline.setLvl(level);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getlevel(fline/* If a fold started here, we already had the level, if it stops
					     * here, we need to use lvl_next.  Could also start and end a fold
					     * in the same line. */);
				if (generatedLvl > level) {
					fline.setLvl(level - (generatedLvl - generatedLvl_next));
				} else {
						fline.setLvl(generatedLvl_next);
				} 
			} 
			fline.setLnum(top);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getlevel(fline);
		} else {
				fline.setLnum(top);
				if (wp.foldmethodIsExpr()) {
					getlevel = ModernizedCProgram.foldlevelExpr/* start one line back, because a "<1" may indicate the end of a
						     * fold in the topline */;
					if (top > 1) {
						--generatedLnum;
					} 
				}  else if (wp.foldmethodIsSyntax()) {
					getlevel = ModernizedCProgram.foldlevelSyntax;
				}  else if (wp.foldmethodIsDiff()) {
					getlevel = ModernizedCProgram.foldlevelDiff;
				} else {
						getlevel = ModernizedCProgram.foldlevelIndent;
				} 
				fline.setLvl(-/* Backup to a line for which the fold level is defined.  Since it's
					 * always defined for line one, we will stop there. */1);
				for (; !got_int; --generatedLnum) {
					fline.setLvl_next(-/* Reset lvl_next each time, because it will be set to a value for
						     * the next line, but we search backwards here. */1);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getlevel(fline);
					if (generatedLvl >= 0) {
						break;
					} 
				}
		} 
		Object generatedFd_top = fpn.getFd_top();
		Object generatedFd_nested = fpn.getFd_nested();
		Object generatedFd_len = fpn.getFd_len();
		if (ModernizedCProgram.foldlevelSyntax == getlevel) {
			garray_T gap = generatedW_folds;
			fold_T fpn = ((Object)0);
			int current_fdl = 0;
			linenr_T fold_start_lnum = 0;
			linenr_T lnum_rel = generatedLnum;
			while (current_fdl < generatedLvl) {
				if (!ModernizedCProgram.foldFind(gap, lnum_rel, fpn)) {
					break;
				} 
				++current_fdl;
				fold_start_lnum += generatedFd_top;
				gap = generatedFd_nested;
				lnum_rel -= generatedFd_top;
			}
			if (fpn != ((Object)0) && current_fdl == generatedLvl) {
				linenr_T fold_end_lnum = fold_start_lnum + generatedFd_len;
				if (fold_end_lnum > bot) {
					bot = fold_end_lnum;
				} 
			} 
		} 
		start = generatedLnum;
		end = bot;
		if (start > end && end < generatedMl_line_count) {
			end = start;
		} 
		while (!got_int) {
			if (generatedLnum > generatedMl_line_count) {
				break;
			} 
			if (generatedLnum > end/* For "marker", "expr"  and "syntax"  methods: If a change caused
				     * a fold to be removed, we need to continue at least until where
				     * it ended. */) {
				if (getlevel != ModernizedCProgram.foldlevelMarker && getlevel != ModernizedCProgram.foldlevelSyntax && getlevel != ModernizedCProgram.foldlevelExpr) {
					break;
				} 
				if ((start <= end && ModernizedCProgram.foldFind(generatedW_folds, end, fp) && generatedFd_top + generatedFd_len - 1 > end) || (generatedLvl == 0 && ModernizedCProgram.foldFind(generatedW_folds, generatedLnum, fp) && generatedFd_top < generatedLnum)) {
					end = generatedFd_top + generatedFd_len - 1;
				}  else if (getlevel == ModernizedCProgram.foldlevelSyntax && wp.foldLevelWin(generatedLnum) != generatedLvl) {
					end = generatedLnum;
				} else {
						break;
				} 
			} 
			if (generatedLvl > /* A level 1 fold starts at a line with foldlevel > 0. */0) {
				ModernizedCProgram.invalid_top = generatedLnum;
				ModernizedCProgram.invalid_bot = end;
				end = ModernizedCProgram.foldUpdateIEMSRecurse(generatedW_folds, 1, start, fline, getlevel, end, 2);
				start = generatedLnum;
			} else {
					if (generatedLnum == generatedMl_line_count) {
						break;
					} 
					++generatedLnum;
					fline.setLvl(generatedLvl_next);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/getlevel(fline);
			} 
		}
		generatedW_folds.foldRemove(start, /* There can't be any folds from start until end now. */end);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fen = generatedW_onebuf_opt.getWo_fen();
		if (ModernizedCProgram.fold_changed && generatedWo_fen) {
			wp/* If we updated folds past "bot", need to redraw more lines.  Don't do
			     * this in other situations, the changed lines will be redrawn anyway and
			     * this method can cause the whole window to be updated. */.changed_window_setting_win();
		} 
		Object generatedW_redraw_top = this.getW_redraw_top();
		Object generatedW_redraw_bot = this.getW_redraw_bot();
		if (end != bot) {
			if (generatedW_redraw_top == 0 || generatedW_redraw_top > top) {
				this.setW_redraw_top(top);
			} 
			if (generatedW_redraw_bot < end) {
				this.setW_redraw_bot(end);
			} 
		} 
		ModernizedCProgram.invalid_top = (linenr_T)0/* foldUpdateIEMSRecurse() {{{2 *//*
		 * Update a fold that starts at "flp->lnum".  At this line there is always a
		 * valid foldlevel, and its level >= "level".
		 * "flp" is valid for "flp->lnum" when called and it's valid when returning.
		 * "flp->lnum" is set to the lnum just below the fold, if it ends before
		 * "bot", it's "bot" plus one if the fold continues and it's bigger when using
		 * the marker method and a text change made following folds to change.
		 * When returning, "flp->lnum_save" is the line number that was used to get
		 * the level when the level at "flp->lnum" is invalid.
		 * Remove any folds from "startlnum" up to here at this level.
		 * Recursively update nested folds.
		 * Below line "bot" there are no changes in the text.
		 * "flp->lnum", "flp->lnum_save" and "bot" are relative to the start of the
		 * outer fold.
		 * "flp->off" is the offset to the real line number in the buffer.
		 *
		 * All this would be a lot simpler if all folds in the range would be deleted
		 * and then created again.  But we would lose all information about the
		 * folds, even when making changes that don't affect the folding (e.g. "vj~").
		 *
		 * Returns bot, which may have been increased for lines that also need to be
		 * updated as a result of a detected change in the fold.
		 */;
	}
	public void parseMarker() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fmr = generatedW_onebuf_opt.getWo_fmr();
		ModernizedCProgram.foldendmarker = ModernizedCProgram.vim_strchr(generatedWo_fmr, (byte)',');
		ModernizedCProgram.foldstartmarkerlen = (int)(ModernizedCProgram.foldendmarker++ - generatedWo_fmr);
		ModernizedCProgram.foldendmarkerlen = (int)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.foldendmarker/* foldlevelMarker() {{{2 *//*
		 * Low level function to get the foldlevel for the "marker" method.
		 * "foldendmarker", "foldstartmarkerlen" and "foldendmarkerlen" must have been
		 * set before calling this.
		 * Requires that flp->lvl is set to the fold level of the previous line!
		 * Careful: This means you can't call this function twice on the same line.
		 * Doesn't use any caching.
		 * Sets flp->start when a start marker was found.
		 */));
	}
	public int plines_win(Object lnum, int winheight) {
		return wp.plines_win_nofill(lnum, winheight) + wp.diff_check_fill(/* Check for filler lines above this buffer line.  When folded the result
		     * is one line anyway. */lnum);
	}
	/* when TRUE limit to window height */
	public int plines_win_nofill(Object lnum, int winheight) {
		/* when TRUE limit to window height */int lines;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		if (!generatedWo_wrap) {
			return 1;
		} 
		int generatedW_width = this.getW_width();
		if (generatedW_width == 0) {
			return 1;
		} 
		if (wp.lineFolded(lnum) == /* A folded lines is handled just like an empty line. *//* NOTE: Caller must handle lines that are MAYBE folded. */1) {
			return 1;
		} 
		lines = wp.plines_win_nofold(lnum);
		int generatedW_height = this.getW_height();
		if (winheight > 0 && lines > generatedW_height) {
			return (int)generatedW_height;
		} 
		return lines/*
		 * Return number of window lines physical line "lnum" will occupy in window
		 * "wp".  Does not care about folding, 'wrap' or 'diff'.
		 */;
	}
	public int plines_win_nofold(Object lnum) {
		char_u s = new char_u();
		long col;
		int width;
		file_buffer generatedW_buffer = this.getW_buffer();
		s = generatedW_buffer.ml_get_buf(lnum, 0);
		if (s == /* empty line */(byte)'\000') {
			return 1;
		} 
		col = wp.win_linetabsize(s, (colnr_T)INT_MAX/*
		     * If list mode is on, then the '$' at the end of the line may take up one
		     * extra column.
		     */);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		if (generatedWo_list && lcs_eol != (byte)'\000') {
			col += 1/*
			     * Add column offset for 'number', 'relativenumber' and 'foldcolumn'.
			     */;
		} 
		int generatedW_width = this.getW_width();
		width = generatedW_width - wp.win_col_off();
		if (width <= 0) {
			return 32000;
		} 
		if (col <= width) {
			return 1;
		} 
		col -= width;
		width += wp.win_col_off2();
		return (col + (width - 1)) / width + 1/*
		 * Like plines_win(), but only reports the number of physical screen lines
		 * used from the start of the line to the given column number.
		 */;
	}
	public int plines_win_col(Object lnum, long column) {
		long col;
		char_u s = new char_u();
		int lines = 0;
		int width;
		char_u line = new char_u();
		lines = wp.diff_check_fill(/* Check for filler lines above this buffer line.  When folded the result
		     * is one line anyway. */lnum);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		if (!generatedWo_wrap) {
			return lines + 1;
		} 
		int generatedW_width = this.getW_width();
		if (generatedW_width == 0) {
			return lines + 1;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		line = s = generatedW_buffer.ml_get_buf(lnum, 0);
		col = 0;
		while (s != (byte)'\000' && --column >= 0) {
			col += wp.win_lbr_chartabsize(line, s, (colnr_T)col, ((Object)0));
			s += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(s/*
			     * If *s is a TAB, and the TAB is not displayed as ^I, and we're not in
			     * INSERT mode, then col must be adjusted so that it represents the last
			     * screen position of the TAB.  This only fixes an error when the TAB wraps
			     * from one screen line to the next (when 'columns' is not a multiple of
			     * 'ts') -- webb.
			     */);
		}
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		if (s == (byte)'\011' && (State & -1024) && (!generatedWo_list || lcs_tab1)) {
			col += wp.win_lbr_chartabsize(line, s, (colnr_T)col, ((Object)0)) - 1/*
			     * Add column offset for 'number', 'relativenumber', 'foldcolumn', etc.
			     */;
		} 
		width = generatedW_width - wp.win_col_off();
		if (width <= 0) {
			return 9999;
		} 
		lines += 1;
		if (col > width) {
			lines += (col - width) / (width + wp.win_col_off2()) + 1;
		} 
		return lines;
	}
	public int plines_m_win(Object first, Object last) {
		int count = 0;
		Object generatedW_topline = this.getW_topline();
		Object generatedW_topfill = this.getW_topfill();
		while (first <= last) {
			int x;
			x = ModernizedCProgram.foldedCount(wp, first, ((Object)/* Check if there are any really folded lines, but also included lines
				 * that are maybe folded. */0));
			if (x > 0) {
				++/* count 1 for "+-- folded" line */count;
				first += x;
			} else {
					if (first == generatedW_topline) {
						count += wp.plines_win_nofill(first, 1) + generatedW_topfill;
					} else {
							count += wp.plines_win(first, 1);
					} 
					++first;
			} 
		}
		return (count);
	}
	public window_S tclfindwin(file_buffer buf) {
		win_T win = new win_T();
		file_buffer generatedW_buffer = win.getW_buffer();
		window_S generatedW_next = win.getW_next();
		for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
			if (generatedW_buffer == buf) {
				return win;
			} 
		}
		return /* keep current window context */ModernizedCProgram.curwin/*
		 * Do-it-all function for "::vim::command", "$buf command" and "$win command".
		 */;
	}
	public Byte tclgetwindow(Object interp) {
		Object generatedW_tcl_ref = this.getW_tcl_ref();
		return ModernizedCProgram.tclgetref(interp, (generatedW_tcl_ref), "win", (Object)win, winselfcmd);
	}
	public void tcl_window_free() {
		ref reflist = new ref();
		/* Not using Tcl, nothing to do. */
		Object generatedW_tcl_ref = this.getW_tcl_ref();
		reflist = (ref)(generatedW_tcl_ref);
		if (reflist != ModernizedCProgram.refsdeleted) {
			this.setW_tcl_ref((Object)ModernizedCProgram.refsdeleted);
			reflist.tcldelallrefs();
			this.setW_tcl_ref(((Object)0/* The End */));
		} 
	}
	public int get_breakindent_win(Object line) {
		// start of the line// cached indent valueint prev_indent = 0;
		// cached tabstop valuelong prev_ts = -1024;
		// cached pointer to linechar_u prev_line = ((Object)0);
		// changedtick of cached valuevarnumber_T prev_tick = 0;
		// cached vartabs valuesint prev_vts = ((Object)0);
		int bri = 0;
		// window width minus window margin space, i.e. what rests for text
		int generatedW_width = this.getW_width();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		int eff_wwidth = generatedW_width - ((generatedWo_nu || generatedWo_rnu) && (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'n') == ((Object)0)) ? /*Error: Function owner not recognized*/number_width(wp) + 1 : 0);
		file_buffer generatedW_buffer = this.getW_buffer();
		long generatedB_p_ts = generatedW_buffer.getB_p_ts();
		dictitem16_S generatedB_ct_di = (generatedW_buffer).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		Object generatedB_p_vts_array = generatedW_buffer.getB_p_vts_array();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		// used cached indent, unless pointer or 'tabstop' changedif (prev_line != line || prev_ts != generatedB_p_ts || prev_tick != (generatedVval.getV_number()) || prev_vts != generatedB_p_vts_array) {
			prev_line = line;
			prev_ts = generatedB_p_ts;
			prev_tick = (generatedVval.getV_number());
			prev_vts = generatedB_p_vts_array;
			prev_indent = ModernizedCProgram.get_indent_str_vtab(line, (int)generatedB_p_ts, generatedB_p_vts_array, generatedWo_list);
		} 
		Object generatedW_p_brishift = this.getW_p_brishift();
		bri = prev_indent + generatedW_p_brishift;
		Object generatedW_p_brisbr = this.getW_p_brisbr();
		// indent minus the length of the showbreak stringif (generatedW_p_brisbr) {
			bri -= ModernizedCProgram.vim_strsize(p_sbr);
		} 
		// Add offset for number column, if 'n' is in 'cpoptions'// Add offset for number column, if 'n' is in 'cpoptions'bri += wp.win_col_off2();
		Object generatedW_p_brimin = this.getW_p_brimin();
		// never indent past left window marginif (bri < 0) {
			bri = 0;
		}  else if (bri > eff_wwidth - generatedW_p_brimin) {
			bri = (eff_wwidth - generatedW_p_brimin < 0) ? 0 : eff_wwidth - generatedW_p_brimin;
		} 
		return bri/*
		 * When extra == 0: Return TRUE if the cursor is before or on the first
		 *		    non-blank in the line.
		 * When extra == 1: Return TRUE if the cursor is before the first non-blank in
		 *		    the line.
		 */;
	}
	public void margin_columns_win(Integer left_col, Integer right_col) {
		// cache previous calculations depending on w_virtcolint saved_w_virtcol;
		win_T prev_wp = new win_T();
		int prev_left_col;
		int prev_right_col;
		int prev_col_off;
		int cur_col_off = wp.win_col_off();
		int width1;
		int width2;
		Object generatedW_virtcol = this.getW_virtcol();
		if (saved_w_virtcol == generatedW_virtcol && prev_wp == wp && prev_col_off == cur_col_off) {
			right_col = prev_right_col;
			left_col = prev_left_col;
			return /*Error: Unsupported expression*/;
		} 
		int generatedW_width = this.getW_width();
		width1 = generatedW_width - cur_col_off;
		width2 = width1 + wp.win_col_off2();
		left_col = 0;
		right_col = width1;
		if (generatedW_virtcol >= (colnr_T)width1) {
			right_col = width1 + ((generatedW_virtcol - width1) / width2 + 1) * width2;
		} 
		if (generatedW_virtcol >= (colnr_T)width1 && width2 > 0) {
			left_col = (generatedW_virtcol - width1) / width2 * width2 + width1;
		} 
		// cache values// cache valuesprev_left_col = left_col;
		prev_right_col = right_col;
		prev_wp = wp;
		saved_w_virtcol = generatedW_virtcol;
		prev_col_off = cur_col_off/*
		 * Get information needed to display the sign in line 'lnum' in window 'wp'.
		 * If 'nrcol' is TRUE, the sign is going to be displayed in the number column.
		 * Otherwise the sign is going to be displayed in the sign column.
		 */;
	}
	public int win_line(Object lnum, int startrow, int endrow, int nochange, int number_only) {
		// not updating for changed text// only update the number column// visual column on screenint col = 0;
		// offset in ScreenLines/ScreenAttrsint off;
		// init for GCCint c = 0;
		// virtual column (for tabs)long vcol = 0;
		// virtual column after showbreaklong vcol_sbr = -1;
		// "vcol" of previous characterlong vcol_prev = -1;
		// current linechar_u line = new char_u();
		// current position in "line"char_u ptr = new char_u();
		// row in the window, excl w_winrowint row;
		// row on the screen, incl w_winrowint screen_row;
		// "%ld " and 'fdc' must fit in herechar_u[] extra = new char_u();
		// number of extra charsint n_extra = 0;
		// string of extra chars, plus NULchar_u p_extra = ((Object)0);
		// p_extra needs to be freedchar_u p_extra_free = ((Object)0);
		// extra chars, all the sameint c_extra = (byte)'\000';
		// final char, mandatory if setint c_final = (byte)'\000';
		// attributes when n_extra != 0int extra_attr = 0;
		// used for p_extra whenchar_u at_end_str = (char_u)"";
		// displaying lcs_eol at end-of-line
		// lcs_eol until it's been usedint lcs_eol_one = lcs_eol;
		// lcs_prec until it's been usedint lcs_prec_todo = lcs_prec;
		// saved "extra" items for when draw_state becomes WL_LINE (again)int saved_n_extra = 0;
		char_u saved_p_extra = ((Object)0);
		int saved_c_extra = 0;
		int saved_c_final = 0;
		int saved_char_attr = 0;
		// chars with special attrint n_attr = 0;
		// char_attr saved for n_attrint saved_attr2 = 0;
		// chars with overruling special attrint n_attr3 = 0;
		// char_attr saved for n_attr3int saved_attr3 = 0;
		// nr of chars to skip for 'nowrap'int n_skip = 0;
		// start of invertingint fromcol = -10;
		// end of invertingint tocol = INT_MAX;
		// start of inverting after cursorint fromcol_prev = -2;
		// don't invert the cursorint noinvcur = 0;
		pos_T top = new pos_T();
		pos_T bot = new pos_T();
		int lnum_in_visual_area = 0;
		pos_T pos = new pos_T();
		long v;
		// attributes for next characterint char_attr = 0;
		// char_attr has priorityint attr_pri = 0;
		// Visual or incsearch highlightingint area_highlighting = 0;
		// in this line
		// attributes for Visual and incsearchint vi_attr = 0;
		// highlighting
		// attributes from 'wincolor'int wcr_attr = 0;
		// background for whole window, exceptint win_attr = 0;
		// margins and "~" lines.
		// attributes desired by highlightingint area_attr = 0;
		// attributes desired by 'hlsearch'int search_attr = 0;
		// saved attr for 'cursorcolumn'int vcol_save_attr = 0;
		// attributes desired by syntaxint syntax_attr = 0;
		// column of prev_syntax_attrint prev_syntax_col = -1;
		// syntax_attr at prev_syntax_colint prev_syntax_attr = 0;
		// this buffer has syntax highl.int has_syntax = 0;
		int save_did_emsg;
		// highlight colorcolumnint draw_color_col = 0;
		// pointer to according columns arrayint color_cols = ((Object)0);
		// 1 if highlighted char after EOLint eol_hl_off = 0;
		int text_prop_count;
		// next text property to useint text_prop_next = 0;
		textprop_T text_props = ((Object)0);
		int text_prop_idxs = ((Object)0);
		int text_props_active = 0;
		proptype_T text_prop_type = ((Object)0);
		int text_prop_attr = 0;
		int text_prop_combine = 0;
		// this buffer has spell checkingint has_spell = 0;
		int can_spell;
		// text with start of the next linechar_u[] nextline = new char_u();
		// column where nextline[] startsint nextlinecol = 0;
		// index in nextline[] where next lineint nextline_idx = 0;
		// starts
		// attributes desired by spellingint spell_attr = 0;
		// last byte with same spell_attrint word_end = 0;
		// line number for "checked_col"linenr_T checked_lnum = 0;
		// column in "checked_lnum" up to whichint checked_col = 0;
		// there are no spell errors
		// column to check for Cap wordint cap_col = -1;
		// line number where "cap_col" usedlinenr_T capcol_lnum = 0;
		// checked column for current lineint cur_checked_col = 0;
		// has extra highlightingint extra_check = 0;
		// attributes desired by multibyteint multi_attr = 0;
		// multi-byte byte lengthint mb_l = 1;
		// decoded multi-byte characterint mb_c = 0;
		// screen char is UTF-8 charint mb_utf8 = 0;
		// composing UTF-8 charsint[] u8cc = new int[6];
		// nr of filler lines to be drawnint filler_lines = 0;
		// nr of filler lines still to do + 1int filler_todo = 0;
		// type of diff highlightinghlf_T diff_hlf = (hlf_T)0;
		// first col of changed areaint change_start = INT_MAX;
		// last col of changed areaint change_end = -1;
		// start of trailing spacescolnr_T trailcol = INT_MAX;
		// overlong line, skipping first xint need_showbreak = 0;
		// chars
		// attribute for the whole lineint line_attr = 0;
		int line_attr_save;
		int sign_present = 0;
		sign_attrs_T sattr = new sign_attrs_T();
		// previous Arabic characterint prev_c = 0;
		// first composing char for prev_cint prev_c1 = 0;
		int did_line_attr = 0;
		// set when 'cursorline' activeint cul_attr = 0;
		// 'cursorlineopt' has "screenline" and cursor is in this lineint cul_screenline = 0;
		// margin columns for the screen line, needed for when 'cursorlineopt'
		// contains "screenline"int left_curline_col = 0;
		int right_curline_col = 0;
		// draw_state: items that are drawn in sequence:// nothing done yet// cmdline window column// 'foldcolumn'// column for signs
		// column for signs// line number// 'breakindent'// 'showbreak' or 'diff'// text in the line// what to draw nextint draw_state = 0;
		int screen_line_flags = 0;
		// cchar for match functionsint match_conc = 0;
		int syntax_flags = 0;
		int syntax_seqnr = 0;
		int prev_syntax_id = 0;
		int conceal_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_CONCEAL)];
		int is_concealing = 0;
		// nonexistent columns added to forceint boguscols = 0;
		// wrapping
		// offset for concealed charactersint vcol_off = 0;
		int did_wcol = 0;
		int old_boguscols = 0;
		// past the end already!if (startrow > endrow) {
			return startrow;
		} 
		row = startrow;
		int generatedW_winrow = this.getW_winrow();
		Object generatedW_winbar_height = this.getW_winbar_height();
		screen_row = row + (generatedW_winrow + generatedW_winbar_height);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_lbr = generatedW_onebuf_opt.getWo_lbr();
		Object generatedW_s = this.getW_s();
		Object generatedW_p_cc_cols = this.getW_p_cc_cols();
		Object generatedWo_spell = generatedW_onebuf_opt.getWo_spell();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedLnum = top.getLnum();
		Object generatedW_old_cursor_fcol = this.getW_old_cursor_fcol();
		Object generatedW_old_cursor_lcol = this.getW_old_cursor_lcol();
		Object generatedCol = bot.getCol();
		Object generatedColadd = bot.getColadd();
		if (!number_only) {
			extra_check = generatedWo_lbr;
			if (wp.syntax_present() && !generatedW_s.getB_syn_error() && !generatedW_s.getB_syn_slow()) {
				save_did_emsg = ModernizedCProgram.did_emsg;
				ModernizedCProgram.did_emsg = 0;
				wp.syntax_start(lnum);
				if (ModernizedCProgram.did_emsg) {
					generatedW_s.setB_syn_error(1);
				} else {
						ModernizedCProgram.did_emsg = save_did_emsg;
						if (!generatedW_s.getB_syn_slow()) {
							has_syntax = 1;
							extra_check = 1;
						} 
				} 
			} 
			color_cols = generatedW_p_cc_cols;
			if (color_cols != ((Object)0)) {
				draw_color_col = ModernizedCProgram.advance_color_col((vcol - vcol_off), color_cols);
			} 
			if (generatedWo_spell && generatedW_s.getB_p_spl() != (byte)'\000' && generatedW_s.getB_langp().getGa_len() > 0 && (byte)(generatedW_s.getB_langp().getGa_data()) != ((Object)0)) {
				has_spell = 1;
				extra_check = 1;
				nextline[150] = (byte)'\000';
				if (lnum < generatedMl_line_count) {
					line = generatedW_buffer.ml_get_buf(lnum + 1, 0);
					ModernizedCProgram.spell_cat_line(nextline + 150, line, 150);
				} 
				if (lnum == checked_lnum) {
					cur_checked_col = checked_col;
				} 
				checked_lnum = 0;
				if (lnum != capcol_lnum) {
					cap_col = -1;
				} 
				if (lnum == 1) {
					cap_col = 0;
				} 
				capcol_lnum = 0;
			} 
			if (VIsual_active && generatedW_buffer == generatedW_buffer) {
				if (((((ModernizedCProgram.curwin.getW_cursor()).getLnum() != (ModernizedCProgram.VIsual).getLnum()) ? (ModernizedCProgram.curwin.getW_cursor()).getLnum() < (ModernizedCProgram.VIsual).getLnum() : (ModernizedCProgram.curwin.getW_cursor()).getCol() != (ModernizedCProgram.VIsual).getCol() ? (ModernizedCProgram.curwin.getW_cursor()).getCol() < (ModernizedCProgram.VIsual).getCol() : (ModernizedCProgram.curwin.getW_cursor()).getColadd() < (ModernizedCProgram.VIsual).getColadd()) || (((ModernizedCProgram.curwin.getW_cursor()).getLnum() == (ModernizedCProgram.VIsual).getLnum()) && ((ModernizedCProgram.curwin.getW_cursor()).getCol() == (ModernizedCProgram.VIsual).getCol()) && ((ModernizedCProgram.curwin.getW_cursor()).getColadd() == (ModernizedCProgram.VIsual).getColadd())))) {
					top = ModernizedCProgram.curwin.getW_cursor();
					bot = ModernizedCProgram.VIsual;
				} else {
						top = ModernizedCProgram.VIsual;
						bot = ModernizedCProgram.curwin.getW_cursor();
				} 
				lnum_in_visual_area = (lnum >= generatedLnum && lnum <= generatedLnum);
				if (VIsual_mode == 22) {
					if (lnum_in_visual_area) {
						fromcol = generatedW_old_cursor_fcol;
						tocol = generatedW_old_cursor_lcol;
					} 
				} else {
						if (lnum > generatedLnum && lnum <= generatedLnum) {
							fromcol = 0;
						}  else if (lnum == generatedLnum) {
							if (VIsual_mode == (byte)'V') {
								fromcol = 0;
							} else {
									ModernizedCProgram.getvvcol(wp, top, (colnr_T)fromcol, ((Object)0), ((Object)0));
									if (top.gchar_pos() == (byte)'\000') {
										tocol = fromcol + 1;
									} 
							} 
						} 
						if (VIsual_mode != (byte)'V' && lnum == generatedLnum) {
							if (ModernizedCProgram.p_sel == (byte)'e' && generatedCol == 0 && generatedColadd == 0) {
								fromcol = -10;
								tocol = INT_MAX;
							}  else if (generatedCol == INT_MAX) {
								tocol = INT_MAX;
							} else {
									pos = bot;
									if (ModernizedCProgram.p_sel == (byte)'e') {
										ModernizedCProgram.getvvcol(wp, pos, (colnr_T)tocol, ((Object)0), ((Object)0));
									} else {
											ModernizedCProgram.getvvcol(wp, pos, ((Object)0), ((Object)0), (colnr_T)tocol);
											++tocol;
									} 
							} 
						} 
				} 
				if (!highlight_match && lnum == generatedLnum && wp == ModernizedCProgram.curwin) {
					noinvcur = 1;
				} 
				if (fromcol >= 0) {
					area_highlighting = 1;
					vi_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_V)];
				} 
			}  else if (highlight_match && wp == ModernizedCProgram.curwin && lnum >= generatedLnum && lnum <= generatedLnum + ModernizedCProgram.search_match_lines) {
				if (lnum == generatedLnum) {
					ModernizedCProgram.getvcol(ModernizedCProgram.curwin, (ModernizedCProgram.curwin.getW_cursor()), (colnr_T)fromcol, ((Object)0), ((Object)0));
				} else {
						fromcol = 0;
				} 
				if (lnum == generatedLnum + ModernizedCProgram.search_match_lines) {
					pos.setLnum(lnum);
					pos.setCol(ModernizedCProgram.search_match_endcol);
					ModernizedCProgram.getvcol(ModernizedCProgram.curwin, pos, (colnr_T)tocol, ((Object)0), ((Object)0));
				} else {
						tocol = INT_MAX;
				} 
				if (fromcol == tocol) {
					tocol = fromcol + 1;
				} 
				area_highlighting = 1;
				vi_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_I)];
			} 
		} 
		// To speed up the loop below, set extra_check when there is linebreak,
		filler_lines = wp.diff_check(lnum);
		if (filler_lines < 0) {
			if (filler_lines == -1) {
				if (wp.diff_find_change(lnum, change_start, change_end)) {
					diff_hlf = .HLF_ADD;
				}  else if (change_start == 0) {
					diff_hlf = .HLF_TXD;
				} else {
						diff_hlf = .HLF_CHD;
				} 
			} else {
					diff_hlf = .HLF_ADD;
			} 
			filler_lines = 0;
			area_highlighting = 1;
		} 
		Object generatedW_topline = this.getW_topline();
		Object generatedW_topfill = this.getW_topfill();
		if (lnum == generatedW_topline) {
			filler_lines = generatedW_topfill;
		} 
		filler_todo = filler_lines;
		sign_present = ModernizedCProgram.buf_get_signattrs(generatedW_buffer, lnum, sattr);
		int generatedLinehl = sattr.getLinehl();
		// If this line has a sign with line highlighting set line_attr.if (sign_present) {
			line_attr = generatedLinehl;
		} 
		// Highlight the current line in the quickfix window.if (generatedW_buffer.bt_quickfix() && wp.qf_current_entry() == lnum) {
			line_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_QFL)];
		} 
		if (line_attr != 0) {
			area_highlighting = 1;
		} 
		line = generatedW_buffer.ml_get_buf(lnum, 0);
		ptr = line;
		if (has_spell && !number_only) {
			if (cap_col == 0) {
				cap_col = ModernizedCProgram.getwhitecols(line);
			} 
			if (nextline[150] == (byte)'\000') {
				nextlinecol = INT_MAX;
				nextline_idx = 0;
			} else {
					v = (long)/*Error: Function owner not recognized*/strlen((byte)(line));
					if (v < 150) {
						nextlinecol = 0;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(nextline), (byte)(line), (size_t)((size_t)v));
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((nextline + v)), (byte)((nextline + 150)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(nextline + 150)) + 1));
						nextline_idx = v + 1;
					} else {
							nextlinecol = v - 150;
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(nextline), (byte)(line + nextlinecol), (size_t)(true));
							nextline_idx = 150 + 1;
					} 
			} 
		} 
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		if (generatedWo_list) {
			if (lcs_space || lcs_trail || lcs_nbsp) {
				extra_check = 1;
			} 
			if (lcs_trail) {
				trailcol = (colnr_T)/*Error: Function owner not recognized*/strlen((byte)(ptr));
				while (trailcol > (colnr_T)0 && ((ptr[trailcol - 1]) == (byte)' ' || (ptr[trailcol - 1]) == (byte)'\t')) {
					--trailcol;
				}
				trailcol += (colnr_T)(ptr - line);
			} 
		} 
		wcr_attr = /*Error: Function owner not recognized*/get_wcr_attr(wp);
		if (wcr_attr != 0) {
			win_attr = wcr_attr;
			area_highlighting = 1;
		} 
		if (vi_attr != 0 && win_attr != 0) {
			vi_attr = ModernizedCProgram.hl_combine_attr(win_attr, vi_attr);
		} 
		Object generatedW_popup_flags = (wp).getW_popup_flags();
		if ((generatedW_popup_flags != 0)) {
			screen_line_flags |=  2;
		} 
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		Object generatedW_skipcol = this.getW_skipcol();
		Object generatedW_leftcol = this.getW_leftcol();
		// 'nowrap' or 'wrap' and a single line that doesn't fit: Advance to the// first character to be displayed.if (generatedWo_wrap) {
			v = generatedW_skipcol;
		} else {
				v = generatedW_leftcol;
		} 
		Object generatedWo_cuc = generatedW_onebuf_opt.getWo_cuc();
		 generatedW_cursor = this.getW_cursor();
		if (v > 0 && !number_only) {
			char_u prev_ptr = ptr;
			while (vcol < v && ptr != (byte)'\000') {
				c = wp.win_lbr_chartabsize(line, ptr, (colnr_T)vcol, ((Object)0));
				vcol += c;
				prev_ptr = ptr;
				ptr += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr);
			}
			if (vcol < v && (generatedWo_cuc || draw_color_col || ModernizedCProgram.virtual_active() || (VIsual_active && generatedW_buffer == generatedW_buffer))) {
				vcol = v;
			} 
			if (vcol > v) {
				vcol -= c;
				ptr = prev_ptr;
				if ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr) >= c || ptr == (byte)'\011') && col == 0) {
					n_skip = v - vcol;
				} 
			} 
			if (tocol <= vcol) {
				fromcol = 0;
			}  else if (fromcol >= 0 && fromcol < vcol) {
				fromcol = vcol;
			} 
			if (generatedWo_wrap) {
				need_showbreak = 1;
			} 
			if (has_spell) {
				int len;
				colnr_T linecol = (colnr_T)(ptr - line);
				hlf_T spell_hlf = .HLF_COUNT;
				pos = generatedW_cursor;
				generatedW_cursor.setLnum(lnum);
				generatedW_cursor.setCol(linecol);
				len = wp.spell_move_to(1, 1, 1, spell_hlf);
				line = generatedW_buffer.ml_get_buf(lnum, 0);
				ptr = line + linecol;
				if (len == 0 || (int)generatedCol > ptr - line) {
					spell_hlf = .HLF_COUNT;
					word_end = (int)(wp.spell_to_word_end(ptr) - line + 1);
				} else {
						word_end = generatedCol + len + 1;
						if (spell_hlf != .HLF_COUNT) {
							spell_attr = ModernizedCProgram.highlight_attr[spell_hlf];
						} 
				} 
				this.setW_cursor(pos);
				if (has_syntax) {
					wp.syntax_start(lnum);
				} 
			} 
		} 
		Object generatedW_virtcol = this.getW_virtcol();
		// Correct highlighting for cursor that can't be disabled.// Avoids having to check this for each character.if (fromcol >= 0) {
			if (noinvcur) {
				if ((colnr_T)fromcol == generatedW_virtcol) {
					fromcol_prev = fromcol;
					fromcol = -1;
				}  else if ((colnr_T)fromcol < generatedW_virtcol) {
					fromcol_prev = generatedW_virtcol;
				} 
			} 
			if (fromcol >= tocol) {
				fromcol = -1;
			} 
		} 
		if (!number_only) {
			v = (long)(ptr - line);
			area_highlighting |=  ModernizedCProgram.prepare_search_hl_line(wp, lnum, (colnr_T)v, line, screen_search_hl, search_attr);
			ptr = line + v;
		} 
		Object generatedWo_cul = generatedW_onebuf_opt.getWo_cul();
		Object generatedW_p_culopt_flags = this.getW_p_culopt_flags();
		// Cursor line highlighting for 'cursorline' in the current window.if (generatedWo_cul && lnum == generatedLnum) {
			if (!(wp == ModernizedCProgram.curwin && VIsual_active) && generatedW_p_culopt_flags != -1024) {
				cul_screenline = (generatedWo_wrap && (generatedW_p_culopt_flags & -1024));
				if (!cul_screenline) {
					cul_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_CUL)];
					line_attr = cul_attr;
					this.setW_last_cursorline(generatedLnum);
				} else {
						line_attr_save = line_attr;
						this.setW_last_cursorline(0);
						wp.margin_columns_win(left_curline_col, right_curline_col);
				} 
				area_highlighting = 1;
			} else {
					this.setW_last_cursorline(generatedLnum);
			} 
		} 
		// Do not show the cursor line in the text when Visual mode is active,
		{ 
			char_u prop_start = new char_u();
			text_prop_count = generatedW_buffer.get_text_props(lnum, prop_start, 0);
			if (text_prop_count > 0) {
				text_props = (textprop_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (text_prop_count));
				if (text_props != ((Object)0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(text_props), (byte)(prop_start), (size_t)(text_prop_count * /*Error: Unsupported expression*/));
				} 
				text_prop_idxs = (int)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (text_prop_count));
				area_highlighting = 1;
				extra_check = 1;
			} 
		}
		off = (int)(current_ScreenLine - ScreenLines);
		col = 0;
		Object generatedWo_rl = generatedW_onebuf_opt.getWo_rl();
		int generatedW_width = this.getW_width();
		if (generatedWo_rl) {
			col = generatedW_width - 1;
			off += col;
			screen_line_flags |=  1;
		} 
		// Rightleft window: process the text in the normal direction, but put
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		Object generatedWo_scl = generatedW_onebuf_opt.getWo_scl();
		Object generatedW_p_brisbr = this.getW_p_brisbr();
		Object generatedWo_bri = generatedW_onebuf_opt.getWo_bri();
		int generatedW_wincol = this.getW_wincol();
		int generatedW_cline_row = this.getW_cline_row();
		int generatedW_cline_height = this.getW_cline_height();
		int generatedW_height = this.getW_height();
		proptype_S proptype_S = new proptype_S();
		int generatedPt_hl_id = pt.getPt_hl_id();
		int generatedPt_flags = pt.getPt_flags();
		long generatedB_p_ts = generatedW_buffer.getB_p_ts();
		Object generatedB_p_vts_array = generatedW_buffer.getB_p_vts_array();
		Object generatedWo_cole = generatedW_onebuf_opt.getWo_cole();
		Object generatedWo_cocu = generatedW_onebuf_opt.getWo_cocu();
		Object generatedW_botfill = this.getW_botfill();
		// Repeat for the whole displayed line.for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			int has_match_conc = 0;
			int did_decrement_ptr = 0;
			if (draw_state != 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1) {
				if (draw_state == 0 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1;
					if (cmdwin_type != 0 && wp == ModernizedCProgram.curwin) {
						n_extra = 1;
						c_extra = cmdwin_type;
						c_final = (byte)'\000';
						char_attr = ModernizedCProgram.hl_combine_attr(wcr_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_AT)]);
					} 
				} 
				if (draw_state == 0 + 1 + 1 - 1 && n_extra == 0) {
					int fdc = /*Error: Function owner not recognized*/compute_foldcolumn(wp, 0);
					draw_state = 0 + 1 + 1;
					if (fdc > 0) {
						ModernizedCProgram.vim_free(p_extra_free);
						p_extra_free = ModernizedCProgram.alloc(12 + 1);
						if (p_extra_free != ((Object)0)) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fill_foldcolumn(p_extra_free, wp, 0, lnum);
							n_extra = fdc;
							p_extra_free[n_extra] = (byte)'\000';
							p_extra = p_extra_free;
							c_extra = (byte)'\000';
							c_final = (byte)'\000';
							char_attr = ModernizedCProgram.hl_combine_attr(wcr_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_FC)]);
						} 
					} 
				} 
				if (draw_state == 0 + 1 + 1 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1;
					if (wp.signcolumn_on()) {
						ModernizedCProgram.get_sign_display_info(0, wp, lnum, sattr, wcr_attr, row, startrow, filler_lines, filler_todo, c_extra, c_final, extra, p_extra, n_extra, char_attr);
					} 
				} 
				if (draw_state == 0 + 1 + 1 + 1 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1 + 1;
					if ((generatedWo_nu || generatedWo_rnu) && (row == startrow + filler_lines || ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'n') == ((Object)0))) {
						if ((generatedWo_scl == (byte)'n' && (generatedWo_scl + 1) == (byte)'u') && sign_present) {
							ModernizedCProgram.get_sign_display_info(1, wp, lnum, sattr, wcr_attr, row, startrow, filler_lines, filler_todo, c_extra, c_final, extra, p_extra, n_extra, char_attr);
						} else {
								if (row == startrow + filler_lines) {
									long num;
									byte fmt = "%*ld ";
									if (generatedWo_nu && !generatedWo_rnu) {
										num = (long)lnum;
									} else {
											num = /*Error: Function owner not recognized*/labs((long)wp.get_cursor_rel_lnum(lnum));
											if (num == 0 && generatedWo_nu && generatedWo_rnu) {
												num = lnum;
												fmt = "%-*ld ";
											} 
									} 
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)extra, fmt, /*Error: Function owner not recognized*/number_width(wp), num);
									if (generatedW_skipcol > 0) {
										for (p_extra = extra; p_extra == (byte)' '; ++p_extra) {
											p_extra = (byte)'-';
										}
									} 
									if (generatedWo_rl) {
										char_u p1 = new char_u();
										char_u p2 = new char_u();
										int t;
										p2 = ModernizedCProgram.skiptowhite(extra) - 1;
										for (p1 = extra; p1 < p2; ) {
											t = p1;
											p1 = p2;
											p2 = t;
										}
									} 
									p_extra = extra;
									c_extra = (byte)'\000';
									c_final = (byte)'\000';
								} else {
										c_extra = (byte)' ';
										c_final = (byte)'\000';
								} 
								n_extra = /*Error: Function owner not recognized*/number_width(wp) + 1;
								char_attr = ModernizedCProgram.hl_combine_attr(wcr_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_N)]);
								if (generatedWo_cul && lnum == generatedLnum && (generatedW_p_culopt_flags & -1024) && (row == startrow || generatedW_p_culopt_flags & -1024)) {
									char_attr = ModernizedCProgram.hl_combine_attr(wcr_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_CLN)]);
								} 
						} 
					} 
				} 
				if (generatedW_p_brisbr && draw_state == 0 + 1 + 1 + 1 + 1 + 1 - 1 && n_extra == 0 && p_sbr != (byte)'\000') {
					draw_state = 0 + 1 + 1 + 1 + 1 + 1;
				}  else if (generatedW_p_brisbr && draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1 + 1 + 1 - 1;
				} 
				if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1 + 1 + 1;
					if (generatedWo_bri && n_extra == 0 && (row != startrow || need_showbreak) && filler_lines == 0) {
						char_attr = 0;
						if (diff_hlf != (hlf_T)0) {
							char_attr = ModernizedCProgram.highlight_attr[(int)(diff_hlf)];
							if (cul_attr != 0) {
								char_attr = ModernizedCProgram.hl_combine_attr(char_attr, cul_attr);
							} 
						} 
						p_extra = ((Object)0);
						c_extra = (byte)' ';
						n_extra = wp.get_breakindent_win(generatedW_buffer.ml_get_buf(lnum, 0));
						if (tocol == vcol) {
							tocol += n_extra;
						} 
					} 
				} 
				if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1 + 1 + 1 + 1;
					if (filler_todo > 0) {
						if (ModernizedCProgram.char2cells(fill_diff) > 1) {
							c_extra = (byte)'-';
							c_final = (byte)'\000';
						} else {
								c_extra = fill_diff;
								c_final = (byte)'\000';
						} 
						if (generatedWo_rl) {
							n_extra = col + 1;
						} else {
								n_extra = generatedW_width - col;
						} 
						char_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_DED)];
					} 
					if (p_sbr != (byte)'\000' && need_showbreak) {
						p_extra = p_sbr;
						c_extra = (byte)'\000';
						c_final = (byte)'\000';
						n_extra = (int)/*Error: Function owner not recognized*/strlen((byte)(p_sbr));
						char_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
						need_showbreak = 0;
						vcol_sbr = vcol + (has_mbyte ? ModernizedCProgram.mb_charlen(p_sbr) : (int)/*Error: Function owner not recognized*/strlen((byte)(p_sbr)));
						if (tocol == vcol) {
							tocol += n_extra;
						} 
						if (win_attr != 0) {
							char_attr = ModernizedCProgram.hl_combine_attr(win_attr, char_attr);
						} 
						if (cul_attr != 0) {
							char_attr = ModernizedCProgram.hl_combine_attr(char_attr, cul_attr);
						} 
					} 
				} 
				if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 - 1 && n_extra == 0) {
					draw_state = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
					if (saved_n_extra) {
						n_extra = saved_n_extra;
						c_extra = saved_c_extra;
						c_final = saved_c_final;
						p_extra = saved_p_extra;
						char_attr = saved_char_attr;
					} else {
							char_attr = win_attr;
					} 
				} 
			} 
			if (cul_screenline) {
				if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && vcol >= left_curline_col && vcol < right_curline_col) {
					cul_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_CUL)];
					line_attr = cul_attr;
				} else {
						cul_attr = 0;
						line_attr = line_attr_save;
				} 
			} 
			if ((dollar_vcol >= 0 && wp == ModernizedCProgram.curwin && lnum == generatedLnum && vcol >= (long)generatedW_virtcol && filler_todo <= 0) || (number_only && draw_state > 0 + 1 + 1 + 1 + 1)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_line(screen_row, generatedW_wincol, col, -(int)generatedW_width, screen_line_flags);
				if (generatedWo_cuc) {
					row = generatedW_cline_row + generatedW_cline_height;
				} else {
						row = generatedW_height;
				} 
				break;
			} 
			if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && (area_highlighting || extra_check)) {
				if (vcol == fromcol || (has_mbyte && vcol + 1 == fromcol && n_extra == 0 && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr) > 1) || ((int)vcol_prev == fromcol_prev && vcol_prev < vcol && vcol < tocol)) {
					area_attr = vi_attr;
				}  else if (area_attr != 0 && (vcol == tocol || (noinvcur && (colnr_T)vcol == generatedW_virtcol))) {
					area_attr = 0;
				} 
				if (!n_extra) {
					v = (long)(ptr - line);
					search_attr = ModernizedCProgram.update_search_hl(wp, lnum, (colnr_T)v, line, screen_search_hl, has_match_conc, match_conc, did_line_attr, lcs_eol_one);
					ptr = line + v;
				} 
				if (diff_hlf != (hlf_T)0) {
					if (diff_hlf == .HLF_CHD && ptr - line >= change_start && n_extra == 0) {
						diff_hlf = .HLF_TXD;
					} 
					if (diff_hlf == .HLF_TXD && ptr - line > change_end && n_extra == 0) {
						diff_hlf = .HLF_CHD;
					} 
					line_attr = ModernizedCProgram.highlight_attr[(int)(diff_hlf)];
					if (generatedWo_cul && lnum == generatedLnum && generatedW_p_culopt_flags != -1024 && (!cul_screenline || (vcol >= left_curline_col && vcol <= right_curline_col))) {
						line_attr = ModernizedCProgram.hl_combine_attr(line_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_CUL)]);
					} 
				} 
				if (text_props != ((Object)0)) {
					int pi;
					int bcol = (int)(ptr - line);
					if (n_extra > 0) {
						--bcol;
					} 
					for (pi = 0; pi < text_props_active; ++pi) {
						int tpi = text_prop_idxs[pi];
						if (bcol >= text_props[tpi].getTp_col() - 1 + text_props[tpi].getTp_len()) {
							if (pi + 1 < text_props_active) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(text_prop_idxs + pi), (byte)(text_prop_idxs + pi + 1), (size_t)(/*Error: Unsupported expression*/ * (text_props_active - (pi + 1))));
							} 
							--text_props_active;
							--pi;
						} 
					}
					while (text_prop_next < text_prop_count && bcol >= text_props[text_prop_next].getTp_col() - 1) {
						text_prop_idxs[text_props_active++] = text_prop_next++;
					}
					text_prop_attr = 0;
					text_prop_combine = 0;
					text_prop_type = ((Object)0);
					if (text_props_active > 0) {
						ModernizedCProgram.current_text_props = text_props;
						ModernizedCProgram.current_buf = generatedW_buffer;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort((Object)text_prop_idxs, (size_t)text_props_active, /*Error: Unsupported expression*/, text_prop_compare);
						for (pi = 0; pi < text_props_active; ++pi) {
							int tpi = text_prop_idxs[pi];
							proptype_T pt = proptype_S.text_prop_type_by_id(generatedW_buffer, text_props[tpi].getTp_type());
							if (pt != ((Object)0) && generatedPt_hl_id > 0) {
								int pt_attr = ModernizedCProgram.syn_id2attr(generatedPt_hl_id);
								text_prop_type = pt;
								text_prop_attr = ModernizedCProgram.hl_combine_attr(text_prop_attr, pt_attr);
								text_prop_combine = generatedPt_flags & 4;
							} 
						}
					} 
				} 
				if (extra_check && n_extra == 0) {
					syntax_attr = 0;
					if (has_syntax) {
						save_did_emsg = ModernizedCProgram.did_emsg;
						ModernizedCProgram.did_emsg = 0;
						v = (long)(ptr - line);
						if (v == prev_syntax_col) {
							syntax_attr = prev_syntax_attr;
						} else {
								can_spell = 1;
								syntax_attr = ModernizedCProgram.get_syntax_attr((colnr_T)v, has_spell ? can_spell : ((Object)0), 0);
								prev_syntax_col = v;
								prev_syntax_attr = syntax_attr;
						} 
						if (syntax_attr != 0 && win_attr != 0) {
							syntax_attr = ModernizedCProgram.hl_combine_attr(win_attr, syntax_attr);
						} 
						if (ModernizedCProgram.did_emsg) {
							generatedW_s.setB_syn_error(1);
							has_syntax = 0;
							syntax_attr = 0;
						} else {
								ModernizedCProgram.did_emsg = save_did_emsg;
						} 
						if (generatedW_s.getB_syn_slow()) {
							has_syntax = 0;
						} 
						line = generatedW_buffer.ml_get_buf(lnum, 0);
						ptr = line + v;
						if (ptr == (byte)'\000') {
							syntax_flags = 0;
						} else {
								syntax_flags = ModernizedCProgram.get_syntax_info(syntax_seqnr);
						} 
					} 
				} 
				attr_pri = 1;
				if (area_attr != 0) {
					char_attr = ModernizedCProgram.hl_combine_attr(line_attr, area_attr);
					if (syntax_attr != 0) {
						char_attr = ModernizedCProgram.hl_combine_attr(syntax_attr, char_attr);
					} 
				}  else if (search_attr != 0) {
					char_attr = ModernizedCProgram.hl_combine_attr(line_attr, search_attr);
					if (syntax_attr != 0) {
						char_attr = ModernizedCProgram.hl_combine_attr(syntax_attr, char_attr);
					} 
				}  else if (text_prop_type != ((Object)0)) {
					char_attr = ModernizedCProgram.hl_combine_attr(line_attr != 0 ? line_attr : syntax_attr != 0 ? syntax_attr : win_attr, text_prop_attr);
				}  else if (line_attr != 0 && ((fromcol == -10 && tocol == INT_MAX) || vcol < fromcol || vcol_prev < fromcol_prev || vcol >= tocol)) {
					if (syntax_attr != 0) {
						char_attr = ModernizedCProgram.hl_combine_attr(syntax_attr, line_attr);
					} else {
							char_attr = line_attr;
					} 
					attr_pri = 0;
				} else {
						attr_pri = 0;
						if (text_prop_type != ((Object)0)) {
							if (text_prop_combine) {
								char_attr = ModernizedCProgram.hl_combine_attr(syntax_attr, text_prop_attr);
							} else {
									char_attr = ModernizedCProgram.hl_combine_attr(win_attr, text_prop_attr);
							} 
						} else {
								char_attr = syntax_attr;
						} 
				} 
			} 
			if (char_attr == 0) {
				char_attr = win_attr;
			} 
			if (n_extra > 0) {
				if (c_extra != (byte)'\000' || (n_extra == 1 && c_final != (byte)'\000')) {
					c = (n_extra == 1 && c_final != (byte)'\000') ? c_final : c_extra;
					mb_c = c;
					if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
						mb_utf8 = 1;
						u8cc[0] = 0;
						c = -1024;
					} else {
							mb_utf8 = 0;
					} 
				} else {
						c = p_extra;
						if (has_mbyte) {
							mb_c = c;
							if (enc_utf8) {
								mb_l = ModernizedCProgram.utfc_ptr2len(p_extra);
								mb_utf8 = 0;
								if (mb_l > n_extra) {
									mb_l = 1;
								}  else if (mb_l > 1) {
									mb_c = ModernizedCProgram.utfc_ptr2char(p_extra, u8cc);
									mb_utf8 = 1;
									c = -1024;
								} 
							} else {
									mb_l = ModernizedCProgram.mb_bytelen_tab[c];
									if (mb_l >= n_extra) {
										mb_l = 1;
									}  else if (mb_l > 1) {
										mb_c = (c << 8) + p_extra[1];
									} 
							} 
							if (mb_l == 0) {
								mb_l = 1;
							} 
							if ((generatedWo_rl ? (col <= 0) : (col >= generatedW_width - 1)) && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) == 2) {
								c = (byte)'>';
								mb_c = c;
								mb_l = 1;
								mb_utf8 = 0;
								multi_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
								if (cul_attr) {
									multi_attr = ModernizedCProgram.hl_combine_attr(multi_attr, cul_attr);
								} 
								++n_extra;
								--p_extra;
							} else {
									n_extra -= mb_l - 1;
									p_extra += mb_l - 1;
							} 
						} 
						++p_extra;
				} 
				--n_extra;
			} else {
					int c0;
					if (p_extra_free != ((Object)0)) {
						do {
							if ((p_extra_free) != ((Object)0)) {
								ModernizedCProgram.vim_free(p_extra_free);
								(p_extra_free) = ((Object)0);
							} 
						} while (0);
					} 
					c = ptr;
					c0 = ptr;
					if (has_mbyte) {
						mb_c = c;
						if (enc_utf8) {
							mb_l = ModernizedCProgram.utfc_ptr2len(ptr);
							mb_utf8 = 0;
							if (mb_l > 1) {
								mb_c = ModernizedCProgram.utfc_ptr2char(ptr, u8cc);
								if (mb_c < -1024) {
									c = mb_c;
									c0 = mb_c;
								} 
								mb_utf8 = 1;
								if (ModernizedCProgram.utf_iscomposing(mb_c)) {
									int i;
									for (i = Screen_mco - 1; i > 0; --i) {
										u8cc[i] = u8cc[i - 1];
									}
									u8cc[0] = mb_c;
									mb_c = (byte)' ';
								} 
							} 
							if ((mb_l == 1 && c >= -1024) || (mb_l >= 1 && mb_c == 0) || (mb_l > 1 && (!ModernizedCProgram.vim_isprintc(mb_c)))) {
								ModernizedCProgram.transchar_hex(extra, mb_c);
								if (generatedWo_rl) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rl_mirror(extra);
								} 
								p_extra = extra;
								c = p_extra;
								mb_c = ModernizedCProgram.mb_ptr2char_adv(p_extra);
								mb_utf8 = (c >= -1024);
								n_extra = (int)/*Error: Function owner not recognized*/strlen((byte)(p_extra));
								c_extra = (byte)'\000';
								c_final = (byte)'\000';
								if (area_attr == 0 && search_attr == 0) {
									n_attr = n_extra + 1;
									extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
									saved_attr2 = char_attr;
								} 
							}  else if (mb_l == 0) {
								mb_l = 1;
							}  else if (p_arshape && !p_tbidi && (((mb_c) & -1024) == -1024)) {
								int pc;
								int pc1;
								int nc;
								int[] pcc = new int[6];
								if (generatedWo_rl) {
									pc = prev_c;
									pc1 = prev_c1;
									nc = ModernizedCProgram.utf_ptr2char(ptr + mb_l);
									prev_c1 = u8cc[0];
								} else {
										pc = ModernizedCProgram.utfc_ptr2char(ptr + mb_l, pcc);
										nc = prev_c;
										pc1 = pcc[0];
								} 
								prev_c = mb_c;
								mb_c = ModernizedCProgram.arabic_shape(mb_c, c, u8cc[0], pc, pc1, nc);
							} else {
									prev_c = mb_c;
							} 
						} else {
								mb_l = ModernizedCProgram.mb_bytelen_tab[c];
								if (mb_l == 0) {
									mb_l = 1;
								}  else if (mb_l > 1) {
									if (ptr[1] >= 32) {
										mb_c = (c << 8) + ptr[1];
									} else {
											if (ptr[1] == (byte)'\000') {
												mb_l = 1;
												ModernizedCProgram.transchar_nonprint(extra, c);
											} else {
													mb_l = 2;
													/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(extra), (byte)("XX"));
											} 
											p_extra = extra;
											n_extra = (int)/*Error: Function owner not recognized*/strlen((byte)(extra)) - 1;
											c_extra = (byte)'\000';
											c_final = (byte)'\000';
											c = p_extra++;
											if (area_attr == 0 && search_attr == 0) {
												n_attr = n_extra + 1;
												extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
												saved_attr2 = char_attr;
											} 
											mb_c = c;
									} 
								} 
						} 
						if ((generatedWo_rl ? (col <= 0) : (col >= generatedW_width - 1)) && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) == 2) {
							c = (byte)'>';
							mb_c = c;
							mb_utf8 = 0;
							mb_l = 1;
							multi_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
							--ptr;
							did_decrement_ptr = 1;
						}  else if (ptr != (byte)'\000') {
							ptr += mb_l - 1;
						} 
						if (n_skip > 0 && mb_l > 1 && n_extra == 0) {
							n_extra = 1;
							c_extra = (byte)'<';
							c_final = (byte)'\000';
							c = (byte)' ';
							if (area_attr == 0 && search_attr == 0) {
								n_attr = n_extra + 1;
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
								saved_attr2 = char_attr;
							} 
							mb_c = c;
							mb_utf8 = 0;
							mb_l = 1;
						} 
					} 
					++ptr;
					if (extra_check) {
						v = (long)(ptr - line);
						if (has_spell && v >= word_end && v > cur_checked_col) {
							spell_attr = 0;
							if (c != 0 && (!has_syntax || can_spell)) {
								char_u prev_ptr = new char_u();
								char_u p = new char_u();
								int len;
								hlf_T spell_hlf = .HLF_COUNT;
								if (has_mbyte) {
									prev_ptr = ptr - mb_l;
									v -= mb_l - 1;
								} else {
										prev_ptr = ptr - 1;
								} 
								if ((prev_ptr - line) - nextlinecol >= 0) {
									p = nextline + (prev_ptr - line) - nextlinecol;
								} else {
										p = prev_ptr;
								} 
								cap_col -= (int)(prev_ptr - line);
								len = wp.spell_check(p, spell_hlf, cap_col, nochange);
								word_end = v + len;
								if (spell_hlf != .HLF_COUNT && (State & -1024) != 0 && generatedLnum == lnum && generatedCol >= (colnr_T)(prev_ptr - line) && generatedCol < (colnr_T)word_end) {
									spell_hlf = .HLF_COUNT;
									spell_redraw_lnum = lnum;
								} 
								if (spell_hlf == .HLF_COUNT && p != prev_ptr && (p - nextline) + len > nextline_idx) {
									checked_lnum = lnum + 1;
									checked_col = (int)((p - nextline) + len - nextline_idx);
								} 
								if (spell_hlf != .HLF_COUNT) {
									spell_attr = ModernizedCProgram.highlight_attr[spell_hlf];
								} 
								if (cap_col > 0) {
									if (p != prev_ptr && (p - nextline) + cap_col >= nextline_idx) {
										capcol_lnum = lnum + 1;
										cap_col = (int)((p - nextline) + cap_col - nextline_idx);
									} else {
											cap_col += (int)(prev_ptr - line);
									} 
								} 
							} 
						} 
						if (spell_attr != 0) {
							if (!attr_pri) {
								char_attr = ModernizedCProgram.hl_combine_attr(char_attr, spell_attr);
							} else {
									char_attr = ModernizedCProgram.hl_combine_attr(spell_attr, char_attr);
							} 
						} 
						if (generatedWo_lbr && c0 == c && ((c) < 256 && breakat_flags[(char_u)(c)]) && !(((int)ptr) < 256 && breakat_flags[(char_u)((int)ptr)])) {
							int mb_off = has_mbyte ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(line, ptr - 1) : 0;
							char_u p = ptr - (mb_off + 1);
							n_extra = wp.win_lbr_chartabsize(line, p, (colnr_T)vcol, ((Object)0)) - 1;
							if (c == (byte)'\011' && n_extra + col > generatedW_width) {
								n_extra = ModernizedCProgram.tabstop_padding(vcol, generatedB_p_ts, generatedB_p_vts_array) - 1;
							} 
							c_extra = mb_off > 0 ? (byte)'<' : (byte)' ';
							c_final = (byte)'\000';
							if (((c) == (byte)' ' || (c) == (byte)'\t')) {
								if (c == (byte)'\011') {
									n_extra += vcol_off;
									vcol -= vcol_off;
									vcol_off = 0;
									col -= boguscols;
									old_boguscols = boguscols;
									boguscols = 0;
								} 
								;
								if (!generatedWo_list) {
									c = (byte)' ';
								} 
							} 
						} 
						if (generatedWo_list && ((((c == 160 && mb_l == 1) || (mb_utf8 && ((mb_c == 160 && mb_l == 2) || (mb_c == -1024 && mb_l == 3)))) && lcs_nbsp) || (c == (byte)' ' && mb_l == 1 && lcs_space && ptr - line <= trailcol))) {
							c = (c == (byte)' ') ? lcs_space : lcs_nbsp;
							if (area_attr == 0 && search_attr == 0) {
								n_attr = 1;
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
								saved_attr2 = char_attr;
							} 
							mb_c = c;
							if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
								mb_utf8 = 1;
								u8cc[0] = 0;
								c = -1024;
							} else {
									mb_utf8 = 0;
							} 
						} 
						if (trailcol != INT_MAX && ptr > line + trailcol && c == (byte)' ') {
							c = lcs_trail;
							if (!attr_pri) {
								n_attr = 1;
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
								saved_attr2 = char_attr;
							} 
							mb_c = c;
							if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
								mb_utf8 = 1;
								u8cc[0] = 0;
								c = -1024;
							} else {
									mb_utf8 = 0;
							} 
						} 
					} 
					if (!ModernizedCProgram.vim_isprintc(c)) {
						if (c == (byte)'\011' && (!generatedWo_list || lcs_tab1)) {
							int tab_len = 0;
							long vcol_adjusted = vcol;
							if (p_sbr != (byte)'\000' && vcol == vcol_sbr && generatedWo_wrap) {
								vcol_adjusted = vcol - (has_mbyte ? ModernizedCProgram.mb_charlen(p_sbr) : (int)/*Error: Function owner not recognized*/strlen((byte)(p_sbr)));
							} 
							tab_len = ModernizedCProgram.tabstop_padding(vcol_adjusted, generatedB_p_ts, generatedB_p_vts_array) - 1;
							if (!generatedWo_lbr || !generatedWo_list) {
								n_extra = tab_len;
							} else {
									char_u p = new char_u();
									int len;
									int i;
									int saved_nextra = n_extra;
									if (vcol_off > 0) {
										tab_len += vcol_off;
									} 
									if (generatedWo_list && lcs_tab1 && old_boguscols > 0 && n_extra > tab_len) {
										tab_len += n_extra - tab_len;
									} 
									len = (tab_len * /*Error: Function owner not recognized*/mb_char2len(lcs_tab2));
									if (n_extra > 0) {
										len += n_extra - tab_len;
									} 
									c = lcs_tab1;
									p = ModernizedCProgram.alloc(len + 1);
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((p), ((byte)' '), (len));
									p[len] = (byte)'\000';
									ModernizedCProgram.vim_free(p_extra_free);
									p_extra_free = p;
									for (i = 0; i < tab_len; i++) {
										int lcs = lcs_tab2;
										if (p == (byte)'\000') {
											tab_len = i;
											break;
										} 
										if (lcs_tab3 && i == tab_len - 1) {
											lcs = lcs_tab3;
										} 
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mb_char2bytes(lcs, p);
										p += /*Error: Function owner not recognized*/mb_char2len(lcs);
										n_extra += /*Error: Function owner not recognized*/mb_char2len(lcs) - (saved_nextra > 0 ? 1 : 0);
									}
									p_extra = p_extra_free;
									if (vcol_off > 0) {
										n_extra -= vcol_off;
									} 
							} 
							{ 
								int vc_saved = vcol_off;
								{ 
									n_extra += vcol_off;
									vcol -= vcol_off;
									vcol_off = 0;
									col -= boguscols;
									old_boguscols = boguscols;
									boguscols = 0;
								}
								;
								if (n_extra == tab_len + vc_saved && generatedWo_list && lcs_tab1) {
									tab_len += vc_saved;
								} 
							}
							mb_utf8 = 0;
							if (generatedWo_list) {
								c = (n_extra == 0 && lcs_tab3) ? lcs_tab3 : lcs_tab1;
								if (generatedWo_lbr) {
									c_extra = (byte)'\000';
								} else {
										c_extra = lcs_tab2;
								} 
								c_final = lcs_tab3;
								n_attr = tab_len + 1;
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
								saved_attr2 = char_attr;
								mb_c = c;
								if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
									mb_utf8 = 1;
									u8cc[0] = 0;
									c = -1024;
								} 
							} else {
									c_final = (byte)'\000';
									c_extra = (byte)' ';
									c = (byte)' ';
							} 
						}  else if (c == (byte)'\000' && (generatedWo_list || ((fromcol >= 0 || fromcol_prev >= 0) && tocol > vcol && VIsual_mode != 22 && (generatedWo_rl ? (col >= 0) : (col < generatedW_width)) && !(noinvcur && lnum == generatedLnum && (colnr_T)vcol == generatedW_virtcol))) && lcs_eol_one > 0) {
							if (diff_hlf == (hlf_T)0 && line_attr == 0) {
								if (area_highlighting && ModernizedCProgram.virtual_active() && tocol != INT_MAX && vcol < tocol) {
									n_extra = 0;
								} else {
										p_extra = at_end_str;
										n_extra = 1;
										c_extra = (byte)'\000';
										c_final = (byte)'\000';
								} 
							} 
							if (generatedWo_list && lcs_eol > 0) {
								c = lcs_eol;
							} else {
									c = (byte)' ';
							} 
							lcs_eol_one = -1;
							--ptr;
							if (!attr_pri) {
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
								n_attr = 1;
							} 
							mb_c = c;
							if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
								mb_utf8 = 1;
								u8cc[0] = 0;
								c = -1024;
							} else {
									mb_utf8 = 0;
							} 
						}  else if (c != (byte)'\000') {
							p_extra = ModernizedCProgram.transchar(c);
							if (n_extra == 0) {
								n_extra = ModernizedCProgram.byte2cells(c) - 1;
							} 
							if ((ModernizedCProgram.dy_flags & -1024) && generatedWo_rl) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rl_mirror(p_extra);
							} 
							c_extra = (byte)'\000';
							c_final = (byte)'\000';
							if (generatedWo_lbr) {
								char_u p = new char_u();
								c = p_extra;
								p = ModernizedCProgram.alloc(n_extra + 1);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((p), ((byte)' '), (n_extra));
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy((byte)(p), (byte)(p_extra + 1), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(p_extra)) - 1));
								p[n_extra] = (byte)'\000';
								ModernizedCProgram.vim_free(p_extra_free);
								p_extra_free = p_extra = p;
							} else {
									n_extra = ModernizedCProgram.byte2cells(c) - 1;
									c = p_extra++;
							} 
							if (!attr_pri) {
								n_attr = n_extra + 1;
								extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
								saved_attr2 = char_attr;
							} 
							mb_utf8 = 0;
						}  else if (VIsual_active && (VIsual_mode == 22 || VIsual_mode == (byte)'v') && ModernizedCProgram.virtual_active() && tocol != INT_MAX && vcol < tocol && (generatedWo_rl ? (col >= 0) : (col < generatedW_width))) {
							c = (byte)' ';
							--ptr;
						}  else if ((diff_hlf != (hlf_T)0 || line_attr != 0) && (generatedWo_rl ? (col >= 0) : (col - boguscols < generatedW_width))) {
							c = (byte)' ';
							--ptr;
							++did_line_attr;
							if (line_attr != 0 && char_attr == search_attr && (did_line_attr > 1 || (generatedWo_list && lcs_eol > 0))) {
								char_attr = line_attr;
							} 
							if (diff_hlf == .HLF_TXD) {
								diff_hlf = .HLF_CHD;
								if (vi_attr == 0 || char_attr != vi_attr) {
									char_attr = ModernizedCProgram.highlight_attr[(int)(diff_hlf)];
									if (generatedWo_cul && lnum == generatedLnum && generatedW_p_culopt_flags != -1024 && (!cul_screenline || (vcol >= left_curline_col && vcol <= right_curline_col))) {
										char_attr = ModernizedCProgram.hl_combine_attr(char_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_CUL)]);
									} 
								} 
							} 
						} 
					} 
					if (generatedWo_cole > 0 && (wp != ModernizedCProgram.curwin || lnum != generatedLnum || /*Error: Function owner not recognized*/conceal_cursor_line(wp)) && ((syntax_flags & -1024) != 0 || has_match_conc > 0) && !(lnum_in_visual_area && ModernizedCProgram.vim_strchr(generatedWo_cocu, (byte)'v') == ((Object)0))) {
						char_attr = conceal_attr;
						if ((prev_syntax_id != syntax_seqnr || has_match_conc > 1) && (ModernizedCProgram.syn_get_sub_char() != (byte)'\000' || match_conc || generatedWo_cole == 1) && generatedWo_cole != 3) {
							if (match_conc) {
								c = match_conc;
							}  else if (ModernizedCProgram.syn_get_sub_char() != (byte)'\000') {
								c = ModernizedCProgram.syn_get_sub_char();
							}  else if (lcs_conceal != (byte)'\000') {
								c = lcs_conceal;
							} else {
									c = (byte)' ';
							} 
							prev_syntax_id = syntax_seqnr;
							if (n_extra > 0) {
								vcol_off += n_extra;
							} 
							vcol += n_extra;
							if (generatedWo_wrap && n_extra > 0) {
								if (generatedWo_rl) {
									col -= n_extra;
									boguscols -= n_extra;
								} else {
										boguscols += n_extra;
										col += n_extra;
								} 
							} 
							n_extra = 0;
							n_attr = 0;
						}  else if (n_skip == 0) {
							is_concealing = 1;
							n_skip = 1;
						} 
						mb_c = c;
						if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
							mb_utf8 = 1;
							u8cc[0] = 0;
							c = -1024;
						} else {
								mb_utf8 = 0;
						} 
					} else {
							prev_syntax_id = 0;
							is_concealing = 0;
					} 
					if (n_skip > 0 && did_decrement_ptr) {
						++ptr;
					} 
			} 
			if (!did_wcol && draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && wp == ModernizedCProgram.curwin && lnum == generatedLnum && /*Error: Function owner not recognized*/conceal_cursor_line(wp) && (int)generatedW_virtcol <= vcol + n_skip) {
				if (generatedWo_rl) {
					this.setW_wcol(generatedW_width - col + boguscols - 1);
				} else {
						this.setW_wcol(col - boguscols);
				} 
				this.setW_wrow(row);
				did_wcol = 1;
				ModernizedCProgram.curwin.getW_valid() |=  -1024 | -1024 | -1024;
			} 
			if (n_attr > 0 && draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && !attr_pri) {
				if (line_attr) {
					char_attr = ModernizedCProgram.hl_combine_attr(extra_attr, line_attr);
				} else {
						char_attr = extra_attr;
				} 
			} 
			if (lcs_prec_todo != (byte)'\000' && generatedWo_list && (generatedWo_wrap ? (generatedW_skipcol > 0 && row == 0) : generatedW_leftcol > 0) && filler_todo <= 0 && draw_state > 0 + 1 + 1 + 1 + 1 && c != (byte)'\000') {
				c = lcs_prec;
				lcs_prec_todo = (byte)'\000';
				if (has_mbyte && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) > 1) {
					c_extra = (byte)'<';
					c_final = (byte)'\000';
					n_extra = 1;
					n_attr = 2;
					extra_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
				} 
				mb_c = c;
				if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
					mb_utf8 = 1;
					u8cc[0] = 0;
					c = -1024;
				} else {
						mb_utf8 = 0;
				} 
				if (!attr_pri) {
					saved_attr3 = char_attr;
					char_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
					n_attr3 = 1;
				} 
			} 
			if ((c == (byte)'\000' || did_line_attr == 1) && eol_hl_off == 0) {
				int prevcol_hl_flag = ModernizedCProgram.get_prevcol_hl_flag(wp, screen_search_hl, (long)(ptr - line) - (c == (byte)'\000'));
				if (lcs_eol == lcs_eol_one && ((area_attr != 0 && vcol == fromcol && (VIsual_mode != 22 || lnum == generatedLnum || lnum == generatedLnum) && c == (byte)'\000') || (prevcol_hl_flag && !(generatedWo_cul && lnum == generatedLnum && !(wp == ModernizedCProgram.curwin && VIsual_active)) && diff_hlf == (hlf_T)0 && did_line_attr <= 1))) {
					int n = 0;
					if (generatedWo_rl) {
						if (col < 0) {
							n = 1;
						} 
					} else {
							if (col >= generatedW_width) {
								n = -1;
							} 
					} 
					if (n != 0) {
						off += n;
						col += n;
					} else {
							ScreenLines[off] = (byte)' ';
							if (enc_utf8) {
								ScreenLinesUC[off] = 0;
							} 
					} 
					if (area_attr == 0) {
						ModernizedCProgram.get_search_match_hl(wp, screen_search_hl, (long)(ptr - line), char_attr);
					} 
					ScreenAttrs[off] = char_attr;
					if (generatedWo_rl) {
						--col;
						--off;
					} else {
							++col;
							++off;
					} 
					++vcol;
					eol_hl_off = 1;
				} 
			} 
			if (c == (byte)'\000') {
				if (generatedWo_wrap) {
					v = generatedW_skipcol;
				} else {
						v = generatedW_leftcol;
				} 
				if (vcol < v + col - wp.win_col_off()) {
					vcol = v + col - wp.win_col_off();
				} 
				col -= boguscols;
				boguscols = 0;
				if (draw_color_col) {
					draw_color_col = ModernizedCProgram.advance_color_col((vcol - vcol_off), color_cols);
				} 
				if (((generatedWo_cuc && (int)generatedW_virtcol >= (vcol - vcol_off) - eol_hl_off && (int)generatedW_virtcol < generatedW_width * (row - startrow + 1) + v && lnum != generatedLnum) || draw_color_col || win_attr != 0) && !generatedWo_rl) {
					int rightmost_vcol = 0;
					int i;
					if (generatedWo_cuc) {
						rightmost_vcol = generatedW_virtcol;
					} 
					if (draw_color_col) {
						for (i = 0; color_cols[i] >= 0; ++i) {
							if (rightmost_vcol < color_cols[i]) {
								rightmost_vcol = color_cols[i];
							} 
						}
					} 
					while (col < generatedW_width) {
						ScreenLines[off] = (byte)' ';
						if (enc_utf8) {
							ScreenLinesUC[off] = 0;
						} 
						++col;
						if (draw_color_col) {
							draw_color_col = ModernizedCProgram.advance_color_col((vcol - vcol_off), color_cols);
						} 
						if (generatedWo_cuc && (vcol - vcol_off) == (long)generatedW_virtcol) {
							ScreenAttrs[off++] = ModernizedCProgram.highlight_attr[(int)(.HLF_CUC)];
						}  else if (draw_color_col && (vcol - vcol_off) == color_cols) {
							ScreenAttrs[off++] = ModernizedCProgram.highlight_attr[(int)(.HLF_MC)];
						} else {
								ScreenAttrs[off++] = win_attr;
						} 
						if ((vcol - vcol_off) >= rightmost_vcol && win_attr == 0) {
							break;
						} 
						++vcol;
					}
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_line(screen_row, generatedW_wincol, col, (int)generatedW_width, screen_line_flags);
				row++;
				if (wp == ModernizedCProgram.curwin && lnum == generatedLnum) {
					ModernizedCProgram.curwin.setW_cline_row(startrow);
					ModernizedCProgram.curwin.setW_cline_height(row - startrow);
					ModernizedCProgram.curwin.setW_cline_folded(0);
					ModernizedCProgram.curwin.getW_valid() |=  (-1024 | -1024);
				} 
				break;
			} 
			if (lcs_ext != (byte)'\000' && generatedWo_list && !generatedWo_wrap && filler_todo <= 0 && (generatedWo_rl ? col == 0 : col == generatedW_width - 1) && (ptr != (byte)'\000' || (generatedWo_list && lcs_eol_one > 0) || (n_extra && (c_extra != (byte)'\000' || p_extra != (byte)'\000')))) {
				c = lcs_ext;
				char_attr = ModernizedCProgram.highlight_attr[(int)(.HLF_AT)];
				mb_c = c;
				if (enc_utf8 && ModernizedCProgram.utf_char2len(c) > 1) {
					mb_utf8 = 1;
					u8cc[0] = 0;
					c = -1024;
				} else {
						mb_utf8 = 0;
				} 
			} 
			if (draw_color_col) {
				draw_color_col = ModernizedCProgram.advance_color_col((vcol - vcol_off), color_cols);
			} 
			vcol_save_attr = -1;
			if (draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && !lnum_in_visual_area && search_attr == 0 && area_attr == 0) {
				if (generatedWo_cuc && (vcol - vcol_off) == (long)generatedW_virtcol && lnum != generatedLnum) {
					vcol_save_attr = char_attr;
					char_attr = ModernizedCProgram.hl_combine_attr(char_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_CUC)]);
				}  else if (draw_color_col && (vcol - vcol_off) == color_cols) {
					vcol_save_attr = char_attr;
					char_attr = ModernizedCProgram.hl_combine_attr(char_attr, ModernizedCProgram.highlight_attr[(int)(.HLF_MC)]);
				} 
			} 
			vcol_prev = vcol;
			if (draw_state < 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 || n_skip <= 0) {
				if (has_mbyte && generatedWo_rl && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) > 1) {
					--off;
					--col;
				} 
				ScreenLines[off] = c;
				if (enc_dbcs == 9932) {
					if ((mb_c & -1024) == -1024) {
						ScreenLines[off] = -1024;
					} 
					ScreenLines2[off] = mb_c & -1024;
				}  else if (enc_utf8) {
					if (mb_utf8) {
						int i;
						ScreenLinesUC[off] = mb_c;
						if ((c & -1024) == 0) {
							ScreenLines[off] = -1024;
						} 
						for (i = 0; i < Screen_mco; ++i) {
							ModernizedCProgram.ScreenLinesC[i][off] = u8cc[i];
							if (u8cc[i] == 0) {
								break;
							} 
						}
					} else {
							ScreenLinesUC[off] = 0;
					} 
				} 
				if (multi_attr) {
					ScreenAttrs[off] = multi_attr;
					multi_attr = 0;
				} else {
						ScreenAttrs[off] = char_attr;
				} 
				if (has_mbyte && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) > 1) {
					++off;
					++col;
					if (enc_utf8) {
						ScreenLines[off] = 0;
					} else {
							ScreenLines[off] = mb_c & -1024;
					} 
					if (draw_state > 0 + 1 + 1 + 1 + 1 && filler_todo <= 0) {
						++vcol;
					} 
					if (tocol == vcol) {
						++tocol;
					} 
					if (generatedWo_rl) {
						--off;
						--col;
					} 
				} 
				if (generatedWo_rl) {
					--off;
					--col;
				} else {
						++off;
						++col;
				} 
			}  else if (generatedWo_cole > 0 && is_concealing) {
				--n_skip;
				++vcol_off;
				if (n_extra > 0) {
					vcol_off += n_extra;
				} 
				if (generatedWo_wrap) {
					if (n_extra > 0) {
						vcol += n_extra;
						if (generatedWo_rl) {
							col -= n_extra;
							boguscols -= n_extra;
						} else {
								col += n_extra;
								boguscols += n_extra;
						} 
						n_extra = 0;
						n_attr = 0;
					} 
					if (has_mbyte && /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mb_c) > 1) {
						if (generatedWo_rl) {
							--boguscols;
							--col;
						} else {
								++boguscols;
								++col;
						} 
					} 
					if (generatedWo_rl) {
						--boguscols;
						--col;
					} else {
							++boguscols;
							++col;
					} 
				} else {
						if (n_extra > 0) {
							vcol += n_extra;
							n_extra = 0;
							n_attr = 0;
						} 
				} 
			} else {
					--n_skip;
			} 
			if (draw_state > 0 + 1 + 1 + 1 + 1 && filler_todo <= 0) {
				++vcol;
			} 
			if (vcol_save_attr >= 0) {
				char_attr = vcol_save_attr;
			} 
			if (draw_state > 0 + 1 + 1 + 1 + 1 && n_attr3 > 0 && --n_attr3 == 0) {
				char_attr = saved_attr3;
			} 
			if (n_attr > 0 && draw_state == 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && --n_attr == 0) {
				char_attr = saved_attr2;
			} 
			if ((generatedWo_rl ? (col < 0) : (col >= generatedW_width)) && (ptr != (byte)'\000' || filler_todo > 0 || (generatedWo_list && lcs_eol != (byte)'\000' && p_extra != at_end_str) || (n_extra != 0 && (c_extra != (byte)'\000' || p_extra != (byte)'\000')))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_line(screen_row, generatedW_wincol, col - boguscols, (int)generatedW_width, screen_line_flags);
				boguscols = 0;
				++row;
				++screen_row;
				if ((!generatedWo_wrap && filler_todo <= 0) || lcs_eol_one == -1) {
					break;
				} 
				if (draw_state != 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 && filler_todo <= 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_draw_end(wp, (byte)'@', (byte)' ', 1, row, generatedW_height, .HLF_AT);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/draw_vsep_win(wp, row);
					row = endrow;
				} 
				if (row == endrow) {
					++row;
					break;
				} 
				if (screen_cur_row == screen_row - 1 && filler_todo <= 0 && generatedW_width == Columns) {
					LineWraps[screen_row - 1] = 1;
					if (ModernizedCProgram.p_tf && !(has_mbyte && (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(LineOffset[screen_row], LineOffset[screen_row] + screen_Columns) == 2 || /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(LineOffset[screen_row - 1] + (int)Columns - 2, LineOffset[screen_row] + screen_Columns) == 2))) {
						if (screen_cur_col != generatedW_width) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_char(LineOffset[screen_row - 1] + (int)Columns - 1, screen_row - 1, (int)(Columns - 1));
						} 
						if (has_mbyte && ModernizedCProgram.mb_bytelen_tab[ScreenLines[LineOffset[screen_row - 1] + (Columns - 1)]] > 1) {
							ModernizedCProgram.out_char((byte)' ');
						} else {
								ModernizedCProgram.out_char(ScreenLines[LineOffset[screen_row - 1] + (Columns - 1)]);
						} 
						ScreenAttrs[LineOffset[screen_row]] = (sattr_T)-1;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_start();
					} 
				} 
				col = 0;
				off = (int)(current_ScreenLine - ScreenLines);
				if (generatedWo_rl) {
					col = generatedW_width - 1;
					off += col;
				} 
				draw_state = 0;
				saved_n_extra = n_extra;
				saved_p_extra = p_extra;
				saved_c_extra = c_extra;
				saved_c_final = c_final;
				if (!(cul_screenline && diff_hlf == (hlf_T)0)) {
					saved_char_attr = char_attr;
				} else {
						saved_char_attr = 0;
				} 
				n_extra = 0;
				lcs_prec_todo = lcs_prec;
				if (filler_todo <= 0) {
					need_showbreak = 1;
				} 
				--filler_todo;
				if (filler_todo == 0 && generatedW_botfill) {
					break;
				} 
			} 
		}
		// After an empty line check first word for capital.if (ModernizedCProgram.skipwhite(line) == (byte)'\000') {
			capcol_lnum = lnum + 1;
			cap_col = 0;
		} 
		ModernizedCProgram.vim_free(text_props);
		ModernizedCProgram.vim_free(text_prop_idxs);
		ModernizedCProgram.vim_free(p_extra_free);
		return row;
	}
	/*
	 * Like set_string_option_direct(), but for a window-local option in "wp".
	 * Blocks autocommands to avoid the old curwin becoming invalid.
	 */
	public void set_string_option_direct_in_win(Object name, int opt_idx, Object val, int opt_flags, int set_sid) {
		win_T save_curwin = ModernizedCProgram.curwin;
		ModernizedCProgram.block_autocmds();
		ModernizedCProgram.curwin = wp;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
		ModernizedCProgram.set_string_option_direct(name, opt_idx, val, opt_flags, set_sid);
		ModernizedCProgram.curwin = save_curwin;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
		ModernizedCProgram.unblock_autocmds();
	}
	public void python3_window_free() {
		Object generatedW_python3_ref = this.getW_python3_ref();
		if (generatedW_python3_ref != ((Object)0)) {
			WindowObject wp = generatedW_python3_ref;
			wp.setWin(((win_T)(true)));
			this.setW_python3_ref(((Object)0));
		} 
	}
	public void set_local_options_default(int do_buffer) {
		win_T save_curwin = ModernizedCProgram.curwin;
		int i;
		ModernizedCProgram.curwin = wp;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
		ModernizedCProgram.block_autocmds();
		 generatedIndir = p.getIndir();
		for (i = 0; !ModernizedCProgram.istermoption_idx(i); i++) {
			vimoption p = (ModernizedCProgram.options[i]);
			char_u varp = p.get_varp_scope(4);
			if (generatedIndir != .PV_NONE && (do_buffer || (generatedIndir & -1024) == 0) && !(ModernizedCProgram.options[i].getFlags() & -1024) && !p.optval_default(varp, 0)) {
				ModernizedCProgram.set_option_default(i, 1 | 4, 0);
			} 
		}
		ModernizedCProgram.unblock_autocmds();
		ModernizedCProgram.curwin = save_curwin;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
	}
	public void win_copy_options(window_S wp_to) {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		generatedW_onebuf_opt.copy_winopt(generatedW_onebuf_opt);
		 generatedW_allbuf_opt = this.getW_allbuf_opt();
		generatedW_allbuf_opt.copy_winopt(generatedW_allbuf_opt);
		wp_to/*
		 * After copying window options: update variables depending on options.
		 */.after_copy_winopt();
	}
	public void after_copy_winopt() {
		wp.briopt_check();
		wp.fill_culopt_flags(((Object)0));
		wp/*
		 * Copy the options from one winopt_T to another.
		 * Doesn't free the old option values in "to", use clear_winopt() for that.
		 * The 'scroll' option is not copied, because it depends on the window height.
		 * The 'previewwindow' option is reset, there can be only one preview window.
		 */.check_colorcolumn();
	}
	public void check_win_options() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		generatedW_onebuf_opt.check_winopt();
		 generatedW_allbuf_opt = this.getW_allbuf_opt();
		generatedW_allbuf_opt.check_winopt();
	}
	public int briopt_check() {
		char_u p = new char_u();
		int bri_shift = 0;
		long bri_min = 20;
		int bri_sbr = 0;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_briopt = generatedW_onebuf_opt.getWo_briopt();
		p = generatedWo_briopt;
		while (p != (byte)'\000') {
			if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("shift:"), (size_t)(true)) == 0 && ((p[6] == (byte)'-' && ((int)(p[7]) - (byte)'0' < 10)) || ((int)(p[6]) - (byte)'0' < 10))) {
				p += 6;
				bri_shift = ModernizedCProgram.getdigits(p);
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("min:"), (size_t)(true)) == 0 && ((int)(p[4]) - (byte)'0' < 10)) {
				p += 4;
				bri_min = ModernizedCProgram.getdigits(p);
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("sbr"), (size_t)(true)) == 0) {
				p += 3;
				bri_sbr = 1;
			} 
			if (p != (byte)',' && p != (byte)'\000') {
				return 0;
			} 
			if (p == (byte)',') {
				++p;
			} 
		}
		this.setW_p_brishift(bri_shift);
		this.setW_p_brimin(bri_min);
		this.setW_p_brisbr(bri_sbr);
		return 1/*
		 * Get the local or global value of 'backupcopy'.
		 */;
	}
	public int signcolumn_on() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_scl = generatedW_onebuf_opt.getWo_scl();
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedB_signlist = generatedW_buffer.getB_signlist();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		// column (if present). Otherwise signs are to be displayed in the sign// column.if (generatedWo_scl == (byte)'n' && (generatedWo_scl + 1) == (byte)'u') {
			return generatedB_signlist != ((Object)0) && !generatedWo_nu && !generatedWo_rnu;
		} 
		if (generatedWo_scl == (byte)'n') {
			return 0;
		} 
		if (generatedWo_scl == (byte)'y') {
			return 1;
		} 
		return (generatedB_signlist != ((Object)0));
	}
	// If 'signcolumn' is set to 'number', signs are displayed in the 'number'
	/*
	 * This is called when 'culopt' is changed
	 */
	public int fill_culopt_flags(Object val) {
		char_u p = new char_u();
		char_u culopt_flags_new = 0;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_culopt = generatedW_onebuf_opt.getWo_culopt();
		if (val == ((Object)0)) {
			p = generatedWo_culopt;
		} else {
				p = val;
		} 
		while (p != (byte)'\000') {
			if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("line"), (size_t)(true)) == 0) {
				p += 4;
				culopt_flags_new |=  -1024;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("both"), (size_t)(true)) == 0) {
				p += 4;
				culopt_flags_new |=  -1024 | -1024;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("number"), (size_t)(true)) == 0) {
				p += 6;
				culopt_flags_new |=  -1024;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("screenline"), (size_t)(true)) == 0) {
				p += 10;
				culopt_flags_new |=  -1024;
			} 
			if (p != (byte)',' && p != (byte)'\000') {
				return 0;
			} 
			if (p == (byte)',') {
				++p;
			} 
		}
		// Can't have both "line" and "screenline".if ((culopt_flags_new & -1024) && (culopt_flags_new & -1024)) {
			return 0;
		} 
		this.setW_p_culopt_flags(culopt_flags_new);
		return 1;
	}
	/*
	 * Used when popup options contain "moved": set default moved values.
	 */
	public void set_moved_values() {
		this.setW_popup_curwin(ModernizedCProgram.curwin);
		this.setW_popup_lnum(ModernizedCProgram.curwin.getW_cursor().getLnum());
		this.setW_popup_mincol(ModernizedCProgram.curwin.getW_cursor().getCol());
		this.setW_popup_maxcol(ModernizedCProgram.curwin.getW_cursor().getCol());
	}
	public void set_moved_columns(int flags) {
		char_u ptr = new char_u();
		int len = ModernizedCProgram.find_ident_under_cursor(ptr, flags | 8);
		Object generatedW_popup_mincol = this.getW_popup_mincol();
		if (len > 0) {
			this.setW_popup_mincol((int)(ptr - ModernizedCProgram.ml_get_curline()));
			this.setW_popup_maxcol(generatedW_popup_mincol + len - 1/*
			 * Used when popup options contain "mousemoved": set default moved values.
			 */);
		} 
	}
	public void set_mousemoved_values() {
		this.setW_popup_mouse_row(ModernizedCProgram.mouse_row);
		this.setW_popup_mouse_mincol(ModernizedCProgram.mouse_col);
		this.setW_popup_mouse_maxcol(ModernizedCProgram.mouse_col/*
		 * Used when popup options contain "moved" with "word" or "WORD".
		 */);
	}
	public void set_mousemoved_columns(int flags) {
		win_T textwp = new win_T();
		char_u text = new char_u();
		int col;
		pos_T pos = new pos_T();
		colnr_T mcol = new colnr_T();
		Object generatedLnum = pos.getLnum();
		if (textwp.find_word_under_cursor(ModernizedCProgram.mouse_row, ModernizedCProgram.mouse_col, 1, flags, generatedLnum, text, ((Object)0), col) == 1) {
			pos.setCol(col);
			pos.setColadd(0);
			ModernizedCProgram.getvcol(textwp, pos, mcol, ((Object)0), ((Object)0));
			this.setW_popup_mouse_mincol(mcol);
			pos.setCol(col + (colnr_T)/*Error: Function owner not recognized*/strlen((byte)(text)) - 1);
			ModernizedCProgram.getvcol(textwp, pos, ((Object)0), ((Object)0), mcol);
			this.setW_popup_mouse_maxcol(mcol);
			ModernizedCProgram.vim_free(text/*
			 * Return TRUE if "row"/"col" is on the border of the popup.
			 * The values are relative to the top-left corner.
			 */);
		} 
	}
	public int popup_on_border(int row, int col) {
		Object generatedW_popup_border = this.getW_popup_border();
		return (row == 0 && generatedW_popup_border[0] > 0) || (row == wp.popup_height() - 1 && generatedW_popup_border[2] > 0) || (col == 0 && generatedW_popup_border[3] > 0) || (col == wp.popup_width() - 1 && generatedW_popup_border[1] > 0/*
		 * Return TRUE and close the popup if "row"/"col" is on the "X" button of the
		 * popup and w_popup_close is POPCLOSE_BUTTON.
		 * The values are relative to the top-left corner.
		 * Caller should check the left mouse button was clicked.
		 * Return TRUE if the popup was closed.
		 */);
	}
	public int popup_close_if_on_X(int row, int col) {
		Object generatedW_popup_close = this.getW_popup_close();
		if (generatedW_popup_close == .POPCLOSE_BUTTON && row == 0 && col == wp.popup_width() - 1) {
			wp.popup_close_for_mouse_click();
			return 1;
		} 
		return 0;// Values set when dragging a popup window starts.
	}
	/*
	 * Mouse down on border of popup window: start dragging it.
	 * Uses mouse_col and mouse_row.
	 */
	public void popup_start_drag(int row, int col) {
		ModernizedCProgram.drag_start_row = ModernizedCProgram.mouse_row;
		ModernizedCProgram.drag_start_col = ModernizedCProgram.mouse_col;
		Object generatedW_wantline = this.getW_wantline();
		int generatedW_winrow = this.getW_winrow();
		if (generatedW_wantline == 0) {
			ModernizedCProgram.drag_start_wantline = generatedW_winrow + 1;
		} else {
				ModernizedCProgram.drag_start_wantline = generatedW_wantline;
		} 
		Object generatedW_wantcol = this.getW_wantcol();
		int generatedW_wincol = this.getW_wincol();
		if (generatedW_wantcol == 0) {
			ModernizedCProgram.drag_start_wantcol = generatedW_wincol + 1;
		} else {
				ModernizedCProgram.drag_start_wantcol = generatedW_wantcol;
		} 
		Object generatedW_popup_pos = this.getW_popup_pos();
		// Stop centering the popupif (generatedW_popup_pos == .POPPOS_CENTER) {
			this.setW_popup_pos(.POPPOS_TOPLEFT);
		} 
		Object generatedW_popup_border = this.getW_popup_border();
		ModernizedCProgram.drag_on_resize_handle = generatedW_popup_border[1] > 0 && generatedW_popup_border[2] > 0 && row == wp.popup_height() - 1 && col == wp.popup_width() - 1;
		if (generatedW_popup_pos != .POPPOS_TOPLEFT && ModernizedCProgram.drag_on_resize_handle) {
			if (generatedW_popup_pos == .POPPOS_TOPRIGHT || generatedW_popup_pos == .POPPOS_BOTRIGHT) {
				this.setW_wantcol(generatedW_wincol + 1);
			} 
			if (generatedW_popup_pos == .POPPOS_BOTLEFT) {
				this.setW_wantline(generatedW_winrow + 1);
			} 
			this.setW_popup_pos(.POPPOS_TOPLEFT/*
			 * Mouse moved while dragging a popup window: adjust the window popup position
			 * or resize.
			 */);
		} 
	}
	public void popup_drag() {
		// The popup may be closed before dragging stops.if (!wp.win_valid_popup()) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedW_popup_flags = this.getW_popup_flags();
		int generatedW_width = this.getW_width();
		int generatedW_height = this.getW_height();
		if ((generatedW_popup_flags & -1024) && ModernizedCProgram.drag_on_resize_handle) {
			int width_inc = ModernizedCProgram.mouse_col - ModernizedCProgram.drag_start_col;
			int height_inc = ModernizedCProgram.mouse_row - ModernizedCProgram.drag_start_row;
			if (width_inc != 0) {
				int width = generatedW_width + width_inc;
				if (width < 1) {
					width = 1;
				} 
				this.setW_minwidth(width);
				this.setW_maxwidth(width);
				ModernizedCProgram.drag_start_col = ModernizedCProgram.mouse_col;
			} 
			if (height_inc != 0) {
				int height = generatedW_height + height_inc;
				if (height < 1) {
					height = 1;
				} 
				this.setW_minheight(height);
				this.setW_maxheight(height);
				ModernizedCProgram.drag_start_row = ModernizedCProgram.mouse_row;
			} 
			wp.popup_adjust_position();
			return /*Error: Unsupported expression*/;
		} 
		if (!(generatedW_popup_flags & -1024)) {
			return /*Error: Unsupported expression*/;
		} 
		this.setW_wantline(ModernizedCProgram.drag_start_wantline + (ModernizedCProgram.mouse_row - ModernizedCProgram.drag_start_row));
		Object generatedW_wantline = this.getW_wantline();
		if (generatedW_wantline < 1) {
			this.setW_wantline(1);
		} 
		if (generatedW_wantline > ModernizedCProgram.Rows) {
			this.setW_wantline(ModernizedCProgram.Rows);
		} 
		this.setW_wantcol(ModernizedCProgram.drag_start_wantcol + (ModernizedCProgram.mouse_col - ModernizedCProgram.drag_start_col));
		Object generatedW_wantcol = this.getW_wantcol();
		if (generatedW_wantcol < 1) {
			this.setW_wantcol(1);
		} 
		if (generatedW_wantcol > Columns) {
			this.setW_wantcol(Columns);
		} 
		wp/*
		 * Set w_firstline to match the current "wp->w_topline".
		 */.popup_adjust_position();
	}
	public void popup_set_firstline() {
		int generatedW_height = this.getW_height();
		int height = generatedW_height;
		Object generatedW_topline = this.getW_topline();
		this.setW_firstline(generatedW_topline);
		wp.popup_adjust_position()// we don't want the popup to get smaller, decrement the first line;// we don't want the popup to get smaller, decrement the first line
		Object generatedW_firstline = this.getW_firstline();
		// until it doesn'twhile (generatedW_firstline > 1 && generatedW_height < height) {
			--generatedW_firstline;
			wp/*
			 * Return TRUE if the position is in the popup window scrollbar.
			 */.popup_adjust_position();
		}
	}
	public int popup_is_in_scrollbar(int row, int col) {
		Object generatedW_has_scrollbar = this.getW_has_scrollbar();
		Object generatedW_popup_border = this.getW_popup_border();
		return generatedW_has_scrollbar && row >= generatedW_popup_border[0] && row < wp.popup_height() - generatedW_popup_border[2] && col == wp.popup_width() - generatedW_popup_border[1] - 1/*
		 * Handle a click in a popup window, if it is in the scrollbar.
		 */;
	}
	public void popup_handle_scrollbar_click(int row, int col) {
		int height = wp.popup_height();
		Object generatedW_topline = this.getW_topline();
		int old_topline = generatedW_topline;
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (wp.popup_is_in_scrollbar(row, col)) {
			if (row >= height / 2) {
				if (generatedW_topline < generatedMl_line_count) {
					++generatedW_topline;
				} 
			}  else if (generatedW_topline > 1) {
				--generatedW_topline;
			} 
			if (generatedW_topline != old_topline) {
				wp.popup_set_firstline();
				wp.redraw_win_later(40);
			} 
		} 
	}
	public void popup_add_timeout(int time) {
		char_u[] cbbuf = new char_u();
		char_u ptr = cbbuf;
		typval_T tv = new typval_T();
		int generatedW_id = this.getW_id();
		ModernizedCProgram.vim_snprintf((byte)cbbuf, /*Error: sizeof expression not supported yet*/, "{_ -> popup_close(%d)}", generatedW_id);
		timer_S timer_S = new timer_S();
		Object generatedW_popup_timer = this.getW_popup_timer();
		if (tv.get_lambda_tv(ptr, 1) == 1) {
			this.setW_popup_timer(timer_S.create_timer(time, 0));
			generatedW_popup_timer.setTr_callback(tv.get_callback());
			tv.clear_tv();
		} 
	}
	/*
	 * Scroll to show the line with the cursor.
	 */
	public void popup_show_curline() {
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		Object generatedW_topline = this.getW_topline();
		Object generatedW_botline = this.getW_botline();
		int generatedW_height = this.getW_height();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedLnum < generatedW_topline) {
			this.setW_topline(generatedLnum);
		}  else if (generatedLnum >= generatedW_botline && (ModernizedCProgram.curwin.getW_valid() & -1024)) {
			this.setW_topline(generatedLnum - generatedW_height + 1);
			if (generatedW_topline < 1) {
				this.setW_topline(1);
			}  else if (generatedW_topline > generatedMl_line_count) {
				this.setW_topline(generatedMl_line_count);
			} 
			while (generatedW_topline < generatedLnum && generatedW_topline < generatedMl_line_count && wp.plines_m_win(generatedW_topline, generatedLnum) > generatedW_height) {
				++generatedW_topline;
			}
		} 
		// Don't use "firstline" now.// Don't use "firstline" now.this.setW_firstline(0/*
		 * Get the sign group name for window "wp".
		 * Returns a pointer to a static buffer, overwritten on the next call.
		 */);
	}
	public Object popup_get_sign_name() {
		byte[] buf = new byte[30];
		int generatedW_id = this.getW_id();
		ModernizedCProgram.vim_snprintf(buf, /*Error: sizeof expression not supported yet*/, "popup-%d", generatedW_id);
		return (char_u)buf/*
		 * Highlight the line with the cursor.
		 * Also scrolls the text to put the cursor line in view.
		 */;
	}
	public void popup_highlight_curline() {
		int sign_id = 0;
		char_u sign_name = wp.popup_get_sign_name();
		file_buffer generatedW_buffer = this.getW_buffer();
		generatedW_buffer.buf_delete_signs((char_u)"popupmenu");
		Object generatedW_popup_flags = this.getW_popup_flags();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		if ((generatedW_popup_flags & -1024) != 0) {
			wp.popup_show_curline();
			if (!ModernizedCProgram.sign_exists_by_name(sign_name)) {
				byte linehl = "PopupSelected";
				if (ModernizedCProgram.syn_name2id((char_u)linehl) == 0) {
					linehl = "PmenuSel";
				} 
				ModernizedCProgram.sign_define_by_name(sign_name, ((Object)0), (char_u)linehl, ((Object)0), ((Object)0));
			} 
			generatedW_buffer.sign_place(sign_id, (char_u)"popupmenu", sign_name, generatedLnum, 10);
			wp.redraw_win_later(40);
		} else {
				ModernizedCProgram.sign_undefine_by_name(sign_name, 0);
		} 
		this.setW_popup_last_curline(generatedLnum);
	}
	/*
	 * Get the padding plus border at the top, adjusted to 1 if there is a title.
	 */
	public int popup_top_extra() {
		Object generatedW_popup_border = this.getW_popup_border();
		Object generatedW_popup_padding = this.getW_popup_padding();
		int extra = generatedW_popup_border[0] + generatedW_popup_padding[0];
		Object generatedW_popup_title = this.getW_popup_title();
		if (extra == 0 && generatedW_popup_title != ((Object)0) && generatedW_popup_title != (byte)'\000') {
			return 1;
		} 
		return extra/*
		 * Return the height of popup window "wp", including border and padding.
		 */;
	}
	public int popup_height() {
		int generatedW_height = this.getW_height();
		Object generatedW_popup_padding = this.getW_popup_padding();
		Object generatedW_popup_border = this.getW_popup_border();
		return generatedW_height + wp.popup_top_extra() + generatedW_popup_padding[2] + generatedW_popup_border[2/*
		 * Return the width of popup window "wp", including border, padding and
		 * scrollbar.
		 */];
	}
	public int popup_width() {
		int generatedW_width = this.getW_width();
		Object generatedW_leftcol = this.getW_leftcol();
		Object generatedW_popup_rightoff = this.getW_popup_rightoff();
		// w_leftcol is how many columns of the core are left of the screen// w_popup_rightoff is how many columns of the core are right of the screenreturn generatedW_width + generatedW_leftcol + wp.popup_extra_width() + generatedW_popup_rightoff;
	}
	public int popup_extra_width() {
		Object generatedW_popup_padding = this.getW_popup_padding();
		Object generatedW_popup_border = this.getW_popup_border();
		Object generatedW_has_scrollbar = this.getW_has_scrollbar();
		return generatedW_popup_padding[3] + generatedW_popup_border[3] + generatedW_popup_padding[1] + generatedW_popup_border[1] + generatedW_has_scrollbar;
	}
	public void popup_adjust_position() {
		linenr_T lnum = new linenr_T();
		int wrapped = 0;
		int maxwidth;
		int used_maxwidth = 0;
		int maxspace;
		int center_vert = 0;
		int center_hor = 0;
		Object generatedW_popup_fixed = this.getW_popup_fixed();
		int allow_adjust_left = !generatedW_popup_fixed;
		int top_extra = wp.popup_top_extra();
		Object generatedW_popup_border = this.getW_popup_border();
		Object generatedW_popup_padding = this.getW_popup_padding();
		int right_extra = generatedW_popup_border[1] + generatedW_popup_padding[1];
		int bot_extra = generatedW_popup_border[2] + generatedW_popup_padding[2];
		int left_extra = generatedW_popup_border[3] + generatedW_popup_padding[3];
		int extra_height = top_extra + bot_extra;
		int extra_width = left_extra + right_extra;
		int generatedW_winrow = this.getW_winrow();
		int org_winrow = generatedW_winrow;
		int generatedW_wincol = this.getW_wincol();
		int org_wincol = generatedW_wincol;
		int generatedW_width = this.getW_width();
		int org_width = generatedW_width;
		int generatedW_height = this.getW_height();
		int org_height = generatedW_height;
		Object generatedW_leftcol = this.getW_leftcol();
		int org_leftcol = generatedW_leftcol;
		Object generatedW_popup_leftoff = this.getW_popup_leftoff();
		int org_leftoff = generatedW_popup_leftoff;
		int minwidth;
		Object generatedW_wantline = this.getW_wantline();
		// adjusted for textpropint wantline = generatedW_wantline;
		Object generatedW_wantcol = this.getW_wantcol();
		// adjusted for textpropint wantcol = generatedW_wantcol;
		this.setW_winrow(0);
		this.setW_wincol(0);
		this.setW_leftcol(0);
		this.setW_popup_leftoff(0);
		this.setW_popup_rightoff(0)// May need to update the "cursorline" highlighting, which may also change;// May need to update the "cursorline" highlighting, which may also change
		Object generatedW_popup_last_curline = this.getW_popup_last_curline();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		// "topline"if (generatedW_popup_last_curline != generatedLnum) {
			wp.popup_highlight_curline();
		} 
		// If no line was specified default to vertical centering.if (wantline == 0) {
			center_vert = 1;
		} 
		Object generatedW_popup_prop_type = this.getW_popup_prop_type();
		Object generatedW_popup_prop_win = this.getW_popup_prop_win();
		Object generatedW_popup_prop_id = this.getW_popup_prop_id();
		Object generatedW_popup_flags = this.getW_popup_flags();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		Object generatedTp_col = prop.getTp_col();
		Object generatedW_popup_pos = this.getW_popup_pos();
		Object generatedCol = pos.getCol();
		Object generatedTp_len = prop.getTp_len();
		if (generatedW_popup_prop_type > 0 && generatedW_popup_prop_win.win_valid()) {
			win_T prop_win = generatedW_popup_prop_win;
			textprop_T prop = new textprop_T();
			linenr_T prop_lnum = new linenr_T();
			pos_T pos = new pos_T();
			int screen_row;
			int screen_scol;
			int screen_ccol;
			int screen_ecol;
			if (ModernizedCProgram.find_visible_prop(prop_win, generatedW_popup_prop_type, generatedW_popup_prop_id, prop, prop_lnum) == 0) {
				if ((generatedW_popup_flags & -1024) == 0) {
					generatedW_popup_flags |=  -1024;
					--generatedB_nwindows;
					if (generatedW_popup_prop_win.win_valid()) {
						generatedW_popup_prop_win.redraw_win_later(35);
					} 
				} 
				return /*Error: Unsupported expression*/;
			} 
			pos.setLnum(prop_lnum);
			pos.setCol(generatedTp_col);
			if (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_BOTLEFT) {
				generatedCol += generatedTp_len - 1;
			} 
			ModernizedCProgram.textpos2screenpos(prop_win, pos, screen_row, screen_scol, screen_ccol, screen_ecol);
			if (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_TOPRIGHT) {
				wantline = screen_row + wantline + 1;
			} else {
					wantline = screen_row + wantline - 1;
			} 
			center_vert = 0;
			if (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_BOTLEFT) {
				wantcol = screen_ecol + wantcol;
			} else {
					wantcol = screen_scol + wantcol - 2;
			} 
		} 
		if (generatedW_popup_pos == .POPPOS_CENTER) {
			center_vert = 1;
			center_hor = 1;
		} else {
				if (wantline > 0 && (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_TOPRIGHT)) {
					this.setW_winrow(wantline - 1);
					if (generatedW_winrow >= ModernizedCProgram.Rows) {
						this.setW_winrow(ModernizedCProgram.Rows - 1);
					} 
				} 
				if (wantcol == 0) {
					center_hor = 1;
				}  else if (wantcol > 0 && (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_BOTLEFT)) {
					this.setW_wincol(wantcol - 1);
					if (generatedW_wincol >= Columns - 3) {
						this.setW_wincol(Columns - 3);
					} 
				} 
		} 
		// When centering or right aligned, use maximum width.// When left aligned use the space available, but shift to the left when we// hit the right of the screen.// When centering or right aligned, use maximum width.// When left aligned use the space available, but shift to the left when we// hit the right of the screen.maxspace = Columns - generatedW_wincol - left_extra;
		maxwidth = maxspace;
		Object generatedW_maxwidth = this.getW_maxwidth();
		if (generatedW_maxwidth > 0 && maxwidth > generatedW_maxwidth) {
			allow_adjust_left = 0;
			maxwidth = generatedW_maxwidth;
		} 
		Object generatedW_firstline = this.getW_firstline();
		// start at the desired first lineif (generatedW_firstline > 0) {
			this.setW_topline(generatedW_firstline);
		} 
		Object generatedW_topline = this.getW_topline();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedW_topline < 1) {
			this.setW_topline(1);
		}  else if (generatedW_topline > generatedMl_line_count) {
			this.setW_topline(generatedMl_line_count);
		} 
		// When "firstline" is -1 then start with the last buffer line and go// backwards.// TODO: more accurate wrapping// When "firstline" is -1 then start with the last buffer line and go// backwards.// TODO: more accurate wrappingthis.setW_width(1);
		if (generatedW_firstline < 0) {
			lnum = generatedMl_line_count;
		} else {
				lnum = generatedW_topline;
		} 
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		Object generatedW_maxheight = this.getW_maxheight();
		while (lnum >= 1 && lnum <= generatedMl_line_count) {
			int len;
			int w_width = generatedW_width;
			if (generatedW_width < maxwidth) {
				this.setW_width(maxwidth);
			} 
			len = wp.win_linetabsize(generatedW_buffer.ml_get_buf(lnum, 0), (colnr_T)INT_MAX);
			this.setW_width(w_width);
			if (generatedWo_wrap) {
				while (len > maxwidth) {
					++wrapped;
					len -= maxwidth;
					this.setW_width(maxwidth);
					used_maxwidth = 1;
				}
			}  else if (len > maxwidth && allow_adjust_left && (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_BOTLEFT)) {
				int shift_by = len - maxwidth;
				if (shift_by > generatedW_wincol) {
					int truncate_shift = shift_by - generatedW_wincol;
					len -= truncate_shift;
					shift_by -= truncate_shift;
				} 
				generatedW_wincol -= shift_by;
				maxwidth += shift_by;
				this.setW_width(maxwidth);
			} 
			if (generatedW_width < len) {
				this.setW_width(len);
				if (generatedW_maxwidth > 0 && generatedW_width > generatedW_maxwidth) {
					this.setW_width(generatedW_maxwidth);
				} 
			} 
			if (generatedW_maxheight > 0 && (generatedW_firstline >= 0 ? lnum - generatedW_topline : generatedMl_line_count - lnum) + 1 + wrapped > generatedW_maxheight) {
				break;
			} 
			if (generatedW_firstline < 0) {
				--lnum;
			} else {
					++lnum;
			} 
		}
		if (generatedW_firstline < 0) {
			this.setW_topline(lnum > 0 ? lnum + 1 : lnum);
		} 
		Object generatedW_want_scrollbar = this.getW_want_scrollbar();
		this.setW_has_scrollbar(generatedW_want_scrollbar && (generatedW_topline > 1 || lnum <= generatedMl_line_count));
		Object generatedW_has_scrollbar = this.getW_has_scrollbar();
		if (generatedW_has_scrollbar) {
			++right_extra;
			++extra_width;
			if (used_maxwidth) {
				maxwidth -= 2;
			} 
		} 
		Object generatedW_minwidth = this.getW_minwidth();
		minwidth = generatedW_minwidth;
		Object generatedW_popup_title = this.getW_popup_title();
		if (generatedW_popup_title != ((Object)0) && generatedW_popup_title != (byte)'\000') {
			int title_len = ModernizedCProgram.vim_strsize(generatedW_popup_title) + 2 - extra_width;
			if (minwidth < title_len) {
				minwidth = title_len;
			} 
		} 
		if (minwidth > 0 && generatedW_width < minwidth) {
			this.setW_width(minwidth);
		} 
		if (generatedW_width > maxwidth) {
			if (generatedW_width > maxspace && !generatedWo_wrap) {
				this.setW_popup_rightoff(generatedW_width - maxspace);
			} 
			this.setW_width(maxwidth);
		} 
		if (center_hor) {
			this.setW_wincol((Columns - generatedW_width - extra_width) / 2);
			if (generatedW_wincol < 0) {
				this.setW_wincol(0);
			} 
		}  else if (generatedW_popup_pos == .POPPOS_BOTRIGHT || generatedW_popup_pos == .POPPOS_TOPRIGHT) {
			int leftoff = wantcol - (generatedW_width + extra_width);
			if (leftoff >= 0) {
				this.setW_wincol(leftoff);
			}  else if (generatedW_popup_fixed) {
				if (-leftoff > left_extra) {
					this.setW_leftcol(-leftoff - left_extra);
				} 
				generatedW_width -= generatedW_leftcol;
				this.setW_popup_leftoff(-leftoff);
				if (generatedW_width < 0) {
					this.setW_width(0);
				} 
			} 
		} 
		if (generatedWo_wrap || (!generatedW_popup_fixed && (generatedW_popup_pos == .POPPOS_TOPLEFT || generatedW_popup_pos == .POPPOS_BOTLEFT))) {
			int want_col = 0;
			want_col = left_extra + generatedW_width + right_extra;
			if (want_col > 0 && generatedW_wincol > 0 && generatedW_wincol + want_col >= Columns) {
				this.setW_wincol(Columns - want_col);
				if (generatedW_wincol < 0) {
					this.setW_wincol(0);
				} 
			} 
		} 
		this.setW_height(generatedMl_line_count - generatedW_topline + 1 + wrapped);
		Object generatedW_minheight = this.getW_minheight();
		if (generatedW_minheight > 0 && generatedW_height < generatedW_minheight) {
			this.setW_height(generatedW_minheight);
		} 
		if (generatedW_maxheight > 0 && generatedW_height > generatedW_maxheight) {
			this.setW_height(generatedW_maxheight);
		} 
		if (generatedW_height > ModernizedCProgram.Rows - generatedW_winrow) {
			this.setW_height(ModernizedCProgram.Rows - generatedW_winrow);
		} 
		if (center_vert) {
			this.setW_winrow((ModernizedCProgram.Rows - generatedW_height - extra_height) / 2);
			if (generatedW_winrow < 0) {
				this.setW_winrow(0);
			} 
		}  else if (generatedW_popup_pos == .POPPOS_BOTRIGHT || generatedW_popup_pos == .POPPOS_BOTLEFT) {
			if ((generatedW_height + extra_height) <= wantline) {
				this.setW_winrow(wantline - (generatedW_height + extra_height));
			} else {
					this.setW_winrow(wantline + 1);
			} 
		} 
		if (generatedW_winrow >= ModernizedCProgram.Rows) {
			this.setW_winrow(ModernizedCProgram.Rows - 1);
		}  else if (generatedW_winrow < 0) {
			this.setW_winrow(0);
		} 
		dictitem16_S generatedB_ct_di = (generatedW_buffer).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		this.setW_popup_last_changedtick((generatedVval.getV_number()));
		if (generatedW_popup_prop_win.win_valid()) {
			this.setW_popup_prop_changedtick((generatedVval.getV_number()));
			this.setW_popup_prop_topline(generatedW_topline);
		} 
		// Need to update popup_mask if the position or size changed.// And redraw windows and statuslines that were behind the popup.if (org_winrow != generatedW_winrow || org_wincol != generatedW_wincol || org_leftcol != generatedW_leftcol || org_leftoff != generatedW_popup_leftoff || org_width != generatedW_width || org_height != generatedW_height) {
			wp.redraw_win_later(40);
			if (generatedW_popup_flags & -1024) {
				clear_cmdline = 1;
			} 
			popup_mask_refresh = 1;
		} 
	}
	/*
	 * Get option value for "key", which is "line" or "col".
	 * Handles "cursor+N" and "cursor-N".
	 * Returns MAXCOL if the entry is not present.
	 */
	public int parse_popup_option(int is_preview) {
		char_u p = !is_preview ? p_cpp : p_pvp;
		Object generatedW_popup_flags = this.getW_popup_flags();
		if (wp != ((Object)0)) {
			generatedW_popup_flags &=  ~-1024;
		} 
		Object generatedW_popup_border = this.getW_popup_border();
		for (; p != (byte)'\000'; p += (p == (byte)',' ? 1 : 0)) {
			char_u e = new char_u();
			char_u dig = new char_u();
			char_u s = p;
			int x;
			e = ModernizedCProgram.vim_strchr(p, (byte)':');
			if (e == ((Object)0) || e[1] == (byte)'\000') {
				return 0;
			} 
			p = ModernizedCProgram.vim_strchr(e, (byte)',');
			if (p == ((Object)0)) {
				p = e + /*Error: Function owner not recognized*/strlen((byte)(e));
			} 
			dig = e + 1;
			x = ModernizedCProgram.getdigits(dig);
			if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)("height:"), (size_t)(true)) == 0) {
				if (dig != p) {
					return 0;
				} 
				if (wp != ((Object)0)) {
					if (is_preview) {
						this.setW_minheight(x);
					} 
					this.setW_maxheight(x);
				} 
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)("width:"), (size_t)(true)) == 0) {
				if (dig != p) {
					return 0;
				} 
				if (wp != ((Object)0)) {
					if (is_preview) {
						this.setW_minwidth(x);
					} 
					this.setW_maxwidth(x);
				} 
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)("highlight:"), (size_t)(true)) == 0) {
				if (wp != ((Object)0)) {
					int c = p;
					p = (byte)'\000';
					wp.set_string_option_direct_in_win((char_u)"wincolor", -1, s + 10, 1 | 4, 0);
					p = c;
				} 
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)("border:"), (size_t)(true)) == 0) {
				char_u arg = s + 7;
				int on = /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("on"), (size_t)(true)) == 0 && arg + 2 == p;
				int off = /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("off"), (size_t)(true)) == 0 && arg + 3 == p;
				int i;
				if (!on && !off) {
					return 0;
				} 
				if (wp != ((Object)0)) {
					for (i = 0; i < 4; ++i) {
						generatedW_popup_border[i] = on ? 1 : 0;
					}
					if (off) {
						this.setW_popup_close(.POPCLOSE_NONE);
					} 
				} 
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(s), (byte)("align:"), (size_t)(true)) == 0) {
				char_u arg = s + 6;
				int item = /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("item"), (size_t)(true)) == 0 && arg + 4 == p;
				int menu = /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("menu"), (size_t)(true)) == 0 && arg + 4 == p;
				if (!menu && !item) {
					return 0;
				} 
				if (wp != ((Object)0) && menu) {
					generatedW_popup_flags |=  -1024;
				} 
			} else {
					return 0;
			} 
		}
		return 1/*
		 * Parse the 'previewpopup' option and apply the values to window "wp" if it
		 * is not NULL.
		 * Return FAIL if the parsing fails.
		 */;
	}
	public int parse_previewpopup() {
		return wp.parse_popup_option(1/*
		 * Parse the 'completepopup' option and apply the values to window "wp" if it
		 * is not NULL.
		 * Return FAIL if the parsing fails.
		 */);
	}
	public int parse_completepopup() {
		return wp.parse_popup_option(0/*
		 * Set w_wantline and w_wantcol for the cursor position in the current window.
		 * Keep at least "width" columns from the right of the screen.
		 */);
	}
	public void popup_set_wantpos_cursor(int width) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setcursor_mayforce(1);
		this.setW_wantline(ModernizedCProgram.curwin.getW_winrow() + ModernizedCProgram.curwin.getW_wrow());
		Object generatedW_wantline = this.getW_wantline();
		// cursor in first lineif (generatedW_wantline == 0) {
			this.setW_wantline(2);
			this.setW_popup_pos(.POPPOS_TOPLEFT);
		} 
		this.setW_wantcol(ModernizedCProgram.curwin.getW_wincol() + ModernizedCProgram.curwin.getW_wcol() + 1);
		Object generatedW_wantcol = this.getW_wantcol();
		if (generatedW_wantcol > Columns - width) {
			this.setW_wantcol(Columns - width);
			if (generatedW_wantcol < 1) {
				this.setW_wantcol(1);
			} 
		} 
		wp/*
		 * Set w_wantline and w_wantcol for the a given screen position.
		 * Caller must take care of running into the window border.
		 */.popup_adjust_position();
	}
	public void popup_set_wantpos_rowcol(int row, int col) {
		this.setW_wantline(row);
		this.setW_wantcol(col);
		wp/*
		 * Add a border and lef&right padding.
		 */.popup_adjust_position();
	}
	public void add_border_left_right_padding() {
		int i;
		Object generatedW_popup_border = this.getW_popup_border();
		Object generatedW_popup_padding = this.getW_popup_padding();
		for (i = 0; i < 4; ++i) {
			generatedW_popup_border[i] = 1;
			generatedW_popup_padding[i] = (i & 1) ? 1 : 0/*
			 * popup_create({text}, {options})
			 * popup_atcursor({text}, {options})
			 * etc.
			 * When creating a preview or info popup "argvars" and "rettv" are NULL.
			 */;
		}
	}
	public window_S popup_create([] argvars,  rettv,  type) {
		win_T wp = new win_T();
		tabpage_T tp = ((Object)0);
		int tabnr = 0;
		int new_buffer;
		buf_T buf = ((Object)0);
		dict_T d = ((Object)0);
		int nr;
		int i;
		file_buffer file_buffer = new file_buffer();
		if (argvars != ((Object)0)) {
			if (argvars[0].getV_type() == .VAR_NUMBER) {
				buf = file_buffer.buflist_findnr(argvars[0].getVval().getV_number());
				if (buf == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)(e_nobufnr)), argvars[0].getVval().getV_number());
					return ((Object)0);
				} 
			}  else if (!(argvars[0].getV_type() == .VAR_STRING && argvars[0].getVval().getV_string() != ((Object)0)) && !(argvars[0].getV_type() == .VAR_LIST && argvars[0].getVval().getV_list() != ((Object)0))) {
				ModernizedCProgram.emsg(((byte)(e_listreq)));
				return ((Object)0);
			} 
			if (argvars[1].getV_type() != .VAR_DICT || argvars[1].getVval().getV_dict() == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_dictreq)));
				return ((Object)0);
			} 
			d = argvars[1].getVval().getV_dict();
		} 
		dictitem_S dictitem_S = new dictitem_S();
		tabpage_S tabpage_S = new tabpage_S();
		if (d != ((Object)0)) {
			if (dictitem_S.dict_find(d, (char_u)"tabpage", -1) != ((Object)0)) {
				tabnr = (int)d.dict_get_number((char_u)"tabpage");
			}  else if (type == .TYPE_NOTIFICATION) {
				tabnr = -1;
			} else {
					tabnr = 0;
			} 
			if (tabnr > 0) {
				tp = tabpage_S.find_tabpage(tabnr);
				if (tp == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)("E997: Tabpage not found: %d")), tabnr);
					return ((Object)0);
				} 
			} 
		} 
		window_S window_S = new window_S();
		// Create the window and buffer.// Create the window and buffer.wp = window_S.win_alloc_popup_win();
		if (wp == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedW_id = wp.getW_id();
		Object generatedVval = rettv.getVval();
		if (rettv != ((Object)0)) {
			generatedVval.setV_number(generatedW_id);
		} 
		wp.setW_popup_pos(.POPPOS_TOPLEFT);
		wp.setW_popup_flags(-1024 | -1024);
		file_buffer file_buffer = new file_buffer();
		if (buf != ((Object)0)) {
			new_buffer = 0;
			ModernizedCProgram.win_init_popup_win(wp, buf);
			wp.set_local_options_default(0);
			buf.buffer_ensure_loaded();
		} else {
				new_buffer = 1;
				buf = file_buffer.buflist_new(((Object)0), ((Object)0), (linenr_T)0, 8 | 4 | 64);
				if (buf == ((Object)0)) {
					return ((Object)0);
				} 
				buf.ml_open();
				ModernizedCProgram.win_init_popup_win(wp, buf);
				wp.set_local_options_default(1);
				buf.set_string_option_direct_in_buf((char_u)"buftype", -1, (char_u)"popup", 1 | 4, 0);
				buf.set_string_option_direct_in_buf((char_u)"bufhidden", -1, (char_u)"wipe", 1 | 4, 0);
				buf.setB_p_ul(-1);
				buf.setB_p_swf(0);
				buf.setB_p_bl(0);
				buf.setB_locked(1);
				buf.setB_p_initialized(1);
		} 
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		// 'wrap' is default on// 'wrap' is default ongeneratedW_onebuf_opt.setWo_wrap(1);
		// 'scrolloff' zero// 'scrolloff' zerowp.setW_p_so(0);
		Object generatedTp_first_popupwin = tp.getTp_first_popupwin();
		window_S generatedW_next = prev.getW_next();
		if (tp != ((Object)0)) {
			wp.setW_next(generatedTp_first_popupwin);
			tp.setTp_first_popupwin(wp);
		}  else if (tabnr == 0) {
			wp.setW_next(generatedTp_first_popupwin);
			ModernizedCProgram.curtab.setTp_first_popupwin(wp);
		} else {
				win_T prev = first_popupwin;
				if (first_popupwin == ((Object)0)) {
					first_popupwin = wp;
				} else {
						while (generatedW_next != ((Object)0)) {
							prev = generatedW_next;
						}
						prev.setW_next(wp);
				} 
		} 
		if (new_buffer && argvars != ((Object)0)) {
			ModernizedCProgram.popup_set_buffer_text(buf, argvars[0]);
		} 
		if (type == .TYPE_ATCURSOR || type == .TYPE_PREVIEW) {
			wp.setW_popup_pos(.POPPOS_BOTLEFT);
		} 
		if (type == .TYPE_ATCURSOR) {
			wp.popup_set_wantpos_cursor(0);
			wp.set_moved_values();
			wp.set_moved_columns(2);
		} 
		Object generatedW_wantline = wp.getW_wantline();
		if (type == .TYPE_BEVAL) {
			wp.setW_popup_pos(.POPPOS_BOTLEFT);
			wp.setW_wantline(ModernizedCProgram.mouse_row);
			if (generatedW_wantline <= 0) {
				wp.setW_wantline(2);
				wp.setW_popup_pos(.POPPOS_TOPLEFT);
			} 
			wp.setW_wantcol(ModernizedCProgram.mouse_col + 1);
			wp.set_mousemoved_values();
			wp.set_mousemoved_columns(1 + 2 + 4);
		} 
		// set default values// set default valueswp.setW_zindex(50);
		wp.setW_popup_close(.POPCLOSE_NONE);
		memline generatedB_ml = buf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_zindex = twp.getW_zindex();
		int generatedW_winrow = twp.getW_winrow();
		Object generatedW_popup_flags = wp.getW_popup_flags();
		Object generatedW_popup_border = wp.getW_popup_border();
		Object generatedW_popup_padding = wp.getW_popup_padding();
		if (type == .TYPE_NOTIFICATION) {
			win_T twp = new win_T();
			win_T nextwin = new win_T();
			int height = generatedMl_line_count + 3;
			wp.setW_wantline(1);
			for (twp = first_popupwin; twp != ((Object)0); twp = nextwin) {
				nextwin = generatedW_next;
				if (twp != wp && generatedW_zindex == 300 && generatedW_winrow <= generatedW_wantline - 1 + height && generatedW_winrow + twp.popup_height() > generatedW_wantline - 1) {
					wp.setW_wantline(generatedW_winrow + twp.popup_height() + 1);
					nextwin = first_popupwin;
				} 
			}
			if (generatedW_wantline + height > ModernizedCProgram.Rows) {
				wp.setW_wantline(1);
			} 
			wp.setW_wantcol(10);
			wp.setW_zindex(300);
			wp.setW_minwidth(20);
			generatedW_popup_flags |=  -1024;
			wp.setW_popup_close(.POPCLOSE_CLICK);
			for (i = 0; i < 4; ++i) {
				generatedW_popup_border[i] = 1;
			}
			generatedW_popup_padding[1] = 1;
			generatedW_popup_padding[3] = 1;
			nr = ModernizedCProgram.syn_name2id((char_u)"PopupNotification");
			wp.set_string_option_direct_in_win((char_u)"wincolor", -1, (char_u)(nr == 0 ? "WarningMsg" : "PopupNotification"), 1 | 4, 0);
		} 
		if (type == .TYPE_DIALOG || type == .TYPE_MENU) {
			wp.setW_popup_pos(.POPPOS_CENTER);
			wp.setW_zindex(200);
			generatedW_popup_flags |=  -1024;
			generatedW_popup_flags &=  ~-1024;
			wp.add_border_left_right_padding();
		} 
		Object generatedCb_name = callback.getCb_name();
		Object generatedW_filter_cb = wp.getW_filter_cb();
		if (type == .TYPE_MENU) {
			typval_T tv = new typval_T();
			callback_T callback = new callback_T();
			tv.setV_type(.VAR_STRING);
			generatedVval.setV_string((char_u)"popup_filter_menu");
			callback = tv.get_callback();
			if (generatedCb_name != ((Object)0)) {
				generatedW_filter_cb.set_callback(callback);
			} 
			generatedW_onebuf_opt.setWo_wrap(0);
			generatedW_popup_flags |=  -1024;
		} 
		Object generatedW_minwidth = wp.getW_minwidth();
		if (type == .TYPE_PREVIEW) {
			generatedW_popup_flags |=  -1024 | -1024;
			wp.setW_popup_close(.POPCLOSE_BUTTON);
			for (i = 0; i < 4; ++i) {
				generatedW_popup_border[i] = 1;
			}
			wp.parse_previewpopup();
			wp.popup_set_wantpos_cursor(generatedW_minwidth);
		} 
		if (type == .TYPE_INFO) {
			wp.setW_popup_pos(.POPPOS_TOPLEFT);
			generatedW_popup_flags |=  -1024 | -1024;
			wp.setW_popup_close(.POPCLOSE_BUTTON);
			wp.add_border_left_right_padding();
			wp.parse_completepopup();
		} 
		Object generatedW_border_highlight = wp.getW_border_highlight();
		for (i = 0; i < 4; ++i) {
			do {
				if ((generatedW_border_highlight[i]) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedW_border_highlight[i]);
					(generatedW_border_highlight[i]) = ((Object)0);
				} 
			} while (0);
		}
		Object generatedW_border_char = wp.getW_border_char();
		for (i = 0; i < 8; ++i) {
			generatedW_border_char[i] = 0;
		}
		wp.setW_want_scrollbar(1);
		wp.setW_popup_fixed(0);
		wp.setW_filter_mode(-1024);
		if (d != ((Object)0)) {
			ModernizedCProgram.apply_options(wp, d);
		} 
		// Deal with options.
		Object generatedW_popup_timer = wp.getW_popup_timer();
		if (type == .TYPE_NOTIFICATION && generatedW_popup_timer == ((Object)0)) {
			wp.popup_add_timeout(3000);
		} 
		wp.popup_adjust_position();
		wp.setW_vsep_width(0);
		ModernizedCProgram.redraw_all_later(40);
		popup_mask_refresh = 1;
		return wp/*
		 * popup_clear()
		 */;
	}
	public void popup_close_with_retval(int retval) {
		typval_T res = new typval_T();
		res.setV_type(.VAR_NUMBER);
		Object generatedVval = res.getVval();
		generatedVval.setV_number(retval);
		ModernizedCProgram.popup_close_and_callback(wp, res/*
		 * Close popup "wp" because of a mouse click.
		 */);
	}
	public void popup_close_for_mouse_click() {
		wp.popup_close_with_retval(-2);
	}
	public void check_mouse_moved(window_S mouse_wp) {
		Object generatedW_popup_mouse_row = this.getW_popup_mouse_row();
		Object generatedW_popup_mouse_mincol = this.getW_popup_mouse_mincol();
		Object generatedW_popup_mouse_maxcol = this.getW_popup_mouse_maxcol();
		// - "mousemoved" was used// - the mouse is no longer on the same screen row or the mouse column is//   outside of the relevant textif (wp != mouse_wp && generatedW_popup_mouse_row != 0 && (generatedW_popup_mouse_row != ModernizedCProgram.mouse_row || ModernizedCProgram.mouse_col < generatedW_popup_mouse_mincol || ModernizedCProgram.mouse_col > generatedW_popup_mouse_maxcol)) {
			wp.popup_close_with_retval(-2/*
			 * Called when the mouse moved: may close a popup with "mousemoved".
			 */);
		} 
	}
	// Close the popup when all if these are true:
	// - the mouse is not on this popup
	public window_S find_popup_win(int id) {
		window_S window_S = new window_S();
		win_T wp = window_S.win_id2wp(id);
		Object generatedW_popup_flags = (wp).getW_popup_flags();
		if (wp != ((Object)0) && !(generatedW_popup_flags != 0)) {
			ModernizedCProgram.semsg(((byte)("E993: window %d is not a popup window")), id);
			return ((Object)0);
		} 
		return wp/*
		 * popup_close({id})
		 */;
	}
	public void popup_hide() {
		Object generatedW_popup_flags = this.getW_popup_flags();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		if ((generatedW_popup_flags & -1024) == 0) {
			generatedW_popup_flags |=  -1024;
			--generatedB_nwindows;
			ModernizedCProgram.redraw_all_later(40);
			popup_mask_refresh = 1/*
			 * popup_hide({id})
			 */;
		} 
	}
	public void popup_show() {
		Object generatedW_popup_flags = this.getW_popup_flags();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		if ((generatedW_popup_flags & -1024) != 0) {
			generatedW_popup_flags &=  ~-1024;
			++generatedB_nwindows;
			ModernizedCProgram.redraw_all_later(40);
			popup_mask_refresh = 1/*
			 * popup_show({id})
			 */;
		} 
	}
	public void popup_free() {
		ModernizedCProgram.sign_undefine_by_name(wp.popup_get_sign_name(), 0);
		file_buffer generatedW_buffer = this.getW_buffer();
		generatedW_buffer.setB_locked(0);
		int generatedW_winrow = this.getW_winrow();
		if (generatedW_winrow + wp.popup_height() >= ModernizedCProgram.cmdline_row) {
			clear_cmdline = 1;
		} 
		wp.win_free_popup();
		ModernizedCProgram.redraw_all_later(40);
		popup_mask_refresh = 1/*
		 * Close a popup window by Window-id.
		 * Does not invoke the callback.
		 */;
	}
	public window_S find_next_popup(int lowest) {
		win_T wp = new win_T();
		win_T found_wp = new win_T();
		int found_zindex;
		found_zindex = lowest ? INT_MAX : 0;
		found_wp = ((Object)0);
		Object generatedW_popup_flags = wp.getW_popup_flags();
		Object generatedW_zindex = wp.getW_zindex();
		window_S generatedW_next = wp.getW_next();
		for (wp = first_popupwin; wp != ((Object)0); wp = generatedW_next) {
			if ((generatedW_popup_flags & (-1024 | -1024)) == 0 && (lowest ? generatedW_zindex < found_zindex : generatedW_zindex > found_zindex)) {
				found_zindex = generatedW_zindex;
				found_wp = wp;
			} 
		}
		for (wp = ModernizedCProgram.curtab.getTp_first_popupwin(); wp != ((Object)0); wp = generatedW_next) {
			if ((generatedW_popup_flags & (-1024 | -1024)) == 0 && (lowest ? generatedW_zindex < found_zindex : generatedW_zindex > found_zindex)) {
				found_zindex = generatedW_zindex;
				found_wp = wp;
			} 
		}
		if (found_wp != ((Object)0)) {
			generatedW_popup_flags |=  -1024;
		} 
		return found_wp/*
		 * Invoke the filter callback for window "wp" with typed character "c".
		 * Uses the global "mod_mask" for modifiers.
		 * Returns the return value of the filter.
		 * Careful: The filter may make "wp" invalid!
		 */;
	}
	public int invoke_popup_filter(int c) {
		int res;
		typval_T rettv = new typval_T();
		typval_T[] argv = new typval_T();
		char_u[] buf = new char_u();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		linenr_T old_lnum = generatedLnum;
		// Emergency exit: CTRL-C closes the popup.if (c == 3) {
			int save_got_int = got_int;
			got_int = 0;
			wp.popup_close_with_retval(-1);
			got_int |=  save_got_int;
			return 1;
		} 
		argv[0].setV_type(.VAR_NUMBER);
		int generatedW_id = this.getW_id();
		argv[0].getVval().setV_number((varnumber_T)generatedW_id)// Convert the number to a string, so that the function can use:;// Convert the number to a string, so that the function can use:
		//	    if a:c == "\<F2>"//	    if a:c == "\<F2>"buf[ModernizedCProgram.special_to_buf(c, mod_mask, 1, buf)] = (byte)'\000';
		argv[1].setV_type(.VAR_STRING);
		argv[1].getVval().setV_string(ModernizedCProgram.vim_strsave(buf));
		argv[2].setV_type(.VAR_UNKNOWN);
		Object generatedW_filter_cb = this.getW_filter_cb();
		// NOTE: The callback might close the popup, thus make "wp" invalid.// NOTE: The callback might close the popup, thus make "wp" invalid.generatedW_filter_cb.call_callback(-1, rettv, 2, argv);
		if (wp.win_valid_popup() && old_lnum != generatedLnum) {
			wp.popup_highlight_curline();
		} 
		res = rettv.tv_get_number();
		ModernizedCProgram.vim_free(argv[1].getVval().getV_string());
		rettv.clear_tv();
		return res/*
		 * Called when "c" was typed: invoke popup filter callbacks.
		 * Returns TRUE when the character was consumed,
		 */;
	}
	public void popup_update_mask(int width, int height) {
		listitem_T lio = new listitem_T();
		listitem_T li = new listitem_T();
		char_u cells = new char_u();
		int row;
		int col;
		Object generatedW_popup_mask = this.getW_popup_mask();
		if (generatedW_popup_mask == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedW_popup_mask_cells = this.getW_popup_mask_cells();
		Object generatedW_popup_mask_height = this.getW_popup_mask_height();
		Object generatedW_popup_mask_width = this.getW_popup_mask_width();
		if (generatedW_popup_mask_cells != ((Object)0) && generatedW_popup_mask_height == height && generatedW_popup_mask_width == width) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.vim_free(generatedW_popup_mask_cells);
		this.setW_popup_mask_cells(ModernizedCProgram.alloc_clear(width * height));
		if (generatedW_popup_mask_cells == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		cells = generatedW_popup_mask_cells;
		 generatedLi_tv = lio.getLi_tv();
		Object generatedVval = generatedLi_tv.getVval();
		listitem_S generatedLi_next = li.getLi_next();
		for (lio = generatedW_popup_mask.getLv_first(); lio != ((Object)0); lio = generatedLi_next) {
			int cols;
			int cole;
			int lines;
			int linee;
			li = generatedVval.getV_list().getLv_first();
			ModernizedCProgram.cols = generatedLi_tv.tv_get_number();
			if (ModernizedCProgram.cols < 0) {
				ModernizedCProgram.cols = width + ModernizedCProgram.cols + 1;
			} 
			li = generatedLi_next;
			cole = generatedLi_tv.tv_get_number();
			if (cole < 0) {
				cole = width + cole + 1;
			} 
			li = generatedLi_next;
			lines = generatedLi_tv.tv_get_number();
			if (lines < 0) {
				lines = height + lines + 1;
			} 
			li = generatedLi_next;
			linee = generatedLi_tv.tv_get_number();
			if (linee < 0) {
				linee = height + linee + 1;
			} 
			for (row = lines - 1; row < linee && row < height; ++row) {
				for (col = ModernizedCProgram.cols - 1; col < cole && col < width; ++col) {
					cells[row * width + col] = 1/*
					 * Return TRUE if "col" / "line" matches with an entry in w_popup_mask.
					 * "col" and "line" are screen coordinates.
					 */;
				}
			}
		}
	}
	public int popup_masked(int width, int height, int screencol, int screenline) {
		int generatedW_wincol = this.getW_wincol();
		Object generatedW_popup_leftoff = this.getW_popup_leftoff();
		int col = screencol - generatedW_wincol + generatedW_popup_leftoff;
		int generatedW_winrow = this.getW_winrow();
		int line = screenline - generatedW_winrow;
		Object generatedW_popup_mask_cells = this.getW_popup_mask_cells();
		return col >= 0 && col < width && line >= 0 && line < height && generatedW_popup_mask_cells[line * width + col/*
		 * Set flags in popup_transparent[] for window "wp" to "val".
		 */];
	}
	public void update_popup_transparent(int val) {
		Object generatedW_popup_mask = this.getW_popup_mask();
		 generatedLi_tv = lio.getLi_tv();
		Object generatedVval = generatedLi_tv.getVval();
		listitem_S generatedLi_next = li.getLi_next();
		Object generatedW_popup_leftoff = this.getW_popup_leftoff();
		int generatedW_winrow = this.getW_winrow();
		int generatedW_wincol = this.getW_wincol();
		if (generatedW_popup_mask != ((Object)0)) {
			int width = wp.popup_width();
			int height = wp.popup_height();
			listitem_T lio = new listitem_T();
			listitem_T li = new listitem_T();
			int cols;
			int cole;
			int lines;
			int linee;
			int col;
			int line;
			for (lio = generatedW_popup_mask.getLv_first(); lio != ((Object)0); lio = generatedLi_next) {
				li = generatedVval.getV_list().getLv_first();
				ModernizedCProgram.cols = generatedLi_tv.tv_get_number();
				if (ModernizedCProgram.cols < 0) {
					ModernizedCProgram.cols = width + ModernizedCProgram.cols + 1;
				} 
				li = generatedLi_next;
				cole = generatedLi_tv.tv_get_number();
				if (cole < 0) {
					cole = width + cole + 1;
				} 
				li = generatedLi_next;
				lines = generatedLi_tv.tv_get_number();
				if (lines < 0) {
					lines = height + lines + 1;
				} 
				li = generatedLi_next;
				linee = generatedLi_tv.tv_get_number();
				if (linee < 0) {
					linee = height + linee + 1;
				} 
				--ModernizedCProgram.cols;
				ModernizedCProgram.cols -= generatedW_popup_leftoff;
				if (ModernizedCProgram.cols < 0) {
					ModernizedCProgram.cols = 0;
				} 
				cole -= generatedW_popup_leftoff;
				--lines;
				if (lines < 0) {
					lines = 0;
				} 
				for (ModernizedCProgram.line = lines; ModernizedCProgram.line < linee && ModernizedCProgram.line + generatedW_winrow < screen_Rows; ++ModernizedCProgram.line) {
					for (col = ModernizedCProgram.cols; col < cole && col + generatedW_wincol < screen_Columns; ++col) {
						popup_transparent[(ModernizedCProgram.line + generatedW_winrow) * screen_Columns + col + generatedW_wincol] = val/*
						 * Only called when popup window "wp" is hidden: If the window is positioned
						 * next to a text property, and it is now visible, then  unhide the popup.
						 * We don't check if visible popups become hidden, that is done in
						 * popup_adjust_position().
						 * Return TRUE if the popup became unhidden.
						 */;
					}
				}
			}
		} 
	}
	public int check_popup_unhidden() {
		Object generatedW_popup_prop_type = this.getW_popup_prop_type();
		Object generatedW_popup_prop_win = this.getW_popup_prop_win();
		Object generatedW_popup_prop_id = this.getW_popup_prop_id();
		Object generatedW_popup_flags = this.getW_popup_flags();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		if (generatedW_popup_prop_type > 0 && generatedW_popup_prop_win.win_valid()) {
			textprop_T prop = new textprop_T();
			linenr_T lnum = new linenr_T();
			if (ModernizedCProgram.find_visible_prop(generatedW_popup_prop_win, generatedW_popup_prop_type, generatedW_popup_prop_id, prop, lnum) == 1) {
				generatedW_popup_flags &=  ~-1024;
				++generatedB_nwindows;
				this.setW_popup_prop_topline(0);
				return 1;
			} 
		} 
		return 0/*
		 * Return TRUE if popup_adjust_position() needs to be called for "wp".
		 * That is when the buffer in the popup was changed, or the popup is following
		 * a textprop and the referenced buffer was changed.
		 * Or when the cursor line changed and "cursorline" is set.
		 */;
	}
	public int popup_need_position_adjust() {
		Object generatedW_popup_last_changedtick = this.getW_popup_last_changedtick();
		file_buffer generatedW_buffer = this.getW_buffer();
		dictitem16_S generatedB_ct_di = (generatedW_buffer).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		if (generatedW_popup_last_changedtick != (generatedVval.getV_number())) {
			return 1;
		} 
		Object generatedW_popup_prop_win = this.getW_popup_prop_win();
		Object generatedW_popup_prop_changedtick = this.getW_popup_prop_changedtick();
		Object generatedW_popup_prop_topline = this.getW_popup_prop_topline();
		Object generatedW_popup_flags = this.getW_popup_flags();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		Object generatedW_popup_last_curline = this.getW_popup_last_curline();
		if (generatedW_popup_prop_win.win_valid()) {
			return generatedW_popup_prop_changedtick != (generatedVval.getV_number()) || generatedW_popup_prop_topline != generatedW_popup_prop_win.getW_topline() || ((generatedW_popup_flags & -1024) && generatedLnum != generatedW_popup_last_curline);
		} 
		return 0/*
		 * Update "popup_mask" if needed.
		 * Also recomputes the popup size and positions.
		 * Also updates "popup_visible".
		 * Also marks window lines for redrawing.
		 */;
	}
	public int set_ref_in_one_popup(int copyID) {
		int abort = 0;
		typval_T tv = new typval_T();
		Object generatedW_close_cb = this.getW_close_cb();
		Object generatedVval = tv.getVval();
		if (generatedW_close_cb.getCb_partial() != ((Object)0)) {
			tv.setV_type(.VAR_PARTIAL);
			generatedVval.setV_partial(generatedW_close_cb.getCb_partial());
			abort = abort || ModernizedCProgram.set_ref_in_item(tv, copyID, ((Object)0), ((Object)0));
		} 
		Object generatedW_filter_cb = this.getW_filter_cb();
		if (generatedW_filter_cb.getCb_partial() != ((Object)0)) {
			tv.setV_type(.VAR_PARTIAL);
			generatedVval.setV_partial(generatedW_filter_cb.getCb_partial());
			abort = abort || ModernizedCProgram.set_ref_in_item(tv, copyID, ((Object)0), ((Object)0));
		} 
		Object generatedW_popup_mask = this.getW_popup_mask();
		abort = abort || generatedW_popup_mask.set_ref_in_list(copyID);
		return abort/*
		 * Set reference in callbacks of popup windows.
		 */;
	}
	public window_S popup_find_preview_window() {
		win_T wp = new win_T();
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_pvw = generatedW_onebuf_opt.getWo_pvw();
		window_S generatedW_next = wp.getW_next();
		// Preview window popup is always local to tab page.for (wp = ModernizedCProgram.curtab.getTp_first_popupwin(); wp != ((Object)0); wp = generatedW_next) {
			if (generatedWo_pvw) {
				return wp;
			} 
		}
		return ((Object)0);
	}
	public int popup_is_popup() {
		Object generatedW_popup_flags = this.getW_popup_flags();
		return generatedW_popup_flags != 0/*
		 * Find an existing popup used as the info window, in the current tab page.
		 * Return NULL if not found.
		 */;
	}
	public window_S popup_find_info_window() {
		win_T wp = new win_T();
		Object generatedW_popup_flags = wp.getW_popup_flags();
		window_S generatedW_next = wp.getW_next();
		// info window popup is always local to tab page.for (wp = ModernizedCProgram.curtab.getTp_first_popupwin(); wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_popup_flags & -1024) {
				return wp;
			} 
		}
		return ((Object)0);
	}
	public int popup_win_closed() {
		int round;
		win_T wp = new win_T();
		win_T next = new win_T();
		int ret = 0;
		window_S generatedW_next = wp.getW_next();
		Object generatedW_popup_prop_win = wp.getW_popup_prop_win();
		for (round = 1; round <= 2; ++round) {
			for (wp = round == 1 ? first_popupwin : ModernizedCProgram.curtab.getTp_first_popupwin(); wp != ((Object)0); wp = next) {
				next = generatedW_next;
				if (generatedW_popup_prop_win == win) {
					wp.popup_close_with_retval(-1);
					ret = 1;
				} 
			}
		}
		return ret/*
		 * Set the title of the popup window to the file name.
		 */;
	}
	public void popup_set_title() {
		file_buffer generatedW_buffer = this.getW_buffer();
		Object[] generatedB_fname = generatedW_buffer.getB_fname();
		Object generatedW_popup_title = this.getW_popup_title();
		if (generatedB_fname != ((Object)0)) {
			char_u[] dirname = new char_u();
			size_t len = new size_t();
			ModernizedCProgram.mch_dirname(dirname, 1024);
			generatedW_buffer.shorten_buf_fname(dirname, 0);
			ModernizedCProgram.vim_free(generatedW_popup_title);
			len = /*Error: Function owner not recognized*/strlen((byte)(generatedB_fname)) + 3;
			this.setW_popup_title(ModernizedCProgram.alloc((int)len));
			if (generatedW_popup_title != ((Object)0)) {
				ModernizedCProgram.vim_snprintf((byte)generatedW_popup_title, len, " %s ", generatedB_fname);
			} 
			wp.redraw_win_later(10/*
			 * If there is a preview window, update the title.
			 * Used after changing directory.
			 */);
		} 
	}
	public int win_split_ins(int size, int flags, int dir) {
		win_T wp = new_wp;
		win_T oldwin = new win_T();
		int new_size = size;
		int i;
		int need_status = 0;
		int do_equal = 0;
		int needed;
		int available;
		int oldwin_height = 0;
		int layout;
		frame_T frp = new frame_T();
		frame_T curfrp = new frame_T();
		frame_T frp2 = new frame_T();
		frame_T prevfrp = new frame_T();
		int before;
		int minheight;
		int wmh1;
		int did_set_fraction = 0;
		if (flags & 4) {
			oldwin = ModernizedCProgram.firstwin;
		}  else if (flags & 8) {
			oldwin = ModernizedCProgram.lastwin;
		} else {
				oldwin = ModernizedCProgram.curwin;
		} 
		int generatedW_status_height = oldwin.getW_status_height();
		int generatedW_height = (oldwin).getW_height();
		Object generatedW_winbar_height = (oldwin).getW_winbar_height();
		if ((ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) && ModernizedCProgram.p_ls == 1 && generatedW_status_height == /* add a status line when p_ls == 1 and splitting the first window */0) {
			if ((generatedW_height + generatedW_winbar_height) <= ModernizedCProgram.p_wmh && new_wp == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_noroom)));
				return 0;
			} 
			need_status = 1/* May be needed for the scrollbars that are going to change. */;
		} 
		frame_S generatedW_frame = oldwin.getW_frame();
		byte generatedFr_layout = frp.getFr_layout();
		frame_S generatedFr_next = frp2.getFr_next();
		frame_S generatedFr_child = frp.getFr_child();
		frame_S generatedFr_parent = frp.getFr_parent();
		int generatedFr_width = generatedW_frame.getFr_width();
		int generatedW_width = oldwin.getW_width();
		 generatedW_onebuf_opt = oldwin.getW_onebuf_opt();
		Object generatedWo_wfw = generatedW_onebuf_opt.getWo_wfw();
		window_S generatedFr_win = frp.getFr_win();
		int generatedFr_height = generatedW_frame.getFr_height();
		Object generatedWo_wfh = generatedW_onebuf_opt.getWo_wfh();
		if (flags & 2) {
			int wmw1;
			int minwidth;
			layout = 1/*
				 * Check if we are able to split the current window and compute its
				 * width.
				 */;
			wmw1 = (ModernizedCProgram.p_wmw == 0 ? 1 : /* Current window requires at least 1 space. */ModernizedCProgram.p_wmw);
			needed = wmw1 + 1;
			if (flags & 1) {
				needed += ModernizedCProgram.p_wiw - wmw1;
			} 
			if (flags & (8 | 4)) {
				minwidth = ModernizedCProgram.frame_minwidth(ModernizedCProgram.topframe, (win_T)-1);
				available = ModernizedCProgram.topframe.getFr_width();
				needed += minwidth;
			}  else if (ModernizedCProgram.p_ea) {
				minwidth = ModernizedCProgram.frame_minwidth(generatedW_frame, (win_T)-1);
				prevfrp = generatedW_frame;
				for (frp = generatedFr_parent; frp != ((Object)0); frp = generatedFr_parent) {
					if (generatedFr_layout == 1) {
						for (frp2 = generatedFr_child; frp2 != ((Object)0); frp2 = generatedFr_next) {
							if (frp2 != prevfrp) {
								minwidth += ModernizedCProgram.frame_minwidth(frp2, (win_T)-1);
							} 
						}
					} 
					prevfrp = frp;
				}
				available = ModernizedCProgram.topframe.getFr_width();
				needed += minwidth;
			} else {
					minwidth = ModernizedCProgram.frame_minwidth(generatedW_frame, (win_T)-1);
					available = generatedFr_width;
					needed += minwidth;
			} 
			if (available < needed && new_wp == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_noroom)));
				return 0;
			} 
			if (new_size == 0) {
				new_size = generatedW_width / 2;
			} 
			if (new_size > available - minwidth - 1) {
				new_size = available - minwidth - 1;
			} 
			if (new_size < wmw1) {
				new_size = wmw1;
			} 
			if (generatedW_width - new_size - 1 < /* if it doesn't fit in the current window, need win_equal() */ModernizedCProgram.p_wmw) {
				do_equal = 1/* We don't like to take lines for the new window from a
					 * 'winfixwidth' window.  Take them from a window to the left or right
					 * instead, if possible. Add one for the separator. */;
			} 
			if (generatedWo_wfw) {
				oldwin.win_setwidth_win(generatedW_width + new_size + 1);
			} 
			if (!do_equal && ModernizedCProgram.p_ea && size == 0 && ModernizedCProgram.p_ead != /* Only make all windows the same width if one of them (except oldwin)
				 * is wider than one of the split windows. */(byte)'v' && generatedFr_parent != ((Object)0)) {
				frp = generatedFr_child;
				while (frp != ((Object)0)) {
					if (generatedFr_win != oldwin && generatedFr_win != ((Object)0) && (generatedW_width > new_size || generatedW_width > generatedW_width - new_size - 1)) {
						do_equal = 1;
						break;
					} 
					frp = generatedFr_next;
				}
			} 
		} else {
				layout = 2/*
					 * Check if we are able to split the current window and compute its
					 * height.
					 */;
				wmh1 = (ModernizedCProgram.p_wmh == 0 ? 1 : ModernizedCProgram.p_wmh) + generatedW_winbar_height;
				needed = wmh1 + 1;
				if (flags & 1) {
					needed += ModernizedCProgram.p_wh - wmh1;
				} 
				if (flags & (8 | 4)) {
					minheight = ModernizedCProgram.frame_minheight(ModernizedCProgram.topframe, (win_T)-1) + need_status;
					available = ModernizedCProgram.topframe.getFr_height();
					needed += minheight;
				}  else if (ModernizedCProgram.p_ea) {
					minheight = ModernizedCProgram.frame_minheight(generatedW_frame, (win_T)-1) + need_status;
					prevfrp = generatedW_frame;
					for (frp = generatedFr_parent; frp != ((Object)0); frp = generatedFr_parent) {
						if (generatedFr_layout == 2) {
							for (frp2 = generatedFr_child; frp2 != ((Object)0); frp2 = generatedFr_next) {
								if (frp2 != prevfrp) {
									minheight += ModernizedCProgram.frame_minheight(frp2, (win_T)-1);
								} 
							}
						} 
						prevfrp = frp;
					}
					available = ModernizedCProgram.topframe.getFr_height();
					needed += minheight;
				} else {
						minheight = ModernizedCProgram.frame_minheight(generatedW_frame, (win_T)-1) + need_status;
						available = generatedFr_height;
						needed += minheight;
				} 
				if (available < needed && new_wp == ((Object)0)) {
					ModernizedCProgram.emsg(((byte)(e_noroom)));
					return 0;
				} 
				oldwin_height = generatedW_height;
				if (need_status) {
					oldwin.setW_status_height(1);
					oldwin_height -= 1;
				} 
				if (new_size == 0) {
					new_size = oldwin_height / 2;
				} 
				if (new_size > available - minheight - 1) {
					new_size = available - minheight - 1;
				} 
				if (new_size < wmh1) {
					new_size = wmh1;
				} 
				if (oldwin_height - new_size - 1 < /* if it doesn't fit in the current window, need win_equal() */ModernizedCProgram.p_wmh) {
					do_equal = 1/* We don't like to take lines for the new window from a
						 * 'winfixheight' window.  Take them from a window above or below
						 * instead, if possible. */;
				} 
				if (generatedWo_wfh) {
					/* Set w_fraction now so that the cursor keeps the same relative
						     * vertical position using the old height. */oldwin.set_fraction();
					did_set_fraction = 1;
					oldwin.win_setheight_win(generatedW_height + new_size + 1);
					oldwin_height = generatedW_height;
					if (need_status) {
						oldwin_height -= 1;
					} 
				} 
				if (!do_equal && ModernizedCProgram.p_ea && size == 0 && ModernizedCProgram.p_ead != /* Only make all windows the same height if one of them (except oldwin)
					 * is higher than one of the split windows. */(byte)'h' && generatedFr_parent != ((Object)0)) {
					frp = generatedFr_child;
					while (frp != ((Object)0)) {
						if (generatedFr_win != oldwin && generatedFr_win != ((Object)0) && (generatedW_height > new_size || generatedW_height > oldwin_height - new_size - 1)) {
							do_equal = 1;
							break;
						} 
						frp = generatedFr_next;
					}
				} 
		} 
		window_S generatedW_prev = oldwin.getW_prev();
		if ((flags & 4) == /*
		     * allocate new window structure and link it in the window list
		     */0 && ((flags & 8) || (flags & 32) || (!(flags & 64) && ((flags & 2) ? ModernizedCProgram.p_spr : ModernizedCProgram.p_sb)))) {
			if (new_wp == ((Object)/* new window below/right of current one */0)) {
				wp = oldwin.win_alloc(0);
			} else {
					oldwin.win_append(wp);
			} 
		} else {
				if (new_wp == ((Object)0)) {
					wp = generatedW_prev.win_alloc(0);
				} else {
						generatedW_prev.win_append(wp);
				} 
		} 
		if (new_wp == ((Object)0)) {
			if (wp == ((Object)0)) {
				return 0;
			} 
			wp.new_frame();
			if (generatedW_frame == ((Object)0)) {
				ModernizedCProgram.win_free(wp, ((Object)0));
				return 0;
			} 
			wp.win_init(ModernizedCProgram.curwin, /* make the contents of the new window the same as the current one */flags);
		} 
		if (flags & (4 | /*
		     * Reorganise the tree of frames to insert the new window.
		     */8)) {
			if ((generatedFr_layout == 2 && (flags & 2) == 0) || (generatedFr_layout == 1 && (flags & 2) != 0)) {
				curfrp = generatedFr_child;
				if (flags & 8) {
					while (generatedFr_next != ((Object)0)) {
						curfrp = generatedFr_next;
					}
				} 
			} else {
					curfrp = ModernizedCProgram.topframe;
			} 
			before = (flags & 4);
		} else {
				curfrp = generatedW_frame;
				if (flags & 32) {
					before = 0;
				}  else if (flags & 64) {
					before = 1;
				}  else if (flags & 2) {
					before = !ModernizedCProgram.p_spr;
				} else {
						before = !ModernizedCProgram.p_sb;
				} 
		} 
		if (generatedFr_parent == ((Object)0) || generatedFr_layout != layout) {
			frp = (frame_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*//* Need to create a new frame in the tree to make a branch. */);
			frp = curfrp;
			curfrp.setFr_layout(layout);
			frp.setFr_parent(curfrp);
			frp.setFr_next(((Object)0));
			frp.setFr_prev(((Object)0));
			curfrp.setFr_child(frp);
			curfrp.setFr_win(((Object)0));
			curfrp = frp;
			if (generatedFr_win != ((Object)0)) {
				oldwin.setW_frame(frp);
			} else {
					for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
						frp.setFr_parent(curfrp);
					}
			} 
		} 
		if (new_wp == ((Object)0)) {
			frp = generatedW_frame;
		} else {
				frp = generatedW_frame;
		} 
		frp.setFr_parent(generatedFr_parent);
		if (/* Insert the new frame at the right place in the frame list. */before) {
			curfrp.frame_insert(frp);
		} else {
				curfrp.frame_append(frp);
		} 
		if (!/* Set w_fraction now so that the cursor keeps the same relative
		     * vertical position. */did_set_fraction) {
			oldwin.set_fraction();
		} 
		int generatedW_fraction = oldwin.getW_fraction();
		wp.setW_fraction(generatedW_fraction);
		Object generatedWo_scr = generatedW_onebuf_opt.getWo_scr();
		int generatedW_winrow = oldwin.getW_winrow();
		int generatedW_vsep_width = oldwin.getW_vsep_width();
		int generatedW_wincol = oldwin.getW_wincol();
		if (flags & 2) {
			generatedW_onebuf_opt.setWo_scr(generatedWo_scr);
			if (need_status) {
				oldwin.win_new_height(generatedW_height - 1);
				oldwin.setW_status_height(need_status);
			} 
			if (flags & (4 | 8)) {
				wp.setW_winrow(ModernizedCProgram.tabline_height());
				wp.win_new_height(generatedFr_height - (ModernizedCProgram.p_ls > 0) - generatedW_winbar_height);
				wp.setW_status_height((ModernizedCProgram.p_ls > 0));
			} else {
					wp.setW_winrow(generatedW_winrow);
					wp.win_new_height((generatedW_height + generatedW_winbar_height));
					wp.setW_status_height(generatedW_status_height);
			} 
			frp.setFr_height(generatedFr_height);
			wp.win_new_width(/* "new_size" of the current window goes to the new window, use
				 * one column for the vertical separator */new_size);
			if (before) {
				wp.setW_vsep_width(1);
			} else {
					wp.setW_vsep_width(generatedW_vsep_width);
					oldwin.setW_vsep_width(1);
			} 
			if (flags & (4 | 8)) {
				if (flags & 8) {
					curfrp.frame_add_vsep();
				} 
				curfrp.frame_new_width(generatedFr_width - (new_size + ((flags & 4) != 0)), flags & 4, 0);
			} else {
					oldwin.win_new_width(generatedW_width - (new_size + 1));
			} 
			if (/* new window left of current one */before) {
				wp.setW_wincol(generatedW_wincol);
				generatedW_wincol += new_size + 1;
			} else {
					wp.setW_wincol(generatedW_wincol + generatedW_width + /* new window right of current one */1);
			} 
			oldwin.frame_fix_width();
			wp.frame_fix_width();
		} else {
				if (flags & (4 | /* width and column of new window is same as current window */8)) {
					wp.setW_wincol(0);
					wp.win_new_width(Columns);
					wp.setW_vsep_width(0);
				} else {
						wp.setW_wincol(generatedW_wincol);
						wp.win_new_width(generatedW_width);
						wp.setW_vsep_width(generatedW_vsep_width);
				} 
				frp.setFr_width(generatedFr_width);
				wp.win_new_height(/* "new_size" of the current window goes to the new window, use
					 * one row for the status line */new_size);
				if (flags & (4 | 8)) {
					int new_fr_height = generatedFr_height - new_size + generatedW_winbar_height;
					if (!((flags & 8) && ModernizedCProgram.p_ls == 0)) {
						new_fr_height -= 1;
					} 
					curfrp.frame_new_height(new_fr_height, flags & 4, 0);
				} else {
						oldwin.win_new_height(oldwin_height - (new_size + 1));
				} 
				if (/* new window above current one */before) {
					wp.setW_winrow(generatedW_winrow);
					wp.setW_status_height(1);
					generatedW_winrow += generatedW_height + 1;
				} else {
						wp.setW_winrow(generatedW_winrow + (generatedW_height + generatedW_winbar_height) + 1);
						wp.setW_status_height(generatedW_status_height);
						if (!(flags & 8)) {
							oldwin.setW_status_height(1);
						} 
				} 
				if (flags & 8) {
					curfrp.frame_add_statusline();
				} 
				wp.frame_fix_height();
				oldwin.frame_fix_height();
		} 
		if (flags & (4 | 8)) {
			(Object)ModernizedCProgram.win_comp_pos();
		} 
		wp.redraw_win_later(40);
		wp.setW_redr_status(1);
		oldwin.redraw_win_later(40);
		oldwin.setW_redr_status(1);
		if (need_status) {
			ModernizedCProgram.msg_row = ModernizedCProgram.Rows - 1;
			ModernizedCProgram.msg_col = ModernizedCProgram.sc_col;
			ModernizedCProgram.msg_clr_eos_force();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/comp_col();
			ModernizedCProgram.msg_row = ModernizedCProgram.Rows - 1;
			ModernizedCProgram.msg_col = /* put position back at start of line */0;
		} 
		if (do_equal || dir != /*
		     * equalize the window sizes.
		     */0) {
			wp.win_equal(1, (flags & 2) ? (dir == (byte)'v' ? (byte)'b' : (byte)'h') : dir == (byte)'h' ? (byte)'b' : (byte)'v');
		} 
		if (flags & /* Don't change the window height/width to 'winheight' / 'winwidth' if a
		     * size was given. */2) {
			i = ModernizedCProgram.p_wiw;
			if (size != 0) {
				ModernizedCProgram.p_wiw = size/* When 'guioptions' includes 'L' or 'R' may have to add scrollbars. */;
			} 
		} else {
				i = ModernizedCProgram.p_wh;
				if (size != 0) {
					ModernizedCProgram.p_wh = size;
				} 
		} 
		Object generatedW_changelistidx = oldwin.getW_changelistidx();
		wp.setW_changelistidx(generatedW_changelistidx);
		wp.win_enter_ext(0, 0, 1, 1, /*
		     * make the new window the current window
		     */1);
		if (flags & 2) {
			ModernizedCProgram.p_wiw = i;
		} else {
				ModernizedCProgram.p_wh = i;
		} 
		return 1/*
		 * Initialize window "newp" from window "oldp".
		 * Used when splitting a window and when creating a new tab page.
		 * The windows will both edit the same buffer.
		 * WSP_NEWLOC may be specified in flags to prevent the location list from
		 * being copied.
		 */;
	}
	public void win_init(window_S oldp, int flags) {
		int i;
		file_buffer generatedW_buffer = oldp.getW_buffer();
		this.setW_buffer(generatedW_buffer);
		Object generatedB_s = generatedW_buffer.getB_s();
		this.setW_s((generatedB_s));
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		generatedB_nwindows++;
		 generatedW_cursor = oldp.getW_cursor();
		this.setW_cursor(generatedW_cursor);
		this.setW_valid(0);
		Object generatedW_curswant = oldp.getW_curswant();
		this.setW_curswant(generatedW_curswant);
		int generatedW_set_curswant = oldp.getW_set_curswant();
		this.setW_set_curswant(generatedW_set_curswant);
		Object generatedW_topline = oldp.getW_topline();
		this.setW_topline(generatedW_topline);
		Object generatedW_topfill = oldp.getW_topfill();
		this.setW_topfill(generatedW_topfill);
		Object generatedW_leftcol = oldp.getW_leftcol();
		this.setW_leftcol(generatedW_leftcol);
		 generatedW_pcmark = oldp.getW_pcmark();
		this.setW_pcmark(generatedW_pcmark);
		 generatedW_prev_pcmark = oldp.getW_prev_pcmark();
		this.setW_prev_pcmark(generatedW_prev_pcmark);
		int generatedW_alt_fnum = oldp.getW_alt_fnum();
		this.setW_alt_fnum(generatedW_alt_fnum);
		int generatedW_wrow = oldp.getW_wrow();
		this.setW_wrow(generatedW_wrow);
		int generatedW_fraction = oldp.getW_fraction();
		this.setW_fraction(generatedW_fraction);
		int generatedW_prev_fraction_row = oldp.getW_prev_fraction_row();
		this.setW_prev_fraction_row(generatedW_prev_fraction_row);
		oldp.copy_jumplist(newp);
		if (flags & 128) {
			this.setW_llist(((Object)/* Don't copy the location list.  */0));
			this.setW_llist_ref(((Object)0));
		} else {
				oldp.copy_loclist_stack(newp);
		} 
		Object generatedW_localdir = oldp.getW_localdir();
		this.setW_localdir((generatedW_localdir == ((Object)0)) ? ((Object)0) : ModernizedCProgram.vim_strsave(generatedW_localdir));
		int generatedW_tagstacklen = oldp.getW_tagstacklen();
		Object generatedW_tagstack = this.getW_tagstack();
		Object generatedTagname = tag.getTagname();
		Object generatedUser_data = tag.getUser_data();
		for (i = 0; i < generatedW_tagstacklen; /* copy tagstack and folds */i++) {
			taggy_T tag = generatedW_tagstack[i];
			tag = generatedW_tagstack[i];
			if (generatedTagname != ((Object)0)) {
				tag.setTagname(ModernizedCProgram.vim_strsave(generatedTagname));
			} 
			if (generatedUser_data != ((Object)0)) {
				tag.setUser_data(ModernizedCProgram.vim_strsave(generatedUser_data));
			} 
		}
		int generatedW_tagstackidx = oldp.getW_tagstackidx();
		this.setW_tagstackidx(generatedW_tagstackidx);
		this.setW_tagstacklen(generatedW_tagstacklen);
		oldp.copyFoldingState(newp);
		newp.win_init_some(oldp);
		newp/*
		 * Initialize window "newp" from window "old".
		 * Only the essential things are copied.
		 */.check_colorcolumn();
	}
	public void win_init_some(window_S oldp) {
		arglist generatedW_alist = oldp.getW_alist();
		this.setW_alist(generatedW_alist);
		int generatedAl_refcount = generatedW_alist.getAl_refcount();
		++generatedAl_refcount;
		int generatedW_arg_idx = oldp.getW_arg_idx();
		this.setW_arg_idx(generatedW_arg_idx);
		oldp.win_copy_options(/* copy options from existing window */newp/*
		 * Return TRUE if "win" is a global popup or a popup in the current tab page.
		 */);
	}
	public int win_valid_popup() {
		win_T wp = new win_T();
		window_S generatedW_next = wp.getW_next();
		for (wp = first_popupwin; wp != ((Object)0); wp = generatedW_next) {
			if (wp == win) {
				return 1;
			} 
		}
		for (wp = ModernizedCProgram.curtab.getTp_first_popupwin(); wp != ((Object)0); wp = generatedW_next) {
			if (wp == win) {
				return 1;
			} 
		}
		return 0/*
		 * Check if "win" is a pointer to an existing window in the current tab page.
		 */;
	}
	public int win_valid() {
		win_T wp = new win_T();
		if (win == ((Object)0)) {
			return 0;
		} 
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (wp == win) {
				return 1;
			} 
		}
		return win/*
		 * Check if "win" is a pointer to an existing window in any tab page.
		 */.win_valid_popup();
	}
	public int win_valid_any_tab() {
		win_T wp = new win_T();
		tabpage_T tp = new tabpage_T();
		if (win == ((Object)0)) {
			return 0;
		} 
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		Object generatedTp_first_popupwin = tp.getTp_first_popupwin();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			for ((wp) = ((tp) == ((Object)0) || (tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
				if (wp == win) {
					return 1;
				} 
			}
			for (wp = generatedTp_first_popupwin; wp != ((Object)0); wp = generatedW_next) {
				if (wp == win) {
					return 1;
				} 
			}
		}
		return win/*
		 * Return the number of windows.
		 */.win_valid_popup();
	}
	/*
	 * Move window "win1" to below/right of "win2" and make "win1" the current
	 * window.  Only works within the same frame!
	 */
	public void win_move_after(window_S win2) {
		int height;
		if (win1 == /* check if the arguments are reasonable */win2) {
			return /*Error: Unsupported expression*/;
		} 
		window_S generatedW_next = win2.getW_next();
		frame_S generatedW_frame = this.getW_frame();
		frame_S generatedFr_parent = generatedW_frame.getFr_parent();
		window_S generatedW_prev = this.getW_prev();
		int generatedW_status_height = generatedW_prev.getW_status_height();
		int generatedW_vsep_width = generatedW_prev.getW_vsep_width();
		int generatedFr_width = generatedW_frame.getFr_width();
		if (generatedW_next != /* check if there is something to do */win1) {
			if (generatedFr_parent != generatedFr_parent) {
				ModernizedCProgram.iemsg("INTERNAL: trying to move a window into another frame");
				return /*Error: Unsupported expression*/;
			} 
			if (win1 == /* may need move the status line/vertical separator of the last window
				 * */ModernizedCProgram.lastwin) {
				height = generatedW_status_height;
				generatedW_prev.setW_status_height(generatedW_status_height);
				this.setW_status_height(height);
				if (generatedW_vsep_width == 1) {
					generatedW_prev.setW_vsep_width(/* Remove the vertical separator from the last-but-one window,
							 * add it to the last window.  Adjust the frame widths. */0);
					generatedFr_width -= 1;
					this.setW_vsep_width(1);
					generatedFr_width += 1;
				} 
			}  else if (win2 == ModernizedCProgram.lastwin) {
				height = generatedW_status_height;
				this.setW_status_height(generatedW_status_height);
				win2.setW_status_height(height);
				if (generatedW_vsep_width == 1) {
					win2.setW_vsep_width(/* Remove the vertical separator from win1, add it to the last
							 * window, win2.  Adjust the frame widths. */1);
					generatedFr_width += 1;
					this.setW_vsep_width(0);
					generatedFr_width -= 1;
				} 
			} 
			ModernizedCProgram.win_remove(win1, ((Object)0));
			generatedW_frame.frame_remove();
			win2.win_append(win1);
			generatedW_frame.frame_append(generatedW_frame);
			(Object)ModernizedCProgram.win_comp_pos();
			ModernizedCProgram.redraw_later(40);
		} 
		win1.win_enter(0/*
		 * Make all windows the same height.
		 * 'next_curwin' will soon be the current window, make sure it has enough
		 * rows.
		 */);
	}
	public void win_equal(int current, int dir) {
		if (dir == /* 'v' for vertically, 'h' for horizontally,
						   'b' for both, 0 for using p_ead */0) {
			dir = ModernizedCProgram.p_ead;
		} 
		ModernizedCProgram.win_equal_rec(next_curwin == ((Object)0) ? ModernizedCProgram.curwin : next_curwin, current, ModernizedCProgram.topframe, dir, 0, ModernizedCProgram.tabline_height(), (int)Columns, ModernizedCProgram.topframe.getFr_height());
	}
	/* pointer to current window to be or NULL */
	/* do only frame with current window */
	public void win_close_buffer(int action, int abort_if_last) {
		file_buffer generatedW_buffer = this.getW_buffer();
		// Free independent synblock before the buffer is freed.if (generatedW_buffer != ((Object)0)) {
			win.reset_synblock();
		} 
		// When the quickfix/location list window is closed, unlist the buffer.if (generatedW_buffer != ((Object)0) && generatedW_buffer.bt_quickfix()) {
			generatedW_buffer.setB_p_bl(0);
		} 
		// Close the link to the buffer.if (generatedW_buffer != ((Object)0)) {
			bufref_T bufref = new bufref_T();
			ModernizedCProgram.set_bufref(bufref, curbuf);
			this.setW_closing(1);
			ModernizedCProgram.close_buffer(win, generatedW_buffer, action, abort_if_last);
			if (win.win_valid_any_tab()) {
				this.setW_closing(0);
			} 
			if (!bufref.bufref_valid()) {
				curbuf = firstbuf/*
				 * Close window "win".  Only works for the current tab page.
				 * If "free_buf" is TRUE related buffer may be unloaded.
				 *
				 * Called by :quit, :close, :xit, :wq and findtag().
				 * Returns FAIL when the window was not closed.
				 */;
			} 
		} 
	}
	public int win_close(int free_buf) {
		win_T wp = new win_T();
		int other_buffer = 0;
		int close_curwin = 0;
		int dir;
		int help_window = 0;
		tabpage_T prev_curtab = ModernizedCProgram.curtab;
		frame_S generatedW_frame = this.getW_frame();
		frame_S generatedFr_parent = generatedW_frame.getFr_parent();
		frame_T win_frame = generatedFr_parent;
		if (ModernizedCProgram.error_if_popup_window()) {
			return 0;
		} 
		if (ModernizedCProgram.last_window()) {
			ModernizedCProgram.emsg(((byte)("E444: Cannot close last window")));
			return 0;
		} 
		int generatedW_closing = this.getW_closing();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_locked = generatedW_buffer.getB_locked();
		if (generatedW_closing || (generatedW_buffer != ((Object)0) && generatedB_locked > 0)) {
			return /* window is already being closed */0;
		} 
		if (win.win_unlisted()) {
			ModernizedCProgram.emsg(((byte)("E813: Cannot close autocmd or popup window")));
			return 0;
		} 
		if ((ModernizedCProgram.firstwin == ModernizedCProgram.aucmd_win || ModernizedCProgram.lastwin == ModernizedCProgram.aucmd_win) && ModernizedCProgram.one_window()) {
			ModernizedCProgram.emsg(((byte)("E814: Cannot close window, only autocmd window would remain")));
			return 0;
		} 
		if (ModernizedCProgram.close_last_window_tabpage(win, free_buf, /* When closing the last window in a tab page first go to another tab page
		     * and then close the window and the tab page to avoid that curwin and
		     * curtab are invalid while we are freeing memory. */prev_curtab)) {
			return 0;
		} 
		if (generatedW_buffer.bt_help()) {
			help_window = 1;
		} else {
				ModernizedCProgram.curtab.clear_snapshot(0);
		} 
		frame_S frame_S = new frame_S();
		window_S window_S = new window_S();
		if (win == ModernizedCProgram.curwin) {
			wp = window_S.frame2win(frame_S.win_altframe(win, ((Object)/*
				 * Guess which window is going to be the new current window.
				 * This may change because of the autocommands (sigh).
				 */0/*
				 * Be careful: If autocommands delete the window or cause this window
				 * to be the last one left, return now.
				 */)));
			if (generatedW_buffer != curbuf) {
				other_buffer = 1;
				this.setW_closing(1);
				curbuf.apply_autocmds(auto_event.EVENT_BUFLEAVE, ((Object)0), ((Object)0), 0);
				if (!win.win_valid()) {
					return 0;
				} 
				this.setW_closing(0);
				if (ModernizedCProgram.last_window()) {
					return 0;
				} 
			} 
			this.setW_closing(1);
			curbuf.apply_autocmds(auto_event.EVENT_WINLEAVE, ((Object)0), ((Object)0), 0);
			if (!win.win_valid()) {
				return 0;
			} 
			this.setW_closing(0);
			if (ModernizedCProgram.last_window()) {
				return 0;
			} 
			if (ModernizedCProgram.aborting()) {
				return 0;
			} 
		} 
		// win_free().if (win.popup_win_closed() && !win.win_valid()) {
			return 0;
		} 
		win.win_close_buffer(free_buf ? 2 : 0, 1);
		if (ModernizedCProgram.only_one_window() && win.win_valid() && generatedW_buffer == ((Object)0) && (ModernizedCProgram.last_window() || ModernizedCProgram.curtab != prev_curtab || ModernizedCProgram.close_last_window_tabpage(win, free_buf, prev_curtab))) {
			if (generatedW_buffer == ((Object)/* Autocommands have closed all windows, quit now.  Restore
				 * curwin->w_buffer, otherwise writing viminfo may fail. */0)) {
				ModernizedCProgram.curwin.setW_buffer(curbuf);
			} 
			ModernizedCProgram.getout(0);
		} 
		if (ModernizedCProgram.curtab != prev_curtab && /* Autocommands may have moved to another tab page. */win.win_valid_any_tab() && generatedW_buffer == ((Object)0)) {
			ModernizedCProgram.win_close_othertab(win, 0, /* Need to close the window anyway, since the buffer is NULL. */prev_curtab);
			return 0;
		} 
		if (!win.win_valid() || ModernizedCProgram.last_window() || ModernizedCProgram.close_last_window_tabpage(win, free_buf, prev_curtab)) {
			return 0;
		} 
		// to split a window to avoid trouble.// to split a window to avoid trouble.++ModernizedCProgram.split_disallowed;
		wp = win.win_free_mem(dir, ((Object)/* Free the memory used for the window and get the window that received
		     * the screen space. */0/* Make sure curwin isn't invalid.  It can cause severe trouble when
		     * printing an error message.  For win_equal() curbuf needs to be valid
		     * too. */));
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_pvw = generatedW_onebuf_opt.getWo_pvw();
		window_S generatedW_next = wp.getW_next();
		if (win == ModernizedCProgram.curwin) {
			ModernizedCProgram.curwin = wp;
			if (generatedWo_pvw || generatedW_buffer.bt_quickfix()) {
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					if (generatedW_next == ((Object)0)) {
						wp = ModernizedCProgram.firstwin;
					} else {
							wp = generatedW_next;
					} 
					if (wp == ModernizedCProgram.curwin) {
						break;
					} 
					if (!generatedWo_pvw && !generatedW_buffer.bt_quickfix()) {
						ModernizedCProgram.curwin = wp;
						break;
					} 
				}
			} 
			curbuf = generatedW_buffer;
			close_curwin = 1;
			ModernizedCProgram.check_cursor();
		} 
		if (ModernizedCProgram.p_ea && (ModernizedCProgram.p_ead == (byte)'b' || ModernizedCProgram.p_ead == dir/* If the frame of the closed window contains the new current window,
			 * only resize that frame.  Otherwise resize all windows. */)) {
			ModernizedCProgram.curwin.win_equal(generatedFr_parent == win_frame, dir);
		} else {
				ModernizedCProgram.win_comp_pos();
		} 
		if (close_curwin) {
			wp.win_enter_ext(0, 1, 0, 1, 1);
			if (other_buffer) {
				/* careful: after this wp and win may be invalid! */curbuf.apply_autocmds(auto_event.EVENT_BUFENTER, ((Object)0), ((Object)0), 0);
			} 
		} 
		--ModernizedCProgram.split_disallowed/*
		     * If last window has a status line now and we don't want one,
		     * remove the status line.
		     */;
		ModernizedCProgram.last_status(0);
		if (/* After closing the help window, try restoring the window layout from
		     * before it was opened. */help_window) {
			ModernizedCProgram.restore_snapshot(0, close_curwin/* When 'guioptions' includes 'L' or 'R' may have to remove scrollbars. */);
		} 
		ModernizedCProgram.redraw_all_later(40);
		return 1/*
		 * Close window "win" in tab page "tp", which is not the current tab page.
		 * This may be the last window in that tab page and result in closing the tab,
		 * thus "tp" may become invalid!
		 * Caller must check if buffer is hidden and whether the tabline needs to be
		 * updated.
		 */;
	}
	public window_S win_free_mem(Integer dirp, tabpage_S tp) {
		/* tab page "win" is in, NULL for current */frame_T frp = new frame_T();
		win_T wp = new win_T();
		frame_S generatedW_frame = this.getW_frame();
		frp = generatedW_frame;
		wp = win.winframe_remove(dirp, tp);
		ModernizedCProgram.vim_free(frp);
		ModernizedCProgram.win_free(win, tp);
		window_S generatedTp_curwin = tp.getTp_curwin();
		if (tp != ((Object)0) && win == generatedTp_curwin) {
			tp.setTp_curwin(wp);
		} 
		return wp;
	}
	/* set to 'v' or 'h' for direction if 'ea' */
	/* No window should be used after this. Set curwin to NULL to crash
	     * instead of using freed memory. */
	/*
	 * Remove a window and its frame from the tree of frames.
	 * Returns a pointer to the window that got the freed up space.
	 */
	public window_S winframe_remove(Integer dirp, tabpage_S tp) {
		/* tab page "win" is in, NULL for current */frame_T frp = new frame_T();
		frame_T frp2 = new frame_T();
		frame_T frp3 = new frame_T();
		frame_S generatedW_frame = this.getW_frame();
		frame_T frp_close = generatedW_frame;
		win_T wp = new win_T();
		/*
		     * If there is only one window there is nothing to remove.
		     */
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		window_S generatedTp_lastwin = tp.getTp_lastwin();
		if (tp == ((Object)0) ? (ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) : generatedTp_firstwin == generatedTp_lastwin) {
			return ((Object)0/*
			     * Remove the window from its frame.
			     */);
		} 
		frame_S frame_S = new frame_S();
		frp2 = frame_S.win_altframe(win, tp);
		window_S window_S = new window_S();
		wp = window_S.frame2win(frp2);
		/* Remove this frame from the list of frames. */frp_close.frame_remove();
		frame_S generatedFr_parent = frp_close.getFr_parent();
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		window_S generatedFr_win = frp2.getFr_win();
		 generatedW_onebuf_opt = generatedFr_win.getW_onebuf_opt();
		Object generatedWo_wfh = generatedW_onebuf_opt.getWo_wfh();
		frame_S generatedFr_prev = frp_close.getFr_prev();
		frame_S generatedFr_next = frp_close.getFr_next();
		int generatedFr_height = frp2.getFr_height();
		Object generatedWo_wfw = generatedW_onebuf_opt.getWo_wfw();
		int generatedFr_width = frp2.getFr_width();
		if (generatedFr_layout == 2/* When 'winfixheight' is set, try to find another frame in the column
			 * (as close to the closed frame as possible) to distribute the height
			 * to. */) {
			if (generatedFr_win != ((Object)0) && generatedWo_wfh) {
				frp = generatedFr_prev;
				frp3 = generatedFr_next;
				while (frp != ((Object)0) || frp3 != ((Object)0)) {
					if (frp != ((Object)0)) {
						if (!frp.frame_fixed_height()) {
							frp2 = frp;
							wp = window_S.frame2win(frp2);
							break;
						} 
						frp = generatedFr_prev;
					} 
					if (frp3 != ((Object)0)) {
						if (generatedFr_win != ((Object)0) && !generatedWo_wfh) {
							frp2 = frp3;
							wp = generatedFr_win;
							break;
						} 
						frp3 = generatedFr_next;
					} 
				}
			} 
			frp2.frame_new_height(generatedFr_height + generatedFr_height, frp2 == generatedFr_next ? 1 : 0, 0);
			dirp = (byte)'v';
		} else {
				if (generatedFr_win != ((Object)0) && generatedWo_wfw) {
					frp = generatedFr_prev;
					frp3 = generatedFr_next;
					while (frp != ((Object)0) || frp3 != ((Object)0)) {
						if (frp != ((Object)0)) {
							if (!frp.frame_fixed_width()) {
								frp2 = frp;
								wp = window_S.frame2win(frp2);
								break;
							} 
							frp = generatedFr_prev;
						} 
						if (frp3 != ((Object)0)) {
							if (generatedFr_win != ((Object)0) && !generatedWo_wfw) {
								frp2 = frp3;
								wp = generatedFr_win;
								break;
							} 
							frp3 = generatedFr_next;
						} 
					}
				} 
				frp2.frame_new_width(generatedFr_width + generatedFr_width, frp2 == generatedFr_next ? 1 : 0, 0);
				dirp = (byte)'h';
		} 
		int generatedW_winrow = this.getW_winrow();
		int generatedW_wincol = this.getW_wincol();
		if (frp2 == generatedFr_next) {
			int row = generatedW_winrow;
			int col = generatedW_wincol;
			frp2.frame_comp_pos(row, col);
		} 
		frame_S generatedFr_child = frp2.getFr_child();
		if (generatedFr_next == ((Object)0) && generatedFr_prev == ((Object)0)) {
			generatedFr_parent.setFr_layout(generatedFr_layout);
			generatedFr_parent.setFr_child(generatedFr_child);
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				frp.setFr_parent(generatedFr_parent);
			}
			generatedFr_parent.setFr_win(generatedFr_win);
			if (generatedFr_win != ((Object)0)) {
				generatedFr_win.setW_frame(generatedFr_parent);
			} 
			frp = generatedFr_parent;
			if (generatedFr_child == frp2) {
				ModernizedCProgram.topframe.setFr_child(frp);
			} 
			ModernizedCProgram.vim_free(frp2);
			frp2 = generatedFr_parent;
			if (frp2 != ((Object)0) && generatedFr_layout == generatedFr_layout) {
				if (generatedFr_child == /* The frame above the parent has the same layout, have to merge
					     * the frames into this list. */frp) {
					frp2.setFr_child(generatedFr_child);
				} 
				generatedFr_child.setFr_prev(generatedFr_prev);
				if (generatedFr_prev != ((Object)0)) {
					generatedFr_prev.setFr_next(generatedFr_child);
				} 
				for (frp3 = generatedFr_child; /*Error: Unsupported expression*/; frp3 = generatedFr_next) {
					frp3.setFr_parent(frp2);
					if (generatedFr_next == ((Object)0)) {
						frp3.setFr_next(generatedFr_next);
						if (generatedFr_next != ((Object)0)) {
							generatedFr_next.setFr_prev(frp3);
						} 
						break;
					} 
				}
				if (generatedFr_child == frp) {
					ModernizedCProgram.topframe.setFr_child(frp2);
				} 
				ModernizedCProgram.vim_free(frp);
			} 
		} 
		return wp/*
		 * Return a pointer to the frame that will receive the empty screen space that
		 * is left over after "win" is closed.
		 *
		 * If 'splitbelow' or 'splitright' is set, the space goes above or to the left
		 * by default.  Otherwise, the free space goes below or to the right.  The
		 * result is that opening a window and then immediately closing it will
		 * preserve the initial window layout.  The 'wfh' and 'wfw' settings are
		 * respected when possible.
		 */;
	}
	/* set to 'v' or 'h' for direction if 'ea' */
	public window_S frame2win(frame_S frp) {
		window_S generatedFr_win = frp.getFr_win();
		frame_S generatedFr_child = frp.getFr_child();
		while (generatedFr_win == ((Object)0)) {
			frp = generatedFr_child;
		}
		return generatedFr_win;
	}
	public void frame_fix_width() {
		int generatedW_width = this.getW_width();
		int generatedW_vsep_width = this.getW_vsep_width();
		frame_S generatedW_frame = this.getW_frame();
		generatedW_frame.setFr_width(generatedW_width + generatedW_vsep_width);
	}
	public void frame_fix_height() {
		int generatedW_height = (wp).getW_height();
		Object generatedW_winbar_height = (wp).getW_winbar_height();
		int generatedW_status_height = this.getW_status_height();
		frame_S generatedW_frame = this.getW_frame();
		generatedW_frame.setFr_height((generatedW_height + generatedW_winbar_height) + generatedW_status_height);
	}
	public void win_init_empty() {
		wp.redraw_win_later(40);
		this.setW_lines_valid(0);
		 generatedW_cursor = this.getW_cursor();
		generatedW_cursor.setLnum(1);
		this.setW_curswant(generatedW_cursor.setCol(0));
		generatedW_cursor.setColadd(0);
		 generatedW_pcmark = this.getW_pcmark();
		generatedW_pcmark.setLnum(/* pcmark not cleared but set to line 1 */1);
		generatedW_pcmark.setCol(0);
		 generatedW_prev_pcmark = this.getW_prev_pcmark();
		generatedW_prev_pcmark.setLnum(0);
		generatedW_prev_pcmark.setCol(0);
		this.setW_topline(1);
		this.setW_topfill(0);
		this.setW_botline(2);
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedB_s = generatedW_buffer.getB_s();
		this.setW_s(generatedB_s);
	}
	public window_S win_alloc_popup_win() {
		win_T wp = new win_T();
		wp = ((Object)0).win_alloc(1);
		 generatedW_onebuf_opt = (wp).getW_onebuf_opt();
		if (wp != ((Object)0)) {
			wp.win_init_some(ModernizedCProgram.curwin);
			do {
				generatedW_onebuf_opt.setWo_scb(0);
				generatedW_onebuf_opt.setWo_crb(0);
			} while (0);
			wp.new_frame();
		} 
		// We need to initialize options with something, using the current
		return wp/*
		 * Initialize window "wp" to display buffer "buf".
		 */;
	}
	public int win_alloc_firstwin() {
		ModernizedCProgram.curwin = ((Object)0).win_alloc(0);
		file_buffer file_buffer = new file_buffer();
		Object generatedB_s = curbuf.getB_s();
		if (oldwin == ((Object)0)) {
			curbuf = file_buffer.buflist_new(((Object)0), ((Object)0), -1024, /* Very first window, need to create an empty buffer for it and
				 * initialize from scratch. */2);
			if (ModernizedCProgram.curwin == ((Object)0) || curbuf == ((Object)0)) {
				return 0;
			} 
			ModernizedCProgram.curwin.setW_buffer(curbuf);
			ModernizedCProgram.curwin.setW_s((generatedB_s));
			curbuf.setB_nwindows(/* there is one window */1);
			ModernizedCProgram.curwin.setW_alist(ModernizedCProgram.global_alist);
			ModernizedCProgram.curwin_init();
		} else {
				ModernizedCProgram.curwin.win_init(oldwin, /* First window in new tab page, initialize it from "oldwin". */0);
				do {
					(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_scb(0);
					(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_crb(0);
				} while (/* We don't want cursor- and scroll-binding in the first window. */0);
		} 
		ModernizedCProgram.curwin.new_frame();
		if (ModernizedCProgram.curwin.getW_frame() == ((Object)0)) {
			return 0;
		} 
		ModernizedCProgram.topframe = ModernizedCProgram.curwin.getW_frame();
		ModernizedCProgram.topframe.setFr_width(Columns);
		ModernizedCProgram.topframe.setFr_height(ModernizedCProgram.Rows - ModernizedCProgram.p_ch);
		return 1/*
		 * Create a frame for window "wp".
		 */;
	}
	public void new_frame() {
		frame_T frp = (frame_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/);
		this.setW_frame(frp);
		if (frp != ((Object)0)) {
			frp.setFr_layout(0);
			frp.setFr_win(wp/*
			 * Initialize the window and frame size to the maximum.
			 */);
		} 
	}
	public void win_goto() {
		win_T owp = ModernizedCProgram.curwin;
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.text_locked()) {
			ModernizedCProgram.beep_flush();
			ModernizedCProgram.text_locked_msg();
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.curbuf_locked()) {
			return /*Error: Unsupported expression*/;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		if (generatedW_buffer != curbuf) {
			ModernizedCProgram.reset_VIsual_and_resel();
		}  else if (VIsual_active) {
			this.setW_cursor(ModernizedCProgram.curwin.getW_cursor());
		} 
		wp.win_enter(1);
		 generatedW_onebuf_opt = owp.getW_onebuf_opt();
		Object generatedWo_cole = generatedW_onebuf_opt.getWo_cole();
		 generatedW_cursor = owp.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		// Conceal cursor line in previous window, unconceal in current window.if (owp.win_valid() && generatedWo_cole > 0 && !ModernizedCProgram.msg_scrolled) {
			owp.redrawWinline(generatedLnum);
		} 
		if (generatedWo_cole > 0 && !ModernizedCProgram.msg_scrolled) {
			need_cursor_line_redraw = 1/*
			 * Find window number "winnr" (counting top to bottom).
			 */;
		} 
	}
	/*
	 * Find the tabpage for window "win".
	 */
	/*
	 * Get the above or below neighbor window of the specified window.
	 *   up - TRUE for the above neighbor
	 *   count - nth neighbor window
	 * Returns the specified window if the neighbor is not found.
	 */
	public window_S win_vert_neighbor(tabpage_S tp, int up, long count) {
		frame_T fr = new frame_T();
		frame_T nfr = new frame_T();
		frame_T foundfr = new frame_T();
		frame_S generatedW_frame = this.getW_frame();
		foundfr = generatedW_frame;
		frame_S generatedTp_topframe = tp.getTp_topframe();
		frame_S generatedFr_prev = fr.getFr_prev();
		frame_S generatedFr_next = fr.getFr_next();
		frame_S generatedFr_parent = fr.getFr_parent();
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		frame_S generatedFr_child = nfr.getFr_child();
		window_S window_S = new window_S();
		int generatedFr_width = fr.getFr_width();
		int generatedW_wincol = this.getW_wincol();
		int generatedW_wcol = this.getW_wcol();
		while (count/*
			 * First go upwards in the tree of frames until we find a upwards or
			 * downwards neighbor.
			 */--) {
			fr = foundfr;
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (fr == generatedTp_topframe) {
					;
				} 
				if (up) {
					nfr = generatedFr_prev;
				} else {
						nfr = generatedFr_next;
				} 
				if (generatedFr_layout == 2 && nfr != ((Object)0)) {
					break;
				} 
				fr = generatedFr_parent;
			}
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (generatedFr_layout == 0) {
					foundfr = nfr;
					break;
				} 
				fr = generatedFr_child;
				if (generatedFr_layout == 1) {
					while (generatedFr_next != ((Object)/* Find the frame at the cursor row. */0) && window_S.frame2win(fr).getW_wincol() + generatedFr_width <= generatedW_wincol + generatedW_wcol) {
						fr = generatedFr_next;
					}
				} 
				if (generatedFr_layout == 2 && up) {
					while (generatedFr_next != ((Object)0)) {
						fr = generatedFr_next;
					}
				} 
				nfr = fr;
			}
		}
	}
	public window_S win_horz_neighbor(tabpage_S tp, int left, long count) {
		frame_T fr = new frame_T();
		frame_T nfr = new frame_T();
		frame_T foundfr = new frame_T();
		frame_S generatedW_frame = this.getW_frame();
		foundfr = generatedW_frame;
		frame_S generatedTp_topframe = tp.getTp_topframe();
		frame_S generatedFr_prev = fr.getFr_prev();
		frame_S generatedFr_next = fr.getFr_next();
		frame_S generatedFr_parent = fr.getFr_parent();
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		frame_S generatedFr_child = nfr.getFr_child();
		window_S window_S = new window_S();
		int generatedFr_height = fr.getFr_height();
		int generatedW_winrow = this.getW_winrow();
		int generatedW_wrow = this.getW_wrow();
		while (count/*
			 * First go upwards in the tree of frames until we find a left or
			 * right neighbor.
			 */--) {
			fr = foundfr;
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (fr == generatedTp_topframe) {
					;
				} 
				if (left) {
					nfr = generatedFr_prev;
				} else {
						nfr = generatedFr_next;
				} 
				if (generatedFr_layout == 1 && nfr != ((Object)0)) {
					break;
				} 
				fr = generatedFr_parent;
			}
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (generatedFr_layout == 0) {
					foundfr = nfr;
					break;
				} 
				fr = generatedFr_child;
				if (generatedFr_layout == 2) {
					while (generatedFr_next != ((Object)/* Find the frame at the cursor row. */0) && window_S.frame2win(fr).getW_winrow() + generatedFr_height <= generatedW_winrow + generatedW_wrow) {
						fr = generatedFr_next;
					}
				} 
				if (generatedFr_layout == 1 && left) {
					while (generatedFr_next != ((Object)0)) {
						fr = generatedFr_next;
					}
				} 
				nfr = fr;
			}
		}
	}
	public void win_enter(int undo_sync) {
		wp.win_enter_ext(undo_sync, 0, 0, 1, 1/*
		 * Make window wp the current window.
		 * Can be called with "curwin_invalid" TRUE, which means that curwin has just
		 * been closed and isn't valid.
		 */);
	}
	public void win_enter_ext(int undo_sync, int curwin_invalid, int trigger_new_autocmds, int trigger_enter_autocmds, int trigger_leave_autocmds) {
		int other_buffer = 0;
		if (wp == ModernizedCProgram.curwin && !/* nothing to do */curwin_invalid) {
			return /*Error: Unsupported expression*/;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		if (!curwin_invalid && trigger_leave_autocmds/*
			 * Be careful: If autocommands delete the window, return now.
			 */) {
			if (generatedW_buffer != curbuf) {
				curbuf.apply_autocmds(auto_event.EVENT_BUFLEAVE, ((Object)0), ((Object)0), 0);
				other_buffer = 1;
				if (!wp.win_valid()) {
					return /*Error: Unsupported expression*/;
				} 
			} 
			curbuf.apply_autocmds(auto_event.EVENT_WINLEAVE, ((Object)0), ((Object)0), 0);
			if (!wp.win_valid()) {
				return /*Error: Unsupported expression*/;
			} 
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		if (undo_sync && curbuf != generatedW_buffer) {
			ModernizedCProgram.u_sync(0);
		} 
		ModernizedCProgram.update_topline();
		if (generatedW_buffer != /* may have to copy the buffer options when 'cpo' contains 'S' */curbuf) {
			generatedW_buffer.buf_copy_options(1 | 4);
		} 
		if (!curwin_invalid) {
			prevwin = /* remember for CTRL-W p */ModernizedCProgram.curwin;
			ModernizedCProgram.curwin.setW_redr_status(1);
		} 
		ModernizedCProgram.curwin = wp;
		curbuf = generatedW_buffer;
		ModernizedCProgram.check_cursor();
		if (!ModernizedCProgram.virtual_active()) {
			ModernizedCProgram.curwin.getW_cursor().setColadd(0);
		} 
		ModernizedCProgram.changed_line_abv_curs();
		if (ModernizedCProgram.curwin.getW_localdir() != ((Object)0) || ModernizedCProgram.curtab.getTp_localdir() != ((Object)0)) {
			char_u dirname = new char_u();
			if (globaldir == ((Object)0)) {
				char_u[] cwd = new char_u();
				if (ModernizedCProgram.mch_dirname(cwd, 1024) == 1) {
					globaldir = ModernizedCProgram.vim_strsave(cwd);
				} 
			} 
			if (ModernizedCProgram.curwin.getW_localdir() != ((Object)0)) {
				dirname = ModernizedCProgram.curwin.getW_localdir();
			} else {
					dirname = ModernizedCProgram.curtab.getTp_localdir();
			} 
			if (ModernizedCProgram.mch_chdir((byte)dirname) == 0) {
				ModernizedCProgram.shorten_fnames(1);
			} 
		}  else if (globaldir != ((Object)0)) {
			ModernizedCProgram.vim_ignored = ModernizedCProgram.mch_chdir((byte)/* Window doesn't have a local directory and we are not in the global
				 * directory: Change to the global directory. */globaldir);
			do {
				if ((globaldir) != ((Object)0)) {
					ModernizedCProgram.vim_free(globaldir);
					(globaldir) = ((Object)0);
				} 
			} while (0);
			ModernizedCProgram.shorten_fnames(1);
		} 
		// Careful: autocommands may close the window and make "wp" invalidif (trigger_new_autocmds) {
			curbuf.apply_autocmds(auto_event.EVENT_WINNEW, ((Object)0), ((Object)0), 0);
		} 
		if (trigger_enter_autocmds) {
			curbuf.apply_autocmds(auto_event.EVENT_WINENTER, ((Object)0), ((Object)0), 0);
			if (other_buffer) {
				curbuf.apply_autocmds(auto_event.EVENT_BUFENTER, ((Object)0), ((Object)0), 0);
			} 
		} 
		ModernizedCProgram.maketitle();
		ModernizedCProgram.curwin.setW_redr_status(1)// terminal is likely in another mode;// terminal is likely in another mode
		redraw_tabline = 1;
		if (restart_edit) {
			ModernizedCProgram.redraw_later(/* causes status line redraw */10);
		} 
		if (ModernizedCProgram.curwin.getW_height() < ModernizedCProgram.p_wh && !ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wfh() && !ModernizedCProgram.curwin.popup_is_popup()) {
			ModernizedCProgram.win_setheight((int)ModernizedCProgram.p_wh);
		}  else if (ModernizedCProgram.curwin.getW_height() == 0) {
			ModernizedCProgram.win_setheight(1);
		} 
		if (ModernizedCProgram.curwin.getW_width() < ModernizedCProgram.p_wiw && !ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wfw()) {
			ModernizedCProgram.win_setwidth((int)ModernizedCProgram.p_wiw);
		} 
		/*Error: Function owner not recognized*/// in case jumped to/from help buffer/*Error: Function owner not recognized*/// in case jumped to/from help buffersetmouse();
		do {
			if (p_acd) {
				ModernizedCProgram.do_autochdir();
			} 
		} while (/* Change directories when the 'acd' option is set. */0/*
		 * Jump to the first open window that contains buffer "buf", if one exists.
		 * Returns a pointer to the window found, otherwise NULL.
		 */);
	}
	public window_S buf_jump_open_win(file_buffer buf) {
		win_T wp = ((Object)0);
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		if (ModernizedCProgram.curwin.getW_buffer() == buf) {
			wp = ModernizedCProgram.curwin;
		} else {
				for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
					if (generatedW_buffer == buf) {
						break;
					} 
				}
		} 
		if (wp != ((Object)0)) {
			wp.win_enter(0);
		} 
		return wp/*
		 * Jump to the first open window in any tab page that contains buffer "buf",
		 * if one exists.
		 * Returns a pointer to the window found, otherwise NULL.
		 */;
	}
	public window_S buf_jump_open_tab(file_buffer buf) {
		window_S window_S = new window_S();
		win_T wp = window_S.buf_jump_open_win(buf);
		tabpage_T tp = new tabpage_T();
		if (wp != ((Object)0)) {
			return wp;
		} 
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			if (tp != ModernizedCProgram.curtab) {
				for (wp = generatedTp_firstwin; wp != ((Object)0); wp = generatedW_next) {
					if (generatedW_buffer == buf) {
						break;
					} 
				}
				if (wp != ((Object)0)) {
					ModernizedCProgram.goto_tabpage_win(tp, wp);
					if (ModernizedCProgram.curwin != wp) {
						wp = ((Object)/* something went wrong */0);
					} 
					break;
				} 
			} 
		}
		return wp;
	}
	public window_S win_alloc(int hidden) {
		win_T new_wp = new win_T();
		/*
		     * allocate window structure and linesizes arrays
		     */
		new_wp = (win_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/);
		if (new_wp == ((Object)0)) {
			return ((Object)0);
		} 
		if (new_wp.win_alloc_lines() == 0) {
			ModernizedCProgram.vim_free(new_wp);
			return ((Object)0);
		} 
		new_wp.setW_id(++ModernizedCProgram.last_win_id);
		dictvar_S dictvar_S = new dictvar_S();
		new_wp.setW_vars(dictvar_S.dict_alloc());
		Object generatedW_vars = new_wp.getW_vars();
		if (generatedW_vars == ((Object)0)) {
			new_wp.win_free_lsize();
			ModernizedCProgram.vim_free(new_wp);
			return ((Object)0);
		} 
		Object generatedW_winvar = new_wp.getW_winvar();
		ModernizedCProgram.init_var_dict(generatedW_vars, generatedW_winvar, 1);
		ModernizedCProgram.block_autocmds();
		if (!hidden) {
			after.win_append(new_wp);
		} 
		new_wp.setW_wincol(0);
		new_wp.setW_width(Columns);
		new_wp.setW_topline(/* position the display and the cursor at the top of the file. */1);
		new_wp.setW_topfill(0);
		new_wp.setW_botline(2);
		 generatedW_cursor = new_wp.getW_cursor();
		generatedW_cursor.setLnum(1);
		new_wp.setW_scbind_pos(1);
		// use global option value for global-local options// use global option value for global-local optionsnew_wp.setW_p_so(-1);
		new_wp.setW_p_siso(-1);
		new_wp.setW_fraction(/* We won't calculate w_fraction until resizing the window */0);
		new_wp.setW_prev_fraction_row(-1);
		new_wp.foldInitWin();
		ModernizedCProgram.unblock_autocmds();
		new_wp.setW_match_head(((Object)0));
		new_wp.setW_next_match_id(4);
		return new_wp/*
		 * Remove window 'wp' from the window list and free the structure.
		 */;
	}
	/* non-existing window */
	// When non-zero splitting a window is forbidden.  Used to avoid that nasty
	// autocommands mess up the window structure.
	// #define WIN_DEBUG
	public int win_unlisted() {
		Object generatedW_popup_flags = (wp).getW_popup_flags();
		return wp == ModernizedCProgram.aucmd_win || (generatedW_popup_flags != 0/*
		 * Free a popup window.  This does not take the window out of the window list
		 * and assumes there is only one toplevel frame, no split.
		 */);
	}
	public void win_free_popup() {
		file_buffer generatedW_buffer = this.getW_buffer();
		if (generatedW_buffer.bt_popup()) {
			win.win_close_buffer(5, 0);
		} else {
				ModernizedCProgram.close_buffer(win, generatedW_buffer, 0, 0);
		} 
		Object generatedW_popup_timer = this.getW_popup_timer();
		if (generatedW_popup_timer != ((Object)0)) {
			generatedW_popup_timer.stop_timer();
		} 
		frame_S generatedW_frame = this.getW_frame();
		ModernizedCProgram.vim_free(generatedW_frame);
		ModernizedCProgram.win_free(win, ((Object)0/*
		 * Append window "wp" in the window list after window "after".
		 */));
	}
	public void win_append(window_S wp) {
		win_T before = new win_T();
		window_S generatedW_next = this.getW_next();
		if (after == ((Object)/* after NULL is in front of the first */0)) {
			before = ModernizedCProgram.firstwin;
		} else {
				before = generatedW_next;
		} 
		wp.setW_next(before);
		wp.setW_prev(after);
		if (after == ((Object)0)) {
			ModernizedCProgram.firstwin = wp;
		} else {
				this.setW_next(wp);
		} 
		if (before == ((Object)0)) {
			ModernizedCProgram.lastwin = wp;
		} else {
				before.setW_prev(wp/*
				 * Remove a window from the window list.
				 */);
		} 
	}
	public int win_alloc_lines() {
		this.setW_lines_valid(0);
		this.setW_lines((wline_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/ * (ModernizedCProgram.Rows)));
		w_line[] generatedW_lines = this.getW_lines();
		if (generatedW_lines == ((Object)0)) {
			return 0;
		} 
		return 1/*
		 * free lsize arrays for a window
		 */;
	}
	public void win_free_lsize() {
		w_line[] generatedW_lines = this.getW_lines();
		if (wp != ((Object)/* TODO: why would wp be NULL here? */0)) {
			do {
				if ((generatedW_lines) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedW_lines);
					(generatedW_lines) = ((Object)0);
				} 
			} while (0/*
			 * Called from win_new_shellsize() after Rows changed.
			 * This only does the current tab page, others must be done when made active.
			 */);
		} 
	}
	public void win_setheight_win(int height) {
		int row;
		if (win == ModernizedCProgram.curwin) {
			if (height < /* Always keep current window at least one line high, even when
				 * 'winminheight' is zero. */ModernizedCProgram.p_wmh) {
				height = ModernizedCProgram.p_wmh;
			} 
			if (height == 0) {
				height = 1;
			} 
			height += (ModernizedCProgram.curwin).getW_winbar_height();
		} 
		frame_S generatedW_frame = this.getW_frame();
		int generatedW_status_height = this.getW_status_height();
		generatedW_frame.frame_setheight(height + generatedW_status_height);
		row = ModernizedCProgram.win_comp_pos();
		if (full_screen && ModernizedCProgram.msg_scrolled == 0 && row < ModernizedCProgram.cmdline_row) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill(row, ModernizedCProgram.cmdline_row, 0, (int)Columns, (byte)' ', (byte)' ', 0);
		} 
		ModernizedCProgram.cmdline_row = row;
		ModernizedCProgram.msg_row = row;
		ModernizedCProgram.msg_col = 0;
		ModernizedCProgram.redraw_all_later(40/*
		 * Set the height of a frame to "height" and take care that all frames and
		 * windows inside it are resized.  Also resize frames on the left and right if
		 * the are in the same FR_ROW frame.
		 *
		 * Strategy:
		 * If the frame is part of a FR_COL frame, try fitting the frame in that
		 * frame.  If that doesn't work (the FR_COL frame is too small), recursively
		 * go to containing frames to resize them and make room.
		 * If the frame is part of a FR_ROW frame, all frames must be resized as well.
		 * Check for the minimal height of the FR_ROW frame.
		 * At the top level we can also use change the command line height.
		 */);
	}
	public void win_setwidth_win(int width) {
		if (wp == /* Always keep current window at least one column wide, even when
		     * 'winminwidth' is zero. */ModernizedCProgram.curwin) {
			if (width < ModernizedCProgram.p_wmw) {
				width = ModernizedCProgram.p_wmw;
			} 
			if (width == 0) {
				width = 1;
			} 
		} 
		frame_S generatedW_frame = this.getW_frame();
		int generatedW_vsep_width = this.getW_vsep_width();
		generatedW_frame.frame_setwidth(width + generatedW_vsep_width);
		(Object)ModernizedCProgram.win_comp_pos();
		ModernizedCProgram.redraw_all_later(40/*
		 * Set the width of a frame to "width" and take care that all frames and
		 * windows inside it are resized.  Also resize frames above and below if the
		 * are in the same FR_ROW frame.
		 *
		 * Strategy is similar to frame_setheight().
		 */);
	}
	/*
	 * Status line of dragwin is dragged "offset" lines down (negative is up).
	 */
	public void win_drag_status_line(int offset) {
		frame_T curfr = new frame_T();
		frame_T fr = new frame_T();
		int room;
		int row;
		/* if TRUE, drag status line up, otherwise down */int up;
		int n;
		frame_S generatedW_frame = this.getW_frame();
		fr = generatedW_frame;
		curfr = fr;
		frame_S generatedFr_parent = fr.getFr_parent();
		byte generatedFr_layout = fr.getFr_layout();
		if (fr != /* more than one window */ModernizedCProgram.topframe) {
			fr = generatedFr_parent;
			if (generatedFr_layout != 2) {
				curfr = fr;
				if (fr != /* only a row of windows, may drag statusline */ModernizedCProgram.topframe) {
					fr = generatedFr_parent;
				} 
			} 
		} 
		frame_S generatedFr_next = curfr.getFr_next();
		while (curfr != ModernizedCProgram.topframe && generatedFr_next == ((Object)/* If this is the last frame in a column, may want to resize the parent
		     * frame instead (go two up to skip a row of frames). */0)) {
			if (fr != ModernizedCProgram.topframe) {
				fr = generatedFr_parent;
			} 
			curfr = fr;
			if (fr != ModernizedCProgram.topframe) {
				fr = generatedFr_parent;
			} 
		}
		int generatedFr_height = fr.getFr_height();
		frame_S generatedFr_child = fr.getFr_child();
		if (offset < /* drag up */0) {
			up = 1;
			offset = -offset;
			if (fr == /* sum up the room of the current frame and above it */curfr) {
				room = generatedFr_height - ModernizedCProgram.frame_minheight(fr, ((Object)/* only one window */0));
			} else {
					room = 0;
					for (fr = generatedFr_child; /*Error: Unsupported expression*/; fr = generatedFr_next) {
						room += generatedFr_height - ModernizedCProgram.frame_minheight(fr, ((Object)0));
						if (fr == curfr) {
							break;
						} 
					}
			} 
			fr = generatedFr_next;
		} else {
				up = /* drag down */0/*
					 * Only dragging the last status line can reduce p_ch.
					 */;
				room = ModernizedCProgram.Rows - ModernizedCProgram.cmdline_row;
				if (generatedFr_next == ((Object)0)) {
					room -= 1;
				} else {
						room -= ModernizedCProgram.p_ch;
				} 
				if (room < 0) {
					room = 0;
				} 
				for (fr = generatedFr_next; fr != ((Object)0); fr = generatedFr_next) {
					room += generatedFr_height - ModernizedCProgram.frame_minheight(fr, ((Object)0));
				}
				fr = /* put fr at window that grows */curfr;
		} 
		if (room < /* Not enough room */offset) {
			offset = /* Move as far as we can */room;
		} 
		if (offset <= 0) {
			return /*Error: Unsupported expression*/;
		} 
		if (fr != ((Object)0)) {
			fr.frame_new_height(generatedFr_height + offset, up, 0);
		} 
		if (up) {
			fr = /* current frame gets smaller */curfr;
		} else {
				fr = generatedFr_next;
		} 
		frame_S generatedFr_prev = fr.getFr_prev();
		while (fr != ((Object)0) && offset > 0) {
			n = ModernizedCProgram.frame_minheight(fr, ((Object)0));
			if (generatedFr_height - offset <= n) {
				offset -= generatedFr_height - n;
				fr.frame_new_height(n, !up, 0);
			} else {
					fr.frame_new_height(generatedFr_height - offset, !up, 0);
					break;
			} 
			if (up) {
				fr = generatedFr_prev;
			} else {
					fr = generatedFr_next;
			} 
		}
		row = ModernizedCProgram.win_comp_pos();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill(row, ModernizedCProgram.cmdline_row, 0, (int)Columns, (byte)' ', (byte)' ', 0);
		ModernizedCProgram.cmdline_row = row;
		ModernizedCProgram.p_ch = ModernizedCProgram.Rows - ModernizedCProgram.cmdline_row;
		if (ModernizedCProgram.p_ch < 1) {
			ModernizedCProgram.p_ch = 1;
		} 
		ModernizedCProgram.curtab.setTp_ch_used(ModernizedCProgram.p_ch);
		ModernizedCProgram.redraw_all_later(35);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/showmode();
	}
	public void win_drag_vsep_line(int offset) {
		frame_T curfr = new frame_T();
		frame_T fr = new frame_T();
		int room;
		/* if TRUE, drag separator line left, otherwise right */int left;
		int n;
		frame_S generatedW_frame = this.getW_frame();
		fr = generatedW_frame;
		if (fr == /* only one window (cannot happen?) */ModernizedCProgram.topframe) {
			return /*Error: Unsupported expression*/;
		} 
		curfr = fr;
		frame_S generatedFr_parent = fr.getFr_parent();
		fr = generatedFr_parent;
		byte generatedFr_layout = fr.getFr_layout();
		if (generatedFr_layout != /* When the parent frame is not a row of frames, its parent should be. */1) {
			if (fr == /* only a column of windows (cannot happen?) */ModernizedCProgram.topframe) {
				return /*Error: Unsupported expression*/;
			} 
			curfr = fr;
			fr = generatedFr_parent;
		} 
		frame_S generatedFr_next = curfr.getFr_next();
		while (generatedFr_next == ((Object)/* If this is the last frame in a row, may want to resize a parent
		     * frame instead. */0)) {
			if (fr == ModernizedCProgram.topframe) {
				break;
			} 
			curfr = fr;
			fr = generatedFr_parent;
			if (fr != ModernizedCProgram.topframe) {
				curfr = fr;
				fr = generatedFr_parent;
			} 
		}
		int generatedFr_width = fr.getFr_width();
		frame_S generatedFr_child = fr.getFr_child();
		if (offset < /* drag left */0) {
			left = 1;
			offset = -offset;
			room = /* sum up the room of the current frame and left of it */0;
			for (fr = generatedFr_child; /*Error: Unsupported expression*/; fr = generatedFr_next) {
				room += generatedFr_width - ModernizedCProgram.frame_minwidth(fr, ((Object)0));
				if (fr == curfr) {
					break;
				} 
			}
			fr = generatedFr_next;
		} else {
				left = /* drag right */0;
				room = /* sum up the room of frames right of the current one */0;
				for (fr = generatedFr_next; fr != ((Object)0); fr = generatedFr_next) {
					room += generatedFr_width - ModernizedCProgram.frame_minwidth(fr, ((Object)0));
				}
				fr = /* put fr at window that grows */curfr;
		} 
		if (room < /* Not enough room */offset) {
			offset = /* Move as far as we can */room;
		} 
		if (offset <= /* No room at all, quit. */0) {
			return /*Error: Unsupported expression*/;
		} 
		if (fr == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		fr.frame_new_width(generatedFr_width + offset, left, /* grow frame fr by offset lines */0);
		if (/* shrink other frames: current and at the left or at the right */left) {
			fr = /* current frame gets smaller */curfr;
		} else {
				fr = generatedFr_next;
		} 
		frame_S generatedFr_prev = fr.getFr_prev();
		while (fr != ((Object)0) && offset > 0) {
			n = ModernizedCProgram.frame_minwidth(fr, ((Object)0));
			if (generatedFr_width - offset <= n) {
				offset -= generatedFr_width - n;
				fr.frame_new_width(n, !left, 0);
			} else {
					fr.frame_new_width(generatedFr_width - offset, !left, 0);
					break;
			} 
			if (left) {
				fr = generatedFr_prev;
			} else {
					fr = generatedFr_next;
			} 
		}
		(Object)ModernizedCProgram.win_comp_pos();
		ModernizedCProgram.redraw_all_later(40/*
		 * Set wp->w_fraction for the current w_wrow and w_height.
		 * Has no effect when the window is less than two lines.
		 */);
	}
	public void set_fraction() {
		int generatedW_height = this.getW_height();
		int generatedW_wrow = this.getW_wrow();
		if (generatedW_height > 1) {
			this.setW_fraction(((long)generatedW_wrow * -1024 + -1024 / 2) / (long)generatedW_height);
		} 
		// When cursor is in the first line the percentage is computed as if// it's halfway that line.  Thus with two lines it is 25%, with three
	}
	public void win_new_height(int height) {
		int generatedW_height = this.getW_height();
		int prev_height = generatedW_height;
		if (height < /* Don't want a negative height.  Happens when splitting a tiny window.
		     * Will equalize heights soon to fix it. */0) {
			height = 0;
		} 
		if (generatedW_height == height) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedW_wrow = this.getW_wrow();
		int generatedW_prev_fraction_row = this.getW_prev_fraction_row();
		if (generatedW_height > 0) {
			if (wp == ModernizedCProgram.curwin/* w_wrow needs to be valid. When setting 'laststatus' this may
				     * call win_new_height() recursively. */) {
				ModernizedCProgram.validate_cursor();
			} 
			if (generatedW_height != prev_height) {
				return /*Error: Unsupported expression*/;
			} 
			if (generatedW_wrow != generatedW_prev_fraction_row) {
				wp.set_fraction();
			} 
		} 
		this.setW_height(height);
		this.setW_skipcol(0);
		if (!/* There is no point in adjusting the scroll position when exiting.  Some
		     * values might be invalid. */exiting) {
			wp.scroll_to_fraction(prev_height);
		} 
	}
	public void scroll_to_fraction(int prev_height) {
		linenr_T lnum = new linenr_T();
		int sline;
		int line_size;
		int generatedW_height = this.getW_height();
		int height = generatedW_height;
		// Don't change w_topline in any of these cases:// - window height is 0
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_scb = generatedW_onebuf_opt.getWo_scb();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_topline = this.getW_topline();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		int generatedW_fraction = this.getW_fraction();
		Object generatedCol = generatedW_cursor.getCol();
		int generatedW_wrow = this.getW_wrow();
		int generatedW_width = this.getW_width();
		Object generatedW_skipcol = this.getW_skipcol();
		Object generatedW_topfill = this.getW_topfill();
		// - 'scrollbind' is set and this isn't the current window// - window height is sufficient to display the whole buffer and first line//   is visible.if (height > 0 && (!generatedWo_scb || wp == ModernizedCProgram.curwin) && (height < generatedMl_line_count || generatedW_topline > 1/*
			 * Find a value for w_topline that shows the cursor at the same
			 * relative position in the window as before (more or less).
			 */)) {
			lnum = generatedLnum;
			if (lnum < /* can happen when starting up */1) {
				lnum = 1;
			} 
			this.setW_wrow(((long)generatedW_fraction * (long)height - -1024) / -1024);
			line_size = wp.plines_win_col(lnum, (long)(generatedCol)) - 1;
			sline = generatedW_wrow - line_size;
			if (sline >= 0) {
				int rows = wp.plines_win(lnum, /* Make sure the whole cursor line is visible, if possible. */0);
				if (sline > generatedW_height - ModernizedCProgram.rows) {
					sline = generatedW_height - ModernizedCProgram.rows;
					generatedW_wrow -= ModernizedCProgram.rows - line_size;
				} 
			} 
			if (sline < 0/*
				     * Cursor line would go off top of screen if w_wrow was this high.
				     * Make cursor line the first line in the window.  If not enough
				     * room use w_skipcol;
				     */) {
				this.setW_wrow(line_size);
				if (generatedW_wrow >= generatedW_height && (generatedW_width - wp.win_col_off()) > 0) {
					generatedW_skipcol += generatedW_width - wp.win_col_off();
					--generatedW_wrow;
					while (generatedW_wrow >= generatedW_height) {
						generatedW_skipcol += generatedW_width - wp.win_col_off() + wp.win_col_off2();
						--generatedW_wrow;
					}
				} 
			}  else if (sline > 0) {
				while (sline > 0 && lnum > 1) {
					ModernizedCProgram.hasFoldingWin(wp, lnum, lnum, ((Object)0), 1, ((Object)0));
					if (lnum == 1) {
						line_size = /* first line in buffer is folded */1;
						--sline;
						break;
					} 
					--lnum;
					if (lnum == generatedW_topline) {
						line_size = wp.plines_win_nofill(lnum, 1) + generatedW_topfill;
					} else {
							line_size = wp.plines_win(lnum, 1);
					} 
					sline -= line_size;
				}
				if (sline < 0/*
						 * Line we want at top would go off top of screen.  Use next
						 * line instead.
						 */) {
					ModernizedCProgram.hasFoldingWin(wp, lnum, ((Object)0), lnum, 1, ((Object)0));
					lnum++;
					generatedW_wrow -= line_size + sline;
				}  else if (sline > 0) {
					lnum = 1;
					generatedW_wrow -= sline;
				} 
			} 
			wp.set_topline(lnum);
		} 
		if (wp == ModernizedCProgram.curwin) {
			if (ModernizedCProgram.get_scrolloff_value()) {
				ModernizedCProgram.update_topline();
			} 
			ModernizedCProgram.curs_columns(/* validate w_wrow */0);
		} 
		if (prev_height > 0) {
			this.setW_prev_fraction_row(generatedW_wrow);
		} 
		wp.win_comp_scroll();
		wp.redraw_win_later(35);
		this.setW_redr_status(1);
		wp/*
		 * Set the width of a window.
		 */.invalidate_botline_win();
	}
	public void win_new_width(int width) {
		this.setW_width(width);
		this.setW_lines_valid(0);
		wp.changed_line_abv_curs_win();
		wp.invalidate_botline_win();
		if (wp == ModernizedCProgram.curwin) {
			ModernizedCProgram.update_topline();
			ModernizedCProgram.curs_columns(/* validate w_wrow */1);
		} 
		wp.redraw_win_later(40);
		this.setW_redr_status(1);
	}
	public void win_comp_scroll() {
		int generatedW_height = this.getW_height();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		generatedW_onebuf_opt.setWo_scr(((int)generatedW_height >> 1));
		Object generatedWo_scr = generatedW_onebuf_opt.getWo_scr();
		if (generatedWo_scr == 0) {
			generatedW_onebuf_opt.setWo_scr(1/*
			 * command_height: called whenever p_ch has been changed
			 */);
		} 
	}
	public window_S restore_snapshot_rec(frame_S sn, frame_S fr) {
		win_T wp = ((Object)0);
		win_T wp2 = new win_T();
		int generatedFr_height = sn.getFr_height();
		fr.setFr_height(generatedFr_height);
		int generatedFr_width = sn.getFr_width();
		fr.setFr_width(generatedFr_width);
		byte generatedFr_layout = fr.getFr_layout();
		window_S generatedFr_win = sn.getFr_win();
		if (generatedFr_layout == 0) {
			fr.frame_new_height(generatedFr_height, 0, 0);
			fr.frame_new_width(generatedFr_width, 0, 0);
			wp = generatedFr_win;
		} 
		frame_S generatedFr_next = sn.getFr_next();
		window_S window_S = new window_S();
		if (generatedFr_next != ((Object)0)) {
			wp2 = window_S.restore_snapshot_rec(generatedFr_next, generatedFr_next);
			if (wp2 != ((Object)0)) {
				wp = wp2;
			} 
		} 
		frame_S generatedFr_child = sn.getFr_child();
		if (generatedFr_child != ((Object)0)) {
			wp2 = window_S.restore_snapshot_rec(generatedFr_child, generatedFr_child);
			if (wp2 != ((Object)0)) {
				wp = wp2;
			} 
		} 
		return wp/*
		 * Return TRUE if there is any vertically split window.
		 */;
	}
	public Byte check_colorcolumn() {
		char_u s = new char_u();
		int col;
		int count = 0;
		int[] color_cols = new int[256];
		int i;
		int j = 0;
		file_buffer generatedW_buffer = this.getW_buffer();
		if (generatedW_buffer == ((Object)0)) {
			return ((Object)0);
		} 
		long generatedB_p_tw = generatedW_buffer.getB_p_tw();
		Object generatedW_p_cc_cols = this.getW_p_cc_cols();
		ModernizedCProgram.vim_free(generatedW_p_cc_cols);
		if (count == 0) {
			this.setW_p_cc_cols(((Object)0));
		} else {
				this.setW_p_cc_cols((int)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (count + 1)));
				if (generatedW_p_cc_cols != ((Object)0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(color_cols, count, /*Error: Unsupported expression*/, int_cmp);
					for (i = 0; i < count; ++i) {
						if (j == 0 || generatedW_p_cc_cols[j - 1] != color_cols[i]) {
							generatedW_p_cc_cols[j++] = color_cols[i];
						} 
					}
					generatedW_p_cc_cols[j] = -1;
				} 
		} 
		// no errorreturn ((Object)0);
	}
	public int win_chartabsize(Object p, Object col) {
		 generatedW_onebuf_opt = (wp).getW_onebuf_opt();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		file_buffer generatedW_buffer = this.getW_buffer();
		long generatedB_p_ts = (generatedW_buffer).getB_p_ts();
		Object generatedB_p_vts_array = (generatedW_buffer).getB_p_vts_array();
		if ((p) == (byte)'\011' && (!generatedWo_list || lcs_tab1)) {
			return ModernizedCProgram.tabstop_padding(col, generatedB_p_ts, generatedB_p_vts_array);
		} else {
				return ModernizedCProgram.ptr2cells(p/*
				 * Return the number of characters the string 's' will take on the screen,
				 * taking into account the size of a tab.
				 */);
		} 
	}
	public int win_linetabsize(Object line, Object len) {
		colnr_T col = 0;
		char_u s = new char_u();
		for (s = line; s != (byte)'\000' && (len == INT_MAX || s < line + len); s += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(s)) {
			col += wp.win_lbr_chartabsize(line, s, col, ((Object)0));
		}
		return (int)col/*
		 * Return TRUE if 'c' is a normal identifier character:
		 * Letters and characters from the 'isident' option.
		 */;
	}
	public int win_lbr_chartabsize(Object line, Object[] s, Object col, Integer headp) {
		int c;
		int size;
		colnr_T col2 = new colnr_T();
		colnr_T col_adj = /* col + screen size of tab */0;
		colnr_T colmax = new colnr_T();
		int added;
		int mb_added = 0;
		int numberextra;
		char_u ps = new char_u();
		int tab_corr = (s == (byte)'\011');
		int n;
		/*
		     * No 'linebreak', 'showbreak' and 'breakindent': return quickly.
		     */
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_lbr = generatedW_onebuf_opt.getWo_lbr();
		Object generatedWo_bri = generatedW_onebuf_opt.getWo_bri();
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		file_buffer generatedW_buffer = this.getW_buffer();
		long generatedB_p_ts = (generatedW_buffer).getB_p_ts();
		Object generatedB_p_vts_array = (generatedW_buffer).getB_p_vts_array();
		if (!generatedWo_lbr && !generatedWo_bri && p_sbr == (byte)'\000') {
			if (generatedWo_wrap) {
				return wp.win_nolbr_chartabsize(s, col, headp);
			} 
			if ((s) == (byte)'\011' && (!generatedWo_list || lcs_tab1)) {
				return ModernizedCProgram.tabstop_padding(col, generatedB_p_ts, generatedB_p_vts_array);
			} else {
					return ModernizedCProgram.ptr2cells(s);
			} 
		} 
		size = wp.win_chartabsize(s, /*
		     * First get normal size, without 'linebreak'
		     */col);
		c = s;
		if (tab_corr) {
			col_adj = size - 1/*
			     * If 'linebreak' set check at a blank before a non-blank if the line
			     * needs a break here
			     */;
		} 
		int generatedW_width = this.getW_width();
		if (generatedWo_lbr && ((c) < 256 && breakat_flags[(char_u)(c)]) && !(((int)s[1]) < 256 && breakat_flags[(char_u)((int)s[1])]) && generatedWo_wrap && generatedW_width != 0/*
			 * Count all characters from first non-blank after a blank up to next
			 * non-blank after a blank.
			 */) {
			numberextra = wp.win_col_off();
			col2 = col;
			colmax = (colnr_T)(generatedW_width - numberextra - col_adj);
			if (col >= colmax) {
				colmax += col_adj;
				n = colmax + wp.win_col_off2();
				if (n > 0) {
					colmax += (((col - colmax) / n) + 1) * n - col_adj;
				} 
			} 
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				ps = s;
				s += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(s);
				c = s;
				if (!(c != (byte)'\000' && (((c) < 256 && breakat_flags[(char_u)(c)]) || (!((c) < 256 && breakat_flags[(char_u)(c)]) && (col2 == col || !(((int)ps) < 256 && breakat_flags[(char_u)((int)ps)])))))) {
					break;
				} 
				col2 += wp.win_chartabsize(s, col2);
				if (col2 >= /* doesn't fit */colmax) {
					size = colmax - col + col_adj;
					break;
				} 
			}
		}  else if (has_mbyte && size == 2 && ModernizedCProgram.mb_bytelen_tab[s] > 1 && generatedWo_wrap && wp.in_win_border(col)) {
			++/* Count the ">" in the last column. */size;
			mb_added = 1/*
			     * May have to add something for 'breakindent' and/or 'showbreak'
			     * string at start of line.
			     * Set *headp to the size of what we add.
			     */;
		} 
		added = 0;
		if ((p_sbr != (byte)'\000' || generatedWo_bri) && generatedWo_wrap && col != 0) {
			colnr_T sbrlen = 0;
			int numberwidth = wp.win_col_off();
			numberextra = numberwidth;
			col += numberextra + mb_added;
			if (col >= (colnr_T)generatedW_width) {
				col -= generatedW_width;
				numberextra = generatedW_width - (numberextra - wp.win_col_off2());
				if (col >= numberextra && numberextra > 0) {
					col %= numberextra;
				} 
				if (p_sbr != (byte)'\000') {
					sbrlen = (colnr_T)(has_mbyte ? ModernizedCProgram.mb_charlen(p_sbr) : (int)/*Error: Function owner not recognized*/strlen((byte)(p_sbr)));
					if (col >= sbrlen) {
						col -= sbrlen;
					} 
				} 
				if (col >= numberextra && numberextra > 0) {
					col = col % numberextra;
				}  else if (col > 0 && numberextra > 0) {
					col += numberwidth - wp.win_col_off2();
				} 
				numberwidth -= wp.win_col_off2();
			} 
			if (col == 0 || col + size + sbrlen > (colnr_T)generatedW_width) {
				added = 0;
				if (p_sbr != (byte)'\000') {
					if (size + sbrlen + numberwidth > (colnr_T)generatedW_width) {
						int width = (colnr_T)generatedW_width - sbrlen - numberwidth;
						int prev_width = col ? ((colnr_T)generatedW_width - (sbrlen + col)) : 0;
						if (width <= 0) {
							width = (colnr_T)1;
						} 
						added += ((size - prev_width) / width) * ModernizedCProgram.vim_strsize(p_sbr);
						if ((size - prev_width) % width) {
							added += ModernizedCProgram.vim_strsize(p_sbr);
						} 
					} else {
							added += ModernizedCProgram.vim_strsize(p_sbr);
					} 
				} 
				if (generatedWo_bri) {
					added += wp.get_breakindent_win(line);
				} 
				size += added;
				if (col != 0) {
					added = 0;
				} 
			} 
		} 
		if (headp != ((Object)0)) {
			headp = added + mb_added;
		} 
		return size/*
		 * Like win_lbr_chartabsize(), except that we know 'linebreak' is off and
		 * 'wrap' is on.  This means we need to check for a double-byte character that
		 * doesn't fit at the end of the screen line.
		 */;
	}
	/* start of the line */
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/* for towupper() and towlower() */
	public int win_nolbr_chartabsize(Object s, Object col, Integer headp) {
		int n;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		file_buffer generatedW_buffer = this.getW_buffer();
		long generatedB_p_ts = generatedW_buffer.getB_p_ts();
		Object generatedB_p_vts_array = generatedW_buffer.getB_p_vts_array();
		if (s == (byte)'\011' && (!generatedWo_list || lcs_tab1)) {
			return ModernizedCProgram.tabstop_padding(col, generatedB_p_ts, generatedB_p_vts_array);
		} 
		n = ModernizedCProgram.ptr2cells(s/* Add one cell for a double-width character in the last column of the
		     * window, displayed with a ">". */);
		if (n == 2 && ModernizedCProgram.mb_bytelen_tab[s] > 1 && wp.in_win_border(col)) {
			if (headp != ((Object)0)) {
				headp = 1;
			} 
			return 3;
		} 
		return n/*
		 * Return TRUE if virtual column "vcol" is in the rightmost column of window
		 * "wp".
		 */;
	}
	/* flag: set for printable chars */
	/* flag: set for ID chars */
	/* flag: set for file name chars */
	public int in_win_border(Object vcol) {
		/* width of first line (after line number) */int width1;
		/* width of further lines */int width2;
		int generatedW_width = this.getW_width();
		if (generatedW_width == /* there is no border */0) {
			return 0;
		} 
		width1 = generatedW_width - wp.win_col_off();
		if ((int)vcol < width1 - 1) {
			return 0;
		} 
		if ((int)vcol == width1 - 1) {
			return 1;
		} 
		width2 = width1 + wp.win_col_off2();
		if (width2 <= 0) {
			return 0;
		} 
		return ((vcol - width1) % width2 == width2 - 1/*
		 * Get virtual column number of pos.
		 *  start: on the first position of this character (TAB, ctrl)
		 * cursor: where the cursor is on this character (first char, except for TAB)
		 *    end: on the last position of this character (TAB, ctrl)
		 *
		 * This is used very often, keep it fast!
		 */);
	}
	/*
	 * Fill g_chartab[].  Also fills curbuf->b_chartab[] with flags for keyword
	 * characters for current buffer.
	 *
	 * Depends on the option settings 'iskeyword', 'isident', 'isfname',
	 * 'isprint' and 'encoding'.
	 *
	 * The index in g_chartab[] depends on 'encoding':
	 * - For non-multi-byte index with the byte (same as the character).
	 * - For DBCS index with the first byte.
	 * - For UTF-8 index with the character (when first byte is up to 0x80 it is
	 *   the same as the character, if the first byte is 0x80 and above it depends
	 *   on further bytes).
	 *
	 * The contents of g_chartab[]:
	 * - The lower two bits, masked by CT_CELL_MASK, give the number of display
	 *   cells the character occupies (1 or 2).  Not valid for UTF-8 above 0x80.
	 * - CT_PRINT_CHAR bit is set when the character is printable (no need to
	 *   translate the character before displaying it).  Note that only DBCS
	 *   characters can have 2 display cells and still be printable.
	 * - CT_FNAME_CHAR bit is set when the character can be in a file name.
	 * - CT_ID_CHAR bit is set when the character can be in an identifier.
	 *
	 * Return FAIL if 'iskeyword', 'isident', 'isfname' or 'isprint' option has an
	 * error, OK otherwise.
	 */
	public int ses_do_win() {
		file_buffer generatedW_buffer = this.getW_buffer();
		Object[] generatedB_fname = generatedW_buffer.getB_fname();
		if (generatedB_fname == ((Object)0) || generatedW_buffer.bt_nofilename()) {
			return (ssop_flags & -1024);
		} 
		if (generatedW_buffer.bt_help()) {
			return (ssop_flags & -1024);
		} 
		return 1/*
		 * Return TRUE if frame "fr" has a window somewhere that we want to save in
		 * the Session.
		 */;
	}
	public int match_delete(int id, int perr) {
		Object generatedW_match_head = this.getW_match_head();
		matchitem_T cur = generatedW_match_head;
		matchitem_T prev = cur;
		int rtype = 35;
		if (id < 1) {
			if (perr == 1) {
				ModernizedCProgram.semsg(((byte)("E802: Invalid ID: %d (must be greater than or equal to 1)")), id);
			} 
			return -1;
		} 
		int generatedId = cur.getId();
		matchitem generatedNext = cur.getNext();
		while (cur != ((Object)0) && generatedId != id) {
			prev = cur;
			cur = generatedNext;
		}
		if (cur == ((Object)0)) {
			if (perr == 1) {
				ModernizedCProgram.semsg(((byte)("E803: ID not found: %d")), id);
			} 
			return -1;
		} 
		if (cur == prev) {
			this.setW_match_head(generatedNext);
		} else {
				prev.setNext(generatedNext);
		} 
		 generatedMatch = cur.getMatch();
		Object generatedRegprog = generatedMatch.getRegprog();
		generatedRegprog.vim_regfree();
		Object generatedPattern = cur.getPattern();
		ModernizedCProgram.vim_free(generatedPattern);
		posmatch generatedPos = cur.getPos();
		Object generatedToplnum = generatedPos.getToplnum();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_mod_set = generatedW_buffer.getB_mod_set();
		Object generatedB_mod_top = generatedW_buffer.getB_mod_top();
		Object generatedB_mod_bot = generatedW_buffer.getB_mod_bot();
		Object generatedBotlnum = generatedPos.getBotlnum();
		if (generatedToplnum != 0) {
			if (generatedB_mod_set) {
				if (generatedB_mod_top > generatedToplnum) {
					generatedW_buffer.setB_mod_top(generatedToplnum);
				} 
				if (generatedB_mod_bot < generatedBotlnum) {
					generatedW_buffer.setB_mod_bot(generatedBotlnum);
				} 
			} else {
					generatedW_buffer.setB_mod_set(1);
					generatedW_buffer.setB_mod_top(generatedToplnum);
					generatedW_buffer.setB_mod_bot(generatedBotlnum);
					generatedW_buffer.setB_mod_xlines(0);
			} 
			rtype = 10;
		} 
		ModernizedCProgram.vim_free(cur);
		wp.redraw_win_later(rtype);
		return 0/*
		 * Delete all matches in the match list of window 'wp'.
		 */;
	}
	public void clear_matches() {
		matchitem_T m = new matchitem_T();
		Object generatedW_match_head = this.getW_match_head();
		while (generatedW_match_head != ((Object)0)) {
			m = generatedW_match_head.getNext();
			generatedW_match_head.getMatch().getRegprog().vim_regfree();
			ModernizedCProgram.vim_free(generatedW_match_head.getPattern());
			ModernizedCProgram.vim_free(generatedW_match_head);
			this.setW_match_head(m);
		}
		wp.redraw_win_later(35/*
		 * Get match from ID 'id' in window 'wp'.
		 * Return NULL if match not found.
		 */);
	}
	public int spell_check(Object[] ptr,  attrp, Integer capcol, int docount) {
		/* column to check for Capital *//* count good words *//* Most things are put in "mi" so that it can
						   be passed to functions quickly. */matchinf_T mi = new matchinf_T();
		int nrlen = /* found a number first */0;
		int c;
		int wrongcaplen = 0;
		int lpi;
		int count_word = docount;
		if (ptr <= /* A word never starts at a space or a control character.  Return quickly
		     * then, skipping over the character. */(byte)' ') {
			return 1;
		} 
		Object generatedW_s = this.getW_s();
		if (generatedW_s.getB_langp().getGa_len() == /* Return here when loading language files failed. */0) {
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((mi), (false), (/*Error: Unsupported expression*//* A number is always OK.  Also skip hexadecimal numbers 0xFF99 and
		     * 0X99FF.  But always do check spelling to find "3GPP" and "11
		     * julifeest". */));
		Object generatedMi_end = mi.getMi_end();
		if (ptr >= (byte)'0' && ptr <= (byte)'9') {
			if (ptr == (byte)'0' && (ptr[1] == (byte)'b' || ptr[1] == (byte)'B')) {
				mi.setMi_end(ModernizedCProgram.skipbin(ptr + 2));
			}  else if (ptr == (byte)'0' && (ptr[1] == (byte)'x' || ptr[1] == (byte)'X')) {
				mi.setMi_end(ModernizedCProgram.skiphex(ptr + 2));
			} else {
					mi.setMi_end(ModernizedCProgram.skipdigits(ptr));
			} 
			nrlen = (int)(generatedMi_end - ptr);
		} 
		mi.setMi_word(/* Find the normal end of the word (until the next non-word character). */ptr);
		mi.setMi_fend(ptr);
		Object generatedMi_fend = mi.getMi_fend();
		Object generatedSt_isu = spelltab.getSt_isu();
		if (wp.spell_iswordp(generatedMi_fend)) {
			do {
				generatedMi_fend += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMi_fend);
			} while (generatedMi_fend != (byte)'\000' && wp.spell_iswordp(generatedMi_fend));
			if (capcol != ((Object)0) && capcol == 0 && generatedW_s.getB_cap_prog() != ((Object)0)) {
				c = (has_mbyte ? /*Error: Function owner not recognized*/mb_ptr2char(ptr) : (int)(/* Check word starting with capital letter. */ptr));
				if (!(enc_utf8 && (c) >= 128 ? ModernizedCProgram.utf_isupper(c) : (c) < 256 ? generatedSt_isu[c] : (false))) {
					wrongcaplen = (int)(generatedMi_fend - ptr);
				} 
			} 
		} 
		if (capcol != ((Object)0)) {
			capcol = -1;
		} 
		mi.setMi_end(generatedMi_fend);
		mi.setMi_capflags(/* Check caps type later. */0);
		mi.setMi_cend(((Object)0));
		mi.setMi_win(wp);
		if (generatedMi_fend != /* case-fold the word with one non-word character, so that we can check
		     * for the word end. */(byte)'\000') {
			generatedMi_fend += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMi_fend);
		} 
		Object generatedMi_fword = mi.getMi_fword();
		(Object)ModernizedCProgram.spell_casefold(ptr, (int)(generatedMi_fend - ptr), generatedMi_fword, 254 + 1);
		mi.setMi_fwordlen((int)/*Error: Function owner not recognized*/strlen((byte)(generatedMi_fword)));
		mi.setMi_result(/* The word is bad unless we recognize it. */3);
		mi.setMi_result2(3/*
		     * Loop over the languages specified in 'spelllang'.
		     * We check them all, because a word may be matched longer in another
		     * language.
		     */);
		langp_S generatedMi_lp = mi.getMi_lp();
		slang_S generatedLp_slang = generatedMi_lp.getLp_slang();
		Object generatedSl_fidxs = generatedLp_slang.getSl_fidxs();
		Object generatedSl_nobreak = generatedLp_slang.getSl_nobreak();
		int generatedMi_result = mi.getMi_result();
		int generatedMi_result2 = mi.getMi_result2();
		Object generatedMi_end2 = mi.getMi_end2();
		for (lpi = 0; lpi < generatedW_s.getB_langp().getGa_len(); ++lpi) {
			mi.setMi_lp((((langp_T)(generatedW_s.getB_langp()).getGa_data()) + (lpi)));
			if (generatedSl_fidxs == ((Object)/* If reloading fails the language is still in the list but everything
				 * has been cleared. */0)) {
				continue;
			} 
			mi.find_word(/* Check for a matching word in case-folded words. */0);
			mi.find_word(/* Check for a matching word in keep-case words. */1);
			mi.find_prefix(/* Check for matching prefixes. */0);
			if (generatedSl_nobreak && generatedMi_result == /* For a NOBREAK language, may want to use a word without a following
				 * word as a backup. */3 && generatedMi_result2 != 3) {
				mi.setMi_result(generatedMi_result2);
				mi.setMi_end(generatedMi_end2);
			} 
			if (count_word && generatedMi_result == /* Count the word in the first language where it's found to be OK. */0) {
				generatedLp_slang.count_common_word(ptr, (int)(generatedMi_end - ptr), 1);
				count_word = 0;
			} 
		}
		Object generatedRegprog = regmatch.getRegprog();
		Object generatedEndp = regmatch.getEndp();
		Object generatedMi_word = mi.getMi_word();
		if (generatedMi_result != 0) {
			if (nrlen > /* If we found a number skip over it.  Allows for "42nd".  Do flag
				 * rare and local words, e.g., "3GPP". */0) {
				if (generatedMi_result == 3 || generatedMi_result == -1) {
					return nrlen;
				} 
			}  else if (!/* When we are at a non-word character there is no error, just
				 * skip over the character (try looking for a word after it). */wp.spell_iswordp_nmw(ptr)) {
				if (capcol != ((Object)0) && generatedW_s.getB_cap_prog() != ((Object)0)) {
					regmatch_T regmatch = new regmatch_T();
					int r;
					regmatch.setRegprog(generatedW_s.getB_cap_prog());
					regmatch.setRm_ic(0);
					r = regmatch.vim_regexec(ptr, 0);
					generatedW_s.setB_cap_prog(generatedRegprog);
					if (r) {
						capcol = (int)(generatedEndp[0] - ptr);
					} 
				} 
				if (has_mbyte) {
					return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr);
				} 
				return 1;
			}  else if (generatedMi_end == ptr/* Always include at least one character.  Required for when there
				     * is a mixup in "midword". */) {
				generatedMi_end += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMi_end);
			}  else if (generatedMi_result == 3 && generatedSl_nobreak) {
				char_u p = new char_u();
				char_u fp = new char_u();
				int save_result = generatedMi_result;
				mi.setMi_lp((((langp_T)(generatedW_s.getB_langp()).getGa_data()) + (/* First language in 'spelllang' is NOBREAK.  Find first position
					     * at which any word would be valid. */false)));
				if (generatedSl_fidxs != ((Object)0)) {
					p = generatedMi_word;
					fp = generatedMi_fword;
					for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
						p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
						fp += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fp);
						if (p >= generatedMi_end) {
							break;
						} 
						mi.setMi_compoff((int)(fp - generatedMi_fword));
						mi.find_word(3);
						if (generatedMi_result != 3) {
							mi.setMi_end(p);
							break;
						} 
					}
					mi.setMi_result(save_result);
				} 
			} 
			if (generatedMi_result == 3 || generatedMi_result == -1) {
				attrp = .HLF_SPB;
			}  else if (generatedMi_result == 1) {
				attrp = .HLF_SPR;
			} else {
					attrp = .HLF_SPL;
			} 
		} 
		if (wrongcaplen > 0 && (generatedMi_result == 0 || generatedMi_result == 1)) {
			attrp = /* Report SpellCap only when the word isn't badly spelled. */.HLF_SPC;
			return wrongcaplen;
		} 
		return (int)(generatedMi_end - ptr/*
		 * Check if the word at "mip->mi_word" is in the tree.
		 * When "mode" is FIND_FOLDWORD check in fold-case word tree.
		 * When "mode" is FIND_KEEPWORD check in keep-case word tree.
		 * When "mode" is FIND_PREFIX check for word after prefix in fold-case word
		 * tree.
		 *
		 * For a match mip->mi_result is updated.
		 */);
	}
	/* current window */
	public int no_spell_checking() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_spell = generatedW_onebuf_opt.getWo_spell();
		Object generatedW_s = this.getW_s();
		if (!generatedWo_spell || generatedW_s.getB_p_spl() == (byte)'\000' || generatedW_s.getB_langp().getGa_len() == 0) {
			ModernizedCProgram.emsg(((byte)("E756: Spell checking is not enabled")));
			return 1;
		} 
		return 0/*
		 * Move to next spell error.
		 * "curline" is FALSE for "[s", "]s", "[S" and "]S".
		 * "curline" is TRUE to find word under/after cursor in the same line.
		 * For Insert mode completion "dir" is BACKWARD and "curline" is TRUE: move
		 * to after badly spelled word before the cursor.
		 * Return 0 if not found, length of the badly spelled word otherwise.
		 */;
	}
	public int spell_move_to(int dir, int allwords, int curline,  attrp) {
		/* return: attributes of bad word or NULL
						   (only when "dir" is FORWARD) */linenr_T lnum = new linenr_T();
		pos_T found_pos = new pos_T();
		int found_len = 0;
		char_u line = new char_u();
		char_u p = new char_u();
		char_u endp = new char_u();
		hlf_T attr = new hlf_T();
		int len;
		int has_syntax = wp.syntax_present();
		int col;
		int can_spell;
		char_u buf = ((Object)0);
		int buflen = 0;
		int skip = 0;
		int capcol = -1;
		int found_one = 0;
		int wrapped = 0;
		if (wp.no_spell_checking()) {
			return 0/*
			     * Start looking for bad word at the start of the line, because we can't
			     * start halfway a word, we don't know where it starts or ends.
			     *
			     * When searching backwards, we continue in the line to find the last
			     * bad word (in the cursor line: before the cursor).
			     *
			     * We concatenate the start of the next line, so that wrapped words work
			     * (e.g. "et<line-break>cetera").  Doesn't work when searching backwards
			     * though...
			     */;
		} 
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		lnum = generatedLnum;
		do {
			(found_pos).setLnum(0);
			(found_pos).setCol(0);
			(found_pos).setColadd(0);
		} while (0);
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedCol = generatedW_cursor.getCol();
		while (!got_int) {
			line = generatedW_buffer.ml_get_buf(lnum, 0);
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(line));
			if (buflen < len + 254 + 2) {
				ModernizedCProgram.vim_free(buf);
				buflen = len + 254 + 2;
				buf = ModernizedCProgram.alloc(buflen);
				if (buf == ((Object)0)) {
					break;
				} 
			} 
			if (lnum == /* In first line check first word for Capital. */1) {
				capcol = 0;
			} 
			if (capcol == /* For checking first word with a capital skip white space. */0) {
				capcol = ModernizedCProgram.getwhitecols(line);
			}  else if (curline && wp == ModernizedCProgram.curwin) {
				col = ModernizedCProgram.getwhitecols(/* For spellbadword(): check if first word needs a capital. */line);
				if (ModernizedCProgram.check_need_cap(lnum, col)) {
					capcol = col;
				} 
				line = generatedW_buffer.ml_get_buf(lnum, /* Need to get the line again, may have looked at the previous
					     * one. */0);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(buf), (byte)(/* Copy the line into "buf" and append the start of the next line if
				 * possible. */line));
			if (lnum < generatedMl_line_count) {
				ModernizedCProgram.spell_cat_line(buf + /*Error: Function owner not recognized*/strlen((byte)(buf)), generatedW_buffer.ml_get_buf(lnum + 1, 0), 254);
			} 
			p = buf + skip;
			endp = buf + len;
			while (p < endp) {
				if (dir == (/* When searching backward don't search after the cursor.  Unless
					     * we wrapped around the end of the buffer. */true) && lnum == generatedLnum && !wrapped && (colnr_T)(p - buf) >= generatedCol) {
					break;
				} 
				attr = /* start of word */.HLF_COUNT;
				len = wp.spell_check(p, attr, capcol, 0);
				if (attr != .HLF_COUNT) {
					if (allwords || attr == /* We found a bad word.  Check the attribute. */.HLF_SPB) {
						if (dir == (/* When searching forward only accept a bad word after
								     * the cursor. */true) || lnum != generatedLnum || (lnum == generatedLnum && (wrapped || (colnr_T)(curline ? p - buf + len : p - buf) > generatedCol))) {
							if (has_syntax) {
								col = (int)(p - buf);
								(Object)wp.syn_get_id(lnum, (colnr_T)col, 0, can_spell, 0);
								if (!can_spell) {
									attr = .HLF_COUNT;
								} 
							} else {
									can_spell = 1;
							} 
							if (can_spell) {
								found_one = 1;
								found_pos.setLnum(lnum);
								found_pos.setCol((int)(p - buf));
								found_pos.setColadd(0);
								if (dir == 1) {
									this.setW_cursor(/* No need to search further. */found_pos);
									ModernizedCProgram.vim_free(buf);
									if (attrp != ((Object)0)) {
										attrp = attr;
									} 
									return len;
								}  else if (curline/* Insert mode completion: put cursor after
												 * the bad word. */) {
									generatedCol += len;
								} 
								found_len = len;
							} 
						} else {
								found_one = 1;
						} 
					} 
				} 
				p += /* advance to character after the word */len;
				capcol -= len;
			}
			if (dir == (true) && generatedLnum != 0) {
				this.setW_cursor(/* Use the last match in the line (before the cursor). */found_pos);
				ModernizedCProgram.vim_free(buf);
				return found_len;
			} 
			if (curline) {
				break;
			} 
			if (lnum == generatedLnum && /* If we are back at the starting line and searched it again there
				 * is no match, give up. */wrapped) {
				break;
			} 
			if (dir == (/* Advance to next line. */true)) {
				if (lnum > 1) {
					--lnum;
				}  else if (!ModernizedCProgram.p_ws) {
					break;
				} else {
						lnum = generatedMl_line_count;
						wrapped = 1;
						if (!ModernizedCProgram.shortmess((byte)'s')) {
							ModernizedCProgram.give_warning((char_u)((byte)(top_bot_msg)), 1);
						} 
				} 
				capcol = -1;
			} else {
					if (lnum < generatedMl_line_count) {
						++lnum;
					}  else if (!ModernizedCProgram.p_ws) {
						break;
					} else {
							lnum = /* Wrap around to the start of the buffer.  May search the
									 * starting line again and accept the first match. */1;
							wrapped = 1;
							if (!ModernizedCProgram.shortmess((byte)'s')) {
								ModernizedCProgram.give_warning((char_u)((byte)(bot_top_msg)), 1);
							} 
					} 
					if (lnum == generatedLnum && !/* If we are back at the starting line and there is no match then
						     * give up. */found_one) {
						break;
					} 
					if (attr == /* Skip the characters at the start of the next line that were
						     * included in a match crossing line boundaries. */.HLF_COUNT) {
						skip = (int)(p - endp);
					} else {
							skip = 0;
					} 
					--/* Capcol skips over the inserted space. */capcol;
					if (ModernizedCProgram.skipwhite(line) == /* But after empty line check first word in next line */(byte)'\000') {
						capcol = 0;
					} 
			} 
			ModernizedCProgram.line_breakcheck();
		}
		ModernizedCProgram.vim_free(buf);
		return 0/*
		 * For spell checking: concatenate the start of the following line "line" into
		 * "buf", blanking-out special characters.  Copy less then "maxlen" bytes.
		 * Keep the blanks at the start of the next line, this is used in win_line()
		 * to skip those bytes if the word was OK.
		 */;
	}
	/* FORWARD or BACKWARD */
	/* TRUE for "[s"/"]s", FALSE for "[S"/"]S" */
	public Byte did_set_spelllang() {
		garray_T ga = new garray_T();
		char_u splp = new char_u();
		char_u region = new char_u();
		char_u[] region_cp = new char_u();
		int filename;
		int region_mask;
		slang_T slang = new slang_T();
		int c;
		char_u[] lang = new char_u();
		char_u[] spf_name = new char_u();
		int len;
		char_u p = new char_u();
		int round;
		char_u spf = new char_u();
		char_u use_region = ((Object)0);
		int dont_use_region = 0;
		int nobreak = 0;
		int i;
		int j;
		langp_T lp = new langp_T();
		langp_T lp2 = new langp_T();
		int recursive = 0;
		byte ret_msg = ((Object)0);
		char_u spl_copy = new char_u();
		bufref_T bufref = new bufref_T();
		file_buffer generatedW_buffer = this.getW_buffer();
		ModernizedCProgram.set_bufref(bufref, generatedW_buffer);
		if (recursive) {
			return ((Object)0);
		} 
		recursive = 1;
		ga.ga_init2(/*Error: Unsupported expression*/, 2);
		wp.clear_midword();
		Object generatedW_s = this.getW_s();
		spl_copy = ModernizedCProgram.vim_strsave(generatedW_s.getB_p_spl());
		if (spl_copy == ((Object)0)) {
			;
		} 
		generatedW_s.setB_cjk(0);
		Object generatedSl_fname = slang.getSl_fname();
		slang_S generatedSl_next = slang.getSl_next();
		Object generatedSl_name = slang.getSl_name();
		Object generatedSl_regions = slang.getSl_regions();
		int generatedSl_add = slang.getSl_add();
		Object generatedGa_data = (ga).getGa_data();
		int generatedGa_len = ga.getGa_len();
		Object generatedSl_nobreak = slang.getSl_nobreak();
		for (splp = spl_copy; splp != /* Loop over comma separated language names. */(byte)'\000'; /*Error: Unsupported expression*/) {
			ModernizedCProgram.copy_option_part(splp, lang, 254, ",");
			region = ((Object)0);
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(lang));
			if (!ModernizedCProgram.valid_spellang(lang)) {
				continue;
			} 
			if (/*Error: Function owner not recognized*/strcmp((byte)(lang), (byte)("cjk")) == 0) {
				generatedW_s.setB_cjk(1);
				continue;
			} 
			if (len > 4 && ModernizedCProgram.vim_fnamecmp((char_u)(lang + len - 4), (char_u)(".spl")) == /* If the name ends in ".spl" use it as the name of the spell file.
				 * If there is a region name let "region" point to it and remove it
				 * from the name. */0) {
				filename = 1;
				p = ModernizedCProgram.vim_strchr(ModernizedCProgram.gettail(lang), /* Locate a region and remove it from the file name. */(byte)'_');
				if (p != ((Object)0) && (((int)(p[1]) - (byte)'A' < 26) || ((int)(p[1]) - (byte)'a' < 26)) && (((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) && !(((int)(p[3]) - (byte)'A' < 26) || ((int)(p[3]) - (byte)'a' < 26))) {
					ModernizedCProgram.vim_strncpy(region_cp, p + 1, 2);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(p), (byte)(p + 3), (size_t)(len - (p - lang) - 2));
					region = region_cp;
				} else {
						dont_use_region = 1;
				} 
				for (slang = first_lang; slang != ((Object)0); slang = generatedSl_next) {
					if (ModernizedCProgram.fullpathcmp(lang, generatedSl_fname, 0, 1) == 1) {
						break;
					} 
				}
			} else {
					filename = 0;
					if (len > 3 && lang[len - 3] == (byte)'_') {
						region = lang + len - 2;
						len -= 3;
						lang[len] = (byte)'\000';
					} else {
							dont_use_region = 1;
					} 
					for (slang = first_lang; slang != ((Object)0); slang = generatedSl_next) {
						if (ModernizedCProgram.vim_stricmp((byte)(lang), (byte)(generatedSl_name)) == 0) {
							break;
						} 
					}
			} 
			if (region != ((Object)0)) {
				if (use_region != ((Object)0) && /*Error: Function owner not recognized*/strcmp((byte)(region), (byte)(use_region)) != /* If the region differs from what was used before then don't
					     * use it for 'spellfile'. */0) {
					dont_use_region = 1;
				} 
				use_region = region;
			} 
			if (slang == ((Object)/* If not found try loading the language now. */0)) {
				if (filename) {
					(Object)((Object)0).spell_load_file(lang, lang, 0);
				} else {
						ModernizedCProgram.spell_load_lang(lang/* SpellFileMissing autocommands may do anything, including
								 * destroying the buffer we are using... */);
						if (!bufref.bufref_valid()) {
							ret_msg = "E797: SpellFileMissing autocommand deleted buffer";
							;
						} 
				} 
			} 
			for (slang = first_lang; slang != ((Object)0); slang = generatedSl_next) {
				if (filename ? ModernizedCProgram.fullpathcmp(lang, generatedSl_fname, 0, 1) == 1 : ModernizedCProgram.vim_stricmp((byte)(lang), (byte)(generatedSl_name)) == 0) {
					region_mask = -1024;
					if (!filename && region != ((Object)0)) {
						c = ModernizedCProgram.find_region(generatedSl_regions, /* find region in sl_regions */region);
						if (c == -1024) {
							if (generatedSl_add) {
								if (generatedSl_regions != (byte)'\000') {
									region_mask = /* This addition file is for other regions. */0;
								} 
							} else {
									ModernizedCProgram.smsg(((byte)(/* This is probably an error.  Give a warning and
												     * accept the words anyway. */"Warning: region %s not supported")), region);
							} 
						} else {
								region_mask = 1 << c;
						} 
					} 
					if (region_mask != 0) {
						if (ga.ga_grow(1) == 0) {
							ga.ga_clear();
							ret_msg = e_outofmem;
							;
						} 
						(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_slang(slang);
						(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_region(region_mask);
						++generatedGa_len;
						ModernizedCProgram.use_midword(slang, wp);
						if (generatedSl_nobreak) {
							nobreak = 1;
						} 
					} 
				} 
			}
		}
		spf = generatedW_s.getB_p_spf();
		for (round = 0; round == 0 || spf != (byte)'\000'; ++round) {
			if (round == 0) {
				if (int_wordlist == ((Object)/* Internal wordlist, if there is one. */0)) {
					continue;
				} 
				ModernizedCProgram.int_wordlist_spl(spf_name);
			} else {
					ModernizedCProgram.copy_option_part(spf, spf_name, 1024 - 5, /* One entry in 'spellfile'. */",");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(spf_name), (byte)(".spl"));
					for (c = 0; c < generatedGa_len; ++/* If it was already found above then skip it. */c) {
						p = generatedSl_fname;
						if (p != ((Object)0) && ModernizedCProgram.fullpathcmp(spf_name, p, 0, 1) == 1) {
							break;
						} 
					}
					if (c < generatedGa_len) {
						continue;
					} 
			} 
			for (slang = first_lang; slang != ((Object)0); slang = generatedSl_next) {
				if (ModernizedCProgram.fullpathcmp(spf_name, generatedSl_fname, 0, 1) == 1) {
					break;
				} 
			}
			if (slang == ((Object)0/* Not loaded, try loading it now.  The language name includes the
				     * region name, the region is ignored otherwise.  for int_wordlist
				     * use an arbitrary name. */)) {
				if (round == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(lang), (byte)("internal wordlist"));
				} else {
						ModernizedCProgram.vim_strncpy(lang, ModernizedCProgram.gettail(spf_name), 254);
						p = ModernizedCProgram.vim_strchr(lang, (byte)'.');
						if (p != ((Object)0)) {
							p = /* truncate at ".encoding.add" */(byte)'\000';
						} 
				} 
				slang = ((Object)0).spell_load_file(spf_name, lang, 1);
				if (slang != ((Object)0) && /* If one of the languages has NOBREAK we assume the addition
					     * files also have this. */nobreak) {
					slang.setSl_nobreak(1);
				} 
			} 
			if (slang != ((Object)0) && ga.ga_grow(1) == 1) {
				region_mask = -1024;
				if (use_region != ((Object)0) && !dont_use_region) {
					c = ModernizedCProgram.find_region(generatedSl_regions, /* find region in sl_regions */use_region);
					if (c != -1024) {
						region_mask = 1 << c;
					}  else if (generatedSl_regions != (byte)'\000') {
						region_mask = /* This spell file is for other regions. */0;
					} 
				} 
				if (region_mask != 0) {
					(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_slang(slang);
					(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_sallang(((Object)0));
					(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_replang(((Object)0));
					(((langp_T)generatedGa_data) + (generatedGa_len)).setLp_region(region_mask);
					++generatedGa_len;
					ModernizedCProgram.use_midword(slang, wp);
				} 
			} 
		}
		generatedW_s.getB_langp().ga_clear();
		generatedW_s.setB_langp(ga/* For each language figure out what language to use for sound folding and
		     * REP items.  If the language doesn't support it itself use another one
		     * with the same name.  E.g. for "en-math" use "en". */);
		slang_S generatedLp_slang = lp.getLp_slang();
		for (i = 0; i < generatedGa_len; ++i) {
			lp = (((langp_T)generatedGa_data) + (i));
			if (generatedGa_len > /* sound folding */0) {
				lp.setLp_sallang(generatedLp_slang);
			} else {
					for (j = 0; j < generatedGa_len; ++/* find first similar language that does sound folding */j) {
						lp2 = (((langp_T)generatedGa_data) + (j));
						if (generatedGa_len > 0 && /*Error: Function owner not recognized*/strncmp((byte)(generatedSl_name), (byte)(generatedSl_name), (size_t)(true)) == 0) {
							lp.setLp_sallang(generatedLp_slang);
							break;
						} 
					}
			} 
			if (generatedGa_len > /* REP items */0) {
				lp.setLp_replang(generatedLp_slang);
			} else {
					for (j = 0; j < generatedGa_len; ++/* find first similar language that has REP items */j) {
						lp2 = (((langp_T)generatedGa_data) + (j));
						if (generatedGa_len > 0 && /*Error: Function owner not recognized*/strncmp((byte)(generatedSl_name), (byte)(generatedSl_name), (size_t)(true)) == 0) {
							lp.setLp_replang(generatedLp_slang);
							break;
						} 
					}
			} 
		}
		recursive = 0;
		wp.redraw_win_later(40);
		return ret_msg/*
		 * Clear the midword characters for buffer "buf".
		 */;
	}
	public void clear_midword() {
		Object generatedW_s = this.getW_s();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((generatedW_s.getB_spell_ismw()), (false), (true));
		do {
			if ((generatedW_s.getB_spell_ismw_mb()) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedW_s.getB_spell_ismw_mb());
				(generatedW_s.getB_spell_ismw_mb()) = ((Object)0);
			} 
		} while (0/*
		 * Use the "sl_midword" field of language "lp" for buffer "buf".
		 * They add up to any currently used midword characters.
		 */);
	}
	/*
	 * Return TRUE if "p" points to a word character.
	 * As a special case we see "midword" characters as word character when it is
	 * followed by a word character.  This finds they'there but not 'they there'.
	 * Thus this only works properly when past the first character of the word.
	 */
	public int spell_iswordp(Object[] p) {
		/* buffer used */char_u s = new char_u();
		int l;
		int c;
		Object generatedW_s = this.getW_s();
		Object generatedSt_isw = spelltab.getSt_isw();
		if (has_mbyte) {
			l = /*Error: Function owner not recognized*/mb_ptr2len(p);
			s = p;
			if (l == 1) {
				if (generatedW_s.getB_spell_ismw()[/* be quick for ASCII */p]) {
					s = p + /* skip a mid-word character */1;
				} 
			} else {
					c = /*Error: Function owner not recognized*/mb_ptr2char(p);
					if (c < 256 ? generatedW_s.getB_spell_ismw()[c] : (generatedW_s.getB_spell_ismw_mb() != ((Object)0) && ModernizedCProgram.vim_strchr(generatedW_s.getB_spell_ismw_mb(), c) != ((Object)0))) {
						s = p + l;
					} 
			} 
			c = /*Error: Function owner not recognized*/mb_ptr2char(s);
			if (c > 255) {
				return wp.spell_mb_isword_class(ModernizedCProgram.mb_get_class(s));
			} 
			return generatedSt_isw[c];
		} 
		return generatedSt_isw[generatedW_s.getB_spell_ismw()[p] ? p[1] : p[0/*
		 * Return TRUE if "p" points to a word character.
		 * Unlike spell_iswordp() this doesn't check for "midword" characters.
		 */]];
	}
	public int spell_iswordp_nmw(Object p) {
		int c;
		Object generatedSt_isw = spelltab.getSt_isw();
		if (has_mbyte) {
			c = /*Error: Function owner not recognized*/mb_ptr2char(p);
			if (c > 255) {
				return wp.spell_mb_isword_class(ModernizedCProgram.mb_get_class(p));
			} 
			return generatedSt_isw[c];
		} 
		return generatedSt_isw[p/*
		 * Return TRUE if word class indicates a word character.
		 * Only for characters above 255.
		 * Unicode subscript and superscript are not considered word characters.
		 * See also dbcs_class() and utf_class() in mbyte.c.
		 */];
	}
	public int spell_mb_isword_class(int cl) {
		Object generatedW_s = this.getW_s();
		if (generatedW_s.getB_cjk()) {
			return cl == 2 || cl == /* East Asian characters are not considered word characters. */-1024;
		} 
		return cl >= 2 && cl != -1024 && cl != -1024 && cl != 3/*
		 * Return TRUE if "p" points to a word character.
		 * Wide version of spell_iswordp().
		 */;
	}
	/* mode values for find_word */
	/* find word case-folded */
	/* find keep-case word */
	public int spell_iswordp_w(Integer p) {
		int s;
		Object generatedW_s = this.getW_s();
		if (p < 256 ? generatedW_s.getB_spell_ismw()[p] : (generatedW_s.getB_spell_ismw_mb() != ((Object)0) && ModernizedCProgram.vim_strchr(generatedW_s.getB_spell_ismw_mb(), p) != ((Object)0))) {
			s = p + 1;
		} else {
				s = p;
		} 
		if (s > 255) {
			if (enc_utf8) {
				return wp.spell_mb_isword_class(ModernizedCProgram.utf_class(s));
			} 
			if (enc_dbcs) {
				return wp.spell_mb_isword_class(ModernizedCProgram.dbcs_class((int)s >> 8, s & -1024));
			} 
			return 0;
		} 
		Object generatedSt_isw = spelltab.getSt_isw();
		return generatedSt_isw[s/*
		 * Case-fold "str[len]" into "buf[buflen]".  The result is NUL terminated.
		 * Uses the character definitions from the .spl file.
		 * When using a multi-byte 'encoding' the length may change!
		 * Returns FAIL when something wrong.
		 */];
	}
	public Object spell_to_word_end(Object start) {
		char_u p = start;
		while (p != (byte)'\000' && win.spell_iswordp(p)) {
			p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
		}
		return p/*
		 * For Insert mode completion CTRL-X s:
		 * Find start of the word in front of column "startcol".
		 * We don't check if it is badly spelled, with completion we can only change
		 * the word in front of the cursor.
		 * Returns the column number of the word.
		 */;
	}
	public int find_ident_at_pos(Object lnum, Object startcol, Object text, Integer textcol, int find_type) {
		// column where "text" starts, can be NULLchar_u ptr = new char_u();
		// init to shut up GCCint col = 0;
		int i;
		int this_class = 0;
		int prev_class;
		int prevcol;
		// bracket nestingint bn = 0/*
		     * if i == 0: try to find an identifier
		     * if i == 1: try to find any non-white text
		     */;
		file_buffer generatedW_buffer = this.getW_buffer();
		ptr = generatedW_buffer.ml_get_buf(lnum, 0);
		for (i = (find_type & 1) ? 0 : 1; i < 2; ++i/*
			 * 1. skip to start of identifier/text
			 */) {
			col = startcol;
			if (has_mbyte) {
				while (ptr[col] != (byte)'\000') {
					if ((find_type & 4) && ptr[col] == (byte)']') {
						break;
					} 
					this_class = ModernizedCProgram.mb_get_class(ptr + col);
					if (this_class != 0 && (i == 1 || this_class != 1)) {
						break;
					} 
					col += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr + col);
				}
			} else {
					while (ptr[col] != (byte)'\000' && (i == 0 ? !ModernizedCProgram.vim_iswordc(ptr[col]) : ((ptr[col]) == (byte)' ' || (ptr[col]) == (byte)'\t')) && (!(find_type & 4) || ptr[col] != (byte)']')) {
						++col;
					}
			} 
			bn = ptr[col] == (byte)']'/*
				 * 2. Back up to start of identifier/text.
				 */;
			if (has_mbyte) {
				if ((find_type & 4) && ptr[col] == /* Remember class of character under cursor. */(byte)']') {
					this_class = ModernizedCProgram.mb_get_class((char_u)"a");
				} else {
						this_class = ModernizedCProgram.mb_get_class(ptr + col);
				} 
				while (col > 0 && this_class != 0) {
					prevcol = col - 1 - /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr, ptr + col - 1);
					prev_class = ModernizedCProgram.mb_get_class(ptr + prevcol);
					if (this_class != prev_class && (i == 0 || prev_class == 0 || (find_type & 1)) && (!(find_type & 4) || prevcol == 0 || !ModernizedCProgram.find_is_eval_item(ptr + prevcol, prevcol, bn, (true)))) {
						break;
					} 
					col = prevcol;
				}
				if (this_class > 2) {
					this_class = 2;
				} 
				if (!(find_type & 2) || this_class == 2) {
					break;
				} 
			} else {
					while (col > 0 && ((i == 0 ? ModernizedCProgram.vim_iswordc(ptr[col - 1]) : (!((ptr[col - 1]) == (byte)' ' || (ptr[col - 1]) == (byte)'\t') && (!(find_type & 1) || !ModernizedCProgram.vim_iswordc(ptr[col - 1])))) || ((find_type & 4) && col > 1 && ModernizedCProgram.find_is_eval_item(ptr + col - 1, col, bn, (true))))) {
						--col;
					}
					if (!(find_type & 2) || ModernizedCProgram.vim_iswordc(ptr[col])) {
						break;
					} 
			} 
		}
		if (ptr[col] == (byte)'\000' || (i == 0 && (has_mbyte ? this_class != 2 : !ModernizedCProgram.vim_iswordc(ptr[col])))) {
			if ((find_type & 8) == 0) {
				if (find_type & 2) {
					ModernizedCProgram.emsg(((byte)("E348: No string under cursor")));
				} else {
						ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_noident)));
				} 
			} 
			return 0;
		} 
		ptr += col;
		text = ptr;
		if (textcol != ((Object)0)) {
			textcol = col/*
			     * 3. Find the end if the identifier/text.
			     */;
		} 
		bn = 0;
		startcol -= col;
		col = 0;
		if (has_mbyte) {
			this_class = ModernizedCProgram.mb_get_class(ptr);
			while (ptr[col] != (byte)'\000' && ((i == 0 ? ModernizedCProgram.mb_get_class(ptr + col) == this_class : ModernizedCProgram.mb_get_class(ptr + col) != 0) || ((find_type & 4) && col <= (int)startcol && ModernizedCProgram.find_is_eval_item(ptr + col, col, bn, 1)))) {
				col += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr + col);
			}
		} else {
				while ((i == 0 ? ModernizedCProgram.vim_iswordc(ptr[col]) : (ptr[col] != (byte)'\000' && !((ptr[col]) == (byte)' ' || (ptr[col]) == (byte)'\t'))) || ((find_type & 4) && col <= (int)startcol && ModernizedCProgram.find_is_eval_item(ptr + col, col, bn, 1))) {
					++col;
				}
		} 
		return col/*
		 * Prepare for redo of a normal command.
		 */;
	}
	public void ruby_window_free() {
		Object generatedW_ruby_ref = this.getW_ruby_ref();
		if (generatedW_ruby_ref) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_hash_aset(ModernizedCProgram.objtbl, /*Error: Function owner not recognized*/rb_obj_id(()generatedW_ruby_ref), Qnil);
			/*Error: Function owner not recognized*/RDATA(generatedW_ruby_ref).setData(((Object)0));
		} 
	}
	public Object window_new() {
		Object generatedW_ruby_ref = this.getW_ruby_ref();
		if (generatedW_ruby_ref) {
			return ()generatedW_ruby_ref;
		} else {
				 obj = /*Error: Function owner not recognized*/Data_Wrap_Struct(ModernizedCProgram.cVimWindow, 0, 0, win);
				this.setW_ruby_ref((Object)obj);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_hash_aset(ModernizedCProgram.objtbl, /*Error: Function owner not recognized*/rb_obj_id(obj), obj);
				return obj;
		} 
	}
	public window_S get_win(Object obj) {
		win_T win = new win_T();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Data_Get_Struct(obj, , win);
		if (win == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_raise(ModernizedCProgram.eDeletedWindowError, "attempt to refer to deleted window");
		} 
		return win;
	}
	public void syntax_start(Object lnum) {
		synstate_T p = new synstate_T();
		synstate_T last_valid = ((Object)0);
		synstate_T last_min_valid = ((Object)0);
		synstate_T sp = new synstate_T();
		synstate_T prev = ((Object)0);
		linenr_T parsed_lnum = new linenr_T();
		linenr_T first_stored = new linenr_T();
		int dist;
		varnumber_T changedtick = /* remember the last change ID */0;
		ModernizedCProgram.current_sub_char = (byte)'\000'/*
		     * After switching buffers, invalidate current_state.
		     * Also do this when a change was made, the current state may be invalid
		     * then.
		     */;
		Object generatedW_s = this.getW_s();
		file_buffer generatedW_buffer = this.getW_buffer();
		if (ModernizedCProgram.syn_block != generatedW_s || ModernizedCProgram.syn_buf != generatedW_buffer || changedtick != ((ModernizedCProgram.syn_buf).getB_ct_di().getDi_tv().getVval().getV_number())) {
			ModernizedCProgram.invalidate_current_state();
			ModernizedCProgram.syn_buf = generatedW_buffer;
			ModernizedCProgram.syn_block = generatedW_s;
		} 
		changedtick = ((ModernizedCProgram.syn_buf).getB_ct_di().getDi_tv().getVval().getV_number());
		ModernizedCProgram.syn_win = wp/*
		     * Allocate syntax stack when needed.
		     */;
		ModernizedCProgram.syn_stack_alloc();
		if (ModernizedCProgram.syn_block.getB_sst_array() == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.syn_block.setB_sst_lasttick(display_tick/*
		     * If the state of the end of the previous line is useful, store it.
		     */);
		if (((ModernizedCProgram.current_state).getGa_itemsize() != 0) && ModernizedCProgram.current_lnum < lnum && ModernizedCProgram.current_lnum < ModernizedCProgram.syn_buf.getB_ml().getMl_line_count()) {
			(Object)ModernizedCProgram.syn_finish_line(0);
			if (!ModernizedCProgram.current_state_stored) {
				++ModernizedCProgram.current_lnum;
				(Object)ModernizedCProgram.store_current_state();
			} 
			if (ModernizedCProgram.current_lnum != lnum) {
				ModernizedCProgram.invalidate_current_state();
			} 
		} else {
				ModernizedCProgram.invalidate_current_state();
		} 
		Object generatedSst_lnum = p.getSst_lnum();
		Object generatedSst_change_lnum = p.getSst_change_lnum();
		Object generatedSst_next = p.getSst_next();
		if (((ModernizedCProgram.current_state).getGa_itemsize() == 0) && ModernizedCProgram.syn_block.getB_sst_array() != ((Object)0)) {
			for (p = ModernizedCProgram.syn_block.getB_sst_first(); p != ((Object)0); p = generatedSst_next) {
				if (generatedSst_lnum > lnum) {
					break;
				} 
				if (generatedSst_lnum <= lnum && generatedSst_change_lnum == 0) {
					last_valid = p;
					if (generatedSst_lnum >= lnum - ModernizedCProgram.syn_block.getB_syn_sync_minlines()) {
						last_min_valid = p;
					} 
				} 
			}
			if (last_min_valid != ((Object)0)) {
				last_min_valid/*
				     * If "lnum" is before or far beyond a line with a saved state, need to
				     * re-synchronize.
				     */.load_current_state();
			} 
		} 
		if (((ModernizedCProgram.current_state).getGa_itemsize() == 0)) {
			ModernizedCProgram.syn_sync(wp, lnum, last_valid);
			if (ModernizedCProgram.current_lnum == 1) {
				first_stored = /* First line is always valid, no matter "minlines". */1;
			} else {
					first_stored = ModernizedCProgram.current_lnum + ModernizedCProgram.syn_block.getB_syn_sync_minlines();
			} 
		} else {
				first_stored = ModernizedCProgram.current_lnum/*
				     * Advance from the sync point or saved state until the current line.
				     * Save some entries for syncing with later on.
				     */;
		} 
		if (ModernizedCProgram.syn_block.getB_sst_len() <= ModernizedCProgram.Rows) {
			dist = 999999;
		} else {
				dist = ModernizedCProgram.syn_buf.getB_ml().getMl_line_count() / (ModernizedCProgram.syn_block.getB_sst_len() - ModernizedCProgram.Rows) + 1;
		} 
		while (ModernizedCProgram.current_lnum < lnum) {
			ModernizedCProgram.syn_start_line();
			(Object)ModernizedCProgram.syn_finish_line(0);
			++ModernizedCProgram.current_lnum;
			if (ModernizedCProgram.current_lnum >= /* If we parsed at least "minlines" lines or started at a valid
				 * state, the current state is considered valid. */first_stored/* Check if the saved state entry is for the current line and is
				     * equal to the current state.  If so, then validate all saved
				     * states that depended on a change before the parsed line. */) {
				if (prev == ((Object)0)) {
					prev = ModernizedCProgram.syn_stack_find_entry(ModernizedCProgram.current_lnum - 1);
				} 
				if (prev == ((Object)0)) {
					sp = ModernizedCProgram.syn_block.getB_sst_first();
				} else {
						sp = prev;
				} 
				while (sp != ((Object)0) && generatedSst_lnum < ModernizedCProgram.current_lnum) {
					sp = generatedSst_next;
				}
				if (sp != ((Object)0) && generatedSst_lnum == ModernizedCProgram.current_lnum && sp.syn_stack_equal()) {
					parsed_lnum = ModernizedCProgram.current_lnum;
					prev = sp;
					while (sp != ((Object)0) && generatedSst_change_lnum <= parsed_lnum) {
						if (generatedSst_lnum <= lnum) {
							prev = /* valid state before desired line, use this one */sp;
						}  else if (generatedSst_change_lnum == 0/* past saved states depending on change, break here. */) {
							break;
						} 
						sp.setSst_change_lnum(0);
						sp = generatedSst_next;
					}
					prev/* Store the state at this line when it's the first one, the line
						     * where we start parsing, or some distance from the previously
						     * saved state.  But only when parsed at least 'minlines'. */.load_current_state();
				}  else if (prev == ((Object)0) || ModernizedCProgram.current_lnum == lnum || ModernizedCProgram.current_lnum >= generatedSst_lnum + dist) {
					prev = ModernizedCProgram.store_current_state();
				} 
			} 
			ModernizedCProgram.line_breakcheck();
			if (got_int) {
				ModernizedCProgram.current_lnum = lnum;
				break;
			} 
		}
		ModernizedCProgram.syn_start_line();
	}
	public void reset_synblock() {
		Object generatedW_s = this.getW_s();
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedB_s = generatedW_buffer.getB_s();
		if (generatedW_s != generatedB_s) {
			generatedW_s.syntax_clear();
			ModernizedCProgram.vim_free(generatedW_s);
			this.setW_s(generatedB_s);
		} 
	}
	public int syntax_present() {
		Object generatedW_s = this.getW_s();
		return (generatedW_s.getB_syn_patterns().getGa_len() != 0 || generatedW_s.getB_syn_clusters().getGa_len() != 0 || generatedW_s.getB_keywtab().getHt_used() > 0 || generatedW_s.getB_keywtab_ic().getHt_used() > 0);/* expand ":syn" sub-commands */
	}
	public int syn_get_id(long lnum, Object col, int trans, Integer spellp, int keep_state) {
		file_buffer generatedW_buffer = this.getW_buffer();
		if (generatedW_buffer != /* return: can do spell checking *//* keep state of char at "col" *//* When the position is not after the current position and in the same
		     * line of the same buffer, need to restart parsing. */ModernizedCProgram.syn_buf || lnum != ModernizedCProgram.current_lnum || col < ModernizedCProgram.current_col) {
			wp.syntax_start(lnum);
		}  else if (generatedW_buffer == ModernizedCProgram.syn_buf && lnum == ModernizedCProgram.current_lnum && col > ModernizedCProgram.current_col/* next_match may not be correct when moving around, e.g. with the
			 * "skip" expression in searchpair() */) {
			ModernizedCProgram.next_match_idx = -1;
		} 
		(Object)ModernizedCProgram.get_syntax_attr(col, spellp, keep_state);
		return (trans ? ModernizedCProgram.current_trans_id : ModernizedCProgram.current_id/*
		 * Get extra information about the syntax item.  Must be called right after
		 * get_syntax_attr().
		 * Stores the current item sequence nr in "*seqnrp".
		 * Returns the current flags.
		 */);
	}
	/* remove transparency */
	/*
	 * Function called to get folding level for line "lnum" in window "wp".
	 */
	public int syn_get_foldlevel(long lnum) {
		int level = 0;
		int i;
		Object generatedW_s = this.getW_s();
		if (generatedW_s.getB_syn_folditems() != /* Return quickly when there are no fold items at all. */0 && !generatedW_s.getB_syn_error() && !generatedW_s.getB_syn_slow()) {
			wp.syntax_start(lnum);
			for (i = 0; i < ModernizedCProgram.current_state.getGa_len(); ++i) {
				if (((stateitem_T)(ModernizedCProgram.current_state.getGa_data()))[i].getSi_flags() & -1024) {
					++level;
				} 
			}
		} 
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_fdn = generatedW_onebuf_opt.getWo_fdn();
		if (level > generatedWo_fdn) {
			level = generatedWo_fdn;
			if (level < 0) {
				level = 0;
			} 
		} 
		return level;
	}
	public void win_redr_status(int ignore_pum) {
		int row;
		char_u p = new char_u();
		int len;
		int fillchar;
		int attr;
		int this_ru_col;
		int busy = 0;
		// It's possible to get here recursively when 'statusline' (indirectly)
		// invokes ":redrawstatus".  Simply ignore the call then.if (busy) {
			return /*Error: Unsupported expression*/;
		} 
		busy = 1;
		this.setW_redr_status(0);
		int generatedW_status_height = this.getW_status_height();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_stl = generatedW_onebuf_opt.getWo_stl();
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedWo_pvw = generatedW_onebuf_opt.getWo_pvw();
		int generatedB_p_ro = generatedW_buffer.getB_p_ro();
		int generatedW_width = this.getW_width();
		int generatedW_winrow = this.getW_winrow();
		Object generatedW_winbar_height = this.getW_winbar_height();
		int generatedW_height = this.getW_height();
		int generatedW_wincol = this.getW_wincol();
		if (generatedW_status_height == 0) {
			redraw_cmdline = 1;
		}  else if (!/*Error: Function owner not recognized*/redrawing() || (!ignore_pum && ModernizedCProgram.pum_visible())) {
			this.setW_redr_status(1);
		}  else if (p_stl != (byte)'\000' || generatedWo_stl != (byte)'\000') {
			wp.redraw_custom_statusline();
		} else {
				fillchar = /*Error: Function owner not recognized*/fillchar_status(attr, wp);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/get_trans_bufname(generatedW_buffer);
				p = ModernizedCProgram.NameBuff;
				len = (int)/*Error: Function owner not recognized*/strlen((byte)(p));
				if (generatedW_buffer.bt_help() || generatedWo_pvw || generatedW_buffer.bufIsChanged() || generatedB_p_ro) {
					(p + len++) = (byte)' ';
				} 
				if (generatedW_buffer.bt_help()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p + len), (byte)(((byte)("[Help]"))));
					len += (int)/*Error: Function owner not recognized*/strlen((byte)(p + len));
				} 
				if (generatedWo_pvw) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p + len), (byte)(((byte)("[Preview]"))));
					len += (int)/*Error: Function owner not recognized*/strlen((byte)(p + len));
				} 
				if (generatedW_buffer.bufIsChanged()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p + len), (byte)("[+]"));
					len += 3;
				} 
				if (generatedB_p_ro) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p + len), (byte)(((byte)("[RO]"))));
					len += (int)/*Error: Function owner not recognized*/strlen((byte)(p + len));
				} 
				this_ru_col = ModernizedCProgram.ru_col - (Columns - generatedW_width);
				if (this_ru_col < (generatedW_width + 1) / 2) {
					this_ru_col = (generatedW_width + 1) / 2;
				} 
				if (this_ru_col <= 1) {
					p = (char_u)"<";
					len = 1;
				}  else if (has_mbyte) {
					int clen = 0;
					int i;
					clen = ModernizedCProgram.mb_string2cells(p, -1);
					for (i = 0; p[i] != (byte)'\000' && clen >= this_ru_col - 1; i += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p + i)) {
						clen -= /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p + i);
					}
					len = clen;
					if (i > 0) {
						p = p + i - 1;
						p = (byte)'<';
						++len;
					} 
				}  else if (len > this_ru_col - 1) {
					p += len - (this_ru_col - 1);
					p = (byte)'<';
					len = this_ru_col - 1;
				} 
				row = (generatedW_winrow + generatedW_winbar_height) + generatedW_height;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_puts(p, row, generatedW_wincol, attr);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill(row, row + 1, len + generatedW_wincol, this_ru_col + generatedW_wincol, fillchar, fillchar, attr);
				if (/*Error: Function owner not recognized*/get_keymap_str(wp, (char_u)"<%s>", ModernizedCProgram.NameBuff, 1024) && (int)(this_ru_col - len) > (int)(/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.NameBuff)) + 1)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_puts(ModernizedCProgram.NameBuff, row, (int)(this_ru_col - /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.NameBuff)) - 1 + generatedW_wincol), attr);
				} 
				wp.win_redr_ruler(1, ignore_pum);
		} 
		int generatedW_vsep_width = this.getW_vsep_width();
		if (generatedW_vsep_width != 0 && generatedW_status_height != 0 && /*Error: Function owner not recognized*/redrawing()) {
			if (/*Error: Function owner not recognized*/stl_connected(wp)) {
				fillchar = /*Error: Function owner not recognized*/fillchar_status(attr, wp);
			} else {
					fillchar = /*Error: Function owner not recognized*/fillchar_vsep(attr);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_putchar(fillchar, (generatedW_winrow + generatedW_winbar_height) + generatedW_height, (generatedW_wincol + generatedW_width), attr);
		} 
		busy = 0/*
		 * Redraw the status line according to 'statusline' and take care of any
		 * errors encountered.
		 */;
	}
	public void redraw_custom_statusline() {
		int entered = 0;
		int saved_did_emsg = ModernizedCProgram.did_emsg;
		// When called recursively return.  This can happen when the statusline
		// contains an expression that triggers a redraw.if (entered) {
			return /*Error: Unsupported expression*/;
		} 
		entered = 1;
		ModernizedCProgram.did_emsg = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_redr_custom(wp, 0);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_stl = generatedW_onebuf_opt.getWo_stl();
		if (ModernizedCProgram.did_emsg) {
			ModernizedCProgram.set_string_option_direct((char_u)"statusline", -1, (char_u)"", 1 | (generatedWo_stl != (byte)'\000' ? 4 : 2), -5);
		} 
		// When there is an error disable the statusline, otherwise the
		ModernizedCProgram.did_emsg |=  saved_did_emsg;
		entered = 0/*
		 * Show current status info in ruler and various other places
		 * If always is FALSE, only show ruler if position has changed.
		 */;
	}
	/*
	 * Based on the current value of curwin->w_topline, transfer a screenfull
	 * of stuff from Filemem to ScreenLines[], and update curwin->w_botline.
	 * Return OK when the screen was updated, FAIL if it was not done.
	 */
	public void win_redr_ruler(int always, int ignore_pum) {
		char_u[] buffer = new char_u();
		int row;
		int fillchar;
		int attr;
		int empty_line = 0;
		colnr_T virtcol = new colnr_T();
		int i;
		size_t len = new size_t();
		int o;
		int this_ru_col;
		int off = 0;
		int width;
		// If 'ruler' off or redrawing disabled, don't do anythingif (!p_ru) {
			return /*Error: Unsupported expression*/;
		} 
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedLnum > generatedMl_line_count) {
			return /*Error: Unsupported expression*/;
		} 
		// the (long) mode message.if (wp == ModernizedCProgram.lastwin && ModernizedCProgram.lastwin.getW_status_height() == 0) {
			if (edit_submode != ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		// Except when the popup menu will be redrawn anyway.if (!ignore_pum && ModernizedCProgram.pum_visible()) {
			return /*Error: Unsupported expression*/;
		} 
		if (p_ruf) {
			int save_called_emsg = ModernizedCProgram.called_emsg;
			ModernizedCProgram.called_emsg = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_redr_custom(wp, 1);
			if (ModernizedCProgram.called_emsg) {
				ModernizedCProgram.set_string_option_direct((char_u)"rulerformat", -1, (char_u)"", 1, -5);
			} 
			ModernizedCProgram.called_emsg |=  save_called_emsg;
			return /*Error: Unsupported expression*/;
		} 
		if (!(State & /*
		     * Check if not in Insert mode and the line is empty (will show "0-1").
		     */-1024) && generatedW_buffer.ml_get_buf(generatedLnum, 0) == (byte)'\000') {
			empty_line = 1/*
			     * Only draw the ruler when something changed.
			     */;
		} 
		wp.validate_virtcol_win();
		Object generatedCol = generatedW_cursor.getCol();
		Object generatedW_virtcol = this.getW_virtcol();
		Object generatedW_ru_virtcol = this.getW_ru_virtcol();
		Object generatedColadd = generatedW_cursor.getColadd();
		Object generatedW_topline = this.getW_topline();
		Object generatedW_ru_topline = this.getW_ru_topline();
		Object generatedW_ru_line_count = this.getW_ru_line_count();
		Object generatedW_topfill = this.getW_topfill();
		Object generatedW_ru_topfill = this.getW_ru_topfill();
		Object generatedW_ru_empty = this.getW_ru_empty();
		int generatedW_status_height = this.getW_status_height();
		int generatedW_winrow = this.getW_winrow();
		Object generatedW_winbar_height = this.getW_winbar_height();
		int generatedW_height = this.getW_height();
		int generatedW_wincol = this.getW_wincol();
		int generatedW_width = this.getW_width();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_list = generatedW_onebuf_opt.getWo_list();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (redraw_cmdline || always || generatedLnum != generatedLnum || generatedCol != generatedCol || generatedW_virtcol != generatedW_ru_virtcol || generatedColadd != generatedColadd || generatedW_topline != generatedW_ru_topline || generatedMl_line_count != generatedW_ru_line_count || generatedW_topfill != generatedW_ru_topfill || empty_line != generatedW_ru_empty) {
			ModernizedCProgram.cursor_off();
			if (generatedW_status_height) {
				row = (generatedW_winrow + generatedW_winbar_height) + generatedW_height;
				fillchar = /*Error: Function owner not recognized*/fillchar_status(attr, wp);
				off = generatedW_wincol;
				width = generatedW_width;
			} else {
					row = ModernizedCProgram.Rows - 1;
					fillchar = (byte)' ';
					attr = 0;
					width = Columns;
					off = 0;
			} 
			virtcol = generatedW_virtcol;
			if (generatedWo_list && lcs_tab1 == (byte)'\000') {
				generatedW_onebuf_opt.setWo_list(0);
				ModernizedCProgram.getvvcol(wp, generatedW_cursor, ((Object)0), virtcol, ((Object)0));
				generatedW_onebuf_opt.setWo_list(1/*
					 * Some sprintfs return the length, some return a pointer.
					 * To avoid portability problems we use strlen() here.
					 */);
			} 
			ModernizedCProgram.vim_snprintf((byte)buffer, 70, "%ld,", (generatedMl_flags & 1) ? -1024 : (long)(generatedLnum));
			len = /*Error: Function owner not recognized*/strlen((byte)(buffer));
			ModernizedCProgram.col_print(buffer + len, 70 - len, empty_line ? 0 : (int)generatedCol + 1, (int)virtcol + 1/*
				 * Add a "50%" if there is room for it.
				 * On the last line, don't print in the last column (scrolls the
				 * screen up on some terminals).
				 */);
			i = (int)/*Error: Function owner not recognized*/strlen((byte)(buffer));
			wp.get_rel_pos(buffer + i + 1, 70 - i - 1);
			o = i + ModernizedCProgram.vim_strsize(buffer + i + 1);
			if (generatedW_status_height == 0) {
				++o;
			} 
			this_ru_col = ModernizedCProgram.ru_col - (Columns - width);
			if (this_ru_col < 0) {
				this_ru_col = 0;
			} 
			if (this_ru_col < (width + 1) / 2) {
				this_ru_col = (width + 1) / 2;
			} 
			if (this_ru_col + o < width) {
				while (this_ru_col + o < width && 70 > i + 4) {
					if (has_mbyte) {
						i += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fillchar, buffer + i);
					} else {
							buffer[i++] = fillchar;
					} 
					++o;
				}
				wp.get_rel_pos(buffer + i, 70 - i);
			} 
			if (has_mbyte) {
				o = 0;
				for (i = 0; buffer[i] != (byte)'\000'; i += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(buffer + i)) {
					o += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(buffer + i);
					if (this_ru_col + o > width) {
						buffer[i] = (byte)'\000';
						break;
					} 
				}
			}  else if (this_ru_col + (int)/*Error: Function owner not recognized*/strlen((byte)(buffer)) > width) {
				buffer[width - this_ru_col] = (byte)'\000';
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_puts(buffer, row, this_ru_col + off, attr);
			i = redraw_cmdline;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill(row, row + 1, this_ru_col + off + (int)/*Error: Function owner not recognized*/strlen((byte)(buffer)), (int)(off + width), fillchar, fillchar, attr);
			redraw_cmdline = i;
			this.setW_ru_cursor(generatedW_cursor);
			this.setW_ru_virtcol(generatedW_virtcol);
			this.setW_ru_empty(empty_line);
			this.setW_ru_topline(generatedW_topline);
			this.setW_ru_line_count(generatedMl_line_count);
			this.setW_ru_topfill(generatedW_topfill);
		} 
	}
	public int text_to_screenline(Object text, int col) {
		int off = (int)(current_ScreenLine - ScreenLines);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_rl = generatedW_onebuf_opt.getWo_rl();
		int generatedW_width = this.getW_width();
		if (has_mbyte) {
			int cells;
			int u8c;
			int[] u8cc = new int[6];
			int i;
			int idx;
			int c_len;
			char_u p = new char_u();
			int prev_c = 0;
			int prev_c1 = 0;
			if (generatedWo_rl) {
				idx = off;
			} else {
					idx = off + col;
			} 
			for (p = text; p != (byte)'\000'; /*Error: Unsupported expression*/) {
				cells = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
				c_len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
				if (col + cells > generatedW_width - (generatedWo_rl ? col : 0)) {
					break;
				} 
				ScreenLines[idx] = p;
				if (enc_utf8) {
					u8c = ModernizedCProgram.utfc_ptr2char(p, u8cc);
					if (p < -1024 && u8cc[0] == 0) {
						ScreenLinesUC[idx] = 0;
						prev_c = u8c;
					} else {
							if (p_arshape && !p_tbidi && (((u8c) & -1024) == -1024)) {
								int pc;
								int pc1;
								int nc;
								int[] pcc = new int[6];
								int firstbyte = p;
								if (generatedWo_rl) {
									pc = prev_c;
									pc1 = prev_c1;
									nc = ModernizedCProgram.utf_ptr2char(p + c_len);
									prev_c1 = u8cc[0];
								} else {
										pc = ModernizedCProgram.utfc_ptr2char(p + c_len, pcc);
										nc = prev_c;
										pc1 = pcc[0];
								} 
								prev_c = u8c;
								u8c = ModernizedCProgram.arabic_shape(u8c, firstbyte, u8cc[0], pc, pc1, nc);
								ScreenLines[idx] = firstbyte;
							} else {
									prev_c = u8c;
							} 
							ScreenLinesUC[idx] = u8c;
							for (i = 0; i < Screen_mco; ++i) {
								ModernizedCProgram.ScreenLinesC[i][idx] = u8cc[i];
								if (u8cc[i] == 0) {
									break;
								} 
							}
					} 
					if (cells > 1) {
						ScreenLines[idx + 1] = 0;
					} 
				}  else if (enc_dbcs == 9932 && p == -1024) {
					ScreenLines2[idx] = p[1];
				}  else if (cells > 1) {
					ScreenLines[idx + 1] = p[1];
				} 
				col += cells;
				idx += cells;
				p += c_len;
			}
		} else {
				int len = (int)/*Error: Function owner not recognized*/strlen((byte)(text));
				if (len > generatedW_width - col) {
					len = generatedW_width - col;
				} 
				if (len > 0) {
					if (generatedWo_rl) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(current_ScreenLine), (byte)(text), (size_t)(len));
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(current_ScreenLine + col), (byte)(text), (size_t)(len));
					} 
					col += len;
				} 
		} 
		return col;
	}
	/*
	 * Draw the window toolbar.
	 */
	public void redraw_win_toolbar() {
		vimmenu_T menu = new vimmenu_T();
		int item_idx = 0;
		int item_count = 0;
		int col = 0;
		int next_col;
		int off = (int)(current_ScreenLine - ScreenLines);
		int fill_attr = ModernizedCProgram.syn_name2attr((char_u)"ToolbarLine");
		int button_attr = ModernizedCProgram.syn_name2attr((char_u)"ToolbarButton");
		Object generatedW_winbar_items = this.getW_winbar_items();
		ModernizedCProgram.vim_free(generatedW_winbar_items);
		Object generatedNext = menu.getNext();
		Object generatedW_winbar = this.getW_winbar();
		for (menu = generatedW_winbar.getChildren(); menu != ((Object)0); menu = generatedNext) {
			++item_count;
		}
		this.setW_winbar_items((winbar_item_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/ * (item_count + 1)));
		int generatedW_width = this.getW_width();
		Object generatedName = menu.getName();
		// TODO: use fewer spaces if there is not enough roomfor (menu = generatedW_winbar.getChildren(); menu != ((Object)0) && col < generatedW_width; menu = generatedNext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/space_to_screenline(off + col, fill_attr);
			if (++col >= generatedW_width) {
				break;
			} 
			if (col > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/space_to_screenline(off + col, fill_attr);
				if (++col >= generatedW_width) {
					break;
				} 
			} 
			generatedW_winbar_items[item_idx].setWb_startcol(col);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/space_to_screenline(off + col, button_attr);
			if (++col >= generatedW_width) {
				break;
			} 
			next_col = wp.text_to_screenline(generatedName, col);
			while (col < next_col) {
				ScreenAttrs[off + col] = button_attr;
				++col;
			}
			generatedW_winbar_items[item_idx].setWb_endcol(col);
			generatedW_winbar_items[item_idx].setWb_menu(menu);
			++item_idx;
			if (col >= generatedW_width) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/space_to_screenline(off + col, button_attr);
			++col;
		}
		while (col < generatedW_width) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/space_to_screenline(off + col, fill_attr);
			++col;
		}
		// end marker// end markergeneratedW_winbar_items[item_idx].setWb_menu(((Object)0));
		int generatedW_winrow = this.getW_winrow();
		int generatedW_wincol = this.getW_wincol();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_line(generatedW_winrow, generatedW_wincol, (int)generatedW_width, (int)generatedW_width, 0);
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
	 * drawscreen.c: Code for updating all the windows on the screen.
	 * This is the top level, drawline.c is the middle and screen.c the lower
	 * level.
	 *
	 * update_screen() is the function that updates all windows and status lines.
	 * It is called form the main loop when must_redraw is non-zero.  It may be
	 * called from other places when an immediate screen update is needed.
	 *
	 * The part of the buffer that is displayed in a window is set with:
	 * - w_topline (first buffer line in window)
	 * - w_topfill (filler lines above the first line)
	 * - w_leftcol (leftmost window cell in window),
	 * - w_skipcol (skipped window cells of first line)
	 *
	 * Commands that only move the cursor around in a window, do not need to take
	 * action to update the display.  The main loop will check if w_topline is
	 * valid and update it (scroll the window) when needed.
	 *
	 * Commands that scroll a window change w_topline and must call
	 * check_cursor() to move the cursor into the visible part of the window, and
	 * call redraw_later(VALID) to have the window displayed by update_screen()
	 * later.
	 *
	 * Commands that change text in the buffer must call changed_bytes() or
	 * changed_lines() to mark the area that changed and will require updating
	 * later.  The main loop will call update_screen(), which will update each
	 * window that shows the changed buffer.  This assumes text above the change
	 * can remain displayed as it is.  Text after the change may need updating for
	 * scrolling, folding and syntax highlighting.
	 *
	 * Commands that change how a window is displayed (e.g., setting 'list') or
	 * invalidate the contents of a window in another way (e.g., change fold
	 * settings), must call redraw_later(NOT_VALID) to have the whole window
	 * redisplayed by update_screen() later.
	 *
	 * Commands that change how a buffer is displayed (e.g., setting 'tabstop')
	 * must call redraw_curbuf_later(NOT_VALID) to have all the windows for the
	 * buffer redisplayed by update_screen() later.
	 *
	 * Commands that change highlighting and possibly cause a scroll too must call
	 * redraw_later(SOME_VALID) to update the whole window but still use scrolling
	 * to avoid redrawing everything.  But the length of displayed lines must not
	 * change, use NOT_VALID then.
	 *
	 * Commands that move the window position must call redraw_later(NOT_VALID).
	 * TODO: should minimize redrawing by scrolling when possible.
	 *
	 * Commands that change everything (e.g., resizing the screen) must call
	 * redraw_all_later(NOT_VALID) or redraw_all_later(CLEAR).
	 *
	 * Things that are handled indirectly:
	 * - When messages scroll the screen up, msg_scrolled will be set and
	 *   update_screen() called to redraw.
	 */
	public void win_update() {
		file_buffer generatedW_buffer = this.getW_buffer();
		buf_T buf = generatedW_buffer;
		int type;
		// Below last row of the top area that needsint top_end = 0;
		// updating.  0 when no top area updating.
		// first row of the mid area that needsint mid_start = 999;
		// updating.  999 when no mid area updating.
		// Below last row of the mid area that needsint mid_end = 0;
		// updating.  0 when no mid area updating.
		// first row of the bot area that needsint bot_start = 999;
		// updating.  999 when no bot area updating
		// TRUE when scrolled down whenint scrolled_down = 0;
		// w_topline got smaller a bit
		// redraw above mod_topint top_to_mod = 0;
		// current window row to displayint row;
		// current buffer lnum to displaylinenr_T lnum = new linenr_T();
		// current index in w_lines[]int idx;
		// starting row of the current lineint srow;
		// if TRUE, we hit the end of the fileint eof = 0;
		// if TRUE, we finished the last lineint didline = 0;
		int i;
		long j;
		// being called recursivelyint recursive = 0;
		Object generatedW_botline = this.getW_botline();
		int old_botline = generatedW_botline;
		long fold_count;
		// remember what happened to the previous line, to know if// check_visual_highlight() can be used
		// didn't update a line// updated a normal line// updated a folded lineint did_update = 1;
		// last parsed text linelinenr_T syntax_last_parsed = 0;
		linenr_T mod_top = 0;
		linenr_T mod_bot = 0;
		int save_got_int;
		proftime_T syntax_tm = new proftime_T();
		int generatedW_redr_type = this.getW_redr_type();
		type = generatedW_redr_type;
		if (type == 40) {
			this.setW_redr_status(1);
			this.setW_lines_valid(0);
		} 
		int generatedW_height = this.getW_height();
		Object generatedW_winbar_height = (wp).getW_winbar_height();
		// Window is zero-height: nothing to draw.if (generatedW_height + generatedW_winbar_height == 0) {
			this.setW_redr_type(0);
			return /*Error: Unsupported expression*/;
		} 
		int generatedW_width = this.getW_width();
		// Window is zero-width: Only need to draw the separator.if (generatedW_width == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/draw_vsep_win(wp, 0);
			this.setW_redr_type(0);
			return /*Error: Unsupported expression*/;
		} 
		// Draw the window toolbar, if there is one.// Draw the window toolbar, if there is one.ModernizedCProgram.init_search_hl(wp, screen_search_hl);
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		// Force redraw when width of 'number' or 'relativenumber' column// changes.// Force redraw when width of 'number' or 'relativenumber' column// changes.i = (generatedWo_nu || generatedWo_rnu) ? /*Error: Function owner not recognized*/number_width(wp) : 0;
		Object generatedW_nrwidth = this.getW_nrwidth();
		int generatedB_mod_set = buf.getB_mod_set();
		long generatedB_mod_xlines = buf.getB_mod_xlines();
		Object generatedW_redraw_top = this.getW_redraw_top();
		Object generatedW_redraw_bot = this.getW_redraw_bot();
		Object generatedB_mod_top = buf.getB_mod_top();
		Object generatedB_s = buf.getB_s();
		Object generatedB_mod_bot = buf.getB_mod_bot();
		Object generatedRm = screen_search_hl.getRm();
		Object generatedW_match_head = this.getW_match_head();
		 generatedMatch = cur.getMatch();
		Object generatedRegprog = generatedMatch.getRegprog();
		matchitem generatedNext = cur.getNext();
		Object generatedW_topline = this.getW_topline();
		int generatedW_lines_valid = this.getW_lines_valid();
		w_line[] generatedW_lines = this.getW_lines();
		if (generatedW_nrwidth != i) {
			type = 40;
			this.setW_nrwidth(i);
		}  else if (generatedB_mod_set && generatedB_mod_xlines != 0 && generatedW_redraw_top != 0) {
			type = 40;
		} else {
				mod_top = generatedW_redraw_top;
				if (generatedW_redraw_bot != 0) {
					mod_bot = generatedW_redraw_bot + 1;
				} else {
						mod_bot = 0;
				} 
				if (generatedB_mod_set) {
					if (mod_top == 0 || mod_top > generatedB_mod_top) {
						mod_top = generatedB_mod_top;
						if (wp.syntax_present()) {
							mod_top -= generatedB_s.getB_syn_sync_linebreaks();
							if (mod_top < 1) {
								mod_top = 1;
							} 
						} 
					} 
					if (mod_bot == 0 || mod_bot < generatedB_mod_bot) {
						mod_bot = generatedB_mod_bot;
					} 
					if (generatedRm.getRegprog() != ((Object)0) && generatedRm.getRegprog().re_multiline()) {
						top_to_mod = 1;
					} else {
							matchitem_T cur = generatedW_match_head;
							while (cur != ((Object)0)) {
								if (generatedRegprog != ((Object)0) && generatedRegprog.re_multiline()) {
									top_to_mod = 1;
									break;
								} 
								cur = generatedNext;
							}
					} 
				} 
				if (mod_top != 0 && wp.hasAnyFolding()) {
					linenr_T lnumt = new linenr_T();
					linenr_T lnumb = new linenr_T();
					lnumt = generatedW_topline;
					lnumb = LONG_MAX;
					for (i = 0; i < generatedW_lines_valid; ++i) {
						if (generatedW_lines[i].getWl_valid()) {
							if (generatedW_lines[i].getWl_lastlnum() < mod_top) {
								lnumt = generatedW_lines[i].getWl_lastlnum() + 1;
							} 
							if (lnumb == LONG_MAX && generatedW_lines[i].getWl_lnum() >= mod_bot) {
								lnumb = generatedW_lines[i].getWl_lnum();
								if (/*Error: Function owner not recognized*/compute_foldcolumn(wp, 0) > 0) {
									++lnumb;
								} 
							} 
						} 
					}
					(Object)ModernizedCProgram.hasFoldingWin(wp, mod_top, mod_top, ((Object)0), 1, ((Object)0));
					if (mod_top > lnumt) {
						mod_top = lnumt;
					} 
					--mod_bot;
					(Object)ModernizedCProgram.hasFoldingWin(wp, mod_bot, ((Object)0), mod_bot, 1, ((Object)0));
					++mod_bot;
					if (mod_bot < lnumb) {
						mod_bot = lnumb;
					} 
				} 
				if (mod_top != 0 && mod_top < generatedW_topline) {
					if (mod_bot > generatedW_topline) {
						mod_top = generatedW_topline;
					}  else if (wp.syntax_present()) {
						top_end = 1;
					} 
				} 
				if (mod_top != 0 && generatedB_mod_xlines != 0 && generatedWo_nu) {
					mod_bot = LONG_MAX;
				} 
		} 
		// reset for next time// reset for next timethis.setW_redraw_top(0);
		this.setW_redraw_bot(0)// When only displaying the lines at the top, set top_end.  Used when;// When only displaying the lines at the top, set top_end.  Used when
		int generatedW_upd_rows = this.getW_upd_rows();
		// window has scrolled down for msg_scrolled.if (type == 30) {
			j = 0;
			for (i = 0; i < generatedW_lines_valid; ++i) {
				j += generatedW_lines[i].getWl_size();
				if (j >= generatedW_upd_rows) {
					top_end = j;
					break;
				} 
			}
			if (top_end == 0) {
				type = 40;
			} else {
					type = 10;
			} 
		} 
		// set "screen_cleared" to TRUE.  The special value MAYBE (which is still// non-zero and thus not FALSE) will indicate that screenclear() was not// called.if (screen_cleared) {
			screen_cleared = 2;
		} 
		Object generatedW_botfill = this.getW_botfill();
		Object generatedW_old_botfill = this.getW_old_botfill();
		Object generatedW_topfill = this.getW_topfill();
		Object generatedW_old_topfill = this.getW_old_topfill();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		Object generatedW_popup_flags = (wp).getW_popup_flags();
		// 2: wp->w_topline is below wp->w_lines[0].wl_lnum: may scroll up// 3: wp->w_topline is wp->w_lines[0].wl_lnum: find first entry in//    w_lines[] that needs updating.if ((type == 10 || type == 35 || type == 20 || type == 25) && !generatedW_botfill && !generatedW_old_botfill) {
			if (mod_top != 0 && generatedW_topline == mod_top) {
			}  else if (generatedW_lines[0].getWl_valid() && (generatedW_topline < generatedW_lines[0].getWl_lnum() || (generatedW_topline == generatedW_lines[0].getWl_lnum() && generatedW_topfill > generatedW_old_topfill))) {
				if (wp.hasAnyFolding()) {
					linenr_T ln = new linenr_T();
					j = 0;
					for (ln = generatedW_topline; ln < generatedW_lines[0].getWl_lnum(); ++ln) {
						++j;
						if (j >= generatedW_height - 2) {
							break;
						} 
						(Object)ModernizedCProgram.hasFoldingWin(wp, ln, ((Object)0), ln, 1, ((Object)0));
					}
				} else {
						j = generatedW_lines[0].getWl_lnum() - generatedW_topline;
				} 
				if (j < generatedW_height - 2) {
					i = wp.plines_m_win(generatedW_topline, generatedW_lines[0].getWl_lnum() - 1);
					if (generatedW_lines[0].getWl_lnum() != generatedW_topline) {
						i += wp.diff_check_fill(generatedW_lines[0].getWl_lnum()) - generatedW_old_topfill;
					} 
					if (i < generatedW_height - 2) {
						if (i > 0) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/check_for_delay(0);
						} 
						if (/*Error: Function owner not recognized*/win_ins_lines(wp, 0, i, 0, wp == ModernizedCProgram.firstwin) == 1) {
							if (generatedW_lines_valid != 0) {
								top_end = i;
								scrolled_down = 1;
								if ((generatedW_lines_valid += j) > generatedW_height) {
									this.setW_lines_valid(generatedW_height);
								} 
								for (idx = generatedW_lines_valid; idx - j >= 0; idx--) {
									generatedW_lines[idx] = generatedW_lines[idx - j];
								}
								while (idx >= 0) {
									generatedW_lines[idx--].setWl_valid(0);
								}
							} 
						} else {
								mid_start = 0;
						} 
					} else {
							mid_start = 0;
					} 
				} else {
						mid_start = 0;
				} 
			} else {
					j = -1;
					row = 0;
					for (i = 0; i < generatedW_lines_valid; i++) {
						if (generatedW_lines[i].getWl_valid() && generatedW_lines[i].getWl_lnum() == generatedW_topline) {
							j = i;
							break;
						} 
						row += generatedW_lines[i].getWl_size();
					}
					if (j == -1) {
						mid_start = 0;
					} else {
							if (generatedW_lines[0].getWl_lnum() == generatedW_topline) {
								row += generatedW_old_topfill;
							} else {
									row += wp.diff_check_fill(generatedW_topline);
							} 
							row -= generatedW_topfill;
							if (row > 0) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/check_for_delay(0);
								if (/*Error: Function owner not recognized*/win_del_lines(wp, 0, row, 0, wp == ModernizedCProgram.firstwin, 0) == 1) {
									bot_start = generatedW_height - row;
								} else {
										mid_start = 0;
								} 
							} 
							if ((row == 0 || bot_start < 999) && generatedW_lines_valid != 0) {
								bot_start = 0;
								idx = 0;
								for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
									generatedW_lines[idx] = generatedW_lines[j];
									if (row > 0 && bot_start + row + (int)generatedW_lines[j].getWl_size() > generatedW_height) {
										this.setW_lines_valid(idx + 1);
										break;
									} 
									bot_start += generatedW_lines[idx++].getWl_size();
									if (++j >= generatedW_lines_valid) {
										this.setW_lines_valid(idx);
										break;
									} 
								}
								if (generatedWo_diff && bot_start > 0) {
									generatedW_lines[0].setWl_size(wp.plines_win_nofill(generatedW_topline, 1) + generatedW_topfill);
								} 
							} 
					} 
			} 
			if (mid_start == 0) {
				mid_end = generatedW_height;
				if ((ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) && !(generatedW_popup_flags != 0)) {
					if (screen_cleared != 1) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screenclear();
					} 
					if (redraw_tabline) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/draw_tabline();
					} 
				} 
			} 
			if (screen_cleared == 1) {
				must_redraw = 0;
			} 
		} else {
				mid_start = 0;
				mid_end = generatedW_height;
		} 
		if (type == 35) {
			mid_start = 0;
			mid_end = generatedW_height;
			type = 40;
		} 
		Object generatedW_old_cursor_lnum = this.getW_old_cursor_lnum();
		byte generatedW_old_visual_mode = this.getW_old_visual_mode();
		Object generatedW_old_visual_lnum = this.getW_old_visual_lnum();
		Object generatedW_old_visual_col = this.getW_old_visual_col();
		Object generatedWo_lbr = generatedW_onebuf_opt.getWo_lbr();
		Object generatedW_old_cursor_fcol = this.getW_old_cursor_fcol();
		Object generatedW_old_cursor_lcol = this.getW_old_cursor_lcol();
		int generatedW_valid = this.getW_valid();
		// check if we are updating or removing the inverted partif ((VIsual_active && buf == generatedW_buffer) || (generatedW_old_cursor_lnum != 0 && type != 40)) {
			linenr_T from = new linenr_T();
			linenr_T to = new linenr_T();
			if (VIsual_active) {
				if (VIsual_active && (VIsual_mode != generatedW_old_visual_mode || type == 25)) {
					if (ModernizedCProgram.curwin.getW_cursor().getLnum() < ModernizedCProgram.VIsual.getLnum()) {
						from = ModernizedCProgram.curwin.getW_cursor().getLnum();
						to = ModernizedCProgram.VIsual.getLnum();
					} else {
							from = ModernizedCProgram.VIsual.getLnum();
							to = ModernizedCProgram.curwin.getW_cursor().getLnum();
					} 
					if (generatedW_old_cursor_lnum < from) {
						from = generatedW_old_cursor_lnum;
					} 
					if (generatedW_old_cursor_lnum > to) {
						to = generatedW_old_cursor_lnum;
					} 
					if (generatedW_old_visual_lnum < from) {
						from = generatedW_old_visual_lnum;
					} 
					if (generatedW_old_visual_lnum > to) {
						to = generatedW_old_visual_lnum;
					} 
				} else {
						if (ModernizedCProgram.curwin.getW_cursor().getLnum() < generatedW_old_cursor_lnum) {
							from = ModernizedCProgram.curwin.getW_cursor().getLnum();
							to = generatedW_old_cursor_lnum;
						} else {
								from = generatedW_old_cursor_lnum;
								to = ModernizedCProgram.curwin.getW_cursor().getLnum();
								if (from == 0) {
									from = to;
								} 
						} 
						if (ModernizedCProgram.VIsual.getLnum() != generatedW_old_visual_lnum || ModernizedCProgram.VIsual.getCol() != generatedW_old_visual_col) {
							if (generatedW_old_visual_lnum < from && generatedW_old_visual_lnum != 0) {
								from = generatedW_old_visual_lnum;
							} 
							if (generatedW_old_visual_lnum > to) {
								to = generatedW_old_visual_lnum;
							} 
							if (ModernizedCProgram.VIsual.getLnum() < from) {
								from = ModernizedCProgram.VIsual.getLnum();
							} 
							if (ModernizedCProgram.VIsual.getLnum() > to) {
								to = ModernizedCProgram.VIsual.getLnum();
							} 
						} 
				} 
				if (VIsual_mode == 22) {
					colnr_T fromc = new colnr_T();
					colnr_T toc = new colnr_T();
					int save_ve_flags = ModernizedCProgram.ve_flags;
					if (generatedWo_lbr) {
						ModernizedCProgram.ve_flags = 4;
					} 
					ModernizedCProgram.getvcols(wp, ModernizedCProgram.VIsual, ModernizedCProgram.curwin.getW_cursor(), fromc, toc);
					ModernizedCProgram.ve_flags = save_ve_flags;
					++toc;
					if (ModernizedCProgram.curwin.getW_curswant() == INT_MAX) {
						toc = INT_MAX;
					} 
					if (fromc != generatedW_old_cursor_fcol || toc != generatedW_old_cursor_lcol) {
						if (from > ModernizedCProgram.VIsual.getLnum()) {
							from = ModernizedCProgram.VIsual.getLnum();
						} 
						if (to < ModernizedCProgram.VIsual.getLnum()) {
							to = ModernizedCProgram.VIsual.getLnum();
						} 
					} 
					this.setW_old_cursor_fcol(fromc);
					this.setW_old_cursor_lcol(toc);
				} 
			} else {
					if (generatedW_old_cursor_lnum < generatedW_old_visual_lnum) {
						from = generatedW_old_cursor_lnum;
						to = generatedW_old_visual_lnum;
					} else {
							from = generatedW_old_visual_lnum;
							to = generatedW_old_cursor_lnum;
					} 
			} 
			if (from < generatedW_topline) {
				from = generatedW_topline;
			} 
			if (generatedW_valid & -1024) {
				if (from >= generatedW_botline) {
					from = generatedW_botline - 1;
				} 
				if (to >= generatedW_botline) {
					to = generatedW_botline - 1;
				} 
			} 
			if (mid_start > 0) {
				lnum = generatedW_topline;
				idx = 0;
				srow = 0;
				if (scrolled_down) {
					mid_start = top_end;
				} else {
						mid_start = 0;
				} 
				while (lnum < from && idx < generatedW_lines_valid) {
					if (generatedW_lines[idx].getWl_valid()) {
						mid_start += generatedW_lines[idx].getWl_size();
					}  else if (!scrolled_down) {
						srow += generatedW_lines[idx].getWl_size();
					} 
					++idx;
					if (idx < generatedW_lines_valid && generatedW_lines[idx].getWl_valid()) {
						lnum = generatedW_lines[idx].getWl_lnum();
					} else {
							++lnum;
					} 
				}
				srow += mid_start;
				mid_end = generatedW_height;
				for (; idx < generatedW_lines_valid; ++idx) {
					if (generatedW_lines[idx].getWl_valid() && generatedW_lines[idx].getWl_lnum() >= to + 1) {
						mid_end = srow;
						break;
					} 
					srow += generatedW_lines[idx].getWl_size();
				}
			} 
		} 
		if (VIsual_active && buf == generatedW_buffer) {
			this.setW_old_visual_mode(VIsual_mode);
			this.setW_old_cursor_lnum(ModernizedCProgram.curwin.getW_cursor().getLnum());
			this.setW_old_visual_lnum(ModernizedCProgram.VIsual.getLnum());
			this.setW_old_visual_col(ModernizedCProgram.VIsual.getCol());
			this.setW_old_curswant(ModernizedCProgram.curwin.getW_curswant());
		} else {
				this.setW_old_visual_mode(0);
				this.setW_old_cursor_lnum(0);
				this.setW_old_visual_lnum(0);
				this.setW_old_visual_col(0);
		} 
		// reset got_int, otherwise regexp won't work// reset got_int, otherwise regexp won't worksave_got_int = got_int;
		got_int = 0;
		// Set the time limit to 'redrawtime'.// Set the time limit to 'redrawtime'.ModernizedCProgram.profile_setlimit(p_rdt, syntax_tm);
		ModernizedCProgram.syn_set_timeout(syntax_tm);
		win_foldinfo.setFi_level(0);
		// Draw the window toolbar, if there is one.// TODO: only when needed.if (wp.winbar_height() > 0) {
			wp.redraw_win_toolbar();
		} 
		// Update all the window rows.// first entry in w_lines[].wl_size// Update all the window rows.// first entry in w_lines[].wl_sizeidx = 0;
		row = 0;
		srow = 0;
		// first line shown in window// first line shown in windowlnum = generatedW_topline;
		memline generatedB_ml = buf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedW_winrow = this.getW_winrow();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (row == generatedW_height) {
				didline = 1;
				break;
			} 
			if (lnum > generatedMl_line_count) {
				eof = 1;
				break;
			} 
			srow = row;
			if (row < top_end || (row >= mid_start && row < mid_end) || top_to_mod || idx >= generatedW_lines_valid || (row + generatedW_lines[idx].getWl_size() > bot_start) || (mod_top != 0 && (lnum == mod_top || (lnum >= mod_top && (lnum < mod_bot || did_update == 3 || (did_update == 2 && wp.syntax_present() && ((wp.foldmethodIsSyntax() && wp.hasAnyFolding()) || ModernizedCProgram.syntax_check_changed(lnum))) || (generatedW_match_head != ((Object)0) && generatedB_mod_xlines != 0)))))) {
				if (lnum == mod_top) {
					top_to_mod = 0;
				} 
				if (lnum == mod_top && mod_bot != LONG_MAX && !(dollar_vcol >= 0 && mod_bot == mod_top + 1)) {
					int old_rows = 0;
					int new_rows = 0;
					int xtra_rows;
					linenr_T l = new linenr_T();
					for (i = idx; i < generatedW_lines_valid; ++i) {
						if (generatedW_lines[i].getWl_valid() && generatedW_lines[i].getWl_lnum() == mod_bot) {
							break;
						} 
						old_rows += generatedW_lines[i].getWl_size();
						if (generatedW_lines[i].getWl_valid() && generatedW_lines[i].getWl_lastlnum() + 1 == mod_bot) {
							++i;
							while (i < generatedW_lines_valid && !generatedW_lines[i].getWl_valid()) {
								old_rows += generatedW_lines[i++].getWl_size();
							}
							break;
						} 
					}
					if (i >= generatedW_lines_valid) {
						bot_start = 0;
					} else {
							j = idx;
							for (ModernizedCProgram.l = lnum; ModernizedCProgram.l < mod_bot; ++ModernizedCProgram.l) {
								if (ModernizedCProgram.hasFoldingWin(wp, ModernizedCProgram.l, ((Object)0), ModernizedCProgram.l, 1, ((Object)0))) {
									++new_rows;
								}  else if (ModernizedCProgram.l == generatedW_topline) {
									new_rows += wp.plines_win_nofill(ModernizedCProgram.l, 1) + generatedW_topfill;
								} else {
										new_rows += wp.plines_win(ModernizedCProgram.l, 1);
								} 
								++j;
								if (new_rows > generatedW_height - row - 2) {
									new_rows = 9999;
									break;
								} 
							}
							xtra_rows = new_rows - old_rows;
							if (xtra_rows < 0) {
								if (row - xtra_rows >= generatedW_height - 2) {
									mod_bot = LONG_MAX;
								} else {
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/check_for_delay(0);
										if (/*Error: Function owner not recognized*/win_del_lines(wp, row, -xtra_rows, 0, 0, 0) == 0) {
											mod_bot = LONG_MAX;
										} else {
												bot_start = generatedW_height + xtra_rows;
										} 
								} 
							}  else if (xtra_rows > 0) {
								if (row + xtra_rows >= generatedW_height - 2) {
									mod_bot = LONG_MAX;
								} else {
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/check_for_delay(0);
										if (/*Error: Function owner not recognized*/win_ins_lines(wp, row + old_rows, xtra_rows, 0, 0) == 0) {
											mod_bot = LONG_MAX;
										}  else if (top_end > row + old_rows) {
											top_end += xtra_rows;
										} 
								} 
							} 
							if (mod_bot != LONG_MAX && i != j) {
								if (j < i) {
									int x = row + new_rows;
									for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
										if (i >= generatedW_lines_valid) {
											this.setW_lines_valid(j);
											break;
										} 
										generatedW_lines[j] = generatedW_lines[i];
										if (x + (int)generatedW_lines[j].getWl_size() > generatedW_height) {
											this.setW_lines_valid(j + 1);
											break;
										} 
										x += generatedW_lines[j++].getWl_size();
										++i;
									}
									if (bot_start > x) {
										bot_start = x;
									} 
								} else {
										j -= i;
										generatedW_lines_valid += j;
										if (generatedW_lines_valid > generatedW_height) {
											this.setW_lines_valid(generatedW_height);
										} 
										for (i = generatedW_lines_valid; i - j >= idx; --i) {
											generatedW_lines[i] = generatedW_lines[i - j];
										}
										while (i >= idx) {
											generatedW_lines[i].setWl_size(0);
											generatedW_lines[i--].setWl_valid(0);
										}
								} 
							} 
					} 
				} 
				fold_count = ModernizedCProgram.foldedCount(wp, lnum, win_foldinfo);
				if (fold_count != 0) {
					ModernizedCProgram.fold_line(wp, fold_count, win_foldinfo, lnum, row);
					++row;
					--fold_count;
					generatedW_lines[idx].setWl_folded(1);
					generatedW_lines[idx].setWl_lastlnum(lnum + fold_count);
					did_update = 3;
				}  else if (idx < generatedW_lines_valid && generatedW_lines[idx].getWl_valid() && generatedW_lines[idx].getWl_lnum() == lnum && lnum > generatedW_topline && !(ModernizedCProgram.dy_flags & (-1024 | -1024)) && !(generatedW_popup_flags != 0) && srow + generatedW_lines[idx].getWl_size() > generatedW_height && wp.diff_check_fill(lnum) == 0) {
					row = generatedW_height + 1;
				} else {
						ModernizedCProgram.prepare_search_hl(wp, screen_search_hl, lnum);
						if (syntax_last_parsed != 0 && syntax_last_parsed + 1 < lnum && wp.syntax_present()) {
							ModernizedCProgram.syntax_end_parsing(syntax_last_parsed + 1);
						} 
						row = wp.win_line(lnum, srow, generatedW_height, mod_top == 0, 0);
						generatedW_lines[idx].setWl_folded(0);
						generatedW_lines[idx].setWl_lastlnum(lnum);
						did_update = 2;
						syntax_last_parsed = lnum;
				} 
				generatedW_lines[idx].setWl_lnum(lnum);
				generatedW_lines[idx].setWl_valid(1);
				if (row > generatedW_height || row + generatedW_winrow >= ModernizedCProgram.Rows) {
					if (dollar_vcol == -1) {
						generatedW_lines[idx].setWl_size(wp.plines_win(lnum, 1));
					} 
					++idx;
					break;
				} 
				if (dollar_vcol == -1) {
					generatedW_lines[idx].setWl_size(row - srow);
				} 
				++idx;
				lnum += fold_count + 1;
			} else {
					if (generatedWo_rnu) {
						fold_count = ModernizedCProgram.foldedCount(wp, lnum, win_foldinfo);
						if (fold_count != 0) {
							ModernizedCProgram.fold_line(wp, fold_count, win_foldinfo, lnum, row);
						} else {
								(Object)wp.win_line(lnum, srow, generatedW_height, 1, 1);
						} 
					} 
					row += generatedW_lines[idx++].getWl_size();
					if (row > generatedW_height) {
						break;
					} 
					lnum = generatedW_lines[idx - 1].getWl_lastlnum() + 1;
					did_update = 1;
			} 
			if (lnum > generatedMl_line_count) {
				eof = 1;
				break;
			} 
		}// stop updating when reached the end of the window (check for _past_
		// Rewrite the character at the end of the screen line.if (ModernizedCProgram.use_vtp()) {
			int i;
			for (i = 0; i < ModernizedCProgram.Rows; ++i) {
				if (enc_utf8) {
					if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(LineOffset[i] + Columns - 2, LineOffset[i] + screen_Columns) > 1) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_draw_rectangle(i, Columns - 2, 1, 2, 0);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_draw_rectangle(i, Columns - 1, 1, 1, 0);
					} 
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_char(LineOffset[i] + Columns - 1, i, Columns - 1);
				} 
			}
		} 
		if (idx > generatedW_lines_valid) {
			this.setW_lines_valid(idx);
		} 
		// Let the syntax stuff know we stop parsing here.if (syntax_last_parsed != 0 && wp.syntax_present()) {
			ModernizedCProgram.syntax_end_parsing(syntax_last_parsed + 1);
		} 
		// If we didn't hit the end of the file, and we didn't finish the last// line we were working on, then the line didn't fit.// If we didn't hit the end of the file, and we didn't finish the last// line we were working on, then the line didn't fit.this.setW_empty_rows(0);
		this.setW_filler_rows(0);
		int generatedW_wincol = this.getW_wincol();
		if (!eof && !didline) {
			if (lnum == generatedW_topline) {
				this.setW_botline(lnum + 1);
			}  else if (wp.diff_check_fill(lnum) >= generatedW_height - srow) {
				this.setW_botline(lnum);
				this.setW_filler_rows(generatedW_height - srow);
			}  else if ((generatedW_popup_flags != 0)) {
				this.setW_botline(lnum);
			}  else if (ModernizedCProgram.dy_flags & -1024) {
				int scr_row = (generatedW_winrow + generatedW_winbar_height) + generatedW_height - 1;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_puts_len((char_u)"@@", 2, scr_row, generatedW_wincol, ModernizedCProgram.highlight_attr[(int)(.HLF_AT)]);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill(scr_row, scr_row + 1, (int)generatedW_wincol + 2, (int)(generatedW_wincol + generatedW_width), (byte)'@', (byte)' ', ModernizedCProgram.highlight_attr[(int)(.HLF_AT)]);
				wp.set_empty_rows(srow);
				this.setW_botline(lnum);
			}  else if (ModernizedCProgram.dy_flags & -1024) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_fill((generatedW_winrow + generatedW_winbar_height) + generatedW_height - 1, (generatedW_winrow + generatedW_winbar_height) + generatedW_height, (int)(generatedW_wincol + generatedW_width) - 3, (int)(generatedW_wincol + generatedW_width), (byte)'@', (byte)'@', ModernizedCProgram.highlight_attr[(int)(.HLF_AT)]);
				wp.set_empty_rows(srow);
				this.setW_botline(lnum);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_draw_end(wp, (byte)'@', (byte)' ', 1, srow, generatedW_height, .HLF_AT);
					this.setW_botline(lnum);
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/draw_vsep_win(wp, row);
				if (eof) {
					this.setW_botline(generatedMl_line_count + 1);
					j = wp.diff_check_fill(generatedW_botline);
					if (j > 0 && !generatedW_botfill) {
						if (ModernizedCProgram.char2cells(fill_diff) > 1) {
							i = (byte)'-';
						} else {
								i = fill_diff;
						} 
						if (row + j > generatedW_height) {
							j = generatedW_height - row;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_draw_end(wp, i, i, 1, row, row + (int)j, .HLF_DED);
						row += j;
					} 
				}  else if (dollar_vcol == -1) {
					this.setW_botline(lnum);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/win_draw_end(wp, (generatedW_popup_flags != 0) ? (byte)' ' : (byte)'~', (byte)' ', 0, row, generatedW_height, .HLF_EOB);
		} 
		ModernizedCProgram.syn_set_timeout(((Object)0));
		// Reset the type of redrawing required, the window has been updated.// Reset the type of redrawing required, the window has been updated.this.setW_redr_type(0);
		this.setW_old_topfill(generatedW_topfill);
		this.setW_old_botfill(generatedW_botfill);
		if (dollar_vcol == -1) {
			generatedW_valid |=  -1024;
			if (wp == ModernizedCProgram.curwin && generatedW_botline != old_botline && !recursive) {
				recursive = 1;
				generatedW_valid &=  ~-1024;
				ModernizedCProgram.update_topline();
				if (must_redraw != 0) {
					i = generatedB_mod_set;
					curbuf.setB_mod_set(0);
					ModernizedCProgram.curwin.win_update();
					must_redraw = 0;
					curbuf.setB_mod_set(i);
				} 
				recursive = 0;
			} 
		} 
		// There is a trick with w_botline.  If we invalidate it on each// change that might modify it, this will cause a lot of expensive// calls to plines() in update_topline() each time.  Therefore the// value of w_botline is often approximated, and this value is used to// compute the value of w_topline.  If the value of w_botline was
		// restore got_int, unless CTRL-C was hit while redrawingif (!got_int) {
			got_int = save_got_int/*
			 * Prepare for updating one or more windows.
			 * Caller must check for "updating_screen" already set to avoid recursiveness.
			 */;
		} 
	}
	public void redraw_win_later(int type) {
		int generatedW_redr_type = this.getW_redr_type();
		if (!exiting && generatedW_redr_type < type) {
			this.setW_redr_type(type);
			if (type >= 40) {
				this.setW_lines_valid(0);
			} 
			if (must_redraw < type) {
				must_redraw = type/*
				 * Force a complete redraw later.  Also resets the highlighting.  To be used
				 * after executing a shell command that messes up the screen.
				 */;
			} 
		} 
	}
	public void redrawWinline(Object lnum) {
		Object generatedW_redraw_top = this.getW_redraw_top();
		if (generatedW_redraw_top == 0 || generatedW_redraw_top > lnum) {
			this.setW_redraw_top(lnum);
		} 
		Object generatedW_redraw_bot = this.getW_redraw_bot();
		if (generatedW_redraw_bot == 0 || generatedW_redraw_bot < lnum) {
			this.setW_redraw_bot(lnum);
		} 
		wp.redraw_win_later(10);
	}
	public void tagstack_clear() {
		int i;
		int generatedW_tagstacklen = this.getW_tagstacklen();
		Object generatedW_tagstack = this.getW_tagstack();
		// Free the current tag stackfor (i = 0; i < generatedW_tagstacklen; ++i) {
			generatedW_tagstack[i].tagstack_clear_entry();
		}
		this.setW_tagstacklen(0);
		this.setW_tagstackidx(0/*
		 * Remove the oldest entry from the tag stack and shift the rest of
		 * the entires to free up the top of the stack.
		 */);
	}
	public void tagstack_shift() {
		Object generatedW_tagstack = this.getW_tagstack();
		taggy_T tagstack = generatedW_tagstack;
		int i;
		tagstack[0].tagstack_clear_entry();
		int generatedW_tagstacklen = this.getW_tagstacklen();
		for (i = 1; i < generatedW_tagstacklen; ++i) {
			tagstack[i - 1] = tagstack[i];
		}
		generatedW_tagstacklen--;
	}
	public void tagstack_set_curidx(int curidx) {
		this.setW_tagstackidx(curidx);
		int generatedW_tagstackidx = this.getW_tagstackidx();
		// sanity checkif (generatedW_tagstackidx < 0) {
			this.setW_tagstackidx(0);
		} 
		int generatedW_tagstacklen = this.getW_tagstacklen();
		if (generatedW_tagstackidx > generatedW_tagstacklen) {
			this.setW_tagstackidx(generatedW_tagstacklen);
		} 
	}
	public window_S win_id2wp(int id) {
		window_S window_S = new window_S();
		return window_S.win_id2wp_tp(id, ((Object)0/*
		 * Return the window and tab pointer of window "id".
		 */));
	}
	public window_S win_id2wp_tp(int id, tabpage_S tpp) {
		win_T wp = new win_T();
		tabpage_T tp = new tabpage_T();
		int generatedW_id = wp.getW_id();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
			for ((wp) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
				if (generatedW_id == id) {
					if (tpp != ((Object)0)) {
						tpp = tp;
					} 
					return wp;
				} 
			}
		}
		Object generatedTp_first_popupwin = tp.getTp_first_popupwin();
		// popup windows are in separate listsfor (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			for (wp = generatedTp_first_popupwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_id == id) {
					if (tpp != ((Object)0)) {
						tpp = tp;
					} 
					return wp;
				} 
			}
		}
		for (wp = first_popupwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_id == id) {
				if (tpp != ((Object)0)) {
					tpp = tp;
				} 
				return wp;
			} 
		}
		return ((Object)0);
	}
	public window_S find_win_by_nr( vp, tabpage_S tp) {
		// NULL for current tab pagewin_T wp = new win_T();
		int nr = (int)vp.tv_get_number_chk(((Object)0));
		if (nr < 0) {
			return ((Object)0);
		} 
		if (nr == 0) {
			return ModernizedCProgram.curwin;
		} 
		int generatedW_id = wp.getW_id();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		for ((wp) = ((tp) == ((Object)0) || (tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
			if (nr >= 1000) {
				if (generatedW_id == nr) {
					return wp;
				} 
			}  else if (--nr <= 0) {
				break;
			} 
		}
		Object generatedTp_first_popupwin = tp.getTp_first_popupwin();
		if (nr >= 1000) {
			for (wp = generatedTp_first_popupwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_id == nr) {
					return wp;
				} 
			}
			for (wp = first_popupwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_id == nr) {
					return wp;
				} 
			}
			return ((Object)0);
		} 
		return wp/*
		 * Find a window: When using a Window ID in any tab page, when using a number
		 * in the current tab page.
		 */;
	}
	public window_S find_win_by_nr_or_id( vp) {
		int nr = (int)vp.tv_get_number_chk(((Object)0));
		window_S window_S = new window_S();
		if (nr >= 1000) {
			return window_S.win_id2wp(vp.tv_get_number());
		} 
		window_S window_S = new window_S();
		return window_S.find_win_by_nr(vp, ((Object)0/*
		 * Find window specified by "wvp" in tabpage "tvp".
		 * Returns the tab page in 'ptp'
		 */));
	}
	public window_S find_tabwin( wvp,  tvp, tabpage_S ptp) {
		win_T wp = ((Object)0);
		tabpage_T tp = ((Object)0);
		long n;
		Object generatedV_type = wvp.getV_type();
		tabpage_S tabpage_S = new tabpage_S();
		window_S window_S = new window_S();
		Object generatedVval = wvp.getVval();
		if (generatedV_type != .VAR_UNKNOWN) {
			if (generatedV_type != .VAR_UNKNOWN) {
				n = (long)tvp.tv_get_number();
				if (n >= 0) {
					tp = tabpage_S.find_tabpage(n);
				} 
			} else {
					tp = ModernizedCProgram.curtab;
			} 
			if (tp != ((Object)0)) {
				wp = window_S.find_win_by_nr(wvp, tp);
				if (wp == ((Object)0) && generatedV_type == .VAR_NUMBER && generatedVval.getV_number() != -1) {
					tp = ((Object)0);
				} 
			} 
		} else {
				wp = ModernizedCProgram.curwin;
				tp = ModernizedCProgram.curtab;
		} 
		if (ptp != ((Object)0)) {
			ptp = tp;
		} 
		return wp/*
		 * Get the layout of the given tab page for winlayout().
		 */;
	}
	// VAR_UNKNOWN for current window
	// VAR_UNKNOWN for current tab page
	public void win_move_into_split(window_S targetwin, int size, int flags) {
		int dir;
		int generatedW_height = this.getW_height();
		int height = generatedW_height;
		win_T oldwin = ModernizedCProgram.curwin;
		if (wp == targetwin) {
			return /*Error: Unsupported expression*/;
		} 
		// Jump to the target windowif (ModernizedCProgram.curwin != targetwin) {
			targetwin.win_goto();
		} 
		// Remove the old window and frame from the tree of frames// Remove the old window and frame from the tree of frames(Object)wp.winframe_remove(dir, ((Object)0));
		ModernizedCProgram.win_remove(wp, ((Object)0));
		// may need to remove last status line// may need to remove last status lineModernizedCProgram.last_status(0);
		// recompute window positions// recompute window positions(Object)ModernizedCProgram.win_comp_pos();
		// Split a window on the desired side and put the old window there// Split a window on the desired side and put the old window there(Object)wp.win_split_ins(size, flags, dir);
		// If splitting horizontally, try to preserve heightif (size == 0 && !(flags & 2)) {
			wp.win_setheight_win(height);
			if (ModernizedCProgram.p_ea) {
				wp.win_equal(1, (byte)'v');
			} 
		} 
		// scrollbars.  Have to update them anyway.if (oldwin != ModernizedCProgram.curwin) {
			oldwin/*
			 * "win_splitmove()" function
			 */.win_goto();
		} 
	}
	public int winbar_height() {
		Object generatedW_winbar = this.getW_winbar();
		if (generatedW_winbar != ((Object)0) && generatedW_winbar.getChildren() != ((Object)0)) {
			return 1;
		} 
		return 0;
	}
	public void remove_winbar() {
		Object generatedW_winbar = this.getW_winbar();
		generatedW_winbar.remove_menu((char_u)"", ((1 << 7) - 1), 1);
		Object generatedW_winbar_items = this.getW_winbar_items();
		ModernizedCProgram.vim_free(generatedW_winbar_items);
	}
	public void winbar_click(int col) {
		int idx;
		Object generatedW_winbar_items = this.getW_winbar_items();
		if (generatedW_winbar_items == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedWb_startcol = item.getWb_startcol();
		Object generatedWb_endcol = item.getWb_endcol();
		Object generatedWb_menu = item.getWb_menu();
		for (idx = 0; generatedW_winbar_items[idx].getWb_menu() != ((Object)0); ++idx) {
			winbar_item_T item = generatedW_winbar_items[idx];
			if (col >= generatedWb_startcol && col <= generatedWb_endcol) {
				win_T save_curwin = ((Object)0);
				pos_T save_visual = ModernizedCProgram.VIsual;
				int save_visual_active = VIsual_active;
				int save_visual_select = VIsual_select;
				int save_visual_reselect = ModernizedCProgram.VIsual_reselect;
				int save_visual_mode = VIsual_mode;
				if (wp != ModernizedCProgram.curwin) {
					save_curwin = /* Clicking in the window toolbar of a not-current window.
							 * Make that window the current one and save Visual mode. */ModernizedCProgram.curwin;
					VIsual_active = 0;
					ModernizedCProgram.curwin = wp;
					curbuf = ModernizedCProgram.curwin.getW_buffer();
					ModernizedCProgram.check_cursor();
				} 
				ModernizedCProgram.execute_menu(((Object)0), generatedWb_menu, -1);
				if (save_curwin != ((Object)0) && save_curwin.win_valid()) {
					ModernizedCProgram.curwin = save_curwin;
					curbuf = ModernizedCProgram.curwin.getW_buffer();
					ModernizedCProgram.VIsual = save_visual;
					VIsual_active = save_visual_active;
					VIsual_select = save_visual_select;
					ModernizedCProgram.VIsual_reselect = save_visual_reselect;
					VIsual_mode = save_visual_mode;
				} 
				if (!wp.win_valid()) {
					break;
				} 
			} 
		}
	}
	public Object get_cursor_rel_lnum(Object lnum) {
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		linenr_T cursor = generatedLnum;
		linenr_T retval = 0;
		if (wp.hasAnyFolding()) {
			if (lnum > cursor) {
				while (lnum > cursor) {
					(Object)ModernizedCProgram.hasFoldingWin(wp, lnum, lnum, ((Object)0), 1, ((Object)0/* if lnum and cursor are in the same fold,
							 * now lnum <= cursor */));
					if (lnum > cursor) {
						retval++;
					} 
					lnum--;
				}
			}  else if (lnum < cursor) {
				while (lnum < cursor) {
					(Object)ModernizedCProgram.hasFoldingWin(wp, lnum, ((Object)0), lnum, 1, ((Object)0/* if lnum and cursor are in the same fold,
							 * now lnum >= cursor */));
					if (lnum < cursor) {
						retval--;
					} 
					lnum/* else if (lnum == cursor)
						 *     retval = 0;
						 */++;
				}
			} 
		} else {
				retval = lnum - cursor;
		} 
		return retval/*
		 * Make sure "pos.lnum" and "pos.col" are valid in "buf".
		 * This allows for the col to be on the NUL byte.
		 */;
	}
	public void check_cursor_col_win() {
		colnr_T len = new colnr_T();
		 generatedW_cursor = this.getW_cursor();
		Object generatedCol = generatedW_cursor.getCol();
		colnr_T oldcol = generatedCol;
		Object generatedColadd = generatedW_cursor.getColadd();
		colnr_T oldcoladd = generatedCol + generatedColadd;
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedLnum = generatedW_cursor.getLnum();
		len = (colnr_T)/*Error: Function owner not recognized*/strlen((byte)(generatedW_buffer.ml_get_buf(generatedLnum, 0)));
		if (len == 0) {
			generatedW_cursor.setCol(0);
		}  else if (generatedCol >= len/* Allow cursor past end-of-line when:
			 * - in Insert mode or restarting Insert mode
			 * - in Visual mode and 'selection' isn't "old"
			 * - 'virtualedit' is set */) {
			if ((State & -1024) || restart_edit || (VIsual_active && ModernizedCProgram.p_sel != (byte)'o') || (ModernizedCProgram.ve_flags & 8) || ModernizedCProgram.virtual_active()) {
				generatedW_cursor.setCol(len);
			} else {
					generatedW_cursor.setCol(len - 1);
					if (/* Move the cursor to the head byte. */has_mbyte) {
						ModernizedCProgram.mb_adjustpos(generatedW_buffer, generatedW_cursor);
					} 
			} 
		}  else if (generatedCol < 0) {
			generatedW_cursor.setCol(0/* If virtual editing is on, we can leave the cursor on the old position,
			     * only we must set it to virtual.  But don't do it when at the end of the
			     * line. */);
		} 
		if (oldcol == INT_MAX) {
			generatedW_cursor.setColadd(0);
		}  else if (ModernizedCProgram.ve_flags == 4) {
			if (oldcoladd > generatedCol) {
				generatedW_cursor.setColadd(oldcoladd - generatedCol);
				if (generatedCol + 1 < len && generatedColadd > 0) {
					int cs;
					int ce;
					ModernizedCProgram.getvcol(win, generatedW_cursor, cs, ((Object)0), ce);
					if (generatedColadd > ce - cs) {
						generatedW_cursor.setColadd(ce - cs);
					} 
				} 
			} else {
					generatedW_cursor.setColadd(/* avoid weird number when there is a miscalculation or overflow */0/*
					 * make sure curwin->w_cursor in on a valid character
					 */);
			} 
		} 
	}
	public void gui_create_scrollbar(Object sb, int type) {
		int sbar_ident = 0;
		sb.setIdent(/* No check for too big, but would it happen? */sbar_ident++);
		sb.setWp(wp);
		sb.setType(type);
		sb.setValue(0);
		sb.setSize(1);
		sb.setMax(1);
		sb.setTop(0);
		sb.setHeight(0);
		sb.setWidth(0);
		sb.setStatus_height(0);
		ModernizedCProgram.gui_mch_create_scrollbar(sb, (wp == ((Object)0)) ? SBAR_HORIZ : SBAR_VERT/*
		 * Find the scrollbar with the given index.
		 */);
	}
	public void gui_do_scrollbar(int which, int enable) {
		int midcol = ModernizedCProgram.curwin.getW_wincol() + ModernizedCProgram.curwin.getW_width() / /* TRUE to enable scrollbar */2;
		int generatedW_wincol = this.getW_wincol();
		int generatedW_width = this.getW_width();
		int has_midcol = (generatedW_wincol <= midcol && generatedW_wincol + generatedW_width >= midcol);
		if (ModernizedCProgram.gui.getWhich_scrollbars()[SBAR_RIGHT] != ModernizedCProgram.gui.getWhich_scrollbars()[/* Only enable scrollbars that contain the middle column of the current
		     * window. */SBAR_LEFT]) {
			if (!/* Scrollbars only on one side.  Don't enable scrollbars that don't
				 * contain the middle column of the current window. */has_midcol) {
				enable = 0;
			} 
		} else {
				if (midcol > Columns / /* Scrollbars on both sides.  Don't enable scrollbars that neither
					 * contain the middle column of the current window nor are on the far
					 * side. */2) {
					if (which == SBAR_LEFT ? generatedW_wincol != 0 : !has_midcol) {
						enable = 0;
					} 
				} else {
						if (which == SBAR_RIGHT ? generatedW_wincol + generatedW_width != Columns : !has_midcol) {
							enable = 0;
						} 
				} 
		} 
		Object generatedW_scrollbars = this.getW_scrollbars();
		ModernizedCProgram.gui_mch_enable_scrollbar(generatedW_scrollbars[which], enable/*
		 * Scroll a window according to the values set in the globals current_scrollbar
		 * and scrollbar_value.  Return TRUE if the cursor in the current window moved
		 * or FALSE otherwise.
		 */);
	}
	/* SBAR_LEFT or SBAR_RIGHT */
	public window_S xy2win(int x, int y) {
		int row;
		int col;
		win_T wp = new win_T();
		row = /*Error: Function owner not recognized*/Y_2_ROW(y);
		col = /*Error: Function owner not recognized*/X_2_COL(x);
		if (row < 0 || col < /* before first window */0) {
			return ((Object)0);
		} 
		wp = /*Error: Function owner not recognized*/mouse_find_win(row, col, 0);
		if (wp == ((Object)0)) {
			return ((Object)0);
		} 
		/* below status line */
		return wp/*
		 * ":gui" and ":gvim": Change from the terminal version to the GUI version.
		 * File names may be given to redefine the args list.
		 */;
	}
	/* Return values for gui_read_child_pipe */
	/*
	 * Position the info popup relative to the popup menu item.
	 */
	public void pum_position_info_popup() {
		int col = ModernizedCProgram.pum_col + ModernizedCProgram.pum_width + 1;
		int row = ModernizedCProgram.pum_row;
		int botpos = .POPPOS_BOTLEFT;
		this.setW_popup_pos(.POPPOS_TOPLEFT);
		if (Columns - col < 20 && Columns - col < ModernizedCProgram.pum_col) {
			col = ModernizedCProgram.pum_col - 1;
			this.setW_popup_pos(.POPPOS_TOPRIGHT);
			botpos = .POPPOS_BOTRIGHT;
			this.setW_maxwidth(ModernizedCProgram.pum_col - 1);
		} else {
				this.setW_maxwidth(Columns - col + 1);
		} 
		Object generatedW_maxwidth = this.getW_maxwidth();
		generatedW_maxwidth -= wp.popup_extra_width();
		row -= wp.popup_top_extra();
		Object generatedW_popup_flags = this.getW_popup_flags();
		if (generatedW_popup_flags & -1024) {
			if (ModernizedCProgram.pum_row < ModernizedCProgram.pum_win_row) {
				row += ModernizedCProgram.pum_height;
				this.setW_popup_pos(botpos);
			} else {
					row += 1;
			} 
		} else {
				row += ModernizedCProgram.pum_selected - ModernizedCProgram.pum_first + 1;
		} 
		wp.popup_set_wantpos_rowcol(row, col/*
		 * Set the index of the currently selected item.  The menu will scroll when
		 * necessary.  When "n" is out of range don't scroll.
		 * This may be repeated when the preview window is used:
		 * "repeat" == 0: open preview window normally
		 * "repeat" == 1: open preview window but don't set the size
		 * "repeat" == 2: don't open preview window
		 * Returns TRUE when the window was resized and the location of the popup menu
		 * must be recomputed.
		 */);
	}
	public void python_window_free() {
		Object generatedW_python_ref = this.getW_python_ref();
		if (generatedW_python_ref != ((Object)0)) {
			WindowObject wp = generatedW_python_ref;
			wp.setWin(((win_T)(true)));
			this.setW_python_ref(((Object)0));
		} 
	}
	public void diff_buf_adjust() {
		win_T wp = new win_T();
		int i;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		if (!generatedWo_diff) {
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_buffer == generatedW_buffer && generatedWo_diff) {
					break;
				} 
			}
			if (wp == ((Object)0)) {
				i = generatedW_buffer.diff_buf_idx();
				if (i != 8) {
					ModernizedCProgram.curtab.getTp_diffbuf()[i] = ((Object)0);
					ModernizedCProgram.curtab.setTp_diff_invalid(1);
					ModernizedCProgram.diff_redraw(1);
				} 
			} 
		} else {
				generatedW_buffer.diff_buf_add();
		} 
	}
	public void set_diff_option(int value) {
		win_T old_curwin = ModernizedCProgram.curwin;
		ModernizedCProgram.curwin = wp;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
		++curbuf_lock;
		ModernizedCProgram.set_option_value((char_u)"diff", (long)value, ((Object)0), 4);
		--curbuf_lock;
		ModernizedCProgram.curwin = old_curwin;
		curbuf = ModernizedCProgram.curwin.getW_buffer();
	}
	public void diff_win_options(int addbuf) {
		win_T old_curwin = ModernizedCProgram.curwin;
		ModernizedCProgram.curwin = /* close the manually opened folds */wp;
		ModernizedCProgram.newFoldLevel();
		ModernizedCProgram.curwin = old_curwin;
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		Object generatedWo_scb = generatedW_onebuf_opt.getWo_scb();
		if (!generatedWo_diff) {
			generatedW_onebuf_opt.setWo_scb_save(generatedWo_scb);
		} 
		generatedW_onebuf_opt.setWo_scb(1);
		Object generatedWo_crb = generatedW_onebuf_opt.getWo_crb();
		if (!generatedWo_diff) {
			generatedW_onebuf_opt.setWo_crb_save(generatedWo_crb);
		} 
		generatedW_onebuf_opt.setWo_crb(1);
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		if (!generatedWo_diff) {
			generatedW_onebuf_opt.setWo_wrap_save(generatedWo_wrap);
		} 
		generatedW_onebuf_opt.setWo_wrap(0);
		Object generatedWo_diff_saved = generatedW_onebuf_opt.getWo_diff_saved();
		Object generatedWo_fdm_save = generatedW_onebuf_opt.getWo_fdm_save();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		if (!generatedWo_diff) {
			if (generatedWo_diff_saved) {
				ModernizedCProgram.free_string_option(generatedWo_fdm_save);
			} 
			generatedW_onebuf_opt.setWo_fdm_save(ModernizedCProgram.vim_strsave(generatedWo_fdm));
		} 
		wp.set_string_option_direct_in_win((char_u)"fdm", -1, (char_u)"diff", 4 | 1, 0);
		Object generatedWo_fdc = generatedW_onebuf_opt.getWo_fdc();
		Object generatedWo_fen = generatedW_onebuf_opt.getWo_fen();
		Object generatedWo_fdl = generatedW_onebuf_opt.getWo_fdl();
		if (!generatedWo_diff) {
			generatedW_onebuf_opt.setWo_fdc_save(generatedWo_fdc);
			generatedW_onebuf_opt.setWo_fen_save(generatedWo_fen);
			generatedW_onebuf_opt.setWo_fdl_save(generatedWo_fdl);
		} 
		generatedW_onebuf_opt.setWo_fdc(diff_foldcolumn);
		generatedW_onebuf_opt.setWo_fen(1);
		generatedW_onebuf_opt.setWo_fdl(0);
		wp.foldUpdateAll();
		/* make sure topline is not halfway a fold */wp.changed_window_setting_win();
		if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_sbo, (byte)'h') == ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd((char_u)"set sbo+=hor");
		} 
		generatedW_onebuf_opt.setWo_diff_saved(/* Save the current values, to be restored in ex_diffoff(). */1);
		wp.set_diff_option(1);
		file_buffer generatedW_buffer = this.getW_buffer();
		if (addbuf) {
			generatedW_buffer.diff_buf_add();
		} 
		wp.redraw_win_later(40/*
		 * Set options not to show diffs.  For the current window or all windows.
		 * Only in the current tab page.
		 */);
	}
	/* Add buffer to diff. */
	public int diff_check(Object lnum) {
		/* index in tp_diffbuf[] for this buffer */int idx;
		diff_T dp = new diff_T();
		int maxcount;
		int i;
		file_buffer generatedW_buffer = this.getW_buffer();
		buf_T buf = generatedW_buffer;
		int cmp;
		if (ModernizedCProgram.curtab.getTp_diff_invalid()) {
			((Object)/* update after a big change */0).ex_diffupdate();
		} 
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		if (ModernizedCProgram.curtab.getTp_first_diff() == ((Object)0) || !generatedWo_diff) {
			return 0;
		} 
		memline generatedB_ml = buf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (lnum < 1 || lnum > generatedMl_line_count + /* safety check: "lnum" must be a buffer line */1) {
			return 0;
		} 
		idx = buf.diff_buf_idx();
		if (idx == 8) {
			return /* no diffs for buffer "buf" */0;
		} 
		if (ModernizedCProgram.hasFoldingWin(wp, lnum, ((Object)0), ((Object)0), 1, ((Object)/* A closed fold never has filler lines. */0))) {
			return 0;
		} 
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (lnum <= generatedDf_lnum[idx] + generatedDf_count[idx]) {
				break;
			} 
		}
		if (dp == ((Object)0) || lnum < generatedDf_lnum[idx]) {
			return 0;
		} 
		if (lnum < generatedDf_lnum[idx] + generatedDf_count[idx]) {
			int zero = 0/* Changed or inserted line.  If the other buffers have a count of
				 * zero, the lines were inserted.  If the other buffers have the same
				 * count, check if the lines are identical. */;
			cmp = 0;
			for (i = 0; i < 8; ++i) {
				if (i != idx && ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0)) {
					if (generatedDf_count[i] == 0) {
						zero = 1;
					} else {
							if (generatedDf_count[i] != generatedDf_count[idx]) {
								return -/* nr of lines changed. */1;
							} 
							cmp = 1;
					} 
				} 
			}
			if (cmp) {
				for (i = 0; i < 8; ++/* Compare all lines.  If they are equal the lines were inserted
					     * in some buffers, deleted in others, but not changed. */i) {
					if (i != idx && ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && generatedDf_count[i] != 0) {
						if (!dp.diff_equal_entry(idx, i)) {
							return -1/* If there is no buffer with zero lines then there is no difference
								 * any longer.  Happens when making a change (or undo) that removes
								 * the difference.  Can't remove the entry here, we might be halfway
								 * updating the window.  Just report the text as unchanged.  Other
								 * windows might still show the change though. */;
						} 
					} 
				}
			} 
			if (zero == 0) {
				return 0;
			} 
			return -2;
		} 
		if (!(ModernizedCProgram.diff_flags & /* If 'diffopt' doesn't contain "filler", return 0. */-1024)) {
			return 0;
		} 
		maxcount = /* Insert filler lines above the line just below the change.  Will return
		     * 0 when this buf had the max count. */0;
		for (i = 0; i < 8; ++i) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && generatedDf_count[i] > maxcount) {
				maxcount = generatedDf_count[i];
			} 
		}
		return maxcount - generatedDf_count[idx/*
		 * Compare two entries in diff "*dp" and return TRUE if they are equal.
		 */];
	}
	public int diff_check_fill(Object lnum) {
		int n;
		if (!(ModernizedCProgram.diff_flags & /* be quick when there are no filler lines */-1024)) {
			return 0;
		} 
		n = wp.diff_check(lnum);
		if (n <= 0) {
			return 0;
		} 
		return n/*
		 * Set the topline of "towin" to match the position in "fromwin", so that they
		 * show the same diff'ed lines.
		 */;
	}
	public void diff_set_topline(window_S towin) {
		file_buffer generatedW_buffer = this.getW_buffer();
		buf_T frombuf = generatedW_buffer;
		Object generatedW_topline = this.getW_topline();
		linenr_T lnum = generatedW_topline;
		int fromidx;
		int toidx;
		diff_T dp = new diff_T();
		int max_count;
		int i;
		fromidx = frombuf.diff_buf_idx();
		if (fromidx == 8) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.curtab.getTp_diff_invalid()) {
			((Object)/* update after a big change */0).ex_diffupdate();
		} 
		towin.setW_topfill(0);
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (lnum <= generatedDf_lnum[fromidx] + generatedDf_count[fromidx]) {
				break;
			} 
		}
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_topfill = this.getW_topfill();
		if (dp == ((Object)0)) {
			towin.setW_topline(generatedMl_line_count - (generatedMl_line_count - lnum));
		} else {
				toidx = generatedW_buffer.diff_buf_idx();
				if (toidx == 8) {
					return /*Error: Unsupported expression*/;
				} 
				towin.setW_topline(lnum + (generatedDf_lnum[toidx] - generatedDf_lnum[fromidx]));
				if (lnum >= generatedDf_lnum[fromidx]) {
					max_count = /* Inside a change: compute filler lines. With three or more
						     * buffers we need to know the largest count. */0;
					for (i = 0; i < 8; ++i) {
						if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && max_count < generatedDf_count[i]) {
							max_count = generatedDf_count[i];
						} 
					}
					if (generatedDf_count[toidx] == generatedDf_count[fromidx]) {
						towin.setW_topfill(generatedW_topfill);
					}  else if (generatedDf_count[toidx] > generatedDf_count[fromidx]) {
						if (lnum == generatedDf_lnum[fromidx] + generatedDf_count[fromidx]) {
							if (max_count - generatedW_topfill >= generatedDf_count[/* more lines in towin and fromwin doesn't show diff
									     * lines, only filler lines */toidx]) {
								towin.setW_topline(generatedDf_lnum[/* towin also only shows filler lines */toidx] + generatedDf_count[toidx]);
								towin.setW_topfill(generatedW_topfill);
							} else {
									towin.setW_topline(generatedDf_lnum[/* towin still has some diff lines to show */toidx] + max_count - generatedW_topfill);
							} 
						} 
					}  else if (generatedW_topline >= generatedDf_lnum[toidx] + generatedDf_count[toidx]) {
						towin.setW_topline(generatedDf_lnum[toidx] + generatedDf_count[/* less lines in towin and no diff lines to show: compute
								 * filler lines */toidx]);
						if (ModernizedCProgram.diff_flags & -1024) {
							if (lnum == generatedDf_lnum[fromidx] + generatedDf_count[fromidx]) {
								towin.setW_topfill(generatedW_topfill);
							} else {
									towin.setW_topfill(generatedDf_lnum[/* fromwin has some diff lines */fromidx] + max_count - lnum);
							} 
						} 
					} 
				} 
		} 
		towin.setW_botfill(/* safety check (if diff info gets outdated strange things may happen) */0);
		if (generatedW_topline > generatedMl_line_count) {
			towin.setW_topline(generatedMl_line_count);
			towin.setW_botfill(1);
		} 
		if (generatedW_topline < 1) {
			towin.setW_topline(1);
			towin.setW_topfill(0);
		} 
		/* When w_topline changes need to recompute w_botline and cursor position */towin.invalidate_botline_win();
		towin.changed_line_abv_curs_win();
		towin.check_topfill(0);
		(Object)ModernizedCProgram.hasFoldingWin(towin, generatedW_topline, generatedW_topline, ((Object)0), 1, ((Object)0/*
		 * This is called when 'diffopt' is changed.
		 */));
	}
	public int diff_find_change(Object lnum, Integer startp, Integer endp) {
		/* first char of the change *//* last char of the change */char_u line_org = new char_u();
		char_u line_new = new char_u();
		int i;
		int si_org;
		int si_new;
		int ei_org;
		int ei_new;
		diff_T dp = new diff_T();
		int idx;
		int off;
		int added = 1;
		char_u p1 = new char_u();
		char_u p2 = new char_u();
		int l;
		file_buffer generatedW_buffer = this.getW_buffer();
		line_org = ModernizedCProgram.vim_strsave(generatedW_buffer.ml_get_buf(lnum, /* Make a copy of the line, the next ml_get() will invalidate it. */0));
		if (line_org == ((Object)0)) {
			return 0;
		} 
		idx = generatedW_buffer.diff_buf_idx();
		if (idx == /* cannot happen */8) {
			ModernizedCProgram.vim_free(line_org);
			return 0;
		} 
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (lnum <= generatedDf_lnum[idx] + generatedDf_count[idx]) {
				break;
			} 
		}
		if (dp == ((Object)0) || ModernizedCProgram.diff_check_sanity(ModernizedCProgram.curtab, dp) == 0) {
			ModernizedCProgram.vim_free(line_org);
			return 0;
		} 
		off = lnum - generatedDf_lnum[idx];
		for (i = 0; i < 8; ++i) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && i != idx) {
				if (off >= generatedDf_count[/* Skip lines that are not in the other change (filler lines). */i]) {
					continue;
				} 
				added = 0;
				line_new = ModernizedCProgram.curtab.getTp_diffbuf()[i].ml_get_buf(generatedDf_lnum[i] + off, 0);
				si_org = si_new = /* Search for start of difference */0;
				while (line_org[si_org] != (byte)'\000') {
					if (((ModernizedCProgram.diff_flags & -1024) && ((line_org[si_org]) == (byte)' ' || (line_org[si_org]) == (byte)'\t') && ((line_new[si_new]) == (byte)' ' || (line_new[si_new]) == (byte)'\t')) || ((ModernizedCProgram.diff_flags & -1024) && (((line_org[si_org]) == (byte)' ' || (line_org[si_org]) == (byte)'\t') || ((line_new[si_new]) == (byte)' ' || (line_new[si_new]) == (byte)'\t')))) {
						si_org = (int)(ModernizedCProgram.skipwhite(line_org + si_org) - line_org);
						si_new = (int)(ModernizedCProgram.skipwhite(line_new + si_new) - line_new);
					} else {
							if (!ModernizedCProgram.diff_equal_char(line_org + si_org, line_new + si_new, l)) {
								break;
							} 
							si_org += l;
							si_new += l;
					} 
				}
				if (has_mbyte) {
					si_org -= /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(line_org, line_org + /* Move back to first byte of character in both lines (may
							 * have "nn^" in line_org and "n^ in line_new). */si_org);
					si_new -= /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(line_new, line_new + si_new);
				} 
				if (startp > si_org) {
					startp = si_org;
				} 
				if (line_org[si_org] != (byte)'\000' || line_new[si_new] != /* Search for end of difference, if any. */(byte)'\000') {
					ei_org = (int)/*Error: Function owner not recognized*/strlen((byte)(line_org));
					ei_new = (int)/*Error: Function owner not recognized*/strlen((byte)(line_new));
					while (ei_org >= startp && ei_new >= si_new && ei_org >= 0 && ei_new >= 0) {
						if (((ModernizedCProgram.diff_flags & -1024) && ((line_org[ei_org]) == (byte)' ' || (line_org[ei_org]) == (byte)'\t') && ((line_new[ei_new]) == (byte)' ' || (line_new[ei_new]) == (byte)'\t')) || ((ModernizedCProgram.diff_flags & -1024) && (((line_org[ei_org]) == (byte)' ' || (line_org[ei_org]) == (byte)'\t') || ((line_new[ei_new]) == (byte)' ' || (line_new[ei_new]) == (byte)'\t')))) {
							while (ei_org >= startp && ((line_org[ei_org]) == (byte)' ' || (line_org[ei_org]) == (byte)'\t')) {
								--ei_org;
							}
							while (ei_new >= si_new && ((line_new[ei_new]) == (byte)' ' || (line_new[ei_new]) == (byte)'\t')) {
								--ei_new;
							}
						} else {
								p1 = line_org + ei_org;
								p2 = line_new + ei_new;
								p1 -= /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(line_org, p1);
								p2 -= /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(line_new, p2);
								if (!ModernizedCProgram.diff_equal_char(p1, p2, l)) {
									break;
								} 
								ei_org -= l;
								ei_new -= l;
						} 
					}
					if (endp < ei_org) {
						endp = ei_org;
					} 
				} 
			} 
		}
		ModernizedCProgram.vim_free(line_org);
		return added/*
		 * Return TRUE if line "lnum" is not close to a diff block, this line should
		 * be in a fold.
		 * Return FALSE if there are no diff blocks at all in this window.
		 */;
	}
	public int diff_infold(Object lnum) {
		int i;
		int idx = -1;
		int other = 0;
		diff_T dp = new diff_T();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		if (!generatedWo_diff) {
			return 0;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		for (i = 0; i < 8; ++i) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[i] == generatedW_buffer) {
				idx = i;
			}  else if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0)) {
				other = 1;
			} 
		}
		if (idx == -1 || !/* return here if there are no diffs in the window */other) {
			return 0;
		} 
		if (ModernizedCProgram.curtab.getTp_diff_invalid()) {
			((Object)/* update after a big change */0).ex_diffupdate();
		} 
		if (ModernizedCProgram.curtab.getTp_first_diff() == ((Object)/* Return if there are no diff blocks.  All lines will be folded. */0)) {
			return 1;
		} 
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (generatedDf_lnum[idx] - diff_context > /* If this change is below the line there can't be any further match. */lnum) {
				break;
			} 
			if (generatedDf_lnum[idx] + generatedDf_count[idx] + diff_context > /* If this change ends before the line we have a match. */lnum) {
				return 0;
			} 
		}
		return 1/*
		 * "dp" and "do" commands.
		 */;
	}
	public Object diff_lnum_win(Object lnum) {
		diff_T dp = new diff_T();
		int idx;
		int i;
		linenr_T n = new linenr_T();
		idx = curbuf.diff_buf_idx();
		if (idx == /* safety check */8) {
			return (linenr_T)0;
		} 
		if (ModernizedCProgram.curtab.getTp_diff_invalid()) {
			((Object)/* update after a big change */0).ex_diffupdate();
		} 
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (lnum <= generatedDf_lnum[idx] + generatedDf_count[idx]) {
				break;
			} 
		}
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (dp == ((Object)/* When after the last change, compute relative to the last line number. */0)) {
			return generatedMl_line_count - (generatedMl_line_count - lnum);
		} 
		i = generatedW_buffer.diff_buf_idx();
		if (i == /* safety check */8) {
			return (linenr_T)0;
		} 
		n = lnum + (generatedDf_lnum[i] - generatedDf_lnum[idx]);
		if (n > generatedDf_lnum[i] + generatedDf_count[i]) {
			n = generatedDf_lnum[i] + generatedDf_count[i];
		} 
		return n/*
		 * Handle an ED style diff line.
		 * Return FAIL if the line does not contain diff info.
		 */;
	}
	public int current_win_nr() {
		win_T wp = new win_T();
		int nr = 0;
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			++nr;
			if (wp == win) {
				break;
			} 
		}
		return nr;
	}
	public int before_quit_autocmds(int quit_all, int forceit) {
		file_buffer generatedW_buffer = this.getW_buffer();
		generatedW_buffer.apply_autocmds(auto_event.EVENT_QUITPRE, ((Object)0), ((Object)0), 0)// Bail out when autocommands closed the window.;// Bail out when autocommands closed the window.
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		int generatedB_locked = generatedW_buffer.getB_locked();
		// Refuse to quit when the buffer in the last window is being closed (can// only happen in autocommands).if (!wp.win_valid() || ModernizedCProgram.curbuf_locked() || (generatedB_nwindows == 1 && generatedB_locked > 0)) {
			return 1;
		} 
		if (quit_all || (ModernizedCProgram.check_more(0, forceit) == 1 && ModernizedCProgram.only_one_window())) {
			curbuf.apply_autocmds(auto_event.EVENT_EXITPRE, ((Object)0), ((Object)0), 0);
			if (!wp.win_valid() || ModernizedCProgram.curbuf_locked() || (generatedB_nwindows == 1 && generatedB_locked > 0)) {
				return 1;
			} 
		} 
		return 0/*
		 * ":quit": quit current window, quit Vim if the last window is closed.
		 * ":{nr}quit": quit window {nr}
		 * Also used when closing a terminal window that's the last one.
		 */;
	}
	public int editing_arg_idx() {
		int generatedW_arg_idx = this.getW_arg_idx();
		arglist generatedW_alist = (win).getW_alist();
		growarray generatedAl_ga = generatedW_alist.getAl_ga();
		int generatedGa_len = generatedAl_ga.getGa_len();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_fnum = generatedW_buffer.getB_fnum();
		Object generatedGa_data = generatedAl_ga.getGa_data();
		Object[] generatedB_ffname = generatedW_buffer.getB_ffname();
		return !(generatedW_arg_idx >= (generatedGa_len) || (generatedB_fnum != ((aentry_T)generatedGa_data)[generatedW_arg_idx].getAe_fnum() && (generatedB_ffname == ((Object)0) || !(ModernizedCProgram.fullpathcmp(((aentry_T)generatedGa_data)[generatedW_arg_idx].alist_name(), generatedB_ffname, 1, 1) & 1/*
		 * Check if window "win" is editing the w_arg_idx file in its argument list.
		 */))));
	}
	public void check_arg_idx() {
		arglist generatedW_alist = (win).getW_alist();
		growarray generatedAl_ga = generatedW_alist.getAl_ga();
		int generatedGa_len = generatedAl_ga.getGa_len();
		int generatedW_arg_idx = this.getW_arg_idx();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_fnum = generatedW_buffer.getB_fnum();
		Object generatedGa_data = generatedAl_ga.getGa_data();
		Object[] generatedB_ffname = generatedW_buffer.getB_ffname();
		if ((generatedGa_len) > 1 && !win.editing_arg_idx()) {
			this.setW_arg_idx_invalid(1);
			if (generatedW_arg_idx != (generatedGa_len) - 1 && arg_had_last == 0 && generatedW_alist == ModernizedCProgram.global_alist && (generatedGa_len) > 0 && generatedW_arg_idx < (generatedGa_len) && (generatedB_fnum == ((aentry_T)generatedGa_data)[(generatedGa_len) - 1].getAe_fnum() || (generatedB_ffname != ((Object)0) && (ModernizedCProgram.fullpathcmp(((aentry_T)generatedGa_data)[(generatedGa_len) - 1].alist_name(), generatedB_ffname, 1, 1) & 1)))) {
				arg_had_last = 1;
			} 
		} else {
				this.setW_arg_idx_invalid(0);
				if (generatedW_arg_idx == (generatedGa_len) - 1 && generatedW_alist == ModernizedCProgram.global_alist) {
					arg_had_last = 1/*
					 * ":args", ":argslocal" and ":argsglobal".
					 */;
				} 
		} 
		// We are not editing the current entry in the argument list.
	}
	public void buflist_altfpos() {
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		Object generatedCol = generatedW_cursor.getCol();
		ModernizedCProgram.buflist_setfpos(curbuf, win, generatedLnum, generatedCol, 1/*
		 * Return TRUE if 'ffname' is not the same file as current file.
		 * Fname must have a full path (expanded by mch_FullName()).
		 */);
	}
	/*
	 * Get relative cursor position in window into "buf[buflen]", in the form 99%,
	 * using "Top", "Bot" or "All" when appropriate.
	 */
	public void get_rel_pos(Object buf, int buflen) {
		/* number of lines above window */long above;
		/* number of lines below window */long below;
		if (buflen < /* need at least 3 chars for writing */3) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedW_topline = this.getW_topline();
		above = generatedW_topline - 1;
		Object generatedW_topfill = this.getW_topfill();
		above += wp.diff_check_fill(generatedW_topline) - generatedW_topfill;
		if (generatedW_topline == 1 && generatedW_topfill >= 1) {
			above = /* All buffer lines are displayed and there is an
					     * indication of filler lines, that can be considered
					     * seeing all lines. */0;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_botline = this.getW_botline();
		below = generatedMl_line_count - generatedW_botline + 1;
		if (below <= 0) {
			ModernizedCProgram.vim_strncpy(buf, (char_u)(above == 0 ? ((byte)("All")) : ((byte)("Bot"))), (size_t)(buflen - 1));
		}  else if (above <= 0) {
			ModernizedCProgram.vim_strncpy(buf, (char_u)((byte)("Top")), (size_t)(buflen - 1));
		} else {
				ModernizedCProgram.vim_snprintf((byte)buf, (size_t)buflen, "%2d%%", above > -1024 ? (int)(above / ((above + below) / -1024)) : (int)(above * -1024 / (above + below/*
				 * Append (file 2 of 8) to "buf[buflen]", if editing more than one file.
				 * Return TRUE if it was appended.
				 */)));
		} 
	}
	public int append_arg_number(Object buf, int buflen, int add_file) {
		/* Add "file" before the arg number */char_u p = new char_u();
		if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) <= /* nothing to do */1) {
			return 0;
		} 
		p = buf + /*Error: Function owner not recognized*/strlen((byte)(/* go to the end of the buffer */buf));
		if (p - buf + 35 >= /* getting too long */buflen) {
			return 0;
		} 
		p++ = (byte)' ';
		p++ = (byte)'(';
		if (add_file) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p), (byte)("file "));
			p += 5;
		} 
		int generatedW_arg_idx_invalid = this.getW_arg_idx_invalid();
		int generatedW_arg_idx = this.getW_arg_idx();
		ModernizedCProgram.vim_snprintf((byte)p, (size_t)(buflen - (p - buf)), generatedW_arg_idx_invalid ? "(%d) of %d)" : "%d of %d)", generatedW_arg_idx + 1, ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()));
		return 1/*
		 * If fname is not a full path, make it a full path.
		 * Returns pointer to allocated memory (NULL for failure).
		 */;
	}
	public int qf_init(Object efile, Object errorformat, int newlist, Object qf_title, Object enc) {
		qf_info_T qi = ModernizedCProgram.ql_info;
		qf_info_S qf_info_S = new qf_info_S();
		if (wp != ((Object)0)) {
			qi = qf_info_S.ll_get_or_alloc_list(wp);
			if (qi == ((Object)0)) {
				return 0;
			} 
		} 
		int generatedQf_curlist = qi.getQf_curlist();
		return ModernizedCProgram.qf_init_ext(qi, generatedQf_curlist, efile, curbuf, ((Object)0), errorformat, newlist, (linenr_T)0, (linenr_T)0, qf_title, enc/*
		 * Set the title of the specified quickfix list. Frees the previous title.
		 * Prepends ':' to the title.
		 */);
	}
	// TRUE: start a new error list
	public void qf_free_all() {
		int i;
		qf_info_T qi = ModernizedCProgram.ql_info;
		Object generatedW_llist = this.getW_llist();
		Object generatedW_llist_ref = this.getW_llist_ref();
		int generatedQf_listcount = qi.getQf_listcount();
		qf_list_S qf_list_S = new qf_list_S();
		if (wp != ((Object)0)) {
			generatedW_llist.ll_free_all();
			generatedW_llist_ref.ll_free_all();
		} else {
				for (i = 0; i < generatedQf_listcount; ++i) {
					qf_list_S.qf_get_list(qi, i/*
					 * Delay freeing of location list stacks when the quickfix code is running.
					 * Used to avoid problems with autocmds freeing location list stacks when the
					 * quickfix code is still referencing the stack.
					 * Must always call decr_quickfix_busy() exactly once after this.
					 */).qf_free();
				}
		} 
	}
	public void copy_loclist_stack(window_S to) {
		qf_info_T qi = new qf_info_T();
		int idx;
		// When copying from a location list window, copy the referenced
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedW_llist_ref = this.getW_llist_ref();
		Object generatedW_llist = this.getW_llist();
		// location list. For other windows, copy the location list for// that window.if ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0))) {
			qi = generatedW_llist_ref;
		} else {
				qi = generatedW_llist;
		} 
		// no location list to copyif (qi == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		qf_info_S qf_info_S = new qf_info_S();
		// allocate a new location listif ((to.setW_llist(qf_info_S.qf_alloc_stack(.QFLT_LOCATION))) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedQf_listcount = qi.getQf_listcount();
		generatedW_llist.setQf_listcount(generatedQf_listcount);
		qf_list_S qf_list_S = new qf_list_S();
		// Copy the location lists one at a timefor (idx = 0; idx < generatedQf_listcount; ++idx) {
			generatedW_llist.setQf_curlist(idx);
			if (qf_list_S.qf_get_list(qi, idx).copy_loclist(qf_list_S.qf_get_list(generatedW_llist, idx)) == 0) {
				to.qf_free_all();
				return /*Error: Unsupported expression*/;
			} 
		}
		int generatedQf_curlist = qi.getQf_curlist();
		// current list// current listgeneratedW_llist.setQf_curlist(generatedQf_curlist);
	}
	public int qflist_valid(Object qf_id) {
		qf_info_T qi = ModernizedCProgram.ql_info;
		int i;
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedW_llist_ref = this.getW_llist_ref();
		Object generatedW_llist = this.getW_llist();
		if (wp != ((Object)0)) {
			qi = ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0)) ? generatedW_llist_ref : generatedW_llist);
			if (qi == ((Object)0)) {
				return 0;
			} 
		} 
		int generatedQf_listcount = qi.getQf_listcount();
		Object generatedQf_lists = qi.getQf_lists();
		for (i = 0; i < generatedQf_listcount; ++i) {
			if (generatedQf_lists[i].getQf_id() == qf_id) {
				return 1;
			} 
		}
		return 0/*
		 * When loading a file from the quickfix, the autocommands may modify it.
		 * This may invalidate the current quickfix entry.  This function checks
		 * whether an entry is still present in the quickfix list.
		 * Similar to location list.
		 */;
	}
	public window_S qf_find_help_win() {
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_buffer.bt_help()) {
				return wp;
			} 
		}
		return ((Object)0/*
		 * Set the location list for the specified window to 'qi'.
		 */);
	}
	public window_S qf_find_win_with_loclist(qf_info_S ll) {
		win_T wp = new win_T();
		Object generatedW_llist = wp.getW_llist();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_llist == ll && !generatedW_buffer.bt_quickfix()) {
				return wp;
			} 
		}
		return ((Object)0/*
		 * Find a window containing a normal buffer
		 */);
	}
	public window_S qf_find_win_with_normal_buf() {
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_buffer.bt_normal()) {
				return wp;
			} 
		}
		return ((Object)0/*
		 * Go to a window in any tabpage containing the specified file.  Returns TRUE
		 * if successfully jumped to the window. Otherwise returns FALSE.
		 */);
	}
	public void qf_mark_adjust(Object line1, Object line2, long amount, long amount_after) {
		int i;
		qfline_T qfp = new qfline_T();
		int idx;
		qf_info_T qi = ModernizedCProgram.ql_info;
		int found_one = 0;
		int buf_has_flag = wp == ((Object)0) ? 1 : 2;
		Object generatedB_has_qf_entry = curbuf.getB_has_qf_entry();
		if (!(generatedB_has_qf_entry & buf_has_flag)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedW_llist = this.getW_llist();
		if (wp != ((Object)0)) {
			if (generatedW_llist == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
			qi = generatedW_llist;
		} 
		int generatedQf_listcount = qi.getQf_listcount();
		qf_list_S qf_list_S = new qf_list_S();
		int generatedQf_count = qfl.getQf_count();
		int generatedQf_fnum = qfp.getQf_fnum();
		int generatedB_fnum = curbuf.getB_fnum();
		Object generatedQf_lnum = qfp.getQf_lnum();
		for (idx = 0; idx < generatedQf_listcount; ++idx) {
			qf_list_T qfl = qf_list_S.qf_get_list(qi, idx);
			if (!qfl.qf_list_empty()) {
				for (; !got_int && i <= generatedQf_count && qfp != ((Object)0); ) {
					if (generatedQf_fnum == generatedB_fnum) {
						found_one = 1;
						if (generatedQf_lnum >= line1 && generatedQf_lnum <= line2) {
							if (amount == LONG_MAX) {
								qfp.setQf_cleared(1);
							} else {
									generatedQf_lnum += amount;
							} 
						}  else if (amount_after && generatedQf_lnum > line2) {
							generatedQf_lnum += amount_after;
						} 
					} 
				}
			} 
		}
		if (!found_one) {
			generatedB_has_qf_entry &=  ~buf_has_flag/*
			 * Make a nice message out of the error character and the error number:
			 *  char    number	message
			 *  e or E    0		" error"
			 *  w or W    0		" warning"
			 *  i or I    0		" info"
			 *  0	      0		""
			 *  other     0		" c"
			 *  e or E    n		" error n"
			 *  w or W    n		" warning n"
			 *  i or I    n		" info n"
			 *  0	      n		" error n"
			 *  other     n		" c n"
			 *  1	      x		""	:helpgrep
			 */;
		} 
	}
	public void qf_win_goto(Object lnum) {
		win_T old_curwin = ModernizedCProgram.curwin;
		ModernizedCProgram.curwin = win;
		file_buffer generatedW_buffer = this.getW_buffer();
		curbuf = generatedW_buffer;
		ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		ModernizedCProgram.curwin.getW_cursor().setColadd(0);
		ModernizedCProgram.curwin.setW_curswant(0);
		// scroll to show the line// scroll to show the lineModernizedCProgram.update_topline();
		ModernizedCProgram.redraw_later(10);
		// update ruler// update rulerModernizedCProgram.curwin.setW_redr_status(1);
		ModernizedCProgram.curwin = old_curwin;
		curbuf = generatedW_buffer;
	}
	public Object qf_current_entry() {
		qf_info_T qi = ModernizedCProgram.ql_info;
		file_buffer generatedW_buffer = this.getW_buffer();
		Object generatedW_llist_ref = this.getW_llist_ref();
		if ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0))) {
			qi = generatedW_llist_ref;
		} 
		// In the location list window, use the referenced location list
		qf_list_S qf_list_S = new qf_list_S();
		return qf_list_S.qf_get_curlist(qi).getQf_index();
	}
	public window_S qf_find_win(qf_info_S qi) {
		win_T win = new win_T();
		window_S generatedW_next = win.getW_next();
		for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
			if (ModernizedCProgram.is_qf_win(win, qi)) {
				return win;
			} 
		}
		return ((Object)0/*
		 * Find a quickfix buffer.
		 * Searches in windows opened in all the tabs.
		 */);
	}
	public void cleanup_jumplist(int loadfiles) {
		int i;
		int from;
		int to;
		Object generatedW_jumplistlen = this.getW_jumplistlen();
		Object generatedW_jumplist = this.getW_jumplist();
		if (loadfiles/* If specified, load all the files from the jump list. This is
			 * needed to properly clean up duplicate entries, but will take some
			 * time. */) {
			for (i = 0; i < generatedW_jumplistlen; ++i) {
				if ((generatedW_jumplist[i].getFmark().getFnum() == 0) && (generatedW_jumplist[i].getFmark().getMark().getLnum() != 0)) {
					generatedW_jumplist[i].fname2fnum();
				} 
			}
		} 
		to = 0;
		Object generatedW_jumplistidx = this.getW_jumplistidx();
		for (from = 0; from < generatedW_jumplistlen; ++from) {
			if (generatedW_jumplistidx == from) {
				this.setW_jumplistidx(to);
			} 
			for (i = from + 1; i < generatedW_jumplistlen; ++i) {
				if (generatedW_jumplist[i].getFmark().getFnum() == generatedW_jumplist[from].getFmark().getFnum() && generatedW_jumplist[from].getFmark().getFnum() != 0 && generatedW_jumplist[i].getFmark().getMark().getLnum() == generatedW_jumplist[from].getFmark().getMark().getLnum()) {
					break;
				} 
			}
			if (i >= generatedW_jumplistlen) {
				generatedW_jumplist[to++] = generatedW_jumplist[from];
			} else {
					ModernizedCProgram.vim_free(generatedW_jumplist[from].getFname());
			} 
		}
		if (generatedW_jumplistidx == generatedW_jumplistlen) {
			this.setW_jumplistidx(to);
		} 
		this.setW_jumplistlen(to/*
		 * Copy the jumplist from window "from" to window "to".
		 */);
	}
	public void copy_jumplist(window_S to) {
		int i;
		Object generatedW_jumplistlen = this.getW_jumplistlen();
		Object generatedW_jumplist = to.getW_jumplist();
		for (i = 0; i < generatedW_jumplistlen; ++i) {
			generatedW_jumplist[i] = generatedW_jumplist[i];
			if (generatedW_jumplist[i].getFname() != ((Object)0)) {
				generatedW_jumplist[i].setFname(ModernizedCProgram.vim_strsave(generatedW_jumplist[i].getFname()));
			} 
		}
		to.setW_jumplistlen(generatedW_jumplistlen);
		Object generatedW_jumplistidx = this.getW_jumplistidx();
		to.setW_jumplistidx(generatedW_jumplistidx);
	}
	public void free_jumplist() {
		int i;
		Object generatedW_jumplistlen = this.getW_jumplistlen();
		Object generatedW_jumplist = this.getW_jumplist();
		for (i = 0; i < generatedW_jumplistlen; ++i) {
			ModernizedCProgram.vim_free(generatedW_jumplist[i].getFname());
		}
	}
	public void set_last_cursor() {
		file_buffer generatedW_buffer = this.getW_buffer();
		 generatedW_cursor = this.getW_cursor();
		if (generatedW_buffer != ((Object)0)) {
			generatedW_buffer.setB_last_cursor(generatedW_cursor);
		} 
	}
	public window_S get_optional_window([] argvars, int idx) {
		win_T win = ModernizedCProgram.curwin;
		window_S window_S = new window_S();
		if (argvars[idx].getV_type() != .VAR_UNKNOWN) {
			win = window_S.find_win_by_nr_or_id(argvars[idx]);
			if (win == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_invalwindow)));
				return ((Object)0);
			} 
		} 
		return win/*
		 * "col(string)" function
		 */;
	}
	public void comp_botline() {
		int n;
		linenr_T lnum = new linenr_T();
		int done;
		linenr_T last = new linenr_T();
		int folded;
		/*
		     * If w_cline_row is valid, start there.
		     * Otherwise have to start at w_topline.
		     */
		wp.check_cursor_moved();
		int generatedW_valid = this.getW_valid();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		int generatedW_cline_row = this.getW_cline_row();
		Object generatedW_topline = this.getW_topline();
		if (generatedW_valid & -1024) {
			lnum = generatedLnum;
			done = generatedW_cline_row;
		} else {
				lnum = generatedW_topline;
				done = 0;
		} 
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedW_topfill = this.getW_topfill();
		int generatedW_height = this.getW_height();
		for (; lnum <= generatedMl_line_count; ++lnum) {
			last = lnum;
			folded = 0;
			if (ModernizedCProgram.hasFoldingWin(wp, lnum, ((Object)0), last, 1, ((Object)0))) {
				n = 1;
				folded = 1;
			}  else if (lnum == generatedW_topline) {
				n = wp.plines_win_nofill(lnum, 1) + generatedW_topfill;
			} else {
					n = wp.plines_win(lnum, 1);
			} 
			if (lnum <= generatedLnum && last >= generatedLnum) {
				this.setW_cline_row(done);
				this.setW_cline_height(n);
				this.setW_cline_folded(folded);
				wp.redraw_for_cursorline();
				generatedW_valid |=  (-1024 | -1024);
			} 
			if (done + n > generatedW_height) {
				break;
			} 
			done += n;
			lnum = last;
		}
		this.setW_botline(/* wp->w_botline is the line that is just below the window */lnum);
		generatedW_valid |=  -1024 | -1024;
		wp.set_empty_rows(done);
	}
	public void redraw_for_cursorline() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		Object generatedWo_cul = generatedW_onebuf_opt.getWo_cul();
		int generatedW_valid = this.getW_valid();
		int generatedW_redr_type = this.getW_redr_type();
		Object generatedW_last_cursorline = this.getW_last_cursorline();
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		if ((generatedWo_rnu || generatedWo_cul) && (generatedW_valid & -1024) == 0 && !ModernizedCProgram.pum_visible()) {
			if (generatedWo_rnu) {
				wp.redraw_win_later(10);
			} 
			if (generatedWo_cul) {
				if (generatedW_redr_type <= 10 && generatedW_last_cursorline != 0) {
					wp.redrawWinline(generatedW_last_cursorline);
					wp.redrawWinline(generatedLnum);
				} else {
						wp.redraw_win_later(35);
				} 
			} 
		} 
	}
	public void check_cursor_moved() {
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		int generatedW_valid = this.getW_valid();
		Object generatedW_leftcol = this.getW_leftcol();
		Object generatedCol = generatedW_cursor.getCol();
		Object generatedW_valid_leftcol = this.getW_valid_leftcol();
		Object generatedColadd = generatedW_cursor.getColadd();
		 generatedW_valid_cursor = this.getW_valid_cursor();
		if (generatedLnum != generatedLnum) {
			generatedW_valid &=  ~(-1024 | -1024 | -1024 | -1024 | -1024 | -1024);
			this.setW_valid_cursor(generatedW_cursor);
			this.setW_valid_leftcol(generatedW_leftcol);
		}  else if (generatedCol != generatedCol || generatedW_leftcol != generatedW_valid_leftcol || generatedColadd != generatedColadd) {
			generatedW_valid &=  ~(-1024 | -1024 | -1024);
			generatedW_valid_cursor.setCol(generatedCol);
			this.setW_valid_leftcol(generatedW_leftcol);
			generatedW_valid_cursor.setColadd(generatedColadd);
		} 
	}
	public void changed_window_setting_win() {
		this.setW_lines_valid(0);
		wp.changed_line_abv_curs_win();
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~(-1024 | -1024 | -1024);
		wp.redraw_win_later(40/*
		 * Set wp->w_topline to a certain number.
		 */);
	}
	public void set_topline(Object lnum) {
		(Object)ModernizedCProgram.hasFoldingWin(wp, lnum, lnum, ((Object)0), 1, ((Object)/* go to first of folded lines */0));
		Object generatedW_botline = this.getW_botline();
		Object generatedW_topline = this.getW_topline();
		generatedW_botline += lnum - generatedW_topline;
		this.setW_topline(lnum);
		this.setW_topline_was_set(1);
		this.setW_topfill(0);
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~(-1024 | -1024 | -1024 | -1024);
		ModernizedCProgram.redraw_later(/* Don't set VALID_TOPLINE here, 'scrolloff' needs to be checked. */10/*
		 * Call this function when the length of the cursor line (in screen
		 * characters) has changed, and the change is before the cursor.
		 * Need to take care of w_botline separately!
		 */);
	}
	public void changed_cline_bef_curs_win() {
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~(-1024 | -1024 | -1024 | -1024 | -1024/*
		 * Call this function when the length of a line (in screen characters) above
		 * the cursor have changed.
		 * Need to take care of w_botline separately!
		 */);
	}
	public void changed_line_abv_curs_win() {
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~(-1024 | -1024 | -1024 | -1024 | -1024 | -1024/*
		 * Make sure the value of curwin->w_botline is valid.
		 */);
	}
	public void invalidate_botline_win() {
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~(-1024 | -1024);
	}
	public void approximate_botline_win() {
		int generatedW_valid = this.getW_valid();
		generatedW_valid &=  ~-1024/*
		 * Return TRUE if curwin->w_wrow and curwin->w_wcol are valid.
		 */;
	}
	/*
	 * Compute wp->w_cline_row and wp->w_cline_height, based on the current value
	 * of wp->w_topline.
	 */
	public void curs_rows() {
		linenr_T lnum = new linenr_T();
		int i;
		int all_invalid;
		int valid;
		long fold_count;
		int generatedW_lines_valid = this.getW_lines_valid();
		w_line[] generatedW_lines = this.getW_lines();
		Object generatedW_topline = this.getW_topline();
		all_invalid = (!/*Error: Function owner not recognized*/redrawing() || generatedW_lines_valid == 0 || generatedW_lines[0].getWl_lnum() > generatedW_topline);
		i = 0;
		this.setW_cline_row(0);
		 generatedW_cursor = this.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		file_buffer generatedW_buffer = this.getW_buffer();
		int generatedB_mod_set = generatedW_buffer.getB_mod_set();
		Object generatedB_mod_top = generatedW_buffer.getB_mod_top();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		int generatedW_cline_row = this.getW_cline_row();
		Object generatedW_topfill = this.getW_topfill();
		for (lnum = generatedW_topline; lnum < generatedLnum; ++i) {
			valid = 0;
			if (!all_invalid && i < generatedW_lines_valid) {
				if (generatedW_lines[i].getWl_lnum() < lnum || !generatedW_lines[i].getWl_valid()) {
					continue;
				} 
				if (generatedW_lines[i].getWl_lnum() == lnum) {
					if (!generatedB_mod_set || generatedW_lines[i].getWl_lastlnum() < generatedLnum || generatedB_mod_top > generatedW_lines[i].getWl_lastlnum() + 1) {
						valid = 1;
					} 
				}  else if (generatedW_lines[i].getWl_lnum() > lnum) {
					--/* hold at inserted lines */i;
				} 
			} 
			if (valid && (lnum != generatedW_topline || !generatedWo_diff)) {
				lnum = generatedW_lines[i].getWl_lastlnum() + 1;
				if (lnum > generatedLnum) {
					break;
				} 
				generatedW_cline_row += generatedW_lines[i].getWl_size();
			} else {
					fold_count = ModernizedCProgram.foldedCount(wp, lnum, ((Object)0));
					if (fold_count) {
						lnum += fold_count;
						if (lnum > generatedLnum) {
							break;
						} 
						++generatedW_cline_row;
					}  else if (lnum == generatedW_topline) {
						generatedW_cline_row += wp.plines_win_nofill(lnum++, 1) + generatedW_topfill;
					} else {
							generatedW_cline_row += wp.plines_win(lnum++, 1);
					} 
			} 
		}
		wp.check_cursor_moved();
		int generatedW_valid = this.getW_valid();
		if (!(generatedW_valid & -1024)) {
			if (all_invalid || i == generatedW_lines_valid || (i < generatedW_lines_valid && (!generatedW_lines[i].getWl_valid() || generatedW_lines[i].getWl_lnum() != generatedLnum))) {
				if (generatedLnum == generatedW_topline) {
					this.setW_cline_height(wp.plines_win_nofill(generatedLnum, 1) + generatedW_topfill);
				} else {
						this.setW_cline_height(wp.plines_win(generatedLnum, 1));
				} 
				this.setW_cline_folded(ModernizedCProgram.hasFoldingWin(wp, generatedLnum, ((Object)0), ((Object)0), 1, ((Object)0)));
			}  else if (i > generatedW_lines_valid) {
				this.setW_cline_height(/* a line that is too long to fit on the last screen line */0);
				this.setW_cline_folded(ModernizedCProgram.hasFoldingWin(wp, generatedLnum, ((Object)0), ((Object)0), 1, ((Object)0)));
			} else {
					this.setW_cline_height(generatedW_lines[i].getWl_size());
					this.setW_cline_folded(generatedW_lines[i].getWl_folded());
			} 
		} 
		ModernizedCProgram.curwin.redraw_for_cursorline();
		generatedW_valid |=  -1024 | -1024/*
		 * Validate curwin->w_virtcol only.
		 */;
	}
	public void validate_virtcol_win() {
		wp.check_cursor_moved();
		int generatedW_valid = this.getW_valid();
		 generatedW_cursor = this.getW_cursor();
		Object generatedW_virtcol = this.getW_virtcol();
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_cuc = generatedW_onebuf_opt.getWo_cuc();
		if (!(generatedW_valid & -1024)) {
			ModernizedCProgram.getvvcol(wp, generatedW_cursor, ((Object)0), (generatedW_virtcol), ((Object)0));
			generatedW_valid |=  -1024;
			if (generatedWo_cuc && !ModernizedCProgram.pum_visible()) {
				wp.redraw_win_later(35);
			} 
		} 
	}
	public int win_col_off() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		Object generatedWo_fdc = generatedW_onebuf_opt.getWo_fdc();
		return (((generatedWo_nu || generatedWo_rnu) ? /*Error: Function owner not recognized*/number_width(wp) + 1 : 0) + (cmdwin_type == 0 || wp != ModernizedCProgram.curwin ? 0 : 1) + generatedWo_fdc + (wp.signcolumn_on() ? 2 : 0));
	}
	public int win_col_off2() {
		 generatedW_onebuf_opt = this.getW_onebuf_opt();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		if ((generatedWo_nu || generatedWo_rnu) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'n') != ((Object)0)) {
			return /*Error: Function owner not recognized*/number_width(wp) + 1;
		} 
		return 0;
	}
	/*
	 * Don't end up with too many filler lines in the window.
	 */
	public void check_topfill(int down) {
		/* when TRUE scroll down when not enough space */int n;
		Object generatedW_topfill = this.getW_topfill();
		Object generatedW_topline = this.getW_topline();
		int generatedW_height = this.getW_height();
		if (generatedW_topfill > 0) {
			n = wp.plines_win_nofill(generatedW_topline, 1);
			if (generatedW_topfill + n > generatedW_height) {
				if (down && generatedW_topline > 1) {
					--generatedW_topline;
					this.setW_topfill(0);
				} else {
						this.setW_topfill(generatedW_height - n);
						if (generatedW_topfill < 0) {
							this.setW_topfill(0);
						} 
				} 
			} 
		} 
	}
	public void set_empty_rows(int used) {
		this.setW_filler_rows(0);
		int generatedW_height = this.getW_height();
		Object generatedW_botline = this.getW_botline();
		file_buffer generatedW_buffer = this.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedW_empty_rows = this.getW_empty_rows();
		Object generatedW_filler_rows = this.getW_filler_rows();
		if (used == 0) {
			this.setW_empty_rows(/* single line that doesn't fit */0);
		} else {
				this.setW_empty_rows(generatedW_height - used);
				if (generatedW_botline <= generatedMl_line_count) {
					this.setW_filler_rows(wp.diff_check_fill(generatedW_botline));
					if (generatedW_empty_rows > generatedW_filler_rows) {
						generatedW_empty_rows -= generatedW_filler_rows;
					} else {
							this.setW_filler_rows(generatedW_empty_rows);
							this.setW_empty_rows(0);
					} 
				} 
		} 
	}
	public void scroll_region_set(int off) {
		int generatedW_winrow = this.getW_winrow();
		Object generatedW_winbar_height = this.getW_winbar_height();
		int generatedW_height = this.getW_height();
		ModernizedCProgram.out_str((char_u)(ModernizedCProgram.tgoto((byte)(ModernizedCProgram.term_strings[(int)(SpecialKey.KS_CS)]), (generatedW_winrow + generatedW_winbar_height) + generatedW_height - 1, (generatedW_winrow + generatedW_winbar_height) + off)));
		int generatedW_width = this.getW_width();
		int generatedW_wincol = this.getW_wincol();
		if ((ModernizedCProgram.term_strings[(int)(SpecialKey.KS_CSV)]) != (byte)'\000' && generatedW_width != Columns) {
			ModernizedCProgram.out_str((char_u)(ModernizedCProgram.tgoto((byte)(ModernizedCProgram.term_strings[(int)(SpecialKey.KS_CSV)]), generatedW_wincol + generatedW_width - 1, generatedW_wincol)));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screen_start();
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int newW_id) {
		w_id = newW_id;
	}
	public file_buffer getW_buffer() {
		return w_buffer;
	}
	public void setW_buffer(file_buffer newW_buffer) {
		w_buffer = newW_buffer;
	}
	public window_S getW_prev() {
		return w_prev;
	}
	public void setW_prev(window_S newW_prev) {
		w_prev = newW_prev;
	}
	public window_S getW_next() {
		return w_next;
	}
	public void setW_next(window_S newW_next) {
		w_next = newW_next;
	}
	public int getW_closing() {
		return w_closing;
	}
	public void setW_closing(int newW_closing) {
		w_closing = newW_closing;
	}
	public frame_S getW_frame() {
		return w_frame;
	}
	public void setW_frame(frame_S newW_frame) {
		w_frame = newW_frame;
	}
	public  getW_cursor() {
		return w_cursor;
	}
	public void setW_cursor( newW_cursor) {
		w_cursor = newW_cursor;
	}
	public Object getW_curswant() {
		return w_curswant;
	}
	public void setW_curswant(Object newW_curswant) {
		w_curswant = newW_curswant;
	}
	public int getW_set_curswant() {
		return w_set_curswant;
	}
	public void setW_set_curswant(int newW_set_curswant) {
		w_set_curswant = newW_set_curswant;
	}
	public byte getW_old_visual_mode() {
		return w_old_visual_mode;
	}
	public void setW_old_visual_mode(byte newW_old_visual_mode) {
		w_old_visual_mode = newW_old_visual_mode;
	}
	public Object getW_old_cursor_lnum() {
		return w_old_cursor_lnum;
	}
	public void setW_old_cursor_lnum(Object newW_old_cursor_lnum) {
		w_old_cursor_lnum = newW_old_cursor_lnum;
	}
	public Object getW_old_cursor_fcol() {
		return w_old_cursor_fcol;
	}
	public void setW_old_cursor_fcol(Object newW_old_cursor_fcol) {
		w_old_cursor_fcol = newW_old_cursor_fcol;
	}
	public Object getW_old_cursor_lcol() {
		return w_old_cursor_lcol;
	}
	public void setW_old_cursor_lcol(Object newW_old_cursor_lcol) {
		w_old_cursor_lcol = newW_old_cursor_lcol;
	}
	public Object getW_old_visual_lnum() {
		return w_old_visual_lnum;
	}
	public void setW_old_visual_lnum(Object newW_old_visual_lnum) {
		w_old_visual_lnum = newW_old_visual_lnum;
	}
	public Object getW_old_visual_col() {
		return w_old_visual_col;
	}
	public void setW_old_visual_col(Object newW_old_visual_col) {
		w_old_visual_col = newW_old_visual_col;
	}
	public Object getW_old_curswant() {
		return w_old_curswant;
	}
	public void setW_old_curswant(Object newW_old_curswant) {
		w_old_curswant = newW_old_curswant;
	}
	public Object getW_topline() {
		return w_topline;
	}
	public void setW_topline(Object newW_topline) {
		w_topline = newW_topline;
	}
	public byte getW_topline_was_set() {
		return w_topline_was_set;
	}
	public void setW_topline_was_set(byte newW_topline_was_set) {
		w_topline_was_set = newW_topline_was_set;
	}
	public Object getW_leftcol() {
		return w_leftcol;
	}
	public void setW_leftcol(Object newW_leftcol) {
		w_leftcol = newW_leftcol;
	}
	public Object getW_skipcol() {
		return w_skipcol;
	}
	public void setW_skipcol(Object newW_skipcol) {
		w_skipcol = newW_skipcol;
	}
	public int getW_winrow() {
		return w_winrow;
	}
	public void setW_winrow(int newW_winrow) {
		w_winrow = newW_winrow;
	}
	public int getW_height() {
		return w_height;
	}
	public void setW_height(int newW_height) {
		w_height = newW_height;
	}
	public int getW_status_height() {
		return w_status_height;
	}
	public void setW_status_height(int newW_status_height) {
		w_status_height = newW_status_height;
	}
	public int getW_wincol() {
		return w_wincol;
	}
	public void setW_wincol(int newW_wincol) {
		w_wincol = newW_wincol;
	}
	public int getW_width() {
		return w_width;
	}
	public void setW_width(int newW_width) {
		w_width = newW_width;
	}
	public int getW_vsep_width() {
		return w_vsep_width;
	}
	public void setW_vsep_width(int newW_vsep_width) {
		w_vsep_width = newW_vsep_width;
	}
	public  getW_save_cursor() {
		return w_save_cursor;
	}
	public void setW_save_cursor( newW_save_cursor) {
		w_save_cursor = newW_save_cursor;
	}
	public int getW_valid() {
		return w_valid;
	}
	public void setW_valid(int newW_valid) {
		w_valid = newW_valid;
	}
	public  getW_valid_cursor() {
		return w_valid_cursor;
	}
	public void setW_valid_cursor( newW_valid_cursor) {
		w_valid_cursor = newW_valid_cursor;
	}
	public Object getW_valid_leftcol() {
		return w_valid_leftcol;
	}
	public void setW_valid_leftcol(Object newW_valid_leftcol) {
		w_valid_leftcol = newW_valid_leftcol;
	}
	public int getW_cline_height() {
		return w_cline_height;
	}
	public void setW_cline_height(int newW_cline_height) {
		w_cline_height = newW_cline_height;
	}
	public int getW_cline_row() {
		return w_cline_row;
	}
	public void setW_cline_row(int newW_cline_row) {
		w_cline_row = newW_cline_row;
	}
	public Object getW_virtcol() {
		return w_virtcol;
	}
	public void setW_virtcol(Object newW_virtcol) {
		w_virtcol = newW_virtcol;
	}
	public int getW_wrow() {
		return w_wrow;
	}
	public void setW_wrow(int newW_wrow) {
		w_wrow = newW_wrow;
	}
	public int getW_wcol() {
		return w_wcol;
	}
	public void setW_wcol(int newW_wcol) {
		w_wcol = newW_wcol;
	}
	public Object getW_botline() {
		return w_botline;
	}
	public void setW_botline(Object newW_botline) {
		w_botline = newW_botline;
	}
	public int getW_empty_rows() {
		return w_empty_rows;
	}
	public void setW_empty_rows(int newW_empty_rows) {
		w_empty_rows = newW_empty_rows;
	}
	public int getW_lines_valid() {
		return w_lines_valid;
	}
	public void setW_lines_valid(int newW_lines_valid) {
		w_lines_valid = newW_lines_valid;
	}
	public w_line[] getW_lines() {
		return w_lines;
	}
	public void setW_lines(w_line[] newW_lines) {
		w_lines = newW_lines;
	}
	public int getW_redr_type() {
		return w_redr_type;
	}
	public void setW_redr_type(int newW_redr_type) {
		w_redr_type = newW_redr_type;
	}
	public int getW_upd_rows() {
		return w_upd_rows;
	}
	public void setW_upd_rows(int newW_upd_rows) {
		w_upd_rows = newW_upd_rows;
	}
	public Object getW_redraw_top() {
		return w_redraw_top;
	}
	public void setW_redraw_top(Object newW_redraw_top) {
		w_redraw_top = newW_redraw_top;
	}
	public Object getW_redraw_bot() {
		return w_redraw_bot;
	}
	public void setW_redraw_bot(Object newW_redraw_bot) {
		w_redraw_bot = newW_redraw_bot;
	}
	public int getW_redr_status() {
		return w_redr_status;
	}
	public void setW_redr_status(int newW_redr_status) {
		w_redr_status = newW_redr_status;
	}
	public int getW_alt_fnum() {
		return w_alt_fnum;
	}
	public void setW_alt_fnum(int newW_alt_fnum) {
		w_alt_fnum = newW_alt_fnum;
	}
	public arglist getW_alist() {
		return w_alist;
	}
	public void setW_alist(arglist newW_alist) {
		w_alist = newW_alist;
	}
	public int getW_arg_idx() {
		return w_arg_idx;
	}
	public void setW_arg_idx(int newW_arg_idx) {
		w_arg_idx = newW_arg_idx;
	}
	public int getW_arg_idx_invalid() {
		return w_arg_idx_invalid;
	}
	public void setW_arg_idx_invalid(int newW_arg_idx_invalid) {
		w_arg_idx_invalid = newW_arg_idx_invalid;
	}
	public Object getW_localdir() {
		return w_localdir;
	}
	public void setW_localdir(Object newW_localdir) {
		w_localdir = newW_localdir;
	}
	public  getW_onebuf_opt() {
		return w_onebuf_opt;
	}
	public void setW_onebuf_opt( newW_onebuf_opt) {
		w_onebuf_opt = newW_onebuf_opt;
	}
	public  getW_allbuf_opt() {
		return w_allbuf_opt;
	}
	public void setW_allbuf_opt( newW_allbuf_opt) {
		w_allbuf_opt = newW_allbuf_opt;
	}
	public long getW_p_siso() {
		return w_p_siso;
	}
	public void setW_p_siso(long newW_p_siso) {
		w_p_siso = newW_p_siso;
	}
	public long getW_p_so() {
		return w_p_so;
	}
	public void setW_p_so(long newW_p_so) {
		w_p_so = newW_p_so;
	}
	public long getW_scbind_pos() {
		return w_scbind_pos;
	}
	public void setW_scbind_pos(long newW_scbind_pos) {
		w_scbind_pos = newW_scbind_pos;
	}
	public  getW_pcmark() {
		return w_pcmark;
	}
	public void setW_pcmark( newW_pcmark) {
		w_pcmark = newW_pcmark;
	}
	public  getW_prev_pcmark() {
		return w_prev_pcmark;
	}
	public void setW_prev_pcmark( newW_prev_pcmark) {
		w_prev_pcmark = newW_prev_pcmark;
	}
	public Object getW_tagstack() {
		return w_tagstack;
	}
	public void setW_tagstack(Object newW_tagstack) {
		w_tagstack = newW_tagstack;
	}
	public int getW_tagstackidx() {
		return w_tagstackidx;
	}
	public void setW_tagstackidx(int newW_tagstackidx) {
		w_tagstackidx = newW_tagstackidx;
	}
	public int getW_tagstacklen() {
		return w_tagstacklen;
	}
	public void setW_tagstacklen(int newW_tagstacklen) {
		w_tagstacklen = newW_tagstacklen;
	}
	public int getW_fraction() {
		return w_fraction;
	}
	public void setW_fraction(int newW_fraction) {
		w_fraction = newW_fraction;
	}
	public int getW_prev_fraction_row() {
		return w_prev_fraction_row;
	}
	public void setW_prev_fraction_row(int newW_prev_fraction_row) {
		w_prev_fraction_row = newW_prev_fraction_row;
	}
}
