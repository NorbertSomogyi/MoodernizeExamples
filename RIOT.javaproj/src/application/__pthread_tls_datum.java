package application;

/*
 * Copyright (C) 2014 Hamburg University of Applied Sciences (HAW)
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup pthread
 * @{
 * @file
 * @brief       RIOT POSIX thread local storage
 * @author      Martin Landsmann <martin.landsmann@haw-hamburg.de>
 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
 * @}
 */
public class __pthread_tls_datum {
	private Object key;
	private __pthread_tls_datum next;
	private Object value;
	
	public __pthread_tls_datum(Object key, __pthread_tls_datum next, Object value) {
		setKey(key);
		setNext(next);
		setValue(value);
	}
	public __pthread_tls_datum() {
	}
	
	/**
	 * @brief        Find a thread-specific datum.
	 * @param[in]    tls    Pointer to the list of the thread-specific datums.
	 * @param[in]    key    The key to look up.
	 * @param[out]   prev   The datum before the result. `NULL` if the result is the first key. Spurious if the key was not found.
	 * @returns      The datum or `NULL`.
	 */
	public __pthread_tls_datum find_specific(Object key, __pthread_tls_datum prev) {
		tls_data_t specific = tls;
		prev = (null);
		Object generatedKey = specific.getKey();
		__pthread_tls_datum generatedNext = specific.getNext();
		while (specific) {
			if (generatedKey == key) {
				return specific;
			} 
			prev = specific;
			specific = generatedNext;
		}
		return 0/**
		 * @brief       Find or allocate a thread specific datum.
		 * @details     The `key` must be initialized.
		 *              The result will be the head of the thread-specific datums afterwards.
		 * @param[in]   key   The key to lookup.
		 * @returns     The datum. `NULL` on ENOMEM or if the caller is not a pthread.
		 */;
	}
	public __pthread_tls_datum get_specific(Object key) {
		pthread_t self_id = ModernizedCProgram.pthread_self();
		if (self_id == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR called pthread_self() returned 0 in \"%s\"!\n", __func__);
			return (null);
		} 
		__pthread_tls_datum __pthread_tls_datum = new __pthread_tls_datum();
		tls_data_t tls = __pthread_tls_datum.__pthread_get_tls_head(self_id);
		tls_data_t prev = new tls_data_t();
		tls_data_t specific = tls.find_specific(key, prev);
		__pthread_tls_datum generatedNext = specific.getNext();
		if (/* Did the datum already exist? */specific) {
			if (prev/* Move the datum to the front for a faster next lookup. */) {
				prev.setNext(generatedNext);
				specific.setNext(tls);
				tls = specific;
			} 
			return specific;
		} 
		specific = ModernizedCProgram.malloc(/*Error: sizeof expression not supported yet*/);
		if (specific) {
			specific.setKey(key);
			specific.setNext(tls);
			specific.setValue((null));
			tls = specific;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR out of memory in %s!\n", __func__);
		} 
		return specific;
	}
	public __pthread_tls_datum __pthread_get_tls_head(int self_id) {
		pthread_thread_t self = ModernizedCProgram.pthread_sched_threads[self_id - 1];
		Object generatedTls_head = self.getTls_head();
		return self ? generatedTls_head : (null);
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public __pthread_tls_datum getNext() {
		return next;
	}
	public void setNext(__pthread_tls_datum newNext) {
		next = newNext;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}
