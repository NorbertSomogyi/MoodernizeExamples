package application;

public class test_cmd {
	private Object name;
	private Object fn;
	
	public test_cmd(Object name, Object fn) {
		setName(name);
		setFn(fn);
	}
	public test_cmd() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
}
