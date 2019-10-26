package application;

public class remote_lock {
	private Byte url;
	private Byte owner;
	private Byte token;
	private Object tmpfile_suffix;
	private Object start_time;
	private long timeout;
	private int refreshing;
	private remote_lock next;
	
	public remote_lock(Byte url, Byte owner, Byte token, Object tmpfile_suffix, Object start_time, long timeout, int refreshing, remote_lock next) {
		setUrl(url);
		setOwner(owner);
		setToken(token);
		setTmpfile_suffix(tmpfile_suffix);
		setStart_time(start_time);
		setTimeout(timeout);
		setRefreshing(refreshing);
		setNext(next);
	}
	public remote_lock() {
	}
	
	public curl_slist get_dav_token_headers(dav_header_flag options) {
		strbuf buf = new strbuf(, , );
		curl_slist dav_headers = ModernizedCProgram.http_copy_default_headers();
		Byte generatedToken = this.getToken();
		byte generatedBuf = buf.getBuf();
		if (dav_header_flag.options & dav_header_flag.DAV_HEADER_IF) {
			buf.strbuf_addf("If: (<%s>)", generatedToken);
			dav_headers = .curl_slist_append(dav_headers, generatedBuf);
			buf.strbuf_setlen(0);
		} 
		if (dav_header_flag.options & dav_header_flag.DAV_HEADER_LOCK) {
			buf.strbuf_addf("Lock-Token: <%s>", generatedToken);
			dav_headers = .curl_slist_append(dav_headers, generatedBuf);
			buf.strbuf_setlen(0);
		} 
		long generatedTimeout = this.getTimeout();
		if (dav_header_flag.options & dav_header_flag.DAV_HEADER_TIMEOUT) {
			buf.strbuf_addf("Timeout: Second-%ld", generatedTimeout);
			dav_headers = .curl_slist_append(dav_headers, generatedBuf);
			buf.strbuf_setlen(0);
		} 
		buf.strbuf_release();
		return dav_headers;
	}
	public int refresh_lock() {
		active_request_slot slot = new active_request_slot();
		slot_results results = new slot_results();
		curl_slist dav_headers = new curl_slist();
		int rc = 0;
		this.setRefreshing(1);
		dav_headers = lock.get_dav_token_headers(dav_header_flag.DAV_HEADER_IF | dav_header_flag.DAV_HEADER_TIMEOUT);
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setResults(results);
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.curl_setup_http_get(generatedCurl, generatedUrl, "LOCK");
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
		Object generatedCurl_result = results.getCurl_result();
		long generatedHttp_code = results.getHttp_code();
		if (slot.start_active_slot()) {
			slot.run_active_slot();
			if (generatedCurl_result != CURLE_OK) {
				.fprintf((_iob[2]), "LOCK HTTP error %ld\n", generatedHttp_code);
			} else {
					this.setStart_time(.time(((Object)0)));
					rc = 1;
			} 
		} 
		this.setRefreshing(0);
		.curl_slist_free_all(dav_headers);
		return rc;
	}
	public remote_lock lock_remote(Object path, long timeout) {
		active_request_slot slot = new active_request_slot();
		slot_results results = new slot_results();
		buffer out_buffer = new buffer(new buffer(, , ), 0);
		strbuf in_buffer = new strbuf(, , );
		byte url;
		byte ep;
		byte[] timeout_header = new byte[25];
		remote_lock lock = ((Object)0);
		curl_slist dav_headers = ModernizedCProgram.http_copy_default_headers();
		xml_ctx ctx = new xml_ctx();
		byte escaped;
		url = ModernizedCProgram.xstrfmt("%s%s", ModernizedCProgram.repo.getUrl(), path);
		ep = .strchr(url + .strlen(ModernizedCProgram.repo.getUrl()) + 1, /* Make sure leading directories exist for the remote ref */(byte)'/');
		active_request_slot active_request_slot = new active_request_slot();
		Object generatedCurl = slot.getCurl();
		Object generatedCurl_result = results.getCurl_result();
		long generatedHttp_code = results.getHttp_code();
		while (ep) {
			byte saved_character = ep[1];
			ep[1] = (byte)'\0';
			slot = active_request_slot.get_active_slot();
			slot.setResults(results);
			ModernizedCProgram.curl_setup_http_get(generatedCurl, url, "MKCOL");
			if (slot.start_active_slot()) {
				slot.run_active_slot();
				if (generatedCurl_result != CURLE_OK && generatedHttp_code != 405) {
					.fprintf((_iob[2]), "Unable to create branch path %s\n", url);
					ModernizedCProgram.free(url);
					return ((Object)0);
				} 
			} else {
					.fprintf((_iob[2]), "Unable to start MKCOL request\n");
					ModernizedCProgram.free(url);
					return ((Object)0);
			} 
			ep[1] = saved_character;
			ep = .strchr(ep + 1, (byte)'/');
		}
		escaped = ModernizedCProgram.xml_entities(ModernizedCProgram.ident_default_email());
		strbuf generatedBuf = out_buffer.getBuf();
		generatedBuf.strbuf_addf("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n<D:lockinfo xmlns:D=\"DAV:\">\n<D:lockscope><D:exclusive/></D:lockscope>\n<D:locktype><D:write/></D:locktype>\n<D:owner>\n<D:href>mailto:%s</D:href>\n</D:owner>\n</D:lockinfo>", escaped);
		ModernizedCProgram.free(escaped);
		ModernizedCProgram.xsnprintf(timeout_header, , "Timeout: Second-%ld", timeout);
		dav_headers = .curl_slist_append(dav_headers, timeout_header);
		dav_headers = .curl_slist_append(dav_headers, "Content-Type: text/xml");
		slot = active_request_slot.get_active_slot();
		slot.setResults(results);
		out_buffer.curl_setup_http(generatedCurl, url, "LOCK", ModernizedCProgram.fwrite_buffer);
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
		.curl_easy_setopt(generatedCurl, CURLOPT_FILE, in_buffer);
		lock = ModernizedCProgram.xcalloc(1, );
		lock.setTimeout(-1);
		Object generatedLen = in_buffer.getLen();
		Byte generatedName = ctx.getName();
		if (slot.start_active_slot()) {
			slot.run_active_slot();
			if (generatedCurl_result == CURLE_OK) {
				 parser = .XML_ParserCreate(((Object)0));
				XML_Status result;
				ctx.setName(ModernizedCProgram.xcalloc(10, 1));
				ctx.setLen(0);
				ctx.setCdata(((Object)0));
				ctx.setUserFunc(handle_new_lock_ctx);
				ctx.setUserData(lock);
				.XML_SetUserData(parser, ctx);
				.XML_SetElementHandler(parser, xml_start_tag, xml_end_tag);
				.XML_SetCharacterDataHandler(parser, xml_cdata);
				XML_Status.result = .XML_Parse(parser, generatedBuf, generatedLen, 1);
				ModernizedCProgram.free(generatedName);
				if (XML_Status.result != 1) {
					.fprintf((_iob[2]), "XML error: %s\n", .XML_ErrorString(.XML_GetErrorCode(parser)));
					lock.setTimeout(-1);
				} 
				.XML_ParserFree(parser);
			} else {
					.fprintf((_iob[2]), "error: curl result=%d, HTTP code=%ld\n", generatedCurl_result, generatedHttp_code);
			} 
		} else {
				.fprintf((_iob[2]), "Unable to start LOCK request\n");
		} 
		.curl_slist_free_all(dav_headers);
		generatedBuf.strbuf_release();
		in_buffer.strbuf_release();
		Byte generatedToken = lock.getToken();
		long generatedTimeout = lock.getTimeout();
		Byte generatedOwner = lock.getOwner();
		if (generatedToken == ((Object)0) || generatedTimeout <= 0) {
			ModernizedCProgram.free(generatedToken);
			ModernizedCProgram.free(generatedOwner);
			ModernizedCProgram.free(url);
			do {
				ModernizedCProgram.free(lock);
				(lock) = ((Object)0);
			} while (0);
		} else {
				lock.setUrl(url);
				lock.setStart_time(.time(((Object)0)));
				lock.setNext(ModernizedCProgram.repo.getLocks());
				ModernizedCProgram.repo.setLocks(lock);
		} 
		return lock;
	}
	public int unlock_remote() {
		active_request_slot slot = new active_request_slot();
		slot_results results = new slot_results();
		remote_lock prev = ModernizedCProgram.repo.getLocks();
		curl_slist dav_headers = new curl_slist();
		int rc = 0;
		dav_headers = lock.get_dav_token_headers(dav_header_flag.DAV_HEADER_LOCK);
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setResults(results);
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.curl_setup_http_get(generatedCurl, generatedUrl, "UNLOCK");
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
		Object generatedCurl_result = results.getCurl_result();
		long generatedHttp_code = results.getHttp_code();
		if (slot.start_active_slot()) {
			slot.run_active_slot();
			if (generatedCurl_result == CURLE_OK) {
				rc = 1;
			} else {
					.fprintf((_iob[2]), "UNLOCK HTTP error %ld\n", generatedHttp_code);
			} 
		} else {
				.fprintf((_iob[2]), "Unable to start UNLOCK request\n");
		} 
		.curl_slist_free_all(dav_headers);
		remote_lock generatedNext = this.getNext();
		if (ModernizedCProgram.repo.getLocks() == lock) {
			ModernizedCProgram.repo.setLocks(generatedNext);
		} else {
				while (prev && generatedNext != lock) {
					prev = generatedNext;
				}
				if (prev) {
					prev.setNext(generatedNext);
				} 
		} 
		Byte generatedOwner = this.getOwner();
		ModernizedCProgram.free(generatedOwner);
		ModernizedCProgram.free(generatedUrl);
		Byte generatedToken = this.getToken();
		ModernizedCProgram.free(generatedToken);
		ModernizedCProgram.free(lock);
		return rc;
	}
	public int update_remote(Object oid) {
		active_request_slot slot = new active_request_slot();
		slot_results results = new slot_results();
		buffer out_buffer = new buffer(new buffer(, , ), 0);
		curl_slist dav_headers = new curl_slist();
		dav_headers = lock.get_dav_token_headers(dav_header_flag.DAV_HEADER_IF);
		strbuf generatedBuf = out_buffer.getBuf();
		generatedBuf.strbuf_addf("%s\n", ModernizedCProgram.oid_to_hex(oid));
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setResults(results);
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		out_buffer.curl_setup_http(generatedCurl, generatedUrl, "PUT", ModernizedCProgram.fwrite_null);
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
		Object generatedCurl_result = results.getCurl_result();
		long generatedHttp_code = results.getHttp_code();
		if (slot.start_active_slot()) {
			slot.run_active_slot();
			generatedBuf.strbuf_release();
			if (generatedCurl_result != CURLE_OK) {
				.fprintf((_iob[2]), "PUT error: curl result=%d, HTTP code=%ld\n", generatedCurl_result, generatedHttp_code);
				return /* We should attempt recovery? */0;
			} 
		} else {
				generatedBuf.strbuf_release();
				.fprintf((_iob[2]), "Unable to start PUT request\n");
				return 0;
		} 
		return 1;
	}
	public void update_remote_info_refs() {
		buffer buffer = new buffer(new buffer(, , ), 0);
		active_request_slot slot = new active_request_slot();
		slot_results results = new slot_results();
		curl_slist dav_headers = new curl_slist();
		strbuf generatedBuf = buffer.getBuf();
		ModernizedCProgram.remote_ls("refs/", ((-1024 << 0) | (-1024 << 2)), add_remote_info_ref, generatedBuf);
		active_request_slot active_request_slot = new active_request_slot();
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		Object generatedCurl_result = results.getCurl_result();
		long generatedHttp_code = results.getHttp_code();
		if (!ModernizedCProgram.aborted) {
			dav_headers = lock.get_dav_token_headers(dav_header_flag.DAV_HEADER_IF);
			slot = active_request_slot.get_active_slot();
			slot.setResults(results);
			buffer.curl_setup_http(generatedCurl, generatedUrl, "PUT", ModernizedCProgram.fwrite_null);
			.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
			if (slot.start_active_slot()) {
				slot.run_active_slot();
				if (generatedCurl_result != CURLE_OK) {
					.fprintf((_iob[2]), "PUT error: curl result=%d, HTTP code=%ld\n", generatedCurl_result, generatedHttp_code);
				} 
			} 
		} 
		generatedBuf.strbuf_release();
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getOwner() {
		return owner;
	}
	public void setOwner(Byte newOwner) {
		owner = newOwner;
	}
	public Byte getToken() {
		return token;
	}
	public void setToken(Byte newToken) {
		token = newToken;
	}
	public Object getTmpfile_suffix() {
		return tmpfile_suffix;
	}
	public void setTmpfile_suffix(Object newTmpfile_suffix) {
		tmpfile_suffix = newTmpfile_suffix;
	}
	public Object getStart_time() {
		return start_time;
	}
	public void setStart_time(Object newStart_time) {
		start_time = newStart_time;
	}
	public long getTimeout() {
		return timeout;
	}
	public void setTimeout(long newTimeout) {
		timeout = newTimeout;
	}
	public int getRefreshing() {
		return refreshing;
	}
	public void setRefreshing(int newRefreshing) {
		refreshing = newRefreshing;
	}
	public remote_lock getNext() {
		return next;
	}
	public void setNext(remote_lock newNext) {
		next = newNext;
	}
}
/* Flags that control remote_ls processing */
