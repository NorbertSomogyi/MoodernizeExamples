package application;

public class commit_extra_header {
	private commit_extra_header next;
	private Byte key;
	private Byte value;
	private Object len;
	
	public commit_extra_header(commit_extra_header next, Byte key, Byte value, Object len) {
		setNext(next);
		setKey(key);
		setValue(value);
		setLen(len);
	}
	public commit_extra_header() {
	}
	
	public commit_extra_header getNext() {
		return next;
	}
	public void setNext(commit_extra_header newNext) {
		next = newNext;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
}
