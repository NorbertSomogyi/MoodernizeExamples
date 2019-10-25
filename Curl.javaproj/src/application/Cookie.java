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
/* next in the chain */
public class Cookie {
	private Object next;
	private Object name;
	private Object value;
	private Object path;
	private Object spath;
	private Object domain;
	private Object expires;
	private Object expirestr;
	private  tailmatch;
	private Object version;
	private Object maxage;
	private  secure;
	private  livecookie;
	private  httponly;
	private int creationtime;
	private byte prefix;
	
	public Cookie(Object next, Object name, Object value, Object path, Object spath, Object domain, Object expires, Object expirestr,  tailmatch, Object version, Object maxage,  secure,  livecookie,  httponly, int creationtime, byte prefix) {
		setNext(next);
		setName(name);
		setValue(value);
		setPath(path);
		setSpath(spath);
		setDomain(domain);
		setExpires(expires);
		setExpirestr(expirestr);
		setTailmatch(tailmatch);
		setVersion(version);
		setMaxage(maxage);
		setSecure(secure);
		setLivecookie(livecookie);
		setHttponly(httponly);
		setCreationtime(creationtime);
		setPrefix(prefix);
	}
	public Cookie() {
	}
	
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getSpath() {
		return spath;
	}
	public void setSpath(Object newSpath) {
		spath = newSpath;
	}
	public Object getDomain() {
		return domain;
	}
	public void setDomain(Object newDomain) {
		domain = newDomain;
	}
	public Object getExpires() {
		return expires;
	}
	public void setExpires(Object newExpires) {
		expires = newExpires;
	}
	public Object getExpirestr() {
		return expirestr;
	}
	public void setExpirestr(Object newExpirestr) {
		expirestr = newExpirestr;
	}
	public  getTailmatch() {
		return tailmatch;
	}
	public void setTailmatch( newTailmatch) {
		tailmatch = newTailmatch;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getMaxage() {
		return maxage;
	}
	public void setMaxage(Object newMaxage) {
		maxage = newMaxage;
	}
	public  getSecure() {
		return secure;
	}
	public void setSecure( newSecure) {
		secure = newSecure;
	}
	public  getLivecookie() {
		return livecookie;
	}
	public void setLivecookie( newLivecookie) {
		livecookie = newLivecookie;
	}
	public  getHttponly() {
		return httponly;
	}
	public void setHttponly( newHttponly) {
		httponly = newHttponly;
	}
	public int getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(int newCreationtime) {
		creationtime = newCreationtime;
	}
	public byte getPrefix() {
		return prefix;
	}
	public void setPrefix(byte newPrefix) {
		prefix = newPrefix;
	}
}
