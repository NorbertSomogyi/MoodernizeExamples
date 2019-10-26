package application;

public class pbkdf2_sha1 {
	private Object salt_buf;
	
	public pbkdf2_sha1(Object salt_buf) {
		setSalt_buf(salt_buf);
	}
	public pbkdf2_sha1() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
}
