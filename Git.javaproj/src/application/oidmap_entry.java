package application;

/*
 * struct oidmap_entry is a structure representing an entry in the hash table,
 * which must be used as first member of user data structures.
 *
 * Users should set the oid field. oidmap_put() will populate the
 * internal_entry field.
 */
public class oidmap_entry {
	private hashmap_entry internal_entry;
	private object_id oid;
	
	public oidmap_entry(hashmap_entry internal_entry, object_id oid) {
		setInternal_entry(internal_entry);
		setOid(oid);
	}
	public oidmap_entry() {
	}
	
	public hashmap_entry getInternal_entry() {
		return internal_entry;
	}
	public void setInternal_entry(hashmap_entry newInternal_entry) {
		internal_entry = newInternal_entry;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
/* For internal use only */
