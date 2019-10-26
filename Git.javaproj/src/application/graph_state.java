package application;

public enum graph_state {
	GRAPH_PADDING, 
	GRAPH_SKIP, 
	GRAPH_PRE_COMMIT, 
	GRAPH_COMMIT, 
	GRAPH_POST_MERGE, 
	GRAPH_COLLAPSING
}
/*
	 * The output state for the previous line of output.
	 * This is primarily used to determine how the first merge line
	 * should appear, based on the last line of the previous commit.
	 */
/*
	 * The index of the column that refers to this commit.
	 *
	 * If none of the incoming columns refer to this commit,
	 * this will be equal to num_columns.
	 */
