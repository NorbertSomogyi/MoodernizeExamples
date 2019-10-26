package application;

public class pw_idx {
	private Object off;
	private Object cnt;
	private Object len;
	
	public pw_idx(Object off, Object cnt, Object len) {
		setOff(off);
		setCnt(cnt);
		setLen(len);
	}
	public pw_idx() {
	}
	
	public Object getOff() {
		return off;
	}
	public void setOff(Object newOff) {
		off = newOff;
	}
	public Object getCnt() {
		return cnt;
	}
	public void setCnt(Object newCnt) {
		cnt = newCnt;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
