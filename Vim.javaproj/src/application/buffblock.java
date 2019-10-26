package application;

public class buffblock {
	private buffblock b_next;
	private Object b_str;
	
	public buffblock(buffblock b_next, Object b_str) {
		setB_next(b_next);
		setB_str(b_str);
	}
	public buffblock() {
	}
	
	public buffblock getB_next() {
		return b_next;
	}
	public void setB_next(buffblock newB_next) {
		b_next = newB_next;
	}
	public Object getB_str() {
		return b_str;
	}
	public void setB_str(Object newB_str) {
		b_str = newB_str;
	}
}
