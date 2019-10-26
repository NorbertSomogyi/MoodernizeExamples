package application;

public class func_line {
	private long len;
	private Object buf;
	
	public func_line(long len, Object buf) {
		setLen(len);
		setBuf(buf);
	}
	public func_line() {
	}
	
	public long getLen() {
		return len;
	}
	public void setLen(long newLen) {
		len = newLen;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
