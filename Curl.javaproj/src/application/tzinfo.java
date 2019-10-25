package application;

/* offset for daylight savings time */
public class tzinfo {
	private Object name;
	private int offset;
	
	public tzinfo(Object name, int offset) {
		setName(name);
		setOffset(offset);
	}
	public tzinfo() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
}
