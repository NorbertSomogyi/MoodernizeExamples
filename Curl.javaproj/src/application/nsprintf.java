package application;

public class nsprintf {
	private byte buffer;
	private Object length;
	private Object max;
	
	public nsprintf(byte buffer, Object length, Object max) {
		setBuffer(buffer);
		setLength(length);
		setMax(max);
	}
	public nsprintf() {
	}
	
	public byte getBuffer() {
		return buffer;
	}
	public void setBuffer(byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public Object getMax() {
		return max;
	}
	public void setMax(Object newMax) {
		max = newMax;
	}
}
