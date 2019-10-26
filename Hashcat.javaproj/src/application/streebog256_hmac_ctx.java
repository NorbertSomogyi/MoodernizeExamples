package application;

public class streebog256_hmac_ctx {
	private streebog256_ctx ipad;
	private streebog256_ctx opad;
	
	public streebog256_hmac_ctx(streebog256_ctx ipad, streebog256_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public streebog256_hmac_ctx() {
	}
	
	public streebog256_ctx getIpad() {
		return ipad;
	}
	public void setIpad(streebog256_ctx newIpad) {
		ipad = newIpad;
	}
	public streebog256_ctx getOpad() {
		return opad;
	}
	public void setOpad(streebog256_ctx newOpad) {
		opad = newOpad;
	}
}
