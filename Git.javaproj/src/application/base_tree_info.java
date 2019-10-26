package application;

public class base_tree_info {
	private object_id base_commit;
	private int nr_patch_id;
	private int alloc_patch_id;
	private object_id patch_id;
	
	public base_tree_info(object_id base_commit, int nr_patch_id, int alloc_patch_id, object_id patch_id) {
		setBase_commit(base_commit);
		setNr_patch_id(nr_patch_id);
		setAlloc_patch_id(alloc_patch_id);
		setPatch_id(patch_id);
	}
	public base_tree_info() {
	}
	
	public object_id getBase_commit() {
		return base_commit;
	}
	public void setBase_commit(object_id newBase_commit) {
		base_commit = newBase_commit;
	}
	public int getNr_patch_id() {
		return nr_patch_id;
	}
	public void setNr_patch_id(int newNr_patch_id) {
		nr_patch_id = newNr_patch_id;
	}
	public int getAlloc_patch_id() {
		return alloc_patch_id;
	}
	public void setAlloc_patch_id(int newAlloc_patch_id) {
		alloc_patch_id = newAlloc_patch_id;
	}
	public object_id getPatch_id() {
		return patch_id;
	}
	public void setPatch_id(object_id newPatch_id) {
		patch_id = newPatch_id;
	}
}
