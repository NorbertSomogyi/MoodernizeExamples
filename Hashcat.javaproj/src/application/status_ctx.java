package application;

public class status_ctx {
	private boolean accessible;
	private Object devices_status;
	private hashcat_status hashcat_status_final;
	private boolean run_main_level1;
	private boolean run_main_level2;
	private boolean run_main_level3;
	private boolean run_thread_level1;
	private boolean run_thread_level2;
	private boolean shutdown_inner;
	private boolean shutdown_outer;
	private boolean checkpoint_shutdown;
	private Object mux_dispatcher;
	private Object mux_counter;
	private Object mux_hwmon;
	private Object mux_display;
	private Object words_off;
	private Object words_cur;
	private Object words_base;
	private Object words_cnt;
	private Object words_progress_done;
	private Object words_progress_rejected;
	private Object words_progress_restored;
	private Object runtime_start;
	private Object runtime_stop;
	private Object timer_running;
	private Object timer_paused;
	private double msec_paused;
	private Object stdin_read_timeout_cnt;
	
	public status_ctx(boolean accessible, Object devices_status, hashcat_status hashcat_status_final, boolean run_main_level1, boolean run_main_level2, boolean run_main_level3, boolean run_thread_level1, boolean run_thread_level2, boolean shutdown_inner, boolean shutdown_outer, boolean checkpoint_shutdown, Object mux_dispatcher, Object mux_counter, Object mux_hwmon, Object mux_display, Object words_off, Object words_cur, Object words_base, Object words_cnt, Object words_progress_done, Object words_progress_rejected, Object words_progress_restored, Object runtime_start, Object runtime_stop, Object timer_running, Object timer_paused, double msec_paused, Object stdin_read_timeout_cnt) {
		setAccessible(accessible);
		setDevices_status(devices_status);
		setHashcat_status_final(hashcat_status_final);
		setRun_main_level1(run_main_level1);
		setRun_main_level2(run_main_level2);
		setRun_main_level3(run_main_level3);
		setRun_thread_level1(run_thread_level1);
		setRun_thread_level2(run_thread_level2);
		setShutdown_inner(shutdown_inner);
		setShutdown_outer(shutdown_outer);
		setCheckpoint_shutdown(checkpoint_shutdown);
		setMux_dispatcher(mux_dispatcher);
		setMux_counter(mux_counter);
		setMux_hwmon(mux_hwmon);
		setMux_display(mux_display);
		setWords_off(words_off);
		setWords_cur(words_cur);
		setWords_base(words_base);
		setWords_cnt(words_cnt);
		setWords_progress_done(words_progress_done);
		setWords_progress_rejected(words_progress_rejected);
		setWords_progress_restored(words_progress_restored);
		setRuntime_start(runtime_start);
		setRuntime_stop(runtime_stop);
		setTimer_running(timer_running);
		setTimer_paused(timer_paused);
		setMsec_paused(msec_paused);
		setStdin_read_timeout_cnt(stdin_read_timeout_cnt);
	}
	public status_ctx() {
	}
	
