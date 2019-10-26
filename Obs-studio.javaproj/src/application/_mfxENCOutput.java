package application;

public class _mfxENCOutput {
	private Object reserved;
	private  OutSurface;
	private Object NumExtParam;
	private  ExtParam;
	
	public _mfxENCOutput(Object reserved,  OutSurface, Object NumExtParam,  ExtParam) {
		setReserved(reserved);
		setOutSurface(OutSurface);
		setNumExtParam(NumExtParam);
		setExtParam(ExtParam);
	}
	public _mfxENCOutput() {
	}
	
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public  getOutSurface() {
		return OutSurface;
	}
	public void setOutSurface( newOutSurface) {
		OutSurface = newOutSurface;
	}
	public Object getNumExtParam() {
		return NumExtParam;
	}
	public void setNumExtParam(Object newNumExtParam) {
		NumExtParam = newNumExtParam;
	}
	public  getExtParam() {
		return ExtParam;
	}
	public void setExtParam( newExtParam) {
		ExtParam = newExtParam;
	}
}
