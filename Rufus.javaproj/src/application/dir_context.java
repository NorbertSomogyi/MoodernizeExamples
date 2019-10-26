package application;

public class dir_context {
	private Object dir;
	private int flags;
	private Byte buf;
	private int buflen;
	private Object func;
	private Object priv_data;
	private Object errcode;
	
	public dir_context(Object dir, int flags, Byte buf, int buflen, Object func, Object priv_data, Object errcode) {
		setDir(dir);
		setFlags(flags);
		setBuf(buf);
		setBuflen(buflen);
		setFunc(func);
		setPriv_data(priv_data);
		setErrcode(errcode);
	}
	public dir_context() {
	}
	
	public Object getDir() {
		return dir;
	}
	public void setDir(Object newDir) {
		dir = newDir;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public int getBuflen() {
		return buflen;
	}
	public void setBuflen(int newBuflen) {
		buflen = newBuflen;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public Object getPriv_data() {
		return priv_data;
	}
	public void setPriv_data(Object newPriv_data) {
		priv_data = newPriv_data;
	}
	public Object getErrcode() {
		return errcode;
	}
	public void setErrcode(Object newErrcode) {
		errcode = newErrcode;
	}
}
