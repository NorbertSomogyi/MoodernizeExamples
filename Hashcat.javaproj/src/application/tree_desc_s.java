package application;

/* desc. for literal tree */
/* desc. for distance tree */
/* desc. for bit length tree */
public class tree_desc_s {
	private ct_data_s dyn_tree;
	private int max_code;
	private Object stat_desc;
	
	public tree_desc_s(ct_data_s dyn_tree, int max_code, Object stat_desc) {
		setDyn_tree(dyn_tree);
		setMax_code(max_code);
		setStat_desc(stat_desc);
	}
	public tree_desc_s() {
	}
	
	public ct_data_s getDyn_tree() {
		return dyn_tree;
	}
	public void setDyn_tree(ct_data_s newDyn_tree) {
		dyn_tree = newDyn_tree;
	}
	public int getMax_code() {
		return max_code;
	}
	public void setMax_code(int newMax_code) {
		max_code = newMax_code;
	}
	public Object getStat_desc() {
		return stat_desc;
	}
	public void setStat_desc(Object newStat_desc) {
		stat_desc = newStat_desc;
	}
}
