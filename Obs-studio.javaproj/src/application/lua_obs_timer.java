package application;

public class lua_obs_timer {
	private lua_obs_timer next;
	private lua_obs_timer p_prev_next;
	private Object last_ts;
	private Object interval;
	
	public lua_obs_timer(lua_obs_timer next, lua_obs_timer p_prev_next, Object last_ts, Object interval) {
		setNext(next);
		setP_prev_next(p_prev_next);
		setLast_ts(last_ts);
		setInterval(interval);
	}
	public lua_obs_timer() {
	}
	
	public void lua_obs_timer_init() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.timer_mutex);
		lua_obs_timer next = ModernizedCProgram.first_timer;
		this.setNext(next);
		this.setP_prev_next(ModernizedCProgram.first_timer);
		lua_obs_timer generatedNext = this.getNext();
		if (next) {
			next.setP_prev_next(generatedNext);
		} 
		ModernizedCProgram.first_timer = timer;
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.timer_mutex);
	}
	public void lua_obs_timer_remove() {
		lua_obs_timer generatedNext = this.getNext();
		lua_obs_timer next = generatedNext;
		lua_obs_timer generatedP_prev_next = this.getP_prev_next();
		if (next) {
			next.setP_prev_next(generatedP_prev_next);
		} 
		generatedP_prev_next = generatedNext;
	}
	public lua_obs_timer getNext() {
		return next;
	}
	public void setNext(lua_obs_timer newNext) {
		next = newNext;
	}
	public lua_obs_timer getP_prev_next() {
		return p_prev_next;
	}
	public void setP_prev_next(lua_obs_timer newP_prev_next) {
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
