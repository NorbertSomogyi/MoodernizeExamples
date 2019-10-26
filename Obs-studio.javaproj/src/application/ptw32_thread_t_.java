package application;

public class ptw32_thread_t_ {
	private int seqNumber;
	private Object threadH;
	private Object ptHandle;
	private ptw32_thread_t_ prevReuse;
	private Object state;
	private Object threadLock;
	private Object stateLock;
	private Object cancelEvent;
	private Object exitStatus;
	private Object parms;
	private Object keys;
	private Object nextAssoc;
	private Object robustMxListLock;
	private ptw32_robust_node_t_ robustMxList;
	private int ptErrno;
	private int detachState;
	private int sched_priority;
	private int cancelState;
	private int cancelType;
	private int implicit;
	private Object thread;
	private Object align;
	
	public ptw32_thread_t_(int seqNumber, Object threadH, Object ptHandle, ptw32_thread_t_ prevReuse, Object state, Object threadLock, Object stateLock, Object cancelEvent, Object exitStatus, Object parms, Object keys, Object nextAssoc, Object robustMxListLock, ptw32_robust_node_t_ robustMxList, int ptErrno, int detachState, int sched_priority, int cancelState, int cancelType, int implicit, Object thread, Object align) {
		setSeqNumber(seqNumber);
		setThreadH(threadH);
		setPtHandle(ptHandle);
		setPrevReuse(prevReuse);
		setState(state);
		setThreadLock(threadLock);
		setStateLock(stateLock);
		setCancelEvent(cancelEvent);
		setExitStatus(exitStatus);
		setParms(parms);
		setKeys(keys);
		setNextAssoc(nextAssoc);
		setRobustMxListLock(robustMxListLock);
		setRobustMxList(robustMxList);
		setPtErrno(ptErrno);
		setDetachState(detachState);
		setSched_priority(sched_priority);
		setCancelState(cancelState);
		setCancelType(cancelType);
		setImplicit(implicit);
		setThread(thread);
		setAlign(align);
	}
	public ptw32_thread_t_() {
	}
	
