package application;

public class krb5pa_17 {
	private Object user;
	private Object domain;
	private Object account_info;
	private Object account_info_len;
	private Object checksum;
	private Object enc_timestamp;
	private Object enc_timestamp_len;
	
	public krb5pa_17(Object user, Object domain, Object account_info, Object account_info_len, Object checksum, Object enc_timestamp, Object enc_timestamp_len) {
		setUser(user);
		setDomain(domain);
		setAccount_info(account_info);
		setAccount_info_len(account_info_len);
		setChecksum(checksum);
		setEnc_timestamp(enc_timestamp);
		setEnc_timestamp_len(enc_timestamp_len);
	}
	public krb5pa_17() {
	}
	
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getDomain() {
		return domain;
	}
	public void setDomain(Object newDomain) {
		domain = newDomain;
	}
	public Object getAccount_info() {
		return account_info;
	}
	public void setAccount_info(Object newAccount_info) {
		account_info = newAccount_info;
	}
	public Object getAccount_info_len() {
		return account_info_len;
	}
	public void setAccount_info_len(Object newAccount_info_len) {
		account_info_len = newAccount_info_len;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
	public Object getEnc_timestamp() {
		return enc_timestamp;
	}
	public void setEnc_timestamp(Object newEnc_timestamp) {
		enc_timestamp = newEnc_timestamp;
	}
	public Object getEnc_timestamp_len() {
		return enc_timestamp_len;
	}
	public void setEnc_timestamp_len(Object newEnc_timestamp_len) {
		enc_timestamp_len = newEnc_timestamp_len;
	}
}
