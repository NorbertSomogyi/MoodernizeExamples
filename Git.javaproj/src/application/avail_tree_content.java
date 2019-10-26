package application;

public class avail_tree_content {
	private int entry_capacity;
	private avail_tree_content next_avail;
	
	public avail_tree_content(int entry_capacity, avail_tree_content next_avail) {
		setEntry_capacity(entry_capacity);
		setNext_avail(next_avail);
	}
	public avail_tree_content() {
	}
	
	public int getEntry_capacity() {
		return entry_capacity;
	}
	public void setEntry_capacity(int newEntry_capacity) {
		entry_capacity = newEntry_capacity;
	}
	public avail_tree_content getNext_avail() {
		return next_avail;
	}
	public void setNext_avail(avail_tree_content newNext_avail) {
		next_avail = newNext_avail;
	}
}
