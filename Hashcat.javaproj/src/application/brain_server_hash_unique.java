package application;

public class brain_server_hash_unique {
	private Object hash;
	private Object hash_idx;
	
	public brain_server_hash_unique(Object hash, Object hash_idx) {
		setHash(hash);
		setHash_idx(hash_idx);
	}
	public brain_server_hash_unique() {
	}
	
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getHash_idx() {
		return hash_idx;
	}
	public void setHash_idx(Object newHash_idx) {
		hash_idx = newHash_idx;
	}
}
