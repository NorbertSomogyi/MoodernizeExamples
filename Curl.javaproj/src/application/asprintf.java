package application;

public class asprintf {
	private Object buffer;
	private Object len;
	private Object alloc;
	private int fail;
	
	public asprintf(Object buffer, Object len, Object alloc, int fail) {
		setBuffer(buffer);
		setLen(len);
		setAlloc(alloc);
		setFail(fail);
	}
	public asprintf() {
	}
	
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
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
	public int getFail() {
		return fail;
	}
	public void setFail(int newFail) {
		fail = newFail;
	}
}
