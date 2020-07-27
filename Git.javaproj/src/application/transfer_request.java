package application;

public class transfer_request {
	private object obj;
	private Byte url;
	private Byte dest;
	private remote_lock lock;
	private curl_slist headers;
	private buffer buffer;
	private transfer_state state;
	private Object curl_result;
	private Object errorstr;
	private long http_code;
	private Object userData;
	private active_request_slot slot;
	private transfer_request next;
	
	public transfer_request(object obj, Byte url, Byte dest, remote_lock lock, curl_slist headers, buffer buffer, transfer_state state, Object curl_result, Object errorstr, long http_code, Object userData, active_request_slot slot, transfer_request next) {
		setObj(obj);
		setUrl(url);
		setDest(dest);
		setLock(lock);
		setHeaders(headers);
		setBuffer(buffer);
		setState(state);
		setCurl_result(curl_result);
		setErrorstr(errorstr);
		setHttp_code(http_code);
		setUserData(userData);
		setSlot(slot);
		setNext(next);
	}
	public transfer_request() {
	}
	
	public void start_fetch_packed() {
		packed_git target = new packed_git();
		transfer_request check_request = ModernizedCProgram.request_queue_head;
		http_pack_request preq = new http_pack_request();
		object generatedObj = this.getObj();
		object_id generatedOid = generatedObj.getOid();
		Object generatedHash = generatedOid.getHash();
		target = ModernizedCProgram.repo.getPacks().find_sha1_pack(generatedHash);
		if (!target) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unable to fetch %s, will not be able to update server info refs\n", ModernizedCProgram.oid_to_hex(generatedOid));
			ModernizedCProgram.repo.setCan_update_info_refs(0);
			request.release_request();
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Fetching pack %s\n", ModernizedCProgram.hash_to_hex(generatedHash));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), " which contains %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		http_pack_request http_pack_request = new http_pack_request();
		preq = http_pack_request.new_http_pack_request(target, ModernizedCProgram.repo.getUrl());
		if (preq == ((Object)0)) {
			ModernizedCProgram.repo.setCan_update_info_refs(0);
			return /*Error: Unsupported expression*/;
		} 
		preq.setLst(ModernizedCProgram.repo.getPacks());
		transfer_state generatedState = check_request.getState();
		Byte generatedUrl = check_request.getUrl();
		transfer_request generatedNext = check_request.getNext();
		while (/* Make sure there isn't another open request for this pack */check_request) {
			if (generatedState == transfer_state.RUN_FETCH_PACKED && !/*Error: Function owner not recognized*/strcmp(generatedUrl, generatedUrl)) {
				preq.release_http_pack_request();
				request.release_request();
				return /*Error: Unsupported expression*/;
			} 
			check_request = generatedNext;
		}
		active_request_slot generatedSlot = preq.getSlot();
		generatedSlot.setCallback_func(process_response);
		generatedSlot.setCallback_data(request);
		this.setSlot(generatedSlot);
		this.setUserData(preq);
		this.setState(/* Try to get the request started, abort the request on error */transfer_state.RUN_FETCH_PACKED);
		if (!generatedSlot.start_active_slot()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unable to start GET request\n");
			preq.release_http_pack_request();
			ModernizedCProgram.repo.setCan_update_info_refs(0);
			request.release_request();
		} 
	}
	public void start_put() {
		object generatedObj = this.getObj();
		object_id generatedOid = generatedObj.getOid();
		byte hex = ModernizedCProgram.oid_to_hex(generatedOid);
		active_request_slot slot = new active_request_slot();
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		object_type type;
		byte[] hdr = new byte[50];
		Object unpacked;
		long len;
		int hdrlen;
		ssize_t size = new ssize_t();
		git_zstream stream = new git_zstream();
		unpacked = ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, len);
		hdrlen = ModernizedCProgram.xsnprintf(hdr, /*Error: sizeof expression not supported yet*/, "%s %llu", ModernizedCProgram.type_name(object_type.type), (uintmax_t)len) + 1;
		stream.git_deflate_init(/* Set it up */ModernizedCProgram.zlib_compression_level);
		size = stream.git_deflate_bound(len + hdrlen);
		buffer generatedBuffer = this.getBuffer();
		strbuf generatedBuf = generatedBuffer.getBuf();
		generatedBuf.strbuf_init(size);
		generatedBuffer.setPosn(0);
		stream.setNext_out((byte)generatedBuf);
		stream.setAvail_out(size);
		stream.setNext_in((Object)/* First header.. */hdr);
		stream.setAvail_in(hdrlen);
		while (stream.git_deflate(0) == Z_OK) {
			;
		}
		stream.setNext_in(/* Then the data itself.. */unpacked);
		stream.setAvail_in(len);
		while (stream.git_deflate(Z_FINISH) == Z_OK) {
			;
		}
		stream.git_deflate_end();
		ModernizedCProgram.free(unpacked);
		long generatedTotal_out = stream.getTotal_out();
		generatedBuf.setLen(generatedTotal_out);
		buf.strbuf_addstr("Destination: ");
		buf.append_remote_object_url(ModernizedCProgram.repo.getUrl(), hex, 0);
		this.setDest(buf.strbuf_detach(((Object)0)));
		buf.append_remote_object_url(ModernizedCProgram.repo.getUrl(), hex, 0);
		remote_lock generatedLock = this.getLock();
		Object generatedTmpfile_suffix = generatedLock.getTmpfile_suffix();
		buf.strbuf_add(generatedTmpfile_suffix, ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 1);
		this.setUrl(buf.strbuf_detach(((Object)0)));
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setCallback_func(process_response);
		slot.setCallback_data(request);
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		generatedBuffer.curl_setup_http(generatedCurl, generatedUrl, "PUT", ModernizedCProgram.fwrite_null);
		if (slot.start_active_slot()) {
			this.setSlot(slot);
			this.setState(transfer_state.RUN_PUT);
		} else {
				this.setState(transfer_state.ABORTED);
				do {
					ModernizedCProgram.free(generatedUrl);
					(generatedUrl) = ((Object)0);
				} while (0);
		} 
	}
	public void start_move() {
		active_request_slot slot = new active_request_slot();
		curl_slist dav_headers = ModernizedCProgram.http_copy_default_headers();
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setCallback_func(process_response);
		slot.setCallback_data(request);
		Object generatedCurl = slot.getCurl();
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.curl_setup_http_get(generatedCurl, generatedUrl, "MOVE");
		Byte generatedDest = this.getDest();
		dav_headers = /*Error: Function owner not recognized*/curl_slist_append(dav_headers, generatedDest);
		dav_headers = /*Error: Function owner not recognized*/curl_slist_append(dav_headers, "Overwrite: T");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, dav_headers);
		if (slot.start_active_slot()) {
			this.setSlot(slot);
			this.setState(transfer_state.RUN_MOVE);
		} else {
				this.setState(transfer_state.ABORTED);
				do {
					ModernizedCProgram.free(generatedUrl);
					(generatedUrl) = ((Object)0);
				} while (0);
		} 
	}
	public void release_request() {
		transfer_request entry = ModernizedCProgram.request_queue_head;
		transfer_request generatedNext = this.getNext();
		if (request == ModernizedCProgram.request_queue_head) {
			ModernizedCProgram.request_queue_head = generatedNext;
		} else {
				while (entry && generatedNext != request) {
					entry = generatedNext;
				}
				if (entry) {
					entry.setNext(generatedNext);
				} 
		} 
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.free(generatedUrl);
		ModernizedCProgram.free(request);
	}
	public void finish_request() {
		http_pack_request preq = new http_pack_request();
		http_object_request obj_req = new http_object_request();
		active_request_slot generatedSlot = this.getSlot();
		Object generatedCurl_result = generatedSlot.getCurl_result();
		this.setCurl_result(generatedCurl_result);
		long generatedHttp_code = generatedSlot.getHttp_code();
		this.setHttp_code(generatedHttp_code);
		this.setSlot(((Object)0));
		ModernizedCProgram.check_locks();
		curl_slist generatedHeaders = this.getHeaders();
		if (generatedHeaders != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_slist_free_all(generatedHeaders);
		} 
		transfer_state generatedState = this.getState();
		Byte generatedUrl = this.getUrl();
		if (generatedState != transfer_state.RUN_PUT && generatedState != /* URL is reused for MOVE after PUT and used during FETCH */transfer_state.RUN_FETCH_PACKED) {
			do {
				ModernizedCProgram.free(generatedUrl);
				(generatedUrl) = ((Object)0);
			} while (0);
		} 
		object generatedObj = this.getObj();
		object_id generatedOid = generatedObj.getOid();
		Object generatedHash = generatedOid.getHash();
		int generatedFlags = generatedObj.getFlags();
		Object generatedUserData = this.getUserData();
		int generatedRename = obj_req.getRename();
		if (generatedState == transfer_state.RUN_MKCOL) {
			if (generatedCurl_result == CURLE_OK || generatedHttp_code == 405) {
				ModernizedCProgram.remote_dir_exists[generatedHash[0]] = 1;
				request.start_put();
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "MKCOL %s failed, aborting (%d/%ld)\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedCurl_result, generatedHttp_code);
					this.setState(transfer_state.ABORTED);
					ModernizedCProgram.aborted = 1;
			} 
		}  else if (generatedState == transfer_state.RUN_PUT) {
			if (generatedCurl_result == CURLE_OK) {
				request.start_move();
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "PUT %s failed, aborting (%d/%ld)\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedCurl_result, generatedHttp_code);
					this.setState(transfer_state.ABORTED);
					ModernizedCProgram.aborted = 1;
			} 
		}  else if (generatedState == transfer_state.RUN_MOVE) {
			if (generatedCurl_result == CURLE_OK) {
				if (ModernizedCProgram.push_verbosely) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "    sent %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
				} 
				generatedFlags |=  (-1024 << 17);
				request.release_request();
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "MOVE %s failed, aborting (%d/%ld)\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedCurl_result, generatedHttp_code);
					this.setState(transfer_state.ABORTED);
					ModernizedCProgram.aborted = 1;
			} 
		}  else if (generatedState == transfer_state.RUN_FETCH_LOOSE) {
			obj_req = (http_object_request)generatedUserData;
			if (obj_req.finish_http_object_request() == 0) {
				if (generatedRename == 0) {
					generatedFlags |=  ((-1024 << 16) | (-1024 << 17));
				} 
			} 
			if (generatedFlags & (-1024 << /* Try fetching packed if necessary */16)) {
				obj_req.release_http_object_request();
				request.release_request();
			} else {
					request.start_fetch_packed();
			} 
		}  else if (generatedState == transfer_state.RUN_FETCH_PACKED) {
			int fail = 1;
			if (generatedCurl_result != CURLE_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unable to get pack file %s\n%s", generatedUrl, ModernizedCProgram.curl_errorstr);
			} else {
					preq = (http_pack_request)generatedUserData;
					if (preq) {
						if (preq.finish_http_pack_request() == 0) {
							fail = 0;
						} 
						preq.release_http_pack_request();
					} 
			} 
			if (fail) {
				ModernizedCProgram.repo.setCan_update_info_refs(0);
			} 
			request.release_request();
		} 
	}
	public object getObj() {
		return obj;
	}
	public void setObj(object newObj) {
		obj = newObj;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public Byte getDest() {
		return dest;
	}
	public void setDest(Byte newDest) {
		dest = newDest;
	}
	public remote_lock getLock() {
		return lock;
	}
	public void setLock(remote_lock newLock) {
		lock = newLock;
	}
	public curl_slist getHeaders() {
		return headers;
	}
	public void setHeaders(curl_slist newHeaders) {
		headers = newHeaders;
	}
	public buffer getBuffer() {
		return buffer;
	}
	public void setBuffer(buffer newBuffer) {
		buffer = newBuffer;
	}
	public transfer_state getState() {
		return state;
	}
	public void setState(transfer_state newState) {
		state = newState;
	}
	public Object getCurl_result() {
		return curl_result;
	}
	public void setCurl_result(Object newCurl_result) {
		curl_result = newCurl_result;
	}
	public Object getErrorstr() {
		return errorstr;
	}
	public void setErrorstr(Object newErrorstr) {
		errorstr = newErrorstr;
	}
	public long getHttp_code() {
		return http_code;
	}
	public void setHttp_code(long newHttp_code) {
		http_code = newHttp_code;
	}
	public Object getUserData() {
		return userData;
	}
	public void setUserData(Object newUserData) {
		userData = newUserData;
	}
	public active_request_slot getSlot() {
		return slot;
	}
	public void setSlot(active_request_slot newSlot) {
		slot = newSlot;
	}
	public transfer_request getNext() {
		return next;
	}
	public void setNext(transfer_request newNext) {
		next = newNext;
	}
}
