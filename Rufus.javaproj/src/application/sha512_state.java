package application;

public class sha512_state {
	private Object length;
	private Object state;
	private long curlen;
	private Object buf;
	
	public sha512_state(Object length, Object state, long curlen, Object buf) {
		setLength(length);
		setState(state);
		setCurlen(curlen);
		setBuf(buf);
	}
	public sha512_state() {
	}
	
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public long getCurlen() {
		return curlen;
	}
	public void setCurlen(long newCurlen) {
		curlen = newCurlen;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
