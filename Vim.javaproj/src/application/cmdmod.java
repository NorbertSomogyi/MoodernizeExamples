package application;

public class cmdmod {
	private Byte name;
	private int minlen;
	private int has_count;
	
	public cmdmod(Byte name, int minlen, int has_count) {
		setName(name);
		setMinlen(minlen);
		setHas_count(has_count);
	}
	public cmdmod() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getMinlen() {
		return minlen;
	}
	public void setMinlen(int newMinlen) {
		minlen = newMinlen;
	}
	public int getHas_count() {
		return has_count;
	}
	public void setHas_count(int newHas_count) {
		has_count = newHas_count;
	}
}
