package application;

public class androidpin_tmp {
	private Object[] digest_buf;
	
	public androidpin_tmp(Object[] digest_buf) {
		setDigest_buf(digest_buf);
	}
	public androidpin_tmp() {
	}
	
	public Object[] getDigest_buf() {
		return digest_buf;
	}
	public void setDigest_buf(Object[] newDigest_buf) {
		digest_buf = newDigest_buf;
	}
}
