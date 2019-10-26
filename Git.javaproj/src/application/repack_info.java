package application;

public class repack_info {
	private Object mtime;
	private Object referenced_objects;
	private Object pack_int_id;
	
	public repack_info(Object mtime, Object referenced_objects, Object pack_int_id) {
		setMtime(mtime);
		setReferenced_objects(referenced_objects);
		setPack_int_id(pack_int_id);
	}
	public repack_info() {
	}
	
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object getReferenced_objects() {
		return referenced_objects;
	}
	public void setReferenced_objects(Object newReferenced_objects) {
		referenced_objects = newReferenced_objects;
	}
	public Object getPack_int_id() {
		return pack_int_id;
	}
	public void setPack_int_id(Object newPack_int_id) {
		pack_int_id = newPack_int_id;
	}
}
