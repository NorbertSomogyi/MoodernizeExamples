package application;

public class mfxIn {
	private Object CropX;
	private Object CropY;
	private Object CropW;
	private Object CropH;
	private Object reserved;
	
	public mfxIn(Object CropX, Object CropY, Object CropW, Object CropH, Object reserved) {
		setCropX(CropX);
		setCropY(CropY);
		setCropW(CropW);
		setCropH(CropH);
		setReserved(reserved);
	}
	public mfxIn() {
	}
	
	public Object getCropX() {
		return CropX;
	}
	public void setCropX(Object newCropX) {
		CropX = newCropX;
	}
	public Object getCropY() {
		return CropY;
	}
	public void setCropY(Object newCropY) {
		CropY = newCropY;
	}
	public Object getCropW() {
		return CropW;
	}
	public void setCropW(Object newCropW) {
		CropW = newCropW;
	}
	public Object getCropH() {
		return CropH;
	}
	public void setCropH(Object newCropH) {
		CropH = newCropH;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
