package application;

public class md4_hmac_ctx {
	private md4_ctx ipad;
	private md4_ctx opad;
	
	public md4_hmac_ctx(md4_ctx ipad, md4_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public md4_hmac_ctx() {
	}
	
	public md4_ctx getIpad() {
		return ipad;
	}
	public void setIpad(md4_ctx newIpad) {
		ipad = newIpad;
	}
	public md4_ctx getOpad() {
		return opad;
	}
	public void setOpad(md4_ctx newOpad) {
		opad = newOpad;
	}
}
