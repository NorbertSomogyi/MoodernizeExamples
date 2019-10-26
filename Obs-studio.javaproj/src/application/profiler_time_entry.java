package application;

/* ------------------------------------------------------------------------- */
/* Profiler data access */
public class profiler_time_entry {
	private Object time_delta;
	private Object count;
	
	public profiler_time_entry(Object time_delta, Object count) {
		setTime_delta(time_delta);
		setCount(count);
	}
	public profiler_time_entry() {
	}
	
	public Object getTime_delta() {
		return time_delta;
	}
	public void setTime_delta(Object newTime_delta) {
		time_delta = newTime_delta;
	}
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
}
/* ------------------------------------------------------------------------- */
