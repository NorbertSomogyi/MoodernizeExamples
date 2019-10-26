package application;

public class bundle_transport_data {
	private int fd;
	private bundle_header header;
	private int get_refs_from_bundle_called;
	
	public bundle_transport_data(int fd, bundle_header header, int get_refs_from_bundle_called) {
		setFd(fd);
		setHeader(header);
		setGet_refs_from_bundle_called(get_refs_from_bundle_called);
	}
	public bundle_transport_data() {
	}
	
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public bundle_header getHeader() {
		return header;
	}
	public void setHeader(bundle_header newHeader) {
		header = newHeader;
	}
	public int getGet_refs_from_bundle_called() {
		return get_refs_from_bundle_called;
	}
	public void setGet_refs_from_bundle_called(int newGet_refs_from_bundle_called) {
		get_refs_from_bundle_called = newGet_refs_from_bundle_called;
	}
}
