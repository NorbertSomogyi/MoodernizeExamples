package application;

public class ethereum_pbkdf2 {
	private Object salt_buf;
	private Object ciphertext;
	
	public ethereum_pbkdf2(Object salt_buf, Object ciphertext) {
		setSalt_buf(salt_buf);
		setCiphertext(ciphertext);
	}
	public ethereum_pbkdf2() {
	}
	
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getCiphertext() {
		return ciphertext;
	}
	public void setCiphertext(Object newCiphertext) {
		ciphertext = newCiphertext;
	}
}
