package application;

public class sha1_hmac_ctx_vector {
	private sha1_ctx_vector ipad;
	private sha1_ctx_vector opad;
	
	public sha1_hmac_ctx_vector(sha1_ctx_vector ipad, sha1_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha1_hmac_ctx_vector() {
	}
	
	public sha1_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(sha1_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public sha1_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(sha1_ctx_vector newOpad) {
		opad = newOpad;
	}
}
