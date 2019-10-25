package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2016, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class Curl_sec_client_mech {
	private Object name;
	private Object size;
	private Object init;
	private Object auth;
	private Object end;
	private Object check_prot;
	private Object overhead;
	private Object encode;
	private Object decode;
	
	public Curl_sec_client_mech(Object name, Object size, Object init, Object auth, Object end, Object check_prot, Object overhead, Object encode, Object decode) {
		setName(name);
		setSize(size);
		setInit(init);
		setAuth(auth);
		setEnd(end);
		setCheck_prot(check_prot);
		setOverhead(overhead);
		setEncode(encode);
		setDecode(decode);
	}
	public Curl_sec_client_mech() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getAuth() {
		return auth;
	}
	public void setAuth(Object newAuth) {
		auth = newAuth;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public Object getCheck_prot() {
		return check_prot;
	}
	public void setCheck_prot(Object newCheck_prot) {
		check_prot = newCheck_prot;
	}
	public Object getOverhead() {
		return overhead;
	}
	public void setOverhead(Object newOverhead) {
		overhead = newOverhead;
	}
	public Object getEncode() {
		return encode;
	}
	public void setEncode(Object newEncode) {
		encode = newEncode;
	}
	public Object getDecode() {
		return decode;
	}
	public void setDecode(Object newDecode) {
		decode = newDecode;
	}
}
