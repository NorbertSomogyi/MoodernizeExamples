package application;

/*
 * The taggy struct is used to store the information about a :tag command.
 */
public class taggy {
	private Object tagname;
	private filemark fmark;
	private int cur_match;
	private int cur_fnum;
	private Object user_data;
	
	public taggy(Object tagname, filemark fmark, int cur_match, int cur_fnum, Object user_data) {
		setTagname(tagname);
		setFmark(fmark);
		setCur_match(cur_match);
		setCur_fnum(cur_fnum);
		setUser_data(user_data);
	}
	public taggy() {
	}
	
	public void tagstack_clear_entry() {
		Object generatedTagname = this.getTagname();
		do {
			if ((generatedTagname) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedTagname);
				(generatedTagname) = ((Object)0);
			} 
		} while (0);
		Object generatedUser_data = this.getUser_data();
		do {
			if ((generatedUser_data) != ((Object)0)) {
				ModernizedCProgram.vim_free(generatedUser_data);
				(generatedUser_data) = ((Object)0);
			} 
		} while (0);
	}
	// disallow recursive call of tagfunc
	// Used instead of NUL to separate tag fields in the growarrays.
	public Object getTagname() {
		return tagname;
	}
	public void setTagname(Object newTagname) {
		tagname = newTagname;
	}
	public filemark getFmark() {
		return fmark;
	}
	public void setFmark(filemark newFmark) {
		fmark = newFmark;
	}
	public int getCur_match() {
		return cur_match;
	}
	public void setCur_match(int newCur_match) {
		cur_match = newCur_match;
	}
	public int getCur_fnum() {
		return cur_fnum;
	}
	public void setCur_fnum(int newCur_fnum) {
		cur_fnum = newCur_fnum;
	}
	public Object getUser_data() {
		return user_data;
	}
	public void setUser_data(Object newUser_data) {
		user_data = newUser_data;
	}
}
