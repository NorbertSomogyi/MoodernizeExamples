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
	private Cookie next;
	private Byte name;
	private Byte value;
	private byte[] path;
	private Byte spath;
	private Byte domain;
	private Object expires;
	private Byte expirestr;
	private  tailmatch;
	private Byte version;
	private byte[] maxage;
	private  secure;
	private  livecookie;
	private  httponly;
	private int creationtime;
	private byte prefix;
	
	public Cookie(Cookie next, Byte name, Byte value, byte[] path, Byte spath, Byte domain, Object expires, Byte expirestr,  tailmatch, Byte version, byte[] maxage,  secure,  livecookie,  httponly, int creationtime, byte prefix) {
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
	/***
	
	
	RECEIVING COOKIE INFORMATION
	============================
	
	struct CookieInfo *Curl_cookie_init(struct Curl_easy *data,
	                    const char *file, struct CookieInfo *inc, bool newsession);
	
	        Inits a cookie struct to store data in a local file. This is always
	        called before any cookies are set.
	
	struct Cookie *Curl_cookie_add(struct Curl_easy *data,
	                 struct CookieInfo *c, bool httpheader, char *lineptr,
	                 const char *domain, const char *path);
	
	        The 'lineptr' parameter is a full "Set-cookie:" line as
	        received from a server.
	
	        The function need to replace previously stored lines that this new
	        line supersedes.
	
	        It may remove lines that are expired.
	
	        It should return an indication of success/error.
	
	
	SENDING COOKIE INFORMATION
	==========================
	
	struct Cookies *Curl_cookie_getlist(struct CookieInfo *cookie,
	                                    char *host, char *path, bool secure);
	
	        For a given host and path, return a linked list of cookies that
	        the client should send to the server if used now. The secure
	        boolean informs the cookie if a secure connection is achieved or
	        not.
	
	        It shall only return cookies that haven't expired.
	
	
	Example set of cookies:
	
	    Set-cookie: PRODUCTINFO=webxpress; domain=.fidelity.com; path=/; secure
	    Set-cookie: PERSONALIZE=none;expires=Monday, 13-Jun-1988 03:04:55 GMT;
	    domain=.fidelity.com; path=/ftgw; secure
	    Set-cookie: FidHist=none;expires=Monday, 13-Jun-1988 03:04:55 GMT;
	    domain=.fidelity.com; path=/; secure
	    Set-cookie: FidOrder=none;expires=Monday, 13-Jun-1988 03:04:55 GMT;
	    domain=.fidelity.com; path=/; secure
	    Set-cookie: DisPend=none;expires=Monday, 13-Jun-1988 03:04:55 GMT;
	    domain=.fidelity.com; path=/; secure
	    Set-cookie: FidDis=none;expires=Monday, 13-Jun-1988 03:04:55 GMT;
	    domain=.fidelity.com; path=/; secure
	    Set-cookie:
	    Session_Key@6791a9e0-901a-11d0-a1c8-9b012c88aa77=none;expires=Monday,
	    13-Jun-1988 03:04:55 GMT; domain=.fidelity.com; path=/; secure
	****/
	/* The last 3 #include files should be in this order */
	public void freecookie() {
		Byte generatedExpirestr = this.getExpirestr();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedExpirestr);
		Byte generatedDomain = this.getDomain();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedDomain);
		byte[] generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedPath);
		Byte generatedSpath = this.getSpath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedSpath);
		Byte generatedName = this.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedName);
		Byte generatedValue = this.getValue();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedValue);
		byte[] generatedMaxage = this.getMaxage();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedMaxage);
		Byte generatedVersion = this.getVersion();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedVersion);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(co);
	}
	public Cookie Curl_cookie_add(Curl_easy data, CookieInfo c,  httpheader,  noexpire, byte[] lineptr, Object domain, Object path,  secure) {
		/* TRUE if connection is over secure origin */Cookie clist = new Cookie();
		Cookie co = new Cookie();
		Cookie lastc = ((Object)0);
		time_t now = /*Error: Function owner not recognized*/time(((Object)0));
		bool replace_old = 0;
		bool badcookie = /* cookies are good by default. mmmmm yummy */0;
		size_t myhash = new size_t();
		co = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*//* First, alloc and init a new struct for it */);
		if (!co) {
			return ((Object)/* bail out if we're this low on memory */0);
		} 
		byte generatedPrefix = co.getPrefix();
		Byte generatedName = co.getName();
		Byte generatedValue = co.getValue();
		 generatedRunning = c.getRunning();
		byte[] generatedPath = co.getPath();
		Byte generatedSpath = co.getSpath();
		Byte generatedDomain = co.getDomain();
		Byte generatedVersion = co.getVersion();
		byte[] generatedMaxage = co.getMaxage();
		Byte generatedExpirestr = co.getExpirestr();
		Object generatedExpires = co.getExpires();
		if (httpheader) {
			byte[] name = new byte[/* This line was read off a HTTP-header */4096];
			byte[] what = new byte[4096];
			byte ptr;
			byte semiptr;
			size_t linelength = /*Error: Function owner not recognized*/strlen(lineptr);
			if (linelength > 5000) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* discard overly long lines at once */co);
				return ((Object)0);
			} 
			semiptr = /*Error: Function owner not recognized*/strchr(lineptr, /* first, find a semicolon */(byte)';');
			while (lineptr && (int)((((byte)lineptr) == (byte)' ') || (((byte)lineptr) == (byte)'\t'))) {
				lineptr++;
			}
			ptr = lineptr;
			do {
				ModernizedCProgram.name[0] = what[0] = /* we have a <what>=<this> pair or a stand-alone word here *//* init the buffers */0;
				if (1 <= /*Error: Function owner not recognized*/sscanf(ptr, "%4095[^;\r\n=] =%4095[^;\r\n]", ModernizedCProgram.name, what/* Use strstore() below to properly deal with received cookie
				           headers that have the same string property set more than once,
				           and then we use the last one. */)) {
					byte whatptr;
					bool done = 0;
					bool sep = new bool();
					size_t len = /*Error: Function owner not recognized*/strlen(what);
					size_t nlen = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.name);
					byte endofn = ptr[nlen];
					if (nlen >= (4096 - 1) || len >= (4096 - 1) || ((nlen + len) > 4096/* too long individual name or contents, or too long combination of
					             name + contents. Chrome and Firefox support 4095 or 4096 bytes
					             combo. */)) {
						co.freecookie();
						data.Curl_infof("oversized cookie dropped, name/val %zu + %zu bytes\n", nlen, len);
						return ((Object)0);
					} 
					sep = (endofn == (byte)'=') ? 1 : /* name ends with a '=' ? */0;
					if (nlen) {
						/* move to the last character */endofn--;
						if ((int)((((byte)endofn) == (byte)' ') || (((byte)endofn) == (byte)'\t'))) {
							while (endofn && (int)((((byte)endofn) == (byte)' ') || (((byte)endofn) == (byte)'\t')) && /* skip trailing spaces in name */nlen) {
								endofn--;
								nlen--;
							}
							ModernizedCProgram.name[nlen] = /* new end of name */0;
						} 
					} 
					while (len && (int)((((byte)what[len - 1]) == (byte)' ') || (((byte)what[len - 1]) == /* Strip off trailing whitespace from the 'what' */(byte)'\t'))) {
						what[len - 1] = 0;
						len--;
					}
					whatptr = /* Skip leading whitespace from the 'what' */what;
					while (whatptr && (int)((((byte)whatptr) == (byte)' ') || (((byte)whatptr) == (byte)'\t'))) {
						whatptr/*
						         * Check if we have a reserved prefix set before anything else, as we
						         * otherwise have to test for the prefix in both the cookie name and
						         * "the rest". Prefixes must start with '__' and end with a '-', so
						         * only test for names where that can possibly be true.
						         */++;
					}
					if (nlen > 3 && ModernizedCProgram.name[0] == (byte)'_' && ModernizedCProgram.name[1] == (byte)'_') {
						if (ModernizedCProgram.Curl_strncasecompare("__Secure-", ModernizedCProgram.name, 9)) {
							generatedPrefix |=  (1 << 0);
						}  else if (ModernizedCProgram.Curl_strncasecompare("__Host-", ModernizedCProgram.name, 7)) {
							generatedPrefix |=  (1 << 1);
						} 
					} 
					if (!generatedName) {
						if (!/* The very first name/value pair is the actual cookie name */sep) {
							badcookie = /* Bad name/value pair. */1;
							break;
						} 
						co.setName(/*Error: Function owner not recognized*/Curl_cstrdup(ModernizedCProgram.name));
						co.setValue(/*Error: Function owner not recognized*/Curl_cstrdup(whatptr));
						done = 1;
						if (!generatedName || !generatedValue) {
							badcookie = 1;
							break;
						} 
					}  else if (!len/* this was a "<name>=" with no content, and we must allow
					             'secure' and 'httponly' specified this weirdly */) {
						done = 1/*
						           * secure cookies are only allowed to be set when the connection is
						           * using a secure protocol, or when the cookie is being set by
						           * reading from file
						           */;
						if (ModernizedCProgram.Curl_strcasecompare("secure", ModernizedCProgram.name)) {
							if (secure || !generatedRunning) {
								co.setSecure(1);
							} else {
									badcookie = 1;
									break;
							} 
						}  else if (ModernizedCProgram.Curl_strcasecompare("httponly", ModernizedCProgram.name)) {
							co.setHttponly(1);
						}  else if (sep) {
							done = /* there was a '=' so we're not done parsing this field */0;
						} 
					} 
					if (done) {
						;
					}  else if (ModernizedCProgram.Curl_strcasecompare("path", ModernizedCProgram.name)) {
						ModernizedCProgram.strstore(generatedPath, whatptr);
						if (!generatedPath) {
							badcookie = /* out of memory bad */1;
							break;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedSpath);
						co.setSpath(ModernizedCProgram.sanitize_cookie_path(generatedPath));
						if (!generatedSpath) {
							badcookie = /* out of memory bad */1;
							break;
						} 
					}  else if (ModernizedCProgram.Curl_strcasecompare("domain", ModernizedCProgram.name)) {
						bool is_ip = new bool();
						if ((byte)'.' == whatptr[0]) {
							/* ignore preceding dot */whatptr/*
							           * Without PSL we don't know when the incoming cookie is set on a
							           * TLD or otherwise "protected" suffix. To reduce risk, we require a
							           * dot OR the exact host name being "localhost".
							           *//*
							           * Without PSL we don't know when the incoming cookie is set on a
							           * TLD or otherwise "protected" suffix. To reduce risk, we require a
							           * dot OR the exact host name being "localhost".
							           */++;
						} 
						if (ModernizedCProgram.bad_domain(whatptr)) {
							domain = ":";
						} 
						is_ip = ModernizedCProgram.isip(domain ? domain : whatptr);
						if (!domain || (is_ip && !/*Error: Function owner not recognized*/strcmp(whatptr, domain)) || (!is_ip && ModernizedCProgram.tailmatch(whatptr, domain))) {
							ModernizedCProgram.strstore(generatedDomain, whatptr);
							if (!generatedDomain) {
								badcookie = 1;
								break;
							} 
							if (!is_ip) {
								co.setTailmatch(/* we always do that if the domain name was
								                                       given */1);
							} 
						} else {
								badcookie = /* we did not get a tailmatch and then the attempted set domain
								               is not a domain to which the current host belongs. Mark as
								               bad. */1;
								data.Curl_infof("skipped cookie with bad tailmatch domain: %s\n", whatptr);
						} 
					}  else if (ModernizedCProgram.Curl_strcasecompare("version", ModernizedCProgram.name)) {
						ModernizedCProgram.strstore(generatedVersion, whatptr);
						if (!generatedVersion) {
							badcookie = 1;
							break;
						} 
					}  else if (ModernizedCProgram.Curl_strcasecompare("max-age", ModernizedCProgram.name/* Defined in RFC2109:
					
					             Optional.  The Max-Age attribute defines the lifetime of the
					             cookie, in seconds.  The delta-seconds value is a decimal non-
					             negative integer.  After delta-seconds seconds elapse, the
					             client should discard the cookie.  A value of zero means the
					             cookie should be discarded immediately.
					
					          */)) {
						ModernizedCProgram.strstore(generatedMaxage, whatptr);
						if (!generatedMaxage) {
							badcookie = 1;
							break;
						} 
					}  else if (ModernizedCProgram.Curl_strcasecompare("expires", ModernizedCProgram.name)) {
						ModernizedCProgram.strstore(generatedExpirestr, whatptr);
						if (!generatedExpirestr) {
							badcookie = 1;
							break;
						} 
					} 
				} 
				if (!semiptr || !/* this is an "illegal" <what>=<this> pair */semiptr) {
					semiptr = ((Object)/* we already know there are no more cookies */0);
					continue;
				} 
				ptr = semiptr + 1;
				while (ptr && (int)((((byte)ptr) == (byte)' ') || (((byte)ptr) == (byte)'\t'))) {
					ptr++;
				}
				semiptr = /*Error: Function owner not recognized*/strchr(ptr, /* now, find the next semicolon */(byte)';');
				if (!semiptr && ptr/* There are no more semicolons, but there's a final name=value pair
				           coming up */) {
					semiptr = /*Error: Function owner not recognized*/strchr(ptr, (byte)'\0');
				} 
			} while (semiptr);
			if (generatedMaxage) {
				CURLofft offt = new CURLofft();
				offt = ModernizedCProgram.curlx_strtoofft((generatedMaxage == (byte)'\"') ? generatedMaxage[1] : generatedMaxage[0], ((Object)0), 10, generatedExpires);
				if (offt == .CURL_OFFT_FLOW) {
					co.setExpires(/*Error: Function owner not recognized*/CURL_OFF_T_C(/* overflow, used max value */-1024));
				}  else if (!offt) {
					if (!generatedExpires) {
						co.setExpires(/* already expired */1);
					}  else if (/*Error: Function owner not recognized*/CURL_OFF_T_C(-1024) - now < generatedExpires) {
						co.setExpires(/*Error: Function owner not recognized*/CURL_OFF_T_C(/* would overflow */-1024));
					} else {
							generatedExpires += now;
					} 
				} 
			}  else if (generatedExpirestr) {
				co.setExpires(ModernizedCProgram.curl_getdate(generatedExpirestr, ((Object)0/* Session cookies have expires set to 0 so if we get that back
				         from the date parser let's add a second to make it a
				         non-session cookie */)));
				if (generatedExpires == 0) {
					co.setExpires(1);
				}  else if (generatedExpires < 0) {
					co.setExpires(0);
				} 
			} 
			if (!badcookie && !generatedDomain) {
				if (domain) {
					co.setDomain(/*Error: Function owner not recognized*/Curl_cstrdup(/* no domain was given in the header line, set the default */domain));
					if (!generatedDomain) {
						badcookie = 1;
					} 
				} 
			} 
			if (!badcookie && !generatedPath && path/* No path was given in the header line, set the default.
			         Note that the passed-in path to this function MAY have a '?' and
			         following part that MUST not be stored as part of the path. */) {
				byte queryp = /*Error: Function owner not recognized*/strchr(path, (byte)'?'/* queryp is where the interesting part of the path ends, so now we
				         want to the find the last */);
				byte endslash;
				if (!queryp) {
					endslash = /*Error: Function owner not recognized*/strrchr(path, (byte)'/');
				} else {
						endslash = ModernizedCProgram.Curl_memrchr((path), ((byte)'/'), ((queryp - path)));
				} 
				if (endslash) {
					size_t pathlen = (endslash - path + /* include end slash */1);
					co.setPath(/*Error: Function owner not recognized*/Curl_cmalloc(pathlen + /* one extra for the zero byte */1));
					if (generatedPath) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPath, path, pathlen);
						generatedPath[pathlen] = /* zero terminate */0;
						co.setSpath(ModernizedCProgram.sanitize_cookie_path(generatedPath));
						if (!generatedSpath) {
							badcookie = /* out of memory bad */1;
						} 
					} else {
							badcookie = 1;
					} 
				} 
			} 
			if (badcookie || !generatedName) {
				co.freecookie();
				return ((Object)0);
			} 
		} else {
				byte ptr;
				byte firstptr;
				byte tok_buf = ((Object)0);
				int fields;
				if (/*Error: Function owner not recognized*/strncmp(lineptr, "#HttpOnly_", 10) == 0) {
					lineptr += 10;
					co.setHttponly(1);
				} 
				if (lineptr[0] == (byte)'#') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* don't even try the comments */co);
					return ((Object)0);
				} 
				ptr = /*Error: Function owner not recognized*/strchr(lineptr, /* strip off the possible end-of-line characters */(byte)'\r');
				if (ptr) {
					ptr = /* clear it */0;
				} 
				ptr = /*Error: Function owner not recognized*/strchr(lineptr, (byte)'\n');
				if (ptr) {
					ptr = /* clear it */0;
				} 
				firstptr = ModernizedCProgram.Curl_strtok_r(lineptr, "\t", /* tokenize it on the TAB */tok_buf);
				for (; ptr && !/* Now loop through the fields and init the struct we already have
				       allocated */badcookie; ) {
					switch (fields) {
					case /* FALLTHROUGH */3:
							co.setSecure(0);
							if (ModernizedCProgram.Curl_strcasecompare(ptr, "TRUE")) {
								if (secure || generatedRunning) {
									co.setSecure(1);
								} else {
										badcookie = 1;
								} 
							} 
							break;
					case 1/* flag: A TRUE/FALSE value indicating if all machines within a given
					           domain can access the variable. Set TRUE when the cookie says
					           .domain.com and to false when the domain is complete www.domain.com
					        */:
							co.setTailmatch(ModernizedCProgram.Curl_strcasecompare(ptr, "TRUE") ? 1 : 0);
							break;
					case 4:
							if (ModernizedCProgram.curlx_strtoofft(ptr, ((Object)0), 10, generatedExpires)) {
								badcookie = 1;
							} 
							break;
					case 2:
							if (/*Error: Function owner not recognized*/strcmp("TRUE", ptr) && /*Error: Function owner not recognized*/strcmp("FALSE", /* The file format allows the path field to remain not filled in */ptr)) {
								co.setPath(/*Error: Function owner not recognized*/Curl_cstrdup(/* only if the path doesn't look like a boolean option! */ptr));
								if (!generatedPath) {
									badcookie = 1;
								} else {
										co.setSpath(ModernizedCProgram.sanitize_cookie_path(generatedPath));
										if (!generatedSpath) {
											badcookie = /* out of memory bad */1;
										} 
								} 
								break;
							} 
							co.setPath(/*Error: Function owner not recognized*/Curl_cstrdup(/* this doesn't look like a path, make one up! */"/"));
							if (!generatedPath) {
								badcookie = 1;
							} 
							co.setSpath(/*Error: Function owner not recognized*/Curl_cstrdup("/"));
							if (!generatedSpath) {
								badcookie = 1;
							} 
							/* add a field and fall down to secure */fields++;
					case 6:
							co.setValue(/*Error: Function owner not recognized*/Curl_cstrdup(ptr));
							if (!generatedValue) {
								badcookie = 1;
							} 
							break;
					case 0:
							if (ptr[0] == /* skip preceding dots */(byte)'.') {
								ptr++;
							} 
							co.setDomain(/*Error: Function owner not recognized*/Curl_cstrdup(ptr));
							if (!generatedDomain) {
								badcookie = 1;
							} 
							break;
					case 5:
							co.setName(/*Error: Function owner not recognized*/Curl_cstrdup(ptr));
							if (!generatedName) {
								badcookie = 1;
							} else {
									if (ModernizedCProgram.Curl_strncasecompare("__Secure-", generatedName, /* For Netscape file format cookies we check prefix on the name */9)) {
										generatedPrefix |=  (1 << 0);
									}  else if (ModernizedCProgram.Curl_strncasecompare("__Host-", generatedName, 7)) {
										generatedPrefix |=  (1 << 1);
									} 
							} 
							break;
					}
				}
				if (6 == fields) {
					co.setValue(/*Error: Function owner not recognized*/Curl_cstrdup(/* we got a cookie with blank contents, fix it */""));
					if (!generatedValue) {
						badcookie = 1;
					} else {
							fields++;
					} 
				} 
				if (!badcookie && (7 != fields)) {
					badcookie = /* we did not find the sufficient number of fields */1;
				} 
				if (badcookie) {
					co.freecookie();
					return ((Object)0);
				} 
		} 
		 generatedSecure = co.getSecure();
		if (generatedPrefix & (1 << 0)) {
			if (!generatedSecure) {
				co.freecookie();
				return ((Object)0);
			} 
		} 
		 generatedTailmatch = co.getTailmatch();
		if (generatedPrefix & (1 << 1/*
		     * The __Host- prefix requires the cookie to be secure, have a "/" path
		     * and not have a domain set.
		     */)) {
			if (generatedSecure && generatedPath && /*Error: Function owner not recognized*/strcmp(generatedPath, "/") == 0 && !generatedTailmatch) {
				;
			} else {
					co.freecookie();
					return ((Object)0);
			} 
		} 
		 generatedNewsession = c.getNewsession();
		if (!generatedRunning && generatedNewsession && !generatedExpires) {
			co.freecookie();
			return ((Object)0);
		} 
		co.setLivecookie(generatedRunning);
		int generatedLastct = c.getLastct();
		co.setCreationtime(++generatedLastct);
		if (!/* at first, remove expired cookies */noexpire) {
			c/* Check if the domain is a Public Suffix and if yes, ignore the cookie. */.remove_expired();
		} 
		myhash = ModernizedCProgram.cookiehash(generatedDomain);
		Object generatedCookies = c.getCookies();
		clist = generatedCookies[myhash];
		replace_old = 0;
		 generatedLivecookie = co.getLivecookie();
		Cookie generatedNext = clist.getNext();
		int generatedCreationtime = clist.getCreationtime();
		while (clist) {
			if (ModernizedCProgram.Curl_strcasecompare(generatedName, generatedName)) {
				if (generatedDomain && generatedDomain) {
					if (ModernizedCProgram.Curl_strcasecompare(generatedDomain, generatedDomain) && (generatedTailmatch == generatedTailmatch)) {
						replace_old = /* The domains are identical */1;
					} 
				}  else if (!generatedDomain && !generatedDomain) {
					replace_old = 1;
				} 
				if (replace_old/* the domains were identical */) {
					if (generatedSpath && generatedSpath) {
						if (generatedSecure && !generatedSecure && !secure) {
							size_t cllen = new size_t();
							byte sep;
							sep = /*Error: Function owner not recognized*/strchr(generatedSpath + 1, (byte)'/');
							if (sep) {
								cllen = sep - generatedSpath;
							} else {
									cllen = /*Error: Function owner not recognized*/strlen(generatedSpath);
							} 
							if (ModernizedCProgram.Curl_strncasecompare(generatedSpath, generatedSpath, cllen)) {
								co.freecookie();
								return ((Object)0);
							} 
						}  else if (ModernizedCProgram.Curl_strcasecompare(generatedSpath, generatedSpath)) {
							replace_old = 1;
						} else {
								replace_old = 0;
						} 
					}  else if (!generatedSpath && !generatedSpath) {
						replace_old = 1;
					} else {
							replace_old = 0;
					} 
				} 
				if (replace_old && !generatedLivecookie && generatedLivecookie) {
					/* Free the newcomer and get out of here! */co.freecookie();
					return ((Object)0);
				} 
				if (replace_old) {
					co.setNext(generatedNext);
					co.setCreationtime(generatedCreationtime);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedName);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedValue);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedDomain);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedPath);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedSpath);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedExpirestr);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedVersion);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedMaxage);
					clist = /* then store all the new data */co;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* free the newly alloced memory */co);
					co = /* point to the previous struct instead */clist/* We have replaced a cookie, now skip the rest of the list but
					           make sure the 'lastc' pointer is properly set */;
					do {
						lastc = clist;
						clist = generatedNext;
					} while (clist);
					break;
				} 
			} 
			lastc = clist;
			clist = generatedNext;
		}
		long generatedNumcookies = c.getNumcookies();
		if (!replace_old) {
			if (/* then make the last item point on this new one */lastc) {
				lastc.setNext(co);
			} else {
					generatedCookies[myhash] = co;
			} 
			generatedNumcookies++;
		} 
		return co/*****************************************************************************
		 *
		 * Curl_cookie_init()
		 *
		 * Inits a cookie struct to read data from a local file. This is always
		 * called before any cookies are set. File may be NULL.
		 *
		 * If 'newsession' is TRUE, discard all "session cookies" on read from file.
		 *
		 * Note that 'data' might be called as NULL pointer.
		 *
		 * Returns NULL on out of memory. Invalid cookies are ignored.
		 ****************************************************************************/;
	}
	/* The 'data' pointer here may be NULL at times, and thus
	                   must only be used very carefully for things that can deal
	                   with data being NULL. Such as infof() and similar */
	public Cookie dup_cookie() {
		Cookie d = /*Error: Function owner not recognized*/Curl_ccalloc(/*Error: Unsupported expression*/, 1);
		Byte generatedExpirestr = this.getExpirestr();
		Byte generatedDomain = this.getDomain();
		byte[] generatedPath = this.getPath();
		Byte generatedSpath = this.getSpath();
		Byte generatedName = this.getName();
		Byte generatedValue = this.getValue();
		byte[] generatedMaxage = this.getMaxage();
		Byte generatedVersion = this.getVersion();
		Object generatedExpires = this.getExpires();
		 generatedTailmatch = this.getTailmatch();
		 generatedSecure = this.getSecure();
		 generatedLivecookie = this.getLivecookie();
		 generatedHttponly = this.getHttponly();
		int generatedCreationtime = this.getCreationtime();
		if (d) {
			do {
				if (generatedExpirestr) {
					d.setExpirestr(/*Error: Function owner not recognized*/Curl_cstrdup(generatedExpirestr));
					if (!generatedExpirestr) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedDomain) {
					d.setDomain(/*Error: Function owner not recognized*/Curl_cstrdup(generatedDomain));
					if (!generatedDomain) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedPath) {
					d.setPath(/*Error: Function owner not recognized*/Curl_cstrdup(generatedPath));
					if (!generatedPath) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedSpath) {
					d.setSpath(/*Error: Function owner not recognized*/Curl_cstrdup(generatedSpath));
					if (!generatedSpath) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedName) {
					d.setName(/*Error: Function owner not recognized*/Curl_cstrdup(generatedName));
					if (!generatedName) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedValue) {
					d.setValue(/*Error: Function owner not recognized*/Curl_cstrdup(generatedValue));
					if (!generatedValue) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedMaxage) {
					d.setMaxage(/*Error: Function owner not recognized*/Curl_cstrdup(generatedMaxage));
					if (!generatedMaxage) {
						;
					} 
				} 
			} while (0);
			do {
				if (generatedVersion) {
					d.setVersion(/*Error: Function owner not recognized*/Curl_cstrdup(generatedVersion));
					if (!generatedVersion) {
						;
					} 
				} 
			} while (0);
			d.setExpires(generatedExpires);
			d.setTailmatch(generatedTailmatch);
			d.setSecure(generatedSecure);
			d.setLivecookie(generatedLivecookie);
			d.setHttponly(generatedHttponly);
			d.setCreationtime(generatedCreationtime);
		} 
		return d;
		return ((Object)0/*****************************************************************************
		 *
		 * Curl_cookie_getlist()
		 *
		 * For a given host and path, return a linked list of cookies that the
		 * client should send to the server if used now. The secure boolean informs
		 * the cookie if a secure connection is achieved or not.
		 *
		 * It shall only return cookies that haven't expired.
		 *
		 ****************************************************************************/);
	}
	public Cookie Curl_cookie_getlist(CookieInfo c, Object host, Object path,  secure) {
		Cookie newco = new Cookie();
		Cookie co = new Cookie();
		Cookie mainco = ((Object)0);
		size_t matches = 0;
		bool is_ip = new bool();
		size_t myhash = ModernizedCProgram.cookiehash(host);
		Object generatedCookies = c.getCookies();
		if (!c || !generatedCookies[myhash]) {
			return ((Object)/* no cookie struct or no cookies in the struct */0);
		} 
		/* at first, remove expired cookies */c.remove_expired();
		is_ip = ModernizedCProgram.isip(/* check if host is an IP(v4|v6) address */host);
		co = generatedCookies[myhash];
		 generatedSecure = co.getSecure();
		Byte generatedDomain = co.getDomain();
		 generatedTailmatch = co.getTailmatch();
		Byte generatedSpath = co.getSpath();
		Cookie generatedNext = co.getNext();
		while (co) {
			if (generatedSecure ? secure : /* if the cookie requires we're secure we must only continue if we are! */1) {
				if (!generatedDomain || (generatedTailmatch && !is_ip && ModernizedCProgram.tailmatch(generatedDomain, host)) || ((!generatedTailmatch || is_ip) && ModernizedCProgram.Curl_strcasecompare(host, generatedDomain))) {
					if (!generatedSpath || ModernizedCProgram.pathmatch(generatedSpath, /* now check the left part of the path with the cookies path
					           requirement */path/* and now, we know this is a match and we should create an
					             entry for the return-linked-list */)) {
						newco = co.dup_cookie();
						if (newco) {
							newco.setNext(/* then modify our next */mainco);
							mainco = /* point the main to us */newco;
							matches++;
						} else {
								;
						} 
					} 
				} 
			} 
			co = generatedNext;
		}
		if (matches/* Now we need to make sure that if there is a name appearing more than
		       once, the longest specified path version comes first. To make this
		       the swiftest way, we just sort them all based on path length. */) {
			Cookie array = new Cookie();
			size_t i = new size_t();
			array = /*Error: Function owner not recognized*/Curl_cmalloc(/*Error: Unsupported expression*/ * /* alloc an array and store all cookie pointers */matches);
			if (!array) {
				;
			} 
			co = mainco;
			for (i = 0; co; co = generatedNext) {
				array[i++] = co;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(array, matches, /*Error: Unsupported expression*/, /* now sort the cookie pointers in path length order */cookie_sort);
			mainco = array[/* remake the linked list order according to the new order *//* start here */0];
			for (i = 0; i < matches - 1; i++) {
				array[i].setNext(array[i + 1]);
			}
			array[matches - 1].setNext(((Object)/* terminate the list */0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* remove the temporary data again */array);
		} 
		return /* return the new list */mainco;
		return ((Object)0/*****************************************************************************
		 *
		 * Curl_cookie_clearall()
		 *
		 * Clear all existing cookies and reset the counter.
		 *
		 ****************************************************************************/);
	}
	public void Curl_cookie_freelist() {
		Cookie next = new Cookie();
		Cookie generatedNext = this.getNext();
		while (co) {
			next = generatedNext;
			co.freecookie();
			co = next/*****************************************************************************
			 *
			 * Curl_cookie_clearsess()
			 *
			 * Free all session cookies in the cookies list.
			 *
			 ****************************************************************************/;
		}
	}
	public Cookie getNext() {
		return next;
	}
	public void setNext(Cookie newNext) {
		next = newNext;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public byte[] getPath() {
		return path;
	}
	public void setPath(byte[] newPath) {
		path = newPath;
	}
	public Byte getSpath() {
		return spath;
	}
	public void setSpath(Byte newSpath) {
		spath = newSpath;
	}
	public Byte getDomain() {
		return domain;
	}
	public void setDomain(Byte newDomain) {
		domain = newDomain;
	}
	public Object getExpires() {
		return expires;
	}
	public void setExpires(Object newExpires) {
		expires = newExpires;
	}
	public Byte getExpirestr() {
		return expirestr;
	}
	public void setExpirestr(Byte newExpirestr) {
		expirestr = newExpirestr;
	}
	public  getTailmatch() {
		return tailmatch;
	}
	public void setTailmatch( newTailmatch) {
		tailmatch = newTailmatch;
	}
	public Byte getVersion() {
		return version;
	}
	public void setVersion(Byte newVersion) {
		version = newVersion;
	}
	public byte[] getMaxage() {
		return maxage;
	}
	public void setMaxage(byte[] newMaxage) {
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
