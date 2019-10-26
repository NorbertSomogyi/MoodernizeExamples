package application;

public class gs_display_mode {
	private Object width;
	private Object height;
	private Object bits;
	private Object freq;
	
	public gs_display_mode(Object width, Object height, Object bits, Object freq) {
		setWidth(width);
		setHeight(height);
		setBits(bits);
		setFreq(freq);
	}
	public gs_display_mode() {
	}
	
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public Object getBits() {
		return bits;
	}
	public void setBits(Object newBits) {
		bits = newBits;
	}
	public Object getFreq() {
		return freq;
	}
	public void setFreq(Object newFreq) {
		freq = newFreq;
	}
}
