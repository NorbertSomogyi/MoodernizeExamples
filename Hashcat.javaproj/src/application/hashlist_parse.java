package application;

public class hashlist_parse {
	private Object hashes_cnt;
	private Object hashes_avail;
	
	public hashlist_parse(Object hashes_cnt, Object hashes_avail) {
		setHashes_cnt(hashes_cnt);
		setHashes_avail(hashes_avail);
	}
	public hashlist_parse() {
	}
	
	public Object getHashes_cnt() {
		return hashes_cnt;
	}
	public void setHashes_cnt(Object newHashes_cnt) {
		hashes_cnt = newHashes_cnt;
	}
	public Object getHashes_avail() {
		return hashes_avail;
	}
	public void setHashes_avail(Object newHashes_avail) {
		hashes_avail = newHashes_avail;
	}
}
