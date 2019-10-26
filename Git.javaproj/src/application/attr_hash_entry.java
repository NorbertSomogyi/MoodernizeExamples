package application;

/* The container for objects stored in "struct attr_hashmap" */
public class attr_hash_entry {
	private hashmap_entry ent;
	private Object key;
	private Object keylen;
	private Object value;
	
	public attr_hash_entry(hashmap_entry ent, Object key, Object keylen, Object value) {
		setEnt(ent);
		setKey(key);
		setKeylen(keylen);
		setValue(value);
	}
	public attr_hash_entry() {
	}
	
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getKeylen() {
		return keylen;
	}
	public void setKeylen(Object newKeylen) {
		keylen = newKeylen;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
