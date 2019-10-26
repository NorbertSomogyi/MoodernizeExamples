package application;

public class streebog512_hmac_ctx {
	private streebog512_ctx ipad;
	private streebog512_ctx opad;
	
	public streebog512_hmac_ctx(streebog512_ctx ipad, streebog512_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public streebog512_hmac_ctx() {
	}
	
	public streebog512_ctx getIpad() {
		return ipad;
	}
	public void setIpad(streebog512_ctx newIpad) {
		ipad = newIpad;
	}
	public streebog512_ctx getOpad() {
		return opad;
	}
	public void setOpad(streebog512_ctx newOpad) {
		opad = newOpad;
	}
}
