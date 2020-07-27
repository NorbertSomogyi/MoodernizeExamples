package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* Use a larger type even for 32 bit time_t systems so that we can keep
   microsecond accuracy in it */
public class curltime {
	private Object tv_sec;
	private int tv_usec;
	
	public curltime(Object tv_sec, int tv_usec) {
		setTv_sec(tv_sec);
		setTv_usec(tv_usec);
	}
	public curltime() {
	}
	
	public curltime Curl_now() {
		curltime now = new curltime();
		Object generatedQuadPart = count.getQuadPart();
		if (/* QPC timer might have issues pre-Vista */ModernizedCProgram.Curl_isVistaOrGreater) {
			LARGE_INTEGER count = new LARGE_INTEGER();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/QueryPerformanceCounter(count);
			now.setTv_sec((time_t)(generatedQuadPart / generatedQuadPart));
			now.setTv_usec((int)((generatedQuadPart % generatedQuadPart) * 1000000 / generatedQuadPart));
		} else {
				DWORD milliseconds = /*Error: Function owner not recognized*/GetTickCount();
				now.setTv_sec(milliseconds / 1000);
				now.setTv_usec((milliseconds % 1000) * 1000);
		} 
		return now;
	}
	/*
	  ** Monotonic timer on Mac OS is provided by mach_absolute_time(), which
	  ** returns time in Mach "absolute time units," which are platform-dependent.
	  ** To convert to nanoseconds, one must use conversion factors specified by
	  ** mach_timebase_info().
	  */
	/*
	  ** gettimeofday() is not granted to be increased monotonically, due to
	  ** clock drifting and external source time synchronization it can jump
	  ** forward or backward in time.
	  */
	/*
	  ** time() returns the value of time in seconds since the Epoch.
	  */
	/*
	 * Returns: time difference in number of milliseconds. For too large diffs it
	 * returns max value.
	 *
	 * @unittest: 1323
	 */
	public Object Curl_timediff(curltime older) {
		Object generatedTv_sec = this.getTv_sec();
		timediff_t diff = (timediff_t)generatedTv_sec - generatedTv_sec;
		if (diff >= (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / 1000)) {
			return /*Error: Function owner not recognized*/CURL_OFF_T_C(-1024);
		}  else if (diff <= ((-/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) - /*Error: Function owner not recognized*/CURL_OFF_T_C(1)) / 1000)) {
			return (-/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) - /*Error: Function owner not recognized*/CURL_OFF_T_C(1));
		} 
		int generatedTv_usec = this.getTv_usec();
		return diff * 1000 + (generatedTv_usec - generatedTv_usec) / 1000/*
		 * Returns: time difference in number of microseconds. For too large diffs it
		 * returns max value.
		 */;
	}
	public Object Curl_timediff_us(curltime older) {
		Object generatedTv_sec = this.getTv_sec();
		timediff_t diff = (timediff_t)generatedTv_sec - generatedTv_sec;
		if (diff >= (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / 1000000)) {
			return /*Error: Function owner not recognized*/CURL_OFF_T_C(-1024);
		}  else if (diff <= ((-/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) - /*Error: Function owner not recognized*/CURL_OFF_T_C(1)) / 1000000)) {
			return (-/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) - /*Error: Function owner not recognized*/CURL_OFF_T_C(1));
		} 
		int generatedTv_usec = this.getTv_usec();
		return diff * 1000000 + generatedTv_usec - generatedTv_usec;
	}
	public Object Curl_pgrsLimitWaitTime(Object cursize, Object startsize, Object limit, curltime now) {
		 size = cursize - startsize;
		timediff_t minimum = new timediff_t();
		timediff_t actual = new timediff_t();
		if (!limit || !size) {
			return 0/*
			   * 'minimum' is the number of milliseconds 'size' should take to download to
			   * stay below 'limit'.
			   */;
		} 
		if (size < /*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / 1000) {
			minimum = (time_t)(/*Error: Function owner not recognized*/CURL_OFF_T_C(1000) * size / limit);
		} else {
				minimum = (time_t)(size / limit);
				if (minimum < /*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) / 1000) {
					minimum *= 1000;
				} else {
						minimum = /*Error: Function owner not recognized*/CURL_OFF_T_C(-1024/*
						   * 'actual' is the time in milliseconds it took to actually download the
						   * last 'size' bytes.
						   */);
				} 
		} 
		actual = now.Curl_timediff(start);
		if (actual < minimum/* if it downloaded the data faster than the limit, make it wait the
		       difference */) {
			return (minimum - actual);
		} 
		return 0/*
		 * Set the number of downloaded bytes so far.
		 */;
	}
	public Object getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(Object newTv_sec) {
		tv_sec = newTv_sec;
	}
	public int getTv_usec() {
		return tv_usec;
	}
	public void setTv_usec(int newTv_usec) {
		tv_usec = newTv_usec;
	}
}
/*
 * Make sure that the first argument (t1) is the more recent time and t2 is
 * the older time, as otherwise you get a weird negative time-diff back...
 *
 * Returns: the time difference in number of milliseconds.
 */
