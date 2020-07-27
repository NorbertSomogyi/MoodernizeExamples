package application;

/*
 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @addtogroup  posix
 * @{
 */
/**
 * @file
 * @brief   libc header for scatter/gather I/O
 *
 * @author  Kaspar Schleiser <kaspar@schleiser.de>
 */
/**
 * @brief Structure for scatter/gather I/O.
 */
public class iovec {
	private Object iov_base;
	private Object iov_len;
	
	public iovec(Object iov_base, Object iov_len) {
		setIov_base(iov_base);
		setIov_len(iov_len);
	}
	public iovec() {
	}
	
	public Object getIov_base() {
		return iov_base;
	}
	public void setIov_base(Object newIov_base) {
		iov_base = newIov_base;
	}
	public Object getIov_len() {
		return iov_len;
	}
	public void setIov_len(Object newIov_len) {
		iov_len = newIov_len;
	}
}
