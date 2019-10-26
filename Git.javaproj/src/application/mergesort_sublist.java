package application;

public class mergesort_sublist {
	private Object ptr;
	private long len;
	
	public mergesort_sublist(Object ptr, long len) {
		setPtr(ptr);
		setLen(len);
	}
	public mergesort_sublist() {
	}
	
	public Object pop_item(Object get_next_fn) {
		Object generatedPtr = this.getPtr();
		Object p = generatedPtr;
		this.setPtr(.get_next_fn(generatedPtr));
		long generatedLen = this.getLen();
		this.setLen(generatedPtr ? (generatedLen - 1) : 0);
		return p;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public long getLen() {
		return len;
	}
	public void setLen(long newLen) {
		len = newLen;
	}
}
