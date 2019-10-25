package application;

public class tcp_keepalive {
	private Object onoff;
	private Object keepalivetime;
	private Object keepaliveinterval;
	
	public tcp_keepalive(Object onoff, Object keepalivetime, Object keepaliveinterval) {
		setOnoff(onoff);
		setKeepalivetime(keepalivetime);
		setKeepaliveinterval(keepaliveinterval);
	}
	public tcp_keepalive() {
	}
	
	public Object getOnoff() {
		return onoff;
	}
	public void setOnoff(Object newOnoff) {
		onoff = newOnoff;
	}
	public Object getKeepalivetime() {
		return keepalivetime;
	}
	public void setKeepalivetime(Object newKeepalivetime) {
		keepalivetime = newKeepalivetime;
	}
	public Object getKeepaliveinterval() {
		return keepaliveinterval;
	}
	public void setKeepaliveinterval(Object newKeepaliveinterval) {
		keepaliveinterval = newKeepaliveinterval;
	}
}
