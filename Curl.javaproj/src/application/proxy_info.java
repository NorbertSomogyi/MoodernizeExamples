package application;

/* USE_RECV_BEFORE_SEND_WORKAROUND */
public class proxy_info {
	private hostname host;
	private long port;
	private  proxytype;
	private Object user;
	private Object passwd;
	
	public proxy_info(hostname host, long port,  proxytype, Object user, Object passwd) {
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
	public  getProxytype() {
		return proxytype;
	}
	public void setProxytype( newProxytype) {
		proxytype = newProxytype;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPasswd() {
		return passwd;
	}
	public void setPasswd(Object newPasswd) {
		passwd = newPasswd;
	}
}
