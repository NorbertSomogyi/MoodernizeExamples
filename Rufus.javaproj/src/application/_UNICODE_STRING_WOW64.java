package application;

public class _UNICODE_STRING_WOW64 {
	private Object Length;
	private Object MaximumLength;
	private Object Buffer;
	
	public _UNICODE_STRING_WOW64(Object Length, Object MaximumLength, Object Buffer) {
		setLength(Length);
		setMaximumLength(MaximumLength);
		setBuffer(Buffer);
	}
	public _UNICODE_STRING_WOW64() {
	}
	
	public Object getLength() {
		return Length;
	}
	public void setLength(Object newLength) {
		Length = newLength;
	}
	public Object getMaximumLength() {
		return MaximumLength;
	}
	public void setMaximumLength(Object newMaximumLength) {
		MaximumLength = newMaximumLength;
	}
	public Object getBuffer() {
		return Buffer;
	}
	public void setBuffer(Object newBuffer) {
		Buffer = newBuffer;
	}
}
