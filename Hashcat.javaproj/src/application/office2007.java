package application;

public class office2007 {
	private Object[] encryptedVerifier;
	private Object[] encryptedVerifierHash;
	private Object keySize;
	
	public office2007(Object[] encryptedVerifier, Object[] encryptedVerifierHash, Object keySize) {
		setEncryptedVerifier(encryptedVerifier);
		setEncryptedVerifierHash(encryptedVerifierHash);
		setKeySize(keySize);
	}
	public office2007() {
	}
	
	public Object[] getEncryptedVerifier() {
		return encryptedVerifier;
	}
	public void setEncryptedVerifier(Object[] newEncryptedVerifier) {
		encryptedVerifier = newEncryptedVerifier;
	}
	public Object[] getEncryptedVerifierHash() {
		return encryptedVerifierHash;
	}
	public void setEncryptedVerifierHash(Object[] newEncryptedVerifierHash) {
		encryptedVerifierHash = newEncryptedVerifierHash;
	}
	public Object getKeySize() {
		return keySize;
	}
	public void setKeySize(Object newKeySize) {
		keySize = newKeySize;
	}
}
