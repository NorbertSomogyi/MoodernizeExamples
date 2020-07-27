package application;

public class test_entry {
	private int padding;
	private hashmap_entry ent;
	private Object key;
	
	public test_entry(int padding, hashmap_entry ent, Object key) {
		setPadding(padding);
		setEnt(ent);
		setKey(key);
	}
	public test_entry() {
	}
	
	public test_entry alloc_test_entry(int hash, Byte key, Byte value) {
		size_t klen = /*Error: Function owner not recognized*/strlen(key);
		size_t vlen = /*Error: Function owner not recognized*/strlen(value);
		test_entry entry = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(ModernizedCProgram.st_add(ModernizedCProgram.st_add(((/*Error: sizeof expression not supported yet*/)), ((klen))), ((vlen))), (true)));
		hashmap_entry generatedEnt = entry.getEnt();
		generatedEnt.hashmap_entry_init(hash);
		Object generatedKey = entry.getKey();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKey, key, klen + 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKey + klen + 1, value, vlen + 1);
		return entry;
	}
	public int getPadding() {
		return padding;
	}
	public void setPadding(int newPadding) {
		padding = newPadding;
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
}
