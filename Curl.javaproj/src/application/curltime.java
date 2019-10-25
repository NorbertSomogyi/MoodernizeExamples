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
	
	public Object Curl_pgrsLimitWaitTime(Object cursize, Object startsize, Object limit, curltime now) {
		curl_off_t size = cursize - startsize;
		timediff_t minimum = new timediff_t();
		timediff_t actual = new timediff_t();
		if (!limit || !size) {
			return 0/*
			   * 'minimum' is the number of milliseconds 'size' should take to download to
			   * stay below 'limit'.
			   */;
		} 
		if (size < -1024 / 1000) {
			minimum = (time_t)(-1024 * size / limit);
		} else {
				minimum = (time_t)(size / limit);
				if (minimum < -1024 / 1000) {
					minimum *= 1000;
				} else {
						minimum = -1024/*
						   * 'actual' is the time in milliseconds it took to actually download the
						   * last 'size' bytes.
						   */;
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
	public void Curl_ratelimit(Object data) {
		if (data.getSet().getMax_recv_speed() > /* don't set a new stamp unless the time since last update is long enough */0) {
			if (now.Curl_timediff(data.getProgress().getDl_limit_start()) >= 3000) {
				data.getProgress().setDl_limit_start(now);
				data.getProgress().setDl_limit_size(data.getProgress().getDownloaded());
			} 
		} 
		if (data.getSet().getMax_send_speed() > 0) {
			if (now.Curl_timediff(data.getProgress().getUl_limit_start()) >= 3000) {
				data.getProgress().setUl_limit_start(now);
				data.getProgress().setUl_limit_size(data.getProgress().getUploaded());
			} 
		} 
	}
	/* returns TRUE if it's time to show the progress meter */
	public  progress_calc(Object conn) {
		curl_off_t timespent = new curl_off_t();
		/* milliseconds */curl_off_t timespent_ms = new curl_off_t();
		Curl_easy data = conn.getData();
		curl_off_t dl = data.getProgress().getDownloaded();
		curl_off_t ul = data.getProgress().getUploaded();
		bool timetoshow = 0;
		data.getProgress().setTimespent(now.Curl_timediff_us(data.getProgress().getStart()));
		timespent = (curl_off_t)data.getProgress().getTimespent() / /* seconds */1000000;
		timespent_ms = (curl_off_t)data.getProgress().getTimespent() / /* ms */1000;
		if (dl < -1024 / /* The average download speed this far */1000) {
			data.getProgress().setDlspeed((dl * 1000 / (timespent_ms > 0 ? timespent_ms : 1)));
		} else {
				data.getProgress().setDlspeed((dl / (timespent > 0 ? timespent : 1)));
		} 
		if (ul < -1024 / /* The average upload speed this far */1000) {
			data.getProgress().setUlspeed((ul * 1000 / (timespent_ms > 0 ? timespent_ms : 1)));
		} else {
				data.getProgress().setUlspeed((ul / (timespent > 0 ? timespent : 1)));
		} 
		Object generatedTv_sec = this.getTv_sec();
		if (data.getProgress().getLastshow() != generatedTv_sec) {
			int countindex;
			int nowindex = data.getProgress().getSpeeder_c() % (5 + 1);
			data.getProgress().setLastshow(generatedTv_sec);
			timetoshow = 1;
			data.getProgress().getSpeeder()[/* Let's do the "current speed" thing, with the dl + ul speeds
			       combined. Store the speed at entry 'nowindex'. */nowindex] = data.getProgress().getDownloaded() + data.getProgress().getUploaded();
			data.getProgress().getSpeeder_time()[nowindex] = /* remember the exact time for this moment */now;
			data.getProgress().getSpeeder_c()++;
			countindex = ((data.getProgress().getSpeeder_c() >= (5 + 1)) ? (5 + 1) : data.getProgress().getSpeeder_c()) - 1;
			if (/* first of all, we don't do this if there's no counted seconds yet */countindex) {
				int checkindex;
				timediff_t span_ms = new timediff_t();
				checkindex = (data.getProgress().getSpeeder_c() >= (5 + 1)) ? data.getProgress().getSpeeder_c() % (5 + 1) : 0;
				span_ms = now.Curl_timediff(data.getProgress().getSpeeder_time()[/* Figure out the exact time for the time span */checkindex]);
				if (0 == span_ms) {
					span_ms = /* at least one millisecond MUST have passed */1;
				} 
				{ 
					curl_off_t amount = data.getProgress().getSpeeder()[/* Calculate the average speed the last 'span_ms' milliseconds */nowindex] - data.getProgress().getSpeeder()[checkindex];
					if (amount > /* 0xffffffff/1000 */-1024/* the 'amount' value is bigger than would fit in 32 bits if
					             multiplied with 1000, so we use the double math for this */) {
						data.getProgress().setCurrent_speed((curl_off_t)((double)amount / ((double)span_ms / 1000.0)));
					} else {
							data.getProgress().setCurrent_speed(amount * -1024 / /* the 'amount' value is small enough to fit within 32 bits even
							             when multiplied with 1000 */span_ms);
					} 
				}
			} else {
					data.getProgress().setCurrent_speed(data.getProgress().getUlspeed() + data.getProgress().getDlspeed());
			} 
		} 
		return /* Calculations end */timetoshow;
	}
	/* A connection has to have been idle for a shorter time than 'maxage_conn' to
	   be subject for reuse. The success rate is just too low after this. */
	public  conn_maxage(Object data, Object conn) {
		if (!conn.getData()) {
			timediff_t idletime = now.Curl_timediff(conn.getLastused());
			idletime /= /* integer seconds is fine */1000;
			if (idletime > data.getSet().getMaxage_conn()) {
				ModernizedCProgram.Curl_infof(data, "Too old connection (%ld seconds), disconnect it\n", idletime);
				return 1;
			} 
		} 
		return 0/*
		 * This function checks if the given connection is dead and extracts it from
		 * the connection cache if so.
		 *
		 * When this is called as a Curl_conncache_foreach() callback, the connection
		 * cache lock is held!
		 *
		 * Returns TRUE if the connection was dead and extracted.
		 */;
	}
	public Object Curl_splay(Object t) {
		Curl_tree N = new Curl_tree();
		Curl_tree l = new Curl_tree();
		Curl_tree r = new Curl_tree();
		Curl_tree y = new Curl_tree();
		if (t == ((Object)0)) {
			return t;
		} 
		N.setSmaller(N.setLarger(((Object)0)));
		l = r = N;
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		for (; ; ) {
			long comp = (((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0))));
			if (comp < 0) {
				if (t.getSmaller() == ((Object)0)) {
					break;
				} 
				if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
					y = t.getSmaller();
					t.setSmaller(y.getLarger());
					y.setLarger(t);
					t = y;
					if (t.getSmaller() == ((Object)0)) {
						break;
					} 
				} 
				r.setSmaller(/* link smaller */t);
				r = t;
				t = t.getSmaller();
			}  else if (comp > 0) {
				if (t.getLarger() == ((Object)0)) {
					break;
				} 
				if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) > 0) {
					y = t.getLarger();
					t.setLarger(y.getSmaller());
					y.setSmaller(t);
					t = y;
					if (t.getLarger() == ((Object)0)) {
						break;
					} 
				} 
				l.setLarger(/* link larger */t);
				l = t;
				t = t.getLarger();
			} else {
					break;
			} 
		}
		l.setLarger(t.getSmaller());
		r.setSmaller(t.getLarger());
		Object generatedLarger = N.getLarger();
		t.setSmaller(generatedLarger);
		Object generatedSmaller = N.getSmaller();
		t.setLarger(generatedSmaller);
		return t/* Insert key i into the tree t.  Return a pointer to the resulting tree or
		 * NULL if something went wrong.
		 *
		 * @unittest: 1309
		 */;
	}
	public Object Curl_splayinsert(Object t, Object node) {
		curltime KEY_NOTUSED = new curltime((time_t)-1, (int)-1/* will *NEVER* appear */);
		if (node == ((Object)0)) {
			return t;
		} 
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		if (t != ((Object)0)) {
			t = i.Curl_splay(t);
			if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) == 0/* There already exists a node in the tree with the very same key. Build
			         a doubly-linked circular list of nodes. We add the new 'node' struct
			         to the end of this list. */) {
				node.setKey(/* we set the key in the sub node to NOTUSED
				                                  to quickly identify this node as a subnode */KEY_NOTUSED);
				node.setSamen(t);
				node.setSamep(t.getSamep());
				t.getSamep().setSamen(node);
				t.setSamep(node);
				return /* the root node always stays the same */t;
			} 
		} 
		if (t == ((Object)0)) {
			node.setSmaller(node.setLarger(((Object)0)));
		}  else if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
			node.setSmaller(t.getSmaller());
			node.setLarger(t);
			t.setSmaller(((Object)0));
		} else {
				node.setLarger(t.getLarger());
				node.setSmaller(t);
				t.setLarger(((Object)0));
		} 
		node.setKey(i);
		node.setSamen(/* no identical nodes (yet), we are the only one in the list of nodes */node);
		node.setSamep(node);
		return node/* Finds and deletes the best-fit node from the tree. Return a pointer to the
		   resulting tree.  best-fit means the smallest node if it is not larger than
		   the key */;
	}
	public Object Curl_splaygetbest(Object t, Object removed) {
		curltime tv_zero = new curltime(0, 0);
		Curl_tree x = new Curl_tree();
		if (!t) {
			removed = ((Object)/* none removed since there was no root */0);
			return ((Object)0);
		} 
		t = tv_zero.Curl_splay(/* find smallest */t);
		Object generatedTv_sec = (i).getTv_sec();
		int generatedTv_usec = (i).getTv_usec();
		if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) < 0) {
			removed = ((Object)/* even the smallest is too big */0);
			return t;
		} 
		x = t.getSamen();
		if (x != t/* there is, pick one from the list */) {
			x.setKey(t.getKey());
			x.setLarger(t.getLarger());
			x.setSmaller(t.getSmaller());
			x.setSamep(t.getSamep());
			t.getSamep().setSamen(x);
			removed = t;
			return /* new root */x;
		} 
		x = t.getLarger();
		removed = t;
		return x/* Deletes the very node we point out from the tree if it's there. Stores a
		 * pointer to the new resulting tree in 'newroot'.
		 *
		 * Returns zero on success and non-zero on errors!
		 * When returning error, it does not touch the 'newroot' pointer.
		 *
		 * NOTE: when the last node of the tree is removed, there's no tree left so
		 * 'newroot' will be made to point to NULL.
		 *
		 * @unittest: 1309
		 */;
	}
	public  multi_runsingle(Object multi, Object data) {
		Curl_message msg = ((Object)0);
		bool connected = new bool();
		bool async = new bool();
		bool protocol_connected = 0;
		bool dophase_done = 0;
		bool done = 0;
		CURLMcode rc = new CURLMcode();
		CURLcode result = .CURLE_OK;
		timediff_t timeout_ms = new timediff_t();
		timediff_t recv_timeout_ms = new timediff_t();
		timediff_t send_timeout_ms = new timediff_t();
		int control;
		if (!((data) && ((data).getMagic() == -1024))) {
			return .CURLM_BAD_EASY_HANDLE;
		} 
		data.setResult(result);
		return rc;
	}
	public  add_next_timeout(Object multi, Object d) {
		curltime tv = d.getState().getExpiretime();
		curl_llist list = d.getState().getTimeoutlist();
		curl_llist_element e = new curl_llist_element();
		time_node node = ((Object)0/* move over the timeout list for this specific handle and remove all
		     timeouts that are now passed tense and store the next pending
		     timeout in *tv */);
		for (e = list.getHead(); e; ) {
			curl_llist_element n = e.getNext();
			timediff_t diff = new timediff_t();
			node = (time_node)e.getPtr();
			diff = node.getTime().Curl_timediff(now);
			if (diff <= 0) {
				ModernizedCProgram.Curl_llist_remove(list, e, ((Object)/* remove outdated entry */0));
			} else {
					break;
			} 
			e = n;
		}
		e = list.getHead();
		if (!e/* clear the expire times within the handles that we remove from the
		       splay tree */) {
			tv.setTv_sec(0);
			tv.setTv_usec(0);
		} else {
				.memcpy(tv, node.getTime(), );
				multi.setTimetree(tv.Curl_splayinsert(multi.getTimetree(), d.getState().getTimenode()));
		} 
		return .CURLM_OK;
	}
	public curltime Curl_now() {
		curltime now = new curltime();
		Object generatedQuadPart = count.getQuadPart();
		if (/* QPC timer might have issues pre-Vista */ModernizedCProgram.Curl_isVistaOrGreater) {
			LARGE_INTEGER count = new LARGE_INTEGER();
			.QueryPerformanceCounter(count);
			now.setTv_sec((time_t)(generatedQuadPart / generatedQuadPart));
			now.setTv_usec((int)((generatedQuadPart % generatedQuadPart) * 1000000 / generatedQuadPart));
		} else {
				DWORD milliseconds = .GetTickCount();
				now.setTv_sec(milliseconds / 1000);
				now.setTv_usec((milliseconds % 1000) * 1000);
		} 
		return now/*
		  ** clock_gettime() is granted to be increased monotonically when the
		  ** monotonic clock is queried. Time starting point is unspecified, it
		  ** could be the system start-up time, the Epoch, or something else,
		  ** in any case the time starting point does not change once that the
		  ** system has started up.
		  *//*
		  ** clock_gettime() may be defined by Apple's SDK as weak symbol thus
		  ** code compiles but fails during run-time if clock_gettime() is
		  ** called on unsupported OS version.
		  *//*
		  ** Even when the configure process has truly detected monotonic clock
		  ** availability, it might happen that it is not actually available at
		  ** run-time. When this occurs simply fallback to other time source.
		  */;
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
		if (diff >= (-1024 / 1000)) {
			return -1024;
		}  else if (diff <= ((--1024 - -1024) / 1000)) {
			return (--1024 - -1024);
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
		if (diff >= (-1024 / 1000000)) {
			return -1024;
		}  else if (diff <= ((--1024 - -1024) / 1000000)) {
			return (--1024 - -1024);
		} 
		int generatedTv_usec = this.getTv_usec();
		return diff * 1000000 + generatedTv_usec - generatedTv_usec;
	}
	public  Curl_speedcheck(Object data) {
		if ((data.getProgress().getCurrent_speed() >= 0) && data.getSet().getLow_speed_time()) {
			if (data.getProgress().getCurrent_speed() < data.getSet().getLow_speed_limit()) {
				if (!data.getState().getKeeps_speed().getTv_sec()) {
					data.getState().setKeeps_speed(/* under the limit at this very moment */now);
				} else {
						timediff_t howlong = now.Curl_timediff(data.getState().getKeeps_speed());
						if (howlong >= data.getSet().getLow_speed_time() * 1000) {
							ModernizedCProgram.Curl_failf(/* too long */data, "Operation too slow. Less than %ld bytes/sec transferred the last %ld seconds", data.getSet().getLow_speed_limit(), data.getSet().getLow_speed_time());
							return .CURLE_OPERATION_TIMEDOUT;
						} 
				} 
			} else {
					data.getState().getKeeps_speed().setTv_sec(/* faster right now */0);
			} 
		} 
		if (data.getSet().getLow_speed_limit()) {
			ModernizedCProgram.Curl_expire(data, 1000, .EXPIRE_SPEEDCHECK);
		} 
		return .CURLE_OK;
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
