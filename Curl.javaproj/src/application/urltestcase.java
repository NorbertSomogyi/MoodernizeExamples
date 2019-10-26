package application;

public class urltestcase {
	private Object in;
	private Object out;
	private int urlflags;
	private int getflags;
	private Object ucode;
	
	public urltestcase(Object in, Object out, int urlflags, int getflags, Object ucode) {
		setIn(in);
		setOut(out);
		setUrlflags(urlflags);
		setGetflags(getflags);
		setUcode(ucode);
	}
	public urltestcase() {
	}
	
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public int getUrlflags() {
		return urlflags;
	}
	public void setUrlflags(int newUrlflags) {
		urlflags = newUrlflags;
	}
	public int getGetflags() {
		return getflags;
	}
	public void setGetflags(int newGetflags) {
		getflags = newGetflags;
	}
	public Object getUcode() {
		return ucode;
	}
	public void setUcode(Object newUcode) {
		ucode = newUcode;
	}
}
