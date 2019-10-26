package application;

/* This is a structure containing a server HWND and its name. */
public class server_id {
	private Object hwnd;
	private Object name;
	
	public server_id(Object hwnd, Object name) {
		setHwnd(hwnd);
		setName(name);
	}
	public server_id() {
	}
	
	public Object getHwnd() {
		return hwnd;
	}
	public void setHwnd(Object newHwnd) {
		hwnd = newHwnd;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
