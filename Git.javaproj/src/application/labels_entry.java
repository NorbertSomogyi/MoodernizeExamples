package application;

public class labels_entry {
	private hashmap_entry entry;
	private Object label;
	
	public labels_entry(hashmap_entry entry, Object label) {
		setEntry(entry);
		setLabel(label);
	}
	public labels_entry() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public Object getLabel() {
		return label;
	}
	public void setLabel(Object newLabel) {
		label = newLabel;
	}
}
