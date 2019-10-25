package application;

public class Curl_dns_entry {
	private Object addr;
	private Object timestamp;
	private long inuse;
	
	public Curl_dns_entry(Object addr, Object timestamp, long inuse) {
		setAddr(addr);
		setTimestamp(timestamp);
		setInuse(inuse);
	}
	public Curl_dns_entry() {
	}
	
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public long getInuse() {
		return inuse;
	}
	public void setInuse(long newInuse) {
		inuse = newInuse;
	}
}
/*
 * Curl_ipv6works() returns TRUE if IPv6 seems to work.
 */
