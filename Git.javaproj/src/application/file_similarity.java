package application;

public class file_similarity {
	private hashmap_entry entry;
	private int index;
	private diff_filespec filespec;
	
	public file_similarity(hashmap_entry entry, int index, diff_filespec filespec) {
		setEntry(entry);
		setIndex(index);
		setFilespec(filespec);
	}
	public file_similarity() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public diff_filespec getFilespec() {
		return filespec;
	}
	public void setFilespec(diff_filespec newFilespec) {
		filespec = newFilespec;
	}
}
