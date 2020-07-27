package application;

/*
 * Copyright (C) 2016 Martine Lenders <mlenders@inf.fu-berlin.de>
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup    net_gnrc_sock   GNRC-specific implementation of the sock API
 * @ingroup     net_gnrc
 * @brief       Provides an implementation of the @ref net_sock by the
 *              @ref net_gnrc
 *
 * @{
 *
 * @file
 * @brief   GNRC-specific types and function definitions
 *
 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
 */
/**< Size for gnrc_sock_reg_t::mbox_queue */
/**
 * @brief   sock @ref net_gnrc_netreg info
 * @internal
 */
public class gnrc_sock_reg {
	private Object entry;
	private Object mbox;
	private Object mbox_queue;
	
	public gnrc_sock_reg(Object entry, Object mbox, Object mbox_queue) {
		setEntry(entry);
		setMbox(mbox);
		setMbox_queue(mbox_queue);
	}
	public gnrc_sock_reg() {
	}
	
	public Object getEntry() {
		return entry;
	}
	public void setEntry(Object newEntry) {
		entry = newEntry;
	}
	public Object getMbox() {
		return mbox;
	}
	public void setMbox(Object newMbox) {
		mbox = newMbox;
	}
	public Object getMbox_queue() {
		return mbox_queue;
	}
	public void setMbox_queue(Object newMbox_queue) {
		mbox_queue = newMbox_queue;
	}
}
/**< list-like for internal storage */
