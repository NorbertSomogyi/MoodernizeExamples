package application;

/* These offsets are relative to the start of the commit message. */
public class chunk {
	private Object off;
	private Object len;
	
	public chunk(Object off, Object len) {
		setOff(off);
		setLen(len);
	}
	public chunk() {
	}
	
	public Object getOff() {
		return off;
	}
	public void setOff(Object newOff) {
		off = newOff;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
