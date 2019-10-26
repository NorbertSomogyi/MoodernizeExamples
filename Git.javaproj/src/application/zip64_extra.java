package application;

public class zip64_extra {
	private Object magic;
	private Object extra_size;
	private Object size;
	private Object compressed_size;
	private Object _end;
	
	public zip64_extra(Object magic, Object extra_size, Object size, Object compressed_size, Object _end) {
		setMagic(magic);
		setExtra_size(extra_size);
		setSize(size);
		setCompressed_size(compressed_size);
		set_end(_end);
	}
	public zip64_extra() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getExtra_size() {
		return extra_size;
	}
	public void setExtra_size(Object newExtra_size) {
		extra_size = newExtra_size;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getCompressed_size() {
		return compressed_size;
	}
	public void setCompressed_size(Object newCompressed_size) {
		compressed_size = newCompressed_size;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
