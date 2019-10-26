package application;

public class ISzAlloc {
	private Object Alloc;
	private Object Free;
	
	public ISzAlloc(Object Alloc, Object Free) {
		setAlloc(Alloc);
		setFree(Free);
	}
	public ISzAlloc() {
	}
	
	public Object getAlloc() {
		return Alloc;
	}
	public void setAlloc(Object newAlloc) {
		Alloc = newAlloc;
	}
	public Object getFree() {
		return Free;
	}
	public void setFree(Object newFree) {
		Free = newFree;
	}
}
