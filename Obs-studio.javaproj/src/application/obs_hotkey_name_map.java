package application;

public class obs_hotkey_name_map {
	private obs_hotkey_name_map_node root;
	private obs_hotkey_name_map_node[] leaves;
	private Object num_leaves;
	private Object next_leaf;
	
	public obs_hotkey_name_map(obs_hotkey_name_map_node root, obs_hotkey_name_map_node[] leaves, Object num_leaves, Object next_leaf) {
		setRoot(root);
		setLeaves(leaves);
		setNum_leaves(num_leaves);
		setNext_leaf(next_leaf);
	}
	public obs_hotkey_name_map() {
	}
	
	public void obs_hotkey_name_map_insert(Object key, int v) {
		if (!trie || !key) {
			return /*Error: Unsupported expression*/;
		} 
		obs_hotkey_name_map_node generatedRoot = this.getRoot();
		ModernizedCProgram.insert(((Object)0), generatedRoot, key, /*Error: Function owner not recognized*/strlen(key), v);
	}
	public Object obs_hotkey_name_map_lookup(Object key, Integer v) {
		if (!trie || !key) {
			return false;
		} 
		size_t len = /*Error: Function owner not recognized*/strlen(key);
		obs_hotkey_name_map_node generatedRoot = this.getRoot();
		obs_hotkey_name_map_node_t n = generatedRoot;
		size_t i = 0;
		Object generatedChildren = n.getChildren();
		Object generatedPrefix_len = e.getPrefix_len();
		obs_hotkey_name_map_node generatedNode = e.getNode();
		Object generatedIs_leaf = n.getIs_leaf();
		int generatedVal = generatedNode.getVal();
		for (; i < generatedChildren.getNum(); /*Error: Unsupported expression*/) {
			obs_hotkey_name_map_edge_t e = generatedChildren.getArray()[i];
			switch (e.compare_prefix(key, len)) {
			case obs_hotkey_name_map_edge_compare_result.RES_COMMON_PREFIX:
					return false;
			case obs_hotkey_name_map_edge_compare_result.RES_NO_MATCH:
					i++;
					continue;
			case obs_hotkey_name_map_edge_compare_result.RES_PREFIX_MATCHES:
					key += generatedPrefix_len;
					len -= generatedPrefix_len;
					n = generatedNode;
					i = 0;
					continue;
			case obs_hotkey_name_map_edge_compare_result.RES_MATCHES:
					n = generatedNode;
					if (!generatedIs_leaf) {
						for (size_t j = 0;
						 j < generatedChildren.getNum(); j++) {
							if (generatedPrefix_len) {
								continue;
							} 
							if (v) {
								v = generatedVal;
							} 
							return true;
						}
						return false;
					} 
					if (v) {
						v = generatedVal;
					} 
					return true;
			}
		}
		return false;
	}
	public void trie_print_size() {
		obs_hotkey_name_map_node generatedRoot = this.getRoot();
		generatedRoot.show_node(0);
	}
	public obs_hotkey_name_map_node getRoot() {
		return root;
	}
	public void setRoot(obs_hotkey_name_map_node newRoot) {
		root = newRoot;
	}
	public obs_hotkey_name_map_node[] getLeaves() {
		return leaves;
	}
	public void setLeaves(obs_hotkey_name_map_node[] newLeaves) {
		leaves = newLeaves;
	}
	public Object getNum_leaves() {
		return num_leaves;
	}
	public void setNum_leaves(Object newNum_leaves) {
		num_leaves = newNum_leaves;
	}
	public Object getNext_leaf() {
		return next_leaf;
	}
	public void setNext_leaf(Object newNext_leaf) {
		next_leaf = newNext_leaf;
	}
}
