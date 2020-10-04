package application;

/**
 * Author......: See docs/credits.txt
 * License.....: MIT
 */
public class sha384_ctx {
	private Object[] h;
	private Object[] w0;
	private Object[] w1;
	private Object[] w2;
	private Object[] w3;
	private Object[] w4;
	private Object[] w5;
	private Object[] w6;
	private Object[] w7;
	private int len;
	
	public sha384_ctx(Object[] h, Object[] w0, Object[] w1, Object[] w2, Object[] w3, Object[] w4, Object[] w5, Object[] w6, Object[] w7, int len) {
		setH(h);
		setW0(w0);
		setW1(w1);
		setW2(w2);
		setW3(w3);
		setW4(w4);
		setW5(w5);
		setW6(w6);
		setW7(w7);
		setLen(len);
	}
	public sha384_ctx() {
	}
	
	public Object[] getH() {
		return h;
	}
	public void setH(Object[] newH) {
		h = newH;
	}
	public Object[] getW0() {
		return w0;
	}
	public void setW0(Object[] newW0) {
		w0 = newW0;
	}
	public Object[] getW1() {
		return w1;
	}
	public void setW1(Object[] newW1) {
		w1 = newW1;
	}
	public Object[] getW2() {
		return w2;
	}
	public void setW2(Object[] newW2) {
		w2 = newW2;
	}
	public Object[] getW3() {
		return w3;
	}
	public void setW3(Object[] newW3) {
		w3 = newW3;
	}
	public Object[] getW4() {
		return w4;
	}
	public void setW4(Object[] newW4) {
		w4 = newW4;
	}
	public Object[] getW5() {
		return w5;
	}
	public void setW5(Object[] newW5) {
		w5 = newW5;
	}
	public Object[] getW6() {
		return w6;
	}
	public void setW6(Object[] newW6) {
		w6 = newW6;
	}
	public Object[] getW7() {
		return w7;
	}
	public void setW7(Object[] newW7) {
		w7 = newW7;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
}
