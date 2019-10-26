package application;

public class numeric_constant {
	private Byte name;
	private int val;
	
	public numeric_constant(Byte name, int val) {
		setName(name);
		setVal(val);
	}
	public numeric_constant() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int newVal) {
		val = newVal;
	}
}
