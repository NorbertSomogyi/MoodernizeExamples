package application;

/* Display Modes */
public class _D3DDISPLAYMODE {
	private Object Width;
	private Object Height;
	private Object RefreshRate;
	private _D3DFORMAT Format;
	
	public _D3DDISPLAYMODE(Object Width, Object Height, Object RefreshRate, _D3DFORMAT Format) {
		setWidth(Width);
		setHeight(Height);
		setRefreshRate(RefreshRate);
		setFormat(Format);
	}
	public _D3DDISPLAYMODE() {
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
	public Object getRefreshRate() {
		return RefreshRate;
	}
	public void setRefreshRate(Object newRefreshRate) {
		RefreshRate = newRefreshRate;
	}
	public _D3DFORMAT getFormat() {
		return Format;
	}
	public void setFormat(_D3DFORMAT newFormat) {
		Format = newFormat;
	}
}
