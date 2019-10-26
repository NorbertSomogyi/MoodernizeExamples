package application;

public class tempbuf {
	private Byte buf;
	private Object len;
	private int type;
	
	public tempbuf(Byte buf, Object len, int type) {
		setBuf(buf);
		setLen(len);
		setType(type);
	}
	public tempbuf() {
	}
	
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
}
