package application;

public class sha256_hmac_ctx {
	private sha256_ctx ipad;
	private sha256_ctx opad;
	
	public sha256_hmac_ctx(sha256_ctx ipad, sha256_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha256_hmac_ctx() {
	}
	
	public sha256_ctx getIpad() {
		return ipad;
	}
	public void setIpad(sha256_ctx newIpad) {
		ipad = newIpad;
	}
	public sha256_ctx getOpad() {
		return opad;
	}
	public void setOpad(sha256_ctx newOpad) {
		opad = newOpad;
	}
}
