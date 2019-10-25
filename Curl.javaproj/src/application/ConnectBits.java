package application;

/*
 * Boolean values that concerns this connection.
 */
/* various state-flags for this connection */
public class ConnectBits {
	private Object proxy_ssl_connected;
	private Object tcpconnect;
	private Object close;
	private Object reuse;
	private Object altused;
	private Object conn_to_host;
	private Object conn_to_port;
	private Object proxy;
	private Object httpproxy;
	private Object socksproxy;
	private Object user_passwd;
	private Object proxy_user_passwd;
	private Object ipv6_ip;
	private Object ipv6;
	private Object do_more;
	private Object protoconnstart;
	private Object retry;
	private Object tunnel_proxy;
	private Object authneg;
	private Object rewindaftersend;
	private Object ftp_use_epsv;
	private Object ftp_use_eprt;
	private Object ftp_use_data_ssl;
	private Object netrc;
	private Object userpwd_in_url;
	private Object stream_was_rewound;
	private Object proxy_connect_closed;
	private Object bound;
	private Object type_set;
	private Object multiplex;
	private Object tcp_fastopen;
	private Object tls_enable_npn;
	private Object tls_enable_alpn;
	private Object socksproxy_connecting;
	private Object connect_only;
	
	public ConnectBits(Object proxy_ssl_connected, Object tcpconnect, Object close, Object reuse, Object altused, Object conn_to_host, Object conn_to_port, Object proxy, Object httpproxy, Object socksproxy, Object user_passwd, Object proxy_user_passwd, Object ipv6_ip, Object ipv6, Object do_more, Object protoconnstart, Object retry, Object tunnel_proxy, Object authneg, Object rewindaftersend, Object ftp_use_epsv, Object ftp_use_eprt, Object ftp_use_data_ssl, Object netrc, Object userpwd_in_url, Object stream_was_rewound, Object proxy_connect_closed, Object bound, Object type_set, Object multiplex, Object tcp_fastopen, Object tls_enable_npn, Object tls_enable_alpn, Object socksproxy_connecting, Object connect_only) {
		setProxy_ssl_connected(proxy_ssl_connected);
		setTcpconnect(tcpconnect);
		setClose(close);
		setReuse(reuse);
		setAltused(altused);
		setConn_to_host(conn_to_host);
		setConn_to_port(conn_to_port);
		setProxy(proxy);
		setHttpproxy(httpproxy);
		setSocksproxy(socksproxy);
		setUser_passwd(user_passwd);
		setProxy_user_passwd(proxy_user_passwd);
		setIpv6_ip(ipv6_ip);
		setIpv6(ipv6);
		setDo_more(do_more);
		setProtoconnstart(protoconnstart);
		setRetry(retry);
		setTunnel_proxy(tunnel_proxy);
		setAuthneg(authneg);
		setRewindaftersend(rewindaftersend);
		setFtp_use_epsv(ftp_use_epsv);
		setFtp_use_eprt(ftp_use_eprt);
		setFtp_use_data_ssl(ftp_use_data_ssl);
		setNetrc(netrc);
		setUserpwd_in_url(userpwd_in_url);
		setStream_was_rewound(stream_was_rewound);
		setProxy_connect_closed(proxy_connect_closed);
		setBound(bound);
		setType_set(type_set);
		setMultiplex(multiplex);
		setTcp_fastopen(tcp_fastopen);
		setTls_enable_npn(tls_enable_npn);
		setTls_enable_alpn(tls_enable_alpn);
		setSocksproxy_connecting(socksproxy_connecting);
		setConnect_only(connect_only);
	}
	public ConnectBits() {
	}
	
