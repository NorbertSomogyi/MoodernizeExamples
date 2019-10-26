package application;

/* returns a pointer to an item in front of sha1 */
public class llist_item {
	private llist_item next;
	private Object oid;
	
	public llist_item(llist_item next, Object oid) {
		setNext(next);
		setOid(oid);
	}
	public llist_item() {
	}
	
	public void llist_item_put() {
		this.setNext(ModernizedCProgram.free_nodes);
		ModernizedCProgram.free_nodes = item;
	}
	public llist_item llist_item_get() {
		llist_item new_item = new llist_item();
		if (ModernizedCProgram.free_nodes) {
			new_item = ModernizedCProgram.free_nodes;
			ModernizedCProgram.free_nodes = ModernizedCProgram.free_nodes.getNext();
		} else {
				int i = 1;
				(new_item) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (true)));
				for (; i < 512; i++) {
					new_item[i].llist_item_put();
				}
		} 
		return new_item;
	}
	public llist_item llist_insert(llist list, Object oid) {
		llist_item llist_item = new llist_item();
		llist_item new_item = llist_item.llist_item_get();
		new_item.setOid(oid);
		new_item.setNext(((Object)0));
		llist_item generatedNext = this.getNext();
		llist_item generatedBack = list.getBack();
		Object generatedSize = list.getSize();
		llist_item generatedFront = list.getFront();
		if (after != ((Object)0)) {
			new_item.setNext(generatedNext);
			this.setNext(new_item);
			if (after == generatedBack) {
				list.setBack(new_item);
			} 
		} else {
				if (generatedSize == /* insert in front */0) {
					list.setBack(new_item);
				} else {
						new_item.setNext(generatedFront);
				} 
				list.setFront(new_item);
		} 
		generatedSize++;
		return new_item;
	}
	public llist_item llist_insert_back(llist list, Object oid) {
		llist_item generatedBack = list.getBack();
		return generatedBack.llist_insert(list, oid);
	}
	public llist_item llist_insert_sorted_unique(llist list, Object oid) {
		llist_item prev = ((Object)0);
		llist_item l = new llist_item();
		llist_item generatedFront = list.getFront();
		l = (hint == ((Object)0)) ? generatedFront : hint;
		Object generatedOid = l.getOid();
		llist_item generatedNext = l.getNext();
		while (l) {
			int cmp = ModernizedCProgram.oidcmp(generatedOid, oid);
			if (cmp > /* we insert before this entry */0) {
				return prev.llist_insert(list, oid);
			} 
			if (!/* already exists */cmp) {
				return l;
			} 
			prev = l;
			l = generatedNext;
		}
		llist_item llist_item = new llist_item();
		return llist_item.llist_insert_back(list, /* insert at the end */oid);
	}
	public llist_item llist_sorted_remove(llist list, Object oid) {
		llist_item prev = new llist_item();
		llist_item l = new llist_item();
		prev = ((Object)0);
		Object generatedOid = l.getOid();
		llist_item generatedFront = list.getFront();
		llist_item generatedNext = l.getNext();
		llist_item generatedBack = list.getBack();
		Object generatedSize = list.getSize();
		while (l) {
			int cmp = ModernizedCProgram.oidcmp(generatedOid, oid);
			if (cmp > /* not in list, since sorted */0) {
				return prev;
			} 
			if (!/* found */cmp) {
				if (prev == ((Object)0)) {
					if (hint != ((Object)0) && hint != generatedFront) {
						hint = ((Object)/* we don't know the previous element */0);
						;
					} 
					list.setFront(generatedNext);
				} else {
						prev.setNext(generatedNext);
				} 
				if (l == generatedBack) {
					list.setBack(prev);
				} 
				l.llist_item_put();
				generatedSize--;
				return prev;
			} 
			prev = l;
			l = generatedNext;
		}
		return prev;
	}
	public llist_item getNext() {
		return next;
	}
	public void setNext(llist_item newNext) {
		next = newNext;
	}
	public Object getOid() {
		return oid;
	}
	public void setOid(Object newOid) {
		oid = newOid;
	}
}
