package application;

public class android_backup {
	private Object version;
	private Object cipher;
	private Object iter;
	private Object[] user_salt;
	private Object[] ck_salt;
	private Object[] user_iv;
	private Object[] masterkey_blob;
	
	public android_backup(Object version, Object cipher, Object iter, Object[] user_salt, Object[] ck_salt, Object[] user_iv, Object[] masterkey_blob) {
		setVersion(version);
		setCipher(cipher);
		setIter(iter);
		setUser_salt(user_salt);
		setCk_salt(ck_salt);
		setUser_iv(user_iv);
		setMasterkey_blob(masterkey_blob);
	}
	public android_backup() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getCipher() {
		return cipher;
	}
	public void setCipher(Object newCipher) {
		cipher = newCipher;
	}
	public Object getIter() {
		return iter;
	}
	public void setIter(Object newIter) {
		iter = newIter;
	}
	public Object[] getUser_salt() {
		return user_salt;
	}
	public void setUser_salt(Object[] newUser_salt) {
		user_salt = newUser_salt;
	}
	public Object[] getCk_salt() {
		return ck_salt;
	}
	public void setCk_salt(Object[] newCk_salt) {
		ck_salt = newCk_salt;
	}
	public Object[] getUser_iv() {
		return user_iv;
	}
	public void setUser_iv(Object[] newUser_iv) {
		user_iv = newUser_iv;
	}
	public Object[] getMasterkey_blob() {
		return masterkey_blob;
	}
	public void setMasterkey_blob(Object[] newMasterkey_blob) {
		masterkey_blob = newMasterkey_blob;
	}
}
