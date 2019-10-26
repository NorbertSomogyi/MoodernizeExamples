package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 * findfile.c: Search for files in directories listed in 'path'
 */
/*
 * File searching functions for 'path', 'tags' and 'cdpath' options.
 * External visible functions:
 * vim_findfile_init()		creates/initialises the search context
 * vim_findfile_free_visited()	free list of visited files/dirs of search
 *				context
 * vim_findfile()		find a file in the search context
 * vim_findfile_cleanup()	cleanup/free search context created by
 *				vim_findfile_init()
 *
 * All static functions and variables start with 'ff_'
 *
 * In general it works like this:
 * First you create yourself a search context by calling vim_findfile_init().
 * It is possible to give a search context from a previous call to
 * vim_findfile_init(), so it can be reused. After this you call vim_findfile()
 * until you are satisfied with the result or it returns NULL. On every call it
 * returns the next file which matches the conditions given to
 * vim_findfile_init(). If it doesn't find a next file it returns NULL.
 *
 * It is possible to call vim_findfile_init() again to reinitialise your search
 * with some new parameters. Don't forget to pass your old search context to
 * it, so it can reuse it and especially reuse the list of already visited
 * directories. If you want to delete the list of already visited directories
 * simply call vim_findfile_free_visited().
 *
 * When you are done call vim_findfile_cleanup() to free the search context.
 *
 * The function vim_findfile_init() has a long comment, which describes the
 * needed parameters.
 *
 *
 *
 * ATTENTION:
 * ==========
 *	Also we use an allocated search context here, this functions are NOT
 *	thread-safe!!!!!
 *
 *	To minimize parameter passing (or because I'm to lazy), only the
 *	external visible functions get a search context as a parameter. This is
 *	then assigned to a static global, which is used throughout the local
 *	functions.
 */
/*
 * type for the directory search stack
 */
public class ff_stack {
	private ff_stack ffs_prev;
	private Object ffs_fix_path;
	private Object ffs_wc_path;
	private Object ffs_filearray;
	private int ffs_filearray_size;
	private Object ffs_filearray_cur;
	private int ffs_stage;
	private int ffs_level;
	private int ffs_star_star_empty;
	
	public ff_stack(ff_stack ffs_prev, Object ffs_fix_path, Object ffs_wc_path, Object ffs_filearray, int ffs_filearray_size, Object ffs_filearray_cur, int ffs_stage, int ffs_level, int ffs_star_star_empty) {
		setFfs_prev(ffs_prev);
		setFfs_fix_path(ffs_fix_path);
		setFfs_wc_path(ffs_wc_path);
		setFfs_filearray(ffs_filearray);
		setFfs_filearray_size(ffs_filearray_size);
		setFfs_filearray_cur(ffs_filearray_cur);
		setFfs_stage(ffs_stage);
		setFfs_level(ffs_level);
		setFfs_star_star_empty(ffs_star_star_empty);
	}
	public ff_stack() {
	}
	
	public ff_stack ff_create_stack_element(Object fix_part, Object wc_part, int level, int star_star_empty) {
		ff_stack_T new = new ff_stack_T();
		new = (ff_stack_T)ModernizedCProgram.alloc();
		if (new == ((Object)0)) {
			return ((Object)0);
		} 
		new.setFfs_prev(((Object)0));
		new.setFfs_filearray(((Object)0));
		new.setFfs_filearray_size(0);
		new.setFfs_filearray_cur(0);
		new.setFfs_stage(0);
		new.setFfs_level(level);
		new.setFfs_star_star_empty(star_star_empty);
		// the following saves NULL pointer checks in vim_findfileif (fix_part == ((Object)0)) {
			fix_part = (char_u)"";
		} 
		new.setFfs_fix_path(ModernizedCProgram.vim_strsave(fix_part));
		if (wc_part == ((Object)0)) {
			wc_part = (char_u)"";
		} 
		new.setFfs_wc_path(ModernizedCProgram.vim_strsave(wc_part));
		Object generatedFfs_fix_path = new.getFfs_fix_path();
		Object generatedFfs_wc_path = new.getFfs_wc_path();
		if (generatedFfs_fix_path == ((Object)0) || generatedFfs_wc_path == ((Object)0)) {
			new.ff_free_stack_element();
			new = ((Object)0);
		} 
		return new/*
		 * Push a dir on the directory stack.
		 */;
	}
	public ff_stack ff_pop(ff_search_ctx_T search_ctx) {
		ff_stack_T sptr = new ff_stack_T();
		ff_stack generatedFfsc_stack_ptr = search_ctx.getFfsc_stack_ptr();
		sptr = generatedFfsc_stack_ptr;
		ff_stack generatedFfs_prev = generatedFfsc_stack_ptr.getFfs_prev();
		if (generatedFfsc_stack_ptr != ((Object)0)) {
			search_ctx.setFfsc_stack_ptr(generatedFfs_prev);
		} 
		return sptr/*
		 * free the given stack element
		 */;
	}
	public void ff_free_stack_element() {
		Object generatedFfs_fix_path = this.getFfs_fix_path();
		// vim_free handles possible NULL pointers// vim_free handles possible NULL pointersModernizedCProgram.vim_free(generatedFfs_fix_path);
		Object generatedFfs_wc_path = this.getFfs_wc_path();
		ModernizedCProgram.vim_free(generatedFfs_wc_path);
		Object generatedFfs_filearray = this.getFfs_filearray();
		int generatedFfs_filearray_size = this.getFfs_filearray_size();
		if (generatedFfs_filearray != ((Object)0)) {
			ModernizedCProgram.FreeWild(generatedFfs_filearray_size, generatedFfs_filearray);
		} 
		ModernizedCProgram.vim_free(stack_ptr/*
		 * Clear the search context, but NOT the visited list.
		 */);
	}
	public ff_stack getFfs_prev() {
		return ffs_prev;
	}
	public void setFfs_prev(ff_stack newFfs_prev) {
		ffs_prev = newFfs_prev;
	}
	public Object getFfs_fix_path() {
		return ffs_fix_path;
	}
	public void setFfs_fix_path(Object newFfs_fix_path) {
		ffs_fix_path = newFfs_fix_path;
	}
	public Object getFfs_wc_path() {
		return ffs_wc_path;
	}
	public void setFfs_wc_path(Object newFfs_wc_path) {
		ffs_wc_path = newFfs_wc_path;
	}
	public Object getFfs_filearray() {
		return ffs_filearray;
	}
	public void setFfs_filearray(Object newFfs_filearray) {
		ffs_filearray = newFfs_filearray;
	}
	public int getFfs_filearray_size() {
		return ffs_filearray_size;
	}
	public void setFfs_filearray_size(int newFfs_filearray_size) {
		ffs_filearray_size = newFfs_filearray_size;
	}
	public Object getFfs_filearray_cur() {
		return ffs_filearray_cur;
	}
	public void setFfs_filearray_cur(Object newFfs_filearray_cur) {
		ffs_filearray_cur = newFfs_filearray_cur;
	}
	public int getFfs_stage() {
		return ffs_stage;
	}
	public void setFfs_stage(int newFfs_stage) {
		ffs_stage = newFfs_stage;
	}
	public int getFfs_level() {
		return ffs_level;
	}
	public void setFfs_level(int newFfs_level) {
		ffs_level = newFfs_level;
	}
	public int getFfs_star_star_empty() {
		return ffs_star_star_empty;
	}
	public void setFfs_star_star_empty(int newFfs_star_star_empty) {
		ffs_star_star_empty = newFfs_star_star_empty;
	}
}
// the fix part (no wildcards) and the part containing the wildcards
