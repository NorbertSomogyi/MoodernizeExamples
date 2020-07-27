package application;

public class ipv6_mreq {
	private in6_addr ipv6mr_multiaddr;
	private int ipv6mr_interface;
	
	public ipv6_mreq(in6_addr ipv6mr_multiaddr, int ipv6mr_interface) {
		setIpv6mr_multiaddr(ipv6mr_multiaddr);
		setIpv6mr_interface(ipv6mr_interface);
	}
	public ipv6_mreq() {
	}
	
	public in6_addr getIpv6mr_multiaddr() {
		return ipv6mr_multiaddr;
	}
	public void setIpv6mr_multiaddr(in6_addr newIpv6mr_multiaddr) {
		ipv6mr_multiaddr = newIpv6mr_multiaddr;
	}
	public int getIpv6mr_interface() {
		return ipv6mr_interface;
	}
	public void setIpv6mr_interface(int newIpv6mr_interface) {
		ipv6mr_interface = newIpv6mr_interface;
	}
}
