package application;

public class tip_table_entry {
	private object_id oid;
	private Object refname;
	
	public tip_table_entry(object_id oid, Object refname) {
		setOid(oid);
		setRefname(refname);
	}
	public tip_table_entry() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
}
