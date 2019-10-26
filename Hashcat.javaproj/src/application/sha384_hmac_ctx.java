package application;

public class sha384_hmac_ctx {
	private sha384_ctx ipad;
	private sha384_ctx opad;
	
	public sha384_hmac_ctx(sha384_ctx ipad, sha384_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha384_hmac_ctx() {
	}
	
	public sha384_ctx getIpad() {
		return ipad;
	}
	public void setIpad(sha384_ctx newIpad) {
		ipad = newIpad;
	}
	public sha384_ctx getOpad() {
		return opad;
	}
	public void setOpad(sha384_ctx newOpad) {
		opad = newOpad;
	}
}
