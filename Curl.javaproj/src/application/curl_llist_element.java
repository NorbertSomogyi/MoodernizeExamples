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
	private curl_llist_element prev;
	private curl_llist_element next;
	
	public curl_llist_element(Object ptr, curl_llist_element prev, curl_llist_element next) {
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
	public curl_llist_element getPrev() {
		return prev;
	}
	public void setPrev(curl_llist_element newPrev) {
		prev = newPrev;
	}
	public curl_llist_element getNext() {
		return next;
	}
	public void setNext(curl_llist_element newNext) {
		next = newNext;
	}
}
