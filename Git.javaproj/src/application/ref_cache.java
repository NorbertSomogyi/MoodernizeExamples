package application;

/* The ref_cache containing this entry: */
public class ref_cache {
	private ref_entry root;
	private ref_store ref_store;
	private Object fill_ref_dir;
	
	public ref_cache(ref_entry root, ref_store ref_store, Object fill_ref_dir) {
		setRoot(root);
		setRef_store(ref_store);
		setFill_ref_dir(fill_ref_dir);
	}
	public ref_cache() {
	}
	
	public ref_cache get_loose_ref_cache(files_ref_store refs) {
		ref_cache generatedLoose = refs.getLoose();
		ref_store generatedBase = refs.getBase();
		ref_cache ref_cache = new ref_cache();
		ref_entry generatedRoot = generatedLoose.getRoot();
		byte generatedFlag = generatedRoot.getFlag();
		ref_dir ref_dir = new ref_dir();
		ref_entry ref_entry = new ref_entry();
		if (!generatedLoose) {
			refs.setLoose(ref_cache.create_ref_cache(generatedBase, loose_fill_ref_dir));
			generatedFlag &=  ~/* We're going to fill the top level ourselves: */-1024/*
					 * Add an incomplete entry for "refs/" (to be filled
					 * lazily):
					 */;
			ModernizedCProgram.add_entry_to_dir(ref_dir.get_ref_dir(generatedRoot), ref_entry.create_dir_entry(generatedLoose, "refs/", 5, 1));
		} 
		return generatedLoose;
	}
	public ref_cache create_ref_cache(ref_store refs, Object fill_ref_dir) {
		ref_cache ret = ModernizedCProgram.xcalloc(1, );
		ret.setRef_store(refs);
		ret.setFill_ref_dir(fill_ref_dir);
		ref_entry ref_entry = new ref_entry();
		ret.setRoot(ref_entry.create_dir_entry(ret, "", 0, 1));
		return ret;
	}
	public void free_ref_cache() {
		ref_entry generatedRoot = this.getRoot();
		generatedRoot.free_ref_entry();
		ModernizedCProgram.free(cache/*
		 * Clear and free all entries in dir, recursively.
		 */);
	}
	public ref_entry getRoot() {
		return root;
	}
	public void setRoot(ref_entry newRoot) {
		root = newRoot;
	}
	public ref_store getRef_store() {
		return ref_store;
	}
	public void setRef_store(ref_store newRef_store) {
		ref_store = newRef_store;
	}
	public Object getFill_ref_dir() {
		return fill_ref_dir;
	}
	public void setFill_ref_dir(Object newFill_ref_dir) {
		fill_ref_dir = newFill_ref_dir;
	}
}
/*
 * Free the `ref_cache` and all of its associated data.
 */
