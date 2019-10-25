package application;

public class dohentry {
	private int ttl;
	private int numaddr;
	private Object addr;
	private int numcname;
	private Object cname;
	
	public dohentry(int ttl, int numaddr, Object addr, int numcname, Object cname) {
		setTtl(ttl);
		setNumaddr(numaddr);
		setAddr(addr);
		setNumcname(numcname);
		setCname(cname);
	}
	public dohentry() {
	}
	
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int newTtl) {
		ttl = newTtl;
	}
	public int getNumaddr() {
		return numaddr;
	}
	public void setNumaddr(int newNumaddr) {
		numaddr = newNumaddr;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public int getNumcname() {
		return numcname;
	}
	public void setNumcname(int newNumcname) {
		numcname = newNumcname;
	}
	public Object getCname() {
		return cname;
	}
	public void setCname(Object newCname) {
		cname = newCname;
	}
}
