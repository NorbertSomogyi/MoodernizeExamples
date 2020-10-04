package application;

public class vc64_sbog_tmp {
	private Object[] ipad_raw;
	private Object[] opad_raw;
	private Object[] ipad_hash;
	private Object[] opad_hash;
	private Object[] dgst;
	private Object[] out;
	private Object[] pim_key;
	private int pim;
	
	public vc64_sbog_tmp(Object[] ipad_raw, Object[] opad_raw, Object[] ipad_hash, Object[] opad_hash, Object[] dgst, Object[] out, Object[] pim_key, int pim) {
		setIpad_raw(ipad_raw);
		setOpad_raw(opad_raw);
		setIpad_hash(ipad_hash);
		setOpad_hash(opad_hash);
		setDgst(dgst);
		setOut(out);
		setPim_key(pim_key);
		setPim(pim);
	}
	public vc64_sbog_tmp() {
	}
	
	public Object[] getIpad_raw() {
		return ipad_raw;
	}
	public void setIpad_raw(Object[] newIpad_raw) {
		ipad_raw = newIpad_raw;
	}
	public Object[] getOpad_raw() {
		return opad_raw;
	}
	public void setOpad_raw(Object[] newOpad_raw) {
		opad_raw = newOpad_raw;
	}
	public Object[] getIpad_hash() {
		return ipad_hash;
	}
	public void setIpad_hash(Object[] newIpad_hash) {
		ipad_hash = newIpad_hash;
	}
	public Object[] getOpad_hash() {
		return opad_hash;
	}
	public void setOpad_hash(Object[] newOpad_hash) {
		opad_hash = newOpad_hash;
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
	public Object[] getPim_key() {
		return pim_key;
	}
	public void setPim_key(Object[] newPim_key) {
		pim_key = newPim_key;
	}
	public int getPim() {
		return pim;
	}
	public void setPim(int newPim) {
		pim = newPim;
	}
}
