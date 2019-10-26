package application;

public class jwt {
	private Object salt_buf;
	private Object salt_len;
	private Object signature_len;
	
	public jwt(Object salt_buf, Object salt_len, Object signature_len) {
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
		setSignature_len(signature_len);
	}
	public jwt() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(Object newSalt_len) {
		salt_len = newSalt_len;
	}
	public Object getSignature_len() {
		return signature_len;
	}
	public void setSignature_len(Object newSignature_len) {
		signature_len = newSignature_len;
	}
}
