package application;

public class cmdname {
	private Object len;
	private Object name;
	
	public cmdname(Object len, Object name) {
		setLen(len);
		setName(name);
	}
	public cmdname() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
