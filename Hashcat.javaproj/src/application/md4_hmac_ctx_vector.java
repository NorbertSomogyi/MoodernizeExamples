package application;

public class md4_hmac_ctx_vector {
	private md4_ctx_vector ipad;
	private md4_ctx_vector opad;
	
	public md4_hmac_ctx_vector(md4_ctx_vector ipad, md4_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public md4_hmac_ctx_vector() {
	}
	
	public md4_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(md4_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public md4_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(md4_ctx_vector newOpad) {
		opad = newOpad;
	}
}
