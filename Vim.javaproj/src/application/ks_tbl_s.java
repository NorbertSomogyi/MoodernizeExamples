package application;

public class ks_tbl_s {
	private int code;
	private Byte vtp;
	private Byte vtp2;
	private Object buf;
	private Object vbuf;
	private Object v2buf;
	private Object arr;
	
	public ks_tbl_s(int code, Byte vtp, Byte vtp2, Object buf, Object vbuf, Object v2buf, Object arr) {
		setCode(code);
		setVtp(vtp);
		setVtp2(vtp2);
		setBuf(buf);
		setVbuf(vbuf);
		setV2buf(v2buf);
		setArr(arr);
	}
	public ks_tbl_s() {
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int newCode) {
		code = newCode;
	}
	public Byte getVtp() {
		return vtp;
	}
	public void setVtp(Byte newVtp) {
		vtp = newVtp;
	}
	public Byte getVtp2() {
		return vtp2;
	}
	public void setVtp2(Byte newVtp2) {
		vtp2 = newVtp2;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getVbuf() {
		return vbuf;
	}
	public void setVbuf(Object newVbuf) {
		vbuf = newVbuf;
	}
	public Object getV2buf() {
		return v2buf;
	}
	public void setV2buf(Object newV2buf) {
		v2buf = newV2buf;
	}
	public Object getArr() {
		return arr;
	}
	public void setArr(Object newArr) {
		arr = newArr;
	}
}
// normal
// reverse
// bold
// standout: bright red text
// standout end: default color
// italic: bright magenta text
// italic end
// underscore
// underscore end
// set background color
// set foreground color
