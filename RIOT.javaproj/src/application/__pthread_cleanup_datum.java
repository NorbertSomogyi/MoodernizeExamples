package application;

/*
 * Copyright (C) 2014 René Kijewski <rene.kijewski@fu-berlin.de>
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup pthread
 * @{
 * @file
 * @brief   Cleanup primitives for pthread threads.
 * @note    Do not include this header file directly, but pthread.h.
 */
/**
 * @brief   Internal structure for pthread_cleanup_push()
 */
/** Cleanup handler to call next. */
public class __pthread_cleanup_datum {
	private __pthread_cleanup_datum __next;
	private Object __routine;
	private Object __arg;
	
	public __pthread_cleanup_datum(__pthread_cleanup_datum __next, Object __routine, Object __arg) {
		set__next(__next);
		set__routine(__routine);
		set__arg(__arg);
	}
	public __pthread_cleanup_datum() {
	}
	
	public void __pthread_cleanup_push() {
		pthread_t self_id = ModernizedCProgram.pthread_self();
		if (self_id == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR called pthread_self() returned 0 in \"%s\"!\n", __func__);
			return /*Error: Unsupported expression*/;
		} 
		pthread_thread_t self = ModernizedCProgram.pthread_sched_threads[self_id - 1];
		Object generatedCleanup_top = self.getCleanup_top();
		this.set__next(generatedCleanup_top);
		self.setCleanup_top(datum);
	}
	public void __pthread_cleanup_pop(int execute) {
		pthread_t self_id = ModernizedCProgram.pthread_self();
		if (self_id == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR called pthread_self() returned 0 in \"%s\"!\n", __func__);
			return /*Error: Unsupported expression*/;
		} 
		pthread_thread_t self = ModernizedCProgram.pthread_sched_threads[self_id - 1];
		__pthread_cleanup_datum generated__next = this.get__next();
		self.setCleanup_top(generated__next);
		Object generated__arg = this.get__arg();
		if (execute != 0/* "The pthread_cleanup_pop() function shall remove the routine at the
		         *  top of the calling thread's cancellation cleanup stack and optionally
		         *  invoke it (if execute is non-zero)." */) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generated__arg);
		} 
	}
	public __pthread_cleanup_datum get__next() {
		return __next;
	}
	public void set__next(__pthread_cleanup_datum new__next) {
		__next = new__next;
	}
	public Object get__routine() {
		return __routine;
	}
	public void set__routine(Object new__routine) {
		__routine = new__routine;
	}
	public Object get__arg() {
		return __arg;
	}
	public void set__arg(Object new__arg) {
		__arg = new__arg;
	}
}
