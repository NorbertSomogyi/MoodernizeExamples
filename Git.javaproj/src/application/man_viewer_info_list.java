package application;

public class man_viewer_info_list {
	private man_viewer_info_list next;
	private Object info;
	private Object name;
	
	public man_viewer_info_list(man_viewer_info_list next, Object info, Object name) {
		setNext(next);
		setInfo(info);
		setName(name);
	}
	public man_viewer_info_list() {
	}
	
	public man_viewer_info_list getNext() {
		return next;
	}
	public void setNext(man_viewer_info_list newNext) {
		next = newNext;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object newInfo) {
		info = newInfo;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
