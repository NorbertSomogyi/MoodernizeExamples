package application;

public class sha256crypt_tmp {
	private Object[] alt_result;
	private Object[] p_bytes;
	private Object[] s_bytes;
	
	public sha256crypt_tmp(Object[] alt_result, Object[] p_bytes, Object[] s_bytes) {
		setAlt_result(alt_result);
		setP_bytes(p_bytes);
		setS_bytes(s_bytes);
	}
	public sha256crypt_tmp() {
	}
	
	public Object[] getAlt_result() {
		return alt_result;
	}
	public void setAlt_result(Object[] newAlt_result) {
		alt_result = newAlt_result;
	}
	public Object[] getP_bytes() {
		return p_bytes;
	}
	public void setP_bytes(Object[] newP_bytes) {
		p_bytes = newP_bytes;
	}
	public Object[] getS_bytes() {
		return s_bytes;
	}
	public void setS_bytes(Object[] newS_bytes) {
		s_bytes = newS_bytes;
	}
}
