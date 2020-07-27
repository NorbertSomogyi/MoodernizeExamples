package application;

public class pause_data {
	private Object mutex;
	private Object last_video_ts;
	private Object ts_start;
	private Object ts_end;
	private Object ts_offset;
	
	public pause_data(Object mutex, Object last_video_ts, Object ts_start, Object ts_end, Object ts_offset) {
		setMutex(mutex);
		setLast_video_ts(last_video_ts);
		setTs_start(ts_start);
		setTs_end(ts_end);
		setTs_offset(ts_offset);
	}
	public pause_data() {
	}
	
	public void end_pause(Object ts) {
		Object generatedTs_end = this.getTs_end();
		Object generatedTs_offset = this.getTs_offset();
		Object generatedTs_start = this.getTs_start();
		if (!generatedTs_end) {
			this.setTs_end(ts);
			generatedTs_offset += generatedTs_end - generatedTs_start;
		} 
	}
	public Object get_closest_v_ts() {
		uint64_t interval = ModernizedCProgram.obs.getVideo().getVideo_frame_interval_ns();
		uint64_t i2 = interval * 2;
		uint64_t ts = ModernizedCProgram.os_gettime_ns();
		Object generatedLast_video_ts = this.getLast_video_ts();
		return generatedLast_video_ts + ((ts - generatedLast_video_ts + i2) / interval) * interval;
	}
	public Object pause_can_start() {
		Object generatedTs_start = this.getTs_start();
		Object generatedTs_end = this.getTs_end();
		return !generatedTs_start && !generatedTs_end;
	}
	public Object pause_can_stop() {
		Object generatedTs_start = this.getTs_start();
		Object generatedTs_end = this.getTs_end();
		return !!generatedTs_start && !generatedTs_end;
	}
	public void pause_reset() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setLast_video_ts(0);
		this.setTs_start(0);
		this.setTs_end(0);
		this.setTs_offset(0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public Object video_pause_check_internal(Object ts) {
		this.setLast_video_ts(ts);
		Object generatedTs_start = this.getTs_start();
		if (!generatedTs_start) {
			return false;
		} 
		Object generatedTs_end = this.getTs_end();
		if (ts == generatedTs_end) {
			this.setTs_start(0);
			this.setTs_end(0);
		}  else if (ts >= generatedTs_start) {
			return true;
		} 
		return false;
	}
	public Object video_pause_check(Object timestamp) {
		 ignore_frame = new ();
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		ignore_frame = pause.video_pause_check_internal(timestamp);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return ignore_frame;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getLast_video_ts() {
		return last_video_ts;
	}
	public void setLast_video_ts(Object newLast_video_ts) {
		last_video_ts = newLast_video_ts;
	}
	public Object getTs_start() {
		return ts_start;
	}
	public void setTs_start(Object newTs_start) {
		ts_start = newTs_start;
	}
	public Object getTs_end() {
		return ts_end;
	}
	public void setTs_end(Object newTs_end) {
		ts_end = newTs_end;
	}
	public Object getTs_offset() {
		return ts_offset;
	}
	public void setTs_offset(Object newTs_offset) {
		ts_offset = newTs_offset;
	}
}
