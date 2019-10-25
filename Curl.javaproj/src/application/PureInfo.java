package application;

/*
 * Struct to keep statistical and informational data.
 * All variables in this struct must be initialized/reset in Curl_initinfo().
 */
/* stats, reports and info data */
public class PureInfo {
	private int httpcode;
	private int httpproxycode;
	private int httpversion;
	private Object filetime;
	private Object header_size;
	private Object request_size;
	private long proxyauthavail;
	private long httpauthavail;
	private long numconnects;
	private Object contenttype;
	private Object wouldredirect;
	private Object retry_after;
	private Object conn_primary_ip;
	private long conn_primary_port;
	private Object conn_local_ip;
	private long conn_local_port;
	private Object conn_scheme;
	private int conn_protocol;
	private curl_certinfo certs;
	private Object timecond;
	
	public PureInfo(int httpcode, int httpproxycode, int httpversion, Object filetime, Object header_size, Object request_size, long proxyauthavail, long httpauthavail, long numconnects, Object contenttype, Object wouldredirect, Object retry_after, Object conn_primary_ip, long conn_primary_port, Object conn_local_ip, long conn_local_port, Object conn_scheme, int conn_protocol, curl_certinfo certs, Object timecond) {
		setHttpcode(httpcode);
		setHttpproxycode(httpproxycode);
		setHttpversion(httpversion);
		setFiletime(filetime);
		setHeader_size(header_size);
		setRequest_size(request_size);
		setProxyauthavail(proxyauthavail);
		setHttpauthavail(httpauthavail);
		setNumconnects(numconnects);
		setContenttype(contenttype);
		setWouldredirect(wouldredirect);
		setRetry_after(retry_after);
		setConn_primary_ip(conn_primary_ip);
		setConn_primary_port(conn_primary_port);
		setConn_local_ip(conn_local_ip);
		setConn_local_port(conn_local_port);
		setConn_scheme(conn_scheme);
		setConn_protocol(conn_protocol);
		setCerts(certs);
		setTimecond(timecond);
	}
	public PureInfo() {
	}
	
	public int getHttpcode() {
		return httpcode;
	}
	public void setHttpcode(int newHttpcode) {
		httpcode = newHttpcode;
	}
	public int getHttpproxycode() {
		return httpproxycode;
	}
	public void setHttpproxycode(int newHttpproxycode) {
		httpproxycode = newHttpproxycode;
	}
	public int getHttpversion() {
		return httpversion;
	}
	public void setHttpversion(int newHttpversion) {
		httpversion = newHttpversion;
	}
	public Object getFiletime() {
		return filetime;
	}
	public void setFiletime(Object newFiletime) {
		filetime = newFiletime;
	}
	public Object getHeader_size() {
		return header_size;
	}
	public void setHeader_size(Object newHeader_size) {
		header_size = newHeader_size;
	}
	public Object getRequest_size() {
		return request_size;
	}
	public void setRequest_size(Object newRequest_size) {
		request_size = newRequest_size;
	}
	public long getProxyauthavail() {
		return proxyauthavail;
	}
	public void setProxyauthavail(long newProxyauthavail) {
		proxyauthavail = newProxyauthavail;
	}
	public long getHttpauthavail() {
		return httpauthavail;
	}
	public void setHttpauthavail(long newHttpauthavail) {
		httpauthavail = newHttpauthavail;
	}
	public long getNumconnects() {
		return numconnects;
	}
	public void setNumconnects(long newNumconnects) {
		numconnects = newNumconnects;
	}
	public Object getContenttype() {
		return contenttype;
	}
	public void setContenttype(Object newContenttype) {
		contenttype = newContenttype;
	}
	public Object getWouldredirect() {
		return wouldredirect;
	}
	public void setWouldredirect(Object newWouldredirect) {
		wouldredirect = newWouldredirect;
	}
	public Object getRetry_after() {
		return retry_after;
	}
	public void setRetry_after(Object newRetry_after) {
		retry_after = newRetry_after;
	}
	public Object getConn_primary_ip() {
		return conn_primary_ip;
	}
	public void setConn_primary_ip(Object newConn_primary_ip) {
		conn_primary_ip = newConn_primary_ip;
	}
	public long getConn_primary_port() {
		return conn_primary_port;
	}
	public void setConn_primary_port(long newConn_primary_port) {
		conn_primary_port = newConn_primary_port;
	}
	public Object getConn_local_ip() {
		return conn_local_ip;
	}
	public void setConn_local_ip(Object newConn_local_ip) {
		conn_local_ip = newConn_local_ip;
	}
	public long getConn_local_port() {
		return conn_local_port;
	}
	public void setConn_local_port(long newConn_local_port) {
		conn_local_port = newConn_local_port;
	}
	public Object getConn_scheme() {
		return conn_scheme;
	}
	public void setConn_scheme(Object newConn_scheme) {
		conn_scheme = newConn_scheme;
	}
	public int getConn_protocol() {
		return conn_protocol;
	}
	public void setConn_protocol(int newConn_protocol) {
		conn_protocol = newConn_protocol;
	}
	public curl_certinfo getCerts() {
		return certs;
	}
	public void setCerts(curl_certinfo newCerts) {
		certs = newCerts;
	}
	public Object getTimecond() {
		return timecond;
	}
	public void setTimecond(Object newTimecond) {
		timecond = newTimecond;
	}
}
