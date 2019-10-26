package application;

public class RTMP_BINDINFO {
	private sockaddr_storage addr;
	private int addrLen;
	
	public RTMP_BINDINFO(sockaddr_storage addr, int addrLen) {
		setAddr(addr);
		setAddrLen(addrLen);
	}
	public RTMP_BINDINFO() {
	}
	
	public sockaddr_storage getAddr() {
		return addr;
	}
	public void setAddr(sockaddr_storage newAddr) {
		addr = newAddr;
	}
	public int getAddrLen() {
		return addrLen;
	}
	public void setAddrLen(int newAddrLen) {
		addrLen = newAddrLen;
	}
}
