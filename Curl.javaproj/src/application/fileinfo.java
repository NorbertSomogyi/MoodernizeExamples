package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 2010 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class fileinfo {
	private curl_fileinfo info;
	private curl_llist_element list;
	
	public fileinfo(curl_fileinfo info, curl_llist_element list) {
		setInfo(info);
		setList(list);
	}
	public fileinfo() {
	}
	
	public curl_fileinfo getInfo() {
		return info;
	}
	public void setInfo(curl_fileinfo newInfo) {
		info = newInfo;
	}
	public curl_llist_element getList() {
		return list;
	}
	public void setList(curl_llist_element newList) {
		list = newList;
	}
}
