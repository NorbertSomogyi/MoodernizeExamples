package application;

/* ---------------- */
/* global functions */
public class gs_window {
	private Object hwnd;
	
	public gs_window(Object hwnd) {
		setHwnd(hwnd);
	}
	public gs_window() {
	}
	
	public Object getHwnd() {
		return hwnd;
	}
	public void setHwnd(Object newHwnd) {
		hwnd = newHwnd;
	}
}
