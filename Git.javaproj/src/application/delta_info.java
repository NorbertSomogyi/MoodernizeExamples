package application;

public class delta_info {
	private object_id base_oid;
	private int nr;
	private Object base_offset;
	private long size;
	private Object delta;
	private delta_info next;
	
	public delta_info(object_id base_oid, int nr, Object base_offset, long size, Object delta, delta_info next) {
		setBase_oid(base_oid);
		setNr(nr);
		setBase_offset(base_offset);
		setSize(size);
		setDelta(delta);
		setNext(next);
	}
	public delta_info() {
	}
	
	public object_id getBase_oid() {
		return base_oid;
	}
	public void setBase_oid(object_id newBase_oid) {
		base_oid = newBase_oid;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public Object getBase_offset() {
		return base_offset;
	}
	public void setBase_offset(Object newBase_offset) {
		base_offset = newBase_offset;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public Object getDelta() {
		return delta;
	}
	public void setDelta(Object newDelta) {
		delta = newDelta;
	}
	public delta_info getNext() {
		return next;
	}
	public void setNext(delta_info newNext) {
		next = newNext;
	}
}
