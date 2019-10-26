package application;

public class charset_pair {
	private Byte name;
	private Object charset;
	
	public charset_pair(Byte name, Object charset) {
		setName(name);
		setCharset(charset);
	}
	public charset_pair() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getCharset() {
		return charset;
	}
	public void setCharset(Object newCharset) {
		charset = newCharset;
	}
}
