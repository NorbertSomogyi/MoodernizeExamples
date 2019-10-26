package application;

public class timespec {
	private Object tv_sec;
	private long tv_nsec;
	
	public timespec(Object tv_sec, long tv_nsec) {
		setTv_sec(tv_sec);
		setTv_nsec(tv_nsec);
	}
	public timespec() {
	}
	
	public void filetime_to_timespec(Object ft) {
		long hnsec = ModernizedCProgram.filetime_to_hnsec(ft);
		this.setTv_sec((time_t)(hnsec / 10000000));
		this.setTv_nsec((hnsec % 10000000) * 100/**
		 * Verifies that safe_create_leading_directories() would succeed.
		 */);
	}
	public Object getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(Object newTv_sec) {
		tv_sec = newTv_sec;
	}
	public long getTv_nsec() {
		return tv_nsec;
	}
	public void setTv_nsec(long newTv_nsec) {
		tv_nsec = newTv_nsec;
	}
}
