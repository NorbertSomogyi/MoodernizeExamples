package application;

public class tree_islands_todo {
	private object_entry entry;
	private int depth;
	
	public tree_islands_todo(object_entry entry, int depth) {
		setEntry(entry);
		setDepth(depth);
	}
	public tree_islands_todo() {
	}
	
	public object_entry getEntry() {
		return entry;
	}
	public void setEntry(object_entry newEntry) {
		entry = newEntry;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
}
