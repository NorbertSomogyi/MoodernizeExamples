package application;

public class curl_hash_element {
	private curl_llist_element list;
	private Object ptr;
	private Object key_len;
	private Object key;
	
	public curl_hash_element(curl_llist_element list, Object ptr, Object key_len, Object key) {
		setList(list);
		setPtr(ptr);
		setKey_len(key_len);
		setKey(key);
	}
	public curl_hash_element() {
	}
	
	public curl_llist_element getList() {
		return list;
	}
	public void setList(curl_llist_element newList) {
		list = newList;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getKey_len() {
		return key_len;
	}
	public void setKey_len(Object newKey_len) {
		key_len = newKey_len;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
}
