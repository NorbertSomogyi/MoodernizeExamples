package application;

public class asprintf {
	private Byte buffer;
	private Object len;
	private Object alloc;
	private int fail;
	
	public asprintf(Byte buffer, Object len, Object alloc, int fail) {
		setBuffer(buffer);
		setLen(len);
		setAlloc(alloc);
		setFail(fail);
	}
	public asprintf() {
	}
	
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
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
