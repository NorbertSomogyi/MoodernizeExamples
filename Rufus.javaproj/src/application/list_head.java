package application;

/*
 * Simple doubly linked list implementation.
 *
 * Some of the internal functions ("__xxx") are useful when
 * manipulating whole lists rather than single entries, as
 * sometimes we already know the next/prev entries and we can
 * generate better code by using them directly rather than
 * using the generic single-entry routines.
 */
public class list_head {
	private list_head next;
	private list_head prev;
	
	public list_head(list_head next, list_head prev) {
		setNext(next);
		setPrev(prev);
	}
	public list_head() {
	}
	
	/*
	 * Insert a new entry between two known consecutive entries.
	 *
	 * This is only for internal list manipulation where we know
	 * the prev/next entries already!
	 */
	public void __list_add(list_head prev, list_head next) {
		next.setPrev(new);
		this.setNext(next);
		this.setPrev(prev);
		prev.setNext(new/*
		 * Insert a new entry after the specified head..
		 */);
	}
	public void list_add(list_head head) {
		list_head generatedNext = head.getNext();
		new.__list_add(head, generatedNext);
		list_head generatedNext = head.getNext();
		entry.setNext(generatedNext);
		entry.setPrev(head);
		generatedNext.setPrev(entry);
		head.setNext(entry);
	}
	public void list_add_tail(list_head head) {
		list_head generatedPrev = head.getPrev();
		new.__list_add(generatedPrev, head/*
		 * Delete a list entry by making the prev/next entries
		 * point to each other.
		 *
		 * This is only for internal list manipulation where we know
		 * the prev/next entries already!
		 */);
		entry.setNext(head);
		list_head generatedPrev = head.getPrev();
		entry.setPrev(generatedPrev);
		generatedPrev.setNext(entry);
		head.setPrev(entry);
	}
	public void __list_del(list_head next) {
		next.setPrev(prev);
		this.setNext(next);
	}
	public void list_del() {
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedPrev.__list_del(generatedNext);
		list_head generatedPrev = this.getPrev();
		list_head generatedNext = this.getNext();
		generatedNext.setPrev(generatedPrev);
		generatedPrev.setNext(generatedNext);
		this.setNext(this.setPrev(((Object)0)));
	}
	public int list_empty() {
		list_head generatedNext = this.getNext();
		return generatedNext == head/*
		 * Splice in "list" into "head"
		 */;
	}
	public void list_splice(list_head head) {
		list_head generatedNext = this.getNext();
		list_head first = generatedNext;
		list_head generatedPrev = this.getPrev();
		if (first != list) {
			list_head last = generatedPrev;
			list_head at = generatedNext;
			first.setPrev(head);
			head.setNext(first);
			last.setNext(at);
			at.setPrev(last);
		} 
	}
	public void list_init() {
		this.setPrev(this.setNext(entry));
	}
	public list_head getNext() {
		return next;
	}
	public void setNext(list_head newNext) {
		next = newNext;
	}
	public list_head getPrev() {
		return prev;
	}
	public void setPrev(list_head newPrev) {
		prev = newPrev;
	}
}
