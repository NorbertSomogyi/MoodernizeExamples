package application;

public class device_id_data {
	private Object uid;
	private Object id;
	private Object found;
	
	public device_id_data(Object uid, Object id, Object found) {
		setUid(uid);
		setId(id);
		setFound(found);
	}
	public device_id_data() {
	}
	
	public Object getUid() {
		return uid;
	}
	public void setUid(Object newUid) {
		uid = newUid;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getFound() {
		return found;
	}
	public void setFound(Object newFound) {
		found = newFound;
	}
}
