package application;

public class obs_mouse_event {
	private Object modifiers;
	private Object x;
	private Object y;
	
	public obs_mouse_event(Object modifiers, Object x, Object y) {
		setModifiers(modifiers);
		setX(x);
		setY(y);
	}
	public obs_mouse_event() {
	}
	
	public Object getModifiers() {
		return modifiers;
	}
	public void setModifiers(Object newModifiers) {
		modifiers = newModifiers;
	}
	public Object getX() {
		return x;
	}
	public void setX(Object newX) {
		x = newX;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object newY) {
		y = newY;
	}
}
