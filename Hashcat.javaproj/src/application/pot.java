package application;

public class pot {
	private Object[] plain_buf;
	private int plain_len;
	private hash hash;
	
	public pot(Object[] plain_buf, int plain_len, hash hash) {
		setPlain_buf(plain_buf);
		setPlain_len(plain_len);
		setHash(hash);
	}
	public pot() {
	}
	
	public Object[] getPlain_buf() {
		return plain_buf;
	}
	public void setPlain_buf(Object[] newPlain_buf) {
		plain_buf = newPlain_buf;
	}
	public int getPlain_len() {
		return plain_len;
	}
	public void setPlain_len(int newPlain_len) {
		plain_len = newPlain_len;
	}
	public hash getHash() {
		return hash;
	}
	public void setHash(hash newHash) {
		hash = newHash;
	}
}
