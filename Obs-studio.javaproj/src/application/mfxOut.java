package application;

public class mfxOut {
	private Object FourCC;
	private Object ChromaFormat;
	private Object reserved1;
	private Object Width;
	private Object Height;
	private Object CropX;
	private Object CropY;
	private Object CropW;
	private Object CropH;
	private Object reserved;
	
	public mfxOut(Object FourCC, Object ChromaFormat, Object reserved1, Object Width, Object Height, Object CropX, Object CropY, Object CropW, Object CropH, Object reserved) {
		setFourCC(FourCC);
		setChromaFormat(ChromaFormat);
		setReserved1(reserved1);
		setWidth(Width);
		setHeight(Height);
		setCropX(CropX);
		setCropY(CropY);
		setCropW(CropW);
		setCropH(CropH);
		setReserved(reserved);
	}
	public mfxOut() {
	}
	
	public Object getFourCC() {
		return FourCC;
	}
	public void setFourCC(Object newFourCC) {
		FourCC = newFourCC;
	}
	public Object getChromaFormat() {
		return ChromaFormat;
	}
	public void setChromaFormat(Object newChromaFormat) {
		ChromaFormat = newChromaFormat;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
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
