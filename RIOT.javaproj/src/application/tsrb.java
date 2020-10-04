package application;

/*
 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup    sys_tsrb Thread safe ringbuffer
 * @ingroup     sys
 * @brief       Thread-safe ringbuffer implementation
 * @{
 *
 * @note        This ringbuffer implementation can be used without locking if
 *              there's only one producer and one consumer.
 *
 * @attention   Buffer size must be a power of two!
 *
 * @file
 * @brief       Thread-safe ringbuffer interface definition
 *
 * @author      Kaspar Schleiser <kaspar@schleiser.de>
 */
/**
 * @brief     thread-safe ringbuffer struct
 */
public class tsrb {
	private Object[] buf;
	private int size;
	private Object reads;
	private Object writes;
	
	public tsrb(Object[] buf, int size, Object reads, Object writes) {
		setBuf(buf);
		setSize(size);
		setReads(reads);
		setWrites(writes);
	}
	public tsrb() {
	}
	
	/*
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup sys
	 * @{
	 * @file
	 * @brief       thread-safe ringbuffer implementation
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */
	public void _push(Object c) {
		Object[] generatedBuf = this.getBuf();
		Object generatedWrites = this.getWrites();
		int generatedSize = this.getSize();
		generatedBuf[generatedWrites++ & (generatedSize - 1)] = c;
	}
	public Object _pop() {
		Object[] generatedBuf = this.getBuf();
		Object generatedReads = this.getReads();
		int generatedSize = this.getSize();
		return generatedBuf[generatedReads++ & (generatedSize - 1)];
	}
	public int tsrb_get_one() {
		if (!ModernizedCProgram.tsrb_empty(rb)) {
			return rb._pop();
		} else {
				return -1;
		} 
	}
	public int tsrb_get(Object dst, Object n) {
		size_t tmp = n;
		while (tmp && !ModernizedCProgram.tsrb_empty(rb)) {
			dst++ = rb._pop();
			tmp--;
		}
		return (n - tmp);
	}
	public int tsrb_drop(Object n) {
		size_t tmp = n;
		while (tmp && !ModernizedCProgram.tsrb_empty(rb)) {
			rb._pop();
			tmp--;
		}
		return (n - tmp);
	}
	public int tsrb_add_one(Object c) {
		if (!ModernizedCProgram.tsrb_full(rb)) {
			rb._push(c);
			return 0;
		} else {
				return -1;
		} 
	}
	public int tsrb_add(Object src, Object n) {
		size_t tmp = n;
		while (tmp && !ModernizedCProgram.tsrb_full(rb)) {
			rb._push(src++);
			tmp--;
		}
		return (n - tmp);
	}
	/**
	 * @brief        Initialize a tsrb.
	 * @param[out]   rb        Datum to initialize.
	 * @param[in]    buffer    Buffer to use by tsrb.
	 * @param[in]    bufsize   `sizeof (buffer)`, must be power of 2.
	 */
	public void tsrb_init(Object buffer, int bufsize) {
		(((bufsize != 0) && ((bufsize & (~bufsize + 1)) == bufsize)) ? null : /*Error: Function owner not recognized*/_assert("(bufsize != 0) && ((bufsize & (~bufsize + 1)) == bufsize)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\tsrb.h", 63));
		this.setBuf(buffer);
		this.setSize(bufsize);
		this.setReads(0);
		this.setWrites(0/**
		 * @brief       Test if the tsrb is empty.
		 * @param[in]   rb  Ringbuffer to operate on
		 * @return      0   if not empty
		 * @return      1   otherwise
		 */);
	}
	/* make sure bufsize is a power of two.
	     * http://www.exploringbinary.com/ten-ways-to-check-if-an-integer-is-a-power-of-two-in-c/
	     */
	public Object[] getBuf() {
		return buf;
	}
	public void setBuf(Object[] newBuf) {
		buf = newBuf;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public Object getReads() {
		return reads;
	}
	public void setReads(Object newReads) {
		reads = newReads;
	}
	public Object getWrites() {
		return writes;
	}
	public void setWrites(Object newWrites) {
		writes = newWrites;
	}
}
