package application;

/*
 * Builtin help command
 */
public class man_viewer_list {
	private man_viewer_list next;
	private Object name;
	
	public man_viewer_list(man_viewer_list next, Object name) {
		setNext(next);
		setName(name);
	}
	public man_viewer_list() {
	}
	
	public man_viewer_list getNext() {
		return next;
	}
	public void setNext(man_viewer_list newNext) {
		next = newNext;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
