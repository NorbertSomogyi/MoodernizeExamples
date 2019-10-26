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
/*
 * Note:
 *
 * Since the URL parser by default only accepts schemes that *this instance*
 * of libcurl supports, make sure that the test1560 file lists all the schemes
 * that this test will assume to be present!
 */
/* LAST include file */
public class part {
	private Object part;
	private Object name;
	
	public part(Object part, Object name) {
		setPart(part);
		setName(name);
	}
	public part() {
	}
	
	public Object getPart() {
		return part;
	}
	public void setPart(Object newPart) {
		part = newPart;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
