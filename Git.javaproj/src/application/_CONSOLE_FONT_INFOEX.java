package application;

public class _CONSOLE_FONT_INFOEX {
	private Object cbSize;
	private Object nFont;
	private _COORD dwFontSize;
	private Object FontFamily;
	private Object FontWeight;
	private Object FaceName;
	
	public _CONSOLE_FONT_INFOEX(Object cbSize, Object nFont, _COORD dwFontSize, Object FontFamily, Object FontWeight, Object FaceName) {
		setCbSize(cbSize);
		setNFont(nFont);
		setDwFontSize(dwFontSize);
		setFontFamily(FontFamily);
		setFontWeight(FontWeight);
		setFaceName(FaceName);
	}
	public _CONSOLE_FONT_INFOEX() {
	}
	
	public Object getCbSize() {
		return cbSize;
	}
	public void setCbSize(Object newCbSize) {
		cbSize = newCbSize;
	}
	public Object getNFont() {
		return nFont;
	}
	public void setNFont(Object newNFont) {
		nFont = newNFont;
	}
	public _COORD getDwFontSize() {
		return dwFontSize;
	}
	public void setDwFontSize(_COORD newDwFontSize) {
		dwFontSize = newDwFontSize;
	}
	public Object getFontFamily() {
		return FontFamily;
	}
	public void setFontFamily(Object newFontFamily) {
		FontFamily = newFontFamily;
	}
	public Object getFontWeight() {
		return FontWeight;
	}
	public void setFontWeight(Object newFontWeight) {
		FontWeight = newFontWeight;
	}
	public Object getFaceName() {
		return FaceName;
	}
	public void setFaceName(Object newFaceName) {
		FaceName = newFaceName;
	}
}
