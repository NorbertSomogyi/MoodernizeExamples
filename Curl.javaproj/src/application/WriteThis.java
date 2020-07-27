package application;

public class WriteThis {
	private byte[] readptr;
	private Object sizeleft;
	
	public WriteThis(byte[] readptr, Object sizeleft) {
		setReadptr(readptr);
		setSizeleft(sizeleft);
	}
	public WriteThis() {
	}
	
	public byte[] getReadptr() {
		return readptr;
	}
	public void setReadptr(byte[] newReadptr) {
		readptr = newReadptr;
	}
	public Object getSizeleft() {
		return sizeleft;
	}
	public void setSizeleft(Object newSizeleft) {
		sizeleft = newSizeleft;
	}
}
