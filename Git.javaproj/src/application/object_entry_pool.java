package application;

public class object_entry_pool {
	private object_entry_pool next_pool;
	private object_entry next_free;
	private object_entry end;
	private Object entries;
	
	public object_entry_pool(object_entry_pool next_pool, object_entry next_free, object_entry end, Object entries) {
		setNext_pool(next_pool);
		setNext_free(next_free);
		setEnd(end);
		setEntries(entries);
	}
	public object_entry_pool() {
	}
	
	public object_entry_pool getNext_pool() {
		return next_pool;
	}
	public void setNext_pool(object_entry_pool newNext_pool) {
		next_pool = newNext_pool;
	}
	public object_entry getNext_free() {
		return next_free;
	}
	public void setNext_free(object_entry newNext_free) {
		next_free = newNext_free;
	}
	public object_entry getEnd() {
		return end;
	}
	public void setEnd(object_entry newEnd) {
		end = newEnd;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
}
