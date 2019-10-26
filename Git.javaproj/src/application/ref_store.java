package application;

/*
 * Initialize the ref_store for the specified gitdir. These functions
 * should call base_ref_store_init() to initialize the shared part of
 * the ref_store and to record the ref_store for later lookup.
 */
public class ref_store {
	private Object be;
	
	public ref_store(Object be) {
		setBe(be);
	}
	public ref_store() {
	}
	
	public ref_store files_ref_store_create(Object gitdir, int flags) {
		files_ref_store refs = ModernizedCProgram.xcalloc(1, );
		ref_store ref_store = (ref_store)refs;
		strbuf sb = new strbuf(, , );
		ref_store.base_ref_store_init(ModernizedCProgram.refs_be_files);
		refs.setStore_flags(flags);
		refs.setGitdir(ModernizedCProgram.xstrdup(gitdir));
		sb.get_common_dir_noenv(gitdir);
		refs.setGitcommondir(sb.strbuf_detach(((Object)0)));
		Byte generatedGitcommondir = refs.getGitcommondir();
		sb.strbuf_addf("%s/packed-refs", generatedGitcommondir);
		byte generatedBuf = sb.getBuf();
		ref_store ref_store = new ref_store();
		refs.setPacked_ref_store(ref_store.packed_ref_store_create(generatedBuf, flags));
		sb.strbuf_release();
		Byte generatedGitdir = refs.getGitdir();
		ModernizedCProgram.chdir_notify_reparent("files-backend $GIT_DIR", generatedGitdir);
		ModernizedCProgram.chdir_notify_reparent("files-backend $GIT_COMMONDIR", generatedGitcommondir);
		return ref_store/*
		 * Die if refs is not the main ref store. caller is used in any
		 * necessary error messages.
		 */;
	}
	public int files_pack_refs(int flags) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 1) | (1 << 2), "pack_refs");
		ref_iterator iter = new ref_iterator();
		int ok;
		ref_to_prune refs_to_prune = ((Object)0);
		strbuf err = new strbuf(, , );
		ref_transaction transaction = new ref_transaction();
		ref_store generatedPacked_ref_store = refs.getPacked_ref_store();
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_store_transaction_begin(generatedPacked_ref_store, err);
		if (!transaction) {
			return -1;
		} 
		ModernizedCProgram.packed_refs_lock(generatedPacked_ref_store, 1, err);
		ref_cache ref_cache = new ref_cache();
		ref_iterator ref_iterator = new ref_iterator();
		iter = ref_iterator.cache_ref_iterator_begin(ref_cache.get_loose_ref_cache(refs), ((Object)0), 0);
		Object generatedRefname = iter.getRefname();
		Object generatedOid = iter.getOid();
		int generatedFlags = iter.getFlags();
		byte generatedBuf = err.getBuf();
		Object generatedName = ((n)).getName();
		while ((ok = ModernizedCProgram.ref_iterator_advance(iter)) == 0/*
				 * If the loose reference can be packed, add an entry
				 * in the packed ref cache. If the reference should be
				 * pruned, also add it to refs_to_prune.
				 */) {
			if (!ModernizedCProgram.should_pack_ref(generatedRefname, generatedOid, generatedFlags, flags)) {
				continue;
			} 
			if (ModernizedCProgram.ref_transaction_update(transaction, generatedRefname, generatedOid, ((Object)0), (1 << 0), ((Object)0), err)) {
				ModernizedCProgram.die("failure preparing to create packed reference %s: %s", generatedRefname, generatedBuf);
			} 
			if ((flags & /* Schedule the loose reference for pruning if requested. */-1024)) {
				ref_to_prune n = new ref_to_prune();
				do {
					size_t flex_array_len_ = (.strlen(generatedRefname));
					((n)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
					.memcpy((Object)generatedName, ((generatedRefname)), flex_array_len_);
				} while (0);
				generatedOid.oidcpy(generatedOid);
				n.setNext(refs_to_prune);
				refs_to_prune = n;
			} 
		}
		if (ok != -1) {
			ModernizedCProgram.die("error while iterating over references");
		} 
		if (ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			ModernizedCProgram.die("unable to write new packed-refs: %s", generatedBuf);
		} 
		transaction.ref_transaction_free();
		generatedPacked_ref_store.packed_refs_unlock();
		ModernizedCProgram.prune_refs(refs, refs_to_prune);
		err.strbuf_release();
		return 0;
	}
	public int files_copy_or_rename_ref(Object oldrefname, Object newrefname, Object logmsg, int copy) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 1), "rename_ref");
		object_id oid = new object_id();
		object_id orig_oid = new object_id();
		int flag = 0;
		int logmoved = 0;
		ref_lock lock = new ref_lock();
		stat loginfo = new stat();
		strbuf sb_oldref = new strbuf(, , );
		strbuf sb_newref = new strbuf(, , );
		strbuf tmp_renamed_log = new strbuf(, , );
		int log;
		int ret;
		strbuf err = new strbuf(, , );
		ModernizedCProgram.files_reflog_path(refs, sb_oldref, oldrefname);
		ModernizedCProgram.files_reflog_path(refs, sb_newref, newrefname);
		ModernizedCProgram.files_reflog_path(refs, tmp_renamed_log, "refs/.tmp-renamed-log");
		byte generatedBuf = sb_oldref.getBuf();
		log = !.lstat(generatedBuf, loginfo);
		Object generatedSt_mode = loginfo.getSt_mode();
		if (log && .S_ISLNK(generatedSt_mode)) {
			ret = ();
			;
		} 
		ref_store generatedBase = refs.getBase();
		if (!ModernizedCProgram.refs_resolve_ref_unsafe(generatedBase, oldrefname, -1024 | -1024, orig_oid, flag)) {
			ret = ();
			;
		} 
		if (flag & -1024) {
			if (copy) {
				ret = ();
			} else {
					ret = ();
			} 
			;
		} 
		if (!generatedBase.refs_rename_ref_available(oldrefname, newrefname)) {
			ret = 1;
			;
		} 
		if (!copy && log && .rename(generatedBuf, generatedBuf)) {
			ret = ();
			;
		} 
		if (copy && log && ModernizedCProgram.copy_file(generatedBuf, generatedBuf, 644)) {
			ret = ();
			;
		} 
		if (!copy && generatedBase.refs_delete_ref(logmsg, oldrefname, orig_oid, (1 << 0))) {
			();
			;
		} 
		if (!copy && !ModernizedCProgram.refs_read_ref_full(generatedBase, newrefname, -1024 | -1024, oid, ((Object)0)) && generatedBase.refs_delete_ref(((Object)0), newrefname, ((Object)0), (1 << 0))) {
			if ((._errno()) == 21) {
				strbuf path = new strbuf(, , );
				int result;
				ModernizedCProgram.files_ref_path(refs, ModernizedCProgram.path, newrefname);
				result = ModernizedCProgram.path.remove_empty_directories();
				ModernizedCProgram.path.strbuf_release();
				if (result) {
					();
					;
				} 
			} else {
					();
					;
			} 
		} 
		if (log && refs.rename_tmp_log(newrefname)) {
			;
		} 
		logmoved = log;
		ref_lock ref_lock = new ref_lock();
		lock = ref_lock.lock_ref_oid_basic(refs, newrefname, ((Object)0), ((Object)0), ((Object)0), (1 << 0), ((Object)0), err);
		if (!lock) {
			if (copy) {
				();
			} else {
					();
			} 
			err.strbuf_release();
			;
		} 
		object_id generatedOld_oid = lock.getOld_oid();
		generatedOld_oid.oidcpy(orig_oid);
		if (ModernizedCProgram.write_ref_to_lockfile(lock, orig_oid, err) || ModernizedCProgram.commit_ref_update(refs, lock, orig_oid, logmsg, err)) {
			();
			err.strbuf_release();
			;
		} 
		ret = 0;
		;
		if (!lock) {
			();
			err.strbuf_release();
			;
		} 
		flag = log_refs_config.log_all_ref_updates;
		log_refs_config.log_all_ref_updates = log_refs_config.LOG_REFS_NONE;
		if (ModernizedCProgram.write_ref_to_lockfile(lock, orig_oid, err) || ModernizedCProgram.commit_ref_update(refs, lock, orig_oid, ((Object)0), err)) {
			();
			err.strbuf_release();
		} 
		log_refs_config.log_all_ref_updates = flag;
		if (!logmoved && log && .rename(generatedBuf, generatedBuf)) {
			();
		} 
		ret = 1;
		sb_oldref.strbuf_release();
		tmp_renamed_log.strbuf_release();
		return ret;
	}
	public int files_rename_ref(Object oldrefname, Object newrefname, Object logmsg) {
		return ref_store.files_copy_or_rename_ref(oldrefname, newrefname, logmsg, 0);
	}
	public int files_copy_ref(Object oldrefname, Object newrefname, Object logmsg) {
		return ref_store.files_copy_or_rename_ref(oldrefname, newrefname, logmsg, 1);
	}
	public int files_create_symref(Object refname, Object target, Object logmsg) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 1), "create_symref");
		strbuf err = new strbuf(, , );
		ref_lock lock = new ref_lock();
		int ret;
		ref_lock ref_lock = new ref_lock();
		lock = ref_lock.lock_ref_oid_basic(refs, refname, ((Object)0), ((Object)0), ((Object)0), (1 << 0), ((Object)0), err);
		if (!lock) {
			();
			err.strbuf_release();
			return -1;
		} 
		ret = ModernizedCProgram.create_symref_locked(refs, lock, refname, target, logmsg);
		lock.unlock_ref();
		return ret;
	}
	public int files_reflog_exists(Object refname) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 0), "reflog_exists");
		strbuf sb = new strbuf(, , );
		stat st = new stat();
		int ret;
		ModernizedCProgram.files_reflog_path(refs, sb, refname);
		byte generatedBuf = sb.getBuf();
		Object generatedSt_mode = st.getSt_mode();
		ret = !.lstat(generatedBuf, st) && (((generatedSt_mode) & -1024) == -1024);
		sb.strbuf_release();
		return ret;
	}
	public int files_delete_reflog(Object refname) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 1), "delete_reflog");
		strbuf sb = new strbuf(, , );
		int ret;
		ModernizedCProgram.files_reflog_path(refs, sb, refname);
		byte generatedBuf = sb.getBuf();
		ret = ModernizedCProgram.remove_path(generatedBuf);
		sb.strbuf_release();
		return ret;
	}
	public int files_for_each_reflog_ent_reverse(Object refname, Object fn, Object cb_data) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 0), "for_each_reflog_ent_reverse");
		strbuf sb = new strbuf(, , );
		FILE logfp = new FILE();
		long pos;
		int ret = 0;
		int at_tail = 1;
		ModernizedCProgram.files_reflog_path(refs, sb, refname);
		byte generatedBuf = sb.getBuf();
		logfp = .fopen(generatedBuf, "r");
		sb.strbuf_release();
		if (!logfp) {
			return -1;
		} 
		if (.fseek(logfp, 0, 2) < /* Jump to the end */0) {
			ret = ();
		} 
		pos = .ftell(logfp);
		while (!ret && 0 < pos) {
			int cnt;
			size_t nread = new size_t();
			byte[] buf = new byte[512];
			byte endp;
			byte scanp;
			cnt = ( < pos) ?  : /* Fill next block from the end */pos;
			if (.fseek(logfp, pos - cnt, 0)) {
				ret = ();
				break;
			} 
			nread = .fread(ModernizedCProgram.buf, cnt, 1, logfp);
			if (nread != 1) {
				ret = ();
				break;
			} 
			pos -= cnt;
			scanp = endp = ModernizedCProgram.buf + cnt;
			if (at_tail && scanp[-1] == (byte)'\n') {
				/* Looking at the final LF at the end of the file */scanp--;
			} 
			at_tail = 0;
			while (ModernizedCProgram.buf < scanp/*
						 * terminating LF of the previous line, or the beginning
						 * of the buffer.
						 */) {
				byte bp;
				bp = ModernizedCProgram.find_beginning_of_line(ModernizedCProgram.buf, scanp);
				if (bp == (byte)'\n'/*
								 * The newline is the end of the previous line,
								 * so we know we have complete line starting
								 * at (bp + 1). Prefix it onto any prior data
								 * we collected for the line and process it.
								 */) {
					sb.strbuf_splice(0, 0, bp + 1, endp - (bp + 1));
					scanp = bp;
					endp = bp + 1;
					ret = sb.show_one_reflog_ent(fn, cb_data);
					sb.strbuf_setlen(0);
					if (ret) {
						break;
					} 
				}  else if (!pos/*
								 * We are at the start of the buffer, and the
								 * start of the file; there is no previous
								 * line, and we have everything for this one.
								 * Process it, and we can end the loop.
								 */) {
					sb.strbuf_splice(0, 0, ModernizedCProgram.buf, endp - ModernizedCProgram.buf);
					ret = sb.show_one_reflog_ent(fn, cb_data);
					sb.strbuf_setlen(0);
					break;
				} 
				if (bp == ModernizedCProgram.buf/*
								 * We are at the start of the buffer, and there
								 * is more file to read backwards. Which means
								 * we are in the middle of a line. Note that we
								 * may get here even if *bp was a newline; that
								 * just means we are at the exact end of the
								 * previous line, rather than some spot in the
								 * middle.
								 *
								 * Save away what we have to be combined with
								 * the data from the next read.
								 */) {
					sb.strbuf_splice(0, 0, ModernizedCProgram.buf, endp - ModernizedCProgram.buf);
					break;
				} 
			}
		}
		Object generatedLen = sb.getLen();
		if (!ret && generatedLen) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\files-backend.c", 2043, "reverse reflog parser had leftover data");
		} 
		.fclose(logfp);
		sb.strbuf_release();
		return ret;
	}
	public int files_for_each_reflog_ent(Object refname, Object fn, Object cb_data) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 0), "for_each_reflog_ent");
		FILE logfp = new FILE();
		strbuf sb = new strbuf(, , );
		int ret = 0;
		ModernizedCProgram.files_reflog_path(refs, sb, refname);
		byte generatedBuf = sb.getBuf();
		logfp = .fopen(generatedBuf, "r");
		sb.strbuf_release();
		if (!logfp) {
			return -1;
		} 
		while (!ret && !ModernizedCProgram.strbuf_getwholeline(sb, logfp, (byte)'\n')) {
			ret = sb.show_one_reflog_ent(fn, cb_data);
		}
		.fclose(logfp);
		sb.strbuf_release();
		return ret;
	}
	public int files_reflog_expire(Object refname, Object oid, int flags, Object prepare_fn, Object should_prune_fn, Object cleanup_fn, Object policy_cb_data) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 1), "reflog_expire");
		lock_file reflog_lock = new lock_file(((Object)0));
		expire_reflog_cb cb = new expire_reflog_cb();
		ref_lock lock = new ref_lock();
		strbuf log_file_sb = new strbuf(, , );
		byte log_file;
		int status = 0;
		int type;
		strbuf err = new strbuf(, , );
		.memset(cb, 0, );
		cb.setFlags(flags);
		cb.setPolicy_cb(policy_cb_data);
		cb.setShould_prune_fn(should_prune_fn/*
			 * The reflog file is locked by holding the lock on the
			 * reference itself, plus we might need to update the
			 * reference if --updateref was specified:
			 */);
		ref_lock ref_lock = new ref_lock();
		lock = ref_lock.lock_ref_oid_basic(refs, refname, oid, ((Object)0), ((Object)0), (1 << 0), type, err);
		if (!lock) {
			();
			err.strbuf_release();
			return -1;
		} 
		if (!ref_store.refs_reflog_exists(refname)) {
			lock.unlock_ref();
			return 0;
		} 
		ModernizedCProgram.files_reflog_path(refs, log_file_sb, refname);
		log_file = log_file_sb.strbuf_detach(((Object)0));
		_iobuf generatedNewlog = cb.getNewlog();
		if (!(flags & expire_reflog_flags.EXPIRE_REFLOGS_DRY_RUN/*
				 * Even though holding $GIT_DIR/logs/$reflog.lock has
				 * no locking implications, we use the lock_file
				 * machinery here anyway because it does a lot of the
				 * work we need, including cleaning up if the program
				 * exits unexpectedly.
				 */)) {
			if (reflog_lock.hold_lock_file_for_update(log_file, 0) < 0) {
				strbuf err = new strbuf(, , );
				err.unable_to_lock_message(log_file, (._errno()));
				();
				err.strbuf_release();
				;
			} 
			cb.setNewlog(reflog_lock.fdopen_lock_file("w"));
			if (!generatedNewlog) {
				();
				;
			} 
		} 
		Object generatedPolicy_cb = cb.getPolicy_cb();
		.UNRECOGNIZEDFUNCTIONNAME(refname, oid, generatedPolicy_cb);
		ref_store.refs_for_each_reflog_ent(refname, expire_reflog_ent, cb);
		.UNRECOGNIZEDFUNCTIONNAME(generatedPolicy_cb);
		object_id generatedLast_kept_oid = cb.getLast_kept_oid();
		lock_file generatedLk = lock.getLk();
		if (!(flags & expire_reflog_flags.EXPIRE_REFLOGS_DRY_RUN/*
				 * It doesn't make sense to adjust a reference pointed
				 * to by a symbolic ref based on expiring entries in
				 * the symbolic reference's reflog. Nor can we update
				 * a reference if there are no remaining reflog
				 * entries.
				 */)) {
			int update = (flags & expire_reflog_flags.EXPIRE_REFLOGS_UPDATE_REF) && !(type & -1024) && !ModernizedCProgram.is_null_oid(generatedLast_kept_oid);
			if (reflog_lock.close_lock_file_gently()) {
				status |=  ();
				reflog_lock.rollback_lock_file();
			}  else if (update && (ModernizedCProgram.write_in_full(generatedLk.get_lock_file_fd(), ModernizedCProgram.oid_to_hex(generatedLast_kept_oid), ModernizedCProgram.the_repository.getHash_algo().getHexsz()) < 0 || ModernizedCProgram.write_str_in_full(generatedLk.get_lock_file_fd(), "\n") < 0 || lock.close_ref_gently() < 0)) {
				status |=  ();
				reflog_lock.rollback_lock_file();
			}  else if (reflog_lock.commit_lock_file()) {
				status |=  ();
			}  else if (update && lock.commit_ref()) {
				status |=  ();
			} 
		} 
		ModernizedCProgram.free(log_file);
		lock.unlock_ref();
		return status;
		ModernizedCProgram.free(log_file);
		lock.unlock_ref();
		return -1;
	}
	public ref_store packed_ref_store_create(Object path, int store_flags) {
		packed_ref_store refs = ModernizedCProgram.xcalloc(1, );
		ref_store ref_store = (ref_store)refs;
		ref_store.base_ref_store_init(ModernizedCProgram.refs_be_packed);
		refs.setStore_flags(store_flags);
		refs.setPath(ModernizedCProgram.xstrdup(path));
		Byte generatedPath = refs.getPath();
		ModernizedCProgram.chdir_notify_reparent("packed-refs", generatedPath);
		return ref_store/*
		 * Downcast `ref_store` to `packed_ref_store`. Die if `ref_store` is
		 * not a `packed_ref_store`. Also die if `packed_ref_store` doesn't
		 * support at least the flags specified in `required_flags`. `caller`
		 * is used in any necessary error messages.
		 */;
	}
	public void packed_refs_unlock() {
		packed_ref_store packed_ref_store = new packed_ref_store();
		packed_ref_store refs = packed_ref_store.packed_downcast(ref_store, (1 << 0) | (1 << 1), "packed_refs_unlock");
		lock_file generatedLock = refs.getLock();
		if (!generatedLock.is_lock_file_locked()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 1049, "packed_refs_unlock() called when not locked");
		} 
		generatedLock.rollback_lock_file();
	}
	public int packed_refs_is_locked() {
		packed_ref_store packed_ref_store = new packed_ref_store();
		packed_ref_store refs = packed_ref_store.packed_downcast(ref_store, (1 << 0) | (1 << 1), "packed_refs_is_locked");
		lock_file generatedLock = refs.getLock();
		return generatedLock.is_lock_file_locked();
	}
	public int packed_pack_refs(int flags) {
		return 0;
	}
	/*
		 * Packed refs are already packed. It might be that loose refs
		 * are packed *into* a packed refs store, but that is done by
		 * updating the packed references via a transaction.
		 */
	public int packed_create_symref(Object refname, Object target, Object logmsg) {
		ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 1576, "packed reference store does not support symrefs");
	}
	public int packed_rename_ref(Object oldrefname, Object newrefname, Object logmsg) {
		ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 1583, "packed reference store does not support renaming references");
	}
	public int packed_copy_ref(Object oldrefname, Object newrefname, Object logmsg) {
		ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\packed-backend.c", 1590, "packed reference store does not support copying references");
	}
	public int packed_for_each_reflog_ent(Object refname, Object fn, Object cb_data) {
		return 0;
	}
	public int packed_for_each_reflog_ent_reverse(Object refname, Object fn, Object cb_data) {
		return 0;
	}
	public int packed_reflog_exists(Object refname) {
		return 0;
	}
	public int packed_delete_reflog(Object refname) {
		return 0;
	}
	public int packed_reflog_expire(Object refname, Object oid, int flags, Object prepare_fn, Object should_prune_fn, Object cleanup_fn, Object policy_cb_data) {
		return 0;
	}
	public int for_each_bisect_ref(Object fn, Object cb_data, Object term) {
		strbuf bisect_refs = new strbuf(, , );
		int status;
		bisect_refs.strbuf_addf("refs/bisect/%s", term);
		byte generatedBuf = bisect_refs.getBuf();
		status = refs.refs_for_each_fullref_in(generatedBuf, fn, cb_data, 0);
		bisect_refs.strbuf_release();
		return status;
	}
	public int for_each_bad_bisect_ref(Object fn, Object cb_data) {
		return refs.for_each_bisect_ref(fn, cb_data, ModernizedCProgram.term_bad);
	}
	public int for_each_good_bisect_ref(Object fn, Object cb_data) {
		return refs.for_each_bisect_ref(fn, cb_data, ModernizedCProgram.term_good);
	}
	public Object get_store(Object argv) {
		byte gitdir;
		ref_store ref_store = new ref_store();
		byte generatedBuf = sb.getBuf();
		ref_store ref_store = new ref_store();
		Byte generatedId = wt.getId();
		ref_store ref_store = new ref_store();
		if (!argv[0]) {
			ModernizedCProgram.die("ref store required");
		}  else if (!.strcmp(argv[0], "main")) {
			refs = ref_store.get_main_ref_store(ModernizedCProgram.the_repository);
		}  else if (ModernizedCProgram.skip_prefix(argv[0], "submodule:", gitdir)) {
			strbuf sb = new strbuf(, , );
			int ret;
			ret = sb.strbuf_git_path_submodule(gitdir, "objects/");
			if (ret) {
				ModernizedCProgram.die("strbuf_git_path_submodule failed: %d", ret);
			} 
			ModernizedCProgram.add_to_alternates_memory(generatedBuf);
			sb.strbuf_release();
			refs = ref_store.get_submodule_ref_store(gitdir);
		}  else if (ModernizedCProgram.skip_prefix(argv[0], "worktree:", gitdir)) {
			worktree p = new worktree();
			worktree worktrees = .get_worktrees(0);
			for (p = worktrees; p; p++) {
				worktree wt = p;
				if (!generatedId) {
					if (!.strcmp(gitdir, /* special case for main worktree */"main")) {
						break;
					} 
				}  else if (!.strcmp(gitdir, generatedId)) {
					break;
				} 
			}
			if (!p) {
				ModernizedCProgram.die("no such worktree: %s", gitdir);
			} 
			refs = ref_store.get_worktree_ref_store(p);
		} else {
				ModernizedCProgram.die("unknown backend %s", argv[0]);
		} 
		if (!refs) {
			ModernizedCProgram.die("no ref store");
		} 
		return argv + /* consume store-specific optional arguments if needed */1;
	}
	public int cmd_peel_ref(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		object_id oid = new object_id();
		int ret;
		ret = ModernizedCProgram.refs_peel_ref(refs, refname, oid);
		if (!ret) {
			.puts(ModernizedCProgram.oid_to_hex(oid));
		} 
		return ret;
	}
	public int cmd_create_symref(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		byte target = ModernizedCProgram.notnull(argv++, "target");
		byte logmsg = argv++;
		return refs.refs_create_symref(refname, target, logmsg);
	}
	public int cmd_delete_refs(Object argv) {
		int flags = ModernizedCProgram.arg_flags(argv++, "flags");
		byte msg = argv++;
		string_list refnames = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		while (argv) {
			refnames.string_list_append(argv++);
		}
		return ModernizedCProgram.refs_delete_refs(refs, msg, refnames, flags);
	}
	public int cmd_rename_ref(Object argv) {
		byte oldref = ModernizedCProgram.notnull(argv++, "oldref");
		byte newref = ModernizedCProgram.notnull(argv++, "newref");
		byte logmsg = argv++;
		return refs.refs_rename_ref(oldref, newref, logmsg);
	}
	public int cmd_resolve_ref(Object argv) {
		object_id oid = new object_id();
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		int resolve_flags = ModernizedCProgram.arg_flags(argv++, "resolve-flags");
		int flags;
		byte ref;
		ref = ModernizedCProgram.refs_resolve_ref_unsafe(refs, refname, resolve_flags, oid, flags);
		.printf("%s %s 0x%x\n", ModernizedCProgram.oid_to_hex(oid), ref ? ref : "(null)", flags);
		return ref ? 0 : 1;
	}
	public int cmd_verify_ref(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		strbuf err = new strbuf(, , );
		int ret;
		ret = ModernizedCProgram.refs_verify_refname_available(refs, refname, ((Object)0), ((Object)0), err);
		Object generatedLen = err.getLen();
		byte generatedBuf = err.getBuf();
		if (generatedLen) {
			.puts(generatedBuf);
		} 
		return ret;
	}
	public int cmd_for_each_reflog(Object argv) {
		return refs.refs_for_each_reflog(each_ref, ((Object)0));
	}
	public int cmd_for_each_reflog_ent(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		return refs.refs_for_each_reflog_ent(refname, each_reflog, refs);
	}
	public int cmd_for_each_reflog_ent_reverse(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		return refs.refs_for_each_reflog_ent_reverse(refname, each_reflog, refs);
	}
	public int cmd_create_reflog(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		int force_create = ModernizedCProgram.arg_flags(argv++, "force-create");
		strbuf err = new strbuf(, , );
		int ret;
		ret = ModernizedCProgram.refs_create_reflog(refs, refname, force_create, err);
		Object generatedLen = err.getLen();
		byte generatedBuf = err.getBuf();
		if (generatedLen) {
			.puts(generatedBuf);
		} 
		return ret;
	}
	public int cmd_delete_reflog(Object argv) {
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		return refs.refs_delete_reflog(refname);
	}
	public int cmd_delete_ref(Object argv) {
		byte msg = ModernizedCProgram.notnull(argv++, "msg");
		byte refname = ModernizedCProgram.notnull(argv++, "refname");
		byte sha1_buf = ModernizedCProgram.notnull(argv++, "old-sha1");
		int flags = ModernizedCProgram.arg_flags(argv++, "flags");
		object_id old_oid = new object_id();
		if (old_oid.get_oid_hex(sha1_buf)) {
			ModernizedCProgram.die("not sha-1");
		} 
		return refs.refs_delete_ref(msg, refname, old_oid, flags);
	}
	public int refs_ref_exists(Object refname) {
		return !!ModernizedCProgram.refs_resolve_ref_unsafe(refs, refname, -1024, ((Object)0), ((Object)0));
	}
	public int refs_for_each_tag_ref(Object fn, Object cb_data) {
		return refs.refs_for_each_ref_in("refs/tags/", fn, cb_data);
	}
	public int refs_for_each_branch_ref(Object fn, Object cb_data) {
		return refs.refs_for_each_ref_in("refs/heads/", fn, cb_data);
	}
	public int refs_for_each_remote_ref(Object fn, Object cb_data) {
		return refs.refs_for_each_ref_in("refs/remotes/", fn, cb_data);
	}
	public int refs_delete_ref(Object msg, Object refname, Object old_oid, int flags) {
		ref_transaction transaction = new ref_transaction();
		strbuf err = new strbuf(, , );
		ref_store ref_store = new ref_store();
		if (ModernizedCProgram.ref_type(refname) == ref_type.REF_TYPE_PSEUDOREF) {
			((refs == ref_store.get_main_ref_store(ModernizedCProgram.the_repository)) ? (Object)0 : ._assert("refs == get_main_ref_store(the_repository)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 891));
			return ModernizedCProgram.delete_pseudoref(refname, old_oid);
		} 
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_store_transaction_begin(refs, err);
		if (!transaction || ModernizedCProgram.ref_transaction_delete(transaction, refname, old_oid, flags, msg, err) || ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			();
			transaction.ref_transaction_free();
			err.strbuf_release();
			return 1;
		} 
		transaction.ref_transaction_free();
		err.strbuf_release();
		return 0;
	}
	public int refs_update_ref(Object msg, Object refname, Object new_oid, Object old_oid, int flags, action_on_err onerr) {
		ref_transaction t = ((Object)0);
		strbuf err = new strbuf(, , );
		int ret = 0;
		ref_store ref_store = new ref_store();
		ref_transaction ref_transaction = new ref_transaction();
		if (ModernizedCProgram.ref_type(refname) == ref_type.REF_TYPE_PSEUDOREF) {
			((refs == ref_store.get_main_ref_store(ModernizedCProgram.the_repository)) ? (Object)0 : ._assert("refs == get_main_ref_store(the_repository)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1218));
			ret = err.write_pseudoref(refname, new_oid, old_oid);
		} else {
				t = ref_transaction.ref_store_transaction_begin(refs, err);
				if (!t || ModernizedCProgram.ref_transaction_update(t, refname, new_oid, old_oid, flags, msg, err) || ModernizedCProgram.ref_transaction_commit(t, err)) {
					ret = 1;
					t.ref_transaction_free();
				} 
		} 
		byte generatedBuf = err.getBuf();
		if (ret) {
			byte str = ModernizedCProgram._("update_ref failed for ref '%s': %s");
			switch (action_on_err.onerr) {
			case action_on_err.UPDATE_REFS_MSG_ON_ERR:
					();
					break;
			case action_on_err.UPDATE_REFS_QUIET_ON_ERR:
					break;
			case action_on_err.UPDATE_REFS_DIE_ON_ERR:
					ModernizedCProgram.die(str, refname, generatedBuf);
					break;
			}
			err.strbuf_release();
			return 1;
		} 
		err.strbuf_release();
		if (t) {
			t.ref_transaction_free();
		} 
		return 0;
	}
	public Byte refs_shorten_unambiguous_ref(Object refname, int strict) {
		int i;
		byte scanf_fmts;
		int nr_rules;
		byte short_name;
		strbuf resolved_buf = new strbuf(, , );
		if (!nr_rules/*
				 * Pre-generate scanf formats from ref_rev_parse_rules[].
				 * Generate a format suitable for scanf from a
				 * ref_rev_parse_rules rule by interpolating "%s" at the
				 * location of the "%.*s".
				 */) {
			size_t total_len = 0;
			size_t offset = 0;
			for (nr_rules = 0; ModernizedCProgram.ref_rev_parse_rules[nr_rules]; /* the rule list is NULL terminated, count them first */nr_rules++) {
				total_len += .strlen(ModernizedCProgram.ref_rev_parse_rules[nr_rules]) - 2 + /* -2 for strlen("%.*s") - strlen("%s"); +1 for NUL */1;
			}
			scanf_fmts = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(ModernizedCProgram.st_mult(, nr_rules), total_len));
			ModernizedCProgram.offset = 0;
			for (i = 0; i < nr_rules; i++) {
				((ModernizedCProgram.offset < total_len) ? (Object)0 : ._assert("offset < total_len", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1289));
				scanf_fmts[i] = (byte)scanf_fmts[nr_rules] + ModernizedCProgram.offset;
				ModernizedCProgram.offset += ModernizedCProgram.xsnprintf(scanf_fmts[i], total_len - ModernizedCProgram.offset, ModernizedCProgram.ref_rev_parse_rules[i], 2, "%s") + 1;
			}
		} 
		if (!/* bail out if there are no rules */nr_rules) {
			return ModernizedCProgram.xstrdup(refname);
		} 
		short_name = ModernizedCProgram.xstrdup(/* buffer for scanf result, at most refname must fit */refname);
		byte generatedBuf = resolved_buf.getBuf();
		for (i = nr_rules - 1; i > 0; --/* skip first rule, it will always match */i) {
			int j;
			int rules_to_fail = i;
			int short_name_len;
			if (1 != .sscanf(refname, scanf_fmts[i], short_name)) {
				continue;
			} 
			short_name_len = .strlen(short_name/*
					 * in strict mode, all (except the matched one) rules
					 * must fail to resolve to a valid non-ambiguous ref
					 */);
			if (strict) {
				rules_to_fail = nr_rules/*
						 * check if the short name resolves to a valid ref,
						 * but use only rules prior to the matched one
						 */;
			} 
			for (j = 0; j < rules_to_fail; j++) {
				byte rule = ModernizedCProgram.ref_rev_parse_rules[j];
				if (i == /* skip matched rule */j) {
					continue;
				} 
				resolved_buf.strbuf_setlen(0);
				resolved_buf.strbuf_addf(rule, short_name_len, short_name);
				if (refs.refs_ref_exists(generatedBuf)) {
					break;
				} 
			}
			if (j == rules_to_fail) {
				resolved_buf.strbuf_release();
				return short_name;
			} 
		}
		resolved_buf.strbuf_release();
		ModernizedCProgram.free(short_name);
		return ModernizedCProgram.xstrdup(refname);
	}
	public int refs_rename_ref_available(Object old_refname, Object new_refname) {
		string_list skip = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		strbuf err = new strbuf(, , );
		int ok;
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_insert(skip, old_refname);
		ok = !ModernizedCProgram.refs_verify_refname_available(refs, new_refname, ((Object)0), skip, err);
		if (!ok) {
			();
		} 
		skip.string_list_clear(0);
		err.strbuf_release();
		return ok;
	}
	public int refs_head_ref(Object fn, Object cb_data) {
		object_id oid = new object_id();
		int flag;
		if (!ModernizedCProgram.refs_read_ref_full(refs, "HEAD", -1024, oid, flag)) {
			return .fn("HEAD", oid, flag, cb_data);
		} 
		return 0;
	}
	public int do_for_each_ref(Object prefix, Object fn, int trim, int flags, Object cb_data) {
		ref_iterator iter = new ref_iterator();
		do_for_each_ref_help hp = new do_for_each_ref_help(fn, cb_data);
		if (!refs) {
			return 0;
		} 
		ref_iterator ref_iterator = new ref_iterator();
		iter = ref_iterator.refs_ref_iterator_begin(refs, prefix, trim, flags);
		return ModernizedCProgram.do_for_each_repo_ref_iterator(ModernizedCProgram.the_repository, iter, do_for_each_ref_helper, hp);
	}
	public int refs_for_each_ref(Object fn, Object cb_data) {
		return refs.do_for_each_ref("", fn, 0, 0, cb_data);
	}
	public int refs_for_each_ref_in(Object prefix, Object fn, Object cb_data) {
		return refs.do_for_each_ref(prefix, fn, .strlen(prefix), 0, cb_data);
	}
	public int refs_for_each_fullref_in(Object prefix, Object fn, Object cb_data, int broken) {
		int flag = 0;
		if (broken) {
			flag = DO_FOR_EACH_INCLUDE_BROKEN;
		} 
		return refs.do_for_each_ref(prefix, fn, 0, flag, cb_data);
	}
	public int refs_for_each_rawref(Object fn, Object cb_data) {
		return refs.do_for_each_ref("", fn, 0, DO_FOR_EACH_INCLUDE_BROKEN, cb_data);
	}
	public ref_store lookup_ref_store_map(hashmap map, Object name) {
		ref_store_hash_entry entry = new ref_store_hash_entry();
		int hash;
		int generatedTablesize = map.getTablesize();
		if (!generatedTablesize) {
			return ((Object)/* It's initialized on demand in register_ref_store(). */0);
		} 
		hash = ModernizedCProgram.strhash(name);
		hashmap_entry hashmap_entry = new hashmap_entry();
		entry = (ref_store_hash_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(map, hash, name), ((size_t)((ref_store_hash_entry)0).getEnt()));
		ref_store generatedRefs = entry.getRefs();
		return entry ? generatedRefs : ((Object)0/*
		 * Create, record, and return a ref_store instance for the specified
		 * gitdir.
		 */);
	}
	public ref_store ref_store_init(Object gitdir, int flags) {
		byte be_name = "files";
		ref_storage_be ref_storage_be = new ref_storage_be();
		ref_storage_be be = ref_storage_be.find_ref_storage_backend(be_name);
		ref_store refs = new ref_store();
		if (!be) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1847, "reference backend %s is unknown", be_name);
		} 
		refs = .UNRECOGNIZEDFUNCTIONNAME(gitdir, flags);
		return refs;
	}
	public ref_store get_main_ref_store(repository r) {
		ref_store generatedRefs = r.getRefs();
		if (generatedRefs) {
			return generatedRefs;
		} 
		Byte generatedGitdir = r.getGitdir();
		if (!generatedGitdir) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1859, "attempting to get main_ref_store outside of repository");
		} 
		ref_store ref_store = new ref_store();
		r.setRefs(ref_store.ref_store_init(generatedGitdir, REF_STORE_ALL_CAPS));
		return generatedRefs;
	}
	public ref_store get_submodule_ref_store(Object submodule) {
		strbuf submodule_sb = new strbuf(, , );
		ref_store refs = new ref_store();
		byte to_free = ((Object)0);
		size_t len = new size_t();
		if (!submodule) {
			return ((Object)0);
		} 
		len = .strlen(submodule);
		while (len && ModernizedCProgram.git_is_dir_sep(submodule[len - 1])) {
			len--;
		}
		if (!len) {
			return ((Object)0);
		} 
		if (submodule[len]) {
			submodule = to_free = ModernizedCProgram.xmemdupz(submodule, /* We need to strip off one or more trailing slashes */len);
		} 
		ref_store ref_store = new ref_store();
		refs = ref_store.lookup_ref_store_map(ModernizedCProgram.submodule_ref_stores, submodule);
		if (refs) {
			;
		} 
		submodule_sb.strbuf_addstr(submodule);
		if (!submodule_sb.is_nonbare_repository_dir()) {
			;
		} 
		if (submodule_sb.submodule_to_gitdir(submodule)) {
			;
		} 
		byte generatedBuf = submodule_sb.getBuf();
		ref_store ref_store = new ref_store();
		refs = ref_store.ref_store_init(generatedBuf, REF_STORE_READ | REF_STORE_ODB);
		ModernizedCProgram.register_ref_store_map(ModernizedCProgram.submodule_ref_stores, "submodule", refs, submodule);
		ModernizedCProgram.free(to_free);
		return refs;
	}
	public ref_store get_worktree_ref_store(Object wt) {
		ref_store refs = new ref_store();
		byte id;
		ref_store ref_store = new ref_store();
		if (wt.getIs_current()) {
			return ref_store.get_main_ref_store(ModernizedCProgram.the_repository);
		} 
		id = wt.getId() ? wt.getId() : "/";
		ref_store ref_store = new ref_store();
		refs = ref_store.lookup_ref_store_map(ModernizedCProgram.worktree_ref_stores, id);
		if (refs) {
			return refs;
		} 
		ref_store ref_store = new ref_store();
		if (wt.getId()) {
			refs = ref_store.ref_store_init(ModernizedCProgram.git_common_path("worktrees/%s", wt.getId()), REF_STORE_ALL_CAPS);
		} else {
				refs = ref_store.ref_store_init(ModernizedCProgram.get_git_common_dir(), REF_STORE_ALL_CAPS);
		} 
		if (refs) {
			ModernizedCProgram.register_ref_store_map(ModernizedCProgram.worktree_ref_stores, "worktree", refs, id);
		} 
		return refs;
	}
	public void base_ref_store_init(Object be) {
		this.setRef_store(be);
	}
	/* backend functions */
	public int refs_pack_refs(int flags) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, flags);
	}
	public int refs_create_symref(Object ref_target, Object refs_heads_master, Object logmsg) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, ref_target, refs_heads_master, logmsg);
	}
	public int refs_for_each_reflog(Object fn, Object cb_data) {
		ref_iterator iter = new ref_iterator();
		do_for_each_ref_help hp = new do_for_each_ref_help(fn, cb_data);
		iter = .UNRECOGNIZEDFUNCTIONNAME(refs);
		return ModernizedCProgram.do_for_each_repo_ref_iterator(ModernizedCProgram.the_repository, iter, do_for_each_ref_helper, hp);
	}
	public int refs_for_each_reflog_ent_reverse(Object refname, Object fn, Object cb_data) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, refname, fn, cb_data);
	}
	public int refs_for_each_reflog_ent(Object refname, Object fn, Object cb_data) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, refname, fn, cb_data);
	}
	public int refs_reflog_exists(Object refname) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, refname);
	}
	public int refs_delete_reflog(Object refname) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, refname);
	}
	public int refs_reflog_expire(Object refname, Object oid, int flags, Object prepare_fn, Object should_prune_fn, Object cleanup_fn, Object policy_cb_data) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, refname, oid, flags, prepare_fn, should_prune_fn, cleanup_fn, policy_cb_data);
	}
	public int refs_rename_ref(Object oldref, Object newref, Object logmsg) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, oldref, newref, logmsg);
	}
	public int refs_copy_existing_ref(Object oldref, Object newref, Object logmsg) {
		return .UNRECOGNIZEDFUNCTIONNAME(refs, oldref, newref, logmsg);
	}
	public Object getBe() {
		return be;
	}
	public void setBe(Object newBe) {
		be = newBe;
	}
}
/*
 * A callback function used to instruct merge_ref_iterator how to
 * interleave the entries from iter0 and iter1. The function should
 * return one of the constants defined in enum iterator_selection. It
 * must not advance either of the iterators itself.
 *
 * The function must be prepared to handle the case that iter0 and/or
 * iter1 is NULL, which indicates that the corresponding sub-iterator
 * has been exhausted. Its return value must be consistent with the
 * current states of the iterators; e.g., it must not return
 * ITER_SKIP_1 if iter1 has already been exhausted.
 */
/* refs backends */
/* ref_store_init flags */
/* can perform update operations */
/* has access to object database */
/*
 * Iterate over the references in `ref_store` whose names start with
 * `prefix`. `prefix` is matched as a literal string, without regard
 * for path separators. If prefix is NULL or the empty string, iterate
 * over all references in `ref_store`. The output is ordered by
 * refname.
 */
/* reflog functions */
/* The backend describing this ref_store's storage scheme: */