	public boolean getAccessible() {
		return accessible;
	}
	public void setAccessible(boolean newAccessible) {
		accessible = newAccessible;
	}
	public Object getDevices_status() {
		return devices_status;
	}
	public void setDevices_status(Object newDevices_status) {
		devices_status = newDevices_status;
	}
	public hashcat_status getHashcat_status_final() {
		return hashcat_status_final;
	}
	public void setHashcat_status_final(hashcat_status newHashcat_status_final) {
		hashcat_status_final = newHashcat_status_final;
	}
	public boolean getRun_main_level1() {
		return run_main_level1;
	}
	public void setRun_main_level1(boolean newRun_main_level1) {
		run_main_level1 = newRun_main_level1;
	}
	public boolean getRun_main_level2() {
		return run_main_level2;
	}
	public void setRun_main_level2(boolean newRun_main_level2) {
		run_main_level2 = newRun_main_level2;
	}
	public boolean getRun_main_level3() {
		return run_main_level3;
	}
	public void setRun_main_level3(boolean newRun_main_level3) {
		run_main_level3 = newRun_main_level3;
	}
	public boolean getRun_thread_level1() {
		return run_thread_level1;
	}
	public void setRun_thread_level1(boolean newRun_thread_level1) {
		run_thread_level1 = newRun_thread_level1;
	}
	public boolean getRun_thread_level2() {
		return run_thread_level2;
	}
	public void setRun_thread_level2(boolean newRun_thread_level2) {
		run_thread_level2 = newRun_thread_level2;
	}
	public boolean getShutdown_inner() {
		return shutdown_inner;
	}
	public void setShutdown_inner(boolean newShutdown_inner) {
		shutdown_inner = newShutdown_inner;
	}
	public boolean getShutdown_outer() {
		return shutdown_outer;
	}
	public void setShutdown_outer(boolean newShutdown_outer) {
		shutdown_outer = newShutdown_outer;
	}
	public boolean getCheckpoint_shutdown() {
		return checkpoint_shutdown;
	}
	public void setCheckpoint_shutdown(boolean newCheckpoint_shutdown) {
		checkpoint_shutdown = newCheckpoint_shutdown;
	}
	public Object getMux_dispatcher() {
		return mux_dispatcher;
	}
	public void setMux_dispatcher(Object newMux_dispatcher) {
		mux_dispatcher = newMux_dispatcher;
	}
	public Object getMux_counter() {
		return mux_counter;
	}
	public void setMux_counter(Object newMux_counter) {
		mux_counter = newMux_counter;
	}
	public Object getMux_hwmon() {
		return mux_hwmon;
	}
	public void setMux_hwmon(Object newMux_hwmon) {
		mux_hwmon = newMux_hwmon;
	}
	public Object getMux_display() {
		return mux_display;
	}
	public void setMux_display(Object newMux_display) {
		mux_display = newMux_display;
	}
	public Object getWords_off() {
		return words_off;
	}
	public void setWords_off(Object newWords_off) {
		words_off = newWords_off;
	}
	public Object getWords_cur() {
		return words_cur;
	}
	public void setWords_cur(Object newWords_cur) {
		words_cur = newWords_cur;
	}
	public Object getWords_base() {
		return words_base;
	}
	public void setWords_base(Object newWords_base) {
		words_base = newWords_base;
	}
	public Object getWords_cnt() {
		return words_cnt;
	}
	public void setWords_cnt(Object newWords_cnt) {
		words_cnt = newWords_cnt;
	}
	public Object getWords_progress_done() {
		return words_progress_done;
	}
	public void setWords_progress_done(Object newWords_progress_done) {
		words_progress_done = newWords_progress_done;
	}
	public Object getWords_progress_rejected() {
		return words_progress_rejected;
	}
	public void setWords_progress_rejected(Object newWords_progress_rejected) {
		words_progress_rejected = newWords_progress_rejected;
	}
	public Object getWords_progress_restored() {
		return words_progress_restored;
	}
	public void setWords_progress_restored(Object newWords_progress_restored) {
		words_progress_restored = newWords_progress_restored;
	}
	public Object getRuntime_start() {
		return runtime_start;
	}
	public void setRuntime_start(Object newRuntime_start) {
		runtime_start = newRuntime_start;
	}
	public Object getRuntime_stop() {
		return runtime_stop;
	}
	public void setRuntime_stop(Object newRuntime_stop) {
		runtime_stop = newRuntime_stop;
	}
	public Object getTimer_running() {
		return timer_running;
	}
	public void setTimer_running(Object newTimer_running) {
		timer_running = newTimer_running;
	}
	public Object getTimer_paused() {
		return timer_paused;
	}
	public void setTimer_paused(Object newTimer_paused) {
		timer_paused = newTimer_paused;
	}
	public double getMsec_paused() {
		return msec_paused;
	}
	public void setMsec_paused(double newMsec_paused) {
		msec_paused = newMsec_paused;
	}
	public Object getStdin_read_timeout_cnt() {
		return stdin_read_timeout_cnt;
	}
	public void setStdin_read_timeout_cnt(Object newStdin_read_timeout_cnt) {
		stdin_read_timeout_cnt = newStdin_read_timeout_cnt;
	}
}
/**
   * main status
   */
