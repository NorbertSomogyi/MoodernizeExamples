package application;

/* if not (flags&REF_DIR) */
public class ref_value {
	private object_id oid;
	
	public ref_value(object_id oid) {
		setOid(oid);
	}
	public ref_value() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
/*
	 * The name of the object to which this reference resolves
	 * (which may be a tag object).  If REF_ISBROKEN, this is
	 * null.  If REF_ISSYMREF, then this is the name of the object
	 * referred to by the last reference in the symlink chain.
	 */
