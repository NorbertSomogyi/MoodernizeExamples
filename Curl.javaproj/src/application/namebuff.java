package application;

public class namebuff {
	private hostent hostentry;
	private  addrentry;
	private Object h_addr_list;
	
	public namebuff(hostent hostentry,  addrentry, Object h_addr_list) {
		setHostentry(hostentry);
		setAddrentry(addrentry);
		setH_addr_list(h_addr_list);
	}
	public namebuff() {
	}
	
	public hostent getHostentry() {
		return hostentry;
	}
	public void setHostentry(hostent newHostentry) {
		hostentry = newHostentry;
	}
	public  getAddrentry() {
		return addrentry;
	}
	public void setAddrentry( newAddrentry) {
		addrentry = newAddrentry;
	}
	public Object getH_addr_list() {
		return h_addr_list;
	}
	public void setH_addr_list(Object newH_addr_list) {
		h_addr_list = newH_addr_list;
	}
}
