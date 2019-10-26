package application;

public class ref_list_entry {
	private object_id oid;
	private Byte name;
	
	public ref_list_entry(object_id oid, Byte name) {
		setOid(oid);
		setName(name);
	}
	public ref_list_entry() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
}
