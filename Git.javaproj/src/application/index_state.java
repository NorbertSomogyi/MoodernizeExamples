package application;

public class index_state {
	private cache_entry[][] cache;
	private int version;
	private int cache_nr;
	private int cache_alloc;
	private int cache_changed;
	private string_list resolve_undo;
	private cache_tree cache_tree;
	private split_index split_index;
	private cache_time timestamp;
	private int name_hash_initialized;
	private int initialized;
	private int drop_cache_tree;
	private int updated_workdir;
	private int updated_skipworktree;
	private int fsmonitor_has_run_once;
	private hashmap name_hash;
	private hashmap dir_hash;
	private object_id oid;
	private untracked_cache untracked;
	private Object fsmonitor_last_update;
	private ewah_bitmap fsmonitor_dirty;
	private mem_pool ce_mem_pool;
	
	public index_state(cache_entry[][] cache, int version, int cache_nr, int cache_alloc, int cache_changed, string_list resolve_undo, cache_tree cache_tree, split_index split_index, cache_time timestamp, int name_hash_initialized, int initialized, int drop_cache_tree, int updated_workdir, int updated_skipworktree, int fsmonitor_has_run_once, hashmap name_hash, hashmap dir_hash, object_id oid, untracked_cache untracked, Object fsmonitor_last_update, ewah_bitmap fsmonitor_dirty, mem_pool ce_mem_pool) {
		setCache(cache);
		setVersion(version);
		setCache_nr(cache_nr);
		setCache_alloc(cache_alloc);
		setCache_changed(cache_changed);
		setResolve_undo(resolve_undo);
		setCache_tree(cache_tree);
		setSplit_index(split_index);
		setTimestamp(timestamp);
		setName_hash_initialized(name_hash_initialized);
		setInitialized(initialized);
		setDrop_cache_tree(drop_cache_tree);
		setUpdated_workdir(updated_workdir);
		setUpdated_skipworktree(updated_skipworktree);
		setFsmonitor_has_run_once(fsmonitor_has_run_once);
		setName_hash(name_hash);
		setDir_hash(dir_hash);
		setOid(oid);
		setUntracked(untracked);
		setFsmonitor_last_update(fsmonitor_last_update);
		setFsmonitor_dirty(fsmonitor_dirty);
		setCe_mem_pool(ce_mem_pool);
	}
	public index_state() {
	}
	
