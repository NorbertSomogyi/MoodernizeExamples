package application;

public class sha224_hmac_ctx_vector {
	private sha224_ctx_vector ipad;
	private sha224_ctx_vector opad;
	
	public sha224_hmac_ctx_vector(sha224_ctx_vector ipad, sha224_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public sha224_hmac_ctx_vector() {
	}
	
	public sha224_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(sha224_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public sha224_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(sha224_ctx_vector newOpad) {
		opad = newOpad;
	}
}
