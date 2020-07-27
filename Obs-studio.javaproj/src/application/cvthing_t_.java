package application;

public class cvthing_t_ {
	private Object notbusy;
	private Object lock;
	private int shared;
	
	public cvthing_t_(Object notbusy, Object lock, int shared) {
		setNotbusy(notbusy);
		setLock(lock);
		setShared(shared);
	}
	public cvthing_t_() {
	}
	
	public Object getNotbusy() {
		return notbusy;
	}
	public void setNotbusy(Object newNotbusy) {
		notbusy = newNotbusy;
	}
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public int getShared() {
		return shared;
	}
	public void setShared(int newShared) {
		shared = newShared;
	}
}
