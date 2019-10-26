package application;

public class whirlpool_hmac_ctx_vector {
	private whirlpool_ctx_vector ipad;
	private whirlpool_ctx_vector opad;
	
	public whirlpool_hmac_ctx_vector(whirlpool_ctx_vector ipad, whirlpool_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public whirlpool_hmac_ctx_vector() {
	}
	
	public whirlpool_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(whirlpool_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public whirlpool_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(whirlpool_ctx_vector newOpad) {
		opad = newOpad;
	}
}
