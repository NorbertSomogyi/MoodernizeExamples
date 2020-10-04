package application;

public class chacha20 {
	private Object[] iv;
	private Object[] plain;
	private Object[] position;
	private Object offset;
	
	public chacha20(Object[] iv, Object[] plain, Object[] position, Object offset) {
		setIv(iv);
		setPlain(plain);
		setPosition(position);
		setOffset(offset);
	}
	public chacha20() {
	}
	
	public Object[] getIv() {
		return iv;
	}
	public void setIv(Object[] newIv) {
		iv = newIv;
	}
	public Object[] getPlain() {
		return plain;
	}
	public void setPlain(Object[] newPlain) {
		plain = newPlain;
	}
	public Object[] getPosition() {
		return position;
	}
	public void setPosition(Object[] newPosition) {
		position = newPosition;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
}
