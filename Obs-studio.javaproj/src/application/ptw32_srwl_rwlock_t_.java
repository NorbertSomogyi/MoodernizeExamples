package application;

/* Scalable RW Locks */
public class ptw32_srwl_rwlock_t_ {
	private ptw32_srwl_node_t_ tailPtr;
	private ptw32_srwl_node_t_ readerNodePtr;
	
	public ptw32_srwl_rwlock_t_(ptw32_srwl_node_t_ tailPtr, ptw32_srwl_node_t_ readerNodePtr) {
		setTailPtr(tailPtr);
		setReaderNodePtr(readerNodePtr);
	}
	public ptw32_srwl_rwlock_t_() {
	}
	
	public ptw32_srwl_node_t_ getTailPtr() {
		return tailPtr;
	}
	public void setTailPtr(ptw32_srwl_node_t_ newTailPtr) {
		tailPtr = newTailPtr;
	}
	public ptw32_srwl_node_t_ getReaderNodePtr() {
		return readerNodePtr;
	}
	public void setReaderNodePtr(ptw32_srwl_node_t_ newReaderNodePtr) {
		readerNodePtr = newReaderNodePtr;
	}
}
