package application;

/* Helpers for fetching object */
public class http_object_request {
	private Byte url;
	private strbuf tmpfile;
	private int localfile;
	private Object curl_result;
	private Object errorstr;
	private long http_code;
	private object_id oid;
	private object_id real_oid;
	private git_hash_ctx c;
	private git_zstream stream;
	private int zret;
	private int rename;
	private active_request_slot slot;
	
	public http_object_request(Byte url, strbuf tmpfile, int localfile, Object curl_result, Object errorstr, long http_code, object_id oid, object_id real_oid, git_hash_ctx c, git_zstream stream, int zret, int rename, active_request_slot slot) {
		setUrl(url);
		setTmpfile(tmpfile);
		setLocalfile(localfile);
		setCurl_result(curl_result);
		setErrorstr(errorstr);
		setHttp_code(http_code);
		setOid(oid);
		setReal_oid(real_oid);
		setC(c);
		setStream(stream);
		setZret(zret);
		setRename(rename);
		setSlot(slot);
	}
	public http_object_request() {
	}
	
	public http_object_request new_http_object_request(Object base_url, Object oid) {
		byte hex = ModernizedCProgram.oid_to_hex(oid);
		strbuf filename = new strbuf(, , );
		strbuf prevfile = new strbuf(, , );
		int prevlocal;
		byte[] prev_buf = new byte[4096];
		ssize_t prev_read = 0;
		off_t prev_posn = 0;
		http_object_request freq = new http_object_request();
		freq = ModernizedCProgram.xcalloc(1, );
		strbuf generatedTmpfile = freq.getTmpfile();
		generatedTmpfile.strbuf_init(0);
		object_id generatedOid = freq.getOid();
		generatedOid.oidcpy(oid);
		freq.setLocalfile(-1);
		ModernizedCProgram.loose_object_path(ModernizedCProgram.the_repository, filename, oid);
		byte generatedBuf = filename.getBuf();
		generatedTmpfile.strbuf_addf("%s.temp", generatedBuf);
		prevfile.strbuf_addf("%s.prev", generatedBuf);
		ModernizedCProgram.unlink_or_warn(generatedBuf);
		.rename(generatedBuf, generatedBuf);
		ModernizedCProgram.unlink_or_warn(generatedBuf);
		filename.strbuf_release();
		int generatedLocalfile = freq.getLocalfile();
		if (generatedLocalfile != -1) {
			();
		} 
		freq.setLocalfile(.open(generatedBuf, 1 | -1024 | -1024, 666/*
			 * This could have failed due to the "lazy directory creation";
			 * try to mkdir the last path component.
			 */));
		if (generatedLocalfile < 0 && (._errno()) == 2) {
			byte dir = .strrchr(generatedBuf, (byte)'/');
			if (dir) {
				dir = 0;
				.mkdir(generatedBuf, 777);
				dir = (byte)'/';
			} 
			freq.setLocalfile(.open(generatedBuf, 1 | -1024 | -1024, 666));
		} 
		if (generatedLocalfile < 0) {
			();
			;
		} 
		git_zstream generatedStream = freq.getStream();
		generatedStream.git_inflate_init();
		git_hash_ctx generatedC = freq.getC();
		.UNRECOGNIZEDFUNCTIONNAME(generatedC);
		freq.setUrl(ModernizedCProgram.get_remote_object_url(base_url, hex, 0/*
			 * If a previous temp file is present, process what was already
			 * fetched.
			 */));
		prevlocal = .open(generatedBuf, 0);
		if (prevlocal != -1) {
			do {
				prev_read = ModernizedCProgram.xread(prevlocal, prev_buf, 4096);
				if (prev_read > 0) {
					if (ModernizedCProgram.fwrite_sha1_file(prev_buf, 1, prev_read, freq) == prev_read) {
						prev_posn += prev_read;
					} else {
							prev_read = -1;
					} 
				} 
			} while (prev_read > 0);
			.close(prevlocal);
		} 
		ModernizedCProgram.unlink_or_warn(generatedBuf);
		prevfile/*
			 * Reset inflate/SHA1 if there was an error reading the previous temp
			 * file; also rewind to the beginning of the local file.
			 */.strbuf_release();
		if (prev_read == -1) {
			.memset(generatedStream, 0, );
			generatedStream.git_inflate_init();
			.UNRECOGNIZEDFUNCTIONNAME(generatedC);
			if (prev_posn > 0) {
				prev_posn = 0;
				.lseek(generatedLocalfile, 0, 0);
				if (.ftruncate(generatedLocalfile, 0) < 0) {
					();
					;
				} 
			} 
		} 
		active_request_slot active_request_slot = new active_request_slot();
		freq.setSlot(active_request_slot.get_active_slot());
		active_request_slot generatedSlot = freq.getSlot();
		Object generatedCurl = generatedSlot.getCurl();
		.curl_easy_setopt(generatedCurl, CURLOPT_FILE, freq);
		.curl_easy_setopt(generatedCurl, CURLOPT_FAILONERROR, 0);
		.curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, fwrite_sha1_file);
		Object generatedErrorstr = freq.getErrorstr();
		.curl_easy_setopt(generatedCurl, CURLOPT_ERRORBUFFER, generatedErrorstr);
		Byte generatedUrl = freq.getUrl();
		.curl_easy_setopt(generatedCurl, CURLOPT_URL, generatedUrl);
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, ModernizedCProgram.no_pragma_header/*
			 * If we have successfully processed data from a previous fetch
			 * attempt, only fetch the data we don't already have.
			 */);
		if (prev_posn > 0) {
			if (ModernizedCProgram.http_is_verbose) {
				.fprintf((_iob[2]), "Resuming fetch of object %s at byte %llu\n", hex, (uintmax_t)prev_posn);
			} 
			ModernizedCProgram.http_opt_request_remainder(generatedCurl, prev_posn);
		} 
		return freq;
		ModernizedCProgram.free(generatedUrl);
		ModernizedCProgram.free(freq);
		return ((Object)0);
	}
	public void process_http_object_request() {
		active_request_slot generatedSlot = this.getSlot();
		if (generatedSlot == ((Object)0)) {
			return ;
		} 
		Object generatedCurl_result = generatedSlot.getCurl_result();
		this.setCurl_result(generatedCurl_result);
		long generatedHttp_code = generatedSlot.getHttp_code();
		this.setHttp_code(generatedHttp_code);
		this.setSlot(((Object)0));
	}
	public int finish_http_object_request() {
		stat st = new stat();
		strbuf filename = new strbuf(, , );
		int generatedLocalfile = this.getLocalfile();
		.close(generatedLocalfile);
		this.setLocalfile(-1);
		freq.process_http_object_request();
		long generatedHttp_code = this.getHttp_code();
		Object generatedCurl_result = this.getCurl_result();
		strbuf generatedTmpfile = this.getTmpfile();
		byte generatedBuf = generatedTmpfile.getBuf();
		Object generatedSt_size = st.getSt_size();
		if (generatedHttp_code == 416) {
			ModernizedCProgram.warning("requested range invalid; we may already have all the data.");
		}  else if (generatedCurl_result != CURLE_OK) {
			if (.stat(generatedBuf, st) == 0) {
				if (generatedSt_size == 0) {
					ModernizedCProgram.unlink_or_warn(generatedBuf);
				} 
			} 
			return -1;
		} 
		git_zstream generatedStream = this.getStream();
		generatedStream.git_inflate_end();
		object_id generatedReal_oid = this.getReal_oid();
		Object generatedHash = generatedReal_oid.getHash();
		git_hash_ctx generatedC = this.getC();
		.UNRECOGNIZEDFUNCTIONNAME(generatedHash, generatedC);
		int generatedZret = this.getZret();
		if (generatedZret != Z_STREAM_END) {
			ModernizedCProgram.unlink_or_warn(generatedBuf);
			return -1;
		} 
		object_id generatedOid = this.getOid();
		if (!ModernizedCProgram.oideq(generatedOid, generatedReal_oid)) {
			ModernizedCProgram.unlink_or_warn(generatedBuf);
			return -1;
		} 
		ModernizedCProgram.loose_object_path(ModernizedCProgram.the_repository, filename, generatedOid);
		this.setRename(ModernizedCProgram.finalize_object_file(generatedBuf, generatedBuf));
		filename.strbuf_release();
		int generatedRename = this.getRename();
		return generatedRename;
	}
	public void abort_http_object_request() {
		strbuf generatedTmpfile = this.getTmpfile();
		byte generatedBuf = generatedTmpfile.getBuf();
		ModernizedCProgram.unlink_or_warn(generatedBuf);
		freq.release_http_object_request();
	}
	public void release_http_object_request() {
		int generatedLocalfile = this.getLocalfile();
		if (generatedLocalfile != -1) {
			.close(generatedLocalfile);
			this.setLocalfile(-1);
		} 
		Byte generatedUrl = this.getUrl();
		do {
			ModernizedCProgram.free(generatedUrl);
			(generatedUrl) = ((Object)0);
		} while (0);
		active_request_slot generatedSlot = this.getSlot();
		if (generatedSlot != ((Object)0)) {
			generatedSlot.setCallback_func(((Object)0));
			generatedSlot.setCallback_data(((Object)0));
			generatedSlot.release_active_slot();
			this.setSlot(((Object)0));
		} 
		strbuf generatedTmpfile = this.getTmpfile();
		generatedTmpfile.strbuf_release();
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public strbuf getTmpfile() {
		return tmpfile;
	}
	public void setTmpfile(strbuf newTmpfile) {
		tmpfile = newTmpfile;
	}
	public int getLocalfile() {
		return localfile;
	}
	public void setLocalfile(int newLocalfile) {
		localfile = newLocalfile;
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
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public object_id getReal_oid() {
		return real_oid;
	}
	public void setReal_oid(object_id newReal_oid) {
		real_oid = newReal_oid;
	}
	public git_hash_ctx getC() {
		return c;
	}
	public void setC(git_hash_ctx newC) {
		c = newC;
	}
	public git_zstream getStream() {
		return stream;
	}
	public void setStream(git_zstream newStream) {
		stream = newStream;
	}
	public int getZret() {
		return zret;
	}
	public void setZret(int newZret) {
		zret = newZret;
	}
	public int getRename() {
		return rename;
	}
	public void setRename(int newRename) {
		rename = newRename;
	}
	public active_request_slot getSlot() {
		return slot;
	}
	public void setSlot(active_request_slot newSlot) {
		slot = newSlot;
	}
}
