package application;

public class sha256_hmac_ctx_vector {
	private sha256_ctx_vector ipad;
	private sha256_ctx_vector opad;
	
	public sha256_hmac_ctx_vector(sha256_ctx_vector ipad, sha256_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha256_hmac_ctx_vector() {
	}
	
	public sha256_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(sha256_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public sha256_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(sha256_ctx_vector newOpad) {
		opad = newOpad;
	}
}
