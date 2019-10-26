package application;

public class sha224_hmac_ctx {
	private sha224_ctx ipad;
	private sha224_ctx opad;
	
	public sha224_hmac_ctx(sha224_ctx ipad, sha224_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha224_hmac_ctx() {
	}
	
	public sha224_ctx getIpad() {
		return ipad;
	}
	public void setIpad(sha224_ctx newIpad) {
		ipad = newIpad;
	}
	public sha224_ctx getOpad() {
		return opad;
	}
	public void setOpad(sha224_ctx newOpad) {
		opad = newOpad;
	}
}
