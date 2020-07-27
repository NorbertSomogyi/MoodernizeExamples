package application;

public class attr_hashmap {
	private hashmap map;
	private Object mutex;
	
	public attr_hashmap(hashmap map, Object mutex) {
		setMap(map);
		setMutex(mutex);
	}
	public attr_hashmap() {
	}
	
	public void hashmap_lock() {
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_lock(generatedMutex);
	}
	public void hashmap_unlock() {
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_unlock(generatedMutex);
	}
	/* Initialize an 'attr_hashmap' object */
	public void attr_hashmap_init() {
		hashmap generatedMap = this.getMap();
		generatedMap.hashmap_init(attr_hash_entry_cmp, ((Object)0), 0/*
		 * Retrieve the 'value' stored in a hashmap given the provided 'key'.
		 * If there is no matching entry, return NULL.
		 */);
	}
	public Object attr_hashmap_get(Object key, Object keylen) {
		attr_hash_entry k = new attr_hash_entry();
		attr_hash_entry e = new attr_hash_entry();
		hashmap generatedMap = this.getMap();
		int generatedTablesize = generatedMap.getTablesize();
		if (!generatedTablesize) {
			map.attr_hashmap_init();
		} 
		hashmap_entry generatedEnt = k.getEnt();
		generatedEnt.hashmap_entry_init(ModernizedCProgram.memhash(key, keylen));
		k.setKey(key);
		k.setKeylen(keylen);
		hashmap_entry hashmap_entry = new hashmap_entry();
		e = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedMap, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
		Object generatedValue = e.getValue();
		return e ? generatedValue : ((Object)0);
	}
	/* Add 'value' to a hashmap based on the provided 'key'. */
	public void attr_hashmap_add(Object key, Object keylen, Object value) {
		attr_hash_entry e = new attr_hash_entry();
		hashmap generatedMap = this.getMap();
		int generatedTablesize = generatedMap.getTablesize();
		if (!generatedTablesize) {
			map.attr_hashmap_init();
		} 
		e = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		hashmap_entry generatedEnt = e.getEnt();
		generatedEnt.hashmap_entry_init(ModernizedCProgram.memhash(key, keylen));
		e.setKey(key);
		e.setKeylen(keylen);
		e.setValue(value);
		ModernizedCProgram.hashmap_add(generatedMap, generatedEnt);
	}
	public hashmap getMap() {
		return map;
	}
	public void setMap(hashmap newMap) {
		map = newMap;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
}
