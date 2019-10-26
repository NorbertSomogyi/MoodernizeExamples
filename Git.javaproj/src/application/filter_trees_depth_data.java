package application;

public class filter_trees_depth_data {
	private oidmap seen_at_depth;
	private long exclude_depth;
	private long current_depth;
	
	public filter_trees_depth_data(oidmap seen_at_depth, long exclude_depth, long current_depth) {
		setSeen_at_depth(seen_at_depth);
		setExclude_depth(exclude_depth);
		setCurrent_depth(current_depth);
	}
	public filter_trees_depth_data() {
	}
	
	public oidmap getSeen_at_depth() {
		return seen_at_depth;
	}
	public void setSeen_at_depth(oidmap newSeen_at_depth) {
		seen_at_depth = newSeen_at_depth;
	}
	public long getExclude_depth() {
		return exclude_depth;
	}
	public void setExclude_depth(long newExclude_depth) {
		exclude_depth = newExclude_depth;
	}
	public long getCurrent_depth() {
		return current_depth;
	}
	public void setCurrent_depth(long newCurrent_depth) {
		current_depth = newCurrent_depth;
	}
}
/*
	 * Maps trees to the minimum depth at which they were seen. It is not
	 * necessary to re-traverse a tree at deeper or equal depths than it has
	 * already been traversed.
	 *
	 * We can't use LOFR_MARK_SEEN for tree objects since this will prevent
	 * it from being traversed at shallower depths.
	 */
