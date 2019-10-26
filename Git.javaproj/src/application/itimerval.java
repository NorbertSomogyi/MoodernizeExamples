package application;

public class itimerval {
	private timeval it_value;
	private timeval it_interval;
	
	public itimerval(timeval it_value, timeval it_interval) {
		setIt_value(it_value);
		setIt_interval(it_interval);
	}
	public itimerval() {
	}
	
	public timeval getIt_value() {
		return it_value;
	}
	public void setIt_value(timeval newIt_value) {
		it_value = newIt_value;
	}
	public timeval getIt_interval() {
		return it_interval;
	}
	public void setIt_interval(timeval newIt_interval) {
		it_interval = newIt_interval;
	}
}
