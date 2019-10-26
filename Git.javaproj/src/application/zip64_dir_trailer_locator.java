package application;

public class zip64_dir_trailer_locator {
	private Object magic;
	private Object disk;
	private Object offset;
	private Object number_of_disks;
	private Object _end;
	
	public zip64_dir_trailer_locator(Object magic, Object disk, Object offset, Object number_of_disks, Object _end) {
		setMagic(magic);
		setDisk(disk);
		setOffset(offset);
		setNumber_of_disks(number_of_disks);
		set_end(_end);
	}
	public zip64_dir_trailer_locator() {
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
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getNumber_of_disks() {
		return number_of_disks;
	}
	public void setNumber_of_disks(Object newNumber_of_disks) {
		number_of_disks = newNumber_of_disks;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
