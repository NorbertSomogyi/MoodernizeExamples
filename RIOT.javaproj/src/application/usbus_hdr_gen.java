package application;

/**< ptr to the next header generator */
public class usbus_hdr_gen {
	private usbus_hdr_gen next;
	private Object funcs;
	private Object arg;
	
	public usbus_hdr_gen(usbus_hdr_gen next, Object funcs, Object arg) {
		setNext(next);
		setFuncs(funcs);
		setArg(arg);
	}
	public usbus_hdr_gen() {
	}
	
	public usbus_hdr_gen getNext() {
		return next;
	}
	public void setNext(usbus_hdr_gen newNext) {
		next = newNext;
	}
	public Object getFuncs() {
		return funcs;
	}
	public void setFuncs(Object newFuncs) {
		funcs = newFuncs;
	}
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
}
