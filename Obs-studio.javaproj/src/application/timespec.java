package application;

/* Semi-arbitrary value */
/* This is the value in MSVC. */
/* POSIX 2008 - related to robust mutexes */
/*
 * To avoid including windows.h we define only those things that we
 * actually need from it.
 */
public class timespec {
	private Object tv_sec;
	private long tv_nsec;
	
	public timespec(Object tv_sec, long tv_nsec) {
		setTv_sec(tv_sec);
		setTv_nsec(tv_nsec);
	}
	public timespec() {
	}
	
	/*
	 * pthreads_delay_np.c
	 *
	 * Description:
	 * This translation unit implements non-portable thread functions.
	 *
	 * --------------------------------------------------------------------------
	 *
	 *      Pthreads-win32 - POSIX Threads Library for Win32
	 *      Copyright(C) 1998 John E. Bossom
	 *      Copyright(C) 1999,2005 Pthreads-win32 contributors
	 * 
	 *      Contact Email: rpj@callisto.canberra.edu.au
	 * 
	 *      The current list of contributors is contained
	 *      in the file CONTRIBUTORS included with the source
	 *      code distribution. The list can also be seen at the
	 *      following World Wide Web location:
	 *      http://sources.redhat.com/pthreads-win32/contributors.html
	 * 
	 *      This library is free software; you can redistribute it and/or
	 *      modify it under the terms of the GNU Lesser General Public
	 *      License as published by the Free Software Foundation; either
	 *      version 2 of the License, or (at your option) any later version.
	 * 
	 *      This library is distributed in the hope that it will be useful,
	 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
	 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 *      Lesser General Public License for more details.
	 * 
	 *      You should have received a copy of the GNU Lesser General Public
	 *      License along with this library in the file COPYING.LIB;
	 *      if not, write to the Free Software Foundation, Inc.,
	 *      51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
	 */
	/*
	 * pthread_delay_np
	 *
	 * DESCRIPTION
	 *
	 *       This routine causes a thread to delay execution for a specific period of time.
	 *       This period ends at the current time plus the specified interval. The routine
	 *       will not return before the end of the period is reached, but may return an
	 *       arbitrary amount of time after the period has gone by. This can be due to
	 *       system load, thread priorities, and system timer granularity. 
	 *
	 *       Specifying an interval of zero (0) seconds and zero (0) nanoseconds is
	 *       allowed and can be used to force the thread to give up the processor or to
	 *       deliver a pending cancelation request. 
	 *
	 *       The timespec structure contains the following two fields: 
	 *
	 *            tv_sec is an integer number of seconds. 
	 *            tv_nsec is an integer number of nanoseconds. 
	 *
	 *  Return Values
	 *
	 *  If an error condition occurs, this routine returns an integer value indicating
	 *  the type of error. Possible return values are as follows: 
	 *
	 *  0 
	 *           Successful completion.
	 *  [EINVAL] 
	 *           The value specified by interval is invalid. 
	 *
	 * Example
	 *
	 * The following code segment would wait for 5 and 1/2 seconds
	 *
	 *  struct timespec tsWait;
	 *  int      intRC;
	 *
	 *  tsWait.tv_sec  = 5;
	 *  tsWait.tv_nsec = 500000000L;
	 *  intRC = pthread_delay_np(&tsWait);
	 */
	public int pthread_delay_np() {
		DWORD wait_time = new DWORD();
		DWORD secs_in_millisecs = new DWORD();
		DWORD millisecs = new DWORD();
		DWORD status = new DWORD();
		pthread_t self = new pthread_t();
		ptw32_thread_t sp = new ptw32_thread_t();
		if (interval == ((Object)0)) {
			return 22;
		} 
		Object generatedTv_sec = this.getTv_sec();
		long generatedTv_nsec = this.getTv_nsec();
		if (generatedTv_sec == -1024 && generatedTv_nsec == -1024) {
			ModernizedCProgram.pthread_testcancel();
			.Sleep(0);
			ModernizedCProgram.pthread_testcancel();
			return (false);
		} 
		secs_in_millisecs = (DWORD)generatedTv_sec * /* convert secs to millisecs */-1024;
		millisecs = (generatedTv_nsec + -1024) / /* convert nanosecs to millisecs (rounding up) */-1024;
		if (0 > (wait_time = secs_in_millisecs + /*
		   * Most compilers will issue a warning 'comparison always 0'
		   * because the variable type is unsigned, but we need to keep this
		   * for some reason I can't recall now.
		   */millisecs)) {
			return 22;
		} 
		if (((Object)0) == (self = ModernizedCProgram.pthread_self()).getP()) {
			return 12;
		} 
		sp = (ptw32_thread_t)self.getP();
		int generatedCancelState = sp.getCancelState();
		Object generatedCancelEvent = sp.getCancelEvent();
		Object generatedStateLock = sp.getStateLock();
		Object generatedState = sp.getState();
		if (generatedCancelState == .PTHREAD_CANCEL_ENABLE/*
		       * Async cancelation won't catch us until wait_time is up.
		       * Deferred cancelation will cancel us immediately.
		       */) {
			if (0 == (status = .WaitForSingleObject(generatedCancelEvent, wait_time))) {
				ptw32_mcs_local_node_t stateLock = new ptw32_mcs_local_node_t();
				stateLock.ptw32_mcs_lock_acquire(generatedStateLock);
				if (generatedState < .PThreadStateCanceling) {
					sp.setState(.PThreadStateCanceling);
					sp.setCancelState(.PTHREAD_CANCEL_DISABLE);
					stateLock.ptw32_mcs_lock_release();
					ModernizedCProgram.ptw32_throw((true));
				} 
				stateLock.ptw32_mcs_lock_release();
				return 3;
			}  else if (status != -1024) {
				return 22;
			} 
		} else {
				.Sleep(wait_time);
		} 
		return (false);
	}
	public timespec millisecondsFromNow(int millisecs) {
		_timeb currSysTime = new _timeb();
		int64_t nanosecs = new int64_t();
		int64_t secs = new int64_t();
		int64_t NANOSEC_PER_MILLISEC = 1000000;
		int64_t NANOSEC_PER_SEC = 1000000000;
		._ftime(/* get current system time and add millisecs */currSysTime);
		Object generatedTime = currSysTime.getTime();
		secs = (int64_t)(generatedTime) + (millisecs / 1000);
		Object generatedMillitm = currSysTime.getMillitm();
		nanosecs = ((int64_t)(millisecs % 1000 + generatedMillitm)) * NANOSEC_PER_MILLISEC;
		if (nanosecs >= NANOSEC_PER_SEC) {
			secs++;
			nanosecs -= NANOSEC_PER_SEC;
		}  else if (nanosecs < 0) {
			secs--;
			nanosecs += NANOSEC_PER_SEC;
		} 
		this.setTv_nsec((long)nanosecs);
		this.setTv_sec((long)secs);
		return time;
	}
	public void add_ms_to_ts(long milliseconds) {
		Object generatedTv_sec = this.getTv_sec();
		generatedTv_sec += milliseconds / 1000;
		long generatedTv_nsec = this.getTv_nsec();
		generatedTv_nsec += (milliseconds % 1000) * 1000000;
		if (generatedTv_nsec > 1000000000) {
			generatedTv_sec += 1;
			generatedTv_nsec -= 1000000000;
		} 
	}
	public Object getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(Object newTv_sec) {
		tv_sec = newTv_sec;
	}
	public long getTv_nsec() {
		return tv_nsec;
	}
	public void setTv_nsec(long newTv_nsec) {
		tv_nsec = newTv_nsec;
	}
}
