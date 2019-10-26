package application;

public class nfa_state {
	private int c;
	private nfa_state out;
	private nfa_state out1;
	private int id;
	private Object lastlist;
	private int val;
	
	public nfa_state(int c, nfa_state out, nfa_state out1, int id, Object lastlist, int val) {
		setC(c);
		setOut(out);
		setOut1(out1);
		setId(id);
		setLastlist(lastlist);
		setVal(val);
	}
	public nfa_state() {
	}
	
	public int getC() {
		return c;
	}
	public void setC(int newC) {
		c = newC;
	}
	public nfa_state getOut() {
		return out;
	}
	public void setOut(nfa_state newOut) {
		out = newOut;
	}
	public nfa_state getOut1() {
		return out1;
	}
	public void setOut1(nfa_state newOut1) {
		out1 = newOut1;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public Object getLastlist() {
		return lastlist;
	}
	public void setLastlist(Object newLastlist) {
		lastlist = newLastlist;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int newVal) {
		val = newVal;
	}
}
