package application;

/* the struct exclude_stack for the parent directory */
public class exclude_stack {
	private exclude_stack prev;
	private int baselen;
	private int exclude_ix;
	private untracked_cache_dir ucd;
	
	public exclude_stack(exclude_stack prev, int baselen, int exclude_ix, untracked_cache_dir ucd) {
		setPrev(prev);
		setBaselen(baselen);
		setExclude_ix(exclude_ix);
		setUcd(ucd);
	}
	public exclude_stack() {
	}
	
	public exclude_stack getPrev() {
		return prev;
	}
	public void setPrev(exclude_stack newPrev) {
		prev = newPrev;
	}
	public int getBaselen() {
		return baselen;
	}
	public void setBaselen(int newBaselen) {
		baselen = newBaselen;
	}
	public int getExclude_ix() {
		return exclude_ix;
	}
	public void setExclude_ix(int newExclude_ix) {
		exclude_ix = newExclude_ix;
	}
	public untracked_cache_dir getUcd() {
		return ucd;
	}
	public void setUcd(untracked_cache_dir newUcd) {
		ucd = newUcd;
	}
}
