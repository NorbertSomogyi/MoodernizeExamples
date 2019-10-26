package application;

public class Frag {
	private Object start;
	private Ptrlist out;
	
	public Frag(Object start, Ptrlist out) {
		setStart(start);
		setOut(out);
	}
	public Frag() {
	}
	
	public Frag frag(Object start, Ptrlist out) {
		Frag_T n = new Frag_T();
		n.setStart(start);
		n.setOut(out);
		return n/*
		 * Create singleton list containing just outp.
		 */;
	}
	/*
	 * Push an item onto the stack.
	 */
	public void st_push(Frag p, Frag stack_end) {
		Frag_T stackp = p;
		if (stackp >= stack_end) {
			return ;
		} 
		stackp = s;
		p = p + 1/*
		 * Pop an item from the stack.
		 */;
	}
	public Frag st_pop(Frag stack) {
		Frag_T stackp = new Frag_T();
		p = p - 1;
		stackp = p;
		if (stackp < stack) {
			return ModernizedCProgram.empty;
		} 
		return p/*
		 * Estimate the maximum byte length of anything matching "state".
		 * When unknown or unlimited return -1.
		 */;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Ptrlist getOut() {
		return out;
	}
	public void setOut(Ptrlist newOut) {
		out = newOut;
	}
}
/*
 * Initialize a Frag_T struct and return it.
 */
