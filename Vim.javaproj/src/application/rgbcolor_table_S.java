package application;

public class rgbcolor_table_S {
	private Object color_name;
	private long color;
	
	public rgbcolor_table_S(Object color_name, long color) {
		setColor_name(color_name);
		setColor(color);
	}
	public rgbcolor_table_S() {
	}
	
	public Object getColor_name() {
		return color_name;
	}
	public void setColor_name(Object newColor_name) {
		color_name = newColor_name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long newColor) {
		color = newColor;
	}
}
