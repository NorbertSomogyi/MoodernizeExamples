package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class Curl_message {
	private curl_llist_element list;
	private CURLMsg extmsg;
	
	public Curl_message(curl_llist_element list, CURLMsg extmsg) {
		setList(list);
		setExtmsg(extmsg);
	}
	public Curl_message() {
	}
	
	public curl_llist_element getList() {
		return list;
	}
	public void setList(curl_llist_element newList) {
		list = newList;
	}
	public CURLMsg getExtmsg() {
		return extmsg;
	}
	public void setExtmsg(CURLMsg newExtmsg) {
		extmsg = newExtmsg;
	}
}
