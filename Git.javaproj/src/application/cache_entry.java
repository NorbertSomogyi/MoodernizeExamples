package application;

public class cache_entry {
	private hashmap_entry ent;
	private stat_data ce_stat_data;
	private int ce_mode;
	private int ce_flags;
	private int mem_pool_allocated;
	private int ce_namelen;
	private int index;
	private object_id oid;
	private Object name;
	
	public cache_entry(hashmap_entry ent, stat_data ce_stat_data, int ce_mode, int ce_flags, int mem_pool_allocated, int ce_namelen, int index, object_id oid, Object name) {
		setEnt(ent);
		setCe_stat_data(ce_stat_data);
		setCe_mode(ce_mode);
		setCe_flags(ce_flags);
		setMem_pool_allocated(mem_pool_allocated);
		setCe_namelen(ce_namelen);
		setIndex(index);
		setOid(oid);
		setName(name);
	}
	public cache_entry() {
	}
	
	public int write_entry(Byte path, Object state, int to_tempfile) {
		int generatedCe_mode = this.getCe_mode();
		int ce_mode_s_ifmt = generatedCe_mode & -1024;
		delayed_checkout dco = state.getDelayed_checkout();
		int fd;
		int ret;
		int fstat_done = 0;
		byte new_blob;
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		long size;
		ssize_t wrote = new ssize_t();
		size_t newsize = 0;
		stat st = new stat();
		submodule sub = new submodule();
		Object generatedName = this.getName();
		object_id generatedOid = this.getOid();
		stream_filter stream_filter = new stream_filter();
		if (ce_mode_s_ifmt == -1024) {
			stream_filter filter = stream_filter.get_stream_filter(state.getIstate(), generatedName, generatedOid);
			if (ModernizedCProgram.filter && !ModernizedCProgram.streaming_write_entry(ce, path, ModernizedCProgram.filter, state, to_tempfile, fstat_done, st)) {
				;
			} 
		} 
		ce_delay_state generatedState = dco.getState();
		string_list generatedPaths = dco.getPaths();
	}
	public int checkout_entry(Object state, Byte topath, Integer nr_checkouts) {
		strbuf path = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		stat st = new stat();
		int generatedCe_flags = this.getCe_flags();
		if (generatedCe_flags & (1 << 22)) {
			if (topath/*
						 * No content and thus no path to create, so we have
						 * no pathname to return.
						 */) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\entry.c", 450, "Can't remove entry to a path");
			} 
			ModernizedCProgram.unlink_entry(ce);
			return 0;
		} 
		if (topath) {
			return ce.write_entry(topath, state, 1);
		} 
		path.strbuf_setlen(0);
		path.strbuf_add(state.getBase_dir(), state.getBase_dir_len());
		Object generatedName = this.getName();
		int generatedCe_namelen = (ce).getCe_namelen();
		path.strbuf_add(generatedName, (generatedCe_namelen));
		byte[] generatedBuf = path.getBuf();
		Object generatedLen = path.getLen();
		Object generatedSt_mode = st.getSt_mode();
		object_id generatedOid = this.getOid();
		int generatedCe_mode = this.getCe_mode();
		if (!st.check_path(generatedBuf, generatedLen, state.getBase_dir_len())) {
			submodule sub = new submodule();
			int changed = ModernizedCProgram.ie_match_stat(state.getIstate(), ce, st, 1 | 4/*
					 * Needs to be checked before !changed returns early,
					 * as the possibly empty directory was not changed
					 */);
			sub = ModernizedCProgram.submodule_from_ce(ce);
			if (sub) {
				int err;
				if (!ModernizedCProgram.is_submodule_populated_gently(generatedName, ModernizedCProgram.err)) {
					stat sb = new stat();
					if (/*Error: Function owner not recognized*/lstat(generatedName, sb)) {
						ModernizedCProgram.die(ModernizedCProgram._("could not stat file '%s'"), generatedName);
					} 
					if (!(generatedSt_mode & -1024)) {
						ModernizedCProgram.unlink_or_warn(generatedName);
					} 
					return ModernizedCProgram.submodule_move_head(generatedName, ((Object)0), ModernizedCProgram.oid_to_hex(generatedOid), 0);
				} else {
						return ModernizedCProgram.submodule_move_head(generatedName, "HEAD", ModernizedCProgram.oid_to_hex(generatedOid), state.getForce() ? (1 << 1) : 0);
				} 
			} 
			if (!changed) {
				return 0;
			} 
			if (!state.getForce()) {
				if (!state.getQuiet()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s already exists, no checkout\n", generatedBuf);
				} 
				return -1;
			} 
			if (state.getClone()) {
				ModernizedCProgram.mark_colliding_entries(state, ce, st/*
						 * We unlink the old file, to get the new one with the
						 * right permissions (including umask, which is nasty
						 * to emulate by hand - much easier to let the system
						 * just do the right thing)
						 */);
			} 
			if ((((generatedSt_mode) & -1024) == -1024)) {
				if ((((generatedCe_mode) & -1024) == /* If it is a gitlink, leave it alone! */160000)) {
					return 0;
				} 
				if (!state.getForce()) {
					return ();
				} 
				path.remove_subtree();
			}  else if (/*Error: Function owner not recognized*/unlink(generatedBuf)) {
				return ();
			} 
		}  else if (state.getNot_new()) {
			return 0;
		} 
		ModernizedCProgram.create_directories(generatedBuf, generatedLen, state);
		if (nr_checkouts) {
			(nr_checkouts)++;
		} 
		return ce.write_entry(generatedBuf, state, 0);
	}
	public cache_entry next_cache_entry(unpack_trees_options o) {
		index_state generatedSrc_index = o.getSrc_index();
		index_state index = generatedSrc_index;
		int generatedCache_bottom = o.getCache_bottom();
		int pos = generatedCache_bottom;
		int generatedCe_flags = ce.getCe_flags();
		while (pos < index.getCache_nr()) {
			cache_entry ce = index.getCache()[pos];
			if (!(generatedCe_flags & (1 << 24))) {
				return ce;
			} 
			pos++;
		}
		return ((Object)0);
	}
	public cache_entry create_ce_entry(Object info, Object n, int stage, index_state istate, int is_transient) {
		size_t len = ModernizedCProgram.traverse_path_len(info, ModernizedCProgram.tree_entry_len(n));
		cache_entry cache_entry = new cache_entry();
		cache_entry cache_entry = new cache_entry();
		cache_entry ce = is_transient ? cache_entry.make_empty_transient_cache_entry(len) : cache_entry.make_empty_cache_entry(istate, len);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(n.getMode()));
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(stage));
		ce.setCe_namelen(len);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(generatedOid);
		Object generatedName = ce.getName();
		ModernizedCProgram.make_traverse_path(generatedName, len + 1, info, n.getPath(), n.getPathlen());
		return ce/*
		 * Note that traverse_by_cache_tree() duplicates some logic in this function
		 * without actually calling it. If you change the logic here you may need to
		 * check and change there as well.
		 */;
	}
	public int unpack_nondirectories(int n, long mask, long dirmask, Object names, Object info) {
		int i;
		unpack_trees_options o = info.getData();
		long conflicts = info.getDf_conflicts() | dirmask;
		if (mask == dirmask && !src[/* Do we have *only* directories? Nothing to do */0]) {
			return 0/*
				 * Ok, we've filled in up to any potential index entry in src[0],
				 * now do the rest.
				 */;
		} 
		int generatedMerge = o.getMerge();
		cache_entry generatedDf_conflict_entry = o.getDf_conflict_entry();
		int generatedHead_idx = o.getHead_idx();
		index_state generatedResult = o.getResult();
		cache_entry cache_entry = new cache_entry();
		for (i = 0; i < n; i++) {
			int stage;
			int bit = -1024 << i;
			if (conflicts & bit) {
				src[i + generatedMerge] = generatedDf_conflict_entry;
				continue;
			} 
			if (!(mask & bit)) {
				continue;
			} 
			if (!generatedMerge) {
				stage = 0;
			}  else if (i + 1 < generatedHead_idx) {
				stage = 1;
			}  else if (i + 1 > generatedHead_idx) {
				stage = 3;
			} else {
					stage = 2/*
							 * If the merge bit is set, then the cache entries are
							 * discarded in the following block.  In this case,
							 * construct "transient" cache_entries, as they are
							 * not stored in the index.  otherwise construct the
							 * cache entry from the index aware logic.
							 */;
			} 
			src[i + generatedMerge] = cache_entry.create_ce_entry(info, names + i, stage, generatedResult, generatedMerge);
		}
		if (generatedMerge) {
			int rc = o.call_unpack_fn((cache_entry)src);
			for (i = 0; i < n; i++) {
				cache_entry ce = src[i + generatedMerge];
				if (ce != generatedDf_conflict_entry) {
					ce.discard_cache_entry();
				} 
			}
			return ModernizedCProgram.rc;
		} 
		for (i = 0; i < n; i++) {
			if (src[i] && src[i] != generatedDf_conflict_entry) {
				if (ModernizedCProgram.do_add_entry(o, src[i], 0, 0)) {
					return -1;
				} 
			} 
		}
		return 0;
	}
	public cache_entry find_cache_entry(traverse_info info, Object p) {
		int pos = info.find_cache_pos(p.getPath(), p.getPathlen());
		Object generatedData = info.getData();
		unpack_trees_options o = generatedData;
		index_state generatedSrc_index = o.getSrc_index();
		cache_entry[][] generatedCache = generatedSrc_index.getCache();
		if (0 <= pos) {
			return generatedCache[pos];
		} else {
				return ((Object)0);
		} 
	}
	public cache_entry index_file_exists(index_state istate, Object name, int namelen, int icase) {
		cache_entry ce = new cache_entry();
		int hash = ModernizedCProgram.memihash(name, namelen);
		istate.lazy_init_name_hash();
		hashmap generatedName_hash = istate.getName_hash();
		hashmap_entry hashmap_entry = new hashmap_entry();
		ce = (cache_entry)ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_from_hash(generatedName_hash, hash, ((Object)0)), ((size_t)((cache_entry)0).getEnt()));
		hashmap_entry generatedEnt = (ce).getEnt();
		hashmap_entry hashmap_entry = new hashmap_entry();
		for (; ce; ce = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get_next(generatedName_hash, generatedEnt), ((size_t)generatedEnt))) {
			if (ModernizedCProgram.same_name(ce, name, namelen, icase)) {
				return ce;
			} 
		}
		return ((Object)0);
	}
	public cache_entry mem_pool__ce_alloc(mem_pool mem_pool, Object len) {
		cache_entry ce = new cache_entry();
		ce = mem_pool.mem_pool_alloc((((size_t)((cache_entry)0).getName()) + (len) + 1));
		ce.setMem_pool_allocated(1);
		return ce;
	}
	public cache_entry mem_pool__ce_calloc(mem_pool mem_pool, Object len) {
		cache_entry ce = new cache_entry();
		ce = mem_pool.mem_pool_calloc(1, (((size_t)((cache_entry)0).getName()) + (len) + 1));
		ce.setMem_pool_allocated(1);
		return ce;
	}
	public int compare_name(Object path, int namelen) {
		int generatedCe_namelen = (ce).getCe_namelen();
		Object generatedName = this.getName();
		return namelen != (generatedCe_namelen) || /*Error: Function owner not recognized*/memcmp(path, generatedName, namelen);
	}
	public int different_name(cache_entry alias) {
		int generatedCe_namelen = (ce).getCe_namelen();
		int len = (generatedCe_namelen);
		Object generatedName = this.getName();
		return (generatedCe_namelen) != len || /*Error: Function owner not recognized*/memcmp(generatedName, generatedName, len/*
		 * If we add a filename that aliases in the cache, we will use the
		 * name that we already have - but we don't want to update the same
		 * alias twice, because that implies that there were actually two
		 * different files with aliasing names!
		 *
		 * So we use the CE_ADDED flag to verify that the alias was an old
		 * one before we accept it as
		 */);
	}
	public cache_entry create_alias_ce(index_state istate, cache_entry alias) {
		int len;
		cache_entry new_entry = new cache_entry();
		int generatedCe_flags = alias.getCe_flags();
		Object generatedName = this.getName();
		if (generatedCe_flags & (1 << 19)) {
			ModernizedCProgram.die(ModernizedCProgram._("will not add file alias '%s' ('%s' already exists in index)"), generatedName, generatedName);
		} 
		int generatedCe_namelen = (alias).getCe_namelen();
		len = (generatedCe_namelen);
		cache_entry cache_entry = new cache_entry();
		new_entry = cache_entry.make_empty_cache_entry(istate, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, generatedName, len);
		new_entry.copy_cache_entry(ce);
		ModernizedCProgram.save_or_free_index_entry(istate, ce);
		return new_entry;
	}
	public void set_object_name_for_intent_to_add_entry() {
		object_id oid = new object_id();
		if (oid.write_object_file("", 0, ModernizedCProgram.blob_type)) {
			ModernizedCProgram.die(ModernizedCProgram._("cannot create an empty blob in the object database"));
		} 
		object_id generatedOid = this.getOid();
		generatedOid.oidcpy(oid);
	}
	public cache_entry make_empty_cache_entry(index_state istate, Object len) {
		mem_pool mem_pool = new mem_pool();
		cache_entry cache_entry = new cache_entry();
		return cache_entry.mem_pool__ce_calloc(mem_pool.find_mem_pool(istate), len);
	}
	public cache_entry make_empty_transient_cache_entry(Object len) {
		return ModernizedCProgram.xcalloc(1, (((size_t)((cache_entry)0).getName()) + (len) + 1));
	}
	public cache_entry make_cache_entry(index_state istate, int mode, Object oid, Object path, int stage, int refresh_options) {
		cache_entry ce = new cache_entry();
		cache_entry ret = new cache_entry();
		int len;
		if (!ModernizedCProgram.verify_path(path, mode)) {
			();
			return ((Object)0);
		} 
		len = /*Error: Function owner not recognized*/strlen(path);
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_cache_entry(istate, len);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(oid);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path, len);
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(stage));
		ce.setCe_namelen(len);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode));
		ret = ce.refresh_cache_entry(istate, refresh_options);
		if (ret != ce) {
			ce.discard_cache_entry();
		} 
		return ret;
	}
	public cache_entry make_transient_cache_entry(int mode, Object oid, Object path, int stage) {
		cache_entry ce = new cache_entry();
		int len;
		if (!ModernizedCProgram.verify_path(path, mode)) {
			();
			return ((Object)0);
		} 
		len = /*Error: Function owner not recognized*/strlen(path);
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_transient_cache_entry(len);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(oid);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path, len);
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(stage));
		ce.setCe_namelen(len);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode));
		return ce/*
		 * Chmod an index entry with either +x or -x.
		 *
		 * Returns -1 if the chmod for the particular cache entry failed (if it's
		 * not a regular file), -2 if an invalid flip argument is passed in, 0
		 * otherwise.
		 */;
	}
	public cache_entry refresh_cache_ent(index_state istate, int options, Integer err, Integer changed_ret) {
		stat st = new stat();
		cache_entry updated = new cache_entry();
		int changed;
		int refresh = options & -1024;
		int ignore_valid = options & 1;
		int ignore_skip_worktree = options & 4;
		int ignore_missing = options & -1024;
		int ignore_fsmonitor = options & -1024;
		int generatedCe_flags = (ce).getCe_flags();
		if (!refresh || (generatedCe_flags & (1 << 18))) {
			return ce;
		} 
		if (!ignore_fsmonitor) {
			istate/*
				 * CE_VALID or CE_SKIP_WORKTREE means the user promised us
				 * that the change to the work tree does not matter and told
				 * us not to worry.
				 */.refresh_fsmonitor();
		} 
		if (!ignore_skip_worktree && (generatedCe_flags & (1 << 30))) {
			(generatedCe_flags |=  (1 << 18));
			return ce;
		} 
		if (!ignore_valid && (generatedCe_flags & (true))) {
			(generatedCe_flags |=  (1 << 18));
			return ce;
		} 
		if (!ignore_fsmonitor && (generatedCe_flags & (1 << 21))) {
			(generatedCe_flags |=  (1 << 18));
			return ce;
		} 
		Object generatedName = this.getName();
		int generatedCe_namelen = (ce).getCe_namelen();
		if (ModernizedCProgram.has_symlink_leading_path(generatedName, (generatedCe_namelen))) {
			if (ignore_missing) {
				return ce;
			} 
			if (err) {
				err = 2;
			} 
			return ((Object)0);
		} 
		if (/*Error: Function owner not recognized*/lstat(generatedName, st) < 0) {
			if (ignore_missing && (/*Error: Function owner not recognized*/_errno()) == 2) {
				return ce;
			} 
			if (err) {
				err = (/*Error: Function owner not recognized*/_errno());
			} 
			return ((Object)0);
		} 
		changed = ModernizedCProgram.ie_match_stat(istate, ce, st, options);
		if (changed_ret) {
			changed_ret = changed;
		} 
		int generatedCe_mode = this.getCe_mode();
		if (!changed/*
				 * The path is unchanged.  If we were told to ignore
				 * valid bit, then we did the actual stat check and
				 * found that the entry is unmodified.  If the entry
				 * is not marked VALID, this is the place to mark it
				 * valid again, under "assume unchanged" mode.
				 */) {
			if (ignore_valid && ModernizedCProgram.assume_unchanged && !(generatedCe_flags & (true))) {
				;
			} else {
					if (!(((generatedCe_mode) & -1024) == 160000)) {
						(generatedCe_flags |=  (1 << 18));
						ModernizedCProgram.mark_fsmonitor_valid(istate, ce);
					} 
					return ce;
			} 
		} 
		if (ModernizedCProgram.ie_modified(istate, ce, st, options)) {
			if (err) {
				err = 22;
			} 
			return ((Object)0);
		} 
		cache_entry cache_entry = new cache_entry();
		updated = cache_entry.make_empty_cache_entry(istate, (generatedCe_namelen));
		updated.copy_cache_entry(ce);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, generatedName, generatedCe_namelen + 1);
		ModernizedCProgram.fill_stat_cache_info(istate, updated, st/*
			 * If ignore_valid is not set, we should leave CE_VALID bit
			 * alone.  Otherwise, paths marked with --no-assume-unchanged
			 * (i.e. things to be edited) will reacquire CE_VALID bit
			 * automatically, which is not really what we want.
			 */);
		if (!ignore_valid && ModernizedCProgram.assume_unchanged && !(generatedCe_flags & (true))) {
			generatedCe_flags &=  ~(true);
		} 
		return /* istate->cache_changed is updated in the caller */updated;
	}
	public cache_entry refresh_cache_entry(index_state istate, int options) {
		return ce.refresh_cache_ent(istate, options, ((Object)0), ((Object)0/*****************************************************************
		 * Index File I/O
		 *****************************************************************/));
	}
	public cache_entry create_from_disk(mem_pool ce_mem_pool, int version, ondisk_cache_entry ondisk, Long ent_size, Object previous_ce) {
		cache_entry ce = new cache_entry();
		size_t len = new size_t();
		byte name;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		Object generatedData = ondisk.getData();
		uint16_t flagsp = (uint16_t)(generatedData + hashsz);
		int flags;
		size_t copy_len = 0/*
			 * Adjacent cache entries tend to share the leading paths, so it makes
			 * sense to only store the differences in later entries.  In the v4
			 * on-disk format of the index, each on-disk cache entry stores the
			 * number of bytes to be stripped from the end of the previous name,
			 * and the bytes to append to the result, to come up with its name.
			 */;
		int expand_name_field = version == 4;
		flags = /*Error: Function owner not recognized*/get_be16(/* On-disk flags are just 16 bits */flagsp);
		len = flags & (true);
		if (flags & (true)) {
			int extended_flags;
			extended_flags = /*Error: Function owner not recognized*/get_be16(flagsp + 1) << 16;
			if (extended_flags & ~((1 << 29) | (1 << /* We do not yet understand any bit out of CE_EXTENDED_FLAGS */30))) {
				ModernizedCProgram.die(ModernizedCProgram._("unknown index entry format 0x%08x"), extended_flags);
			} 
			flags |=  extended_flags;
			name = (byte)(flagsp + 2);
		} else {
				name = (byte)(flagsp + 1);
		} 
		if (expand_name_field) {
			byte cp = (byte)name;
			size_t strip_len = new size_t();
			size_t previous_len = new size_t();
			strip_len = ModernizedCProgram.decode_varint(/* If we're at the begining of a block, ignore the previous name */cp);
			if (previous_ce) {
				previous_len = previous_ce.getCe_namelen();
				if (previous_len < strip_len) {
					ModernizedCProgram.die(ModernizedCProgram._("malformed name field in the index, near path '%s'"), previous_ce.getName());
				} 
				copy_len = previous_len - strip_len;
			} 
			name = (byte)cp;
		} 
		if (len == (true)) {
			len = /*Error: Function owner not recognized*/strlen(name);
			if (expand_name_field) {
				len += copy_len;
			} 
		} 
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.mem_pool__ce_alloc(ce_mem_pool, len);
		cache_time generatedCtime = ondisk.getCtime();
		Object generatedSec = generatedCtime.getSec();
		stat_data generatedCe_stat_data = ce.getCe_stat_data();
		cache_time generatedSd_ctime = generatedCe_stat_data.getSd_ctime();
		generatedSd_ctime.setSec(/*Error: Function owner not recognized*/get_be32(generatedSec));
		cache_time generatedSd_mtime = generatedCe_stat_data.getSd_mtime();
		generatedSd_mtime.setSec(/*Error: Function owner not recognized*/get_be32(generatedSec));
		Object generatedNsec = generatedCtime.getNsec();
		generatedSd_ctime.setNsec(/*Error: Function owner not recognized*/get_be32(generatedNsec));
		generatedSd_mtime.setNsec(/*Error: Function owner not recognized*/get_be32(generatedNsec));
		Object generatedDev = ondisk.getDev();
		generatedCe_stat_data.setSd_dev(/*Error: Function owner not recognized*/get_be32(generatedDev));
		Object generatedIno = ondisk.getIno();
		generatedCe_stat_data.setSd_ino(/*Error: Function owner not recognized*/get_be32(generatedIno));
		Object generatedMode = ondisk.getMode();
		ce.setCe_mode(/*Error: Function owner not recognized*/get_be32(generatedMode));
		Object generatedUid = ondisk.getUid();
		generatedCe_stat_data.setSd_uid(/*Error: Function owner not recognized*/get_be32(generatedUid));
		Object generatedGid = ondisk.getGid();
		generatedCe_stat_data.setSd_gid(/*Error: Function owner not recognized*/get_be32(generatedGid));
		Object generatedSize = ondisk.getSize();
		generatedCe_stat_data.setSd_size(/*Error: Function owner not recognized*/get_be32(generatedSize));
		ce.setCe_flags(flags & ~(true));
		ce.setCe_namelen(len);
		ce.setIndex(0);
		object_id generatedOid = ce.getOid();
		Object generatedHash = generatedOid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, generatedData);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, name, len);
		generatedName[len] = (byte)'\0';
		int generatedCe_flags = (ce).getCe_flags();
		int generatedCe_namelen = (ce).getCe_namelen();
		if (expand_name_field) {
			if (copy_len) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, generatedName, copy_len);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName + copy_len, name, len + 1 - copy_len);
			ent_size = (name - ((byte)ondisk)) + len + 1 - copy_len;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, name, len + 1);
				ent_size = (((((size_t)generatedData) + ((ModernizedCProgram.the_repository.getHash_algo().getRawsz() + ((generatedCe_flags & (true)) ? 2 : 1) * /*Error: Unsupported expression*/ + (generatedCe_namelen))) + 8) & ~7));
		} 
		return ce;
	}
	public cache_entry dup_cache_entry(Object ce, index_state istate) {
		int size = (((size_t)((cache_entry)0).getName()) + (((ce).getCe_namelen())) + 1);
		int mem_pool_allocated;
		cache_entry cache_entry = new cache_entry();
		cache_entry new_entry = cache_entry.make_empty_cache_entry(istate, ((ce).getCe_namelen()));
		int generatedMem_pool_allocated = new_entry.getMem_pool_allocated();
		mem_pool_allocated = generatedMem_pool_allocated;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(new_entry, ce, size);
		new_entry.setMem_pool_allocated(mem_pool_allocated);
		return new_entry;
	}
	public void discard_cache_entry() {
		int generatedCe_namelen = this.getCe_namelen();
		if (ce && ModernizedCProgram.should_validate_cache_entries()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ce, -1024, (((size_t)((cache_entry)0).getName()) + (generatedCe_namelen) + 1));
		} 
		int generatedMem_pool_allocated = this.getMem_pool_allocated();
		if (ce && generatedMem_pool_allocated) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.free(ce);
	}
	public void copy_cache_entry(Object src) {
		int generatedCe_flags = this.getCe_flags();
		int state = generatedCe_flags & (1 << 20);
		int generatedMem_pool_allocated = this.getMem_pool_allocated();
		int mem_pool_allocated = generatedMem_pool_allocated;
		stat_data generatedCe_stat_data = this.getCe_stat_data();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedCe_stat_data, generatedCe_stat_data, ((size_t)((cache_entry)0).getName()) - ((size_t)generatedCe_stat_data));
		this.setCe_flags((generatedCe_flags & ~(1 << 20)) | /* Restore the hash state */state);
		this.setMem_pool_allocated(/* Restore the mem_pool_allocated flag */mem_pool_allocated);
	}
	public void mark_ce_for_checkout_overlay(Byte ps_matched, Object opts) {
		int generatedCe_flags = this.getCe_flags();
		generatedCe_flags &=  ~(1 << 26);
		if (!opts.getIgnore_skipworktree() && (generatedCe_flags & (1 << 30))) {
			return /*Error: Unsupported expression*/;
		} 
		if (opts.getSource_tree() && !(generatedCe_flags & (1 << 16/*
				 * "git checkout tree-ish -- path", but this entry
				 * is in the original index but is not in tree-ish
				 * or does not match the pathspec; it will not be
				 * checked out to the working tree.  We will not do
				 * anything to this entry at all.
				 */))) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.ce_path_match(ModernizedCProgram.the_index, ce, opts.getPathspec(), ps_matched)) {
			generatedCe_flags |=  (1 << 26);
		} 
	}
	public void mark_ce_for_checkout_no_overlay(Byte ps_matched, Object opts) {
		int generatedCe_flags = this.getCe_flags();
		generatedCe_flags &=  ~(1 << 26);
		if (!opts.getIgnore_skipworktree() && (generatedCe_flags & (1 << 30))) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.ce_path_match(ModernizedCProgram.the_index, ce, opts.getPathspec(), ps_matched)) {
			generatedCe_flags |=  (1 << 26);
			if (opts.getSource_tree() && !(generatedCe_flags & (1 << 16/*
						 * In overlay mode, but the path is not in
						 * tree-ish, which means we should remove it
						 * from the index and the working tree.
						 */))) {
				generatedCe_flags |=  (1 << 17) | (1 << 22);
			} 
		} 
	}
	public int verify_cache(int entries, int flags) {
		int i;
		int funny;
		int silent = flags & 8;
		funny = /* Verify that the tree is merged */0;
		for (i = 0; i < entries; i++) {
			cache_entry ce = cache[i];
			if ((((true) & (ce).getCe_flags()) >> 12)) {
				if (silent) {
					return -1;
				} 
				if (10 < ++funny) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "...\n");
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: unmerged (%s)\n", ce.getName(), ModernizedCProgram.oid_to_hex(ce.getOid()));
			} 
		}
		if (funny) {
			return -1/* Also verify that the cache does not have path and path/file
				 * at the same time.  At this point we know the cache has only
				 * stage 0 entries.
				 */;
		} 
		funny = 0;
		for (i = 0; i < entries - 1; i/* path/file always comes after path because of the way
				 * the cache is sorted.  Also path can appear only once,
				 * which means conflicting one would immediately follow.
				 */++) {
			byte this_name = cache[i].getName();
			byte next_name = cache[i + 1].getName();
			int this_len = /*Error: Function owner not recognized*/strlen(this_name);
			if (this_len < /*Error: Function owner not recognized*/strlen(next_name) && /*Error: Function owner not recognized*/strncmp(this_name, next_name, this_len) == 0 && next_name[this_len] == (byte)'/') {
				if (10 < ++funny) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "...\n");
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "You have both %s and %s\n", this_name, next_name);
			} 
		}
		if (funny) {
			return -1;
		} 
		return 0;
	}
	public cache_entry read_one_ent(Object which, object_id ent, Object path, int namelen, int stage) {
		int mode;
		object_id oid = new object_id();
		cache_entry ce = new cache_entry();
		if (ModernizedCProgram.get_tree_entry(ModernizedCProgram.the_repository, ent, path, oid, mode)) {
			if (which) {
				();
			} 
			return ((Object)0);
		} 
		if (mode == -1024) {
			if (which) {
				();
			} 
			return ((Object)0);
		} 
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_cache_entry(ModernizedCProgram.the_index, namelen);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(oid);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path, namelen);
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(stage));
		ce.setCe_namelen(namelen);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode));
		return ce;
	}
	public int compare_ce_content(cache_entry b) {
		int ondisk_flags = (true) | (true) | ((1 << 29) | (1 << 30));
		int generatedCe_flags = this.getCe_flags();
		int ce_flags = generatedCe_flags;
		int base_flags = generatedCe_flags;
		int ret;
		generatedCe_flags &=  /* only on-disk flags matter */ondisk_flags;
		generatedCe_flags &=  ondisk_flags;
		stat_data generatedCe_stat_data = this.getCe_stat_data();
		ret = /*Error: Function owner not recognized*/memcmp(generatedCe_stat_data, generatedCe_stat_data, ((size_t)((cache_entry)0).getName()) - ((size_t)generatedCe_stat_data));
		this.setCe_flags(ce_flags);
		b.setCe_flags(base_flags);
		return ret;
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public stat_data getCe_stat_data() {
		return ce_stat_data;
	}
	public void setCe_stat_data(stat_data newCe_stat_data) {
		ce_stat_data = newCe_stat_data;
	}
	public int getCe_mode() {
		return ce_mode;
	}
	public void setCe_mode(int newCe_mode) {
		ce_mode = newCe_mode;
	}
	public int getCe_flags() {
		return ce_flags;
	}
	public void setCe_flags(int newCe_flags) {
		ce_flags = newCe_flags;
	}
	public int getMem_pool_allocated() {
		return mem_pool_allocated;
	}
	public void setMem_pool_allocated(int newMem_pool_allocated) {
		mem_pool_allocated = newMem_pool_allocated;
	}
	public int getCe_namelen() {
		return ce_namelen;
	}
	public void setCe_namelen(int newCe_namelen) {
		ce_namelen = newCe_namelen;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
/*
 * Create a cache_entry that is not intended to be added to an index.
 * Caller is responsible for discarding the cache_entry
 * with `discard_cache_entry`.
 */
/*
 * Discard cache entry.
 */
/*
 * Validate the cache entries in the index.  This is an internal
 * consistency check that the cache_entry structs are allocated from
 * the expected memory pool.
 */
/*
 * Searches for an entry defined by name and namelen in the given index.
 * If the return value is positive (including 0) it is the position of an
 * exact match. If the return value is negative, the negated value minus 1
 * is the position where the entry would be inserted.
 * Example: The current index consists of these files and its stages:
 *
 *   b#0, d#0, f#1, f#3
 *
 * index_name_pos(&index, "a", 1) -> -1
 * index_name_pos(&index, "b", 1) ->  0
 * index_name_pos(&index, "c", 1) -> -2
 * index_name_pos(&index, "d", 1) ->  1
 * index_name_pos(&index, "e", 1) -> -3
 * index_name_pos(&index, "f", 1) -> -3
 * index_name_pos(&index, "g", 1) -> -5
 */
