package application;

public class ptw32_cleanup_t {
	private Object routine;
	private Object arg;
	private ptw32_cleanup_t prev;
	
	public ptw32_cleanup_t(Object routine, Object arg, ptw32_cleanup_t prev) {
		setRoutine(routine);
		setArg(arg);
		setPrev(prev);
	}
	public ptw32_cleanup_t() {
	}
	
	/*
	 * cleanup.c
	 *
	 * Description:
	 * This translation unit implements routines associated
	 * with cleaning up threads.
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
	 */
	/*
	 * The functions ptw32_pop_cleanup and ptw32_push_cleanup
	 * are implemented here for applications written in C with no
	 * SEH or C++ destructor support. 
	 */
	public ptw32_cleanup_t ptw32_pop_cleanup(int execute) {
		ptw32_cleanup_t cleanup = new ptw32_cleanup_t();
		cleanup = (ptw32_cleanup_t)ModernizedCProgram.pthread_getspecific(ModernizedCProgram.ptw32_cleanupKey);
		Object generatedRoutine = cleanup.getRoutine();
		Object generatedArg = cleanup.getArg();
		ptw32_cleanup_t generatedPrev = cleanup.getPrev();
		if (cleanup != ((Object)0)) {
			if (execute && (generatedRoutine != ((Object)0))) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedArg);
			} 
			ModernizedCProgram.pthread_setspecific(ModernizedCProgram.ptw32_cleanupKey, (Object)generatedPrev);
		} 
		return (cleanup/* ptw32_pop_cleanup */);
	}
	/*
	      * ------------------------------------------------------
	      * DOCPUBLIC
	      *      This function pops the most recently pushed cleanup
	      *      handler. If execute is nonzero, then the cleanup handler
	      *      is executed if non-null.
	      *
	      * PARAMETERS
	      *      execute
	      *              if nonzero, execute the cleanup handler
	      *
	      *
	      * DESCRIPTION
	      *      This function pops the most recently pushed cleanup
	      *      handler. If execute is nonzero, then the cleanup handler
	      *      is executed if non-null.
	      *      NOTE: specify 'execute' as nonzero to avoid duplication
	      *                of common cleanup code.
	      *
	      * RESULTS
	      *              N/A
	      *
	      * ------------------------------------------------------
	      */
	public void ptw32_push_cleanup(Object routine, Object arg) {
		this.setRoutine(routine);
		this.setArg(arg);
		this.setPrev((ptw32_cleanup_t)ModernizedCProgram.pthread_getspecific(ModernizedCProgram.ptw32_cleanupKey));
		ModernizedCProgram.pthread_setspecific(ModernizedCProgram.ptw32_cleanupKey, (Object)cleanup/* ptw32_push_cleanup */);
	}
	/*
	      * ------------------------------------------------------
	      * DOCPUBLIC
	      *      This function pushes a new cleanup handler onto the thread's stack
	      *      of cleanup handlers. Each cleanup handler pushed onto the stack is
	      *      popped and invoked with the argument 'arg' when
	      *              a) the thread exits by calling 'pthread_exit',
	      *              b) when the thread acts on a cancellation request,
	      *              c) or when the thread calls pthread_cleanup_pop with a nonzero
	      *                 'execute' argument
	      *
	      * PARAMETERS
	      *      cleanup
	      *              a pointer to an instance of pthread_cleanup_t,
	      *
	      *      routine
	      *              pointer to a cleanup handler,
	      *
	      *      arg
	      *              parameter to be passed to the cleanup handler
	      *
	      *
	      * DESCRIPTION
	      *      This function pushes a new cleanup handler onto the thread's stack
	      *      of cleanup handlers. Each cleanup handler pushed onto the stack is
	      *      popped and invoked with the argument 'arg' when
	      *              a) the thread exits by calling 'pthread_exit',
	      *              b) when the thread acts on a cancellation request,
	      *              c) or when the thrad calls pthread_cleanup_pop with a nonzero
	      *                 'execute' argument
	      *      NOTE: pthread_push_cleanup, ptw32_pop_cleanup must be paired
	      *                in the same lexical scope.
	      *
	      * RESULTS
	      *              pthread_cleanup_t *
	      *                              pointer to the previous cleanup
	      *
	      * ------------------------------------------------------
	      */
	public Object getRoutine() {
		return routine;
	}
	public void setRoutine(Object newRoutine) {
		routine = newRoutine;
	}
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
	public ptw32_cleanup_t getPrev() {
		return prev;
	}
	public void setPrev(ptw32_cleanup_t newPrev) {
		prev = newPrev;
	}
}
/* Disable MSVC 'anachronism used' warning */
/*
         * WIN32 SEH version of cancel cleanup.
         */
/* __CLEANUP_SEH */
/*
         * C implementation of PThreads cancel cleanup
         */
/* __CLEANUP_C */
/*
         * C++ version of cancel cleanup.
         * - John E. Bossom.
         */
/*
           * PThreadCleanup
           *
           * Purpose
           *      This class is a C++ helper class that is
           *      used to implement pthread_cleanup_push/
           *      pthread_cleanup_pop.
           *      The destructor of this class automatically
           *      pops the pushed cleanup routine regardless
           *      of how the code exits the scope
           *      (i.e. such as by an exception)
           */
