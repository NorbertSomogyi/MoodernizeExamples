package application;

public class empty_ref_iterator {
	private ref_iterator base;
	
	public empty_ref_iterator(ref_iterator base) {
		setBase(base);
	}
	public empty_ref_iterator() {
	}
	
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
}
