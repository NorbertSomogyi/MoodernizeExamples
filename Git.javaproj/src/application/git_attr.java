package application;

public class git_attr {
	private int attr_nr;
	private Object name;
	
	public git_attr(int attr_nr, Object name) {
		setAttr_nr(attr_nr);
		setName(name);
	}
	public git_attr() {
	}
	
	public int getAttr_nr() {
		return attr_nr;
	}
	public void setAttr_nr(int newAttr_nr) {
		attr_nr = newAttr_nr;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
