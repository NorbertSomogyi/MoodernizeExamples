package application;

public class krb5tgs_18_tmp {
	private Object ipad;
	private Object opad;
	private Object dgst;
	private Object out;
	
	public krb5tgs_18_tmp(Object ipad, Object opad, Object dgst, Object out) {
		setIpad(ipad);
		setOpad(opad);
		setDgst(dgst);
		setOut(out);
	}
	public krb5tgs_18_tmp() {
	}
	
	public Object getIpad() {
		return ipad;
	}
	public void setIpad(Object newIpad) {
		ipad = newIpad;
	}
	public Object getOpad() {
		return opad;
	}
	public void setOpad(Object newOpad) {
		opad = newOpad;
	}
	public Object getDgst() {
		return dgst;
	}
	public void setDgst(Object newDgst) {
		dgst = newDgst;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
}
