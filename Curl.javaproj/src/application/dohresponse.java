package application;

/* talking upgraded protocol */
public class dohresponse {
	private Byte memory;
	private Object size;
	
	public dohresponse(Byte memory, Object size) {
		setMemory(memory);
		setSize(size);
	}
	public dohresponse() {
	}
	
	public Byte getMemory() {
		return memory;
	}
	public void setMemory(Byte newMemory) {
		memory = newMemory;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
