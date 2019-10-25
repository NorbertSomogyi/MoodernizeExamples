package application;

/* DoH specific data for this request */
public class dohdata {
	private Object headers;
	private Object probe;
	private int pending;
	private Object host;
	private int port;
	
	public dohdata(Object headers, Object probe, int pending, Object host, int port) {
		setHeaders(headers);
		setProbe(probe);
		setPending(pending);
		setHost(host);
		setPort(port);
	}
	public dohdata() {
	}
	
	public Object getHeaders() {
		return headers;
	}
	public void setHeaders(Object newHeaders) {
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
