package application;

public class cached_cursor {
	private Object texture;
	private Object cx;
	private Object cy;
	
	public cached_cursor(Object texture, Object cx, Object cy) {
		setTexture(texture);
		setCx(cx);
		setCy(cy);
	}
	public cached_cursor() {
	}
	
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
}
