package application;

/* 10 - send off the request (part 2) */
/* 11 - done sending off request */
/* 12 - transfer data */
/* 13 - wait because limit-rate exceeded */
/* 14 - post data transfer operation */
/* 15 - operation complete */
/* 16 - the operation complete message is sent */
/* 17 - not a true state, never use this */
/* we support N sockets per easy handle. Set the corresponding bit to what
   action we should wait for */
/* This is the struct known as CURLM on the outside */
public class Curl_multi {
	private long type;
	private Curl_easy easyp;
	private Curl_easy easylp;
	private int num_easy;
	private int num_alive;
	private curl_llist msglist;
	private curl_llist pending;
	private Object socket_cb;
	private Object socket_userp;
	private Object push_cb;
	private Object push_userp;
	private curl_hash hostcache;
	private Curl_tree timetree;
	private curl_hash sockhash;
	private Object multiplexing;
	private Object recheckstate;
	private conncache conn_cache;
	private long maxconnects;
	private long max_host_connections;
	private long max_total_connections;
	private Object timer_cb;
	private Object timer_userp;
	private curltime timer_lastcall;
	private Object in_callback;
	private long max_concurrent_streams;
	
	public Curl_multi(long type, Curl_easy easyp, Curl_easy easylp, int num_easy, int num_alive, curl_llist msglist, curl_llist pending, Object socket_cb, Object socket_userp, Object push_cb, Object push_userp, curl_hash hostcache, Curl_tree timetree, curl_hash sockhash, Object multiplexing, Object recheckstate, conncache conn_cache, long maxconnects, long max_host_connections, long max_total_connections, Object timer_cb, Object timer_userp, curltime timer_lastcall, Object in_callback, long max_concurrent_streams) {
		setType(type);
		setEasyp(easyp);
		setEasylp(easylp);
		setNum_easy(num_easy);
		setNum_alive(num_alive);
		setMsglist(msglist);
		setPending(pending);
		setSocket_cb(socket_cb);
		setSocket_userp(socket_userp);
		setPush_cb(push_cb);
		setPush_userp(push_userp);
		setHostcache(hostcache);
		setTimetree(timetree);
		setSockhash(sockhash);
		setMultiplexing(multiplexing);
		setRecheckstate(recheckstate);
		setConn_cache(conn_cache);
		setMaxconnects(maxconnects);
		setMax_host_connections(max_host_connections);
		setMax_total_connections(max_total_connections);
		setTimer_cb(timer_cb);
		setTimer_userp(timer_userp);
		setTimer_lastcall(timer_lastcall);
		setIn_callback(in_callback);
		setMax_concurrent_streams(max_concurrent_streams);
	}
	public Curl_multi() {
	}
	
