package application;

/*
 * The "cache_time" is just the low 32 bits of the
 * time. It doesn't matter if it overflows - we only
 * check it for equality in the 32 bits we save.
 */
public class cache_time {
	private Object sec;
	private Object nsec;
	
	public cache_time(Object sec, Object nsec) {
		setSec(sec);
		setNsec(nsec);
	}
	public cache_time() {
	}
	
	public Object getSec() {
		return sec;
	}
	public void setSec(Object newSec) {
		sec = newSec;
	}
	public Object getNsec() {
		return nsec;
	}
	public void setNsec(Object newNsec) {
		nsec = newNsec;
	}
}
