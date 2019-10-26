package application;

public class diskcryptor_esalt {
	private Object salt_buf;
	
	public diskcryptor_esalt(Object salt_buf) {
		setSalt_buf(salt_buf);
	}
	public diskcryptor_esalt() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
}
