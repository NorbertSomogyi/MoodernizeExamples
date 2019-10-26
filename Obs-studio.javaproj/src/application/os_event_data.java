package application;

/*
 * Copyright (c) 2014 Hugh Bailey <obs.jim@gmail.com>
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
public class os_event_data {
	private Object mutex;
	private Object cond;
	private Object signalled;
	private boolean manual;
	
	public os_event_data(Object mutex, Object cond, Object signalled, boolean manual) {
		setMutex(mutex);
		setCond(cond);
		setSignalled(signalled);
		setManual(manual);
	}
	public os_event_data() {
	}
	
	public int os_event_init(os_event_type type) {
		int code = 0;
		os_event_data data = ModernizedCProgram.bzalloc();
		Object generatedMutex = data.getMutex();
		if ((code = ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0))) < 0) {
			ModernizedCProgram.bfree(data);
			return code;
		} 
		Object generatedCond = data.getCond();
		if ((code = ModernizedCProgram.pthread_cond_init(generatedCond, ((Object)0))) < 0) {
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			ModernizedCProgram.bfree(data);
			return code;
		} 
		data.setManual((os_event_type.type == os_event_type.OS_EVENT_TYPE_MANUAL));
		data.setSignalled(0);
		event = data;
		return 0;
		HANDLE handle = new HANDLE();
		handle = .CreateEventA(((Object)0), (os_event_type.type == os_event_type.OS_EVENT_TYPE_MANUAL), 0, ((Object)0));
		if (!handle) {
			return -1;
		} 
		event = (os_event_t)handle;
		return 0;
	}
	public void os_event_destroy() {
		Object generatedMutex = this.getMutex();
		Object generatedCond = this.getCond();
		if (event) {
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			ModernizedCProgram.pthread_cond_destroy(generatedCond);
			ModernizedCProgram.bfree(event);
		} 
		if (event) {
			.CloseHandle((HANDLE)event);
		} 
	}
	public int os_event_wait() {
		int code = 0;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedSignalled = this.getSignalled();
		Object generatedCond = this.getCond();
		if (!generatedSignalled) {
			code = ModernizedCProgram.pthread_cond_wait(generatedCond, generatedMutex);
		} 
		boolean generatedManual = this.getManual();
		if (code == 0) {
			if (!generatedManual) {
				this.setSignalled(0);
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		} 
		return code;
		DWORD code = new DWORD();
		if (!event) {
			return 22;
		} 
		code = .WaitForSingleObject((HANDLE)event, -1024);
		if (code != 0) {
			return 22;
		} 
		return 0;
	}
	public int os_event_timedwait(long milliseconds) {
		int code = 0;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedSignalled = this.getSignalled();
		Object generatedTv_sec = tv.getTv_sec();
		Object generatedTv_usec = tv.getTv_usec();
		Object generatedCond = this.getCond();
		if (!generatedSignalled) {
			timespec ts = new timespec();
			timeval tv = new timeval();
			.gettimeofday(tv, ((Object)0));
			ts.setTv_sec(generatedTv_sec);
			ts.setTv_nsec(generatedTv_usec * 1000);
			ts.add_ms_to_ts(milliseconds);
			code = ModernizedCProgram.pthread_cond_timedwait(generatedCond, generatedMutex, ts);
		} 
		boolean generatedManual = this.getManual();
		if (code == 0) {
			if (!generatedManual) {
				this.setSignalled(0);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return code;
		DWORD code = new DWORD();
		if (!event) {
			return 22;
		} 
		code = .WaitForSingleObject((HANDLE)event, milliseconds);
		if (code == -1024) {
			return 138;
		}  else if (code != 0) {
			return 22;
		} 
		return 0;
	}
	public int os_event_try() {
		int ret = 11;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedSignalled = this.getSignalled();
		boolean generatedManual = this.getManual();
		if (generatedSignalled) {
			if (!generatedManual) {
				this.setSignalled(0);
			} 
			ret = 0;
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return ret;
		DWORD code = new DWORD();
		if (!event) {
			return 22;
		} 
		code = .WaitForSingleObject((HANDLE)event, 0);
		if (code == -1024) {
			return 11;
		}  else if (code != 0) {
			return 22;
		} 
		return 0;
	}
	public int os_event_signal() {
		int code = 0;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedCond = this.getCond();
		code = ModernizedCProgram.pthread_cond_signal(generatedCond);
		this.setSignalled(1);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return code;
		if (!event) {
			return 22;
		} 
		if (!.SetEvent((HANDLE)event)) {
			return 22;
		} 
		return 0;
	}
	public void os_event_reset() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		this.setSignalled(0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (!event) {
			return ;
		} 
		.ResetEvent((HANDLE)event);
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
	public Object getSignalled() {
		return signalled;
	}
	public void setSignalled(Object newSignalled) {
		signalled = newSignalled;
	}
	public boolean getManual() {
		return manual;
	}
	public void setManual(boolean newManual) {
		manual = newManual;
	}
}
