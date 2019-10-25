package application;

/* when set, no writing should be done but there
                                  might still be data to write */
/* reading is paused */
/* writing is paused */
/* state data for host Negotiate auth */
/* state data for proxy Negotiate auth */
/* data used for the asynch name resolve callback */
public class Curl_async {
	private Object hostname;
	private int port;
	private Object dns;
	private int status;
	private Object os_specific;
	private Object done;
	
	public Curl_async(Object hostname, int port, Object dns, int status, Object os_specific, Object done) {
		setHostname(hostname);
		setPort(port);
		setDns(dns);
		setStatus(status);
		setOs_specific(os_specific);
		setDone(done);
	}
	public Curl_async() {
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
	public Object getDns() {
		return dns;
	}
	public void setDns(Object newDns) {
		dns = newDns;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
	public Object getOs_specific() {
		return os_specific;
	}
	public void setOs_specific(Object newOs_specific) {
		os_specific = newOs_specific;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
}
