package application;

/* flags are one or two characters */
/* flags are numbers, comma separated */
public class affentry_S {
	private affentry_S ae_next;
	private Object ae_chop;
	private Object ae_add;
	private Object ae_flags;
	private Object ae_cond;
	private regprog ae_prog;
	private byte ae_compforbid;
	private byte ae_comppermit;
	
	public affentry_S(affentry_S ae_next, Object ae_chop, Object ae_add, Object ae_flags, Object ae_cond, regprog ae_prog, byte ae_compforbid, byte ae_comppermit) {
		setAe_next(ae_next);
		setAe_chop(ae_chop);
		setAe_add(ae_add);
		setAe_flags(ae_flags);
		setAe_cond(ae_cond);
		setAe_prog(ae_prog);
		setAe_compforbid(ae_compforbid);
		setAe_comppermit(ae_comppermit);
	}
	public affentry_S() {
	}
	
	public affentry_S getAe_next() {
		return ae_next;
	}
	public void setAe_next(affentry_S newAe_next) {
		ae_next = newAe_next;
	}
	public Object getAe_chop() {
		return ae_chop;
	}
	public void setAe_chop(Object newAe_chop) {
		ae_chop = newAe_chop;
	}
	public Object getAe_add() {
		return ae_add;
	}
	public void setAe_add(Object newAe_add) {
		ae_add = newAe_add;
	}
	public Object getAe_flags() {
		return ae_flags;
	}
	public void setAe_flags(Object newAe_flags) {
		ae_flags = newAe_flags;
	}
	public Object getAe_cond() {
		return ae_cond;
	}
	public void setAe_cond(Object newAe_cond) {
		ae_cond = newAe_cond;
	}
	public regprog getAe_prog() {
		return ae_prog;
	}
	public void setAe_prog(regprog newAe_prog) {
		ae_prog = newAe_prog;
	}
	public byte getAe_compforbid() {
		return ae_compforbid;
	}
	public void setAe_compforbid(byte newAe_compforbid) {
		ae_compforbid = newAe_compforbid;
	}
	public byte getAe_comppermit() {
		return ae_comppermit;
	}
	public void setAe_comppermit(byte newAe_comppermit) {
		ae_comppermit = newAe_comppermit;
	}
}
/* Affix entry from ".aff" file.  Used for prefixes and suffixes. */
