package application;

/* Gamma Ramp: Same as DX7 */
public class _D3DGAMMARAMP {
	private Object red;
	private Object green;
	private Object blue;
	
	public _D3DGAMMARAMP(Object red, Object green, Object blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	public _D3DGAMMARAMP() {
	}
	
	public Object getRed() {
		return red;
	}
	public void setRed(Object newRed) {
		red = newRed;
	}
	public Object getGreen() {
		return green;
	}
	public void setGreen(Object newGreen) {
		green = newGreen;
	}
	public Object getBlue() {
		return blue;
	}
	public void setBlue(Object newBlue) {
		blue = newBlue;
	}
}
