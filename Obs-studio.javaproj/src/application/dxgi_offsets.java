package application;

public class dxgi_offsets {
	private Object present;
	private Object resize;
	private Object present1;
	
	public dxgi_offsets(Object present, Object resize, Object present1) {
		setPresent(present);
		setResize(resize);
		setPresent1(present1);
	}
	public dxgi_offsets() {
	}
	
	public Object getPresent() {
		return present;
	}
	public void setPresent(Object newPresent) {
		present = newPresent;
	}
	public Object getResize() {
		return resize;
	}
	public void setResize(Object newResize) {
		resize = newResize;
	}
	public Object getPresent1() {
		return present1;
	}
	public void setPresent1(Object newPresent1) {
		present1 = newPresent1;
	}
}
