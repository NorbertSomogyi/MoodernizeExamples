package application;

public class blake2 {
	private Object h;
	private Object t;
	private Object f;
	private Object buflen;
	private Object outlen;
	
	public blake2(Object h, Object t, Object f, Object buflen, Object outlen) {
		setH(h);
		setT(t);
		setF(f);
		setBuflen(buflen);
		setOutlen(outlen);
	}
	public blake2() {
	}
	
	public Object getH() {
		return h;
	}
	public void setH(Object newH) {
		h = newH;
	}
	public Object getT() {
		return t;
	}
	public void setT(Object newT) {
		t = newT;
	}
	public Object getF() {
		return f;
	}
	public void setF(Object newF) {
		f = newF;
	}
	public Object getBuflen() {
		return buflen;
	}
	public void setBuflen(Object newBuflen) {
		buflen = newBuflen;
	}
	public Object getOutlen() {
		return outlen;
	}
	public void setOutlen(Object newOutlen) {
		outlen = newOutlen;
	}
}
