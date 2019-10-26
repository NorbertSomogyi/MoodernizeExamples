package application;

public class repository {
	private Byte gitdir;
	private Byte commondir;
	private raw_object_store objects;
	private parsed_object_pool parsed_objects;
	private ref_store refs;
	private path_cache cached_paths;
	private Byte graft_file;
	private Byte index_file;
	private Byte worktree;
	private Byte submodule_prefix;
	private repo_settings settings;
	private config_set config;
	private submodule_cache submodule_cache;
	private index_state index;
	private Object hash_algo;
	private int trace2_repo_id;
	private int commit_graph_disabled;
	private int different_commondir;
	
	public repository(Byte gitdir, Byte commondir, raw_object_store objects, parsed_object_pool parsed_objects, ref_store refs, path_cache cached_paths, Byte graft_file, Byte index_file, Byte worktree, Byte submodule_prefix, repo_settings settings, config_set config, submodule_cache submodule_cache, index_state index, Object hash_algo, int trace2_repo_id, int commit_graph_disabled, int different_commondir) {
		setGitdir(gitdir);
		setCommondir(commondir);
		setObjects(objects);
		setParsed_objects(parsed_objects);
		setRefs(refs);
		setCached_paths(cached_paths);
		setGraft_file(graft_file);
		setIndex_file(index_file);
		setWorktree(worktree);
		setSubmodule_prefix(submodule_prefix);
		setSettings(settings);
		setConfig(config);
		setSubmodule_cache(submodule_cache);
		setIndex(index);
		setHash_algo(hash_algo);
		setTrace2_repo_id(trace2_repo_id);
		setCommit_graph_disabled(commit_graph_disabled);
		setDifferent_commondir(different_commondir);
	}
	public repository() {
	}
	
