package application;

/* DoH specific data for this request */
public class dohdata {
	private curl_slist headers;
	private Object probe;
	private int pending;
	private Object host;
	private int port;
	
	public dohdata(curl_slist headers, Object probe, int pending, Object host, int port) {
		setHeaders(headers);
		setProbe(probe);
		setPending(pending);
		setHost(host);
		setPort(port);
	}
	public dohdata() {
	}
	
	public curl_slist getHeaders() {
		return headers;
	}
	public void setHeaders(curl_slist newHeaders) {
		headers = newHeaders;
	}
	public Object getProbe() {
		return probe;
	}
	public void setProbe(Object newProbe) {
		probe = newProbe;
	}
	public int getPending() {
		return pending;
	}
	public void setPending(int newPending) {
		pending = newPending;
	}
	public Object getHost() {
		return host;
	}
	public void setHost(Object newHost) {
		host = newHost;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int newPort) {
		port = newPort;
	}
}
