package application;

public class streebog512_ctx_vector {
	private Object h;
	private Object s;
	private Object n;
	private Object w0;
	private Object w1;
	private Object w2;
	private Object w3;
	private int len;
	
	public streebog512_ctx_vector(Object h, Object s, Object n, Object w0, Object w1, Object w2, Object w3, int len) {
		setH(h);
		setS(s);
		setN(n);
		setW0(w0);
		setW1(w1);
		setW2(w2);
		setW3(w3);
		setLen(len);
	}
	public streebog512_ctx_vector() {
	}
	
	public Object getH() {
		return h;
	}
	public void setH(Object newH) {
		h = newH;
	}
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getN() {
		return n;
	}
	public void setN(Object newN) {
		n = newN;
	}
	public Object getW0() {
		return w0;
	}
	public void setW0(Object newW0) {
		w0 = newW0;
	}
	public Object getW1() {
		return w1;
	}
	public void setW1(Object newW1) {
		w1 = newW1;
	}
	public Object getW2() {
		return w2;
	}
	public void setW2(Object newW2) {
		w2 = newW2;
	}
	public Object getW3() {
		return w3;
	}
	public void setW3(Object newW3) {
		w3 = newW3;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
}
