package application;

public class sip {
	private Object[] salt_buf;
	private Object salt_len;
	private Object[] esalt_buf;
	private Object esalt_len;
	
	public sip(Object[] salt_buf, Object salt_len, Object[] esalt_buf, Object esalt_len) {
		setSalt_buf(salt_buf);
		setSalt_len(salt_len);
		setEsalt_buf(esalt_buf);
		setEsalt_len(esalt_len);
	}
	public sip() {
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
	public Object[] getEsalt_buf() {
		return esalt_buf;
	}
	public void setEsalt_buf(Object[] newEsalt_buf) {
		esalt_buf = newEsalt_buf;
	}
	public Object getEsalt_len() {
		return esalt_len;
	}
	public void setEsalt_len(Object newEsalt_len) {
		esalt_len = newEsalt_len;
	}
}
