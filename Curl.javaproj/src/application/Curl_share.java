package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* SalfordC says "A structure member may not be volatile". Hence:
 */
/* this struct is libcurl-private, don't export details */
public class Curl_share {
	private int specifier;
	private Object dirty;
	private Object lockfunc;
	private Object unlockfunc;
	private Object clientdata;
	private conncache conn_cache;
	private curl_hash hostcache;
	private Object cookies;
	private Object sslsession;
	private Object max_ssl_sessions;
	private long sessionage;
	
	public Curl_share(int specifier, Object dirty, Object lockfunc, Object unlockfunc, Object clientdata, conncache conn_cache, curl_hash hostcache, Object cookies, Object sslsession, Object max_ssl_sessions, long sessionage) {
		setSpecifier(specifier);
		setDirty(dirty);
		setLockfunc(lockfunc);
		setUnlockfunc(unlockfunc);
		setClientdata(clientdata);
		setConn_cache(conn_cache);
		setHostcache(hostcache);
		setCookies(cookies);
		setSslsession(sslsession);
		setMax_ssl_sessions(max_ssl_sessions);
		setSessionage(sessionage);
	}
	public Curl_share() {
	}
	
	public int getSpecifier() {
		return specifier;
	}
	public void setSpecifier(int newSpecifier) {
		specifier = newSpecifier;
	}
	public Object getDirty() {
		return dirty;
	}
	public void setDirty(Object newDirty) {
		dirty = newDirty;
	}
	public Object getLockfunc() {
		return lockfunc;
	}
	public void setLockfunc(Object newLockfunc) {
		lockfunc = newLockfunc;
	}
	public Object getUnlockfunc() {
		return unlockfunc;
	}
	public void setUnlockfunc(Object newUnlockfunc) {
		unlockfunc = newUnlockfunc;
	}
	public Object getClientdata() {
		return clientdata;
	}
	public void setClientdata(Object newClientdata) {
		clientdata = newClientdata;
	}
	public conncache getConn_cache() {
		return conn_cache;
	}
	public void setConn_cache(conncache newConn_cache) {
		conn_cache = newConn_cache;
	}
	public curl_hash getHostcache() {
		return hostcache;
	}
	public void setHostcache(curl_hash newHostcache) {
		hostcache = newHostcache;
	}
	public Object getCookies() {
		return cookies;
	}
	public void setCookies(Object newCookies) {
		cookies = newCookies;
	}
	public Object getSslsession() {
		return sslsession;
	}
	public void setSslsession(Object newSslsession) {
		sslsession = newSslsession;
	}
	public Object getMax_ssl_sessions() {
		return max_ssl_sessions;
	}
	public void setMax_ssl_sessions(Object newMax_ssl_sessions) {
		max_ssl_sessions = newMax_ssl_sessions;
	}
	public long getSessionage() {
		return sessionage;
	}
	public void setSessionage(long newSessionage) {
		sessionage = newSessionage;
	}
}
