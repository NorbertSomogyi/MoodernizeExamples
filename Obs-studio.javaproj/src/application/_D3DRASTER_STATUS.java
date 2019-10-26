package application;

/* Raster Status structure returned by GetRasterStatus */
public class _D3DRASTER_STATUS {
	private Object InVBlank;
	private Object ScanLine;
	
	public _D3DRASTER_STATUS(Object InVBlank, Object ScanLine) {
		setInVBlank(InVBlank);
		setScanLine(ScanLine);
	}
	public _D3DRASTER_STATUS() {
	}
	
	public Object getInVBlank() {
		return InVBlank;
	}
	public void setInVBlank(Object newInVBlank) {
		InVBlank = newInVBlank;
	}
	public Object getScanLine() {
		return ScanLine;
	}
	public void setScanLine(Object newScanLine) {
		ScanLine = newScanLine;
	}
}
