package application;

public class streebog256_hmac_ctx_vector {
	private streebog256_ctx_vector ipad;
	private streebog256_ctx_vector opad;
	
	public streebog256_hmac_ctx_vector(streebog256_ctx_vector ipad, streebog256_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public streebog256_hmac_ctx_vector() {
	}
	
	public streebog256_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(streebog256_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public streebog256_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(streebog256_ctx_vector newOpad) {
		opad = newOpad;
	}
}
