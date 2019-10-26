package application;

/* Information about the SSL library used and the respective internal SSL
   handle, which can be used to obtain further information regarding the
   connection. Asked for with CURLINFO_TLS_SSL_PTR or CURLINFO_TLS_SESSION. */
public class curl_tlssessioninfo {
	private  backend;
	private Object internals;
	
	public curl_tlssessioninfo( backend, Object internals) {
		setBackend(backend);
		setInternals(internals);
	}
	public curl_tlssessioninfo() {
	}
	
	public  getBackend() {
		return backend;
	}
	public void setBackend( newBackend) {
		backend = newBackend;
	}
	public Object getInternals() {
		return internals;
	}
	public void setInternals(Object newInternals) {
		internals = newInternals;
	}
}
