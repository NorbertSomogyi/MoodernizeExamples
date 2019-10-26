package application;

// line number in buffer
// nr of inserted/changed lines
/*
 * Tab pages point to the top frame of each tab page.
 * Note: Most values are NOT valid for the current tab page!  Use "curwin",
 * "firstwin", etc. for that.  "tp_topframe" is always valid and can be
 * compared against "topframe" to find the current tab page.
 */
public class tabpage_S {
	private tabpage_S tp_next;
	private frame_S tp_topframe;
	private window_S tp_curwin;
	private window_S tp_prevwin;
	private window_S tp_firstwin;
	private window_S tp_lastwin;
	private long tp_old_Rows;
	private long tp_old_Columns;
	private long tp_ch_used;
	private Object tp_localdir;
	private Object tp_snapshot;
	
	public tabpage_S(tabpage_S tp_next, frame_S tp_topframe, window_S tp_curwin, window_S tp_prevwin, window_S tp_firstwin, window_S tp_lastwin, long tp_old_Rows, long tp_old_Columns, long tp_ch_used, Object tp_localdir, Object tp_snapshot) {
		setTp_next(tp_next);
		setTp_topframe(tp_topframe);
		setTp_curwin(tp_curwin);
		setTp_prevwin(tp_prevwin);
		setTp_firstwin(tp_firstwin);
		setTp_lastwin(tp_lastwin);
		setTp_old_Rows(tp_old_Rows);
		setTp_old_Columns(tp_old_Columns);
		setTp_ch_used(tp_ch_used);
		setTp_localdir(tp_localdir);
		setTp_snapshot(tp_snapshot);
	}
	public tabpage_S() {
	}
	
