package application;

public class WriteThis {
	private byte readptr;
	private Object sizeleft;
	private int freecount;
	
	public WriteThis(byte readptr, Object sizeleft, int freecount) {
		setReadptr(readptr);
		setSizeleft(sizeleft);
		setFreecount(freecount);
	}
	public WriteThis() {
	}
	
	public byte getReadptr() {
		return readptr;
	}
	public void setReadptr(byte newReadptr) {
		readptr = newReadptr;
	}
	public Object getSizeleft() {
		return sizeleft;
	}
	public void setSizeleft(Object newSizeleft) {
		sizeleft = newSizeleft;
	}
	public int getFreecount() {
		return freecount;
	}
	public void setFreecount(int newFreecount) {
		freecount = newFreecount;
	}
}
