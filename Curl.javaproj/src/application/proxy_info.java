package application;

/* USE_RECV_BEFORE_SEND_WORKAROUND */
public class proxy_info {
	private hostname host;
	private long port;
	private Object proxytype;
	private Byte user;
	private Byte passwd;
	
	public proxy_info(hostname host, long port, Object proxytype, Byte user, Byte passwd) {
		setHost(host);
		setPort(port);
		setProxytype(proxytype);
		setUser(user);
		setPasswd(passwd);
	}
	public proxy_info() {
	}
	
	public hostname getHost() {
		return host;
	}
	public void setHost(hostname newHost) {
		host = newHost;
	}
	public long getPort() {
		return port;
	}
	public void setPort(long newPort) {
		port = newPort;
	}
	public Object getProxytype() {
		return proxytype;
	}
	public void setProxytype(Object newProxytype) {
		proxytype = newProxytype;
	}
	public Byte getUser() {
		return user;
	}
	public void setUser(Byte newUser) {
		user = newUser;
	}
	public Byte getPasswd() {
		return passwd;
	}
	public void setPasswd(Byte newPasswd) {
		passwd = newPasswd;
	}
}
