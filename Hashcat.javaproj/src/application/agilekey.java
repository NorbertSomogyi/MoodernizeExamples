package application;

public class agilekey {
	private Object[] cipher;
	
	public agilekey(Object[] cipher) {
		setCipher(cipher);
	}
	public agilekey() {
	}
	
	public Object[] getCipher() {
		return cipher;
	}
	public void setCipher(Object[] newCipher) {
		cipher = newCipher;
	}
}
