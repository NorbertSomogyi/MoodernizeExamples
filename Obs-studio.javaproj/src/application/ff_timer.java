package application;

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
public class ff_timer {
	private Object callback;
	private Object opaque;
	private Object mutex;
	private Object mutexattr;
	private Object cond;
	private Object timer_thread;
	private Object next_wake;
	private boolean needs_wake;
	private boolean abort;
	
	public ff_timer(Object callback, Object opaque, Object mutex, Object mutexattr, Object cond, Object timer_thread, Object next_wake, boolean needs_wake, boolean abort) {
		setCallback(callback);
		setOpaque(opaque);
		setMutex(mutex);
		setMutexattr(mutexattr);
		setCond(cond);
		setTimer_thread(timer_thread);
		setNext_wake(next_wake);
		setNeeds_wake(needs_wake);
		setAbort(abort);
	}
	public ff_timer() {
	}
	
	public boolean ff_timer_init(Object callback, Object opaque) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(timer, 0, /*Error: Unsupported expression*/);
		this.setAbort(0);
		this.setCallback(callback);
		this.setOpaque(opaque);
		Object generatedMutexattr = this.getMutexattr();
		if (ModernizedCProgram.pthread_mutexattr_init(generatedMutexattr) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutexattr_settype(generatedMutexattr, 2)) {
			;
		} 
		Object generatedMutex = this.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, generatedMutexattr) != 0) {
			;
		} 
		Object generatedCond = this.getCond();
		if (ModernizedCProgram.pthread_cond_init(generatedCond, ((Object)0)) != 0) {
			;
		} 
		Object generatedTimer_thread = this.getTimer_thread();
		if (ModernizedCProgram.pthread_create(generatedTimer_thread, ((Object)0), timer_thread, timer) != 0) {
			;
		} 
		return 1;
	}
	public void ff_timer_free() {
		Object thread_result;
		((timer != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("timer != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\ff-timer.c", 117));
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setAbort(1);
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_signal(generatedCond);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		Object generatedTimer_thread = this.getTimer_thread();
		ModernizedCProgram.pthread_join(generatedTimer_thread, thread_result);
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedMutexattr = this.getMutexattr();
		ModernizedCProgram.pthread_mutexattr_destroy(generatedMutexattr);
		ModernizedCProgram.pthread_cond_destroy(generatedCond);
	}
	public void ff_timer_schedule(Object microseconds) {
		uint64_t cur_time = /*Error: Function owner not recognized*/av_gettime();
		uint64_t new_wake_time = cur_time + microseconds;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setNeeds_wake(1);
		Object generatedNext_wake = this.getNext_wake();
		if (new_wake_time < generatedNext_wake || cur_time > generatedNext_wake) {
			this.setNext_wake(new_wake_time);
		} 
		Object generatedCond = this.getCond();
		ModernizedCProgram.pthread_cond_signal(generatedCond);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getMutexattr() {
		return mutexattr;
	}
	public void setMutexattr(Object newMutexattr) {
		mutexattr = newMutexattr;
	}
	public Object getCond() {
		return cond;
	}
	public void setCond(Object newCond) {
		cond = newCond;
	}
	public Object getTimer_thread() {
		return timer_thread;
	}
	public void setTimer_thread(Object newTimer_thread) {
		timer_thread = newTimer_thread;
	}
	public Object getNext_wake() {
		return next_wake;
	}
	public void setNext_wake(Object newNext_wake) {
		next_wake = newNext_wake;
	}
	public boolean getNeeds_wake() {
		return needs_wake;
	}
	public void setNeeds_wake(boolean newNeeds_wake) {
		needs_wake = newNeeds_wake;
	}
	public boolean getAbort() {
		return abort;
	}
	public void setAbort(boolean newAbort) {
		abort = newAbort;
	}
}
