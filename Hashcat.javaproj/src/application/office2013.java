package application;

public class office2013 {
	private Object encryptedVerifier;
	private Object encryptedVerifierHash;
	
	public office2013(Object encryptedVerifier, Object encryptedVerifierHash) {
		setEncryptedVerifier(encryptedVerifier);
		setEncryptedVerifierHash(encryptedVerifierHash);
	}
	public office2013() {
	}
	
	public Object getEncryptedVerifier() {
		return encryptedVerifier;
	}
	public void setEncryptedVerifier(Object newEncryptedVerifier) {
		encryptedVerifier = newEncryptedVerifier;
	}
	public Object getEncryptedVerifierHash() {
		return encryptedVerifierHash;
	}
	public void setEncryptedVerifierHash(Object newEncryptedVerifierHash) {
		encryptedVerifierHash = newEncryptedVerifierHash;
	}
}
