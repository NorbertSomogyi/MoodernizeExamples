package application;

public class subprocess_capability {
	private Object name;
	private int flag;
	
	public subprocess_capability(Object name, int flag) {
		setName(name);
		setFlag(flag);
	}
	public subprocess_capability() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int newFlag) {
		flag = newFlag;
	}
}
/*
 * Helper function that will read packets looking for "status=<foo>"
 * key/value pairs and return the value from the last "status" packet
 */
