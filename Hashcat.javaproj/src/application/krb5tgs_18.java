package application;

public class krb5tgs_18 {
	private Object user;
	private Object domain;
	private Object account_info;
	private Object account_info_len;
	private Object checksum;
	private Object edata2;
	private Object edata2_len;
	
	public krb5tgs_18(Object user, Object domain, Object account_info, Object account_info_len, Object checksum, Object edata2, Object edata2_len) {
		setUser(user);
		setDomain(domain);
		setAccount_info(account_info);
		setAccount_info_len(account_info_len);
		setChecksum(checksum);
		setEdata2(edata2);
		setEdata2_len(edata2_len);
	}
	public krb5tgs_18() {
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
	public Object getEdata2() {
		return edata2;
	}
	public void setEdata2(Object newEdata2) {
		edata2 = newEdata2;
	}
	public Object getEdata2_len() {
		return edata2_len;
	}
	public void setEdata2_len(Object newEdata2_len) {
		edata2_len = newEdata2_len;
	}
}
