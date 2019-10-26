package application;

public class pthread_mutex_t_ {
	private Object lock_idx;
	private int recursive_count;
	private int kind;
	private Object ownerThread;
	private Object event;
	private ptw32_robust_node_t_ robustNode;
	
	public pthread_mutex_t_(Object lock_idx, int recursive_count, int kind, Object ownerThread, Object event, ptw32_robust_node_t_ robustNode) {
		setLock_idx(lock_idx);
		setRecursive_count(recursive_count);
		setKind(kind);
		setOwnerThread(ownerThread);
		setEvent(event);
		setRobustNode(robustNode);
	}
	public pthread_mutex_t_() {
	}
	
	public Object getLock_idx() {
		return lock_idx;
	}
	public void setLock_idx(Object newLock_idx) {
		lock_idx = newLock_idx;
	}
	public int getRecursive_count() {
		return recursive_count;
	}
	public void setRecursive_count(int newRecursive_count) {
		recursive_count = newRecursive_count;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int newKind) {
		kind = newKind;
	}
	public Object getOwnerThread() {
		return ownerThread;
	}
	public void setOwnerThread(Object newOwnerThread) {
		ownerThread = newOwnerThread;
	}
	public Object getEvent() {
		return event;
	}
	public void setEvent(Object newEvent) {
		event = newEvent;
	}
	public ptw32_robust_node_t_ getRobustNode() {
		return robustNode;
	}
	public void setRobustNode(ptw32_robust_node_t_ newRobustNode) {
		robustNode = newRobustNode;
	}
}
