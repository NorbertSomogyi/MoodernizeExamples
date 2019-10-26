package application;

public class ff_visited_list_hdr {
	private ff_visited_list_hdr ffvl_next;
	private Object ffvl_filename;
	private ff_visited ffvl_visited_list;
	
	public ff_visited_list_hdr(ff_visited_list_hdr ffvl_next, Object ffvl_filename, ff_visited ffvl_visited_list) {
		setFfvl_next(ffvl_next);
		setFfvl_filename(ffvl_filename);
		setFfvl_visited_list(ffvl_visited_list);
	}
	public ff_visited_list_hdr() {
	}
	
	public void vim_findfile_free_visited_list() {
		ff_visited_list_hdr_T vp = new ff_visited_list_hdr_T();
		ff_visited_list_hdr generatedFfvl_next = (list_headp).getFfvl_next();
		ff_visited generatedFfvl_visited_list = (list_headp).getFfvl_visited_list();
		Object generatedFfvl_filename = (list_headp).getFfvl_filename();
		while (list_headp != ((Object)0)) {
			vp = generatedFfvl_next;
			generatedFfvl_visited_list.ff_free_visited_list();
			ModernizedCProgram.vim_free(generatedFfvl_filename);
			ModernizedCProgram.vim_free(list_headp);
			list_headp = vp;
		}
		list_headp = ((Object)0);
	}
	public ff_visited_list_hdr ff_get_visited_list(Object filename) {
		ff_visited_list_hdr_T retptr = ((Object)0);
		Object generatedFfvl_filename = retptr.getFfvl_filename();
		ff_visited_list_hdr generatedFfvl_next = retptr.getFfvl_next();
		// check if a visited list for the given filename existsif (list_headp != ((Object)0)) {
			retptr = list_headp;
			while (retptr != ((Object)0)) {
				if (ModernizedCProgram.vim_fnamecmp((char_u)(filename), (char_u)(generatedFfvl_filename)) == 0) {
					return retptr;
				} 
				retptr = generatedFfvl_next;
			}
		} 
		// don't overwrite this either// don't overwrite this eitherretptr = (ff_visited_list_hdr_T)ModernizedCProgram.alloc(/*
		     * if we reach this we didn't find a list and we have to allocate new list
		     */);
		if (retptr == ((Object)0)) {
			return ((Object)0);
		} 
		retptr.setFfvl_visited_list(((Object)0));
		retptr.setFfvl_filename(ModernizedCProgram.vim_strsave(filename));
		if (generatedFfvl_filename == ((Object)0)) {
			ModernizedCProgram.vim_free(retptr);
			return ((Object)0);
		} 
		retptr.setFfvl_next(list_headp);
		list_headp = retptr;
		return retptr/*
		 * check if two wildcard paths are equal. Returns TRUE or FALSE.
		 * They are equal if:
		 *  - both paths are NULL
		 *  - they have the same length
		 *  - char by char comparison is OK
		 *  - the only differences are in the counters behind a '**', so
		 *    '**\20' is equal to '**\24'
		 */;
	}
	public ff_visited_list_hdr getFfvl_next() {
		return ffvl_next;
	}
	public void setFfvl_next(ff_visited_list_hdr newFfvl_next) {
		ffvl_next = newFfvl_next;
	}
	public Object getFfvl_filename() {
		return ffvl_filename;
	}
	public void setFfvl_filename(Object newFfvl_filename) {
		ffvl_filename = newFfvl_filename;
	}
	public ff_visited getFfvl_visited_list() {
		return ffvl_visited_list;
	}
	public void setFfvl_visited_list(ff_visited newFfvl_visited_list) {
		ffvl_visited_list = newFfvl_visited_list;
	}
}
