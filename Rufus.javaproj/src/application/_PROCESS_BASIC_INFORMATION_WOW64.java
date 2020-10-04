package application;

public class _PROCESS_BASIC_INFORMATION_WOW64 {
	private Object[] Reserved1;
	private Object PebBaseAddress;
	private Object[] Reserved2;
	private Object[] UniqueProcessId;
	private Object[] Reserved3;
	
	public _PROCESS_BASIC_INFORMATION_WOW64(Object[] Reserved1, Object PebBaseAddress, Object[] Reserved2, Object[] UniqueProcessId, Object[] Reserved3) {
		setReserved1(Reserved1);
		setPebBaseAddress(PebBaseAddress);
		setReserved2(Reserved2);
		setUniqueProcessId(UniqueProcessId);
		setReserved3(Reserved3);
	}
	public _PROCESS_BASIC_INFORMATION_WOW64() {
	}
	
	public Object[] getReserved1() {
		return Reserved1;
	}
	public void setReserved1(Object[] newReserved1) {
		Reserved1 = newReserved1;
	}
	public Object getPebBaseAddress() {
		return PebBaseAddress;
	}
	public void setPebBaseAddress(Object newPebBaseAddress) {
		PebBaseAddress = newPebBaseAddress;
	}
	public Object[] getReserved2() {
		return Reserved2;
	}
	public void setReserved2(Object[] newReserved2) {
		Reserved2 = newReserved2;
	}
	public Object[] getUniqueProcessId() {
		return UniqueProcessId;
	}
	public void setUniqueProcessId(Object[] newUniqueProcessId) {
		UniqueProcessId = newUniqueProcessId;
	}
	public Object[] getReserved3() {
		return Reserved3;
	}
	public void setReserved3(Object[] newReserved3) {
		Reserved3 = newReserved3;
	}
}
