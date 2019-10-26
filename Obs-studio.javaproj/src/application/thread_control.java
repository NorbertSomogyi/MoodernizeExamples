package application;

/* Simple POSIX threads program.
 *
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
 *
 * --------------------------------------------------------------------------
 *
 * Author: Eyal Lebedinsky eyal@eyal.emu.id.au
 * Written: Sep 1998.
 * Version Date: 12 Sep 1998
 *
 * Do we need to lock stdout or is it thread safe?
 *
 * Used:
 *	pthread_t
 *	pthread_attr_t
 *	pthread_create()
 *	pthread_join()
 *	pthread_mutex_t
 *	PTHREAD_MUTEX_INITIALIZER
 *	pthread_mutex_init() [not used now]
 *	pthread_mutex_destroy()
 *	pthread_mutex_lock()
 *	pthread_mutex_trylock()
 *	pthread_mutex_unlock()
 *
 * What this program does is establish a work queue (implemented using
 * four mutexes for each thread). It then schedules work (by storing
 * a number in 'todo') and releases the threads. When the work is done
 * the threads will block. The program then repeats the same thing once
 * more (just to test the logic) and when the work is done it destroyes
 * the threads.
 *
 * The 'work' we do is simply burning CPU cycles in a loop.
 * The 'todo' work queue is trivial - each threads pops one element
 * off it by incrementing it, the poped number is the 'work' to do.
 * When 'todo' reaches the limit (nwork) the queue is considered
 * empty.
 *
 * The number displayed at the end is the amount of work each thread
 * did, so we can see if the load was properly distributed.
 *
 * The program was written to test a threading setup (not seen here)
 * rather than to demonstrate correct usage of the pthread facilities.
 *
 * Note how each thread is given access to a thread control structure
 * (TC) which is used for communicating to/from the main program (e.g.
 * the threads knows its 'id' and also filles in the 'work' done).
*/
public class thread_control {
	private int id;
	private Object thread;
	private Object mutex_start;
	private Object mutex_started;
	private Object mutex_end;
	private Object mutex_ended;
	private long work;
	private int stat;
	
	public thread_control(int id, Object thread, Object mutex_start, Object mutex_started, Object mutex_end, Object mutex_ended, long work, int stat) {
		setId(id);
		setThread(thread);
		setMutex_start(mutex_start);
		setMutex_started(mutex_started);
		setMutex_end(mutex_end);
		setMutex_ended(mutex_ended);
		setWork(work);
		setStat(stat);
	}
	public thread_control() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getMutex_start() {
		return mutex_start;
	}
	public void setMutex_start(Object newMutex_start) {
		mutex_start = newMutex_start;
	}
	public Object getMutex_started() {
		return mutex_started;
	}
	public void setMutex_started(Object newMutex_started) {
		mutex_started = newMutex_started;
	}
	public Object getMutex_end() {
		return mutex_end;
	}
	public void setMutex_end(Object newMutex_end) {
		mutex_end = newMutex_end;
	}
	public Object getMutex_ended() {
		return mutex_ended;
	}
	public void setMutex_ended(Object newMutex_ended) {
		mutex_ended = newMutex_ended;
	}
	public long getWork() {
		return work;
	}
	public void setWork(long newWork) {
		work = newWork;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int newStat) {
		stat = newStat;
	}
}