	public void ptw32_robust_mutex_remove(Object mutex) {
		ptw32_robust_node_t list = new ptw32_robust_node_t();
		pthread_mutex_t mx = mutex;
		ptw32_robust_node_t robust = mx.getRobustNode();
		list = (((ptw32_thread_t)mx.getOwnerThread().getP()).getRobustMxList());
		mx.getOwnerThread().setP(otp);
		ptw32_robust_node_t_ generatedNext = robust.getNext();
		ptw32_robust_node_t_ generatedPrev = robust.getPrev();
		if (generatedNext != ((Object)0)) {
			generatedNext.setPrev(generatedPrev);
		} 
		if (generatedPrev != ((Object)0)) {
			generatedPrev.setNext(generatedNext);
		} 
		if (list == robust) {
			list = generatedNext;
		} 
	}
	/*
	 * ptw32_tkAssocCreate.c
	 *
	 * Description:
	 * This translation unit implements routines which are private to
	 * the implementation and may be used throughout it.
	 *
	 * --------------------------------------------------------------------------
	 *
	 *      Pthreads-win32 - POSIX Threads Library for Win32
	 *      Copyright(C) 1998 John E. Bossom
	 *      Copyright(C) 1999,2005 Pthreads-win32 contributors
	 * 
	 *      Contact Email: rpj@callisto.canberra.edu.au
	 * 
	 *      The current list of contributors is contained
	 *      in the file CONTRIBUTORS included with the source
	 *      code distribution. The list can also be seen at the
	 *      following World Wide Web location:
	 *      http://sources.redhat.com/pthreads-win32/contributors.html
	 * 
	 *      This library is free software; you can redistribute it and/or
	 *      modify it under the terms of the GNU Lesser General Public
	 *      License as published by the Free Software Foundation; either
	 *      version 2 of the License, or (at your option) any later version.
	 * 
	 *      This library is distributed in the hope that it will be useful,
	 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
	 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 *      Lesser General Public License for more details.
	 * 
	 *      You should have received a copy of the GNU Lesser General Public
	 *      License along with this library in the file COPYING.LIB;
	 *      if not, write to the Free Software Foundation, Inc.,
	 *      51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
	 */
	public int ptw32_tkAssocCreate(Object key) {
		ThreadKeyAssoc assoc = new ThreadKeyAssoc();
		/*
		   * Have to create an association and add it
		   * to both the key and the thread.
		   *
		   * Both key->keyLock and thread->threadLock are locked before
		   * entry to this routine.
		   */
		assoc = (ThreadKeyAssoc).calloc(1, );
		if (assoc == ((Object)0)) {
			return 12;
		} 
		assoc.setThread(sp);
		assoc.setKey(key/*
		   * Register assoc with key
		   */);
		assoc.setPrevThread(((Object)0));
		assoc.setNextThread((ThreadKeyAssoc)key.getThreads());
		ThreadKeyAssoc generatedNextThread = assoc.getNextThread();
		if (generatedNextThread != ((Object)0)) {
			generatedNextThread.setPrevThread(assoc);
		} 
		key.setThreads((Object)assoc/*
		   * Register assoc with thread
		   */);
		assoc.setPrevKey(((Object)0));
		Object generatedKeys = this.getKeys();
		assoc.setNextKey((ThreadKeyAssoc)generatedKeys);
		ThreadKeyAssoc generatedNextKey = assoc.getNextKey();
		if (generatedNextKey != ((Object)0)) {
			generatedNextKey.setPrevKey(assoc);
		} 
		this.setKeys((Object)assoc);
		return (false/* ptw32_tkAssocCreate */);
	}
	/*
	      * -------------------------------------------------------------------
	      * This routine creates an association that
	      * is unique for the given (thread,key) combination.The association 
	      * is referenced by both the thread and the key.
	      * This association allows us to determine what keys the
	      * current thread references and what threads a given key
	      * references.
	      * See the detailed description
	      * at the beginning of this file for further details.
	      *
	      * Notes:
	      *      1)      New associations are pushed to the beginning of the
	      *              chain so that the internal ptw32_selfThreadKey association
	      *              is always last, thus allowing selfThreadExit to
	      *              be implicitly called last by pthread_exit.
	      *      2)      
	      *
	      * Parameters:
	      *              thread
	      *                      current running thread.
	      *              key
	      *                      key on which to create an association.
	      * Returns:
	      *       0              - if successful,
	      *       ENOMEM         - not enough memory to create assoc or other object
	      *       EINVAL         - an internal error occurred
	      *       ENOSYS         - an internal error occurred
	      * -------------------------------------------------------------------
	      */
	public int getSeqNumber() {
		return seqNumber;
	}
	public void setSeqNumber(int newSeqNumber) {
		seqNumber = newSeqNumber;
	}
	public Object getThreadH() {
		return threadH;
	}
	public void setThreadH(Object newThreadH) {
		threadH = newThreadH;
	}
	public Object getPtHandle() {
		return ptHandle;
	}
	public void setPtHandle(Object newPtHandle) {
		ptHandle = newPtHandle;
	}
	public ptw32_thread_t_ getPrevReuse() {
		return prevReuse;
	}
	public void setPrevReuse(ptw32_thread_t_ newPrevReuse) {
		prevReuse = newPrevReuse;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public Object getThreadLock() {
		return threadLock;
	}
	public void setThreadLock(Object newThreadLock) {
		threadLock = newThreadLock;
	}
	public Object getStateLock() {
		return stateLock;
	}
	public void setStateLock(Object newStateLock) {
		stateLock = newStateLock;
	}
	public Object getCancelEvent() {
		return cancelEvent;
	}
	public void setCancelEvent(Object newCancelEvent) {
		cancelEvent = newCancelEvent;
	}
	public Object getExitStatus() {
		return exitStatus;
	}
	public void setExitStatus(Object newExitStatus) {
		exitStatus = newExitStatus;
	}
	public Object getParms() {
		return parms;
	}
	public void setParms(Object newParms) {
		parms = newParms;
	}
	public Object getKeys() {
		return keys;
	}
	public void setKeys(Object newKeys) {
		keys = newKeys;
	}
	public Object getNextAssoc() {
		return nextAssoc;
	}
	public void setNextAssoc(Object newNextAssoc) {
		nextAssoc = newNextAssoc;
	}
	public Object getRobustMxListLock() {
		return robustMxListLock;
	}
	public void setRobustMxListLock(Object newRobustMxListLock) {
		robustMxListLock = newRobustMxListLock;
	}
	public ptw32_robust_node_t_ getRobustMxList() {
		return robustMxList;
	}
	public void setRobustMxList(ptw32_robust_node_t_ newRobustMxList) {
		robustMxList = newRobustMxList;
	}
	public int getPtErrno() {
		return ptErrno;
	}
	public void setPtErrno(int newPtErrno) {
		ptErrno = newPtErrno;
	}
	public int getDetachState() {
		return detachState;
	}
	public void setDetachState(int newDetachState) {
		detachState = newDetachState;
	}
	public int getSched_priority() {
		return sched_priority;
	}
	public void setSched_priority(int newSched_priority) {
		sched_priority = newSched_priority;
	}
	public int getCancelState() {
		return cancelState;
	}
	public void setCancelState(int newCancelState) {
		cancelState = newCancelState;
	}
	public int getCancelType() {
		return cancelType;
	}
	public void setCancelType(int newCancelType) {
		cancelType = newCancelType;
	}
	public int getImplicit() {
		return implicit;
	}
	public void setImplicit(int newImplicit) {
		implicit = newImplicit;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getAlign() {
		return align;
	}
	public void setAlign(Object newAlign) {
		align = newAlign;
	}
}
