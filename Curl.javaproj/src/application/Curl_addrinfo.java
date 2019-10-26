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
	private Byte ai_canonname;
	private sockaddr ai_addr;
	private Curl_addrinfo ai_next;
	
	public Curl_addrinfo(int ai_flags, int ai_family, int ai_socktype, int ai_protocol, Object ai_addrlen, Byte ai_canonname, sockaddr ai_addr, Curl_addrinfo ai_next) {
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
	
	public Curl_addrinfo fake_ai() {
		Curl_addrinfo ai = new Curl_addrinfo();
		ai = .calloc(1, );
		if (!ai) {
			return ((Object)0);
		} 
		ai.setAi_canonname(.strdup("dummy"));
		Byte generatedAi_canonname = ai.getAi_canonname();
		if (!generatedAi_canonname) {
			.free(ai);
			return ((Object)0);
		} 
		ai.setAi_addr(.calloc(1, ));
		sockaddr generatedAi_addr = ai.getAi_addr();
		if (!generatedAi_addr) {
			.free(generatedAi_canonname);
			.free(ai);
			return ((Object)0);
		} 
		ai.setAi_family(2);
		ai.setAi_addrlen();
		return ai;
	}
	public Curl_addrinfo Curl_getaddrinfo(connectdata conn, Object hostname, int port, Integer waitp) {
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		return curl_addrinfo.Curl_resolver_getaddrinfo(conn, hostname, port, waitp/* CURLRES_ASYNCH */);
	}
	/* synchronous response only */
	/* CURLRES_SYNCH */
	/* CURLRES_IPV4 */
	/*
	 * Curl_ipv4_resolve_r() - ipv4 threadsafe resolver function.
	 *
	 * This is used for both synchronous and asynchronous resolver builds,
	 * implying that only threadsafe code and function calls may be used.
	 *
	 */
	public Curl_addrinfo Curl_ipv4_resolve_r(Object hostname, int port) {
		Curl_addrinfo ai = ((Object)0);
		hostent h = ((Object)0);
		in_addr in = new in_addr();
		hostent buf = ((Object)0);
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		if (ModernizedCProgram.Curl_inet_pton(2, hostname, in) > 0) {
			return curl_addrinfo.Curl_ip2addr(2, in, hostname, /* This is a dotted IP address 123.123.123.123-style */port);
		} else {
				h = .gethostbyname((Object)/* set return code to NULL *//* HAVE_GETADDRINFO_THREADSAFE || HAVE_GETHOSTBYNAME_R *//*
				     * Here is code for platforms that don't have a thread safe
				     * getaddrinfo() nor gethostbyname_r() function or for which
				     * gethostbyname() is the preferred one.
				     */hostname/* HAVE_GETADDRINFO_THREADSAFE || HAVE_GETHOSTBYNAME_R */);
		} 
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		/* failure *//* AIX, Digital Unix/Tru64, HPUX 10, more? *//* For AIX 4.3 or later, we don't use gethostbyname_r() at all, because of
		     * the plain fact that it does not return unique full buffers on each
		     * call, but instead several of the pointers in the hostent structs will
		     * point to the same actual data! This have the unfortunate down-side that
		     * our caching system breaks down horribly. Luckily for us though, AIX 4.3
		     * and more recent versions have a "completely thread-safe"[*] libc where
		     * all the data is stored in thread-specific memory areas making calls to
		     * the plain old gethostbyname() work fine even for multi-threaded
		     * programs.
		     *
		     * This AIX 4.3 or later detection is all made in the configure script.
		     *
		     * Troels Walsted Hansen helped us work this out on March 3rd, 2003.
		     *
		     * [*] = much later we've found out that it isn't at all "completely
		     * thread-safe", but at least the gethostbyname() function is.
		     *//* August 22nd, 2000: Albert Chin-A-Young brought an updated version
		       * that should work! September 20: Richard Prescott worked on the buffer
		       * size dilemma.
		       *//* we don't deal with this, but set it anyway *//* failure, too smallish buffer size *//* success *//* result expected in h *//* This is the worst kind of the different gethostbyname_r() interfaces.
		       * Since we don't know how big buffer this particular lookup required,
		       * we can't realloc down the huge alloc without doing closer analysis of
		       * the returned data. Thus, we always use CURL_HOSTENT_SIZE for every
		       * name lookup. Fixing this would require an extra malloc() and then
		       * calling Curl_addrinfo_copy() that subsequent realloc()s down the new
		       * memory area to the actually used amount.
		       *//* HAVE_...BYNAME_R_5 || HAVE_...BYNAME_R_6 || HAVE_...BYNAME_R_3 */if (h) {
			ai = curl_addrinfo.Curl_he2ai(h, port);
			if (/* used a *_r() function */buf) {
				.Curl_cfree(buf);
			} 
		} 
		return ai/* defined(CURLRES_IPV4) && !defined(CURLRES_ARES) */;
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
	/*
	 * Curl_freeaddrinfo()
	 *
	 * This is used to free a linked list of Curl_addrinfo structs along
	 * with all its associated allocated storage. This function should be
	 * called once for each successful call to Curl_getaddrinfo_ex() or to
	 * any function call which actually allocates a Curl_addrinfo struct.
	 */
	/* workaround icc 9.1 optimizer issue */
	public void Curl_freeaddrinfo() {
		Curl_addrinfo canext = new Curl_addrinfo();
		Curl_addrinfo ca = new Curl_addrinfo();
		sockaddr generatedAi_addr = ca.getAi_addr();
		Byte generatedAi_canonname = ca.getAi_canonname();
		Curl_addrinfo generatedAi_next = ca.getAi_next();
		for (ca = cahead; ca != ((Object)0); ca = canext) {
			.Curl_cfree(generatedAi_addr);
			.Curl_cfree(generatedAi_canonname);
			canext = generatedAi_next;
			.Curl_cfree(ca/*
			 * Curl_getaddrinfo_ex()
			 *
			 * This is a wrapper function around system's getaddrinfo(), with
			 * the only difference that instead of returning a linked list of
			 * addrinfo structs this one returns a linked list of Curl_addrinfo
			 * ones. The memory allocated by this function *MUST* be free'd with
			 * Curl_freeaddrinfo().  For each successful call to this function
			 * there must be an associated call later to Curl_freeaddrinfo().
			 *
			 * There should be no single call to system's getaddrinfo() in the
			 * whole library, any such call should be 'routed' through this one.
			 */);
		}
	}
	/* assume failure */
	/* traverse the addrinfo list */
	/* ignore elements with unsupported address family, */
	/* settle family-specific sockaddr structure size.  */
	/* ignore elements without required address info */
	/* ignore elements with bogus address size */
	/* copy each structure member individually, member ordering, */
	/* size, or padding might be different for each platform.    */
	/* if the return list is empty, this becomes the first element */
	/* add this element last in the return list */
	/* destroy the addrinfo list */
	/* if we failed, also destroy the Curl_addrinfo list */
	/* rfc3493 conformant */
	/* rfc3493 obsoleted */
	/* This is not a CURLcode */
	/* HAVE_GETADDRINFO */
	/*
	 * Curl_he2ai()
	 *
	 * This function returns a pointer to the first element of a newly allocated
	 * Curl_addrinfo struct linked list filled with the data of a given hostent.
	 * Curl_addrinfo is meant to work like the addrinfo struct does for a IPv6
	 * stack, but usable also for IPv4, all hosts and environments.
	 *
	 * The memory allocated by this function *MUST* be free'd later on calling
	 * Curl_freeaddrinfo().  For each successful call to this function there
	 * must be an associated call later to Curl_freeaddrinfo().
	 *
	 *   Curl_addrinfo defined in "lib/curl_addrinfo.h"
	 *
	 *     struct Curl_addrinfo {
	 *       int                   ai_flags;
	 *       int                   ai_family;
	 *       int                   ai_socktype;
	 *       int                   ai_protocol;
	 *       curl_socklen_t        ai_addrlen;   * Follow rfc3493 struct addrinfo *
	 *       char                 *ai_canonname;
	 *       struct sockaddr      *ai_addr;
	 *       struct Curl_addrinfo *ai_next;
	 *     };
	 *     typedef struct Curl_addrinfo Curl_addrinfo;
	 *
	 *   hostent defined in <netdb.h>
	 *
	 *     struct hostent {
	 *       char    *h_name;
	 *       char    **h_aliases;
	 *       int     h_addrtype;
	 *       int     h_length;
	 *       char    **h_addr_list;
	 *     };
	 *
	 *   for backward compatibility:
	 *
	 *     #define h_addr  h_addr_list[0]
	 */
	public Curl_addrinfo Curl_he2ai(Object he, int port) {
		Curl_addrinfo ai = new Curl_addrinfo();
		Curl_addrinfo prevai = ((Object)0);
		Curl_addrinfo firstai = ((Object)0);
		sockaddr_in addr = new sockaddr_in();
		 result = CURLE_OK;
		int i;
		byte curr;
		if (!he) {
			return ((Object)/* no input == no output! */0);
		} 
		do {
		} while (0);
		Byte generatedAi_canonname = ai.getAi_canonname();
		sockaddr generatedAi_addr = ai.getAi_addr();
		Object generatedSin_addr = addr.getSin_addr();
		int generatedAi_family = ai.getAi_family();
		for (i = 0; (curr = he.getH_addr_list()[i]) != ((Object)0); i++) {
			size_t ss_size = new size_t();
			ss_size = ;
			ai = .Curl_ccalloc(1, );
			if (!ai) {
				result = CURLE_OUT_OF_MEMORY;
				break;
			} 
			ai.setAi_canonname(.Curl_cstrdup(he.getH_name()));
			if (!generatedAi_canonname) {
				result = CURLE_OUT_OF_MEMORY;
				.Curl_cfree(ai);
				break;
			} 
			ai.setAi_addr(.Curl_ccalloc(1, ss_size));
			if (!generatedAi_addr) {
				result = CURLE_OUT_OF_MEMORY;
				.Curl_cfree(generatedAi_canonname);
				.Curl_cfree(ai);
				break;
			} 
			if (!firstai) {
				firstai = /* store the pointer we want to return from this function */ai;
			} 
			if (prevai) {
				prevai.setAi_next(/* make the previous entry point to this */ai);
			} 
			ai.setAi_family(he.getH_addrtype());
			ai.setAi_socktype(/* we return all names as STREAM, so when using this address for TFTP
			       the type must be ignored and conn->socktype be used instead! */1);
			ai.setAi_addrlen(()ss_size);
			switch (generatedAi_family) {
			case 2:
					addr = (Object)generatedAi_addr;
					.memcpy(generatedSin_addr, curr, );
					addr.setSin_family((int)(he.getH_addrtype()));
					addr.setSin_port(.htons((int)port));
					break;
			}
			prevai = ai;
		}
		if (result) {
			firstai.Curl_freeaddrinfo();
			firstai = ((Object)0);
		} 
		return firstai;
	}
	public Curl_addrinfo Curl_ip2addr(int af, Object inaddr, Object hostname, int port) {
		Curl_addrinfo ai = new Curl_addrinfo();
		hostent h = new hostent();
		namebuff buf = new namebuff();
		byte addrentry;
		byte hoststr;
		size_t addrsize = new size_t();
		do {
		} while (0);
		buf = .Curl_cmalloc();
		if (!buf) {
			return ((Object)0);
		} 
		hoststr = .Curl_cstrdup(hostname);
		if (!hoststr) {
			.Curl_cfree(buf);
			return ((Object)0);
		} 
		 generatedAddrentry = buf.getAddrentry();
		Object generatedIna4 = generatedAddrentry.getIna4();
		switch (af) {
		case 2:
				addrsize = ;
				addrentry = (Object)generatedIna4;
				.memcpy(addrentry, inaddr, );
				break;
		default:
				.Curl_cfree(hoststr);
				.Curl_cfree(buf);
				return ((Object)0);
		}
		hostent generatedHostentry = buf.getHostentry();
		h = generatedHostentry;
		h.setH_name(hoststr);
		h.setH_aliases(((Object)0));
		h.setH_addrtype((int)af);
		h.setH_length((int)addrsize);
		Object generatedH_addr_list = buf.getH_addr_list();
		h.setH_addr_list(generatedH_addr_list[0]);
		generatedH_addr_list[0] = addrentry;
		generatedH_addr_list[1] = ((Object)/* terminate list of entries */0);
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		ai = curl_addrinfo.Curl_he2ai(h, port);
		.Curl_cfree(hoststr);
		.Curl_cfree(buf);
		return ai/*
		 * Given an IPv4 or IPv6 dotted string address, this converts it to a proper
		 * allocated Curl_addrinfo struct and returns it.
		 */;
	}
	public Curl_addrinfo Curl_str2addr(Byte address, int port) {
		in_addr in = new in_addr();
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		if (ModernizedCProgram.Curl_inet_pton(2, address, in) > 0) {
			return curl_addrinfo.Curl_ip2addr(2, in, address, /* This is a dotted IP address 123.123.123.123-style */port);
		} 
		return ((Object)/* This is a dotted IPv6 address ::1-style *//* bad input format */0/**
		 * Given a path to a Unix domain socket, return a newly allocated Curl_addrinfo
		 * struct initialized with this path.
		 * Set '*longpath' to TRUE if the error is a too long path.
		 */);
	}
	/* sun_path must be able to store the NUL-terminated path */
	/* assume reliable transport for HTTP */
	/* Abstract Unix domain socket have NULL prefix instead of suffix */
	/* copy NUL byte */
	/*
	 * curl_dbg_freeaddrinfo()
	 *
	 * This is strictly for memory tracing and are using the same style as the
	 * family otherwise present in memdebug.c. I put these ones here since they
	 * require a bunch of structs I didn't want to include in memdebug.c
	 */
	/* defined(CURLDEBUG) && defined(HAVE_FREEADDRINFO) */
	/*
	 * curl_dbg_getaddrinfo()
	 *
	 * This is strictly for memory tracing and are using the same style as the
	 * family otherwise present in memdebug.c. I put these ones here since they
	 * require a bunch of structs I didn't want to include in memdebug.c
	 */
	/* success */
	/* defined(CURLDEBUG) && defined(HAVE_GETADDRINFO) */
	/*
	 * Work-arounds the sin6_port is always zero bug on iOS 9.3.2 and Mac OS X
	 * 10.11.5.
	 */
	/* storage area for this info */
	/* storage area for this info */
	public Curl_addrinfo Curl_doh(connectdata conn, Object hostname, int port, int waitp) {
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		 result = CURLE_OK;
		waitp = /* this never returns synchronously */1;
		(Object)conn;
		(Object)hostname;
		(Object)port;
		Object generatedReq = data.getReq();
		.memset(generatedReq.getDoh(), 0, /* start clean, consider allocating this struct on demand */);
		generatedReq.getDoh().setHost(hostname);
		generatedReq.getDoh().setPort(port);
		generatedReq.getDoh().setHeaders(((Object)0).curl_slist_append("Content-Type: application/dns-message"));
		if (!generatedReq.getDoh().getHeaders()) {
			;
		} 
		long generatedIp_version = conn.getIp_version();
		Object generatedSet = data.getSet();
		Object generatedMulti = data.getMulti();
		if (generatedIp_version != CURL_IPRESOLVE_V6) {
			result = ModernizedCProgram.dohprobe(data, generatedReq.getDoh().getProbe()[0], /* create IPv4 DOH request */.DNS_TYPE_A, hostname, generatedSet.getStr()[dupstring.STRING_DOH], generatedMulti, generatedReq.getDoh().getHeaders());
			if (result) {
				;
			} 
			generatedReq.getDoh().getPending()++;
		} 
		if (generatedIp_version != CURL_IPRESOLVE_V4) {
			result = ModernizedCProgram.dohprobe(data, generatedReq.getDoh().getProbe()[1], /* create IPv6 DOH request */.DNS_TYPE_AAAA, hostname, generatedSet.getStr()[dupstring.STRING_DOH], generatedMulti, generatedReq.getDoh().getHeaders());
			if (result) {
				;
			} 
			generatedReq.getDoh().getPending()++;
		} 
		return ((Object)0);
		generatedReq.getDoh().setHeaders(((Object)0));
		generatedReq.getDoh().getProbe()[0].getEasy().Curl_close();
		generatedReq.getDoh().getProbe()[0].setEasy(((Object)0));
		generatedReq.getDoh().getProbe()[1].getEasy().Curl_close();
		generatedReq.getDoh().getProbe()[1].setEasy(((Object)0));
		return ((Object)0);
	}
	public Curl_addrinfo doh2ai(Object de, Object hostname, int port) {
		Curl_addrinfo ai = new Curl_addrinfo();
		Curl_addrinfo prevai = ((Object)0);
		Curl_addrinfo firstai = ((Object)0);
		sockaddr_in addr = new sockaddr_in();
		 result = CURLE_OK;
		int i;
		if (!de) {
			return ((Object)/* no input == no output! */0);
		} 
		Byte generatedAi_canonname = ai.getAi_canonname();
		sockaddr generatedAi_addr = ai.getAi_addr();
		Object generatedSin_addr = addr.getSin_addr();
		int generatedAi_family = ai.getAi_family();
		for (i = 0; i < de.getNumaddr(); i++) {
			size_t ss_size = new size_t();
			int addrtype;
			if (de.getAddr()[i].getType() == .DNS_TYPE_AAAA) {
				continue;
			} else {
					ss_size = ;
					addrtype = 2;
			} 
			ai = .Curl_ccalloc(1, );
			if (!ai) {
				result = CURLE_OUT_OF_MEMORY;
				break;
			} 
			ai.setAi_canonname(.Curl_cstrdup(hostname));
			if (!generatedAi_canonname) {
				result = CURLE_OUT_OF_MEMORY;
				.Curl_cfree(ai);
				break;
			} 
			ai.setAi_addr(.Curl_ccalloc(1, ss_size));
			if (!generatedAi_addr) {
				result = CURLE_OUT_OF_MEMORY;
				.Curl_cfree(generatedAi_canonname);
				.Curl_cfree(ai);
				break;
			} 
			if (!firstai) {
				firstai = /* store the pointer we want to return from this function */ai;
			} 
			if (prevai) {
				prevai.setAi_next(/* make the previous entry point to this */ai);
			} 
			ai.setAi_family(addrtype);
			ai.setAi_socktype(/* we return all names as STREAM, so when using this address for TFTP
			       the type must be ignored and conn->socktype be used instead! */1);
			ai.setAi_addrlen(()ss_size);
			switch (generatedAi_family) {
			case 2:
					addr = (Object)generatedAi_addr;
					do {
					} while (0);
					.memcpy(generatedSin_addr, de.getAddr()[i].getIp().getV4(), );
					addr.setSin_family((int)addrtype);
					addr.setSin_port(.htons((int)port));
					break;
			}
			prevai = ai;
		}
		if (result) {
			firstai.Curl_freeaddrinfo();
			firstai = ((Object)0);
		} 
		return firstai;
	}
	/*
	 * Curl_getaddrinfo() - for platforms without getaddrinfo
	 */
	/*
	 * Curl_getaddrinfo() - for platforms without getaddrinfo
	 */
	public Curl_addrinfo Curl_resolver_getaddrinfo(connectdata conn, Object hostname, int port, int waitp) {
		in_addr in = new in_addr();
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		Object generatedState = data.getState();
		resdata reslv = (resdata)generatedState.getResolver();
		waitp = /* default to synchronous response */0;
		Curl_addrinfo curl_addrinfo = new Curl_addrinfo();
		if (ModernizedCProgram.Curl_inet_pton(2, hostname, in) > 0) {
			return curl_addrinfo.Curl_ip2addr(2, in, hostname, /* This is a dotted IP address 123.123.123.123-style */port);
		} 
		curltime curltime = new curltime();
		reslv.setStart(curltime.Curl_now());
		if (conn.init_resolve_thread(hostname, port, ((Object)/* fire up a new resolver thread! */0))) {
			waitp = /* expect asynchronous response */1;
			return ((Object)0);
		} 
		generatedData.Curl_failf("getaddrinfo() thread failed\n");
		return ((Object)0/* !HAVE_GETADDRINFO *//*
		 * Curl_resolver_getaddrinfo() - for getaddrinfo
		 */);
	}
	/* default to synchronous response */
	/* First check if this is an IPv4 address string */
	/* This is a dotted IP address 123.123.123.123-style */
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
	public Byte getAi_canonname() {
		return ai_canonname;
	}
	public void setAi_canonname(Byte newAi_canonname) {
		ai_canonname = newAi_canonname;
	}
	public sockaddr getAi_addr() {
		return ai_addr;
	}
	public void setAi_addr(sockaddr newAi_addr) {
		ai_addr = newAi_addr;
	}
	public Curl_addrinfo getAi_next() {
		return ai_next;
	}
	public void setAi_next(Curl_addrinfo newAi_next) {
		ai_next = newAi_next;
	}
}
