package application;

/* The OID of the empty tree. */
/* The OID of the empty blob. */
/* The block size of SHA-256. */
/* The length in byte and in hex digits of the largest possible hash value. */
/* The largest possible block size for any supported hash. */
public class object_id {
	private Object hash;
	
	public object_id(Object hash) {
		setHash(hash);
	}
	public object_id() {
	}
	
	/* extract hex from sharded "xx/x{38}" filename */
	public int get_oid_hex_from_objpath(Object path) {
		if (.strlen(path) != ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 1) {
			return -1;
		} 
		Object generatedHash = this.getHash();
		if (ModernizedCProgram.hex_to_bytes(generatedHash, path, 1)) {
			return -1;
		} 
		path += 2;
		/* skip '/' */path++;
		return ModernizedCProgram.hex_to_bytes(generatedHash + 1, path, ModernizedCProgram.the_repository.getHash_algo().getRawsz() - 1);
	}
	public void fetch_symref(Object path, byte symref) {
		byte url = ModernizedCProgram.xstrfmt("%s%s", ModernizedCProgram.repo.getUrl(), path);
		strbuf buffer = new strbuf(, , );
		byte name;
		if (ModernizedCProgram.http_get_strbuf(url, buffer, ((Object)0)) != 0) {
			ModernizedCProgram.die("Couldn't get %s for remote symref\n%s", url, ModernizedCProgram.curl_errorstr);
		} 
		ModernizedCProgram.free(url);
		do {
			ModernizedCProgram.free(symref);
			(symref) = ((Object)0);
		} while (0);
		oid.oidclr();
		Object generatedLen = buffer.getLen();
		if (generatedLen == 0) {
			return ;
		} 
		/* Cut off trailing newline. */buffer.strbuf_rtrim();
		byte generatedBuf = buffer.getBuf();
		if (ModernizedCProgram.skip_prefix(generatedBuf, "ref: ", /* If it's a symref, set the refname; otherwise try for a sha1 */name)) {
			symref = ModernizedCProgram.xmemdupz(name, generatedLen - (name - generatedBuf));
		} else {
				oid.get_oid_hex(generatedBuf);
		} 
		buffer.strbuf_release();
	}
	public int list_tree() {
		tree tree = new tree();
		if (ModernizedCProgram.nr_trees >= 8) {
			ModernizedCProgram.die("I cannot read more than %d trees", 8);
		} 
		tree tree = new tree();
		tree = tree.parse_tree_indirect(oid);
		if (!tree) {
			return -1;
		} 
		ModernizedCProgram.trees[ModernizedCProgram.nr_trees++] = tree;
		return 0;
	}
	public void check_for_new_submodule_commits() {
		if (!ModernizedCProgram.initialized_fetch_ref_tips) {
			ModernizedCProgram.for_each_ref(append_oid_to_array, ModernizedCProgram.ref_tips_before_fetch);
			ModernizedCProgram.initialized_fetch_ref_tips = 1;
		} 
		ModernizedCProgram.ref_tips_after_fetch.oid_array_append(oid);
	}
	public Byte create_temp_file() {
		byte[] path = new byte[50];
		Object buf;
		object_type type;
		long size;
		int fd;
		buf = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, size);
		if (!buf || object_type.type != object_type.OBJ_BLOB) {
			ModernizedCProgram.die("unable to read blob object %s", ModernizedCProgram.oid_to_hex(oid));
		} 
		ModernizedCProgram.xsnprintf(path, , ".merge_file_XXXXXX");
		fd = ModernizedCProgram.xmkstemp(path);
		if (ModernizedCProgram.write_in_full(fd, buf, size) < 0) {
			ModernizedCProgram.die_errno("unable to write temp-file");
		} 
		.close(fd);
		return path;
	}
	public int get_oid_hex(Object hex) {
		Object generatedHash = this.getHash();
		return ModernizedCProgram.get_sha1_hex(hex, generatedHash);
	}
	public int parse_oid_hex(Object hex, Object end) {
		int ret = oid.get_oid_hex(hex);
		if (!ret) {
			end = hex + ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		} 
		return ret;
	}
	public int reset_head(Object action, Object switch_to_branch, int flags, Object reflog_orig_head, Object reflog_head) {
		int detach_head = flags & (1 << 0);
		int reset_hard = flags & (1 << 1);
		int run_hook = flags & (1 << 2);
		int refs_only = flags & (1 << 3);
		int update_orig_head = flags & (1 << 4);
		object_id head_oid = new object_id();
		tree_desc[] desc = new tree_desc[]{new tree_desc(((Object)0)), new tree_desc(((Object)0))};
		lock_file lock = new lock_file(((Object)0));
		unpack_trees_options unpack_tree_opts = new unpack_trees_options();
		tree tree = new tree();
		byte reflog_action;
		strbuf msg = new strbuf(, , );
		size_t prefix_len = new size_t();
		object_id orig = ((Object)0);
		object_id oid_orig = new object_id();
		object_id old_orig = ((Object)0);
		object_id oid_old_orig = new object_id();
		int ret = 0;
		int nr = 0;
		if (switch_to_branch && !ModernizedCProgram.starts_with(switch_to_branch, "refs/")) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rebase.c", 820, "Not a fully qualified branch: '%s'", switch_to_branch);
		} 
		if (!refs_only && ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock), (true)) < 0) {
			ret = -1;
			;
		} 
		if ((!oid || !reset_hard) && ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head_oid)) {
			ret = ();
			;
		} 
		if (!oid) {
			oid = head_oid;
		} 
		if (refs_only) {
			;
		} 
		.memset(unpack_tree_opts, 0, );
		unpack_tree_opts.setup_unpack_trees_porcelain(action);
		unpack_tree_opts.setHead_idx(1);
		unpack_tree_opts.setSrc_index(ModernizedCProgram.the_repository.getIndex());
		unpack_tree_opts.setDst_index(ModernizedCProgram.the_repository.getIndex());
		unpack_tree_opts.setFn(reset_hard ? ModernizedCProgram.oneway_merge : ModernizedCProgram.twoway_merge);
		unpack_tree_opts.setUpdate(1);
		unpack_tree_opts.setMerge(1);
		if (!detach_head) {
			unpack_tree_opts.setReset(1);
		} 
		if (ModernizedCProgram.the_repository.repo_read_index_unmerged() < 0) {
			ret = ();
			;
		} 
		if (!reset_hard && !ModernizedCProgram.fill_tree_descriptor(ModernizedCProgram.the_repository, desc[nr++], head_oid)) {
			ret = ();
			;
		} 
		if (!ModernizedCProgram.fill_tree_descriptor(ModernizedCProgram.the_repository, desc[nr++], oid)) {
			ret = ();
			;
		} 
		if (ModernizedCProgram.unpack_trees(nr, desc, unpack_tree_opts)) {
			ret = -1;
			;
		} 
		tree tree = new tree();
		tree = tree.parse_tree_indirect(oid);
		ModernizedCProgram.prime_cache_tree(ModernizedCProgram.the_repository, ModernizedCProgram.the_repository.getIndex(), tree);
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_repository.getIndex(), lock, (1 << 0)) < 0) {
			ret = ();
			;
		} 
		msg.strbuf_addf("%s: ", reflog_action ? reflog_action : "rebase");
		Object generatedLen = msg.getLen();
		prefix_len = generatedLen;
		byte generatedBuf = msg.getBuf();
		if (update_orig_head) {
			if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "ORIG_HEAD", oid_old_orig)) {
				old_orig = oid_old_orig;
			} 
			if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", oid_orig)) {
				orig = oid_orig;
				if (!reflog_orig_head) {
					msg.strbuf_addstr("updating ORIG_HEAD");
					reflog_orig_head = generatedBuf;
				} 
				ModernizedCProgram.update_ref(reflog_orig_head, "ORIG_HEAD", orig, old_orig, 0, action_on_err.UPDATE_REFS_MSG_ON_ERR);
			}  else if (old_orig) {
				ModernizedCProgram.delete_ref(((Object)0), "ORIG_HEAD", old_orig, 0);
			} 
		} 
		if (!reflog_head) {
			msg.strbuf_setlen(prefix_len);
			msg.strbuf_addstr("updating HEAD");
			reflog_head = generatedBuf;
		} 
		if (!switch_to_branch) {
			ret = ModernizedCProgram.update_ref(reflog_head, "HEAD", oid, orig, detach_head ? (1 << 0) : 0, action_on_err.UPDATE_REFS_MSG_ON_ERR);
		} else {
				ret = ModernizedCProgram.update_ref(reflog_head, switch_to_branch, oid, ((Object)0), 0, action_on_err.UPDATE_REFS_MSG_ON_ERR);
				if (!ret) {
					ret = ModernizedCProgram.create_symref("HEAD", switch_to_branch, reflog_head);
				} 
		} 
		if (run_hook) {
			ModernizedCProgram.run_hook_le(((Object)0), "post-checkout", ModernizedCProgram.oid_to_hex(orig ? orig : ModernizedCProgram.null_oid), ModernizedCProgram.oid_to_hex(oid), "1", ((Object)0));
		} 
		lock.rollback_lock_file();
		while (nr) {
			ModernizedCProgram.free((Object)desc[--nr].getBuffer());
		}
		return ret;
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
			 * Reset is overall quite simple, however there is no current public
			 * API for resetting.
			 */));
		cp.setGit_cmd(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_push("reset");
		return cp.run_command();
	}
	public int save_state() {
		int len;
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf buffer = new strbuf(, , );
		byte[] argv = new byte[]{"stash", "create", ((Object)0)};
		int rc = -1;
		cp.setArgv(argv);
		cp.setOut(-1);
		cp.setGit_cmd(1);
		if (cp.start_command()) {
			ModernizedCProgram.die(ModernizedCProgram._("could not run stash."));
		} 
		int generatedOut = cp.getOut();
		len = buffer.strbuf_read(generatedOut, 1024);
		.close(generatedOut);
		if (cp.finish_command() || len < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("stash failed"));
		}  else if (!/* no changes */len) {
			;
		} 
		Object generatedLen = buffer.getLen();
		buffer.strbuf_setlen(generatedLen - 1);
		byte generatedBuf = buffer.getBuf();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, stash)) {
			ModernizedCProgram.die(ModernizedCProgram._("not a valid object: %s"), generatedBuf);
		} 
		rc = 0;
		return rc;
	}
	public int read_tree_trivial(object_id head, object_id one) {
		int i;
		int nr_trees = 0;
		tree[] trees = new tree();
		tree_desc[] t = new tree_desc();
		unpack_trees_options opts = new unpack_trees_options();
		.memset(opts, 0, );
		opts.setHead_idx(2);
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		opts.setUpdate(1);
		opts.setVerbose_update(1);
		opts.setTrivial_merges_only(1);
		opts.setMerge(1);
		tree tree = new tree();
		trees[nr_trees] = tree.parse_tree_indirect(common);
		if (!trees[nr_trees++]) {
			return -1;
		} 
		trees[nr_trees] = tree.parse_tree_indirect(head);
		if (!trees[nr_trees++]) {
			return -1;
		} 
		trees[nr_trees] = tree.parse_tree_indirect(one);
		if (!trees[nr_trees++]) {
			return -1;
		} 
		opts.setFn(ModernizedCProgram.threeway_merge);
		(ModernizedCProgram.the_index.getCache_tree()).cache_tree_free();
		for (i = 0; i < nr_trees; i++) {
			trees[i].parse_tree();
			t + i.init_tree_desc(trees[i].getBuffer(), trees[i].getSize());
		}
		if (ModernizedCProgram.unpack_trees(nr_trees, t, opts)) {
			return -1;
		} 
		return 0;
	}
	public void write_tree_trivial() {
		if (.write_cache_as_tree(oid, 0, ((Object)0))) {
			ModernizedCProgram.die(ModernizedCProgram._("git write-tree failed to write a tree"));
		} 
	}
	public int get_mail_commit_oid(Object mail) {
		strbuf sb = new strbuf(, , );
		FILE fp = ModernizedCProgram.xfopen(mail, "r");
		byte x;
		int ret = 0;
		byte generatedBuf = sb.getBuf();
		if (ModernizedCProgram.strbuf_getline_lf(sb, fp) || !ModernizedCProgram.skip_prefix(generatedBuf, "From ", x) || commit_id.get_oid_hex(x) < 0) {
			ret = -1;
		} 
		sb.strbuf_release();
		.fclose(fp);
		return ret/**
		 * Sets state->msg, state->author_name, state->author_email, state->author_date
		 * to the commit's respective info.
		 */;
	}
	public int parse_new_style_cacheinfo(Object arg, int mode, Object path) {
		long ul;
		byte endp;
		byte p;
		if (!arg) {
			return -1;
		} 
		(._errno()) = 0;
		ul = .strtoul(arg, endp, 8);
		if ((._errno()) || endp == arg || endp != (byte)',' || (int)ul != ul) {
			return -/* not a new-style cacheinfo */1;
		} 
		mode = ul;
		endp++;
		if (oid.parse_oid_hex(endp, p) || p != (byte)',') {
			return -1;
		} 
		path = p + 1;
		return 0;
	}
	public int stash_count_refs(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		int c = cb_data;
		(c)++;
		return 0;
	}
	public int grab_1st_switch(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		grab_1st_switch_cbdata cb = cb_data;
		byte target = ((Object)0);
		byte end;
		if (!ModernizedCProgram.skip_prefix(message, "checkout: moving from ", message)) {
			return 0;
		} 
		target = .strstr(message, " to ");
		if (!target) {
			return 0;
		} 
		target += .strlen(" to ");
		strbuf generatedBuf = cb.getBuf();
		generatedBuf.strbuf_setlen(0);
		object_id generatedNoid = cb.getNoid();
		generatedNoid.oidcpy(noid);
		end = ModernizedCProgram.gitstrchrnul(target, (byte)'\n');
		generatedBuf.strbuf_add(target, end - target);
		if (!.strcmp(generatedBuf, "HEAD")) {
			generatedBuf.strbuf_setlen(/* HEAD is relative. Resolve it to the right reflog entry. */0);
			generatedBuf.strbuf_add_unique_abbrev(noid, ModernizedCProgram.default_abbrev);
		} 
		return 1;
	}
	public int expire_reflog_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		expire_reflog_cb cb = cb_data;
		Object generatedPolicy_cb = cb.getPolicy_cb();
		expire_reflog_policy_cb policy_cb = generatedPolicy_cb;
		int generatedFlags = cb.getFlags();
		object_id generatedLast_kept_oid = cb.getLast_kept_oid();
		if (generatedFlags & expire_reflog_flags.EXPIRE_REFLOGS_REWRITE) {
			ooid = generatedLast_kept_oid;
		} 
		_iobuf generatedNewlog = cb.getNewlog();
		if (.UNRECOGNIZEDFUNCTIONNAME(ooid, noid, email, timestamp, tz, message, policy_cb)) {
			if (!generatedNewlog) {
				.printf("would prune %s", message);
			}  else if (generatedFlags & expire_reflog_flags.EXPIRE_REFLOGS_VERBOSE) {
				.printf("prune %s", message);
			} 
		} else {
				if (generatedNewlog) {
					.fprintf(generatedNewlog, "%s %s %s %llu %+05d\t%s", ModernizedCProgram.oid_to_hex(ooid), ModernizedCProgram.oid_to_hex(noid), email, timestamp, tz, message);
					generatedLast_kept_oid.oidcpy(noid);
				} 
				if (generatedFlags & expire_reflog_flags.EXPIRE_REFLOGS_VERBOSE) {
					.printf("keep %s", message);
				} 
		} 
		return 0;
	}
	public int path_to_oid(Object path) {
		byte[] hex_oid = new byte[(2 * 32)];
		int i = 0;
		while (path && i < ModernizedCProgram.the_repository.getHash_algo().getHexsz()) {
			if (path != (byte)'/') {
				hex_oid[i++] = path;
			} 
			path++;
		}
		if (path || i != ModernizedCProgram.the_repository.getHash_algo().getHexsz()) {
			return -1;
		} 
		return oid.get_oid_hex(hex_oid);
	}
	public object_id oidset_iter_next(oidset_iter iter) {
		Object generatedIter = iter.getIter();
		 generatedSet = iter.getSet();
		Object generatedN_buckets = (generatedSet).getN_buckets();
		Object generatedFlags = (generatedSet).getFlags();
		Object generatedKeys = (generatedSet).getKeys();
		for (; generatedIter != (generatedN_buckets); generatedIter++) {
			if ((!((generatedFlags[(generatedIter) >> 4] >> (((generatedIter) & -1024) << 1)) & 3))) {
				return (generatedKeys[generatedIter++]);
			} 
		}
		return ((Object)0);
	}
	public object_id oidset_iter_first(oidset set, oidset_iter iter) {
		ModernizedCProgram.oidset_iter_init(set, iter);
		object_id object_id = new object_id();
		return object_id.oidset_iter_next(iter/* OIDSET_H */);
	}
	public object_id get_cache_tree_oid(index_state istate) {
		cache_tree generatedCache_tree = istate.getCache_tree();
		cache_tree cache_tree = new cache_tree();
		if (!generatedCache_tree) {
			istate.setCache_tree(cache_tree.cache_tree());
		} 
		if (!generatedCache_tree.cache_tree_fully_valid()) {
			if (istate.cache_tree_update(0)) {
				();
				return ((Object)0);
			} 
		} 
		return generatedCache_tree;
	}
	public void record_in_rewritten(todo_command next_command) {
		FILE out = ModernizedCProgram.fopen_or_warn(ModernizedCProgram.rebase_path_rewritten_pending(), "a");
		if (!out) {
			return ;
		} 
		.fprintf(out, "%s\n", ModernizedCProgram.oid_to_hex(oid));
		.fclose(out);
		if (!ModernizedCProgram.is_fixup(todo_command.next_command)) {
			ModernizedCProgram.flush_rewritten_pending();
		} 
	}
	public int splice_tree(Object oid1, Object prefix, Object oid2) {
		byte subpath;
		int toplen;
		byte buf;
		long sz;
		tree_desc desc = new tree_desc();
		byte rewrite_here;
		object_id rewrite_with = new object_id();
		object_id subtree = new object_id();
		object_type type;
		int status;
		subpath = ModernizedCProgram.gitstrchrnul(prefix, (byte)'/');
		toplen = subpath - prefix;
		if (subpath) {
			subpath++;
		} 
		buf = ModernizedCProgram.the_repository.repo_read_object_file(oid1, object_type.type, sz);
		if (!buf) {
			ModernizedCProgram.die("cannot read tree %s", ModernizedCProgram.oid_to_hex(oid1));
		} 
		desc.init_tree_desc(buf, sz);
		rewrite_here = ((Object)0);
		int generatedSize = desc.getSize();
		name_entry generatedEntry = desc.getEntry();
		Object generatedPath = generatedEntry.getPath();
		while (generatedSize) {
			byte name;
			int mode;
			desc.tree_entry_extract(name, mode);
			if (.strlen(name) == toplen && !.memcmp(name, prefix, toplen)) {
				if (!(((mode) & -1024) == -1024)) {
					ModernizedCProgram.die("entry %s in tree %s is not a tree", name, ModernizedCProgram.oid_to_hex(oid1/*
								 * We cast here for two reasons:
								 *
								 *   - to flip the "char *" (for the path) to "unsigned
								 *     char *" (for the hash stored after it)
								 *
								 *   - to discard the "const"; this is OK because we
								 *     know it points into our non-const "buf"
								 */));
				} 
				rewrite_here = (byte)(generatedPath + .strlen(generatedPath) + 1);
				break;
			} 
			desc.update_tree_entry();
		}
		if (!rewrite_here) {
			ModernizedCProgram.die("entry %.*s not found in tree %s", toplen, prefix, ModernizedCProgram.oid_to_hex(oid1));
		} 
		Object generatedHash = tree_oid.getHash();
		if (subpath) {
			object_id tree_oid = new object_id();
			ModernizedCProgram.hashcpy(generatedHash, rewrite_here);
			status = subtree.splice_tree(tree_oid, subpath, oid2);
			if (status) {
				return status;
			} 
			rewrite_with = subtree;
		} else {
				rewrite_with = oid2;
		} 
		ModernizedCProgram.hashcpy(rewrite_here, generatedHash);
		status = result.write_object_file(buf, sz, ModernizedCProgram.tree_type);
		ModernizedCProgram.free(buf);
		return status/*
		 * We are trying to come up with a merge between one and two that
		 * results in a tree shape similar to one.  The tree two might
		 * correspond to a subtree of one, in which case it needs to be
		 * shifted down by prefixing otherwise empty directories.  On the
		 * other hand, it could cover tree one and we might need to pick a
		 * subtree of it.
		 */;
	}
	public void add_preferred_base() {
		pbase_tree it = new pbase_tree();
		Object data;
		long size;
		object_id tree_oid = new object_id();
		if (ModernizedCProgram.window <= ModernizedCProgram.num_preferred_base++) {
			return ;
		} 
		data = ModernizedCProgram.read_object_with_reference(ModernizedCProgram.the_repository, oid, ModernizedCProgram.tree_type, size, tree_oid);
		if (!data) {
			return ;
		} 
		pbase_tree_cache generatedPcache = it.getPcache();
		object_id generatedOid = generatedPcache.getOid();
		pbase_tree generatedNext = it.getNext();
		for (it = pbase_tree; it; it = generatedNext) {
			if (ModernizedCProgram.oideq(generatedOid, tree_oid)) {
				ModernizedCProgram.free(data);
				return ;
			} 
		}
		it = ModernizedCProgram.xcalloc(1, );
		it.setNext(pbase_tree);
		pbase_tree = it;
		generatedOid.oidcpy(tree_oid);
		generatedPcache.setTree_data(data);
		generatedPcache.setTree_size(size);
	}
	public int index_bulk_checkin(int fd, Object size, object_type type, Object path, int flags) {
		int status = ModernizedCProgram.deflate_to_pack(ModernizedCProgram.state, oid, fd, size, object_type.type, path, flags);
		if (!ModernizedCProgram.state.getPlugged()) {
			ModernizedCProgram.state.finish_bulk_checkin();
		} 
		return status;
	}
	public int reset_tree(int update, int reset) {
		int nr_trees = 1;
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc[] t = new tree_desc();
		tree tree = new tree();
		lock_file lock_file = new lock_file(((Object)0));
		ModernizedCProgram.the_repository.repo_read_index_preload((((Object)0)), 0);
		if (ModernizedCProgram.the_index.refresh_index((true), ((Object)0), ((Object)0), ((Object)0))) {
			return -1;
		} 
		ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock_file), (true));
		.memset(opts, 0, );
		tree tree = new tree();
		tree = tree.parse_tree_indirect(i_tree);
		if (tree.parse_tree()) {
			return -1;
		} 
		Object generatedBuffer = tree.getBuffer();
		Object generatedSize = tree.getSize();
		t.init_tree_desc(generatedBuffer, generatedSize);
		opts.setHead_idx(1);
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		opts.setMerge(1);
		opts.setReset(reset);
		opts.setUpdate(update);
		opts.setFn(ModernizedCProgram.oneway_merge);
		if (ModernizedCProgram.unpack_trees(nr_trees, t, opts)) {
			return -1;
		} 
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_index, lock_file, (1 << 0))) {
			return ();
		} 
		return 0;
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc tree_desc = new tree_desc();
		.memset(opts, 0, );
		opts.setHead_idx(-1);
		opts.setUpdate(worktree);
		opts.setSkip_unmerged(!worktree);
		opts.setReset(1);
		opts.setMerge(1);
		opts.setFn(ModernizedCProgram.oneway_merge);
		opts.setVerbose_update(o.getShow_progress());
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		tree.parse_tree();
		Object generatedBuffer = tree.getBuffer();
		Object generatedSize = tree.getSize();
		tree_desc.init_tree_desc(generatedBuffer, generatedSize);
		switch (ModernizedCProgram.unpack_trees(1, tree_desc, opts)) {
		case -2:
				writeout_error = 1/*
						 * We return 0 nevertheless, as the index is all right
						 * and more importantly we have made best efforts to
						 * update paths in the work tree, and we cannot revert
						 * them.
						 */;
		case /* fallthrough */0:
				return 0;
		default:
				return 128;
		}
	}
	public int restore_untracked() {
		int res;
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
			 * We need to run restore files from a given index, but without
			 * affecting the current index, so we use GIT_INDEX_FILE with
			 * run_command to fork processes that will not interfere.
			 */));
		cp.setGit_cmd(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_push("read-tree");
		generatedArgs.argv_array_push(ModernizedCProgram.oid_to_hex(u_tree));
		argv_array generatedEnv_array = cp.getEnv_array();
		generatedEnv_array.argv_array_pushf("GIT_INDEX_FILE=%s", ModernizedCProgram.stash_index_path.getBuf());
		if (cp.run_command()) {
			ModernizedCProgram.remove_path(ModernizedCProgram.stash_index_path.getBuf());
			return -1;
		} 
		cp.child_process_init();
		cp.setGit_cmd(1);
		generatedArgs.argv_array_pushl("checkout-index", "--all", ((Object)0));
		generatedEnv_array.argv_array_pushf("GIT_INDEX_FILE=%s", ModernizedCProgram.stash_index_path.getBuf());
		res = cp.run_command();
		ModernizedCProgram.remove_path(ModernizedCProgram.stash_index_path.getBuf());
		return res;
	}
	public int replace_object_oid(Object object_ref, Object replace_ref, object_id repl, int force) {
		object_id prev = new object_id();
		object_type obj_type;
		object_type repl_type;
		strbuf ref = new strbuf(, , );
		ref_transaction transaction = new ref_transaction();
		strbuf err = new strbuf(, , );
		int res = 0;
		object_type.obj_type = ModernizedCProgram.the_repository.oid_object_info(object, ((Object)0));
		object_type.repl_type = ModernizedCProgram.the_repository.oid_object_info(repl, ((Object)0));
		if (!force && object_type.obj_type != object_type.repl_type) {
			return ();
		} 
		if (ModernizedCProgram.check_ref_valid(object, prev, ref, force)) {
			ref.strbuf_release();
			return -1;
		} 
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_transaction_begin(err);
		byte generatedBuf = ref.getBuf();
		if (!transaction || ModernizedCProgram.ref_transaction_update(transaction, generatedBuf, repl, prev, 0, ((Object)0), err) || ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			res = ();
		} 
		transaction.ref_transaction_free();
		ref.strbuf_release();
		return res;
	}
	public int import_object(object_type type, int raw, Object filename) {
		int fd;
		fd = .open(filename, 0);
		if (fd < 0) {
			return ();
		} 
		int generatedOut = cmd.getOut();
		byte generatedBuf = result.getBuf();
		if (!raw && object_type.type == object_type.OBJ_TREE) {
			byte[] argv = new byte[]{"mktree", ((Object)0)};
			child_process cmd = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
			strbuf result = new strbuf(, , );
			cmd.setArgv(argv);
			cmd.setGit_cmd(1);
			cmd.setIn(fd);
			cmd.setOut(-1);
			if (cmd.start_command()) {
				.close(fd);
				return ();
			} 
			if (result.strbuf_read(generatedOut, ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 1) < 0) {
				();
				.close(fd);
				.close(generatedOut);
				return -1;
			} 
			.close(generatedOut);
			if (cmd.finish_command()) {
				result.strbuf_release();
				return ();
			} 
			if (oid.get_oid_hex(generatedBuf) < 0) {
				result.strbuf_release();
				return ();
			} 
			result.strbuf_release();
		} else {
				stat st = new stat();
				int flags = 2 | 1;
				if (.fstat(fd, st) < 0) {
					();
					.close(fd);
					return -1;
				} 
				if (ModernizedCProgram.index_fd(ModernizedCProgram.the_repository.getIndex(), oid, fd, st, object_type.type, ((Object)0), flags) < 0) {
					return ();
				} 
		} 
		return /*
			 * No need to close(fd) here; both run-command and index-fd
			 * will have done it for us.
			 */0;
	}
	public int command_singleton_iterator(Object cb_data) {
		command cmd_list = cb_data;
		command cmd = cmd_list;
		object_id generatedNew_oid = cmd.getNew_oid();
		if (!cmd || ModernizedCProgram.is_null_oid(generatedNew_oid)) {
			return -/* end of list */1;
		} 
		cmd_list = ((Object)/* this returns only one */0);
		oid.oidcpy(generatedNew_oid);
		return 0;
	}
	public int iterate_receive_command_list(Object cb_data) {
		iterate_data data = cb_data;
		command generatedCmds = data.getCmds();
		command cmd_list = generatedCmds;
		command cmd = cmd_list;
		shallow_info generatedSi = data.getSi();
		int generatedShallow_ref = generatedSi.getShallow_ref();
		int generatedIndex = cmd.getIndex();
		object_id generatedNew_oid = cmd.getNew_oid();
		int generatedSkip_update = cmd.getSkip_update();
		command generatedNext = cmd.getNext();
		for (; cmd; cmd = generatedNext) {
			if (ModernizedCProgram.shallow_update && generatedShallow_ref[generatedIndex]) {
				continue;
			} 
			if (!ModernizedCProgram.is_null_oid(generatedNew_oid) && !generatedSkip_update) {
				oid.oidcpy(generatedNew_oid);
				cmd_list = generatedNext;
				return 0;
			} 
		}
		cmd_list = ((Object)0);
		return -/* end of list */1;
	}
	public int iterate_ref_map(Object cb_data) {
		ref rm = cb_data;
		ref ref = rm;
		 generatedStatus = ref.getStatus();
		ref generatedNext = ref.getNext();
		while (ref && generatedStatus == .REF_STATUS_REJECT_SHALLOW) {
			ref = generatedNext;
		}
		if (!ref) {
			return -/* end of the list */1;
		} 
		rm = generatedNext;
		object_id generatedOld_oid = ref.getOld_oid();
		oid.oidcpy(generatedOld_oid);
		return 0;
		ref rm = cb_data;
		ref ref = rm/*
			 * Skip anything missing a peer_ref, which we are not
			 * actually going to write a ref for.
			 */;
		ref generatedPeer_ref = ref.getPeer_ref();
		ref generatedNext = ref.getNext();
		while (ref && !generatedPeer_ref) {
			ref = generatedNext;
		}
		if (!/* Returning -1 notes "end of list" to the caller. */ref) {
			return -1;
		} 
		object_id generatedOld_oid = ref.getOld_oid();
		oid.oidcpy(generatedOld_oid);
		rm = generatedNext;
		return 0;
	}
	public int grab_nth_branch_switch(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		grab_nth_branch_switch_cbdata cb = cb_data;
		byte match = ((Object)0);
		byte target = ((Object)0);
		size_t len = new size_t();
		if (ModernizedCProgram.skip_prefix(message, "checkout: moving from ", match)) {
			target = .strstr(match, " to ");
		} 
		if (!match || !target) {
			return 0;
		} 
		int generatedRemaining = cb.getRemaining();
		strbuf generatedSb = cb.getSb();
		if (--(generatedRemaining) == 0) {
			len = target - match;
			generatedSb.strbuf_setlen(0);
			generatedSb.strbuf_add(match, len);
			return /* we are done */1;
		} 
		return 0/*
		 * Parse @{-N} syntax, return the number of characters parsed
		 * if successful; otherwise signal an error with negative value.
		 */;
	}
	public int get_oidf(Object fmt) {
		va_list ap = new va_list();
		int ret;
		strbuf sb = new strbuf(, , );
		.__builtin_va_start(ap, fmt);
		sb.strbuf_vaddf(fmt, ap);
		.__builtin_va_end(ap);
		byte generatedBuf = sb.getBuf();
		ret = ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, oid);
		sb.strbuf_release();
		return ret/*
		 * Many callers know that the user meant to name a commit-ish by
		 * syntactical positions where the object name appears.  Calling this
		 * function allows the machinery to disambiguate shorter-than-unique
		 * abbreviated object names between commit-ish and others.
		 *
		 * Note that this does NOT error out when the named object is not a
		 * commit-ish. It is merely to give a hint to the disambiguation
		 * machinery.
		 */;
	}
	public void append_to_tree(int mode, Byte path) {
		treeent ent = new treeent();
		size_t len = .strlen(path);
		if (.strchr(path, (byte)'/')) {
			ModernizedCProgram.die("path %s contains slash", path);
		} 
		Object generatedName = (ent).getName();
		do {
			size_t flex_array_len_ = (len);
			(ent) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, (path), flex_array_len_);
		} while (0);
		ent.setMode(mode);
		ent.setLen(len);
		object_id generatedOid = ent.getOid();
		generatedOid.oidcpy(oid);
		do {
			if ((ModernizedCProgram.used + 1) > ModernizedCProgram.alloc) {
				if ((((ModernizedCProgram.alloc) + 16) * 3 / 2) < (ModernizedCProgram.used + 1)) {
					ModernizedCProgram.alloc = (ModernizedCProgram.used + 1);
				} else {
						ModernizedCProgram.alloc = (((ModernizedCProgram.alloc) + 16) * 3 / 2);
				} 
				(ModernizedCProgram.entries) = ModernizedCProgram.xrealloc((ModernizedCProgram.entries), ModernizedCProgram.st_mult(, (ModernizedCProgram.alloc)));
			} 
		} while (0);
		ModernizedCProgram.entries[ModernizedCProgram.used++] = ent;
	}
	public void write_tree() {
		strbuf buf = new strbuf();
		size_t size = new size_t();
		int i;
		ModernizedCProgram.sane_qsort((ModernizedCProgram.entries), (ModernizedCProgram.used), , ent_compare);
		for (size = i = 0; i < ModernizedCProgram.used; i++) {
			size += 32 + ModernizedCProgram.entries[i].getLen();
		}
		buf.strbuf_init(size);
		int generatedMode = ent.getMode();
		Object generatedName = ent.getName();
		object_id generatedOid = ent.getOid();
		Object generatedHash = generatedOid.getHash();
		for (i = 0; i < ModernizedCProgram.used; i++) {
			treeent ent = ModernizedCProgram.entries[i];
			buf.strbuf_addf("%o %s%c", generatedMode, generatedName, (byte)'\0');
			buf.strbuf_add(generatedHash, ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		}
		byte generatedBuf = buf.getBuf();
		Object generatedLen = buf.getLen();
		oid.write_object_file(generatedBuf, generatedLen, ModernizedCProgram.tree_type);
		buf.strbuf_release();
	}
	/*
	 * GIT - The information manager from hell
	 *
	 * Copyright (C) Linus Torvalds, 2005
	 * Copyright (C) Junio C Hamano, 2005
	 */
	/*
	 * This is to create corrupt objects for debugging and as such it
	 * needs to bypass the data conversion performed by, and the type
	 * limitation imposed by, index_fd() and its callees.
	 */
	public int hash_literally(int fd, Object type, int flags) {
		strbuf buf = new strbuf(, , );
		int ret;
		byte generatedBuf = buf.getBuf();
		Object generatedLen = buf.getLen();
		if (buf.strbuf_read(fd, 4096) < 0) {
			ret = -1;
		} else {
				ret = oid.hash_object_file_literally(generatedBuf, generatedLen, type, flags);
		} 
		buf.strbuf_release();
		return ret;
	}
	public void flush_current_id(int patchlen, object_id result) {
		byte[] name = new byte[(2 * 32) + 1];
		if (!patchlen) {
			return ;
		} 
		.memcpy(name, ModernizedCProgram.oid_to_hex(id), ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 1);
		.printf("%s %s\n", ModernizedCProgram.oid_to_hex(result), name);
	}
	public int should_expire_reflog_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		expire_reflog_policy_cb cb = cb_data;
		commit old_commit = new commit();
		commit new_commit = new commit();
		cmd_reflog_expire_cb generatedCmd = cb.getCmd();
		Object generatedExpire_total = generatedCmd.getExpire_total();
		if (timestamp < generatedExpire_total) {
			return 1;
		} 
		old_commit = new_commit = ((Object)0);
		int generatedStalefix = generatedCmd.getStalefix();
		if (generatedStalefix && (!ModernizedCProgram.keep_entry(old_commit, ooid) || !ModernizedCProgram.keep_entry(new_commit, noid))) {
			return 1;
		} 
		Object generatedExpire_unreachable = generatedCmd.getExpire_unreachable();
		 generatedUnreachable_expire_kind = cb.getUnreachable_expire_kind();
		if (timestamp < generatedExpire_unreachable) {
			if (generatedUnreachable_expire_kind == .UE_ALWAYS) {
				return 1;
			} 
			if (ModernizedCProgram.unreachable(cb, old_commit, ooid) || ModernizedCProgram.unreachable(cb, new_commit, noid)) {
				return 1;
			} 
		} 
		int generatedRecno = generatedCmd.getRecno();
		if (generatedRecno && --(generatedRecno) == 0) {
			return 1;
		} 
		return 0;
	}
	public int count_reflog_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		expire_reflog_policy_cb cb = cb_data;
		cmd_reflog_expire_cb generatedCmd = cb.getCmd();
		Object generatedExpire_total = generatedCmd.getExpire_total();
		int generatedRecno = generatedCmd.getRecno();
		if (!generatedExpire_total || timestamp < generatedExpire_total) {
			generatedRecno++;
		} 
		return 0;
	}
	public int check_local_mod(int index_only) {
		int i;
		int no_head;
		int errs = 0;
		string_list files_staged = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		string_list files_cached = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		string_list files_local = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		no_head = ModernizedCProgram.is_null_oid(head);
		Object generatedSt_mode = st.getSt_mode();
		for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
			stat st = new stat();
			int pos;
			cache_entry ce = new cache_entry();
			byte name = ModernizedCProgram.list.getEntry()[i].getName();
			object_id oid = new object_id();
			int mode;
			int local_changes = 0;
			int staged_changes = 0;
			pos = ModernizedCProgram.index_name_pos(ModernizedCProgram.the_index, (name), (.strlen(name)));
			if (pos < 0/*
						 * Skip unmerged entries except for populated submodules
						 * that could lose history when removed.
						 */) {
				pos = ModernizedCProgram.get_ours_cache_pos(name, pos);
				if (pos < 0) {
					continue;
				} 
				if (!((((ModernizedCProgram.the_index.getCache())[pos].getCe_mode()) & -1024) == 160000) || ModernizedCProgram.is_empty_dir(name)) {
					continue;
				} 
			} 
			ce = (ModernizedCProgram.the_index.getCache())[pos];
			if (.lstat(ce.getName(), st) < 0) {
				if (!ModernizedCProgram.is_missing_file_error((._errno()))) {
					ModernizedCProgram.warning_errno(ModernizedCProgram._("failed to stat '%s'"), ce.getName());
				} 
				continue;
			}  else if ((((generatedSt_mode) & -1024) == -1024/* if a file was removed and it is now a
						 * directory, that is the same as ENOENT as
						 * far as git is concerned; we do not track
						 * directories unless they are submodules.
						 */)) {
				if (!(((ce.getCe_mode()) & -1024) == 160000)) {
					continue;
				} 
			} 
			if (ModernizedCProgram.ie_match_stat(ModernizedCProgram.the_index, (ce), (st), (/*
					 * Is the index different from the file in the work tree?
					 * If it's a submodule, is its work tree modified?
					 */false)) || ((((ce.getCe_mode()) & -1024) == 160000) && ModernizedCProgram.bad_to_remove_submodule(ce.getName(), (1 << 0) | (1 << 2)))) {
				local_changes = 1/*
						 * Is the index different from the HEAD commit?  By
						 * definition, before the very initial commit,
						 * anything staged in the index is treated by the same
						 * way as changed from the HEAD.
						 */;
			} 
			if (no_head || ModernizedCProgram.get_tree_entry(ModernizedCProgram.the_repository, head, name, oid, mode) || ce.getCe_mode() != ModernizedCProgram.create_ce_mode(mode) || !ModernizedCProgram.oideq(ce.getOid(), oid)) {
				staged_changes = 1/*
						 * If the index does not match the file in the work
						 * tree and if it does not match the HEAD commit
						 * either, (1) "git rm" without --cached definitely
						 * will lose information; (2) "git rm --cached" will
						 * lose information unless it is about removing an
						 * "intent to add" entry.
						 */;
			} 
			if (local_changes && staged_changes) {
				if (!index_only || !((ce).getCe_flags() & (1 << 29))) {
					files_staged.string_list_append(name);
				} 
			}  else if (!index_only) {
				if (staged_changes) {
					files_cached.string_list_append(name);
				} 
				if (local_changes) {
					files_local.string_list_append(name);
				} 
			} 
		}
		int generatedNr = files_staged.getNr();
		files_staged.print_error_files(ModernizedCProgram.Q_("the following file has staged content different from both the\nfile and the HEAD:", "the following files have staged content different from both the\nfile and the HEAD:", generatedNr), ModernizedCProgram._("\n(use -f to force removal)"), errs);
		files_staged.string_list_clear(0);
		files_cached.print_error_files(ModernizedCProgram.Q_("the following file has changes staged in the index:", "the following files have changes staged in the index:", generatedNr), ModernizedCProgram._("\n(use --cached to keep the file, or -f to force removal)"), errs);
		files_cached.string_list_clear(0);
		files_local.print_error_files(ModernizedCProgram.Q_("the following file has local modifications:", "the following files have local modifications:", generatedNr), ModernizedCProgram._("\n(use --cached to keep the file, or -f to force removal)"), errs);
		files_local.string_list_clear(0);
		return errs;
	}
	/*
		 * Items in list are already sorted in the cache order,
		 * so we could do this a lot more efficiently by using
		 * tree_desc based traversal if we wanted to, but I am
		 * lazy, and who cares if removal of files is a tad
		 * slower than the theoretical maximum speed?
		 */
	/* not present at all */
	/* deleted */
	/* Don't touch h->keys[x] if present and not deleted */
	/* Other convenient macros... */
	/*! @function
	  @abstract     Test whether a bucket contains data.
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @param  x     Iterator to the bucket [khint_t]
	  @return       1 if containing data; 0 otherwise [int]
	 */
	/*! @function
	  @abstract     Get key given an iterator
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @param  x     Iterator to the bucket [khint_t]
	  @return       Key [type of keys]
	 */
	/*! @function
	  @abstract     Get value given an iterator
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @param  x     Iterator to the bucket [khint_t]
	  @return       Value [type of values]
	  @discussion   For hash sets, calling this results in segfault.
	 */
	/*! @function
	  @abstract     Alias of kh_val()
	 */
	/*! @function
	  @abstract     Get the start iterator
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @return       The start iterator [khint_t]
	 */
	/*! @function
	  @abstract     Get the end iterator
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @return       The end iterator [khint_t]
	 */
	/*! @function
	  @abstract     Get the number of elements in the hash table
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @return       Number of elements in the hash table [khint_t]
	 */
	/*! @function
	  @abstract     Get the number of buckets in the hash table
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @return       Number of buckets in the hash table [khint_t]
	 */
	/*! @function
	  @abstract     Iterate over the entries in the hash table
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @param  kvar  Variable to which key will be assigned
	  @param  vvar  Variable to which value will be assigned
	  @param  code  Block of code to execute
	 */
	/*! @function
	  @abstract     Iterate over the values in the hash table
	  @param  h     Pointer to the hash table [khash_t(name)*]
	  @param  vvar  Variable to which value will be assigned
	  @param  code  Block of code to execute
	 */
	public int oidhash_by_value() {
		return ModernizedCProgram.oidhash(oid);
	}
	public int oideq_by_value(object_id b) {
		return ModernizedCProgram.oideq(a, b);
	}
	public Object kh_get_oid_set(Object h) {
		if (h.getN_buckets()) {
			khint_t k = new khint_t();
			khint_t i = new khint_t();
			khint_t last = new khint_t();
			khint_t mask = new khint_t();
			khint_t step = 0;
			mask = h.getN_buckets() - 1;
			k = ModernizedCProgram.key.oidhash_by_value();
			i = k & mask;
			last = i;
			while (!((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 2) && (((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 1) || !h.getKeys()[i].oideq_by_value(ModernizedCProgram.key))) {
				i = (i + (++step)) & mask;
				if (i == last) {
					return h.getN_buckets();
				} 
			}
			return ((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 3) ? h.getN_buckets() : i;
		} else {
				return 0;
		} 
	}
	public Object kh_get_oid_map(Object h) {
		if (h.getN_buckets()) {
			khint_t k = new khint_t();
			khint_t i = new khint_t();
			khint_t last = new khint_t();
			khint_t mask = new khint_t();
			khint_t step = 0;
			mask = h.getN_buckets() - 1;
			k = ModernizedCProgram.key.oidhash_by_value();
			i = k & mask;
			last = i;
			while (!((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 2) && (((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 1) || !h.getKeys()[i].oideq_by_value(ModernizedCProgram.key))) {
				i = (i + (++step)) & mask;
				if (i == last) {
					return h.getN_buckets();
				} 
			}
			return ((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 3) ? h.getN_buckets() : i;
		} else {
				return 0;
		} 
	}
	public Object kh_get_oid_pos(Object h) {
		if (h.getN_buckets()) {
			khint_t k = new khint_t();
			khint_t i = new khint_t();
			khint_t last = new khint_t();
			khint_t mask = new khint_t();
			khint_t step = 0;
			mask = h.getN_buckets() - 1;
			k = ModernizedCProgram.key.oidhash_by_value();
			i = k & mask;
			last = i;
			while (!((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 2) && (((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 1) || !h.getKeys()[i].oideq_by_value(ModernizedCProgram.key))) {
				i = (i + (++step)) & mask;
				if (i == last) {
					return h.getN_buckets();
				} 
			}
			return ((h.getFlags()[i >> 4] >> ((i & -1024) << 1)) & 3) ? h.getN_buckets() : i;
		} else {
				return 0;
		} 
	}
	public int read_from_tree(Object pathspec, int intent_to_add) {
		diff_options opt = new diff_options();
		.memset(opt, 0, );
		pathspec generatedPathspec = opt.getPathspec();
		generatedPathspec.copy_pathspec(pathspec);
		opt.setOutput_format(-1024);
		opt.setFormat_callback(update_index_from_diff);
		opt.setFormat_callback_data(intent_to_add);
		diff_flags generatedFlags = opt.getFlags();
		generatedFlags.setOverride_submodule_config(1);
		opt.setRepo(ModernizedCProgram.the_repository);
		if (opt.do_diff_cache(tree_oid)) {
			return 1;
		} 
		.diffcore_std(opt);
		.diff_flush(opt);
		generatedPathspec.clear_pathspec();
		return 0;
	}
	public int get_rebase_fork_point(Object repo, Object refspec) {
		int ret;
		branch curr_branch = new branch();
		byte remote_branch;
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf sb = new strbuf(, , );
		curr_branch = .branch_get("HEAD");
		if (!curr_branch) {
			return -1;
		} 
		if (refspec) {
			remote_branch = ModernizedCProgram.get_tracking_branch(repo, refspec);
		} else {
				remote_branch = ModernizedCProgram.get_upstream_branch(repo);
		} 
		if (!remote_branch) {
			return -1;
		} 
		argv_array generatedArgs = cp.getArgs();
		Object generatedName = curr_branch.getName();
		generatedArgs.argv_array_pushl("merge-base", "--fork-point", remote_branch, generatedName, ((Object)0));
		cp.setNo_stdin(1);
		cp.setNo_stderr(1);
		cp.setGit_cmd(1);
		ret = cp.capture_command(sb, (2 * 32));
		if (ret) {
			;
		} 
		byte generatedBuf = sb.getBuf();
		ret = fork_point.get_oid_hex(generatedBuf);
		if (ret) {
			;
		} 
		return ret ? -1 : 0/**
		 * Sets merge_base to the octopus merge base of curr_head, merge_head and
		 * fork_point. Returns 0 if a merge base is found, 1 otherwise.
		 */;
	}
	public int get_octopus_merge_base(Object curr_head, Object merge_head, Object fork_point) {
		commit_list revs = ((Object)0);
		commit_list result = new commit_list();
		.commit_list_insert(.lookup_commit_reference(ModernizedCProgram.the_repository, curr_head), revs);
		.commit_list_insert(.lookup_commit_reference(ModernizedCProgram.the_repository, merge_head), revs);
		if (!ModernizedCProgram.is_null_oid(fork_point)) {
			.commit_list_insert(.lookup_commit_reference(ModernizedCProgram.the_repository, fork_point), revs);
		} 
		result = revs.get_octopus_merge_bases();
		.free_commit_list(revs);
		result.reduce_heads_replace();
		if (!result) {
			return 1;
		} 
		commit generatedItem = result.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		merge_base.oidcpy(generatedOid);
		.free_commit_list(result);
		return 0/**
		 * Given the current HEAD oid, the merge head returned from git-fetch and the
		 * fork point calculated by get_rebase_fork_point(), runs git-rebase with the
		 * appropriate arguments and returns its exit status.
		 */;
	}
	public int pretend_object_file(Object buf, long len, object_type type) {
		cached_object co = new cached_object();
		oid.hash_object_file(buf, len, ModernizedCProgram.type_name(object_type.type));
		cached_object cached_object = new cached_object();
		if (ModernizedCProgram.the_repository.repo_has_object_file(oid) || cached_object.find_cached_object(oid)) {
			return 0;
		} 
		do {
			if ((ModernizedCProgram.cached_object_nr + 1) > ModernizedCProgram.cached_object_alloc) {
				if ((((ModernizedCProgram.cached_object_alloc) + 16) * 3 / 2) < (ModernizedCProgram.cached_object_nr + 1)) {
					ModernizedCProgram.cached_object_alloc = (ModernizedCProgram.cached_object_nr + 1);
				} else {
						ModernizedCProgram.cached_object_alloc = (((ModernizedCProgram.cached_object_alloc) + 16) * 3 / 2);
				} 
				(cached_objects) = ModernizedCProgram.xrealloc((cached_objects), ModernizedCProgram.st_mult(, (ModernizedCProgram.cached_object_alloc)));
			} 
		} while (0);
		co = cached_objects[ModernizedCProgram.cached_object_nr++];
		co.setSize(len);
		co.setType(object_type.type);
		co.setBuf(ModernizedCProgram.xmalloc(len));
		Object generatedBuf = co.getBuf();
		.memcpy(generatedBuf, buf, len);
		object_id generatedOid = co.getOid();
		generatedOid.oidcpy(oid);
		return 0/*
		 * This function dies on corrupt objects; the callers who want to
		 * deal with them should arrange to call read_object() and give error
		 * messages themselves.
		 */;
	}
	public void write_object_file_prepare(Object buf, long len, Object type, Byte hdr, int hdrlen) {
		git_hash_ctx c = new git_hash_ctx();
		hdrlen = ModernizedCProgram.xsnprintf(hdr, hdrlen, "%s %llu", type, (uintmax_t)len) + /* Generate the header */1;
		.UNRECOGNIZEDFUNCTIONNAME(/* Sha1.. */c);
		.UNRECOGNIZEDFUNCTIONNAME(c, hdr, hdrlen);
		.UNRECOGNIZEDFUNCTIONNAME(c, buf, len);
		Object generatedHash = this.getHash();
		.UNRECOGNIZEDFUNCTIONNAME(generatedHash, c/*
		 * Move the just written object into its final resting place.
		 */);
	}
	public int hash_object_file(Object buf, long len, Object type) {
		byte[] hdr = new byte[32];
		int hdrlen = ;
		oid.write_object_file_prepare(buf, len, type, hdr, hdrlen);
		return 0;
	}
	public int write_object_file(Object buf, long len, Object type) {
		byte[] hdr = new byte[32];
		int hdrlen = ;
		oid.write_object_file_prepare(buf, len, type, hdr, hdrlen);
		if (ModernizedCProgram.freshen_packed_object(oid) || ModernizedCProgram.freshen_loose_object(oid)) {
			return 0;
		} 
		return ModernizedCProgram.write_loose_object(oid, hdr, hdrlen, buf, len, 0);
	}
	public int hash_object_file_literally(Object buf, long len, Object type, int flags) {
		byte header;
		int hdrlen;
		int status = 0;
		hdrlen = .strlen(type) + /* type string, SP, %lu of the length plus NUL must fit this */32;
		header = ModernizedCProgram.xmalloc(hdrlen);
		oid.write_object_file_prepare(buf, len, type, header, hdrlen);
		if (!(flags & 1)) {
			;
		} 
		if (ModernizedCProgram.freshen_packed_object(oid) || ModernizedCProgram.freshen_loose_object(oid)) {
			;
		} 
		status = ModernizedCProgram.write_loose_object(oid, header, hdrlen, buf, len, 0);
		return status;
	}
	public int index_stream(int fd, Object size, object_type type, Object path, int flags) {
		return oid.index_bulk_checkin(fd, size, object_type.type, path, flags);
	}
	public int parse_index_info(byte p, int mode1, int mode2, object_id oid2, byte status) {
		if (p != (byte)':') {
			return ();
		} 
		mode1 = (int).strtol(p + 1, p, 8);
		if (p != (byte)' ') {
			return ();
		} 
		mode2 = (int).strtol(p + 1, p, 8);
		if (p != (byte)' ') {
			return ();
		} 
		if (oid1.parse_oid_hex(++p, (byte)p)) {
			return ();
		} 
		if (p != (byte)' ') {
			return ();
		} 
		if (oid2.parse_oid_hex(++p, (byte)p)) {
			return ();
		} 
		if (p != (byte)' ') {
			return ();
		} 
		status = ++p;
		if (!status) {
			return ();
		} 
		if (p[1] && !((ModernizedCProgram.sane_ctype[(byte)(p[1])] & (true)) != 0)) {
			return ();
		} 
		return 0/*
		 * Remove any trailing slash from $workdir
		 * before starting to avoid double slashes in symlink targets.
		 */;
	}
	public int use_wt_file(Object workdir, Object name) {
		strbuf buf = new strbuf(, , );
		stat st = new stat();
		int use = 0;
		buf.strbuf_addstr(workdir);
		Object generatedLen = buf.getLen();
		buf.add_path(generatedLen, name);
		byte generatedBuf = buf.getBuf();
		Object generatedSt_mode = st.getSt_mode();
		if (!.lstat(generatedBuf, st) && !.S_ISLNK(generatedSt_mode)) {
			object_id wt_oid = new object_id();
			int fd = .open(generatedBuf, 0);
			if (fd >= 0 && !ModernizedCProgram.index_fd(ModernizedCProgram.the_index, wt_oid, fd, st, object_type.OBJ_BLOB, name, 0)) {
				if (ModernizedCProgram.is_null_oid(oid)) {
					oid.oidcpy(wt_oid);
					use = 1;
				}  else if (ModernizedCProgram.oideq(oid, wt_oid)) {
					use = 1;
				} 
			} 
		} 
		buf.strbuf_release();
		return use;
	}
	public int checkout_path(int mode, Object path, Object state) {
		cache_entry ce = new cache_entry();
		int ret;
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_transient_cache_entry(mode, oid, path, 0);
		ret = ce.checkout_entry(state, ((Object)0), ((Object)0));
		ce.discard_cache_entry();
		return ret;
	}
	public int read_one_reflog(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		complete_reflogs array = cb_data;
		reflog_info item = new reflog_info();
		int generatedNr = array.getNr();
		int generatedAlloc = array.getAlloc();
		reflog_info generatedItems = array.getItems();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					array.setAlloc((generatedNr + 1));
				} else {
						array.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedItems) = ModernizedCProgram.xrealloc((generatedItems), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		item = generatedItems + generatedNr;
		object_id generatedOoid = item.getOoid();
		generatedOoid.oidcpy(ooid);
		object_id generatedNoid = item.getNoid();
		generatedNoid.oidcpy(noid);
		item.setEmail(ModernizedCProgram.xstrdup(email));
		item.setTimestamp(timestamp);
		item.setTz(tz);
		item.setMessage(ModernizedCProgram.xstrdup(message));
		generatedNr++;
		return 0;
	}
	public void handle_one_reflog_commit(Object cb_data) {
		all_refs_cb cb = cb_data;
		rev_info generatedAll_revs = cb.getAll_revs();
		repository generatedRepo = generatedAll_revs.getRepo();
		object object = new object();
		int generatedFlags = o.getFlags();
		int generatedAll_flags = cb.getAll_flags();
		int generatedWarned_bad_reflog = cb.getWarned_bad_reflog();
		Object generatedName_for_errormsg = cb.getName_for_errormsg();
		if (!ModernizedCProgram.is_null_oid(oid)) {
			object o = object.parse_object(generatedRepo, oid);
			if (o) {
				generatedFlags |=  generatedAll_flags;
				ModernizedCProgram.add_pending_object(generatedAll_revs, o, /* ??? CMDLINEFLAGS ??? */"");
			}  else if (!generatedWarned_bad_reflog) {
				ModernizedCProgram.warning("reflog of '%s' references pruned commits", generatedName_for_errormsg);
				cb.setWarned_bad_reflog(1);
			} 
		} 
	}
	public int handle_one_reflog_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		ooid.handle_one_reflog_commit(cb_data);
		noid.handle_one_reflog_commit(cb_data);
		return 0;
	}
	public Object unpack_entry_data(Object offset, long size, object_type type) {
		byte[] fixed_buf = new byte[8192];
		int status;
		git_zstream stream = new git_zstream();
		Object buf;
		git_hash_ctx c = new git_hash_ctx();
		byte[] hdr = new byte[32];
		int hdrlen;
		if (!ModernizedCProgram.is_delta_type(object_type.type)) {
			hdrlen = ModernizedCProgram.xsnprintf(hdr, , "%s %llu", ModernizedCProgram.type_name(object_type.type), (uintmax_t)size) + 1;
			.UNRECOGNIZEDFUNCTIONNAME(c);
			.UNRECOGNIZEDFUNCTIONNAME(c, hdr, hdrlen);
		} else {
				oid = ((Object)0);
		} 
		if (object_type.type == object_type.OBJ_BLOB && size > ModernizedCProgram.big_file_threshold) {
			buf = fixed_buf;
		} else {
				buf = ModernizedCProgram.xmallocz(size);
		} 
		.memset(stream, 0, );
		stream.git_inflate_init();
		stream.setNext_out(buf);
		stream.setAvail_out(buf == fixed_buf ?  : size);
		Byte generatedNext_out = stream.getNext_out();
		all_attrs_item all_attrs_item = new all_attrs_item();
		long generatedAvail_in = stream.getAvail_in();
		do {
			byte last_out = generatedNext_out;
			stream.setNext_in(all_attrs_item.fill(1));
			stream.setAvail_in(ModernizedCProgram.input_len);
			status = stream.git_inflate(0);
			ModernizedCProgram.use(ModernizedCProgram.input_len - generatedAvail_in);
			if (oid) {
				.UNRECOGNIZEDFUNCTIONNAME(c, last_out, generatedNext_out - last_out);
			} 
			if (buf == fixed_buf) {
				stream.setNext_out(buf);
				stream.setAvail_out();
			} 
		} while (status == Z_OK);
		long generatedTotal_out = stream.getTotal_out();
		if (generatedTotal_out != size || status != Z_STREAM_END) {
			ModernizedCProgram.bad_object(offset, ModernizedCProgram._("inflate returned %d"), status);
		} 
		stream.git_inflate_end();
		Object generatedHash = this.getHash();
		if (oid) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedHash, c);
		} 
		return buf == fixed_buf ? ((Object)0) : buf;
	}
	public object_id nth_midxed_object_oid(multi_pack_index m, Object n) {
		Object generatedNum_objects = m.getNum_objects();
		if (n >= generatedNum_objects) {
			return ((Object)0);
		} 
		Object generatedHash = this.getHash();
		Object generatedChunk_oid_lookup = m.getChunk_oid_lookup();
		byte generatedHash_len = m.getHash_len();
		ModernizedCProgram.hashcpy(generatedHash, generatedChunk_oid_lookup + generatedHash_len * n);
		return oid;
	}
	public void fsck_handle_reflog_oid(Object refname, Object timestamp) {
		object obj = new object();
		object object = new object();
		int generatedFlags = obj.getFlags();
		if (!ModernizedCProgram.is_null_oid(oid)) {
			obj = object.lookup_object(ModernizedCProgram.the_repository, oid);
			if (obj && (generatedFlags & -1024)) {
				if (timestamp && ModernizedCProgram.name_objects) {
					ModernizedCProgram.fsck_walk_options.getObject_names().add_decoration(obj, ModernizedCProgram.xstrfmt("%s@{%llu}", refname, timestamp));
				} 
				generatedFlags |=  -1024;
				obj.mark_object_reachable();
			}  else if (!ModernizedCProgram.is_promisor_object(oid)) {
				();
				ModernizedCProgram.errors_found |=  2;
			} 
		} 
	}
	public int fsck_handle_reflog_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		byte refname = cb_data;
		if (ModernizedCProgram.verbose) {
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Checking reflog %s->%s"), ModernizedCProgram.oid_to_hex(ooid), ModernizedCProgram.oid_to_hex(noid));
		} 
		ooid.fsck_handle_reflog_oid(refname, 0);
		noid.fsck_handle_reflog_oid(refname, timestamp);
		return 0;
	}
	public int fsck_head_link(Object head_ref_name, Object head_points_at) {
		int null_is_error = 0;
		if (ModernizedCProgram.verbose) {
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Checking %s link"), head_ref_name);
		} 
		head_points_at = ModernizedCProgram.head_oid.resolve_ref_unsafe(head_ref_name, 0, ((Object)0));
		if (!head_points_at) {
			ModernizedCProgram.errors_found |=  10;
			return ();
		} 
		if (!.strcmp(head_points_at, head_ref_name)) {
			null_is_error = /* detached HEAD */1;
		}  else if (!ModernizedCProgram.starts_with(head_points_at, "refs/heads/")) {
			ModernizedCProgram.errors_found |=  10;
			return ();
		} 
		if (ModernizedCProgram.is_null_oid(ModernizedCProgram.head_oid)) {
			if (null_is_error) {
				ModernizedCProgram.errors_found |=  10;
				return ();
			} 
			(_iob[2]).fprintf_ln(ModernizedCProgram._("notice: %s points to an unborn branch (%s)"), head_ref_name, head_points_at + 11);
		} 
		return 0;
	}
	public int each_reflog(object_id new_oid, Object committer, Object timestamp, int tz, Object msg, Object cb_data) {
		.printf("%s %s %s %llu %d %s\n", ModernizedCProgram.oid_to_hex(old_oid), ModernizedCProgram.oid_to_hex(new_oid), committer, timestamp, tz, msg);
		return 0;
	}
	public Byte resolve_refdup(Object refname, int resolve_flags, Integer flags) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_resolve_refdup(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), refname, resolve_flags, oid, flags);
	}
	public int read_ref_full(Object refname, int resolve_flags, Integer flags) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_read_ref_full(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), refname, resolve_flags, oid, flags);
	}
	public int read_ref(Object refname) {
		return oid.read_ref_full(refname, -1024, ((Object)0));
	}
	public peel_status peel_object(Object name) {
		object object = new object();
		object o = object.lookup_unknown_object(name);
		int generatedType = o.getType();
		if (generatedType == object_type.OBJ_NONE) {
			int type = ModernizedCProgram.the_repository.oid_object_info(name, ((Object)0));
			if (ModernizedCProgram.type < 0 || !ModernizedCProgram.object_as_type(ModernizedCProgram.the_repository, o, ModernizedCProgram.type, 0)) {
				return PEEL_INVALID;
			} 
		} 
		if (generatedType != object_type.OBJ_TAG) {
			return PEEL_NON_TAG;
		} 
		o = .deref_tag_noverify(o);
		if (!o) {
			return PEEL_INVALID;
		} 
		object_id generatedOid = o.getOid();
		oid.oidcpy(generatedOid);
		return PEEL_PEELED;
	}
	public int dwim_ref(Object str, int len, Byte ref) {
		return ModernizedCProgram.repo_dwim_ref(ModernizedCProgram.the_repository, str, len, oid, ref);
	}
	public int dwim_log(Object str, int len, Byte log) {
		return ModernizedCProgram.repo_dwim_log(ModernizedCProgram.the_repository, str, len, oid, log);
	}
	public int read_ref_at_ent(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		read_ref_at_cb cb = cb_data;
		int generatedReccnt = cb.getReccnt();
		generatedReccnt++;
		cb.setTz(tz);
		cb.setDate(timestamp);
		Object generatedAt_time = cb.getAt_time();
		int generatedCnt = cb.getCnt();
		byte generatedMsg = cb.getMsg();
		Object generatedCutoff_time = cb.getCutoff_time();
		int generatedCutoff_tz = cb.getCutoff_tz();
		int generatedCutoff_cnt = cb.getCutoff_cnt();
		object_id generatedOoid = cb.getOoid();
		object_id generatedOid = cb.getOid();
		Object generatedRefname = cb.getRefname();
		Object generatedDate = cb.getDate();
		int generatedTz = cb.getTz();
		date_mode date_mode = new date_mode();
		object_id generatedNoid = cb.getNoid();
		if (timestamp <= generatedAt_time || generatedCnt == 0) {
			if (generatedMsg) {
				generatedMsg = ModernizedCProgram.xstrdup(message);
			} 
			if (generatedCutoff_time) {
				generatedCutoff_time = timestamp;
			} 
			if (generatedCutoff_tz) {
				generatedCutoff_tz = tz;
			} 
			if (generatedCutoff_cnt) {
				generatedCutoff_cnt = generatedReccnt - 1/*
						 * we have not yet updated cb->[n|o]oid so they still
						 * hold the values for the previous record.
						 */;
			} 
			if (!ModernizedCProgram.is_null_oid(generatedOoid)) {
				generatedOid.oidcpy(noid);
				if (!ModernizedCProgram.oideq(generatedOoid, noid)) {
					ModernizedCProgram.warning(ModernizedCProgram._("log for ref %s has gap after %s"), generatedRefname, ModernizedCProgram.show_date(generatedDate, generatedTz, date_mode.date_mode_from_type(date_mode_type.DATE_RFC2822)));
				} 
			}  else if (generatedDate == generatedAt_time) {
				generatedOid.oidcpy(noid);
			}  else if (!ModernizedCProgram.oideq(noid, generatedOid)) {
				ModernizedCProgram.warning(ModernizedCProgram._("log for ref %s unexpectedly ended on %s"), generatedRefname, ModernizedCProgram.show_date(generatedDate, generatedTz, date_mode.date_mode_from_type(date_mode_type.DATE_RFC2822)));
			} 
			generatedOoid.oidcpy(ooid);
			generatedNoid.oidcpy(noid);
			cb.setFound_it(1);
			return 1;
		} 
		generatedOoid.oidcpy(ooid);
		generatedNoid.oidcpy(noid);
		if (generatedCnt > 0) {
			generatedCnt--;
		} 
		return 0;
	}
	public int read_ref_at_ent_oldest(object_id noid, Object email, Object timestamp, int tz, Object message, Object cb_data) {
		read_ref_at_cb cb = cb_data;
		byte generatedMsg = cb.getMsg();
		if (generatedMsg) {
			generatedMsg = ModernizedCProgram.xstrdup(message);
		} 
		Object generatedCutoff_time = cb.getCutoff_time();
		if (generatedCutoff_time) {
			generatedCutoff_time = timestamp;
		} 
		int generatedCutoff_tz = cb.getCutoff_tz();
		if (generatedCutoff_tz) {
			generatedCutoff_tz = tz;
		} 
		int generatedCutoff_cnt = cb.getCutoff_cnt();
		int generatedReccnt = cb.getReccnt();
		if (generatedCutoff_cnt) {
			generatedCutoff_cnt = generatedReccnt;
		} 
		object_id generatedOid = cb.getOid();
		generatedOid.oidcpy(ooid);
		if (ModernizedCProgram.is_null_oid(generatedOid)) {
			generatedOid.oidcpy(noid);
		} 
		return /* We just want the first entry */1;
	}
	public Object resolve_ref_unsafe(Object refname, int resolve_flags, Integer flags) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_resolve_ref_unsafe(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), refname, resolve_flags, oid, flags);
	}
	public int resolve_gitlink_ref(Object submodule, Object refname) {
		ref_store refs = new ref_store();
		int flags;
		ref_store ref_store = new ref_store();
		refs = ref_store.get_submodule_ref_store(submodule);
		if (!refs) {
			return -1;
		} 
		if (!ModernizedCProgram.refs_resolve_ref_unsafe(refs, refname, 0, oid, flags) || ModernizedCProgram.is_null_oid(oid)) {
			return -1;
		} 
		return 0;
	}
	public int peel_ref(Object refname) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_peel_ref(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), refname, oid);
	}
	public int ref_iterator_peel(Object ref_iterator) {
		return .UNRECOGNIZEDFUNCTIONNAME(ref_iterator, peeled);
	}
	public void oidcpy(Object src) {
		Object generatedHash = this.getHash();
		.memcpy(generatedHash, generatedHash, 32);
	}
	public object_id oiddup(Object src) {
		object_id dst = ModernizedCProgram.xmalloc();
		dst.oidcpy(src);
		return dst;
	}
	public void oidclr() {
		Object generatedHash = this.getHash();
		.memset(generatedHash, 0, 32);
	}
	public void oidread(Object hash) {
		Object generatedHash = this.getHash();
		.memcpy(generatedHash, hash, ModernizedCProgram.the_repository.getHash_algo().getRawsz());
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
}
