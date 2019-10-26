package application;

public class chdir_notify_entry {
	private Object name;
	private Object cb;
	private Object data;
	private list_head list;
	
	public chdir_notify_entry(Object name, Object cb, Object data, list_head list) {
		setName(name);
		setCb(cb);
		setData(data);
		setList(list);
	}
	public chdir_notify_entry() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public list_head getList() {
		return list;
	}
	public void setList(list_head newList) {
		list = newList;
	}
}
