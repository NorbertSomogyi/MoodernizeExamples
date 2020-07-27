package application;

public class walker {
	private Object data;
	private Object fetch_ref;
	private Object prefetch;
	private Object fetch;
	private Object cleanup;
	private int get_verbosely;
	private int get_recover;
	private int corrupt_object_found;
	
	public walker(Object data, Object fetch_ref, Object prefetch, Object fetch, Object cleanup, int get_verbosely, int get_recover, int corrupt_object_found) {
		setData(data);
		setFetch_ref(fetch_ref);
		setPrefetch(prefetch);
		setFetch(fetch);
		setCleanup(cleanup);
		setGet_verbosely(get_verbosely);
		setGet_recover(get_recover);
		setCorrupt_object_found(corrupt_object_found);
	}
	public walker() {
	}
	
	public void prefetch(Byte sha1) {
		object_request newreq = new object_request();
		Object generatedData = this.getData();
		walker_data data = generatedData;
		newreq = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		newreq.setWalker(walker);
		object_id generatedOid = newreq.getOid();
		Object generatedHash = generatedOid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, sha1);
		alt_base generatedAlt = data.getAlt();
		newreq.setRepo(generatedAlt);
		newreq.setState(object_request_state.WAITING);
		newreq.setReq(((Object)0));
		int generatedGet_verbosely = this.getGet_verbosely();
		ModernizedCProgram.http_is_verbose = generatedGet_verbosely;
		list_head generatedNode = newreq.getNode();
		generatedNode.list_add_tail(ModernizedCProgram.object_queue_head);
	}
	public void fetch_alternates(Object base) {
		strbuf buffer = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf url = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		active_request_slot slot = new active_request_slot();
		alternates_request alt_req = new alternates_request();
		Object generatedData = this.getData();
		walker_data cdata = generatedData;
		int generatedGot_alternates = cdata.getGot_alternates();
		if (generatedGot_alternates == /* Nothing to do if they've already been fetched */1) {
			return /*Error: Unsupported expression*/;
		} 
		cdata.setGot_alternates(/* Start the fetch */0);
		int generatedGet_verbosely = this.getGet_verbosely();
		if (generatedGet_verbosely) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Getting alternates list for %s\n", base);
		} 
		url.strbuf_addf("%s/objects/info/http-alternates", base/*
			 * Use a callback to process the result, since another request
			 * may fail and need to have alternates loaded before continuing
			 */);
		active_request_slot active_request_slot = new active_request_slot();
		slot = active_request_slot.get_active_slot();
		slot.setCallback_func(process_alternates_response);
		alt_req.setWalker(walker);
		slot.setCallback_data(alt_req);
		Object generatedCurl = slot.getCurl();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_FILE, buffer);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, ModernizedCProgram.fwrite_buffer);
		byte[] generatedBuf = url.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_easy_setopt(generatedCurl, CURLOPT_URL, generatedBuf);
		alt_req.setBase(base);
		alt_req.setUrl(url);
		alt_req.setBuffer(buffer);
		alt_req.setHttp_specific(1);
		alt_req.setSlot(slot);
		if (slot.start_active_slot()) {
			slot.run_active_slot();
		} else {
				cdata.setGot_alternates(-1);
		} 
		buffer.strbuf_release();
		url.strbuf_release();
	}
	public int fetch_object(Byte hash) {
		byte hex = ModernizedCProgram.hash_to_hex(hash);
		int ret = 0;
		object_request obj_req = ((Object)0);
		http_object_request req = new http_object_request();
		list_head pos = new list_head();
		list_head head = ModernizedCProgram.object_queue_head;
		object_id generatedOid = obj_req.getOid();
		Object generatedHash = generatedOid.getHash();
		list_head generatedNext = pos.getNext();
		for (pos = generatedNext; pos != (head); pos = generatedNext) {
			obj_req = ((object_request)((byte)(pos) - ((size_t)((object_request)0).getNode())));
			if (ModernizedCProgram.hasheq(generatedHash, hash)) {
				break;
			} 
		}
		if (obj_req == ((Object)0)) {
			return ();
		} 
		http_object_request generatedReq = obj_req.getReq();
		if (ModernizedCProgram.the_repository.repo_has_object_file(generatedOid)) {
			if (generatedReq != ((Object)0)) {
				generatedReq.abort_http_object_request();
			} 
			obj_req.abort_object_request();
			return 0;
		} 
		ModernizedCProgram.start_object_request(walker, obj_req/*
			 * obj_req->req might change when fetching alternates in the callback
			 * process_object_response; therefore, the "shortcut" variable, req,
			 * is used only after we're done with slots.
			 */);
		object_request_state generatedState = obj_req.getState();
		active_request_slot generatedSlot = generatedReq.getSlot();
		while (generatedState == object_request_state.ACTIVE) {
			generatedSlot.run_active_slot();
		}
		req = generatedReq;
		int generatedLocalfile = req.getLocalfile();
		if (generatedLocalfile != -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedLocalfile);
			req.setLocalfile(-1);
		} 
		Object generatedCurl_result = req.getCurl_result();
		long generatedHttp_code = req.getHttp_code();
		Object generatedErrorstr = req.getErrorstr();
		ModernizedCProgram.normalize_curl_result(generatedCurl_result, generatedHttp_code, generatedErrorstr, /*Error: sizeof expression not supported yet*/);
		int generatedZret = req.getZret();
		int generatedCorrupt_object_found = this.getCorrupt_object_found();
		object_id generatedReal_oid = req.getReal_oid();
		int generatedRename = req.getRename();
		if (generatedState == object_request_state.ABORTED) {
			ret = ();
		}  else if (generatedCurl_result != CURLE_OK && generatedHttp_code != 416) {
			if (ModernizedCProgram.missing__target(generatedHttp_code, generatedCurl_result)) {
				ret = -/* Be silent, it is probably in a pack. */1;
			} else {
					ret = ();
			} 
		}  else if (generatedZret != Z_STREAM_END) {
			generatedCorrupt_object_found++;
			ret = ();
		}  else if (!ModernizedCProgram.oideq(generatedOid, generatedReal_oid)) {
			ret = ();
		}  else if (generatedRename < 0) {
			strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			ModernizedCProgram.loose_object_path(ModernizedCProgram.the_repository, ModernizedCProgram.buf, generatedOid);
			ret = ();
			ModernizedCProgram.buf.strbuf_release();
		} 
		req.release_http_object_request();
		obj_req.release_object_request();
		return ret;
	}
	public void cleanup() {
		Object generatedData = this.getData();
		walker_data data = generatedData;
		alt_base alt = new alt_base();
		alt_base alt_next = new alt_base();
		alt_base generatedAlt = data.getAlt();
		alt_base generatedNext = alt.getNext();
		Byte generatedBase = alt.getBase();
		if (data) {
			alt = generatedAlt;
			while (alt) {
				alt_next = generatedNext;
				ModernizedCProgram.free(generatedBase);
				ModernizedCProgram.free(alt);
				alt = alt_next;
			}
			ModernizedCProgram.free(data);
			this.setData(((Object)0));
		} 
		while (ModernizedCProgram.len) {
			byte c = line[ModernizedCProgram.len - 1];
			if (!((ModernizedCProgram.sane_ctype[(byte)(c)] & (true)) != 0)) {
				break;
			} 
			ModernizedCProgram.len--;
		}
		return ModernizedCProgram.len/*
		 * Remove empty lines from the beginning and end
		 * and also trailing spaces from every line.
		 *
		 * Turn multiple consecutive empty lines between paragraphs
		 * into just one empty line.
		 *
		 * If the input has only empty lines and spaces,
		 * no output will be produced.
		 *
		 * If last line does not have a newline at the end, one is added.
		 *
		 * Enable skip_comments to skip every line starting with comment
		 * character.
		 */;
	}
	public walker get_http_walker(Object url) {
		byte s;
		walker_data data = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		walker walker = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		alt_base generatedAlt = data.getAlt();
		data.setAlt(ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/));
		generatedAlt.setBase(ModernizedCProgram.xstrdup(url));
		Byte generatedBase = generatedAlt.getBase();
		for (s = generatedBase + /*Error: Function owner not recognized*/strlen(generatedBase) - 1; s == (byte)'/'; --s) {
			s = 0;
		}
		generatedAlt.setGot_indices(0);
		generatedAlt.setPacks(((Object)0));
		generatedAlt.setNext(((Object)0));
		data.setGot_alternates(-1);
		walker.setCorrupt_object_found(0);
		walker.setFetch(fetch);
		walker.setFetch_ref(fetch_ref);
		walker.setPrefetch(prefetch);
		walker.setCleanup(cleanup);
		walker.setData(data);
		return walker;
	}
	public void walker_say(Object fmt) {
		int generatedGet_verbosely = this.getGet_verbosely();
		if (generatedGet_verbosely) {
			va_list ap = new va_list();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vfprintf((_iob[2]), fmt, ap);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		} 
	}
	public int loop() {
		object_list elem = new object_list();
		object_list generatedNext = elem.getNext();
		int generatedFlags = obj.getFlags();
		object_id generatedOid = obj.getOid();
		Object generatedHash = generatedOid.getHash();
		int generatedType = obj.getType();
		object object = new object();
		while (ModernizedCProgram.process_queue) {
			object obj = ModernizedCProgram.process_queue.getItem();
			elem = ModernizedCProgram.process_queue;
			ModernizedCProgram.process_queue = generatedNext;
			ModernizedCProgram.free(elem);
			if (!ModernizedCProgram.process_queue) {
				ModernizedCProgram.process_queue_end = ModernizedCProgram.process_queue/* If we are not scanning this object, we placed it in
						 * the queue because we needed to fetch it first.
						 */;
			} 
			if (!(generatedFlags & (-1024 << 2))) {
				if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(walker, generatedHash)) {
					ModernizedCProgram.report_missing(obj);
					return -1;
				} 
			} 
			if (!generatedType) {
				object.parse_object(ModernizedCProgram.the_repository, generatedOid);
			} 
			if (walker.process_object(obj)) {
				return -1;
			} 
		}
		return 0;
	}
	public int walker_fetch(int targets, byte[][] target, Object[][] write_ref, Object write_ref_log_details) {
		strbuf refname = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ref_transaction transaction = ((Object)0);
		object_id oids = ModernizedCProgram.xmalloc(targets * /*Error: Unsupported expression*/);
		byte msg = ((Object)0);
		int i;
		int ret = -1;
		ModernizedCProgram.save_commit_buffer = 0;
		ref_transaction ref_transaction = new ref_transaction();
		if (write_ref) {
			transaction = ref_transaction.ref_transaction_begin(err);
			if (!transaction) {
				();
				;
			} 
		} 
		int generatedGet_recover = this.getGet_recover();
		if (!generatedGet_recover) {
			ModernizedCProgram.for_each_ref(mark_complete, ((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_sort_by_date(ModernizedCProgram.complete);
		} 
		object object = new object();
		for (i = 0; i < targets; i++) {
			if (ModernizedCProgram.interpret_target(walker, target[i], oids + i)) {
				();
				;
			} 
			if (ModernizedCProgram.process(walker, object.lookup_unknown_object(oids[i]))) {
				;
			} 
		}
		if (walker.loop()) {
			;
		} 
		if (!write_ref) {
			ret = 0;
			;
		} 
		if (write_ref_log_details) {
			msg = ModernizedCProgram.xstrfmt("fetch from %s", write_ref_log_details);
		} else {
				msg = ((Object)0);
		} 
		byte[] generatedBuf = refname.getBuf();
		for (i = 0; i < targets; i++) {
			if (!write_ref[i]) {
				continue;
			} 
			refname.strbuf_setlen(0);
			refname.strbuf_addf("refs/%s", write_ref[i]);
			if (ModernizedCProgram.ref_transaction_update(transaction, generatedBuf, oids + i, ((Object)0), 0, msg ? msg : "fetch (unknown)", err)) {
				();
				;
			} 
		}
		if (ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			();
			;
		} 
		ret = 0;
		ModernizedCProgram.free(msg);
		ModernizedCProgram.free(oids);
		err.strbuf_release();
		refname.strbuf_release();
		return ret;
	}
	public void walker_free() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(walker);
		ModernizedCProgram.free(walker);
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getFetch_ref() {
		return fetch_ref;
	}
	public void setFetch_ref(Object newFetch_ref) {
		fetch_ref = newFetch_ref;
	}
	public Object getPrefetch() {
		return prefetch;
	}
	public void setPrefetch(Object newPrefetch) {
		prefetch = newPrefetch;
	}
	public Object getFetch() {
		return fetch;
	}
	public void setFetch(Object newFetch) {
		fetch = newFetch;
	}
	public Object getCleanup() {
		return cleanup;
	}
	public void setCleanup(Object newCleanup) {
		cleanup = newCleanup;
	}
	public int getGet_verbosely() {
		return get_verbosely;
	}
	public void setGet_verbosely(int newGet_verbosely) {
		get_verbosely = newGet_verbosely;
	}
	public int getGet_recover() {
		return get_recover;
	}
	public void setGet_recover(int newGet_recover) {
		get_recover = newGet_recover;
	}
	public int getCorrupt_object_found() {
		return corrupt_object_found;
	}
	public void setCorrupt_object_found(int newCorrupt_object_found) {
		corrupt_object_found = newCorrupt_object_found;
	}
}
/* WALKER_H */
