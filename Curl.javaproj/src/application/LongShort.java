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
public class LongShort {
	private Object letter;
	private Object lname;
	private  desc;
	
	public LongShort(Object letter, Object lname,  desc) {
		setLetter(letter);
		setLname(lname);
		setDesc(desc);
	}
	public LongShort() {
	}
	
	public Object getLetter() {
		return letter;
	}
	public void setLetter(Object newLetter) {
		letter = newLetter;
	}
	public Object getLname() {
		return lname;
	}
	public void setLname(Object newLname) {
		lname = newLname;
	}
	public  getDesc() {
		return desc;
	}
	public void setDesc( newDesc) {
		desc = newDesc;
	}
}
/* 'letter' strings with more than one character have *no* short option to
     mention. */
