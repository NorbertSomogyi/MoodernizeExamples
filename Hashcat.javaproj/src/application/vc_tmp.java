package application;

public class vc_tmp {
	private Object ipad;
	private Object opad;
	private Object dgst;
	private Object out;
	private Object pim_key;
	private int pim;
	
	public vc_tmp(Object ipad, Object opad, Object dgst, Object out, Object pim_key, int pim) {
		setIpad(ipad);
		setOpad(opad);
		setDgst(dgst);
		setOut(out);
		setPim_key(pim_key);
		setPim(pim);
	}
	public vc_tmp() {
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
	public Object getPim_key() {
		return pim_key;
	}
	public void setPim_key(Object newPim_key) {
		pim_key = newPim_key;
	}
	public int getPim() {
		return pim;
	}
	public void setPim(int newPim) {
		pim = newPim;
	}
}
