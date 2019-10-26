package application;

public class replay_opts {
	private replay_action action;
	private int edit;
	private int record_origin;
	private int no_commit;
	private int signoff;
	private int allow_ff;
	private int allow_rerere_auto;
	private int allow_empty;
	private int allow_empty_message;
	private int keep_redundant_commits;
	private int verbose;
	private int quiet;
	private int reschedule_failed_exec;
	private int mainline;
	private Byte gpg_sign;
	private commit_msg_cleanup_mode default_msg_cleanup;
	private int explicit_cleanup;
	private Byte strategy;
	private Byte xopts;
	private Object xopts_nr;
	private Object xopts_alloc;
	private strbuf current_fixups;
	private int current_fixup_count;
	private object_id squash_onto;
	private int have_squash_onto;
	private rev_info revs;
	
	public replay_opts(replay_action action, int edit, int record_origin, int no_commit, int signoff, int allow_ff, int allow_rerere_auto, int allow_empty, int allow_empty_message, int keep_redundant_commits, int verbose, int quiet, int reschedule_failed_exec, int mainline, Byte gpg_sign, commit_msg_cleanup_mode default_msg_cleanup, int explicit_cleanup, Byte strategy, Byte xopts, Object xopts_nr, Object xopts_alloc, strbuf current_fixups, int current_fixup_count, object_id squash_onto, int have_squash_onto, rev_info revs) {
		setAction(action);
		setEdit(edit);
		setRecord_origin(record_origin);
		setNo_commit(no_commit);
		setSignoff(signoff);
		setAllow_ff(allow_ff);
		setAllow_rerere_auto(allow_rerere_auto);
		setAllow_empty(allow_empty);
		setAllow_empty_message(allow_empty_message);
		setKeep_redundant_commits(keep_redundant_commits);
		setVerbose(verbose);
		setQuiet(quiet);
		setReschedule_failed_exec(reschedule_failed_exec);
		setMainline(mainline);
		setGpg_sign(gpg_sign);
		setDefault_msg_cleanup(default_msg_cleanup);
		setExplicit_cleanup(explicit_cleanup);
		setStrategy(strategy);
		setXopts(xopts);
		setXopts_nr(xopts_nr);
		setXopts_alloc(xopts_alloc);
		setCurrent_fixups(current_fixups);
		setCurrent_fixup_count(current_fixup_count);
		setSquash_onto(squash_onto);
		setHave_squash_onto(have_squash_onto);
		setRevs(revs);
	}
	public replay_opts() {
	}
	
