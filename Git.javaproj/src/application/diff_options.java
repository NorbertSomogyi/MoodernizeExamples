package application;

public class diff_options {
	private Object orderfile;
	private Object[] pickaxe;
	private Object single_follow;
	private Object a_prefix;
	private Object b_prefix;
	private Object line_prefix;
	private Object line_prefix_length;
	private diff_flags flags;
	private int filter;
	private int use_color;
	private int context;
	private int interhunkcontext;
	private int break_opt;
	private int detect_rename;
	private int irreversible_delete;
	private int skip_stat_unmatch;
	private int line_termination;
	private int output_format;
	private int pickaxe_opts;
	private int rename_score;
	private int rename_limit;
	private int needed_rename_limit;
	private int degraded_cc_to_c;
	private int show_rename_progress;
	private int dirstat_permille;
	private int setup;
	private int abbrev;
	private int ita_invisible_in_index;
	private int ws_error_highlight;
	private Object prefix;
	private int prefix_length;
	private Object stat_sep;
	private int xdl_opts;
	private Byte anchors;
	private Object anchors_nr;
	private Object anchors_alloc;
	private int stat_width;
	private int stat_name_width;
	private int stat_graph_width;
	private int stat_count;
	private Object word_regex;
	private diff_words_type word_diff;
	private diff_submodule_format submodule_format;
	private oidset objfind;
	private int found_changes;
	private int found_follow;
	private Object set_default;
	private _iobuf file;
	private int close_file;
	private Object output_indicators;
	private pathspec pathspec;
	private Object pathchange;
	private Object change;
	private Object add_remove;
	private Object change_fn_data;
	private Object format_callback;
	private Object format_callback_data;
	private Object output_prefix;
	private Object output_prefix_data;
	private int diff_path_counter;
	private emitted_diff_symbols emitted_symbols;
	private  color_moved;
	private int color_moved_ws_handling;
	private repository repo;
	private option parseopts;
	
	public diff_options(Object orderfile, Object[] pickaxe, Object single_follow, Object a_prefix, Object b_prefix, Object line_prefix, Object line_prefix_length, diff_flags flags, int filter, int use_color, int context, int interhunkcontext, int break_opt, int detect_rename, int irreversible_delete, int skip_stat_unmatch, int line_termination, int output_format, int pickaxe_opts, int rename_score, int rename_limit, int needed_rename_limit, int degraded_cc_to_c, int show_rename_progress, int dirstat_permille, int setup, int abbrev, int ita_invisible_in_index, int ws_error_highlight, Object prefix, int prefix_length, Object stat_sep, int xdl_opts, Byte anchors, Object anchors_nr, Object anchors_alloc, int stat_width, int stat_name_width, int stat_graph_width, int stat_count, Object word_regex, diff_words_type word_diff, diff_submodule_format submodule_format, oidset objfind, int found_changes, int found_follow, Object set_default, _iobuf file, int close_file, Object output_indicators, pathspec pathspec, Object pathchange, Object change, Object add_remove, Object change_fn_data, Object format_callback, Object format_callback_data, Object output_prefix, Object output_prefix_data, int diff_path_counter, emitted_diff_symbols emitted_symbols,  color_moved, int color_moved_ws_handling, repository repo, option parseopts) {
		setOrderfile(orderfile);
		setPickaxe(pickaxe);
		setSingle_follow(single_follow);
		setA_prefix(a_prefix);
		setB_prefix(b_prefix);
		setLine_prefix(line_prefix);
		setLine_prefix_length(line_prefix_length);
		setFlags(flags);
		setFilter(filter);
		setUse_color(use_color);
		setContext(context);
		setInterhunkcontext(interhunkcontext);
		setBreak_opt(break_opt);
		setDetect_rename(detect_rename);
		setIrreversible_delete(irreversible_delete);
		setSkip_stat_unmatch(skip_stat_unmatch);
		setLine_termination(line_termination);
		setOutput_format(output_format);
		setPickaxe_opts(pickaxe_opts);
		setRename_score(rename_score);
		setRename_limit(rename_limit);
		setNeeded_rename_limit(needed_rename_limit);
		setDegraded_cc_to_c(degraded_cc_to_c);
		setShow_rename_progress(show_rename_progress);
		setDirstat_permille(dirstat_permille);
		setSetup(setup);
		setAbbrev(abbrev);
		setIta_invisible_in_index(ita_invisible_in_index);
		setWs_error_highlight(ws_error_highlight);
		setPrefix(prefix);
		setPrefix_length(prefix_length);
		setStat_sep(stat_sep);
		setXdl_opts(xdl_opts);
		setAnchors(anchors);
		setAnchors_nr(anchors_nr);
		setAnchors_alloc(anchors_alloc);
		setStat_width(stat_width);
		setStat_name_width(stat_name_width);
		setStat_graph_width(stat_graph_width);
		setStat_count(stat_count);
		setWord_regex(word_regex);
		setWord_diff(word_diff);
		setSubmodule_format(submodule_format);
		setObjfind(objfind);
		setFound_changes(found_changes);
		setFound_follow(found_follow);
		setSet_default(set_default);
		setFile(file);
		setClose_file(close_file);
		setOutput_indicators(output_indicators);
		setPathspec(pathspec);
		setPathchange(pathchange);
		setChange(change);
		setAdd_remove(add_remove);
		setChange_fn_data(change_fn_data);
		setFormat_callback(format_callback);
		setFormat_callback_data(format_callback_data);
		setOutput_prefix(output_prefix);
		setOutput_prefix_data(output_prefix_data);
		setDiff_path_counter(diff_path_counter);
		setEmitted_symbols(emitted_symbols);
		setColor_moved(color_moved);
		setColor_moved_ws_handling(color_moved_ws_handling);
		setRepo(repo);
		setParseopts(parseopts);
	}
	public diff_options() {
	}
	
