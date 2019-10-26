package application;

public class qnx_sha512_tmp {
	private sha512_ctx sha512_ctx;
	private Object sav;
	
	public qnx_sha512_tmp(sha512_ctx sha512_ctx, Object sav) {
		setSha512_ctx(sha512_ctx);
		setSav(sav);
	}
	public qnx_sha512_tmp() {
	}
	
	public sha512_ctx getSha512_ctx() {
		return sha512_ctx;
	}
	public void setSha512_ctx(sha512_ctx newSha512_ctx) {
		sha512_ctx = newSha512_ctx;
	}
	public Object getSav() {
		return sav;
	}
	public void setSav(Object newSav) {
		sav = newSav;
	}
}
