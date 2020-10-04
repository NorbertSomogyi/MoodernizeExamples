package application;

/**< IPv6 address */
/**< an IPv6 multicast address */
public class in6_addr {
	private Object[] s6_addr;
	
	public in6_addr(Object[] s6_addr) {
		setS6_addr(s6_addr);
	}
	public in6_addr() {
	}
	
	public Object[] getS6_addr() {
		return s6_addr;
	}
	public void setS6_addr(Object[] newS6_addr) {
		s6_addr = newS6_addr;
	}
}
/**
 * IPv6 socket address for the loopback address.
 */
/**
 * @}
 */
/* NETINET_IN_H */
