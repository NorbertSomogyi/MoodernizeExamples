package application;

public class oldoffice01 {
	private Object version;
	private Object[] encryptedVerifier;
	private Object[] encryptedVerifierHash;
	private Object[] rc4key;
	
	public oldoffice01(Object version, Object[] encryptedVerifier, Object[] encryptedVerifierHash, Object[] rc4key) {
		setVersion(version);
		setEncryptedVerifier(encryptedVerifier);
		setEncryptedVerifierHash(encryptedVerifierHash);
		setRc4key(rc4key);
	}
	public oldoffice01() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
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
	public Object[] getRc4key() {
		return rc4key;
	}
	public void setRc4key(Object[] newRc4key) {
		rc4key = newRc4key;
	}
}
