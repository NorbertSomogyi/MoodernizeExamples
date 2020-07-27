package application;

public class ptw32_srwl_node_t_ {
	private ptw32_srwl_node_t_ qNextPtr;
	private ptw32_oll_csnzi_t_ csnziPtr;
	private ptw32_srwl_node_t_ nextReaderPtr;
	private int kind;
	private int allocState;
	private Object spin;
	
	public ptw32_srwl_node_t_(ptw32_srwl_node_t_ qNextPtr, ptw32_oll_csnzi_t_ csnziPtr, ptw32_srwl_node_t_ nextReaderPtr, int kind, int allocState, Object spin) {
		setQNextPtr(qNextPtr);
		setCsnziPtr(csnziPtr);
		setNextReaderPtr(nextReaderPtr);
		setKind(kind);
		setAllocState(allocState);
		setSpin(spin);
	}
	public ptw32_srwl_node_t_() {
	}
	
	/* Allocates a new reader node. */
	public ptw32_srwl_node_t_ ptw32_srwl_AllocReaderNode(ptw32_srwl_local_t_ local) {
		ptw32_srwl_node_t_ generatedRNodePtr = local.getRNodePtr();
		ptw32_srwl_node_t currNodePtr = generatedRNodePtr;
		int generatedAllocState = currNodePtr.getAllocState();
		Object generatedNext = currNodePtr.getNext();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (generatedAllocState == .ptw32_srwl_free) {
				if (/*Error: Unsupported expression*/ == (long).ptw32_srwl_in_use) {
					return currNodePtr;
				} 
			} 
			currNodePtr = generatedNext;
		}
	}
	public void ptw32_srwl_FreeReaderNode() {
		int generatedAllocState = this.getAllocState();
		generatedAllocState;
	}
	public ptw32_srwl_node_t_ getQNextPtr() {
		return qNextPtr;
	}
	public void setQNextPtr(ptw32_srwl_node_t_ newQNextPtr) {
		qNextPtr = newQNextPtr;
	}
	public ptw32_oll_csnzi_t_ getCsnziPtr() {
		return csnziPtr;
	}
	public void setCsnziPtr(ptw32_oll_csnzi_t_ newCsnziPtr) {
		csnziPtr = newCsnziPtr;
	}
	public ptw32_srwl_node_t_ getNextReaderPtr() {
		return nextReaderPtr;
	}
	public void setNextReaderPtr(ptw32_srwl_node_t_ newNextReaderPtr) {
		nextReaderPtr = newNextReaderPtr;
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
