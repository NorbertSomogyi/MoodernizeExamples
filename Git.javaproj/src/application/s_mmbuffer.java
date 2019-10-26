package application;

public class s_mmbuffer {
	private Byte ptr;
	private long size;
	
	public s_mmbuffer(Byte ptr, long size) {
		setPtr(ptr);
		setSize(size);
	}
	public s_mmbuffer() {
	}
	
	public Byte getPtr() {
		return ptr;
	}
	public void setPtr(Byte newPtr) {
		ptr = newPtr;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}
