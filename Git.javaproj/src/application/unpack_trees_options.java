package application;

public class unpack_trees_options {
	private int reset;
	private int merge;
	private int update;
	private int clone;
	private int index_only;
	private int nontrivial_merge;
	private int trivial_merges_only;
	private int verbose_update;
	private int aggressive;
	private int skip_unmerged;
	private int initial_checkout;
	private int diff_index_cached;
	private int debug_unpack;
	private int skip_sparse_checkout;
	private int quiet;
	private int exiting_early;
	private int show_all_errors;
	private int dry_run;
	private Object prefix;
	private int cache_bottom;
	private dir_struct dir;
	private pathspec pathspec;
	private Object fn;
	private Object msgs;
	private argv_array msgs_to_free;
	private Object unpack_rejects;
	private int head_idx;
	private int merge_size;
	private cache_entry df_conflict_entry;
	private Object unpack_data;
	private index_state dst_index;
	private index_state src_index;
	private index_state result;
	private pattern_list pl;
	
	public unpack_trees_options(int reset, int merge, int update, int clone, int index_only, int nontrivial_merge, int trivial_merges_only, int verbose_update, int aggressive, int skip_unmerged, int initial_checkout, int diff_index_cached, int debug_unpack, int skip_sparse_checkout, int quiet, int exiting_early, int show_all_errors, int dry_run, Object prefix, int cache_bottom, dir_struct dir, pathspec pathspec, Object fn, Object msgs, argv_array msgs_to_free, Object unpack_rejects, int head_idx, int merge_size, cache_entry df_conflict_entry, Object unpack_data, index_state dst_index, index_state src_index, index_state result, pattern_list pl) {
		setReset(reset);
		setMerge(merge);
		setUpdate(update);
		setClone(clone);
		setIndex_only(index_only);
		setNontrivial_merge(nontrivial_merge);
		setTrivial_merges_only(trivial_merges_only);
		setVerbose_update(verbose_update);
		setAggressive(aggressive);
		setSkip_unmerged(skip_unmerged);
		setInitial_checkout(initial_checkout);
		setDiff_index_cached(diff_index_cached);
		setDebug_unpack(debug_unpack);
		setSkip_sparse_checkout(skip_sparse_checkout);
		setQuiet(quiet);
		setExiting_early(exiting_early);
		setShow_all_errors(show_all_errors);
		setDry_run(dry_run);
		setPrefix(prefix);
		setCache_bottom(cache_bottom);
		setDir(dir);
		setPathspec(pathspec);
		setFn(fn);
		setMsgs(msgs);
		setMsgs_to_free(msgs_to_free);
		setUnpack_rejects(unpack_rejects);
		setHead_idx(head_idx);
		setMerge_size(merge_size);
		setDf_conflict_entry(df_conflict_entry);
		setUnpack_data(unpack_data);
		setDst_index(dst_index);
		setSrc_index(src_index);
		setResult(result);
		setPl(pl);
	}
	public unpack_trees_options() {
	}
	
