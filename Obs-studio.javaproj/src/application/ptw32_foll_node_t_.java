package application;

public class ptw32_foll_node_t_ {
	private ptw32_foll_node_t_ qNextPtr;
	private ptw32_oll_csnzi_t_ csnziPtr;
	private ptw32_foll_node_t_ nextPtr;
	private int kind;
	private int allocState;
	private Object spin;
	
	public ptw32_foll_node_t_(ptw32_foll_node_t_ qNextPtr, ptw32_oll_csnzi_t_ csnziPtr, ptw32_foll_node_t_ nextPtr, int kind, int allocState, Object spin) {
		setQNextPtr(qNextPtr);
		setCsnziPtr(csnziPtr);
		setNextPtr(nextPtr);
		setKind(kind);
		setAllocState(allocState);
		setSpin(spin);
	}
	public ptw32_foll_node_t_() {
	}
	
	public ptw32_foll_node_t_ getQNextPtr() {
		return qNextPtr;
	}
	public void setQNextPtr(ptw32_foll_node_t_ newQNextPtr) {
		qNextPtr = newQNextPtr;
	}
	public ptw32_oll_csnzi_t_ getCsnziPtr() {
		return csnziPtr;
	}
	public void setCsnziPtr(ptw32_oll_csnzi_t_ newCsnziPtr) {
		csnziPtr = newCsnziPtr;
	}
	public ptw32_foll_node_t_ getNextPtr() {
		return nextPtr;
	}
	public void setNextPtr(ptw32_foll_node_t_ newNextPtr) {
		nextPtr = newNextPtr;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int newKind) {
		kind = newKind;
	}
	public int getAllocState() {
		return allocState;
	}
	public void setAllocState(int newAllocState) {
		allocState = newAllocState;
	}
	public Object getSpin() {
		return spin;
	}
	public void setSpin(Object newSpin) {
		spin = newSpin;
	}
}
