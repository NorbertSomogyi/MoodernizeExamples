package application;

public class unpacked_index_entry {
	private index_entry entry;
	private unpacked_index_entry next;
	
	public unpacked_index_entry(index_entry entry, unpacked_index_entry next) {
		setEntry(entry);
		setNext(next);
	}
	public unpacked_index_entry() {
	}
	
	public index_entry getEntry() {
		return entry;
	}
	public void setEntry(index_entry newEntry) {
		entry = newEntry;
	}
	public unpacked_index_entry getNext() {
		return next;
	}
	public void setNext(unpacked_index_entry newNext) {
		next = newNext;
	}
}
