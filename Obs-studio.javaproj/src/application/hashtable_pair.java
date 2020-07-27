package application;

public class hashtable_pair {
	private hashtable_list list;
	private hashtable_list ordered_list;
	private Object hash;
	private json_t value;
	private Object key;
	
	public hashtable_pair(hashtable_list list, hashtable_list ordered_list, Object hash, json_t value, Object key) {
		setList(list);
		setOrdered_list(ordered_list);
		setHash(hash);
		setValue(value);
		setKey(key);
	}
	public hashtable_pair() {
	}
	
	public hashtable_pair hashtable_find_pair(hashtable hashtable, hashtable_bucket bucket, Object key, Object hash) {
		list_t list = new list_t();
		pair_t pair = new pair_t();
		if (ModernizedCProgram.bucket_is_empty(hashtable, bucket)) {
			return ((Object)0);
		} 
		hashtable_list generatedFirst = bucket.getFirst();
		list = generatedFirst;
		Object generatedHash = pair.getHash();
		Object generatedKey = pair.getKey();
		hashtable_list generatedLast = bucket.getLast();
		hashtable_list generatedNext = list.getNext();
		while (1) {
			pair = ((pair_t)((byte)list - ((size_t)((pair_t)0).getList())));
			if (generatedHash == hash && /*Error: Function owner not recognized*/strcmp(generatedKey, key) == 0) {
				return pair;
			} 
			if (list == generatedLast) {
				break;
			} 
			list = generatedNext;
		}
		return ((Object)0);
	}
	public hashtable_list getList() {
		return list;
	}
	public void setList(hashtable_list newList) {
		list = newList;
	}
	public hashtable_list getOrdered_list() {
		return ordered_list;
	}
	public void setOrdered_list(hashtable_list newOrdered_list) {
		ordered_list = newOrdered_list;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public json_t getValue() {
		return value;
	}
	public void setValue(json_t newValue) {
		value = newValue;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
}
