package application;

public class prefix_ref_iterator {
	private ref_iterator base;
	private ref_iterator iter0;
	private Byte prefix;
	private int trim;
	
	public prefix_ref_iterator(ref_iterator base, ref_iterator iter0, Byte prefix, int trim) {
		setBase(base);
		setIter0(iter0);
		setPrefix(prefix);
		setTrim(trim);
	}
	public prefix_ref_iterator() {
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
	public Byte getPrefix() {
		return prefix;
	}
	public void setPrefix(Byte newPrefix) {
		prefix = newPrefix;
	}
	public int getTrim() {
		return trim;
	}
	public void setTrim(int newTrim) {
		trim = newTrim;
	}
}
