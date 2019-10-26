package application;

public class md5_hmac_ctx_vector {
	private md5_ctx_vector ipad;
	private md5_ctx_vector opad;
	
	public md5_hmac_ctx_vector(md5_ctx_vector ipad, md5_ctx_vector opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public md5_hmac_ctx_vector() {
	}
	
	public md5_ctx_vector getIpad() {
		return ipad;
	}
	public void setIpad(md5_ctx_vector newIpad) {
		ipad = newIpad;
	}
	public md5_ctx_vector getOpad() {
		return opad;
	}
	public void setOpad(md5_ctx_vector newOpad) {
		opad = newOpad;
	}
}
