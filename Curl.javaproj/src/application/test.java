package application;

public class test {
	private Object in;
	private int inlen;
	private Object out;
	private int outlen;
	
	public test(Object in, int inlen, Object out, int outlen) {
		setIn(in);
		setInlen(inlen);
		setOut(out);
		setOutlen(outlen);
	}
	public test() {
	}
	
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public int getInlen() {
		return inlen;
	}
	public void setInlen(int newInlen) {
		inlen = newInlen;
	}
	public Object getOut() {
		return out;
	}
	public void setOut(Object newOut) {
		out = newOut;
	}
	public int getOutlen() {
		return outlen;
	}
	public void setOutlen(int newOutlen) {
		outlen = newOutlen;
	}
}
