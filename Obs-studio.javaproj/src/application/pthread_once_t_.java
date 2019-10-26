package application;

/*
 * ====================
 * ====================
 * Once Key
 * ====================
 * ====================
 */
public class pthread_once_t_ {
	private int done;
	private Object lock;
	private int reserved1;
	private int reserved2;
	
	public pthread_once_t_(int done, Object lock, int reserved1, int reserved2) {
		setDone(done);
		setLock(lock);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public pthread_once_t_() {
	}
	
	/*
	 * pthread_once.c
	 *
	 * Description:
	 * This translation unit implements miscellaneous thread functions.
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
	public int pthread_once(Object init_routine) {
		if (once_control == ((Object)0) || init_routine == ((Object)0)) {
			return 22;
		} 
		Object generatedLock = this.getLock();
		int generatedDone = this.getDone();
		ptw32_cleanup_t ptw32_cleanup_t = new ptw32_cleanup_t();
		if ((long).PTW32_FALSE == (long)) {
			ptw32_mcs_local_node_t node = new ptw32_mcs_local_node_t();
			node.ptw32_mcs_lock_acquire((ptw32_mcs_lock_t)generatedLock);
			if (!generatedDone) {
				{ 
					ptw32_cleanup_t _cleanup = new ptw32_cleanup_t();
					_cleanup.ptw32_push_cleanup((ptw32_cleanup_callback_t)(ModernizedCProgram.ptw32_mcs_lock_release), (node));
					;
					.UNRECOGNIZEDFUNCTIONNAME();
					(Object)ptw32_cleanup_t.ptw32_pop_cleanup(0);
				}
				;
				this.setDone(.PTW32_TRUE);
			} 
			node.ptw32_mcs_lock_release();
		} 
		return 0/* pthread_once */;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int newDone) {
		done = newDone;
	}
	public Object getLock() {
		return lock;
	}
	public void setLock(Object newLock) {
		lock = newLock;
	}
	public int getReserved1() {
		return reserved1;
	}
	public void setReserved1(int newReserved1) {
		reserved1 = newReserved1;
	}
	public int getReserved2() {
		return reserved2;
	}
	public void setReserved2(int newReserved2) {
		reserved2 = newReserved2;
	}
}
