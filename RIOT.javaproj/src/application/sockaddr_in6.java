package application;

public class sockaddr_in6 {
	private Object sin6_family;
	private Object sin6_port;
	private Object sin6_flowinfo;
	private in6_addr sin6_addr;
	private Object sin6_scope_id;
	
	public sockaddr_in6(Object sin6_family, Object sin6_port, Object sin6_flowinfo, in6_addr sin6_addr, Object sin6_scope_id) {
		setSin6_family(sin6_family);
		setSin6_port(sin6_port);
		setSin6_flowinfo(sin6_flowinfo);
		setSin6_addr(sin6_addr);
		setSin6_scope_id(sin6_scope_id);
	}
	public sockaddr_in6() {
	}
	
	public Object getSin6_family() {
		return sin6_family;
	}
	public void setSin6_family(Object newSin6_family) {
		sin6_family = newSin6_family;
	}
	public Object getSin6_port() {
		return sin6_port;
	}
	public void setSin6_port(Object newSin6_port) {
		sin6_port = newSin6_port;
	}
	public Object getSin6_flowinfo() {
		return sin6_flowinfo;
	}
	public void setSin6_flowinfo(Object newSin6_flowinfo) {
		sin6_flowinfo = newSin6_flowinfo;
	}
	public in6_addr getSin6_addr() {
		return sin6_addr;
	}
	public void setSin6_addr(in6_addr newSin6_addr) {
		sin6_addr = newSin6_addr;
	}
	public Object getSin6_scope_id() {
		return sin6_scope_id;
	}
	public void setSin6_scope_id(Object newSin6_scope_id) {
		sin6_scope_id = newSin6_scope_id;
	}
}
/**
     * Protocol family, always AF_INET6. Member of struct sockaddr_in6
     */
