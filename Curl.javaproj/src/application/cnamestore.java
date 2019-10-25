package application;

public class cnamestore {
	private Object len;
	private Object alloc;
	private Object allocsize;
	
	public cnamestore(Object len, Object alloc, Object allocsize) {
		setLen(len);
		setAlloc(alloc);
		setAllocsize(allocsize);
	}
	public cnamestore() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public Object getAllocsize() {
		return allocsize;
	}
	public void setAllocsize(Object newAllocsize) {
		allocsize = newAllocsize;
	}
}
