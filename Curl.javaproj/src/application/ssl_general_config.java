package application;

/* general user defined SSL stuff */
public class ssl_general_config {
	private Object max_ssl_sessions;
	
	public ssl_general_config(Object max_ssl_sessions) {
		setMax_ssl_sessions(max_ssl_sessions);
	}
	public ssl_general_config() {
	}
	
	public Object getMax_ssl_sessions() {
		return max_ssl_sessions;
	}
	public void setMax_ssl_sessions(Object newMax_ssl_sessions) {
		max_ssl_sessions = newMax_ssl_sessions;
	}
}
