package application;

/* talking upgraded protocol */
public class dohresponse {
	private byte[] memory;
	private Object size;
	
	public dohresponse(byte[] memory, Object size) {
		setMemory(memory);
		setSize(size);
	}
	public dohresponse() {
	}
	
	public byte[] getMemory() {
		return memory;
	}
	public void setMemory(byte[] newMemory) {
		memory = newMemory;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
