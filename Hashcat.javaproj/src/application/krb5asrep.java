package application;

public class krb5asrep {
	private Object[] account_info;
	private Object[] checksum;
	private Object[] edata2;
	private Object edata2_len;
	
	public krb5asrep(Object[] account_info, Object[] checksum, Object[] edata2, Object edata2_len) {
		setAccount_info(account_info);
		setChecksum(checksum);
		setEdata2(edata2);
		setEdata2_len(edata2_len);
	}
	public krb5asrep() {
	}
	
	public Object[] getAccount_info() {
		return account_info;
	}
	public void setAccount_info(Object[] newAccount_info) {
		account_info = newAccount_info;
	}
	public Object[] getChecksum() {
		return checksum;
	}
	public void setChecksum(Object[] newChecksum) {
		checksum = newChecksum;
	}
	public Object[] getEdata2() {
		return edata2;
	}
	public void setEdata2(Object[] newEdata2) {
		edata2 = newEdata2;
	}
	public Object getEdata2_len() {
		return edata2_len;
	}
	public void setEdata2_len(Object newEdata2_len) {
		edata2_len = newEdata2_len;
	}
}
