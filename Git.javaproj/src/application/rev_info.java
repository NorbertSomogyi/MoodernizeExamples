package application;

/* Only files removed */
/* Mixed changes */
/* revision.c */
public class rev_info {
	private commit_list commits;
	private object_array pending;
	private repository repo;
	private object_array boundary_commits;
	private rev_cmdline_info cmdline;
	private string_list ref_excludes;
	private Object prefix;
	private Object def;
	private pathspec prune_data;
	private int rev_input_given;
	private int read_from_stdin;
	private rev_sort_order sort_order;
	private int early_output;
	private int ignore_missing;
	private int ignore_missing_links;
	private int dense;
	private int prune;
	private int no_walk;
	private int remove_empty_trees;
	private int simplify_history;
	private int topo_order;
	private int simplify_merges;
	private int simplify_by_decoration;
	private int single_worktree;
	private int tag_objects;
	private int tree_objects;
	private int blob_objects;
	private int verify_objects;
	private int edge_hint;
	private int edge_hint_aggressive;
	private int limited;
	private int unpacked;
	private int boundary;
	private int count;
	private int left_right;
	private int left_only;
	private int right_only;
	private int rewrite_parents;
	private int print_parents;
	private int show_decorations;
	private int reverse;
	private int reverse_output_stage;
	private int cherry_pick;
	private int cherry_mark;
	private int bisect;
	private int ancestry_path;
	private int first_parent_only;
	private int line_level_traverse;
	private int tree_blobs_in_commit_order;
	private int do_not_die_on_missing_tree;
	private int exclude_promisor_objects;
	private int diff;
	private int full_diff;
	private int show_root_diff;
	private int no_commit_id;
	private int verbose_header;
	private int ignore_merges;
	private int combine_merges;
	private int combined_all_paths;
	private int dense_combined_merges;
	private int always_show_header;
	private int shown_one;
	private int shown_dashes;
	private int show_merge;
	private int show_notes;
	private int show_notes_given;
	private int show_signature;
	private int pretty_given;
	private int abbrev_commit;
	private int abbrev_commit_given;
	private int zero_commit;
	private int use_terminator;
	private int missing_newline;
	private int date_mode_explicit;
	private int preserve_subject;
	private int disable_stdin;
	private int track_linear;
	private int track_first_time;
	private int linear;
	private date_mode date_mode;
	private int expand_tabs_in_log;
	private int expand_tabs_in_log_default;
	private int abbrev;
	private cmit_fmt commit_format;
	private log_info loginfo;
	private int nr;
	private int total;
	private Object mime_boundary;
	private Object patch_suffix;
	private int numbered_files;
	private int reroll_count;
	private Byte message_id;
	private ident_split from_ident;
	private string_list ref_message_ids;
	private int add_signoff;
	private Object extra_headers;
	private Object log_reencode;
	private Object subject_prefix;
	private int no_inline;
	private int show_log_size;
	private string_list mailmap;
	private grep_opt grep_filter;
	private int invert_grep;
	private git_graph graph;
	private int skip_count;
	private int max_count;
	private Object max_age;
	private Object min_age;
	private int min_parents;
	private int max_parents;
	private Object include_check;
	private Object include_check_data;
	private diff_options diffopt;
	private diff_options pruning;
	private reflog_walk_info reflog_info;
	private decoration children;
	private decoration merge_simplification;
	private decoration treesame;
	private display_notes_opt notes_opt;
	private Object idiff_oid1;
	private Object idiff_oid2;
	private Object idiff_title;
	private Object rdiff1;
	private Object rdiff2;
	private int creation_factor;
	private Object rdiff_title;
	private int count_left;
	private int count_right;
	private int count_same;
	private decoration line_log_data;
	private saved_parents saved_parents_slab;
	private commit_list previous_parents;
	private Object break_bar;
	private revision_sources sources;
	private topo_walk_info topo_walk_info;
	
	public rev_info(commit_list commits, object_array pending, repository repo, object_array boundary_commits, rev_cmdline_info cmdline, string_list ref_excludes, Object prefix, Object def, pathspec prune_data, int rev_input_given, int read_from_stdin, rev_sort_order sort_order, int early_output, int ignore_missing, int ignore_missing_links, int dense, int prune, int no_walk, int remove_empty_trees, int simplify_history, int topo_order, int simplify_merges, int simplify_by_decoration, int single_worktree, int tag_objects, int tree_objects, int blob_objects, int verify_objects, int edge_hint, int edge_hint_aggressive, int limited, int unpacked, int boundary, int count, int left_right, int left_only, int right_only, int rewrite_parents, int print_parents, int show_decorations, int reverse, int reverse_output_stage, int cherry_pick, int cherry_mark, int bisect, int ancestry_path, int first_parent_only, int line_level_traverse, int tree_blobs_in_commit_order, int do_not_die_on_missing_tree, int exclude_promisor_objects, int diff, int full_diff, int show_root_diff, int no_commit_id, int verbose_header, int ignore_merges, int combine_merges, int combined_all_paths, int dense_combined_merges, int always_show_header, int shown_one, int shown_dashes, int show_merge, int show_notes, int show_notes_given, int show_signature, int pretty_given, int abbrev_commit, int abbrev_commit_given, int zero_commit, int use_terminator, int missing_newline, int date_mode_explicit, int preserve_subject, int disable_stdin, int track_linear, int track_first_time, int linear, date_mode date_mode, int expand_tabs_in_log, int expand_tabs_in_log_default, int abbrev, cmit_fmt commit_format, log_info loginfo, int nr, int total, Object mime_boundary, Object patch_suffix, int numbered_files, int reroll_count, Byte message_id, ident_split from_ident, string_list ref_message_ids, int add_signoff, Object extra_headers, Object log_reencode, Object subject_prefix, int no_inline, int show_log_size, string_list mailmap, grep_opt grep_filter, int invert_grep, git_graph graph, int skip_count, int max_count, Object max_age, Object min_age, int min_parents, int max_parents, Object include_check, Object include_check_data, diff_options diffopt, diff_options pruning, reflog_walk_info reflog_info, decoration children, decoration merge_simplification, decoration treesame, display_notes_opt notes_opt, Object idiff_oid1, Object idiff_oid2, Object idiff_title, Object rdiff1, Object rdiff2, int creation_factor, Object rdiff_title, int count_left, int count_right, int count_same, decoration line_log_data, saved_parents saved_parents_slab, commit_list previous_parents, Object break_bar, revision_sources sources, topo_walk_info topo_walk_info) {
		setCommits(commits);
		setPending(pending);
		setRepo(repo);
		setBoundary_commits(boundary_commits);
		setCmdline(cmdline);
		setRef_excludes(ref_excludes);
		setPrefix(prefix);
		setDef(def);
		setPrune_data(prune_data);
		setRev_input_given(rev_input_given);
		setRead_from_stdin(read_from_stdin);
		setSort_order(sort_order);
		setEarly_output(early_output);
		setIgnore_missing(ignore_missing);
		setIgnore_missing_links(ignore_missing_links);
		setDense(dense);
		setPrune(prune);
		setNo_walk(no_walk);
		setRemove_empty_trees(remove_empty_trees);
		setSimplify_history(simplify_history);
		setTopo_order(topo_order);
		setSimplify_merges(simplify_merges);
		setSimplify_by_decoration(simplify_by_decoration);
		setSingle_worktree(single_worktree);
		setTag_objects(tag_objects);
		setTree_objects(tree_objects);
		setBlob_objects(blob_objects);
		setVerify_objects(verify_objects);
		setEdge_hint(edge_hint);
		setEdge_hint_aggressive(edge_hint_aggressive);
		setLimited(limited);
		setUnpacked(unpacked);
		setBoundary(boundary);
		setCount(count);
		setLeft_right(left_right);
		setLeft_only(left_only);
		setRight_only(right_only);
		setRewrite_parents(rewrite_parents);
		setPrint_parents(print_parents);
		setShow_decorations(show_decorations);
		setReverse(reverse);
		setReverse_output_stage(reverse_output_stage);
		setCherry_pick(cherry_pick);
		setCherry_mark(cherry_mark);
		setBisect(bisect);
		setAncestry_path(ancestry_path);
		setFirst_parent_only(first_parent_only);
		setLine_level_traverse(line_level_traverse);
		setTree_blobs_in_commit_order(tree_blobs_in_commit_order);
		setDo_not_die_on_missing_tree(do_not_die_on_missing_tree);
		setExclude_promisor_objects(exclude_promisor_objects);
		setDiff(diff);
		setFull_diff(full_diff);
		setShow_root_diff(show_root_diff);
		setNo_commit_id(no_commit_id);
		setVerbose_header(verbose_header);
		setIgnore_merges(ignore_merges);
		setCombine_merges(combine_merges);
		setCombined_all_paths(combined_all_paths);
		setDense_combined_merges(dense_combined_merges);
		setAlways_show_header(always_show_header);
		setShown_one(shown_one);
		setShown_dashes(shown_dashes);
		setShow_merge(show_merge);
		setShow_notes(show_notes);
		setShow_notes_given(show_notes_given);
		setShow_signature(show_signature);
		setPretty_given(pretty_given);
		setAbbrev_commit(abbrev_commit);
		setAbbrev_commit_given(abbrev_commit_given);
		setZero_commit(zero_commit);
		setUse_terminator(use_terminator);
		setMissing_newline(missing_newline);
		setDate_mode_explicit(date_mode_explicit);
		setPreserve_subject(preserve_subject);
		setDisable_stdin(disable_stdin);
		setTrack_linear(track_linear);
		setTrack_first_time(track_first_time);
		setLinear(linear);
		setDate_mode(date_mode);
		setExpand_tabs_in_log(expand_tabs_in_log);
		setExpand_tabs_in_log_default(expand_tabs_in_log_default);
		setAbbrev(abbrev);
		setCommit_format(commit_format);
		setLoginfo(loginfo);
		setNr(nr);
		setTotal(total);
		setMime_boundary(mime_boundary);
		setPatch_suffix(patch_suffix);
		setNumbered_files(numbered_files);
		setReroll_count(reroll_count);
		setMessage_id(message_id);
		setFrom_ident(from_ident);
		setRef_message_ids(ref_message_ids);
		setAdd_signoff(add_signoff);
		setExtra_headers(extra_headers);
		setLog_reencode(log_reencode);
		setSubject_prefix(subject_prefix);
		setNo_inline(no_inline);
		setShow_log_size(show_log_size);
		setMailmap(mailmap);
		setGrep_filter(grep_filter);
		setInvert_grep(invert_grep);
		setGraph(graph);
		setSkip_count(skip_count);
		setMax_count(max_count);
		setMax_age(max_age);
		setMin_age(min_age);
		setMin_parents(min_parents);
		setMax_parents(max_parents);
		setInclude_check(include_check);
		setInclude_check_data(include_check_data);
		setDiffopt(diffopt);
		setPruning(pruning);
		setReflog_info(reflog_info);
		setChildren(children);
		setMerge_simplification(merge_simplification);
		setTreesame(treesame);
		setNotes_opt(notes_opt);
		setIdiff_oid1(idiff_oid1);
		setIdiff_oid2(idiff_oid2);
		setIdiff_title(idiff_title);
		setRdiff1(rdiff1);
		setRdiff2(rdiff2);
		setCreation_factor(creation_factor);
		setRdiff_title(rdiff_title);
		setCount_left(count_left);
		setCount_right(count_right);
		setCount_same(count_same);
		setLine_log_data(line_log_data);
		setSaved_parents_slab(saved_parents_slab);
		setPrevious_parents(previous_parents);
		setBreak_bar(break_bar);
		setSources(sources);
		setTopo_walk_info(topo_walk_info);
	}
	public rev_info() {
	}
	
