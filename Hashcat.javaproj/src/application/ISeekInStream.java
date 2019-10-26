package application;

public class ISeekInStream {
	private Object Read;
	private Object Seek;
	
	public ISeekInStream(Object Read, Object Seek) {
		setRead(Read);
		setSeek(Seek);
	}
	public ISeekInStream() {
	}
	
	public Object getRead() {
		return Read;
	}
	public void setRead(Object newRead) {
		Read = newRead;
	}
	public Object getSeek() {
		return Seek;
	}
	public void setSeek(Object newSeek) {
		Seek = newSeek;
	}
}
