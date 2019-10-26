package application;

/*
 * I have seen
 *  extern char *_sys_siglist[NSIG];
 * on Irix, Linux, NetBSD and Solaris. It contains a nice list of strings
 * that describe the signals. That is nearly what we want here.  But
 * autoconf does only check for sys_siglist (without the underscore), I
 * do not want to change everything today.... jw.
 * This is why AC_DECL_SYS_SIGLIST is commented out in configure.ac.
 */
public class signalinfo {
	private int sig;
	private Byte name;
	private byte deadly;
	
	public signalinfo(int sig, Byte name, byte deadly) {
		setSig(sig);
		setName(name);
		setDeadly(deadly);
	}
	public signalinfo() {
	}
	
	public int getSig() {
		return sig;
	}
	public void setSig(int newSig) {
		sig = newSig;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public byte getDeadly() {
		return deadly;
	}
	public void setDeadly(byte newDeadly) {
		deadly = newDeadly;
	}
}
