package application;

public class index_entry {
	private Object ptr;
	private int val;
	
	public index_entry(Object ptr, int val) {
		setPtr(ptr);
		setVal(val);
	}
	public index_entry() {
	}
	
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int newVal) {
		val = newVal;
	}
}