	public void python3_tabpage_free() {
		Object generatedTp_python3_ref = this.getTp_python3_ref();
		if (generatedTp_python3_ref != ((Object)0)) {
			TabPageObject tp = generatedTp_python3_ref;
			tp.setTab(((tabpage_T)(true)));
			this.setTp_python3_ref(((Object)0));
		} 
	}
	public int current_tab_nr() {
		tabpage_T tp = new tabpage_T();
		int nr = 0;
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			++nr;
			if (tp == tab) {
				break;
			} 
		}
		return nr;
	}
	/*
	 * Execute one Ex command.
	 *
	 * If 'sourcing' is TRUE, the command will be included in the error message.
	 *
	 * 1. skip comment lines and leading space
	 * 2. handle command modifiers
	 * 3. find the command
	 * 4. parse range
	 * 5. Parse the command.
	 * 6. parse arguments
	 * 7. switch on command name
	 *
	 * Note: "fgetline" can be NULL.
	 *
	 * This function may be called recursively!
	 */
	public void tabpage_close_other(int forceit) {
		int done = 0;
		win_T wp = new win_T();
		int h = ModernizedCProgram.tabline_height();
		window_S generatedTp_firstwin = this.getTp_firstwin();
		while (++done < /* Limit to 1000 windows, autocommands may add a window while we close
		     * one.  OK, so I'm paranoid... */1000) {
			wp = generatedTp_firstwin;
			ModernizedCProgram.ex_win_close(forceit, wp, tp);
			if (!tp.valid_tabpage() || generatedTp_firstwin == /* Autocommands may delete the tab page under our fingers and we may
				 * fail to close a window with a modified buffer. */wp) {
				break;
			} 
		}
		curbuf.apply_autocmds(auto_event.EVENT_TABCLOSED, ((Object)0), ((Object)0), 0);
		redraw_tabline = 1;
		if (h != ModernizedCProgram.tabline_height()) {
			ModernizedCProgram.shell_new_rows();
		} 
	}
	public void python_tabpage_free() {
		Object generatedTp_python_ref = this.getTp_python_ref();
		if (generatedTp_python_ref != ((Object)0)) {
			TabPageObject tp = generatedTp_python_ref;
			tp.setTab(((tabpage_T)(true)));
			this.setTp_python_ref(((Object)0));
		} 
	}
	public void popup_close_tabpage(int id) {
		win_T wp = new win_T();
		Object generatedTp_first_popupwin = this.getTp_first_popupwin();
		win_T root = generatedTp_first_popupwin;
		win_T prev = ((Object)0);
		int generatedW_id = wp.getW_id();
		window_S generatedW_next = wp.getW_next();
		for (wp = root; wp != ((Object)0); ) {
			if (generatedW_id == id) {
				if (prev == ((Object)0)) {
					root = generatedW_next;
				} else {
						prev.setW_next(generatedW_next);
				} 
				wp.popup_free();
				return ;
			} 
		}
	}
	public tabpage_S alt_tabpage() {
		tabpage_T tp = new tabpage_T();
		if (ModernizedCProgram.curtab.getTp_next() != ((Object)/* Use the next tab page if possible. */0)) {
			return ModernizedCProgram.curtab.getTp_next();
		} 
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; generatedTp_next != ModernizedCProgram.curtab; tp = generatedTp_next) {
			;
		}
		return tp/*
		 * Find the left-upper window in frame "frp".
		 */;
	}
	public tabpage_S alloc_tabpage() {
		tabpage_T tp = new tabpage_T();
		tp = (tabpage_T)ModernizedCProgram.alloc_clear();
		if (tp == ((Object)0)) {
			return ((Object)0);
		} 
		dictvar_S dictvar_S = new dictvar_S();
		tp.setTp_vars(dictvar_S.dict_alloc());
		Object generatedTp_vars = tp.getTp_vars();
		if (generatedTp_vars == ((Object)0)) {
			ModernizedCProgram.vim_free(tp);
			return ((Object)0);
		} 
		Object generatedTp_winvar = tp.getTp_winvar();
		ModernizedCProgram.init_var_dict(generatedTp_vars, generatedTp_winvar, 1);
		tp.setTp_diff_invalid(1);
		tp.setTp_ch_used(ModernizedCProgram.p_ch);
		return tp;
	}
	public void free_tabpage() {
		int idx;
		tp.diff_clear();
		Object generatedTp_first_popupwin = this.getTp_first_popupwin();
		while (generatedTp_first_popupwin != ((Object)0)) {
			tp.popup_close_tabpage(generatedTp_first_popupwin.getW_id());
		}
		for (idx = 0; idx < 2; ++idx) {
			tp.clear_snapshot(idx);
		}
		Object generatedTp_vars = this.getTp_vars();
		generatedTp_vars.getDv_hashtab().vars_clear();
		generatedTp_vars.getDv_hashtab().hash_init();
		generatedTp_vars.unref_var_dict();
		Object generatedTp_localdir = this.getTp_localdir();
		ModernizedCProgram.vim_free(generatedTp_localdir);
		ModernizedCProgram.vim_free(tp/*
		 * Create a new Tab page with one window.
		 * It will edit the current buffer, like after ":split".
		 * When "after" is 0 put it just after the current Tab page.
		 * Otherwise put it just before tab page "after".
		 * Return FAIL or OK.
		 */);
	}
	public int valid_tabpage() {
		tabpage_T tp = new tabpage_T();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			if (tp == tpc) {
				return 1;
			} 
		}
		return 0/*
		 * Return TRUE when "tpc" points to a valid tab page and at least one window is
		 * valid.
		 */;
	}
	public int valid_tabpage_win() {
		tabpage_T tp = new tabpage_T();
		win_T wp = new win_T();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			if (tp == tpc) {
				for ((wp) = ((tp) == ((Object)0) || (tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
					if (wp.win_valid_any_tab()) {
						return 1;
					} 
				}
				return 0;
			} 
		}
		return /* shouldn't happen */0/*
		 * Close tabpage "tab", assuming it has no windows in it.
		 * There must be another tabpage or this will crash.
		 */;
	}
	public void close_tabpage() {
		tabpage_T ptp = new tabpage_T();
		tabpage_S generatedTp_next = this.getTp_next();
		if (tab == ModernizedCProgram.first_tabpage) {
			ModernizedCProgram.first_tabpage = generatedTp_next;
			ptp = ModernizedCProgram.first_tabpage;
		} else {
				for (ptp = ModernizedCProgram.first_tabpage; ptp != ((Object)0) && generatedTp_next != tab; ptp = generatedTp_next) {
					;
				}
				((ptp != ((Object)0)) ? (Object)0 : ._assert("ptp != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Vim\\src\\window.c", 3974));
				ptp.setTp_next(generatedTp_next);
		} 
		ptp.goto_tabpage_tp(0, 0);
		tab/*
		 * Find tab page "n" (first one is 1).  Returns NULL when not found.
		 */.free_tabpage();
	}
	public tabpage_S find_tabpage(int n) {
		tabpage_T tp = new tabpage_T();
		int i = 1;
		if (n == 0) {
			return ModernizedCProgram.curtab;
		} 
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0) && i != n; tp = generatedTp_next) {
			++i;
		}
		return tp/*
		 * Get index of tab page "tp".  First one has index 1.
		 * When not found returns number of tab pages plus one.
		 */;
	}
	public int tabpage_index() {
		int i = 1;
		tabpage_T tp = new tabpage_T();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0) && tp != ftp; tp = generatedTp_next) {
			++i;
		}
		return i/*
		 * Prepare for leaving the current tab page.
		 * When autocommands change "curtab" we don't leave the tab page and return
		 * FAIL.
		 * Careful: When OK is returned need to get a new tab page very very soon!
		 */;
	}
	/*
	 * Go to tabpage "tp".
	 * Only trigger *Enter autocommands when trigger_enter_autocmds is TRUE.
	 * Only trigger *Leave autocommands when trigger_leave_autocmds is TRUE.
	 * Note: doesn't update the GUI tab.
	 */
	public void goto_tabpage_tp(int trigger_enter_autocmds, int trigger_leave_autocmds) {
		ModernizedCProgram.set_keep_msg(((Object)0), /* Don't repeat a message in another tab page. */0);
		window_S generatedTp_curwin = this.getTp_curwin();
		file_buffer generatedW_buffer = generatedTp_curwin.getW_buffer();
		if (tp != ModernizedCProgram.curtab && generatedW_buffer.leave_tabpage(trigger_leave_autocmds) == 1) {
			if (tp.valid_tabpage()) {
				ModernizedCProgram.enter_tabpage(tp, curbuf, trigger_enter_autocmds, trigger_leave_autocmds);
			} else {
					ModernizedCProgram.enter_tabpage(ModernizedCProgram.curtab, curbuf, trigger_enter_autocmds, trigger_leave_autocmds/*
					 * Enter window "wp" in tab page "tp".
					 * Also updates the GUI tab.
					 */);
			} 
		} 
	}
	public void clear_snapshot(int idx) {
		Object generatedTp_snapshot = this.getTp_snapshot();
		generatedTp_snapshot[idx].clear_snapshot_rec();
		generatedTp_snapshot[idx] = ((Object)0);
	}
	public void diff_mark_adjust_tp(int idx, Object line1, Object line2, long amount, long amount_after) {
		diff_T dp = new diff_T();
		diff_T dprev = new diff_T();
		diff_T dnext = new diff_T();
		int i;
		int inserted;
		int deleted;
		int n;
		int off;
		linenr_T last = new linenr_T();
		linenr_T lnum_deleted = /* lnum of remaining deletion */line1;
		int check_unchanged;
		if (ModernizedCProgram.diff_internal()) {
			this.setTp_diff_invalid(1);
			this.setTp_diff_update(1);
		} 
		// Will update diffs before redrawing.  Set _invalid to update the// diffs themselves, set _update to also update folds properly just
		if (line2 == LONG_MAX) {
			inserted = /* mark_adjust(99, MAXLNUM, 9, 0): insert lines */amount;
			deleted = 0;
		}  else if (amount_after > 0) {
			inserted = /* mark_adjust(99, 98, MAXLNUM, 9): a change that inserts lines*/amount_after;
			deleted = 0;
		} else {
				inserted = /* mark_adjust(98, 99, MAXLNUM, -2): delete lines */0;
				deleted = -amount_after;
		} 
		dprev = ((Object)0);
		Object generatedTp_first_diff = this.getTp_first_diff();
		dp = generatedTp_first_diff;
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dprev.getDf_count();
		Object generatedTp_diffbuf = this.getTp_diffbuf();
		Object generatedDf_next = dp.getDf_next();
		for (; ; ) {
			if ((dp == ((Object)0) || generatedDf_lnum[idx] - 1 > line2 || (line2 == LONG_MAX && generatedDf_lnum[idx] > line1)) && (dprev == ((Object)0) || generatedDf_lnum[idx] + generatedDf_count[idx] < line1) && !ModernizedCProgram.diff_busy) {
				dnext = ModernizedCProgram.diff_alloc_new(tp, dprev, dp);
				if (dnext == ((Object)0)) {
					return ;
				} 
				generatedDf_lnum[idx] = line1;
				generatedDf_count[idx] = inserted;
				for (i = 0; i < 8; ++i) {
					if (generatedTp_diffbuf[i] != ((Object)0) && i != idx) {
						if (dprev == ((Object)0)) {
							generatedDf_lnum[i] = line1;
						} else {
								generatedDf_lnum[i] = line1 + (generatedDf_lnum[i] + generatedDf_count[i]) - (generatedDf_lnum[idx] + generatedDf_count[idx]);
						} 
						generatedDf_count[i] = deleted;
					} 
				}
			} 
			if (dp == ((Object)/* if at end of the list, quit */0)) {
				break;
			} 
			last = generatedDf_lnum[idx] + generatedDf_count[idx] - /* compute last line of this change */1;
			if (last >= line1 - /* 1. change completely above line1: nothing to do */1) {
				if (generatedDf_lnum[idx] - (deleted + inserted != 0) > /* 6. change below line2: only adjust for amount_after; also when
					     * "deleted" became zero when deleted all lines between two diffs */line2) {
					if (amount_after == 0) {
						break;
					} 
					generatedDf_lnum[idx] += amount_after;
				} else {
						check_unchanged = 0;
						if (deleted > /* 2. 3. 4. 5.: inserted/deleted lines touching this diff. */0) {
							if (generatedDf_lnum[idx] >= line1) {
								off = generatedDf_lnum[idx] - lnum_deleted;
								if (last <= line2) {
									if (generatedDf_next != ((Object)/* 4. delete all lines of diff */0) && generatedDf_lnum[idx] - 1 <= line2) {
										n = generatedDf_lnum[idx] - /* delete continues in next diff, only do
														 * lines until that one */lnum_deleted;
										deleted -= n;
										n -= generatedDf_count[idx];
										lnum_deleted = generatedDf_lnum[idx];
									} else {
											n = deleted - generatedDf_count[idx];
									} 
									generatedDf_count[idx] = 0;
								} else {
										n = /* 5. delete lines at or just before top of diff */off;
										generatedDf_count[idx] -= line2 - generatedDf_lnum[idx] + 1;
										check_unchanged = 1;
								} 
								generatedDf_lnum[idx] = line1;
							} else {
									off = 0;
									if (last < line2) {
										generatedDf_count[idx] -= last - lnum_deleted + /* 2. delete at end of of diff */1;
										if (generatedDf_next != ((Object)0) && generatedDf_lnum[idx] - 1 <= line2) {
											n = generatedDf_lnum[idx] - 1 - /* delete continues in next diff, only do
															 * lines until that one */last;
											deleted -= generatedDf_lnum[idx] - lnum_deleted;
											lnum_deleted = generatedDf_lnum[idx];
										} else {
												n = line2 - last;
										} 
										check_unchanged = 1;
									} else {
											n = /* 3. delete lines inside the diff */0;
											generatedDf_count[idx] -= deleted;
									} 
							} 
							for (i = 0; i < 8; ++i) {
								if (generatedTp_diffbuf[i] != ((Object)0) && i != idx) {
									generatedDf_lnum[i] -= off;
									generatedDf_count[i] += n;
								} 
							}
						} else {
								if (generatedDf_lnum[idx] <= line1) {
									generatedDf_count[idx] += /* inserted lines somewhere in this diff */inserted;
									check_unchanged = 1;
								} else {
										generatedDf_lnum[idx] += /* inserted lines somewhere above this diff */inserted;
								} 
						} 
						if (check_unchanged/* Check if inserted lines are equal, may reduce the
								     * size of the diff.  TODO: also check for equal lines
								     * in the middle and perhaps split the block. */) {
							ModernizedCProgram.diff_check_unchanged(tp, dp);
						} 
				} 
			} 
			if (dprev != ((Object)0) && generatedDf_lnum[idx] + generatedDf_count[/* check if this block touches the previous one, may merge them. */idx] == generatedDf_lnum[idx]) {
				for (i = 0; i < 8; ++i) {
					if (generatedTp_diffbuf[i] != ((Object)0)) {
						generatedDf_count[i] += generatedDf_count[i];
					} 
				}
				dprev.setDf_next(generatedDf_next);
				ModernizedCProgram.vim_free(dp);
				dp = generatedDf_next;
			} else {
					dprev = /* Advance to next entry. */dp;
					dp = generatedDf_next;
			} 
		}/* If the change is after the previous diff block and before the next
			 * diff block, thus not touching an existing change, create a new diff
			 * block.  Don't do this when ex_diffgetput() is busy. */
		dprev = ((Object)0);
		dp = generatedTp_first_diff;
		while (dp != ((Object)0)) {
			for (i = 0; i < 8; ++/* All counts are zero, remove this entry. */i) {
				if (generatedTp_diffbuf[i] != ((Object)0) && generatedDf_count[i] != 0) {
					break;
				} 
			}
			if (i == 8) {
				dnext = generatedDf_next;
				ModernizedCProgram.vim_free(dp);
				dp = dnext;
				if (dprev == ((Object)0)) {
					this.setTp_first_diff(dnext);
				} else {
						dprev.setDf_next(dnext);
				} 
			} else {
					dprev = /* Advance to next entry. */dp;
					dp = generatedDf_next;
			} 
		}
		if (tp == ModernizedCProgram.curtab) {
			need_diff_redraw = 1/* Need to recompute the scroll binding, may remove or add filler
				 * lines (e.g., when adding lines above w_topline). But it's slow when
				 * making many changes, postpone until redrawing. */;
			diff_need_scrollbind = 1/*
			 * Allocate a new diff block and link it between "dprev" and "dp".
			 */;
		} 
	}
	public void diff_clear() {
		diff_T p = new diff_T();
		diff_T next_p = new diff_T();
		Object generatedDf_next = p.getDf_next();
		Object generatedTp_first_diff = this.getTp_first_diff();
		for (p = generatedTp_first_diff; p != ((Object)0); p = next_p) {
			next_p = generatedDf_next;
			ModernizedCProgram.vim_free(p);
		}
		this.setTp_first_diff(((Object)0/*
		 * Check diff status for line "lnum" in buffer "buf":
		 * Returns 0 for nothing special
		 * Returns -1 for a line that should be highlighted as changed.
		 * Returns -2 for a line that should be highlighted as added/deleted.
		 * Returns > 0 for inserting that many filler lines above it (never happens
		 * when 'diffopt' doesn't contain "filler").
		 * This should only be used for windows where 'diff' is set.
		 */));
	}
	public tabpage_S getTp_next() {
		return tp_next;
	}
	public void setTp_next(tabpage_S newTp_next) {
		tp_next = newTp_next;
	}
	public frame_S getTp_topframe() {
		return tp_topframe;
	}
	public void setTp_topframe(frame_S newTp_topframe) {
		tp_topframe = newTp_topframe;
	}
	public window_S getTp_curwin() {
		return tp_curwin;
	}
	public void setTp_curwin(window_S newTp_curwin) {
		tp_curwin = newTp_curwin;
	}
	public window_S getTp_prevwin() {
		return tp_prevwin;
	}
	public void setTp_prevwin(window_S newTp_prevwin) {
		tp_prevwin = newTp_prevwin;
	}
	public window_S getTp_firstwin() {
		return tp_firstwin;
	}
	public void setTp_firstwin(window_S newTp_firstwin) {
		tp_firstwin = newTp_firstwin;
	}
	public window_S getTp_lastwin() {
		return tp_lastwin;
	}
	public void setTp_lastwin(window_S newTp_lastwin) {
		tp_lastwin = newTp_lastwin;
	}
	public long getTp_old_Rows() {
		return tp_old_Rows;
	}
	public void setTp_old_Rows(long newTp_old_Rows) {
		tp_old_Rows = newTp_old_Rows;
	}
	public long getTp_old_Columns() {
		return tp_old_Columns;
	}
	public void setTp_old_Columns(long newTp_old_Columns) {
		tp_old_Columns = newTp_old_Columns;
	}
	public long getTp_ch_used() {
		return tp_ch_used;
	}
	public void setTp_ch_used(long newTp_ch_used) {
		tp_ch_used = newTp_ch_used;
	}
	public Object getTp_localdir() {
		return tp_localdir;
	}
	public void setTp_localdir(Object newTp_localdir) {
		tp_localdir = newTp_localdir;
	}
	public Object getTp_snapshot() {
		return tp_snapshot;
	}
	public void setTp_snapshot(Object newTp_snapshot) {
		tp_snapshot = newTp_snapshot;
	}
}
