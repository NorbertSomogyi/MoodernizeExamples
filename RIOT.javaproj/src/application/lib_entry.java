package application;

/*
 * Copyright (C) 2014 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup     nhdp
 * @{
 *
 * @file
 * @brief       Local Information Base interface for NHDP
 *
 * @author      Fabian Nack <nack@inf.fu-berlin.de>
 */
/**
 * @brief   Local Interface Set entry (local interface tuple)
 */
/**< Pointer to next list entry */
public class lib_entry {
	private Object if_pid;
	private nhdp_addr_entry if_addr_list_head;
	private lib_entry next;
	
	public lib_entry(Object if_pid, nhdp_addr_entry if_addr_list_head, lib_entry next) {
		setIf_pid(if_pid);
		setIf_addr_list_head(if_addr_list_head);
		setNext(next);
	}
	public lib_entry() {
	}
	
	public Object getIf_pid() {
		return if_pid;
	}
	public void setIf_pid(Object newIf_pid) {
		if_pid = newIf_pid;
	}
	public nhdp_addr_entry getIf_addr_list_head() {
		return if_addr_list_head;
	}
	public void setIf_addr_list_head(nhdp_addr_entry newIf_addr_list_head) {
		if_addr_list_head = newIf_addr_list_head;
	}
	public lib_entry getNext() {
		return next;
	}
	public void setNext(lib_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief                   Add an interface to the Local Information Base
 *
 * This function can also be used to add an additional address to an existing LIB tuple.
 *
 * @param[in] if_pid        PID of the interface
 * @param[in] addr          The (additional) NHDP address to register for the interface
 *
 * @return                  0 on success
 * @return                  -1 on error
 */
