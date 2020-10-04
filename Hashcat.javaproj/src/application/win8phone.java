package application;

public class win8phone {
	private Object[] salt_buf;
	
	public win8phone(Object[] salt_buf) {
		setSalt_buf(salt_buf);
	}
	public win8phone() {
	}
	
	public Object[] getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object[] newSalt_buf) {
		salt_buf = newSalt_buf;
	}
}
