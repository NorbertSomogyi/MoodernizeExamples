package application;

public class ptw32_robust_node_t_ {
	private Object mx;
	private ptw32_robust_state_t_ stateInconsistent;
	private ptw32_robust_node_t_ prev;
	private ptw32_robust_node_t_ next;
	
	public ptw32_robust_node_t_(Object mx, ptw32_robust_state_t_ stateInconsistent, ptw32_robust_node_t_ prev, ptw32_robust_node_t_ next) {
		setMx(mx);
		setStateInconsistent(stateInconsistent);
		setPrev(prev);
		setNext(next);
	}
	public ptw32_robust_node_t_() {
	}
	
	public Object getMx() {
		return mx;
	}
	public void setMx(Object newMx) {
		mx = newMx;
	}
	public ptw32_robust_state_t_ getStateInconsistent() {
		return stateInconsistent;
	}
	public void setStateInconsistent(ptw32_robust_state_t_ newStateInconsistent) {
		stateInconsistent = newStateInconsistent;
	}
	public ptw32_robust_node_t_ getPrev() {
		return prev;
	}
	public void setPrev(ptw32_robust_node_t_ newPrev) {
		prev = newPrev;
	}
	public ptw32_robust_node_t_ getNext() {
		return next;
	}
	public void setNext(ptw32_robust_node_t_ newNext) {
		next = newNext;
	}
}
