package application;

// Values for "v_lock".
// locked with lock(), can use unlock()
// locked forever
/*
 * Structure to hold an item of a list: an internal variable without a name.
 */
public class listitem_S {
	private listitem_S li_next;
	private listitem_S li_prev;
	private  li_tv;
	
	public listitem_S(listitem_S li_next, listitem_S li_prev,  li_tv) {
		setLi_next(li_next);
		setLi_prev(li_prev);
		setLi_tv(li_tv);
	}
	public listitem_S() {
	}
	
	public listitem_S listitem_alloc() {
		return (listitem_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*//*
		 * Free a list item.  Also clears the value.  Does not notify watchers.
		 */);
	}
	public void listitem_free() {
		 generatedLi_tv = this.getLi_tv();
		generatedLi_tv.clear_tv();
		ModernizedCProgram.vim_free(item/*
		 * Remove a list item from a List and free it.  Also clears the value.
		 */);
	}
	public listitem_S list_find(listvar_S l, long n) {
		listitem_T item = new listitem_T();
		long idx;
		if (l == ((Object)0)) {
			return ((Object)0);
		} 
		int generatedLv_len = l.getLv_len();
		if (n < /* Negative index is relative to the end. */0) {
			n = generatedLv_len + n;
		} 
		if (n < 0 || n >= generatedLv_len) {
			return ((Object)0);
		} 
		listitem_S generatedLv_idx_item = l.getLv_idx_item();
		int generatedLv_idx = l.getLv_idx();
		listitem_S generatedLv_first = l.getLv_first();
		listitem_S generatedLv_last = l.getLv_last();
		if (generatedLv_idx_item != ((Object)/* When there is a cached index may start search from there. */0)) {
			if (n < generatedLv_idx / 2) {
				item = generatedLv_first;
				idx = 0;
			}  else if (n > (generatedLv_idx + generatedLv_len) / 2) {
				item = generatedLv_last;
				idx = generatedLv_len - 1;
			} else {
					item = generatedLv_idx_item;
					idx = generatedLv_idx;
			} 
		} else {
				if (n < generatedLv_len / 2) {
					item = generatedLv_first;
					idx = 0;
				} else {
						item = generatedLv_last;
						idx = generatedLv_len - 1;
				} 
		} 
		listitem_S generatedLi_next = item.getLi_next();
		while (n > idx) {
			item = generatedLi_next;
			++idx;
		}
		listitem_S generatedLi_prev = item.getLi_prev();
		while (n < idx) {
			item = generatedLi_prev;
			--idx;
		}
		l.setLv_idx(/* cache the used index */idx);
		l.setLv_idx_item(item);
		return item/*
		 * Get list item "l[idx]" as a number.
		 */;
	}
	public listitem_S getLi_next() {
		return li_next;
	}
	public void setLi_next(listitem_S newLi_next) {
		li_next = newLi_next;
	}
	public listitem_S getLi_prev() {
		return li_prev;
	}
	public void setLi_prev(listitem_S newLi_prev) {
		li_prev = newLi_prev;
	}
	public  getLi_tv() {
		return li_tv;
	}
	public void setLi_tv( newLi_tv) {
		li_tv = newLi_tv;
	}
}
