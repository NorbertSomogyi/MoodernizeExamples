package application;

public class ff_visited {
	private ff_visited ffv_next;
	private Object ffv_wc_path;
	private Object ffv_fname;
	
	public ff_visited(ff_visited ffv_next, Object ffv_wc_path, Object ffv_fname) {
		setFfv_next(ffv_next);
		setFfv_wc_path(ffv_wc_path);
		setFfv_fname(ffv_fname);
	}
	public ff_visited() {
	}
	
	public void ff_free_visited_list() {
		ff_visited_T vp = new ff_visited_T();
		ff_visited generatedFfv_next = this.getFfv_next();
		Object generatedFfv_wc_path = this.getFfv_wc_path();
		while (vl != ((Object)0)) {
			vp = generatedFfv_next;
			ModernizedCProgram.vim_free(generatedFfv_wc_path);
			ModernizedCProgram.vim_free(vl);
			vl = vp;
		}
		vl = ((Object)0/*
		 * Returns the already visited list for the given filename. If none is found it
		 * allocates a new one.
		 */);
	}
	// locally needed functions
	public int ff_check_visited(Object fname, Object wc_path) {
		ff_visited_T vp = new ff_visited_T();
		// For an URL we only compare the name, otherwise we compare the// device/inode (unix) or the full path name (not Unix).if (ModernizedCProgram.path_with_url(fname)) {
			ModernizedCProgram.vim_strncpy(ModernizedCProgram.ff_expand_buffer, fname, 1024 - 1);
		} else {
				ModernizedCProgram.ff_expand_buffer[0] = (byte)'\000';
				if (ModernizedCProgram.vim_FullName(fname, ModernizedCProgram.ff_expand_buffer, 1024, 1) == 0) {
					return 0;
				} 
		} 
		Object generatedFfv_fname = vp.getFfv_fname();
		Object generatedFfv_wc_path = vp.getFfv_wc_path();
		ff_visited generatedFfv_next = vp.getFfv_next();
		// check against list of already visited filesfor (vp = visited_list; vp != ((Object)0); vp = generatedFfv_next) {
			if (ModernizedCProgram.vim_fnamecmp((char_u)(generatedFfv_fname), (char_u)(ModernizedCProgram.ff_expand_buffer)) == 0) {
				if (ModernizedCProgram.ff_wc_equal(generatedFfv_wc_path, wc_path) == 1) {
					return 0;
				} 
			} 
		}
		vp = ModernizedCProgram.alloc(/*Error: Unsupported expression*/ + /*Error: Function owner not recognized*/strlen((byte)(/*
		     * New file/dir.  Add it to the list of visited files/dirs.
		     */ModernizedCProgram.ff_expand_buffer)));
		if (vp != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(generatedFfv_fname), (byte)(ModernizedCProgram.ff_expand_buffer));
			if (wc_path != ((Object)0)) {
				vp.setFfv_wc_path(ModernizedCProgram.vim_strsave(wc_path));
			} else {
					vp.setFfv_wc_path(((Object)0));
			} 
			vp.setFfv_next(visited_list);
			visited_list = vp;
		} 
		return 1/*
		 * create stack element from given path pieces
		 */;
	}
	public ff_visited getFfv_next() {
		return ffv_next;
	}
	public void setFfv_next(ff_visited newFfv_next) {
		ffv_next = newFfv_next;
	}
	public Object getFfv_wc_path() {
		return ffv_wc_path;
	}
	public void setFfv_wc_path(Object newFfv_wc_path) {
		ffv_wc_path = newFfv_wc_path;
	}
	public Object getFfv_fname() {
		return ffv_fname;
	}
	public void setFfv_fname(Object newFfv_fname) {
		ffv_fname = newFfv_fname;
	}
}
