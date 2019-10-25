package application;

public class dictIterator {
	private Object d;
	private int table;
	private int index;
	private int safe;
	private Object entry;
	private Object nextEntry;
	
	public dictIterator(Object d, int table, int index, int safe, Object entry, Object nextEntry) {
		setD(d);
		setTable(table);
		setIndex(index);
		setSafe(safe);
		setEntry(entry);
		setNextEntry(nextEntry);
	}
	public dictIterator() {
	}
	
	public Object getD() {
		return d;
	}
	public void setD(Object newD) {
		d = newD;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int newTable) {
		table = newTable;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int newSafe) {
		safe = newSafe;
	}
	public Object getEntry() {
		return entry;
	}
	public void setEntry(Object newEntry) {
		entry = newEntry;
	}
	public Object getNextEntry() {
		return nextEntry;
	}
	public void setNextEntry(Object newNextEntry) {
		nextEntry = newNextEntry;
	}
}
