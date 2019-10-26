package application;

public class blake2sp_state__ {
	private Object S;
	private Object R;
	private Object buf;
	private Object buflen;
	private Object outlen;
	
	public blake2sp_state__(Object S, Object R, Object buf, Object buflen, Object outlen) {
		setS(S);
		setR(R);
		setBuf(buf);
		setBuflen(buflen);
		setOutlen(outlen);
	}
	public blake2sp_state__() {
	}
	
	public Object getS() {
		return S;
	}
	public void setS(Object newS) {
		S = newS;
	}
	public Object getR() {
		return R;
	}
	public void setR(Object newR) {
		R = newR;
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
}
