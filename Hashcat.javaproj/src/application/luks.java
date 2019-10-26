package application;

public class luks {
	private int hash_type;
	private int key_size;
	private int cipher_type;
	private int cipher_mode;
	private Object ct_buf;
	private Object af_src_buf;
	
	public luks(int hash_type, int key_size, int cipher_type, int cipher_mode, Object ct_buf, Object af_src_buf) {
		setHash_type(hash_type);
		setKey_size(key_size);
		setCipher_type(cipher_type);
		setCipher_mode(cipher_mode);
		setCt_buf(ct_buf);
		setAf_src_buf(af_src_buf);
	}
	public luks() {
	}
	
	public int getHash_type() {
		return hash_type;
	}
	public void setHash_type(int newHash_type) {
		hash_type = newHash_type;
	}
	public int getKey_size() {
		return key_size;
	}
	public void setKey_size(int newKey_size) {
		key_size = newKey_size;
	}
	public int getCipher_type() {
		return cipher_type;
	}
	public void setCipher_type(int newCipher_type) {
		cipher_type = newCipher_type;
	}
	public int getCipher_mode() {
		return cipher_mode;
	}
	public void setCipher_mode(int newCipher_mode) {
		cipher_mode = newCipher_mode;
	}
	public Object getCt_buf() {
		return ct_buf;
	}
	public void setCt_buf(Object newCt_buf) {
		ct_buf = newCt_buf;
	}
	public Object getAf_src_buf() {
		return af_src_buf;
	}
	public void setAf_src_buf(Object newAf_src_buf) {
		af_src_buf = newAf_src_buf;
	}
}