	public Byte output_prefix() {
		byte prefix = "";
		Object generatedOutput_prefix = this.getOutput_prefix();
		Object generatedOutput_prefix_data = this.getOutput_prefix_data();
		byte[] generatedBuf = sb.getBuf();
		if (generatedOutput_prefix) {
			strbuf sb = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(opt, generatedOutput_prefix_data);
			prefix = generatedBuf;
		} 
		return prefix;
	}
	public int queue_diff(Object name1, Object name2) {
		int mode1 = 0;
		int mode2 = 0;
		if (ModernizedCProgram.get_mode(name1, mode1) || ModernizedCProgram.get_mode(name2, mode2)) {
			return -1;
		} 
		diff_filespec diff_filespec = new diff_filespec();
		if (mode1 && mode2 && (((mode1) & -1024) == -1024) != (((mode2) & -1024) == -1024)) {
			diff_filespec d1 = new diff_filespec();
			diff_filespec d2 = new diff_filespec();
			if ((((mode1) & -1024) == -1024)) {
				d1 = diff_filespec.noindex_filespec(((Object)0), /* 2 is file that is created */0);
				d2 = diff_filespec.noindex_filespec(name2, mode2);
				name2 = ((Object)0);
				mode2 = 0;
			} else {
					d1 = diff_filespec.noindex_filespec(name1, /* 1 is file that is deleted */mode1);
					d2 = diff_filespec.noindex_filespec(((Object)0), 0);
					name1 = ((Object)0);
					mode1 = 0;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_queue(ModernizedCProgram.diff_queued_diff, d1, /* emit that file */d2/* and then let the entire directory be created or deleted */);
		} 
		Object generatedLen = buffer1.getLen();
		int generatedNr = p1.getNr();
		string_list_item[] generatedItems = p1.getItems();
		byte[] generatedBuf = buffer1.getBuf();
		diff_flags generatedFlags = this.getFlags();
		int generatedReverse_diff = generatedFlags.getReverse_diff();
		if ((((mode1) & -1024) == -1024) || (((mode2) & -1024) == -1024)) {
			strbuf buffer1 = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			strbuf buffer2 = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			string_list p1 = new string_list(((Object)0), 0, 0, 1, ((Object)0));
			string_list p2 = new string_list(((Object)0), 0, 0, 1, ((Object)0));
			int i1;
			int i2;
			int ret = 0;
			size_t len1 = 0;
			size_t len2 = 0;
			if (name1 && p1.read_directory_contents(name1)) {
				return -1;
			} 
			if (name2 && p2.read_directory_contents(name2)) {
				p1.string_list_clear(0);
				return -1;
			} 
			if (name1) {
				buffer1.strbuf_addstr(name1);
				buffer1.strbuf_complete((byte)'/');
				len1 = generatedLen;
			} 
			if (name2) {
				buffer2.strbuf_addstr(name2);
				buffer2.strbuf_complete((byte)'/');
				len2 = generatedLen;
			} 
			for (i1 = i2 = 0; !ret && (i1 < generatedNr || i2 < generatedNr); /*Error: Unsupported expression*/) {
				byte n1;
				byte n2;
				int comp;
				buffer1.strbuf_setlen(len1);
				buffer2.strbuf_setlen(len2);
				if (i1 == generatedNr) {
					comp = 1;
				}  else if (i2 == generatedNr) {
					comp = -1;
				} else {
						comp = /*Error: Function owner not recognized*/strcmp(generatedItems[i1].getString(), generatedItems[i2].getString());
				} 
				if (comp > 0) {
					n1 = ((Object)0);
				} else {
						buffer1.strbuf_addstr(generatedItems[i1++].getString());
						n1 = generatedBuf;
				} 
				if (comp < 0) {
					n2 = ((Object)0);
				} else {
						buffer2.strbuf_addstr(generatedItems[i2++].getString());
						n2 = generatedBuf;
				} 
				ret = o.queue_diff(n1, n2);
			}
			p1.string_list_clear(0);
			p2.string_list_clear(0);
			buffer1.strbuf_release();
			buffer2.strbuf_release();
			return ret;
		} else {
				diff_filespec d1 = new diff_filespec();
				diff_filespec d2 = new diff_filespec();
				if (generatedReverse_diff) {
					do {
						Object _swap_a_ptr = (mode1);
						Object _swap_b_ptr = (mode2);
						byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
					} while (0);
					do {
						Object _swap_a_ptr = (name1);
						Object _swap_b_ptr = (name2);
						byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
					} while (0);
				} 
				d1 = diff_filespec.noindex_filespec(name1, mode1);
				d2 = diff_filespec.noindex_filespec(name2, mode2);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_queue(ModernizedCProgram.diff_queued_diff, d1, d2);
				return 0;
		} 
	}
	public int get_stat_data(Object ce, Object oidp, Integer modep, int cached, int match_missing, Integer dirty_submodule) {
		object_id oid = ce.getOid();
		int mode = ce.getCe_mode();
		Object generatedSt_mode = st.getSt_mode();
		if (!cached && !((ce).getCe_flags() & (1 << 18))) {
			int changed;
			stat st = new stat();
			changed = st.check_removed(ce);
			if (changed < 0) {
				return -1;
			}  else if (changed) {
				if (match_missing) {
					oidp = oid;
					modep = mode;
					return 0;
				} 
				return -1;
			} 
			changed = ModernizedCProgram.match_stat_with_submodule(diffopt, ce, st, 0, dirty_submodule);
			if (changed) {
				mode = ModernizedCProgram.ce_mode_from_stat(ce, generatedSt_mode);
				oid = ModernizedCProgram.null_oid;
			} 
		} 
		oidp = oid;
		modep = mode;
		return 0;
	}
	public int do_diff_cache(Object tree_oid) {
		rev_info revs = new rev_info();
		repository generatedRepo = this.getRepo();
		ModernizedCProgram.repo_init_revisions(generatedRepo, revs, ((Object)0));
		pathspec generatedPrune_data = revs.getPrune_data();
		pathspec generatedPathspec = this.getPathspec();
		generatedPrune_data.copy_pathspec(generatedPathspec);
		revs.setDiffopt(opt);
		if (revs.diff_cache(tree_oid, ((Object)0), 1)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\diff-lib.c", 550, (true)));
		} 
		return 0;
	}
	public void diffcore_pickaxe() {
		Object[] generatedPickaxe = this.getPickaxe();
		byte needle = generatedPickaxe;
		int generatedPickaxe_opts = this.getPickaxe_opts();
		int opts = generatedPickaxe_opts;
		regex_t regex = new regex_t();
		regex_t regexp = ((Object)0);
		kwset_t kws = ((Object)0);
		byte[] generatedBuf = sb.getBuf();
		if (opts & (2 | 8)) {
			int cflags = 1 | ((1 << 1) << 1);
			if (generatedPickaxe_opts & 32) {
				cflags |=  (1 << 1);
			} 
			regex.regcomp_or_die(needle, cflags);
			regexp = regex;
		}  else if (opts & 4) {
			if (generatedPickaxe_opts & 32 && ModernizedCProgram.has_non_ascii(needle)) {
				strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				int cflags = ((1 << 1) << 1) | (1 << 1);
				sb.basic_regex_quote_buf(needle);
				regex.regcomp_or_die(generatedBuf, cflags);
				sb.strbuf_release();
				regexp = regex;
			} else {
					kws = ModernizedCProgram.kwsalloc(generatedPickaxe_opts & 32 ? ModernizedCProgram.tolower_trans_tbl : ((Object)0));
					ModernizedCProgram.kwsincr(kws, needle, /*Error: Function owner not recognized*/strlen(needle));
					ModernizedCProgram.kwsprep(kws);
			} 
		} 
		ModernizedCProgram.pickaxe(ModernizedCProgram.diff_queued_diff, o, regexp, kws, (opts & 8) ? diff_grep : has_changes);
		if (regexp) {
			ModernizedCProgram.regfree(regexp);
		} 
		if (kws) {
			ModernizedCProgram.kwsfree(kws);
		} 
		return /*Error: Unsupported expression*/;
	}
	public void set_diffopt_flags_from_submodule_config(Object path) {
		submodule submodule = ModernizedCProgram.the_repository.submodule_from_path(ModernizedCProgram.null_oid, path);
		diff_flags generatedFlags = this.getFlags();
		if (submodule) {
			byte ignore;
			byte key;
			ModernizedCProgram.key = ModernizedCProgram.xstrfmt("submodule.%s.ignore", submodule.getName());
			if (/*Error: Function owner not recognized*/repo_config_get_string_const(ModernizedCProgram.the_repository, ModernizedCProgram.key, ignore)) {
				ignore = submodule.getIgnore();
			} 
			ModernizedCProgram.free(ModernizedCProgram.key);
			if (ignore) {
				diffopt.handle_ignore_submodules_arg(ignore);
			}  else if (ModernizedCProgram.is_gitmodules_unmerged(ModernizedCProgram.the_repository.getIndex())) {
				generatedFlags.setIgnore_submodules(1);
			} 
		} 
	}
	public void handle_ignore_submodules_arg(Object arg) {
		diff_flags generatedFlags = this.getFlags();
		generatedFlags.setIgnore_submodules(0);
		generatedFlags.setIgnore_untracked_in_submodules(0);
		generatedFlags.setIgnore_dirty_submodules(0);
		if (!/*Error: Function owner not recognized*/strcmp(arg, "all")) {
			generatedFlags.setIgnore_submodules(1);
		}  else if (!/*Error: Function owner not recognized*/strcmp(arg, "untracked")) {
			generatedFlags.setIgnore_untracked_in_submodules(1);
		}  else if (!/*Error: Function owner not recognized*/strcmp(arg, "dirty")) {
			generatedFlags.setIgnore_dirty_submodules(1);
		}  else if (/*Error: Function owner not recognized*/strcmp(arg, "none")) {
			ModernizedCProgram.die("bad --ignore-submodules argument: %s", arg/*
				 * Please update _git_status() in git-completion.bash when you
				 * add new options
				 */);
		} 
	}
	public void stuff_change(int old_mode, int new_mode, Object old_oid, Object new_oid, int old_oid_valid, int new_oid_valid, Object old_path, Object new_path) {
		diff_filespec one = new diff_filespec();
		diff_filespec two = new diff_filespec();
		if (!ModernizedCProgram.is_null_oid(old_oid) && !ModernizedCProgram.is_null_oid(new_oid) && ModernizedCProgram.oideq(old_oid, new_oid) && (old_mode == new_mode)) {
			return /*Error: Unsupported expression*/;
		} 
		diff_flags generatedFlags = this.getFlags();
		int generatedReverse_diff = generatedFlags.getReverse_diff();
		if (generatedReverse_diff) {
			do {
				Object _swap_a_ptr = (old_mode);
				Object _swap_b_ptr = (new_mode);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (old_oid);
				Object _swap_b_ptr = (new_oid);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
			do {
				Object _swap_a_ptr = (old_path);
				Object _swap_b_ptr = (new_path);
				byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
			} while (0);
		} 
		Object generatedPrefix = this.getPrefix();
		int generatedPrefix_length = this.getPrefix_length();
		if (generatedPrefix && (/*Error: Function owner not recognized*/strncmp(old_path, generatedPrefix, generatedPrefix_length) || /*Error: Function owner not recognized*/strncmp(new_path, generatedPrefix, generatedPrefix_length))) {
			return /*Error: Unsupported expression*/;
		} 
		one = /*Error: Function owner not recognized*/alloc_filespec(old_path);
		two = /*Error: Function owner not recognized*/alloc_filespec(new_path);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fill_filespec(one, old_oid, old_oid_valid, old_mode);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fill_filespec(two, new_oid, new_oid_valid, new_mode);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_queue(ModernizedCProgram.diff_queued_diff, one, two);
	}
	public int diff_tree_oid(Object old_oid, Object new_oid, Object base_str) {
		strbuf base = new strbuf();
		int retval;
		base.strbuf_init(260);
		base.strbuf_addstr(base_str);
		retval = ModernizedCProgram.ll_diff_tree_oid(old_oid, new_oid, base, opt);
		diff_flags generatedFlags = this.getFlags();
		int generatedFollow_renames = generatedFlags.getFollow_renames();
		if (!base_str && generatedFollow_renames && ModernizedCProgram.diff_might_be_rename()) {
			ModernizedCProgram.try_to_follow_renames(old_oid, new_oid, base, opt);
		} 
		base.strbuf_release();
		return retval;
	}
	public int diff_root_tree_oid(Object new_oid, Object base) {
		return opt.diff_tree_oid(((Object)0), new_oid, base);
	}
	public void graph_setup_line_prefix() {
		ModernizedCProgram.default_diffopt = diffopt;
		Object generatedOutput_prefix = this.getOutput_prefix();
		if (diffopt && !generatedOutput_prefix) {
			this.setOutput_prefix(diff_output_prefix_callback);
		} 
	}
	public int find_exact_renames() {
		int i;
		int renames = 0;
		hashmap file_table = new hashmap();
		/* Add all sources to the hash table in reverse order, because
			 * later on they will be retrieved in LIFO order.
			 */
		file_table.hashmap_init(((Object)0), ((Object)0), ModernizedCProgram.rename_src_nr);
		for (i = ModernizedCProgram.rename_src_nr - 1; i >= 0; i--) {
			ModernizedCProgram.insert_file_table(ModernizedCProgram.options.getRepo(), file_table, i, rename_src[i].getP().getOne());
		}
		for (i = 0; i < ModernizedCProgram.rename_dst_nr; /* Walk the destinations and find best source match */i++) {
			renames += ModernizedCProgram.find_identical_files(file_table, i, ModernizedCProgram.options);
		}
		file_table.hashmap_free_(((size_t)((file_similarity)0).getEntry()));
		;
		return renames;
	}
	public int too_many_rename_candidates(int num_create) {
		int rename_limit = ModernizedCProgram.options.getRename_limit();
		int num_src = ModernizedCProgram.rename_src_nr;
		int i;
		ModernizedCProgram.options.setNeeded_rename_limit(0/*
			 * This basically does a test for the rename matrix not
			 * growing larger than a "rename_limit" square matrix, ie:
			 *
			 *    num_create * num_src > rename_limit * rename_limit
			 */);
		if (rename_limit <= 0) {
			rename_limit = 32767;
		} 
		if ((num_create <= rename_limit || num_src <= rename_limit) && ((uint64_t)num_create * (uint64_t)num_src <= (uint64_t)rename_limit * (uint64_t)rename_limit)) {
			return 0;
		} 
		ModernizedCProgram.options.setNeeded_rename_limit(num_src > num_create ? num_src : num_create);
		if (!ModernizedCProgram.options.getFlags().getFind_copies_harder()) {
			return 1;
		} 
		for (num_src = i = 0; i < ModernizedCProgram.rename_src_nr; /* Would we bust the limit if we were running under -C? */i++) {
			if (/*Error: Function owner not recognized*/diff_unmodified_pair(rename_src[i].getP())) {
				continue;
			} 
			num_src++;
		}
		if ((num_create <= rename_limit || num_src <= rename_limit) && ((uint64_t)num_create * (uint64_t)num_src <= (uint64_t)rename_limit * (uint64_t)rename_limit)) {
			return 2;
		} 
		return 1;
	}
	public void diffcore_rename() {
		int detect_rename = ModernizedCProgram.options.getDetect_rename();
		int minimum_score = ModernizedCProgram.options.getRename_score();
		diff_queue_struct q = ModernizedCProgram.diff_queued_diff;
		diff_queue_struct outq = new diff_queue_struct();
		diff_score mx = new diff_score();
		int i;
		int j;
		int rename_count;
		int skip_unmodified = 0;
		int num_create;
		int dst_cnt;
		progress progress = ((Object)0);
		if (!minimum_score) {
			minimum_score = 30000;
		} 
		int generatedNr = q.getNr();
		diff_filepair[][] generatedQueue = q.getQueue();
		diff_filespec[] generatedOne = p.getOne();
		int generatedMode = (generatedOne).getMode();
		diff_filespec generatedTwo = p.getTwo();
		byte[] generatedPath = generatedTwo.getPath();
		object_id generatedOid = generatedTwo.getOid();
		int generatedIs_unmerged = (p).getIs_unmerged();
		int generatedBroken_pair = p.getBroken_pair();
		int generatedScore = p.getScore();
		int generatedRename_used = generatedOne.getRename_used();
		diff_rename_src diff_rename_src = new diff_rename_src();
		for (i = 0; i < generatedNr; i++) {
			diff_filepair p = generatedQueue[i];
			if (!((generatedMode) != 0)) {
				if (!((generatedMode) != 0)) {
					continue;
				}  else if (ModernizedCProgram.options.getSingle_follow() && /*Error: Function owner not recognized*/strcmp(ModernizedCProgram.options.getSingle_follow(), generatedPath)) {
					continue;
				}  else if (!ModernizedCProgram.options.getFlags().getRename_empty() && ModernizedCProgram.is_empty_blob_oid(generatedOid)) {
					continue;
				}  else if (generatedTwo.add_rename_dst() < 0) {
					ModernizedCProgram.warning("skipping rename detection, detected duplicate destination '%s'", generatedPath);
					;
				} 
			}  else if (!ModernizedCProgram.options.getFlags().getRename_empty() && ModernizedCProgram.is_empty_blob_oid(generatedOid)) {
				continue;
			}  else if (!(generatedIs_unmerged) && !((generatedMode) != 0/*
						 * If the source is a broken "delete", and
						 * they did not really want to get broken,
						 * that means the source actually stays.
						 * So we increment the "rename_used" score
						 * by one, to indicate ourselves as a user
						 */)) {
				if (generatedBroken_pair && !generatedScore) {
					generatedRename_used++;
				} 
				diff_rename_src.register_rename_src(p);
			}  else if (detect_rename == 2/*
						 * Increment the "rename_used" score by
						 * one, to indicate ourselves as a user.
						 */) {
				generatedRename_used++;
				diff_rename_src.register_rename_src(p);
			} 
		}
		if (ModernizedCProgram.rename_dst_nr == 0 || ModernizedCProgram.rename_src_nr == 0) {
			;
		} 
		rename_count = ModernizedCProgram.options.find_exact_renames();
		if (minimum_score == /* Did we only want exact renames? */60000.0) {
			;
		} 
		num_create = (ModernizedCProgram.rename_dst_nr - rename_count);
		if (!/* All done? */num_create) {
			;
		} 
		switch (ModernizedCProgram.options.too_many_rename_candidates(num_create)) {
		case 1:
				;
		case 2:
				ModernizedCProgram.options.setDegraded_cc_to_c(1);
				skip_unmodified = 1;
				break;
		default:
				break;
		}
		progress progress = new progress();
		if (ModernizedCProgram.options.getShow_rename_progress()) {
			progress = progress.start_delayed_progress(ModernizedCProgram._("Performing inexact rename detection"), (uint64_t)ModernizedCProgram.rename_dst_nr * (uint64_t)ModernizedCProgram.rename_src_nr);
		} 
		mx = ModernizedCProgram.xcalloc(ModernizedCProgram.st_mult(4, num_create), /*Error: sizeof expression not supported yet*/);
		for (dst_cnt = i = 0; i < ModernizedCProgram.rename_dst_nr; i++) {
			diff_filespec two = generatedTwo;
			diff_score m = new diff_score();
			if (rename_dst[i].getPair()) {
				continue;
			} 
			m = mx[dst_cnt * 4];
			for (j = 0; j < 4; j++) {
				m[j].setDst(-1);
			}
			for (j = 0; j < ModernizedCProgram.rename_src_nr; j++) {
				diff_filespec one = generatedOne;
				diff_score this_src = new diff_score();
				if (skip_unmodified && /*Error: Function owner not recognized*/diff_unmodified_pair(rename_src[j].getP())) {
					continue;
				} 
				this_src.setScore(ModernizedCProgram.estimate_similarity(ModernizedCProgram.options.getRepo(), one, two, minimum_score));
				this_src.setName_score(one.basename_same(two));
				this_src.setDst(i);
				this_src.setSrc(j);
				m.record_if_better(this_src/*
							 * Once we run estimate_similarity,
							 * We do not need the text anymore.
							 */);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filespec_blob(one);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filespec_blob(two);
			}
			dst_cnt++;
			progress.display_progress((uint64_t)(i + 1) * (uint64_t)ModernizedCProgram.rename_src_nr);
		}
		progress.stop_progress();
		ModernizedCProgram.git_stable_qsort((mx), (dst_cnt * 4), /*Error: sizeof expression not supported yet*/, /* cost matrix sorted by most to least similar pair */score_compare);
		rename_count += mx.find_renames(dst_cnt, minimum_score, 0);
		if (detect_rename == 2) {
			rename_count += mx.find_renames(dst_cnt, minimum_score, 1);
		} 
		ModernizedCProgram.free(mx);
		diff_rename_dst diff_rename_dst = new diff_rename_dst();
		diff_filepair generatedPair = dst.getPair();
		for (i = 0; i < generatedNr; i++) {
			diff_filepair p = generatedQueue[i];
			diff_filepair pair_to_free = ((Object)0);
			if ((generatedIs_unmerged)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, p);
			}  else if (!((generatedMode) != 0) && ((generatedMode) != 0/*
						 * Creation
						 *
						 * We would output this create record if it has
						 * not been turned into a rename/copy already.
						 */)) {
				diff_rename_dst dst = diff_rename_dst.locate_rename_dst(generatedTwo);
				if (dst && generatedPair) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, generatedPair);
					pair_to_free = p;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, /* no matching rename/copy source, so
										 * record this as a creation.
										 */p);
				} 
			}  else if (((generatedMode) != 0) && !((generatedMode) != 0/*
						 * Deletion
						 *
						 * We would output this delete record if:
						 *
						 * (1) this is a broken delete and the counterpart
						 *     broken create remains in the output; or
						 * (2) this is not a broken delete, and rename_dst
						 *     does not have a rename/copy to move p->one->path
						 *     out of existence.
						 *
						 * Otherwise, the counterpart broken create
						 * has been turned into a rename-edit; or
						 * delete did not have a matching create to
						 * begin with.
						 */)) {
				if (((!((generatedMode) != 0) != !((generatedMode) != 0)) && (generatedBroken_pair != 0))) {
					diff_rename_dst dst = diff_rename_dst.locate_rename_dst(generatedOne);
					if (dst && generatedPair) {
						pair_to_free = /* counterpart is now rename/copy */p;
					} 
				} else {
						if (generatedRename_used) {
							pair_to_free = /* this path remains */p;
						} 
				} 
				if (pair_to_free) {
					;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, p);
				} 
			}  else if (!/*Error: Function owner not recognized*/diff_unmodified_pair(p)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_q(outq, /* all the usual ones need to be kept */p);
			} else {
					pair_to_free = /* no need to keep unmodified pairs */p;
			} 
			if (pair_to_free) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/diff_free_filepair(pair_to_free);
			} 
		}
		do {
		} while (0);
		ModernizedCProgram.free(generatedQueue);
		q = outq;
		do {
		} while (0);
		for (i = 0; i < ModernizedCProgram.rename_dst_nr; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_filespec(generatedTwo);
		}
		do {
			ModernizedCProgram.free(rename_dst);
			(rename_dst) = ((Object)0);
		} while (0);
		ModernizedCProgram.rename_dst_nr = ModernizedCProgram.rename_dst_alloc = 0;
		do {
			ModernizedCProgram.free(rename_src);
			(rename_src) = ((Object)0);
		} while (0);
		ModernizedCProgram.rename_src_nr = ModernizedCProgram.rename_src_alloc = 0;
		return /*Error: Unsupported expression*/;
	}
	public void file_add_remove(int addremove, int mode, Object oid, int oid_valid, Object fullpath, int dirty_submodule) {
		int diff = addremove == (byte)'+' ? 1 : 2;
		rev_info revs = ModernizedCProgram.options.getChange_fn_data();
		ModernizedCProgram.tree_difference |=  diff;
		int generatedRemove_empty_trees = revs.getRemove_empty_trees();
		if (!generatedRemove_empty_trees || ModernizedCProgram.tree_difference != 1) {
			ModernizedCProgram.options.getFlags().setHas_changes(1);
		} 
	}
	public void file_change(int old_mode, int new_mode, Object old_oid, Object new_oid, int old_oid_valid, int new_oid_valid, Object fullpath, int old_dirty_submodule, int new_dirty_submodule) {
		ModernizedCProgram.tree_difference = 3;
		ModernizedCProgram.options.getFlags().setHas_changes(1);
	}
	public Object getOrderfile() {
		return orderfile;
	}
	public void setOrderfile(Object newOrderfile) {
		orderfile = newOrderfile;
	}
	public Object[] getPickaxe() {
		return pickaxe;
	}
	public void setPickaxe(Object[] newPickaxe) {
		pickaxe = newPickaxe;
	}
	public Object getSingle_follow() {
		return single_follow;
	}
	public void setSingle_follow(Object newSingle_follow) {
		single_follow = newSingle_follow;
	}
	public Object getA_prefix() {
		return a_prefix;
	}
	public void setA_prefix(Object newA_prefix) {
		a_prefix = newA_prefix;
	}
	public Object getB_prefix() {
		return b_prefix;
	}
	public void setB_prefix(Object newB_prefix) {
		b_prefix = newB_prefix;
	}
	public Object getLine_prefix() {
		return line_prefix;
	}
	public void setLine_prefix(Object newLine_prefix) {
		line_prefix = newLine_prefix;
	}
	public Object getLine_prefix_length() {
		return line_prefix_length;
	}
	public void setLine_prefix_length(Object newLine_prefix_length) {
		line_prefix_length = newLine_prefix_length;
	}
	public diff_flags getFlags() {
		return flags;
	}
	public void setFlags(diff_flags newFlags) {
		flags = newFlags;
	}
	public int getFilter() {
		return filter;
	}
	public void setFilter(int newFilter) {
		filter = newFilter;
	}
	public int getUse_color() {
		return use_color;
	}
	public void setUse_color(int newUse_color) {
		use_color = newUse_color;
	}
	public int getContext() {
		return context;
	}
	public void setContext(int newContext) {
		context = newContext;
	}
	public int getInterhunkcontext() {
		return interhunkcontext;
	}
	public void setInterhunkcontext(int newInterhunkcontext) {
		interhunkcontext = newInterhunkcontext;
	}
	public int getBreak_opt() {
		return break_opt;
	}
	public void setBreak_opt(int newBreak_opt) {
		break_opt = newBreak_opt;
	}
	public int getDetect_rename() {
		return detect_rename;
	}
	public void setDetect_rename(int newDetect_rename) {
		detect_rename = newDetect_rename;
	}
	public int getIrreversible_delete() {
		return irreversible_delete;
	}
	public void setIrreversible_delete(int newIrreversible_delete) {
		irreversible_delete = newIrreversible_delete;
	}
	public int getSkip_stat_unmatch() {
		return skip_stat_unmatch;
	}
	public void setSkip_stat_unmatch(int newSkip_stat_unmatch) {
		skip_stat_unmatch = newSkip_stat_unmatch;
	}
	public int getLine_termination() {
		return line_termination;
	}
	public void setLine_termination(int newLine_termination) {
		line_termination = newLine_termination;
	}
	public int getOutput_format() {
		return output_format;
	}
	public void setOutput_format(int newOutput_format) {
		output_format = newOutput_format;
	}
	public int getPickaxe_opts() {
		return pickaxe_opts;
	}
	public void setPickaxe_opts(int newPickaxe_opts) {
		pickaxe_opts = newPickaxe_opts;
	}
	public int getRename_score() {
		return rename_score;
	}
	public void setRename_score(int newRename_score) {
		rename_score = newRename_score;
	}
	public int getRename_limit() {
		return rename_limit;
	}
	public void setRename_limit(int newRename_limit) {
		rename_limit = newRename_limit;
	}
	public int getNeeded_rename_limit() {
		return needed_rename_limit;
	}
	public void setNeeded_rename_limit(int newNeeded_rename_limit) {
		needed_rename_limit = newNeeded_rename_limit;
	}
	public int getDegraded_cc_to_c() {
		return degraded_cc_to_c;
	}
	public void setDegraded_cc_to_c(int newDegraded_cc_to_c) {
		degraded_cc_to_c = newDegraded_cc_to_c;
	}
	public int getShow_rename_progress() {
		return show_rename_progress;
	}
	public void setShow_rename_progress(int newShow_rename_progress) {
		show_rename_progress = newShow_rename_progress;
	}
	public int getDirstat_permille() {
		return dirstat_permille;
	}
	public void setDirstat_permille(int newDirstat_permille) {
		dirstat_permille = newDirstat_permille;
	}
	public int getSetup() {
		return setup;
	}
	public void setSetup(int newSetup) {
		setup = newSetup;
	}
	public int getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(int newAbbrev) {
		abbrev = newAbbrev;
	}
	public int getIta_invisible_in_index() {
		return ita_invisible_in_index;
	}
	public void setIta_invisible_in_index(int newIta_invisible_in_index) {
		ita_invisible_in_index = newIta_invisible_in_index;
	}
	public int getWs_error_highlight() {
		return ws_error_highlight;
	}
	public void setWs_error_highlight(int newWs_error_highlight) {
		ws_error_highlight = newWs_error_highlight;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getPrefix_length() {
		return prefix_length;
	}
	public void setPrefix_length(int newPrefix_length) {
		prefix_length = newPrefix_length;
	}
	public Object getStat_sep() {
		return stat_sep;
	}
	public void setStat_sep(Object newStat_sep) {
		stat_sep = newStat_sep;
	}
	public int getXdl_opts() {
		return xdl_opts;
	}
	public void setXdl_opts(int newXdl_opts) {
		xdl_opts = newXdl_opts;
	}
	public Byte getAnchors() {
		return anchors;
	}
	public void setAnchors(Byte newAnchors) {
		anchors = newAnchors;
	}
	public Object getAnchors_nr() {
		return anchors_nr;
	}
	public void setAnchors_nr(Object newAnchors_nr) {
		anchors_nr = newAnchors_nr;
	}
	public Object getAnchors_alloc() {
		return anchors_alloc;
	}
	public void setAnchors_alloc(Object newAnchors_alloc) {
		anchors_alloc = newAnchors_alloc;
	}
	public int getStat_width() {
		return stat_width;
	}
	public void setStat_width(int newStat_width) {
		stat_width = newStat_width;
	}
	public int getStat_name_width() {
		return stat_name_width;
	}
	public void setStat_name_width(int newStat_name_width) {
		stat_name_width = newStat_name_width;
	}
	public int getStat_graph_width() {
		return stat_graph_width;
	}
	public void setStat_graph_width(int newStat_graph_width) {
		stat_graph_width = newStat_graph_width;
	}
	public int getStat_count() {
		return stat_count;
	}
	public void setStat_count(int newStat_count) {
		stat_count = newStat_count;
	}
	public Object getWord_regex() {
		return word_regex;
	}
	public void setWord_regex(Object newWord_regex) {
		word_regex = newWord_regex;
	}
	public diff_words_type getWord_diff() {
		return word_diff;
	}
	public void setWord_diff(diff_words_type newWord_diff) {
		word_diff = newWord_diff;
	}
	public diff_submodule_format getSubmodule_format() {
		return submodule_format;
	}
	public void setSubmodule_format(diff_submodule_format newSubmodule_format) {
		submodule_format = newSubmodule_format;
	}
	public oidset getObjfind() {
		return objfind;
	}
	public void setObjfind(oidset newObjfind) {
		objfind = newObjfind;
	}
	public int getFound_changes() {
		return found_changes;
	}
	public void setFound_changes(int newFound_changes) {
		found_changes = newFound_changes;
	}
	public int getFound_follow() {
		return found_follow;
	}
	public void setFound_follow(int newFound_follow) {
		found_follow = newFound_follow;
	}
	public Object getSet_default() {
		return set_default;
	}
	public void setSet_default(Object newSet_default) {
		set_default = newSet_default;
	}
	public _iobuf getFile() {
		return file;
	}
	public void setFile(_iobuf newFile) {
		file = newFile;
	}
	public int getClose_file() {
		return close_file;
	}
	public void setClose_file(int newClose_file) {
		close_file = newClose_file;
	}
	public Object getOutput_indicators() {
		return output_indicators;
	}
	public void setOutput_indicators(Object newOutput_indicators) {
		output_indicators = newOutput_indicators;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public Object getPathchange() {
		return pathchange;
	}
	public void setPathchange(Object newPathchange) {
		pathchange = newPathchange;
	}
	public Object getChange() {
		return change;
	}
	public void setChange(Object newChange) {
		change = newChange;
	}
	public Object getAdd_remove() {
		return add_remove;
	}
	public void setAdd_remove(Object newAdd_remove) {
		add_remove = newAdd_remove;
	}
	public Object getChange_fn_data() {
		return change_fn_data;
	}
	public void setChange_fn_data(Object newChange_fn_data) {
		change_fn_data = newChange_fn_data;
	}
	public Object getFormat_callback() {
		return format_callback;
	}
	public void setFormat_callback(Object newFormat_callback) {
		format_callback = newFormat_callback;
	}
	public Object getFormat_callback_data() {
		return format_callback_data;
	}
	public void setFormat_callback_data(Object newFormat_callback_data) {
		format_callback_data = newFormat_callback_data;
	}
	public Object getOutput_prefix() {
		return output_prefix;
	}
	public void setOutput_prefix(Object newOutput_prefix) {
		output_prefix = newOutput_prefix;
	}
	public Object getOutput_prefix_data() {
		return output_prefix_data;
	}
	public void setOutput_prefix_data(Object newOutput_prefix_data) {
		output_prefix_data = newOutput_prefix_data;
	}
	public int getDiff_path_counter() {
		return diff_path_counter;
	}
	public void setDiff_path_counter(int newDiff_path_counter) {
		diff_path_counter = newDiff_path_counter;
	}
	public emitted_diff_symbols getEmitted_symbols() {
		return emitted_symbols;
	}
	public void setEmitted_symbols(emitted_diff_symbols newEmitted_symbols) {
		emitted_symbols = newEmitted_symbols;
	}
	public  getColor_moved() {
		return color_moved;
	}
	public void setColor_moved( newColor_moved) {
		color_moved = newColor_moved;
	}
	public int getColor_moved_ws_handling() {
		return color_moved_ws_handling;
	}
	public void setColor_moved_ws_handling(int newColor_moved_ws_handling) {
		color_moved_ws_handling = newColor_moved_ws_handling;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public option getParseopts() {
		return parseopts;
	}
	public void setParseopts(option newParseopts) {
		parseopts = newParseopts;
	}
}
