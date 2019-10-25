package application;

/* for thread-self cleanup */
public class thread_data {
	private Object thread_hnd;
	private int poll_interval;
	private Object interval_end;
	private thread_sync_data tsd;
	
	public thread_data(Object thread_hnd, int poll_interval, Object interval_end, thread_sync_data tsd) {
		setThread_hnd(thread_hnd);
		setPoll_interval(poll_interval);
		setInterval_end(interval_end);
		setTsd(tsd);
	}
	public thread_data() {
	}
	
	public Object getThread_hnd() {
		return thread_hnd;
	}
	public void setThread_hnd(Object newThread_hnd) {
		thread_hnd = newThread_hnd;
	}
	public int getPoll_interval() {
		return poll_interval;
	}
	public void setPoll_interval(int newPoll_interval) {
		poll_interval = newPoll_interval;
	}
	public Object getInterval_end() {
		return interval_end;
	}
	public void setInterval_end(Object newInterval_end) {
		interval_end = newInterval_end;
	}
	public thread_sync_data getTsd() {
		return tsd;
	}
	public void setTsd(thread_sync_data newTsd) {
		tsd = newTsd;
	}
}
