package application;

/* An individual foreground or background color. */
public class color {
	private  type;
	private byte value;
	private byte red;
	private byte green;
	private byte blue;
	
	public color( type, byte value, byte red, byte green, byte blue) {
		setType(type);
		setValue(value);
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	public color() {
	}
	
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public byte getValue() {
		return value;
	}
	public void setValue(byte newValue) {
		value = newValue;
	}
	public byte getRed() {
		return red;
	}
	public void setRed(byte newRed) {
		red = newRed;
	}
	public byte getGreen() {
		return green;
	}
	public void setGreen(byte newGreen) {
		green = newGreen;
	}
	public byte getBlue() {
		return blue;
	}
	public void setBlue(byte newBlue) {
		blue = newBlue;
	}
}
