package application;

public class zip64_data_desc {
	private Object magic;
	private Object crc32;
	private Object compressed_size;
	private Object size;
	private Object _end;
	
	public zip64_data_desc(Object magic, Object crc32, Object compressed_size, Object size, Object _end) {
		setMagic(magic);
		setCrc32(crc32);
		setCompressed_size(compressed_size);
		setSize(size);
		set_end(_end);
	}
	public zip64_data_desc() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getCrc32() {
		return crc32;
	}
	public void setCrc32(Object newCrc32) {
		crc32 = newCrc32;
	}
	public Object getCompressed_size() {
		return compressed_size;
	}
	public void setCompressed_size(Object newCompressed_size) {
		compressed_size = newCompressed_size;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
