package application;

public class fetch_config {
	private Integer max_children;
	private Integer recurse_submodules;
	
	public fetch_config(Integer max_children, Integer recurse_submodules) {
		setMax_children(max_children);
		setRecurse_submodules(recurse_submodules);
	}
	public fetch_config() {
	}
	
	public Integer getMax_children() {
		return max_children;
	}
	public void setMax_children(Integer newMax_children) {
		max_children = newMax_children;
	}
	public Integer getRecurse_submodules() {
		return recurse_submodules;
	}
	public void setRecurse_submodules(Integer newRecurse_submodules) {
		recurse_submodules = newRecurse_submodules;
	}
}
