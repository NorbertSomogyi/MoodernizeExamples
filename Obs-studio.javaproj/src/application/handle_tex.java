package application;

public class handle_tex {
	private Object handle;
	private Object tex;
	private Object km;
	
	public handle_tex(Object handle, Object tex, Object km) {
		setHandle(handle);
		setTex(tex);
		setKm(km);
	}
	public handle_tex() {
	}
	
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getTex() {
		return tex;
	}
	public void setTex(Object newTex) {
		tex = newTex;
	}
	public Object getKm() {
		return km;
	}
	public void setKm(Object newKm) {
		km = newKm;
	}
}
