package application;

public class brain_server_attack_long {
	private Object offset;
	private Object length;
	
	public brain_server_attack_long(Object offset, Object length) {
		setOffset(offset);
		setLength(length);
	}
	public brain_server_attack_long() {
	}
	
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
}
