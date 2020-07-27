package application;

// Quickfix list - global list
// Location list - per window list
// Internal - Temporary list used by getqflist()/getloclist()
/*
 * Quickfix/Location list definition
 * Contains a list of entries (qfline_T). qf_start points to the first entry
 * and qf_last points to the last entry. qf_count contains the list size.
 *
 * Usually the list contains one or more entries. But an empty list can be
 * created using setqflist()/setloclist() with a title and/or user context
 * information and entries can be added later using setqflist()/setloclist().
 */
public class qf_list_S {
	private Object qf_id;
	private  qfl_type;
	private qfline_S qf_start;
	private qfline_S qf_last;
	private qfline_S qf_ptr;
	private int qf_count;
	private int qf_index;
	private int qf_nonevalid;
	private Object qf_title;
	private  qf_ctx;
	private dir_stack_T qf_dir_stack;
	private Object qf_directory;
	private dir_stack_T qf_file_stack;
	private Object qf_currfile;
	private int qf_multiline;
	private int qf_multiignore;
	private int qf_multiscan;
	private long qf_changedtick;
	
	public qf_list_S(Object qf_id,  qfl_type, qfline_S qf_start, qfline_S qf_last, qfline_S qf_ptr, int qf_count, int qf_index, int qf_nonevalid, Object qf_title,  qf_ctx, dir_stack_T qf_dir_stack, Object qf_directory, dir_stack_T qf_file_stack, Object qf_currfile, int qf_multiline, int qf_multiignore, int qf_multiscan, long qf_changedtick) {
		setQf_id(qf_id);
		setQfl_type(qfl_type);
		setQf_start(qf_start);
		setQf_last(qf_last);
		setQf_ptr(qf_ptr);
		setQf_count(qf_count);
		setQf_index(qf_index);
		setQf_nonevalid(qf_nonevalid);
		setQf_title(qf_title);
		setQf_ctx(qf_ctx);
		setQf_dir_stack(qf_dir_stack);
		setQf_directory(qf_directory);
		setQf_file_stack(qf_file_stack);
		setQf_currfile(qf_currfile);
		setQf_multiline(qf_multiline);
		setQf_multiignore(qf_multiignore);
		setQf_multiscan(qf_multiscan);
		setQf_changedtick(qf_changedtick);
	}
	public qf_list_S() {
	}
	
