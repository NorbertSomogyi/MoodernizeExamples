package application;

public class obs_hotkey_name_map_node {
	private Object is_leaf;
	private int val;
	
	public obs_hotkey_name_map_node(Object is_leaf, int val) {
		setIs_leaf(is_leaf);
		setVal(val);
	}
	public obs_hotkey_name_map_node() {
	}
	
	public obs_hotkey_name_map_node new_node() {
		return ModernizedCProgram.bzalloc();
	}
	public obs_hotkey_name_map_node new_leaf() {
		obs_hotkey_name_map_t name_map = ModernizedCProgram.obs.getHotkeys().getName_map();
		obs_hotkey_name_map_node generatedLeaves = name_map.getLeaves();
		Object generatedNext_leaf = name_map.getNext_leaf();
		obs_hotkey_name_map_node_t node = generatedLeaves[generatedNext_leaf];
		generatedNext_leaf += 1;
		node.setIs_leaf(true);
		return node;
	}
	public void show_node(int in) {
		Object generatedIs_leaf = this.getIs_leaf();
		int generatedVal = this.getVal();
		if (generatedIs_leaf) {
			.printf(": % 3d\n", generatedVal);
			return ;
		} 
		.printf("\n");
		for (int i = 0;
		 i < in; i += 2) {
			.printf("| ");
		}
		Object generatedChildren = this.getChildren();
		.printf("%lu:\n", (long)generatedChildren.getNum());
		obs_hotkey_name_map_node generatedNode = e.getNode();
		for (size_t i = 0;
		 i < generatedChildren.getNum(); i++) {
			for (int i = 0;
			 i < in; i += 2) {
				.printf("| ");
			}
			.printf("\\ ");
			obs_hotkey_name_map_edge_t e = generatedChildren.getArray()[i];
			.printf("%s", e.get_prefix());
			generatedNode.show_node(in + 2);
		}
	}
	public void free_node(Object release) {
		Object generatedIs_leaf = this.getIs_leaf();
		Object generatedChildren = this.getChildren();
		if (!generatedIs_leaf) {
			for (size_t i = 0;
			 i < generatedChildren.getNum(); i++) {
				generatedChildren.getArray()[i].free_edge();
			}
			.da_free(generatedChildren);
		} 
		if (release && !generatedIs_leaf) {
			ModernizedCProgram.bfree(node);
		} 
	}
	public Object getIs_leaf() {
		return is_leaf;
	}
	public void setIs_leaf(Object newIs_leaf) {
		is_leaf = newIs_leaf;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int newVal) {
		val = newVal;
	}
}
