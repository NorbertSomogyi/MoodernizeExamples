package application;

public class align {
	private  position;
	private int width;
	
	public align( position, int width) {
		setPosition(position);
		setWidth(width);
	}
	public align() {
	}
	
	public  getPosition() {
		return position;
	}
	public void setPosition( newPosition) {
		position = newPosition;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
}
