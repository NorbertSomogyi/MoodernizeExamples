package application;

public class qf_info_S {
	private int qf_refcount;
	private int qf_listcount;
	private int qf_curlist;
	private Object qf_lists;
	private  qfl_type;
	private int qf_bufnr;
	
	public qf_info_S(int qf_refcount, int qf_listcount, int qf_curlist, Object qf_lists,  qfl_type, int qf_bufnr) {
		setQf_refcount(qf_refcount);
		setQf_listcount(qf_listcount);
		setQf_curlist(qf_curlist);
		setQf_lists(qf_lists);
		setQfl_type(qfl_type);
		setQf_bufnr(qf_bufnr);
	}
	public qf_info_S() {
	}
	
	public int qf_stack_empty() {
		int generatedQf_listcount = this.getQf_listcount();
		return qi == ((Object)0) || generatedQf_listcount <= 0/*
		 * Returns TRUE if the specified quickfix/location list is empty.
		 */;
	}
	// cached across qf_parse_line() calls
	public void qf_new_list(Object qf_title) {
		int i;
		qf_list_T qfl = new qf_list_T();
		// If the current entry is not the last entry, delete entries beyond
		int generatedQf_listcount = this.getQf_listcount();
		int generatedQf_curlist = this.getQf_curlist();
		Object generatedQf_lists = this.getQf_lists();
		// the current entry.  This makes it possible to browse in a tree-like// way with ":grep'.while (generatedQf_listcount > generatedQf_curlist + 1) {
			generatedQf_lists[--generatedQf_listcount].qf_free();
		}
		// Otherwise, add a new entry.if (generatedQf_listcount == 10) {
			generatedQf_lists[0].qf_free();
			for (i = 1; i < 10; ++i) {
				generatedQf_lists[i - 1] = generatedQf_lists[i];
			}
			this.setQf_curlist(10 - 1);
		} else {
				this.setQf_curlist(generatedQf_listcount++);
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((qfl), (false), ((size_t)(/*Error: Unsupported expression*/)));
		qfl.qf_store_title(qf_title);
		 generatedQfl_type = this.getQfl_type();
		qfl.setQfl_type(generatedQfl_type);
		qfl.setQf_id(++ModernizedCProgram.last_qf_id/*
		 * Queue location list stack delete request.
		 */);
	}
	public void locstack_queue_delreq() {
		qf_delq_T q = new qf_delq_T();
		q = (qf_delq_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/);
		if (q != ((Object)0)) {
			q.setQi(qi);
			q.setNext(ModernizedCProgram.qf_delq_head);
			ModernizedCProgram.qf_delq_head = q/*
			 * Return the global quickfix stack window buffer number.
			 */;
		} 
	}
	public void wipe_qf_buffer() {
		buf_T qfbuf = new buf_T();
		int generatedQf_bufnr = this.getQf_bufnr();
		file_buffer file_buffer = new file_buffer();
		int generatedB_nwindows = qfbuf.getB_nwindows();
		if (generatedQf_bufnr != (false)) {
			qfbuf = file_buffer.buflist_findnr(generatedQf_bufnr);
			if (qfbuf != ((Object)0) && generatedB_nwindows == 0) {
				ModernizedCProgram.close_buffer(((Object)0), qfbuf, 4, 0);
				this.setQf_bufnr((false));
			} 
		} 
	}
	/*
	 * Free a location list stack
	 */
	public void ll_free_all() {
		int i;
		qf_info_T qi = new qf_info_T();
		qi = pqi;
		if (qi == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		// Remove reference to this list// Remove reference to this listpqi = ((Object)0)// If the location list is still in use, then queue the delete request;// If the location list is still in use, then queue the delete request
		// to be processed later.if (ModernizedCProgram.quickfix_busy > 0) {
			qi.locstack_queue_delreq();
			return /*Error: Unsupported expression*/;
		} 
		int generatedQf_refcount = qi.getQf_refcount();
		generatedQf_refcount--;
		int generatedQf_listcount = qi.getQf_listcount();
		qf_list_S qf_list_S = new qf_list_S();
		if (generatedQf_refcount < 1) {
			qi.wipe_qf_buffer();
			for (i = 0; i < generatedQf_listcount; ++i) {
				qf_list_S.qf_get_list(qi, i).qf_free();
			}
			ModernizedCProgram.vim_free(qi/*
			 * Free all the quickfix/location lists in the stack.
			 */);
		} 
		// No references to this location list.
	}
	public qf_info_S qf_alloc_stack( qfltype) {
		qf_info_T qi = new qf_info_T();
		qi = (qf_info_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/);
		int generatedQf_refcount = qi.getQf_refcount();
		if (qi != ((Object)0)) {
			generatedQf_refcount++;
			qi.setQfl_type(qfltype);
			qi.setQf_bufnr((false));
		} 
		return qi/*
		 * Return the location list stack for window 'wp'.
		 * If not present, allocate a location list stack
		 */;
	}
	public qf_info_S ll_get_or_alloc_list(window_S wp) {
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedW_llist_ref = wp.getW_llist_ref();
		if ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0))) {
			return generatedW_llist_ref;
		} 
		// For a location list window, use the referenced location list
		// location list.// location list.generatedW_llist_ref.ll_free_all();
		Object generatedW_llist = wp.getW_llist();
		qf_info_S qf_info_S = new qf_info_S();
		if (generatedW_llist == ((Object)0)) {
			wp.setW_llist(qf_info_S.qf_alloc_stack(.QFLT_LOCATION));
		} 
		return generatedW_llist;
	}
	// Quickfix window check helper macro
	// Location list window check helper macro
	// Quickfix and location list stack check helper macros
	// Macro to loop through all the items in a quickfix list
	// Quickfix item index starts from 1, so i below starts at 1
	public qf_info_S qf_cmd_get_stack(exarg eap, int print_emsg) {
		qf_info_T qi = ModernizedCProgram.ql_info;
		CMD_index generatedCmdidx = eap.getCmdidx();
		if (ModernizedCProgram.is_loclist_cmd(generatedCmdidx)) {
			qi = ((ModernizedCProgram.curwin.getW_buffer().bt_quickfix() && ModernizedCProgram.curwin.getW_llist_ref() != ((Object)0)) ? ModernizedCProgram.curwin.getW_llist_ref() : ModernizedCProgram.curwin.getW_llist());
			if (qi == ((Object)0)) {
				if (print_emsg) {
					ModernizedCProgram.emsg(((byte)(e_loclist)));
				} 
				return ((Object)0);
			} 
		} 
		return qi/*
		 * Get the quickfix/location list stack to use for the specified Ex command.
		 * For a location list command, returns the stack for the current window.
		 * If the location list is not present, then allocates a new one.
		 * Returns NULL if the allocation fails.  For a location list command, sets
		 * 'pwinp' to curwin.
		 */;
	}
	public qf_info_S qf_cmd_get_or_alloc_stack(exarg eap, window_S pwinp) {
		qf_info_T qi = ModernizedCProgram.ql_info;
		CMD_index generatedCmdidx = eap.getCmdidx();
		qf_info_S qf_info_S = new qf_info_S();
		if (ModernizedCProgram.is_loclist_cmd(generatedCmdidx)) {
			qi = qf_info_S.ll_get_or_alloc_list(ModernizedCProgram.curwin);
			if (qi == ((Object)0)) {
				return ((Object)0);
			} 
			pwinp = ModernizedCProgram.curwin;
		} 
		return qi/*
		 * Copy location list entries from 'from_qfl' to 'to_qfl'.
		 */;
	}
	public int jump_to_help_window(int newwin, Integer opened_window) {
		win_T wp = new win_T();
		int flags;
		window_S window_S = new window_S();
		if (ModernizedCProgram.cmdmod.getTab() != 0 || newwin) {
			wp = ((Object)0);
		} else {
				wp = window_S.qf_find_help_win();
		} 
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		 generatedQfl_type = this.getQfl_type();
		if (wp != ((Object)0) && generatedB_nwindows > 0) {
			wp.win_enter(1);
		} else {
				flags = 16;
				if (ModernizedCProgram.cmdmod.getSplit() == 0 && ModernizedCProgram.curwin.getW_width() != Columns && ModernizedCProgram.curwin.getW_width() < 80) {
					flags |=  4;
				} 
				if ((generatedQfl_type == .QFLT_LOCATION) && !newwin) {
					flags |=  128;
				} 
				if (ModernizedCProgram.win_split(0, flags) == 0) {
					return 0;
				} 
				opened_window = 1;
				if (ModernizedCProgram.curwin.getW_height() < ModernizedCProgram.p_hh) {
					ModernizedCProgram.win_setheight((int)ModernizedCProgram.p_hh);
				} 
				if ((generatedQfl_type == .QFLT_LOCATION) && !newwin) {
					ModernizedCProgram.win_set_loclist(ModernizedCProgram.curwin, qi);
				} 
		} 
		if (!ModernizedCProgram.p_im) {
			restart_edit = 0;
		} 
		return 1/*
		 * Find a non-quickfix window in the current tabpage using the given location
		 * list stack.
		 * Returns NULL if a matching window is not found.
		 */;
	}
	public int qf_open_new_file_win() {
		int flags;
		flags = 64;
		if (ll_ref != ((Object)0)) {
			flags |=  128;
		} 
		if (ModernizedCProgram.win_split(0, flags) == 0) {
			return 0;
		} 
		// don't split again// don't split againModernizedCProgram.p_swb = empty_option;
		ModernizedCProgram.swb_flags = 0;
		do {
			(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_scb(0);
			(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_crb(0);
		} while (0);
		if (ll_ref != ((Object)0)) {
			ModernizedCProgram.win_set_loclist(ModernizedCProgram.curwin, ll_ref);
		} 
		// The new window should use the location list from the
		return 1/*
		 * Go to a window that shows the right buffer. If the window is not found, go
		 * to the window just above the location list window. This is used for opening
		 * a file from a location window and not from a quickfix window. If some usable
		 * window is previously found, then it is supplied in 'use_win'.
		 */;
	}
	public void qf_jump(int dir, int errornr, int forceit) {
		qi.qf_jump_newwin(dir, errornr, forceit, 0/*
		 * Jump to a quickfix line.
		 * If dir == 0 go to entry "errornr".
		 * If dir == FORWARD go "errornr" valid entries forward.
		 * If dir == BACKWARD go "errornr" valid entries backward.
		 * If dir == FORWARD_FILE go "errornr" valid entries files backward.
		 * If dir == BACKWARD_FILE go "errornr" valid entries files backward
		 * else if "errornr" is zero, redisplay the same line
		 * If 'forceit' is TRUE, then can discard changes to the current buffer.
		 * If 'newwin' is TRUE, then open the file in a new window.
		 */);
	}
	public void qf_jump_newwin(int dir, int errornr, int forceit, int newwin) {
		qf_list_T qfl = new qf_list_T();
		qfline_T qf_ptr = new qfline_T();
		qfline_T old_qf_ptr = new qfline_T();
		int qf_index;
		int old_qf_index;
		char_u old_swb = ModernizedCProgram.p_swb;
		int old_swb_flags = ModernizedCProgram.swb_flags;
		int prev_winid;
		int opened_window = 0;
		int print_message = 1;
		// getting file may reset itint old_KeyTyped = ModernizedCProgram.KeyTyped;
		int retval = 1;
		if (qi == ((Object)0)) {
			qi = ModernizedCProgram.ql_info;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		if (qi.qf_stack_empty() || qf_list_S.qf_get_curlist(qi).qf_list_empty()) {
			ModernizedCProgram.emsg(((byte)(e_quickfix)));
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.incr_quickfix_busy();
		qfl = qf_list_S.qf_get_curlist(qi);
		qfline_S generatedQf_ptr = qfl.getQf_ptr();
		qf_ptr = generatedQf_ptr;
		old_qf_ptr = qf_ptr;
		int generatedQf_index = qfl.getQf_index();
		qf_index = generatedQf_index;
		old_qf_index = qf_index;
		qfline_S qfline_S = new qfline_S();
		qf_ptr = qfline_S.qf_get_entry(qfl, errornr, dir, qf_index);
		if (qf_ptr == ((Object)0)) {
			qf_ptr = old_qf_ptr;
			qf_index = old_qf_index;
			;
		} 
		qfl.setQf_index(qf_index);
		if (qi.qf_win_pos_update(old_qf_index)) {
			print_message = 0;
		} 
		// No need to print the error message if it's visible in the error
		prev_winid = ModernizedCProgram.curwin.getW_id();
		retval = ModernizedCProgram.qf_jump_open_window(qi, qf_ptr, newwin, opened_window);
		if (retval == 0) {
			;
		} 
		if (retval == 2) {
			;
		} 
		retval = ModernizedCProgram.qf_jump_to_buffer(qi, qf_index, qf_ptr, forceit, prev_winid, opened_window, old_KeyTyped, print_message);
		if (retval == 2) {
			qi = ((Object)0);
			qf_ptr = ((Object)0);
		} 
		int generatedQf_fnum = qf_ptr.getQf_fnum();
		if (ModernizedCProgram.p_swb != old_swb) {
			if (ModernizedCProgram.p_swb == empty_option) {
				ModernizedCProgram.p_swb = old_swb;
				ModernizedCProgram.swb_flags = old_swb_flags;
			} else {
					ModernizedCProgram.free_string_option(old_swb);
			} 
		} 
		// Restore old 'switchbuf' value, but not when an autocommand or
		ModernizedCProgram.decr_quickfix_busy()// Highlight attributes used for displaying entries from the quickfix list.;// Highlight attributes used for displaying entries from the quickfix list.
	}
	public void qf_msg(int which, Byte lead) {
		Object generatedQf_lists = this.getQf_lists();
		byte title = (byte)generatedQf_lists[which].getQf_title();
		int count = generatedQf_lists[which].getQf_count();
		char_u[] buf = new char_u();
		int generatedQf_listcount = this.getQf_listcount();
		ModernizedCProgram.vim_snprintf((byte)buf, (1024 + 1), ((byte)("%serror list %d of %d; %d errors ")), lead, which + 1, generatedQf_listcount, count);
		if (title != ((Object)0)) {
			size_t len = /*Error: Function owner not recognized*/strlen((byte)(buf));
			if (len < 34) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((buf + len), ((byte)' '), (34 - len));
				buf[34] = (byte)'\000';
			} 
			ModernizedCProgram.vim_strcat(buf, (char_u)title, (1024 + 1));
		} 
		ModernizedCProgram.trunc_string(buf, buf, Columns - 1, (1024 + 1));
		ModernizedCProgram.msg((byte)buf/*
		 * ":colder [count]": Up in the quickfix stack.
		 * ":cnewer [count]": Down in the quickfix stack.
		 * ":lolder [count]": Up in the location list stack.
		 * ":lnewer [count]": Down in the location list stack.
		 */);
	}
	public int qf_goto_cwindow(int resize, int sz, int vertsplit) {
		win_T win = new win_T();
		window_S window_S = new window_S();
		win = window_S.qf_find_win(qi);
		if (win == ((Object)0)) {
			return 0;
		} 
		win.win_goto();
		int generatedW_width = win.getW_width();
		int generatedW_height = win.getW_height();
		int generatedW_status_height = win.getW_status_height();
		if (resize) {
			if (vertsplit) {
				if (sz != generatedW_width) {
					ModernizedCProgram.win_setwidth(sz);
				} 
			}  else if (sz != generatedW_height && generatedW_height + generatedW_status_height + ModernizedCProgram.tabline_height() < ModernizedCProgram.cmdline_row) {
				ModernizedCProgram.win_setheight(sz);
			} 
		} 
		return 1/*
		 * Set options for the buffer in the quickfix or location list window.
		 */;
	}
	public int qf_open_new_cwindow(int height) {
		buf_T qf_buf = new buf_T();
		win_T oldwin = ModernizedCProgram.curwin;
		tabpage_T prevtab = ModernizedCProgram.curtab;
		int flags = 0;
		win_T win = new win_T();
		file_buffer file_buffer = new file_buffer();
		qf_buf = file_buffer.qf_find_buf(qi);
		// The current window becomes the previous window afterwards.// The current window becomes the previous window afterwards.win = ModernizedCProgram.curwin;
		 generatedQfl_type = this.getQfl_type();
		if ((generatedQfl_type == .QFLT_QUICKFIX) && ModernizedCProgram.cmdmod.getSplit() == 0) {
			ModernizedCProgram.lastwin.win_goto();
		} 
		// Create the new quickfix window at the very bottom, except when
		if (ModernizedCProgram.cmdmod.getSplit() == 0) {
			flags = 32;
		} 
		flags |=  128;
		if (ModernizedCProgram.win_split(height, flags) == 0) {
			return 0;
		} 
		do {
			(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_scb(0);
			(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_crb(0);
		} while (0);
		int generatedQf_refcount = this.getQf_refcount();
		if ((generatedQfl_type == .QFLT_LOCATION)) {
			ModernizedCProgram.curwin.setW_llist_ref(qi);
			generatedQf_refcount++;
		} 
		// For the location list window, create a reference to the
		if (oldwin != ModernizedCProgram.curwin) {
			oldwin = ((Object)0);
		} 
		int generatedB_fnum = qf_buf.getB_fnum();
		if (qf_buf != ((Object)0)) {
			(Object)ModernizedCProgram.do_ecmd(generatedB_fnum, ((Object)0), ((Object)0), ((Object)0), (linenr_T)1, -1024 + -1024, oldwin);
		} else {
				(Object)ModernizedCProgram.do_ecmd(0, ((Object)0), ((Object)0), ((Object)0), (linenr_T)1, -1024, oldwin);
				this.setQf_bufnr(generatedB_fnum);
		} 
		// Do this even if the quickfix buffer was already present, as an autocmd// might have previously deleted (:bdelete) the quickfix buffer.if (!curbuf.bt_quickfix()) {
			ModernizedCProgram.qf_set_cwindow_options();
		} 
		// window to the side.if (ModernizedCProgram.curtab == prevtab && ModernizedCProgram.curwin.getW_width() == Columns) {
			ModernizedCProgram.win_setheight(height);
		} 
		// set 'winfixheight'// set 'winfixheight'ModernizedCProgram.curwin.getW_onebuf_opt().setWo_wfh(1);
		if (win.win_valid()) {
			prevwin = win;
		} 
		return 1/*
		 * ":copen": open a window that shows the list of errors.
		 * ":lopen": open a window that shows the location list.
		 */;
	}
	public int qf_win_pos_update(int old_qf_index) {
		// previous qf_index or zerowin_T win = new win_T();
		qf_list_S qf_list_S = new qf_list_S();
		int qf_index = qf_list_S.qf_get_curlist(qi).getQf_index();
		// Put the cursor on the current error in the quickfix window, so that
		window_S window_S = new window_S();
		// it's viewable.// it's viewable.win = window_S.qf_find_win(qi);
		file_buffer generatedW_buffer = win.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (win != ((Object)0) && qf_index <= generatedMl_line_count && old_qf_index != qf_index) {
			if (qf_index > old_qf_index) {
				win.setW_redraw_top(old_qf_index);
				win.setW_redraw_bot(qf_index);
			} else {
					win.setW_redraw_top(qf_index);
					win.setW_redraw_bot(old_qf_index);
			} 
			win.qf_win_goto(qf_index);
		} 
		return win != ((Object)0/*
		 * Check whether the given window is displaying the specified quickfix/location
		 * stack.
		 */);
	}
	public void qf_update_win_titlevar() {
		win_T win = new win_T();
		win_T curwin_save = new win_T();
		window_S window_S = new window_S();
		qf_list_S qf_list_S = new qf_list_S();
		if ((win = window_S.qf_find_win(qi)) != ((Object)0)) {
			curwin_save = ModernizedCProgram.curwin;
			ModernizedCProgram.curwin = win;
			qf_list_S.qf_get_curlist(qi).qf_set_title_var();
			ModernizedCProgram.curwin = curwin_save/*
			 * Find the quickfix buffer.  If it exists, update the contents.
			 */;
		} 
	}
	public int qf_id2nr(Object qfid) {
		int qf_idx;
		int generatedQf_listcount = this.getQf_listcount();
		Object generatedQf_lists = this.getQf_lists();
		for (qf_idx = 0; qf_idx < generatedQf_listcount; qf_idx++) {
			if (generatedQf_lists[qf_idx].getQf_id() == qfid) {
				return qf_idx;
			} 
		}
		return (true/*
		 * If the current list is not "save_qfid" and we can find the list with that ID
		 * then make it the current list.
		 * This is used when autocommands may have changed the current list.
		 * Returns OK if successfully restored the list. Returns FAIL if the list with
		 * the specified identifier (save_qfid) is not found in the stack.
		 */);
	}
	public int qf_restore_list(Object save_qfid) {
		int curlist;
		qf_list_S qf_list_S = new qf_list_S();
		if (qf_list_S.qf_get_curlist(qi).getQf_id() != save_qfid) {
			curlist = qi.qf_id2nr(save_qfid);
			if (curlist < 0) {
				return 0;
			} 
			this.setQf_curlist(curlist);
		} 
		return 1/*
		 * Jump to the first entry if there is one.
		 */;
	}
	public void qf_jump_first(Object save_qfid, int forceit) {
		if (qi.qf_restore_list(save_qfid) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		// Autocommands might have cleared the list, check for that.if (!qf_list_S.qf_get_curlist(qi).qf_list_empty()) {
			qi.qf_jump(0, 0, forceit/*
			 * Return TRUE when using ":vimgrep" for ":grep".
			 */);
		} 
	}
	public int qf_winid() {
		win_T win = new win_T();
		// The quickfix window can be opened even if the quickfix list is not set
		// using ":copen". This is not true for location lists.if (qi == ((Object)0)) {
			return 0;
		} 
		window_S window_S = new window_S();
		win = window_S.qf_find_win(qi);
		int generatedW_id = win.getW_id();
		if (win != ((Object)0)) {
			return generatedW_id;
		} 
		return 0/*
		 * Returns the number of the buffer displayed in the quickfix/location list
		 * window. If there is no buffer associated with the list, then returns 0.
		 */;
	}
	public int mark_quickfix_ctx(int copyID) {
		int i;
		int abort = 0;
		typval_T ctx = new typval_T();
		Object generatedQf_lists = this.getQf_lists();
		Object generatedV_type = ctx.getV_type();
		for (i = 0; i < 10 && !abort; ++i) {
			ctx = generatedQf_lists[i].getQf_ctx();
			if (ctx != ((Object)0) && generatedV_type != .VAR_NUMBER && generatedV_type != .VAR_STRING && generatedV_type != .VAR_FLOAT) {
				abort = ModernizedCProgram.set_ref_in_item(ctx, copyID, ((Object)0), ((Object)0));
			} 
		}
		return abort/*
		 * Mark the context of the quickfix list and the location lists (if present) as
		 * "in use". So that garbage collection doesn't free the context.
		 */;
	}
	/*
	 * Get the location list for ":lhelpgrep"
	 */
	public qf_info_S hgr_get_ll(Integer new_ll) {
		win_T wp = new win_T();
		qf_info_T qi = new qf_info_T();
		window_S window_S = new window_S();
		// If the current window is a help window, then use itif (ModernizedCProgram.curwin.getW_buffer().bt_help()) {
			wp = ModernizedCProgram.curwin;
		} else {
				wp = window_S.qf_find_help_win();
		} 
		Object generatedW_llist = wp.getW_llist();
		// Help window not foundif (wp == ((Object)0)) {
			qi = ((Object)0);
		} else {
				qi = generatedW_llist;
		} 
		qf_info_S qf_info_S = new qf_info_S();
		if (qi == ((Object)0)) {
			if ((qi = qf_info_S.qf_alloc_stack(.QFLT_LOCATION)) == ((Object)0)) {
				return ((Object)0);
			} 
			new_ll = 1;
		} 
		return qi/*
		 * Search for a pattern in a help file.
		 */;
	}
	public int getQf_refcount() {
		return qf_refcount;
	}
	public void setQf_refcount(int newQf_refcount) {
		qf_refcount = newQf_refcount;
	}
	public int getQf_listcount() {
		return qf_listcount;
	}
	public void setQf_listcount(int newQf_listcount) {
		qf_listcount = newQf_listcount;
	}
	public int getQf_curlist() {
		return qf_curlist;
	}
	public void setQf_curlist(int newQf_curlist) {
		qf_curlist = newQf_curlist;
	}
	public Object getQf_lists() {
		return qf_lists;
	}
	public void setQf_lists(Object newQf_lists) {
		qf_lists = newQf_lists;
	}
	public  getQfl_type() {
		return qfl_type;
	}
	public void setQfl_type( newQfl_type) {
		qfl_type = newQfl_type;
	}
	public int getQf_bufnr() {
		return qf_bufnr;
	}
	public void setQf_bufnr(int newQf_bufnr) {
		qf_bufnr = newQf_bufnr;
	}
}
// Count of references to this list. Used only for location lists.
// When a location list window reference this list, qf_refcount
