package application;

public class llist {
	private llist_item front;
	private llist_item back;
	private Object size;
	
	public llist(llist_item front, llist_item back, Object size) {
		setFront(front);
		setBack(back);
		setSize(size);
	}
	public llist() {
	}
	
	public void llist_init() {
		ModernizedCProgram.list = ModernizedCProgram.xmalloc();
		(ModernizedCProgram.list).setFront((ModernizedCProgram.list).setBack(((Object)0)));
		(ModernizedCProgram.list).setSize(0);
	}
	public llist llist_copy() {
		llist ret = new llist();
		llist_item new_item = new llist_item();
		llist_item old_item = new llist_item();
		llist_item prev = new llist_item();
		ret.llist_init();
		if ((ret.setSize(ModernizedCProgram.list.getSize())) == 0) {
			return ret;
		} 
		llist_item llist_item = new llist_item();
		new_item = ret.setFront(llist_item.llist_item_get());
		new_item.setOid(ModernizedCProgram.list.getFront().getOid());
		old_item = ModernizedCProgram.list.getFront().getNext();
		Object generatedOid = old_item.getOid();
		llist_item generatedNext = old_item.getNext();
		while (old_item) {
			prev = new_item;
			new_item = llist_item.llist_item_get();
			prev.setNext(new_item);
			new_item.setOid(generatedOid);
			old_item = generatedNext;
		}
		new_item.setNext(((Object)0));
		ret.setBack(new_item);
		return ret;
	}
	/* computes A\B */
	public void llist_sorted_difference_inplace(llist B) {
		llist_item hint = new llist_item();
		llist_item b = new llist_item();
		hint = ((Object)0);
		llist_item generatedFront = B.getFront();
		b = generatedFront;
		Object generatedOid = b.getOid();
		llist_item generatedNext = b.getNext();
		while (b) {
			hint = hint.llist_sorted_remove(A, generatedOid);
			b = generatedNext;
		}
	}
	public llist_item getFront() {
		return front;
	}
	public void setFront(llist_item newFront) {
		front = newFront;
	}
	public llist_item getBack() {
		return back;
	}
	public void setBack(llist_item newBack) {
		back = newBack;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
