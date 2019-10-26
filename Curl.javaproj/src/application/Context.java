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
/* <DESC>
 * Get a web page, extract the title with libxml.
 * </DESC>

 Written by Lars Nilsson

 GNU C++ compile command line suggestion (edit paths accordingly):

 g++ -Wall -I/opt/curl/include -I/opt/libxml/include/libxml2 htmltitle.cpp \
 -o htmltitle -L/opt/curl/lib -L/opt/libxml/lib -lcurl -lxml2
*/
//
//  Case-insensitive string comparison
//
//
//  libxml callback context structure
//
public class Context {
	private boolean addTitle;
	private basic_string title;
	
	public Context(boolean addTitle, basic_string title) {
		setAddTitle(addTitle);
		setTitle(title);
	}
	public Context() {
	}
	
	//  Text handling helper function
	//
	public void handleCharacters(Object chars, int length) {
		boolean generatedAddTitle = this.getAddTitle();
		if (generatedAddTitle) {
			.UNRECOGNIZEDFUNCTIONNAME((byte)chars, length);
		} 
	}
	public boolean getAddTitle() {
		return addTitle;
	}
	public void setAddTitle(boolean newAddTitle) {
		addTitle = newAddTitle;
	}
	public basic_string getTitle() {
		return title;
	}
	public void setTitle(basic_string newTitle) {
		title = newTitle;
	}
}
