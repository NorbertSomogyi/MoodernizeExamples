package application;

public class link_speed {
	private Object[] timer;
	private Object[] bytes;
	private int pos;
	
	public link_speed(Object[] timer, Object[] bytes, int pos) {
		setTimer(timer);
		setBytes(bytes);
		setPos(pos);
	}
	public link_speed() {
	}
	
	public Object[] getTimer() {
		return timer;
	}
	public void setTimer(Object[] newTimer) {
		timer = newTimer;
	}
	public Object[] getBytes() {
		return bytes;
	}
	public void setBytes(Object[] newBytes) {
		bytes = newBytes;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int newPos) {
		pos = newPos;
	}
}
