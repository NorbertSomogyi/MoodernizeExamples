package application;

public class nsprintf {
	private Object buffer;
	private Object length;
	private Object max;
	
	public nsprintf(Object buffer, Object length, Object max) {
		setBuffer(buffer);
		setLength(length);
		setMax(max);
	}
	public nsprintf() {
	}
	
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
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
