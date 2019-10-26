package application;

public class ext2fs_hashmap {
	private Object size;
	private Object hash;
	private Object free;
	private ext2fs_hashmap_entry first;
	private ext2fs_hashmap_entry last;
	private Object entries;
	
	public ext2fs_hashmap(Object size, Object hash, Object free, ext2fs_hashmap_entry first, ext2fs_hashmap_entry last, Object entries) {
		setSize(size);
		setHash(hash);
		setFree(free);
		setFirst(first);
		setLast(last);
		setEntries(entries);
	}
	public ext2fs_hashmap() {
	}
	
	public ext2fs_hashmap ext2fs_hashmap_create(Object hash_fct, Object free_fct, Object size) {
		ext2fs_hashmap h = .calloc( +  * size, 1);
		if (!h) {
			return h;
		} 
		h.setSize(size);
		h.setFree(free_fct);
		h.setHash(hash_fct);
		h.setFirst(h.setLast(((Object)0)));
		return h;
	}
	public void ext2fs_hashmap_add(Object data, Object key, Object key_len) {
		Object generatedSize = this.getSize();
		uint32_t hash = .UNRECOGNIZEDFUNCTIONNAME(key, key_len) % generatedSize;
		ext2fs_hashmap_entry e = .malloc();
		if (!e) {
			return ;
		} 
		e.setData(data);
		e.setKey(key);
		e.setKey_len(key_len);
		Object generatedEntries = this.getEntries();
		e.setNext(generatedEntries[hash]);
		generatedEntries[hash] = e;
		e.setList_prev(((Object)0));
		ext2fs_hashmap_entry generatedFirst = this.getFirst();
		e.setList_next(generatedFirst);
		if (generatedFirst) {
			generatedFirst.setList_prev(e);
		} 
		this.setFirst(e);
		ext2fs_hashmap_entry generatedLast = this.getLast();
		if (!generatedLast) {
			this.setLast(e);
		} 
	}
	public Object ext2fs_hashmap_lookup(Object key, Object key_len) {
		ext2fs_hashmap_entry iter = new ext2fs_hashmap_entry();
		Object generatedSize = this.getSize();
		uint32_t hash = .UNRECOGNIZEDFUNCTIONNAME(key, key_len) % generatedSize;
		Object generatedKey_len = iter.getKey_len();
		Object generatedKey = iter.getKey();
		Object generatedData = iter.getData();
		ext2fs_hashmap_entry generatedNext = iter.getNext();
		Object generatedEntries = this.getEntries();
		for (iter = generatedEntries[hash]; iter; iter = generatedNext) {
			if (generatedKey_len == key_len && !.memcmp(generatedKey, key, key_len)) {
				return generatedData;
			} 
		}
		return ((Object)0);
	}
	public void ext2fs_hashmap_free() {
		size_t i = new size_t();
		Object generatedSize = this.getSize();
		Object generatedEntries = this.getEntries();
		ext2fs_hashmap_entry generatedNext = it.getNext();
		Object generatedFree = this.getFree();
		Object generatedData = it.getData();
		for (i = 0; i < generatedSize; ++i) {
			ext2fs_hashmap_entry it = generatedEntries[i];
			while (it) {
				ext2fs_hashmap_entry tmp = generatedNext;
				if (generatedFree) {
					.UNRECOGNIZEDFUNCTIONNAME(generatedData);
				} 
				.free(it);
				it = tmp;
			}
		}
		.free(h);
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getFree() {
		return free;
	}
	public void setFree(Object newFree) {
		free = newFree;
	}
	public ext2fs_hashmap_entry getFirst() {
		return first;
	}
	public void setFirst(ext2fs_hashmap_entry newFirst) {
		first = newFirst;
	}
	public ext2fs_hashmap_entry getLast() {
		return last;
	}
	public void setLast(ext2fs_hashmap_entry newLast) {
		last = newLast;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
}
