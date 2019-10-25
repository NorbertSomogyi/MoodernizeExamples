package application;

public class curl_llist {
	private Object head;
	private Object tail;
	private Object dtor;
	private Object size;
	
	public curl_llist(Object head, Object tail, Object dtor, Object size) {
		setHead(head);
		setTail(tail);
		setDtor(dtor);
		setSize(size);
	}
	public curl_llist() {
	}
	
	public Object getHead() {
		return head;
	}
	public void setHead(Object newHead) {
		head = newHead;
	}
	public Object getTail() {
		return tail;
	}
	public void setTail(Object newTail) {
		tail = newTail;
	}
	public Object getDtor() {
		return dtor;
	}
	public void setDtor(Object newDtor) {
		dtor = newDtor;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
/* HEADER_CURL_LLIST_H */
