package application;

/** Dynamically allocated strings, MUST be freed before this **/
/** struct is killed.                                      **/
public class dynamically_allocated_data {
	private Byte proxyuserpwd;
	private Byte uagent;
	private Byte accept_encoding;
	private Byte userpwd;
	private Byte rangeline;
	private Byte ref;
	private Byte host;
	private Byte cookiehost;
	private Byte rtsp_transport;
	private Byte te;
	
	public dynamically_allocated_data(Byte proxyuserpwd, Byte uagent, Byte accept_encoding, Byte userpwd, Byte rangeline, Byte ref, Byte host, Byte cookiehost, Byte rtsp_transport, Byte te) {
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
	
	public Byte getProxyuserpwd() {
		return proxyuserpwd;
	}
	public void setProxyuserpwd(Byte newProxyuserpwd) {
		proxyuserpwd = newProxyuserpwd;
	}
	public Byte getUagent() {
		return uagent;
	}
	public void setUagent(Byte newUagent) {
		uagent = newUagent;
	}
	public Byte getAccept_encoding() {
		return accept_encoding;
	}
	public void setAccept_encoding(Byte newAccept_encoding) {
		accept_encoding = newAccept_encoding;
	}
	public Byte getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(Byte newUserpwd) {
		userpwd = newUserpwd;
	}
	public Byte getRangeline() {
		return rangeline;
	}
	public void setRangeline(Byte newRangeline) {
		rangeline = newRangeline;
	}
	public Byte getRef() {
		return ref;
	}
	public void setRef(Byte newRef) {
		ref = newRef;
	}
	public Byte getHost() {
		return host;
	}
	public void setHost(Byte newHost) {
		host = newHost;
	}
	public Byte getCookiehost() {
		return cookiehost;
	}
	public void setCookiehost(Byte newCookiehost) {
		cookiehost = newCookiehost;
	}
	public Byte getRtsp_transport() {
		return rtsp_transport;
	}
	public void setRtsp_transport(Byte newRtsp_transport) {
		rtsp_transport = newRtsp_transport;
	}
	public Byte getTe() {
		return te;
	}
	public void setTe(Byte newTe) {
		te = newTe;
	}
}
