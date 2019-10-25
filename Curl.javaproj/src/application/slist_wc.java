package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2015, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* linked-list structure with last node cache for easysrc */
/* linked-list structure with last node cache for easysrc */
public class slist_wc {
	private Object first;
	private Object last;
	
	public slist_wc(Object first, Object last) {
		setFirst(first);
		setLast(last);
	}
	public slist_wc() {
	}
	
	public Object getFirst() {
		return first;
	}
	public void setFirst(Object newFirst) {
		first = newFirst;
	}
	public Object getLast() {
		return last;
	}
	public void setLast(Object newLast) {
		last = newLast;
	}
}
/*
 * NAME curl_slist_free_all()
 *
 * DESCRIPTION
 *
 * free a previously built curl_slist_wc.
 */
