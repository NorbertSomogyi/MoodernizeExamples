package application;

public class zip_dir_trailer {
	private Object magic;
	private Object disk;
	private Object directory_start_disk;
	private Object entries_on_this_disk;
	private Object entries;
	private Object size;
	private Object offset;
	private Object comment_length;
	private Object _end;
	
	public zip_dir_trailer(Object magic, Object disk, Object directory_start_disk, Object entries_on_this_disk, Object entries, Object size, Object offset, Object comment_length, Object _end) {
		setMagic(magic);
		setDisk(disk);
		setDirectory_start_disk(directory_start_disk);
		setEntries_on_this_disk(entries_on_this_disk);
		setEntries(entries);
		setSize(size);
		setOffset(offset);
		setComment_length(comment_length);
		set_end(_end);
	}
	public zip_dir_trailer() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getDisk() {
		return disk;
	}
	public void setDisk(Object newDisk) {
		disk = newDisk;
	}
	public Object getDirectory_start_disk() {
		return directory_start_disk;
	}
	public void setDirectory_start_disk(Object newDirectory_start_disk) {
		directory_start_disk = newDirectory_start_disk;
	}
	public Object getEntries_on_this_disk() {
		return entries_on_this_disk;
	}
	public void setEntries_on_this_disk(Object newEntries_on_this_disk) {
		entries_on_this_disk = newEntries_on_this_disk;
	}
	public Object getEntries() {
		return entries;
	}
	public void setEntries(Object newEntries) {
		entries = newEntries;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getComment_length() {
		return comment_length;
	}
	public void setComment_length(Object newComment_length) {
		comment_length = newComment_length;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
