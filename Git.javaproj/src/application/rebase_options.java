package application;

public class rebase_options {
	private rebase_type type;
	private Object state_dir;
	private commit upstream;
	private Object upstream_name;
	private Object upstream_arg;
	private Byte head_name;
	private object_id orig_head;
	private commit onto;
	private Object onto_name;
	private Object revisions;
	private Object switch_to;
	private int root;
	private int root_with_onto;
	private object_id squash_onto;
	private commit restrict_revision;
	private int dont_finish_rebase;
	private  flags;
	private argv_array git_am_opts;
	private Object action;
	private int signoff;
	private int allow_rerere_autoupdate;
	private int keep_empty;
	private int autosquash;
	private Byte gpg_sign_opt;
	private int autostash;
	private Byte cmd;
	private int allow_empty_message;
	private int rebase_merges;
	private int rebase_cousins;
	private Byte strategy;
	private Byte strategy_opts;
	private strbuf git_format_patch_opt;
	private int reschedule_failed_exec;
	private int use_legacy_rebase;
	
	public rebase_options(rebase_type type, Object state_dir, commit upstream, Object upstream_name, Object upstream_arg, Byte head_name, object_id orig_head, commit onto, Object onto_name, Object revisions, Object switch_to, int root, int root_with_onto, object_id squash_onto, commit restrict_revision, int dont_finish_rebase,  flags, argv_array git_am_opts, Object action, int signoff, int allow_rerere_autoupdate, int keep_empty, int autosquash, Byte gpg_sign_opt, int autostash, Byte cmd, int allow_empty_message, int rebase_merges, int rebase_cousins, Byte strategy, Byte strategy_opts, strbuf git_format_patch_opt, int reschedule_failed_exec, int use_legacy_rebase) {
		setType(type);
		setState_dir(state_dir);
		setUpstream(upstream);
		setUpstream_name(upstream_name);
		setUpstream_arg(upstream_arg);
		setHead_name(head_name);
		setOrig_head(orig_head);
		setOnto(onto);
		setOnto_name(onto_name);
		setRevisions(revisions);
		setSwitch_to(switch_to);
		setRoot(root);
		setRoot_with_onto(root_with_onto);
		setSquash_onto(squash_onto);
		setRestrict_revision(restrict_revision);
		setDont_finish_rebase(dont_finish_rebase);
		setFlags(flags);
		setGit_am_opts(git_am_opts);
		setAction(action);
		setSignoff(signoff);
		setAllow_rerere_autoupdate(allow_rerere_autoupdate);
		setKeep_empty(keep_empty);
		setAutosquash(autosquash);
		setGpg_sign_opt(gpg_sign_opt);
		setAutostash(autostash);
		setCmd(cmd);
		setAllow_empty_message(allow_empty_message);
		setRebase_merges(rebase_merges);
		setRebase_cousins(rebase_cousins);
		setStrategy(strategy);
		setStrategy_opts(strategy_opts);
		setGit_format_patch_opt(git_format_patch_opt);
		setReschedule_failed_exec(reschedule_failed_exec);
		setUse_legacy_rebase(use_legacy_rebase);
	}
	public rebase_options() {
	}
	
