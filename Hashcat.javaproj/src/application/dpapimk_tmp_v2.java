package application;

public class dpapimk_tmp_v2 {
	private Object ipad64;
	private Object opad64;
	private Object dgst64;
	private Object out64;
	private Object userKey;
	
	public dpapimk_tmp_v2(Object ipad64, Object opad64, Object dgst64, Object out64, Object userKey) {
		setIpad64(ipad64);
		setOpad64(opad64);
		setDgst64(dgst64);
		setOut64(out64);
		setUserKey(userKey);
	}
	public dpapimk_tmp_v2() {
	}
	
	public Object getIpad64() {
		return ipad64;
	}
	public void setIpad64(Object newIpad64) {
		ipad64 = newIpad64;
	}
	public Object getOpad64() {
		return opad64;
	}
	public void setOpad64(Object newOpad64) {
		opad64 = newOpad64;
	}
	public Object getDgst64() {
		return dgst64;
	}
	public void setDgst64(Object newDgst64) {
		dgst64 = newDgst64;
	}
	public Object getOut64() {
		return out64;
	}
	public void setOut64(Object newOut64) {
		out64 = newOut64;
	}
	public Object getUserKey() {
		return userKey;
	}
	public void setUserKey(Object newUserKey) {
		userKey = newUserKey;
	}
}
