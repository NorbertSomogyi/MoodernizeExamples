package application;

public class _RTL_PROCESS_HEAPS {
	private Object NumberOfHeaps;
	private Object[] Heaps;
	
	public _RTL_PROCESS_HEAPS(Object NumberOfHeaps, Object[] Heaps) {
		setNumberOfHeaps(NumberOfHeaps);
		setHeaps(Heaps);
	}
	public _RTL_PROCESS_HEAPS() {
	}
	
	public Object getNumberOfHeaps() {
		return NumberOfHeaps;
	}
	public void setNumberOfHeaps(Object newNumberOfHeaps) {
		NumberOfHeaps = newNumberOfHeaps;
	}
	public Object[] getHeaps() {
		return Heaps;
	}
	public void setHeaps(Object[] newHeaps) {
		Heaps = newHeaps;
	}
}
