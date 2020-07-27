package application;

/*
 * Copyright (C) 2015-2017 Simon Brummer
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup     net_gnrc_tcp
 *
 * @{
 *
 * @file
 * @brief       Functions for allocating and freeing the receive buffer.
 *
 * @author      Simon Brummer <simon.brummer@posteo.de>
 */
/**
 * @brief Receive buffer entry.
 */
public class rcvbuf_entry {
	private Object used;
	private Object buffer;
	
	public rcvbuf_entry(Object used, Object buffer) {
		setUsed(used);
		setBuffer(buffer);
	}
	public rcvbuf_entry() {
	}
	
	public Object getUsed() {
		return used;
	}
	public void setUsed(Object newUsed) {
		used = newUsed;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
}
