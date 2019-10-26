package application;

public class StaticTableEncoding {
	private Object enc;
	private Object chars;
	
	public StaticTableEncoding(Object enc, Object chars) {
		setEnc(enc);
		setChars(chars);
	}
	public StaticTableEncoding() {
	}
	
	public Object getEnc() {
		return enc;
	}
	public void setEnc(Object newEnc) {
		enc = newEnc;
	}
	public Object getChars() {
		return chars;
	}
	public void setChars(Object newChars) {
		chars = newChars;
	}
}
