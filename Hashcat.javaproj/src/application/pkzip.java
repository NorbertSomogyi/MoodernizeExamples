package application;

public class pkzip {
	private Object hash_count;
	private Object checksum_size;
	private Object version;
	private pkzip_hash hash;
	
	public pkzip(Object hash_count, Object checksum_size, Object version, pkzip_hash hash) {
		setHash_count(hash_count);
		setChecksum_size(checksum_size);
		setVersion(version);
		setHash(hash);
	}
	public pkzip() {
	}
	
	public Object getHash_count() {
		return hash_count;
	}
	public void setHash_count(Object newHash_count) {
		hash_count = newHash_count;
	}
	public Object getChecksum_size() {
		return checksum_size;
	}
	public void setChecksum_size(Object newChecksum_size) {
		checksum_size = newChecksum_size;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public pkzip_hash getHash() {
		return hash;
	}
	public void setHash(pkzip_hash newHash) {
		hash = newHash;
	}
}
