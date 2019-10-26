package application;

/* when set, no writing should be done but there
                                  might still be data to write */
/* reading is paused */
/* writing is paused */
/* state data for host Negotiate auth */
/* state data for proxy Negotiate auth */
/* data used for the asynch name resolve callback */
public class Curl_async {
	private Byte hostname;
	private int port;
	private Curl_dns_entry dns;
	private int status;
	private Object os_specific;
	private Object done;
	
	public Curl_async(Byte hostname, int port, Curl_dns_entry dns, int status, Object os_specific, Object done) {
		setHostname(hostname);
		setPort(port);
		setDns(dns);
		setStatus(status);
		setOs_specific(os_specific);
		setDone(done);
	}
	public Curl_async() {
	}
	
	/*
	 * destroy_async_data() cleans up async resolver data and thread handle.
	 */
	public void destroy_async_data() {
		Object generatedOs_specific = this.getOs_specific();
		thread_sync_data generatedTsd = td.getTsd();
		Object generatedSock_pair = generatedTsd.getSock_pair();
		connectdata generatedConn = generatedTsd.getConn();
		_CRITICAL_SECTION generatedMtx = generatedTsd.getMtx();
		int generatedDone = generatedTsd.getDone();
		Object generatedThread_hnd = td.getThread_hnd();
		Curl_easy generatedData = conn.getData();
		if (generatedOs_specific) {
			thread_data td = (thread_data)generatedOs_specific;
			int done;
			 sock_rd = generatedSock_pair[0];
			connectdata conn = generatedConn;
			.EnterCriticalSection(generatedMtx);
			done = generatedDone;
			generatedTsd.setDone(1);
			.LeaveCriticalSection(generatedMtx);
			if (!done) {
				ModernizedCProgram.Curl_thread_destroy(generatedThread_hnd);
			} else {
					if (generatedThread_hnd != (HANDLE)0) {
						ModernizedCProgram.Curl_thread_join(generatedThread_hnd);
					} 
					generatedTsd.destroy_thread_sync_data();
					.Curl_cfree(generatedOs_specific);
			} 
			if (conn) {
				generatedData.Curl_multi_closed(sock_rd);
			} 
			.closesocket((sock_rd));
		} 
		this.setOs_specific(((Object)0));
		Byte generatedHostname = this.getHostname();
		.Curl_cfree(generatedHostname);
		this.setHostname(((Object)0/*
		 * init_resolve_thread() starts a new thread that performs the actual
		 * resolve. This function returns before the resolve is done.
		 *
		 * Returns FALSE in case of failure, otherwise TRUE.
		 */));
	}
	/*
	 * Cancel all possibly still on-going resolves for this connection.
	 */
	public Byte getHostname() {
		return hostname;
	}
	public void setHostname(Byte newHostname) {
		hostname = newHostname;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Curl_dns_entry getDns() {
		return dns;
	}
	public void setDns(Curl_dns_entry newDns) {
		dns = newDns;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
	public Object getOs_specific() {
		return os_specific;
	}
	public void setOs_specific(Object newOs_specific) {
		os_specific = newOs_specific;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
}
