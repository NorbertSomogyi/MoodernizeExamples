package application;

public class metalink_checksum {
	private Object digest_def;
	private Byte digest;
	
	public metalink_checksum(Object digest_def, Byte digest) {
		setDigest_def(digest_def);
		setDigest(digest);
	}
	public metalink_checksum() {
	}
	
	public Object getDigest_def() {
		return digest_def;
	}
	public void setDigest_def(Object newDigest_def) {
		digest_def = newDigest_def;
	}
	public Byte getDigest() {
		return digest;
	}
	public void setDigest(Byte newDigest) {
		digest = newDigest;
	}
}
