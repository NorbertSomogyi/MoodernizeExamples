package application;

public class notes_cache {
	private notes_tree tree;
	private Byte validity;
	
	public notes_cache(notes_tree tree, Byte validity) {
		setTree(tree);
		setValidity(validity);
	}
	public notes_cache() {
	}
	
	public int notes_cache_write() {
		object_id tree_oid = new object_id();
		object_id commit_oid = new object_id();
		notes_tree generatedTree = this.getTree();
		int generatedInitialized = generatedTree.getInitialized();
		byte generatedUpdate_ref = generatedTree.getUpdate_ref();
		if (!c || !generatedInitialized || !generatedUpdate_ref || !generatedUpdate_ref) {
			return -1;
		} 
		int generatedDirty = generatedTree.getDirty();
		if (!generatedDirty) {
			return 0;
		} 
		if (.write_notes_tree(generatedTree, tree_oid)) {
			return -1;
		} 
		Byte generatedValidity = this.getValidity();
		if (.commit_tree(generatedValidity, .strlen(generatedValidity), tree_oid, ((Object)0), commit_oid, ((Object)0), ((Object)0)) < 0) {
			return -1;
		} 
		if (ModernizedCProgram.update_ref("update notes cache", generatedUpdate_ref, commit_oid, ((Object)0), 0, action_on_err.UPDATE_REFS_QUIET_ON_ERR) < 0) {
			return -1;
		} 
		return 0;
	}
	public notes_tree getTree() {
		return tree;
	}
	public void setTree(notes_tree newTree) {
		tree = newTree;
	}
	public Byte getValidity() {
		return validity;
	}
	public void setValidity(Byte newValidity) {
		validity = newValidity;
	}
}
