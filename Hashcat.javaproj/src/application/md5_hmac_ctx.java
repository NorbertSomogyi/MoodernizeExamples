package application;

public class md5_hmac_ctx {
	private md5_ctx ipad;
	private md5_ctx opad;
	
	public md5_hmac_ctx(md5_ctx ipad, md5_ctx opad) {
		setIpad(ipad);
		setOpad(opad);
	}
	public md5_hmac_ctx() {
	}
	
	public md5_ctx getIpad() {
		return ipad;
	}
	public void setIpad(md5_ctx newIpad) {
		ipad = newIpad;
	}
	public md5_ctx getOpad() {
		return opad;
	}
	public void setOpad(md5_ctx newOpad) {
		opad = newOpad;
	}
}
