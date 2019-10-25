package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
public class curl_llist_element {
	private Object ptr;
	private Object prev;
	private Object next;
	
	public curl_llist_element(Object ptr, Object prev, Object next) {
		setPtr(ptr);
		setPrev(prev);
		setNext(next);
	}
	public curl_llist_element() {
	}
	
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
}
