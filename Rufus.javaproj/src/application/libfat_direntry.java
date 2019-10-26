package application;

public class libfat_direntry {
	private Object sector;
	private int offset;
	private Object entry;
	
	public libfat_direntry(Object sector, int offset, Object entry) {
		setSector(sector);
		setOffset(offset);
		setEntry(entry);
	}
	public libfat_direntry() {
	}
	
	public Object getSector() {
		return sector;
	}
	public void setSector(Object newSector) {
		sector = newSector;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public Object getEntry() {
		return entry;
	}
	public void setEntry(Object newEntry) {
		entry = newEntry;
	}
}
/*
 * Return all the files and directory items from a FAT directory.
 * Initial call must set dp->offset to negative and dp->cluster to the cluster
 * that contains the directory data. After that each subsequent call must use
 * the same dp.
 * Return value is the cluster for the corresponding item or negative on error.
 */
