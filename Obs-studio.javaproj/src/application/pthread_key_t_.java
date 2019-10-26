package application;

public class pthread_key_t_ {
	private Object key;
	private Object keyLock;
	private Object threads;
	
	public pthread_key_t_(Object key, Object keyLock, Object threads) {
		setKey(key);
		setKeyLock(keyLock);
		setThreads(threads);
	}
	public pthread_key_t_() {
	}
	
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getKeyLock() {
		return keyLock;
	}
	public void setKeyLock(Object newKeyLock) {
		keyLock = newKeyLock;
	}
	public Object getThreads() {
		return threads;
	}
	public void setThreads(Object newThreads) {
		threads = newThreads;
	}
}
