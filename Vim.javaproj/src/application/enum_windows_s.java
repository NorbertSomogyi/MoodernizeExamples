package application;

public class enum_windows_s {
	private Object lpEnumFunc;
	private Object lParam;
	
	public enum_windows_s(Object lpEnumFunc, Object lParam) {
		setLpEnumFunc(lpEnumFunc);
		setLParam(lParam);
	}
	public enum_windows_s() {
	}
	
	public Object getLpEnumFunc() {
		return lpEnumFunc;
	}
	public void setLpEnumFunc(Object newLpEnumFunc) {
		lpEnumFunc = newLpEnumFunc;
	}
	public Object getLParam() {
		return lParam;
	}
	public void setLParam(Object newLParam) {
		lParam = newLParam;
	}
}
