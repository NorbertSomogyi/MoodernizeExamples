package application;

public class dpapimk_tmp_v1 {
	private Object[] ipad;
	private Object[] opad;
	private Object[] dgst;
	private Object[] out;
	private Object[] userKey;
	
	public dpapimk_tmp_v1(Object[] ipad, Object[] opad, Object[] dgst, Object[] out, Object[] userKey) {
		setIpad(ipad);
		setOpad(opad);
		setDgst(dgst);
		setOut(out);
		setUserKey(userKey);
	}
	public dpapimk_tmp_v1() {
	}
	
	public Object[] getIpad() {
		return ipad;
	}
	public void setIpad(Object[] newIpad) {
		ipad = newIpad;
	}
	public Object[] getOpad() {
		return opad;
	}
	public void setOpad(Object[] newOpad) {
		opad = newOpad;
	}
	public Object[] getDgst() {
		return dgst;
	}
	public void setDgst(Object[] newDgst) {
		dgst = newDgst;
	}
	public Object[] getOut() {
		return out;
	}
	public void setOut(Object[] newOut) {
		out = newOut;
	}
	public Object[] getUserKey() {
		return userKey;
	}
	public void setUserKey(Object[] newUserKey) {
		userKey = newUserKey;
	}
}
