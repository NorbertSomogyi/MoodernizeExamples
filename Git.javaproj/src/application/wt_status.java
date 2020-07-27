package application;

public class wt_status {
	private repository repo;
	private int is_initial;
	private Byte branch;
	private Object reference;
	private pathspec pathspec;
	private int verbose;
	private int amend;
	private commit_whence whence;
	private int nowarn;
	private int use_color;
	private int no_gettext;
	private int display_comment_prefix;
	private int relative_paths;
	private int submodule_summary;
	private show_ignored_type show_ignored_mode;
	private untracked_status_type show_untracked_files;
	private Object ignore_submodule_arg;
	private Object color_palette;
	private int colopts;
	private int null_termination;
	private int commit_template;
	private int show_branch;
	private int show_stash;
	private int hints;
	private ahead_behind_flags ahead_behind_flags;
	private int detect_rename;
	private int rename_score;
	private int rename_limit;
	private wt_status_format status_format;
	private wt_status_state state;
	private object_id oid_commit;
	private int committable;
	private int workdir_dirty;
	private Object index_file;
	private _iobuf fp;
	private Object prefix;
	private string_list change;
	private string_list untracked;
	private string_list ignored;
	private Object untracked_in_ms;
	
	public wt_status(repository repo, int is_initial, Byte branch, Object reference, pathspec pathspec, int verbose, int amend, commit_whence whence, int nowarn, int use_color, int no_gettext, int display_comment_prefix, int relative_paths, int submodule_summary, show_ignored_type show_ignored_mode, untracked_status_type show_untracked_files, Object ignore_submodule_arg, Object color_palette, int colopts, int null_termination, int commit_template, int show_branch, int show_stash, int hints, ahead_behind_flags ahead_behind_flags, int detect_rename, int rename_score, int rename_limit, wt_status_format status_format, wt_status_state state, object_id oid_commit, int committable, int workdir_dirty, Object index_file, _iobuf fp, Object prefix, string_list change, string_list untracked, string_list ignored, Object untracked_in_ms) {
		setRepo(repo);
		setIs_initial(is_initial);
		setBranch(branch);
		setReference(reference);
		setPathspec(pathspec);
		setVerbose(verbose);
		setAmend(amend);
		setWhence(whence);
		setNowarn(nowarn);
		setUse_color(use_color);
		setNo_gettext(no_gettext);
		setDisplay_comment_prefix(display_comment_prefix);
		setRelative_paths(relative_paths);
		setSubmodule_summary(submodule_summary);
		setShow_ignored_mode(show_ignored_mode);
		setShow_untracked_files(show_untracked_files);
		setIgnore_submodule_arg(ignore_submodule_arg);
		setColor_palette(color_palette);
		setColopts(colopts);
		setNull_termination(null_termination);
		setCommit_template(commit_template);
		setShow_branch(show_branch);
		setShow_stash(show_stash);
		setHints(hints);
		setAhead_behind_flags(ahead_behind_flags);
		setDetect_rename(detect_rename);
		setRename_score(rename_score);
		setRename_limit(rename_limit);
		setStatus_format(status_format);
		setState(state);
		setOid_commit(oid_commit);
		setCommittable(committable);
		setWorkdir_dirty(workdir_dirty);
		setIndex_file(index_file);
		setFp(fp);
		setPrefix(prefix);
		setChange(change);
		setUntracked(untracked);
		setIgnored(ignored);
		setUntracked_in_ms(untracked_in_ms);
	}
	public wt_status() {
	}
	
