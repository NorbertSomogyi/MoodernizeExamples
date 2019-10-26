package application;

public class special {
	private Object name;
	private Object fn;
	
	public special(Object name, Object fn) {
		setName(name);
		setFn(fn);
	}
	public special() {
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
