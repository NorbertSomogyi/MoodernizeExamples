package application;

public class ext2fs_hashmap_entry {
	private Object data;
	private Object key;
	private Object key_len;
	private ext2fs_hashmap_entry next;
	private ext2fs_hashmap_entry list_next;
	private ext2fs_hashmap_entry list_prev;
	
	public ext2fs_hashmap_entry(Object data, Object key, Object key_len, ext2fs_hashmap_entry next, ext2fs_hashmap_entry list_next, ext2fs_hashmap_entry list_prev) {
		setData(data);
		setKey(key);
		setKey_len(key_len);
		setNext(next);
		setList_next(list_next);
		setList_prev(list_prev);
	}
	public ext2fs_hashmap_entry() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getKey_len() {
		return key_len;
	}
	public void setKey_len(Object newKey_len) {
		key_len = newKey_len;
	}
	public ext2fs_hashmap_entry getNext() {
		return next;
	}
	public void setNext(ext2fs_hashmap_entry newNext) {
		next = newNext;
	}
	public ext2fs_hashmap_entry getList_next() {
		return list_next;
	}
	public void setList_next(ext2fs_hashmap_entry newList_next) {
		list_next = newList_next;
	}
	public ext2fs_hashmap_entry getList_prev() {
		return list_prev;
	}
	public void setList_prev(ext2fs_hashmap_entry newList_prev) {
		list_prev = newList_prev;
	}
}
