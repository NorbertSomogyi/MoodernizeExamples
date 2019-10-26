package application;

public class pack_entry {
	private Object offset;
	private packed_git p;
	
	public pack_entry(Object offset, packed_git p) {
		setOffset(offset);
		setP(p);
	}
	public pack_entry() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public packed_git getP() {
		return p;
	}
	public void setP(packed_git newP) {
		p = newP;
	}
}
