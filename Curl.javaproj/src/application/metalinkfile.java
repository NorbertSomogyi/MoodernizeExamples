package application;

public class metalinkfile {
	private metalinkfile next;
	private Byte filename;
	private metalink_checksum checksum;
	private metalink_resource resource;
	
	public metalinkfile(metalinkfile next, Byte filename, metalink_checksum checksum, metalink_resource resource) {
		setNext(next);
		setFilename(filename);
		setChecksum(checksum);
		setResource(resource);
	}
	public metalinkfile() {
	}
	
	public metalinkfile getNext() {
		return next;
	}
	public void setNext(metalinkfile newNext) {
		next = newNext;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public metalink_checksum getChecksum() {
		return checksum;
	}
	public void setChecksum(metalink_checksum newChecksum) {
		checksum = newChecksum;
	}
	public metalink_resource getResource() {
		return resource;
	}
	public void setResource(metalink_resource newResource) {
		resource = newResource;
	}
}
