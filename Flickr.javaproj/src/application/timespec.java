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
	
	public int nanosleep(Object rqtp) {
		int msec;
		int sec;
		sec = rqtp.getTv_sec();
		msec = (rqtp.getTv_nsec() / 1000000);
		msec += 1000 * /* carefully avoid sleeping forever with a sleep(0) */sec;
		if (!msec) {
			msec = 1;
		} 
		.Sleep(msec/* otherwise use sleep() (POSIX) and possibly usleep() (4.3BSD) */)/* 0 seconds so ensure msec is at least 1 */;/* 0 seconds so ensure msec is at least 1 */
		/* use usleep() for fractions of a second only (when available)
		   * since some implementations won't let it sleep for more than a
		   * second.
		   */return 0/* end HAVE_NANOSLEEP */;
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
