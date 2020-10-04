package application;

public class pwsafe3_tmp {
	private Object[] digest_buf;
	
	public pwsafe3_tmp(Object[] digest_buf) {
		setDigest_buf(digest_buf);
	}
	public pwsafe3_tmp() {
	}
	
	public Object[] getDigest_buf() {
		return digest_buf;
	}
	public void setDigest_buf(Object[] newDigest_buf) {
		digest_buf = newDigest_buf;
	}
}
