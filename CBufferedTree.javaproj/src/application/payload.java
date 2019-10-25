package application;

public class payload {
	private Object key;
	private Object val;
	private Object next;
	private payload_type type;
	
	public payload(Object key, Object val, Object next, payload_type type) {
		setKey(key);
		setVal(val);
		setNext(next);
		setType(type);
	}
	public payload() {
	}
	
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getVal() {
		return val;
	}
	public void setVal(Object newVal) {
		val = newVal;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public payload_type getType() {
		return type;
	}
	public void setType(payload_type newType) {
		type = newType;
	}
}
