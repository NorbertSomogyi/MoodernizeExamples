package application;

public class idx_entry {
	private Object offset;
	private idx_entry_object oid;
	private int nr;
	
	public idx_entry(Object offset, idx_entry_object oid, int nr) {
		setOffset(offset);
		setOid(oid);
		setNr(nr);
	}
	public idx_entry() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public idx_entry_object getOid() {
		return oid;
	}
	public void setOid(idx_entry_object newOid) {
		oid = newOid;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
}
