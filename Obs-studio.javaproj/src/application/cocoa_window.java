package application;

public class cocoa_window {
	private Object window_id;
	private Object name_lock;
	private Object owner_name;
	private Object window_name;
	private Object next_search_time;
	
	public cocoa_window(Object window_id, Object name_lock, Object owner_name, Object window_name, Object next_search_time) {
		setWindow_id(window_id);
		setName_lock(name_lock);
		setOwner_name(owner_name);
		setWindow_name(window_name);
		setNext_search_time(next_search_time);
	}
	public cocoa_window() {
	}
	
	public Object getWindow_id() {
		return window_id;
	}
	public void setWindow_id(Object newWindow_id) {
		window_id = newWindow_id;
	}
	public Object getName_lock() {
		return name_lock;
	}
	public void setName_lock(Object newName_lock) {
		name_lock = newName_lock;
	}
	public Object getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(Object newOwner_name) {
		owner_name = newOwner_name;
	}
	public Object getWindow_name() {
		return window_name;
	}
	public void setWindow_name(Object newWindow_name) {
		window_name = newWindow_name;
	}
	public Object getNext_search_time() {
		return next_search_time;
	}
	public void setNext_search_time(Object newNext_search_time) {
		next_search_time = newNext_search_time;
	}
}
