package application;

public class sha1_hmac_ctx {
	private sha1_ctx ipad;
	private sha1_ctx opad;
	
	public sha1_hmac_ctx(sha1_ctx ipad, sha1_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha1_hmac_ctx() {
	}
	
	public sha1_ctx getIpad() {
		return ipad;
	}
	public void setIpad(sha1_ctx newIpad) {
		ipad = newIpad;
	}
	public sha1_ctx getOpad() {
		return opad;
	}
	public void setOpad(sha1_ctx newOpad) {
		opad = newOpad;
	}
}
