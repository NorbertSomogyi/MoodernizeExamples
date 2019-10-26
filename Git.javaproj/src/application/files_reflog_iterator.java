package application;

public class files_reflog_iterator {
	private ref_iterator base;
	private ref_store ref_store;
	private dir_iterator dir_iterator;
	private object_id oid;
	
	public files_reflog_iterator(ref_iterator base, ref_store ref_store, dir_iterator dir_iterator, object_id oid) {
		setBase(base);
		setRef_store(ref_store);
		setDir_iterator(dir_iterator);
		setOid(oid);
	}
	public files_reflog_iterator() {
	}
	
	public ref_iterator getBase() {
		return base;
	}
	public void setBase(ref_iterator newBase) {
		base = newBase;
	}
	public ref_store getRef_store() {
		return ref_store;
	}
	public void setRef_store(ref_store newRef_store) {
		ref_store = newRef_store;
	}
	public dir_iterator getDir_iterator() {
		return dir_iterator;
	}
	public void setDir_iterator(dir_iterator newDir_iterator) {
		dir_iterator = newDir_iterator;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
