package application;

public class merge_remote_desc {
	private object obj;
	private Object name;
	
	public merge_remote_desc(object obj, Object name) {
		setObj(obj);
		setName(name);
	}
	public merge_remote_desc() {
	}
	
	public object getObj() {
		return obj;
	}
	public void setObj(object newObj) {
		obj = newObj;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
