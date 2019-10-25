package application;

public class s_tls_max {
	private Object tls_max_str;
	private long tls_max;
	
	public s_tls_max(Object tls_max_str, long tls_max) {
		setTls_max_str(tls_max_str);
		setTls_max(tls_max);
	}
	public s_tls_max() {
	}
	
	public Object getTls_max_str() {
		return tls_max_str;
	}
	public void setTls_max_str(Object newTls_max_str) {
		tls_max_str = newTls_max_str;
	}
	public long getTls_max() {
		return tls_max;
	}
	public void setTls_max(long newTls_max) {
		tls_max = newTls_max;
	}
}
