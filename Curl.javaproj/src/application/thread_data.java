package application;

/* for thread-self cleanup */
public class thread_data {
	private Object thread_hnd;
	private int poll_interval;
	private Object interval_end;
	private thread_sync_data tsd;
	
	public thread_data(Object thread_hnd, int poll_interval, Object interval_end, thread_sync_data tsd) {
		setThread_hnd(thread_hnd);
		setPoll_interval(poll_interval);
		setInterval_end(interval_end);
		setTsd(tsd);
	}
	public thread_data() {
	}
	
	/* Initialize resolver thread synchronization data */
	public int init_thread_sync_data(Object hostname, int port, Object hints) {
		thread_sync_data generatedTsd = this.getTsd();
		thread_sync_data tsd = generatedTsd;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tsd, 0, /*Error: sizeof expression not supported yet*/);
		tsd.setTd(td);
		tsd.setPort(port/* Treat the request as done until the thread actually starts so any early
		   * cleanup gets done properly.
		   */);
		tsd.setDone(1);
		(Object)hints;
		tsd.setMtx(/*Error: Function owner not recognized*/Curl_cmalloc(/*Error: Unsupported expression*/));
		_CRITICAL_SECTION generatedMtx = tsd.getMtx();
		if (generatedMtx == ((Object)0)) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/InitializeCriticalSection(generatedMtx);
		Object generatedSock_pair = tsd.getSock_pair();
		if (ModernizedCProgram.Curl_socketpair(1, 1, 0, generatedSock_pair[0]) < /* create socket pair, avoid AF_LOCAL since it doesn't build on Solaris */0) {
			generatedSock_pair[0] = CURL_SOCKET_BAD;
			generatedSock_pair[1] = CURL_SOCKET_BAD;
			;
		} 
		tsd.setSock_error(CURLE_OK/* Copying hostname string because original can be destroyed by parent
		   * thread during gethostbyname execution.
		   */);
		tsd.setHostname(/*Error: Function owner not recognized*/Curl_cstrdup(hostname));
		Byte generatedHostname = tsd.getHostname();
		if (!generatedHostname) {
			;
		} 
		return 1;
		return 0;
	}
	public Object getThread_hnd() {
		return thread_hnd;
	}
	public void setThread_hnd(Object newThread_hnd) {
		thread_hnd = newThread_hnd;
	}
	public int getPoll_interval() {
		return poll_interval;
	}
	public void setPoll_interval(int newPoll_interval) {
		poll_interval = newPoll_interval;
	}
	public Object getInterval_end() {
		return interval_end;
	}
	public void setInterval_end(Object newInterval_end) {
		interval_end = newInterval_end;
	}
	public thread_sync_data getTsd() {
		return tsd;
	}
	public void setTsd(thread_sync_data newTsd) {
		tsd = newTsd;
	}
}
