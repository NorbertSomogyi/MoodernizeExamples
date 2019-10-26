package application;

public class cmdarg_S {
	private oparg_S oap;
	private int prechar;
	private int cmdchar;
	private int nchar;
	private int ncharC1;
	private int ncharC2;
	private int extra_char;
	private long opcount;
	private long count0;
	private long count1;
	private int arg;
	private int retval;
	private Object searchbuf;
	
	public cmdarg_S(oparg_S oap, int prechar, int cmdchar, int nchar, int ncharC1, int ncharC2, int extra_char, long opcount, long count0, long count1, int arg, int retval, Object searchbuf) {
		setOap(oap);
		setPrechar(prechar);
		setCmdchar(cmdchar);
		setNchar(nchar);
		setNcharC1(ncharC1);
		setNcharC2(ncharC2);
		setExtra_char(extra_char);
		setOpcount(opcount);
		setCount0(count0);
		setCount1(count1);
		setArg(arg);
		setRetval(retval);
		setSearchbuf(searchbuf);
	}
	public cmdarg_S() {
	}
	
	/*
	 * Search for a character in a line.  If "t_cmd" is FALSE, move to the
	 * position of the character, otherwise move to just before the char.
	 * Do this "cap->count1" times.
	 * Return FAIL or OK.
	 */
	public int searchc(int t_cmd) {
		int generatedNchar = this.getNchar();
		int c = generatedNchar;
		int generatedArg = this.getArg();
		int dir = generatedArg;
		long generatedCount1 = this.getCount1();
		long count = generatedCount1;
		int col;
		char_u p = new char_u();
		int len;
		int stop = 1;
		int generatedNcharC1 = this.getNcharC1();
		int generatedNcharC2 = this.getNcharC2();
		if (c != /* normal search: remember args for repeat */(byte)'\000') {
			if (!/* don't remember when redoing */ModernizedCProgram.KeyStuffed) {
				ModernizedCProgram.lastc = c;
				ModernizedCProgram.set_csearch_direction(dir);
				ModernizedCProgram.set_csearch_until(t_cmd);
				ModernizedCProgram.lastc_bytelen = .UNRECOGNIZEDFUNCTIONNAME(c, ModernizedCProgram.lastc_bytes);
				if (generatedNcharC1 != 0) {
					ModernizedCProgram.lastc_bytelen += .UNRECOGNIZEDFUNCTIONNAME(generatedNcharC1, ModernizedCProgram.lastc_bytes + ModernizedCProgram.lastc_bytelen);
					if (generatedNcharC2 != 0) {
						ModernizedCProgram.lastc_bytelen += .UNRECOGNIZEDFUNCTIONNAME(generatedNcharC2, ModernizedCProgram.lastc_bytes + ModernizedCProgram.lastc_bytelen);
					} 
				} 
			} 
		} else {
				if (ModernizedCProgram.lastc == (byte)'\000' && ModernizedCProgram.lastc_bytelen == /* repeat previous search */1) {
					return 0;
				} 
				if (/* repeat in opposite direction */dir) {
					dir = -ModernizedCProgram.lastcdir;
				} else {
						dir = ModernizedCProgram.lastcdir;
				} 
				t_cmd = ModernizedCProgram.last_t_cmd;
				c = ModernizedCProgram.lastc/* For multi-byte re-use last lastc_bytes[] and lastc_bytelen. */;
				if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)';') == ((Object)0) && count == 1 && /* Force a move of at least one char, so ";" and "," will move the
					 * cursor, even if the cursor is right in front of char we are looking
					 * at. */t_cmd) {
					stop = 0;
				} 
		} 
		oparg_S generatedOap = this.getOap();
		if (dir == (true)) {
			generatedOap.setInclusive(0);
		} else {
				generatedOap.setInclusive(1);
		} 
		p = ModernizedCProgram.ml_get_curline();
		col = ModernizedCProgram.curwin.getW_cursor().getCol();
		len = (int).strlen((byte)(p));
		while (count--) {
			if (has_mbyte) {
				for (; ; ) {
					if (dir > 0) {
						col += .UNRECOGNIZEDFUNCTIONNAME(p + col);
						if (col >= len) {
							return 0;
						} 
					} else {
							if (col == 0) {
								return 0;
							} 
							col -= .UNRECOGNIZEDFUNCTIONNAME(p, p + col - 1) + 1;
					} 
					if (ModernizedCProgram.lastc_bytelen == 1) {
						if (p[col] == c && stop) {
							break;
						} 
					}  else if (.strncmp((byte)(p + col), (byte)(ModernizedCProgram.lastc_bytes), (size_t)(ModernizedCProgram.lastc_bytelen)) == 0 && stop) {
						break;
					} 
					stop = 1;
				}
			} else {
					for (; ; ) {
						if ((col += dir) < 0 || col >= len) {
							return 0;
						} 
						if (p[col] == c && stop) {
							break;
						} 
						stop = 1;
					}
			} 
		}
		if (t_cmd) {
			col -= /* backup to before the character (possibly double-byte) */dir;
			if (has_mbyte) {
				if (dir < 0) {
					col += ModernizedCProgram.lastc_bytelen - /* Landed on the search char which is lastc_bytelen long */1;
				} else {
						col -= .UNRECOGNIZEDFUNCTIONNAME(p, p + /* To previous char, which may be multi-byte. */col);
				} 
			} 
		} 
		ModernizedCProgram.curwin.getW_cursor().setCol(col);
		return 1/*
		 * "Other" Searches
		 */;
	}
	// saved Visual mode
	public void set_vcount_ca(int set_prevcount) {
		long generatedCount0 = this.getCount0();
		long count = generatedCount0;
		long generatedOpcount = this.getOpcount();
		if (generatedOpcount != /* multiply with cap->opcount the same way as above */0) {
			count = generatedOpcount * (count == 0 ? 1 : count);
		} 
		ModernizedCProgram.set_vcount(count, count == 0 ? 1 : count, set_prevcount);
		set_prevcount = /* only set v:prevcount once */0/*
		 * Check if  highlighting for visual mode is possible, give a warning message
		 * if not.
		 */;
	}
	public void prep_redo_cmd() {
		oparg_S generatedOap = this.getOap();
		int generatedRegname = generatedOap.getRegname();
		long generatedCount0 = this.getCount0();
		int generatedCmdchar = this.getCmdchar();
		int generatedNchar = this.getNchar();
		ModernizedCProgram.prep_redo(generatedRegname, generatedCount0, (byte)'\000', generatedCmdchar, (byte)'\000', (byte)'\000', generatedNchar);
	}
	public void unshift_special() {
		int generatedCmdchar = this.getCmdchar();
		switch (generatedCmdchar) {
		case (-(((byte)'#') + ((int)((byte)'4') << 8))):
				this.setCmdchar((-(((byte)'k') + ((int)((byte)'l') << 8))));
				break;
		case (-((true) + ((int)(key_extra.KE_S_UP) << 8))):
				this.setCmdchar((-(((byte)'k') + ((int)((byte)'u') << 8))));
				break;
		case (-((true) + ((int)(key_extra.KE_S_DOWN) << 8))):
				this.setCmdchar((-(((byte)'k') + ((int)((byte)'d') << 8))));
				break;
		case (-(((byte)'*') + ((int)((byte)'7') << 8))):
				this.setCmdchar((-(((byte)'@') + ((int)((byte)'7') << 8))));
				break;
		case (-(((byte)'%') + ((int)((byte)'i') << 8))):
				this.setCmdchar((-(((byte)'k') + ((int)((byte)'r') << 8))));
				break;
		case (-(((byte)'#') + ((int)((byte)'2') << 8))):
				this.setCmdchar((-(((byte)'k') + ((int)((byte)'h') << 8))));
				break;
		}
		this.setCmdchar(ModernizedCProgram.simplify_key(generatedCmdchar, mod_mask/*
		 * If the mode is currently displayed clear the command line or update the
		 * command displayed.
		 */));
	}
	public void nv_ignore() {
		int generatedRetval = this.getRetval();
		generatedRetval |=  /* don't call edit() now */1/*
		 * Command character that doesn't do anything, but unlike nv_ignore() does
		 * start edit().  Used for "startinsert" executed while starting up.
		 */;
	}
	public void nv_nop() {
	}
	/*
	 * Command character doesn't exist.
	 */
	public void nv_error() {
		oparg_S generatedOap = this.getOap();
		generatedOap.clearopbeep();
	}
	public void nv_help() {
		oparg_S generatedOap = this.getOap();
		if (!generatedOap.checkclearopq()) {
			((Object)0/*
			 * CTRL-A and CTRL-X: Add or subtract from letter or number under cursor.
			 */).ex_help();
		} 
	}
	public void nv_addsub() {
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedCmdchar = this.getCmdchar();
		long generatedCount1 = this.getCount1();
		int generatedArg = this.getArg();
		if (!VIsual_active && generatedOp_type == 0) {
			cap.prep_redo_cmd();
			generatedOap.setOp_type(generatedCmdchar == 1 ? 28 : 29);
			generatedOap.op_addsub(generatedCount1, generatedArg);
			generatedOap.setOp_type(0);
		}  else if (VIsual_active) {
			cap.nv_operator();
		} else {
				generatedOap.clearop();
		} 
	}
	public void nv_page() {
		oparg_S generatedOap = this.getOap();
		int generatedArg = this.getArg();
		long generatedCount1 = this.getCount1();
		long generatedCount0 = this.getCount0();
		if (!generatedOap.checkclearop()) {
			if (mod_mask & -1024) {
				if (generatedArg == (/* <C-PageUp>: tab page back; <C-PageDown>: tab page forward */true)) {
					ModernizedCProgram.goto_tabpage(-(int)generatedCount1);
				} else {
						ModernizedCProgram.goto_tabpage((int)generatedCount0);
				} 
			} else {
					(Object)ModernizedCProgram.onepage(generatedArg, generatedCount1);
			} 
		} 
	}
	public void nv_scroll_line() {
		oparg_S generatedOap = this.getOap();
		int generatedArg = this.getArg();
		long generatedCount1 = this.getCount1();
		if (!generatedOap.checkclearop()) {
			ModernizedCProgram.scroll_redraw(generatedArg, generatedCount1);
		} 
	}
	public void nv_zet() {
		long n;
		colnr_T col = new colnr_T();
		int generatedNchar = this.getNchar();
		int nchar = generatedNchar;
		long old_fdl = ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl();
		int old_fen = ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fen();
		int undo = 0;
		long siso = ModernizedCProgram.get_sidescrolloff_value();
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		if (((int)(nchar) - (byte)'0' < 10/*
			 * "z123{nchar}": edit the count before obtaining {nchar}
			 */)) {
			if (generatedOap.checkclearop()) {
				return ;
			} 
			n = nchar - (byte)'0';
			for (; ; ) {
				++/* disallow scrolling here */no_mapping;
				++/* no mapping for nchar, but allow key codes */allow_keys;
				nchar = ModernizedCProgram.plain_vgetc();
				do {
					if (p_langmap && (true) && (p_lrm || (!p_lrm && ModernizedCProgram.KeyTyped)) && !ModernizedCProgram.KeyStuffed && (nchar) >= 0) {
						if ((nchar) < 256) {
							nchar = langmap_mapchar[nchar];
						} else {
								nchar = ModernizedCProgram.langmap_adjust_mb(nchar);
						} 
					} 
				} while (0);
				--no_mapping;
				--allow_keys;
				(Object)ModernizedCProgram.add_to_showcmd(nchar);
				if (nchar == (-(((byte)'k') + ((int)((byte)'D') << 8))) || nchar == (-((true) + ((int)(key_extra.KE_KDEL) << 8)))) {
					n /= 10;
				}  else if (((int)(nchar) - (byte)'0' < 10)) {
					n = n * 10 + (nchar - (byte)'0');
				}  else if (nchar == (byte)'\015') {
					ModernizedCProgram.win_setheight((int)n);
					break;
				}  else if (nchar == (byte)'l' || nchar == (byte)'h' || nchar == (-(((byte)'k') + ((int)((byte)'l') << 8))) || nchar == (-(((byte)'k') + ((int)((byte)'r') << 8)))) {
					this.setCount1(n ? n * generatedCount1 : generatedCount1);
					;
				} else {
						generatedOap.clearopbeep();
						break;
				} 
			}
			generatedOap.setOp_type(0);
			return ;
		} 
		long generatedCount0 = this.getCount0();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if ((ModernizedCProgram.vim_strchr((char_u)"+\r\nt.z^-b", nchar) != ((Object)0)) && generatedCount0 && generatedCount0 != ModernizedCProgram.curwin.getW_cursor().getLnum()) {
			ModernizedCProgram.setpcmark();
			if (generatedCount0 > generatedMl_line_count) {
				ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
			} else {
					ModernizedCProgram.curwin.getW_cursor().setLnum(generatedCount0);
			} 
			ModernizedCProgram.check_cursor_col();
		} 
		int generatedOp_type = generatedOap.getOp_type();
		Object generatedCol = pos.getCol();
		switch (nchar) {
		case (byte)'e':
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
					if (ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)0))) {
						col = /* like the cursor is in col 0 */0;
					} else {
							ModernizedCProgram.getvcol(ModernizedCProgram.curwin, ModernizedCProgram.curwin.getW_cursor(), ((Object)0), ((Object)0), col);
					} 
					n = ModernizedCProgram.curwin.getW_width() - ModernizedCProgram.curwin_col_off();
					if ((long)col + siso < n) {
						col = 0;
					} else {
							col = col + siso - n + 1;
					} 
					if (ModernizedCProgram.curwin.getW_leftcol() != col) {
						ModernizedCProgram.curwin.setW_leftcol(col);
						ModernizedCProgram.redraw_later(40);
					} 
				} 
				break;
		case (byte)'s':
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
					if (ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)0))) {
						col = /* like the cursor is in col 0 */0;
					} else {
							ModernizedCProgram.getvcol(ModernizedCProgram.curwin, ModernizedCProgram.curwin.getW_cursor(), col, ((Object)0), ((Object)0));
					} 
					if ((long)col > siso) {
						col -= siso;
					} else {
							col = 0;
					} 
					if (ModernizedCProgram.curwin.getW_leftcol() != col) {
						ModernizedCProgram.curwin.setW_leftcol(col);
						ModernizedCProgram.redraw_later(40);
					} 
				} 
				break;
		case /* "zF": create fold command *//* "zf": create fold operator */(byte)'F':
		case /* "z+", "z<CR>" and "zt": put cursor at top of screen */(byte)'+':
				if (generatedCount0 == 0) {
					ModernizedCProgram.validate_botline();
					if (ModernizedCProgram.curwin.getW_botline() > generatedMl_line_count) {
						ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
					} else {
							ModernizedCProgram.curwin.getW_cursor().setLnum(ModernizedCProgram.curwin.getW_botline());
					} 
				} 
		case /* "zj" move to next fold downwards */(byte)'j':
		case (byte)'L':
				generatedCount1 *= ModernizedCProgram.curwin.getW_width() / /* "zL" - scroll screen left half-page */2/* FALLTHROUGH */;
		case (-(((byte)'K') + ((int)((byte)'A') << 8))):
				ModernizedCProgram.beginline(1 | 4/* FALLTHROUGH */);
		case (byte)'a':
				if (ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)/* "za": open closed fold or close open fold at cursor */0))) {
					ModernizedCProgram.openFold(ModernizedCProgram.curwin.getW_cursor().getLnum(), generatedCount1);
				} else {
						ModernizedCProgram.closeFold(ModernizedCProgram.curwin.getW_cursor().getLnum(), generatedCount1);
						ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				} 
				break;
		case (byte)'M':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fdl(/* "zM": close all folds */0);
				old_fdl = -/* force an update */1;
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				break;
		case (byte)'i':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fen());
				break;
		case (byte)'o':
				if (/* "zo": open fold at cursor or Visual area */VIsual_active) {
					cap.nv_operator();
				} else {
						ModernizedCProgram.openFold(ModernizedCProgram.curwin.getW_cursor().getLnum(), generatedCount1);
				} 
				break;
		case (byte)'A':
				if (ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)/* "zA": open fold at cursor recursively */0))) {
					ModernizedCProgram.openFoldRecurse(ModernizedCProgram.curwin.getW_cursor().getLnum());
				} else {
						ModernizedCProgram.closeFoldRecurse(ModernizedCProgram.curwin.getW_cursor().getLnum());
						ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				} 
				break;
		case /* "z^", "z-" and "zb": put cursor at bottom of screen *//* Strange Vi behavior: <count>z^ finds line at top of window
				 * when <count> is at bottom of window, and puts that one at
				 * bottom of window. */(byte)'^':
				if (generatedCount0 != 0) {
					ModernizedCProgram.scroll_cursor_bot(0, 1);
					ModernizedCProgram.curwin.getW_cursor().setLnum(ModernizedCProgram.curwin.getW_topline());
				}  else if (ModernizedCProgram.curwin.getW_topline() == 1) {
					ModernizedCProgram.curwin.getW_cursor().setLnum(1);
				} else {
						ModernizedCProgram.curwin.getW_cursor().setLnum(ModernizedCProgram.curwin.getW_topline() - 1);
				} 
		case /* "zG": add good word to temp word list */(byte)'G':
		case (byte)'r':
				ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl() += generatedCount1;
				{ 
					int d = ModernizedCProgram.getDeepestNesting();
					if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl() >= d) {
						ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fdl(d);
					} 
				}
				break;
		case (byte)'N':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(/* "zN": fold Normal: set 'foldenable' */1);
				break;
		case /* "zug" and "zuw": undo "zg" and "zw" */(byte)'u':
				++no_mapping;
				++/* no mapping for nchar, but allow key codes */allow_keys;
				nchar = ModernizedCProgram.plain_vgetc();
				do {
					if (p_langmap && (true) && (p_lrm || (!p_lrm && ModernizedCProgram.KeyTyped)) && !ModernizedCProgram.KeyStuffed && (nchar) >= 0) {
						if ((nchar) < 256) {
							nchar = langmap_mapchar[nchar];
						} else {
								nchar = ModernizedCProgram.langmap_adjust_mb(nchar);
						} 
					} 
				} while (0);
				--no_mapping;
				--allow_keys;
				(Object)ModernizedCProgram.add_to_showcmd(nchar);
				if (ModernizedCProgram.vim_strchr((char_u)"gGwW", nchar) == ((Object)0)) {
					generatedOap.clearopbeep();
					break;
				} 
				undo = 1/* FALLTHROUGH */;
		case (byte)'C':
				if (/* "zC": close fold recursively */VIsual_active) {
					cap.nv_operator();
				} else {
						ModernizedCProgram.closeFoldRecurse(ModernizedCProgram.curwin.getW_cursor().getLnum());
				} 
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				break;
		case (byte)'f':
				if (ModernizedCProgram.foldManualAllowed(1)) {
					this.setNchar((byte)'f');
					cap.nv_operator();
					ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
					if (nchar == (byte)'F' && generatedOp_type == /* "zF" is like "zfzf" */19) {
						cap.nv_operator();
						finish_op = 1;
					} 
				} else {
						generatedOap.clearopbeep();
				} 
				break;
		case (byte)'m':
				if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl() > /* "zm": fold more */0) {
					ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl() -= generatedCount1;
					if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fdl() < 0) {
						ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fdl(0);
					} 
				} 
				old_fdl = -/* force an update */1;
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				break;
		case /* "zW": add wrong word to temp word list */(byte)'W':
				{ 
					char_u ptr = ((Object)0);
					int len;
					if (generatedOap.checkclearop()) {
						break;
					} 
					if (VIsual_active && cap.get_visual_text(ptr, len) == 0) {
						return ;
					} 
					if (ptr == ((Object)0)) {
						pos_T pos = ModernizedCProgram.curwin.getW_cursor();
						emsg_off++;
						len = ModernizedCProgram.curwin.spell_move_to(1, 1, 1, ((Object)0));
						emsg_off--;
						if (len != 0 && ModernizedCProgram.curwin.getW_cursor().getCol() <= generatedCol) {
							ptr = ModernizedCProgram.curwin.getW_cursor().ml_get_pos();
						} 
						ModernizedCProgram.curwin.setW_cursor(pos);
					} 
					if (ptr == ((Object)0) && (len = ModernizedCProgram.find_ident_under_cursor(ptr, 1)) == 0) {
						return ;
					} 
					ModernizedCProgram.spell_add_word(ptr, len, nchar == (byte)'w' || nchar == (byte)'W' ? 1 : 0, (nchar == (byte)'G' || nchar == (byte)'W') ? 0 : (int)generatedCount1, undo);
				}
				break;
		case (-(((byte)'k') + ((int)((byte)'r') << 8))):
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
					ModernizedCProgram.curwin.getW_leftcol() += (colnr_T)generatedCount1;
					ModernizedCProgram.leftcol_changed();
				} 
				break;
		case (byte)'O':
				if (/* "zO": open fold recursively */VIsual_active) {
					cap.nv_operator();
				} else {
						ModernizedCProgram.openFoldRecurse(ModernizedCProgram.curwin.getW_cursor().getLnum());
				} 
				break;
		case (byte)'E':
				if (/* "zE": erase all folds */ModernizedCProgram.curwin.foldmethodIsManual()) {
					ModernizedCProgram.curwin.clearFolding();
					ModernizedCProgram.changed_window_setting();
				}  else if (ModernizedCProgram.curwin.foldmethodIsMarker()) {
					ModernizedCProgram.deleteFold((linenr_T)1, generatedMl_line_count, 1, 0);
				} else {
						ModernizedCProgram.emsg(((byte)("E352: Cannot erase folds with current 'foldmethod'")));
				} 
				break;
		case (byte)'\015':
		case (byte)'.':
				ModernizedCProgram.beginline(1 | /* "z." and "zz": put cursor in middle of screen */4/* FALLTHROUGH */);
		case (byte)'c':
				if (/* "zc": close fold at cursor or Visual area */VIsual_active) {
					cap.nv_operator();
				} else {
						ModernizedCProgram.closeFold(ModernizedCProgram.curwin.getW_cursor().getLnum(), generatedCount1);
				} 
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(1);
				break;
		case (byte)'t':
				ModernizedCProgram.scroll_cursor_top(0, 1);
				ModernizedCProgram.redraw_later(10);
				ModernizedCProgram.curwin.set_fraction();
				break;
		case (byte)'D':
				if (ModernizedCProgram.foldManualAllowed(0)) {
					if (VIsual_active) {
						cap.nv_operator();
					} else {
							ModernizedCProgram.deleteFold(ModernizedCProgram.curwin.getW_cursor().getLnum(), ModernizedCProgram.curwin.getW_cursor().getLnum(), nchar == (byte)'D', 0);
					} 
				} 
				break;
		case /* "zw": add wrong word to word list */(byte)'w':
		case (byte)'R':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fdl(ModernizedCProgram.getDeepestNesting());
				old_fdl = -/* force an update */1;
				break;
		case /* "zk" move to next fold upwards */(byte)'k':
				if (ModernizedCProgram.foldMoveTo(1, nchar == (byte)'j' ? 1 : (true), generatedCount1) == 0) {
					generatedOap.clearopbeep();
				} 
				break;
		case /* FALLTHROUGH */(byte)'-':
				ModernizedCProgram.beginline(1 | 4/* FALLTHROUGH */);
		case /* "zh" - scroll screen to the right */(byte)'h':
		case (byte)'n':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(/* "zn": fold none: reset 'foldenable' */0);
				break;
		case /* FALLTHROUGH */(byte)'\012':
		case (byte)'b':
				ModernizedCProgram.scroll_cursor_bot(0, 1);
				ModernizedCProgram.redraw_later(10);
				ModernizedCProgram.curwin.set_fraction();
				break;
		case /* "zl" - scroll screen to the left */(byte)'l':
		case (byte)'v':
				ModernizedCProgram.foldOpenCursor();
				break;
		case (-(((byte)'k') + ((int)((byte)'l') << 8))):
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
					if ((colnr_T)generatedCount1 > ModernizedCProgram.curwin.getW_leftcol()) {
						ModernizedCProgram.curwin.setW_leftcol(0);
					} else {
							ModernizedCProgram.curwin.getW_leftcol() -= (colnr_T)generatedCount1;
					} 
					ModernizedCProgram.leftcol_changed();
				} 
				break;
		case (byte)'z':
				ModernizedCProgram.scroll_cursor_halfway(1);
				ModernizedCProgram.redraw_later(10);
				ModernizedCProgram.curwin.set_fraction();
				break;
		case /* "z=": suggestions for a badly spelled word  */(byte)'=':
				if (!generatedOap.checkclearop()) {
					ModernizedCProgram.spell_suggest((int)generatedCount0);
				} 
				break;
		case (byte)'x':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(/* "zx": re-apply 'foldlevel' and open folds at the cursor */1);
				ModernizedCProgram.curwin.setW_foldinvalid(/* recompute folds */1);
				ModernizedCProgram.newFoldLevel();
				ModernizedCProgram.foldOpenCursor();
				break;
		case /* "zH" - scroll screen right half-page */(byte)'H':
				generatedCount1 *= ModernizedCProgram.curwin.getW_width() / 2/* FALLTHROUGH */;
		case /* "zd": delete fold at cursor *//* "zD": delete fold at cursor recursively */(byte)'d':
		case (byte)'X':
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_fen(/* "zX": undo manual opens/closes, re-apply 'foldlevel' */1);
				ModernizedCProgram.curwin.setW_foldinvalid(/* recompute folds */1);
				old_fdl = -/* force an update */1;
				break;
		case /* "zg": add good word to word list */(byte)'g':
		default:
				generatedOap.clearopbeep();
		}
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_scb = generatedW_onebuf_opt.getWo_scb();
		Object generatedWo_fen = generatedW_onebuf_opt.getWo_fen();
		window_S generatedW_next = wp.getW_next();
		if (old_fen != ModernizedCProgram.curwin.getW_onebuf_opt().getWo_fen()) {
			win_T wp = new win_T();
			if (ModernizedCProgram.curwin.foldmethodIsDiff() && ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scb()) {
				for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
					if (wp != ModernizedCProgram.curwin && wp.foldmethodIsDiff() && generatedWo_scb) {
						generatedW_onebuf_opt.setWo_fen(generatedWo_fen);
						wp.changed_window_setting_win();
					} 
				}
			} 
			ModernizedCProgram.changed_window_setting();
		} 
		Object generatedWo_fdl = generatedW_onebuf_opt.getWo_fdl();
		if (old_fdl != generatedWo_fdl) {
			ModernizedCProgram.newFoldLevel();
		} 
	}
	/* Even if an operator was pending, we still want to scroll */
	/*
	 * Horizontal scrollbar movement.
	 */
	/* Even if an operator was pending, we still want to scroll */
	/*
	 * Click in GUI tab.
	 */
	/* Even if an operator was pending, we still want to jump tabs. */
	/*
	 * Selected item in tab line menu.
	 */
	/* Even if an operator was pending, we still want to jump tabs. */
	/*
	 * Handle selecting an item of the GUI tab line menu.
	 * Used in Normal and Insert mode.
	 */
	/*
	 * "Q" command.
	 */
	public void nv_exmode() {
		oparg_S generatedOap = this.getOap();
		if (VIsual_active) {
			ModernizedCProgram.vim_beep(-1024);
		}  else if (!generatedOap.checkclearop()) {
			ModernizedCProgram.do_exmode(0/*
			 * Handle a ":" command.
			 */);
		} 
	}
	/*
	     * Ignore 'Q' in Visual mode, just give a beep.
	     */
	public void nv_colon() {
		int old_p_im;
		int cmd_result;
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		long generatedCount0 = this.getCount0();
		 generatedStart = generatedOap.getStart();
		Object generatedLnum = generatedStart.getLnum();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedCol = generatedStart.getCol();
		if (VIsual_active) {
			cap.nv_operator();
		} else {
				if (generatedOp_type != 0) {
					generatedOap.setMotion_type(/* Using ":" as a movement is characterwise exclusive. */0);
					generatedOap.setInclusive(0);
				}  else if (generatedCount0) {
					ModernizedCProgram.stuffcharReadbuff(/* translate "count:" into ":.,.+(count - 1)" */(byte)'.');
					if (generatedCount0 > 1) {
						ModernizedCProgram.stuffReadbuff((char_u)",.+");
						ModernizedCProgram.stuffnumReadbuff((long)generatedCount0 - -1024);
					} 
				} 
				if (/* When typing, don't type below an old message */ModernizedCProgram.KeyTyped) {
					ModernizedCProgram.compute_cmdrow();
				} 
				old_p_im = ModernizedCProgram.p_im;
				cmd_result = ModernizedCProgram.do_cmdline(((Object)0), getexline, ((Object)/* get a command line and execute it */0), generatedOp_type != 0 ? -1024 : 0);
				if (ModernizedCProgram.p_im != /* If 'insertmode' changed, enter or exit Insert mode */old_p_im) {
					if (ModernizedCProgram.p_im) {
						restart_edit = (byte)'i';
					} else {
							restart_edit = 0;
					} 
				} 
				if (cmd_result == 0) {
					generatedOap.clearop();
				}  else if (generatedOp_type != 0 && (generatedLnum > generatedMl_line_count || generatedCol > (colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))) || ModernizedCProgram.did_emsg)) {
					generatedOap.clearopbeep();
				} 
		} 
	}
	public void nv_ctrlg() {
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		if (/* toggle Selection/Visual mode */VIsual_active) {
			VIsual_select = !VIsual_select;
			.showmode();
		}  else if (!generatedOap.checkclearop()) {
			ModernizedCProgram.fileinfo((int)generatedCount0, 0, /* print full name if count given or :cd used */1/*
			 * Handle CTRL-H <Backspace> command.
			 */);
		} 
	}
	public void nv_ctrlh() {
		if (VIsual_active && VIsual_select) {
			this.setCmdchar(/* BS key behaves like 'x' in Select mode */(byte)'x');
			cap.v_visop();
		} else {
				cap/*
				 * CTRL-L: clear screen and redraw.
				 */.nv_left();
		} 
	}
	public void nv_clear() {
		oparg_S generatedOap = this.getOap();
		Object generatedW_s = wp.getW_s();
		window_S generatedW_next = wp.getW_next();
		if (!generatedOap.checkclearop()) {
			ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
			{ 
				win_T wp = new win_T();
				for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
					generatedW_s.setB_syn_slow(0);
				}
			}
			ModernizedCProgram.redraw_later(50);
			ModernizedCProgram.resize_console_buf();
		} 
	}
	public void nv_ctrlo() {
		long generatedCount1 = this.getCount1();
		if (VIsual_active && VIsual_select) {
			VIsual_select = 0;
			.showmode();
			ModernizedCProgram.restart_VIsual_select = /* restart Select mode later */2;
		} else {
				this.setCount1(-generatedCount1);
				cap/*
				 * CTRL-^ command, short for ":e #".  Works even when the alternate buffer is
				 * not named.
				 */.nv_pcmark();
		} 
	}
	public void nv_hat() {
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		if (!generatedOap.checkclearopq()) {
			(Object)ModernizedCProgram.buflist_getfile((int)generatedCount0, (linenr_T)0, -1024 | -1024, 0/*
			 * "Z" commands.
			 */);
		} 
	}
	public void nv_ident() {
		char_u ptr = ((Object)0);
		char_u buf = new char_u();
		int buflen;
		char_u newbuf = new char_u();
		char_u p = new char_u();
		/* value of 'keywordprg' */char_u kp = new char_u();
		/* 'keywordprg' is ":he" */int kp_help;
		/* 'keywordprg' starts with ":" */int kp_ex;
		int n = /* init for GCC */0;
		int cmdchar;
		/* "g" command */int g_cmd;
		int tag_cmd = 0;
		char_u aux_ptr = new char_u();
		int isman;
		int isman_s;
		int generatedCmdchar = this.getCmdchar();
		int generatedNchar = this.getNchar();
		if (generatedCmdchar == /* "g*", "g#", "g]" and "gCTRL-]" */(byte)'g') {
			cmdchar = generatedNchar;
			g_cmd = 1;
		} else {
				cmdchar = generatedCmdchar;
				g_cmd = 0;
		} 
		if (cmdchar == /* the pound sign, '#' for English keyboards */-1024) {
			cmdchar = (byte)'#'/*
			     * The "]", "CTRL-]" and "K" commands accept an argument in Visual mode.
			     */;
		} 
		oparg_S generatedOap = this.getOap();
		if (cmdchar == (byte)']' || cmdchar == 29 || cmdchar == (byte)'K') {
			if (VIsual_active && cap.get_visual_text(ptr, n) == 0) {
				return ;
			} 
			if (generatedOap.checkclearopq()) {
				return ;
			} 
		} 
		if (ptr == ((Object)0) && (n = ModernizedCProgram.find_ident_under_cursor(ptr, (cmdchar == (byte)'*' || cmdchar == (byte)'#') ? 1 | 2 : 1)) == 0) {
			generatedOap.clearop();
			return ;
		} 
		Object generatedB_p_kp = curbuf.getB_p_kp();
		kp = (generatedB_p_kp == (byte)'\000' ? ModernizedCProgram.p_kp : generatedB_p_kp);
		kp_help = (kp == (byte)'\000' || .strcmp((byte)(kp), (byte)(":he")) == 0 || .strcmp((byte)(kp), (byte)(":help")) == 0);
		if (kp_help && ModernizedCProgram.skipwhite(ptr) == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(/* found white space only */ModernizedCProgram.e_noident)));
			return ;
		} 
		kp_ex = (kp == (byte)':');
		buflen = (int)(n * 2 + 30 + .strlen((byte)(kp)));
		buf = ModernizedCProgram.alloc(buflen);
		if (buf == ((Object)0)) {
			return ;
		} 
		buf[0] = (byte)'\000';
		long generatedCount0 = this.getCount0();
		int generatedB_help = curbuf.getB_help();
		switch (cmdchar) {
		case (byte)']':
				tag_cmd = 1;
				.strcpy((byte)(buf), (byte)("ts "));
				break;
		case (byte)'K':
				if (kp_help) {
					.strcpy((byte)(buf), (byte)("he! "));
				}  else if (kp_ex) {
					if (generatedCount0 != 0) {
						ModernizedCProgram.vim_snprintf((byte)buf, buflen, "%s %ld", kp, generatedCount0);
					} else {
							.strcpy((byte)(buf), (byte)(kp));
					} 
					.strcat((byte)(buf), (byte)(" "));
				} else {
						while (ptr == (byte)'-' && n > /* An external command will probably use an argument starting
								 * with "-" as an option.  To avoid trouble we skip the "-". */0) {
							++ptr;
							--n;
						}
						if (n == 0) {
							ModernizedCProgram.emsg(((byte)(/* found dashes only */ModernizedCProgram.e_noident)));
							ModernizedCProgram.vim_free(buf);
							return ;
						} 
						isman = (.strcmp((byte)(kp), (byte)("man")) == /* When a count is given, turn it into a range.  Is this
								 * really what we want? */0);
						isman_s = (.strcmp((byte)(kp), (byte)("man -s")) == 0);
						if (generatedCount0 != 0 && !(isman || isman_s)) {
							.sprintf((byte)buf, ".,.+%ld", generatedCount0 - 1);
						} 
						.strcat((byte)(buf), (byte)("! "));
						if (generatedCount0 == 0 && isman_s) {
							.strcat((byte)(buf), (byte)("man"));
						} else {
								.strcat((byte)(buf), (byte)(kp));
						} 
						.strcat((byte)(buf), (byte)(" "));
						if (generatedCount0 != 0 && (isman || isman_s)) {
							.sprintf((byte)buf + .strlen((byte)(buf)), "%ld", generatedCount0);
							.strcat((byte)(buf), (byte)(" "));
						} 
				} 
				break;
		case (byte)'*':
		case (byte)'#'/*
			     * Put cursor at start of word, makes search skip the word
			     * under the cursor.
			     * Call setpcmark() first, so "*``" puts the cursor back where
			     * it was.
			     */:
				ModernizedCProgram.setpcmark();
				ModernizedCProgram.curwin.getW_cursor().setCol((colnr_T)(ptr - ModernizedCProgram.ml_get_curline()));
				if (!g_cmd && ModernizedCProgram.vim_iswordp(ptr)) {
					.strcpy((byte)(buf), (byte)("\\<"));
				} 
				no_smartcase = /* don't use 'smartcase' now */1;
				break;
		default:
				tag_cmd = 1;
				if (generatedB_help) {
					.strcpy((byte)(buf), (byte)("he! "));
				} else {
						if (g_cmd) {
							.strcpy((byte)(buf), (byte)("tj "));
						} else {
								.sprintf((byte)buf, "%ldta ", generatedCount0);
						} 
				} 
		}
		if (cmdchar == (byte)'K' && !/*
		     * Now grab the chars in the identifier
		     */kp_help) {
			ptr = ModernizedCProgram.vim_strnsave(ptr, n);
			if (kp_ex) {
				p = ModernizedCProgram.vim_strsave_fnameescape(ptr, /* Escape the argument properly for an Ex command */0);
			} else {
					p = ModernizedCProgram.vim_strsave_shellescape(ptr, 1, /* Escape the argument properly for a shell command */1);
			} 
			ModernizedCProgram.vim_free(ptr);
			if (p == ((Object)0)) {
				ModernizedCProgram.vim_free(buf);
				return ;
			} 
			newbuf = .realloc((buf), (.strlen((byte)(buf)) + .strlen((byte)(p)) + 1));
			if (newbuf == ((Object)0)) {
				ModernizedCProgram.vim_free(buf);
				ModernizedCProgram.vim_free(p);
				return ;
			} 
			buf = newbuf;
			.strcat((byte)(buf), (byte)(p));
			ModernizedCProgram.vim_free(p);
		} else {
				if (cmdchar == (byte)'*') {
					aux_ptr = (char_u)(ModernizedCProgram.p_magic ? "/.*~[^$\\" : "/^$\\");
				}  else if (cmdchar == (byte)'#') {
					aux_ptr = (char_u)(ModernizedCProgram.p_magic ? "/?.*~[^$\\" : "/?^$\\");
				}  else if (tag_cmd) {
					if (generatedB_help) {
						aux_ptr = (char_u)/* ":help" handles unescaped argument */"";
					} else {
							aux_ptr = (char_u)"\\|\"\n[";
					} 
				} else {
						aux_ptr = (char_u)"\\|\"\n*?[";
				} 
				p = buf + .strlen((byte)(buf));
				while (n-- > 0) {
					if (ModernizedCProgram.vim_strchr(aux_ptr, ptr) != ((Object)/* put a backslash before \ and some others */0)) {
						p++ = (byte)'\\'/* When current byte is a part of multibyte character, copy all
							     * bytes of that character. */;
					} 
					if (has_mbyte) {
						int i;
						int len = .UNRECOGNIZEDFUNCTIONNAME(ptr) - 1;
						for (i = 0; i < len && n >= 1; ) {
							p++ = ptr++;
						}
					} 
					p++ = ptr++;
				}
				p = (byte)'\000';
		} 
		if (cmdchar == (byte)'*' || cmdchar == /*
		     * Execute the command.
		     */(byte)'#') {
			if (!g_cmd && (has_mbyte ? ModernizedCProgram.vim_iswordp(ModernizedCProgram.mb_prevptr(ModernizedCProgram.ml_get_curline(), ptr)) : ModernizedCProgram.vim_iswordc(ptr[-1]))) {
				.strcat((byte)(buf), (byte)("\\>"));
			} 
			ModernizedCProgram.init_history();
			ModernizedCProgram.add_to_history(1, buf, 1, (byte)'\000');
			(Object)cap.normal_search(cmdchar == (byte)'*' ? (byte)'/' : (byte)'?', buf, 0, ((Object)0));
		} else {
				g_tag_at_cursor = 1;
				ModernizedCProgram.do_cmdline_cmd(buf);
				g_tag_at_cursor = 0;
		} 
		ModernizedCProgram.vim_free(buf/*
		 * Get visually selected text, within one line only.
		 * Returns FAIL if more than one line selected.
		 */);
	}
	public int get_visual_text(Object pp, int lenp) {
		if (VIsual_mode != /* return: length of selected text */(byte)'V') {
			ModernizedCProgram.unadjust_for_sel();
		} 
		oparg_S generatedOap = this.getOap();
		if (ModernizedCProgram.VIsual.getLnum() != ModernizedCProgram.curwin.getW_cursor().getLnum()) {
			if (cap != ((Object)0)) {
				generatedOap.clearopbeep();
			} 
			return 0;
		} 
		if (VIsual_mode == (byte)'V') {
			pp = ModernizedCProgram.ml_get_curline();
			lenp = (int).strlen((byte)(pp));
		} else {
				if ((((ModernizedCProgram.curwin.getW_cursor()).getLnum() != (ModernizedCProgram.VIsual).getLnum()) ? (ModernizedCProgram.curwin.getW_cursor()).getLnum() < (ModernizedCProgram.VIsual).getLnum() : (ModernizedCProgram.curwin.getW_cursor()).getCol() != (ModernizedCProgram.VIsual).getCol() ? (ModernizedCProgram.curwin.getW_cursor()).getCol() < (ModernizedCProgram.VIsual).getCol() : (ModernizedCProgram.curwin.getW_cursor()).getColadd() < (ModernizedCProgram.VIsual).getColadd())) {
					pp = ModernizedCProgram.curwin.getW_cursor().ml_get_pos();
					lenp = ModernizedCProgram.VIsual.getCol() - ModernizedCProgram.curwin.getW_cursor().getCol() + 1;
				} else {
						pp = ModernizedCProgram.VIsual.ml_get_pos();
						lenp = ModernizedCProgram.curwin.getW_cursor().getCol() - ModernizedCProgram.VIsual.getCol() + 1;
				} 
				if (has_mbyte) {
					lenp += .UNRECOGNIZEDFUNCTIONNAME(pp + (lenp - 1)) - /* Correct the length to include the whole last character. */1;
				} 
		} 
		ModernizedCProgram.reset_VIsual_and_resel();
		return 1/*
		 * CTRL-T: backwards in tag stack
		 */;
	}
	/* return: start of selected text */
	public void nv_tagpop() {
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		if (!generatedOap.checkclearopq()) {
			ModernizedCProgram.do_tag((char_u)"", 2, (int)generatedCount1, 0, 1/*
			 * Handle scrolling command 'H', 'L' and 'M'.
			 */);
		} 
	}
	public void nv_scroll() {
		int used = 0;
		long n;
		linenr_T lnum = new linenr_T();
		int half;
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(1);
		ModernizedCProgram.setpcmark();
		int generatedCmdchar = this.getCmdchar();
		long generatedCount1 = this.getCount1();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedCmdchar == (byte)'L') {
			ModernizedCProgram.validate_botline();
			ModernizedCProgram.curwin.getW_cursor().setLnum(ModernizedCProgram.curwin.getW_botline() - 1);
			if (generatedCount1 - 1 >= ModernizedCProgram.curwin.getW_cursor().getLnum()) {
				ModernizedCProgram.curwin.getW_cursor().setLnum(1);
			} else {
					if (ModernizedCProgram.curwin.hasAnyFolding()) {
						for (n = generatedCount1 - 1; n > /* Count a fold for one screen line. */0 && ModernizedCProgram.curwin.getW_cursor().getLnum() > ModernizedCProgram.curwin.getW_topline(); --n) {
							(Object)ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0));
							--ModernizedCProgram.curwin.getW_cursor().getLnum();
						}
					} else {
							ModernizedCProgram.curwin.getW_cursor().getLnum() -= generatedCount1 - 1;
					} 
			} 
		} else {
				if (generatedCmdchar == (byte)'M') {
					used -= ModernizedCProgram.curwin.diff_check_fill(ModernizedCProgram.curwin.getW_topline()) - ModernizedCProgram.curwin.getW_topfill();
					ModernizedCProgram.validate_botline();
					half = (ModernizedCProgram.curwin.getW_height() - ModernizedCProgram.curwin.getW_empty_rows() + 1) / 2;
					for (n = 0; ModernizedCProgram.curwin.getW_topline() + n < generatedMl_line_count; ++n) {
						if (n > 0 && used + ModernizedCProgram.curwin.diff_check_fill(ModernizedCProgram.curwin.getW_topline() + n) / 2 >= half) {
							--n;
							break;
						} 
						used += ModernizedCProgram.plines(ModernizedCProgram.curwin.getW_topline() + n);
						if (used >= half) {
							break;
						} 
						if (ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_topline() + n, ((Object)0), lnum)) {
							n = lnum - ModernizedCProgram.curwin.getW_topline();
						} 
					}
					if (n > 0 && used > ModernizedCProgram.curwin.getW_height()) {
						--n;
					} 
				} else {
						n = generatedCount1 - /* (cap->cmdchar == 'H') */1;
						if (ModernizedCProgram.curwin.hasAnyFolding()) {
							lnum = ModernizedCProgram.curwin.getW_topline();
							while (n-- > 0 && lnum < ModernizedCProgram.curwin.getW_botline() - 1) {
								(Object)ModernizedCProgram.hasFolding(lnum, ((Object)0), lnum);
								++lnum;
							}
							n = lnum - ModernizedCProgram.curwin.getW_topline();
						} 
				} 
				ModernizedCProgram.curwin.getW_cursor().setLnum(ModernizedCProgram.curwin.getW_topline() + n);
				if (ModernizedCProgram.curwin.getW_cursor().getLnum() > generatedMl_line_count) {
					ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
				} 
		} 
		int generatedOp_type = generatedOap.getOp_type();
		if (generatedOp_type == /* Correct for 'so', except when an operator is pending. */0) {
			ModernizedCProgram.cursor_correct();
		} 
		ModernizedCProgram.beginline(2 | 4/*
		 * Cursor right commands.
		 */);
	}
	public void nv_right() {
		long n;
		int past_line;
		if (mod_mask & (-1024 | -1024)) {
			if (mod_mask & /* <C-Right> and <S-Right> move a word or WORD right */-1024) {
				this.setArg(1);
			} 
			cap.nv_wordcmd();
			return ;
		} 
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		past_line = (VIsual_active && ModernizedCProgram.p_sel != (byte)'o'/*
		     * In virtual edit mode, there's no such thing as "past_line", as lines
		     * are (theoretically) infinitely long.
		     */);
		if (ModernizedCProgram.virtual_active()) {
			past_line = 0;
		} 
		int generatedCmdchar = this.getCmdchar();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedInclusive = generatedOap.getInclusive();
		long generatedCount1 = this.getCount1();
		for (n = generatedCount1; n > 0; --n) {
			if ((!past_line && ModernizedCProgram.oneright() == 0) || (past_line && ModernizedCProgram.ml_get_cursor() == (byte)'\000'/*
				     *	  <Space> wraps to next line if 'whichwrap' has 's'.
				     *	      'l' wraps to next line if 'whichwrap' has 'l'.
				     * CURS_RIGHT wraps to next line if 'whichwrap' has '>'.
				     */)) {
				if (((generatedCmdchar == (byte)' ' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'s') != ((Object)0)) || (generatedCmdchar == (byte)'l' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'l') != ((Object)0)) || (generatedCmdchar == (-(((byte)'k') + ((int)((byte)'r') << 8))) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'>') != ((Object)0))) && ModernizedCProgram.curwin.getW_cursor().getLnum() < generatedMl_line_count) {
					if (generatedOp_type != 0 && !generatedInclusive && !(ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()) == (byte)'\000')) {
						generatedOap.setInclusive(1);
					} else {
							++ModernizedCProgram.curwin.getW_cursor().getLnum();
							ModernizedCProgram.curwin.getW_cursor().setCol(0);
							ModernizedCProgram.curwin.getW_cursor().setColadd(0);
							ModernizedCProgram.curwin.setW_set_curswant(1);
							generatedOap.setInclusive(0);
					} 
					continue;
				} 
				if (generatedOp_type == 0) {
					if (n == generatedCount1) {
						ModernizedCProgram.beep_flush();
					} 
				} else {
						if (!(ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()) == (byte)'\000')) {
							generatedOap.setInclusive(1);
						} 
				} 
				break;
			}  else if (past_line) {
				ModernizedCProgram.curwin.setW_set_curswant(1);
				if (ModernizedCProgram.virtual_active()) {
					ModernizedCProgram.oneright();
				} else {
						if (has_mbyte) {
							ModernizedCProgram.curwin.getW_cursor().getCol() += .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.ml_get_cursor());
						} else {
								++ModernizedCProgram.curwin.getW_cursor().getCol();
						} 
				} 
			} 
		}
		if (n != generatedCount1 && (fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_left() {
		long n;
		if (mod_mask & (-1024 | -1024)) {
			if (mod_mask & /* <C-Left> and <S-Left> move a word or WORD left */-1024) {
				this.setArg(1);
			} 
			cap.nv_bck_word();
			return ;
		} 
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		int generatedCmdchar = this.getCmdchar();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedRetval = this.getRetval();
		long generatedCount1 = this.getCount1();
		for (n = generatedCount1; n > 0; --n) {
			if (ModernizedCProgram.oneleft() == 0/* <BS> and <Del> wrap to previous line if 'whichwrap' has 'b'.
				     *		 'h' wraps to previous line if 'whichwrap' has 'h'.
				     *	   CURS_LEFT wraps to previous line if 'whichwrap' has '<'.
				     */) {
				if ((((generatedCmdchar == (-(((byte)'k') + ((int)((byte)'b') << 8))) || generatedCmdchar == 8) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'b') != ((Object)0)) || (generatedCmdchar == (byte)'h' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'h') != ((Object)0)) || (generatedCmdchar == (-(((byte)'k') + ((int)((byte)'l') << 8))) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'<') != ((Object)0))) && ModernizedCProgram.curwin.getW_cursor().getLnum() > 1) {
					--(ModernizedCProgram.curwin.getW_cursor().getLnum());
					ModernizedCProgram.coladvance((colnr_T)INT_MAX);
					ModernizedCProgram.curwin.setW_set_curswant(1/* When the NL before the first char has to be deleted we
							 * put the cursor on the NUL after the previous line.
							 * This is a very special case, be careful!
							 * Don't adjust op_end now, otherwise it won't work. */);
					if ((generatedOp_type == 1 || generatedOp_type == 3) && !(ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()) == (byte)'\000')) {
						char_u cp = ModernizedCProgram.ml_get_cursor();
						if (cp != (byte)'\000') {
							if (has_mbyte) {
								ModernizedCProgram.curwin.getW_cursor().getCol() += .UNRECOGNIZEDFUNCTIONNAME(cp);
							} else {
									++ModernizedCProgram.curwin.getW_cursor().getCol();
							} 
						} 
						generatedRetval |=  2;
					} 
					continue;
				}  else if (generatedOp_type == 0 && n == generatedCount1) {
					ModernizedCProgram.beep_flush();
				} 
				break;
			} 
		}
		if (n != generatedCount1 && (fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_up() {
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedArg = this.getArg();
		if (mod_mask & -1024) {
			this.setArg((/* <S-Up> is page up */true));
			cap.nv_page();
		} else {
				generatedOap.setMotion_type(1);
				if (ModernizedCProgram.cursor_up(generatedCount1, generatedOp_type == 0) == 0) {
					generatedOap.clearopbeep();
				}  else if (generatedArg) {
					ModernizedCProgram.beginline(1 | 4/*
					 * Cursor down commands.
					 * cap->arg is TRUE for CR and "+": Move cursor to first non-blank.
					 */);
				} 
		} 
	}
	public void nv_down() {
		int generatedCmdchar = this.getCmdchar();
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedArg = this.getArg();
		if (mod_mask & -1024) {
			this.setArg(/* <S-Down> is page down */1);
			cap.nv_page();
		}  else if (curbuf.bt_quickfix() && generatedCmdchar == /* Quickfix window only: view the result under the cursor. */(byte)'\015') {
			ModernizedCProgram.qf_view_result(0);
		} else {
				if (cmdwin_type != 0 && generatedCmdchar == /* In the cmdline window a <CR> executes the command. */(byte)'\015') {
					cmdwin_result = (byte)'\015'/* In a prompt buffer a <CR> in the last line invokes the callback. */;
				} else {
						generatedOap.setMotion_type(1);
						if (ModernizedCProgram.cursor_down(generatedCount1, generatedOp_type == 0) == 0) {
							generatedOap.clearopbeep();
						}  else if (generatedArg) {
							ModernizedCProgram.beginline(1 | 4);
						} 
				} 
		} 
	}
	/*
	 * Grab the file name under the cursor and edit it.
	 */
	public void nv_gotofile() {
		char_u ptr = new char_u();
		linenr_T lnum = -1;
		oparg_S generatedOap = this.getOap();
		if (ModernizedCProgram.text_locked()) {
			generatedOap.clearopbeep();
			ModernizedCProgram.text_locked_msg();
			return ;
		} 
		if (ModernizedCProgram.curbuf_locked()) {
			generatedOap.clearop();
			return ;
		} 
		long generatedCount1 = this.getCount1();
		ptr = ModernizedCProgram.grab_file_name(generatedCount1, lnum);
		int generatedB_nwindows = curbuf.getB_nwindows();
		int generatedNchar = this.getNchar();
		if (ptr != ((Object)0)) {
			if (ModernizedCProgram.curbufIsChanged() && generatedB_nwindows <= 1 && !/* do autowrite if necessary */curbuf.buf_hide()) {
				(Object)curbuf.autowrite(0);
			} 
			ModernizedCProgram.setpcmark();
			if (ModernizedCProgram.do_ecmd(0, ptr, ((Object)0), ((Object)0), (linenr_T)-1, curbuf.buf_hide() ? -1024 : 0, ModernizedCProgram.curwin) == 1 && generatedNchar == (byte)'F' && lnum >= 0) {
				ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
				ModernizedCProgram.check_cursor_lnum();
				ModernizedCProgram.beginline(2 | 4);
			} 
			ModernizedCProgram.vim_free(ptr);
		} else {
				generatedOap.clearop();
		} 
	}
	public void nv_end() {
		int generatedArg = this.getArg();
		if (generatedArg || (mod_mask & /* CTRL-END = goto last line */-1024)) {
			this.setArg(1);
			cap.nv_goto();
			this.setCount1(/* to end of current line */1);
		} 
		cap/*
		 * Handle the "$" command.
		 */.nv_dollar();
	}
	public void nv_dollar() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(1/* In virtual mode when off the edge of a line and an operator
		     * is pending (whew!) keep the cursor where it is.
		     * Otherwise, send it to the end of the line. */);
		int generatedOp_type = generatedOap.getOp_type();
		if (!ModernizedCProgram.virtual_active() || ModernizedCProgram.gchar_cursor() != (byte)'\000' || generatedOp_type == 0) {
			ModernizedCProgram.curwin.setW_curswant(/* so we stay at the end */INT_MAX);
		} 
		long generatedCount1 = this.getCount1();
		if (ModernizedCProgram.cursor_down((long)(generatedCount1 - 1), generatedOp_type == 0) == 0) {
			generatedOap.clearopbeep();
		}  else if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_search() {
		oparg_S generatedOap = this.getOap();
		oparg_T oap = generatedOap;
		pos_T save_cursor = ModernizedCProgram.curwin.getW_cursor();
		int generatedCmdchar = this.getCmdchar();
		int generatedOp_type = generatedOap.getOp_type();
		if (generatedCmdchar == (byte)'?' && generatedOp_type == 15) {
			this.setCmdchar(/* Translate "g??" to "g?g?" */(byte)'g');
			this.setNchar((byte)'?');
			cap.nv_operator();
			return ;
		} 
		long generatedCount1 = this.getCount1();
		this.setSearchbuf(ModernizedCProgram.getcmdline(generatedCmdchar, generatedCount1, 0, /* When using 'incsearch' the cursor may be moved to set a different search
		     * start position. */1));
		Object generatedSearchbuf = this.getSearchbuf();
		if (generatedSearchbuf == ((Object)0)) {
			oap.clearop();
			return ;
		} 
		int generatedArg = this.getArg();
		Object generatedLnum = (save_cursor).getLnum();
		Object generatedCol = (save_cursor).getCol();
		Object generatedColadd = (save_cursor).getColadd();
		(Object)cap.normal_search(generatedCmdchar, generatedSearchbuf, (generatedArg || !((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) ? 0 : -1024, ((Object)0/*
		 * Handle "N" and "n" commands.
		 * cap->arg is SEARCH_REV for "N", 0 for "n".
		 */));
	}
	public void nv_next() {
		pos_T old = ModernizedCProgram.curwin.getW_cursor();
		int wrapped = 0;
		int generatedArg = this.getArg();
		int i = cap.normal_search(0, ((Object)0), -1024 | generatedArg, wrapped);
		Object generatedLnum = (old).getLnum();
		Object generatedCol = (old).getCol();
		Object generatedColadd = (old).getColadd();
		long generatedCount1 = this.getCount1();
		if (i == 1 && !wrapped && ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) {
			generatedCount1 += 1;
			(Object)cap.normal_search(0, ((Object)0), -1024 | generatedArg, ((Object)0));
			generatedCount1 -= 1/*
			 * Search for "pat" in direction "dir" ('/' or '?', 0 for repeat).
			 * Uses only cap->count1 and cap->oap from "cap".
			 * Return 0 for failure, 1 for found, 2 for found and line offset added.
			 */;
		} 
	}
	public int normal_search(int dir, Object pat, int opt, int wrapped) {
		// extra flags for do_search()int i;
		searchit_arg_T sia = new searchit_arg_T();
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		generatedOap.setUse_reg_one(1);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		.memset((sia), (false), ());
		long generatedCount1 = this.getCount1();
		i = ModernizedCProgram.do_search(generatedOap, dir, pat, generatedCount1, opt | -1024 | -1024 | -1024, sia);
		Object generatedSa_wrapped = sia.getSa_wrapped();
		if (wrapped != ((Object)0)) {
			wrapped = generatedSa_wrapped;
		} 
		int generatedOp_type = generatedOap.getOp_type();
		if (i == 0) {
			generatedOap.clearop();
		} else {
				if (i == 2) {
					generatedOap.setMotion_type(1);
				} 
				ModernizedCProgram.curwin.getW_cursor().setColadd(0);
				if (generatedOp_type == 0 && (fdo_flags & -1024) && ModernizedCProgram.KeyTyped) {
					ModernizedCProgram.foldOpenCursor();
				} 
		} 
		ModernizedCProgram.check_cursor();
		return i/*
		 * Character search commands.
		 * cap->arg is BACKWARD for 'F' and 'T', FORWARD for 'f' and 't', TRUE for
		 * ',' and FALSE for ';'.
		 * cap->nchar is NUL for ',' and ';' (repeat the search)
		 */;
	}
	public void nv_csearch() {
		int t_cmd;
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == (byte)'t' || generatedCmdchar == (byte)'T') {
			t_cmd = 1;
		} else {
				t_cmd = 0;
		} 
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		int generatedNchar = this.getNchar();
		int generatedArg = this.getArg();
		int generatedOp_type = generatedOap.getOp_type();
		if (((generatedNchar) < 0) || cap.searchc(t_cmd) == 0) {
			generatedOap.clearopbeep();
		} else {
				ModernizedCProgram.curwin.setW_set_curswant(1);
				if (ModernizedCProgram.gchar_cursor() == (byte)'\011' && ModernizedCProgram.virtual_active() && generatedArg == /* Include a Tab for "tx" and for "dfx". */1 && (t_cmd || generatedOp_type != 0)) {
					colnr_T scol = new colnr_T();
					colnr_T ecol = new colnr_T();
					ModernizedCProgram.getvcol(ModernizedCProgram.curwin, ModernizedCProgram.curwin.getW_cursor(), scol, ((Object)0), ecol);
					ModernizedCProgram.curwin.getW_cursor().setColadd(ecol - scol);
				} else {
						ModernizedCProgram.curwin.getW_cursor().setColadd(0);
				} 
				cap.adjust_for_sel();
				if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
					ModernizedCProgram.foldOpenCursor();
				} 
		} 
	}
	public void nv_brackets() {
		pos_T new_pos = new pos_T(0, 0, 0);
		pos_T prev_pos = new pos_T();
		pos_T pos = ((Object)/* init for GCC */0);
		/* cursor position before command */pos_T old_pos = new pos_T();
		int flag;
		long n;
		int findc;
		int c;
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		old_pos = ModernizedCProgram.curwin.getW_cursor();
		// TODO: don't do this for an error.// TODO: don't do this for an error.ModernizedCProgram.curwin.getW_cursor().setColadd(0);
		int generatedNchar = this.getNchar();
		long generatedCount0 = this.getCount0();
		long generatedCount1 = this.getCount1();
		int generatedCmdchar = this.getCmdchar();
		Object generatedLnum = new_pos.getLnum();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedInclusive = generatedOap.getInclusive();
		int generatedArg = this.getArg();
		if (generatedNchar == /*
		     * "[f" or "]f" : Edit file under the cursor (same as "gf")
		     */(byte)'f') {
			cap/*
			     * Find the occurrence(s) of the identifier or define under cursor
			     * in current and included files or jump to the first occurrence.
			     *
			     *			search	     list	    jump
			     *		      fwd   bwd    fwd	 bwd	 fwd	bwd
			     * identifier     "]i"  "[i"   "]I"  "[I"	"]^I"  "[^I"
			     * define	      "]d"  "[d"   "]D"  "[D"	"]^D"  "[^D"
			     */.nv_gotofile();
		}  else if (ModernizedCProgram.vim_strchr((char_u)"iI\011dD\004", generatedNchar) != ((Object)0)) {
			char_u ptr = new char_u();
			int len;
			if ((len = ModernizedCProgram.find_ident_under_cursor(ptr, 1)) == 0) {
				generatedOap.clearop();
			} else {
					ModernizedCProgram.find_pattern_in_path(ptr, 0, len, 1, generatedCount0 == 0 ? !.isupper(generatedNchar) : 0, ((generatedNchar & -1024) == ((byte)'d' & -1024)) ? 2 : 1, generatedCount1, .isupper(generatedNchar) ? 4 : .islower(generatedNchar) ? 1 : 2, generatedCmdchar == (byte)']' ? ModernizedCProgram.curwin.getW_cursor().getLnum() + 1 : (linenr_T)1, (linenr_T)LONG_MAX);
					ModernizedCProgram.curwin.setW_set_curswant(1);
			} 
		}  else if ((generatedCmdchar == (byte)'[' && ModernizedCProgram.vim_strchr((char_u)"{(*/#mM", generatedNchar) != ((Object)0)) || (generatedCmdchar == (byte)']' && ModernizedCProgram.vim_strchr((char_u)"})*/#mM", generatedNchar) != ((Object)0))) {
			if (generatedNchar == (byte)'*') {
				this.setNchar((byte)'/');
			} 
			prev_pos.setLnum(0);
			if (generatedNchar == (byte)'m' || generatedNchar == (byte)'M') {
				if (generatedCmdchar == (byte)'[') {
					findc = (byte)'{';
				} else {
						findc = (byte)'}';
				} 
				n = 9999;
			} else {
					findc = generatedNchar;
					n = generatedCount1;
			} 
			for (; n > 0; --n) {
				if ((pos = generatedOap.findmatchlimit(findc, (generatedCmdchar == (byte)'[') ? -1024 : -1024, 0)) == ((Object)0)) {
					if (generatedLnum == /* nothing found */0) {
						if (generatedNchar != (byte)'m' && generatedNchar != (byte)'M') {
							generatedOap.clearopbeep();
						} 
					} else {
							pos = /* use last one found */new_pos;
					} 
					break;
				} 
				prev_pos = new_pos;
				ModernizedCProgram.curwin.setW_cursor(pos);
				new_pos = pos;
			}
			ModernizedCProgram.curwin.setW_cursor(old_pos/*
				 * Handle "[m", "]m", "[M" and "[M".  The findmatchlimit() only
				 * brought us to the match for "[m" and "]M" when inside a method.
				 * Try finding the '{' or '}' we want to be at.
				 * Also repeat for the given count.
				 */);
			if (generatedNchar == (byte)'m' || generatedNchar == (byte)'M') {
				int norm = ((findc == (byte)'{') == (generatedNchar == /* norm is TRUE for "]M" and "[m" */(byte)'m'));
				n = generatedCount1;
				if (generatedLnum != /* found a match: we were inside a method */0) {
					pos = prev_pos;
					ModernizedCProgram.curwin.setW_cursor(prev_pos);
					if (norm) {
						--n;
					} 
				} else {
						pos = ((Object)0);
				} 
				while (n > 0) {
					for (; ; ) {
						if ((findc == (byte)'{' ? ModernizedCProgram.dec_cursor() : ModernizedCProgram.inc_cursor()) < 0) {
							if (pos == ((Object)/* if not found anything, that's an error */0)) {
								generatedOap.clearopbeep();
							} 
							n = 0;
							break;
						} 
						c = ModernizedCProgram.gchar_cursor();
						if (c == (byte)'{' || c == (byte)'}') {
							if ((c == findc && norm) || (n == 1 && !/* Must have found end/start of class: use it.
										 * Or found the place to be at. */norm)) {
								new_pos = ModernizedCProgram.curwin.getW_cursor();
								pos = new_pos;
								n = 0;
							}  else if (generatedLnum == /* if no match found at all, we started outside of the
										 * class and we're inside now.  Just go on. */0) {
								new_pos = ModernizedCProgram.curwin.getW_cursor();
								pos = new_pos;
							}  else if ((pos = generatedOap.findmatchlimit(/* found start/end of other method: go to match */findc, (generatedCmdchar == (byte)'[') ? -1024 : -1024, 0)) == ((Object)0)) {
								n = 0;
							} else {
									ModernizedCProgram.curwin.setW_cursor(pos);
							} 
							break;
						} 
					}
					--n;
				}
				ModernizedCProgram.curwin.setW_cursor(old_pos);
				if (pos == ((Object)0) && generatedLnum != 0) {
					generatedOap.clearopbeep();
				} 
			} 
			if (pos != ((Object)0)) {
				ModernizedCProgram.setpcmark();
				ModernizedCProgram.curwin.setW_cursor(pos);
				ModernizedCProgram.curwin.setW_set_curswant(1);
				if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
					ModernizedCProgram.foldOpenCursor();
				} 
			} 
		}  else if (generatedNchar == (byte)'[' || generatedNchar == /*
		     * "[[", "[]", "]]" and "][": move to start or end of function
		     */(byte)']') {
			if (generatedNchar == generatedCmdchar) {
				flag = (byte)'{';
			} else {
					flag = /* "][" or "[]" */(byte)'}';
			} 
			ModernizedCProgram.curwin.setW_set_curswant(1/*
				 * Imitate strange Vi behaviour: When using "]]" with an operator
				 * we also stop at '}'.
				 */);
			if (!ModernizedCProgram.findpar(generatedInclusive, generatedArg, generatedCount1, flag, (generatedOp_type != 0 && generatedArg == 1 && flag == (byte)'{'))) {
				generatedOap.clearopbeep();
			} else {
					if (generatedOp_type == 0) {
						ModernizedCProgram.beginline(1 | 4);
					} 
					if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
						ModernizedCProgram.foldOpenCursor();
					} 
			} 
		}  else if (generatedNchar == (byte)'p' || generatedNchar == /*
		     * "[p", "[P", "]P" and "]p": put with indent adjustment
		     */(byte)'P') {
			cap.nv_put_opt(1);
		}  else if (generatedNchar == (byte)'\'' || generatedNchar == /*
		     * "['", "[`", "]'" and "]`": jump to next mark
		     */(byte)'`') {
			pos = ModernizedCProgram.curwin.getW_cursor();
			for (n = generatedCount1; n > 0; --n) {
				prev_pos = pos;
				pos = pos.getnextmark(generatedCmdchar == (byte)'[' ? (true) : 1, generatedNchar == (byte)'\'');
				if (pos == ((Object)0)) {
					break;
				} 
			}
			if (pos == ((Object)0)) {
				pos = prev_pos;
			} 
			ModernizedCProgram.nv_cursormark(cap, generatedNchar == (byte)'\'', pos/*
			     * [ or ] followed by a middle mouse click: put selected text with
			     * indent adjustment.  Any other button just does as usual.
			     */);
		}  else if (generatedNchar >= (-((true) + ((int)(key_extra.KE_RIGHTRELEASE) << 8))) && generatedNchar <= (-((true) + ((int)(key_extra.KE_LEFTMOUSE) << 8)))) {
			(Object).do_mouse(generatedOap, generatedNchar, (generatedCmdchar == (byte)']') ? 1 : (true), generatedCount1, 1);
		}  else if (generatedNchar == /*
		     * "[z" and "]z": move to start or end of open fold.
		     */(byte)'z') {
			if (ModernizedCProgram.foldMoveTo(0, generatedCmdchar == (byte)']' ? 1 : (true), generatedCount1) == 0) {
				generatedOap.clearopbeep();
			} 
		}  else if (generatedNchar == /*
		     * "[c" and "]c": move to next or previous diff-change.
		     */(byte)'c') {
			if (ModernizedCProgram.diff_move_to(generatedCmdchar == (byte)']' ? 1 : (true), generatedCount1) == 0) {
				generatedOap.clearopbeep();
			} 
		}  else if (generatedNchar == (byte)'s' || generatedNchar == /*
		     * "[s", "[S", "]s" and "]S": move to next spell error.
		     */(byte)'S') {
			ModernizedCProgram.setpcmark();
			for (n = 0; n < generatedCount1; ++n) {
				if (ModernizedCProgram.curwin.spell_move_to(generatedCmdchar == (byte)']' ? 1 : (true), generatedNchar == (byte)'s' ? 1 : 0, 0, ((Object)0)) == 0) {
					generatedOap.clearopbeep();
					break;
				} else {
						ModernizedCProgram.curwin.setW_set_curswant(1);
				} 
			}
			if (generatedOp_type == 0 && (fdo_flags & -1024) && ModernizedCProgram.KeyTyped) {
				ModernizedCProgram.foldOpenCursor();
			} 
		} else {
				generatedOap.clearopbeep();
		} 
	}
	public void nv_percent() {
		pos_T pos = new pos_T();
		linenr_T lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
		oparg_S generatedOap = this.getOap();
		generatedOap.setInclusive(1);
		long generatedCount0 = this.getCount0();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedCount0) {
			if (generatedCount0 > 100) {
				generatedOap.clearopbeep();
			} else {
					generatedOap.setMotion_type(1);
					ModernizedCProgram.setpcmark();
					if (generatedMl_line_count > 1000000) {
						ModernizedCProgram.curwin.getW_cursor().setLnum((generatedMl_line_count + -1024) / -1024 * generatedCount0);
					} else {
							ModernizedCProgram.curwin.getW_cursor().setLnum((generatedMl_line_count * generatedCount0 + -1024) / -1024);
					} 
					if (ModernizedCProgram.curwin.getW_cursor().getLnum() > generatedMl_line_count) {
						ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
					} 
					ModernizedCProgram.beginline(2 | 4);
			} 
		} else {
				generatedOap.setMotion_type(/* "%" : go to matching paren */0);
				generatedOap.setUse_reg_one(1);
				if ((pos = generatedOap.findmatch((byte)'\000')) == ((Object)0)) {
					generatedOap.clearopbeep();
				} else {
						ModernizedCProgram.setpcmark();
						ModernizedCProgram.curwin.setW_cursor(pos);
						ModernizedCProgram.curwin.setW_set_curswant(1);
						ModernizedCProgram.curwin.getW_cursor().setColadd(0);
						cap.adjust_for_sel();
				} 
		} 
		int generatedOp_type = generatedOap.getOp_type();
		if (generatedOp_type == 0 && lnum != ModernizedCProgram.curwin.getW_cursor().getLnum() && (fdo_flags & -1024) && ModernizedCProgram.KeyTyped) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_brace() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setUse_reg_one(1);
		generatedOap.setInclusive(/* The motion used to be inclusive for "(", but that is not what Vi does. */0);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		int generatedArg = this.getArg();
		long generatedCount1 = this.getCount1();
		int generatedOp_type = generatedOap.getOp_type();
		if (ModernizedCProgram.findsent(generatedArg, generatedCount1) == 0) {
			generatedOap.clearopbeep();
		} else {
				generatedOap.adjust_cursor();
				ModernizedCProgram.curwin.getW_cursor().setColadd(0);
				if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
					ModernizedCProgram.foldOpenCursor();
				} 
		} 
	}
	/*
	 * "m" command: Mark a position.
	 */
	public void nv_mark() {
		oparg_S generatedOap = this.getOap();
		int generatedNchar = this.getNchar();
		if (!generatedOap.checkclearop()) {
			if (ModernizedCProgram.setmark(generatedNchar) == 0) {
				generatedOap.clearopbeep();
			} 
		} 
	}
	public void nv_findpar() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		generatedOap.setUse_reg_one(1);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		int generatedInclusive = generatedOap.getInclusive();
		int generatedArg = this.getArg();
		long generatedCount1 = this.getCount1();
		int generatedOp_type = generatedOap.getOp_type();
		if (!ModernizedCProgram.findpar(generatedInclusive, generatedArg, generatedCount1, (byte)'\000', 0)) {
			generatedOap.clearopbeep();
		} else {
				ModernizedCProgram.curwin.getW_cursor().setColadd(0);
				if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
					ModernizedCProgram.foldOpenCursor();
				} 
		} 
	}
	/*
	 * "u" command: Undo or make lower case.
	 */
	public void nv_undo() {
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		if (generatedOp_type == 12 || VIsual_active) {
			this.setCmdchar(/* translate "<Visual>u" to "<Visual>gu" and "guu" to "gugu" */(byte)'g');
			this.setNchar((byte)'u');
			cap.nv_operator();
		} else {
				cap/*
				 * <Undo> command.
				 */.nv_kundo();
		} 
	}
	public void nv_kundo() {
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		if (!generatedOap.checkclearopq()) {
			ModernizedCProgram.u_undo((int)generatedCount1);
			ModernizedCProgram.curwin.setW_set_curswant(1/*
			 * Handle the "r" command.
			 */);
		} 
	}
	public void nv_replace() {
		char_u ptr = new char_u();
		int had_ctrl_v;
		long n;
		oparg_S generatedOap = this.getOap();
		if (generatedOap.checkclearop()) {
			return ;
		} 
		int generatedNchar = this.getNchar();
		if (generatedNchar == /* get another character */22) {
			had_ctrl_v = 22;
			this.setNchar(ModernizedCProgram.get_literal());
			if (generatedNchar > /* Don't redo a multibyte character with CTRL-V. */-1024) {
				had_ctrl_v = (byte)'\000';
			} 
		} else {
				had_ctrl_v = (byte)'\000';
		} 
		if (((generatedNchar) < /* Abort if the character is a special key. */0)) {
			generatedOap.clearopbeep();
			return ;
		} 
		if (/* Visual mode "r" */VIsual_active) {
			if (got_int) {
				ModernizedCProgram.reset_VIsual();
			} 
			if (had_ctrl_v) {
				if (generatedNchar == /* Use a special (negative) number to make a difference between a
					     * literal CR or NL and a line break. */(byte)'\015') {
					this.setNchar(-1);
				}  else if (generatedNchar == (byte)'\012') {
					this.setNchar(-2);
				} 
			} 
			cap.nv_operator();
			return ;
		} 
		long generatedCount1 = this.getCount1();
		if (ModernizedCProgram.virtual_active()) {
			if (ModernizedCProgram.u_save_cursor() == 0) {
				return ;
			} 
			if (ModernizedCProgram.gchar_cursor() == (byte)'\000') {
				ModernizedCProgram.coladvance_force((colnr_T)(ModernizedCProgram.getviscol() + generatedCount1));
				ModernizedCProgram.curwin.getW_cursor().getCol() -= generatedCount1;
			}  else if (ModernizedCProgram.gchar_cursor() == (byte)'\011') {
				ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol());
			} 
		} 
		ptr = ModernizedCProgram.ml_get_cursor();
		if (.strlen((byte)(ptr)) < (int)generatedCount1 || (has_mbyte && ModernizedCProgram.mb_charlen(ptr) < generatedCount1)) {
			generatedOap.clearopbeep();
			return ;
		} 
		int generatedB_p_et = curbuf.getB_p_et();
		if (had_ctrl_v != 22 && generatedNchar == (byte)'\t' && (generatedB_p_et || ModernizedCProgram.p_sta)) {
			ModernizedCProgram.stuffnumReadbuff(generatedCount1);
			ModernizedCProgram.stuffcharReadbuff((byte)'R');
			ModernizedCProgram.stuffcharReadbuff((byte)'\t');
			ModernizedCProgram.stuffcharReadbuff((byte)'\033');
			return ;
		} 
		if (ModernizedCProgram.u_save_cursor() == /* save line for undo */0) {
			return ;
		} 
		int generatedRegname = generatedOap.getRegname();
		int generatedNcharC1 = this.getNcharC1();
		int generatedNcharC2 = this.getNcharC2();
		if (had_ctrl_v != 22 && (generatedNchar == (byte)'\r' || generatedNchar == (byte)'\n'/*
			 * Replace character(s) by a single newline.
			 * Strange vi behaviour: Only one newline is inserted.
			 * Delete the characters here.
			 * Insert the newline with an insert command, takes care of
			 * autoindent.	The insert command depends on being on the last
			 * character of a line or not.
			 */)) {
			(Object)ModernizedCProgram.del_chars(generatedCount1, /* delete the characters */0);
			ModernizedCProgram.stuffcharReadbuff((byte)'\r');
			ModernizedCProgram.stuffcharReadbuff((byte)'\033');
			cap.invoke_edit(1, (byte)'r', /* Give 'r' to edit(), to get the redo command right. */0);
		} else {
				ModernizedCProgram.prep_redo(generatedRegname, generatedCount1, (byte)'\000', (byte)'r', (byte)'\000', had_ctrl_v, generatedNchar);
				curbuf.setB_op_start(ModernizedCProgram.curwin.getW_cursor());
				if (has_mbyte) {
					int old_State = State;
					if (generatedNcharC1 != 0) {
						ModernizedCProgram.AppendCharToRedobuff(generatedNcharC1);
					} 
					if (generatedNcharC2 != 0) {
						ModernizedCProgram.AppendCharToRedobuff(generatedNcharC2);
					} 
					for (n = generatedCount1; n > 0; --n) {
						State = (-1024 + -1024);
						if (generatedNchar == 5 || generatedNchar == 25) {
							int c = ModernizedCProgram.ins_copychar(ModernizedCProgram.curwin.getW_cursor().getLnum() + (generatedNchar == 25 ? -1 : 1));
							if (c != (byte)'\000') {
								ModernizedCProgram.ins_char(c);
							} else {
									++ModernizedCProgram.curwin.getW_cursor().getCol();
							} 
						} else {
								ModernizedCProgram.ins_char(generatedNchar);
						} 
						State = old_State;
						if (generatedNcharC1 != 0) {
							ModernizedCProgram.ins_char(generatedNcharC1);
						} 
						if (generatedNcharC2 != 0) {
							ModernizedCProgram.ins_char(generatedNcharC2);
						} 
					}
				} else {
						for (n = generatedCount1; n > 0; --/*
							     * Replace the characters within one line.
							     */n/*
								 * Get ptr again, because u_save and/or showmatch() will have
								 * released the line.  At the same time we let know that the
								 * line will be changed.
								 */) {
							ptr = curbuf.ml_get_buf(ModernizedCProgram.curwin.getW_cursor().getLnum(), 1);
							if (generatedNchar == 5 || generatedNchar == 25) {
								int c = ModernizedCProgram.ins_copychar(ModernizedCProgram.curwin.getW_cursor().getLnum() + (generatedNchar == 25 ? -1 : 1));
								if (c != (byte)'\000') {
									ptr[ModernizedCProgram.curwin.getW_cursor().getCol()] = c;
								} 
							} else {
									ptr[ModernizedCProgram.curwin.getW_cursor().getCol()] = generatedNchar;
							} 
							if (ModernizedCProgram.p_sm && msg_silent == 0) {
								ModernizedCProgram.showmatch(generatedNchar);
							} 
							++ModernizedCProgram.curwin.getW_cursor().getCol();
						}
						ModernizedCProgram.changed_bytes(ModernizedCProgram.curwin.getW_cursor().getLnum(), (colnr_T)(ModernizedCProgram.curwin.getW_cursor().getCol() - generatedCount1));
				} 
				--ModernizedCProgram.curwin.getW_cursor().getCol();
				if (has_mbyte) {
					ModernizedCProgram.mb_adjust_cursor();
				} 
				curbuf.setB_op_end(ModernizedCProgram.curwin.getW_cursor());
				ModernizedCProgram.curwin.setW_set_curswant(1);
				ModernizedCProgram.set_last_insert(generatedNchar);
		} 
	}
	/*
	 * "gr".
	 */
	public void nv_vreplace() {
		int generatedExtra_char = this.getExtra_char();
		oparg_S generatedOap = this.getOap();
		int generatedB_p_ma = curbuf.getB_p_ma();
		if (VIsual_active) {
			this.setCmdchar((byte)'r');
			this.setNchar(generatedExtra_char);
			/* Do same as "r" in Visual mode for now */cap.nv_replace();
		}  else if (!generatedOap.checkclearopq()) {
			if (!generatedB_p_ma) {
				ModernizedCProgram.emsg(((byte)(e_modifiable)));
			} else {
					if (generatedExtra_char == /* get another character */22) {
						this.setExtra_char(ModernizedCProgram.get_literal());
					} 
					ModernizedCProgram.stuffcharReadbuff(generatedExtra_char);
					ModernizedCProgram.stuffcharReadbuff((byte)'\033');
					if (ModernizedCProgram.virtual_active()) {
						ModernizedCProgram.coladvance(ModernizedCProgram.getviscol());
					} 
					cap.invoke_edit(1, (byte)'v', 0);
			} 
		} 
	}
	/*
	 * Swap case for "~" command, when it does not work like an operator.
	 */
	public void n_swapchar() {
		long n;
		pos_T startpos = new pos_T();
		int did_change = 0;
		oparg_S generatedOap = this.getOap();
		if (generatedOap.checkclearopq()) {
			return ;
		} 
		if ((ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()) == (byte)'\000') && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'~') == ((Object)0)) {
			generatedOap.clearopbeep();
			return ;
		} 
		cap.prep_redo_cmd();
		if (ModernizedCProgram.u_save_cursor() == 0) {
			return ;
		} 
		startpos = ModernizedCProgram.curwin.getW_cursor();
		int generatedOp_type = generatedOap.getOp_type();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		long generatedCount1 = this.getCount1();
		for (n = generatedCount1; n > 0; --n) {
			did_change |=  ModernizedCProgram.curwin.getW_cursor().swapchar(generatedOp_type);
			ModernizedCProgram.inc_cursor();
			if (ModernizedCProgram.gchar_cursor() == (byte)'\000') {
				if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ww, (byte)'~') != ((Object)0) && ModernizedCProgram.curwin.getW_cursor().getLnum() < generatedMl_line_count) {
					++ModernizedCProgram.curwin.getW_cursor().getLnum();
					ModernizedCProgram.curwin.getW_cursor().setCol(0);
					if (n > 1) {
						if (ModernizedCProgram.u_savesub(ModernizedCProgram.curwin.getW_cursor().getLnum()) == 0) {
							break;
						} 
						ModernizedCProgram.u_clearline();
					} 
				} else {
						break;
				} 
			} 
		}
		ModernizedCProgram.check_cursor();
		ModernizedCProgram.curwin.setW_set_curswant(1);
		Object generatedLnum = startpos.getLnum();
		Object generatedCol = startpos.getCol();
		if (did_change) {
			ModernizedCProgram.changed_lines(generatedLnum, generatedCol, generatedLnum + 1, -1024);
			curbuf.setB_op_start(startpos);
			curbuf.setB_op_end(ModernizedCProgram.curwin.getW_cursor());
			if (generatedCol > 0) {
				--generatedCol;
			} 
		} 
	}
	public void v_visop() {
		char_u[] trans = "YyDdCcxdXdAAIIrr";
		int generatedCmdchar = this.getCmdchar();
		if (.isupper(generatedCmdchar)) {
			if (VIsual_mode != 22) {
				ModernizedCProgram.VIsual_mode_orig = VIsual_mode;
				VIsual_mode = (byte)'V';
			}  else if (generatedCmdchar == (byte)'C' || generatedCmdchar == (byte)'D') {
				ModernizedCProgram.curwin.setW_curswant(INT_MAX);
			} 
		} 
		this.setCmdchar((ModernizedCProgram.vim_strchr(trans, generatedCmdchar) + 1));
		cap/*
		 * "s" and "S" commands.
		 */.nv_operator();
	}
	public void nv_subst() {
		int generatedCmdchar = this.getCmdchar();
		if (/* "vs" and "vS" are the same as "vc" */VIsual_active) {
			if (generatedCmdchar == (byte)'S') {
				ModernizedCProgram.VIsual_mode_orig = VIsual_mode;
				VIsual_mode = (byte)'V';
			} 
			this.setCmdchar((byte)'c');
			cap.nv_operator();
		} else {
				cap/*
				 * Abbreviated commands.
				 */.nv_optrans();
		} 
	}
	/* When showing output of term_dumpdiff() swap the top and botom. */
	public void nv_abbrev() {
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == (-(((byte)'k') + ((int)((byte)'D') << 8))) || generatedCmdchar == (-((true) + ((int)(key_extra.KE_KDEL) << 8)))) {
			this.setCmdchar(/* DEL key behaves like 'x' */(byte)'x');
		} 
		if (/* in Visual mode these commands are operators */VIsual_active) {
			cap.v_visop();
		} else {
				cap/*
				 * Translate a command into another command.
				 */.nv_optrans();
		} 
	}
	public void nv_optrans() {
		char_u ar = new char_u((char_u)"dl", (char_u)"dh", (char_u)"d$", (char_u)"c$", (char_u)"cl", (char_u)"cc", (char_u)"yy", (char_u)":s\r");
		char_u str = (char_u)"xXDCsSY&";
		oparg_S generatedOap = this.getOap();
		int generatedCmdchar = this.getCmdchar();
		long generatedCount0 = this.getCount0();
		if (!generatedOap.checkclearopq()) {
			if (generatedCmdchar == (byte)'D' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'#') != ((Object)0)) {
				generatedOap.setStart(ModernizedCProgram.curwin.getW_cursor());
				generatedOap.setOp_type(1);
				ModernizedCProgram.set_op_var(1);
				this.setCount1(1);
				cap.nv_dollar();
				finish_op = 1;
				ModernizedCProgram.ResetRedobuff();
				ModernizedCProgram.AppendCharToRedobuff((byte)'D');
			} else {
					if (generatedCount0) {
						ModernizedCProgram.stuffnumReadbuff(generatedCount0);
					} 
					ModernizedCProgram.stuffReadbuff(ar[(int)(ModernizedCProgram.vim_strchr(str, generatedCmdchar) - str)]);
			} 
		} 
		// In Vi "2D" doesn't delete the next line.  Can't translate it
		this.setOpcount(0/*
		 * "'" and "`" commands.  Also for "g'" and "g`".
		 * cap->arg is TRUE for "'" and "g'".
		 */);
	}
	public void nv_gomark() {
		pos_T pos = new pos_T();
		int c;
		pos_T old_cursor = ModernizedCProgram.curwin.getW_cursor();
		int old_KeyTyped = /* getting file may reset it */ModernizedCProgram.KeyTyped;
		int generatedCmdchar = this.getCmdchar();
		int generatedExtra_char = this.getExtra_char();
		int generatedNchar = this.getNchar();
		if (generatedCmdchar == (byte)'g') {
			c = generatedExtra_char;
		} else {
				c = generatedNchar;
		} 
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		pos = ModernizedCProgram.getmark(c, (generatedOp_type == 0));
		int generatedArg = this.getArg();
		if (pos == (pos_T)-/* jumped to other file */1) {
			if (generatedArg) {
				ModernizedCProgram.check_cursor_lnum();
				ModernizedCProgram.beginline(1 | 4);
			} else {
					ModernizedCProgram.check_cursor();
			} 
		} else {
				ModernizedCProgram.nv_cursormark(cap, generatedArg, pos);
		} 
		if (!ModernizedCProgram.virtual_active()) {
			ModernizedCProgram.curwin.getW_cursor().setColadd(0);
		} 
		ModernizedCProgram.check_cursor_col();
		Object generatedLnum = (old_cursor).getLnum();
		Object generatedCol = (old_cursor).getCol();
		Object generatedColadd = (old_cursor).getColadd();
		if (generatedOp_type == 0 && pos != ((Object)0) && (pos == (pos_T)-1 || !((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) && (fdo_flags & -1024) && old_KeyTyped) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_pcmark() {
		pos_T pos = new pos_T();
		linenr_T lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
		int old_KeyTyped = /* getting file may reset it */ModernizedCProgram.KeyTyped;
		oparg_S generatedOap = this.getOap();
		int generatedCmdchar = this.getCmdchar();
		long generatedCount1 = this.getCount1();
		Object generatedB_changelistlen = curbuf.getB_changelistlen();
		int generatedOp_type = generatedOap.getOp_type();
		if (!generatedOap.checkclearopq()) {
			if (generatedCmdchar == (byte)'g') {
				pos = ModernizedCProgram.movechangelist((int)generatedCount1);
			} else {
					pos = ModernizedCProgram.movemark((int)generatedCount1);
			} 
			if (pos == (pos_T)-/* jump to other file */1) {
				ModernizedCProgram.curwin.setW_set_curswant(1);
				ModernizedCProgram.check_cursor();
			}  else if (pos != ((Object)/* can jump */0)) {
				ModernizedCProgram.nv_cursormark(cap, 0, pos);
			}  else if (generatedCmdchar == (byte)'g') {
				if (generatedB_changelistlen == 0) {
					ModernizedCProgram.emsg(((byte)("E664: changelist is empty")));
				}  else if (generatedCount1 < 0) {
					ModernizedCProgram.emsg(((byte)("E662: At start of changelist")));
				} else {
						ModernizedCProgram.emsg(((byte)("E663: At end of changelist")));
				} 
			} else {
					generatedOap.clearopbeep();
			} 
			if (generatedOp_type == 0 && (pos == (pos_T)-1 || lnum != ModernizedCProgram.curwin.getW_cursor().getLnum()) && (fdo_flags & -1024) && old_KeyTyped) {
				ModernizedCProgram.foldOpenCursor();
			} 
		} 
	}
	/*
	 * Handle '"' command.
	 */
	public void nv_regname() {
		oparg_S generatedOap = this.getOap();
		if (generatedOap.checkclearop()) {
			return ;
		} 
		int generatedNchar = this.getNchar();
		if (generatedNchar == (byte)'=') {
			this.setNchar(ModernizedCProgram.get_expr_register());
		} 
		long generatedCount0 = this.getCount0();
		int generatedRegname = generatedOap.getRegname();
		if (generatedNchar != (byte)'\000' && ModernizedCProgram.valid_yank_reg(generatedNchar, 0)) {
			generatedOap.setRegname(generatedNchar);
			this.setOpcount(generatedCount0);
			ModernizedCProgram.set_reg_var(generatedRegname);
		} else {
				generatedOap.clearopbeep();
		} 
	}
	public void nv_visual() {
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == 17) {
			this.setCmdchar(22);
		} 
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		if (generatedOp_type != /* 'v', 'V' and CTRL-V can be used while an operator is pending to make it
		     * characterwise, linewise, or blockwise. */0) {
			motion_force = generatedOap.setMotion_force(generatedCmdchar);
			finish_op = /* operator doesn't finish now but later */0;
			return ;
		} 
		int generatedArg = this.getArg();
		VIsual_select = generatedArg;
		long generatedCount0 = this.getCount0();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		long generatedCount1 = this.getCount1();
		if (/* change Visual mode */VIsual_active) {
			if (VIsual_mode == generatedCmdchar) {
				ModernizedCProgram.end_visual_mode();
			} else {
					VIsual_mode = generatedCmdchar;
					.showmode();
			} 
			ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
		} else {
				ModernizedCProgram.check_visual_highlight();
				if (generatedCount0 > 0 && resel_VIsual_mode != (byte)'\000') {
					ModernizedCProgram.VIsual = ModernizedCProgram.curwin.getW_cursor();
					VIsual_active = 1;
					ModernizedCProgram.VIsual_reselect = 1;
					if (!generatedArg) {
						ModernizedCProgram.may_start_select(/* start Select mode when 'selectmode' contains "cmd" */(byte)'c');
					} 
					.setmouse();
					if (ModernizedCProgram.p_smd && msg_silent == 0) {
						redraw_cmdline = /* show visual mode later */1/*
							     * For V and ^V, we multiply the number of lines even if there
							     * was only one -- webb
							     */;
					} 
					if (resel_VIsual_mode != (byte)'v' || ModernizedCProgram.resel_VIsual_line_count > 1) {
						ModernizedCProgram.curwin.getW_cursor().getLnum() += ModernizedCProgram.resel_VIsual_line_count * generatedCount0 - 1;
						if (ModernizedCProgram.curwin.getW_cursor().getLnum() > generatedMl_line_count) {
							ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
						} 
					} 
					VIsual_mode = resel_VIsual_mode;
					if (VIsual_mode == (byte)'v') {
						if (ModernizedCProgram.resel_VIsual_line_count <= 1) {
							ModernizedCProgram.validate_virtcol();
							ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.curwin.getW_virtcol() + ModernizedCProgram.resel_VIsual_vcol * generatedCount0 - 1);
						} else {
								ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.resel_VIsual_vcol);
						} 
						ModernizedCProgram.coladvance(ModernizedCProgram.curwin.getW_curswant());
					} 
					if (ModernizedCProgram.resel_VIsual_vcol == INT_MAX) {
						ModernizedCProgram.curwin.setW_curswant(INT_MAX);
						ModernizedCProgram.coladvance((colnr_T)INT_MAX);
					}  else if (VIsual_mode == 22) {
						ModernizedCProgram.validate_virtcol();
						ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.curwin.getW_virtcol() + ModernizedCProgram.resel_VIsual_vcol * generatedCount0 - 1);
						ModernizedCProgram.coladvance(ModernizedCProgram.curwin.getW_curswant());
					} else {
							ModernizedCProgram.curwin.setW_set_curswant(1);
					} 
					ModernizedCProgram.redraw_curbuf_later(/* show the inversion */20);
				} else {
						if (!generatedArg) {
							ModernizedCProgram.may_start_select(/* start Select mode when 'selectmode' contains "cmd" */(byte)'c');
						} 
						ModernizedCProgram.n_start_visual_mode(generatedCmdchar);
						if (VIsual_mode != (byte)'V' && ModernizedCProgram.p_sel == (byte)'e') {
							++generatedCount1;
						} 
						if (generatedCount0 > 0 && --generatedCount1 > 0) {
							if (VIsual_mode == (byte)'v' || VIsual_mode == /* With a count select that many characters or lines. */22) {
								cap.nv_right();
							}  else if (VIsual_mode == (byte)'V') {
								cap.nv_down();
							} 
						} 
				} 
		} 
	}
	/*
	 * CTRL-W: Window commands
	 */
	public void nv_window() {
		int generatedNchar = this.getNchar();
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		if (generatedNchar == (byte)':') {
			this.setCmdchar(/* "CTRL-W :" is the same as typing ":"; useful in a terminal window */(byte)':');
			this.setNchar((byte)'\000');
			cap.nv_colon();
		}  else if (!generatedOap.checkclearop()) {
			ModernizedCProgram.do_window(generatedNchar, generatedCount0, /* everything is in window.c */(byte)'\000'/*
			 * CTRL-Z: Suspend
			 */);
		} 
	}
	public void nv_suspend() {
		oparg_S generatedOap = this.getOap();
		generatedOap.clearop();
		if (VIsual_active) {
			ModernizedCProgram.end_visual_mode();
		} 
		ModernizedCProgram.do_cmdline_cmd((char_u)"st"/*
		 * Commands starting with "g".
		 */);
	}
	public void nv_g_cmd() {
		oparg_S generatedOap = this.getOap();
		oparg_T oap = generatedOap;
		pos_T tpos = new pos_T();
		int i;
		int flag = 0;
		int generatedNchar = this.getNchar();
		 generatedB_visual = curbuf.getB_visual();
		Object generatedVi_start = generatedB_visual.getVi_start();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedVi_end = generatedB_visual.getVi_end();
		Object generatedVi_mode = generatedB_visual.getVi_mode();
		Object generatedVi_curswant = generatedB_visual.getVi_curswant();
		int generatedArg = this.getArg();
		long generatedCount1 = this.getCount1();
		int generatedOp_type = oap.getOp_type();
		 generatedB_last_insert = curbuf.getB_last_insert();
		Object generatedLnum = generatedB_last_insert.getLnum();
		long generatedCount0 = this.getCount0();
		switch (generatedNchar) {
		case (byte)'e':
		case (byte)'0':
		case (byte)'#':
		case /* FALLTHROUGH */(byte)'~':
		case (byte)'H':
		case (-((true) + ((int)(key_extra.KE_MOUSEMOVE) << 8))):
		case /* :tag or :tselect for current identifier */29:
		case (-((true) + ((int)(key_extra.KE_LEFTRELEASE) << 8))):
		case (byte)',':
				cap.nv_pcmark();
				break;
		case (byte)'r':
				cap.nv_vreplace();
				break;
		case (byte)'^':
				flag = 1/* FALLTHROUGH */;
		case (byte)'s':
				ModernizedCProgram.do_sleep(generatedCount1 * -1024);
				break;
		case /* FALLTHROUGH */(byte)'h':
		case (byte)'_'/* "g_": to the last non-blank character in the line or <count> lines
			 * downward. */:
				generatedOap.setMotion_type(0);
				generatedOap.setInclusive(1);
				ModernizedCProgram.curwin.setW_curswant(INT_MAX);
				if (ModernizedCProgram.cursor_down((long)(generatedCount1 - 1), generatedOp_type == 0) == 0) {
					generatedOap.clearopbeep();
				} else {
						char_u ptr = ModernizedCProgram.ml_get_curline();
						if (ModernizedCProgram.curwin.getW_cursor().getCol() > 0 && ptr[ModernizedCProgram.curwin.getW_cursor().getCol()] == /* In Visual mode we may end up after the line. */(byte)'\000') {
							--ModernizedCProgram.curwin.getW_cursor().getCol();
						} 
						while (ModernizedCProgram.curwin.getW_cursor().getCol() > /* Decrease the cursor column until it's on a non-blank. */0 && ((ptr[ModernizedCProgram.curwin.getW_cursor().getCol()]) == (byte)' ' || (ptr[ModernizedCProgram.curwin.getW_cursor().getCol()]) == (byte)'\t')) {
							--ModernizedCProgram.curwin.getW_cursor().getCol();
						}
						ModernizedCProgram.curwin.setW_set_curswant(1);
						cap.adjust_for_sel();
				} 
				break;
		case (byte)'u':
		case (-((true) + ((int)(key_extra.KE_MIDDLEDRAG) << 8))):
		case (byte)'$':
		case (-((true) + ((int)(key_extra.KE_RIGHTMOUSE) << 8))):
		case (byte)'p':
		case (byte)'j':
		case (-((true) + ((int)(key_extra.KE_X1DRAG) << 8))):
		case 24/*
		     * "g^A": dump log of used memory.
		     */:
				if (/*
				     * "g^A/g^X": sequentially increment visually selected region
				     */VIsual_active) {
					this.setArg(1);
					this.setCmdchar(generatedNchar);
					this.setNchar((byte)'\000');
					cap.nv_addsub();
				} else {
						oap.clearopbeep();
				} 
				break;
		case (-(((byte)'K') + ((int)((byte)'1') << 8))):
				oap.setMotion_type(0);
				oap.setInclusive(0);
				if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap() && ModernizedCProgram.curwin.getW_width() != 0) {
					int width1 = ModernizedCProgram.curwin.getW_width() - ModernizedCProgram.curwin_col_off();
					int width2 = width1 + ModernizedCProgram.curwin_col_off2();
					ModernizedCProgram.validate_virtcol();
					i = 0;
					if (ModernizedCProgram.curwin.getW_virtcol() >= (colnr_T)width1 && width2 > 0) {
						i = (ModernizedCProgram.curwin.getW_virtcol() - width1) / width2 * width2 + width1;
					} 
				} else {
						i = ModernizedCProgram.curwin.getW_leftcol();
				} 
				if (generatedNchar == (byte)'m') {
					i += (ModernizedCProgram.curwin.getW_width() - ModernizedCProgram.curwin_col_off() + ((ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap() && i > 0) ? ModernizedCProgram.curwin_col_off2() : 0)) / 2;
				} 
				ModernizedCProgram.coladvance((colnr_T)i);
				if (flag) {
					do {
						i = ModernizedCProgram.gchar_cursor();
					} while (((i) == (byte)' ' || (i) == (byte)'\t') && ModernizedCProgram.oneright() == 1);
					ModernizedCProgram.curwin.getW_valid() &=  ~-1024;
				} 
				ModernizedCProgram.curwin.setW_set_curswant(1);
				break;
		case (-(((byte)'k') + ((int)((byte)'b') << 8))):
				this.setNchar(8);
		case (byte)'a':
				((Object)0).do_ascii();
				break;
		case (byte)'E':
				oap.setMotion_type(0);
				ModernizedCProgram.curwin.setW_set_curswant(1);
				oap.setInclusive(1);
				if (ModernizedCProgram.bckend_word(generatedCount1, generatedNchar == (byte)'E', 0) == 0) {
					oap.clearopbeep();
				} 
				break;
		case (-((true) + ((int)(key_extra.KE_X1RELEASE) << 8))):
		case /* pound sign (sometimes equal to '#') */-1024:
		case (byte)'d':
		case (byte)'&':
				ModernizedCProgram.do_cmdline_cmd((char_u)"%s//~/&");
				break;
		case (-(((byte)'k') + ((int)((byte)'d') << 8/* with 'nowrap' it works just like the normal "j" command; also when
			 * in a closed fold */))):
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap() || ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)0))) {
					oap.setMotion_type(1);
					i = ModernizedCProgram.cursor_down(generatedCount1, generatedOp_type == 0);
				} else {
						i = oap.nv_screengo(1, generatedCount1);
				} 
				if (i == 0) {
					oap.clearopbeep();
				} 
				break;
		case (-((true) + ((int)(key_extra.KE_X2DRAG) << 8))):
		case (-(((byte)'@') + ((int)((byte)'7') << 8))):
		case (byte)'q':
		case (byte)'8':
				if (generatedCount0 == 8) {
					ModernizedCProgram.utf_find_illegal();
				} else {
						ModernizedCProgram.show_utf8();
				} 
				break;
		case (byte)'t':
				if (!oap.checkclearop()) {
					ModernizedCProgram.goto_tabpage((int)generatedCount0);
				} 
				break;
		case (byte)'F':
				cap.nv_gotofile();
				break;
		case (byte)'J':
				cap.nv_join();
				break;
		case (byte)'?':
		case (-((true) + ((int)(key_extra.KE_RIGHTRELEASE) << 8))):
		case /* :tselect for current identifier */(byte)']':
				cap.nv_ident();
				break;
		case (-((true) + ((int)(key_extra.KE_MIDDLEMOUSE) << 8))):
		case (byte)'N':
		case (-((true) + ((int)(key_extra.KE_X2RELEASE) << 8))):
				mod_mask = -1024;
				(Object).do_mouse(oap, generatedNchar, (true), generatedCount1, 0);
				break;
		case (byte)'n':
				if (!ModernizedCProgram.current_search(generatedCount1, generatedNchar == (byte)'n')) {
					oap.clearopbeep();
				} 
				break;
		case /* "g'm" and "g`m": jump to mark without setting pcmark */(byte)'\'':
				this.setArg(1);
		case 7:
				((Object)0).cursor_pos_info();
				break;
		case (-((true) + ((int)(key_extra.KE_IGNORE) << 8))):
				break;
		case (-((true) + ((int)(key_extra.KE_RIGHTDRAG) << 8))):
		case (byte)'v':
				if (oap.checkclearop()) {
					break;
				} 
				if (generatedVi_start.getLnum() == 0 || generatedVi_start.getLnum() > generatedMl_line_count || generatedVi_end.getLnum() == 0) {
					ModernizedCProgram.beep_flush();
				} else {
						if (/* set w_cursor to the start of the Visual area, tpos to the end */VIsual_active) {
							i = VIsual_mode;
							VIsual_mode = generatedVi_mode;
							generatedB_visual.setVi_mode(i);
							curbuf.setB_visual_mode_eval(i);
							i = ModernizedCProgram.curwin.getW_curswant();
							ModernizedCProgram.curwin.setW_curswant(generatedVi_curswant);
							generatedB_visual.setVi_curswant(i);
							tpos = generatedVi_end;
							generatedB_visual.setVi_end(ModernizedCProgram.curwin.getW_cursor());
							ModernizedCProgram.curwin.setW_cursor(generatedVi_start);
							generatedB_visual.setVi_start(ModernizedCProgram.VIsual);
						} else {
								VIsual_mode = generatedVi_mode;
								ModernizedCProgram.curwin.setW_curswant(generatedVi_curswant);
								tpos = generatedVi_end;
								ModernizedCProgram.curwin.setW_cursor(generatedVi_start);
						} 
						VIsual_active = 1;
						ModernizedCProgram.VIsual_reselect = 1;
						ModernizedCProgram.check_cursor();
						ModernizedCProgram.VIsual = ModernizedCProgram.curwin.getW_cursor();
						ModernizedCProgram.curwin.setW_cursor(tpos);
						ModernizedCProgram.check_cursor();
						ModernizedCProgram.update_topline();
						if (generatedArg) {
							VIsual_select = 1;
						} else {
								ModernizedCProgram.may_start_select((byte)'c');
						} 
						.setmouse();
						clip_star.setVmode(/* Make sure the clipboard gets updated.  Needed because start and
							     * end are still the same, and the selection needs to be owned */(byte)'\000');
						ModernizedCProgram.redraw_curbuf_later(20);
						.showmode();
				} 
				break;
		case (-(((byte)'k') + ((int)((byte)'h') << 8))):
		case (-(((byte)'K') + ((int)((byte)'4') << 8))):
				{ 
					int col_off = ModernizedCProgram.curwin_col_off();
					oap.setMotion_type(0);
					oap.setInclusive(1);
					if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap() && ModernizedCProgram.curwin.getW_width() != 0) {
						ModernizedCProgram.curwin.setW_curswant(/* so we stay at the end */INT_MAX);
						if (generatedCount1 == 1) {
							int width1 = ModernizedCProgram.curwin.getW_width() - col_off;
							int width2 = width1 + ModernizedCProgram.curwin_col_off2();
							ModernizedCProgram.validate_virtcol();
							i = width1 - 1;
							if (ModernizedCProgram.curwin.getW_virtcol() >= (colnr_T)width1) {
								i += ((ModernizedCProgram.curwin.getW_virtcol() - width1) / width2 + 1) * width2;
							} 
							ModernizedCProgram.coladvance((colnr_T)i);
							ModernizedCProgram.validate_virtcol();
							ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.curwin.getW_virtcol());
							ModernizedCProgram.curwin.setW_set_curswant(0);
							if (ModernizedCProgram.curwin.getW_cursor().getCol() > 0 && ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
								if (ModernizedCProgram.curwin.getW_virtcol() > (colnr_T)i) {
									--ModernizedCProgram.curwin.getW_cursor().getCol();
								} 
							} 
						}  else if (oap.nv_screengo(1, generatedCount1 - 1) == 0) {
							oap.clearopbeep();
						} 
					} else {
							if (generatedCount1 > 1) {
								(Object)ModernizedCProgram.cursor_down(generatedCount1 - 1, 0);
							} 
							i = ModernizedCProgram.curwin.getW_leftcol() + ModernizedCProgram.curwin.getW_width() - col_off - 1;
							ModernizedCProgram.coladvance((colnr_T)i);
							ModernizedCProgram.validate_virtcol();
							ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.curwin.getW_virtcol());
							ModernizedCProgram.curwin.setW_set_curswant(0);
					} 
				}
				break;
		case 1:
		case (-(((byte)'k') + ((int)((byte)'u') << 8/* with 'nowrap' it works just like the normal "k" command; also when
			 * in a closed fold */))):
				if (!ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap() || ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ((Object)0))) {
					oap.setMotion_type(1);
					i = ModernizedCProgram.cursor_up(generatedCount1, generatedOp_type == 0);
				} else {
						i = oap.nv_screengo((true), generatedCount1);
				} 
				if (i == 0) {
					oap.clearopbeep();
				} 
				break;
		case (byte)'g':
				this.setArg(0);
				cap.nv_goto();
				break;
		case (byte)'P':
				cap.nv_put();
				break;
		case (byte)'i':
				if (generatedLnum != 0) {
					ModernizedCProgram.curwin.setW_cursor(generatedB_last_insert);
					ModernizedCProgram.check_cursor_lnum();
					i = (int).strlen((byte)(ModernizedCProgram.ml_get_curline()));
					if (ModernizedCProgram.curwin.getW_cursor().getCol() > (colnr_T)i) {
						if (ModernizedCProgram.virtual_active()) {
							ModernizedCProgram.curwin.getW_cursor().getColadd() += ModernizedCProgram.curwin.getW_cursor().getCol() - i;
						} 
						ModernizedCProgram.curwin.getW_cursor().setCol(i);
					} 
				} 
				this.setCmdchar((byte)'i');
				cap.nv_edit();
				break;
		case /* "go": goto byte count from start of buffer */(byte)'o':
				ModernizedCProgram.goto_byte(generatedCount0);
				break;
		case /* "gQ": improved Ex mode */(byte)'Q':
				if (ModernizedCProgram.text_locked()) {
					generatedOap.clearopbeep();
					ModernizedCProgram.text_locked_msg();
					break;
				} 
				if (!oap.checkclearopq()) {
					ModernizedCProgram.do_exmode(1);
				} 
				break;
		case 8/* EBCDIC: 'v'-'h' != '^v'-'^h' */:
				this.setCmdchar(generatedNchar + ((byte)'v' - (byte)'h'));
				this.setArg(1);
				cap.nv_visual();
				break;
		case (-((true) + ((int)(key_extra.KE_MIDDLERELEASE) << 8))):
		case (byte)'w':
				oap.setCursor_start(ModernizedCProgram.curwin.getW_cursor());
		case /* "g<": show scrollback text */(byte)'<':
				ModernizedCProgram.show_sb_text();
				break;
		case (byte)';':
				this.setCount1(-generatedCount1);
				cap.nv_pcmark();
				break;
		case (byte)'@':
				cap.nv_operator();
				break;
		case (byte)'R':
				this.setArg(1);
				.nv_Replace(cap);
				break;
		case /* "g+" and "g-": undo or redo along the timeline */(byte)'-':
				if (!oap.checkclearopq()) {
					ModernizedCProgram.undo_time(generatedNchar == (byte)'-' ? -generatedCount1 : generatedCount1, 0, 0, 0);
				} 
				break;
		case /* FALLTHROUGH */(byte)'`':
				cap.nv_gomark();
				break;
		case (byte)'U':
		case (byte)'k':
		case (byte)'m':
		case (-((true) + ((int)(key_extra.KE_X2MOUSE) << 8))):
		case (byte)'*':
		case (-((true) + ((int)(key_extra.KE_X1MOUSE) << 8))):
		case (byte)'V':
				ModernizedCProgram.VIsual_reselect = 0;
				break;
		case (byte)'f':
		case (-((true) + ((int)(key_extra.KE_LEFTMOUSE) << 8))):
		case (-((true) + ((int)(key_extra.KE_LEFTDRAG) << 8))):
		case (byte)'+':
		case (byte)'D':
				oap.nv_gd(generatedNchar, (int)generatedCount0);
				break;
		case (byte)'I':
				ModernizedCProgram.beginline(0);
				if (!oap.checkclearopq()) {
					cap.invoke_edit(0, (byte)'g', 0);
				} 
				break;
		case (byte)'T':
				if (!oap.checkclearop()) {
					ModernizedCProgram.goto_tabpage(-(int)generatedCount1);
				} 
				break;
		default:
				oap.clearopbeep();
				break;
		}
	}
	public void n_opencmd() {
		linenr_T oldline = ModernizedCProgram.curwin.getW_cursor().getLnum();
		oparg_S generatedOap = this.getOap();
		int generatedCmdchar = this.getCmdchar();
		if (!generatedOap.checkclearopq()) {
			if (generatedCmdchar == (byte)'O') {
				(Object)ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0));
			} else {
					(Object)ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0), ModernizedCProgram.curwin.getW_cursor().getLnum());
			} 
			if (ModernizedCProgram.u_save((linenr_T)(ModernizedCProgram.curwin.getW_cursor().getLnum() - (generatedCmdchar == (byte)'O' ? 1 : 0)), (linenr_T)(ModernizedCProgram.curwin.getW_cursor().getLnum() + (generatedCmdchar == (byte)'o' ? 1 : 0))) == 1 && ModernizedCProgram.open_line(generatedCmdchar == (byte)'O' ? (true) : 1, ModernizedCProgram.has_format_option((byte)'o') ? 2 : 0, 0) == 1) {
				if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cole() > 0 && oldline != ModernizedCProgram.curwin.getW_cursor().getLnum()) {
					ModernizedCProgram.curwin.redrawWinline(oldline);
				} 
				if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_cul()) {
					ModernizedCProgram.curwin.getW_valid() &=  ~/* force redraw of cursorline */-1024;
				} 
				if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'#') != ((Object)/* When '#' is in 'cpoptions' ignore the count. */0)) {
					this.setCount1(1);
				} 
				cap.invoke_edit(0, generatedCmdchar, 1);
			} 
		} 
	}
	/*
	 * "." command: redo last change.
	 */
	public void nv_dot() {
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		if (!generatedOap.checkclearopq()) {
			if (ModernizedCProgram.start_redo(generatedCount0, restart_edit != 0 && !ModernizedCProgram.arrow_used) == 0) {
				generatedOap.clearopbeep();
			} 
		} 
	}
	public void nv_redo() {
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		if (!generatedOap.checkclearopq()) {
			ModernizedCProgram.u_redo((int)generatedCount1);
			ModernizedCProgram.curwin.setW_set_curswant(1/*
			 * Handle "U" command.
			 */);
		} 
	}
	public void nv_tilde() {
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		if (!ModernizedCProgram.p_to && !VIsual_active && generatedOp_type != 7) {
			cap.n_swapchar();
		} else {
				cap/*
				 * Handle an operator command.
				 * The actual work is done by do_pending_operator().
				 */.nv_operator();
		} 
	}
	public void nv_operator() {
		int op_type;
		int generatedCmdchar = this.getCmdchar();
		int generatedNchar = this.getNchar();
		op_type = ModernizedCProgram.get_op_type(generatedCmdchar, generatedNchar);
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		if (op_type == generatedOp_type) {
			cap.nv_lineop();
		}  else if (!generatedOap.checkclearop()) {
			generatedOap.setStart(ModernizedCProgram.curwin.getW_cursor());
			generatedOap.setOp_type(op_type);
			ModernizedCProgram.set_op_var(op_type);
		} 
	}
	public void nv_lineop() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(1);
		long generatedCount1 = this.getCount1();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedMotion_force = generatedOap.getMotion_force();
		if (ModernizedCProgram.cursor_down(generatedCount1 - -1024, generatedOp_type == 0) == 0) {
			generatedOap.clearopbeep();
		}  else if ((generatedOp_type == /* only with linewise motions */1 && generatedMotion_force != (byte)'v' && generatedMotion_force != 22) || generatedOp_type == 4 || generatedOp_type == 5) {
			ModernizedCProgram.beginline(2 | 4);
		}  else if (generatedOp_type != /* 'Y' does not move cursor */2) {
			ModernizedCProgram.beginline(1 | 4/*
			 * <Home> command.
			 */);
		} 
	}
	public void nv_home() {
		if (mod_mask & /* CTRL-HOME is like "gg" */-1024) {
			cap.nv_goto();
		} else {
				this.setCount0(1);
				cap.nv_pipe();
		} 
		ins_at_eol = /* Don't move cursor past eol (only necessary in a
					       one-character line). */0/*
		 * "|" command.
		 */;
	}
	public void nv_pipe() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		ModernizedCProgram.beginline(0);
		long generatedCount0 = this.getCount0();
		if (generatedCount0 > 0) {
			ModernizedCProgram.coladvance((colnr_T)(generatedCount0 - 1));
			ModernizedCProgram.curwin.setW_curswant((colnr_T)(generatedCount0 - 1));
		} else {
				ModernizedCProgram.curwin.setW_curswant(0/* keep curswant at the column where we wanted to go, not where
				     * we ended; differs if line is too short */);
		} 
		ModernizedCProgram.curwin.setW_set_curswant(0/*
		 * Handle back-word command "b" and "B".
		 * cap->arg is 1 for "B"
		 */);
	}
	public void nv_bck_word() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		long generatedCount1 = this.getCount1();
		int generatedArg = this.getArg();
		int generatedOp_type = generatedOap.getOp_type();
		if (ModernizedCProgram.bck_word(generatedCount1, generatedArg, 0) == 0) {
			generatedOap.clearopbeep();
		}  else if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_wordcmd() {
		int n;
		int word_end;
		int flag = 0;
		pos_T startpos = ModernizedCProgram.curwin.getW_cursor();
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == (byte)'e' || generatedCmdchar == (byte)'E') {
			word_end = 1;
		} else {
				word_end = 0;
		} 
		oparg_S generatedOap = this.getOap();
		generatedOap.setInclusive(word_end/*
		     * "cw" and "cW" are a special case.
		     */);
		int generatedOp_type = generatedOap.getOp_type();
		long generatedCount1 = this.getCount1();
		if (!word_end && generatedOp_type == 3) {
			n = ModernizedCProgram.gchar_cursor();
			if (n != /* not an empty line */(byte)'\000') {
				if (((n) == (byte)' ' || (n) == (byte)'\t'/*
						 * Reproduce a funny Vi behaviour: "cw" on a blank only
						 * changes one character, not all blanks until the start of
						 * the next word.  Only do this when the 'w' flag is included
						 * in 'cpoptions'.
						 */)) {
					if (generatedCount1 == 1 && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'w') != ((Object)0)) {
						generatedOap.setInclusive(1);
						generatedOap.setMotion_type(0);
						return ;
					} 
				} else {
						generatedOap.setInclusive(1);
						word_end = 1;
						flag = 1;
				} 
			} 
		} 
		generatedOap.setMotion_type(0);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		int generatedArg = this.getArg();
		if (word_end) {
			n = ModernizedCProgram.end_word(generatedCount1, generatedArg, flag, 0);
		} else {
				n = ModernizedCProgram.fwd_word(generatedCount1, generatedArg, generatedOp_type != 0);
		} 
		Object generatedLnum = (startpos).getLnum();
		Object generatedCol = (startpos).getCol();
		Object generatedColadd = (startpos).getColadd();
		if (((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
			generatedOap.adjust_cursor();
		} 
		if (n == 0 && generatedOp_type == 0) {
			generatedOap.clearopbeep();
		} else {
				cap.adjust_for_sel();
				if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
					ModernizedCProgram.foldOpenCursor();
				} 
		} 
	}
	public void nv_beginline() {
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(0);
		generatedOap.setInclusive(0);
		int generatedArg = this.getArg();
		ModernizedCProgram.beginline(generatedArg);
		int generatedOp_type = generatedOap.getOp_type();
		if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
		ins_at_eol = /* Don't move cursor past eol (only necessary in a
					       one-character line). */0/*
		 * In exclusive Visual mode, may include the last character.
		 */;
	}
	public void adjust_for_sel() {
		oparg_S generatedOap = this.getOap();
		int generatedInclusive = generatedOap.getInclusive();
		if (VIsual_active && generatedInclusive && ModernizedCProgram.p_sel == (byte)'e' && ModernizedCProgram.gchar_cursor() != (byte)'\000' && (((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
			if (has_mbyte) {
				ModernizedCProgram.inc_cursor();
			} else {
					++ModernizedCProgram.curwin.getW_cursor().getCol();
			} 
			generatedOap.setInclusive(0/*
			 * Exclude last character at end of Visual area for 'selection' == "exclusive".
			 * Should check VIsual_mode before calling this.
			 * Returns TRUE when backed up to the previous line.
			 */);
		} 
	}
	public void nv_select() {
		if (VIsual_active) {
			VIsual_select = 1;
		}  else if (ModernizedCProgram.VIsual_reselect) {
			this.setNchar(/* fake "gv" command */(byte)'v');
			this.setArg(1);
			cap/*
			 * "G", "gg", CTRL-END, CTRL-HOME.
			 * cap->arg is TRUE for "G".
			 */.nv_g_cmd();
		} 
	}
	public void nv_goto() {
		linenr_T lnum = new linenr_T();
		int generatedArg = this.getArg();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedArg) {
			lnum = generatedMl_line_count;
		} else {
				lnum = -1024;
		} 
		oparg_S generatedOap = this.getOap();
		generatedOap.setMotion_type(1);
		ModernizedCProgram.setpcmark();
		long generatedCount0 = this.getCount0();
		if (generatedCount0 != /* When a count is given, use it instead of the default lnum */0) {
			lnum = generatedCount0;
		} 
		if (lnum < -1024) {
			lnum = -1024;
		}  else if (lnum > generatedMl_line_count) {
			lnum = generatedMl_line_count;
		} 
		ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
		ModernizedCProgram.beginline(2 | 4);
		int generatedOp_type = generatedOap.getOp_type();
		if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public void nv_normal() {
		int generatedNchar = this.getNchar();
		oparg_S generatedOap = this.getOap();
		if (generatedNchar == 14 || generatedNchar == 7) {
			generatedOap.clearop();
			if (restart_edit != 0 && mode_displayed) {
				clear_cmdline = /* unshow mode later */1;
			} 
			restart_edit = 0;
			if (cmdwin_type != 0) {
				cmdwin_result = 3;
			} 
			if (VIsual_active) {
				ModernizedCProgram.end_visual_mode();
				ModernizedCProgram.redraw_curbuf_later(20);
			} 
			if (generatedNchar == 7 && /* CTRL-\ CTRL-G restarts Insert mode when 'insertmode' is set. */ModernizedCProgram.p_im) {
				restart_edit = (byte)'a';
			} 
		} else {
				generatedOap.clearopbeep();
		} 
	}
	public void nv_esc() {
		int no_reason;
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		long generatedOpcount = this.getOpcount();
		long generatedCount0 = this.getCount0();
		int generatedRegname = generatedOap.getRegname();
		no_reason = (generatedOp_type == 0 && generatedOpcount == 0 && generatedCount0 == 0 && generatedRegname == 0 && !ModernizedCProgram.p_im);
		int generatedArg = this.getArg();
		if (generatedArg) {
			if (restart_edit == 0 && cmdwin_type == 0 && !VIsual_active && no_reason) {
				if (ModernizedCProgram.anyBufIsChanged()) {
					ModernizedCProgram.msg(((byte)("Type  :qa!  and press <Enter> to abandon all changes and exit Vim")));
				} else {
						ModernizedCProgram.msg(((byte)("Type  :qa  and press <Enter> to exit Vim")));
				} 
			} 
			if (!/* Don't reset "restart_edit" when 'insertmode' is set, it won't be
				 * set again below when halfway a mapping. */ModernizedCProgram.p_im) {
				restart_edit = 0;
			} 
			if (cmdwin_type != 0) {
				cmdwin_result = (-((true) + ((int)(key_extra.KE_IGNORE) << 8)));
				got_int = /* don't stop executing autocommands et al. */0;
				return ;
			} 
		} 
		if (VIsual_active) {
			ModernizedCProgram.end_visual_mode();
			ModernizedCProgram.check_cursor_col();
			ModernizedCProgram.curwin.setW_set_curswant(1);
			ModernizedCProgram.redraw_curbuf_later(20);
		}  else if (no_reason) {
			ModernizedCProgram.vim_beep(-1024);
		} 
		generatedOap.clearop();
		if (restart_edit == 0 && ModernizedCProgram.goto_im() && ex_normal_busy == /* A CTRL-C is often used at the start of a menu.  When 'insertmode' is
		     * set return to Insert mode afterwards. */0) {
			restart_edit = (byte)'a'/*
			 * Move the cursor for the "A" command.
			 */;
		} 
	}
	public void nv_edit() {
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == (-(((byte)'k') + ((int)((byte)'I') << 8))) || generatedCmdchar == (-((true) + ((int)(key_extra.KE_KINS) << /* <Insert> is equal to "i" */8)))) {
			this.setCmdchar((byte)'i');
		} 
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedB_p_ma = curbuf.getB_p_ma();
		Object generatedLnum = (old_pos).getLnum();
		Object generatedCol = (old_pos).getCol();
		Object generatedColadd = (old_pos).getColadd();
		if (VIsual_active && (generatedCmdchar == (byte)'A' || generatedCmdchar == /* in Visual mode "A" and "I" are an operator */(byte)'I')) {
			cap.v_visop();
		}  else if ((generatedCmdchar == (byte)'a' || generatedCmdchar == /* in Visual mode and after an operator "a" and "i" are for text objects */(byte)'i') && (generatedOp_type != 0 || VIsual_active)) {
			cap.nv_object();
		}  else if (!generatedB_p_ma && !ModernizedCProgram.p_im) {
			ModernizedCProgram.emsg(((byte)(/* Only give this error when 'insertmode' is off. */e_modifiable)));
			generatedOap.clearop();
			if (generatedCmdchar == (-(((byte)'P') + ((int)((byte)'S') << 8)))) {
				((Object)/* drop the pasted text */0).bracketed_paste(.PASTE_INSERT, 1);
			} 
		}  else if (generatedCmdchar == (-(((byte)'P') + ((int)((byte)'S') << 8))) && VIsual_active) {
			pos_T old_pos = ModernizedCProgram.curwin.getW_cursor();
			pos_T old_visual = ModernizedCProgram.VIsual;
			if (VIsual_mode == (byte)'V' || ModernizedCProgram.curwin.getW_cursor().getLnum() != ModernizedCProgram.VIsual.getLnum()) {
				ModernizedCProgram.shift_delete_registers();
				generatedOap.setRegname((byte)'1');
			} else {
					generatedOap.setRegname((byte)'-');
			} 
			this.setCmdchar((byte)'d');
			this.setNchar((byte)'\000');
			cap.nv_operator();
			cap.do_pending_operator(0, 0);
			this.setCmdchar((-(((byte)'P') + ((int)((byte)'S') << 8))));
			if (ModernizedCProgram.ml_get_cursor() != (byte)'\000' && (((ModernizedCProgram.curwin.getW_cursor()).getLnum() != generatedLnum) ? generatedLnum < generatedLnum : (ModernizedCProgram.curwin.getW_cursor()).getCol() != generatedCol ? generatedCol < generatedCol : (ModernizedCProgram.curwin.getW_cursor()).getColadd() < generatedColadd) && ((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
				ModernizedCProgram.inc_cursor();
			} 
			cap.invoke_edit(0, generatedCmdchar, /* Insert to replace the deleted text with the pasted text. */0);
		}  else if (!generatedOap.checkclearopq()) {
			switch (generatedCmdchar) {
			case /* "a"ppend is like "i"nsert on the next character. */(byte)'a'/* increment coladd when in virtual space, increment the
					 * column otherwise, also to append after an unprintable char */:
					if (ModernizedCProgram.virtual_active() && (generatedColadd > 0 || ModernizedCProgram.ml_get_cursor() == (byte)'\000' || ModernizedCProgram.ml_get_cursor() == (byte)'\011')) {
						generatedColadd++;
					}  else if (ModernizedCProgram.ml_get_cursor() != (byte)'\000') {
						ModernizedCProgram.inc_cursor();
					} 
					break;
			case /* "I"nsert before the first non-blank */(byte)'I':
					if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'H') == ((Object)0)) {
						ModernizedCProgram.beginline(1);
					} else {
							ModernizedCProgram.beginline(1 | 4);
					} 
					break;
			case /* "A"ppend after the line */(byte)'A':
					ModernizedCProgram.set_cursor_for_append_to_line();
					break;
			case (-(((byte)'P') + ((int)((byte)'S') << 8/* Bracketed paste works like "a"ppend, unless the cursor is in
					 * the first column, then it inserts. */))):
					if (generatedCol == 0) {
						break;
					} 
			}
			if (generatedColadd && generatedCmdchar != (byte)'A') {
				int save_State = State;
				State = /* Pretend Insert mode here to allow the cursor on the
					     * character past the end of the line */-1024;
				ModernizedCProgram.coladvance(ModernizedCProgram.getviscol());
				State = save_State;
			} 
			cap.invoke_edit(0, generatedCmdchar, 0);
		}  else if (generatedCmdchar == (-(((byte)'P') + ((int)((byte)'S') << 8)))) {
			((Object)/* drop the pasted text */0/*
			 * Invoke edit() and take care of "restart_edit" and the return value.
			 */).bracketed_paste(.PASTE_INSERT, 1);
		} 
	}
	public void invoke_edit(int repl, int cmd, int startln) {
		int restart_edit_save = 0/* Complicated: When the user types "a<C-O>a" we don't want to do Insert
		     * mode recursively.  But when doing "a<C-O>." or "a<C-O>rx" we do allow
		     * it. */;
		if (repl || !ModernizedCProgram.stuff_empty()) {
			restart_edit_save = restart_edit;
		} else {
				restart_edit_save = 0;
		} 
		restart_edit = /* Always reset "restart_edit", this is not a restarted edit. */0;
		long generatedCount1 = this.getCount1();
		int generatedRetval = this.getRetval();
		if (ModernizedCProgram.edit(cmd, startln, generatedCount1)) {
			generatedRetval |=  1;
		} 
		if (restart_edit == 0) {
			restart_edit = restart_edit_save/*
			 * "a" or "i" while an operator is pending or in Visual mode: object motion.
			 */;
		} 
	}
	/* "r" or "gr" command */
	public void nv_object() {
		int flag;
		int include;
		char_u mps_save = new char_u();
		int generatedCmdchar = this.getCmdchar();
		if (generatedCmdchar == (byte)'i') {
			include = /* "ix" = inner object: exclude white space */0;
		} else {
				include = /* "ax" = an object: include white space */1;
		} 
		Object generatedB_p_mps = curbuf.getB_p_mps();
		mps_save = generatedB_p_mps;
		curbuf.setB_p_mps((char_u)"(:),{:},[:],<:>");
		oparg_S generatedOap = this.getOap();
		long generatedCount1 = this.getCount1();
		int generatedRetval = this.getRetval();
		int generatedNchar = this.getNchar();
		switch (generatedNchar) {
		case /* "ab" = a braces block */(byte)'b':
		case /* "a"" = a double quoted string */(byte)'"':
		case (byte)'>':
				flag = generatedOap.current_block(generatedCount1, include, (byte)'<', (byte)'>');
				break;
		case (byte)'{':
		case (byte)'(':
		case /* "aB" = a Brackets block */(byte)'B':
		case (byte)']':
				flag = generatedOap.current_block(generatedCount1, include, (byte)'[', (byte)']');
				break;
		case /* "a<" = a <> block */(byte)'<':
		case /* "a`" = a backtick quoted string */(byte)'`':
				flag = generatedOap.current_quote(generatedCount1, include, generatedNchar);
				break;
		case /* "ap" = a paragraph */(byte)'p':
				flag = generatedOap.current_par(generatedCount1, include, (byte)'p');
				break;
		case (byte)')':
				flag = generatedOap.current_block(generatedCount1, include, (byte)'(', (byte)')');
				break;
		case /* "at" = a tag block (xml and html) */(byte)'t'/* Do not adjust oap->end in do_pending_operator()
				 * otherwise there are different results for 'dit'
				 * (note leading whitespace in last line):
				 * 1) <b>      2) <b>
				 *    foobar      foobar
				 *    </b>            </b>
				 */:
				generatedRetval |=  2;
				flag = generatedOap.current_tagblock(generatedCount1, include);
				break;
		case /* "a'" = a single quoted string */(byte)'\'':
		case (byte)'}':
				flag = generatedOap.current_block(generatedCount1, include, (byte)'{', (byte)'}');
				break;
		case /* "aw" = a word */(byte)'w':
				flag = generatedOap.current_word(generatedCount1, include, 0);
				break;
		case /* "a[" = a [] block */(byte)'[':
		case /* "aW" = a WORD */(byte)'W':
				flag = generatedOap.current_word(generatedCount1, include, 1);
				break;
		case /* "as" = a sentence */(byte)'s':
				flag = generatedOap.current_sent(generatedCount1, include);
				break;
		default:
				flag = 0;
				break;
		}
		curbuf.setB_p_mps(mps_save);
		if (flag == 0) {
			generatedOap.clearopbeep();
		} 
		ModernizedCProgram.adjust_cursor_col();
		ModernizedCProgram.curwin.setW_set_curswant(1/*
		 * "q" command: Start/stop recording.
		 * "q:", "q/", "q?": edit command-line in command-line window.
		 */);
	}
	public void nv_record() {
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedNchar = this.getNchar();
		if (generatedOp_type == 9) {
			this.setCmdchar(/* "gqq" is the same as "gqgq": format line */(byte)'g');
			this.setNchar((byte)'q');
			cap.nv_operator();
		}  else if (!generatedOap.checkclearop()) {
			if (generatedNchar == (byte)':' || generatedNchar == (byte)'/' || generatedNchar == (byte)'?') {
				ModernizedCProgram.stuffcharReadbuff(generatedNchar);
				ModernizedCProgram.stuffcharReadbuff((-((true) + ((int)(key_extra.KE_CMDWIN) << 8))));
			}  else if (reg_executing == 0 && ModernizedCProgram.do_record(generatedNchar) == /* (stop) recording into a named register, unless executing a
				     * register */0) {
				generatedOap.clearopbeep();
			} 
		} 
	}
	public void nv_at() {
		oparg_S generatedOap = this.getOap();
		if (generatedOap.checkclearop()) {
			return ;
		} 
		int generatedNchar = this.getNchar();
		if (generatedNchar == (byte)'=') {
			if (ModernizedCProgram.get_expr_register() == (byte)'\000') {
				return ;
			} 
		} 
		long generatedCount1 = this.getCount1();
		while (generatedCount1-- && !got_int) {
			if (ModernizedCProgram.do_execreg(generatedNchar, 0, 0, 0) == 0) {
				generatedOap.clearopbeep();
				break;
			} 
			ModernizedCProgram.line_breakcheck();
		}
	}
	public void nv_halfpage() {
		int generatedCmdchar = this.getCmdchar();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		if ((generatedCmdchar == 21 && ModernizedCProgram.curwin.getW_cursor().getLnum() == 1) || (generatedCmdchar == 4 && ModernizedCProgram.curwin.getW_cursor().getLnum() == generatedMl_line_count)) {
			generatedOap.clearopbeep();
		}  else if (!generatedOap.checkclearop()) {
			ModernizedCProgram.halfpage(generatedCmdchar == 4, generatedCount0);
		} 
	}
	public void nv_join() {
		oparg_S generatedOap = this.getOap();
		long generatedCount0 = this.getCount0();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedRegname = generatedOap.getRegname();
		int generatedCmdchar = this.getCmdchar();
		int generatedNchar = this.getNchar();
		if (/* join the visual lines */VIsual_active) {
			cap.nv_operator();
		}  else if (!generatedOap.checkclearop()) {
			if (generatedCount0 <= 1) {
				this.setCount0(/* default for join is two lines! */2);
			} 
			if (ModernizedCProgram.curwin.getW_cursor().getLnum() + generatedCount0 - 1 > generatedMl_line_count) {
				if (generatedCount0 <= /* can't join when on the last line */2) {
					generatedOap.clearopbeep();
					return ;
				} 
				this.setCount0(generatedMl_line_count - ModernizedCProgram.curwin.getW_cursor().getLnum() + 1);
			} 
			ModernizedCProgram.prep_redo(generatedRegname, generatedCount0, (byte)'\000', generatedCmdchar, (byte)'\000', (byte)'\000', generatedNchar);
			(Object)ModernizedCProgram.do_join(generatedCount0, generatedNchar == (byte)'\000', 1, 1, 1/*
			 * "P", "gP", "p" and "gp" commands.
			 */);
		} 
	}
	public void nv_put() {
		cap.nv_put_opt(0/*
		 * "P", "gP", "p" and "gp" commands.
		 * "fix_indent" is TRUE for "[p", "[P", "]p" and "]P".
		 */);
	}
	public void nv_put_opt(int fix_indent) {
		int regname = 0;
		Object reg1 = ((Object)0);
		Object reg2 = ((Object)0);
		int empty = 0;
		int was_visual = 0;
		int dir;
		int flags = 0;
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedCmdchar = this.getCmdchar();
		long generatedOpcount = this.getOpcount();
		int generatedNchar = this.getNchar();
		int generatedRegname = generatedOap.getRegname();
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		 generatedB_op_start = curbuf.getB_op_start();
		Object generatedCol = generatedB_op_start.getCol();
		Object generatedLnum = generatedB_op_start.getLnum();
		long generatedCount1 = this.getCount1();
		 generatedB_visual = curbuf.getB_visual();
		 generatedB_op_end = curbuf.getB_op_end();
		Object generatedVi_end = generatedB_visual.getVi_end();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedOp_type != 0) {
			if (generatedOp_type == 1 && generatedCmdchar == /* "dp" is ":diffput" */(byte)'p') {
				generatedOap.clearop();
				ModernizedCProgram.nv_diffgetput(1, generatedOpcount);
			} else {
					generatedOap.clearopbeep();
			} 
		} else {
				if (fix_indent) {
					dir = (generatedCmdchar == (byte)']' && generatedNchar == (byte)'p') ? 1 : (true);
					flags |=  1;
				} else {
						dir = (generatedCmdchar == (byte)'P' || (generatedCmdchar == (byte)'g' && generatedNchar == (byte)'P')) ? (true) : 1;
				} 
				cap.prep_redo_cmd();
				if (generatedCmdchar == (byte)'g') {
					flags |=  2;
				} 
				if (VIsual_active/* Putting in Visual mode: The put text replaces the selected
					     * text.  First delete the selected text, then put the new text.
					     * Need to save and restore the registers that the delete
					     * overwrites if the old contents is being put.
					     */) {
					was_visual = 1;
					regname = generatedRegname;
					ModernizedCProgram.adjust_clip_reg(regname);
					if (regname == 0 || regname == (byte)'"' || ((int)(regname) - (byte)'0' < 10) || regname == (byte)'-' || (clip_unnamed && (regname == (byte)'*' || regname == (byte)'+'))) {
						reg1 = ModernizedCProgram.get_register(regname, /* The delete is going to overwrite the register we want to
								 * put, save it first. */1);
					} 
					this.setCmdchar((byte)'d');
					this.setNchar((byte)'\000');
					generatedOap.setRegname((byte)'\000');
					++msg_silent;
					cap.nv_operator();
					cap.do_pending_operator(0, 0);
					empty = (generatedMl_flags & 1);
					--msg_silent;
					generatedOap.setRegname(/* delete PUT_LINE_BACKWARD; */regname);
					if (reg1 != ((Object)0)) {
						reg2 = ModernizedCProgram.get_register(regname, /* Delete probably changed the register we want to put, save
								 * it first. Then put back what was there before the delete. */0);
						ModernizedCProgram.put_register(regname, reg1);
					} 
					if (VIsual_mode == /* When deleted a linewise Visual area, put the register as
						     * lines to avoid it joined with the next line.  When deletion was
						     * characterwise, split a line when putting lines. */(byte)'V') {
						flags |=  8;
					}  else if (VIsual_mode == (byte)'v') {
						flags |=  16;
					} 
					if (VIsual_mode == 22 && dir == 1) {
						flags |=  32;
					} 
					dir = (true);
					if ((VIsual_mode != (byte)'V' && ModernizedCProgram.curwin.getW_cursor().getCol() < generatedCol) || (VIsual_mode == (byte)'V' && ModernizedCProgram.curwin.getW_cursor().getLnum() < generatedLnum)) {
						dir = 1;
					} 
					VIsual_active = /* May have been reset in do_put(). */1;
				} 
				ModernizedCProgram.do_put(generatedRegname, dir, generatedCount1, flags);
				if (reg2 != ((Object)/* If a register was saved, put it back now. */0)) {
					ModernizedCProgram.put_register(regname, reg2);
				} 
				if (/* What to reselect with "gv"?  Selecting the just put text seems to
					 * be the most useful, since the original text was removed. */was_visual) {
					generatedB_visual.setVi_start(generatedB_op_start);
					generatedB_visual.setVi_end(generatedB_op_end);
					if (ModernizedCProgram.p_sel == /* need to adjust cursor position */(byte)'e') {
						generatedVi_end.inc();
					} 
				} 
				if (empty && ModernizedCProgram.ml_get(generatedMl_line_count) == /* When all lines were selected and deleted do_put() leaves an empty
					 * line that needs to be deleted now. */(byte)'\000') {
					ModernizedCProgram.ml_delete(generatedMl_line_count, 1);
					ModernizedCProgram.deleted_lines(generatedMl_line_count + 1, 1);
					if (generatedLnum > generatedMl_line_count) {
						ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
						ModernizedCProgram.coladvance((colnr_T)INT_MAX);
					} 
				} 
				ModernizedCProgram.auto_format(0, 1/*
				 * "o" and "O" commands.
				 */);
		} 
	}
	public void nv_open() {
		oparg_S generatedOap = this.getOap();
		int generatedOp_type = generatedOap.getOp_type();
		int generatedCmdchar = this.getCmdchar();
		long generatedOpcount = this.getOpcount();
		if (generatedOp_type == 1 && generatedCmdchar == /* "do" is ":diffget" */(byte)'o') {
			generatedOap.clearop();
			ModernizedCProgram.nv_diffgetput(0, generatedOpcount);
		}  else if (/* switch start and end of visual */VIsual_active) {
			ModernizedCProgram.v_swap_corners(generatedCmdchar);
		} else {
				cap.n_opencmd();
		} 
	}
	/*
	 * Trigger CursorHold event.
	 * When waiting for a character for 'updatetime' K_CURSORHOLD is put in the
	 * input buffer.  "did_cursorhold" is set to avoid retriggering.
	 */
	public void nv_cursorhold() {
		curbuf.apply_autocmds(auto_event.EVENT_CURSORHOLD, ((Object)0), ((Object)0), 0);
		did_cursorhold = 1;
		int generatedRetval = this.getRetval();
		generatedRetval |=  /* don't call edit() now */1;
	}
	public void do_pending_operator(int old_col, int gui_yank) {
		oparg_S generatedOap = this.getOap();
		oparg_T oap = generatedOap;
		pos_T old_cursor = new pos_T();
		int empty_region_error;
		int restart_edit_save;
		int lbr_saved = ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr();
		// The visual area is remembered for redo// 'v', 'V', or Ctrl-Vint redo_VIsual_mode = (byte)'\000';
		// number of lineslinenr_T redo_VIsual_line_count = new linenr_T();
		// number of cols or end columncolnr_T redo_VIsual_vcol = new colnr_T();
		// count for Visual operatorlong redo_VIsual_count;
		// extra argumentint redo_VIsual_arg;
		int include_line_break = 0;
		// Yank the visual area into the GUI selection register before we operate// on it and lose it forever.
		Object generatedAvailable = clip_star.getAvailable();
		int generatedOp_type = oap.getOp_type();
		int generatedRegname = oap.getRegname();
		// Don't do it if a specific register was specified, so that ""x"*P works.// This could call do_pending_operator() recursively, but that's OK// because gui_yank will be TRUE for the nested call.if ((generatedAvailable || generatedAvailable) && generatedOp_type != 0 && !gui_yank && VIsual_active && !redo_VIsual_busy && generatedRegname == 0) {
			ModernizedCProgram.clip_auto_select();
		} 
		old_cursor = ModernizedCProgram.curwin.getW_cursor();
		int generatedMotion_force = oap.getMotion_force();
		int generatedMotion_type = oap.getMotion_type();
		int generatedInclusive = oap.getInclusive();
		 generatedStart = oap.getStart();
		int generatedCmdchar = this.getCmdchar();
		long generatedCount0 = this.getCount0();
		int generatedNchar = this.getNchar();
		Object generatedSearchbuf = this.getSearchbuf();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		 generatedB_visual = curbuf.getB_visual();
		Object generatedLnum = (generatedStart).getLnum();
		Object generatedCol = (generatedStart).getCol();
		Object generatedColadd = (generatedStart).getColadd();
		 generatedEnd = oap.getEnd();
		Object generatedEnd_vcol = oap.getEnd_vcol();
		long generatedLine_count = oap.getLine_count();
		Object generatedStart_vcol = oap.getStart_vcol();
		int generatedArg = this.getArg();
		int generatedEmpty = oap.getEmpty();
		int generatedIs_VIsual = oap.getIs_VIsual();
		int generatedB_p_ma = curbuf.getB_p_ma();
		int generatedRetval = this.getRetval();
		int generatedBlock_mode = oap.getBlock_mode();
		long generatedCount1 = this.getCount1();
		Object generatedB_p_lisp = curbuf.getB_p_lisp();
		Object generatedB_p_inde = curbuf.getB_p_inde();
		Object generatedB_p_fex = curbuf.getB_p_fex();
		Object generatedB_p_fp = curbuf.getB_p_fp();
		int generatedEnd_adjusted = oap.getEnd_adjusted();
		// If an operation is pending, handle it...if ((finish_op || VIsual_active) && generatedOp_type != 0) {
			int redo_yank = ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'y') != ((Object)0) && !gui_yank;
			if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr()) {
				ModernizedCProgram.curwin.getW_valid() &=  ~-1024;
			} 
			ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(0);
			oap.setIs_VIsual(VIsual_active);
			if (generatedMotion_force == (byte)'V') {
				oap.setMotion_type(1);
			}  else if (generatedMotion_force == (byte)'v') {
				if (generatedMotion_type == 1) {
					oap.setInclusive(0);
				}  else if (generatedMotion_type == 0) {
					oap.setInclusive(!generatedInclusive);
				} 
				oap.setMotion_type(0);
			}  else if (generatedMotion_force == 22) {
				if (!VIsual_active) {
					VIsual_active = 1;
					ModernizedCProgram.VIsual = generatedStart;
				} 
				VIsual_mode = 22;
				VIsual_select = 0;
				ModernizedCProgram.VIsual_reselect = 0;
			} 
			if ((redo_yank || generatedOp_type != 2) && ((!VIsual_active || generatedMotion_force) || (VIsual_active && generatedCmdchar == (byte)':' && generatedOp_type != 10)) && generatedCmdchar != (byte)'D' && generatedOp_type != 19 && generatedOp_type != 20 && generatedOp_type != 21 && generatedOp_type != 22 && generatedOp_type != 23 && generatedOp_type != 24 && generatedOp_type != 25) {
				ModernizedCProgram.prep_redo(generatedRegname, generatedCount0, ModernizedCProgram.get_op_char(generatedOp_type), ModernizedCProgram.get_extra_op_char(generatedOp_type), generatedMotion_force, generatedCmdchar, generatedNchar);
				if (generatedCmdchar == (byte)'/' || generatedCmdchar == (byte)'?') {
					if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'r') == ((Object)0)) {
						ModernizedCProgram.AppendToRedobuffLit(generatedSearchbuf, -1);
					} 
					ModernizedCProgram.AppendToRedobuff((char_u)"\012");
				}  else if (generatedCmdchar == (byte)':') {
					if (repeat_cmdline == ((Object)0)) {
						ModernizedCProgram.ResetRedobuff();
					} else {
							ModernizedCProgram.AppendToRedobuffLit(repeat_cmdline, -1);
							ModernizedCProgram.AppendToRedobuff((char_u)"\012");
							do {
								if ((repeat_cmdline) != ((Object)0)) {
									ModernizedCProgram.vim_free(repeat_cmdline);
									(repeat_cmdline) = ((Object)0);
								} 
							} while (0);
					} 
				} 
			} 
			if (redo_VIsual_busy) {
				oap.setStart(ModernizedCProgram.curwin.getW_cursor());
				ModernizedCProgram.curwin.getW_cursor().getLnum() += redo_VIsual_line_count - 1;
				if (ModernizedCProgram.curwin.getW_cursor().getLnum() > generatedMl_line_count) {
					ModernizedCProgram.curwin.getW_cursor().setLnum(generatedMl_line_count);
				} 
				VIsual_mode = redo_VIsual_mode;
				if (redo_VIsual_vcol == INT_MAX || VIsual_mode == (byte)'v') {
					if (VIsual_mode == (byte)'v') {
						if (redo_VIsual_line_count <= 1) {
							ModernizedCProgram.validate_virtcol();
							ModernizedCProgram.curwin.setW_curswant(ModernizedCProgram.curwin.getW_virtcol() + redo_VIsual_vcol - 1);
						} else {
								ModernizedCProgram.curwin.setW_curswant(redo_VIsual_vcol);
						} 
					} else {
							ModernizedCProgram.curwin.setW_curswant(INT_MAX);
					} 
					ModernizedCProgram.coladvance(ModernizedCProgram.curwin.getW_curswant());
				} 
				this.setCount0(redo_VIsual_count);
				if (redo_VIsual_count != 0) {
					this.setCount1(redo_VIsual_count);
				} else {
						this.setCount1(1);
				} 
			}  else if (VIsual_active) {
				if (!gui_yank) {
					generatedB_visual.setVi_start(ModernizedCProgram.VIsual);
					generatedB_visual.setVi_end(ModernizedCProgram.curwin.getW_cursor());
					generatedB_visual.setVi_mode(VIsual_mode);
					ModernizedCProgram.restore_visual_mode();
					generatedB_visual.setVi_curswant(ModernizedCProgram.curwin.getW_curswant());
					curbuf.setB_visual_mode_eval(VIsual_mode);
				} 
				if (VIsual_select && VIsual_mode == (byte)'V' && generatedOp_type != 1) {
					if ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
						ModernizedCProgram.VIsual.setCol(0);
						ModernizedCProgram.curwin.getW_cursor().setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()))));
					} else {
							ModernizedCProgram.curwin.getW_cursor().setCol(0);
							ModernizedCProgram.VIsual.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(ModernizedCProgram.VIsual.getLnum()))));
					} 
					VIsual_mode = (byte)'v';
				}  else if (VIsual_mode == (byte)'v') {
					include_line_break = ModernizedCProgram.unadjust_for_sel();
				} 
				oap.setStart(ModernizedCProgram.VIsual);
				if (VIsual_mode == (byte)'V') {
					generatedStart.setCol(0);
					generatedStart.setColadd(0);
				} 
			} 
			if (((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
				if (!VIsual_active) {
					if (ModernizedCProgram.hasFolding(generatedLnum, generatedLnum, ((Object)0))) {
						generatedStart.setCol(0);
					} 
					if ((generatedCol > 0 || generatedInclusive) && ModernizedCProgram.hasFolding(generatedLnum, ((Object)0), generatedLnum)) {
						ModernizedCProgram.curwin.getW_cursor().setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get_curline())));
					} 
				} 
				oap.setEnd(ModernizedCProgram.curwin.getW_cursor());
				ModernizedCProgram.curwin.setW_cursor(generatedStart);
				ModernizedCProgram.curwin.getW_valid() &=  ~-1024;
			} else {
					if (!VIsual_active && generatedMotion_type == 1) {
						if (ModernizedCProgram.hasFolding(generatedLnum, generatedLnum, ((Object)0))) {
							ModernizedCProgram.curwin.getW_cursor().setCol(0);
						} 
						if (ModernizedCProgram.hasFolding(generatedLnum, ((Object)0), generatedLnum)) {
							generatedStart.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))));
						} 
					} 
					oap.setEnd(generatedStart);
					oap.setStart(ModernizedCProgram.curwin.getW_cursor());
			} 
			ModernizedCProgram.check_pos(ModernizedCProgram.curwin.getW_buffer(), generatedEnd);
			oap.setLine_count(generatedLnum - generatedLnum + 1);
			virtual_op = ModernizedCProgram.virtual_active();
			if (VIsual_active || redo_VIsual_busy) {
				oap.get_op_vcol(redo_VIsual_vcol, 1);
				if (!redo_VIsual_busy && !gui_yank) {
					resel_VIsual_mode = VIsual_mode;
					if (ModernizedCProgram.curwin.getW_curswant() == INT_MAX) {
						ModernizedCProgram.resel_VIsual_vcol = INT_MAX;
					} else {
							if (VIsual_mode != 22) {
								ModernizedCProgram.getvvcol(ModernizedCProgram.curwin, (generatedEnd), ((Object)0), ((Object)0), generatedEnd_vcol);
							} 
							if (VIsual_mode == 22 || generatedLine_count <= 1) {
								if (VIsual_mode != 22) {
									ModernizedCProgram.getvvcol(ModernizedCProgram.curwin, (generatedStart), generatedStart_vcol, ((Object)0), ((Object)0));
								} 
								ModernizedCProgram.resel_VIsual_vcol = generatedEnd_vcol - generatedStart_vcol + 1;
							} else {
									ModernizedCProgram.resel_VIsual_vcol = generatedEnd_vcol;
							} 
					} 
					ModernizedCProgram.resel_VIsual_line_count = generatedLine_count;
				} 
				if ((redo_yank || generatedOp_type != 2) && generatedOp_type != 10 && generatedOp_type != 19 && generatedOp_type != 20 && generatedOp_type != 21 && generatedOp_type != 22 && generatedOp_type != 23 && generatedOp_type != 24 && generatedOp_type != 25 && generatedMotion_force == (byte)'\000') {
					if (generatedCmdchar == (byte)'g' && (generatedNchar == (byte)'n' || generatedNchar == (byte)'N')) {
						ModernizedCProgram.prep_redo(generatedRegname, generatedCount0, ModernizedCProgram.get_op_char(generatedOp_type), ModernizedCProgram.get_extra_op_char(generatedOp_type), generatedMotion_force, generatedCmdchar, generatedNchar);
					}  else if (generatedCmdchar != (byte)':') {
						int nchar = generatedOp_type == 16 ? generatedNchar : (byte)'\000';
						if (nchar == -1) {
							nchar = (byte)'\015';
						}  else if (nchar == -2) {
							nchar = (byte)'\012';
						} 
						ModernizedCProgram.prep_redo(generatedRegname, -1024, (byte)'\000', (byte)'v', ModernizedCProgram.get_op_char(generatedOp_type), ModernizedCProgram.get_extra_op_char(generatedOp_type), nchar);
					} 
					if (!redo_VIsual_busy) {
						redo_VIsual_mode = resel_VIsual_mode;
						redo_VIsual_vcol = ModernizedCProgram.resel_VIsual_vcol;
						redo_VIsual_line_count = ModernizedCProgram.resel_VIsual_line_count;
						redo_VIsual_count = generatedCount0;
						redo_VIsual_arg = generatedArg;
					} 
				} 
				if (generatedMotion_force == (byte)'\000' || generatedMotion_type == 1) {
					oap.setInclusive(1);
				} 
				if (VIsual_mode == (byte)'V') {
					oap.setMotion_type(1);
				} else {
						oap.setMotion_type(0);
						if (VIsual_mode != 22 && (generatedEnd).ml_get_pos() == (byte)'\000' && (include_line_break || !virtual_op)) {
							oap.setInclusive(0);
							if (ModernizedCProgram.p_sel != (byte)'o' && !ModernizedCProgram.op_on_lines(generatedOp_type) && generatedLnum < generatedMl_line_count) {
								++generatedLnum;
								generatedEnd.setCol(0);
								generatedEnd.setColadd(0);
								++generatedLine_count;
							} 
						} 
				} 
				redo_VIsual_busy = 0;
				if (!gui_yank) {
					VIsual_active = 0;
					.setmouse();
					mouse_dragging = 0;
					ModernizedCProgram.may_clear_cmdline();
					if ((generatedOp_type == 2 || generatedOp_type == 10 || generatedOp_type == 27 || generatedOp_type == 6) && generatedMotion_force == (byte)'\000') {
						ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
						ModernizedCProgram.redraw_curbuf_later(20);
					} 
				} 
			} 
			if (has_mbyte && generatedInclusive) {
				int l;
				ModernizedCProgram.l = .UNRECOGNIZEDFUNCTIONNAME(generatedEnd.ml_get_pos());
				if (ModernizedCProgram.l > 1) {
					generatedCol += ModernizedCProgram.l - 1;
				} 
			} 
			ModernizedCProgram.curwin.setW_set_curswant(1);
			oap.setEmpty((generatedMotion_type == 0 && (!generatedInclusive || (generatedOp_type == 2 && generatedEnd.gchar_pos() == (byte)'\000')) && ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd)) && !(virtual_op && generatedColadd != generatedColadd)));
			empty_region_error = (generatedEmpty && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'E') != ((Object)0));
			if (generatedIs_VIsual && (generatedEmpty || !generatedB_p_ma || generatedOp_type == 19)) {
				ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
				ModernizedCProgram.redraw_curbuf_later(20);
			} 
			if (generatedMotion_type == 0 && generatedInclusive == 0 && !(generatedRetval & 2) && generatedCol == 0 && (!generatedIs_VIsual || ModernizedCProgram.p_sel == (byte)'o') && !generatedBlock_mode && generatedLine_count > 1) {
				oap.setEnd_adjusted(1);
				--generatedLine_count;
				--generatedLnum;
				if (ModernizedCProgram.inindent(0)) {
					oap.setMotion_type(1);
				} else {
						generatedEnd.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))));
						if (generatedCol) {
							--generatedCol;
							oap.setInclusive(1);
						} 
				} 
			} else {
					oap.setEnd_adjusted(0);
			} 
			switch (generatedOp_type) {
			case 19:
					ModernizedCProgram.VIsual_reselect = 0;
					ModernizedCProgram.foldCreate(generatedLnum, generatedLnum);
					break;
			case 9:
					if (generatedB_p_fex != (byte)'\000') {
						oap.op_formatexpr();
					}  else if (ModernizedCProgram.p_fp != (byte)'\000' || generatedB_p_fp != (byte)'\000') {
						oap.op_colon();
					} else {
							oap.op_format(0);
					} 
					break;
			case 23:
					ModernizedCProgram.VIsual_reselect = 0;
					ModernizedCProgram.opFoldRange(generatedLnum, generatedLnum, generatedOp_type == 20 || generatedOp_type == 21, generatedOp_type == 21 || generatedOp_type == 23, generatedIs_VIsual);
					break;
			case 7:
			case 12:
			case 26:
					oap.op_format(1);
					break;
			case 20:
			case 3:
					ModernizedCProgram.VIsual_reselect = 0;
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							if (ModernizedCProgram.p_im || !ModernizedCProgram.KeyTyped) {
								restart_edit_save = restart_edit;
							} else {
									restart_edit_save = 0;
							} 
							restart_edit = 0;
							if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr() != lbr_saved) {
								ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
								oap.get_op_vcol(redo_VIsual_mode, 0);
							} 
							finish_op = 0;
							if (oap.op_change()) {
								generatedRetval |=  1;
							} 
							if (restart_edit == 0) {
								restart_edit = restart_edit_save;
							} 
					} 
					break;
			case 25:
					ModernizedCProgram.VIsual_reselect = 0;
					ModernizedCProgram.deleteFold(generatedLnum, generatedLnum, generatedOp_type == 25, generatedIs_VIsual);
					break;
			case 28:
			case 27:
					ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
					oap.op_function();
					break;
			case 24:
			case 5:
					oap.op_shift(1, generatedIs_VIsual ? (int)generatedCount1 : 1);
					ModernizedCProgram.auto_format(0, 1);
					break;
			case 14:
			case 16:
					ModernizedCProgram.VIsual_reselect = 0;
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr() != lbr_saved) {
								ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
								oap.get_op_vcol(redo_VIsual_mode, 0);
							} 
							oap.op_replace(generatedNchar);
					} 
					break;
			case 4:
			case 10:
					if (generatedOp_type == 8 && ModernizedCProgram.get_equalprg() == (byte)'\000') {
						if (generatedB_p_lisp) {
							oap.op_reindent(get_lisp_indent);
							break;
						} 
						oap.op_reindent(generatedB_p_inde != (byte)'\000' ? get_expr_indent : get_c_indent);
						break;
					} 
					oap.op_colon();
					break;
			case 15:
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							oap.op_tilde();
					} 
					ModernizedCProgram.check_cursor_col();
					break;
			case 1:
					ModernizedCProgram.VIsual_reselect = 0;
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							(Object)oap.op_delete();
							if (generatedMotion_type == 1 && ModernizedCProgram.has_format_option((byte)'a')) {
								ModernizedCProgram.u_save_cursor();
							} 
							ModernizedCProgram.auto_format(0, 1);
					} 
					break;
			case 6:
					if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'!') != ((Object)0)) {
						ModernizedCProgram.AppendToRedobuff((char_u)"!\r");
					} else {
							bangredo = 1;
					} 
			case 22:
			case 2:
					if (empty_region_error) {
						if (!gui_yank) {
							ModernizedCProgram.vim_beep(-1024);
							ModernizedCProgram.CancelRedo();
						} 
					} else {
							ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
							(Object)oap.op_yank(0, !gui_yank);
					} 
					ModernizedCProgram.check_cursor_col();
					break;
			case 18:
					ModernizedCProgram.VIsual_reselect = 0;
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							restart_edit_save = restart_edit;
							restart_edit = 0;
							if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_lbr() != lbr_saved) {
								ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
								oap.get_op_vcol(redo_VIsual_mode, 0);
							} 
							oap.op_insert(generatedCount1);
							ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(0);
							ModernizedCProgram.auto_format(0, 1);
							if (restart_edit == 0) {
								restart_edit = restart_edit_save;
							} else {
									generatedRetval |=  1;
							} 
					} 
					break;
			case 17:
			case 13:
					if (generatedLine_count < 2) {
						oap.setLine_count(2);
					} 
					if (generatedLnum + generatedLine_count - 1 > generatedMl_line_count) {
						ModernizedCProgram.beep_flush();
					} else {
							(Object)ModernizedCProgram.do_join(generatedLine_count, generatedOp_type == 13, 1, 1, 1);
							ModernizedCProgram.auto_format(0, 1);
					} 
					break;
			case 11:
			case 21:
			case 29:
					if (empty_region_error) {
						ModernizedCProgram.vim_beep(-1024);
						ModernizedCProgram.CancelRedo();
					} else {
							VIsual_active = 1;
							ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
							oap.op_addsub(generatedCount1, redo_VIsual_arg);
							VIsual_active = 0;
					} 
					ModernizedCProgram.check_cursor_col();
					break;
			case 8:
			default:
					oap.clearopbeep();
			}
			virtual_op = 2;
			if (!gui_yank) {
				if (!ModernizedCProgram.p_sol && generatedMotion_type == 1 && !generatedEnd_adjusted && (generatedOp_type == 4 || generatedOp_type == 5 || generatedOp_type == 1)) {
					ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(0);
					ModernizedCProgram.coladvance(ModernizedCProgram.curwin.setW_curswant(old_col));
				} 
			} else {
					ModernizedCProgram.curwin.setW_cursor(old_cursor);
			} 
			oap.setBlock_mode(0);
			oap.clearop();
			motion_force = (byte)'\000';
		} 
		// Yank can be redone when 'y' is in 'cpoptions', but not when yanking
		ModernizedCProgram.curwin.getW_onebuf_opt().setWo_lbr(lbr_saved);
	}
	public oparg_S getOap() {
		return oap;
	}
	public void setOap(oparg_S newOap) {
		oap = newOap;
	}
	public int getPrechar() {
		return prechar;
	}
	public void setPrechar(int newPrechar) {
		prechar = newPrechar;
	}
	public int getCmdchar() {
		return cmdchar;
	}
	public void setCmdchar(int newCmdchar) {
		cmdchar = newCmdchar;
	}
	public int getNchar() {
		return nchar;
	}
	public void setNchar(int newNchar) {
		nchar = newNchar;
	}
	public int getNcharC1() {
		return ncharC1;
	}
	public void setNcharC1(int newNcharC1) {
		ncharC1 = newNcharC1;
	}
	public int getNcharC2() {
		return ncharC2;
	}
	public void setNcharC2(int newNcharC2) {
		ncharC2 = newNcharC2;
	}
	public int getExtra_char() {
		return extra_char;
	}
	public void setExtra_char(int newExtra_char) {
		extra_char = newExtra_char;
	}
	public long getOpcount() {
		return opcount;
	}
	public void setOpcount(long newOpcount) {
		opcount = newOpcount;
	}
	public long getCount0() {
		return count0;
	}
	public void setCount0(long newCount0) {
		count0 = newCount0;
	}
	public long getCount1() {
		return count1;
	}
	public void setCount1(long newCount1) {
		count1 = newCount1;
	}
	public int getArg() {
		return arg;
	}
	public void setArg(int newArg) {
		arg = newArg;
	}
	public int getRetval() {
		return retval;
	}
	public void setRetval(int newRetval) {
		retval = newRetval;
	}
	public Object getSearchbuf() {
		return searchbuf;
	}
	public void setSearchbuf(Object newSearchbuf) {
		searchbuf = newSearchbuf;
	}
}
