package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2012, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class libtest_trace_cfg {
	private int tracetime;
	private int nohex;
	
	public libtest_trace_cfg(int tracetime, int nohex) {
		setTracetime(tracetime);
		setNohex(nohex);
	}
	public libtest_trace_cfg() {
	}
	
	public int getTracetime() {
		return tracetime;
	}
	public void setTracetime(int newTracetime) {
		tracetime = newTracetime;
	}
	public int getNohex() {
		return nohex;
	}
	public void setNohex(int newNohex) {
		nohex = newNohex;
	}
}
