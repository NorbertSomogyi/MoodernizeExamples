package application;

/* Dynamic loading for portability */
public class _DYN_CONSOLE_SCREEN_BUFFER_INFOEX {
	private Object cbSize;
	private _COORD dwSize;
	private _COORD dwCursorPosition;
	private Object wAttributes;
	private _SMALL_RECT srWindow;
	private _COORD dwMaximumWindowSize;
	private Object wPopupAttributes;
	private Object bFullscreenSupported;
	private Object ColorTable;
	
	public _DYN_CONSOLE_SCREEN_BUFFER_INFOEX(Object cbSize, _COORD dwSize, _COORD dwCursorPosition, Object wAttributes, _SMALL_RECT srWindow, _COORD dwMaximumWindowSize, Object wPopupAttributes, Object bFullscreenSupported, Object ColorTable) {
		setCbSize(cbSize);
		setDwSize(dwSize);
		setDwCursorPosition(dwCursorPosition);
		setWAttributes(wAttributes);
		setSrWindow(srWindow);
		setDwMaximumWindowSize(dwMaximumWindowSize);
		setWPopupAttributes(wPopupAttributes);
		setBFullscreenSupported(bFullscreenSupported);
		setColorTable(ColorTable);
	}
	public _DYN_CONSOLE_SCREEN_BUFFER_INFOEX() {
	}
	
	public Object getCbSize() {
		return cbSize;
	}
	public void setCbSize(Object newCbSize) {
		cbSize = newCbSize;
	}
	public _COORD getDwSize() {
		return dwSize;
	}
	public void setDwSize(_COORD newDwSize) {
		dwSize = newDwSize;
	}
	public _COORD getDwCursorPosition() {
		return dwCursorPosition;
	}
	public void setDwCursorPosition(_COORD newDwCursorPosition) {
		dwCursorPosition = newDwCursorPosition;
	}
	public Object getWAttributes() {
		return wAttributes;
	}
	public void setWAttributes(Object newWAttributes) {
		wAttributes = newWAttributes;
	}
	public _SMALL_RECT getSrWindow() {
		return srWindow;
	}
	public void setSrWindow(_SMALL_RECT newSrWindow) {
		srWindow = newSrWindow;
	}
	public _COORD getDwMaximumWindowSize() {
		return dwMaximumWindowSize;
	}
	public void setDwMaximumWindowSize(_COORD newDwMaximumWindowSize) {
		dwMaximumWindowSize = newDwMaximumWindowSize;
	}
	public Object getWPopupAttributes() {
		return wPopupAttributes;
	}
	public void setWPopupAttributes(Object newWPopupAttributes) {
		wPopupAttributes = newWPopupAttributes;
	}
	public Object getBFullscreenSupported() {
		return bFullscreenSupported;
	}
	public void setBFullscreenSupported(Object newBFullscreenSupported) {
		bFullscreenSupported = newBFullscreenSupported;
	}
	public Object getColorTable() {
		return ColorTable;
	}
	public void setColorTable(Object newColorTable) {
		ColorTable = newColorTable;
	}
}
