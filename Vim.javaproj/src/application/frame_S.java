package application;

/*
 * Windows are kept in a tree of frames.  Each frame has a column (FR_COL)
 * or row (FR_ROW) layout or is a leaf, which has a window.
 */
public class frame_S {
	private byte fr_layout;
	private int fr_width;
	private int fr_newwidth;
	private int fr_height;
	private int fr_newheight;
	private frame_S fr_parent;
	private frame_S fr_next;
	private frame_S fr_prev;
	private frame_S fr_child;
	private window_S fr_win;
	
	public frame_S(byte fr_layout, int fr_width, int fr_newwidth, int fr_height, int fr_newheight, frame_S fr_parent, frame_S fr_next, frame_S fr_prev, frame_S fr_child, window_S fr_win) {
		setFr_layout(fr_layout);
		setFr_width(fr_width);
		setFr_newwidth(fr_newwidth);
		setFr_height(fr_height);
		setFr_newheight(fr_newheight);
		setFr_parent(fr_parent);
		setFr_next(fr_next);
		setFr_prev(fr_prev);
		setFr_child(fr_child);
		setFr_win(fr_win);
	}
	public frame_S() {
	}
	
	public int ses_do_frame() {
		frame_T frc = new frame_T();
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		if (generatedFr_layout == 0) {
			return generatedFr_win.ses_do_win();
		} 
		frame_S generatedFr_next = frc.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		for (frc = generatedFr_child; frc != ((Object)0); frc = generatedFr_next) {
			if (frc.ses_do_frame()) {
				return 1;
			} 
		}
		return 0/*
		 * Skip frames that don't contain windows we want to save in the Session.
		 * Returns NULL when there none.
		 */;
	}
	public frame_S ses_skipframe() {
		frame_T frc = new frame_T();
		frame_S generatedFr_next = frc.getFr_next();
		for (frc = fr; frc != ((Object)0); frc = generatedFr_next) {
			if (frc.ses_do_frame()) {
				break;
			} 
		}
		return frc/*
		 * Write commands to "fd" to recursively create windows for frame "fr",
		 * horizontally and vertically split.
		 * After the commands the last window in the frame is the current window.
		 * Returns FAIL when writing the commands to "fd" fails.
		 */;
	}
	public frame_S win_altframe(window_S win, tabpage_S tp) {
		/* tab page "win" is in, NULL for current */frame_T frp = new frame_T();
		frame_T other_fr = new frame_T();
		frame_T target_fr = new frame_T();
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		window_S generatedTp_lastwin = tp.getTp_lastwin();
		tabpage_S tabpage_S = new tabpage_S();
		if (tp == ((Object)0) ? (ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) : generatedTp_firstwin == generatedTp_lastwin) {
			return tabpage_S.alt_tabpage().getTp_curwin().getW_frame();
		} 
		frame_S generatedW_frame = win.getW_frame();
		frp = generatedW_frame;
		frame_S generatedFr_prev = frp.getFr_prev();
		frame_S generatedFr_next = frp.getFr_next();
		if (generatedFr_prev == ((Object)0)) {
			return generatedFr_next;
		} 
		if (generatedFr_next == ((Object)0)) {
			return generatedFr_prev;
		} 
		target_fr = generatedFr_next;
		other_fr = generatedFr_prev;
		if (ModernizedCProgram.p_spr || ModernizedCProgram.p_sb) {
			target_fr = generatedFr_prev;
			other_fr = generatedFr_next;
		} 
		frame_S generatedFr_parent = frp.getFr_parent();
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		if (generatedFr_parent != ((Object)0) && generatedFr_layout == /* If 'wfh' or 'wfw' is set for the target and not for the alternate
		     * window, reverse the selection. */1) {
			if (target_fr.frame_fixed_width() && !other_fr.frame_fixed_width()) {
				target_fr = other_fr;
			} 
		} else {
				if (target_fr.frame_fixed_height() && !other_fr.frame_fixed_height()) {
					target_fr = other_fr;
				} 
		} 
		return target_fr/*
		 * Return the tabpage that will be used if the current one is closed.
		 */;
	}
	public void frame_new_height(int height, int topfirst, int wfh) {
		/* obey 'winfixheight' when there is a choice;
						   may cause the height not to be set */frame_T frp = new frame_T();
		int extra_lines;
		int h;
		window_S generatedFr_win = this.getFr_win();
		int generatedW_status_height = generatedFr_win.getW_status_height();
		Object generatedW_winbar_height = (generatedFr_win).getW_winbar_height();
		byte generatedFr_layout = this.getFr_layout();
		int generatedFr_height = frp.getFr_height();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		frame_S generatedFr_prev = frp.getFr_prev();
		if (generatedFr_win != ((Object)0)) {
			generatedFr_win.win_new_height(height - generatedW_status_height - generatedW_winbar_height);
		}  else if (generatedFr_layout == 1) {
			do {
				for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
					frp.frame_new_height(height, topfirst, wfh);
					if (generatedFr_height > height) {
						height = generatedFr_height;
						break;
					} 
				}
			} while (frp != ((Object)0/* fr_layout == FR_COL */));
		} else {
				frp = generatedFr_child;
				if (wfh) {
					while (/* Advance past frames with one window with 'wfh' set. */frp.frame_fixed_height()) {
						frp = generatedFr_next;
						if (frp == ((Object)0)) {
							return ;
						} 
					}
				} 
				if (!topfirst) {
					while (generatedFr_next != ((Object)/* Find the bottom frame of this column */0)) {
						frp = generatedFr_next;
					}
					if (wfh) {
						while (/* Advance back for frames with one window with 'wfh' set. */frp.frame_fixed_height()) {
							frp = generatedFr_prev;
						}
					} 
				} 
				extra_lines = height - generatedFr_height;
				if (extra_lines < 0) {
					while (frp != ((Object)/* reduce height of contained frames, bottom or top frame first */0)) {
						h = ModernizedCProgram.frame_minheight(frp, ((Object)0));
						if (generatedFr_height + extra_lines < h) {
							extra_lines += generatedFr_height - h;
							frp.frame_new_height(h, topfirst, wfh);
						} else {
								frp.frame_new_height(generatedFr_height + extra_lines, topfirst, wfh);
								break;
						} 
						if (topfirst) {
							do {
								frp = generatedFr_next;
							} while (wfh && frp != ((Object)0) && frp.frame_fixed_height());
						} else {
								do {
									frp = generatedFr_prev;
								} while (wfh && frp != ((Object)0) && frp.frame_fixed_height());
						} 
						if (frp == ((Object)/* Increase "height" if we could not reduce enough frames. */0)) {
							height -= extra_lines;
						} 
					}
				}  else if (extra_lines > 0) {
					frp.frame_new_height(generatedFr_height + extra_lines, topfirst, /* increase height of bottom or top frame */wfh);
				} 
		} 
		this.setFr_height(height/*
		 * Return TRUE if height of frame "frp" should not be changed because of
		 * the 'winfixheight' option.
		 */);
	}
	/* resize topmost contained frame first */
	public int frame_fixed_height() {
		window_S generatedFr_win = this.getFr_win();
		 generatedW_onebuf_opt = generatedFr_win.getW_onebuf_opt();
		Object generatedWo_wfh = generatedW_onebuf_opt.getWo_wfh();
		if (generatedFr_win != ((Object)/* frame with one window: fixed height if 'winfixheight' set. */0)) {
			return generatedWo_wfh;
		} 
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 1) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				if (frp.frame_fixed_height()) {
					return 1;
				} 
			}
			return 0;
		} 
		for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
			if (!frp.frame_fixed_height()) {
				return 0;
			} 
		}
		return 1/*
		 * Return TRUE if width of frame "frp" should not be changed because of
		 * the 'winfixwidth' option.
		 */;
	}
	public int frame_fixed_width() {
		window_S generatedFr_win = this.getFr_win();
		 generatedW_onebuf_opt = generatedFr_win.getW_onebuf_opt();
		Object generatedWo_wfw = generatedW_onebuf_opt.getWo_wfw();
		if (generatedFr_win != ((Object)/* frame with one window: fixed width if 'winfixwidth' set. */0)) {
			return generatedWo_wfw;
		} 
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 2) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				if (frp.frame_fixed_width()) {
					return 1;
				} 
			}
			return 0;
		} 
		for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
			if (!frp.frame_fixed_width()) {
				return 0;
			} 
		}
		return 1/*
		 * Add a status line to windows at the bottom of "frp".
		 * Note: Does not check if there is room!
		 */;
	}
	public void frame_add_statusline() {
		win_T wp = new win_T();
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		int generatedW_status_height = wp.getW_status_height();
		int generatedW_height = wp.getW_height();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 0) {
			wp = generatedFr_win;
			if (generatedW_status_height == 0) {
				if (generatedW_height > /* don't make it negative */0) {
					--generatedW_height;
				} 
				wp.setW_status_height(1);
			} 
		}  else if (generatedFr_layout == 1) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				frp/* frp->fr_layout == FR_COL */.frame_add_statusline();
			}
		} else {
				for (frp = generatedFr_child; generatedFr_next != ((Object)0); frp = generatedFr_next) {
					;
				}
				frp/*
				 * Set width of a frame.  Handles recursively going through contained frames.
				 * May remove separator line for windows at the right side (for win_close()).
				 */.frame_add_statusline();
		} 
	}
	public void frame_new_width(int width, int leftfirst, int wfw) {
		/* obey 'winfixwidth' when there is a choice;
						   may cause the width not to be set */frame_T frp = new frame_T();
		int extra_cols;
		int w;
		win_T wp = new win_T();
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		frame_S generatedFr_parent = frp.getFr_parent();
		frame_S generatedFr_next = frp.getFr_next();
		int generatedW_vsep_width = wp.getW_vsep_width();
		int generatedFr_width = frp.getFr_width();
		frame_S generatedFr_child = this.getFr_child();
		frame_S generatedFr_prev = frp.getFr_prev();
		if (generatedFr_layout == 0) {
			wp = generatedFr_win;
			for (frp = topfrp; generatedFr_parent != ((Object)0); frp = generatedFr_parent) {
				if (generatedFr_layout == 1 && generatedFr_next != ((Object)0)) {
					break;
				} 
			}
			if (generatedFr_parent == ((Object)0)) {
				wp.setW_vsep_width(0);
			} 
			wp.win_new_width(width - generatedW_vsep_width);
		}  else if (generatedFr_layout == 2) {
			do {
				for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
					frp.frame_new_width(width, leftfirst, wfw);
					if (generatedFr_width > width) {
						width = generatedFr_width;
						break;
					} 
				}
			} while (frp != ((Object)0/* fr_layout == FR_ROW */));
		} else {
				frp = generatedFr_child;
				if (wfw) {
					while (/* Advance past frames with one window with 'wfw' set. */frp.frame_fixed_width()) {
						frp = generatedFr_next;
						if (frp == ((Object)0)) {
							return ;
						} 
					}
				} 
				if (!leftfirst) {
					while (generatedFr_next != ((Object)/* Find the rightmost frame of this row */0)) {
						frp = generatedFr_next;
					}
					if (wfw) {
						while (/* Advance back for frames with one window with 'wfw' set. */frp.frame_fixed_width()) {
							frp = generatedFr_prev;
						}
					} 
				} 
				extra_cols = width - generatedFr_width;
				if (extra_cols < 0) {
					while (frp != ((Object)/* reduce frame width, rightmost frame first */0)) {
						w = ModernizedCProgram.frame_minwidth(frp, ((Object)0));
						if (generatedFr_width + extra_cols < w) {
							extra_cols += generatedFr_width - w;
							frp.frame_new_width(w, leftfirst, wfw);
						} else {
								frp.frame_new_width(generatedFr_width + extra_cols, leftfirst, wfw);
								break;
						} 
						if (leftfirst) {
							do {
								frp = generatedFr_next;
							} while (wfw && frp != ((Object)0) && frp.frame_fixed_width());
						} else {
								do {
									frp = generatedFr_prev;
								} while (wfw && frp != ((Object)0) && frp.frame_fixed_width());
						} 
						if (frp == ((Object)/* Increase "width" if we could not reduce enough frames. */0)) {
							width -= extra_cols;
						} 
					}
				}  else if (extra_cols > 0) {
					frp.frame_new_width(generatedFr_width + extra_cols, leftfirst, /* increase width of rightmost frame */wfw);
				} 
		} 
		this.setFr_width(width/*
		 * Add the vertical separator to windows at the right side of "frp".
		 * Note: Does not check if there is room!
		 */);
	}
	/* resize leftmost contained frame first */
	public void frame_add_vsep() {
		win_T wp = new win_T();
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		int generatedW_vsep_width = wp.getW_vsep_width();
		int generatedW_width = wp.getW_width();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 0) {
			wp = generatedFr_win;
			if (generatedW_vsep_width == 0) {
				if (generatedW_width > /* don't make it negative */0) {
					--generatedW_width;
				} 
				wp.setW_vsep_width(1);
			} 
		}  else if (generatedFr_layout == 2) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				frp/* frp->fr_layout == FR_ROW */.frame_add_vsep();
			}
		} else {
				frp = generatedFr_child;
				while (generatedFr_next != ((Object)0)) {
					frp = generatedFr_next;
				}
				frp/*
				 * Set frame width from the window it contains.
				 */.frame_add_vsep();
		} 
	}
	public void frame_append(frame_S frp) {
		frame_S generatedFr_next = this.getFr_next();
		frp.setFr_next(generatedFr_next);
		this.setFr_next(frp);
		if (generatedFr_next != ((Object)0)) {
			generatedFr_next.setFr_prev(frp);
		} 
		frp.setFr_prev(after/*
		 * Insert frame "frp" in a frame list before frame "before".
		 */);
	}
	public void frame_insert(frame_S frp) {
		frp.setFr_next(before);
		frame_S generatedFr_prev = this.getFr_prev();
		frp.setFr_prev(generatedFr_prev);
		this.setFr_prev(frp);
		frame_S generatedFr_parent = frp.getFr_parent();
		if (generatedFr_prev != ((Object)0)) {
			generatedFr_prev.setFr_next(frp);
		} else {
				generatedFr_parent.setFr_child(frp/*
				 * Remove a frame from a frame list.
				 */);
		} 
	}
	public void frame_remove() {
		frame_S generatedFr_prev = this.getFr_prev();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_parent = this.getFr_parent();
		if (generatedFr_prev != ((Object)0)) {
			generatedFr_prev.setFr_next(generatedFr_next);
		} else {
				generatedFr_parent.setFr_child(generatedFr_next);
				if (ModernizedCProgram.topframe.getFr_child() == /* special case: topframe->fr_child == frp */frp) {
					ModernizedCProgram.topframe.setFr_child(generatedFr_next);
				} 
		} 
		if (generatedFr_next != ((Object)0)) {
			generatedFr_next.setFr_prev(generatedFr_prev);
		} 
	}
	public void frame_comp_pos(int row, int col) {
		win_T wp = new win_T();
		frame_T frp = new frame_T();
		int startcol;
		int startrow;
		int h;
		window_S generatedFr_win = this.getFr_win();
		wp = generatedFr_win;
		int generatedW_winrow = wp.getW_winrow();
		int generatedW_wincol = wp.getW_wincol();
		int generatedW_height = (wp).getW_height();
		Object generatedW_winbar_height = (wp).getW_winbar_height();
		int generatedW_status_height = wp.getW_status_height();
		int generatedFr_height = this.getFr_height();
		int generatedW_width = wp.getW_width();
		int generatedW_vsep_width = wp.getW_vsep_width();
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (wp != ((Object)0)) {
			if (generatedW_winrow != row || generatedW_wincol != col) {
				wp.setW_winrow(/* position changed, redraw */row);
				wp.setW_wincol(col);
				wp.redraw_win_later(40);
				wp.setW_redr_status(1);
			} 
			h = (generatedW_height + generatedW_winbar_height) + generatedW_status_height;
			row += h > generatedFr_height ? generatedFr_height : h;
			col += generatedW_width + generatedW_vsep_width;
		} else {
				startrow = row;
				startcol = col;
				for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
					if (generatedFr_layout == 1) {
						row = /* all frames are at the same row */startrow;
					} else {
							col = /* all frames are at the same col */startcol;
					} 
					frp.frame_comp_pos(row, col/*
					 * Set current window height and take care of repositioning other windows to
					 * fit around it.
					 */);
				}
		} 
	}
	public void frame_setheight(int height) {
		/* total number of lines available */int room;
		/* number of lines taken from other windows */int take;
		/* lines available from cmdline */int room_cmdline;
		int run;
		frame_T frp = new frame_T();
		int h;
		int room_reserved;
		int generatedFr_height = this.getFr_height();
		if (generatedFr_height == /* If the height already is the desired value, nothing to do. */height) {
			return ;
		} 
		frame_S generatedFr_parent = this.getFr_parent();
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		window_S generatedFr_win = frp.getFr_win();
		 generatedW_onebuf_opt = generatedFr_win.getW_onebuf_opt();
		Object generatedWo_wfh = generatedW_onebuf_opt.getWo_wfh();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = generatedFr_parent.getFr_child();
		int generatedFr_width = this.getFr_width();
		frame_S generatedFr_prev = this.getFr_prev();
		if (generatedFr_parent == ((Object)0)) {
			if (height > (ModernizedCProgram.Rows - ModernizedCProgram.p_ch - ModernizedCProgram.tabline_height())) {
				height = (ModernizedCProgram.Rows - ModernizedCProgram.p_ch - ModernizedCProgram.tabline_height());
			} 
			if (height > 0) {
				curfrp.frame_new_height(height, 0, 0);
			} 
		}  else if (generatedFr_layout == 1) {
			h = ModernizedCProgram.frame_minheight(generatedFr_parent, ((Object)/* Row of frames: Also need to resize frames left and right of this
				 * one.  First check for the minimal height of these. */0));
			if (height < h) {
				height = h;
			} 
			generatedFr_parent.frame_setheight(height/*
				 * Column of frames: try to change only frames in this column.
				 */);
		} else {
				for (run = 1; run <= 2; ++/*
					 * Do this twice:
					 * 1: compute room available, if it's not enough try resizing the
					 *    containing frame.
					 * 2: compute the room available and adjust the height to it.
					 * Try not to reduce the height of a window with 'winfixheight' set.
					 */run) {
					room = 0;
					room_reserved = 0;
					for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
						if (frp != curfrp && generatedFr_win != ((Object)0) && generatedWo_wfh) {
							room_reserved += generatedFr_height;
						} 
						room += generatedFr_height;
						if (frp != curfrp) {
							room -= ModernizedCProgram.frame_minheight(frp, ((Object)0));
						} 
					}
					if (generatedFr_width != Columns) {
						room_cmdline = 0;
					} else {
							room_cmdline = ModernizedCProgram.Rows - ModernizedCProgram.p_ch - (ModernizedCProgram.lastwin.getW_winrow() + ((ModernizedCProgram.lastwin).getW_height() + (ModernizedCProgram.lastwin).getW_winbar_height()) + ModernizedCProgram.lastwin.getW_status_height());
							if (room_cmdline < 0) {
								room_cmdline = 0;
							} 
					} 
					if (height <= room + room_cmdline) {
						break;
					} 
					if (run == 2 || generatedFr_width == Columns) {
						if (height > room + room_cmdline) {
							height = room + room_cmdline;
						} 
						break;
					} 
					generatedFr_parent.frame_setheight(height + ModernizedCProgram.frame_minheight(generatedFr_parent, (win_T)-1) - (int)ModernizedCProgram.p_wmh - 1/*
						 * Compute the number of lines we will take from others frames (can be
						 * negative!).
						 */);
				}
				take = height - generatedFr_height;
				if (height > room + room_cmdline - /* If there is not enough room, also reduce the height of a window
					 * with 'winfixheight' set. */room_reserved) {
					room_reserved = room + room_cmdline - height/* If there is only a 'winfixheight' window and making the
						 * window smaller, need to make the other window taller. */;
				} 
				if (take < 0 && room - generatedFr_height < room_reserved) {
					room_reserved = 0;
				} 
				if (take > 0 && room_cmdline > 0) {
					if (take < /* use lines from cmdline first */room_cmdline) {
						room_cmdline = take;
					} 
					take -= room_cmdline;
					generatedFr_height += room_cmdline;
				} 
				curfrp.frame_new_height(height, 0, /*
					 * set the current frame to the new height
					 */0/*
					 * First take lines from the frames after the current frame.  If
					 * that is not enough, takes lines from frames above the current
					 * frame.
					 */);
				for (run = 0; run < 2; ++run) {
					if (run == 0) {
						frp = generatedFr_next;
					} else {
							frp = generatedFr_prev;
					} 
					while (frp != ((Object)0) && take != 0) {
						h = ModernizedCProgram.frame_minheight(frp, ((Object)0));
						if (room_reserved > 0 && generatedFr_win != ((Object)0) && generatedWo_wfh) {
							if (room_reserved >= generatedFr_height) {
								room_reserved -= generatedFr_height;
							} else {
									if (generatedFr_height - room_reserved > take) {
										room_reserved = generatedFr_height - take;
									} 
									take -= generatedFr_height - room_reserved;
									frp.frame_new_height(room_reserved, 0, 0);
									room_reserved = 0;
							} 
						} else {
								if (generatedFr_height - take < h) {
									take -= generatedFr_height - h;
									frp.frame_new_height(h, 0, 0);
								} else {
										frp.frame_new_height(generatedFr_height - take, 0, 0);
										take = 0;
								} 
						} 
						if (run == 0) {
							frp = generatedFr_next;
						} else {
								frp = generatedFr_prev;
						} 
					}
				}
		} 
	}
	public void frame_setwidth(int width) {
		/* total number of lines available */int room;
		/* number of lines taken from other windows */int take;
		int run;
		frame_T frp = new frame_T();
		int w;
		int room_reserved;
		int generatedFr_width = this.getFr_width();
		if (generatedFr_width == /* If the width already is the desired value, nothing to do. */width) {
			return ;
		} 
		frame_S generatedFr_parent = this.getFr_parent();
		if (generatedFr_parent == ((Object)0/* topframe: can't change width */)) {
			return ;
		} 
		byte generatedFr_layout = generatedFr_parent.getFr_layout();
		window_S generatedFr_win = frp.getFr_win();
		 generatedW_onebuf_opt = generatedFr_win.getW_onebuf_opt();
		Object generatedWo_wfw = generatedW_onebuf_opt.getWo_wfw();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = generatedFr_parent.getFr_child();
		int generatedFr_height = this.getFr_height();
		frame_S generatedFr_prev = this.getFr_prev();
		if (generatedFr_layout == 2) {
			w = ModernizedCProgram.frame_minwidth(generatedFr_parent, ((Object)/* Column of frames: Also need to resize frames above and below of
				 * this one.  First check for the minimal width of these. */0));
			if (width < w) {
				width = w;
			} 
			generatedFr_parent.frame_setwidth(width/*
				 * Row of frames: try to change only frames in this row.
				 *
				 * Do this twice:
				 * 1: compute room available, if it's not enough try resizing the
				 *    containing frame.
				 * 2: compute the room available and adjust the width to it.
				 */);
		} else {
				for (run = 1; run <= 2; ++run) {
					room = 0;
					room_reserved = 0;
					for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
						if (frp != curfrp && generatedFr_win != ((Object)0) && generatedWo_wfw) {
							room_reserved += generatedFr_width;
						} 
						room += generatedFr_width;
						if (frp != curfrp) {
							room -= ModernizedCProgram.frame_minwidth(frp, ((Object)0));
						} 
					}
					if (width <= room) {
						break;
					} 
					if (run == 2 || generatedFr_height >= (ModernizedCProgram.Rows - ModernizedCProgram.p_ch - ModernizedCProgram.tabline_height())) {
						if (width > room) {
							width = room;
						} 
						break;
					} 
					generatedFr_parent.frame_setwidth(width + ModernizedCProgram.frame_minwidth(generatedFr_parent, (win_T)-1) - (int)ModernizedCProgram.p_wmw - 1/*
						 * Compute the number of lines we will take from others frames (can be
						 * negative!).
						 */);
				}
				take = width - generatedFr_width;
				if (width > room - /* If there is not enough room, also reduce the width of a window
					 * with 'winfixwidth' set. */room_reserved) {
					room_reserved = room - width/* If there is only a 'winfixwidth' window and making the
						 * window smaller, need to make the other window narrower. */;
				} 
				if (take < 0 && room - generatedFr_width < room_reserved) {
					room_reserved = 0/*
						 * set the current frame to the new width
						 */;
				} 
				curfrp.frame_new_width(width, 0, 0/*
					 * First take lines from the frames right of the current frame.  If
					 * that is not enough, takes lines from frames left of the current
					 * frame.
					 */);
				for (run = 0; run < 2; ++run) {
					if (run == 0) {
						frp = generatedFr_next;
					} else {
							frp = generatedFr_prev;
					} 
					while (frp != ((Object)0) && take != 0) {
						w = ModernizedCProgram.frame_minwidth(frp, ((Object)0));
						if (room_reserved > 0 && generatedFr_win != ((Object)0) && generatedWo_wfw) {
							if (room_reserved >= generatedFr_width) {
								room_reserved -= generatedFr_width;
							} else {
									if (generatedFr_width - room_reserved > take) {
										room_reserved = generatedFr_width - take;
									} 
									take -= generatedFr_width - room_reserved;
									frp.frame_new_width(room_reserved, 0, 0);
									room_reserved = 0;
							} 
						} else {
								if (generatedFr_width - take < w) {
									take -= generatedFr_width - w;
									frp.frame_new_width(w, 0, 0);
								} else {
										frp.frame_new_width(generatedFr_width - take, 0, 0);
										take = 0;
								} 
						} 
						if (run == 0) {
							frp = generatedFr_next;
						} else {
								frp = generatedFr_prev;
						} 
					}
				}
		} 
	}
	public void frame_add_height(int n) {
		int generatedFr_height = this.getFr_height();
		frp.frame_new_height(generatedFr_height + n, 0, 0);
		frame_S generatedFr_parent = this.getFr_parent();
		for (; ; ) {
			frp = generatedFr_parent;
			if (frp == ((Object)0)) {
				break;
			} 
			generatedFr_height += n/*
			 * Add or remove a status line for the bottom window(s), according to the
			 * value of 'laststatus'.
			 */;
		}
	}
	public void last_status_rec(int statusline) {
		frame_T fp = new frame_T();
		win_T wp = new win_T();
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		int generatedW_status_height = wp.getW_status_height();
		int generatedW_height = wp.getW_height();
		int generatedFr_height = fp.getFr_height();
		frame_S generatedFr_prev = fp.getFr_prev();
		frame_S generatedFr_parent = fp.getFr_parent();
		frame_S generatedFr_next = fp.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 0) {
			wp = generatedFr_win;
			if (generatedW_status_height != 0 && !statusline) {
				wp.win_new_height(generatedW_height + /* remove status line */1);
				wp.setW_status_height(0);
				.comp_col();
			}  else if (generatedW_status_height == 0 && statusline) {
				fp = /* Find a frame to take a line from. */fr;
				while (generatedFr_height <= ModernizedCProgram.frame_minheight(fp, ((Object)0))) {
					if (fp == ModernizedCProgram.topframe) {
						ModernizedCProgram.emsg(((byte)(e_noroom)));
						return ;
					} 
					if (generatedFr_layout == 2 && generatedFr_prev != ((Object)/* In a column of frames: go to frame above.  If already at
							 * the top or in a row of frames: go to parent. */0)) {
						fp = generatedFr_prev;
					} else {
							fp = generatedFr_parent;
					} 
				}
				wp.setW_status_height(1);
				if (fp != fr) {
					fp.frame_new_height(generatedFr_height - 1, 0, 0);
					wp.frame_fix_height();
					(Object)ModernizedCProgram.win_comp_pos();
				} else {
						wp.win_new_height(generatedW_height - 1);
				} 
				.comp_col();
				ModernizedCProgram.redraw_all_later(35);
			} 
		}  else if (generatedFr_layout == 1) {
			for (fp = generatedFr_child; fp != ((Object)0); fp = generatedFr_next) {
				fp.last_status_rec(statusline);
			}
		} else {
				for (fp = generatedFr_child; generatedFr_next != ((Object)0); fp = generatedFr_next) {
					;
				}
				fp.last_status_rec(statusline/*
				 * Return the number of lines used by the tab page line.
				 */);
		} 
	}
	public void make_snapshot_rec(frame_S frp) {
		frp = (frame_T)ModernizedCProgram.alloc_clear();
		if (frp == ((Object)0)) {
			return ;
		} 
		byte generatedFr_layout = this.getFr_layout();
		(frp).setFr_layout(generatedFr_layout);
		int generatedFr_width = this.getFr_width();
		(frp).setFr_width(generatedFr_width);
		int generatedFr_height = this.getFr_height();
		(frp).setFr_height(generatedFr_height);
		frame_S generatedFr_next = this.getFr_next();
		if (generatedFr_next != ((Object)0)) {
			generatedFr_next.make_snapshot_rec((generatedFr_next));
		} 
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_child != ((Object)0)) {
			generatedFr_child.make_snapshot_rec((generatedFr_child));
		} 
		window_S generatedFr_win = this.getFr_win();
		if (generatedFr_layout == 0 && generatedFr_win == ModernizedCProgram.curwin) {
			(frp).setFr_win(ModernizedCProgram.curwin/*
			 * Remove any existing snapshot.
			 */);
		} 
	}
	public void clear_snapshot_rec() {
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (fr != ((Object)0)) {
			generatedFr_next.clear_snapshot_rec();
			generatedFr_child.clear_snapshot_rec();
			ModernizedCProgram.vim_free(fr/*
			 * Restore a previously created snapshot, if there is any.
			 * This is only done if the screen size didn't change and the window layout is
			 * still the same.
			 */);
		} 
	}
	public int check_snapshot_rec(frame_S fr) {
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		window_S generatedFr_win = this.getFr_win();
		if (generatedFr_layout != generatedFr_layout || (generatedFr_next == ((Object)0)) != (generatedFr_next == ((Object)0)) || (generatedFr_child == ((Object)0)) != (generatedFr_child == ((Object)0)) || (generatedFr_next != ((Object)0) && generatedFr_next.check_snapshot_rec(generatedFr_next) == 0) || (generatedFr_child != ((Object)0) && generatedFr_child.check_snapshot_rec(generatedFr_child) == 0) || (generatedFr_win != ((Object)0) && !generatedFr_win.win_valid())) {
			return 0;
		} 
		return 1/*
		 * Copy the size of snapshot frame "sn" to frame "fr".  Do the same for all
		 * following frames and children.
		 * Returns a pointer to the old current window, or NULL.
		 */;
	}
	/*
	 * Return TRUE if "topfrp" and its children are at the right height.
	 */
	public int frame_check_height(int height) {
		frame_T frp = new frame_T();
		int generatedFr_height = this.getFr_height();
		if (generatedFr_height != height) {
			return 0;
		} 
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 1) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				if (generatedFr_height != height) {
					return 0;
				} 
			}
		} 
		return 1/*
		 * Return TRUE if "topfrp" and its children are at the right width.
		 */;
	}
	public int frame_check_width(int width) {
		frame_T frp = new frame_T();
		int generatedFr_width = this.getFr_width();
		if (generatedFr_width != width) {
			return 0;
		} 
		byte generatedFr_layout = this.getFr_layout();
		frame_S generatedFr_next = frp.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 2) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				if (generatedFr_width != width) {
					return 0;
				} 
			}
		} 
		return 1/*
		 * Simple int comparison function for use with qsort()
		 */;
	}
	public void win_redraw_last_status() {
		byte generatedFr_layout = this.getFr_layout();
		window_S generatedFr_win = this.getFr_win();
		frame_S generatedFr_next = this.getFr_next();
		frame_S generatedFr_child = this.getFr_child();
		if (generatedFr_layout == 0) {
			generatedFr_win.setW_redr_status(1);
		}  else if (generatedFr_layout == 1) {
			for (frp = generatedFr_child; frp != ((Object)0); frp = generatedFr_next) {
				frp.win_redraw_last_status();
			}
		} else {
				frp = generatedFr_child;
				while (generatedFr_next != ((Object)0)) {
					frp = generatedFr_next;
				}
				frp/*
				 * Changed something in the current window, at buffer line "lnum", that
				 * requires that line and possibly other lines to be redrawn.
				 * Used when entering/leaving Insert mode with the cursor on a folded line.
				 * Used to remove the "$" from a change command.
				 * Note that when also inserting/deleting lines w_redraw_top and w_redraw_bot
				 * may become invalid and the whole window will have to be redrawn.
				 */.win_redraw_last_status();
		} 
	}
	public byte getFr_layout() {
		return fr_layout;
	}
	public void setFr_layout(byte newFr_layout) {
		fr_layout = newFr_layout;
	}
	public int getFr_width() {
		return fr_width;
	}
	public void setFr_width(int newFr_width) {
		fr_width = newFr_width;
	}
	public int getFr_newwidth() {
		return fr_newwidth;
	}
	public void setFr_newwidth(int newFr_newwidth) {
		fr_newwidth = newFr_newwidth;
	}
	public int getFr_height() {
		return fr_height;
	}
	public void setFr_height(int newFr_height) {
		fr_height = newFr_height;
	}
	public int getFr_newheight() {
		return fr_newheight;
	}
	public void setFr_newheight(int newFr_newheight) {
		fr_newheight = newFr_newheight;
	}
	public frame_S getFr_parent() {
		return fr_parent;
	}
	public void setFr_parent(frame_S newFr_parent) {
		fr_parent = newFr_parent;
	}
	public frame_S getFr_next() {
		return fr_next;
	}
	public void setFr_next(frame_S newFr_next) {
		fr_next = newFr_next;
	}
	public frame_S getFr_prev() {
		return fr_prev;
	}
	public void setFr_prev(frame_S newFr_prev) {
		fr_prev = newFr_prev;
	}
	public frame_S getFr_child() {
		return fr_child;
	}
	public void setFr_child(frame_S newFr_child) {
		fr_child = newFr_child;
	}
	public window_S getFr_win() {
		return fr_win;
	}
	public void setFr_win(window_S newFr_win) {
		fr_win = newFr_win;
	}
}
// script ID
