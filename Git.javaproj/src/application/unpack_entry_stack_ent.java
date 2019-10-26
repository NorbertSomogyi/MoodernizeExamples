package application;

public class unpack_entry_stack_ent {
	private Object obj_offset;
	private Object curpos;
	private long size;
	
	public unpack_entry_stack_ent(Object obj_offset, Object curpos, long size) {
		setObj_offset(obj_offset);
		setCurpos(curpos);
		setSize(size);
	}
	public unpack_entry_stack_ent() {
	}
	
	public Object getObj_offset() {
		return obj_offset;
	}
	public void setObj_offset(Object newObj_offset) {
		obj_offset = newObj_offset;
	}
	public Object getCurpos() {
		return curpos;
	}
	public void setCurpos(Object newCurpos) {
		curpos = newCurpos;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}
