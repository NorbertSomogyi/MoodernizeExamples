package application;

public class ff_search_ctx_T {
	private ff_stack ffsc_stack_ptr;
	private ff_visited_list_hdr ffsc_visited_list;
	private ff_visited_list_hdr ffsc_dir_visited_list;
	private ff_visited_list_hdr ffsc_visited_lists_list;
	private ff_visited_list_hdr ffsc_dir_visited_lists_list;
	private Object ffsc_file_to_search;
	private Object[] ffsc_start_dir;
	private Object[] ffsc_fix_path;
	private Object ffsc_wc_path;
	private int ffsc_level;
	private Object[][] ffsc_stopdirs_v;
	private int ffsc_find_what;
	private int ffsc_tagfile;
	
	public ff_search_ctx_T(ff_stack ffsc_stack_ptr, ff_visited_list_hdr ffsc_visited_list, ff_visited_list_hdr ffsc_dir_visited_list, ff_visited_list_hdr ffsc_visited_lists_list, ff_visited_list_hdr ffsc_dir_visited_lists_list, Object ffsc_file_to_search, Object[] ffsc_start_dir, Object[] ffsc_fix_path, Object ffsc_wc_path, int ffsc_level, Object[][] ffsc_stopdirs_v, int ffsc_find_what, int ffsc_tagfile) {
		setFfsc_stack_ptr(ffsc_stack_ptr);
		setFfsc_visited_list(ffsc_visited_list);
		setFfsc_dir_visited_list(ffsc_dir_visited_list);
		setFfsc_visited_lists_list(ffsc_visited_lists_list);
		setFfsc_dir_visited_lists_list(ffsc_dir_visited_lists_list);
		setFfsc_file_to_search(ffsc_file_to_search);
		setFfsc_start_dir(ffsc_start_dir);
		setFfsc_fix_path(ffsc_fix_path);
		setFfsc_wc_path(ffsc_wc_path);
		setFfsc_level(ffsc_level);
		setFfsc_stopdirs_v(ffsc_stopdirs_v);
		setFfsc_find_what(ffsc_find_what);
		setFfsc_tagfile(ffsc_tagfile);
	}
	public ff_search_ctx_T() {
	}
	
	public void ff_clear() {
		ff_stack_T sptr = new ff_stack_T();
		ff_stack ff_stack = new ff_stack();
		// clear up stackwhile ((sptr = ff_stack.ff_pop(search_ctx)) != ((Object)0)) {
			sptr.ff_free_stack_element();
		}
		Object generatedFfsc_file_to_search = this.getFfsc_file_to_search();
		ModernizedCProgram.vim_free(generatedFfsc_file_to_search);
		Object[] generatedFfsc_start_dir = this.getFfsc_start_dir();
		ModernizedCProgram.vim_free(generatedFfsc_start_dir);
		Object[] generatedFfsc_fix_path = this.getFfsc_fix_path();
		ModernizedCProgram.vim_free(generatedFfsc_fix_path);
		Object generatedFfsc_wc_path = this.getFfsc_wc_path();
		ModernizedCProgram.vim_free(generatedFfsc_wc_path);
		Object[][] generatedFfsc_stopdirs_v = this.getFfsc_stopdirs_v();
		if (generatedFfsc_stopdirs_v != ((Object)0)) {
			int i = 0;
			while (generatedFfsc_stopdirs_v[i] != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedFfsc_stopdirs_v[i]);
				i++;
			}
			ModernizedCProgram.vim_free(generatedFfsc_stopdirs_v);
		} 
		this.setFfsc_stopdirs_v(((Object)0));
		// reset everything// reset everythingthis.setFfsc_file_to_search(((Object)0));
		this.setFfsc_start_dir(((Object)0));
		this.setFfsc_fix_path(((Object)0));
		this.setFfsc_wc_path(((Object)0));
		this.setFfsc_level(0/*
		 * check if the given path is in the stopdirs
		 * returns TRUE if yes else FALSE
		 */);
	}
	public ff_stack getFfsc_stack_ptr() {
		return ffsc_stack_ptr;
	}
	public void setFfsc_stack_ptr(ff_stack newFfsc_stack_ptr) {
		ffsc_stack_ptr = newFfsc_stack_ptr;
	}
	public ff_visited_list_hdr getFfsc_visited_list() {
		return ffsc_visited_list;
	}
	public void setFfsc_visited_list(ff_visited_list_hdr newFfsc_visited_list) {
		ffsc_visited_list = newFfsc_visited_list;
	}
	public ff_visited_list_hdr getFfsc_dir_visited_list() {
		return ffsc_dir_visited_list;
	}
	public void setFfsc_dir_visited_list(ff_visited_list_hdr newFfsc_dir_visited_list) {
		ffsc_dir_visited_list = newFfsc_dir_visited_list;
	}
	public ff_visited_list_hdr getFfsc_visited_lists_list() {
		return ffsc_visited_lists_list;
	}
	public void setFfsc_visited_lists_list(ff_visited_list_hdr newFfsc_visited_lists_list) {
		ffsc_visited_lists_list = newFfsc_visited_lists_list;
	}
	public ff_visited_list_hdr getFfsc_dir_visited_lists_list() {
		return ffsc_dir_visited_lists_list;
	}
	public void setFfsc_dir_visited_lists_list(ff_visited_list_hdr newFfsc_dir_visited_lists_list) {
		ffsc_dir_visited_lists_list = newFfsc_dir_visited_lists_list;
	}
	public Object getFfsc_file_to_search() {
		return ffsc_file_to_search;
	}
	public void setFfsc_file_to_search(Object newFfsc_file_to_search) {
		ffsc_file_to_search = newFfsc_file_to_search;
	}
	public Object[] getFfsc_start_dir() {
		return ffsc_start_dir;
	}
	public void setFfsc_start_dir(Object[] newFfsc_start_dir) {
		ffsc_start_dir = newFfsc_start_dir;
	}
	public Object[] getFfsc_fix_path() {
		return ffsc_fix_path;
	}
	public void setFfsc_fix_path(Object[] newFfsc_fix_path) {
		ffsc_fix_path = newFfsc_fix_path;
	}
	public Object getFfsc_wc_path() {
		return ffsc_wc_path;
	}
	public void setFfsc_wc_path(Object newFfsc_wc_path) {
		ffsc_wc_path = newFfsc_wc_path;
	}
	public int getFfsc_level() {
		return ffsc_level;
	}
	public void setFfsc_level(int newFfsc_level) {
		ffsc_level = newFfsc_level;
	}
	public Object[][] getFfsc_stopdirs_v() {
		return ffsc_stopdirs_v;
	}
	public void setFfsc_stopdirs_v(Object[][] newFfsc_stopdirs_v) {
		ffsc_stopdirs_v = newFfsc_stopdirs_v;
	}
	public int getFfsc_find_what() {
		return ffsc_find_what;
	}
	public void setFfsc_find_what(int newFfsc_find_what) {
		ffsc_find_what = newFfsc_find_what;
	}
	public int getFfsc_tagfile() {
		return ffsc_tagfile;
	}
	public void setFfsc_tagfile(int newFfsc_tagfile) {
		ffsc_tagfile = newFfsc_tagfile;
	}
}
