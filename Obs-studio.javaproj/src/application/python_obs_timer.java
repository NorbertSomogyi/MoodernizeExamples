package application;

/* -------------------------------------------- */
public class python_obs_timer {
	private python_obs_timer next;
	private python_obs_timer p_prev_next;
	private Object last_ts;
	private Object interval;
	
	public python_obs_timer(python_obs_timer next, python_obs_timer p_prev_next, Object last_ts, Object interval) {
		setNext(next);
		setP_prev_next(p_prev_next);
		setLast_ts(last_ts);
		setInterval(interval);
	}
	public python_obs_timer() {
	}
	
	public void python_obs_timer_init() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.timer_mutex);
		python_obs_timer next = ModernizedCProgram.first_timer;
		this.setNext(next);
		this.setP_prev_next(ModernizedCProgram.first_timer);
		python_obs_timer generatedNext = this.getNext();
		if (next) {
			next.setP_prev_next(generatedNext);
		} 
		ModernizedCProgram.first_timer = timer;
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.timer_mutex);
	}
	public void python_obs_timer_remove() {
		python_obs_timer generatedNext = this.getNext();
		python_obs_timer next = generatedNext;
		python_obs_timer generatedP_prev_next = this.getP_prev_next();
		if (next) {
			next.setP_prev_next(generatedP_prev_next);
		} 
		generatedP_prev_next = generatedNext;
	}
	public python_obs_timer getNext() {
		return next;
	}
	public void setNext(python_obs_timer newNext) {
		next = newNext;
	}
	public python_obs_timer getP_prev_next() {
		return p_prev_next;
	}
	public void setP_prev_next(python_obs_timer newP_prev_next) {
		p_prev_next = newP_prev_next;
	}
	public Object getLast_ts() {
		return last_ts;
	}
	public void setLast_ts(Object newLast_ts) {
		last_ts = newLast_ts;
	}
	public Object getInterval() {
		return interval;
	}
	public void setInterval(Object newInterval) {
		interval = newInterval;
	}
}
