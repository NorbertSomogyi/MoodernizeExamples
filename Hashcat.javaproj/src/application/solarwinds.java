package application;

public class solarwinds {
	private Object salt_buf;
	
	public solarwinds(Object salt_buf) {
		setSalt_buf(salt_buf);
	}
	public solarwinds() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
}
