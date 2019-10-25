package application;

public class Curl_sockaddr_ex {
	private int family;
	private int socktype;
	private int protocol;
	private int addrlen;
	private  _sa_ex_u;
	
	public Curl_sockaddr_ex(int family, int socktype, int protocol, int addrlen,  _sa_ex_u) {
		setFamily(family);
		setSocktype(socktype);
		setProtocol(protocol);
		setAddrlen(addrlen);
		set_sa_ex_u(_sa_ex_u);
	}
	public Curl_sockaddr_ex() {
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
	public  get_sa_ex_u() {
		return _sa_ex_u;
	}
	public void set_sa_ex_u( new_sa_ex_u) {
		_sa_ex_u = new_sa_ex_u;
	}
}
/*
 * Curl_conncontrol() marks the end of a connection/stream. The 'closeit'
 * argument specifies if it is the end of a connection or a stream.
 *
 * For stream-based protocols (such as HTTP/2), a stream close will not cause
 * a connection close. Other protocols will close the connection for both
 * cases.
 *
 * It sets the bit.close bit to TRUE (with an explanation for debug builds),
 * when the connection will close.
 */
