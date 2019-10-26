package application;

public class child {
	private child next;
	private child_process cld;
	private sockaddr_storage address;
	
	public child(child next, child_process cld, sockaddr_storage address) {
		setNext(next);
		setCld(cld);
		setAddress(address);
	}
	public child() {
	}
	
	public child getNext() {
		return next;
	}
	public void setNext(child newNext) {
		next = newNext;
	}
	public child_process getCld() {
		return cld;
	}
	public void setCld(child_process newCld) {
		cld = newCld;
	}
	public sockaddr_storage getAddress() {
		return address;
	}
	public void setAddress(sockaddr_storage newAddress) {
		address = newAddress;
	}
}
