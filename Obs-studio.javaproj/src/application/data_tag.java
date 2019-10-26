package application;

public class data_tag {
	private Object lock;
	private int data;
	private int updates;
	
	public data_tag(Object lock, int data, int updates) {
		setLock(lock);
		setData(data);
		setUpdates(updates);
	}
	public data_tag() {
	}
	
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public int getData() {
		return data;
	}
	public void setData(int newData) {
		data = newData;
	}
	public int getUpdates() {
		return updates;
	}
	public void setUpdates(int newUpdates) {
		updates = newUpdates;
	}
}
