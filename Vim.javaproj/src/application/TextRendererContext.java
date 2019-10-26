package application;

public class TextRendererContext {
	private Object color;
	private Object cellWidth;
	private Object offsetX;
	
	public TextRendererContext(Object color, Object cellWidth, Object offsetX) {
		setColor(color);
		setCellWidth(cellWidth);
		setOffsetX(offsetX);
	}
	public TextRendererContext() {
	}
	
	public Object getColor() {
		return color;
	}
	public void setColor(Object newColor) {
		color = newColor;
	}
	public Object getCellWidth() {
		return cellWidth;
	}
	public void setCellWidth(Object newCellWidth) {
		cellWidth = newCellWidth;
	}
	public Object getOffsetX() {
		return offsetX;
	}
	public void setOffsetX(Object newOffsetX) {
		offsetX = newOffsetX;
	}
}
// const fields.
