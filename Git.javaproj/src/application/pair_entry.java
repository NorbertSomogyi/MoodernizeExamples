package application;

public class pair_entry {
	private hashmap_entry entry;
	private Object left;
	private Object right;
	private Object path;
	
	public pair_entry(hashmap_entry entry, Object left, Object right, Object path) {
		setEntry(entry);
		setLeft(left);
		setRight(right);
		setPath(path);
	}
	public pair_entry() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public Object getLeft() {
		return left;
	}
	public void setLeft(Object newLeft) {
		left = newLeft;
	}
	public Object getRight() {
		return right;
	}
	public void setRight(Object newRight) {
		right = newRight;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}
