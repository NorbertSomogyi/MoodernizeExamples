package application;

public class url_info {
	private Byte url;
	private Object err;
	private Object url_len;
	private Object scheme_len;
	private Object user_off;
	private Object user_len;
	private Object passwd_off;
	private Object passwd_len;
	private Object host_off;
	private Object host_len;
	private Object port_off;
	private Object port_len;
	private Object path_off;
	private Object path_len;
	
	public url_info(Byte url, Object err, Object url_len, Object scheme_len, Object user_off, Object user_len, Object passwd_off, Object passwd_len, Object host_off, Object host_len, Object port_off, Object port_len, Object path_off, Object path_len) {
		setUrl(url);
		setErr(err);
		setUrl_len(url_len);
		setScheme_len(scheme_len);
		setUser_off(user_off);
		setUser_len(user_len);
		setPasswd_off(passwd_off);
		setPasswd_len(passwd_len);
		setHost_off(host_off);
		setHost_len(host_len);
		setPort_off(port_off);
		setPort_len(port_len);
		setPath_off(path_off);
		setPath_len(path_len);
	}
	public url_info() {
	}
	
	public Byte url_normalize_1(Object url, byte allow_globs) {
		size_t url_len = .strlen(url);
		strbuf norm = new strbuf();
		size_t spanned = new size_t();
		size_t scheme_len = new size_t();
		size_t user_off = 0;
		size_t user_len = 0;
		size_t passwd_off = 0;
		size_t passwd_len = 0;
		size_t host_off = 0;
		size_t host_len = 0;
		size_t port_off = 0;
		size_t port_len = 0;
		size_t path_off = new size_t();
		size_t path_len = new size_t();
		size_t result_len = new size_t();
		byte slash_ptr;
		byte at_ptr;
		byte colon_ptr;
		byte path_start;
		byte result;
		/*
			 * Copy lowercased scheme and :// suffix, %-escapes are not allowed
			 * First character of scheme must be URL_ALPHA
			 */
		spanned = .strspn(url, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+.-");
		if (!spanned || !((ModernizedCProgram.sane_ctype[(byte)(url[0])] & (true)) != 0) || spanned + 3 > url_len || url[spanned] != (byte)':' || url[spanned + 1] != (byte)'/' || url[spanned + 2] != (byte)'/') {
			if (out_info) {
				this.setUrl(((Object)0));
				this.setErr(ModernizedCProgram._("invalid URL scheme name or missing '://' suffix"));
			} 
			return ((Object)/* Bad scheme and/or missing "://" part */0);
		} 
		norm.strbuf_init(url_len);
		scheme_len = spanned;
		spanned += 3;
		url_len -= spanned;
		while (spanned--) {
			norm.strbuf_addch(ModernizedCProgram.sane_case((byte)(url++), -1024));
		}
		at_ptr = .strchr(url, /*
			 * Copy any username:password if present normalizing %-escapes
			 */(byte)'@');
		slash_ptr = url + .strcspn(url, "/?#");
		Object generatedLen = norm.getLen();
		byte generatedBuf = norm.getBuf();
		if (at_ptr && at_ptr < slash_ptr) {
			user_off = generatedLen;
			if (at_ptr > url) {
				if (!norm.append_normalized_escapes(url, at_ptr - url, "", ":/?#[]@!$&'()*+,;=")) {
					if (out_info) {
						this.setUrl(((Object)0));
						this.setErr(ModernizedCProgram._("invalid %XX escape sequence"));
					} 
					norm.strbuf_release();
					return ((Object)0);
				} 
				colon_ptr = .strchr(generatedBuf + scheme_len + 3, (byte)':');
				if (colon_ptr) {
					passwd_off = (colon_ptr + 1) - generatedBuf;
					passwd_len = generatedLen - passwd_off;
					user_len = (passwd_off - 1) - (scheme_len + 3);
				} else {
						user_len = generatedLen - (scheme_len + 3);
				} 
			} 
			norm.strbuf_addch((byte)'@');
			url_len -= (++at_ptr - url);
			url = at_ptr;
		} 
		if (!url_len || .strchr(":/?#", /*
			 * Copy the host part excluding any port part, no %-escapes allowed
			 */url)) {
			if (.strncmp(generatedBuf, "file:", /* Missing host invalid for all URL schemes except file */5)) {
				if (out_info) {
					this.setUrl(((Object)0));
					this.setErr(ModernizedCProgram._("missing host and scheme is not 'file:'"));
				} 
				norm.strbuf_release();
				return ((Object)0);
			} 
		} else {
				host_off = generatedLen;
		} 
		colon_ptr = slash_ptr - 1;
		while (colon_ptr > url && colon_ptr != (byte)':' && colon_ptr != (byte)']') {
			colon_ptr--;
		}
		if (colon_ptr != (byte)':') {
			colon_ptr = slash_ptr;
		}  else if (!host_off && colon_ptr < slash_ptr && colon_ptr + 1 != slash_ptr) {
			if (/* file: URLs may not have a port number */out_info) {
				this.setUrl(((Object)0));
				this.setErr(ModernizedCProgram._("a 'file:' URL may not have a port number"));
			} 
			norm.strbuf_release();
			return ((Object)0);
		} 
		if (allow_globs) {
			spanned = .strspn(url, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.-[:]*");
		} else {
				spanned = .strspn(url, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.-[:]");
		} 
		if (spanned < colon_ptr - url) {
			if (/* Host name has invalid characters */out_info) {
				this.setUrl(((Object)0));
				this.setErr(ModernizedCProgram._("invalid characters in host name"));
			} 
			norm.strbuf_release();
			return ((Object)0);
		} 
		while (url < colon_ptr) {
			norm.strbuf_addch(ModernizedCProgram.sane_case((byte)(url++), -1024));
			url_len--;
		}
		if (colon_ptr < /*
			 * Check the port part and copy if not the default (after removing any
			 * leading 0s); no %-escapes allowed
			 */slash_ptr) {
			/* skip the ':' and leading 0s but not the last one if all 0s */url++;
			url += .strspn(url, "0");
			if (url == slash_ptr && url[-1] == (byte)'0') {
				url--;
			} 
			if (url == slash_ptr) {
			}  else if (slash_ptr - url == /* Skip ":" port with no number, it's same as default */2 && !.strncmp(generatedBuf, "http:", 5) && !.strncmp(url, "80", 2)) {
			}  else if (slash_ptr - url == /* Skip http :80 as it's the default */3 && !.strncmp(generatedBuf, "https:", 6) && !.strncmp(url, "443", 3/* Skip https :443 as it's the default *//*
						 * Port number must be all digits with leading 0s removed
						 * and since all the protocols we deal with have a 16-bit
						 * port number it must also be in the range 1..65535
						 * 0 is not allowed because that means "next available"
						 * on just about every system and therefore cannot be used
						 */)) {
			} else {
					long pnum = 0;
					spanned = .strspn(url, "0123456789");
					if (spanned < slash_ptr - url) {
						if (/* port number has invalid characters */out_info) {
							this.setUrl(((Object)0));
							this.setErr(ModernizedCProgram._("invalid port number"));
						} 
						norm.strbuf_release();
						return ((Object)0);
					} 
					if (slash_ptr - url <= 5) {
						pnum = .strtoul(url, ((Object)0), 10);
					} 
					if (pnum == 0 || pnum > 65535) {
						if (/* port number not in range 1..65535 */out_info) {
							this.setUrl(((Object)0));
							this.setErr(ModernizedCProgram._("invalid port number"));
						} 
						norm.strbuf_release();
						return ((Object)0);
					} 
					norm.strbuf_addch((byte)':');
					port_off = generatedLen;
					norm.strbuf_add(url, slash_ptr - url);
					port_len = slash_ptr - url;
			} 
			url_len -= slash_ptr - colon_ptr;
			url = slash_ptr;
		} 
		if (host_off) {
			host_len = generatedLen - host_off - (port_len ? port_len + 1 : 0/*
				 * Now copy the path resolving any . and .. segments being careful not
				 * to corrupt the URL by unescaping any delimiters, but do add an
				 * initial '/' if it's missing and do normalize any %-escape sequences.
				 */);
		} 
		path_off = generatedLen;
		path_start = generatedBuf + path_off;
		norm.strbuf_addch((byte)'/');
		if (url == (byte)'/') {
			url++;
			url_len--;
		} 
		for (; ; ) {
			byte seg_start;
			size_t seg_start_off = generatedLen;
			byte next_slash = url + .strcspn(url, "/?#");
			int skip_add_slash = 0/*
					 * RFC 3689 indicates that any . or .. segments should be
					 * unescaped before being checked for.
					 */;
			if (!norm.append_normalized_escapes(url, next_slash - url, "", ":/?#[]@!$&'()*+,;=")) {
				if (out_info) {
					this.setUrl(((Object)0));
					this.setErr(ModernizedCProgram._("invalid %XX escape sequence"));
				} 
				norm.strbuf_release();
				return ((Object)0);
			} 
			seg_start = generatedBuf + seg_start_off;
			if (!.strcmp(seg_start, ".")) {
				if (seg_start == path_start + /* ignore a . segment; be careful not to remove initial '/' */1) {
					norm.strbuf_setlen(generatedLen - 1);
					skip_add_slash = 1;
				} else {
						norm.strbuf_setlen(generatedLen - 2);
				} 
			}  else if (!.strcmp(seg_start, ".."/*
						 * ignore a .. segment and remove the previous segment;
						 * be careful not to remove initial '/' from path
						 */)) {
				byte prev_slash = generatedBuf + generatedLen - 3;
				if (prev_slash == path_start) {
					if (/* invalid .. because no previous segment to remove */out_info) {
						this.setUrl(((Object)0));
						this.setErr(ModernizedCProgram._("invalid '..' path segment"));
					} 
					norm.strbuf_release();
					return ((Object)0);
				} 
				while (--prev_slash != (byte)'/') {
				}
				if (prev_slash == path_start) {
					norm.strbuf_setlen(prev_slash - generatedBuf + 1);
					skip_add_slash = 1;
				} else {
						norm.strbuf_setlen(prev_slash - generatedBuf);
				} 
			} 
			url_len -= next_slash - url;
			url = next_slash;
			if (url != /* if the next char is not '/' done with the path */(byte)'/') {
				break;
			} 
			url++;
			url_len--;
			if (!skip_add_slash) {
				norm.strbuf_addch((byte)'/');
			} 
		}
		path_len = generatedLen - path_off/*
			 * Now simply copy the rest, if any, only normalizing %-escapes and
			 * being careful not to corrupt the URL by unescaping any delimiters.
			 */;
		if (url) {
			if (!norm.append_normalized_escapes(url, url_len, "", ":/?#[]@!$&'()*+,;=")) {
				if (out_info) {
					this.setUrl(((Object)0));
					this.setErr(ModernizedCProgram._("invalid %XX escape sequence"));
				} 
				norm.strbuf_release();
				return ((Object)0);
			} 
		} 
		result = norm.strbuf_detach(result_len);
		if (out_info) {
			this.setUrl(result);
			this.setErr(((Object)0));
			this.setUrl_len(result_len);
			this.setScheme_len(scheme_len);
			this.setUser_off(user_off);
			this.setUser_len(user_len);
			this.setPasswd_off(passwd_off);
			this.setPasswd_len(passwd_len);
			this.setHost_off(host_off);
			this.setHost_len(host_len);
			this.setPort_off(port_off);
			this.setPort_len(port_len);
			this.setPath_off(path_off);
			this.setPath_len(path_len);
		} 
		return result;
	}
	/*
		 * Normalize NUL-terminated url using the following rules:
		 *
		 * 1. Case-insensitive parts of url will be converted to lower case
		 * 2. %-encoded characters that do not need to be will be unencoded
		 * 3. Characters that are not %-encoded and must be will be encoded
		 * 4. All %-encodings will be converted to upper case hexadecimal
		 * 5. Leading 0s are removed from port numbers
		 * 6. If the default port for the scheme is given it will be removed
		 * 7. A path part (including empty) not starting with '/' has one added
		 * 8. Any dot segments (. or ..) in the path are resolved and removed
		 * 9. IPv6 host literals are allowed (but not normalized or validated)
		 *
		 * The rules are based on information in RFC 3986.
		 *
		 * Please note this function requires a full URL including a scheme
		 * and host part (except for file: URLs which may have an empty host).
		 *
		 * The return value is a newly allocated string that must be freed
		 * or NULL if the url is not valid.
		 *
		 * If out_info is non-NULL, the url and err fields therein will always
		 * be set.  If a non-NULL value is returned, it will be stored in
		 * out_info->url as well, out_info->err will be set to NULL and the
		 * other fields of *out_info will also be filled in.  If a NULL value
		 * is returned, NULL will be stored in out_info->url and out_info->err
		 * will be set to a brief, translated, error message, but no other
		 * fields will be filled in.
		 *
		 * This is NOT a URL validation function.  Full URL validation is NOT
		 * performed.  Some invalid host names are passed through this function
		 * undetected.  However, most all other problems that make a URL invalid
		 * will be detected (including a missing host for non file: URLs).
		 */
	public Byte url_normalize(Object url) {
		return out_info.url_normalize_1(url, 0);
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Object getErr() {
		return err;
	}
	public void setErr(Object newErr) {
		err = newErr;
	}
	public Object getUrl_len() {
		return url_len;
	}
	public void setUrl_len(Object newUrl_len) {
		url_len = newUrl_len;
	}
	public Object getScheme_len() {
		return scheme_len;
	}
	public void setScheme_len(Object newScheme_len) {
		scheme_len = newScheme_len;
	}
	public Object getUser_off() {
		return user_off;
	}
	public void setUser_off(Object newUser_off) {
		user_off = newUser_off;
	}
	public Object getUser_len() {
		return user_len;
	}
	public void setUser_len(Object newUser_len) {
		user_len = newUser_len;
	}
	public Object getPasswd_off() {
		return passwd_off;
	}
	public void setPasswd_off(Object newPasswd_off) {
		passwd_off = newPasswd_off;
	}
	public Object getPasswd_len() {
		return passwd_len;
	}
	public void setPasswd_len(Object newPasswd_len) {
		passwd_len = newPasswd_len;
	}
	public Object getHost_off() {
		return host_off;
	}
	public void setHost_off(Object newHost_off) {
		host_off = newHost_off;
	}
	public Object getHost_len() {
		return host_len;
	}
	public void setHost_len(Object newHost_len) {
		host_len = newHost_len;
	}
	public Object getPort_off() {
		return port_off;
	}
	public void setPort_off(Object newPort_off) {
		port_off = newPort_off;
	}
	public Object getPort_len() {
		return port_len;
	}
	public void setPort_len(Object newPort_len) {
		port_len = newPort_len;
	}
	public Object getPath_off() {
		return path_off;
	}
	public void setPath_off(Object newPath_off) {
		path_off = newPath_off;
	}
	public Object getPath_len() {
		return path_len;
	}
	public void setPath_len(Object newPath_len) {
		path_len = newPath_len;
	}
}
/* normalized url on success, must be freed, otherwise NULL */
