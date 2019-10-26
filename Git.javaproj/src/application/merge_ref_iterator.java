package application;

public class merge_ref_iterator {
	private ref_iterator base;
	private ref_iterator iter0;
	private ref_iterator iter1;
	private Object select;
	private Object cb_data;
	private ref_iterator current;
	
	public merge_ref_iterator(ref_iterator base, ref_iterator iter0, ref_iterator iter1, Object select, Object cb_data, ref_iterator current) {
		setBase(base);
		setIter0(iter0);
		setIter1(iter1);
		setSelect(select);
		setCb_data(cb_data);
		setCurrent(current);
	}
	public merge_ref_iterator() {
	}
	
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
	public ref_iterator getIter0() {
		return iter0;
	}
	public void setIter0(ref_iterator newIter0) {
		iter0 = newIter0;
	}
	public ref_iterator getIter1() {
		return iter1;
	}
	public void setIter1(ref_iterator newIter1) {
		iter1 = newIter1;
	}
	public Object getSelect() {
		return select;
	}
	public void setSelect(Object newSelect) {
		select = newSelect;
	}
	public Object getCb_data() {
		return cb_data;
	}
	public void setCb_data(Object newCb_data) {
		cb_data = newCb_data;
	}
	public ref_iterator getCurrent() {
		return current;
	}
	public void setCurrent(ref_iterator newCurrent) {
		current = newCurrent;
	}
}
