package application;

/* callback for fsck_object, type is FSCK_ERROR or FSCK_WARN */
public class fsck_options {
	private Object walk;
	private Object error_func;
	private int strict;
	private Integer msg_type;
	private oidset skiplist;
	private decoration object_names;
	
	public fsck_options(Object walk, Object error_func, int strict, Integer msg_type, oidset skiplist, decoration object_names) {
		setWalk(walk);
		setError_func(error_func);
		setStrict(strict);
		setMsg_type(msg_type);
		setSkiplist(skiplist);
		setObject_names(object_names);
	}
	public fsck_options() {
	}
	
	public Object getWalk() {
		return walk;
	}
	public void setWalk(Object newWalk) {
		walk = newWalk;
	}
	public Object getError_func() {
		return error_func;
	}
	public void setError_func(Object newError_func) {
		error_func = newError_func;
	}
	public int getStrict() {
		return strict;
	}
	public void setStrict(int newStrict) {
		strict = newStrict;
	}
	public Integer getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(Integer newMsg_type) {
		msg_type = newMsg_type;
	}
	public oidset getSkiplist() {
		return skiplist;
	}
	public void setSkiplist(oidset newSkiplist) {
		skiplist = newSkiplist;
	}
	public decoration getObject_names() {
		return object_names;
	}
	public void setObject_names(decoration newObject_names) {
		object_names = newObject_names;
	}
}
/*
 * Some fsck checks are context-dependent, and may end up queued; run this
 * after completing all fsck_object() calls in order to resolve any remaining
 * checks.
 */
