package application;

public class oidmap {
	private hashmap map;
	
	public oidmap(hashmap map) {
		setMap(map);
	}
	public oidmap() {
	}
	
	public void oidmap_init(Object initial_size) {
		hashmap generatedMap = this.getMap();
		generatedMap.hashmap_init(oidmap_neq, ((Object)0), initial_size);
	}
	public void oidmap_free(int free_entries) {
		if (!map) {
			return ;
		} 
		hashmap generatedMap = this.getMap();
		generatedMap.hashmap_free_(free_entries ? 0 : -/* TODO: make oidmap itself not depend on struct layouts */1);
	}
	public Object oidmap_remove(Object key) {
		hashmap_entry entry = new hashmap_entry();
		hashmap generatedMap = this.getMap();
		Object generatedCmpfn = generatedMap.getCmpfn();
		if (!generatedCmpfn) {
			map.oidmap_init(0);
		} 
		entry.hashmap_entry_init(ModernizedCProgram.oidhash(key));
		hashmap_entry hashmap_entry = new hashmap_entry();
		return hashmap_entry.hashmap_remove(generatedMap, entry, key);
	}
	public Object oidmap_put(Object entry) {
		oidmap_entry to_put = entry;
		hashmap generatedMap = this.getMap();
		Object generatedCmpfn = generatedMap.getCmpfn();
		if (!generatedCmpfn) {
			map.oidmap_init(0);
		} 
		hashmap_entry generatedInternal_entry = to_put.getInternal_entry();
		object_id generatedOid = to_put.getOid();
		generatedInternal_entry.hashmap_entry_init(ModernizedCProgram.oidhash(generatedOid));
		return generatedInternal_entry.hashmap_put(generatedMap);
	}
	public hashmap getMap() {
		return map;
	}
	public void setMap(hashmap newMap) {
		map = newMap;
	}
}
