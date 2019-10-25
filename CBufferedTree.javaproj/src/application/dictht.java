package application;

/* This is our hash table structure. Every dictionary has two of this as we
 * implement incremental rehashing, for the old to the new table. */
public class dictht {
	private Object table;
	private long size;
	private long sizemask;
	private long used;
	
	public dictht(Object table, long size, long sizemask, long used) {
		setTable(table);
		setSize(size);
		setSizemask(sizemask);
		setUsed(used);
	}
	public dictht() {
	}
	
	public Object getTable() {
		return table;
	}
	public void setTable(Object newTable) {
		table = newTable;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public long getSizemask() {
		return sizemask;
	}
	public void setSizemask(long newSizemask) {
		sizemask = newSizemask;
	}
	public long getUsed() {
		return used;
	}
	public void setUsed(long newUsed) {
		used = newUsed;
	}
}
