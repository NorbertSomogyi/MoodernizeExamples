package application;

/*
 * Argument list: Array of file names.
 * Used for the global argument list and the argument lists local to a window.
 */
public class arglist {
	private growarray al_ga;
	private int al_refcount;
	private int id;
	
	public arglist(growarray al_ga, int al_refcount, int id) {
		setAl_ga(al_ga);
		setAl_refcount(al_refcount);
		setId(id);
	}
	public arglist() {
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
	 * arglist.c: functions for dealing with the argument list
	 */
	/*
	 * Clear an argument list: free all file names and reset it to zero entries.
	 */
	public void alist_clear() {
		growarray generatedAl_ga = this.getAl_ga();
		int generatedGa_len = generatedAl_ga.getGa_len();
		Object generatedGa_data = generatedAl_ga.getGa_data();
		while (--generatedGa_len >= 0) {
			ModernizedCProgram.vim_free(((aentry_T)(generatedGa_data))[generatedGa_len].getAe_fname());
		}
		generatedAl_ga.ga_clear();
	}
	public void alist_init() {
		growarray generatedAl_ga = this.getAl_ga();
		generatedAl_ga.ga_init2((int), 5/*
		 * Remove a reference from an argument list.
		 * Ignored when the argument list is the global one.
		 * If the argument list is no longer used by any window, free it.
		 */);
	}
	public void alist_unlink() {
		int generatedAl_refcount = this.getAl_refcount();
		if (al != ModernizedCProgram.global_alist && --generatedAl_refcount <= 0) {
			al.alist_clear();
			ModernizedCProgram.vim_free(al/*
			 * Create a new argument list and use it for the current window.
			 */);
		} 
	}
	public void alist_set(int count, Object files, int use_curbuf, Integer fnum_list, int fnum_len) {
		int i;
		int recursive = 0;
		if (recursive) {
			ModernizedCProgram.emsg(((byte)(e_au_recursive)));
			return ;
		} 
		++recursive;
		al.alist_clear();
		growarray generatedAl_ga = this.getAl_ga();
		if (generatedAl_ga.ga_grow(count) == 1) {
			for (i = 0; i < count; ++i) {
				if (got_int) {
					while (i < count) {
						ModernizedCProgram.vim_free(files[i++]);
					}
					break;
				} 
				if (fnum_list != ((Object)0) && i < fnum_len) {
					ModernizedCProgram.buf_set_name(fnum_list[i], files[i]);
				} 
				al.alist_add(files[i], use_curbuf ? 2 : 1);
				ModernizedCProgram.ui_breakcheck();
			}
			ModernizedCProgram.vim_free(files);
		} else {
				ModernizedCProgram.FreeWild(count, files);
		} 
		if (al == ModernizedCProgram.global_alist) {
			arg_had_last = 0;
		} 
		--recursive/*
		 * Add file "fname" to argument list "al".
		 * "fname" must have been allocated and "al" must have been checked for room.
		 */;
	}
	public void alist_add(Object fname, int set_fnum) {
		// 1: set buffer number; 2: re-use curbuf// don't add NULL file namesif (fname == ((Object)0)) {
			return ;
		} 
		ModernizedCProgram.slash_adjust(fname);
		growarray generatedAl_ga = (al).getAl_ga();
		Object generatedGa_data = generatedAl_ga.getGa_data();
		int generatedGa_len = generatedAl_ga.getGa_len();
		((aentry_T)(generatedGa_data))[generatedGa_len].setAe_fname(fname);
		if (set_fnum > 0) {
			((aentry_T)(generatedGa_data))[generatedGa_len].setAe_fnum(ModernizedCProgram.buflist_add(fname, 2 | (set_fnum == 2 ? 1 : 0)));
		} 
		++generatedGa_len;
	}
	public growarray getAl_ga() {
		return al_ga;
	}
	public void setAl_ga(growarray newAl_ga) {
		al_ga = newAl_ga;
	}
	public int getAl_refcount() {
		return al_refcount;
	}
	public void setAl_refcount(int newAl_refcount) {
		al_refcount = newAl_refcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
}