	public int do_interactive_rebase(int flags) {
		int ret;
		byte head_hash = ((Object)0);
		byte revisions = ((Object)0);
		byte shortrevisions = ((Object)0);
		argv_array make_script_args = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		todo_list todo_list = new todo_list(new todo_list(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/));
		replay_opts replay_opts = new replay_opts();
		replay_opts replay = replay_opts.get_replay_opts(opts);
		string_list commands = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		Object generatedSwitch_to = this.getSwitch_to();
		if (ModernizedCProgram.prepare_branch_to_be_rebased(ModernizedCProgram.the_repository, replay, generatedSwitch_to)) {
			return -1;
		} 
		commit generatedUpstream = this.getUpstream();
		commit generatedOnto = this.getOnto();
		if (generatedUpstream.get_revision_ranges(generatedOnto, head_hash, revisions, shortrevisions)) {
			return -1;
		} 
		Byte generatedHead_name = this.getHead_name();
		if (ModernizedCProgram.init_basic_state(replay, generatedHead_name ? generatedHead_name : "detached HEAD", generatedOnto, head_hash)) {
			ModernizedCProgram.free(revisions);
			ModernizedCProgram.free(shortrevisions);
			return -1;
		} 
		object_id generatedSquash_onto = this.getSquash_onto();
		if (!generatedUpstream && generatedSquash_onto) {
			ModernizedCProgram.write_file(ModernizedCProgram.path_squash_onto(), "%s\n", ModernizedCProgram.oid_to_hex(generatedSquash_onto));
		} 
		make_script_args.argv_array_pushl("", revisions, ((Object)0));
		commit generatedRestrict_revision = this.getRestrict_revision();
		object generatedObject = generatedRestrict_revision.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (generatedRestrict_revision) {
			make_script_args.argv_array_push(ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		strbuf generatedBuf = todo_list.getBuf();
		int generatedArgc = make_script_args.getArgc();
		Object[][] generatedArgv = make_script_args.getArgv();
		ret = ModernizedCProgram.sequencer_make_script(ModernizedCProgram.the_repository, generatedBuf, generatedArgc, generatedArgv, flags);
		Byte generatedCmd = this.getCmd();
		Object generatedOnto_name = this.getOnto_name();
		int generatedAutosquash = this.getAutosquash();
		if (ret) {
			();
		} else {
				ModernizedCProgram.the_index.discard_index();
				if (ModernizedCProgram.todo_list_parse_insn_buffer(ModernizedCProgram.the_repository, generatedBuf, todo_list)) {
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rebase.c", 348, "unusable todo list");
				} 
				commands.split_exec_commands(generatedCmd);
				ret = ModernizedCProgram.complete_action(ModernizedCProgram.the_repository, replay, flags, shortrevisions, generatedOnto_name, generatedOnto, head_hash, commands, generatedAutosquash, todo_list);
		} 
		commands.string_list_clear(0);
		ModernizedCProgram.free(revisions);
		ModernizedCProgram.free(shortrevisions);
		todo_list.todo_list_release();
		make_script_args.argv_array_clear();
		return ret;
	}
	public int run_rebase_interactive(action command) {
		int flags = 0;
		int abbreviate_commands = 0;
		int ret = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_bool("rebase.abbreviatecommands", abbreviate_commands);
		int generatedKeep_empty = this.getKeep_empty();
		flags |=  generatedKeep_empty ? (-1024 << 0) : 0;
		flags |=  abbreviate_commands ? (-1024 << 2) : 0;
		int generatedRebase_merges = this.getRebase_merges();
		flags |=  generatedRebase_merges ? (-1024 << 3) : 0;
		int generatedRebase_cousins = this.getRebase_cousins();
		flags |=  generatedRebase_cousins > 0 ? (-1024 << 4) : 0;
		int generatedRoot_with_onto = this.getRoot_with_onto();
		flags |=  generatedRoot_with_onto ? (-1024 << 6) : 0;
		flags |=  action.command == action.ACTION_SHORTEN_OIDS ? (-1024 << 1) : 0;
		commit generatedOnto = this.getOnto();
		commit generatedUpstream = this.getUpstream();
		replay_opts replay_opts = new replay_opts();
		argv_array generatedArgs = cmd.getArgs();
		Byte generatedCmd = this.getCmd();
		switch (action.command) {
		case action.ACTION_EXPAND_OIDS:
				ret = ModernizedCProgram.transform_todo_file(flags);
				break;
		case action.ACTION_CHECK_TODO_LIST:
				ret = ModernizedCProgram.the_repository.check_todo_list_from_file();
				break;
		case action.ACTION_SHORTEN_OIDS:
		case action.ACTION_EDIT_TODO:
				ret = ModernizedCProgram.edit_todo_file(flags);
				break;
		case action.ACTION_SHOW_CURRENT_PATCH:
				{ 
					child_process cmd = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
					cmd.setGit_cmd(1);
					generatedArgs.argv_array_pushl("show", "REBASE_HEAD", "--", ((Object)0));
					ret = cmd.run_command();
					break;
				}
		case action.ACTION_SKIP:
				{ 
					string_list merge_rr = new string_list(((Object)0), 0, 0, 1, ((Object)0));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rerere_clear(ModernizedCProgram.the_repository, merge_rr);
				}
		case action.ACTION_REARRANGE_SQUASH:
				ret = ModernizedCProgram.rearrange_squash_in_todo_file();
				break;
		case /* fallthrough */action.ACTION_CONTINUE:
				{ 
					replay_opts replay_opts = replay_opts.get_replay_opts(opts);
					ret = ModernizedCProgram.sequencer_continue(ModernizedCProgram.the_repository, replay_opts);
					break;
				}
		case action.ACTION_ADD_EXEC:
				{ 
					string_list commands = new string_list(((Object)0), 0, 0, 1, ((Object)0));
					ModernizedCProgram.commands.split_exec_commands(generatedCmd);
					ret = ModernizedCProgram.commands.add_exec_commands();
					ModernizedCProgram.commands.string_list_clear(0);
					break;
				}
		case action.ACTION_NONE:
				{ 
					if (!generatedOnto && !generatedUpstream) {
						ModernizedCProgram.die(ModernizedCProgram._("a base commit must be provided with --upstream or --onto"));
					} 
					ret = opts.do_interactive_rebase(flags);
					break;
				}
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rebase.c", 431, "invalid command '%d'", action.command);
		}
		return ret;
	}
	public int is_interactive() {
		rebase_type generatedType = this.getType();
		return generatedType == rebase_type.REBASE_INTERACTIVE || generatedType == rebase_type.REBASE_PRESERVE_MERGES;
	}
	public void imply_interactive(Object option) {
		rebase_type generatedType = this.getType();
		switch (generatedType) {
		case rebase_type.REBASE_PRESERVE_MERGES:
				break;
		case rebase_type.REBASE_INTERACTIVE:
		case rebase_type.REBASE_AM:
				ModernizedCProgram.die(ModernizedCProgram._("%s requires an interactive rebase"), option);
				break;
		case rebase_type.REBASE_MERGE/* we now implement --merge via --interactive */:
		default:
				this.setType(/* implied */rebase_type.REBASE_INTERACTIVE);
				break;
		}
	}
	/* Returns the filename prefixed by the state_dir */
	public Object state_dir_path(Object filename) {
		strbuf path = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		size_t prefix_len = new size_t();
		Object generatedState_dir = this.getState_dir();
		Object generatedLen = path.getLen();
		if (!prefix_len) {
			path.strbuf_addf("%s/", generatedState_dir);
			prefix_len = generatedLen;
		} 
		path.strbuf_setlen(prefix_len);
		path.strbuf_addstr(filename);
		byte[] generatedBuf = path.getBuf();
		return generatedBuf;
	}
	/* Initialize the rebase options from the state directory. */
	public int read_basic_state() {
		strbuf head_name = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		object_id oid = new object_id();
		if (head_name.read_one(opts.state_dir_path("head-name")) || buf.read_one(opts.state_dir_path("onto"))) {
			return -1;
		} 
		byte[] generatedBuf = head_name.getBuf();
		this.setHead_name(ModernizedCProgram.starts_with(generatedBuf, "refs/") ? ModernizedCProgram.xstrdup(generatedBuf) : ((Object)0));
		head_name.strbuf_release();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, oid)) {
			return ();
		} 
		this.setOnto(/*Error: Function owner not recognized*/lookup_commit_or_die(oid, generatedBuf));
		buf.strbuf_setlen(0);
		if (ModernizedCProgram.file_exists(opts.state_dir_path("orig-head"))) {
			if (buf.read_one(opts.state_dir_path("orig-head"))) {
				return -1;
			} 
		}  else if (buf.read_one(opts.state_dir_path("head"))) {
			return -1;
		} 
		object_id generatedOrig_head = this.getOrig_head();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, generatedBuf, generatedOrig_head)) {
			return ();
		} 
		 generatedFlags = this.getFlags();
		if (ModernizedCProgram.file_exists(opts.state_dir_path("quiet"))) {
			generatedFlags &=  ~.REBASE_NO_QUIET;
		} else {
				generatedFlags |=  .REBASE_NO_QUIET;
		} 
		if (ModernizedCProgram.file_exists(opts.state_dir_path("verbose"))) {
			generatedFlags |=  .REBASE_VERBOSE;
		} 
		if (ModernizedCProgram.file_exists(opts.state_dir_path("signoff"))) {
			this.setSignoff(1);
			generatedFlags |=  .REBASE_FORCE;
		} 
		if (ModernizedCProgram.file_exists(opts.state_dir_path("allow_rerere_autoupdate"))) {
			buf.strbuf_setlen(0);
			if (buf.read_one(opts.state_dir_path("allow_rerere_autoupdate"))) {
				return -1;
			} 
			if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "--rerere-autoupdate")) {
				this.setAllow_rerere_autoupdate(1);
			}  else if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "--no-rerere-autoupdate")) {
				this.setAllow_rerere_autoupdate(2);
			} else {
					ModernizedCProgram.warning(ModernizedCProgram._("ignoring invalid allow_rerere_autoupdate: '%s'"), generatedBuf);
			} 
		} 
		Byte generatedGpg_sign_opt = this.getGpg_sign_opt();
		if (ModernizedCProgram.file_exists(opts.state_dir_path("gpg_sign_opt"))) {
			buf.strbuf_setlen(0);
			if (buf.read_one(opts.state_dir_path("gpg_sign_opt"))) {
				return -1;
			} 
			ModernizedCProgram.free(generatedGpg_sign_opt);
			this.setGpg_sign_opt(ModernizedCProgram.xstrdup(generatedBuf));
		} 
		Byte generatedStrategy = this.getStrategy();
		if (ModernizedCProgram.file_exists(opts.state_dir_path("strategy"))) {
			buf.strbuf_setlen(0);
			if (buf.read_one(opts.state_dir_path("strategy"))) {
				return -1;
			} 
			ModernizedCProgram.free(generatedStrategy);
			this.setStrategy(ModernizedCProgram.xstrdup(generatedBuf));
		} 
		Byte generatedStrategy_opts = this.getStrategy_opts();
		if (ModernizedCProgram.file_exists(opts.state_dir_path("strategy_opts"))) {
			buf.strbuf_setlen(0);
			if (buf.read_one(opts.state_dir_path("strategy_opts"))) {
				return -1;
			} 
			ModernizedCProgram.free(generatedStrategy_opts);
			this.setStrategy_opts(ModernizedCProgram.xstrdup(generatedBuf));
		} 
		buf.strbuf_release();
		return 0;
	}
	public int rebase_write_basic_state() {
		Byte generatedHead_name = this.getHead_name();
		ModernizedCProgram.write_file(opts.state_dir_path("head-name"), "%s", generatedHead_name ? generatedHead_name : "detached HEAD");
		commit generatedOnto = this.getOnto();
		object generatedObject = generatedOnto.getObject();
		object_id generatedOid = generatedObject.getOid();
		ModernizedCProgram.write_file(opts.state_dir_path("onto"), "%s", generatedOnto ? ModernizedCProgram.oid_to_hex(generatedOid) : "");
		object_id generatedOrig_head = this.getOrig_head();
		ModernizedCProgram.write_file(opts.state_dir_path("orig-head"), "%s", ModernizedCProgram.oid_to_hex(generatedOrig_head));
		 generatedFlags = this.getFlags();
		ModernizedCProgram.write_file(opts.state_dir_path("quiet"), "%s", generatedFlags & .REBASE_NO_QUIET ? "" : "t");
		if (generatedFlags & .REBASE_VERBOSE) {
			ModernizedCProgram.write_file(opts.state_dir_path("verbose"), "%s", "");
		} 
		Byte generatedStrategy = this.getStrategy();
		if (generatedStrategy) {
			ModernizedCProgram.write_file(opts.state_dir_path("strategy"), "%s", generatedStrategy);
		} 
		Byte generatedStrategy_opts = this.getStrategy_opts();
		if (generatedStrategy_opts) {
			ModernizedCProgram.write_file(opts.state_dir_path("strategy_opts"), "%s", generatedStrategy_opts);
		} 
		int generatedAllow_rerere_autoupdate = this.getAllow_rerere_autoupdate();
		if (generatedAllow_rerere_autoupdate > 0) {
			ModernizedCProgram.write_file(opts.state_dir_path("allow_rerere_autoupdate"), "-%s-rerere-autoupdate", generatedAllow_rerere_autoupdate == 1 ? "" : "-no");
		} 
		Byte generatedGpg_sign_opt = this.getGpg_sign_opt();
		if (generatedGpg_sign_opt) {
			ModernizedCProgram.write_file(opts.state_dir_path("gpg_sign_opt"), "%s", generatedGpg_sign_opt);
		} 
		int generatedSignoff = this.getSignoff();
		if (generatedSignoff) {
			ModernizedCProgram.write_file(opts.state_dir_path("strategy"), "--signoff");
		} 
		return 0;
	}
	public int finish_rebase() {
		strbuf dir = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte[] argv_gc_auto = new byte[]{"gc", "--auto", ((Object)0)};
		int ret = 0;
		ModernizedCProgram.delete_ref(((Object)0), "REBASE_HEAD", ((Object)0), (1 << 0));
		opts.apply_autostash();
		ModernizedCProgram.the_repository.getObjects().close_object_store();
		ModernizedCProgram.run_command_v_opt(argv_gc_auto, 2);
		rebase_type generatedType = this.getType();
		Object generatedState_dir = this.getState_dir();
		if (generatedType == rebase_type.REBASE_INTERACTIVE) {
			replay_opts replay = new replay_opts(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			replay.setAction(replay_action.REPLAY_INTERACTIVE_REBASE);
			ret = replay.sequencer_remove_state();
		} else {
				dir.strbuf_addstr(generatedState_dir);
				if (dir.remove_dir_recursively(0)) {
					ret = ();
				} 
				dir.strbuf_release();
		} 
		return ret;
	}
	public int move_to_original_branch() {
		strbuf orig_head_reflog = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf head_reflog = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret;
		Byte generatedHead_name = this.getHead_name();
		if (!generatedHead_name) {
			return /* nothing to move back to */0;
		} 
		commit generatedOnto = this.getOnto();
		if (!generatedOnto) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rebase.c", 936, "move_to_original_branch without onto");
		} 
		object generatedObject = generatedOnto.getObject();
		object_id generatedOid = generatedObject.getOid();
		orig_head_reflog.strbuf_addf("rebase finished: %s onto %s", generatedHead_name, ModernizedCProgram.oid_to_hex(generatedOid));
		head_reflog.strbuf_addf("rebase finished: returning to %s", generatedHead_name);
		byte[] generatedBuf = orig_head_reflog.getBuf();
		ret = ModernizedCProgram.reset_head(((Object)0), "", generatedHead_name, (1 << 3), generatedBuf, generatedBuf);
		orig_head_reflog.strbuf_release();
		head_reflog.strbuf_release();
		return ret;
	}
	public int run_am() {
		child_process am = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		child_process format_patch = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf revisions = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int status;
		byte rebased_patches;
		am.setGit_cmd(1);
		argv_array generatedArgs = am.getArgs();
		generatedArgs.argv_array_push("am");
		Object generatedAction = this.getAction();
		Byte generatedGpg_sign_opt = this.getGpg_sign_opt();
		if (generatedAction && !/*Error: Function owner not recognized*/strcmp("continue", generatedAction)) {
			generatedArgs.argv_array_push("--resolved");
			generatedArgs.argv_array_pushf("--resolvemsg=%s", ModernizedCProgram.resolvemsg);
			if (generatedGpg_sign_opt) {
				generatedArgs.argv_array_push(generatedGpg_sign_opt);
			} 
			status = am.run_command();
			if (status) {
				return status;
			} 
			return opts.move_to_original_branch();
		} 
		if (generatedAction && !/*Error: Function owner not recognized*/strcmp("skip", generatedAction)) {
			generatedArgs.argv_array_push("--skip");
			generatedArgs.argv_array_pushf("--resolvemsg=%s", ModernizedCProgram.resolvemsg);
			status = am.run_command();
			if (status) {
				return status;
			} 
			return opts.move_to_original_branch();
		} 
		if (generatedAction && !/*Error: Function owner not recognized*/strcmp("show-current-patch", generatedAction)) {
			generatedArgs.argv_array_push("--show-current-patch");
			return am.run_command();
		} 
		int generatedRoot = this.getRoot();
		commit generatedOnto = this.getOnto();
		object generatedObject = generatedOnto.getObject();
		object_id generatedOid = generatedObject.getOid();
		object_id generatedOrig_head = this.getOrig_head();
		revisions.strbuf_addf("%s...%s", ModernizedCProgram.oid_to_hex(generatedRoot ? generatedOid : generatedOid), ModernizedCProgram.oid_to_hex(generatedOrig_head));
		rebased_patches = ModernizedCProgram.xstrdup(ModernizedCProgram.git_path("rebased-patches"));
		format_patch.setOut(/*Error: Function owner not recognized*/open(rebased_patches, 1 | -1024 | -1024, 666));
		int generatedOut = format_patch.getOut();
		if (generatedOut < 0) {
			status = ();
			ModernizedCProgram.free(rebased_patches);
			generatedArgs.argv_array_clear();
			return status;
		} 
		format_patch.setGit_cmd(1);
		generatedArgs.argv_array_pushl("format-patch", "-k", "--stdout", "--full-index", "--cherry-pick", "--right-only", "--src-prefix=a/", "--dst-prefix=b/", "--no-renames", "--no-cover-letter", "--pretty=mboxrd", "--topo-order", ((Object)0));
		strbuf generatedGit_format_patch_opt = this.getGit_format_patch_opt();
		Object generatedLen = generatedGit_format_patch_opt.getLen();
		byte[] generatedBuf = generatedGit_format_patch_opt.getBuf();
		if (generatedLen) {
			generatedArgs.argv_array_split(generatedBuf);
		} 
		generatedArgs.argv_array_push(generatedBuf);
		commit generatedRestrict_revision = this.getRestrict_revision();
		if (generatedRestrict_revision) {
			generatedArgs.argv_array_pushf("^%s", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		status = format_patch.run_command();
		Byte generatedHead_name = this.getHead_name();
		if (status) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(rebased_patches);
			ModernizedCProgram.free(rebased_patches);
			generatedArgs.argv_array_clear();
			ModernizedCProgram.reset_head(generatedOrig_head, "checkout", generatedHead_name, 0, "HEAD", ((Object)0));
			();
			revisions.strbuf_release();
			return status;
		} 
		revisions.strbuf_release();
		am.setIn(/*Error: Function owner not recognized*/open(rebased_patches, 0));
		int generatedIn = am.getIn();
		if (generatedIn < 0) {
			status = ();
			ModernizedCProgram.free(rebased_patches);
			generatedArgs.argv_array_clear();
			return status;
		} 
		argv_array generatedGit_am_opts = this.getGit_am_opts();
		Object[][] generatedArgv = generatedGit_am_opts.getArgv();
		generatedArgs.argv_array_pushv(generatedArgv);
		generatedArgs.argv_array_push("--rebasing");
		generatedArgs.argv_array_pushf("--resolvemsg=%s", ModernizedCProgram.resolvemsg);
		generatedArgs.argv_array_push("--patch-format=mboxrd");
		int generatedAllow_rerere_autoupdate = this.getAllow_rerere_autoupdate();
		if (generatedAllow_rerere_autoupdate == 1) {
			generatedArgs.argv_array_push("--rerere-autoupdate");
		}  else if (generatedAllow_rerere_autoupdate == 2) {
			generatedArgs.argv_array_push("--no-rerere-autoupdate");
		} 
		if (generatedGpg_sign_opt) {
			generatedArgs.argv_array_push(generatedGpg_sign_opt);
		} 
		status = am.run_command();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(rebased_patches);
		ModernizedCProgram.free(rebased_patches);
		if (!status) {
			return opts.move_to_original_branch();
		} 
		Object generatedState_dir = this.getState_dir();
		if (ModernizedCProgram.is_directory(generatedState_dir)) {
			opts.rebase_write_basic_state();
		} 
		return status;
	}
	public int run_specific_rebase(action action) {
		byte[] argv = new byte[]{((Object)0), ((Object)0)};
		strbuf script_snippet = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int status;
		byte backend;
		byte backend_func;
		rebase_type generatedType = this.getType();
		 generatedFlags = this.getFlags();
		Byte generatedGpg_sign_opt = this.getGpg_sign_opt();
		if (generatedType == rebase_type.REBASE_INTERACTIVE) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setenv("GIT_CHERRY_PICK_HELP", ModernizedCProgram.resolvemsg, /* Run builtin interactive rebase */1);
			if (!(generatedFlags & .REBASE_INTERACTIVE_EXPLICIT)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setenv("GIT_SEQUENCE_EDITOR", ":", 1);
				this.setAutosquash(0);
			} 
			if (generatedGpg_sign_opt) {
				byte tmp = ModernizedCProgram.xstrdup(generatedGpg_sign_opt + /* remove the leading "-S" */2);
				ModernizedCProgram.free(generatedGpg_sign_opt);
				this.setGpg_sign_opt(tmp);
			} 
			status = opts.run_rebase_interactive(action.action);
			;
		} 
		if (generatedType == rebase_type.REBASE_AM) {
			status = opts.run_am();
			;
		} 
		script_snippet.add_var("GIT_DIR", ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_dir()));
		Object generatedState_dir = this.getState_dir();
		script_snippet.add_var("state_dir", generatedState_dir);
		Object generatedUpstream_name = this.getUpstream_name();
		script_snippet.add_var("upstream_name", generatedUpstream_name);
		commit generatedUpstream = this.getUpstream();
		object generatedObject = generatedUpstream.getObject();
		object_id generatedOid = generatedObject.getOid();
		script_snippet.add_var("upstream", generatedUpstream ? ModernizedCProgram.oid_to_hex(generatedOid) : ((Object)0));
		Byte generatedHead_name = this.getHead_name();
		script_snippet.add_var("head_name", generatedHead_name ? generatedHead_name : "detached HEAD");
		object_id generatedOrig_head = this.getOrig_head();
		script_snippet.add_var("orig_head", ModernizedCProgram.oid_to_hex(generatedOrig_head));
		commit generatedOnto = this.getOnto();
		script_snippet.add_var("onto", generatedOnto ? ModernizedCProgram.oid_to_hex(generatedOid) : ((Object)0));
		Object generatedOnto_name = this.getOnto_name();
		script_snippet.add_var("onto_name", generatedOnto_name);
		Object generatedRevisions = this.getRevisions();
		script_snippet.add_var("revisions", generatedRevisions);
		commit generatedRestrict_revision = this.getRestrict_revision();
		script_snippet.add_var("restrict_revision", generatedRestrict_revision ? ModernizedCProgram.oid_to_hex(generatedOid) : ((Object)0));
		script_snippet.add_var("GIT_QUIET", generatedFlags & .REBASE_NO_QUIET ? "" : "t");
		argv_array generatedGit_am_opts = this.getGit_am_opts();
		Object[][] generatedArgv = generatedGit_am_opts.getArgv();
		buf.sq_quote_argv_pretty(generatedArgv);
		byte[] generatedBuf = buf.getBuf();
		script_snippet.add_var("git_am_opt", generatedBuf);
		buf.strbuf_release();
		script_snippet.add_var("verbose", generatedFlags & .REBASE_VERBOSE ? "t" : "");
		script_snippet.add_var("diffstat", generatedFlags & .REBASE_DIFFSTAT ? "t" : "");
		script_snippet.add_var("force_rebase", generatedFlags & .REBASE_FORCE ? "t" : "");
		Object generatedSwitch_to = this.getSwitch_to();
		if (generatedSwitch_to) {
			script_snippet.add_var("switch_to", generatedSwitch_to);
		} 
		Object generatedAction = this.getAction();
		script_snippet.add_var("action", generatedAction ? generatedAction : "");
		int generatedSignoff = this.getSignoff();
		script_snippet.add_var("signoff", generatedSignoff ? "--signoff" : "");
		int generatedAllow_rerere_autoupdate = this.getAllow_rerere_autoupdate();
		script_snippet.add_var("allow_rerere_autoupdate", generatedAllow_rerere_autoupdate ? generatedAllow_rerere_autoupdate == 1 ? "--rerere-autoupdate" : "--no-rerere-autoupdate" : "");
		int generatedKeep_empty = this.getKeep_empty();
		script_snippet.add_var("keep_empty", generatedKeep_empty ? "yes" : "");
		int generatedAutosquash = this.getAutosquash();
		script_snippet.add_var("autosquash", generatedAutosquash ? "t" : "");
		script_snippet.add_var("gpg_sign_opt", generatedGpg_sign_opt);
		Byte generatedCmd = this.getCmd();
		script_snippet.add_var("cmd", generatedCmd);
		int generatedAllow_empty_message = this.getAllow_empty_message();
		script_snippet.add_var("allow_empty_message", generatedAllow_empty_message ? "--allow-empty-message" : "");
		int generatedRebase_merges = this.getRebase_merges();
		script_snippet.add_var("rebase_merges", generatedRebase_merges ? "t" : "");
		int generatedRebase_cousins = this.getRebase_cousins();
		script_snippet.add_var("rebase_cousins", generatedRebase_cousins ? "t" : "");
		Byte generatedStrategy = this.getStrategy();
		script_snippet.add_var("strategy", generatedStrategy);
		Byte generatedStrategy_opts = this.getStrategy_opts();
		script_snippet.add_var("strategy_opts", generatedStrategy_opts);
		int generatedRoot = this.getRoot();
		script_snippet.add_var("rebase_root", generatedRoot ? "t" : "");
		object_id generatedSquash_onto = this.getSquash_onto();
		script_snippet.add_var("squash_onto", generatedSquash_onto ? ModernizedCProgram.oid_to_hex(generatedSquash_onto) : "");
		script_snippet.add_var("git_format_patch_opt", generatedBuf);
		if (opts.is_interactive() && !(generatedFlags & .REBASE_INTERACTIVE_EXPLICIT)) {
			script_snippet.strbuf_addstr("GIT_SEQUENCE_EDITOR=:; export GIT_SEQUENCE_EDITOR; ");
			this.setAutosquash(0);
		} 
		switch (generatedType) {
		case rebase_type.REBASE_PRESERVE_MERGES:
				backend = "git-rebase--preserve-merges";
				backend_func = "git_rebase__preserve_merges";
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\rebase.c", 1172, "Unhandled rebase type %d", generatedType);
				break;
		}
		script_snippet.strbuf_addf(". git-sh-setup && . %s && %s", backend, backend_func);
		argv[0] = generatedBuf;
		status = ModernizedCProgram.run_command_v_opt(argv, 16);
		script_snippet.strbuf_release();
		return status ? -1 : 0;
	}
	public void set_reflog_action() {
		byte env;
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!ModernizedCProgram.options.is_interactive()) {
			return /*Error: Unsupported expression*/;
		} 
		env = /*Error: Function owner not recognized*/getenv("GIT_REFLOG_ACTION");
		if (env && /*Error: Function owner not recognized*/strcmp("rebase", env)) {
			return /*Error: Unsupported expression*/;
		} 
		buf.strbuf_addf("rebase -i (%s)", ModernizedCProgram.options.getAction());
		byte[] generatedBuf = buf.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setenv("GIT_REFLOG_ACTION", generatedBuf, 1);
		buf.strbuf_release();
	}
	public rebase_type getType() {
		return type;
	}
	public void setType(rebase_type newType) {
		type = newType;
	}
	public Object getState_dir() {
		return state_dir;
	}
	public void setState_dir(Object newState_dir) {
		state_dir = newState_dir;
	}
	public commit getUpstream() {
		return upstream;
	}
	public void setUpstream(commit newUpstream) {
		upstream = newUpstream;
	}
	public Object getUpstream_name() {
		return upstream_name;
	}
	public void setUpstream_name(Object newUpstream_name) {
		upstream_name = newUpstream_name;
	}
	public Object getUpstream_arg() {
		return upstream_arg;
	}
	public void setUpstream_arg(Object newUpstream_arg) {
		upstream_arg = newUpstream_arg;
	}
	public Byte getHead_name() {
		return head_name;
	}
	public void setHead_name(Byte newHead_name) {
		head_name = newHead_name;
	}
	public object_id getOrig_head() {
		return orig_head;
	}
	public void setOrig_head(object_id newOrig_head) {
		orig_head = newOrig_head;
	}
	public commit getOnto() {
		return onto;
	}
	public void setOnto(commit newOnto) {
		onto = newOnto;
	}
	public Object getOnto_name() {
		return onto_name;
	}
	public void setOnto_name(Object newOnto_name) {
		onto_name = newOnto_name;
	}
	public Object getRevisions() {
		return revisions;
	}
	public void setRevisions(Object newRevisions) {
		revisions = newRevisions;
	}
	public Object getSwitch_to() {
		return switch_to;
	}
	public void setSwitch_to(Object newSwitch_to) {
		switch_to = newSwitch_to;
	}
	public int getRoot() {
		return root;
	}
	public void setRoot(int newRoot) {
		root = newRoot;
	}
	public int getRoot_with_onto() {
		return root_with_onto;
	}
	public void setRoot_with_onto(int newRoot_with_onto) {
		root_with_onto = newRoot_with_onto;
	}
	public object_id getSquash_onto() {
		return squash_onto;
	}
	public void setSquash_onto(object_id newSquash_onto) {
		squash_onto = newSquash_onto;
	}
	public commit getRestrict_revision() {
		return restrict_revision;
	}
	public void setRestrict_revision(commit newRestrict_revision) {
		restrict_revision = newRestrict_revision;
	}
	public int getDont_finish_rebase() {
		return dont_finish_rebase;
	}
	public void setDont_finish_rebase(int newDont_finish_rebase) {
		dont_finish_rebase = newDont_finish_rebase;
	}
	public  getFlags() {
		return flags;
	}
	public void setFlags( newFlags) {
		flags = newFlags;
	}
	public argv_array getGit_am_opts() {
		return git_am_opts;
	}
	public void setGit_am_opts(argv_array newGit_am_opts) {
		git_am_opts = newGit_am_opts;
	}
	public Object getAction() {
		return action;
	}
	public void setAction(Object newAction) {
		action = newAction;
	}
	public int getSignoff() {
		return signoff;
	}
	public void setSignoff(int newSignoff) {
		signoff = newSignoff;
	}
	public int getAllow_rerere_autoupdate() {
		return allow_rerere_autoupdate;
	}
	public void setAllow_rerere_autoupdate(int newAllow_rerere_autoupdate) {
		allow_rerere_autoupdate = newAllow_rerere_autoupdate;
	}
	public int getKeep_empty() {
		return keep_empty;
	}
	public void setKeep_empty(int newKeep_empty) {
		keep_empty = newKeep_empty;
	}
	public int getAutosquash() {
		return autosquash;
	}
	public void setAutosquash(int newAutosquash) {
		autosquash = newAutosquash;
	}
	public Byte getGpg_sign_opt() {
		return gpg_sign_opt;
	}
	public void setGpg_sign_opt(Byte newGpg_sign_opt) {
		gpg_sign_opt = newGpg_sign_opt;
	}
	public int getAutostash() {
		return autostash;
	}
	public void setAutostash(int newAutostash) {
		autostash = newAutostash;
	}
	public Byte getCmd() {
		return cmd;
	}
	public void setCmd(Byte newCmd) {
		cmd = newCmd;
	}
	public int getAllow_empty_message() {
		return allow_empty_message;
	}
	public void setAllow_empty_message(int newAllow_empty_message) {
		allow_empty_message = newAllow_empty_message;
	}
	public int getRebase_merges() {
		return rebase_merges;
	}
	public void setRebase_merges(int newRebase_merges) {
		rebase_merges = newRebase_merges;
	}
	public int getRebase_cousins() {
		return rebase_cousins;
	}
	public void setRebase_cousins(int newRebase_cousins) {
		rebase_cousins = newRebase_cousins;
	}
	public Byte getStrategy() {
		return strategy;
	}
	public void setStrategy(Byte newStrategy) {
		strategy = newStrategy;
	}
	public Byte getStrategy_opts() {
		return strategy_opts;
	}
	public void setStrategy_opts(Byte newStrategy_opts) {
		strategy_opts = newStrategy_opts;
	}
	public strbuf getGit_format_patch_opt() {
		return git_format_patch_opt;
	}
	public void setGit_format_patch_opt(strbuf newGit_format_patch_opt) {
		git_format_patch_opt = newGit_format_patch_opt;
	}
	public int getReschedule_failed_exec() {
		return reschedule_failed_exec;
	}
	public void setReschedule_failed_exec(int newReschedule_failed_exec) {
		reschedule_failed_exec = newReschedule_failed_exec;
	}
	public int getUse_legacy_rebase() {
		return use_legacy_rebase;
	}
	public void setUse_legacy_rebase(int newUse_legacy_rebase) {
		use_legacy_rebase = newUse_legacy_rebase;
	}
}
