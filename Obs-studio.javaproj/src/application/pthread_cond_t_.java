package application;

public class pthread_cond_t_ {
	private long nWaitersBlocked;
	private long nWaitersGone;
	private long nWaitersToUnblock;
	private Object semBlockQueue;
	private Object semBlockLock;
	private Object mtxUnblockLock;
	private Object next;
	private Object prev;
	
	public pthread_cond_t_(long nWaitersBlocked, long nWaitersGone, long nWaitersToUnblock, Object semBlockQueue, Object semBlockLock, Object mtxUnblockLock, Object next, Object prev) {
		setNWaitersBlocked(nWaitersBlocked);
		setNWaitersGone(nWaitersGone);
		setNWaitersToUnblock(nWaitersToUnblock);
		setSemBlockQueue(semBlockQueue);
		setSemBlockLock(semBlockLock);
		setMtxUnblockLock(mtxUnblockLock);
		setNext(next);
		setPrev(prev);
	}
	public pthread_cond_t_() {
	}
	
	public long getNWaitersBlocked() {
		return nWaitersBlocked;
	}
	public void setNWaitersBlocked(long newNWaitersBlocked) {
		nWaitersBlocked = newNWaitersBlocked;
	}
	public long getNWaitersGone() {
		return nWaitersGone;
	}
	public void setNWaitersGone(long newNWaitersGone) {
		nWaitersGone = newNWaitersGone;
	}
	public long getNWaitersToUnblock() {
		return nWaitersToUnblock;
	}
	public void setNWaitersToUnblock(long newNWaitersToUnblock) {
		nWaitersToUnblock = newNWaitersToUnblock;
	}
	public Object getSemBlockQueue() {
		return semBlockQueue;
	}
	public void setSemBlockQueue(Object newSemBlockQueue) {
		semBlockQueue = newSemBlockQueue;
	}
	public Object getSemBlockLock() {
		return semBlockLock;
	}
	public void setSemBlockLock(Object newSemBlockLock) {
		semBlockLock = newSemBlockLock;
	}
	public Object getMtxUnblockLock() {
		return mtxUnblockLock;
	}
	public void setMtxUnblockLock(Object newMtxUnblockLock) {
		mtxUnblockLock = newMtxUnblockLock;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
}
