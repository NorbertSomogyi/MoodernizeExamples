package application;

public class whirlpool_hmac_ctx {
	private whirlpool_ctx ipad;
	private whirlpool_ctx opad;
	
	public whirlpool_hmac_ctx(whirlpool_ctx ipad, whirlpool_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public whirlpool_hmac_ctx() {
	}
	
	public whirlpool_ctx getIpad() {
		return ipad;
	}
	public void setIpad(whirlpool_ctx newIpad) {
		ipad = newIpad;
	}
	public whirlpool_ctx getOpad() {
		return opad;
	}
	public void setOpad(whirlpool_ctx newOpad) {
		opad = newOpad;
	}
}
