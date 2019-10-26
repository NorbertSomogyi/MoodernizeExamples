package application;

// Private data block
public class _NT_PRIVATE_DATA {
	private int magic;
	private Object handle;
	private int flags;
	private Byte buffer;
	private Object buffer_block_number;
	private Object buffer_size;
	private Object read_only;
	private Object written;
	private Object offset;
	private Object size;
	
	public _NT_PRIVATE_DATA(int magic, Object handle, int flags, Byte buffer, Object buffer_block_number, Object buffer_size, Object read_only, Object written, Object offset, Object size) {
		setMagic(magic);
		setHandle(handle);
		setFlags(flags);
		setBuffer(buffer);
		setBuffer_block_number(buffer_block_number);
		setBuffer_size(buffer_size);
		setRead_only(read_only);
		setWritten(written);
		setOffset(offset);
		setSize(size);
	}
	public _NT_PRIVATE_DATA() {
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getBuffer_block_number() {
		return buffer_block_number;
	}
	public void setBuffer_block_number(Object newBuffer_block_number) {
		buffer_block_number = newBuffer_block_number;
	}
	public Object getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(Object newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public Object getRead_only() {
		return read_only;
	}
	public void setRead_only(Object newRead_only) {
		read_only = newRead_only;
	}
	public Object getWritten() {
		return written;
	}
	public void setWritten(Object newWritten) {
		written = newWritten;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
