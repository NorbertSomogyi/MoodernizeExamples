package application;

public class zip_local_header {
	private Object magic;
	private Object version;
	private Object flags;
	private Object compression_method;
	private Object mtime;
	private Object mdate;
	private Object crc32;
	private Object compressed_size;
	private Object size;
	private Object filename_length;
	private Object extra_length;
	private Object _end;
	
	public zip_local_header(Object magic, Object version, Object flags, Object compression_method, Object mtime, Object mdate, Object crc32, Object compressed_size, Object size, Object filename_length, Object extra_length, Object _end) {
		setMagic(magic);
		setVersion(version);
		setFlags(flags);
		setCompression_method(compression_method);
		setMtime(mtime);
		setMdate(mdate);
		setCrc32(crc32);
		setCompressed_size(compressed_size);
		setSize(size);
		setFilename_length(filename_length);
		setExtra_length(extra_length);
		set_end(_end);
	}
	public zip_local_header() {
	}
	
	public void set_zip_header_data_desc(long size, long compressed_size, long crc) {
		Object generatedCrc32 = this.getCrc32();
		ModernizedCProgram.copy_le32(generatedCrc32, crc);
		Object generatedCompressed_size = this.getCompressed_size();
		ModernizedCProgram.copy_le32(generatedCompressed_size, compressed_size);
		Object generatedSize = this.getSize();
		ModernizedCProgram.copy_le32(generatedSize, size);
	}
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getCompression_method() {
		return compression_method;
	}
	public void setCompression_method(Object newCompression_method) {
		compression_method = newCompression_method;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object getMdate() {
		return mdate;
	}
	public void setMdate(Object newMdate) {
		mdate = newMdate;
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
	public Object getFilename_length() {
		return filename_length;
	}
	public void setFilename_length(Object newFilename_length) {
		filename_length = newFilename_length;
	}
	public Object getExtra_length() {
		return extra_length;
	}
	public void setExtra_length(Object newExtra_length) {
		extra_length = newExtra_length;
	}
	public Object get_end() {
		return _end;
	}
	public void set_end(Object new_end) {
		_end = new_end;
	}
}
