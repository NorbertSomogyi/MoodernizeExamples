package application;

public class blake2s_state__ {
	private Object h;
	private Object t;
	private Object f;
	private Object buf;
	private Object buflen;
	private Object outlen;
	private Object last_node;
	
	public blake2s_state__(Object h, Object t, Object f, Object buf, Object buflen, Object outlen, Object last_node) {
		setH(h);
		setT(t);
		setF(f);
		setBuf(buf);
		setBuflen(buflen);
		setOutlen(outlen);
		setLast_node(last_node);
	}
	public blake2s_state__() {
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
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
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
	public Object getLast_node() {
		return last_node;
	}
	public void setLast_node(Object newLast_node) {
		last_node = newLast_node;
	}
}
