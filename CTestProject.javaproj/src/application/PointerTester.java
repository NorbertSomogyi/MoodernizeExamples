package application;

public class PointerTester {
	private Integer intPointer;
	
	public PointerTester(Integer intPointer) {
		setIntPointer(intPointer);
	}
	public PointerTester() {
	}
	
	public Integer getIntPointer() {
		return intPointer;
	}
	public void setIntPointer(Integer newIntPointer) {
		intPointer = newIntPointer;
	}
}
