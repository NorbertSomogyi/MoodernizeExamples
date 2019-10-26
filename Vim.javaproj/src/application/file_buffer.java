package application;

// forward declaration
public class file_buffer {
	private memline b_ml;
	private file_buffer b_next;
	private file_buffer b_prev;
	private int b_nwindows;
	private int b_flags;
	private int b_locked;
	private Object b_ffname;
	private Object b_sfname;
	private Object b_fname;
	private int b_fnum;
	private Object b_key;
	private int b_changed;
	private dictitem16_S b_ct_di;
	private Object b_last_changedtick;
	private Object b_last_changedtick_pum;
	private int b_saving;
	private int b_mod_set;
	private Object b_mod_top;
	private Object b_mod_bot;
	private long b_mod_xlines;
	private wininfo_S b_wininfo;
	private long b_mtime;
	private long b_mtime_read;
	private Object b_orig_size;
	private int b_orig_mode;
	private Object b_namedm;
	private  b_visual;
	private  b_last_cursor;
	private  b_last_insert;
	private  b_last_change;
	private Object b_chartab;
	private Object b_maphash;
	private mapblock b_first_abbr;
	private growarray b_ucmds;
	private  b_op_start;
	private  b_op_start_orig;
	private  b_op_end;
	private u_header b_u_oldhead;
	private u_header b_u_newhead;
	private u_header b_u_curhead;
	private int b_u_numhead;
	private int b_u_synced;
	private long b_u_seq_last;
	private long b_u_save_nr_last;
	private long b_u_seq_cur;
	private Object b_u_time_cur;
	private long b_u_save_nr_cur;
	private  b_u_line_ptr;
	private Object b_u_line_lnum;
	private Object b_u_line_colnr;
	private int b_scanned;
	private long b_p_iminsert;
	private long b_p_imsearch;
	private int b_p_initialized;
	private int b_p_ai;
	private int b_p_ai_nopaste;
	private Object b_p_bkc;
	private int b_bkc_flags;
	private int b_p_ci;
	private int b_p_bin;
	private int b_p_bomb;
	private Object b_p_bh;
	private Object b_p_bt;
	private int b_p_bl;
	private Object b_p_com;
	private Object b_p_cpt;
	private int b_p_eol;
	private int b_p_fixeol;
	private int b_p_et;
	private int b_p_et_nobin;
	private int b_p_et_nopaste;
	private Object b_p_fenc;
	private Object b_p_ff;
	private Object b_p_ft;
	private Object b_p_fo;
	private Object b_p_flp;
	private int b_p_inf;
	private Object b_p_isk;
	private Object b_p_fp;
	private Object b_p_kp;
	private Object b_p_menc;
	private Object b_p_mps;
	private int b_p_ml;
	private int b_p_ml_nobin;
	private int b_p_ma;
	private Object b_p_nf;
	private int b_p_pi;
	private int b_p_ro;
	private long b_p_sw;
	private int b_p_sn;
	private long b_p_sts;
	private long b_p_sts_nopaste;
	private int b_p_swf;
	private long b_p_ts;
	private int b_p_tx;
	private long b_p_tw;
	private long b_p_tw_nobin;
	private long b_p_tw_nopaste;
	private long b_p_wm;
	private long b_p_wm_nobin;
	private long b_p_wm_nopaste;
	private Object b_p_ep;
	private Object b_p_path;
	private int b_p_ar;
	private Object b_p_tags;
	private Object b_p_tc;
	private int b_tc_flags;
	private Object b_p_dict;
	private Object b_p_tsr;
	private long b_p_ul;
	private Object b_no_eol_lnum;
	private int b_start_eol;
	private int b_start_ffc;
	private Object b_start_fenc;
	private int b_bad_char;
	private int b_start_bomb;
	private int b_may_swap;
	private int b_did_warn;
	private int b_help;
	private int b_shortname;
	private int b_mapped_ctrl_c;
	
	public file_buffer(memline b_ml, file_buffer b_next, file_buffer b_prev, int b_nwindows, int b_flags, int b_locked, Object b_ffname, Object b_sfname, Object b_fname, int b_fnum, Object b_key, int b_changed, dictitem16_S b_ct_di, Object b_last_changedtick, Object b_last_changedtick_pum, int b_saving, int b_mod_set, Object b_mod_top, Object b_mod_bot, long b_mod_xlines, wininfo_S b_wininfo, long b_mtime, long b_mtime_read, Object b_orig_size, int b_orig_mode, Object b_namedm,  b_visual,  b_last_cursor,  b_last_insert,  b_last_change, Object b_chartab, Object b_maphash, mapblock b_first_abbr, growarray b_ucmds,  b_op_start,  b_op_start_orig,  b_op_end, u_header b_u_oldhead, u_header b_u_newhead, u_header b_u_curhead, int b_u_numhead, int b_u_synced, long b_u_seq_last, long b_u_save_nr_last, long b_u_seq_cur, Object b_u_time_cur, long b_u_save_nr_cur,  b_u_line_ptr, Object b_u_line_lnum, Object b_u_line_colnr, int b_scanned, long b_p_iminsert, long b_p_imsearch, int b_p_initialized, int b_p_ai, int b_p_ai_nopaste, Object b_p_bkc, int b_bkc_flags, int b_p_ci, int b_p_bin, int b_p_bomb, Object b_p_bh, Object b_p_bt, int b_p_bl, Object b_p_com, Object b_p_cpt, int b_p_eol, int b_p_fixeol, int b_p_et, int b_p_et_nobin, int b_p_et_nopaste, Object b_p_fenc, Object b_p_ff, Object b_p_ft, Object b_p_fo, Object b_p_flp, int b_p_inf, Object b_p_isk, Object b_p_fp, Object b_p_kp, Object b_p_menc, Object b_p_mps, int b_p_ml, int b_p_ml_nobin, int b_p_ma, Object b_p_nf, int b_p_pi, int b_p_ro, long b_p_sw, int b_p_sn, long b_p_sts, long b_p_sts_nopaste, int b_p_swf, long b_p_ts, int b_p_tx, long b_p_tw, long b_p_tw_nobin, long b_p_tw_nopaste, long b_p_wm, long b_p_wm_nobin, long b_p_wm_nopaste, Object b_p_ep, Object b_p_path, int b_p_ar, Object b_p_tags, Object b_p_tc, int b_tc_flags, Object b_p_dict, Object b_p_tsr, long b_p_ul, Object b_no_eol_lnum, int b_start_eol, int b_start_ffc, Object b_start_fenc, int b_bad_char, int b_start_bomb, int b_may_swap, int b_did_warn, int b_help, int b_shortname, int b_mapped_ctrl_c) {
		setB_ml(b_ml);
		setB_next(b_next);
		setB_prev(b_prev);
		setB_nwindows(b_nwindows);
		setB_flags(b_flags);
		setB_locked(b_locked);
		setB_ffname(b_ffname);
		setB_sfname(b_sfname);
		setB_fname(b_fname);
		setB_fnum(b_fnum);
		setB_key(b_key);
		setB_changed(b_changed);
		setB_ct_di(b_ct_di);
		setB_last_changedtick(b_last_changedtick);
		setB_last_changedtick_pum(b_last_changedtick_pum);
		setB_saving(b_saving);
		setB_mod_set(b_mod_set);
		setB_mod_top(b_mod_top);
		setB_mod_bot(b_mod_bot);
		setB_mod_xlines(b_mod_xlines);
		setB_wininfo(b_wininfo);
		setB_mtime(b_mtime);
		setB_mtime_read(b_mtime_read);
		setB_orig_size(b_orig_size);
		setB_orig_mode(b_orig_mode);
		setB_namedm(b_namedm);
		setB_visual(b_visual);
		setB_last_cursor(b_last_cursor);
		setB_last_insert(b_last_insert);
		setB_last_change(b_last_change);
		setB_chartab(b_chartab);
		setB_maphash(b_maphash);
		setB_first_abbr(b_first_abbr);
		setB_ucmds(b_ucmds);
		setB_op_start(b_op_start);
		setB_op_start_orig(b_op_start_orig);
		setB_op_end(b_op_end);
		setB_u_oldhead(b_u_oldhead);
		setB_u_newhead(b_u_newhead);
		setB_u_curhead(b_u_curhead);
		setB_u_numhead(b_u_numhead);
		setB_u_synced(b_u_synced);
		setB_u_seq_last(b_u_seq_last);
		setB_u_save_nr_last(b_u_save_nr_last);
		setB_u_seq_cur(b_u_seq_cur);
		setB_u_time_cur(b_u_time_cur);
		setB_u_save_nr_cur(b_u_save_nr_cur);
		setB_u_line_ptr(b_u_line_ptr);
		setB_u_line_lnum(b_u_line_lnum);
		setB_u_line_colnr(b_u_line_colnr);
		setB_scanned(b_scanned);
		setB_p_iminsert(b_p_iminsert);
		setB_p_imsearch(b_p_imsearch);
		setB_p_initialized(b_p_initialized);
		setB_p_ai(b_p_ai);
		setB_p_ai_nopaste(b_p_ai_nopaste);
		setB_p_bkc(b_p_bkc);
		setB_bkc_flags(b_bkc_flags);
		setB_p_ci(b_p_ci);
		setB_p_bin(b_p_bin);
		setB_p_bomb(b_p_bomb);
		setB_p_bh(b_p_bh);
		setB_p_bt(b_p_bt);
		setB_p_bl(b_p_bl);
		setB_p_com(b_p_com);
		setB_p_cpt(b_p_cpt);
		setB_p_eol(b_p_eol);
		setB_p_fixeol(b_p_fixeol);
		setB_p_et(b_p_et);
		setB_p_et_nobin(b_p_et_nobin);
		setB_p_et_nopaste(b_p_et_nopaste);
		setB_p_fenc(b_p_fenc);
		setB_p_ff(b_p_ff);
		setB_p_ft(b_p_ft);
		setB_p_fo(b_p_fo);
		setB_p_flp(b_p_flp);
		setB_p_inf(b_p_inf);
		setB_p_isk(b_p_isk);
		setB_p_fp(b_p_fp);
		setB_p_kp(b_p_kp);
		setB_p_menc(b_p_menc);
		setB_p_mps(b_p_mps);
		setB_p_ml(b_p_ml);
		setB_p_ml_nobin(b_p_ml_nobin);
		setB_p_ma(b_p_ma);
		setB_p_nf(b_p_nf);
		setB_p_pi(b_p_pi);
		setB_p_ro(b_p_ro);
		setB_p_sw(b_p_sw);
		setB_p_sn(b_p_sn);
		setB_p_sts(b_p_sts);
		setB_p_sts_nopaste(b_p_sts_nopaste);
		setB_p_swf(b_p_swf);
		setB_p_ts(b_p_ts);
		setB_p_tx(b_p_tx);
		setB_p_tw(b_p_tw);
		setB_p_tw_nobin(b_p_tw_nobin);
		setB_p_tw_nopaste(b_p_tw_nopaste);
		setB_p_wm(b_p_wm);
		setB_p_wm_nobin(b_p_wm_nobin);
		setB_p_wm_nopaste(b_p_wm_nopaste);
		setB_p_ep(b_p_ep);
		setB_p_path(b_p_path);
		setB_p_ar(b_p_ar);
		setB_p_tags(b_p_tags);
		setB_p_tc(b_p_tc);
		setB_tc_flags(b_tc_flags);
		setB_p_dict(b_p_dict);
		setB_p_tsr(b_p_tsr);
		setB_p_ul(b_p_ul);
		setB_no_eol_lnum(b_no_eol_lnum);
		setB_start_eol(b_start_eol);
		setB_start_ffc(b_start_ffc);
		setB_start_fenc(b_start_fenc);
		setB_bad_char(b_bad_char);
		setB_start_bomb(b_start_bomb);
		setB_may_swap(b_may_swap);
		setB_did_warn(b_did_warn);
		setB_help(b_help);
		setB_shortname(b_shortname);
		setB_mapped_ctrl_c(b_mapped_ctrl_c);
	}
	public file_buffer() {
	}
	
	public file_buffer ins_compl_next_buf(int flag) {
		win_T wp = ((Object)0);
		window_S generatedW_next = wp.getW_next();
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedB_scanned = generatedW_buffer.getB_scanned();
		file_buffer generatedB_next = this.getB_next();
		int generatedB_p_bl = this.getB_p_bl();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		// just windowsif (flag == (byte)'w') {
			if (buf == curbuf || wp == ((Object)0)) {
				wp = ModernizedCProgram.curwin;
			} 
			while ((wp = (generatedW_next != ((Object)0) ? generatedW_next : ModernizedCProgram.firstwin)) != ModernizedCProgram.curwin && generatedB_scanned) {
				;
			}
			buf = generatedW_buffer;
		} else {
				while ((buf = (generatedB_next != ((Object)0) ? generatedB_next : firstbuf)) != curbuf && ((flag == (byte)'U' ? generatedB_p_bl : (!generatedB_p_bl || (generatedMl_mfp == ((Object)0)) != (flag == (byte)'u'))) || generatedB_scanned)) {
					;
				}
		} 
		return buf/*
		 * Execute user defined complete function 'completefunc' or 'omnifunc', and
		 * get matches in "matches".
		 */;
	}
	public  getmark_buf(int c, int changefile) {
		return buf.getmark_buf_fnum(c, changefile, ((Object)0));
	}
	public  getmark_buf_fnum(int c, int changefile, int fnum) {
		pos_T posp = new pos_T();
		pos_T startp = new pos_T();
		pos_T endp = new pos_T();
		pos_T pos_copy = new pos_T();
		posp = ((Object)0);
		if (c < /* Check for special key, can't be a mark name and might cause islower()
		     * to crash. */0) {
			return posp;
		} 
		 generatedB_last_cursor = this.getB_last_cursor();
		 generatedB_last_insert = this.getB_last_insert();
		 generatedB_last_change = this.getB_last_change();
		 generatedB_op_start = this.getB_op_start();
		 generatedB_op_end = this.getB_op_end();
		int generatedInclusive = oa.getInclusive();
		 generatedB_visual = this.getB_visual();
		Object generatedVi_start = generatedB_visual.getVi_start();
		Object generatedVi_end = generatedB_visual.getVi_end();
		Object generatedLnum = (startp).getLnum();
		Object generatedCol = (startp).getCol();
		Object generatedColadd = (startp).getColadd();
		Object generatedVi_mode = generatedB_visual.getVi_mode();
		Object generatedB_namedm = this.getB_namedm();
		int generatedB_fnum = this.getB_fnum();
		if (c > /* check for islower()/isupper() */(byte)'~') {
			;
		}  else if (c == (byte)'\'' || c == /* previous context mark */(byte)'`') {
			pos_copy = ModernizedCProgram.curwin.getW_pcmark();
			posp = /*   w_pcmark may be changed soon */pos_copy;
		}  else if (c == /* to pos when leaving buffer */(byte)'"') {
			posp = (generatedB_last_cursor);
		}  else if (c == /* to where Insert mode stopped */(byte)'^') {
			posp = (generatedB_last_insert);
		}  else if (c == /* to where last change was made */(byte)'.') {
			posp = (generatedB_last_change);
		}  else if (c == /* to start of previous operator */(byte)'[') {
			posp = (generatedB_op_start);
		}  else if (c == /* to end of previous operator */(byte)']') {
			posp = (generatedB_op_end);
		}  else if (c == (byte)'{' || c == /* to previous/next paragraph */(byte)'}') {
			pos_T pos = new pos_T();
			oparg_T oa = new oparg_T();
			int slcb = listcmd_busy;
			pos = ModernizedCProgram.curwin.getW_cursor();
			listcmd_busy = /* avoid that '' is changed */1;
			if (ModernizedCProgram.findpar(generatedInclusive, c == (byte)'}' ? 1 : (true), -1024, (byte)'\000', 0)) {
				pos_copy = ModernizedCProgram.curwin.getW_cursor();
				posp = pos_copy;
			} 
			ModernizedCProgram.curwin.setW_cursor(pos);
			listcmd_busy = slcb;
		}  else if (c == (byte)'(' || c == /* to previous/next sentence */(byte)')') {
			pos_T pos = new pos_T();
			int slcb = listcmd_busy;
			pos = ModernizedCProgram.curwin.getW_cursor();
			listcmd_busy = /* avoid that '' is changed */1;
			if (ModernizedCProgram.findsent(c == (byte)')' ? 1 : (true), -1024)) {
				pos_copy = ModernizedCProgram.curwin.getW_cursor();
				posp = pos_copy;
			} 
			ModernizedCProgram.curwin.setW_cursor(pos);
			listcmd_busy = slcb;
		}  else if (c == (byte)'<' || c == /* start/end of visual area */(byte)'>') {
			startp = generatedVi_start;
			endp = generatedVi_end;
			if (((c == (byte)'<') == ((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) || generatedLnum == 0) && generatedLnum != 0) {
				posp = startp;
			} else {
					posp = endp/*
						 * For Visual line mode, set mark at begin or end of line
						 */;
			} 
			if (generatedVi_mode == (byte)'V') {
				pos_copy = posp;
				posp = pos_copy;
				if (c == (byte)'<') {
					pos_copy.setCol(0);
				} else {
						pos_copy.setCol(INT_MAX);
				} 
				pos_copy.setColadd(0);
			} 
		}  else if (((int)(c) - (byte)'a' < /* normal named mark */26)) {
			posp = (generatedB_namedm[c - (byte)'a']);
		}  else if (((int)(c) - (byte)'A' < 26) || ((int)(c) - (byte)'0' < /* named file mark */10)) {
			if (((int)(c) - (byte)'0' < 10)) {
				c = c - (byte)'0' + ((byte)'z' - (byte)'a' + 1);
			} else {
					c -= (byte)'A';
			} 
			posp = (ModernizedCProgram.namedfm[c].getFmark().getMark());
			if (ModernizedCProgram.namedfm[c].getFmark().getFnum() == 0) {
				ModernizedCProgram.namedfm[c].fname2fnum();
			} 
			if (fnum != ((Object)0)) {
				fnum = ModernizedCProgram.namedfm[c].getFmark().getFnum();
			}  else if (ModernizedCProgram.namedfm[c].getFmark().getFnum() != generatedB_fnum) {
				posp = /* mark is in another file */pos_copy;
				if (generatedLnum != 0 && changefile && ModernizedCProgram.namedfm[c].getFmark().getFnum()) {
					if (ModernizedCProgram.buflist_getfile(ModernizedCProgram.namedfm[c].getFmark().getFnum(), (linenr_T)1, -1024, 0) == 1) {
						ModernizedCProgram.curwin.setW_cursor(ModernizedCProgram.namedfm[c].getFmark().getMark());
						return (pos_T)-1;
					} 
					pos_copy.setLnum(-/* can't get file */1);
				} else {
						pos_copy.setLnum(/* mark exists, but is not valid in
											   current buffer */0);
				} 
			} 
		} 
		return posp/*
		 * Search for the next named mark in the current file.
		 *
		 * Returns pointer to pos_T of the next mark or NULL if no mark is found.
		 */;
	}
	public void fmarks_check_names() {
		char_u name = new char_u();
		int i;
		win_T wp = new win_T();
		Object generatedB_ffname = this.getB_ffname();
		if (generatedB_ffname == ((Object)0)) {
			return ;
		} 
		name = buf.home_replace_save(generatedB_ffname);
		if (name == ((Object)0)) {
			return ;
		} 
		for (i = 0; i < ((byte)'z' - (byte)'a' + 1) + 10; ++i) {
			ModernizedCProgram.fmarks_check_one(ModernizedCProgram.namedfm[i], name, buf);
		}
		Object generatedW_jumplistlen = wp.getW_jumplistlen();
		Object generatedW_jumplist = wp.getW_jumplist();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			for (i = 0; i < generatedW_jumplistlen; ++i) {
				ModernizedCProgram.fmarks_check_one(generatedW_jumplist[i], name, buf);
			}
		}
		ModernizedCProgram.vim_free(name);
	}
	public void clrallmarks() {
		int i = -1;
		if (i == -/* first call ever: initialize */1) {
			for (i = 0; i < ((byte)'z' - (byte)'a' + 1) + 1; i++) {
				ModernizedCProgram.namedfm[i].getFmark().getMark().setLnum(0);
				ModernizedCProgram.namedfm[i].setFname(((Object)0));
				ModernizedCProgram.namedfm[i].setTime_set(0);
			}
		} 
		Object generatedB_namedm = this.getB_namedm();
		for (i = 0; i < ((byte)'z' - (byte)'a' + 1); i++) {
			generatedB_namedm[i].setLnum(0);
		}
		 generatedB_op_start = this.getB_op_start();
		generatedB_op_start.setLnum(/* start/end op mark cleared */0);
		 generatedB_op_end = this.getB_op_end();
		generatedB_op_end.setLnum(0);
		 generatedB_last_cursor = this.getB_last_cursor();
		generatedB_last_cursor.setLnum(/* '" mark cleared */1);
		generatedB_last_cursor.setCol(0);
		generatedB_last_cursor.setColadd(0);
		 generatedB_last_insert = this.getB_last_insert();
		generatedB_last_insert.setLnum(/* '^ mark cleared */0);
		 generatedB_last_change = this.getB_last_change();
		generatedB_last_change.setLnum(/* '. mark cleared */0);
		this.setB_changelistlen(0/*
		 * Get name of file from a filemark.
		 * When it's in the current buffer, return the text at the mark.
		 * Returns an allocated string.
		 */);
	}
	public void check_status() {
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedW_status_height = wp.getW_status_height();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_buffer == buf && generatedW_status_height) {
				wp.setW_redr_status(1);
				if (must_redraw < 10) {
					must_redraw = 10/*
					 * Ask for a reply from the user, a 'y' or a 'n'.
					 * No other characters are accepted, the message is repeated until a valid
					 * reply is entered or CTRL-C is hit.
					 * If direct is TRUE, don't use vgetc() but ui_inchar(), don't get characters
					 * from any buffers but directly from the user.
					 *
					 * return the 'y' or 'n'
					 */;
				} 
			} 
		}
	}
	public int find_prop_type_id(Object name) {
		proptype_S proptype_S = new proptype_S();
		proptype_T pt = proptype_S.find_prop(name, buf);
		if (pt == ((Object)0)) {
			return 0;
		} 
		int generatedPt_id = pt.getPt_id();
		return generatedPt_id;
	}
	public int get_text_props(Object lnum, Object props, int will_change) {
		char_u text = new char_u();
		size_t textlen = new size_t();
		size_t proplen = new size_t();
		// Be quick when no text property types have been defined or the buffer,
		Object generatedB_has_textprop = this.getB_has_textprop();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		// unless we are adding one.if ((!generatedB_has_textprop && !will_change) || generatedMl_mfp == ((Object)0)) {
			return 0;
		} 
		// Fetch the line to get the ml_line_len field updated.// Fetch the line to get the ml_line_len field updated.text = buf.ml_get_buf(lnum, will_change);
		textlen = .strlen((byte)(text)) + 1;
		Object generatedMl_line_len = generatedB_ml.getMl_line_len();
		proplen = generatedMl_line_len - textlen;
		if (proplen %  != 0) {
			ModernizedCProgram.iemsg(((byte)("E967: text property info corrupted")));
			return 0;
		} 
		if (proplen > 0) {
			props = text + textlen;
		} 
		return (int)(proplen / /*
		 * Find text property "type_id" in the visible lines of window "wp".
		 * Match "id" when it is > 0.
		 * Returns FAIL when not found.
		 */);
	}
	/*
	 * Free all property types for "buf".
	 */
	public void clear_buf_prop_types() {
		Object generatedB_proptypes = this.getB_proptypes();
		generatedB_proptypes.clear_ht_prop_types();
		this.setB_proptypes(((Object)0/*
		 * Adjust the columns of text properties in line "lnum" after position "col" to
		 * shift by "bytes_added" (can be negative).
		 * Note that "col" is zero-based, while tp_col is one-based.
		 * Only for the current buffer.
		 * "flags" can have:
		 * APC_SAVE_FOR_UNDO:	Call u_savesub() before making changes to the line.
		 * APC_SUBSTITUTE:	Text is replaced, not inserted.
		 * Caller is expected to check b_has_textprop and "bytes_added" being non-zero.
		 * Returns TRUE when props were changed.
		 */));
	}
	public int mb_get_class_buf(Object p) {
		if (ModernizedCProgram.mb_bytelen_tab[p[0]] == 1) {
			if (p[0] == (byte)'\000' || ((p[0]) == (byte)' ' || (p[0]) == (byte)'\t')) {
				return 0;
			} 
			if (buf.vim_iswordc_buf(p[0])) {
				return 2;
			} 
			return 1;
		} 
		if (enc_dbcs != 0 && p[0] != (byte)'\000' && p[1] != (byte)'\000') {
			return ModernizedCProgram.dbcs_class(p[0], p[1]);
		} 
		if (enc_utf8) {
			return buf.utf_class_buf(ModernizedCProgram.utf_ptr2char(p));
		} 
		return 0/*
		 * Get class of a double-byte character.  This always returns 3 or bigger.
		 * TODO: Should return 1 for punctuation.
		 */;
	}
	public int utf_class_buf(int c) {
		/* sorted list of non-overlapping intervals */Object[] classes = new Object[]{{-1024, -1024, /* Greek question mark */1}, {-1024, -1024, /* Greek ano teleia */1}, {-1024, -1024, /* Armenian punctuation */1}, {-1024, -1024, /* Armenian full stop */1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, /* Syriac punctuation */1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, /* Myanmar punctuation */1}, {-1024, -1024, /* Georgian punctuation */1}, {-1024, -1024, /* Ethiopic punctuation */1}, {-1024, -1024, /* Canadian Syl. punctuation */1}, {-1024, -1024, 0}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, /* Khmer punctuation */1}, {-1024, -1024, /* Mongolian punctuation */1}, {-1024, -1024, /* spaces */0}, {-1024, -1024, /* punctuation and symbols */1}, {-1024, -1024, 0}, {-1024, -1024, /* punctuation and symbols */1}, {-1024, -1024, 0}, {-1024, -1024, /* punctuation and symbols */1}, {-1024, -1024, 0}, {-1024, -1024, /* punctuation and symbols */1}, {-1024, -1024, /* superscript */-1024}, {-1024, -1024, /* subscript */-1024}, {-1024, -1024, /* all kinds of symbols */1}, {-1024, -1024, /* braille */-1024}, {-1024, -1024, /* arrows, brackets, etc. */1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, /* supplemental punctuation */1}, {-1024, -1024, /* ideographic space */0}, {-1024, -1024, /* ideographic punctuation */1}, {-1024, -1024, 1}, {-1024, -1024, 1}, {-1024, -1024, /* Hiragana */-1024}, {-1024, -1024, /* Katakana */-1024}, {-1024, -1024, /* CJK Ideographs */-1024}, {-1024, -1024, /* Hangul Syllables */-1024}, {-1024, -1024, /* CJK Ideographs */-1024}, {-1024, -1024, 1}, {-1024, -1024, /* punctuation forms */1}, {-1024, -1024, /* half/fullwidth ASCII */1}, {-1024, -1024, /* half/fullwidth ASCII */1}, {-1024, -1024, /* half/fullwidth ASCII */1}, {-1024, -1024, /* half/fullwidth ASCII */1}, {-1024, -1024, /* Musical notation */1}, {-1024, -1024, /* Mathematical Alphanumeric Symbols */1}, {-1024, -1024, /* Game pieces; enclosed characters */1}, {-1024, -1024, /* Many symbol blocks */1}, {-1024, -1024, /* CJK Ideographs */-1024}, {-1024, -1024, /* CJK Ideographs */-1024}, {-1024, -1024, /* CJK Ideographs */-1024}, {-1024, -1024, /* CJK Ideographs */-1024}};
		int bot = 0;
		int top =  /  - 1;
		int mid;
		if (c < /* First quick check for Latin1 characters, use 'iskeyword'. */-1024) {
			if (c == (byte)' ' || c == (byte)'\t' || c == (byte)'\000' || c == -1024) {
				return /* blank */0;
			} 
			if (buf.vim_iswordc_buf(c)) {
				return /* word character */2;
			} 
			return /* punctuation */1;
		} 
		while (top >= /* binary search in table */bot) {
			mid = (bot + top) / 2;
			if (classes[mid].getLast() < (int)c) {
				bot = mid + 1;
			}  else if (classes[mid].getFirst() > (int)c) {
				top = mid - 1;
			} else {
					return (int)classes[mid].getClass();
			} 
		}
		if (ModernizedCProgram.emoji_all.intable(, /* emoji */c)) {
			return 3;
		} 
		return /* most other characters are "word" characters */2;
	}
	public int buf_init_chartab(int global) {
		/* FALSE: only set buf->b_chartab[] */int c;
		int c2;
		char_u p = new char_u();
		int i;
		int tilde;
		int do_isalpha;
		if (global/*
			 * Set the default size for printable characters:
			 * From <Space> to '~' is 1 (printable), others are 2 (not printable).
			 * This also inits all 'isident' and 'isfname' flags to FALSE.
			 *
			 * EBCDIC: all chars below ' ' are not printable, all others are
			 * printable.
			 */) {
			c = 0;
			while (c < (byte)' ') {
				ModernizedCProgram.g_chartab[c++] = (ModernizedCProgram.dy_flags & -1024) ? 4 : 2;
			}
			while (c <= (byte)'~') {
				ModernizedCProgram.g_chartab[c++] = 1 + -1024;
			}
			while (c < 256) {
				if (enc_utf8 && c >= /* UTF-8: bytes 0xa0 - 0xff are printable (latin1) */-1024) {
					ModernizedCProgram.g_chartab[c++] = -1024 + 1;
				}  else if (enc_dbcs == 9932 && c == /* euc-jp characters starting with 0x8e are single width */-1024) {
					ModernizedCProgram.g_chartab[c++] = -1024 + 1;
				}  else if (enc_dbcs != 0 && ModernizedCProgram.mb_bytelen_tab[c] == /* other double-byte chars can be printable AND double-width */2) {
					ModernizedCProgram.g_chartab[c++] = -1024 + 2;
				} else {
						ModernizedCProgram.g_chartab[c++] = (ModernizedCProgram.dy_flags & -1024) ? 4 : /* the rest is unprintable by default */2;
				} 
			}
			for (c = 1; c < 256; ++/* Assume that every multi-byte char is a filename character. */c) {
				if ((enc_dbcs != 0 && ModernizedCProgram.mb_bytelen_tab[c] > 1) || (enc_dbcs == 9932 && c == -1024) || (enc_utf8 && c >= -1024)) {
					ModernizedCProgram.g_chartab[c] |=  -1024;
				} 
			}
		} 
		Object generatedB_chartab = this.getB_chartab();
		.memset((generatedB_chartab), (false), ((size_t)/*
		     * Init word char flags all to FALSE
		     */32));
		if (enc_dbcs != 0) {
			for (c = 0; c < 256; ++c) {
				if (ModernizedCProgram.mb_bytelen_tab[c] == /* double-byte characters are probably word characters */2) {
					generatedB_chartab[(int)(c) >> 3] |=  (1 << ((c) & -1024));
				} 
			}
		} 
		Object generatedB_p_lisp = this.getB_p_lisp();
		if (generatedB_p_lisp) {
			generatedB_chartab[(int)((byte)'-') >> 3] |=  (1 << (((byte)'-') & -1024/* Walk through the 'isident', 'iskeyword', 'isfname' and 'isprint'
			     * options Each option is a list of characters, character numbers or
			     * ranges, separated by commas, e.g.: "200-210,x,#-178,-"
			     */));
		} 
		Object generatedB_p_isk = this.getB_p_isk();
		for (i = global ? 0 : 3; i <= 3; ++i) {
			if (i == 0) {
				p = /* first round: 'isident' */ModernizedCProgram.p_isi;
			}  else if (i == 1) {
				p = /* second round: 'isprint' */ModernizedCProgram.p_isp;
			}  else if (i == 2) {
				p = /* third round: 'isfname' */ModernizedCProgram.p_isf;
			} else {
					p = generatedB_p_isk;
			} 
			while (p) {
				tilde = 0;
				do_isalpha = 0;
				if (p == (byte)'^' && p[1] != (byte)'\000') {
					tilde = 1;
					++p;
				} 
				if (((int)(p) - (byte)'0' < 10)) {
					c = ModernizedCProgram.getdigits(p);
				}  else if (has_mbyte) {
					c = ModernizedCProgram.mb_ptr2char_adv(p);
				} else {
						c = p++;
				} 
				c2 = -1;
				if (p == (byte)'-' && p[1] != (byte)'\000') {
					++p;
					if (((int)(p) - (byte)'0' < 10)) {
						c2 = ModernizedCProgram.getdigits(p);
					}  else if (has_mbyte) {
						c2 = ModernizedCProgram.mb_ptr2char_adv(p);
					} else {
							c2 = p++;
					} 
				} 
				if (c <= 0 || c >= 256 || (c2 < c && c2 != -1) || c2 >= 256 || !(p == (byte)'\000' || p == (byte)',')) {
					return 0;
				} 
				if (c2 == -/* not a range */1/*
						 * A single '@' (not "@-@"):
						 * Decide on letters being ID/printable/keyword chars with
						 * standard function isalpha(). This takes care of locale for
						 * single-byte characters).
						 */) {
					if (c == (byte)'@') {
						do_isalpha = 1;
						c = 1;
						c2 = 255;
					} else {
							c2 = c;
					} 
				} 
				while (c <= c2/* Use the MB_ functions here, because isalpha() doesn't
						 * work properly when 'encoding' is "latin1" and the locale is
						 * "C".  */) {
					if (!do_isalpha || ModernizedCProgram.vim_islower(c) || ModernizedCProgram.vim_isupper(c)) {
						if (i == /* (re)set ID flag */0) {
							if (tilde) {
								ModernizedCProgram.g_chartab[c] &=  ~-1024;
							} else {
									ModernizedCProgram.g_chartab[c] |=  -1024;
							} 
						}  else if (i == /* (re)set printable */1) {
							if ((c < (byte)' ' || c > (byte)'~') && !(enc_dbcs && ModernizedCProgram.mb_bytelen_tab[c] == 2)) {
								if (tilde) {
									ModernizedCProgram.g_chartab[c] = (ModernizedCProgram.g_chartab[c] & ~-1024) + ((ModernizedCProgram.dy_flags & -1024) ? 4 : 2);
									ModernizedCProgram.g_chartab[c] &=  ~-1024;
								} else {
										ModernizedCProgram.g_chartab[c] = (ModernizedCProgram.g_chartab[c] & ~-1024) + 1;
										ModernizedCProgram.g_chartab[c] |=  -1024;
								} 
							} 
						}  else if (i == /* (re)set fname flag */2) {
							if (tilde) {
								ModernizedCProgram.g_chartab[c] &=  ~-1024;
							} else {
									ModernizedCProgram.g_chartab[c] |=  -1024;
							} 
						} else {
								if (/* i == 3 *//* (re)set keyword flag */tilde) {
									generatedB_chartab[(int)(c) >> 3] &=  ~(1 << ((c) & -1024));
								} else {
										generatedB_chartab[(int)(c) >> 3] |=  (1 << ((c) & -1024));
								} 
						} 
					} 
					++c;
				}
				c = p;
				p = ModernizedCProgram.skip_to_option_part(p);
				if (c == (byte)',' && p == (byte)'\000') {
					return /* Trailing comma is not allowed. */0;
				} 
			}
		}
		ModernizedCProgram.chartab_initialized = 1;
		return 1/*
		 * Translate any special characters in buf[bufsize] in-place.
		 * The result is a string with only printable characters, but if there is not
		 * enough room, not all characters will be translated.
		 */;
	}
	public int vim_iswordc_buf(int c) {
		if (c >= -1024) {
			if (enc_dbcs != 0) {
				return ModernizedCProgram.dbcs_class((int)c >> 8, (int)(c & -1024)) >= 2;
			} 
			if (enc_utf8) {
				return buf.utf_class_buf(c) >= 2;
			} 
			return 0;
		} 
		Object generatedB_chartab = (buf).getB_chartab();
		return (c > 0 && (generatedB_chartab[(int)(c) >> 3] & (1 << ((c) & -1024))) != 0/*
		 * Just like vim_iswordc() but uses a pointer to the (multi-byte) character.
		 */);
	}
	public int vim_iswordp_buf(Object p) {
		int c = p;
		if (has_mbyte && ModernizedCProgram.mb_bytelen_tab[c] > 1) {
			c = .UNRECOGNIZEDFUNCTIONNAME(p);
		} 
		return buf/*
		 * return TRUE if 'c' is a valid file-name character
		 * Assume characters above 0x100 are valid (multi-byte).
		 */.vim_iswordc_buf(c);
	}
	public long get_sw_value() {
		return buf.get_sw_value_col(0/*
		 * Idem, using "pos".
		 */);
	}
	public long get_sw_value_indent() {
		pos_T pos = ModernizedCProgram.curwin.getW_cursor();
		pos.setCol(ModernizedCProgram.getwhitecols_curline());
		return ModernizedCProgram.get_sw_value_pos(buf, pos/*
		 * Idem, using virtual column "col".
		 */);
	}
	public long get_sw_value_col(Object col) {
		long generatedB_p_sw = this.getB_p_sw();
		long generatedB_p_ts = this.getB_p_ts();
		Object generatedB_p_vts_array = this.getB_p_vts_array();
		return generatedB_p_sw ? generatedB_p_sw : ModernizedCProgram.tabstop_at(col, generatedB_p_ts, generatedB_p_vts_array);
	}
	/*
	 * Count the size (in window cells) of the indent in line "lnum" of buffer
	 * "buf".
	 */
	public int get_indent_buf(Object lnum) {
		long generatedB_p_ts = curbuf.getB_p_ts();
		Object generatedB_p_vts_array = this.getB_p_vts_array();
		return ModernizedCProgram.get_indent_str_vtab(buf.ml_get_buf(lnum, 0), (int)generatedB_p_ts, generatedB_p_vts_array, 0);
	}
	public void ruby_buffer_free() {
		Object generatedB_ruby_ref = this.getB_ruby_ref();
		if (generatedB_ruby_ref) {
			.rb_hash_aset(ModernizedCProgram.objtbl, .rb_obj_id(()generatedB_ruby_ref), Qnil);
			.RDATA(generatedB_ruby_ref).setData(((Object)0));
		} 
	}
	public Object buffer_new() {
		Object generatedB_ruby_ref = this.getB_ruby_ref();
		if (generatedB_ruby_ref) {
			return ()generatedB_ruby_ref;
		} else {
				 obj = .Data_Wrap_Struct(ModernizedCProgram.cBuffer, 0, 0, buf);
				this.setB_ruby_ref((Object)obj);
				.rb_hash_aset(ModernizedCProgram.objtbl, .rb_obj_id(obj), obj);
				return obj;
		} 
	}
	public file_buffer get_buf(Object obj) {
		buf_T buf = new buf_T();
		.Data_Get_Struct(obj, , buf);
		if (buf == ((Object)0)) {
			.rb_raise(ModernizedCProgram.eDeletedBufferError, "attempt to refer to deleted buffer");
		} 
		return buf;
	}
	public Object get_buffer_line(Object n) {
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (n <= 0 || n > generatedMl_line_count) {
			.rb_raise(rb_eIndexError, "line number %ld out of range", (long)n);
		} 
		return ModernizedCProgram.vim_str2rb_enc_str((byte)buf.ml_get_buf(n, 0));
	}
	public Object set_buffer_line(Object n, Object str) {
		byte line = .STR2CSTR(str);
		aco_save_T aco = new aco_save_T();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (n > 0 && n <= generatedMl_line_count && line != ((Object)0)) {
			ModernizedCProgram.aucmd_prepbuf(aco, /* set curwin/curbuf for "buf" and save some things */buf);
			if (ModernizedCProgram.u_savesub(n) == 1) {
				ModernizedCProgram.ml_replace(n, (char_u)line, 1);
				ModernizedCProgram.changed();
			} 
			/* restore curwin/curbuf and a few other things */aco/* Careful: autocommands may have made "buf" invalid! */.aucmd_restbuf();
			ModernizedCProgram.update_curbuf(40);
		} else {
				.rb_raise(rb_eIndexError, "line number %ld out of range", (long)n);
		} 
		return str;
	}
	public void python3_buffer_free() {
		Object generatedB_python3_ref = this.getB_python3_ref();
		if (generatedB_python3_ref != ((Object)0)) {
			BufferObject bp = generatedB_python3_ref;
			bp.setBuf(((buf_T)(true)));
			this.setB_python3_ref(((Object)0));
		} 
	}
	public int check_recorded_changes(Object lnum, Object lnume, long xtra) {
		Object generatedB_recorded_changes = this.getB_recorded_changes();
		 generatedLi_tv = li.getLi_tv();
		Object generatedVval = generatedLi_tv.getVval();
		listitem_S generatedLi_next = li.getLi_next();
		if (generatedB_recorded_changes != ((Object)0) && xtra != 0) {
			listitem_T li = new listitem_T();
			linenr_T prev_lnum = new linenr_T();
			linenr_T prev_lnume = new linenr_T();
			for (li = generatedB_recorded_changes.getLv_first(); li != ((Object)0); li = generatedLi_next) {
				ModernizedCProgram.prev_lnum = (linenr_T)generatedVval.getV_dict().dict_get_number((char_u)"lnum");
				prev_lnume = (linenr_T)generatedVval.getV_dict().dict_get_number((char_u)"end");
				if (ModernizedCProgram.prev_lnum >= lnum || ModernizedCProgram.prev_lnum > lnume || prev_lnume >= lnum) {
					curbuf.invoke_listeners();
					break;
				} 
			}
		} 
		return 0/*
		 * Record a change for listeners added with listener_add().
		 * Always for the current buffer.
		 */;
	}
	public void may_invoke_listeners(Object lnum, Object lnume, int added) {
		buf.check_recorded_changes(lnum, lnume, added/*
		 * Called when a sequence of changes is done: invoke listeners added with
		 * listener_add().
		 */);
	}
	public void invoke_listeners() {
		listener_T lnr = new listener_T();
		typval_T rettv = new typval_T();
		typval_T[] argv = new typval_T();
		listitem_T li = new listitem_T();
		linenr_T start = LONG_MAX;
		linenr_T end = 0;
		linenr_T added = 0;
		int save_updating_screen = updating_screen;
		int recursive = 0;
		Object generatedB_recorded_changes = this.getB_recorded_changes();
		Object generatedB_listener = this.getB_listener();
		// nothing changedif (generatedB_recorded_changes == ((Object)0) || generatedB_listener == ((Object)0) || recursive) {
			return ;
		} 
		recursive = 1// Block messages on channels from being handled, so that they don't make;// Block messages on channels from being handled, so that they don't make
		// text changes here.// text changes here.++updating_screen;
		argv[0].setV_type(.VAR_NUMBER);
		int generatedB_fnum = this.getB_fnum();
		// a:bufnr// a:bufnrargv[0].getVval().setV_number(generatedB_fnum);
		 generatedLi_tv = li.getLi_tv();
		Object generatedVval = generatedLi_tv.getVval();
		listitem_S generatedLi_next = li.getLi_next();
		for (li = generatedB_recorded_changes.getLv_first(); li != ((Object)0); li = generatedLi_next) {
			varnumber_T lnum = new varnumber_T();
			lnum = generatedVval.getV_dict().dict_get_number((char_u)"lnum");
			if (start > lnum) {
				start = lnum;
			} 
			lnum = generatedVval.getV_dict().dict_get_number((char_u)"end");
			if (lnum > end) {
				end = lnum;
			} 
			added = generatedVval.getV_dict().dict_get_number((char_u)"added");
		}
		argv[1].setV_type(.VAR_NUMBER);
		generatedVval.setV_number(start);
		argv[2].setV_type(.VAR_NUMBER);
		generatedVval.setV_number(end);
		argv[3].setV_type(.VAR_NUMBER);
		generatedVval.setV_number(added);
		argv[4].setV_type(.VAR_LIST);
		generatedVval.setV_list(generatedB_recorded_changes);
		++textlock;
		Object generatedLr_callback = lnr.getLr_callback();
		Object generatedLr_next = lnr.getLr_next();
		for (lnr = generatedB_listener; lnr != ((Object)0); lnr = generatedLr_next) {
			generatedLr_callback.call_callback(-1, rettv, 5, argv);
			rettv.clear_tv();
		}
		--textlock;
		generatedB_recorded_changes.list_unref();
		this.setB_recorded_changes(((Object)0));
		if (save_updating_screen) {
			updating_screen = 1;
		} else {
				ModernizedCProgram.after_updating_screen(1);
		} 
		recursive = 0/*
		 * Remove all listeners associated with "buf".
		 */;
	}
	public void remove_listeners() {
		listener_T lnr = new listener_T();
		listener_T next = new listener_T();
		Object generatedLr_next = lnr.getLr_next();
		Object generatedLr_callback = lnr.getLr_callback();
		Object generatedB_listener = this.getB_listener();
		for (lnr = generatedB_listener; lnr != ((Object)0); lnr = next) {
			next = generatedLr_next;
			generatedLr_callback.free_callback();
			ModernizedCProgram.vim_free(lnr);
		}
		this.setB_listener(((Object)0/*
		 * Common code for when a change was made.
		 * See changed_lines() for the arguments.
		 * Careful: may trigger autocommands that reload the buffer.
		 */));
	}
	public void changedOneline(Object lnum) {
		int generatedB_mod_set = this.getB_mod_set();
		Object generatedB_mod_top = this.getB_mod_top();
		Object generatedB_mod_bot = this.getB_mod_bot();
		if (generatedB_mod_set) {
			if (lnum < generatedB_mod_top) {
				this.setB_mod_top(lnum);
			}  else if (lnum >= generatedB_mod_bot) {
				this.setB_mod_bot(lnum + 1);
			} 
		} else {
				this.setB_mod_set(1);
				this.setB_mod_top(lnum);
				this.setB_mod_bot(lnum + 1);
				this.setB_mod_xlines(0/*
				 * Changed bytes within a single line for the current buffer.
				 * - marks the windows on this buffer to be redisplayed
				 * - marks the buffer changed by calling changed()
				 * - invalidates cached values
				 * Careful: may trigger autocommands that reload the buffer.
				 */);
		} 
	}
	public void changed_lines_buf(Object lnum, Object lnume, long xtra) {
		int generatedB_mod_set = this.getB_mod_set();
		Object generatedB_mod_top = this.getB_mod_top();
		Object generatedB_mod_bot = this.getB_mod_bot();
		long generatedB_mod_xlines = this.getB_mod_xlines();
		// line below last changed line// number of extra lines (negative when deleting)if (generatedB_mod_set) {
			if (lnum < generatedB_mod_top) {
				this.setB_mod_top(lnum);
			} 
			if (lnum < generatedB_mod_bot) {
				generatedB_mod_bot += xtra;
				if (generatedB_mod_bot < lnum) {
					this.setB_mod_bot(lnum);
				} 
			} 
			if (lnume + xtra > generatedB_mod_bot) {
				this.setB_mod_bot(lnume + xtra);
			} 
			generatedB_mod_xlines += xtra;
		} else {
				this.setB_mod_set(1);
				this.setB_mod_top(lnum);
				this.setB_mod_bot(lnume + xtra);
				this.setB_mod_xlines(xtra/*
				 * Changed lines for the current buffer.
				 * Must be called AFTER the change and after mark_adjust().
				 * - mark the buffer changed by calling changed()
				 * - mark the windows on this buffer to be redisplayed
				 * - invalidate cached values
				 * "lnum" is the first line that needs displaying, "lnume" the first line
				 * below the changed lines (BEFORE the change).
				 * When only inserting lines, "lnum" and "lnume" are equal.
				 * Takes care of calling changed() and updating b_mod_*.
				 * Careful: may trigger autocommands that reload the buffer.
				 */);
		} 
	}
	// first line with change
	public void unchanged(int ff, int always_inc_changedtick) {
		int generatedB_changed = this.getB_changed();
		dictitem16_S generatedB_ct_di = (buf).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		if (generatedB_changed || (ff && buf.file_ff_differs(0))) {
			this.setB_changed(0);
			buf.ml_setflags();
			if (ff) {
				buf.save_file_ff();
			} 
			buf.check_status();
			redraw_tabline = 1;
			need_maketitle = 1;
			++(generatedVval.getV_number());
		}  else if (always_inc_changedtick) {
			++(generatedVval.getV_number());
		} 
	}
	/* External interface
	 */
	public void python_buffer_free() {
		Object generatedB_python_ref = this.getB_python_ref();
		if (generatedB_python_ref != ((Object)0)) {
			BufferObject bp = generatedB_python_ref;
			bp.setBuf(((buf_T)(true)));
			this.setB_python_ref(((Object)0));
		} 
	}
	public file_buffer open_spellbuf() {
		buf_T buf = new buf_T();
		buf = (buf_T)ModernizedCProgram.alloc_clear();
		if (buf != ((Object)0)) {
			buf.setB_spell(1);
			buf.setB_p_swf(/* may create a swap file */1);
			buf.setB_p_key(empty_option);
			buf.ml_open();
			/* create swap file now */buf.ml_open_file();
		} 
		return buf/*
		 * Close the buffer used for spell info.
		 */;
	}
	public void close_spellbuf() {
		if (buf != ((Object)0)) {
			buf.ml_close(1);
			ModernizedCProgram.vim_free(buf/*
			 * Init the chartab used for spelling for ASCII.
			 * EBCDIC is not supported!
			 */);
		} 
	}
	public void home_replace(Object src, Object dst, int dstlen, int one) {
		// maximum length of the result// if TRUE, only replace one file name, include// spaces and commas in the file name.size_t dirlen = 0;
		size_t envlen = 0;
		size_t len = new size_t();
		char_u homedir_env = new char_u();
		char_u homedir_env_orig = new char_u();
		char_u p = new char_u();
		if (src == ((Object)0)) {
			dst = (byte)'\000';
			return ;
		} 
		int generatedB_help = this.getB_help();
		if (buf != ((Object)0) && generatedB_help) {
			ModernizedCProgram.vim_snprintf((byte)dst, dstlen, "%s", ModernizedCProgram.gettail(src));
			return ;
		} 
		if (ModernizedCProgram.homedir != ((Object)0)) {
			dirlen = .strlen((byte)(ModernizedCProgram.homedir));
		} 
		homedir_env_orig = homedir_env = (char_u).getenv((byte)((char_u)"HOME"));
		if (homedir_env == ((Object)0)) {
			homedir_env_orig = homedir_env = (char_u).getenv((byte)((char_u)"USERPROFILE"));
		} 
		// Empty is the same as not set.if (homedir_env != ((Object)0) && homedir_env == (byte)'\000') {
			homedir_env = ((Object)0);
		} 
		if (homedir_env != ((Object)0) && homedir_env == (byte)'~') {
			int usedlen = 0;
			int flen;
			char_u fbuf = ((Object)0);
			flen = (int).strlen((byte)(homedir_env));
			(Object)ModernizedCProgram.modify_fname((char_u)":p", 0, usedlen, homedir_env, fbuf, flen);
			flen = (int).strlen((byte)(homedir_env));
			if (flen > 0 && ModernizedCProgram.vim_ispathsep(homedir_env[flen - 1])) {
				homedir_env[flen - 1] = (byte)'\000';
			} 
		} 
		if (homedir_env != ((Object)0)) {
			envlen = .strlen((byte)(homedir_env));
		} 
		if (!one) {
			src = ModernizedCProgram.skipwhite(src);
		} 
		while (src && dstlen > 0/*
			 * Here we are at the beginning of a file name.
			 * First, check to see if the beginning of the file name matches
			 * $HOME or the "real" home directory. Check that there is a '/'
			 * after the match (so that if e.g. the file is "/home/pieter/bla",
			 * and the home directory is "/home/piet", the file does not end up
			 * as "~er/bla" (which would seem to indicate the file "bla" in user
			 * er's home directory)).
			 */) {
			p = ModernizedCProgram.homedir;
			len = dirlen;
			for (; ; ) {
				if (len && ModernizedCProgram.vim_fnamencmp((char_u)(src), (char_u)(p), (size_t)(len)) == 0 && (ModernizedCProgram.vim_ispathsep(src[len]) || (!one && (src[len] == (byte)',' || src[len] == (byte)' ')) || src[len] == (byte)'\000')) {
					src += len;
					if (--dstlen > 0) {
						dst++ = (byte)'~'/*
								 * If it's just the home directory, add  "/".
								 */;
					} 
					if (!ModernizedCProgram.vim_ispathsep(src[0]) && --dstlen > 0) {
						dst++ = (byte)'/';
					} 
					break;
				} 
				if (p == homedir_env) {
					break;
				} 
				p = homedir_env;
				len = envlen;
			}
			while (src && (one || (src != (byte)',' && src != (byte)' ')) && --dstlen > 0) {
				dst++ = src++;
			}
			while ((src == (byte)' ' || src == (byte)',') && --dstlen > 0) {
				dst++ = src++;
			}
		}
		dst = (byte)'\000';
		if (homedir_env != homedir_env_orig) {
			ModernizedCProgram.vim_free(homedir_env/*
			 * Like home_replace, store the replaced string in allocated memory.
			 * When something fails, NULL is returned.
			 */);
		} 
	}
	// when not NULL, check for help files
	// input file name
	// where to put the result
	public Object home_replace_save(Object src) {
		// input file namechar_u dst = new char_u();
		int len;
		// space for "~/" and trailing NUL// space for "~/" and trailing NULlen = 3;
		// just in caseif (src != ((Object)0)) {
			len += (int).strlen((byte)(src));
		} 
		dst = ModernizedCProgram.alloc(len);
		if (dst != ((Object)0)) {
			buf.home_replace(src, dst, len, 1);
		} 
		return dst/*
		 * Compare two file names and return:
		 * FPC_SAME   if they both exist and are the same file.
		 * FPC_SAMEX  if they both don't exist and have the same file name.
		 * FPC_DIFF   if they both exist and are different files.
		 * FPC_NOTX   if they both don't exist.
		 * FPC_DIFFX  if one of them doesn't exist.
		 * For the first name environment variables are expanded if "expandenv" is
		 * TRUE.
		 */;
	}
	// when not NULL, check for help files
	/*
	 * Get the crypt method for buffer "buf" as a number.
	 */
	public int crypt_get_method_nr() {
		Object generatedB_p_cm = this.getB_p_cm();
		return ModernizedCProgram.crypt_method_nr_from_name(generatedB_p_cm == (byte)'\000' ? p_cm : generatedB_p_cm);
	}
	public void crypt_set_cm_option(int method_nr) {
		Object generatedB_p_cm = this.getB_p_cm();
		ModernizedCProgram.free_string_option(generatedB_p_cm);
		this.setB_p_cm(ModernizedCProgram.vim_strsave((char_u)ModernizedCProgram.cryptmethods[method_nr].getName()));
	}
	public void crypt_append_msg() {
		Object generatedB_p_cm = this.getB_p_cm();
		if (buf.crypt_get_method_nr() == 0) {
			.strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[crypted]"))));
		} else {
				.strcat((byte)(ModernizedCProgram.IObuff), (byte)("["));
				.strcat((byte)(ModernizedCProgram.IObuff), (byte)(generatedB_p_cm == (byte)'\000' ? p_cm : generatedB_p_cm));
				.strcat((byte)(ModernizedCProgram.IObuff), (byte)("]"/* FEAT_CRYPT */));
		} 
	}
	public void map_clear_int(int mode, int local, int abbr) {
		// TRUE for buffer-local mappings// TRUE for abbreviationsmapblock_T mp = new mapblock_T();
		mapblock_T mpp = new mapblock_T();
		int hash;
		int new_hash;
		ModernizedCProgram.validate_maphash();
		mapblock generatedB_first_abbr = this.getB_first_abbr();
		Object generatedB_maphash = this.getB_maphash();
		int generatedM_mode = mp.getM_mode();
		Object generatedM_keys = mp.getM_keys();
		mapblock generatedM_next = mp.getM_next();
		for (hash = 0; hash < 256; ++hash) {
			if (abbr) {
				if (hash > 0) {
					break;
				} 
				if (local) {
					mpp = generatedB_first_abbr;
				} else {
						mpp = ModernizedCProgram.first_abbr;
				} 
			} else {
					if (local) {
						mpp = generatedB_maphash[hash];
					} else {
							mpp = ModernizedCProgram.maphash[hash];
					} 
			} 
			while (mpp != ((Object)0)) {
				mp = mpp;
				if (generatedM_mode & mode) {
					generatedM_mode &=  ~mode;
					if (generatedM_mode == 0) {
						mpp.map_free();
						continue;
					} 
					new_hash = (((generatedM_mode) & (-1024 + -1024 + -1024 + -1024 + -1024)) ? (generatedM_keys[0]) : ((generatedM_keys[0]) ^ -1024));
					if (!abbr && new_hash != hash) {
						mpp = generatedM_next;
						if (local) {
							mp.setM_next(generatedB_maphash[new_hash]);
							generatedB_maphash[new_hash] = mp;
						} else {
								mp.setM_next(ModernizedCProgram.maphash[new_hash]);
								ModernizedCProgram.maphash[new_hash] = mp;
						} 
						continue;
					} 
				} 
				mpp = (generatedM_next);
			}
		}
	}
	// buffer for local mappings
	// mode in which to delete
	public file_buffer buflist_find_by_name(Object name, int curtab_only) {
		int save_magic;
		char_u save_cpo = new char_u();
		buf_T buf = new buf_T();
		// Ignore 'magic' and 'cpoptions' here to make scripts portable// Ignore 'magic' and 'cpoptions' here to make scripts portablesave_magic = ModernizedCProgram.p_magic;
		ModernizedCProgram.p_magic = 1;
		save_cpo = ModernizedCProgram.p_cpo;
		ModernizedCProgram.p_cpo = (char_u)"";
		file_buffer file_buffer = new file_buffer();
		buf = file_buffer.buflist_findnr(ModernizedCProgram.buflist_findpat(name, name + .strlen((byte)(name)), 1, 0, curtab_only));
		ModernizedCProgram.p_magic = save_magic;
		ModernizedCProgram.p_cpo = save_cpo;
		return buf/*
		 * Find a buffer by number or exact name.
		 */;
	}
	public file_buffer find_buffer( avar) {
		buf_T buf = ((Object)0);
		Object generatedV_type = avar.getV_type();
		Object generatedVval = avar.getVval();
		file_buffer file_buffer = new file_buffer();
		file_buffer file_buffer = new file_buffer();
		Object generatedB_fname = buf.getB_fname();
		file_buffer generatedB_next = buf.getB_next();
		if (generatedV_type == .VAR_NUMBER) {
			buf = file_buffer.buflist_findnr((int)generatedVval.getV_number());
		}  else if (generatedV_type == .VAR_STRING && generatedVval.getV_string() != ((Object)0)) {
			buf = file_buffer.buflist_findname_exp(generatedVval.getV_string());
			if (buf == ((Object)0)) {
				for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
					if (generatedB_fname != ((Object)0) && (ModernizedCProgram.path_with_url(generatedB_fname) || buf.bt_nofilename()) && .strcmp((byte)(generatedB_fname), (byte)(generatedVval.getV_string())) == 0) {
						break;
					} 
				}
			} 
		} 
		return buf/*
		 * If there is a window for "curbuf", make it the current window.
		 */;
	}
	// Only matters for a prompt window.
	// When leaving a prompt window stop Insert mode and perhaps restart
	// it when entering that window again.
	/* unshow mode later */
	// When leaving the window (or closing the window) was done from a
	// callback we need to break out of the Insert mode loop and restart Insert
	// mode when entering the window again.
	// Only matters for a prompt window.
	// When switching to a prompt buffer that was in Insert mode, don't stop
	// Insert mode, it may have been set in leaving_window().
	// When entering the prompt window restart Insert mode if we were in Insert
	// mode when we left it.
	/*
	 * Close all windows for buffer "buf".
	 */
	public void close_windows(int keep_curwin) {
		/* don't close "curwin" */win_T wp = new win_T();
		tabpage_T tp = new tabpage_T();
		tabpage_T nexttp = new tabpage_T();
		int h = ModernizedCProgram.tabline_height();
		int count = ((Object)0).tabpage_index();
		++RedrawingDisabled;
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedW_closing = wp.getW_closing();
		int generatedB_locked = generatedW_buffer.getB_locked();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0) && !(ModernizedCProgram.firstwin == ModernizedCProgram.lastwin); ) {
			if (generatedW_buffer == buf && (!keep_curwin || wp != ModernizedCProgram.curwin) && !(generatedW_closing || generatedB_locked > 0)) {
				if (wp.win_close(0) == 0/* If closing the window fails give up, to avoid looping
						 * forever. */) {
					break;
				} 
				wp = /* Start all over, autocommands may change the window layout. */ModernizedCProgram.firstwin;
			} else {
					wp = generatedW_next;
			} 
		}
		tabpage_S generatedTp_next = tp.getTp_next();
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = /* Also check windows in other tab pages. */nexttp) {
			nexttp = generatedTp_next;
			if (tp != ModernizedCProgram.curtab) {
				for (wp = generatedTp_firstwin; wp != ((Object)0); wp = generatedW_next) {
					if (generatedW_buffer == buf && !(generatedW_closing || generatedB_locked > 0)) {
						ModernizedCProgram.win_close_othertab(wp, 0, tp);
						nexttp = /* Start all over, the tab page may be closed and
								     * autocommands may change the window layout. */ModernizedCProgram.first_tabpage;
						break;
					} 
				}
			} 
		}
		--RedrawingDisabled;
		if (count != ((Object)0).tabpage_index()) {
			curbuf.apply_autocmds(auto_event.EVENT_TABCLOSED, ((Object)0), ((Object)0), 0);
		} 
		redraw_tabline = 1;
		if (h != ModernizedCProgram.tabline_height()) {
			ModernizedCProgram.shell_new_rows();
		} 
	}
	public int leave_tabpage(int trigger_leave_autocmds) {
		tabpage_T tp = ModernizedCProgram.curtab;
		ModernizedCProgram.reset_VIsual_and_resel();
		if (trigger_leave_autocmds) {
			if (new_curbuf != curbuf) {
				curbuf.apply_autocmds(auto_event.EVENT_BUFLEAVE, ((Object)0), ((Object)0), 0);
				if (ModernizedCProgram.curtab != tp) {
					return 0;
				} 
			} 
			curbuf.apply_autocmds(auto_event.EVENT_WINLEAVE, ((Object)0), ((Object)0), 0);
			if (ModernizedCProgram.curtab != tp) {
				return 0;
			} 
			curbuf.apply_autocmds(auto_event.EVENT_TABLEAVE, ((Object)0), ((Object)0), 0);
			if (ModernizedCProgram.curtab != tp) {
				return 0/* Remove the scrollbars.  They may be added back later. */;
			} 
		} 
		tp.setTp_curwin(ModernizedCProgram.curwin);
		tp.setTp_prevwin(prevwin);
		tp.setTp_firstwin(ModernizedCProgram.firstwin);
		tp.setTp_lastwin(ModernizedCProgram.lastwin);
		tp.setTp_old_Rows(ModernizedCProgram.Rows);
		tp.setTp_old_Columns(Columns);
		ModernizedCProgram.firstwin = ((Object)0);
		ModernizedCProgram.lastwin = ((Object)0);
		return 1/*
		 * Start using tab page "tp".
		 * Only to be used after leave_tabpage() or freeing the current tab page.
		 * Only trigger *Enter autocommands when trigger_enter_autocmds is TRUE.
		 * Only trigger *Leave autocommands when trigger_leave_autocmds is TRUE.
		 */;
	}
	/* what is going to be the new curbuf,
					       NULL if unknown */
	public int ml_open() {
		memfile_T mfp = new memfile_T();
		bhdr_T hp = ((Object)0);
		ZERO_BL b0p = new ZERO_BL();
		PTR_BL pp = new PTR_BL();
		DATA_BL dp = new DATA_BL();
		/*
		     * init fields in memline struct
		     */
		memline generatedB_ml = this.getB_ml();
		generatedB_ml.setMl_stack_size(/* no stack yet */0);
		generatedB_ml.setMl_stack(((Object)/* no stack yet */0));
		generatedB_ml.setMl_stack_top(/* nothing in the stack */0);
		generatedB_ml.setMl_locked(((Object)/* no cached block */0));
		generatedB_ml.setMl_line_lnum(/* no cached line */0);
		generatedB_ml.setMl_chunksize(((Object)0));
		if (ModernizedCProgram.cmdmod.getNoswapfile()) {
			this.setB_p_swf(0/*
			     * When 'updatecount' is non-zero swap file may be opened later.
			     */);
		} 
		int generatedB_p_swf = this.getB_p_swf();
		if (ModernizedCProgram.p_uc && generatedB_p_swf) {
			this.setB_may_swap(1);
		} else {
				this.setB_may_swap(0/*
				     * Open the memfile.  No swap file is created yet.
				     */);
		} 
		memfile memfile = new memfile();
		mfp = memfile.mf_open(((Object)0), 0);
		if (mfp == ((Object)0)) {
			;
		} 
		generatedB_ml.setMl_mfp(mfp);
		mfp.setMf_buffer(buf);
		generatedB_ml.setMl_flags(1);
		generatedB_ml.setMl_line_count(1);
		ModernizedCProgram.curwin.setW_nrwidth_line_count(0);
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.mf_new(mfp, 0, 1)) == ((Object)/*
		 * fill block0 struct and write page 0
		 */0)) {
			;
		} 
		mf_hashitem_S generatedBh_hashitem = hp.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		if (generatedMhi_key != 0) {
			ModernizedCProgram.iemsg(((byte)("E298: Didn't get block nr 0?")));
			;
		} 
		Object generatedBh_data = hp.getBh_data();
		b0p = (ZERO_BL)(generatedBh_data);
		Object generatedB0_id = b0p.getB0_id();
		generatedB0_id[0] = (byte)'b';
		generatedB0_id[1] = (byte)'0';
		b0p.setB0_magic_long((long)-1024);
		b0p.setB0_magic_int((int)-1024);
		b0p.setB0_magic_short((int)-1024);
		b0p.setB0_magic_char(-1024);
		Object generatedB0_version = b0p.getB0_version();
		.memmove((byte)(generatedB0_version), (byte)("VIM "), (size_t)(true));
		.strncpy((byte)(generatedB0_version + 4), (byte)(ModernizedCProgram.Version), (size_t)(true));
		int generatedMf_page_size = mfp.getMf_page_size();
		Object generatedB0_page_size = b0p.getB0_page_size();
		ModernizedCProgram.long_to_char((long)generatedMf_page_size, generatedB0_page_size);
		Object generatedB_spell = this.getB_spell();
		Object generatedB0_fname = b0p.getB0_fname();
		int generatedB_changed = this.getB_changed();
		Object generatedB0_uname = b0p.getB0_uname();
		Object generatedB0_hname = b0p.getB0_hname();
		Object generatedB0_pid = b0p.getB0_pid();
		if (!generatedB_spell) {
			generatedB0_fname[900 - 1] = generatedB_changed ? -1024 : 0;
			generatedB0_fname[900 - 2] = buf.get_fileformat() + 1;
			ModernizedCProgram.set_b0_fname(b0p, buf);
			(Object)ModernizedCProgram.get_user_name(generatedB0_uname, 40);
			generatedB0_uname[40 - 1] = (byte)'\000';
			ModernizedCProgram.mch_get_host_name(generatedB0_hname, 40);
			generatedB0_hname[40 - 1] = (byte)'\000';
			ModernizedCProgram.long_to_char(ModernizedCProgram.mch_get_pid(), generatedB0_pid);
			ModernizedCProgram.ml_set_b0_crypt(buf, b0p/*
			     * Always sync block number 0 to disk, so we can check the file name in
			     * the swap file in findswapname(). Don't do this for a help files or
			     * a spell buffer though.
			     * Only works when there's a swapfile, otherwise it's done when the file
			     * is created.
			     */);
		} 
		ModernizedCProgram.mf_put(mfp, hp, 1, 0);
		int generatedB_help = this.getB_help();
		if (!generatedB_help && !(generatedB_spell)) {
			(Object)mfp.mf_sync(0/*
			     * Fill in root pointer block and write page 1.
			     */);
		} 
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.ml_new_ptr(mfp)) == ((Object)0)) {
			;
		} 
		if (generatedMhi_key != 1) {
			ModernizedCProgram.iemsg(((byte)("E298: Didn't get block nr 1?")));
			;
		} 
		pp = (PTR_BL)(generatedBh_data);
		pp.setPb_count(1);
		Object generatedPb_pointer = pp.getPb_pointer();
		generatedPb_pointer[0].setPe_bnum(2);
		generatedPb_pointer[0].setPe_page_count(1);
		generatedPb_pointer[0].setPe_old_lnum(1);
		generatedPb_pointer[0].setPe_line_count(/* line count after insertion */1);
		ModernizedCProgram.mf_put(mfp, hp, 1, 0/*
		     * Allocate first data block and create an empty line 1.
		     */);
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.ml_new_data(mfp, 0, 1)) == ((Object)0)) {
			;
		} 
		if (generatedMhi_key != 2) {
			ModernizedCProgram.iemsg(((byte)("E298: Didn't get block nr 2?")));
			;
		} 
		dp = (DATA_BL)(generatedBh_data);
		Object generatedDb_index = dp.getDb_index();
		int generatedDb_txt_start = dp.getDb_txt_start();
		generatedDb_index[0] = --generatedDb_txt_start;
		int generatedDb_free = dp.getDb_free();
		generatedDb_free -= 1 + ();
		dp.setDb_line_count(1);
		((char_u)dp + generatedDb_txt_start) = /* empty line */(byte)'\000';
		return 1;
		generatedB_ml.setMl_mfp(((Object)0));
		return 0/*
		 * Prepare encryption for "buf" for the current key and method.
		 */;
	}
	public void ml_set_mfp_crypt() {
		Object generatedB_p_key = this.getB_p_key();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		Object generatedMf_seed = generatedMl_mfp.getMf_seed();
		if (generatedB_p_key != (byte)'\000') {
			int method_nr = buf.crypt_get_method_nr();
			if (method_nr > 0) {
				ModernizedCProgram.sha2_seed(generatedMf_seed, 8, ((Object)0), /* Generate a seed and store it in the memfile. */0);
			} 
		} 
	}
	public void ml_set_crypt_key(Object old_key, Object old_cm) {
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		memfile_T mfp = generatedMl_mfp;
		bhdr_T hp = new bhdr_T();
		int page_count;
		int idx;
		long error;
		infoptr_T ip = new infoptr_T();
		PTR_BL pp = new PTR_BL();
		DATA_BL dp = new DATA_BL();
		blocknr_T bnum = new blocknr_T();
		int top;
		int old_method;
		if (mfp == ((Object)0)) {
			return ;
		} 
		old_method = ModernizedCProgram.crypt_method_nr_from_name(old_cm/* First make sure the swapfile is in a consistent state, using the old
		     * key and method. */);
		Object generatedB_p_key = this.getB_p_key();
		Object generatedB_p_cm = this.getB_p_cm();
		{ 
			char_u new_key = generatedB_p_key;
			char_u new_buf_cm = generatedB_p_cm;
			this.setB_p_key(old_key);
			this.setB_p_cm(old_cm);
			buf.ml_preserve(0);
			this.setB_p_key(new_key);
			this.setB_p_cm(new_buf_cm);
		}
		mfp.setMf_old_key(/* Set the key, method and seed to be used for reading, these must be the
		     * old values. */old_key);
		mfp.setMf_old_cm(old_method);
		Object generatedMf_old_seed = mfp.getMf_old_seed();
		Object generatedMf_seed = mfp.getMf_seed();
		if (old_method > 0 && old_key != (byte)'\000') {
			.memmove((byte)(generatedMf_old_seed), (byte)(generatedMf_seed), (size_t)(true));
		} 
		buf.ml_upd_block0(/* Update block 0 with the crypt flag and may set a new seed. */.UB_CRYPT);
		Object generatedMf_infile_count = mfp.getMf_infile_count();
		block_hdr block_hdr = new block_hdr();
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedPb_id = pp.getPb_id();
		Object generatedPb_count = pp.getPb_count();
		Object generatedPb_pointer = pp.getPb_pointer();
		Object generatedDb_id = dp.getDb_id();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		Object generatedIp_bnum = ip.getIp_bnum();
		int generatedIp_index = ip.getIp_index();
		if (generatedMf_infile_count > 2/*
			 * Need to read back all data blocks from disk, decrypt them with the
			 * old key/method and mark them to be written. The algorithm is
			 * similar to what happens in ml_recover(), but we skip negative block
			 * numbers.
			 */) {
			/* flush buffered line */buf.ml_flush_line();
			(Object)block_hdr.ml_find_line(buf, (linenr_T)0, /* flush locked block */-1024);
			hp = ((Object)0);
			bnum = /* start with block 1 */1;
			page_count = /* which is 1 page */1;
			idx = /* start with first index in block 1 */0;
			error = 0;
			generatedB_ml.setMl_stack_top(0);
			do {
				if ((generatedMl_stack) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedMl_stack);
					(generatedMl_stack) = ((Object)0);
				} 
			} while (0);
			generatedB_ml.setMl_stack_size(/* no stack yet */0);
			for (; !got_int; ModernizedCProgram.line_breakcheck()) {
				if (hp != ((Object)0)) {
					ModernizedCProgram.mf_put(mfp, hp, 0, /* release previous block */0);
				} 
				if ((hp = block_hdr.mf_get(mfp, (blocknr_T)bnum, page_count)) == ((Object)/* get the block (pointer or data) */0)) {
					if (bnum == 1) {
						break;
					} 
					++error;
				} else {
						pp = (PTR_BL)(generatedBh_data);
						if (generatedPb_id == (((byte)'p' << 8) + /* it is a pointer block */(byte)'t')) {
							if (generatedPb_count == 0) {
								++/* empty block? */error;
							}  else if (idx < (int)generatedPb_count) {
								if (generatedPb_pointer[idx].getPe_bnum() < 0/* Skip data block with negative block number.
											     * Should not happen, because of the ml_preserve()
											     * above. Get same block again for next index. */) {
									++idx;
									continue;
								} 
								if ((top = buf.ml_add_stack()) < /* going one block deeper in the tree, new entry in
											 * stack */0) {
									++error;
									break;
								} 
								ip = (generatedMl_stack[top]);
								ip.setIp_bnum(bnum);
								ip.setIp_index(idx);
								bnum = generatedPb_pointer[idx].getPe_bnum();
								page_count = generatedPb_pointer[idx].getPe_page_count();
								idx = 0;
								continue;
							} 
						} else {
								dp = (DATA_BL)(generatedBh_data);
								if (generatedDb_id != (((byte)'d' << 8) + /* block id wrong */(byte)'a')) {
									++error;
								} else {
										ModernizedCProgram.mf_put(mfp, hp, 1, /* It is a data block, need to write it back to disk. */0);
										hp = ((Object)0);
								} 
						} 
				} 
				if (generatedMl_stack_top == /* finished */0) {
					break;
				} 
				ip = (generatedMl_stack[--(generatedMl_stack_top)]);
				bnum = generatedIp_bnum;
				idx = generatedIp_index + /* go to next index */1;
				page_count = 1;
			}
			if (hp != ((Object)0)) {
				ModernizedCProgram.mf_put(mfp, hp, 0, /* release previous block */0);
			} 
			if (error > 0) {
				ModernizedCProgram.emsg(((byte)("E843: Error while updating swap file crypt")));
			} 
		} 
		mfp.setMf_old_key(((Object)0/*
		 * ml_setname() is called when the file name of "buf" has been changed.
		 * It may rename the swap file.
		 */));
	}
	public void ml_setname() {
		int success = 0;
		memfile_T mfp = new memfile_T();
		char_u fname = new char_u();
		char_u dirp = new char_u();
		char_u p = new char_u();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		int generatedMf_fd = mfp.getMf_fd();
		if (generatedMf_fd < /* there is no swap file yet */0/*
			 * When 'updatecount' is 0 and 'noswapfile' there is no swap file.
			 * For help files we will make a swap file now.
			 */) {
			if (ModernizedCProgram.p_uc != 0 && !ModernizedCProgram.cmdmod.getNoswapfile()) {
				/* create a swap file */buf.ml_open_file();
			} 
			return ;
		} 
		dirp = /*
		     * Try all directories in the 'directory' option.
		     */ModernizedCProgram.p_dir;
		Object generatedMf_fname = mfp.getMf_fname();
		Object generatedMf_ffname = mfp.getMf_ffname();
		for (; ; ) {
			if (dirp == /* tried all directories, fail */(byte)'\000') {
				break;
			} 
			fname = buf.findswapname(dirp, generatedMf_fname);
			if (dirp == ((Object)/* alloc's fname *//* out of memory */0)) {
				break;
			} 
			if (fname == ((Object)/* no file name found for this dir */0)) {
				continue;
			} 
			p = ModernizedCProgram.FullName_save(fname, 0);
			ModernizedCProgram.vim_free(fname);
			fname = p;
			if (fname == ((Object)0)) {
				continue;
			} 
			if (ModernizedCProgram.vim_fnamecmp((char_u)(fname), (char_u)(generatedMf_fname)) == /* if the file name is the same we don't have to do anything */0) {
				ModernizedCProgram.vim_free(fname);
				success = 1;
				break;
			} 
			if (generatedMf_fd >= /* need to close the swap file before renaming */0) {
				.close(generatedMf_fd);
				mfp.setMf_fd(-1);
			} 
			if (ModernizedCProgram.vim_rename(generatedMf_fname, fname) == /* try to rename the swap file */0) {
				success = 1;
				ModernizedCProgram.vim_free(generatedMf_fname);
				mfp.setMf_fname(fname);
				ModernizedCProgram.vim_free(generatedMf_ffname);
				mfp.setMf_ffname(((Object)/* mf_fname is full pathname already */0));
				buf.ml_upd_block0(.UB_SAME_DIR);
				break;
			} 
			ModernizedCProgram.vim_free(/* this fname didn't work, try another */fname);
		}
		if (generatedMf_fd == -/* need to (re)open the swap file */1) {
			mfp.setMf_fd(ModernizedCProgram.mch_open((byte)generatedMf_fname, 2 | 0, 0));
			if (generatedMf_fd < 0) {
				ModernizedCProgram.emsg(((byte)(/* could not (re)open the swap file, what can we do???? */"E301: Oops, lost the swap file!!!")));
				return ;
			} 
		} 
		if (!success) {
			ModernizedCProgram.emsg(((byte)("E302: Could not rename swap file"/*
			 * Open a file for the memfile for all buffers that are not readonly or have
			 * been modified.
			 * Used when 'updatecount' changes from zero to non-zero.
			 */)));
		} 
	}
	public void ml_open_file() {
		memfile_T mfp = new memfile_T();
		char_u fname = new char_u();
		char_u dirp = new char_u();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		int generatedMf_fd = mfp.getMf_fd();
		int generatedB_p_swf = this.getB_p_swf();
		if (mfp == ((Object)0) || generatedMf_fd >= 0 || !generatedB_p_swf || ModernizedCProgram.cmdmod.getNoswapfile()) {
			return ;
		} 
		Object generatedB_spell = this.getB_spell();
		if (generatedB_spell) {
			fname = ModernizedCProgram.vim_tempname((byte)'s', 0);
			if (fname != ((Object)0)) {
				(Object)mfp.mf_open_file(/* consumes fname! */fname);
			} 
			this.setB_may_swap(0);
			return ;
		} 
		dirp = /*
		     * Try all directories in 'directory' option.
		     */ModernizedCProgram.p_dir;
		for (; ; ) {
			if (dirp == (byte)'\000') {
				break;
			} 
			fname = buf.findswapname(dirp, ((Object)/* allocates fname */0));
			if (dirp == ((Object)0)) {
				break;
			} 
			if (fname == ((Object)0)) {
				continue;
			} 
			if (mfp.mf_open_file(fname) == /* consumes fname! */1/*
				     * set full pathname for swap file now, because a ":!cd dir" may
				     * change directory without us knowing it.
				     */) {
				mfp.mf_fullname();
				buf.ml_upd_block0(.UB_SAME_DIR);
				if (mfp.mf_sync(8) == /* Flush block zero, so others can read it */1/* Mark all blocks that should be in the swapfile as dirty.
						 * Needed for when the 'swapfile' option was reset, so that
						 * the swap file was deleted, and then on again. */) {
					mfp.mf_set_dirty();
					break;
				} 
				buf.mf_close_file(/* Writing block 0 failed: close the file and try another dir */0);
			} 
		}
		Object generatedMf_fname = mfp.getMf_fname();
		Object generatedB_fname = this.getB_fname();
		if (ModernizedCProgram.p_dir != (byte)'\000' && generatedMf_fname == ((Object)0)) {
			need_wait_return = 1;
			++no_wait_return;
			(Object)ModernizedCProgram.semsg(((byte)("E303: Unable to open swap file for \"%s\", recovery impossible")), buf.buf_spname() != ((Object)0) ? buf.buf_spname() : generatedB_fname);
			--no_wait_return;
		} 
		this.setB_may_swap(/* don't try to open a swap file again */0/*
		 * If still need to create a swap file, and starting to edit a not-readonly
		 * file, or reading into an existing buffer, create a swap file now.
		 */);
	}
	public void ml_close(int del_file) {
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (generatedMl_mfp == ((Object)/* not open */0)) {
			return ;
		} 
		generatedMl_mfp.mf_close(/* close the .swp file */del_file);
		Object generatedMl_line_lnum = generatedB_ml.getMl_line_lnum();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		Object generatedMl_line_ptr = generatedB_ml.getMl_line_ptr();
		if (generatedMl_line_lnum != 0 && (generatedMl_flags & 2)) {
			ModernizedCProgram.vim_free(generatedMl_line_ptr);
		} 
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		ModernizedCProgram.vim_free(generatedMl_stack);
		Object generatedMl_chunksize = generatedB_ml.getMl_chunksize();
		do {
			if ((generatedMl_chunksize) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedMl_chunksize);
				(generatedMl_chunksize) = ((Object)0);
			} 
		} while (0);
		generatedB_ml.setMl_mfp(((Object)0));
		int generatedB_flags = this.getB_flags();
		generatedB_flags &=  ~/* Reset the "recovered" flag, give the ATTENTION prompt the next time
		     * this buffer is loaded. */-1024/*
		 * Close all existing memlines and memfiles.
		 * Only used when exiting.
		 * When 'del_file' is TRUE, delete the memfiles.
		 * But don't delete files that were ":preserve"d when we are POSIX compatible.
		 */;
	}
	public void ml_timestamp() {
		buf.ml_upd_block0(.UB_FNAME/*
		 * Return FAIL when the ID of "b0p" is wrong.
		 */);
	}
	public void ml_upd_block0( what) {
		memfile_T mfp = new memfile_T();
		bhdr_T hp = new bhdr_T();
		ZERO_BL b0p = new ZERO_BL();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		if (mfp == ((Object)0)) {
			return ;
		} 
		block_hdr block_hdr = new block_hdr();
		hp = block_hdr.mf_get(mfp, (blocknr_T)0, 1);
		if (hp == ((Object)0)) {
			if (what == /* Possibly update the seed in the memfile before there is a block0. */.UB_CRYPT) {
				buf.ml_set_mfp_crypt();
			} 
			return ;
		} 
		Object generatedBh_data = hp.getBh_data();
		b0p = (ZERO_BL)(generatedBh_data);
		if (b0p.ml_check_b0_id() == 0) {
			ModernizedCProgram.iemsg(((byte)("E304: ml_upd_block0(): Didn't get block 0??")));
		} else {
				if (what == .UB_FNAME) {
					ModernizedCProgram.set_b0_fname(b0p, buf);
				}  else if (what == .UB_CRYPT) {
					ModernizedCProgram.ml_set_b0_crypt(buf, b0p);
				} else {
						ModernizedCProgram.set_b0_dir_flag(b0p, /* what == UB_SAME_DIR */buf);
				} 
		} 
		ModernizedCProgram.mf_put(mfp, hp, 1, 0/*
		 * Write file name and timestamp into block 0 of a swap file.
		 * Also set buf->b_mtime.
		 * Don't use NameBuff[]!!!
		 */);
	}
	public void ml_preserve(int message) {
		bhdr_T hp = new bhdr_T();
		linenr_T lnum = new linenr_T();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		memfile_T mfp = generatedMl_mfp;
		int status;
		int got_int_save = got_int;
		Object generatedMf_fname = mfp.getMf_fname();
		if (mfp == ((Object)0) || generatedMf_fname == ((Object)0)) {
			if (message) {
				ModernizedCProgram.emsg(((byte)("E313: Cannot preserve, there is no swap file")));
			} 
			return ;
		} 
		got_int = /* We only want to stop when interrupted here, not when interrupted
		     * before. */0;
		/* flush buffered line */buf.ml_flush_line();
		block_hdr block_hdr = new block_hdr();
		(Object)block_hdr.ml_find_line(buf, (linenr_T)0, /* flush locked block */-1024);
		status = mfp.mf_sync(1 | 4);
		generatedB_ml.setMl_stack_top(/* stack is invalid after mf_sync(.., MFS_ALL) */0/*
		     * Some of the data blocks may have been changed from negative to
		     * positive block number. In that case the pointer blocks need to be
		     * updated.
		     *
		     * We don't know in which pointer block the references are, so we visit
		     * all data blocks until there are no more translations to be done (or
		     * we hit the end of the file, which can only happen in case a write fails,
		     * e.g. when file system if full).
		     * ml_find_line() does the work by translating the negative block numbers
		     * when getting the first line of each data block.
		     */);
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		if (mfp.mf_need_trans() && !got_int) {
			lnum = 1;
			while (mfp.mf_need_trans() && lnum <= generatedMl_line_count) {
				hp = block_hdr.ml_find_line(buf, lnum, -1024);
				if (hp == ((Object)0)) {
					status = 0;
					;
				} 
				do {
				} while (0);
				lnum = generatedMl_locked_high + 1;
			}
			(Object)block_hdr.ml_find_line(buf, (linenr_T)0, /* flush locked block */-1024);
			if (mfp.mf_sync(1 | 4) == /* sync the updated pointer blocks */0) {
				status = 0;
			} 
			generatedB_ml.setMl_stack_top(/* stack is invalid now */0);
		} 
		if (message) {
			if (status == 1) {
				ModernizedCProgram.msg(((byte)("File preserved")));
			} else {
					ModernizedCProgram.emsg(((byte)("E314: Preserve failed"/*
					 * NOTE: The pointer returned by the ml_get_*() functions only remains valid
					 * until the next call!
					 *  line1 = ml_get(1);
					 *  line2 = ml_get(2);	// line1 is now invalid!
					 * Make a copy of the line if necessary.
					 */)));
			} 
		} 
	}
	public Object ml_get_buf(Object lnum, int will_change) {
		/* line will be changed */bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		int recursive = 0;
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		// pretend line 0 is line 1if (lnum <= 0) {
			lnum = 1;
		} 
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		// there are no linesif (generatedMl_mfp == ((Object)0)) {
			generatedB_ml.setMl_line_len(1);
			return (char_u)""/*
			     * See if it is the same line as requested last time.
			     * Otherwise may need to flush last used line.
			     * Don't use the last used line when 'swapfile' is reset, need to load all
			     * blocks.
			     */;
		} 
		Object generatedMl_line_lnum = generatedB_ml.getMl_line_lnum();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		Object generatedDb_index = dp.getDb_index();
		int generatedDb_txt_end = dp.getDb_txt_end();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (generatedMl_line_lnum != lnum || mf_dont_release) {
			int start;
			int end;
			colnr_T len = new colnr_T();
			int idx;
			buf/*
				 * Find the data block containing the line.
				 * This also fills the stack with the blocks from the root to the data
				 * block and releases any locked block.
				 */.ml_flush_line();
			if ((hp = block_hdr.ml_find_line(buf, lnum, -1024)) == ((Object)0)) {
				if (recursive == 0) {
					++/* Avoid giving this message for a recursive call, may happen
							 * when the GUI redraws part of the text. */recursive;
					ModernizedCProgram.siemsg(((byte)("E316: ml_get: cannot find line %ld")), lnum);
					--recursive;
				} 
				;
			} 
			dp = (DATA_BL)(generatedBh_data);
			idx = lnum - generatedMl_locked_low;
			start = ((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1))));
			if (idx == 0) {
				end = generatedDb_txt_end;
			} else {
					end = ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1))));
			} 
			len = end - start;
			generatedB_ml.setMl_line_ptr((char_u)dp + start);
			generatedB_ml.setMl_line_len(len);
			generatedB_ml.setMl_line_lnum(lnum);
			generatedMl_flags &=  ~2;
		} 
		if (will_change) {
			generatedMl_flags |=  (4 | 8);
		} 
		Object generatedMl_line_ptr = generatedB_ml.getMl_line_ptr();
		return generatedMl_line_ptr;
	}
	public void add_text_props_for_append(Object lnum, Object line, int len, Object tofree) {
		int round;
		int new_prop_count = 0;
		int count;
		int n;
		char_u props = new char_u();
		// init for gccint new_len = 0;
		char_u new_line = new char_u();
		textprop_T prop = new textprop_T();
		// Make two rounds:
		int generatedTp_flags = prop.getTp_flags();
		// 1. calculate the extra space needed// 2. allocate the space and fill itfor (round = 1; round <= 2; ++round) {
			if (round == 2) {
				if (new_prop_count == 0) {
					return ;
				} 
				new_len = len + new_prop_count * ;
				new_line = ModernizedCProgram.alloc(new_len);
				if (new_line == ((Object)0)) {
					return ;
				} 
				.memmove((byte)(new_line), (byte)(line), (size_t)(len));
				new_prop_count = 0;
			} 
			count = buf.get_text_props(lnum, props, 0);
			for (n = 0; n < count; ++n) {
				.memmove((byte)(prop), (byte)(props + n * ), (size_t)());
				if (generatedTp_flags & 1) {
					if (round == 2) {
						generatedTp_flags |=  2;
						prop.setTp_col(1);
						prop.setTp_len(len);
						.memmove((byte)(new_line + len + new_prop_count * ), (byte)(prop), (size_t)());
					} 
					++new_prop_count;
				} 
			}
		}
		line = new_line;
		tofree = new_line;
		len = new_len;
	}
	public int ml_append_int(Object lnum, Object line_arg, Object len_arg, int newfile, int mark) {
		// length of line, including NUL, or 0// flag, see above// mark the new linechar_u line = line_arg;
		colnr_T len = len_arg;
		int i;
		// number of indexes in current blockint line_count;
		int offset;
		int from;
		int to;
		// space needed for new lineint space_needed;
		int page_size;
		int page_count;
		// index for lnum in data blockint db_idx;
		bhdr_T hp = new bhdr_T();
		memfile_T mfp = new memfile_T();
		DATA_BL dp = new DATA_BL();
		PTR_BL pp = new PTR_BL();
		infoptr_T ip = new infoptr_T();
		char_u tofree = ((Object)0);
		int ret = 0;
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (lnum > generatedMl_line_count || generatedMl_mfp == ((Object)0)) {
			return 0;
		} 
		if (ModernizedCProgram.lowest_marked && ModernizedCProgram.lowest_marked > lnum) {
			ModernizedCProgram.lowest_marked = lnum + 1;
		} 
		if (len == 0) {
			len = (colnr_T).strlen((byte)(line)) + 1;
		} 
		Object generatedB_has_textprop = curbuf.getB_has_textprop();
		if (generatedB_has_textprop && lnum > 0) {
			buf.add_text_props_for_append(lnum, line, len, tofree);
		} 
		// Add text properties that continue from the previous line.
		// space needed for text + index// space needed for text + indexspace_needed = len + ();
		mfp = generatedMl_mfp;
		int generatedMf_page_size = mfp.getMf_page_size();
		page_size = generatedMf_page_size;
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.ml_find_line(buf, lnum == 0 ? (linenr_T)1 : lnum, -1024)) == ((Object)0)) {
			;
		} 
		int generatedMl_flags = generatedB_ml.getMl_flags();
		generatedMl_flags &=  ~1;
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		if (lnum == /* got line one instead, correct db_idx */0) {
			db_idx = -/* careful, it is negative! */1;
		} else {
				db_idx = lnum - generatedMl_locked_low;
		} 
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		line_count = generatedMl_locked_high - generatedMl_locked_low;
		Object generatedBh_data = hp.getBh_data();
		dp = (DATA_BL)(generatedBh_data);
		int generatedDb_free = dp.getDb_free();
		int generatedMl_locked_lineadd = generatedB_ml.getMl_locked_lineadd();
		if ((int)generatedDb_free < space_needed && db_idx == line_count - 1 && lnum < generatedMl_line_count) {
			--(generatedMl_locked_lineadd);
			--(generatedMl_locked_high);
			if ((hp = block_hdr.ml_find_line(buf, lnum + 1, -1024)) == ((Object)0)) {
				;
			} 
			db_idx = -/* careful, it is negative! */1;
			line_count = generatedMl_locked_high - generatedMl_locked_low;
			do {
			} while (0);
			dp = (DATA_BL)(generatedBh_data);
		} 
		++generatedMl_line_count;
		int generatedDb_txt_start = dp.getDb_txt_start();
		Object generatedDb_line_count = dp.getDb_line_count();
		int generatedDb_txt_end = dp.getDb_txt_end();
		Object generatedDb_index = dp.getDb_index();
		block_hdr block_hdr = new block_hdr();
		mf_hashitem_S generatedBh_hashitem = hp_left.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		int generatedBh_page_count = hp_left.getBh_page_count();
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		int generatedIp_index = ip.getIp_index();
		Object generatedIp_bnum = ip.getIp_bnum();
		block_hdr block_hdr = new block_hdr();
		Object generatedPb_id = pp.getPb_id();
		Object generatedPb_count = pp.getPb_count();
		Object generatedPb_count_max = pp.getPb_count_max();
		Object generatedPb_pointer = pp.getPb_pointer();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		block_hdr block_hdr = new block_hdr();
		if ((int)generatedDb_free >= /* enough room in data block */space_needed/*
			 * Insert the new line in an existing data block, or in the data block
			 * allocated above.
			 */) {
			generatedDb_txt_start -= len;
			generatedDb_free -= space_needed;
			++(generatedDb_line_count);
			if (line_count > db_idx + /* if there are following lines */1/*
				     * Offset is the start of the previous line.
				     * This will become the character just after the new line.
				     */) {
				if (db_idx < 0) {
					offset = generatedDb_txt_end;
				} else {
						offset = ((generatedDb_index[db_idx]) & (~((int)1 << (( * 8) - 1))));
				} 
				.memmove((byte)((byte)dp + generatedDb_txt_start), (byte)((byte)dp + generatedDb_txt_start + len), (size_t)((size_t)(offset - (generatedDb_txt_start + len))));
				for (i = line_count - 1; i > db_idx; --i) {
					generatedDb_index[i + 1] = generatedDb_index[i] - len;
				}
				generatedDb_index[db_idx + 1] = offset - len;
			} else {
					generatedDb_index[db_idx + 1] = generatedDb_txt_start;
			} 
			.memmove((byte)((byte)dp + generatedDb_index[db_idx + 1]), (byte)(line), (size_t)((size_t)len));
			if (mark) {
				generatedDb_index[db_idx + 1] |=  ((int)1 << (( * 8) - 1/*
					 * Mark the block dirty.
					 */));
			} 
			generatedMl_flags |=  4;
			if (!newfile) {
				generatedMl_flags |=  8/* not enough space in data block */;
			} 
		} else {
				long line_count_left;
				long line_count_right;
				int page_count_left;
				int page_count_right;
				bhdr_T hp_left = new bhdr_T();
				bhdr_T hp_right = new bhdr_T();
				bhdr_T hp_new = new bhdr_T();
				int lines_moved;
				int data_moved = /* init to shut up gcc */0;
				int total_moved = /* init to shut up gcc */0;
				DATA_BL dp_right = new DATA_BL();
				DATA_BL dp_left = new DATA_BL();
				int stack_idx;
				int in_left;
				int lineadd;
				blocknr_T bnum_left = new blocknr_T();
				blocknr_T bnum_right = new blocknr_T();
				linenr_T lnum_left = new linenr_T();
				linenr_T lnum_right = new linenr_T();
				int pb_idx;
				PTR_BL pp_new = new PTR_BL();
				if (db_idx < /* left block is new, right block is existing */0) {
					lines_moved = 0;
					in_left = 1/* space_needed does not change */;
				} else {
						lines_moved = line_count - db_idx - /* left block is existing, right block is new */1;
						if (lines_moved == 0) {
							in_left = /* put new line in right block */0/* space_needed does not change */;
						} else {
								data_moved = ((generatedDb_index[db_idx]) & (~((int)1 << (( * 8) - 1)))) - generatedDb_txt_start;
								total_moved = data_moved + lines_moved * ();
								if ((int)generatedDb_free + total_moved >= space_needed) {
									in_left = /* put new line in left block */1;
									space_needed = total_moved;
								} else {
										in_left = /* put new line in right block */0;
										space_needed += total_moved;
								} 
						} 
				} 
				page_count = ((space_needed + ( - ())) + page_size - 1) / page_size;
				if ((hp_new = block_hdr.ml_new_data(mfp, newfile, page_count)) == ((Object)0)) {
					--(generatedMl_locked_lineadd);
					--(generatedMl_locked_high);
					;
				} 
				if (db_idx < /* left block is new */0) {
					hp_left = hp_new;
					hp_right = hp;
					line_count_left = 0;
					line_count_right = line_count;
				} else {
						hp_left = /* right block is new */hp;
						hp_right = hp_new;
						line_count_left = line_count;
						line_count_right = 0;
				} 
				dp_right = (DATA_BL)(generatedBh_data);
				dp_left = (DATA_BL)(generatedBh_data);
				bnum_left = generatedMhi_key;
				bnum_right = generatedMhi_key;
				page_count_left = generatedBh_page_count;
				page_count_right = generatedBh_page_count;
				if (!in_left) {
					generatedDb_txt_start -= len;
					generatedDb_free -= len + ();
					generatedDb_index[0] = generatedDb_txt_start;
					if (mark) {
						generatedDb_index[0] |=  ((int)1 << (( * 8) - 1));
					} 
					.memmove((byte)((byte)dp_right + generatedDb_txt_start), (byte)(line), (size_t)((size_t)len));
					++line_count_right/*
						 * may move lines from the left/old block to the right/new one.
						 */;
				} 
				if (lines_moved) {
					generatedDb_txt_start -= /*
						     */data_moved;
					generatedDb_free -= total_moved;
					.memmove((byte)((byte)dp_right + generatedDb_txt_start), (byte)((byte)dp_left + generatedDb_txt_start), (size_t)((size_t)data_moved));
					offset = generatedDb_txt_start - generatedDb_txt_start;
					generatedDb_txt_start += data_moved;
					generatedDb_free += total_moved/*
						     * update indexes in the new block
						     */;
					for (; from < line_count_left; ) {
						generatedDb_index[to] = generatedDb_index[from] + offset;
					}
					line_count_right += lines_moved;
					line_count_left -= lines_moved;
				} 
				if (/*
					 * May move the new line into the left (old or new) block.
					 */in_left) {
					generatedDb_txt_start -= len;
					generatedDb_free -= len + ();
					generatedDb_index[line_count_left] = generatedDb_txt_start;
					if (mark) {
						generatedDb_index[line_count_left] |=  ((int)1 << (( * 8) - 1));
					} 
					.memmove((byte)((byte)dp_left + generatedDb_txt_start), (byte)(line), (size_t)((size_t)len));
					++line_count_left;
				} 
				if (db_idx < /* left block is new */0) {
					lnum_left = lnum + 1;
					lnum_right = 0;
				} else {
						lnum_left = /* right block is new */0;
						if (in_left) {
							lnum_right = lnum + 2;
						} else {
								lnum_right = lnum + 1;
						} 
				} 
				dp_left.setDb_line_count(line_count_left);
				dp_right.setDb_line_count(line_count_right/*
					 * release the two data blocks
					 * The new one (hp_new) already has a correct blocknumber.
					 * The old one (hp, in ml_locked) gets a positive blocknumber if
					 * we changed it and we are not editing a new file.
					 */);
				if (lines_moved || in_left) {
					generatedMl_flags |=  4;
				} 
				if (!newfile && db_idx >= 0 && in_left) {
					generatedMl_flags |=  8;
				} 
				ModernizedCProgram.mf_put(mfp, hp_new, 1, 0/*
					 * flush the old data block
					 * set ml_locked_lineadd to 0, because the updating of the
					 * pointer blocks is done below
					 */);
				lineadd = generatedMl_locked_lineadd;
				generatedB_ml.setMl_locked_lineadd(0);
				block_hdr.ml_find_line(buf, (linenr_T)0, /* flush data block */-1024/*
					 * update pointer blocks for the new data block
					 */);
				for (stack_idx = generatedMl_stack_top - 1; stack_idx >= 0; --stack_idx) {
					ip = (generatedMl_stack[stack_idx]);
					pb_idx = generatedIp_index;
					if ((hp = block_hdr.mf_get(mfp, generatedIp_bnum, 1)) == ((Object)0)) {
						;
					} 
					pp = (PTR_BL)(generatedBh_data);
					if (generatedPb_id != (((byte)'p' << 8) + (byte)'t')) {
						ModernizedCProgram.iemsg(((byte)("E317: pointer block id wrong 3")));
						ModernizedCProgram.mf_put(mfp, hp, 0, 0);
						;
					} 
					if (generatedPb_count < generatedPb_count_max) {
						if (pb_idx + 1 < (int)generatedPb_count) {
							.memmove((byte)(generatedPb_pointer[pb_idx + 2]), (byte)(generatedPb_pointer[pb_idx + 1]), (size_t)((size_t)(generatedPb_count - pb_idx - 1) * ));
						} 
						++generatedPb_count;
						generatedPb_pointer[pb_idx].setPe_line_count(line_count_left);
						generatedPb_pointer[pb_idx].setPe_bnum(bnum_left);
						generatedPb_pointer[pb_idx].setPe_page_count(page_count_left);
						generatedPb_pointer[pb_idx + 1].setPe_line_count(line_count_right);
						generatedPb_pointer[pb_idx + 1].setPe_bnum(bnum_right);
						generatedPb_pointer[pb_idx + 1].setPe_page_count(page_count_right);
						if (lnum_left != 0) {
							generatedPb_pointer[pb_idx].setPe_old_lnum(lnum_left);
						} 
						if (lnum_right != 0) {
							generatedPb_pointer[pb_idx + 1].setPe_old_lnum(lnum_right);
						} 
						ModernizedCProgram.mf_put(mfp, hp, 1, 0);
						generatedB_ml.setMl_stack_top(stack_idx + /* truncate stack */1);
						if (lineadd) {
							--(generatedMl_stack_top);
							buf.ml_lineadd(/* fix line count for rest of blocks in the stack */lineadd);
							generatedMl_stack[generatedMl_stack_top].getIp_high() += lineadd;
							++(generatedMl_stack_top);
						} 
						break;
					} else {
							for (; ; ) {
								hp_new = block_hdr.ml_new_ptr(mfp);
								if (hp_new == ((Object)/* TODO: try to fix tree */0)) {
									;
								} 
								pp_new = (PTR_BL)(generatedBh_data);
								if (generatedMhi_key != 1) {
									break;
								} 
								.memmove((byte)(pp_new), (byte)(pp), (size_t)((size_t)page_size));
								pp.setPb_count(1);
								generatedPb_pointer[0].setPe_bnum(generatedMhi_key);
								generatedPb_pointer[0].setPe_line_count(generatedMl_line_count);
								generatedPb_pointer[0].setPe_old_lnum(1);
								generatedPb_pointer[0].setPe_page_count(1);
								ModernizedCProgram.mf_put(mfp, hp, 1, /* release block 1 */0);
								hp = /* new block is to be split */hp_new;
								pp = pp_new;
								do {
								} while (0);
								ip.setIp_index(0);
								++/* do block 1 again later */stack_idx/*
										 * move the pointers after the current one to the new block
										 * If there are none, the new entry will be in the new block.
										 */;
							}
							total_moved = generatedPb_count - pb_idx - 1;
							if (total_moved) {
								.memmove((byte)(generatedPb_pointer[0]), (byte)(generatedPb_pointer[pb_idx + 1]), (size_t)((size_t)(total_moved) * ));
								pp_new.setPb_count(total_moved);
								generatedPb_count -= total_moved - 1;
								generatedPb_pointer[pb_idx + 1].setPe_bnum(bnum_right);
								generatedPb_pointer[pb_idx + 1].setPe_line_count(line_count_right);
								generatedPb_pointer[pb_idx + 1].setPe_page_count(page_count_right);
								if (lnum_right) {
									generatedPb_pointer[pb_idx + 1].setPe_old_lnum(lnum_right);
								} 
							} else {
									pp_new.setPb_count(1);
									generatedPb_pointer[0].setPe_bnum(bnum_right);
									generatedPb_pointer[0].setPe_line_count(line_count_right);
									generatedPb_pointer[0].setPe_page_count(page_count_right);
									generatedPb_pointer[0].setPe_old_lnum(lnum_right);
							} 
							generatedPb_pointer[pb_idx].setPe_bnum(bnum_left);
							generatedPb_pointer[pb_idx].setPe_line_count(line_count_left);
							generatedPb_pointer[pb_idx].setPe_page_count(page_count_left);
							if (lnum_left) {
								generatedPb_pointer[pb_idx].setPe_old_lnum(lnum_left);
							} 
							lnum_left = 0;
							lnum_right = 0/*
									 * recompute line counts
									 */;
							line_count_right = 0;
							for (i = 0; i < (int)generatedPb_count; ++i) {
								line_count_right += generatedPb_pointer[i].getPe_line_count();
							}
							line_count_left = 0;
							for (i = 0; i < (int)generatedPb_count; ++i) {
								line_count_left += generatedPb_pointer[i].getPe_line_count();
							}
							bnum_left = generatedMhi_key;
							bnum_right = generatedMhi_key;
							page_count_left = 1;
							page_count_right = 1;
							ModernizedCProgram.mf_put(mfp, hp, 1, 0);
							ModernizedCProgram.mf_put(mfp, hp_new, 1, 0);
					} 
				}
				if (stack_idx < /*
					 * Safety check: fallen out of for loop?
					 */0) {
					ModernizedCProgram.iemsg(((byte)("E318: Updated too many blocks?")));
					generatedB_ml.setMl_stack_top(/* invalidate stack */0);
				} 
		} 
		buf.ml_updatechunk(lnum + 1, (long)len, /* The line was inserted below 'lnum' */1);
		ret = 1;
		return ret/*
		 * Flush any pending change and call ml_append_int()
		 */;
	}
	// append after this line (can be 0)
	// text of the new line
	public int ml_append_flush(Object lnum, Object line, Object len, int newfile) {
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		// length of line, including NUL, or 0// flag, see aboveif (lnum > generatedMl_line_count) {
			return 0;
		} 
		Object generatedMl_line_lnum = generatedB_ml.getMl_line_lnum();
		if (generatedMl_line_lnum != 0) {
			buf.ml_flush_line();
		} 
		// This may also invoke ml_append_int().
		// When inserting above recorded changes: flush the changes before changing// the text.  Then flush the cached line, it may become invalid.// When inserting above recorded changes: flush the changes before changing// the text.  Then flush the cached line, it may become invalid.buf.may_invoke_listeners(lnum + 1, lnum + 1, 1);
		if (generatedMl_line_lnum != 0) {
			buf.ml_flush_line();
		} 
		return buf.ml_append_int(lnum, line, len, newfile, 0/*
		 * Append a line after lnum (may be 0 to insert a line in front of the file).
		 * "line" does not need to be allocated, but can't be another line in a
		 * buffer, unlocking may make it invalid.
		 *
		 *   newfile: TRUE when starting to edit a new file, meaning that pe_old_lnum
		 *		will be set for recovery
		 * Check: The caller of this function should probably also call
		 * appended_lines().
		 *
		 * return FAIL for failure, OK otherwise
		 */);
	}
	// append after this line (can be 0)
	// text of the new line
	public int ml_append_buf(Object lnum, Object line, Object len, int newfile) {
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (generatedMl_mfp == ((Object)/* length of new line, including NUL, or 0 *//* flag, see above */0)) {
			return 0;
		} 
		return buf.ml_append_flush(lnum, line, len, newfile/*
		 * Replace line lnum, with buffering, in current buffer.
		 *
		 * If "copy" is TRUE, make a copy of the line, otherwise the line has been
		 * copied to allocated memory already.
		 *
		 * Check: The caller of this function should probably also call
		 * changed_lines(), unless update_screen(NOT_VALID) is used.
		 *
		 * return FAIL for failure, OK otherwise
		 */);
	}
	/* append after this line (can be 0) */
	/* text of the new line */
	public void adjust_text_props_for_delete(Object lnum, Object del_props, int del_props_len, int above) {
		int did_get_line = 0;
		int done_del;
		int done_this;
		textprop_T prop_del = new textprop_T();
		textprop_T prop_this = new textprop_T();
		bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		int idx;
		int line_start;
		long line_size;
		int this_props_len;
		char_u text = new char_u();
		size_t textlen = new size_t();
		int found;
		int generatedTp_flags = prop_del.getTp_flags();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		Object generatedDb_index = dp.getDb_index();
		int generatedDb_txt_end = dp.getDb_txt_end();
		int generatedTp_id = prop_del.getTp_id();
		int generatedTp_type = prop_del.getTp_type();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		for (done_del = 0; done_del < del_props_len; done_del += ) {
			.memmove((byte)(prop_del), (byte)(del_props + done_del), (size_t)());
			if ((above && (generatedTp_flags & 2) && !(generatedTp_flags & 1)) || (!above && (generatedTp_flags & 1) && !(generatedTp_flags & 2))) {
				if (!did_get_line) {
					did_get_line = 1;
					if ((hp = block_hdr.ml_find_line(buf, lnum, -1024)) == ((Object)0)) {
						return ;
					} 
					dp = (DATA_BL)(generatedBh_data);
					idx = lnum - generatedMl_locked_low;
					line_start = ((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1))));
					if (idx == 0) {
						line_size = generatedDb_txt_end - line_start;
					} else {
							line_size = ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1)))) - line_start;
					} 
					text = (char_u)dp + line_start;
					textlen = .strlen((byte)(text)) + 1;
					if ((long)textlen >= line_size) {
						if (above) {
							ModernizedCProgram.internal_error("no text property above deleted line");
						} else {
								ModernizedCProgram.internal_error("no text property below deleted line");
						} 
						return ;
					} 
					this_props_len = line_size - (int)textlen;
				} 
				found = 0;
				for (done_this = 0; done_this < this_props_len; done_this += ) {
					.memmove((byte)(prop_this), (byte)(text + textlen + done_del), (size_t)());
					if (generatedTp_id == generatedTp_id && generatedTp_type == generatedTp_type) {
						int flag = above ? 1 : 2;
						found = 1;
						if (generatedTp_flags & flag) {
							generatedTp_flags &=  ~flag;
							.memmove((byte)(text + textlen + done_del), (byte)(prop_this), (size_t)());
						}  else if (above) {
							ModernizedCProgram.internal_error("text property above deleted line does not continue");
						} else {
								ModernizedCProgram.internal_error("text property below deleted line does not continue");
						} 
					} 
				}
				if (!found) {
					if (above) {
						ModernizedCProgram.internal_error("text property above deleted line not found");
					} else {
							ModernizedCProgram.internal_error("text property below deleted line not found");
					} 
				} 
				generatedMl_flags |=  (4 | 8);
			} 
		}
	}
	public int ml_delete_int(Object lnum, int message) {
		bhdr_T hp = new bhdr_T();
		memfile_T mfp = new memfile_T();
		DATA_BL dp = new DATA_BL();
		PTR_BL pp = new PTR_BL();
		infoptr_T ip = new infoptr_T();
		/* number of entries in block */int count;
		int idx;
		int stack_idx;
		int text_start;
		int line_start;
		long line_size;
		int i;
		int ret = 0;
		char_u textprop_save = ((Object)0);
		int textprop_save_len;
		if (ModernizedCProgram.lowest_marked && ModernizedCProgram.lowest_marked > lnum) {
			ModernizedCProgram.lowest_marked/*
			 * If the file becomes empty the last line is replaced by an empty line.
			 */--;
		} 
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (generatedMl_line_count == /* file becomes empty */1) {
			if (message) {
				ModernizedCProgram.set_keep_msg((char_u)((byte)(no_lines_msg)), 0);
			} 
			i = ModernizedCProgram.ml_replace((linenr_T)1, (char_u)"", /* FEAT_BYTEOFF already handled in there, don't worry 'bout it below */1);
			generatedMl_flags |=  1;
			return i/*
			 * Find the data block containing the line.
			 * This also fills the stack with the blocks from the root to the data block.
			 * This also releases any locked block..
			 */;
		} 
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		if (mfp == ((Object)0)) {
			return 0;
		} 
		block_hdr block_hdr = new block_hdr();
		if ((hp = block_hdr.ml_find_line(buf, lnum, -1024)) == ((Object)0)) {
			return 0;
		} 
		Object generatedBh_data = hp.getBh_data();
		dp = (DATA_BL)(generatedBh_data);
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		count = (long)(generatedMl_locked_high) - (long)(generatedMl_locked_low) + 2;
		idx = lnum - generatedMl_locked_low;
		--generatedMl_line_count;
		Object generatedDb_index = dp.getDb_index();
		line_start = ((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1))));
		int generatedDb_txt_end = dp.getDb_txt_end();
		if (idx == /* first line in block, text at the end */0) {
			line_size = generatedDb_txt_end - line_start;
		} else {
				line_size = ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1)))) - line_start;
		} 
		Object generatedB_has_textprop = this.getB_has_textprop();
		// If there are text properties, make a copy, so that we can update// properties in preceding and following lines.if (generatedB_has_textprop) {
			size_t textlen = .strlen((byte)((char_u)dp + line_start)) + 1;
			if ((long)textlen < line_size) {
				textprop_save_len = line_size - (int)textlen;
				textprop_save = ModernizedCProgram.vim_memsave((char_u)dp + line_start + textlen, textprop_save_len/*
				 * special case: If there is only one line in the data block it becomes empty.
				 * Then we have to remove the entry, pointing to this data block, from the
				 * pointer block. If this pointer block also becomes empty, we go up another
				 * block, and so on, up to the root if necessary.
				 * The line counts in the pointer blocks have already been adjusted by
				 * ml_find_line().
				 */);
			} 
		} 
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		int generatedIp_index = ip.getIp_index();
		Object generatedIp_bnum = ip.getIp_bnum();
		block_hdr block_hdr = new block_hdr();
		Object generatedPb_id = pp.getPb_id();
		Object generatedPb_count = pp.getPb_count();
		Object generatedPb_pointer = pp.getPb_pointer();
		int generatedMl_locked_lineadd = generatedB_ml.getMl_locked_lineadd();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		int generatedDb_txt_start = dp.getDb_txt_start();
		int generatedDb_free = dp.getDb_free();
		Object generatedDb_line_count = dp.getDb_line_count();
		if (count == 1) {
			ModernizedCProgram.mf_free(mfp, /* free the data block */hp);
			generatedB_ml.setMl_locked(((Object)0));
			for (stack_idx = generatedMl_stack_top - 1; stack_idx >= 0; --stack_idx) {
				generatedB_ml.setMl_stack_top(/* stack is invalid when failing */0);
				ip = (generatedMl_stack[stack_idx]);
				idx = generatedIp_index;
				if ((hp = block_hdr.mf_get(mfp, generatedIp_bnum, 1)) == ((Object)0)) {
					;
				} 
				pp = (PTR_BL)(generatedBh_data);
				if (generatedPb_id != (((byte)'p' << 8) + (byte)'t')) {
					ModernizedCProgram.iemsg(((byte)("E317: pointer block id wrong 4")));
					ModernizedCProgram.mf_put(mfp, hp, 0, 0);
					;
				} 
				count = --(generatedPb_count);
				if (count == /* the pointer block becomes empty! */0) {
					ModernizedCProgram.mf_free(mfp, hp);
				} else {
						if (count != /* move entries after the deleted one */idx) {
							.memmove((byte)(generatedPb_pointer[idx]), (byte)(generatedPb_pointer[idx + 1]), (size_t)((size_t)(count - idx) * ));
						} 
						ModernizedCProgram.mf_put(mfp, hp, 1, 0);
						generatedB_ml.setMl_stack_top(/* truncate stack */stack_idx);
						if (generatedMl_locked_lineadd != /* fix line count for rest of blocks in the stack */0) {
							buf.ml_lineadd(generatedMl_locked_lineadd);
							generatedMl_stack[generatedMl_stack_top].getIp_high() += generatedMl_locked_lineadd;
						} 
						++(generatedMl_stack_top);
						break;
				} 
			}
			do {
			} while (0);
		} else {
				text_start = generatedDb_txt_start;
				.memmove((byte)((byte)dp + text_start + line_size), (byte)((byte)dp + text_start), (size_t)((size_t)(line_start - text_start/*
					 * delete the index by moving the next indexes backwards
					 * Adjust the indexes for the text movement.
					 */)));
				for (i = idx; i < count - 1; ++i) {
					generatedDb_index[i] = generatedDb_index[i + 1] + line_size;
				}
				generatedDb_free += line_size + ();
				generatedDb_txt_start += line_size;
				--(generatedDb_line_count);
				generatedMl_flags |=  (4 | 8);
		} 
		buf.ml_updatechunk(lnum, line_size, 2);
		ret = 1;
		ModernizedCProgram.vim_free(textprop_save);
		return ret/*
		 * set the DB_MARKED flag for line 'lnum'
		 */;
	}
	public void ml_flush_line() {
		bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		linenr_T lnum = new linenr_T();
		char_u new_line = new char_u();
		char_u old_line = new char_u();
		colnr_T new_len = new colnr_T();
		int old_len;
		int extra;
		int idx;
		int start;
		int count;
		int i;
		int entered = 0;
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_lnum = generatedB_ml.getMl_line_lnum();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (generatedMl_line_lnum == 0 || generatedMl_mfp == ((Object)0)) {
			return ;
		} 
		int generatedMl_flags = generatedB_ml.getMl_flags();
		Object generatedMl_line_ptr = generatedB_ml.getMl_line_ptr();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		Object generatedDb_index = dp.getDb_index();
		int generatedDb_txt_end = dp.getDb_txt_end();
		Object generatedMl_line_len = generatedB_ml.getMl_line_len();
		int generatedDb_free = dp.getDb_free();
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		int generatedDb_txt_start = dp.getDb_txt_start();
		if (generatedMl_flags & 2) {
			if (/* This code doesn't work recursively, but Netbeans may call back here
				 * when obtaining the cursor position. */entered) {
				return ;
			} 
			entered = 1;
			lnum = generatedMl_line_lnum;
			new_line = generatedMl_line_ptr;
			hp = block_hdr.ml_find_line(buf, lnum, -1024);
			if (hp == ((Object)0)) {
				ModernizedCProgram.siemsg(((byte)("E320: Cannot find line %ld")), lnum);
			} else {
					dp = (DATA_BL)(generatedBh_data);
					idx = lnum - generatedMl_locked_low;
					start = ((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1))));
					old_line = (char_u)dp + start;
					if (idx == /* line is last in block */0) {
						old_len = generatedDb_txt_end - start;
					} else {
							old_len = (generatedDb_index[idx - 1] & (~((int)1 << (( * 8) - 1)))) - /* text of previous line follows */start;
					} 
					new_len = generatedMl_line_len;
					extra = new_len - /* negative if lines gets smaller */old_len/*
						     * if new line fits in data block, replace directly
						     */;
					if ((int)generatedDb_free >= extra) {
						count = generatedMl_locked_high - generatedMl_locked_low + /* if the length changes and there are following lines */1;
						if (extra != 0 && idx < count - 1) {
							.memmove((byte)((byte)dp + generatedDb_txt_start - extra), (byte)((byte)dp + generatedDb_txt_start), (size_t)((size_t)(start - generatedDb_txt_start)));
							for (i = idx + 1; i < count; ++/* adjust pointers of this and following lines */i) {
								generatedDb_index[i] -= extra;
							}
						} 
						generatedDb_index[idx] -= extra;
						generatedDb_free -= /* adjust free space */extra;
						generatedDb_txt_start -= extra;
						.memmove((byte)(old_line - extra), (byte)(new_line), (size_t)((size_t)/* copy new line into the data block */new_len));
						generatedMl_flags |=  (4 | 8);
						buf.ml_updatechunk(lnum, (long)extra, /* The else case is already covered by the insert and delete */3/*
								 * Cannot do it in one data block: Delete and append.
								 * Append first, because ml_delete_int() cannot delete the
								 * last line in a buffer, which causes trouble for a buffer
								 * that has only one line.
								 * Don't forget to copy the mark!
								 */);
					} else {
							(Object)buf.ml_append_int(lnum, new_line, new_len, /* How about handling errors??? */0, (generatedDb_index[idx] & ((int)1 << (( * 8) - 1))));
							(Object)buf.ml_delete_int(lnum, 0);
					} 
			} 
			ModernizedCProgram.vim_free(new_line);
			entered = 0;
		} 
		generatedB_ml.setMl_line_lnum(0/*
		 * create a new, empty, data block
		 */);
	}
	public int ml_add_stack() {
		int top;
		infoptr_T newstack = new infoptr_T();
		memline generatedB_ml = this.getB_ml();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		top = generatedMl_stack_top;
		int generatedMl_stack_size = generatedB_ml.getMl_stack_size();
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		if (top == generatedMl_stack_size) {
			do {
			} while (/* more than 5 levels??? */0);
			newstack = (infoptr_T)ModernizedCProgram.alloc( * (generatedMl_stack_size + 5));
			if (newstack == ((Object)0)) {
				return -1;
			} 
			if (top > 0) {
				.memmove((byte)(newstack), (byte)(generatedMl_stack), (size_t)((size_t)top * ));
			} 
			ModernizedCProgram.vim_free(generatedMl_stack);
			generatedB_ml.setMl_stack(newstack);
			generatedMl_stack_size += 5;
		} 
		generatedMl_stack_top++;
		return top/*
		 * Update the pointer blocks on the stack for inserted/deleted lines.
		 * The stack itself is also updated.
		 *
		 * When a insert/delete line action fails, the line is not inserted/deleted,
		 * but the pointer blocks have already been updated. That is fixed here by
		 * walking through the stack.
		 *
		 * Count is the number of lines added, negative if lines have been deleted.
		 */;
	}
	public void ml_lineadd(int count) {
		int idx;
		infoptr_T ip = new infoptr_T();
		PTR_BL pp = new PTR_BL();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		memfile_T mfp = generatedMl_mfp;
		bhdr_T hp = new bhdr_T();
		info_pointer generatedMl_stack = generatedB_ml.getMl_stack();
		Object generatedIp_bnum = ip.getIp_bnum();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedPb_id = pp.getPb_id();
		Object generatedPb_pointer = pp.getPb_pointer();
		int generatedIp_index = ip.getIp_index();
		Object generatedIp_high = ip.getIp_high();
		int generatedMl_stack_top = generatedB_ml.getMl_stack_top();
		for (idx = generatedMl_stack_top - 1; idx >= 0; --idx) {
			ip = (generatedMl_stack[idx]);
			if ((hp = block_hdr.mf_get(mfp, generatedIp_bnum, 1)) == ((Object)0)) {
				break;
			} 
			pp = (PTR_BL)(generatedBh_data);
			if (generatedPb_id != (((byte)'p' << 8) + (byte)'t')) {
				ModernizedCProgram.mf_put(mfp, hp, 0, 0);
				ModernizedCProgram.iemsg(((byte)("E317: pointer block id wrong 2")));
				break;
			} 
			generatedPb_pointer[generatedIp_index].getPe_line_count() += count;
			generatedIp_high += count;
			ModernizedCProgram.mf_put(mfp, hp, 1, 0/*
			 * Resolve a symlink in the last component of a file name.
			 * Note that f_resolve() does it for every part of the path, we don't do that
			 * here.
			 * If it worked returns OK and the resolved link in "buf[MAXPATHL]".
			 * Otherwise returns FAIL.
			 */);
		}
	}
	/* Put the result so far in tmp[], starting with the original name. */
	/* Limit symlink depth to 100, catch recursive loops. */
	/* Found non-symlink or not existing file, stop here.
			 * When at the first level use the unmodified name, skip the
			 * call to vim_FullName(). */
	/* Use the resolved name in tmp[]. */
	/* There must be some error reading links, use original name. */
	/*
		 * Check whether the symlink is relative or absolute.
		 * If it's relative, build a new path based on the directory
		 * portion of the filename (if any) and the path the symlink
		 * points to.
		 */
	/*
	     * Try to resolve the full name of the file so that the swapfile name will
	     * be consistent even when opening a relative symlink from different
	     * working directories.
	     */
	/*
	 * Make swap file name out of the file name and a directory name.
	 * Returns pointer to allocated memory or NULL.
	 */
	public Object makeswapname(Object fname, Object ffname, Object dir_name) {
		char_u r = new char_u();
		char_u s = new char_u();
		char_u fname_res = fname;
		// Need _very_ long file namesint len = (int).strlen((byte)(dir_name));
		s = dir_name + len;
		if (ModernizedCProgram.after_pathsep(dir_name, s) && len > 1 && s[-1] == s[-2]) {
			r = ((Object)/* Ends with '//', Use Full path */0);
			if ((s = ModernizedCProgram.make_percent_swname(dir_name, fname)) != ((Object)0)) {
				r = ModernizedCProgram.modname(s, (char_u)".swp", 0);
				ModernizedCProgram.vim_free(s);
			} 
			return r/* Expand symlink in the file name, so that we put the swap file with the
			     * actual file instead of with the symlink. */;
		} 
		int generatedB_p_sn = this.getB_p_sn();
		int generatedB_shortname = this.getB_shortname();
		r = ModernizedCProgram.buf_modname((generatedB_p_sn || generatedB_shortname), fname_res, (char_u)".swp", dir_name[0] == (byte)'.' && dir_name[1] == /* Prepend a '.' to the swap file name for the current directory. */(byte)'\000');
		if (r == ((Object)/* out of memory */0)) {
			return ((Object)0);
		} 
		s = ModernizedCProgram.get_file_in_dir(r, dir_name);
		ModernizedCProgram.vim_free(r);
		return s/*
		 * Get file name to use for swap file or backup file.
		 * Use the name of the edited file "fname" and an entry in the 'dir' or 'bdir'
		 * option "dname".
		 * - If "dname" is ".", return "fname" (swap file in dir of file).
		 * - If "dname" starts with "./", insert "dname" in "fname" (swap file
		 *   relative to dir of file).
		 * - Otherwise, prepend "dname" to the tail of "fname" (swap file in specific
		 *   dir).
		 *
		 * The return value is an allocated string and can be NULL.
		 */;
	}
	public void attention_message(Object fname) {
		/* swap file name */stat_T st = new stat_T();
		time_t swap_mtime = new time_t();
		++no_wait_return;
		(Object)ModernizedCProgram.emsg(((byte)("E325: ATTENTION")));
		ModernizedCProgram.msg_puts(((byte)("\nFound a swap file by the name \"")));
		ModernizedCProgram.msg_home_replace(fname);
		ModernizedCProgram.msg_puts("\"\n");
		swap_mtime = ModernizedCProgram.swapfile_info(fname);
		ModernizedCProgram.msg_puts(((byte)("While opening file \"")));
		Object generatedB_fname = this.getB_fname();
		ModernizedCProgram.msg_outtrans(generatedB_fname);
		ModernizedCProgram.msg_puts("\"\n");
		Object generated_stat64 = st.get_stat64();
		if ((st).vim_stat(((byte)generatedB_fname)) == -1) {
			ModernizedCProgram.msg_puts(((byte)("      CANNOT BE FOUND")));
		} else {
				ModernizedCProgram.msg_puts(((byte)("             dated: ")));
				ModernizedCProgram.msg_puts(ModernizedCProgram.get_ctime(generated_stat64, 1));
				if (swap_mtime != 0 && generated_stat64 > swap_mtime) {
					ModernizedCProgram.msg_puts(((byte)("      NEWER than swap file!\n")));
				} 
		} 
		ModernizedCProgram.msg_puts(((byte)(/* Some of these messages are long to allow translation to
		     * other languages. */"\n(1) Another program may be editing the same file.  If this is the case,\n    be careful not to end up with two different instances of the same\n    file when making changes.  Quit, or continue with caution.\n")));
		ModernizedCProgram.msg_puts(((byte)("(2) An edit session for this file crashed.\n")));
		ModernizedCProgram.msg_puts(((byte)("    If this is the case, use \":recover\" or \"vim -r ")));
		ModernizedCProgram.msg_outtrans(generatedB_fname);
		ModernizedCProgram.msg_puts(((byte)("\"\n    to recover the changes (see \":help recovery\").\n")));
		ModernizedCProgram.msg_puts(((byte)("    If you did this already, delete the swap file \"")));
		ModernizedCProgram.msg_outtrans(fname);
		ModernizedCProgram.msg_puts(((byte)("\"\n    to avoid this message.\n")));
		ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
		--no_wait_return/*
		 * Trigger the SwapExists autocommands.
		 * Returns a value for equivalent to do_dialog() (see below):
		 * 0: still need to ask for a choice
		 * 1: open read-only
		 * 2: edit anyway
		 * 3: recover
		 * 4: delete it
		 * 5: quit
		 * 6: abort
		 */;
	}
	/* buffer being edited */
	public int do_swapexists(Object fname) {
		ModernizedCProgram.set_vim_var_string(46, fname, -1);
		ModernizedCProgram.set_vim_var_string(47, ((Object)0), -1);
		++/* Trigger SwapExists autocommands with <afile> set to the file being
		     * edited.  Disallow changing directory here. */allbuf_lock;
		Object generatedB_fname = this.getB_fname();
		((Object)0).apply_autocmds(auto_event.EVENT_SWAPEXISTS, generatedB_fname, ((Object)0), 0);
		--allbuf_lock;
		ModernizedCProgram.set_vim_var_string(46, ((Object)0), -1);
		switch (ModernizedCProgram.get_vim_var_str(47)) {
		case (byte)'a':
				return 6;
		case (byte)'q':
				return 5;
		case (byte)'r':
				return 3;
		case (byte)'o':
				return 1;
		case (byte)'d':
				return 4;
		case (byte)'e':
				return 2;
		}
		return 0/*
		 * Find out what name to use for the swap file for buffer 'buf'.
		 *
		 * Several names are tried to find one that does not exist
		 * Returns the name in allocated memory or NULL.
		 * When out of memory "dirp" is set to NULL.
		 *
		 * Note: If BASENAMELEN is not correct, you will get error messages for
		 *	 not being able to open the swap or undo file
		 * Note: May trigger SwapExists autocmd, pointers may change!
		 */;
	}
	public Object findswapname(Object dirp, Object old_fname) {
		/* don't give warning for this file name */char_u fname = new char_u();
		int n;
		char_u dir_name = new char_u();
		int r;
		Object generatedB_fname = this.getB_fname();
		char_u buf_fname = generatedB_fname;
		FILE dummyfd = ((Object)0);
		if (buf_fname != ((Object)0) && !ModernizedCProgram.mch_isFullName(buf_fname) && ModernizedCProgram.vim_strchr(ModernizedCProgram.gettail(buf_fname), (byte)':')) {
			char_u t = new char_u();
			buf_fname = ModernizedCProgram.vim_strsave(buf_fname);
			if (buf_fname == ((Object)0)) {
				buf_fname = generatedB_fname;
			} else {
					for (t = ModernizedCProgram.gettail(buf_fname); t != (byte)'\000'; t += .UNRECOGNIZEDFUNCTIONNAME(t)) {
						if (t == (byte)':') {
							t = (byte)'%'/*
							     * If we start editing a new file, e.g. "test.doc", which resides on an
							     * MSDOS compatible filesystem, it is possible that the file
							     * "test.doc.swp" which we create will be exactly the same file. To avoid
							     * this problem we temporarily create "test.doc".  Don't do this when the
							     * check below for a 8.3 file name is used.
							     */;
						} 
					}
			} 
		} 
		int generatedB_p_sn = this.getB_p_sn();
		int generatedB_shortname = this.getB_shortname();
		if (!(generatedB_p_sn || generatedB_shortname) && buf_fname != ((Object)0) && ModernizedCProgram.mch_getperm(buf_fname) < 0) {
			dummyfd = ModernizedCProgram.mch_fopen((byte)buf_fname, "w"/*
			     * Isolate a directory name from *dirp and put it in dir_name.
			     * First allocate some memory to put the directory name in.
			     */);
		} 
		dir_name = ModernizedCProgram.alloc(.strlen((byte)(dirp)) + 1);
		if (dir_name == ((Object)0)) {
			dirp = ((Object)0);
		} else {
				(Object)ModernizedCProgram.copy_option_part(dirp, dir_name, 31000, ","/*
				     * we try different names until we find one that does not exist yet
				     */);
		} 
		Object generatedB_ffname = this.getB_ffname();
		if (dir_name == ((Object)/* out of memory */0)) {
			fname = ((Object)0);
		} else {
				fname = buf.makeswapname(buf_fname, generatedB_ffname, dir_name);
		} 
		int generatedB_help = this.getB_help();
		int generatedB_flags = this.getB_flags();
		Object generatedB0_fname = b0.getB0_fname();
		for (; ; ) {
			if (fname == ((Object)/* must be out of memory */0)) {
				break;
			} 
			if ((n = (int).strlen((byte)(fname))) == /* safety check */0) {
				do {
					if ((fname) != ((Object)0)) {
						ModernizedCProgram.vim_free(fname);
						(fname) = ((Object)0);
					} 
				} while (0);
				break;
			} 
			if (ModernizedCProgram.mch_getperm(fname) < /*
				 * check if the swapfile already exists
				 *//* it does not exist */0/*
				     * Extra security check: When a swap file is a symbolic link, this
				     * is most likely a symlink attack.
				     *//*
				     * on the Amiga mch_getperm() will return -1 when the file exists
				     * but is being used by another program. This happens if you edit
				     * a file twice.
				     */) {
				break;
			} 
			if (old_fname != ((Object)0) && ModernizedCProgram.vim_fnamecmp((char_u)(fname), (char_u)(old_fname)) == /*
				 * A file name equal to old_fname is OK to use.
				 */0) {
				break;
			} 
			if (fname[n - 2] == (byte)'w' && fname[n - 1] == /* first try */(byte)'p'/*
				     * on MS-DOS compatible filesystems (e.g. messydos) file.doc.swp
				     * and file.doc are the same file. To guess if this problem is
				     * present try if file.doc.swx exists. If it does, we set
				     * buf->b_shortname and try file_doc.swp (dots replaced by
				     * underscores for this file), and try again. If it doesn't we
				     * assume that "file.doc.swp" already exists.
				     */) {
				if (!(generatedB_p_sn || generatedB_shortname)) {
					fname[n - 1] = (byte)'x';
					r = ModernizedCProgram.mch_getperm(/* try "file.swx" */fname);
					fname[n - 1] = (byte)'p';
					if (r >= /* "file.swx" seems to exist */0) {
						this.setB_shortname(1);
						ModernizedCProgram.vim_free(fname);
						fname = buf.makeswapname(buf_fname, generatedB_ffname, dir_name);
						continue;
					} 
				} 
				if (!recoverymode && buf_fname != ((Object)0) && !generatedB_help && !(generatedB_flags & (-1024 | -1024))) {
					int fd;
					block0 b0 = new block0();
					int differ = 0/*
							 * Try to read block 0 from the swap file to get the original
							 * file name (and inode number).
							 */;
					fd = ModernizedCProgram.mch_open((byte)fname, 0 | 0, 0);
					if (fd >= 0) {
						if (ModernizedCProgram.read_eintr(fd, b0, ) == ) {
							if (generatedB0_fname[900 - 2] & 4) {
								if (ModernizedCProgram.vim_fnamecmp((char_u)(ModernizedCProgram.gettail(generatedB_ffname)), (char_u)(ModernizedCProgram.gettail(generatedB0_fname))) != 0 || !ModernizedCProgram.same_directory(fname, generatedB_ffname)) {
									differ = 1;
								} 
							} else {
									ModernizedCProgram.expand_env(generatedB0_fname, ModernizedCProgram.NameBuff, /*
												     * The name in the swap file may be
												     * "~user/path/file".  Expand it first.
												     */1024);
									if (ModernizedCProgram.vim_fnamecmp((char_u)(ModernizedCProgram.NameBuff), (char_u)(generatedB_ffname)) != 0) {
										differ = 1;
									} 
							} 
						} 
						.close(fd);
					} 
					if (differ == 0 && !(generatedB_flags & /* give the ATTENTION message when there is an old swap file
							 * for the current file, and the buffer was not recovered. */-1024) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_shm, (byte)'A') == ((Object)0)) {
						int choice = 0;
						stat_T st = new stat_T();
						int did_use_dummy = 0/* Avoid getting a warning for the file being created
								     * outside of Vim, it was created at the start of this
								     * function.  Delete the file now, because Vim might exit
								     * here if the window is closed. */;
						if (dummyfd != ((Object)0)) {
							.fclose(dummyfd);
							dummyfd = ((Object)0);
							ModernizedCProgram.mch_remove(buf_fname);
							did_use_dummy = 1;
						} 
						ModernizedCProgram.process_still_running = 0;
						if ((st).vim_stat(((byte)generatedB_fname)) == 0 && ModernizedCProgram.swapfile_unchanged(fname)) {
							choice = 4;
							if (ModernizedCProgram.p_verbose > 0) {
								ModernizedCProgram.verb_msg(((byte)("Found a swap file that is not useful, deleting it"/*
										     * If there is an SwapExists autocommand and we can handle
										     * the response, trigger it.  It may return 0 to ask the
										     * user anyway.
										     */)));
							} 
						} 
						if (choice == 0 && swap_exists_action != 0 && buf.has_autocmd(auto_event.EVENT_SWAPEXISTS, buf_fname)) {
							choice = buf.do_swapexists(fname);
						} 
						if (choice == 0) {
							buf.attention_message(fname);
							got_int = 0;
							ModernizedCProgram.flush_buffers(.FLUSH_TYPEAHEAD);
						} 
						if (swap_exists_action != 0 && choice == 0) {
							char_u name = new char_u();
							name = ModernizedCProgram.alloc(.strlen((byte)(fname)) + .strlen((byte)(((byte)("Swap file \"")))) + .strlen((byte)(((byte)("\" already exists!")))) + 5);
							if (name != ((Object)0)) {
								.strcpy((byte)(name), (byte)(((byte)("Swap file \""))));
								((Object)0).home_replace(fname, name + .strlen((byte)(name)), 1000, 1);
								.strcat((byte)(name), (byte)(((byte)("\" already exists!"))));
							} 
							choice = ModernizedCProgram.do_dialog(2, (char_u)((byte)("VIM - ATTENTION")), name == ((Object)0) ? (char_u)((byte)("Swap file already exists!")) : name, ModernizedCProgram.process_still_running ? (char_u)((byte)("&Open Read-Only\n&Edit anyway\n&Recover\n&Quit\n&Abort")) : (char_u)((byte)("&Open Read-Only\n&Edit anyway\n&Recover\n&Delete it\n&Quit\n&Abort")), 1, ((Object)0), 0);
							if (ModernizedCProgram.process_still_running && choice >= 4) {
								/* Skip missing "Delete it" button */choice++;
							} 
							ModernizedCProgram.vim_free(name);
							ModernizedCProgram.msg_scrolled = /* pretend screen didn't scroll, need redraw anyway */0;
							ModernizedCProgram.redraw_all_later(40);
						} 
						if (choice > 0) {
							switch (choice) {
							case 5:
									swap_exists_action = 2;
									break;
							case 3:
									swap_exists_action = 3;
									break;
							case 2:
									break;
							case 6:
									swap_exists_action = 2;
									got_int = 1;
									break;
							case 4:
									ModernizedCProgram.mch_remove(fname);
									break;
							case 1:
									this.setB_p_ro(1);
									break;
							}
							if (ModernizedCProgram.mch_getperm(fname) < /* If the file was deleted this fname can be used. */0) {
								break;
							} 
						} else {
								ModernizedCProgram.msg_puts("\n");
								if (msg_silent == 0) {
									need_wait_return = /* call wait_return() later */1;
								} 
						} 
						if (/* Going to try another name, need the dummy file again. */did_use_dummy) {
							dummyfd = ModernizedCProgram.mch_fopen((byte)buf_fname, "w");
						} 
					} 
				} 
			} 
			if (fname[n - 1] == /*
				 * Change the ".swp" extension to find another file that can be used.
				 * First decrement the last char: ".swo", ".swn", etc.
				 * If that still isn't enough decrement the last but one char: ".svz"
				 * Can happen when editing many "No Name" buffers.
				 *//* ".s?a" */(byte)'a') {
				if (fname[n - 2] == /* ".saa": tried enough, give up */(byte)'a') {
					ModernizedCProgram.emsg(((byte)("E326: Too many swap files found")));
					do {
						if ((fname) != ((Object)0)) {
							ModernizedCProgram.vim_free(fname);
							(fname) = ((Object)0);
						} 
					} while (0);
					break;
				} 
				--fname[n - /* ".svz", ".suz", etc. */2];
				fname[n - 1] = (byte)'z' + 1;
			} 
			--fname[n - /* ".swo", ".swn", etc. */1];
		}
		ModernizedCProgram.vim_free(dir_name);
		if (dummyfd != ((Object)/* file has been created temporarily */0)) {
			.fclose(dummyfd);
			ModernizedCProgram.mch_remove(buf_fname);
		} 
		if (buf_fname != generatedB_fname) {
			ModernizedCProgram.vim_free(buf_fname);
		} 
		return fname;
	}
	/* pointer to list of directories */
	public void ml_setflags() {
		bhdr_T hp = new bhdr_T();
		ZERO_BL b0p = new ZERO_BL();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (!generatedMl_mfp) {
			return ;
		} 
		mf_hashitem_S generatedBh_hashitem = hp.getBh_hashitem();
		Object generatedMhi_key = generatedBh_hashitem.getMhi_key();
		Object generatedBh_data = hp.getBh_data();
		Object generatedB0_fname = b0p.getB0_fname();
		int generatedB_changed = this.getB_changed();
		byte generatedBh_flags = hp.getBh_flags();
		block_hdr generatedBh_prev = hp.getBh_prev();
		block_hdr generatedMf_used_last = generatedMl_mfp.getMf_used_last();
		for (hp = generatedMf_used_last; hp != ((Object)0); hp = generatedBh_prev) {
			if (generatedMhi_key == 0) {
				b0p = (ZERO_BL)(generatedBh_data);
				generatedB0_fname[900 - 1] = generatedB_changed ? -1024 : 0;
				generatedB0_fname[900 - 2] = (generatedB0_fname[900 - 2] & ~3) | (buf.get_fileformat() + 1);
				ModernizedCProgram.add_b0_fenc(b0p, buf);
				generatedBh_flags |=  1;
				generatedMl_mfp.mf_sync(8);
				break;
			} 
		}
	}
	/* max no of lines in chunk */
	/* should be half of MLCS_MAXL */
	/*
	 * Keep information for finding byte offset of a line, updtype may be one of:
	 * ML_CHNK_ADDLINE: Add len to parent chunk, possibly splitting it
	 *	   Careful: ML_CHNK_ADDLINE may cause ml_find_line() to be called.
	 * ML_CHNK_DELLINE: Subtract len from parent chunk, possibly deleting it
	 * ML_CHNK_UPDLINE: Add len to parent chunk, as a signed entity.
	 */
	public void ml_updatechunk(long line, long len, int updtype) {
		buf_T ml_upd_lastbuf = ((Object)0);
		linenr_T ml_upd_lastline = new linenr_T();
		linenr_T ml_upd_lastcurline = new linenr_T();
		int ml_upd_lastcurix;
		linenr_T curline = ml_upd_lastcurline;
		int curix = ml_upd_lastcurix;
		long size;
		chunksize_T curchnk = new chunksize_T();
		int rest;
		bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_usedchunks = generatedB_ml.getMl_usedchunks();
		if (generatedMl_usedchunks == -1 || len == 0) {
			return ;
		} 
		Object generatedMl_chunksize = generatedB_ml.getMl_chunksize();
		if (generatedMl_chunksize == ((Object)0)) {
			generatedB_ml.setMl_chunksize((chunksize_T)ModernizedCProgram.alloc( * (true)));
			if (generatedMl_chunksize == ((Object)0)) {
				generatedB_ml.setMl_usedchunks(-1);
				return ;
			} 
			generatedB_ml.setMl_numchunks(100);
			generatedB_ml.setMl_usedchunks(1);
			generatedMl_chunksize[0].setMlcs_numlines(1);
			generatedMl_chunksize[0].setMlcs_totalsize(1);
		} 
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedMl_line_len = generatedB_ml.getMl_line_len();
		if (updtype == 3 && generatedMl_line_count == 1/*
			 * First line in empty buffer from ml_flush_line() -- reset
			 */) {
			generatedB_ml.setMl_usedchunks(1);
			generatedMl_chunksize[0].setMlcs_numlines(1);
			generatedMl_chunksize[0].setMlcs_totalsize((long)generatedMl_line_len);
			return ;
		} 
		if (buf != ml_upd_lastbuf || line != ml_upd_lastline + 1 || updtype != 1) {
			for (; curix < generatedMl_usedchunks - 1 && line >= curline + generatedMl_chunksize[curix].getMlcs_numlines(); curix++) {
				curline += generatedMl_chunksize[curix].getMlcs_numlines();
			}
		}  else if (curix < generatedMl_usedchunks - 1 && line >= curline + generatedMl_chunksize[curix].getMlcs_numlines()) {
			curline += generatedMl_chunksize[curix].getMlcs_numlines();
			curix++;
		} 
		curchnk = generatedMl_chunksize + curix;
		if (updtype == 2) {
			len = -len;
		} 
		Object generatedMlcs_totalsize = curchnk.getMlcs_totalsize();
		generatedMlcs_totalsize += len;
		Object generatedMlcs_numlines = curchnk.getMlcs_numlines();
		Object generatedMl_numchunks = generatedB_ml.getMl_numchunks();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		Object generatedB_has_textprop = this.getB_has_textprop();
		Object generatedDb_index = dp.getDb_index();
		int generatedDb_txt_end = dp.getDb_txt_end();
		Object generatedDb_line_count = dp.getDb_line_count();
		int generatedDb_txt_start = dp.getDb_txt_start();
		if (updtype == 1) {
			generatedMlcs_numlines++;
			if (generatedMl_usedchunks + 1 >= generatedMl_numchunks) {
				chunksize_T t_chunksize = generatedMl_chunksize;
				generatedB_ml.setMl_numchunks(generatedMl_numchunks * 3 / 2);
				generatedB_ml.setMl_chunksize((chunksize_T).realloc((generatedMl_chunksize), ( * generatedMl_numchunks)));
				if (generatedMl_chunksize == ((Object)0)) {
					ModernizedCProgram.vim_free(/* Hmmmm, Give up on offset for this buffer */t_chunksize);
					generatedB_ml.setMl_usedchunks(-1);
					return ;
				} 
			} 
			if (generatedMlcs_numlines >= 800) {
				int count;
				int idx;
				int end_idx;
				int text_end;
				int linecnt;
				.memmove((byte)(generatedMl_chunksize + curix + 1), (byte)(generatedMl_chunksize + curix), (size_t)((generatedMl_usedchunks - curix) * ));
				size = /* Compute length of first half of lines in the split chunk */0;
				linecnt = 0;
				while (curline < generatedMl_line_count && linecnt < 400) {
					if ((hp = block_hdr.ml_find_line(buf, curline, -1024)) == ((Object)0)) {
						generatedB_ml.setMl_usedchunks(-1);
						return ;
					} 
					dp = (DATA_BL)(generatedBh_data);
					count = (long)(generatedMl_locked_high) - (long)(generatedMl_locked_low) + 1;
					idx = curline - generatedMl_locked_low;
					curline = generatedMl_locked_high + 1;
					rest = count - idx;
					if (linecnt + rest > 400) {
						end_idx = idx + 400 - linecnt - 1;
						linecnt = 400;
					} else {
							end_idx = count - 1;
							linecnt += rest;
					} 
					if (generatedB_has_textprop) {
						int i;
						for (i = end_idx; i < idx; ++i) {
							size += (int).strlen((byte)((char_u)dp + (generatedDb_index[i] & (~((int)1 << (( * 8) - 1)))))) + 1;
						}
					} else {
							if (idx == /* first line in block, text at the end */0) {
								text_end = generatedDb_txt_end;
							} else {
									text_end = ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1))));
							} 
							size += text_end - ((generatedDb_index[end_idx]) & (~((int)1 << (( * 8) - 1))));
					} 
				}
				generatedMl_chunksize[curix].setMlcs_numlines(linecnt);
				generatedMlcs_numlines -= linecnt;
				generatedMl_chunksize[curix].setMlcs_totalsize(size);
				generatedMlcs_totalsize -= size;
				generatedMl_usedchunks++;
				ml_upd_lastbuf = ((Object)/* Force recalc of curix & curline */0);
				return ;
			}  else if (generatedMlcs_numlines >= 400 && curix == generatedMl_usedchunks - 1 && generatedMl_line_count - line <= 1/*
				     * We are in the last chunk and it is cheap to crate a new one
				     * after this. Do it now to avoid the loop above later on
				     */) {
				curchnk = generatedMl_chunksize + curix + 1;
				generatedMl_usedchunks++;
				if (line == generatedMl_line_count) {
					curchnk.setMlcs_numlines(0);
					curchnk.setMlcs_totalsize(0);
				} else {
						hp = block_hdr.ml_find_line(buf, generatedMl_line_count, /*
								 * Line is just prior to last, move count for last
								 * This is the common case  when loading a new file
								 */-1024);
						if (hp == ((Object)0)) {
							generatedB_ml.setMl_usedchunks(-1);
							return ;
						} 
						dp = (DATA_BL)(generatedBh_data);
						if (generatedDb_line_count == 1) {
							rest = generatedDb_txt_end - generatedDb_txt_start;
						} else {
								rest = ((generatedDb_index[generatedDb_line_count - 2]) & (~((int)1 << (( * 8) - 1)))) - generatedDb_txt_start;
						} 
						curchnk.setMlcs_totalsize(rest);
						curchnk.setMlcs_numlines(1);
						generatedMlcs_totalsize -= rest;
						generatedMlcs_numlines -= 1;
				} 
			} 
		}  else if (updtype == 2) {
			generatedMlcs_numlines--;
			ml_upd_lastbuf = ((Object)/* Force recalc of curix & curline */0);
			if (curix < (generatedMl_usedchunks - 1) && (generatedMlcs_numlines + generatedMlcs_numlines) <= 400) {
				curix++;
				curchnk = generatedMl_chunksize + curix;
			}  else if (curix == 0 && generatedMlcs_numlines <= 0) {
				generatedMl_usedchunks--;
				.memmove((byte)(generatedMl_chunksize), (byte)(generatedMl_chunksize + 1), (size_t)(generatedMl_usedchunks * ));
				return ;
			}  else if (curix == 0 || (generatedMlcs_numlines > 10 && (generatedMlcs_numlines + generatedMlcs_numlines) > 400)) {
				return ;
			} 
			generatedMlcs_numlines += generatedMlcs_numlines;
			generatedMlcs_totalsize += generatedMlcs_totalsize;
			generatedMl_usedchunks--;
			if (curix < generatedMl_usedchunks) {
				.memmove((byte)(generatedMl_chunksize + curix), (byte)(generatedMl_chunksize + curix + 1), (size_t)((generatedMl_usedchunks - curix) * ));
			} 
			return ;
		} 
		ml_upd_lastbuf = buf;
		ml_upd_lastline = line;
		ml_upd_lastcurline = curline;
		ml_upd_lastcurix = curix/*
		 * Find offset for line or line with offset.
		 * Find line with offset if "lnum" is 0; return remaining offset in offp
		 * Find offset of line if "lnum" > 0
		 * return -1 if information is not available
		 */;
	}
	/*
	 * Open a new memline for "buf".
	 *
	 * Return FAIL for failure, OK otherwise.
	 */
	public long ml_find_line_or_offset(Object lnum, long offp) {
		linenr_T curline = new linenr_T();
		int curix;
		long size;
		bhdr_T hp = new bhdr_T();
		DATA_BL dp = new DATA_BL();
		/* number of entries in block */int count;
		int idx;
		int start_idx;
		int text_end;
		long offset;
		int len;
		int ffdos = (buf.get_fileformat() == 1);
		int extra = 0;
		/* take care of cached line first */curbuf.ml_flush_line();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_usedchunks = generatedB_ml.getMl_usedchunks();
		Object generatedMl_chunksize = generatedB_ml.getMl_chunksize();
		if (generatedMl_usedchunks == -1 || generatedMl_chunksize == ((Object)0) || lnum < 0) {
			return -1;
		} 
		if (offp == ((Object)0)) {
			offset = 0;
		} else {
				offset = offp;
		} 
		if (lnum == 0 && offset <= 0) {
			return /* Not a "find offset" and offset 0 _must_ be in line 1 */1/*
			     * Find the last chunk before the one containing our line. Last chunk is
			     * special because it will never qualify
			     */;
		} 
		curline = 1;
		curix = size = 0;
		while (curix < generatedMl_usedchunks - 1 && ((lnum != 0 && lnum >= curline + generatedMl_chunksize[curix].getMlcs_numlines()) || (offset != 0 && offset > size + generatedMl_chunksize[curix].getMlcs_totalsize() + ffdos * generatedMl_chunksize[curix].getMlcs_numlines()))) {
			curline += generatedMl_chunksize[curix].getMlcs_numlines();
			size += generatedMl_chunksize[curix].getMlcs_totalsize();
			if (offset && ffdos) {
				size += generatedMl_chunksize[curix].getMlcs_numlines();
			} 
			curix++;
		}
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		block_hdr block_hdr = new block_hdr();
		Object generatedBh_data = hp.getBh_data();
		Object generatedMl_locked_high = generatedB_ml.getMl_locked_high();
		Object generatedMl_locked_low = generatedB_ml.getMl_locked_low();
		int generatedDb_txt_end = dp.getDb_txt_end();
		Object generatedDb_index = dp.getDb_index();
		Object generatedB_has_textprop = this.getB_has_textprop();
		while ((lnum != 0 && curline < lnum) || (offset != 0 && size < offset)) {
			if (curline > generatedMl_line_count || (hp = block_hdr.ml_find_line(buf, curline, -1024)) == ((Object)0)) {
				return -1;
			} 
			dp = (DATA_BL)(generatedBh_data);
			count = (long)(generatedMl_locked_high) - (long)(generatedMl_locked_low) + 1;
			start_idx = idx = curline - generatedMl_locked_low;
			if (idx == /* first line in block, text at the end */0) {
				text_end = generatedDb_txt_end;
			} else {
					text_end = ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1))));
			} 
			if (lnum != /* Compute index of last line to use in this MEMLINE */0) {
				if (curline + (count - idx) >= lnum) {
					idx += lnum - curline - 1;
				} else {
						idx = count - 1;
				} 
			} else {
					extra = 0;
					while (offset >= size + text_end - (int)((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1)))) + ffdos) {
						if (ffdos) {
							size++;
						} 
						if (idx == count - 1) {
							extra = 1;
							break;
						} 
						idx++;
					}
			} 
			if (generatedB_has_textprop) {
				int i;
				len = 0;
				for (i = start_idx; i <= idx; ++i) {
					len += (int).strlen((byte)((char_u)dp + ((generatedDb_index[i]) & (~((int)1 << (( * 8) - 1)))))) + 1;
				}
			} else {
					len = text_end - ((generatedDb_index[idx]) & (~((int)1 << (( * 8) - 1))));
			} 
			size += len;
			if (offset != 0 && size >= offset) {
				if (size + ffdos == offset) {
					offp = 0;
				}  else if (idx == start_idx) {
					offp = offset - size + len;
				} else {
						offp = offset - size + len - (text_end - ((generatedDb_index[idx - 1]) & (~((int)1 << (( * 8) - 1)))));
				} 
				curline += idx - start_idx + extra;
				if (curline > generatedMl_line_count) {
					return -/* exactly one byte beyond the end */1;
				} 
				return curline;
			} 
			curline = generatedMl_locked_high + 1;
		}
		int generatedB_p_fixeol = this.getB_p_fixeol();
		int generatedB_p_bin = this.getB_p_bin();
		int generatedB_p_eol = this.getB_p_eol();
		if (lnum != 0) {
			if (/* Count extra CR characters. */ffdos) {
				size += lnum - 1;
			} 
			if ((!generatedB_p_fixeol || generatedB_p_bin) && !generatedB_p_eol && lnum > generatedMl_line_count) {
				size -= ffdos + 1;
			} 
		} 
		return size/*
		 * Goto byte in buffer with offset 'cnt'.
		 */;
	}
	public void mf_close_file(int getlines) {
		/* get all lines into memory? */memfile_T mfp = new memfile_T();
		linenr_T lnum = new linenr_T();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		mfp = generatedMl_mfp;
		int generatedMf_fd = mfp.getMf_fd();
		if (mfp == ((Object)0) || generatedMf_fd < /* nothing to close */0) {
			return ;
		} 
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (getlines) {
			mf_dont_release = /* get all blocks in memory by accessing all lines (clumsy!) */1;
			for (lnum = 1; lnum <= generatedMl_line_count; ++lnum) {
				(Object)buf.ml_get_buf(lnum, 0);
			}
			mf_dont_release = 0/* TODO: should check if all blocks are really in core */;
		} 
		if (.close(generatedMf_fd) < /* close the file */0) {
			ModernizedCProgram.emsg(((byte)(e_swapclose)));
		} 
		mfp.setMf_fd(-1);
		Object generatedMf_fname = mfp.getMf_fname();
		Object generatedMf_ffname = mfp.getMf_ffname();
		if (generatedMf_fname != ((Object)0)) {
			ModernizedCProgram.mch_remove(generatedMf_fname);
			do {
				if ((generatedMf_fname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedMf_fname);
					(generatedMf_fname) = ((Object)0);
				} 
			} while (0);
			do {
				if ((generatedMf_ffname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedMf_ffname);
					(generatedMf_ffname) = ((Object)0);
				} 
			} while (0/*
			 * Set new size for a memfile.  Used when block 0 of a swapfile has been read
			 * and the size it indicates differs from what was guessed.
			 */);
		} 
	}
	public int check_readonly(int forceit) {
		stat_T st = new stat_T();
		/* Handle a file being readonly when the 'readonly' option is set or when
		     * the file exists and permissions are read-only.
		     * We will send 0777 to check_file_readonly(), as the "perm" variable is
		     * important for device checks but not here. */
		int generatedB_p_ro = this.getB_p_ro();
		Object generatedB_ffname = this.getB_ffname();
		Object generatedB_fname = this.getB_fname();
		if (!forceit && (generatedB_p_ro || ((st).vim_stat(((byte)generatedB_ffname)) >= 0 && ModernizedCProgram.check_file_readonly(generatedB_ffname, 777)))) {
			if ((p_confirm || ModernizedCProgram.cmdmod.getConfirm()) && generatedB_fname != ((Object)0)) {
				char_u[] buff = new char_u();
				if (generatedB_p_ro) {
					ModernizedCProgram.dialog_msg(buff, ((byte)("'readonly' option is set for \"%s\".\nDo you wish to write anyway?")), generatedB_fname);
				} else {
						ModernizedCProgram.dialog_msg(buff, ((byte)("File permissions of \"%s\" are read-only.\nIt may still be possible to write it.\nDo you wish to try?")), generatedB_fname);
				} 
				if (ModernizedCProgram.vim_dialog_yesno(4, ((Object)0), buff, 2) == 2) {
					forceit = /* Set forceit, to force the writing of a readonly file */1;
					return 0;
				} else {
						return 1;
				} 
			}  else if (generatedB_p_ro) {
				ModernizedCProgram.emsg(((byte)(e_readonly)));
			} else {
					ModernizedCProgram.semsg(((byte)("E505: \"%s\" is read-only (add ! to override)")), generatedB_fname);
			} 
			return 1;
		} 
		return 0/*
		 * Try to abandon the current file and edit a new or existing file.
		 * "fnum" is the number of the file, if zero use "ffname_arg"/"sfname_arg".
		 * "lnum" is the line number for the cursor in the new file (if non-zero).
		 *
		 * Return:
		 * GETFILE_ERROR for "normal" error,
		 * GETFILE_NOT_WRITTEN for "not written" error,
		 * GETFILE_SAME_FILE for success
		 * GETFILE_OPEN_OTHER for successfully opening another file.
		 */;
	}
	public void diff_buf_delete() {
		int i;
		tabpage_T tp = new tabpage_T();
		Object generatedTp_diffbuf = tp.getTp_diffbuf();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			i = ModernizedCProgram.diff_buf_idx_tp(buf, tp);
			if (i != 8) {
				generatedTp_diffbuf[i] = ((Object)0);
				tp.setTp_diff_invalid(1);
				if (tp == ModernizedCProgram.curtab) {
					ModernizedCProgram.diff_redraw(1/*
					 * Check if the current buffer should be added to or removed from the list of
					 * diff buffers.
					 */);
				} 
			} 
		}
	}
	public void diff_buf_add() {
		int i;
		if (buf.diff_buf_idx() != 8) {
			return ;
		} 
		for (i = 0; i < 8; ++i) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[i] == ((Object)0)) {
				ModernizedCProgram.curtab.getTp_diffbuf()[i] = buf;
				ModernizedCProgram.curtab.setTp_diff_invalid(1);
				ModernizedCProgram.diff_redraw(1);
				return ;
			} 
		}
		ModernizedCProgram.semsg(((byte)("E96: Cannot diff more than %d buffers")), 8/*
		 * Remove all buffers to make diffs for.
		 */);
	}
	public int diff_buf_idx() {
		int idx;
		for (idx = 0; idx < 8; ++idx) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[idx] == buf) {
				break;
			} 
		}
		return idx/*
		 * Find buffer "buf" in the list of diff buffers for tab page "tp".
		 * Return its index or DB_COUNT if not found.
		 */;
	}
	public void diff_invalidate() {
		tabpage_T tp = new tabpage_T();
		int i;
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			i = ModernizedCProgram.diff_buf_idx_tp(buf, tp);
			if (i != 8) {
				tp.setTp_diff_invalid(1);
				if (tp == ModernizedCProgram.curtab) {
					ModernizedCProgram.diff_redraw(1);
				} 
			} 
		}
	}
	public int diff_mode_buf() {
		tabpage_T tp = new tabpage_T();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
			if (ModernizedCProgram.diff_buf_idx_tp(buf, tp) != 8) {
				return 1;
			} 
		}
		return 0/*
		 * Move "count" times in direction "dir" to the next diff block.
		 * Return FAIL if there isn't such a diff block.
		 */;
	}
	public Object diff_get_corresponding_line_int(Object lnum1) {
		int idx1;
		int idx2;
		diff_T dp = new diff_T();
		int baseline = 0;
		idx1 = buf1.diff_buf_idx();
		idx2 = curbuf.diff_buf_idx();
		if (idx1 == 8 || idx2 == 8 || ModernizedCProgram.curtab.getTp_first_diff() == ((Object)0)) {
			return lnum1;
		} 
		if (ModernizedCProgram.curtab.getTp_diff_invalid()) {
			((Object)/* update after a big change */0).ex_diffupdate();
		} 
		if (ModernizedCProgram.curtab.getTp_first_diff() == ((Object)/* no diffs today */0)) {
			return lnum1;
		} 
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); dp = generatedDf_next) {
			if (generatedDf_lnum[idx1] > lnum1) {
				return lnum1 - baseline;
			} 
			if ((generatedDf_lnum[idx1] + generatedDf_count[idx1]) > lnum1) {
				baseline = lnum1 - generatedDf_lnum[/* Inside the diffblock */idx1];
				if (baseline > generatedDf_count[idx2]) {
					baseline = generatedDf_count[idx2];
				} 
				return generatedDf_lnum[idx2] + baseline;
			} 
			if ((generatedDf_lnum[idx1] == lnum1) && (generatedDf_count[idx1] == 0) && (generatedDf_lnum[idx2] <= ModernizedCProgram.curwin.getW_cursor().getLnum()) && ((generatedDf_lnum[idx2] + generatedDf_count[idx2]) > ModernizedCProgram.curwin.getW_cursor().getLnum())) {
				return ModernizedCProgram.curwin.getW_cursor().getLnum();
			} 
			baseline = (generatedDf_lnum[idx1] + generatedDf_count[idx1]) - (generatedDf_lnum[idx2] + generatedDf_count[idx2]);
		}
		return lnum1 - /* If we get here then the cursor is after the last diff */baseline/*
		 * Return the line number in the current window that is closest to "lnum1" in
		 * "buf1" in diff mode.  Checks the line number to be valid.
		 */;
	}
	public Object diff_get_corresponding_line(Object lnum1) {
		linenr_T lnum = buf1.diff_get_corresponding_line_int(lnum1);
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (lnum > generatedMl_line_count) {
			return generatedMl_line_count;
		} 
		return lnum/*
		 * For line "lnum" in the current window find the equivalent lnum in window
		 * "wp", compensating for inserted/deleted lines.
		 */;
	}
	public void redraw_buf_later(int type) {
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_buffer == buf) {
				wp.redraw_win_later(type);
			} 
		}
	}
	public void redraw_buf_line_later(Object lnum) {
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedW_topline = wp.getW_topline();
		Object generatedW_botline = wp.getW_botline();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedW_buffer == buf && lnum >= generatedW_topline && lnum < generatedW_botline) {
				wp.redrawWinline(lnum);
			} 
		}
	}
	// Don't redraw while the command line completion is displayed, it
	public void aubuflocal_remove() {
		AutoPat ap = new AutoPat();
		event_T event = new event_T();
		AutoPatCmd apc = new AutoPatCmd();
		int generatedB_fnum = this.getB_fnum();
		int generatedArg_bufnr = apc.getArg_bufnr();
		AutoPatCmd generatedNext = apc.getNext();
		// invalidate currently executing autocommandsfor (apc = ModernizedCProgram.active_apc_list; apc; apc = generatedNext) {
			if (generatedB_fnum == generatedArg_bufnr) {
				apc.setArg_bufnr(0);
			} 
		}
		int generatedBuflocal_nr = ap.getBuflocal_nr();
		// invalidate buflocals looping through eventsfor (event = (event_T)0; (int)event < (int)auto_event.NUM_EVENTS; event = (event_T)((int)event + 1)) {
			for (ap = ModernizedCProgram.first_autopat[(int)event]; ap != ((Object)0); ap = generatedNext) {
				if (generatedBuflocal_nr == generatedB_fnum) {
					ap.au_remove_pat();
					if (ModernizedCProgram.p_verbose >= 6) {
						ModernizedCProgram.verbose_enter();
						ModernizedCProgram.smsg(((byte)("auto-removing autocommand: %s <buffer=%d>")), ModernizedCProgram.event_nr2name(event), generatedB_fnum);
						ModernizedCProgram.verbose_leave();
					} 
				} 
			}
		}
		ModernizedCProgram.au_cleanup();
	}
	public int apply_autocmds(auto_event event, Object fname, Object fname_io, int force) {
		// when TRUE, ignore autocmd_busy// buffer for <abuf>return ModernizedCProgram.apply_autocmds_group(event, fname, fname_io, force, -3, buf, ((Object)0/*
		 * Like apply_autocmds(), but with extra "eap" argument.  This takes care of
		 * setting v:filearg.
		 */));
	}
	// NULL or empty means use actual file name
	// fname to use for <afile> on cmdline
	public int apply_autocmds_retval(auto_event event, Object fname, Object fname_io, int force, int retval) {
		// when TRUE, ignore autocmd_busy// buffer for <abuf>// pointer to caller's retvalint did_cmd;
		if (ModernizedCProgram.should_abort(retval)) {
			return 0;
		} 
		did_cmd = ModernizedCProgram.apply_autocmds_group(event, fname, fname_io, force, -3, buf, ((Object)0));
		if (did_cmd && ModernizedCProgram.aborting()) {
			retval = 0;
		} 
		return did_cmd/*
		 * Return TRUE when there is a CursorHold autocommand defined.
		 */;
	}
	// NULL or empty means use actual file name
	// fname to use for <afile> on cmdline
	public int has_autocmd(auto_event event, Object sfname) {
		AutoPat ap = new AutoPat();
		char_u fname = new char_u();
		char_u tail = ModernizedCProgram.gettail(sfname);
		int retval = 0;
		fname = ModernizedCProgram.FullName_save(sfname, 0);
		if (fname == ((Object)0)) {
			return 0/*
			     * Replace all backslashes with forward slashes.  This makes the
			     * autocommand patterns portable between Unix and MS-DOS.
			     */;
		} 
		sfname = ModernizedCProgram.vim_strsave(sfname);
		if (sfname != ((Object)0)) {
			ModernizedCProgram.forward_slash(sfname);
		} 
		ModernizedCProgram.forward_slash(fname);
		Object generatedPat = ap.getPat();
		AutoCmd generatedCmds = ap.getCmds();
		int generatedBuflocal_nr = ap.getBuflocal_nr();
		regprog generatedReg_prog = ap.getReg_prog();
		byte generatedAllow_dirs = ap.getAllow_dirs();
		int generatedB_fnum = this.getB_fnum();
		AutoPat generatedNext = ap.getNext();
		for (ap = ModernizedCProgram.first_autopat[(int)event]; ap != ((Object)0); ap = generatedNext) {
			if (generatedPat != ((Object)0) && generatedCmds != ((Object)0) && (generatedBuflocal_nr == 0 ? generatedReg_prog.match_file_pat(((Object)0), fname, sfname, tail, generatedAllow_dirs) : buf != ((Object)0) && generatedBuflocal_nr == generatedB_fnum)) {
				retval = 1;
				break;
			} 
		}
		ModernizedCProgram.vim_free(fname);
		ModernizedCProgram.vim_free(sfname);
		return retval/*
		 * Function given to ExpandGeneric() to obtain the list of autocommand group
		 * names.
		 */;
	}
	public file_buffer qf_find_buf(qf_info_S qi) {
		tabpage_T tp = new tabpage_T();
		win_T win = new win_T();
		int generatedQf_bufnr = qi.getQf_bufnr();
		file_buffer file_buffer = new file_buffer();
		if (generatedQf_bufnr != (false)) {
			buf_T qfbuf = new buf_T();
			qfbuf = file_buffer.buflist_findnr(generatedQf_bufnr);
			if (qfbuf != ((Object)0)) {
				return qfbuf;
			} 
			qi.setQf_bufnr((false));
		} 
		file_buffer generatedW_buffer = win.getW_buffer();
		window_S generatedW_next = (win).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
			for ((win) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (win); (win) = generatedW_next) {
				if (ModernizedCProgram.is_qf_win(win, qi)) {
					return generatedW_buffer;
				} 
			}
		}
		return ((Object)0/*
		 * Update the w:quickfix_title variable in the quickfix/location list window
		 */);
	}
	public file_buffer vgr_load_dummy_buf(Object fname, Object dirname_start, Object dirname_now) {
		int save_mls;
		char_u save_ei = ((Object)0);
		buf_T buf = new buf_T();
		// Don't do Filetype autocommands to avoid loading syntax and// indent scripts, a great speed improvement.// Don't do Filetype autocommands to avoid loading syntax and// indent scripts, a great speed improvement.save_ei = ModernizedCProgram.au_event_disable(",Filetype");
		// Don't use modelines here, it's useless.// Don't use modelines here, it's useless.save_mls = ModernizedCProgram.p_mls;
		ModernizedCProgram.p_mls = 0// Load file into a buffer, so that 'fileencoding' is detected,;// Load file into a buffer, so that 'fileencoding' is detected,
		file_buffer file_buffer = new file_buffer();
		// autocommands applied, etc.// autocommands applied, etc.buf = file_buffer.load_dummy_buffer(fname, dirname_start, dirname_now);
		ModernizedCProgram.p_mls = save_mls;
		ModernizedCProgram.au_event_restore(save_ei);
		return buf/*
		 * Check whether a quickfix/location list is valid. Autocmds may remove or
		 * change a quickfix list when vimgrep is running. If the list is not found,
		 * create a new list.
		 */;
	}
	public file_buffer load_dummy_buffer(Object fname, Object dirname_start, Object resulting_dir) {
		// out: new directorybuf_T newbuf = new buf_T();
		bufref_T newbufref = new bufref_T();
		bufref_T newbuf_to_wipe = new bufref_T();
		int failed = 1;
		aco_save_T aco = new aco_save_T();
		int readfile_result;
		file_buffer file_buffer = new file_buffer();
		// Allocate a buffer without putting it in the buffer list.// Allocate a buffer without putting it in the buffer list.newbuf = file_buffer.buflist_new(((Object)0), ((Object)0), (linenr_T)1, 4);
		if (newbuf == ((Object)0)) {
			return ((Object)0);
		} 
		ModernizedCProgram.set_bufref(newbufref, newbuf);
		// Init the options.// Init the options.newbuf.buf_copy_options(1 | 4);
		int generatedB_locked = newbuf.getB_locked();
		int generatedB_flags = curbuf.getB_flags();
		Object generatedBr_buf = newbuf_to_wipe.getBr_buf();
		// need to open the memfile before putting the buffer in a windowif (newbuf.ml_open() == 1) {
			++generatedB_locked;
			ModernizedCProgram.aucmd_prepbuf(aco, newbuf);
			(Object)curbuf.setfname(fname, ((Object)0), 0);
			ModernizedCProgram.check_need_swap(1);
			generatedB_flags &=  ~-1024;
			newbuf_to_wipe.setBr_buf(((Object)0));
			readfile_result = ((Object)0).readfile(fname, ((Object)0), (linenr_T)0, (linenr_T)0, (linenr_T)LONG_MAX, -1024 | -1024);
			--generatedB_locked;
			if (readfile_result == 1 && !got_int && !(generatedB_flags & -1024)) {
				failed = 0;
				if (curbuf != newbuf) {
					ModernizedCProgram.set_bufref(newbuf_to_wipe, newbuf);
					newbuf = curbuf;
				} 
			} 
			aco.aucmd_restbuf();
			if (generatedBr_buf != ((Object)0) && newbuf_to_wipe.bufref_valid()) {
				generatedBr_buf.wipe_buffer(0);
			} 
			generatedB_flags |=  -1024;
		} 
		// Let the caller know what the resulting dir was first, in case it is// important.// Let the caller know what the resulting dir was first, in case it is// important.ModernizedCProgram.mch_dirname(resulting_dir, 1024);
		ModernizedCProgram.restore_start_dir(dirname_start);
		if (!newbufref.bufref_valid()) {
			return ((Object)0);
		} 
		if (failed) {
			newbuf.wipe_dummy_buffer(dirname_start);
			return ((Object)0);
		} 
		return newbuf/*
		 * Wipe out the dummy buffer that load_dummy_buffer() created. Restores
		 * directory to "dirname_start" prior to returning, if autocmds or the
		 * 'autochdir' option have changed it.
		 */;
	}
	// in: old directory
	public void wipe_dummy_buffer(Object dirname_start) {
		// safety checkif (curbuf != buf) {
			cleanup_T cs = new cleanup_T();
			cs.enter_cleanup();
			buf.wipe_buffer(0);
			cs.leave_cleanup();
			ModernizedCProgram.restore_start_dir(dirname_start/*
			 * Unload the dummy buffer that load_dummy_buffer() created. Restores
			 * directory to "dirname_start" prior to returning, if autocmds or the
			 * 'autochdir' option have changed it.
			 */);
		} 
	}
	public void unload_dummy_buffer(Object dirname_start) {
		// safety checkif (curbuf != buf) {
			ModernizedCProgram.close_buffer(((Object)0), buf, 2, 0);
			ModernizedCProgram.restore_start_dir(dirname_start/*
			 * Copy the specified quickfix entry items into a new dict and appened the dict
			 * to 'list'.  Returns OK on success.
			 */);
		} 
	}
	/*
	 * Get a line number from 'obj' and convert it to vim's range.
	 */
	public int tclgetlinenum(Object interp, Object obj, int valueP) {
		int err;
		int i;
		byte[] keyw = new byte[]{"begin", "bottom", "end", "first", "last", "start", "top", (byte)0};
		err = .Tcl_GetIndexFromObj(interp, obj, keyw, "", 0, i);
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (err == TCL_OK) {
			switch (i) {
			case .LN_BEGIN:
			case .LN_START:
			case .LN_FIRST:
			case .LN_END:
			case .LN_LAST:
					valueP = generatedMl_line_count;
					break;
			case .LN_TOP:
					valueP = 1;
					break;
			case .LN_BOTTOM:
			}
			return TCL_OK;
		} 
		.Tcl_ResetResult(interp);
		err = .Tcl_GetIntFromObj(interp, obj, i);
		if (err != TCL_OK) {
			return err;
		} 
		i = ((i) + (ModernizedCProgram.tclinfo.getLbase() == 0));
		if (i < 1 || i > generatedMl_line_count) {
			.Tcl_SetResult(interp, ((byte)("line number out of range")), TCL_STATIC);
			return TCL_ERROR;
		} 
		valueP = i;
		return TCL_OK/*
		 * Find the first window in the window list that displays the buffer.
		 */;
	}
	public Byte tclgetbuffer(Object interp) {
		Object generatedB_tcl_ref = this.getB_tcl_ref();
		return ModernizedCProgram.tclgetref(interp, (generatedB_tcl_ref), "buf", (Object)buf, bufselfcmd);
	}
	public void tcl_buffer_free() {
		ref reflist = new ref();
		/* Not using Tcl, nothing to do. */
		Object generatedB_tcl_ref = this.getB_tcl_ref();
		reflist = (ref)(generatedB_tcl_ref);
		if (reflist != ModernizedCProgram.refsdeleted) {
			this.setB_tcl_ref((Object)ModernizedCProgram.refsdeleted);
			reflist.tcldelallrefs();
			this.setB_tcl_ref(((Object)0));
		} 
	}
	/*
	 * If 'autowrite' option set, try to write the file.
	 * Careful: autocommands may make "buf" invalid!
	 *
	 * return FAIL for failure, OK otherwise
	 */
	public int autowrite(int forceit) {
		int r;
		bufref_T bufref = new bufref_T();
		int generatedB_p_ro = this.getB_p_ro();
		Object generatedB_ffname = this.getB_ffname();
		if (!(ModernizedCProgram.p_aw || ModernizedCProgram.p_awa) || !ModernizedCProgram.p_write || /* never autowrite a "nofile" or "nowrite" buffer */buf.bt_dontwrite() || (!forceit && generatedB_p_ro) || generatedB_ffname == ((Object)0)) {
			return 0;
		} 
		ModernizedCProgram.set_bufref(bufref, buf);
		r = buf.buf_write_all(forceit);
		if (bufref.bufref_valid() && /* Writing may succeed but the buffer still changed, e.g., when there is a
		     * conversion error.  We do want to return FAIL then. */buf.bufIsChanged()) {
			r = 0;
		} 
		return r/*
		 * Flush all buffers, except the ones that are readonly or are never written.
		 */;
	}
	public int check_changed(int flags) {
		int forceit = (flags & 4);
		bufref_T bufref = new bufref_T();
		ModernizedCProgram.set_bufref(bufref, buf);
		int generatedB_nwindows = this.getB_nwindows();
		Object generatedB_ffname = buf2.getB_ffname();
		file_buffer generatedB_next = buf2.getB_next();
		if (!forceit && buf.bufIsChanged() && ((flags & 2) || generatedB_nwindows <= 1) && (!(flags & 1) || buf.autowrite(forceit) == 0)) {
			if ((p_confirm || ModernizedCProgram.cmdmod.getConfirm()) && ModernizedCProgram.p_write) {
				buf_T buf2 = new buf_T();
				int count = 0;
				if (flags & 8) {
					for (buf2 = firstbuf; buf2 != ((Object)0); buf2 = generatedB_next) {
						if (buf2.bufIsChanged() && (generatedB_ffname != ((Object)0))) {
							++count;
						} 
					}
				} 
				if (!bufref.bufref_valid()) {
					return /* Autocommand deleted buffer, oops!  It's not changed now. */0;
				} 
				buf.dialog_changed(count > 1);
				if (!bufref.bufref_valid()) {
					return /* Autocommand deleted buffer, oops!  It's not changed now. */0;
				} 
				return buf.bufIsChanged();
			} 
			if (flags & 16) {
				ModernizedCProgram.no_write_message();
			} else {
					curbuf.no_write_message_nobang();
			} 
			return 1;
		} 
		return 0;/*
		 * When wanting to write a file without a file name, ask the user for a name.
		 */
	}
	/*
	 * Ask the user what to do when abandoning a changed buffer.
	 * Must check 'write' option first!
	 */
	public void dialog_changed(int checkall) {
		char_u[] buff = new char_u();
		int ret;
		buf_T buf2 = new buf_T();
		exarg_T ea = new exarg_T();
		Object generatedB_fname = this.getB_fname();
		ModernizedCProgram.dialog_msg(buff, ((byte)("Save changes to \"%s\"?")), generatedB_fname);
		if (checkall) {
			ret = ModernizedCProgram.vim_dialog_yesnoallcancel(4, ((Object)0), buff, 1);
		} else {
				ret = ModernizedCProgram.vim_dialog_yesnocancel(4, ((Object)0), buff, 1);
		} 
		// function.// function..memset((ea), (false), ());
		Object generatedB_ffname = this.getB_ffname();
		int generatedB_p_ro = buf2.getB_p_ro();
		file_buffer generatedB_next = buf2.getB_next();
		if (ret == 2) {
			if (generatedB_fname != ((Object)0) && ModernizedCProgram.check_overwrite(ea, /* May get file name, when there is none */buf, generatedB_fname, generatedB_ffname, 0) == 1) {
				(Object)buf.buf_write_all(/* didn't hit Cancel */0);
			} 
		}  else if (ret == 3) {
			buf.unchanged(1, 0);
		}  else if (ret == 5/*
			 * Write all modified files that can be written.
			 * Skip readonly buffers, these need to be confirmed
			 * individually.
			 */) {
			for (buf2 = firstbuf; buf2 != ((Object)0); buf2 = generatedB_next) {
				if (buf2.bufIsChanged() && (generatedB_ffname != ((Object)0)) && !generatedB_p_ro) {
					bufref_T bufref = new bufref_T();
					ModernizedCProgram.set_bufref(bufref, buf2/* May get file name, when there is none */);
					if (generatedB_fname != ((Object)0) && ModernizedCProgram.check_overwrite(ea, buf2, generatedB_fname, generatedB_ffname, 0) == 1) {
						(Object)buf2.buf_write_all(/* didn't hit Cancel */0);
					} 
					if (!/* an autocommand may have deleted the buffer */bufref.bufref_valid()) {
						buf2 = firstbuf;
					} 
				} 
			}
		}  else if (ret == 6/*
			 * mark all buffers as unchanged
			 */) {
			for (buf2 = firstbuf; buf2 != ((Object)0); buf2 = generatedB_next) {
				buf2.unchanged(1, 0/*
				 * Return TRUE if the buffer "buf" can be abandoned, either by making it
				 * hidden, autowriting it or unloading it.
				 */);
			}
		} 
	}
	public int can_abandon(int forceit) {
		int generatedB_nwindows = this.getB_nwindows();
		return (buf.buf_hide() || !buf.bufIsChanged() || generatedB_nwindows > 1 || buf.autowrite(forceit) == 1 || forceit/*
		 * Add a buffer number to "bufnrs", unless it's already there.
		 */);
	}
	public int buf_write_all(int forceit) {
		int retval;
		buf_T old_curbuf = curbuf;
		Object generatedB_ffname = this.getB_ffname();
		Object generatedB_fname = this.getB_fname();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		retval = (ModernizedCProgram.buf_write(buf, generatedB_ffname, generatedB_fname, (linenr_T)1, generatedMl_line_count, ((Object)0), 0, forceit, 1, 0));
		if (curbuf != old_curbuf) {
			ModernizedCProgram.msg_source(ModernizedCProgram.highlight_attr[(int)(.HLF_W)]);
			ModernizedCProgram.msg(((byte)("Warning: Entered other buffer unexpectedly (check autocommands)")));
		} 
		return retval/*
		 * ":argdo", ":windo", ":bufdo", ":tabdo", ":cdo", ":ldo", ":cfdo" and ":lfdo"
		 */;
	}
	public void filemess(Object name, Object s, int attr) {
		int msg_scroll_save;
		int prev_msg_col = ModernizedCProgram.msg_col;
		if (msg_silent != 0) {
			return ;
		} 
		buf.msg_add_fname(/* put file name in IObuff with quotes */name);
		if (.strlen((byte)(ModernizedCProgram.IObuff)) > (1024 + 1) - /* If it's extremely long, truncate it. */80) {
			ModernizedCProgram.IObuff[(1024 + 1) - 80] = (byte)'\000';
		} 
		.strcat((byte)(ModernizedCProgram.IObuff), (byte)(s/*
		     * For the first message may have to start a new line.
		     * For further ones overwrite the previous one, reset msg_scroll before
		     * calling filemess().
		     */));
		msg_scroll_save = msg_scroll;
		if (ModernizedCProgram.shortmess((byte)'O') && !exiting && ModernizedCProgram.p_verbose == 0) {
			msg_scroll = 0;
		} 
		if (!/* wait a bit when overwriting an error msg */msg_scroll) {
			.check_for_delay(0);
		} 
		ModernizedCProgram.msg_start();
		if (prev_msg_col != 0 && ModernizedCProgram.msg_col == 0) {
			ModernizedCProgram.msg_putchar((byte)'\r');
		} 
		msg_scroll = msg_scroll_save;
		msg_scrolled_ign = 1;
		ModernizedCProgram.msg_outtrans_attr(ModernizedCProgram.msg_may_trunc(0, ModernizedCProgram.IObuff), /* may truncate the message to avoid a hit-return prompt */attr);
		ModernizedCProgram.msg_clr_eos();
		ModernizedCProgram.out_flush();
		msg_scrolled_ign = 0/*
		 * Read lines from file "fname" into the buffer after line "from".
		 *
		 * 1. We allocate blocks with lalloc, as big as possible.
		 * 2. Each block is filled with characters from the file with a single read().
		 * 3. The lines are inserted in the buffer with ml_append().
		 *
		 * (caller must check that fname != NULL, unless READ_STDIN is used)
		 *
		 * "lines_to_skip" is the number of lines that must be skipped
		 * "lines_to_read" is the number of lines that are appended
		 * When not recovering lines_to_skip is 0 and lines_to_read MAXLNUM.
		 *
		 * flags:
		 * READ_NEW	starting to edit a new buffer
		 * READ_FILTER	reading filter output
		 * READ_STDIN	read from stdin instead of a file
		 * READ_BUFFER	read from curbuf instead of a file (converting after reading
		 *		stdin)
		 * READ_DUMMY	read into a dummy buffer (to check if file contents changed)
		 * READ_KEEP_UNDO  don't clear undo info or read it from a file
		 * READ_FIFO	read from fifo/socket instead of a file
		 *
		 * return FAIL for failure, NOTDONE for directory (failure), or OK
		 */;
	}
	public void msg_add_fname(Object fname) {
		if (fname == ((Object)0)) {
			fname = (char_u)"-stdin-";
		} 
		buf.home_replace(fname, ModernizedCProgram.IObuff + 1, (1024 + 1) - 4, 1);
		ModernizedCProgram.IObuff[0] = (byte)'"';
		.strcat((byte)(ModernizedCProgram.IObuff), (byte)("\" "/*
		 * Append message for text mode to IObuff.
		 * Return TRUE if something appended.
		 */));
	}
	public void shorten_buf_fname(Object dirname, int force) {
		char_u p = new char_u();
		Object generatedB_fname = this.getB_fname();
		Object generatedB_sfname = this.getB_sfname();
		Object generatedB_ffname = this.getB_ffname();
		if (generatedB_fname != ((Object)0) && !buf.bt_nofilename() && !ModernizedCProgram.path_with_url(generatedB_fname) && (force || generatedB_sfname == ((Object)0) || ModernizedCProgram.mch_isFullName(generatedB_sfname))) {
			if (generatedB_sfname != generatedB_ffname) {
				do {
					if ((generatedB_sfname) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedB_sfname);
						(generatedB_sfname) = ((Object)0);
					} 
				} while (0);
			} 
			p = ModernizedCProgram.shorten_fname(generatedB_ffname, dirname);
			if (p != ((Object)0)) {
				this.setB_sfname(ModernizedCProgram.vim_strsave(p));
				this.setB_fname(generatedB_sfname);
			} 
			if (p == ((Object)0) || generatedB_fname == ((Object)0)) {
				this.setB_fname(generatedB_ffname);
			} 
		} 
	}
	public int move_lines(file_buffer tobuf) {
		buf_T tbuf = curbuf;
		int retval = 1;
		linenr_T lnum = new linenr_T();
		char_u p = new char_u();
		curbuf = /* Copy the lines in "frombuf" to "tobuf". */tobuf;
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		for (lnum = 1; lnum <= generatedMl_line_count; ++lnum) {
			p = ModernizedCProgram.vim_strsave(frombuf.ml_get_buf(lnum, 0));
			if (p == ((Object)0) || ModernizedCProgram.ml_append(lnum - 1, p, 0, 0) == 0) {
				ModernizedCProgram.vim_free(p);
				retval = 0;
				break;
			} 
			ModernizedCProgram.vim_free(p);
		}
		if (retval != /* Delete all the lines in "frombuf". */0) {
			curbuf = frombuf;
			for (lnum = generatedMl_line_count; lnum > 0; --lnum) {
				if (ModernizedCProgram.ml_delete(lnum, 0) == 0) {
					retval = /* Oops!  We could try putting back the saved lines, but that
							 * might fail again... */0;
					break;
				} 
			}
		} 
		curbuf = tbuf;
		return retval/*
		 * Check if buffer "buf" has been changed.
		 * Also check if the file for a new buffer unexpectedly appeared.
		 * return 1 if a changed buffer was found.
		 * return 2 if a message has been displayed.
		 * return 0 otherwise.
		 */;
	}
	public int buf_check_timestamp(int focus) {
		/* called for GUI focus event */stat_T st = new stat_T();
		int stat_res;
		int retval = 0;
		char_u path = new char_u();
		byte tbuf;
		byte mesg = ((Object)0);
		byte mesg2 = "";
		int helpmesg = 0;
		int reload = 0;
		byte reason;
		int can_reload = 0;
		Object generatedB_orig_size = this.getB_orig_size();
		off_T orig_size = generatedB_orig_size;
		int generatedB_orig_mode = this.getB_orig_mode();
		int orig_mode = generatedB_orig_mode;
		int busy = 0;
		int n;
		char_u s = new char_u();
		bufref_T bufref = new bufref_T();
		ModernizedCProgram.set_bufref(bufref, buf/* If there is no file name, the buffer is not loaded, 'buftype' is
		     * set, we are in the middle of a save or being called recursively: ignore
		     * this buffer. */);
		Object generatedB_ffname = this.getB_ffname();
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		int generatedB_saving = this.getB_saving();
		if (generatedB_ffname == ((Object)0) || generatedMl_mfp == ((Object)0) || !buf.bt_normal() || generatedB_saving || busy) {
			return 0;
		} 
		int generatedB_flags = this.getB_flags();
		long generatedB_mtime = this.getB_mtime();
		Object generated_stat64 = st.get_stat64();
		Object generatedB_fname = this.getB_fname();
		int generatedB_p_ar = this.getB_p_ar();
		if (!(generatedB_flags & -1024) && generatedB_mtime != 0 && ((stat_res = (st).vim_stat(((byte)generatedB_ffname))) < 0 || ModernizedCProgram.time_differs((long)generated_stat64, generatedB_mtime) || generated_stat64 != generatedB_orig_size || (int)generated_stat64 != generatedB_orig_mode)) {
			long prev_b_mtime = generatedB_mtime;
			retval = 1;
			if (stat_res < 0) {
				this.setB_mtime(-1);
				this.setB_orig_size(0);
				this.setB_orig_mode(0);
			} else {
					ModernizedCProgram.buf_store_time(buf, st, generatedB_ffname);
			} 
			if (ModernizedCProgram.mch_isdir(generatedB_fname)) {
				;
			}  else if ((generatedB_p_ar >= 0 ? generatedB_p_ar : ModernizedCProgram.p_ar) && !buf.bufIsChanged() && stat_res >= 0) {
				reload = 1;
			} else {
					if (stat_res < 0) {
						reason = "deleted";
					}  else if (buf.bufIsChanged()) {
						reason = "conflict"/*
							     * Check if the file contents really changed to avoid giving a
							     * warning when only the timestamp was set (e.g., checked out of
							     * CVS).  Always warn when the buffer was changed.
							     */;
					}  else if (orig_size != generatedB_orig_size || buf.buf_contents_changed()) {
						reason = "changed";
					}  else if (orig_mode != generatedB_orig_mode) {
						reason = "mode";
					} else {
							reason = "time"/*
								     * Only give the warning if there are no FileChangedShell
								     * autocommands.
								     * Avoid being called recursively by setting "busy".
								     */;
					} 
					busy = 1;
					ModernizedCProgram.set_vim_var_string(37, (char_u)reason, -1);
					ModernizedCProgram.set_vim_var_string(38, (char_u)"", -1);
					++allbuf_lock;
					n = buf.apply_autocmds(auto_event.EVENT_FILECHANGEDSHELL, generatedB_fname, generatedB_fname, 0);
					--allbuf_lock;
					busy = 0;
					if (n) {
						if (!bufref.bufref_valid()) {
							ModernizedCProgram.emsg(((byte)("E246: FileChangedShell autocommand deleted buffer")));
						} 
						s = ModernizedCProgram.get_vim_var_str(38);
						if (.strcmp((byte)(s), (byte)("reload")) == 0 && reason != (byte)'d') {
							reload = 1;
						}  else if (.strcmp((byte)(s), (byte)("ask")) == 0) {
							n = 0;
						} else {
								return 2;
						} 
					} 
					if (!n) {
						if (reason == (byte)'d') {
							if (prev_b_mtime != -1) {
								mesg = ((byte)("E211: File \"%s\" no longer available"));
							} 
						} else {
								helpmesg = 1;
								can_reload = 1;
								if (reason[2] == (byte)'n') {
									mesg = ((byte)("W12: Warning: File \"%s\" has changed and the buffer was changed in Vim as well"));
									mesg2 = ((byte)("See \":help W12\" for more info."));
								}  else if (reason[1] == (byte)'h') {
									mesg = ((byte)("W11: Warning: File \"%s\" has changed since editing started"));
									mesg2 = ((byte)("See \":help W11\" for more info."));
								}  else if (reason == (byte)'m') {
									mesg = ((byte)("W16: Warning: Mode of file \"%s\" has changed since editing started"));
									mesg2 = ((byte)("See \":help W16\" for more info."));
								} else {
										this.setB_mtime_read(generatedB_mtime);
								} 
						} 
					} 
			} 
		}  else if ((generatedB_flags & -1024) && !(generatedB_flags & -1024) && ModernizedCProgram.vim_fexists(generatedB_ffname)) {
			retval = 1;
			mesg = ((byte)("W13: Warning: File \"%s\" has been created after editing started"));
			generatedB_flags |=  -1024;
			can_reload = 1;
		} 
		if (mesg != ((Object)0)) {
			path = buf.home_replace_save(generatedB_fname);
			if (path != ((Object)0)) {
				if (!helpmesg) {
					mesg2 = "";
				} 
				tbuf = ModernizedCProgram.alloc(.strlen((byte)(path)) + .strlen((byte)(mesg)) + .strlen((byte)(mesg2)) + 2);
				.sprintf(tbuf, mesg, path);
				ModernizedCProgram.set_vim_var_string(4, (char_u)tbuf, -/* Set warningmsg here, before the unimportant and output-specific
					     * mesg2 has been appended. */1);
				if (can_reload) {
					if (mesg2 != (byte)'\000') {
						.strcat((byte)(tbuf), (byte)("\n"));
						.strcat((byte)(tbuf), (byte)(mesg2));
					} 
					if (ModernizedCProgram.do_dialog(2, (char_u)((byte)("Warning")), (char_u)tbuf, (char_u)((byte)("&OK\n&Load File")), 1, ((Object)0), 1) == 2) {
						reload = 1;
					} 
				}  else if (State > (-1024 + -1024) || (State & -1024) || ModernizedCProgram.already_warned) {
					if (mesg2 != (byte)'\000') {
						.strcat((byte)(tbuf), (byte)("; "));
						.strcat((byte)(tbuf), (byte)(mesg2));
					} 
					ModernizedCProgram.emsg(tbuf);
					retval = 2;
				} else {
						if (!autocmd_busy) {
							ModernizedCProgram.msg_start();
							ModernizedCProgram.msg_puts_attr(tbuf, ModernizedCProgram.highlight_attr[(int)(.HLF_E)] + -1024);
							if (mesg2 != (byte)'\000') {
								ModernizedCProgram.msg_puts_attr(mesg2, ModernizedCProgram.highlight_attr[(int)(.HLF_W)] + -1024);
							} 
							ModernizedCProgram.msg_clr_eos();
							(Object)ModernizedCProgram.msg_end();
							if (emsg_silent == 0) {
								ModernizedCProgram.out_flush();
								ModernizedCProgram.ui_delay(-1024, /* give the user some time to think about it */1);
								redraw_cmdline = /* don't redraw and erase the message */0;
							} 
						} 
						ModernizedCProgram.already_warned = 1;
				} 
				ModernizedCProgram.vim_free(path);
				ModernizedCProgram.vim_free(tbuf);
			} 
		} 
		Object generatedB_p_udf = this.getB_p_udf();
		if (reload) {
			buf.buf_reload(/* Reload the buffer. */orig_mode);
			if (generatedB_p_udf && generatedB_ffname != ((Object)0)) {
				char_u[] hash = new char_u();
				buf_T save_curbuf = curbuf;
				curbuf = /* Any existing undo file is unusable, write it now. */buf;
				ModernizedCProgram.u_compute_hash(hash);
				buf.u_write_undo(((Object)0), 0, hash);
				curbuf = save_curbuf;
			} 
		} 
		if (bufref.bufref_valid() && retval != /* Trigger FileChangedShell when the file was changed in any way. */0) {
			(Object)buf/* restore this in case an autocommand has set it; it would break
			     * 'mousefocus' */.apply_autocmds(auto_event.EVENT_FILECHANGEDSHELLPOST, generatedB_fname, generatedB_fname, 0);
		} 
		return retval/*
		 * Reload a buffer that is already loaded.
		 * Used when the file was changed outside of Vim.
		 * "orig_mode" is buf->b_orig_mode before the need for reloading was detected.
		 * buf->b_orig_mode may have been reset already.
		 */;
	}
	public void buf_reload(int orig_mode) {
		exarg_T ea = new exarg_T();
		pos_T old_cursor = new pos_T();
		linenr_T old_topline = new linenr_T();
		int generatedB_p_ro = this.getB_p_ro();
		int old_ro = generatedB_p_ro;
		buf_T savebuf = new buf_T();
		bufref_T bufref = new bufref_T();
		int saved = 1;
		aco_save_T aco = new aco_save_T();
		int flags = -1024;
		ModernizedCProgram.aucmd_prepbuf(aco, /* set curwin/curbuf for "buf" and save some things */buf/* We only want to read the text from the file, not reset the syntax
		     * highlighting, clear marks, diff status, etc.  Force the fileformat
		     * and encoding to be the same. */);
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		file_buffer file_buffer = new file_buffer();
		Object generatedB_fname = this.getB_fname();
		int generatedB_flags = curbuf.getB_flags();
		Object generatedB_ffname = this.getB_ffname();
		Object generatedCmd = ea.getCmd();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		int generatedB_orig_mode = curbuf.getB_orig_mode();
		if (ModernizedCProgram.prep_exarg(ea, buf) == 1) {
			old_cursor = ModernizedCProgram.curwin.getW_cursor();
			old_topline = ModernizedCProgram.curwin.getW_topline();
			if (ModernizedCProgram.p_ur < 0 || generatedMl_line_count <= ModernizedCProgram.p_ur) {
				ModernizedCProgram.u_sync(/* Save all the text, so that the reload can be undone.
					     * Sync first so that this is a separate undo-able action. */0);
				saved = ModernizedCProgram.u_savecommon(0, generatedMl_line_count + 1, 0, 1);
				flags |=  -1024/*
					 * To behave like when a new file is edited (matters for
					 * BufReadPost autocommands) we first need to delete the current
					 * buffer contents.  But if reading the file fails we should keep
					 * the old contents.  Can't use memory only, the file might be
					 * too big.  Use a hidden buffer to move the buffer contents to.
					 */;
			} 
			if ((generatedMl_line_count == 1 && ModernizedCProgram.ml_get((linenr_T)1) == (byte)'\000') || saved == 0) {
				savebuf = ((Object)0);
			} else {
					savebuf = file_buffer.buflist_new(((Object)0), ((Object)0), (linenr_T)1, /* Allocate a buffer without putting it in the buffer list. */4);
					ModernizedCProgram.set_bufref(bufref, savebuf);
					if (savebuf != ((Object)0) && buf == curbuf) {
						curbuf = /* Open the memline. */savebuf;
						ModernizedCProgram.curwin.setW_buffer(savebuf);
						saved = curbuf.ml_open();
						curbuf = buf;
						ModernizedCProgram.curwin.setW_buffer(buf);
					} 
					if (savebuf == ((Object)0) || saved == 0 || buf != curbuf || buf.move_lines(savebuf) == 0) {
						ModernizedCProgram.semsg(((byte)("E462: Could not prepare for reloading \"%s\"")), generatedB_fname);
						saved = 0;
					} 
			} 
			if (saved == 1) {
				generatedB_flags |=  /* check for RO again */-1024;
				keep_filetype = /* don't detect 'filetype' */1;
				if (ea.readfile(generatedB_ffname, generatedB_fname, (linenr_T)0, (linenr_T)0, (linenr_T)LONG_MAX, flags) != 1) {
					if (!ModernizedCProgram.aborting()) {
						ModernizedCProgram.semsg(((byte)("E321: Could not reload \"%s\"")), generatedB_fname);
					} 
					if (savebuf != ((Object)0) && bufref.bufref_valid() && buf == curbuf) {
						while (!(generatedMl_line_count == 1 && ModernizedCProgram.ml_get((linenr_T)1) == /* Put the text back from the save buffer.  First
								     * delete any lines that readfile() added. */(byte)'\000')) {
							if (ModernizedCProgram.ml_delete(generatedMl_line_count, 0) == 0) {
								break;
							} 
						}
						(Object)savebuf.move_lines(buf);
					} 
				}  else if (buf == /* "buf" still valid */curbuf) {
					buf.unchanged(1, /* Mark the buffer as unmodified and free undo info. */1);
					if ((flags & -1024) == 0) {
						buf.u_blockfree();
						buf.u_clearall();
					} else {
							/* Mark all undo states as changed. */curbuf.u_unchanged();
					} 
				} 
			} 
			ModernizedCProgram.vim_free(generatedCmd);
			if (savebuf != ((Object)0) && bufref.bufref_valid()) {
				savebuf.wipe_buffer(0);
			} 
			/* Invalidate diff info if necessary. */curbuf.diff_invalidate();
			if (old_topline > generatedMl_line_count) {
				ModernizedCProgram.curwin.setW_topline(generatedMl_line_count);
			} else {
					ModernizedCProgram.curwin.setW_topline(old_topline);
			} 
			ModernizedCProgram.curwin.setW_cursor(old_cursor);
			ModernizedCProgram.check_cursor();
			ModernizedCProgram.update_topline();
			keep_filetype = 0;
			{ 
				win_T wp = new win_T();
				tabpage_T tp = new tabpage_T();
				for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
					for ((wp) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
						if (generatedW_buffer == generatedW_buffer && !wp.foldmethodIsManual()) {
							wp.foldUpdateAll();
						} 
					}
				}
			}
			if (orig_mode == generatedB_orig_mode) {
				generatedB_p_ro |=  old_ro;
			} 
			ModernizedCProgram.do_modelines(/* Modelines must override settings done by autocommands. */0);
		} 
		/* restore curwin/curbuf and a few other things */aco/* Careful: autocommands may have made "buf" invalid! */.aucmd_restbuf();
	}
	public void buf_copy_options(int flags) {
		int should_copy = 1;
		char_u save_p_isk = ((Object)/* init for GCC */0);
		int dont_do_help;
		int did_isk = 0/*
		     * Skip this when the option defaults have not been set yet.  Happens when
		     * main() allocates the first buffer.
		     */;
		int generatedB_p_initialized = this.getB_p_initialized();
		Object generatedB_p_script_ctx = this.getB_p_script_ctx();
		int generatedB_help = this.getB_help();
		Object generatedB_p_isk = this.getB_p_isk();
		Object generatedB_p_ff = this.getB_p_ff();
		Object generatedB_p_vsts_array = this.getB_p_vsts_array();
		Object generatedB_s = this.getB_s();
		Object generatedB_kmap_state = this.getB_kmap_state();
		Object generatedB_p_vts_array = this.getB_p_vts_array();
		Object generatedB_p_bt = this.getB_p_bt();
		if (ModernizedCProgram.p_cpo != ((Object)0/*
			 * Always copy when entering and 'cpo' contains 'S'.
			 * Don't copy when already initialized.
			 * Don't copy when 'cpo' contains 's' and not entering.
			 * 'S'	BCO_ENTER  initialized	's'  should_copy
			 * yes	  yes	       X	 X	TRUE
			 * yes	  no	      yes	 X	FALSE
			 * no	   X	      yes	 X	FALSE
			 *  X	  no	      no	yes	FALSE
			 *  X	  no	      no	no	TRUE
			 * no	  yes	      no	 X	TRUE
			 */)) {
			if ((ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'S') == ((Object)0) || !(flags & 1)) && (generatedB_p_initialized || (!(flags & 1) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'s') != ((Object)0)))) {
				should_copy = 0;
			} 
			if (should_copy || (flags & 2)) {
				.memset((generatedB_p_script_ctx), (false), ());
				ModernizedCProgram.init_buf_opt_idx();
				dont_do_help = ((flags & 4) && generatedB_help) || generatedB_p_initialized;
				if (dont_do_help) {
					save_p_isk = generatedB_p_isk;
					this.setB_p_isk(((Object)0/*
						     * Always free the allocated strings.  If not already initialized,
						     * reset 'readonly' and copy 'fileformat'.
						     */));
				} 
				if (!generatedB_p_initialized) {
					buf.free_buf_options(1);
					this.setB_p_ro(/* don't copy readonly */0);
					this.setB_p_tx(ModernizedCProgram.p_tx);
					this.setB_p_fenc(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_fenc));
					switch (ModernizedCProgram.p_ffs) {
					case (byte)'d':
							this.setB_p_ff(ModernizedCProgram.vim_strsave((char_u)"dos"));
							break;
					case (byte)'m':
							this.setB_p_ff(ModernizedCProgram.vim_strsave((char_u)"mac"));
							break;
					case (byte)'u':
							this.setB_p_ff(ModernizedCProgram.vim_strsave((char_u)"unix"));
							break;
					default:
							this.setB_p_ff(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_ff));
					}
					if (generatedB_p_ff != ((Object)0)) {
						this.setB_start_ffc(generatedB_p_ff);
					} 
					this.setB_p_bh(empty_option);
					this.setB_p_bt(empty_option);
				} else {
						buf.free_buf_options(0);
				} 
				this.setB_p_ai(ModernizedCProgram.p_ai);
				generatedB_p_script_ctx[.BV_AI] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_AI]].getScript_ctx();
				this.setB_p_ai_nopaste(ModernizedCProgram.p_ai_nopaste);
				this.setB_p_sw(ModernizedCProgram.p_sw);
				generatedB_p_script_ctx[.BV_SW] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SW]].getScript_ctx();
				this.setB_p_tw(ModernizedCProgram.p_tw);
				generatedB_p_script_ctx[.BV_TW] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_TW]].getScript_ctx();
				this.setB_p_tw_nopaste(ModernizedCProgram.p_tw_nopaste);
				this.setB_p_tw_nobin(ModernizedCProgram.p_tw_nobin);
				this.setB_p_wm(ModernizedCProgram.p_wm);
				generatedB_p_script_ctx[.BV_WM] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_WM]].getScript_ctx();
				this.setB_p_wm_nopaste(ModernizedCProgram.p_wm_nopaste);
				this.setB_p_wm_nobin(ModernizedCProgram.p_wm_nobin);
				this.setB_p_bin(ModernizedCProgram.p_bin);
				generatedB_p_script_ctx[.BV_BIN] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_BIN]].getScript_ctx();
				this.setB_p_bomb(ModernizedCProgram.p_bomb);
				generatedB_p_script_ctx[.BV_BOMB] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_BOMB]].getScript_ctx();
				this.setB_p_fixeol(ModernizedCProgram.p_fixeol);
				generatedB_p_script_ctx[.BV_FIXEOL] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_FIXEOL]].getScript_ctx();
				this.setB_p_et(ModernizedCProgram.p_et);
				generatedB_p_script_ctx[.BV_ET] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_ET]].getScript_ctx();
				this.setB_p_et_nobin(ModernizedCProgram.p_et_nobin);
				this.setB_p_et_nopaste(ModernizedCProgram.p_et_nopaste);
				this.setB_p_ml(ModernizedCProgram.p_ml);
				generatedB_p_script_ctx[.BV_ML] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_ML]].getScript_ctx();
				this.setB_p_ml_nobin(ModernizedCProgram.p_ml_nobin);
				this.setB_p_inf(ModernizedCProgram.p_inf);
				generatedB_p_script_ctx[.BV_INF] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_INF]].getScript_ctx();
				if (ModernizedCProgram.cmdmod.getNoswapfile()) {
					this.setB_p_swf(0);
				} else {
						this.setB_p_swf(ModernizedCProgram.p_swf);
						generatedB_p_script_ctx[.BV_INF] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_INF]].getScript_ctx();
				} 
				this.setB_p_cpt(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_cpt));
				generatedB_p_script_ctx[.BV_CPT] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CPT]].getScript_ctx();
				this.setB_p_csl(ModernizedCProgram.vim_strsave(p_csl));
				generatedB_p_script_ctx[.BV_CSL] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CSL]].getScript_ctx();
				this.setB_p_cfu(ModernizedCProgram.vim_strsave(p_cfu));
				generatedB_p_script_ctx[.BV_CFU] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CFU]].getScript_ctx();
				this.setB_p_ofu(ModernizedCProgram.vim_strsave(p_ofu));
				generatedB_p_script_ctx[.BV_OFU] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_OFU]].getScript_ctx();
				this.setB_p_tfu(ModernizedCProgram.vim_strsave(p_tfu));
				generatedB_p_script_ctx[.BV_TFU] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_TFU]].getScript_ctx();
				this.setB_p_sts(ModernizedCProgram.p_sts);
				generatedB_p_script_ctx[.BV_STS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_STS]].getScript_ctx();
				this.setB_p_sts_nopaste(ModernizedCProgram.p_sts_nopaste);
				this.setB_p_vsts(ModernizedCProgram.vim_strsave(p_vsts));
				generatedB_p_script_ctx[.BV_VSTS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_VSTS]].getScript_ctx();
				if (p_vsts && p_vsts != empty_option) {
					ModernizedCProgram.tabstop_set(p_vsts, generatedB_p_vsts_array);
				} else {
						this.setB_p_vsts_array(0);
				} 
				this.setB_p_vsts_nopaste(p_vsts_nopaste ? ModernizedCProgram.vim_strsave(p_vsts_nopaste) : ((Object)0));
				this.setB_p_sn(ModernizedCProgram.p_sn);
				generatedB_p_script_ctx[.BV_SN] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SN]].getScript_ctx();
				this.setB_p_com(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_com));
				generatedB_p_script_ctx[.BV_COM] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_COM]].getScript_ctx();
				this.setB_p_cms(ModernizedCProgram.vim_strsave(p_cms));
				generatedB_p_script_ctx[.BV_CMS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CMS]].getScript_ctx();
				this.setB_p_fo(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_fo));
				generatedB_p_script_ctx[.BV_FO] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_FO]].getScript_ctx();
				this.setB_p_flp(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_flp));
				generatedB_p_script_ctx[.BV_FLP] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_FLP]].getScript_ctx();
				this.setB_p_nf(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_nf));
				generatedB_p_script_ctx[.BV_NF] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_NF]].getScript_ctx();
				this.setB_p_mps(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_mps));
				generatedB_p_script_ctx[.BV_MPS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_MPS]].getScript_ctx();
				this.setB_p_si(p_si);
				generatedB_p_script_ctx[.BV_SI] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SI]].getScript_ctx();
				this.setB_p_ci(ModernizedCProgram.p_ci);
				generatedB_p_script_ctx[.BV_CI] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CI]].getScript_ctx();
				this.setB_p_cin(p_cin);
				generatedB_p_script_ctx[.BV_CIN] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CIN]].getScript_ctx();
				this.setB_p_cink(ModernizedCProgram.vim_strsave(p_cink));
				generatedB_p_script_ctx[.BV_CINK] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CINK]].getScript_ctx();
				this.setB_p_cino(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_cino));
				generatedB_p_script_ctx[.BV_CINO] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CINO]].getScript_ctx();
				this.setB_p_ft(empty_option);
				this.setB_p_pi(ModernizedCProgram.p_pi);
				generatedB_p_script_ctx[.BV_PI] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_PI]].getScript_ctx();
				this.setB_p_cinw(ModernizedCProgram.vim_strsave(p_cinw));
				generatedB_p_script_ctx[.BV_CINW] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_CINW]].getScript_ctx();
				this.setB_p_lisp(p_lisp);
				generatedB_p_script_ctx[.BV_LISP] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_LISP]].getScript_ctx();
				this.setB_p_syn(/* Don't copy 'syntax', it must be set */empty_option);
				this.setB_p_smc(p_smc);
				generatedB_p_script_ctx[.BV_SMC] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SMC]].getScript_ctx();
				generatedB_s.setB_syn_isk(empty_option);
				generatedB_s.setB_p_spc(ModernizedCProgram.vim_strsave(p_spc));
				generatedB_p_script_ctx[.BV_SPC] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SPC]].getScript_ctx();
				(Object)generatedB_s.compile_cap_prog();
				generatedB_s.setB_p_spf(ModernizedCProgram.vim_strsave(p_spf));
				generatedB_p_script_ctx[.BV_SPF] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SPF]].getScript_ctx();
				generatedB_s.setB_p_spl(ModernizedCProgram.vim_strsave(p_spl));
				generatedB_p_script_ctx[.BV_SPL] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SPL]].getScript_ctx();
				this.setB_p_inde(ModernizedCProgram.vim_strsave(p_inde));
				generatedB_p_script_ctx[.BV_INDE] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_INDE]].getScript_ctx();
				this.setB_p_indk(ModernizedCProgram.vim_strsave(p_indk));
				generatedB_p_script_ctx[.BV_INDK] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_INDK]].getScript_ctx();
				this.setB_p_fp(empty_option);
				this.setB_p_fex(ModernizedCProgram.vim_strsave(p_fex));
				generatedB_p_script_ctx[.BV_FEX] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_FEX]].getScript_ctx();
				this.setB_p_key(ModernizedCProgram.vim_strsave(p_key));
				generatedB_p_script_ctx[.BV_KEY] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_KEY]].getScript_ctx();
				this.setB_p_sua(ModernizedCProgram.vim_strsave(p_sua));
				generatedB_p_script_ctx[.BV_SUA] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_SUA]].getScript_ctx();
				this.setB_p_keymap(ModernizedCProgram.vim_strsave(p_keymap));
				generatedB_p_script_ctx[.BV_KMAP] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_KMAP]].getScript_ctx();
				generatedB_kmap_state |=  1;
				this.setB_p_iminsert(/* This isn't really an option, but copying the langmap and IME
					     * state from the current buffer is better than resetting it. */ModernizedCProgram.p_iminsert);
				generatedB_p_script_ctx[.BV_IMI] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_IMI]].getScript_ctx();
				this.setB_p_imsearch(ModernizedCProgram.p_imsearch);
				generatedB_p_script_ctx[.BV_IMS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_IMS]].getScript_ctx();
				this.setB_p_ar(-/* options that are normally global but also have a local value
					     * are not copied, start using the global value */1);
				this.setB_p_ul(-123456);
				this.setB_p_bkc(empty_option);
				this.setB_bkc_flags(0);
				this.setB_p_gp(empty_option);
				this.setB_p_mp(empty_option);
				this.setB_p_efm(empty_option);
				this.setB_p_ep(empty_option);
				this.setB_p_kp(empty_option);
				this.setB_p_path(empty_option);
				this.setB_p_tags(empty_option);
				this.setB_p_tc(empty_option);
				this.setB_tc_flags(0);
				this.setB_p_def(empty_option);
				this.setB_p_inc(empty_option);
				this.setB_p_inex(ModernizedCProgram.vim_strsave(p_inex));
				generatedB_p_script_ctx[.BV_INEX] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_INEX]].getScript_ctx();
				this.setB_p_dict(empty_option);
				this.setB_p_tsr(empty_option);
				this.setB_p_qe(ModernizedCProgram.vim_strsave(p_qe));
				generatedB_p_script_ctx[.BV_QE] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_QE]].getScript_ctx();
				this.setB_p_bexpr(empty_option);
				this.setB_p_cm(empty_option);
				this.setB_p_udf(p_udf);
				generatedB_p_script_ctx[.BV_UDF] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_UDF]].getScript_ctx();
				this.setB_p_lw(empty_option);
				this.setB_p_menc(empty_option/*
					     * Don't copy the options set by ex_help(), use the saved values,
					     * when going from a help buffer to a non-help buffer.
					     * Don't touch these at all when BCO_NOHELP is used and going from
					     * or to a help buffer.
					     */);
				if (dont_do_help) {
					this.setB_p_isk(save_p_isk);
					if (p_vts && p_vts != empty_option && !generatedB_p_vts_array) {
						ModernizedCProgram.tabstop_set(p_vts, generatedB_p_vts_array);
					} else {
							this.setB_p_vts_array(((Object)0));
					} 
				} else {
						this.setB_p_isk(ModernizedCProgram.vim_strsave(ModernizedCProgram.p_isk));
						generatedB_p_script_ctx[.BV_ISK] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_ISK]].getScript_ctx();
						did_isk = 1;
						this.setB_p_ts(ModernizedCProgram.p_ts);
						this.setB_p_vts(ModernizedCProgram.vim_strsave(p_vts));
						generatedB_p_script_ctx[.BV_VTS] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_VTS]].getScript_ctx();
						if (p_vts && p_vts != empty_option && !generatedB_p_vts_array) {
							ModernizedCProgram.tabstop_set(p_vts, generatedB_p_vts_array);
						} else {
								this.setB_p_vts_array(((Object)0));
						} 
						this.setB_help(0);
						if (generatedB_p_bt[0] == (byte)'h') {
							ModernizedCProgram.clear_string_option(generatedB_p_bt);
						} 
						this.setB_p_ma(ModernizedCProgram.p_ma);
						generatedB_p_script_ctx[.BV_MA] = ModernizedCProgram.options[ModernizedCProgram.buf_opt_idx[.BV_MA]].getScript_ctx();
				} 
			} 
			if (/*
				 * When the options should be copied (ignoring BCO_ALWAYS), set the
				 * flag that indicates that the options have been initialized.
				 */should_copy) {
				this.setB_p_initialized(1);
			} 
		} 
		/* make sure we don't have NULLs */buf.check_buf_options();
		if (did_isk) {
			(Object)buf.buf_init_chartab(0/*
			 * Reset the 'modifiable' option and its default value.
			 */);
		} 
	}
	public void save_file_ff() {
		Object generatedB_p_ff = this.getB_p_ff();
		this.setB_start_ffc(generatedB_p_ff);
		int generatedB_p_eol = this.getB_p_eol();
		this.setB_start_eol(generatedB_p_eol);
		int generatedB_p_bomb = this.getB_p_bomb();
		this.setB_start_bomb(generatedB_p_bomb);
		Object generatedB_start_fenc = this.getB_start_fenc();
		Object generatedB_p_fenc = this.getB_p_fenc();
		if (generatedB_start_fenc == ((Object)/* Only use free/alloc when necessary, they take time. */0) || .strcmp((byte)(generatedB_start_fenc), (byte)(generatedB_p_fenc)) != 0) {
			ModernizedCProgram.vim_free(generatedB_start_fenc);
			this.setB_start_fenc(ModernizedCProgram.vim_strsave(generatedB_p_fenc));
		} 
	}
	public int file_ff_differs(int ignore_empty) {
		int generatedB_flags = this.getB_flags();
		if (generatedB_flags & /* In a buffer that was never loaded the options are not valid. */-1024) {
			return 0;
		} 
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (ignore_empty && (generatedB_flags & -1024) && generatedMl_line_count == 1 && buf.ml_get_buf((linenr_T)1, 0) == (byte)'\000') {
			return 0;
		} 
		int generatedB_start_ffc = this.getB_start_ffc();
		Object generatedB_p_ff = this.getB_p_ff();
		if (generatedB_start_ffc != generatedB_p_ff) {
			return 1;
		} 
		int generatedB_p_bin = this.getB_p_bin();
		int generatedB_p_fixeol = this.getB_p_fixeol();
		int generatedB_start_eol = this.getB_start_eol();
		int generatedB_p_eol = this.getB_p_eol();
		if ((generatedB_p_bin || !generatedB_p_fixeol) && generatedB_start_eol != generatedB_p_eol) {
			return 1;
		} 
		int generatedB_start_bomb = this.getB_start_bomb();
		int generatedB_p_bomb = this.getB_p_bomb();
		if (!generatedB_p_bin && generatedB_start_bomb != generatedB_p_bomb) {
			return 1;
		} 
		Object generatedB_start_fenc = this.getB_start_fenc();
		Object generatedB_p_fenc = this.getB_p_fenc();
		if (generatedB_start_fenc == ((Object)0)) {
			return (generatedB_p_fenc != (byte)'\000');
		} 
		return (.strcmp((byte)(generatedB_start_fenc), (byte)(generatedB_p_fenc)) != 0/*
		 * Return the effective 'scrolloff' value for the current window, using the
		 * global value when appropriate.
		 */);
	}
	public int get_bkc_value() {
		int generatedB_bkc_flags = this.getB_bkc_flags();
		return generatedB_bkc_flags ? generatedB_bkc_flags : ModernizedCProgram.bkc_flags/*
		 * Return TRUE when window "wp" has a column to draw signs in.
		 */;
	}
	/*
	 * Get buffer by number or pattern.
	 */
	public file_buffer tv_get_buf( tv, int curtab_only) {
		Object generatedVval = tv.getVval();
		char_u name = generatedVval.getV_string();
		buf_T buf = new buf_T();
		Object generatedV_type = tv.getV_type();
		file_buffer file_buffer = new file_buffer();
		if (generatedV_type == .VAR_NUMBER) {
			return file_buffer.buflist_findnr((int)generatedVval.getV_number());
		} 
		if (generatedV_type != .VAR_STRING) {
			return ((Object)0);
		} 
		if (name == ((Object)0) || name == (byte)'\000') {
			return curbuf;
		} 
		if (name[0] == (byte)'$' && name[1] == (byte)'\000') {
			return lastbuf;
		} 
		file_buffer file_buffer = new file_buffer();
		buf = file_buffer.buflist_find_by_name(name, curtab_only);
		file_buffer file_buffer = new file_buffer();
		if (buf == ((Object)/* If not found, try expanding the name, like done for bufexists(). */0)) {
			buf = file_buffer.find_buffer(tv);
		} 
		return buf/*
		 * Get the buffer from "arg" and give an error and return NULL if it is not
		 * valid.
		 */;
	}
	public file_buffer get_buf_arg( arg) {
		buf_T buf = new buf_T();
		++emsg_off;
		file_buffer file_buffer = new file_buffer();
		buf = file_buffer.tv_get_buf(arg, 0);
		--emsg_off;
		if (buf == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)("E158: Invalid buffer name: %s")), arg.tv_get_string());
		} 
		return buf/*
		 * "byte2line(byte)" function
		 */;
	}
	public int get_fileformat() {
		Object generatedB_p_ff = this.getB_p_ff();
		int c = generatedB_p_ff;
		int generatedB_p_bin = this.getB_p_bin();
		if (generatedB_p_bin || c == (byte)'u') {
			return 0;
		} 
		if (c == (byte)'m') {
			return 2;
		} 
		return 1/*
		 * Like get_fileformat(), but override 'fileformat' with "p" for "++opt=val"
		 * argument.
		 */;
	}
	public void buffer_ensure_loaded() {
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (generatedMl_mfp == ((Object)0)) {
			aco_save_T aco = new aco_save_T();
			ModernizedCProgram.aucmd_prepbuf(aco, buf);
			swap_exists_action = 0;
			((Object)0).open_buffer(0, 0);
			aco/*
			 * Open current buffer, that is: open the memfile and read the file into
			 * memory.
			 * Return FAIL for failure, OK otherwise.
			 */.aucmd_restbuf();
		} 
	}
	public int buf_valid() {
		buf_T bp = new buf_T();
		file_buffer generatedB_prev = bp.getB_prev();
		for (bp = lastbuf; bp != ((Object)0); bp = generatedB_prev) {
			if (bp == buf) {
				return 1;
			} 
		}
		return 0/*
		 * A hash table used to quickly lookup a buffer by its number.
		 */;
	}
	public void buf_hashtab_add() {
		Object generatedB_key = this.getB_key();
		int generatedB_fnum = this.getB_fnum();
		.sprintf((byte)generatedB_key, "%x", generatedB_fnum);
		if (ModernizedCProgram.buf_hashtab.hash_add(generatedB_key) == 0) {
			ModernizedCProgram.emsg(((byte)("E931: Buffer cannot be registered")));
		} 
	}
	public void buf_hashtab_remove() {
		Object generatedB_key = this.getB_key();
		hashitem_S hashitem_S = new hashitem_S();
		hashitem_T hi = hashitem_S.hash_find(ModernizedCProgram.buf_hashtab, generatedB_key);
		Object generatedHi_key = (hi).getHi_key();
		if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			ModernizedCProgram.hash_remove(ModernizedCProgram.buf_hashtab, hi/*
			 * Return TRUE when buffer "buf" can be unloaded.
			 * Give an error message and return FALSE when the buffer is locked or the
			 * screen is being redrawn and the buffer is in a window.
			 */);
		} 
	}
	public int can_unload_buffer() {
		int generatedB_locked = this.getB_locked();
		int can_unload = !generatedB_locked;
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		if (can_unload && updating_screen) {
			win_T wp = new win_T();
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_buffer == buf) {
					can_unload = 0;
					break;
				} 
			}
		} 
		Object generatedB_fname = this.getB_fname();
		if (!can_unload) {
			ModernizedCProgram.semsg(((byte)("E937: Attempt to delete a buffer that is in use: %s")), generatedB_fname);
		} 
		return can_unload/*
		 * Close the link to a buffer.
		 * "action" is used when there is no longer a window for the buffer.
		 * It can be:
		 * 0			buffer becomes hidden
		 * DOBUF_UNLOAD		buffer is unloaded
		 * DOBUF_DELETE		buffer is unloaded and removed from buffer list
		 * DOBUF_WIPE		buffer is unloaded and really deleted
		 * DOBUF_WIPE_REUSE	idem, and add to buf_reuse list
		 * When doing all but the first one on the current buffer, the caller should
		 * get a new buffer very soon!
		 *
		 * The 'bufhidden' option can force freeing and deleting.
		 *
		 * When "abort_if_last" is TRUE then do not close the buffer if autocommands
		 * cause there to be only one window with this buffer.  e.g. when ":quit" is
		 * supposed to close the window but autocommands close all other windows.
		 */;
	}
	public void buf_clear_file() {
		memline generatedB_ml = this.getB_ml();
		generatedB_ml.setMl_line_count(1);
		buf.unchanged(1, 1);
		this.setB_shortname(0);
		this.setB_p_eol(1);
		this.setB_start_eol(1);
		this.setB_p_bomb(0);
		this.setB_start_bomb(0);
		generatedB_ml.setMl_mfp(((Object)0));
		generatedB_ml.setMl_flags(/* empty buffer */1)/*
		 * buf_freeall() - free all things allocated for a buffer that are related to
		 * the file.  Careful: get here with "curwin" NULL when exiting.
		 * flags:
		 * BFA_DEL	  buffer is going to be deleted
		 * BFA_WIPE	  buffer is going to be wiped out
		 * BFA_KEEP_UNDO  do not free undo information
		 */;/*
		 * buf_freeall() - free all things allocated for a buffer that are related to
		 * the file.  Careful: get here with "curwin" NULL when exiting.
		 * flags:
		 * BFA_DEL	  buffer is going to be deleted
		 * BFA_WIPE	  buffer is going to be wiped out
		 * BFA_KEEP_UNDO  do not free undo information
		 */
	}
	public void buf_freeall(int flags) {
		int is_curbuf = (buf == curbuf);
		bufref_T bufref = new bufref_T();
		int is_curwin = (ModernizedCProgram.curwin != ((Object)0) && ModernizedCProgram.curwin.getW_buffer() == buf);
		win_T the_curwin = ModernizedCProgram.curwin;
		tabpage_T the_curtab = ModernizedCProgram.curtab;
		int generatedB_locked = this.getB_locked();
		++generatedB_locked;
		ModernizedCProgram.set_bufref(bufref, buf);
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		Object generatedB_fname = this.getB_fname();
		if (generatedMl_mfp != ((Object)0)) {
			if (buf.apply_autocmds(auto_event.EVENT_BUFUNLOAD, generatedB_fname, generatedB_fname, 0) && !bufref/* autocommands deleted the buffer */.bufref_valid()) {
				return ;
			} 
		} 
		int generatedB_p_bl = this.getB_p_bl();
		if ((flags & 1) && generatedB_p_bl) {
			if (buf.apply_autocmds(auto_event.EVENT_BUFDELETE, generatedB_fname, generatedB_fname, 0) && !bufref/* autocommands deleted the buffer */.bufref_valid()) {
				return ;
			} 
		} 
		if (flags & 2) {
			if (buf.apply_autocmds(auto_event.EVENT_BUFWIPEOUT, generatedB_fname, generatedB_fname, 0) && !bufref/* autocommands deleted the buffer */.bufref_valid()) {
				return ;
			} 
		} 
		--generatedB_locked;
		if (is_curwin && ModernizedCProgram.curwin != the_curwin && the_curwin.win_valid_any_tab()) {
			ModernizedCProgram.block_autocmds();
			ModernizedCProgram.goto_tabpage_win(the_curtab, the_curwin);
			ModernizedCProgram.unblock_autocmds();
		} 
		if (ModernizedCProgram.aborting()) {
			return ;
		} 
		if (buf == curbuf && !is_curbuf) {
			return ;
		} 
		/* Can't use 'diff' for unloaded buffer. */buf.diff_buf_delete();
		if (ModernizedCProgram.curwin != ((Object)0) && ModernizedCProgram.curwin.getW_buffer() == /* Remove any ownsyntax, unless exiting. */buf) {
			ModernizedCProgram.curwin.reset_synblock();
		} 
		file_buffer generatedW_buffer = win.getW_buffer();
		window_S generatedW_next = (win).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		{ 
			win_T win = new win_T();
			tabpage_T tp = new tabpage_T();
			for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
				for ((win) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (win); (win) = generatedW_next) {
					if (generatedW_buffer == buf) {
						win.clearFolding();
					} 
				}
			}
		}
		buf.ml_close(/* close and delete the memline/memfile */1);
		generatedB_ml.setMl_line_count(/* no lines in buffer */0);
		if ((flags & 4) == 0) {
			/* free the memory allocated for undo */buf.u_blockfree();
			/* reset all undo information */buf.u_clearall();
		} 
		Object generatedB_s = this.getB_s();
		generatedB_s.syntax_clear();
		buf.clear_buf_prop_types();
		int generatedB_flags = this.getB_flags();
		generatedB_flags &=  ~/* a read error is no longer relevant */-1024/*
		 * Free a buffer structure and the things it contains related to the buffer
		 * itself (not the file, that must have been done already).
		 */;
	}
	public void free_buffer() {
		++ModernizedCProgram.buf_free_count;
		buf.free_buffer_stuff(1);
		Object generatedB_vars = this.getB_vars();
		dictitem16_S generatedB_ct_di = this.getB_ct_di();
		ModernizedCProgram.dictitem_remove(generatedB_vars, (dictitem_T)generatedB_ct_di);
		generatedB_vars.unref_var_dict();
		buf.remove_listeners();
		buf.buf_hashtab_remove();
		buf.aubuflocal_remove();
		if (autocmd_busy) {
			this.setB_next(/* Do not free the buffer structure while autocommands are executing,
				 * it's still needed. Free it when autocmd_busy is reset. */au_pending_free_buf);
			au_pending_free_buf = buf;
		} else {
				ModernizedCProgram.vim_free(buf/*
				 * Initializes b:changedtick.
				 */);
		} 
	}
	public void init_changedtick() {
		dictitem16_S generatedB_ct_di = this.getB_ct_di();
		dictitem_T di = (dictitem_T)generatedB_ct_di;
		di.setDi_flags(4 | 1);
		 generatedDi_tv = di.getDi_tv();
		generatedDi_tv.setV_type(.VAR_NUMBER);
		generatedDi_tv.setV_lock(2);
		Object generatedVval = generatedDi_tv.getVval();
		generatedVval.setV_number(0);
		Object generatedDi_key = generatedB_ct_di.getDi_key();
		.strcpy((byte)(generatedDi_key), (byte)("changedtick"));
		Object generatedB_vars = this.getB_vars();
		(Object)ModernizedCProgram.dict_add(generatedB_vars, di/*
		 * Free stuff in the buffer for ":bdel" and when wiping out the buffer.
		 */);
	}
	public void free_buffer_stuff(int free_options) {
		Object generatedB_s = this.getB_s();
		if (/* free options as well */free_options) {
			/* including window-local options */buf.clear_wininfo();
			buf.free_buf_options(1);
			generatedB_s.getB_langp().ga_clear();
		} 
		dictitem16_S generatedB_ct_di = (buf).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		Object generatedB_vars = this.getB_vars();
		{ 
			varnumber_T tick = (generatedVval.getV_number());
			generatedB_vars.getDv_hashtab().vars_clear();
			generatedB_vars.getDv_hashtab().hash_init();
			buf.init_changedtick();
			(generatedVval.getV_number()) = tick;
		}
		growarray generatedB_ucmds = this.getB_ucmds();
		// clear local user commands// clear local user commandsgeneratedB_ucmds.uc_clear();
		// delete any signs// delete any signsbuf.buf_delete_signs((char_u)"*");
		buf.map_clear_int((-1024 | -1024 | -1024), 1, /* clear local mappings */0);
		buf.map_clear_int((-1024 | -1024 | -1024), 1, /* clear local abbrevs */1);
		Object generatedB_start_fenc = this.getB_start_fenc();
		do {
			if ((generatedB_start_fenc) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedB_start_fenc);
				(generatedB_start_fenc) = ((Object)0);
			} 
		} while (0/*
		 * Free the b_wininfo list for buffer "buf".
		 */);
	}
	public void clear_wininfo() {
		wininfo_T wip = new wininfo_T();
		wininfo_S generatedB_wininfo = this.getB_wininfo();
		wininfo_S generatedWi_next = wip.getWi_next();
		int generatedWi_optset = wip.getWi_optset();
		 generatedWi_opt = wip.getWi_opt();
		Object generatedWi_folds = wip.getWi_folds();
		while (generatedB_wininfo != ((Object)0)) {
			wip = generatedB_wininfo;
			this.setB_wininfo(generatedWi_next);
			if (generatedWi_optset) {
				generatedWi_opt.clear_winopt();
				generatedWi_folds.deleteFoldRecurse();
			} 
			ModernizedCProgram.vim_free(wip/*
			 * Go to another buffer.  Handles the result of the ATTENTION dialog.
			 */);
		}
	}
	public void set_curbuf(int action) {
		buf_T prevbuf = new buf_T();
		int unload = (action == 2 || action == 3 || action == 4 || action == 5);
		long generatedB_p_tw = curbuf.getB_p_tw();
		long old_tw = generatedB_p_tw;
		bufref_T newbufref = new bufref_T();
		bufref_T prevbufref = new bufref_T();
		ModernizedCProgram.setpcmark();
		int generatedB_fnum = curbuf.getB_fnum();
		if (!ModernizedCProgram.cmdmod.getKeepalt()) {
			ModernizedCProgram.curwin.setW_alt_fnum(generatedB_fnum);
		} 
		/* remember curpos */ModernizedCProgram.curwin.buflist_altfpos();
		ModernizedCProgram.VIsual_reselect = /* Don't restart Select mode after switching to another buffer. */0;
		prevbuf = /* close_windows() or apply_autocmds() may change curbuf and wipe out "buf"
		     */curbuf;
		ModernizedCProgram.set_bufref(prevbufref, prevbuf);
		ModernizedCProgram.set_bufref(newbufref, buf);
		if (!/* Autocommands may delete the curren buffer and/or the buffer we wan to go
		     * to.  In those cases don't close the buffer. */curbuf.apply_autocmds(auto_event.EVENT_BUFLEAVE, ((Object)0), ((Object)0), 0) || (prevbufref.bufref_valid() && newbufref.bufref_valid() && !ModernizedCProgram.aborting())) {
			if (prevbuf == ModernizedCProgram.curwin.getW_buffer()) {
				ModernizedCProgram.curwin.reset_synblock();
			} 
			if (unload) {
				prevbuf.close_windows(0);
			} 
			if (prevbufref.bufref_valid() && !ModernizedCProgram.aborting()) {
				win_T previouswin = ModernizedCProgram.curwin;
				if (prevbuf == curbuf) {
					ModernizedCProgram.u_sync(0);
				} 
				ModernizedCProgram.close_buffer(prevbuf == ModernizedCProgram.curwin.getW_buffer() ? ModernizedCProgram.curwin : ((Object)0), prevbuf, unload ? action : (action == 0 && !prevbuf.buf_hide() && !prevbuf.bufIsChanged()) ? 2 : 0, 0);
				if (ModernizedCProgram.curwin != previouswin && previouswin.win_valid()) {
					ModernizedCProgram.curwin = /* autocommands changed curwin, Grr! */previouswin;
				} 
			} 
		} 
		if ((buf.buf_valid() && buf != /* An autocommand may have deleted "buf", already entered it (e.g., when
		     * it did ":bunload") or aborted the script processing.
		     * If curwin->w_buffer is null, enter_buffer() will make it valid again */curbuf && !ModernizedCProgram.aborting()) || ModernizedCProgram.curwin.getW_buffer() == ((Object)0)) {
			buf.enter_buffer();
			if (old_tw != generatedB_p_tw) {
				ModernizedCProgram.curwin/*
				 * Enter a new current buffer.
				 * Old curbuf must have been abandoned already!  This also means "curbuf" may
				 * be pointing to freed memory.
				 */.check_colorcolumn();
			} 
		} 
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
	 * buffer.c: functions for dealing with the buffer structure
	 */
	/*
	 * The buffer list is a double linked list of all buffers.
	 * Each buffer can be in one of these states:
	 * never loaded: BF_NEVERLOADED is set, only the file name is valid
	 *   not loaded: b_ml.ml_mfp == NULL, no memfile allocated
	 *	 hidden: b_nwindows == 0, loaded but not displayed in a window
	 *	 normal: loaded and displayed in a window
	 *
	 * Instead of storing file names all over the place, each file name is
	 * stored in the buffer list. It can be referenced by a number.
	 *
	 * The current implementation remembers all file names ever used.
	 */
	public void enter_buffer() {
		// Get the buffer in the current window.// Get the buffer in the current window.ModernizedCProgram.curwin.setW_buffer(buf);
		curbuf = buf;
		int generatedB_nwindows = curbuf.getB_nwindows();
		++generatedB_nwindows;
		// Copy buffer and window local option values.  Not for a help buffer.// Copy buffer and window local option values.  Not for a help buffer.buf.buf_copy_options(1 | 4);
		int generatedB_help = this.getB_help();
		if (!generatedB_help) {
			buf.get_winopts();
		} else {
				ModernizedCProgram.curwin.clearFolding();
		} 
		// update folds (later).// update folds (later).ModernizedCProgram.curwin.foldUpdateAll();
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_diff()) {
			curbuf.diff_buf_add();
		} 
		Object generatedB_s = curbuf.getB_s();
		ModernizedCProgram.curwin.setW_s((generatedB_s));
		ModernizedCProgram.curwin.getW_cursor().setLnum(/* Cursor on first line by default. */1);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		ModernizedCProgram.curwin.getW_cursor().setColadd(0);
		ModernizedCProgram.curwin.setW_set_curswant(1);
		ModernizedCProgram.curwin.setW_topline_was_set(0);
		ModernizedCProgram.curwin.setW_valid(/* mark cursor position as being invalid */0);
		 generatedB_last_cursor = curbuf.getB_last_cursor();
		Object generatedLnum = generatedB_last_cursor.getLnum();
		Object generatedCol = generatedB_last_cursor.getCol();
		ModernizedCProgram.buflist_setfpos(curbuf, ModernizedCProgram.curwin, generatedLnum, generatedCol, 1);
		memline generatedB_ml = curbuf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		Object generatedB_p_ft = curbuf.getB_p_ft();
		if (generatedMl_mfp == ((Object)/* Make sure the buffer is loaded. *//* need to load the file */0/* If there is no filetype, allow for detecting one.  Esp. useful for
			 * ":ball" used in a autocommand.  If there already is a filetype we
			 * might prefer to keep it. */)) {
			if (generatedB_p_ft == (byte)'\000') {
				did_filetype = 0;
			} 
			((Object)0).open_buffer(0, 0);
		} else {
				if (!msg_silent && !ModernizedCProgram.shortmess((byte)'F')) {
					need_fileinfo = 1;
				} 
				(Object)curbuf.buf_check_timestamp(0);
				ModernizedCProgram.curwin.setW_topline(1);
				ModernizedCProgram.curwin.setW_topfill(0);
				curbuf.apply_autocmds(auto_event.EVENT_BUFENTER, ((Object)0), ((Object)0), 0);
				curbuf.apply_autocmds(auto_event.EVENT_BUFWINENTER, ((Object)0), ((Object)0), 0);
		} 
		if (generatedLnum == 1 && ModernizedCProgram.inindent(/* If autocommands did not change the cursor position, restore cursor lnum
		     * and possibly cursor col. */0)) {
			ModernizedCProgram.buflist_getfpos();
		} 
		/* check for valid arg_idx */ModernizedCProgram.curwin.check_arg_idx();
		ModernizedCProgram.maketitle();
		if (ModernizedCProgram.curwin.getW_topline() == 1 && !ModernizedCProgram.curwin.getW_topline_was_set()) {
			ModernizedCProgram.scroll_cursor_halfway(/* redisplay at correct position */0/* Send fileOpened event because we've changed buffers. */);
		} 
		do {
			if (p_acd) {
				ModernizedCProgram.do_autochdir();
			} 
		} while (/* Change directories when the 'acd' option is set. */0);
		Object generatedB_kmap_state = curbuf.getB_kmap_state();
		if (generatedB_kmap_state & 1) {
			(Object)ModernizedCProgram.keymap_init();
		} 
		if (!generatedB_help && ModernizedCProgram.curwin.getW_onebuf_opt().getWo_spell() && ModernizedCProgram.curwin.getW_s().getB_p_spl() != /* May need to set the spell language.  Can only do this after the buffer
		     * has been properly setup. */(byte)'\000') {
			(Object)ModernizedCProgram.curwin.did_set_spelllang();
		} 
		curbuf.setB_last_used(ModernizedCProgram.vim_time());
		ModernizedCProgram.redraw_later(40/*
		 * Change to the directory of the current buffer.
		 * Don't do this while still starting up.
		 */);
	}
	public void no_write_message_nobang() {
		ModernizedCProgram.emsg(((byte)("E37: No write since last change"/*
		 * functions for dealing with the buffer list
		 */)));
	}
	public file_buffer buflist_new(Object ffname_arg, Object sfname_arg, Object lnum, int flags) {
		// preferred cursor line// BLN_ defineschar_u ffname = ffname_arg;
		char_u sfname = sfname_arg;
		buf_T buf = new buf_T();
		if (ModernizedCProgram.top_file_num == 1) {
			ModernizedCProgram.buf_hashtab.hash_init();
		} 
		// will allocate ffname// will allocate ffnamecurbuf.fname_expand(ffname, sfname/*
		     * If file name already exists in the list, update the entry.
		     */);
		file_buffer file_buffer = new file_buffer();
		int generatedB_p_bl = buf.getB_p_bl();
		if (ffname != ((Object)0) && !(flags & (4 | 8)) && (/* On Unix we can use inode numbers when the file exists.  Works better
		     * for hard links. */buf = file_buffer.buflist_findname(ffname)) != ((Object)0)) {
			ModernizedCProgram.vim_free(ffname);
			if (lnum != 0) {
				ModernizedCProgram.buflist_setfpos(buf, ModernizedCProgram.curwin, lnum, (colnr_T)0, 0);
			} 
			if ((flags & 16) == 0/* copy the options now, if 'cpo' doesn't have 's' and not done
				     * already */) {
				buf.buf_copy_options(0);
			} 
			if ((flags & 2) && !generatedB_p_bl) {
				bufref_T bufref = new bufref_T();
				buf.setB_p_bl(1);
				ModernizedCProgram.set_bufref(bufref, buf);
				if (!(flags & 4)) {
					if (buf.apply_autocmds(auto_event.EVENT_BUFADD, ((Object)0), ((Object)0), 0) && !bufref.bufref_valid()) {
						return ((Object)0);
					} 
				} 
			} 
			return buf/*
			     * If the current buffer has no name and no contents, use the current
			     * buffer.	Otherwise: Need to allocate a new buffer structure.
			     *
			     * This is the ONLY place where a new buffer structure is allocated!
			     * (A spell file buffer is allocated in spell.c, but that's not a normal
			     * buffer.)
			     */;
		} 
		buf = ((Object)0);
		Object generatedB_p_bh = buf.getB_p_bh();
		Object generatedB_p_bt = buf.getB_p_bt();
		if ((flags & 1) && ModernizedCProgram.curbuf_reusable()) {
			buf = curbuf/* It's like this buffer is deleted.  Watch out for autocommands that
				 * change curbuf!  If that happens, allocate a new buffer anyway. */;
			if (generatedB_p_bl) {
				curbuf.apply_autocmds(auto_event.EVENT_BUFDELETE, ((Object)0), ((Object)0), 0);
			} 
			if (buf == curbuf) {
				curbuf.apply_autocmds(auto_event.EVENT_BUFWIPEOUT, ((Object)0), ((Object)0), 0);
			} 
			if (ModernizedCProgram.aborting()) {
				return ((Object)0);
			} 
			if (buf == curbuf) {
				ModernizedCProgram.clear_string_option(generatedB_p_bh);
				ModernizedCProgram.clear_string_option(generatedB_p_bt);
			} 
		} 
		dictvar_S dictvar_S = new dictvar_S();
		Object generatedB_vars = buf.getB_vars();
		Object generatedB_bufvar = buf.getB_bufvar();
		if (buf != curbuf || curbuf == ((Object)0)) {
			buf = (buf_T)ModernizedCProgram.alloc_clear();
			if (buf == ((Object)0)) {
				ModernizedCProgram.vim_free(ffname);
				return ((Object)0);
			} 
			buf.setB_vars(dictvar_S.dict_alloc());
			if (generatedB_vars == ((Object)0)) {
				ModernizedCProgram.vim_free(ffname);
				ModernizedCProgram.vim_free(buf);
				return ((Object)0);
			} 
			ModernizedCProgram.init_var_dict(generatedB_vars, generatedB_bufvar, 1);
			buf.init_changedtick();
		} 
		if (ffname != ((Object)0)) {
			buf.setB_ffname(ffname);
			buf.setB_sfname(ModernizedCProgram.vim_strsave(sfname));
		} 
		buf.clear_wininfo();
		buf.setB_wininfo((wininfo_T)ModernizedCProgram.alloc_clear());
		Object generatedB_ffname = buf.getB_ffname();
		Object generatedB_sfname = buf.getB_sfname();
		wininfo_S generatedB_wininfo = buf.getB_wininfo();
		if ((ffname != ((Object)0) && (generatedB_ffname == ((Object)0) || generatedB_sfname == ((Object)0))) || generatedB_wininfo == ((Object)0)) {
			if (generatedB_sfname != generatedB_ffname) {
				do {
					if ((generatedB_sfname) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedB_sfname);
						(generatedB_sfname) = ((Object)0);
					} 
				} while (0);
			} else {
					buf.setB_sfname(((Object)0));
			} 
			do {
				if ((generatedB_ffname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedB_ffname);
					(generatedB_ffname) = ((Object)0);
				} 
			} while (0);
			if (buf != curbuf) {
				buf.free_buffer();
			} 
			return ((Object)0);
		} 
		Object generatedB_kmap_state = curbuf.getB_kmap_state();
		if (buf == curbuf) {
			buf.buf_freeall(/* free all things allocated for this buffer */0);
			if (buf != /* autocommands deleted the buffer! */curbuf) {
				return ((Object)0);
			} 
			if (ModernizedCProgram.aborting()) {
				return ((Object)0);
			} 
			buf.free_buffer_stuff(/* delete local variables et al. */0);
			buf.setB_p_initialized(/* Init the options. */0);
			buf.buf_copy_options(1);
			generatedB_kmap_state |=  /* need to reload lmaps and set b:keymap_name */1;
		} else {
				buf.setB_next(((Object)/*
					 * put new buffer at the end of the buffer list
					 */0));
				if (firstbuf == ((Object)/* buffer list is empty */0)) {
					buf.setB_prev(((Object)0));
					firstbuf = buf;
				} else {
						lastbuf.setB_next(/* append new buffer at end of list */buf);
						buf.setB_prev(lastbuf);
				} 
				lastbuf = buf;
				if ((flags & 64) && ModernizedCProgram.buf_reuse.getGa_len() > 0) {
					--ModernizedCProgram.buf_reuse.getGa_len();
					buf.setB_fnum(((int)ModernizedCProgram.buf_reuse.getGa_data())[ModernizedCProgram.buf_reuse.getGa_len()]);
				} else {
						buf.setB_fnum(ModernizedCProgram.top_file_num++);
				} 
				if (ModernizedCProgram.top_file_num < /* wrap around (may cause duplicates) */0) {
					ModernizedCProgram.emsg(((byte)("W14: Warning: List of file names overflow")));
					if (emsg_silent == 0) {
						ModernizedCProgram.out_flush();
						ModernizedCProgram.ui_delay(-1024, /* make sure it is noticed */1);
					} 
					ModernizedCProgram.top_file_num = 1;
				} 
				buf/*
					 * Always copy the options from the current buffer.
					 */.buf_hashtab_add();
				buf.buf_copy_options(2);
		} 
		 generatedWi_fpos = generatedB_wininfo.getWi_fpos();
		generatedWi_fpos.setLnum(lnum);
		generatedB_wininfo.setWi_win(ModernizedCProgram.curwin);
		Object generatedB_s = buf.getB_s();
		generatedB_s.getB_keywtab().hash_init();
		generatedB_s.getB_keywtab_ic().hash_init();
		buf.setB_fname(generatedB_sfname);
		buf.setB_u_synced(1);
		buf.setB_flags(-1024 | -1024);
		int generatedB_flags = buf.getB_flags();
		if (flags & 4) {
			generatedB_flags |=  -1024;
		} 
		buf.buf_clear_file();
		/* clear marks */buf.clrallmarks();
		/* check file marks for this file */buf.fmarks_check_names();
		buf.setB_p_bl((flags & 2) ? 1 : /* init 'buflisted' */0);
		if (!(flags & 4)) {
			bufref_T bufref = new bufref_T();
			ModernizedCProgram.set_bufref(bufref, buf);
			if (buf.apply_autocmds(auto_event.EVENT_BUFNEW, ((Object)0), ((Object)0), 0) && !bufref.bufref_valid()) {
				return ((Object)0);
			} 
			if (flags & 2) {
				if (buf.apply_autocmds(auto_event.EVENT_BUFADD, ((Object)0), ((Object)0), 0) && !bufref.bufref_valid()) {
					return ((Object)0);
				} 
			} 
			if (ModernizedCProgram.aborting()) {
				return ((Object)0);
			} 
		} 
		return buf/*
		 * Free the memory for the options of a buffer.
		 * If "free_p_ff" is TRUE also free 'fileformat', 'buftype' and
		 * 'fileencoding'.
		 */;
	}
	// full path of fname or relative
	// short fname or NULL
	public void free_buf_options(int free_p_ff) {
		Object generatedB_p_fenc = this.getB_p_fenc();
		Object generatedB_p_ff = this.getB_p_ff();
		Object generatedB_p_bh = this.getB_p_bh();
		Object generatedB_p_bt = this.getB_p_bt();
		if (free_p_ff) {
			ModernizedCProgram.clear_string_option(generatedB_p_fenc);
			ModernizedCProgram.clear_string_option(generatedB_p_ff);
			ModernizedCProgram.clear_string_option(generatedB_p_bh);
			ModernizedCProgram.clear_string_option(generatedB_p_bt);
		} 
		Object generatedB_p_def = this.getB_p_def();
		ModernizedCProgram.clear_string_option(generatedB_p_def);
		Object generatedB_p_inc = this.getB_p_inc();
		ModernizedCProgram.clear_string_option(generatedB_p_inc);
		Object generatedB_p_inex = this.getB_p_inex();
		ModernizedCProgram.clear_string_option(generatedB_p_inex);
		Object generatedB_p_inde = this.getB_p_inde();
		ModernizedCProgram.clear_string_option(generatedB_p_inde);
		Object generatedB_p_indk = this.getB_p_indk();
		ModernizedCProgram.clear_string_option(generatedB_p_indk);
		Object generatedB_p_bexpr = this.getB_p_bexpr();
		ModernizedCProgram.clear_string_option(generatedB_p_bexpr);
		Object generatedB_p_cm = this.getB_p_cm();
		ModernizedCProgram.clear_string_option(generatedB_p_cm);
		Object generatedB_p_fp = this.getB_p_fp();
		ModernizedCProgram.clear_string_option(generatedB_p_fp);
		Object generatedB_p_fex = this.getB_p_fex();
		ModernizedCProgram.clear_string_option(generatedB_p_fex);
		Object generatedB_p_key = this.getB_p_key();
		ModernizedCProgram.clear_string_option(generatedB_p_key);
		Object generatedB_p_kp = this.getB_p_kp();
		ModernizedCProgram.clear_string_option(generatedB_p_kp);
		Object generatedB_p_mps = this.getB_p_mps();
		ModernizedCProgram.clear_string_option(generatedB_p_mps);
		Object generatedB_p_fo = this.getB_p_fo();
		ModernizedCProgram.clear_string_option(generatedB_p_fo);
		Object generatedB_p_flp = this.getB_p_flp();
		ModernizedCProgram.clear_string_option(generatedB_p_flp);
		Object generatedB_p_isk = this.getB_p_isk();
		ModernizedCProgram.clear_string_option(generatedB_p_isk);
		Object generatedB_p_vsts = this.getB_p_vsts();
		ModernizedCProgram.clear_string_option(generatedB_p_vsts);
		Object generatedB_p_vsts_nopaste = this.getB_p_vsts_nopaste();
		ModernizedCProgram.vim_free(generatedB_p_vsts_nopaste);
		this.setB_p_vsts_nopaste(((Object)0));
		Object generatedB_p_vsts_array = this.getB_p_vsts_array();
		ModernizedCProgram.vim_free(generatedB_p_vsts_array);
		this.setB_p_vsts_array(((Object)0));
		Object generatedB_p_vts = this.getB_p_vts();
		ModernizedCProgram.clear_string_option(generatedB_p_vts);
		Object generatedB_p_vts_array = this.getB_p_vts_array();
		do {
			if ((generatedB_p_vts_array) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedB_p_vts_array);
				(generatedB_p_vts_array) = ((Object)0);
			} 
		} while (0);
		Object generatedB_p_keymap = this.getB_p_keymap();
		ModernizedCProgram.clear_string_option(generatedB_p_keymap);
		Object generatedB_kmap_ga = this.getB_kmap_ga();
		generatedB_kmap_ga.keymap_clear();
		generatedB_kmap_ga.ga_clear();
		Object generatedB_p_com = this.getB_p_com();
		ModernizedCProgram.clear_string_option(generatedB_p_com);
		Object generatedB_p_cms = this.getB_p_cms();
		ModernizedCProgram.clear_string_option(generatedB_p_cms);
		Object generatedB_p_nf = this.getB_p_nf();
		ModernizedCProgram.clear_string_option(generatedB_p_nf);
		Object generatedB_p_syn = this.getB_p_syn();
		ModernizedCProgram.clear_string_option(generatedB_p_syn);
		Object generatedB_s = this.getB_s();
		ModernizedCProgram.clear_string_option(generatedB_s.getB_syn_isk());
		ModernizedCProgram.clear_string_option(generatedB_s.getB_p_spc());
		ModernizedCProgram.clear_string_option(generatedB_s.getB_p_spf());
		generatedB_s.getB_cap_prog().vim_regfree();
		generatedB_s.setB_cap_prog(((Object)0));
		ModernizedCProgram.clear_string_option(generatedB_s.getB_p_spl());
		Object generatedB_p_sua = this.getB_p_sua();
		ModernizedCProgram.clear_string_option(generatedB_p_sua);
		Object generatedB_p_ft = this.getB_p_ft();
		ModernizedCProgram.clear_string_option(generatedB_p_ft);
		Object generatedB_p_cink = this.getB_p_cink();
		ModernizedCProgram.clear_string_option(generatedB_p_cink);
		Object generatedB_p_cino = this.getB_p_cino();
		ModernizedCProgram.clear_string_option(generatedB_p_cino);
		Object generatedB_p_cinw = this.getB_p_cinw();
		ModernizedCProgram.clear_string_option(generatedB_p_cinw);
		Object generatedB_p_cpt = this.getB_p_cpt();
		ModernizedCProgram.clear_string_option(generatedB_p_cpt);
		Object generatedB_p_cfu = this.getB_p_cfu();
		ModernizedCProgram.clear_string_option(generatedB_p_cfu);
		Object generatedB_p_ofu = this.getB_p_ofu();
		ModernizedCProgram.clear_string_option(generatedB_p_ofu);
		Object generatedB_p_gp = this.getB_p_gp();
		ModernizedCProgram.clear_string_option(generatedB_p_gp);
		Object generatedB_p_mp = this.getB_p_mp();
		ModernizedCProgram.clear_string_option(generatedB_p_mp);
		Object generatedB_p_efm = this.getB_p_efm();
		ModernizedCProgram.clear_string_option(generatedB_p_efm);
		Object generatedB_p_ep = this.getB_p_ep();
		ModernizedCProgram.clear_string_option(generatedB_p_ep);
		Object generatedB_p_path = this.getB_p_path();
		ModernizedCProgram.clear_string_option(generatedB_p_path);
		Object generatedB_p_tags = this.getB_p_tags();
		ModernizedCProgram.clear_string_option(generatedB_p_tags);
		Object generatedB_p_tc = this.getB_p_tc();
		ModernizedCProgram.clear_string_option(generatedB_p_tc);
		Object generatedB_p_tfu = this.getB_p_tfu();
		ModernizedCProgram.clear_string_option(generatedB_p_tfu);
		Object generatedB_p_dict = this.getB_p_dict();
		ModernizedCProgram.clear_string_option(generatedB_p_dict);
		Object generatedB_p_tsr = this.getB_p_tsr();
		ModernizedCProgram.clear_string_option(generatedB_p_tsr);
		Object generatedB_p_qe = this.getB_p_qe();
		ModernizedCProgram.clear_string_option(generatedB_p_qe);
		this.setB_p_ar(-1);
		this.setB_p_ul(-123456);
		Object generatedB_p_lw = this.getB_p_lw();
		ModernizedCProgram.clear_string_option(generatedB_p_lw);
		Object generatedB_p_bkc = this.getB_p_bkc();
		ModernizedCProgram.clear_string_option(generatedB_p_bkc);
		Object generatedB_p_menc = this.getB_p_menc();
		ModernizedCProgram.clear_string_option(generatedB_p_menc);
	}
	public file_buffer buflist_findname_exp(Object fname) {
		char_u ffname = new char_u();
		buf_T buf = ((Object)0);
		ffname = ModernizedCProgram.FullName_save(/* First make the name into a full path name */fname, /* force expansion, get rid of symbolic links */0);
		file_buffer file_buffer = new file_buffer();
		if (ffname != ((Object)0)) {
			buf = file_buffer.buflist_findname(ffname);
			ModernizedCProgram.vim_free(ffname);
		} 
		return buf/*
		 * Find file in buffer list by name (it has to be for the current window).
		 * "ffname" must have a full path.
		 * Skips dummy buffers.
		 * Returns NULL if not found.
		 */;
	}
	public file_buffer buflist_findname(Object ffname) {
		buf_T buf = new buf_T();
		int generatedB_flags = buf.getB_flags();
		file_buffer generatedB_prev = buf.getB_prev();
		for (buf = lastbuf; buf != ((Object)0); buf = generatedB_prev) {
			if ((generatedB_flags & -1024) == 0 && !buf.otherfile_buf(ffname)) {
				return buf;
			} 
		}
		return ((Object)0/*
		 * Find file in buffer list by a regexp pattern.
		 * Return fnum of the found buffer.
		 * Return < 0 for error.
		 */);
	}
	/*
	 * Same as buflist_findname(), but pass the stat structure to avoid getting it
	 * twice for the same file.
	 * Returns NULL if not found.
	 */
	public file_buffer buflist_findnr(int nr) {
		char_u[] key = new char_u();
		hashitem_T hi = new hashitem_T();
		if (nr == 0) {
			nr = ModernizedCProgram.curwin.getW_alt_fnum();
		} 
		.sprintf((byte)key, "%x", nr);
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_find(ModernizedCProgram.buf_hashtab, key);
		Object generatedHi_key = (hi).getHi_key();
		Object generatedB_key = curbuf.getB_key();
		if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			return (buf_T)(generatedHi_key - ((int)(generatedB_key - (char_u)curbuf)));
		} 
		return ((Object)0/*
		 * Get name of file 'n' in the buffer list.
		 * When the file has no name an empty string is returned.
		 * home_replace() is used to shorten the file name (used for marks).
		 * Returns a pointer to allocated memory, of NULL when failed.
		 */);
	}
	public void get_winopts() {
		wininfo_T wip = new wininfo_T();
		ModernizedCProgram.curwin.getW_onebuf_opt().clear_winopt();
		ModernizedCProgram.curwin.clearFolding();
		wininfo_S wininfo_S = new wininfo_S();
		wip = wininfo_S.find_wininfo(buf, 1);
		window_S generatedWi_win = wip.getWi_win();
		file_buffer generatedW_buffer = generatedWi_win.getW_buffer();
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedW_fold_manual = wp.getW_fold_manual();
		Object generatedW_folds = wp.getW_folds();
		int generatedWi_optset = wip.getWi_optset();
		 generatedWi_opt = wip.getWi_opt();
		Object generatedWi_fold_manual = wip.getWi_fold_manual();
		Object generatedWi_folds = wip.getWi_folds();
		if (wip != ((Object)0) && generatedWi_win != ((Object)0) && generatedWi_win != ModernizedCProgram.curwin && generatedW_buffer == buf) {
			win_T wp = generatedWi_win;
			generatedW_onebuf_opt.copy_winopt(generatedW_onebuf_opt);
			ModernizedCProgram.curwin.setW_fold_manual(generatedW_fold_manual);
			ModernizedCProgram.curwin.setW_foldinvalid(1);
			generatedW_folds.cloneFoldGrowArray(generatedW_folds);
		}  else if (wip != ((Object)0) && generatedWi_optset) {
			generatedWi_opt.copy_winopt(generatedW_onebuf_opt);
			ModernizedCProgram.curwin.setW_fold_manual(generatedWi_fold_manual);
			ModernizedCProgram.curwin.setW_foldinvalid(1);
			generatedWi_folds.cloneFoldGrowArray(generatedW_folds);
		} else {
				ModernizedCProgram.curwin.getW_allbuf_opt().copy_winopt(generatedW_onebuf_opt);
		} 
		if (p_fdls >= /* Set 'foldlevel' to 'foldlevelstart' if it's not negative. */0) {
			generatedW_onebuf_opt.setWo_fdl(p_fdls);
		} 
		ModernizedCProgram.curwin/*
		 * Find the position (lnum and col) for the buffer 'buf' for the current
		 * window.
		 * Returns a pointer to no_position if no position is found.
		 */.after_copy_winopt();
	}
	public  buflist_findfpos() {
		wininfo_T wip = new wininfo_T();
		pos_T no_position = new pos_T(1, 0, 0);
		wininfo_S wininfo_S = new wininfo_S();
		wip = wininfo_S.find_wininfo(buf, 0);
		 generatedWi_fpos = wip.getWi_fpos();
		if (wip != ((Object)0)) {
			return (generatedWi_fpos);
		} else {
				return no_position/*
				 * Find the lnum for the buffer 'buf' for the current window.
				 */;
		} 
	}
	public Object buflist_findlnum() {
		return buf.buflist_findfpos().getLnum();
	}
	public int setfname(Object ffname_arg, Object sfname_arg, int message) {
		char_u ffname = /* give message when buffer already exists */ffname_arg;
		char_u sfname = sfname_arg;
		buf_T obuf = ((Object)0);
		Object generatedB_sfname = this.getB_sfname();
		Object generatedB_ffname = this.getB_ffname();
		int generatedB_flags = this.getB_flags();
		file_buffer file_buffer = new file_buffer();
		memline generatedB_ml = obuf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (ffname == ((Object)0) || ffname == (byte)'\000') {
			if (generatedB_sfname != generatedB_ffname) {
				do {
					if ((generatedB_sfname) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedB_sfname);
						(generatedB_sfname) = ((Object)0);
					} 
				} while (0);
			} else {
					this.setB_sfname(((Object)0));
			} 
			do {
				if ((generatedB_ffname) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedB_ffname);
					(generatedB_ffname) = ((Object)0);
				} 
			} while (0);
		} else {
				buf.fname_expand(ffname, /* will allocate ffname */sfname);
				if (ffname == ((Object)/* out of memory */0)) {
					return 0/*
						 * if the file name is already used in another buffer:
						 * - if the buffer is loaded, fail
						 * - if the buffer is not loaded, delete it from the list
						 */;
				} 
				if (!(generatedB_flags & -1024)) {
					obuf = file_buffer.buflist_findname(ffname);
				} 
				if (obuf != ((Object)0) && obuf != buf) {
					if (generatedMl_mfp != ((Object)/* it's loaded, fail */0)) {
						if (message) {
							ModernizedCProgram.emsg(((byte)("E95: Buffer with this name already exists")));
						} 
						ModernizedCProgram.vim_free(ffname);
						return 0;
					} 
					ModernizedCProgram.close_buffer(((Object)0), obuf, 4, /* delete from the list */0);
				} 
				sfname = ModernizedCProgram.vim_strsave(sfname);
				if (ffname == ((Object)0) || sfname == ((Object)0)) {
					ModernizedCProgram.vim_free(sfname);
					ModernizedCProgram.vim_free(ffname);
					return 0;
				} 
				ModernizedCProgram.fname_case(sfname, /* set correct case for short file name */0);
				if (generatedB_sfname != generatedB_ffname) {
					ModernizedCProgram.vim_free(generatedB_sfname);
				} 
				ModernizedCProgram.vim_free(generatedB_ffname);
				this.setB_ffname(ffname);
				this.setB_sfname(sfname);
		} 
		this.setB_fname(generatedB_sfname);
		this.setB_shortname(0);
		buf.buf_name_changed();
		return 1/*
		 * Crude way of changing the name of a buffer.  Use with care!
		 * The name should be relative to the current directory.
		 */;
	}
	public void buf_name_changed() {
		memline generatedB_ml = this.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (generatedMl_mfp != ((Object)0)) {
			buf.ml_setname();
		} 
		if (ModernizedCProgram.curwin.getW_buffer() == buf) {
			/* check file name for arg list */ModernizedCProgram.curwin.check_arg_idx();
		} 
		ModernizedCProgram.maketitle();
		ModernizedCProgram.status_redraw_all();
		/* check named file marks */buf.fmarks_check_names();
		/* reset timestamp */buf/*
		 * set alternate file name for current window
		 *
		 * Used by do_one_cmd(), do_write() and do_ecmd().
		 * Return the buffer.
		 */.ml_timestamp();
	}
	/*
	     * If the file name changed, also change the name of the swapfile
	     */
	public file_buffer setaltfname(Object ffname, Object sfname, Object lnum) {
		buf_T buf = new buf_T();
		file_buffer file_buffer = new file_buffer();
		buf = file_buffer.buflist_new(ffname, sfname, lnum, /* Create a buffer.  'buflisted' is not set if it's a new buffer */0);
		int generatedB_fnum = buf.getB_fnum();
		if (buf != ((Object)0) && !ModernizedCProgram.cmdmod.getKeepalt()) {
			ModernizedCProgram.curwin.setW_alt_fnum(generatedB_fnum);
		} 
		return buf/*
		 * Get alternate file name for current window.
		 * Return NULL if there isn't any, and give error message if requested.
		 */;
	}
	public int otherfile_buf(Object ffname) {
		Object generatedB_ffname = this.getB_ffname();
		if (ffname == ((Object)0) || ffname == (byte)'\000' || generatedB_ffname == ((Object)/* no name is different */0)) {
			return 1;
		} 
		if (ModernizedCProgram.vim_fnamecmp((char_u)(ffname), (char_u)(generatedB_ffname)) == 0) {
			return 0/* If no stat_T given, get it now */;
		} 
		/* Use dev/ino to check if the files are the same, even when the names
			 * are different (possible with links).  Still need to compare the
			 * name above, for when the file doesn't exist yet.
			 * Problem: The dev/ino changes when a file is deleted (and created
			 * again) and remains the same when renamed/moved.  We don't want to
			 * mch_stat() each buffer each time, that would be too slow.  Get the
			 * dev/ino again when they appear to match, but not when they appear
			 * to be different: Could skip a buffer when it's actually the same
			 * file. */
		return 1/*
		 * Set inode and device number for a buffer.
		 * Must always be called when b_fname is changed!.
		 */;
	}
	public void fname_expand(Object ffname, Object sfname) {
		// no file name given, nothing to doif (ffname == ((Object)0)) {
			return ;
		} 
		// no short file name given, use ffnameif (sfname == ((Object)0)) {
			sfname = ffname;
		} 
		// expand to full path// expand to full pathffname = ModernizedCProgram.fix_fname(ffname);
		int generatedB_p_bin = this.getB_p_bin();
		if (!generatedB_p_bin) {
			char_u rfname = new char_u();
			rfname = ModernizedCProgram.mch_resolve_path(ffname, 0);
			if (rfname != ((Object)0)) {
				ModernizedCProgram.vim_free(ffname);
				ffname = rfname;
				sfname = rfname;
			} 
		} 
	}
	public int bt_normal() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && generatedB_p_bt[0] == (byte)'\000'/*
		 * Return TRUE if "buf" is the quickfix buffer.
		 */;
	}
	public int bt_quickfix() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && generatedB_p_bt[0] == (byte)'q'/*
		 * Return TRUE if "buf" is a terminal buffer.
		 */;
	}
	/*
	 * Return TRUE if "buf" is a help buffer.
	 */
	public int bt_help() {
		int generatedB_help = this.getB_help();
		return buf != ((Object)0) && generatedB_help;
	}
	public int bt_prompt() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && generatedB_p_bt[0] == (byte)'p' && generatedB_p_bt[1] == (byte)'r'/*
		 * Return TRUE if "buf" is a buffer for a popup window.
		 */;
	}
	public int bt_popup() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && generatedB_p_bt != ((Object)0) && generatedB_p_bt[0] == (byte)'p' && generatedB_p_bt[1] == (byte)'o'/*
		 * Return TRUE if "buf" is a "nofile", "acwrite", "terminal" or "prompt"
		 * buffer.  This means the buffer name is not a file name.
		 */;
	}
	public int bt_nofilename() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && ((generatedB_p_bt[0] == (byte)'n' && generatedB_p_bt[2] == (byte)'f') || generatedB_p_bt[0] == (byte)'a' || generatedB_p_bt[0] == (byte)'t' || generatedB_p_bt[0] == (byte)'p'/*
		 * Return TRUE if "buf" has 'buftype' set to "nofile".
		 */);
	}
	public int bt_nofile() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && generatedB_p_bt[0] == (byte)'n' && generatedB_p_bt[2] == (byte)'f'/*
		 * Return TRUE if "buf" is a "nowrite", "nofile", "terminal" or "prompt"
		 * buffer.
		 */;
	}
	public int bt_dontwrite() {
		Object generatedB_p_bt = this.getB_p_bt();
		return buf != ((Object)0) && (generatedB_p_bt[0] == (byte)'n' || generatedB_p_bt[0] == (byte)'t' || generatedB_p_bt[0] == (byte)'p');
	}
	public int bt_dontwrite_msg() {
		if (buf.bt_dontwrite()) {
			ModernizedCProgram.emsg(((byte)("E382: Cannot write, 'buftype' option is set")));
			return 1;
		} 
		return 0/*
		 * Return TRUE if the buffer should be hidden, according to 'hidden', ":hide"
		 * and 'bufhidden'.
		 */;
	}
	public int buf_hide() {
		Object generatedB_p_bh = this.getB_p_bh();
		switch (generatedB_p_bh[/* 'bufhidden' overrules 'hidden' and ":hide", check it first */0]) {
		case /* "wipe" */(byte)'w':
		case (byte)'h':
				return /* "hide" */1;
		case (byte)'d':
				return /* "delete" */0;
		case /* "unload" */(byte)'u':
		}
		return (ModernizedCProgram.p_hid || ModernizedCProgram.cmdmod.getHide());
	}
	public Object buf_spname() {
		int generatedB_fnum = this.getB_fnum();
		if (buf/*
			 * Differentiate between the quickfix and location list buffers using
			 * the buffer number stored in the global quickfix stack.
			 */.bt_quickfix()) {
			if (generatedB_fnum == ModernizedCProgram.qf_stack_get_bufnr()) {
				return (char_u)((byte)(ModernizedCProgram.msg_qflist));
			} else {
					return (char_u)((byte)(ModernizedCProgram.msg_loclist));
			} 
		} 
		Object generatedB_fname = this.getB_fname();
		if (/* There is no _file_ when 'buftype' is "nofile", b_sfname
		     * contains the name as specified by the user. */buf.bt_nofilename()) {
			if (generatedB_fname != ((Object)0)) {
				return generatedB_fname;
			} 
			if (buf.bt_popup()) {
				return (char_u)((byte)("[Popup]"));
			} 
			return (char_u)((byte)("[Scratch]"));
		} 
		if (generatedB_fname == ((Object)0)) {
			return (char_u)((byte)("[No Name]"));
		} 
		return ((Object)0/*
		 * Set 'buflisted' for curbuf to "on" and trigger autocommands if it changed.
		 */);
	}
	public int buf_contents_changed() {
		buf_T newbuf = new buf_T();
		int differ = 1;
		linenr_T lnum = new linenr_T();
		aco_save_T aco = new aco_save_T();
		exarg_T ea = new exarg_T();
		file_buffer file_buffer = new file_buffer();
		newbuf = file_buffer.buflist_new(((Object)0), ((Object)0), (linenr_T)1, /* Allocate a buffer without putting it in the buffer list. */4);
		if (newbuf == ((Object)0)) {
			return 1;
		} 
		if (ModernizedCProgram.prep_exarg(ea, buf) == /* Force the 'fileencoding' and 'fileformat' to be equal. */0) {
			newbuf.wipe_buffer(0);
			return 1;
		} 
		ModernizedCProgram.aucmd_prepbuf(aco, /* set curwin/curbuf to buf and save a few things */newbuf);
		Object generatedB_ffname = this.getB_ffname();
		Object generatedB_fname = this.getB_fname();
		memline generatedB_ml = this.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (curbuf.ml_open() == 1 && ea.readfile(generatedB_ffname, generatedB_fname, (linenr_T)0, (linenr_T)0, (linenr_T)LONG_MAX, -1024 | -1024) == 1) {
			if (generatedMl_line_count == generatedMl_line_count) {
				differ = 0;
				for (lnum = 1; lnum <= generatedMl_line_count; ++lnum) {
					if (.strcmp((byte)(buf.ml_get_buf(lnum, 0)), (byte)(ModernizedCProgram.ml_get(lnum))) != 0) {
						differ = 1;
						break;
					} 
				}
			} 
		} 
		Object generatedCmd = ea.getCmd();
		ModernizedCProgram.vim_free(generatedCmd);
		/* restore curwin/curbuf and a few other things */aco.aucmd_restbuf();
		if (curbuf != /* safety check */newbuf) {
			newbuf.wipe_buffer(0);
		} 
		return differ/*
		 * Wipe out a buffer and decrement the last buffer number if it was used for
		 * this buffer.  Call this to wipe out a temp buffer that does not contain any
		 * marks.
		 */;
	}
	public void wipe_buffer(int aucmd) {
		int generatedB_fnum = this.getB_fnum();
		if (generatedB_fnum == ModernizedCProgram.top_file_num - /* When TRUE trigger autocommands. */1) {
			--ModernizedCProgram.top_file_num;
		} 
		if (!/* Don't trigger BufDelete autocommands here. */aucmd) {
			ModernizedCProgram.block_autocmds();
		} 
		ModernizedCProgram.close_buffer(((Object)0), buf, 4, 0);
		if (!aucmd) {
			ModernizedCProgram.unblock_autocmds();
		} 
	}
	public int skip_for_viminfo() {
		Object generatedB_ffname = this.getB_ffname();
		return ModernizedCProgram.removable(generatedB_ffname);
	}
	public void syn_stack_apply_changes() {
		win_T wp = new win_T();
		Object generatedB_s = this.getB_s();
		ModernizedCProgram.syn_stack_apply_changes_block(generatedB_s, buf);
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedW_s = wp.getW_s();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if ((generatedW_buffer == buf) && (generatedW_s != generatedB_s)) {
				ModernizedCProgram.syn_stack_apply_changes_block(generatedW_s, buf);
			} 
		}
	}
	public int sign_group_get_next_signid(Object groupname) {
		int id = 1;
		signgroup_T group = ((Object)0);
		signlist_T sign = new signlist_T();
		hashitem_T hi = new hashitem_T();
		int found = 0;
		hashitem_S hashitem_S = new hashitem_S();
		Object generatedHi_key = (hi).getHi_key();
		if (groupname != ((Object)0)) {
			hi = hashitem_S.hash_find(ModernizedCProgram.sg_table, groupname);
			if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				return id;
			} 
			group = ((signgroup_T)(generatedHi_key - ((size_t)((signgroup_T)0).getSg_name())));
		} 
		int generatedNext_sign_id = group.getNext_sign_id();
		int generatedId = sign.getId();
		signlist generatedNext = sign.getNext();
		Object generatedB_signlist = this.getB_signlist();
		// Search for the next usable sign identifierwhile (!found) {
			if (group == ((Object)0)) {
				id = ModernizedCProgram.next_sign_id++;
			} else {
					id = generatedNext_sign_id++;
			} 
			found = 1;
			for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
				if (id == generatedId && sign.sign_in_group(groupname)) {
					found = 0;
					break;
				} 
			}
		}
		return id/*
		 * Insert a new sign into the signlist for buffer 'buf' between the 'prev' and
		 * 'next' signs.
		 */;
	}
	public void buf_addsign(int id, Object groupname, int prio, Object lnum, int typenr) {
		// sign priority// line number which gets the mark// typenr of sign we are adding// a sign in the signlistsignlist_T sign = new signlist_T();
		// the previous signsignlist_T prev = new signlist_T();
		prev = ((Object)0);
		Object generatedLnum = sign.getLnum();
		int generatedId = sign.getId();
		signlist generatedNext = sign.getNext();
		Object generatedB_signlist = this.getB_signlist();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
			if (lnum == generatedLnum && id == generatedId && sign.sign_in_group(groupname)) {
				sign.setTypenr(typenr);
				sign.setPriority(prio);
				ModernizedCProgram.sign_sort_by_prio_on_line(buf, sign);
				return ;
			}  else if (lnum < generatedLnum) {
				ModernizedCProgram.insert_sign_by_lnum_prio(buf, prev, id, groupname, prio, lnum, typenr);
				return ;
			} 
			prev = sign;
		}
		ModernizedCProgram.insert_sign_by_lnum_prio(buf, prev, id, groupname, prio, lnum, typenr);
		return ;/*
		 * For an existing, placed sign "markId" change the type to "typenr".
		 * Returns the line number of the sign, or zero if the sign is not found.
		 */
	}
	// buffer to store sign in
	// sign ID
	// sign group
	public Object buf_change_sign_type(int markId, Object group, int typenr, int prio) {
		// typenr of sign we are adding// sign priority// a sign in the signlistsignlist_T sign = new signlist_T();
		int generatedId = sign.getId();
		Object generatedLnum = sign.getLnum();
		signlist generatedNext = sign.getNext();
		Object generatedB_signlist = this.getB_signlist();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
			if (generatedId == markId && sign.sign_in_group(group)) {
				sign.setTypenr(typenr);
				sign.setPriority(prio);
				ModernizedCProgram.sign_sort_by_prio_on_line(buf, sign);
				return generatedLnum;
			} 
		}
		return (linenr_T)0/*
		 * Return the attributes of the first sign placed on line 'lnum' in buffer
		 * 'buf'. Used when refreshing the screen. Returns TRUE if a sign is found on
		 * 'lnum', FALSE otherwise.
		 */;
	}
	// buffer to store sign in
	// sign ID
	// sign group
	public Object buf_delsign(Object atlnum, int id, Object group) {
		// sign id// sign group// pointer to pointer to current signsignlist_T lastp = new signlist_T();
		// a sign in a b_signlistsignlist_T sign = new signlist_T();
		// the next sign in a b_signlistsignlist_T next = new signlist_T();
		// line number whose sign was deletedlinenr_T lnum = new linenr_T();
		Object generatedB_signlist = this.getB_signlist();
		lastp = generatedB_signlist;
		lnum = 0;
		signlist generatedNext = sign.getNext();
		int generatedId = sign.getId();
		Object generatedLnum = sign.getLnum();
		signlist generatedPrev = sign.getPrev();
		signgroup_S generatedGroup = sign.getGroup();
		Object generatedSg_name = generatedGroup.getSg_name();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = next) {
			next = generatedNext;
			if ((id == 0 || generatedId == id) && (atlnum == 0 || generatedLnum == atlnum) && sign.sign_in_group(group)) {
				lastp = next;
				if (next != ((Object)0)) {
					next.setPrev(generatedPrev);
				} 
				lnum = generatedLnum;
				if (generatedGroup != ((Object)0)) {
					ModernizedCProgram.sign_group_unref(generatedSg_name);
				} 
				ModernizedCProgram.vim_free(sign);
				buf.redraw_buf_line_later(lnum);
				if (group == ((Object)0) || (group != (byte)'*' && id != 0) || (group == (byte)'*' && atlnum != 0)) {
					break;
				} 
			} else {
					lastp = generatedNext;
			} 
		}
		// When deleting the last sign the cursor position may change, because the// sign columns no longer shows.  And the 'signcolumn' may be hidden.if (generatedB_signlist == ((Object)0)) {
			buf.redraw_buf_later(40);
			ModernizedCProgram.changed_line_abv_curs();
		} 
		return lnum/*
		 * Find the line number of the sign with the requested id in group 'group'. If
		 * the sign does not exist, return 0 as the line number. This will still let
		 * the correct file get loaded.
		 */;
	}
	// buffer sign is stored in
	// sign at this line, 0 - at any line
	public int buf_findsign(int id, Object group) {
		// sign group// a sign in the signlistsignlist_T sign = new signlist_T();
		int generatedId = sign.getId();
		Object generatedLnum = sign.getLnum();
		signlist generatedNext = sign.getNext();
		Object generatedB_signlist = this.getB_signlist();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
			if (generatedId == id && sign.sign_in_group(group)) {
				return generatedLnum;
			} 
		}
		return 0/*
		 * Return the sign at line 'lnum' in buffer 'buf'. Returns NULL if a sign is
		 * not found at the line. If 'groupname' is NULL, searches in the global group.
		 */;
	}
	// buffer to store sign in
	// sign ID
	public int buf_findsign_id(Object lnum, Object groupname) {
		// sign group name// a sign in the signlistsignlist_T sign = new signlist_T();
		signlist signlist = new signlist();
		sign = signlist.buf_getsign_at_line(buf, lnum, groupname);
		int generatedId = sign.getId();
		if (sign != ((Object)0)) {
			return generatedId;
		} 
		return 0/*
		 * See if a given type of sign exists on a specific line.
		 */;
	}
	// buffer whose sign we are searching for
	// line number of sign
	// buffer whose sign we are searching for
	// line number of sign
	// sign type number
	// a sign in the signlist
	// Signs are sorted by line number in the buffer. No need to check
	// for signs after the specified line number 'lnum'.
	/*
	 * Return the number of icons on the given line.
	 */
	// a sign in the signlist
	// Signs are sorted by line number in the buffer. No need to check
	// for signs after the specified line number 'lnum'.
	/* FEAT_SIGN_ICONS */
	/* FEAT_NETBEANS_INTG */
	/*
	 * Delete signs in group 'group' in buffer "buf". If 'group' is '*', then
	 * delete all the signs.
	 */
	public void buf_delete_signs(Object group) {
		signlist_T sign = new signlist_T();
		// pointer to pointer to current signsignlist_T lastp = new signlist_T();
		signlist_T next = new signlist_T();
		// When deleting the last sign need to redraw the windows to remove the
		Object generatedB_signlist = this.getB_signlist();
		// sign column. Not when curwin is NULL (this means we're exiting).if (generatedB_signlist != ((Object)0) && ModernizedCProgram.curwin != ((Object)0)) {
			buf.redraw_buf_later(40);
			ModernizedCProgram.changed_line_abv_curs();
		} 
		lastp = generatedB_signlist;
		signlist generatedNext = sign.getNext();
		signlist generatedPrev = sign.getPrev();
		signgroup_S generatedGroup = sign.getGroup();
		Object generatedSg_name = generatedGroup.getSg_name();
		for (sign = generatedB_signlist; sign != ((Object)0); sign = next) {
			next = generatedNext;
			if (sign.sign_in_group(group)) {
				lastp = next;
				if (next != ((Object)0)) {
					next.setPrev(generatedPrev);
				} 
				if (generatedGroup != ((Object)0)) {
					ModernizedCProgram.sign_group_unref(generatedSg_name);
				} 
				ModernizedCProgram.vim_free(sign);
			} else {
					lastp = generatedNext;
			} 
		}
	}
	public void sign_list_placed(Object sign_group) {
		buf_T buf = new buf_T();
		signlist_T sign = new signlist_T();
		byte[] lbuf = new byte[480];
		byte[] group = new byte[480];
		ModernizedCProgram.msg_puts_title(((byte)("\n--- Signs ---")));
		ModernizedCProgram.msg_putchar((byte)'\n');
		if (rbuf == ((Object)0)) {
			buf = firstbuf;
		} else {
				buf = rbuf;
		} 
		Object generatedB_signlist = buf.getB_signlist();
		Object generatedB_fname = buf.getB_fname();
		signgroup_S generatedGroup = sign.getGroup();
		Object generatedSg_name = generatedGroup.getSg_name();
		Object generatedLnum = sign.getLnum();
		int generatedId = sign.getId();
		int generatedTypenr = sign.getTypenr();
		int generatedPriority = sign.getPriority();
		signlist generatedNext = sign.getNext();
		file_buffer generatedB_next = buf.getB_next();
		while (buf != ((Object)0) && !got_int) {
			if (generatedB_signlist != ((Object)0)) {
				ModernizedCProgram.vim_snprintf(lbuf, 480, ((byte)("Signs for %s:")), generatedB_fname);
				ModernizedCProgram.msg_puts_attr(lbuf, ModernizedCProgram.highlight_attr[(int)(.HLF_D)]);
				ModernizedCProgram.msg_putchar((byte)'\n');
			} 
			for (sign = generatedB_signlist; sign != ((Object)0); sign = generatedNext) {
				if (got_int) {
					break;
				} 
				if (!sign.sign_in_group(sign_group)) {
					continue;
				} 
				if (generatedGroup != ((Object)0)) {
					ModernizedCProgram.vim_snprintf(group, 480, ((byte)("  group=%s")), generatedSg_name);
				} else {
						group[0] = (byte)'\0';
				} 
				ModernizedCProgram.vim_snprintf(lbuf, 480, ((byte)("    line=%ld  id=%d%s  name=%s  priority=%d")), (long)generatedLnum, generatedId, group, ModernizedCProgram.sign_typenr2name(generatedTypenr), generatedPriority);
				ModernizedCProgram.msg_puts(lbuf);
				ModernizedCProgram.msg_putchar((byte)'\n');
			}
			if (rbuf != ((Object)0)) {
				break;
			} 
			buf = generatedB_next;
		}
	}
	public void may_force_numberwidth_recompute(int unplace) {
		tabpage_T tp = new tabpage_T();
		win_T wp = new win_T();
		file_buffer generatedW_buffer = wp.getW_buffer();
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_nu = generatedW_onebuf_opt.getWo_nu();
		Object generatedWo_rnu = generatedW_onebuf_opt.getWo_rnu();
		Object generatedW_nrwidth_width = wp.getW_nrwidth_width();
		Object generatedWo_scl = generatedW_onebuf_opt.getWo_scl();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
			for ((wp) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
				if (generatedW_buffer == buf && (generatedWo_nu || generatedWo_rnu) && (unplace || generatedW_nrwidth_width < 2) && (generatedWo_scl == (byte)'n' && (generatedWo_scl + 1) == (byte)'u')) {
					wp.setW_nrwidth_line_count(0/*
					 * Place a sign at the specified file location or update a sign.
					 */);
				} 
			}
		}
	}
	public int sign_place(int sign_id, Object sign_group, Object sign_name, Object lnum, int prio) {
		sign_T sp = new sign_T();
		// Check for reserved character '*' in group nameif (sign_group != ((Object)0) && (sign_group == (byte)'*' || sign_group == (byte)'\0')) {
			return 0;
		} 
		Object generatedSn_name = sp.getSn_name();
		sign generatedSn_next = sp.getSn_next();
		for (sp = ModernizedCProgram.first_sign; sp != ((Object)0); sp = generatedSn_next) {
			if (.strcmp((byte)(generatedSn_name), (byte)(sign_name)) == 0) {
				break;
			} 
		}
		if (sp == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)("E155: Unknown sign: %s")), sign_name);
			return 0;
		} 
		if (sign_id == 0) {
			sign_id = buf.sign_group_get_next_signid(sign_group);
		} 
		int generatedSn_typenr = sp.getSn_typenr();
		if (lnum > 0) {
			buf.buf_addsign(sign_id, sign_group, prio, lnum, generatedSn_typenr);
		} else {
				lnum = buf.buf_change_sign_type(sign_id, sign_group, generatedSn_typenr, prio);
		} 
		// ":sign place {id} line={lnum} name={name} file={fname}":
		if (lnum > 0) {
			buf.redraw_buf_line_later(lnum);
			buf.may_force_numberwidth_recompute(0);
		} else {
				ModernizedCProgram.semsg(((byte)("E885: Not possible to change sign %s")), sign_name);
				return 0;
		} 
		return 1/*
		 * Unplace the specified sign
		 */;
	}
	public int sign_unplace(int sign_id, Object sign_group, Object atlnum) {
		Object generatedB_signlist = this.getB_signlist();
		// No signs in the bufferif (generatedB_signlist == ((Object)0)) {
			return 1;
		} 
		if (sign_id == 0) {
			buf.redraw_buf_later(40);
			buf.buf_delete_signs(sign_group);
		} else {
				linenr_T lnum = new linenr_T();
				lnum = buf.buf_delsign(atlnum, sign_id, sign_group);
				if (lnum == 0) {
					return 0;
				} 
		} 
		// number column width (if enabled) in all the windows displaying the// buffer if 'signcolumn' is set to 'number' in that window.if (generatedB_signlist == ((Object)0)) {
			buf.may_force_numberwidth_recompute(1);
		} 
		return 1/*
		 * Unplace the sign at the current cursor line.
		 */;
	}
	public Object sign_jump(int sign_id, Object sign_group) {
		linenr_T lnum = new linenr_T();
		if ((lnum = buf.buf_findsign(sign_id, sign_group)) <= 0) {
			ModernizedCProgram.semsg(((byte)("E157: Invalid sign ID: %d")), sign_id);
			return -1;
		} 
		window_S window_S = new window_S();
		Object generatedB_fname = this.getB_fname();
		// goto a sign ...if (window_S.buf_jump_open_win(buf) != ((Object)0)) {
			ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
			ModernizedCProgram.check_cursor_lnum();
			ModernizedCProgram.beginline(1);
		} else {
				char_u cmd = new char_u();
				if (generatedB_fname == ((Object)0)) {
					ModernizedCProgram.emsg(((byte)("E934: Cannot jump to a buffer that does not have a name")));
					return -1;
				} 
				cmd = ModernizedCProgram.alloc(.strlen((byte)(generatedB_fname)) + 25);
				if (cmd == ((Object)0)) {
					return -1;
				} 
				.sprintf((byte)cmd, "e +%ld %s", (long)lnum, generatedB_fname);
				ModernizedCProgram.do_cmdline_cmd(cmd);
				ModernizedCProgram.vim_free(cmd);
		} 
		// ... in a current window
		ModernizedCProgram.foldOpenCursor();
		return lnum/*
		 * ":sign define {name} ..." command
		 */;
	}
	public void sign_place_cmd(Object lnum, Object sign_name, int id, Object group, int prio) {
		if (id <= 0) {
			if (lnum >= 0 || sign_name != ((Object)0) || (group != ((Object)0) && group == (byte)'\0')) {
				ModernizedCProgram.emsg(((byte)(e_invarg)));
			} else {
					buf.sign_list_placed(group);
			} 
		} else {
				if (sign_name == ((Object)0) || buf == ((Object)0) || (group != ((Object)0) && group == (byte)'\0')) {
					ModernizedCProgram.emsg(((byte)(e_invarg)));
					return ;
				} 
				buf.sign_place(id, group, sign_name, lnum, prio/*
				 * ":sign unplace" command
				 */);
		} 
		// List signs placed in a file/buffer//   :sign place file={fname}//   :sign place group={group} file={fname}//   :sign place group=* file={fname}//   :sign place buffer={nr}
	}
	public void sign_unplace_cmd(Object lnum, Object sign_name, int id, Object group) {
		if (lnum >= 0 || sign_name != ((Object)0) || (group != ((Object)0) && group == (byte)'\0')) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
			return ;
		} 
		Object generatedB_signlist = this.getB_signlist();
		file_buffer generatedB_next = this.getB_next();
		if (id == -2) {
			if (buf != ((Object)0)) {
				buf.sign_unplace(0, group, 0);
			} else {
					for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
						if (generatedB_signlist != ((Object)0)) {
							buf.buf_delete_signs(group);
						} 
					}
			} 
		} else {
				if (buf != ((Object)0)) {
					buf.sign_unplace(id, group, 0);
				} else {
						if (id == -1) {
							ModernizedCProgram.sign_unplace_at_cursor(group);
						} else {
								for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
									buf.sign_unplace(id, group, 0);
								}
						} 
				} 
		} 
	}
	public void sign_jump_cmd(Object lnum, Object sign_name, int id, Object group) {
		if (sign_name == ((Object)0) && group == ((Object)0) && id == -1) {
			ModernizedCProgram.emsg(((byte)(e_argreq)));
			return ;
		} 
		if (buf == ((Object)0) || (group != ((Object)0) && group == (byte)'\0') || lnum >= 0 || sign_name != ((Object)0)) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
			return ;
		} 
		(Object)buf/*
		 * Parse the command line arguments for the ":sign place", ":sign unplace" and
		 * ":sign jump" commands.
		 * The supported arguments are: line={lnum} name={name} group={group}
		 * priority={prio} and file={fname} or buffer={nr}.
		 */.sign_jump(id, group);
	}
	public int parse_sign_cmd_args(int cmd, Object arg, Object sign_name, int signid, Object group, int prio, Object lnum) {
		char_u arg1 = new char_u();
		char_u name = new char_u();
		char_u filename = ((Object)0);
		int lnum_arg = 0;
		// first arg could be placed sign id// first arg could be placed sign idarg1 = arg;
		if (((int)(arg) - (byte)'0' < 10)) {
			signid = ModernizedCProgram.getdigits(arg);
			if (!((arg) == (byte)' ' || (arg) == (byte)'\t') && arg != (byte)'\000') {
				signid = -1;
				arg = arg1;
			} else {
					arg = ModernizedCProgram.skipwhite(arg);
			} 
		} 
		file_buffer file_buffer = new file_buffer();
		file_buffer file_buffer = new file_buffer();
		while (arg != (byte)'\000') {
			if (.strncmp((byte)(arg), (byte)("line="), (size_t)(true)) == 0) {
				arg += 5;
				lnum = .atoi((byte)arg);
				arg = ModernizedCProgram.skiptowhite(arg);
				lnum_arg = 1;
			}  else if (.strncmp((byte)(arg), (byte)("*"), (size_t)(true)) == 0 && cmd == 4) {
				if (signid != -1) {
					ModernizedCProgram.emsg(((byte)(e_invarg)));
					return 0;
				} 
				signid = -2;
				arg = ModernizedCProgram.skiptowhite(arg + 1);
			}  else if (.strncmp((byte)(arg), (byte)("name="), (size_t)(true)) == 0) {
				arg += 5;
				name = arg;
				arg = ModernizedCProgram.skiptowhite(arg);
				if (arg != (byte)'\000') {
					arg++ = (byte)'\000';
				} 
				while (name[0] == (byte)'0' && name[1] != (byte)'\000') {
					++name;
				}
				sign_name = name;
			}  else if (.strncmp((byte)(arg), (byte)("group="), (size_t)(true)) == 0) {
				arg += 6;
				group = arg;
				arg = ModernizedCProgram.skiptowhite(arg);
				if (arg != (byte)'\000') {
					arg++ = (byte)'\000';
				} 
			}  else if (.strncmp((byte)(arg), (byte)("priority="), (size_t)(true)) == 0) {
				arg += 9;
				prio = .atoi((byte)arg);
				arg = ModernizedCProgram.skiptowhite(arg);
			}  else if (.strncmp((byte)(arg), (byte)("file="), (size_t)(true)) == 0) {
				arg += 5;
				filename = arg;
				buf = file_buffer.buflist_findname_exp(arg);
				break;
			}  else if (.strncmp((byte)(arg), (byte)("buffer="), (size_t)(true)) == 0) {
				arg += 7;
				filename = arg;
				buf = file_buffer.buflist_findnr((int)ModernizedCProgram.getdigits(arg));
				if (ModernizedCProgram.skipwhite(arg) != (byte)'\000') {
					ModernizedCProgram.emsg(((byte)(e_trailing)));
				} 
				break;
			} else {
					ModernizedCProgram.emsg(((byte)(e_invarg)));
					return 0;
			} 
			arg = ModernizedCProgram.skipwhite(arg);
		}
		if (filename != ((Object)0) && buf == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)("E158: Invalid buffer name: %s")), filename);
			return 0;
		} 
		// If the filename is not supplied for the sign place or the sign jump// command, then use the current buffer.if (filename == ((Object)0) && ((cmd == 3 && lnum_arg) || cmd == 5)) {
			buf = ModernizedCProgram.curwin.getW_buffer();
		} 
		return 1/*
		 * ":sign" command
		 */;
	}
	public void check_buf_options() {
		Object generatedB_p_bh = this.getB_p_bh();
		ModernizedCProgram.check_string_option(generatedB_p_bh);
		Object generatedB_p_bt = this.getB_p_bt();
		ModernizedCProgram.check_string_option(generatedB_p_bt);
		Object generatedB_p_fenc = this.getB_p_fenc();
		ModernizedCProgram.check_string_option(generatedB_p_fenc);
		Object generatedB_p_ff = this.getB_p_ff();
		ModernizedCProgram.check_string_option(generatedB_p_ff);
		Object generatedB_p_def = this.getB_p_def();
		ModernizedCProgram.check_string_option(generatedB_p_def);
		Object generatedB_p_inc = this.getB_p_inc();
		ModernizedCProgram.check_string_option(generatedB_p_inc);
		Object generatedB_p_inex = this.getB_p_inex();
		ModernizedCProgram.check_string_option(generatedB_p_inex);
		Object generatedB_p_inde = this.getB_p_inde();
		ModernizedCProgram.check_string_option(generatedB_p_inde);
		Object generatedB_p_indk = this.getB_p_indk();
		ModernizedCProgram.check_string_option(generatedB_p_indk);
		Object generatedB_p_bexpr = this.getB_p_bexpr();
		ModernizedCProgram.check_string_option(generatedB_p_bexpr);
		Object generatedB_p_cm = this.getB_p_cm();
		ModernizedCProgram.check_string_option(generatedB_p_cm);
		Object generatedB_p_fp = this.getB_p_fp();
		ModernizedCProgram.check_string_option(generatedB_p_fp);
		Object generatedB_p_fex = this.getB_p_fex();
		ModernizedCProgram.check_string_option(generatedB_p_fex);
		Object generatedB_p_key = this.getB_p_key();
		ModernizedCProgram.check_string_option(generatedB_p_key);
		Object generatedB_p_kp = this.getB_p_kp();
		ModernizedCProgram.check_string_option(generatedB_p_kp);
		Object generatedB_p_mps = this.getB_p_mps();
		ModernizedCProgram.check_string_option(generatedB_p_mps);
		Object generatedB_p_fo = this.getB_p_fo();
		ModernizedCProgram.check_string_option(generatedB_p_fo);
		Object generatedB_p_flp = this.getB_p_flp();
		ModernizedCProgram.check_string_option(generatedB_p_flp);
		Object generatedB_p_isk = this.getB_p_isk();
		ModernizedCProgram.check_string_option(generatedB_p_isk);
		Object generatedB_p_com = this.getB_p_com();
		ModernizedCProgram.check_string_option(generatedB_p_com);
		Object generatedB_p_cms = this.getB_p_cms();
		ModernizedCProgram.check_string_option(generatedB_p_cms);
		Object generatedB_p_nf = this.getB_p_nf();
		ModernizedCProgram.check_string_option(generatedB_p_nf);
		Object generatedB_p_qe = this.getB_p_qe();
		ModernizedCProgram.check_string_option(generatedB_p_qe);
		Object generatedB_p_syn = this.getB_p_syn();
		ModernizedCProgram.check_string_option(generatedB_p_syn);
		Object generatedB_s = this.getB_s();
		ModernizedCProgram.check_string_option(generatedB_s.getB_syn_isk());
		ModernizedCProgram.check_string_option(generatedB_s.getB_p_spc());
		ModernizedCProgram.check_string_option(generatedB_s.getB_p_spf());
		ModernizedCProgram.check_string_option(generatedB_s.getB_p_spl());
		Object generatedB_p_sua = this.getB_p_sua();
		ModernizedCProgram.check_string_option(generatedB_p_sua);
		Object generatedB_p_cink = this.getB_p_cink();
		ModernizedCProgram.check_string_option(generatedB_p_cink);
		Object generatedB_p_cino = this.getB_p_cino();
		ModernizedCProgram.check_string_option(generatedB_p_cino);
		buf.parse_cino();
		Object generatedB_p_ft = this.getB_p_ft();
		ModernizedCProgram.check_string_option(generatedB_p_ft);
		Object generatedB_p_cinw = this.getB_p_cinw();
		ModernizedCProgram.check_string_option(generatedB_p_cinw);
		Object generatedB_p_cpt = this.getB_p_cpt();
		ModernizedCProgram.check_string_option(generatedB_p_cpt);
		Object generatedB_p_cfu = this.getB_p_cfu();
		ModernizedCProgram.check_string_option(generatedB_p_cfu);
		Object generatedB_p_ofu = this.getB_p_ofu();
		ModernizedCProgram.check_string_option(generatedB_p_ofu);
		Object generatedB_p_tfu = this.getB_p_tfu();
		ModernizedCProgram.check_string_option(generatedB_p_tfu);
		Object generatedB_p_keymap = this.getB_p_keymap();
		ModernizedCProgram.check_string_option(generatedB_p_keymap);
		Object generatedB_p_gp = this.getB_p_gp();
		ModernizedCProgram.check_string_option(generatedB_p_gp);
		Object generatedB_p_mp = this.getB_p_mp();
		ModernizedCProgram.check_string_option(generatedB_p_mp);
		Object generatedB_p_efm = this.getB_p_efm();
		ModernizedCProgram.check_string_option(generatedB_p_efm);
		Object generatedB_p_ep = this.getB_p_ep();
		ModernizedCProgram.check_string_option(generatedB_p_ep);
		Object generatedB_p_path = this.getB_p_path();
		ModernizedCProgram.check_string_option(generatedB_p_path);
		Object generatedB_p_tags = this.getB_p_tags();
		ModernizedCProgram.check_string_option(generatedB_p_tags);
		Object generatedB_p_tc = this.getB_p_tc();
		ModernizedCProgram.check_string_option(generatedB_p_tc);
		Object generatedB_p_dict = this.getB_p_dict();
		ModernizedCProgram.check_string_option(generatedB_p_dict);
		Object generatedB_p_tsr = this.getB_p_tsr();
		ModernizedCProgram.check_string_option(generatedB_p_tsr);
		Object generatedB_p_lw = this.getB_p_lw();
		ModernizedCProgram.check_string_option(generatedB_p_lw);
		Object generatedB_p_bkc = this.getB_p_bkc();
		ModernizedCProgram.check_string_option(generatedB_p_bkc);
		Object generatedB_p_menc = this.getB_p_menc();
		ModernizedCProgram.check_string_option(generatedB_p_menc);
		Object generatedB_p_vsts = this.getB_p_vsts();
		ModernizedCProgram.check_string_option(generatedB_p_vsts);
		Object generatedB_p_vts = this.getB_p_vts();
		ModernizedCProgram.check_string_option(generatedB_p_vts);
	}
	public void set_string_option_direct_in_buf(Object name, int opt_idx, Object val, int opt_flags, int set_sid) {
		buf_T save_curbuf = curbuf;
		ModernizedCProgram.block_autocmds();
		curbuf = buf;
		ModernizedCProgram.curwin.setW_buffer(curbuf);
		ModernizedCProgram.set_string_option_direct(name, opt_idx, val, opt_flags, set_sid);
		curbuf = save_curbuf;
		ModernizedCProgram.curwin.setW_buffer(curbuf);
		ModernizedCProgram.unblock_autocmds();
	}
	public void parse_cino() {
		char_u p = new char_u();
		char_u l = new char_u();
		char_u digits = new char_u();
		int n;
		int divider;
		int fraction = 0;
		int sw = (int)buf.get_sw_value();
		// Set the default values.
		// Spaces from a block's opening brace the prevailing indent for that// block should be.// Spaces from a block's opening brace the prevailing indent for that// block should be.this.setB_ind_level(sw)// Spaces from the edge of the line an open brace that's at the end of a;// Spaces from the edge of the line an open brace that's at the end of a
		// line is imagined to be.// line is imagined to be.this.setB_ind_open_imag(0)// Spaces from the prevailing indent for a line that is not preceded by;// Spaces from the prevailing indent for a line that is not preceded by
		// an opening brace.// an opening brace.this.setB_ind_no_brace(0);
		// Column where the first { of a function should be located }.// Column where the first { of a function should be located }.this.setB_ind_first_open(0)// Spaces from the prevailing indent a leftmost open brace should be;// Spaces from the prevailing indent a leftmost open brace should be
		// located.// located.this.setB_ind_open_extra(0)// Spaces from the matching open brace (real location for one at the left;// Spaces from the matching open brace (real location for one at the left
		// edge; imaginary location from one that ends a line) the matching close// brace should be located.// edge; imaginary location from one that ends a line) the matching close// brace should be located.this.setB_ind_close_extra(0)// Spaces from the edge of the line an open brace sitting in the leftmost;// Spaces from the edge of the line an open brace sitting in the leftmost
		// column is imagined to be.// column is imagined to be.this.setB_ind_open_left_imag(0)// Spaces jump labels should be shifted to the left if N is non-negative,;// Spaces jump labels should be shifted to the left if N is non-negative,
		// otherwise the jump label will be put to column 1.// otherwise the jump label will be put to column 1.this.setB_ind_jump_label(-1);
		// Spaces from the switch() indent a "case xx" label should be located.// Spaces from the switch() indent a "case xx" label should be located.this.setB_ind_case(sw);
		// Spaces from the "case xx:" code after a switch() should be located.// Spaces from the "case xx:" code after a switch() should be located.this.setB_ind_case_code(sw);
		// Lineup break at end of case in switch() with case label.// Lineup break at end of case in switch() with case label.this.setB_ind_case_break(0)// Spaces from the class declaration indent a scope declaration label;// Spaces from the class declaration indent a scope declaration label
		// should be located.// should be located.this.setB_ind_scopedecl(sw);
		// Spaces from the scope declaration label code should be located.// Spaces from the scope declaration label code should be located.this.setB_ind_scopedecl_code(sw);
		// Amount K&R-style parameters should be indented.// Amount K&R-style parameters should be indented.this.setB_ind_param(sw);
		// Amount a function type spec should be indented.// Amount a function type spec should be indented.this.setB_ind_func_type(sw)// Amount a cpp base class declaration or constructor initialization;// Amount a cpp base class declaration or constructor initialization
		// should be indented.// should be indented.this.setB_ind_cpp_baseclass(sw)// additional spaces beyond the prevailing indent a continuation line;// additional spaces beyond the prevailing indent a continuation line
		// should be located.// should be located.this.setB_ind_continuation(sw);
		// Spaces from the indent of the line with an unclosed parentheses.// Spaces from the indent of the line with an unclosed parentheses.this.setB_ind_unclosed(sw * 2)// Spaces from the indent of the line with an unclosed parentheses, which;// Spaces from the indent of the line with an unclosed parentheses, which
		// itself is also unclosed.// itself is also unclosed.this.setB_ind_unclosed2(sw)// Suppress ignoring spaces from the indent of a line starting with an;// Suppress ignoring spaces from the indent of a line starting with an
		// unclosed parentheses.// unclosed parentheses.this.setB_ind_unclosed_noignore(0)// If the opening paren is the last nonwhite character on the line, and;// If the opening paren is the last nonwhite character on the line, and
		// b_ind_unclosed_wrapped is nonzero, use this indent relative to the outer// context (for very long lines).// b_ind_unclosed_wrapped is nonzero, use this indent relative to the outer// context (for very long lines).this.setB_ind_unclosed_wrapped(0)// Suppress ignoring white space when lining up with the character after;// Suppress ignoring white space when lining up with the character after
		// an unclosed parentheses.// an unclosed parentheses.this.setB_ind_unclosed_whiteok(0)// Indent a closing parentheses under the line start of the matching;// Indent a closing parentheses under the line start of the matching
		// opening parentheses.// opening parentheses.this.setB_ind_matching_paren(0);
		// Indent a closing parentheses under the previous line.// Indent a closing parentheses under the previous line.this.setB_ind_paren_prev(0);
		// Extra indent for comments.// Extra indent for comments.this.setB_ind_comment(0);
		// Spaces from the comment opener when there is nothing after it.// Spaces from the comment opener when there is nothing after it.this.setB_ind_in_comment(3)// Boolean: if non-zero, use b_ind_in_comment even if there is something;// Boolean: if non-zero, use b_ind_in_comment even if there is something
		// after the comment opener.// after the comment opener.this.setB_ind_in_comment2(0);
		// Max lines to search for an open paren.// Max lines to search for an open paren.this.setB_ind_maxparen(20);
		// Max lines to search for an open comment.// Max lines to search for an open comment.this.setB_ind_maxcomment(70);
		// Handle braces for java code.// Handle braces for java code.this.setB_ind_java(0);
		// Not to confuse JS object properties with labels.// Not to confuse JS object properties with labels.this.setB_ind_js(0);
		// Handle blocked cases correctly.// Handle blocked cases correctly.this.setB_ind_keep_case_label(0);
		// Handle C++ namespace.// Handle C++ namespace.this.setB_ind_cpp_namespace(0)// Handle continuation lines containing conditions of if(), for() and;// Handle continuation lines containing conditions of if(), for() and
		// while().// while().this.setB_ind_if_for_while(0);
		// indentation for # comments// indentation for # commentsthis.setB_ind_hash_comment(0);
		// Handle C++ extern "C" or "C++"// Handle C++ extern "C" or "C++"this.setB_ind_cpp_extern_c(0);
		Object generatedB_p_cino = this.getB_p_cino();
		for (p = generatedB_p_cino; p; ) {
			l = p++;
			if (p == (byte)'-') {
				++p;
			} 
			digits = p;
			n = ModernizedCProgram.getdigits(p);
			divider = 0;
			if (p == (byte)'.') {
				fraction = .atol((byte)++p);
				while (((int)(p) - (byte)'0' < 10)) {
					++p;
					if (divider) {
						divider *= 10;
					} else {
							divider = 10;
					} 
				}
			} 
			if (p == (byte)'s') {
				if (p == digits) {
					n = sw;
				} else {
						n *= sw;
						if (divider) {
							n += (sw * fraction + divider / 2) / divider;
						} 
				} 
				++p;
			} 
			if (l[1] == (byte)'-') {
				n = -n;
			} 
			switch (l) {
			case (byte)'b':
					this.setB_ind_case_break(n);
					break;
			case (byte)'*':
					this.setB_ind_maxcomment(n);
					break;
			case (byte)'l':
					this.setB_ind_keep_case_label(n);
					break;
			case (byte)'W':
					this.setB_ind_unclosed_wrapped(n);
					break;
			case (byte)')':
					this.setB_ind_maxparen(n);
					break;
			case (byte)'k':
					this.setB_ind_if_for_while(n);
					break;
			case (byte)'(':
					this.setB_ind_unclosed(n);
					break;
			case (byte)'h':
					this.setB_ind_scopedecl_code(n);
					break;
			case (byte)'E':
					this.setB_ind_cpp_extern_c(n);
					break;
			case (byte)'N':
					this.setB_ind_cpp_namespace(n);
					break;
			case (byte)'}':
					this.setB_ind_close_extra(n);
					break;
			case (byte)'j':
					this.setB_ind_java(n);
					break;
			case (byte)'g':
					this.setB_ind_scopedecl(n);
					break;
			case (byte)'f':
					this.setB_ind_first_open(n);
					break;
			case (byte)'e':
					this.setB_ind_open_imag(n);
					break;
			case (byte)'^':
					this.setB_ind_open_left_imag(n);
					break;
			case (byte)'u':
					this.setB_ind_unclosed2(n);
					break;
			case (byte)'m':
					this.setB_ind_matching_paren(n);
					break;
			case (byte)'J':
					this.setB_ind_js(n);
					break;
			case (byte)'+':
					this.setB_ind_continuation(n);
					break;
			case (byte)'C':
					this.setB_ind_in_comment2(n);
					break;
			case (byte)'/':
					this.setB_ind_comment(n);
					break;
			case (byte)':':
					this.setB_ind_case(n);
					break;
			case (byte)'>':
					this.setB_ind_level(n);
					break;
			case (byte)'w':
					this.setB_ind_unclosed_whiteok(n);
					break;
			case (byte)'U':
					this.setB_ind_unclosed_noignore(n);
					break;
			case (byte)'M':
					this.setB_ind_paren_prev(n);
					break;
			case (byte)'t':
					this.setB_ind_func_type(n);
					break;
			case (byte)'n':
					this.setB_ind_no_brace(n);
					break;
			case (byte)'i':
					this.setB_ind_cpp_baseclass(n);
					break;
			case (byte)'#':
					this.setB_ind_hash_comment(n);
					break;
			case (byte)'L':
					this.setB_ind_jump_label(n);
					break;
			case (byte)'p':
					this.setB_ind_param(n);
					break;
			case (byte)'c':
					this.setB_ind_in_comment(n);
					break;
			case (byte)'=':
					this.setB_ind_case_code(n);
					break;
			case (byte)'{':
					this.setB_ind_open_extra(n);
					break;
			}
			if (p == (byte)',') {
				++p;
			} 
		}
	}
	public void u_write_undo(Object name, int forceit, Object hash) {
		u_header_T uhp = new u_header_T();
		char_u file_name = new char_u();
		int mark;
		int fd;
		FILE fp = ((Object)0);
		int perm;
		int write_ok = 0;
		bufinfo_T bi = new bufinfo_T();
		.memset((bi), (false), ());
		Object generatedB_ffname = this.getB_ffname();
		if (name == ((Object)0)) {
			file_name = ModernizedCProgram.u_get_undo_file_name(generatedB_ffname, 0);
			if (file_name == ((Object)0)) {
				if (ModernizedCProgram.p_verbose > 0) {
					ModernizedCProgram.verbose_enter();
					ModernizedCProgram.smsg(((byte)("Cannot write undo file in any directory in 'undodir'")));
					ModernizedCProgram.verbose_leave();
				} 
				return ;
			} 
		} else {
				file_name = name/*
				     * Decide about the permission to use for the undo file.  If the buffer
				     * has a name use the permission of the original file.  Otherwise only
				     * allow the user to access the undo file.
				     */;
		} 
		perm = 600;
		if (generatedB_ffname != ((Object)0)) {
			perm = ModernizedCProgram.mch_getperm(generatedB_ffname);
			if (perm < 0) {
				perm = 600;
			} 
		} 
		perm = perm & /* strip any s-bit and executable bit */666;
		if (ModernizedCProgram.mch_getperm(file_name) >= /* If the undo file already exists, verify that it actually is an undo
		     * file, and delete it. */0) {
			if (name == ((Object)0) || !forceit) {
				fd = ModernizedCProgram.mch_open((byte)file_name, 0 | 0, /* Check we can read it and it's an undo file. */0);
				if (fd < 0) {
					if (name != ((Object)0) || ModernizedCProgram.p_verbose > 0) {
						if (name == ((Object)0)) {
							ModernizedCProgram.verbose_enter();
						} 
						ModernizedCProgram.smsg(((byte)("Will not overwrite with undo file, cannot read: %s")), file_name);
						if (name == ((Object)0)) {
							ModernizedCProgram.verbose_leave();
						} 
					} 
					;
				} else {
						char_u[] mbuf = new char_u();
						int len;
						len = ModernizedCProgram.read_eintr(fd, mbuf, 9);
						.close(fd);
						if (len < 9 || .memcmp(mbuf, "Vim\237UnDo\345", 9) != 0) {
							if (name != ((Object)0) || ModernizedCProgram.p_verbose > 0) {
								if (name == ((Object)0)) {
									ModernizedCProgram.verbose_enter();
								} 
								ModernizedCProgram.smsg(((byte)("Will not overwrite, this is not an undo file: %s")), file_name);
								if (name == ((Object)0)) {
									ModernizedCProgram.verbose_leave();
								} 
							} 
							;
						} 
				} 
			} 
			ModernizedCProgram.mch_remove(file_name);
		} 
		int generatedB_u_numhead = this.getB_u_numhead();
		 generatedB_u_line_ptr = this.getB_u_line_ptr();
		Object generatedUl_line = generatedB_u_line_ptr.getUl_line();
		if (generatedB_u_numhead == 0 && generatedUl_line == ((Object)/* If there is no undo information at all, quit here after deleting any
		     * existing undo file. */0)) {
			if (ModernizedCProgram.p_verbose > 0) {
				ModernizedCProgram.verb_msg(((byte)("Skipping undo file write, nothing to undo")));
			} 
			;
		} 
		fd = ModernizedCProgram.mch_open((byte)file_name, -1024 | 0 | 1 | -1024 | 0, perm);
		if (fd < 0) {
			ModernizedCProgram.semsg(((byte)(ModernizedCProgram.e_not_open)), file_name);
			;
		} 
		(Object)ModernizedCProgram.mch_setperm(file_name, perm);
		if (ModernizedCProgram.p_verbose > 0) {
			ModernizedCProgram.verbose_enter();
			ModernizedCProgram.smsg(((byte)("Writing undo file: %s")), file_name);
			ModernizedCProgram.verbose_leave();
		} 
		/*
		     * Try to set the group of the undo file same as the original file. If
		     * this fails, set the protection bits for the group same as the
		     * protection bits for others.
		     */
		/* sequent-ptx lacks fchown() *//* sequent-ptx lacks fchown() */fp = .fdopen(fd, "w");
		if (fp == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(ModernizedCProgram.e_not_open)), file_name);
			.close(fd);
			ModernizedCProgram.mch_remove(file_name);
			;
		} 
		ModernizedCProgram.u_sync(/* Undo must be synced. */1/*
		     * Write the header.  Initializes encryption, if enabled.
		     */);
		bi.setBi_buf(buf);
		bi.setBi_fp(fp);
		if (bi.serialize_header(hash) == 0) {
			;
		} 
		mark = ++ModernizedCProgram.lastmark;
		u_header generatedB_u_oldhead = this.getB_u_oldhead();
		uhp = generatedB_u_oldhead;
		int generatedUh_walk = uhp.getUh_walk();
		 generatedUh_prev = uhp.getUh_prev();
		Object generatedPtr = generatedUh_prev.getPtr();
		while (uhp != ((Object)0)) {
			if (generatedUh_walk != /* Serialize current UHP if we haven't seen it */mark) {
				uhp.setUh_walk(mark);
				if (ModernizedCProgram.serialize_uhp(bi, uhp) == 0) {
					;
				} 
			} 
			if (generatedPtr != ((Object)0) && generatedUh_walk != /* Now walk through the tree - algorithm from undo_time(). */mark) {
				uhp = generatedPtr;
			}  else if (generatedPtr != ((Object)0) && generatedUh_walk != mark) {
				uhp = generatedPtr;
			}  else if (generatedPtr != ((Object)0) && generatedPtr == ((Object)0) && generatedUh_walk != mark) {
				uhp = generatedPtr;
			}  else if (generatedPtr != ((Object)0)) {
				uhp = generatedPtr;
			} else {
					uhp = generatedPtr;
			} 
		}
		if (bi.undo_write_bytes((long_u)-1024, 2) == 1) {
			write_ok = 1;
		} 
		Object generatedBi_state = bi.getBi_state();
		if (generatedBi_state != ((Object)0) && bi.undo_flush() == 0) {
			write_ok = 0;
		} 
		if (!write_ok) {
			ModernizedCProgram.semsg(((byte)("E829: write error in undo file: %s")), file_name);
		} 
		if (generatedB_ffname != ((Object)/* Copy file attributes; for systems where this can only be done after
		     * closing the file. */0)) {
			(Object)ModernizedCProgram.mch_copy_file_attribute(generatedB_ffname, file_name);
		} 
		if (generatedB_ffname != ((Object)0)) {
			vim_acl_T acl = new vim_acl_T();
			acl = ModernizedCProgram.mch_get_acl(generatedB_ffname);
			ModernizedCProgram.mch_set_acl(file_name, acl);
			ModernizedCProgram.mch_free_acl(acl);
		} 
		Object generatedBi_buffer = bi.getBi_buffer();
		ModernizedCProgram.vim_free(generatedBi_buffer);
		if (file_name != name) {
			ModernizedCProgram.vim_free(file_name/*
			 * Load the undo tree from an undo file.
			 * If "name" is not NULL use it as the undo file name.  This also means being
			 * a bit more verbose.
			 * Otherwise use curbuf->b_ffname to generate the undo file name.
			 * "hash[UNDO_HASH_SIZE]" must be the hash value of the buffer text.
			 */);
		} 
	}
	public void u_unchanged() {
		u_header generatedB_u_oldhead = this.getB_u_oldhead();
		generatedB_u_oldhead.u_unch_branch();
		this.setB_did_warn(0/*
		 * After reloading a buffer which was saved for 'undoreload': Find the first
		 * line that was changed and set the cursor there.
		 */);
	}
	public void u_update_save_nr() {
		u_header_T uhp = new u_header_T();
		long generatedB_u_save_nr_last = this.getB_u_save_nr_last();
		++generatedB_u_save_nr_last;
		this.setB_u_save_nr_cur(generatedB_u_save_nr_last);
		u_header generatedB_u_curhead = this.getB_u_curhead();
		uhp = generatedB_u_curhead;
		 generatedUh_next = uhp.getUh_next();
		Object generatedPtr = generatedUh_next.getPtr();
		u_header generatedB_u_newhead = this.getB_u_newhead();
		if (uhp != ((Object)0)) {
			uhp = generatedPtr;
		} else {
				uhp = generatedB_u_newhead;
		} 
		if (uhp != ((Object)0)) {
			uhp.setUh_save_nr(generatedB_u_save_nr_last);
		} 
	}
	public void u_clearall() {
		this.setB_u_newhead(this.setB_u_oldhead(this.setB_u_curhead(((Object)0))));
		this.setB_u_synced(1);
		this.setB_u_numhead(0);
		 generatedB_u_line_ptr = this.getB_u_line_ptr();
		generatedB_u_line_ptr.setUl_line(((Object)0));
		generatedB_u_line_ptr.setUl_len(0);
		this.setB_u_line_lnum(0/*
		 * Save the line "lnum" for the "U" command.
		 */);
	}
	public void u_blockfree() {
		u_header generatedB_u_oldhead = this.getB_u_oldhead();
		while (generatedB_u_oldhead != ((Object)0)) {
			ModernizedCProgram.u_freeheader(buf, generatedB_u_oldhead, ((Object)0));
		}
		 generatedB_u_line_ptr = this.getB_u_line_ptr();
		Object generatedUl_line = generatedB_u_line_ptr.getUl_line();
		ModernizedCProgram.vim_free(generatedUl_line);
	}
	public int bufIsChanged() {
		return buf/*
		 * Return TRUE if any buffer has changes.  Also buffers that are not written.
		 */.bufIsChangedNotTerm();
	}
	public int bufIsChangedNotTerm() {
		int generatedB_changed = this.getB_changed();
		// In a "prompt" buffer we do respect 'modified', so that we can control// closing the window by setting or resetting that option.return (!buf.bt_dontwrite() || buf.bt_prompt()) && (generatedB_changed || buf.file_ff_differs(1));
	}
	public memline getB_ml() {
		return b_ml;
	}
	public void setB_ml(memline newB_ml) {
		b_ml = newB_ml;
	}
	public file_buffer getB_next() {
		return b_next;
	}
	public void setB_next(file_buffer newB_next) {
		b_next = newB_next;
	}
	public file_buffer getB_prev() {
		return b_prev;
	}
	public void setB_prev(file_buffer newB_prev) {
		b_prev = newB_prev;
	}
	public int getB_nwindows() {
		return b_nwindows;
	}
	public void setB_nwindows(int newB_nwindows) {
		b_nwindows = newB_nwindows;
	}
	public int getB_flags() {
		return b_flags;
	}
	public void setB_flags(int newB_flags) {
		b_flags = newB_flags;
	}
	public int getB_locked() {
		return b_locked;
	}
	public void setB_locked(int newB_locked) {
		b_locked = newB_locked;
	}
	public Object getB_ffname() {
		return b_ffname;
	}
	public void setB_ffname(Object newB_ffname) {
		b_ffname = newB_ffname;
	}
	public Object getB_sfname() {
		return b_sfname;
	}
	public void setB_sfname(Object newB_sfname) {
		b_sfname = newB_sfname;
	}
	public Object getB_fname() {
		return b_fname;
	}
	public void setB_fname(Object newB_fname) {
		b_fname = newB_fname;
	}
	public int getB_fnum() {
		return b_fnum;
	}
	public void setB_fnum(int newB_fnum) {
		b_fnum = newB_fnum;
	}
	public Object getB_key() {
		return b_key;
	}
	public void setB_key(Object newB_key) {
		b_key = newB_key;
	}
	public int getB_changed() {
		return b_changed;
	}
	public void setB_changed(int newB_changed) {
		b_changed = newB_changed;
	}
	public dictitem16_S getB_ct_di() {
		return b_ct_di;
	}
	public void setB_ct_di(dictitem16_S newB_ct_di) {
		b_ct_di = newB_ct_di;
	}
	public Object getB_last_changedtick() {
		return b_last_changedtick;
	}
	public void setB_last_changedtick(Object newB_last_changedtick) {
		b_last_changedtick = newB_last_changedtick;
	}
	public Object getB_last_changedtick_pum() {
		return b_last_changedtick_pum;
	}
	public void setB_last_changedtick_pum(Object newB_last_changedtick_pum) {
		b_last_changedtick_pum = newB_last_changedtick_pum;
	}
	public int getB_saving() {
		return b_saving;
	}
	public void setB_saving(int newB_saving) {
		b_saving = newB_saving;
	}
	public int getB_mod_set() {
		return b_mod_set;
	}
	public void setB_mod_set(int newB_mod_set) {
		b_mod_set = newB_mod_set;
	}
	public Object getB_mod_top() {
		return b_mod_top;
	}
	public void setB_mod_top(Object newB_mod_top) {
		b_mod_top = newB_mod_top;
	}
	public Object getB_mod_bot() {
		return b_mod_bot;
	}
	public void setB_mod_bot(Object newB_mod_bot) {
		b_mod_bot = newB_mod_bot;
	}
	public long getB_mod_xlines() {
		return b_mod_xlines;
	}
	public void setB_mod_xlines(long newB_mod_xlines) {
		b_mod_xlines = newB_mod_xlines;
	}
	public wininfo_S getB_wininfo() {
		return b_wininfo;
	}
	public void setB_wininfo(wininfo_S newB_wininfo) {
		b_wininfo = newB_wininfo;
	}
	public long getB_mtime() {
		return b_mtime;
	}
	public void setB_mtime(long newB_mtime) {
		b_mtime = newB_mtime;
	}
	public long getB_mtime_read() {
		return b_mtime_read;
	}
	public void setB_mtime_read(long newB_mtime_read) {
		b_mtime_read = newB_mtime_read;
	}
	public Object getB_orig_size() {
		return b_orig_size;
	}
	public void setB_orig_size(Object newB_orig_size) {
		b_orig_size = newB_orig_size;
	}
	public int getB_orig_mode() {
		return b_orig_mode;
	}
	public void setB_orig_mode(int newB_orig_mode) {
		b_orig_mode = newB_orig_mode;
	}
	public Object getB_namedm() {
		return b_namedm;
	}
	public void setB_namedm(Object newB_namedm) {
		b_namedm = newB_namedm;
	}
	public  getB_visual() {
		return b_visual;
	}
	public void setB_visual( newB_visual) {
		b_visual = newB_visual;
	}
	public  getB_last_cursor() {
		return b_last_cursor;
	}
	public void setB_last_cursor( newB_last_cursor) {
		b_last_cursor = newB_last_cursor;
	}
	public  getB_last_insert() {
		return b_last_insert;
	}
	public void setB_last_insert( newB_last_insert) {
		b_last_insert = newB_last_insert;
	}
	public  getB_last_change() {
		return b_last_change;
	}
	public void setB_last_change( newB_last_change) {
		b_last_change = newB_last_change;
	}
	public Object getB_chartab() {
		return b_chartab;
	}
	public void setB_chartab(Object newB_chartab) {
		b_chartab = newB_chartab;
	}
	public Object getB_maphash() {
		return b_maphash;
	}
	public void setB_maphash(Object newB_maphash) {
		b_maphash = newB_maphash;
	}
	public mapblock getB_first_abbr() {
		return b_first_abbr;
	}
	public void setB_first_abbr(mapblock newB_first_abbr) {
		b_first_abbr = newB_first_abbr;
	}
	public growarray getB_ucmds() {
		return b_ucmds;
	}
	public void setB_ucmds(growarray newB_ucmds) {
		b_ucmds = newB_ucmds;
	}
	public  getB_op_start() {
		return b_op_start;
	}
	public void setB_op_start( newB_op_start) {
		b_op_start = newB_op_start;
	}
	public  getB_op_start_orig() {
		return b_op_start_orig;
	}
	public void setB_op_start_orig( newB_op_start_orig) {
		b_op_start_orig = newB_op_start_orig;
	}
	public  getB_op_end() {
		return b_op_end;
	}
	public void setB_op_end( newB_op_end) {
		b_op_end = newB_op_end;
	}
	public u_header getB_u_oldhead() {
		return b_u_oldhead;
	}
	public void setB_u_oldhead(u_header newB_u_oldhead) {
		b_u_oldhead = newB_u_oldhead;
	}
	public u_header getB_u_newhead() {
		return b_u_newhead;
	}
	public void setB_u_newhead(u_header newB_u_newhead) {
		b_u_newhead = newB_u_newhead;
	}
	public u_header getB_u_curhead() {
		return b_u_curhead;
	}
	public void setB_u_curhead(u_header newB_u_curhead) {
		b_u_curhead = newB_u_curhead;
	}
	public int getB_u_numhead() {
		return b_u_numhead;
	}
	public void setB_u_numhead(int newB_u_numhead) {
		b_u_numhead = newB_u_numhead;
	}
	public int getB_u_synced() {
		return b_u_synced;
	}
	public void setB_u_synced(int newB_u_synced) {
		b_u_synced = newB_u_synced;
	}
	public long getB_u_seq_last() {
		return b_u_seq_last;
	}
	public void setB_u_seq_last(long newB_u_seq_last) {
		b_u_seq_last = newB_u_seq_last;
	}
	public long getB_u_save_nr_last() {
		return b_u_save_nr_last;
	}
	public void setB_u_save_nr_last(long newB_u_save_nr_last) {
		b_u_save_nr_last = newB_u_save_nr_last;
	}
	public long getB_u_seq_cur() {
		return b_u_seq_cur;
	}
	public void setB_u_seq_cur(long newB_u_seq_cur) {
		b_u_seq_cur = newB_u_seq_cur;
	}
	public Object getB_u_time_cur() {
		return b_u_time_cur;
	}
	public void setB_u_time_cur(Object newB_u_time_cur) {
		b_u_time_cur = newB_u_time_cur;
	}
	public long getB_u_save_nr_cur() {
		return b_u_save_nr_cur;
	}
	public void setB_u_save_nr_cur(long newB_u_save_nr_cur) {
		b_u_save_nr_cur = newB_u_save_nr_cur;
	}
	public  getB_u_line_ptr() {
		return b_u_line_ptr;
	}
	public void setB_u_line_ptr( newB_u_line_ptr) {
		b_u_line_ptr = newB_u_line_ptr;
	}
	public Object getB_u_line_lnum() {
		return b_u_line_lnum;
	}
	public void setB_u_line_lnum(Object newB_u_line_lnum) {
		b_u_line_lnum = newB_u_line_lnum;
	}
	public Object getB_u_line_colnr() {
		return b_u_line_colnr;
	}
	public void setB_u_line_colnr(Object newB_u_line_colnr) {
		b_u_line_colnr = newB_u_line_colnr;
	}
	public int getB_scanned() {
		return b_scanned;
	}
	public void setB_scanned(int newB_scanned) {
		b_scanned = newB_scanned;
	}
	public long getB_p_iminsert() {
		return b_p_iminsert;
	}
	public void setB_p_iminsert(long newB_p_iminsert) {
		b_p_iminsert = newB_p_iminsert;
	}
	public long getB_p_imsearch() {
		return b_p_imsearch;
	}
	public void setB_p_imsearch(long newB_p_imsearch) {
		b_p_imsearch = newB_p_imsearch;
	}
	public int getB_p_initialized() {
		return b_p_initialized;
	}
	public void setB_p_initialized(int newB_p_initialized) {
		b_p_initialized = newB_p_initialized;
	}
	public int getB_p_ai() {
		return b_p_ai;
	}
	public void setB_p_ai(int newB_p_ai) {
		b_p_ai = newB_p_ai;
	}
	public int getB_p_ai_nopaste() {
		return b_p_ai_nopaste;
	}
	public void setB_p_ai_nopaste(int newB_p_ai_nopaste) {
		b_p_ai_nopaste = newB_p_ai_nopaste;
	}
	public Object getB_p_bkc() {
		return b_p_bkc;
	}
	public void setB_p_bkc(Object newB_p_bkc) {
		b_p_bkc = newB_p_bkc;
	}
	public int getB_bkc_flags() {
		return b_bkc_flags;
	}
	public void setB_bkc_flags(int newB_bkc_flags) {
		b_bkc_flags = newB_bkc_flags;
	}
	public int getB_p_ci() {
		return b_p_ci;
	}
	public void setB_p_ci(int newB_p_ci) {
		b_p_ci = newB_p_ci;
	}
	public int getB_p_bin() {
		return b_p_bin;
	}
	public void setB_p_bin(int newB_p_bin) {
		b_p_bin = newB_p_bin;
	}
	public int getB_p_bomb() {
		return b_p_bomb;
	}
	public void setB_p_bomb(int newB_p_bomb) {
		b_p_bomb = newB_p_bomb;
	}
	public Object getB_p_bh() {
		return b_p_bh;
	}
	public void setB_p_bh(Object newB_p_bh) {
		b_p_bh = newB_p_bh;
	}
	public Object getB_p_bt() {
		return b_p_bt;
	}
	public void setB_p_bt(Object newB_p_bt) {
		b_p_bt = newB_p_bt;
	}
	public int getB_p_bl() {
		return b_p_bl;
	}
	public void setB_p_bl(int newB_p_bl) {
		b_p_bl = newB_p_bl;
	}
	public Object getB_p_com() {
		return b_p_com;
	}
	public void setB_p_com(Object newB_p_com) {
		b_p_com = newB_p_com;
	}
	public Object getB_p_cpt() {
		return b_p_cpt;
	}
	public void setB_p_cpt(Object newB_p_cpt) {
		b_p_cpt = newB_p_cpt;
	}
	public int getB_p_eol() {
		return b_p_eol;
	}
	public void setB_p_eol(int newB_p_eol) {
		b_p_eol = newB_p_eol;
	}
	public int getB_p_fixeol() {
		return b_p_fixeol;
	}
	public void setB_p_fixeol(int newB_p_fixeol) {
		b_p_fixeol = newB_p_fixeol;
	}
	public int getB_p_et() {
		return b_p_et;
	}
	public void setB_p_et(int newB_p_et) {
		b_p_et = newB_p_et;
	}
	public int getB_p_et_nobin() {
		return b_p_et_nobin;
	}
	public void setB_p_et_nobin(int newB_p_et_nobin) {
		b_p_et_nobin = newB_p_et_nobin;
	}
	public int getB_p_et_nopaste() {
		return b_p_et_nopaste;
	}
	public void setB_p_et_nopaste(int newB_p_et_nopaste) {
		b_p_et_nopaste = newB_p_et_nopaste;
	}
	public Object getB_p_fenc() {
		return b_p_fenc;
	}
	public void setB_p_fenc(Object newB_p_fenc) {
		b_p_fenc = newB_p_fenc;
	}
	public Object getB_p_ff() {
		return b_p_ff;
	}
	public void setB_p_ff(Object newB_p_ff) {
		b_p_ff = newB_p_ff;
	}
	public Object getB_p_ft() {
		return b_p_ft;
	}
	public void setB_p_ft(Object newB_p_ft) {
		b_p_ft = newB_p_ft;
	}
	public Object getB_p_fo() {
		return b_p_fo;
	}
	public void setB_p_fo(Object newB_p_fo) {
		b_p_fo = newB_p_fo;
	}
	public Object getB_p_flp() {
		return b_p_flp;
	}
	public void setB_p_flp(Object newB_p_flp) {
		b_p_flp = newB_p_flp;
	}
	public int getB_p_inf() {
		return b_p_inf;
	}
	public void setB_p_inf(int newB_p_inf) {
		b_p_inf = newB_p_inf;
	}
	public Object getB_p_isk() {
		return b_p_isk;
	}
	public void setB_p_isk(Object newB_p_isk) {
		b_p_isk = newB_p_isk;
	}
	public Object getB_p_fp() {
		return b_p_fp;
	}
	public void setB_p_fp(Object newB_p_fp) {
		b_p_fp = newB_p_fp;
	}
	public Object getB_p_kp() {
		return b_p_kp;
	}
	public void setB_p_kp(Object newB_p_kp) {
		b_p_kp = newB_p_kp;
	}
	public Object getB_p_menc() {
		return b_p_menc;
	}
	public void setB_p_menc(Object newB_p_menc) {
		b_p_menc = newB_p_menc;
	}
	public Object getB_p_mps() {
		return b_p_mps;
	}
	public void setB_p_mps(Object newB_p_mps) {
		b_p_mps = newB_p_mps;
	}
	public int getB_p_ml() {
		return b_p_ml;
	}
	public void setB_p_ml(int newB_p_ml) {
		b_p_ml = newB_p_ml;
	}
	public int getB_p_ml_nobin() {
		return b_p_ml_nobin;
	}
	public void setB_p_ml_nobin(int newB_p_ml_nobin) {
		b_p_ml_nobin = newB_p_ml_nobin;
	}
	public int getB_p_ma() {
		return b_p_ma;
	}
	public void setB_p_ma(int newB_p_ma) {
		b_p_ma = newB_p_ma;
	}
	public Object getB_p_nf() {
		return b_p_nf;
	}
	public void setB_p_nf(Object newB_p_nf) {
		b_p_nf = newB_p_nf;
	}
	public int getB_p_pi() {
		return b_p_pi;
	}
	public void setB_p_pi(int newB_p_pi) {
		b_p_pi = newB_p_pi;
	}
	public int getB_p_ro() {
		return b_p_ro;
	}
	public void setB_p_ro(int newB_p_ro) {
		b_p_ro = newB_p_ro;
	}
	public long getB_p_sw() {
		return b_p_sw;
	}
	public void setB_p_sw(long newB_p_sw) {
		b_p_sw = newB_p_sw;
	}
	public int getB_p_sn() {
		return b_p_sn;
	}
	public void setB_p_sn(int newB_p_sn) {
		b_p_sn = newB_p_sn;
	}
	public long getB_p_sts() {
		return b_p_sts;
	}
	public void setB_p_sts(long newB_p_sts) {
		b_p_sts = newB_p_sts;
	}
	public long getB_p_sts_nopaste() {
		return b_p_sts_nopaste;
	}
	public void setB_p_sts_nopaste(long newB_p_sts_nopaste) {
		b_p_sts_nopaste = newB_p_sts_nopaste;
	}
	public int getB_p_swf() {
		return b_p_swf;
	}
	public void setB_p_swf(int newB_p_swf) {
		b_p_swf = newB_p_swf;
	}
	public long getB_p_ts() {
		return b_p_ts;
	}
	public void setB_p_ts(long newB_p_ts) {
		b_p_ts = newB_p_ts;
	}
	public int getB_p_tx() {
		return b_p_tx;
	}
	public void setB_p_tx(int newB_p_tx) {
		b_p_tx = newB_p_tx;
	}
	public long getB_p_tw() {
		return b_p_tw;
	}
	public void setB_p_tw(long newB_p_tw) {
		b_p_tw = newB_p_tw;
	}
	public long getB_p_tw_nobin() {
		return b_p_tw_nobin;
	}
	public void setB_p_tw_nobin(long newB_p_tw_nobin) {
		b_p_tw_nobin = newB_p_tw_nobin;
	}
	public long getB_p_tw_nopaste() {
		return b_p_tw_nopaste;
	}
	public void setB_p_tw_nopaste(long newB_p_tw_nopaste) {
		b_p_tw_nopaste = newB_p_tw_nopaste;
	}
	public long getB_p_wm() {
		return b_p_wm;
	}
	public void setB_p_wm(long newB_p_wm) {
		b_p_wm = newB_p_wm;
	}
	public long getB_p_wm_nobin() {
		return b_p_wm_nobin;
	}
	public void setB_p_wm_nobin(long newB_p_wm_nobin) {
		b_p_wm_nobin = newB_p_wm_nobin;
	}
	public long getB_p_wm_nopaste() {
		return b_p_wm_nopaste;
	}
	public void setB_p_wm_nopaste(long newB_p_wm_nopaste) {
		b_p_wm_nopaste = newB_p_wm_nopaste;
	}
	public Object getB_p_ep() {
		return b_p_ep;
	}
	public void setB_p_ep(Object newB_p_ep) {
		b_p_ep = newB_p_ep;
	}
	public Object getB_p_path() {
		return b_p_path;
	}
	public void setB_p_path(Object newB_p_path) {
		b_p_path = newB_p_path;
	}
	public int getB_p_ar() {
		return b_p_ar;
	}
	public void setB_p_ar(int newB_p_ar) {
		b_p_ar = newB_p_ar;
	}
	public Object getB_p_tags() {
		return b_p_tags;
	}
	public void setB_p_tags(Object newB_p_tags) {
		b_p_tags = newB_p_tags;
	}
	public Object getB_p_tc() {
		return b_p_tc;
	}
	public void setB_p_tc(Object newB_p_tc) {
		b_p_tc = newB_p_tc;
	}
	public int getB_tc_flags() {
		return b_tc_flags;
	}
	public void setB_tc_flags(int newB_tc_flags) {
		b_tc_flags = newB_tc_flags;
	}
	public Object getB_p_dict() {
		return b_p_dict;
	}
	public void setB_p_dict(Object newB_p_dict) {
		b_p_dict = newB_p_dict;
	}
	public Object getB_p_tsr() {
		return b_p_tsr;
	}
	public void setB_p_tsr(Object newB_p_tsr) {
		b_p_tsr = newB_p_tsr;
	}
	public long getB_p_ul() {
		return b_p_ul;
	}
	public void setB_p_ul(long newB_p_ul) {
		b_p_ul = newB_p_ul;
	}
	public Object getB_no_eol_lnum() {
		return b_no_eol_lnum;
	}
	public void setB_no_eol_lnum(Object newB_no_eol_lnum) {
		b_no_eol_lnum = newB_no_eol_lnum;
	}
	public int getB_start_eol() {
		return b_start_eol;
	}
	public void setB_start_eol(int newB_start_eol) {
		b_start_eol = newB_start_eol;
	}
	public int getB_start_ffc() {
		return b_start_ffc;
	}
	public void setB_start_ffc(int newB_start_ffc) {
		b_start_ffc = newB_start_ffc;
	}
	public Object getB_start_fenc() {
		return b_start_fenc;
	}
	public void setB_start_fenc(Object newB_start_fenc) {
		b_start_fenc = newB_start_fenc;
	}
	public int getB_bad_char() {
		return b_bad_char;
	}
	public void setB_bad_char(int newB_bad_char) {
		b_bad_char = newB_bad_char;
	}
	public int getB_start_bomb() {
		return b_start_bomb;
	}
	public void setB_start_bomb(int newB_start_bomb) {
		b_start_bomb = newB_start_bomb;
	}
	public int getB_may_swap() {
		return b_may_swap;
	}
	public void setB_may_swap(int newB_may_swap) {
		b_may_swap = newB_may_swap;
	}
	public int getB_did_warn() {
		return b_did_warn;
	}
	public void setB_did_warn(int newB_did_warn) {
		b_did_warn = newB_did_warn;
	}
	public int getB_help() {
		return b_help;
	}
	public void setB_help(int newB_help) {
		b_help = newB_help;
	}
	public int getB_shortname() {
		return b_shortname;
	}
	public void setB_shortname(int newB_shortname) {
		b_shortname = newB_shortname;
	}
	public int getB_mapped_ctrl_c() {
		return b_mapped_ctrl_c;
	}
	public void setB_mapped_ctrl_c(int newB_mapped_ctrl_c) {
		b_mapped_ctrl_c = newB_mapped_ctrl_c;
	}
}