	public void debug_stage(Object label, Object ce) {
		.printf("%s ", label);
		cache_entry generatedDf_conflict_entry = this.getDf_conflict_entry();
		if (!ce) {
			.printf("(missing)\n");
		}  else if (ce == generatedDf_conflict_entry) {
			.printf("(conflict)\n");
		} else {
				.printf("%06o #%d %s %.8s\n", ce.getCe_mode(), (((true) & (ce).getCe_flags()) >> 12), ce.getName(), ModernizedCProgram.oid_to_hex(ce.getOid()));
		} 
	}
	public int debug_merge(Object stages) {
		int i;
		int generatedMerge_size = this.getMerge_size();
		.printf("* %d-way merge\n", generatedMerge_size);
		o.debug_stage("index", stages[0]);
		for (i = 1; i <= generatedMerge_size; i++) {
			byte[] buf = new byte[24];
			ModernizedCProgram.xsnprintf(ModernizedCProgram.buf, , "ent#%d", i);
			o.debug_stage(ModernizedCProgram.buf, stages[i]);
		}
		return 0;
	}
	public void do_oneway_diff(Object idx, Object tree) {
		Object generatedUnpack_data = this.getUnpack_data();
		rev_info revs = generatedUnpack_data;
		int match_missing;
		int cached;
		/*
			 * i-t-a entries do not actually exist in the index (if we're
			 * looking at its content)
			 */
		int generatedIndex_only = this.getIndex_only();
		diff_options generatedDiffopt = revs.getDiffopt();
		int generatedIta_invisible_in_index = generatedDiffopt.getIta_invisible_in_index();
		if (generatedIndex_only && generatedIta_invisible_in_index && idx && ((idx).getCe_flags() & (1 << 29))) {
			idx = ((Object)0);
			if (!tree) {
				return ;
			} 
		} 
		cached = generatedIndex_only || (idx && ((idx.getCe_flags() & (true)) || ((idx).getCe_flags() & (1 << 30/*
			 * Backward compatibility wart - "diff-index -m" does
			 * not mean "do not ignore merges", but "match_missing".
			 *
			 * But with the revision flag parsing, that's found in
			 * "!revs->ignore_merges".
			 */))));
		int generatedIgnore_merges = revs.getIgnore_merges();
		match_missing = !generatedIgnore_merges;
		diff_filespec generatedOne = pair.getOne();
		if (cached && idx && (((true) & (idx).getCe_flags()) >> 12)) {
			diff_filepair pair = new diff_filepair();
			pair = .diff_unmerge(generatedDiffopt, idx.getName());
			if (tree) {
				.fill_filespec(generatedOne, tree.getOid(), 1, tree.getCe_mode());
			} 
			return ;
		} 
		if (!/*
			 * Something added to the tree?
			 */tree) {
			revs.show_new_file(idx, cached, match_missing);
			return ;
		} 
		if (!/*
			 * Something removed from the tree?
			 */idx) {
			revs.diff_index_show_file("-", tree, tree.getOid(), 1, tree.getCe_mode(), 0);
			return ;
		} 
		revs.show_modified(tree, idx, 1, cached, /* Show difference between old and new */match_missing/*
		 * The unpack_trees() interface is designed for merging, so
		 * the different source entries are designed primarily for
		 * the source trees, with the old index being really mainly
		 * used for being replaced by the result.
		 *
		 * For diffing, the index is more important, and we only have a
		 * single tree.
		 *
		 * We're supposed to advance o->pos to skip what we have already processed.
		 *
		 * This wrapper makes it all more readable, and takes care of all
		 * the fairly complex unpack_trees() semantic requirements, including
		 * the skipping, the path matching, the type conflict cases etc.
		 */);
	}
	public int oneway_diff(Object src) {
		cache_entry idx = src[0];
		cache_entry tree = src[1];
		Object generatedUnpack_data = this.getUnpack_data();
		rev_info revs = generatedUnpack_data;
		cache_entry generatedDf_conflict_entry = this.getDf_conflict_entry();
		if (tree == generatedDf_conflict_entry) {
			tree = ((Object)0);
		} 
		diff_options generatedDiffopt = revs.getDiffopt();
		repository generatedRepo = generatedDiffopt.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		pathspec generatedPrune_data = revs.getPrune_data();
		if (ModernizedCProgram.ce_path_match(generatedIndex, idx ? idx : tree, generatedPrune_data, ((Object)0))) {
			o.do_oneway_diff(idx, tree);
			if (.diff_can_quit_early(generatedDiffopt)) {
				this.setExiting_early(1);
				return -1;
			} 
		} 
		return 0;
	}
	public void setup_unpack_trees_porcelain(Object cmd) {
		int i;
		Object generatedMsgs = this.getMsgs();
		byte msgs = generatedMsgs;
		byte msg;
		argv_array generatedMsgs_to_free = this.getMsgs_to_free();
		generatedMsgs_to_free.argv_array_init();
		if (!.strcmp(cmd, "checkout")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("Your local changes to the following files would be overwritten by checkout:\n%%sPlease commit your changes or stash them before you switch branches.") : ModernizedCProgram._("Your local changes to the following files would be overwritten by checkout:\n%%s");
		}  else if (!.strcmp(cmd, "merge")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("Your local changes to the following files would be overwritten by merge:\n%%sPlease commit your changes or stash them before you merge.") : ModernizedCProgram._("Your local changes to the following files would be overwritten by merge:\n%%s");
		} else {
				msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("Your local changes to the following files would be overwritten by %s:\n%%sPlease commit your changes or stash them before you %s.") : ModernizedCProgram._("Your local changes to the following files would be overwritten by %s:\n%%s");
		} 
		msgs[unpack_trees_error_types.ERROR_WOULD_OVERWRITE] = msgs[unpack_trees_error_types.ERROR_NOT_UPTODATE_FILE] = generatedMsgs_to_free.argv_array_pushf(msg, cmd, cmd);
		msgs[unpack_trees_error_types.ERROR_NOT_UPTODATE_DIR] = ModernizedCProgram._("Updating the following directories would lose untracked files in them:\n%s");
		if (!.strcmp(cmd, "checkout")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be removed by checkout:\n%%sPlease move or remove them before you switch branches.") : ModernizedCProgram._("The following untracked working tree files would be removed by checkout:\n%%s");
		}  else if (!.strcmp(cmd, "merge")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be removed by merge:\n%%sPlease move or remove them before you merge.") : ModernizedCProgram._("The following untracked working tree files would be removed by merge:\n%%s");
		} else {
				msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be removed by %s:\n%%sPlease move or remove them before you %s.") : ModernizedCProgram._("The following untracked working tree files would be removed by %s:\n%%s");
		} 
		msgs[unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_REMOVED] = generatedMsgs_to_free.argv_array_pushf(msg, cmd, cmd);
		if (!.strcmp(cmd, "checkout")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be overwritten by checkout:\n%%sPlease move or remove them before you switch branches.") : ModernizedCProgram._("The following untracked working tree files would be overwritten by checkout:\n%%s");
		}  else if (!.strcmp(cmd, "merge")) {
			msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be overwritten by merge:\n%%sPlease move or remove them before you merge.") : ModernizedCProgram._("The following untracked working tree files would be overwritten by merge:\n%%s");
		} else {
				msg = ModernizedCProgram.advice_commit_before_merge ? ModernizedCProgram._("The following untracked working tree files would be overwritten by %s:\n%%sPlease move or remove them before you %s.") : ModernizedCProgram._("The following untracked working tree files would be overwritten by %s:\n%%s");
		} 
		msgs[unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_OVERWRITTEN] = generatedMsgs_to_free.argv_array_pushf(msg, cmd, cmd/*
			 * Special case: ERROR_BIND_OVERLAP refers to a pair of paths, we
			 * cannot easily display it as a list.
			 */);
		msgs[unpack_trees_error_types.ERROR_BIND_OVERLAP] = ModernizedCProgram._("Entry '%s' overlaps with '%s'.  Cannot bind.");
		msgs[unpack_trees_error_types.ERROR_SPARSE_NOT_UPTODATE_FILE] = ModernizedCProgram._("Cannot update sparse checkout: the following entries are not up to date:\n%s");
		msgs[unpack_trees_error_types.ERROR_WOULD_LOSE_ORPHANED_OVERWRITTEN] = ModernizedCProgram._("The following working tree files would be overwritten by sparse checkout update:\n%s");
		msgs[unpack_trees_error_types.ERROR_WOULD_LOSE_ORPHANED_REMOVED] = ModernizedCProgram._("The following working tree files would be removed by sparse checkout update:\n%s");
		msgs[unpack_trees_error_types.ERROR_WOULD_LOSE_SUBMODULE] = ModernizedCProgram._("Cannot update submodule:\n%s");
		this.setShow_all_errors(1);
		Object generatedUnpack_rejects = this.getUnpack_rejects();
		for (i = 0; i < ( /  + ( - 1)); /* rejected paths may not have a static buffer */i++) {
			generatedUnpack_rejects[i].setStrdup_strings(1);
		}
	}
	public void clear_unpack_trees_porcelain() {
		argv_array generatedMsgs_to_free = this.getMsgs_to_free();
		generatedMsgs_to_free.argv_array_clear();
		Object generatedMsgs = this.getMsgs();
		.memset(generatedMsgs, 0, );
	}
	public int add_rejected_path(unpack_trees_error_types e, Object path) {
		int generatedQuiet = this.getQuiet();
		if (generatedQuiet) {
			return -1;
		} 
		int generatedShow_all_errors = this.getShow_all_errors();
		if (!generatedShow_all_errors) {
			return ();
		} 
		Object generatedUnpack_rejects = this.getUnpack_rejects();
		generatedUnpack_rejects[unpack_trees_error_types.e].string_list_append(path);
		return -1/*
		 * display all the error messages stored in a nice way
		 */;
	}
	public void display_error_msgs() {
		int e;
		int i;
		int something_displayed = 0;
		Object generatedUnpack_rejects = this.getUnpack_rejects();
		int generatedNr = rejects.getNr();
		string_list_item generatedItems = rejects.getItems();
		for (e = 0; e < unpack_trees_error_types.NB_UNPACK_TREES_ERROR_TYPES; e++) {
			string_list rejects = generatedUnpack_rejects[e];
			if (generatedNr > 0) {
				strbuf path = new strbuf(, , );
				something_displayed = 1;
				for (i = 0; i < generatedNr; i++) {
					ModernizedCProgram.path.strbuf_addf("\t%s\n", generatedItems[i].getString());
				}
				();
				ModernizedCProgram.path.strbuf_release();
			} 
			rejects.string_list_clear(0);
		}
		if (something_displayed) {
			.fprintf((_iob[2]), ModernizedCProgram._("Aborting\n"));
		} 
	}
	public int check_submodule_move_head(Object ce, Object old_id, Object new_id) {
		int flags = (1 << 0);
		submodule sub = ModernizedCProgram.submodule_from_ce(ce);
		if (!sub) {
			return 0;
		} 
		int generatedReset = this.getReset();
		if (generatedReset) {
			flags |=  (1 << 1);
		} 
		if (ModernizedCProgram.submodule_move_head(ce.getName(), old_id, new_id, flags)) {
			return o.add_rejected_path(unpack_trees_error_types.ERROR_WOULD_LOSE_SUBMODULE, ce.getName());
		} 
		return 0/*
		 * Preform the loading of the repository's gitmodules file.  This function is
		 * used by 'check_update()' to perform loading of the gitmodules file in two
		 * differnt situations:
		 * (1) before removing entries from the working tree if the gitmodules file has
		 *     been marked for removal.  This situation is specified by 'state' == NULL.
		 * (2) before checking out entries to the working tree if the gitmodules file
		 *     has been marked for update.  This situation is specified by 'state' != NULL.
		 */;
	}
	public int check_updates() {
		int cnt = 0;
		int errs = 0;
		progress progress = new progress();
		index_state generatedResult = this.getResult();
		index_state index = generatedResult;
		checkout state = new checkout(((Object)0), "");
		int i;
		ModernizedCProgram.trace_performance_enter();
		state.setForce(1);
		state.setQuiet(1);
		state.setRefresh_cache(1);
		state.setIstate(index);
		int generatedClone = this.getClone();
		if (generatedClone) {
			ModernizedCProgram.setup_collided_checkout_detection(state, index);
		} 
		progress progress = new progress();
		progress = progress.get_progress(o);
		int generatedUpdate = this.getUpdate();
		if (generatedUpdate) {
			ModernizedCProgram.git_attr_set_direction(git_attr_direction.GIT_ATTR_CHECKOUT);
		} 
		int generatedDry_run = this.getDry_run();
		if (ModernizedCProgram.should_update_submodules() && generatedUpdate && !generatedDry_run) {
			ModernizedCProgram.load_gitmodules_file(index, ((Object)0));
		} 
		int generatedCache_nr = index.getCache_nr();
		cache_entry generatedCache = index.getCache();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (ce.getCe_flags() & (1 << 22)) {
				progress.display_progress(++cnt);
				if (generatedUpdate && !generatedDry_run) {
					ModernizedCProgram.unlink_entry(ce);
				} 
			} 
		}
		index.remove_marked_cache_entries(0);
		ModernizedCProgram.remove_scheduled_dirs();
		if (ModernizedCProgram.should_update_submodules() && generatedUpdate && !generatedDry_run) {
			ModernizedCProgram.load_gitmodules_file(index, state);
		} 
		state.enable_delayed_checkout();
		int generatedCe_flags = ce.getCe_flags();
		int generatedCe_mode = ce.getCe_mode();
		object_id generatedOid = ce.getOid();
		int generatedNr = to_fetch.getNr();
		if (ModernizedCProgram.has_promisor_remote() && generatedUpdate && !generatedDry_run) {
			oid_array to_fetch = new oid_array(((Object)0), 0, 0, 0);
			for (i = 0; i < generatedCache_nr; i++) {
				cache_entry ce = generatedCache[i];
				if (!(generatedCe_flags & (1 << 16)) || (((generatedCe_mode) & -1024) == 160000)) {
					continue;
				} 
				if (!ModernizedCProgram.oid_object_info_extended(ModernizedCProgram.the_repository, generatedOid, ((Object)0), (32 | 8))) {
					continue;
				} 
				to_fetch.oid_array_append(generatedOid);
			}
			if (generatedNr) {
				ModernizedCProgram.the_repository.promisor_remote_get_direct(generatedOid, generatedNr);
			} 
			to_fetch.oid_array_clear();
		} 
		Object generatedName = ce.getName();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (generatedCe_flags & (1 << 16)) {
				if (generatedCe_flags & (1 << 22)) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\unpack-trees.c", 431, "both update and delete flags are set on %s", generatedName);
				} 
				progress.display_progress(++cnt);
				generatedCe_flags &=  ~(1 << 16);
				if (generatedUpdate && !generatedDry_run) {
					errs |=  ce.checkout_entry(state, ((Object)0), ((Object)0));
				} 
			} 
		}
		progress.stop_progress();
		errs |=  state.finish_delayed_checkout(((Object)0));
		if (generatedUpdate) {
			ModernizedCProgram.git_attr_set_direction(git_attr_direction.GIT_ATTR_CHECKIN);
		} 
		if (generatedClone) {
			index.report_collided_checkout();
		} 
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\unpack-trees.c", 447, ModernizedCProgram.getnanotime(), "check_updates");
			} 
		} while (0);
		return errs != 0;
	}
	public int call_unpack_fn(Object src) {
		int ret = .UNRECOGNIZEDFUNCTIONNAME(src, o);
		if (ret > 0) {
			ret = 0;
		} 
		return ret;
	}
	public int locate_in_src_index(Object ce) {
		index_state generatedSrc_index = this.getSrc_index();
		index_state index = generatedSrc_index;
		int len = ((ce).getCe_namelen());
		int pos = ModernizedCProgram.index_name_pos(index, ce.getName(), len);
		if (pos < 0) {
			pos = -1 - pos;
		} 
		return pos/*
		 * We call unpack_index_entry() with an unmerged cache entry
		 * only in diff-index, and it wants a single callback.  Skip
		 * the other unmerged entry with the same name.
		 */;
	}
	public void add_same_unmerged(Object ce) {
		index_state generatedSrc_index = this.getSrc_index();
		index_state index = generatedSrc_index;
		int len = ((ce).getCe_namelen());
		int pos = ModernizedCProgram.index_name_pos(index, ce.getName(), len);
		if (0 <= pos) {
			ModernizedCProgram.die("programming error in a caller of mark_ce_used_same_name");
		} 
		int generatedCache_nr = index.getCache_nr();
		cache_entry generatedCache = index.getCache();
		int generatedCe_namelen = (next).getCe_namelen();
		Object generatedName = next.getName();
		for (pos = -pos - 1; pos < generatedCache_nr; pos++) {
			cache_entry next = generatedCache[pos];
			if (len != (generatedCe_namelen) || .memcmp(ce.getName(), generatedName, len)) {
				break;
			} 
			next.add_entry(o, 0, 0);
			ModernizedCProgram.mark_ce_used(next, o);
		}
	}
	public int unpack_failed(Object message) {
		index_state generatedResult = this.getResult();
		generatedResult.discard_index();
		int generatedQuiet = this.getQuiet();
		int generatedExiting_early = this.getExiting_early();
		if (!generatedQuiet && !generatedExiting_early) {
			if (message) {
				return ();
			} 
			return -1;
		} 
		return -1/*
		 * The tree traversal is looking at name p.  If we have a matching entry,
		 * return it.  If name p is a directory in the index, do not return
		 * anything, as we will want to match it when the traversal descends into
		 * the directory.
		 */;
	}
	/* Here come the merge functions */
	public int reject_merge(Object ce) {
		return o.add_rejected_path(unpack_trees_error_types.ERROR_WOULD_OVERWRITE, ce.getName());
	}
	public int verify_uptodate_1(Object ce, unpack_trees_error_types error_type) {
		stat st = new stat();
		int generatedIndex_only = this.getIndex_only();
		if (generatedIndex_only) {
			return 0/*
				 * CE_VALID and CE_SKIP_WORKTREE cheat, we better check again
				 * if this entry is truly up-to-date because this file may be
				 * overwritten.
				 */;
		} 
		int generatedReset = this.getReset();
		if ((ce.getCe_flags() & (true)) || ((ce).getCe_flags() & (1 << 30))) {
			;
		}  else if (generatedReset || ((ce).getCe_flags() & (1 << 18))) {
			return 0;
		} 
		index_state generatedSrc_index = this.getSrc_index();
		if (!.lstat(ce.getName(), st)) {
			int flags = 1 | 4;
			int changed = ModernizedCProgram.ie_match_stat(generatedSrc_index, ce, st, flags);
			if (ModernizedCProgram.submodule_from_ce(ce)) {
				int r = o.check_submodule_move_head(ce, "HEAD", ModernizedCProgram.oid_to_hex(ce.getOid()));
				if (r) {
					return o.add_rejected_path(unpack_trees_error_types.error_type, ce.getName());
				} 
				return 0;
			} 
			if (!changed) {
				return 0/*
						 * Historic default policy was to allow submodule to be out
						 * of sync wrt the superproject index. If the submodule was
						 * not considered interesting above, we don't care here.
						 */;
			} 
			if ((((ce.getCe_mode()) & -1024) == 160000)) {
				return 0;
			} 
			(._errno()) = 0;
		} 
		if ((._errno()) == 2) {
			return 0;
		} 
		return o.add_rejected_path(unpack_trees_error_types.error_type, ce.getName());
	}
	public int verify_uptodate(Object ce) {
		int generatedSkip_sparse_checkout = this.getSkip_sparse_checkout();
		if (!generatedSkip_sparse_checkout && (ce.getCe_flags() & (1 << 25))) {
			return 0;
		} 
		return o.verify_uptodate_1(ce, unpack_trees_error_types.ERROR_NOT_UPTODATE_FILE);
	}
	public int verify_uptodate_sparse(Object ce) {
		return o.verify_uptodate_1(ce, unpack_trees_error_types.ERROR_SPARSE_NOT_UPTODATE_FILE/*
		 * TODO: We should actually invalidate o->result, not src_index [1].
		 * But since cache tree and untracked cache both are not copied to
		 * o->result until unpacking is complete, we invalidate them on
		 * src_index instead with the assumption that they will be copied to
		 * dst_index at the end.
		 *
		 * [1] src_index->cache_tree is also used in unpack_callback() so if
		 * we invalidate o->result, we need to update it to use
		 * o->result.cache_tree as well.
		 */);
	}
	public void invalidate_ce_path(Object ce) {
		if (!ce) {
			return ;
		} 
		index_state generatedSrc_index = this.getSrc_index();
		generatedSrc_index.cache_tree_invalidate_path(ce.getName());
		generatedSrc_index.untracked_cache_invalidate_path(ce.getName(), 1/*
		 * Check that checking out ce->sha1 in subdir ce->name is not
		 * going to overwrite any working files.
		 *
		 * Currently, git does not checkout subprojects during a superproject
		 * checkout, so it is not going to overwrite anything.
		 */);
	}
	public int verify_clean_submodule(Object old_sha1, Object ce) {
		if (!ModernizedCProgram.submodule_from_ce(ce)) {
			return 0;
		} 
		return o.check_submodule_move_head(ce, old_sha1, ModernizedCProgram.oid_to_hex(ce.getOid()));
	}
	public int verify_clean_subdirectory(Object ce) {
		int namelen;
		int i;
		dir_struct d = new dir_struct();
		byte pathbuf;
		int cnt = 0;
		if ((((ce.getCe_mode()) & -1024) == 160000)) {
			object_id oid = new object_id();
			int sub_head = oid/*
					 * If we are not going to update the submodule, then
					 * we don't care.
					 */.resolve_gitlink_ref(ce.getName(), "HEAD");
			if (!sub_head && ModernizedCProgram.oideq(oid, ce.getOid())) {
				return 0;
			} 
			return o/*
				 * First let's make sure we do not have a local modification
				 * in that directory.
				 */.verify_clean_submodule(sub_head ? ((Object)0) : ModernizedCProgram.oid_to_hex(oid), ce);
		} 
		namelen = ((ce).getCe_namelen());
		index_state generatedSrc_index = this.getSrc_index();
		int generatedCache_nr = generatedSrc_index.getCache_nr();
		cache_entry generatedCache = generatedSrc_index.getCache();
		int generatedCe_namelen = (ce2).getCe_namelen();
		Object generatedName = ce2.getName();
		int generatedCe_flags = (ce2).getCe_flags();
		for (i = o.locate_in_src_index(ce); i < generatedCache_nr; i++) {
			cache_entry ce2 = generatedCache[i];
			int len = (generatedCe_namelen);
			if (ModernizedCProgram.len < namelen || .strncmp(ce.getName(), generatedName, namelen) || generatedName[namelen] != (byte)'/') {
				break;
			} 
			if (!(((true) & generatedCe_flags) >> 12)) {
				if (o.verify_uptodate(ce2)) {
					return -1;
				} 
				ce2.add_entry(o, (1 << 17), 0);
				o.invalidate_ce_path(ce);
				ModernizedCProgram.mark_ce_used(ce2, o);
			} 
			cnt/*
				 * Then we need to make sure that we do not lose a locally
				 * present file that is not ignored.
				 */++;
		}
		pathbuf = ModernizedCProgram.xstrfmt("%.*s/", namelen, generatedName);
		.memset(d, 0, );
		dir_struct generatedDir = this.getDir();
		Object generatedExclude_per_dir = generatedDir.getExclude_per_dir();
		if (generatedDir) {
			d.setExclude_per_dir(generatedExclude_per_dir);
		} 
		i = ModernizedCProgram.read_directory(d, generatedSrc_index, pathbuf, namelen + 1, ((Object)0));
		if (i) {
			return o.add_rejected_path(unpack_trees_error_types.ERROR_NOT_UPTODATE_DIR, generatedName);
		} 
		ModernizedCProgram.free(pathbuf);
		return cnt/*
		 * This gets called when there was no index entry for the tree entry 'dst',
		 * but we found a file in the working tree that 'lstat()' said was fine,
		 * and we're on a case-insensitive filesystem.
		 *
		 * See if we can find a case-insensitive match in the index that also
		 * matches the stat information, and assume it's that other file!
		 */;
	}
	public int verify_absent_1(Object ce, unpack_trees_error_types error_type) {
		int len;
		stat st = new stat();
		int generatedIndex_only = this.getIndex_only();
		int generatedReset = this.getReset();
		int generatedUpdate = this.getUpdate();
		if (generatedIndex_only || generatedReset || !generatedUpdate) {
			return 0;
		} 
		len = ModernizedCProgram.check_leading_path(ce.getName(), ((ce).getCe_namelen()));
		if (!len) {
			return 0;
		}  else if (len > 0) {
			byte path;
			int ret;
			ModernizedCProgram.path = ModernizedCProgram.xmemdupz(ce.getName(), len);
			if (.lstat(ModernizedCProgram.path, st)) {
				ret = ();
			} else {
					if (ModernizedCProgram.submodule_from_ce(ce)) {
						ret = o.check_submodule_move_head(ce, ModernizedCProgram.oid_to_hex(ce.getOid()), ((Object)0));
					} else {
							ret = ModernizedCProgram.check_ok_to_remove(ModernizedCProgram.path, len, 0, ((Object)0), st, unpack_trees_error_types.error_type, o);
					} 
			} 
			ModernizedCProgram.free(ModernizedCProgram.path);
			return ret;
		}  else if (.lstat(ce.getName(), st)) {
			if ((._errno()) != 2) {
				return ();
			} 
			return 0;
		} else {
				if (ModernizedCProgram.submodule_from_ce(ce)) {
					return o.check_submodule_move_head(ce, ModernizedCProgram.oid_to_hex(ce.getOid()), ((Object)0));
				} 
				return ModernizedCProgram.check_ok_to_remove(ce.getName(), ((ce).getCe_namelen()), ModernizedCProgram.ce_to_dtype(ce), ce, st, unpack_trees_error_types.error_type, o);
		} 
	}
	public int verify_absent(Object ce, unpack_trees_error_types error_type) {
		int generatedSkip_sparse_checkout = this.getSkip_sparse_checkout();
		if (!generatedSkip_sparse_checkout && (ce.getCe_flags() & (1 << 25))) {
			return 0;
		} 
		return o.verify_absent_1(ce, unpack_trees_error_types.error_type);
	}
	public int verify_absent_sparse(Object ce, unpack_trees_error_types error_type) {
		unpack_trees_error_types orphaned_error = unpack_trees_error_types.error_type;
		if (unpack_trees_error_types.orphaned_error == unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_OVERWRITTEN) {
			unpack_trees_error_types.orphaned_error = unpack_trees_error_types.ERROR_WOULD_LOSE_ORPHANED_OVERWRITTEN;
		} 
		return o.verify_absent_1(ce, unpack_trees_error_types.orphaned_error);
	}
	public int merged_entry(Object ce, Object old) {
		int update = (1 << 16);
		index_state generatedResult = this.getResult();
		cache_entry cache_entry = new cache_entry();
		cache_entry merge = cache_entry.dup_cache_entry(ce, generatedResult);
		int generatedCe_flags = merge.getCe_flags();
		if (!old/*
				 * New index entries. In sparse checkout, the following
				 * verify_absent() will be delayed until after
				 * traverse_trees() finishes in unpack_trees(), then:
				 *
				 *  - CE_NEW_SKIP_WORKTREE will be computed correctly
				 *  - verify_absent() be called again, this time with
				 *    correct CE_NEW_SKIP_WORKTREE
				 *
				 * verify_absent() call here does nothing in sparse
				 * checkout (i.e. o->skip_sparse_checkout == 0)
				 */) {
			update |=  (1 << 19);
			generatedCe_flags |=  (1 << 25);
			if (o.verify_absent(merge, unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_OVERWRITTEN)) {
				merge.discard_cache_entry();
				return -1;
			} 
			o.invalidate_ce_path(merge);
			if (ModernizedCProgram.submodule_from_ce(ce)) {
				int ret = o.check_submodule_move_head(ce, ((Object)0), ModernizedCProgram.oid_to_hex(ce.getOid()));
				if (ret) {
					return ret;
				} 
			} 
		}  else if (!(generatedCe_flags & (1 << 23/*
				 * See if we can re-use the old CE directly?
				 * That way we get the uptodate stat info.
				 *
				 * This also removes the UPDATE flag on a match; otherwise
				 * we will end up overwriting local changes in the work tree.
				 */))) {
			if (ModernizedCProgram.same(old, merge)) {
				merge.copy_cache_entry(old);
				update = 0;
			} else {
					if (o.verify_uptodate(old)) {
						merge.discard_cache_entry();
						return -1;
					} 
					update |=  generatedCe_flags & ((1 << 30) | (1 << /* Migrate old flags over */25));
					o.invalidate_ce_path(old);
			} 
			if (ModernizedCProgram.submodule_from_ce(ce)) {
				int ret = o.check_submodule_move_head(ce, ModernizedCProgram.oid_to_hex(old.getOid()), ModernizedCProgram.oid_to_hex(ce.getOid()));
				if (ret) {
					return ret/*
							 * Previously unmerged entry left as an existence
							 * marker by read_index_unmerged();
							 */;
				} 
			} 
		} else {
				o.invalidate_ce_path(old);
		} 
		ModernizedCProgram.do_add_entry(o, merge, update, (true));
		return 1;
	}
	public int deleted_entry(Object ce, Object old) {
		if (!/* Did it exist in the index? */old) {
			if (o.verify_absent(ce, unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_REMOVED)) {
				return -1;
			} 
			return 0;
		} 
		if (!(old.getCe_flags() & (1 << 23)) && o.verify_uptodate(old)) {
			return -1;
		} 
		ce.add_entry(o, (1 << 17), 0);
		o.invalidate_ce_path(ce);
		return 1;
	}
	public int threeway_merge(Object stages) {
		cache_entry index = new cache_entry();
		cache_entry head = new cache_entry();
		int generatedHead_idx = this.getHead_idx();
		cache_entry remote = stages[generatedHead_idx + 1];
		int count;
		int head_match = 0;
		int remote_match = 0;
		int df_conflict_head = 0;
		int df_conflict_remote = 0;
		int any_anc_missing = 0;
		int no_anc_exists = 1;
		int i;
		cache_entry generatedDf_conflict_entry = this.getDf_conflict_entry();
		for (i = 1; i < generatedHead_idx; i++) {
			if (!stages[i] || stages[i] == generatedDf_conflict_entry) {
				any_anc_missing = 1;
			} else {
					no_anc_exists = 0;
			} 
		}
		index = stages[0];
		head = stages[generatedHead_idx];
		if (head == generatedDf_conflict_entry) {
			df_conflict_head = 1;
			head = ((Object)0);
		} 
		if (remote == generatedDf_conflict_entry) {
			df_conflict_remote = 1;
			remote = ((Object)0/*
				 * First, if there's a #16 situation, note that to prevent #13
				 * and #14.
				 */);
		} 
		if (!ModernizedCProgram.same(remote, head)) {
			for (i = 1; i < generatedHead_idx; i++) {
				if (ModernizedCProgram.same(stages[i], head)) {
					head_match = i;
				} 
				if (ModernizedCProgram.same(stages[i], remote)) {
					remote_match = i/*
						 * We start with cases where the index is allowed to match
						 * something other than the head: #14(ALT) and #2ALT, where it
						 * is permitted to match the result instead.
						 */;
				} 
			}
		} 
		if (remote && !df_conflict_head && head_match && !/* #14, #14ALT, #2ALT */remote_match) {
			if (index && !ModernizedCProgram.same(index, remote) && !ModernizedCProgram.same(index, head)) {
				return o.reject_merge(index);
			} 
			return o/*
				 * If we have an entry in the index cache, then we want to
				 * make sure that it matches head.
				 */.merged_entry(remote, index);
		} 
		if (index && !ModernizedCProgram.same(index, head)) {
			return o.reject_merge(index);
		} 
		if (head) {
			if (ModernizedCProgram.same(head, /* #5ALT, #15 */remote)) {
				return o.merged_entry(head, index);
			} 
			if (!df_conflict_remote && remote_match && !/* #13, #3ALT */head_match) {
				return o.merged_entry(head, index);
			} 
		} 
		if (!head && !remote && /* #1 */any_anc_missing) {
			return 0/*
				 * Under the "aggressive" rule, we resolve mostly trivial
				 * cases that we historically had git-merge-one-file resolve.
				 */;
		} 
		int generatedAggressive = this.getAggressive();
		if (generatedAggressive) {
			int head_deleted = !head;
			int remote_deleted = !remote;
			cache_entry ce = ((Object)0);
			if (index) {
				ce = index;
			}  else if (head) {
				ce = head;
			}  else if (remote) {
				ce = remote;
			} else {
					for (i = 1; i < generatedHead_idx; i++) {
						if (stages[i] && stages[i] != generatedDf_conflict_entry) {
							ce = stages[i];
							break;
						} 
					}
			} 
			if ((head_deleted && /*
					 * Deleted in both.
					 * Deleted in one and unchanged in the other.
					 */remote_deleted) || (head_deleted && remote && remote_match) || (remote_deleted && head && head_match)) {
				if (index) {
					return o.deleted_entry(index, index);
				} 
				if (ce && !head_deleted) {
					if (o.verify_absent(ce, unpack_trees_error_types.ERROR_WOULD_LOSE_UNTRACKED_REMOVED)) {
						return -1;
					} 
				} 
				return 0/*
						 * Added in both, identically.
						 */;
			} 
			if (no_anc_exists && head && remote && ModernizedCProgram.same(head, remote)) {
				return o.merged_entry(head, index);
			} 
		} 
		if (/* Below are "no merge" cases, which require that the index be
			 * up-to-date to avoid the files getting overwritten with
			 * conflict resolution files.
			 */index) {
			if (o.verify_uptodate(index)) {
				return -1;
			} 
		} 
		this.setNontrivial_merge(1);
		count = /* #2, #3, #4, #6, #7, #9, #10, #11. */0;
		if (!head_match || !remote_match) {
			for (i = 1; i < generatedHead_idx; i++) {
				if (stages[i] && stages[i] != generatedDf_conflict_entry) {
					ModernizedCProgram.keep_entry(stages[i], o);
					count++;
					break;
				} 
			}
		} 
		if (head) {
			count += ModernizedCProgram.keep_entry(head, o);
		} 
		if (remote) {
			count += ModernizedCProgram.keep_entry(remote, o);
		} 
		return count/*
		 * Two-way merge.
		 *
		 * The rule is to "carry forward" what is in the index without losing
		 * information across a "fast-forward", favoring a successful merge
		 * over a merge failure when it makes sense.  For details of the
		 * "carry forward" rule, please see <Documentation/git-read-tree.txt>.
		 *
		 */;
	}
	public int twoway_merge(Object src) {
		cache_entry current = src[0];
		cache_entry oldtree = src[1];
		cache_entry newtree = src[2];
		int generatedMerge_size = this.getMerge_size();
		if (generatedMerge_size != 2) {
			return ();
		} 
		cache_entry generatedDf_conflict_entry = this.getDf_conflict_entry();
		if (oldtree == generatedDf_conflict_entry) {
			oldtree = ((Object)0);
		} 
		if (newtree == generatedDf_conflict_entry) {
			newtree = ((Object)0);
		} 
		int generatedReset = this.getReset();
		int generatedInitial_checkout = this.getInitial_checkout();
		if (current) {
			if (current.getCe_flags() & (1 << 23)) {
				if (ModernizedCProgram.same(oldtree, newtree) || generatedReset) {
					if (!newtree) {
						return o.deleted_entry(current, current);
					} else {
							return o.merged_entry(newtree, current);
					} 
				} 
				return o.reject_merge(current);
			}  else if ((!oldtree && !/* 4 and 5 */newtree) || (!oldtree && newtree && ModernizedCProgram.same(current, /* 6 and 7 */newtree)) || (oldtree && newtree && ModernizedCProgram.same(oldtree, /* 14 and 15 */newtree)) || (oldtree && newtree && !ModernizedCProgram.same(oldtree, /* 18 and 19 */newtree) && ModernizedCProgram.same(current, newtree))) {
				return ModernizedCProgram.keep_entry(current, o);
			}  else if (oldtree && !newtree && ModernizedCProgram.same(current, oldtree)) {
				return /* 10 or 11 */o.deleted_entry(oldtree, current);
			}  else if (oldtree && newtree && ModernizedCProgram.same(current, oldtree) && !ModernizedCProgram.same(current, newtree)) {
				return /* 20 or 21 */o.merged_entry(newtree, current);
			} else {
					return o.reject_merge(current);
			} 
		}  else if (newtree) {
			if (oldtree && !generatedInitial_checkout) {
				if (ModernizedCProgram.same(oldtree, newtree)) {
					return 1;
				} 
				return o.reject_merge(oldtree);
			} 
			return o.merged_entry(newtree, current);
		} 
		return o/*
		 * Bind merge.
		 *
		 * Keep the index entries at stage0, collapse stage1 but make sure
		 * stage0 does not have anything there.
		 */.deleted_entry(oldtree, current);
	}
	public int bind_merge(Object src) {
		cache_entry old = src[0];
		cache_entry a = src[1];
		int generatedMerge_size = this.getMerge_size();
		if (generatedMerge_size != 1) {
			return ();
		} 
		int generatedQuiet = this.getQuiet();
		if (a && old) {
			return generatedQuiet ? -1 : ();
		} 
		if (!a) {
			return ModernizedCProgram.keep_entry(old, o);
		} else {
				return o/*
				 * One-way merge.
				 *
				 * The rule is:
				 * - take the stat information from stage0, take the data from stage1
				 */.merged_entry(a, ((Object)0));
		} 
	}
	public int oneway_merge(Object src) {
		cache_entry old = src[0];
		cache_entry a = src[1];
		int generatedMerge_size = this.getMerge_size();
		if (generatedMerge_size != 1) {
			return ();
		} 
		cache_entry generatedDf_conflict_entry = this.getDf_conflict_entry();
		if (!a || a == generatedDf_conflict_entry) {
			return o.deleted_entry(old, old);
		} 
		int generatedReset = this.getReset();
		int generatedUpdate = this.getUpdate();
		index_state generatedSrc_index = this.getSrc_index();
		if (old && ModernizedCProgram.same(old, a)) {
			int update = 0;
			if (generatedReset && generatedUpdate && !((old).getCe_flags() & (1 << 18)) && !((old).getCe_flags() & (1 << 30))) {
				stat st = new stat();
				if (.lstat(old.getName(), st) || ModernizedCProgram.ie_match_stat(generatedSrc_index, old, st, 1 | 4)) {
					update |=  (1 << 16);
				} 
			} 
			if (generatedUpdate && (((old.getCe_mode()) & -1024) == 160000) && ModernizedCProgram.should_update_submodules() && !o.verify_uptodate(old)) {
				update |=  (1 << 16);
			} 
			old.add_entry(o, update, (true));
			return 0;
		} 
		return o.merged_entry(a, old);
	}
	public int getReset() {
		return reset;
	}
	public void setReset(int newReset) {
		reset = newReset;
	}
	public int getMerge() {
		return merge;
	}
	public void setMerge(int newMerge) {
		merge = newMerge;
	}
	public int getUpdate() {
		return update;
	}
	public void setUpdate(int newUpdate) {
		update = newUpdate;
	}
	public int getClone() {
		return clone;
	}
	public void setClone(int newClone) {
		clone = newClone;
	}
	public int getIndex_only() {
		return index_only;
	}
	public void setIndex_only(int newIndex_only) {
		index_only = newIndex_only;
	}
	public int getNontrivial_merge() {
		return nontrivial_merge;
	}
	public void setNontrivial_merge(int newNontrivial_merge) {
		nontrivial_merge = newNontrivial_merge;
	}
	public int getTrivial_merges_only() {
		return trivial_merges_only;
	}
	public void setTrivial_merges_only(int newTrivial_merges_only) {
		trivial_merges_only = newTrivial_merges_only;
	}
	public int getVerbose_update() {
		return verbose_update;
	}
	public void setVerbose_update(int newVerbose_update) {
		verbose_update = newVerbose_update;
	}
	public int getAggressive() {
		return aggressive;
	}
	public void setAggressive(int newAggressive) {
		aggressive = newAggressive;
	}
	public int getSkip_unmerged() {
		return skip_unmerged;
	}
	public void setSkip_unmerged(int newSkip_unmerged) {
		skip_unmerged = newSkip_unmerged;
	}
	public int getInitial_checkout() {
		return initial_checkout;
	}
	public void setInitial_checkout(int newInitial_checkout) {
		initial_checkout = newInitial_checkout;
	}
	public int getDiff_index_cached() {
		return diff_index_cached;
	}
	public void setDiff_index_cached(int newDiff_index_cached) {
		diff_index_cached = newDiff_index_cached;
	}
	public int getDebug_unpack() {
		return debug_unpack;
	}
	public void setDebug_unpack(int newDebug_unpack) {
		debug_unpack = newDebug_unpack;
	}
	public int getSkip_sparse_checkout() {
		return skip_sparse_checkout;
	}
	public void setSkip_sparse_checkout(int newSkip_sparse_checkout) {
		skip_sparse_checkout = newSkip_sparse_checkout;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getExiting_early() {
		return exiting_early;
	}
	public void setExiting_early(int newExiting_early) {
		exiting_early = newExiting_early;
	}
	public int getShow_all_errors() {
		return show_all_errors;
	}
	public void setShow_all_errors(int newShow_all_errors) {
		show_all_errors = newShow_all_errors;
	}
	public int getDry_run() {
		return dry_run;
	}
	public void setDry_run(int newDry_run) {
		dry_run = newDry_run;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getCache_bottom() {
		return cache_bottom;
	}
	public void setCache_bottom(int newCache_bottom) {
		cache_bottom = newCache_bottom;
	}
	public dir_struct getDir() {
		return dir;
	}
	public void setDir(dir_struct newDir) {
		dir = newDir;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getMsgs() {
		return msgs;
	}
	public void setMsgs(Object newMsgs) {
		msgs = newMsgs;
	}
	public argv_array getMsgs_to_free() {
		return msgs_to_free;
	}
	public void setMsgs_to_free(argv_array newMsgs_to_free) {
		msgs_to_free = newMsgs_to_free;
	}
	public Object getUnpack_rejects() {
		return unpack_rejects;
	}
	public void setUnpack_rejects(Object newUnpack_rejects) {
		unpack_rejects = newUnpack_rejects;
	}
	public int getHead_idx() {
		return head_idx;
	}
	public void setHead_idx(int newHead_idx) {
		head_idx = newHead_idx;
	}
	public int getMerge_size() {
		return merge_size;
	}
	public void setMerge_size(int newMerge_size) {
		merge_size = newMerge_size;
	}
	public cache_entry getDf_conflict_entry() {
		return df_conflict_entry;
	}
	public void setDf_conflict_entry(cache_entry newDf_conflict_entry) {
		df_conflict_entry = newDf_conflict_entry;
	}
	public Object getUnpack_data() {
		return unpack_data;
	}
	public void setUnpack_data(Object newUnpack_data) {
		unpack_data = newUnpack_data;
	}
	public index_state getDst_index() {
		return dst_index;
	}
	public void setDst_index(index_state newDst_index) {
		dst_index = newDst_index;
	}
	public index_state getSrc_index() {
		return src_index;
	}
	public void setSrc_index(index_state newSrc_index) {
		src_index = newSrc_index;
	}
	public index_state getResult() {
		return result;
	}
	public void setResult(index_state newResult) {
		result = newResult;
	}
	public pattern_list getPl() {
		return pl;
	}
	public void setPl(pattern_list newPl) {
		pl = newPl;
	}
}
