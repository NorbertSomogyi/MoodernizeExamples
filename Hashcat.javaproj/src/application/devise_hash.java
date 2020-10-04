package application;

public class devise_hash {
	private Object[] salt_buf;
	private int salt_len;
	private Object[] site_key_buf;
	private int site_key_len;
	
	public devise_hash(Object[] salt_buf, int salt_len, Object[] site_key_buf, int site_key_len) {
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
		setSite_key_buf(site_key_buf);
		setSite_key_len(site_key_len);
	}
	public devise_hash() {
	}
	
	public Object[] getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object[] newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public int getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(int newSalt_len) {
		salt_len = newSalt_len;
	}
	public Object[] getSite_key_buf() {
		return site_key_buf;
	}
	public void setSite_key_buf(Object[] newSite_key_buf) {
		site_key_buf = newSite_key_buf;
	}
	public int getSite_key_len() {
		return site_key_len;
	}
	public void setSite_key_len(int newSite_key_len) {
		site_key_len = newSite_key_len;
	}
}