	public Object getProxy_ssl_connected() {
		return proxy_ssl_connected;
	}
	public void setProxy_ssl_connected(Object newProxy_ssl_connected) {
		proxy_ssl_connected = newProxy_ssl_connected;
	}
	public Object getTcpconnect() {
		return tcpconnect;
	}
	public void setTcpconnect(Object newTcpconnect) {
		tcpconnect = newTcpconnect;
	}
	public Object getClose() {
		return close;
	}
	public void setClose(Object newClose) {
		close = newClose;
	}
	public Object getReuse() {
		return reuse;
	}
	public void setReuse(Object newReuse) {
		reuse = newReuse;
	}
	public Object getAltused() {
		return altused;
	}
	public void setAltused(Object newAltused) {
		altused = newAltused;
	}
	public Object getConn_to_host() {
		return conn_to_host;
	}
	public void setConn_to_host(Object newConn_to_host) {
		conn_to_host = newConn_to_host;
	}
	public Object getConn_to_port() {
		return conn_to_port;
	}
	public void setConn_to_port(Object newConn_to_port) {
		conn_to_port = newConn_to_port;
	}
	public Object getProxy() {
		return proxy;
	}
	public void setProxy(Object newProxy) {
		proxy = newProxy;
	}
	public Object getHttpproxy() {
		return httpproxy;
	}
	public void setHttpproxy(Object newHttpproxy) {
		httpproxy = newHttpproxy;
	}
	public Object getSocksproxy() {
		return socksproxy;
	}
	public void setSocksproxy(Object newSocksproxy) {
		socksproxy = newSocksproxy;
	}
	public Object getUser_passwd() {
		return user_passwd;
	}
	public void setUser_passwd(Object newUser_passwd) {
		user_passwd = newUser_passwd;
	}
	public Object getProxy_user_passwd() {
		return proxy_user_passwd;
	}
	public void setProxy_user_passwd(Object newProxy_user_passwd) {
		proxy_user_passwd = newProxy_user_passwd;
	}
	public Object getIpv6_ip() {
		return ipv6_ip;
	}
	public void setIpv6_ip(Object newIpv6_ip) {
		ipv6_ip = newIpv6_ip;
	}
	public Object getIpv6() {
		return ipv6;
	}
	public void setIpv6(Object newIpv6) {
		ipv6 = newIpv6;
	}
	public Object getDo_more() {
		return do_more;
	}
	public void setDo_more(Object newDo_more) {
		do_more = newDo_more;
	}
	public Object getProtoconnstart() {
		return protoconnstart;
	}
	public void setProtoconnstart(Object newProtoconnstart) {
		protoconnstart = newProtoconnstart;
	}
	public Object getRetry() {
		return retry;
	}
	public void setRetry(Object newRetry) {
		retry = newRetry;
	}
	public Object getTunnel_proxy() {
		return tunnel_proxy;
	}
	public void setTunnel_proxy(Object newTunnel_proxy) {
		tunnel_proxy = newTunnel_proxy;
	}
	public Object getAuthneg() {
		return authneg;
	}
	public void setAuthneg(Object newAuthneg) {
		authneg = newAuthneg;
	}
	public Object getRewindaftersend() {
		return rewindaftersend;
	}
	public void setRewindaftersend(Object newRewindaftersend) {
		rewindaftersend = newRewindaftersend;
	}
	public Object getFtp_use_epsv() {
		return ftp_use_epsv;
	}
	public void setFtp_use_epsv(Object newFtp_use_epsv) {
		ftp_use_epsv = newFtp_use_epsv;
	}
	public Object getFtp_use_eprt() {
		return ftp_use_eprt;
	}
	public void setFtp_use_eprt(Object newFtp_use_eprt) {
		ftp_use_eprt = newFtp_use_eprt;
	}
	public Object getFtp_use_data_ssl() {
		return ftp_use_data_ssl;
	}
	public void setFtp_use_data_ssl(Object newFtp_use_data_ssl) {
		ftp_use_data_ssl = newFtp_use_data_ssl;
	}
	public Object getNetrc() {
		return netrc;
	}
	public void setNetrc(Object newNetrc) {
		netrc = newNetrc;
	}
	public Object getUserpwd_in_url() {
		return userpwd_in_url;
	}
	public void setUserpwd_in_url(Object newUserpwd_in_url) {
		userpwd_in_url = newUserpwd_in_url;
	}
	public Object getStream_was_rewound() {
		return stream_was_rewound;
	}
	public void setStream_was_rewound(Object newStream_was_rewound) {
		stream_was_rewound = newStream_was_rewound;
	}
	public Object getProxy_connect_closed() {
		return proxy_connect_closed;
	}
	public void setProxy_connect_closed(Object newProxy_connect_closed) {
		proxy_connect_closed = newProxy_connect_closed;
	}
	public Object getBound() {
		return bound;
	}
	public void setBound(Object newBound) {
		bound = newBound;
	}
	public Object getType_set() {
		return type_set;
	}
	public void setType_set(Object newType_set) {
		type_set = newType_set;
	}
	public Object getMultiplex() {
		return multiplex;
	}
	public void setMultiplex(Object newMultiplex) {
		multiplex = newMultiplex;
	}
	public Object getTcp_fastopen() {
		return tcp_fastopen;
	}
	public void setTcp_fastopen(Object newTcp_fastopen) {
		tcp_fastopen = newTcp_fastopen;
	}
	public Object getTls_enable_npn() {
		return tls_enable_npn;
	}
	public void setTls_enable_npn(Object newTls_enable_npn) {
		tls_enable_npn = newTls_enable_npn;
	}
	public Object getTls_enable_alpn() {
		return tls_enable_alpn;
	}
	public void setTls_enable_alpn(Object newTls_enable_alpn) {
		tls_enable_alpn = newTls_enable_alpn;
	}
	public Object getSocksproxy_connecting() {
		return socksproxy_connecting;
	}
	public void setSocksproxy_connecting(Object newSocksproxy_connecting) {
		socksproxy_connecting = newSocksproxy_connecting;
	}
	public Object getConnect_only() {
		return connect_only;
	}
	public void setConnect_only(Object newConnect_only) {
		connect_only = newConnect_only;
	}
}
/* connecttime: when connect() is called on the current IP address. Used to
    be able to track when to move on to try next IP - but only when the multi
    interface is used. */
