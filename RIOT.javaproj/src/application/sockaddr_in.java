package application;

public class sockaddr_in {
	private Object sin_family;
	private Object sin_port;
	private in_addr sin_addr;
	
	public sockaddr_in(Object sin_family, Object sin_port, in_addr sin_addr) {
		setSin_family(sin_family);
		setSin_port(sin_port);
		setSin_addr(sin_addr);
	}
	public sockaddr_in() {
	}
	
	public Object getSin_family() {
		return sin_family;
	}
	public void setSin_family(Object newSin_family) {
		sin_family = newSin_family;
	}
	public Object getSin_port() {
		return sin_port;
	}
	public void setSin_port(Object newSin_port) {
		sin_port = newSin_port;
	}
	public in_addr getSin_addr() {
		return sin_addr;
	}
	public void setSin_addr(in_addr newSin_addr) {
		sin_addr = newSin_addr;
	}
}
