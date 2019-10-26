package application;

public class sha384_hmac_ctx_vector {
	private sha384_ctx_vector ipad;
	private sha384_ctx_vector opad;
	
	public sha384_hmac_ctx_vector(sha384_ctx_vector ipad, sha384_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha384_hmac_ctx_vector() {
	}
	
	public sha384_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(sha384_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public sha384_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(sha384_ctx_vector newOpad) {
		opad = newOpad;
	}
}
