package application;

public class qnx_sha256_tmp {
	private sha256_ctx sha256_ctx;
	
	public qnx_sha256_tmp(sha256_ctx sha256_ctx) {
		setSha256_ctx(sha256_ctx);
	}
	public qnx_sha256_tmp() {
	}
	
	public sha256_ctx getSha256_ctx() {
		return sha256_ctx;
	}
	public void setSha256_ctx(sha256_ctx newSha256_ctx) {
		sha256_ctx = newSha256_ctx;
	}
}
