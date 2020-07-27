package application;

/*
 * This backend uses the following flags in `ref_update::flags` for
 * internal bookkeeping purposes. Their numerical values must not
 * conflict with REF_NO_DEREF, REF_FORCE_CREATE_REFLOG, REF_HAVE_NEW,
 * REF_HAVE_OLD, or REF_IS_PRUNING, which are also stored in
 * `ref_update::flags`.
 */
/*
 * Used as a flag in ref_update::flags when a loose ref is being
 * pruned. This flag must only be used when REF_NO_DEREF is set.
 */
/*
 * Flag passed to lock_ref_sha1_basic() telling it to tolerate broken
 * refs (i.e., because the reference is about to be deleted anyway).
 */
/*
 * Used as a flag in ref_update::flags when the lockfile needs to be
 * committed.
 */
/*
 * Used as a flag in ref_update::flags when we want to log a ref
 * update but not actually perform it.  This is used when a symbolic
 * ref update is split up.
 */
/*
 * Used as a flag in ref_update::flags when the ref_update was via an
 * update to HEAD.
 */
/*
 * Used as a flag in ref_update::flags when the loose reference has
 * been deleted.
 */
public class ref_lock {
	private Byte ref_name;
	private lock_file lk;
	private object_id old_oid;
	
	public ref_lock(Byte ref_name, lock_file lk, object_id old_oid) {
		setRef_name(ref_name);
		setLk(lk);
		setOld_oid(old_oid);
	}
	public ref_lock() {
	}
	
