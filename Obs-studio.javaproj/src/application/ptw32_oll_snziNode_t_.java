package application;

public class ptw32_oll_snziNode_t_ {
	private ptw32_oll_counter_t_ counter;
	private ptw32_oll_snziNodeOrRoot_t_ parentPtr;
	
	public ptw32_oll_snziNode_t_(ptw32_oll_counter_t_ counter, ptw32_oll_snziNodeOrRoot_t_ parentPtr) {
		setCounter(counter);
		setParentPtr(parentPtr);
	}
	public ptw32_oll_snziNode_t_() {
	}
	
	public ptw32_oll_counter_t_ getCounter() {
		return counter;
	}
	public void setCounter(ptw32_oll_counter_t_ newCounter) {
		counter = newCounter;
	}
	public ptw32_oll_snziNodeOrRoot_t_ getParentPtr() {
		return parentPtr;
	}
	public void setParentPtr(ptw32_oll_snziNodeOrRoot_t_ newParentPtr) {
		parentPtr = newParentPtr;
	}
}
/* "counter" must be at same offset in both
   * ptw32_oll_snziNode_t and ptw32_oll_snziRoot_t
   */
