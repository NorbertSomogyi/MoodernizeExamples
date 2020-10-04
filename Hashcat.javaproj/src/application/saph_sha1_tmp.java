package application;

public class saph_sha1_tmp {
	private Object[] digest_buf;
	
	public saph_sha1_tmp(Object[] digest_buf) {
		setDigest_buf(digest_buf);
	}
	public saph_sha1_tmp() {
	}
	
	public Object[] getDigest_buf() {
		return digest_buf;
	}
	public void setDigest_buf(Object[] newDigest_buf) {
		digest_buf = newDigest_buf;
	}
}
