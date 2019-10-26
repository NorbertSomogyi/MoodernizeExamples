package application;

public class ThreadKeyAssoc {
	private ptw32_thread_t_ thread;
	private Object key;
	private ThreadKeyAssoc nextKey;
	private ThreadKeyAssoc nextThread;
	private ThreadKeyAssoc prevKey;
	private ThreadKeyAssoc prevThread;
	
	public ThreadKeyAssoc(ptw32_thread_t_ thread, Object key, ThreadKeyAssoc nextKey, ThreadKeyAssoc nextThread, ThreadKeyAssoc prevKey, ThreadKeyAssoc prevThread) {
		setThread(thread);
		setKey(key);
		setNextKey(nextKey);
		setNextThread(nextThread);
		setPrevKey(prevKey);
		setPrevThread(prevThread);
	}
	public ThreadKeyAssoc() {
	}
	
	/*
	 * ptw32_tkAssocDestroy.c
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
	public void ptw32_tkAssocDestroy() {
		ThreadKeyAssoc generatedPrevKey = this.getPrevKey();
		ThreadKeyAssoc generatedNextKey = this.getNextKey();
		ptw32_thread_t_ generatedThread = this.getThread();
		Object generatedKeys = generatedThread.getKeys();
		Object generatedNextAssoc = generatedThread.getNextAssoc();
		ThreadKeyAssoc generatedPrevThread = this.getPrevThread();
		ThreadKeyAssoc generatedNextThread = this.getNextThread();
		Object generatedKey = this.getKey();
		if (assoc != ((Object)/*
		   * Both key->keyLock and thread->threadLock are locked before
		   * entry to this routine.
		   */0)) {
			ThreadKeyAssoc prev = new ThreadKeyAssoc();
			ThreadKeyAssoc next = new ThreadKeyAssoc();
			prev = generatedPrevKey;
			next = generatedNextKey;
			if (prev != ((Object)0)) {
				prev.setNextKey(next);
			} 
			if (next != ((Object)0)) {
				next.setPrevKey(prev);
			} 
			if (generatedKeys == assoc) {
				generatedThread.setKeys(/* We're at the head of the thread's keys chain */next);
			} 
			if (generatedNextAssoc == assoc/*
				   * Thread is exiting and we're deleting the assoc to be processed next.
				   * Hand thread the assoc after this one.
				   */) {
				generatedThread.setNextAssoc(next);
			} 
			prev = generatedPrevThread;
			next = generatedNextThread;
			if (prev != ((Object)0)) {
				prev.setNextThread(next);
			} 
			if (next != ((Object)0)) {
				next.setPrevThread(prev);
			} 
			if (generatedKey.getThreads() == assoc) {
				generatedKey.setThreads(/* We're at the head of the key's threads chain */next);
			} 
			.free(assoc/* ptw32_tkAssocDestroy */);
		} 
	}
	/*
	      * -------------------------------------------------------------------
	      * This routine releases all resources for the given ThreadKeyAssoc
	      * once it is no longer being referenced
	      * ie) either the key or thread has stopped referencing it.
	      *
	      * Parameters:
	      *              assoc
	      *                      an instance of ThreadKeyAssoc.
	      * Returns:
	      *      N/A
	      * -------------------------------------------------------------------
	      */
	public ptw32_thread_t_ getThread() {
		return thread;
	}
	public void setThread(ptw32_thread_t_ newThread) {
		thread = newThread;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public ThreadKeyAssoc getNextKey() {
		return nextKey;
	}
	public void setNextKey(ThreadKeyAssoc newNextKey) {
		nextKey = newNextKey;
	}
	public ThreadKeyAssoc getNextThread() {
		return nextThread;
	}
	public void setNextThread(ThreadKeyAssoc newNextThread) {
		nextThread = newNextThread;
	}
	public ThreadKeyAssoc getPrevKey() {
		return prevKey;
	}
	public void setPrevKey(ThreadKeyAssoc newPrevKey) {
		prevKey = newPrevKey;
	}
	public ThreadKeyAssoc getPrevThread() {
		return prevThread;
	}
	public void setPrevThread(ThreadKeyAssoc newPrevThread) {
		prevThread = newPrevThread;
	}
}
/*
   * Purpose:
   *      This structure creates an association between a thread and a key.
   *      It is used to implement the implicit invocation of a user defined
   *      destroy routine for thread specific data registered by a user upon
   *      exiting a thread.
   *
   *      Graphically, the arrangement is as follows, where:
   *
   *         K - Key with destructor
   *            (head of chain is key->threads)
   *         T - Thread that has called pthread_setspecific(Kn)
   *            (head of chain is thread->keys)
   *         A - Association. Each association is a node at the
   *             intersection of two doubly-linked lists.
   *
   *                 T1    T2    T3
   *                 |     |     |
   *                 |     |     |
   *         K1 -----+-----A-----A----->
   *                 |     |     |
   *                 |     |     |
   *         K2 -----A-----A-----+----->
   *                 |     |     |
   *                 |     |     |
   *         K3 -----A-----+-----A----->
   *                 |     |     |
   *                 |     |     |
   *                 V     V     V
   *
   *      Access to the association is guarded by two locks: the key's
   *      general lock (guarding the row) and the thread's general
   *      lock (guarding the column). This avoids the need for a
   *      dedicated lock for each association, which not only consumes
   *      more handles but requires that the lock resources persist
   *      until both the key is deleted and the thread has called the
   *      destructor. The two-lock arrangement allows those resources
   *      to be freed as soon as either thread or key is concluded.
   *
   *      To avoid deadlock, whenever both locks are required both the
   *      key and thread locks are acquired consistently in the order
   *      "key lock then thread lock". An exception to this exists
   *      when a thread calls the destructors, however, this is done
   *      carefully (but inelegantly) to avoid deadlock.
   *
   *      An association is created when a thread first calls
   *      pthread_setspecific() on a key that has a specified
   *      destructor.
   *
   *      An association is destroyed either immediately after the
   *      thread calls the key destructor function on thread exit, or
   *      when the key is deleted.
   *
   * Attributes:
   *      thread
   *              reference to the thread that owns the
   *              association. This is actually the pointer to the
   *              thread struct itself. Since the association is
   *              destroyed before the thread exits, this can never
   *              point to a different logical thread to the one that
   *              created the assoc, i.e. after thread struct reuse.
   *
   *      key
   *              reference to the key that owns the association.
   *
   *      nextKey
   *              The pthread_t->keys attribute is the head of a
   *              chain of associations that runs through the nextKey
   *              link. This chain provides the 1 to many relationship
   *              between a pthread_t and all pthread_key_t on which
   *              it called pthread_setspecific.
   *
   *      prevKey
   *              Similarly.
   *
   *      nextThread
   *              The pthread_key_t->threads attribute is the head of
   *              a chain of associations that runs through the
   *              nextThreads link. This chain provides the 1 to many
   *              relationship between a pthread_key_t and all the 
   *              PThreads that have called pthread_setspecific for
   *              this pthread_key_t.
   *
   *      prevThread
   *              Similarly.
   *
   * Notes:
   *      1)      As soon as either the key or the thread is no longer
   *              referencing the association, it can be destroyed. The
   *              association will be removed from both chains.
   *
   *      2)      Under WIN32, an association is only created by
   *              pthread_setspecific if the user provided a
   *              destroyRoutine when they created the key.
   *
   *
   */