	public void unlock_ref() {
		lock_file generatedLk = this.getLk();
		generatedLk.rollback_lock_file();
		Byte generatedRef_name = this.getRef_name();
		ModernizedCProgram.free(generatedRef_name);
		ModernizedCProgram.free(lock/*
		 * Lock refname, without following symrefs, and set *lock_p to point
		 * at a newly-allocated lock object. Fill in lock->old_oid, referent,
		 * and type similarly to read_raw_ref().
		 *
		 * The caller must verify that refname is a "safe" reference name (in
		 * the sense of refname_is_safe()) before calling this function.
		 *
		 * If the reference doesn't already exist, verify that refname doesn't
		 * have a D/F conflict with any existing references. extras and skip
		 * are passed to refs_verify_refname_available() for this check.
		 *
		 * If mustexist is not set and the reference is not found or is
		 * broken, lock the reference anyway but clear old_oid.
		 *
		 * Return 0 on success. On failure, write an error message to err and
		 * return TRANSACTION_NAME_CONFLICT or TRANSACTION_GENERIC_ERROR.
		 *
		 * Implementation note: This function is basically
		 *
		 *     lock reference
		 *     read_raw_ref()
		 *
		 * but it includes a lot more code to
		 * - Deal with possible races with other processes
		 * - Avoid calling refs_verify_refname_available() when it can be
		 *   avoided, namely if we were successfully able to read the ref
		 * - Generate informative error messages in the case of failure
		 */);
	}
	public ref_lock lock_ref_oid_basic(files_ref_store refs, Object refname, Object old_oid, Object extras, Object skip, int flags, Integer type, strbuf err) {
		strbuf ref_file = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ref_lock lock = new ref_lock();
		int last_errno = 0;
		int mustexist = (old_oid && !ModernizedCProgram.is_null_oid(old_oid));
		int resolve_flags = -1024;
		int resolved;
		refs.files_assert_main_repository("lock_ref_oid_basic");
		((err) ? (Object)0 : /*Error: Function owner not recognized*/_assert("err", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\files-backend.c", 937));
		lock = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		if (mustexist) {
			resolve_flags |=  -1024;
		} 
		if (flags & (1 << 5)) {
			resolve_flags |=  -1024;
		} 
		ModernizedCProgram.files_ref_path(refs, ref_file, refname);
		ref_store generatedBase = refs.getBase();
		object_id generatedOld_oid = lock.getOld_oid();
		resolved = !!ModernizedCProgram.refs_resolve_ref_unsafe(generatedBase, refname, resolve_flags, generatedOld_oid, type);
		if (!resolved && (/*Error: Function owner not recognized*/_errno()) == 21/*
				 * we are trying to lock foo but we used to
				 * have foo/bar which now does not exist;
				 * it is normal for the empty directory 'foo'
				 * to remain.
				 */) {
			if (ref_file.remove_empty_directories()) {
				last_errno = (/*Error: Function owner not recognized*/_errno());
				if (!ModernizedCProgram.refs_verify_refname_available(generatedBase, refname, extras, skip, err)) {
					err.strbuf_addf("there are still refs under '%s'", refname);
				} 
				;
			} 
			resolved = !!ModernizedCProgram.refs_resolve_ref_unsafe(generatedBase, refname, resolve_flags, generatedOld_oid, type);
		} 
		if (!resolved) {
			last_errno = (/*Error: Function owner not recognized*/_errno());
			if (last_errno != 20 || !ModernizedCProgram.refs_verify_refname_available(generatedBase, refname, extras, skip, err)) {
				err.strbuf_addf("unable to resolve reference '%s': %s", refname, /*Error: Function owner not recognized*/strerror(last_errno));
			} 
			;
		} 
		ref_store generatedPacked_ref_store = refs.getPacked_ref_store();
		if (ModernizedCProgram.is_null_oid(generatedOld_oid) && ModernizedCProgram.refs_verify_refname_available(generatedPacked_ref_store, refname, extras, skip, err)) {
			last_errno = 20;
			;
		} 
		lock.setRef_name(ModernizedCProgram.xstrdup(refname));
		byte[] generatedBuf = ref_file.getBuf();
		lock_file generatedLk = lock.getLk();
		if (ModernizedCProgram.raceproof_create_file(generatedBuf, create_reflock, generatedLk)) {
			last_errno = (/*Error: Function owner not recognized*/_errno());
			err.unable_to_lock_message(generatedBuf, (/*Error: Function owner not recognized*/_errno()));
			;
		} 
		if (ModernizedCProgram.verify_lock(generatedBase, lock, old_oid, mustexist, err)) {
			last_errno = (/*Error: Function owner not recognized*/_errno());
			;
		} 
		;
		lock = ((Object)0);
		(/*Error: Function owner not recognized*/_errno()) = last_errno;
		return lock;
	}
	public int close_ref_gently() {
		lock_file generatedLk = this.getLk();
		if (generatedLk.close_lock_file_gently()) {
			return -1;
		} 
		return 0;
	}
	public int commit_ref() {
		lock_file generatedLk = this.getLk();
		byte path = generatedLk.get_locked_file_path();
		stat st = new stat();
		Object generatedSt_mode = st.getSt_mode();
		if (!/*Error: Function owner not recognized*/lstat(path, st) && (((generatedSt_mode) & -1024) == -1024/*
				 * There is a directory at the path we want to rename
				 * the lockfile to. Hopefully it is empty; try to
				 * delete it.
				 */)) {
			size_t len = /*Error: Function owner not recognized*/strlen(path);
			strbuf sb_path = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			sb_path.strbuf_attach(path, ModernizedCProgram.len, ModernizedCProgram.len/*
					 * If this fails, commit_lock_file() will also fail
					 * and will report the problem.
					 */);
			sb_path.remove_empty_directories();
			sb_path.strbuf_release();
		} else {
				ModernizedCProgram.free(path);
		} 
		if (generatedLk.commit_lock_file()) {
			return -1;
		} 
		return 0;
	}
	public int create_ref_symlink(Object target) {
		int ret = -1;
		lock_file generatedLk = this.getLk();
		byte ref_path = generatedLk.get_locked_file_path();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ref_path);
		ret = ModernizedCProgram.symlink(target, ref_path);
		ModernizedCProgram.free(ref_path);
		if (ret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "no symlink - falling back to symbolic ref\n");
		} 
		return ret;
	}
	public Byte getRef_name() {
		return ref_name;
	}
	public void setRef_name(Byte newRef_name) {
		ref_name = newRef_name;
	}
	public lock_file getLk() {
		return lk;
	}
	public void setLk(lock_file newLk) {
		lk = newLk;
	}
	public object_id getOld_oid() {
		return old_oid;
	}
	public void setOld_oid(object_id newOld_oid) {
		old_oid = newOld_oid;
	}
}
