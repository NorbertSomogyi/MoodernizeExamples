package application;

public class reg_flag {
	private Object name;
	private int flag;
	
	public reg_flag(Object name, int flag) {
		setName(name);
		setFlag(flag);
	}
	public reg_flag() {
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
