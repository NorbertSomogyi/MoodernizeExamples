package application;

public class CookieInfo {
	private Object cookies;
	private Byte filename;
	private  running;
	private long numcookies;
	private  newsession;
	private int lastct;
	
	public CookieInfo(Object cookies, Byte filename,  running, long numcookies,  newsession, int lastct) {
		setCookies(cookies);
		setFilename(filename);
		setRunning(running);
		setNumcookies(numcookies);
		setNewsession(newsession);
		setLastct(lastct);
	}
	public CookieInfo() {
	}
	
	public void remove_expired() {
		Cookie co = new Cookie();
		Cookie nx = new Cookie();
		 now = ().time(((Object)0));
		int i;
		Object generatedCookies = this.getCookies();
		Cookie generatedNext = co.getNext();
		Object generatedExpires = co.getExpires();
		long generatedNumcookies = this.getNumcookies();
		for (i = 0; i < 256; i++) {
			Cookie pv = ((Object)0);
			co = generatedCookies[i];
			while (co) {
				nx = generatedNext;
				if (generatedExpires && generatedExpires < now) {
					if (!pv) {
						generatedCookies[i] = generatedNext;
					} else {
							pv.setNext(generatedNext);
					} 
					generatedNumcookies--;
					co.freecookie();
				} else {
						pv = co;
				} 
				co = nx;
			}
		}
	}
	public CookieInfo Curl_cookie_init(Curl_easy data, Object file,  newsession) {
		CookieInfo c = new CookieInfo();
		FILE fp = ((Object)0);
		bool fromfile = 1;
		byte line = ((Object)0);
		Byte generatedFilename = c.getFilename();
		if (((Object)0) == inc) {
			c = .Curl_ccalloc(1, /* we didn't get a struct, create one */);
			if (!c) {
				return ((Object)/* failed to get memory */0);
			} 
			c.setFilename(.Curl_cstrdup(file ? file : /* copy the name just in case */"none"));
			if (!generatedFilename) {
				;
			} 
		} else {
				c = /* we got an already existing one, use that */inc;
		} 
		c.setRunning(/* this is not running, this is init */0);
		if (file && !.strcmp(file, "-")) {
			fp = (_iob[0]);
			fromfile = 0;
		}  else if (file && !file) {
			fp = ((Object)/* points to a "" string */0);
		} else {
				fp = file ? .fopen(file, "rt") : ((Object)0);
		} 
		c.setNewsession(/* new session? */newsession);
		Cookie cookie = new Cookie();
		if (fp) {
			byte lineptr;
			bool headerline = new bool();
			line = .Curl_cmalloc(5000);
			if (!line) {
				;
			} 
			while (fp.Curl_get_line(line, 5000)) {
				if (ModernizedCProgram.curl_strnequal("Set-Cookie:", line, .strlen("Set-Cookie:"))) {
					lineptr = line[/* This is a cookie line, get it! */11];
					headerline = 1;
				} else {
						lineptr = line;
						headerline = 0;
				} 
				while (lineptr && (int)((((byte)lineptr) == (byte)' ') || (((byte)lineptr) == (byte)'\t'))) {
					lineptr++;
				}
				cookie.Curl_cookie_add(data, c, headerline, 1, lineptr, ((Object)0), ((Object)0), 1);
			}
			.Curl_cfree(/* free the line buffer */line);
			/* run this once, not on every cookie */c.remove_expired();
			if (fromfile) {
				.fclose(fp);
			} 
		} 
		c.setRunning(/* now, we're running */1);
		Object generatedState = data.getState();
		if (data) {
			generatedState.setCookie_engine(1);
		} 
		return c;
		if (!inc/* Only clean up if we allocated it here, as the original could still be in
		     * use by a share handle */) {
			c.Curl_cookie_cleanup();
		} 
		if (fromfile && fp) {
			.fclose(fp);
		} 
		return ((Object)/* out of memory */0);
	}
	public void Curl_cookie_clearall() {
		Object generatedCookies = this.getCookies();
		if (cookies) {
			int i;
			for (i = 0; i < 256; i++) {
				generatedCookies[i].Curl_cookie_freelist();
				generatedCookies[i] = ((Object)0);
			}
			this.setNumcookies(0/*****************************************************************************
			 *
			 * Curl_cookie_freelist()
			 *
			 * Free a list of cookies previously returned by Curl_cookie_getlist();
			 *
			 ****************************************************************************/);
		} 
	}
	public void Curl_cookie_clearsess() {
		Cookie first = new Cookie();
		Cookie curr = new Cookie();
		Cookie next = new Cookie();
		Cookie prev = ((Object)0);
		int i;
		if (!cookies) {
			return ;
		} 
		Object generatedCookies = this.getCookies();
		Cookie generatedNext = curr.getNext();
		Object generatedExpires = curr.getExpires();
		long generatedNumcookies = this.getNumcookies();
		for (i = 0; i < 256; i++) {
			if (!generatedCookies[i]) {
				continue;
			} 
			first = curr = prev = generatedCookies[i];
			for (; curr; curr = next) {
				next = generatedNext;
				if (!generatedExpires) {
					if (first == curr) {
						first = next;
					} 
					if (prev == curr) {
						prev = next;
					} else {
							prev.setNext(next);
					} 
					curr.freecookie();
					generatedNumcookies--;
				} else {
						prev = curr;
				} 
			}
			generatedCookies[i] = first/*****************************************************************************
			 *
			 * Curl_cookie_cleanup()
			 *
			 * Free a "cookie object" previous created with Curl_cookie_init().
			 *
			 ****************************************************************************/;
		}
	}
	public void Curl_cookie_cleanup() {
		Byte generatedFilename = this.getFilename();
		Object generatedCookies = this.getCookies();
		if (c) {
			int i;
			.Curl_cfree(generatedFilename);
			for (i = 0; i < 256; i++) {
				generatedCookies[i].Curl_cookie_freelist();
			}
			.Curl_cfree(/* free the base struct as well */c/* get_netscape_format()
			 *
			 * Formats a string for Netscape output file, w/o a newline at the end.
			 *
			 * Function returns a char * to a formatted line. Has to be free()d
			*/);
		} 
	}
	/*
	 * cookie_output()
	 *
	 * Writes all internally known cookies to the specified file. Specify
	 * "-" as file name to write to stdout.
	 *
	 * The function returns non-zero on write failure.
	 */
	public int cookie_output(Object dumphere) {
		Cookie co = new Cookie();
		FILE out = new FILE();
		bool use_stdout = 0;
		if (!c) {
			return /* no cookie engine alive */0;
		} 
		/* at first, remove expired cookies */c.remove_expired();
		if (!.strcmp("-", dumphere)) {
			out = (_iob[/* use stdout */1]);
			use_stdout = 1;
		} else {
				out = .fopen(dumphere, "wt");
				if (!out) {
					return /* failure */1;
				} 
		} 
		.fputs("# Netscape HTTP Cookie File\n# https://curl.haxx.se/docs/http-cookies.html\n# This file was generated by libcurl! Edit at your own risk.\n\n", out);
		long generatedNumcookies = this.getNumcookies();
		Byte generatedDomain = co.getDomain();
		Cookie generatedNext = co.getNext();
		Object generatedCookies = this.getCookies();
		if (generatedNumcookies) {
			int i;
			size_t nvalid = 0;
			Cookie array = new Cookie();
			array = .Curl_ccalloc(1,  * generatedNumcookies);
			if (!array) {
				if (!use_stdout) {
					.fclose(out);
				} 
				return 1;
			} 
			for (i = 0; i < 256; /* only sort the cookies with a domain property */i++) {
				for (co = generatedCookies[i]; co; co = generatedNext) {
					if (!generatedDomain) {
						continue;
					} 
					array[nvalid++] = co;
				}
			}
			.qsort(array, nvalid, , cookie_sort_ct);
			for (i = 0; i < nvalid; i++) {
				byte format_ptr = ModernizedCProgram.get_netscape_format(array[i]);
				if (format_ptr == ((Object)0)) {
					out.curl_mfprintf("#\n# Fatal libcurl error\n");
					.Curl_cfree(array);
					if (!use_stdout) {
						.fclose(out);
					} 
					return 1;
				} 
				out.curl_mfprintf("%s\n", format_ptr);
				.Curl_cfree(format_ptr);
			}
			.Curl_cfree(array);
		} 
		if (!use_stdout) {
			.fclose(out);
		} 
		return 0;
	}
	public Object getCookies() {
		return cookies;
	}
	public void setCookies(Object newCookies) {
		cookies = newCookies;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public  getRunning() {
		return running;
	}
	public void setRunning( newRunning) {
		running = newRunning;
	}
	public long getNumcookies() {
		return numcookies;
	}
	public void setNumcookies(long newNumcookies) {
		numcookies = newNumcookies;
	}
	public  getNewsession() {
		return newsession;
	}
	public void setNewsession( newNewsession) {
		newsession = newNewsession;
	}
	public int getLastct() {
		return lastct;
	}
	public void setLastct(int newLastct) {
		lastct = newLastct;
	}
}
