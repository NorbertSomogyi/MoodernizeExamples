package application;

public class rakp {
	private Object[] salt_buf;
	private Object salt_len;
	
	public rakp(Object[] salt_buf, Object salt_len) {
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
	}
	public rakp() {
	}
	
	public Object[] getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object[] newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(Object newSalt_len) {
		salt_len = newSalt_len;
	}
}
