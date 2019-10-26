package application;

public class delta_base_cache_entry {
	private hashmap_entry ent;
	private delta_base_cache_key key;
	private list_head lru;
	private Object data;
	private long size;
	private object_type type;
	
	public delta_base_cache_entry(hashmap_entry ent, delta_base_cache_key key, list_head lru, Object data, long size, object_type type) {
		setEnt(ent);
		setKey(key);
		setLru(lru);
		setData(data);
		setSize(size);
		setType(type);
	}
	public delta_base_cache_entry() {
	}
	
	public delta_base_cache_entry get_delta_base_cache_entry(packed_git p, Object base_offset) {
		hashmap_entry entry = new hashmap_entry();
		hashmap_entry e = new hashmap_entry();
		delta_base_cache_key key = new delta_base_cache_key();
		if (!ModernizedCProgram.delta_base_cache.getCmpfn()) {
			return ((Object)0);
		} 
		entry.hashmap_entry_init(p.pack_entry_hash(base_offset));
		key.setP(p);
		key.setBase_offset(base_offset);
		hashmap_entry hashmap_entry = new hashmap_entry();
		e = hashmap_entry.hashmap_get(ModernizedCProgram.delta_base_cache, entry, key);
		return e ? ((delta_base_cache_entry)((byte)(e) - ((size_t)((delta_base_cache_entry)0).getEnt()))) : ((Object)0);
	}
	public void detach_delta_base_cache_entry() {
		hashmap_entry generatedEnt = this.getEnt();
		delta_base_cache_key generatedKey = this.getKey();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry.hashmap_remove(ModernizedCProgram.delta_base_cache, generatedEnt, generatedKey);
		list_head generatedLru = this.getLru();
		generatedLru.list_del();
		long generatedSize = this.getSize();
		ModernizedCProgram.delta_base_cached -= generatedSize;
		ModernizedCProgram.free(ent);
	}
	public void release_delta_base_cache() {
		Object generatedData = this.getData();
		ModernizedCProgram.free(generatedData);
		ent.detach_delta_base_cache_entry();
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public delta_base_cache_key getKey() {
		return key;
	}
	public void setKey(delta_base_cache_key newKey) {
		key = newKey;
	}
	public list_head getLru() {
		return lru;
	}
	public void setLru(list_head newLru) {
		lru = newLru;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public object_type getType() {
		return type;
	}
	public void setType(object_type newType) {
		type = newType;
	}
}
