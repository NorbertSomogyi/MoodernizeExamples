package application;

public class electrum_wallet {
	private Object salt_type;
	private Object iv;
	private Object encrypted;
	
	public electrum_wallet(Object salt_type, Object iv, Object encrypted) {
		setSalt_type(salt_type);
		setIv(iv);
		setEncrypted(encrypted);
	}
	public electrum_wallet() {
	}
	
	public Object getSalt_type() {
		return salt_type;
	}
	public void setSalt_type(Object newSalt_type) {
		salt_type = newSalt_type;
	}
	public Object getIv() {
		return iv;
	}
	public void setIv(Object newIv) {
		iv = newIv;
	}
	public Object getEncrypted() {
		return encrypted;
	}
	public void setEncrypted(Object newEncrypted) {
		encrypted = newEncrypted;
	}
}
