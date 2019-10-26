package application;

public class typelen {
	private Object type;
	private int length;
	
	public typelen(Object type, int length) {
		setType(type);
		setLength(length);
	}
	public typelen() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int newLength) {
		length = newLength;
	}
}
