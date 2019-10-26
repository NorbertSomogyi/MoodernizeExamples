package application;

public class SysColorTable {
	private Byte name;
	private int color;
	
	public SysColorTable(Byte name, int color) {
		setName(name);
		setColor(color);
	}
	public SysColorTable() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int newColor) {
		color = newColor;
	}
}
