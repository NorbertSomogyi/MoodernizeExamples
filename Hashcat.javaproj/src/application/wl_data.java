package application;

public class wl_data {
	private boolean enabled;
	private byte[] buf;
	private Object incr;
	private Object avail;
	private Object cnt;
	private Object pos;
	private boolean iconv_enabled;
	private Object iconv_ctx;
	private Byte iconv_tmp;
	private Object func;
	
	public wl_data(boolean enabled, byte[] buf, Object incr, Object avail, Object cnt, Object pos, boolean iconv_enabled, Object iconv_ctx, Byte iconv_tmp, Object func) {
		setEnabled(enabled);
		setBuf(buf);
		setIncr(incr);
		setAvail(avail);
		setCnt(cnt);
		setPos(pos);
		setIconv_enabled(iconv_enabled);
		setIconv_ctx(iconv_ctx);
		setIconv_tmp(iconv_tmp);
		setFunc(func);
	}
	public wl_data() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public byte[] getBuf() {
		return buf;
	}
	public void setBuf(byte[] newBuf) {
		buf = newBuf;
	}
	public Object getIncr() {
		return incr;
	}
	public void setIncr(Object newIncr) {
		incr = newIncr;
	}
	public Object getAvail() {
		return avail;
	}
	public void setAvail(Object newAvail) {
		avail = newAvail;
	}
	public Object getCnt() {
		return cnt;
	}
	public void setCnt(Object newCnt) {
		cnt = newCnt;
	}
	public Object getPos() {
		return pos;
	}
	public void setPos(Object newPos) {
		pos = newPos;
	}
	public boolean getIconv_enabled() {
		return iconv_enabled;
	}
	public void setIconv_enabled(boolean newIconv_enabled) {
		iconv_enabled = newIconv_enabled;
	}
	public Object getIconv_ctx() {
		return iconv_ctx;
	}
	public void setIconv_ctx(Object newIconv_ctx) {
		iconv_ctx = newIconv_ctx;
	}
	public Byte getIconv_tmp() {
		return iconv_tmp;
	}
	public void setIconv_tmp(Byte newIconv_tmp) {
		iconv_tmp = newIconv_tmp;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
}
