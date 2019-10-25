package application;

/* Data for synchronization between resolver thread and its parent */
public class thread_sync_data {
	private Object mtx;
	private int done;
	private Object hostname;
	private int port;
	private Object conn;
	private Object sock_pair;
	private int sock_error;
	private Object res;
	private Object td;
	
	public thread_sync_data(Object mtx, int done, Object hostname, int port, Object conn, Object sock_pair, int sock_error, Object res, Object td) {
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
	
	public Object getMtx() {
		return mtx;
	}
	public void setMtx(Object newMtx) {
		mtx = newMtx;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int newDone) {
		done = newDone;
	}
	public Object getHostname() {
		return hostname;
	}
	public void setHostname(Object newHostname) {
		hostname = newHostname;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
	public Object getConn() {
		return conn;
	}
	public void setConn(Object newConn) {
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
	public Object getRes() {
		return res;
	}
	public void setRes(Object newRes) {
		res = newRes;
	}
	public Object getTd() {
		return td;
	}
	public void setTd(Object newTd) {
		td = newTd;
	}
}
