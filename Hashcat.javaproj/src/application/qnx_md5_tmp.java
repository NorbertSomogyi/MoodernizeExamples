package application;

public class qnx_md5_tmp {
	private md5_ctx md5_ctx;
	
	public qnx_md5_tmp(md5_ctx md5_ctx) {
		setMd5_ctx(md5_ctx);
	}
	public qnx_md5_tmp() {
	}
	
	public md5_ctx getMd5_ctx() {
		return md5_ctx;
	}
	public void setMd5_ctx(md5_ctx newMd5_ctx) {
		md5_ctx = newMd5_ctx;
	}
}
