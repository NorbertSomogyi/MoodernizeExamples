package application;

public class cbq_S {
	private  cq_callback;
	private int cq_seq_nr;
	private cbq_S cq_next;
	private cbq_S cq_prev;
	
	public cbq_S( cq_callback, int cq_seq_nr, cbq_S cq_next, cbq_S cq_prev) {
		setCq_callback(cq_callback);
		setCq_seq_nr(cq_seq_nr);
		setCq_next(cq_next);
		setCq_prev(cq_prev);
	}
	public cbq_S() {
	}
	
	public  getCq_callback() {
		return cq_callback;
	}
	public void setCq_callback( newCq_callback) {
		cq_callback = newCq_callback;
	}
	public int getCq_seq_nr() {
		return cq_seq_nr;
	}
	public void setCq_seq_nr(int newCq_seq_nr) {
		cq_seq_nr = newCq_seq_nr;
	}
	public cbq_S getCq_next() {
		return cq_next;
	}
	public void setCq_next(cbq_S newCq_next) {
		cq_next = newCq_next;
	}
	public cbq_S getCq_prev() {
		return cq_prev;
	}
	public void setCq_prev(cbq_S newCq_prev) {
		cq_prev = newCq_prev;
	}
}
