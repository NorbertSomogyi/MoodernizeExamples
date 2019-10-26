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
	
	public curl_hash_element mk_hash_element(Object key, Object key_len, Object p) {
		curl_hash_element he = .Curl_cmalloc( + /* allocate the struct plus memory after it to store the key */key_len);
		Object generatedKey = he.getKey();
		if (he) {
			.memcpy(generatedKey, key, /* copy the key */key_len);
			he.setKey_len(key_len);
			he.setPtr((Object)p);
		} 
		return he/* Insert the data in the hash. If there already was a match in the hash,
		 * that data is replaced.
		 *
		 * @unittest: 1305
		 * @unittest: 1602
		 * @unittest: 1603
		 */;
	}
	public curl_hash_element Curl_hash_next_element(curl_hash_iterator iter) {
		curl_hash generatedHash = iter.getHash();
		curl_hash h = generatedHash;
		curl_llist_element generatedCurrent_element = iter.getCurrent_element();
		curl_llist_element generatedNext = generatedCurrent_element.getNext();
		if (generatedCurrent_element) {
			iter.setCurrent_element(generatedNext);
		} 
		int generatedSlots = h.getSlots();
		curl_llist generatedTable = h.getTable();
		int generatedSlot_index = iter.getSlot_index();
		if (!generatedCurrent_element) {
			int i;
			for (i = generatedSlot_index; i < generatedSlots; i++) {
				if (generatedTable[i].getHead()) {
					iter.setCurrent_element(generatedTable[i].getHead());
					iter.setSlot_index(i + 1);
					break;
				} 
			}
		} 
		Object generatedPtr = generatedCurrent_element.getPtr();
		if (generatedCurrent_element) {
			curl_hash_element he = generatedPtr;
			return he;
		} 
		iter.setCurrent_element(((Object)0));
		return ((Object)0/* useful function for debugging hashes and their contents *//* useful function for debugging hashes and their contents */);
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
