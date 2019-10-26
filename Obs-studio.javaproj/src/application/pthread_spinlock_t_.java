package application;

public class pthread_spinlock_t_ {
	private long interlock;
	private  u;
	
	public pthread_spinlock_t_(long interlock,  u) {
		setInterlock(interlock);
		setU(u);
	}
	public pthread_spinlock_t_() {
	}
	
	public long getInterlock() {
		return interlock;
	}
	public void setInterlock(long newInterlock) {
		interlock = newInterlock;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
