package application;

/* list of extra headers for this form */
/* These are the return codes for the seek callbacks */
/* fail the entire transfer */
/* tell libcurl seeking can't be done, so
                                    libcurl might try other means instead */
/* 'whence' */
/* This is a return code for the read callback that, when returned, will
   signal libcurl to immediately abort the current transfer. */
/* This is a return code for the read callback that, when returned, will
   signal libcurl to pause sending data on the current transfer. */
/* Return code for when the trailing headers' callback has terminated
   without any errors*/
/* Return code for when was an error in the trailing header's list and we
  want to abort the request */
/* linked-list structure for the CURLOPT_QUOTE option (and other) */
/* for each index in this array, there's a
                                   linked list with textual information in the
                                   format "name: value" */
public class curl_slist {
	private Byte data;
	private curl_slist next;
	
	public curl_slist(Byte data, curl_slist next) {
		setData(data);
		setNext(next);
	}
	public curl_slist() {
	}
	
	public curl_slist slist_get_last() {
		curl_slist item = new curl_slist();
		if (!/* if caller passed us a NULL, return now */list) {
			return ((Object)0);
		} 
		item = /* loop through to find the last item */list;
		Object generatedCurl_slist = item.getCurl_slist();
		while (generatedCurl_slist) {
			item = generatedCurl_slist;
		}
		return item/*
		 * Curl_slist_append_nodup() appends a string to the linked list. Rather than
		 * copying the string in dynamic storage, it takes its ownership. The string
		 * should have been malloc()ated. Curl_slist_append_nodup always returns
		 * the address of the first record, so that you can use this function as an
		 * initialization function as well as an append function.
		 * If an error occurs, NULL is returned and the string argument is NOT
		 * released.
		 */;
	}
	public curl_slist Curl_slist_append_nodup(Byte data) {
		curl_slist last = new curl_slist();
		curl_slist new_item = new curl_slist();
		do {
		} while (0);
		new_item = /*Error: Function owner not recognized*/Curl_cmalloc(/*Error: Unsupported expression*/);
		if (!new_item) {
			return ((Object)0);
		} 
		new_item.setCurl_slist(((Object)0));
		new_item.setCurl_slist(data);
		if (!/* if this is the first item, then new_item *is* the list */list) {
			return new_item;
		} 
		last = list.slist_get_last();
		last.setCurl_slist(new_item);
		return list/*
		 * curl_slist_append() appends a string to the linked list. It always returns
		 * the address of the first record, so that you can use this function as an
		 * initialization function as well as an append function. If you find this
		 * bothersome, then simply create a separate _init function and call it
		 * appropriately from within the program.
		 */;
	}
	public curl_slist curl_slist_append(Object data) {
		byte dupdata = /*Error: Function owner not recognized*/Curl_cstrdup(data);
		if (!dupdata) {
			return ((Object)0);
		} 
		list = list.Curl_slist_append_nodup(dupdata);
		if (!list) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(dupdata);
		} 
		return list/*
		 * Curl_slist_duplicate() duplicates a linked list. It always returns the
		 * address of the first record of the cloned list or NULL in case of an
		 * error (or if the input list was NULL).
		 */;
	}
	public curl_slist Curl_slist_duplicate() {
		curl_slist outlist = ((Object)0);
		curl_slist tmp = new curl_slist();
		Object generatedCurl_slist = this.getCurl_slist();
		while (inlist) {
			tmp = outlist.curl_slist_append(generatedCurl_slist);
			if (!tmp) {
				outlist.curl_slist_free_all();
				return ((Object)0);
			} 
			outlist = tmp;
			inlist = generatedCurl_slist;
		}
		return outlist;
	}
	/* be nice and clean up resources */
	public void curl_slist_free_all() {
		curl_slist next = new curl_slist();
		curl_slist item = new curl_slist();
		if (!list) {
			return /*Error: Unsupported expression*/;
		} 
		item = list;
		Object generatedCurl_slist = item.getCurl_slist();
		do {
			next = generatedCurl_slist;
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedCurl_slist));
				(generatedCurl_slist) = ((Object)0);
			} while (0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(item);
			item = next;
		} while (next);
	}
	/* Generate code for a struct curl_slist. */
	public Object libcurl_generate_slist(Integer slistno) {
		 ret = CURLE_OK;
		byte escaped = ((Object)0);
		slistno = ++/* May need several slist variables, so invent name */ModernizedCProgram.easysrc_slist_count;
		do {
			ret = ModernizedCProgram.easysrc_decl.easysrc_addf("struct curl_slist *slist%d;", slistno);
			if (ret) {
				;
			} 
		} while (0);
		do {
			ret = ModernizedCProgram.easysrc_data.easysrc_addf("slist%d = NULL;", slistno);
			if (ret) {
				;
			} 
		} while (0);
		do {
			ret = ModernizedCProgram.easysrc_clean.easysrc_addf("curl_slist_free_all(slist%d);", slistno);
			if (ret) {
				;
			} 
		} while (0);
		do {
			ret = ModernizedCProgram.easysrc_clean.easysrc_addf("slist%d = NULL;", slistno);
			if (ret) {
				;
			} 
		} while (0);
		Object generatedCurl_slist = this.getCurl_slist();
		for (; slist; slist = generatedCurl_slist) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((escaped));
				(escaped) = ((Object)0);
			} while (0);
			escaped = ModernizedCProgram.c_escape(generatedCurl_slist, CURL_ZERO_TERMINATED);
			if (!escaped) {
				return CURLE_OUT_OF_MEMORY;
			} 
			do {
				ret = ModernizedCProgram.easysrc_data.easysrc_addf("slist%d = curl_slist_append(slist%d, \"%s\");", slistno, slistno, escaped);
				if (ret) {
					;
				} 
			} while (0);
		}
		return ret;
	}
	public curl_slist slist_convert(int dccsid, int sccsid) {
		curl_slist to = (curl_slist)((Object)0);
		for (; ModernizedCProgram.from; ModernizedCProgram.from = ModernizedCProgram.from.getNext()) {
			curl_slist nl = new curl_slist();
			byte cp = ModernizedCProgram.dynconvert(dccsid, ModernizedCProgram.from.getData(), -1, sccsid);
			if (!cp) {
				to.curl_slist_free_all();
				return (curl_slist)((Object)0);
			} 
			nl = to.Curl_slist_append_nodup(cp);
			if (!nl) {
				to.curl_slist_free_all();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(cp);
				return ((Object)0);
			} 
			to = nl;
		}
		return to;
	}
	public curl_slist curl_slist_append_ccsid(Object data, int ccsid) {
		byte s;
		s = (byte)((Object)0);
		if (!data) {
			return list.curl_slist_append(data);
		} 
		s = ModernizedCProgram.dynconvert(819, data, -1, ccsid);
		if (!s) {
			return (curl_slist)((Object)0);
		} 
		list = list.curl_slist_append(s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
		return list;
	}
	/* Check if header matches. */
	public Byte match_header(Object lbl, Object len) {
		byte value = ((Object)0);
		Object generatedCurl_slist = this.getCurl_slist();
		if (ModernizedCProgram.Curl_strncasecompare(generatedCurl_slist, lbl, len) && generatedCurl_slist[len] == (byte)':') {
			for (value = generatedCurl_slist + len + 1; value == (byte)' '; value++) {
				;
			}
		} 
		return value;
	}
	/* Get a header from an slist. */
	public Byte search_header(Object hdr) {
		size_t len = /*Error: Function owner not recognized*/strlen(hdr);
		byte value = ((Object)0);
		Object generatedCurl_slist = this.getCurl_slist();
		for (; !value && hdrlist; hdrlist = generatedCurl_slist) {
			value = hdrlist.match_header(hdr, len);
		}
		return value;
	}
	/* Set mime part headers. */
	public Object curl_mime_headers(Object part, int take_ownership) {
		if (!part) {
			return CURLE_BAD_FUNCTION_ARGUMENT;
		} 
		if (part.getFlags() & (1 << 0)) {
			if (part.getUserheaders() != /* Allow setting twice the same list. */headers) {
				part.getUserheaders().curl_slist_free_all();
			} 
			part.getFlags() &=  ~(1 << 0);
		} 
		part.setUserheaders(headers);
		if (headers && take_ownership) {
			part.getFlags() |=  (1 << 0);
		} 
		return CURLE_OK;
	}
	/* Compute header list size. */
	public Object slist_size(Object overhead, Object skip) {
		size_t size = 0;
		size_t skiplen = skip ? /*Error: Function owner not recognized*/strlen(skip) : 0;
		Object generatedCurl_slist = this.getCurl_slist();
		for (; s; s = generatedCurl_slist) {
			if (!skip || !s.match_header(skip, skiplen)) {
				size += /*Error: Function owner not recognized*/strlen(generatedCurl_slist) + overhead;
			} 
		}
		return size;
	}
	/* Add a header. */
	/* VARARGS2 */
	public Object Curl_mime_add_header(Object fmt) {
		curl_slist hdr = ((Object)0);
		byte s = ((Object)0);
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		s = ModernizedCProgram.curl_mvaprintf(fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		if (s) {
			hdr = slp.Curl_slist_append_nodup(s);
			if (hdr) {
				slp = hdr;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(s);
			} 
		} 
		return hdr ? CURLE_OK : CURLE_OUT_OF_MEMORY;
	}
	/* Add a content type header. */
	public Object add_content_type(Object type, Object boundary) {
		return slp.Curl_mime_add_header("Content-Type: %s%s%s", type, boundary ? "; boundary=" : "", boundary ? boundary : "");
	}
	public curl_slist sethost() {
		(Object)headers;
		return ((Object)0).curl_slist_append(ModernizedCProgram.HOSTHEADER);
	}
	public curl_slist GetLoadedModulePaths() {
		HANDLE hnd = (HANDLE)(true);
		MODULEENTRY32 mod = new MODULEENTRY32(0);
		curl_slist slist = ((Object)0);
		mod.setDwSize(/*Error: Unsupported expression*/);
		do {
			hnd = /*Error: Function owner not recognized*/CreateToolhelp32Snapshot(-1024, 0);
		} while (hnd == (HANDLE)(true) && /*Error: Function owner not recognized*/GetLastError() == -1024);
		if (hnd == (HANDLE)(true)) {
			;
		} 
		if (!/*Error: Function owner not recognized*/Module32First(hnd, mod)) {
			;
		} 
		Object generatedSzExePath = mod.getSzExePath();
		do {
			byte path;
			curl_slist temp = new curl_slist();
			ModernizedCProgram.path = generatedSzExePath;
			temp = slist.curl_slist_append(ModernizedCProgram.path);
			if (!temp) {
				;
			} 
			slist = temp;
		} while (/*Error: Function owner not recognized*/Module32Next(hnd, mod));
		;
		slist = ((Object)0);
		return slist/* WIN32 *//* MSDOS || WIN32 */;
	}
	public curl_slist cookie_list(Curl_easy data) {
		curl_slist list = ((Object)0);
		curl_slist beg = new curl_slist();
		Cookie c = new Cookie();
		byte line;
		int i;
		CookieInfo[] generatedCookies = data.getCookies();
		long generatedNumcookies = generatedCookies.getNumcookies();
		if ((generatedCookies == ((Object)0)) || (generatedNumcookies == 0)) {
			return ((Object)0);
		} 
		Byte generatedDomain = c.getDomain();
		Cookie generatedNext = c.getNext();
		for (i = 0; i < 256; i++) {
			for (c = generatedCookies[i]; c; c = generatedNext) {
				if (!generatedDomain) {
					continue;
				} 
				line = ModernizedCProgram.get_netscape_format(c);
				if (!line) {
					list.curl_slist_free_all();
					return ((Object)0);
				} 
				beg = list.Curl_slist_append_nodup(line);
				if (!beg) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(line);
					list.curl_slist_free_all();
					return ((Object)0);
				} 
				list = beg;
			}
		}
		return list;
	}
	public curl_slist Curl_cookie_list(Curl_easy data) {
		curl_slist list = new curl_slist();
		data.Curl_share_lock(CURL_LOCK_DATA_COOKIE, CURL_LOCK_ACCESS_SINGLE);
		curl_slist curl_slist = new curl_slist();
		list = curl_slist.cookie_list(data);
		data.Curl_share_unlock(CURL_LOCK_DATA_COOKIE);
		return list;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
	public curl_slist getNext() {
		return next;
	}
	public void setNext(curl_slist newNext) {
		next = newNext;
	}
}
/* socket created for a specific IP connection */
/* socket created by accept() call */
/* never use */
/* The return code from the sockopt_callback can signal information back
   to libcurl: */
/* Old form API. */
/* name is uppercase CURLFORM_<name> */
/* The macro "##" is ISO C, we assume pre-ISO C doesn't support it. */
/**/
/********* the first one is unused ************/
/*  */
/*
 * NAME curl_global_sslset()
 *
 * DESCRIPTION
 *
 * When built with multiple SSL backends, curl_global_sslset() allows to
 * choose one. This function can only be called once, and it must be called
 * *before* curl_global_init().
 *
 * The backend can be identified by the id (e.g. CURLSSLBACKEND_OPENSSL). The
 * backend can also be specified via the name parameter (passing -1 as id).
 * If both id and name are specified, the name will be ignored. If neither id
 * nor name are specified, the function will fail with
 * CURLSSLSET_UNKNOWN_BACKEND and set the "avail" pointer to the
 * NULL-terminated list of available backends.
 *
 * Upon success, the function returns CURLSSLSET_OK.
 *
 * If the specified SSL backend is not available, the function returns
 * CURLSSLSET_UNKNOWN_BACKEND and sets the "avail" pointer to a NULL-terminated
 * list of available SSL backends.
 *
 * The SSL backend can be set only once. If it has already been set, a
 * subsequent attempt to change it will result in a CURLSSLSET_TOO_LATE.
 */
/*
 * NAME curl_slist_free_all()
 *
 * DESCRIPTION
 *
 * free a previously built curl_slist.
 */
