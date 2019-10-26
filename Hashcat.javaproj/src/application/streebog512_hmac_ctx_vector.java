package application;

public class streebog512_hmac_ctx_vector {
	private streebog512_ctx_vector ipad;
	private streebog512_ctx_vector opad;
	
	public streebog512_hmac_ctx_vector(streebog512_ctx_vector ipad, streebog512_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public streebog512_hmac_ctx_vector() {
	}
	
	public streebog512_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(streebog512_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public streebog512_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(streebog512_ctx_vector newOpad) {
		opad = newOpad;
	}
}
