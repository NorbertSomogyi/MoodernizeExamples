package application;

/*
 * Copyright (C) 2014 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup pthread
 * @{
 * @file
 * @brief   Synchronization barriers.
 * @note    Do not include this header file directly, but pthread.h.
 */
/**
 * @def     PTHREAD_PROCESS_SHARED
 * @brief   Share the structure with child processes (default).
 * @note    RIOT is a single-process OS.
 *          Setting the value of `pshared` does not change anything.
 */
/**
 * @def     PTHREAD_PROCESS_PRIVATE
 * @brief   Don't share the structure with child processes.
 * @note    RIOT is a single-process OS.
 *          Setting the value of `pshared` does not change anything.
 */
/**
 * @brief   Internal structure to store the list of waiting threads.
 */
/**< The next waiting thread. */
/**< The first waiting thread. */
public class pthread_barrier_waiting_node {
	private pthread_barrier_waiting_node next;
	private Object pid;
	private Object cont;
	
	public pthread_barrier_waiting_node(pthread_barrier_waiting_node next, Object pid, Object cont) {
		setNext(next);
		setPid(pid);
		setCont(cont);
	}
	public pthread_barrier_waiting_node() {
	}
	
	public pthread_barrier_waiting_node getNext() {
		return next;
	}
	public void setNext(pthread_barrier_waiting_node newNext) {
		next = newNext;
	}
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public Object getCont() {
		return cont;
	}
	public void setCont(Object newCont) {
		cont = newCont;
	}
}
