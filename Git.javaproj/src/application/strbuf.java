package application;

/**
 * Data Structures
 * ---------------
 */
/**
 * This is the string buffer structure. The `len` member can be used to
 * determine the current length of the string, and `buf` member provides
 * access to the string itself.
 */
public class strbuf {
	private Object alloc;
	private Object len;
	private byte buf;
	
	public strbuf(Object alloc, Object len, byte buf) {
		setAlloc(alloc);
		setLen(len);
		setBuf(buf);
	}
	public strbuf() {
	}
	
	public void redact_sensitive_header() {
		byte sensitive_header;
		byte generatedBuf = this.getBuf();
		string_list_item string_list_item = new string_list_item();
		if (ModernizedCProgram.skip_prefix(generatedBuf, "Authorization:", sensitive_header) || ModernizedCProgram.skip_prefix(generatedBuf, "Proxy-Authorization:", sensitive_header)) {
			while (((ModernizedCProgram.sane_ctype[(byte)(sensitive_header)] & (true)) != /* The first token is the type, which is OK to log */0)) {
				sensitive_header++;
			}
			while (sensitive_header && !((ModernizedCProgram.sane_ctype[(byte)(sensitive_header)] & (true)) != 0)) {
				sensitive_header++;
			}
			header.strbuf_setlen(sensitive_header - generatedBuf);
			header.strbuf_addstr(" <redacted>");
		}  else if (ModernizedCProgram.cookies_to_redact.getNr() && ModernizedCProgram.skip_prefix(generatedBuf, "Cookie:", sensitive_header)) {
			strbuf redacted_header = new strbuf(, , );
			byte cookie;
			while (((ModernizedCProgram.sane_ctype[(byte)(sensitive_header)] & (true)) != 0)) {
				sensitive_header/*
						 * The contents of header starting from sensitive_header will
						 * subsequently be overridden, so it is fine to mutate this
						 * string (hence the assignment to "char *").
						 */++;
			}
			cookie = (byte)sensitive_header;
			while (cookie) {
				byte equals;
				byte semicolon = .strstr(cookie, "; ");
				if (semicolon) {
					semicolon = 0;
				} 
				equals = ModernizedCProgram.gitstrchrnul(cookie, (byte)'=');
				if (!equals) {
					redacted_header.strbuf_addstr(/* invalid cookie, just append and continue */cookie);
					continue;
				} 
				equals = /* temporarily set to NUL for lookup */0;
				if (string_list_item.string_list_lookup(ModernizedCProgram.cookies_to_redact, cookie)) {
					redacted_header.strbuf_addstr(cookie);
					redacted_header.strbuf_addstr("=<redacted>");
				} else {
						equals = (byte)'=';
						redacted_header.strbuf_addstr(cookie);
				} 
				if (semicolon/*
								 * There are more cookies. (Or, for some
								 * reason, the input string ends in "; ".)
								 */) {
					redacted_header.strbuf_addstr("; ");
					cookie = semicolon + .strlen("; ");
				} else {
						cookie = ((Object)0);
				} 
			}
			header.strbuf_setlen(sensitive_header - generatedBuf);
			header.strbuf_addbuf(redacted_header);
		} 
	}
	public void append_remote_object_url(Object url, Object hex, int only_two_digit_prefix) {
		ModernizedCProgram.buf.end_url_with_slash(url);
		ModernizedCProgram.buf.strbuf_addf("objects/%.*s/", 2, hex);
		if (!only_two_digit_prefix) {
			ModernizedCProgram.buf.strbuf_addstr(hex + 2);
		} 
	}
	public Object curlinfo_strbuf(Object curl, Object info) {
		byte ptr;
		 ret = new ();
		ModernizedCProgram.buf.strbuf_setlen(0);
		ret = .curl_easy_getinfo(curl, info, ptr);
		if (!ret && ptr) {
			ModernizedCProgram.buf.strbuf_addstr(ptr);
		} 
		return ret/*
		 * Check for and extract a content-type parameter. "raw"
		 * should be positioned at the start of the potential
		 * parameter, with any whitespace already removed.
		 *
		 * "name" is the name of the parameter. The value is appended
		 * to "out".
		 */;
	}
	public int extract_param(Object raw, Object name) {
		size_t len = .strlen(name);
		if (.strncasecmp(raw, name, len)) {
			return -1;
		} 
		raw += len;
		if (raw != (byte)'=') {
			return -1;
		} 
		raw++;
		while (raw && !((ModernizedCProgram.sane_ctype[(byte)(raw)] & (true)) != 0) && raw != (byte)';') {
			out.strbuf_addch(raw++);
		}
		return 0/*
		 * Extract a normalized version of the content type, with any
		 * spaces suppressed, all letters lowercased, and no trailing ";"
		 * or parameters.
		 *
		 * Note that we will silently remove even invalid whitespace. For
		 * example, "text / plain" is specifically forbidden by RFC 2616,
		 * but "text/plain" is the only reasonable output, and this keeps
		 * our code simple.
		 *
		 * If the "charset" argument is not NULL, store the value of any
		 * charset parameter there.
		 *
		 * Example:
		 *   "TEXT/PLAIN; charset=utf-8" -> "text/plain", "utf-8"
		 *   "text / plain" -> "text/plain"
		 */;
	}
	public void extract_content_type(strbuf type, strbuf charset) {
		byte p;
		type.strbuf_setlen(0);
		Object generatedLen = this.getLen();
		type.strbuf_grow(generatedLen);
		byte generatedBuf = this.getBuf();
		for (p = generatedBuf; p; p++) {
			if (((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
				continue;
			} 
			if (p == (byte)';') {
				p++;
				break;
			} 
			type.strbuf_addch(ModernizedCProgram.sane_case((byte)(p), -1024));
		}
		if (!charset) {
			return ;
		} 
		charset.strbuf_setlen(0);
		while (p) {
			while (((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0) || p == (byte)';') {
				p++;
			}
			if (!charset.extract_param(p, "charset")) {
				return ;
			} 
			while (p && !((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
				p++;
			}
		}
		if (!generatedLen && ModernizedCProgram.starts_with(generatedBuf, "text/")) {
			charset.strbuf_addstr("ISO-8859-1");
		} 
	}
	public void write_accept_language() {
		int MAX_DECIMAL_PLACES = 3;
		int MAX_LANGUAGE_TAGS = 1000;
		int MAX_ACCEPT_LANGUAGE_HEADER_SIZE = 4000;
		byte language_tags = ((Object)0);
		int num_langs = 0;
		byte s = ModernizedCProgram.get_preferred_languages();
		int i;
		strbuf tag = new strbuf(, , );
		if (!/* Don't add Accept-Language header if no language is preferred. */s) {
			return ;
		} 
		Object generatedLen = tag.getLen();
		do {
			for (; s && (((ModernizedCProgram.sane_ctype[(byte)(s)] & (-1024 | -1024)) != 0) || s == (byte)'_'); /* collect language tag */s++) {
				tag.strbuf_addch(s == (byte)'_' ? (byte)'-' : s);
			}
			while (s && s != /* skip .codeset, @modifier and any other unnecessary parts */(byte)':') {
				s++;
			}
			if (generatedLen) {
				num_langs++;
				(language_tags) = ModernizedCProgram.xrealloc((language_tags), ModernizedCProgram.st_mult(, (num_langs)));
				language_tags[num_langs - 1] = tag.strbuf_detach(((Object)0));
				if (num_langs >= MAX_LANGUAGE_TAGS - /* -1 for '*' */1) {
					break;
				} 
			} 
		} while (s++);
		if (/* write Accept-Language header into buf */num_langs) {
			int last_buf_len = 0;
			int max_q;
			int decimal_places;
			byte[] q_format = new byte[32];
			(language_tags) = ModernizedCProgram.xrealloc((language_tags), ModernizedCProgram.st_mult(, (num_langs + /* add '*' */1)));
			language_tags[num_langs++] = /* it's OK; this won't be freed */"*";
			for (; max_q < num_langs && decimal_places <= MAX_DECIMAL_PLACES; ) {
				;
			}
			ModernizedCProgram.xsnprintf(q_format, , ";q=0.%%0%dd", decimal_places);
			ModernizedCProgram.buf.strbuf_addstr("Accept-Language: ");
			for (i = 0; i < num_langs; i++) {
				if (i > 0) {
					ModernizedCProgram.buf.strbuf_addstr(", ");
				} 
				ModernizedCProgram.buf.strbuf_addstr(language_tags[i]);
				if (i > 0) {
					ModernizedCProgram.buf.strbuf_addf(q_format, max_q - i);
				} 
				if (generatedLen > MAX_ACCEPT_LANGUAGE_HEADER_SIZE) {
					ModernizedCProgram.buf.strbuf_remove(last_buf_len, generatedLen - last_buf_len);
					break;
				} 
				last_buf_len = generatedLen;
			}
		} 
		for (i = 0; i < num_langs - 1; /* free language tags -- last one is a static '*' */i++) {
			ModernizedCProgram.free(language_tags[i]);
		}
		ModernizedCProgram.free(language_tags/*
		 * Get an Accept-Language header which indicates user's preferred languages.
		 *
		 * Examples:
		 *   LANGUAGE= -> ""
		 *   LANGUAGE=ko:en -> "Accept-Language: ko, en; q=0.9, *; q=0.1"
		 *   LANGUAGE=ko_KR.UTF-8:sr@latin -> "Accept-Language: ko-KR, sr; q=0.9, *; q=0.1"
		 *   LANGUAGE=ko LANG=en_US.UTF-8 -> "Accept-Language: ko, *; q=0.1"
		 *   LANGUAGE= LANG=en_US.UTF-8 -> "Accept-Language: en-US, *; q=0.1"
		 *   LANGUAGE= LANG=C -> ""
		 */);
	}
	/*
		 * MAX_DECIMAL_PLACES must not be larger than 3. If it is larger than
		 * that, q-value will be smaller than 0.001, the minimum q-value the
		 * HTTP specification allows. See
		 * http://tools.ietf.org/html/rfc7231#section-5.3.1 for q-value.
		 */
	public int update_url_from_redirect(Object asked, Object got) {
		byte tail;
		size_t new_len = new size_t();
		if (!.strcmp(asked, got.getBuf())) {
			return 0;
		} 
		byte generatedBuf = this.getBuf();
		if (!ModernizedCProgram.skip_prefix(asked, generatedBuf, tail)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http.c", 1964, "update_url_from_redirect: %s is not a superset of %s", asked, generatedBuf);
		} 
		new_len = got.getLen();
		if (!ModernizedCProgram.strip_suffix_mem(generatedBuf, new_len, tail)) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to update url base from redirection:\n  asked for: %s\n   redirect: %s"), asked, generatedBuf);
		} 
		base.strbuf_setlen(0);
		base.strbuf_add(generatedBuf, new_len);
		return 1;
	}
	public int do_command() {
		input_command_entry p = ModernizedCProgram.input_command_list;
		string_list batchlines = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		input_command_entry batch_cmd = new input_command_entry();
		/*
			 * commands can be grouped together in a batch.
			 * Batches are ended by \n. If no batch is active the program ends.
			 * During a batch all lines are buffered and passed to the handler function
			 * when the batch is terminated.
			 */
		Object generatedLen = this.getLen();
		string_list_item generatedItems = (batchlines).getItems();
		int generatedNr = (batchlines).getNr();
		byte generatedString = item.getString();
		if (generatedLen == 0) {
			if (batch_cmd) {
				string_list_item item = new string_list_item();
				for (item = generatedItems; item && item < generatedItems + generatedNr; ++item) {
					.UNRECOGNIZEDFUNCTIONNAME(generatedString);
				}
				ModernizedCProgram.terminate_batch();
				batch_cmd = ((Object)0);
				batchlines.string_list_clear(0);
				return /* end of the batch, continue reading other commands. */0;
			} 
			return /* end of command stream, quit */1;
		} 
		byte generatedBuf = this.getBuf();
		if (batch_cmd) {
			if (!ModernizedCProgram.starts_with(batch_cmd.getName(), generatedBuf)) {
				ModernizedCProgram.die("Active %s batch interrupted by %s", batch_cmd.getName(), generatedBuf);
			} 
			batchlines.string_list_append(generatedBuf);
			return 0;
		} 
		for (p = ModernizedCProgram.input_command_list; p.getName(); p++) {
			if (ModernizedCProgram.starts_with(generatedBuf, p.getName()) && (.strlen(p.getName()) == generatedLen || generatedBuf[.strlen(p.getName())] == (byte)' ')) {
				if (p.getBatchable()) {
					batch_cmd = p;
					batchlines.string_list_append(generatedBuf);
					return 0;
				} 
				return .UNRECOGNIZEDFUNCTIONNAME(generatedBuf);
			} 
		}
		ModernizedCProgram.die("Unknown command '%s'\n", generatedBuf);
		return 0;
	}
	public void tr2_dst_write_line(Object dst) {
		int fd = ModernizedCProgram.tr2_dst_get_trace_fd(dst);
		/* ensure final NL on buffer */buf_line/*
			 * We do not use write_in_full() because we do not want
			 * a short-write to try again.  We are using O_APPEND mode
			 * files and the kernel handles the atomic seek+write. If
			 * another thread or git process is concurrently writing to
			 * this fd or file, our remainder-write may not be contiguous
			 * with our initial write of this message.  And that will
			 * confuse readers.  So just don't bother.
			 *
			 * It is assumed that TRACE2 messages are short enough that
			 * the system can write them in 1 attempt and we won't see
			 * a short-write.
			 *
			 * If we get an IO error, just close the trace dst.
			 */.strbuf_complete_line();
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (.write(fd, generatedBuf, generatedLen) >= 0) {
			return ;
		} 
		if (ModernizedCProgram.tr2_dst_want_warning()) {
			ModernizedCProgram.warning("unable to write trace to '%s': %s", ModernizedCProgram.tr2_sysenv_display_name(dst.getSysenv_var()), .strerror((._errno())));
		} 
		ModernizedCProgram.tr2_dst_trace_disable(dst);
	}
	public int fetch_start_failure(Object cb, Object task_cb) {
		submodule_parallel_fetch spf = cb;
		fetch_task task = task_cb;
		spf.setResult(1);
		task.fetch_task_release();
		return 0;
	}
	public int fetch_finish(int retvalue, Object cb, Object task_cb) {
		submodule_parallel_fetch spf = cb;
		fetch_task task = task_cb;
		string_list_item it = new string_list_item();
		oid_array commits = new oid_array();
		if (retvalue/*
				 * NEEDSWORK: This indicates that the overall fetch
				 * failed, even though there may be a subsequent fetch
				 * by commit hash that might work. It may be a good
				 * idea to not indicate failure in this case, and only
				 * indicate failure if the subsequent fetch fails.
				 */) {
			spf.setResult(1);
		} 
		Object generatedSub = task.getSub();
		if (!task || !generatedSub) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\submodule.c", 1561, "callback cookie bogus");
		} 
		oid_array generatedCommits = task.getCommits();
		if (generatedCommits) {
			;
		} 
		string_list generatedChanged_submodule_names = spf.getChanged_submodule_names();
		string_list_item string_list_item = new string_list_item();
		it = string_list_item.string_list_lookup(generatedChanged_submodule_names, generatedSub.getName());
		if (!it/* Could be an unchanged submodule, not contained in the list */) {
			;
		} 
		Object generatedUtil = it.getUtil();
		commits = generatedUtil;
		repository generatedRepo = task.getRepo();
		commits.oid_array_filter(commit_missing_in_sub, generatedRepo);
		int generatedNr = commits.getNr();
		int generatedOid_fetch_tasks_nr = spf.getOid_fetch_tasks_nr();
		int generatedOid_fetch_tasks_alloc = spf.getOid_fetch_tasks_alloc();
		fetch_task generatedOid_fetch_tasks = spf.getOid_fetch_tasks();
		if (generatedNr) {
			task.setCommits(commits);
			do {
				if ((generatedOid_fetch_tasks_nr + 1) > generatedOid_fetch_tasks_alloc) {
					if ((((generatedOid_fetch_tasks_alloc) + 16) * 3 / 2) < (generatedOid_fetch_tasks_nr + 1)) {
						spf.setOid_fetch_tasks_alloc((generatedOid_fetch_tasks_nr + 1));
					} else {
							spf.setOid_fetch_tasks_alloc((((generatedOid_fetch_tasks_alloc) + 16) * 3 / 2));
					} 
					(generatedOid_fetch_tasks) = ModernizedCProgram.xrealloc((generatedOid_fetch_tasks), ModernizedCProgram.st_mult(, (generatedOid_fetch_tasks_alloc)));
				} 
			} while (0);
			generatedOid_fetch_tasks[generatedOid_fetch_tasks_nr] = task;
			generatedOid_fetch_tasks_nr++;
			return 0;
		} 
		return 0;
	}
	public int submodule_to_gitdir(Object submodule) {
		submodule sub = new submodule();
		byte git_dir;
		int ret = 0;
		ModernizedCProgram.buf.strbuf_setlen(0);
		ModernizedCProgram.buf.strbuf_addstr(submodule);
		ModernizedCProgram.buf.strbuf_complete((byte)'/');
		ModernizedCProgram.buf.strbuf_addstr(".git");
		git_dir = ModernizedCProgram.read_gitfile_gently((ModernizedCProgram.buf.getBuf()), ((Object)0));
		if (git_dir) {
			ModernizedCProgram.buf.strbuf_setlen(0);
			ModernizedCProgram.buf.strbuf_addstr(git_dir);
		} 
		if (!ModernizedCProgram.is_git_directory(ModernizedCProgram.buf.getBuf())) {
			sub = ModernizedCProgram.the_repository.submodule_from_path(ModernizedCProgram.null_oid, submodule);
			if (!sub) {
				ret = -1;
				;
			} 
			ModernizedCProgram.buf.strbuf_setlen(0);
			ModernizedCProgram.buf.strbuf_git_path("%s/%s", "modules", sub.getName());
		} 
	}
	public void prefix_magic(int prefixlen, int magic) {
		int i;
		sb.strbuf_addstr(":(");
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			if (magic & pathspec_magic[i].getBit()) {
				if (generatedBuf[generatedLen - 1] != (byte)'(') {
					sb.strbuf_addch((byte)',');
				} 
				sb.strbuf_addstr(pathspec_magic[i].getName());
			} 
		}
		sb.strbuf_addf(",prefix:%d)", prefixlen);
	}
	public void remove_subtree() {
		DIR dir = ModernizedCProgram.opendir(ModernizedCProgram.path.getBuf());
		dirent de = new dirent();
		int origlen = ModernizedCProgram.path.getLen();
		if (!dir) {
			ModernizedCProgram.die_errno("cannot opendir '%s'", ModernizedCProgram.path.getBuf());
		} 
		dirent dirent = new dirent();
		Object generatedD_name = de.getD_name();
		Object generatedSt_mode = st.getSt_mode();
		while ((de = dirent.readdir(dir)) != ((Object)0)) {
			stat st = new stat();
			if (ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				continue;
			} 
			ModernizedCProgram.path.strbuf_addch((byte)'/');
			ModernizedCProgram.path.strbuf_addstr(generatedD_name);
			if (.lstat(ModernizedCProgram.path.getBuf(), st)) {
				ModernizedCProgram.die_errno("cannot lstat '%s'", ModernizedCProgram.path.getBuf());
			} 
			if ((((generatedSt_mode) & -1024) == -1024)) {
				ModernizedCProgram.path.remove_subtree();
			}  else if (.unlink(ModernizedCProgram.path.getBuf())) {
				ModernizedCProgram.die_errno("cannot unlink '%s'", ModernizedCProgram.path.getBuf());
			} 
			ModernizedCProgram.path.strbuf_setlen(origlen);
		}
		dir.closedir();
		if (.rmdir(ModernizedCProgram.path.getBuf())) {
			ModernizedCProgram.die_errno("cannot rmdir '%s'", ModernizedCProgram.path.getBuf());
		} 
	}
	/* may return a constant string or use "buf" as scratch space */
	public Object get_rev_name(Object o) {
		rev_name n = new rev_name();
		commit c = new commit();
		if (o.getType() != object_type.OBJ_COMMIT) {
			return ModernizedCProgram.get_exact_ref_match(o);
		} 
		c = (commit)o;
		rev_name rev_name = new rev_name();
		n = rev_name.get_commit_rev_name(c);
		if (!n) {
			return ((Object)0);
		} 
		int generatedGeneration = n.getGeneration();
		Object generatedTip_name = n.getTip_name();
		if (!generatedGeneration) {
			return generatedTip_name;
		} else {
				int len = .strlen(generatedTip_name);
				if (ModernizedCProgram.len > 2 && !.strcmp(generatedTip_name + ModernizedCProgram.len - 2, "^0")) {
					ModernizedCProgram.len -= 2;
				} 
				ModernizedCProgram.buf.strbuf_setlen(0);
				ModernizedCProgram.buf.strbuf_addf("%.*s~%d", ModernizedCProgram.len, generatedTip_name, generatedGeneration);
				return ModernizedCProgram.buf.getBuf();
		} 
	}
	public void strbuf_append_ext_header(Object keyword, Object value, Object valuelen) {
		Object generatedLen = this.getLen();
		size_t orig_len = generatedLen;
		size_t len = new size_t();
		size_t tmp = new size_t();
		len = 1 + 1 + .strlen(keyword) + 1 + valuelen + /* "%u %s=%s\n" */1;
		for (tmp = 1; len / 10 >= tmp; tmp *= 10) {
			len++;
		}
		sb.strbuf_grow(len);
		sb.strbuf_addf("%llu %s=", (uintmax_t)len, keyword);
		sb.strbuf_add(value, valuelen);
		sb.strbuf_addch((byte)'\n');
		if (len != generatedLen - orig_len) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\archive-tar.c", 163, "pax extended header length miscalculated as %llu, should be %llu", (uintmax_t)len, (uintmax_t)(generatedLen - orig_len));
		} 
	}
	/*
	 * Like strbuf_append_ext_header, but for numeric values.
	 */
	public void strbuf_append_ext_header_uint(Object keyword, Object value) {
		byte[] buf = new byte[/* big enough for 2^128 in decimal, plus NUL */40];
		int len;
		len = ModernizedCProgram.xsnprintf(buf, , "%llu", value);
		sb.strbuf_append_ext_header(keyword, buf, len);
	}
	/* Read one file, then strip line endings */
	public int read_one(Object path) {
		if (ModernizedCProgram.buf.strbuf_read_file(path, 0) < 0) {
			return ();
		} 
		ModernizedCProgram.buf.strbuf_trim_trailing_newline();
		return 0;
		byte buf = ModernizedCProgram.buffer;
		long size = size_p;
		byte cp;
		byte ep;
		cache_tree it = new cache_tree();
		int i;
		int subtree_nr;
		int rawsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		it = ((Object)0);
		while (size && /* skip name, but make sure name exists */buf) {
			size--;
			buf++;
		}
		if (!size) {
			;
		} 
		buf++;
		size--;
		cache_tree cache_tree = new cache_tree();
		it = cache_tree.cache_tree();
		cp = buf;
		it.setEntry_count(.strtol(cp, ep, 10));
		if (cp == ep) {
			;
		} 
		cp = ep;
		subtree_nr = .strtol(cp, ep, 10);
		if (cp == ep) {
			;
		} 
		while (size && buf && buf != (byte)'\n') {
			size--;
			buf++;
		}
		if (!size) {
			;
		} 
		buf++;
		size--;
		int generatedEntry_count = it.getEntry_count();
		object_id generatedOid = it.getOid();
		if (0 <= generatedEntry_count) {
			if (size < rawsz) {
				;
			} 
			generatedOid.oidread((byte)buf);
			buf += rawsz;
			size -= rawsz;
		} 
		it.setSubtree_alloc(subtree_nr + /*
			 * Just a heuristic -- we do not add directories that often but
			 * we do not want to have to extend it immediately when we do,
			 * hence +2.
			 */2);
		int generatedSubtree_alloc = it.getSubtree_alloc();
		it.setDown(ModernizedCProgram.xcalloc(generatedSubtree_alloc, ));
		cache_tree_sub cache_tree_sub = new cache_tree_sub();
		for (i = 0; i < subtree_nr; i/* read each subtree */++) {
			cache_tree sub = new cache_tree();
			cache_tree_sub subtree = new cache_tree_sub();
			byte name = buf;
			sub = size.read_one(buf);
			if (!sub) {
				;
			} 
			subtree = cache_tree_sub.cache_tree_sub(it, name);
			subtree.setCache_tree(sub);
		}
		int generatedSubtree_nr = it.getSubtree_nr();
		if (subtree_nr != generatedSubtree_nr) {
			ModernizedCProgram.die("cache-tree: internal error");
		} 
		ModernizedCProgram.buffer = buf;
		size_p = size;
		return it;
		return ((Object)0);
	}
	public void add_var(Object name, Object value) {
		if (!value) {
			ModernizedCProgram.buf.strbuf_addf("unset %s; ", name);
		} else {
				ModernizedCProgram.buf.strbuf_addf("%s=", name);
				ModernizedCProgram.buf.sq_quote_buf(value);
				ModernizedCProgram.buf.strbuf_addstr("; ");
		} 
	}
	/* Get the name for the merge commit's message. */
	public void merge_name(Object remote) {
		commit remote_head = new commit();
		object_id branch_head = new object_id();
		strbuf buf = new strbuf(, , );
		strbuf bname = new strbuf(, , );
		merge_remote_desc desc = new merge_remote_desc();
		byte ptr;
		byte found_ref;
		int len;
		int early;
		bname.strbuf_branchname(remote, 0);
		byte generatedBuf = bname.getBuf();
		remote = generatedBuf;
		branch_head.oidclr();
		remote_head = .get_merge_parent(remote);
		if (!remote_head) {
			ModernizedCProgram.die(ModernizedCProgram._("'%s' does not point to a commit"), remote);
		} 
		if (branch_head.dwim_ref(remote, .strlen(remote), found_ref) > 0) {
			if (ModernizedCProgram.starts_with(found_ref, "refs/heads/")) {
				ModernizedCProgram.msg.strbuf_addf("%s\t\tbranch '%s' of .\n", ModernizedCProgram.oid_to_hex(branch_head), remote);
				;
			} 
			if (ModernizedCProgram.starts_with(found_ref, "refs/tags/")) {
				ModernizedCProgram.msg.strbuf_addf("%s\t\ttag '%s' of .\n", ModernizedCProgram.oid_to_hex(branch_head), remote);
				;
			} 
			if (ModernizedCProgram.starts_with(found_ref, "refs/remotes/")) {
				ModernizedCProgram.msg.strbuf_addf("%s\t\tremote-tracking branch '%s' of .\n", ModernizedCProgram.oid_to_hex(branch_head), remote);
				;
			} 
		} 
		for (; remote < ptr && ptr[-1] == (byte)'^'; ptr--) {
			len++;
		}
		if (len) {
			early = 1;
		} else {
				early = 0;
				ptr = .strrchr(remote, (byte)'~');
				if (ptr) {
					int seen_nonzero = 0;
					/* count ~ */len++;
					while (++ptr && ((ModernizedCProgram.sane_ctype[(byte)(ptr)] & (true)) != 0)) {
						seen_nonzero |=  (ptr != (byte)'0');
						len++;
					}
					if (ptr) {
						len = /* not ...~<number> */0;
					}  else if (seen_nonzero) {
						early = 1;
					}  else if (len == 1) {
						early = /* "name~" is "name~1"! */1;
					} 
				} 
		} 
		Object generatedLen = truname.getLen();
		object generatedObject = remote_head.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (len) {
			strbuf truname = new strbuf(, , );
			truname.strbuf_addf("refs/heads/%s", remote);
			truname.strbuf_setlen(generatedLen - len);
			if (ModernizedCProgram.ref_exists(generatedBuf)) {
				ModernizedCProgram.msg.strbuf_addf("%s\t\tbranch '%s'%s of .\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedBuf + 11, (early ? " (early part)" : ""));
				truname.strbuf_release();
				;
			} 
			truname.strbuf_release();
		} 
		desc = .merge_remote_util(remote_head);
		object generatedObj = desc.getObj();
		int generatedType = generatedObj.getType();
		if (desc && generatedObj && generatedType == object_type.OBJ_TAG) {
			ModernizedCProgram.msg.strbuf_addf("%s\t\t%s '%s'\n", ModernizedCProgram.oid_to_hex(generatedOid), ModernizedCProgram.type_name(generatedType), remote);
			;
		} 
		ModernizedCProgram.msg.strbuf_addf("%s\t\tcommit '%s'\n", ModernizedCProgram.oid_to_hex(generatedOid), remote);
		bname.strbuf_release();
	}
	public void read_merge_msg() {
		byte filename = ModernizedCProgram.the_repository.git_path_merge_msg();
		ModernizedCProgram.msg.strbuf_setlen(0);
		if (ModernizedCProgram.msg.strbuf_read_file(filename, 0) < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("Could not read from '%s'"), filename);
		} 
	}
	public void prepare_merge_message(strbuf merge_msg) {
		fmt_merge_msg_opts opts = new fmt_merge_msg_opts();
		.memset(opts, 0, );
		opts.setAdd_title(!ModernizedCProgram.have_message);
		opts.setShortlog_len(ModernizedCProgram.shortlog_len);
		opts.setCredit_people((0 < ModernizedCProgram.option_edit));
		ModernizedCProgram.fmt_merge_msg(merge_names, merge_msg, opts);
		Object generatedLen = merge_msg.getLen();
		if (generatedLen) {
			merge_msg.strbuf_setlen(generatedLen - 1);
		} 
	}
	public void strbuf_init(Object hint) {
		this.setAlloc(this.setLen(0));
		this.setBuf(ModernizedCProgram.strbuf_slopbuf);
		if (hint) {
			sb.strbuf_grow(hint);
		} 
	}
	public void strbuf_release() {
		Object generatedAlloc = this.getAlloc();
		byte generatedBuf = this.getBuf();
		if (generatedAlloc) {
			ModernizedCProgram.free(generatedBuf);
			sb.strbuf_init(0);
		} 
	}
	public Byte strbuf_detach(Object sz) {
		byte res;
		sb.strbuf_grow(0);
		byte generatedBuf = this.getBuf();
		res = generatedBuf;
		Object generatedLen = this.getLen();
		if (sz) {
			sz = generatedLen;
		} 
		sb.strbuf_init(0);
		return res;
	}
	public void strbuf_attach(Object buf, Object len, Object alloc) {
		sb.strbuf_release();
		this.setBuf(buf);
		this.setLen(len);
		this.setAlloc(alloc);
		sb.strbuf_grow(0);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		generatedBuf[generatedLen] = (byte)'\0';
	}
	public void strbuf_grow(Object extra) {
		Object generatedAlloc = this.getAlloc();
		int new_buf = !generatedAlloc;
		Object generatedLen = this.getLen();
		if (((true) > (-1024 >> ((8 * ) - (8 * ))) - (extra)) || ((extra + 1) > (-1024 >> ((8 * ) - (8 * ))) - (generatedLen))) {
			ModernizedCProgram.die("you want to use way too much memory");
		} 
		if (new_buf) {
			this.setBuf(((Object)0));
		} 
		byte generatedBuf = this.getBuf();
		do {
			if ((generatedLen + extra + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedLen + extra + 1)) {
					this.setAlloc((generatedLen + extra + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedBuf) = ModernizedCProgram.xrealloc((generatedBuf), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		if (new_buf) {
			generatedBuf[0] = (byte)'\0';
		} 
	}
	public void strbuf_trim() {
		sb.strbuf_rtrim();
		sb.strbuf_ltrim();
	}
	public void strbuf_rtrim() {
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		while (generatedLen > 0 && ((ModernizedCProgram.sane_ctype[(byte)((byte)generatedBuf[generatedLen - 1])] & (true)) != 0)) {
			generatedLen--;
		}
		generatedBuf[generatedLen] = (byte)'\0';
	}
	public void strbuf_trim_trailing_dir_sep() {
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		while (generatedLen > 0 && ModernizedCProgram.git_is_dir_sep((byte)generatedBuf[generatedLen - 1])) {
			generatedLen--;
		}
		generatedBuf[generatedLen] = (byte)'\0';
	}
	public void strbuf_trim_trailing_newline() {
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		if (generatedLen > 0 && generatedBuf[generatedLen - 1] == (byte)'\n') {
			if (--generatedLen > 0 && generatedBuf[generatedLen - 1] == (byte)'\r') {
				--generatedLen;
			} 
			generatedBuf[generatedLen] = (byte)'\0';
		} 
	}
	public void strbuf_ltrim() {
		byte generatedBuf = this.getBuf();
		byte b = generatedBuf;
		Object generatedLen = this.getLen();
		while (generatedLen > 0 && ((ModernizedCProgram.sane_ctype[(byte)(b)] & (true)) != 0)) {
			b++;
			generatedLen--;
		}
		.memmove(generatedBuf, b, generatedLen);
		generatedBuf[generatedLen] = (byte)'\0';
	}
	public int strbuf_reencode(Object from, Object to) {
		byte out;
		size_t len = new size_t();
		if (ModernizedCProgram.same_encoding(from, to)) {
			return 0;
		} 
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		out = ModernizedCProgram.reencode_string_len(generatedBuf, generatedLen, to, from, len);
		if (!out) {
			return -1;
		} 
		sb.strbuf_attach(out, len, len);
		return 0;
	}
	public void strbuf_tolower() {
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		byte p = generatedBuf;
		byte end = generatedBuf + generatedLen;
		for (; p < end; p++) {
			p = ModernizedCProgram.sane_case((byte)(p), -1024);
		}
	}
	public strbuf strbuf_split_buf(Object str, Object slen, int terminator, int max) {
		strbuf ret = ((Object)0);
		size_t nr = 0;
		size_t alloc = 0;
		strbuf t = new strbuf();
		while (slen) {
			int len = slen;
			if (max <= 0 || nr + 1 < max) {
				byte end = .memchr(str, terminator, slen);
				if (end) {
					ModernizedCProgram.len = end - str + 1;
				} 
			} 
			t = ModernizedCProgram.xmalloc();
			t.strbuf_init(ModernizedCProgram.len);
			t.strbuf_add(str, ModernizedCProgram.len);
			do {
				if ((nr + 2) > alloc) {
					if ((((alloc) + 16) * 3 / 2) < (nr + 2)) {
						alloc = (nr + 2);
					} else {
							alloc = (((alloc) + 16) * 3 / 2);
					} 
					(ret) = ModernizedCProgram.xrealloc((ret), ModernizedCProgram.st_mult(, (alloc)));
				} 
			} while (0);
			ret[nr++] = t;
			str += ModernizedCProgram.len;
			slen -= ModernizedCProgram.len;
		}
		do {
			if ((nr + 1) > alloc) {
				if ((((alloc) + 16) * 3 / 2) < (nr + 1)) {
					alloc = (nr + 1);
				} else {
						alloc = (((alloc) + 16) * 3 / 2);
				} 
				(ret) = ModernizedCProgram.xrealloc((ret), ModernizedCProgram.st_mult(, (alloc)));
			} 
		} while (/* In case string was empty */0);
		ret[nr] = ((Object)0);
		return ret;
	}
	public void strbuf_list_free() {
		strbuf s = sbs;
		while (s) {
			s.strbuf_release();
			ModernizedCProgram.free(s++);
		}
		ModernizedCProgram.free(sbs);
	}
	public void strbuf_splice(Object pos, Object len, Object data, Object dlen) {
		if (((len) > (-1024 >> ((8 * ) - (8 * ))) - (pos))) {
			ModernizedCProgram.die("you want to use way too much memory");
		} 
		Object generatedLen = this.getLen();
		if (pos > generatedLen) {
			ModernizedCProgram.die("`pos' is too far after the end of the buffer");
		} 
		if (pos + len > generatedLen) {
			ModernizedCProgram.die("`pos + len' is too far after the end of the buffer");
		} 
		if (dlen >= len) {
			sb.strbuf_grow(dlen - len);
		} 
		byte generatedBuf = this.getBuf();
		.memmove(generatedBuf + pos + dlen, generatedBuf + pos + len, generatedLen - pos - len);
		.memcpy(generatedBuf + pos, data, dlen);
		sb.strbuf_setlen(generatedLen + dlen - len);
	}
	public void strbuf_insert(Object pos, Object data, Object len) {
		sb.strbuf_splice(pos, 0, data, len);
	}
	public void strbuf_vinsertf(Object pos, Object fmt, Object ap) {
		int len;
		int len2;
		byte save;
		va_list cp = new va_list();
		Object generatedLen = this.getLen();
		if (pos > generatedLen) {
			ModernizedCProgram.die("`pos' is too far after the end of the buffer");
		} 
		.__builtin_va_copy(cp, ap);
		byte generatedBuf = this.getBuf();
		len = .vsnprintf(generatedBuf + generatedLen, 0, fmt, cp);
		.__builtin_va_end(cp);
		if (len < 0) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\strbuf.c", 264, "your vsnprintf is broken (returned %d)", len);
		} 
		if (!len) {
			return ;
		} 
		if (((len) > (-1024 >> ((8 * ) - (8 * ))) - (generatedLen))) {
			ModernizedCProgram.die("you want to use way too much memory");
		} 
		sb.strbuf_grow(len);
		.memmove(generatedBuf + pos + len, generatedBuf + pos, generatedLen - pos);
		save = generatedBuf[pos + /* vsnprintf() will append a NUL, overwriting one of our characters */len];
		len2 = .vsnprintf(generatedBuf + pos, len + 1, fmt, ap);
		generatedBuf[pos + len] = save;
		if (len2 != len) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\strbuf.c", 276, "your vsnprintf is broken (returns inconsistent lengths)");
		} 
		sb.strbuf_setlen(generatedLen + len);
	}
	public void strbuf_insertf(Object pos, Object fmt) {
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		sb.strbuf_vinsertf(pos, fmt, ap);
		.__builtin_va_end(ap);
	}
	public void strbuf_remove(Object pos, Object len) {
		sb.strbuf_splice(pos, len, "", 0);
	}
	public void strbuf_add(Object data, Object len) {
		sb.strbuf_grow(len);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		.memcpy(generatedBuf + generatedLen, data, len);
		sb.strbuf_setlen(generatedLen + len);
	}
	public void strbuf_addbuf(Object sb2) {
		sb.strbuf_grow(sb2.getLen());
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		.memcpy(generatedBuf + generatedLen, generatedBuf, generatedLen);
		sb.strbuf_setlen(generatedLen + generatedLen);
	}
	public Object strbuf_join_argv(int argc, Object argv, byte delim) {
		if (!argc) {
			return ModernizedCProgram.buf.getBuf();
		} 
		ModernizedCProgram.buf.strbuf_addstr(argv);
		while (--argc) {
			ModernizedCProgram.buf.strbuf_addch(delim);
			ModernizedCProgram.buf.strbuf_addstr((++argv));
		}
		return ModernizedCProgram.buf.getBuf();
	}
	public void strbuf_addchars(int c, Object n) {
		sb.strbuf_grow(n);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		.memset(generatedBuf + generatedLen, c, n);
		sb.strbuf_setlen(generatedLen + n);
	}
	public void strbuf_addf(Object fmt) {
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		sb.strbuf_vaddf(fmt, ap);
		.__builtin_va_end(ap);
	}
	public void add_lines(Object prefix1, Object prefix2, Object buf, Object size) {
		while (size) {
			byte prefix;
			byte next = .memchr(buf, (byte)'\n', size);
			next = next ? (next + 1) : (buf + size);
			ModernizedCProgram.prefix = ((prefix2 && (buf[0] == (byte)'\n' || buf[0] == (byte)'\t')) ? prefix2 : prefix1);
			out.strbuf_addstr(ModernizedCProgram.prefix);
			out.strbuf_add(buf, next - buf);
			size -= next - buf;
			buf = next;
		}
		out.strbuf_complete_line();
	}
	public void strbuf_add_commented_lines(Object buf, Object size) {
		byte[] prefix1 = new byte[3];
		byte[] prefix2 = new byte[2];
		if (prefix1[0] != ModernizedCProgram.comment_line_char) {
			ModernizedCProgram.xsnprintf(prefix1, , "%c ", ModernizedCProgram.comment_line_char);
			ModernizedCProgram.xsnprintf(prefix2, , "%c", ModernizedCProgram.comment_line_char);
		} 
		out.add_lines(prefix1, prefix2, buf, size);
	}
	public void strbuf_commented_addf(Object fmt) {
		va_list params = new va_list();
		strbuf buf = new strbuf(, , );
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		int incomplete_line = generatedLen && generatedBuf[generatedLen - 1] != (byte)'\n';
		.__builtin_va_start(params, fmt);
		buf.strbuf_vaddf(fmt, params);
		.__builtin_va_end(params);
		sb.strbuf_add_commented_lines(generatedBuf, generatedLen);
		if (incomplete_line) {
			generatedBuf[--generatedLen] = (byte)'\0';
		} 
		buf.strbuf_release();
	}
	public void strbuf_vaddf(Object fmt, Object ap) {
		int len;
		va_list cp = new va_list();
		if (!ModernizedCProgram.strbuf_avail(sb)) {
			sb.strbuf_grow(64);
		} 
		.__builtin_va_copy(cp, ap);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		Object generatedAlloc = this.getAlloc();
		len = .vsnprintf(generatedBuf + generatedLen, generatedAlloc - generatedLen, fmt, cp);
		.__builtin_va_end(cp);
		if (len < 0) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\strbuf.c", 397, "your vsnprintf is broken (returned %d)", len);
		} 
		if (len > ModernizedCProgram.strbuf_avail(sb)) {
			sb.strbuf_grow(len);
			len = .vsnprintf(generatedBuf + generatedLen, generatedAlloc - generatedLen, fmt, ap);
			if (len > ModernizedCProgram.strbuf_avail(sb)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\strbuf.c", 402, "your vsnprintf is broken (insatiable)");
			} 
		} 
		sb.strbuf_setlen(generatedLen + len);
	}
	public void strbuf_expand(Object format, Object fn, Object context) {
		for (; ; ) {
			byte percent;
			size_t consumed = new size_t();
			percent = ModernizedCProgram.gitstrchrnul(format, (byte)'%');
			sb.strbuf_add(format, percent - format);
			if (!percent) {
				break;
			} 
			format = percent + 1;
			if (format == (byte)'%') {
				sb.strbuf_addch((byte)'%');
				format++;
				continue;
			} 
			consumed = .fn(sb, format, context);
			if (consumed) {
				format += consumed;
			} else {
					sb.strbuf_addch((byte)'%');
			} 
		}
	}
	public Object strbuf_expand_literal_cb(Object placeholder, Object context) {
		int ch;
		switch (placeholder[0]) {
		case (byte)'x':
				ch = ModernizedCProgram.hex2chr(placeholder + /* %x00 == NUL, %x0a == LF, etc. */1);
				if (ch < 0) {
					return 0;
				} 
				sb.strbuf_addch(ch);
				return 3;
		case /* newline */(byte)'n':
				sb.strbuf_addch((byte)'\n');
				return 1;
		}
		return 0;
	}
	public Object strbuf_expand_dict_cb(Object placeholder, Object context) {
		strbuf_expand_dict_entry e = context;
		size_t len = new size_t();
		Object generatedPlaceholder = e.getPlaceholder();
		Object generatedValue = e.getValue();
		for (; generatedPlaceholder && (len = .strlen(generatedPlaceholder)); e++) {
			if (!.strncmp(placeholder, generatedPlaceholder, len)) {
				if (generatedValue) {
					sb.strbuf_addstr(generatedValue);
				} 
				return len;
			} 
		}
		return 0;
	}
	public void strbuf_addbuf_percentquote(Object src) {
		size_t i = new size_t();
		size_t len = src.getLen();
		for (i = 0; i < len; i++) {
			if (src.getBuf()[i] == (byte)'%') {
				dst.strbuf_addch((byte)'%');
			} 
			dst.strbuf_addch(src.getBuf()[i]);
		}
	}
	public Object strbuf_read(int fd, Object hint) {
		Object generatedLen = this.getLen();
		size_t oldlen = generatedLen;
		Object generatedAlloc = this.getAlloc();
		size_t oldalloc = generatedAlloc;
		sb.strbuf_grow(hint ? hint : 8192);
		byte generatedBuf = this.getBuf();
		for (; ; ) {
			ssize_t want = generatedAlloc - generatedLen - 1;
			ssize_t got = ModernizedCProgram.read_in_full(fd, generatedBuf + generatedLen, want);
			if (got < 0) {
				if (oldalloc == 0) {
					sb.strbuf_release();
				} else {
						sb.strbuf_setlen(oldlen);
				} 
				return -1;
			} 
			generatedLen += got;
			if (got < want) {
				break;
			} 
			sb.strbuf_grow(8192);
		}
		generatedBuf[generatedLen] = (byte)'\0';
		return generatedLen - oldlen;
	}
	public Object strbuf_read_once(int fd, Object hint) {
		Object generatedAlloc = this.getAlloc();
		size_t oldalloc = generatedAlloc;
		ssize_t cnt = new ssize_t();
		sb.strbuf_grow(hint ? hint : 8192);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		cnt = ModernizedCProgram.xread(fd, generatedBuf + generatedLen, generatedAlloc - generatedLen - 1);
		if (cnt > 0) {
			sb.strbuf_setlen(generatedLen + cnt);
		}  else if (oldalloc == 0) {
			sb.strbuf_release();
		} 
		return cnt;
	}
	public int strbuf_readlink(Object path, Object hint) {
		Object generatedAlloc = this.getAlloc();
		size_t oldalloc = generatedAlloc;
		if (hint < 32) {
			hint = 32;
		} 
		byte generatedBuf = this.getBuf();
		while (hint < (2 * 260)) {
			ssize_t len = new ssize_t();
			sb.strbuf_grow(hint);
			ModernizedCProgram.len = ModernizedCProgram.readlink(path, generatedBuf, hint);
			if (ModernizedCProgram.len < 0) {
				if ((._errno()) != 34) {
					break;
				} 
			}  else if (ModernizedCProgram.len < hint) {
				sb.strbuf_setlen(ModernizedCProgram.len);
				return 0;
			} 
			hint *= /* .. the buffer was too small - try again */2;
		}
		if (oldalloc == 0) {
			sb.strbuf_release();
		} 
		return -1;
	}
	public int strbuf_getcwd() {
		Object generatedAlloc = this.getAlloc();
		size_t oldalloc = generatedAlloc;
		size_t guessed_len = 128;
		byte generatedBuf = this.getBuf();
		for (; ; guessed_len *= 2) {
			sb.strbuf_grow(guessed_len);
			if (.getcwd(generatedBuf, generatedAlloc)) {
				sb.strbuf_setlen(.strlen(generatedBuf));
				return 0/*
						 * If getcwd(3) is implemented as a syscall that falls
						 * back to a regular lookup using readdir(3) etc. then
						 * we may be able to avoid EACCES by providing enough
						 * space to the syscall as it's not necessarily bound
						 * to the same restrictions as the fallback.
						 */;
			} 
			if ((._errno()) == 13 && guessed_len < 260) {
				continue;
			} 
			if ((._errno()) != 34) {
				break;
			} 
		}
		if (oldalloc == 0) {
			sb.strbuf_release();
		} else {
				sb.strbuf_setlen(0);
		} 
		return -1;
	}
	public int strbuf_getwholeline_fd(int fd, int term) {
		sb.strbuf_setlen(0);
		while (1) {
			byte ch;
			ssize_t len = ModernizedCProgram.xread(fd, ch, 1);
			if (ModernizedCProgram.len <= 0) {
				return (true);
			} 
			sb.strbuf_addch(ch);
			if (ch == term) {
				break;
			} 
		}
		return 0;
	}
	public Object strbuf_read_file(Object path, Object hint) {
		int fd;
		ssize_t len = new ssize_t();
		int saved_errno;
		fd = .open(path, 0);
		if (fd < 0) {
			return -1;
		} 
		len = sb.strbuf_read(fd, hint);
		saved_errno = (._errno());
		.close(fd);
		if (len < 0) {
			(._errno()) = saved_errno;
			return -1;
		} 
		return len;
	}
	public void strbuf_add_lines(Object prefix, Object buf, Object size) {
		out.add_lines(prefix, ((Object)0), buf, size);
	}
	public void strbuf_addstr_xml_quoted(Object s) {
		while (s) {
			size_t len = .strcspn(s, "\"<>&");
			ModernizedCProgram.buf.strbuf_add(s, ModernizedCProgram.len);
			s += ModernizedCProgram.len;
			switch (s) {
			case (byte)'&':
					ModernizedCProgram.buf.strbuf_addstr("&amp;");
					break;
			case (byte)'"':
					ModernizedCProgram.buf.strbuf_addstr("&quot;");
					break;
			case (byte)'>':
					ModernizedCProgram.buf.strbuf_addstr("&gt;");
					break;
			case 0:
					return ;
			case (byte)'<':
					ModernizedCProgram.buf.strbuf_addstr("&lt;");
					break;
			}
			s++;
		}
	}
	public void strbuf_add_urlencode(Object s, Object len, Object allow_unencoded_fn) {
		sb.strbuf_grow(len);
		while (len--) {
			byte ch = s++;
			if (.allow_unencoded_fn(ch)) {
				sb.strbuf_addch(ch);
			} else {
					sb.strbuf_addf("%%%02x", (byte)ch);
			} 
		}
	}
	public void strbuf_addstr_urlencode(Object s, Object allow_unencoded_fn) {
		sb.strbuf_add_urlencode(s, .strlen(s), allow_unencoded_fn);
	}
	public void strbuf_humanise(Object bytes, int humanise_rate) {
		if (bytes > 1 << 30) {
			ModernizedCProgram.buf.strbuf_addf(humanise_rate == 0 ? ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 gibibyte */"%u.%2.2u GiB") : ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 gibibyte/second */"%u.%2.2u GiB/s"), (int)(bytes >> 30), (int)(bytes & ((1 << 30) - 1)) / 10737419);
		}  else if (bytes > 1 << 20) {
			int x = bytes + /* for rounding */5243;
			ModernizedCProgram.buf.strbuf_addf(humanise_rate == 0 ? ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 mebibyte */"%u.%2.2u MiB") : ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 mebibyte/second */"%u.%2.2u MiB/s"), x >> 20, ((x & ((1 << 20) - 1)) * 100) >> 20);
		}  else if (bytes > 1 << 10) {
			int x = bytes + /* for rounding */5;
			ModernizedCProgram.buf.strbuf_addf(humanise_rate == 0 ? ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 kibibyte */"%u.%2.2u KiB") : ModernizedCProgram._(/* TRANSLATORS: IEC 80000-13:2008 kibibyte/second */"%u.%2.2u KiB/s"), x >> 10, ((x & ((1 << 10) - 1)) * 100) >> 10);
		} else {
				ModernizedCProgram.buf.strbuf_addf(humanise_rate == 0 ? ModernizedCProgram.Q_("%u byte", "%u bytes", (int)/* TRANSLATORS: IEC 80000-13:2008 byte */bytes) : ModernizedCProgram.Q_("%u byte/s", "%u bytes/s", (int)/* TRANSLATORS: IEC 80000-13:2008 byte/second */bytes), (int)bytes);
		} 
	}
	public void strbuf_humanise_bytes(Object bytes) {
		ModernizedCProgram.buf.strbuf_humanise(bytes, 0);
	}
	public void strbuf_humanise_rate(Object bytes) {
		ModernizedCProgram.buf.strbuf_humanise(bytes, 1);
	}
	public void strbuf_add_absolute_path(Object path) {
		if (!path) {
			ModernizedCProgram.die("The empty string is not a valid path");
		} 
		Object generatedLen = this.getLen();
		Object generatedSt_dev = cwd_stat.getSt_dev();
		Object generatedSt_ino = cwd_stat.getSt_ino();
		byte generatedBuf = this.getBuf();
		if (!ModernizedCProgram.is_absolute_path(path)) {
			stat cwd_stat = new stat();
			stat pwd_stat = new stat();
			size_t orig_len = generatedLen;
			byte cwd = ModernizedCProgram.xgetcwd();
			byte pwd = .getenv("PWD");
			if (pwd && .strcmp(pwd, cwd) && !.stat(cwd, cwd_stat) && (generatedSt_dev || generatedSt_ino) && !.stat(pwd, pwd_stat) && generatedSt_dev == generatedSt_dev && generatedSt_ino == generatedSt_ino) {
				sb.strbuf_addstr(pwd);
			} else {
					sb.strbuf_addstr(cwd);
			} 
			if (generatedLen > orig_len && !ModernizedCProgram.git_is_dir_sep(generatedBuf[generatedLen - 1])) {
				sb.strbuf_addch((byte)'/');
			} 
			ModernizedCProgram.free(cwd);
		} 
		sb.strbuf_addstr(path);
	}
	public void strbuf_add_real_path(Object path) {
		Object generatedLen = this.getLen();
		if (generatedLen) {
			strbuf resolved = new strbuf(, , );
			resolved.strbuf_realpath(path, 1);
			sb.strbuf_addbuf(resolved);
			resolved.strbuf_release();
		} else {
				sb.strbuf_realpath(path, 1);
		} 
	}
	public void strbuf_addftime(Object fmt, Object tm, int tz_offset, int suppress_tz_name) {
		strbuf munged_fmt = new strbuf(, , );
		size_t hint = 128;
		size_t len = new size_t();
		if (!fmt) {
			return ;
		} 
		for (; ; ) {
			byte percent = ModernizedCProgram.gitstrchrnul(fmt, (byte)'%');
			munged_fmt.strbuf_add(fmt, percent - fmt);
			if (!percent) {
				break;
			} 
			fmt = percent + 1;
			switch (fmt) {
			case (byte)'%':
					munged_fmt.strbuf_addstr("%%");
					fmt++;
					break;
			case (byte)'z':
					munged_fmt.strbuf_addf("%+05d", tz_offset);
					fmt++;
					break;
			case (byte)'Z':
					if (suppress_tz_name) {
						fmt++;
						break;
					} 
			default:
					munged_fmt.strbuf_addch((byte)'%');
			}
		}
		byte generatedBuf = munged_fmt.getBuf();
		fmt = generatedBuf;
		sb.strbuf_grow(hint);
		Object generatedLen = this.getLen();
		Object generatedAlloc = this.getAlloc();
		len = .strftime(generatedBuf + generatedLen, generatedAlloc - generatedLen, fmt, tm);
		if (!len/*
				 * strftime reports "0" if it could not fit the result in the buffer.
				 * Unfortunately, it also reports "0" if the requested time string
				 * takes 0 bytes. So our strategy is to munge the format so that the
				 * output contains at least one character, and then drop the extra
				 * character before returning.
				 */) {
			munged_fmt.strbuf_addch((byte)' ');
			while (!len) {
				hint *= 2;
				sb.strbuf_grow(hint);
				len = .strftime(generatedBuf + generatedLen, generatedAlloc - generatedLen, generatedBuf, tm);
			}
			/* drop munged space */len--;
		} 
		munged_fmt.strbuf_release();
		sb.strbuf_setlen(generatedLen + len);
	}
	public void strbuf_add_unique_abbrev(Object oid, int abbrev_len) {
		int r;
		sb.strbuf_grow((2 * 32) + 1);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		r = ModernizedCProgram.the_repository.repo_find_unique_abbrev_r(generatedBuf + generatedLen, oid, abbrev_len);
		sb.strbuf_setlen(generatedLen + r/*
		 * Returns the length of a line, without trailing spaces.
		 *
		 * If the line ends with newline, it will be removed too.
		 */);
	}
	public void strbuf_stripspace(int skip_comments) {
		size_t empties = 0;
		size_t i = new size_t();
		size_t j = new size_t();
		size_t len = new size_t();
		size_t newlen = new size_t();
		byte eol;
		sb.strbuf_grow(/* We may have to add a newline. */1);
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		for (i = j = 0; i < generatedLen; ) {
			eol = .memchr(generatedBuf + i, (byte)'\n', generatedLen - i);
			len = eol ? eol - (generatedBuf + i) + 1 : generatedLen - i;
			if (skip_comments && len && generatedBuf[i] == ModernizedCProgram.comment_line_char) {
				newlen = 0;
				continue;
			} 
			newlen = ModernizedCProgram.cleanup(generatedBuf + i, len);
			if (/* Not just an empty line? */newlen) {
				if (empties > 0 && j > 0) {
					generatedBuf[j++] = (byte)'\n';
				} 
				empties = 0;
				.memmove(generatedBuf + j, generatedBuf + i, newlen);
				generatedBuf[newlen + j++] = (byte)'\n';
			} else {
					empties++;
			} 
		}
		sb.strbuf_setlen(j);
	}
	public int strbuf_normalize_path() {
		strbuf dst = new strbuf(, , );
		Object generatedLen = this.getLen();
		dst.strbuf_grow(generatedLen);
		byte generatedBuf = dst.getBuf();
		if (ModernizedCProgram.normalize_path_copy(generatedBuf, generatedBuf) < 0) {
			dst.strbuf_release();
			return -1/*
				 * normalize_path does not tell us the new length, so we have to
				 * compute it by looking for the new NUL it placed
				 */;
		} 
		dst.strbuf_setlen(.strlen(generatedBuf));
		src.strbuf_swap(dst);
		dst.strbuf_release();
		return 0;
	}
	public int unlink_or_msg(Object file) {
		int rc = .unlink(file);
		((ModernizedCProgram.err) ? (Object)0 : ._assert("err", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wrapper.c", 545));
		if (!rc || (._errno()) == 2) {
			return 0;
		} 
		ModernizedCProgram.err.strbuf_addf("unable to unlink '%s': %s", file, .strerror((._errno())));
		return -1;
	}
	public int read_state_file(Object state, Object file, int trim) {
		sb.strbuf_setlen(0);
		Object generatedLen = this.getLen();
		if (sb.strbuf_read_file(ModernizedCProgram.am_path(state, file), 0) >= 0) {
			if (trim) {
				sb.strbuf_trim();
			} 
			return generatedLen;
		} 
		if ((._errno()) == 2) {
			return -1;
		} 
		ModernizedCProgram.die_errno(ModernizedCProgram._("could not read '%s'"), ModernizedCProgram.am_path(state, file/**
		 * Reads and parses the state directory's "author-script" file, and sets
		 * state->author_name, state->author_email and state->author_date accordingly.
		 * Returns 0 on success, -1 if the file could not be parsed.
		 *
		 * The author script is of the format:
		 *
		 *	GIT_AUTHOR_NAME='$author_name'
		 *	GIT_AUTHOR_EMAIL='$author_email'
		 *	GIT_AUTHOR_DATE='$author_date'
		 *
		 * where $author_name, $author_email and $author_date are quoted. We are strict
		 * with our parsing, as the file was meant to be eval'd in the old git-am.sh
		 * script, and thus if the file differs from what this function expects, it is
		 * better to bail out than to do something that the user does not expect.
		 */));
	}
	public void expand_atom(Object atom, int len, Object vdata) {
		expand_data data = vdata;
		int generatedMark_query = data.getMark_query();
		object_id generatedOid = data.getOid();
		object_type generatedType = data.getType();
		object_info generatedInfo = data.getInfo();
		long generatedSize = data.getSize();
		Object generatedDisk_size = data.getDisk_size();
		Object generatedRest = data.getRest();
		object_id generatedDelta_base_oid = data.getDelta_base_oid();
		Object generatedHash = generatedDelta_base_oid.getHash();
		if (ModernizedCProgram.is_atom("objectname", atom, len)) {
			if (!generatedMark_query) {
				sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(generatedOid));
			} 
		}  else if (ModernizedCProgram.is_atom("objecttype", atom, len)) {
			if (generatedMark_query) {
				generatedInfo.setTypep(generatedType);
			} else {
					sb.strbuf_addstr(ModernizedCProgram.type_name(generatedType));
			} 
		}  else if (ModernizedCProgram.is_atom("objectsize", atom, len)) {
			if (generatedMark_query) {
				generatedInfo.setSizep(generatedSize);
			} else {
					sb.strbuf_addf("%llu", (uintmax_t)generatedSize);
			} 
		}  else if (ModernizedCProgram.is_atom("objectsize:disk", atom, len)) {
			if (generatedMark_query) {
				generatedInfo.setDisk_sizep(generatedDisk_size);
			} else {
					sb.strbuf_addf("%llu", (uintmax_t)generatedDisk_size);
			} 
		}  else if (ModernizedCProgram.is_atom("rest", atom, len)) {
			if (generatedMark_query) {
				data.setSplit_on_whitespace(1);
			}  else if (generatedRest) {
				sb.strbuf_addstr(generatedRest);
			} 
		}  else if (ModernizedCProgram.is_atom("deltabase", atom, len)) {
			if (generatedMark_query) {
				generatedInfo.setDelta_base_sha1(generatedHash);
			} else {
					sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(generatedDelta_base_oid));
			} 
		} else {
				ModernizedCProgram.die("unknown format element: %.*s", len, atom);
		} 
	}
	public Object expand_format(Object start, Object data) {
		byte end;
		if (start != (byte)'(') {
			return 0;
		} 
		end = .strchr(start + 1, (byte)')');
		if (!end) {
			ModernizedCProgram.die("format element '%s' does not end in ')'", start);
		} 
		sb.expand_atom(start + 1, end - start - 1, data);
		return end - start + 1;
	}
	public int parse_force_date(Object in) {
		out.strbuf_addch((byte)'@');
		if (out.parse_date(in) < 0) {
			int errors = 0;
			long t = ModernizedCProgram.approxidate_careful(in, errors);
			if (errors) {
				return -1;
			} 
			out.strbuf_addf("%lu", t);
		} 
		return 0;
	}
	public void determine_author_info() {
		byte name;
		byte email;
		byte date;
		ident_split author = new ident_split();
		name = ModernizedCProgram.xstrdup_or_null(.getenv("GIT_AUTHOR_NAME"));
		email = ModernizedCProgram.xstrdup_or_null(.getenv("GIT_AUTHOR_EMAIL"));
		date = ModernizedCProgram.xstrdup_or_null(.getenv("GIT_AUTHOR_DATE"));
		Object generatedName_begin = ident.getName_begin();
		Object generatedName_end = ident.getName_end();
		Object generatedMail_begin = ident.getMail_begin();
		Object generatedMail_end = ident.getMail_end();
		Object generatedDate_begin = ident.getDate_begin();
		Object generatedDate_end = ident.getDate_end();
		Object generatedTz_begin = ident.getTz_begin();
		Object generatedTz_end = ident.getTz_end();
		if (ModernizedCProgram.author_message) {
			ident_split ident = new ident_split();
			size_t len = new size_t();
			byte a;
			a = .find_commit_header(ModernizedCProgram.author_message_buffer, "author", ModernizedCProgram.len);
			if (!a) {
				ModernizedCProgram.die(ModernizedCProgram._("commit '%s' lacks author header"), ModernizedCProgram.author_message);
			} 
			if (ident.split_ident_line(a, ModernizedCProgram.len) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("commit '%s' has malformed author line"), ModernizedCProgram.author_message);
			} 
			ModernizedCProgram.set_ident_var(name, ModernizedCProgram.xmemdupz(generatedName_begin, generatedName_end - generatedName_begin));
			ModernizedCProgram.set_ident_var(email, ModernizedCProgram.xmemdupz(generatedMail_begin, generatedMail_end - generatedMail_begin));
			if (generatedDate_begin) {
				strbuf date_buf = new strbuf(, , );
				date_buf.strbuf_addch((byte)'@');
				date_buf.strbuf_add(generatedDate_begin, generatedDate_end - generatedDate_begin);
				date_buf.strbuf_addch((byte)' ');
				date_buf.strbuf_add(generatedTz_begin, generatedTz_end - generatedTz_begin);
				ModernizedCProgram.set_ident_var(date, date_buf.strbuf_detach(((Object)0)));
			} 
		} 
		if (ModernizedCProgram.force_author) {
			ident_split ident = new ident_split();
			if (ident.split_ident_line(ModernizedCProgram.force_author, .strlen(ModernizedCProgram.force_author)) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("malformed --author parameter"));
			} 
			ModernizedCProgram.set_ident_var(name, ModernizedCProgram.xmemdupz(generatedName_begin, generatedName_end - generatedName_begin));
			ModernizedCProgram.set_ident_var(email, ModernizedCProgram.xmemdupz(generatedMail_begin, generatedMail_end - generatedMail_begin));
		} 
		if (ModernizedCProgram.force_date) {
			strbuf date_buf = new strbuf(, , );
			if (date_buf.parse_force_date(ModernizedCProgram.force_date)) {
				ModernizedCProgram.die(ModernizedCProgram._("invalid date format: %s"), ModernizedCProgram.force_date);
			} 
			ModernizedCProgram.set_ident_var(date, date_buf.strbuf_detach(((Object)0)));
		} 
		author_ident.strbuf_addstr(ModernizedCProgram.fmt_ident(name, email, want_ident.WANT_AUTHOR_IDENT, date, 1));
		author.assert_split_ident(author_ident);
		ModernizedCProgram.export_one("GIT_AUTHOR_NAME", generatedName_begin, generatedName_end, 0);
		ModernizedCProgram.export_one("GIT_AUTHOR_EMAIL", generatedMail_begin, generatedMail_end, 0);
		ModernizedCProgram.export_one("GIT_AUTHOR_DATE", generatedDate_begin, generatedTz_end, (byte)'@');
		ModernizedCProgram.free(name);
		ModernizedCProgram.free(email);
		ModernizedCProgram.free(date);
	}
	/* removes the last path component from 'path' except if 'path' is root */
	public void strip_last_component() {
		size_t offset = ModernizedCProgram.git_offset_1st_component(ModernizedCProgram.path.getBuf());
		size_t len = ModernizedCProgram.path.getLen();
		while (offset < len && !ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.path.getBuf()[len - /* Find start of the last component */1])) {
			len--;
		}
		while (offset < len && ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.path.getBuf()[len - /* Skip sequences of multiple path-separators */1])) {
			len--;
		}
		ModernizedCProgram.path.strbuf_setlen(len);
	}
	/* get (and remove) the next component in 'remaining' and place it in 'next' */
	public void get_next_component(strbuf remaining) {
		byte start = ((Object)0);
		byte end = ((Object)0);
		next.strbuf_setlen(0);
		byte generatedBuf = remaining.getBuf();
		for (start = generatedBuf; ModernizedCProgram.git_is_dir_sep(start); /* look for the next component *//* Skip sequences of multiple path-separators */start++) {
			;
		}
		for (end = start; end && !ModernizedCProgram.git_is_dir_sep(end); /* Find end of the path component */end++) {
			;
		}
		next.strbuf_add(start, end - start);
		remaining.strbuf_remove(0, end - generatedBuf);
	}
	/* copies root part from remaining to resolved, canonicalizing it on the way */
	public void get_root_part(strbuf remaining) {
		byte generatedBuf = remaining.getBuf();
		int offset = ModernizedCProgram.git_offset_1st_component(generatedBuf);
		resolved.strbuf_setlen(0);
		resolved.strbuf_add(generatedBuf, offset);
		ModernizedCProgram.convert_slashes(generatedBuf);
		remaining.strbuf_remove(0, offset/* We allow "recursive" symbolic links. Only within reason, though. */);
	}
	/*
	 * Return the real path (i.e., absolute path, with symlinks resolved
	 * and extra slashes removed) equivalent to the specified path.  (If
	 * you want an absolute path but don't mind links, use
	 * absolute_path().)  Places the resolved realpath in the provided strbuf.
	 *
	 * The directory part of path (i.e., everything up to the last
	 * dir_sep) must denote a valid, existing directory, but the last
	 * component need not exist.  If die_on_error is set, then die with an
	 * informative error message if there is a problem.  Otherwise, return
	 * NULL on errors (without generating any output).
	 */
	public Byte strbuf_realpath(Object path, int die_on_error) {
		strbuf remaining = new strbuf(, , );
		strbuf next = new strbuf(, , );
		strbuf symlink = new strbuf(, , );
		byte retval = ((Object)0);
		int num_symlinks = 0;
		stat st = new stat();
		if (!path) {
			if (die_on_error) {
				ModernizedCProgram.die("The empty string is not a valid path");
			} else {
					;
			} 
		} 
		remaining.strbuf_addstr(path);
		resolved.get_root_part(remaining);
		Object generatedLen = this.getLen();
		if (!generatedLen) {
			if (/* relative path; can use CWD as the initial resolved path */resolved.strbuf_getcwd()) {
				if (die_on_error) {
					ModernizedCProgram.die_errno("unable to get current working directory");
				} else {
						;
				} 
			} 
		} 
		byte generatedBuf = next.getBuf();
		Object generatedSt_mode = st.getSt_mode();
		Object generatedSt_size = st.getSt_size();
		while (generatedLen > /* Iterate over the remaining path components */0) {
			next.get_next_component(remaining);
			if (generatedLen == 0) {
				continue;
			}  else if (generatedLen == 1 && !.strcmp(generatedBuf, ".")) {
				continue;
			}  else if (generatedLen == 2 && !.strcmp(generatedBuf, "..")) {
				/* '..' component; strip the last path component */resolved.strip_last_component();
				continue;
			} 
			if (!ModernizedCProgram.git_is_dir_sep(generatedBuf[generatedLen - /* append the next component and resolve resultant path */1])) {
				resolved.strbuf_addch((byte)'/');
			} 
			resolved.strbuf_addbuf(next);
			if (.lstat(generatedBuf, st)) {
				if ((._errno()) != 2 || generatedLen) {
					if (die_on_error) {
						ModernizedCProgram.die_errno("Invalid path '%s'", generatedBuf);
					} else {
							;
					} 
				} 
			}  else if (.S_ISLNK(generatedSt_mode)) {
				ssize_t len = new ssize_t();
				symlink.strbuf_setlen(0);
				if (num_symlinks++ > 32) {
					(._errno()) = ELOOP;
					if (die_on_error) {
						ModernizedCProgram.die("More than %d nested symlinks on path '%s'", 32, path);
					} else {
							;
					} 
				} 
				ModernizedCProgram.len = symlink.strbuf_readlink(generatedBuf, generatedSt_size);
				if (ModernizedCProgram.len < 0) {
					if (die_on_error) {
						ModernizedCProgram.die_errno("Invalid symlink '%s'", generatedBuf);
					} else {
							;
					} 
				} 
				if (ModernizedCProgram.is_absolute_path(generatedBuf)) {
					resolved.get_root_part(/* absolute symlink; set resolved to root */symlink/*
									 * relative symlink
									 * strip off the last component since it will
									 * be replaced with the contents of the symlink
									 */);
				} else {
						resolved/*
									 * if there are still remaining components to resolve
									 * then append them to symlink
									 */.strip_last_component();
				} 
				if (generatedLen) {
					symlink.strbuf_addch((byte)'/');
					symlink.strbuf_addbuf(remaining/*
								 * use the symlink as the remaining components that
								 * need to be resolved
								 */);
				} 
				symlink.strbuf_swap(remaining);
			} 
		}
		retval = generatedBuf;
		next.strbuf_release();
		symlink.strbuf_release();
		if (!retval) {
			resolved.strbuf_setlen(0);
		} 
		return retval/*
		 * Resolve `path` into an absolute, cleaned-up path. The return value
		 * comes from a shared buffer.
		 */;
	}
	public Object parse_arg(Object next) {
		if (next == (byte)'"') {
			byte orig = next;
			if (arg.unquote_c_style(next, next)) {
				ModernizedCProgram.die("badly quoted argument: %s", orig);
			} 
			if (next && !((ModernizedCProgram.sane_ctype[(byte)(next)] & (true)) != 0)) {
				ModernizedCProgram.die("unexpected character after quoted argument: %s", orig);
			} 
		} else {
				while (next && !((ModernizedCProgram.sane_ctype[(byte)(next)] & (true)) != 0)) {
					arg.strbuf_addch(next++);
				}
		} 
		return next/*
		 * Parse the reference name immediately after "command SP".  If not
		 * -z, then handle C-quoting.  Return a pointer to a newly allocated
		 * string containing the name of the reference, or NULL if there was
		 * an error.  Update *next to point at the character that terminates
		 * the argument.  Die if C-quoting is malformed or the reference name
		 * is invalid.
		 */;
	}
	public Byte parse_refname(Object next) {
		strbuf ref = new strbuf(, , );
		Object generatedLen = ref.getLen();
		if (ModernizedCProgram.line_termination) {
			next = /* Without -z, use the next argument */ref.parse_arg(next);
		} else {
				ref.strbuf_addstr(/* With -z, use everything up to the next NUL */next);
				next += generatedLen;
		} 
		if (!generatedLen) {
			ref.strbuf_release();
			return ((Object)0);
		} 
		byte generatedBuf = ref.getBuf();
		if (ModernizedCProgram.check_refname_format(generatedBuf, 1)) {
			ModernizedCProgram.die("invalid ref format: %s", generatedBuf);
		} 
		return ref.strbuf_detach(((Object)0/*
		 * The value being parsed is <oldvalue> (as opposed to <newvalue>; the
		 * difference affects which error messages are generated):
		 */));
	}
	public Object parse_cmd_option(Object next) {
		byte rest;
		if (ModernizedCProgram.skip_prefix(next, "no-deref", rest) && rest == ModernizedCProgram.line_termination) {
			ModernizedCProgram.update_flags |=  (1 << 0);
		} else {
				ModernizedCProgram.die("option unknown: %s", next);
		} 
		return rest;
	}
	public void maybe_colorize_sideband(Object src, int n) {
		int i;
		if (!ModernizedCProgram.want_color_fd(2, (ModernizedCProgram.use_sideband_colors()))) {
			dest.strbuf_add(src, n);
			return ;
		} 
		while (0 < n && ((ModernizedCProgram.sane_ctype[(byte)(src)] & (true)) != 0)) {
			dest.strbuf_addch(src);
			src++;
			n--;
		}
		Object generatedKeyword = p.getKeyword();
		Object generatedColor = p.getColor();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			keyword_entry p = ModernizedCProgram.keywords + i;
			int len = .strlen(generatedKeyword);
			if (n < ModernizedCProgram.len) {
				continue;
			} 
			if (!.strncasecmp(generatedKeyword, src, ModernizedCProgram.len) && (ModernizedCProgram.len == n || !((ModernizedCProgram.sane_ctype[(byte)(src[ModernizedCProgram.len])] & (-1024 | -1024)) != 0))) {
				dest.strbuf_addstr(generatedColor);
				dest.strbuf_add(src, ModernizedCProgram.len);
				dest.strbuf_addstr("\033[m");
				n -= ModernizedCProgram.len;
				src += ModernizedCProgram.len;
				break;
			} 
		}
		dest.strbuf_add(src, n);
	}
	public int demultiplex_sideband(Object me, Byte buf, int len, int die_on_error, sideband_type sideband_type) {
		byte suffix;
		byte b;
		byte brk;
		int band;
		if (!suffix) {
			if (.isatty(2) && !ModernizedCProgram.is_terminal_dumb()) {
				suffix = "\033[K";
			} else {
					suffix = "        ";
			} 
		} 
		if (len == 0) {
			sideband_type = sideband_type.SIDEBAND_FLUSH;
			;
		} 
		Object generatedLen = this.getLen();
		if (len < 1) {
			scratch.strbuf_addf("%s%s: protocol error: no band designator", generatedLen ? "\n" : "", me);
			sideband_type = sideband_type.SIDEBAND_PROTOCOL_ERROR;
			;
		} 
		band = buf[0] & -1024;
		buf[len] = (byte)'\0';
		len--;
		byte generatedBuf = this.getBuf();
		switch (band) {
		case 2:
				b = buf + 1/*
						 * Append a suffix to each nonempty line to clear the
						 * end of the screen line.
						 *
						 * The output is accumulated in a buffer and
						 * each line is printed to stderr using
						 * write(2) to ensure inter-process atomicity.
						 */;
				while ((brk = .strpbrk(b, "\n\r"))) {
					int linelen = brk - b;
					if (!generatedLen) {
						scratch.strbuf_addstr("remote: ");
					} 
					if (linelen > 0) {
						scratch.maybe_colorize_sideband(b, linelen);
						scratch.strbuf_addstr(suffix);
					} 
					scratch.strbuf_addch(brk);
					ModernizedCProgram.xwrite(2, generatedBuf, generatedLen);
					scratch.strbuf_setlen(0);
					b = brk + 1;
				}
				if (b) {
					scratch.strbuf_addstr(generatedLen ? "" : "remote: ");
					scratch.maybe_colorize_sideband(b, .strlen(b));
				} 
				return 0;
		case 3:
				if (die_on_error) {
					ModernizedCProgram.die("remote error: %s", buf + 1);
				} 
				scratch.strbuf_addf("%s%s", generatedLen ? "\n" : "", "remote: ");
				scratch.maybe_colorize_sideband(buf + 1, len);
				sideband_type = sideband_type.SIDEBAND_REMOTE_ERROR;
				break;
		case 1:
				sideband_type = sideband_type.SIDEBAND_PRIMARY;
				break;
		default:
				scratch.strbuf_addf("%s%s: protocol error: bad band #%d", generatedLen ? "\n" : "", me, band);
				sideband_type = sideband_type.SIDEBAND_PROTOCOL_ERROR;
				break;
		}
		if (generatedLen) {
			scratch.strbuf_addch((byte)'\n');
			ModernizedCProgram.xwrite(2, generatedBuf, generatedLen);
		} 
		scratch.strbuf_release();
		return 1/*
		 * fd is connected to the remote side; send the sideband data
		 * over multiplexed packet stream.
		 */;
	}
	public void add_branch(Object key, Object branchname, Object remotename, int mirror) {
		tmp.strbuf_setlen(0);
		tmp.strbuf_addch((byte)'+');
		if (mirror) {
			tmp.strbuf_addf("refs/%s:refs/%s", branchname, branchname);
		} else {
				tmp.strbuf_addf("refs/heads/%s:refs/remotes/%s/%s", branchname, remotename, branchname);
		} 
		byte generatedBuf = this.getBuf();
		.git_config_set_multivar(key, generatedBuf, "^$", 0);
	}
	public Byte odb_pack_name(Object hash, Object ext) {
		ModernizedCProgram.buf.strbuf_setlen(0);
		ModernizedCProgram.buf.strbuf_addf("%s/pack/pack-%s.%s", ModernizedCProgram.get_object_directory(), ModernizedCProgram.hash_to_hex(hash), ext);
		return ModernizedCProgram.buf.getBuf();
	}
	public void wt_status_append_cut_line() {
		byte explanation = ModernizedCProgram._("Do not modify or remove the line above.\nEverything below it will be ignored.");
		ModernizedCProgram.buf.strbuf_commented_addf("%s", ModernizedCProgram.cut_line);
		ModernizedCProgram.buf.strbuf_add_commented_lines(explanation, .strlen(explanation));
	}
	public void abbrev_sha1_in_line() {
		strbuf split = new strbuf();
		int i;
		byte generatedBuf = this.getBuf();
		if (ModernizedCProgram.starts_with(generatedBuf, "exec ") || ModernizedCProgram.starts_with(generatedBuf, "x ") || ModernizedCProgram.starts_with(generatedBuf, "label ") || ModernizedCProgram.starts_with(generatedBuf, "l ")) {
			return ;
		} 
		strbuf strbuf = new strbuf();
		split = strbuf.strbuf_split_max(line, (byte)' ', 3);
		if (split[0] && split[1]) {
			object_id oid = new object_id();
			split[1].strbuf_trim();
			if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, oid)) {
				split[1].strbuf_setlen(0);
				split[1].strbuf_add_unique_abbrev(oid, ModernizedCProgram.default_abbrev);
				split[1].strbuf_addch((byte)' ');
				line.strbuf_setlen(0);
				for (i = 0; split[i]; i++) {
					line.strbuf_addbuf(split[i]);
				}
			} 
		} 
		split.strbuf_list_free();
	}
	public int odb_mkstemp(Object pattern) {
		int fd;
		/*
			 * we let the umask do its job, don't try to be more
			 * restrictive except to remove write permission.
			 */
		int mode = 444;
		temp_filename.git_path_buf("objects/%s", pattern);
		byte generatedBuf = this.getBuf();
		fd = ModernizedCProgram.git_mkstemp_mode(generatedBuf, mode);
		if (0 <= fd) {
			return fd;
		} 
		temp_filename.git_path_buf("objects/%s", /* slow path *//* some mkstemp implementations erase temp_filename on failure */pattern);
		ModernizedCProgram.safe_create_leading_directories(generatedBuf);
		return ModernizedCProgram.xmkstemp_mode(generatedBuf, mode);
	}
	/*
	 * Copyright (c) 2005, Junio C Hamano
	 */
	/*
	 * path = absolute or relative path name
	 *
	 * Remove the last path name element from path (leaving the preceding
	 * "/", if any).  If path is empty or the root directory ("/"), set
	 * path to the empty string.
	 */
	public void trim_last_path_component() {
		int i = ModernizedCProgram.path.getLen();
		while (i && ModernizedCProgram.path.getBuf()[i - 1] == /* back up past trailing slashes, if any */(byte)'/') {
			i/*
				 * then go backwards until a slash, or the beginning of the
				 * string
				 */--;
		}
		while (i && ModernizedCProgram.path.getBuf()[i - 1] != (byte)'/') {
			i--;
		}
		ModernizedCProgram.path.strbuf_setlen(i/* We allow "recursive" symbolic links. Only within reason, though */);
	}
	/*
	 * path contains a path that might be a symlink.
	 *
	 * If path is a symlink, attempt to overwrite it with a path to the
	 * real file or directory (which may or may not exist), following a
	 * chain of symlinks if necessary.  Otherwise, leave path unmodified.
	 *
	 * This is a best-effort routine.  If an error occurs, path will
	 * either be left unmodified or will name a different symlink in a
	 * symlink chain that started with the original path.
	 */
	public void resolve_symlink() {
		int depth = 5;
		strbuf link = new strbuf(, , );
		byte generatedBuf = link.getBuf();
		while (depth--) {
			if (link.strbuf_readlink(ModernizedCProgram.path.getBuf(), ModernizedCProgram.path.getLen()) < 0) {
				break;
			} 
			if (ModernizedCProgram.is_absolute_path(generatedBuf)) {
				ModernizedCProgram.path.strbuf_setlen(/* absolute path simply replaces p */0/*
							 * link is a relative path, so replace the
							 * last element of p with it.
							 */);
			} else {
					ModernizedCProgram.path.trim_last_path_component();
			} 
			ModernizedCProgram.path.strbuf_addbuf(link);
		}
		link.strbuf_setlen(0);
	}
	public void unable_to_lock_message(Object path, int err) {
		if (err == 17) {
			ModernizedCProgram.buf.strbuf_addf(ModernizedCProgram._("Unable to create '%s.lock': %s.\n\nAnother git process seems to be running in this repository, e.g.\nan editor opened by 'git commit'. Please make sure all processes\nare terminated then try again. If it still fails, a git process\nmay have crashed in this repository earlier:\nremove the file manually to continue."), ModernizedCProgram.absolute_path(path), .strerror(err));
		} else {
				ModernizedCProgram.buf.strbuf_addf(ModernizedCProgram._("Unable to create '%s.lock': %s"), ModernizedCProgram.absolute_path(path), .strerror(err));
		} 
	}
	public strbuf idiff_prefix_cb(diff_options opt, Object data) {
		return data;
	}
	public int remove_empty_directories() {
		return ModernizedCProgram.path.remove_dir_recursively(1);
	}
	/*
		 * we want to create a file but there is a directory there;
		 * if that is an empty directory (or a directory that contains
		 * only empty directories), remove them.
		 */
	public int show_one_reflog_ent(Object fn, Object cb_data) {
		object_id ooid = new object_id();
		object_id noid = new object_id();
		byte email_end;
		byte message;
		timestamp_t timestamp = new timestamp_t();
		int tz;
		byte generatedBuf = this.getBuf();
		byte p = generatedBuf;
		Object generatedLen = this.getLen();
		if (!generatedLen || generatedBuf[generatedLen - 1] != /* old SP new SP name <email> SP time TAB msg LF */(byte)'\n' || ooid.parse_oid_hex(p, p) || p++ != (byte)' ' || noid.parse_oid_hex(p, p) || p++ != (byte)' ' || !(email_end = .strchr(p, (byte)'>')) || email_end[1] != (byte)' ' || !(timestamp = .strtoumax(email_end + 2, message, 10)) || !message || message[0] != (byte)' ' || (message[1] != (byte)'+' && message[1] != (byte)'-') || !((ModernizedCProgram.sane_ctype[(byte)(message[2])] & (true)) != 0) || !((ModernizedCProgram.sane_ctype[(byte)(message[3])] & (true)) != 0) || !((ModernizedCProgram.sane_ctype[(byte)(message[4])] & (true)) != 0) || !((ModernizedCProgram.sane_ctype[(byte)(message[5])] & (true)) != 0)) {
			return /* corrupt? */0;
		} 
		email_end[1] = (byte)'\0';
		tz = .strtol(message + 1, ((Object)0), 10);
		if (message[6] != (byte)'\t') {
			message += 6;
		} else {
				message += 7;
		} 
		return .fn(ooid, noid, p, timestamp, tz, message, cb_data);
	}
	public int strbuf_addf_ret(int ret, Object fmt) {
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		sb.strbuf_vaddf(fmt, ap);
		.__builtin_va_end(ap);
		return ret;
	}
	public int parse_ref_filter_atom(Object format, Object atom, Object ep) {
		byte sp;
		byte arg;
		int i;
		int at;
		int atom_len;
		sp = atom;
		if (sp == (byte)'*' && sp < ep) {
			/* deref */sp++;
		} 
		if (ep <= sp) {
			return ModernizedCProgram.err.strbuf_addf_ret(-1, ModernizedCProgram._("malformed field name: %.*s"), (int)(ep - atom), atom);
		} 
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; /* Do we have the atom already used elsewhere? */i++) {
			int len = .strlen(used_atom[i].getName());
			if (ModernizedCProgram.len == ep - atom && !.memcmp(used_atom[i].getName(), atom, ModernizedCProgram.len)) {
				return i/*
					 * If the atom name has a colon, strip it and everything after
					 * it off - it specifies the format for this entry, and
					 * shouldn't be used for checking against the valid_atom
					 * table.
					 */;
			} 
		}
		arg = .memchr(sp, (byte)':', ep - sp);
		atom_len = (arg ? arg : ep) - sp;
		for (i = 0; i < ( /  + ( - 1)); /* Is the atom a valid one? */i++) {
			int len = .strlen(valid_atom[i].getName());
			if (ModernizedCProgram.len == atom_len && !.memcmp(valid_atom[i].getName(), sp, ModernizedCProgram.len)) {
				break;
			} 
		}
		if (( /  + ( - 1)) <= i) {
			return ModernizedCProgram.err.strbuf_addf_ret(-1, ModernizedCProgram._("unknown field name: %.*s"), (int)(ep - atom), atom);
		} 
		if (valid_atom[i].getSource() != .SOURCE_NONE && !ModernizedCProgram.have_git_dir()) {
			return ModernizedCProgram.err.strbuf_addf_ret(-1, ModernizedCProgram._("not a git repository, but the field '%.*s' requires access to object data"), (int)(ep - atom), atom);
		} 
		at = /* Add it in, including the deref prefix */ModernizedCProgram.used_atom_cnt;
		ModernizedCProgram.used_atom_cnt++;
		(used_atom) = ModernizedCProgram.xrealloc((used_atom), ModernizedCProgram.st_mult(, (ModernizedCProgram.used_atom_cnt)));
		used_atom[at].setName(ModernizedCProgram.xmemdupz(atom, ep - atom));
		used_atom[at].setType(valid_atom[i].getCmp_type());
		used_atom[at].setSource(valid_atom[i].getSource());
		Object generatedContent = oi_deref.getContent();
		object_info generatedInfo = oi_deref.getInfo();
		if (used_atom[at].getSource() == .SOURCE_OBJ) {
			if (atom == (byte)'*') {
				generatedInfo.setContentp(generatedContent);
			} else {
					generatedInfo.setContentp(generatedContent);
			} 
		} 
		if (arg) {
			arg = used_atom[at].getName() + (arg - atom) + 1;
			if (!arg/*
						 * Treat empty sub-arguments list as NULL (i.e.,
						 * "%(atom:)" is equivalent to "%(atom)").
						 */) {
				arg = ((Object)0);
			} 
		} 
		.memset(used_atom[at].getU(), 0, );
		if (valid_atom[i].getParser() && .UNRECOGNIZEDFUNCTIONNAME(format, used_atom[at], arg, ModernizedCProgram.err)) {
			return -1;
		} 
		if (atom == (byte)'*') {
			ModernizedCProgram.need_tagged = 1;
		} 
		if (!.strcmp(valid_atom[i].getName(), "symref")) {
			ModernizedCProgram.need_symref = 1;
		} 
		return at;
	}
	public void quote_formatting(Object str, int quote_style) {
		switch (quote_style) {
		case 0:
				s.strbuf_addstr(str);
				break;
		case 1:
				s.sq_quote_buf(str);
				break;
		case 4:
				s.python_quote_buf(str);
				break;
		case 2:
				s.perl_quote_buf(str);
				break;
		case 8:
				s.tcl_quote_buf(str);
				break;
		}
	}
	public void append_lines(Object buf, long size, int lines) {
		int i;
		byte sp;
		byte eol;
		size_t len = new size_t();
		sp = buf;
		for (i = 0; i < lines && sp < buf + size; i++) {
			if (i) {
				out.strbuf_addstr("\n    ");
			} 
			eol = .memchr(sp, (byte)'\n', size - (sp - buf));
			len = eol ? eol - sp : size - (sp - buf);
			out.strbuf_add(sp, len);
			if (!eol) {
				break;
			} 
			sp = eol + 1;
		}
	}
	public int has_reserved_character(strbuf errbuf) {
		byte generatedBuf = this.getBuf();
		byte c = generatedBuf;
		while (c) {
			if (c <= (byte)' ' || .strchr(ModernizedCProgram.RESERVED_NON_WS, c)) {
				errbuf.strbuf_addf(ModernizedCProgram._("must escape char in sub-filter-spec: '%c'"), c);
				return 1;
			} 
			c++;
		}
		return 0;
	}
	public void format_decorations_extended(Object commit, int use_color, Object prefix, Object separator, Object suffix) {
		name_decoration decoration = new name_decoration();
		name_decoration current_and_HEAD = new name_decoration();
		byte color_commit = .diff_get_color(use_color, color_diff.DIFF_COMMIT);
		byte color_reset = ModernizedCProgram.decorate_get_color(use_color, decoration_type.DECORATION_NONE);
		decoration = ModernizedCProgram.get_name_decoration(commit.getObject());
		if (!decoration) {
			return ;
		} 
		current_and_HEAD = ModernizedCProgram.current_pointed_by_HEAD(decoration);
		while (decoration/*
				 * When both current and HEAD are there, only
				 * show HEAD->current where HEAD would have
				 * appeared, skipping the entry for current.
				 */) {
			if (decoration != current_and_HEAD) {
				sb.strbuf_addstr(color_commit);
				sb.strbuf_addstr(prefix);
				sb.strbuf_addstr(color_reset);
				sb.strbuf_addstr(ModernizedCProgram.decorate_get_color(use_color, decoration.getType()));
				if (decoration.getType() == decoration_type.DECORATION_REF_TAG) {
					sb.strbuf_addstr("tag: ");
				} 
				ModernizedCProgram.show_name(sb, decoration);
				if (current_and_HEAD && decoration.getType() == decoration_type.DECORATION_REF_HEAD) {
					sb.strbuf_addstr(" -> ");
					sb.strbuf_addstr(color_reset);
					sb.strbuf_addstr(ModernizedCProgram.decorate_get_color(use_color, current_and_HEAD.getType()));
					ModernizedCProgram.show_name(sb, current_and_HEAD);
				} 
				sb.strbuf_addstr(color_reset);
				prefix = separator;
			} 
			decoration = decoration.getNext();
		}
		sb.strbuf_addstr(color_commit);
		sb.strbuf_addstr(suffix);
		sb.strbuf_addstr(color_reset);
	}
	public int remove_dir_recurse(int flag, int kept_up) {
		DIR dir = new DIR();
		dirent e = new dirent();
		int ret = 0;
		int original_len = ModernizedCProgram.path.getLen();
		int len;
		int kept_down = 0;
		int only_empty = (flag & 1);
		int keep_toplevel = (flag & 4);
		object_id submodule_head = new object_id();
		if ((flag & 2) && !submodule_head.resolve_gitlink_ref(ModernizedCProgram.path.getBuf(), "HEAD")) {
			if (/* Do not descend and nuke a nested git work tree. */kept_up) {
				kept_up = 1;
			} 
			return 0;
		} 
		flag &=  ~4;
		dir = ModernizedCProgram.opendir(ModernizedCProgram.path.getBuf());
		if (!dir) {
			if ((._errno()) == 2) {
				return keep_toplevel ? -1 : 0;
			}  else if ((._errno()) == 13 && !keep_toplevel/*
						 * An empty dir could be removable even if it
						 * is unreadable:
						 */) {
				return .rmdir(ModernizedCProgram.path.getBuf());
			} else {
					return -1;
			} 
		} 
		ModernizedCProgram.path.strbuf_complete((byte)'/');
		len = ModernizedCProgram.path.getLen();
		dirent dirent = new dirent();
		Object generatedD_name = e.getD_name();
		Object generatedSt_mode = st.getSt_mode();
		while ((e = dirent.readdir(dir)) != ((Object)0)) {
			stat st = new stat();
			if (ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				continue;
			} 
			ModernizedCProgram.path.strbuf_setlen(len);
			ModernizedCProgram.path.strbuf_addstr(generatedD_name);
			if (.lstat(ModernizedCProgram.path.getBuf(), st)) {
				if ((._errno()) == 2/*
								 * file disappeared, which is what we
								 * wanted anyway
								 */) {
					continue;
				} 
			}  else if ((((generatedSt_mode) & -1024) == /* fall thru */-1024)) {
				if (!ModernizedCProgram.path.remove_dir_recurse(flag, kept_down)) {
					continue;
				} 
			}  else if (!only_empty && (!.unlink(ModernizedCProgram.path.getBuf()) || (._errno()) == 2)) {
				continue;
			} 
			ret = -/* path too long, stat fails, or non-directory still exists */1;
			break;
		}
		dir.closedir();
		ModernizedCProgram.path.strbuf_setlen(original_len);
		if (!ret && !keep_toplevel && !kept_down) {
			ret = (!.rmdir(ModernizedCProgram.path.getBuf()) || (._errno()) == 2) ? 0 : -1;
		}  else if (kept_up/*
				 * report the uplevel that it is not an error that we
				 * did not rmdir() our directory.
				 */) {
			kept_up = !ret;
		} 
		return ret;
	}
	public int remove_dir_recursively(int flag) {
		return ModernizedCProgram.path.remove_dir_recurse(flag, ((Object)0));
	}
	/* IPv6 literals need [:] */
	/* plus 0x00-0x1F,0x7F-0xFF */
	/* only allowed delims */
	public int append_normalized_escapes(Object from, Object from_len, Object esc_extra, Object esc_ok) {
		while (from_len) {
			int ch = from++;
			int was_esc = 0;
			from_len--;
			if (ch == (byte)'%') {
				if (from_len < 2) {
					return 0;
				} 
				ch = ModernizedCProgram.hex2chr(from);
				if (ch < 0) {
					return 0;
				} 
				from += 2;
				from_len -= 2;
				was_esc = 1;
			} 
			if ((byte)ch <= -1024 || (byte)ch >= -1024 || .strchr(" <>\"%{}|\\^`", ch) || (esc_extra && .strchr(esc_extra, ch)) || (was_esc && .strchr(esc_ok, ch))) {
				ModernizedCProgram.buf.strbuf_addf("%%%02X", (byte)ch);
			} else {
					ModernizedCProgram.buf.strbuf_addch(ch);
			} 
		}
		return 1;
	}
	/*
		 * Append to strbuf 'buf' characters from string 'from' with length
		 * 'from_len' while unescaping characters that do not need to be escaped
		 * and escaping characters that do.  The set of characters to escape
		 * (the complement of which is unescaped) starts out as the RFC 3986
		 * unsafe characters (0x00-0x1F,0x7F-0xFF," <>\"#%{}|\\^`").  If
		 * 'esc_extra' is not NULL, those additional characters will also always
		 * be escaped.  If 'esc_ok' is not NULL, those characters will be left
		 * escaped if found that way, but will not be unescaped otherwise (used
		 * for delimiters).  If a %-escape sequence is encountered that is not
		 * followed by 2 hexadecimal digits, the sequence is invalid and
		 * false (0) will be returned.  Otherwise true (1) will be returned for
		 * success.
		 *
		 * Note that all %-escape sequences will be normalized to UPPERCASE
		 * as indicated in RFC 3986.  Unless included in esc_extra or esc_ok
		 * alphanumerics and "-._~" will always be unescaped as per RFC 3986.
		 */
	public void comment_lines() {
		byte msg;
		size_t len = new size_t();
		msg = ModernizedCProgram.buf.strbuf_detach(len);
		ModernizedCProgram.buf.strbuf_add_commented_lines(msg, len);
		ModernizedCProgram.free(msg);
	}
	public int subprocess_read_status(int fd) {
		strbuf pair = new strbuf();
		byte line;
		int len;
		strbuf strbuf = new strbuf();
		for (; ; ) {
			len = ModernizedCProgram.packet_read_line_gently(fd, ((Object)0), line);
			if ((len < 0) || !line) {
				break;
			} 
			pair = strbuf.strbuf_split_str(line, (byte)'=', 2);
			if (pair[0] && pair[0].getLen() && pair[1]) {
				if (!.strcmp(pair[0].getBuf(), /* the last "status=<foo>" line wins */"status=")) {
					status.strbuf_setlen(0);
					status.strbuf_addbuf(pair[1]);
				} 
			} 
			pair.strbuf_list_free();
		}
		return (len < 0) ? len : 0;
	}
	public void strbuf_replace(Object a, Object b) {
		byte generatedBuf = this.getBuf();
		byte ptr = .strstr(generatedBuf, a);
		if (ptr) {
			sb.strbuf_splice(ptr - generatedBuf, .strlen(a), b, .strlen(b));
		} 
	}
	public void parse_trailer(strbuf val, Object conf, Object trailer, Object separator_pos) {
		arg_item item = new arg_item();
		size_t tok_len = new size_t();
		list_head pos = new list_head();
		if (separator_pos != -1) {
			tok.strbuf_add(trailer, separator_pos);
			tok.strbuf_trim();
			val.strbuf_addstr(trailer + separator_pos + 1);
			val.strbuf_trim();
		} else {
				tok.strbuf_addstr(trailer);
				tok.strbuf_trim();
		} 
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		tok_len = ModernizedCProgram.token_len_without_separator(generatedBuf, generatedLen);
		if (conf) {
			conf = ModernizedCProgram.default_conf_info;
		} 
		conf_info generatedConf = item.getConf();
		list_head generatedNext = pos.getNext();
		for (pos = generatedNext; pos != (ModernizedCProgram.conf_head); pos = generatedNext) {
			item = ((arg_item)((byte)(pos) - ((size_t)((arg_item)0).getList())));
			if (item.token_matches_item(generatedBuf, tok_len)) {
				byte tok_buf = tok.strbuf_detach(((Object)0));
				if (conf) {
					conf = generatedConf;
				} 
				tok.strbuf_addstr(item.token_from_item(tok_buf));
				ModernizedCProgram.free(tok_buf);
				break;
			} 
		}
	}
	public void read_input_file(Object file) {
		if (file) {
			if (sb.strbuf_read_file(file, 0) < 0) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("could not read input file '%s'"), file);
			} 
		} else {
				if (sb.strbuf_read((((_iob[0])).get_file()), 0) < 0) {
					ModernizedCProgram.die_errno(ModernizedCProgram._("could not read from stdin"));
				} 
		} 
	}
	public void unfold_value() {
		strbuf out = new strbuf(, , );
		size_t i = new size_t();
		Object generatedLen = this.getLen();
		out.strbuf_grow(generatedLen);
		i = 0;
		byte generatedBuf = this.getBuf();
		while (i < generatedLen) {
			byte c = generatedBuf[i++];
			if (c == (byte)'\n') {
				while (i < generatedLen && ((ModernizedCProgram.sane_ctype[(byte)(generatedBuf[i])] & (true)) != /* Collapse continuation down to a single space. */0)) {
					i++;
				}
				out.strbuf_addch((byte)' ');
			} else {
					out.strbuf_addch(c);
			} 
		}
		/* Empty lines may have left us with whitespace cruft at the edges */out.strbuf_trim();
		out.strbuf_swap(/* output goes back to val as if we modified it in-place */val);
		out.strbuf_release();
	}
	public void format_trailer_info(Object info, Object opts) {
		Object generatedLen = this.getLen();
		size_t origlen = generatedLen;
		size_t i = new size_t();
		if (!opts.getOnly_trailers() && !opts.getUnfold() && !opts.getFilter() && !opts.getSeparator()) {
			out.strbuf_add(info.getTrailer_start(), info.getTrailer_end() - info.getTrailer_start());
			return ;
		} 
		byte generatedBuf = tok.getBuf();
		for (i = 0; i < info.getTrailer_nr(); i++) {
			byte trailer = info.getTrailers()[i];
			ssize_t separator_pos = ModernizedCProgram.find_separator(trailer, ModernizedCProgram.separators);
			if (separator_pos >= 1) {
				strbuf tok = new strbuf(, , );
				strbuf val = new strbuf(, , );
				tok.parse_trailer(val, ((Object)0), trailer, separator_pos);
				if (!opts.getFilter() || .UNRECOGNIZEDFUNCTIONNAME(tok, opts.getFilter_data())) {
					if (opts.getUnfold()) {
						val.unfold_value();
					} 
					if (opts.getSeparator() && generatedLen != origlen) {
						out.strbuf_addbuf(opts.getSeparator());
					} 
					if (!opts.getValue_only()) {
						out.strbuf_addf("%s: ", generatedBuf);
					} 
					out.strbuf_addbuf(val);
					if (!opts.getSeparator()) {
						out.strbuf_addch((byte)'\n');
					} 
				} 
				tok.strbuf_release();
				val.strbuf_release();
			}  else if (!opts.getOnly_trailers()) {
				if (opts.getSeparator() && generatedLen != origlen) {
					out.strbuf_addbuf(opts.getSeparator());
				} 
				out.strbuf_addstr(trailer);
				if (opts.getSeparator()) {
					out.strbuf_rtrim();
				} 
			} 
		}
	}
	public void format_trailers_from_commit(Object msg, Object opts) {
		trailer_info info = new trailer_info();
		info.trailer_info_get(msg, opts);
		out.format_trailer_info(info, opts);
		info.trailer_info_release();
	}
	public void trace_add_env(Object deltaenv) {
		string_list envs = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		byte e;
		int i;
		int printed_unset = 0;
		string_list_item string_list_item = new string_list_item();
		for (e = deltaenv; e && e; /* Last one wins, see run-command.c:prep_childenv() for context */e++) {
			strbuf key = new strbuf(, , );
			byte equals = .strchr(e, (byte)'=');
			if (equals) {
				ModernizedCProgram.key.strbuf_add(e, equals - e);
				string_list_item.string_list_insert(envs, ModernizedCProgram.key.getBuf()).setUtil(equals + 1);
			} else {
					string_list_item.string_list_insert(envs, e).setUtil(((Object)0));
			} 
			ModernizedCProgram.key.strbuf_release();
		}
		int generatedNr = envs.getNr();
		string_list_item generatedItems = envs.getItems();
		for (i = 0; i < generatedNr; /* "unset X Y...;" */i++) {
			byte var = generatedItems[i].getString();
			byte val = generatedItems[i].getUtil();
			if (val || !.getenv(var)) {
				continue;
			} 
			if (!printed_unset) {
				dst.strbuf_addstr(" unset");
				printed_unset = 1;
			} 
			dst.strbuf_addf(" %s", var);
		}
		if (printed_unset) {
			dst.strbuf_addch((byte)';');
		} 
		for (i = 0; i < generatedNr; /* ... followed by "A=B C=D ..." */i++) {
			byte var = generatedItems[i].getString();
			byte val = generatedItems[i].getUtil();
			byte oldval;
			if (!val) {
				continue;
			} 
			oldval = .getenv(var);
			if (oldval && !.strcmp(val, oldval)) {
				continue;
			} 
			dst.strbuf_addf(" %s=", var);
			dst.sq_quote_buf_pretty(val);
		}
		envs.string_list_clear(0);
	}
	public int default_start_failure(Object pp_cb, Object pp_task_cb) {
		return 0;
	}
	public int default_task_finished(int result, Object pp_cb, Object pp_task_cb) {
		return 0;
	}
	public void append_suffix(int depth, Object oid) {
		dst.strbuf_addf("-%d-g%s", depth, ModernizedCProgram.the_repository.repo_find_unique_abbrev(oid, ModernizedCProgram.abbrev));
	}
	public int has_conforming_footer(strbuf sob, Object ignore_footer) {
		process_trailer_options opts = new process_trailer_options(0);
		trailer_info info = new trailer_info();
		size_t i = new size_t();
		int found_sob = 0;
		int found_sob_last = 0;
		opts.setNo_divider(1);
		byte generatedBuf = this.getBuf();
		info.trailer_info_get(generatedBuf, opts);
		Object generatedTrailer_start = info.getTrailer_start();
		Object generatedTrailer_end = info.getTrailer_end();
		if (generatedTrailer_start == generatedTrailer_end) {
			return 0;
		} 
		Object generatedTrailer_nr = info.getTrailer_nr();
		Byte generatedTrailers = info.getTrailers();
		Object generatedLen = sob.getLen();
		for (i = 0; i < generatedTrailer_nr; i++) {
			if (sob && !.strncmp(generatedTrailers[i], generatedBuf, generatedLen)) {
				found_sob = 1;
				if (i == generatedTrailer_nr - 1) {
					found_sob_last = 1;
				} 
			} 
		}
		info.trailer_info_release();
		if (found_sob_last) {
			return 3;
		} 
		if (found_sob) {
			return 2;
		} 
		return 1;
	}
	public int read_oneliner(Object path, int skip_if_empty) {
		int orig_len = ModernizedCProgram.buf.getLen();
		if (!ModernizedCProgram.file_exists(path)) {
			return 0;
		} 
		if (ModernizedCProgram.buf.strbuf_read_file(path, 0) < 0) {
			ModernizedCProgram.warning_errno(ModernizedCProgram._("could not read '%s'"), path);
			return 0;
		} 
		if (ModernizedCProgram.buf.getLen() > orig_len && ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1] == (byte)'\n') {
			if (--ModernizedCProgram.buf.getLen() > orig_len && ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1] == (byte)'\r') {
				--ModernizedCProgram.buf.getLen();
			} 
			ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen()] = (byte)'\0';
		} 
		if (skip_if_empty && ModernizedCProgram.buf.getLen() == orig_len) {
			return 0;
		} 
		return 1;
	}
	public void cleanup_message(commit_msg_cleanup_mode cleanup_mode, int verbose) {
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (/* Truncate the message just before the diff, if any. */verbose || commit_msg_cleanup_mode.cleanup_mode == commit_msg_cleanup_mode.COMMIT_MSG_CLEANUP_SCISSORS) {
			msgbuf.strbuf_setlen(ModernizedCProgram.wt_status_locate_end(generatedBuf, generatedLen));
		} 
		if (commit_msg_cleanup_mode.cleanup_mode != commit_msg_cleanup_mode.COMMIT_MSG_CLEANUP_NONE) {
			msgbuf.strbuf_stripspace(commit_msg_cleanup_mode.cleanup_mode == commit_msg_cleanup_mode.COMMIT_MSG_CLEANUP_ALL/*
			 * Find out if the message in the strbuf contains only whitespace and
			 * Signed-off-by lines.
			 */);
		} 
	}
	public int update_head_with_reflog(Object old_head, Object new_head, Object action, Object msg) {
		ref_transaction transaction = new ref_transaction();
		strbuf sb = new strbuf(, , );
		byte nl;
		int ret = 0;
		if (action) {
			sb.strbuf_addstr(action);
			sb.strbuf_addstr(": ");
		} 
		nl = .strchr(msg.getBuf(), (byte)'\n');
		if (nl) {
			sb.strbuf_add(msg.getBuf(), nl + 1 - msg.getBuf());
		} else {
				sb.strbuf_addbuf(msg);
				sb.strbuf_addch((byte)'\n');
		} 
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_transaction_begin(ModernizedCProgram.err);
		byte generatedBuf = sb.getBuf();
		if (!transaction || ModernizedCProgram.ref_transaction_update(transaction, "HEAD", new_head, old_head ? old_head.getObject().getOid() : ModernizedCProgram.null_oid, 0, generatedBuf, ModernizedCProgram.err) || ModernizedCProgram.ref_transaction_commit(transaction, ModernizedCProgram.err)) {
			ret = -1;
		} 
		transaction.ref_transaction_free();
		sb.strbuf_release();
		return ret;
	}
	public Object strbuf_read_file_or_whine(Object path) {
		int fd;
		ssize_t len = new ssize_t();
		fd = .open(path, 0);
		if (fd < 0) {
			return ();
		} 
		len = sb.strbuf_read(fd, 0);
		.close(fd);
		if (len < 0) {
			return ();
		} 
		return len;
	}
	public void append_signoff(Object ignore_footer, int flag) {
		int no_dup_sob = flag & (-1024 << 0);
		strbuf sob = new strbuf(, , );
		int has_footer;
		sob.strbuf_addstr(ModernizedCProgram.sign_off_header);
		sob.strbuf_addstr(ModernizedCProgram.fmt_name(want_ident.WANT_COMMITTER_IDENT));
		sob.strbuf_addch((byte)'\n');
		if (!ignore_footer) {
			msgbuf/*
				 * If the whole message buffer is equal to the sob, pretend that we
				 * found a conforming footer with a matching sob
				 */.strbuf_complete_line();
		} 
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		if (generatedLen - ignore_footer == generatedLen && !.strncmp(generatedBuf, generatedBuf, generatedLen)) {
			has_footer = 3;
		} else {
				has_footer = msgbuf.has_conforming_footer(sob, ignore_footer);
		} 
		if (!has_footer) {
			byte append_newlines = ((Object)0);
			size_t len = generatedLen - ignore_footer;
			if (!ModernizedCProgram.len/*
						 * The buffer is completely empty.  Leave foom for
						 * the title and body to be filled in by the user.
						 */) {
				append_newlines = "\n\n";
			}  else if (ModernizedCProgram.len == 1/*
						 * Buffer contains a single newline.  Add another
						 * so that we leave room for the title and body.
						 */) {
				append_newlines = "\n";
			}  else if (generatedBuf[ModernizedCProgram.len - 2] != (byte)'\n'/*
						 * Buffer ends with a single newline.  Add another
						 * so that there is an empty line between the message
						 * body and the sob.
						 */) {
				append_newlines = "\n"/* else, the buffer already ends with two newlines. */;
			} 
			if (append_newlines) {
				msgbuf.strbuf_splice(generatedLen - ignore_footer, 0, append_newlines, .strlen(append_newlines));
			} 
		} 
		if (has_footer != 3 && (!no_dup_sob || has_footer != 2)) {
			msgbuf.strbuf_splice(generatedLen - ignore_footer, 0, generatedBuf, generatedLen);
		} 
		sob.strbuf_release();
	}
	public int get_common_dir(Object gitdir) {
		byte git_env_common_dir = .getenv("GIT_COMMON_DIR");
		if (git_env_common_dir) {
			sb.strbuf_addstr(git_env_common_dir);
			return 1;
		} else {
				return sb.get_common_dir_noenv(gitdir);
		} 
	}
	public int get_common_dir_noenv(Object gitdir) {
		strbuf data = new strbuf(, , );
		strbuf path = new strbuf(, , );
		int ret = 0;
		path.strbuf_addf("%s/commondir", gitdir);
		byte generatedBuf = path.getBuf();
		Object generatedLen = data.getLen();
		if (ModernizedCProgram.file_exists(generatedBuf)) {
			if (data.strbuf_read_file(generatedBuf, 0) <= 0) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("failed to read %s"), generatedBuf);
			} 
			while (generatedLen && (generatedBuf[generatedLen - 1] == (byte)'\n' || generatedBuf[generatedLen - 1] == (byte)'\r')) {
				generatedLen--;
			}
			generatedBuf[generatedLen] = (byte)'\0';
			path.strbuf_setlen(0);
			if (!ModernizedCProgram.is_absolute_path(generatedBuf)) {
				path.strbuf_addf("%s/", gitdir);
			} 
			path.strbuf_addbuf(data);
			sb.strbuf_add_real_path(generatedBuf);
			ret = 1;
		} else {
				sb.strbuf_addstr(gitdir);
		} 
		data.strbuf_release();
		path.strbuf_release();
		return ret/*
		 * Test if it looks like we're at a git directory.
		 * We want to see:
		 *
		 *  - either an objects/ directory _or_ the proper
		 *    GIT_OBJECT_DIRECTORY environment variable
		 *  - a refs/ directory
		 *  - either a HEAD symlink or a HEAD file that is formatted as
		 *    a proper "ref:", or a regular file HEAD that has a properly
		 *    formatted sha1 object name.
		 */;
	}
	public int is_nonbare_repository_dir() {
		int ret = 0;
		int gitfile_error;
		size_t orig_path_len = ModernizedCProgram.path.getLen();
		((orig_path_len != 0) ? (Object)0 : ._assert("orig_path_len != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\setup.c", 356));
		ModernizedCProgram.path.strbuf_complete((byte)'/');
		ModernizedCProgram.path.strbuf_addstr(".git");
		if (ModernizedCProgram.read_gitfile_gently(ModernizedCProgram.path.getBuf(), gitfile_error) || ModernizedCProgram.is_git_directory(ModernizedCProgram.path.getBuf())) {
			ret = 1;
		} 
		if (gitfile_error == 3 || gitfile_error == 4) {
			ret = 1;
		} 
		ModernizedCProgram.path.strbuf_setlen(orig_path_len);
		return ret;
	}
	public int verify_repository_format(Object format) {
		if (1 < format.getVersion()) {
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("Expected git repo version <= %d, found %d"), 1, format.getVersion());
			return -1;
		} 
		if (format.getVersion() >= 1 && format.getUnknown_extensions().getNr()) {
			int i;
			ModernizedCProgram.err.strbuf_addstr(ModernizedCProgram._("unknown repository extensions found:"));
			for (i = 0; i < format.getUnknown_extensions().getNr(); i++) {
				ModernizedCProgram.err.strbuf_addf("\n\t%s", format.getUnknown_extensions().getItems()[i].getString());
			}
			return -1;
		} 
		return 0;
	}
	public discovery_result setup_git_directory_gently_1(strbuf gitdir, int die_on_error) {
		byte env_ceiling_dirs = .getenv("GIT_CEILING_DIRECTORIES");
		string_list ceiling_dirs = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		byte gitdirenv;
		byte generatedBuf = this.getBuf();
		int ceil_offset = -1;
		int min_offset = ModernizedCProgram.git_offset_1st_component(generatedBuf);
		dev_t current_device = 0;
		int one_filesystem = 1/*
			 * If GIT_DIR is set explicitly, we're not going
			 * to do any discovery, but we still do repository
			 * validation.
			 */;
		gitdirenv = .getenv("GIT_DIR");
		if (gitdirenv) {
			gitdir.strbuf_addstr(gitdirenv);
			return discovery_result.GIT_DIR_EXPLICIT;
		} 
		if (env_ceiling_dirs) {
			int empty_entry_found = 0;
			ceiling_dirs.string_list_split(env_ceiling_dirs, (byte)':', -1);
			ceiling_dirs.filter_string_list(0, canonicalize_ceiling_entry, empty_entry_found);
			ceil_offset = ceiling_dirs.longest_ancestor_length(generatedBuf);
			ceiling_dirs.string_list_clear(0);
		} 
		if (ceil_offset < 0) {
			ceil_offset = min_offset - 2;
		} 
		Object generatedLen = this.getLen();
		if (min_offset && min_offset == generatedLen && !ModernizedCProgram.git_is_dir_sep(generatedBuf[min_offset - 1])) {
			dir.strbuf_addch((byte)'/');
			min_offset/*
				 * Test in the following order (relative to the dir):
				 * - .git (file containing "gitdir: <path>")
				 * - .git/
				 * - ./ (bare)
				 * - ../.git
				 * - ../.git/
				 * - ../ (bare)
				 * - ../../.git
				 *   etc.
				 */++;
		} 
		one_filesystem = !.git_env_bool("GIT_DISCOVERY_ACROSS_FILESYSTEM", 0);
		if (one_filesystem) {
			current_device = ModernizedCProgram.get_device_or_die(generatedBuf, ((Object)0), 0);
		} 
		for (; ; ) {
			int offset = generatedLen;
			int error_code = 0;
			if (ModernizedCProgram.offset > min_offset) {
				dir.strbuf_addch((byte)'/');
			} 
			dir.strbuf_addstr(".git");
			gitdirenv = ModernizedCProgram.read_gitfile_gently(generatedBuf, die_on_error ? ((Object)0) : error_code);
			if (!gitdirenv) {
				if (die_on_error || error_code == 2) {
					if (ModernizedCProgram.is_git_directory(generatedBuf)) {
						gitdirenv = ".git";
					} 
				}  else if (error_code != 1) {
					return discovery_result.GIT_DIR_INVALID_GITFILE;
				} 
			} 
			dir.strbuf_setlen(ModernizedCProgram.offset);
			if (gitdirenv) {
				gitdir.strbuf_addstr(gitdirenv);
				return discovery_result.GIT_DIR_DISCOVERED;
			} 
			if (ModernizedCProgram.is_git_directory(generatedBuf)) {
				gitdir.strbuf_addstr(".");
				return discovery_result.GIT_DIR_BARE;
			} 
			if (ModernizedCProgram.offset <= min_offset) {
				return discovery_result.GIT_DIR_HIT_CEILING;
			} 
			while (--ModernizedCProgram.offset > ceil_offset && !ModernizedCProgram.git_is_dir_sep(generatedBuf[ModernizedCProgram.offset])) {
				;
			}
			if (ModernizedCProgram.offset <= ceil_offset) {
				return discovery_result.GIT_DIR_HIT_CEILING;
			} 
			dir.strbuf_setlen(ModernizedCProgram.offset > min_offset ? ModernizedCProgram.offset : min_offset);
			if (one_filesystem && current_device != ModernizedCProgram.get_device_or_die(generatedBuf, ((Object)0), ModernizedCProgram.offset)) {
				return discovery_result.GIT_DIR_HIT_MOUNT_POINT;
			} 
		}
	}
	public int discover_git_directory(strbuf gitdir) {
		strbuf dir = new strbuf(, , );
		strbuf err = new strbuf(, , );
		Object generatedLen = gitdir.getLen();
		size_t gitdir_offset = generatedLen;
		size_t cwd_len = new size_t();
		size_t commondir_offset = generatedLen;
		repository_format candidate = new repository_format(, , , );
		if (dir.strbuf_getcwd()) {
			return -1;
		} 
		cwd_len = generatedLen;
		if (dir.setup_git_directory_gently_1(gitdir, 0) <= 0) {
			dir.strbuf_release();
			return -1/*
				 * The returned gitdir is relative to dir, and if dir does not reflect
				 * the current working directory, we simply make the gitdir absolute.
				 */;
		} 
		byte generatedBuf = gitdir.getBuf();
		if (generatedLen < cwd_len && !ModernizedCProgram.is_absolute_path(generatedBuf + gitdir_offset)) {
			if (!.strcmp(".", generatedBuf + /* Avoid a trailing "/." */gitdir_offset)) {
				gitdir.strbuf_setlen(gitdir_offset);
			} else {
					dir.strbuf_addch((byte)'/');
			} 
			gitdir.strbuf_insert(gitdir_offset, generatedBuf, generatedLen);
		} 
		commondir.get_common_dir(generatedBuf + gitdir_offset);
		dir.strbuf_setlen(0);
		dir.strbuf_addf("%s/config", generatedBuf + commondir_offset);
		candidate.read_repository_format(generatedBuf);
		dir.strbuf_release();
		if (err.verify_repository_format(candidate) < 0) {
			ModernizedCProgram.warning("ignoring git dir '%s': %s", generatedBuf + gitdir_offset, generatedBuf);
			err.strbuf_release();
			commondir.strbuf_setlen(commondir_offset);
			gitdir.strbuf_setlen(gitdir_offset);
			candidate.clear_repository_format();
			return -1;
		} 
		candidate.clear_repository_format();
		return 0;
	}
	public int parse_data(Object limit, Object len_res) {
		byte data;
		sb.strbuf_setlen(0);
		if (!ModernizedCProgram.skip_prefix(ModernizedCProgram.command_buf.getBuf(), "data ", data)) {
			ModernizedCProgram.die("Expected 'data n' command, found: %s", ModernizedCProgram.command_buf.getBuf());
		} 
		if (ModernizedCProgram.skip_prefix(data, "<<", data)) {
			byte term = ModernizedCProgram.xstrdup(data);
			size_t term_len = ModernizedCProgram.command_buf.getLen() - (data - ModernizedCProgram.command_buf.getBuf());
			for (; ; ) {
				if (ModernizedCProgram.strbuf_getline_lf(ModernizedCProgram.command_buf, (_iob[0])) == (true)) {
					ModernizedCProgram.die("EOF in data (terminator '%s' not found)", ModernizedCProgram.term);
				} 
				if (term_len == ModernizedCProgram.command_buf.getLen() && !.strcmp(ModernizedCProgram.term, ModernizedCProgram.command_buf.getBuf())) {
					break;
				} 
				sb.strbuf_addbuf(ModernizedCProgram.command_buf);
				sb.strbuf_addch((byte)'\n');
			}
			ModernizedCProgram.free(ModernizedCProgram.term);
		} else {
				uintmax_t len = .strtoumax(data, ((Object)0), 10);
				size_t n = 0;
				size_t length = (size_t)ModernizedCProgram.len;
				if (limit && limit < ModernizedCProgram.len) {
					len_res = ModernizedCProgram.len;
					return 0;
				} 
				if (length < ModernizedCProgram.len) {
					ModernizedCProgram.die("data is too large to use in this context");
				} 
				while (n < length) {
					size_t s = ModernizedCProgram.strbuf_fread(sb, length - n, (_iob[0]));
					if (!s && (((_iob[0])).get_flag() & -1024)) {
						ModernizedCProgram.die("EOF in data (%lu bytes remaining)", (long)(length - n));
					} 
					n += s;
				}
		} 
		ModernizedCProgram.skip_optional_lf();
		return 1;
	}
	public int validate_raw_date(Object src) {
		byte orig_src = src;
		byte endp;
		long num;
		(._errno()) = 0;
		num = .strtoul(src, endp, 10);
		if ((._errno()) || endp == src || endp != /* NEEDSWORK: perhaps check for reasonable values? */(byte)' ') {
			return -1;
		} 
		src = endp + 1;
		if (src != (byte)'-' && src != (byte)'+') {
			return -1;
		} 
		num = .strtoul(src + 1, endp, 10);
		if ((._errno()) || endp == src + 1 || endp || 1400 < num) {
			return -1;
		} 
		result.strbuf_addstr(orig_src);
		return 0;
	}
	public int update_clone_start_failure(Object suc_cb, Object idx_task_cb) {
		submodule_update_clone suc = suc_cb;
		suc.setQuickstop(1);
		return 1;
	}
	public int update_clone_task_finished(int result, Object suc_cb, Object idx_task_cb) {
		cache_entry ce = new cache_entry();
		submodule_update_clone suc = suc_cb;
		int idxP = idx_task_cb;
		int idx = idxP;
		ModernizedCProgram.free(idxP);
		if (!result) {
			return 0;
		} 
		module_list generatedList = suc.getList();
		int generatedNr = generatedList.getNr();
		Object generatedEntries = generatedList.getEntries();
		int generatedFailed_clones_nr = suc.getFailed_clones_nr();
		int generatedFailed_clones_alloc = suc.getFailed_clones_alloc();
		Object generatedFailed_clones = suc.getFailed_clones();
		if (idx < generatedNr) {
			ce = generatedEntries[idx];
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("Failed to clone '%s'. Retry scheduled"), ce.getName());
			ModernizedCProgram.err.strbuf_addch((byte)'\n');
			do {
				if ((generatedFailed_clones_nr + 1) > generatedFailed_clones_alloc) {
					if ((((generatedFailed_clones_alloc) + 16) * 3 / 2) < (generatedFailed_clones_nr + 1)) {
						suc.setFailed_clones_alloc((generatedFailed_clones_nr + 1));
					} else {
							suc.setFailed_clones_alloc((((generatedFailed_clones_alloc) + 16) * 3 / 2));
					} 
					(generatedFailed_clones) = ModernizedCProgram.xrealloc((generatedFailed_clones), ModernizedCProgram.st_mult(, (generatedFailed_clones_alloc)));
				} 
			} while (0);
			generatedFailed_clones[generatedFailed_clones_nr++] = ce;
			return 0;
		} else {
				idx -= generatedNr;
				ce = generatedFailed_clones[idx];
				ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("Failed to clone '%s' a second time, aborting"), ce.getName());
				ModernizedCProgram.err.strbuf_addch((byte)'\n');
				suc.setQuickstop(1);
				return 1;
		} 
		return 0;
	}
	public void format_subst(Object commit, Object src, Object len) {
		byte to_free = ((Object)0);
		strbuf fmt = new strbuf(, , );
		pretty_print_context ctx = new pretty_print_context(0);
		date_mode generatedDate_mode = ctx.getDate_mode();
		generatedDate_mode.setType(date_mode_type.DATE_NORMAL);
		ctx.setAbbrev(ModernizedCProgram.default_abbrev);
		if (src == ModernizedCProgram.buf.getBuf()) {
			to_free = ModernizedCProgram.buf.strbuf_detach(((Object)0));
		} 
		byte generatedBuf = fmt.getBuf();
		for (; ; ) {
			byte b;
			byte c;
			b = .memmem(src, len, "$Format:", 8);
			if (!b) {
				break;
			} 
			c = .memchr(b + 8, (byte)'$', (src + len) - b - 8);
			if (!c) {
				break;
			} 
			fmt.strbuf_setlen(0);
			fmt.strbuf_add(b + 8, c - b - 8);
			ModernizedCProgram.buf.strbuf_add(src, b - src);
			ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, commit, generatedBuf, ModernizedCProgram.buf, ctx);
			len -= c + 1 - src;
			src = c + 1;
		}
		ModernizedCProgram.buf.strbuf_add(src, len);
		fmt.strbuf_release();
		ModernizedCProgram.free(to_free);
	}
	public int queue_or_write_archive_entry(Object oid, Object filename, int mode, int stage, Object context) {
		archiver_context c = context;
		directory generatedBottom = c.getBottom();
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		Object generatedPath = generatedBottom.getPath();
		directory generatedUp = generatedBottom.getUp();
		while (generatedBottom && !(generatedLen >= generatedLen && !.strncmp(generatedBuf, generatedPath, generatedLen))) {
			directory next = generatedUp;
			ModernizedCProgram.free(generatedBottom);
			c.setBottom(next);
		}
		archiver_args generatedArgs = c.getArgs();
		repository generatedRepo = generatedArgs.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		if ((((mode) & -1024) == -1024)) {
			size_t baselen = generatedLen;
			attr_check check = new attr_check();
			base.strbuf_addstr(/* Borrow base, but restore its original value when done. */filename);
			base.strbuf_addch((byte)'/');
			ModernizedCProgram.check = generatedIndex.get_archive_attrs(generatedBuf);
			base.strbuf_setlen(baselen);
			if (ModernizedCProgram.check_attr_export_ignore(ModernizedCProgram.check)) {
				return 0;
			} 
			ModernizedCProgram.queue_directory(oid.getHash(), base, filename, mode, stage, c);
			return 1;
		} 
		if (c.write_directory()) {
			return -1;
		} 
		return ModernizedCProgram.write_archive_entry(oid, generatedBuf, generatedLen, filename, mode, stage, context);
	}
	public int reject_entry(Object oid, Object filename, int mode, int stage, Object context) {
		int ret = -1;
		path_exists_context ctx = context;
		archiver_args generatedArgs = ctx.getArgs();
		repository generatedRepo = generatedArgs.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		pathspec generatedPathspec = ctx.getPathspec();
		byte generatedBuf = sb.getBuf();
		Object generatedLen = sb.getLen();
		if ((((mode) & -1024) == -1024)) {
			strbuf sb = new strbuf(, , );
			sb.strbuf_addbuf(base);
			sb.strbuf_addstr(filename);
			if (!ModernizedCProgram.match_pathspec(generatedIndex, generatedPathspec, generatedBuf, generatedLen, 0, ((Object)0), 1)) {
				ret = 1;
			} 
			sb.strbuf_release();
		} 
		return ret;
	}
	public int query_fsmonitor(int version, Object last_update) {
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		if (!ModernizedCProgram.core_fsmonitor) {
			return -1;
		} 
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_push(ModernizedCProgram.core_fsmonitor);
		generatedArgs.argv_array_pushf("%d", version);
		generatedArgs.argv_array_pushf("%llu", (uintmax_t)last_update);
		cp.setUse_shell(1);
		cp.setDir(ModernizedCProgram.get_git_work_tree());
		return cp.capture_command(query_result, 1024);
	}
	public void http_status(int code, Object msg) {
		hdr.strbuf_addf("Status: %u %s\r\n", code, msg);
	}
	public void hdr_str(Object name, Object value) {
		hdr.strbuf_addf("%s: %s\r\n", name, value);
	}
	public void hdr_int(Object name, Object value) {
		hdr.strbuf_addf("%s: %llu\r\n", name, value);
	}
	public void hdr_date(Object name, Object when) {
		date_mode date_mode = new date_mode();
		byte value = ModernizedCProgram.show_date(when, 0, date_mode.date_mode_from_type(date_mode_type.DATE_RFC2822));
		hdr.hdr_str(name, value);
	}
	public void hdr_nocache() {
		hdr.hdr_str("Expires", "Fri, 01 Jan 1980 00:00:00 GMT");
		hdr.hdr_str("Pragma", "no-cache");
		hdr.hdr_str("Cache-Control", "no-cache, max-age=0, must-revalidate");
	}
	public void hdr_cache_forever() {
		timestamp_t now = .time(((Object)0));
		hdr.hdr_date("Date", now);
		hdr.hdr_date("Expires", now + 31536000);
		hdr.hdr_str("Cache-Control", "public, max-age=31536000");
	}
	public void end_headers() {
		hdr.strbuf_add("\r\n", 2);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		ModernizedCProgram.write_or_die(1, generatedBuf, generatedLen);
		hdr.strbuf_release();
	}
	public void not_found(Object err) {
		va_list params = new va_list();
		hdr.http_status(404, "Not Found");
		hdr.hdr_nocache();
		hdr.end_headers();
		.__builtin_va_start(params, err);
		if (err && err) {
			.vfprintf((_iob[2]), err, params);
		} 
		.__builtin_va_end(params);
		.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http-backend.c", 139, (false)));
	}
	public void forbidden(Object err) {
		va_list params = new va_list();
		hdr.http_status(403, "Forbidden");
		hdr.hdr_nocache();
		hdr.end_headers();
		.__builtin_va_start(params, err);
		if (err && err) {
			.vfprintf((_iob[2]), err, params);
		} 
		.__builtin_va_end(params);
		.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http-backend.c", 155, (false)));
	}
	public void select_getanyfile() {
		if (!ModernizedCProgram.getanyfile) {
			hdr.forbidden("Unsupported service: getanyfile");
		} 
	}
	public void send_strbuf(Object type, strbuf buf) {
		Object generatedLen = buf.getLen();
		hdr.hdr_int(ModernizedCProgram.content_length, generatedLen);
		hdr.hdr_str(ModernizedCProgram.content_type, type);
		hdr.end_headers();
		byte generatedBuf = buf.getBuf();
		ModernizedCProgram.write_or_die(1, generatedBuf, generatedLen);
	}
	public void send_local_file(Object the_type, Object name) {
		byte p = ModernizedCProgram.git_pathdup("%s", name);
		size_t buf_alloc = 8192;
		byte buf = ModernizedCProgram.xmalloc(buf_alloc);
		int fd;
		stat sb = new stat();
		fd = .open(p, 0);
		if (fd < 0) {
			hdr.not_found("Cannot open '%s': %s", p, .strerror((._errno())));
		} 
		if (.fstat(fd, sb) < 0) {
			ModernizedCProgram.die_errno("Cannot stat '%s'", p);
		} 
		Object generatedSt_size = sb.getSt_size();
		hdr.hdr_int(ModernizedCProgram.content_length, generatedSt_size);
		hdr.hdr_str(ModernizedCProgram.content_type, the_type);
		Object generatedSt_mtime = sb.getSt_mtime();
		hdr.hdr_date(ModernizedCProgram.last_modified, generatedSt_mtime);
		hdr.end_headers();
		for (; ; ) {
			ssize_t n = ModernizedCProgram.xread(fd, buf, buf_alloc);
			if (n < 0) {
				ModernizedCProgram.die_errno("Cannot read '%s'", p);
			} 
			if (!n) {
				break;
			} 
			ModernizedCProgram.write_or_die(1, buf, n);
		}
		.close(fd);
		ModernizedCProgram.free(buf);
		ModernizedCProgram.free(p);
	}
	public void get_text_file(Byte name) {
		hdr.select_getanyfile();
		hdr.hdr_nocache();
		hdr.send_local_file("text/plain", name);
	}
	public void get_loose_object(Byte name) {
		hdr.select_getanyfile();
		hdr.hdr_cache_forever();
		hdr.send_local_file("application/x-git-loose-object", name);
	}
	public void get_pack_file(Byte name) {
		hdr.select_getanyfile();
		hdr.hdr_cache_forever();
		hdr.send_local_file("application/x-git-packed-objects", name);
	}
	public void get_idx_file(Byte name) {
		hdr.select_getanyfile();
		hdr.hdr_cache_forever();
		hdr.send_local_file("application/x-git-packed-objects-toc", name);
	}
	public void get_info_refs(Byte arg) {
		byte service_name = ModernizedCProgram.get_parameter("service");
		strbuf buf = new strbuf(, , );
		hdr.hdr_nocache();
		rpc_service rpc_service = new rpc_service();
		Object generatedName = svc.getName();
		byte generatedBuf = buf.getBuf();
		if (service_name) {
			byte[] argv = new byte[]{((Object)/* service name */0), "--stateless-rpc", "--advertise-refs", ".", ((Object)0)};
			rpc_service svc = rpc_service.select_service(hdr, service_name);
			buf.strbuf_addf("application/x-git-%s-advertisement", generatedName);
			hdr.hdr_str(ModernizedCProgram.content_type, generatedBuf);
			hdr.end_headers();
			if (ModernizedCProgram.determine_protocol_version_server() != protocol_version.protocol_v2) {
				ModernizedCProgram.packet_write_fmt(1, "# service=git-%s\n", generatedName);
				ModernizedCProgram.packet_flush(1);
			} 
			argv[0] = generatedName;
			ModernizedCProgram.run_service(argv, 0);
		} else {
				hdr.select_getanyfile();
				ModernizedCProgram.for_each_namespaced_ref(show_text_ref, buf);
				hdr.send_strbuf("text/plain", buf);
		} 
		buf.strbuf_release();
	}
	public void get_head(Byte arg) {
		strbuf buf = new strbuf(, , );
		hdr.select_getanyfile();
		ModernizedCProgram.head_ref_namespaced(show_head_ref, buf);
		hdr.send_strbuf("text/plain", buf);
		buf.strbuf_release();
	}
	public void get_info_packs(Byte arg) {
		size_t objdirlen = .strlen(ModernizedCProgram.get_object_directory());
		strbuf buf = new strbuf(, , );
		packed_git p = new packed_git();
		size_t cnt = 0;
		hdr.select_getanyfile();
		int generatedPack_local = p.getPack_local();
		packed_git generatedNext = p.getNext();
		packed_git packed_git = new packed_git();
		for (p = packed_git.get_all_packs(ModernizedCProgram.the_repository); p; p = generatedNext) {
			if (generatedPack_local) {
				cnt++;
			} 
		}
		buf.strbuf_grow(cnt * 53 + 2);
		Object generatedPack_name = p.getPack_name();
		for (p = packed_git.get_all_packs(ModernizedCProgram.the_repository); p; p = generatedNext) {
			if (generatedPack_local) {
				buf.strbuf_addf("P %s\n", generatedPack_name + objdirlen + 6);
			} 
		}
		buf.strbuf_addch((byte)'\n');
		hdr.hdr_nocache();
		hdr.send_strbuf("text/plain; charset=utf-8", buf);
		buf.strbuf_release();
	}
	public void check_content_type(Object accepted_type) {
		byte actual_type = .getenv("CONTENT_TYPE");
		if (!actual_type) {
			actual_type = "";
		} 
		if (.strcmp(actual_type, accepted_type)) {
			hdr.http_status(415, "Unsupported Media Type");
			hdr.hdr_nocache();
			hdr.end_headers();
			ModernizedCProgram.format_write(1, "Expected POST with Content-Type '%s', but received '%s' instead.\n", accepted_type, actual_type);
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\http-backend.c", 632, (false)));
		} 
	}
	public void service_rpc(Byte service_name) {
		byte[] argv = new byte[]{((Object)0), "--stateless-rpc", ".", ((Object)0)};
		rpc_service rpc_service = new rpc_service();
		rpc_service svc = rpc_service.select_service(hdr, service_name);
		strbuf buf = new strbuf(, , );
		buf.strbuf_setlen(0);
		Object generatedName = svc.getName();
		buf.strbuf_addf("application/x-git-%s-request", generatedName);
		byte generatedBuf = buf.getBuf();
		hdr.check_content_type(generatedBuf);
		hdr.hdr_nocache();
		buf.strbuf_setlen(0);
		buf.strbuf_addf("application/x-git-%s-result", generatedName);
		hdr.hdr_str(ModernizedCProgram.content_type, generatedBuf);
		hdr.end_headers();
		argv[0] = generatedName;
		int generatedBuffer_input = svc.getBuffer_input();
		ModernizedCProgram.run_service(argv, generatedBuffer_input);
		buf.strbuf_release();
	}
	public int bad_request(Object c) {
		byte proto = .getenv("SERVER_PROTOCOL");
		if (proto && !.strcmp(proto, "HTTP/1.1")) {
			hdr.http_status(405, "Method Not Allowed");
			hdr.hdr_str("Allow", !.strcmp(c.getMethod(), "GET") ? "GET, HEAD" : c.getMethod());
		} else {
				hdr.http_status(400, "Bad Request");
		} 
		hdr.hdr_nocache();
		hdr.end_headers();
		return 0;
	}
	public int apply_cached() {
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
			 * Apply currently only reads either from stdin or a file, thus
			 * apply_all_patches would have to be updated to optionally take a
			 * buffer.
			 */));
		cp.setGit_cmd(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_pushl("apply", "--cached", ((Object)0));
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		return ModernizedCProgram.pipe_command(cp, generatedBuf, generatedLen, ((Object)0), 0, ((Object)0), 0);
	}
	public int update_index() {
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
			 * Update-index is very complicated and may need to have a public
			 * function exposed in order to remove this forking.
			 */));
		cp.setGit_cmd(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_pushl("update-index", "--add", "--stdin", ((Object)0));
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		return ModernizedCProgram.pipe_command(cp, generatedBuf, generatedLen, ((Object)0), 0, ((Object)0), 0);
	}
	public int get_untracked_files(Object ps, int include_untracked) {
		int i;
		int max_len;
		int found = 0;
		byte seen;
		dir_struct dir = new dir_struct();
		.memset(dir, 0, );
		if (include_untracked != 2) {
			dir.setup_standard_excludes();
		} 
		seen = ModernizedCProgram.xcalloc(ps.getNr(), 1);
		max_len = ModernizedCProgram.fill_directory(dir, ModernizedCProgram.the_repository.getIndex(), ps);
		int generatedNr = dir.getNr();
		dir_entry generatedEntries = dir.getEntries();
		Object generatedName = ent.getName();
		for (i = 0; i < generatedNr; i++) {
			dir_entry ent = generatedEntries[i];
			if (ModernizedCProgram.dir_path_match(ModernizedCProgram.the_index, ent, ps, max_len, seen)) {
				found++;
				untracked_files.strbuf_addstr(generatedName);
				untracked_files.strbuf_addch(/* NUL-terminate: will be fed to update-index -z */(byte)'\0');
			} 
			ModernizedCProgram.free(ent);
		}
		ModernizedCProgram.free(seen);
		ModernizedCProgram.free(generatedEntries);
		dir_entry generatedIgnored = dir.getIgnored();
		ModernizedCProgram.free(generatedIgnored);
		dir.clear_directory();
		return found/*
		 * The return value of `check_changes_tracked_files()` can be:
		 *
		 * < 0 if there was an error
		 * = 0 if there are no changes.
		 * > 0 if there are changes.
		 */;
	}
	public int check_changes(Object ps, int include_untracked) {
		int ret = 0;
		if (ModernizedCProgram.check_changes_tracked_files(ps)) {
			ret = 1;
		} 
		if (include_untracked && untracked_files.get_untracked_files(ps, include_untracked)) {
			ret = 1;
		} 
		return ret;
	}
	public int name_and_item_from_var(Object var, strbuf item) {
		byte subsection;
		byte key;
		int subsection_len;
		int parse;
		parse = .parse_config_key(var, "submodule", subsection, subsection_len, key);
		if (parse < 0 || !subsection) {
			return 0;
		} 
		name.strbuf_add(subsection, subsection_len);
		byte generatedBuf = this.getBuf();
		if (ModernizedCProgram.check_submodule_name(generatedBuf) < 0) {
			ModernizedCProgram.warning(ModernizedCProgram._("ignoring suspicious submodule name: %s"), generatedBuf);
			name.strbuf_release();
			return 0;
		} 
		item.strbuf_addstr(key);
		return 1;
	}
	public void packet_buf_flush() {
		ModernizedCProgram.packet_trace("0000", 4, 1);
		ModernizedCProgram.buf.strbuf_add("0000", 4);
	}
	public void packet_buf_delim() {
		ModernizedCProgram.packet_trace("0001", 4, 1);
		ModernizedCProgram.buf.strbuf_add("0001", 4);
	}
	public void format_packet(Object prefix, Object fmt, Object args) {
		size_t orig_len = new size_t();
		size_t n = new size_t();
		Object generatedLen = this.getLen();
		orig_len = generatedLen;
		out.strbuf_addstr("0000");
		out.strbuf_addstr(prefix);
		out.strbuf_vaddf(fmt, args);
		n = generatedLen - orig_len;
		if (n > 65520) {
			ModernizedCProgram.die(ModernizedCProgram._("protocol error: impossibly long line"));
		} 
		byte generatedBuf = this.getBuf();
		ModernizedCProgram.set_packet_header(generatedBuf[orig_len], n);
		ModernizedCProgram.packet_trace(generatedBuf + orig_len + 4, n - 4, 1);
	}
	public void packet_buf_write(Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		ModernizedCProgram.buf.format_packet("", fmt, args);
		.__builtin_va_end(args);
	}
	public void packet_buf_write_len(Object data, Object len) {
		size_t orig_len = new size_t();
		size_t n = new size_t();
		orig_len = ModernizedCProgram.buf.getLen();
		ModernizedCProgram.buf.strbuf_addstr("0000");
		ModernizedCProgram.buf.strbuf_add(data, len);
		n = ModernizedCProgram.buf.getLen() - orig_len;
		if (n > 65520) {
			ModernizedCProgram.die(ModernizedCProgram._("protocol error: impossibly long line"));
		} 
		ModernizedCProgram.set_packet_header(ModernizedCProgram.buf.getBuf()[orig_len], n);
		ModernizedCProgram.packet_trace(data, len, 1);
	}
	public Object read_packetized_to_strbuf(int fd_in) {
		int packet_len;
		Object generatedLen = this.getLen();
		size_t orig_len = generatedLen;
		Object generatedAlloc = this.getAlloc();
		size_t orig_alloc = generatedAlloc;
		byte generatedBuf = this.getBuf();
		for (; ; ) {
			sb_out.strbuf_grow((65520 - 4));
			packet_len = ModernizedCProgram.packet_read(fd_in, ((Object)0), ((Object)0/* strbuf_grow() above always allocates one extra byte to
						 * store a '\0' at the end of the string. packet_read()
						 * writes a '\0' extra byte at the end, too. Let it know
						 * that there is already room for the extra byte.
						 */), generatedBuf + generatedLen, (65520 - 4) + 1, (-1024 << 0));
			if (packet_len <= 0) {
				break;
			} 
			generatedLen += packet_len;
		}
		if (packet_len < 0) {
			if (orig_alloc == 0) {
				sb_out.strbuf_release();
			} else {
					sb_out.strbuf_setlen(orig_len);
			} 
			return packet_len;
		} 
		return generatedLen - orig_len;
	}
	public int replace_parents(int argc, Object argv) {
		strbuf new_parents = new strbuf(, , );
		byte parent_start;
		byte parent_end;
		int i;
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		parent_start = ModernizedCProgram.buf.getBuf();
		parent_start += hexsz + /* "tree " + "hex sha1" + "\n" */6;
		parent_end = parent_start;
		while (ModernizedCProgram.starts_with(parent_end, "parent ")) {
			parent_end += hexsz + /* "parent " + "hex sha1" + "\n" */8;
		}
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		for (i = 0; i < argc; /* prepare new parents */i++) {
			object_id oid = new object_id();
			commit commit = new commit();
			if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, argv[i], oid) < 0) {
				new_parents.strbuf_release();
				return ();
			} 
			commit = .lookup_commit_reference(ModernizedCProgram.the_repository, oid);
			if (!commit) {
				new_parents.strbuf_release();
				return ();
			} 
			new_parents.strbuf_addf("parent %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		}
		byte generatedBuf = new_parents.getBuf();
		Object generatedLen = new_parents.getLen();
		ModernizedCProgram.buf.strbuf_splice(parent_start - ModernizedCProgram.buf.getBuf(), parent_end - /* replace existing parents with new ones */parent_start, generatedBuf, generatedLen);
		new_parents.strbuf_release();
		return 0;
	}
	public void strbuf_add_indented_text(Object text, int indent, int indent2) {
		if (indent < 0) {
			indent = 0;
		} 
		while (text) {
			byte eol = ModernizedCProgram.gitstrchrnul(text, (byte)'\n');
			if (eol == (byte)'\n') {
				eol++;
			} 
			ModernizedCProgram.buf.strbuf_addchars((byte)' ', indent);
			ModernizedCProgram.buf.strbuf_add(text, eol - text);
			text = eol;
			indent = indent2/*
			 * Wrap the text, if necessary. The variable indent is the indent for the
			 * first line, indent2 is the indent for all other lines.
			 * If indent is negative, assume that already -indent columns have been
			 * consumed (and no extra indent is necessary for the first line).
			 */;
		}
	}
	public void strbuf_add_wrapped_text(Object text, int indent1, int indent2, int width) {
		int indent;
		int w;
		int assume_utf8 = 1;
		byte bol;
		byte space;
		byte start = text;
		size_t orig_len = ModernizedCProgram.buf.getLen();
		if (width <= 0) {
			ModernizedCProgram.buf.strbuf_add_indented_text(text, indent1, indent2);
			return ;
		} 
		w = indent = indent1;
		space = ((Object)0);
		if (indent < 0) {
			w = -indent;
			space = text;
		} 
	}
	public void strbuf_add_wrapped_bytes(Object data, int len, int indent, int indent2, int width) {
		byte tmp = ModernizedCProgram.xstrndup(data, len);
		ModernizedCProgram.buf.strbuf_add_wrapped_text(tmp, indent, indent2, width);
		ModernizedCProgram.free(tmp);
	}
	public void strbuf_utf8_replace(int pos, int width, Object subst) {
		strbuf sb_dst = new strbuf(, , );
		byte generatedBuf = this.getBuf();
		byte src = generatedBuf;
		Object generatedLen = this.getLen();
		byte end = src + generatedLen;
		byte dst;
		int w = 0;
		int subst_len = 0;
		if (subst) {
			subst_len = .strlen(subst);
		} 
		sb_dst.strbuf_grow(generatedLen + subst_len);
		dst = generatedBuf;
		while (src < end) {
			byte old;
			size_t n = new size_t();
			while ((n = ModernizedCProgram.display_mode_esc_sequence_len(src))) {
				.memcpy(dst, src, n);
				src += n;
				dst += n;
			}
			if (src >= end) {
				break;
			} 
			old = src;
			n = ModernizedCProgram.utf8_width((byte)src, ((Object)0));
			if (!/* broken utf-8, do nothing */src) {
				;
			} 
			if (n && w >= pos && w < pos + width) {
				if (subst) {
					.memcpy(dst, subst, subst_len);
					dst += subst_len;
					subst = ((Object)0);
				} 
				w += n;
				continue;
			} 
			.memcpy(dst, old, src - old);
			dst += src - old;
			w += n;
		}
		sb_dst.strbuf_setlen(dst - generatedBuf);
		sb_src.strbuf_swap(sb_dst);
	}
	public void strbuf_utf8_align( position, int width, Object s) {
		int slen = .strlen(s);
		int display_len = ModernizedCProgram.utf8_strnwidth(s, slen, 0);
		int utf8_compensation = slen - display_len;
		if (display_len >= width) {
			ModernizedCProgram.buf.strbuf_addstr(s);
			return ;
		} 
		if (position == .ALIGN_LEFT) {
			ModernizedCProgram.buf.strbuf_addf("%-*s", width + utf8_compensation, s);
		}  else if (position == .ALIGN_MIDDLE) {
			int left = (width - display_len) / 2;
			ModernizedCProgram.buf.strbuf_addf("%*s%-*s", left, "", width - left + utf8_compensation, s);
		}  else if (position == .ALIGN_RIGHT) {
			ModernizedCProgram.buf.strbuf_addf("%*s", width + utf8_compensation, s);
		} 
	}
	public int show_tree(Object oid, Object pathname, int mode, int stage, Object context) {
		int retval = 0;
		int baselen;
		byte type = ModernizedCProgram.blob_type;
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if ((((mode) & -1024) == 160000/*
				 * Maybe we want to have some recursive version here?
				 *
				 * Something similar to this incomplete example:
				 *
				if (show_subprojects(base, baselen, pathname))
					retval = READ_TREE_RECURSIVE;
				 *
				 */)) {
			type = ModernizedCProgram.commit_type;
		}  else if ((((mode) & -1024) == -1024)) {
			if (ModernizedCProgram.show_recursive(generatedBuf, generatedLen, pathname)) {
				retval = 1;
				if (!(ModernizedCProgram.ls_options & 4)) {
					return retval;
				} 
			} 
			type = ModernizedCProgram.tree_type;
		}  else if (ModernizedCProgram.ls_options & 2) {
			return 0;
		} 
		if (!(ModernizedCProgram.ls_options & 8)) {
			if (ModernizedCProgram.ls_options & 16) {
				byte[] size_text = new byte[24];
				if (!.strcmp(type, ModernizedCProgram.blob_type)) {
					long size;
					if (ModernizedCProgram.the_repository.oid_object_info(oid, size) == object_type.OBJ_BAD) {
						ModernizedCProgram.xsnprintf(size_text, , "BAD");
					} else {
							ModernizedCProgram.xsnprintf(size_text, , "%llu", (uintmax_t)size);
					} 
				} else {
						ModernizedCProgram.xsnprintf(size_text, , "-");
				} 
				.printf("%06o %s %s %7s\t", mode, type, ModernizedCProgram.the_repository.repo_find_unique_abbrev(oid, ModernizedCProgram.abbrev), size_text);
			} else {
					.printf("%06o %s %s\t", mode, type, ModernizedCProgram.the_repository.repo_find_unique_abbrev(oid, ModernizedCProgram.abbrev));
			} 
		} 
		baselen = generatedLen;
		base.strbuf_addstr(pathname);
		(_iob[1]).write_name_quoted_relative(generatedBuf, ModernizedCProgram.chomp_prefix ? ModernizedCProgram.ls_tree_prefix : ((Object)0), ModernizedCProgram.line_termination);
		base.strbuf_setlen(baselen);
		return retval;
	}
	public int sign_buffer(strbuf signature, Object signing_key) {
		child_process gpg = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		int ret;
		size_t i = new size_t();
		size_t j = new size_t();
		size_t bottom = new size_t();
		strbuf gpg_status = new strbuf(, , );
		argv_array generatedArgs = gpg.getArgs();
		generatedArgs.argv_array_pushl(ModernizedCProgram.use_format.getProgram(), "--status-fd=2", "-bsau", signing_key, ((Object)0));
		Object generatedLen = signature.getLen();
		bottom = generatedLen;
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		ret = ModernizedCProgram.pipe_command(gpg, ModernizedCProgram.buffer.getBuf(), generatedLen, signature, 1024, gpg_status, 0);
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		byte generatedBuf = gpg_status.getBuf();
		ret |=  !.strstr(generatedBuf, "\n[GNUPG:] SIG_CREATED ");
		gpg_status.strbuf_release();
		if (ret) {
			return ();
		} 
		for (i = j = bottom; i < generatedLen; /* Strip CR from the line endings, in case we are on Windows. */i++) {
			if (generatedBuf[i] != (byte)'\r') {
				if (i != j) {
					generatedBuf[j] = generatedBuf[i];
				} 
				j++;
			} 
		}
		signature.strbuf_setlen(j);
		return 0;
	}
	public int verify_signed_buffer(Object payload, Object payload_size, Object signature, Object signature_size, strbuf gpg_status) {
		child_process gpg = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		gpg_format fmt = new gpg_format();
		tempfile temp = new tempfile();
		int ret;
		strbuf buf = new strbuf(, , );
		tempfile tempfile = new tempfile();
		temp = tempfile.mks_tempfile_t(".git_vtag_tmpXXXXXX");
		if (!temp) {
			return ();
		} 
		Object generatedFd = temp.getFd();
		if (ModernizedCProgram.write_in_full(generatedFd, signature, signature_size) < 0 || temp.close_tempfile_gently() < 0) {
			();
			temp.delete_tempfile();
			return -1;
		} 
		gpg_format gpg_format = new gpg_format();
		fmt = gpg_format.get_format_by_sig(signature);
		if (!fmt) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\gpg-interface.c", 358, "bad signature '%s'", signature);
		} 
		argv_array generatedArgs = gpg.getArgs();
		Object generatedProgram = fmt.getProgram();
		generatedArgs.argv_array_push(generatedProgram);
		Object generatedVerify_args = fmt.getVerify_args();
		generatedArgs.argv_array_pushv(generatedVerify_args);
		strbuf generatedFilename = temp.getFilename();
		byte generatedBuf = generatedFilename.getBuf();
		generatedArgs.argv_array_pushl("--status-fd=1", "--verify", generatedBuf, "-", ((Object)0));
		if (!gpg_status) {
			gpg_status = buf;
		} 
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		ret = ModernizedCProgram.pipe_command(gpg, payload, payload_size, gpg_status, 0, gpg_output, 0);
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		temp.delete_tempfile();
		ret |=  !.strstr(generatedBuf, "\n[GNUPG:] GOODSIG ");
		/* no matter it was used or not */buf.strbuf_release();
		return ret;
	}
	public void lf_to_crlf() {
		byte new_msg;
		size_t i = new size_t();
		size_t j = new size_t();
		byte lastc;
		for (; i < ModernizedCProgram.msg.getLen(); /* First pass: tally, in j, the size of the new_msg string: */i++) {
			if (ModernizedCProgram.msg.getBuf()[i] == (byte)'\n' && lastc != (byte)'\r') {
				/* a CR will need to be added here */j++;
			} 
			lastc = ModernizedCProgram.msg.getBuf()[i];
			j++;
		}
		new_msg = ModernizedCProgram.xmallocz(j/*
			 * Second pass: write the new_msg string.  Note that this loop is
			 * otherwise identical to the first pass.
			 */);
		for (; i < ModernizedCProgram.msg.getLen(); i++) {
			if (ModernizedCProgram.msg.getBuf()[i] == (byte)'\n' && lastc != (byte)'\r') {
				new_msg[j++] = (byte)'\r';
			} 
			lastc = new_msg[j++] = ModernizedCProgram.msg.getBuf()[i];
		}
		ModernizedCProgram.msg.strbuf_attach(new_msg, j, j + 1/*
		 * Store msg to IMAP.  Also detach and free the data from msg->data,
		 * leaving msg->data empty.
		 */);
	}
	public void wrap_in_html() {
		strbuf buf = new strbuf(, , );
		byte content_type = "Content-Type: text/html;\n";
		byte pre_open = "<pre>\n";
		byte pre_close = "</pre>\n";
		byte body = .strstr(ModernizedCProgram.msg.getBuf(), "\n\n");
		if (!body) {
			return ;
		} 
		body += 2;
		buf.strbuf_add(ModernizedCProgram.msg.getBuf(), body - ModernizedCProgram.msg.getBuf() - 1);
		buf.strbuf_addstr(content_type);
		buf.strbuf_addch((byte)'\n');
		buf.strbuf_addstr(pre_open);
		buf.strbuf_addstr_xml_quoted(body);
		buf.strbuf_addstr(pre_close);
		ModernizedCProgram.msg.strbuf_release();
		ModernizedCProgram.msg = buf;
	}
	public int count_messages() {
		int count = 0;
		byte generatedBuf = this.getBuf();
		byte p = generatedBuf;
		while (1) {
			if (ModernizedCProgram.starts_with(p, "From ")) {
				p = .strstr(p + 5, "\nFrom: ");
				if (!p) {
					break;
				} 
				p = .strstr(p + 7, "\nDate: ");
				if (!p) {
					break;
				} 
				p = .strstr(p + 7, "\nSubject: ");
				if (!p) {
					break;
				} 
				p += 10;
				count++;
			} 
			p = .strstr(p + 5, "\nFrom ");
			if (!p) {
				break;
			} 
			p++;
		}
		return count/*
		 * Copy the next message from all_msgs, starting at offset *ofs, to
		 * msg.  Update *ofs to the start of the following message.  Return
		 * true iff a message was successfully copied.
		 */;
	}
	public int split_msg(strbuf msg, int ofs) {
		byte p;
		byte data;
		size_t len = new size_t();
		Object generatedLen = this.getLen();
		if (ofs >= generatedLen) {
			return 0;
		} 
		byte generatedBuf = this.getBuf();
		data = generatedBuf[ofs];
		len = generatedLen - ofs;
		if (len < 5 || !ModernizedCProgram.starts_with(data, "From ")) {
			return 0;
		} 
		p = .strchr(data, (byte)'\n');
		if (p) {
			p++;
			len -= p - data;
			ofs += p - data;
			data = p;
		} 
		p = .strstr(data, "\nFrom ");
		if (p) {
			len = p[1] - data;
		} 
		msg.strbuf_add(data, len);
		ofs += len;
		return 1;
	}
	public Byte url_decode_internal(Object query, int len, Object stop_at, int decode_plus) {
		byte q = query;
		while (len) {
			byte c = q;
			if (!c) {
				break;
			} 
			if (stop_at && .strchr(stop_at, c)) {
				q++;
				len--;
				break;
			} 
			if (c == (byte)'%' && (len < 0 || len >= 3)) {
				int val = ModernizedCProgram.hex2chr(q + 1);
				if (0 < val) {
					out.strbuf_addch(val);
					q += 3;
					len -= 3;
					continue;
				} 
			} 
			if (decode_plus && c == (byte)'+') {
				out.strbuf_addch((byte)' ');
			} else {
					out.strbuf_addch(c);
			} 
			q++;
			len--;
		}
		query = q;
		return out.strbuf_detach(((Object)0));
	}
	public void end_url_with_slash(Object url) {
		ModernizedCProgram.buf.strbuf_addstr(url);
		ModernizedCProgram.buf.strbuf_complete((byte)'/');
	}
	public int prune_worktree(Object id) {
		stat st = new stat();
		byte path;
		int fd;
		size_t len = new size_t();
		ssize_t read_result = new ssize_t();
		if (!ModernizedCProgram.is_directory(ModernizedCProgram.git_path("worktrees/%s", id))) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: not a valid directory"), id);
			return 1;
		} 
		if (ModernizedCProgram.file_exists(ModernizedCProgram.git_path("worktrees/%s/locked", id))) {
			return 0;
		} 
		if (.stat(ModernizedCProgram.git_path("worktrees/%s/gitdir", id), st)) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: gitdir file does not exist"), id);
			return 1;
		} 
		fd = .open(ModernizedCProgram.git_path("worktrees/%s/gitdir", id), 0);
		if (fd < 0) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: unable to read gitdir file (%s)"), id, .strerror((._errno())));
			return 1;
		} 
		Object generatedSt_size = st.getSt_size();
		len = ModernizedCProgram.xsize_t(generatedSt_size);
		path = ModernizedCProgram.xmallocz(len);
		read_result = ModernizedCProgram.read_in_full(fd, path, len);
		if (read_result < 0) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: unable to read gitdir file (%s)"), id, .strerror((._errno())));
			.close(fd);
			ModernizedCProgram.free(path);
			return 1;
		} 
		.close(fd);
		if (read_result != len) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: short read (expected %llu bytes, read %llu)"), id, (uintmax_t)len, (uintmax_t)read_result);
			ModernizedCProgram.free(path);
			return 1;
		} 
		while (len && (path[len - 1] == (byte)'\n' || path[len - 1] == (byte)'\r')) {
			len--;
		}
		if (!len) {
			reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: invalid gitdir file"), id);
			ModernizedCProgram.free(path);
			return 1;
		} 
		path[len] = (byte)'\0';
		Object generatedSt_mtime = st.getSt_mtime();
		if (!ModernizedCProgram.file_exists(path)) {
			ModernizedCProgram.free(path);
			if (.stat(ModernizedCProgram.git_path("worktrees/%s/index", id), st) || generatedSt_mtime <= ModernizedCProgram.expire) {
				reason.strbuf_addf(ModernizedCProgram._("Removing worktrees/%s: gitdir file points to non-existent location"), id);
				return 1;
			} else {
					return 0;
			} 
		} 
		ModernizedCProgram.free(path);
		return 0;
	}
	public int read_patch_file(int fd) {
		if (sb.strbuf_read(fd, 0) < 0) {
			return ();
		} 
		sb.strbuf_grow((true));
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		.memset(generatedBuf + generatedLen, 0, (true));
		return 0;
	}
	public Byte find_name_gnu(Object line, int p_value) {
		strbuf name = new strbuf(, , );
		byte cp;
		/*
			 * Proposed "new-style" GNU patch/diff format; see
			 * https://public-inbox.org/git/7vll0wvb2a.fsf@assigned-by-dhcp.cox.net/
			 */
		if (name.unquote_c_style(line, ((Object)0))) {
			name.strbuf_release();
			return ((Object)0);
		} 
		byte generatedBuf = name.getBuf();
		for (cp = generatedBuf; p_value; p_value--) {
			cp = .strchr(cp, (byte)'/');
			if (!cp) {
				name.strbuf_release();
				return ((Object)0);
			} 
			cp++;
		}
		name.strbuf_remove(0, cp - generatedBuf);
		Object generatedLen = this.getLen();
		if (generatedLen) {
			name.strbuf_insert(0, generatedBuf, generatedLen);
		} 
		return ModernizedCProgram.squash_slash(name.strbuf_detach(((Object)0)));
	}
	public Byte find_name_common(Object line, Object def, int p_value, Object end, int terminate) {
		int len;
		byte start = ((Object)0);
		if (p_value == 0) {
			start = line;
		} 
		while (line != end) {
			byte c = line;
			if (!end && ((ModernizedCProgram.sane_ctype[(byte)(c)] & (true)) != 0)) {
				if (c == (byte)'\n') {
					break;
				} 
				if (ModernizedCProgram.name_terminate(c, terminate)) {
					break;
				} 
			} 
			line++;
			if (c == (byte)'/' && !--p_value) {
				start = line;
			} 
		}
		if (!start) {
			return ModernizedCProgram.squash_slash(ModernizedCProgram.xstrdup_or_null(def));
		} 
		len = line - start;
		if (!len) {
			return ModernizedCProgram.squash_slash(ModernizedCProgram.xstrdup_or_null(def/*
				 * Generally we prefer the shorter name, especially
				 * if the other one is just a variation of that with
				 * something else tacked on to the end (ie "file.orig"
				 * or "file~").
				 */));
		} 
		if (def) {
			int deflen = .strlen(def);
			if (deflen < len && !.strncmp(start, def, deflen)) {
				return ModernizedCProgram.squash_slash(ModernizedCProgram.xstrdup(def));
			} 
		} 
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		if (generatedLen) {
			byte ret = ModernizedCProgram.xstrfmt("%s%.*s", generatedBuf, len, start);
			return ModernizedCProgram.squash_slash(ret);
		} 
		return ModernizedCProgram.squash_slash(ModernizedCProgram.xmemdupz(start, len));
	}
	public Byte find_name(Object line, Byte def, int p_value, int terminate) {
		if (line == (byte)'"') {
			byte name = root.find_name_gnu(line, p_value);
			if (name) {
				return name;
			} 
		} 
		return root.find_name_common(line, def, p_value, ((Object)0), terminate);
	}
	public Byte find_name_traditional(Object line, Byte def, int p_value) {
		size_t len = new size_t();
		size_t date_len = new size_t();
		if (line == (byte)'"') {
			byte name = root.find_name_gnu(line, p_value);
			if (name) {
				return name;
			} 
		} 
		len = ModernizedCProgram.gitstrchrnul(line, (byte)'\n') - line;
		date_len = ModernizedCProgram.diff_timestamp_len(line, len);
		if (!date_len) {
			return root.find_name_common(line, def, p_value, ((Object)0), 2);
		} 
		len -= date_len;
		return root.find_name_common(line, def, p_value, line + len, 0/*
		 * Given the string after "--- " or "+++ ", guess the appropriate
		 * p_value for the given patch.
		 */);
	}
	public int read_blob_object(Object oid, int mode) {
		if ((((mode) & -1024) == 160000)) {
			ModernizedCProgram.buf.strbuf_grow(100);
			ModernizedCProgram.buf.strbuf_addf("Subproject commit %s\n", ModernizedCProgram.oid_to_hex(oid));
		} else {
				object_type type;
				long sz;
				byte result;
				result = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, sz);
				if (!result) {
					return -1;
				} 
				ModernizedCProgram.buf.strbuf_attach(result, sz, sz + /* XXX read_sha1_file NUL-terminates */1);
		} 
		return 0;
	}
	public int read_file_or_gitlink(Object ce) {
		if (!ce) {
			return 0;
		} 
		return ModernizedCProgram.buf.read_blob_object(ce.getOid(), ce.getCe_mode());
	}
	public void print_remote_to_local(Object remote, Object local) {
		display.strbuf_addf("%-*s -> %s", ModernizedCProgram.refcol_width, remote, local);
	}
	public int find_and_replace(Object needle, Object placeholder) {
		byte p = ((Object)0);
		int plen;
		int nlen;
		nlen = .strlen(needle);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (ModernizedCProgram.ends_with(generatedBuf, needle)) {
			p = generatedBuf + generatedLen - nlen;
		} else {
				p = .strstr(generatedBuf, needle);
		} 
		if (!p) {
			return 0;
		} 
		if (p > generatedBuf && p[-1] != (byte)'/') {
			return 0;
		} 
		plen = .strlen(p);
		if (plen > nlen && p[nlen] != (byte)'/') {
			return 0;
		} 
		haystack.strbuf_splice(p - generatedBuf, nlen, placeholder, .strlen(placeholder));
		return 1;
	}
	public void print_compact(Object remote, Object local) {
		strbuf r = new strbuf(, , );
		strbuf l = new strbuf(, , );
		if (!.strcmp(remote, local)) {
			display.strbuf_addf("%-*s -> *", ModernizedCProgram.refcol_width, remote);
			return ;
		} 
		r.strbuf_addstr(remote);
		l.strbuf_addstr(local);
		if (!r.find_and_replace(local, "*")) {
			l.find_and_replace(remote, "*");
		} 
		byte generatedBuf = r.getBuf();
		display.print_remote_to_local(generatedBuf, generatedBuf);
		r.strbuf_release();
		l.strbuf_release();
	}
	public void format_display(byte code, Object summary, Object error, Object remote, Object local, int summary_width) {
		int width = (summary_width + .strlen(summary) - ModernizedCProgram.gettext_width(summary));
		display.strbuf_addf("%c %-*s ", code, width, summary);
		if (!ModernizedCProgram.compact_format) {
			display.print_remote_to_local(remote, local);
		} else {
				display.print_compact(remote, local);
		} 
		if (error) {
			display.strbuf_addf("  (%s)", error);
		} 
	}
	public int fetch_failed_to_start(Object cb, Object task_cb) {
		parallel_fetch_state state = cb;
		byte remote = task_cb;
		state.setResult(());
		return 0;
	}
	public int fetch_finished(int result, Object cb, Object task_cb) {
		parallel_fetch_state state = cb;
		byte remote = task_cb;
		if (result) {
			out.strbuf_addf(ModernizedCProgram._("could not fetch '%s' (exit code: %d)\n"), remote, result);
			state.setResult(-1);
		} 
		return 0;
	}
	public int show_tree_object(Object oid, Object pathname, int mode, int stage, Object context) {
		FILE file = context;
		.fprintf(file, "%s%s\n", pathname, (((mode) & -1024) == -1024) ? "/" : "");
		return 0;
	}
	public void add_branch_description(Object branch_name) {
		strbuf desc = new strbuf(, , );
		if (!branch_name || !branch_name) {
			return ;
		} 
		desc.read_branch_desc(branch_name);
		Object generatedLen = desc.getLen();
		if (generatedLen) {
			ModernizedCProgram.buf.strbuf_addch((byte)'\n');
			ModernizedCProgram.buf.strbuf_addbuf(desc);
			ModernizedCProgram.buf.strbuf_addch((byte)'\n');
		} 
		desc.strbuf_release();
	}
	public Object diff_title(int reroll_count, Object generic, Object rerolled) {
		if (reroll_count <= 0) {
			sb.strbuf_addstr(generic);
		} else {
				sb.strbuf_addf(rerolled, reroll_count - /* RFC may be v0, so allow -v1 to diff against v0 */1);
		} 
		byte generatedBuf = this.getBuf();
		return generatedBuf;
	}
	public int write_shallow_commits_1(int use_pack_protocol, Object extra, int flags) {
		write_shallow_data data = new write_shallow_data();
		int i;
		data.setOut(out);
		data.setUse_pack_protocol(use_pack_protocol);
		data.setCount(0);
		data.setFlags(flags);
		.for_each_commit_graft(write_one_shallow, data);
		int generatedCount = data.getCount();
		if (!extra) {
			return generatedCount;
		} 
		for (i = 0; i < extra.getNr(); i++) {
			out.strbuf_addstr(ModernizedCProgram.oid_to_hex(extra.getOid() + i));
			out.strbuf_addch((byte)'\n');
			generatedCount++;
		}
		return generatedCount;
	}
	public int write_shallow_commits(int use_pack_protocol, Object extra) {
		return out.write_shallow_commits_1(use_pack_protocol, extra, 0);
	}
	public void handle_property(Object key_buf, Object type_set) {
		byte key = key_buf.getBuf();
		size_t keylen = key_buf.getLen();
		Object generatedLog = rev_ctx.getLog();
		Object generatedAuthor = rev_ctx.getAuthor();
		byte generatedBuf = this.getBuf();
		Object generatedTimestamp = rev_ctx.getTimestamp();
		switch (keylen + 1) {
		case :
				if (.memcmp(key, "svn:date",  - 1)) {
					break;
				} 
				if (!val) {
					ModernizedCProgram.die("invalid dump: unsets svn:date");
				} 
				if (ModernizedCProgram.parse_date_basic(generatedBuf, generatedTimestamp, ((Object)0))) {
					ModernizedCProgram.warning("invalid timestamp: %s", generatedBuf);
				} 
				break;
		case :
		case :
				if (.memcmp(key, "svn:author",  - 1)) {
					break;
				} 
				if (!val) {
					generatedAuthor.strbuf_setlen(0);
				} else {
						generatedAuthor.strbuf_swap(val);
				} 
				break;
		case :
				if (.memcmp(key, "svn:log",  - 1)) {
					break;
				} 
				if (!val) {
					ModernizedCProgram.die("invalid dump: unsets svn:log");
				} 
				generatedLog.strbuf_swap(val);
				break;
		case :
				if (keylen == .strlen("svn:executable") && .memcmp(key, "svn:executable",  - 1)) {
					break;
				} 
				if (keylen == .strlen("svn:special") && .memcmp(key, "svn:special",  - 1)) {
					break;
				} 
				if (type_set) {
					if (!val) {
						return ;
					} 
					ModernizedCProgram.die("invalid dump: sets type twice");
				} 
				if (!val) {
					node_ctx.setType(-1024 | 644);
					return ;
				} 
				type_set = 1;
				node_ctx.setType(keylen == .strlen("svn:executable") ? (-1024 | 755) : S_IFLNK);
		}
	}
	public int recreate_opt(Object opt, Object arg, int unset) {
		sb.strbuf_setlen(0);
		if (opt.getLong_name()) {
			sb.strbuf_addstr(unset ? "--no-" : "--");
			sb.strbuf_addstr(opt.getLong_name());
			if (arg) {
				sb.strbuf_addch((byte)'=');
				sb.strbuf_addstr(arg);
			} 
		}  else if (opt.getShort_name() && !unset) {
			sb.strbuf_addch((byte)'-');
			sb.strbuf_addch(opt.getShort_name());
			if (arg) {
				sb.strbuf_addstr(arg);
			} 
		} else {
				return -1;
		} 
		return 0/**
		 * For an option opt, recreates the command-line option in opt->value which
		 * must be an char* initialized to NULL. This is useful when we need to pass
		 * the command-line option to another command. Since any previous value will be
		 * overwritten, this callback should only be used for options where the last
		 * one wins.
		 */;
	}
	public void show_date_relative(Object time) {
		timeval now = new timeval();
		timestamp_t diff = new timestamp_t();
		now.get_time();
		Object generatedTv_sec = now.getTv_sec();
		if (generatedTv_sec < time) {
			timebuf.strbuf_addstr(ModernizedCProgram._("in the future"));
			return ;
		} 
		diff = generatedTv_sec - time;
		if (diff < 90) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu second ago", "%llu seconds ago", diff), diff);
			return ;
		} 
		diff = (diff + 30) / /* Turn it into minutes */60;
		if (diff < 90) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu minute ago", "%llu minutes ago", diff), diff);
			return ;
		} 
		diff = (diff + 30) / /* Turn it into hours */60;
		if (diff < 36) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu hour ago", "%llu hours ago", diff), diff);
			return ;
		} 
		diff = (diff + 12) / /* We deal with number of days from here on */24;
		if (diff < 14) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu day ago", "%llu days ago", diff), diff);
			return ;
		} 
		if (diff < /* Say weeks for the past 10 weeks or so */70) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu week ago", "%llu weeks ago", (diff + 3) / 7), (diff + 3) / 7);
			return ;
		} 
		if (diff < /* Say months for the past 12 months or so */365) {
			timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu month ago", "%llu months ago", (diff + 15) / 30), (diff + 15) / 30);
			return ;
		} 
		byte generatedBuf = sb.getBuf();
		if (diff < /* Give years and months for 5 years or so */1825) {
			timestamp_t totalmonths = (diff * 12 * 2 + 365) / (365 * 2);
			timestamp_t years = totalmonths / 12;
			timestamp_t months = totalmonths % 12;
			if (months) {
				strbuf sb = new strbuf(, , );
				sb.strbuf_addf(ModernizedCProgram.Q_("%llu year", "%llu years", years), years);
				timebuf.strbuf_addf(ModernizedCProgram.Q_("%s, %llu month ago", "%s, %llu months ago", /* TRANSLATORS: "%s" is "<n> years" */months), generatedBuf, months);
				sb.strbuf_release();
			} else {
					timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu year ago", "%llu years ago", years), years);
			} 
			return ;
		} 
		/* Otherwise, just years. Centuries is probably overkill. */timebuf.strbuf_addf(ModernizedCProgram.Q_("%llu year ago", "%llu years ago", (diff + 183) / 365), (diff + 183) / 365);
	}
	public void date_string(Object date, int offset) {
		int sign = (byte)'+';
		if (offset < 0) {
			offset = -offset;
			sign = (byte)'-';
		} 
		ModernizedCProgram.buf.strbuf_addf("%llu %c%02d%02d", date, sign, offset / 60, offset % 60/*
		 * Parse a string like "0 +0000" as ancient timestamp near epoch, but
		 * only when it appears not as part of any other string.
		 */);
	}
	public int parse_date(Object date) {
		timestamp_t timestamp = new timestamp_t();
		int offset;
		if (ModernizedCProgram.parse_date_basic(date, timestamp, offset)) {
			return -1;
		} 
		result.date_string(timestamp, offset);
		return 0;
	}
	public void datestamp() {
		time_t now = new time_t();
		int offset;
		.time(now);
		offset = ModernizedCProgram.tm_to_time_t(.localtime(now)) - now;
		offset /= 60;
		out/*
		 * Relative time update (eg "2 days ago").  If we haven't set the time
		 * yet, we need to set it from current time.
		 */.date_string(now, offset);
	}
	/* parse @something syntax, when 'something' is not {.*} */
	public int interpret_empty_at(Object name, int namelen, int len) {
		byte next;
		if (len || name[1] == (byte)'{') {
			return -1;
		} 
		next = .memchr(name + len + 1, (byte)'@', namelen - len - /* make sure it's a single @, or @@{.*}, not @foo */1);
		if (next && next[1] != (byte)'{') {
			return -1;
		} 
		if (!next) {
			next = name + namelen;
		} 
		if (next != name + 1) {
			return -1;
		} 
		ModernizedCProgram.buf.strbuf_setlen(0);
		ModernizedCProgram.buf.strbuf_add("HEAD", 4);
		return 1;
	}
	public void strbuf_branchname(Object name, int allowed) {
		int len = .strlen(name);
		int used = ModernizedCProgram.repo_interpret_branch_name(ModernizedCProgram.the_repository, name, len, sb, allowed);
		if (used < 0) {
			used = 0;
		} 
		sb.strbuf_add(name + used, len - used);
	}
	public int strbuf_check_branch_ref(Object name) {
		if (ModernizedCProgram.startup_info.getHave_repository()) {
			sb.strbuf_branchname(name, (1 << 0));
		} else {
				sb.strbuf_addstr(name/*
					 * This splice must be done even if we end up rejecting the
					 * name; builtin/branch.c::copy_or_rename_branch() still wants
					 * to see what the name expanded to so that "branch -m" can be
					 * used as a tool to correct earlier mistakes.
					 */);
		} 
		sb.strbuf_splice(0, 0, "refs/heads/", 11);
		byte generatedBuf = this.getBuf();
		if (name == (byte)'-' || !.strcmp(generatedBuf, "refs/heads/HEAD")) {
			return -1;
		} 
		return ModernizedCProgram.check_refname_format(generatedBuf, 0/*
		 * This is like "get_oid_basic()", except it allows "object ID expressions",
		 * notably "xyz^" for "parent of xyz"
		 */);
	}
	public int launch_specified_editor(Object editor, Object path, Object env) {
		if (!editor) {
			return ();
		} 
		if (.strcmp(editor, ":")) {
			byte[] args = new byte[]{editor, ModernizedCProgram.real_path(path), ((Object)0)};
			child_process p = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
			int ret;
			int sig;
			int print_waiting_for_editor = ModernizedCProgram.advice_waiting_for_editor && .isatty(2);
			if (print_waiting_for_editor/*
						 * A dumb terminal cannot erase the line later on. Add a
						 * newline to separate the hint from subsequent output.
						 *
						 * Make sure that our message is separated with a whitespace
						 * from further cruft that may be written by the editor.
						 */) {
				byte term = ModernizedCProgram.is_terminal_dumb() ? (byte)'\n' : (byte)' ';
				.fprintf((_iob[2]), ModernizedCProgram._("hint: Waiting for your editor to close the file...%c"), ModernizedCProgram.term);
				.fflush((_iob[2]));
			} 
			p.setArgv(ModernizedCProgram.args);
			p.setEnv(env);
			p.setUse_shell(1);
			p.setTrace2_child_class("editor");
			if (p.start_command() < 0) {
				return ();
			} 
			ModernizedCProgram.sigchain_push(2, ((__p_sig_fn_t)1));
			ModernizedCProgram.sigchain_push(SIGQUIT, ((__p_sig_fn_t)1));
			ret = p.finish_command();
			sig = ret - 128;
			ModernizedCProgram.sigchain_pop(2);
			ModernizedCProgram.sigchain_pop(SIGQUIT);
			if (sig == 2 || sig == SIGQUIT) {
				.raise(sig);
			} 
			if (ret) {
				return ();
			} 
			if (print_waiting_for_editor && !ModernizedCProgram.is_terminal_dumb()) {
				ModernizedCProgram.term_clear_line();
			} 
		} 
		if (!ModernizedCProgram.buffer) {
			return 0;
		} 
		if (ModernizedCProgram.buffer.strbuf_read_file(path, 0) < 0) {
			return ();
		} 
		return 0;
	}
	public int launch_editor(Object path, Object env) {
		return ModernizedCProgram.buffer.launch_specified_editor(ModernizedCProgram.git_editor(), path, env);
	}
	public int launch_sequence_editor(Object path, Object env) {
		return ModernizedCProgram.buffer.launch_specified_editor(ModernizedCProgram.git_sequence_editor(), path, env);
	}
	public void copy_gecos(Object w) {
		byte src;
		/* Traditionally GECOS field had office phone numbers etc, separated
			 * with commas.  Also & stands for capitalized form of the login name.
			 */
		for (src = ((w).getPasswd()); src && src != (byte)','; src++) {
			int ch = src;
			if (ch != (byte)'&') {
				name.strbuf_addch(ch);
			} else {
					name.strbuf_addch(ModernizedCProgram.sane_case((byte)(w.getPasswd()), /* Sorry, Mr. McDonald... */0));
					name.strbuf_addstr(w.getPasswd() + 1);
			} 
		}
	}
	public int add_mailname_host() {
		FILE mailname = new FILE();
		strbuf mailnamebuf = new strbuf(, , );
		mailname = ModernizedCProgram.fopen_or_warn("/etc/mailname", "r");
		if (!mailname) {
			return -1;
		} 
		Object generated_flag = (mailname).get_flag();
		if (ModernizedCProgram.strbuf_getline(mailnamebuf, mailname) == (true)) {
			if ((generated_flag & -1024)) {
				ModernizedCProgram.warning_errno("cannot read /etc/mailname");
			} 
			mailnamebuf.strbuf_release();
			.fclose(mailname);
			return -1;
		} 
		ModernizedCProgram.buf.strbuf_addbuf(/* success! */mailnamebuf);
		mailnamebuf.strbuf_release();
		.fclose(mailname);
		return 0;
	}
	public int canonical_name(Object host) {
		int status = -1;
		addrinfo hints = new addrinfo();
		addrinfo ai = new addrinfo();
		.memset(hints, (byte)'\0', );
		hints.setAddrinfo(AI_CANONNAME);
		Object generatedAddrinfo = ai.getAddrinfo();
		if (!.getaddrinfo(host, ((Object)0), hints, ai)) {
			if (ai && generatedAddrinfo && .strchr(generatedAddrinfo, (byte)'.')) {
				out.strbuf_addstr(generatedAddrinfo);
				status = 0;
			} 
			.freeaddrinfo(ai);
		} 
		return /* NO_IPV6 */status;
	}
	public void add_domainname(int is_bogus) {
		byte[] buf = new byte[256 + 1];
		if (ModernizedCProgram.xgethostname(buf, )) {
			ModernizedCProgram.warning_errno("cannot get host name");
			out.strbuf_addstr("(none)");
			is_bogus = 1;
			return ;
		} 
		if (.strchr(buf, (byte)'.')) {
			out.strbuf_addstr(buf);
		}  else if (out.canonical_name(buf) < 0) {
			out.strbuf_addf("%s.(none)", buf);
			is_bogus = 1;
		} 
	}
	public void strbuf_addstr_without_crud(Object src) {
		size_t i = new size_t();
		size_t len = new size_t();
		byte c;
		while ((c = src) != /* Remove crud from the beginning.. */0) {
			if (!ModernizedCProgram.crud(c)) {
				break;
			} 
			src++;
		}
		len = .strlen(/* Remove crud from the end.. */src);
		while (len > 0) {
			c = src[len - 1];
			if (!ModernizedCProgram.crud(c)) {
				break;
			} 
			--len/*
				 * Copy the rest to the buffer, but avoid the special
				 * characters '\n' '<' and '>' that act as delimiters on
				 * an identification line. We can only remove crud, never add it,
				 * so 'len' is our maximum.
				 */;
		}
		sb.strbuf_grow(len);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		for (i = 0; i < len; i++) {
			c = src++;
			switch (c) {
			case (byte)'>':
					continue;
			case (byte)'\n':
			case (byte)'<':
			}
			generatedBuf[generatedLen++] = c;
		}
		generatedBuf[generatedLen] = (byte)'\0'/*
		 * Reverse of fmt_ident(); given an ident line, split the fields
		 * to allow the caller to parse it.
		 * Signal a success by returning 0, but date/tz fields of the result
		 * can still be NULL if the input line only has the name/email part
		 * (e.g. reading from a reflog entry).
		 */;
	}
	public int remove_dirs(Object prefix, int force_flag, int dry_run, int quiet, int dir_gone) {
		DIR dir = new DIR();
		strbuf quoted = new strbuf(, , );
		dirent e = new dirent();
		int res = 0;
		int ret = 0;
		int gone = 1;
		int original_len = ModernizedCProgram.path.getLen();
		int len;
		string_list dels = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		dir_gone = 1;
		byte generatedBuf = quoted.getBuf();
		if ((force_flag & 2) && ModernizedCProgram.path.is_nonbare_repository_dir()) {
			if (!quiet) {
				quoted.quote_path_relative(ModernizedCProgram.path.getBuf(), prefix);
				.printf(dry_run ? ModernizedCProgram._(ModernizedCProgram.msg_would_skip_git_dir) : ModernizedCProgram._(ModernizedCProgram.msg_skip_git_dir), generatedBuf);
			} 
			dir_gone = 0;
			;
		} 
		dir = ModernizedCProgram.opendir(generatedBuf);
		if (!dir) {
			res = dry_run ? 0 : .rmdir(generatedBuf);
			if (res) {
				int saved_errno = (._errno());
				quoted.quote_path_relative(generatedBuf, prefix);
				(._errno()) = saved_errno;
				ModernizedCProgram.warning_errno(ModernizedCProgram._(ModernizedCProgram.msg_warn_remove_failed), generatedBuf);
				dir_gone = 0;
			} 
			ret = res;
			;
		} 
		ModernizedCProgram.path.strbuf_complete((byte)'/');
		len = ModernizedCProgram.path.getLen();
		dirent dirent = new dirent();
		Object generatedD_name = e.getD_name();
		Object generatedSt_mode = st.getSt_mode();
		while ((e = dirent.readdir(dir)) != ((Object)0)) {
			stat st = new stat();
			if (ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				continue;
			} 
			ModernizedCProgram.path.strbuf_setlen(len);
			ModernizedCProgram.path.strbuf_addstr(generatedD_name);
			if (.lstat(generatedBuf, st)) {
				ModernizedCProgram.warning_errno(ModernizedCProgram._(ModernizedCProgram.msg_warn_lstat_failed), generatedBuf);
			}  else if ((((generatedSt_mode) & -1024) == -1024)) {
				if (ModernizedCProgram.path.remove_dirs(prefix, force_flag, dry_run, quiet, gone)) {
					ret = 1;
				} 
				if (gone) {
					quoted.quote_path_relative(generatedBuf, prefix);
					dels.string_list_append(generatedBuf);
				} else {
						dir_gone = 0;
				} 
				continue;
			} else {
					res = dry_run ? 0 : .unlink(generatedBuf);
					if (!res) {
						quoted.quote_path_relative(generatedBuf, prefix);
						dels.string_list_append(generatedBuf);
					} else {
							int saved_errno = (._errno());
							quoted.quote_path_relative(generatedBuf, prefix);
							(._errno()) = saved_errno;
							ModernizedCProgram.warning_errno(ModernizedCProgram._(ModernizedCProgram.msg_warn_remove_failed), generatedBuf);
							dir_gone = 0;
							ret = 1;
					} 
					continue;
			} 
			dir_gone = /* path too long, stat fails, or non-directory still exists */0;
			ret = 1;
			break;
		}
		dir.closedir();
		ModernizedCProgram.path.strbuf_setlen(original_len);
		if (dir_gone) {
			res = dry_run ? 0 : .rmdir(generatedBuf);
			if (!res) {
				dir_gone = 1;
			} else {
					int saved_errno = (._errno());
					quoted.quote_path_relative(generatedBuf, prefix);
					(._errno()) = saved_errno;
					ModernizedCProgram.warning_errno(ModernizedCProgram._(ModernizedCProgram.msg_warn_remove_failed), generatedBuf);
					dir_gone = 0;
					ret = 1;
			} 
		} 
		int generatedNr = dels.getNr();
		string_list_item generatedItems = dels.getItems();
		if (!dir_gone && !quiet) {
			int i;
			for (i = 0; i < generatedNr; i++) {
				.printf(dry_run ? ModernizedCProgram._(ModernizedCProgram.msg_would_remove) : ModernizedCProgram._(ModernizedCProgram.msg_remove), generatedItems[i].getString());
			}
		} 
		dels.string_list_clear(0);
		return ret;
	}
	public int encode_to_git(Object path, Object src, Object src_len, Object enc, int conv_flags) {
		byte dst;
		size_t dst_len = new size_t();
		int die_on_error = conv_flags & (1 << 4/*
			 * No encoding is specified or there is nothing to encode.
			 * Tell the caller that the content was not modified.
			 */);
		if (!enc || (src && !src_len)) {
			return 0/*
				 * Looks like we got called from "would_convert_to_git()".
				 * This means Git wants to know if it would encode (= modify!)
				 * the content. Let's answer with "yes", since an encoding was
				 * specified.
				 */;
		} 
		if (!ModernizedCProgram.buf && !src) {
			return 1;
		} 
		if (ModernizedCProgram.validate_encoding(path, enc, src, src_len, die_on_error)) {
			return 0;
		} 
		ModernizedCProgram.trace_encoding("source", path, enc, src, src_len);
		dst = ModernizedCProgram.reencode_string_len(src, src_len, ModernizedCProgram.default_encoding, enc, dst_len);
		if (!dst/*
				 * We could add the blob "as-is" to Git. However, on checkout
				 * we would try to reencode to the original encoding. This
				 * would fail and we would leave the user with a messed-up
				 * working tree. Let's try to avoid this by screaming loud.
				 */) {
			byte msg = ModernizedCProgram._("failed to encode '%s' from %s to %s");
			if (die_on_error) {
				ModernizedCProgram.die(ModernizedCProgram.msg, path, enc, ModernizedCProgram.default_encoding);
			} else {
					();
					return 0;
			} 
		} 
		ModernizedCProgram.trace_encoding("destination", path, ModernizedCProgram.default_encoding, dst, dst_len/*
			 * UTF supports lossless conversion round tripping [1] and conversions
			 * between UTF and other encodings are mostly round trip safe as
			 * Unicode aims to be a superset of all other character encodings.
			 * However, certain encodings (e.g. SHIFT-JIS) are known to have round
			 * trip issues [2]. Check the round trip conversion for all encodings
			 * listed in core.checkRoundtripEncoding.
			 *
			 * The round trip check is only performed if content is written to Git.
			 * This ensures that no information is lost during conversion to/from
			 * the internal UTF-8 representation.
			 *
			 * Please note, the code below is not tested because I was not able to
			 * generate a faulty round trip without an iconv error. Iconv errors
			 * are already caught above.
			 *
			 * [1] http://unicode.org/faq/utf_bom.html#gen2
			 * [2] https://support.microsoft.com/en-us/help/170559/prb-conversion-problem-between-shift-jis-and-unicode
			 */);
		if (die_on_error && ModernizedCProgram.check_roundtrip(enc)) {
			byte re_src;
			size_t re_src_len = new size_t();
			re_src = ModernizedCProgram.reencode_string_len(dst, dst_len, enc, ModernizedCProgram.default_encoding, re_src_len);
			do {
				if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
					ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\convert.c", 462, "Checking roundtrip encoding for %s...\n", enc);
				} 
			} while (0);
			ModernizedCProgram.trace_encoding("reencoded source", path, enc, re_src, re_src_len);
			if (!re_src || src_len != re_src_len || .memcmp(src, re_src, src_len)) {
				byte msg = ModernizedCProgram._("encoding '%s' from %s to %s and back is not the same");
				ModernizedCProgram.die(ModernizedCProgram.msg, path, enc, ModernizedCProgram.default_encoding);
			} 
			ModernizedCProgram.free(re_src);
		} 
		ModernizedCProgram.buf.strbuf_attach(dst, dst_len, dst_len + 1);
		return 1;
	}
	public int encode_to_worktree(Object path, Object src, Object src_len, Object enc) {
		byte dst;
		size_t dst_len = new size_t();
		/*
			 * No encoding is specified or there is nothing to encode.
			 * Tell the caller that the content was not modified.
			 */
		if (!enc || (src && !src_len)) {
			return 0;
		} 
		dst = ModernizedCProgram.reencode_string_len(src, src_len, enc, ModernizedCProgram.default_encoding, dst_len);
		if (!dst) {
			();
			return 0;
		} 
		ModernizedCProgram.buf.strbuf_attach(dst, dst_len, dst_len + 1);
		return 1;
	}
	public int crlf_to_git(Object istate, Object path, Object src, Object len, crlf_action crlf_action, int conv_flags) {
		text_stat stats = new text_stat();
		byte dst;
		int convert_crlf_into_lf;
		if (crlf_action.crlf_action == crlf_action.CRLF_BINARY || (src && !len)) {
			return 0/*
				 * If we are doing a dry-run and have no source buffer, there is
				 * nothing to analyze; we must assume we would convert.
				 */;
		} 
		if (!ModernizedCProgram.buf && !src) {
			return 1;
		} 
		stats.gather_stats(src, len);
		int generatedCrlf = stats.getCrlf();
		convert_crlf_into_lf = !!generatedCrlf;
		if (crlf_action.crlf_action == crlf_action.CRLF_AUTO || crlf_action.crlf_action == crlf_action.CRLF_AUTO_INPUT || crlf_action.crlf_action == crlf_action.CRLF_AUTO_CRLF) {
			if (ModernizedCProgram.convert_is_binary(stats)) {
				return 0/*
						 * If the file in the index has any CR in it, do not
						 * convert.  This is the new safer autocrlf handling,
						 * unless we want to renormalize in a merge or
						 * cherry-pick.
						 */;
			} 
			if ((!(conv_flags & (1 << 2))) && ModernizedCProgram.has_crlf_in_index(istate, path)) {
				convert_crlf_into_lf = 0;
			} 
		} 
		int generatedLonelf = new_stats.getLonelf();
		if (((conv_flags & (1 << 1)) || ((conv_flags & (1 << 0)) && len))) {
			text_stat new_stats = new text_stat();
			.memcpy(new_stats, stats, );
			if (/* simulate "git add" */convert_crlf_into_lf) {
				generatedLonelf += generatedCrlf;
				new_stats.setCrlf(0);
			} 
			if (new_stats.will_convert_lf_to_crlf(/* simulate "git checkout" */crlf_action.crlf_action)) {
				generatedCrlf += generatedLonelf;
				new_stats.setLonelf(0);
			} 
			stats.check_global_conv_flags_eol(path, crlf_action.crlf_action, new_stats, conv_flags);
		} 
		if (!convert_crlf_into_lf) {
			return 0/*
				 * At this point all of our source analysis is done, and we are sure we
				 * would convert. If we are in dry-run mode, we can give an answer.
				 */;
		} 
		if (!ModernizedCProgram.buf) {
			return 1;
		} 
		if (ModernizedCProgram.strbuf_avail(ModernizedCProgram.buf) + ModernizedCProgram.buf.getLen() < /* only grow if not in place */len) {
			ModernizedCProgram.buf.strbuf_grow(len - ModernizedCProgram.buf.getLen());
		} 
		dst = ModernizedCProgram.buf.getBuf();
		if (crlf_action.crlf_action == crlf_action.CRLF_AUTO || crlf_action.crlf_action == crlf_action.CRLF_AUTO_INPUT || crlf_action.crlf_action == crlf_action.CRLF_AUTO_CRLF/*
				 * If we guessed, we already know we rejected a file with
				 * lone CR, and we can strip a CR without looking at what
				 * follow it.
				 */) {
			do {
				byte c = src++;
				if (c != (byte)'\r') {
					dst++ = c;
				} 
			} while (--len);
		} else {
				do {
					byte c = src++;
					if (!(c == (byte)'\r' && (1 < len && src == (byte)'\n'))) {
						dst++ = c;
					} 
				} while (--len);
		} 
		ModernizedCProgram.buf.strbuf_setlen(dst - ModernizedCProgram.buf.getBuf());
		return 1;
	}
	public int crlf_to_worktree(Object src, Object len, crlf_action crlf_action) {
		byte to_free = ((Object)0);
		text_stat stats = new text_stat();
		if (!len || ModernizedCProgram.output_eol(crlf_action.crlf_action) != eol.EOL_CRLF) {
			return 0;
		} 
		stats.gather_stats(src, len);
		if (!stats.will_convert_lf_to_crlf(crlf_action.crlf_action)) {
			return 0;
		} 
		if (src == ModernizedCProgram.buf.getBuf()) {
			to_free = ModernizedCProgram.buf.strbuf_detach(((Object)0));
		} 
		int generatedLonelf = stats.getLonelf();
		ModernizedCProgram.buf.strbuf_grow(len + generatedLonelf);
		for (; ; ) {
			byte nl = .memchr(src, (byte)'\n', len);
			if (!nl) {
				break;
			} 
			if (nl > src && nl[-1] == (byte)'\r') {
				ModernizedCProgram.buf.strbuf_add(src, nl + 1 - src);
			} else {
					ModernizedCProgram.buf.strbuf_add(src, nl - src);
					ModernizedCProgram.buf.strbuf_addstr("\r\n");
			} 
			len -= nl + 1 - src;
			src = nl + 1;
		}
		ModernizedCProgram.buf.strbuf_add(src, len);
		ModernizedCProgram.free(to_free);
		return 1;
	}
	public int apply_single_file_filter(Object path, Object src, Object len, int fd, Object cmd) {
		int err = 0;
		strbuf nbuf = new strbuf(, , );
		async async = new async();
		filter_params params = new filter_params();
		.memset(async, 0, );
		async.setProc(filter_buffer_or_fd);
		async.setData(params);
		async.setOut(-1);
		params.setSrc(src);
		params.setSize(len);
		params.setFd(fd);
		params.setCmd(cmd);
		params.setPath(path);
		.fflush(((Object)0));
		if (async.start_async()) {
			return /* error was already reported */0;
		} 
		int generatedOut = async.getOut();
		if (nbuf.strbuf_read(generatedOut, 0) < 0) {
			err = ();
		} 
		if (.close(generatedOut)) {
			err = ();
		} 
		if (async.finish_async()) {
			err = ();
		} 
		if (!err) {
			dst.strbuf_swap(nbuf);
		} 
		nbuf.strbuf_release();
		return !err;
	}
	public int ident_to_git(Object src, Object len, int ident) {
		byte dst;
		byte dollar;
		if (!ident || (src && !ModernizedCProgram.count_ident(src, len))) {
			return 0;
		} 
		if (!ModernizedCProgram.buf) {
			return 1;
		} 
		if (ModernizedCProgram.strbuf_avail(ModernizedCProgram.buf) + ModernizedCProgram.buf.getLen() < /* only grow if not in place */len) {
			ModernizedCProgram.buf.strbuf_grow(len - ModernizedCProgram.buf.getLen());
		} 
		dst = ModernizedCProgram.buf.getBuf();
		for (; ; ) {
			dollar = .memchr(src, (byte)'$', len);
			if (!dollar) {
				break;
			} 
			.memmove(dst, src, dollar + 1 - src);
			dst += dollar + 1 - src;
			len -= dollar + 1 - src;
			src = dollar + 1;
			if (len > 3 && !.memcmp(src, "Id:", 3)) {
				dollar = .memchr(src + 3, (byte)'$', len - 3);
				if (!dollar) {
					break;
				} 
				if (.memchr(src + 3, (byte)'\n', dollar - src - 3/* Line break before the next dollar. */)) {
					continue;
				} 
				.memcpy(dst, "Id$", 3);
				dst += 3;
				len -= dollar + 1 - src;
				src = dollar + 1;
			} 
		}
		.memmove(dst, src, len);
		ModernizedCProgram.buf.strbuf_setlen(dst + len - ModernizedCProgram.buf.getBuf());
		return 1;
	}
	public int ident_to_worktree(Object src, Object len, int ident) {
		object_id oid = new object_id();
		byte to_free = ((Object)0);
		byte dollar;
		byte spc;
		int cnt;
		if (!ident) {
			return 0;
		} 
		cnt = ModernizedCProgram.count_ident(src, len);
		if (!cnt) {
			return 0;
		} 
		if (src == ModernizedCProgram.buf.getBuf()) {
			to_free = ModernizedCProgram.buf.strbuf_detach(((Object)0));
		} 
		oid.hash_object_file(src, len, "blob");
		ModernizedCProgram.buf.strbuf_grow(len + cnt * (ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 3));
		for (; ; ) {
			dollar = .memchr(src, (byte)'$', /* step 1: run to the next '$' */len);
			if (!dollar) {
				break;
			} 
			ModernizedCProgram.buf.strbuf_add(src, dollar + 1 - src);
			len -= dollar + 1 - src;
			src = dollar + 1;
			if (len < 3 || .memcmp("Id", src, /* step 2: does it looks like a bit like Id:xxx$ or Id$ ? */2)) {
				continue;
			} 
			if (src[2] == /* step 3: skip over Id$ or Id:xxxxx$ */(byte)'$') {
				src += 3;
				len -= 3;
			}  else if (src[2] == (byte)':'/*
						 * It's possible that an expanded Id has crept its way into the
						 * repository, we cope with that by stripping the expansion out.
						 * This is probably not a good idea, since it will cause changes
						 * on checkout, which won't go away by stash, but let's keep it
						 * for git-style ids.
						 */) {
				dollar = .memchr(src + 3, (byte)'$', len - 3);
				if (!dollar/* incomplete keyword, no more '$', so just quit the loop */) {
					break;
				} 
				if (.memchr(src + 3, (byte)'\n', dollar - src - 3/* Line break before the next dollar. */)) {
					continue;
				} 
				spc = .memchr(src + 4, (byte)' ', dollar - src - 4);
				if (spc && spc < dollar - 1/* There are spaces in unexpected places.
								 * This is probably an id from some other
								 * versioning system. Keep it for now.
								 */) {
					continue;
				} 
				len -= dollar + 1 - src;
				src = dollar + 1;
			} else {
					continue;
			} 
			ModernizedCProgram.buf.strbuf_addstr(/* step 4: substitute */"Id: ");
			ModernizedCProgram.buf.strbuf_addstr(ModernizedCProgram.oid_to_hex(oid));
			ModernizedCProgram.buf.strbuf_addstr(" $");
		}
		ModernizedCProgram.buf.strbuf_add(src, len);
		ModernizedCProgram.free(to_free);
		return 1;
	}
	public int convert_to_git(Object istate, Object path, Object src, Object len, int conv_flags) {
		int ret = 0;
		conv_attrs ca = new conv_attrs();
		ca.convert_attrs(istate, path);
		convert_driver generatedDrv = ca.getDrv();
		ret |=  ModernizedCProgram.apply_filter(path, src, len, -1, dst, generatedDrv, (-1024 << 0), ((Object)0));
		int generatedRequired = generatedDrv.getRequired();
		Object generatedName = generatedDrv.getName();
		if (!ret && generatedDrv && generatedRequired) {
			ModernizedCProgram.die(ModernizedCProgram._("%s: clean filter '%s' failed"), path, generatedName);
		} 
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (ret && dst) {
			src = generatedBuf;
			len = generatedLen;
		} 
		Object generatedWorking_tree_encoding = ca.getWorking_tree_encoding();
		ret |=  dst.encode_to_git(path, src, len, generatedWorking_tree_encoding, conv_flags);
		if (ret && dst) {
			src = generatedBuf;
			len = generatedLen;
		} 
		crlf_action generatedCrlf_action = ca.getCrlf_action();
		if (!(conv_flags & (1 << 3))) {
			ret |=  dst.crlf_to_git(istate, path, src, len, generatedCrlf_action, conv_flags);
			if (ret && dst) {
				src = generatedBuf;
				len = generatedLen;
			} 
		} 
		int generatedIdent = ca.getIdent();
		return ret | dst.ident_to_git(src, len, generatedIdent);
	}
	public void convert_to_git_filter_fd(Object istate, Object path, int fd, int conv_flags) {
		conv_attrs ca = new conv_attrs();
		ca.convert_attrs(istate, path);
		convert_driver generatedDrv = ca.getDrv();
		((generatedDrv) ? (Object)0 : ._assert("ca.drv", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\convert.c", 1447));
		Object generatedClean = generatedDrv.getClean();
		Object generatedProcess = generatedDrv.getProcess();
		((generatedClean || generatedProcess) ? (Object)0 : ._assert("ca.drv->clean || ca.drv->process", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\convert.c", 1448));
		Object generatedName = generatedDrv.getName();
		if (!ModernizedCProgram.apply_filter(path, ((Object)0), 0, fd, dst, generatedDrv, (-1024 << 0), ((Object)0))) {
			ModernizedCProgram.die(ModernizedCProgram._("%s: clean filter '%s' failed"), path, generatedName);
		} 
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		Object generatedWorking_tree_encoding = ca.getWorking_tree_encoding();
		dst.encode_to_git(path, generatedBuf, generatedLen, generatedWorking_tree_encoding, conv_flags);
		crlf_action generatedCrlf_action = ca.getCrlf_action();
		dst.crlf_to_git(istate, path, generatedBuf, generatedLen, generatedCrlf_action, conv_flags);
		int generatedIdent = ca.getIdent();
		dst.ident_to_git(generatedBuf, generatedLen, generatedIdent);
	}
	public int async_convert_to_working_tree(Object istate, Object path, Object src, Object len, Object dco) {
		return ModernizedCProgram.convert_to_working_tree_internal(istate, path, src, len, dst, 0, dco);
	}
	public int convert_to_working_tree(Object istate, Object path, Object src, Object len) {
		return ModernizedCProgram.convert_to_working_tree_internal(istate, path, src, len, dst, 0, ((Object)0));
	}
	public int renormalize_buffer(Object istate, Object path, Object src, Object len) {
		int ret = ModernizedCProgram.convert_to_working_tree_internal(istate, path, src, len, dst, 1, ((Object)0));
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (ret) {
			src = generatedBuf;
			len = generatedLen;
		} 
		return ret | dst.convert_to_git(istate, path, src, len, (1 << 2/*****************************************************************
		 *
		 * Streaming conversion support
		 *
		 *****************************************************************/));
	}
	public void add_branch_desc(Object name) {
		strbuf desc = new strbuf(, , );
		byte generatedBuf = desc.getBuf();
		if (!desc.read_branch_desc(name)) {
			byte bp = generatedBuf;
			while (bp) {
				byte ep = ModernizedCProgram.gitstrchrnul(bp, (byte)'\n');
				if (ep) {
					ep++;
				} 
				out.strbuf_addf("  : %.*s", (int)(ep - bp), bp);
				bp = ep;
			}
			out.strbuf_complete_line();
		} 
		desc.strbuf_release();
	}
	public void fmt_merge_msg_title(Object current_branch) {
		int i = 0;
		byte sep = "";
		out.strbuf_addstr("Merge ");
		int generatedHead_status = src_data.getHead_status();
		string_list generatedBranch = src_data.getBranch();
		int generatedNr = generatedBranch.getNr();
		string_list generatedR_branch = src_data.getR_branch();
		string_list generatedTag = src_data.getTag();
		string_list generatedGeneric = src_data.getGeneric();
		for (i = 0; i < ModernizedCProgram.srcs.getNr(); i++) {
			src_data src_data = ModernizedCProgram.srcs.getItems()[i].getUtil();
			byte subsep = "";
			out.strbuf_addstr(sep);
			sep = "; ";
			if (generatedHead_status == 1) {
				out.strbuf_addstr(ModernizedCProgram.srcs.getItems()[i].getString());
				continue;
			} 
			if (generatedHead_status == 3) {
				subsep = ", ";
				out.strbuf_addstr("HEAD");
			} 
			if (generatedNr) {
				out.strbuf_addstr(subsep);
				subsep = ", ";
				ModernizedCProgram.print_joined("branch ", "branches ", generatedBranch, out);
			} 
			if (generatedNr) {
				out.strbuf_addstr(subsep);
				subsep = ", ";
				ModernizedCProgram.print_joined("remote-tracking branch ", "remote-tracking branches ", generatedR_branch, out);
			} 
			if (generatedNr) {
				out.strbuf_addstr(subsep);
				subsep = ", ";
				ModernizedCProgram.print_joined("tag ", "tags ", generatedTag, out);
			} 
			if (generatedNr) {
				out.strbuf_addstr(subsep);
				ModernizedCProgram.print_joined("commit ", "commits ", generatedGeneric, out);
			} 
			if (.strcmp(".", ModernizedCProgram.srcs.getItems()[i].getString())) {
				out.strbuf_addf(" of %s", ModernizedCProgram.srcs.getItems()[i].getString());
			} 
		}
		if (!.strcmp("master", current_branch)) {
			out.strbuf_addch((byte)'\n');
		} else {
				out.strbuf_addf(" into %s\n", current_branch);
		} 
	}
	public void fmt_tag_signature(strbuf sig, Object buf, long len) {
		byte tag_body = .strstr(buf, "\n\n");
		if (tag_body) {
			tag_body += 2;
			tagbuf.strbuf_add(tag_body, buf + len - tag_body);
		} 
		tagbuf.strbuf_complete_line();
		Object generatedLen = sig.getLen();
		byte generatedBuf = sig.getBuf();
		if (generatedLen) {
			tagbuf.strbuf_addch((byte)'\n');
			tagbuf.strbuf_add_commented_lines(generatedBuf, generatedLen);
		} 
	}
	public void fmt_merge_msg_sigs() {
		int i;
		int tag_number = 0;
		int first_tag = 0;
		strbuf tagbuf = new strbuf(, , );
		Object generatedLen = sig.getLen();
		byte generatedBuf = tagline.getBuf();
		if (generatedLen) {
			out.strbuf_addch((byte)'\n');
			out.strbuf_addbuf(tagbuf);
		} 
		tagbuf.strbuf_release();
	}
	public strbuf get_pathname() {
		strbuf[] pathname_array = new strbuf[]{new strbuf(, , ), new strbuf(, , ), new strbuf(, , ), new strbuf(, , )};
		int index;
		strbuf sb = pathname_array[index];
		index = (index + 1) % ( /  + ( - 1));
		sb.strbuf_setlen(0);
		return sb;
	}
	public void strbuf_cleanup_path() {
		byte generatedBuf = this.getBuf();
		byte path = ModernizedCProgram.cleanup_path(generatedBuf);
		if (path > generatedBuf) {
			sb.strbuf_remove(0, path - generatedBuf);
		} 
	}
	public void replace_dir(int len, Object newdir) {
		int newlen = .strlen(newdir);
		int need_sep = (ModernizedCProgram.buf.getBuf()[len] && !ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.buf.getBuf()[len])) && !ModernizedCProgram.git_is_dir_sep(newdir[newlen - 1]);
		if (need_sep) {
			/* keep one char, to be replaced with '/'  */len--;
		} 
		ModernizedCProgram.buf.strbuf_splice(0, len, newdir, newlen);
		if (need_sep) {
			ModernizedCProgram.buf.getBuf()[newlen] = (byte)'/';
		} 
	}
	public void update_common_dir(int git_dir_len, Object common_dir) {
		byte base = ModernizedCProgram.buf.getBuf() + git_dir_len;
		ModernizedCProgram.init_common_trie();
		if (ModernizedCProgram.common_trie.trie_find(base, check_common, ((Object)0)) > 0) {
			ModernizedCProgram.buf.replace_dir(git_dir_len, common_dir);
		} 
	}
	public void adjust_git_path(Object repo, int git_dir_len) {
		byte base = ModernizedCProgram.buf.getBuf() + git_dir_len;
		if (ModernizedCProgram.is_dir_file(base, "info", "grafts")) {
			ModernizedCProgram.buf.strbuf_splice(0, ModernizedCProgram.buf.getLen(), repo.getGraft_file(), .strlen(repo.getGraft_file()));
		}  else if (!.strcmp(base, "index")) {
			ModernizedCProgram.buf.strbuf_splice(0, ModernizedCProgram.buf.getLen(), repo.getIndex_file(), .strlen(repo.getIndex_file()));
		}  else if (ModernizedCProgram.dir_prefix(base, "objects")) {
			ModernizedCProgram.buf.replace_dir(git_dir_len + 7, repo.getObjects().getOdb().getPath());
		}  else if (ModernizedCProgram.git_hooks_path && ModernizedCProgram.dir_prefix(base, "hooks")) {
			ModernizedCProgram.buf.replace_dir(git_dir_len + 5, ModernizedCProgram.git_hooks_path);
		}  else if (repo.getDifferent_commondir()) {
			ModernizedCProgram.buf.update_common_dir(git_dir_len, repo.getCommondir());
		} 
	}
	public void strbuf_worktree_gitdir(Object repo, Object wt) {
		if (!wt) {
			ModernizedCProgram.buf.strbuf_addstr(repo.getGitdir());
		}  else if (!wt.getId()) {
			ModernizedCProgram.buf.strbuf_addstr(repo.getCommondir());
		} else {
				ModernizedCProgram.buf.strbuf_git_common_path(repo, "worktrees/%s", wt.getId());
		} 
	}
	public void do_git_path(Object repo, Object wt, Object fmt, Object args) {
		int gitdir_len;
		ModernizedCProgram.buf.strbuf_worktree_gitdir(repo, wt);
		if (ModernizedCProgram.buf.getLen() && !ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1])) {
			ModernizedCProgram.buf.strbuf_addch((byte)'/');
		} 
		gitdir_len = ModernizedCProgram.buf.getLen();
		ModernizedCProgram.buf.strbuf_vaddf(fmt, args);
		if (!wt) {
			ModernizedCProgram.buf.adjust_git_path(repo, gitdir_len);
		} 
		ModernizedCProgram.buf.strbuf_cleanup_path();
	}
	public void strbuf_repo_git_path(Object repo, Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		sb.do_git_path(repo, ((Object)0), fmt, args);
		.__builtin_va_end(args);
	}
	public Byte git_path_buf(Object fmt) {
		va_list args = new va_list();
		ModernizedCProgram.buf.strbuf_setlen(0);
		.__builtin_va_start(args, fmt);
		ModernizedCProgram.buf.do_git_path(ModernizedCProgram.the_repository, ((Object)0), fmt, args);
		.__builtin_va_end(args);
		return ModernizedCProgram.buf.getBuf();
	}
	public void strbuf_git_path(Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		sb.do_git_path(ModernizedCProgram.the_repository, ((Object)0), fmt, args);
		.__builtin_va_end(args);
	}
	public void do_worktree_path(Object repo, Object fmt, Object args) {
		ModernizedCProgram.buf.strbuf_addstr(repo.getWorktree());
		if (ModernizedCProgram.buf.getLen() && !ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1])) {
			ModernizedCProgram.buf.strbuf_addch((byte)'/');
		} 
		ModernizedCProgram.buf.strbuf_vaddf(fmt, args);
		ModernizedCProgram.buf.strbuf_cleanup_path();
	}
	public void strbuf_repo_worktree_path(Object repo, Object fmt) {
		va_list args = new va_list();
		if (!repo.getWorktree()) {
			return ;
		} 
		.__builtin_va_start(args, fmt);
		sb.do_worktree_path(repo, fmt, args);
		.__builtin_va_end(args);
	}
	/* Returns 0 on success, negative on failure. */
	public int do_submodule_path(Object path, Object fmt, Object args) {
		strbuf git_submodule_common_dir = new strbuf(, , );
		strbuf git_submodule_dir = new strbuf(, , );
		int ret;
		ret = git_submodule_dir.submodule_to_gitdir(path);
		if (ret) {
			;
		} 
		git_submodule_dir.strbuf_complete((byte)'/');
		ModernizedCProgram.buf.strbuf_addbuf(git_submodule_dir);
		ModernizedCProgram.buf.strbuf_vaddf(fmt, args);
		byte generatedBuf = git_submodule_dir.getBuf();
		Object generatedLen = git_submodule_dir.getLen();
		if (git_submodule_common_dir.get_common_dir_noenv(generatedBuf)) {
			ModernizedCProgram.buf.update_common_dir(generatedLen, generatedBuf);
		} 
		ModernizedCProgram.buf.strbuf_cleanup_path();
		git_submodule_common_dir.strbuf_release();
		return ret;
	}
	public int strbuf_git_path_submodule(Object path, Object fmt) {
		int err;
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		err = ModernizedCProgram.buf.do_submodule_path(path, fmt, args);
		.__builtin_va_end(args);
		return err;
	}
	public void do_git_common_path(Object repo, Object fmt, Object args) {
		ModernizedCProgram.buf.strbuf_addstr(repo.getCommondir());
		if (ModernizedCProgram.buf.getLen() && !ModernizedCProgram.git_is_dir_sep(ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1])) {
			ModernizedCProgram.buf.strbuf_addch((byte)'/');
		} 
		ModernizedCProgram.buf.strbuf_vaddf(fmt, args);
		ModernizedCProgram.buf.strbuf_cleanup_path();
	}
	public void strbuf_git_common_path(Object repo, Object fmt) {
		va_list args = new va_list();
		.__builtin_va_start(args, fmt);
		sb.do_git_common_path(repo, fmt, args);
		.__builtin_va_end(args);
	}
	public Object relative_path(Object in, Object prefix) {
		int in_len = in ? .strlen(in) : 0;
		int prefix_len = prefix ? .strlen(prefix) : 0;
		int in_off = 0;
		int prefix_off = 0;
		int i = 0;
		int j = 0;
		if (!in_len) {
			return "./";
		}  else if (!prefix_len) {
			return in;
		} 
		if (ModernizedCProgram.have_same_root(in, prefix)) {
			i = j = ModernizedCProgram.git_has_dos_drive_prefix(/* bypass dos_drive, for "c:" is identical to "C:" */in);
		} else {
				return in;
		} 
		while (i < prefix_len && j < in_len && prefix[i] == in[j]) {
			if (ModernizedCProgram.git_is_dir_sep(prefix[i])) {
				while (ModernizedCProgram.git_is_dir_sep(prefix[i])) {
					i++;
				}
				while (ModernizedCProgram.git_is_dir_sep(in[j])) {
					j++;
				}
				prefix_off = i;
				in_off = j;
			} else {
					i++;
					j++;
			} 
		}
		if (i >= /* "prefix" seems like prefix of "in" */prefix_len/*
			     * but "/foo" is not a prefix of "/foobar"
			     * (i.e. prefix not end with '/')
			     */ && prefix_off < prefix_len) {
			if (j >= in_len) {
				in_off = /* in="/a/b", prefix="/a/b" */in_len;
			}  else if (ModernizedCProgram.git_is_dir_sep(in[j])) {
				while (ModernizedCProgram.git_is_dir_sep(in[/* in="/a/b/c", prefix="/a/b" */j])) {
					j++;
				}
				in_off = j;
			} else {
					i = /* in="/a/bbb/c", prefix="/a/b" */prefix_off;
			} 
		}  else if (j >= /* "in" is short than "prefix" */in_len && in_off < /* "in" not end with '/' */in_len) {
			if (ModernizedCProgram.git_is_dir_sep(prefix[i])) {
				while (ModernizedCProgram.git_is_dir_sep(prefix[/* in="/a/b", prefix="/a/b/c/" */i])) {
					i++;
				}
				in_off = in_len;
			} 
		} 
		in += in_off;
		in_len -= in_off;
		if (i >= prefix_len) {
			if (!in_len) {
				return "./";
			} else {
					return in;
			} 
		} 
		sb.strbuf_setlen(0);
		sb.strbuf_grow(in_len);
		while (i < prefix_len) {
			if (ModernizedCProgram.git_is_dir_sep(prefix[i])) {
				sb.strbuf_addstr("../");
				while (ModernizedCProgram.git_is_dir_sep(prefix[i])) {
					i++;
				}
				continue;
			} 
			i++;
		}
		if (!ModernizedCProgram.git_is_dir_sep(prefix[prefix_len - 1])) {
			sb.strbuf_addstr("../");
		} 
		sb.strbuf_addstr(in);
		byte generatedBuf = this.getBuf();
		return generatedBuf;
	}
	public void throughput_string(Object total, int rate) {
		ModernizedCProgram.buf.strbuf_setlen(0);
		ModernizedCProgram.buf.strbuf_addstr(", ");
		ModernizedCProgram.buf.strbuf_humanise_bytes(total);
		ModernizedCProgram.buf.strbuf_addstr(" | ");
		ModernizedCProgram.buf.strbuf_humanise_rate(rate * 1024);
	}
	public void normal_fmt_prepare(Object file, int line) {
		ModernizedCProgram.buf.strbuf_setlen(0);
		Object generatedTr2_tbuf = tb_now.getTr2_tbuf();
		if (!ModernizedCProgram.tr2env_normal_be_brief) {
			tr2_tbuf tb_now = new tr2_tbuf();
			tb_now.tr2_tbuf_local_time();
			ModernizedCProgram.buf.strbuf_addstr(generatedTr2_tbuf);
			ModernizedCProgram.buf.strbuf_addch((byte)' ');
			if (file && file) {
				ModernizedCProgram.buf.strbuf_addf("%s:%d ", file, line);
			} 
			while (ModernizedCProgram.buf.getLen() < (true)) {
				ModernizedCProgram.buf.strbuf_addch((byte)' ');
			}
		} 
	}
	public void maybe_append_string_va(Object fmt, Object ap) {
		if (fmt && fmt) {
			va_list copy_ap = new va_list();
			.__builtin_va_copy(copy_ap, ap);
			ModernizedCProgram.buf.strbuf_vaddf(fmt, copy_ap);
			.__builtin_va_end(copy_ap);
			return ;
		} 
		if (fmt && fmt) {
			va_list copy_ap = new va_list();
			.__builtin_va_copy(copy_ap, ap);
			ModernizedCProgram.buf.strbuf_vaddf(fmt, copy_ap);
			.__builtin_va_end(copy_ap);
			return ;
		} 
	}
	public int show_http_message(strbuf charset, strbuf msg) {
		byte p;
		byte eol;
		/*
			 * We only show text/plain parts, as other types are likely
			 * to be ugly to look at on the user's terminal.
			 */
		if (.strcmp(ModernizedCProgram.type.getBuf(), "text/plain")) {
			return -1;
		} 
		Object generatedLen = charset.getLen();
		byte generatedBuf = charset.getBuf();
		if (generatedLen) {
			msg.strbuf_reencode(generatedBuf, ModernizedCProgram.get_log_output_encoding());
		} 
		msg.strbuf_trim();
		if (!generatedLen) {
			return -1;
		} 
		p = generatedBuf;
		do {
			eol = ModernizedCProgram.gitstrchrnul(p, (byte)'\n');
			.fprintf((_iob[2]), "remote: %.*s\n", (int)(eol - p), p);
			p = eol + 1;
		} while (eol);
		return 0;
	}
	public int get_protocol_http_header(protocol_version version) {
		if (protocol_version.version > 0) {
			header.strbuf_addf("Git-Protocol: version=%d", protocol_version.version);
			return 1;
		} 
		return 0;
	}
	public void parse_fetch() {
		ref to_fetch = ((Object)0);
		ref list_head = ((Object)0);
		ref list = list_head;
		int alloc_heads = 0;
		int nr_heads = 0;
		object_id generatedOld_oid = ref.getOld_oid();
		ref generatedNext = ref.getNext();
		do {
			byte p;
			if (ModernizedCProgram.skip_prefix(ModernizedCProgram.buf.getBuf(), "fetch ", p)) {
				byte name;
				ref ref = new ref();
				object_id old_oid = new object_id();
				byte q;
				if (old_oid.parse_oid_hex(p, q)) {
					ModernizedCProgram.die(ModernizedCProgram._("protocol error: expected sha/ref, got '%s'"), p);
				} 
				if (q == (byte)' ') {
					name = q + 1;
				}  else if (!q) {
					name = "";
				} else {
						ModernizedCProgram.die(ModernizedCProgram._("protocol error: expected sha/ref, got '%s'"), p);
				} 
				ref = .alloc_ref(name);
				generatedOld_oid.oidcpy(old_oid);
				list = ref;
				list = generatedNext;
				do {
					if ((nr_heads + 1) > alloc_heads) {
						if ((((alloc_heads) + 16) * 3 / 2) < (nr_heads + 1)) {
							alloc_heads = (nr_heads + 1);
						} else {
								alloc_heads = (((alloc_heads) + 16) * 3 / 2);
						} 
						(to_fetch) = ModernizedCProgram.xrealloc((to_fetch), ModernizedCProgram.st_mult(, (alloc_heads)));
					} 
				} while (0);
				to_fetch[nr_heads++] = ref;
			} else {
					ModernizedCProgram.die(ModernizedCProgram._("http transport does not support %s"), ModernizedCProgram.buf.getBuf());
			} 
			ModernizedCProgram.buf.strbuf_setlen(0);
			if (ModernizedCProgram.strbuf_getline_lf(ModernizedCProgram.buf, (_iob[0])) == (true)) {
				return ;
			} 
			if (!ModernizedCProgram.buf.getBuf()) {
				break;
			} 
		} while (1);
		if (to_fetch.fetch(nr_heads)) {
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\remote-curl.c", 1157, (/* error already reported */true)));
		} 
		.free_refs(list_head);
		ModernizedCProgram.free(to_fetch);
		.printf("\n");
		.fflush((_iob[1]));
		ModernizedCProgram.buf.strbuf_setlen(0);
	}
	public void parse_push() {
		argv_array specs = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		int ret;
		do {
			if (ModernizedCProgram.starts_with(ModernizedCProgram.buf.getBuf(), "push ")) {
				specs.argv_array_push(ModernizedCProgram.buf.getBuf() + 5);
			} else {
					ModernizedCProgram.die(ModernizedCProgram._("http transport does not support %s"), ModernizedCProgram.buf.getBuf());
			} 
			ModernizedCProgram.buf.strbuf_setlen(0);
			if (ModernizedCProgram.strbuf_getline_lf(ModernizedCProgram.buf, (_iob[0])) == (true)) {
				;
			} 
			if (!ModernizedCProgram.buf.getBuf()) {
				break;
			} 
		} while (1);
		int generatedArgc = specs.getArgc();
		Object generatedArgv = specs.getArgv();
		ret = ModernizedCProgram.push(generatedArgc, generatedArgv);
		.printf("\n");
		.fflush((_iob[1]));
		if (ret) {
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\remote-curl.c", 1275, (/* error already reported */true)));
		} 
	}
	public void add_wrapped_shortlog_msg(Object s, Object log) {
		sb.strbuf_add_wrapped_text(s, log.getIn1(), log.getIn2(), log.getWrap());
		sb.strbuf_addch((byte)'\n');
	}
	public void sq_quote_buf(Object src) {
		byte to_free = ((Object)0);
		byte generatedBuf = this.getBuf();
		if (generatedBuf == src) {
			to_free = dst.strbuf_detach(((Object)0));
		} 
		dst.strbuf_addch((byte)'\'');
		while (src) {
			size_t len = .strcspn(src, "'!");
			dst.strbuf_add(src, ModernizedCProgram.len);
			src += ModernizedCProgram.len;
			while (ModernizedCProgram.need_bs_quote(src)) {
				dst.strbuf_addstr("'\\");
				dst.strbuf_addch(src++);
				dst.strbuf_addch((byte)'\'');
			}
		}
		dst.strbuf_addch((byte)'\'');
		ModernizedCProgram.free(to_free);
	}
	public void sq_quote_buf_pretty(Object src) {
		byte[] ok_punct = "+,-./:=@_^";
		byte p;
		if (!/* Avoid losing a zero-length string by adding '' */src) {
			dst.strbuf_addstr("''");
			return ;
		} 
		for (p = src; p; p++) {
			if (!((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0) && !((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0) && !.strchr(ok_punct, p)) {
				dst.sq_quote_buf(src);
				return ;
			} 
		}
		dst.strbuf_addstr(/* if we get here, we did not need quoting */src);
	}
	public void sq_quotef(Object fmt) {
		strbuf src = new strbuf(, , );
		va_list ap = new va_list();
		.__builtin_va_start(ap, fmt);
		src.strbuf_vaddf(fmt, ap);
		.__builtin_va_end(ap);
		byte generatedBuf = src.getBuf();
		dst.sq_quote_buf(generatedBuf);
		src.strbuf_release();
	}
	public void sq_quote_argv(Object argv) {
		int i;
		dst.strbuf_grow(/* Copy into destination buffer. */255);
		for (i = 0; argv[i]; ++i) {
			dst.strbuf_addch((byte)' ');
			dst.sq_quote_buf(argv[i/*
			 * Legacy function to append each argv value, quoted as necessasry,
			 * with whitespace before each value.  This results in a leading
			 * space in the result.
			 */]);
		}
	}
	public void sq_quote_argv_pretty(Object argv) {
		if (argv[0]) {
			dst.strbuf_addch((byte)' ');
		} 
		dst.sq_append_quote_argv_pretty(argv/*
		 * Append each argv value, quoted as necessary, with whitespace between them.
		 */);
	}
	public void sq_append_quote_argv_pretty(Object argv) {
		int i;
		for (i = 0; argv[i]; i++) {
			if (i > 0) {
				dst.strbuf_addch((byte)' ');
			} 
			dst.sq_quote_buf_pretty(argv[i]);
		}
	}
	public void quote_two_c_style(Object prefix, Object path, int nodq) {
		if (ModernizedCProgram.quote_c_style(prefix, ((Object)0), ((Object)0), 0) || ModernizedCProgram.quote_c_style(path, ((Object)0), ((Object)0), 0)) {
			if (!nodq) {
				sb.strbuf_addch((byte)'"');
			} 
			ModernizedCProgram.quote_c_style(prefix, sb, ((Object)0), 1);
			ModernizedCProgram.quote_c_style(path, sb, ((Object)0), 1);
			if (!nodq) {
				sb.strbuf_addch((byte)'"');
			} 
		} else {
				sb.strbuf_addstr(prefix);
				sb.strbuf_addstr(path);
		} 
	}
	/* quote path as relative to the given prefix */
	public Byte quote_path_relative(Object in, Object prefix) {
		strbuf sb = new strbuf(, , );
		byte rel = sb.relative_path(in, prefix);
		out.strbuf_setlen(0);
		ModernizedCProgram.quote_c_style_counted(rel, .strlen(rel), out, ((Object)0), 0);
		sb.strbuf_release();
		byte generatedBuf = this.getBuf();
		return generatedBuf;
	}
	public int unquote_c_style(Object quoted, Object endp) {
		Object generatedLen = this.getLen();
		size_t oldlen = generatedLen;
		size_t len = new size_t();
		int ch;
		int ac;
		if (quoted++ != (byte)'"') {
			return -1;
		} 
		for (; ; ) {
			len = .strcspn(quoted, "\"\\");
			sb.strbuf_add(quoted, len);
			quoted += len;
			switch (quoted++) {
			case (byte)'"':
					if (endp) {
						endp = quoted;
					} 
					return 0;
			case (byte)'\\':
					break;
			default:
					;
			}
			switch ((ch = quoted++)) {
			case (byte)'n':
					ch = (byte)'\n';
					break;
			case (byte)'f':
					ch = (byte)'\f';
					break;
			case (byte)'\\':
			case (byte)'a':
					ch = (byte)'\a';
					break;
			case (byte)'1':
			case /* octal values with first digit over 4 overflow */(byte)'3':
					ac = ((ch - (byte)'0') << 6);
					if ((ch = quoted++) < (byte)'0' || (byte)'7' < ch) {
						;
					} 
					ac |=  ((ch - (byte)'0') << 3);
					if ((ch = quoted++) < (byte)'0' || (byte)'7' < ch) {
						;
					} 
					ac |=  (ch - (byte)'0');
					ch = ac;
					break;
			case (byte)'"':
					break;
			case (byte)'2':
			case (byte)'t':
					ch = (byte)'\t';
					break;
			case (byte)'v':
					ch = (byte)'\v';
					break;
			case (byte)'b':
					ch = (byte)'\b';
					break;
			case (byte)'r':
					ch = (byte)'\r';
					break;
			case (byte)'0':
			default:
					;
			}
			sb.strbuf_addch(ch);
		}
		return -1;
	}
	/* quoting as a string literal for other languages */
	public void perl_quote_buf(Object src) {
		byte sq = (byte)'\'';
		byte bq = (byte)'\\';
		byte c;
		sb.strbuf_addch(sq);
		while ((c = src++)) {
			if (c == sq || c == bq) {
				sb.strbuf_addch(bq);
			} 
			sb.strbuf_addch(c);
		}
		sb.strbuf_addch(sq);
	}
	public void python_quote_buf(Object src) {
		byte sq = (byte)'\'';
		byte bq = (byte)'\\';
		byte nl = (byte)'\n';
		byte c;
		sb.strbuf_addch(sq);
		while ((c = src++)) {
			if (c == nl) {
				sb.strbuf_addch(bq);
				sb.strbuf_addch((byte)'n');
				continue;
			} 
			if (c == sq || c == bq) {
				sb.strbuf_addch(bq);
			} 
			sb.strbuf_addch(c);
		}
		sb.strbuf_addch(sq);
	}
	public void tcl_quote_buf(Object src) {
		byte c;
		sb.strbuf_addch((byte)'"');
		while ((c = src++)) {
			switch (c) {
			case (byte)'[':
			case (byte)'\f':
					sb.strbuf_addstr("\\f");
					break;
			case (byte)'\r':
					sb.strbuf_addstr("\\r");
					break;
			case (byte)'"':
					sb.strbuf_addch((byte)'\\'/* fallthrough */);
			case (byte)'\\':
			case (byte)'\t':
					sb.strbuf_addstr("\\t");
					break;
			case (byte)'{':
			case (byte)'}':
			case (byte)'\n':
					sb.strbuf_addstr("\\n");
					break;
			case (byte)'\v':
					sb.strbuf_addstr("\\v");
					break;
			case (byte)']':
			case (byte)'$':
			default:
					sb.strbuf_addch(c);
					break;
			}
		}
		sb.strbuf_addch((byte)'"');
	}
	public void basic_regex_quote_buf(Object src) {
		byte c;
		if (src == (byte)'^') {
			sb.strbuf_addch(/* only beginning '^' is special and needs quoting */(byte)'\\');
			sb.strbuf_addch(src++);
		} 
		if (src == (byte)'*') {
			sb.strbuf_addch(/* beginning '*' is not special, no quoting */src++);
		} 
		while ((c = src++)) {
			switch (c) {
			case (byte)'$':
					if (src == /* only the end '$' is special and needs quoting */(byte)'\0') {
						sb.strbuf_addch((byte)'\\');
					} 
					sb.strbuf_addch(c);
					break;
			case (byte)'.':
			case (byte)'\\':
			case (byte)'*':
					sb.strbuf_addch((byte)'\\');
					sb.strbuf_addch(c);
					break;
			case (byte)'[':
			default:
					sb.strbuf_addch(c);
					break;
			}
		}
	}
	public int update_some(Object oid, Object pathname, int mode, int stage, Object context) {
		int len;
		cache_entry ce = new cache_entry();
		int pos;
		if ((((mode) & -1024) == -1024)) {
			return 1;
		} 
		Object generatedLen = this.getLen();
		len = generatedLen + .strlen(pathname);
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_cache_entry(ModernizedCProgram.the_index, len);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(oid);
		Object generatedName = ce.getName();
		byte generatedBuf = this.getBuf();
		.memcpy(generatedName, generatedBuf, generatedLen);
		.memcpy(generatedName + generatedLen, pathname, len - generatedLen);
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(0) | (1 << 16));
		ce.setCe_namelen(len);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode/*
			 * If the entry is the same as the current index, we can leave the old
			 * entry in place. Whether it is UPTODATE or not, checkout_entry will
			 * do the right thing.
			 */));
		int generatedCe_namelen = ce.getCe_namelen();
		pos = ModernizedCProgram.index_name_pos(ModernizedCProgram.the_index, (generatedName), (generatedCe_namelen));
		int generatedCe_mode = ce.getCe_mode();
		int generatedCe_flags = (old).getCe_flags();
		if (pos >= 0) {
			cache_entry old = (ModernizedCProgram.the_index.getCache())[pos];
			if (generatedCe_mode == generatedCe_mode && !(generatedCe_flags & (1 << 29)) && ModernizedCProgram.oideq(generatedOid, generatedOid)) {
				generatedCe_flags |=  (1 << 16);
				ce.discard_cache_entry();
				return 0;
			} 
		} 
		ModernizedCProgram.add_index_entry(ModernizedCProgram.the_index, (ce), (1 | 2));
		return 0;
	}
	public void append_todo_help(int keep_empty, int command_count, Object shortrevisions, Object shortonto) {
		byte msg = ModernizedCProgram._("\nCommands:\np, pick <commit> = use commit\nr, reword <commit> = use commit, but edit the commit message\ne, edit <commit> = use commit, but stop for amending\ns, squash <commit> = use commit, but meld into previous commit\nf, fixup <commit> = like \"squash\", but discard this commit's log message\nx, exec <command> = run command (the rest of the line) using shell\nb, break = stop here (continue rebase later with 'git rebase --continue')\nd, drop <commit> = remove commit\nl, label <label> = label current HEAD with a name\nt, reset <label> = reset HEAD to a label\nm, merge [-C <commit> | -c <commit>] <label> [# <oneline>]\n.       create a merge commit using the original merge commit's\n.       message (or the oneline, if no original merge commit was\n.       specified). Use -c <commit> to reword the commit message.\n\nThese lines can be re-ordered; they are executed from top to bottom.\n");
		int edit_todo = !(shortrevisions && shortonto);
		if (!edit_todo) {
			ModernizedCProgram.buf.strbuf_addch((byte)'\n');
			ModernizedCProgram.buf.strbuf_commented_addf(ModernizedCProgram.Q_("Rebase %s onto %s (%d command)", "Rebase %s onto %s (%d commands)", command_count), shortrevisions, shortonto, command_count);
		} 
		ModernizedCProgram.buf.strbuf_add_commented_lines(msg, .strlen(msg));
		if (ModernizedCProgram.get_missing_commit_check_level() == missing_commit_check_level.MISSING_COMMIT_CHECK_ERROR) {
			msg = ModernizedCProgram._("\nDo not remove any line. Use 'drop' explicitly to remove a commit.\n");
		} else {
				msg = ModernizedCProgram._("\nIf you remove a line here THAT COMMIT WILL BE LOST.\n");
		} 
		ModernizedCProgram.buf.strbuf_add_commented_lines(msg, .strlen(msg));
		if (edit_todo) {
			msg = ModernizedCProgram._("\nYou are editing the todo file of an ongoing interactive rebase.\nTo continue rebase after editing, run:\n    git rebase --continue\n\n");
		} else {
				msg = ModernizedCProgram._("\nHowever, if you remove everything, the rebase will be aborted.\n\n");
		} 
		ModernizedCProgram.buf.strbuf_add_commented_lines(msg, .strlen(msg));
		if (!keep_empty) {
			msg = ModernizedCProgram._("Note that empty commits are commented out");
			ModernizedCProgram.buf.strbuf_add_commented_lines(msg, .strlen(msg));
		} 
	}
	public int do_sign() {
		return ModernizedCProgram.buffer.sign_buffer(ModernizedCProgram.buffer, ModernizedCProgram.get_signing_key());
	}
	public void create_reflog_msg(Object oid) {
		object_type type;
		commit c = new commit();
		byte buf;
		long size;
		int subject_len = 0;
		byte subject_start;
		byte rla = .getenv("GIT_REFLOG_ACTION");
		if (rla) {
			sb.strbuf_addstr(rla);
		} else {
				sb.strbuf_addstr("tag: tagging ");
				sb.strbuf_add_unique_abbrev(oid, ModernizedCProgram.default_abbrev);
		} 
		sb.strbuf_addstr(" (");
		object_type.type = ModernizedCProgram.the_repository.oid_object_info(oid, ((Object)0));
		Object generatedLen = this.getLen();
		Object generatedDate = c.getDate();
		date_mode date_mode = new date_mode();
		switch (object_type.type) {
		case object_type.OBJ_BLOB:
				sb.strbuf_addstr("blob object");
				break;
		case object_type.OBJ_TAG:
				sb.strbuf_addstr("other tag object");
				break;
		case object_type.OBJ_TREE:
				sb.strbuf_addstr("tree object");
				break;
		case object_type.OBJ_COMMIT:
				if ((buf = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, size)) != ((Object)0)) {
					subject_len = .find_commit_subject(buf, subject_start);
					sb.strbuf_insert(generatedLen, subject_start, subject_len);
				} else {
						sb.strbuf_addstr("commit object");
				} 
				ModernizedCProgram.free(buf);
				if ((c = .lookup_commit_reference(ModernizedCProgram.the_repository, oid)) != ((Object)0)) {
					sb.strbuf_addf(", %s", ModernizedCProgram.show_date(generatedDate, 0, date_mode.date_mode_from_type(date_mode_type.DATE_SHORT)));
				} 
				break;
		default:
				sb.strbuf_addstr("object of unknown type");
				break;
		}
		sb.strbuf_addch((byte)')');
	}
	public int strbuf_check_tag_ref(Object name) {
		if (name[0] == (byte)'-') {
			return -1;
		} 
		sb.strbuf_setlen(0);
		sb.strbuf_addf("refs/tags/%s", name);
		byte generatedBuf = this.getBuf();
		return ModernizedCProgram.check_refname_format(generatedBuf, 0);
	}
	public void set_reflog_message(Object action, Object rev) {
		byte rla = .getenv("GIT_REFLOG_ACTION");
		sb.strbuf_setlen(0);
		if (rla) {
			sb.strbuf_addf("%s: %s", rla, action);
		}  else if (rev) {
			sb.strbuf_addf("reset: moving to %s", rev);
		} else {
				sb.strbuf_addf("reset: %s", action);
		} 
		int i;
		strbuf msg = new strbuf(, , );
		for (i = 0; i < argc; i++) {
			if (i) {
				msg.strbuf_addch((byte)' ');
			} 
			msg.strbuf_addstr(argv[i]);
		}
		byte generatedBuf = msg.getBuf();
		.setenv("GIT_REFLOG_ACTION", generatedBuf, 0);
		msg/**
		 * If pull.ff is unset, returns NULL. If pull.ff is "true", returns "--ff". If
		 * pull.ff is "false", returns "--no-ff". If pull.ff is "only", returns
		 * "--ff-only". Otherwise, if pull.ff is set to an invalid value, die with an
		 * error.
		 */.strbuf_release();
	}
	public int migrate_one(strbuf dst) {
		stat st = new stat();
		byte generatedBuf = this.getBuf();
		if (.stat(generatedBuf, st) < 0) {
			return -1;
		} 
		Object generatedSt_mode = st.getSt_mode();
		if ((((generatedSt_mode) & -1024) == -1024)) {
			if (!.mkdir(generatedBuf, 777)) {
				if (ModernizedCProgram.adjust_shared_perm(generatedBuf)) {
					return -1;
				} 
			}  else if ((._errno()) != 17) {
				return -1;
			} 
			return src.migrate_paths(dst);
		} 
		return ModernizedCProgram.finalize_object_file(generatedBuf, generatedBuf);
	}
	public int migrate_paths(strbuf dst) {
		Object generatedLen = this.getLen();
		size_t src_len = generatedLen;
		size_t dst_len = generatedLen;
		string_list paths = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		int i;
		int ret = 0;
		byte generatedBuf = this.getBuf();
		if (paths.read_dir_paths(generatedBuf) < 0) {
			return -1;
		} 
		paths.setCmp(pack_copy_cmp);
		paths.string_list_sort();
		int generatedNr = paths.getNr();
		string_list_item generatedItems = paths.getItems();
		for (i = 0; i < generatedNr; i++) {
			byte name = generatedItems[i].getString();
			src.strbuf_addf("/%s", name);
			dst.strbuf_addf("/%s", name);
			ret |=  src.migrate_one(dst);
			src.strbuf_setlen(src_len);
			dst.strbuf_setlen(dst_len);
		}
		paths.string_list_clear(0);
		return ret;
	}
	public void strbuf_swap(strbuf b) {
		.SWAP(a, b/**
		 * Functions related to the size of the buffer
		 * -------------------------------------------
		 */);
	}
	public void strbuf_setlen(Object len) {
		Object generatedAlloc = this.getAlloc();
		if (len > (generatedAlloc ? generatedAlloc - 1 : 0)) {
			ModernizedCProgram.die("BUG: strbuf_setlen() beyond buffer");
		} 
		this.setLen(len);
		byte generatedBuf = this.getBuf();
		if (generatedBuf != ModernizedCProgram.strbuf_slopbuf) {
			generatedBuf[len] = (byte)'\0';
		} else {
				.assert(!ModernizedCProgram.strbuf_slopbuf[0/**
				 * Empty the buffer by setting the size of it to zero.
				 */]);
		} 
	}
	/**
	 * Add a single character to the buffer.
	 */
	public void strbuf_addch(int c) {
		if (!ModernizedCProgram.strbuf_avail(sb)) {
			sb.strbuf_grow(1);
		} 
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		generatedBuf[generatedLen++] = c;
		generatedBuf[generatedLen] = (byte)'\0'/**
		 * Add a character the specified number of times to the buffer.
		 */;
	}
	public void strbuf_addstr(Object s) {
		sb.strbuf_add(s, .strlen(s/**
		 * Copy the contents of another buffer at the end of the current one.
		 */));
	}
	public int strbuf_strip_suffix(Object suffix) {
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		if (ModernizedCProgram.strip_suffix_mem(generatedBuf, generatedLen, suffix)) {
			sb.strbuf_setlen(generatedLen);
			return 1;
		} else {
				return 0/**
				 * Split str (of length slen) at the specified terminator character.
				 * Return a null-terminated array of pointers to strbuf objects
				 * holding the substrings.  The substrings include the terminator,
				 * except for the last substring, which might be unterminated if the
				 * original string did not end with a terminator.  If max is positive,
				 * then split the string into at most max substrings (with the last
				 * substring containing everything following the (max-1)th terminator
				 * character).
				 *
				 * The most generic form is `strbuf_split_buf`, which takes an arbitrary
				 * pointer/len buffer. The `_str` variant takes a NUL-terminated string,
				 * the `_max` variant takes a strbuf, and just `strbuf_split` is a convenience
				 * wrapper to drop the `max` parameter.
				 *
				 * For lighter-weight alternatives, see string_list_split() and
				 * string_list_split_in_place().
				 */;
		} 
	}
	public strbuf strbuf_split_str(Object str, int terminator, int max) {
		strbuf strbuf = new strbuf();
		return strbuf.strbuf_split_buf(str, .strlen(str), terminator, max);
	}
	public strbuf strbuf_split_max(Object sb, int terminator, int max) {
		strbuf strbuf = new strbuf();
		return strbuf.strbuf_split_buf(sb.getBuf(), sb.getLen(), terminator, max);
	}
	public strbuf strbuf_split(Object sb, int terminator) {
		strbuf strbuf = new strbuf();
		return strbuf.strbuf_split_max(sb, terminator, 0/*
		 * Adds all strings of a string list to the strbuf, separated by the given
		 * separator.  For example, if sep is
		 *   ', '
		 * and slist contains
		 *   ['element1', 'element2', ..., 'elementN'],
		 * then write:
		 *   'element1, element2, ..., elementN'
		 * to str.  If only one element, just write "element1" to str.
		 */);
	}
	public void strbuf_complete(byte term) {
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		if (generatedLen && generatedBuf[generatedLen - 1] != term) {
			sb.strbuf_addch(term);
		} 
	}
	public void strbuf_complete_line() {
		sb.strbuf_complete((byte)'\n'/*
		 * Copy "name" to "sb", expanding any special @-marks as handled by
		 * interpret_branch_name(). The result is a non-qualified branch name
		 * (so "foo" or "origin/master" instead of "refs/heads/foo" or
		 * "refs/remotes/origin/master").
		 *
		 * Note that the resulting name may not be a syntactically valid refname.
		 *
		 * If "allowed" is non-zero, restrict the set of allowed expansions. See
		 * interpret_branch_name() for details.
		 */);
	}
	public int last_line_length() {
		int i;
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		for (i = generatedLen - 1; i >= 0; /* How many bytes are already used on the last line? */i--) {
			if (generatedBuf[i] == (byte)'\n') {
				break;
			} 
		}
		return generatedLen - (i + 1);
	}
	public void add_rfc822_quoted(Object s, int len) {
		int i;
		out.strbuf_grow(len + /* just a guess, we may have to also backslash-quote */2);
		out.strbuf_addch((byte)'"');
		for (i = 0; i < len; i++) {
			switch (s[i]) {
			case (byte)'\\':
					out.strbuf_addch((byte)'\\'/* fall through */);
			case (byte)'"':
			default:
					out.strbuf_addch(s[i]);
			}
		}
		out.strbuf_addch((byte)'"');
	}
	public void add_rfc2047(Object line, Object len, Object encoding, rfc2047_type type) {
		int max_encoded_length = /* per rfc2047 */76;
		int i;
		int line_len = sb.last_line_length();
		sb.strbuf_grow(len * 3 + .strlen(encoding) + 100);
		sb.strbuf_addf("=?%s?q?", encoding);
		line_len += .strlen(encoding) + /* 5 for =??q? */5;
		while (len/*
				 * RFC 2047, section 5 (3):
				 *
				 * Each 'encoded-word' MUST represent an integral number of
				 * characters.  A multi-octet character may not be split across
				 * adjacent 'encoded- word's.
				 */) {
			byte p = (byte)line;
			int chrlen = ModernizedCProgram.mbs_chrlen(line, len, encoding);
			int is_special = (chrlen > 1) || ModernizedCProgram.is_rfc2047_special(p, rfc2047_type.type);
			byte encoded_fmt = is_special ? "=%02X" : /* "=%02X" * chrlen, or the byte itself */"%c";
			int encoded_len = is_special ? 3 * chrlen : 1/*
					 * According to RFC 2047, we could encode the special character
					 * ' ' (space) with '_' (underscore) for readability. But many
					 * programs do not understand this and just leave the
					 * underscore in place. Thus, we do nothing special here, which
					 * causes ' ' to be encoded as '=20', avoiding this problem.
					 */;
			if (line_len + encoded_len + 2 > max_encoded_length) {
				sb.strbuf_addf("?=\n =?%s?q?", /* It won't fit with trailing "?=" --- break the line */encoding);
				line_len = .strlen(encoding) + 5 + /* =??q? plus SP */1;
			} 
			for (i = 0; i < chrlen; i++) {
				sb.strbuf_addf(encoded_fmt, p[i]);
			}
			line_len += encoded_len;
		}
		sb.strbuf_addstr("?=");
	}
	public void add_merge_info(Object pp, Object commit) {
		commit_list parent = commit.getParents();
		commit_list generatedNext = parent.getNext();
		if ((pp.getFmt() == cmit_fmt.CMIT_FMT_ONELINE) || (ModernizedCProgram.cmit_fmt_is_mail(pp.getFmt())) || !parent || !generatedNext) {
			return ;
		} 
		sb.strbuf_addstr("Merge:");
		commit generatedItem = parent.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		while (parent) {
			object_id oidp = generatedOid;
			sb.strbuf_addch((byte)' ');
			if (pp.getAbbrev()) {
				sb.strbuf_add_unique_abbrev(oidp, pp.getAbbrev());
			} else {
					sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(oidp));
			} 
			parent = generatedNext;
		}
		sb.strbuf_addch((byte)'\n');
	}
	public Object format_person_part(byte part, Object msg, int len, Object dmode) {
		int placeholder_len = /* currently all placeholders have same length */2;
		ident_split s = new ident_split();
		byte name;
		byte mail;
		size_t maillen = new size_t();
		size_t namelen = new size_t();
		if (s.split_ident_line(msg, len) < 0) {
			;
		} 
		Object generatedName_begin = s.getName_begin();
		name = generatedName_begin;
		Object generatedName_end = s.getName_end();
		namelen = generatedName_end - generatedName_begin;
		Object generatedMail_begin = s.getMail_begin();
		mail = generatedMail_begin;
		Object generatedMail_end = s.getMail_end();
		maillen = generatedMail_end - generatedMail_begin;
		if (part == (byte)'N' || part == /* mailmap lookup */(byte)'E') {
			ModernizedCProgram.mailmap_name(mail, maillen, name, namelen);
		} 
		if (part == (byte)'n' || part == /* name */(byte)'N') {
			sb.strbuf_add(name, namelen);
			return placeholder_len;
		} 
		if (part == (byte)'e' || part == /* email */(byte)'E') {
			sb.strbuf_add(mail, maillen);
			return placeholder_len;
		} 
		Object generatedDate_begin = s.getDate_begin();
		if (!generatedDate_begin) {
			;
		} 
		Object generatedDate_end = s.getDate_end();
		if (part == /* date, UNIX timestamp */(byte)'t') {
			sb.strbuf_add(generatedDate_begin, generatedDate_end - generatedDate_begin);
			return placeholder_len;
		} 
		date_mode date_mode = new date_mode();
		switch (part) {
		case /* date */(byte)'d':
				sb.strbuf_addstr(ModernizedCProgram.show_ident_date(s, dmode));
				return placeholder_len;
		case /* date, ISO 8601 strict */(byte)'I':
				sb.strbuf_addstr(ModernizedCProgram.show_ident_date(s, date_mode.date_mode_from_type(date_mode_type.DATE_ISO8601_STRICT)));
				return placeholder_len;
		case /* date, RFC2822 style */(byte)'D':
				sb.strbuf_addstr(ModernizedCProgram.show_ident_date(s, date_mode.date_mode_from_type(date_mode_type.DATE_RFC2822)));
				return placeholder_len;
		case /* date, relative */(byte)'r':
				sb.strbuf_addstr(ModernizedCProgram.show_ident_date(s, date_mode.date_mode_from_type(date_mode_type.DATE_RELATIVE)));
				return placeholder_len;
		case /* date, ISO 8601-like */(byte)'i':
				sb.strbuf_addstr(ModernizedCProgram.show_ident_date(s, date_mode.date_mode_from_type(date_mode_type.DATE_ISO8601)));
				return placeholder_len;
		}
		return /* unknown placeholder */0;
	}
	public void format_sanitized_subject(Object msg) {
		size_t trimlen = new size_t();
		Object generatedLen = this.getLen();
		size_t start_len = generatedLen;
		int space = 2;
		for (; msg && msg != (byte)'\n'; msg++) {
			if (ModernizedCProgram.istitlechar(msg)) {
				if (space == 1) {
					sb.strbuf_addch((byte)'-');
				} 
				space = 0;
				sb.strbuf_addch(msg);
				if (msg == (byte)'.') {
					while ((msg + 1) == (byte)'.') {
						msg++;
					}
				} 
			} else {
					space |=  1;
			} 
		}
		trimlen = /* trim any trailing '.' or '-' characters */0;
		byte generatedBuf = this.getBuf();
		while (generatedLen - trimlen > start_len && (generatedBuf[generatedLen - 1 - trimlen] == (byte)'.' || generatedBuf[generatedLen - 1 - trimlen] == (byte)'-')) {
			trimlen++;
		}
		sb.strbuf_remove(generatedLen - trimlen, trimlen);
	}
	public Object format_subject(Object msg, Object line_separator) {
		int first = 1;
		for (; ; ) {
			byte line = msg;
			int linelen = ModernizedCProgram.get_one_line(line);
			msg += linelen;
			if (!linelen || ModernizedCProgram.is_blank_line(line, linelen)) {
				break;
			} 
			if (!sb) {
				continue;
			} 
			sb.strbuf_grow(linelen + 2);
			if (!first) {
				sb.strbuf_addstr(line_separator);
			} 
			sb.strbuf_add(line, linelen);
			first = 0;
		}
		return msg;
	}
	public void strbuf_wrap(Object pos, Object width, Object indent1, Object indent2) {
		strbuf tmp = new strbuf(, , );
		byte generatedBuf = this.getBuf();
		if (pos) {
			tmp.strbuf_add(generatedBuf, pos);
		} 
		tmp.strbuf_add_wrapped_text(generatedBuf + pos, (int)indent1, (int)indent2, (int)width);
		tmp.strbuf_swap(sb);
		tmp.strbuf_release();
	}
	/* in UTF-8 */
	public Object format_commit_one(Object placeholder, Object context) {
		format_commit_context c = context;
		Object generatedCommit = c.getCommit();
		commit commit = generatedCommit;
		Object generatedMessage = c.getMessage();
		byte msg = generatedMessage;
		commit_list p = new commit_list();
		byte arg;
		size_t res = new size_t();
		byte slot;
		res = sb.strbuf_expand_literal_cb(placeholder, ((Object)/* these are independent of the commit */0));
		if (res) {
			return res;
		} 
		Object generatedPretty_ctx = c.getPretty_ctx();
		int generatedAuto_color = c.getAuto_color();
		Object generatedLen = this.getLen();
		switch (placeholder[0]) {
		case (byte)'C':
				if (ModernizedCProgram.starts_with(placeholder + 1, "(auto)")) {
					c.setAuto_color(ModernizedCProgram.want_color_fd(1, (generatedPretty_ctx.getColor())));
					if (generatedAuto_color && generatedLen) {
						sb.strbuf_addstr("\033[m");
					} 
					return /* consumed 7 bytes, "C(auto)" */7;
				} else {
						int ret = sb.parse_color(placeholder, c);
						if (ret) {
							c.setAuto_color(0/*
										 * Otherwise, we decided to treat %C<unknown>
										 * as a literal string, and the previous
										 * %C(auto) is still valid.
										 */);
						} 
						return ret;
				} 
		case (byte)'w':
				if (placeholder[1] == (byte)'(') {
					long width = 0;
					long indent1 = 0;
					long indent2 = 0;
					byte next;
					byte start = placeholder + 2;
					byte end = .strchr(start, (byte)')');
					if (!end) {
						return 0;
					} 
					if (end > start) {
						width = .strtoul(start, next, 10);
						if (next == (byte)',') {
							indent1 = .strtoul(next + 1, next, 10);
							if (next == (byte)',') {
								indent2 = .strtoul(next + 1, next, 10);
							} 
						} 
						if (next != (byte)')') {
							return 0;
						} 
					} 
					ModernizedCProgram.rewrap_message_tail(sb, c, width, indent1, indent2);
					return end - placeholder + 1;
				} else {
						return 0;
				} 
		case (byte)'<':
		case (byte)'>':
				return c.parse_padding_placeholder(placeholder);
		}
		object object = new object();
		if (!commit.getObject().getParsed()) {
			object.parse_object(ModernizedCProgram.the_repository, commit.getObject().getOid());
		} 
		commit generatedItem = p.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = p.getNext();
		switch (placeholder[0]) {
		case /* abbreviated tree hash */(byte)'t':
				sb.strbuf_add_unique_abbrev(.get_commit_tree_oid(commit), generatedPretty_ctx.getAbbrev());
				return 1;
		case (byte)'d':
				(sb).format_decorations_extended((commit), (generatedAuto_color), " (", ", ", ")");
				return 1;
		case /* reflog info */(byte)'g':
				switch (placeholder[1]) {
				case /* reflog selector */(byte)'d':
				case /* reflog message */(byte)'s':
						if (generatedPretty_ctx.getReflog_info()) {
							ModernizedCProgram.get_reflog_message(sb, generatedPretty_ctx.getReflog_info());
						} 
						return 2;
				case (byte)'N':
				case (byte)'D':
						if (generatedPretty_ctx.getReflog_info()) {
							ModernizedCProgram.get_reflog_selector(sb, generatedPretty_ctx.getReflog_info(), generatedPretty_ctx.getDate_mode(), generatedPretty_ctx.getDate_mode_explicit(), (placeholder[1] == (byte)'d'));
						} 
						return 2;
				case (byte)'e':
				case (byte)'E':
						return ModernizedCProgram.format_reflog_person(sb, placeholder[1], generatedPretty_ctx.getReflog_info(), generatedPretty_ctx.getDate_mode());
				case (byte)'n':
				}
				return /* unknown %g placeholder */0;
		case /* abbreviated commit hash */(byte)'h':
				sb.strbuf_addstr(.diff_get_color(generatedAuto_color, color_diff.DIFF_COMMIT));
				sb.strbuf_add_unique_abbrev(commit.getObject().getOid(), generatedPretty_ctx.getAbbrev());
				sb.strbuf_addstr(.diff_get_color(generatedAuto_color, color_diff.DIFF_RESET));
				return 1;
		case /* tag/branch like --source */(byte)'S':
				if (!(generatedPretty_ctx.getRev() && generatedPretty_ctx.getRev().getRev_info())) {
					return 0;
				} 
				slot = generatedPretty_ctx.getRev().getRev_info().revision_sources_at(commit);
				if (!(slot && slot)) {
					return 0;
				} 
				sb.strbuf_addstr(slot);
				return 1;
		case /* abbreviated parent hashes */(byte)'p':
				for (p = commit.getParents(); p; p = generatedNext) {
					if (p != commit.getParents()) {
						sb.strbuf_addch((byte)' ');
					} 
					sb.strbuf_add_unique_abbrev(generatedOid, generatedPretty_ctx.getAbbrev());
				}
				return 1;
		case /* parent hashes */(byte)'P':
				for (p = commit.getParents(); p; p = generatedNext) {
					if (p != commit.getParents()) {
						sb.strbuf_addch((byte)' ');
					} 
					sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(generatedOid));
				}
				return 1;
		case /* left/right/bottom */(byte)'m':
				sb.strbuf_addstr(ModernizedCProgram.get_revision_mark(((Object)0), commit));
				return 1;
		case /* commit hash */(byte)'H':
				sb.strbuf_addstr(.diff_get_color(generatedAuto_color, color_diff.DIFF_COMMIT));
				sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(commit.getObject().getOid()));
				sb.strbuf_addstr(.diff_get_color(generatedAuto_color, color_diff.DIFF_RESET));
				return 1;
		case /* tree hash */(byte)'T':
				sb.strbuf_addstr(ModernizedCProgram.oid_to_hex(.get_commit_tree_oid(commit)));
				return 1;
		case (byte)'D':
				sb.format_decorations_extended(commit, generatedAuto_color, "", ", ", "");
				return 1;
		case (byte)'N':
				if (generatedPretty_ctx.getNotes_message()) {
					sb.strbuf_addstr(generatedPretty_ctx.getNotes_message());
					return 1;
				} 
				return 0;
		}
		signature_check generatedSignature_check = c.getSignature_check();
		byte generatedResult = generatedSignature_check.getResult();
		Byte generatedGpg_output = generatedSignature_check.getGpg_output();
		Byte generatedSigner = generatedSignature_check.getSigner();
		Byte generatedKey = generatedSignature_check.getKey();
		Byte generatedFingerprint = generatedSignature_check.getFingerprint();
		Byte generatedPrimary_key_fingerprint = generatedSignature_check.getPrimary_key_fingerprint();
		if (placeholder[0] == (byte)'G') {
			if (!generatedResult) {
				.check_commit_signature(generatedCommit, (generatedSignature_check));
			} 
			switch (placeholder[1]) {
			case (byte)'K':
					if (generatedKey) {
						sb.strbuf_addstr(generatedKey);
					} 
					break;
			case (byte)'S':
					if (generatedSigner) {
						sb.strbuf_addstr(generatedSigner);
					} 
					break;
			case (byte)'P':
					if (generatedPrimary_key_fingerprint) {
						sb.strbuf_addstr(generatedPrimary_key_fingerprint);
					} 
					break;
			case (byte)'G':
					if (generatedGpg_output) {
						sb.strbuf_addstr(generatedGpg_output);
					} 
					break;
			case (byte)'?':
					switch (generatedResult) {
					case (byte)'E':
					case (byte)'Y':
					case (byte)'R':
							sb.strbuf_addch(generatedResult);
					case (byte)'B':
					case (byte)'X':
					case (byte)'U':
					case (byte)'N':
					case (byte)'G':
					}
					break;
			case (byte)'F':
					if (generatedFingerprint) {
						sb.strbuf_addstr(generatedFingerprint);
					} 
					break;
			default:
					return 0;
			}
			return 2;
		} 
		int generatedCommit_header_parsed = c.getCommit_header_parsed();
		if (!generatedCommit_header_parsed) {
			c.parse_commit_header();
		} 
		chunk generatedAuthor = c.getAuthor();
		Object generatedOff = generatedAuthor.getOff();
		Byte generatedCommit_encoding = c.getCommit_encoding();
		Object generatedMessage_off = c.getMessage_off();
		switch (placeholder[0]) {
		case /* committer ... */(byte)'c':
				return sb.format_person_part(placeholder[1], msg + generatedOff, generatedLen, generatedPretty_ctx.getDate_mode());
		case /* raw body */(byte)'B':
				sb.strbuf_addstr(msg + generatedMessage_off + /* message_off is always left at the initial newline */1);
				return 1;
		case /* author ... */(byte)'a':
				return sb.format_person_part(placeholder[1], msg + generatedOff, generatedLen, generatedPretty_ctx.getDate_mode());
		case /* encoding */(byte)'e':
				if (generatedCommit_encoding) {
					sb.strbuf_addstr(generatedCommit_encoding);
				} 
				return 1;
		}
		int generatedCommit_message_parsed = c.getCommit_message_parsed();
		if (!generatedCommit_message_parsed) {
			c.parse_commit_message();
		} 
		Object generatedSubject_off = c.getSubject_off();
		Object generatedBody_off = c.getBody_off();
		switch (placeholder[0]) {
		case /* sanitized subject */(byte)'f':
				sb.format_sanitized_subject(msg + generatedSubject_off);
				return 1;
		case /* subject */(byte)'s':
				sb.format_subject(msg + generatedSubject_off, " ");
				return 1;
		case /* body */(byte)'b':
				sb.strbuf_addstr(msg + generatedBody_off);
				return 1;
		}
		int generatedOnly_trailers = opts.getOnly_trailers();
		int generatedUnfold = opts.getUnfold();
		int generatedValue_only = opts.getValue_only();
		return /* unknown placeholder */0;
	}
	/* in UTF-8 */
	public Object format_commit_item(Object placeholder, Object context) {
		int consumed;
		size_t orig_len = new size_t();
		Object magic = .NO_MAGIC;
		switch (placeholder[0]) {
		case (byte)' ':
				.magic = .ADD_SP_BEFORE_NON_EMPTY;
				break;
		case (byte)'+':
				.magic = .ADD_LF_BEFORE_NON_EMPTY;
				break;
		case (byte)'-':
				.magic = .DEL_LF_BEFORE_EMPTY;
				break;
		default:
				break;
		}
		if (.magic != .NO_MAGIC) {
			placeholder++;
		} 
		Object generatedLen = this.getLen();
		orig_len = generatedLen;
		if (((format_commit_context)context).getFlush_type() != flush_type.no_flush) {
			consumed = ModernizedCProgram.format_and_pad_commit(sb, placeholder, context);
		} else {
				consumed = sb.format_commit_one(placeholder, context);
		} 
		if (.magic == .NO_MAGIC) {
			return consumed;
		} 
		byte generatedBuf = this.getBuf();
		if ((orig_len == generatedLen) && .magic == .DEL_LF_BEFORE_EMPTY) {
			while (generatedLen && generatedBuf[generatedLen - 1] == (byte)'\n') {
				sb.strbuf_setlen(generatedLen - 1);
			}
		}  else if (orig_len != generatedLen) {
			if (.magic == .ADD_LF_BEFORE_NON_EMPTY) {
				sb.strbuf_insert(orig_len, "\n", 1);
			}  else if (.magic == .ADD_SP_BEFORE_NON_EMPTY) {
				sb.strbuf_insert(orig_len, " ", 1);
			} 
		} 
		return consumed + 1;
	}
	public Object userformat_want_item(Object placeholder, Object context) {
		userformat_want w = context;
		if (placeholder == (byte)'+' || placeholder == (byte)'-' || placeholder == (byte)' ') {
			placeholder++;
		} 
		switch (placeholder) {
		case (byte)'N':
				w.setNotes(1);
				break;
		case (byte)'S':
				w.setSource(1);
				break;
		}
		return 0;
	}
	public void strbuf_add_tabexpand(int tabwidth, Object line, int linelen) {
		byte tab;
		while ((tab = .memchr(line, (byte)'\t', linelen)) != ((Object)0)) {
			int width = ModernizedCProgram.pp_utf8_width(line, tab/*
					 * If it wasn't well-formed utf8, or it
					 * had characters with badly defined
					 * width (control characters etc), just
					 * give up on trying to align things.
					 */);
			if (width < 0) {
				break;
			} 
			sb.strbuf_add(line, tab - /* Output the data .. */line);
			sb.strbuf_addchars((byte)' ', tabwidth - (width % /* .. and the de-tabified tab */tabwidth));
			linelen -= tab + 1 - /* Skip over the printed part .. */line;
			line = tab + 1/*
				 * Print out everything after the last tab without
				 * worrying about width - there's nothing more to
				 * align.
				 */;
		}
		sb.strbuf_add(line, linelen/*
		 * pp_handle_indent() prints out the intendation, and
		 * the whole line (without the final newline), after
		 * de-tabifying.
		 */);
	}
	public void pp_commit_easy(cmit_fmt fmt, Object commit) {
		pretty_print_context pp = new pretty_print_context(0);
		pp.setFmt(cmit_fmt.fmt);
		ModernizedCProgram.pretty_print_commit(pp, commit, sb);
	}
	/* Copy the line onto the end of the strbuf while fixing whitespaces */
	public void ws_fix_copy(Object src, int len, int ws_rule, int error_count) {
		int i;
		int add_nl_to_tail = 0;
		int add_cr_to_tail = 0;
		int fixed = 0;
		int last_tab_in_indent = -1;
		int last_space_in_indent = -1;
		int need_fix_leading_space = 0/*
			 * Strip trailing whitespace
			 */;
		if (ws_rule & 100) {
			if (0 < len && src[len - 1] == (byte)'\n') {
				add_nl_to_tail = 1;
				len--;
				if (0 < len && src[len - 1] == (byte)'\r') {
					add_cr_to_tail = !!(ws_rule & 1000);
					len--;
				} 
			} 
			if (0 < len && ((ModernizedCProgram.sane_ctype[(byte)(src[len - 1])] & (true)) != 0)) {
				while (0 < len && ((ModernizedCProgram.sane_ctype[(byte)(src[len - 1])] & (true)) != 0)) {
					len--;
				}
				fixed = 1;
			} 
		} 
		for (i = 0; i < len; /*
			 * Check leading whitespaces (indent)
			 */i++) {
			byte ch = src[i];
			if (ch == (byte)'\t') {
				last_tab_in_indent = i;
				if ((ws_rule & 200) && 0 <= last_space_in_indent) {
					need_fix_leading_space = 1;
				} 
			}  else if (ch == (byte)' ') {
				last_space_in_indent = i;
				if ((ws_rule & 400) && ((ws_rule) & 77) <= i - last_tab_in_indent) {
					need_fix_leading_space = 1;
				} 
			} else {
					break;
			} 
		}
		Object generatedLen = this.getLen();
		if (need_fix_leading_space) {
			int consecutive_spaces = /* Process indent ourselves */0;
			int last = last_tab_in_indent + 1;
			if (ws_rule & 400) {
				if (last_tab_in_indent < /* have "last" point at one past the indent */last_space_in_indent) {
					last = last_space_in_indent + 1;
				} else {
						last = last_tab_in_indent + 1/*
								 * between src[0..last-1], strip the funny spaces,
								 * updating them to tab as needed.
								 */;
				} 
			} 
			for (i = 0; i < last; i++) {
				byte ch = src[i];
				if (ch != (byte)' ') {
					consecutive_spaces = 0;
					dst.strbuf_addch(ch);
				} else {
						consecutive_spaces++;
						if (consecutive_spaces == ((ws_rule) & 77)) {
							dst.strbuf_addch((byte)'\t');
							consecutive_spaces = 0;
						} 
				} 
			}
			while (0 < consecutive_spaces--) {
				dst.strbuf_addch((byte)' ');
			}
			len -= last;
			src += last;
			fixed = 1;
		}  else if ((ws_rule & 4000) && last_tab_in_indent >= 0) {
			int start = generatedLen;
			int last = last_tab_in_indent + 1;
			for (i = 0; i < last; i++) {
				if (src[i] == (byte)'\t') {
					do {
						dst.strbuf_addch((byte)' ');
					} while ((generatedLen - start) % ((ws_rule) & 77));
				} else {
						dst.strbuf_addch(src[i]);
				} 
			}
			len -= last;
			src += last;
			fixed = 1;
		} 
		dst.strbuf_add(src, len);
		if (add_cr_to_tail) {
			dst.strbuf_addch((byte)'\r');
		} 
		if (add_nl_to_tail) {
			dst.strbuf_addch((byte)'\n');
		} 
		if (fixed && error_count) {
			(error_count)++;
		} 
	}
	/*
		 * len is number of bytes to be copied from src, starting
		 * at src.  Typically src[len-1] is '\n', unless this is
		 * the incomplete last line.
		 */
	public void fill_loose_path(Object oid) {
		int i;
		for (i = 0; i < ModernizedCProgram.the_repository.getHash_algo().getRawsz(); i++) {
			byte[] hex = "0123456789abcdef";
			int val = oid.getHash()[i];
			ModernizedCProgram.buf.strbuf_addch(hex[val >> 4]);
			ModernizedCProgram.buf.strbuf_addch(hex[val & -1024]);
			if (!i) {
				ModernizedCProgram.buf.strbuf_addch((byte)'/');
			} 
		}
	}
	public Object parse_alt_odb_entry(Object string, int sep) {
		byte end;
		out.strbuf_setlen(0);
		if (string == (byte)'#') {
			end = ModernizedCProgram.gitstrchrnul(string, /* comment; consume up to next separator */sep);
		}  else if (string == (byte)'"' && !out.unquote_c_style(string, end/*
				 * quoted path; unquote_c_style has copied the
				 * data for us and set "end". Broken quoting (e.g.,
				 * an entry that doesn't end with a quote) falls
				 * back to the unquoted case below.
				 */)) {
		} else {
				end = ModernizedCProgram.gitstrchrnul(string, /* normal, unquoted path */sep);
				out.strbuf_add(string, end - string);
		} 
		if (end) {
			end++;
		} 
		return end;
	}
	public Byte compute_alternate_path(Object path) {
		byte ref_git = ((Object)0);
		byte repo;
		byte ref_git_s;
		int seen_error = 0;
		ref_git_s = ModernizedCProgram.real_path_if_valid(path);
		if (!ref_git_s) {
			seen_error = 1;
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("path '%s' does not exist"), path);
			;
		} else {
				ref_git = ModernizedCProgram.xstrdup(ref_git_s);
		} 
		repo = ModernizedCProgram.read_gitfile_gently((ref_git), ((Object)0));
		if (!repo) {
			repo = ModernizedCProgram.read_gitfile_gently((ModernizedCProgram.mkpath("%s/.git", ref_git)), ((Object)0));
		} 
		if (repo) {
			ModernizedCProgram.free(ref_git);
			ref_git = ModernizedCProgram.xstrdup(repo);
		} 
		if (!repo && ModernizedCProgram.is_directory(ModernizedCProgram.mkpath("%s/.git/objects", ref_git))) {
			byte ref_git_git = ModernizedCProgram.mkpathdup("%s/.git", ref_git);
			ModernizedCProgram.free(ref_git);
			ref_git = ref_git_git;
		}  else if (!ModernizedCProgram.is_directory(ModernizedCProgram.mkpath("%s/objects", ref_git))) {
			strbuf sb = new strbuf(, , );
			seen_error = 1;
			if (sb.get_common_dir(ref_git)) {
				ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("reference repository '%s' as a linked checkout is not supported yet."), path);
				;
			} 
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("reference repository '%s' is not a local repository."), path);
			;
		} 
		if (!.access(ModernizedCProgram.mkpath("%s/shallow", ref_git), 0)) {
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("reference repository '%s' is shallow"), path);
			seen_error = 1;
			;
		} 
		if (!.access(ModernizedCProgram.mkpath("%s/info/grafts", ref_git), 0)) {
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("reference repository '%s' is grafted"), path);
			seen_error = 1;
			;
		} 
		return ref_git;
	}
	public int create_tmpfile(Object filename) {
		int fd;
		int dirlen = ModernizedCProgram.directory_size(filename);
		tmp.strbuf_setlen(0);
		tmp.strbuf_add(filename, dirlen);
		tmp.strbuf_addstr("tmp_obj_XXXXXX");
		byte generatedBuf = this.getBuf();
		fd = ModernizedCProgram.git_mkstemp_mode(generatedBuf, 444);
		if (fd < 0 && dirlen && (._errno()) == 2/*
				 * Make sure the directory exists; note that the contents
				 * of the buffer are undefined after mkstemp returns an
				 * error, so we have to rewrite the whole buffer from
				 * scratch.
				 */) {
			tmp.strbuf_setlen(0);
			tmp.strbuf_add(filename, dirlen - 1);
			if (.mkdir(generatedBuf, 777) && (._errno()) != 17) {
				return -1;
			} 
			if (ModernizedCProgram.adjust_shared_perm(generatedBuf)) {
				return -1;
			} 
			tmp.strbuf_addstr(/* Try again */"/tmp_obj_XXXXXX");
			fd = ModernizedCProgram.git_mkstemp_mode(generatedBuf, 444);
		} 
		return fd;
	}
	public int for_each_file_in_obj_subdir(int subdir_nr, Object obj_cb, Object cruft_cb, Object subdir_cb, Object data) {
		size_t origlen = new size_t();
		size_t baselen = new size_t();
		DIR dir = new DIR();
		dirent de = new dirent();
		int r = 0;
		object_id oid = new object_id();
		if (subdir_nr > -1024) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sha1-file.c", 2204, "invalid loose object subdirectory: %x", subdir_nr);
		} 
		origlen = ModernizedCProgram.path.getLen();
		ModernizedCProgram.path.strbuf_complete((byte)'/');
		ModernizedCProgram.path.strbuf_addf("%02x", subdir_nr);
		dir = ModernizedCProgram.opendir(ModernizedCProgram.path.getBuf());
		if (!dir) {
			if ((._errno()) != 2) {
				r = ();
			} 
			ModernizedCProgram.path.strbuf_setlen(origlen);
			return r;
		} 
		Object generatedHash = oid.getHash();
		generatedHash[0] = subdir_nr;
		ModernizedCProgram.path.strbuf_addch((byte)'/');
		baselen = ModernizedCProgram.path.getLen();
		dirent dirent = new dirent();
		Object generatedD_name = de.getD_name();
		while ((de = dirent.readdir(dir))) {
			size_t namelen = new size_t();
			if (ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				continue;
			} 
			namelen = .strlen(generatedD_name);
			ModernizedCProgram.path.strbuf_setlen(baselen);
			ModernizedCProgram.path.strbuf_add(generatedD_name, namelen);
			if (namelen == ModernizedCProgram.the_repository.getHash_algo().getHexsz() - 2 && !ModernizedCProgram.hex_to_bytes(generatedHash + 1, generatedD_name, ModernizedCProgram.the_repository.getHash_algo().getRawsz() - 1)) {
				if (obj_cb) {
					r = .obj_cb(oid, ModernizedCProgram.path.getBuf(), data);
					if (r) {
						break;
					} 
				} 
				continue;
			} 
			if (cruft_cb) {
				r = .cruft_cb(generatedD_name, ModernizedCProgram.path.getBuf(), data);
				if (r) {
					break;
				} 
			} 
		}
		dir.closedir();
		ModernizedCProgram.path.strbuf_setlen(baselen - 1);
		if (!r && subdir_cb) {
			r = .subdir_cb(subdir_nr, ModernizedCProgram.path.getBuf(), data);
		} 
		ModernizedCProgram.path.strbuf_setlen(origlen);
		return r;
	}
	public int for_each_loose_file_in_objdir_buf(Object obj_cb, Object cruft_cb, Object subdir_cb, Object data) {
		int r = 0;
		int i;
		for (i = 0; i < 256; i++) {
			r = ModernizedCProgram.path.for_each_file_in_obj_subdir(i, obj_cb, cruft_cb, subdir_cb, data);
			if (r) {
				break;
			} 
		}
		return r;
	}
	public int read_one_entry(Object oid, Object pathname, int mode, int stage, Object context) {
		index_state istate = context;
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		return istate.read_one_entry_opt(oid, generatedBuf, generatedLen, pathname, mode, stage, 1 | 4/*
		 * This is used when the caller knows there is no existing entries at
		 * the stage that will conflict with the entry being added.
		 */);
	}
	public int read_one_entry_quick(Object oid, Object pathname, int mode, int stage, Object context) {
		index_state istate = context;
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		return istate.read_one_entry_opt(oid, generatedBuf, generatedLen, pathname, mode, stage, 8);
	}
	public void add_path(Object base_len, Object path) {
		ModernizedCProgram.buf.strbuf_setlen(base_len);
		if (ModernizedCProgram.buf.getLen() && ModernizedCProgram.buf.getBuf()[ModernizedCProgram.buf.getLen() - 1] != (byte)'/') {
			ModernizedCProgram.buf.strbuf_addch((byte)'/');
		} 
		ModernizedCProgram.buf.strbuf_addstr(path/*
		 * Determine whether we can simply reuse the file in the worktree.
		 */);
		if (path && path) {
			out.strbuf_add_absolute_path(path);
			out.strbuf_addch((byte)':');
		} 
	}
	public Object get_repo_path_1(int is_bundle) {
		byte[] suffix = new byte[]{"/.git", "", ".git/.git", ".git"};
		byte[] bundle_suffix = new byte[]{".bundle", ""};
		size_t baselen = ModernizedCProgram.path.getLen();
		stat st = new stat();
		int i;
		Object generatedSt_mode = st.getSt_mode();
		Object generatedSt_size = st.getSt_size();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			ModernizedCProgram.path.strbuf_setlen(baselen);
			ModernizedCProgram.path.strbuf_addstr(suffix[i]);
			if (.stat(ModernizedCProgram.path.getBuf(), st)) {
				continue;
			} 
			if ((((generatedSt_mode) & -1024) == -1024) && ModernizedCProgram.is_git_directory(ModernizedCProgram.path.getBuf())) {
				is_bundle = 0;
				return ModernizedCProgram.path.getBuf();
			}  else if ((((generatedSt_mode) & -1024) == -1024) && generatedSt_size > 8) {
				byte[] signature = new byte[/* Is it a "gitfile"? */8];
				byte dst;
				int len;
				int fd = .open(ModernizedCProgram.path.getBuf(), 0);
				if (fd < 0) {
					continue;
				} 
				ModernizedCProgram.len = ModernizedCProgram.read_in_full(fd, ModernizedCProgram.signature, 8);
				.close(fd);
				if (ModernizedCProgram.len != 8 || .strncmp(ModernizedCProgram.signature, "gitdir: ", 8)) {
					continue;
				} 
				dst = ModernizedCProgram.read_gitfile_gently((ModernizedCProgram.path.getBuf()), ((Object)0));
				if (dst) {
					is_bundle = 0;
					return dst;
				} 
			} 
		}
		for (i = 0; i < ( /  + ( - 1)); i++) {
			ModernizedCProgram.path.strbuf_setlen(baselen);
			ModernizedCProgram.path.strbuf_addstr(bundle_suffix[i]);
			if (!.stat(ModernizedCProgram.path.getBuf(), st) && (((generatedSt_mode) & -1024) == -1024)) {
				is_bundle = 1;
				return ModernizedCProgram.path.getBuf();
			} 
		}
		return ((Object)0);
	}
	public void copy_alternates(Object src_repo) {
		byte generatedBuf = this.getBuf();
		FILE in = ModernizedCProgram.xfopen(generatedBuf, "r");
		strbuf line = new strbuf(, , );
		Object generatedLen = line.getLen();
		while (ModernizedCProgram.strbuf_getline(line, in) != (true)) {
			byte abs_path;
			if (!generatedLen || generatedBuf[0] == (byte)'#') {
				continue;
			} 
			if (ModernizedCProgram.is_absolute_path(generatedBuf)) {
				ModernizedCProgram.add_to_alternates_file(generatedBuf);
				continue;
			} 
			abs_path = ModernizedCProgram.mkpathdup("%s/objects/%s", src_repo, generatedBuf);
			if (!ModernizedCProgram.normalize_path_copy(abs_path, abs_path)) {
				ModernizedCProgram.add_to_alternates_file(abs_path);
			} else {
					ModernizedCProgram.warning("skipping invalid relative alternate: %s/%s", src_repo, generatedBuf);
			} 
			ModernizedCProgram.free(abs_path);
		}
		line.strbuf_release();
		.fclose(in);
	}
	/*
		 * Read from the source objects/info/alternates file
		 * and copy the entries to corresponding file in the
		 * destination repository with add_to_alternates_file().
		 * Both src and dst have "$path/objects/info/alternates".
		 *
		 * Instead of copying bit-for-bit from the original,
		 * we need to append to existing one so that the already
		 * created entry via "clone -s" is not lost, and also
		 * to turn entries with paths relative to the original
		 * absolute, so that they can be used in the new repository.
		 */
	public void copy_or_link_directory(strbuf dest, Object src_repo) {
		int src_len;
		int dest_len;
		dir_iterator iter = new dir_iterator();
		int iter_status;
		int flags;
		byte generatedBuf = dest.getBuf();
		ModernizedCProgram.mkdir_if_missing(generatedBuf, 777);
		flags = (1 << 0) | (1 << 1);
		dir_iterator dir_iterator = new dir_iterator();
		iter = dir_iterator.dir_iterator_begin(generatedBuf, flags);
		if (!iter) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to start iterator over '%s'"), generatedBuf);
		} 
		src.strbuf_addch((byte)'/');
		Object generatedLen = this.getLen();
		src_len = generatedLen;
		dest.strbuf_addch((byte)'/');
		dest_len = generatedLen;
		Object generatedRelative_path = iter.getRelative_path();
		stat generatedSt = iter.getSt();
		Object generatedSt_mode = generatedSt.getSt_mode();
		while ((iter_status = iter.dir_iterator_advance()) == 0) {
			src.strbuf_setlen(src_len);
			src.strbuf_addstr(generatedRelative_path);
			dest.strbuf_setlen(dest_len);
			dest.strbuf_addstr(generatedRelative_path);
			if ((((generatedSt_mode) & -1024) == -1024)) {
				ModernizedCProgram.mkdir_if_missing(generatedBuf, 777);
				continue;
			} 
			if (!ModernizedCProgram.fspathcmp(generatedRelative_path, /* Files that cannot be copied bit-for-bit... */"info/alternates")) {
				src.copy_alternates(src_repo);
				continue;
			} 
			if (.unlink(generatedBuf) && (._errno()) != 2) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("failed to unlink '%s'"), generatedBuf);
			} 
			if (!ModernizedCProgram.option_no_hardlinks) {
				if (!ModernizedCProgram.link(ModernizedCProgram.real_path(generatedBuf), generatedBuf)) {
					continue;
				} 
				if (ModernizedCProgram.option_local > 0) {
					ModernizedCProgram.die_errno(ModernizedCProgram._("failed to create link '%s'"), generatedBuf);
				} 
				ModernizedCProgram.option_no_hardlinks = 1;
			} 
			if (ModernizedCProgram.copy_file_with_time(generatedBuf, generatedBuf, 666)) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("failed to copy file to '%s'"), generatedBuf);
			} 
		}
		if (iter_status != -1) {
			src.strbuf_setlen(src_len);
			ModernizedCProgram.die(ModernizedCProgram._("failed to iterate over '%s'"), generatedBuf);
		} 
	}
	public void write_refspec_config(Object src_ref_prefix, Object our_head_points_at, Object remote_head_points_at) {
		strbuf key = new strbuf(, , );
		strbuf value = new strbuf(, , );
		byte generatedBuf = this.getBuf();
		Object generatedLen = value.getLen();
		if (ModernizedCProgram.option_mirror || !ModernizedCProgram.option_bare) {
			if (ModernizedCProgram.option_single_branch && !ModernizedCProgram.option_mirror) {
				if (ModernizedCProgram.option_branch) {
					if (ModernizedCProgram.starts_with(our_head_points_at.getName(), "refs/tags/")) {
						value.strbuf_addf("+%s:%s", our_head_points_at.getName(), our_head_points_at.getName());
					} else {
							value.strbuf_addf("+%s:%s%s", our_head_points_at.getName(), generatedBuf, ModernizedCProgram.option_branch);
					} 
				}  else if (remote_head_points_at) {
					byte head = remote_head_points_at.getName();
					if (!ModernizedCProgram.skip_prefix(head, "refs/heads/", head)) {
						ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\clone.c", 856, "remote HEAD points at non-head?");
					} 
					value.strbuf_addf("+%s:%s%s", remote_head_points_at.getName(), generatedBuf, head/*
								 * otherwise, the next "git fetch" will
								 * simply fetch from HEAD without updating
								 * any remote-tracking branch, which is what
								 * we want.
								 */);
				} 
			} else {
					value.strbuf_addf("+%s*:%s*", src_ref_prefix, generatedBuf);
			} 
			if (generatedLen) {
				key.strbuf_addf("remote.%s.fetch", ModernizedCProgram.option_origin);
				.git_config_set_multivar(generatedBuf, generatedBuf, "^$", 0);
				key.strbuf_setlen(0);
				if (ModernizedCProgram.option_mirror) {
					key.strbuf_addf("remote.%s.mirror", ModernizedCProgram.option_origin);
					.git_config_set(generatedBuf, "true");
					key.strbuf_setlen(0);
				} 
			} 
		} 
		key.strbuf_release();
		value.strbuf_release();
	}
	public void construct_fullname(Object repo, Object ce) {
		out.strbuf_setlen(0);
		if (repo.getSubmodule_prefix()) {
			out.strbuf_addstr(repo.getSubmodule_prefix());
		} 
		out.strbuf_addstr(ce.getName());
	}
	public Object expand_path(Object placeholder, Object ctx) {
		expand_path_context context = ctx;
		hostinfo generatedHostinfo = context.getHostinfo();
		hostinfo hi = generatedHostinfo;
		strbuf generatedHostname = hi.getHostname();
		strbuf generatedTcp_port = hi.getTcp_port();
		Object generatedDirectory = context.getDirectory();
		switch (placeholder[0]) {
		case (byte)'H':
				sb.strbuf_addbuf(generatedHostname);
				return 1;
		case (byte)'C':
				if (placeholder[1] == (byte)'H') {
					sb.strbuf_addstr(hi.get_canon_hostname());
					return 2;
				} 
				break;
		case (byte)'P':
				sb.strbuf_addbuf(generatedTcp_port);
				return 1;
		case (byte)'I':
				if (placeholder[1] == (byte)'P') {
					sb.strbuf_addstr(hi.get_ip_address());
					return 2;
				} 
				break;
		case (byte)'D':
				sb.strbuf_addstr(generatedDirectory);
				return 1;
		}
		return 0;
	}
	public void sanitize_client(Object in) {
		Object generatedLen = this.getLen();
		byte generatedBuf = this.getBuf();
		for (; in; in++) {
			if (in == (byte)'/') {
				continue;
			} 
			if (in == (byte)'.' && (!generatedLen || generatedBuf[generatedLen - 1] == (byte)'.')) {
				continue;
			} 
			out.strbuf_addch(in);
		}
		while (generatedLen && generatedBuf[generatedLen - 1] == (byte)'.') {
			out.strbuf_setlen(generatedLen - 1/*
			 * Like sanitize_client, but we also perform any canonicalization
			 * to make life easier on the admin.
			 */);
		}
	}
	public void canonicalize_client(Object in) {
		out.sanitize_client(in);
		out/*
		 * Read the host as supplied by the client connection.
		 *
		 * Returns a pointer to the character after the NUL byte terminating the host
		 * arguemnt, or 'extra_args' if there is no host arguemnt.
		 */.strbuf_tolower();
	}
	public void show_config_origin() {
		byte term = ModernizedCProgram.end_null ? (byte)'\0' : (byte)'\t';
		ModernizedCProgram.buf.strbuf_addstr(.current_config_origin_type());
		ModernizedCProgram.buf.strbuf_addch((byte)':');
		if (ModernizedCProgram.end_null) {
			ModernizedCProgram.buf.strbuf_addstr(.current_config_name());
		} else {
				ModernizedCProgram.quote_c_style(.current_config_name(), ModernizedCProgram.buf, ((Object)0), 0);
		} 
		ModernizedCProgram.buf.strbuf_addch(term);
	}
	public int format_config(Object key_, Object value_) {
		if (ModernizedCProgram.show_origin) {
			ModernizedCProgram.buf.show_config_origin();
		} 
		if (ModernizedCProgram.show_keys) {
			ModernizedCProgram.buf.strbuf_addstr(key_);
		} 
		ModernizedCProgram.buf.strbuf_addch(ModernizedCProgram.term);
		return 0;
	}
	public void strbuf_write_column(Object c, byte col_char) {
		if (c.getColor() < ModernizedCProgram.column_colors_max) {
			sb.strbuf_addstr(ModernizedCProgram.column_get_color_code(c.getColor()));
		} 
		sb.strbuf_addch(col_char);
		if (c.getColor() < ModernizedCProgram.column_colors_max) {
			sb.strbuf_addstr(ModernizedCProgram.column_get_color_code(ModernizedCProgram.column_colors_max));
		} 
	}
	public strbuf diff_output_prefix_callback(diff_options opt, Object data) {
		git_graph graph = data;
		strbuf msgbuf = new strbuf(, , );
		((opt) ? (Object)0 : ._assert("opt", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\graph.c", 236));
		msgbuf.strbuf_setlen(0);
		Object generatedLine_prefix = opt.getLine_prefix();
		Object generatedLine_prefix_length = opt.getLine_prefix_length();
		if (generatedLine_prefix) {
			msgbuf.strbuf_add(generatedLine_prefix, generatedLine_prefix_length);
		} 
		if (graph) {
			ModernizedCProgram.graph_padding_line(graph, msgbuf);
		} 
		return msgbuf;
	}
	public void append_quoted_string(Object in) {
		byte c;
		out.strbuf_addch((byte)'"');
		while ((c = in++) != (byte)'\0') {
			if (c == (byte)'"') {
				out.strbuf_addstr("\\\"");
			}  else if (c == (byte)'\\') {
				out.strbuf_addstr("\\\\");
			}  else if (c == (byte)'\n') {
				out.strbuf_addstr("\\n");
			}  else if (c == (byte)'\r') {
				out.strbuf_addstr("\\r");
			}  else if (c == (byte)'\t') {
				out.strbuf_addstr("\\t");
			}  else if (c == (byte)'\f') {
				out.strbuf_addstr("\\f");
			}  else if (c == (byte)'\b') {
				out.strbuf_addstr("\\b");
			}  else if (c < -1024) {
				out.strbuf_addf("\\u%04x", c);
			} else {
					out.strbuf_addch(c);
			} 
		}
		out.strbuf_addch((byte)'"');
	}
	public void increase_indent(Object jw, int indent) {
		int k;
		sb.strbuf_setlen(0);
		for (k = 0; k < jw.getJson().getLen(); k++) {
			byte ch = jw.getJson().getBuf()[k];
			sb.strbuf_addch(ch);
			if (ch == (byte)'\n') {
				sb.strbuf_addchars((byte)' ', indent);
			} 
		}
	}
	public void kill_indent(Object jw) {
		int k;
		int eat_it = 0;
		sb.strbuf_setlen(0);
		for (k = 0; k < jw.getJson().getLen(); k++) {
			byte ch = jw.getJson().getBuf()[k];
			if (eat_it && ch == (byte)' ') {
				continue;
			} 
			if (ch == (byte)'\n') {
				eat_it = 1;
				continue;
			} 
			eat_it = 0;
			sb.strbuf_addch(ch);
		}
	}
	public void get_html_page_path(Object page) {
		stat st = new stat();
		byte to_free = ((Object)0);
		if (!ModernizedCProgram.html_path) {
			ModernizedCProgram.html_path = to_free = ModernizedCProgram.system_path(GIT_HTML_PATH);
		} 
		Object generatedSt_mode = st.getSt_mode();
		if (!.strstr(ModernizedCProgram.html_path, /* Check that we have a git documentation directory. */"://")) {
			if (.stat(ModernizedCProgram.mkpath("%s/git.html", ModernizedCProgram.html_path), st) || !(((generatedSt_mode) & -1024) == -1024)) {
				ModernizedCProgram.die("'%s': not a documentation directory.", ModernizedCProgram.html_path);
			} 
		} 
		page_path.strbuf_init(0);
		page_path.strbuf_addf("%s/%s.html", ModernizedCProgram.html_path, page);
		ModernizedCProgram.free(to_free);
	}
	public Object derive_filename(Object pack_name, Object suffix) {
		size_t len = new size_t();
		if (!ModernizedCProgram.strip_suffix(pack_name, ".pack", len)) {
			ModernizedCProgram.die(ModernizedCProgram._("packfile name '%s' does not end with '.pack'"), pack_name);
		} 
		ModernizedCProgram.buf.strbuf_add(pack_name, len);
		ModernizedCProgram.buf.strbuf_addch((byte)'.');
		ModernizedCProgram.buf.strbuf_addstr(suffix);
		return ModernizedCProgram.buf.getBuf();
	}
	public void strbuf_make_traverse_path(Object info, Object name, Object namelen) {
		size_t len = ModernizedCProgram.traverse_path_len(info, namelen);
		out.strbuf_grow(len);
		byte generatedBuf = this.getBuf();
		Object generatedLen = this.getLen();
		Object generatedAlloc = this.getAlloc();
		ModernizedCProgram.make_traverse_path(generatedBuf + generatedLen, generatedAlloc - generatedLen, info, name, namelen);
		out.strbuf_setlen(generatedLen + len);
	}
	public int task_finished(int result, Object pp_cb, Object pp_task_cb) {
		ModernizedCProgram.err.strbuf_addstr("asking for a quick stop\n");
		return 1;
	}
	public int test_finished(int result, Object cb, Object task_cb) {
		testsuite suite = cb;
		byte name = (byte)task_cb;
		string_list generatedFailed = suite.getFailed();
		if (result) {
			generatedFailed.string_list_append(name);
		} 
		ModernizedCProgram.err.strbuf_addf("%s: '%s'\n", result ? "FAIL" : "SUCCESS", name);
		return 0;
	}
	public int test_failed(Object cb, Object task_cb) {
		testsuite suite = cb;
		byte name = (byte)task_cb;
		string_list generatedFailed = suite.getFailed();
		generatedFailed.string_list_append(name);
		out.strbuf_addf("FAILED TO START: '%s'\n", name);
		return 0;
	}
	public void perf_fmt_prepare(Object event_name, Object ctx, Object file, int line, Object repo, Object p_us_elapsed_absolute, Object p_us_elapsed_relative, Object category) {
		int len;
		ModernizedCProgram.buf.strbuf_setlen(0);
		Object generatedTr2_tbuf = tb_now.getTr2_tbuf();
		Object generatedLen = buf_fl.getLen();
		byte generatedBuf = buf_fl.getBuf();
		if (!ModernizedCProgram.tr2env_perf_be_brief) {
			tr2_tbuf tb_now = new tr2_tbuf();
			size_t fl_end_col = new size_t();
			tb_now.tr2_tbuf_local_time();
			ModernizedCProgram.buf.strbuf_addstr(generatedTr2_tbuf);
			ModernizedCProgram.buf.strbuf_addch((byte)' ');
			fl_end_col = ModernizedCProgram.buf.getLen() + (true);
			if (file && file) {
				strbuf buf_fl = new strbuf(, , );
				buf_fl.strbuf_addf("%s:%d", file, line);
				if (generatedLen <= (true)) {
					ModernizedCProgram.buf.strbuf_addbuf(buf_fl);
				} else {
						size_t avail = (true) - 3;
						ModernizedCProgram.buf.strbuf_addstr("...");
						ModernizedCProgram.buf.strbuf_add(generatedBuf[generatedLen - avail], avail);
				} 
				buf_fl.strbuf_release();
			} 
			while (generatedLen < fl_end_col) {
				ModernizedCProgram.buf.strbuf_addch((byte)' ');
			}
			ModernizedCProgram.buf.strbuf_addstr(" | ");
		} 
		ModernizedCProgram.buf.strbuf_addf("d%d | ", ModernizedCProgram.tr2_sid_depth());
		ModernizedCProgram.buf.strbuf_addf("%-*s | %-*s | ", TR2_MAX_THREAD_NAME, generatedBuf, (true), event_name);
		len = generatedLen + (true);
		if (repo) {
			ModernizedCProgram.buf.strbuf_addf("r%d ", repo.getTrace2_repo_id());
		} 
		while (generatedLen < len) {
			ModernizedCProgram.buf.strbuf_addch((byte)' ');
		}
		ModernizedCProgram.buf.strbuf_addstr(" | ");
		if (p_us_elapsed_absolute) {
			ModernizedCProgram.buf.strbuf_addf("%9.6f | ", ((double)(p_us_elapsed_absolute)) / 1000000.0);
		} else {
				ModernizedCProgram.buf.strbuf_addf("%9s | ", " ");
		} 
		if (p_us_elapsed_relative) {
			ModernizedCProgram.buf.strbuf_addf("%9.6f | ", ((double)(p_us_elapsed_relative)) / 1000000.0);
		} else {
				ModernizedCProgram.buf.strbuf_addf("%9s | ", " ");
		} 
		ModernizedCProgram.buf.strbuf_addf("%-*.*s | ", (true), (true), (category ? category : ""));
		if (ctx.getNr_open_regions() > 0) {
			int len_indent = (((ctx).getNr_open_regions() - 1) * (true));
			while (len_indent > generatedLen) {
				ModernizedCProgram.buf.strbuf_addbuf(ModernizedCProgram.dots);
				len_indent -= generatedLen;
			}
			ModernizedCProgram.buf.strbuf_addf("%.*s", len_indent, generatedBuf);
		} 
	}
	public int parse_ls_response(Object response, Object mode) {
		byte tab;
		byte response_end;
		((response) ? (Object)0 : ._assert("response", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fast_export.c", 266));
		response_end = response + .strlen(response);
		if (response == /* Missing. */(byte)'m') {
			(._errno()) = 2;
			return -1;
		} 
		if (response_end - response < (int).strlen(/* Mode. */"100644") || response[.strlen("100644")] != (byte)' ') {
			ModernizedCProgram.die("invalid ls response: missing mode: %s", response);
		} 
		mode = 0;
		for (; response != (byte)' '; response++) {
			byte ch = response;
			if (ch < (byte)'0' || ch > (byte)'7') {
				ModernizedCProgram.die("invalid ls response: mode is not octal: %s", response);
			} 
			mode *= 8;
			mode += ch - (byte)'0';
		}
		if (response_end - response < (int).strlen(/* ' blob ' or ' tree ' */" blob ") || (response[1] != (byte)'b' && response[1] != (byte)'t')) {
			ModernizedCProgram.die("unexpected ls response: not a tree or blob: %s", response);
		} 
		response += .strlen(" blob ");
		tab = .memchr(response, (byte)'\t', response_end - /* Dataref. */response);
		if (!tab) {
			ModernizedCProgram.die("invalid ls response: missing tab: %s", response);
		} 
		dataref.strbuf_add(response, tab - response);
		return 0;
	}
	public int fast_export_ls_rev(Object rev, Object path, Object mode) {
		ModernizedCProgram.ls_from_rev(rev, path);
		return dataref.parse_ls_response(ModernizedCProgram.get_response_line(), mode);
	}
	public int fast_export_ls(Object path, Object mode) {
		ModernizedCProgram.ls_from_active_commit(path);
		return dataref.parse_ls_response(ModernizedCProgram.get_response_line(), mode);
	}
	public int strbuf_add_le(Object size, Object n) {
		while (size-- > 0) {
			sb.strbuf_addch(n & -1024);
			n >>=  8;
		}
		return -!!n;
	}
	public int read_branch_desc(Object branch_name) {
		byte v = ((Object)0);
		strbuf name = new strbuf(, , );
		name.strbuf_addf("branch.%s.description", branch_name);
		byte generatedBuf = name.getBuf();
		if (.git_config_get_string(generatedBuf, v)) {
			name.strbuf_release();
			return -1;
		} 
		ModernizedCProgram.buf.strbuf_addstr(v);
		ModernizedCProgram.free(v);
		name.strbuf_release();
		return 0/*
		 * Check if 'name' can be a valid name for a branch; die otherwise.
		 * Return 1 if the named branch already exists; return 0 otherwise.
		 * Fill ref with the full refname for the branch.
		 */;
	}
	public int validate_branchname(Object name) {
		if (ref.strbuf_check_branch_ref(name)) {
			ModernizedCProgram.die(ModernizedCProgram._("'%s' is not a valid branch name."), name);
		} 
		byte generatedBuf = this.getBuf();
		return ModernizedCProgram.ref_exists(generatedBuf);
	}
	public int validate_new_branchname(Object name, int force) {
		byte head;
		if (!ref.validate_branchname(name)) {
			return 0;
		} 
		byte generatedBuf = this.getBuf();
		if (!force) {
			ModernizedCProgram.die(ModernizedCProgram._("A branch named '%s' already exists."), generatedBuf + .strlen("refs/heads/"));
		} 
		head = ((Object)0).resolve_ref_unsafe("HEAD", 0, ((Object)0));
		if (!ModernizedCProgram.is_bare_repository() && head && !.strcmp(head, generatedBuf)) {
			ModernizedCProgram.die(ModernizedCProgram._("Cannot force update the current branch."));
		} 
		return 1;
	}
	public int check_refname_component(Object refname, int flags) {
		byte cp;
		byte last = (byte)'\0';
		size_t component_start = /* garbage - not a reasonable initial value */0;
		Object generatedLen = this.getLen();
		if (sanitized) {
			component_start = generatedLen;
		} 
		byte generatedBuf = this.getBuf();
		for (cp = refname; ; cp++) {
			int ch = cp & 255;
			byte disp = ModernizedCProgram.refname_disposition[ch];
			if (sanitized && disp != 1) {
				sanitized.strbuf_addch(ch);
			} 
			switch (disp) {
			case 5:
					if (!(flags & 2)) {
						if (/* refspec can't be a pattern */sanitized) {
							generatedBuf[generatedLen - 1] = (byte)'-';
						} else {
								return -1/*
											 * Unset the pattern flag so that we only accept
											 * a single asterisk for one side of refspec.
											 */;
						} 
					} 
					flags &=  ~2;
					break;
			case 3:
					if (last == /* Refname contains "@{". */(byte)'@') {
						if (sanitized) {
							generatedBuf[generatedLen - 1] = (byte)'-';
						} else {
								return -1;
						} 
					} 
					break;
			case 2:
					if (last == /* Refname contains "..". */(byte)'.') {
						if (sanitized) {
							sanitized.strbuf_setlen(generatedLen - /* collapse ".." to single "." */1);
						} else {
								return -1;
						} 
					} 
					break;
			case 4:
					if (/* forbidden char */sanitized) {
						generatedBuf[generatedLen - 1] = (byte)'-';
					} else {
							return -1;
					} 
					break;
			case 1:
					;
			}
			last = ch;
		}
		if (refname[0] == /* Component starts with '.'. */(byte)'.') {
			if (sanitized) {
				generatedBuf[component_start] = (byte)'-';
			} else {
					return -1;
			} 
		} 
		if (cp - refname >= 5 && !.memcmp(cp - 5, ".lock", 5)) {
			if (!sanitized) {
				return -1;
			} 
			while (sanitized.strbuf_strip_suffix(/* Refname ends with ".lock". */".lock"/* try again in case we have .lock.lock */)) {
			}
		} 
		return cp - refname;
	}
	public int check_or_sanitize_refname(Object refname, int flags) {
		int component_len;
		int component_count = 0;
		if (!.strcmp(refname, "@")) {
			if (/* Refname is a single character '@'. */sanitized) {
				sanitized.strbuf_addch((byte)'-');
			} else {
					return -1;
			} 
		} 
		Object generatedLen = this.getLen();
		while (1) {
			if (sanitized && generatedLen) {
				sanitized.strbuf_complete((byte)'/');
			} 
			component_len = sanitized.check_refname_component(refname, /* We are at the start of a path component. */flags);
			if (sanitized && component_len == 0) {
				;
			}  else if (component_len <= 0) {
				return -1;
			} 
			component_count++;
			if (refname[component_len] == (byte)'\0') {
				break;
			} 
			refname += component_len + /* Skip to next component. */1;
		}
		if (refname[component_len - 1] == (byte)'.') {
			if (/* Refname ends with '.'. */sanitized) {
				;
			} else {
					return -1;
			} 
		} 
		if (!(flags & 1) && component_count < 2) {
			return -/* Refname has only one component. */1;
		} 
		return 0;
	}
	public void sanitize_refname_component(Object refname) {
		if (out.check_or_sanitize_refname(refname, 1)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 215, "sanitizing refname '%s' check returned error", refname);
		} 
	}
	public int write_pseudoref(Object pseudoref, Object oid, Object old_oid) {
		byte filename;
		int fd;
		lock_file lock = new lock_file(((Object)0));
		strbuf buf = new strbuf(, , );
		int ret = -1;
		if (!oid) {
			return 0;
		} 
		buf.strbuf_addf("%s\n", ModernizedCProgram.oid_to_hex(oid));
		filename = ModernizedCProgram.git_path("%s", pseudoref);
		fd = lock.hold_lock_file_for_update_timeout(filename, 0, ModernizedCProgram.get_files_ref_lock_timeout_ms());
		if (fd < 0) {
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("could not open '%s' for writing: %s"), filename, .strerror((._errno())));
			;
		} 
		if (old_oid) {
			object_id actual_old_oid = new object_id();
			if (actual_old_oid.read_ref(pseudoref)) {
				if (!ModernizedCProgram.is_null_oid(old_oid)) {
					ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("could not read ref '%s'"), pseudoref);
					lock.rollback_lock_file();
					;
				} 
			}  else if (ModernizedCProgram.is_null_oid(old_oid)) {
				ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("ref '%s' already exists"), pseudoref);
				lock.rollback_lock_file();
				;
			}  else if (!ModernizedCProgram.oideq(actual_old_oid, old_oid)) {
				ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("unexpected object ID when writing '%s'"), pseudoref);
				lock.rollback_lock_file();
				;
			} 
		} 
		byte generatedBuf = buf.getBuf();
		Object generatedLen = buf.getLen();
		if (ModernizedCProgram.write_in_full(fd, generatedBuf, generatedLen) < 0) {
			ModernizedCProgram.err.strbuf_addf(ModernizedCProgram._("could not write to '%s'"), filename);
			lock.rollback_lock_file();
			;
		} 
		lock.commit_lock_file();
		ret = 0;
		return ret;
	}
	public void copy_reflog_msg(Object msg) {
		byte c;
		int wasspace = 1;
		sb.strbuf_addch((byte)'\t');
		while ((c = msg++)) {
			if (wasspace && ((ModernizedCProgram.sane_ctype[(byte)(c)] & (true)) != 0)) {
				continue;
			} 
			wasspace = ((ModernizedCProgram.sane_ctype[(byte)(c)] & (true)) != 0);
			if (wasspace) {
				c = (byte)' ';
			} 
			sb.strbuf_addch(c);
		}
		sb.strbuf_rtrim();
	}
	/* backend functions */
	public int refs_init_db() {
		ref_store ref_store = new ref_store();
		ref_store refs = ref_store.get_main_ref_store(ModernizedCProgram.the_repository);
		return .UNRECOGNIZEDFUNCTIONNAME(refs, ModernizedCProgram.err);
	}
	public int safe_create_reflog(Object refname, int force_create) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_create_reflog(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), refname, force_create, ModernizedCProgram.err);
	}
	/* append basename of F to D */
	public void append_basename(Object dir, Object file) {
		byte tail = .strrchr(file, (byte)'/');
		ModernizedCProgram.path.strbuf_addstr(dir);
		while (ModernizedCProgram.path.getLen() && ModernizedCProgram.path.getBuf()[ModernizedCProgram.path.getLen() - 1] == (byte)'/') {
			ModernizedCProgram.path.getLen()--;
		}
		ModernizedCProgram.path.strbuf_addch((byte)'/');
		ModernizedCProgram.path.strbuf_addstr(tail ? tail + 1 : file/*
		 * DWIM "diff D F" into "diff D/F F" and "diff F D" into "diff F D/F"
		 * Note that we append the basename of F to D/, so "diff a/b/file D"
		 * becomes "diff a/b/file D/file", not "diff a/b/file D/a/b/file".
		 */);
	}
	public void fixup_paths(Object path) {
		int isdir0;
		int isdir1;
		if (path[0] == ModernizedCProgram.file_from_standard_input || path[1] == ModernizedCProgram.file_from_standard_input) {
			return ;
		} 
		isdir0 = ModernizedCProgram.is_directory(path[0]);
		isdir1 = ModernizedCProgram.is_directory(path[1]);
		if (isdir0 == isdir1) {
			return ;
		} 
		byte generatedBuf = this.getBuf();
		if (isdir0) {
			replacement.append_basename(path[0], path[1]);
			path[0] = generatedBuf;
		} else {
				replacement.append_basename(path[1], path[0]);
				path[1] = generatedBuf;
		} 
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public byte getBuf() {
		return buf;
	}
	public void setBuf(byte newBuf) {
		buf = newBuf;
	}
}
