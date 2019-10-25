package application;

public class feat {
	private Object name;
	private int bitmask;
	
	public feat(Object name, int bitmask) {
		setName(name);
		setBitmask(bitmask);
	}
	public feat() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getBitmask() {
		return bitmask;
	}
	public void setBitmask(int newBitmask) {
		bitmask = newBitmask;
	}
}
