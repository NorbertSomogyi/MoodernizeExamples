package application;

public class ripemd160_hmac_ctx_vector {
	private ripemd160_ctx_vector ipad;
	private ripemd160_ctx_vector opad;
	
	public ripemd160_hmac_ctx_vector(ripemd160_ctx_vector ipad, ripemd160_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public ripemd160_hmac_ctx_vector() {
	}
	
	public ripemd160_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(ripemd160_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public ripemd160_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(ripemd160_ctx_vector newOpad) {
		opad = newOpad;
	}
}
