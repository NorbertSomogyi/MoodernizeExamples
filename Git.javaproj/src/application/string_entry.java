package application;

public class string_entry {
	private oidmap_entry entry;
	private Object string;
	
	public string_entry(oidmap_entry entry, Object string) {
		setEntry(entry);
		setString(string);
	}
	public string_entry() {
	}
	
	public oidmap_entry getEntry() {
		return entry;
	}
	public void setEntry(oidmap_entry newEntry) {
		entry = newEntry;
	}
	public Object getString() {
		return string;
	}
	public void setString(Object newString) {
		string = newString;
	}
}