	/*
	 * events_setup()
	 *
	 * Do the multi handle setups that only event-based transfers need.
	 */
	/* timer callback */
	/* socket callback */
	/* wait_or_timeout()
	 *
	 * waits for activity on any of the given sockets, or the timeout to trigger.
	 */
	/* populate the fds[] array */
	/* fprintf(stderr, "poll() %d check socket %d\n", numfds, f->fd); */
	/* get the time stamp to use to figure out how long poll takes */
	/* wait for activity or timeout */
	/* reset here */
	/* timeout! */
	/* fprintf(stderr, "call curl_multi_socket_action(TIMEOUT)\n"); */
	/* loop over the monitored sockets to see which ones had activity */
	/* socket activity, tell libcurl */
	/* convert */
	/* If nothing updated the timeout, we decrease it by the spent time.
	         * If it was updated, it has the new timeout time stored already.
	         */
	/* we don't really care about the "msgs_in_queue" value returned in the
	       second argument */
	/* easy_events()
	 *
	 * Runs a transfer in a blocking manner using the events-based API
	 */
	/* this struct is made static to allow it to be used after this function
	     returns and curl_multi_remove_handle() is called */
	/* if running event-based, do some further multi inits */
	/* CURLDEBUG */
	/* when not built with debug, this function doesn't exist */
	public Object easy_transfer() {
		bool done = 0;
		 mcode = CURLM_OK;
		 result = CURLE_OK;
		while (!done && !mcode) {
			int still_running = 0;
			mcode = multi.curl_multi_poll(((Object)0), 0, 1000, ((Object)0));
			if (!mcode) {
				mcode = multi.curl_multi_perform(still_running);
			} 
			if (!mcode && !/* only read 'still_running' if curl_multi_perform() return OK */still_running) {
				int rc;
				 msg = multi.curl_multi_info_read(rc);
				if (msg) {
					result = msg.getData().getResult();
					done = 1;
				} 
			} 
		}
		if (/* Make sure to return some kind of error if there was a multi problem */mcode) {
			result = (mcode == CURLM_OUT_OF_MEMORY) ? CURLE_OUT_OF_MEMORY/* The other multi errors should never happen, so return
			                 something suitably generic */ : CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		return result/*
		 * easy_perform() is the external interface that performs a blocking
		 * transfer as previously setup.
		 *
		 * CONCEPT: This function creates a multi handle, adds the easy handle to it,
		 * runs curl_multi_perform() until the transfer is done, then detaches the
		 * easy handle, destroys the multi handle and returns the easy handle's return
		 * code.
		 *
		 * REALITY: it can't just create and destroy the multi handle that easily. It
		 * needs to keep it around since if this easy handle is used again by this
		 * function, the same multi handle must be re-used so that the same pools and
		 * caches can be used.
		 *
		 * DEBUG: if 'events' is set TRUE, this function will use a replacement engine
		 * instead of curl_multi_perform() and use curl_multi_socket_action().
		 */;
	}
	public Curl_multi Curl_multi_handle(int hashsize, int chashsize) {
		Curl_multi multi = .Curl_ccalloc(1, );
		if (!multi) {
			return ((Object)0);
		} 
		multi.setType(-1024);
		curl_hash generatedHostcache = multi.getHostcache();
		if (generatedHostcache.Curl_mk_dnscache()) {
			;
		} 
		curl_hash generatedSockhash = multi.getSockhash();
		if (generatedSockhash.sh_init(hashsize)) {
			;
		} 
		conncache generatedConn_cache = multi.getConn_cache();
		if (generatedConn_cache.Curl_conncache_init(chashsize)) {
			;
		} 
		curl_llist generatedMsglist = multi.getMsglist();
		generatedMsglist.Curl_llist_init(((Object)0));
		curl_llist generatedPending = multi.getPending();
		generatedPending.Curl_llist_init(((Object)0));
		multi.setMultiplexing(1);
		multi.setMaxconnects(-/* -1 means it not set by user, use the default value */1);
		return multi;
		generatedHostcache.Curl_hash_destroy();
		generatedConn_cache.Curl_conncache_destroy();
		generatedMsglist.Curl_llist_destroy(((Object)0));
		generatedPending.Curl_llist_destroy(((Object)0));
		.Curl_cfree(multi);
		return ((Object)0);
	}
	public Curl_multi curl_multi_init() {
		Curl_multi curl_multi = new Curl_multi();
		return curl_multi.Curl_multi_handle(911, 97);
	}
	public Object Curl_multi_wait(Object extra_fds, int extra_nfds, int timeout_ms, int ret,  extrawait) {
		/* when no socket, wait */Curl_easy data = new Curl_easy();
		[] sockbunch = new ();
		int bitmap;
		int i;
		int nfds = 0;
		int curlfds;
		bool ufds_malloc = 0;
		long timeout_internal;
		int retcode = 0;
		pollfd[] a_few_on_stack = new pollfd();
		pollfd ufds = a_few_on_stack[0];
		long generatedType = (multi).getType();
		if (!((multi) && generatedType == -1024)) {
			return CURLM_BAD_HANDLE;
		} 
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		Curl_easy generatedEasyp = this.getEasyp();
		data = generatedEasyp;
		Object generatedNext = data.getNext();
		while (data) {
			bitmap = data.multi_getsock(sockbunch);
			for (i = 0; i < 5; i++) {
				 s = CURL_SOCKET_BAD;
				if (bitmap & (1 << (i))) {
					++nfds;
					s = sockbunch[i];
				} 
				if (bitmap & (1 << (16 + (i)))) {
					++nfds;
					s = sockbunch[i];
				} 
				if (s == CURL_SOCKET_BAD) {
					break;
				} 
			}
			data = generatedNext;
		}
		(Object)multi.multi_timeout(/* If the internally desired timeout is actually shorter than requested from
		     the outside, then use the shorter time! But only if the internal timer
		     is actually larger than -1! */timeout_internal);
		if ((timeout_internal >= 0) && (timeout_internal < (long)timeout_ms)) {
			timeout_ms = (int)timeout_internal;
		} 
		curlfds = /* number of internal file descriptors */nfds;
		nfds += /* add the externally provided ones */extra_nfds;
		if (nfds > 10/* 'nfds' is a 32 bit value and 'struct pollfd' is typically 8 bytes
		       big, so at 2^29 sockets this value might wrap. When a process gets
		       the capability to actually handle over 500 million sockets this
		       calculation needs a integer overflow check. */) {
			ufds = .Curl_cmalloc(nfds * );
			if (!ufds) {
				return CURLM_OUT_OF_MEMORY;
			} 
			ufds_malloc = 1;
		} 
		nfds = 0/* only do the second loop if we found descriptors in the first stage run
		     above */;
		if (curlfds) {
			data = generatedEasyp;
			while (data) {
				bitmap = data.multi_getsock(sockbunch);
				for (i = 0; i < 5; i++) {
					 s = CURL_SOCKET_BAD;
					if (bitmap & (1 << (i))) {
						ufds[nfds].setFd(sockbunch[i]);
						ufds[nfds].setEvents(-1024);
						++nfds;
						s = sockbunch[i];
					} 
					if (bitmap & (1 << (16 + (i)))) {
						ufds[nfds].setFd(sockbunch[i]);
						ufds[nfds].setEvents(-1024);
						++nfds;
						s = sockbunch[i];
					} 
					if (s == CURL_SOCKET_BAD) {
						break;
					} 
				}
				data = generatedNext;
			}
		} 
		for (i = 0; i < extra_nfds; /* Add external file descriptions from poll-like struct curl_waitfd */i++) {
			ufds[nfds].setFd(extra_fds[i].getFd());
			ufds[nfds].setEvents(0);
			if (extra_fds[i].getEvents() & CURL_WAIT_POLLIN) {
				ufds[nfds].getEvents() |=  -1024;
			} 
			if (extra_fds[i].getEvents() & CURL_WAIT_POLLPRI) {
				ufds[nfds].getEvents() |=  -1024;
			} 
			if (extra_fds[i].getEvents() & CURL_WAIT_POLLOUT) {
				ufds[nfds].getEvents() |=  -1024;
			} 
			++nfds;
		}
		if (nfds) {
			int pollrc;
			pollrc = ufds.Curl_poll(nfds, /* wait... */timeout_ms);
			if (pollrc > 0) {
				retcode = pollrc/* copy revents results from the poll to the curl_multi_wait poll
				         struct, the bit values of the actual underlying poll() implementation
				         may not be the same as the ones in the public libcurl API! */;
				for (i = 0; i < extra_nfds; i++) {
					int mask = 0;
					int r = ufds[curlfds + i].getRevents();
					if (r & -1024) {
						mask |=  CURL_WAIT_POLLIN;
					} 
					if (r & -1024) {
						mask |=  CURL_WAIT_POLLOUT;
					} 
					if (r & -1024) {
						mask |=  CURL_WAIT_POLLPRI;
					} 
					extra_fds[i].setRevents(mask);
				}
			} 
		} 
		if (ufds_malloc) {
			.Curl_cfree(ufds);
		} 
		if (ret) {
			ret = retcode;
		} 
		if (!extrawait || extra_fds || curlfds/* if any socket was checked */) {
			;
		} else {
				long sleep_ms = 0;
				if (!multi.curl_multi_timeout(sleep_ms) && /* Avoid busy-looping when there's nothing particular to wait for */sleep_ms) {
					if (sleep_ms > timeout_ms) {
						sleep_ms = timeout_ms;
					} 
					ModernizedCProgram.Curl_wait_ms((int)sleep_ms);
				} 
		} 
		return CURLM_OK;
	}
	public Object curl_multi_poll(Object extra_fds, int extra_nfds, int timeout_ms, Integer ret) {
		return multi.Curl_multi_wait(extra_fds, extra_nfds, timeout_ms, ret, 1/*
		 * multi_ischanged() is called
		 *
		 * Returns TRUE/FALSE whether the state is changed to trigger a CONNECT_PEND
		 * => CONNECT action.
		 *
		 * Set 'clear' to TRUE to have it also clear the state variable.
		 */);
	}
	public  multi_ischanged( clear) {
		Object generatedRecheckstate = this.getRecheckstate();
		bool retval = generatedRecheckstate;
		if (clear) {
			this.setRecheckstate(0);
		} 
		return retval;
	}
	public Object curl_multi_perform(int running_handles) {
		Curl_easy data = new Curl_easy();
		 returncode = CURLM_OK;
		Curl_tree t = new Curl_tree();
		curltime curltime = new curltime();
		curltime now = curltime.Curl_now();
		long generatedType = (multi).getType();
		if (!((multi) && generatedType == -1024)) {
			return CURLM_BAD_HANDLE;
		} 
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		Curl_easy generatedEasyp = this.getEasyp();
		data = generatedEasyp;
		Object generatedNext = data.getNext();
		while (data) {
			 result = new ();
			;
			do {
			} while (0);
			ModernizedCProgram.result = ModernizedCProgram.multi_runsingle(multi, now, data);
			do {
			} while (0);
			if (ModernizedCProgram.result) {
				returncode = ModernizedCProgram.result;
			} 
			data = generatedNext;
		}
		Curl_tree generatedTimetree = this.getTimetree();
		Object generatedPayload = t.getPayload();
		do {
			this.setTimetree(generatedTimetree.Curl_splaygetbest(now, t));
			if (t) {
				(Object)ModernizedCProgram.add_next_timeout(now, multi, generatedPayload);
			} 
		} while (t);
		int generatedNum_alive = this.getNum_alive();
		running_handles = generatedNum_alive;
		if (CURLM_OK >= returncode) {
			multi.Curl_update_timer();
		} 
		return returncode;
	}
	public Object curl_multi_cleanup() {
		Curl_easy data = new Curl_easy();
		Curl_easy nextdata = new Curl_easy();
		long generatedType = (multi).getType();
		Object generatedIn_callback = this.getIn_callback();
		Curl_easy generatedEasyp = this.getEasyp();
		Object generatedNext = data.getNext();
		Object generatedState = data.getState();
		Object generatedConn = data.getConn();
		Object generatedDns = data.getDns();
		conncache generatedConn_cache = this.getConn_cache();
		curl_hash generatedSockhash = this.getSockhash();
		curl_llist generatedMsglist = this.getMsglist();
		curl_llist generatedPending = this.getPending();
		curl_hash generatedHostcache = this.getHostcache();
		if (((multi) && generatedType == -1024)) {
			if (generatedIn_callback) {
				return CURLM_RECURSIVE_API_CALL;
			} 
			this.setType(/* not good anymore */0);
			data = generatedEasyp;
			while (data) {
				nextdata = generatedNext;
				if (!generatedState.getDone() && generatedConn) {
					(Object)data.multi_done(CURLE_OK, /* if DONE was never called for this handle */1);
				} 
				if (generatedDns.getHostcachetype() == .HCACHE_MULTI) {
					ModernizedCProgram.Curl_hostcache_clean(data, generatedDns.getHostcache());
					generatedDns.setHostcache(((Object)0));
					generatedDns.setHostcachetype(.HCACHE_NONE);
				} 
				generatedState.setConn_cache(((Object)/* Clear the pointer to the connection cache */0));
				data.setMulti(((Object)/* clear the association */0));
				data = nextdata;
			}
			generatedConn_cache.Curl_conncache_close_all_connections();
			generatedSockhash.Curl_hash_destroy();
			generatedConn_cache.Curl_conncache_destroy();
			generatedMsglist.Curl_llist_destroy(((Object)0));
			generatedPending.Curl_llist_destroy(((Object)0));
			generatedHostcache.Curl_hash_destroy();
			;
			.Curl_cfree(multi);
			return CURLM_OK;
		} 
		return CURLM_BAD_HANDLE/*
		 * curl_multi_info_read()
		 *
		 * This function is the primary way for a multi/multi_socket application to
		 * figure out if a transfer has ended. We MUST make this function as fast as
		 * possible as it will be polled frequently and we MUST NOT scan any lists in
		 * here to figure out things. We must scale fine to thousands of handles and
		 * beyond. The current design is fully O(1).
		 */;
	}
	public Object curl_multi_info_read(int msgs_in_queue) {
		Curl_message msg = new Curl_message();
		msgs_in_queue = /* default to none */0;
		long generatedType = (multi).getType();
		Object generatedIn_callback = this.getIn_callback();
		curl_llist generatedMsglist = this.getMsglist();
		curl_llist_element generatedHead = generatedMsglist.getHead();
		Object generatedPtr = e.getPtr();
		CURLMsg generatedExtmsg = msg.getExtmsg();
		if (((multi) && generatedType == -1024) && !generatedIn_callback && generatedMsglist.Curl_llist_count()) {
			curl_llist_element e = new curl_llist_element();
			e = generatedHead;
			msg = generatedPtr;
			ModernizedCProgram.Curl_llist_remove(generatedMsglist, e, ((Object)/* remove the extracted entry */0));
			msgs_in_queue = ModernizedCProgram.curlx_uztosi(generatedMsglist.Curl_llist_count());
			return generatedExtmsg;
		} 
		return ((Object)0/*
		 * singlesocket() checks what sockets we deal with and their "action state"
		 * and if we have a different state in any of those sockets from last time we
		 * call the callback accordingly.
		 */);
	}
	public Object multi_socket( checkall, Object s, int ev_bitmask, int running_handles) {
		 result = CURLM_OK;
		Curl_easy data = ((Object)0);
		Curl_tree t = new Curl_tree();
		curltime curltime = new curltime();
		curltime now = curltime.Curl_now();
		Curl_easy generatedEasyp = this.getEasyp();
		Object generatedNext = data.getNext();
		if (checkall) {
			result = multi.curl_multi_perform(/* *perform() deals with running_handles on its own */running_handles);
			if (result != /* walk through each easy handle and do the socket state change magic
			       and callbacks */CURLM_BAD_HANDLE) {
				data = generatedEasyp;
				while (data && !result) {
					result = ModernizedCProgram.singlesocket(multi, data);
					data = generatedNext;
				}
			} 
			return /* or should we fall-through and do the timer-based stuff? */result;
		} 
		curl_hash generatedSockhash = this.getSockhash();
		Curl_sh_entry curl_sh_entry = new Curl_sh_entry();
		curl_hash generatedTransfers = entry.getTransfers();
		Object generatedPtr = he.getPtr();
		Object generatedConn = data.getConn();
		curl_hash_element curl_hash_element = new curl_hash_element();
		curltime generatedTimer_lastcall = this.getTimer_lastcall();
		if (s != CURL_SOCKET_TIMEOUT) {
			Curl_sh_entry entry = curl_sh_entry.sh_getentry(generatedSockhash, s);
			if (!entry/* Unmatched socket, we can't act on it but we ignore this fact.  In
			         real-world tests it has been proved that libevent can in fact give
			         the application actions even though the socket was just previously
			         asked to get removed, so thus we better survive stray socket actions
			         and just move on. */) {
				;
			} else {
					curl_hash_iterator iter = new curl_hash_iterator();
					curl_hash_element he = new curl_hash_element();
					ModernizedCProgram.Curl_hash_start_iterate(generatedTransfers, /* the socket can be shared by many transfers, iterate */iter);
					for (he = curl_hash_element.Curl_hash_next_element(iter); he; he = curl_hash_element.Curl_hash_next_element(iter)) {
						data = (Curl_easy)generatedPtr;
						do {
						} while (0);
						do {
						} while (0);
						if (generatedConn && !(generatedConn.getHandler().getFlags() & (1 << 3))) {
							generatedConn.setCselect_bits(/* set socket event bitmask if they're not locked */ev_bitmask);
						} 
						data.Curl_expire(0, .EXPIRE_RUN_NOW/* Now we fall-through and do the timer-based stuff, since we don't want
						         to force the user to have to deal with timeouts as long as at least
						         one connection in fact has traffic. */);
					}
					data = ((Object)/* set data to NULL again to avoid calling
					                      multi_runsingle() in case there's no need to */0);
					now = curltime.Curl_now();
			} 
		} else {
				.memset(generatedTimer_lastcall, 0, );
		} 
		Curl_tree generatedTimetree = this.getTimetree();
		Object generatedPayload = t.getPayload();
		do {
			if (/* the first loop lap 'data' can be NULL */data) {
				;
				do {
				} while (0);
				result = ModernizedCProgram.multi_runsingle(multi, now, data);
				do {
				} while (0);
				if (CURLM_OK >= result/* get the socket(s) and check if the state has been changed since
				           last */) {
					result = ModernizedCProgram.singlesocket(multi, data);
					if (result) {
						return result;
					} 
				} 
			} 
			this.setTimetree(generatedTimetree.Curl_splaygetbest(now, /* Check if there's one (more) expired timer to deal with! This function
			       extracts a matching node if there is one */t));
			if (t) {
				data = generatedPayload;
				(Object)ModernizedCProgram.add_next_timeout(now, multi, generatedPayload);
			} 
		} while (t);
		int generatedNum_alive = this.getNum_alive();
		running_handles = generatedNum_alive;
		return result;
	}
	public Object curl_multi_setopt(Object option) {
		 res = CURLM_OK;
		va_list param = new va_list();
		long generatedType = (multi).getType();
		if (!((multi) && generatedType == -1024)) {
			return CURLM_BAD_HANDLE;
		} 
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		.__builtin_va_start(param, option);
		switch (option) {
		case CURLMOPT_SOCKETFUNCTION:
				this.setSocket_cb((int)param);
				break;
		case CURLMOPT_MAXCONNECTS:
				this.setMaxconnects((int)param);
				break;
		case CURLMOPT_SOCKETDATA:
				this.setSocket_userp((int)param);
				break;
		case CURLMOPT_MAX_HOST_CONNECTIONS:
				this.setMax_host_connections((int)param);
				break;
		case CURLMOPT_TIMERFUNCTION:
				this.setTimer_cb((int)param);
				break;
		case CURLMOPT_TIMERDATA:
				this.setTimer_userp((int)param);
				break;
		case CURLMOPT_MAX_CONCURRENT_STREAMS:
				{ 
					long streams = (int)param;
					if (streams < 1) {
						streams = 100;
					} 
					this.setMax_concurrent_streams((streams > (long)INITIAL_MAX_CONCURRENT_STREAMS) ? (long)INITIAL_MAX_CONCURRENT_STREAMS : streams);
				}
				break;
		case /* options formerly used for pipelining */CURLMOPT_MAX_PIPELINE_LENGTH:
				break;
		case CURLMOPT_PIPELINING:
				this.setMultiplexing((int)param & CURLPIPE_MULTIPLEX);
				break;
		case CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE:
				break;
		case CURLMOPT_PIPELINING_SITE_BL:
				break;
		case CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE:
				break;
		case CURLMOPT_PUSHDATA:
				this.setPush_userp((int)param);
				break;
		case CURLMOPT_PIPELINING_SERVER_BL:
				break;
		case CURLMOPT_PUSHFUNCTION:
				this.setPush_cb((int)param);
				break;
		case CURLMOPT_MAX_TOTAL_CONNECTIONS:
				this.setMax_total_connections((int)param);
				break;
		default:
				res = CURLM_UNKNOWN_OPTION;
				break;
		}
		.__builtin_va_end(param);
		return res/* we define curl_multi_socket() in the public multi.h header */;
	}
	public Object curl_multi_socket(Object s, Integer running_handles) {
		 result = new ();
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		result = multi.multi_socket(0, s, 0, running_handles);
		if (CURLM_OK >= result) {
			multi.Curl_update_timer();
		} 
		return result;
	}
	public Object curl_multi_socket_action(Object s, int ev_bitmask, Integer running_handles) {
		 result = new ();
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		result = multi.multi_socket(0, s, ev_bitmask, running_handles);
		if (CURLM_OK >= result) {
			multi.Curl_update_timer();
		} 
		return result;
	}
	public Object curl_multi_socket_all(Integer running_handles) {
		 result = new ();
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		result = multi.multi_socket(1, CURL_SOCKET_BAD, 0, running_handles);
		if (CURLM_OK >= result) {
			multi.Curl_update_timer();
		} 
		return result;
	}
	public Object multi_timeout(long timeout_ms) {
		curltime tv_zero = new curltime(0, 0);
		Curl_tree generatedTimetree = this.getTimetree();
		curltime curltime = new curltime();
		curltime generatedKey = generatedTimetree.getKey();
		Object generatedTv_sec = generatedKey.getTv_sec();
		int generatedTv_usec = generatedKey.getTv_usec();
		if (generatedTimetree) {
			curltime now = curltime.Curl_now();
			this.setTimetree(generatedTimetree.Curl_splay(tv_zero));
			if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) > 0) {
				timediff_t diff = generatedKey.Curl_timediff(/* some time left before expiration */now);
				if (diff <= 0/*
				         * Since we only provide millisecond resolution on the returned value
				         * and the diff might be less than one millisecond here, we don't
				         * return zero as that may cause short bursts of busyloops on fast
				         * processors while the diff is still present but less than one
				         * millisecond! instead we return 1 until the time is ripe.
				         */) {
					timeout_ms = 1;
				} else {
						timeout_ms = (long)/* this should be safe even on 64 bit archs, as we don't use that
						           overly long timeouts */diff;
				} 
			} else {
					timeout_ms = /* 0 means immediately */0;
			} 
		} else {
				timeout_ms = -1;
		} 
		return CURLM_OK;
	}
	public Object curl_multi_timeout(Long timeout_ms) {
		long generatedType = (multi).getType();
		if (!((multi) && generatedType == /* First, make some basic checks that the CURLM handle is a good handle */-1024)) {
			return CURLM_BAD_HANDLE;
		} 
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		return multi.multi_timeout(timeout_ms/*
		 * Tell the application it should update its timers, if it subscribes to the
		 * update timer callback.
		 */);
	}
	public void Curl_update_timer() {
		long timeout_ms;
		Object generatedTimer_cb = this.getTimer_cb();
		if (!generatedTimer_cb) {
			return ;
		} 
		if (multi.multi_timeout(timeout_ms)) {
			return ;
		} 
		curltime generatedTimer_lastcall = this.getTimer_lastcall();
		Object generatedTv_sec = generatedTimer_lastcall.getTv_sec();
		int generatedTv_usec = generatedTimer_lastcall.getTv_usec();
		Object generatedTimer_userp = this.getTimer_userp();
		if (timeout_ms < 0) {
			curltime none = new curltime(0, 0);
			if ((((none.getTv_sec()) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((none.getTv_usec()) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0))))) {
				this.setTimer_lastcall(none/* there's no timeout now but there was one previously, tell the app to
				         disable it */);
				.UNRECOGNIZEDFUNCTIONNAME(multi, -1, generatedTimer_userp);
				return ;
			} 
			return ;
		} 
		if ((((generatedTv_sec) < (generatedTv_sec)) ? -1 : (((generatedTv_sec) > (generatedTv_sec)) ? 1 : (((generatedTv_usec) < (generatedTv_usec)) ? -1 : (((generatedTv_usec) > (generatedTv_usec)) ? 1 : 0)))) == 0) {
			return ;
		} 
		Curl_tree generatedTimetree = this.getTimetree();
		curltime generatedKey = generatedTimetree.getKey();
		this.setTimer_lastcall(generatedKey);
		.UNRECOGNIZEDFUNCTIONNAME(multi, timeout_ms, generatedTimer_userp);
	}
	public Object curl_multi_assign(Object s, Object hashp) {
		Curl_sh_entry there = ((Object)0);
		Object generatedIn_callback = this.getIn_callback();
		if (generatedIn_callback) {
			return CURLM_RECURSIVE_API_CALL;
		} 
		curl_hash generatedSockhash = this.getSockhash();
		Curl_sh_entry curl_sh_entry = new Curl_sh_entry();
		there = curl_sh_entry.sh_getentry(generatedSockhash, s);
		if (!there) {
			return CURLM_BAD_SOCKET;
		} 
		there.setSocketp(hashp);
		return CURLM_OK;
	}
	public Object Curl_multi_max_host_connections() {
		long generatedMax_host_connections = this.getMax_host_connections();
		return multi ? generatedMax_host_connections : 0;
	}
	public Object Curl_multi_max_total_connections() {
		long generatedMax_total_connections = this.getMax_total_connections();
		return multi ? generatedMax_total_connections : 0/*
		 * When information about a connection has appeared, call this!
		 */;
	}
	public void process_pending_handles() {
		curl_llist generatedPending = this.getPending();
		curl_llist_element generatedHead = generatedPending.getHead();
		curl_llist_element e = generatedHead;
		Object generatedPtr = e.getPtr();
		if (e) {
			Curl_easy data = generatedPtr;
			do {
			} while (0);
			ModernizedCProgram.data.mstate(.CURLM_STATE_CONNECT);
			ModernizedCProgram.Curl_llist_remove(generatedPending, e, ((Object)/* Remove this node from the list */0));
			ModernizedCProgram.data.Curl_expire(0, /* Make sure that the handle will be processed soonish. */.EXPIRE_RUN_NOW);
			ModernizedCProgram.data.getState().setPreviouslypending(/* mark this as having been in the pending queue */1);
		} 
	}
	public Object Curl_multi_max_concurrent_streams() {
		long generatedMax_concurrent_streams = this.getMax_concurrent_streams();
		return multi ? ((size_t)generatedMax_concurrent_streams ? (size_t)generatedMax_concurrent_streams : 100) : 0;
	}
	public long getType() {
		return type;
	}
	public void setType(long newType) {
		type = newType;
	}
	public Curl_easy getEasyp() {
		return easyp;
	}
	public void setEasyp(Curl_easy newEasyp) {
		easyp = newEasyp;
	}
	public Curl_easy getEasylp() {
		return easylp;
	}
	public void setEasylp(Curl_easy newEasylp) {
		easylp = newEasylp;
	}
	public int getNum_easy() {
		return num_easy;
	}
	public void setNum_easy(int newNum_easy) {
		num_easy = newNum_easy;
	}
	public int getNum_alive() {
		return num_alive;
	}
	public void setNum_alive(int newNum_alive) {
		num_alive = newNum_alive;
	}
	public curl_llist getMsglist() {
		return msglist;
	}
	public void setMsglist(curl_llist newMsglist) {
		msglist = newMsglist;
	}
	public curl_llist getPending() {
		return pending;
	}
	public void setPending(curl_llist newPending) {
		pending = newPending;
	}
	public Object getSocket_cb() {
		return socket_cb;
	}
	public void setSocket_cb(Object newSocket_cb) {
		socket_cb = newSocket_cb;
	}
	public Object getSocket_userp() {
		return socket_userp;
	}
	public void setSocket_userp(Object newSocket_userp) {
		socket_userp = newSocket_userp;
	}
	public Object getPush_cb() {
		return push_cb;
	}
	public void setPush_cb(Object newPush_cb) {
		push_cb = newPush_cb;
	}
	public Object getPush_userp() {
		return push_userp;
	}
	public void setPush_userp(Object newPush_userp) {
		push_userp = newPush_userp;
	}
	public curl_hash getHostcache() {
		return hostcache;
	}
	public void setHostcache(curl_hash newHostcache) {
		hostcache = newHostcache;
	}
	public Curl_tree getTimetree() {
		return timetree;
	}
	public void setTimetree(Curl_tree newTimetree) {
		timetree = newTimetree;
	}
	public curl_hash getSockhash() {
		return sockhash;
	}
	public void setSockhash(curl_hash newSockhash) {
		sockhash = newSockhash;
	}
	public Object getMultiplexing() {
		return multiplexing;
	}
	public void setMultiplexing(Object newMultiplexing) {
		multiplexing = newMultiplexing;
	}
	public Object getRecheckstate() {
		return recheckstate;
	}
	public void setRecheckstate(Object newRecheckstate) {
		recheckstate = newRecheckstate;
	}
	public conncache getConn_cache() {
		return conn_cache;
	}
	public void setConn_cache(conncache newConn_cache) {
		conn_cache = newConn_cache;
	}
	public long getMaxconnects() {
		return maxconnects;
	}
	public void setMaxconnects(long newMaxconnects) {
		maxconnects = newMaxconnects;
	}
	public long getMax_host_connections() {
		return max_host_connections;
	}
	public void setMax_host_connections(long newMax_host_connections) {
		max_host_connections = newMax_host_connections;
	}
	public long getMax_total_connections() {
		return max_total_connections;
	}
	public void setMax_total_connections(long newMax_total_connections) {
		max_total_connections = newMax_total_connections;
	}
	public Object getTimer_cb() {
		return timer_cb;
	}
	public void setTimer_cb(Object newTimer_cb) {
		timer_cb = newTimer_cb;
	}
	public Object getTimer_userp() {
		return timer_userp;
	}
	public void setTimer_userp(Object newTimer_userp) {
		timer_userp = newTimer_userp;
	}
	public curltime getTimer_lastcall() {
		return timer_lastcall;
	}
	public void setTimer_lastcall(curltime newTimer_lastcall) {
		timer_lastcall = newTimer_lastcall;
	}
	public Object getIn_callback() {
		return in_callback;
	}
	public void setIn_callback(Object newIn_callback) {
		in_callback = newIn_callback;
	}
	public long getMax_concurrent_streams() {
		return max_concurrent_streams;
	}
	public void setMax_concurrent_streams(long newMax_concurrent_streams) {
		max_concurrent_streams = newMax_concurrent_streams;
	}
}
/* First a simple identifier to easier detect if a user mix up
     this multi handle with an easy handle. Set this to CURL_MULTI_HANDLE. */
