package application;

public class stream_vtbl {
	private Object close;
	private Object read;
	
	public stream_vtbl(Object close, Object read) {
		setClose(close);
		setRead(read);
	}
	public stream_vtbl() {
	}
	
	public Object getClose() {
		return close;
	}
	public void setClose(Object newClose) {
		close = newClose;
	}
	public Object getRead() {
		return read;
	}
	public void setRead(Object newRead) {
		read = newRead;
	}
}
