package application;

public class luks_tmp {
	private Object[] ipad32;
	private Object[] ipad64;
	private Object[] opad32;
	private Object[] opad64;
	private Object[] dgst32;
	private Object[] dgst64;
	private Object[] out32;
	private Object[] out64;
	
	public luks_tmp(Object[] ipad32, Object[] ipad64, Object[] opad32, Object[] opad64, Object[] dgst32, Object[] dgst64, Object[] out32, Object[] out64) {
		setIpad32(ipad32);
		setIpad64(ipad64);
		setOpad32(opad32);
		setOpad64(opad64);
		setDgst32(dgst32);
		setDgst64(dgst64);
		setOut32(out32);
		setOut64(out64);
	}
	public luks_tmp() {
	}
	
	public Object[] getIpad32() {
		return ipad32;
	}
	public void setIpad32(Object[] newIpad32) {
		ipad32 = newIpad32;
	}
	public Object[] getIpad64() {
		return ipad64;
	}
	public void setIpad64(Object[] newIpad64) {
		ipad64 = newIpad64;
	}
	public Object[] getOpad32() {
		return opad32;
	}
	public void setOpad32(Object[] newOpad32) {
		opad32 = newOpad32;
	}
	public Object[] getOpad64() {
		return opad64;
	}
	public void setOpad64(Object[] newOpad64) {
		opad64 = newOpad64;
	}
	public Object[] getDgst32() {
		return dgst32;
	}
	public void setDgst32(Object[] newDgst32) {
		dgst32 = newDgst32;
	}
	public Object[] getDgst64() {
		return dgst64;
	}
	public void setDgst64(Object[] newDgst64) {
		dgst64 = newDgst64;
	}
	public Object[] getOut32() {
		return out32;
	}
	public void setOut32(Object[] newOut32) {
		out32 = newOut32;
	}
	public Object[] getOut64() {
		return out64;
	}
	public void setOut64(Object[] newOut64) {
		out64 = newOut64;
	}
}
