package application;

public class ext4_encryption_key {
	private Object mode;
	private Object raw;
	private Object size;
	
	public ext4_encryption_key(Object mode, Object raw, Object size) {
		setMode(mode);
		setRaw(raw);
		setSize(size);
	}
	public ext4_encryption_key() {
	}
	
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
	public Object getRaw() {
		return raw;
	}
	public void setRaw(Object newRaw) {
		raw = newRaw;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
