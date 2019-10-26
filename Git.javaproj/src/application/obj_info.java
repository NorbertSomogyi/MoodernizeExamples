package application;

public class obj_info {
	private Object offset;
	private object_id oid;
	private object obj;
	
	public obj_info(Object offset, object_id oid, object obj) {
		setOffset(offset);
		setOid(oid);
		setObj(obj);
	}
	public obj_info() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public object getObj() {
		return obj;
	}
	public void setObj(object newObj) {
		obj = newObj;
	}
}
/*
 * Called only from check_object() after it verified this object
 * is Ok.
 */
