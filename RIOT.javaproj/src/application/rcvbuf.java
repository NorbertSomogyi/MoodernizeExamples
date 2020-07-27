package application;

public class rcvbuf {
	private Object lock;
	private Object entries;
	
	public rcvbuf(Object lock, Object entries) {
		setLock(lock);
		setEntries(entries);
	}
	public rcvbuf() {
	}
	
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
}
