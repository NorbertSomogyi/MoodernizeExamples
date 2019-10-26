package application;

public class path_entry {
	private hashmap_entry entry;
	private Object path;
	
	public path_entry(hashmap_entry entry, Object path) {
		setEntry(entry);
		setPath(path);
	}
	public path_entry() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}
