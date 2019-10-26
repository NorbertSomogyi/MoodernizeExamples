package application;

public class re_backref_cache_entry {
	private int node;
	private int str_idx;
	private int subexp_from;
	private int subexp_to;
	private byte more;
	private byte unused;
	private int eps_reachable_subexps_map;
	
	public re_backref_cache_entry(int node, int str_idx, int subexp_from, int subexp_to, byte more, byte unused, int eps_reachable_subexps_map) {
		setNode(node);
		setStr_idx(str_idx);
		setSubexp_from(subexp_from);
		setSubexp_to(subexp_to);
		setMore(more);
		setUnused(unused);
		setEps_reachable_subexps_map(eps_reachable_subexps_map);
	}
	public re_backref_cache_entry() {
	}
	
	public int getNode() {
		return node;
	}
	public void setNode(int newNode) {
		node = newNode;
	}
	public int getStr_idx() {
		return str_idx;
	}
	public void setStr_idx(int newStr_idx) {
		str_idx = newStr_idx;
	}
	public int getSubexp_from() {
		return subexp_from;
	}
	public void setSubexp_from(int newSubexp_from) {
		subexp_from = newSubexp_from;
	}
	public int getSubexp_to() {
		return subexp_to;
	}
	public void setSubexp_to(int newSubexp_to) {
		subexp_to = newSubexp_to;
	}
	public byte getMore() {
		return more;
	}
	public void setMore(byte newMore) {
		more = newMore;
	}
	public byte getUnused() {
		return unused;
	}
	public void setUnused(byte newUnused) {
		unused = newUnused;
	}
	public int getEps_reachable_subexps_map() {
		return eps_reachable_subexps_map;
	}
	public void setEps_reachable_subexps_map(int newEps_reachable_subexps_map) {
		eps_reachable_subexps_map = newEps_reachable_subexps_map;
	}
}
