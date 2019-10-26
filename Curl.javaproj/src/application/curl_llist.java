package application;

public class curl_llist {
	private curl_llist_element head;
	private curl_llist_element tail;
	private Object dtor;
	private Object size;
	
	public curl_llist(curl_llist_element head, curl_llist_element tail, Object dtor, Object size) {
		setHead(head);
		setTail(tail);
		setDtor(dtor);
		setSize(size);
	}
	public curl_llist() {
	}
	
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
	/* this must be the last include file */
	/*
	 * @unittest: 1300
	 */
	public void Curl_llist_init(Object dtor) {
		this.setSize(0);
		this.setDtor(dtor);
		this.setHead(((Object)0));
		this.setTail(((Object)0/*
		 * Curl_llist_insert_next()
		 *
		 * Inserts a new list element after the given one 'e'. If the given existing
		 * entry is NULL and the list already has elements, the new one will be
		 * inserted first in the list.
		 *
		 * The 'ne' argument should be a pointer into the object to store.
		 *
		 * @unittest: 1300
		 */));
	}
	public void Curl_llist_destroy(Object user) {
		Object generatedSize = this.getSize();
		curl_llist_element generatedTail = this.getTail();
		if (list) {
			while (generatedSize > 0) {
				ModernizedCProgram.Curl_llist_remove(list, generatedTail, user);
			}
		} 
	}
	public Object Curl_llist_count() {
		Object generatedSize = this.getSize();
		return generatedSize;
	}
	public curl_llist_element getHead() {
		return head;
	}
	public void setHead(curl_llist_element newHead) {
		head = newHead;
	}
	public curl_llist_element getTail() {
		return tail;
	}
	public void setTail(curl_llist_element newTail) {
		tail = newTail;
	}
	public Object getDtor() {
		return dtor;
	}
	public void setDtor(Object newDtor) {
		dtor = newDtor;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
/* HEADER_CURL_LLIST_H */
