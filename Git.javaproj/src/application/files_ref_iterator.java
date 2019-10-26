package application;

public class files_ref_iterator {
	private ref_iterator base;
	private ref_iterator iter0;
	private int flags;
	
	public files_ref_iterator(ref_iterator base, ref_iterator iter0, int flags) {
		setBase(base);
		setIter0(iter0);
		setFlags(flags);
	}
	public files_ref_iterator() {
	}
	
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
	public ref_iterator getIter0() {
		return iter0;
	}
	public void setIter0(ref_iterator newIter0) {
		iter0 = newIter0;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