	public void normalize_file(Object mm, Object path) {
		strbuf strbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Object generatedLen = strbuf.getLen();
		if (strbuf.renormalize_buffer(istate, path, mm.getPtr(), mm.getSize())) {
			ModernizedCProgram.free(mm.getPtr());
			mm.setSize(generatedLen);
			mm.setPtr(strbuf.strbuf_detach(((Object)0)));
		} 
	}
	public int ll_merge(Object result_buf, Object path, Object ancestor, Object ancestor_label, Object ours, Object our_label, Object theirs, Object their_label, Object opts) {
		attr_check attr_check = new attr_check();
		attr_check check = attr_check.load_merge_attributes();
		ll_merge_options default_opts = new ll_merge_options();
		byte ll_driver_name = ((Object)0);
		int marker_size = DEFAULT_CONFLICT_MARKER_SIZE;
		ll_merge_driver driver = new ll_merge_driver();
		if (!opts) {
			opts = default_opts;
		} 
		if (opts.getRenormalize()) {
			istate.normalize_file(ancestor, path);
			istate.normalize_file(ours, path);
			istate.normalize_file(theirs, path);
		} 
		check.git_check_attr(istate, path);
		attr_check_item[] generatedItems = check.getItems();
		ll_driver_name = generatedItems[0].getValue();
		if (generatedItems[1].getValue()) {
			marker_size = /*Error: Function owner not recognized*/atoi(generatedItems[1].getValue());
			if (marker_size <= 0) {
				marker_size = DEFAULT_CONFLICT_MARKER_SIZE;
			} 
		} 
		driver = ModernizedCProgram.find_ll_merge_driver(ll_driver_name);
		if (opts.getVirtual_ancestor()) {
			if (driver.getRecursive()) {
				driver = ModernizedCProgram.find_ll_merge_driver(driver.getRecursive());
			} 
		} 
		if (opts.getExtra_marker_size()) {
			marker_size += opts.getExtra_marker_size();
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(driver, result_buf, path, ancestor, ancestor_label, ours, our_label, theirs, their_label, opts, marker_size);
	}
	public int ll_merge_marker_size(Object path) {
		attr_check check = new attr_check();
		int marker_size = DEFAULT_CONFLICT_MARKER_SIZE;
		attr_check attr_check = new attr_check();
		if (!check) {
			check = attr_check.attr_check_initl("conflict-marker-size", ((Object)0));
		} 
		check.git_check_attr(istate, path);
		attr_check_item[] generatedItems = check.getItems();
		if (generatedItems[0].getValue()) {
			marker_size = /*Error: Function owner not recognized*/atoi(generatedItems[0].getValue());
			if (marker_size <= 0) {
				marker_size = DEFAULT_CONFLICT_MARKER_SIZE;
			} 
		} 
		return marker_size;
	}
	public void report_collided_checkout() {
		string_list list = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		int i;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedCe_flags = ce.getCe_flags();
		Object generatedName = ce.getName();
		string_list_item string_list_item = new string_list_item();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (!(generatedCe_flags & (1 << 26))) {
				continue;
			} 
			string_list_item.string_list_append(list, generatedName);
			generatedCe_flags &=  ~(1 << 26);
		}
		list.setCmp(ModernizedCProgram.fspathcmp);
		list.string_list_sort();
		int generatedNr = list.getNr();
		string_list_item[] generatedItems = list.getItems();
		if (generatedNr) {
			ModernizedCProgram.warning(ModernizedCProgram._("the following paths have collided (e.g. case-sensitive paths\non a case-insensitive filesystem) and only one from the same\ncolliding group is in the working tree:\n"));
			for (i = 0; i < generatedNr; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "  '%s'\n", generatedItems[i].getString());
			}
		} 
		list.string_list_clear(0);
	}
	public void mark_all_ce_unused() {
		int i;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		for (i = 0; i < generatedCache_nr; i++) {
			generatedCache[i].getCe_flags() &=  ~((1 << 24) | (1 << 19) | (1 << 25));
		}
	}
	public int read_one_entry_opt(Object oid, Object base, int baselen, Object pathname, int mode, int stage, int opt) {
		int len;
		cache_entry ce = new cache_entry();
		if ((((mode) & -1024) == -1024)) {
			return 1;
		} 
		len = /*Error: Function owner not recognized*/strlen(pathname);
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_cache_entry(istate, baselen + len);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode));
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(stage));
		ce.setCe_namelen(baselen + len);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, base, baselen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName + baselen, pathname, len + 1);
		object_id generatedOid = ce.getOid();
		generatedOid.oidcpy(oid);
		return ModernizedCProgram.add_index_entry(istate, ce, opt);
	}
	public int whitespace_rule(Object pathname) {
		attr_check attr_whitespace_rule = new attr_check();
		byte value;
		attr_check attr_check = new attr_check();
		if (!attr_whitespace_rule) {
			attr_whitespace_rule = attr_check.attr_check_initl("whitespace", ((Object)0));
		} 
		attr_whitespace_rule.git_check_attr(istate, pathname);
		attr_check_item[] generatedItems = attr_whitespace_rule.getItems();
		value = generatedItems[0].getValue();
		if (((value) == ModernizedCProgram.git_attr__true)) {
			int all_rule = ((ModernizedCProgram.whitespace_rule_cfg) & /* true (whitespace) */77);
			int i;
			for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
				if (!whitespace_rule_names[i].getLoosens_error() && !whitespace_rule_names[i].getExclude_default()) {
					all_rule |=  whitespace_rule_names[i].getRule_bits();
				} 
			}
			return all_rule;
		}  else if (((value) == ModernizedCProgram.git_attr__false)) {
			return ((ModernizedCProgram.whitespace_rule_cfg) & /* false (-whitespace) */77);
		}  else if (((value) == ((Object)0))) {
			return /* reset to default (!whitespace) */ModernizedCProgram.whitespace_rule_cfg;
		} else {
				return ModernizedCProgram.parse_whitespace_rule(/* string */value);
		} 
	}
	public Object get_archive_attrs(Object path) {
		attr_check check = new attr_check();
		attr_check attr_check = new attr_check();
		if (!check) {
			check = attr_check.attr_check_initl("export-ignore", "export-subst", ((Object)0));
		} 
		check.git_check_attr(istate, path);
		return check;
	}
	public Object three_way_filemerge(Object path, Object base, Object our, Object their, Long size) {
		int merge_status;
		 res = new ();
		/*
			 * This function is only used by cmd_merge_tree, which
			 * does not respect the merge.conflictstyle option.
			 * There is no need to worry about a label for the
			 * common ancestor.
			 */
		merge_status = istate.ll_merge(res, path, base, ((Object)0), our, ".our", their, ".their", ((Object)0));
		if (merge_status < 0) {
			return ((Object)0);
		} 
		size = res.getSize();
		return res.getPtr();
	}
	public int is_staging_gitmodules_ok() {
		int pos = ModernizedCProgram.index_name_pos(istate, ".gitmodules", /*Error: Function owner not recognized*/strlen(".gitmodules"));
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		if ((pos >= 0) && (pos < generatedCache_nr)) {
			stat st = new stat();
			if (/*Error: Function owner not recognized*/lstat(".gitmodules", st) == 0 && ModernizedCProgram.ie_match_stat(istate, generatedCache[pos], st, 0) & -1024) {
				return 0;
			} 
		} 
		return 1;
	}
	public void stage_updated_gitmodules() {
		if (istate.add_file_to_index(".gitmodules", 0)) {
			ModernizedCProgram.die(ModernizedCProgram._("staging updated .gitmodules failed"));
		} 
	}
	public int lookup_lazy_params() {
		int nr_cpus;
		ModernizedCProgram.lazy_nr_dir_threads = 0;
		if (!ModernizedCProgram.lazy_try_threaded) {
			return 0/*
				 * If we are respecting case, just use the original
				 * code to build the "istate->name_hash".  We don't
				 * need the complexity here.
				 */;
		} 
		if (!ModernizedCProgram.ignore_case) {
			return 0;
		} 
		nr_cpus = ModernizedCProgram.online_cpus();
		if (nr_cpus < 2) {
			return 0;
		} 
		int generatedCache_nr = this.getCache_nr();
		if (generatedCache_nr < 2 * (true)) {
			return 0;
		} 
		if (generatedCache_nr < nr_cpus * (true)) {
			nr_cpus = generatedCache_nr / (true);
		} 
		ModernizedCProgram.lazy_nr_dir_threads = nr_cpus;
		return ModernizedCProgram.lazy_nr_dir_threads/*
		 * Initialize n mutexes for use when searching and inserting
		 * into "istate->dir_hash".  All "dir" threads are trying
		 * to insert partial pathnames into the hash as they iterate
		 * over their portions of the index, so lock contention is
		 * high.
		 *
		 * However, the hashmap is going to put items into bucket
		 * chains based on their hash values.  Use that to create n
		 * mutexes and lock on mutex[bucket(hash) % n].  This will
		 * decrease the collision rate by (hopefully) by a factor of n.
		 */;
	}
	public void threaded_lazy_init_name_hash() {
		int err;
		int nr_each;
		int k_start;
		int t;
		lazy_entry lazy_entries = new lazy_entry();
		lazy_dir_thread_data td_dir = new lazy_dir_thread_data();
		lazy_name_thread_data td_name = new lazy_name_thread_data();
		if (!true) {
			return /*Error: Unsupported expression*/;
		} 
		k_start = 0;
		int generatedCache_nr = this.getCache_nr();
		nr_each = (((generatedCache_nr) + (ModernizedCProgram.lazy_nr_dir_threads) - 1) / (ModernizedCProgram.lazy_nr_dir_threads));
		lazy_entries = ModernizedCProgram.xcalloc(generatedCache_nr, /*Error: Unsupported expression*/);
		td_dir = ModernizedCProgram.xcalloc(ModernizedCProgram.lazy_nr_dir_threads, /*Error: Unsupported expression*/);
		td_name = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		ModernizedCProgram.init_dir_mutex();
		Object generatedPthread = td_dir_t.getPthread();
		for (t = 0; t < ModernizedCProgram.lazy_nr_dir_threads; t++) {
			lazy_dir_thread_data td_dir_t = td_dir + t;
			td_dir_t.setIstate(istate);
			td_dir_t.setLazy_entries(lazy_entries);
			td_dir_t.setK_start(k_start);
			k_start += nr_each;
			if (k_start > generatedCache_nr) {
				k_start = generatedCache_nr;
			} 
			td_dir_t.setK_end(k_start);
			err = generatedPthread.pthread_create(((Object)0), lazy_dir_thread_proc, td_dir_t);
			if (err) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to create lazy_dir thread: %s"), /*Error: Function owner not recognized*/strerror(err));
			} 
		}
		for (t = 0; t < ModernizedCProgram.lazy_nr_dir_threads; t++) {
			lazy_dir_thread_data td_dir_t = td_dir + t;
			if (/*Error: Function owner not recognized*/pthread_join(generatedPthread, ((Object)0))) {
				ModernizedCProgram.die("unable to join lazy_dir_thread"/*
					 * Phase 2:
					 * Iterate over all index entries and add them to the "istate->name_hash"
					 * using a single "name" background thread.
					 * (Testing showed it wasn't worth running more than 1 thread for this.)
					 *
					 * Meanwhile, finish updating the parent directory ref-counts for each
					 * index entry using the current thread.  (This step is very fast and
					 * doesn't need threading.)
					 */);
			} 
		}
		td_name.setIstate(istate);
		td_name.setLazy_entries(lazy_entries);
		err = generatedPthread.pthread_create(((Object)0), lazy_name_thread_proc, td_name);
		if (err) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to create lazy_name thread: %s"), /*Error: Function owner not recognized*/strerror(err));
		} 
		ModernizedCProgram.lazy_update_dir_ref_counts(istate, lazy_entries);
		err = /*Error: Function owner not recognized*/pthread_join(generatedPthread, ((Object)0));
		if (err) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to join lazy_name thread: %s"), /*Error: Function owner not recognized*/strerror(err));
		} 
		ModernizedCProgram.cleanup_dir_mutex();
		ModernizedCProgram.free(td_name);
		ModernizedCProgram.free(td_dir);
		ModernizedCProgram.free(lazy_entries);
	}
	public void lazy_init_name_hash() {
		int generatedName_hash_initialized = this.getName_hash_initialized();
		if (generatedName_hash_initialized) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.trace_performance_enter();
		hashmap generatedName_hash = this.getName_hash();
		int generatedCache_nr = this.getCache_nr();
		generatedName_hash.hashmap_init(cache_entry_cmp, ((Object)0), generatedCache_nr);
		hashmap generatedDir_hash = this.getDir_hash();
		generatedDir_hash.hashmap_init(dir_entry_cmp, ((Object)0), generatedCache_nr);
		cache_entry[][] generatedCache = this.getCache();
		if (istate/*
				 * Disable item counting and automatic rehashing because
				 * we do per-chain (mod n) locking rather than whole hashmap
				 * locking and we need to prevent the table-size from changing
				 * and bucket items from being redistributed.
				 */.lookup_lazy_params()) {
			generatedDir_hash.hashmap_disable_item_counting();
			istate.threaded_lazy_init_name_hash();
			generatedDir_hash.hashmap_enable_item_counting();
		} else {
				int nr;
				for (nr = 0; nr < generatedCache_nr; nr++) {
					ModernizedCProgram.hash_index_entry(istate, generatedCache[nr]);
				}
		} 
		this.setName_hash_initialized(1);
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\name-hash.c", 600, ModernizedCProgram.getnanotime(), "initialize name hash");
			} 
		} while (0/*
		 * A test routine for t/helper/ sources.
		 *
		 * Returns the number of threads used or 0 when
		 * the non-threaded code path was used.
		 *
		 * Requesting threading WILL NOT override guards
		 * in lookup_lazy_params().
		 */);
	}
	public int test_lazy_init_name_hash(int try_threaded) {
		ModernizedCProgram.lazy_nr_dir_threads = 0;
		ModernizedCProgram.lazy_try_threaded = try_threaded;
		istate.lazy_init_name_hash();
		return ModernizedCProgram.lazy_nr_dir_threads;
	}
	public int index_dir_exists(Object name, int namelen) {
		dir_entry dir = new dir_entry();
		istate.lazy_init_name_hash();
		dir_entry dir_entry = new dir_entry();
		dir = dir_entry.find_dir_entry(istate, name, namelen);
		int generatedNr = dir.getNr();
		return dir && generatedNr;
	}
	public void adjust_dirname_case(Byte name) {
		byte startPtr = name;
		byte ptr = startPtr;
		istate.lazy_init_name_hash();
		dir_entry dir_entry = new dir_entry();
		Object generatedName = dir.getName();
		while (ptr) {
			while (ptr && ptr != (byte)'/') {
				ptr++;
			}
			if (ptr == (byte)'/') {
				dir_entry dir = new dir_entry();
				dir = dir_entry.find_dir_entry(istate, name, ptr - name);
				if (dir) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)startPtr, generatedName + (startPtr - name), ptr - startPtr);
					startPtr = ptr + 1;
				} 
				ptr++;
			} 
		}
	}
	public void free_name_hash() {
		int generatedName_hash_initialized = this.getName_hash_initialized();
		if (!generatedName_hash_initialized) {
			return /*Error: Unsupported expression*/;
		} 
		this.setName_hash_initialized(0);
		hashmap generatedName_hash = this.getName_hash();
		generatedName_hash.hashmap_free_(-1);
		hashmap generatedDir_hash = this.getDir_hash();
		generatedDir_hash.hashmap_free_(((size_t)((dir_entry)0).getEnt()));
		;
	}
	public void resolve_undo_clear_index() {
		string_list generatedResolve_undo = this.getResolve_undo();
		string_list resolve_undo = generatedResolve_undo;
		if (!resolve_undo) {
			return /*Error: Unsupported expression*/;
		} 
		resolve_undo.string_list_clear(1);
		ModernizedCProgram.free(resolve_undo);
		this.setResolve_undo(((Object)0));
		int generatedCache_changed = this.getCache_changed();
		generatedCache_changed |=  (1 << 4);
	}
	public int unmerge_index_entry_at(int pos) {
		cache_entry ce = new cache_entry();
		string_list_item item = new string_list_item();
		resolve_undo_info ru = new resolve_undo_info();
		int i;
		int err = 0;
		int matched;
		byte name;
		string_list generatedResolve_undo = this.getResolve_undo();
		if (!generatedResolve_undo) {
			return pos;
		} 
		cache_entry[][] generatedCache = this.getCache();
		ce = generatedCache[pos];
		int generatedCache_nr = this.getCache_nr();
		if ((((true) & (ce).getCe_flags()) >> 12)) {
			while ((pos < generatedCache_nr) && !/*Error: Function owner not recognized*/strcmp(generatedCache[pos].getName(), ce.getName())) {
				pos++;
			}
			return pos - /* return the last entry processed */1;
		} 
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_lookup(generatedResolve_undo, ce.getName());
		if (!item) {
			return pos;
		} 
		Object generatedUtil = item.getUtil();
		ru = generatedUtil;
		if (!ru) {
			return pos;
		} 
		matched = ce.getCe_flags() & (1 << 26);
		name = ModernizedCProgram.xstrdup(ce.getName());
		istate.remove_index_entry_at(pos);
		Object generatedMode = ru.getMode();
		Object generatedOid = ru.getOid();
		cache_entry cache_entry = new cache_entry();
		int generatedCe_flags = nce.getCe_flags();
		for (i = 0; i < 3; i++) {
			cache_entry nce = new cache_entry();
			if (!generatedMode[i]) {
				continue;
			} 
			nce = cache_entry.make_cache_entry(istate, generatedMode[i], generatedOid[i], name, i + 1, 0);
			if (matched) {
				generatedCe_flags |=  (1 << 26);
			} 
			if (ModernizedCProgram.add_index_entry(istate, nce, 1)) {
				err = 1;
				();
			} 
		}
		ModernizedCProgram.free(name);
		if (err) {
			return pos;
		} 
		ModernizedCProgram.free(ru);
		item.setUtil(((Object)0));
		return istate.unmerge_index_entry_at(pos);
	}
	public void unmerge_marked_index() {
		int i;
		string_list generatedResolve_undo = this.getResolve_undo();
		if (!generatedResolve_undo) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (ce.getCe_flags() & (1 << 26)) {
				i = istate.unmerge_index_entry_at(i);
			} 
		}
	}
	public void unmerge_index(Object pathspec) {
		int i;
		string_list generatedResolve_undo = this.getResolve_undo();
		if (!generatedResolve_undo) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (!ModernizedCProgram.ce_path_match(istate, ce, pathspec, ((Object)0))) {
				continue;
			} 
			i = istate.unmerge_index_entry_at(i);
		}
	}
	public void rename_index_entry_at(int nr, Object new_name) {
		cache_entry[][] generatedCache = this.getCache();
		cache_entry old_entry = generatedCache[nr];
		cache_entry new_entry = new cache_entry();
		int namelen = /*Error: Function owner not recognized*/strlen(new_name);
		cache_entry cache_entry = new cache_entry();
		new_entry = cache_entry.make_empty_cache_entry(istate, namelen);
		new_entry.copy_cache_entry(old_entry);
		int generatedCe_flags = new_entry.getCe_flags();
		generatedCe_flags &=  ~(1 << 20);
		new_entry.setCe_namelen(namelen);
		new_entry.setIndex(0);
		Object generatedName = new_entry.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, new_name, namelen + 1);
		istate.cache_tree_invalidate_path(generatedName);
		istate.untracked_cache_remove_from_index(generatedName);
		istate.remove_index_entry_at(nr);
		ModernizedCProgram.add_index_entry(istate, new_entry, 1 | 2);
	}
	public int remove_index_entry_at(int pos) {
		cache_entry[][] generatedCache = this.getCache();
		cache_entry ce = generatedCache[pos];
		ModernizedCProgram.record_resolve_undo(istate, ce);
		ModernizedCProgram.remove_name_hash(istate, ce);
		ModernizedCProgram.save_or_free_index_entry(istate, ce);
		int generatedCache_changed = this.getCache_changed();
		generatedCache_changed |=  (1 << 2);
		int generatedCache_nr = this.getCache_nr();
		generatedCache_nr--;
		if (pos >= generatedCache_nr) {
			return 0;
		} 
		ModernizedCProgram.move_array((generatedCache + pos), (generatedCache + pos + 1), (generatedCache_nr - pos), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		return 1/*
		 * Remove all cache entries marked for removal, that is where
		 * CE_REMOVE is set in ce_flags.  This is much more effective than
		 * calling remove_index_entry_at() for each entry to be removed.
		 */;
	}
	public void remove_marked_cache_entries(int invalidate) {
		cache_entry[][] generatedCache = this.getCache();
		cache_entry ce_array = generatedCache;
		int i;
		int j;
		int generatedCache_nr = this.getCache_nr();
		for (i = j = 0; i < generatedCache_nr; i++) {
			if (ce_array[i].getCe_flags() & (1 << 17)) {
				if (invalidate) {
					istate.cache_tree_invalidate_path(ce_array[i].getName());
					istate.untracked_cache_remove_from_index(ce_array[i].getName());
				} 
				ModernizedCProgram.remove_name_hash(istate, ce_array[i]);
				ModernizedCProgram.save_or_free_index_entry(istate, ce_array[i]);
			} else {
					ce_array[j++] = ce_array[i];
			} 
		}
		if (j == generatedCache_nr) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedCache_changed = this.getCache_changed();
		generatedCache_changed |=  (1 << 2);
		this.setCache_nr(j);
	}
	public int remove_file_from_index(Object path) {
		int pos = ModernizedCProgram.index_name_pos(istate, path, /*Error: Function owner not recognized*/strlen(path));
		if (pos < 0) {
			pos = -pos - 1;
		} 
		istate.cache_tree_invalidate_path(path);
		istate.untracked_cache_remove_from_index(path);
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		while (pos < generatedCache_nr && !/*Error: Function owner not recognized*/strcmp(generatedCache[pos].getName(), path)) {
			istate.remove_index_entry_at(pos);
		}
		return 0;
	}
	public int index_name_pos_also_unmerged(Object path, int namelen) {
		int pos = ModernizedCProgram.index_name_pos(istate, path, namelen);
		cache_entry ce = new cache_entry();
		if (pos >= 0) {
			return pos;
		} 
		pos = -1 - /* maybe unmerged? */pos;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		if (pos >= generatedCache_nr || (ce = generatedCache[pos]).compare_name(path, namelen)) {
			return -1;
		} 
		int generatedCe_flags = (ce).getCe_flags();
		if ((((true) & generatedCe_flags) >> 12) == 1 && pos + 1 < generatedCache_nr && (((true) & generatedCe_flags) >> 12) == 2 && !ce.compare_name(path, namelen)) {
			pos++;
		} 
		return pos;
	}
	public int add_file_to_index(Object path, int flags) {
		stat st = new stat();
		if (/*Error: Function owner not recognized*/lstat(path, st)) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to stat '%s'"), path);
		} 
		return ModernizedCProgram.add_to_index(istate, path, st, flags);
	}
	public int has_file_name(Object ce, int pos, int ok_to_replace) {
		int retval = 0;
		int len = ((ce).getCe_namelen());
		int stage = (((true) & (ce).getCe_flags()) >> 12);
		byte name = ce.getName();
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedCe_namelen = (p).getCe_namelen();
		Object generatedName = p.getName();
		int generatedCe_flags = (p).getCe_flags();
		while (pos < generatedCache_nr) {
			cache_entry p = generatedCache[pos++];
			if (len >= (generatedCe_namelen)) {
				break;
			} 
			if (/*Error: Function owner not recognized*/memcmp(name, generatedName, len)) {
				break;
			} 
			if ((((true) & generatedCe_flags) >> 12) != stage) {
				continue;
			} 
			if (generatedName[len] != (byte)'/') {
				continue;
			} 
			if (generatedCe_flags & (1 << 17)) {
				continue;
			} 
			retval = -1;
			if (!ok_to_replace) {
				break;
			} 
			istate.remove_index_entry_at(--pos);
		}
		return retval/*
		 * Like strcmp(), but also return the offset of the first change.
		 * If strings are equal, return the length.
		 */;
	}
	public int has_dir_name(Object ce, int pos, int ok_to_replace) {
		int retval = 0;
		int stage = (((true) & (ce).getCe_flags()) >> 12);
		byte name = ce.getName();
		byte slash = name + ((ce).getCe_namelen());
		size_t len_eq_last = new size_t();
		int cmp_last = 0/*
			 * We are frequently called during an iteration on a sorted
			 * list of pathnames and while building a new index.  Therefore,
			 * there is a high probability that this entry will eventually
			 * be appended to the index, rather than inserted in the middle.
			 * If we can confirm that, we can avoid binary searches on the
			 * components of the pathname.
			 *
			 * Compare the entry's full path with the last path in the index.
			 */;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		if (generatedCache_nr > 0) {
			cmp_last = ModernizedCProgram.strcmp_offset(name, generatedCache[generatedCache_nr - 1].getName(), len_eq_last);
			if (cmp_last > 0) {
				if (len_eq_last == 0/*
								 * The entry sorts AFTER the last one in the
								 * index and their paths have no common prefix,
								 * so there cannot be a F/D conflict.
								 */) {
					return retval/*
									 * The entry sorts AFTER the last one in the
									 * index, but has a common prefix.  Fall through
									 * to the loop below to disect the entry's path
									 * and see where the difference is.
									 */;
				} 
			}  else if (cmp_last == 0/*
						 * The entry exactly matches the last one in the
						 * index, but because of multiple stage and CE_REMOVE
						 * items, we fall through and let the regular search
						 * code handle it.
						 */) {
			} 
		} 
		int generatedCe_namelen = (p).getCe_namelen();
		Object generatedName = p.getName();
		int generatedCe_flags = (p).getCe_flags();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			size_t len = new size_t();
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (--slash == (byte)'/') {
					break;
				} 
				if (slash <= ce.getName()) {
					return retval;
				} 
			}
			ModernizedCProgram.len = slash - name;
			if (cmp_last > 0/*
						 * (len + 1) is a directory boundary (including
						 * the trailing slash).  And since the loop is
						 * decrementing "slash", the first iteration is
						 * the longest directory prefix; subsequent
						 * iterations consider parent directories.
						 */) {
				if (ModernizedCProgram.len + 1 <= len_eq_last/*
								 * The directory prefix (including the trailing
								 * slash) also appears as a prefix in the last
								 * entry, so the remainder cannot collide (because
								 * strcmp said the whole path was greater).
								 *
								 * EQ: last: xxx/A
								 *     this: xxx/B
								 *
								 * LT: last: xxx/file_A
								 *     this: xxx/file_B
								 */) {
					return retval;
				} 
				if (ModernizedCProgram.len > len_eq_last/*
								 * This part of the directory prefix (excluding
								 * the trailing slash) is longer than the known
								 * equal portions, so this sub-directory cannot
								 * collide with a file.
								 *
								 * GT: last: xxxA
								 *     this: xxxB/file
								 */) {
					return retval;
				} 
				if (generatedCache_nr > 0 && ((generatedCache[generatedCache_nr - 1]).getCe_namelen()) > ModernizedCProgram.len/*
								 * The directory prefix lines up with part of
								 * a longer file or directory name, but sorts
								 * after it, so this sub-directory cannot
								 * collide with a file.
								 *
								 * last: xxx/yy-file (because '-' sorts before '/')
								 * this: xxx/yy/abc
								 */) {
					return retval/*
								 * This is a possible collision. Fall through and
								 * let the regular search code handle it.
								 *
								 * last: xxx
								 * this: xxx/file
								 */;
				} 
			} 
			pos = ModernizedCProgram.index_name_stage_pos(istate, name, ModernizedCProgram.len, stage);
			if (pos >= 0/*
						 * Found one, but not so fast.  This could
						 * be a marker that says "I was here, but
						 * I am being removed".  Such an entry is
						 * not a part of the resulting tree, and
						 * it is Ok to have a directory at the same
						 * path.
						 */) {
				if (!(generatedCache[pos].getCe_flags() & (1 << 17))) {
					retval = -1;
					if (!ok_to_replace) {
						break;
					} 
					istate.remove_index_entry_at(pos);
					continue;
				} 
			} else {
					pos = -pos - 1/*
							 * Trivial optimization: if we find an entry that
							 * already matches the sub-directory, then we know
							 * we're ok, and we can exit.
							 */;
			} 
			while (pos < generatedCache_nr) {
				cache_entry p = generatedCache[pos];
				if (((generatedCe_namelen) <= ModernizedCProgram.len) || (generatedName[ModernizedCProgram.len] != (byte)'/') || /*Error: Function owner not recognized*/memcmp(generatedName, name, ModernizedCProgram.len)) {
					break;
				} 
				if ((((true) & generatedCe_flags) >> 12) == stage && !(generatedCe_flags & (1 << 17/*
								 * p is at the same stage as our entry, and
								 * is a subdirectory of what we are looking
								 * at, so we cannot have conflicts at our
								 * level or anything shorter.
								 */))) {
					return retval;
				} 
				pos++;
			}
		}
		return retval/* We may be in a situation where we already have path/file and path
		 * is being added, or we already have path and path/file is being
		 * added.  Either one would result in a nonsense tree that has path
		 * twice when git-write-tree tries to write it out.  Prevent it.
		 *
		 * If ok-to-replace is specified, we remove the conflicting entries
		 * from the cache so the caller should recompute the insert position.
		 * When this happens, we return non-zero.
		 */;
	}
	public int check_file_directory_conflict(Object ce, int pos, int ok_to_replace) {
		int retval;
		/*
			 * When ce is an "I am going away" entry, we allow it to be added
			 */
		if (ce.getCe_flags() & (1 << 17)) {
			return 0/*
				 * We check if the path is a sub-path of a subsequent pathname
				 * first, since removing those will not change the position
				 * in the array.
				 */;
		} 
		retval = istate.has_file_name(ce, pos, ok_to_replace/*
			 * Then check if the path might have a clashing sub-directory
			 * before it.
			 */);
		return retval + istate.has_dir_name(ce, pos, ok_to_replace);
	}
	public int refresh_index(int flags, Object pathspec, Byte seen, Object header_msg) {
		int i;
		int has_errors = 0;
		int really = (flags & -1024) != 0;
		int allow_unmerged = (flags & -1024) != 0;
		int quiet = (flags & -1024) != 0;
		int not_new = (flags & -1024) != 0;
		int ignore_submodules = (flags & -1024) != 0;
		int first = 1;
		int in_porcelain = (flags & -1024);
		int options = (-1024 | (really ? 1 : 0) | (not_new ? -1024 : 0));
		byte modified_fmt;
		byte deleted_fmt;
		byte typechange_fmt;
		byte added_fmt;
		byte unmerged_fmt;
		progress progress = ((Object)0);
		int generatedCache_nr = this.getCache_nr();
		progress progress = new progress();
		if (flags & -1024 && /*Error: Function owner not recognized*/isatty(2)) {
			progress = progress.start_delayed_progress(ModernizedCProgram._("Refresh index"), generatedCache_nr);
		} 
		ModernizedCProgram.trace_performance_enter();
		modified_fmt = in_porcelain ? "M\t%s\n" : "%s: needs update\n";
		deleted_fmt = in_porcelain ? "D\t%s\n" : "%s: needs update\n";
		typechange_fmt = in_porcelain ? "T\t%s\n" : "%s: needs update\n";
		added_fmt = in_porcelain ? "A\t%s\n" : "%s: needs update\n";
		unmerged_fmt = in_porcelain ? "U\t%s\n" : "%s: needs merge\n"/*
			 * Use the multi-threaded preload_index() to refresh most of the
			 * cache entries quickly then in the single threaded loop below,
			 * we only have to do the special cases that are left.
			 */;
		istate.preload_index(pathspec, 0);
		cache_entry[][] generatedCache = this.getCache();
		int generatedCe_mode = ce.getCe_mode();
		int generatedCe_flags = (ce).getCe_flags();
		Object generatedName = ce.getName();
		int generatedCache_changed = this.getCache_changed();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = new cache_entry();
			cache_entry new_entry = new cache_entry();
			int cache_errno = 0;
			int changed = 0;
			int filtered = 0;
			ce = generatedCache[i];
			if (ignore_submodules && (((generatedCe_mode) & -1024) == 160000)) {
				continue;
			} 
			if (pathspec && !ModernizedCProgram.ce_path_match(istate, ce, pathspec, seen)) {
				filtered = 1;
			} 
			if ((((true) & generatedCe_flags) >> 12)) {
				while ((i < generatedCache_nr) && !/*Error: Function owner not recognized*/strcmp(generatedCache[i].getName(), generatedName)) {
					i++;
				}
				i--;
				if (allow_unmerged) {
					continue;
				} 
				if (!filtered) {
					ModernizedCProgram.show_file(unmerged_fmt, generatedName, in_porcelain, first, header_msg);
				} 
				has_errors = 1;
				continue;
			} 
			if (filtered) {
				continue;
			} 
			new_entry = ce.refresh_cache_ent(istate, options, cache_errno, changed);
			if (new_entry == ce) {
				continue;
			} 
			if (progress) {
				progress.display_progress(i);
			} 
			if (!new_entry) {
				byte fmt;
				if (really && cache_errno == 22/* If we are doing --really-refresh that
								 * means the index is not valid anymore.
								 */) {
					generatedCe_flags &=  ~(true);
					generatedCe_flags |=  (1 << 27);
					ModernizedCProgram.mark_fsmonitor_invalid(istate, ce);
					generatedCache_changed |=  (1 << 1);
				} 
				if (quiet) {
					continue;
				} 
				if (cache_errno == 2) {
					fmt = deleted_fmt;
				}  else if ((generatedCe_flags & (1 << 29))) {
					fmt = /* must be before other checks */added_fmt;
				}  else if (changed & -1024) {
					fmt = typechange_fmt;
				} else {
						fmt = modified_fmt;
				} 
				ModernizedCProgram.show_file(fmt, generatedName, in_porcelain, first, header_msg);
				has_errors = 1;
				continue;
			} 
			ModernizedCProgram.replace_index_entry(istate, i, new_entry);
		}
		if (progress) {
			progress.display_progress(generatedCache_nr);
			progress.stop_progress();
		} 
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 1605, ModernizedCProgram.getnanotime(), "refresh index");
			} 
		} while (0);
		return has_errors;
	}
	public int read_index_extension(Object[] ext, Object data, long sz) {
		cache_tree cache_tree = new cache_tree();
		string_list string_list = new string_list();
		untracked_cache untracked_cache = new untracked_cache();
		switch (((ext[0] << 24) | (ext[1] << 16) | (ext[2] << 8) | (ext[3]))) {
		case -1024:
				this.setUntracked(untracked_cache.read_untracked_extension(data, sz));
				break;
		case -1024/* already handled in do_read_index() */:
				break;
		case -1024:
				istate.read_fsmonitor_extension(data, sz);
				break;
		case -1024:
				this.setCache_tree(cache_tree.cache_tree_read(data, sz));
				break;
		case -1024:
				this.setResolve_undo(string_list.resolve_undo_read(data, sz));
				break;
		case -1024:
				if (istate.read_link_extension(data, sz)) {
					return -1;
				} 
				break;
		case -1024:
		default:
				if (ext < (byte)'A' || (byte)'Z' < ext) {
					return ();
				} 
				(_iob[2]).fprintf_ln(ModernizedCProgram._("ignoring %.4s extension"), ext);
				break;
		}
		return 0;
	}
	public void check_ce_order() {
		int i;
		if (!ModernizedCProgram.verify_ce_order) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		Object generatedName = ce.getName();
		int generatedCe_flags = (ce).getCe_flags();
		for (i = 1; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i - 1];
			cache_entry next_ce = generatedCache[i];
			int name_compare = /*Error: Function owner not recognized*/strcmp(generatedName, generatedName);
			if (0 < ModernizedCProgram.name_compare) {
				ModernizedCProgram.die(ModernizedCProgram._("unordered stage entries in index"));
			} 
			if (!ModernizedCProgram.name_compare) {
				if (!(((true) & generatedCe_flags) >> 12)) {
					ModernizedCProgram.die(ModernizedCProgram._("multiple stage entries for merged file '%s'"), generatedName);
				} 
				if ((((true) & generatedCe_flags) >> 12) > (((true) & generatedCe_flags) >> 12)) {
					ModernizedCProgram.die(ModernizedCProgram._("unordered stage entries for '%s'"), generatedName);
				} 
			} 
		}
	}
	public void tweak_untracked_cache() {
		repository r = ModernizedCProgram.the_repository;
		r.prepare_repo_settings();
		repo_settings generatedSettings = r.getSettings();
		untracked_cache_setting generatedCore_untracked_cache = generatedSettings.getCore_untracked_cache();
		if (generatedCore_untracked_cache == untracked_cache_setting.UNTRACKED_CACHE_REMOVE) {
			istate.remove_untracked_cache();
			return /*Error: Unsupported expression*/;
		} 
		if (generatedCore_untracked_cache == untracked_cache_setting.UNTRACKED_CACHE_WRITE) {
			istate.add_untracked_cache();
		} 
	}
	public void tweak_split_index() {
		switch (/*Error: Function owner not recognized*/git_config_get_split_index()) {
		case -/* unset: do nothing */1:
				break;
		case /* false */0:
				istate.remove_split_index();
				break;
		case /* true */1:
				istate.add_split_index();
				break;
		default:
				break;
		}
	}
	public void post_read_index_from() {
		istate.check_ce_order();
		istate.tweak_untracked_cache();
		istate.tweak_split_index();
		istate.tweak_fsmonitor();
	}
	public long load_all_cache_entries(Object mmap, Object mmap_size, long src_offset) {
		long consumed;
		int generatedVersion = this.getVersion();
		mem_pool generatedCe_mem_pool = this.getCe_mem_pool();
		int generatedCache_nr = this.getCache_nr();
		if (generatedVersion == 4) {
			generatedCe_mem_pool.mem_pool_init(ModernizedCProgram.estimate_cache_size_from_compressed(generatedCache_nr));
		} else {
				generatedCe_mem_pool.mem_pool_init(ModernizedCProgram.estimate_cache_size(mmap_size, generatedCache_nr));
		} 
		consumed = ModernizedCProgram.load_cache_entry_block(istate, generatedCe_mem_pool, 0, generatedCache_nr, mmap, src_offset, ((Object)0));
		return consumed/*
		 * Mostly randomly chosen maximum thread counts: we
		 * cap the parallelism to online_cpus() threads, and we want
		 * to have at least 10000 cache entries per thread for it to
		 * be worth starting a thread.
		 */;
	}
	/* remember to discard_cache() before reading a different cache! */
	public int do_read_index(Object path, int must_exist) {
		int fd;
		stat st = new stat();
		long src_offset;
		cache_header hdr = new cache_header();
		byte mmap;
		size_t mmap_size = new size_t();
		load_index_extensions p = new load_index_extensions();
		size_t extension_offset = 0;
		int nr_threads;
		int cpus;
		index_entry_offset_table ieot = ((Object)0);
		int generatedInitialized = this.getInitialized();
		int generatedCache_nr = this.getCache_nr();
		if (generatedInitialized) {
			return generatedCache_nr;
		} 
		cache_time generatedTimestamp = this.getTimestamp();
		generatedTimestamp.setSec(0);
		generatedTimestamp.setNsec(0);
		fd = /*Error: Function owner not recognized*/open(path, 0);
		if (fd < 0) {
			if (!must_exist && (/*Error: Function owner not recognized*/_errno()) == 2) {
				return 0;
			} 
			ModernizedCProgram.die_errno(ModernizedCProgram._("%s: index file open failed"), path);
		} 
		if (/*Error: Function owner not recognized*/fstat(fd, st)) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("%s: cannot stat the open index"), path);
		} 
		Object generatedSt_size = st.getSt_size();
		mmap_size = ModernizedCProgram.xsize_t(generatedSt_size);
		if (mmap_size < /*Error: Unsupported expression*/ + ModernizedCProgram.the_repository.getHash_algo().getRawsz()) {
			ModernizedCProgram.die(ModernizedCProgram._("%s: index file smaller than expected"), path);
		} 
		mmap = ModernizedCProgram.xmmap_gently(((Object)0), mmap_size, PROT_READ, MAP_PRIVATE, fd, 0);
		if (mmap == ((Object)-1)) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("%s: unable to map index file"), path);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		hdr = (cache_header)mmap;
		if (ModernizedCProgram.verify_hdr(hdr, mmap_size) < 0) {
			;
		} 
		object_id generatedOid = this.getOid();
		Object generatedHash = generatedOid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, (byte)hdr + mmap_size - ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		this.setVersion(/*Error: Function owner not recognized*/ntohl(hdr.getHdr_version()));
		this.setCache_nr(/*Error: Function owner not recognized*/ntohl(hdr.getHdr_entries()));
		this.setCache_alloc((((generatedCache_nr) + 16) * 3 / 2));
		int generatedCache_alloc = this.getCache_alloc();
		cache_entry[][] generatedCache = this.getCache();
		this.setCache(ModernizedCProgram.xcalloc(generatedCache_alloc, /*Error: sizeof expression not supported yet*/));
		this.setInitialized(1);
		p.setIstate(istate);
		p.setMmap(mmap);
		p.setMmap_size(mmap_size);
		src_offset = /*Error: sizeof expression not supported yet*/;
		if (/*Error: Function owner not recognized*/git_config_get_index_threads(nr_threads)) {
			nr_threads = 1;
		} 
		if (!/* TODO: does creating more threads than cores help? */nr_threads) {
			nr_threads = generatedCache_nr / (true);
			cpus = ModernizedCProgram.online_cpus();
			if (nr_threads > cpus) {
				nr_threads = cpus;
			} 
		} 
		if (!true) {
			nr_threads = 1;
		} 
		Object generatedPthread = p.getPthread();
		if (nr_threads > 1) {
			extension_offset = ModernizedCProgram.read_eoie_extension(mmap, mmap_size);
			if (extension_offset) {
				int err;
				p.setSrc_offset(extension_offset);
				ModernizedCProgram.err = generatedPthread.pthread_create(((Object)0), load_index_extensions, p);
				if (ModernizedCProgram.err) {
					ModernizedCProgram.die(ModernizedCProgram._("unable to create load_index_extensions thread: %s"), /*Error: Function owner not recognized*/strerror(ModernizedCProgram.err));
				} 
				nr_threads--;
			} 
		} 
		index_entry_offset_table index_entry_offset_table = new index_entry_offset_table();
		if (extension_offset && nr_threads > /*
			 * Locate and read the index entry offset table so that we can use it
			 * to multi-thread the reading of the cache entries.
			 */1) {
			ieot = index_entry_offset_table.read_ieot_extension(mmap, mmap_size, extension_offset);
		} 
		if (ieot) {
			src_offset += ModernizedCProgram.load_cache_entries_threaded(istate, mmap, mmap_size, nr_threads, ieot);
			ModernizedCProgram.free(ieot);
		} else {
				src_offset += istate.load_all_cache_entries(mmap, mmap_size, src_offset);
		} 
		Object generatedSt_mtime = st.getSt_mtime();
		generatedTimestamp.setSec(generatedSt_mtime);
		Object generatedSt_mtim = (st).getSt_mtim();
		generatedTimestamp.setNsec(((int)(generatedSt_mtim.getTv_nsec())));
		if (/* if we created a thread, join it otherwise load the extensions on the primary thread */extension_offset) {
			int ret = /*Error: Function owner not recognized*/pthread_join(generatedPthread, ((Object)0));
			if (ret) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to join load_index_extensions thread: %s"), /*Error: Function owner not recognized*/strerror(ret));
			} 
		} else {
				p.setSrc_offset(src_offset);
				ModernizedCProgram.load_index_extensions(p);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap((Object)mmap, mmap_size/*
			 * TODO trace2: replace "the_repository" with the actual repo instance
			 * that is associated with the given "istate".
			 */);
		int generatedVersion = this.getVersion();
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2247, ("index"), (ModernizedCProgram.the_repository), ("read/version"), (generatedVersion));
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2249, ("index"), (ModernizedCProgram.the_repository), ("read/cache_nr"), (generatedCache_nr));
		return generatedCache_nr;
		ModernizedCProgram.die(ModernizedCProgram._("index file corrupt"/*
		 * Signal that the shared index is used by updating its mtime.
		 *
		 * This way, shared index can be removed if they have not been used
		 * for some time.
		 */));
	}
	public int read_index_from(Object path, Object gitdir) {
		split_index split_index = new split_index();
		int ret;
		byte base_oid_hex;
		byte base_path;
		int generatedInitialized = this.getInitialized();
		int generatedCache_nr = this.getCache_nr();
		if (generatedInitialized) {
			return generatedCache_nr;
		} 
		ModernizedCProgram.trace2_region_enter_printf_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2287, ("index"), ("do_read_index"), (ModernizedCProgram.the_repository), "%s", path);
		ModernizedCProgram.trace_performance_enter();
		ret = istate.do_read_index(path, 0);
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2290, ModernizedCProgram.getnanotime(), "read cache %s", path);
			} 
		} while (0);
		ModernizedCProgram.trace2_region_leave_printf_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2292, ("index"), ("do_read_index"), (ModernizedCProgram.the_repository), "%s", path);
		split_index generatedSplit_index = this.getSplit_index();
		split_index = generatedSplit_index;
		object_id generatedBase_oid = split_index.getBase_oid();
		if (!split_index || ModernizedCProgram.is_null_oid(generatedBase_oid)) {
			istate.post_read_index_from();
			return ret;
		} 
		ModernizedCProgram.trace_performance_enter();
		index_state generatedBase = split_index.getBase();
		if (generatedBase) {
			generatedBase.discard_index();
		} else {
				split_index.setBase(ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
		} 
		base_oid_hex = ModernizedCProgram.oid_to_hex(generatedBase_oid);
		base_path = ModernizedCProgram.xstrfmt("%s/sharedindex.%s", gitdir, base_oid_hex);
		ModernizedCProgram.trace2_region_enter_printf_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2309, ("index"), ("shared/do_read_index"), (ModernizedCProgram.the_repository), "%s", base_path);
		ret = generatedBase.do_read_index(base_path, 1);
		ModernizedCProgram.trace2_region_leave_printf_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2312, ("index"), ("shared/do_read_index"), (ModernizedCProgram.the_repository), "%s", base_path);
		object_id generatedOid = generatedBase.getOid();
		if (!ModernizedCProgram.oideq(generatedBase_oid, generatedOid)) {
			ModernizedCProgram.die(ModernizedCProgram._("broken index, expect %s in %s, got %s"), base_oid_hex, base_path, ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		ModernizedCProgram.freshen_shared_index(base_path, 0);
		istate.merge_base_index();
		istate.post_read_index_from();
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\read-cache.c", 2321, ModernizedCProgram.getnanotime(), "read cache %s", base_path);
			} 
		} while (0);
		ModernizedCProgram.free(base_path);
		return ret;
	}
	public int is_index_unborn() {
		int generatedCache_nr = this.getCache_nr();
		cache_time generatedTimestamp = this.getTimestamp();
		Object generatedSec = generatedTimestamp.getSec();
		return (!generatedCache_nr && !generatedSec);
	}
	public int discard_index() {
		ModernizedCProgram.validate_cache_entries(istate);
		istate.resolve_undo_clear_index();
		this.setCache_nr(0);
		this.setCache_changed(0);
		cache_time generatedTimestamp = this.getTimestamp();
		generatedTimestamp.setSec(0);
		generatedTimestamp.setNsec(0);
		istate.free_name_hash();
		cache_tree generatedCache_tree = this.getCache_tree();
		(generatedCache_tree).cache_tree_free();
		this.setInitialized(0);
		this.setFsmonitor_has_run_once(0);
		cache_entry[][] generatedCache = this.getCache();
		do {
			ModernizedCProgram.free(generatedCache);
			(generatedCache) = ((Object)0);
		} while (0);
		this.setCache_alloc(0);
		istate.discard_split_index();
		untracked_cache generatedUntracked = this.getUntracked();
		generatedUntracked.free_untracked_cache();
		this.setUntracked(((Object)0));
		mem_pool generatedCe_mem_pool = this.getCe_mem_pool();
		if (generatedCe_mem_pool) {
			generatedCe_mem_pool.mem_pool_discard(ModernizedCProgram.should_validate_cache_entries());
			this.setCe_mem_pool(((Object)0));
		} 
		return 0/*
		 * Validate the cache entries of this index.
		 * All cache entries associated with this index
		 * should have been allocated by the memory pool
		 * associated with this index, or by a referenced
		 * split index.
		 */;
	}
	/*
		 * Cache entries in istate->cache[] should have been allocated
		 * from the memory pool associated with this index, or from an
		 * associated split_index. There is no need to free individual
		 * cache entries. validate_cache_entries can detect when this
		 * assertion does not hold.
		 */
	public int has_racy_timestamp() {
		int generatedCache_nr = this.getCache_nr();
		int entries = generatedCache_nr;
		int i;
		cache_entry[][] generatedCache = this.getCache();
		for (i = 0; i < entries; i++) {
			cache_entry ce = generatedCache[i];
			if (ModernizedCProgram.is_racy_timestamp(istate, ce)) {
				return 1;
			} 
		}
		return 0;
	}
	public int too_many_not_shared_entries() {
		int i;
		int not_shared = 0;
		int max_split = /*Error: Function owner not recognized*/git_config_get_max_percent_split_change();
		switch (max_split) {
		case 0:
				return /* 0% means always write a new shared index */1;
		case -1:
				max_split = /* not or badly configured: use the default value */ModernizedCProgram.default_max_percent_split_change;
				break;
		case 100:
				return /* 100% means never write a new shared index */0;
		default:
				break;
		}
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedIndex = ce.getIndex();
		for (i = 0; i < generatedCache_nr; /* Count not shared entries */i++) {
			cache_entry ce = generatedCache[i];
			if (!generatedIndex) {
				not_shared++;
			} 
		}
		return (int64_t)generatedCache_nr * max_split < (int64_t)not_shared * 100;
	}
	public void move_index_extensions(index_state src) {
		untracked_cache generatedUntracked = src.getUntracked();
		this.setUntracked(generatedUntracked);
		src.setUntracked(((Object)0));
		cache_tree generatedCache_tree = src.getCache_tree();
		this.setCache_tree(generatedCache_tree);
		src.setCache_tree(((Object)0));
	}
	public int unmerged_mask(Object path) {
		int pos;
		int mask;
		cache_entry ce = new cache_entry();
		pos = ModernizedCProgram.index_name_pos(istate, path, /*Error: Function owner not recognized*/strlen(path));
		if (0 <= pos) {
			return 0;
		} 
		mask = 0;
		pos = -pos - 1;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		while (pos < generatedCache_nr) {
			ce = generatedCache[pos++];
			if (/*Error: Function owner not recognized*/strcmp(ce.getName(), path) || !(((true) & (ce).getCe_flags()) >> 12)) {
				break;
			} 
			mask |=  (1 << ((((true) & (ce).getCe_flags()) >> 12) - 1));
		}
		return mask;
	}
	public Object parse_range_funcname(Object arg, Object nth_line_cb, Object cb_data, long lines, long anchor, Long begin, Long end, Object path) {
		byte pattern;
		byte term;
		userdiff_driver drv = new userdiff_driver();
		 xecfg = ((Object)0);
		byte start;
		byte p;
		int reg_error;
		regex_t regexp = new regex_t();
		if (arg == (byte)'^') {
			anchor = 1;
			arg++;
		} 
		((arg == (byte)':') ? (Object)0 : /*Error: Function owner not recognized*/_assert("*arg == ':'", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\line-range.c", 185));
		term = arg + 1;
		while (term && term != (byte)':') {
			if (term == (byte)'\\' && (term + 1)) {
				term++;
			} 
			term++;
		}
		if (term == arg + 1) {
			return ((Object)0);
		} 
		if (!/* skip_range_arg case */begin) {
			return term;
		} 
		pattern = ModernizedCProgram.xstrndup(arg + 1, term - (arg + 1));
		/* input is in human terms */anchor--;
		start = /*Error: Function owner not recognized*/nth_line_cb(cb_data, anchor);
		userdiff_driver userdiff_driver = new userdiff_driver();
		drv = userdiff_driver.userdiff_find_by_path(istate, path);
		userdiff_funcname generatedFuncname = drv.getFuncname();
		Object generatedPattern = generatedFuncname.getPattern();
		if (drv && generatedPattern) {
			userdiff_funcname pe = generatedFuncname;
			xecfg = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
			ModernizedCProgram.xdiff_set_find_func(xecfg, generatedPattern, pe.getCflags());
		} 
		reg_error = ModernizedCProgram.regcomp(regexp, pattern, ((1 << 1) << 1));
		if (reg_error) {
			byte[] errbuf = new byte[1024];
			ModernizedCProgram.regerror(reg_error, regexp, errbuf, 1024);
			ModernizedCProgram.die("-L parameter '%s': %s", pattern, errbuf);
		} 
		p = regexp.find_funcname_matching_regexp(xecfg, (byte)start);
		if (!p) {
			ModernizedCProgram.die("-L parameter '%s' starting at line %ld: no match", pattern, anchor + 1);
		} 
		begin = 0;
		while (p > /*Error: Function owner not recognized*/nth_line_cb(cb_data, begin)) {
			(begin)++;
		}
		if (begin >= lines) {
			ModernizedCProgram.die("-L parameter '%s' matches at EOF", pattern);
		} 
		end = begin + 1;
		while (end < lines) {
			byte bol = /*Error: Function owner not recognized*/nth_line_cb(cb_data, end);
			byte eol = /*Error: Function owner not recognized*/nth_line_cb(cb_data, end + 1);
			if (ModernizedCProgram.match_funcname(xecfg, bol, eol)) {
				break;
			} 
			(end)++;
		}
		ModernizedCProgram.regfree(regexp);
		ModernizedCProgram.free(xecfg);
		ModernizedCProgram.free(pattern);
		(/* compensate for 1-based numbering */begin)++;
		return term;
	}
	public int parse_range_arg(Object arg, Object nth_line_cb, Object cb_data, long lines, long anchor, Long begin, Long end, Object path) {
		begin = end = 0;
		if (anchor < 1) {
			anchor = 1;
		} 
		if (anchor > lines) {
			anchor = lines + 1;
		} 
		if (arg == (byte)':' || (arg == (byte)'^' && (arg + 1) == (byte)':')) {
			arg = istate.parse_range_funcname(arg, nth_line_cb, cb_data, lines, anchor, begin, end, path);
			if (!arg || arg) {
				return -1;
			} 
			return 0;
		} 
		arg = ModernizedCProgram.parse_loc(arg, nth_line_cb, cb_data, lines, -anchor, begin);
		if (arg == (byte)',') {
			arg = ModernizedCProgram.parse_loc(arg + 1, nth_line_cb, cb_data, lines, begin + 1, end);
		} 
		if (arg) {
			return -1;
		} 
		if (begin && end && end < begin) {
			do {
				Object _swap_a_ptr = (end);
				Object _swap_b_ptr = (begin);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
		} 
		return 0;
	}
	public Object skip_range_arg(Object arg) {
		if (arg == (byte)':' || (arg == (byte)'^' && (arg + 1) == (byte)':')) {
			return istate.parse_range_funcname(arg, ((Object)0), ((Object)0), 0, 0, ((Object)0), ((Object)0), ((Object)0));
		} 
		arg = ModernizedCProgram.parse_loc(arg, ((Object)0), ((Object)0), 0, -1, ((Object)0));
		if (arg == (byte)',') {
			arg = ModernizedCProgram.parse_loc(arg + 1, ((Object)0), ((Object)0), 0, 0, ((Object)0));
		} 
		return arg;
	}
	public exist_status directory_exists_in_index_icase(Object dirname, int len) {
		cache_entry ce = new cache_entry();
		if (istate.index_dir_exists(dirname, len)) {
			return exist_status.index_directory;
		} 
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.index_file_exists(istate, dirname, len, ModernizedCProgram.ignore_case);
		int generatedCe_mode = ce.getCe_mode();
		if (ce && (((generatedCe_mode) & -1024) == 160000)) {
			return exist_status.index_gitdir;
		} 
		return exist_status.index_nonexistent/*
		 * The index sorts alphabetically by entry name, which
		 * means that a gitlink sorts as '\0' at the end, while
		 * a directory (which is defined not as an entry, but as
		 * the files it contains) will sort with the '/' at the
		 * end.
		 */;
	}
	public exist_status directory_exists_in_index(Object dirname, int len) {
		int pos;
		if (ModernizedCProgram.ignore_case) {
			return istate.directory_exists_in_index_icase(dirname, len);
		} 
		pos = ModernizedCProgram.index_name_pos(istate, dirname, len);
		if (pos < 0) {
			pos = -pos - 1;
		} 
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		while (pos < generatedCache_nr) {
			cache_entry ce = generatedCache[pos++];
			byte endchar;
			if (/*Error: Function owner not recognized*/strncmp(ce.getName(), dirname, len)) {
				break;
			} 
			endchar = ce.getName()[len];
			if (endchar > (byte)'/') {
				break;
			} 
			if (endchar == (byte)'/') {
				return exist_status.index_directory;
			} 
			if (!endchar && (((ce.getCe_mode()) & -1024) == 160000)) {
				return exist_status.index_gitdir;
			} 
		}
		return exist_status.index_nonexistent/*
		 * When we find a directory when traversing the filesystem, we
		 * have three distinct cases:
		 *
		 *  - ignore it
		 *  - see it as a directory
		 *  - recurse into it
		 *
		 * and which one we choose depends on a combination of existing
		 * git index contents and the flags passed into the directory
		 * traversal routine.
		 *
		 * Case 1: If we *already* have entries in the index under that
		 * directory name, we always recurse into the directory to see
		 * all the files.
		 *
		 * Case 2: If we *already* have that directory name as a gitlink,
		 * we always continue to see it as a gitlink, regardless of whether
		 * there is an actual git directory there or not (it might not
		 * be checked out as a subproject!)
		 *
		 * Case 3: if we didn't have it in the index previously, we
		 * have a few sub-cases:
		 *
		 *  (a) if "show_other_directories" is true, we show it as
		 *      just a directory, unless "hide_empty_directories" is
		 *      also true, in which case we need to check if it contains any
		 *      untracked and / or ignored files.
		 *  (b) if it looks like a git directory, and we don't have
		 *      'no_gitlinks' set we treat it as a gitlink, and show it
		 *      as a directory.
		 *  (c) otherwise, we recurse into it.
		 */;
	}
	public int get_index_dtype(Object path, int len) {
		int pos;
		cache_entry ce = new cache_entry();
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.index_file_exists(istate, path, len, 0);
		if (ce) {
			if (!((ce).getCe_flags() & (1 << 18))) {
				return 0;
			} 
			if ((((ce.getCe_mode()) & -1024) == 160000)) {
				return 1/*
						 * Nobody actually cares about the
						 * difference between DT_LNK and DT_REG
						 */;
			} 
			return 2;
		} 
		pos = ModernizedCProgram.index_name_pos(istate, path, /* Try to look it up as a directory */len);
		if (pos >= 0) {
			return 0;
		} 
		pos = -pos - 1;
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		while (pos < generatedCache_nr) {
			ce = generatedCache[pos++];
			if (/*Error: Function owner not recognized*/strncmp(ce.getName(), path, len)) {
				break;
			} 
			if (ce.getName()[len] > (byte)'/') {
				break;
			} 
			if (ce.getName()[len] < (byte)'/') {
				continue;
			} 
			if (!((ce).getCe_flags() & (1 << 18))) {
				break;
			} 
			return 1;
		}
		return 0;
	}
	public void new_untracked_cache() {
		untracked_cache uc = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		strbuf generatedIdent = uc.getIdent();
		generatedIdent.strbuf_init(100);
		uc.setExclude_per_dir(".gitignore");
		uc.setDir_flags(.DIR_SHOW_OTHER_DIRECTORIES | /* should be the same flags used by git-status */.DIR_HIDE_EMPTY_DIRECTORIES);
		uc.set_untracked_ident();
		this.setUntracked(uc);
		int generatedCache_changed = this.getCache_changed();
		generatedCache_changed |=  (1 << 7);
	}
	public void add_untracked_cache() {
		untracked_cache generatedUntracked = this.getUntracked();
		if (!generatedUntracked) {
			istate.new_untracked_cache();
		} else {
				if (!ModernizedCProgram.ident_in_untracked(generatedUntracked)) {
					generatedUntracked.free_untracked_cache();
					istate.new_untracked_cache();
				} 
		} 
	}
	public void remove_untracked_cache() {
		untracked_cache generatedUntracked = this.getUntracked();
		int generatedCache_changed = this.getCache_changed();
		if (generatedUntracked) {
			generatedUntracked.free_untracked_cache();
			this.setUntracked(((Object)0));
			generatedCache_changed |=  (1 << 7);
		} 
	}
	public void untracked_cache_invalidate_path(Object path, int safe_path) {
		untracked_cache generatedUntracked = this.getUntracked();
		untracked_cache_dir generatedRoot = generatedUntracked.getRoot();
		if (!generatedUntracked || !generatedRoot) {
			return /*Error: Unsupported expression*/;
		} 
		if (!safe_path && !ModernizedCProgram.verify_path(path, 0)) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.invalidate_one_component(generatedUntracked, generatedRoot, path, /*Error: Function owner not recognized*/strlen(path));
	}
	public void untracked_cache_remove_from_index(Object path) {
		istate.untracked_cache_invalidate_path(path, 1);
	}
	public void untracked_cache_add_to_index(Object path) {
		istate.untracked_cache_invalidate_path(path, 1);
	}
	public void prune_index(Object prefix, Object prefixlen) {
		int pos;
		int first;
		int last;
		int generatedCache_nr = this.getCache_nr();
		if (!prefix || !generatedCache_nr) {
			return /*Error: Unsupported expression*/;
		} 
		pos = ModernizedCProgram.index_name_pos(istate, prefix, prefixlen);
		if (pos < 0) {
			pos = -pos - 1;
		} 
		first = pos;
		last = generatedCache_nr;
		cache_entry[][] generatedCache = this.getCache();
		while (last > first) {
			int next = first + ((last - first) >> 1);
			cache_entry ce = generatedCache[next];
			if (!/*Error: Function owner not recognized*/strncmp(ce.getName(), prefix, prefixlen)) {
				first = next + 1;
				continue;
			} 
			last = next;
		}
		ModernizedCProgram.move_array((generatedCache), (generatedCache + pos), (last - pos), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		this.setCache_nr(last - pos);
	}
	public void overlay_tree_on_index(Object tree_name, Object prefix) {
		tree tree = new tree();
		object_id oid = new object_id();
		pathspec pathspec = new pathspec();
		cache_entry last_stage0 = ((Object)0);
		int i;
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, tree_name, oid)) {
			ModernizedCProgram.die("tree-ish %s not found.", tree_name);
		} 
		tree tree = new tree();
		tree = tree.parse_tree_indirect(oid);
		if (!tree) {
			ModernizedCProgram.die("bad tree-ish %s", tree_name);
		} 
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedCe_flags = (ce).getCe_flags();
		for (i = 0; i < generatedCache_nr; /* Hoist the unmerged entries up to stage #3 to make room */i++) {
			cache_entry ce = generatedCache[i];
			if (!(((true) & generatedCe_flags) >> 12)) {
				continue;
			} 
			generatedCe_flags |=  (true);
		}
		if (prefix) {
			byte matchbuf;
			matchbuf[0] = ((Object)0);
			pathspec.parse_pathspec(((1 << 0) | (1 << 1) | (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5) | (1 << 6)), (1 << 0), prefix, matchbuf);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pathspec, 0, /*Error: sizeof expression not supported yet*/);
		} 
		if (ModernizedCProgram.read_tree(ModernizedCProgram.the_repository, tree, 1, pathspec, istate)) {
			ModernizedCProgram.die("unable to read tree entries %s", tree_name);
		} 
		Object generatedName = last_stage0.getName();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			switch ((((true) & generatedCe_flags) >> 12)) {
			case 1/*
						 * If there is stage #0 entry for this, we do not
						 * need to show it.  We use CE_UPDATE bit to mark
						 * such an entry.
						 */:
					if (last_stage0 && !/*Error: Function owner not recognized*/strcmp(generatedName, generatedName)) {
						generatedCe_flags |=  (1 << 16);
					} 
			case 0:
					last_stage0 = ce/* fallthru */;
			default:
					continue;
			}
		}
	}
	public int read_fsmonitor_extension(Object data, long sz) {
		byte index = data;
		uint32_t hdr_version = new uint32_t();
		uint32_t ewah_size = new uint32_t();
		ewah_bitmap fsmonitor_dirty = new ewah_bitmap();
		int ret;
		if (sz < /*Error: Unsupported expression*/ + /*Error: Unsupported expression*/ + /*Error: Unsupported expression*/) {
			return ();
		} 
		hdr_version = /*Error: Function owner not recognized*/get_be32(index);
		index += /*Error: Unsupported expression*/;
		if (hdr_version != (true)) {
			return ();
		} 
		this.setFsmonitor_last_update(/*Error: Function owner not recognized*/get_be64(index));
		index += /*Error: Unsupported expression*/;
		ewah_size = /*Error: Function owner not recognized*/get_be32(index);
		index += /*Error: Unsupported expression*/;
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		fsmonitor_dirty = ewah_bitmap.ewah_new();
		ret = fsmonitor_dirty.ewah_read_mmap(index, ewah_size);
		if (ret != ewah_size) {
			fsmonitor_dirty.ewah_free();
			return ();
		} 
		this.setFsmonitor_dirty(fsmonitor_dirty);
		ewah_bitmap generatedFsmonitor_dirty = this.getFsmonitor_dirty();
		Object generatedEwah_bitmap = generatedFsmonitor_dirty.getEwah_bitmap();
		int generatedCache_nr = this.getCache_nr();
		if (generatedEwah_bitmap > generatedCache_nr) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 60, "fsmonitor_dirty has more entries than the index (%llu > %u)", (uintmax_t)generatedEwah_bitmap, generatedCache_nr);
		} 
		do {
			if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
				ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 62, "read fsmonitor extension successful");
			} 
		} while (0);
		return 0;
	}
	public void fill_fsmonitor_bitmap() {
		int i;
		int skipped = 0;
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		this.setFsmonitor_dirty(ewah_bitmap.ewah_new());
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		ewah_bitmap generatedFsmonitor_dirty = this.getFsmonitor_dirty();
		for (i = 0; i < generatedCache_nr; i++) {
			if (generatedCache[i].getCe_flags() & (1 << 17)) {
				skipped++;
			}  else if (!(generatedCache[i].getCe_flags() & (1 << 21))) {
				generatedFsmonitor_dirty.ewah_set(i - skipped);
			} 
		}
	}
	public void fsmonitor_refresh_callback(Object name) {
		int pos = ModernizedCProgram.index_name_pos(istate, name, /*Error: Function owner not recognized*/strlen(name));
		cache_entry[][] generatedCache = this.getCache();
		int generatedCe_flags = ce.getCe_flags();
		if (pos >= 0) {
			cache_entry ce = generatedCache[pos];
			generatedCe_flags &=  ~(1 << 21/*
				 * Mark the untracked cache dirty even if it wasn't found in the index
				 * as it could be a new untracked file.
				 */);
		} 
		do {
			if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
				ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 142, "fsmonitor_refresh_callback '%s'", name);
			} 
		} while (0);
		istate.untracked_cache_invalidate_path(name, 0);
	}
	public void refresh_fsmonitor() {
		strbuf query_result = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int query_success = 0;
		/* beginning of line */size_t bol = new size_t();
		uint64_t last_update = new uint64_t();
		byte buf;
		int i;
		int generatedFsmonitor_has_run_once = this.getFsmonitor_has_run_once();
		if (!ModernizedCProgram.core_fsmonitor || generatedFsmonitor_has_run_once) {
			return /*Error: Unsupported expression*/;
		} 
		this.setFsmonitor_has_run_once(1);
		do {
			if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
				ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 159, "refresh fsmonitor");
			} 
		} while (0/*
			 * This could be racy so save the date/time now and query_fsmonitor
			 * should be inclusive to ensure we don't miss potential changes.
			 */);
		last_update = ModernizedCProgram.getnanotime();
		Object generatedFsmonitor_last_update = this.getFsmonitor_last_update();
		if (generatedFsmonitor_last_update) {
			query_success = !query_result.query_fsmonitor((true), generatedFsmonitor_last_update);
			do {
				if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
					ModernizedCProgram.trace_performance_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 174, ModernizedCProgram.getnanotime() - (last_update), "fsmonitor process '%s'", ModernizedCProgram.core_fsmonitor);
				} 
			} while (0);
			do {
				if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
					ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 176, "fsmonitor process '%s' returned %s", ModernizedCProgram.core_fsmonitor, query_success ? "success" : "failure");
				} 
			} while (0);
		} 
		byte[] generatedBuf = query_result.getBuf();
		Object generatedLen = query_result.getLen();
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedCache_changed = this.getCache_changed();
		untracked_cache generatedUntracked = this.getUntracked();
		if (query_success && generatedBuf[0] != /* a fsmonitor process can return '/' to indicate all entries are invalid */(byte)'/') {
			buf = generatedBuf;
			bol = 0;
			for (i = 0; i < generatedLen; i++) {
				if (buf[i] != (byte)'\0') {
					continue;
				} 
				istate.fsmonitor_refresh_callback(buf + bol);
				bol = i + 1;
			}
			if (bol < generatedLen) {
				istate.fsmonitor_refresh_callback(buf + bol);
			} 
		} else {
				for (i = 0; i < generatedCache_nr; /* Mark all entries invalid */i++) {
					generatedCache[i].getCe_flags() &=  ~(1 << 21);
				}
				generatedCache_changed |=  (1 << /* If we're going to check every file, ensure we save the results */8);
				if (generatedUntracked) {
					generatedUntracked.setUse_fsmonitor(0);
				} 
		} 
		query_result.strbuf_release();
		this.setFsmonitor_last_update(/* Now that we've updated istate, save the last_update time */last_update);
	}
	public void add_fsmonitor() {
		int i;
		Object generatedFsmonitor_last_update = this.getFsmonitor_last_update();
		int generatedCache_changed = this.getCache_changed();
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		untracked_cache generatedUntracked = this.getUntracked();
		if (!generatedFsmonitor_last_update) {
			do {
				if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
					ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 214, "add fsmonitor");
				} 
			} while (0);
			generatedCache_changed |=  (1 << 8);
			this.setFsmonitor_last_update(ModernizedCProgram.getnanotime());
			for (i = 0; i < generatedCache_nr; /* reset the fsmonitor state */i++) {
				generatedCache[i].getCe_flags() &=  ~(1 << 21);
			}
			if (generatedUntracked) {
				istate.add_untracked_cache();
				generatedUntracked.setUse_fsmonitor(1);
			} 
			/* Update the fsmonitor state */istate.refresh_fsmonitor();
		} 
	}
	public void remove_fsmonitor() {
		Object generatedFsmonitor_last_update = this.getFsmonitor_last_update();
		int generatedCache_changed = this.getCache_changed();
		if (generatedFsmonitor_last_update) {
			do {
				if (ModernizedCProgram.trace_fsmonitor.trace_pass_fl()) {
					ModernizedCProgram.trace_fsmonitor.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 236, "remove fsmonitor");
				} 
			} while (0);
			generatedCache_changed |=  (1 << 8);
			this.setFsmonitor_last_update(0);
		} 
	}
	public void tweak_fsmonitor() {
		int i;
		int fsmonitor_enabled = /*Error: Function owner not recognized*/git_config_get_fsmonitor();
		ewah_bitmap generatedFsmonitor_dirty = this.getFsmonitor_dirty();
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		Object generatedEwah_bitmap = generatedFsmonitor_dirty.getEwah_bitmap();
		untracked_cache generatedUntracked = this.getUntracked();
		if (generatedFsmonitor_dirty) {
			if (fsmonitor_enabled) {
				for (i = 0; i < generatedCache_nr; /* Mark all entries valid */i++) {
					generatedCache[i].getCe_flags() |=  (1 << 21);
				}
				if (generatedEwah_bitmap > generatedCache_nr) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\fsmonitor.c", 257, "fsmonitor_dirty has more entries than the index (%llu > %u)", (uintmax_t)generatedEwah_bitmap, generatedCache_nr);
				} 
				generatedFsmonitor_dirty.ewah_each_bit(fsmonitor_ewah_callback, istate);
				if (generatedUntracked) {
					generatedUntracked.setUse_fsmonitor(1);
				} 
			} 
			generatedFsmonitor_dirty.ewah_free();
			this.setFsmonitor_dirty(((Object)0));
		} 
		switch (fsmonitor_enabled) {
		case -/* keep: do nothing */1:
				break;
		case /* true */1:
				istate.add_fsmonitor();
				break;
		case /* false */0:
				istate.remove_fsmonitor();
				break;
		default:
				break;
		}
	}
	public void preload_index(Object pathspec, int refresh_flags) {
		int threads;
		int i;
		int work;
		int offset;
		thread_data[] data = new thread_data();
		progress_data pd = new progress_data();
		if (!true || !ModernizedCProgram.core_preload_index) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedCache_nr = this.getCache_nr();
		threads = generatedCache_nr / (true);
		if ((generatedCache_nr > 1) && (threads < 2) && /*Error: Function owner not recognized*/git_env_bool("GIT_TEST_PRELOAD_INDEX", 0)) {
			threads = 2;
		} 
		if (threads < 2) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.trace_performance_enter();
		if (threads > (true)) {
			threads = (true);
		} 
		offset = 0;
		work = (((generatedCache_nr) + (threads) - 1) / (threads));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(data, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pd, 0, /*Error: sizeof expression not supported yet*/);
		progress progress = new progress();
		Object generatedMutex = pd.getMutex();
		if (refresh_flags & -1024 && /*Error: Function owner not recognized*/isatty(2)) {
			pd.setProgress(progress.start_delayed_progress(ModernizedCProgram._("Refreshing index"), generatedCache_nr));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pthread_mutex_init(generatedMutex, ((Object)0));
		} 
		pathspec generatedPathspec = p.getPathspec();
		progress generatedProgress = pd.getProgress();
		Object generatedPthread = p.getPthread();
		for (i = 0; i < threads; i++) {
			thread_data p = data + i;
			int err;
			p.setIndex(index);
			if (pathspec) {
				generatedPathspec.copy_pathspec(pathspec);
			} 
			p.setOffset(offset);
			p.setNr(work);
			if (generatedProgress) {
				p.setProgress(pd);
			} 
			offset += work;
			ModernizedCProgram.err = generatedPthread.pthread_create(((Object)0), preload_thread, p);
			if (ModernizedCProgram.err) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to create threaded lstat: %s"), /*Error: Function owner not recognized*/strerror(ModernizedCProgram.err));
			} 
		}
		for (i = 0; i < threads; i++) {
			thread_data p = data + i;
			if (/*Error: Function owner not recognized*/pthread_join(generatedPthread, ((Object)0))) {
				ModernizedCProgram.die("unable to join threaded lstat");
			} 
		}
		generatedProgress.stop_progress();
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\preload-index.c", 147, ModernizedCProgram.getnanotime(), "preload index");
			} 
		} while (0);
	}
	public void cache_tree_invalidate_path(Object path) {
		cache_tree generatedCache_tree = this.getCache_tree();
		int generatedCache_changed = this.getCache_changed();
		if (generatedCache_tree.do_invalidate_path(path)) {
			generatedCache_changed |=  (1 << 5);
		} 
	}
	public int cache_tree_update(int flags) {
		cache_tree generatedCache_tree = this.getCache_tree();
		cache_tree it = generatedCache_tree;
		cache_entry[][] generatedCache = this.getCache();
		cache_entry cache = generatedCache;
		int generatedCache_nr = this.getCache_nr();
		int entries = generatedCache_nr;
		int skip;
		int i = cache.verify_cache(entries, flags);
		if (i) {
			return i;
		} 
		ModernizedCProgram.trace_performance_enter();
		i = ModernizedCProgram.update_one(it, cache, entries, "", 0, skip, flags);
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\cache-tree.c", 444, ModernizedCProgram.getnanotime(), "cache_tree_update");
			} 
		} while (0);
		if (i < 0) {
			return i;
		} 
		int generatedCache_changed = this.getCache_changed();
		generatedCache_changed |=  (1 << 5);
		return 0;
	}
	public int entry_is_binary(Object path, Object buffer, Object size) {
		userdiff_driver userdiff_driver = new userdiff_driver();
		userdiff_driver driver = userdiff_driver.userdiff_find_by_path(istate, path);
		userdiff_driver userdiff_driver = new userdiff_driver();
		if (!driver) {
			driver = userdiff_driver.userdiff_find_by_name("default");
		} 
		int generatedBinary = driver.getBinary();
		if (generatedBinary != -1) {
			return generatedBinary;
		} 
		return ModernizedCProgram.buffer_is_binary(buffer, size);
	}
	public int read_link_extension(Object data_, long sz) {
		byte data = data_;
		split_index si = new split_index();
		int ret;
		if (sz < ModernizedCProgram.the_repository.getHash_algo().getRawsz()) {
			return ();
		} 
		split_index split_index = new split_index();
		si = split_index.init_split_index(istate);
		object_id generatedBase_oid = si.getBase_oid();
		Object generatedHash = generatedBase_oid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, data);
		data += ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		sz -= ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		if (!sz) {
			return 0;
		} 
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		si.setDelete_bitmap(ewah_bitmap.ewah_new());
		ewah_bitmap generatedDelete_bitmap = si.getDelete_bitmap();
		ret = generatedDelete_bitmap.ewah_read_mmap(data, sz);
		if (ret < 0) {
			return ();
		} 
		data += ret;
		sz -= ret;
		si.setReplace_bitmap(ewah_bitmap.ewah_new());
		ewah_bitmap generatedReplace_bitmap = si.getReplace_bitmap();
		ret = generatedReplace_bitmap.ewah_read_mmap(data, sz);
		if (ret < 0) {
			return ();
		} 
		if (ret != sz) {
			return ();
		} 
		return 0;
	}
	public void mark_base_index_entries() {
		int i;
		/*
			 * To keep track of the shared entries between
			 * istate->base->cache[] and istate->cache[], base entry
			 * position is stored in each base entry. All positions start
			 * from 1 instead of 0, which is reserved to say "this is a new
			 * entry".
			 */
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		for (i = 0; i < generatedCache_nr; i++) {
			generatedCache[i].setIndex(i + 1);
		}
	}
	public void move_cache_to_base_index() {
		split_index generatedSplit_index = this.getSplit_index();
		split_index si = generatedSplit_index;
		int i;
		/*
			 * If there was a previous base index, then transfer ownership of allocated
			 * entries to the parent index.
			 */
		index_state generatedBase = si.getBase();
		mem_pool generatedCe_mem_pool = generatedBase.getCe_mem_pool();
		if (generatedBase && generatedCe_mem_pool) {
			if (!generatedCe_mem_pool) {
				generatedCe_mem_pool.mem_pool_init(0);
			} 
			generatedCe_mem_pool.mem_pool_combine(generatedCe_mem_pool);
		} 
		si.setBase(ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
		int generatedVersion = this.getVersion();
		generatedBase.setVersion(generatedVersion);
		cache_time generatedTimestamp = this.getTimestamp();
		generatedBase.setTimestamp(generatedTimestamp);
		int generatedCache_nr = this.getCache_nr();
		int generatedCache_alloc = generatedBase.getCache_alloc();
		cache_entry[][] generatedCache = generatedBase.getCache();
		do {
			if ((generatedCache_nr) > generatedCache_alloc) {
				if ((((generatedCache_alloc) + 16) * 3 / 2) < (generatedCache_nr)) {
					generatedBase.setCache_alloc((generatedCache_nr));
				} else {
						generatedBase.setCache_alloc((((generatedCache_alloc) + 16) * 3 / 2));
				} 
				(generatedCache) = ModernizedCProgram.xrealloc((generatedCache), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedCache_alloc)));
			} 
		} while (0);
		generatedBase.setCache_nr(generatedCache_nr);
		generatedBase.setCe_mem_pool(generatedCe_mem_pool);
		this.setCe_mem_pool(((Object)0));
		ModernizedCProgram.copy_array((generatedCache), (generatedCache), (generatedCache_nr), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		generatedBase.mark_base_index_entries();
		for (i = 0; i < generatedCache_nr; i++) {
			generatedCache[i].getCe_flags() &=  ~(1 << 27);
		}
	}
	public void merge_base_index() {
		split_index generatedSplit_index = this.getSplit_index();
		split_index si = generatedSplit_index;
		int i;
		index_state generatedBase = si.getBase();
		generatedBase.mark_base_index_entries();
		cache_entry[][] generatedCache = this.getCache();
		si.setSaved_cache(generatedCache);
		int generatedCache_nr = this.getCache_nr();
		si.setSaved_cache_nr(generatedCache_nr);
		this.setCache_nr(generatedCache_nr);
		this.setCache(((Object)0));
		this.setCache_alloc(0);
		int generatedCache_alloc = this.getCache_alloc();
		do {
			if ((generatedCache_nr) > generatedCache_alloc) {
				if ((((generatedCache_alloc) + 16) * 3 / 2) < (generatedCache_nr)) {
					this.setCache_alloc((generatedCache_nr));
				} else {
						this.setCache_alloc((((generatedCache_alloc) + 16) * 3 / 2));
				} 
				(generatedCache) = ModernizedCProgram.xrealloc((generatedCache), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedCache_alloc)));
			} 
		} while (0);
		ModernizedCProgram.copy_array((generatedCache), (generatedCache), (generatedCache_nr), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		si.setNr_deletions(0);
		si.setNr_replacements(0);
		ewah_bitmap generatedReplace_bitmap = si.getReplace_bitmap();
		generatedReplace_bitmap.ewah_each_bit(replace_entry, istate);
		ewah_bitmap generatedDelete_bitmap = si.getDelete_bitmap();
		generatedDelete_bitmap.ewah_each_bit(mark_entry_for_delete, istate);
		int generatedNr_deletions = si.getNr_deletions();
		if (generatedNr_deletions) {
			istate.remove_marked_cache_entries(0);
		} 
		int generatedSaved_cache_nr = si.getSaved_cache_nr();
		cache_entry[][] generatedSaved_cache = si.getSaved_cache();
		int generatedNr_replacements = si.getNr_replacements();
		for (i = generatedNr_replacements; i < generatedSaved_cache_nr; i++) {
			if (!((generatedSaved_cache[i]).getCe_namelen())) {
				ModernizedCProgram.die("corrupt link extension, entry %d should have non-zero length name", i);
			} 
			ModernizedCProgram.add_index_entry(istate, generatedSaved_cache[i], 1 | 32/*
							 * we may have to replay what
							 * merge-recursive.c:update_stages()
							 * does, which has this flag on
							 */ | 4);
			generatedSaved_cache[i] = ((Object)0);
		}
		generatedDelete_bitmap.ewah_free();
		generatedReplace_bitmap.ewah_free();
		do {
			ModernizedCProgram.free(generatedSaved_cache);
			(generatedSaved_cache) = ((Object)0);
		} while (0);
		si.setDelete_bitmap(((Object)0));
		si.setReplace_bitmap(((Object)0));
		si.setSaved_cache_nr(0/*
		 * Compare most of the fields in two cache entries, i.e. all except the
		 * hashmap_entry and the name.
		 */);
	}
	public void prepare_to_write_split_index() {
		split_index split_index = new split_index();
		split_index si = split_index.init_split_index(istate);
		cache_entry entries = ((Object)0);
		cache_entry ce = new cache_entry();
		int i;
		int nr_entries = 0;
		int nr_alloc = 0;
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		si.setDelete_bitmap(ewah_bitmap.ewah_new());
		si.setReplace_bitmap(ewah_bitmap.ewah_new());
		index_state generatedBase = si.getBase();
		int generatedCache_nr = this.getCache_nr();
		cache_entry[][] generatedCache = this.getCache();
		int generatedIndex = ce.getIndex();
		int generatedCe_flags = ce.getCe_flags();
		int generatedCe_namelen = ce.getCe_namelen();
		Object generatedName = ce.getName();
		ewah_bitmap generatedDelete_bitmap = si.getDelete_bitmap();
		ewah_bitmap generatedReplace_bitmap = si.getReplace_bitmap();
		object_id generatedOid = ce.getOid();
		if (generatedBase) {
			for (i = 0; i < generatedCache_nr; i++) {
				cache_entry base = new cache_entry();
				ce = generatedCache[i];
				if (!generatedIndex) {
					continue;
				} 
				if (generatedIndex > generatedCache_nr) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\split-index.c", 258, "ce refers to a shared ce at %d, which is beyond the shared index size %d", generatedIndex, generatedCache_nr);
				} 
				generatedCe_flags |=  (1 << /* or "shared" */26);
				base = generatedCache[generatedIndex - 1];
				if (ce == base) {
					if (generatedCe_flags & (1 << /* The entry is present in the shared index. */27/*
										 * Already marked for inclusion in
										 * the split index, either because
										 * the corresponding file was
										 * modified and the cached stat data
										 * was refreshed, or because there
										 * is already a replacement entry in
										 * the split index.
										 * Nothing more to do here.
										 */)) {
					}  else if (!(generatedCe_flags & (1 << 18)) && ModernizedCProgram.is_racy_timestamp(istate, ce/*
										 * A racily clean cache entry stored
										 * only in the shared index: it must
										 * be added to the split index, so
										 * the subsequent do_write_index()
										 * can smudge its stat data.
										 */)) {
						generatedCe_flags |=  (1 << 27/*
											 * The entry is only present in the
											 * shared index and it was not
											 * refreshed.
											 * Just leave it there.
											 */);
					} 
					continue;
				} 
				if (generatedCe_namelen != generatedCe_namelen || /*Error: Function owner not recognized*/strcmp(generatedName, generatedName)) {
					ce.setIndex(0);
					continue;
				} 
				if (generatedCe_flags & (1 << 27/*
								 * Already marked for inclusion in the split
								 * index, either because the corresponding
								 * file was modified and the cached stat data
								 * was refreshed, or because the original
								 * entry already had a replacement entry in
								 * the split index.
								 * Nothing to do.
								 */)) {
				}  else if (!(generatedCe_flags & (1 << 18)) && ModernizedCProgram.is_racy_timestamp(istate, ce/*
								 * A copy of a racily clean cache entry from
								 * the shared index.  It must be added to
								 * the split index, so the subsequent
								 * do_write_index() can smudge its stat data.
								 */)) {
					generatedCe_flags |=  (1 << 27/*
									 * Thoroughly compare the cached data to see
									 * whether it should be marked for inclusion
									 * in the split index.
									 *
									 * This comparison might be unnecessary, as
									 * code paths modifying the cached data do
									 * set CE_UPDATE_IN_BASE as well.
									 */);
				} else {
						if (ce.compare_ce_content(base)) {
							generatedCe_flags |=  (1 << 27);
						} 
				} 
				base.discard_cache_entry();
				generatedCache[generatedIndex - 1] = ce;
			}
			for (i = 0; i < generatedCache_nr; i++) {
				ce = generatedCache[i];
				if ((generatedCe_flags & (1 << 17)) || !(generatedCe_flags & (1 << 26))) {
					generatedDelete_bitmap.ewah_set(i);
				}  else if (generatedCe_flags & (1 << 27)) {
					generatedReplace_bitmap.ewah_set(i);
					generatedCe_flags |=  (1 << 28);
					do {
						if ((nr_entries + 1) > nr_alloc) {
							if ((((nr_alloc) + 16) * 3 / 2) < (nr_entries + 1)) {
								nr_alloc = (nr_entries + 1);
							} else {
									nr_alloc = (((nr_alloc) + 16) * 3 / 2);
							} 
							(entries) = ModernizedCProgram.xrealloc((entries), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nr_alloc)));
						} 
					} while (0);
					entries[nr_entries++] = ce;
				} 
				if (ModernizedCProgram.is_null_oid(generatedOid)) {
					this.setDrop_cache_tree(1);
				} 
			}
		} 
		for (i = 0; i < generatedCache_nr; i++) {
			ce = generatedCache[i];
			if ((!generatedBase || !generatedIndex) && !(generatedCe_flags & (1 << 17))) {
				((!(generatedCe_flags & (1 << 28))) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!(ce->ce_flags & CE_STRIP_NAME)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\split-index.c", 359));
				do {
					if ((nr_entries + 1) > nr_alloc) {
						if ((((nr_alloc) + 16) * 3 / 2) < (nr_entries + 1)) {
							nr_alloc = (nr_entries + 1);
						} else {
								nr_alloc = (((nr_alloc) + 16) * 3 / 2);
						} 
						(entries) = ModernizedCProgram.xrealloc((entries), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nr_alloc)));
					} 
				} while (0);
				entries[nr_entries++] = ce;
			} 
			generatedCe_flags &=  ~(1 << 26/*
				 * take cache[] out temporarily, put entries[] in its place
				 * for writing
				 */);
		}
		si.setSaved_cache(generatedCache);
		si.setSaved_cache_nr(generatedCache_nr);
		this.setCache(entries);
		this.setCache_nr(nr_entries);
	}
	public void finish_writing_split_index() {
		split_index split_index = new split_index();
		split_index si = split_index.init_split_index(istate);
		ewah_bitmap generatedDelete_bitmap = si.getDelete_bitmap();
		generatedDelete_bitmap.ewah_free();
		ewah_bitmap generatedReplace_bitmap = si.getReplace_bitmap();
		generatedReplace_bitmap.ewah_free();
		si.setDelete_bitmap(((Object)0));
		si.setReplace_bitmap(((Object)0));
		cache_entry[][] generatedCache = this.getCache();
		ModernizedCProgram.free(generatedCache);
		cache_entry[][] generatedSaved_cache = si.getSaved_cache();
		this.setCache(generatedSaved_cache);
		int generatedSaved_cache_nr = si.getSaved_cache_nr();
		this.setCache_nr(generatedSaved_cache_nr);
	}
	public void discard_split_index() {
		split_index generatedSplit_index = this.getSplit_index();
		split_index si = generatedSplit_index;
		if (!si) {
			return /*Error: Unsupported expression*/;
		} 
		this.setSplit_index(((Object)0));
		int generatedRefcount = si.getRefcount();
		generatedRefcount--;
		if (generatedRefcount) {
			return /*Error: Unsupported expression*/;
		} 
		index_state generatedBase = si.getBase();
		if (generatedBase) {
			generatedBase.discard_index();
			ModernizedCProgram.free(generatedBase);
		} 
		ModernizedCProgram.free(si);
	}
	public void add_split_index() {
		split_index generatedSplit_index = this.getSplit_index();
		split_index split_index = new split_index();
		int generatedCache_changed = this.getCache_changed();
		if (!generatedSplit_index) {
			split_index.init_split_index(istate);
			generatedCache_changed |=  (1 << 6);
		} 
	}
	public void remove_split_index() {
		split_index generatedSplit_index = this.getSplit_index();
		index_state generatedBase = generatedSplit_index.getBase();
		mem_pool generatedCe_mem_pool = this.getCe_mem_pool();
		int generatedCache_changed = this.getCache_changed();
		if (generatedSplit_index) {
			if (generatedBase) {
				generatedCe_mem_pool.mem_pool_combine(generatedCe_mem_pool);
				generatedBase.setCache_nr(0/*
						 * We can discard the split index because its
						 * memory pool has been incorporated into the
						 * memory pool associated with the the_index.
						 */);
			} 
			istate.discard_split_index();
			generatedCache_changed |=  (1 << 0);
		} 
	}
	public cache_entry[][] getCache() {
		return cache;
	}
	public void setCache(cache_entry[][] newCache) {
		cache = newCache;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
	public int getCache_nr() {
		return cache_nr;
	}
	public void setCache_nr(int newCache_nr) {
		cache_nr = newCache_nr;
	}
	public int getCache_alloc() {
		return cache_alloc;
	}
	public void setCache_alloc(int newCache_alloc) {
		cache_alloc = newCache_alloc;
	}
	public int getCache_changed() {
		return cache_changed;
	}
	public void setCache_changed(int newCache_changed) {
		cache_changed = newCache_changed;
	}
	public string_list getResolve_undo() {
		return resolve_undo;
	}
	public void setResolve_undo(string_list newResolve_undo) {
		resolve_undo = newResolve_undo;
	}
	public cache_tree getCache_tree() {
		return cache_tree;
	}
	public void setCache_tree(cache_tree newCache_tree) {
		cache_tree = newCache_tree;
	}
	public split_index getSplit_index() {
		return split_index;
	}
	public void setSplit_index(split_index newSplit_index) {
		split_index = newSplit_index;
	}
	public cache_time getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(cache_time newTimestamp) {
		timestamp = newTimestamp;
	}
	public int getName_hash_initialized() {
		return name_hash_initialized;
	}
	public void setName_hash_initialized(int newName_hash_initialized) {
		name_hash_initialized = newName_hash_initialized;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getDrop_cache_tree() {
		return drop_cache_tree;
	}
	public void setDrop_cache_tree(int newDrop_cache_tree) {
		drop_cache_tree = newDrop_cache_tree;
	}
	public int getUpdated_workdir() {
		return updated_workdir;
	}
	public void setUpdated_workdir(int newUpdated_workdir) {
		updated_workdir = newUpdated_workdir;
	}
	public int getUpdated_skipworktree() {
		return updated_skipworktree;
	}
	public void setUpdated_skipworktree(int newUpdated_skipworktree) {
		updated_skipworktree = newUpdated_skipworktree;
	}
	public int getFsmonitor_has_run_once() {
		return fsmonitor_has_run_once;
	}
	public void setFsmonitor_has_run_once(int newFsmonitor_has_run_once) {
		fsmonitor_has_run_once = newFsmonitor_has_run_once;
	}
	public hashmap getName_hash() {
		return name_hash;
	}
	public void setName_hash(hashmap newName_hash) {
		name_hash = newName_hash;
	}
	public hashmap getDir_hash() {
		return dir_hash;
	}
	public void setDir_hash(hashmap newDir_hash) {
		dir_hash = newDir_hash;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public untracked_cache getUntracked() {
		return untracked;
	}
	public void setUntracked(untracked_cache newUntracked) {
		untracked = newUntracked;
	}
	public Object getFsmonitor_last_update() {
		return fsmonitor_last_update;
	}
	public void setFsmonitor_last_update(Object newFsmonitor_last_update) {
		fsmonitor_last_update = newFsmonitor_last_update;
	}
	public ewah_bitmap getFsmonitor_dirty() {
		return fsmonitor_dirty;
	}
	public void setFsmonitor_dirty(ewah_bitmap newFsmonitor_dirty) {
		fsmonitor_dirty = newFsmonitor_dirty;
	}
	public mem_pool getCe_mem_pool() {
		return ce_mem_pool;
	}
	public void setCe_mem_pool(mem_pool newCe_mem_pool) {
		ce_mem_pool = newCe_mem_pool;
	}
}
