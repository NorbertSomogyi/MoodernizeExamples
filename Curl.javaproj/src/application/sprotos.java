package application;

public class sprotos {
	private Object name;
	private long bit;
	
	public sprotos(Object name, long bit) {
		setName(name);
		setBit(bit);
	}
	public sprotos() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public long getBit() {
		return bit;
	}
	public void setBit(long newBit) {
		bit = newBit;
	}
}
