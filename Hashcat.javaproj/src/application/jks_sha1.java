package application;

public class jks_sha1 {
	private Object[] checksum;
	private Object[] iv;
	private Object[] enc_key_buf;
	private Object enc_key_len;
	private Object[] der;
	private Object[] alias;
	
	public jks_sha1(Object[] checksum, Object[] iv, Object[] enc_key_buf, Object enc_key_len, Object[] der, Object[] alias) {
		setChecksum(checksum);
		setIv(iv);
		setEnc_key_buf(enc_key_buf);
		setEnc_key_len(enc_key_len);
		setDer(der);
		setAlias(alias);
	}
	public jks_sha1() {
	}
	
	public Object[] getChecksum() {
		return checksum;
	}
	public void setChecksum(Object[] newChecksum) {
		checksum = newChecksum;
	}
	public Object[] getIv() {
		return iv;
	}
	public void setIv(Object[] newIv) {
		iv = newIv;
	}
	public Object[] getEnc_key_buf() {
		return enc_key_buf;
	}
	public void setEnc_key_buf(Object[] newEnc_key_buf) {
		enc_key_buf = newEnc_key_buf;
	}
	public Object getEnc_key_len() {
		return enc_key_len;
	}
	public void setEnc_key_len(Object newEnc_key_len) {
		enc_key_len = newEnc_key_len;
	}
	public Object[] getDer() {
		return der;
	}
	public void setDer(Object[] newDer) {
		der = newDer;
	}
	public Object[] getAlias() {
		return alias;
	}
	public void setAlias(Object[] newAlias) {
		alias = newAlias;
	}
}
