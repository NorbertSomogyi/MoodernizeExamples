package application;

public class bftree_opts {
	private Object key_dup;
	private Object val_dup;
	private Object key_compare;
	private Object key_destructor;
	private Object val_destructor;
	
	public bftree_opts(Object key_dup, Object val_dup, Object key_compare, Object key_destructor, Object val_destructor) {
		setKey_dup(key_dup);
		setVal_dup(val_dup);
		setKey_compare(key_compare);
		setKey_destructor(key_destructor);
		setVal_destructor(val_destructor);
	}
	public bftree_opts() {
	}
	
	public Object getKey_dup() {
		return key_dup;
	}
	public void setKey_dup(Object newKey_dup) {
		key_dup = newKey_dup;
	}
	public Object getVal_dup() {
		return val_dup;
	}
	public void setVal_dup(Object newVal_dup) {
		val_dup = newVal_dup;
	}
	public Object getKey_compare() {
		return key_compare;
	}
	public void setKey_compare(Object newKey_compare) {
		key_compare = newKey_compare;
	}
	public Object getKey_destructor() {
		return key_destructor;
	}
	public void setKey_destructor(Object newKey_destructor) {
		key_destructor = newKey_destructor;
	}
	public Object getVal_destructor() {
		return val_destructor;
	}
	public void setVal_destructor(Object newVal_destructor) {
		val_destructor = newVal_destructor;
	}
}
