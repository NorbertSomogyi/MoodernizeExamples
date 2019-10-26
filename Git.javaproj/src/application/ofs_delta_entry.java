package application;

public class ofs_delta_entry {
	private Object offset;
	private int obj_no;
	
	public ofs_delta_entry(Object offset, int obj_no) {
		setOffset(offset);
		setObj_no(obj_no);
	}
	public ofs_delta_entry() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public int getObj_no() {
		return obj_no;
	}
	public void setObj_no(int newObj_no) {
		obj_no = newObj_no;
	}
}
