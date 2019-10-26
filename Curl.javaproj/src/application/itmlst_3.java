package application;

/* File: curl_crtl_init.c
 *
 * This file makes sure that the DECC Unix settings are correct for
 * the mode the the program is run in.
 *
 * The CRTL has not been initialized at the time that these routines
 * are called, so many routines can not be called.
 *
 * This is a module that provides a LIB$INITIALIZE routine that
 * will turn on some CRTL features that are not enabled by default.
 *
 * The CRTL features can also be turned on via logical names, but that
 * impacts all programs and some aren't ready, willing, or able to handle
 * those settings.
 *
 * On VMS versions that are too old to use the feature setting API, this
 * module falls back to using logical names.
 *
 * Copyright 2013, John Malmberg
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT
 * OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 */
/* Unix headers */
/* VMS specific headers */
public class itmlst_3 {
	private int buflen;
	private int itmcode;
	private Object bufadr;
	private Integer retlen;
	
	public itmlst_3(int buflen, int itmcode, Object bufadr, Integer retlen) {
		setBuflen(buflen);
		setItmcode(itmcode);
		setBufadr(bufadr);
		setRetlen(retlen);
	}
	public itmlst_3() {
	}
	
	public int getBuflen() {
		return buflen;
	}
	public void setBuflen(int newBuflen) {
		buflen = newBuflen;
	}
	public int getItmcode() {
		return itmcode;
	}
	public void setItmcode(int newItmcode) {
		itmcode = newItmcode;
	}
	public Object getBufadr() {
		return bufadr;
	}
	public void setBufadr(Object newBufadr) {
		bufadr = newBufadr;
	}
	public Integer getRetlen() {
		return retlen;
	}
	public void setRetlen(Integer newRetlen) {
		retlen = newRetlen;
	}
}
