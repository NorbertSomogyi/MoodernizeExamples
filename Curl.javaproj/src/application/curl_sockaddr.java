package application;

/* causes libcurl to abort and return
                                CURLE_ABORTED_BY_CALLBACK */
public class curl_sockaddr {
	private int family;
	private int socktype;
	private int protocol;
	private int addrlen;
	private sockaddr addr;
	
	public curl_sockaddr(int family, int socktype, int protocol, int addrlen, sockaddr addr) {
		setFamily(family);
		setSocktype(socktype);
		setProtocol(protocol);
		setAddrlen(addrlen);
		setAddr(addr);
	}
	public curl_sockaddr() {
	}
	
	public int getFamily() {
		return family;
	}
	public void setFamily(int newFamily) {
		family = newFamily;
	}
	public int getSocktype() {
		return socktype;
	}
	public void setSocktype(int newSocktype) {
		socktype = newSocktype;
	}
	public int getProtocol() {
		return protocol;
	}
	public void setProtocol(int newProtocol) {
		protocol = newProtocol;
	}
	public int getAddrlen() {
		return addrlen;
	}
	public void setAddrlen(int newAddrlen) {
		addrlen = newAddrlen;
	}
	public sockaddr getAddr() {
		return addr;
	}
	public void setAddr(sockaddr newAddr) {
		addr = newAddr;
	}
}
/* I/O operation successful */
/* command was unknown to callback */
/* failed to restart the read */
/* never use */
/* no operation */
/* restart the read stream from start */
/* never use */
