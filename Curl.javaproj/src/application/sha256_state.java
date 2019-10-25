package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Florin Petriuc, <petriuc.florin@gmail.com>
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
/* When OpenSSL is available we use the SHA256-function from OpenSSL */
/* When no other crypto library is available we use this code segment */
/* ===== start - public domain SHA256 implementation ===== */
/* This is based on SHA256 implementation in LibTomCrypt that was released into
 * public domain by Tom St Denis. */
public class sha256_state {
	private int length;
	private Object state;
	private long curlen;
	private Object buf;
	
	public sha256_state(int length, Object state, long curlen, Object buf) {
		setLength(length);
		setState(state);
		setCurlen(curlen);
		setBuf(buf);
	}
	public sha256_state() {
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int newLength) {
		length = newLength;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public long getCurlen() {
		return curlen;
	}
	public void setCurlen(long newCurlen) {
		curlen = newCurlen;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
