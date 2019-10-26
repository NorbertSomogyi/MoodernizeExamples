package application;

// List of location lists to be deleted.
// Used to delay the deletion of locations lists by autocmds.
public class qf_delq_S {
	private qf_delq_S next;
	private qf_info_S qi;
	
	public qf_delq_S(qf_delq_S next, qf_info_S qi) {
		setNext(next);
		setQi(qi);
	}
	public qf_delq_S() {
	}
	
	public qf_delq_S getNext() {
		return next;
	}
	public void setNext(qf_delq_S newNext) {
		next = newNext;
	}
	public qf_info_S getQi() {
		return qi;
	}
	public void setQi(qf_info_S newQi) {
		qi = newQi;
	}
}
