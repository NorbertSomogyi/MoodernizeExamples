package application;

public class sha1_double_salt {
	private Object[] salt1_buf;
	private int salt1_len;
	private Object[] salt2_buf;
	private int salt2_len;
	
	public sha1_double_salt(Object[] salt1_buf, int salt1_len, Object[] salt2_buf, int salt2_len) {
		setSalt1_buf(salt1_buf);
		setSalt1_len(salt1_len);
		setSalt2_buf(salt2_buf);
		setSalt2_len(salt2_len);
	}
	public sha1_double_salt() {
	}
	
	public Object[] getSalt1_buf() {
		return salt1_buf;
	}
	public void setSalt1_buf(Object[] newSalt1_buf) {
		salt1_buf = newSalt1_buf;
	}
	public int getSalt1_len() {
		return salt1_len;
	}
	public void setSalt1_len(int newSalt1_len) {
		salt1_len = newSalt1_len;
	}
	public Object[] getSalt2_buf() {
		return salt2_buf;
	}
	public void setSalt2_buf(Object[] newSalt2_buf) {
		salt2_buf = newSalt2_buf;
	}
	public int getSalt2_len() {
		return salt2_len;
	}
	public void setSalt2_len(int newSalt2_len) {
		salt2_len = newSalt2_len;
	}
}
