package application;

public class commit_name {
	private hashmap_entry entry;
	private object_id peeled;
	private tag tag;
	private int prio;
	private int name_checked;
	private object_id oid;
	private Byte path;
	
	public commit_name(hashmap_entry entry, object_id peeled, tag tag, int prio, int name_checked, object_id oid, Byte path) {
		setEntry(entry);
		setPeeled(peeled);
		setTag(tag);
		setPrio(prio);
		setName_checked(name_checked);
		setOid(oid);
		setPath(path);
	}
	public commit_name() {
	}
	
	public commit_name commit_names_at_peek(commit_names s, Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = s.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = s.getSlab_count();
		commit_name[][][] generatedSlab = s.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			s.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = s.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size, /*Error: sizeof expression not supported yet*/ * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public commit_name commit_names_at(commit_names s, Object c) {
		commit_name commit_name = new commit_name();
		return commit_name.commit_names_at_peek(s, c, 1);
	}
	public commit_name commit_names_peek(commit_names s, Object c) {
		commit_name commit_name = new commit_name();
		return commit_name.commit_names_at_peek(s, c, 0);
	}
	public commit_name find_commit_name(Object peeled) {
		hashmap_entry hashmap_entry = new hashmap_entry();
		return (commit_name)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(ModernizedCProgram.names, ModernizedCProgram.oidhash(peeled), peeled), ((size_t)((commit_name)0).getEntry()));
	}
	public commit_name commit_name_slab_at_peek(commit_name_slab s, Object c, int add_if_missing) {
		int nth_slab;
		int nth_slot;
		int generatedSlab_size = s.getSlab_size();
		nth_slab = c.getIndex() / generatedSlab_size;
		nth_slot = c.getIndex() % generatedSlab_size;
		int generatedSlab_count = s.getSlab_count();
		commit_name[][][] generatedSlab = s.getSlab();
		if (generatedSlab_count <= nth_slab) {
			int i;
			if (!add_if_missing) {
				return ((Object)0);
			} 
			(generatedSlab) = ModernizedCProgram.xrealloc((generatedSlab), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nth_slab + 1)));
			for (i = generatedSlab_count; i <= nth_slab; i++) {
				generatedSlab[i] = ((Object)0);
			}
			s.setSlab_count(nth_slab + 1);
		} 
		int generatedStride = s.getStride();
		if (!generatedSlab[nth_slab]) {
			if (!add_if_missing) {
				return ((Object)0);
			} 
			generatedSlab[nth_slab] = ModernizedCProgram.xcalloc(generatedSlab_size, /*Error: sizeof expression not supported yet*/ * generatedStride);
		} 
		return generatedSlab[nth_slab][nth_slot * generatedStride];
	}
	public commit_name commit_name_slab_at(commit_name_slab s, Object c) {
		commit_name commit_name = new commit_name();
		return commit_name.commit_name_slab_at_peek(s, c, 1);
	}
	public commit_name commit_name_slab_peek(commit_name_slab s, Object c) {
		commit_name commit_name = new commit_name();
		return commit_name.commit_name_slab_at_peek(s, c, 0);
	}
	public commit_name commit_to_name(commit commit) {
		commit_name commit_name = new commit_name();
		return commit_name.commit_name_slab_at(ModernizedCProgram.name_slab, commit);
	}
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public object_id getPeeled() {
		return peeled;
	}
	public void setPeeled(object_id newPeeled) {
		peeled = newPeeled;
	}
	public tag getTag() {
		return tag;
	}
	public void setTag(tag newTag) {
		tag = newTag;
	}
	public int getPrio() {
		return prio;
	}
	public void setPrio(int newPrio) {
		prio = newPrio;
	}
	public int getName_checked() {
		return name_checked;
	}
	public void setName_checked(int newName_checked) {
		name_checked = newName_checked;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
}
