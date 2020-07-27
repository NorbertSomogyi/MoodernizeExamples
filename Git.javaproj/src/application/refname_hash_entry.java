package application;

public class refname_hash_entry {
	private hashmap_entry ent;
	private object_id oid;
	private int ignore;
	private Object refname;
	
	public refname_hash_entry(hashmap_entry ent, object_id oid, int ignore, Object refname) {
		setEnt(ent);
		setOid(oid);
		setIgnore(ignore);
		setRefname(refname);
	}
	public refname_hash_entry() {
	}
	
	public refname_hash_entry refname_hash_add(hashmap map, Object refname, Object oid) {
		refname_hash_entry ent = new refname_hash_entry();
		size_t len = /*Error: Function owner not recognized*/strlen(refname);
		Object generatedRefname = (ent).getRefname();
		do {
			size_t flex_array_len_ = (len);
			(ent) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedRefname, (refname), flex_array_len_);
		} while (0);
		hashmap_entry generatedEnt = ent.getEnt();
		generatedEnt.hashmap_entry_init(ModernizedCProgram.strhash(refname));
		object_id generatedOid = ent.getOid();
		generatedOid.oidcpy(oid);
		ModernizedCProgram.hashmap_add(map, generatedEnt);
		return ent;
	}
	public void clear_item() {
		this.setIgnore(1);
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getIgnore() {
		return ignore;
	}
	public void setIgnore(int newIgnore) {
		ignore = newIgnore;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
}
