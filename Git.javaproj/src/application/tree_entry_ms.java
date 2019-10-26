package application;

public class tree_entry_ms {
	private Object mode;
	private object_id oid;
	
	public tree_entry_ms(Object mode, object_id oid) {
		setMode(mode);
		setOid(oid);
	}
	public tree_entry_ms() {
	}
	
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