	public void determine_whence() {
		if (ModernizedCProgram.file_exists(ModernizedCProgram.the_repository.git_path_merge_head())) {
			commit_whence.whence = commit_whence.FROM_MERGE;
		}  else if (ModernizedCProgram.file_exists(ModernizedCProgram.the_repository.git_path_cherry_pick_head())) {
			commit_whence.whence = commit_whence.FROM_CHERRY_PICK;
			if (ModernizedCProgram.file_exists(ModernizedCProgram.git_path_seq_dir())) {
				ModernizedCProgram.sequencer_in_use = 1;
			} 
		} else {
				commit_whence.whence = commit_whence.FROM_COMMIT;
		} 
		if (s) {
			this.setWhence(commit_whence.whence);
		} 
	}
	public void status_init_config(Object fn) {
		ModernizedCProgram.wt_status_prepare(ModernizedCProgram.the_repository, s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/init_diff_ui_defaults();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config(fn, s);
		s.determine_whence();
		this.setHints(/* must come after git_config() */ModernizedCProgram.advice_status_hints);
	}
	public void handle_ignored_arg() {
		if (!ModernizedCProgram.ignored_arg) {
			;
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ignored_arg, "traditional")) {
			this.setShow_ignored_mode(show_ignored_type.SHOW_TRADITIONAL_IGNORED);
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ignored_arg, "no")) {
			this.setShow_ignored_mode(show_ignored_type.SHOW_NO_IGNORED);
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ignored_arg, "matching")) {
			this.setShow_ignored_mode(show_ignored_type.SHOW_MATCHING_IGNORED);
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("Invalid ignored mode '%s'"), ModernizedCProgram.ignored_arg);
		} 
	}
	public void handle_untracked_files_arg() {
		if (!ModernizedCProgram.untracked_files_arg) {
			;
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.untracked_files_arg, "no")) {
			this.setShow_untracked_files(untracked_status_type.SHOW_NO_UNTRACKED_FILES);
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.untracked_files_arg, "normal")) {
			this.setShow_untracked_files(untracked_status_type.SHOW_NORMAL_UNTRACKED_FILES);
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.untracked_files_arg, "all")) {
			this.setShow_untracked_files(untracked_status_type.SHOW_ALL_UNTRACKED_FILES/*
				 * Please update $__git_untracked_file_modes in
				 * git-completion.bash when you add new options
				 */);
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("Invalid untracked files mode '%s'"), ModernizedCProgram.untracked_files_arg);
		} 
	}
	public void finalize_deferred_config() {
		int generatedNull_termination = this.getNull_termination();
		int use_deferred_config = (wt_status_format.status_format != wt_status_format.STATUS_FORMAT_PORCELAIN && wt_status_format.status_format != wt_status_format.STATUS_FORMAT_PORCELAIN_V2 && !generatedNull_termination);
		if (generatedNull_termination) {
			if (wt_status_format.status_format == wt_status_format.STATUS_FORMAT_NONE || wt_status_format.status_format == wt_status_format.STATUS_FORMAT_UNSPECIFIED) {
				wt_status_format.status_format = wt_status_format.STATUS_FORMAT_PORCELAIN;
			}  else if (wt_status_format.status_format == wt_status_format.STATUS_FORMAT_LONG) {
				ModernizedCProgram.die(ModernizedCProgram._("--long and -z are incompatible"));
			} 
		} 
		wt_status_format generatedStatus_format = status_deferred_config.getStatus_format();
		if (use_deferred_config && wt_status_format.status_format == wt_status_format.STATUS_FORMAT_UNSPECIFIED) {
			wt_status_format.status_format = generatedStatus_format;
		} 
		if (wt_status_format.status_format == wt_status_format.STATUS_FORMAT_UNSPECIFIED) {
			wt_status_format.status_format = wt_status_format.STATUS_FORMAT_NONE;
		} 
		int generatedShow_branch = this.getShow_branch();
		if (use_deferred_config && generatedShow_branch < 0) {
			this.setShow_branch(generatedShow_branch);
		} 
		if (generatedShow_branch < 0) {
			this.setShow_branch(0/*
				 * If the user did not give a "--[no]-ahead-behind" command
				 * line argument *AND* we will print in a human-readable format
				 * (short, long etc.) then we inherit from the status.aheadbehind
				 * config setting.  In all other cases (and porcelain V[12] formats
				 * in particular), we inherit _FULL for backwards compatibility.
				 */);
		} 
		ahead_behind_flags generatedAhead_behind_flags = this.getAhead_behind_flags();
		ahead_behind_flags generatedAhead_behind = status_deferred_config.getAhead_behind();
		if (use_deferred_config && generatedAhead_behind_flags == ahead_behind_flags.AHEAD_BEHIND_UNSPECIFIED) {
			this.setAhead_behind_flags(generatedAhead_behind);
		} 
		if (generatedAhead_behind_flags == ahead_behind_flags.AHEAD_BEHIND_UNSPECIFIED) {
			this.setAhead_behind_flags(ahead_behind_flags.AHEAD_BEHIND_FULL);
		} 
	}
	public int dry_run_commit(int argc, Object argv, Object prefix, Object current_head) {
		int committable;
		byte index_file;
		index_file = ModernizedCProgram.prepare_index(argc, argv, prefix, current_head, 1);
		committable = ModernizedCProgram.run_status((_iob[1]), index_file, prefix, 0, s);
		ModernizedCProgram.rollback_index_files();
		return committable ? 0 : 1;
	}
	public Object color(int slot) {
		byte c = "";
		int generatedUse_color = this.getUse_color();
		Object generatedColor_palette = this.getColor_palette();
		if (ModernizedCProgram.want_color_fd(1, (generatedUse_color))) {
			c = generatedColor_palette[slot];
		} 
		if (slot == color_wt_status.WT_STATUS_ONBRANCH && ModernizedCProgram.color_is_nil(c)) {
			c = generatedColor_palette[color_wt_status.WT_STATUS_HEADER];
		} 
		return c;
	}
	public void status_vprintf(int at_bol, Object color, Object fmt, Object ap, Object trail) {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf linebuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte line;
		byte eol;
		sb.strbuf_vaddf(fmt, ap);
		Object generatedLen = sb.getLen();
		int generatedDisplay_comment_prefix = this.getDisplay_comment_prefix();
		_iobuf generatedFp = this.getFp();
		if (!generatedLen) {
			if (generatedDisplay_comment_prefix) {
				sb.strbuf_addch(ModernizedCProgram.comment_line_char);
				if (!trail) {
					sb.strbuf_addch((byte)' ');
				} 
			} 
			generatedFp.color_print_strbuf(color, sb);
			if (trail) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "%s", trail);
			} 
			sb.strbuf_release();
			return /*Error: Unsupported expression*/;
		} 
		byte[] generatedBuf = sb.getBuf();
		for (line = generatedBuf; line; line = eol + 1) {
			eol = /*Error: Function owner not recognized*/strchr(line, (byte)'\n');
			linebuf.strbuf_setlen(0);
			if (at_bol && generatedDisplay_comment_prefix) {
				linebuf.strbuf_addch(ModernizedCProgram.comment_line_char);
				if (line != (byte)'\n' && line != (byte)'\t') {
					linebuf.strbuf_addch((byte)' ');
				} 
			} 
			if (eol) {
				linebuf.strbuf_add(line, eol - line);
			} else {
					linebuf.strbuf_addstr(line);
			} 
			generatedFp.color_print_strbuf(color, linebuf);
			if (eol) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "\n");
			} else {
					break;
			} 
			at_bol = 1;
		}
		if (trail) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "%s", trail);
		} 
		linebuf.strbuf_release();
		sb.strbuf_release();
	}
	public void status_printf_ln(Object color, Object fmt) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		s.status_vprintf(1, color, fmt, ap, "\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
	}
	public void status_printf(Object color, Object fmt) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		s.status_vprintf(1, color, fmt, ap, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
	}
	public void status_printf_more(Object color, Object fmt) {
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		s.status_vprintf(0, color, fmt, ap, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
	}
	public void wt_longstatus_print_unmerged_header() {
		int i;
		int del_mod_conflict = 0;
		int both_deleted = 0;
		int not_deleted = 0;
		byte c = s.color(color_wt_status.WT_STATUS_HEADER);
		s.status_printf_ln(c, ModernizedCProgram._("Unmerged paths:"));
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		Object generatedUtil = it.getUtil();
		int generatedStagemask = d.getStagemask();
		for (i = 0; i < generatedNr; i++) {
			string_list_item it = (generatedItems[i]);
			wt_status_change_data d = generatedUtil;
			switch (generatedStagemask) {
			case 5:
					del_mod_conflict = 1;
					break;
			case 0:
					break;
			case 3:
			case 1:
					both_deleted = 1;
					break;
			default:
					not_deleted = 1;
					break;
			}
		}
		int generatedHints = this.getHints();
		if (!generatedHints) {
			return /*Error: Unsupported expression*/;
		} 
		commit_whence generatedWhence = this.getWhence();
		int generatedIs_initial = this.getIs_initial();
		Object generatedReference = this.getReference();
		if (generatedWhence != commit_whence.FROM_COMMIT) {
			;
		}  else if (!generatedIs_initial) {
			if (!/*Error: Function owner not recognized*/strcmp(generatedReference, "HEAD")) {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git restore --staged <file>...\" to unstage)"));
			} else {
					s.status_printf_ln(c, ModernizedCProgram._("  (use \"git restore --source=%s --staged <file>...\" to unstage)"), generatedReference);
			} 
		} else {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git rm --cached <file>...\" to unstage)"));
		} 
		if (!both_deleted) {
			if (!del_mod_conflict) {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git add <file>...\" to mark resolution)"));
			} else {
					s.status_printf_ln(c, ModernizedCProgram._("  (use \"git add/rm <file>...\" as appropriate to mark resolution)"));
			} 
		}  else if (!del_mod_conflict && !not_deleted) {
			s.status_printf_ln(c, ModernizedCProgram._("  (use \"git rm <file>...\" to mark resolution)"));
		} else {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git add/rm <file>...\" as appropriate to mark resolution)"));
		} 
	}
	public void wt_longstatus_print_cached_header() {
		byte c = s.color(color_wt_status.WT_STATUS_HEADER);
		s.status_printf_ln(c, ModernizedCProgram._("Changes to be committed:"));
		int generatedHints = this.getHints();
		if (!generatedHints) {
			return /*Error: Unsupported expression*/;
		} 
		commit_whence generatedWhence = this.getWhence();
		int generatedIs_initial = this.getIs_initial();
		Object generatedReference = this.getReference();
		if (generatedWhence != commit_whence.FROM_COMMIT) {
			;
		}  else if (!generatedIs_initial) {
			if (!/*Error: Function owner not recognized*/strcmp(generatedReference, "HEAD")) {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git restore --staged <file>...\" to unstage)"));
			} else {
					s.status_printf_ln(c, ModernizedCProgram._("  (use \"git restore --source=%s --staged <file>...\" to unstage)"), generatedReference);
			} 
		} else {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git rm --cached <file>...\" to unstage)"));
		} 
	}
	public void wt_longstatus_print_dirty_header(int has_deleted, int has_dirty_submodules) {
		byte c = s.color(color_wt_status.WT_STATUS_HEADER);
		s.status_printf_ln(c, ModernizedCProgram._("Changes not staged for commit:"));
		int generatedHints = this.getHints();
		if (!generatedHints) {
			return /*Error: Unsupported expression*/;
		} 
		if (!has_deleted) {
			s.status_printf_ln(c, ModernizedCProgram._("  (use \"git add <file>...\" to update what will be committed)"));
		} else {
				s.status_printf_ln(c, ModernizedCProgram._("  (use \"git add/rm <file>...\" to update what will be committed)"));
		} 
		s.status_printf_ln(c, ModernizedCProgram._("  (use \"git restore <file>...\" to discard changes in working directory)"));
		if (has_dirty_submodules) {
			s.status_printf_ln(c, ModernizedCProgram._("  (commit or discard the untracked or modified content in submodules)"));
		} 
	}
	public void wt_longstatus_print_other_header(Object what, Object how) {
		byte c = s.color(color_wt_status.WT_STATUS_HEADER);
		s.status_printf_ln(c, "%s:", what);
		int generatedHints = this.getHints();
		if (!generatedHints) {
			return /*Error: Unsupported expression*/;
		} 
		s.status_printf_ln(c, ModernizedCProgram._("  (use \"git %s <file>...\" to include in what will be committed)"), how);
	}
	public void wt_longstatus_print_trailer() {
		s.status_printf_ln(s.color(color_wt_status.WT_STATUS_HEADER), "%s", "");
	}
	public void wt_status_collect_changes_worktree() {
		rev_info rev = new rev_info();
		repository generatedRepo = this.getRepo();
		ModernizedCProgram.repo_init_revisions(generatedRepo, rev, ((Object)0));
		ModernizedCProgram.setup_revisions(0, ((Object)0), rev, ((Object)0));
		diff_options generatedDiffopt = rev.getDiffopt();
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		generatedOutput_format |=  -1024;
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		generatedFlags.setDirty_submodules(1);
		generatedDiffopt.setIta_invisible_in_index(1);
		untracked_status_type generatedShow_untracked_files = this.getShow_untracked_files();
		if (!generatedShow_untracked_files) {
			generatedFlags.setIgnore_untracked_in_submodules(1);
		} 
		Object generatedIgnore_submodule_arg = this.getIgnore_submodule_arg();
		if (generatedIgnore_submodule_arg) {
			generatedFlags.setOverride_submodule_config(1);
			generatedDiffopt.handle_ignore_submodules_arg(generatedIgnore_submodule_arg);
		} 
		generatedDiffopt.setFormat_callback(wt_status_collect_changed_cb);
		generatedDiffopt.setFormat_callback_data(s);
		int generatedDetect_rename = this.getDetect_rename();
		generatedDiffopt.setDetect_rename(generatedDetect_rename >= 0 ? generatedDetect_rename : generatedDetect_rename);
		int generatedRename_limit = this.getRename_limit();
		generatedDiffopt.setRename_limit(generatedRename_limit >= 0 ? generatedRename_limit : generatedRename_limit);
		int generatedRename_score = this.getRename_score();
		generatedDiffopt.setRename_score(generatedRename_score >= 0 ? generatedRename_score : generatedRename_score);
		pathspec generatedPrune_data = rev.getPrune_data();
		pathspec generatedPathspec = this.getPathspec();
		generatedPrune_data.copy_pathspec(generatedPathspec);
		rev.run_diff_files(0);
	}
	public void wt_status_collect_changes_index() {
		rev_info rev = new rev_info();
		setup_revision_opt opt = new setup_revision_opt();
		repository generatedRepo = this.getRepo();
		ModernizedCProgram.repo_init_revisions(generatedRepo, rev, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opt, 0, /*Error: sizeof expression not supported yet*/);
		int generatedIs_initial = this.getIs_initial();
		Object generatedReference = this.getReference();
		opt.setDef(generatedIs_initial ? ModernizedCProgram.empty_tree_oid_hex() : generatedReference);
		ModernizedCProgram.setup_revisions(0, ((Object)0), rev, opt);
		diff_options generatedDiffopt = rev.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		generatedFlags.setOverride_submodule_config(1);
		generatedDiffopt.setIta_invisible_in_index(1);
		Object generatedIgnore_submodule_arg = this.getIgnore_submodule_arg();
		if (generatedIgnore_submodule_arg) {
			generatedDiffopt.handle_ignore_submodules_arg(generatedIgnore_submodule_arg);
		} else {
				generatedDiffopt.handle_ignore_submodules_arg("dirty");
		} 
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		generatedOutput_format |=  -1024;
		generatedDiffopt.setFormat_callback(wt_status_collect_updated_cb);
		generatedDiffopt.setFormat_callback_data(s);
		int generatedDetect_rename = this.getDetect_rename();
		generatedDiffopt.setDetect_rename(generatedDetect_rename >= 0 ? generatedDetect_rename : generatedDetect_rename);
		int generatedRename_limit = this.getRename_limit();
		generatedDiffopt.setRename_limit(generatedRename_limit >= 0 ? generatedRename_limit : generatedRename_limit);
		int generatedRename_score = this.getRename_score();
		generatedDiffopt.setRename_score(generatedRename_score >= 0 ? generatedRename_score : generatedRename_score);
		pathspec generatedPrune_data = rev.getPrune_data();
		pathspec generatedPathspec = this.getPathspec();
		generatedPrune_data.copy_pathspec(generatedPathspec);
		rev.run_diff_index(1);
	}
	public void wt_status_collect_changes_initial() {
		repository generatedRepo = this.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		index_state istate = generatedIndex;
		int i;
		int generatedCache_nr = istate.getCache_nr();
		cache_entry[][] generatedCache = istate.getCache();
		pathspec generatedPathspec = this.getPathspec();
		string_list generatedChange = this.getChange();
		string_list_item string_list_item = new string_list_item();
		Object generatedUtil = it.getUtil();
		int generatedStagemask = d.getStagemask();
		object_id generatedOid_index = d.getOid_index();
		for (i = 0; i < generatedCache_nr; i++) {
			string_list_item it = new string_list_item();
			wt_status_change_data d = new wt_status_change_data();
			cache_entry ce = generatedCache[i];
			if (!ModernizedCProgram.ce_path_match(istate, ce, generatedPathspec, ((Object)0))) {
				continue;
			} 
			if (((ce).getCe_flags() & (1 << 29))) {
				continue;
			} 
			it = string_list_item.string_list_insert(generatedChange, ce.getName());
			d = generatedUtil;
			if (!d) {
				d = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
				it.setUtil(d);
			} 
			if ((((true) & (ce).getCe_flags()) >> 12)) {
				d.setIndex_status((byte)'U');
				generatedStagemask |=  (1 << ((((true) & (ce).getCe_flags()) >> 12) - 1/*
							 * Don't bother setting {mode,oid}_{head,index} since the print
							 * code will output the stage values directly and not use the
							 * values in these fields.
							 */));
				this.setCommittable(1);
			} else {
					d.setIndex_status((byte)'A');
					d.setMode_index(ce.getCe_mode());
					generatedOid_index.oidcpy(ce.getOid());
					this.setCommittable(1);
			} 
		}
	}
	public void wt_status_collect_untracked() {
		int i;
		dir_struct dir = new dir_struct();
		uint64_t t_begin = ModernizedCProgram.getnanotime();
		repository generatedRepo = this.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		index_state istate = generatedIndex;
		untracked_status_type generatedShow_untracked_files = this.getShow_untracked_files();
		if (!generatedShow_untracked_files) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dir, 0, /*Error: sizeof expression not supported yet*/);
		 generatedFlags = dir.getFlags();
		if (generatedShow_untracked_files != untracked_status_type.SHOW_ALL_UNTRACKED_FILES) {
			generatedFlags |=  .DIR_SHOW_OTHER_DIRECTORIES | .DIR_HIDE_EMPTY_DIRECTORIES;
		} 
		show_ignored_type generatedShow_ignored_mode = this.getShow_ignored_mode();
		untracked_cache generatedUntracked = istate.getUntracked();
		if (generatedShow_ignored_mode) {
			generatedFlags |=  .DIR_SHOW_IGNORED_TOO;
			if (generatedShow_ignored_mode == show_ignored_type.SHOW_MATCHING_IGNORED) {
				generatedFlags |=  .DIR_SHOW_IGNORED_TOO_MODE_MATCHING;
			} 
		} else {
				dir.setUntracked(generatedUntracked);
		} 
		dir.setup_standard_excludes();
		pathspec generatedPathspec = this.getPathspec();
		ModernizedCProgram.fill_directory(dir, istate, generatedPathspec);
		int generatedNr = dir.getNr();
		dir_entry[][] generatedEntries = dir.getEntries();
		Object generatedName = ent.getName();
		Object generatedLen = ent.getLen();
		string_list_item string_list_item = new string_list_item();
		for (i = 0; i < generatedNr; i++) {
			dir_entry ent = generatedEntries[i];
			if (ModernizedCProgram.index_name_is_other(istate, generatedName, generatedLen) && ModernizedCProgram.dir_path_match(istate, ent, generatedPathspec, 0, ((Object)0))) {
				string_list_item.string_list_insert(generatedUntracked, generatedName);
			} 
			ModernizedCProgram.free(ent);
		}
		int generatedIgnored_nr = dir.getIgnored_nr();
		dir_entry[][] generatedIgnored = dir.getIgnored();
		for (i = 0; i < generatedIgnored_nr; i++) {
			dir_entry ent = generatedIgnored[i];
			if (ModernizedCProgram.index_name_is_other(istate, generatedName, generatedLen) && ModernizedCProgram.dir_path_match(istate, ent, generatedPathspec, 0, ((Object)0))) {
				string_list_item.string_list_insert(generatedIgnored, generatedName);
			} 
			ModernizedCProgram.free(ent);
		}
		ModernizedCProgram.free(generatedEntries);
		ModernizedCProgram.free(generatedIgnored);
		dir.clear_directory();
		if (ModernizedCProgram.advice_status_u_option) {
			this.setUntracked_in_ms((ModernizedCProgram.getnanotime() - t_begin) / 1000000);
		} 
	}
	public int has_unmerged() {
		int i;
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		int generatedStagemask = d.getStagemask();
		for (i = 0; i < generatedNr; i++) {
			wt_status_change_data d = new wt_status_change_data();
			d = generatedItems[i].getUtil();
			if (generatedStagemask) {
				return 1;
			} 
		}
		return 0;
	}
	public void wt_status_collect() {
		repository generatedRepo = this.getRepo();
		ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 762, ("status"), ("worktrees"), (generatedRepo));
		s.wt_status_collect_changes_worktree();
		ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 764, ("status"), ("worktrees"), (generatedRepo));
		int generatedIs_initial = this.getIs_initial();
		if (generatedIs_initial) {
			ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 767, ("status"), ("initial"), (generatedRepo));
			s.wt_status_collect_changes_initial();
			ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 769, ("status"), ("initial"), (generatedRepo));
		} else {
				ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 771, ("status"), ("index"), (generatedRepo));
				s.wt_status_collect_changes_index();
				ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 773, ("status"), ("index"), (generatedRepo));
		} 
		ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 776, ("status"), ("untracked"), (generatedRepo));
		s.wt_status_collect_untracked();
		ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 778, ("status"), ("untracked"), (generatedRepo));
		wt_status_state generatedState = this.getState();
		Byte generatedBranch = this.getBranch();
		ModernizedCProgram.wt_status_get_state(generatedRepo, generatedState, generatedBranch && !/*Error: Function owner not recognized*/strcmp(generatedBranch, "HEAD"));
		int generatedMerge_in_progress = generatedState.getMerge_in_progress();
		if (generatedMerge_in_progress && !s.has_unmerged()) {
			this.setCommittable(1);
		} 
	}
	public void wt_status_collect_free_buffers() {
		wt_status_state generatedState = this.getState();
		Byte generatedBranch = generatedState.getBranch();
		ModernizedCProgram.free(generatedBranch);
		Byte generatedOnto = generatedState.getOnto();
		ModernizedCProgram.free(generatedOnto);
		Byte generatedDetached_from = generatedState.getDetached_from();
		ModernizedCProgram.free(generatedDetached_from);
	}
	public void wt_longstatus_print_unmerged() {
		int shown_header = 0;
		int i;
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		Object generatedUtil = it.getUtil();
		int generatedStagemask = d.getStagemask();
		for (i = 0; i < generatedNr; i++) {
			wt_status_change_data d = new wt_status_change_data();
			string_list_item it = new string_list_item();
			it = (generatedItems[i]);
			d = generatedUtil;
			if (!generatedStagemask) {
				continue;
			} 
			if (!shown_header) {
				s.wt_longstatus_print_unmerged_header();
				shown_header = 1;
			} 
			ModernizedCProgram.wt_longstatus_print_unmerged_data(s, it);
		}
		if (shown_header) {
			s.wt_longstatus_print_trailer();
		} 
	}
	public void wt_longstatus_print_updated() {
		int shown_header = 0;
		int i;
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		Object generatedUtil = it.getUtil();
		int generatedIndex_status = d.getIndex_status();
		for (i = 0; i < generatedNr; i++) {
			wt_status_change_data d = new wt_status_change_data();
			string_list_item it = new string_list_item();
			it = (generatedItems[i]);
			d = generatedUtil;
			if (!generatedIndex_status || generatedIndex_status == (byte)'U') {
				continue;
			} 
			if (!shown_header) {
				s.wt_longstatus_print_cached_header();
				shown_header = 1;
			} 
			ModernizedCProgram.wt_longstatus_print_change_data(s, color_wt_status.WT_STATUS_UPDATED, it);
		}
		if (shown_header) {
			s/*
			 * -1 : has delete
			 *  0 : no change
			 *  1 : some change but no delete
			 */.wt_longstatus_print_trailer();
		} 
	}
	public int wt_status_check_worktree_changes(Integer dirty_submodules) {
		int i;
		int changes = 0;
		dirty_submodules = 0;
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		int generatedWorktree_status = d.getWorktree_status();
		int generatedDirty_submodule = d.getDirty_submodule();
		for (i = 0; i < generatedNr; i++) {
			wt_status_change_data d = new wt_status_change_data();
			d = generatedItems[i].getUtil();
			if (!generatedWorktree_status || generatedWorktree_status == (byte)'U') {
				continue;
			} 
			if (!changes) {
				changes = 1;
			} 
			if (generatedDirty_submodule) {
				dirty_submodules = 1;
			} 
			if (generatedWorktree_status == (byte)'D') {
				changes = -1;
			} 
		}
		return changes;
	}
	public void wt_longstatus_print_changed() {
		int i;
		int dirty_submodules;
		int worktree_changes = s.wt_status_check_worktree_changes(dirty_submodules);
		if (!worktree_changes) {
			return /*Error: Unsupported expression*/;
		} 
		s.wt_longstatus_print_dirty_header(worktree_changes < 0, dirty_submodules);
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		Object generatedUtil = it.getUtil();
		int generatedWorktree_status = d.getWorktree_status();
		for (i = 0; i < generatedNr; i++) {
			wt_status_change_data d = new wt_status_change_data();
			string_list_item it = new string_list_item();
			it = (generatedItems[i]);
			d = generatedUtil;
			if (!generatedWorktree_status || generatedWorktree_status == (byte)'U') {
				continue;
			} 
			ModernizedCProgram.wt_longstatus_print_change_data(s, color_wt_status.WT_STATUS_CHANGED, it);
		}
		s.wt_longstatus_print_trailer();
	}
	public void wt_longstatus_print_stash_summary() {
		int stash_count = 0;
		ModernizedCProgram.for_each_reflog_ent("refs/stash", stash_count_refs, stash_count);
		if (stash_count > 0) {
			s.status_printf_ln("", ModernizedCProgram.Q_("Your stash currently has %d entry", "Your stash currently has %d entries", stash_count), stash_count);
		} 
	}
	public void wt_longstatus_print_submodule_summary(int uncommitted) {
		child_process sm_summary = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf cmd_stdout = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf summary = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte summary_content;
		argv_array generatedEnv_array = sm_summary.getEnv_array();
		Object generatedIndex_file = this.getIndex_file();
		generatedEnv_array.argv_array_pushf("GIT_INDEX_FILE=%s", generatedIndex_file);
		argv_array generatedArgs = sm_summary.getArgs();
		generatedArgs.argv_array_push("submodule");
		generatedArgs.argv_array_push("summary");
		generatedArgs.argv_array_push(uncommitted ? "--files" : "--cached");
		generatedArgs.argv_array_push("--for-status");
		generatedArgs.argv_array_push("--summary-limit");
		int generatedSubmodule_summary = this.getSubmodule_summary();
		generatedArgs.argv_array_pushf("%d", generatedSubmodule_summary);
		int generatedAmend = this.getAmend();
		if (!uncommitted) {
			generatedArgs.argv_array_push(generatedAmend ? "HEAD^" : "HEAD");
		} 
		sm_summary.setGit_cmd(1);
		sm_summary.setNo_stdin(1);
		sm_summary.capture_command(cmd_stdout, 1024);
		Object generatedLen = cmd_stdout.getLen();
		if (generatedLen) {
			if (uncommitted) {
				summary.strbuf_addstr(ModernizedCProgram._("Submodules changed but not updated:"));
			} else {
					summary.strbuf_addstr(ModernizedCProgram._("Submodule changes to be committed:"));
			} 
			summary.strbuf_addstr("\n\n");
		} 
		summary.strbuf_addbuf(cmd_stdout);
		cmd_stdout.strbuf_release();
		int generatedDisplay_comment_prefix = this.getDisplay_comment_prefix();
		if (generatedDisplay_comment_prefix) {
			size_t len = new size_t();
			summary_content = summary.strbuf_detach(ModernizedCProgram.len);
			summary.strbuf_add_commented_lines(summary_content, ModernizedCProgram.len);
			ModernizedCProgram.free(summary_content);
		} 
		byte[] generatedBuf = summary.getBuf();
		_iobuf generatedFp = this.getFp();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(generatedBuf, generatedFp);
		summary.strbuf_release();
	}
	public void wt_longstatus_print_verbose() {
		rev_info rev = new rev_info();
		setup_revision_opt opt = new setup_revision_opt();
		int dirty_submodules;
		byte c = s.color(color_wt_status.WT_STATUS_HEADER);
		repository generatedRepo = this.getRepo();
		ModernizedCProgram.repo_init_revisions(generatedRepo, rev, ((Object)0));
		diff_options generatedDiffopt = rev.getDiffopt();
		diff_flags generatedFlags = generatedDiffopt.getFlags();
		generatedFlags.setAllow_textconv(1);
		generatedDiffopt.setIta_invisible_in_index(1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opt, 0, /*Error: sizeof expression not supported yet*/);
		int generatedIs_initial = this.getIs_initial();
		Object generatedReference = this.getReference();
		opt.setDef(generatedIs_initial ? ModernizedCProgram.empty_tree_oid_hex() : generatedReference);
		ModernizedCProgram.setup_revisions(0, ((Object)0), rev, opt);
		int generatedOutput_format = generatedDiffopt.getOutput_format();
		generatedOutput_format |=  -1024;
		int generatedDetect_rename = this.getDetect_rename();
		generatedDiffopt.setDetect_rename(generatedDetect_rename >= 0 ? generatedDetect_rename : generatedDetect_rename);
		int generatedRename_limit = this.getRename_limit();
		generatedDiffopt.setRename_limit(generatedRename_limit >= 0 ? generatedRename_limit : generatedRename_limit);
		int generatedRename_score = this.getRename_score();
		generatedDiffopt.setRename_score(generatedRename_score >= 0 ? generatedRename_score : generatedRename_score);
		_iobuf generatedFp = this.getFp();
		generatedDiffopt.setFile(generatedFp);
		generatedDiffopt.setClose_file(0/*
			 * If we're not going to stdout, then we definitely don't
			 * want color, since we are going to the commit message
			 * file (and even the "auto" setting won't work, since it
			 * will have checked isatty on stdout). But we then do want
			 * to insert the scissor line here to reliably remove the
			 * diff before committing.
			 */);
		if (generatedFp != (_iob[1])) {
			generatedDiffopt.setUse_color(0);
			generatedFp.wt_status_add_cut_line();
		} 
		int generatedVerbose = this.getVerbose();
		int generatedCommittable = this.getCommittable();
		if (generatedVerbose > 1 && generatedCommittable) {
			if (generatedFp != (_iob[/* print_updated() printed a header, so do we */1])) {
				s.wt_longstatus_print_trailer();
			} 
			s.status_printf_ln(c, ModernizedCProgram._("Changes to be committed:"));
			generatedDiffopt.setA_prefix("c/");
			generatedDiffopt.setB_prefix("i/");
		} 
		rev.run_diff_index(/* else use prefix as per user config */1);
		if (generatedVerbose > 1 && s.wt_status_check_worktree_changes(dirty_submodules)) {
			s.status_printf_ln(c, "--------------------------------------------------");
			s.status_printf_ln(c, ModernizedCProgram._("Changes not staged for commit:"));
			ModernizedCProgram.setup_work_tree();
			generatedDiffopt.setA_prefix("i/");
			generatedDiffopt.setB_prefix("w/");
			rev.run_diff_files(0);
		} 
	}
	public void wt_longstatus_print_tracking() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte cp;
		byte ep;
		byte branch_name;
		branch branch = new branch();
		byte[] comment_line_string = new byte[3];
		int i;
		uint64_t t_begin = 0;
		Byte generatedBranch = this.getBranch();
		int generatedIs_initial = this.getIs_initial();
		((generatedBranch && !generatedIs_initial) ? (Object)0 : /*Error: Function owner not recognized*/_assert("s->branch && !s->is_initial", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 1100));
		if (!ModernizedCProgram.skip_prefix(generatedBranch, "refs/heads/", branch_name)) {
			return /*Error: Unsupported expression*/;
		} 
		branch = /*Error: Function owner not recognized*/branch_get(branch_name);
		t_begin = ModernizedCProgram.getnanotime();
		ahead_behind_flags generatedAhead_behind_flags = this.getAhead_behind_flags();
		if (!/*Error: Function owner not recognized*/format_tracking_info(branch, sb, generatedAhead_behind_flags)) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.advice_status_ahead_behind_warning && generatedAhead_behind_flags == ahead_behind_flags.AHEAD_BEHIND_FULL) {
			uint64_t t_delta_in_ms = (ModernizedCProgram.getnanotime() - t_begin) / 1000000;
			if (t_delta_in_ms > (2 * 1000)) {
				sb.strbuf_addf(ModernizedCProgram._("\nIt took %.2f seconds to compute the branch ahead/behind values.\nYou can use '--no-ahead-behind' to avoid this.\n"), t_delta_in_ms / 1000.0);
			} 
		} 
		i = 0;
		int generatedDisplay_comment_prefix = this.getDisplay_comment_prefix();
		if (generatedDisplay_comment_prefix) {
			comment_line_string[i++] = ModernizedCProgram.comment_line_char;
			comment_line_string[i++] = (byte)' ';
		} 
		comment_line_string[i] = (byte)'\0';
		_iobuf generatedFp = this.getFp();
		byte[] generatedBuf = sb.getBuf();
		for (cp = generatedBuf; (ep = /*Error: Function owner not recognized*/strchr(cp, (byte)'\n')) != ((Object)0); cp = ep + 1) {
			generatedFp.color_fprintf_ln(s.color(color_wt_status.WT_STATUS_HEADER), "%s%.*s", comment_line_string, (int)(ep - cp), cp);
		}
		if (generatedDisplay_comment_prefix) {
			generatedFp.color_fprintf_ln(s.color(color_wt_status.WT_STATUS_HEADER), "%c", ModernizedCProgram.comment_line_char);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", generatedFp);
		} 
		sb.strbuf_release();
	}
	public void show_merge_in_progress(Object color) {
		int generatedHints = this.getHints();
		if (s.has_unmerged()) {
			s.status_printf_ln(color, ModernizedCProgram._("You have unmerged paths."));
			if (generatedHints) {
				s.status_printf_ln(color, ModernizedCProgram._("  (fix conflicts and run \"git commit\")"));
				s.status_printf_ln(color, ModernizedCProgram._("  (use \"git merge --abort\" to abort the merge)"));
			} 
		} else {
				s.status_printf_ln(color, ModernizedCProgram._("All conflicts fixed but you are still merging."));
				if (generatedHints) {
					s.status_printf_ln(color, ModernizedCProgram._("  (use \"git commit\" to conclude merge)"));
				} 
		} 
		s.wt_longstatus_print_trailer();
	}
	public void show_am_in_progress(Object color) {
		s.status_printf_ln(color, ModernizedCProgram._("You are in the middle of an am session."));
		wt_status_state generatedState = this.getState();
		int generatedAm_empty_patch = generatedState.getAm_empty_patch();
		if (generatedAm_empty_patch) {
			s.status_printf_ln(color, ModernizedCProgram._("The current patch is empty."));
		} 
		int generatedHints = this.getHints();
		if (generatedHints) {
			if (!generatedAm_empty_patch) {
				s.status_printf_ln(color, ModernizedCProgram._("  (fix conflicts and then run \"git am --continue\")"));
			} 
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git am --skip\" to skip this patch)"));
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git am --abort\" to restore the original branch)"));
		} 
		s.wt_longstatus_print_trailer();
	}
	public int split_commit_in_progress() {
		int split_in_progress = 0;
		byte head;
		byte orig_head;
		byte rebase_amend;
		byte rebase_orig_head;
		int generatedAmend = this.getAmend();
		int generatedNowarn = this.getNowarn();
		int generatedWorkdir_dirty = this.getWorkdir_dirty();
		Byte generatedBranch = this.getBranch();
		if ((!generatedAmend && !generatedNowarn && !generatedWorkdir_dirty) || !generatedBranch || /*Error: Function owner not recognized*/strcmp(generatedBranch, "HEAD")) {
			return 0;
		} 
		head = ModernizedCProgram.read_line_from_git_path("HEAD");
		orig_head = ModernizedCProgram.read_line_from_git_path("ORIG_HEAD");
		rebase_amend = ModernizedCProgram.read_line_from_git_path("rebase-merge/amend");
		rebase_orig_head = ModernizedCProgram.read_line_from_git_path("rebase-merge/orig-head");
		if (!head || !orig_head || !rebase_amend || !rebase_orig_head) {
			;
		}  else if (!/*Error: Function owner not recognized*/strcmp(rebase_amend, rebase_orig_head)) {
			split_in_progress = !!/*Error: Function owner not recognized*/strcmp(head, rebase_amend);
		}  else if (/*Error: Function owner not recognized*/strcmp(orig_head, rebase_orig_head)) {
			split_in_progress = 1;
		} 
		ModernizedCProgram.free(head);
		ModernizedCProgram.free(orig_head);
		ModernizedCProgram.free(rebase_amend);
		ModernizedCProgram.free(rebase_orig_head);
		return split_in_progress/*
		 * Turn
		 * "pick d6a2f0303e897ec257dd0e0a39a5ccb709bc2047 some message"
		 * into
		 * "pick d6a2f03 some message"
		 *
		 * The function assumes that the line does not contain useless spaces
		 * before or after the command.
		 */;
	}
	public void show_rebase_information(Object color) {
		wt_status_state generatedState = this.getState();
		int generatedRebase_interactive_in_progress = generatedState.getRebase_interactive_in_progress();
		int generatedNr = have_done.getNr();
		string_list_item[] generatedItems = have_done.getItems();
		int generatedHints = this.getHints();
		if (generatedRebase_interactive_in_progress) {
			int i;
			int nr_lines_to_show = 2;
			string_list have_done = new string_list(((Object)0), 0, 0, 1, ((Object)0));
			string_list yet_to_do = new string_list(((Object)0), 0, 0, 1, ((Object)0));
			have_done.read_rebase_todolist("rebase-merge/done");
			if (yet_to_do.read_rebase_todolist("rebase-merge/git-rebase-todo")) {
				s.status_printf_ln(color, ModernizedCProgram._("git-rebase-todo is missing."));
			} 
			if (generatedNr == 0) {
				s.status_printf_ln(color, ModernizedCProgram._("No commands done."));
			} else {
					s.status_printf_ln(color, ModernizedCProgram.Q_("Last command done (%d command done):", "Last commands done (%d commands done):", generatedNr), generatedNr);
					for (i = (generatedNr > nr_lines_to_show) ? generatedNr - nr_lines_to_show : 0; i < generatedNr; i++) {
						s.status_printf_ln(color, "   %s", generatedItems[i].getString());
					}
					if (generatedNr > nr_lines_to_show && generatedHints) {
						s.status_printf_ln(color, ModernizedCProgram._("  (see more in file %s)"), ModernizedCProgram.git_path("rebase-merge/done"));
					} 
			} 
			if (generatedNr == 0) {
				s.status_printf_ln(color, ModernizedCProgram._("No commands remaining."));
			} else {
					s.status_printf_ln(color, ModernizedCProgram.Q_("Next command to do (%d remaining command):", "Next commands to do (%d remaining commands):", generatedNr), generatedNr);
					for (i = 0; i < nr_lines_to_show && i < generatedNr; i++) {
						s.status_printf_ln(color, "   %s", generatedItems[i].getString());
					}
					if (generatedHints) {
						s.status_printf_ln(color, ModernizedCProgram._("  (use \"git rebase --edit-todo\" to view and edit)"));
					} 
			} 
			yet_to_do.string_list_clear(0);
			have_done.string_list_clear(0);
		} 
	}
	public void print_rebase_state(Object color) {
		wt_status_state generatedState = this.getState();
		Byte generatedBranch = generatedState.getBranch();
		Byte generatedOnto = generatedState.getOnto();
		if (generatedBranch) {
			s.status_printf_ln(color, ModernizedCProgram._("You are currently rebasing branch '%s' on '%s'."), generatedBranch, generatedOnto);
		} else {
				s.status_printf_ln(color, ModernizedCProgram._("You are currently rebasing."));
		} 
	}
	public void show_rebase_in_progress(Object color) {
		stat st = new stat();
		s.show_rebase_information(color);
		int generatedHints = this.getHints();
		wt_status_state generatedState = this.getState();
		int generatedRebase_in_progress = generatedState.getRebase_in_progress();
		repository generatedRepo = this.getRepo();
		Byte generatedBranch = generatedState.getBranch();
		Byte generatedOnto = generatedState.getOnto();
		int generatedAmend = this.getAmend();
		if (s.has_unmerged()) {
			s.print_rebase_state(color);
			if (generatedHints) {
				s.status_printf_ln(color, ModernizedCProgram._("  (fix conflicts and then run \"git rebase --continue\")"));
				s.status_printf_ln(color, ModernizedCProgram._("  (use \"git rebase --skip\" to skip this patch)"));
				s.status_printf_ln(color, ModernizedCProgram._("  (use \"git rebase --abort\" to check out the original branch)"));
			} 
		}  else if (generatedRebase_in_progress || !/*Error: Function owner not recognized*/stat(generatedRepo.git_path_merge_msg(), st)) {
			s.print_rebase_state(color);
			if (generatedHints) {
				s.status_printf_ln(color, ModernizedCProgram._("  (all conflicts fixed: run \"git rebase --continue\")"));
			} 
		}  else if (s.split_commit_in_progress()) {
			if (generatedBranch) {
				s.status_printf_ln(color, ModernizedCProgram._("You are currently splitting a commit while rebasing branch '%s' on '%s'."), generatedBranch, generatedOnto);
			} else {
					s.status_printf_ln(color, ModernizedCProgram._("You are currently splitting a commit during a rebase."));
			} 
			if (generatedHints) {
				s.status_printf_ln(color, ModernizedCProgram._("  (Once your working directory is clean, run \"git rebase --continue\")"));
			} 
		} else {
				if (generatedBranch) {
					s.status_printf_ln(color, ModernizedCProgram._("You are currently editing a commit while rebasing branch '%s' on '%s'."), generatedBranch, generatedOnto);
				} else {
						s.status_printf_ln(color, ModernizedCProgram._("You are currently editing a commit during a rebase."));
				} 
				if (generatedHints && !generatedAmend) {
					s.status_printf_ln(color, ModernizedCProgram._("  (use \"git commit --amend\" to amend the current commit)"));
					s.status_printf_ln(color, ModernizedCProgram._("  (use \"git rebase --continue\" once you are satisfied with your changes)"));
				} 
		} 
		s.wt_longstatus_print_trailer();
	}
	public void show_cherry_pick_in_progress(Object color) {
		wt_status_state generatedState = this.getState();
		object_id generatedCherry_pick_head_oid = generatedState.getCherry_pick_head_oid();
		if (ModernizedCProgram.is_null_oid(generatedCherry_pick_head_oid)) {
			s.status_printf_ln(color, ModernizedCProgram._("Cherry-pick currently in progress."));
		} else {
				s.status_printf_ln(color, ModernizedCProgram._("You are currently cherry-picking commit %s."), ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedCherry_pick_head_oid, ModernizedCProgram.default_abbrev));
		} 
		int generatedHints = this.getHints();
		if (generatedHints) {
			if (s.has_unmerged()) {
				s.status_printf_ln(color, ModernizedCProgram._("  (fix conflicts and run \"git cherry-pick --continue\")"));
			}  else if (ModernizedCProgram.is_null_oid(generatedCherry_pick_head_oid)) {
				s.status_printf_ln(color, ModernizedCProgram._("  (run \"git cherry-pick --continue\" to continue)"));
			} else {
					s.status_printf_ln(color, ModernizedCProgram._("  (all conflicts fixed: run \"git cherry-pick --continue\")"));
			} 
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git cherry-pick --skip\" to skip this patch)"));
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git cherry-pick --abort\" to cancel the cherry-pick operation)"));
		} 
		s.wt_longstatus_print_trailer();
	}
	public void show_revert_in_progress(Object color) {
		wt_status_state generatedState = this.getState();
		object_id generatedRevert_head_oid = generatedState.getRevert_head_oid();
		if (ModernizedCProgram.is_null_oid(generatedRevert_head_oid)) {
			s.status_printf_ln(color, ModernizedCProgram._("Revert currently in progress."));
		} else {
				s.status_printf_ln(color, ModernizedCProgram._("You are currently reverting commit %s."), ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedRevert_head_oid, ModernizedCProgram.default_abbrev));
		} 
		int generatedHints = this.getHints();
		if (generatedHints) {
			if (s.has_unmerged()) {
				s.status_printf_ln(color, ModernizedCProgram._("  (fix conflicts and run \"git revert --continue\")"));
			}  else if (ModernizedCProgram.is_null_oid(generatedRevert_head_oid)) {
				s.status_printf_ln(color, ModernizedCProgram._("  (run \"git revert --continue\" to continue)"));
			} else {
					s.status_printf_ln(color, ModernizedCProgram._("  (all conflicts fixed: run \"git revert --continue\")"));
			} 
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git revert --skip\" to skip this patch)"));
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git revert --abort\" to cancel the revert operation)"));
		} 
		s.wt_longstatus_print_trailer();
	}
	public void show_bisect_in_progress(Object color) {
		wt_status_state generatedState = this.getState();
		Byte generatedBranch = generatedState.getBranch();
		if (generatedBranch) {
			s.status_printf_ln(color, ModernizedCProgram._("You are currently bisecting, started from branch '%s'."), generatedBranch);
		} else {
				s.status_printf_ln(color, ModernizedCProgram._("You are currently bisecting."));
		} 
		int generatedHints = this.getHints();
		if (generatedHints) {
			s.status_printf_ln(color, ModernizedCProgram._("  (use \"git bisect reset\" to get back to the original branch)"));
		} 
		s/*
		 * Extract branch information from rebase/bisect
		 */.wt_longstatus_print_trailer();
	}
	public void wt_longstatus_print_state() {
		byte state_color = s.color(color_wt_status.WT_STATUS_HEADER);
		wt_status_state generatedState = this.getState();
		wt_status_state state = generatedState;
		int generatedMerge_in_progress = state.getMerge_in_progress();
		int generatedRebase_interactive_in_progress = state.getRebase_interactive_in_progress();
		_iobuf generatedFp = this.getFp();
		int generatedAm_in_progress = state.getAm_in_progress();
		int generatedRebase_in_progress = state.getRebase_in_progress();
		int generatedCherry_pick_in_progress = state.getCherry_pick_in_progress();
		int generatedRevert_in_progress = state.getRevert_in_progress();
		if (generatedMerge_in_progress) {
			if (generatedRebase_interactive_in_progress) {
				s.show_rebase_information(state_color);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", generatedFp);
			} 
			s.show_merge_in_progress(state_color);
		}  else if (generatedAm_in_progress) {
			s.show_am_in_progress(state_color);
		}  else if (generatedRebase_in_progress || generatedRebase_interactive_in_progress) {
			s.show_rebase_in_progress(state_color);
		}  else if (generatedCherry_pick_in_progress) {
			s.show_cherry_pick_in_progress(state_color);
		}  else if (generatedRevert_in_progress) {
			s.show_revert_in_progress(state_color);
		} 
		int generatedBisect_in_progress = state.getBisect_in_progress();
		if (generatedBisect_in_progress) {
			s.show_bisect_in_progress(state_color);
		} 
	}
	public void wt_longstatus_print() {
		byte branch_color = s.color(color_wt_status.WT_STATUS_ONBRANCH);
		byte branch_status_color = s.color(color_wt_status.WT_STATUS_HEADER);
		Byte generatedBranch = this.getBranch();
		wt_status_state generatedState = this.getState();
		int generatedRebase_in_progress = generatedState.getRebase_in_progress();
		int generatedRebase_interactive_in_progress = generatedState.getRebase_interactive_in_progress();
		Byte generatedOnto = generatedState.getOnto();
		Byte generatedDetached_from = generatedState.getDetached_from();
		int generatedDetached_at = generatedState.getDetached_at();
		int generatedIs_initial = this.getIs_initial();
		if (generatedBranch) {
			byte on_what = ModernizedCProgram._("On branch ");
			byte branch_name = generatedBranch;
			if (!/*Error: Function owner not recognized*/strcmp(branch_name, "HEAD")) {
				branch_status_color = s.color(color_wt_status.WT_STATUS_NOBRANCH);
				if (generatedRebase_in_progress || generatedRebase_interactive_in_progress) {
					if (generatedRebase_interactive_in_progress) {
						on_what = ModernizedCProgram._("interactive rebase in progress; onto ");
					} else {
							on_what = ModernizedCProgram._("rebase in progress; onto ");
					} 
					branch_name = generatedOnto;
				}  else if (generatedDetached_from) {
					branch_name = generatedDetached_from;
					if (generatedDetached_at) {
						on_what = ModernizedCProgram._("HEAD detached at ");
					} else {
							on_what = ModernizedCProgram._("HEAD detached from ");
					} 
				} else {
						branch_name = "";
						on_what = ModernizedCProgram._("Not currently on any branch.");
				} 
			} else {
					ModernizedCProgram.skip_prefix(branch_name, "refs/heads/", branch_name);
			} 
			s.status_printf(s.color(color_wt_status.WT_STATUS_HEADER), "%s", "");
			s.status_printf_more(branch_status_color, "%s", on_what);
			s.status_printf_more(branch_color, "%s\n", branch_name);
			if (!generatedIs_initial) {
				s.wt_longstatus_print_tracking();
			} 
		} 
		s.wt_longstatus_print_state();
		int generatedCommit_template = this.getCommit_template();
		if (generatedIs_initial) {
			s.status_printf_ln(s.color(color_wt_status.WT_STATUS_HEADER), "%s", "");
			s.status_printf_ln(s.color(color_wt_status.WT_STATUS_HEADER), generatedCommit_template ? ModernizedCProgram._("Initial commit") : ModernizedCProgram._("No commits yet"));
			s.status_printf_ln(s.color(color_wt_status.WT_STATUS_HEADER), "%s", "");
		} 
		s.wt_longstatus_print_updated();
		s.wt_longstatus_print_unmerged();
		s.wt_longstatus_print_changed();
		int generatedSubmodule_summary = this.getSubmodule_summary();
		Object generatedIgnore_submodule_arg = this.getIgnore_submodule_arg();
		if (generatedSubmodule_summary && (!generatedIgnore_submodule_arg || /*Error: Function owner not recognized*/strcmp(generatedIgnore_submodule_arg, "all"))) {
			s.wt_longstatus_print_submodule_summary(/* staged */0);
			s.wt_longstatus_print_submodule_summary(/* unstaged */1);
		} 
		untracked_status_type generatedShow_untracked_files = this.getShow_untracked_files();
		string_list generatedUntracked = this.getUntracked();
		show_ignored_type generatedShow_ignored_mode = this.getShow_ignored_mode();
		string_list generatedIgnored = this.getIgnored();
		Object generatedUntracked_in_ms = this.getUntracked_in_ms();
		int generatedCommittable = this.getCommittable();
		int generatedHints = this.getHints();
		if (generatedShow_untracked_files) {
			ModernizedCProgram.wt_longstatus_print_other(s, generatedUntracked, ModernizedCProgram._("Untracked files"), "add");
			if (generatedShow_ignored_mode) {
				ModernizedCProgram.wt_longstatus_print_other(s, generatedIgnored, ModernizedCProgram._("Ignored files"), "add -f");
			} 
			if (ModernizedCProgram.advice_status_u_option && 2000 < generatedUntracked_in_ms) {
				s.status_printf_ln("", "%s", "");
				s.status_printf_ln("", ModernizedCProgram._("It took %.2f seconds to enumerate untracked files. 'status -uno'\nmay speed it up, but you have to be careful not to forget to add\nnew files yourself (see 'git help status')."), generatedUntracked_in_ms / 1000.0);
			} 
		}  else if (generatedCommittable) {
			s.status_printf_ln("", ModernizedCProgram._("Untracked files not listed%s"), generatedHints ? ModernizedCProgram._(" (use -u option to show untracked files)") : "");
		} 
		int generatedVerbose = this.getVerbose();
		if (generatedVerbose) {
			s.wt_longstatus_print_verbose();
		} 
		int generatedAmend = this.getAmend();
		int generatedNowarn = this.getNowarn();
		int generatedWorkdir_dirty = this.getWorkdir_dirty();
		int generatedNr = generatedUntracked.getNr();
		if (!generatedCommittable) {
			if (generatedAmend) {
				s.status_printf_ln("", ModernizedCProgram._("No changes"));
			}  else if (generatedNowarn) {
				;
			}  else if (generatedWorkdir_dirty) {
				if (generatedHints) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("no changes added to commit (use \"git add\" and/or \"git commit -a\")\n"));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("no changes added to commit\n"));
				} 
			}  else if (generatedNr) {
				if (generatedHints) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing added to commit but untracked files present (use \"git add\" to track)\n"));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing added to commit but untracked files present\n"));
				} 
			}  else if (generatedIs_initial) {
				if (generatedHints) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing to commit (create/copy files and use \"git add\" to track)\n"));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing to commit\n"));
				} 
			}  else if (!generatedShow_untracked_files) {
				if (generatedHints) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing to commit (use -u to show untracked files)\n"));
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing to commit\n"));
				} 
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("nothing to commit, working tree clean\n"));
			} 
		} 
		int generatedShow_stash = this.getShow_stash();
		if (generatedShow_stash) {
			s.wt_longstatus_print_stash_summary();
		} 
	}
	public void wt_shortstatus_print_tracking() {
		branch branch = new branch();
		byte header_color = s.color(color_wt_status.WT_STATUS_HEADER);
		byte branch_color_local = s.color(color_wt_status.WT_STATUS_LOCAL_BRANCH);
		byte branch_color_remote = s.color(color_wt_status.WT_STATUS_REMOTE_BRANCH);
		byte base;
		byte short_base;
		byte branch_name;
		int num_ours;
		int num_theirs;
		int sti;
		int upstream_is_gone = 0;
		_iobuf generatedFp = this.getFp();
		generatedFp.color_fprintf(s.color(color_wt_status.WT_STATUS_HEADER), "## ");
		Byte generatedBranch = this.getBranch();
		if (!generatedBranch) {
			return /*Error: Unsupported expression*/;
		} 
		branch_name = generatedBranch;
		int generatedIs_initial = this.getIs_initial();
		int generatedNo_gettext = this.getNo_gettext();
		if (generatedIs_initial) {
			generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("No commits yet on ")) : ModernizedCProgram._(("No commits yet on "))));
		} 
		if (!/*Error: Function owner not recognized*/strcmp(generatedBranch, "HEAD")) {
			generatedFp.color_fprintf(s.color(color_wt_status.WT_STATUS_NOBRANCH), "%s", (generatedNo_gettext ? (("HEAD (no branch)")) : ModernizedCProgram._(("HEAD (no branch)"))));
			;
		} 
		ModernizedCProgram.skip_prefix(branch_name, "refs/heads/", branch_name);
		branch = /*Error: Function owner not recognized*/branch_get(branch_name);
		generatedFp.color_fprintf(branch_color_local, "%s", branch_name);
		ahead_behind_flags generatedAhead_behind_flags = this.getAhead_behind_flags();
		sti = /*Error: Function owner not recognized*/stat_tracking_info(branch, num_ours, num_theirs, base, 0, generatedAhead_behind_flags);
		if (sti < 0) {
			if (!base) {
				;
			} 
			upstream_is_gone = 1;
		} 
		short_base = ModernizedCProgram.shorten_unambiguous_ref(base, 0);
		generatedFp.color_fprintf(header_color, "...");
		generatedFp.color_fprintf(branch_color_remote, "%s", short_base);
		ModernizedCProgram.free(short_base);
		if (!upstream_is_gone && !sti) {
			;
		} 
		generatedFp.color_fprintf(header_color, " [");
		if (upstream_is_gone) {
			generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("gone")) : ModernizedCProgram._(("gone"))));
		}  else if (generatedAhead_behind_flags == ahead_behind_flags.AHEAD_BEHIND_QUICK) {
			generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("different")) : ModernizedCProgram._(("different"))));
		}  else if (!num_ours) {
			generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("behind ")) : ModernizedCProgram._(("behind "))));
			generatedFp.color_fprintf(branch_color_remote, "%d", num_theirs);
		}  else if (!num_theirs) {
			generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("ahead ")) : ModernizedCProgram._(("ahead "))));
			generatedFp.color_fprintf(branch_color_local, "%d", num_ours);
		} else {
				generatedFp.color_fprintf(header_color, (generatedNo_gettext ? (("ahead ")) : ModernizedCProgram._(("ahead "))));
				generatedFp.color_fprintf(branch_color_local, "%d", num_ours);
				generatedFp.color_fprintf(header_color, ", %s", (generatedNo_gettext ? (("behind ")) : ModernizedCProgram._(("behind "))));
				generatedFp.color_fprintf(branch_color_remote, "%d", num_theirs);
		} 
		generatedFp.color_fprintf(header_color, "]");
	}
	public void wt_shortstatus_print() {
		string_list_item it = new string_list_item();
		int generatedShow_branch = this.getShow_branch();
		if (generatedShow_branch) {
			s.wt_shortstatus_print_tracking();
		} 
		string_list generatedChange = this.getChange();
		string_list_item[] generatedItems = (generatedChange).getItems();
		int generatedNr = (generatedChange).getNr();
		Object generatedUtil = it.getUtil();
		int generatedStagemask = d.getStagemask();
		for (it = generatedItems; it && it < generatedItems + generatedNr; ++it) {
			wt_status_change_data d = generatedUtil;
			if (generatedStagemask) {
				ModernizedCProgram.wt_shortstatus_unmerged(it, s);
			} else {
					ModernizedCProgram.wt_shortstatus_status(it, s);
			} 
		}
		for (it = generatedItems; it && it < generatedItems + generatedNr; ++it) {
			ModernizedCProgram.wt_shortstatus_other(it, s, "??");
		}
		for (it = generatedItems; it && it < generatedItems + generatedNr; ++it) {
			ModernizedCProgram.wt_shortstatus_other(it, s, "!!");
		}
	}
	public void wt_porcelain_print() {
		this.setUse_color(0);
		this.setRelative_paths(0);
		this.setPrefix(((Object)0));
		this.setNo_gettext(1);
		s/*
		 * Print branch information for porcelain v2 output.  These lines
		 * are printed when the '--branch' parameter is given.
		 *
		 *    # branch.oid <commit><eol>
		 *    # branch.head <head><eol>
		 *   [# branch.upstream <upstream><eol>
		 *   [# branch.ab +<ahead> -<behind><eol>]]
		 *
		 *      <commit> ::= the current commit hash or the the literal
		 *                   "(initial)" to indicate an initialized repo
		 *                   with no commits.
		 *
		 *        <head> ::= <branch_name> the current branch name or
		 *                   "(detached)" literal when detached head or
		 *                   "(unknown)" when something is wrong.
		 *
		 *    <upstream> ::= the upstream branch name, when set.
		 *
		 *       <ahead> ::= integer ahead value or '?'.
		 *
		 *      <behind> ::= integer behind value or '?'.
		 *
		 * The end-of-line is defined by the -z flag.
		 *
		 *                 <eol> ::= NUL when -z,
		 *                           LF when NOT -z.
		 *
		 * When an upstream is set and present, the 'branch.ab' line will
		 * be printed with the ahead/behind counts for the branch and the
		 * upstream.  When AHEAD_BEHIND_QUICK is requested and the branches
		 * are different, '?' will be substituted for the actual count.
		 */.wt_shortstatus_print();
	}
	public void wt_porcelain_v2_print_tracking() {
		branch branch = new branch();
		byte base;
		byte branch_name;
		int ab_info;
		int nr_ahead;
		int nr_behind;
		int generatedNull_termination = this.getNull_termination();
		byte eol = generatedNull_termination ? (byte)'\0' : (byte)'\n';
		_iobuf generatedFp = this.getFp();
		int generatedIs_initial = this.getIs_initial();
		object_id generatedOid_commit = this.getOid_commit();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.oid %s%c", (generatedIs_initial ? "(initial)" : ModernizedCProgram.oid_to_hex(generatedOid_commit)), eol);
		Byte generatedBranch = this.getBranch();
		wt_status_state generatedState = this.getState();
		int generatedRebase_in_progress = generatedState.getRebase_in_progress();
		int generatedRebase_interactive_in_progress = generatedState.getRebase_interactive_in_progress();
		Byte generatedOnto = generatedState.getOnto();
		Byte generatedDetached_from = generatedState.getDetached_from();
		ahead_behind_flags generatedAhead_behind_flags = this.getAhead_behind_flags();
		if (!generatedBranch) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.head %s%c", "(unknown)", eol);
		} else {
				if (!/*Error: Function owner not recognized*/strcmp(generatedBranch, "HEAD")) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.head %s%c", "(detached)", eol);
					if (generatedRebase_in_progress || generatedRebase_interactive_in_progress) {
						branch_name = generatedOnto;
					}  else if (generatedDetached_from) {
						branch_name = generatedDetached_from;
					} else {
							branch_name = "";
					} 
				} else {
						branch_name = ((Object)0);
						ModernizedCProgram.skip_prefix(generatedBranch, "refs/heads/", branch_name);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.head %s%c", branch_name, eol);
				} 
				branch = /*Error: Function owner not recognized*/branch_get(/* Lookup stats on the upstream tracking branch, if set. */branch_name);
				base = ((Object)0);
				ab_info = /*Error: Function owner not recognized*/stat_tracking_info(branch, nr_ahead, nr_behind, base, 0, generatedAhead_behind_flags);
				if (base) {
					base = ModernizedCProgram.shorten_unambiguous_ref(base, 0);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.upstream %s%c", base, eol);
					ModernizedCProgram.free((byte)base);
					if (ab_info > 0) {
						if (nr_ahead || /* different */nr_behind) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.ab +%d -%d%c", nr_ahead, nr_behind, eol);
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.ab +? -?%c", eol);
						} 
					}  else if (!ab_info) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(generatedFp, "# branch.ab +0 -0%c", /* same */eol);
					} 
				} 
		} 
	}
	public void wt_porcelain_v2_print() {
		wt_status_change_data d = new wt_status_change_data();
		string_list_item it = new string_list_item();
		int i;
		int generatedShow_branch = this.getShow_branch();
		if (generatedShow_branch) {
			s.wt_porcelain_v2_print_tracking();
		} 
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		string_list_item[] generatedItems = generatedChange.getItems();
		Object generatedUtil = it.getUtil();
		int generatedStagemask = d.getStagemask();
		for (i = 0; i < generatedNr; i++) {
			it = (generatedItems[i]);
			d = generatedUtil;
			if (!generatedStagemask) {
				ModernizedCProgram.wt_porcelain_v2_print_changed_entry(it, s);
			} 
		}
		for (i = 0; i < generatedNr; i++) {
			it = (generatedItems[i]);
			d = generatedUtil;
			if (generatedStagemask) {
				ModernizedCProgram.wt_porcelain_v2_print_unmerged_entry(it, s);
			} 
		}
		for (i = 0; i < generatedNr; i++) {
			it = (generatedItems[i]);
			ModernizedCProgram.wt_porcelain_v2_print_other(it, s, (byte)'?');
		}
		for (i = 0; i < generatedNr; i++) {
			it = (generatedItems[i]);
			ModernizedCProgram.wt_porcelain_v2_print_other(it, s, (byte)'!');
		}
	}
	public void wt_status_print() {
		repository generatedRepo = this.getRepo();
		string_list generatedChange = this.getChange();
		int generatedNr = generatedChange.getNr();
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2369, ("status"), (generatedRepo), ("count/changed"), (generatedNr));
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2371, ("status"), (generatedRepo), ("count/untracked"), (generatedNr));
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2372, ("status"), (generatedRepo), ("count/ignored"), (generatedNr));
		ModernizedCProgram.trace2_region_enter_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2374, ("status"), ("print"), (generatedRepo));
		wt_status_format generatedStatus_format = this.getStatus_format();
		switch (generatedStatus_format) {
		case wt_status_format.STATUS_FORMAT_UNSPECIFIED:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2387, "finalize_deferred_config() should have been called");
				break;
		case wt_status_format.STATUS_FORMAT_PORCELAIN_V2:
				s.wt_porcelain_v2_print();
				break;
		case wt_status_format.STATUS_FORMAT_NONE:
		case wt_status_format.STATUS_FORMAT_PORCELAIN:
				s.wt_porcelain_print();
				break;
		case wt_status_format.STATUS_FORMAT_LONG:
				s.wt_longstatus_print();
				break;
		case wt_status_format.STATUS_FORMAT_SHORT:
				s.wt_shortstatus_print();
				break;
		}
		ModernizedCProgram.trace2_region_leave_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2395, ("status"), ("print"), (generatedRepo));
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public int getIs_initial() {
		return is_initial;
	}
	public void setIs_initial(int newIs_initial) {
		is_initial = newIs_initial;
	}
	public Byte getBranch() {
		return branch;
	}
	public void setBranch(Byte newBranch) {
		branch = newBranch;
	}
	public Object getReference() {
		return reference;
	}
	public void setReference(Object newReference) {
		reference = newReference;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getAmend() {
		return amend;
	}
	public void setAmend(int newAmend) {
		amend = newAmend;
	}
	public commit_whence getWhence() {
		return whence;
	}
	public void setWhence(commit_whence newWhence) {
		whence = newWhence;
	}
	public int getNowarn() {
		return nowarn;
	}
	public void setNowarn(int newNowarn) {
		nowarn = newNowarn;
	}
	public int getUse_color() {
		return use_color;
	}
	public void setUse_color(int newUse_color) {
		use_color = newUse_color;
	}
	public int getNo_gettext() {
		return no_gettext;
	}
	public void setNo_gettext(int newNo_gettext) {
		no_gettext = newNo_gettext;
	}
	public int getDisplay_comment_prefix() {
		return display_comment_prefix;
	}
	public void setDisplay_comment_prefix(int newDisplay_comment_prefix) {
		display_comment_prefix = newDisplay_comment_prefix;
	}
	public int getRelative_paths() {
		return relative_paths;
	}
	public void setRelative_paths(int newRelative_paths) {
		relative_paths = newRelative_paths;
	}
	public int getSubmodule_summary() {
		return submodule_summary;
	}
	public void setSubmodule_summary(int newSubmodule_summary) {
		submodule_summary = newSubmodule_summary;
	}
	public show_ignored_type getShow_ignored_mode() {
		return show_ignored_mode;
	}
	public void setShow_ignored_mode(show_ignored_type newShow_ignored_mode) {
		show_ignored_mode = newShow_ignored_mode;
	}
	public untracked_status_type getShow_untracked_files() {
		return show_untracked_files;
	}
	public void setShow_untracked_files(untracked_status_type newShow_untracked_files) {
		show_untracked_files = newShow_untracked_files;
	}
	public Object getIgnore_submodule_arg() {
		return ignore_submodule_arg;
	}
	public void setIgnore_submodule_arg(Object newIgnore_submodule_arg) {
		ignore_submodule_arg = newIgnore_submodule_arg;
	}
	public Object getColor_palette() {
		return color_palette;
	}
	public void setColor_palette(Object newColor_palette) {
		color_palette = newColor_palette;
	}
	public int getColopts() {
		return colopts;
	}
	public void setColopts(int newColopts) {
		colopts = newColopts;
	}
	public int getNull_termination() {
		return null_termination;
	}
	public void setNull_termination(int newNull_termination) {
		null_termination = newNull_termination;
	}
	public int getCommit_template() {
		return commit_template;
	}
	public void setCommit_template(int newCommit_template) {
		commit_template = newCommit_template;
	}
	public int getShow_branch() {
		return show_branch;
	}
	public void setShow_branch(int newShow_branch) {
		show_branch = newShow_branch;
	}
	public int getShow_stash() {
		return show_stash;
	}
	public void setShow_stash(int newShow_stash) {
		show_stash = newShow_stash;
	}
	public int getHints() {
		return hints;
	}
	public void setHints(int newHints) {
		hints = newHints;
	}
	public ahead_behind_flags getAhead_behind_flags() {
		return ahead_behind_flags;
	}
	public void setAhead_behind_flags(ahead_behind_flags newAhead_behind_flags) {
		ahead_behind_flags = newAhead_behind_flags;
	}
	public int getDetect_rename() {
		return detect_rename;
	}
	public void setDetect_rename(int newDetect_rename) {
		detect_rename = newDetect_rename;
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
	public wt_status_format getStatus_format() {
		return status_format;
	}
	public void setStatus_format(wt_status_format newStatus_format) {
		status_format = newStatus_format;
	}
	public wt_status_state getState() {
		return state;
	}
	public void setState(wt_status_state newState) {
		state = newState;
	}
	public object_id getOid_commit() {
		return oid_commit;
	}
	public void setOid_commit(object_id newOid_commit) {
		oid_commit = newOid_commit;
	}
	public int getCommittable() {
		return committable;
	}
	public void setCommittable(int newCommittable) {
		committable = newCommittable;
	}
	public int getWorkdir_dirty() {
		return workdir_dirty;
	}
	public void setWorkdir_dirty(int newWorkdir_dirty) {
		workdir_dirty = newWorkdir_dirty;
	}
	public Object getIndex_file() {
		return index_file;
	}
	public void setIndex_file(Object newIndex_file) {
		index_file = newIndex_file;
	}
	public _iobuf getFp() {
		return fp;
	}
	public void setFp(_iobuf newFp) {
		fp = newFp;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public string_list getChange() {
		return change;
	}
	public void setChange(string_list newChange) {
		change = newChange;
	}
	public string_list getUntracked() {
		return untracked;
	}
	public void setUntracked(string_list newUntracked) {
		untracked = newUntracked;
	}
	public string_list getIgnored() {
		return ignored;
	}
	public void setIgnored(string_list newIgnored) {
		ignored = newIgnored;
	}
	public Object getUntracked_in_ms() {
		return untracked_in_ms;
	}
	public void setUntracked_in_ms(Object newUntracked_in_ms) {
		untracked_in_ms = newUntracked_in_ms;
	}
}
