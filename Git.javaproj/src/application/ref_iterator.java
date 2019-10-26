package application;

/*
 * Iterate over the references in the specified ref_store that have a
 * reflog. The refs are iterated over in arbitrary order.
 */
public class ref_iterator {
	private ref_iterator_vtable vtable;
	private int ordered;
	private Object refname;
	private Object oid;
	private int flags;
	
	public ref_iterator(ref_iterator_vtable vtable, int ordered, Object refname, Object oid, int flags) {
		setVtable(vtable);
		setOrdered(ordered);
		setRefname(refname);
		setOid(oid);
		setFlags(flags);
	}
	public ref_iterator() {
	}
	
	public int files_ref_iterator_advance() {
		files_ref_iterator iter = (files_ref_iterator)ref_iterator;
		int ok;
		ref_iterator generatedIter0 = iter.getIter0();
		int generatedFlags = iter.getFlags();
		Object generatedRefname = generatedIter0.getRefname();
		Object generatedOid = generatedIter0.getOid();
		ref_iterator generatedBase = iter.getBase();
		while ((ok = ModernizedCProgram.ref_iterator_advance(generatedIter0)) == 0) {
			if (generatedFlags & -1024 && ModernizedCProgram.ref_type(generatedRefname) != ref_type.REF_TYPE_PER_WORKTREE) {
				continue;
			} 
			if (!(generatedFlags & -1024) && !ModernizedCProgram.ref_resolves_to_object(generatedRefname, generatedOid, generatedFlags)) {
				continue;
			} 
			generatedBase.setRefname(generatedRefname);
			generatedBase.setOid(generatedOid);
			generatedBase.setFlags(generatedFlags);
			return 0;
		}
		iter.setIter0(((Object)0));
		if (ModernizedCProgram.ref_iterator_abort(ref_iterator) != -1) {
			ok = -2;
		} 
		return ok;
	}
	public int files_ref_iterator_abort() {
		files_ref_iterator iter = (files_ref_iterator)ref_iterator;
		int ok = -1;
		ref_iterator generatedIter0 = iter.getIter0();
		if (generatedIter0) {
			ok = ModernizedCProgram.ref_iterator_abort(generatedIter0);
		} 
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return ok;
	}
	public ref_iterator files_ref_iterator_begin(ref_store ref_store, Object prefix, int flags) {
		files_ref_store refs = new files_ref_store();
		ref_iterator loose_iter = new ref_iterator();
		ref_iterator packed_iter = new ref_iterator();
		ref_iterator overlay_iter = new ref_iterator();
		files_ref_iterator iter = new files_ref_iterator();
		ref_iterator ref_iterator = new ref_iterator();
		int required_flags = (1 << 0);
		if (!(flags & -1024)) {
			required_flags |=  (1 << 2);
		} 
		files_ref_store files_ref_store = new files_ref_store();
		refs = files_ref_store.files_downcast(ref_store, required_flags, "ref_iterator_begin"/*
			 * We must make sure that all loose refs are read before
			 * accessing the packed-refs file; this avoids a race
			 * condition if loose refs are migrated to the packed-refs
			 * file by a simultaneous process, but our in-memory view is
			 * from before the migration. We ensure this as follows:
			 * First, we call start the loose refs iteration with its
			 * `prime_ref` argument set to true. This causes the loose
			 * references in the subtree to be pre-read into the cache.
			 * (If they've already been read, that's OK; we only need to
			 * guarantee that they're read before the packed refs, not
			 * *how much* before.) After that, we call
			 * packed_ref_iterator_begin(), which internally checks
			 * whether the packed-ref cache is up to date with what is on
			 * disk, and re-reads it if not.
			 */);
		ref_cache ref_cache = new ref_cache();
		ref_iterator ref_iterator = new ref_iterator();
		loose_iter = ref_iterator.cache_ref_iterator_begin(ref_cache.get_loose_ref_cache(refs), prefix, 1/*
			 * The packed-refs file might contain broken references, for
			 * example an old version of a reference that points at an
			 * object that has since been garbage-collected. This is OK as
			 * long as there is a corresponding loose reference that
			 * overrides it, and we don't want to emit an error message in
			 * this case. So ask the packed_ref_store for all of its
			 * references, and (if needed) do our own check for broken
			 * ones in files_ref_iterator_advance(), after we have merged
			 * the packed and loose references.
			 */);
		ref_store generatedPacked_ref_store = refs.getPacked_ref_store();
		ref_iterator ref_iterator = new ref_iterator();
		packed_iter = ref_iterator.refs_ref_iterator_begin(generatedPacked_ref_store, prefix, 0, -1024);
		overlay_iter = loose_iter.overlay_ref_iterator_begin(packed_iter);
		iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator = generatedBase;
		int generatedOrdered = overlay_iter.getOrdered();
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.files_ref_iterator_vtable, generatedOrdered);
		iter.setIter0(overlay_iter);
		iter.setFlags(flags);
		return ref_iterator/*
		 * Verify that the reference locked by lock has the value old_oid
		 * (unless it is NULL).  Fail if the reference doesn't exist and
		 * mustexist is set. Return 0 on success. On error, write an error
		 * message to err, set errno, and return a negative value.
		 */;
	}
	public int files_reflog_iterator_advance() {
		files_reflog_iterator iter = (files_reflog_iterator)ref_iterator;
		dir_iterator generatedDir_iterator = iter.getDir_iterator();
		dir_iterator diter = generatedDir_iterator;
		int ok;
		stat generatedSt = diter.getSt();
		Object generatedSt_mode = generatedSt.getSt_mode();
		Object generatedBasename = diter.getBasename();
		ref_store generatedRef_store = iter.getRef_store();
		Object generatedRelative_path = diter.getRelative_path();
		object_id generatedOid = iter.getOid();
		ref_iterator generatedBase = iter.getBase();
		while ((ok = diter.dir_iterator_advance()) == 0) {
			int flags;
			if (!(((generatedSt_mode) & -1024) == -1024)) {
				continue;
			} 
			if (generatedBasename[0] == (byte)'.') {
				continue;
			} 
			if (ModernizedCProgram.ends_with(generatedBasename, ".lock")) {
				continue;
			} 
			if (ModernizedCProgram.refs_read_ref_full(generatedRef_store, generatedRelative_path, 0, generatedOid, flags)) {
				();
				continue;
			} 
			generatedBase.setRefname(generatedRelative_path);
			generatedBase.setOid(generatedOid);
			generatedBase.setFlags(flags);
			return 0;
		}
		iter.setDir_iterator(((Object)0));
		if (ModernizedCProgram.ref_iterator_abort(ref_iterator) == -2) {
			ok = -2;
		} 
		return ok;
	}
	public int files_reflog_iterator_abort() {
		files_reflog_iterator iter = (files_reflog_iterator)ref_iterator;
		int ok = -1;
		dir_iterator generatedDir_iterator = iter.getDir_iterator();
		if (generatedDir_iterator) {
			ok = generatedDir_iterator.dir_iterator_abort();
		} 
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return ok;
	}
	public ref_iterator reflog_iterator_begin(ref_store ref_store, Object gitdir) {
		dir_iterator diter = new dir_iterator();
		files_reflog_iterator iter = new files_reflog_iterator();
		ref_iterator ref_iterator = new ref_iterator();
		strbuf sb = new strbuf(, , );
		sb.strbuf_addf("%s/logs", gitdir);
		byte generatedBuf = sb.getBuf();
		dir_iterator dir_iterator = new dir_iterator();
		diter = dir_iterator.dir_iterator_begin(generatedBuf, 0);
		ref_iterator ref_iterator = new ref_iterator();
		if (!diter) {
			sb.strbuf_release();
			return ref_iterator.empty_ref_iterator_begin();
		} 
		iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator = generatedBase;
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.files_reflog_iterator_vtable, 0);
		iter.setDir_iterator(diter);
		iter.setRef_store(ref_store);
		sb.strbuf_release();
		return ref_iterator;
	}
	public iterator_selection reflog_iterator_select(ref_iterator iter_common, Object cb_data) {
		Object generatedRefname = iter_common.getRefname();
		if (iter_worktree/*
				 * We're a bit loose here. We probably should ignore
				 * common refs if they are accidentally added as
				 * per-worktree refs.
				 */) {
			return iterator_selection.ITER_SELECT_0;
		}  else if (iter_common) {
			if (ModernizedCProgram.ref_type(generatedRefname) == ref_type.REF_TYPE_NORMAL) {
				return iterator_selection.ITER_SELECT_1/*
						 * The main ref store may contain main worktree's
						 * per-worktree refs, which should be ignored
						 */;
			} 
			return iterator_selection.ITER_SKIP_1;
		} else {
				return -1;
		} 
	}
	public ref_iterator files_reflog_iterator_begin(ref_store ref_store) {
		files_ref_store files_ref_store = new files_ref_store();
		files_ref_store refs = files_ref_store.files_downcast(ref_store, (1 << 0), "reflog_iterator_begin");
		Byte generatedGitdir = refs.getGitdir();
		Byte generatedGitcommondir = refs.getGitcommondir();
		ref_iterator ref_iterator = new ref_iterator();
		if (!.strcmp(generatedGitdir, generatedGitcommondir)) {
			return ref_iterator.reflog_iterator_begin(ref_store, generatedGitcommondir);
		} else {
				return ref_iterator.reflog_iterator_begin(ref_store, generatedGitdir).merge_ref_iterator_begin(0, ref_iterator.reflog_iterator_begin(ref_store, generatedGitcommondir), reflog_iterator_select, refs/*
				 * If update is a direct update of head_ref (the reference pointed to
				 * by HEAD), then add an extra REF_LOG_ONLY update for HEAD.
				 */);
		} 
	}
	public int packed_ref_iterator_advance() {
		packed_ref_iterator iter = (packed_ref_iterator)ref_iterator;
		int ok;
		int generatedFlags = iter.getFlags();
		ref_iterator generatedBase = iter.getBase();
		Object generatedRefname = generatedBase.getRefname();
		object_id generatedOid = iter.getOid();
		while ((ok = iter.next_record()) == 0) {
			if (generatedFlags & -1024 && ModernizedCProgram.ref_type(generatedRefname) != ref_type.REF_TYPE_PER_WORKTREE) {
				continue;
			} 
			if (!(generatedFlags & -1024) && !ModernizedCProgram.ref_resolves_to_object(generatedRefname, generatedOid, generatedFlags)) {
				continue;
			} 
			return 0;
		}
		if (ModernizedCProgram.ref_iterator_abort(ref_iterator) != -1) {
			ok = -2;
		} 
		return ok;
	}
	public int packed_ref_iterator_abort() {
		packed_ref_iterator iter = (packed_ref_iterator)ref_iterator;
		int ok = -1;
		strbuf generatedRefname_buf = iter.getRefname_buf();
		generatedRefname_buf.strbuf_release();
		snapshot generatedSnapshot = iter.getSnapshot();
		generatedSnapshot.release_snapshot();
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return ok;
	}
	public ref_iterator packed_ref_iterator_begin(ref_store ref_store, Object prefix, int flags) {
		packed_ref_store refs = new packed_ref_store();
		snapshot snapshot = new snapshot();
		byte start;
		packed_ref_iterator iter = new packed_ref_iterator();
		ref_iterator ref_iterator = new ref_iterator();
		int required_flags = (1 << 0);
		if (!(flags & -1024)) {
			required_flags |=  (1 << 2);
		} 
		packed_ref_store packed_ref_store = new packed_ref_store();
		refs = packed_ref_store.packed_downcast(ref_store, required_flags, "ref_iterator_begin"/*
			 * Note that `get_snapshot()` internally checks whether the
			 * snapshot is up to date with what is on disk, and re-reads
			 * it if not.
			 */);
		snapshot snapshot = new snapshot();
		snapshot = snapshot.get_snapshot(refs);
		Byte generatedStart = snapshot.getStart();
		if (prefix && prefix) {
			start = snapshot.find_reference_location(prefix, 0);
		} else {
				start = generatedStart;
		} 
		Byte generatedEof = snapshot.getEof();
		ref_iterator ref_iterator = new ref_iterator();
		if (start == generatedEof) {
			return ref_iterator.empty_ref_iterator_begin();
		} 
		iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator = generatedBase;
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.packed_ref_iterator_vtable, 1);
		iter.setSnapshot(snapshot);
		snapshot.acquire_snapshot();
		iter.setPos(start);
		iter.setEof(generatedEof);
		strbuf generatedRefname_buf = iter.getRefname_buf();
		generatedRefname_buf.strbuf_init(0);
		object_id generatedOid = iter.getOid();
		generatedBase.setOid(generatedOid);
		iter.setFlags(flags);
		if (prefix && prefix) {
			ref_iterator = ref_iterator.prefix_ref_iterator_begin(prefix, /* Stop iteration after we've gone *past* prefix: */0);
		} 
		return ref_iterator/*
		 * Write an entry to the packed-refs file for the specified refname.
		 * If peeled is non-NULL, write it as the entry's peeled value. On
		 * error, return a nonzero value and leave errno set at the value left
		 * by the failing call to `fprintf()`.
		 */;
	}
	public ref_iterator packed_reflog_iterator_begin(ref_store ref_store) {
		ref_iterator ref_iterator = new ref_iterator();
		return ref_iterator.empty_ref_iterator_begin();
	}
	public int cache_ref_iterator_advance() {
		cache_ref_iterator iter = (cache_ref_iterator)ref_iterator;
		cache_ref_iterator_level generatedLevels = iter.getLevels();
		Object generatedLevels_nr = iter.getLevels_nr();
		ref_dir generatedDir = level.getDir();
		int generatedIndex = level.getIndex();
		int generatedNr = generatedDir.getNr();
		ref_entry generatedEntries = dir.getEntries();
		prefix_state generatedPrefix_state = level.getPrefix_state();
		Object generatedName = entry.getName();
		Object generatedPrefix = iter.getPrefix();
		byte generatedFlag = entry.getFlag();
		Object generatedLevels_alloc = iter.getLevels_alloc();
		ref_dir ref_dir = new ref_dir();
		ref_iterator generatedBase = iter.getBase();
		 generatedU = entry.getU();
		Object generatedValue = generatedU.getValue();
		while (1) {
			cache_ref_iterator_level level = generatedLevels[generatedLevels_nr - 1];
			ref_dir dir = generatedDir;
			ref_entry entry = new ref_entry();
			prefix_state entry_prefix_state;
			if (generatedIndex == -1) {
				dir.sort_ref_dir();
			} 
			if (++generatedIndex == generatedNr) {
				if (--generatedLevels_nr == /* This level is exhausted; pop up a level */0) {
					return ModernizedCProgram.ref_iterator_abort(ref_iterator);
				} 
				continue;
			} 
			entry = generatedEntries[generatedIndex];
			if (generatedPrefix_state == prefix_state.PREFIX_WITHIN_DIR) {
				prefix_state.entry_prefix_state = ModernizedCProgram.overlaps_prefix(generatedName, generatedPrefix);
				if (prefix_state.entry_prefix_state == prefix_state.PREFIX_EXCLUDES_DIR) {
					continue;
				} 
			} else {
					prefix_state.entry_prefix_state = generatedPrefix_state;
			} 
			if (generatedFlag & -1024) {
				do {
					if ((generatedLevels_nr + 1) > generatedLevels_alloc) {
						if ((((generatedLevels_alloc) + 16) * 3 / 2) < (generatedLevels_nr + 1)) {
							iter.setLevels_alloc((generatedLevels_nr + 1));
						} else {
								iter.setLevels_alloc((((generatedLevels_alloc) + 16) * 3 / 2));
						} 
						(generatedLevels) = ModernizedCProgram.xrealloc((generatedLevels), ModernizedCProgram.st_mult(, (generatedLevels_alloc)));
					} 
				} while (/* push down a level */0);
				level = generatedLevels[generatedLevels_nr++];
				level.setDir(ref_dir.get_ref_dir(entry));
				level.setPrefix_state(prefix_state.entry_prefix_state);
				level.setIndex(-1);
			} else {
					generatedBase.setRefname(generatedName);
					generatedBase.setOid(generatedValue.getOid());
					generatedBase.setFlags(generatedFlag);
					return 0;
			} 
		}
	}
	public int cache_ref_iterator_abort() {
		cache_ref_iterator iter = (cache_ref_iterator)ref_iterator;
		Object generatedPrefix = iter.getPrefix();
		ModernizedCProgram.free((byte)generatedPrefix);
		cache_ref_iterator_level generatedLevels = iter.getLevels();
		ModernizedCProgram.free(generatedLevels);
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return -1;
	}
	public ref_iterator cache_ref_iterator_begin(ref_cache cache, Object prefix, int prime_dir) {
		ref_dir dir = new ref_dir();
		cache_ref_iterator iter = new cache_ref_iterator();
		ref_iterator ref_iterator = new ref_iterator();
		cache_ref_iterator_level level = new cache_ref_iterator_level();
		ref_entry generatedRoot = cache.getRoot();
		ref_dir ref_dir = new ref_dir();
		dir = ref_dir.get_ref_dir(generatedRoot);
		if (prefix && prefix) {
			dir = dir.find_containing_dir(prefix, 0);
		} 
		ref_iterator ref_iterator = new ref_iterator();
		if (!dir) {
			return ref_iterator.empty_ref_iterator_begin();
		} 
		if (prime_dir) {
			dir.prime_ref_dir(prefix);
		} 
		iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator = generatedBase;
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.cache_ref_iterator_vtable, 1);
		Object generatedLevels_alloc = iter.getLevels_alloc();
		cache_ref_iterator_level generatedLevels = iter.getLevels();
		do {
			if ((true) > generatedLevels_alloc) {
				if ((((generatedLevels_alloc) + 16) * 3 / 2) < (true)) {
					iter.setLevels_alloc((true));
				} else {
						iter.setLevels_alloc((((generatedLevels_alloc) + 16) * 3 / 2));
				} 
				(generatedLevels) = ModernizedCProgram.xrealloc((generatedLevels), ModernizedCProgram.st_mult(, (generatedLevels_alloc)));
			} 
		} while (0);
		iter.setLevels_nr(1);
		level = generatedLevels[0];
		level.setIndex(-1);
		level.setDir(dir);
		if (prefix && prefix) {
			iter.setPrefix(ModernizedCProgram.xstrdup(prefix));
			level.setPrefix_state(prefix_state.PREFIX_WITHIN_DIR);
		} else {
				level.setPrefix_state(prefix_state.PREFIX_CONTAINS_DIR);
		} 
		return ref_iterator;
	}
	public ref_iterator refs_ref_iterator_begin(ref_store refs, Object prefix, int trim, int flags) {
		ref_iterator iter = new ref_iterator();
		if (ModernizedCProgram.ref_paranoia < 0) {
			ModernizedCProgram.ref_paranoia = .git_env_bool("GIT_REF_PARANOIA", 0);
		} 
		if (ModernizedCProgram.ref_paranoia) {
			flags |=  DO_FOR_EACH_INCLUDE_BROKEN;
		} 
		iter = .UNRECOGNIZEDFUNCTIONNAME(refs, prefix, flags/*
			 * `iterator_begin()` already takes care of prefix, but we
			 * might need to do some trimming:
			 */);
		if (trim) {
			iter = iter.prefix_ref_iterator_begin("", trim);
		} 
		Object generatedRef_iterator = iter.getRef_iterator();
		if (!generatedRef_iterator) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 1510, "reference iterator is not ordered");
		} 
		return iter/*
		 * Call fn for each reference in the specified submodule for which the
		 * refname begins with prefix. If trim is non-zero, then trim that
		 * many characters off the beginning of each refname before passing
		 * the refname to fn. flags can be DO_FOR_EACH_INCLUDE_BROKEN to
		 * include broken references in the iteration. If fn ever returns a
		 * non-zero value, stop the iteration and return that value;
		 * otherwise, return 0.
		 */;
	}
	public int empty_ref_iterator_advance() {
		return ModernizedCProgram.ref_iterator_abort(ref_iterator);
	}
	public int empty_ref_iterator_abort() {
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return -1;
	}
	public ref_iterator empty_ref_iterator_begin() {
		empty_ref_iterator iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator ref_iterator = generatedBase;
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.empty_ref_iterator_vtable, 1);
		return ref_iterator;
	}
	public int is_empty_ref_iterator() {
		Object generatedRef_iterator = this.getRef_iterator();
		return generatedRef_iterator == ModernizedCProgram.empty_ref_iterator_vtable;
	}
	public int merge_ref_iterator_advance() {
		merge_ref_iterator iter = (merge_ref_iterator)ref_iterator;
		int ok;
		ref_iterator generatedCurrent = iter.getCurrent();
		ref_iterator generatedIter0 = iter.getIter0();
		ref_iterator generatedIter1 = iter.getIter1();
		if (!generatedCurrent) {
			if ((ok = ModernizedCProgram.ref_iterator_advance(generatedIter0)) != /* Initialize: advance both iterators to their first entries */0) {
				iter.setIter0(((Object)0));
				if (ok == -2) {
					;
				} 
			} 
			if ((ok = ModernizedCProgram.ref_iterator_advance(generatedIter1)) != 0) {
				iter.setIter1(((Object)0));
				if (ok == -2) {
					;
				} 
			} 
		} else {
				if ((ok = ModernizedCProgram.ref_iterator_advance(generatedCurrent)) != 0) {
					generatedCurrent = ((Object)0);
					if (ok == -2) {
						;
					} 
				} 
		} 
		Object generatedCb_data = iter.getCb_data();
		Object generatedRef_iterator = (generatedCurrent).getRef_iterator();
		ref_iterator generatedBase = iter.getBase();
		while (/* Loop until we find an entry that we can yield. */1) {
			ref_iterator secondary = new ref_iterator();
			iterator_selection selection = .UNRECOGNIZEDFUNCTIONNAME(generatedIter0, generatedIter1, generatedCb_data);
			if (iterator_selection.selection == iterator_selection.ITER_SELECT_DONE) {
				return ModernizedCProgram.ref_iterator_abort(ref_iterator);
			}  else if (iterator_selection.selection == iterator_selection.ITER_SELECT_ERROR) {
				ModernizedCProgram.ref_iterator_abort(ref_iterator);
				return -2;
			} 
			if ((iterator_selection.selection & iterator_selection.ITER_CURRENT_SELECTION_MASK) == 0) {
				iter.setCurrent(generatedIter0);
				secondary = generatedIter1;
			} else {
					iter.setCurrent(generatedIter1);
					secondary = generatedIter0;
			} 
			if (iterator_selection.selection & iterator_selection.ITER_SKIP_SECONDARY) {
				if ((ok = ModernizedCProgram.ref_iterator_advance(secondary)) != 0) {
					secondary = ((Object)0);
					if (ok == -2) {
						;
					} 
				} 
			} 
			if (iterator_selection.selection & iterator_selection.ITER_YIELD_CURRENT) {
				generatedBase.setRef_iterator(generatedRef_iterator);
				generatedBase.setRef_iterator(generatedRef_iterator);
				generatedBase.setRef_iterator(generatedRef_iterator);
				return 0;
			} 
		}
		return -2;
	}
	public int merge_ref_iterator_abort() {
		merge_ref_iterator iter = (merge_ref_iterator)ref_iterator;
		int ok = -1;
		ref_iterator generatedIter0 = iter.getIter0();
		if (generatedIter0) {
			if (ModernizedCProgram.ref_iterator_abort(generatedIter0) != -1) {
				ok = -2;
			} 
		} 
		ref_iterator generatedIter1 = iter.getIter1();
		if (generatedIter1) {
			if (ModernizedCProgram.ref_iterator_abort(generatedIter1) != -1) {
				ok = -2;
			} 
		} 
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return ok;
	}
	public ref_iterator merge_ref_iterator_begin(int ordered, ref_iterator iter1, Object select, Object cb_data) {
		merge_ref_iterator iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator ref_iterator = generatedBase;
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.merge_ref_iterator_vtable, ordered);
		iter.setIter0(iter0);
		iter.setIter1(iter1);
		iter.setSelect(select);
		iter.setCb_data(cb_data);
		iter.setCurrent(((Object)0));
		return ref_iterator/*
		 * A ref_iterator_select_fn that overlays the items from front on top
		 * of those from back (like loose refs over packed refs). See
		 * overlay_ref_iterator_begin().
		 */;
	}
	public iterator_selection overlay_iterator_select(ref_iterator back, Object cb_data) {
		int cmp;
		if (!back) {
			return front ? iterator_selection.ITER_SELECT_0 : iterator_selection.ITER_SELECT_DONE;
		}  else if (!front) {
			return iterator_selection.ITER_SELECT_1;
		} 
		Object generatedRef_iterator = this.getRef_iterator();
		cmp = .strcmp(generatedRef_iterator, generatedRef_iterator);
		if (cmp < 0) {
			return iterator_selection.ITER_SELECT_0;
		}  else if (cmp > 0) {
			return iterator_selection.ITER_SELECT_1;
		} else {
				return iterator_selection.ITER_SELECT_0_SKIP_1;
		} 
	}
	public ref_iterator overlay_ref_iterator_begin(ref_iterator back) {
		Object generatedRef_iterator = this.getRef_iterator();
		if (front.is_empty_ref_iterator()) {
			ModernizedCProgram.ref_iterator_abort(front);
			return back;
		}  else if (back.is_empty_ref_iterator()) {
			ModernizedCProgram.ref_iterator_abort(back);
			return front;
		}  else if (!generatedRef_iterator || !generatedRef_iterator) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\iterator.c", 275, "overlay_ref_iterator requires ordered inputs");
		} 
		return front.merge_ref_iterator_begin(1, back, overlay_iterator_select, ((Object)0));
	}
	public int prefix_ref_iterator_advance() {
		prefix_ref_iterator iter = (prefix_ref_iterator)ref_iterator;
		int ok;
		ref_iterator generatedIter0 = iter.getIter0();
		Object generatedRef_iterator = generatedIter0.getRef_iterator();
		Byte generatedPrefix = iter.getPrefix();
		int generatedTrim = iter.getTrim();
		ref_iterator generatedBase = iter.getBase();
		while ((ok = ModernizedCProgram.ref_iterator_advance(generatedIter0)) == 0) {
			int cmp = ModernizedCProgram.compare_prefix(generatedRef_iterator, generatedPrefix);
			if (cmp < 0) {
				continue;
			} 
			if (cmp > 0/*
						 * If the source iterator is ordered, then we
						 * can stop the iteration as soon as we see a
						 * refname that comes after the prefix:
						 */) {
				if (generatedRef_iterator) {
					ok = ModernizedCProgram.ref_iterator_abort(generatedIter0);
					break;
				} else {
						continue;
				} 
			} 
			if (generatedTrim) {
				if (.strlen(generatedRef_iterator) <= generatedTrim) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\iterator.c", 341, "attempt to trim too many characters");
				} 
				generatedBase.setRef_iterator(generatedRef_iterator + generatedTrim);
			} else {
					generatedBase.setRef_iterator(generatedRef_iterator);
			} 
			generatedBase.setRef_iterator(generatedRef_iterator);
			generatedBase.setRef_iterator(generatedRef_iterator);
			return 0;
		}
		iter.setIter0(((Object)0));
		if (ModernizedCProgram.ref_iterator_abort(ref_iterator) != -1) {
			return -2;
		} 
		return ok;
	}
	public int prefix_ref_iterator_abort() {
		prefix_ref_iterator iter = (prefix_ref_iterator)ref_iterator;
		int ok = -1;
		ref_iterator generatedIter0 = iter.getIter0();
		if (generatedIter0) {
			ok = ModernizedCProgram.ref_iterator_abort(generatedIter0);
		} 
		Byte generatedPrefix = iter.getPrefix();
		ModernizedCProgram.free(generatedPrefix);
		ModernizedCProgram.base_ref_iterator_free(ref_iterator);
		return ok;
	}
	public ref_iterator prefix_ref_iterator_begin(Object prefix, int trim) {
		prefix_ref_iterator iter = new prefix_ref_iterator();
		ref_iterator ref_iterator = new ref_iterator();
		if (!prefix && !trim) {
			return /* optimization: no need to wrap iterator */iter0;
		} 
		iter = ModernizedCProgram.xcalloc(1, );
		ref_iterator generatedBase = iter.getBase();
		ref_iterator = generatedBase;
		Object generatedRef_iterator = this.getRef_iterator();
		ModernizedCProgram.base_ref_iterator_init(ref_iterator, ModernizedCProgram.prefix_ref_iterator_vtable, generatedRef_iterator);
		iter.setIter0(iter0);
		iter.setPrefix(ModernizedCProgram.xstrdup(prefix));
		iter.setTrim(trim);
		return ref_iterator;
	}
	public ref_iterator_vtable getVtable() {
		return vtable;
	}
	public void setVtable(ref_iterator_vtable newVtable) {
		vtable = newVtable;
	}
	public int getOrdered() {
		return ordered;
	}
	public void setOrdered(int newOrdered) {
		ordered = newOrdered;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
	public Object getOid() {
		return oid;
	}
	public void setOid(Object newOid) {
		oid = newOid;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
/*
 * Return true iff ref_iterator is an empty_ref_iterator.
 */
/*
 * Iterate over the entries from iter0 and iter1, with the values
 * interleaved as directed by the select function. The iterator takes
 * ownership of iter0 and iter1 and frees them when the iteration is
 * over. A derived class should set `ordered` to 1 or 0 based on
 * whether it generates its output in order by reference name.
 */
/*
 * An iterator consisting of the union of the entries from front and
 * back. If there are entries common to the two sub-iterators, use the
 * one from front. Each iterator must iterate over its entries in
 * strcmp() order by refname for this to work.
 *
 * The new iterator takes ownership of its arguments and frees them
 * when the iteration is over. As a convenience to callers, if front
 * or back is an empty_ref_iterator, then abort that one immediately
 * and return the other iterator directly, without wrapping it.
 */
/*
 * Wrap iter0, only letting through the references whose names start
 * with prefix. If trim is set, set iter->refname to the name of the
 * reference with that many characters trimmed off the front;
 * otherwise set it to the full refname. The new iterator takes over
 * ownership of iter0 and frees it when iteration is over. It makes
 * its own copy of prefix.
 *
 * As an convenience to callers, if prefix is the empty string and
 * trim is zero, this function returns iter0 directly, without
 * wrapping it.
 *
 * The resulting ref_iterator is ordered if iter0 is.
 */
/* Internal implementation of reference iteration: */
/*
 * Base class constructor for ref_iterators. Initialize the
 * ref_iterator part of iter, setting its vtable pointer as specified.
 * `ordered` should be set to 1 if the iterator will iterate over
 * references in order by refname; otherwise it should be set to 0.
 * This is meant to be called only by the initializers of derived
 * classes.
 */
/*
 * The common backend for the for_each_*ref* functions. Call fn for
 * each reference in iter. If the iterator itself ever returns
 * ITER_ERROR, return -1. If fn ever returns a non-zero value, stop
 * the iteration and return that value. Otherwise, return 0. In any
 * case, free the iterator when done. This function is basically an
 * adapter between the callback style of reference iteration and the
 * iterator style.
 */
/*
 * Only include per-worktree refs in a do_for_each_ref*() iteration.
 * Normally this will be used with a files ref_store, since that's
 * where all reference backends will presumably store their
 * per-worktree refs.
 */