	public replay_opts get_replay_opts(Object opts) {
		replay_opts replay = new replay_opts(, );
		replay.setAction(replay_action.REPLAY_INTERACTIVE_REBASE);
		replay.sequencer_init_config();
		replay.setSignoff(opts.getSignoff());
		replay.setAllow_ff(!(opts.getFlags() & .REBASE_FORCE));
		if (opts.getAllow_rerere_autoupdate()) {
			replay.setAllow_rerere_auto(opts.getAllow_rerere_autoupdate());
		} 
		replay.setAllow_empty(1);
		replay.setAllow_empty_message(opts.getAllow_empty_message());
		replay.setVerbose(opts.getFlags() & .REBASE_VERBOSE);
		replay.setReschedule_failed_exec(opts.getReschedule_failed_exec());
		replay.setGpg_sign(ModernizedCProgram.xstrdup_or_null(opts.getGpg_sign_opt()));
		replay.setStrategy(opts.getStrategy());
		if (opts.getStrategy_opts()) {
			replay.parse_strategy_opts(opts.getStrategy_opts());
		} 
		return replay;
	}
	public void sequencer_init_config() {
		this.setDefault_msg_cleanup(commit_msg_cleanup_mode.COMMIT_MSG_CLEANUP_NONE);
		.git_config(git_sequencer_config, opts);
	}
	public Object gpg_sign_opt_quoted() {
		strbuf buf = new strbuf(, , );
		buf.strbuf_setlen(0);
		Byte generatedGpg_sign = this.getGpg_sign();
		if (generatedGpg_sign) {
			buf.sq_quotef("-S%s", generatedGpg_sign);
		} 
		byte generatedBuf = buf.getBuf();
		return generatedBuf;
	}
	public int sequencer_remove_state() {
		strbuf buf = new strbuf(, , );
		int i;
		int ret = 0;
		byte generatedBuf = buf.getBuf();
		if (ModernizedCProgram.is_rebase_i(opts) && buf.strbuf_read_file(ModernizedCProgram.rebase_path_refs_to_delete(), 0) > 0) {
			byte p = generatedBuf;
			while (p) {
				byte eol = .strchr(p, (byte)'\n');
				if (eol) {
					eol = (byte)'\0';
				} 
				if (ModernizedCProgram.delete_ref("(rebase -i) cleanup", p, ((Object)0), 0) < 0) {
					ModernizedCProgram.warning(ModernizedCProgram._("could not delete '%s'"), p);
					ret = -1;
				} 
				if (!eol) {
					break;
				} 
				p = eol + 1;
			}
		} 
		Byte generatedGpg_sign = this.getGpg_sign();
		ModernizedCProgram.free(generatedGpg_sign);
		Byte generatedStrategy = this.getStrategy();
		ModernizedCProgram.free(generatedStrategy);
		Object generatedXopts_nr = this.getXopts_nr();
		Byte generatedXopts = this.getXopts();
		for (i = 0; i < generatedXopts_nr; i++) {
			ModernizedCProgram.free(generatedXopts[i]);
		}
		ModernizedCProgram.free(generatedXopts);
		strbuf generatedCurrent_fixups = this.getCurrent_fixups();
		generatedCurrent_fixups.strbuf_release();
		buf.strbuf_setlen(0);
		buf.strbuf_addstr(ModernizedCProgram.get_dir(opts));
		if (buf.remove_dir_recursively(0)) {
			ret = ();
		} 
		buf.strbuf_release();
		return ret;
	}
	public int prepare_revs() {
		replay_action generatedAction = this.getAction();
		rev_info generatedRevs = this.getRevs();
		int generatedNo_walk = generatedRevs.getNo_walk();
		int generatedReverse = generatedRevs.getReverse();
		if (generatedAction == replay_action.REPLAY_PICK && !generatedNo_walk) {
			generatedReverse ^=  1;
		} 
		if (generatedRevs.prepare_revision_walk()) {
			return ();
		} 
		return 0;
	}
	/*
		 * picking (but not reverting) ranges (but not individual revisions)
		 * should be done in reverse
		 */
	public void parse_strategy_opts(Byte raw_opts) {
		int i;
		byte strategy_opts_string = raw_opts;
		if (strategy_opts_string == (byte)' ') {
			strategy_opts_string++;
		} 
		Byte generatedXopts = this.getXopts();
		this.setXopts_nr(ModernizedCProgram.split_cmdline(strategy_opts_string, (byte)generatedXopts));
		Object generatedXopts_nr = this.getXopts_nr();
		for (i = 0; i < generatedXopts_nr; i++) {
			byte arg = generatedXopts[i];
			ModernizedCProgram.skip_prefix(arg, "--", arg);
			generatedXopts[i] = ModernizedCProgram.xstrdup(arg);
		}
	}
	public int read_populate_opts() {
		Byte generatedGpg_sign = this.getGpg_sign();
		strbuf generatedCurrent_fixups = this.getCurrent_fixups();
		byte generatedBuf = generatedCurrent_fixups.getBuf();
		int generatedCurrent_fixup_count = this.getCurrent_fixup_count();
		object_id generatedSquash_onto = this.getSquash_onto();
		if (ModernizedCProgram.is_rebase_i(opts)) {
			strbuf buf = new strbuf(, , );
			if (ModernizedCProgram.buf.read_oneliner(ModernizedCProgram.rebase_path_gpg_sign_opt(), 1)) {
				if (!ModernizedCProgram.starts_with(ModernizedCProgram.buf.getBuf(), "-S")) {
					ModernizedCProgram.buf.strbuf_setlen(0);
				} else {
						ModernizedCProgram.free(generatedGpg_sign);
						this.setGpg_sign(ModernizedCProgram.xstrdup(ModernizedCProgram.buf.getBuf() + 2));
				} 
				ModernizedCProgram.buf.strbuf_setlen(0);
			} 
			if (ModernizedCProgram.buf.read_oneliner(ModernizedCProgram.rebase_path_allow_rerere_autoupdate(), 1)) {
				if (!.strcmp(ModernizedCProgram.buf.getBuf(), "--rerere-autoupdate")) {
					this.setAllow_rerere_auto(1);
				}  else if (!.strcmp(ModernizedCProgram.buf.getBuf(), "--no-rerere-autoupdate")) {
					this.setAllow_rerere_auto(2);
				} 
				ModernizedCProgram.buf.strbuf_setlen(0);
			} 
			if (ModernizedCProgram.file_exists(ModernizedCProgram.rebase_path_verbose())) {
				this.setVerbose(1);
			} 
			if (ModernizedCProgram.file_exists(ModernizedCProgram.rebase_path_quiet())) {
				this.setQuiet(1);
			} 
			if (ModernizedCProgram.file_exists(ModernizedCProgram.rebase_path_signoff())) {
				this.setAllow_ff(0);
				this.setSignoff(1);
			} 
			if (ModernizedCProgram.file_exists(ModernizedCProgram.rebase_path_reschedule_failed_exec())) {
				this.setReschedule_failed_exec(1);
			} 
			ModernizedCProgram.read_strategy_opts(opts, ModernizedCProgram.buf);
			ModernizedCProgram.buf.strbuf_release();
			if (generatedCurrent_fixups.read_oneliner(ModernizedCProgram.rebase_path_current_fixups(), 1)) {
				byte p = generatedBuf;
				this.setCurrent_fixup_count(1);
				while ((p = .strchr(p, (byte)'\n'))) {
					generatedCurrent_fixup_count++;
					p++;
				}
			} 
			if (ModernizedCProgram.buf.read_oneliner(ModernizedCProgram.rebase_path_squash_onto(), 0)) {
				if (generatedSquash_onto.get_oid_hex(generatedBuf) < 0) {
					return ();
				} 
				this.setHave_squash_onto(1);
			} 
			return 0;
		} 
		if (!ModernizedCProgram.file_exists(ModernizedCProgram.git_path_opts_file())) {
			return 0/*
				 * The function git_parse_source(), called from git_config_from_file(),
				 * may die() in case of a syntactically incorrect file. We do not care
				 * about this case, though, because we wrote that file ourselves, so we
				 * are pretty certain that it is syntactically correct.
				 */;
		} 
		if (.git_config_from_file(populate_opts_cb, ModernizedCProgram.git_path_opts_file(), opts) < 0) {
			return ();
		} 
		return 0;
	}
	public void write_strategy_opts() {
		int i;
		strbuf buf = new strbuf(, , );
		Object generatedXopts_nr = this.getXopts_nr();
		Byte generatedXopts = this.getXopts();
		for (i = 0; i < generatedXopts_nr; ++i) {
			buf.strbuf_addf(" --%s", generatedXopts[i]);
		}
		byte generatedBuf = buf.getBuf();
		ModernizedCProgram.write_file(ModernizedCProgram.rebase_path_strategy_opts(), "%s\n", generatedBuf);
		buf.strbuf_release();
	}
	public int save_opts() {
		byte opts_file = ModernizedCProgram.git_path_opts_file();
		int res = 0;
		int generatedNo_commit = this.getNo_commit();
		if (generatedNo_commit) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.no-commit", "true");
		} 
		int generatedEdit = this.getEdit();
		if (generatedEdit) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.edit", "true");
		} 
		int generatedAllow_empty = this.getAllow_empty();
		if (generatedAllow_empty) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.allow-empty", "true");
		} 
		int generatedAllow_empty_message = this.getAllow_empty_message();
		if (generatedAllow_empty_message) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.allow-empty-message", "true");
		} 
		int generatedKeep_redundant_commits = this.getKeep_redundant_commits();
		if (generatedKeep_redundant_commits) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.keep-redundant-commits", "true");
		} 
		int generatedSignoff = this.getSignoff();
		if (generatedSignoff) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.signoff", "true");
		} 
		int generatedRecord_origin = this.getRecord_origin();
		if (generatedRecord_origin) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.record-origin", "true");
		} 
		int generatedAllow_ff = this.getAllow_ff();
		if (generatedAllow_ff) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.allow-ff", "true");
		} 
		int generatedMainline = this.getMainline();
		if (generatedMainline) {
			strbuf buf = new strbuf(, , );
			ModernizedCProgram.buf.strbuf_addf("%d", generatedMainline);
			res |=  .git_config_set_in_file_gently(opts_file, "options.mainline", ModernizedCProgram.buf.getBuf());
			ModernizedCProgram.buf.strbuf_release();
		} 
		Byte generatedStrategy = this.getStrategy();
		if (generatedStrategy) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.strategy", generatedStrategy);
		} 
		Byte generatedGpg_sign = this.getGpg_sign();
		if (generatedGpg_sign) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.gpg-sign", generatedGpg_sign);
		} 
		Byte generatedXopts = this.getXopts();
		Object generatedXopts_nr = this.getXopts_nr();
		if (generatedXopts) {
			int i;
			for (i = 0; i < generatedXopts_nr; i++) {
				res |=  .git_config_set_multivar_in_file_gently(opts_file, "options.strategy-option", generatedXopts[i], "^$", 0);
			}
		} 
		int generatedAllow_rerere_auto = this.getAllow_rerere_auto();
		if (generatedAllow_rerere_auto) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.allow-rerere-auto", generatedAllow_rerere_auto == 1 ? "true" : "false");
		} 
		int generatedExplicit_cleanup = this.getExplicit_cleanup();
		commit_msg_cleanup_mode generatedDefault_msg_cleanup = this.getDefault_msg_cleanup();
		if (generatedExplicit_cleanup) {
			res |=  .git_config_set_in_file_gently(opts_file, "options.default-msg-cleanup", ModernizedCProgram.describe_cleanup_mode(generatedDefault_msg_cleanup));
		} 
		return res;
	}
	public Object reflog_message(Object sub_action, Object fmt) {
		va_list ap = new va_list();
		strbuf buf = new strbuf(, , );
		.__builtin_va_start(ap, fmt);
		buf.strbuf_setlen(0);
		buf.strbuf_addstr(ModernizedCProgram.action_name(opts));
		if (sub_action) {
			buf.strbuf_addf(" (%s)", sub_action);
		} 
		if (fmt) {
			buf.strbuf_addstr(": ");
			buf.strbuf_vaddf(fmt, ap);
		} 
		.__builtin_va_end(ap);
		byte generatedBuf = buf.getBuf();
		return generatedBuf;
	}
	public Object revert_or_cherry_pick_usage() {
		replay_action generatedAction = this.getAction();
		return generatedAction == replay_action.REPLAY_REVERT ? ModernizedCProgram.revert_usage : ModernizedCProgram.cherry_pick_usage;
	}
	public int run_sequencer(int argc, Object argv) {
		byte usage_str = opts.revert_or_cherry_pick_usage();
		byte me = ModernizedCProgram.action_name(opts);
		byte cleanup_arg = ((Object)0);
		int cmd = 0;
		int generatedNo_commit = this.getNo_commit();
		int generatedEdit = this.getEdit();
		int generatedSignoff = this.getSignoff();
		int generatedAllow_rerere_auto = this.getAllow_rerere_auto();
		Byte generatedStrategy = this.getStrategy();
		Byte generatedGpg_sign = this.getGpg_sign();
		option[] base_options = new option[]{new option(parse_opt_type.OPTION_CMDMODE, (false), ("quit"), (cmd), ((Object)0), (("end revert or cherry-pick sequence")), parse_opt_option_flags.PARSE_OPT_NOARG | parse_opt_option_flags.PARSE_OPT_NONEG, ((Object)0), ((byte)'q')), new option(parse_opt_type.OPTION_CMDMODE, (false), ("continue"), (cmd), ((Object)0), (("resume revert or cherry-pick sequence")), parse_opt_option_flags.PARSE_OPT_NOARG | parse_opt_option_flags.PARSE_OPT_NONEG, ((Object)0), ((byte)'c')), new option(parse_opt_type.OPTION_CMDMODE, (false), ("abort"), (cmd), ((Object)0), (("cancel revert or cherry-pick sequence")), parse_opt_option_flags.PARSE_OPT_NOARG | parse_opt_option_flags.PARSE_OPT_NONEG, ((Object)0), ((byte)'a')), new option(parse_opt_type.OPTION_CMDMODE, (false), ("skip"), (cmd), ((Object)0), (("skip current commit and continue")), parse_opt_option_flags.PARSE_OPT_NOARG | parse_opt_option_flags.PARSE_OPT_NONEG, ((Object)0), ((byte)'s')), new option(parse_opt_type.OPTION_STRING, (false), ("cleanup"), (cleanup_arg), (("mode")), (("how to strip spaces and #comments from message")), (false)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'n'), ("no-commit"), (generatedNo_commit), ((Object)0), (("don't automatically commit")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'e'), ("edit"), (generatedEdit), ((Object)0), (("edit the commit message")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_CALLBACK, ((byte)'r'), (((Object)0)), ((Object)0), ((Object)0), ("no-op (backward compatibility)"), parse_opt_option_flags.PARSE_OPT_HIDDEN | parse_opt_option_flags.PARSE_OPT_NOARG, ModernizedCProgram.parse_opt_noop_cb), new option(parse_opt_type.OPTION_SET_INT, ((byte)'s'), ("signoff"), (generatedSignoff), ((Object)0), (("add Signed-off-by:")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_CALLBACK, ((byte)'m'), ("mainline"), (opts), (("parent-number")), (("select mainline parent")), (false), (option_parse_m)), new option(parse_opt_type.OPTION_CALLBACK, (false), ("rerere-autoupdate"), ((generatedAllow_rerere_auto)), ((Object)0), (("update the index with reused conflict resolution if possible")), parse_opt_option_flags.PARSE_OPT_NOARG, ModernizedCProgram.parse_opt_tertiary), new option(parse_opt_type.OPTION_STRING, (false), ("strategy"), (generatedStrategy), (("strategy")), (("merge strategy")), (false)), new option(parse_opt_type.OPTION_CALLBACK, ((byte)'X'), ("strategy-option"), (opts), (("option")), (("option for merge strategy")), (false), (option_parse_x)), new option(parse_opt_type.OPTION_STRING, (byte)'S', "gpg-sign", generatedGpg_sign, ("key-id"), ("GPG sign commit"), parse_opt_option_flags.PARSE_OPT_OPTARG, ((Object)0), (intptr_t)""), new option(parse_opt_type.OPTION_END)};
		option options = base_options;
		replay_action generatedAction = this.getAction();
		int generatedRecord_origin = this.getRecord_origin();
		int generatedAllow_ff = this.getAllow_ff();
		int generatedAllow_empty = this.getAllow_empty();
		int generatedAllow_empty_message = this.getAllow_empty_message();
		int generatedKeep_redundant_commits = this.getKeep_redundant_commits();
		if (generatedAction == replay_action.REPLAY_PICK) {
			option[] cp_extra = new option[]{new option(parse_opt_type.OPTION_SET_INT, ((byte)'x'), (((Object)0)), (generatedRecord_origin), ((Object)0), (("append commit name")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("ff"), (generatedAllow_ff), ((Object)0), (("allow fast-forward")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("allow-empty"), (generatedAllow_empty), ((Object)0), (("preserve initially empty commits")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("allow-empty-message"), (generatedAllow_empty_message), ((Object)0), (("allow commits with empty messages")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("keep-redundant-commits"), (generatedKeep_redundant_commits), ((Object)0), (("keep redundant, empty commits")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_END)};
			options = options.parse_options_concat(cp_extra);
		} 
		argc = ModernizedCProgram.parse_options(argc, argv, ((Object)0), options, usage_str, parse_opt_flags.PARSE_OPT_KEEP_ARGV0 | parse_opt_flags.PARSE_OPT_KEEP_UNKNOWN);
		if (generatedKeep_redundant_commits) {
			this.setAllow_empty(1);
		} 
		if (cleanup_arg) {
			this.setDefault_msg_cleanup(ModernizedCProgram.get_cleanup_mode(cleanup_arg, 1));
			this.setExplicit_cleanup(1);
		} 
		int generatedMainline = this.getMainline();
		Byte generatedXopts = this.getXopts();
		if (/* Check for incompatible command line arguments */cmd) {
			byte this_operation;
			if (cmd == (byte)'q') {
				this_operation = "--quit";
			}  else if (cmd == (byte)'c') {
				this_operation = "--continue";
			}  else if (cmd == (byte)'s') {
				this_operation = "--skip";
			} else {
					((cmd == (byte)'a') ? (Object)0 : ._assert("cmd == 'a'", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\revert.c", 158));
					this_operation = "--abort";
			} 
			ModernizedCProgram.verify_opt_compatible(me, this_operation, "--no-commit", generatedNo_commit, "--signoff", generatedSignoff, "--mainline", generatedMainline, "--strategy", generatedStrategy ? 1 : 0, "--strategy-option", generatedXopts ? 1 : 0, "-x", generatedRecord_origin, "--ff", generatedAllow_ff, "--rerere-autoupdate", generatedAllow_rerere_auto == 1, "--no-rerere-autoupdate", generatedAllow_rerere_auto == 2, ((Object)0));
		} 
		if (generatedAllow_ff) {
			ModernizedCProgram.verify_opt_compatible(me, "--ff", "--signoff", generatedSignoff, "--no-commit", generatedNo_commit, "-x", generatedRecord_origin, "--edit", generatedEdit, ((Object)0));
		} 
		rev_info generatedRevs = this.getRevs();
		if (cmd) {
			this.setRevs(((Object)0));
		} else {
				setup_revision_opt s_r_opt = new setup_revision_opt();
				this.setRevs(ModernizedCProgram.xmalloc());
				ModernizedCProgram.repo_init_revisions(ModernizedCProgram.the_repository, generatedRevs, ((Object)0));
				generatedRevs.setNo_walk(2);
				if (argc < 2) {
					ModernizedCProgram.usage_with_options(usage_str, options);
				} 
				if (!.strcmp(argv[1], "-")) {
					argv[1] = "@{-1}";
				} 
				.memset(s_r_opt, 0, );
				s_r_opt.setAssume_dashdash(1);
				argc = ModernizedCProgram.setup_revisions(argc, argv, generatedRevs, s_r_opt);
		} 
		if (argc > 1) {
			ModernizedCProgram.usage_with_options(usage_str, options);
		} 
		this.setGpg_sign(ModernizedCProgram.xstrdup_or_null(generatedGpg_sign));
		this.setStrategy(ModernizedCProgram.xstrdup_or_null(generatedStrategy));
		if (cmd == (byte)'q') {
			int ret = opts.sequencer_remove_state();
			if (!ret) {
				ModernizedCProgram.the_repository.remove_branch_state(0);
			} 
			return ret;
		} 
		if (cmd == (byte)'c') {
			return ModernizedCProgram.sequencer_continue(ModernizedCProgram.the_repository, opts);
		} 
		if (cmd == (byte)'a') {
			return ModernizedCProgram.sequencer_rollback(ModernizedCProgram.the_repository, opts);
		} 
		if (cmd == (byte)'s') {
			return ModernizedCProgram.sequencer_skip(ModernizedCProgram.the_repository, opts);
		} 
		return ModernizedCProgram.sequencer_pick_revisions(ModernizedCProgram.the_repository, opts);
	}
	public replay_action getAction() {
		return action;
	}
	public void setAction(replay_action newAction) {
		action = newAction;
	}
	public int getEdit() {
		return edit;
	}
	public void setEdit(int newEdit) {
		edit = newEdit;
	}
	public int getRecord_origin() {
		return record_origin;
	}
	public void setRecord_origin(int newRecord_origin) {
		record_origin = newRecord_origin;
	}
	public int getNo_commit() {
		return no_commit;
	}
	public void setNo_commit(int newNo_commit) {
		no_commit = newNo_commit;
	}
	public int getSignoff() {
		return signoff;
	}
	public void setSignoff(int newSignoff) {
		signoff = newSignoff;
	}
	public int getAllow_ff() {
		return allow_ff;
	}
	public void setAllow_ff(int newAllow_ff) {
		allow_ff = newAllow_ff;
	}
	public int getAllow_rerere_auto() {
		return allow_rerere_auto;
	}
	public void setAllow_rerere_auto(int newAllow_rerere_auto) {
		allow_rerere_auto = newAllow_rerere_auto;
	}
	public int getAllow_empty() {
		return allow_empty;
	}
	public void setAllow_empty(int newAllow_empty) {
		allow_empty = newAllow_empty;
	}
	public int getAllow_empty_message() {
		return allow_empty_message;
	}
	public void setAllow_empty_message(int newAllow_empty_message) {
		allow_empty_message = newAllow_empty_message;
	}
	public int getKeep_redundant_commits() {
		return keep_redundant_commits;
	}
	public void setKeep_redundant_commits(int newKeep_redundant_commits) {
		keep_redundant_commits = newKeep_redundant_commits;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getReschedule_failed_exec() {
		return reschedule_failed_exec;
	}
	public void setReschedule_failed_exec(int newReschedule_failed_exec) {
		reschedule_failed_exec = newReschedule_failed_exec;
	}
	public int getMainline() {
		return mainline;
	}
	public void setMainline(int newMainline) {
		mainline = newMainline;
	}
	public Byte getGpg_sign() {
		return gpg_sign;
	}
	public void setGpg_sign(Byte newGpg_sign) {
		gpg_sign = newGpg_sign;
	}
	public commit_msg_cleanup_mode getDefault_msg_cleanup() {
		return default_msg_cleanup;
	}
	public void setDefault_msg_cleanup(commit_msg_cleanup_mode newDefault_msg_cleanup) {
		default_msg_cleanup = newDefault_msg_cleanup;
	}
	public int getExplicit_cleanup() {
		return explicit_cleanup;
	}
	public void setExplicit_cleanup(int newExplicit_cleanup) {
		explicit_cleanup = newExplicit_cleanup;
	}
	public Byte getStrategy() {
		return strategy;
	}
	public void setStrategy(Byte newStrategy) {
		strategy = newStrategy;
	}
	public Byte getXopts() {
		return xopts;
	}
	public void setXopts(Byte newXopts) {
		xopts = newXopts;
	}
	public Object getXopts_nr() {
		return xopts_nr;
	}
	public void setXopts_nr(Object newXopts_nr) {
		xopts_nr = newXopts_nr;
	}
	public Object getXopts_alloc() {
		return xopts_alloc;
	}
	public void setXopts_alloc(Object newXopts_alloc) {
		xopts_alloc = newXopts_alloc;
	}
	public strbuf getCurrent_fixups() {
		return current_fixups;
	}
	public void setCurrent_fixups(strbuf newCurrent_fixups) {
		current_fixups = newCurrent_fixups;
	}
	public int getCurrent_fixup_count() {
		return current_fixup_count;
	}
	public void setCurrent_fixup_count(int newCurrent_fixup_count) {
		current_fixup_count = newCurrent_fixup_count;
	}
	public object_id getSquash_onto() {
		return squash_onto;
	}
	public void setSquash_onto(object_id newSquash_onto) {
		squash_onto = newSquash_onto;
	}
	public int getHave_squash_onto() {
		return have_squash_onto;
	}
	public void setHave_squash_onto(int newHave_squash_onto) {
		have_squash_onto = newHave_squash_onto;
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
}
