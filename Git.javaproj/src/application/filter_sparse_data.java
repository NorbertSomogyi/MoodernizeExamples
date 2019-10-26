package application;

public class filter_sparse_data {
	private pattern_list pl;
	private Object nr;
	private Object alloc;
	private frame array_frame;
	
	public filter_sparse_data(pattern_list pl, Object nr, Object alloc, frame array_frame) {
		setPl(pl);
		setNr(nr);
		setAlloc(alloc);
		setArray_frame(array_frame);
	}
	public filter_sparse_data() {
	}
	
	public pattern_list getPl() {
		return pl;
	}
	public void setPl(pattern_list newPl) {
		pl = newPl;
	}
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public frame getArray_frame() {
		return array_frame;
	}
	public void setArray_frame(frame newArray_frame) {
		array_frame = newArray_frame;
	}
}
