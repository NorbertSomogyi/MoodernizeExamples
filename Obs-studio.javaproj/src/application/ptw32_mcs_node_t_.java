package application;

/* due to an exception                  */
/* All handlers have been run and now   */
/* final cleanup can be done.           */
/* In reuse pool.                       */
/* ptr to tail of queue */
/* ptr to successor in queue */
public class ptw32_mcs_node_t_ {
	private ptw32_mcs_node_t_ lock;
	private ptw32_mcs_node_t_ next;
	private Object readyFlag;
	private Object nextFlag;
	
	public ptw32_mcs_node_t_(ptw32_mcs_node_t_ lock, ptw32_mcs_node_t_ next, Object readyFlag, Object nextFlag) {
		setLock(lock);
		setNext(next);
		setReadyFlag(readyFlag);
		setNextFlag(nextFlag);
	}
	public ptw32_mcs_node_t_() {
	}
	
	/* PTW32_BUILD_INLINED */
	public void ptw32_mcs_lock_acquire(Object lock) {
		ptw32_mcs_local_node_t pred = new ptw32_mcs_local_node_t();
		this.setLock(lock);
		this.setNextFlag(0);
		this.setReadyFlag(0);
		this.setNext(/* initially, no successor */0);
		pred = (ptw32_mcs_local_node_t);
		Object generatedNextFlag = pred.getNextFlag();
		Object generatedReadyFlag = this.getReadyFlag();
		if (0 != pred) {
			pred.setNext(/* the lock was not free. link behind predecessor. */node);
			ModernizedCProgram.ptw32_mcs_flag_set(generatedNextFlag);
			ModernizedCProgram.ptw32_mcs_flag_wait(generatedReadyFlag);
		} 
	}
	/* PTW32_BUILD_INLINED */
	public void ptw32_mcs_lock_release() {
		ptw32_mcs_node_t_ generatedLock = this.getLock();
		ptw32_mcs_lock_t lock = generatedLock;
		ptw32_mcs_local_node_t next = (ptw32_mcs_local_node_t);
		Object generatedNextFlag = this.getNextFlag();
		if (0 == next) {
			if (node == /* no known successor */(ptw32_mcs_local_node_t)) {
				return ;
			} 
			ModernizedCProgram.ptw32_mcs_flag_wait(generatedNextFlag);
			next = (ptw32_mcs_local_node_t);
		} 
		Object generatedReadyFlag = next.getReadyFlag();
		ModernizedCProgram.ptw32_mcs_flag_set(generatedReadyFlag);
	}
	/* PTW32_BUILD_INLINED */
	public int ptw32_mcs_lock_try_acquire(Object lock) {
		this.setLock(lock);
		this.setNextFlag(0);
		this.setReadyFlag(0);
		this.setNext(/* initially, no successor */0);
		return ((PVOID) == (PVOID)0) ? 0 : 16/*
		 * ptw32_mcs_node_transfer -- move an MCS lock local node, usually from thread
		 * space to, for example, global space so that another thread can release
		 * the lock on behalf of the current lock owner.
		 *
		 * Example: used in pthread_barrier_wait where we want the last thread out of
		 * the barrier to release the lock owned by the last thread to enter the barrier
		 * (the one that releases all threads but not necessarily the last to leave).
		 *
		 * Should only be called by the thread that has the lock.
		 */;
	}
	/* PTW32_BUILD_INLINED */
	public void ptw32_mcs_node_transfer(ptw32_mcs_node_t_ old_node) {
		ptw32_mcs_node_t_ generatedLock = old_node.getLock();
		this.setLock(generatedLock);
		this.setNextFlag(/* Not needed - used only in initial Acquire */0);
		this.setReadyFlag(/* Not needed - we were waiting on this */0);
		this.setNext(0);
		ptw32_mcs_node_t_ generatedNext = old_node.getNext();
		if ((ptw32_mcs_local_node_t) != old_node/*
		       * A successor has queued after us, so wait for them to link to us
		       */) {
			while (generatedNext == 0) {
				ModernizedCProgram.sched_yield();
			}
			this.setNext(generatedNext);
		} 
	}
	public ptw32_mcs_node_t_ getLock() {
		return lock;
	}
	public void setLock(ptw32_mcs_node_t_ newLock) {
		lock = newLock;
	}
	public ptw32_mcs_node_t_ getNext() {
		return next;
	}
	public void setNext(ptw32_mcs_node_t_ newNext) {
		next = newNext;
	}
	public Object getReadyFlag() {
		return readyFlag;
	}
	public void setReadyFlag(Object newReadyFlag) {
		readyFlag = newReadyFlag;
	}
	public Object getNextFlag() {
		return nextFlag;
	}
	public void setNextFlag(Object newNextFlag) {
		nextFlag = newNextFlag;
	}
}
