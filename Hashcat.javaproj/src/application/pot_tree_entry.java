package application;

// there could be multiple entries for each identical hash+salt combination
// (e.g. same hashes, but different user names... we want to print all of them!)
// that is why we use a linked list here
public class pot_tree_entry {
	private pot_hash_node nodes;
	private hashconfig hashconfig;
	
	public pot_tree_entry(pot_hash_node nodes, hashconfig hashconfig) {
		setNodes(nodes);
		setHashconfig(hashconfig);
	}
	public pot_tree_entry() {
	}
	
	// 1. recursively delete the entries with entry->left and entry->right
	// 2. use tdelete () <- this is what we currently use, but this could be slower!
	public void pot_tree_destroy() {
		pot_tree_entry_t entry = tree;
		while (tree != ((Object)0)) {
			entry = (pot_tree_entry_t)tree;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/tdelete(entry, (Object)tree, ModernizedCProgram.sort_pot_tree_by_hash);
		}
	}
	public pot_hash_node getNodes() {
		return nodes;
	}
	public void setNodes(pot_hash_node newNodes) {
		nodes = newNodes;
	}
	public hashconfig getHashconfig() {
		return hashconfig;
	}
	public void setHashconfig(hashconfig newHashconfig) {
		hashconfig = newHashconfig;
	}
}
