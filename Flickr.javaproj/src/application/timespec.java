package application;

/* nop */
public class timespec {
	private long tv_sec;
	private long tv_nsec;
	
	public timespec(long tv_sec, long tv_nsec) {
		setTv_sec(tv_sec);
		setTv_nsec(tv_nsec);
	}
	public timespec() {
	}
	
	public long getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(long newTv_sec) {
		tv_sec = newTv_sec;
	}
	public long getTv_nsec() {
		return tv_nsec;
	}
	public void setTv_nsec(long newTv_nsec) {
		tv_nsec = newTv_nsec;
	}
}
