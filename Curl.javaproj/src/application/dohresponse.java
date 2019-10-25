package application;

/* talking upgraded protocol */
public class dohresponse {
	private Object memory;
	private Object size;
	
	public dohresponse(Object memory, Object size) {
		setMemory(memory);
		setSize(size);
	}
	public dohresponse() {
	}
	
	public Object getMemory() {
		return memory;
	}
	public void setMemory(Object newMemory) {
		memory = newMemory;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
