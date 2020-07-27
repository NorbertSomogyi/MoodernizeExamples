package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2015, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* linked-list structure with last node cache for easysrc */
/* linked-list structure with last node cache for easysrc */
public class slist_wc {
	private curl_slist first;
	private curl_slist last;
	
	public slist_wc(curl_slist first, curl_slist last) {
		setFirst(first);
		setLast(last);
	}
	public slist_wc() {
	}
	
	/* Add a source line to the main code or remarks */
	public Object easysrc_add(Object line) {
		 ret = CURLE_OK;
		slist_wc list = plist.slist_wc_append(line);
		if (!list) {
			ModernizedCProgram.easysrc_free();
			ret = CURLE_OUT_OF_MEMORY;
		} else {
				plist = list;
		} 
		return ret;
	}
	public Object easysrc_addf(Object fmt) {
		 ret = new ();
		byte bufp;
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		bufp = ModernizedCProgram.curl_mvaprintf(fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		if (!bufp) {
			ret = CURLE_OUT_OF_MEMORY;
		} else {
				ret = plist.easysrc_add(bufp);
				ModernizedCProgram.curl_free(bufp);
		} 
		return ret;
	}
	public slist_wc slist_wc_append(Object data) {
		curl_slist new_item = ((Object)0).curl_slist_append(data);
		if (!new_item) {
			return ((Object)0);
		} 
		if (!list) {
			list = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
			if (!list) {
				new_item.curl_slist_free_all();
				return ((Object)0);
			} 
			this.setFirst(new_item);
			this.setLast(new_item);
			return list;
		} 
		curl_slist generatedLast = this.getLast();
		generatedLast.setCurl_slist(new_item);
		Object generatedCurl_slist = generatedLast.getCurl_slist();
		this.setLast(generatedCurl_slist);
		return list;
	}
	/* be nice and clean up resources */
	public void slist_wc_free_all() {
		if (!list) {
			return /*Error: Unsupported expression*/;
		} 
		curl_slist generatedFirst = this.getFirst();
		generatedFirst.curl_slist_free_all();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(list/* CURL_DISABLE_LIBCURL_OPTION */);
	}
	public curl_slist getFirst() {
		return first;
	}
	public void setFirst(curl_slist newFirst) {
		first = newFirst;
	}
	public curl_slist getLast() {
		return last;
	}
	public void setLast(curl_slist newLast) {
		last = newLast;
	}
}
/*
 * NAME curl_slist_free_all()
 *
 * DESCRIPTION
 *
 * free a previously built curl_slist_wc.
 */
