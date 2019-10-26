package application;

/* Structures for LockRange */
public class _D3DRANGE {
	private Object Offset;
	private Object Size;
	
	public _D3DRANGE(Object Offset, Object Size) {
		setOffset(Offset);
		setSize(Size);
	}
	public _D3DRANGE() {
	}
	
	public Object getOffset() {
		return Offset;
	}
	public void setOffset(Object newOffset) {
		Offset = newOffset;
	}
	public Object getSize() {
		return Size;
	}
	public void setSize(Object newSize) {
		Size = newSize;
	}
}
