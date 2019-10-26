package application;

public class color_source {
	private Object color;
	private Object width;
	private Object height;
	private obs_source src;
	
	public color_source(Object color, Object width, Object height, obs_source src) {
		setColor(color);
		setWidth(width);
		setHeight(height);
		setSrc(src);
	}
	public color_source() {
	}
	
	public Object getColor() {
		return color;
	}
	public void setColor(Object newColor) {
		color = newColor;
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
	public obs_source getSrc() {
		return src;
	}
	public void setSrc(obs_source newSrc) {
		src = newSrc;
	}
}
