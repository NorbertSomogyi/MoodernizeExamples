package application;

public class patch_id {
	private hashmap_entry ent;
	private object_id patch_id;
	private commit commit;
	
	public patch_id(hashmap_entry ent, object_id patch_id, commit commit) {
		setEnt(ent);
		setPatch_id(patch_id);
		setCommit(commit);
	}
	public patch_id() {
	}
	
	public patch_id has_commit_patch_id(commit commit, patch_ids ids) {
		patch_id patch = new patch_id();
		if (!commit.patch_id_defined()) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(patch, 0, /*Error: sizeof expression not supported yet*/);
		if (ModernizedCProgram.init_patch_id_entry(patch, commit, ids)) {
			return ((Object)0);
		} 
		hashmap generatedPatches = ids.getPatches();
		hashmap_entry generatedEnt = (patch).getEnt();
		hashmap_entry hashmap_entry = new hashmap_entry();
		return ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedPatches, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
	}
	public patch_id add_commit_patch_id(commit commit, patch_ids ids) {
		patch_id key = new patch_id();
		if (!commit.patch_id_defined()) {
			return ((Object)0);
		} 
		key = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		if (ModernizedCProgram.init_patch_id_entry(key, commit, ids)) {
			ModernizedCProgram.free(key);
			return ((Object)0);
		} 
		hashmap generatedPatches = ids.getPatches();
		hashmap_entry generatedEnt = key.getEnt();
		ModernizedCProgram.hashmap_add(generatedPatches, generatedEnt);
		return key;
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public object_id getPatch_id() {
		return patch_id;
	}
	public void setPatch_id(object_id newPatch_id) {
		patch_id = newPatch_id;
	}
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
}
/* PATCH_IDS_H */
