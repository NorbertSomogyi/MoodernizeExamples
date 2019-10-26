package application;

/* always, never or auto */
/* --column is given from cmdline */
/* Shrink columns when possible,
				      making space for more columns */
/* must be zero */
/* Fill columns before rows */
/* Fill rows before columns */
/* one column */
public class column_options {
	private int width;
	private int padding;
	private Object indent;
	private Object nl;
	
	public column_options(int width, int padding, Object indent, Object nl) {
		setWidth(width);
		setPadding(padding);
		setIndent(indent);
		setNl(nl);
	}
	public column_options() {
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getPadding() {
		return padding;
	}
	public void setPadding(int newPadding) {
		padding = newPadding;
	}
	public Object getIndent() {
		return indent;
	}
	public void setIndent(Object newIndent) {
		indent = newIndent;
	}
	public Object getNl() {
		return nl;
	}
	public void setNl(Object newNl) {
		nl = newNl;
	}
}
