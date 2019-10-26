package application;

public class qfline_S {
	private qfline_S qf_next;
	private qfline_S qf_prev;
	private Object qf_lnum;
	private int qf_fnum;
	private int qf_col;
	private int qf_nr;
	private Object qf_module;
	private Object qf_pattern;
	private Object qf_text;
	private Object qf_viscol;
	private Object qf_cleared;
	private Object qf_type;
	private Object qf_valid;
	
	public qfline_S(qfline_S qf_next, qfline_S qf_prev, Object qf_lnum, int qf_fnum, int qf_col, int qf_nr, Object qf_module, Object qf_pattern, Object qf_text, Object qf_viscol, Object qf_cleared, Object qf_type, Object qf_valid) {
		setQf_next(qf_next);
		setQf_prev(qf_prev);
		setQf_lnum(qf_lnum);
		setQf_fnum(qf_fnum);
		setQf_col(qf_col);
		setQf_nr(qf_nr);
		setQf_module(qf_module);
		setQf_pattern(qf_pattern);
		setQf_text(qf_text);
		setQf_viscol(qf_viscol);
		setQf_cleared(qf_cleared);
		setQf_type(qf_type);
		setQf_valid(qf_valid);
	}
	public qfline_S() {
	}
	
	public qfline_S get_next_valid_entry(qf_list_S qfl, int qf_index, int dir) {
		int idx;
		int old_qf_fnum;
		idx = qf_index;
		int generatedQf_fnum = this.getQf_fnum();
		old_qf_fnum = generatedQf_fnum;
		int generatedQf_nonevalid = qfl.getQf_nonevalid();
		Object generatedQf_valid = this.getQf_valid();
		int generatedQf_count = qfl.getQf_count();
		qfline_S generatedQf_next = this.getQf_next();
		do {
			if (idx == generatedQf_count || generatedQf_next == ((Object)0)) {
				return ((Object)0);
			} 
			++idx;
			qf_ptr = generatedQf_next;
		} while ((!generatedQf_nonevalid && !generatedQf_valid) || (dir == 3 && generatedQf_fnum == old_qf_fnum));
		qf_index = idx;
		return qf_ptr/*
		 * Get the previous valid entry in the current quickfix/location list. The
		 * search starts from the current entry.  Returns NULL on failure.
		 */;
	}
	public qfline_S get_prev_valid_entry(qf_list_S qfl, int qf_index, int dir) {
		int idx;
		int old_qf_fnum;
		idx = qf_index;
		int generatedQf_fnum = this.getQf_fnum();
		old_qf_fnum = generatedQf_fnum;
		int generatedQf_nonevalid = qfl.getQf_nonevalid();
		Object generatedQf_valid = this.getQf_valid();
		qfline_S generatedQf_prev = this.getQf_prev();
		do {
			if (idx == 1 || generatedQf_prev == ((Object)0)) {
				return ((Object)0);
			} 
			--idx;
			qf_ptr = generatedQf_prev;
		} while ((!generatedQf_nonevalid && !generatedQf_valid) || (dir == (true) && generatedQf_fnum == old_qf_fnum));
		qf_index = idx;
		return qf_ptr/*
		 * Get the n'th (errornr) previous/next valid entry from the current entry in
		 * the quickfix list.
		 *   dir == FORWARD or FORWARD_FILE: next valid entry
		 *   dir == BACKWARD or BACKWARD_FILE: previous valid entry
		 */;
	}
	public qfline_S get_nth_valid_entry(qf_list_S qfl, int errornr, int dir, int new_qfidx) {
		qfline_S generatedQf_ptr = qfl.getQf_ptr();
		qfline_T qf_ptr = generatedQf_ptr;
		int generatedQf_index = qfl.getQf_index();
		int qf_idx = generatedQf_index;
		qfline_T prev_qf_ptr = new qfline_T();
		int prev_index;
		char_u err = ModernizedCProgram.e_no_more_items;
		while (errornr--) {
			prev_qf_ptr = qf_ptr;
			prev_index = qf_idx;
			if (dir == 1 || dir == 3) {
				qf_ptr = qf_ptr.get_next_valid_entry(qfl, qf_idx, dir);
			} else {
					qf_ptr = qf_ptr.get_prev_valid_entry(qfl, qf_idx, dir);
			} 
			if (qf_ptr == ((Object)0)) {
				qf_ptr = prev_qf_ptr;
				qf_idx = prev_index;
				if (err != ((Object)0)) {
					ModernizedCProgram.emsg(((byte)(err)));
					return ((Object)0);
				} 
				break;
			} 
			err = ((Object)0);
		}
		new_qfidx = qf_idx;
		return qf_ptr/*
		 * Get n'th (errornr) quickfix entry from the current entry in the quickfix
		 * list 'qfl'. Returns a pointer to the new entry and the index in 'new_qfidx'
		 */;
	}
	public qfline_S get_nth_entry(qf_list_S qfl, int errornr, int new_qfidx) {
		qfline_S generatedQf_ptr = qfl.getQf_ptr();
		qfline_T qf_ptr = generatedQf_ptr;
		int generatedQf_index = qfl.getQf_index();
		int qf_idx = generatedQf_index;
		qfline_S generatedQf_prev = qf_ptr.getQf_prev();
		// New error number is less than the current error numberwhile (errornr < qf_idx && qf_idx > 1 && generatedQf_prev != ((Object)0)) {
			--qf_idx;
			qf_ptr = generatedQf_prev;
		}
		int generatedQf_count = qfl.getQf_count();
		qfline_S generatedQf_next = qf_ptr.getQf_next();
		// New error number is greater than the current error numberwhile (errornr > qf_idx && qf_idx < generatedQf_count && generatedQf_next != ((Object)0)) {
			++qf_idx;
			qf_ptr = generatedQf_next;
		}
		new_qfidx = qf_idx;
		return qf_ptr/*
		 * Get a entry specied by 'errornr' and 'dir' from the current
		 * quickfix/location list. 'errornr' specifies the index of the entry and 'dir'
		 * specifies the direction (FORWARD/BACKWARD/FORWARD_FILE/BACKWARD_FILE).
		 * Returns a pointer to the entry and the index of the new entry is stored in
		 * 'new_qfidx'.
		 */;
	}
	public qfline_S qf_get_entry(qf_list_S qfl, int errornr, int dir, int new_qfidx) {
		qfline_S generatedQf_ptr = qfl.getQf_ptr();
		qfline_T qf_ptr = generatedQf_ptr;
		int generatedQf_index = qfl.getQf_index();
		int qfidx = generatedQf_index;
		qfline_S qfline_S = new qfline_S();
		qfline_S qfline_S = new qfline_S();
		// next/prev valid entryif (dir != 0) {
			qf_ptr = qfline_S.get_nth_valid_entry(qfl, errornr, dir, qfidx);
		}  else if (errornr != 0) {
			qf_ptr = qfline_S.get_nth_entry(qfl, errornr, qfidx);
		} 
		new_qfidx = qfidx;
		return qf_ptr/*
		 * Find a window displaying a Vim help file.
		 */;
	}
	/*
	 * Display information about a single entry from the quickfix/location list.
	 * Used by ":clist/:llist" commands.
	 * 'cursel' will be set to TRUE for the currently selected entry in the
	 * quickfix list.
	 */
	public void qf_list_entry(int qf_idx, int cursel) {
		char_u fname = new char_u();
		buf_T buf = new buf_T();
		int filter_entry;
		fname = ((Object)0);
		Object generatedQf_module = this.getQf_module();
		int generatedQf_fnum = this.getQf_fnum();
		file_buffer file_buffer = new file_buffer();
		Object generatedB_fname = buf.getB_fname();
		Object generatedQf_type = this.getQf_type();
		if (generatedQf_module != ((Object)0) && generatedQf_module != (byte)'\000') {
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%2d %s", qf_idx, (byte)generatedQf_module);
		} else {
				if (generatedQf_fnum != 0 && (buf = file_buffer.buflist_findnr(generatedQf_fnum)) != ((Object)0)) {
					fname = generatedB_fname;
					if (generatedQf_type == 1) {
						fname = ModernizedCProgram.gettail(fname);
					} 
				} 
				if (fname == ((Object)0)) {
					.sprintf((byte)ModernizedCProgram.IObuff, "%2d", qf_idx);
				} else {
						ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%2d %s", qf_idx, (byte)fname);
				} 
		} 
		// Support for filtering entries using :filter /pat/ clist// Match against the module name, file name, search pattern and// text of the entry.// Support for filtering entries using :filter /pat/ clist// Match against the module name, file name, search pattern and// text of the entry.filter_entry = 1;
		if (generatedQf_module != ((Object)0) && generatedQf_module != (byte)'\000') {
			filter_entry &=  ModernizedCProgram.message_filtered(generatedQf_module);
		} 
		if (filter_entry && fname != ((Object)0)) {
			filter_entry &=  ModernizedCProgram.message_filtered(fname);
		} 
		Object generatedQf_pattern = this.getQf_pattern();
		if (filter_entry && generatedQf_pattern != ((Object)0)) {
			filter_entry &=  ModernizedCProgram.message_filtered(generatedQf_pattern);
		} 
		Object generatedQf_text = this.getQf_text();
		if (filter_entry) {
			filter_entry &=  ModernizedCProgram.message_filtered(generatedQf_text);
		} 
		if (filter_entry) {
			return ;
		} 
		ModernizedCProgram.msg_putchar((byte)'\n');
		ModernizedCProgram.msg_outtrans_attr(ModernizedCProgram.IObuff, cursel ? ModernizedCProgram.highlight_attr[(int)(.HLF_QFL)] : ModernizedCProgram.qfFileAttr);
		Object generatedQf_lnum = this.getQf_lnum();
		if (generatedQf_lnum != 0) {
			ModernizedCProgram.msg_puts_attr(":", ModernizedCProgram.qfSepAttr);
		} 
		int generatedQf_col = this.getQf_col();
		if (generatedQf_lnum == 0) {
			ModernizedCProgram.IObuff[0] = (byte)'\000';
		}  else if (generatedQf_col == 0) {
			.sprintf((byte)ModernizedCProgram.IObuff, "%ld", generatedQf_lnum);
		} else {
				.sprintf((byte)ModernizedCProgram.IObuff, "%ld col %d", generatedQf_lnum, generatedQf_col);
		} 
		int generatedQf_nr = this.getQf_nr();
		.sprintf((byte)ModernizedCProgram.IObuff + .strlen((byte)(ModernizedCProgram.IObuff)), "%s", (byte)ModernizedCProgram.qf_types(generatedQf_type, generatedQf_nr));
		ModernizedCProgram.msg_puts_attr((byte)ModernizedCProgram.IObuff, ModernizedCProgram.qfLineAttr);
		ModernizedCProgram.msg_puts_attr(":", ModernizedCProgram.qfSepAttr);
		if (generatedQf_pattern != ((Object)0)) {
			ModernizedCProgram.qf_fmt_text(generatedQf_pattern, ModernizedCProgram.IObuff, (1024 + 1));
			ModernizedCProgram.msg_puts((byte)ModernizedCProgram.IObuff);
			ModernizedCProgram.msg_puts_attr(":", ModernizedCProgram.qfSepAttr);
		} 
		ModernizedCProgram.msg_puts(" ")// Remove newlines and leading whitespace from the text.  For an;// Remove newlines and leading whitespace from the text.  For an
		// unrecognized line keep the indent, the compiler may mark a word// with ^^^^.// unrecognized line keep the indent, the compiler may mark a word// with ^^^^.ModernizedCProgram.qf_fmt_text((fname != ((Object)0) || generatedQf_lnum != 0) ? ModernizedCProgram.skipwhite(generatedQf_text) : generatedQf_text, ModernizedCProgram.IObuff, (1024 + 1));
		ModernizedCProgram.msg_prt_line(ModernizedCProgram.IObuff, 0);
		// show one line at a time// show one line at a timeModernizedCProgram.out_flush();
	}
	public qfline_S qf_find_first_entry_in_buf(qf_list_S qfl, int bnr, int errornr) {
		qfline_T qfp = ((Object)0);
		int idx = 0;
		int generatedQf_count = qfl.getQf_count();
		int generatedQf_fnum = qfp.getQf_fnum();
		// Find the first entry in this filefor (; !got_int && idx <= generatedQf_count && qfp != ((Object)0); ) {
			if (generatedQf_fnum == bnr) {
				break;
			} 
		}
		errornr = idx;
		return qfp/*
		 * Find the first quickfix entry on the same line as 'entry'. Updates 'errornr'
		 * with the error number for the first entry. Assumes the entries are sorted in
		 * the quickfix list by line number.
		 */;
	}
	public qfline_S qf_find_first_entry_on_line(int errornr) {
		qfline_S generatedQf_prev = this.getQf_prev();
		int generatedQf_fnum = this.getQf_fnum();
		Object generatedQf_lnum = this.getQf_lnum();
		while (!got_int && generatedQf_prev != ((Object)0) && generatedQf_fnum == generatedQf_fnum && generatedQf_lnum == generatedQf_lnum) {
			entry = generatedQf_prev;
			--errornr;
		}
		return entry/*
		 * Find the last quickfix entry on the same line as 'entry'. Updates 'errornr'
		 * with the error number for the last entry. Assumes the entries are sorted in
		 * the quickfix list by line number.
		 */;
	}
	public qfline_S qf_find_last_entry_on_line(int errornr) {
		qfline_S generatedQf_next = this.getQf_next();
		int generatedQf_fnum = this.getQf_fnum();
		Object generatedQf_lnum = this.getQf_lnum();
		while (!got_int && generatedQf_next != ((Object)0) && generatedQf_fnum == generatedQf_fnum && generatedQf_lnum == generatedQf_lnum) {
			entry = generatedQf_next;
			++errornr;
		}
		return entry/*
		 * Returns TRUE if the specified quickfix entry is
		 *   after the given line (linewise is TRUE)
		 *   or after the line and column.
		 */;
	}
	public qfline_S qf_find_entry_after_pos(int bnr,  pos, int linewise, int errornr) {
		if (ModernizedCProgram.qf_entry_after_pos(qfp, pos, linewise)) {
			return qfp;
		} 
		// First entry is after postion 'pos'
		qfline_S generatedQf_next = this.getQf_next();
		int generatedQf_fnum = generatedQf_next.getQf_fnum();
		// Find the entry just before or at the position 'pos'while (generatedQf_next != ((Object)0) && generatedQf_fnum == bnr && ModernizedCProgram.qf_entry_on_or_before_pos(generatedQf_next, pos, linewise)) {
			qfp = generatedQf_next;
			++errornr;
		}
		if (generatedQf_next == ((Object)0) || generatedQf_fnum != bnr) {
			return ((Object)0);
		} 
		// No entries found after position 'pos'
		// Use the entry just after position 'pos'// Use the entry just after position 'pos'qfp = generatedQf_next;
		++errornr;
		return qfp/*
		 * Find the first quickfix entry before position 'pos' in buffer 'bnr'.
		 * If 'linewise' is TRUE, returns the entry before the specified line and
		 * treats multiple entries on a single line as one. Otherwise returns the entry
		 * before the specified line and column.
		 * 'qfp' points to the very first entry in the buffer and 'errornr' is the
		 * index of the very first entry in the quickfix list.
		 * Returns NULL if an entry is not found before 'pos'.
		 */;
	}
	public qfline_S qf_find_entry_before_pos(int bnr,  pos, int linewise, int errornr) {
		qfline_S generatedQf_next = this.getQf_next();
		int generatedQf_fnum = generatedQf_next.getQf_fnum();
		// Find the entry just before the position 'pos'while (generatedQf_next != ((Object)0) && generatedQf_fnum == bnr && ModernizedCProgram.qf_entry_before_pos(generatedQf_next, pos, linewise)) {
			qfp = generatedQf_next;
			++errornr;
		}
		if (ModernizedCProgram.qf_entry_on_or_after_pos(qfp, pos, linewise)) {
			return ((Object)0);
		} 
		if (linewise) {
			qfp = qfp.qf_find_first_entry_on_line(errornr);
		} 
		// If multiple entries are on the same line, then use the first entry
		return qfp/*
		 * Find a quickfix entry in 'qfl' closest to position 'pos' in buffer 'bnr' in
		 * the direction 'dir'.
		 */;
	}
	public qfline_S qf_find_closest_entry(qf_list_S qfl, int bnr,  pos, int dir, int linewise, int errornr) {
		qfline_T qfp = new qfline_T();
		errornr = 0;
		qfline_S qfline_S = new qfline_S();
		// Find the first entry in this file// Find the first entry in this fileqfp = qfline_S.qf_find_first_entry_in_buf(qfl, bnr, errornr);
		if (qfp == ((Object)0)) {
			return ((Object)0);
		} 
		if (dir == 1) {
			qfp = qfp.qf_find_entry_after_pos(bnr, pos, linewise, errornr);
		} else {
				qfp = qfp.qf_find_entry_before_pos(bnr, pos, linewise, errornr);
		} 
		return qfp/*
		 * Get the nth quickfix entry below the specified entry.  Searches forward in
		 * the list. If linewise is TRUE, then treat multiple entries on a single line
		 * as one.
		 */;
	}
	public void qf_get_nth_below_entry(int n, int linewise, int errornr) {
		qfline_S generatedQf_next = this.getQf_next();
		int generatedQf_fnum = generatedQf_next.getQf_fnum();
		while (n-- > 0 && !got_int) {
			qfline_T first_entry = entry;
			int first_errornr = errornr;
			if (linewise) {
				entry = entry.qf_find_last_entry_on_line(errornr);
			} 
			if (generatedQf_next == ((Object)0) || generatedQf_fnum != generatedQf_fnum) {
				if (linewise) {
					entry = first_entry;
					errornr = first_errornr;
				} 
				break;
			} 
			entry = generatedQf_next;
			++errornr/*
			 * Get the nth quickfix entry above the specified entry.  Searches backwards in
			 * the list. If linewise is TRUE, then treat multiple entries on a single line
			 * as one.
			 */;
		}
	}
	public void qf_get_nth_above_entry(int n, int linewise, int errornr) {
		qfline_S generatedQf_prev = this.getQf_prev();
		int generatedQf_fnum = generatedQf_prev.getQf_fnum();
		while (n-- > 0 && !got_int) {
			if (generatedQf_prev == ((Object)0) || generatedQf_fnum != generatedQf_fnum) {
				break;
			} 
			entry = generatedQf_prev;
			--errornr;
			if (linewise) {
				entry = entry.qf_find_first_entry_on_line(errornr/*
				 * Find the n'th quickfix entry adjacent to position 'pos' in buffer 'bnr' in
				 * the specified direction.  Returns the error number in the quickfix list or 0
				 * if an entry is not found.
				 */);
			} 
		}
	}
	public qfline_S getQf_next() {
		return qf_next;
	}
	public void setQf_next(qfline_S newQf_next) {
		qf_next = newQf_next;
	}
	public qfline_S getQf_prev() {
		return qf_prev;
	}
	public void setQf_prev(qfline_S newQf_prev) {
		qf_prev = newQf_prev;
	}
	public Object getQf_lnum() {
		return qf_lnum;
	}
	public void setQf_lnum(Object newQf_lnum) {
		qf_lnum = newQf_lnum;
	}
	public int getQf_fnum() {
		return qf_fnum;
	}
	public void setQf_fnum(int newQf_fnum) {
		qf_fnum = newQf_fnum;
	}
	public int getQf_col() {
		return qf_col;
	}
	public void setQf_col(int newQf_col) {
		qf_col = newQf_col;
	}
	public int getQf_nr() {
		return qf_nr;
	}
	public void setQf_nr(int newQf_nr) {
		qf_nr = newQf_nr;
	}
	public Object getQf_module() {
		return qf_module;
	}
	public void setQf_module(Object newQf_module) {
		qf_module = newQf_module;
	}
	public Object getQf_pattern() {
		return qf_pattern;
	}
	public void setQf_pattern(Object newQf_pattern) {
		qf_pattern = newQf_pattern;
	}
	public Object getQf_text() {
		return qf_text;
	}
	public void setQf_text(Object newQf_text) {
		qf_text = newQf_text;
	}
	public Object getQf_viscol() {
		return qf_viscol;
	}
	public void setQf_viscol(Object newQf_viscol) {
		qf_viscol = newQf_viscol;
	}
	public Object getQf_cleared() {
		return qf_cleared;
	}
	public void setQf_cleared(Object newQf_cleared) {
		qf_cleared = newQf_cleared;
	}
	public Object getQf_type() {
		return qf_type;
	}
	public void setQf_type(Object newQf_type) {
		qf_type = newQf_type;
	}
	public Object getQf_valid() {
		return qf_valid;
	}
	public void setQf_valid(Object newQf_valid) {
		qf_valid = newQf_valid;
	}
}
