package application;

public class volatile_list_head {
	private Object next;
	private Object prev;
	
	public volatile_list_head(Object next, Object prev) {
		setNext(next);
		setPrev(prev);
	}
	public volatile_list_head() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
}
