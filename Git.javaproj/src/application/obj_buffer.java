package application;

public class obj_buffer {
	private Byte buffer;
	private long size;
	
	public obj_buffer(Byte buffer, long size) {
		setBuffer(buffer);
		setSize(size);
	}
	public obj_buffer() {
	}
	
	public obj_buffer lookup_object_buffer(object base) {
		return ModernizedCProgram.obj_decorate.lookup_decoration(base);
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}
