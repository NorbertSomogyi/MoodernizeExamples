package application;

/** Dynamically allocated strings, MUST be freed before this **/
/** struct is killed.                                      **/
public class dynamically_allocated_data {
	private Object proxyuserpwd;
	private Object uagent;
	private Object accept_encoding;
	private Object userpwd;
	private Object rangeline;
	private Object ref;
	private Object host;
	private Object cookiehost;
	private Object rtsp_transport;
	private Object te;
	
	public dynamically_allocated_data(Object proxyuserpwd, Object uagent, Object accept_encoding, Object userpwd, Object rangeline, Object ref, Object host, Object cookiehost, Object rtsp_transport, Object te) {
		setProxyuserpwd(proxyuserpwd);
		setUagent(uagent);
		setAccept_encoding(accept_encoding);
		setUserpwd(userpwd);
		setRangeline(rangeline);
		setRef(ref);
		setHost(host);
		setCookiehost(cookiehost);
		setRtsp_transport(rtsp_transport);
		setTe(te);
	}
	public dynamically_allocated_data() {
	}
	
	public Object getProxyuserpwd() {
		return proxyuserpwd;
	}
	public void setProxyuserpwd(Object newProxyuserpwd) {
		proxyuserpwd = newProxyuserpwd;
	}
	public Object getUagent() {
		return uagent;
	}
	public void setUagent(Object newUagent) {
		uagent = newUagent;
	}
	public Object getAccept_encoding() {
		return accept_encoding;
	}
	public void setAccept_encoding(Object newAccept_encoding) {
		accept_encoding = newAccept_encoding;
	}
	public Object getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(Object newUserpwd) {
		userpwd = newUserpwd;
	}
	public Object getRangeline() {
		return rangeline;
	}
	public void setRangeline(Object newRangeline) {
		rangeline = newRangeline;
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public Object getHost() {
		return host;
	}
	public void setHost(Object newHost) {
		host = newHost;
	}
	public Object getCookiehost() {
		return cookiehost;
	}
	public void setCookiehost(Object newCookiehost) {
		cookiehost = newCookiehost;
	}
	public Object getRtsp_transport() {
		return rtsp_transport;
	}
	public void setRtsp_transport(Object newRtsp_transport) {
		rtsp_transport = newRtsp_transport;
	}
	public Object getTe() {
		return te;
	}
	public void setTe(Object newTe) {
		te = newTe;
	}
}
