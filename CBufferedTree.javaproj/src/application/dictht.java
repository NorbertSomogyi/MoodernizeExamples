package application;

/* This is our hash table structure. Every dictionary has two of this as we
 * implement incremental rehashing, for the old to the new table. */
public class dictht {
	private dictEntry[][] table;
	private long size;
	private long sizemask;
	private long used;
	
	public dictht(dictEntry[][] table, long size, long sizemask, long used) {
		setTable(table);
		setSize(size);
		setSizemask(sizemask);
		setUsed(used);
	}
	public dictht() {
	}
	
	/* Reset a hash table already initialized with ht_init().
	 * NOTE: This function should only be called by ht_destroy(). */
	public void _dictReset() {
		this.setTable(((Object)0));
		this.setSize(0);
		this.setSizemask(0);
		this.setUsed(0);
	}
	public dictEntry[][] getTable() {
		return table;
	}
	public void setTable(dictEntry[][] newTable) {
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
