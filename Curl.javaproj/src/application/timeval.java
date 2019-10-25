package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/*
 * Inclusion of common header files.
 */
/*
 * Definition of timeval struct for platforms that don't have it.
 */
public class timeval {
	private long tv_sec;
	private long tv_usec;
	
	public timeval(long tv_sec, long tv_usec) {
		setTv_sec(tv_sec);
		setTv_usec(tv_usec);
	}
	public timeval() {
	}
	
	public timeval tvnow() {
		timeval now = new timeval();
		DWORD milliseconds = .GetTickCount();
		now.setTv_sec((long)(milliseconds / 1000));
		now.setTv_usec((long)((milliseconds % 1000) * 1000));
		return now/*
		  ** clock_gettime() is granted to be increased monotonically when the
		  ** monotonic clock is queried. Time starting point is unspecified, it
		  ** could be the system start-up time, the Epoch, or something else,
		  ** in any case the time starting point does not change once that the
		  ** system has started up.
		  *//*
		  ** Even when the configure process has truly detected monotonic clock
		  ** availability, it might happen that it is not actually available at
		  ** run-time. When this occurs simply fallback to other time source.
		  */;
	}
	/*
	  ** gettimeofday() is not granted to be increased monotonically, due to
	  ** clock drifting and external source time synchronization it can jump
	  ** forward or backward in time.
	  */
	/*
	  ** time() returns the value of time in seconds since the Epoch.
	  */
	/*
	 * Make sure that the first argument is the more recent time, as otherwise
	 * we'll get a weird negative time-diff back...
	 *
	 * Returns: the time difference in number of milliseconds.
	 */
	public long tvdiff(timeval older) {
		long generatedTv_sec = this.getTv_sec();
		long generatedTv_usec = this.getTv_usec();
		return (long)(generatedTv_sec - generatedTv_sec) * 1000 + (long)(generatedTv_usec - generatedTv_usec) / 1000;
	}
	public long getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(long newTv_sec) {
		tv_sec = newTv_sec;
	}
	public long getTv_usec() {
		return tv_usec;
	}
	public void setTv_usec(long newTv_usec) {
		tv_usec = newTv_usec;
	}
}
