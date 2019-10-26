package application;

public class _D3DVIEWPORT8 {
	private Object X;
	private Object Y;
	private Object Width;
	private Object Height;
	private double MinZ;
	private double MaxZ;
	
	public _D3DVIEWPORT8(Object X, Object Y, Object Width, Object Height, double MinZ, double MaxZ) {
		setX(X);
		setY(Y);
		setWidth(Width);
		setHeight(Height);
		setMinZ(MinZ);
		setMaxZ(MaxZ);
	}
	public _D3DVIEWPORT8() {
	}
	
	public Object getX() {
		return X;
	}
	public void setX(Object newX) {
		X = newX;
	}
	public Object getY() {
		return Y;
	}
	public void setY(Object newY) {
		Y = newY;
	}
	public Object getWidth() {
		return Width;
	}
	public void setWidth(Object newWidth) {
		Width = newWidth;
	}
	public Object getHeight() {
		return Height;
	}
	public void setHeight(Object newHeight) {
		Height = newHeight;
	}
	public double getMinZ() {
		return MinZ;
	}
	public void setMinZ(double newMinZ) {
		MinZ = newMinZ;
	}
	public double getMaxZ() {
		return MaxZ;
	}
	public void setMaxZ(double newMaxZ) {
		MaxZ = newMaxZ;
	}
}
