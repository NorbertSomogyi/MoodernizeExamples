package application;

public class resolve_undo_info {
	private Object mode;
	private Object oid;
	
	public resolve_undo_info(Object mode, Object oid) {
		setMode(mode);
		setOid(oid);
	}
	public resolve_undo_info() {
	}
	
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public Object getOid() {
		return oid;
	}
	public void setOid(Object newOid) {
		oid = newOid;
	}
}
