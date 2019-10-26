package application;

public class commit_graft {
	private object_id oid;
	private int nr_parent;
	private Object parent;
	
	public commit_graft(object_id oid, int nr_parent, Object parent) {
		setOid(oid);
		setNr_parent(nr_parent);
		setParent(parent);
	}
	public commit_graft() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getNr_parent() {
		return nr_parent;
	}
	public void setNr_parent(int newNr_parent) {
		nr_parent = newNr_parent;
	}
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
}
