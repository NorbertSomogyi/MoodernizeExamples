package application;

public class redircase {
	private Object in;
	private Object set;
	private Object out;
	private int urlflags;
	private int setflags;
	private Object ucode;
	
	public redircase(Object in, Object set, Object out, int urlflags, int setflags, Object ucode) {
		setIn(in);
		setSet(set);
		setOut(out);
		setUrlflags(urlflags);
		setSetflags(setflags);
		setUcode(ucode);
	}
	public redircase() {
	}
	
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getSet() {
		return set;
	}
	public void setSet(Object newSet) {
		set = newSet;
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
	public int getSetflags() {
		return setflags;
	}
	public void setSetflags(int newSetflags) {
		setflags = newSetflags;
	}
	public Object getUcode() {
		return ucode;
	}
	public void setUcode(Object newUcode) {
		ucode = newUcode;
	}
}
