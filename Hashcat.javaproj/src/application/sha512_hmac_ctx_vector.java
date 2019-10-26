package application;

public class sha512_hmac_ctx_vector {
	private sha512_ctx_vector ipad;
	private sha512_ctx_vector opad;
	
	public sha512_hmac_ctx_vector(sha512_ctx_vector ipad, sha512_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha512_hmac_ctx_vector() {
	}
	
	public sha512_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(sha512_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public sha512_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(sha512_ctx_vector newOpad) {
		opad = newOpad;
	}
}
