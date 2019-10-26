package application;

public class gs_tvertarray {
	private Object width;
	private Object array;
	
	public gs_tvertarray(Object width, Object array) {
		setWidth(width);
		setArray(array);
	}
	public gs_tvertarray() {
	}
	
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getArray() {
		return array;
	}
	public void setArray(Object newArray) {
		array = newArray;
	}
}
