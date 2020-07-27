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
	private CookieInfo cookies;
	private curl_ssl_session sslsession;
	private Object max_ssl_sessions;
	private long sessionage;
	
	public Curl_share(int specifier, Object dirty, Object lockfunc, Object unlockfunc, Object clientdata, conncache conn_cache, curl_hash hostcache, CookieInfo cookies, curl_ssl_session sslsession, Object max_ssl_sessions, long sessionage) {
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
	
	public Curl_share curl_share_init() {
		Curl_share share = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*/);
		int generatedSpecifier = share.getSpecifier();
		curl_hash generatedHostcache = share.getHostcache();
		if (share) {
			generatedSpecifier |=  (1 << CURL_LOCK_DATA_SHARE);
			if (generatedHostcache.Curl_mk_dnscache()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(share);
				return ((Object)0);
			} 
		} 
		return share;
	}
	public Object curl_share_setopt(Object option) {
		va_list param = new va_list();
		int type;
		 lockfunc = new ();
		 unlockfunc = new ();
		Object ptr;
		 res = CURLSHE_OK;
		Object generatedDirty = this.getDirty();
		if (generatedDirty) {
			return CURLSHE_IN_USE;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(param, option);
		int generatedSpecifier = this.getSpecifier();
		CookieInfo generatedCookies = this.getCookies();
		conncache generatedConn_cache = this.getConn_cache();
		switch (option) {
		case CURLSHOPT_UNSHARE:
				type = (int)/* this is a type this share will no longer share */param;
				generatedSpecifier &=  ~(1 << type);
				switch (type) {
				case CURL_LOCK_DATA_COOKIE:
						if (generatedCookies) {
							generatedCookies.Curl_cookie_cleanup();
							this.setCookies(((Object)0/* CURL_DISABLE_HTTP */));
						} 
						break;
				case CURL_LOCK_DATA_CONNECT:
						break;
				case CURL_LOCK_DATA_SSL_SESSION:
						res = CURLSHE_NOT_BUILT_IN;
						break;
				case CURL_LOCK_DATA_DNS:
						break;
				default:
						res = CURLSHE_BAD_OPTION;
						break;
				}
				break;
		case CURLSHOPT_USERDATA:
				ptr = (int)param;
				this.setClientdata(ptr);
				break;
		case CURLSHOPT_UNLOCKFUNC:
				unlockfunc = (int)param;
				this.setUnlockfunc(unlockfunc);
				break;
		case CURLSHOPT_SHARE:
				type = (int)/* this is a type this share will share */param;
				generatedSpecifier |=  (1 << type);
				switch (type) {
				case CURL_LOCK_DATA_SSL_SESSION:
						res = CURLSHE_NOT_BUILT_IN;
						break;
				case CURL_LOCK_DATA_DNS:
						break;
				case CURL_LOCK_DATA_PSL:
						res = CURLSHE_NOT_BUILT_IN;
						break;
				case CURL_LOCK_DATA_COOKIE:
						if (!generatedCookies) {
							this.setCookies(((Object)0).Curl_cookie_init(((Object)0), ((Object)0), 1));
							if (!generatedCookies) {
								res = CURLSHE_NOMEM/* CURL_DISABLE_HTTP */;
							} 
						} 
						break;
				case /* not supported (yet) */CURL_LOCK_DATA_CONNECT:
						if (generatedConn_cache.Curl_conncache_init(103)) {
							res = CURLSHE_NOMEM;
						} 
						break;
				default:
						res = CURLSHE_BAD_OPTION;
				}
				break;
		case CURLSHOPT_LOCKFUNC:
				lockfunc = (int)param;
				this.setLockfunc(lockfunc);
				break;
		default:
				res = CURLSHE_BAD_OPTION;
				break;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(param);
		return res;
	}
	public Object curl_share_cleanup() {
		if (share == ((Object)0)) {
			return CURLSHE_INVALID;
		} 
		Object generatedLockfunc = this.getLockfunc();
		Object generatedClientdata = this.getClientdata();
		if (generatedLockfunc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(((Object)0), CURL_LOCK_DATA_SHARE, CURL_LOCK_ACCESS_SINGLE, generatedClientdata);
		} 
		Object generatedDirty = this.getDirty();
		Object generatedUnlockfunc = this.getUnlockfunc();
		if (generatedDirty) {
			if (generatedUnlockfunc) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(((Object)0), CURL_LOCK_DATA_SHARE, generatedClientdata);
			} 
			return CURLSHE_IN_USE;
		} 
		conncache generatedConn_cache = this.getConn_cache();
		generatedConn_cache.Curl_conncache_close_all_connections();
		generatedConn_cache.Curl_conncache_destroy();
		curl_hash generatedHostcache = this.getHostcache();
		generatedHostcache.Curl_hash_destroy();
		CookieInfo generatedCookies = this.getCookies();
		generatedCookies.Curl_cookie_cleanup();
		;
		if (generatedUnlockfunc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(((Object)0), CURL_LOCK_DATA_SHARE, generatedClientdata);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(share);
		return CURLSHE_OK;
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
	public CookieInfo getCookies() {
		return cookies;
	}
	public void setCookies(CookieInfo newCookies) {
		cookies = newCookies;
	}
	public curl_ssl_session getSslsession() {
		return sslsession;
	}
	public void setSslsession(curl_ssl_session newSslsession) {
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
