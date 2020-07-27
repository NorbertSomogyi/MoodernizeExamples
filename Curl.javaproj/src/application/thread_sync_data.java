package application;

/* Data for synchronization between resolver thread and its parent */
public class thread_sync_data {
	private _CRITICAL_SECTION mtx;
	private int done;
	private Byte hostname;
	private int port;
	private connectdata conn;
	private Object sock_pair;
	private int sock_error;
	private Curl_addrinfo res;
	private thread_data td;
	
	public thread_sync_data(_CRITICAL_SECTION mtx, int done, Byte hostname, int port, connectdata conn, Object sock_pair, int sock_error, Curl_addrinfo res, thread_data td) {
		setMtx(mtx);
		setDone(done);
		setHostname(hostname);
		setPort(port);
		setConn(conn);
		setSock_pair(sock_pair);
		setSock_error(sock_error);
		setRes(res);
		setTd(td);
	}
	public thread_sync_data() {
	}
	
	public thread_sync_data conn_thread_sync_data(connectdata conn) {
		Curl_async generatedAsync = conn.getAsync();
		Object generatedOs_specific = generatedAsync.getOs_specific();
		return (((thread_data)generatedOs_specific).getTsd());
	}
	/* Destroy resolver thread synchronization data */
	public void destroy_thread_sync_data() {
		_CRITICAL_SECTION generatedMtx = this.getMtx();
		if (generatedMtx) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DeleteCriticalSection(generatedMtx);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedMtx);
		} 
		Byte generatedHostname = this.getHostname();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedHostname);
		Curl_addrinfo generatedRes = this.getRes();
		if (generatedRes) {
			generatedRes.Curl_freeaddrinfo();
		} 
		Object generatedSock_pair = this.getSock_pair();
		if (generatedSock_pair[1] != CURL_SOCKET_BAD) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/closesocket((generatedSock_pair[1]));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tsd, 0, /*Error: sizeof expression not supported yet*/);
	}
	public _CRITICAL_SECTION getMtx() {
		return mtx;
	}
	public void setMtx(_CRITICAL_SECTION newMtx) {
		mtx = newMtx;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int newDone) {
		done = newDone;
	}
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
	public connectdata getConn() {
		return conn;
	}
	public void setConn(connectdata newConn) {
		conn = newConn;
	}
	public Object getSock_pair() {
		return sock_pair;
	}
	public void setSock_pair(Object newSock_pair) {
		sock_pair = newSock_pair;
	}
	public int getSock_error() {
		return sock_error;
	}
	public void setSock_error(int newSock_error) {
		sock_error = newSock_error;
	}
	public Curl_addrinfo getRes() {
		return res;
	}
	public void setRes(Curl_addrinfo newRes) {
		res = newRes;
	}
	public thread_data getTd() {
		return td;
	}
	public void setTd(thread_data newTd) {
		td = newTd;
	}
}
