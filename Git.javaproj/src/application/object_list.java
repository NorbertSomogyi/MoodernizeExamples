package application;

public class object_list {
	private object item;
	private object_list next;
	
	public object_list(object item, object_list next) {
		setItem(item);
		setNext(next);
	}
	public object_list() {
	}
	
	public object_list add_one_object(object obj) {
		object_list entry = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		entry.setItem(obj);
		entry.setNext(p);
		p = entry;
		object_list generatedNext = entry.getNext();
		return generatedNext;
	}
	public object_list object_list_insert(object item) {
		object_list new_list = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		new_list.setItem(item);
		new_list.setNext(list_p);
		list_p = new_list;
		return new_list;
	}
	public object getItem() {
		return item;
	}
	public void setItem(object newItem) {
		item = newItem;
	}
	public object_list getNext() {
		return next;
	}
	public void setNext(object_list newNext) {
		next = newNext;
	}
}
