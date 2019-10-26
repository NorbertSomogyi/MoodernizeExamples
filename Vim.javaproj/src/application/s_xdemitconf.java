package application;

public class s_xdemitconf {
	private long ctxlen;
	private long interhunkctxlen;
	private long flags;
	private Object find_func;
	private Object find_func_priv;
	private Object hunk_func;
	
	public s_xdemitconf(long ctxlen, long interhunkctxlen, long flags, Object find_func, Object find_func_priv, Object hunk_func) {
		setCtxlen(ctxlen);
		setInterhunkctxlen(interhunkctxlen);
		setFlags(flags);
		setFind_func(find_func);
		setFind_func_priv(find_func_priv);
		setHunk_func(hunk_func);
	}
	public s_xdemitconf() {
	}
	
	public long getCtxlen() {
		return ctxlen;
	}
	public void setCtxlen(long newCtxlen) {
		ctxlen = newCtxlen;
	}
	public long getInterhunkctxlen() {
		return interhunkctxlen;
	}
	public void setInterhunkctxlen(long newInterhunkctxlen) {
		interhunkctxlen = newInterhunkctxlen;
	}
	public long getFlags() {
		return flags;
	}
	public void setFlags(long newFlags) {
		flags = newFlags;
	}
	public Object getFind_func() {
		return find_func;
	}
	public void setFind_func(Object newFind_func) {
		find_func = newFind_func;
	}
	public Object getFind_func_priv() {
		return find_func_priv;
	}
	public void setFind_func_priv(Object newFind_func_priv) {
		find_func_priv = newFind_func_priv;
	}
	public Object getHunk_func() {
		return hunk_func;
	}
	public void setHunk_func(Object newHunk_func) {
		hunk_func = newHunk_func;
	}
}
