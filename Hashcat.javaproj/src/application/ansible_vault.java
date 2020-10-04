package application;

public class ansible_vault {
	private Object cipher;
	private Object version;
	private Object[] ct_data_buf;
	private Object ct_data_len;
	
	public ansible_vault(Object cipher, Object version, Object[] ct_data_buf, Object ct_data_len) {
		setCipher(cipher);
		setVersion(version);
		setCt_data_buf(ct_data_buf);
		setCt_data_len(ct_data_len);
	}
	public ansible_vault() {
	}
	
	public Object getCipher() {
		return cipher;
	}
	public void setCipher(Object newCipher) {
		cipher = newCipher;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object[] getCt_data_buf() {
		return ct_data_buf;
	}
	public void setCt_data_buf(Object[] newCt_data_buf) {
		ct_data_buf = newCt_data_buf;
	}
	public Object getCt_data_len() {
		return ct_data_len;
	}
	public void setCt_data_len(Object newCt_data_len) {
		ct_data_len = newCt_data_len;
	}
}
