package application;

public class struct_psafe2_hdr {
	private Object random;
	private Object hash;
	private Object salt;
	private Object iv;
	
	public struct_psafe2_hdr(Object random, Object hash, Object salt, Object iv) {
		setRandom(random);
		setHash(hash);
		setSalt(salt);
		setIv(iv);
	}
	public struct_psafe2_hdr() {
	}
	
	public Object getRandom() {
		return random;
	}
	public void setRandom(Object newRandom) {
		random = newRandom;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getSalt() {
		return salt;
	}
	public void setSalt(Object newSalt) {
		salt = newSalt;
	}
	public Object getIv() {
		return iv;
	}
	public void setIv(Object newIv) {
		iv = newIv;
	}
}
