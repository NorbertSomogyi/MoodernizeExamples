package application;

public class Item {
	private Object hFont;
	private Object pTextFormat;
	private Object fontWeight;
	private Object fontStyle;
	
	public Item(Object hFont, Object pTextFormat, Object fontWeight, Object fontStyle) {
		setHFont(hFont);
		setPTextFormat(pTextFormat);
		setFontWeight(fontWeight);
		setFontStyle(fontStyle);
	}
	public Item() {
	}
	
	public Object getHFont() {
		return hFont;
	}
	public void setHFont(Object newHFont) {
		hFont = newHFont;
	}
	public Object getPTextFormat() {
		return pTextFormat;
	}
	public void setPTextFormat(Object newPTextFormat) {
		pTextFormat = newPTextFormat;
	}
	public Object getFontWeight() {
		return fontWeight;
	}
	public void setFontWeight(Object newFontWeight) {
		fontWeight = newFontWeight;
	}
	public Object getFontStyle() {
		return fontStyle;
	}
	public void setFontStyle(Object newFontStyle) {
		fontStyle = newFontStyle;
	}
}