	public void bisect_common() {
		if (revs.prepare_revision_walk()) {
			ModernizedCProgram.die("revision walk setup failed");
		} 
		int generatedTree_objects = this.getTree_objects();
		if (generatedTree_objects) {
			revs.mark_edges_uninteresting(((Object)0), 0);
		} 
	}
	public int run_diff_files(int option) {
		int entries;
		int i;
		int generatedMax_count = this.getMax_count();
		int diff_unmerged_stage = generatedMax_count;
		int ce_option = ((option & 2) ? 2 : 0);
		uint64_t start = ModernizedCProgram.getnanotime();
		diff_options generatedDiffopt = this.getDiffopt();
		repository generatedRepo = generatedDiffopt.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		index_state istate = generatedIndex;
		.diff_set_mnemonic_prefix(generatedDiffopt, "i/", "w/");
		if (diff_unmerged_stage < 0) {
			diff_unmerged_stage = 2;
		} 
		int generatedCache_nr = istate.getCache_nr();
		entries = generatedCache_nr;
		cache_entry generatedCache = istate.getCache();
		pathspec generatedPrune_data = this.getPrune_data();
		int generatedCe_flags = (ce).getCe_flags();
		int generatedCe_namelen = (ce).getCe_namelen();
		Object generatedParent = dpath.getParent();
		Byte generatedPath = dpath.getPath();
		Object generatedName = ce.getName();
		object_id generatedOid = dpath.getOid();
		Object generatedSt_mode = st.getSt_mode();
		int generatedCe_mode = nce.getCe_mode();
		int generatedCombine_merges = this.getCombine_merges();
		int generatedDense_combined_merges = this.getDense_combined_merges();
		diff_filespec generatedTwo = pair.getTwo();
		int generatedIta_invisible_in_index = generatedDiffopt.getIta_invisible_in_index();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		int generatedFind_copies_harder = generatedFlags.getFind_copies_harder();
		for (i = 0; i < entries; i++) {
			int oldmode;
			int newmode;
			cache_entry ce = generatedCache[i];
			int changed;
			int dirty_submodule = 0;
			object_id old_oid = new object_id();
			object_id new_oid = new object_id();
			if (.diff_can_quit_early(generatedDiffopt)) {
				break;
			} 
			if (!ModernizedCProgram.ce_path_match(istate, ce, generatedPrune_data, ((Object)0))) {
				continue;
			} 
			if ((((true) & generatedCe_flags) >> 12)) {
				combine_diff_path dpath = new combine_diff_path();
				diff_filepair pair = new diff_filepair();
				int wt_mode = 0;
				int num_compare_stages = 0;
				size_t path_len = new size_t();
				stat st = new stat();
				path_len = (generatedCe_namelen);
				dpath = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(ModernizedCProgram.st_add(ModernizedCProgram.st_add((()), (((path_len)))), ((true))), (ModernizedCProgram.st_mult(, (true)))));
				dpath.setPath((byte)(generatedParent[5]));
				dpath.setNext(((Object)0));
				.memcpy(generatedPath, generatedName, path_len);
				generatedPath[path_len] = (byte)'\0';
				generatedOid.oidclr();
				.memset((generatedParent[0]), 0,  * 5);
				changed = st.check_removed(ce);
				if (!changed) {
					wt_mode = ModernizedCProgram.ce_mode_from_stat(ce, generatedSt_mode);
				} else {
						if (changed < 0) {
							.perror(generatedName);
							continue;
						} 
						wt_mode = 0;
				} 
				dpath.setMode(wt_mode);
				while (i < entries) {
					cache_entry nce = generatedCache[i];
					int stage;
					if (.strcmp(generatedName, generatedName)) {
						break;
					} 
					stage = (((true) & generatedCe_flags) >> 12);
					if (2 <= stage) {
						int mode = generatedCe_mode;
						num_compare_stages++;
						generatedOid.oidcpy(generatedOid);
						generatedParent[stage - 2].setMode(ModernizedCProgram.ce_mode_from_stat(nce, mode));
						generatedParent[stage - 2].setStatus((byte)'M');
					} 
					if (stage == /* diff against the proper unmerged stage */diff_unmerged_stage) {
						ce = nce;
					} 
					i/*
								 * Compensate for loop update
								 */++;
				}
				i--;
				if (generatedCombine_merges && num_compare_stages == 2) {
					ModernizedCProgram.show_combined_diff(dpath, 2, generatedDense_combined_merges, revs);
					ModernizedCProgram.free(dpath);
					continue;
				} 
				do {
					ModernizedCProgram.free(dpath);
					(dpath) = ((Object)0);
				} while (0/*
							 * Show the diff for the 'ce' if we found the one
							 * from the desired stage.
							 */);
				pair = .diff_unmerge(generatedDiffopt, generatedName);
				if (wt_mode) {
					generatedTwo.setMode(wt_mode);
				} 
				if ((((true) & generatedCe_flags) >> 12) != diff_unmerged_stage) {
					continue;
				} 
			} 
			if ((generatedCe_flags & (1 << 18)) || (generatedCe_flags & (1 << 30))) {
				continue;
			} 
			if (generatedCe_flags & (/* If CE_VALID is set, don't look at workdir for file removal */true)) {
				changed = 0;
				newmode = generatedCe_mode;
			} else {
					stat st = new stat();
					changed = st.check_removed(ce);
					if (changed) {
						if (changed < 0) {
							.perror(generatedName);
							continue;
						} 
						.diff_addremove(generatedDiffopt, (byte)'-', generatedCe_mode, generatedOid, !ModernizedCProgram.is_null_oid(generatedOid), generatedName, 0);
						continue;
					}  else if (generatedIta_invisible_in_index && (generatedCe_flags & (1 << 29))) {
						.diff_addremove(generatedDiffopt, (byte)'+', generatedCe_mode, ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree(), 0, generatedName, 0);
						continue;
					} 
					changed = ModernizedCProgram.match_stat_with_submodule(generatedDiffopt, ce, st, ce_option, dirty_submodule);
					newmode = ModernizedCProgram.ce_mode_from_stat(ce, generatedSt_mode);
			} 
			if (!changed && !dirty_submodule) {
				(generatedCe_flags |=  (1 << 18));
				ModernizedCProgram.mark_fsmonitor_valid(istate, ce);
				if (!generatedFind_copies_harder) {
					continue;
				} 
			} 
			oldmode = generatedCe_mode;
			old_oid = generatedOid;
			new_oid = changed ? ModernizedCProgram.null_oid : generatedOid;
			.diff_change(generatedDiffopt, oldmode, newmode, old_oid, new_oid, !ModernizedCProgram.is_null_oid(old_oid), !ModernizedCProgram.is_null_oid(new_oid), generatedName, 0, dirty_submodule);
		}
		.diffcore_std(generatedDiffopt);
		.diff_flush(generatedDiffopt);
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-lib.c", 251, ModernizedCProgram.getnanotime() - (start), "diff-files");
			} 
		} while (0);
		return 0/*
		 * diff-index
		 */;
	}
	/* A file entry went away or appeared */
	public void diff_index_show_file(Object prefix, Object ce, Object oid, int oid_valid, int mode, int dirty_submodule) {
		diff_options generatedDiffopt = this.getDiffopt();
		.diff_addremove(generatedDiffopt, prefix[0], mode, oid, oid_valid, ce.getName(), dirty_submodule);
	}
	public void show_new_file(Object new_file, int cached, int match_missing) {
		object_id oid = new object_id();
		int mode;
		int dirty_submodule = 0/*
			 * New file in the index: it might actually be different in
			 * the working tree.
			 */;
		diff_options generatedDiffopt = this.getDiffopt();
		if (generatedDiffopt.get_stat_data(new_file, oid, mode, cached, match_missing, dirty_submodule) < 0) {
			return ;
		} 
		revs.diff_index_show_file("+", new_file, oid, !ModernizedCProgram.is_null_oid(oid), mode, dirty_submodule);
	}
	public int show_modified(Object old_entry, Object new_entry, int report_missing, int cached, int match_missing) {
		int mode;
		int oldmode;
		object_id oid = new object_id();
		int dirty_submodule = 0;
		diff_options generatedDiffopt = this.getDiffopt();
		if (generatedDiffopt.get_stat_data(new_entry, oid, mode, cached, match_missing, dirty_submodule) < 0) {
			if (report_missing) {
				revs.diff_index_show_file("-", old_entry, old_entry.getOid(), 1, old_entry.getCe_mode(), 0);
			} 
			return -1;
		} 
		int generatedCombine_merges = this.getCombine_merges();
		Object generatedParent = p.getParent();
		Byte generatedPath = p.getPath();
		object_id generatedOid = p.getOid();
		int generatedDense_combined_merges = this.getDense_combined_merges();
		if (generatedCombine_merges && !cached && (!ModernizedCProgram.oideq(oid, old_entry.getOid()) || !ModernizedCProgram.oideq(old_entry.getOid(), new_entry.getOid()))) {
			combine_diff_path p = new combine_diff_path();
			int pathlen = ((new_entry).getCe_namelen());
			p = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(ModernizedCProgram.st_add(ModernizedCProgram.st_add((()), (((pathlen)))), ((true))), (ModernizedCProgram.st_mult(, (true)))));
			p.setPath((byte)generatedParent[2]);
			p.setNext(((Object)0));
			.memcpy(generatedPath, new_entry.getName(), pathlen);
			generatedPath[pathlen] = 0;
			p.setMode(mode);
			generatedOid.oidclr();
			.memset(generatedParent, 0, 2 * );
			generatedParent[0].setStatus((byte)'M');
			generatedParent[0].setMode(new_entry.getCe_mode());
			generatedOid.oidcpy(generatedOid);
			generatedParent[1].setStatus((byte)'M');
			generatedParent[1].setMode(old_entry.getCe_mode());
			generatedOid.oidcpy(generatedOid);
			ModernizedCProgram.show_combined_diff(p, 2, generatedDense_combined_merges, revs);
			ModernizedCProgram.free(p);
			return 0;
		} 
		oldmode = old_entry.getCe_mode();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		int generatedFind_copies_harder = generatedFlags.getFind_copies_harder();
		if (mode == oldmode && ModernizedCProgram.oideq(oid, generatedOid) && !dirty_submodule && !generatedFind_copies_harder) {
			return 0;
		} 
		.diff_change(generatedDiffopt, oldmode, mode, generatedOid, oid, 1, !ModernizedCProgram.is_null_oid(oid), old_entry.getName(), 0, dirty_submodule);
		return 0/*
		 * This gets a mix of an existing index and a tree, one pathname entry
		 * at a time. The index entry may be a single stage-0 one, but it could
		 * also be multiple unmerged entries (in which case idx_pos/idx_nr will
		 * give you the position and number of entries in the index).
		 */;
	}
	public int diff_cache(Object tree_oid, Object tree_name, int cached) {
		tree tree = new tree();
		tree_desc t = new tree_desc();
		unpack_trees_options opts = new unpack_trees_options();
		tree tree = new tree();
		tree = tree.parse_tree_indirect(tree_oid);
		if (!tree) {
			return ();
		} 
		.memset(opts, 0, );
		opts.setHead_idx(1);
		opts.setIndex_only(cached);
		diff_options generatedDiffopt = this.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		int generatedFind_copies_harder = generatedFlags.getFind_copies_harder();
		opts.setDiff_index_cached((cached && !generatedFind_copies_harder));
		opts.setMerge(1);
		opts.setFn(oneway_diff);
		opts.setUnpack_data(revs);
		repository generatedRepo = generatedDiffopt.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		opts.setSrc_index(generatedIndex);
		opts.setDst_index(((Object)0));
		pathspec generatedPathspec = generatedDiffopt.getPathspec();
		opts.setPathspec(generatedPathspec);
		generatedPathspec.setRecursive(1);
		Object generatedBuffer = tree.getBuffer();
		Object generatedSize = tree.getSize();
		t.init_tree_desc(generatedBuffer, generatedSize);
		return ModernizedCProgram.unpack_trees(1, t, opts);
	}
	public int run_diff_index(int cached) {
		object_array_entry ent = new object_array_entry();
		object_array generatedPending = this.getPending();
		int generatedNr = generatedPending.getNr();
		if (generatedNr != 1) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-lib.c", 526, "run_diff_index must be passed exactly one tree");
		} 
		ModernizedCProgram.trace_performance_enter();
		object_array_entry generatedObjects = generatedPending.getObjects();
		ent = generatedObjects;
		object generatedItem = ent.getItem();
		object_id generatedOid = generatedItem.getOid();
		Byte generatedName = ent.getName();
		if (revs.diff_cache(generatedOid, generatedName, cached)) {
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-lib.c", 531, (true)));
		} 
		diff_options generatedDiffopt = this.getDiffopt();
		.diff_set_mnemonic_prefix(generatedDiffopt, "c/", cached ? "i/" : "w/");
		.diffcore_fix_diff_index();
		.diffcore_std(generatedDiffopt);
		.diff_flush(generatedDiffopt);
		do {
			if (ModernizedCProgram.trace_perf_key.trace_pass_fl()) {
				ModernizedCProgram.trace_performance_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-lib.c", 537, ModernizedCProgram.getnanotime(), "diff-index");
			} 
		} while (0);
		return 0;
	}
	public void show_interdiff(int indent) {
		diff_options opts = new diff_options();
		strbuf prefix = new strbuf(, , );
		diff_options generatedDiffopt = this.getDiffopt();
		.memcpy(opts, generatedDiffopt, );
		opts.setOutput_format(-1024);
		opts.setOutput_prefix(idiff_prefix_cb);
		prefix.strbuf_addchars((byte)' ', indent);
		opts.setOutput_prefix_data(prefix);
		.diff_setup_done(opts);
		Object generatedIdiff_oid1 = this.getIdiff_oid1();
		Object generatedIdiff_oid2 = this.getIdiff_oid2();
		opts.diff_tree_oid(generatedIdiff_oid1, generatedIdiff_oid2, "");
		.diffcore_std(opts);
		.diff_flush(opts);
		prefix.strbuf_release();
	}
	public void show_sig_lines(int status, Object bol) {
		byte color;
		byte reset;
		byte eol;
		diff_options generatedDiffopt = this.getDiffopt();
		int generatedUse_color = (generatedDiffopt).getUse_color();
		color = .diff_get_color(generatedUse_color, status ? color_diff.DIFF_WHITESPACE : color_diff.DIFF_FRAGINFO);
		reset = .diff_get_color(generatedUse_color, color_diff.DIFF_RESET);
		_iobuf generatedFile = generatedDiffopt.getFile();
		git_graph generatedGraph = this.getGraph();
		while (bol) {
			eol = ModernizedCProgram.gitstrchrnul(bol, (byte)'\n');
			.fprintf(generatedFile, "%s%.*s%s%s", color, (int)(eol - bol), bol, reset, eol ? "\n" : "");
			generatedGraph.graph_show_oneline();
			bol = (eol) ? (eol + 1) : eol;
		}
	}
	public void show_log() {
		strbuf msgbuf = new strbuf(, , );
		log_info generatedLoginfo = this.getLoginfo();
		log_info log = generatedLoginfo;
		commit generatedCommit = log.getCommit();
		commit generatedParent = log.getParent();
		commit commit = generatedCommit;
		commit parent = generatedParent;
		int generatedAbbrev_commit = this.getAbbrev_commit();
		int generatedAbbrev = this.getAbbrev();
		int abbrev_commit = generatedAbbrev_commit ? generatedAbbrev : ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		Object generatedExtra_headers = this.getExtra_headers();
		byte extra_headers = generatedExtra_headers;
		pretty_print_context ctx = new pretty_print_context(0);
		this.setLoginfo(((Object)0));
		int generatedVerbose_header = this.getVerbose_header();
		git_graph generatedGraph = this.getGraph();
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		diff_options generatedDiffopt = this.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		int generatedPrint_parents = this.getPrint_parents();
		decoration generatedChildren = this.getChildren();
		Object generatedName = generatedChildren.getName();
		int generatedLine_termination = generatedDiffopt.getLine_termination();
		if (!generatedVerbose_header) {
			generatedGraph.graph_show_commit();
			if (!generatedGraph) {
				ModernizedCProgram.put_revision_mark(opt, commit);
			} 
			.fputs(ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedOid, abbrev_commit), generatedFile);
			if (generatedPrint_parents) {
				ModernizedCProgram.show_parents(commit, abbrev_commit, generatedFile);
			} 
			if (generatedName) {
				ModernizedCProgram.show_children(opt, commit, abbrev_commit);
			} 
			ModernizedCProgram.show_decorations(opt, commit);
			if (generatedGraph && !ModernizedCProgram.graph_is_commit_finished(generatedGraph)) {
				.putc((byte)'\n', generatedFile);
				generatedGraph.graph_show_remainder();
			} 
			.putc(generatedLine_termination, generatedFile);
			return ;
		} 
		int generatedShown_one = this.getShown_one();
		int generatedUse_terminator = this.getUse_terminator();
		int generatedMissing_newline = this.getMissing_newline();
		if (generatedShown_one && !generatedUse_terminator) {
			if (generatedLine_termination == (byte)'\n' && !generatedMissing_newline) {
				generatedGraph.graph_show_padding();
			} 
			.putc(generatedLine_termination, generatedFile);
		} 
		this.setShown_one(1/*
			 * If the history graph was requested,
			 * print the graph, up to this commit's line
			 */);
		generatedGraph.graph_show_commit();
		cmit_fmt generatedCommit_format = this.getCommit_format();
		int generatedNeed_8bit_cte = ctx.getNeed_8bit_cte();
		int generatedUse_color = (generatedDiffopt).getUse_color();
		reflog_walk_info generatedReflog_info = this.getReflog_info();
		date_mode generatedDate_mode = this.getDate_mode();
		int generatedDate_mode_explicit = this.getDate_mode_explicit();
		if (ModernizedCProgram.cmit_fmt_is_mail(generatedCommit_format)) {
			ModernizedCProgram.log_write_email_headers(opt, commit, extra_headers, generatedNeed_8bit_cte, 1);
			ctx.setRev(opt);
			ctx.setPrint_email_subject(1);
		}  else if (generatedCommit_format != cmit_fmt.CMIT_FMT_USERFORMAT) {
			.fputs(.diff_get_color(generatedUse_color, color_diff.DIFF_COMMIT), generatedFile);
			if (generatedCommit_format != cmit_fmt.CMIT_FMT_ONELINE) {
				.fputs("commit ", generatedFile);
			} 
			if (!generatedGraph) {
				ModernizedCProgram.put_revision_mark(opt, commit);
			} 
			.fputs(ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedOid, abbrev_commit), generatedFile);
			if (generatedPrint_parents) {
				ModernizedCProgram.show_parents(commit, abbrev_commit, generatedFile);
			} 
			if (generatedName) {
				ModernizedCProgram.show_children(opt, commit, abbrev_commit);
			} 
			if (parent) {
				.fprintf(generatedFile, " (from %s)", ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedOid, abbrev_commit));
			} 
			.fputs(.diff_get_color(generatedUse_color, color_diff.DIFF_RESET), generatedFile);
			ModernizedCProgram.show_decorations(opt, commit);
			if (generatedCommit_format == cmit_fmt.CMIT_FMT_ONELINE) {
				.putc((byte)' ', generatedFile);
			} else {
					.putc((byte)'\n', generatedFile);
					generatedGraph.graph_show_oneline();
			} 
			if (generatedReflog_info) {
				generatedReflog_info.show_reflog_message(generatedCommit_format == cmit_fmt.CMIT_FMT_ONELINE, generatedDate_mode, generatedDate_mode_explicit);
				if (generatedCommit_format == cmit_fmt.CMIT_FMT_ONELINE) {
					return ;
				} 
			} 
		} 
		int generatedShow_signature = this.getShow_signature();
		if (generatedShow_signature) {
			ModernizedCProgram.show_signature(opt, commit);
			ModernizedCProgram.show_mergetag(opt, commit);
		} 
		int generatedShow_notes = this.getShow_notes();
		if (generatedShow_notes) {
			int raw;
			strbuf notebuf = new strbuf(, , );
			raw = (generatedCommit_format == cmit_fmt.CMIT_FMT_USERFORMAT);
			.format_display_notes(generatedOid, notebuf, ModernizedCProgram.get_log_output_encoding(), raw);
			ctx.setNotes_message(notebuf.strbuf_detach(((Object)0)));
		} 
		int generatedAdd_signoff = this.getAdd_signoff();
		if (generatedNeed_8bit_cte >= 0 && generatedAdd_signoff) {
			ctx.setNeed_8bit_cte(ModernizedCProgram.has_non_ascii(ModernizedCProgram.fmt_name(want_ident.WANT_COMMITTER_IDENT)));
		} 
		ctx.setDate_mode(generatedDate_mode);
		ctx.setDate_mode_explicit(generatedDate_mode_explicit);
		ctx.setAbbrev(generatedAbbrev);
		ctx.setAfter_subject(extra_headers);
		int generatedPreserve_subject = this.getPreserve_subject();
		ctx.setPreserve_subject(generatedPreserve_subject);
		ctx.setReflog_info(generatedReflog_info);
		ctx.setFmt(generatedCommit_format);
		string_list generatedMailmap = this.getMailmap();
		ctx.setMailmap(generatedMailmap);
		ctx.setColor(generatedUse_color);
		int generatedExpand_tabs_in_log = this.getExpand_tabs_in_log();
		ctx.setExpand_tabs_in_log(generatedExpand_tabs_in_log);
		ctx.setOutput_encoding(ModernizedCProgram.get_log_output_encoding());
		ctx.setRev(opt);
		ident_split generatedFrom_ident = this.getFrom_ident();
		Object generatedMail_begin = generatedFrom_ident.getMail_begin();
		Object generatedName_begin = generatedFrom_ident.getName_begin();
		if (generatedMail_begin && generatedName_begin) {
			ctx.setFrom_ident(generatedFrom_ident);
		} 
		if (generatedGraph) {
			ctx.setGraph_width(generatedGraph.graph_width());
		} 
		ModernizedCProgram.pretty_print_commit(ctx, commit, msgbuf);
		if (generatedAdd_signoff) {
			msgbuf.append_signoff(0, (-1024 << 0));
		} 
		cmit_fmt generatedFmt = ctx.getFmt();
		byte generatedNotes_message = ctx.getNotes_message();
		if ((generatedFmt != cmit_fmt.CMIT_FMT_USERFORMAT) && generatedNotes_message && generatedNotes_message) {
			if (ModernizedCProgram.cmit_fmt_is_mail(generatedFmt)) {
				ModernizedCProgram.next_commentary_block(opt, msgbuf);
			} 
			msgbuf.strbuf_addstr(generatedNotes_message);
		} 
		int generatedShow_log_size = this.getShow_log_size();
		Object generatedLen = msgbuf.getLen();
		if (generatedShow_log_size) {
			.fprintf(generatedFile, "log size %i\n", (int)generatedLen);
			generatedGraph.graph_show_oneline();
		} 
		byte generatedBuf = msgbuf.getBuf();
		if (!generatedLen || generatedBuf[generatedLen - 1] != (byte)'\n') {
			this.setMissing_newline(1);
		} else {
				this.setMissing_newline(0);
		} 
		ModernizedCProgram.graph_show_commit_msg(generatedGraph, generatedFile, msgbuf);
		if (generatedUse_terminator && !ModernizedCProgram.commit_format_is_empty(generatedCommit_format)) {
			if (!generatedMissing_newline) {
				generatedGraph.graph_show_padding();
			} 
			.putc(generatedLine_termination, generatedFile);
		} 
		msgbuf.strbuf_release();
		ModernizedCProgram.free(generatedNotes_message);
		Object generatedIdiff_oid1 = this.getIdiff_oid1();
		Object generatedIdiff_title = this.getIdiff_title();
		if (ModernizedCProgram.cmit_fmt_is_mail(generatedFmt) && generatedIdiff_oid1) {
			diff_queue_struct dq = new diff_queue_struct();
			.memcpy(dq, ModernizedCProgram.diff_queued_diff, );
			do {
				(ModernizedCProgram.diff_queued_diff).setQueue(((Object)0));
				(ModernizedCProgram.diff_queued_diff).setNr((ModernizedCProgram.diff_queued_diff).setAlloc(0));
			} while (0);
			ModernizedCProgram.next_commentary_block(opt, ((Object)0));
			generatedFile.fprintf_ln("%s", generatedIdiff_title);
			opt.show_interdiff(2);
			.memcpy(ModernizedCProgram.diff_queued_diff, dq, );
		} 
		Object generatedRdiff1 = this.getRdiff1();
		Object generatedRdiff_title = this.getRdiff_title();
		Object generatedRdiff2 = this.getRdiff2();
		int generatedCreation_factor = this.getCreation_factor();
		if (ModernizedCProgram.cmit_fmt_is_mail(generatedFmt) && generatedRdiff1) {
			diff_queue_struct dq = new diff_queue_struct();
			diff_options opts = new diff_options();
			.memcpy(dq, ModernizedCProgram.diff_queued_diff, );
			do {
				(ModernizedCProgram.diff_queued_diff).setQueue(((Object)0));
				(ModernizedCProgram.diff_queued_diff).setNr((ModernizedCProgram.diff_queued_diff).setAlloc(0));
			} while (0);
			ModernizedCProgram.next_commentary_block(opt, ((Object)0));
			generatedFile.fprintf_ln("%s", generatedRdiff_title);
			.repo_diff_setup(ModernizedCProgram.the_repository, opts);
			opts.setFile(generatedFile);
			opts.setUse_color(generatedUse_color);
			.diff_setup_done(opts);
			.show_range_diff(generatedRdiff1, generatedRdiff2, generatedCreation_factor, 1, opts);
			.memcpy(ModernizedCProgram.diff_queued_diff, dq, );
		} 
	}
	public int log_tree_diff_flush() {
		this.setShown_dashes(0);
		diff_options generatedDiffopt = this.getDiffopt();
		.diffcore_std(generatedDiffopt);
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		if (.diff_queue_is_empty()) {
			int saved_fmt = generatedOutput_format;
			generatedDiffopt.setOutput_format(-1024);
			.diff_flush(generatedDiffopt);
			generatedDiffopt.setOutput_format(saved_fmt);
			return 0;
		} 
		log_info generatedLoginfo = this.getLoginfo();
		int generatedNo_commit_id = this.getNo_commit_id();
		int generatedVerbose_header = this.getVerbose_header();
		cmit_fmt generatedCommit_format = this.getCommit_format();
		Object generatedOutput_prefix = generatedDiffopt.getOutput_prefix();
		Object generatedOutput_prefix_data = generatedDiffopt.getOutput_prefix_data();
		_iobuf generatedFile = generatedDiffopt.getFile();
		int generatedShown_dashes = this.getShown_dashes();
		if (generatedLoginfo && !generatedNo_commit_id) {
			opt.show_log();
			if ((generatedOutput_format & ~-1024) && generatedVerbose_header && generatedCommit_format != cmit_fmt.CMIT_FMT_ONELINE && !ModernizedCProgram.commit_format_is_empty(generatedCommit_format)) {
				int pch = -1024 | -1024;
				if (generatedOutput_prefix) {
					strbuf msg = ((Object)0);
					ModernizedCProgram.msg = .UNRECOGNIZEDFUNCTIONNAME(generatedDiffopt, generatedOutput_prefix_data);
					.fwrite(ModernizedCProgram.msg.getBuf(), ModernizedCProgram.msg.getLen(), 1, generatedFile);
				} 
				if (!generatedShown_dashes && (pch & generatedOutput_format) == pch) {
					.fprintf(generatedFile, "---");
				} 
				.putc((byte)'\n', generatedFile);
			} 
		} 
		.diff_flush(generatedDiffopt);
		return 1;
	}
	public int builtin_diff_index(int argc, Object argv) {
		int cached = 0;
		while (1 < argc) {
			byte arg = argv[1];
			if (!.strcmp(arg, "--cached") || !.strcmp(arg, "--staged")) {
				cached = 1;
			} else {
					ModernizedCProgram.usage(ModernizedCProgram.builtin_diff_usage);
			} 
			argv++;
			argc/*
				 * Make sure there is one revision (i.e. pending object),
				 * and there is no revision filtering parameters.
				 */--;
		}
		object_array generatedPending = this.getPending();
		int generatedNr = generatedPending.getNr();
		int generatedMax_count = this.getMax_count();
		Object generatedMin_age = this.getMin_age();
		Object generatedMax_age = this.getMax_age();
		if (generatedNr != 1 || generatedMax_count != -1 || generatedMin_age != -1 || generatedMax_age != -1) {
			ModernizedCProgram.usage(ModernizedCProgram.builtin_diff_usage);
		} 
		diff_options generatedDiffopt = this.getDiffopt();
		pathspec generatedPathspec = generatedDiffopt.getPathspec();
		if (!cached) {
			ModernizedCProgram.setup_work_tree();
			if (ModernizedCProgram.the_repository.repo_read_index_preload((generatedPathspec), 0) < 0) {
				.perror("read_cache_preload");
				return -1;
			} 
		}  else if (ModernizedCProgram.the_repository.repo_read_index() < 0) {
			.perror("read_cache");
			return -1;
		} 
		return revs.run_diff_index(cached);
	}
	public int builtin_diff_files(int argc, Object argv) {
		int options = 0;
		while (1 < argc && argv[1][0] == (byte)'-') {
			if (!.strcmp(argv[1], "--base")) {
				this.setMax_count(1);
			}  else if (!.strcmp(argv[1], "--ours")) {
				this.setMax_count(2);
			}  else if (!.strcmp(argv[1], "--theirs")) {
				this.setMax_count(3);
			}  else if (!.strcmp(argv[1], "-q")) {
				options |=  1;
			}  else if (!.strcmp(argv[1], "-h")) {
				ModernizedCProgram.usage(ModernizedCProgram.builtin_diff_usage);
			} else {
					return ();
			} 
			argv++;
			argc/*
				 * "diff --base" should not combine merges because it was not
				 * asked to.  "diff -c" should not densify (if the user wants
				 * dense one, --cc can be explicitly asked for, or just rely
				 * on the default).
				 */--;
		}
		int generatedMax_count = this.getMax_count();
		int generatedCombine_merges = this.getCombine_merges();
		diff_options generatedDiffopt = this.getDiffopt();
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		if (generatedMax_count == -1 && !generatedCombine_merges && (generatedOutput_format & -1024)) {
			this.setCombine_merges(this.setDense_combined_merges(1));
		} 
		ModernizedCProgram.setup_work_tree();
		pathspec generatedPathspec = generatedDiffopt.getPathspec();
		if (ModernizedCProgram.the_repository.repo_read_index_preload((generatedPathspec), 0) < 0) {
			.perror("read_cache_preload");
			return -1;
		} 
		return revs.run_diff_files(options);
	}
	public int get_object_list_from_bitmap() {
		bitmap_index bitmap_index = new bitmap_index();
		if (!(ModernizedCProgram.bitmap_git = bitmap_index.prepare_bitmap_walk(revs))) {
			return -1;
		} 
		if (ModernizedCProgram.pack_options_allow_reuse() && !ModernizedCProgram.reuse_partial_packfile_from_bitmap(ModernizedCProgram.bitmap_git, ModernizedCProgram.reuse_packfile, ModernizedCProgram.reuse_packfile_objects, ModernizedCProgram.reuse_packfile_offset)) {
			((ModernizedCProgram.reuse_packfile_objects) ? (Object)0 : ._assert("reuse_packfile_objects", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pack-objects.c", 3052));
			ModernizedCProgram.nr_result += ModernizedCProgram.reuse_packfile_objects;
			ModernizedCProgram.progress_state.display_progress(ModernizedCProgram.nr_result);
		} 
		ModernizedCProgram.bitmap_git.traverse_bitmap_commit_list(add_object_entry_from_bitmap);
		return 0;
	}
	public int line_log_filter() {
		commit commit = new commit();
		commit_list generatedCommits = this.getCommits();
		commit_list list = generatedCommits;
		commit_list out = ((Object)0);
		commit_list pp = out;
		commit generatedItem = list.getItem();
		commit_list generatedNext = list.getNext();
		while (list) {
			commit_list to_free = ((Object)0);
			commit = generatedItem;
			if (ModernizedCProgram.process_ranges_arbitrary_commit(rev, commit)) {
				pp = list;
				pp = generatedNext;
			} else {
					to_free = list;
			} 
			list = generatedNext;
			ModernizedCProgram.free(to_free);
		}
		pp = ((Object)0);
		for (list = out; list; list = generatedNext) {
			ModernizedCProgram.rewrite_parents(rev, generatedItem, line_log_rewrite_one);
		}
		this.setCommits(out);
		return 0;
	}
	public void cmd_log_init_defaults() {
		if (ModernizedCProgram.fmt_pretty) {
			rev.get_commit_format(ModernizedCProgram.fmt_pretty);
		} 
		diff_options generatedDiffopt = this.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		if (ModernizedCProgram.default_follow) {
			generatedFlags.setDefault_follow_renames(1);
		} 
		this.setVerbose_header(1);
		generatedFlags.setRecursive(1);
		generatedDiffopt.setStat_width(-/* use full terminal width */1);
		generatedDiffopt.setStat_graph_width(-/* respect statGraphWidth config */1);
		this.setAbbrev_commit(ModernizedCProgram.default_abbrev_commit);
		this.setShow_root_diff(ModernizedCProgram.default_show_root);
		this.setSubject_prefix(ModernizedCProgram.fmt_patch_subject_prefix);
		this.setShow_signature(ModernizedCProgram.default_show_signature);
		generatedFlags.setAllow_textconv(1);
		date_mode generatedDate_mode = this.getDate_mode();
		if (ModernizedCProgram.default_date_mode) {
			generatedDate_mode.parse_date_format(ModernizedCProgram.default_date_mode);
		} 
	}
	public void show_early_header(Object stage, int nr) {
		int generatedShown_one = this.getShown_one();
		cmit_fmt generatedCommit_format = this.getCommit_format();
		diff_options generatedDiffopt = this.getDiffopt();
		int generatedLine_termination = generatedDiffopt.getLine_termination();
		if (generatedShown_one) {
			this.setShown_one(0);
			if (generatedCommit_format != cmit_fmt.CMIT_FMT_ONELINE) {
				.putchar(generatedLine_termination);
			} 
		} 
		_iobuf generatedFile = generatedDiffopt.getFile();
		.fprintf(generatedFile, ModernizedCProgram._("Final output: %d %s\n"), nr, stage);
	}
	public void finish_early_output() {
		commit_list generatedCommits = this.getCommits();
		int n = generatedCommits.estimate_commit_count();
		.signal(SIGALRM, ((__p_sig_fn_t)1));
		rev.show_early_header("done", n);
	}
	public int cmd_log_walk() {
		commit commit = new commit();
		int saved_nrl = 0;
		diff_options generatedDiffopt = this.getDiffopt();
		int generatedClose_file = generatedDiffopt.getClose_file();
		int saved_dcctc = 0;
		int close_file = generatedClose_file;
		int generatedEarly_output = this.getEarly_output();
		if (generatedEarly_output) {
			ModernizedCProgram.setup_early_output();
		} 
		if (rev.prepare_revision_walk()) {
			ModernizedCProgram.die(ModernizedCProgram._("revision walk setup failed"));
		} 
		if (generatedEarly_output) {
			rev/*
				 * For --check and --exit-code, the exit code is based on CHECK_FAILED
				 * and HAS_CHANGES being accumulated in rev->diffopt, so be careful to
				 * retain that state information if replacing rev->diffopt in this loop
				 */.finish_early_output();
		} 
		generatedDiffopt.setClose_file(0);
		commit commit = new commit();
		int generatedMax_count = this.getMax_count();
		reflog_walk_info generatedReflog_info = this.getReflog_info();
		commit_list generatedParents = commit.getParents();
		int generatedNeeded_rename_limit = generatedDiffopt.getNeeded_rename_limit();
		int generatedDegraded_cc_to_c = generatedDiffopt.getDegraded_cc_to_c();
		while ((commit = commit.get_revision(rev)) != ((Object)0)) {
			if (!ModernizedCProgram.log_tree_commit(rev, commit) && generatedMax_count >= 0/*
						 * We decremented max_count in get_revision,
						 * but we didn't actually show the commit.
						 */) {
				generatedMax_count++;
			} 
			if (!generatedReflog_info) {
				.free_commit_buffer(ModernizedCProgram.the_repository.getParsed_objects(), commit);
				.free_commit_list(generatedParents);
				commit.setParents(((Object)0));
			} 
			if (saved_nrl < generatedNeeded_rename_limit) {
				saved_nrl = generatedNeeded_rename_limit;
			} 
			if (generatedDegraded_cc_to_c) {
				saved_dcctc = 1;
			} 
		}
		generatedDiffopt.setDegraded_cc_to_c(saved_dcctc);
		generatedDiffopt.setNeeded_rename_limit(saved_nrl);
		_iobuf generatedFile = generatedDiffopt.getFile();
		if (close_file) {
			.fclose(generatedFile);
		} 
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		int generatedCheck_failed = generatedFlags.getCheck_failed();
		if (generatedOutput_format & -1024 && generatedCheck_failed) {
			return 2;
		} 
		return .diff_result_code(generatedDiffopt, 0);
	}
	public void show_tagger(Object buf) {
		strbuf out = new strbuf(, , );
		pretty_print_context pp = new pretty_print_context(0);
		cmit_fmt generatedCommit_format = this.getCommit_format();
		pp.setFmt(generatedCommit_format);
		date_mode generatedDate_mode = this.getDate_mode();
		pp.setDate_mode(generatedDate_mode);
		ModernizedCProgram.pp_user_info(pp, "Tagger", out, buf, ModernizedCProgram.get_log_output_encoding());
		diff_options generatedDiffopt = this.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		byte generatedBuf = out.getBuf();
		.fprintf(generatedFile, "%s", generatedBuf);
		out.strbuf_release();
	}
	public int show_blob_object(Object oid, Object obj_name) {
		object_id oidc = new object_id();
		object_context obj_context = new object_context();
		byte buf;
		long size;
		diff_options generatedDiffopt = this.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		.fflush(generatedFile);
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		int generatedTextconv_set_via_cmdline = generatedFlags.getTextconv_set_via_cmdline();
		int generatedAllow_textconv = generatedFlags.getAllow_textconv();
		if (!generatedTextconv_set_via_cmdline || !generatedAllow_textconv) {
			return ((Object)0).stream_blob_to_fd(1, oid, 0);
		} 
		if (ModernizedCProgram.get_oid_with_context(ModernizedCProgram.the_repository, obj_name, 200, oidc, obj_context)) {
			ModernizedCProgram.die(ModernizedCProgram._("not a valid object name %s"), obj_name);
		} 
		Byte generatedPath = obj_context.getPath();
		int generatedMode = obj_context.getMode();
		if (!generatedPath || !.textconv_object(ModernizedCProgram.the_repository, generatedPath, generatedMode, oidc, 1, buf, size)) {
			ModernizedCProgram.free(generatedPath);
			return ((Object)0).stream_blob_to_fd(1, oid, 0);
		} 
		if (!buf) {
			ModernizedCProgram.die(ModernizedCProgram._("git show %s: bad file"), obj_name);
		} 
		ModernizedCProgram.write_or_die(1, buf, size);
		ModernizedCProgram.free(generatedPath);
		return 0;
	}
	public int show_tag_object(Object oid) {
		long size;
		object_type type;
		byte buf = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, size);
		int offset = 0;
		if (!buf) {
			return ();
		} 
		((object_type.type == object_type.OBJ_TAG) ? (Object)0 : ._assert("type == OBJ_TAG", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\log.c", 551));
		while (offset < size && buf[offset] != (byte)'\n') {
			int new_offset = offset + 1;
			byte ident;
			while (new_offset < size && buf[new_offset++] != (byte)'\n') {
				;
			}
			if (ModernizedCProgram.skip_prefix(buf + offset, "tagger ", ident)) {
				rev.show_tagger(ident);
			} 
			offset = new_offset;
		}
		diff_options generatedDiffopt = this.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		if (offset < size) {
			.fwrite(buf + offset, size - offset, 1, generatedFile);
		} 
		ModernizedCProgram.free(buf);
		return 0;
	}
	public void gen_message_id(Byte base) {
		strbuf buf = new strbuf(, , );
		buf.strbuf_addf("%s.%llu.git.%s", base, (timestamp_t).time(((Object)0)), ModernizedCProgram.git_committer_info(4 | 2 | 1));
		this.setMessage_id(buf.strbuf_detach(((Object)0)));
	}
	public Byte find_branch_name() {
		int i;
		int positive = -1;
		object_id branch_oid = new object_id();
		object_id tip_oid = new object_id();
		byte ref;
		byte v;
		byte full_ref;
		byte branch = ((Object)0);
		rev_cmdline_info generatedCmdline = this.getCmdline();
		int generatedNr = generatedCmdline.getNr();
		rev_cmdline_entry generatedRev = generatedCmdline.getRev();
		for (i = 0; i < generatedNr; i++) {
			if (generatedRev[i].getFlags() & (-1024 << 1)) {
				continue;
			} 
			if (positive < 0) {
				positive = i;
			} else {
					return ((Object)0);
			} 
		}
		if (positive < 0) {
			return ((Object)0);
		} 
		ref = generatedRev[positive].getName();
		tip_oid = generatedRev[positive].getItem().getOid();
		if (branch_oid.dwim_ref(ref, .strlen(ref), full_ref) && ModernizedCProgram.skip_prefix(full_ref, "refs/heads/", v) && ModernizedCProgram.oideq(tip_oid, branch_oid)) {
			branch = ModernizedCProgram.xstrdup(v);
		} 
		ModernizedCProgram.free(full_ref);
		return branch;
	}
	public int add_pending_commit(Object arg, int flags) {
		object_id oid = new object_id();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, arg, oid) == 0) {
			commit commit = .lookup_commit_reference(ModernizedCProgram.the_repository, oid);
			if (commit) {
				generatedFlags |=  flags;
				ModernizedCProgram.add_pending_object(revs, generatedObject, arg);
				return 0;
			} 
		} 
		return -1;
	}
	public void perform_reachability_traversal() {
		int initialized;
		progress progress = ((Object)0);
		if (initialized) {
			return ;
		} 
		progress progress = new progress();
		if (ModernizedCProgram.show_progress) {
			progress = progress.start_delayed_progress(ModernizedCProgram._("Checking connectivity"), 0);
		} 
		ModernizedCProgram.mark_reachable_objects(revs, 1, ModernizedCProgram.expire, progress);
		progress.stop_progress();
		initialized = 1;
	}
	public int is_object_reachable(Object oid) {
		object obj = new object();
		revs.perform_reachability_traversal();
		object object = new object();
		obj = object.lookup_object(ModernizedCProgram.the_repository, oid);
		int generatedFlags = obj.getFlags();
		return obj && (generatedFlags & (-1024 << 0));
	}
	public int add_unseen_recent_objects_to_traversal(Object timestamp) {
		recent_data data = new recent_data();
		int r;
		data.setRevs(revs);
		data.setTimestamp(timestamp);
		r = ModernizedCProgram.for_each_loose_object(add_recent_loose, data, for_each_object_flags.FOR_EACH_OBJECT_LOCAL_ONLY);
		if (r) {
			return r;
		} 
		return ModernizedCProgram.for_each_packed_object(add_recent_packed, data, for_each_object_flags.FOR_EACH_OBJECT_LOCAL_ONLY);
	}
	public void test_bitmap_walk() {
		object root = new object();
		bitmap result = ((Object)0);
		khiter_t pos = new khiter_t();
		size_t result_popcnt = new size_t();
		bitmap_test_data tdata = new bitmap_test_data();
		bitmap_index bitmap_git = new bitmap_index();
		repository generatedRepo = this.getRepo();
		bitmap_index bitmap_index = new bitmap_index();
		if (!(bitmap_git = bitmap_index.prepare_bitmap_git(generatedRepo))) {
			ModernizedCProgram.die("failed to load bitmap indexes");
		} 
		object_array generatedPending = this.getPending();
		int generatedNr = generatedPending.getNr();
		if (generatedNr != 1) {
			ModernizedCProgram.die("you must specify exactly one commit to test");
		} 
		int generatedVersion = bitmap_git.getVersion();
		Object generatedEntry_count = bitmap_git.getEntry_count();
		.fprintf((_iob[2]), "Bitmap v%d test (%d entries loaded)\n", generatedVersion, generatedEntry_count);
		object_array_entry generatedObjects = generatedPending.getObjects();
		root = generatedObjects[0].getItem();
		 generatedBitmaps = bitmap_git.getBitmaps();
		object_id generatedOid = root.getOid();
		pos = generatedOid.kh_get_oid_map(generatedBitmaps);
		Object generatedN_buckets = (generatedBitmaps).getN_buckets();
		Object generatedVals = (generatedBitmaps).getVals();
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		Object generatedEwah_bitmap = bm.getEwah_bitmap();
		bitmap bitmap = new bitmap();
		if (pos < (generatedN_buckets)) {
			stored_bitmap st = (generatedVals[pos]);
			ewah_bitmap bm = ewah_bitmap.lookup_stored_bitmap(st);
			.fprintf((_iob[2]), "Found bitmap for %s. %d bits / %08x checksum\n", ModernizedCProgram.oid_to_hex(generatedOid), (int)generatedEwah_bitmap, bm.ewah_checksum());
			result = bitmap.ewah_to_bitmap(bm);
		} 
		if (result == ((Object)0)) {
			ModernizedCProgram.die("Commit %s doesn't have an indexed bitmap", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		this.setTag_objects(1);
		this.setTree_objects(1);
		this.setBlob_objects(1);
		result_popcnt = result.bitmap_popcount();
		if (revs.prepare_revision_walk()) {
			ModernizedCProgram.die("revision walk setup failed");
		} 
		tdata.setBitmap_git(bitmap_git);
		bitmap bitmap = new bitmap();
		tdata.setBase(bitmap.bitmap_new());
		progress progress = new progress();
		tdata.setPrg(progress.start_progress("Verifying bitmap entries", result_popcnt));
		tdata.setSeen(0);
		revs.traverse_commit_list(test_show_commit, test_show_object, tdata);
		progress generatedPrg = tdata.getPrg();
		generatedPrg.stop_progress();
		bitmap generatedBase = tdata.getBase();
		if (result.bitmap_equals(generatedBase)) {
			.fprintf((_iob[2]), "OK!\n");
		} else {
				.fprintf((_iob[2]), "Mismatch!\n");
		} 
		bitmap_git.free_bitmap_index();
	}
	public void save_user_format(Object cp, int is_tformat) {
		ModernizedCProgram.free(ModernizedCProgram.user_format);
		ModernizedCProgram.user_format = ModernizedCProgram.xstrdup(cp);
		if (is_tformat) {
			this.setRev_info(1);
		} 
		this.setRev_info(cmit_fmt.CMIT_FMT_USERFORMAT);
	}
	public void get_commit_format(Object arg) {
		cmt_fmt_map commit_format = new cmt_fmt_map();
		this.setRev_info(0);
		if (!arg) {
			this.setRev_info(cmit_fmt.CMIT_FMT_DEFAULT);
			return ;
		} 
		if (ModernizedCProgram.skip_prefix(arg, "format:", arg)) {
			rev.save_user_format(arg, 0);
			return ;
		} 
		if (!arg || ModernizedCProgram.skip_prefix(arg, "tformat:", arg) || .strchr(arg, (byte)'%')) {
			rev.save_user_format(arg, 1);
			return ;
		} 
		cmt_fmt_map cmt_fmt_map = new cmt_fmt_map();
		commit_format = cmt_fmt_map.find_commit_format(arg);
		if (!commit_format) {
			ModernizedCProgram.die("invalid --pretty format: %s", arg);
		} 
		cmit_fmt generatedFormat = commit_format.getFormat();
		this.setRev_info(generatedFormat);
		int generatedIs_tformat = commit_format.getIs_tformat();
		this.setRev_info(generatedIs_tformat);
		int generatedExpand_tabs_in_log = commit_format.getExpand_tabs_in_log();
		this.setRev_info(generatedExpand_tabs_in_log);
		Object generatedUser_format = commit_format.getUser_format();
		if (generatedFormat == cmit_fmt.CMIT_FMT_USERFORMAT) {
			rev.save_user_format(generatedUser_format, generatedIs_tformat);
		} 
	}
	public void mark_edges_uninteresting(Object show_edge, int sparse) {
		commit_list list = new commit_list();
		int i;
		commit generatedItem = list.getItem();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = list.getNext();
		commit_list generatedCommits = this.getCommits();
		repository generatedRepo = this.getRepo();
		int generatedEdge_hint_aggressive = this.getEdge_hint_aggressive();
		if (sparse) {
			oidset set = new oidset();
			set.oidset_init(16);
			for (list = generatedCommits; list; list = generatedNext) {
				commit commit = generatedItem;
				tree tree = .repo_get_commit_tree(ModernizedCProgram.the_repository, commit);
				if (generatedFlags & (-1024 << 1)) {
					generatedFlags |=  (-1024 << 1);
				} 
				set.oidset_insert(generatedOid);
				ModernizedCProgram.add_edge_parents(commit, revs, show_edge, set);
			}
			ModernizedCProgram.mark_trees_uninteresting_sparse(generatedRepo, set);
			set.oidset_clear();
		} else {
				for (list = generatedCommits; list; list = generatedNext) {
					commit commit = generatedItem;
					if (generatedFlags & (-1024 << 1)) {
						ModernizedCProgram.mark_tree_uninteresting(generatedRepo, .repo_get_commit_tree(ModernizedCProgram.the_repository, commit));
						if (generatedEdge_hint_aggressive && !(generatedFlags & (-1024 << 3))) {
							generatedFlags |=  (-1024 << 3);
							commit.show_edge();
						} 
						continue;
					} 
					ModernizedCProgram.mark_edge_parents_uninteresting(commit, revs, show_edge);
				}
		} 
		rev_cmdline_info generatedCmdline = this.getCmdline();
		int generatedNr = generatedCmdline.getNr();
		int generatedType = obj.getType();
		if (generatedEdge_hint_aggressive) {
			for (i = 0; i < generatedNr; i++) {
				object obj = generatedItem;
				commit commit = (commit)obj;
				if (generatedType != object_type.OBJ_COMMIT || !(generatedFlags & (-1024 << 1))) {
					continue;
				} 
				ModernizedCProgram.mark_tree_uninteresting(generatedRepo, .repo_get_commit_tree(ModernizedCProgram.the_repository, commit));
				if (!(generatedFlags & (-1024 << 3))) {
					generatedFlags |=  (-1024 << 3);
					commit.show_edge();
				} 
			}
		} 
	}
	public void traverse_commit_list(Object show_commit, Object show_object, Object show_data) {
		traversal_context ctx = new traversal_context();
		ctx.setRevs(revs);
		ctx.setShow_commit(show_commit);
		ctx.setShow_object(show_object);
		ctx.setShow_data(show_data);
		ctx.setFilter(((Object)0));
		ctx.do_traverse();
	}
	public void add_head_to_pending() {
		object_id oid = new object_id();
		object obj = new object();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", oid)) {
			return ;
		} 
		repository generatedRepo = this.getRepo();
		object object = new object();
		obj = object.parse_object(generatedRepo, oid);
		if (!obj) {
			return ;
		} 
		ModernizedCProgram.add_pending_object(revs, obj, "HEAD");
	}
	public void add_pending_oid(Object name, Object oid, int flags) {
		object object = new object();
		object object = object.get_reference(revs, name, oid, flags);
		ModernizedCProgram.add_pending_object(revs, object, name);
	}
	public int limit_list() {
		int slop = 5;
		timestamp_t date = -1024;
		commit_list generatedCommits = this.getCommits();
		commit_list list = generatedCommits;
		commit_list newlist = ((Object)0);
		commit_list p = newlist;
		commit_list bottom = ((Object)0);
		commit interesting_cache = ((Object)0);
		int generatedAncestry_path = this.getAncestry_path();
		if (generatedAncestry_path) {
			bottom = list.collect_bottom_commits();
			if (!bottom) {
				ModernizedCProgram.die("--ancestry-path given but there are no bottom commits");
			} 
		} 
		object generatedObject = commit.getObject();
		Object generatedMax_age = this.getMax_age();
		Object generatedDate = commit.getDate();
		int generatedFlags = obj.getFlags();
		Object generatedMin_age = this.getMin_age();
		while (list) {
			commit commit = .pop_commit(list);
			object obj = generatedObject;
			show_early_output_fn_t show = new show_early_output_fn_t();
			if (commit == interesting_cache) {
				interesting_cache = ((Object)0);
			} 
			if (generatedMax_age != -1 && (generatedDate < generatedMax_age)) {
				generatedFlags |=  (-1024 << 1);
			} 
			if (ModernizedCProgram.process_parents(revs, commit, list, ((Object)0)) < 0) {
				return -1;
			} 
			if (generatedFlags & (-1024 << 1)) {
				commit.mark_parents_uninteresting();
				slop = ModernizedCProgram.still_interesting(list, date, slop, interesting_cache);
				if (slop) {
					continue;
				} 
				break;
			} 
			if (generatedMin_age != -1 && (generatedDate > generatedMin_age)) {
				continue;
			} 
			date = generatedDate;
			p = .commit_list_insert(commit, p).getNext();
			show = ModernizedCProgram.show_early_output;
			if (!show) {
				continue;
			} 
			ModernizedCProgram.show(revs, newlist);
			ModernizedCProgram.show_early_output = ((Object)0);
		}
		int generatedCherry_pick = this.getCherry_pick();
		int generatedCherry_mark = this.getCherry_mark();
		if (generatedCherry_pick || generatedCherry_mark) {
			ModernizedCProgram.cherry_pick_list(newlist, revs);
		} 
		int generatedLeft_only = this.getLeft_only();
		int generatedRight_only = this.getRight_only();
		if (generatedLeft_only || generatedRight_only) {
			ModernizedCProgram.limit_left_right(newlist, revs);
		} 
		if (bottom) {
			bottom.limit_to_ancestry(newlist);
			.free_commit_list(bottom/*
				 * Check if any commits have become TREESAME by some of their parents
				 * becoming UNINTERESTING.
				 */);
		} 
		commit generatedItem = list.getItem();
		commit_list generatedNext = list.getNext();
		if (ModernizedCProgram.limiting_can_increase_treesame(revs)) {
			for (list = newlist; list; list = generatedNext) {
				commit c = generatedItem;
				if (generatedFlags & ((-1024 << 1) | (-1024 << 2))) {
					continue;
				} 
				ModernizedCProgram.update_treesame(revs, c);
			}
		} 
		this.setCommits(newlist);
		return 0/*
		 * Add an entry to refs->cmdline with the specified information.
		 * *name is copied.
		 */;
	}
	public void add_reflogs_to_pending(int flags) {
		all_refs_cb cb = new all_refs_cb();
		cb.setAll_revs(revs);
		cb.setAll_flags(flags);
		cb.setWt(((Object)0));
		ModernizedCProgram.for_each_reflog(handle_one_reflog, cb);
		int generatedSingle_worktree = this.getSingle_worktree();
		if (!generatedSingle_worktree) {
			cb.add_other_reflogs_to_pending();
		} 
	}
	public void add_index_objects_to_pending(int flags) {
		worktree worktrees = new worktree();
		worktree p = new worktree();
		repository generatedRepo = this.getRepo();
		generatedRepo.repo_read_index();
		index_state generatedIndex = generatedRepo.getIndex();
		ModernizedCProgram.do_add_index_objects_to_pending(revs, generatedIndex, flags);
		int generatedSingle_worktree = this.getSingle_worktree();
		if (generatedSingle_worktree) {
			return ;
		} 
		worktrees = .get_worktrees(0);
		int generatedIs_current = wt.getIs_current();
		for (p = worktrees; p; p++) {
			worktree wt = p;
			index_state istate = new index_state(((Object)0));
			if (generatedIs_current) {
				continue;
			} 
			if (istate.read_index_from(ModernizedCProgram.worktree_git_path(wt, "index"), .get_worktree_git_dir(wt)) > 0) {
				ModernizedCProgram.do_add_index_objects_to_pending(revs, istate, flags);
			} 
			istate.discard_index();
		}
		.free_worktrees(worktrees);
	}
	public void add_alternate_refs_to_pending(int flags) {
		add_alternate_refs_data data = new add_alternate_refs_data();
		data.setRevs(revs);
		data.setFlags(flags);
		ModernizedCProgram.for_each_alternate_ref(add_one_alternate_ref, data);
	}
	public int add_parents_only(Object arg_, int flags, int exclude_parent) {
		object_id oid = new object_id();
		object it = new object();
		commit commit = new commit();
		commit_list parents = new commit_list();
		int parent_number;
		byte arg = arg_;
		if (arg == (byte)'^') {
			flags ^=  (-1024 << 1) | (-1024 << 10);
			arg++;
		} 
		if (ModernizedCProgram.repo_get_oid_committish(ModernizedCProgram.the_repository, arg, oid)) {
			return 0;
		} 
		object object = new object();
		int generatedIgnore_missing = this.getIgnore_missing();
		int generatedType = it.getType();
		while (1) {
			it = object.get_reference(revs, arg, oid, 0);
			if (!it && generatedIgnore_missing) {
				return 0;
			} 
			if (generatedType != object_type.OBJ_TAG) {
				break;
			} 
			if (!((tag)it).getTagged()) {
				return 0;
			} 
			oid.oidcpy(((tag)it).getTagged().getOid());
		}
		if (generatedType != object_type.OBJ_COMMIT) {
			return 0;
		} 
		commit = (commit)it;
		commit_list generatedParents = commit.getParents();
		if (exclude_parent && exclude_parent > .commit_list_count(generatedParents)) {
			return 0;
		} 
		commit generatedItem = parents.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = it.getFlags();
		for (; parents; ) {
			if (exclude_parent && parent_number != exclude_parent) {
				continue;
			} 
			it = generatedObject;
			generatedFlags |=  flags;
			ModernizedCProgram.add_rev_cmdline(revs, it, arg_, .REV_CMD_PARENTS_ONLY, flags);
			ModernizedCProgram.add_pending_object(revs, it, arg);
		}
		return 1;
	}
	public void prepare_show_merge() {
		commit_list bases = new commit_list();
		commit head = new commit();
		commit other = new commit();
		object_id oid = new object_id();
		byte prune = ((Object)0);
		int i;
		int prune_num = /* counting terminating NULL */1;
		repository generatedRepo = this.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		index_state istate = generatedIndex;
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", oid)) {
			ModernizedCProgram.die("--merge without HEAD?");
		} 
		head = .lookup_commit_or_die(oid, "HEAD");
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "MERGE_HEAD", oid)) {
			ModernizedCProgram.die("--merge without MERGE_HEAD?");
		} 
		other = .lookup_commit_or_die(oid, "MERGE_HEAD");
		object generatedObject = head.getObject();
		ModernizedCProgram.add_pending_object(revs, generatedObject, "HEAD");
		ModernizedCProgram.add_pending_object(revs, generatedObject, "MERGE_HEAD");
		commit_list commit_list = new commit_list();
		bases = commit_list.repo_get_merge_bases(ModernizedCProgram.the_repository, head, other);
		ModernizedCProgram.add_rev_cmdline_list(revs, bases, .REV_CMD_MERGE_BASE, (-1024 << 1) | (-1024 << 10));
		ModernizedCProgram.add_pending_commit_list(revs, bases, (-1024 << 1) | (-1024 << 10));
		.free_commit_list(bases);
		int generatedFlags = generatedObject.getFlags();
		generatedFlags |=  (-1024 << 8);
		int generatedCache_nr = istate.getCache_nr();
		if (!generatedCache_nr) {
			generatedRepo.repo_read_index();
		} 
		cache_entry generatedCache = istate.getCache();
		pathspec generatedPrune_data = this.getPrune_data();
		for (i = 0; i < generatedCache_nr; i++) {
			cache_entry ce = generatedCache[i];
			if (!(((true) & (ce).getCe_flags()) >> 12)) {
				continue;
			} 
			if (ModernizedCProgram.ce_path_match(istate, ce, generatedPrune_data, ((Object)0))) {
				prune_num++;
				(prune) = ModernizedCProgram.xrealloc((prune), ModernizedCProgram.st_mult(, (prune_num)));
				prune[prune_num - 2] = ce.getName();
				prune[prune_num - 1] = ((Object)0);
			} 
			while ((i + 1 < generatedCache_nr) && ModernizedCProgram.ce_same_name(ce, generatedCache[i + 1])) {
				i++;
			}
		}
		generatedPrune_data.clear_pathspec();
		generatedPrune_data.parse_pathspec(((1 << 0) | (1 << 1) | (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5) | (1 << 6)) & ~(1 << 2), (1 << 1) | (1 << 6), "", prune);
		this.setLimited(1);
	}
	public int dotdot_missing(Object arg, byte dotdot, int symmetric) {
		int generatedIgnore_missing = this.getIgnore_missing();
		if (generatedIgnore_missing) {
			return 0;
		} 
		dotdot = /* de-munge so we report the full argument */(byte)'.';
		ModernizedCProgram.die(symmetric ? "Invalid symmetric difference expression %s" : "Invalid revision range %s", arg);
	}
	public int handle_dotdot(Object arg, int flags, int cant_be_filename) {
		object_context a_oc = new object_context();
		object_context b_oc = new object_context();
		byte dotdot = .strstr(arg, "..");
		int ret;
		if (!dotdot) {
			return -1;
		} 
		.memset(a_oc, 0, );
		.memset(b_oc, 0, );
		dotdot = (byte)'\0';
		ret = ModernizedCProgram.handle_dotdot_1(arg, dotdot, revs, flags, cant_be_filename, a_oc, b_oc);
		dotdot = (byte)'.';
		Byte generatedPath = a_oc.getPath();
		ModernizedCProgram.free(generatedPath);
		ModernizedCProgram.free(generatedPath);
		return ret;
	}
	public int handle_revision_arg(Object arg_, int flags, int revarg_opt) {
		object_context oc = new object_context();
		byte mark;
		object object = new object();
		object_id oid = new object_id();
		int local_flags;
		byte arg = arg_;
		int cant_be_filename = revarg_opt & 1;
		int get_sha1_flags = 200;
		flags = flags & (-1024 << 1) ? flags | (-1024 << 10) : flags & ~(-1024 << 10);
		if (!cant_be_filename && !.strcmp(arg, ".."/*
				 * Just ".."?  That is not a range but the
				 * pathspec for the parent directory.
				 */)) {
			return -1;
		} 
		if (!revs.handle_dotdot(arg, flags, revarg_opt)) {
			return 0;
		} 
		mark = .strstr(arg, "^@");
		if (mark && !mark[2]) {
			mark = 0;
			if (revs.add_parents_only(arg, flags, 0)) {
				return 0;
			} 
			mark = (byte)'^';
		} 
		mark = .strstr(arg, "^!");
		if (mark && !mark[2]) {
			mark = 0;
			if (!revs.add_parents_only(arg, flags ^ ((-1024 << 1) | (-1024 << 10)), 0)) {
				mark = (byte)'^';
			} 
		} 
		mark = .strstr(arg, "^-");
		if (mark) {
			int exclude_parent = 1;
			if (mark[2]) {
				byte end;
				exclude_parent = .strtoul(mark + 2, end, 10);
				if (end != (byte)'\0' || !exclude_parent) {
					return -1;
				} 
			} 
			mark = 0;
			if (!revs.add_parents_only(arg, flags ^ ((-1024 << 1) | (-1024 << 10)), exclude_parent)) {
				mark = (byte)'^';
			} 
		} 
		local_flags = 0;
		if (arg == (byte)'^') {
			local_flags = (-1024 << 1) | (-1024 << 10);
			arg++;
		} 
		if (revarg_opt & 2) {
			get_sha1_flags |=  4;
		} 
		repository generatedRepo = this.getRepo();
		int generatedIgnore_missing = this.getIgnore_missing();
		if (ModernizedCProgram.get_oid_with_context(generatedRepo, arg, get_sha1_flags, oid, oc)) {
			return generatedIgnore_missing ? 0 : -1;
		} 
		Object generatedPrefix = this.getPrefix();
		if (!cant_be_filename) {
			ModernizedCProgram.verify_non_filename(generatedPrefix, arg);
		} 
		object object = new object();
		object = object.get_reference(revs, arg, oid, flags ^ local_flags);
		if (!object) {
			return generatedIgnore_missing ? 0 : -1;
		} 
		ModernizedCProgram.add_rev_cmdline(revs, object, arg_, .REV_CMD_REV, flags ^ local_flags);
		int generatedMode = oc.getMode();
		Byte generatedPath = oc.getPath();
		ModernizedCProgram.add_pending_object_with_path(revs, object, arg, generatedMode, generatedPath);
		ModernizedCProgram.free(generatedPath);
		return 0;
	}
	public void add_grep(Object ptn, grep_pat_token what) {
		grep_opt generatedGrep_filter = this.getGrep_filter();
		.append_grep_pattern(generatedGrep_filter, ptn, "command line", 0, grep_pat_token.what);
	}
	public void add_header_grep(grep_header_field field, Object pattern) {
		grep_opt generatedGrep_filter = this.getGrep_filter();
		.append_header_grep_pattern(generatedGrep_filter, grep_header_field.field, pattern);
	}
	public void add_message_grep(Object pattern) {
		revs.add_grep(pattern, grep_pat_token.GREP_PATTERN_BODY);
	}
	public int handle_revision_opt(int argc, Object argv, int unkc, Object unkv, Object opt) {
		byte arg = argv[0];
		byte optarg;
		int argcount;
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		if (!.strcmp(arg, "--all") || !.strcmp(arg, /* pseudo revision arguments */"--branches") || !.strcmp(arg, "--tags") || !.strcmp(arg, "--remotes") || !.strcmp(arg, "--reflog") || !.strcmp(arg, "--not") || !.strcmp(arg, "--no-walk") || !.strcmp(arg, "--do-walk") || !.strcmp(arg, "--bisect") || ModernizedCProgram.starts_with(arg, "--glob=") || !.strcmp(arg, "--indexed-objects") || !.strcmp(arg, "--alternate-refs") || ModernizedCProgram.starts_with(arg, "--exclude=") || ModernizedCProgram.starts_with(arg, "--branches=") || ModernizedCProgram.starts_with(arg, "--tags=") || ModernizedCProgram.starts_with(arg, "--remotes=") || ModernizedCProgram.starts_with(arg, "--no-walk=")) {
			unkv[(unkc)++] = arg;
			return 1;
		} 
		int generatedMax_count = this.getMax_count();
		reflog_walk_info generatedReflog_info = this.getReflog_info();
		int generatedEarly_output = this.getEarly_output();
		int generatedRight_only = this.getRight_only();
		int generatedLeft_only = this.getLeft_only();
		int generatedCherry_pick = this.getCherry_pick();
		int generatedCherry_mark = this.getCherry_mark();
		diff_options generatedDiffopt = this.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		display_notes_opt generatedNotes_opt = this.getNotes_opt();
		int generatedUse_default_notes = generatedNotes_opt.getUse_default_notes();
		string_list generatedExtra_notes_refs = generatedNotes_opt.getExtra_notes_refs();
		git_graph git_graph = new git_graph();
		int generatedAbbrev = this.getAbbrev();
		date_mode generatedDate_mode = this.getDate_mode();
		grep_opt generatedGrep_filter = this.getGrep_filter();
		int generatedPickaxe_opts = generatedDiffopt.getPickaxe_opts();
		int generatedReverse = this.getReverse();
		decoration generatedChildren = this.getChildren();
		Object generatedPrefix = this.getPrefix();
		if ((argcount = "max-count".parse_long_opt(argv, optarg))) {
			this.setMax_count(.atoi(optarg));
			this.setNo_walk(0);
			return argcount;
		}  else if ((argcount = "skip".parse_long_opt(argv, optarg))) {
			this.setSkip_count(.atoi(optarg));
			return argcount;
		}  else if ((arg == (byte)'-') && ((ModernizedCProgram.sane_ctype[(byte)(arg[1])] & (true)) != 0)) {
			if (ModernizedCProgram.strtol_i(arg + 1, 10, generatedMax_count) < /* accept -<digit>, like traditional "head" */0 || generatedMax_count < 0) {
				ModernizedCProgram.die("'%s': not a non-negative integer", arg + 1);
			} 
			this.setNo_walk(0);
		}  else if (!.strcmp(arg, "-n")) {
			if (argc <= 1) {
				return ();
			} 
			this.setMax_count(.atoi(argv[1]));
			this.setNo_walk(0);
			return 2;
		}  else if (ModernizedCProgram.skip_prefix(arg, "-n", optarg)) {
			this.setMax_count(.atoi(optarg));
			this.setNo_walk(0);
		}  else if ((argcount = "max-age".parse_long_opt(argv, optarg))) {
			this.setMax_age(.atoi(optarg));
			return argcount;
		}  else if ((argcount = "since".parse_long_opt(argv, optarg))) {
			this.setMax_age(ModernizedCProgram.approxidate_careful((optarg), ((Object)0)));
			return argcount;
		}  else if ((argcount = "after".parse_long_opt(argv, optarg))) {
			this.setMax_age(ModernizedCProgram.approxidate_careful((optarg), ((Object)0)));
			return argcount;
		}  else if ((argcount = "min-age".parse_long_opt(argv, optarg))) {
			this.setMin_age(.atoi(optarg));
			return argcount;
		}  else if ((argcount = "before".parse_long_opt(argv, optarg))) {
			this.setMin_age(ModernizedCProgram.approxidate_careful((optarg), ((Object)0)));
			return argcount;
		}  else if ((argcount = "until".parse_long_opt(argv, optarg))) {
			this.setMin_age(ModernizedCProgram.approxidate_careful((optarg), ((Object)0)));
			return argcount;
		}  else if (!.strcmp(arg, "--first-parent")) {
			this.setFirst_parent_only(1);
		}  else if (!.strcmp(arg, "--ancestry-path")) {
			this.setAncestry_path(1);
			this.setSimplify_history(0);
			this.setLimited(1);
		}  else if (!.strcmp(arg, "-g") || !.strcmp(arg, "--walk-reflogs")) {
			generatedReflog_info.init_reflog_walk();
		}  else if (!.strcmp(arg, "--default")) {
			if (argc <= 1) {
				return ();
			} 
			this.setDef(argv[1]);
			return 2;
		}  else if (!.strcmp(arg, "--merge")) {
			this.setShow_merge(1);
		}  else if (!.strcmp(arg, "--topo-order")) {
			this.setSort_order(rev_sort_order.REV_SORT_IN_GRAPH_ORDER);
			this.setTopo_order(1);
		}  else if (!.strcmp(arg, "--simplify-merges")) {
			this.setSimplify_merges(1);
			this.setTopo_order(1);
			this.setRewrite_parents(1);
			this.setSimplify_history(0);
			this.setLimited(1);
		}  else if (!.strcmp(arg, "--simplify-by-decoration")) {
			this.setSimplify_merges(1);
			this.setTopo_order(1);
			this.setRewrite_parents(1);
			this.setSimplify_history(0);
			this.setSimplify_by_decoration(1);
			this.setLimited(1);
			this.setPrune(1);
		}  else if (!.strcmp(arg, "--date-order")) {
			this.setSort_order(rev_sort_order.REV_SORT_BY_COMMIT_DATE);
			this.setTopo_order(1);
		}  else if (!.strcmp(arg, "--author-date-order")) {
			this.setSort_order(rev_sort_order.REV_SORT_BY_AUTHOR_DATE);
			this.setTopo_order(1);
		}  else if (!.strcmp(arg, "--early-output")) {
			this.setEarly_output(100);
			this.setTopo_order(1);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--early-output=", optarg)) {
			if (ModernizedCProgram.strtoul_ui(optarg, 10, generatedEarly_output) < 0) {
				ModernizedCProgram.die("'%s': not a non-negative integer", optarg);
			} 
			this.setTopo_order(1);
		}  else if (!.strcmp(arg, "--parents")) {
			this.setRewrite_parents(1);
			this.setPrint_parents(1);
		}  else if (!.strcmp(arg, "--dense")) {
			this.setDense(1);
		}  else if (!.strcmp(arg, "--sparse")) {
			this.setDense(0);
		}  else if (!.strcmp(arg, "--in-commit-order")) {
			this.setTree_blobs_in_commit_order(1);
		}  else if (!.strcmp(arg, "--remove-empty")) {
			this.setRemove_empty_trees(1);
		}  else if (!.strcmp(arg, "--merges")) {
			this.setMin_parents(2);
		}  else if (!.strcmp(arg, "--no-merges")) {
			this.setMax_parents(1);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--min-parents=", optarg)) {
			this.setMin_parents(.atoi(optarg));
		}  else if (!.strcmp(arg, "--no-min-parents")) {
			this.setMin_parents(0);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--max-parents=", optarg)) {
			this.setMax_parents(.atoi(optarg));
		}  else if (!.strcmp(arg, "--no-max-parents")) {
			this.setMax_parents(-1);
		}  else if (!.strcmp(arg, "--boundary")) {
			this.setBoundary(1);
		}  else if (!.strcmp(arg, "--left-right")) {
			this.setLeft_right(1);
		}  else if (!.strcmp(arg, "--left-only")) {
			if (generatedRight_only) {
				ModernizedCProgram.die("--left-only is incompatible with --right-only or --cherry");
			} 
			this.setLeft_only(1);
		}  else if (!.strcmp(arg, "--right-only")) {
			if (generatedLeft_only) {
				ModernizedCProgram.die("--right-only is incompatible with --left-only");
			} 
			this.setRight_only(1);
		}  else if (!.strcmp(arg, "--cherry")) {
			if (generatedLeft_only) {
				ModernizedCProgram.die("--cherry is incompatible with --left-only");
			} 
			this.setCherry_mark(1);
			this.setRight_only(1);
			this.setMax_parents(1);
			this.setLimited(1);
		}  else if (!.strcmp(arg, "--count")) {
			this.setCount(1);
		}  else if (!.strcmp(arg, "--cherry-mark")) {
			if (generatedCherry_pick) {
				ModernizedCProgram.die("--cherry-mark is incompatible with --cherry-pick");
			} 
			this.setCherry_mark(1);
			this.setLimited(/* needs limit_list() */1);
		}  else if (!.strcmp(arg, "--cherry-pick")) {
			if (generatedCherry_mark) {
				ModernizedCProgram.die("--cherry-pick is incompatible with --cherry-mark");
			} 
			this.setCherry_pick(1);
			this.setLimited(1);
		}  else if (!.strcmp(arg, "--objects")) {
			this.setTag_objects(1);
			this.setTree_objects(1);
			this.setBlob_objects(1);
		}  else if (!.strcmp(arg, "--objects-edge")) {
			this.setTag_objects(1);
			this.setTree_objects(1);
			this.setBlob_objects(1);
			this.setEdge_hint(1);
		}  else if (!.strcmp(arg, "--objects-edge-aggressive")) {
			this.setTag_objects(1);
			this.setTree_objects(1);
			this.setBlob_objects(1);
			this.setEdge_hint(1);
			this.setEdge_hint_aggressive(1);
		}  else if (!.strcmp(arg, "--verify-objects")) {
			this.setTag_objects(1);
			this.setTree_objects(1);
			this.setBlob_objects(1);
			this.setVerify_objects(1);
		}  else if (!.strcmp(arg, "--unpacked")) {
			this.setUnpacked(1);
		}  else if (ModernizedCProgram.starts_with(arg, "--unpacked=")) {
			ModernizedCProgram.die("--unpacked=<packfile> no longer supported.");
		}  else if (!.strcmp(arg, "-r")) {
			this.setDiff(1);
			generatedFlags.setRecursive(1);
		}  else if (!.strcmp(arg, "-t")) {
			this.setDiff(1);
			generatedFlags.setRecursive(1);
			generatedFlags.setTree_in_recursive(1);
		}  else if (!.strcmp(arg, "-m")) {
			this.setIgnore_merges(0);
		}  else if (!.strcmp(arg, "-c")) {
			this.setDiff(1);
			this.setDense_combined_merges(0);
			this.setCombine_merges(1);
		}  else if (!.strcmp(arg, "--combined-all-paths")) {
			this.setDiff(1);
			this.setCombined_all_paths(1);
		}  else if (!.strcmp(arg, "--cc")) {
			this.setDiff(1);
			this.setDense_combined_merges(1);
			this.setCombine_merges(1);
		}  else if (!.strcmp(arg, "-v")) {
			this.setVerbose_header(1);
		}  else if (!.strcmp(arg, "--pretty")) {
			this.setVerbose_header(1);
			this.setPretty_given(1);
			revs.get_commit_format(((Object)0));
		}  else if (ModernizedCProgram.skip_prefix(arg, "--pretty=", optarg) || ModernizedCProgram.skip_prefix(arg, "--format=", optarg/*
				 * Detached form ("--pretty X" as opposed to "--pretty=X")
				 * not allowed, since the argument is optional.
				 */)) {
			this.setVerbose_header(1);
			this.setPretty_given(1);
			revs.get_commit_format(optarg);
		}  else if (!.strcmp(arg, "--expand-tabs")) {
			this.setExpand_tabs_in_log(8);
		}  else if (!.strcmp(arg, "--no-expand-tabs")) {
			this.setExpand_tabs_in_log(0);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--expand-tabs=", arg)) {
			int val;
			if (ModernizedCProgram.strtol_i(arg, 10, val) < 0 || val < 0) {
				ModernizedCProgram.die("'%s': not a non-negative integer", arg);
			} 
			this.setExpand_tabs_in_log(val);
		}  else if (!.strcmp(arg, "--show-notes") || !.strcmp(arg, "--notes")) {
			this.setShow_notes(1);
			this.setShow_notes_given(1);
			generatedNotes_opt.setUse_default_notes(1);
		}  else if (!.strcmp(arg, "--show-signature")) {
			this.setShow_signature(1);
		}  else if (!.strcmp(arg, "--no-show-signature")) {
			this.setShow_signature(0);
		}  else if (!.strcmp(arg, "--show-linear-break")) {
			this.setBreak_bar("                    ..........");
			this.setTrack_linear(1);
			this.setTrack_first_time(1);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--show-linear-break=", optarg)) {
			this.setBreak_bar(ModernizedCProgram.xstrdup(optarg));
			this.setTrack_linear(1);
			this.setTrack_first_time(1);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--show-notes=", optarg) || ModernizedCProgram.skip_prefix(arg, "--notes=", optarg)) {
			strbuf buf = new strbuf(, , );
			this.setShow_notes(1);
			this.setShow_notes_given(1);
			if (ModernizedCProgram.starts_with(arg, "--show-notes=") && generatedUse_default_notes < 0) {
				generatedNotes_opt.setUse_default_notes(1);
			} 
			ModernizedCProgram.buf.strbuf_addstr(optarg);
			.expand_notes_ref(ModernizedCProgram.buf);
			generatedExtra_notes_refs.string_list_append(ModernizedCProgram.buf.strbuf_detach(((Object)0)));
		}  else if (!.strcmp(arg, "--no-notes")) {
			this.setShow_notes(0);
			this.setShow_notes_given(1);
			generatedNotes_opt.setUse_default_notes(-1/* we have been strdup'ing ourselves, so trick
					 * string_list into free()ing strings */);
			generatedExtra_notes_refs.setStrdup_strings(1);
			generatedExtra_notes_refs.string_list_clear(0);
			generatedExtra_notes_refs.setStrdup_strings(0);
		}  else if (!.strcmp(arg, "--standard-notes")) {
			this.setShow_notes_given(1);
			generatedNotes_opt.setUse_default_notes(1);
		}  else if (!.strcmp(arg, "--no-standard-notes")) {
			generatedNotes_opt.setUse_default_notes(0);
		}  else if (!.strcmp(arg, "--oneline")) {
			this.setVerbose_header(1);
			revs.get_commit_format("oneline");
			this.setPretty_given(1);
			this.setAbbrev_commit(1);
		}  else if (!.strcmp(arg, "--graph")) {
			this.setTopo_order(1);
			this.setRewrite_parents(1);
			this.setGraph(git_graph.graph_init(revs));
		}  else if (!.strcmp(arg, "--root")) {
			this.setShow_root_diff(1);
		}  else if (!.strcmp(arg, "--no-commit-id")) {
			this.setNo_commit_id(1);
		}  else if (!.strcmp(arg, "--always")) {
			this.setAlways_show_header(1);
		}  else if (!.strcmp(arg, "--no-abbrev")) {
			this.setAbbrev(0);
		}  else if (!.strcmp(arg, "--abbrev")) {
			this.setAbbrev(ModernizedCProgram.default_abbrev);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--abbrev=", optarg)) {
			this.setAbbrev(.strtoul(optarg, ((Object)0), 10));
			if (generatedAbbrev < ModernizedCProgram.minimum_abbrev) {
				this.setAbbrev(ModernizedCProgram.minimum_abbrev);
			}  else if (generatedAbbrev > hexsz) {
				this.setAbbrev(hexsz);
			} 
		}  else if (!.strcmp(arg, "--abbrev-commit")) {
			this.setAbbrev_commit(1);
			this.setAbbrev_commit_given(1);
		}  else if (!.strcmp(arg, "--no-abbrev-commit")) {
			this.setAbbrev_commit(0);
		}  else if (!.strcmp(arg, "--full-diff")) {
			this.setDiff(1);
			this.setFull_diff(1);
		}  else if (!.strcmp(arg, "--full-history")) {
			this.setSimplify_history(0);
		}  else if (!.strcmp(arg, "--relative-date")) {
			generatedDate_mode.setType(date_mode_type.DATE_RELATIVE);
			this.setDate_mode_explicit(1);
		}  else if ((argcount = "date".parse_long_opt(argv, optarg))) {
			generatedDate_mode.parse_date_format(optarg);
			this.setDate_mode_explicit(1);
			return argcount;
		}  else if (!.strcmp(arg, "--log-size")) {
			this.setShow_log_size(1/*
				 * Grepping the commit log
				 */);
		}  else if ((argcount = "author".parse_long_opt(argv, optarg))) {
			revs.add_header_grep(grep_header_field.GREP_HEADER_AUTHOR, optarg);
			return argcount;
		}  else if ((argcount = "committer".parse_long_opt(argv, optarg))) {
			revs.add_header_grep(grep_header_field.GREP_HEADER_COMMITTER, optarg);
			return argcount;
		}  else if ((argcount = "grep-reflog".parse_long_opt(argv, optarg))) {
			revs.add_header_grep(grep_header_field.GREP_HEADER_REFLOG, optarg);
			return argcount;
		}  else if ((argcount = "grep".parse_long_opt(argv, optarg))) {
			revs.add_message_grep(optarg);
			return argcount;
		}  else if (!.strcmp(arg, "--grep-debug")) {
			generatedGrep_filter.setDebug(1);
		}  else if (!.strcmp(arg, "--basic-regexp")) {
			generatedGrep_filter.setPattern_type_option(grep_pattern_type.GREP_PATTERN_TYPE_BRE);
		}  else if (!.strcmp(arg, "--extended-regexp") || !.strcmp(arg, "-E")) {
			generatedGrep_filter.setPattern_type_option(grep_pattern_type.GREP_PATTERN_TYPE_ERE);
		}  else if (!.strcmp(arg, "--regexp-ignore-case") || !.strcmp(arg, "-i")) {
			generatedGrep_filter.setIgnore_case(1);
			generatedPickaxe_opts |=  32;
		}  else if (!.strcmp(arg, "--fixed-strings") || !.strcmp(arg, "-F")) {
			generatedGrep_filter.setPattern_type_option(grep_pattern_type.GREP_PATTERN_TYPE_FIXED);
		}  else if (!.strcmp(arg, "--perl-regexp") || !.strcmp(arg, "-P")) {
			generatedGrep_filter.setPattern_type_option(grep_pattern_type.GREP_PATTERN_TYPE_PCRE);
		}  else if (!.strcmp(arg, "--all-match")) {
			generatedGrep_filter.setAll_match(1);
		}  else if (!.strcmp(arg, "--invert-grep")) {
			this.setInvert_grep(1);
		}  else if ((argcount = "encoding".parse_long_opt(argv, optarg))) {
			if (.strcmp(optarg, "none")) {
				ModernizedCProgram.git_log_output_encoding = ModernizedCProgram.xstrdup(optarg);
			} else {
					ModernizedCProgram.git_log_output_encoding = "";
			} 
			return argcount;
		}  else if (!.strcmp(arg, "--reverse")) {
			generatedReverse ^=  1;
		}  else if (!.strcmp(arg, "--children")) {
			generatedChildren.setName("children");
			this.setLimited(1);
		}  else if (!.strcmp(arg, "--ignore-missing")) {
			this.setIgnore_missing(1);
		}  else if (opt && opt.getAllow_exclude_promisor_objects() && !.strcmp(arg, "--exclude-promisor-objects")) {
			if (ModernizedCProgram.fetch_if_missing) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\revision.c", 2340, "exclude_promisor_objects can only be used when fetch_if_missing is 0");
			} 
			this.setExclude_promisor_objects(1);
		} else {
				int opts = .diff_opt_parse(generatedDiffopt, argv, argc, generatedPrefix);
				if (!opts) {
					unkv[(unkc)++] = arg;
				} 
				return opts;
		} 
		git_graph generatedGraph = this.getGraph();
		int generatedTrack_linear = this.getTrack_linear();
		if (generatedGraph && generatedTrack_linear) {
			ModernizedCProgram.die("--show-linear-break and --graph are incompatible");
		} 
		return 1;
	}
	public int handle_revision_pseudo_opt(Object submodule, int argc, Object argv, int flags) {
		byte arg = argv[0];
		byte optarg;
		ref_store refs = new ref_store();
		int argcount;
		int generatedSingle_worktree = this.getSingle_worktree();
		ref_store ref_store = new ref_store();
		repository generatedRepo = this.getRepo();
		ref_store ref_store = new ref_store();
		if (submodule/*
				 * We need some something like get_submodule_worktrees()
				 * before we can go through all worktrees of a submodule,
				 * .e.g with adding all HEADs from --all, which is not
				 * supported right now, so stick to single worktree.
				 */) {
			if (!generatedSingle_worktree) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\revision.c", 2406, "--single-worktree cannot be used together with submodule");
			} 
			refs = ref_store.get_submodule_ref_store(submodule);
		} else {
				refs = ref_store.get_main_ref_store(generatedRepo);
		} 
		string_list generatedRef_excludes = this.getRef_excludes();
		if (!.strcmp(arg, "--all")) {
			ModernizedCProgram.handle_refs(refs, revs, flags, ModernizedCProgram.refs_for_each_ref);
			ModernizedCProgram.handle_refs(refs, revs, flags, ModernizedCProgram.refs_head_ref);
			if (!generatedSingle_worktree) {
				all_refs_cb cb = new all_refs_cb();
				ModernizedCProgram.init_all_refs_cb(cb, revs, flags);
				.other_head_refs(handle_one_ref, cb);
			} 
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (!.strcmp(arg, "--branches")) {
			ModernizedCProgram.handle_refs(refs, revs, flags, ModernizedCProgram.refs_for_each_branch_ref);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (!.strcmp(arg, "--bisect")) {
			ModernizedCProgram.read_bisect_terms(ModernizedCProgram.term_bad, ModernizedCProgram.term_good);
			ModernizedCProgram.handle_refs(refs, revs, flags, for_each_bad_bisect_ref);
			ModernizedCProgram.handle_refs(refs, revs, flags ^ ((-1024 << 1) | (-1024 << 10)), for_each_good_bisect_ref);
			this.setBisect(1);
		}  else if (!.strcmp(arg, "--tags")) {
			ModernizedCProgram.handle_refs(refs, revs, flags, ModernizedCProgram.refs_for_each_tag_ref);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (!.strcmp(arg, "--remotes")) {
			ModernizedCProgram.handle_refs(refs, revs, flags, ModernizedCProgram.refs_for_each_remote_ref);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if ((argcount = "glob".parse_long_opt(argv, optarg))) {
			all_refs_cb cb = new all_refs_cb();
			ModernizedCProgram.init_all_refs_cb(cb, revs, flags);
			ModernizedCProgram.for_each_glob_ref(handle_one_ref, optarg, cb);
			generatedRef_excludes.clear_ref_exclusion();
			return argcount;
		}  else if ((argcount = "exclude".parse_long_opt(argv, optarg))) {
			generatedRef_excludes.add_ref_exclusion(optarg);
			return argcount;
		}  else if (ModernizedCProgram.skip_prefix(arg, "--branches=", optarg)) {
			all_refs_cb cb = new all_refs_cb();
			ModernizedCProgram.init_all_refs_cb(cb, revs, flags);
			ModernizedCProgram.for_each_glob_ref_in(handle_one_ref, optarg, "refs/heads/", cb);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (ModernizedCProgram.skip_prefix(arg, "--tags=", optarg)) {
			all_refs_cb cb = new all_refs_cb();
			ModernizedCProgram.init_all_refs_cb(cb, revs, flags);
			ModernizedCProgram.for_each_glob_ref_in(handle_one_ref, optarg, "refs/tags/", cb);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (ModernizedCProgram.skip_prefix(arg, "--remotes=", optarg)) {
			all_refs_cb cb = new all_refs_cb();
			ModernizedCProgram.init_all_refs_cb(cb, revs, flags);
			ModernizedCProgram.for_each_glob_ref_in(handle_one_ref, optarg, "refs/remotes/", cb);
			generatedRef_excludes.clear_ref_exclusion();
		}  else if (!.strcmp(arg, "--reflog")) {
			revs.add_reflogs_to_pending(flags);
		}  else if (!.strcmp(arg, "--indexed-objects")) {
			revs.add_index_objects_to_pending(flags);
		}  else if (!.strcmp(arg, "--alternate-refs")) {
			revs.add_alternate_refs_to_pending(flags);
		}  else if (!.strcmp(arg, "--not")) {
			flags ^=  (-1024 << 1) | (-1024 << 10);
		}  else if (!.strcmp(arg, "--no-walk")) {
			this.setNo_walk(1);
		}  else if (ModernizedCProgram.skip_prefix(arg, "--no-walk=", optarg/*
				 * Detached form ("--no-walk X" as opposed to "--no-walk=X")
				 * not allowed, since the argument is optional.
				 */)) {
			if (!.strcmp(optarg, "sorted")) {
				this.setNo_walk(1);
			}  else if (!.strcmp(optarg, "unsorted")) {
				this.setNo_walk(2);
			} else {
					return ();
			} 
		}  else if (!.strcmp(arg, "--do-walk")) {
			this.setNo_walk(0);
		}  else if (!.strcmp(arg, "--single-worktree")) {
			this.setSingle_worktree(1);
		} else {
				return 0;
		} 
		return 1;
	}
	public void simplify_merges() {
		commit_list list = new commit_list();
		commit_list next = new commit_list();
		commit_list yet_to_do = new commit_list();
		commit_list tail = new commit_list();
		commit commit = new commit();
		int generatedPrune = this.getPrune();
		if (!generatedPrune) {
			return ;
		} 
		yet_to_do = ((Object)/* feed the list reversed */0);
		commit generatedItem = list.getItem();
		commit_list generatedNext = list.getNext();
		commit_list generatedCommits = this.getCommits();
		for (list = generatedCommits; list; list = next) {
			commit = generatedItem;
			next = generatedNext;
			.commit_list_insert(commit, yet_to_do);
		}
		while (yet_to_do) {
			list = yet_to_do;
			yet_to_do = ((Object)0);
			tail = yet_to_do;
			while (list) {
				commit = .pop_commit(list);
				tail = tail.simplify_one(revs, commit);
			}
		}
		list = generatedCommits;
		this.setCommits(((Object)0));
		tail = generatedCommits;
		merge_simplify_state merge_simplify_state = new merge_simplify_state();
		commit generatedSimplified = st.getSimplified();
		while (list) {
			merge_simplify_state st = new merge_simplify_state();
			commit = .pop_commit(list);
			st = merge_simplify_state.locate_simplify_state(revs, commit);
			if (generatedSimplified == commit) {
				tail = generatedNext;
			} 
		}
	}
	public void set_children() {
		commit_list l = new commit_list();
		commit generatedItem = l.getItem();
		commit_list generatedNext = p.getNext();
		commit_list generatedParents = commit.getParents();
		commit_list generatedCommits = this.getCommits();
		for (l = generatedCommits; l; l = generatedNext) {
			commit commit = generatedItem;
			commit_list p = new commit_list();
			for (p = generatedParents; p; p = generatedNext) {
				ModernizedCProgram.add_child(revs, generatedItem, commit);
			}
		}
	}
	public void explore_walk_step() {
		topo_walk_info generatedTopo_walk_info = this.getTopo_walk_info();
		topo_walk_info info = generatedTopo_walk_info;
		commit_list p = new commit_list();
		prio_queue generatedExplore_queue = info.getExplore_queue();
		commit c = generatedExplore_queue.prio_queue_get();
		if (!c) {
			return ;
		} 
		if (.repo_parse_commit_gently(ModernizedCProgram.the_repository, c, 1) < 0) {
			return ;
		} 
		rev_sort_order generatedSort_order = this.getSort_order();
		author_date_slab generatedAuthor_date = info.getAuthor_date();
		if (generatedSort_order == rev_sort_order.REV_SORT_BY_AUTHOR_DATE) {
			.record_author_date(generatedAuthor_date, c);
		} 
		Object generatedMax_age = this.getMax_age();
		Object generatedDate = c.getDate();
		object generatedObject = c.getObject();
		int generatedFlags = generatedObject.getFlags();
		if (generatedMax_age != -1 && (generatedDate < generatedMax_age)) {
			generatedFlags |=  (-1024 << 1);
		} 
		if (ModernizedCProgram.process_parents(revs, c, ((Object)0), ((Object)0)) < 0) {
			return ;
		} 
		if (generatedFlags & (-1024 << 1)) {
			c.mark_parents_uninteresting();
		} 
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		commit_list generatedParents = c.getParents();
		for (p = generatedParents; p; p = generatedNext) {
			ModernizedCProgram.test_flag_and_insert(generatedExplore_queue, generatedItem, (-1024 << 27));
		}
	}
	public void explore_to_depth(Object gen_cutoff) {
		topo_walk_info generatedTopo_walk_info = this.getTopo_walk_info();
		topo_walk_info info = generatedTopo_walk_info;
		commit c = new commit();
		prio_queue generatedExplore_queue = info.getExplore_queue();
		Object generatedGeneration = c.getGeneration();
		while ((c = generatedExplore_queue.prio_queue_peek()) && generatedGeneration >= gen_cutoff) {
			revs.explore_walk_step();
		}
	}
	public void indegree_walk_step() {
		commit_list p = new commit_list();
		topo_walk_info generatedTopo_walk_info = this.getTopo_walk_info();
		topo_walk_info info = generatedTopo_walk_info;
		prio_queue generatedIndegree_queue = info.getIndegree_queue();
		commit c = generatedIndegree_queue.prio_queue_get();
		if (!c) {
			return ;
		} 
		if (.repo_parse_commit_gently(ModernizedCProgram.the_repository, c, 1) < 0) {
			return ;
		} 
		Object generatedGeneration = c.getGeneration();
		revs.explore_to_depth(generatedGeneration);
		commit generatedItem = p.getItem();
		indegree_slab generatedIndegree = info.getIndegree();
		int generatedFirst_parent_only = this.getFirst_parent_only();
		commit_list generatedNext = p.getNext();
		commit_list generatedParents = c.getParents();
		for (p = generatedParents; p; p = generatedNext) {
			commit parent = generatedItem;
			int pi = generatedIndegree.indegree_slab_at(parent);
			if (pi) {
				(pi)++;
			} else {
					pi = 2;
			} 
			ModernizedCProgram.test_flag_and_insert(generatedIndegree_queue, parent, (-1024 << 28));
			if (generatedFirst_parent_only) {
				return ;
			} 
		}
	}
	public void compute_indegrees_to_depth(Object gen_cutoff) {
		topo_walk_info generatedTopo_walk_info = this.getTopo_walk_info();
		topo_walk_info info = generatedTopo_walk_info;
		commit c = new commit();
		prio_queue generatedIndegree_queue = info.getIndegree_queue();
		Object generatedGeneration = c.getGeneration();
		while ((c = generatedIndegree_queue.prio_queue_peek()) && generatedGeneration >= gen_cutoff) {
			revs.indegree_walk_step();
		}
	}
	public void init_topo_walk() {
		topo_walk_info info = new topo_walk_info();
		commit_list list = new commit_list();
		this.setTopo_walk_info(ModernizedCProgram.xmalloc());
		topo_walk_info generatedTopo_walk_info = this.getTopo_walk_info();
		info = generatedTopo_walk_info;
		.memset(info, 0, );
		indegree_slab generatedIndegree = info.getIndegree();
		generatedIndegree.init_indegree_slab();
		prio_queue generatedExplore_queue = info.getExplore_queue();
		.memset(generatedExplore_queue, 0, );
		prio_queue generatedIndegree_queue = info.getIndegree_queue();
		.memset(generatedIndegree_queue, 0, );
		prio_queue generatedTopo_queue = info.getTopo_queue();
		.memset(generatedTopo_queue, 0, );
		author_date_slab generatedAuthor_date = info.getAuthor_date();
		rev_sort_order generatedSort_order = this.getSort_order();
		switch (generatedSort_order) {
		case rev_sort_order.REV_SORT_BY_COMMIT_DATE:
				generatedTopo_queue.setCompare(ModernizedCProgram.compare_commits_by_commit_date);
				break;
		case rev_sort_order.REV_SORT_BY_AUTHOR_DATE:
				generatedAuthor_date.init_author_date_slab();
				generatedTopo_queue.setCompare(ModernizedCProgram.compare_commits_by_author_date);
				generatedTopo_queue.setCb_data(generatedAuthor_date);
				break;
		default:
				generatedTopo_queue.setCompare(((Object)0));
				break;
		}
		generatedExplore_queue.setCompare(ModernizedCProgram.compare_commits_by_gen_then_commit_date);
		generatedIndegree_queue.setCompare(ModernizedCProgram.compare_commits_by_gen_then_commit_date);
		info.setMin_generation(-1024);
		commit generatedItem = list.getItem();
		Object generatedGeneration = c.getGeneration();
		Object generatedMin_generation = info.getMin_generation();
		commit_list generatedNext = list.getNext();
		commit_list generatedCommits = this.getCommits();
		for (list = generatedCommits; list; list = generatedNext) {
			commit c = generatedItem;
			if (.repo_parse_commit_gently(ModernizedCProgram.the_repository, c, 1)) {
				continue;
			} 
			ModernizedCProgram.test_flag_and_insert(generatedExplore_queue, c, (-1024 << 27));
			ModernizedCProgram.test_flag_and_insert(generatedIndegree_queue, c, (-1024 << 28));
			if (generatedGeneration < generatedMin_generation) {
				info.setMin_generation(generatedGeneration);
			} 
			(generatedIndegree.indegree_slab_at(c)) = 1;
			if (generatedSort_order == rev_sort_order.REV_SORT_BY_AUTHOR_DATE) {
				.record_author_date(generatedAuthor_date, c);
			} 
		}
		revs.compute_indegrees_to_depth(generatedMin_generation);
		for (list = generatedCommits; list; list = generatedNext) {
			commit c = generatedItem;
			if ((generatedIndegree.indegree_slab_at(c)) == 1) {
				generatedTopo_queue.prio_queue_put(c/*
					 * This is unfortunate; the initial tips need to be shown
					 * in the order given from the revision traversal machinery.
					 */);
			} 
		}
		if (generatedSort_order == rev_sort_order.REV_SORT_IN_GRAPH_ORDER) {
			generatedTopo_queue.prio_queue_reverse();
		} 
	}
	public int prepare_revision_walk() {
		int i;
		object_array old_pending = new object_array();
		commit_list generatedCommits = this.getCommits();
		commit_list next = generatedCommits;
		object_array generatedPending = this.getPending();
		.memcpy(old_pending, generatedPending, );
		generatedPending.setNr(0);
		generatedPending.setAlloc(0);
		generatedPending.setObjects(((Object)0));
		int generatedNr = old_pending.getNr();
		object_array_entry generatedObjects = old_pending.getObjects();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		for (i = 0; i < generatedNr; i++) {
			object_array_entry e = generatedObjects + i;
			commit commit = ModernizedCProgram.handle_commit(revs, e);
			if (commit) {
				if (!(generatedFlags & (-1024 << 0))) {
					generatedFlags |=  (-1024 << 0);
					next = .commit_list_append(commit, next);
				} 
			} 
		}
		old_pending.object_array_clear();
		int generatedSimplify_merges = this.getSimplify_merges();
		int generatedLimited = this.getLimited();
		decoration generatedTreesame = this.getTreesame();
		if (generatedSimplify_merges || (generatedLimited && ModernizedCProgram.limiting_can_increase_treesame(revs))) {
			generatedTreesame.setName("treesame");
		} 
		int generatedExclude_promisor_objects = this.getExclude_promisor_objects();
		if (generatedExclude_promisor_objects) {
			ModernizedCProgram.for_each_packed_object(mark_uninteresting, revs, for_each_object_flags.FOR_EACH_OBJECT_PROMISOR_ONLY);
		} 
		int generatedNo_walk = this.getNo_walk();
		if (generatedNo_walk != 2) {
			.commit_list_sort_by_date(generatedCommits);
		} 
		if (generatedNo_walk) {
			return 0;
		} 
		int generatedTopo_order = this.getTopo_order();
		rev_sort_order generatedSort_order = this.getSort_order();
		if (generatedLimited) {
			if (revs.limit_list() < 0) {
				return -1;
			} 
			if (generatedTopo_order) {
				.sort_in_topological_order(generatedCommits, generatedSort_order);
			} 
		}  else if (generatedTopo_order) {
			revs.init_topo_walk();
		} 
		int generatedLine_level_traverse = this.getLine_level_traverse();
		if (generatedLine_level_traverse) {
			revs.line_log_filter();
		} 
		if (generatedSimplify_merges) {
			revs.simplify_merges();
		} 
		decoration generatedChildren = this.getChildren();
		Object generatedName = generatedChildren.getName();
		if (generatedName) {
			revs.set_children();
		} 
		return 0;
	}
	public void free_saved_parents() {
		saved_parents generatedSaved_parents_slab = this.getSaved_parents_slab();
		if (generatedSaved_parents_slab) {
			generatedSaved_parents_slab.clear_saved_parents();
		} 
	}
	public void create_boundary_commit_list() {
		int i;
		commit c = new commit();
		object_array generatedBoundary_commits = this.getBoundary_commits();
		object_array array = generatedBoundary_commits;
		object_array_entry generatedObjects = array.getObjects();
		object_array_entry objects = generatedObjects;
		commit_list generatedCommits = this.getCommits();
		if (generatedCommits) {
			.free_commit_list(generatedCommits);
			this.setCommits(((Object)0/*
				 * Put all of the actual boundary commits from revs->boundary_commits
				 * into revs->commits
				 */));
		} 
		int generatedNr = array.getNr();
		object generatedObject = c.getObject();
		int generatedFlags = generatedObject.getFlags();
		for (i = 0; i < generatedNr; i++) {
			c = (commit)(objects[i].getItem());
			if (!c) {
				continue;
			} 
			if (!(generatedFlags & (-1024 << 6))) {
				continue;
			} 
			if (generatedFlags & ((-1024 << 3) | (-1024 << 5))) {
				continue;
			} 
			generatedFlags |=  (-1024 << 5);
			.commit_list_insert(c, generatedCommits);
		}
		rev_sort_order generatedSort_order = this.getSort_order();
		.sort_in_topological_order(generatedCommits, generatedSort_order);
	}
	public void diff_tree_combined(Object oid, Object parents, int dense) {
		diff_options generatedDiffopt = this.getDiffopt();
		diff_options opt = generatedDiffopt;
		diff_options diffopts = new diff_options();
		combine_diff_path p = new combine_diff_path();
		combine_diff_path paths = new combine_diff_path();
		int i;
		int num_paths;
		int needsep;
		int show_log_first;
		int num_parent = parents.getNr();
		int need_generic_pathscan;
		if (!/* nothing to do, if no parents */num_parent) {
			return ;
		} 
		log_info generatedLoginfo = this.getLoginfo();
		int generatedNo_commit_id = this.getNo_commit_id();
		show_log_first = !!generatedLoginfo && !generatedNo_commit_id;
		needsep = 0;
		int generatedVerbose_header = this.getVerbose_header();
		int generatedOutput_format = opt.getOutput_format();
		cmit_fmt generatedCommit_format = this.getCommit_format();
		int generatedLine_termination = opt.getLine_termination();
		if (show_log_first) {
			rev.show_log();
			if (generatedVerbose_header && generatedOutput_format && generatedOutput_format != -1024 && !ModernizedCProgram.commit_format_is_empty(generatedCommit_format)) {
				.printf("%s%c", .diff_line_prefix(opt), generatedLine_termination);
			} 
		} 
		diffopts = opt;
		pathspec generatedPathspec = diffopts.getPathspec();
		generatedPathspec.copy_pathspec(generatedPathspec);
		diff_flags generatedFlags = diffopts.getFlags();
		generatedFlags.setRecursive(1);
		generatedFlags.setAllow_external(0/* find set of paths that everybody touches
			 *
			 * NOTE
			 *
			 * Diffcore transformations are bound to diff_filespec and logic
			 * comparing two entries - i.e. they do not apply directly to combine
			 * diff.
			 *
			 * If some of such transformations is requested - we launch generic
			 * path scanning, which works significantly slower compared to
			 * simultaneous all-trees-in-one-go scan in find_paths_multitree().
			 *
			 * TODO some of the filters could be ported to work on
			 * combine_diff_paths - i.e. all functionality that skips paths, so in
			 * theory, we could end up having only multitree path scanning.
			 *
			 * NOTE please keep this semantically in sync with diffcore_std()
			 */);
		int generatedSkip_stat_unmatch = opt.getSkip_stat_unmatch();
		int generatedFollow_renames = generatedFlags.getFollow_renames();
		int generatedBreak_opt = opt.getBreak_opt();
		int generatedDetect_rename = opt.getDetect_rename();
		int generatedPickaxe_opts = opt.getPickaxe_opts();
		int generatedFilter = opt.getFilter();
		need_generic_pathscan = generatedSkip_stat_unmatch || generatedFollow_renames || generatedBreak_opt != -1 || generatedDetect_rename || (generatedPickaxe_opts & (4 | 8 | 16)) || generatedFilter;
		int generatedCombined_all_paths = this.getCombined_all_paths();
		combine_diff_path combine_diff_path = new combine_diff_path();
		combine_diff_path combine_diff_path = new combine_diff_path();
		Object generatedOrderfile = opt.getOrderfile();
		if (need_generic_pathscan/*
				 * NOTE generic case also handles --stat, as it computes
				 * diff(sha1,parent_i) for all i to do the job, specifically
				 * for parent0.
				 */) {
			paths = combine_diff_path.find_paths_generic(oid, parents, diffopts, generatedCombined_all_paths);
		} else {
				int stat_opt;
				paths = combine_diff_path.find_paths_multitree(oid, parents, diffopts/*
						 * show stat against the first parent even
						 * when doing combined diff.
						 */);
				stat_opt = generatedOutput_format & (-1024 | -1024 | -1024 | -1024 | -1024);
				if (stat_opt) {
					diffopts.setOutput_format(stat_opt);
					diffopts.diff_tree_oid(parents.getOid()[0], oid, "");
					.diffcore_std(diffopts);
					if (generatedOrderfile) {
						ModernizedCProgram.diffcore_order(generatedOrderfile);
					} 
					.diff_flush(diffopts);
				} 
		} 
		combine_diff_path generatedNext = p.getNext();
		for (; p; p = generatedNext) {
			num_paths++;
		}
		if (generatedOrderfile && /* order paths according to diffcore_order */num_paths) {
			obj_order o = new obj_order();
			(o) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (num_paths)));
			for (; p; ) {
				o[i].setObj(p);
			}
			o.order_objects(generatedOrderfile, path_path, num_paths);
			for (i = 0; i < num_paths - 1; i++) {
				p = o[i].getObj();
				p.setNext(o[i + 1].getObj());
			}
			p = o[num_paths - 1].getObj();
			p.setNext(((Object)0));
			paths = o[0].getObj();
			ModernizedCProgram.free(o);
		} 
		if (num_paths) {
			if (generatedOutput_format & (-1024 | -1024 | -1024)) {
				for (p = paths; p; p = generatedNext) {
					ModernizedCProgram.show_raw_diff(p, num_parent, rev);
				}
				needsep = 1;
			}  else if (generatedOutput_format & (-1024 | -1024 | -1024 | -1024 | -1024)) {
				needsep = 1;
			}  else if (generatedOutput_format & -1024) {
				ModernizedCProgram.handle_combined_callback(opt, paths, num_parent, num_paths);
			} 
			if (generatedOutput_format & -1024) {
				if (needsep) {
					.printf("%s%c", .diff_line_prefix(opt), generatedLine_termination);
				} 
				for (p = paths; p; p = generatedNext) {
					ModernizedCProgram.show_patch_diff(p, num_parent, dense, 0, rev);
				}
			} 
		} 
		Object generatedParent = tmp.getParent();
		while (/* Clean things up */paths) {
			combine_diff_path tmp = paths;
			paths = generatedNext;
			for (i = 0; i < num_parent; i++) {
				if (generatedCombined_all_paths && ModernizedCProgram.filename_changed(generatedParent[i].getStatus())) {
					generatedParent[i].getPath().strbuf_release();
				} 
			}
			ModernizedCProgram.free(tmp);
		}
		generatedPathspec.clear_pathspec();
	}
	public void diff_tree_combined_merge(Object commit, int dense) {
		commit_list commit_list = new commit_list();
		commit_list parent = commit_list.get_saved_parents(rev, commit);
		oid_array parents = new oid_array(((Object)0), 0, 0, 0);
		commit generatedItem = parent.getItem();
		object generatedObject = generatedItem.getObject();
		object_id generatedOid = generatedObject.getOid();
		commit_list generatedNext = parent.getNext();
		while (parent) {
			parents.oid_array_append(generatedOid);
			parent = generatedNext;
		}
		rev.diff_tree_combined(generatedOid, parents, dense);
		parents.oid_array_clear();
	}
	public int diff_no_index(int implicit_no_index, int argc, Object argv) {
		int i;
		int no_index;
		byte[] paths = new byte[2];
		strbuf replacement = new strbuf(, , );
		Object generatedPrefix = this.getPrefix();
		byte prefix = generatedPrefix;
		option[] no_index_options = new option[]{new option(parse_opt_type.OPTION_SET_INT, (false), ("no-index"), (no_index), ((Object)0), (""), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NONEG | parse_opt_option_flags.PARSE_OPT_HIDDEN), ((Object)0), (true)), new option(parse_opt_type.OPTION_END)};
		option options = new option();
		diff_options generatedDiffopt = this.getDiffopt();
		option generatedParseopts = generatedDiffopt.getParseopts();
		options = no_index_options.parse_options_concat(generatedParseopts);
		argc = ModernizedCProgram.parse_options(argc, argv, generatedPrefix, options, ModernizedCProgram.diff_no_index_usage, 0);
		if (argc != 2) {
			if (implicit_no_index) {
				ModernizedCProgram.warning(ModernizedCProgram._("Not a git repository. Use --no-index to compare two paths outside a working tree"));
			} 
			ModernizedCProgram.usage_with_options(ModernizedCProgram.diff_no_index_usage, options);
		} 
		do {
			ModernizedCProgram.free(options);
			(options) = ((Object)0);
		} while (0);
		for (i = 0; i < 2; i++) {
			byte p = argv[argc - 2 + i];
			if (!.strcmp(p, "-"/*
						 * stdin should be spelled as "-"; if you have
						 * path that is "-", spell it as "./-".
						 */)) {
				p = ModernizedCProgram.file_from_standard_input;
			}  else if (prefix) {
				p = ModernizedCProgram.prefix_filename(prefix, p);
			} 
			paths[i] = p;
		}
		replacement.fixup_paths(paths);
		generatedDiffopt.setSkip_stat_unmatch(1);
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		if (!generatedOutput_format) {
			generatedDiffopt.setOutput_format(-1024);
		} 
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		generatedFlags.setNo_index(1);
		generatedFlags.setRelative_name(1);
		generatedDiffopt.setPrefix(prefix);
		this.setMax_count(-2);
		.diff_setup_done(generatedDiffopt);
		.setup_diff_pager(generatedDiffopt);
		generatedFlags.setExit_with_status(1);
		if (generatedDiffopt.queue_diff(paths[0], paths[1])) {
			return 1;
		} 
		.diff_set_mnemonic_prefix(generatedDiffopt, "1/", "2/");
		.diffcore_std(generatedDiffopt);
		.diff_flush(generatedDiffopt);
		replacement/*
			 * The return code for --no-index imitates diff(1):
			 * 0 = no changes, 1 = changes, else error
			 */.strbuf_release();
		return .diff_result_code(generatedDiffopt, 0);
	}
	public commit_list getCommits() {
		return commits;
	}
	public void setCommits(commit_list newCommits) {
		commits = newCommits;
	}
	public object_array getPending() {
		return pending;
	}
	public void setPending(object_array newPending) {
		pending = newPending;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public object_array getBoundary_commits() {
		return boundary_commits;
	}
	public void setBoundary_commits(object_array newBoundary_commits) {
		boundary_commits = newBoundary_commits;
	}
	public rev_cmdline_info getCmdline() {
		return cmdline;
	}
	public void setCmdline(rev_cmdline_info newCmdline) {
		cmdline = newCmdline;
	}
	public string_list getRef_excludes() {
		return ref_excludes;
	}
	public void setRef_excludes(string_list newRef_excludes) {
		ref_excludes = newRef_excludes;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public Object getDef() {
		return def;
	}
	public void setDef(Object newDef) {
		def = newDef;
	}
	public pathspec getPrune_data() {
		return prune_data;
	}
	public void setPrune_data(pathspec newPrune_data) {
		prune_data = newPrune_data;
	}
	public int getRev_input_given() {
		return rev_input_given;
	}
	public void setRev_input_given(int newRev_input_given) {
		rev_input_given = newRev_input_given;
	}
	public int getRead_from_stdin() {
		return read_from_stdin;
	}
	public void setRead_from_stdin(int newRead_from_stdin) {
		read_from_stdin = newRead_from_stdin;
	}
	public rev_sort_order getSort_order() {
		return sort_order;
	}
	public void setSort_order(rev_sort_order newSort_order) {
		sort_order = newSort_order;
	}
	public int getEarly_output() {
		return early_output;
	}
	public void setEarly_output(int newEarly_output) {
		early_output = newEarly_output;
	}
	public int getIgnore_missing() {
		return ignore_missing;
	}
	public void setIgnore_missing(int newIgnore_missing) {
		ignore_missing = newIgnore_missing;
	}
	public int getIgnore_missing_links() {
		return ignore_missing_links;
	}
	public void setIgnore_missing_links(int newIgnore_missing_links) {
		ignore_missing_links = newIgnore_missing_links;
	}
	public int getDense() {
		return dense;
	}
	public void setDense(int newDense) {
		dense = newDense;
	}
	public int getPrune() {
		return prune;
	}
	public void setPrune(int newPrune) {
		prune = newPrune;
	}
	public int getNo_walk() {
		return no_walk;
	}
	public void setNo_walk(int newNo_walk) {
		no_walk = newNo_walk;
	}
	public int getRemove_empty_trees() {
		return remove_empty_trees;
	}
	public void setRemove_empty_trees(int newRemove_empty_trees) {
		remove_empty_trees = newRemove_empty_trees;
	}
	public int getSimplify_history() {
		return simplify_history;
	}
	public void setSimplify_history(int newSimplify_history) {
		simplify_history = newSimplify_history;
	}
	public int getTopo_order() {
		return topo_order;
	}
	public void setTopo_order(int newTopo_order) {
		topo_order = newTopo_order;
	}
	public int getSimplify_merges() {
		return simplify_merges;
	}
	public void setSimplify_merges(int newSimplify_merges) {
		simplify_merges = newSimplify_merges;
	}
	public int getSimplify_by_decoration() {
		return simplify_by_decoration;
	}
	public void setSimplify_by_decoration(int newSimplify_by_decoration) {
		simplify_by_decoration = newSimplify_by_decoration;
	}
	public int getSingle_worktree() {
		return single_worktree;
	}
	public void setSingle_worktree(int newSingle_worktree) {
		single_worktree = newSingle_worktree;
	}
	public int getTag_objects() {
		return tag_objects;
	}
	public void setTag_objects(int newTag_objects) {
		tag_objects = newTag_objects;
	}
	public int getTree_objects() {
		return tree_objects;
	}
	public void setTree_objects(int newTree_objects) {
		tree_objects = newTree_objects;
	}
	public int getBlob_objects() {
		return blob_objects;
	}
	public void setBlob_objects(int newBlob_objects) {
		blob_objects = newBlob_objects;
	}
	public int getVerify_objects() {
		return verify_objects;
	}
	public void setVerify_objects(int newVerify_objects) {
		verify_objects = newVerify_objects;
	}
	public int getEdge_hint() {
		return edge_hint;
	}
	public void setEdge_hint(int newEdge_hint) {
		edge_hint = newEdge_hint;
	}
	public int getEdge_hint_aggressive() {
		return edge_hint_aggressive;
	}
	public void setEdge_hint_aggressive(int newEdge_hint_aggressive) {
		edge_hint_aggressive = newEdge_hint_aggressive;
	}
	public int getLimited() {
		return limited;
	}
	public void setLimited(int newLimited) {
		limited = newLimited;
	}
	public int getUnpacked() {
		return unpacked;
	}
	public void setUnpacked(int newUnpacked) {
		unpacked = newUnpacked;
	}
	public int getBoundary() {
		return boundary;
	}
	public void setBoundary(int newBoundary) {
		boundary = newBoundary;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getLeft_right() {
		return left_right;
	}
	public void setLeft_right(int newLeft_right) {
		left_right = newLeft_right;
	}
	public int getLeft_only() {
		return left_only;
	}
	public void setLeft_only(int newLeft_only) {
		left_only = newLeft_only;
	}
	public int getRight_only() {
		return right_only;
	}
	public void setRight_only(int newRight_only) {
		right_only = newRight_only;
	}
	public int getRewrite_parents() {
		return rewrite_parents;
	}
	public void setRewrite_parents(int newRewrite_parents) {
		rewrite_parents = newRewrite_parents;
	}
	public int getPrint_parents() {
		return print_parents;
	}
	public void setPrint_parents(int newPrint_parents) {
		print_parents = newPrint_parents;
	}
	public int getShow_decorations() {
		return show_decorations;
	}
	public void setShow_decorations(int newShow_decorations) {
		show_decorations = newShow_decorations;
	}
	public int getReverse() {
		return reverse;
	}
	public void setReverse(int newReverse) {
		reverse = newReverse;
	}
	public int getReverse_output_stage() {
		return reverse_output_stage;
	}
	public void setReverse_output_stage(int newReverse_output_stage) {
		reverse_output_stage = newReverse_output_stage;
	}
	public int getCherry_pick() {
		return cherry_pick;
	}
	public void setCherry_pick(int newCherry_pick) {
		cherry_pick = newCherry_pick;
	}
	public int getCherry_mark() {
		return cherry_mark;
	}
	public void setCherry_mark(int newCherry_mark) {
		cherry_mark = newCherry_mark;
	}
	public int getBisect() {
		return bisect;
	}
	public void setBisect(int newBisect) {
		bisect = newBisect;
	}
	public int getAncestry_path() {
		return ancestry_path;
	}
	public void setAncestry_path(int newAncestry_path) {
		ancestry_path = newAncestry_path;
	}
	public int getFirst_parent_only() {
		return first_parent_only;
	}
	public void setFirst_parent_only(int newFirst_parent_only) {
		first_parent_only = newFirst_parent_only;
	}
	public int getLine_level_traverse() {
		return line_level_traverse;
	}
	public void setLine_level_traverse(int newLine_level_traverse) {
		line_level_traverse = newLine_level_traverse;
	}
	public int getTree_blobs_in_commit_order() {
		return tree_blobs_in_commit_order;
	}
	public void setTree_blobs_in_commit_order(int newTree_blobs_in_commit_order) {
		tree_blobs_in_commit_order = newTree_blobs_in_commit_order;
	}
	public int getDo_not_die_on_missing_tree() {
		return do_not_die_on_missing_tree;
	}
	public void setDo_not_die_on_missing_tree(int newDo_not_die_on_missing_tree) {
		do_not_die_on_missing_tree = newDo_not_die_on_missing_tree;
	}
	public int getExclude_promisor_objects() {
		return exclude_promisor_objects;
	}
	public void setExclude_promisor_objects(int newExclude_promisor_objects) {
		exclude_promisor_objects = newExclude_promisor_objects;
	}
	public int getDiff() {
		return diff;
	}
	public void setDiff(int newDiff) {
		diff = newDiff;
	}
	public int getFull_diff() {
		return full_diff;
	}
	public void setFull_diff(int newFull_diff) {
		full_diff = newFull_diff;
	}
	public int getShow_root_diff() {
		return show_root_diff;
	}
	public void setShow_root_diff(int newShow_root_diff) {
		show_root_diff = newShow_root_diff;
	}
	public int getNo_commit_id() {
		return no_commit_id;
	}
	public void setNo_commit_id(int newNo_commit_id) {
		no_commit_id = newNo_commit_id;
	}
	public int getVerbose_header() {
		return verbose_header;
	}
	public void setVerbose_header(int newVerbose_header) {
		verbose_header = newVerbose_header;
	}
	public int getIgnore_merges() {
		return ignore_merges;
	}
	public void setIgnore_merges(int newIgnore_merges) {
		ignore_merges = newIgnore_merges;
	}
	public int getCombine_merges() {
		return combine_merges;
	}
	public void setCombine_merges(int newCombine_merges) {
		combine_merges = newCombine_merges;
	}
	public int getCombined_all_paths() {
		return combined_all_paths;
	}
	public void setCombined_all_paths(int newCombined_all_paths) {
		combined_all_paths = newCombined_all_paths;
	}
	public int getDense_combined_merges() {
		return dense_combined_merges;
	}
	public void setDense_combined_merges(int newDense_combined_merges) {
		dense_combined_merges = newDense_combined_merges;
	}
	public int getAlways_show_header() {
		return always_show_header;
	}
	public void setAlways_show_header(int newAlways_show_header) {
		always_show_header = newAlways_show_header;
	}
	public int getShown_one() {
		return shown_one;
	}
	public void setShown_one(int newShown_one) {
		shown_one = newShown_one;
	}
	public int getShown_dashes() {
		return shown_dashes;
	}
	public void setShown_dashes(int newShown_dashes) {
		shown_dashes = newShown_dashes;
	}
	public int getShow_merge() {
		return show_merge;
	}
	public void setShow_merge(int newShow_merge) {
		show_merge = newShow_merge;
	}
	public int getShow_notes() {
		return show_notes;
	}
	public void setShow_notes(int newShow_notes) {
		show_notes = newShow_notes;
	}
	public int getShow_notes_given() {
		return show_notes_given;
	}
	public void setShow_notes_given(int newShow_notes_given) {
		show_notes_given = newShow_notes_given;
	}
	public int getShow_signature() {
		return show_signature;
	}
	public void setShow_signature(int newShow_signature) {
		show_signature = newShow_signature;
	}
	public int getPretty_given() {
		return pretty_given;
	}
	public void setPretty_given(int newPretty_given) {
		pretty_given = newPretty_given;
	}
	public int getAbbrev_commit() {
		return abbrev_commit;
	}
	public void setAbbrev_commit(int newAbbrev_commit) {
		abbrev_commit = newAbbrev_commit;
	}
	public int getAbbrev_commit_given() {
		return abbrev_commit_given;
	}
	public void setAbbrev_commit_given(int newAbbrev_commit_given) {
		abbrev_commit_given = newAbbrev_commit_given;
	}
	public int getZero_commit() {
		return zero_commit;
	}
	public void setZero_commit(int newZero_commit) {
		zero_commit = newZero_commit;
	}
	public int getUse_terminator() {
		return use_terminator;
	}
	public void setUse_terminator(int newUse_terminator) {
		use_terminator = newUse_terminator;
	}
	public int getMissing_newline() {
		return missing_newline;
	}
	public void setMissing_newline(int newMissing_newline) {
		missing_newline = newMissing_newline;
	}
	public int getDate_mode_explicit() {
		return date_mode_explicit;
	}
	public void setDate_mode_explicit(int newDate_mode_explicit) {
		date_mode_explicit = newDate_mode_explicit;
	}
	public int getPreserve_subject() {
		return preserve_subject;
	}
	public void setPreserve_subject(int newPreserve_subject) {
		preserve_subject = newPreserve_subject;
	}
	public int getDisable_stdin() {
		return disable_stdin;
	}
	public void setDisable_stdin(int newDisable_stdin) {
		disable_stdin = newDisable_stdin;
	}
	public int getTrack_linear() {
		return track_linear;
	}
	public void setTrack_linear(int newTrack_linear) {
		track_linear = newTrack_linear;
	}
	public int getTrack_first_time() {
		return track_first_time;
	}
	public void setTrack_first_time(int newTrack_first_time) {
		track_first_time = newTrack_first_time;
	}
	public int getLinear() {
		return linear;
	}
	public void setLinear(int newLinear) {
		linear = newLinear;
	}
	public date_mode getDate_mode() {
		return date_mode;
	}
	public void setDate_mode(date_mode newDate_mode) {
		date_mode = newDate_mode;
	}
	public int getExpand_tabs_in_log() {
		return expand_tabs_in_log;
	}
	public void setExpand_tabs_in_log(int newExpand_tabs_in_log) {
		expand_tabs_in_log = newExpand_tabs_in_log;
	}
	public int getExpand_tabs_in_log_default() {
		return expand_tabs_in_log_default;
	}
	public void setExpand_tabs_in_log_default(int newExpand_tabs_in_log_default) {
		expand_tabs_in_log_default = newExpand_tabs_in_log_default;
	}
	public int getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(int newAbbrev) {
		abbrev = newAbbrev;
	}
	public cmit_fmt getCommit_format() {
		return commit_format;
	}
	public void setCommit_format(cmit_fmt newCommit_format) {
		commit_format = newCommit_format;
	}
	public log_info getLoginfo() {
		return loginfo;
	}
	public void setLoginfo(log_info newLoginfo) {
		loginfo = newLoginfo;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int newTotal) {
		total = newTotal;
	}
	public Object getMime_boundary() {
		return mime_boundary;
	}
	public void setMime_boundary(Object newMime_boundary) {
		mime_boundary = newMime_boundary;
	}
	public Object getPatch_suffix() {
		return patch_suffix;
	}
	public void setPatch_suffix(Object newPatch_suffix) {
		patch_suffix = newPatch_suffix;
	}
	public int getNumbered_files() {
		return numbered_files;
	}
	public void setNumbered_files(int newNumbered_files) {
		numbered_files = newNumbered_files;
	}
	public int getReroll_count() {
		return reroll_count;
	}
	public void setReroll_count(int newReroll_count) {
		reroll_count = newReroll_count;
	}
	public Byte getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Byte newMessage_id) {
		message_id = newMessage_id;
	}
	public ident_split getFrom_ident() {
		return from_ident;
	}
	public void setFrom_ident(ident_split newFrom_ident) {
		from_ident = newFrom_ident;
	}
	public string_list getRef_message_ids() {
		return ref_message_ids;
	}
	public void setRef_message_ids(string_list newRef_message_ids) {
		ref_message_ids = newRef_message_ids;
	}
	public int getAdd_signoff() {
		return add_signoff;
	}
	public void setAdd_signoff(int newAdd_signoff) {
		add_signoff = newAdd_signoff;
	}
	public Object getExtra_headers() {
		return extra_headers;
	}
	public void setExtra_headers(Object newExtra_headers) {
		extra_headers = newExtra_headers;
	}
	public Object getLog_reencode() {
		return log_reencode;
	}
	public void setLog_reencode(Object newLog_reencode) {
		log_reencode = newLog_reencode;
	}
	public Object getSubject_prefix() {
		return subject_prefix;
	}
	public void setSubject_prefix(Object newSubject_prefix) {
		subject_prefix = newSubject_prefix;
	}
	public int getNo_inline() {
		return no_inline;
	}
	public void setNo_inline(int newNo_inline) {
		no_inline = newNo_inline;
	}
	public int getShow_log_size() {
		return show_log_size;
	}
	public void setShow_log_size(int newShow_log_size) {
		show_log_size = newShow_log_size;
	}
	public string_list getMailmap() {
		return mailmap;
	}
	public void setMailmap(string_list newMailmap) {
		mailmap = newMailmap;
	}
	public grep_opt getGrep_filter() {
		return grep_filter;
	}
	public void setGrep_filter(grep_opt newGrep_filter) {
		grep_filter = newGrep_filter;
	}
	public int getInvert_grep() {
		return invert_grep;
	}
	public void setInvert_grep(int newInvert_grep) {
		invert_grep = newInvert_grep;
	}
	public git_graph getGraph() {
		return graph;
	}
	public void setGraph(git_graph newGraph) {
		graph = newGraph;
	}
	public int getSkip_count() {
		return skip_count;
	}
	public void setSkip_count(int newSkip_count) {
		skip_count = newSkip_count;
	}
	public int getMax_count() {
		return max_count;
	}
	public void setMax_count(int newMax_count) {
		max_count = newMax_count;
	}
	public Object getMax_age() {
		return max_age;
	}
	public void setMax_age(Object newMax_age) {
		max_age = newMax_age;
	}
	public Object getMin_age() {
		return min_age;
	}
	public void setMin_age(Object newMin_age) {
		min_age = newMin_age;
	}
	public int getMin_parents() {
		return min_parents;
	}
	public void setMin_parents(int newMin_parents) {
		min_parents = newMin_parents;
	}
	public int getMax_parents() {
		return max_parents;
	}
	public void setMax_parents(int newMax_parents) {
		max_parents = newMax_parents;
	}
	public Object getInclude_check() {
		return include_check;
	}
	public void setInclude_check(Object newInclude_check) {
		include_check = newInclude_check;
	}
	public Object getInclude_check_data() {
		return include_check_data;
	}
	public void setInclude_check_data(Object newInclude_check_data) {
		include_check_data = newInclude_check_data;
	}
	public diff_options getDiffopt() {
		return diffopt;
	}
	public void setDiffopt(diff_options newDiffopt) {
		diffopt = newDiffopt;
	}
	public diff_options getPruning() {
		return pruning;
	}
	public void setPruning(diff_options newPruning) {
		pruning = newPruning;
	}
	public reflog_walk_info getReflog_info() {
		return reflog_info;
	}
	public void setReflog_info(reflog_walk_info newReflog_info) {
		reflog_info = newReflog_info;
	}
	public decoration getChildren() {
		return children;
	}
	public void setChildren(decoration newChildren) {
		children = newChildren;
	}
	public decoration getMerge_simplification() {
		return merge_simplification;
	}
	public void setMerge_simplification(decoration newMerge_simplification) {
		merge_simplification = newMerge_simplification;
	}
	public decoration getTreesame() {
		return treesame;
	}
	public void setTreesame(decoration newTreesame) {
		treesame = newTreesame;
	}
	public display_notes_opt getNotes_opt() {
		return notes_opt;
	}
	public void setNotes_opt(display_notes_opt newNotes_opt) {
		notes_opt = newNotes_opt;
	}
	public Object getIdiff_oid1() {
		return idiff_oid1;
	}
	public void setIdiff_oid1(Object newIdiff_oid1) {
		idiff_oid1 = newIdiff_oid1;
	}
	public Object getIdiff_oid2() {
		return idiff_oid2;
	}
	public void setIdiff_oid2(Object newIdiff_oid2) {
		idiff_oid2 = newIdiff_oid2;
	}
	public Object getIdiff_title() {
		return idiff_title;
	}
	public void setIdiff_title(Object newIdiff_title) {
		idiff_title = newIdiff_title;
	}
	public Object getRdiff1() {
		return rdiff1;
	}
	public void setRdiff1(Object newRdiff1) {
		rdiff1 = newRdiff1;
	}
	public Object getRdiff2() {
		return rdiff2;
	}
	public void setRdiff2(Object newRdiff2) {
		rdiff2 = newRdiff2;
	}
	public int getCreation_factor() {
		return creation_factor;
	}
	public void setCreation_factor(int newCreation_factor) {
		creation_factor = newCreation_factor;
	}
	public Object getRdiff_title() {
		return rdiff_title;
	}
	public void setRdiff_title(Object newRdiff_title) {
		rdiff_title = newRdiff_title;
	}
	public int getCount_left() {
		return count_left;
	}
	public void setCount_left(int newCount_left) {
		count_left = newCount_left;
	}
	public int getCount_right() {
		return count_right;
	}
	public void setCount_right(int newCount_right) {
		count_right = newCount_right;
	}
	public int getCount_same() {
		return count_same;
	}
	public void setCount_same(int newCount_same) {
		count_same = newCount_same;
	}
	public decoration getLine_log_data() {
		return line_log_data;
	}
	public void setLine_log_data(decoration newLine_log_data) {
		line_log_data = newLine_log_data;
	}
	public saved_parents getSaved_parents_slab() {
		return saved_parents_slab;
	}
	public void setSaved_parents_slab(saved_parents newSaved_parents_slab) {
		saved_parents_slab = newSaved_parents_slab;
	}
	public commit_list getPrevious_parents() {
		return previous_parents;
	}
	public void setPrevious_parents(commit_list newPrevious_parents) {
		previous_parents = newPrevious_parents;
	}
	public Object getBreak_bar() {
		return break_bar;
	}
	public void setBreak_bar(Object newBreak_bar) {
		break_bar = newBreak_bar;
	}
	public revision_sources getSources() {
		return sources;
	}
	public void setSources(revision_sources newSources) {
		sources = newSources;
	}
	public topo_walk_info getTopo_walk_info() {
		return topo_walk_info;
	}
	public void setTopo_walk_info(topo_walk_info newTopo_walk_info) {
		topo_walk_info = newTopo_walk_info;
	}
}
/* Starting list */
