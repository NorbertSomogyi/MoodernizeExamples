package application;

public class bin_tree_storage_t {
	private bin_tree_storage_t next;
	private Object data;
	
	public bin_tree_storage_t(bin_tree_storage_t next, Object data) {
		setNext(next);
		setData(data);
	}
	public bin_tree_storage_t() {
	}
	
	public bin_tree_storage_t getNext() {
		return next;
	}
	public void setNext(bin_tree_storage_t newNext) {
		next = newNext;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
