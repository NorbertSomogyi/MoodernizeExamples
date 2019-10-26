package application;

public class collected_reflog {
	private object_id oid;
	private Object reflog;
	
	public collected_reflog(object_id oid, Object reflog) {
		setOid(oid);
		setReflog(reflog);
	}
	public collected_reflog() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getReflog() {
		return reflog;
	}
	public void setReflog(Object newReflog) {
		reflog = newReflog;
	}
}
