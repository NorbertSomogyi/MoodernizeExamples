package application;

public class expire_reflog_cb {
	private int flags;
	private Object should_prune_fn;
	private Object policy_cb;
	private _iobuf newlog;
	private object_id last_kept_oid;
	
	public expire_reflog_cb(int flags, Object should_prune_fn, Object policy_cb, _iobuf newlog, object_id last_kept_oid) {
		setFlags(flags);
		setShould_prune_fn(should_prune_fn);
		setPolicy_cb(policy_cb);
		setNewlog(newlog);
		setLast_kept_oid(last_kept_oid);
	}
	public expire_reflog_cb() {
	}
	
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getShould_prune_fn() {
		return should_prune_fn;
	}
	public void setShould_prune_fn(Object newShould_prune_fn) {
		should_prune_fn = newShould_prune_fn;
	}
	public Object getPolicy_cb() {
		return policy_cb;
	}
	public void setPolicy_cb(Object newPolicy_cb) {
		policy_cb = newPolicy_cb;
	}
	public _iobuf getNewlog() {
		return newlog;
	}
	public void setNewlog(_iobuf newNewlog) {
		newlog = newNewlog;
	}
	public object_id getLast_kept_oid() {
		return last_kept_oid;
	}
	public void setLast_kept_oid(object_id newLast_kept_oid) {
		last_kept_oid = newLast_kept_oid;
	}
}
