package application;

public class _sock_tl_ep {
	private int family;
	private  addr;
	private Object netif;
	private Object port;
	
	public _sock_tl_ep(int family,  addr, Object netif, Object port) {
		setFamily(family);
		setAddr(addr);
		setNetif(netif);
		setPort(port);
	}
	public _sock_tl_ep() {
	}
	
	public int getFamily() {
		return family;
	}
	public void setFamily(int newFamily) {
		family = newFamily;
	}
	public  getAddr() {
		return addr;
	}
	public void setAddr( newAddr) {
		addr = newAddr;
	}
	public Object getNetif() {
		return netif;
	}
	public void setNetif(Object newNetif) {
		netif = newNetif;
	}
	public Object getPort() {
		return port;
	}
	public void setPort(Object newPort) {
		port = newPort;
	}
}
/**
     * @brief family of sock_ip_ep_t::addr
     *
     * @see @ref net_af
     */
