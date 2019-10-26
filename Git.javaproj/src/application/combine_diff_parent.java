package application;

public class combine_diff_parent {
	private byte status;
	private int mode;
	private object_id oid;
	private strbuf path;
	
	public combine_diff_parent(byte status, int mode, object_id oid, strbuf path) {
		setStatus(status);
		setMode(mode);
		setOid(oid);
		setPath(path);
	}
	public combine_diff_parent() {
	}
	
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte newStatus) {
		status = newStatus;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public strbuf getPath() {
		return path;
	}
	public void setPath(strbuf newPath) {
		path = newPath;
	}
}
