package application;

public class _SYSTEM_HANDLE_INFORMATION_EX {
	private Object NumberOfHandles;
	private Object Reserved;
	private Object[] Handles;
	
	public _SYSTEM_HANDLE_INFORMATION_EX(Object NumberOfHandles, Object Reserved, Object[] Handles) {
		setNumberOfHandles(NumberOfHandles);
		setReserved(Reserved);
		setHandles(Handles);
	}
	public _SYSTEM_HANDLE_INFORMATION_EX() {
	}
	
	public Object getNumberOfHandles() {
		return NumberOfHandles;
	}
	public void setNumberOfHandles(Object newNumberOfHandles) {
		NumberOfHandles = newNumberOfHandles;
	}
	public Object getReserved() {
		return Reserved;
	}
	public void setReserved(Object newReserved) {
		Reserved = newReserved;
	}
	public Object[] getHandles() {
		return Handles;
	}
	public void setHandles(Object[] newHandles) {
		Handles = newHandles;
	}
}
