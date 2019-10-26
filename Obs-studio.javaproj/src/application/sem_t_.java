package application;

public class sem_t_ {
	private int value;
	private Object lock;
	private Object sem;
	
	public sem_t_(int value, Object lock, Object sem) {
		setValue(value);
		setLock(lock);
		setSem(sem);
	}
	public sem_t_() {
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int newValue) {
		value = newValue;
	}
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public Object getSem() {
		return sem;
	}
	public void setSem(Object newSem) {
		sem = newSem;
	}
}
