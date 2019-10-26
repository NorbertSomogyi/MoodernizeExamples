package application;

/*
 * ptw32_OLL_lock.c
 *
 * Description:
 * This translation unit implements extended reader/writer queue-based locks.
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
/*
 * About the OLL lock (Scalable Reader-Writer Lock):
 *
 * OLL locks are queue-based locks similar to the MCS queue lock, where the queue
 * nodes are local to the thread but where reader threads can enter the critical
 * section immediately without going through a central guard lock if there are
 * already readers holding the lock.
 *
 * Covered by United States Patent Application 20100241774 (Oracle)
 */
/*
 * C-SNZI support
 */
public class ptw32_oll_snziRoot_t_ {
	private ptw32_oll_counter_t_ counter;
	
	public ptw32_oll_snziRoot_t_(ptw32_oll_counter_t_ counter) {
		setCounter(counter);
	}
	public ptw32_oll_snziRoot_t_() {
	}
	
	public ptw32_oll_counter_t_ getCounter() {
		return counter;
	}
	public void setCounter(ptw32_oll_counter_t_ newCounter) {
		counter = newCounter;
	}
}
/*
   * "counter" must be at same offset in both
   * ptw32_oll_snziNode_t and ptw32_oll_snziRoot_t
   */
