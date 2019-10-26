package application;

public class IByteOut {
	private Object Write;
	
	public IByteOut(Object Write) {
		setWrite(Write);
	}
	public IByteOut() {
	}
	
	public Object getWrite() {
		return Write;
	}
	public void setWrite(Object newWrite) {
		Write = newWrite;
	}
}
