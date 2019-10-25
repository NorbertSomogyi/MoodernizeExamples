package application;

public class metalinkfile {
	private Object next;
	private Object filename;
	private Object checksum;
	private Object resource;
	
	public metalinkfile(Object next, Object filename, Object checksum, Object resource) {
		setNext(next);
		setFilename(filename);
		setChecksum(checksum);
		setResource(resource);
	}
	public metalinkfile() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
	public Object getResource() {
		return resource;
	}
	public void setResource(Object newResource) {
		resource = newResource;
	}
}