	public void prepare_repo_settings() {
		int value;
		byte strval;
		repo_settings generatedSettings = this.getSettings();
		int generatedInitialized = generatedSettings.getInitialized();
		if (generatedInitialized) {
			return ;
		} 
		.memset(generatedSettings, -1, );
		if (!.repo_config_get_bool(r, "core.commitgraph", value)) {
			generatedSettings.setCore_commit_graph(value);
		} 
		if (!.repo_config_get_bool(r, "gc.writecommitgraph", value)) {
			generatedSettings.setGc_write_commit_graph(value);
		} 
		int generatedCore_commit_graph = generatedSettings.getCore_commit_graph();
		do {
			if (generatedCore_commit_graph == -1) {
				generatedSettings.setCore_commit_graph(1);
			} 
		} while (0);
		int generatedGc_write_commit_graph = generatedSettings.getGc_write_commit_graph();
		do {
			if (generatedGc_write_commit_graph == -1) {
				generatedSettings.setGc_write_commit_graph(1);
			} 
		} while (0);
		if (!.repo_config_get_int(r, "index.version", value)) {
			generatedSettings.setIndex_version(value);
		} 
		if (!.repo_config_get_maybe_bool(r, "core.untrackedcache", value)) {
			if (value == 0) {
				generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_REMOVE);
			} else {
					generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_WRITE);
			} 
		}  else if (!.repo_config_get_string(r, "core.untrackedcache", strval)) {
			if (!.strcasecmp(strval, "keep")) {
				generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_KEEP);
			} 
			ModernizedCProgram.free(strval);
		} 
		if (!.repo_config_get_string(r, "fetch.negotiationalgorithm", strval)) {
			if (!.strcasecmp(strval, "skipping")) {
				generatedSettings.setFetch_negotiation_algorithm(fetch_negotiation_setting.FETCH_NEGOTIATION_SKIPPING);
			} else {
					generatedSettings.setFetch_negotiation_algorithm(fetch_negotiation_setting.FETCH_NEGOTIATION_DEFAULT);
			} 
		} 
		if (!.repo_config_get_bool(r, "pack.usesparse", value)) {
			generatedSettings.setPack_use_sparse(value);
		} 
		int generatedIndex_version = generatedSettings.getIndex_version();
		untracked_cache_setting generatedCore_untracked_cache = generatedSettings.getCore_untracked_cache();
		if (!.repo_config_get_bool(r, "feature.manyfiles", value) && value) {
			do {
				if (generatedIndex_version == -1) {
					generatedSettings.setIndex_version(4);
				} 
			} while (0);
			do {
				if (generatedCore_untracked_cache == -1) {
					generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_WRITE);
				} 
			} while (0);
		} 
		if (!.repo_config_get_bool(r, "fetch.writecommitgraph", value)) {
			generatedSettings.setFetch_write_commit_graph(value);
		} 
		int generatedPack_use_sparse = generatedSettings.getPack_use_sparse();
		fetch_negotiation_setting generatedFetch_negotiation_algorithm = generatedSettings.getFetch_negotiation_algorithm();
		int generatedFetch_write_commit_graph = generatedSettings.getFetch_write_commit_graph();
		if (!.repo_config_get_bool(r, "feature.experimental", value) && value) {
			do {
				if (generatedPack_use_sparse == -1) {
					generatedSettings.setPack_use_sparse(1);
				} 
			} while (0);
			do {
				if (generatedFetch_negotiation_algorithm == -1) {
					generatedSettings.setFetch_negotiation_algorithm(fetch_negotiation_setting.FETCH_NEGOTIATION_SKIPPING);
				} 
			} while (0);
			do {
				if (generatedFetch_write_commit_graph == -1) {
					generatedSettings.setFetch_write_commit_graph(1);
				} 
			} while (0);
		} 
		do {
			if (generatedFetch_write_commit_graph == -1) {
				generatedSettings.setFetch_write_commit_graph(0);
			} 
		} while (0);
		if (/* Hack for test programs like test-dump-untracked-cache */ModernizedCProgram.ignore_untracked_cache_config) {
			generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_KEEP);
		} else {
				do {
					if (generatedCore_untracked_cache == -1) {
						generatedSettings.setCore_untracked_cache(untracked_cache_setting.UNTRACKED_CACHE_KEEP);
					} 
				} while (0);
		} 
		do {
			if (generatedFetch_negotiation_algorithm == -1) {
				generatedSettings.setFetch_negotiation_algorithm(fetch_negotiation_setting.FETCH_NEGOTIATION_DEFAULT);
			} 
		} while (0);
	}
	public void check_good_are_ancestors_of_bad(Object prefix, int no_checkout) {
		byte filename = ModernizedCProgram.git_pathdup("BISECT_ANCESTORS_OK");
		stat st = new stat();
		int fd;
		int rev_nr;
		commit rev = new commit();
		if (!ModernizedCProgram.current_bad_oid) {
			ModernizedCProgram.die(ModernizedCProgram._("a %s revision is needed"), ModernizedCProgram.term_bad);
		} 
		Object generatedSt_mode = st.getSt_mode();
		if (!.stat(filename, st) && (((generatedSt_mode) & -1024) == /* Check if file BISECT_ANCESTORS_OK exists. */-1024)) {
			;
		} 
		if (ModernizedCProgram.good_revs.getNr() == /* Bisecting with no good rev is ok. */0) {
			;
		} 
		commit commit = new commit();
		rev = commit.get_bad_and_good_commits(r, /* Check if all good revs are ancestor of the bad rev. */rev_nr);
		if (ModernizedCProgram.check_ancestors(r, rev_nr, rev, prefix)) {
			rev.check_merge_bases(rev_nr, no_checkout);
		} 
		ModernizedCProgram.free(rev);
		fd = .open(filename, -1024 | -1024 | 1, /* Create file BISECT_ANCESTORS_OK. */600);
		if (fd < 0) {
			ModernizedCProgram.warning_errno(ModernizedCProgram._("could not create file '%s'"), filename);
		} else {
				.close(fd);
		} 
	}
	public int bisect_next_all(Object prefix, int no_checkout) {
		rev_info revs = new rev_info();
		commit_list tried = new commit_list();
		int reaches = 0;
		int all = 0;
		int nr;
		int steps;
		object_id bisect_rev = new object_id();
		byte steps_msg;
		ModernizedCProgram.read_bisect_terms(ModernizedCProgram.term_bad, ModernizedCProgram.term_good);
		if (ModernizedCProgram.read_bisect_refs()) {
			ModernizedCProgram.die(ModernizedCProgram._("reading bisect refs failed"));
		} 
		r.check_good_are_ancestors_of_bad(prefix, no_checkout);
		ModernizedCProgram.bisect_rev_setup(r, revs, prefix, "%s", "^%s", 1);
		revs.setLimited(1);
		revs.bisect_common();
		commit_list generatedCommits = revs.getCommits();
		generatedCommits.find_bisection(reaches, all, !!ModernizedCProgram.skipped_revs.getNr());
		revs.setCommits(generatedCommits.managed_skipped(tried));
		if (!generatedCommits) {
			tried.exit_if_skipped_commits(((Object)0));
			.printf(ModernizedCProgram._("%s was both %s and %s\n"), ModernizedCProgram.oid_to_hex(ModernizedCProgram.current_bad_oid), ModernizedCProgram.term_good, ModernizedCProgram.term_bad);
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\bisect.c", 981, (true)));
		} 
		if (!all) {
			.fprintf((_iob[2]), ModernizedCProgram._("No testable commit found.\nMaybe you started with bad path parameters?\n"));
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\bisect.c", 987, (true)));
		} 
		commit generatedItem = generatedCommits.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		bisect_rev = generatedOid;
		if (ModernizedCProgram.oideq(bisect_rev, ModernizedCProgram.current_bad_oid)) {
			tried.exit_if_skipped_commits(ModernizedCProgram.current_bad_oid);
			.printf("%s is the first %s commit\n", ModernizedCProgram.oid_to_hex(bisect_rev), ModernizedCProgram.term_bad);
			ModernizedCProgram.show_diff_tree(r, prefix, generatedItem);
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\bisect.c", 998, (/* This means the bisection process succeeded. */true)));
		} 
		nr = all - reaches - 1;
		steps = ModernizedCProgram.estimate_bisect_steps(all);
		steps_msg = ModernizedCProgram.xstrfmt(ModernizedCProgram.Q_("(roughly %d step)", "(roughly %d steps)", steps), steps/*
			 * TRANSLATORS: the last %s will be replaced with "(roughly %d
			 * steps)" translation.
			 */);
		.printf(ModernizedCProgram.Q_("Bisecting: %d revision left to test after this %s\n", "Bisecting: %d revisions left to test after this %s\n", nr), nr, steps_msg);
		ModernizedCProgram.free(steps_msg);
		return ModernizedCProgram.bisect_checkout(bisect_rev, no_checkout);
	}
	public void trace2_def_repo_fl(Object file, int line) {
		tr2_tgt tgt_j = new tr2_tgt();
		int j;
		if (!ModernizedCProgram.trace2_enabled) {
			return ;
		} 
		if (ModernizedCProgram.repo.getTrace2_repo_id()) {
			return ;
		} 
		ModernizedCProgram.repo.setTrace2_repo_id(ModernizedCProgram.tr2tls_locked_increment(ModernizedCProgram.tr2_next_repo_id));
		Object generatedTr2_tgt = tgt_j.getTr2_tgt();
		for (; tgt_j; ) {
			if (ModernizedCProgram.tr2_dst_trace_want(generatedTr2_tgt)) {
				if (generatedTr2_tgt) {
					.UNRECOGNIZEDFUNCTIONNAME(file, line, ModernizedCProgram.repo);
				} 
			} 
		}
	}
	public int is_submodule_active(Object path) {
		int ret = 0;
		byte key = ((Object)0);
		byte value = ((Object)0);
		string_list sl = new string_list();
		submodule module = new submodule();
		module = ModernizedCProgram.repo.submodule_from_path(ModernizedCProgram.null_oid, path);
		if (!/* early return if there isn't a path->module mapping */module) {
			return 0;
		} 
		key = ModernizedCProgram.xstrfmt("submodule.%s.active", module.getName());
		if (!.repo_config_get_bool(ModernizedCProgram.repo, key, ret)) {
			ModernizedCProgram.free(key);
			return ret;
		} 
		ModernizedCProgram.free(key);
		sl = .repo_config_get_value_multi(ModernizedCProgram.repo, /* submodule.active is set */"submodule.active");
		if (sl) {
			pathspec ps = new pathspec();
			argv_array args = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
			string_list_item item = new string_list_item();
			for (item = (sl).getItems(); item && item < (sl).getItems() + (sl).getNr(); ++item) {
				ModernizedCProgram.args.argv_array_push(item.getString());
			}
			ps.parse_pathspec(0, 0, ((Object)0), ModernizedCProgram.args.getArgv());
			ret = ModernizedCProgram.match_pathspec(ModernizedCProgram.repo.getIndex(), ps, path, .strlen(path), 0, ((Object)0), 1);
			ModernizedCProgram.args.argv_array_clear();
			ps.clear_pathspec();
			return ret;
		} 
		key = ModernizedCProgram.xstrfmt("submodule.%s.url", module.getName());
		ret = !.repo_config_get_string(ModernizedCProgram.repo, key, value);
		ModernizedCProgram.free(value);
		ModernizedCProgram.free(key);
		return ret;
	}
	public repository open_submodule(Object path) {
		strbuf sb = new strbuf(, , );
		repository out = ModernizedCProgram.xmalloc();
		byte generatedBuf = sb.getBuf();
		if (sb.submodule_to_gitdir(path) || out.repo_init(generatedBuf, ((Object)0))) {
			sb.strbuf_release();
			ModernizedCProgram.free(out);
			return ((Object)0);
		} 
		out.setSubmodule_prefix(ModernizedCProgram.xstrdup(/* Mark it as a submodule */path));
		sb.strbuf_release();
		return out/*
		 * Helper function to display the submodule header line prior to the full
		 * summary output.
		 *
		 * If it can locate the submodule git directory it will create a repository
		 * handle for the submodule and lookup both the left and right commits and
		 * put them into the left and right pointers.
		 */;
	}
	public repository get_submodule_repo_for(Object sub) {
		repository ret = ModernizedCProgram.xmalloc();
		byte generatedBuf = gitdir.getBuf();
		if (ret.repo_submodule_init(r, sub/*
				 * No entry in .gitmodules? Technically not a submodule,
				 * but historically we supported repositories that happen to be
				 * in-place where a gitlink is. Keep supporting them.
				 */)) {
			strbuf gitdir = new strbuf(, , );
			gitdir.strbuf_repo_worktree_path(r, "%s/.git", sub.getPath());
			if (ret.repo_init(generatedBuf, ((Object)0))) {
				gitdir.strbuf_release();
				ModernizedCProgram.free(ret);
				return ((Object)0);
			} 
			gitdir.strbuf_release();
		} 
		return ret;
	}
	public int fetch_populated_submodules(Object options, Object prefix, int command_line_option, int default_option, int quiet, int max_parallel_jobs) {
		int i;
		submodule_parallel_fetch spf = new submodule_parallel_fetch(0, new submodule_parallel_fetch(ModernizedCProgram.empty_argv, 0, 0), ((Object)0), ((Object)0), 0, 0, 0, 0, new submodule_parallel_fetch(((Object)0), 0, 0, 1, ((Object)0)), ((Object)0), 0, 0);
		spf.setR(r);
		spf.setCommand_line_option(command_line_option);
		spf.setDefault_option(default_option);
		spf.setQuiet(quiet);
		spf.setPrefix(prefix);
		Byte generatedWorktree = this.getWorktree();
		if (!generatedWorktree) {
			;
		} 
		if (r.repo_read_index() < 0) {
			ModernizedCProgram.die("index file corrupt");
		} 
		argv_array generatedArgs = spf.getArgs();
		generatedArgs.argv_array_push("fetch");
		for (i = 0; i < options.getArgc(); i++) {
			generatedArgs.argv_array_push(options.getArgv()[i]);
		}
		generatedArgs.argv_array_push("--recurse-submodules-default"/* default value, "--submodule-prefix" and its value are added later */);
		string_list generatedChanged_submodule_names = spf.getChanged_submodule_names();
		ModernizedCProgram.calculate_changed_submodule_paths(r, generatedChanged_submodule_names);
		generatedChanged_submodule_names.string_list_sort();
		ModernizedCProgram.run_processes_parallel_tr2(max_parallel_jobs, get_next_submodule, fetch_start_failure, fetch_finish, spf, "submodule", "parallel/fetch");
		generatedArgs.argv_array_clear();
		int generatedResult = spf.getResult();
		return generatedResult;
	}
	public void diffcore_break(int break_score) {
		diff_queue_struct q = ModernizedCProgram.diff_queued_diff;
		diff_queue_struct outq = new diff_queue_struct();
		/* When the filepair has this much edit (insert and delete),
			 * it is first considered to be a rewrite and broken into a
			 * create and delete filepair.  This is to help breaking a
			 * file that had too much new stuff added, possibly from
			 * moving contents from another file, so that rename/copy can
			 * match it with the other file.
			 *
			 * int break_score; we reuse incoming parameter for this.
			 *//* After a pair is broken according to break_score and
			 * subjected to rename/copy, both of them may survive intact,
			 * due to lack of suitable rename/copy peer.  Or, the caller
			 * may be calling us without using rename/copy.  When that
			 * happens, we merge the broken pieces back into one
			 * modification together if the pair did not have more than
			 * this much delete.  For this computation, we do not take
			 * insert into account at all.  If you start from a 100-line
			 * file and delete 97 lines of it, it does not matter if you
			 * add 27 lines to it to make a new 30-line file or if you add
			 * 997 lines to it to make a 1000-line file.  Either way what
			 * you did was a rewrite of 97%.  On the other hand, if you
			 * delete 3 lines, keeping 97 lines intact, it does not matter
			 * if you add 3 lines to it to make a new 100-line file or if
			 * you add 903 lines to it to make a new 1000-line file.
			 * Either way you did a lot of additions and not a rewrite.
			 * This merge happens to catch the latter case.  A merge_score
			 * of 80% would be a good default value (a broken pair that
			 * has score lower than merge_score will be merged back
			 * together).
			 */
		int merge_score;
		int i;
		/* See comment on DEFAULT_BREAK_SCORE and
			 * DEFAULT_MERGE_SCORE in diffcore.h
			 */
		merge_score = (break_score >> 16) & -1024;
		break_score = (break_score & -1024);
		if (!break_score) {
			break_score = 30000;
		} 
		if (!merge_score) {
			merge_score = 36000;
		} 
		do {
			(outq).setQueue(((Object)0));
			(outq).setNr((outq).setAlloc(0));
		} while (0);
		int generatedNr = q.getNr();
		diff_filepair generatedQueue = q.getQueue();
		diff_filespec generatedOne = p.getOne();
		int generatedMode = (generatedOne).getMode();
		Byte generatedPath = generatedOne.getPath();
		diff_filespec generatedTwo = p.getTwo();
		for (i = 0; i < generatedNr; i++) {
			diff_filepair p = generatedQueue[i];
			int score;
			if (((generatedMode) != 0) && ((generatedMode) != 0) && ModernizedCProgram.object_type(generatedMode) == object_type.OBJ_BLOB && ModernizedCProgram.object_type(generatedMode) == object_type.OBJ_BLOB && !.strcmp(generatedPath, generatedPath)) {
				if (ModernizedCProgram.should_break(r, generatedOne, generatedTwo, break_score, score/* Split this into delete and create */)) {
					diff_filespec null_one = new diff_filespec();
					diff_filespec null_two = new diff_filespec();
					diff_filepair dp = new diff_filepair();
					if (score < merge_score) {
						score = 0;
					} 
					null_one = .alloc_filespec(generatedPath);
					dp = .diff_queue(outq, generatedOne, null_one);
					dp.setScore(score);
					dp.setBroken_pair(1);
					null_two = .alloc_filespec(generatedPath);
					dp = .diff_queue(outq, null_two, generatedTwo);
					dp.setScore(score);
					dp.setBroken_pair(1);
					.diff_free_filespec_blob(generatedOne);
					.diff_free_filespec_blob(generatedTwo);
					ModernizedCProgram.free(/* not diff_free_filepair(), we are
										  * reusing one and two here.
										  */p);
					continue;
				} 
			} 
			.diff_free_filespec_data(generatedOne);
			.diff_free_filespec_data(generatedTwo);
			.diff_q(outq, p);
		}
		ModernizedCProgram.free(generatedQueue);
		q = outq;
		return ;
	}
	public void prepare_packed_git_one(Byte objdir, int local) {
		prepare_pack_data data = new prepare_pack_data();
		string_list garbage = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		raw_object_store generatedObjects = this.getObjects();
		multi_pack_index generatedMulti_pack_index = generatedObjects.getMulti_pack_index();
		data.setM(generatedMulti_pack_index);
		multi_pack_index generatedM = data.getM();
		Object generatedObject_dir = generatedM.getObject_dir();
		multi_pack_index generatedNext = generatedM.getNext();
		while (generatedM && .strcmp(generatedObject_dir, /* look for the multi-pack-index for this object directory */objdir)) {
			data.setM(generatedNext);
		}
		data.setR(r);
		data.setGarbage(garbage);
		data.setLocal(local);
		ModernizedCProgram.for_each_file_in_pack_dir(objdir, prepare_pack, data);
		string_list generatedGarbage = data.getGarbage();
		generatedGarbage.report_pack_garbage();
		generatedGarbage.string_list_clear(0);
	}
	public long repo_approximate_object_count() {
		raw_object_store generatedObjects = this.getObjects();
		int generatedApproximate_object_count_valid = generatedObjects.getApproximate_object_count_valid();
		Object generatedNum_objects = m.getNum_objects();
		multi_pack_index generatedNext = m.getNext();
		multi_pack_index multi_pack_index = new multi_pack_index();
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		if (!generatedApproximate_object_count_valid) {
			long count;
			multi_pack_index m = new multi_pack_index();
			packed_git p = new packed_git();
			r.prepare_packed_git();
			ModernizedCProgram.count = 0;
			for (m = multi_pack_index.get_multi_pack_index(r); m; m = generatedNext) {
				ModernizedCProgram.count += generatedNum_objects;
			}
			for (p = generatedPacked_git; p; p = generatedNext) {
				if (p.open_pack_index()) {
					continue;
				} 
				ModernizedCProgram.count += generatedNum_objects;
			}
			generatedObjects.setApproximate_object_count(ModernizedCProgram.count);
		} 
		long generatedApproximate_object_count = generatedObjects.getApproximate_object_count();
		return generatedApproximate_object_count;
	}
	public void rearrange_packed_git() {
		raw_object_store generatedObjects = this.getObjects();
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		generatedObjects.setPacked_git(ModernizedCProgram.llist_mergesort(generatedPacked_git, get_next_packed_git, set_next_packed_git, sort_pack));
	}
	public void prepare_packed_git_mru() {
		packed_git p = new packed_git();
		raw_object_store generatedObjects = this.getObjects();
		list_head generatedPacked_git_mru = generatedObjects.getPacked_git_mru();
		(generatedPacked_git_mru).setNext((generatedPacked_git_mru).setPrev((generatedPacked_git_mru)));
		list_head generatedMru = p.getMru();
		packed_git generatedNext = p.getNext();
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		for (p = generatedPacked_git; p; p = generatedNext) {
			generatedMru.list_add_tail(generatedPacked_git_mru);
		}
	}
	public void prepare_packed_git() {
		object_directory odb = new object_directory();
		raw_object_store generatedObjects = this.getObjects();
		int generatedPacked_git_initialized = generatedObjects.getPacked_git_initialized();
		if (generatedPacked_git_initialized) {
			return ;
		} 
		r.prepare_alt_odb();
		object_directory generatedOdb = generatedObjects.getOdb();
		Byte generatedPath = odb.getPath();
		object_directory generatedNext = odb.getNext();
		for (odb = generatedOdb; odb; odb = generatedNext) {
			int local = (odb == generatedOdb);
			r.prepare_multi_pack_index_one(generatedPath, ModernizedCProgram.local);
			r.prepare_packed_git_one(generatedPath, ModernizedCProgram.local);
		}
		r.rearrange_packed_git();
		r.prepare_packed_git_mru();
		generatedObjects.setPacked_git_initialized(1);
	}
	/*
	 * Give a fast, rough count of the number of objects in the repository. This
	 * ignores loose objects completely. If you have a lot of them, then either
	 * you should repack because your performance will be awful, or they are
	 * all unreachable objects about to be pruned, in which case they're not really
	 * interesting as a measure of repo size in the first place.
	 */
	public void reprepare_packed_git() {
		object_directory odb = new object_directory();
		object_directory generatedNext = odb.getNext();
		raw_object_store generatedObjects = this.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		for (odb = generatedOdb; odb; odb = generatedNext) {
			odb.odb_clear_loose_cache();
		}
		generatedObjects.setApproximate_object_count_valid(0);
		generatedObjects.setPacked_git_initialized(0);
		r.prepare_packed_git();
	}
	public Object has_packed_and_bad(Object sha1) {
		packed_git p = new packed_git();
		int i;
		Object generatedNum_bad_objects = p.getNum_bad_objects();
		Byte generatedBad_object_sha1 = p.getBad_object_sha1();
		packed_git generatedNext = p.getNext();
		raw_object_store generatedObjects = this.getObjects();
		packed_git generatedPacked_git = generatedObjects.getPacked_git();
		for (p = generatedPacked_git; p; p = generatedNext) {
			for (i = 0; i < generatedNum_bad_objects; i++) {
				if (ModernizedCProgram.hasheq(sha1, generatedBad_object_sha1 + ModernizedCProgram.the_repository.getHash_algo().getRawsz() * i)) {
					return p;
				} 
			}
		}
		return ((Object)0);
	}
	public Object read_object(Object oid, object_type type, Long size) {
		object_info oi = new object_info(((Object)0));
		Object content;
		oi.setTypep(type);
		oi.setSizep(size);
		oi.setContentp(content);
		if (ModernizedCProgram.oid_object_info_extended(r, oid, oi, 0) < 0) {
			return ((Object)0);
		} 
		return content;
		object_info oi = new object_info(((Object)0));
		Object content;
		oi.setTypep(type);
		oi.setSizep(size);
		oi.setContentp(content);
		if (ModernizedCProgram.oid_object_info_extended(r, oid, oi, 0) < 0) {
			return ((Object)0);
		} 
		return content;
	}
	public int repo_read_index_preload(Object pathspec, int refresh_flags) {
		int retval = ModernizedCProgram.repo.repo_read_index();
		ModernizedCProgram.repo.getIndex().preload_index(pathspec, refresh_flags);
		return retval;
	}
	public int index_differs_from(Object def, Object flags, int ita_invisible_in_index) {
		rev_info rev = new rev_info();
		setup_revision_opt opt = new setup_revision_opt();
		ModernizedCProgram.repo_init_revisions(r, rev, ((Object)0));
		.memset(opt, 0, );
		opt.setDef(def);
		ModernizedCProgram.setup_revisions(0, ((Object)0), rev, opt);
		diff_options generatedDiffopt = rev.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		generatedFlags.setQuick(1);
		generatedFlags.setExit_with_status(1);
		if (flags) {
			generatedFlags.diff_flags_or(flags);
		} 
		generatedDiffopt.setIta_invisible_in_index(ita_invisible_in_index);
		rev.run_diff_index(1);
		object_array generatedPending = rev.getPending();
		generatedPending.object_array_clear();
		int generatedHas_changes = generatedFlags.getHas_changes();
		return (generatedHas_changes != 0);
	}
	public Object alloc_blob_node() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		blob b = generatedParsed_object_pool.alloc_node();
		object generatedObject = b.getObject();
		generatedObject.setType(object_type.OBJ_BLOB);
		return b;
	}
	public Object alloc_tree_node() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		tree t = generatedParsed_object_pool.alloc_node();
		Object generatedObject = t.getObject();
		generatedObject.setType(object_type.OBJ_TREE);
		return t;
	}
	public Object alloc_tag_node() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		tag t = generatedParsed_object_pool.alloc_node();
		Object generatedObject = t.getObject();
		generatedObject.setType(object_type.OBJ_TAG);
		return t;
	}
	public Object alloc_object_node() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		object obj = generatedParsed_object_pool.alloc_node();
		obj.setType(object_type.OBJ_NONE);
		return obj;
	}
	public int alloc_commit_index() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		return generatedParsed_object_pool++;
	}
	public Object alloc_commit_node() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		commit c = generatedParsed_object_pool.alloc_node();
		ModernizedCProgram.init_commit_node(r, c);
		return c;
	}
	public void alloc_report() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		ModernizedCProgram.report("blob", generatedParsed_object_pool.getCount(), generatedParsed_object_pool.getCount() *  >> 10);
		ModernizedCProgram.report("tree", generatedParsed_object_pool.getCount(), generatedParsed_object_pool.getCount() *  >> 10);
		ModernizedCProgram.report("commit", generatedParsed_object_pool.getCount(), generatedParsed_object_pool.getCount() *  >> 10);
		ModernizedCProgram.report("tag", generatedParsed_object_pool.getCount(), generatedParsed_object_pool.getCount() *  >> 10);
		ModernizedCProgram.report("object", generatedParsed_object_pool.getCount(), generatedParsed_object_pool.getCount() *  >> 10);
	}
	public int has_unstaged_changes(int ignore_submodules) {
		rev_info rev_info = new rev_info();
		int result;
		ModernizedCProgram.repo_init_revisions(r, rev_info, ((Object)0));
		diff_options generatedDiffopt = rev_info.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		if (ignore_submodules) {
			generatedFlags.setIgnore_submodules(1);
			generatedFlags.setOverride_submodule_config(1);
		} 
		generatedFlags.setQuick(1);
		.diff_setup_done(generatedDiffopt);
		result = rev_info.run_diff_files(0);
		return .diff_result_code(generatedDiffopt, result/**
		 * Returns 1 if there are uncommitted changes, 0 otherwise.
		 */);
	}
	public int has_uncommitted_changes(int ignore_submodules) {
		rev_info rev_info = new rev_info();
		int result;
		index_state generatedIndex = this.getIndex();
		if (generatedIndex.is_index_unborn()) {
			return 0;
		} 
		ModernizedCProgram.repo_init_revisions(r, rev_info, ((Object)0));
		diff_options generatedDiffopt = rev_info.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		if (ignore_submodules) {
			generatedFlags.setIgnore_submodules(1);
		} 
		generatedFlags.setQuick(1);
		rev_info.add_head_to_pending();
		object_array generatedPending = rev_info.getPending();
		int generatedNr = generatedPending.getNr();
		tree tree = new tree();
		Object generatedObject = tree.getObject();
		if (!generatedNr) {
			tree tree = tree.lookup_tree(r, ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
			ModernizedCProgram.add_pending_object(rev_info, generatedObject, "");
		} 
		.diff_setup_done(generatedDiffopt);
		result = rev_info.run_diff_index(1);
		return .diff_result_code(generatedDiffopt, result/**
		 * If the work tree has unstaged or uncommitted changes, dies with the
		 * appropriate message.
		 */);
	}
	public int require_clean_work_tree(Object action, Object hint, int ignore_submodules, int gently) {
		lock_file lock_file = new lock_file(((Object)0));
		int err = 0;
		int fd;
		fd = ModernizedCProgram.repo_hold_locked_index(r, lock_file, 0);
		index_state generatedIndex = this.getIndex();
		generatedIndex.refresh_index(-1024, ((Object)0), ((Object)0), ((Object)0));
		if (0 <= fd) {
			ModernizedCProgram.repo_update_index_if_able(r, lock_file);
		} 
		lock_file.rollback_lock_file();
		if (r.has_unstaged_changes(ignore_submodules)) {
			();
			err = 1;
		} 
		if (r.has_uncommitted_changes(ignore_submodules)) {
			if (err) {
				();
			} else {
					();
			} 
			err = 1;
		} 
		if (err) {
			if (hint) {
				();
			} 
			if (!gently) {
				.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2487, (true)));
			} 
		} 
		return err;
	}
	public Byte get_graft_file() {
		Byte generatedGraft_file = this.getGraft_file();
		if (!generatedGraft_file) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\environment.c", 323, "git environment hasn't been setup");
		} 
		return generatedGraft_file;
	}
	public int notes_cache_match_validity(Object ref, Object validity) {
		object_id oid = new object_id();
		commit commit = new commit();
		pretty_print_context pretty_ctx = new pretty_print_context();
		strbuf msg = new strbuf(, , );
		int ret;
		if (oid.read_ref(ref) < 0) {
			return 0;
		} 
		commit = .lookup_commit_reference_gently(r, oid, 1);
		if (!commit) {
			return 0;
		} 
		.memset(pretty_ctx, 0, );
		ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, commit, "%s", msg, pretty_ctx);
		msg.strbuf_trim();
		byte generatedBuf = msg.getBuf();
		ret = !.strcmp(generatedBuf, validity);
		msg.strbuf_release();
		return ret;
	}
	public int promisor_remote_get_direct(Object oids, int oid_nr) {
		promisor_remote r = new promisor_remote();
		object_id remaining_oids = (object_id)oids;
		int remaining_nr = oid_nr;
		int to_free = 0;
		int res = -1;
		ModernizedCProgram.promisor_remote_init();
		Object generatedName = r.getName();
		promisor_remote generatedNext = r.getNext();
		for (r = ModernizedCProgram.promisors; r; r = generatedNext) {
			if (ModernizedCProgram.fetch_objects(generatedName, remaining_oids, remaining_nr) < 0) {
				if (remaining_nr == 1) {
					continue;
				} 
				remaining_nr = ModernizedCProgram.remove_fetched_oids(ModernizedCProgram.repo, remaining_oids, remaining_nr, to_free);
				if (remaining_nr) {
					to_free = 1;
					continue;
				} 
			} 
			res = 0;
			break;
		}
		if (to_free) {
			ModernizedCProgram.free(remaining_oids);
		} 
		return res;
	}
	public int repo_file_exists(Object path) {
		if (ModernizedCProgram.repo != ModernizedCProgram.the_repository) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\dir.c", 2365, "do not know how to check file existence in arbitrary repo");
		} 
		return ModernizedCProgram.file_exists(path);
	}
	public int is_index_unchanged() {
		object_id head_oid = new object_id();
		object_id cache_tree_oid = new object_id();
		commit head_commit = new commit();
		index_state generatedIndex = this.getIndex();
		index_state istate = generatedIndex;
		if (!head_oid.resolve_ref_unsafe("HEAD", -1024, ((Object)0))) {
			return ();
		} 
		head_commit = .lookup_commit(r, head_oid/*
			 * If head_commit is NULL, check_commit, called from
			 * lookup_commit, would have indicated that head_commit is not
			 * a commit object already.  parse_commit() will return failure
			 * without further complaints in such a case.  Otherwise, if
			 * the commit is invalid, parse_commit() will complain.  So
			 * there is nothing for us to say here.  Just return failure.
			 */);
		if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, head_commit)) {
			return -1;
		} 
		object_id object_id = new object_id();
		if (!(cache_tree_oid = object_id.get_cache_tree_oid(istate))) {
			return -1;
		} 
		return ModernizedCProgram.oideq(cache_tree_oid, .get_commit_tree_oid(head_commit));
	}
	public void commit_post_rewrite(Object old_head, Object new_head) {
		notes_rewrite_cfg cfg = new notes_rewrite_cfg();
		notes_rewrite_cfg notes_rewrite_cfg = new notes_rewrite_cfg();
		cfg = notes_rewrite_cfg.init_copy_notes_for_rewrite("amend");
		if (cfg) {
			cfg.copy_note_for_rewrite(old_head.getObject().getOid(), /* we are amending, so old_head is not NULL */new_head);
			ModernizedCProgram.finish_copy_notes_for_rewrite(r, cfg, "Notes added by 'git commit --amend'");
		} 
		ModernizedCProgram.run_rewrite_hook(old_head.getObject().getOid(), new_head);
	}
	public void print_commit_summary(Object prefix, Object oid, int flags) {
		rev_info rev = new rev_info();
		commit commit = new commit();
		strbuf format = new strbuf(, , );
		byte head;
		pretty_print_context pctx = new pretty_print_context(0);
		strbuf author_ident = new strbuf(, , );
		strbuf committer_ident = new strbuf(, , );
		commit = .lookup_commit(r, oid);
		if (!commit) {
			ModernizedCProgram.die(ModernizedCProgram._("couldn't look up newly created commit"));
		} 
		if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit)) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse newly created commit"));
		} 
		format.strbuf_addstr("format:%h] %s");
		ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, commit, "%an <%ae>", author_ident, pctx);
		ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, commit, "%cn <%ce>", committer_ident, pctx);
		if (ModernizedCProgram.strbuf_cmp(author_ident, committer_ident)) {
			format.strbuf_addstr("\n Author: ");
			format.strbuf_addbuf_percentquote(author_ident);
		} 
		if (flags & (1 << 1)) {
			strbuf date = new strbuf(, , );
			ModernizedCProgram.repo_format_commit_message(ModernizedCProgram.the_repository, commit, "%ad", date, pctx);
			format.strbuf_addstr("\n Date: ");
			format.strbuf_addbuf_percentquote(date);
			date.strbuf_release();
		} 
		if (!ModernizedCProgram.committer_ident_sufficiently_given()) {
			format.strbuf_addstr("\n Committer: ");
			format.strbuf_addbuf_percentquote(committer_ident);
			if (ModernizedCProgram.advice_implicit_identity) {
				format.strbuf_addch((byte)'\n');
				format.strbuf_addstr(ModernizedCProgram.implicit_ident_advice());
			} 
		} 
		author_ident.strbuf_release();
		committer_ident.strbuf_release();
		ModernizedCProgram.repo_init_revisions(r, rev, prefix);
		ModernizedCProgram.setup_revisions(0, ((Object)0), rev, ((Object)0));
		rev.setDiff(1);
		diff_options generatedDiffopt = rev.getDiffopt();
		generatedDiffopt.setOutput_format(-1024 | -1024);
		rev.setVerbose_header(1);
		rev.setShow_root_diff(1);
		byte generatedBuf = format.getBuf();
		rev.get_commit_format(generatedBuf);
		rev.setAlways_show_header(0);
		generatedDiffopt.setDetect_rename(1);
		generatedDiffopt.setBreak_opt(0);
		.diff_setup_done(generatedDiffopt);
		head = ((Object)0).resolve_ref_unsafe("HEAD", 0, ((Object)0));
		if (!head) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("unable to resolve HEAD after creating commit"));
		} 
		if (!.strcmp(head, "HEAD")) {
			head = ModernizedCProgram._("detached HEAD");
		} else {
				ModernizedCProgram.skip_prefix(head, "refs/heads/", head);
		} 
		.printf("[%s%s ", head, (flags & (1 << 0)) ? ModernizedCProgram._(" (root-commit)") : "");
		if (!ModernizedCProgram.log_tree_commit(rev, commit)) {
			rev.setAlways_show_header(1);
			rev.setUse_terminator(1);
			ModernizedCProgram.log_tree_commit(rev, commit);
		} 
		format.strbuf_release();
	}
	public int sequencer_get_last_command(replay_action action) {
		byte todo_file;
		byte bol;
		strbuf buf = new strbuf(, , );
		int ret = 0;
		todo_file = ModernizedCProgram.git_path_todo_file();
		if (buf.strbuf_read_file(todo_file, 0) < 0) {
			if ((._errno()) == 2 || (._errno()) == 20) {
				return -1;
			} else {
					return ();
			} 
		} 
		byte generatedBuf = buf.getBuf();
		bol = generatedBuf + .strspn(generatedBuf, " \t\r\n");
		if (ModernizedCProgram.is_command(todo_command.TODO_PICK, bol) && (bol == (byte)' ' || bol == (byte)'\t')) {
			action = replay_action.REPLAY_PICK;
		}  else if (ModernizedCProgram.is_command(todo_command.TODO_REVERT, bol) && (bol == (byte)' ' || bol == (byte)'\t')) {
			action = replay_action.REPLAY_REVERT;
		} else {
				ret = -1;
		} 
		buf.strbuf_release();
		return ret;
	}
	public void sequencer_post_commit_cleanup(int verbose) {
		replay_opts opts = new replay_opts(, );
		int need_cleanup = 0;
		if (ModernizedCProgram.file_exists(r.git_path_cherry_pick_head())) {
			if (!.unlink(r.git_path_cherry_pick_head()) && verbose) {
				ModernizedCProgram.warning(ModernizedCProgram._("cancelling a cherry picking in progress"));
			} 
			opts.setAction(replay_action.REPLAY_PICK);
			need_cleanup = 1;
		} 
		if (ModernizedCProgram.file_exists(r.git_path_revert_head())) {
			if (!.unlink(r.git_path_revert_head()) && verbose) {
				ModernizedCProgram.warning(ModernizedCProgram._("cancelling a revert in progress"));
			} 
			opts.setAction(replay_action.REPLAY_REVERT);
			need_cleanup = 1;
		} 
		if (!need_cleanup) {
			return ;
		} 
		if (!ModernizedCProgram.have_finished_the_last_pick()) {
			return ;
		} 
		opts.sequencer_remove_state();
	}
	public int create_seq_dir() {
		replay_action action;
		byte in_progress_error = ((Object)0);
		byte in_progress_advice = ((Object)0);
		int advise_skip = ModernizedCProgram.file_exists(r.git_path_revert_head()) || ModernizedCProgram.file_exists(r.git_path_cherry_pick_head());
		if (!r.sequencer_get_last_command(replay_action.action)) {
			switch (replay_action.action) {
			case replay_action.REPLAY_PICK:
					in_progress_error = ModernizedCProgram._("cherry-pick is already in progress");
					in_progress_advice = ModernizedCProgram._("try \"git cherry-pick (--continue | %s--abort | --quit)\"");
					break;
			case replay_action.REPLAY_REVERT:
					in_progress_error = ModernizedCProgram._("revert is already in progress");
					in_progress_advice = ModernizedCProgram._("try \"git revert (--continue | %s--abort | --quit)\"");
					break;
			default:
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\sequencer.c", 2616, "unexpected action in create_seq_dir");
			}
		} 
		if (in_progress_error) {
			();
			if (ModernizedCProgram.advice_sequencer_in_use) {
				ModernizedCProgram.advise(in_progress_advice, advise_skip ? "--skip | " : "");
			} 
			return -1;
		} 
		if (.mkdir(ModernizedCProgram.git_path_seq_dir(), 777) < 0) {
			return ();
		} 
		return 0;
	}
	public int rollback_single_pick() {
		object_id head_oid = new object_id();
		if (!ModernizedCProgram.file_exists(r.git_path_cherry_pick_head()) && !ModernizedCProgram.file_exists(r.git_path_revert_head())) {
			return ();
		} 
		if (head_oid.read_ref_full("HEAD", 0, ((Object)0))) {
			return ();
		} 
		if (ModernizedCProgram.is_null_oid(head_oid)) {
			return ();
		} 
		return ModernizedCProgram.reset_merge(head_oid);
	}
	public int do_exec(Object command_line) {
		argv_array child_env = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		byte[] child_argv = new byte[]{((Object)0), ((Object)0)};
		int dirty;
		int status;
		.fprintf((_iob[2]), "Executing: %s\n", command_line);
		child_argv[0] = command_line;
		child_env.argv_array_pushf("GIT_DIR=%s", ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_dir()));
		child_env.argv_array_pushf("GIT_WORK_TREE=%s", ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_work_tree()));
		Object generatedArgv = child_env.getArgv();
		status = ModernizedCProgram.run_command_v_opt_cd_env(child_argv, 16, ((Object)0), generatedArgv);
		index_state generatedIndex = this.getIndex();
		if (generatedIndex.discard_index() < 0 || r.repo_read_index() < /* force re-reading of the cache */0) {
			return ();
		} 
		dirty = r.require_clean_work_tree("rebase", ((Object)0), 1, 1);
		if (status) {
			ModernizedCProgram.warning(ModernizedCProgram._("execution failed: %s\n%sYou can fix the problem, and then run\n\n  git rebase --continue\n\n"), command_line, dirty ? ("and made changes to the index and/or the working tree\n") : "");
			if (status == 127) {
				status = /* command not found */1;
			} 
		}  else if (dirty) {
			ModernizedCProgram.warning(ModernizedCProgram._("execution succeeded: %s\nbut left changes to the index and/or the working tree\nCommit or stash your changes, and then run\n\n  git rebase --continue\n\n"), command_line);
			status = 1;
		} 
		child_env.argv_array_clear();
		return status;
	}
	public int do_label(Object name, int len) {
		ref_store ref_store = new ref_store();
		ref_store refs = ref_store.get_main_ref_store(r);
		ref_transaction transaction = new ref_transaction();
		strbuf ref_name = new strbuf(, , );
		strbuf err = new strbuf(, , );
		strbuf msg = new strbuf(, , );
		int ret = 0;
		object_id head_oid = new object_id();
		if (len == 1 && name == (byte)'#') {
			return ();
		} 
		ref_name.strbuf_addf("refs/rewritten/%.*s", len, name);
		msg.strbuf_addf("rebase -i (label) '%.*s'", len, name);
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_store_transaction_begin(refs, err);
		byte generatedBuf = ref_name.getBuf();
		if (!transaction) {
			();
			ret = -1;
		}  else if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head_oid)) {
			();
			ret = -1;
		}  else if (ModernizedCProgram.ref_transaction_update(transaction, generatedBuf, head_oid, ((Object)0), 0, generatedBuf, err) < 0 || ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			();
			ret = -1;
		} 
		transaction.ref_transaction_free();
		err.strbuf_release();
		msg.strbuf_release();
		if (!ret) {
			ret = ModernizedCProgram.safe_append(ModernizedCProgram.rebase_path_refs_to_delete(), "%s\n", generatedBuf);
		} 
		ref_name.strbuf_release();
		return ret;
	}
	public int stopped_at_head() {
		object_id head = new object_id();
		commit commit = new commit();
		commit_message message = new commit_message();
		Byte generatedLabel = message.getLabel();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head) || !(commit = .lookup_commit(r, head)) || ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit) || ModernizedCProgram.get_message(commit, message)) {
			.fprintf((_iob[2]), ModernizedCProgram._("Stopped at HEAD\n"));
		} else {
				.fprintf((_iob[2]), ModernizedCProgram._("Stopped at %s\n"), generatedLabel);
				ModernizedCProgram.free_message(commit, message);
		} 
		return 0;
	}
	public int continue_single_pick() {
		byte[] argv = new byte[]{"commit", ((Object)0)};
		if (!ModernizedCProgram.file_exists(r.git_path_cherry_pick_head()) && !ModernizedCProgram.file_exists(r.git_path_revert_head())) {
			return ();
		} 
		return ModernizedCProgram.run_command_v_opt(argv, 2);
	}
	public int check_todo_list_from_file() {
		todo_list old_todo = new todo_list(new todo_list(, , ));
		todo_list new_todo = new todo_list(new todo_list(, , ));
		int res = 0;
		strbuf generatedBuf = new_todo.getBuf();
		if (generatedBuf.strbuf_read_file_or_whine(ModernizedCProgram.rebase_path_todo()) < 0) {
			res = -1;
			;
		} 
		if (generatedBuf.strbuf_read_file_or_whine(ModernizedCProgram.rebase_path_todo_backup()) < 0) {
			res = -1;
			;
		} 
		res = ModernizedCProgram.todo_list_parse_insn_buffer(r, generatedBuf, old_todo);
		if (!res) {
			res = ModernizedCProgram.todo_list_parse_insn_buffer(r, generatedBuf, new_todo);
		} 
		if (!res) {
			res = old_todo.todo_list_check(new_todo);
		} 
		if (res) {
			.fprintf((_iob[2]), ModernizedCProgram._(ModernizedCProgram.edit_todo_list_advice));
		} 
		new_todo.todo_list_release();
		return res;
	}
	public void die_verify_filename(Object prefix, Object arg, int diagnose_misspelt_rev) {
		if (!diagnose_misspelt_rev) {
			ModernizedCProgram.die(ModernizedCProgram._("%s: no such path in the working tree.\nUse 'git <command> -- <path>...' to specify paths that do not exist locally."), arg/*
				 * Saying "'(icase)foo' does not exist in the index" when the
				 * user gave us ":(icase)foo" is just stupid.  A magic pathspec
				 * begins with a colon and is followed by a non-alnum; do not
				 * let maybe_die_on_misspelt_object_name() even trigger.
				 */);
		} 
		if (!(arg[0] == (byte)':' && !((ModernizedCProgram.sane_ctype[(byte)(arg[1])] & (-1024 | -1024)) != 0))) {
			r.maybe_die_on_misspelt_object_name(arg, prefix);
		} 
		ModernizedCProgram.die(ModernizedCProgram._(/* ... or fall back the most general message. */"ambiguous argument '%s': unknown revision or path not in the working tree.\nUse '--' to separate paths from revisions, like this:\n'git <command> [<revision>...] -- [<file>...]'"), arg/*
		 * Check for arguments that don't resolve as actual files,
		 * but which look sufficiently like pathspecs that we'll consider
		 * them such for the purposes of rev/pathspec DWIM parsing.
		 */);
	}
	public int write_archive(int argc, Object argv, Object prefix, Object name_hint, int remote) {
		archiver ar = ((Object)0);
		archiver_args args = new archiver_args();
		.git_config_get_bool("uploadarchive.allowunreachable", ModernizedCProgram.remote_allow_unreachable);
		.git_config(ModernizedCProgram.git_default_config, ((Object)0));
		args.setRepo(ModernizedCProgram.repo);
		argc = args.parse_archive_args(argc, argv, ar, name_hint, remote);
		if (!ModernizedCProgram.startup_info.getHave_repository()) {
			ModernizedCProgram.setup_git_directory();
		} 
		args.parse_treeish_arg(argv, prefix, remote);
		args.parse_pathspec_arg(argv + 1);
		return .UNRECOGNIZEDFUNCTIONNAME(ar, args);
	}
	public void submodule_cache_check_init() {
		if (ModernizedCProgram.repo.getSubmodule_cache() && ModernizedCProgram.repo.getSubmodule_cache().getInitialized()) {
			return ;
		} 
		submodule_cache submodule_cache = new submodule_cache();
		if (!ModernizedCProgram.repo.getSubmodule_cache()) {
			ModernizedCProgram.repo.setSubmodule_cache(submodule_cache.submodule_cache_alloc());
		} 
		ModernizedCProgram.repo.getSubmodule_cache().submodule_cache_init();
	}
	public void config_from_gitmodules(Object fn, Object data) {
	}
	public void repo_read_gitmodules() {
		ModernizedCProgram.repo.submodule_cache_check_init();
		if (ModernizedCProgram.repo.repo_read_index() < 0) {
			return ;
		} 
		if (!ModernizedCProgram.is_gitmodules_unmerged(ModernizedCProgram.repo.getIndex())) {
			ModernizedCProgram.repo.config_from_gitmodules(gitmodules_cb, ModernizedCProgram.repo);
		} 
		ModernizedCProgram.repo.getSubmodule_cache().setGitmodules_read(1);
	}
	public void gitmodules_read_check() {
		ModernizedCProgram.repo.submodule_cache_check_init();
		if (!ModernizedCProgram.repo.getSubmodule_cache().getGitmodules_read()) {
			ModernizedCProgram.repo.repo_read_gitmodules();
		} 
	}
	public Object submodule_from_name(Object treeish_name, Object name) {
		r.gitmodules_read_check();
		submodule_cache generatedSubmodule_cache = this.getSubmodule_cache();
		return generatedSubmodule_cache.config_from(treeish_name, name, lookup_type.lookup_name);
	}
	public Object submodule_from_path(Object treeish_name, Object path) {
		r.gitmodules_read_check();
		submodule_cache generatedSubmodule_cache = this.getSubmodule_cache();
		return generatedSubmodule_cache.config_from(treeish_name, path, lookup_type.lookup_path);
	}
	public void submodule_free() {
		submodule_cache generatedSubmodule_cache = this.getSubmodule_cache();
		if (generatedSubmodule_cache) {
			generatedSubmodule_cache.submodule_cache_clear();
		} 
	}
	public int print_config_from_gitmodules(Object key) {
		int ret;
		byte store_key;
		ret = .git_config_parse_key(key, store_key, ((Object)0));
		if (ret < 0) {
			return 1;
		} 
		ModernizedCProgram.repo.config_from_gitmodules(config_print_callback, store_key);
		ModernizedCProgram.free(store_key);
		return 0;
	}
	public void set_alternate_shallow_file(Object path, int override) {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		if (generatedParsed_object_pool != -1) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\shallow.c", 21, "is_repository_shallow must not be called before set_alternate_shallow_file");
		} 
		if (generatedParsed_object_pool && !override) {
			return ;
		} 
		ModernizedCProgram.free(generatedParsed_object_pool);
		generatedParsed_objects.setParsed_object_pool(ModernizedCProgram.xstrdup_or_null(path));
	}
	public int register_shallow(Object oid) {
		commit_graft graft = ModernizedCProgram.xmalloc();
		commit commit = .lookup_commit(ModernizedCProgram.the_repository, oid);
		object_id generatedOid = graft.getOid();
		generatedOid.oidcpy(oid);
		graft.setNr_parent(-1);
		object generatedObject = commit.getObject();
		int generatedParsed = generatedObject.getParsed();
		if (commit && generatedParsed) {
			commit.setParents(((Object)0));
		} 
		return .register_commit_graft(r, graft, 0);
	}
	public int is_repository_shallow() {
		FILE fp = new FILE();
		byte[] buf = new byte[1024];
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		byte path = generatedParsed_object_pool;
		if (generatedParsed_object_pool >= 0) {
			return generatedParsed_object_pool;
		} 
		if (!path) {
			path = r/*
				 * fetch-pack sets '--shallow-file ""' as an indicator that no
				 * shallow file should be used. We could just open it and it
				 * will likely fail. But let's do an explicit check instead.
				 */.git_path_shallow();
		} 
		if (!path || (fp = .fopen(path, "r")) == ((Object)0)) {
			generatedParsed_object_pool.stat_validity_clear();
			generatedParsed_objects.setParsed_object_pool(0);
			return generatedParsed_object_pool;
		} 
		Object generated_file = (fp).get_file();
		generatedParsed_object_pool.stat_validity_update((generated_file));
		generatedParsed_objects.setParsed_object_pool(1);
		while (.fgets(buf, , fp)) {
			object_id oid = new object_id();
			if (oid.get_oid_hex(buf)) {
				ModernizedCProgram.die("bad shallow line: %s", buf);
			} 
			r.register_shallow(oid);
		}
		.fclose(fp);
		return generatedParsed_object_pool;
	}
	/*
		 * NEEDSWORK: This function updates
		 * r->parsed_objects->{is_shallow,shallow_stat} as a side effect but
		 * there is no corresponding function to clear them when the shallow
		 * file is updated.
		 */
	public void check_shallow_file_for_update() {
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		Object generatedParsed_object_pool = generatedParsed_objects.getParsed_object_pool();
		if (generatedParsed_object_pool == -1) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\shallow.c", 248, "shallow must be initialized by now");
		} 
		if (!generatedParsed_object_pool.stat_validity_check(r.git_path_shallow())) {
			ModernizedCProgram.die("shallow file has changed since we read it");
		} 
	}
	public void deduplicate_islands() {
		remote_island island = new remote_island();
		remote_island core = ((Object)0);
		remote_island list = new remote_island();
		int island_count;
		int dst;
		int src;
		int ref;
		int i = 0;
		island_count = ((ModernizedCProgram.remote_islands).getSize());
		(list) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (island_count)));
		{ 
			khint_t __i = new khint_t();
			for (__i = (khint_t)(false); __i != ((ModernizedCProgram.remote_islands).getN_buckets()); ++__i) {
				if (!(!(((ModernizedCProgram.remote_islands).getFlags()[(__i) >> 4] >> (((__i) & -1024) << 1)) & 3))) {
					continue;
				} 
				(island) = ((ModernizedCProgram.remote_islands).getVals()[__i]);
				{ 
					list[i++] = island;
				}
				;
			}
		}
		;
		for (ref = 0; ref + 1 < island_count; ref++) {
			for (; src < island_count; src++) {
				if (list[ref].getHash() == list[src].getHash()) {
					continue;
				} 
				if (src != dst) {
					list[dst] = list[src];
				} 
				dst++;
			}
			island_count = dst;
		}
		ModernizedCProgram.island_bitmap_size = (island_count / 32) + 1;
		remote_island remote_island = new remote_island();
		core = remote_island.get_core_island();
		Object generatedHash = core.getHash();
		for (i = 0; i < island_count; ++i) {
			ModernizedCProgram.mark_remote_island_1(r, list[i], core && list[i].getHash() == generatedHash);
		}
		ModernizedCProgram.free(list);
	}
	public void load_delta_islands(int progress) {
		ModernizedCProgram.island_marks = ModernizedCProgram.kh_init_oid_map();
		ModernizedCProgram.remote_islands = ModernizedCProgram.kh_init_str();
		.git_config(island_config_callback, ((Object)0));
		ModernizedCProgram.for_each_ref(find_island_for_ref, ((Object)0));
		r.deduplicate_islands();
		if (progress) {
			.fprintf((_iob[2]), ModernizedCProgram._("Marked %d islands, done.\n"), ModernizedCProgram.island_counter);
		} 
	}
	public Object lookup_object_by_type(Object oid, object_type type) {
		tree tree = new tree();
		blob blob = new blob();
		switch (object_type.type) {
		case object_type.OBJ_TREE:
				return tree.lookup_tree(r, oid);
		case object_type.OBJ_BLOB:
				return blob.lookup_blob(r, oid);
		case object_type.OBJ_COMMIT:
				return .lookup_commit(r, oid);
		case object_type.OBJ_TAG:
				return .lookup_tag(r, oid);
		default:
				ModernizedCProgram.die("BUG: unknown object type %d", object_type.type);
		}
	}
	public int disambiguate_commit_only(Object oid, Object cb_data_unused) {
		int kind = r.oid_object_info(oid, ((Object)0));
		return kind == object_type.OBJ_COMMIT;
	}
	public int disambiguate_committish_only(Object oid, Object cb_data_unused) {
		object obj = new object();
		int kind;
		kind = r.oid_object_info(oid, ((Object)0));
		if (kind == object_type.OBJ_COMMIT) {
			return 1;
		} 
		if (kind != object_type.OBJ_TAG) {
			return 0;
		} 
		object object = new object();
		obj = .deref_tag(r, object.parse_object(r, oid), ((Object)0), /* We need to do this the hard way... */0);
		int generatedType = obj.getType();
		if (obj && generatedType == object_type.OBJ_COMMIT) {
			return 1;
		} 
		return 0;
	}
	public int disambiguate_tree_only(Object oid, Object cb_data_unused) {
		int kind = r.oid_object_info(oid, ((Object)0));
		return kind == object_type.OBJ_TREE;
	}
	public int disambiguate_treeish_only(Object oid, Object cb_data_unused) {
		object obj = new object();
		int kind;
		kind = r.oid_object_info(oid, ((Object)0));
		if (kind == object_type.OBJ_TREE || kind == object_type.OBJ_COMMIT) {
			return 1;
		} 
		if (kind != object_type.OBJ_TAG) {
			return 0;
		} 
		object object = new object();
		obj = .deref_tag(r, object.parse_object(r, oid), ((Object)0), /* We need to do this the hard way... */0);
		int generatedType = obj.getType();
		if (obj && (generatedType == object_type.OBJ_TREE || generatedType == object_type.OBJ_COMMIT)) {
			return 1;
		} 
		return 0;
	}
	public int disambiguate_blob_only(Object oid, Object cb_data_unused) {
		int kind = r.oid_object_info(oid, ((Object)0));
		return kind == object_type.OBJ_BLOB;
	}
	public int repo_collect_ambiguous(Object oid, Object data) {
		return ModernizedCProgram.collect_ambiguous(oid, data);
	}
	public int repo_for_each_abbrev(Object prefix, Object fn, Object cb_data) {
		oid_array collect = new oid_array(((Object)0), 0, 0, 0);
		disambiguate_state ds = new disambiguate_state();
		int ret;
		if (ModernizedCProgram.init_object_disambiguation(r, prefix, .strlen(prefix), ds) < 0) {
			return -1;
		} 
		ds.setAlways_call_fn(1);
		ds.setFn(repo_collect_ambiguous);
		ds.setCb_data(collect);
		ds.find_short_object_filename();
		ds.find_short_packed_object();
		ret = collect.oid_array_for_each_unique(fn, cb_data);
		collect.oid_array_clear();
		return ret/*
		 * Return the slot of the most-significant bit set in "val". There are various
		 * ways to do this quickly with fls() or __builtin_clzl(), but speed is
		 * probably not a big deal here.
		 */;
	}
	public int repo_extend_abbrev_len(Object oid, Object cb_data) {
		return ModernizedCProgram.extend_abbrev_len(oid, cb_data);
	}
	public int repo_find_unique_abbrev_r(Byte hex, Object oid, int len) {
		disambiguate_state ds = new disambiguate_state();
		min_abbrev_data mad = new min_abbrev_data();
		object_id oid_ret = new object_id();
		Object generatedHash_algo = this.getHash_algo();
		int hexsz = generatedHash_algo.getHexsz();
		if (len < 0) {
			long count = r/*
					 * Add one because the MSB only tells us the highest bit set,
					 * not including the value of all the _other_ bits (so "15"
					 * is only one off of 2^4, but the MSB is the 3rd bit.
					 */.repo_approximate_object_count();
			len = ModernizedCProgram.msb(ModernizedCProgram.count) + 1/*
					 * We now know we have on the order of 2^len objects, which
					 * expects a collision at 2^(len/2). But we also care about hex
					 * chars, not bits, and there are 4 bits per hex. So all
					 * together we need to divide by 2 and round up.
					 */;
			len = (((len) + (true) - 1) / (true/*
					 * For very small repos, we stick with our regular fallback.
					 */));
			if (len < 7) {
				len = 7;
			} 
		} 
		ModernizedCProgram.oid_to_hex_r(hex, oid);
		if (len == hexsz || !len) {
			return hexsz;
		} 
		mad.setRepo(r);
		mad.setInit_len(len);
		mad.setCur_len(len);
		mad.setHex(hex);
		mad.setOid(oid);
		mad.find_abbrev_len_packed();
		int generatedCur_len = mad.getCur_len();
		if (ModernizedCProgram.init_object_disambiguation(r, hex, generatedCur_len, ds) < 0) {
			return -1;
		} 
		ds.setFn(repo_extend_abbrev_len);
		ds.setAlways_call_fn(1);
		ds.setCb_data((Object)mad);
		ds.find_short_object_filename();
		(Object)ModernizedCProgram.finish_object_disambiguation(ds, oid_ret);
		hex[generatedCur_len] = 0;
		return generatedCur_len;
	}
	public Object repo_find_unique_abbrev(Object oid, int len) {
		int bufno;
		byte[][] hexbuffer = new byte[4][(2 * 32) + 1];
		byte hex = hexbuffer[bufno];
		bufno = (bufno + 1) % ( /  + ( - 1));
		r.repo_find_unique_abbrev_r(hex, oid, len);
		return hex;
	}
	/* Must be called only when object_name:filename doesn't exist. */
	public void diagnose_invalid_oid_path(Object prefix, Object filename, Object tree_oid, Object object_name, int object_name_len) {
		object_id oid = new object_id();
		int mode;
		if (!prefix) {
			prefix = "";
		} 
		if (ModernizedCProgram.file_exists(filename)) {
			ModernizedCProgram.die("Path '%s' exists on disk, but not in '%.*s'.", filename, object_name_len, object_name);
		} 
		if (ModernizedCProgram.is_missing_file_error((._errno()))) {
			byte fullname = ModernizedCProgram.xstrfmt("%s%s", prefix, filename);
			if (!ModernizedCProgram.get_tree_entry(r, tree_oid, fullname, oid, mode)) {
				ModernizedCProgram.die("Path '%s' exists, but not '%s'.\nDid you mean '%.*s:%s' aka '%.*s:./%s'?", fullname, filename, object_name_len, object_name, fullname, object_name_len, object_name, filename);
			} 
			ModernizedCProgram.die("Path '%s' does not exist in '%.*s'", filename, object_name_len, object_name);
		} 
	}
	/* Must be called only when :stage:filename doesn't exist. */
	public void diagnose_invalid_index_path(int stage, Object prefix, Object filename) {
		index_state generatedIndex = this.getIndex();
		index_state istate = generatedIndex;
		cache_entry ce = new cache_entry();
		int pos;
		int namelen = .strlen(filename);
		strbuf fullname = new strbuf(, , );
		if (!prefix) {
			prefix = "";
		} 
		pos = ModernizedCProgram.index_name_pos(istate, filename, /* Wrong stage number? */namelen);
		if (pos < 0) {
			pos = -pos - 1;
		} 
		int generatedCache_nr = istate.getCache_nr();
		cache_entry generatedCache = istate.getCache();
		if (pos < generatedCache_nr) {
			ce = generatedCache[pos];
			if (((ce).getCe_namelen()) == namelen && !.memcmp(ce.getName(), filename, namelen)) {
				ModernizedCProgram.die("Path '%s' is in the index, but not at stage %d.\nDid you mean ':%d:%s'?", filename, stage, (((true) & (ce).getCe_flags()) >> 12), filename);
			} 
		} 
		fullname.strbuf_addstr(/* Confusion between relative and absolute filenames? */prefix);
		fullname.strbuf_addstr(filename);
		byte generatedBuf = fullname.getBuf();
		Object generatedLen = fullname.getLen();
		pos = ModernizedCProgram.index_name_pos(istate, generatedBuf, generatedLen);
		if (pos < 0) {
			pos = -pos - 1;
		} 
		if (pos < generatedCache_nr) {
			ce = generatedCache[pos];
			if (((ce).getCe_namelen()) == generatedLen && !.memcmp(ce.getName(), generatedBuf, generatedLen)) {
				ModernizedCProgram.die("Path '%s' is in the index, but not '%s'.\nDid you mean ':%d:%s' aka ':%d:./%s'?", generatedBuf, filename, (((true) & (ce).getCe_flags()) >> 12), generatedBuf, (((true) & (ce).getCe_flags()) >> 12), filename);
			} 
		} 
		if (r.repo_file_exists(filename)) {
			ModernizedCProgram.die("Path '%s' exists on disk, but not in the index.", filename);
		} 
		if (ModernizedCProgram.is_missing_file_error((._errno()))) {
			ModernizedCProgram.die("Path '%s' does not exist (neither on disk nor in the index).", filename);
		} 
		fullname.strbuf_release();
	}
	public void maybe_die_on_misspelt_object_name(Object name, Object prefix) {
		object_context oc = new object_context();
		object_id oid = new object_id();
		ModernizedCProgram.get_oid_with_context_1(r, name, 4000, prefix, oid, oc);
	}
	public Object git_path_cherry_pick_head() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedCherry_pick_head = generatedCached_paths.getCherry_pick_head();
		if (!generatedCherry_pick_head) {
			generatedCached_paths.setCherry_pick_head(ModernizedCProgram.repo_git_path(r, "CHERRY_PICK_HEAD"));
		} 
		return generatedCherry_pick_head;
	}
	public Object git_path_revert_head() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedRevert_head = generatedCached_paths.getRevert_head();
		if (!generatedRevert_head) {
			generatedCached_paths.setRevert_head(ModernizedCProgram.repo_git_path(r, "REVERT_HEAD"));
		} 
		return generatedRevert_head;
	}
	public Object git_path_squash_msg() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedSquash_msg = generatedCached_paths.getSquash_msg();
		if (!generatedSquash_msg) {
			generatedCached_paths.setSquash_msg(ModernizedCProgram.repo_git_path(r, "SQUASH_MSG"));
		} 
		return generatedSquash_msg;
	}
	public Object git_path_merge_msg() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedMerge_msg = generatedCached_paths.getMerge_msg();
		if (!generatedMerge_msg) {
			generatedCached_paths.setMerge_msg(ModernizedCProgram.repo_git_path(r, "MERGE_MSG"));
		} 
		return generatedMerge_msg;
	}
	public Object git_path_merge_rr() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedMerge_rr = generatedCached_paths.getMerge_rr();
		if (!generatedMerge_rr) {
			generatedCached_paths.setMerge_rr(ModernizedCProgram.repo_git_path(r, "MERGE_RR"));
		} 
		return generatedMerge_rr;
	}
	public Object git_path_merge_mode() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedMerge_mode = generatedCached_paths.getMerge_mode();
		if (!generatedMerge_mode) {
			generatedCached_paths.setMerge_mode(ModernizedCProgram.repo_git_path(r, "MERGE_MODE"));
		} 
		return generatedMerge_mode;
	}
	public Object git_path_merge_head() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedMerge_head = generatedCached_paths.getMerge_head();
		if (!generatedMerge_head) {
			generatedCached_paths.setMerge_head(ModernizedCProgram.repo_git_path(r, "MERGE_HEAD"));
		} 
		return generatedMerge_head;
	}
	public Object git_path_fetch_head() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedFetch_head = generatedCached_paths.getFetch_head();
		if (!generatedFetch_head) {
			generatedCached_paths.setFetch_head(ModernizedCProgram.repo_git_path(r, "FETCH_HEAD"));
		} 
		return generatedFetch_head;
	}
	public Object git_path_shallow() {
		path_cache generatedCached_paths = this.getCached_paths();
		Object generatedShallow = generatedCached_paths.getShallow();
		if (!generatedShallow) {
			generatedCached_paths.setShallow(ModernizedCProgram.repo_git_path(r, "shallow"));
		} 
		return generatedShallow;
	}
	public void grow_object_hash() {
		int i;
		/*
			 * Note that this size must always be power-of-2 to match hash_obj
			 * above.
			 */
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		int generatedObj_hash_size = generatedParsed_objects.getObj_hash_size();
		int new_hash_size = generatedObj_hash_size < 32 ? 32 : 2 * generatedObj_hash_size;
		object new_hash = new object();
		new_hash = ModernizedCProgram.xcalloc(new_hash_size, );
		object generatedObj_hash = generatedParsed_objects.getObj_hash();
		for (i = 0; i < generatedObj_hash_size; i++) {
			object obj = generatedObj_hash[i];
			if (!obj) {
				continue;
			} 
			obj.insert_obj_hash(new_hash, new_hash_size);
		}
		ModernizedCProgram.free(generatedObj_hash);
		generatedParsed_objects.setObj_hash(new_hash);
		generatedParsed_objects.setObj_hash_size(new_hash_size);
	}
	public Object create_object(Object oid, Object o) {
		object obj = o;
		obj.setParsed(0);
		obj.setFlags(0);
		object_id generatedOid = obj.getOid();
		generatedOid.oidcpy(oid);
		parsed_object_pool generatedParsed_objects = this.getParsed_objects();
		int generatedObj_hash_size = generatedParsed_objects.getObj_hash_size();
		int generatedNr_objs = generatedParsed_objects.getNr_objs();
		if (generatedObj_hash_size - 1 <= generatedNr_objs * 2) {
			r.grow_object_hash();
		} 
		object generatedObj_hash = generatedParsed_objects.getObj_hash();
		obj.insert_obj_hash(generatedObj_hash, generatedObj_hash_size);
		generatedNr_objs++;
		return obj;
	}
	public Object repo_read_object_file(Object oid, object_type type, Long size) {
		return r.read_object_file_extended(oid, type, size, 1);
	}
	public void repo_set_commondir(Object commondir) {
		strbuf sb = new strbuf(, , );
		ModernizedCProgram.free(ModernizedCProgram.repo.getCommondir());
		if (commondir) {
			ModernizedCProgram.repo.setDifferent_commondir(1);
			ModernizedCProgram.repo.setCommondir(ModernizedCProgram.xstrdup(commondir));
			return ;
		} 
		ModernizedCProgram.repo.setDifferent_commondir(sb.get_common_dir_noenv(ModernizedCProgram.repo.getGitdir()));
		ModernizedCProgram.repo.setCommondir(sb.strbuf_detach(((Object)0)));
	}
	public void repo_set_gitdir(Object root, Object o) {
		byte gitfile = ModernizedCProgram.read_gitfile_gently((root), ((Object)0/*
			 * repo->gitdir is saved because the caller could pass "root"
			 * that also points to repo->gitdir. We want to keep it alive
			 * until after xstrdup(root). Then we can free it.
			 */));
		byte old_gitdir = ModernizedCProgram.repo.getGitdir();
		ModernizedCProgram.repo.setGitdir(ModernizedCProgram.xstrdup(gitfile ? gitfile : root));
		ModernizedCProgram.free(old_gitdir);
		ModernizedCProgram.repo.repo_set_commondir(o.getCommondir());
		if (!ModernizedCProgram.repo.getObjects().getOdb()) {
			ModernizedCProgram.repo.getObjects().setOdb(ModernizedCProgram.xcalloc(1, ));
			ModernizedCProgram.repo.getObjects().setOdb_tail(ModernizedCProgram.repo.getObjects().getOdb().getNext());
		} 
		ModernizedCProgram.expand_base_dir(ModernizedCProgram.repo.getObjects().getOdb().getPath(), o.getObject_dir(), ModernizedCProgram.repo.getCommondir(), "objects");
		ModernizedCProgram.free(ModernizedCProgram.repo.getObjects().getAlternate_db());
		ModernizedCProgram.repo.getObjects().setAlternate_db(ModernizedCProgram.xstrdup_or_null(o.getAlternate_db()));
		ModernizedCProgram.expand_base_dir(ModernizedCProgram.repo.getGraft_file(), o.getGraft_file(), ModernizedCProgram.repo.getCommondir(), "info/grafts");
		ModernizedCProgram.expand_base_dir(ModernizedCProgram.repo.getIndex_file(), o.getIndex_file(), ModernizedCProgram.repo.getGitdir(), "index");
	}
	public void repo_set_hash_algo(int hash_algo) {
		ModernizedCProgram.repo.setHash_algo(ModernizedCProgram.hash_algos[hash_algo/*
		 * Attempt to resolve and set the provided 'gitdir' for repository 'repo'.
		 * Return 0 upon success and a non-zero value upon failure.
		 */]);
	}
	public int repo_init_gitdir(Object gitdir) {
		int ret = 0;
		int error = 0;
		byte abspath = ((Object)0);
		byte resolved_gitdir;
		set_gitdir_args args = new set_gitdir_args(((Object)0));
		abspath = ModernizedCProgram.real_pathdup(gitdir, 0);
		if (!abspath) {
			ret = -1;
			;
		} 
		resolved_gitdir = ModernizedCProgram.resolve_gitdir_gently(abspath, /* 'gitdir' must reference the gitdir directly */error);
		if (!resolved_gitdir) {
			ret = -1;
			;
		} 
		ModernizedCProgram.repo.repo_set_gitdir(resolved_gitdir, args);
		return ret;
	}
	public void repo_set_worktree(Object path) {
		ModernizedCProgram.repo.setWorktree(ModernizedCProgram.real_pathdup(path, 1));
		ModernizedCProgram.repo.trace2_def_repo_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\repository.c", 130);
	}
	public int repo_init(Object gitdir, Object worktree) {
		repository_format format = new repository_format(, , , );
		.memset(ModernizedCProgram.repo, 0, );
		raw_object_store raw_object_store = new raw_object_store();
		ModernizedCProgram.repo.setObjects(raw_object_store.raw_object_store_new());
		parsed_object_pool parsed_object_pool = new parsed_object_pool();
		ModernizedCProgram.repo.setParsed_objects(parsed_object_pool.parsed_object_pool_new());
		if (ModernizedCProgram.repo.repo_init_gitdir(gitdir)) {
			;
		} 
		if (format.read_and_verify_repository_format(ModernizedCProgram.repo.getCommondir())) {
			;
		} 
		int generatedHash_algo = format.getHash_algo();
		ModernizedCProgram.repo.repo_set_hash_algo(generatedHash_algo);
		if (worktree) {
			ModernizedCProgram.repo.repo_set_worktree(worktree);
		} 
		format.clear_repository_format();
		return 0;
		return -1;
	}
	public int repo_submodule_init(repository superproject, Object sub) {
		strbuf gitdir = new strbuf(, , );
		strbuf worktree = new strbuf(, , );
		int ret = 0;
		if (!sub) {
			ret = -1;
			;
		} 
		gitdir.strbuf_repo_worktree_path(superproject, "%s/.git", sub.getPath());
		worktree.strbuf_repo_worktree_path(superproject, "%s", sub.getPath());
		byte generatedBuf = gitdir.getBuf();
		if (subrepo.repo_init(generatedBuf, generatedBuf)) {
			gitdir.strbuf_setlen(0);
			gitdir.strbuf_repo_git_path(superproject, "modules/%s", sub.getName());
			if (subrepo.repo_init(generatedBuf, ((Object)0))) {
				ret = -1;
				;
			} 
		} 
		Byte generatedSubmodule_prefix = superproject.getSubmodule_prefix();
		this.setSubmodule_prefix(ModernizedCProgram.xstrfmt("%s%s/", generatedSubmodule_prefix ? generatedSubmodule_prefix : "", sub.getPath()));
		worktree.strbuf_release();
		return ret;
	}
	public void repo_clear() {
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getGitdir());
			(ModernizedCProgram.repo.getGitdir()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getCommondir());
			(ModernizedCProgram.repo.getCommondir()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getGraft_file());
			(ModernizedCProgram.repo.getGraft_file()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getIndex_file());
			(ModernizedCProgram.repo.getIndex_file()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getWorktree());
			(ModernizedCProgram.repo.getWorktree()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getSubmodule_prefix());
			(ModernizedCProgram.repo.getSubmodule_prefix()) = ((Object)0);
		} while (0);
		ModernizedCProgram.repo.getObjects().raw_object_store_clear();
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getObjects());
			(ModernizedCProgram.repo.getObjects()) = ((Object)0);
		} while (0);
		ModernizedCProgram.repo.getParsed_objects().parsed_object_pool_clear();
		do {
			ModernizedCProgram.free(ModernizedCProgram.repo.getParsed_objects());
			(ModernizedCProgram.repo.getParsed_objects()) = ((Object)0);
		} while (0);
		if (ModernizedCProgram.repo.getConfig()) {
			.git_configset_clear(ModernizedCProgram.repo.getConfig());
			do {
				ModernizedCProgram.free(ModernizedCProgram.repo.getConfig());
				(ModernizedCProgram.repo.getConfig()) = ((Object)0);
			} while (0);
		} 
		if (ModernizedCProgram.repo.getSubmodule_cache()) {
			ModernizedCProgram.repo.getSubmodule_cache().submodule_cache_free();
			ModernizedCProgram.repo.setSubmodule_cache(((Object)0));
		} 
		if (ModernizedCProgram.repo.getIndex()) {
			ModernizedCProgram.repo.getIndex().discard_index();
			if (ModernizedCProgram.repo.getIndex() != ModernizedCProgram.the_index) {
				do {
					ModernizedCProgram.free(ModernizedCProgram.repo.getIndex());
					(ModernizedCProgram.repo.getIndex()) = ((Object)0);
				} while (0);
			} 
		} 
	}
	public int repo_read_index() {
		if (!ModernizedCProgram.repo.getIndex()) {
			ModernizedCProgram.repo.setIndex(ModernizedCProgram.xcalloc(1, ));
		} 
		return ModernizedCProgram.repo.getIndex().read_index_from(ModernizedCProgram.repo.getIndex_file(), ModernizedCProgram.repo.getGitdir());
	}
	public int repo_refresh_and_write_index(int refresh_flags, int write_flags, int gentle, Object pathspec, Byte seen, Object header_msg) {
		lock_file lock_file = new lock_file(((Object)0));
		int fd;
		int ret = 0;
		fd = ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.repo, lock_file, 0);
		if (!gentle && fd < 0) {
			return -1;
		} 
		if (ModernizedCProgram.repo.getIndex().refresh_index(refresh_flags, pathspec, seen, header_msg)) {
			ret = 1;
		} 
		if (0 <= fd && ModernizedCProgram.write_locked_index(ModernizedCProgram.repo.getIndex(), lock_file, (1 << 0) | write_flags)) {
			ret = -1;
		} 
		return ret;
	}
	public int get_index_format_default() {
		byte envversion = .getenv("GIT_INDEX_VERSION");
		byte endp;
		int version = 3;
		repo_settings generatedSettings = this.getSettings();
		int generatedIndex_version = generatedSettings.getIndex_version();
		if (!envversion) {
			r.prepare_repo_settings();
			if (generatedIndex_version >= 0) {
				version = generatedIndex_version;
			} 
			if (version < 2 || 4 < version) {
				ModernizedCProgram.warning(ModernizedCProgram._("index.version set, but the value is invalid.\nUsing version %i"), 3);
				return 3;
			} 
			return version;
		} 
		version = .strtoul(envversion, endp, 10);
		if (endp || version < 2 || 4 < version) {
			ModernizedCProgram.warning(ModernizedCProgram._("GIT_INDEX_VERSION set, but the value is invalid.\nUsing version %i"), 3);
			version = 3;
		} 
		return version/*
		 * dev/ino/uid/gid/size are also just tracked to the low 32 bits
		 * Again - this is just a (very strong in practice) heuristic that
		 * the inode hasn't changed.
		 *
		 * We save the fields in big-endian order to allow using the
		 * index file over NFS transparently.
		 */;
	}
	public int repo_verify_index() {
		return ModernizedCProgram.verify_index_from(ModernizedCProgram.repo.getIndex(), ModernizedCProgram.repo.getIndex_file());
	}
	public int repo_read_index_unmerged() {
		index_state istate = new index_state();
		int i;
		int unmerged = 0;
		ModernizedCProgram.repo.repo_read_index();
		istate = ModernizedCProgram.repo.getIndex();
		int generatedCache_nr = istate.getCache_nr();
		cache_entry generatedCache = istate.getCache();
		int generatedCe_flags = (ce).getCe_flags();
		int generatedCe_namelen = (ce).getCe_namelen();
		cache_entry cache_entry = new cache_entry();
		Object generatedName = new_ce.getName();
		int generatedCe_mode = ce.getCe_mode();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			cache_entry new_ce = new cache_entry();
			int len;
			if (!(((true) & generatedCe_flags) >> 12)) {
				continue;
			} 
			unmerged = 1;
			ModernizedCProgram.len = (generatedCe_namelen);
			new_ce = cache_entry.make_empty_cache_entry(istate, ModernizedCProgram.len);
			.memcpy(generatedName, generatedName, ModernizedCProgram.len);
			new_ce.setCe_flags(ModernizedCProgram.create_ce_flags(0) | (1 << 23));
			new_ce.setCe_namelen(ModernizedCProgram.len);
			new_ce.setCe_mode(generatedCe_mode);
			if (ModernizedCProgram.add_index_entry(istate, new_ce, 4)) {
				return ();
			} 
		}
		return unmerged/*
		 * Returns 1 if the path is an "other" path with respect to
		 * the index; that is, the path is not mentioned in the index at all,
		 * either as a file, a directory with some files in the index,
		 * or as an unmerged entry.
		 *
		 * We helpfully remove a trailing "/" from directories so that
		 * the output of read_directory can be used as-is.
		 */;
	}
	public Object repo_logmsg_reencode(Object commit, byte commit_encoding, Object output_encoding) {
		byte utf8 = "UTF-8";
		byte use_encoding;
		byte encoding;
		byte msg = .repo_get_commit_buffer(r, commit, ((Object)0));
		byte out;
		if (!output_encoding || !output_encoding) {
			if (commit_encoding) {
				commit_encoding = ModernizedCProgram.get_header(msg, "encoding");
			} 
			return msg;
		} 
		encoding = ModernizedCProgram.get_header(msg, "encoding");
		if (commit_encoding) {
			commit_encoding = encoding;
		} 
		use_encoding = encoding ? encoding : utf8;
		if (ModernizedCProgram.same_encoding(use_encoding, output_encoding/*
				 * No encoding work to be done. If we have no encoding header
				 * at all, then there's nothing to do, and we can return the
				 * message verbatim (whether newly allocated or not).
				 */)) {
			if (!encoding) {
				return msg/*
						 * Otherwise, we still want to munge the encoding header in the
						 * result, which will be done by modifying the buffer. If we
						 * are using a fresh copy, we can reuse it. But if we are using
						 * the cached copy from get_commit_buffer, we need to duplicate it
						 * to avoid munging the cached copy.
						 */;
			} 
			if (msg == .get_cached_commit_buffer(r, commit, ((Object)0))) {
				out = ModernizedCProgram.xstrdup(msg);
			} else {
					out = (byte)msg/*
							 * There's actual encoding work to do. Do the reencoding, which
							 * still leaves the header to be replaced in the next step. At
							 * this point, we are done with msg. If we allocated a fresh
							 * copy, we can free it.
							 */;
			} 
		} else {
				out = ModernizedCProgram.reencode_string(msg, output_encoding, use_encoding);
				if (out) {
					.repo_unuse_commit_buffer(r, commit, msg/*
						 * This replacement actually consumes the buffer we hand it, so we do
						 * not have to worry about freeing the old "out" here.
						 */);
				} 
		} 
		if (out) {
			out = ModernizedCProgram.replace_encoding_header(out, output_encoding);
		} 
		if (!commit_encoding) {
			ModernizedCProgram.free(encoding/*
				 * If the re-encoding failed, out might be NULL here; in that
				 * case we just return the commit message verbatim.
				 */);
		} 
		return out ? out : msg;
	}
	public int link_alt_odb_entry(Object entry, Object relative_base, int depth, Object normalized_objdir) {
		object_directory ent = new object_directory();
		strbuf pathbuf = new strbuf(, , );
		if (!ModernizedCProgram.is_absolute_path(entry) && relative_base) {
			pathbuf.strbuf_realpath(relative_base, 1);
			pathbuf.strbuf_addch((byte)'/');
		} 
		pathbuf.strbuf_addstr(entry);
		if (pathbuf.strbuf_normalize_path() < 0 && relative_base) {
			();
			pathbuf.strbuf_release();
			return -1/*
				 * The trailing slash after the directory name is given by
				 * this function at the end. Remove duplicates.
				 */;
		} 
		Object generatedLen = pathbuf.getLen();
		byte generatedBuf = pathbuf.getBuf();
		while (generatedLen && generatedBuf[generatedLen - 1] == (byte)'/') {
			pathbuf.strbuf_setlen(generatedLen - 1);
		}
		raw_object_store generatedObjects = this.getObjects();
		if (!ModernizedCProgram.alt_odb_usable(generatedObjects, pathbuf, normalized_objdir)) {
			pathbuf.strbuf_release();
			return -1;
		} 
		ent = ModernizedCProgram.xcalloc(1, );
		ent.setPath(ModernizedCProgram.xstrdup(generatedBuf));
		object_directory generatedOdb_tail = generatedObjects.getOdb_tail();
		generatedOdb_tail = /* add the alternate entry */ent;
		object_directory generatedNext = ent.getNext();
		generatedObjects.setOdb_tail((generatedNext));
		ent.setNext(((Object)0));
		r.read_info_alternates(generatedBuf, depth + /* recursively add alternates */1);
		pathbuf.strbuf_release();
		return 0;
	}
	public void link_alt_odb_entries(Object alt, int sep, Object relative_base, int depth) {
		strbuf objdirbuf = new strbuf(, , );
		strbuf entry = new strbuf(, , );
		if (!alt || !alt) {
			return ;
		} 
		if (depth > 5) {
			();
			return ;
		} 
		raw_object_store generatedObjects = this.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		Byte generatedPath = generatedOdb.getPath();
		objdirbuf.strbuf_add_absolute_path(generatedPath);
		byte generatedBuf = objdirbuf.getBuf();
		if (objdirbuf.strbuf_normalize_path() < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to normalize object directory: %s"), generatedBuf);
		} 
		Object generatedLen = entry.getLen();
		while (alt) {
			alt = entry.parse_alt_odb_entry(alt, sep);
			if (!generatedLen) {
				continue;
			} 
			r.link_alt_odb_entry(generatedBuf, relative_base, depth, generatedBuf);
		}
		entry.strbuf_release();
		objdirbuf.strbuf_release();
	}
	public void read_info_alternates(Object relative_base, int depth) {
		byte path;
		strbuf buf = new strbuf(, , );
		path = ModernizedCProgram.xstrfmt("%s/info/alternates", relative_base);
		if (buf.strbuf_read_file(path, 1024) < 0) {
			ModernizedCProgram.warn_on_fopen_errors(path);
			ModernizedCProgram.free(path);
			return ;
		} 
		byte generatedBuf = buf.getBuf();
		r.link_alt_odb_entries(generatedBuf, (byte)'\n', relative_base, depth);
		buf.strbuf_release();
		ModernizedCProgram.free(path);
	}
	public void prepare_alt_odb() {
		raw_object_store generatedObjects = this.getObjects();
		int generatedLoaded_alternates = generatedObjects.getLoaded_alternates();
		if (generatedLoaded_alternates) {
			return ;
		} 
		Byte generatedAlternate_db = generatedObjects.getAlternate_db();
		r.link_alt_odb_entries(generatedAlternate_db, (byte)':', ((Object)0), 0);
		object_directory generatedOdb = generatedObjects.getOdb();
		Byte generatedPath = generatedOdb.getPath();
		r.read_info_alternates(generatedPath, 0);
		generatedObjects.setLoaded_alternates(1);
	}
	public int open_loose_object(Object oid, Object path) {
		int fd;
		object_directory odb = new object_directory();
		int most_interesting_errno = 2;
		strbuf buf = new strbuf(, , );
		r.prepare_alt_odb();
		object_directory generatedNext = odb.getNext();
		raw_object_store generatedObjects = this.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		for (odb = generatedOdb; odb; odb = generatedNext) {
			path = ModernizedCProgram.odb_loose_path(odb, buf, oid);
			fd = ModernizedCProgram.git_open_cloexec(path, 0);
			if (fd >= 0) {
				return fd;
			} 
			if (most_interesting_errno == 2) {
				most_interesting_errno = (._errno());
			} 
		}
		(._errno()) = most_interesting_errno;
		return -1;
	}
	public int quick_has_loose(Object oid) {
		object_directory odb = new object_directory();
		r.prepare_alt_odb();
		oid_array oid_array = new oid_array();
		object_directory generatedNext = odb.getNext();
		raw_object_store generatedObjects = this.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		for (odb = generatedOdb; odb; odb = generatedNext) {
			if (oid_array.odb_loose_cache(odb, oid).oid_array_lookup(oid) >= 0) {
				return 1;
			} 
		}
		return 0/*
		 * Map the loose object at "path" if it is not NULL, or the path found by
		 * searching for a loose object named "oid".
		 */;
	}
	public Object map_loose_object_1(Object path, Object oid, long size) {
		Object map;
		int fd;
		if (path) {
			fd = ModernizedCProgram.git_open_cloexec(path, 0);
		} else {
				fd = r.open_loose_object(oid, path);
		} 
		map = ((Object)0);
		Object generatedSt_size = st.getSt_size();
		if (fd >= 0) {
			stat st = new stat();
			if (!.fstat(fd, st)) {
				size = ModernizedCProgram.xsize_t(generatedSt_size);
				if (!size) {
					();
					.close(fd);
					return ((Object)0);
				} 
				map = ModernizedCProgram.xmmap(((Object)0), size, PROT_READ, MAP_PRIVATE, fd, 0);
			} 
			.close(fd);
		} 
		return map;
	}
	public Object map_loose_object(Object oid, Long size) {
		return r.map_loose_object_1(((Object)0), oid, size);
	}
	/* returns enum object_type or negative */
	public int oid_object_info(Object oid, Long sizep) {
		object_type type;
		object_info oi = new object_info(((Object)0));
		oi.setTypep(object_type.type);
		oi.setSizep(sizep);
		if (ModernizedCProgram.oid_object_info_extended(r, oid, oi, 1) < 0) {
			return -1;
		} 
		return object_type.type;
	}
	public Object read_object_file_extended(Object oid, object_type type, Long size, int lookup_replace) {
		Object data;
		packed_git p = new packed_git();
		byte path;
		stat st = new stat();
		object_id repl = lookup_replace ? r.lookup_replace_object(oid) : oid;
		(._errno()) = 0;
		data = r.read_object(repl, type, size);
		if (data) {
			return data;
		} 
		if ((._errno()) && (._errno()) != 2) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to read object %s"), ModernizedCProgram.oid_to_hex(oid));
		} 
		if (repl != /* die if we replaced an object with one that does not exist */oid) {
			ModernizedCProgram.die(ModernizedCProgram._("replacement %s not found for %s"), ModernizedCProgram.oid_to_hex(repl), ModernizedCProgram.oid_to_hex(oid));
		} 
		if (!ModernizedCProgram.stat_loose_object(r, repl, st, path)) {
			ModernizedCProgram.die(ModernizedCProgram._("loose object %s (stored in %s) is corrupt"), ModernizedCProgram.oid_to_hex(repl), path);
		} 
		if ((p = r.has_packed_and_bad(repl.getHash())) != ((Object)0)) {
			ModernizedCProgram.die(ModernizedCProgram._("packed object %s (stored in %s) is corrupt"), ModernizedCProgram.oid_to_hex(repl), p.getPack_name());
		} 
		return ((Object)0);
	}
	public int repo_has_object_file_with_flags(Object oid, int flags) {
		if (!ModernizedCProgram.startup_info.getHave_repository()) {
			return 0;
		} 
		return ModernizedCProgram.oid_object_info_extended(r, oid, ((Object)0), flags | 4) >= 0;
	}
	public int repo_has_object_file(Object oid) {
		return r.repo_has_object_file_with_flags(oid, 0);
	}
	public int register_replace_ref(Object refname, Object oid, int flag, Object cb_data) {
		byte slash = .strrchr(refname, /* Get sha1 from refname */(byte)'/');
		byte hash = slash ? slash + 1 : refname;
		replace_object repl_obj = ModernizedCProgram.xmalloc();
		oidmap_entry generatedOriginal = repl_obj.getOriginal();
		object_id generatedOid = generatedOriginal.getOid();
		if (generatedOid.get_oid_hex(hash)) {
			ModernizedCProgram.free(repl_obj);
			ModernizedCProgram.warning(ModernizedCProgram._("bad replace ref name: %s"), refname);
			return 0;
		} 
		object_id generatedReplacement = repl_obj.getReplacement();
		generatedReplacement.oidcpy(/* Copy sha1 from the read ref */oid);
		raw_object_store generatedObjects = this.getObjects();
		oidmap generatedReplace_map = generatedObjects.getReplace_map();
		if (generatedReplace_map.oidmap_put(/* Register new object */repl_obj)) {
			ModernizedCProgram.die(ModernizedCProgram._("duplicate replace ref: %s"), refname);
		} 
		return 0;
	}
	public void prepare_replace_object() {
		raw_object_store generatedObjects = this.getObjects();
		oidmap generatedReplace_map = generatedObjects.getReplace_map();
		if (generatedReplace_map) {
			return ;
		} 
		generatedObjects.setReplace_map(ModernizedCProgram.xmalloc());
		generatedReplace_map.oidmap_init(0);
		r.for_each_replace_ref(register_replace_ref, ((Object)0/* We allow "recursive" replacement. Only within reason, though */))/*
		 * If a replacement for object oid has been set up, return the
		 * replacement object's name (replaced recursively, if necessary).
		 * The return value is either oid or a pointer to a
		 * permanently-allocated value.  This function always respects replace
		 * references, regardless of the value of read_replace_refs.
		 */;/*
		 * If a replacement for object oid has been set up, return the
		 * replacement object's name (replaced recursively, if necessary).
		 * The return value is either oid or a pointer to a
		 * permanently-allocated value.  This function always respects replace
		 * references, regardless of the value of read_replace_refs.
		 */
	}
	public Object do_lookup_replace_object(Object oid) {
		int depth = 5;
		object_id cur = oid;
		r.prepare_replace_object();
		raw_object_store generatedObjects = this.getObjects();
		oidmap generatedReplace_map = generatedObjects.getReplace_map();
		object_id generatedReplacement = repl_obj.getReplacement();
		while (depth-- > /* Try to recursively replace the object */0) {
			replace_object repl_obj = ModernizedCProgram.oidmap_get(generatedReplace_map, cur);
			if (!repl_obj) {
				return cur;
			} 
			cur = generatedReplacement;
		}
		ModernizedCProgram.die(ModernizedCProgram._("replace depth too high for object %s"), ModernizedCProgram.oid_to_hex(oid));
	}
	public Object lookup_replace_object(Object oid) {
		raw_object_store generatedObjects = this.getObjects();
		oidmap generatedReplace_map = generatedObjects.getReplace_map();
		hashmap generatedMap = generatedReplace_map.getMap();
		int generatedTablesize = generatedMap.getTablesize();
		if (!ModernizedCProgram.read_replace_refs || (generatedReplace_map && generatedTablesize == 0)) {
			return oid;
		} 
		return r.do_lookup_replace_object(oid/* REPLACE_OBJECT_H */);
	}
	public int prepare_multi_pack_index_one(Object object_dir, int local) {
		multi_pack_index m = new multi_pack_index();
		multi_pack_index m_search = new multi_pack_index();
		int config_value;
		int env_value = -1;
		if (env_value < 0) {
			env_value = .git_env_bool("GIT_TEST_MULTI_PACK_INDEX", 0);
		} 
		if (!env_value && (.repo_config_get_bool(r, "core.multipackindex", config_value) || !config_value)) {
			return 0;
		} 
		Object generatedObject_dir = m_search.getObject_dir();
		multi_pack_index generatedNext = m_search.getNext();
		raw_object_store generatedObjects = this.getObjects();
		multi_pack_index generatedMulti_pack_index = generatedObjects.getMulti_pack_index();
		for (m_search = generatedMulti_pack_index; m_search; m_search = generatedNext) {
			if (!.strcmp(object_dir, generatedObject_dir)) {
				return 1;
			} 
		}
		multi_pack_index multi_pack_index = new multi_pack_index();
		m = multi_pack_index.load_multi_pack_index(object_dir, local);
		if (m) {
			m.setNext(generatedMulti_pack_index);
			generatedObjects.setMulti_pack_index(m);
			return 1;
		} 
		return 0;
	}
	public void clear_midx_file() {
		raw_object_store generatedObjects = this.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		Byte generatedPath = generatedOdb.getPath();
		byte midx = ModernizedCProgram.get_midx_filename(generatedPath);
		multi_pack_index generatedMulti_pack_index = generatedObjects.getMulti_pack_index();
		if (generatedObjects && generatedMulti_pack_index) {
			generatedMulti_pack_index.close_midx();
			generatedObjects.setMulti_pack_index(((Object)0));
		} 
		if (ModernizedCProgram.remove_path(midx)) {
			do {
			} while (0);
			ModernizedCProgram.die(ModernizedCProgram._("failed to clear multi-pack-index at %s"), midx);
		} 
		ModernizedCProgram.free(midx);
	}
	public int verify_midx_file(Object object_dir) {
		pair_pos_vs_id pairs = ((Object)0);
		uint32_t i = new uint32_t();
		progress progress = new progress();
		multi_pack_index multi_pack_index = new multi_pack_index();
		multi_pack_index m = multi_pack_index.load_multi_pack_index(object_dir, 1);
		ModernizedCProgram.verify_midx_error = 0;
		if (!m) {
			return 0;
		} 
		Object generatedNum_packs = m.getNum_packs();
		progress progress = new progress();
		progress = progress.start_progress(ModernizedCProgram._("Looking for referenced packfiles"), generatedNum_packs);
		for (i = 0; i < generatedNum_packs; i++) {
			if (ModernizedCProgram.prepare_midx_pack(r, m, i)) {
				ModernizedCProgram.midx_report("failed to load pack in position %d", i);
			} 
			progress.display_progress(i + 1);
		}
		progress.stop_progress();
		Object generatedChunk_oid_fanout = m.getChunk_oid_fanout();
		for (i = 0; i < 255; i++) {
			uint32_t oid_fanout1 = .ntohl(generatedChunk_oid_fanout[i]);
			uint32_t oid_fanout2 = .ntohl(generatedChunk_oid_fanout[i + 1]);
			if (oid_fanout1 > oid_fanout2) {
				ModernizedCProgram.midx_report(ModernizedCProgram._("oid fanout out of order: fanout[%d] = %x > %x = fanout[%d]"), i, oid_fanout1, oid_fanout2, i + 1);
			} 
		}
		Object generatedNum_objects = m.getNum_objects();
		progress progress = new progress();
		progress = progress.start_sparse_progress(ModernizedCProgram._("Verifying OID order in MIDX"), generatedNum_objects - 1);
		for (i = 0; i < generatedNum_objects - 1; i++) {
			object_id oid1 = new object_id();
			object_id oid2 = new object_id();
			oid1.nth_midxed_object_oid(m, i);
			oid2.nth_midxed_object_oid(m, i + 1);
			if (ModernizedCProgram.oidcmp(oid1, oid2) >= 0) {
				ModernizedCProgram.midx_report(ModernizedCProgram._("oid lookup out of order: oid[%d] = %s >= %s = oid[%d]"), i, ModernizedCProgram.oid_to_hex(oid1), ModernizedCProgram.oid_to_hex(oid2), i + 1);
			} 
			do {
				uint64_t _n = (i + 1);
				if ((_n & ((1 << 12) - 1)) == 0) {
					progress.display_progress(_n);
				} 
			} while (0);
		}
		progress/*
			 * Create an array mapping each object to its packfile id.  Sort it
			 * to group the objects by packfile.  Use this permutation to visit
			 * each of the objects and only require 1 packfile to be open at a
			 * time.
			 */.stop_progress();
		(pairs) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (generatedNum_objects)));
		for (i = 0; i < generatedNum_objects; i++) {
			pairs[i].setPos(i);
			pairs[i].setPack_int_id(m.nth_midxed_pack_int_id(i));
		}
		progress = progress.start_sparse_progress(ModernizedCProgram._("Sorting objects by packfile"), generatedNum_objects);
		progress.display_progress(/* TODO: Measure QSORT() progress */0);
		ModernizedCProgram.sane_qsort((pairs), (generatedNum_objects), , compare_pair_pos_vs_id);
		progress.stop_progress();
		progress = progress.start_sparse_progress(ModernizedCProgram._("Verifying object offsets"), generatedNum_objects);
		packed_git generatedPacks = m.getPacks();
		packed_git generatedP = e.getP();
		Object generatedPack_name = generatedP.getPack_name();
		Object generatedOffset = e.getOffset();
		Object generatedHash = oid.getHash();
		progress.stop_progress();
		ModernizedCProgram.free(pairs);
		return ModernizedCProgram.verify_midx_error;
	}
	public int expire_midx_packs(Object object_dir) {
		uint32_t i = new uint32_t();
		uint32_t count = new uint32_t();
		uint32_t result = 0;
		string_list packs_to_drop = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		multi_pack_index multi_pack_index = new multi_pack_index();
		multi_pack_index m = multi_pack_index.load_multi_pack_index(object_dir, 1);
		if (!m) {
			return 0;
		} 
		Object generatedNum_packs = m.getNum_packs();
		count = ModernizedCProgram.xcalloc(generatedNum_packs, );
		Object generatedNum_objects = m.getNum_objects();
		for (i = 0; i < generatedNum_objects; i++) {
			int pack_int_id = m.nth_midxed_pack_int_id(i);
			count[pack_int_id]++;
		}
		packed_git generatedPacks = m.getPacks();
		Object generatedPack_names = m.getPack_names();
		string_list_item string_list_item = new string_list_item();
		for (i = 0; i < generatedNum_packs; i++) {
			byte pack_name;
			if (count[i]) {
				continue;
			} 
			if (ModernizedCProgram.prepare_midx_pack(r, m, i)) {
				continue;
			} 
			if (generatedPacks[i].getPack_keep()) {
				continue;
			} 
			pack_name = ModernizedCProgram.xstrdup(generatedPacks[i].getPack_name());
			generatedPacks[i].close_pack();
			string_list_item.string_list_insert(packs_to_drop, generatedPack_names[i]);
			ModernizedCProgram.unlink_pack_path(pack_name, 0);
			ModernizedCProgram.free(pack_name);
		}
		ModernizedCProgram.free(count);
		int generatedNr = packs_to_drop.getNr();
		if (generatedNr) {
			result = ModernizedCProgram.write_midx_internal(object_dir, m, packs_to_drop);
		} 
		packs_to_drop.string_list_clear(0);
		return result;
	}
	public int midx_repack(Object object_dir, Object batch_size) {
		int result = 0;
		uint32_t i = new uint32_t();
		byte include_pack;
		child_process cmd = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf base_name = new strbuf(, , );
		multi_pack_index multi_pack_index = new multi_pack_index();
		multi_pack_index m = multi_pack_index.load_multi_pack_index(object_dir, 1);
		if (!m) {
			return 0;
		} 
		Object generatedNum_packs = m.getNum_packs();
		include_pack = ModernizedCProgram.xcalloc(generatedNum_packs, );
		if (batch_size) {
			if (ModernizedCProgram.fill_included_packs_batch(r, m, include_pack, batch_size)) {
				;
			} 
		}  else if (m.fill_included_packs_all(include_pack)) {
			;
		} 
		argv_array generatedArgs = cmd.getArgs();
		generatedArgs.argv_array_push("pack-objects");
		base_name.strbuf_addstr(object_dir);
		base_name.strbuf_addstr("/pack/pack");
		byte generatedBuf = base_name.getBuf();
		generatedArgs.argv_array_push(generatedBuf);
		base_name.strbuf_release();
		cmd.setGit_cmd(1);
		cmd.setIn(cmd.setOut(-1));
		if (cmd.start_command()) {
			();
			result = 1;
			;
		} 
		Object generatedNum_objects = m.getNum_objects();
		int generatedIn = cmd.getIn();
		for (i = 0; i < generatedNum_objects; i++) {
			object_id oid = new object_id();
			uint32_t pack_int_id = m.nth_midxed_pack_int_id(i);
			if (!include_pack[pack_int_id]) {
				continue;
			} 
			oid.nth_midxed_object_oid(m, i);
			ModernizedCProgram.xwrite(generatedIn, ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.the_repository.getHash_algo().getHexsz());
			ModernizedCProgram.xwrite(generatedIn, "\n", 1);
		}
		.close(generatedIn);
		if (cmd.finish_command()) {
			();
			result = 1;
			;
		} 
		result = ModernizedCProgram.write_midx_internal(object_dir, m, ((Object)0));
		m = ((Object)0);
		ModernizedCProgram.free(include_pack);
		return result;
	}
	public void create_branch(Object name, Object start_name, int force, int clobber_head_ok, int reflog, int quiet, branch_track track) {
		commit commit = new commit();
		object_id oid = new object_id();
		byte real_ref;
		strbuf ref = new strbuf(, , );
		int forcing = 0;
		int dont_change_ref = 0;
		int explicit_tracking = 0;
		if (branch_track.track == branch_track.BRANCH_TRACK_EXPLICIT || branch_track.track == branch_track.BRANCH_TRACK_OVERRIDE) {
			explicit_tracking = 1;
		} 
		if ((branch_track.track == branch_track.BRANCH_TRACK_OVERRIDE || clobber_head_ok) ? ref.validate_branchname(name) : ref.validate_new_branchname(name, force)) {
			if (!force) {
				dont_change_ref = 1;
			} else {
					forcing = 1;
			} 
		} 
		real_ref = ((Object)0);
		if (ModernizedCProgram.repo_get_oid_mb(ModernizedCProgram.the_repository, start_name, oid)) {
			if (explicit_tracking) {
				if (ModernizedCProgram.advice_set_upstream_failure) {
					();
					ModernizedCProgram.advise(ModernizedCProgram._(ModernizedCProgram.upstream_advice));
					.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\branch.c", 277, (true)));
				} 
				ModernizedCProgram.die(ModernizedCProgram._(ModernizedCProgram.upstream_missing), start_name);
			} 
			ModernizedCProgram.die(ModernizedCProgram._("Not a valid object name: '%s'."), start_name);
		} 
		switch (oid.dwim_ref(start_name, .strlen(start_name), real_ref)) {
		case 0:
				if (/* Not branching from any existing branch */explicit_tracking) {
					ModernizedCProgram.die(ModernizedCProgram._(ModernizedCProgram.upstream_not_branch), start_name);
				} 
				break;
		case 1:
				if (!ModernizedCProgram.starts_with(real_ref, /* Unique completion -- good, only if it is a real branch */"refs/heads/") && ModernizedCProgram.validate_remote_tracking_branch(real_ref)) {
					if (explicit_tracking) {
						ModernizedCProgram.die(ModernizedCProgram._(ModernizedCProgram.upstream_not_branch), start_name);
					} else {
							real_ref = ((Object)0);
					} 
				} 
				break;
		default:
				ModernizedCProgram.die(ModernizedCProgram._("Ambiguous object name: '%s'."), start_name);
				break;
		}
		if ((commit = .lookup_commit_reference(r, oid)) == ((Object)0)) {
			ModernizedCProgram.die(ModernizedCProgram._("Not a valid branch point: '%s'."), start_name);
		} 
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		oid.oidcpy(generatedOid);
		if (reflog) {
			log_refs_config.log_all_ref_updates = log_refs_config.LOG_REFS_NORMAL;
		} 
		ref_transaction ref_transaction = new ref_transaction();
		byte generatedBuf = ref.getBuf();
		if (!dont_change_ref) {
			ref_transaction transaction = new ref_transaction();
			strbuf err = new strbuf(, , );
			byte msg;
			if (forcing) {
				ModernizedCProgram.msg = ModernizedCProgram.xstrfmt("branch: Reset to %s", start_name);
			} else {
					ModernizedCProgram.msg = ModernizedCProgram.xstrfmt("branch: Created from %s", start_name);
			} 
			ModernizedCProgram.transaction = ref_transaction.ref_transaction_begin(ModernizedCProgram.err);
			if (!ModernizedCProgram.transaction || ModernizedCProgram.ref_transaction_update(ModernizedCProgram.transaction, generatedBuf, oid, forcing ? ((Object)0) : ModernizedCProgram.null_oid, 0, ModernizedCProgram.msg, ModernizedCProgram.err) || ModernizedCProgram.ref_transaction_commit(ModernizedCProgram.transaction, ModernizedCProgram.err)) {
				ModernizedCProgram.die("%s", generatedBuf);
			} 
			ModernizedCProgram.transaction.ref_transaction_free();
			ModernizedCProgram.err.strbuf_release();
			ModernizedCProgram.free(ModernizedCProgram.msg);
		} 
		if (real_ref && branch_track.track) {
			ModernizedCProgram.setup_tracking(generatedBuf + 11, real_ref, branch_track.track, quiet);
		} 
		ref.strbuf_release();
		ModernizedCProgram.free(real_ref);
	}
	public void remove_merge_branch_state() {
		.unlink(r.git_path_merge_head());
		.unlink(r.git_path_merge_rr());
		.unlink(r.git_path_merge_msg());
		.unlink(r.git_path_merge_mode());
	}
	public void remove_branch_state(int verbose) {
		r.sequencer_post_commit_cleanup(verbose);
		.unlink(r.git_path_squash_msg());
		r.remove_merge_branch_state();
	}
	public Byte substitute_branch_name(Object string, int len) {
		strbuf buf = new strbuf(, , );
		int ret = ModernizedCProgram.repo_interpret_branch_name(r, string, len, buf, 0);
		if (ret == len) {
			size_t size = new size_t();
			string = buf.strbuf_detach(size);
			len = size;
			return (byte)string;
		} 
		return ((Object)0);
	}
	public int do_for_each_repo_ref(Object prefix, Object fn, int trim, int flags, Object cb_data) {
		ref_iterator iter = new ref_iterator();
		ref_store ref_store = new ref_store();
		ref_store refs = ref_store.get_main_ref_store(r);
		if (!refs) {
			return 0;
		} 
		ref_iterator ref_iterator = new ref_iterator();
		iter = ref_iterator.refs_ref_iterator_begin(refs, prefix, trim, flags);
		return ModernizedCProgram.do_for_each_repo_ref_iterator(r, iter, fn, cb_data);
	}
	public int do_for_each_ref_helper(Object refname, Object oid, int flags, Object cb_data) {
		do_for_each_ref_help hp = cb_data;
		Object generatedCb_data = hp.getCb_data();
		return .UNRECOGNIZEDFUNCTIONNAME(refname, oid, flags, generatedCb_data);
	}
	public int for_each_replace_ref(Object fn, Object cb_data) {
		return r.do_for_each_repo_ref(ModernizedCProgram.git_replace_ref_base, fn, .strlen(ModernizedCProgram.git_replace_ref_base), DO_FOR_EACH_INCLUDE_BROKEN, cb_data);
	}
	public Byte getGitdir() {
		return gitdir;
	}
	public void setGitdir(Byte newGitdir) {
		gitdir = newGitdir;
	}
	public Byte getCommondir() {
		return commondir;
	}
	public void setCommondir(Byte newCommondir) {
		commondir = newCommondir;
	}
	public raw_object_store getObjects() {
		return objects;
	}
	public void setObjects(raw_object_store newObjects) {
		objects = newObjects;
	}
	public parsed_object_pool getParsed_objects() {
		return parsed_objects;
	}
	public void setParsed_objects(parsed_object_pool newParsed_objects) {
		parsed_objects = newParsed_objects;
	}
	public ref_store getRefs() {
		return refs;
	}
	public void setRefs(ref_store newRefs) {
		refs = newRefs;
	}
	public path_cache getCached_paths() {
		return cached_paths;
	}
	public void setCached_paths(path_cache newCached_paths) {
		cached_paths = newCached_paths;
	}
	public Byte getGraft_file() {
		return graft_file;
	}
	public void setGraft_file(Byte newGraft_file) {
		graft_file = newGraft_file;
	}
	public Byte getIndex_file() {
		return index_file;
	}
	public void setIndex_file(Byte newIndex_file) {
		index_file = newIndex_file;
	}
	public Byte getWorktree() {
		return worktree;
	}
	public void setWorktree(Byte newWorktree) {
		worktree = newWorktree;
	}
	public Byte getSubmodule_prefix() {
		return submodule_prefix;
	}
	public void setSubmodule_prefix(Byte newSubmodule_prefix) {
		submodule_prefix = newSubmodule_prefix;
	}
	public repo_settings getSettings() {
		return settings;
	}
	public void setSettings(repo_settings newSettings) {
		settings = newSettings;
	}
	public config_set getConfig() {
		return config;
	}
	public void setConfig(config_set newConfig) {
		config = newConfig;
	}
	public submodule_cache getSubmodule_cache() {
		return submodule_cache;
	}
	public void setSubmodule_cache(submodule_cache newSubmodule_cache) {
		submodule_cache = newSubmodule_cache;
	}
	public index_state getIndex() {
		return index;
	}
	public void setIndex(index_state newIndex) {
		index = newIndex;
	}
	public Object getHash_algo() {
		return hash_algo;
	}
	public void setHash_algo(Object newHash_algo) {
		hash_algo = newHash_algo;
	}
	public int getTrace2_repo_id() {
		return trace2_repo_id;
	}
	public void setTrace2_repo_id(int newTrace2_repo_id) {
		trace2_repo_id = newTrace2_repo_id;
	}
	public int getCommit_graph_disabled() {
		return commit_graph_disabled;
	}
	public void setCommit_graph_disabled(int newCommit_graph_disabled) {
		commit_graph_disabled = newCommit_graph_disabled;
	}
	public int getDifferent_commondir() {
		return different_commondir;
	}
	public void setDifferent_commondir(int newDifferent_commondir) {
		different_commondir = newDifferent_commondir;
	}
}
/* Environment */
/*
	 * Path to the git directory.
	 * Cannot be NULL after initialization.
	 */
/*
 * Define a custom repository layout. Any field can be NULL, which
 * will default back to the path according to the default layout.
 */
