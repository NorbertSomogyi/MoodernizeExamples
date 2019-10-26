package application;

public class possible_tag {
	private commit_name name;
	private int depth;
	private int found_order;
	private int flag_within;
	
	public possible_tag(commit_name name, int depth, int found_order, int flag_within) {
		setName(name);
		setDepth(depth);
		setFound_order(found_order);
		setFlag_within(flag_within);
	}
	public possible_tag() {
	}
	
	public commit_name getName() {
		return name;
	}
	public void setName(commit_name newName) {
		name = newName;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public int getFound_order() {
		return found_order;
	}
	public void setFound_order(int newFound_order) {
		found_order = newFound_order;
	}
	public int getFlag_within() {
		return flag_within;
	}
	public void setFlag_within(int newFlag_within) {
		flag_within = newFlag_within;
	}
}
