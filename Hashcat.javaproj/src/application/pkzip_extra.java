package application;

public class pkzip_extra {
	private Object[] buf;
	private Object len;
	
	public pkzip_extra(Object[] buf, Object len) {
		setBuf(buf);
		setLen(len);
	}
	public pkzip_extra() {
	}
	
	public Object[] getBuf() {
		return buf;
	}
	public void setBuf(Object[] newBuf) {
		buf = newBuf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
