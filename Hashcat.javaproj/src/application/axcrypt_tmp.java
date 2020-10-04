package application;

public class axcrypt_tmp {
	private Object[] KEK;
	private Object[] lsb;
	private Object[] cipher;
	
	public axcrypt_tmp(Object[] KEK, Object[] lsb, Object[] cipher) {
		setKEK(KEK);
		setLsb(lsb);
		setCipher(cipher);
	}
	public axcrypt_tmp() {
	}
	
	public Object[] getKEK() {
		return KEK;
	}
	public void setKEK(Object[] newKEK) {
		KEK = newKEK;
	}
	public Object[] getLsb() {
		return lsb;
	}
	public void setLsb(Object[] newLsb) {
		lsb = newLsb;
	}
	public Object[] getCipher() {
		return cipher;
	}
	public void setCipher(Object[] newCipher) {
		cipher = newCipher;
	}
}
