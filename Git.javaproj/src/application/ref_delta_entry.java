package application;

public class ref_delta_entry {
	private object_id oid;
	private int obj_no;
	
	public ref_delta_entry(object_id oid, int obj_no) {
		setOid(oid);
		setObj_no(obj_no);
	}
	public ref_delta_entry() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getObj_no() {
		return obj_no;
	}
	public void setObj_no(int newObj_no) {
		obj_no = newObj_no;
	}
}
