package application;

/* List of hosts which should not use the proxy, if
                             used */
/* Session ID to use */
/* Stream URI for this request */
/* Transport for this session */
/* path to the private key file for auth */
/* path to the public key file for auth */
/* md5 of host public key in ascii hex */
/* file name of knownhosts file */
/* Proxy service name */
/* Service name */
/* TLS auth <username> */
/* TLS auth <username> */
/* TLS auth <password> */
/* TLS auth <password> */
/* <bearer>, if used */
/* path to Unix socket, if used */
/* CURLOPT_REQUEST_TARGET */
/* CURLOPT_DOH_URL */
/* CURLOPT_ALTSVC */
/* CURLOPT_SASL_AUTHZID */
/* temp URL storage for proxy use */
/* -- end of zero-terminated strings -- */
/* -- below this are pointers to binary data that cannot be strdup'ed. --- */
/* if POST, set the fields' values here */
/* not used, just an end-of-list marker */
/* callback that gets called when this easy handle is completed within a multi
   handle.  Only used for internally created transfers, like for example
   DoH. */
/* this is a DoH request for that transfer */
public class Curl_easy {
	private Curl_easy next;
	private Curl_easy prev;
	private connectdata conn;
	private curl_llist_element connect_queue;
	private curl_llist_element conn_queue;
	private  mstate;
	private Object result;
	private Curl_message msg;
	private Object sockets;
	private Object actions;
	private int numsocks;
	private Names dns;
	private Curl_multi multi;
	private Curl_multi multi_easy;
	private Curl_share share;
	private SingleRequest req;
	private UserDefined set;
	private DynamicStatic change;
	private CookieInfo[] cookies;
	private Progress progress;
	private UrlState state;
	private WildcardData wildcard;
	private PureInfo info;
	private curl_tlssessioninfo tsi;
	private int magic;
	
