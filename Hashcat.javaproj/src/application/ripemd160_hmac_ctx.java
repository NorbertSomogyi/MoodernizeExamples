package application;

public class ripemd160_hmac_ctx {
	private ripemd160_ctx ipad;
	private ripemd160_ctx opad;
	
	public ripemd160_hmac_ctx(ripemd160_ctx ipad, ripemd160_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public ripemd160_hmac_ctx() {
	}
	
	public ripemd160_ctx getIpad() {
		return ipad;
	}
	public void setIpad(ripemd160_ctx newIpad) {
		ipad = newIpad;
	}
	public ripemd160_ctx getOpad() {
		return opad;
	}
	public void setOpad(ripemd160_ctx newOpad) {
		opad = newOpad;
	}
}
