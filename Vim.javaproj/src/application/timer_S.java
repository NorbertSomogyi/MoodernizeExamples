package application;

// time of slowest call
// nr of times used
// nr of times matched
public class timer_S {
	private long tr_id;
	
	public timer_S(long tr_id) {
		setTr_id(tr_id);
	}
	public timer_S() {
	}
	
	/*
	 * Insert a timer in the list of timers.
	 */
	public void insert_timer() {
		ModernizedCProgram.timer.setTr_next(ModernizedCProgram.first_timer);
		ModernizedCProgram.timer.setTr_prev(((Object)0));
		if (ModernizedCProgram.first_timer != ((Object)0)) {
			ModernizedCProgram.first_timer.setTr_prev(ModernizedCProgram.timer);
		} 
		ModernizedCProgram.first_timer = ModernizedCProgram.timer;
		did_add_timer = 1/*
		 * Take a timer out of the list of timers.
		 */;
	}
	public void remove_timer() {
		if (ModernizedCProgram.timer.getTr_prev() == ((Object)0)) {
			ModernizedCProgram.first_timer = ModernizedCProgram.timer.getTr_next();
		} else {
				ModernizedCProgram.timer.getTr_prev().setTr_next(ModernizedCProgram.timer.getTr_next());
		} 
		if (ModernizedCProgram.timer.getTr_next() != ((Object)0)) {
			ModernizedCProgram.timer.getTr_next().setTr_prev(ModernizedCProgram.timer.getTr_prev());
		} 
	}
	public void free_timer() {
		ModernizedCProgram.timer.getTr_callback().free_callback();
		ModernizedCProgram.vim_free(ModernizedCProgram.timer/*
		 * Create a timer and return it.  NULL if out of memory.
		 * Caller should set the callback.
		 */);
	}
	public timer_S create_timer(long msec, int repeat) {
		timer_T timer = (timer_T)ModernizedCProgram.alloc_clear();
		long prev_id = ModernizedCProgram.last_timer_id;
		if (timer == ((Object)0)) {
			return ((Object)0);
		} 
		if (++ModernizedCProgram.last_timer_id <= prev_id) {
			ModernizedCProgram.last_timer_id = /* Overflow!  Might cause duplicates... */0;
		} 
		timer.setTr_id(ModernizedCProgram.last_timer_id);
		timer.insert_timer();
		if (repeat != 0) {
			timer.setTr_repeat(repeat - 1);
		} 
		timer.setTr_interval(msec);
		Object generatedTr_due = timer.getTr_due();
		ModernizedCProgram.profile_setlimit(msec, generatedTr_due);
		return timer/*
		 * Invoke the callback of "timer".
		 */;
	}
	public void timer_callback() {
		typval_T rettv = new typval_T();
		typval_T[] argv = new typval_T();
		argv[0].setV_type(.VAR_NUMBER);
		argv[0].getVval().setV_number((varnumber_T)ModernizedCProgram.timer.getTr_id());
		argv[1].setV_type(.VAR_UNKNOWN);
		ModernizedCProgram.timer.getTr_callback().call_callback(-1, rettv, 1, argv);
		rettv/*
		 * Call timers that are due.
		 * Return the time in msec until the next timer is due.
		 * Returns -1 if there are no pending timers.
		 */.clear_tv();
	}
	public timer_S find_timer(long id) {
		timer_T timer = new timer_T();
		long generatedTr_id = timer.getTr_id();
		Object generatedTr_next = timer.getTr_next();
		if (id >= 0) {
			for (timer = ModernizedCProgram.first_timer; timer != ((Object)0); timer = generatedTr_next) {
				if (generatedTr_id == id) {
					return timer;
				} 
			}
		} 
		return ((Object)0/*
		 * Stop a timer and delete it.
		 */);
	}
	public void stop_timer() {
		if (ModernizedCProgram.timer.getTr_firing()) {
			ModernizedCProgram.timer.setTr_id(-/* Free the timer after the callback returns. */1);
		} else {
				ModernizedCProgram.timer.remove_timer();
				ModernizedCProgram.timer.free_timer();
		} 
	}
	public long getTr_id() {
		return tr_id;
	}
	public void setTr_id(long newTr_id) {
		tr_id = newTr_id;
	}
}
