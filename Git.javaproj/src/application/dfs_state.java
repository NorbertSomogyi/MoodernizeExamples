package application;

/*
 * State flags for depth-first search used for analyzing delta cycles.
 *
 * The depth is measured in delta-links to the base (so if A is a delta
 * against B, then A has a depth of 1, and B a depth of 0).
 */
public enum dfs_state {
	DFS_NONE, 
	DFS_ACTIVE, 
	DFS_DONE, 
	DFS_NUM_STATES
}
