package application;

public class hostcache_prune_data {
	private long cache_timeout;
	private Object now;
	
	public hostcache_prune_data(long cache_timeout, Object now) {
		setCache_timeout(cache_timeout);
		setNow(now);
	}
	public hostcache_prune_data() {
	}
	
	public long getCache_timeout() {
		return cache_timeout;
	}
	public void setCache_timeout(long newCache_timeout) {
		cache_timeout = newCache_timeout;
	}
	public Object getNow() {
		return now;
	}
	public void setNow(Object newNow) {
		now = newNow;
	}
}
