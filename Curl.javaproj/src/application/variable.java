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
/* use our own printf() functions */
/* keep this as LAST include */
/* must be the first */
/* must be the last */
public class variable {
	private Object name;
	private  id;
	
	public variable(Object name,  id) {
		setName(name);
		setId(id);
	}
	public variable() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public  getId() {
		return id;
	}
	public void setId( newId) {
		id = newId;
	}
}
