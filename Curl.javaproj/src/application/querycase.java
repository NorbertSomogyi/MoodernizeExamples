package application;

public class querycase {
	private Object in;
	private Object q;
	private Object out;
	private int urlflags;
	private int qflags;
	private Object ucode;
	
	public querycase(Object in, Object q, Object out, int urlflags, int qflags, Object ucode) {
		setIn(in);
		setQ(q);
		setOut(out);
		setUrlflags(urlflags);
		setQflags(qflags);
		setUcode(ucode);
	}
	public querycase() {
	}
	
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getQ() {
		return q;
	}
	public void setQ(Object newQ) {
		q = newQ;
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
	public int getQflags() {
		return qflags;
	}
	public void setQflags(int newQflags) {
		qflags = newQflags;
	}
	public Object getUcode() {
		return ucode;
	}
	public void setUcode(Object newUcode) {
		ucode = newUcode;
	}
}
