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
 * Curl_addrinfo is our internal struct definition that we use to allow
 * consistent internal handling of this data. We use this even when the
 * system provides an addrinfo structure definition. And we use this for
 * all sorts of IPv4 and IPV6 builds.
 */
public class Curl_addrinfo {
	private int ai_flags;
	private int ai_family;
	private int ai_socktype;
	private int ai_protocol;
	private Object ai_addrlen;
	private Object ai_canonname;
	private Object ai_addr;
	private Object ai_next;
	
	public Curl_addrinfo(int ai_flags, int ai_family, int ai_socktype, int ai_protocol, Object ai_addrlen, Object ai_canonname, Object ai_addr, Object ai_next) {
		setAi_flags(ai_flags);
		setAi_family(ai_family);
		setAi_socktype(ai_socktype);
		setAi_protocol(ai_protocol);
		setAi_addrlen(ai_addrlen);
		setAi_canonname(ai_canonname);
		setAi_addr(ai_addr);
		setAi_next(ai_next);
	}
	public Curl_addrinfo() {
	}
	
	public int getAi_flags() {
		return ai_flags;
	}
	public void setAi_flags(int newAi_flags) {
		ai_flags = newAi_flags;
	}
	public int getAi_family() {
		return ai_family;
	}
	public void setAi_family(int newAi_family) {
		ai_family = newAi_family;
	}
	public int getAi_socktype() {
		return ai_socktype;
	}
	public void setAi_socktype(int newAi_socktype) {
		ai_socktype = newAi_socktype;
	}
	public int getAi_protocol() {
		return ai_protocol;
	}
	public void setAi_protocol(int newAi_protocol) {
		ai_protocol = newAi_protocol;
	}
	public Object getAi_addrlen() {
		return ai_addrlen;
	}
	public void setAi_addrlen(Object newAi_addrlen) {
		ai_addrlen = newAi_addrlen;
	}
	public Object getAi_canonname() {
		return ai_canonname;
	}
	public void setAi_canonname(Object newAi_canonname) {
		ai_canonname = newAi_canonname;
	}
	public Object getAi_addr() {
		return ai_addr;
	}
	public void setAi_addr(Object newAi_addr) {
		ai_addr = newAi_addr;
	}
	public Object getAi_next() {
		return ai_next;
	}
	public void setAi_next(Object newAi_next) {
		ai_next = newAi_next;
	}
}