	public Curl_easy(Curl_easy next, Curl_easy prev, connectdata conn, curl_llist_element connect_queue, curl_llist_element conn_queue,  mstate, Object result, Curl_message msg, Object sockets, Object actions, int numsocks, Names dns, Curl_multi multi, Curl_multi multi_easy, Curl_share share, SingleRequest req, UserDefined set, DynamicStatic change, CookieInfo[] cookies, Progress progress, UrlState state, WildcardData wildcard, PureInfo info, curl_tlssessioninfo tsi, int magic) {
		setNext(next);
		setPrev(prev);
		setConn(conn);
		setConnect_queue(connect_queue);
		setConn_queue(conn_queue);
		setMstate(mstate);
		setResult(result);
		setMsg(msg);
		setSockets(sockets);
		setActions(actions);
		setNumsocks(numsocks);
		setDns(dns);
		setMulti(multi);
		setMulti_easy(multi_easy);
		setShare(share);
		setReq(req);
		setSet(set);
		setChange(change);
		setCookies(cookies);
		setProgress(progress);
		setState(state);
		setWildcard(wildcard);
		setInfo(info);
		setTsi(tsi);
		setMagic(magic);
	}
	public Curl_easy() {
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
	 * RFC4616 PLAIN authentication
	 * Draft   LOGIN SASL Mechanism <draft-murchison-sasl-login-00.txt>
	 *
	 ***************************************************************************/
	/* The last #include files should be: */
	/*
	 * Curl_auth_create_plain_message()
	 *
	 * This is used to generate an already encoded PLAIN message ready
	 * for sending to the recipient.
	 *
	 * Parameters:
	 *
	 * data    [in]     - The session handle.
	 * authzid [in]     - The authorization identity.
	 * authcid [in]     - The authentication identity.
	 * passwd  [in]     - The password.
	 * outptr  [in/out] - The address where a pointer to newly allocated memory
	 *                    holding the result will be stored upon completion.
	 * outlen  [out]    - The length of the output message.
	 *
	 * Returns CURLE_OK on success.
	 */
	public Object Curl_auth_create_plain_message(Object authzid, Object authcid, Object passwd, Byte outptr, Object outlen) {
		 result = new ();
		byte plainauth;
		size_t zlen = new size_t();
		size_t clen = new size_t();
		size_t plen = new size_t();
		size_t plainlen = new size_t();
		outlen = 0;
		outptr = ((Object)0);
		zlen = (authzid == ((Object)0) ? 0 : /*Error: Function owner not recognized*/strlen(authzid));
		clen = /*Error: Function owner not recognized*/strlen(authcid);
		plen = /*Error: Function owner not recognized*/strlen(passwd);
		if (((zlen + clen) > -1024 / 4) || (plen > (-1024 / 2 - /* Compute binary message length. Check for overflows. */2))) {
			return CURLE_OUT_OF_MEMORY;
		} 
		plainlen = zlen + clen + plen + 2;
		plainauth = /*Error: Function owner not recognized*/Curl_cmalloc(plainlen);
		if (!plainauth) {
			return CURLE_OUT_OF_MEMORY;
		} 
		if (zlen != /* Calculate the reply */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plainauth, authzid, zlen);
		} 
		plainauth[zlen] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plainauth + zlen + 1, authcid, clen);
		plainauth[zlen + clen + 1] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plainauth + zlen + clen + 2, passwd, plen);
		result = ModernizedCProgram.data.Curl_base64_encode(plainauth, plainlen, outptr, /* Base64 encode the reply */outlen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(plainauth);
		return result/*
		 * Curl_auth_create_login_message()
		 *
		 * This is used to generate an already encoded LOGIN message containing the
		 * user name or password ready for sending to the recipient.
		 *
		 * Parameters:
		 *
		 * data    [in]     - The session handle.
		 * valuep  [in]     - The user name or user's password.
		 * outptr  [in/out] - The address where a pointer to newly allocated memory
		 *                    holding the result will be stored upon completion.
		 * outlen  [out]    - The length of the output message.
		 *
		 * Returns CURLE_OK on success.
		 */;
	}
	public Object Curl_auth_create_login_message(Object valuep, Byte outptr, Object outlen) {
		size_t vlen = /*Error: Function owner not recognized*/strlen(valuep);
		if (!vlen) {
			outptr = /*Error: Function owner not recognized*/Curl_cstrdup(/* Calculate an empty reply */"=");
			if (outptr) {
				outlen = (size_t)1;
				return CURLE_OK;
			} 
			outlen = 0;
			return CURLE_OUT_OF_MEMORY;
		} 
		return ModernizedCProgram.data.Curl_base64_encode(valuep, vlen, outptr, /* Base64 encode the value */outlen/*
		 * Curl_auth_create_external_message()
		 *
		 * This is used to generate an already encoded EXTERNAL message containing
		 * the user name ready for sending to the recipient.
		 *
		 * Parameters:
		 *
		 * data    [in]     - The session handle.
		 * user    [in]     - The user name.
		 * outptr  [in/out] - The address where a pointer to newly allocated memory
		 *                    holding the result will be stored upon completion.
		 * outlen  [out]    - The length of the output message.
		 *
		 * Returns CURLE_OK on success.
		 */);
	}
	public Object Curl_auth_create_external_message(Object user, Byte outptr, Object outlen) {
		return ModernizedCProgram.data.Curl_auth_create_login_message(user, outptr, /* This is the same formatting as the login message */outlen/* if no users */);
	}
	public void Curl_hostcache_prune() {
		time_t now = new time_t();
		if ((ModernizedCProgram.data.getSet().getDns_cache_timeout() == -1) || !ModernizedCProgram.data.getDns().getHostcache()) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.data.getShare()) {
			ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_DNS, CURL_LOCK_ACCESS_SINGLE);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(now);
		ModernizedCProgram.data.getDns().getHostcache().hostcache_prune(ModernizedCProgram.data.getSet().getDns_cache_timeout(), now);
		if (ModernizedCProgram.data.getShare()) {
			ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_DNS/* Beware this is a global and unique instance. This is used to store the
			   return address that we can jump back to from inside a signal handler. This
			   is not thread-safe stuff. */);
		} 
	}
	public Object Curl_loadhostpairs() {
		curl_slist hostp = new curl_slist();
		byte[] hostname = new byte[256];
		int port = 0;
		ModernizedCProgram.data.getChange().setWildcard_resolve(/* Default is no wildcard found */.bool_false);
		Object generatedCurl_slist = hostp.getCurl_slist();
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		Curl_addrinfo generatedAi_next = tail.getAi_next();
		ModernizedCProgram.data.getChange().setResolve(((Object)/* dealt with now */0));
		return CURLE_OK;
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
	/* The last 3 #include files should be in this order */
	/* For posterity:
	#define  CURL_SB_PEEK(x) ((*x->subpointer)&0xff)
	#define  CURL_SB_EOF(x) (x->subpointer >= x->subend) */
	public Object check_wsock2() {
		int err;
		WORD wVersionRequested = new WORD();
		WSADATA wsaData = new WSADATA();
		do {
		} while (0);
		wVersionRequested = ((WORD)(((BYTE)(true)) | (((WORD)((BYTE)(false))) << /* telnet requires at least WinSock 2.0 so ask for it. */8)));
		err = /*Error: Function owner not recognized*/WSAStartup(wVersionRequested, wsaData);
		if (err != /* We must've called this once already, so this call *//* should always succeed.  But, just in case... */0) {
			ModernizedCProgram.data.Curl_failf("WSAStartup failed (%d)", err);
			return CURLE_FAILED_INIT;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WSACleanup();
		Object generatedWVersion = wsaData.getWVersion();
		if (((BYTE)(generatedWVersion)) != ((BYTE)(/* Check that our version is supported */wVersionRequested)) || ((BYTE)(((WORD)(generatedWVersion) >> 8) & -1024)) != ((BYTE)(((WORD)(wVersionRequested) >> 8) & -1024))) {
			ModernizedCProgram.data.Curl_failf(/* Our version isn't supported */"insufficient winsock version to support telnet");
			return CURLE_FAILED_INIT;
		} 
		return /* Our version is supported */CURLE_OK;
	}
	public void printoption(Object direction, int cmd, int option) {
		if (ModernizedCProgram.data.getSet().getVerbose()) {
			if (cmd == 255) {
				if ((((int)(option) >= 236) && ((int)(option) <= 255))) {
					ModernizedCProgram.data.Curl_infof("%s IAC %s\n", direction, ModernizedCProgram.telnetcmds[(option) - 236]);
				} else {
						ModernizedCProgram.data.Curl_infof("%s IAC %d\n", direction, option);
				} 
			} else {
					byte fmt = (cmd == 251) ? "WILL" : (cmd == 252) ? "WONT" : (cmd == 253) ? "DO" : (cmd == 254) ? "DONT" : 0;
					if (fmt) {
						byte opt;
						if (((option) <= 39)) {
							opt = ModernizedCProgram.telnetoptions[option];
						}  else if (option == 255) {
							opt = "EXOPL";
						} else {
								opt = ((Object)0);
						} 
						if (opt) {
							ModernizedCProgram.data.Curl_infof("%s %s %s\n", direction, fmt, opt);
						} else {
								ModernizedCProgram.data.Curl_infof("%s %s %d\n", direction, fmt, option);
						} 
					} else {
							ModernizedCProgram.data.Curl_infof("%s %d %d\n", direction, cmd, option);
					} 
			} 
		} 
	}
	public void printsub(int direction, byte[] pointer, Object length) {
		if (ModernizedCProgram.data.getSet().getVerbose()) {
			int i = 0;
			if (direction) {
				ModernizedCProgram.data.Curl_infof("%s IAC SB ", (direction == (byte)'<') ? "RCVD" : "SENT");
				if (length >= 3) {
					int j;
					i = pointer[length - 2];
					ModernizedCProgram.j = pointer[length - 1];
					if (i != 255 || ModernizedCProgram.j != 240) {
						ModernizedCProgram.data.Curl_infof("(terminated by ");
						if (((i) <= 39)) {
							ModernizedCProgram.data.Curl_infof("%s ", ModernizedCProgram.telnetoptions[i]);
						}  else if ((((int)(i) >= 236) && ((int)(i) <= 255))) {
							ModernizedCProgram.data.Curl_infof("%s ", ModernizedCProgram.telnetcmds[(i) - 236]);
						} else {
								ModernizedCProgram.data.Curl_infof("%u ", i);
						} 
						if (((ModernizedCProgram.j) <= 39)) {
							ModernizedCProgram.data.Curl_infof("%s", ModernizedCProgram.telnetoptions[ModernizedCProgram.j]);
						}  else if ((((int)(ModernizedCProgram.j) >= 236) && ((int)(ModernizedCProgram.j) <= 255))) {
							ModernizedCProgram.data.Curl_infof("%s", ModernizedCProgram.telnetcmds[(ModernizedCProgram.j) - 236]);
						} else {
								ModernizedCProgram.data.Curl_infof("%d", ModernizedCProgram.j);
						} 
						ModernizedCProgram.data.Curl_infof(", not IAC SE!) ");
					} 
				} 
				length -= 2;
			} 
			if (length < 1) {
				ModernizedCProgram.data.Curl_infof("(Empty suboption?)");
				return /*Error: Unsupported expression*/;
			} 
			if (((pointer[0]) <= 39)) {
				switch (pointer[0]) {
				case 31:
						ModernizedCProgram.data.Curl_infof("%s", ModernizedCProgram.telnetoptions[pointer[0]]);
						break;
				case 39:
				case 35:
				case 24:
				default:
						ModernizedCProgram.data.Curl_infof("%s (unsupported)", ModernizedCProgram.telnetoptions[pointer[0]]);
						break;
				}
			} else {
					ModernizedCProgram.data.Curl_infof("%d (unknown)", pointer[i]);
			} 
			switch (pointer[0]) {
			case 31:
					if (length > 4) {
						ModernizedCProgram.data.Curl_infof("Width: %d ; Height: %d", (pointer[1] << 8) | pointer[2], (pointer[3] << 8) | pointer[4]);
					} 
					break;
			default:
					switch (pointer[1]) {
					case 3:
							ModernizedCProgram.data.Curl_infof(" NAME");
							break;
					case 2:
							ModernizedCProgram.data.Curl_infof(" INFO/REPLY");
							break;
					case 0:
							ModernizedCProgram.data.Curl_infof(" IS");
							break;
					case 1:
							ModernizedCProgram.data.Curl_infof(" SEND");
							break;
					}
					switch (pointer[0]) {
					case 24:
					case 39:
							if (pointer[1] == 0) {
								ModernizedCProgram.data.Curl_infof(" ");
								for (i = 3; i < length; i++) {
									switch (pointer[i]) {
									case 0:
											ModernizedCProgram.data.Curl_infof(", ");
											break;
									case 1:
											ModernizedCProgram.data.Curl_infof(" = ");
											break;
									default:
											ModernizedCProgram.data.Curl_infof("%c", pointer[i]);
											break;
									}
								}
							} 
							break;
					case 35:
							pointer[length] = 0;
							ModernizedCProgram.data.Curl_infof(" \"%s\"", pointer[2]);
							break;
					default:
							for (i = 2; i < length; i++) {
								ModernizedCProgram.data.Curl_infof(" %.2x", pointer[i]);
							}
							break;
					}
			}
			if (direction) {
				ModernizedCProgram.data.Curl_infof("\n");
			} 
		} 
	}
	/* '<' or '>' */
	/* where suboption data is */
	public Byte unescape_word(Object inputbuff) {
		byte newp = ((Object)0);
		byte dictp;
		size_t len = new size_t();
		 result = ModernizedCProgram.data.Curl_urldecode(inputbuff, 0, newp, len, 0);
		if (!newp || result) {
			return ((Object)0);
		} 
		dictp = /*Error: Function owner not recognized*/Curl_cmalloc(len * 2 + /* add one for terminating zero */1);
		if (dictp) {
			byte ptr;
			byte ch;
			int olen = 0/* According to RFC2229 section 2.2, these letters need to be escaped with
			       \[letter] */;
			for (ptr = newp; (ch = ptr) != 0; ptr++) {
				if ((ch <= 32) || (ch == 127) || (ch == (byte)'\'') || (ch == (byte)'\"') || (ch == (byte)'\\')) {
					dictp[olen++] = (byte)'\\';
				} 
				dictp[olen++] = ch;
			}
			dictp[olen] = 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(newp);
		return dictp;
	}
	public void Curl_http_auth_cleanup_digest() {
		ModernizedCProgram.data.getState().getDigest().Curl_auth_digest_cleanup();
		ModernizedCProgram.data.getState().getProxydigest().Curl_auth_digest_cleanup();
	}
	public void tcpkeepalive(Object sockfd) {
		int optval = ModernizedCProgram.data.getSet().getTcp_keepalive() ? 1 : 0;
		if (/*Error: Function owner not recognized*/setsockopt(sockfd, -1024, /* only set IDLE and INTVL if setting KEEPALIVE is successful */8, (Object)optval, /*Error: sizeof expression not supported yet*/) < 0) {
			ModernizedCProgram.data.Curl_infof("Failed to set SO_KEEPALIVE on fd %d\n", sockfd);
		} else {
				tcp_keepalive vals = new tcp_keepalive();
				DWORD dummy = new DWORD();
				vals.setOnoff(1);
				optval = ModernizedCProgram.curlx_sltosi(ModernizedCProgram.data.getSet().getTcp_keepidle());
				(optval *= 1000);
				vals.setKeepalivetime(optval);
				optval = ModernizedCProgram.curlx_sltosi(ModernizedCProgram.data.getSet().getTcp_keepintvl());
				(optval *= 1000);
				vals.setKeepaliveinterval(optval);
				if (/*Error: Function owner not recognized*/WSAIoctl(sockfd, (-1024 | (true) | (true)), (LPVOID)vals, /*Error: sizeof expression not supported yet*/, ((Object)0), 0, dummy, ((Object)0), ((Object)0)) != 0) {
					ModernizedCProgram.data.Curl_infof("Failed to set SIO_KEEPALIVE_VALS on fd %d: %d\n", (int)sockfd, /*Error: Function owner not recognized*/WSAGetLastError());
				} 
		} 
	}
	public Object base64_encode(Object[] table64, Object inputbuff, Object insize, Byte outptr, Object outlen) {
		 result = new ();
		byte[] ibuf = new byte[3];
		byte[] obuf = new byte[4];
		int i;
		int inputparts;
		byte output;
		byte base64data;
		byte convbuf = ((Object)0);
		byte indata = inputbuff;
		outptr = ((Object)0);
		outlen = 0;
		if (!insize) {
			insize = /*Error: Function owner not recognized*/strlen(indata);
		} 
		if (insize > UINT_MAX / 4) {
			return CURLE_OUT_OF_MEMORY;
		} 
		base64data = output = /*Error: Function owner not recognized*/Curl_cmalloc(insize * 4 / 3 + 4);
		if (!output) {
			return CURLE_OUT_OF_MEMORY/*
			   * The base64 data needs to be created using the network encoding
			   * not the host encoding.  And we can't change the actual input
			   * so we copy it to a buffer, translate it, and use that instead.
			   */;
		} 
		result = ();
		if (result) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(output);
			return result;
		} 
		if (convbuf) {
			indata = (byte)convbuf;
		} 
		while (insize > 0) {
			for (i = inputparts = 0; i < 3; i++) {
				if (insize > 0) {
					inputparts++;
					ibuf[i] = (byte)indata;
					indata++;
					insize--;
				} else {
						ibuf[i] = 0;
				} 
			}
			obuf[0] = (byte)((ibuf[0] & -1024) >> 2);
			obuf[1] = (byte)(((ibuf[0] & -1024) << 4) | ((ibuf[1] & -1024) >> 4));
			obuf[2] = (byte)(((ibuf[1] & -1024) << 2) | ((ibuf[2] & -1024) >> 6));
			obuf[3] = (byte)(ibuf[2] & -1024);
			switch (inputparts) {
			case /* two bytes read */2:
					ModernizedCProgram.curl_msnprintf(output, 5, "%c%c%c=", table64[obuf[0]], table64[obuf[1]], table64[obuf[2]]);
					break;
			case /* only one byte read */1:
					ModernizedCProgram.curl_msnprintf(output, 5, "%c%c==", table64[obuf[0]], table64[obuf[1]]);
					break;
			default:
					ModernizedCProgram.curl_msnprintf(output, 5, "%c%c%c%c", table64[obuf[0]], table64[obuf[1]], table64[obuf[2]], table64[obuf[3]]);
					break;
			}
			output += 4;
		}
		output = /* Zero terminate */(byte)'\0';
		outptr = /* Return the pointer to the new data (allocated memory) */base64data;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(convbuf);
		outlen = /*Error: Function owner not recognized*/strlen(/* Return the length of the new data */base64data);
		return CURLE_OK/*
		 * Curl_base64_encode()
		 *
		 * Given a pointer to an input buffer and an input size, encode it and
		 * return a pointer in *outptr to a newly allocated memory area holding
		 * encoded data. Size of encoded data is returned in variable pointed by
		 * outlen.
		 *
		 * Input length of 0 indicates input buffer holds a NUL-terminated string.
		 *
		 * Returns CURLE_OK on success, otherwise specific error code. Function
		 * output shall not be considered valid unless CURLE_OK is returned.
		 *
		 * When encoded data length is 0, returns NULL in *outptr.
		 *
		 * @unittest: 1302
		 */;
	}
	public Object Curl_base64_encode(Object inputbuff, Object insize, Byte outptr, Object outlen) {
		return ModernizedCProgram.data.base64_encode(ModernizedCProgram.base64, inputbuff, insize, outptr, outlen/*
		 * Curl_base64url_encode()
		 *
		 * Given a pointer to an input buffer and an input size, encode it and
		 * return a pointer in *outptr to a newly allocated memory area holding
		 * encoded data. Size of encoded data is returned in variable pointed by
		 * outlen.
		 *
		 * Input length of 0 indicates input buffer holds a NUL-terminated string.
		 *
		 * Returns CURLE_OK on success, otherwise specific error code. Function
		 * output shall not be considered valid unless CURLE_OK is returned.
		 *
		 * When encoded data length is 0, returns NULL in *outptr.
		 *
		 * @unittest: 1302
		 */);
	}
	public Object Curl_base64url_encode(Object inputbuff, Object insize, Byte outptr, Object outlen) {
		return ModernizedCProgram.data.base64_encode(ModernizedCProgram.base64url, inputbuff, insize, outptr, outlen/* no users so disabled */);
	}
	public void expect_timer_seconds(int seconds) {
		byte[] msg = new byte[64];
		ModernizedCProgram.curl_msnprintf(msg, /*Error: sizeof expression not supported yet*/, "about %d seconds should have passed", seconds);
		if (!(ModernizedCProgram.usec_matches_seconds(ModernizedCProgram.data.getProgress().getT_nslookup(), seconds))) {
			(_iob[2]).curl_mfprintf("%s:%d Assertion '%s' failed: %s\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Curl\\src\\unit1399.c", 67, "usec_matches_seconds(data->progress.t_nslookup, seconds)", msg);
			ModernizedCProgram.unitfail++;
		} 
		;
		if (!(ModernizedCProgram.usec_matches_seconds(ModernizedCProgram.data.getProgress().getT_connect(), seconds))) {
			(_iob[2]).curl_mfprintf("%s:%d Assertion '%s' failed: %s\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Curl\\src\\unit1399.c", 68, "usec_matches_seconds(data->progress.t_connect, seconds)", msg);
			ModernizedCProgram.unitfail++;
		} 
		;
		if (!(ModernizedCProgram.usec_matches_seconds(ModernizedCProgram.data.getProgress().getT_appconnect(), seconds))) {
			(_iob[2]).curl_mfprintf("%s:%d Assertion '%s' failed: %s\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Curl\\src\\unit1399.c", 69, "usec_matches_seconds(data->progress.t_appconnect, seconds)", msg);
			ModernizedCProgram.unitfail++;
		} 
		;
		if (!(ModernizedCProgram.usec_matches_seconds(ModernizedCProgram.data.getProgress().getT_pretransfer(), seconds))) {
			(_iob[2]).curl_mfprintf("%s:%d Assertion '%s' failed: %s\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Curl\\src\\unit1399.c", 71, "usec_matches_seconds(data->progress.t_pretransfer, seconds)", msg);
			ModernizedCProgram.unitfail++;
		} 
		;
		if (!(ModernizedCProgram.usec_matches_seconds(ModernizedCProgram.data.getProgress().getT_starttransfer(), seconds))) {
			(_iob[2]).curl_mfprintf("%s:%d Assertion '%s' failed: %s\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Curl\\src\\unit1399.c", 73, "usec_matches_seconds(data->progress.t_starttransfer, seconds)", msg);
			ModernizedCProgram.unitfail++;
		} 
		;/* Scenario: simulate a redirect. When a redirect occurs, t_nslookup,
		 * t_connect, t_appconnect, t_pretransfer, and t_starttransfer are addative.
		 * E.g., if t_starttransfer took 2 seconds initially and took another 1
		 * second for the redirect request, then the resulting t_starttransfer should
		 * be 3 seconds. */
	}
	public Object Curl_auth_create_digest_md5_message(Object chlg64, Object userp, Object passwdp, Object service, Byte outptr, Object outlen) {
		size_t i = new size_t();
		MD5_context ctxt = new MD5_context();
		byte response = ((Object)0);
		byte[] digest = new byte[16];
		byte[] HA1_hex = new byte[2 * 16 + 1];
		byte[] HA2_hex = new byte[2 * 16 + 1];
		byte[] resp_hash_hex = new byte[2 * 16 + 1];
		byte[] nonce = new byte[64];
		byte[] realm = new byte[128];
		byte[] algorithm = new byte[64];
		byte[] qop_options = new byte[64];
		int qop_values;
		byte[] cnonce = new byte[33];
		byte[] nonceCount = "00000001";
		byte[] method = "AUTHENTICATE";
		byte[] qop = "auth";
		byte spn = ((Object)0);
		 result = ModernizedCProgram.auth_decode_digest_md5_message(chlg64, /* Decode the challenge message */nonce, /*Error: sizeof expression not supported yet*/, realm, /*Error: sizeof expression not supported yet*/, algorithm, /*Error: sizeof expression not supported yet*/, qop_options, /*Error: sizeof expression not supported yet*/);
		if (result) {
			return result;
		} 
		if (/*Error: Function owner not recognized*/strcmp(algorithm, "md5-sess") != /* We only support md5 sessions */0) {
			return CURLE_BAD_CONTENT_ENCODING;
		} 
		result = ModernizedCProgram.auth_digest_get_qop_values(qop_options, /* Get the qop-values from the qop-options */qop_values);
		if (result) {
			return result;
		} 
		if (!(qop_values & (1 << /* We only support auth quality-of-protection */0))) {
			return CURLE_BAD_CONTENT_ENCODING;
		} 
		result = ModernizedCProgram.Curl_rand_hex(ModernizedCProgram.data, (byte)cnonce, /*Error: sizeof expression not supported yet*/);
		if (result) {
			return result;
		} 
		ctxt = ModernizedCProgram.Curl_MD5_init(/* So far so good, now calculate A1 and H(A1) according to RFC 2831 */ModernizedCProgram.Curl_DIGEST_MD5);
		if (!ctxt) {
			return CURLE_OUT_OF_MEMORY;
		} 
		ctxt.Curl_MD5_update((byte)userp, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(userp)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)realm, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(realm)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)passwdp, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(passwdp)));
		ctxt.Curl_MD5_final(digest);
		ctxt = ModernizedCProgram.Curl_MD5_init(ModernizedCProgram.Curl_DIGEST_MD5);
		if (!ctxt) {
			return CURLE_OUT_OF_MEMORY;
		} 
		ctxt.Curl_MD5_update((byte)digest, 16);
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)nonce, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(nonce)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)cnonce, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(cnonce)));
		ctxt.Curl_MD5_final(digest);
		for (i = 0; i < 16; /* Convert calculated 16 octet hex into 32 bytes string */i++) {
			ModernizedCProgram.curl_msnprintf(HA1_hex[2 * i], 3, "%02x", digest[i]);
		}
		spn = ModernizedCProgram.Curl_auth_build_spn(service, realm, ((Object)/* Generate our SPN */0));
		if (!spn) {
			return CURLE_OUT_OF_MEMORY;
		} 
		ctxt = ModernizedCProgram.Curl_MD5_init(/* Calculate H(A2) */ModernizedCProgram.Curl_DIGEST_MD5);
		if (!ctxt) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(spn);
			return CURLE_OUT_OF_MEMORY;
		} 
		ctxt.Curl_MD5_update((byte)method, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(method)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)spn, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(spn)));
		ctxt.Curl_MD5_final(digest);
		for (i = 0; i < 16; i++) {
			ModernizedCProgram.curl_msnprintf(HA2_hex[2 * i], 3, "%02x", digest[i]);
		}
		ctxt = ModernizedCProgram.Curl_MD5_init(/* Now calculate the response hash */ModernizedCProgram.Curl_DIGEST_MD5);
		if (!ctxt) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(spn);
			return CURLE_OUT_OF_MEMORY;
		} 
		ctxt.Curl_MD5_update((byte)HA1_hex, 2 * 16);
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)nonce, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(nonce)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)nonceCount, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(nonceCount)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)cnonce, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(cnonce)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)qop, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(qop)));
		ctxt.Curl_MD5_update((byte)":", 1);
		ctxt.Curl_MD5_update((byte)HA2_hex, 2 * 16);
		ctxt.Curl_MD5_final(digest);
		for (i = 0; i < 16; i++) {
			ModernizedCProgram.curl_msnprintf(resp_hash_hex[2 * i], 3, "%02x", digest[i]);
		}
		response = ModernizedCProgram.curl_maprintf(/* Generate the response */"username=\"%s\",realm=\"%s\",nonce=\"%s\",cnonce=\"%s\",nc=\"%s\",digest-uri=\"%s\",response=%s,qop=%s", userp, realm, nonce, cnonce, nonceCount, spn, resp_hash_hex, qop);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(spn);
		if (!response) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.data.Curl_base64_encode(response, 0, outptr, /* Base64 encode the response */outlen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(response);
		return result/*
		 * Curl_auth_decode_digest_http_message()
		 *
		 * This is used to decode a HTTP DIGEST challenge message into the separate
		 * attributes.
		 *
		 * Parameters:
		 *
		 * chlg    [in]     - The challenge message.
		 * digest  [in/out] - The digest data struct being used and modified.
		 *
		 * Returns CURLE_OK on success.
		 */;
	}
	public  checkhttpprefix(Object s, Object len) {
		curl_slist head = ModernizedCProgram.data.getSet().getHttp200aliases();
		statusline rc = .STATUS_BAD;
		statusline onmatch = len >= 5 ? .STATUS_DONE : .STATUS_UNKNOWN/* convert from the network encoding using a scratch area */;
		/* can't return CURLE_OUT_OF_MEMORY so return FALSE */
		Object generatedCurl_slist = head.getCurl_slist();
		/* Curl_convert_from_network calls failf if unsuccessful */while (/* can't return CURLE_foobar so return FALSE *//* CURL_DOES_CONVERSIONS */head) {
			if (ModernizedCProgram.checkprefixmax(generatedCurl_slist, s, len)) {
				rc = onmatch;
				break;
			} 
			head = generatedCurl_slist;
		}
		if ((rc != .STATUS_DONE) && (ModernizedCProgram.checkprefixmax("HTTP/", s, len))) {
			rc = onmatch;
		} 
		return /* CURL_DOES_CONVERSIONS */rc;
	}
	public  checkrtspprefix(Object s, Object len) {
		statusline result = .STATUS_BAD;
		statusline onmatch = len >= 5 ? .STATUS_DONE : .STATUS_UNKNOWN/* convert from the network encoding using a scratch area */;
		/* can't return CURLE_OUT_OF_MEMORY so return FALSE */
		/* Curl_convert_from_network calls failf if unsuccessful *//* can't return CURLE_foobar so return FALSE *//* Curl_convert_from_network calls failf if unsuccessful *//* can't return CURLE_foobar so return FALSE */(Object)/* unused */ModernizedCProgram.data;
		if (ModernizedCProgram.checkprefixmax("RTSP/", s, len)) {
			result = onmatch/* CURL_DOES_CONVERSIONS */;
		} 
		return result/* CURL_DISABLE_RTSP */;
	}
	public void print_http_error() {
		SingleRequest k = ModernizedCProgram.data.getReq();
		byte[] generatedP = k.getP();
		byte beg = generatedP;
		if (!/*Error: Function owner not recognized*/strncmp(beg, "HTTP", /* make sure that data->req.p points to the HTTP status line */4)) {
			beg = /*Error: Function owner not recognized*/strchr(beg, /* skip to HTTP status code */(byte)' ');
			if (beg && ++beg) {
				byte end_char = /* find trailing CR */(byte)'\r';
				byte end = /*Error: Function owner not recognized*/strchr(beg, end_char);
				if (!end) {
					end_char = /* try to find LF (workaround for non-compliant HTTP servers) */(byte)'\n';
					end = /*Error: Function owner not recognized*/strchr(beg, end_char);
				} 
				if (end) {
					end = /* temporarily replace CR or LF by NUL and print the error message */(byte)'\0';
					ModernizedCProgram.data.Curl_failf("The requested URL returned error: %s", beg);
					end = /* restore the previously replaced CR or LF */end_char;
					return /*Error: Unsupported expression*/;
				} 
			} 
		} 
		int generatedHttpcode = k.getHttpcode();
		ModernizedCProgram.data.Curl_failf("The requested URL returned error: %d", generatedHttpcode);
	}
	/*
	 * Set up lanmanager hashed password
	 */
	public Object Curl_ntlm_core_mk_lm_hash(Object password, Byte lmbuffer) {
		/* 21 bytes */ result = new ();
		byte[] pw = new byte[14];
		byte[] magic = new byte[]{-1024, -1024, -1024, -1024, -1024, -1024, -1024, /* i.e. KGS!@#$% */-1024};
		size_t len = ((/*Error: Function owner not recognized*/strlen(password)) < (true) ? (/*Error: Function owner not recognized*/strlen(password)) : (true));
		ModernizedCProgram.Curl_strntoupper((byte)pw, password, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pw[len], 0, 14 - len/*
		   * The LanManager hashed password needs to be created using the
		   * password in the network encoding not the host encoding.
		   */);
		result = ();
		if (result) {
			return result/* Create LanManager hashed password. */;
		} 
		{ 
			ModernizedCProgram.encrypt_des(magic, lmbuffer, pw);
			ModernizedCProgram.encrypt_des(magic, lmbuffer + 8, pw + 7);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(lmbuffer + 16, 0, 21 - 16);
		}
		return CURLE_OK;
	}
	/*
	 * Set up nt hashed passwords
	 * @unittest: 1600
	 */
	public Object Curl_ntlm_core_mk_nt_hash(Object password, Byte ntbuffer) {
		size_t len = /*Error: Function owner not recognized*/strlen(/* 21 bytes */password);
		byte pw;
		 result = new ();
		if (len > -1024 / /* avoid integer overflow */2) {
			return CURLE_OUT_OF_MEMORY;
		} 
		pw = len ? /*Error: Function owner not recognized*/Curl_cmalloc(len * 2) : (byte)/*Error: Function owner not recognized*/Curl_cstrdup("");
		if (!pw) {
			return CURLE_OUT_OF_MEMORY;
		} 
		ModernizedCProgram.ascii_to_unicode_le(pw, password, len/*
		   * The NT hashed password needs to be created using the password in the
		   * network encoding not the host encoding.
		   */);
		result = ();
		if (result) {
			return result;
		} 
		ModernizedCProgram.Curl_md4it(ntbuffer, pw, 2 * /* Create NT hashed password. */len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ntbuffer + 16, 0, 21 - 16);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(pw);
		return CURLE_OK;
	}
	public Byte curl_easy_escape(Object string, int inlength) {
		size_t alloc = new size_t();
		byte ns;
		byte testing_ptr = ((Object)0);
		size_t newlen = new size_t();
		size_t strindex = 0;
		size_t length = new size_t();
		 result = new ();
		if (inlength < 0) {
			return ((Object)0);
		} 
		alloc = (inlength ? (size_t)inlength : /*Error: Function owner not recognized*/strlen(string)) + 1;
		newlen = alloc;
		ns = /*Error: Function owner not recognized*/Curl_cmalloc(alloc);
		if (!ns) {
			return ((Object)0);
		} 
		length = alloc - 1;
		while (length--) {
			byte in = /* we need to treat the characters unsigned */string;
			if (ModernizedCProgram.Curl_isunreserved(in)) {
				ns[strindex++] = /* just copy this */in;
			} else {
					newlen += /* encode it *//* the size grows with two, since this'll become a %XX */2;
					if (newlen > alloc) {
						alloc *= 2;
						testing_ptr = ModernizedCProgram.Curl_saferealloc(ns, alloc);
						if (!testing_ptr) {
							return ((Object)0);
						} 
						ns = testing_ptr;
					} 
					result = ();
					if (result) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* Curl_convert_to_network calls failf if unsuccessful */ns);
						return ((Object)0);
					} 
					ModernizedCProgram.curl_msnprintf(ns[strindex], 4, "%%%02X", in);
					strindex += 3;
			} 
			string++;
		}
		ns[strindex] = /* terminate it */0;
		return ns/*
		 * Curl_urldecode() URL decodes the given string.
		 *
		 * Optionally detects control characters (byte codes lower than 32) in the
		 * data and rejects such data.
		 *
		 * Returns a pointer to a malloced string in *ostring with length given in
		 * *olen. If length == 0, the length is assumed to be strlen(string).
		 *
		 * 'data' can be set to NULL but then this function can't convert network
		 * data to host for non-ascii.
		 */;
	}
	public Object Curl_urldecode(Object[] string, Object length, Byte ostring, Object olen,  reject_ctrl) {
		size_t alloc = (length ? length : /*Error: Function owner not recognized*/strlen(string)) + 1;
		byte ns = /*Error: Function owner not recognized*/Curl_cmalloc(alloc);
		size_t strindex = 0;
		long hex;
		 result = CURLE_OK;
		if (!ns) {
			return CURLE_OUT_OF_MEMORY;
		} 
		while (--alloc > 0) {
			byte in = string;
			if (((byte)'%' == in) && (alloc > 2) && (ModernizedCProgram.Curl_isxdigit((int)((byte)string[1]))) && (ModernizedCProgram.Curl_isxdigit((int)((byte)string[2])))) {
				byte[] hexstr = new byte[/* this is two hexadecimal digits following a '%' */3];
				byte ptr;
				hexstr[0] = string[1];
				hexstr[1] = string[2];
				hexstr[2] = 0;
				hex = /*Error: Function owner not recognized*/strtoul(hexstr, ptr, 16);
				in = ModernizedCProgram.curlx_ultouc(/* this long is never bigger than 255 anyway */hex);
				if (ModernizedCProgram.data) {
					result = ();
					if (result) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* Curl_convert_from_network calls failf if unsuccessful */ns);
						return result;
					} 
				} 
				string += 2;
				alloc -= 2;
			} 
			if (reject_ctrl && (in < -1024)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ns);
				return CURLE_URL_MALFORMAT;
			} 
			ns[strindex++] = in;
			string++;
		}
		ns[strindex] = /* terminate it */0;
		if (olen) {
			olen = /* store output size */strindex;
		} 
		ostring = /* store output string */ns;
		return CURLE_OK/*
		 * Unescapes the given URL escaped string of given length. Returns a
		 * pointer to a malloced string with length given in *olen.
		 * If length == 0, the length is assumed to be strlen(string).
		 * If olen == NULL, no output length is stored.
		 */;
	}
	public Byte curl_easy_unescape(Object string, int length, Integer olen) {
		byte str = ((Object)0);
		if (length >= 0) {
			size_t inputlen = length;
			size_t outputlen = new size_t();
			 res = ModernizedCProgram.data.Curl_urldecode(string, inputlen, str, outputlen, 0);
			if (ModernizedCProgram.res) {
				return ((Object)0);
			} 
			if (olen) {
				if (outputlen <= (size_t)INT_MAX) {
					olen = ModernizedCProgram.curlx_uztosi(outputlen);
				} else {
						do {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((str));
							(str) = ((Object)0);
						} while (/* too large to return in an int, fail! */0);
				} 
			} 
		} 
		return str/* For operating systems/environments that use different malloc/free
		   systems for the app and for this library, we provide a free that uses
		   the library's memory system */;
	}
	public void Curl_init_completed() {
		/* Important: reset the conn pointer so that we don't point to memory
		     that could be freed anytime */ModernizedCProgram.data.detach_connnection();
		/* stop all timers */ModernizedCProgram.data.Curl_expire_clear();
	}
	/* this is a completed transfer */
	/* always use this function to change state, to make debugging easier */
	public void mstate( state) {
		CURLMstate oldstate = ModernizedCProgram.data.getMstate();
		init_multistate_func[] finit = new init_multistate_func[]{((Object)/* INIT */0), ((Object)/* CONNECT_PEND */0), /* CONNECT */ModernizedCProgram.Curl_init_CONNECT, ((Object)/* WAITRESOLVE */0), ((Object)/* WAITCONNECT */0), ((Object)/* WAITPROXYCONNECT */0), ((Object)/* SENDPROTOCONNECT */0), ((Object)/* PROTOCONNECT */0), /* DO */ModernizedCProgram.Curl_connect_free, ((Object)/* DOING */0), ((Object)/* DO_MORE */0), ((Object)/* DO_DONE */0), ((Object)/* PERFORM */0), ((Object)/* TOOFAST */0), ((Object)/* DONE */0), /* COMPLETED */Curl_init_completed, ((Object)/* MSGSENT */0)};
		if (oldstate == state/* don't bother when the new state is the same as the old state */) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.data.setMstate(state);
		if (state == .CURLM_STATE_COMPLETED) {
			ModernizedCProgram.data.getMulti().getNum_alive()--;
		} 
		if (finit[/* if this state has an init-function, run it */state]) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.data);
		} 
	}
	public Object multi_done(Object status,  premature) {
		 result = new ();
		connectdata conn = ModernizedCProgram.data.getConn();
		int i;
		do {
		} while (0);
		if (ModernizedCProgram.data.getState().getDone()) {
			return /* Stop if multi_done() has already been called */CURLE_OK;
		} 
		/* Stop the resolver and free its own resources (but not dns_entry yet). */conn.Curl_resolver_kill();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getReq().getNewurl()));
			(ModernizedCProgram.data.getReq().getNewurl()) = ((Object)0);
		} while (/* Cleanup possible redirect junk */0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getReq().getLocation()));
			(ModernizedCProgram.data.getReq().getLocation()) = ((Object)0);
		} while (0);
		switch (status) {
		case CURLE_WRITE_ERROR/* When we're aborted due to a callback return code it basically have to
		       be counted as premature as there is trouble ahead if we don't. We have
		       many callbacks and protocols work differently, we could potentially do
		       this more fine-grained in the future. */:
				premature = 1;
		case CURLE_ABORTED_BY_CALLBACK:
		case CURLE_READ_ERROR:
		default:
				break;
		}
		Object generatedHandler = conn.getHandler();
		if (generatedHandler.getDone()) {
			result = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(conn, status, premature);
		} else {
				result = status;
		} 
		if (CURLE_ABORTED_BY_CALLBACK != result/* avoid this if we already aborted by callback to avoid this calling
		       another callback */) {
			 rc = conn.Curl_pgrsDone();
			if (!result && rc) {
				result = CURLE_ABORTED_BY_CALLBACK;
			} 
		} 
		ModernizedCProgram.data.getMulti().process_pending_handles();
		ModernizedCProgram.data.detach_connnection();
		curl_llist generatedEasyq = (conn).getEasyq();
		Object generatedSize = generatedEasyq.getSize();
		if ((generatedSize)) {
			do {
			} while (/* Stop if still used. */0);
			return CURLE_OK;
		} 
		ModernizedCProgram.data.getState().setDone(/* called just now! */1);
		Curl_dns_entry generatedDns_entry = conn.getDns_entry();
		if (generatedDns_entry) {
			ModernizedCProgram.Curl_resolv_unlock(ModernizedCProgram.data, generatedDns_entry);
			conn.setDns_entry(((Object)0));
		} 
		ModernizedCProgram.data.Curl_hostcache_prune();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getUlbuf()));
			(ModernizedCProgram.data.getState().getUlbuf()) = ((Object)0);
		} while (0);
		for (i = 0; i < ModernizedCProgram.data.getState().getTempcount(); /* if the transfer was completed in a paused state there can be buffered
		     data left to free */i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data.getState().getTempwrite()[i].getBuf());
		}
		ModernizedCProgram.data.getState().setTempcount(0/* if data->set.reuse_forbid is TRUE, it means the libcurl client has
		     forced us to close this connection. This is ignored for requests taking
		     place in a NTLM/NEGOTIATE authentication handshake
		
		     if conn->bits.close is TRUE, it means that the connection should be
		     closed in spite of all our efforts to be nice, due to protocol
		     restrictions in our or the server's end
		
		     if premature is TRUE, it means this connection was said to be DONE before
		     the entire request operation is complete and thus we can't know in what
		     state it is for re-using, so we're forced to close it. In a perfect world
		     we can add code that keep track of if we really must close it here or not,
		     but currently we have no such detail knowledge.
		  */);
		 generatedHttp_ntlm_state = conn.getHttp_ntlm_state();
		 generatedProxy_ntlm_state = conn.getProxy_ntlm_state();
		ConnectBits generatedBits = conn.getBits();
		Object generatedClose = generatedBits.getClose();
		long generatedConnection_id = conn.getConnection_id();
		Object generatedSocksproxy = generatedBits.getSocksproxy();
		proxy_info generatedSocks_proxy = conn.getSocks_proxy();
		hostname generatedHost = generatedSocks_proxy.getHost();
		Object generatedDispname = generatedHost.getDispname();
		Object generatedHttpproxy = generatedBits.getHttpproxy();
		Object generatedConn_to_host = generatedBits.getConn_to_host();
		if ((ModernizedCProgram.data.getSet().getReuse_forbid() && !(generatedHttp_ntlm_state == .NTLMSTATE_TYPE2 || generatedProxy_ntlm_state == .NTLMSTATE_TYPE2)) || generatedClose || (premature && !(generatedHandler.getFlags() & (1 << 9)))) {
			 res2 = ModernizedCProgram.Curl_disconnect(ModernizedCProgram.data, conn, premature);
			if (!result && /* If we had an error already, make sure we return that one. But
			       if we got a new error, return that. */res2) {
				result = res2;
			} 
		} else {
				byte[] buffer = new byte[256];
				ModernizedCProgram.curl_msnprintf(ModernizedCProgram.buffer, /*Error: sizeof expression not supported yet*/, "Connection #%ld to host %s left intact", generatedConnection_id, generatedSocksproxy ? generatedDispname : generatedHttpproxy ? generatedDispname : generatedConn_to_host ? generatedDispname : generatedDispname);
				if (/* the connection is no longer in use by this transfer */conn.Curl_conncache_return_conn()) {
					ModernizedCProgram.data.getState().setLastconnect(/* remember the most recently used connection */conn);
					ModernizedCProgram.data.Curl_infof("%s\n", ModernizedCProgram.buffer);
				} else {
						ModernizedCProgram.data.getState().setLastconnect(((Object)0));
				} 
		} 
		ModernizedCProgram.data.Curl_free_request_state();
		return result;
	}
	/* an error if this is called
	                                                after an error was detected */
	/* This is the only function that should clear data->conn. This will
	   occasionally be called with the pointer already cleared. */
	public void detach_connnection() {
		connectdata conn = ModernizedCProgram.data.getConn();
		curl_llist generatedEasyq = conn.getEasyq();
		if (conn) {
			ModernizedCProgram.Curl_llist_remove(generatedEasyq, ModernizedCProgram.data.getConn_queue(), ((Object)0));
		} 
		ModernizedCProgram.data.setConn(((Object)0));
	}
	/* returns bitmapped flags for this handle and its sockets. The 'socks[]'
	   array contains MAX_SOCKSPEREASYHANDLE entries. */
	public int multi_getsock(Object socks) {
		if (!ModernizedCProgram.data.getConn()) {
			return 0;
		} 
		if (ModernizedCProgram.data.getMstate() > .CURLM_STATE_CONNECT && ModernizedCProgram.data.getMstate() < .CURLM_STATE_COMPLETED) {
			ModernizedCProgram.data.getConn().setData(/* Set up ownership correctly */ModernizedCProgram.data);
		} 
		switch (ModernizedCProgram.data.getMstate()) {
		case .CURLM_STATE_WAITRESOLVE:
				return ModernizedCProgram.data.getConn().Curl_resolv_getsock(socks);
		case .CURLM_STATE_PERFORM:
				return ModernizedCProgram.Curl_single_getsock(ModernizedCProgram.data.getConn(), socks);
		case .CURLM_STATE_PROTOCONNECT:
		case .CURLM_STATE_SENDPROTOCONNECT:
				return ModernizedCProgram.data.getConn().protocol_getsock(socks);
		case .CURLM_STATE_DO:
		case .CURLM_STATE_WAITPROXYCONNECT:
				return ModernizedCProgram.data.getConn().waitproxyconnect_getsock(socks);
		case .CURLM_STATE_DO_MORE:
				return ModernizedCProgram.data.getConn().domore_getsock(socks);
		case .CURLM_STATE_DOING:
				return ModernizedCProgram.data.getConn().doing_getsock(socks);
		case .CURLM_STATE_WAITCONNECT:
				return ModernizedCProgram.data.getConn().waitconnect_getsock(socks);
		case /* since is set after DO is completed, we switch
		                               to waiting for the same as the *PERFORM
		                               states */.CURLM_STATE_DO_DONE:
		default:
				return /* this will get called with CURLM_STATE_COMPLETED when a handle is
				       removed */0;
		}
	}
	public Object multi_do( done) {
		 result = CURLE_OK;
		connectdata conn = ModernizedCProgram.data.getConn();
		do {
		} while (0);
		do {
		} while (0);
		Object generatedHandler = conn.getHandler();
		if (generatedHandler.getDo_it()) {
			result = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(conn, /* generic protocol-specific function pointer set in curl_connect() */done);
			if (!result && done) {
				/* do_complete must be called after the protocol-specific DO function */conn.do_complete();
			} 
		} 
		return result/*
		 * multi_do_more() is called during the DO_MORE multi state. It is basically a
		 * second stage DO state which (wrongly) was introduced to support FTP's
		 * second connection.
		 *
		 * 'complete' can return 0 for incomplete, 1 for done and -1 for go back to
		 * DOING state there's more work to do!
		 */;
	}
	public void Curl_updatesocket() {
		ModernizedCProgram.singlesocket(ModernizedCProgram.data.getMulti(), ModernizedCProgram.data/*
		 * Curl_multi_closed()
		 *
		 * Used by the connect code to tell the multi_socket code that one of the
		 * sockets we were using is about to be closed.  This function will then
		 * remove it from the sockethash for this handle to make the multi_socket API
		 * behave properly, especially for the case when libcurl will create another
		 * socket again and it gets the same file descriptor number.
		 */);
	}
	public void Curl_multi_closed(Object s) {
		curl_hash generatedSockhash = multi.getSockhash();
		Curl_sh_entry curl_sh_entry = new Curl_sh_entry();
		Object generatedSocket_cb = multi.getSocket_cb();
		Object generatedSocket_userp = multi.getSocket_userp();
		Object generatedSocketp = entry.getSocketp();
		if (ModernizedCProgram.data) {
			Curl_multi multi = ModernizedCProgram.data.getMulti();
			if (multi/* this is set if this connection is part of a handle that is added to
			         a multi handle, and only then this is necessary */) {
				Curl_sh_entry entry = curl_sh_entry.sh_getentry(generatedSockhash, s);
				if (entry) {
					if (generatedSocket_cb) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.data, s, CURL_POLL_REMOVE, generatedSocket_userp, generatedSocketp);
					} 
					ModernizedCProgram.sh_delentry(entry, generatedSockhash, /* now remove it from the socket hash */s);
				} 
			} 
		} 
	}
	public void multi_deltimeout( eid) {
		curl_llist_element e = new curl_llist_element();
		curl_llist timeoutlist = ModernizedCProgram.data.getState().getTimeoutlist();
		Object generatedPtr = e.getPtr();
		 generatedEid = n.getEid();
		curl_llist_element generatedNext = e.getNext();
		curl_llist_element generatedHead = timeoutlist.getHead();
		for (e = generatedHead; e; e = generatedNext) {
			time_node n = (time_node)generatedPtr;
			if (generatedEid == eid) {
				ModernizedCProgram.Curl_llist_remove(timeoutlist, e, ((Object)0));
				return /*Error: Unsupported expression*/;
			} 
		}
	}
	public void Curl_expire(Object milli,  id) {
		Curl_multi multi = ModernizedCProgram.data.getMulti();
		curltime nowp = ModernizedCProgram.data.getState().getExpiretime();
		curltime set = new curltime();
		if (!/* this is only interesting while there is still an associated multi struct
		     remaining! */multi) {
			return /*Error: Unsupported expression*/;
		} 
		do {
		} while (0);
		curltime curltime = new curltime();
		set = curltime.Curl_now();
		Object generatedTv_sec = set.getTv_sec();
		generatedTv_sec += (time_t)(milli / /* might be a 64 to 32 bit conversion */1000);
		int generatedTv_usec = set.getTv_usec();
		generatedTv_usec += (int)(milli % 1000) * 1000;
		if (generatedTv_usec >= 1000000) {
			generatedTv_sec++;
			generatedTv_usec -= 1000000;
		} 
		ModernizedCProgram.data.multi_deltimeout(/* Remove any timer with the same id just in case. */id);
		ModernizedCProgram.multi_addtimeout(ModernizedCProgram.data, set, /* Add it to the timer list.  It must stay in the list until it has expired
		     in case we need to recompute the minimum timer later. */id);
		Curl_tree generatedTimetree = multi.getTimetree();
		if (generatedTv_sec || generatedTv_usec) {
			timediff_t diff = set.Curl_timediff(nowp);
			int rc;
			if (diff > 0/* The current splay tree entry is sooner than this new expiry time.
			         We don't need to update our splay tree entry. */) {
				return /*Error: Unsupported expression*/;
			} 
			rc = generatedTimetree.Curl_splayremovebyaddr(ModernizedCProgram.data.getState().getTimenode(), generatedTimetree);
			if (rc) {
				ModernizedCProgram.data.Curl_infof("Internal error removing splay node = %d\n", rc);
			} 
		} 
		nowp = /* Indicate that we are in the splay tree and insert the new timer expiry
		     value since it is our local minimum. */set;
		ModernizedCProgram.data.getState().getTimenode().setPayload(ModernizedCProgram.data);
		multi.setTimetree(generatedTimetree.Curl_splayinsert(nowp, ModernizedCProgram.data.getState().getTimenode()));
	}
	public void Curl_expire_done( id) {
		ModernizedCProgram.data.multi_deltimeout(/* remove the timer, if there */id/*
		 * Curl_expire_clear()
		 *
		 * Clear ALL timeout values for this handle.
		 */);
	}
	public void Curl_expire_clear() {
		Curl_multi multi = ModernizedCProgram.data.getMulti();
		curltime nowp = ModernizedCProgram.data.getState().getExpiretime();
		if (!/* this is only interesting while there is still an associated multi struct
		     remaining! */multi) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedTv_sec = nowp.getTv_sec();
		int generatedTv_usec = nowp.getTv_usec();
		Curl_tree generatedTimetree = multi.getTimetree();
		Object generatedSize = list.getSize();
		curl_llist_element generatedTail = list.getTail();
		if (generatedTv_sec || generatedTv_usec) {
			curl_llist list = ModernizedCProgram.data.getState().getTimeoutlist();
			int rc;
			rc = generatedTimetree.Curl_splayremovebyaddr(ModernizedCProgram.data.getState().getTimenode(), generatedTimetree);
			if (rc) {
				ModernizedCProgram.data.Curl_infof("Internal error clearing splay node = %d\n", rc);
			} 
			while (generatedSize > /* flush the timeout list too */0) {
				ModernizedCProgram.Curl_llist_remove(list, generatedTail, ((Object)0));
			}
			nowp.setTv_sec(0);
			nowp.setTv_usec(0);
		} 
	}
	public void Curl_set_in_callback( value) {
		if (/* might get called when there is no data pointer! */ModernizedCProgram.data) {
			if (ModernizedCProgram.data.getMulti_easy()) {
				ModernizedCProgram.data.getMulti_easy().setIn_callback(value);
			}  else if (ModernizedCProgram.data.getMulti()) {
				ModernizedCProgram.data.getMulti().setIn_callback(value);
			} 
		} 
	}
	public  Curl_is_in_callback() {
		return ((ModernizedCProgram.easy.getMulti() && ModernizedCProgram.easy.getMulti().getIn_callback()) || (ModernizedCProgram.easy.getMulti_easy() && ModernizedCProgram.easy.getMulti_easy().getIn_callback()));
	}
	/* only display handles that are not completed */
	/* Create a mime handle. */
	public Object curl_mime_init() {
		 mime = new ();
		mime = ()/*Error: Function owner not recognized*/Curl_cmalloc(/*Error: sizeof expression not supported yet*/);
		if (mime) {
			mime.setEasy(ModernizedCProgram.easy);
			mime.setParent(((Object)0));
			mime.setFirstpart(((Object)0));
			mime.setLastpart(((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(mime.getBoundary(), (byte)'-', 24);
			if (ModernizedCProgram.Curl_rand_hex(ModernizedCProgram.easy, (byte)mime.getBoundary()[24], 16 + 1)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(/* failed to get random separator, bail out */mime);
				return ((Object)0);
			} 
			mime.getState().mimesetstate(mimestate.MIMESTATE_BEGIN, ((Object)0));
		} 
		return mime;
	}
	/* Initialize a mime part. */
	public void Curl_mime_initpart(Object part) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((byte)part, 0, /*Error: sizeof expression not supported yet*/);
		part.setEasy(ModernizedCProgram.easy);
		part.getState().mimesetstate(mimestate.MIMESTATE_BEGIN, ((Object)0));
	}
	public void Curl_freeset() {
		/* Free all dynamic strings stored in the data->set substructure. */dupstring i;
		for (dupstring.i = (dupstring)0; dupstring.i < dupstring.STRING_LAST; dupstring.i++) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getSet().getStr()[dupstring.i]));
				(ModernizedCProgram.data.getSet().getStr()[dupstring.i]) = ((Object)0);
			} while (0);
		}
		if (ModernizedCProgram.data.getChange().getReferer_alloc()) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getReferer()));
				(ModernizedCProgram.data.getChange().getReferer()) = ((Object)0);
			} while (0);
			ModernizedCProgram.data.getChange().setReferer_alloc(0);
		} 
		ModernizedCProgram.data.getChange().setReferer(((Object)0));
		if (ModernizedCProgram.data.getChange().getUrl_alloc()) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getUrl()));
				(ModernizedCProgram.data.getChange().getUrl()) = ((Object)0);
			} while (0);
			ModernizedCProgram.data.getChange().setUrl_alloc(0);
		} 
		ModernizedCProgram.data.getChange().setUrl(((Object)0));
		ModernizedCProgram.Curl_mime_cleanpart(ModernizedCProgram.data.getSet().getMimepost());
	}
	/* free the URL pieces */
	public void up_free() {
		urlpieces up = ModernizedCProgram.data.getState().getUp();
		Byte generatedScheme = up.getScheme();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedScheme));
			(generatedScheme) = ((Object)0);
		} while (0);
		Byte generatedHostname = up.getHostname();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedHostname));
			(generatedHostname) = ((Object)0);
		} while (0);
		Byte generatedPort = up.getPort();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedPort));
			(generatedPort) = ((Object)0);
		} while (0);
		Byte generatedUser = up.getUser();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedUser));
			(generatedUser) = ((Object)0);
		} while (0);
		Byte generatedPassword = up.getPassword();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedPassword));
			(generatedPassword) = ((Object)0);
		} while (0);
		Byte generatedOptions = up.getOptions();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedOptions));
			(generatedOptions) = ((Object)0);
		} while (0);
		byte[] generatedPath = up.getPath();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedPath));
			(generatedPath) = ((Object)0);
		} while (0);
		Byte generatedQuery = up.getQuery();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedQuery));
			(generatedQuery) = ((Object)0);
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_url_cleanup(ModernizedCProgram.data.getState().getUh());
		ModernizedCProgram.data.getState().setUh(((Object)0/*
		 * This is the internal function curl_easy_cleanup() calls. This should
		 * cleanup and free all resources associated with this sessionhandle.
		 *
		 * NOTE: if we ever add something that attempts to write to a socket or
		 * similar here, we must ignore SIGPIPE first. It is currently only done
		 * when curl_easy_perform() is invoked.
		 */));
	}
	public Object Curl_close() {
		Curl_multi m = new Curl_multi();
		if (!ModernizedCProgram.data) {
			return CURLE_OK;
		} 
		/* shut off timers */ModernizedCProgram.data.Curl_expire_clear();
		m = ModernizedCProgram.data.getMulti();
		if (m/* This handle is still part of a multi handle, take care of this first
		       and detach this handle from there. */) {
			ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.data.getMulti(), ModernizedCProgram.data);
		} 
		if (ModernizedCProgram.data.getMulti_easy()) {
			ModernizedCProgram.data.getMulti_easy().curl_multi_cleanup();
			ModernizedCProgram.data.setMulti_easy(((Object)0));
		} 
		ModernizedCProgram.data.getState().getTimeoutlist().Curl_llist_destroy(((Object)/* Destroy the timeout list that is held in the easy handle. It is
		     /normally/ done by curl_multi_remove_handle() but this is "just in
		     case" */0));
		ModernizedCProgram.data.setMagic(/* force a clear AFTER the possibly enforced removal from
		                      the multi handle, since that function uses the magic
		                      field! */0);
		if (ModernizedCProgram.data.getState().getRangestringalloc()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data.getState().getRange());
		} 
		/* freed here just in case DONE wasn't called */ModernizedCProgram.data.Curl_free_request_state();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_ssl_close_all(/* Close down all open SSL info and sessions */ModernizedCProgram.data);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getFirst_host()));
			(ModernizedCProgram.data.getState().getFirst_host()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getScratch()));
			(ModernizedCProgram.data.getState().getScratch()) = ((Object)0);
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_ssl_free_certinfo(ModernizedCProgram.data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data.getReq().getNewurl());
		ModernizedCProgram.data.getReq().setNewurl(((Object)0));
		if (ModernizedCProgram.data.getChange().getReferer_alloc()) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getReferer()));
				(ModernizedCProgram.data.getChange().getReferer()) = ((Object)0);
			} while (0);
			ModernizedCProgram.data.getChange().setReferer_alloc(0);
		} 
		ModernizedCProgram.data.getChange().setReferer(((Object)0));
		ModernizedCProgram.data.up_free();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getBuffer()));
			(ModernizedCProgram.data.getState().getBuffer()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getHeaderbuff()));
			(ModernizedCProgram.data.getState().getHeaderbuff()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getUlbuf()));
			(ModernizedCProgram.data.getState().getUlbuf()) = ((Object)0);
		} while (0);
		ModernizedCProgram.data.Curl_flush_cookies(1);
		ModernizedCProgram.data.Curl_http_auth_cleanup_digest();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getInfo().getContenttype()));
			(ModernizedCProgram.data.getInfo().getContenttype()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getInfo().getWouldredirect()));
			(ModernizedCProgram.data.getInfo().getWouldredirect()) = ((Object)0);
		} while (0);
		ModernizedCProgram.Curl_resolver_cleanup(ModernizedCProgram.data.getState().getResolver());
		;
		do {
		} while (0);
		if (ModernizedCProgram.data.getShare()) {
			ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_SHARE, CURL_LOCK_ACCESS_SINGLE);
			ModernizedCProgram.data.getShare().getCurl_share()--;
			ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_SHARE);
		} 
		ModernizedCProgram.data.getReq().getDoh().getProbe()[0].getEasy().Curl_close();
		ModernizedCProgram.data.getReq().getDoh().getProbe()[1].getEasy().Curl_close();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data.getReq().getDoh().getProbe()[0].getServerdoh().getMemory());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data.getReq().getDoh().getProbe()[1].getServerdoh().getMemory());
		ModernizedCProgram.data.getReq().getDoh().getHeaders().curl_slist_free_all();
		ModernizedCProgram.data.getWildcard().Curl_wildcard_dtor();
		ModernizedCProgram.data.Curl_freeset();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(ModernizedCProgram.data);
		return CURLE_OK/*
		 * Initialize the UserDefined fields within a Curl_easy.
		 * This may be safely called on a new or existing Curl_easy.
		 */;
	}
	public Object Curl_init_userdefined() {
		UserDefined set = ModernizedCProgram.data.getSet();
		 result = CURLE_OK;
		set.setOut((_iob[/* default output to stdout */1]));
		set.setIn_set((_iob[/* default input from stdin */0]));
		set.setErr((_iob[/* default stderr to stderr */2]));
		set.setFwrite_func(()/* use fwrite as default function to store output */ModernizedCProgram.fwrite);
		set.setFread_func_set(()/* use fread as default function to read input */ModernizedCProgram.fread);
		set.setIs_fread_set(0);
		set.setIs_fwrite_set(0);
		set.setSeek_func(0);
		set.setSeek_client(0);
		set.setConvfromnetwork(/* conversion callbacks for non-ASCII hosts */0);
		set.setConvtonetwork(0);
		set.setConvfromutf8(0);
		set.setFilesize(-/* we don't know the size */1);
		set.setPostfieldsize(-/* unknown size */1);
		set.setMaxredirs(-/* allow any amount by default */1);
		set.setHttpreq(/* Default HTTP request */.HTTPREQ_GET);
		set.setRtspreq(/* Default RTSP request */.RTSPREQ_OPTIONS);
		set.setFtp_use_epsv(/* FTP defaults to EPSV operations */1);
		set.setFtp_use_eprt(/* FTP defaults to EPRT operations */1);
		set.setFtp_use_pret(/* mainly useful for drftpd servers */0);
		set.setFtp_filemethod(.FTPFILE_MULTICWD);
		set.setDns_cache_timeout(/* Timeout every 60 seconds by default */60);
		ssl_general_config generatedGeneral_ssl = set.getGeneral_ssl();
		generatedGeneral_ssl.setMax_ssl_sessions(/* Set the default size of the SSL session ID cache */5);
		set.setProxyport(0);
		set.setProxytype(/* defaults to HTTP proxy */CURLPROXY_HTTP);
		set.setHttpauth(/* defaults to basic */CURLAUTH_BASIC);
		set.setProxyauth(/* defaults to basic */CURLAUTH_BASIC);
		set.setSocks5auth(CURLAUTH_BASIC | /* SOCKS5 proxy auth defaults to username/password + GSS-API */CURLAUTH_GSSAPI);
		set.setHide_progress(/* make libcurl quiet by default: *//* CURLOPT_NOPROGRESS changes these */1);
		Object generatedMimepost = set.getMimepost();
		ModernizedCProgram.data/*
		   * libcurl 7.10 introduced SSL verification *by default*! This needs to be
		   * switched off unless wanted.
		   */.Curl_mime_initpart(generatedMimepost);
		ssl_config_data generatedSsl = set.getSsl();
		ssl_primary_config generatedPrimary = generatedSsl.getPrimary();
		generatedPrimary.setVerifypeer(1);
		generatedPrimary.setVerifyhost(1);
		set.setSsh_auth_types(/* defaults to any auth
		                                                      type */CURLSSH_AUTH_DEFAULT);
		generatedPrimary.setSessionid(/* session ID caching enabled by
		                                        default */1);
		set.setProxy_ssl(generatedSsl);
		set.setNew_file_perms(/* Default permissions */644);
		set.setNew_directory_perms(/* Default permissions */755/* for the *protocols fields we don't use the CURLPROTO_ALL convenience
		     define since we internally only use the lower 16 bits for the passed
		     in bitmask to not conflict with the private bits */);
		set.setAllowed_protocols(CURLPROTO_ALL);
		set.setRedir_protocols(CURLPROTO_HTTP | CURLPROTO_HTTPS | CURLPROTO_FTP | CURLPROTO_FTPS/*
		   * disallow unprotected protection negotiation NEC reference implementation
		   * seem not to follow rfc1961 section 4.3/4.4
		   */);
		if (ModernizedCProgram.Curl_ssl_backend() != /* Set the default CA cert bundle/path detected/specified at build time.
		   *
		   * If Schannel is the selected SSL backend then these locations are
		   * ignored. We allow setting CA location for schannel only when explicitly
		   * specified by the user via CURLOPT_CAINFO / --cacert.
		   */CURLSSLBACKEND_SCHANNEL) {
		} 
		set.setWildcard_enabled(0);
		set.setChunk_bgn(0);
		set.setChunk_end(0);
		set.setTcp_keepalive(0);
		set.setTcp_keepintvl(60);
		set.setTcp_keepidle(60);
		set.setTcp_fastopen(0);
		set.setTcp_nodelay(1);
		set.setSsl_enable_npn(1);
		set.setSsl_enable_alpn(1);
		set.setExpect_100_timeout(/* Wait for a second by default. */-1024);
		set.setSep_headers(/* separated header lists by default */1);
		set.setBuffer_size(CURL_MAX_WRITE_SIZE);
		set.setUpload_buffer_size(65536);
		set.setHappy_eyeballs_timeout(CURL_HET_DEFAULT);
		set.setFnmatch(0);
		set.setUpkeep_interval_ms(CURL_UPKEEP_INTERVAL_DEFAULT);
		set.setMaxconnects(/* for easy handles */5);
		set.setMaxage_conn(118);
		set.setHttp09_allowed(0);
		set.setHttpversion(CURL_HTTP_VERSION_1_1);
		;
		return result/**
		 * Curl_open()
		 *
		 * @param curl is a pointer to a sessionhandle pointer that gets set by this
		 * function.
		 * @return CURLcode
		 */;
	}
	public Object Curl_open() {
		 result = new ();
		Curl_easy data = new Curl_easy();
		data = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*//* Very simple start-up: alloc the struct, init it with zeroes and return */);
		if (!data) {
			do {
			} while (/* this is a very serious error */0);
			return CURLE_OUT_OF_MEMORY;
		} 
		data.setMagic(-1024);
		UrlState generatedState = data.getState();
		Object generatedResolver = generatedState.getResolver();
		result = data.Curl_resolver_init(generatedResolver);
		if (result) {
			do {
			} while (0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(data);
			return result;
		} 
		generatedState.setBuffer(/*Error: Function owner not recognized*/Curl_cmalloc(CURL_MAX_WRITE_SIZE + /* We do some initial setup here, all those fields that can't be just 0 */1));
		byte[] generatedBuffer = generatedState.getBuffer();
		Byte generatedHeaderbuff = generatedState.getHeaderbuff();
		Progress generatedProgress = data.getProgress();
		int generatedFlags = generatedProgress.getFlags();
		if (!generatedBuffer) {
			do {
			} while (0);
			result = CURLE_OUT_OF_MEMORY;
		} else {
				generatedState.setHeaderbuff(/*Error: Function owner not recognized*/Curl_cmalloc(256));
				if (!generatedHeaderbuff) {
					do {
					} while (0);
					result = CURLE_OUT_OF_MEMORY;
				} else {
						result = data.Curl_init_userdefined();
						generatedState.setHeadersize(256);
						do {
						} while (0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_initinfo(data);
						generatedState.setLastconnect(((Object)/* most recent connection is not yet defined */0));
						generatedFlags |=  (1 << 4);
						generatedState.setCurrent_speed(-/* init to negative == impossible */1);
				} 
		} 
		if (result) {
			ModernizedCProgram.Curl_resolver_cleanup(generatedResolver);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedBuffer);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedHeaderbuff);
			data.Curl_freeset();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(data);
			data = ((Object)0);
		} else {
				ModernizedCProgram.curl = data;
		} 
		return result;
	}
	public void prune_dead_connections() {
		curltime curltime = new curltime();
		curltime now = curltime.Curl_now();
		timediff_t elapsed = now.Curl_timediff(ModernizedCProgram.data.getState().getConn_cache().getLast_cleanup());
		connectdata generatedExtracted = prune.getExtracted();
		if (elapsed >= -1024) {
			prunedead prune = new prunedead();
			prune.setData(ModernizedCProgram.data);
			prune.setExtracted(((Object)0));
			while (ModernizedCProgram.Curl_conncache_foreach(ModernizedCProgram.data, ModernizedCProgram.data.getState().getConn_cache(), prune, call_extract_if_dead)) {
				(Object)ModernizedCProgram.Curl_disconnect(ModernizedCProgram.data, generatedExtracted, /* disconnect it *//* dead_connection */1);
			}
			ModernizedCProgram.data.getState().getConn_cache().setLast_cleanup(now/*
			 * Given one filled in connection struct (named needle), this function should
			 * detect if there already is one that has all the significant details
			 * exactly the same and thus should be used instead.
			 *
			 * If there is a match, this function returns TRUE - and has marked the
			 * connection as 'in-use'. It must later be called with ConnectionDone() to
			 * return back to 'idle' (unused) state.
			 *
			 * The force_reuse flag is set if the connection must be used.
			 */);
		} 
	}
	public Object setup_range() {
		UrlState s = ModernizedCProgram.data.getState();
		s.setResume_from(ModernizedCProgram.data.getSet().getSet_resume_from());
		Object generatedResume_from = s.getResume_from();
		Object generatedRangestringalloc = s.getRangestringalloc();
		Byte generatedRange = s.getRange();
		return CURLE_OK/*
		 * setup_connection_internals() -
		 *
		 * Setup connection internals specific to the requested protocol in the
		 * Curl_easy. This is inited and setup before the connection is made but
		 * is about the particular protocol that is to be used.
		 *
		 * This MUST get called after proxy magic has been figured out.
		 */;
	}
	public void Curl_free_request_state() {
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getReq().getProtop()));
			(ModernizedCProgram.data.getReq().getProtop()) = ((Object)0);
		} while (0);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getReq().getNewurl()));
			(ModernizedCProgram.data.getReq().getNewurl()) = ((Object)0);
		} while (0);
	}
	public Object parse_connect_to_host_port(Object host, Byte hostname_result, Integer port_result) {
		byte host_dup;
		byte hostptr;
		byte host_portno;
		byte portptr;
		int port = -1;
		hostname_result = ((Object)0);
		port_result = -1;
		if (!host || !host) {
			return CURLE_OK;
		} 
		host_dup = /*Error: Function owner not recognized*/Curl_cstrdup(host);
		if (!host_dup) {
			return CURLE_OUT_OF_MEMORY;
		} 
		hostptr = host_dup;
		portptr = /* start scanning for port number at this point */hostptr;
		if (hostptr == /* detect and extract RFC6874-style IPv6-addresses */(byte)'['/* advance beyond the initial bracket *//* There might be a zone identifier *//* Allow unreserved characters as defined in RFC 3986 */) {
			ModernizedCProgram.data.Curl_failf(/* Note that if this didn't end with a bracket, we still advanced the
			     * hostptr first, but I can't see anything wrong with that as no host
			     * name nor a numeric can legally start with a bracket.
			     */"Use of IPv6 in *_CONNECT_TO without IPv6 support built-in!");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(host_dup);
			return CURLE_NOT_BUILT_IN;
		} 
		host_portno = /*Error: Function owner not recognized*/strchr(portptr, /* Get port number off server.com:1080 */(byte)':');
		if (host_portno) {
			byte endp = ((Object)0);
			host_portno = /* cut off number from host name */(byte)'\0';
			host_portno++;
			if (host_portno) {
				long portparse = /*Error: Function owner not recognized*/strtol(host_portno, endp, 10);
				if ((endp && endp) || (portparse < 0) || (portparse > 65535)) {
					ModernizedCProgram.data.Curl_infof("No valid port number in connect to host string (%s)\n", host_portno);
					hostptr = ((Object)0);
					port = -1;
				} else {
						port = (int)/* we know it will fit */portparse;
				} 
			} 
		} 
		if (/* now, clone the cleaned host name */hostptr) {
			hostname_result = /*Error: Function owner not recognized*/Curl_cstrdup(hostptr);
			if (!hostname_result) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(host_dup);
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		port_result = port;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(host_dup);
		return CURLE_OK/*
		 * Parses one "connect to" string in the form:
		 * "HOST:PORT:CONNECT-TO-HOST:CONNECT-TO-PORT".
		 */;
	}
	public Object Curl_connect( asyncp,  protocol_done) {
		 result = new ();
		connectdata conn = new connectdata();
		asyncp = /* assume synchronous resolves by default */0;
		/* init the single-transfer specific data */ModernizedCProgram.data.Curl_free_request_state();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getReq(), 0, /*Error: Unsupported expression*/);
		ModernizedCProgram.data.getReq().setMaxdownload(-1);
		result = ModernizedCProgram.create_conn(ModernizedCProgram.data, conn, /* call the stuff that needs to be called */asyncp);
		curl_llist generatedEasyq = (conn).getEasyq();
		Object generatedSize = generatedEasyq.getSize();
		if (!result) {
			if ((generatedSize)) {
				protocol_done = /* multiplexed */1;
			}  else if (!asyncp/* DNS resolution is done: that's either because this is a reused
			         connection, in which case DNS was unnecessary, or because DNS
			         really did finish already (synch resolver/fast async resolve) */) {
				result = conn.Curl_setup_conn(protocol_done);
			} 
		} 
		if (result == CURLE_NO_CONNECTION_AVAILABLE) {
			return result;
		}  else if (result && conn/* We're not allowed to return failure with memory left allocated in the
		       connectdata struct, free those here */) {
			ModernizedCProgram.Curl_disconnect(ModernizedCProgram.data, conn, 1);
		}  else if (!result && !ModernizedCProgram.data.getConn()) {
			ModernizedCProgram.Curl_attach_connnection(ModernizedCProgram.data, /* FILE: transfers already have the connection attached */conn);
		} 
		return result/*
		 * Curl_init_do() inits the readwrite session. This is inited each time (in
		 * the DO function before the protocol-specific DO functions are invoked) for
		 * a transfer, sometimes multiple times on the same Curl_easy. Make sure
		 * nothing in here depends on stuff that are setup dynamically for the
		 * transfer.
		 *
		 * Allow this function to get called with 'conn' set to NULL.
		 */;
	}
	/* called from multi.c when this DOH transfer is complete */
	public int Curl_doh_done(Object result) {
		UserDefined generatedSet = this.getSet();
		Curl_easy generatedDohfor = generatedSet.getDohfor();
		Curl_easy data = generatedDohfor;
		SingleRequest generatedReq = data.getReq();
		dohdata generatedDoh = generatedReq.getDoh();
		int generatedPending = generatedDoh.getPending();
		generatedPending--;
		data.Curl_infof("a DOH request is completed, %u to go\n", generatedPending);
		if (result) {
			data.Curl_infof("DOH request %s\n", ModernizedCProgram.curl_easy_strerror(result));
		} 
		curl_slist generatedHeaders = generatedDoh.getHeaders();
		if (!generatedPending) {
			generatedHeaders.curl_slist_free_all();
			generatedDoh.setHeaders(((Object)0));
			data.Curl_expire(0, .EXPIRE_RUN_NOW);
		} 
		return 0;
	}
	public void Curl_conncache_unlock() {
		if ((ModernizedCProgram.data).getShare()) {
			(ModernizedCProgram.data).Curl_share_unlock(CURL_LOCK_DATA_CONNECT/* Returns number of connections currently held in the connection cache.
			   Locks/unlocks the cache itself!
			*/);
		} 
	}
	public Object Curl_conncache_size() {
		size_t num = new size_t();
		if ((ModernizedCProgram.data).getShare()) {
			(ModernizedCProgram.data).Curl_share_lock(CURL_LOCK_DATA_CONNECT, CURL_LOCK_ACCESS_SINGLE);
		} 
		num = ModernizedCProgram.data.getState().getConn_cache().getNum_conn();
		if ((ModernizedCProgram.data).getShare()) {
			(ModernizedCProgram.data).Curl_share_unlock(CURL_LOCK_DATA_CONNECT);
		} 
		return num/* Returns number of connections currently held in the connections's bundle
		   Locks/unlocks the cache itself!
		*/;
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
	 * RFC6749 OAuth 2.0 Authorization Framework
	 *
	 ***************************************************************************/
	/* The last #include files should be: */
	/*
	 * Curl_auth_create_oauth_bearer_message()
	 *
	 * This is used to generate an already encoded OAuth 2.0 message ready for
	 * sending to the recipient.
	 *
	 * Parameters:
	 *
	 * data[in]         - The session handle.
	 * user[in]         - The user name.
	 * host[in]         - The host name.
	 * port[in]         - The port(when not Port 80).
	 * bearer[in]       - The bearer token.
	 * outptr[in / out] - The address where a pointer to newly allocated memory
	 *                    holding the result will be stored upon completion.
	 * outlen[out]      - The length of the output message.
	 *
	 * Returns CURLE_OK on success.
	 */
	public Object Curl_auth_create_oauth_bearer_message(Object user, Object host, Object port, Object bearer, Byte outptr, Object outlen) {
		 result = CURLE_OK;
		byte oauth = ((Object)0);
		if (port == 0 || port == /* Generate the message */80) {
			oauth = ModernizedCProgram.curl_maprintf("n,a=%s,\1host=%s\1auth=Bearer %s\1\1", user, host, bearer);
		} else {
				oauth = ModernizedCProgram.curl_maprintf("n,a=%s,\1host=%s\1port=%ld\1auth=Bearer %s\1\1", user, host, port, bearer);
		} 
		if (!oauth) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.data.Curl_base64_encode(oauth, /*Error: Function owner not recognized*/strlen(oauth), outptr, /* Base64 encode the reply */outlen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(oauth);
		return result/*
		 * Curl_auth_create_xoauth_bearer_message()
		 *
		 * This is used to generate an already encoded XOAuth 2.0 message ready for
		 * sending to the recipient.
		 *
		 * Parameters:
		 *
		 * data[in]         - The session handle.
		 * user[in]         - The user name.
		 * bearer[in]       - The bearer token.
		 * outptr[in / out] - The address where a pointer to newly allocated memory
		 *                    holding the result will be stored upon completion.
		 * outlen[out]      - The length of the output message.
		 *
		 * Returns CURLE_OK on success.
		 */;
	}
	public Object Curl_auth_create_xoauth_bearer_message(Object user, Object bearer, Byte outptr, Object outlen) {
		 result = CURLE_OK;
		byte xoauth = ModernizedCProgram.curl_maprintf("user=%s\1auth=Bearer %s\1\1", user, /* Generate the message */bearer);
		if (!xoauth) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.data.Curl_base64_encode(xoauth, /*Error: Function owner not recognized*/strlen(xoauth), outptr, /* Base64 encode the reply */outlen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(xoauth);
		return result/* disabled, no users */;
	}
	/* reset the known transfer sizes */
	public void Curl_pgrsResetTransferSizes() {
		ModernizedCProgram.data.Curl_pgrsSetDownloadSize(-1);
		ModernizedCProgram.data.Curl_pgrsSetUploadSize(-1/*
		 * @unittest: 1399
		 */);
	}
	public void Curl_pgrsTime( timer) {
		curltime curltime = new curltime();
		curltime now = curltime.Curl_now();
		timediff_t delta = ((Object)0);
		switch (timer) {
		case .TIMER_STARTSINGLE:
				ModernizedCProgram.data.getProgress().setT_startsingle(/* This is set at the start of each single fetch */now);
				ModernizedCProgram.data.getProgress().setIs_t_startransfer_set(.bool_false);
				break;
		case .TIMER_NAMELOOKUP:
				delta = ModernizedCProgram.data.getProgress().getT_nslookup();
				break;
		case .TIMER_STARTOP:
				ModernizedCProgram.data.getProgress().setT_startop(/* This is set at the start of a transfer */now);
				break;
		case .TIMER_APPCONNECT:
				delta = ModernizedCProgram.data.getProgress().getT_appconnect();
				break;
		case .TIMER_POSTRANSFER/* this is the normal end-of-transfer thing */:
				break;
		case .TIMER_STARTACCEPT:
				ModernizedCProgram.data.getProgress().setT_acceptdata(now);
				break;
		case .TIMER_PRETRANSFER:
				delta = ModernizedCProgram.data.getProgress().getT_pretransfer();
				break;
		case .TIMER_NONE/* mistake filter */:
				break;
		case .TIMER_CONNECT:
				delta = ModernizedCProgram.data.getProgress().getT_connect();
				break;
		case .TIMER_REDIRECT:
				ModernizedCProgram.data.getProgress().setT_redirect(now.Curl_timediff_us(ModernizedCProgram.data.getProgress().getStart()));
				break;
		case .TIMER_STARTTRANSFER:
				delta = ModernizedCProgram.data.getProgress().getT_starttransfer();
				if (ModernizedCProgram.data.getProgress().getIs_t_startransfer_set()) {
					return /*Error: Unsupported expression*/;
				} else {
						ModernizedCProgram.data.getProgress().setIs_t_startransfer_set(.bool_true);
						break;
				} 
		default:
		}
		if (delta) {
			timediff_t us = now.Curl_timediff_us(ModernizedCProgram.data.getProgress().getT_startsingle());
			if (us < 1) {
				us = /* make sure at least one microsecond passed */1;
			} 
			delta += us;
		} 
	}
	public void Curl_pgrsStartNow() {
		ModernizedCProgram.data.getProgress().setSpeeder_c(/* reset the progress meter display */0);
		curltime curltime = new curltime();
		ModernizedCProgram.data.getProgress().setStart(curltime.Curl_now());
		ModernizedCProgram.data.getProgress().setIs_t_startransfer_set(.bool_false);
		ModernizedCProgram.data.getProgress().getUl_limit_start().setTv_sec(0);
		ModernizedCProgram.data.getProgress().getUl_limit_start().setTv_usec(0);
		ModernizedCProgram.data.getProgress().getDl_limit_start().setTv_sec(0);
		ModernizedCProgram.data.getProgress().getDl_limit_start().setTv_usec(0);
		ModernizedCProgram.data.getProgress().setDownloaded(0);
		ModernizedCProgram.data.getProgress().setUploaded(0);
		ModernizedCProgram.data.getProgress().getFlags() &=  (1 << 4) | (1 << /* clear all bits except HIDE and HEADERS_OUT */7);
		ModernizedCProgram.Curl_ratelimit(ModernizedCProgram.data, ModernizedCProgram.data.getProgress().getStart());
	}
	public void Curl_pgrsSetDownloadCounter(Object size) {
		ModernizedCProgram.data.getProgress().setDownloaded(size/*
		 * Update the timestamp and sizestamp to use for rate limit calculations.
		 */);
	}
	/*
	 * Set the number of uploaded bytes so far.
	 */
	public void Curl_pgrsSetUploadCounter(Object size) {
		ModernizedCProgram.data.getProgress().setUploaded(size);
	}
	public void Curl_pgrsSetDownloadSize(Object size) {
		if (size >= 0) {
			ModernizedCProgram.data.getProgress().setSize_dl(size);
			ModernizedCProgram.data.getProgress().getFlags() |=  (1 << 6);
		} else {
				ModernizedCProgram.data.getProgress().setSize_dl(0);
				ModernizedCProgram.data.getProgress().getFlags() &=  ~(1 << 6);
		} 
	}
	public void Curl_pgrsSetUploadSize(Object size) {
		if (size >= 0) {
			ModernizedCProgram.data.getProgress().setSize_ul(size);
			ModernizedCProgram.data.getProgress().getFlags() |=  (1 << 5);
		} else {
				ModernizedCProgram.data.getProgress().setSize_ul(0);
				ModernizedCProgram.data.getProgress().getFlags() &=  ~(1 << 5);
		} 
	}
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
	public void Curl_speedinit() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getState().getKeeps_speed(), 0, /*Error: Unsupported expression*//*
		 * @unittest: 1606
		 */);
	}
	public Object Curl_resolver_init(Object resolver) {
		(Object)ModernizedCProgram.easy;
		resolver = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*/);
		if (!resolver) {
			return CURLE_OUT_OF_MEMORY;
		} 
		return CURLE_OK/*
		 * Curl_resolver_cleanup()
		 * Called from curl_easy_cleanup() -> Curl_close() to cleanup resolver
		 * URL-state specific environment ('resolver' member of the UrlState
		 * structure).
		 */;
	}
	public Object Curl_resolver_duphandle(Object to, Object from) {
		(Object)from;
		return ModernizedCProgram.easy.Curl_resolver_init(to);
	}
	/* check if this is an IPv6 address string */
	/* This is an IPv6 address literal */
	/* CURLRES_IPV6 */
	/* !USE_RESOLVE_ON_IPS */
	/*
	   * Check if a limited name resolve has been requested.
	   */
	/* The stack seems to be a non-IPv6 one */
	/* CURLRES_IPV6 */
	/* fire up a new resolver thread! */
	/* expect asynchronous response */
	/* !HAVE_GETADDRINFO */
	public Object Curl_set_dns_servers(Byte servers) {
		(Object)ModernizedCProgram.data;
		(Object)servers;
		return CURLE_NOT_BUILT_IN;
	}
	public Object Curl_set_dns_interface(Object interf) {
		(Object)ModernizedCProgram.data;
		(Object)interf;
		return CURLE_NOT_BUILT_IN;
	}
	public Object Curl_set_dns_local_ip4(Object local_ip4) {
		(Object)ModernizedCProgram.data;
		(Object)local_ip4;
		return CURLE_NOT_BUILT_IN;
	}
	public Object Curl_set_dns_local_ip6(Object local_ip6) {
		(Object)ModernizedCProgram.data;
		(Object)local_ip6;
		return CURLE_NOT_BUILT_IN/* CURLRES_THREADED */;
	}
	public Object Curl_get_upload_buffer() {
		if (!ModernizedCProgram.data.getState().getUlbuf()) {
			ModernizedCProgram.data.getState().setUlbuf(/*Error: Function owner not recognized*/Curl_cmalloc(ModernizedCProgram.data.getSet().getUpload_buffer_size()));
			if (!ModernizedCProgram.data.getState().getUlbuf()) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} 
		return CURLE_OK/*
		 * This function will be called to loop through the trailers buffer
		 * until no more data is available for sending.
		 *//*
		 * This function will be called to loop through the trailers buffer
		 * until no more data is available for sending.
		 */;
	}
	public  Curl_meets_timecondition(Object timeofdoc) {
		if ((timeofdoc == 0) || (ModernizedCProgram.data.getSet().getTimevalue() == 0)) {
			return 1;
		} 
		switch (ModernizedCProgram.data.getSet().getTimecondition()) {
		case CURL_TIMECOND_IFUNMODSINCE:
				if (timeofdoc >= ModernizedCProgram.data.getSet().getTimevalue()) {
					ModernizedCProgram.data.Curl_infof("The requested document is not old enough\n");
					ModernizedCProgram.data.getInfo().setTimecond(1);
					return 0;
				} 
				break;
		case CURL_TIMECOND_IFMODSINCE:
		default:
				if (timeofdoc <= ModernizedCProgram.data.getSet().getTimevalue()) {
					ModernizedCProgram.data.Curl_infof("The requested document is not new enough\n");
					ModernizedCProgram.data.getInfo().setTimecond(1);
					return 0;
				} 
				break;
		}
		return 1/*
		 * Go ahead and do a read if we have a readable socket or if
		 * the stream was rewound (in which case we have data in a
		 * buffer)
		 *
		 * return '*comeback' TRUE if we didn't properly drain the socket so this
		 * function should get called again without select() or similar in between!
		 */;
	}
	/* Curl_init_CONNECT() gets called each time the handle switches to CONNECT
	   which means this gets called once for each subsequent redirect etc */
	public void Curl_init_CONNECT() {
		ModernizedCProgram.data.getState().setFread_func(ModernizedCProgram.data.getSet().getFread_func_set());
		ModernizedCProgram.data.getState().setIn(ModernizedCProgram.data.getSet().getIn_set());
	}
	public Object Curl_pretransfer() {
		 result = new ();
		if (!ModernizedCProgram.data.getChange().getUrl() && !ModernizedCProgram.data.getSet().getUh()) {
			ModernizedCProgram.data.Curl_failf(/* we can't do anything without URL */"No URL set!");
			return CURLE_URL_MALFORMAT;
		} 
		if (ModernizedCProgram.data.getChange().getUrl_alloc()) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getUrl()));
				(ModernizedCProgram.data.getChange().getUrl()) = ((Object)0);
			} while (/* the already set URL is allocated, free it first! */0);
			ModernizedCProgram.data.getChange().setUrl_alloc(0);
		} 
		if (!ModernizedCProgram.data.getChange().getUrl() && ModernizedCProgram.data.getSet().getUh()) {
			 uc = new ();
			uc = /*Error: Function owner not recognized*/curl_url_get(ModernizedCProgram.data.getSet().getUh(), CURLUPART_URL, ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_URL], 0);
			if (uc) {
				ModernizedCProgram.data.Curl_failf("No URL set!");
				return CURLE_URL_MALFORMAT;
			} 
		} 
		ModernizedCProgram.data.getChange().setUrl(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_URL/* Init the SSL session ID cache here. We do it here since we want to do it
		     after the *_setopt() calls (that could specify the size of the cache) but
		     before any transfer takes place. */]);
		result = /*Error: Function owner not recognized*/Curl_ssl_initsessions(ModernizedCProgram.data, ModernizedCProgram.data.getSet().getGeneral_ssl().getMax_ssl_sessions());
		if (result) {
			return result;
		} 
		ModernizedCProgram.data.getState().setWildcardmatch(ModernizedCProgram.data.getSet().getWildcard_enabled());
		ModernizedCProgram.data.getSet().setFollowlocation(/* reset the location-follow counter */0);
		ModernizedCProgram.data.getState().setThis_is_a_follow(/* reset this */0);
		ModernizedCProgram.data.getState().setErrorbuf(/* no error has occurred */0);
		ModernizedCProgram.data.getState().setHttpversion(/* don't assume any particular server version */0);
		ModernizedCProgram.data.getState().setAuthproblem(0);
		ModernizedCProgram.data.getState().getAuthhost().setWant(ModernizedCProgram.data.getSet().getHttpauth());
		ModernizedCProgram.data.getState().getAuthproxy().setWant(ModernizedCProgram.data.getSet().getProxyauth());
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getInfo().getWouldredirect()));
			(ModernizedCProgram.data.getInfo().getWouldredirect()) = ((Object)0);
		} while (0);
		ModernizedCProgram.data.getInfo().setWouldredirect(((Object)0));
		if (ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_PUT) {
			ModernizedCProgram.data.getState().setInfilesize(ModernizedCProgram.data.getSet().getFilesize());
		}  else if ((ModernizedCProgram.data.getSet().getHttpreq() != .HTTPREQ_GET) && (ModernizedCProgram.data.getSet().getHttpreq() != .HTTPREQ_HEAD)) {
			ModernizedCProgram.data.getState().setInfilesize(ModernizedCProgram.data.getSet().getPostfieldsize());
			if (ModernizedCProgram.data.getSet().getPostfields() && (ModernizedCProgram.data.getState().getInfilesize() == -1)) {
				ModernizedCProgram.data.getState().setInfilesize(()/*Error: Function owner not recognized*/strlen(ModernizedCProgram.data.getSet().getPostfields()));
			} 
		} else {
				ModernizedCProgram.data.getState().setInfilesize(0);
		} 
		if (ModernizedCProgram.data.getChange().getCookielist()) {
			ModernizedCProgram.data.Curl_cookie_loadfiles();
		} 
		if (ModernizedCProgram.data.getChange().getResolve()) {
			result = ModernizedCProgram.data.Curl_loadhostpairs();
		} 
		 generatedState = wc.getState();
		if (!result/* Allow data->set.use_port to set which port to use. This needs to be
		     * disabled for example when we follow Location: headers to URLs using
		     * different ports! */) {
			ModernizedCProgram.data.getState().setAllow_port(1/*************************************************************
			     * Tell signal handler to ignore SIGPIPE
			     *************************************************************/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_initinfo(/* reset session-specific information "variables" */ModernizedCProgram.data);
			ModernizedCProgram.data.Curl_pgrsResetTransferSizes();
			ModernizedCProgram.data/* In case the handle is re-used and an authentication method was picked
			       in the session we need to make sure we only use the one(s) we now
			       consider to be fine */.Curl_pgrsStartNow();
			ModernizedCProgram.data.getState().getAuthhost().getPicked() &=  ModernizedCProgram.data.getState().getAuthhost().getWant();
			ModernizedCProgram.data.getState().getAuthproxy().getPicked() &=  ModernizedCProgram.data.getState().getAuthproxy().getWant();
			if (ModernizedCProgram.data.getState().getWildcardmatch()) {
				WildcardData wc = ModernizedCProgram.data.getWildcard();
				if (generatedState < .CURLWC_INIT) {
					result = /* init wildcard structures */wc.Curl_wildcard_init();
					if (result) {
						return CURLE_OUT_OF_MEMORY;
					} 
				} 
			} 
			;
		} 
		return result/*
		 * Curl_posttransfer() is called immediately after a transfer ends
		 */;
	}
	public Object Curl_posttransfer() {
		(Object)/* unused parameter */ModernizedCProgram.data;
		return CURLE_OK/*
		 * Curl_follow() handles the URL redirect magic. Pass in the 'newurl' string
		 * as given by the remote server and set up the new URL to request.
		 *
		 * This function DOES NOT FREE the given url.
		 */;
	}
	/* restore the signal handler for SIGPIPE before we get back */
	public Object Curl_follow(Byte newurl,  type) {
		bool disallowport = /* Location: following will not happen when HTTP is disabled *//* Location: redirect */0;
		bool reachedmax = 0;
		 uc = new ();
		if (type == .FOLLOW_REDIR) {
			if ((ModernizedCProgram.data.getSet().getMaxredirs() != -1) && (ModernizedCProgram.data.getSet().getFollowlocation() >= ModernizedCProgram.data.getSet().getMaxredirs())) {
				reachedmax = 1;
				type = /* switch to fake to store the would-be-redirected
				                             to URL */.FOLLOW_FAKE;
			} else {
					ModernizedCProgram.data.getState().setThis_is_a_follow(/* mark the next request as a followed location: */1);
					ModernizedCProgram.data.getSet().getFollowlocation()++;
					if (ModernizedCProgram.data.getSet().getHttp_auto_referer()) {
						if (ModernizedCProgram.data.getChange().getReferer_alloc()) {
							do {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getReferer()));
								(ModernizedCProgram.data.getChange().getReferer()) = ((Object)0);
							} while (0);
							ModernizedCProgram.data.getChange().setReferer_alloc(0);
						} 
						ModernizedCProgram.data.getChange().setReferer(/*Error: Function owner not recognized*/Curl_cstrdup(ModernizedCProgram.data.getChange().getUrl()));
						if (!ModernizedCProgram.data.getChange().getReferer()) {
							return CURLE_OUT_OF_MEMORY;
						} 
						ModernizedCProgram.data.getChange().setReferer_alloc(/* yes, free this later */1);
					} 
			} 
		} 
		if (/*Error: Function owner not recognized*/Curl_is_absolute_url(newurl, ((Object)0), 40)) {
			disallowport = /* This is an absolute URL, don't allow the custom port number */1;
		} 
		do {
		} while (0);
		uc = /*Error: Function owner not recognized*/curl_url_set(ModernizedCProgram.data.getState().getUh(), CURLUPART_URL, newurl, (type == .FOLLOW_FAKE) ? CURLU_NON_SUPPORT_SCHEME : ((type == .FOLLOW_REDIR) ? CURLU_URLENCODE : 0));
		if (uc) {
			if (type != .FOLLOW_FAKE) {
				return ModernizedCProgram.Curl_uc_to_curlcode(uc);
			} 
			newurl = /*Error: Function owner not recognized*/Curl_cstrdup(/* the URL could not be parsed for some reason, but since this is FAKE
			       mode, just duplicate the field as-is */newurl);
			if (!newurl) {
				return CURLE_OUT_OF_MEMORY;
			} 
		} else {
				uc = /*Error: Function owner not recognized*/curl_url_get(ModernizedCProgram.data.getState().getUh(), CURLUPART_URL, newurl, 0);
				if (uc) {
					return ModernizedCProgram.Curl_uc_to_curlcode(uc);
				} 
		} 
		if (type == .FOLLOW_FAKE/* we're only figuring out the new url if we would've followed locations
		       but now we're done so we can get out! */) {
			ModernizedCProgram.data.getInfo().setWouldredirect(newurl);
			if (reachedmax) {
				ModernizedCProgram.data.Curl_failf("Maximum (%ld) redirects followed", ModernizedCProgram.data.getSet().getMaxredirs());
				return CURLE_TOO_MANY_REDIRECTS;
			} 
			return CURLE_OK;
		} 
		if (disallowport) {
			ModernizedCProgram.data.getState().setAllow_port(0);
		} 
		if (ModernizedCProgram.data.getChange().getUrl_alloc()) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getUrl()));
				(ModernizedCProgram.data.getChange().getUrl()) = ((Object)0);
			} while (0);
		} 
		ModernizedCProgram.data.getChange().setUrl(newurl);
		ModernizedCProgram.data.getChange().setUrl_alloc(1);
		ModernizedCProgram.data.Curl_infof("Issue another request to this URL: '%s'\n", ModernizedCProgram.data.getChange().getUrl());
		switch (ModernizedCProgram.data.getInfo().getHttpcode()) {
		case /* Moved Permanently */301/* (quote from RFC7231, section 6.4.2)
		     *
		     * Note: For historical reasons, a user agent MAY change the request
		     * method from POST to GET for the subsequent request.  If this
		     * behavior is undesired, the 307 (Temporary Redirect) status code
		     * can be used instead.
		     *
		     * ----
		     *
		     * Many webservers expect this, so these servers often answers to a POST
		     * request with an error page. To be sure that libcurl gets the page that
		     * most user agents would get, libcurl has to force GET.
		     *
		     * This behaviour is forbidden by RFC1945 and the obsolete RFC2616, and
		     * can be overridden with CURLOPT_POSTREDIR.
		     */:
				if ((ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST || ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST_FORM || ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST_MIME) && !(ModernizedCProgram.data.getSet().getKeep_post() & CURL_REDIR_POST_301)) {
					ModernizedCProgram.data.Curl_infof("Switch from POST to GET\n");
					ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_GET);
				} 
				break;
		case /* Use Proxy */305/* (quote from RFC2616, section 10.3.6):
		     * "The requested resource MUST be accessed through the proxy given
		     * by the Location field. The Location field gives the URI of the
		     * proxy.  The recipient is expected to repeat this single request
		     * via the proxy. 305 responses MUST only be generated by origin
		     * servers."
		     */:
				break;
		case /* See Other */303/* Disable both types of POSTs, unless the user explicitly
		       asks for POST after POST */:
				if (ModernizedCProgram.data.getSet().getHttpreq() != .HTTPREQ_GET && !(ModernizedCProgram.data.getSet().getKeep_post() & CURL_REDIR_POST_303)) {
					ModernizedCProgram.data.getSet().setHttpreq(/* enforce GET request */.HTTPREQ_GET);
					ModernizedCProgram.data.Curl_infof("Disables POST, goes with %s\n", ModernizedCProgram.data.getSet().getOpt_no_body() ? "HEAD" : "GET");
				} 
				break;
		case /* Not Modified */304/* 304 means we did a conditional request and it was "Not modified".
		     * We shouldn't get any Location: header in this response!
		     */:
				break;
		case /* Found */302/* (quote from RFC7231, section 6.4.3)
		     *
		     * Note: For historical reasons, a user agent MAY change the request
		     * method from POST to GET for the subsequent request.  If this
		     * behavior is undesired, the 307 (Temporary Redirect) status code
		     * can be used instead.
		     *
		     * ----
		     *
		     * Many webservers expect this, so these servers often answers to a POST
		     * request with an error page. To be sure that libcurl gets the page that
		     * most user agents would get, libcurl has to force GET.
		     *
		     * This behaviour is forbidden by RFC1945 and the obsolete RFC2616, and
		     * can be overridden with CURLOPT_POSTREDIR.
		     */:
				if ((ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST || ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST_FORM || ModernizedCProgram.data.getSet().getHttpreq() == .HTTPREQ_POST_MIME) && !(ModernizedCProgram.data.getSet().getKeep_post() & CURL_REDIR_POST_302)) {
					ModernizedCProgram.data.Curl_infof("Switch from POST to GET\n");
					ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_GET);
				} 
				break;
		default:
				break;
		}
		ModernizedCProgram.data.Curl_pgrsTime(.TIMER_REDIRECT);
		ModernizedCProgram.data.Curl_pgrsResetTransferSizes();
		return CURLE_OK/* CURL_DISABLE_HTTP */;
	}
	/* the Location: string */
	/* see transfer.h */
	public void Curl_setup_transfer(int sockindex, Object size,  getheader, int writesockindex) {
		SingleRequest k = ModernizedCProgram.data.getReq();
		connectdata conn = ModernizedCProgram.data.getConn();
		do {
		} while (0);
		do {
		} while (0);
		ConnectBits generatedBits = conn.getBits();
		Object generatedMultiplex = generatedBits.getMultiplex();
		int generatedHttpversion = conn.getHttpversion();
		Object generatedSock = conn.getSock();
		Object generatedSockfd = conn.getSockfd();
		if (generatedMultiplex || generatedHttpversion == 20) {
			conn.setSockfd(sockindex == -/* when multiplexing, the read/write sockets need to be the same! */1 ? ((writesockindex == -1 ? CURL_SOCKET_BAD : generatedSock[writesockindex])) : generatedSock[sockindex]);
			conn.setWritesockfd(generatedSockfd);
		} else {
				conn.setSockfd(sockindex == -1 ? CURL_SOCKET_BAD : generatedSock[sockindex]);
				conn.setWritesockfd(writesockindex == -1 ? CURL_SOCKET_BAD : generatedSock[writesockindex]);
		} 
		k.setGetheader(getheader);
		k.setSize(size/* The code sequence below is placed in this function just because all
		     necessary input is not always known in do_complete() as this function may
		     be called after that */);
		Object generatedGetheader = k.getGetheader();
		if (!generatedGetheader) {
			k.setHeader(0);
			if (size > 0) {
				ModernizedCProgram.data.Curl_pgrsSetDownloadSize(size);
			} 
		} 
		int generatedKeepon = k.getKeepon();
		Object generatedHandler = conn.getHandler();
		 generatedSending = http.getSending();
		curltime curltime = new curltime();
		if (generatedGetheader || !ModernizedCProgram.data.getSet().getOpt_no_body()) {
			if (sockindex != -1) {
				generatedKeepon |=  (1 << 0);
			} 
			if (writesockindex != -1) {
				HTTP http = ModernizedCProgram.data.getReq().getProtop();
				if ((ModernizedCProgram.data.getState().getExpect100header()) && (generatedHandler.getProtocol() & (CURLPROTO_HTTP | CURLPROTO_HTTPS)) && (generatedSending == .HTTPSEND_BODY)) {
					k.setExp100(/* wait with write until we either got 100-continue or a timeout */expect100.EXP100_AWAITING_CONTINUE);
					k.setStart100(curltime.Curl_now());
					ModernizedCProgram.data.Curl_expire(ModernizedCProgram.data.getSet().getExpect_100_timeout(), /* Set a timeout for the multi interface. Add the inaccuracy margin so
					           that we don't fire slightly too early and get denied to run. */.EXPIRE_100_TIMEOUT);
				} else {
						if (ModernizedCProgram.data.getState().getExpect100header()) {
							k.setExp100(expect100.EXP100_SENDING_REQUEST);
						} 
						generatedKeepon |=  (1 << /* enable the write bit when we're not waiting for continue */1/* if(writesockindex != -1) *//* if(k->getheader || !data->set.opt_no_body) */);
				} 
			} 
		} 
	}
	/* ! USE_RECV_BEFORE_SEND_WORKAROUND */
	/* Curl_infof() is for info message along the way */
	public void Curl_infof(Object[] fmt) {
		if (ModernizedCProgram.data && ModernizedCProgram.data.getSet().getVerbose()) {
			va_list ap = new va_list();
			size_t len = new size_t();
			byte[] print_buffer = new byte[2048 + 1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
			len = ModernizedCProgram.curl_mvsnprintf(print_buffer, /*Error: sizeof expression not supported yet*/, fmt, ap/*
			     * Indicate truncation of the input by replacing the last 3 characters
			     * with "...", and transfer the newline over in case the format had one.
			     */);
			if (len >= /*Error: sizeof expression not supported yet*/) {
				len = /*Error: Function owner not recognized*/strlen(fmt);
				if (fmt[--len] == (byte)'\n') {
					ModernizedCProgram.curl_msnprintf(print_buffer + (/*Error: sizeof expression not supported yet*/ - 5), 5, "...\n");
				} else {
						ModernizedCProgram.curl_msnprintf(print_buffer + (/*Error: sizeof expression not supported yet*/ - 4), 4, "...");
				} 
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
			len = /*Error: Function owner not recognized*/strlen(print_buffer);
			ModernizedCProgram.data.Curl_debug(CURLINFO_TEXT, print_buffer, len/* Curl_failf() is for messages stating why we failed.
			 * The message SHALL NOT include any LF or CR.
			 */);
		} 
	}
	public void Curl_failf(Object fmt) {
		if (ModernizedCProgram.data.getSet().getVerbose() || ModernizedCProgram.data.getSet().getErrorbuffer()) {
			va_list ap = new va_list();
			size_t len = new size_t();
			byte[] error = new byte[CURL_ERROR_SIZE + 2];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
			ModernizedCProgram.curl_mvsnprintf(error, CURL_ERROR_SIZE, fmt, ap);
			len = /*Error: Function owner not recognized*/strlen(error);
			if (ModernizedCProgram.data.getSet().getErrorbuffer() && !ModernizedCProgram.data.getState().getErrorbuf()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(ModernizedCProgram.data.getSet().getErrorbuffer(), error);
				ModernizedCProgram.data.getState().setErrorbuf(/* wrote error string */1);
			} 
			if (ModernizedCProgram.data.getSet().getVerbose()) {
				error[len] = (byte)'\n';
				error[++len] = (byte)'\0';
				ModernizedCProgram.data.Curl_debug(CURLINFO_TEXT, error, len);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		} 
	}
	public Object pausewrite(int type, Object ptr, Object len) {
		SingleRequest k = ModernizedCProgram.data.getReq();
		UrlState s = ModernizedCProgram.data.getState();
		byte dupl;
		int i;
		bool newtype = 1;
		int generatedTempcount = s.getTempcount();
		Object generatedTempwrite = s.getTempwrite();
		if (generatedTempcount) {
			for (i = 0; i < generatedTempcount; i++) {
				if (generatedTempwrite[i].getType() == type) {
					newtype = /* data for this type exists */0;
					break;
				} 
			}
			do {
			} while (0);
		} else {
				i = 0;
		} 
		if (!newtype/* append new data to old data */) {
			size_t newlen = len + generatedTempwrite[i].getLen();
			byte newptr = /*Error: Function owner not recognized*/Curl_crealloc(generatedTempwrite[i].getBuf(), /* allocate the new memory area */newlen);
			if (!newptr) {
				return CURLE_OUT_OF_MEMORY;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(newptr + generatedTempwrite[i].getLen(), ptr, /* copy the new data to the end of the new area */len);
			generatedTempwrite[i].setBuf(/* update the pointer and the size */newptr);
			generatedTempwrite[i].setLen(newlen);
		} else {
				dupl = ModernizedCProgram.Curl_memdup(ptr, len);
				if (!dupl) {
					return CURLE_OUT_OF_MEMORY;
				} 
				generatedTempwrite[i].setBuf(/* store this information in the state struct for later use */dupl);
				generatedTempwrite[i].setLen(len);
				generatedTempwrite[i].setType(type);
				if (newtype) {
					generatedTempcount++;
				} 
		} 
		int generatedKeepon = k.getKeepon();
		generatedKeepon |=  (1 << /* mark the connection as RECV paused */4);
		do {
		} while (0);
		return CURLE_OK/* chop_write() writes chunks of data not larger than CURL_MAX_WRITE_SIZE via
		 * client write callback(s) and takes care of pause requests from the
		 * callbacks.
		 */;
	}
	/* what type of data */
	/* return 0 on success */
	public int Curl_debug(Object type, Byte ptr, Object size) {
		byte[][] s_infotype = new byte[][]{"* ", "< ", "> ", "{ ", "} ", "{ ", "} "};
		int rc = 0;
		/* Special processing is needed for this block if it
		     * contains both headers and data (separated by CRLFCRLF).
		     * We want to convert just the headers, leaving the data as-is.
		     */
		/* convert everything through this CRLFCRLF but no further *//* Curl_convert_from_network calls failf if unsuccessful *//* we might as well continue even if it fails...   *//* switch pointer to use my buffer instead */if (ModernizedCProgram.data.getSet().getFdebug()) {
			ModernizedCProgram.data.Curl_set_in_callback(.bool_true);
			rc = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.data, type, ptr, size, ModernizedCProgram.data.getSet().getDebugdata());
			ModernizedCProgram.data.Curl_set_in_callback(.bool_false);
		} else {
				switch (type) {
				case CURLINFO_TEXT:
				case CURLINFO_HEADER_IN:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(s_infotype[type], 2, 1, ModernizedCProgram.data.getSet().getErr());
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(ptr, size, 1, ModernizedCProgram.data.getSet().getErr());
						break;
				case CURLINFO_HEADER_OUT:
				default:
						break;
				}
		} 
		return rc;
	}
	public void Curl_connect_free() {
		connectdata conn = ModernizedCProgram.data.getConn();
		http_connect_state generatedConnect_state = conn.getConnect_state();
		http_connect_state s = generatedConnect_state;
		if (s) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(s);
			conn.setConnect_state(((Object)0/*
			 * Curl_proxyCONNECT() requires that we're connected to a HTTP proxy. This
			 * function will issue the necessary commands to get a seamless tunnel through
			 * this proxy. After that, the socket can be used just as a normal socket.
			 */));
		} 
	}
	public Object Curl_share_lock(Object type, Object accesstype) {
		Curl_share share = ModernizedCProgram.data.getShare();
		if (share == ((Object)0)) {
			return CURLSHE_INVALID;
		} 
		int generatedSpecifier = share.getSpecifier();
		Object generatedLockfunc = share.getLockfunc();
		Object generatedClientdata = share.getClientdata();
		if (generatedSpecifier & (1 << type)) {
			if (generatedLockfunc) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.data, type, accesstype, generatedClientdata);
			} 
		} 
		return /* else if we don't share this, pretend successful lock */CURLSHE_OK;
	}
	public Object Curl_share_unlock(Object type) {
		Curl_share share = ModernizedCProgram.data.getShare();
		if (share == ((Object)0)) {
			return CURLSHE_INVALID;
		} 
		int generatedSpecifier = share.getSpecifier();
		Object generatedUnlockfunc = share.getUnlockfunc();
		Object generatedClientdata = share.getClientdata();
		if (generatedSpecifier & (1 << type)) {
			if (generatedUnlockfunc) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.data, type, generatedClientdata);
			} 
		} 
		return CURLSHE_OK;
	}
	public Object ftp_timeleft_accept() {
		timediff_t timeout_ms = 60000;
		timediff_t other = new timediff_t();
		curltime now = new curltime();
		if (ModernizedCProgram.data.getSet().getAccepttimeout() > 0) {
			timeout_ms = ModernizedCProgram.data.getSet().getAccepttimeout();
		} 
		curltime curltime = new curltime();
		now = curltime.Curl_now();
		other = ModernizedCProgram.Curl_timeleft(ModernizedCProgram.data, now, /* check if the generic timeout possibly is set shorter */0);
		if (other && (other < timeout_ms/* note that this also works fine for when other happens to be negative
		       due to it already having elapsed */)) {
			timeout_ms = other;
		} else {
				timeout_ms -= now.Curl_timediff(ModernizedCProgram.data.getProgress().getT_acceptdata());
				if (!timeout_ms) {
					return -/* avoid returning 0 as that means no timeout! */1;
				} 
		} 
		return timeout_ms/***********************************************************************
		 *
		 * ReceivedServerConnect()
		 *
		 * After allowing server to connect to us from data port, this function
		 * checks both data connection for connection establishment and ctrl
		 * connection for a negative response regarding a failure in connecting
		 *
		 */;
	}
	/*
	 * Curl_convert_clone() returns a malloced copy of the source string (if
	 * returning CURLE_OK), with the data converted to network format. This
	 * function is used by base64 code in libcurl built to support data
	 * conversion. This is a DUMMY VERSION that returns data unmodified - for
	 * use by the test server only.
	 */
	public Object Curl_convert_clone(Object indata, Object insize, Byte outbuf) {
		byte convbuf;
		(Object)ModernizedCProgram.data;
		convbuf = /*Error: Function owner not recognized*/Curl_cmalloc(insize);
		if (!convbuf) {
			return CURLE_OUT_OF_MEMORY;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(convbuf, indata, insize);
		outbuf = convbuf;
		return CURLE_OK/*
		 * readline()
		 *
		 * Reads a complete line from a file into a dynamically allocated buffer.
		 *
		 * Calling function may call this multiple times with same 'buffer'
		 * and 'bufsize' pointers to avoid multiple buffer allocations. Buffer
		 * will be reallocated and 'bufsize' increased until whole line fits in
		 * buffer before returning it.
		 *
		 * Calling function is responsible to free allocated buffer.
		 *
		 * This function may return:
		 *   GPE_OUT_OF_MEMORY
		 *   GPE_END_OF_FILE
		 *   GPE_OK
		 */;
	}
	public Object Curl_auth_create_cram_md5_message(Object chlg, Object userp, Object passwdp, Byte outptr, Object outlen) {
		 result = CURLE_OK;
		size_t chlglen = 0;
		HMAC_context ctxt = new HMAC_context();
		byte[] digest = new byte[16];
		byte response;
		if (chlg) {
			chlglen = /*Error: Function owner not recognized*/strlen(chlg);
		} 
		ctxt = ModernizedCProgram.Curl_HMAC_init(/* Compute the digest using the password as the key */ModernizedCProgram.Curl_HMAC_MD5, (byte)passwdp, ModernizedCProgram.curlx_uztoui(/*Error: Function owner not recognized*/strlen(passwdp)));
		if (!ctxt) {
			return CURLE_OUT_OF_MEMORY;
		} 
		if (chlglen > /* Update the digest with the given challenge */0) {
			ctxt.Curl_HMAC_update((byte)chlg, ModernizedCProgram.curlx_uztoui(chlglen));
		} 
		ctxt.Curl_HMAC_final(/* Finalise the digest */digest);
		response = ModernizedCProgram.curl_maprintf("%s %02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", userp, digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7], digest[8], digest[9], digest[10], digest[11], digest[12], digest[13], digest[14], digest[15]);
		if (!response) {
			return CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.data.Curl_base64_encode(response, 0, outptr, /* Base64 encode the response */outlen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(response);
		return result/* !CURL_DISABLE_CRYPTO_AUTH */;
	}
	public Curl_easy curl_easy_init() {
		 result = new ();
		Curl_easy data = new Curl_easy();
		if (!/* Make sure we inited the global SSL stuff */ModernizedCProgram.initialized) {
			result = ModernizedCProgram.curl_global_init(CURL_GLOBAL_DEFAULT);
			if (result) {
				do {
				} while (/* something in the global init failed, return nothing */0);
				return ((Object)0);
			} 
		} 
		result = /* We use curl_open() with undefined URL so far */data.Curl_open();
		if (result) {
			do {
			} while (0);
			return ((Object)0);
		} 
		return data;/* the next node in the list or NULL */
	}
	public Object easy_perform( events) {
		Curl_multi multi = new Curl_multi();
		 mcode = new ();
		 result = CURLE_OK;
		;
		if (!ModernizedCProgram.data) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		if (ModernizedCProgram.data.getSet().getErrorbuffer()) {
			ModernizedCProgram.data.getSet().getErrorbuffer()[0] = /* clear this as early as possible */0;
		} 
		if (ModernizedCProgram.data.getMulti()) {
			ModernizedCProgram.data.Curl_failf("easy handle already used in multi handle");
			return CURLE_FAILED_INIT;
		} 
		Curl_multi curl_multi = new Curl_multi();
		if (ModernizedCProgram.data.getMulti_easy()) {
			multi = ModernizedCProgram.data.getMulti_easy();
		} else {
				multi = curl_multi.Curl_multi_handle(1, /* this multi handle will only ever have a single easy handled attached
				       to it, so make it use minimal hashes */3);
				if (!multi) {
					return CURLE_OUT_OF_MEMORY;
				} 
				ModernizedCProgram.data.setMulti_easy(multi);
		} 
		Object generatedIn_callback = multi.getIn_callback();
		if (generatedIn_callback) {
			return CURLE_RECURSIVE_API_CALL;
		} 
		multi.curl_multi_setopt(CURLMOPT_MAXCONNECTS, ModernizedCProgram.data.getSet().getMaxconnects());
		mcode = ModernizedCProgram.curl_multi_add_handle(multi, ModernizedCProgram.data);
		if (mcode) {
			multi.curl_multi_cleanup();
			if (mcode == CURLM_OUT_OF_MEMORY) {
				return CURLE_OUT_OF_MEMORY;
			} 
			return CURLE_FAILED_INIT;
		} 
		do {
		} while (0);
		ModernizedCProgram.data.setMulti(/* assign this after curl_multi_add_handle() since that function checks for
		     it and rejects this handle otherwise */multi);
		result = events ? CURLE_NOT_BUILT_IN : /* run the transfer */multi.easy_transfer();
		(Object)ModernizedCProgram.curl_multi_remove_handle(multi, /* ignoring the return code isn't nice, but atm we can't really handle
		     a failure here, room for future improvement! */ModernizedCProgram.data);
		do {
		} while (0);
		return /* The multi handle is kept alive, owned by the easy handle */result/*
		 * curl_easy_perform() is the external interface that performs a blocking
		 * transfer as previously setup.
		 */;
	}
	public Object curl_easy_perform() {
		return ModernizedCProgram.data.easy_perform(0/*
		 * curl_easy_perform_ev() is the external interface that performs a blocking
		 * transfer using the event-based API internally.
		 */);
	}
	/*
	 * curl_easy_cleanup() is the external interface to cleaning/freeing the given
	 * easy handle.
	 */
	public void curl_easy_cleanup() {
		;
		if (!ModernizedCProgram.data) {
			return /*Error: Unsupported expression*/;
		} 
		do {
		} while (0);
		ModernizedCProgram.data.Curl_close();
		do {
		} while (0/*
		 * curl_easy_getinfo() is an external interface that allows an app to retrieve
		 * information from a performed transfer and similar.
		 */);
	}
	public Object curl_easy_getinfo(Object info) {
		va_list arg = new va_list();
		Object paramp;
		 result = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(arg, info);
		paramp = (int)arg;
		result = /*Error: Function owner not recognized*/Curl_getinfo(ModernizedCProgram.data, info, paramp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(arg);
		return result;
	}
	public Object dupset(Curl_easy src) {
		 result = CURLE_OK;
		dupstring i;
		UserDefined generatedSet = src.getSet();
		this.setSet(generatedSet);
		Object generatedMimepost = generatedSet.getMimepost();
		dst.Curl_mime_initpart(generatedMimepost);
		Object generatedStr = generatedSet.getStr();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedStr, 0, dupstring.STRING_LAST * /*Error: Unsupported expression*//* clear all string pointers first */);
		for (dupstring.i = (dupstring)0; dupstring.i < dupstring.STRING_LASTZEROTERMINATED; /* duplicate all strings */dupstring.i++) {
			result = ModernizedCProgram.Curl_setstropt(generatedStr[dupstring.i], generatedStr[dupstring.i]);
			if (result) {
				return result;
			} 
		}
		dupstring.i = /* duplicate memory areas pointed to */dupstring.STRING_COPYPOSTFIELDS;
		Object generatedPostfieldsize = generatedSet.getPostfieldsize();
		if (generatedPostfieldsize && generatedStr[dupstring.i]) {
			generatedStr[dupstring.i] = ModernizedCProgram.Curl_memdup(generatedStr[/* postfieldsize is curl_off_t, Curl_memdup() takes a size_t ... */dupstring.i], ModernizedCProgram.curlx_sotouz(generatedPostfieldsize));
			if (!generatedStr[dupstring.i]) {
				return CURLE_OUT_OF_MEMORY;
			} 
			generatedSet.setPostfields(generatedStr[/* point to the new copy */dupstring.i]);
		} 
		result = ModernizedCProgram.Curl_mime_duppart(generatedMimepost, generatedMimepost);
		curl_slist generatedResolve = generatedSet.getResolve();
		DynamicStatic generatedChange = this.getChange();
		if (generatedResolve) {
			generatedChange.setResolve(generatedResolve);
		} 
		return result/*
		 * curl_easy_duphandle() is an external interface to allow duplication of a
		 * given input easy handle. The returned handle will be a new working handle
		 * with all options set exactly as the input source handle.
		 */;
	}
	public Curl_easy curl_easy_duphandle() {
		Curl_easy outcurl = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*/);
		if (((Object)0) == outcurl) {
			;
		} 
		UserDefined generatedSet = outcurl.getSet();
		generatedSet.setBuffer_size(ModernizedCProgram.data.getSet().getBuffer_size());
		long generatedBuffer_size = generatedSet.getBuffer_size();
		UrlState generatedState = outcurl.getState();
		generatedState.setBuffer(/*Error: Function owner not recognized*/Curl_cmalloc(generatedBuffer_size + 1));
		byte[] generatedBuffer = generatedState.getBuffer();
		if (!generatedBuffer) {
			;
		} 
		generatedState.setHeaderbuff(/*Error: Function owner not recognized*/Curl_cmalloc(256));
		Byte generatedHeaderbuff = generatedState.getHeaderbuff();
		if (!generatedHeaderbuff) {
			;
		} 
		generatedState.setHeadersize(256);
		if (outcurl.dupset(/* copy all userdefined values */ModernizedCProgram.data)) {
			;
		} 
		generatedState.setConn_cache(((Object)/* the connection cache is setup on demand */0));
		generatedState.setLastconnect(((Object)0));
		Progress generatedProgress = outcurl.getProgress();
		generatedProgress.setFlags(ModernizedCProgram.data.getProgress().getFlags());
		Object generatedCallback = generatedProgress.getCallback();
		generatedProgress.setCallback(generatedCallback);
		CookieInfo[] generatedCookies = outcurl.getCookies();
		Object generatedCookiesession = generatedSet.getCookiesession();
		if (ModernizedCProgram.data.getCookies()) {
			outcurl.setCookies(generatedCookies.Curl_cookie_init(ModernizedCProgram.data, ModernizedCProgram.data.getCookies().getFilename(), generatedCookiesession));
			if (!generatedCookies) {
				;
			} 
		} 
		DynamicStatic generatedChange = outcurl.getChange();
		curl_slist generatedCookielist = generatedChange.getCookielist();
		if (ModernizedCProgram.data.getChange().getCookielist()) {
			generatedChange.setCookielist(ModernizedCProgram.data.getChange().getCookielist().Curl_slist_duplicate());
			if (!generatedCookielist) {
				;
			} 
		} 
		Byte generatedUrl = generatedChange.getUrl();
		if (generatedUrl) {
			generatedChange.setUrl(/*Error: Function owner not recognized*/Curl_cstrdup(generatedUrl));
			if (!generatedUrl) {
				;
			} 
			generatedChange.setUrl_alloc(1);
		} 
		Byte generatedReferer = generatedChange.getReferer();
		if (generatedReferer) {
			generatedChange.setReferer(/*Error: Function owner not recognized*/Curl_cstrdup(generatedReferer));
			if (!generatedReferer) {
				;
			} 
			generatedChange.setReferer_alloc(1);
		} 
		Object generatedStr = generatedSet.getStr();
		if (generatedStr[/* Reinitialize an SSL engine for the new handle
		   * note: the engine name has already been copied by dupset */dupstring.STRING_SSL_ENGINE]) {
			if (/*Error: Function owner not recognized*/Curl_ssl_set_engine(outcurl, generatedStr[dupstring.STRING_SSL_ENGINE])) {
				;
			} 
		} 
		Object generatedResolver = generatedState.getResolver();
		if (/* Clone the resolver handle, if present, for the new handle */outcurl.Curl_resolver_duphandle(generatedResolver, generatedResolver)) {
			;
		} 
		do {
		} while (0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_initinfo(outcurl);
		outcurl.setMagic(-1024);
		return /* we reach this point and thus we are OK */outcurl;
		return ((Object)0/*
		 * curl_easy_reset() is an external interface that allows an app to re-
		 * initialize a session handle to the default values.
		 */);
	}
	public void curl_easy_reset() {
		long old_buffer_size = ModernizedCProgram.data.getSet().getBuffer_size();
		ModernizedCProgram.data.Curl_free_request_state();
		/* zero out UserDefined data: */ModernizedCProgram.data.Curl_freeset();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getSet(), 0, /*Error: Unsupported expression*/);
		(Object)ModernizedCProgram.data.Curl_init_userdefined();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getProgress(), 0, /*Error: Unsupported expression*//* zero out Progress data: */);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_initinfo(/* zero out PureInfo data: */ModernizedCProgram.data);
		ModernizedCProgram.data.getProgress().getFlags() |=  (1 << 4);
		ModernizedCProgram.data.getState().setCurrent_speed(-/* init to negative == impossible */1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getState().getAuthhost(), 0, /*Error: Unsupported expression*//* zero out authentication data: */);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getState().getAuthproxy(), 0, /*Error: Unsupported expression*/);
		ModernizedCProgram.data.Curl_http_auth_cleanup_digest();
		if (old_buffer_size != ModernizedCProgram.data.getSet().getBuffer_size()) {
			byte newbuff = /*Error: Function owner not recognized*/Curl_crealloc(ModernizedCProgram.data.getState().getBuffer(), ModernizedCProgram.data.getSet().getBuffer_size() + 1);
			if (!newbuff) {
				do {
				} while (0);
				ModernizedCProgram.data.getSet().setBuffer_size(/* nothing we can do here except use the old size */old_buffer_size);
			} else {
					ModernizedCProgram.data.getState().setBuffer(newbuff/*
					 * curl_easy_pause() allows an application to pause or unpause a specific
					 * transfer and direction. This function sets the full new state for the
					 * current connection this easy handle operates on.
					 *
					 * NOTE: if you have the receiving paused and you call this function to remove
					 * the pausing, you may get your write callback called at this point.
					 *
					 * Action is a bitmask consisting of CURLPAUSE_* bits in curl/curl.h
					 *
					 * NOTE: This is one of few API functions that are allowed to be called from
					 * within a callback.
					 */);
			} 
		} 
	}
	public Object curl_easy_pause(int action) {
		SingleRequest k = ModernizedCProgram.data.getReq();
		 result = CURLE_OK;
		int generatedKeepon = k.getKeepon();
		int newstate = generatedKeepon & ~((1 << 4) | (1 << /* first switch off both pause bits */5));
		newstate |=  ((action & CURLPAUSE_RECV) ? (1 << 4) : /* set the new desired pause bits */0) | ((action & CURLPAUSE_SEND) ? (1 << 5) : 0);
		k.setKeepon(/* put it back in the keepon */newstate);
		Curl_easy generatedData = conn.getData();
		if (!(newstate & (1 << 4)) && ModernizedCProgram.data.getState().getTempcount()) {
			int i;
			int count = ModernizedCProgram.data.getState().getTempcount();
			tempbuf[] writebuf = new tempbuf();
			connectdata conn = ModernizedCProgram.data.getConn();
			Curl_easy saved_data = ((Object)0);
			for (i = 0; i < ModernizedCProgram.data.getState().getTempcount(); /* copy the structs to allow for immediate re-pausing */i++) {
				writebuf[i] = ModernizedCProgram.data.getState().getTempwrite()[i];
				ModernizedCProgram.data.getState().getTempwrite()[i].setBuf(((Object)0));
			}
			ModernizedCProgram.data.getState().setTempcount(0);
			if (generatedData != /* set the connection's current owner */ModernizedCProgram.data) {
				saved_data = generatedData;
				conn.setData(ModernizedCProgram.data);
			} 
			for (i = 0; i < count; i/* even if one function returns error, this loops through and frees all
			         buffers */++) {
				if (!result) {
					result = conn.Curl_client_write(writebuf[i].getType(), writebuf[i].getBuf(), writebuf[i].getLen());
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(writebuf[i].getBuf());
			}
			if (/* recover previous owner of the connection */saved_data) {
				conn.setData(saved_data);
			} 
			if (result) {
				return result;
			} 
		} 
		if ((newstate & ((1 << 4) | (1 << /* if there's no error and we're not pausing both directions, we want
		     to have this handle checked soon */5))) != ((1 << 4) | (1 << 5))) {
			ModernizedCProgram.data.Curl_expire(0, /* get this handle going again */.EXPIRE_RUN_NOW);
			if (ModernizedCProgram.data.getMulti()) {
				ModernizedCProgram.data.getMulti().Curl_update_timer();
			} 
		} 
		/* This transfer may have been moved in or out of the bundle, update
		     the corresponding socket callback, if used */ModernizedCProgram.data.Curl_updatesocket();
		return result;
	}
	public Object curl_easy_recv(Object buffer, Object buflen, Object n) {
		 sfd = new ();
		 result = new ();
		ssize_t n1 = new ssize_t();
		connectdata c = new connectdata();
		if (ModernizedCProgram.data.Curl_is_in_callback()) {
			return CURLE_RECURSIVE_API_CALL;
		} 
		result = ModernizedCProgram.easy_connection(ModernizedCProgram.data, sfd, c);
		if (result) {
			return result;
		} 
		n = 0;
		result = c.Curl_read(sfd, buffer, buflen, n1);
		if (result) {
			return result;
		} 
		n = (size_t)n1;
		return CURLE_OK/*
		 * Sends data over the connected socket. Use after successful
		 * curl_easy_perform() with CURLOPT_CONNECT_ONLY option.
		 */;
	}
	public Object curl_easy_send(Object buffer, Object buflen, Object n) {
		 sfd = new ();
		 result = new ();
		ssize_t n1 = new ssize_t();
		connectdata c = ((Object)0);
		if (ModernizedCProgram.data.Curl_is_in_callback()) {
			return CURLE_RECURSIVE_API_CALL;
		} 
		result = ModernizedCProgram.easy_connection(ModernizedCProgram.data, sfd, c);
		if (result) {
			return result;
		} 
		n = 0;
		result = c.Curl_write(sfd, buffer, buflen, n1);
		if (n1 == -1) {
			return CURLE_SEND_ERROR;
		} 
		if (!result && !/* detect EAGAIN */n1) {
			return CURLE_AGAIN;
		} 
		n = (size_t)n1;
		return result/*
		 * Wrapper to call functions in Curl_conncache_foreach()
		 *
		 * Returns always 0.
		 */;
	}
	public Object curl_easy_upkeep() {
		if (!((ModernizedCProgram.data) && ((ModernizedCProgram.data).getMagic() == /* Verify that we got an easy handle we can work with. */-1024))) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		if (ModernizedCProgram.data.getMulti_easy()) {
			return ModernizedCProgram.data.getMulti_easy().getConn_cache().upkeep(/* Use the common function to keep connections alive. */ModernizedCProgram.data);
		} else {
				return /* No connections, so just return success */CURLE_OK;
		} 
	}
	public void Curl_cookie_loadfiles() {
		curl_slist list = ModernizedCProgram.data.getChange().getCookielist();
		Object generatedCurl_slist = list.getCurl_slist();
		if (list) {
			ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
			while (list) {
				CookieInfo newcookies = ModernizedCProgram.data.getCookies().Curl_cookie_init(ModernizedCProgram.data, generatedCurl_slist, ModernizedCProgram.data.getSet().getCookiesession());
				if (!newcookies/* Failure may be due to OOM or a bad cookie; both are ignored
				         * but only the first should be
				         */) {
					ModernizedCProgram.data.Curl_infof("ignoring failed cookie_init for %s\n", generatedCurl_slist);
				} else {
						ModernizedCProgram.data.setCookies(newcookies);
				} 
				list = generatedCurl_slist;
			}
			ModernizedCProgram.data.getChange().getCookielist().curl_slist_free_all();
			ModernizedCProgram.data.getChange().setCookielist(((Object)/* don't do this again! */0));
			ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE/*
			 * strstore() makes a strdup() on the 'newstr' and if '*str' is non-NULL
			 * that will be freed before the allocated string is stored there.
			 *
			 * It is meant to easily replace strdup()
			 */);
		} 
	}
	public void Curl_flush_cookies( cleanup) {
		if (ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COOKIEJAR]) {
			if (ModernizedCProgram.data.getChange().getCookielist()) {
				ModernizedCProgram.data.Curl_cookie_loadfiles();
			} 
			ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
			if (ModernizedCProgram.data.getCookies().cookie_output(ModernizedCProgram.data.getSet().getStr()[/* if we have a destination file for all the cookies to get dumped to */dupstring.STRING_COOKIEJAR])) {
				ModernizedCProgram.data.Curl_infof("WARNING: failed to save cookies in %s\n", ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COOKIEJAR]);
			} 
		} else {
				if (cleanup && ModernizedCProgram.data.getChange().getCookielist()) {
					ModernizedCProgram.data.getChange().getCookielist().curl_slist_free_all();
					ModernizedCProgram.data.getChange().setCookielist(((Object)0));
				} 
				ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
		} 
		if (cleanup && (!ModernizedCProgram.data.getShare() || (ModernizedCProgram.data.getCookies() != ModernizedCProgram.data.getShare().getCurl_share()))) {
			ModernizedCProgram.data.getCookies().Curl_cookie_cleanup();
			ModernizedCProgram.data.setCookies(((Object)0));
		} 
		ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE/* CURL_DISABLE_HTTP || CURL_DISABLE_COOKIES */);
	}
	/*
	 * Do not make Curl_vsetopt() static: it is called from
	 * packages/OS400/ccsidcurl.c.
	 */
	public Object Curl_vsetopt(Object option, Object param) {
		byte argptr;
		 result = CURLE_OK;
		long arg;
		long uarg;
		 bigsize = new ();
		Cookie cookie = new Cookie();
		switch (option) {
		case CURLOPT_COOKIEFILE/*
		     * Set cookie file to read and parse. Can be used multiple times.
		     */:
				argptr = (byte)(int)param;
				if (argptr) {
					curl_slist cl = new curl_slist();
					cl = ModernizedCProgram.data.getChange().getCookielist().curl_slist_append(argptr);
					if (!cl) {
						ModernizedCProgram.data.getChange().getCookielist().curl_slist_free_all();
						ModernizedCProgram.data.getChange().setCookielist(((Object)0));
						return CURLE_OUT_OF_MEMORY;
					} 
					ModernizedCProgram.data.getChange().setCookielist(/* store the list for later use */cl);
				} 
				break;
		case CURLOPT_PROXYUSERPWD/*
		     * user:password needed to use the proxy
		     */:
				result = ModernizedCProgram.setstropt_userpwd((int)param, ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXYUSERNAME], ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXYPASSWORD]);
				break;
		case CURLOPT_INTERLEAVEDATA:
				ModernizedCProgram.data.getSet().setRtp_out((int)param);
				break;
		case CURLOPT_PREQUOTE/*
		     * List of RAW FTP commands to use prior to RETR (Wesley Laxton)
		     */:
				ModernizedCProgram.data.getSet().setPrequote((int)param);
				break;
		case CURLOPT_TIMEOUT/*
		     * The maximum time you allow curl to use for a single transfer
		     * operation.
		     */:
				arg = (int)param;
				if ((arg >= 0) && (arg <= (2147483647 / 1000))) {
					ModernizedCProgram.data.getSet().setTimeout(arg * 1000);
				} else {
						return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				break;
		case CURLOPT_STDERR/*
		     * Set to a FILE * that should receive all error writes. This
		     * defaults to stderr for normal operations.
		     */:
				ModernizedCProgram.data.getSet().setErr((int)param);
				if (!ModernizedCProgram.data.getSet().getErr()) {
					ModernizedCProgram.data.getSet().setErr((_iob[2]));
				} 
				break;
		case CURLOPT_TFTP_NO_OPTIONS/*
		     * Option that prevents libcurl from sending TFTP option requests to the
		     * server.
		     */:
				ModernizedCProgram.data.getSet().setTftp_no_options((int)param != 0);
				break;
		case CURLOPT_SEEKDATA/*
		     * Seek control callback. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setSeek_client((int)param);
				break;
		case CURLOPT_COOKIE/*
		     * Cookie string to send to the remote server in the request.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COOKIE], (int)param);
				break;
		case CURLOPT_CONV_TO_NETWORK_FUNCTION/*
		     * "Convert to network encoding" callback
		     */:
				ModernizedCProgram.data.getSet().setConvtonetwork((int)param);
				break;
		case CURLOPT_SSLVERSION:
		case CURLOPT_PROTOCOLS/* set the bitmask for the protocols that are allowed to be used for the
		       transfer, which thus helps the app which takes URLs from users or other
		       external inputs and want to restrict what protocol(s) to deal
		       with. Defaults to CURLPROTO_ALL. */:
				ModernizedCProgram.data.getSet().setAllowed_protocols((int)param);
				break;
		case CURLOPT_OPENSOCKETFUNCTION/*
		     * open/create socket callback function: called instead of socket(),
		     * before connect()
		     */:
				ModernizedCProgram.data.getSet().setFopensocket((int)param);
				break;
		case CURLOPT_SSLCERT/*
		     * String that holds file name of the SSL certificate to use
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_CERT_ORIG], (int)param);
				break;
		case CURLOPT_FRESH_CONNECT/*
		     * This transfer shall not use a previously cached connection but
		     * should be made with a fresh new connect!
		     */:
				ModernizedCProgram.data.getSet().setReuse_fresh((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_VERBOSE/*
		     * Verbose means infof() calls that give a lot of information about
		     * the connection and transfer procedures as well as internal choices.
		     */:
				ModernizedCProgram.data.getSet().setVerbose((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_RESOLVER_START_DATA/*
		     * resolver start callback data pointer. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setResolver_start_client((int)param);
				break;
		case CURLOPT_ADDRESS_SCOPE/*
		     * Use this scope id when using IPv6
		     * We always get longs when passed plain numericals so we should check
		     * that the value fits into an unsigned 32 bit integer.
		     */:
				uarg = (int)param;
				ModernizedCProgram.data.getSet().setScope_id((int)uarg);
				break;
		case CURLOPT_MAIL_AUTH:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* Set the SMTP auth originator */dupstring.STRING_MAIL_AUTH], (int)param);
				break;
		case CURLOPT_SSL_CTX_FUNCTION/*
		     * Set a SSL_CTX callback
		     */:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_IPRESOLVE:
				arg = (int)param;
				if ((arg < CURL_IPRESOLVE_WHATEVER) || (arg > CURL_IPRESOLVE_V6)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setIpver(arg);
				break;
		case CURLOPT_APPEND/*
		     * We want to upload and append to an existing file. Used for FTP and
		     * SFTP.
		     */:
				ModernizedCProgram.data.getSet().setFtp_append((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_TCP_FASTOPEN:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_SSLKEYTYPE/*
		     * String that holds file type of the SSL key to use
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_TYPE_ORIG], (int)param);
				break;
		case CURLOPT_FAILONERROR/*
		     * Don't output the >=400 error code HTML-page, but instead only
		     * return error.
		     */:
				ModernizedCProgram.data.getSet().setHttp_fail_on_error((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_CLOSESOCKETFUNCTION/*
		     * close socket callback function: called instead of close()
		     * when shutting down a connection
		     */:
				ModernizedCProgram.data.getSet().setFclosesocket((int)param);
				break;
		case CURLOPT_PRE_PROXY/*
		     * Set proxy server:port to use as SOCKS proxy.
		     *
		     * If the proxy is set to "" or NULL we explicitly say that we don't want
		     * to use the socks proxy.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PRE_PROXY], (int)param);
				break;
		case CURLOPT_SERVICE_NAME/*
		     * Set authentication service name for DIGEST-MD5, Kerberos 5 and SPNEGO
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SERVICE_NAME], (int)param);
				break;
		case CURLOPT_READFUNCTION/*
		     * Read data callback
		     */:
				ModernizedCProgram.data.getSet().setFread_func_set((int)param);
				if (!ModernizedCProgram.data.getSet().getFread_func_set()) {
					ModernizedCProgram.data.getSet().setIs_fread_set(0);
					ModernizedCProgram.data.getSet().setFread_func_set(()/* When set to NULL, reset to our internal default function */ModernizedCProgram.fread);
				} else {
						ModernizedCProgram.data.getSet().setIs_fread_set(1);
				} 
				break;
		case CURLOPT_INFILESIZE/*
		     * If known, this should inform curl about the file size of the
		     * to-be-uploaded file.
		     */:
				arg = (int)param;
				if (arg < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setFilesize(arg);
				break;
		case CURLOPT_DEBUGFUNCTION/*
		     * stderr write callback.
		     */:
				ModernizedCProgram.data.getSet().setFdebug((int)param/*
				     * if the callback provided is NULL, it'll use the default callback
				     */);
				break;
		case CURLOPT_RESOLVER_START_FUNCTION/*
		     * resolver start callback function: called before a new resolver request
		     * is started
		     */:
				ModernizedCProgram.data.getSet().setResolver_start((int)param);
				break;
		case CURLOPT_TRAILERFUNCTION:
				ModernizedCProgram.data.getSet().setTrailer_callback((int)param);
				break;
		case CURLOPT_PROXY/*
		     * Set proxy server:port to use as proxy.
		     *
		     * If the proxy is set to "" (and CURLOPT_SOCKS_PROXY is set to "" or NULL)
		     * we explicitly say that we don't want to use a proxy
		     * (even though there might be environment variables saying so).
		     *
		     * Setting it to NULL, means no proxy but allows the environment variables
		     * to decide for us (if CURLOPT_SOCKS_PROXY setting it to NULL).
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXY], (int)param);
				break;
		case CURLOPT_MAX_SEND_SPEED_LARGE/*
		     * When transfer uploads are faster then CURLOPT_MAX_SEND_SPEED_LARGE
		     * bytes per second the transfer is throttled..
		     */:
				bigsize = (int)param;
				if (bigsize < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMax_send_speed(bigsize);
				break;
		case CURLOPT_IGNORE_CONTENT_LENGTH:
				ModernizedCProgram.data.getSet().setIgnorecl((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_UPLOAD_BUFFERSIZE/*
		     * The application kindly asks for a differently sized upload buffer.
		     * Cap it to sensible.
		     */:
				arg = (int)param;
				if (arg > (2 * 1024 * 1024)) {
					arg = (2 * 1024 * 1024);
				}  else if (arg < CURL_MAX_WRITE_SIZE) {
					arg = CURL_MAX_WRITE_SIZE;
				} 
				ModernizedCProgram.data.getSet().setUpload_buffer_size(arg);
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getState().getUlbuf()));
					(ModernizedCProgram.data.getState().getUlbuf()) = ((Object)0);
				} while (/* force a realloc next opportunity */0);
				break;
		case CURLOPT_SUPPRESS_CONNECT_HEADERS:
				ModernizedCProgram.data.getSet().setSuppress_connect_headers((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_MAXCONNECTS/*
		     * Set the absolute number of maximum simultaneous alive connection that
		     * libcurl is allowed to have.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMaxconnects(arg);
				break;
		case CURLOPT_LOW_SPEED_LIMIT/*
		     * The low speed limit that if transfers are below this for
		     * CURLOPT_LOW_SPEED_TIME, the transfer is aborted.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setLow_speed_limit(arg);
				break;
		case CURLOPT_ACCEPT_ENCODING/*
		     * String to use at the value of Accept-Encoding header.
		     *
		     * If the encoding is set to "" we use an Accept-Encoding header that
		     * encompasses all the encodings we support.
		     * If the encoding is set to NULL we don't send an Accept-Encoding header
		     * and ignore an received Content-Encoding header.
		     *
		     */:
				argptr = (int)param;
				if (argptr && !argptr) {
					argptr = ModernizedCProgram.Curl_all_content_encodings();
					if (!argptr) {
						result = CURLE_OUT_OF_MEMORY;
					} else {
							result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_ENCODING], argptr);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(argptr);
					} 
				} else {
						result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_ENCODING], argptr);
				} 
				break;
		case CURLOPT_RTSP_REQUEST/*
		     * Set the RTSP request method (OPTIONS, SETUP, PLAY, etc...)
		     * Would this be better if the RTSPREQ_* were just moved into here?
		     */:
				{ 
					long curl_rtspreq = (int)param;
					Curl_RtspReq rtspreq = .RTSPREQ_NONE;
					switch (curl_rtspreq) {
					case CURL_RTSPREQ_PLAY:
							rtspreq = .RTSPREQ_PLAY;
							break;
					case CURL_RTSPREQ_OPTIONS:
							rtspreq = .RTSPREQ_OPTIONS;
							break;
					case CURL_RTSPREQ_PAUSE:
							rtspreq = .RTSPREQ_PAUSE;
							break;
					case CURL_RTSPREQ_SET_PARAMETER:
							rtspreq = .RTSPREQ_SET_PARAMETER;
							break;
					case CURL_RTSPREQ_RECEIVE:
							rtspreq = .RTSPREQ_RECEIVE;
							break;
					case CURL_RTSPREQ_SETUP:
							rtspreq = .RTSPREQ_SETUP;
							break;
					case CURL_RTSPREQ_GET_PARAMETER:
							rtspreq = .RTSPREQ_GET_PARAMETER;
							break;
					case CURL_RTSPREQ_DESCRIBE:
							rtspreq = .RTSPREQ_DESCRIBE;
							break;
					case CURL_RTSPREQ_TEARDOWN:
							rtspreq = .RTSPREQ_TEARDOWN;
							break;
					case CURL_RTSPREQ_RECORD:
							rtspreq = .RTSPREQ_RECORD;
							break;
					case CURL_RTSPREQ_ANNOUNCE:
							rtspreq = .RTSPREQ_ANNOUNCE;
							break;
					default:
							rtspreq = .RTSPREQ_NONE;
					}
					ModernizedCProgram.data.getSet().setRtspreq(rtspreq);
					break;
				}
		case CURLOPT_PROGRESSFUNCTION/*
		     * Progress callback function
		     */:
				ModernizedCProgram.data.getSet().setFprogress((int)param);
				if (ModernizedCProgram.data.getSet().getFprogress()) {
					ModernizedCProgram.data.getProgress().setCallback(/* no longer internal */1);
				} else {
						ModernizedCProgram.data.getProgress().setCallback(/* NULL enforces internal */0);
				} 
				break;
		case CURLOPT_SOCKS5_GSSAPI_SERVICE:
		case CURLOPT_TRANSFER_ENCODING:
				ModernizedCProgram.data.getSet().setHttp_transfer_encoding((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_COOKIESESSION/*
		     * Set this option to TRUE to start a new "cookie session". It will
		     * prevent the forthcoming read-cookies-from-file actions to accept
		     * cookies that are marked as being session cookies, as they belong to a
		     * previous session.
		     *
		     * In the original Netscape cookie spec, "session cookies" are cookies
		     * with no expire date set. RFC2109 describes the same action if no
		     * 'Max-Age' is set and RFC2965 includes the RFC2109 description and adds
		     * a 'Discard' action that can enforce the discard even for cookies that
		     * have a Max-Age.
		     *
		     * We run mostly with the original cookie spec, as hardly anyone implements
		     * anything else.
		     */:
				ModernizedCProgram.data.getSet().setCookiesession((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_STREAM_DEPENDS_E:
				{ 
					return CURLE_NOT_BUILT_IN;
				}
		case CURLOPT_HTTP_VERSION/*
		     * This sets a requested HTTP version to be used. The value is one of
		     * the listed enums in curl/curl.h.
		     */:
				arg = (int)param;
				if (arg < CURL_HTTP_VERSION_NONE) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				if (arg >= CURL_HTTP_VERSION_2) {
					return CURLE_UNSUPPORTED_PROTOCOL;
				} 
				ModernizedCProgram.data.getSet().setHttpversion(arg);
				break;
		case CURLOPT_USERPWD/*
		     * user:password to use in the operation
		     */:
				result = ModernizedCProgram.setstropt_userpwd((int)param, ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_USERNAME], ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PASSWORD]);
				break;
		case CURLOPT_FTP_ACCOUNT:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_FTP_ACCOUNT], (int)param);
				break;
		case CURLOPT_HTTPPROXYTUNNEL/*
		     * Tunnel operations through the proxy instead of normal proxy use
		     */:
				ModernizedCProgram.data.getSet().setTunnel_thru_httpproxy((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_RESUME_FROM_LARGE/*
		     * Resume transfer at the given file position
		     */:
				bigsize = (int)param;
				if (bigsize < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setSet_resume_from(bigsize);
				break;
		case CURLOPT_PROXY_SSLCERT/*
		     * String that holds file name of the SSL certificate to use for proxy
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_CERT_PROXY], (int)param);
				break;
		case CURLOPT_FTPSSLAUTH/*
		     * Set a specific auth for FTP-SSL transfers.
		     */:
				arg = (int)param;
				if ((arg < CURLFTPAUTH_DEFAULT) || (arg >= CURLFTPAUTH_LAST)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setFtpsslauth(()arg);
				break;
		case CURLOPT_NEW_FILE_PERMS/*
		     * Uses these permissions instead of 0644
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 777)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setNew_file_perms(arg);
				break;
		case CURLOPT_PROXYUSERNAME/*
		     * authentication user name to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXYUSERNAME], (int)param);
				break;
		case CURLOPT_RTSP_SESSION_ID/*
		     * Set the RTSP Session ID manually. Useful if the application is
		     * resuming a previously established RTSP session
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_RTSP_SESSION_ID], (int)param);
				break;
		case CURLOPT_PROXY_TLS13_CIPHERS:
				if (/*Error: Function owner not recognized*/Curl_ssl_tls13_ciphersuites()) {
					result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* set preferred list of TLS 1.3 cipher suites for proxy */dupstring.STRING_SSL_CIPHER13_LIST_PROXY], (int)param);
				} else {
						return CURLE_NOT_BUILT_IN;
				} 
				break;
		case CURLOPT_SSLKEY/*
		     * String that holds file name of the SSL key to use
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_ORIG], (int)param);
				break;
		case CURLOPT_NEW_DIRECTORY_PERMS/*
		     * Uses these permissions instead of 0755
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 777)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setNew_directory_perms(arg);
				break;
		case CURLOPT_CHUNK_DATA:
				ModernizedCProgram.data.getWildcard().setCustomptr((int)param);
				break;
		case CURLOPT_POST/* Does this option serve a purpose anymore? Yes it does, when
		       CURLOPT_POSTFIELDS isn't used and the POST data is read off the
		       callback! */:
				if ((int)param) {
					ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_POST);
					ModernizedCProgram.data.getSet().setOpt_no_body(/* this is implied */0);
				} else {
						ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_GET);
				} 
				break;
		case CURLOPT_FTP_SKIP_PASV_IP/*
		     * Enable or disable FTP_SKIP_PASV_IP, which will disable/enable the
		     * bypass of the IP address in PASV responses.
		     */:
				ModernizedCProgram.data.getSet().setFtp_skip_ip((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_CONNECTTIMEOUT_MS:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setConnecttimeout(arg);
				break;
		case CURLOPT_SEEKFUNCTION/*
		     * Seek callback. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setSeek_func((int)param);
				break;
		case CURLOPT_PROXY_SSL_VERIFYPEER/*
		     * Enable peer SSL verifying for proxy.
		     */:
				ModernizedCProgram.data.getSet().getProxy_ssl().getPrimary().setVerifypeer((0 != (int)param) ? 1 : 0);
				if (ModernizedCProgram.data.getConn()) {
					ModernizedCProgram.data.getConn().getProxy_ssl_config().setVerifypeer(ModernizedCProgram.data.getSet().getProxy_ssl().getPrimary().getVerifypeer());
				} 
				break;
		case CURLOPT_TLS13_CIPHERS:
				if (/*Error: Function owner not recognized*/Curl_ssl_tls13_ciphersuites()) {
					result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* set preferred list of TLS 1.3 cipher suites */dupstring.STRING_SSL_CIPHER13_LIST_ORIG], (int)param);
				} else {
						return CURLE_NOT_BUILT_IN;
				} 
				break;
		case CURLOPT_MAXREDIRS/*
		     * The maximum amount of hops you allow curl to follow Location:
		     * headers. This should mostly be used to detect never-ending loops.
		     */:
				arg = (int)param;
				if (arg < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMaxredirs(arg);
				break;
		case CURLOPT_SSL_SESSIONID_CACHE:
				ModernizedCProgram.data.getSet().getSsl().getPrimary().setSessionid((0 != (int)param) ? 1 : 0);
				ModernizedCProgram.data.getSet().getProxy_ssl().getPrimary().setSessionid(ModernizedCProgram.data.getSet().getSsl().getPrimary().getSessionid());
				break;
		case CURLOPT_DIRLISTONLY/*
		     * An option that changes the command to one that asks for a list only, no
		     * file info details. Used for FTP, POP3 and SFTP.
		     */:
				ModernizedCProgram.data.getSet().setFtp_list_only((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_NOPROXY/*
		     * proxy exception list
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_NOPROXY], (int)param);
				break;
		case CURLOPT_CONNECT_ONLY/*
		     * No data transfer, set up connection and let application use the socket
		     */:
				ModernizedCProgram.data.getSet().setConnect_only((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_NOSIGNAL/*
		     * The application asks not to set any signal() or alarm() handlers,
		     * even when using a timeout.
		     */:
				ModernizedCProgram.data.getSet().setNo_signal((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_PASSWORD/*
		     * authentication password to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PASSWORD], (int)param);
				break;
		case CURLOPT_READDATA/*
		     * FILE pointer to read the file to be uploaded from. Or possibly
		     * used as argument to the read callback.
		     */:
				ModernizedCProgram.data.getSet().setIn_set((int)param);
				break;
		case CURLOPT_DEFAULT_PROTOCOL:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* Set the protocol to use when the URL doesn't include any protocol */dupstring.STRING_DEFAULT_PROTOCOL], (int)param);
				break;
		case CURLOPT_SASL_AUTHZID:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* Authorisation identity (identity to act as) */dupstring.STRING_SASL_AUTHZID], (int)param);
				break;
		case CURLOPT_CURLU/*
		     * pass CURLU to set URL
		     */:
				ModernizedCProgram.data.getSet().setUh((int)param);
				break;
		case CURLOPT_HEADERDATA/*
		     * Custom pointer to pass the header write callback function
		     */:
				ModernizedCProgram.data.getSet().setWriteheader((Object)(int)param);
				break;
		case CURLOPT_UNRESTRICTED_AUTH/*
		     * Send authentication (user+password) when following locations, even when
		     * hostname changed.
		     */:
				ModernizedCProgram.data.getSet().setAllow_auth_to_other_hosts((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_EXPECT_100_TIMEOUT_MS/*
		     * Time to wait for a response to a HTTP request containing an
		     * Expect: 100-continue header before sending the data anyway.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setExpect_100_timeout(arg);
				break;
		case CURLOPT_FILETIME/*
		     * Try to get the file time of the remote document. The time will
		     * later (possibly) become available using curl_easy_getinfo().
		     */:
				ModernizedCProgram.data.getSet().setGet_filetime((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_NETRC_FILE/*
		     * Use this file instead of the $HOME/.netrc file
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_NETRC_FILE], (int)param);
				break;
		case CURLOPT_TCP_KEEPINTVL:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setTcp_keepintvl(arg);
				break;
		case CURLOPT_PROXY_SSL_VERIFYHOST/*
		     * Enable verification of the host name in the peer certificate for proxy
		     */:
				arg = (int)param;
				ModernizedCProgram.data.getSet().getProxy_ssl().getPrimary().setVerifyhost((bool)((arg & 3) ? 1 : /* Treat both 1 and 2 as TRUE */0));
				if (ModernizedCProgram.data.getConn()) {
					ModernizedCProgram.data.getConn().getProxy_ssl_config().setVerifyhost(ModernizedCProgram.data.getSet().getProxy_ssl().getPrimary().getVerifyhost());
				} 
				break;
		case CURLOPT_RTSP_STREAM_URI/*
		     * Set the Stream URI for the RTSP request. Unless the request is
		     * for generic server options, the application will need to set this.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_RTSP_STREAM_URI], (int)param);
				break;
		case CURLOPT_PROXYPASSWORD/*
		     * authentication password to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXYPASSWORD], (int)param);
				break;
		case CURLOPT_PUT/*
		     * We want to sent data to the remote host. If this is HTTP, that equals
		     * using the PUT request.
		     */:
				ModernizedCProgram.data.getSet().setUpload((0 != (int)param) ? 1 : 0);
				if (ModernizedCProgram.data.getSet().getUpload()) {
					ModernizedCProgram.data.getSet().setHttpreq(/* If this is HTTP, PUT is what's needed to "upload" */.HTTPREQ_PUT);
					ModernizedCProgram.data.getSet().setOpt_no_body(/* this is implied */0);
				} else {
						ModernizedCProgram.data.getSet().setHttpreq(/* In HTTP, the opposite of upload is GET (unless NOBODY is true as
						         then this can be changed to HEAD later on) */.HTTPREQ_GET);
				} 
				break;
		case CURLOPT_SHARE:
				{ 
					Curl_share set = new Curl_share();
					set = (int)param;
					if (ModernizedCProgram.data.getShare()) {
						ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_SHARE, CURL_LOCK_ACCESS_SINGLE);
						if (ModernizedCProgram.data.getDns().getHostcachetype() == .HCACHE_SHARED) {
							ModernizedCProgram.data.getDns().setHostcache(((Object)0));
							ModernizedCProgram.data.getDns().setHostcachetype(.HCACHE_NONE);
						} 
						if (ModernizedCProgram.data.getShare().getCookies() == ModernizedCProgram.data.getCookies()) {
							ModernizedCProgram.data.setCookies(((Object)0));
						} 
						if (ModernizedCProgram.data.getShare().getSslsession() == ModernizedCProgram.data.getState().getSession()) {
							ModernizedCProgram.data.getState().setSession(((Object)0));
						} 
						ModernizedCProgram.data.getShare().getDirty()--;
						ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_SHARE);
						ModernizedCProgram.data.setShare(((Object)0));
					} 
					ModernizedCProgram.data.setShare(/* use new share if it set */set);
					if (ModernizedCProgram.data.getShare()) {
						ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_SHARE, CURL_LOCK_ACCESS_SINGLE);
						ModernizedCProgram.data.getShare().getDirty()++;
						if (ModernizedCProgram.data.getShare().getSpecifier() & (1 << CURL_LOCK_DATA_DNS)) {
							ModernizedCProgram.data.getDns().setHostcache(ModernizedCProgram.data.getShare().getHostcache());
							ModernizedCProgram.data.getDns().setHostcachetype(.HCACHE_SHARED);
						} 
						if (ModernizedCProgram.data.getShare().getCookies()) {
							ModernizedCProgram.data.getCookies().Curl_cookie_cleanup();
							ModernizedCProgram.data.setCookies(ModernizedCProgram.data.getShare().getCookies());
						} 
						if (ModernizedCProgram.data.getShare().getSslsession()) {
							ModernizedCProgram.data.getSet().getGeneral_ssl().setMax_ssl_sessions(ModernizedCProgram.data.getShare().getMax_ssl_sessions());
							ModernizedCProgram.data.getState().setSession(ModernizedCProgram.data.getShare().getSslsession());
						} 
						ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_SHARE/* check for host cache not needed,
						     * it will be done by curl_easy_perform */);
					} 
				}
				break;
		case CURLOPT_SSL_CIPHER_LIST:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* set a list of cipher we want to use in the SSL connection */dupstring.STRING_SSL_CIPHER_LIST_ORIG], (int)param);
				break;
		case CURLOPT_SSL_VERIFYHOST/*
		     * Enable verification of the host name in the peer certificate
		     */:
				arg = (int)param/* Obviously people are not reading documentation and too many thought
				       this argument took a boolean when it wasn't and misused it.
				       Treat 1 and 2 the same */;
				ModernizedCProgram.data.getSet().getSsl().getPrimary().setVerifyhost((bool)((arg & 3) ? 1 : 0));
				if (ModernizedCProgram.data.getConn()) {
					ModernizedCProgram.data.getConn().getSsl_config().setVerifyhost(ModernizedCProgram.data.getSet().getSsl().getPrimary().getVerifyhost());
				} 
				break;
		case CURLOPT_PROXY_TRANSFER_MODE/*
		     * set transfer mode (;type=<a|i>) when doing FTP via an HTTP proxy
		     */:
				switch ((int)param) {
				case 0:
						ModernizedCProgram.data.getSet().setProxy_transfer_mode(0);
						break;
				case 1:
						ModernizedCProgram.data.getSet().setProxy_transfer_mode(1);
						break;
				default:
						result = /* reserve other values for future use */CURLE_UNKNOWN_OPTION;
						break;
				}
				break;
		case CURLOPT_MAIL_FROM:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* Set the SMTP mail originator */dupstring.STRING_MAIL_FROM], (int)param);
				break;
		case CURLOPT_TIMECONDITION/*
		     * Set HTTP time condition. This must be one of the defines in the
		     * curl/curl.h header file.
		     */:
				arg = (int)param;
				if ((arg < CURL_TIMECOND_NONE) || (arg >= CURL_TIMECOND_LAST)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setTimecondition(()arg);
				break;
		case CURLOPT_SOCKS5_AUTH:
				ModernizedCProgram.data.getSet().setSocks5auth((int)param);
				if (ModernizedCProgram.data.getSet().getSocks5auth() & ~(CURLAUTH_BASIC | CURLAUTH_GSSAPI)) {
					result = CURLE_NOT_BUILT_IN;
				} 
				break;
		case CURLOPT_QUOTE/*
		     * List of RAW FTP commands to use before a transfer
		     */:
				ModernizedCProgram.data.getSet().setQuote((int)param);
				break;
		case CURLOPT_NETRC/*
		     * Parse the $HOME/.netrc file
		     */:
				arg = (int)param;
				if ((arg < CURL_NETRC_IGNORED) || (arg >= CURL_NETRC_LAST)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setUse_netrc((CURL_NETRC_OPTION)arg);
				break;
		case CURLOPT_USERAGENT/*
		     * String to use in the HTTP User-Agent field
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_USERAGENT], (int)param);
				break;
		case CURLOPT_STREAM_WEIGHT:
				return CURLE_NOT_BUILT_IN;
		case CURLOPT_CERTINFO:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_NOPROGRESS/*
		     * Shut off the internal supported progress meter
		     */:
				ModernizedCProgram.data.getSet().setHide_progress((0 != (int)param) ? 1 : 0);
				if (ModernizedCProgram.data.getSet().getHide_progress()) {
					ModernizedCProgram.data.getProgress().getFlags() |=  (1 << 4);
				} else {
						ModernizedCProgram.data.getProgress().getFlags() &=  ~(1 << 4);
				} 
				break;
		case CURLOPT_XOAUTH2_BEARER/*
		     * OAuth 2.0 bearer token to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_BEARER], (int)param);
				break;
		case CURLOPT_XFERINFOFUNCTION/*
		     * Transfer info callback function
		     */:
				ModernizedCProgram.data.getSet().setFxferinfo((int)param);
				if (ModernizedCProgram.data.getSet().getFxferinfo()) {
					ModernizedCProgram.data.getProgress().setCallback(/* no longer internal */1);
				} else {
						ModernizedCProgram.data.getProgress().setCallback(/* NULL enforces internal */0);
				} 
				break;
		case CURLOPT_LOCALPORTRANGE/*
		     * Set number of local ports to try, starting with CURLOPT_LOCALPORT.
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 65535)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setLocalportrange(ModernizedCProgram.curlx_sltosi(arg));
				break;
		case CURLOPT_EGDSOCKET/*
		     * The Entropy Gathering Daemon socket pathname
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_EGDSOCKET], (int)param);
				break;
		case CURLOPT_PROXY_SSLKEYTYPE/*
		     * String that holds file type of the SSL key to use for proxy
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_TYPE_PROXY], (int)param);
				break;
		case CURLOPT_SOCKOPTFUNCTION/*
		     * socket callback function: called after socket() but before connect()
		     */:
				ModernizedCProgram.data.getSet().setFsockopt((int)param);
				break;
		case CURLOPT_FTP_ALTERNATIVE_TO_USER:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_FTP_ALTERNATIVE_TO_USER], (int)param);
				break;
		case CURLOPT_COPYPOSTFIELDS/*
		     * A string with POST data. Makes curl HTTP POST. Even if it is NULL.
		     * If needed, CURLOPT_POSTFIELDSIZE must have been set prior to
		     *  CURLOPT_COPYPOSTFIELDS and not altered later.
		     */:
				argptr = (int)param;
				if (!argptr || ModernizedCProgram.data.getSet().getPostfieldsize() == -1) {
					result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS], argptr/*
					       *  Check that requested length does not overflow the size_t type.
					       */);
				} else {
						if ((ModernizedCProgram.data.getSet().getPostfieldsize() < 0) || ((/*Error: Unsupported expression*/ != /*Error: Unsupported expression*/) && (ModernizedCProgram.data.getSet().getPostfieldsize() > /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((size_t)-1)))) {
							result = CURLE_OUT_OF_MEMORY;
						} else {
								byte p;
								(Object)ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS], ((Object)0/* Allocate even when size == 0. This satisfies the need of possible
								           later address compare to detect the COPYPOSTFIELDS mode, and
								           to mark that postfields is used rather than read function or
								           form data.
								        */));
								p = /*Error: Function owner not recognized*/Curl_cmalloc((size_t)(ModernizedCProgram.data.getSet().getPostfieldsize() ? ModernizedCProgram.data.getSet().getPostfieldsize() : 1));
								if (!p) {
									result = CURLE_OUT_OF_MEMORY;
								} else {
										if (ModernizedCProgram.data.getSet().getPostfieldsize()) {
											/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, argptr, (size_t)ModernizedCProgram.data.getSet().getPostfieldsize());
										} 
										ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS] = p;
								} 
						} 
				} 
				ModernizedCProgram.data.getSet().setPostfields(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS]);
				ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_POST);
				break;
		case CURLOPT_MAX_RECV_SPEED_LARGE/*
		     * When receiving data faster than CURLOPT_MAX_RECV_SPEED_LARGE bytes per
		     * second the transfer is throttled..
		     */:
				bigsize = (int)param;
				if (bigsize < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMax_recv_speed(bigsize);
				break;
		case CURLOPT_FTP_SSL_CCC:
				arg = (int)param;
				if ((arg < CURLFTPSSL_CCC_NONE) || (arg >= CURLFTPSSL_CCC_LAST)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setFtp_ccc(()arg);
				break;
		case CURLOPT_COOKIELIST:
				argptr = (int)param;
				if (argptr == ((Object)0)) {
					break;
				} 
				if (ModernizedCProgram.Curl_strcasecompare(argptr, "ALL")) {
					ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, /* clear all cookies */CURL_LOCK_ACCESS_SINGLE);
					ModernizedCProgram.data.getCookies().Curl_cookie_clearall();
					ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE);
				}  else if (ModernizedCProgram.Curl_strcasecompare(argptr, "SESS")) {
					ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, /* clear session cookies */CURL_LOCK_ACCESS_SINGLE);
					ModernizedCProgram.data.getCookies().Curl_cookie_clearsess();
					ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE);
				}  else if (ModernizedCProgram.Curl_strcasecompare(argptr, "FLUSH")) {
					ModernizedCProgram.data.Curl_flush_cookies(/* flush cookies to file, takes care of the locking */0);
				}  else if (ModernizedCProgram.Curl_strcasecompare(argptr, "RELOAD")) {
					/* reload cookies from file */ModernizedCProgram.data.Curl_cookie_loadfiles();
					break;
				} else {
						if (!ModernizedCProgram.data.getCookies()) {
							ModernizedCProgram.data.setCookies(((Object)0).Curl_cookie_init(ModernizedCProgram.data, ((Object)0), /* if cookie engine was not running, activate it */1));
						} 
						argptr = /*Error: Function owner not recognized*/Curl_cstrdup(argptr);
						if (!argptr || !ModernizedCProgram.data.getCookies()) {
							result = CURLE_OUT_OF_MEMORY;
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(argptr);
						} else {
								ModernizedCProgram.data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
								if (ModernizedCProgram.curl_strnequal("Set-Cookie:", argptr, /*Error: Function owner not recognized*/strlen("Set-Cookie:"))) {
									cookie.Curl_cookie_add(ModernizedCProgram.data, ModernizedCProgram.data.getCookies(), 1, 0, argptr + 11, ((Object)/* HTTP Header format line */0), ((Object)0), 1);
								} else {
										cookie.Curl_cookie_add(ModernizedCProgram.data, ModernizedCProgram.data.getCookies(), 0, 0, argptr, ((Object)/* Netscape format line */0), ((Object)0), 1);
								} 
								ModernizedCProgram.data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(argptr);
						} 
				} 
				break;
		case CURLOPT_RANGE/*
		     * What range of the file you want to transfer
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_RANGE], (int)param);
				break;
		case CURLOPT_ERRORBUFFER/*
		     * Error buffer provided by the caller to get the human readable
		     * error string in.
		     */:
				ModernizedCProgram.data.getSet().setErrorbuffer((int)param);
				break;
		case CURLOPT_KEEP_SENDING_ON_ERROR:
				ModernizedCProgram.data.getSet().setHttp_keep_sending_on_error((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setHappy_eyeballs_timeout(arg);
				break;
		case CURLOPT_TCP_KEEPIDLE:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setTcp_keepidle(arg);
				break;
		case CURLOPT_ISSUERCERT/*
		     * Set Issuer certificate file
		     * to check certificates issuer
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_ISSUERCERT_ORIG], (int)param);
				break;
		case CURLOPT_PROXYTYPE/*
		     * Set proxy type. HTTP/HTTP_1_0/SOCKS4/SOCKS4a/SOCKS5/SOCKS5_HOSTNAME
		     */:
				arg = (int)param;
				if ((arg < CURLPROXY_HTTP) || (arg > CURLPROXY_SOCKS5_HOSTNAME)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setProxytype(()arg);
				break;
		case CURLOPT_FNMATCH_DATA:
				ModernizedCProgram.data.getSet().setFnmatch_data((int)param);
				break;
		case CURLOPT_ACCEPTTIMEOUT_MS/*
		     * The maximum time you allow curl to wait for server connect
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setAccepttimeout(arg);
				break;
		case CURLOPT_CONV_FROM_UTF8_FUNCTION/*
		     * "Convert from UTF-8 encoding" callback
		     */:
				ModernizedCProgram.data.getSet().setConvfromutf8((int)param);
				break;
		case CURLOPT_TRANSFERTEXT/*
		     * This option was previously named 'FTPASCII'. Renamed to work with
		     * more protocols than merely FTP.
		     *
		     * Transfer using ASCII (instead of BINARY).
		     */:
				ModernizedCProgram.data.getSet().setPrefer_ascii((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_HTTPGET/*
		     * Set to force us do HTTP GET
		     */:
				if ((int)param) {
					ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_GET);
					ModernizedCProgram.data.getSet().setUpload(/* switch off upload */0);
					ModernizedCProgram.data.getSet().setOpt_no_body(/* this is implied */0);
				} 
				break;
		case CURLOPT_PROXYAUTH/*
		     * Set HTTP Authentication type BITMASK.
		     */:
				{ 
					int bitcheck;
					bool authbits = new bool();
					long auth = (int)param;
					if (auth == CURLAUTH_NONE) {
						ModernizedCProgram.data.getSet().setProxyauth(auth);
						break;
					} 
					ModernizedCProgram.data.getState().getAuthproxy().setIestyle((bool)((auth & CURLAUTH_DIGEST_IE) ? 1 : 0));
					if (auth & CURLAUTH_DIGEST_IE) {
						auth |=  /* set standard digest bit */CURLAUTH_DIGEST;
						auth &=  ~/* unset ie digest bit */CURLAUTH_DIGEST_IE/* switch off bits we can't support */;
					} 
					auth &=  ~/* no NTLM support *//* no NTLM_WB support *//* no NTLM_WB support */CURLAUTH_NTLM_WB;
					auth &=  ~/* no Negotiate (SPNEGO) auth without
					                                    GSS-API or SSPI */CURLAUTH_NEGOTIATE;
					bitcheck = /* check if any auth bit lower than CURLAUTH_ONLY is still set */0;
					authbits = 0;
					while (bitcheck < 31) {
						if (auth & (-1024 << bitcheck++)) {
							authbits = 1;
							break;
						} 
					}
					if (!authbits) {
						return /* no supported types left! */CURLE_NOT_BUILT_IN;
					} 
					ModernizedCProgram.data.getSet().setProxyauth(auth);
				}
				break;
		case CURLOPT_POSTREDIR/*
		     * Set the behaviour of POST when redirecting
		     * CURL_REDIR_GET_ALL - POST is changed to GET after 301 and 302
		     * CURL_REDIR_POST_301 - POST is kept as POST after 301
		     * CURL_REDIR_POST_302 - POST is kept as POST after 302
		     * CURL_REDIR_POST_303 - POST is kept as POST after 303
		     * CURL_REDIR_POST_ALL - POST is kept as POST after 301, 302 and 303
		     * other - POST is kept as POST after 301 and 302
		     */:
				arg = (int)param;
				if (arg < CURL_REDIR_GET_ALL/* no return error on too high numbers since the bitmask could be
				         extended in a future */) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setKeep_post(arg & CURL_REDIR_POST_ALL);
				break;
		case CURLOPT_AUTOREFERER/*
		     * Switch on automatic referer that gets set if curl follows locations.
		     */:
				ModernizedCProgram.data.getSet().setHttp_auto_referer((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_PROXY_CRLFILE/*
		     * Set CRL file info for SSL connection for proxy. Specify file name of the
		     * CRL to check certificates revocation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_CRLFILE_PROXY], (int)param);
				break;
		case CURLOPT_NOBODY/*
		     * Do not include the body part in the output data stream.
		     */:
				ModernizedCProgram.data.getSet().setOpt_no_body((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_INFILESIZE_LARGE/*
		     * If known, this should inform curl about the file size of the
		     * to-be-uploaded file.
		     */:
				bigsize = (int)param;
				if (bigsize < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setFilesize(bigsize);
				break;
		case CURLOPT_HEADERFUNCTION/*
		     * Set header write callback
		     */:
				ModernizedCProgram.data.getSet().setFwrite_header((int)param);
				break;
		case CURLOPT_LOCALPORT/*
		     * Set what local port to bind the socket to when performing an operation.
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 65535)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setLocalport(ModernizedCProgram.curlx_sltous(arg));
				break;
		case CURLOPT_IOCTLDATA/*
		     * I/O control data pointer. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setIoctl_client((int)param);
				break;
		case CURLOPT_POSTFIELDSIZE_LARGE/*
		     * The size of the POSTFIELD data to prevent libcurl to do strlen() to
		     * figure it out. Enables binary posts.
		     */:
				bigsize = (int)param;
				if (bigsize < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				if (ModernizedCProgram.data.getSet().getPostfieldsize() < bigsize && ModernizedCProgram.data.getSet().getPostfields() == ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS]) {
					(Object)ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS], ((Object)/* Previous CURLOPT_COPYPOSTFIELDS is no longer valid. */0));
					ModernizedCProgram.data.getSet().setPostfields(((Object)0));
				} 
				ModernizedCProgram.data.getSet().setPostfieldsize(bigsize);
				break;
		case CURLOPT_INTERFACE/*
		     * Set what interface or address/hostname to bind the socket to when
		     * performing an operation and thus what from-IP your connection will use.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_DEVICE], (int)param);
				break;
		case CURLOPT_HEADEROPT/*
		     * Set header option.
		     */:
				arg = (int)param;
				ModernizedCProgram.data.getSet().setSep_headers((bool)((arg & CURLHEADER_SEPARATE) ? 1 : 0));
				break;
		case CURLOPT_PIPEWAIT:
				ModernizedCProgram.data.getSet().setPipewait((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_SSL_CTX_DATA/*
		     * Set a SSL_CTX callback parameter pointer
		     */:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_POSTQUOTE/*
		     * List of RAW FTP commands to use after a transfer
		     */:
				ModernizedCProgram.data.getSet().setPostquote((int)param);
				break;
		case CURLOPT_MAIL_RCPT:
				ModernizedCProgram.data.getSet().setMail_rcpt((int)/* Set the list of mail recipients */param);
				break;
		case CURLOPT_TELNETOPTIONS/*
		     * Set a linked list of telnet options
		     */:
				ModernizedCProgram.data.getSet().setTelnet_options((int)param);
				break;
		case CURLOPT_FTP_USE_PRET:
				ModernizedCProgram.data.getSet().setFtp_use_pret((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_PROXY_SSLVERSION/*
		     * Set explicit SSL version to try to connect with, as some SSL
		     * implementations are lame.
		     */:
				result = CURLE_UNKNOWN_OPTION;
				break;
		case CURLOPT_PROXYHEADER/*
		     * Set a list with proxy headers to use (or replace internals with)
		     *
		     * Since CURLOPT_HTTPHEADER was the only way to set HTTP headers for a
		     * long time we remain doing it this way until CURLOPT_PROXYHEADER is
		     * used. As soon as this option has been used, if set to anything but
		     * NULL, custom headers for proxies are only picked from this list.
		     *
		     * Set this option to NULL to restore the previous behavior.
		     */:
				ModernizedCProgram.data.getSet().setProxyheaders((int)param);
				break;
		case CURLOPT_PROXY_SSLKEY/*
		     * String that holds file name of the SSL key to use for proxy
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_PROXY], (int)param);
				break;
		case CURLOPT_UPKEEP_INTERVAL_MS:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setUpkeep_interval_ms(arg);
				break;
		case CURLOPT_HEADER/*
		     * Set to include the header in the general data output stream.
		     */:
				ModernizedCProgram.data.getSet().setInclude_header((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_REFERER/*
		     * String to set in the HTTP Referer: field.
		     */:
				if (ModernizedCProgram.data.getChange().getReferer_alloc()) {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getReferer()));
						(ModernizedCProgram.data.getChange().getReferer()) = ((Object)0);
					} while (0);
					ModernizedCProgram.data.getChange().setReferer_alloc(0);
				} 
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_REFERER], (int)param);
				ModernizedCProgram.data.getChange().setReferer(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_REFERER]);
				break;
		case CURLOPT_HTTP_CONTENT_DECODING/*
		     * raw data passed to the application when content encoding is used
		     */:
				ModernizedCProgram.data.getSet().setHttp_ce_skip((0 == (int)param) ? 1 : 0);
				break;
		case CURLOPT_FORBID_REUSE/*
		     * When this transfer is done, it must not be left to be reused by a
		     * subsequent transfer but shall be closed immediately.
		     */:
				ModernizedCProgram.data.getSet().setReuse_forbid((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_HTTPHEADER/*
		     * Set a list with HTTP headers to use (or replace internals with)
		     */:
				ModernizedCProgram.data.getSet().setHeaders((int)param);
				break;
		case CURLOPT_HTTPAUTH/*
		     * Set HTTP Authentication type BITMASK.
		     */:
				{ 
					int bitcheck;
					bool authbits = new bool();
					long auth = (int)param;
					if (auth == CURLAUTH_NONE) {
						ModernizedCProgram.data.getSet().setHttpauth(auth);
						break;
					} 
					ModernizedCProgram.data.getState().getAuthhost().setIestyle((bool)((auth & CURLAUTH_DIGEST_IE) ? 1 : 0));
					if (auth & CURLAUTH_DIGEST_IE) {
						auth |=  /* set standard digest bit */CURLAUTH_DIGEST;
						auth &=  ~/* unset ie digest bit */CURLAUTH_DIGEST_IE/* switch off bits we can't support */;
					} 
					auth &=  ~/* no NTLM support *//* no NTLM_WB support *//* no NTLM_WB support */CURLAUTH_NTLM_WB;
					auth &=  ~/* no Negotiate (SPNEGO) auth without
					                                    GSS-API or SSPI */CURLAUTH_NEGOTIATE;
					bitcheck = /* check if any auth bit lower than CURLAUTH_ONLY is still set */0;
					authbits = 0;
					while (bitcheck < 31) {
						if (auth & (-1024 << bitcheck++)) {
							authbits = 1;
							break;
						} 
					}
					if (!authbits) {
						return /* no supported types left! */CURLE_NOT_BUILT_IN;
					} 
					ModernizedCProgram.data.getSet().setHttpauth(auth);
				}
				break;
		case CURLOPT_FTP_USE_EPRT:
				ModernizedCProgram.data.getSet().setFtp_use_eprt((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_DNS_USE_GLOBAL_CACHE/* deprecated */:
				break;
		case CURLOPT_MIMEPOST/*
		     * Set to make us do MIME/form POST
		     */:
				result = ModernizedCProgram.Curl_mime_set_subparts(ModernizedCProgram.data.getSet().getMimepost(), (int)param, 0);
				if (!result) {
					ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_POST_MIME);
					ModernizedCProgram.data.getSet().setOpt_no_body(/* this is implied */0);
				} 
				break;
		case CURLOPT_MAXFILESIZE_LARGE/*
		     * Set the maximum size of a file to download.
		     */:
				bigsize = (int)param;
				if (bigsize < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMax_filesize(bigsize);
				break;
		case CURLOPT_TRAILERDATA:
				ModernizedCProgram.data.getSet().setTrailer_data((int)param);
				break;
		case CURLOPT_COOKIEJAR/*
		     * Set cookie file name to dump all cookies to when we're done.
		     */:
				{ 
					CookieInfo newcookies = new CookieInfo();
					result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COOKIEJAR], (int)param/*
					     * Activate the cookie parser. This may or may not already
					     * have been made.
					     */);
					newcookies = ModernizedCProgram.data.getCookies().Curl_cookie_init(ModernizedCProgram.data, ((Object)0), ModernizedCProgram.data.getSet().getCookiesession());
					if (!newcookies) {
						result = CURLE_OUT_OF_MEMORY;
					} 
					ModernizedCProgram.data.setCookies(newcookies);
				}
				break;
		case CURLOPT_TCP_KEEPALIVE:
				ModernizedCProgram.data.getSet().setTcp_keepalive((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_FTP_USE_EPSV:
				ModernizedCProgram.data.getSet().setFtp_use_epsv((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_DEBUGDATA/*
		     * Set to a void * that should receive all error writes. This
		     * defaults to CURLOPT_STDERR for normal operations.
		     */:
				ModernizedCProgram.data.getSet().setDebugdata((int)param);
				break;
		case CURLOPT_PRIVATE/*
		     * Set private data pointer.
		     */:
				ModernizedCProgram.data.getSet().setPrivate_data((int)param);
				break;
		case CURLOPT_SSLENGINE_DEFAULT/*
		     * flag to set engine as default.
		     */:
				ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_ENGINE], ((Object)0));
				result = /*Error: Function owner not recognized*/Curl_ssl_set_engine_default(ModernizedCProgram.data);
				break;
		case CURLOPT_CUSTOMREQUEST/*
		     * Set a custom string to use as request
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_CUSTOMREQUEST], (int)param/* we don't set
				       data->set.httpreq = HTTPREQ_CUSTOM;
				       here, we continue as if we were using the already set type
				       and this just changes the actual request keyword */);
				break;
		case CURLOPT_SSL_VERIFYSTATUS/*
		     * Enable certificate status verifying.
		     */:
				if (!/*Error: Function owner not recognized*/Curl_ssl_cert_status_request()) {
					result = CURLE_NOT_BUILT_IN;
					break;
				} 
				ModernizedCProgram.data.getSet().getSsl().getPrimary().setVerifystatus((0 != (int)param) ? 1 : 0);
				if (ModernizedCProgram.data.getConn()) {
					ModernizedCProgram.data.getConn().getSsl_config().setVerifystatus(ModernizedCProgram.data.getSet().getSsl().getPrimary().getVerifystatus());
				} 
				break;
		case CURLOPT_RTSP_SERVER_CSEQ:
				ModernizedCProgram.data.getState().setRtsp_next_server_CSeq((int)/* Same as the above, but for server-initiated requests */param);
				break;
		case CURLOPT_DISALLOW_USERNAME_IN_URL:
				ModernizedCProgram.data.getSet().setDisallow_username_in_url((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_KEYPASSWD/*
		     * String that holds the SSL or SSH private key password.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_PASSWD_ORIG], (int)param);
				break;
		case CURLOPT_PINNEDPUBLICKEY/*
		     * Set pinned public key for SSL connection.
		     * Specify file name of the public key in DER format.
		     */:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_OPENSOCKETDATA/*
		     * socket callback data pointer. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setOpensocket_client((int)param);
				break;
		case CURLOPT_USERNAME/*
		     * authentication user name to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_USERNAME], (int)param);
				break;
		case CURLOPT_WRITEFUNCTION/*
		     * Set data write callback
		     */:
				ModernizedCProgram.data.getSet().setFwrite_func((int)param);
				if (!ModernizedCProgram.data.getSet().getFwrite_func()) {
					ModernizedCProgram.data.getSet().setIs_fwrite_set(0);
					ModernizedCProgram.data.getSet().setFwrite_func(()/* When set to NULL, reset to our internal default function */ModernizedCProgram.fwrite);
				} else {
						ModernizedCProgram.data.getSet().setIs_fwrite_set(1);
				} 
				break;
		case CURLOPT_FTP_CREATE_MISSING_DIRS/*
		     * An FTP/SFTP option that modifies an upload to create missing
		     * directories on the server.
		     */:
				switch ((int)param) {
				case 2:
						ModernizedCProgram.data.getSet().setFtp_create_missing_dirs(2);
						break;
				case 1:
						ModernizedCProgram.data.getSet().setFtp_create_missing_dirs(1);
						break;
				case 0:
						ModernizedCProgram.data.getSet().setFtp_create_missing_dirs(0);
						break;
				default:
						result = /* reserve other values for future use */CURLE_UNKNOWN_OPTION;
						break;
				}
				break;
		case CURLOPT_PROXYPORT/*
		     * Explicitly set HTTP proxy port number.
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 65535)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setProxyport(arg);
				break;
		case CURLOPT_DNS_CACHE_TIMEOUT:
				arg = (int)param;
				if (arg < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setDns_cache_timeout(arg);
				break;
		case CURLOPT_RANDOM_FILE/*
		     * This is the path name to a file that contains random data to seed
		     * the random SSL stuff with. The file is only used for reading.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_RANDOM_FILE], (int)param);
				break;
		case CURLOPT_HAPROXYPROTOCOL/*
		     * Set to send the HAProxy Proxy Protocol header
		     */:
				ModernizedCProgram.data.getSet().setHaproxyprotocol((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_DOH_URL:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_DOH], (int)param);
				ModernizedCProgram.data.getSet().setDoh(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_DOH] ? 1 : 0);
				break;
		case CURLOPT_PROXY_KEYPASSWD/*
		     * String that holds the SSL private key password for proxy.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KEY_PASSWD_PROXY], (int)param);
				break;
		case CURLOPT_CONNECTTIMEOUT/*
		     * The maximum time you allow curl to use to connect.
		     */:
				arg = (int)param;
				if ((arg >= 0) && (arg <= (2147483647 / 1000))) {
					ModernizedCProgram.data.getSet().setConnecttimeout(arg * 1000);
				} else {
						return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				break;
		case CURLOPT_LOW_SPEED_TIME/*
		     * The low speed time that if transfers are below the set
		     * CURLOPT_LOW_SPEED_LIMIT during this time, the transfer is aborted.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setLow_speed_time(arg);
				break;
		case CURLOPT_WILDCARDMATCH:
				ModernizedCProgram.data.getSet().setWildcard_enabled((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_HTTP200ALIASES/*
		     * Set a list of aliases for HTTP 200 in response header
		     */:
				ModernizedCProgram.data.getSet().setHttp200aliases((int)param);
				break;
		case CURLOPT_RESOLVE/*
		     * List of NAME:[address] names to populate the DNS cache with
		     * Prefix the NAME with dash (-) to _remove_ the name from the cache.
		     *
		     * Names added with this API will remain in the cache until explicitly
		     * removed or the handle is cleaned up.
		     *
		     * This API can remove any name from the DNS cache, but only entries
		     * that aren't actually in use right now will be pruned immediately.
		     */:
				ModernizedCProgram.data.getSet().setResolve((int)param);
				ModernizedCProgram.data.getChange().setResolve(ModernizedCProgram.data.getSet().getResolve());
				break;
		case CURLOPT_TCP_NODELAY/*
		     * Enable or disable TCP_NODELAY, which will disable/enable the Nagle
		     * algorithm
		     */:
				ModernizedCProgram.data.getSet().setTcp_nodelay((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_SSL_FALSESTART/*
		     * Enable TLS false start.
		     */:
				if (!/*Error: Function owner not recognized*/Curl_ssl_false_start()) {
					result = CURLE_NOT_BUILT_IN;
					break;
				} 
				ModernizedCProgram.data.getSet().getSsl().setFalsestart((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_REQUEST_TARGET:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_TARGET], (int)param);
				break;
		case CURLOPT_POSTFIELDS/*
		     * Like above, but use static data instead of copying it.
		     */:
				ModernizedCProgram.data.getSet().setPostfields((int)param);
				(Object)ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS], ((Object)/* Release old copied data. */0));
				ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_POST);
				break;
		case CURLOPT_URL/*
		     * The URL to fetch.
		     */:
				if (ModernizedCProgram.data.getChange().getUrl_alloc()) {
					do {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((ModernizedCProgram.data.getChange().getUrl()));
						(ModernizedCProgram.data.getChange().getUrl()) = ((Object)0);
					} while (/* the already set URL is allocated, free it first! */0);
					ModernizedCProgram.data.getChange().setUrl_alloc(0);
				} 
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_URL], (int)param);
				ModernizedCProgram.data.getChange().setUrl(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SET_URL]);
				break;
		case CURLOPT_TFTP_BLKSIZE/*
		     * TFTP option that specifies the block size to use for data transmission.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setTftp_blksize(arg);
				break;
		case CURLOPT_RESUME_FROM/*
		     * Resume transfer at the given file position
		     */:
				arg = (int)param;
				if (arg < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setSet_resume_from(arg);
				break;
		case CURLOPT_CONNECT_TO:
				ModernizedCProgram.data.getSet().setConnect_to((int)param);
				break;
		case CURLOPT_PROGRESSDATA/*
		     * Custom client data to pass to the progress callback
		     */:
				ModernizedCProgram.data.getSet().setProgress_client((int)param);
				break;
		case CURLOPT_SOCKOPTDATA/*
		     * socket callback data pointer. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setSockopt_client((int)param);
				break;
		case CURLOPT_PORT/*
		     * The port number to use when getting the URL
		     */:
				arg = (int)param;
				if ((arg < 0) || (arg > 65535)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setUse_port(arg);
				break;
		case CURLOPT_CLOSESOCKETDATA/*
		     * socket callback data pointer. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setClosesocket_client((int)param);
				break;
		case CURLOPT_CONV_FROM_NETWORK_FUNCTION/*
		     * "Convert from network encoding" callback
		     */:
				ModernizedCProgram.data.getSet().setConvfromnetwork((int)param);
				break;
		case CURLOPT_CAINFO/*
		     * Set CA info for SSL connection. Specify file name of the CA certificate
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_CAFILE_ORIG], (int)param);
				break;
		case CURLOPT_MAXAGE_CONN:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMaxage_conn(arg);
				break;
		case CURLOPT_PROXY_SSL_CIPHER_LIST:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[/* set a list of cipher we want to use in the SSL connection for proxy */dupstring.STRING_SSL_CIPHER_LIST_PROXY], (int)param);
				break;
		case CURLOPT_CAPATH/*
		     * Set CA path info for SSL connection. Specify directory name of the CA
		     * certificates which have been prepared using openssl c_rehash utility.
		     */:
				result = /* This does not work on windows. */CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_POSTFIELDSIZE/*
		     * The size of the POSTFIELD data to prevent libcurl to do strlen() to
		     * figure it out. Enables binary posts.
		     */:
				bigsize = (int)param;
				if (bigsize < -1) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				if (ModernizedCProgram.data.getSet().getPostfieldsize() < bigsize && ModernizedCProgram.data.getSet().getPostfields() == ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS]) {
					(Object)ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_COPYPOSTFIELDS], ((Object)/* Previous CURLOPT_COPYPOSTFIELDS is no longer valid. */0));
					ModernizedCProgram.data.getSet().setPostfields(((Object)0));
				} 
				ModernizedCProgram.data.getSet().setPostfieldsize(bigsize);
				break;
		case CURLOPT_SSL_VERIFYPEER/*
		     * Enable peer SSL verifying.
		     */:
				ModernizedCProgram.data.getSet().getSsl().getPrimary().setVerifypeer((0 != (int)param) ? 1 : 0);
				if (ModernizedCProgram.data.getConn()) {
					ModernizedCProgram.data.getConn().getSsl_config().setVerifypeer(ModernizedCProgram.data.getSet().getSsl().getPrimary().getVerifypeer());
				} 
				break;
		case /* USE_SSH */CURLOPT_HTTP_TRANSFER_DECODING/*
		     * disable libcurl transfer encoding is used
		     */:
				ModernizedCProgram.data.getSet().setHttp_te_skip((0 == (int)param) ? 1 : 0);
				break;
		case CURLOPT_SSLCERTTYPE/*
		     * String that holds file type of the SSL certificate to use
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_CERT_TYPE_ORIG], (int)param);
				break;
		case CURLOPT_INTERLEAVEFUNCTION:
				ModernizedCProgram.data.getSet().setFwrite_rtp((int)/* Set the user defined RTP write function */param);
				break;
		case CURLOPT_KRBLEVEL/*
		     * A string that defines the kerberos security level.
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KRB_LEVEL], (int)param);
				ModernizedCProgram.data.getSet().setKrb((ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_KRB_LEVEL]) ? 1 : 0);
				break;
		case CURLOPT_STREAM_DEPENDS:
		case CURLOPT_TIMEVALUE/*
		     * This is the value to compare with the remote document with the
		     * method set with CURLOPT_TIMECONDITION
		     */:
				ModernizedCProgram.data.getSet().setTimevalue((time_t)(int)param);
				break;
		case CURLOPT_CRLF/*
		     * Kludgy option to enable CRLF conversions. Subject for removal.
		     */:
				ModernizedCProgram.data.getSet().setCrlf((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_RTSP_TRANSPORT/*
		     * The content of the Transport: header for the RTSP request
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_RTSP_TRANSPORT], (int)param);
				break;
		case CURLOPT_SSLENGINE/*
		     * String that holds the SSL crypto engine.
		     */:
				argptr = (int)param;
				if (argptr && argptr[0]) {
					result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_ENGINE], argptr);
					if (!result) {
						result = /*Error: Function owner not recognized*/Curl_ssl_set_engine(ModernizedCProgram.data, argptr);
					} 
				} 
				break;
		case CURLOPT_CHUNK_BGN_FUNCTION:
				ModernizedCProgram.data.getSet().setChunk_bgn((int)param);
				break;
		case CURLOPT_CHUNK_END_FUNCTION:
				ModernizedCProgram.data.getSet().setChunk_end((int)param);
				break;
		case CURLOPT_TIMEVALUE_LARGE/*
		     * This is the value to compare with the remote document with the
		     * method set with CURLOPT_TIMECONDITION
		     */:
				ModernizedCProgram.data.getSet().setTimevalue((time_t)(int)param);
				break;
		case CURLOPT_UPLOAD:
		case CURLOPT_HTTP09_ALLOWED:
				arg = (int)param;
				if (arg > -1024) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setHttp09_allowed(arg ? 1 : 0);
				break;
		case CURLOPT_HTTPPOST/*
		     * Set to make us do HTTP POST
		     */:
				ModernizedCProgram.data.getSet().setHttppost((int)param);
				ModernizedCProgram.data.getSet().setHttpreq(.HTTPREQ_POST_FORM);
				ModernizedCProgram.data.getSet().setOpt_no_body(/* this is implied */0);
				break;
		case CURLOPT_REDIR_PROTOCOLS/* set the bitmask for the protocols that libcurl is allowed to follow to,
		       as a subset of the CURLOPT_PROTOCOLS ones. That means the protocol needs
		       to be set in both bitmasks to be allowed to get redirected to. */:
				ModernizedCProgram.data.getSet().setRedir_protocols((int)param);
				break;
		case CURLOPT_PROXY_CAPATH/*
		     * Set CA path info for SSL connection proxy. Specify directory name of the
		     * CA certificates which have been prepared using openssl c_rehash utility.
		     */:
				result = /* This does not work on windows. */CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_WRITEDATA/*
		     * FILE pointer to write to. Or possibly
		     * used as argument to the write callback.
		     */:
				ModernizedCProgram.data.getSet().setOut((int)param);
				break;
		case CURLOPT_RTSP_CLIENT_CSEQ/*
		     * Set the CSEQ number to issue for the next RTSP request. Useful if the
		     * application is resuming a previously broken connection. The CSEQ
		     * will increment from this new number henceforth.
		     */:
				ModernizedCProgram.data.getState().setRtsp_next_client_CSeq((int)param);
				break;
		case CURLOPT_DNS_SHUFFLE_ADDRESSES:
				ModernizedCProgram.data.getSet().setDns_shuffle_addresses((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_FOLLOWLOCATION/*
		     * Follow Location: header hints on a HTTP-server.
		     */:
				ModernizedCProgram.data.getSet().setHttp_follow_location((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_FNMATCH_FUNCTION:
				ModernizedCProgram.data.getSet().setFnmatch((int)param);
				break;
		case CURLOPT_MAXFILESIZE/*
		     * Set the maximum size of a file to download.
		     */:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setMax_filesize(arg);
				break;
		case CURLOPT_TIMEOUT_MS:
				arg = (int)param;
				if (arg < 0) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setTimeout(arg);
				break;
		case CURLOPT_IOCTLFUNCTION/*
		     * I/O control callback. Might be NULL.
		     */:
				ModernizedCProgram.data.getSet().setIoctl_func((int)param);
				break;
		case CURLOPT_SASL_IR:
				ModernizedCProgram.data.getSet().setSasl_ir((0 != (int)param) ? 1 : /* Enable/disable SASL initial response */0);
				break;
		case CURLOPT_FTP_FILEMETHOD/*
		     * How do access files over FTP.
		     */:
				arg = (int)param;
				if ((arg < CURLFTPMETHOD_DEFAULT) || (arg >= CURLFTPMETHOD_LAST)) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setFtp_filemethod((curl_ftpfile)arg);
				break;
		case CURLOPT_LOGIN_OPTIONS/*
		     * authentication options to use in the operation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_OPTIONS], (int)param);
				break;
		case CURLOPT_SERVER_RESPONSE_TIMEOUT/*
		     * Option that specifies how quickly an server response must be obtained
		     * before it is considered failure. For pingpong protocols.
		     */:
				arg = (int)param;
				if ((arg >= 0) && (arg <= (2147483647 / 1000))) {
					ModernizedCProgram.data.getSet().setServer_response_timeout(arg * 1000);
				} else {
						return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				break;
		case CURLOPT_GSSAPI_DELEGATION/*
		     * GSS-API credential delegation bitmask
		     */:
				arg = (int)param;
				if (arg < CURLGSSAPI_DELEGATION_NONE) {
					return CURLE_BAD_FUNCTION_ARGUMENT;
				} 
				ModernizedCProgram.data.getSet().setGssapi_delegation(arg);
				break;
		case CURLOPT_FTPPORT/*
		     * Use FTP PORT, this also specifies which IP address to use
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_FTPPORT], (int)param);
				ModernizedCProgram.data.getSet().setFtp_use_port((ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_FTPPORT]) ? 1 : 0);
				break;
		case CURLOPT_PATH_AS_IS:
				ModernizedCProgram.data.getSet().setPath_as_is((0 != (int)param) ? 1 : 0);
				break;
		case CURLOPT_BUFFERSIZE/*
		     * The application kindly asks for a differently sized receive buffer.
		     * If it seems reasonable, we'll use it.
		     */:
				arg = (int)param;
				if (arg > CURL_MAX_READ_SIZE) {
					arg = CURL_MAX_READ_SIZE;
				}  else if (arg < 1) {
					arg = CURL_MAX_WRITE_SIZE;
				}  else if (arg < 1024) {
					arg = 1024;
				} 
				if (arg != ModernizedCProgram.data.getSet().getBuffer_size()) {
					byte newbuff = /*Error: Function owner not recognized*/Curl_crealloc(ModernizedCProgram.data.getState().getBuffer(), arg + 1);
					if (!newbuff) {
						do {
						} while (0);
						result = CURLE_OUT_OF_MEMORY;
					} else {
							ModernizedCProgram.data.getState().setBuffer(newbuff);
					} 
				} 
				ModernizedCProgram.data.getSet().setBuffer_size(arg);
				break;
		case CURLOPT_PROXY_SERVICE_NAME/*
		     * Set proxy authentication service name for Kerberos 5 and SPNEGO
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_PROXY_SERVICE_NAME], (int)param);
				break;
		case CURLOPT_PROXY_PINNEDPUBLICKEY/*
		     * Set pinned public key for SSL connection.
		     * Specify file name of the public key in DER format.
		     */:
				result = CURLE_NOT_BUILT_IN;
				break;
		case CURLOPT_PROXY_SSLCERTTYPE/*
		     * String that holds file type of the SSL certificate to use for proxy
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_CERT_TYPE_PROXY], (int)param);
				break;
		case CURLOPT_PROXY_CAINFO/*
		     * Set CA info SSL connection for proxy. Specify file name of the
		     * CA certificate
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_CAFILE_PROXY], (int)param);
				break;
		case CURLOPT_CRLFILE/*
		     * Set CRL file info for SSL connection. Specify file name of the CRL
		     * to check certificates revocation
		     */:
				result = ModernizedCProgram.Curl_setstropt(ModernizedCProgram.data.getSet().getStr()[dupstring.STRING_SSL_CRLFILE_ORIG], (int)param);
				break;
		default:
				result = /* unknown tag and its companion, just ignore: */CURLE_UNKNOWN_OPTION;
				break;
		}
		return result/*
		 * curl_easy_setopt() is the external interface for setting options on an
		 * easy handle.
		 *
		 * NOTE: This is one of few API functions that are allowed to be called from
		 * within a callback.
		 */;
	}
	public Object curl_easy_setopt(Object tag) {
		va_list arg = new va_list();
		 result = new ();
		if (!ModernizedCProgram.data) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(arg, tag);
		result = ModernizedCProgram.data.Curl_vsetopt(tag, arg);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(arg);
		return result;
	}
	public Curl_easy getNext() {
		return next;
	}
	public void setNext(Curl_easy newNext) {
		next = newNext;
	}
	public Curl_easy getPrev() {
		return prev;
	}
	public void setPrev(Curl_easy newPrev) {
		prev = newPrev;
	}
	public connectdata getConn() {
		return conn;
	}
	public void setConn(connectdata newConn) {
		conn = newConn;
	}
	public curl_llist_element getConnect_queue() {
		return connect_queue;
	}
	public void setConnect_queue(curl_llist_element newConnect_queue) {
		connect_queue = newConnect_queue;
	}
	public curl_llist_element getConn_queue() {
		return conn_queue;
	}
	public void setConn_queue(curl_llist_element newConn_queue) {
		conn_queue = newConn_queue;
	}
	public  getMstate() {
		return mstate;
	}
	public void setMstate( newMstate) {
		mstate = newMstate;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object newResult) {
		result = newResult;
	}
	public Curl_message getMsg() {
		return msg;
	}
	public void setMsg(Curl_message newMsg) {
		msg = newMsg;
	}
	public Object getSockets() {
		return sockets;
	}
	public void setSockets(Object newSockets) {
		sockets = newSockets;
	}
	public Object getActions() {
		return actions;
	}
	public void setActions(Object newActions) {
		actions = newActions;
	}
	public int getNumsocks() {
		return numsocks;
	}
	public void setNumsocks(int newNumsocks) {
		numsocks = newNumsocks;
	}
	public Names getDns() {
		return dns;
	}
	public void setDns(Names newDns) {
		dns = newDns;
	}
	public Curl_multi getMulti() {
		return multi;
	}
	public void setMulti(Curl_multi newMulti) {
		multi = newMulti;
	}
	public Curl_multi getMulti_easy() {
		return multi_easy;
	}
	public void setMulti_easy(Curl_multi newMulti_easy) {
		multi_easy = newMulti_easy;
	}
	public Curl_share getShare() {
		return share;
	}
	public void setShare(Curl_share newShare) {
		share = newShare;
	}
	public SingleRequest getReq() {
		return req;
	}
	public void setReq(SingleRequest newReq) {
		req = newReq;
	}
	public UserDefined getSet() {
		return set;
	}
	public void setSet(UserDefined newSet) {
		set = newSet;
	}
	public DynamicStatic getChange() {
		return change;
	}
	public void setChange(DynamicStatic newChange) {
		change = newChange;
	}
	public CookieInfo[] getCookies() {
		return cookies;
	}
	public void setCookies(CookieInfo[] newCookies) {
		cookies = newCookies;
	}
	public Progress getProgress() {
		return progress;
	}
	public void setProgress(Progress newProgress) {
		progress = newProgress;
	}
	public UrlState getState() {
		return state;
	}
	public void setState(UrlState newState) {
		state = newState;
	}
	public WildcardData getWildcard() {
		return wildcard;
	}
	public void setWildcard(WildcardData newWildcard) {
		wildcard = newWildcard;
	}
	public PureInfo getInfo() {
		return info;
	}
	public void setInfo(PureInfo newInfo) {
		info = newInfo;
	}
	public curl_tlssessioninfo getTsi() {
		return tsi;
	}
	public void setTsi(curl_tlssessioninfo newTsi) {
		tsi = newTsi;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
}
/*
 * This struct is for holding data that was attempted to get sent to the user's
 * callback but is held due to pausing. One instance per type (BOTH, HEADER,
 * BODY).
 */
/* first, two fields for the linked list of these */
