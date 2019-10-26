package application;

public class column {
	private commit commit;
	private int color;
	
	public column(commit commit, int color) {
		setCommit(commit);
		setColor(color);
	}
	public column() {
	}
	
	public column find_new_column_by_commit(git_graph graph, commit commit) {
		int i;
		int generatedNum_new_columns = graph.getNum_new_columns();
		column generatedNew_columns = graph.getNew_columns();
		for (i = 0; i < generatedNum_new_columns; i++) {
			if (generatedNew_columns[i].getCommit() == commit) {
				return generatedNew_columns[i];
			} 
		}
		return ((Object)0);
	}
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int newColor) {
		color = newColor;
	}
}
/*
	 * The parent commit of this column.
	 */
/*
	 * The new column state after we output the current commit.
	 * Only valid when state is GRAPH_COLLAPSING.
	 */
/*
	 * An array that tracks the current state of each
	 * character in the output line during state GRAPH_COLLAPSING.
	 * Each entry is -1 if this character is empty, or a non-negative
	 * integer if the character contains a branch line.  The value of
	 * the integer indicates the target position for this branch line.
	 * (I.e., this array maps the current column positions to their
	 * desired positions.)
	 *
	 * The maximum capacity of this array is always
	 * sizeof(int) * 2 * column_capacity.
	 */
