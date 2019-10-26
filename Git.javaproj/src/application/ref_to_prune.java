package application;

public class ref_to_prune {
	private ref_to_prune next;
	private object_id oid;
	private Object name;
	
	public ref_to_prune(ref_to_prune next, object_id oid, Object name) {
		setNext(next);
		setOid(oid);
		setName(name);
	}
	public ref_to_prune() {
	}
	
	public ref_to_prune getNext() {
		return next;
	}
	public void setNext(ref_to_prune newNext) {
		next = newNext;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
