package application;

public class mfxRefPic {
	private Object FrameOrder;
	private Object PicStruct;
	private Object reserved;
	
	public mfxRefPic(Object FrameOrder, Object PicStruct, Object reserved) {
		setFrameOrder(FrameOrder);
		setPicStruct(PicStruct);
		setReserved(reserved);
	}
	public mfxRefPic() {
	}
	
	public Object getFrameOrder() {
		return FrameOrder;
	}
	public void setFrameOrder(Object newFrameOrder) {
		FrameOrder = newFrameOrder;
	}
	public Object getPicStruct() {
		return PicStruct;
	}
	public void setPicStruct(Object newPicStruct) {
		PicStruct = newPicStruct;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
