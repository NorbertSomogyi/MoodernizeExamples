package application;

public class bitcoin_wallet {
	private Object[] cry_master_buf;
	private Object cry_master_len;
	
	public bitcoin_wallet(Object[] cry_master_buf, Object cry_master_len) {
		setCry_master_buf(cry_master_buf);
		setCry_master_len(cry_master_len);
	}
	public bitcoin_wallet() {
	}
	
	public Object[] getCry_master_buf() {
		return cry_master_buf;
	}
	public void setCry_master_buf(Object[] newCry_master_buf) {
		cry_master_buf = newCry_master_buf;
	}
	public Object getCry_master_len() {
		return cry_master_len;
	}
	public void setCry_master_len(Object newCry_master_len) {
		cry_master_len = newCry_master_len;
	}
}