	public int qf_list_empty() {
		int generatedQf_count = this.getQf_count();
		return qfl == ((Object)0) || generatedQf_count <= 0/*
		 * Returns TRUE if the specified quickfix/location list is not empty and
		 * has valid entries.
		 */;
	}
	public int qf_list_has_valid_entries() {
		int generatedQf_nonevalid = this.getQf_nonevalid();
		return !qfl.qf_list_empty() && !generatedQf_nonevalid;
	}
	public qf_list_S qf_get_list(qf_info_S qi, int idx) {
		Object generatedQf_lists = qi.getQf_lists();
		return generatedQf_lists[idx/*
		 * Allocate the fields used for parsing lines and populating a quickfix list.
		 */];
	}
	public void qf_store_title(Object title) {
		Object generatedQf_title = this.getQf_title();
		do {
			if ((generatedQf_title) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedQf_title);
				(generatedQf_title) = ((Object)0);
			} 
		} while (0);
		if (title != ((Object)0)) {
			char_u p = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(title)) + 2);
			this.setQf_title(p);
			if (p != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p), (byte)(title/*
				 * The title of a quickfix/location list is set, by default, to the command
				 * that created the quickfix list with the ":" prefix.
				 * Create a quickfix list title string by prepending ":" to a user command.
				 * Returns a pointer to a static buffer with the title.
				 */));
			} 
		} 
	}
	public qf_list_S qf_get_curlist(qf_info_S qi) {
		int generatedQf_curlist = qi.getQf_curlist();
		qf_list_S qf_list_S = new qf_list_S();
		return qf_list_S.qf_get_list(qi, generatedQf_curlist);
	}
	/*
	 * Add an entry to the end of the list of errors.
	 * Returns QF_OK or QF_FAIL.
	 */
	public int qf_add_entry(Object dir, Object fname, Object module, int bufnum, Object mesg, long lnum, int col, int vis_col, Object pattern, int nr, int type, int valid) {
		// using visual column// search pattern// error number// type character// valid entryqfline_T qfp = new qfline_T();
		// pointer to qf_last or NULLqfline_T lastp = new qfline_T();
		if ((qfp = (qfline_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/)) == ((Object)0)) {
			return .QF_FAIL;
		} 
		file_buffer file_buffer = new file_buffer();
		Object generatedB_has_qf_entry = buf.getB_has_qf_entry();
		 generatedQfl_type = this.getQfl_type();
		if (bufnum != 0) {
			buf_T buf = file_buffer.buflist_findnr(bufnum);
			qfp.setQf_fnum(bufnum);
			if (buf != ((Object)0)) {
				generatedB_has_qf_entry |=  (generatedQfl_type == .QFLT_QUICKFIX) ? 1 : 2;
			} 
		} else {
				qfp.setQf_fnum(qfl.qf_get_fnum(dir, fname));
		} 
		if ((qfp.setQf_text(ModernizedCProgram.vim_strsave(mesg))) == ((Object)0)) {
			ModernizedCProgram.vim_free(qfp);
			return .QF_FAIL;
		} 
		qfp.setQf_lnum(lnum);
		qfp.setQf_col(col);
		qfp.setQf_viscol(vis_col);
		Object generatedQf_text = qfp.getQf_text();
		if (pattern == ((Object)0) || pattern == (byte)'\000') {
			qfp.setQf_pattern(((Object)0));
		}  else if ((qfp.setQf_pattern(ModernizedCProgram.vim_strsave(pattern))) == ((Object)0)) {
			ModernizedCProgram.vim_free(generatedQf_text);
			ModernizedCProgram.vim_free(qfp);
			return .QF_FAIL;
		} 
		Object generatedQf_pattern = qfp.getQf_pattern();
		if (module == ((Object)0) || module == (byte)'\000') {
			qfp.setQf_module(((Object)0));
		}  else if ((qfp.setQf_module(ModernizedCProgram.vim_strsave(module))) == ((Object)0)) {
			ModernizedCProgram.vim_free(generatedQf_text);
			ModernizedCProgram.vim_free(generatedQf_pattern);
			ModernizedCProgram.vim_free(qfp);
			return .QF_FAIL;
		} 
		qfp.setQf_nr(nr);
		// only printable chars allowedif (type != 1 && !ModernizedCProgram.vim_isprintc(type)) {
			type = 0;
		} 
		qfp.setQf_type(type);
		qfp.setQf_valid(valid);
		qfline_S generatedQf_last = this.getQf_last();
		lastp = generatedQf_last;
		// first element in the listif (qfl.qf_list_empty()) {
			this.setQf_start(qfp);
			this.setQf_ptr(qfp);
			this.setQf_index(0);
			qfp.setQf_prev(((Object)0));
		} else {
				qfp.setQf_prev(lastp);
				(lastp).setQf_next(qfp);
		} 
		qfp.setQf_next(((Object)0));
		qfp.setQf_cleared(0);
		lastp = qfp;
		int generatedQf_count = this.getQf_count();
		++generatedQf_count;
		int generatedQf_index = this.getQf_index();
		Object generatedQf_valid = qfp.getQf_valid();
		// first valid entryif (generatedQf_index == 0 && generatedQf_valid) {
			this.setQf_index(generatedQf_count);
			this.setQf_ptr(qfp);
		} 
		return .QF_OK/*
		 * Allocate a new quickfix/location list stack
		 */;
	}
	// quickfix list entry
	// optional directory name
	// file name or NULL
	// module name or NULL
	// buffer number or zero
	// message
	// line number
	// column
	public int copy_loclist_entries(qf_list_S to_qfl) {
		int i;
		qfline_T from_qfp = new qfline_T();
		qfline_T prevp = new qfline_T();
		int generatedQf_count = this.getQf_count();
		Object generatedQf_module = from_qfp.getQf_module();
		Object generatedQf_text = from_qfp.getQf_text();
		Object generatedQf_lnum = from_qfp.getQf_lnum();
		int generatedQf_col = from_qfp.getQf_col();
		Object generatedQf_viscol = from_qfp.getQf_viscol();
		Object generatedQf_pattern = from_qfp.getQf_pattern();
		int generatedQf_nr = from_qfp.getQf_nr();
		Object generatedQf_valid = from_qfp.getQf_valid();
		qfline_S generatedQf_last = to_qfl.getQf_last();
		int generatedQf_fnum = from_qfp.getQf_fnum();
		Object generatedQf_type = from_qfp.getQf_type();
		qfline_S generatedQf_ptr = this.getQf_ptr();
		// copy all the location entries in this listfor (; !got_int && i <= generatedQf_count && from_qfp != ((Object)0); ) {
			if (to_qfl.qf_add_entry(((Object)0), ((Object)0), generatedQf_module, 0, generatedQf_text, generatedQf_lnum, generatedQf_col, generatedQf_viscol, generatedQf_pattern, generatedQf_nr, 0, generatedQf_valid) == .QF_FAIL) {
				return 0;
			} 
			prevp = generatedQf_last;
			prevp.setQf_fnum(generatedQf_fnum);
			prevp.setQf_type(generatedQf_type);
			if (generatedQf_ptr == from_qfp) {
				to_qfl.setQf_ptr(prevp);
			} 
		}
		return 1/*
		 * Copy the specified location list 'from_qfl' to 'to_qfl'.
		 */;
	}
	public int copy_loclist(qf_list_S to_qfl) {
		 generatedQfl_type = this.getQfl_type();
		// Some of the fields are populated by qf_add_entry()// Some of the fields are populated by qf_add_entry()to_qfl.setQfl_type(generatedQfl_type);
		int generatedQf_nonevalid = this.getQf_nonevalid();
		to_qfl.setQf_nonevalid(generatedQf_nonevalid);
		to_qfl.setQf_count(0);
		to_qfl.setQf_index(0);
		to_qfl.setQf_start(((Object)0));
		to_qfl.setQf_last(((Object)0));
		to_qfl.setQf_ptr(((Object)0));
		Object generatedQf_title = this.getQf_title();
		if (generatedQf_title != ((Object)0)) {
			to_qfl.setQf_title(ModernizedCProgram.vim_strsave(generatedQf_title));
		} else {
				to_qfl.setQf_title(((Object)0));
		} 
		 generatedQf_ctx = this.getQf_ctx();
		if (generatedQf_ctx != ((Object)0)) {
			to_qfl.setQf_ctx(ModernizedCProgram.alloc_tv());
			if (generatedQf_ctx != ((Object)0)) {
				generatedQf_ctx.copy_tv(generatedQf_ctx);
			} 
		} else {
				to_qfl.setQf_ctx(((Object)0));
		} 
		int generatedQf_count = this.getQf_count();
		if (generatedQf_count) {
			if (from_qfl.copy_loclist_entries(to_qfl) == 0) {
				return 0;
			} 
		} 
		int generatedQf_index = this.getQf_index();
		// current index in the list// current index in the listto_qfl.setQf_index(generatedQf_index);
		// Assign a new ID for the location list// Assign a new ID for the location listto_qfl.setQf_id(++ModernizedCProgram.last_qf_id);
		to_qfl.setQf_changedtick(-1024)// When no valid entries are present in the list, qf_ptr points to;// When no valid entries are present in the list, qf_ptr points to
		qfline_S generatedQf_start = to_qfl.getQf_start();
		// the first item in the listif (generatedQf_nonevalid) {
			to_qfl.setQf_ptr(generatedQf_start);
			to_qfl.setQf_index(1);
		} 
		return 1/*
		 * Copy the location list stack 'from' window to 'to' window.
		 */;
	}
	public int qf_get_fnum(Object directory, Object fname) {
		char_u ptr = ((Object)0);
		buf_T buf = new buf_T();
		char_u bufname = new char_u();
		// no file nameif (fname == ((Object)0) || fname == (byte)'\000') {
			return 0;
		} 
		if (directory != ((Object)0)) {
			ModernizedCProgram.slash_adjust(directory);
		} 
		ModernizedCProgram.slash_adjust(fname);
		if (directory != ((Object)0) && !ModernizedCProgram.vim_isAbsName(fname) && (ptr = ModernizedCProgram.concat_fnames(directory, fname, 1)) != ((Object)0)) {
			if (ModernizedCProgram.mch_getperm(ptr) < 0) {
				ModernizedCProgram.vim_free(ptr);
				directory = qfl.qf_guess_filepath(fname);
				if (directory) {
					ptr = ModernizedCProgram.concat_fnames(directory, fname, 1);
				} else {
						ptr = ModernizedCProgram.vim_strsave(fname);
				} 
			} 
			bufname = ptr;
		} else {
				bufname = fname;
		} 
		file_buffer file_buffer = new file_buffer();
		if (ModernizedCProgram.qf_last_bufname != ((Object)0) && /*Error: Function owner not recognized*/strcmp((byte)(bufname), (byte)(ModernizedCProgram.qf_last_bufname)) == 0 && ModernizedCProgram.qf_last_bufref.bufref_valid()) {
			buf = ModernizedCProgram.qf_last_bufref.getBr_buf();
			ModernizedCProgram.vim_free(ptr);
		} else {
				ModernizedCProgram.vim_free(ModernizedCProgram.qf_last_bufname);
				buf = file_buffer.buflist_new(bufname, ((Object)0), (linenr_T)0, 16);
				if (bufname == ptr) {
					ModernizedCProgram.qf_last_bufname = bufname;
				} else {
						ModernizedCProgram.qf_last_bufname = ModernizedCProgram.vim_strsave(bufname);
				} 
				ModernizedCProgram.set_bufref(ModernizedCProgram.qf_last_bufref, buf);
		} 
		if (buf == ((Object)0)) {
			return 0;
		} 
		 generatedQfl_type = this.getQfl_type();
		buf.setB_has_qf_entry((generatedQfl_type == .QFLT_QUICKFIX) ? 1 : 2);
		int generatedB_fnum = buf.getB_fnum();
		return generatedB_fnum;
	}
	public Object qf_guess_filepath(Object filename) {
		dir_stack_T ds_ptr = new dir_stack_T();
		dir_stack_T ds_tmp = new dir_stack_T();
		char_u fullname = new char_u();
		dir_stack_T generatedQf_dir_stack = this.getQf_dir_stack();
		// no dirs on the stack - there's nothing we can doif (generatedQf_dir_stack == ((Object)0)) {
			return ((Object)0);
		} 
		dir_stack_T generatedNext = generatedQf_dir_stack.getNext();
		ds_ptr = generatedNext;
		fullname = ((Object)0);
		Object generatedDirname = ds_ptr.getDirname();
		while (ds_ptr) {
			ModernizedCProgram.vim_free(fullname);
			fullname = ModernizedCProgram.concat_fnames(generatedDirname, filename, 1);
			if ((fullname != ((Object)0)) && (ModernizedCProgram.mch_getperm(fullname) >= 0)) {
				break;
			} 
			ds_ptr = generatedNext;
		}
		ModernizedCProgram.vim_free(fullname);
		// clean up all dirs we already leftwhile (generatedNext != ds_ptr) {
			ds_tmp = generatedNext;
			generatedQf_dir_stack.setNext(generatedNext);
			ModernizedCProgram.vim_free(generatedDirname);
			ModernizedCProgram.vim_free(ds_tmp);
		}
		return ds_ptr == ((Object)0) ? ((Object)0) : generatedDirname;
	}
	public void qf_free_items() {
		qfline_T qfp = new qfline_T();
		qfline_T qfpnext = new qfline_T();
		int stop = 0;
		int generatedQf_count = this.getQf_count();
		qfline_S generatedQf_start = this.getQf_start();
		qfline_S generatedQf_next = qfp.getQf_next();
		Object generatedQf_module = qfp.getQf_module();
		Object generatedQf_text = qfp.getQf_text();
		Object generatedQf_pattern = qfp.getQf_pattern();
		while (generatedQf_count && generatedQf_start != ((Object)0)) {
			qfp = generatedQf_start;
			qfpnext = generatedQf_next;
			if (!stop) {
				ModernizedCProgram.vim_free(generatedQf_module);
				ModernizedCProgram.vim_free(generatedQf_text);
				ModernizedCProgram.vim_free(generatedQf_pattern);
				stop = (qfp == qfpnext);
				ModernizedCProgram.vim_free(qfp);
				if (stop) {
					this.setQf_count(1);
				} 
			} 
			this.setQf_start(qfpnext);
			--generatedQf_count;
		}
		this.setQf_index(0);
		this.setQf_start(((Object)0));
		this.setQf_last(((Object)0));
		this.setQf_ptr(((Object)0));
		this.setQf_nonevalid(1);
		dir_stack_T generatedQf_dir_stack = this.getQf_dir_stack();
		generatedQf_dir_stack.qf_clean_dir_stack();
		this.setQf_directory(((Object)0));
		dir_stack_T generatedQf_file_stack = this.getQf_file_stack();
		generatedQf_file_stack.qf_clean_dir_stack();
		this.setQf_currfile(((Object)0));
		this.setQf_multiline(0);
		this.setQf_multiignore(0);
		this.setQf_multiscan(0/*
		 * Free error list "idx". Frees all the entries in the quickfix list,
		 * associated context information and the title.
		 */);
	}
	public void qf_free() {
		qfl.qf_free_items();
		Object generatedQf_title = this.getQf_title();
		do {
			if ((generatedQf_title) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedQf_title);
				(generatedQf_title) = ((Object)0);
			} 
		} while (0);
		 generatedQf_ctx = this.getQf_ctx();
		generatedQf_ctx.free_tv();
		this.setQf_ctx(((Object)0));
		this.setQf_id(0);
		this.setQf_changedtick(-1024/*
		 * qf_mark_adjust: adjust marks
		 */);
	}
	public void qf_set_title_var() {
		Object generatedQf_title = this.getQf_title();
		if (generatedQf_title != ((Object)0)) {
			ModernizedCProgram.set_internal_string_var((char_u)"w:quickfix_title", generatedQf_title);
		} 
	}
	public void qf_list_changed() {
		long generatedQf_changedtick = this.getQf_changedtick();
		generatedQf_changedtick++;
	}
	public int qf_get_nth_valid_entry(int n, int fdo) {
		qfline_T qfp = new qfline_T();
		int i;
		int eidx;
		int prev_fnum = 0;
		// check if the list has valid errorsif (!qfl.qf_list_has_valid_entries()) {
			return 1;
		} 
		eidx = 0;
		int generatedQf_count = this.getQf_count();
		Object generatedQf_valid = qfp.getQf_valid();
		int generatedQf_fnum = qfp.getQf_fnum();
		for (; !got_int && i <= generatedQf_count && qfp != ((Object)0); ) {
			if (generatedQf_valid) {
				if (fdo) {
					if (generatedQf_fnum > 0 && generatedQf_fnum != prev_fnum) {
						eidx++;
						prev_fnum = generatedQf_fnum;
					} 
				} else {
						eidx++;
				} 
			} 
			if (eidx == n) {
				break;
			} 
		}
		if (i <= generatedQf_count) {
			return i;
		} else {
				return 1/*
				 * ":cc", ":crewind", ":cfirst" and ":clast".
				 * ":ll", ":lrewind", ":lfirst" and ":llast".
				 * ":cdo", ":ldo", ":cfdo" and ":lfdo"
				 */;
		} 
	}
	public Object getQf_id() {
		return qf_id;
	}
	public void setQf_id(Object newQf_id) {
		qf_id = newQf_id;
	}
	public  getQfl_type() {
		return qfl_type;
	}
	public void setQfl_type( newQfl_type) {
		qfl_type = newQfl_type;
	}
	public qfline_S getQf_start() {
		return qf_start;
	}
	public void setQf_start(qfline_S newQf_start) {
		qf_start = newQf_start;
	}
	public qfline_S getQf_last() {
		return qf_last;
	}
	public void setQf_last(qfline_S newQf_last) {
		qf_last = newQf_last;
	}
	public qfline_S getQf_ptr() {
		return qf_ptr;
	}
	public void setQf_ptr(qfline_S newQf_ptr) {
		qf_ptr = newQf_ptr;
	}
	public int getQf_count() {
		return qf_count;
	}
	public void setQf_count(int newQf_count) {
		qf_count = newQf_count;
	}
	public int getQf_index() {
		return qf_index;
	}
	public void setQf_index(int newQf_index) {
		qf_index = newQf_index;
	}
	public int getQf_nonevalid() {
		return qf_nonevalid;
	}
	public void setQf_nonevalid(int newQf_nonevalid) {
		qf_nonevalid = newQf_nonevalid;
	}
	public Object getQf_title() {
		return qf_title;
	}
	public void setQf_title(Object newQf_title) {
		qf_title = newQf_title;
	}
	public  getQf_ctx() {
		return qf_ctx;
	}
	public void setQf_ctx( newQf_ctx) {
		qf_ctx = newQf_ctx;
	}
	public dir_stack_T getQf_dir_stack() {
		return qf_dir_stack;
	}
	public void setQf_dir_stack(dir_stack_T newQf_dir_stack) {
		qf_dir_stack = newQf_dir_stack;
	}
	public Object getQf_directory() {
		return qf_directory;
	}
	public void setQf_directory(Object newQf_directory) {
		qf_directory = newQf_directory;
	}
	public dir_stack_T getQf_file_stack() {
		return qf_file_stack;
	}
	public void setQf_file_stack(dir_stack_T newQf_file_stack) {
		qf_file_stack = newQf_file_stack;
	}
	public Object getQf_currfile() {
		return qf_currfile;
	}
	public void setQf_currfile(Object newQf_currfile) {
		qf_currfile = newQf_currfile;
	}
	public int getQf_multiline() {
		return qf_multiline;
	}
	public void setQf_multiline(int newQf_multiline) {
		qf_multiline = newQf_multiline;
	}
	public int getQf_multiignore() {
		return qf_multiignore;
	}
	public void setQf_multiignore(int newQf_multiignore) {
		qf_multiignore = newQf_multiignore;
	}
	public int getQf_multiscan() {
		return qf_multiscan;
	}
	public void setQf_multiscan(int newQf_multiscan) {
		qf_multiscan = newQf_multiscan;
	}
	public long getQf_changedtick() {
		return qf_changedtick;
	}
	public void setQf_changedtick(long newQf_changedtick) {
		qf_changedtick = newQf_changedtick;
	}
}
