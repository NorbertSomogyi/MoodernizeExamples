package application;

public class sha512_hmac_ctx {
	private sha512_ctx ipad;
	private sha512_ctx opad;
	
	public sha512_hmac_ctx(sha512_ctx ipad, sha512_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha512_hmac_ctx() {
	}
	
	public sha512_ctx getIpad() {
		return ipad;
	}
	public void setIpad(sha512_ctx newIpad) {
		ipad = newIpad;
	}
	public sha512_ctx getOpad() {
		return opad;
	}
	public void setOpad(sha512_ctx newOpad) {
		opad = newOpad;
	}
}
