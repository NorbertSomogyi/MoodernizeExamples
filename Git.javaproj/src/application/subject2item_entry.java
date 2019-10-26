package application;

public class subject2item_entry {
	private hashmap_entry entry;
	private int i;
	private Object subject;
	
	public subject2item_entry(hashmap_entry entry, int i, Object subject) {
		setEntry(entry);
		setI(i);
		setSubject(subject);
	}
	public subject2item_entry() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public int getI() {
		return i;
	}
	public void setI(int newI) {
		i = newI;
	}
	public Object getSubject() {
		return subject;
	}
	public void setSubject(Object newSubject) {
		subject = newSubject;
	}
}
