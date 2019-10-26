package application;

public class cache_hit {
	private Object dictfile;
	private stat stat;
	private Object cached_cnt;
	private Object keyspace;
	
	public cache_hit(Object dictfile, stat stat, Object cached_cnt, Object keyspace) {
		setDictfile(dictfile);
		setStat(stat);
		setCached_cnt(cached_cnt);
		setKeyspace(keyspace);
	}
	public cache_hit() {
	}
	
	public Object getDictfile() {
		return dictfile;
	}
	public void setDictfile(Object newDictfile) {
		dictfile = newDictfile;
	}
	public stat getStat() {
		return stat;
	}
	public void setStat(stat newStat) {
		stat = newStat;
	}
	public Object getCached_cnt() {
		return cached_cnt;
	}
	public void setCached_cnt(Object newCached_cnt) {
		cached_cnt = newCached_cnt;
	}
	public Object getKeyspace() {
		return keyspace;
	}
	public void setKeyspace(Object newKeyspace) {
		keyspace = newKeyspace;
	}
}
