package application;

public class sched_param {
	private int sched_priority;
	
	public sched_param(int sched_priority) {
		setSched_priority(sched_priority);
	}
	public sched_param() {
	}
	
	/*
	 * sched_getschedparam.c
	 * 
	 * Description:
	 * POSIX thread functions that deal with thread scheduling.
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
	public int pthread_getschedparam(Object thread, Integer policy) {
		int result;
		result = ModernizedCProgram.pthread_kill(thread, /* Validate the thread id. */0);
		if (0 != result) {
			return result/*
			   * Validate the policy and param args.
			   * Check that a policy constant wasn't passed rather than &policy.
			   */;
		} 
		if (policy <= (int).SCHED_MAX || ModernizedCProgram.param == ((Object)0)) {
			return 22;
		} 
		policy = /* Fill out the policy. */.SCHED_OTHER/*
		   * This function must return the priority value set by
		   * the most recent pthread_setschedparam() or pthread_create()
		   * for the target thread. It must not return the actual thread
		   * priority as altered by any system priority adjustments etc.
		   */;
		ModernizedCProgram.param.setSched_priority(((ptw32_thread_t)thread.getP()).getSched_priority());
		return 0;
	}
	/*
	 * pthread_attr_getschedparam.c
	 * 
	 * Description:
	 * POSIX thread functions that deal with thread scheduling.
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
	public int pthread_attr_getschedparam(Object attr) {
		if (ModernizedCProgram.ptw32_is_attr(attr) != 0 || ModernizedCProgram.param == ((Object)0)) {
			return 22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.param, (attr).getParam(), /*Error: sizeof expression not supported yet*/);
		return 0;
	}
	public int getSched_priority() {
		return sched_priority;
	}
	public void setSched_priority(int newSched_priority) {
		sched_priority = newSched_priority;
	}
}
