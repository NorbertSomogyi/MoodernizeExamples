package application;

// ================================================================
public class wstrhd {
	private Object len;
	private Object[] buf;
	
	public wstrhd(Object len, Object[] buf) {
		setLen(len);
		setBuf(buf);
	}
	public wstrhd() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object[] getBuf() {
		return buf;
	}
	public void setBuf(Object[] newBuf) {
		buf = newBuf;
	}
}
