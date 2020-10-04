package application;

public class bsp {
	private Object[] signature;
	private Object[] digest;
	private Object[] salt;
	private Object iter;
	private Object crc32;
	
	public bsp(Object[] signature, Object[] digest, Object[] salt, Object iter, Object crc32) {
		setSignature(signature);
		setDigest(digest);
		setSalt(salt);
		setIter(iter);
		setCrc32(crc32);
	}
	public bsp() {
	}
	
	public Object[] getSignature() {
		return signature;
	}
	public void setSignature(Object[] newSignature) {
		signature = newSignature;
	}
	public Object[] getDigest() {
		return digest;
	}
	public void setDigest(Object[] newDigest) {
		digest = newDigest;
	}
	public Object[] getSalt() {
		return salt;
	}
	public void setSalt(Object[] newSalt) {
		salt = newSalt;
	}
	public Object getIter() {
		return iter;
	}
	public void setIter(Object newIter) {
		iter = newIter;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
}
