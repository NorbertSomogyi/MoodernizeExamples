package application;

public class ff_clock {
	private Object sync_clock;
	private ff_av_sync_type sync_type;
	private Object start_time;
	private Object mutex;
	private Object cond;
	private Object retain;
	private boolean started;
	private Object opaque;
	
	public ff_clock(Object sync_clock, ff_av_sync_type sync_type, Object start_time, Object mutex, Object cond, Object retain, boolean started, Object opaque) {
		setSync_clock(sync_clock);
		setSync_type(sync_type);
		setStart_time(start_time);
		setMutex(mutex);
		setCond(cond);
		setRetain(retain);
		setStarted(started);
		setOpaque(opaque);
	}
	public ff_clock() {
	}
	
	/*
	 * Copyright (c) 2015 John R. Bradley <jrb@turrettech.com>
	 *
	 * Permission to use, copy, modify, and distribute this software for any
	 * purpose with or without fee is hereby granted, provided that the above
	 * copyright notice and this permission notice appear in all copies.
	 *
	 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
	 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
	 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
	 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
	 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
	 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
	 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
	 */
	// Amount of microseconds between checks to see if a clock has started
	public double ff_get_sync_clock() {
		Object generatedOpaque = this.getOpaque();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque);
	}
	public Object ff_clock_start_time() {
		int64_t start_time = AV_NOPTS_VALUE;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		boolean generatedStarted = this.getStarted();
		Object generatedStart_time = this.getStart_time();
		if (generatedStarted) {
			start_time = generatedStart_time;
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return start_time;
	}
	public boolean ff_clock_start(ff_av_sync_type sync_type, Object abort) {
		boolean release = false;
		boolean aborted = false;
		ff_av_sync_type generatedSync_type = this.getSync_type();
		boolean generatedStarted = this.getStarted();
		Object generatedMutex = this.getMutex();
		Object generatedCond = this.getCond();
		Object generatedRetain = this.getRetain();
		if (generatedSync_type == ff_av_sync_type.sync_type && !generatedStarted) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			if (!generatedStarted) {
				this.setStart_time(/*Error: Function owner not recognized*/av_gettime());
				this.setStarted(1);
			} 
			ModernizedCProgram.pthread_cond_signal(generatedCond);
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		} else {
				while (!generatedStarted) {
					ModernizedCProgram.pthread_mutex_lock(generatedMutex);
					int64_t current_time = /*Error: Function owner not recognized*/av_gettime() + 100;
					timespec sleep_time = new timespec(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
					ModernizedCProgram.pthread_cond_timedwait(generatedCond, generatedMutex, sleep_time);
					aborted = abort;
					if (generatedRetain == 1) {
						release = true;
					} 
					ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
					if (aborted || release) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_ERROR, "could not start slave clock as master clock was never started before being released or aborted");
						break;
					} 
				}
		} 
		if (release) {
			clock.ff_clock_release();
		} 
		return !release && !aborted;
	}
	public ff_clock ff_clock_init() {
		ff_clock clock = /*Error: Function owner not recognized*/av_mallocz(/*Error: Unsupported expression*/);
		if (clock == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedMutex = clock.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			;
		} 
		Object generatedCond = clock.getCond();
		if (ModernizedCProgram.pthread_cond_init(generatedCond, ((Object)0)) != 0) {
			;
		} 
		return clock;
		return ((Object)0);
	}
	public ff_clock ff_clock_retain() {
		Object generatedRetain = this.getRetain();
		ModernizedCProgram.ff_atomic_inc_long(generatedRetain);
		return clock;
	}
	public ff_clock ff_clock_move() {
		ff_clock retained_clock = clock.ff_clock_retain();
		clock.ff_clock_release();
		return retained_clock;
	}
	public void ff_clock_release() {
		Object generatedRetain = (clock).getRetain();
		Object generatedCond = (clock).getCond();
		Object generatedMutex = (clock).getMutex();
		if (ModernizedCProgram.ff_atomic_dec_long(generatedRetain) == 0) {
			ModernizedCProgram.pthread_cond_destroy(generatedCond);
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(clock);
		} 
		clock = ((Object)0);
	}
	public double get_sync_adjusted_pts_diff(double pts, double pts_diff) {
		double new_pts_diff = pts_diff;
		double sync_time = clock.ff_get_sync_clock();
		double diff = pts - sync_time;
		double sync_threshold;
		sync_threshold = (pts_diff > 0.01) ? pts_diff : 0.01;
		if (/*Error: Function owner not recognized*/fabs(diff) < 10.0) {
			if (diff <= -sync_threshold) {
				new_pts_diff = 0;
			}  else if (diff >= sync_threshold) {
				new_pts_diff = 2 * pts_diff;
			} 
		} 
		return new_pts_diff;
	}
	public Object getSync_clock() {
		return sync_clock;
	}
	public void setSync_clock(Object newSync_clock) {
		sync_clock = newSync_clock;
	}
	public ff_av_sync_type getSync_type() {
		return sync_type;
	}
	public void setSync_type(ff_av_sync_type newSync_type) {
		sync_type = newSync_type;
	}
	public Object getStart_time() {
		return start_time;
	}
	public void setStart_time(Object newStart_time) {
		start_time = newStart_time;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getCond() {
		return cond;
	}
	public void setCond(Object newCond) {
		cond = newCond;
	}
	public Object getRetain() {
		return retain;
	}
	public void setRetain(Object newRetain) {
		retain = newRetain;
	}
	public boolean getStarted() {
		return started;
	}
	public void setStarted(boolean newStarted) {
		started = newStarted;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
}
