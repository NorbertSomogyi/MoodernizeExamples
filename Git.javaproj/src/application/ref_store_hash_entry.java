package application;

public class ref_store_hash_entry {
	private hashmap_entry ent;
	private ref_store refs;
	private Object name;
	
	public ref_store_hash_entry(hashmap_entry ent, ref_store refs, Object name) {
		setEnt(ent);
		setRefs(refs);
		setName(name);
	}
	public ref_store_hash_entry() {
	}
	
	public ref_store_hash_entry alloc_ref_store_hash_entry(Object name, ref_store refs) {
		ref_store_hash_entry entry = new ref_store_hash_entry();
		Object generatedName = ((entry)).getName();
		do {
			size_t flex_array_len_ = (.strlen(name));
			((entry)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, ((name)), flex_array_len_);
		} while (0);
		hashmap_entry generatedEnt = entry.getEnt();
		generatedEnt.hashmap_entry_init(ModernizedCProgram.strhash(name));
		entry.setRefs(refs);
		return entry;
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public ref_store getRefs() {
		return refs;
	}
	public void setRefs(ref_store newRefs) {
		refs = newRefs;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
