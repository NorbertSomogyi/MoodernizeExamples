package application;

public class http_pack_request {
	private Byte url;
	private packed_git target;
	private packed_git lst;
	private _iobuf packfile;
	private strbuf tmpfile;
	private active_request_slot slot;
	
	public http_pack_request(Byte url, packed_git target, packed_git lst, _iobuf packfile, strbuf tmpfile, active_request_slot slot) {
		setUrl(url);
		setTarget(target);
		setLst(lst);
		setPackfile(packfile);
		setTmpfile(tmpfile);
		setSlot(slot);
	}
	public http_pack_request() {
	}
	
	public void release_http_pack_request() {
		_iobuf generatedPackfile = this.getPackfile();
		if (generatedPackfile != ((Object)0)) {
			.fclose(generatedPackfile);
			this.setPackfile(((Object)0));
		} 
		this.setSlot(((Object)0));
		strbuf generatedTmpfile = this.getTmpfile();
		generatedTmpfile.strbuf_release();
		Byte generatedUrl = this.getUrl();
		ModernizedCProgram.free(generatedUrl);
		ModernizedCProgram.free(preq);
	}
	public int finish_http_pack_request() {
		packed_git lst = new packed_git();
		packed_git generatedTarget = this.getTarget();
		packed_git p = generatedTarget;
		byte tmp_idx;
		size_t len = new size_t();
		child_process ip = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		p.close_pack_index();
		_iobuf generatedPackfile = this.getPackfile();
		.fclose(generatedPackfile);
		this.setPackfile(((Object)0));
		packed_git generatedLst = this.getLst();
		lst = generatedLst;
		packed_git generatedNext = (lst).getNext();
		while (lst != p) {
			lst = (generatedNext);
		}
		lst = generatedNext;
		strbuf generatedTmpfile = this.getTmpfile();
		byte generatedBuf = generatedTmpfile.getBuf();
		if (!ModernizedCProgram.strip_suffix(generatedBuf, ".pack.temp", len)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http.c", 2224, "pack tmpfile does not end in .pack.temp?");
		} 
		tmp_idx = ModernizedCProgram.xstrfmt("%.*s.idx.temp", (int)len, generatedBuf);
		argv_array generatedArgs = ip.getArgs();
		generatedArgs.argv_array_push("index-pack");
		generatedArgs.argv_array_pushl("-o", tmp_idx, ((Object)0));
		generatedArgs.argv_array_push(generatedBuf);
		ip.setGit_cmd(1);
		ip.setNo_stdin(1);
		ip.setNo_stdout(1);
		if (ip.run_command()) {
			.unlink(generatedBuf);
			.unlink(tmp_idx);
			ModernizedCProgram.free(tmp_idx);
			return -1;
		} 
		Object generatedHash = p.getHash();
		.unlink(ModernizedCProgram.sha1_pack_index_name(generatedHash));
		if (ModernizedCProgram.finalize_object_file(generatedBuf, ModernizedCProgram.sha1_pack_name(generatedHash)) || ModernizedCProgram.finalize_object_file(tmp_idx, ModernizedCProgram.sha1_pack_index_name(generatedHash))) {
			ModernizedCProgram.free(tmp_idx);
			return -1;
		} 
		ModernizedCProgram.install_packed_git(ModernizedCProgram.the_repository, p);
		ModernizedCProgram.free(tmp_idx);
		return 0;
	}
	public http_pack_request new_http_pack_request(packed_git target, Object base_url) {
		off_t prev_posn = 0;
		strbuf buf = new strbuf(, , );
		http_pack_request preq = new http_pack_request();
		preq = ModernizedCProgram.xcalloc(1, );
		strbuf generatedTmpfile = preq.getTmpfile();
		generatedTmpfile.strbuf_init(0);
		preq.setTarget(target);
		buf.end_url_with_slash(base_url);
		Object generatedHash = target.getHash();
		buf.strbuf_addf("objects/pack/pack-%s.pack", ModernizedCProgram.hash_to_hex(generatedHash));
		preq.setUrl(buf.strbuf_detach(((Object)0)));
		generatedTmpfile.strbuf_addf("%s.temp", ModernizedCProgram.sha1_pack_name(generatedHash));
		byte generatedBuf = generatedTmpfile.getBuf();
		preq.setPackfile(.fopen(generatedBuf, "a"));
		_iobuf generatedPackfile = preq.getPackfile();
		if (!generatedPackfile) {
			();
			;
		} 
		active_request_slot active_request_slot = new active_request_slot();
		preq.setSlot(active_request_slot.get_active_slot());
		active_request_slot generatedSlot = preq.getSlot();
		Object generatedCurl = generatedSlot.getCurl();
		.curl_easy_setopt(generatedCurl, CURLOPT_FILE, generatedPackfile);
		.curl_easy_setopt(generatedCurl, CURLOPT_WRITEFUNCTION, fwrite);
		Byte generatedUrl = preq.getUrl();
		.curl_easy_setopt(generatedCurl, CURLOPT_URL, generatedUrl);
		.curl_easy_setopt(generatedCurl, CURLOPT_HTTPHEADER, ModernizedCProgram.no_pragma_header/*
			 * If there is data present from a previous transfer attempt,
			 * resume where it left off
			 */);
		prev_posn = .ftello(generatedPackfile);
		if (prev_posn > 0) {
			if (ModernizedCProgram.http_is_verbose) {
				.fprintf((_iob[2]), "Resuming fetch of pack %s at byte %llu\n", ModernizedCProgram.hash_to_hex(generatedHash), (uintmax_t)prev_posn);
			} 
			ModernizedCProgram.http_opt_request_remainder(generatedCurl, prev_posn);
		} 
		return preq;
		ModernizedCProgram.free(generatedUrl);
		ModernizedCProgram.free(preq);
		return ((Object)0);
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public packed_git getTarget() {
		return target;
	}
	public void setTarget(packed_git newTarget) {
		target = newTarget;
	}
	public packed_git getLst() {
		return lst;
	}
	public void setLst(packed_git newLst) {
		lst = newLst;
	}
	public _iobuf getPackfile() {
		return packfile;
	}
	public void setPackfile(_iobuf newPackfile) {
		packfile = newPackfile;
	}
	public strbuf getTmpfile() {
		return tmpfile;
	}
	public void setTmpfile(strbuf newTmpfile) {
		tmpfile = newTmpfile;
	}
	public active_request_slot getSlot() {
		return slot;
	}
	public void setSlot(active_request_slot newSlot) {
		slot = newSlot;
	}
}
