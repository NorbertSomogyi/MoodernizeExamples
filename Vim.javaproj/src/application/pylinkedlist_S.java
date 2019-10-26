package application;

public class pylinkedlist_S {
	private pylinkedlist_S pll_next;
	private pylinkedlist_S pll_prev;
	private Object pll_obj;
	
	public pylinkedlist_S(pylinkedlist_S pll_next, pylinkedlist_S pll_prev, Object pll_obj) {
		setPll_next(pll_next);
		setPll_prev(pll_prev);
		setPll_obj(pll_obj);
	}
	public pylinkedlist_S() {
	}
	
	public void pyll_remove(pylinkedlist_S last) {
		pylinkedlist_S generatedPll_prev = this.getPll_prev();
		pylinkedlist_S generatedPll_next = this.getPll_next();
		if (generatedPll_prev == NULL) {
			if (generatedPll_next == NULL) {
				last = NULL;
				return ;
			} 
		} else {
				generatedPll_prev.setPll_next(generatedPll_next);
		} 
		if (generatedPll_next == NULL) {
			last = generatedPll_prev;
		} else {
				generatedPll_next.setPll_prev(generatedPll_prev);
		} 
	}
	public void pyll_add(Object self, pylinkedlist_S last) {
		if (last == NULL) {
			this.setPll_prev(NULL);
		} else {
				(last).setPll_next(ref);
				this.setPll_prev(last);
		} 
		this.setPll_next(NULL);
		this.setPll_obj(self);
		last = ref;
	}
	public pylinkedlist_S getPll_next() {
		return pll_next;
	}
	public void setPll_next(pylinkedlist_S newPll_next) {
		pll_next = newPll_next;
	}
	public pylinkedlist_S getPll_prev() {
		return pll_prev;
	}
	public void setPll_prev(pylinkedlist_S newPll_prev) {
		pll_prev = newPll_prev;
	}
	public Object getPll_obj() {
		return pll_obj;
	}
	public void setPll_obj(Object newPll_obj) {
		pll_obj = newPll_obj;
	}
}
