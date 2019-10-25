package application;

/* information stored about one single SSL session */
/* array of 'max_ssl_sessions' size */
public class curl_ssl_session {
	private Object name;
	private Object conn_to_host;
	private Object scheme;
	private Object sessionid;
	private Object idsize;
	private long age;
	private int remote_port;
	private int conn_to_port;
	private ssl_primary_config ssl_config;
	
	public curl_ssl_session(Object name, Object conn_to_host, Object scheme, Object sessionid, Object idsize, long age, int remote_port, int conn_to_port, ssl_primary_config ssl_config) {
		setName(name);
		setConn_to_host(conn_to_host);
		setScheme(scheme);
		setSessionid(sessionid);
		setIdsize(idsize);
		setAge(age);
		setRemote_port(remote_port);
		setConn_to_port(conn_to_port);
		setSsl_config(ssl_config);
	}
	public curl_ssl_session() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getConn_to_host() {
		return conn_to_host;
	}
	public void setConn_to_host(Object newConn_to_host) {
		conn_to_host = newConn_to_host;
	}
	public Object getScheme() {
		return scheme;
	}
	public void setScheme(Object newScheme) {
		scheme = newScheme;
	}
	public Object getSessionid() {
		return sessionid;
	}
	public void setSessionid(Object newSessionid) {
		sessionid = newSessionid;
	}
	public Object getIdsize() {
		return idsize;
	}
	public void setIdsize(Object newIdsize) {
		idsize = newIdsize;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long newAge) {
		age = newAge;
	}
	public int getRemote_port() {
		return remote_port;
	}
	public void setRemote_port(int newRemote_port) {
		remote_port = newRemote_port;
	}
	public int getConn_to_port() {
		return conn_to_port;
	}
	public void setConn_to_port(int newConn_to_port) {
		conn_to_port = newConn_to_port;
	}
	public ssl_primary_config getSsl_config() {
		return ssl_config;
	}
	public void setSsl_config(ssl_primary_config newSsl_config) {
		ssl_config = newSsl_config;
	}
}
