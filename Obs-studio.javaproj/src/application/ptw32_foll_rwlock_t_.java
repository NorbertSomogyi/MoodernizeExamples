package application;

public class ptw32_foll_rwlock_t_ {
	private ptw32_foll_node_t_ tailPtr;
	private ptw32_foll_node_t_ rNodesPtr;
	
	public ptw32_foll_rwlock_t_(ptw32_foll_node_t_ tailPtr, ptw32_foll_node_t_ rNodesPtr) {
		setTailPtr(tailPtr);
		setRNodesPtr(rNodesPtr);
	}
	public ptw32_foll_rwlock_t_() {
	}
	
	public ptw32_foll_node_t_ getTailPtr() {
		return tailPtr;
	}
	public void setTailPtr(ptw32_foll_node_t_ newTailPtr) {
		tailPtr = newTailPtr;
	}
	public ptw32_foll_node_t_ getRNodesPtr() {
		return rNodesPtr;
	}
	public void setRNodesPtr(ptw32_foll_node_t_ newRNodesPtr) {
		rNodesPtr = newRNodesPtr;
	}
}
