package application;

public class am_state {
	private Byte dir;
	private int cur;
	private int last;
	private Byte author_name;
	private Byte author_email;
	private Byte author_date;
	private Byte msg;
	private Object msg_len;
	private object_id orig_commit;
	private int prec;
	private int interactive;
	private int threeway;
	private int quiet;
	private int signoff;
	private int utf8;
	private int keep;
	private int message_id;
	private int scissors;
	private argv_array git_apply_opts;
	private Object resolvemsg;
	private int committer_date_is_author_date;
	private int ignore_date;
	private int allow_rerere_autoupdate;
	private Object sign_commit;
	private int rebasing;
	
	public am_state(Byte dir, int cur, int last, Byte author_name, Byte author_email, Byte author_date, Byte msg, Object msg_len, object_id orig_commit, int prec, int interactive, int threeway, int quiet, int signoff, int utf8, int keep, int message_id, int scissors, argv_array git_apply_opts, Object resolvemsg, int committer_date_is_author_date, int ignore_date, int allow_rerere_autoupdate, Object sign_commit, int rebasing) {
		setDir(dir);
		setCur(cur);
		setLast(last);
		setAuthor_name(author_name);
		setAuthor_email(author_email);
		setAuthor_date(author_date);
		setMsg(msg);
		setMsg_len(msg_len);
		setOrig_commit(orig_commit);
		setPrec(prec);
		setInteractive(interactive);
		setThreeway(threeway);
		setQuiet(quiet);
		setSignoff(signoff);
		setUtf8(utf8);
		setKeep(keep);
		setMessage_id(message_id);
		setScissors(scissors);
		setGit_apply_opts(git_apply_opts);
		setResolvemsg(resolvemsg);
		setCommitter_date_is_author_date(committer_date_is_author_date);
		setIgnore_date(ignore_date);
		setAllow_rerere_autoupdate(allow_rerere_autoupdate);
		setSign_commit(sign_commit);
		setRebasing(rebasing);
	}
	public am_state() {
	}
	
	public void am_state_init() {
		int gpgsign;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.state, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.state.setDir(ModernizedCProgram.git_pathdup("rebase-apply"));
		ModernizedCProgram.state.setPrec(4);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_bool("am.threeway", ModernizedCProgram.state.getThreeway());
		ModernizedCProgram.state.setUtf8(1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_bool("am.messageid", ModernizedCProgram.state.getMessage_id());
		ModernizedCProgram.state.setScissors(scissors_type.SCISSORS_UNSET);
		ModernizedCProgram.state.getGit_apply_opts().argv_array_init();
		if (!/*Error: Function owner not recognized*/git_config_get_bool("commit.gpgsign", gpgsign)) {
			ModernizedCProgram.state.setSign_commit(gpgsign ? "" : ((Object)0/**
			 * Releases memory allocated by an am_state.
			 */));
		} 
	}
	public void am_state_release() {
		ModernizedCProgram.free(ModernizedCProgram.state.getDir());
		ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_name());
		ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_email());
		ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_date());
		ModernizedCProgram.free(ModernizedCProgram.state.getMsg());
		ModernizedCProgram.state.getGit_apply_opts().argv_array_clear();
	}
	public int read_am_author_script() {
		byte filename = ModernizedCProgram.am_path(ModernizedCProgram.state, "author-script");
		((!ModernizedCProgram.state.getAuthor_name()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_name", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 267));
		((!ModernizedCProgram.state.getAuthor_email()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_email", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 268));
		((!ModernizedCProgram.state.getAuthor_date()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_date", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 269));
		return ModernizedCProgram.read_author_script(filename, ModernizedCProgram.state.getAuthor_name(), ModernizedCProgram.state.getAuthor_email(), ModernizedCProgram.state.getAuthor_date(), 1/**
		 * Saves state->author_name, state->author_email and state->author_date in the
		 * state directory's "author-script" file.
		 */);
	}
	public int read_commit_msg() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		((!ModernizedCProgram.state.getMsg()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->msg", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 311));
		if (sb.read_state_file(ModernizedCProgram.state, "final-commit", 0) < 0) {
			sb.strbuf_release();
			return -1;
		} 
		ModernizedCProgram.state.setMsg(sb.strbuf_detach(ModernizedCProgram.state.getMsg_len()));
		return 0/**
		 * Saves state->msg in the state directory's "final-commit" file.
		 */;
	}
	public void am_load() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (sb.read_state_file(ModernizedCProgram.state, "next", 1) < 0) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 339, "state file 'next' does not exist");
		} 
		byte[] generatedBuf = sb.getBuf();
		ModernizedCProgram.state.setCur(/*Error: Function owner not recognized*/strtol(generatedBuf, ((Object)0), 10));
		if (sb.read_state_file(ModernizedCProgram.state, "last", 1) < 0) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 343, "state file 'last' does not exist");
		} 
		ModernizedCProgram.state.setLast(/*Error: Function owner not recognized*/strtol(generatedBuf, ((Object)0), 10));
		if (ModernizedCProgram.state.read_am_author_script() < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse author script"));
		} 
		ModernizedCProgram.state.read_commit_msg();
		if (sb.read_state_file(ModernizedCProgram.state, "original-commit", 1) < 0) {
			ModernizedCProgram.state.getOrig_commit().oidclr();
		}  else if (ModernizedCProgram.state.getOrig_commit().get_oid_hex(generatedBuf) < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse %s"), ModernizedCProgram.am_path(ModernizedCProgram.state, "original-commit"));
		} 
		sb.read_state_file(ModernizedCProgram.state, "threeway", 1);
		ModernizedCProgram.state.setThreeway(!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t"));
		sb.read_state_file(ModernizedCProgram.state, "quiet", 1);
		ModernizedCProgram.state.setQuiet(!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t"));
		sb.read_state_file(ModernizedCProgram.state, "sign", 1);
		ModernizedCProgram.state.setSignoff(!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t"));
		sb.read_state_file(ModernizedCProgram.state, "utf8", 1);
		ModernizedCProgram.state.setUtf8(!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t"));
		if (ModernizedCProgram.file_exists(ModernizedCProgram.am_path(ModernizedCProgram.state, "rerere-autoupdate"))) {
			sb.read_state_file(ModernizedCProgram.state, "rerere-autoupdate", 1);
			ModernizedCProgram.state.setAllow_rerere_autoupdate(/*Error: Function owner not recognized*/strcmp(generatedBuf, "t") ? 2 : 1);
		} else {
				ModernizedCProgram.state.setAllow_rerere_autoupdate(0);
		} 
		sb.read_state_file(ModernizedCProgram.state, "keep", 1);
		if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t")) {
			ModernizedCProgram.state.setKeep(keep_type.KEEP_TRUE);
		}  else if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "b")) {
			ModernizedCProgram.state.setKeep(keep_type.KEEP_NON_PATCH);
		} else {
				ModernizedCProgram.state.setKeep(keep_type.KEEP_FALSE);
		} 
		sb.read_state_file(ModernizedCProgram.state, "messageid", 1);
		ModernizedCProgram.state.setMessage_id(!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t"));
		sb.read_state_file(ModernizedCProgram.state, "scissors", 1);
		if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "t")) {
			ModernizedCProgram.state.setScissors(scissors_type.SCISSORS_TRUE);
		}  else if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, "f")) {
			ModernizedCProgram.state.setScissors(scissors_type.SCISSORS_FALSE);
		} else {
				ModernizedCProgram.state.setScissors(scissors_type.SCISSORS_UNSET);
		} 
		sb.read_state_file(ModernizedCProgram.state, "apply-opt", 1);
		ModernizedCProgram.state.getGit_apply_opts().argv_array_clear();
		if (ModernizedCProgram.state.getGit_apply_opts().sq_dequote_to_argv_array(generatedBuf) < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse %s"), ModernizedCProgram.am_path(ModernizedCProgram.state, "apply-opt"));
		} 
		ModernizedCProgram.state.setRebasing(!!ModernizedCProgram.file_exists(ModernizedCProgram.am_path(ModernizedCProgram.state, "rebasing")));
		sb/**
		 * Removes the am_state directory, forcefully terminating the current am
		 * session.
		 */.strbuf_release();
	}
	public int run_applypatch_msg_hook() {
		int ret;
		((ModernizedCProgram.state.getMsg()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("state->msg", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 425));
		ret = ModernizedCProgram.run_hook_le(((Object)0), "applypatch-msg", ModernizedCProgram.am_path(ModernizedCProgram.state, "final-commit"), ((Object)0));
		if (!ret) {
			do {
				ModernizedCProgram.free(ModernizedCProgram.state.getMsg());
				(ModernizedCProgram.state.getMsg()) = ((Object)0);
			} while (0);
			if (ModernizedCProgram.state.read_commit_msg() < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("'%s' was deleted by the applypatch-msg hook"), ModernizedCProgram.am_path(ModernizedCProgram.state, "final-commit"));
			} 
		} 
		return ret/**
		 * Runs post-rewrite hook. Returns it exit code.
		 */;
	}
	public int split_mail_mbox(Object paths, int keep_cr, int mboxrd) {
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf last = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret;
		cp.setGit_cmd(1);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_push("mailsplit");
		generatedArgs.argv_array_pushf("-d%d", ModernizedCProgram.state.getPrec());
		generatedArgs.argv_array_pushf("-o%s", ModernizedCProgram.state.getDir());
		generatedArgs.argv_array_push("-b");
		if (keep_cr) {
			generatedArgs.argv_array_push("--keep-cr");
		} 
		if (mboxrd) {
			generatedArgs.argv_array_push("--mboxrd");
		} 
		generatedArgs.argv_array_push("--");
		generatedArgs.argv_array_pushv(paths);
		ret = cp.capture_command(last, 8);
		if (ret) {
			;
		} 
		ModernizedCProgram.state.setCur(1);
		byte[] generatedBuf = last.getBuf();
		ModernizedCProgram.state.setLast(/*Error: Function owner not recognized*/strtol(generatedBuf, ((Object)0), 10));
		return ret ? -1 : 0/**
		 * Callback signature for split_mail_conv(). The foreign patch should be
		 * read from `in`, and the converted patch (in RFC2822 mail format) should be
		 * written to `out`. Return 0 on success, or -1 on failure.
		 */;
	}
	/**
	 * Calls `fn` for each file in `paths` to convert the foreign patch to the
	 * RFC2822 mail format suitable for parsing with git-mailinfo.
	 *
	 * Returns 0 on success, -1 on failure.
	 */
	public int split_mail_conv(Object fn, Object paths, int keep_cr) {
		byte[] stdin_only = new byte[]{"-", ((Object)0)};
		int i;
		if (!paths) {
			paths = stdin_only;
		} 
		for (i = 0; paths; ) {
			FILE in = new FILE();
			FILE out = new FILE();
			byte mail;
			int ret;
			if (!/*Error: Function owner not recognized*/strcmp(paths, "-")) {
				in = (_iob[0]);
			} else {
					in = /*Error: Function owner not recognized*/fopen(paths, "r");
			} 
			if (!in) {
				return ();
			} 
			mail = ModernizedCProgram.mkpath("%s/%0*d", ModernizedCProgram.state.getDir(), ModernizedCProgram.state.getPrec(), i + 1);
			out = /*Error: Function owner not recognized*/fopen(mail, "w");
			if (!out) {
				if (in != (_iob[0])) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(in);
				} 
				return ();
			} 
			ret = /*Error: Function owner not recognized*/fn(out, in, keep_cr);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(out);
			if (in != (_iob[0])) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(in);
			} 
			if (ret) {
				return ();
			} 
		}
		ModernizedCProgram.state.setCur(1);
		ModernizedCProgram.state.setLast(i);
		return 0/**
		 * A split_mail_conv() callback that converts an StGit patch to an RFC2822
		 * message suitable for parsing with git-mailinfo.
		 */;
	}
	public int split_mail_stgit_series(Object[][] paths, int keep_cr) {
		byte series_dir;
		byte series_dir_buf;
		FILE fp = new FILE();
		argv_array patches = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret;
		if (!paths[0] || paths[1]) {
			return ();
		} 
		series_dir_buf = ModernizedCProgram.xstrdup(paths);
		series_dir = /*Error: Function owner not recognized*/dirname(series_dir_buf);
		fp = /*Error: Function owner not recognized*/fopen(paths, "r");
		if (!fp) {
			return ();
		} 
		byte[] generatedBuf = sb.getBuf();
		while (!ModernizedCProgram.strbuf_getline_lf(sb, fp)) {
			if (generatedBuf == (byte)'#') {
				continue;
			} 
			patches.argv_array_push(ModernizedCProgram.mkpath("%s/%s", series_dir, generatedBuf));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
		sb.strbuf_release();
		ModernizedCProgram.free(series_dir_buf);
		Object[][] generatedArgv = patches.getArgv();
		ret = ModernizedCProgram.state.split_mail_conv(stgit_patch_to_mail, generatedArgv, keep_cr);
		patches.argv_array_clear();
		return ret/**
		 * A split_patches_conv() callback that converts a mercurial patch to a RFC2822
		 * message suitable for parsing with git-mailinfo.
		 */;
	}
	public int split_mail(patch_format patch_format, Object paths, int keep_cr) {
		if (keep_cr < 0) {
			keep_cr = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_bool("am.keepcr", keep_cr);
		} 
		switch (patch_format.patch_format) {
		case patch_format.PATCH_FORMAT_STGIT_SERIES:
				return ModernizedCProgram.state.split_mail_stgit_series(paths, keep_cr);
		case patch_format.PATCH_FORMAT_STGIT:
				return ModernizedCProgram.state.split_mail_conv(stgit_patch_to_mail, paths, keep_cr);
		case patch_format.PATCH_FORMAT_MBOXRD:
				return ModernizedCProgram.state.split_mail_mbox(paths, keep_cr, 1);
		case patch_format.PATCH_FORMAT_MBOX:
				return ModernizedCProgram.state.split_mail_mbox(paths, keep_cr, 0);
		case patch_format.PATCH_FORMAT_HG:
				return ModernizedCProgram.state.split_mail_conv(hg_patch_to_mail, paths, keep_cr);
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 924, "invalid patch_format");
		}
		return -1/**
		 * Setup a new am session for applying patches
		 */;
	}
	public void am_setup(patch_format patch_format, Object paths, int keep_cr) {
		object_id curr_head = new object_id();
		byte str;
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!patch_format.patch_format) {
			patch_format.patch_format = ModernizedCProgram.detect_patch_format(paths);
		} 
		if (!patch_format.patch_format) {
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Patch format detection failed."));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 944, (true)));
		} 
		if (/*Error: Function owner not recognized*/mkdir(ModernizedCProgram.state.getDir(), 777) < 0 && (/*Error: Function owner not recognized*/_errno()) != 17) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to create directory '%s'"), ModernizedCProgram.state.getDir());
		} 
		ModernizedCProgram.delete_ref(((Object)0), "REBASE_HEAD", ((Object)0), (1 << 0));
		if (ModernizedCProgram.state.split_mail(patch_format.patch_format, paths, keep_cr) < 0) {
			ModernizedCProgram.am_destroy(ModernizedCProgram.state);
			ModernizedCProgram.die(ModernizedCProgram._("Failed to split patches."));
		} 
		if (ModernizedCProgram.state.getRebasing()) {
			ModernizedCProgram.state.setThreeway(1);
		} 
		ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "threeway", ModernizedCProgram.state.getThreeway());
		ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "quiet", ModernizedCProgram.state.getQuiet());
		ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "sign", ModernizedCProgram.state.getSignoff());
		ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "utf8", ModernizedCProgram.state.getUtf8());
		if (ModernizedCProgram.state.getAllow_rerere_autoupdate()) {
			ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "rerere-autoupdate", ModernizedCProgram.state.getAllow_rerere_autoupdate() == 1);
		} 
		switch (ModernizedCProgram.state.getKeep()) {
		case keep_type.KEEP_TRUE:
				str = "t";
				break;
		case keep_type.KEEP_FALSE:
				str = "f";
				break;
		case keep_type.KEEP_NON_PATCH:
				str = "b";
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 979, "invalid value for state->keep");
		}
		ModernizedCProgram.write_state_text(ModernizedCProgram.state, "keep", str);
		ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "messageid", ModernizedCProgram.state.getMessage_id());
		switch (ModernizedCProgram.state.getScissors()) {
		case scissors_type.SCISSORS_UNSET:
				str = "";
				break;
		case scissors_type.SCISSORS_FALSE:
				str = "f";
				break;
		case scissors_type.SCISSORS_TRUE:
				str = "t";
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 996, "invalid value for state->scissors");
		}
		ModernizedCProgram.write_state_text(ModernizedCProgram.state, "scissors", str);
		sb.sq_quote_argv(ModernizedCProgram.state.getGit_apply_opts().getArgv());
		byte[] generatedBuf = sb.getBuf();
		ModernizedCProgram.write_state_text(ModernizedCProgram.state, "apply-opt", generatedBuf);
		if (ModernizedCProgram.state.getRebasing()) {
			ModernizedCProgram.write_state_text(ModernizedCProgram.state, "rebasing", "");
		} else {
				ModernizedCProgram.write_state_text(ModernizedCProgram.state, "applying", "");
		} 
		if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", curr_head)) {
			ModernizedCProgram.write_state_text(ModernizedCProgram.state, "abort-safety", ModernizedCProgram.oid_to_hex(curr_head));
			if (!ModernizedCProgram.state.getRebasing()) {
				ModernizedCProgram.update_ref("am", "ORIG_HEAD", curr_head, ((Object)0), 0, action_on_err.UPDATE_REFS_DIE_ON_ERR);
			} 
		} else {
				ModernizedCProgram.write_state_text(ModernizedCProgram.state, "abort-safety", "");
				if (!ModernizedCProgram.state.getRebasing()) {
					ModernizedCProgram.delete_ref(((Object)0), "ORIG_HEAD", ((Object)0), 0/*
						 * NOTE: Since the "next" and "last" files determine if an am_state
						 * session is in progress, they should be written last.
						 */);
				} 
		} 
		ModernizedCProgram.write_state_count(ModernizedCProgram.state, "next", ModernizedCProgram.state.getCur());
		ModernizedCProgram.write_state_count(ModernizedCProgram.state, "last", ModernizedCProgram.state.getLast());
		sb/**
		 * Increments the patch pointer, and cleans am_state for the application of the
		 * next patch.
		 */.strbuf_release();
	}
	public void am_next() {
		object_id head = new object_id();
		do {
			ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_name());
			(ModernizedCProgram.state.getAuthor_name()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_email());
			(ModernizedCProgram.state.getAuthor_email()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.state.getAuthor_date());
			(ModernizedCProgram.state.getAuthor_date()) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(ModernizedCProgram.state.getMsg());
			(ModernizedCProgram.state.getMsg()) = ((Object)0);
		} while (0);
		ModernizedCProgram.state.setMsg_len(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.am_path(ModernizedCProgram.state, "author-script"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.am_path(ModernizedCProgram.state, "final-commit"));
		ModernizedCProgram.state.getOrig_commit().oidclr();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.am_path(ModernizedCProgram.state, "original-commit"));
		ModernizedCProgram.delete_ref(((Object)0), "REBASE_HEAD", ((Object)0), (1 << 0));
		if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head)) {
			ModernizedCProgram.write_state_text(ModernizedCProgram.state, "abort-safety", ModernizedCProgram.oid_to_hex(head));
		} else {
				ModernizedCProgram.write_state_text(ModernizedCProgram.state, "abort-safety", "");
		} 
		ModernizedCProgram.state.getCur()++;
		ModernizedCProgram.write_state_count(ModernizedCProgram.state, "next", ModernizedCProgram.state.getCur());
	}
	public void am_append_signoff() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		sb.strbuf_attach(ModernizedCProgram.state.getMsg(), ModernizedCProgram.state.getMsg_len(), ModernizedCProgram.state.getMsg_len());
		sb.append_signoff(0, 0);
		ModernizedCProgram.state.setMsg(sb.strbuf_detach(ModernizedCProgram.state.getMsg_len()));
	}
	public int parse_mail(Object mail) {
		FILE fp = new FILE();
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf msg = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf author_name = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf author_date = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf author_email = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret = 0;
		mailinfo mi = new mailinfo();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setup_mailinfo(mi);
		if (ModernizedCProgram.state.getUtf8()) {
			mi.setMetainfo_charset(ModernizedCProgram.get_commit_output_encoding());
		} else {
				mi.setMetainfo_charset(((Object)0));
		} 
		switch (ModernizedCProgram.state.getKeep()) {
		case keep_type.KEEP_NON_PATCH:
				mi.setKeep_non_patch_brackets_in_subject(1);
				break;
		case keep_type.KEEP_TRUE:
				mi.setKeep_subject(1);
				break;
		case keep_type.KEEP_FALSE:
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1141, "invalid value for state->keep");
		}
		if (ModernizedCProgram.state.getMessage_id()) {
			mi.setAdd_message_id(1);
		} 
		switch (ModernizedCProgram.state.getScissors()) {
		case scissors_type.SCISSORS_FALSE:
				mi.setUse_scissors(0);
				break;
		case scissors_type.SCISSORS_UNSET:
				break;
		case scissors_type.SCISSORS_TRUE:
				mi.setUse_scissors(1);
				break;
		default:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1157, "invalid value for state->scissors");
		}
		mi.setInput(ModernizedCProgram.xfopen(mail, "r"));
		mi.setOutput(ModernizedCProgram.xfopen(ModernizedCProgram.am_path(ModernizedCProgram.state, "info"), "w"));
		if (/*Error: Function owner not recognized*/mailinfo(mi, ModernizedCProgram.am_path(ModernizedCProgram.state, "msg"), ModernizedCProgram.am_path(ModernizedCProgram.state, "patch"))) {
			ModernizedCProgram.die("could not parse patch");
		} 
		Object generatedInput = mi.getInput();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(generatedInput);
		Object generatedOutput = mi.getOutput();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(generatedOutput);
		int generatedFormat_flowed = mi.getFormat_flowed();
		if (generatedFormat_flowed) {
			ModernizedCProgram.warning(ModernizedCProgram._("Patch sent with format=flowed; space at the end of lines might be lost."));
		} 
		fp = ModernizedCProgram.xfopen(ModernizedCProgram.am_path(ModernizedCProgram.state, "info"), /* Extract message and author information */"r");
		byte[] generatedBuf = sb.getBuf();
		Object generatedLen = msg.getLen();
		while (!ModernizedCProgram.strbuf_getline_lf(sb, fp)) {
			byte x;
			if (ModernizedCProgram.skip_prefix(generatedBuf, "Subject: ", x)) {
				if (generatedLen) {
					msg.strbuf_addch((byte)'\n');
				} 
				msg.strbuf_addstr(x);
			}  else if (ModernizedCProgram.skip_prefix(generatedBuf, "Author: ", x)) {
				author_name.strbuf_addstr(x);
			}  else if (ModernizedCProgram.skip_prefix(generatedBuf, "Email: ", x)) {
				author_email.strbuf_addstr(x);
			}  else if (ModernizedCProgram.skip_prefix(generatedBuf, "Date: ", x)) {
				author_date.strbuf_addstr(x);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
		if (!/*Error: Function owner not recognized*/strcmp(generatedBuf, /* Skip pine's internal folder data */"Mail System Internal Data")) {
			ret = 1;
			;
		} 
		if (ModernizedCProgram.is_empty_or_missing_file(ModernizedCProgram.am_path(ModernizedCProgram.state, "patch"))) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._("Patch is empty."));
			ModernizedCProgram.die_user_resolve(ModernizedCProgram.state);
		} 
		msg.strbuf_addstr("\n\n");
		strbuf generatedLog_message = mi.getLog_message();
		msg.strbuf_addbuf(generatedLog_message);
		msg.strbuf_stripspace(0);
		((!ModernizedCProgram.state.getAuthor_name()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_name", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1205));
		ModernizedCProgram.state.setAuthor_name(author_name.strbuf_detach(((Object)0)));
		((!ModernizedCProgram.state.getAuthor_email()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_email", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1208));
		ModernizedCProgram.state.setAuthor_email(author_email.strbuf_detach(((Object)0)));
		((!ModernizedCProgram.state.getAuthor_date()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->author_date", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1211));
		ModernizedCProgram.state.setAuthor_date(author_date.strbuf_detach(((Object)0)));
		((!ModernizedCProgram.state.getMsg()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!state->msg", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1214));
		ModernizedCProgram.state.setMsg(msg.strbuf_detach(ModernizedCProgram.state.getMsg_len()));
		author_date.strbuf_release();
		author_email.strbuf_release();
		author_name.strbuf_release();
		sb.strbuf_release();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clear_mailinfo(mi);
		return ret/**
		 * Sets commit_id to the commit hash where the mail was generated from.
		 * Returns 0 on success, -1 on failure.
		 */;
	}
	public int parse_mail_rebase(Object mail) {
		commit commit = new commit();
		object_id commit_oid = new object_id();
		if (commit_oid.get_mail_commit_oid(mail) < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("could not parse %s"), mail);
		} 
		commit = /*Error: Function owner not recognized*/lookup_commit_or_die(commit_oid, mail);
		ModernizedCProgram.get_commit_info(ModernizedCProgram.state, commit);
		commit.write_commit_patch(ModernizedCProgram.state);
		ModernizedCProgram.state.getOrig_commit().oidcpy(commit_oid);
		ModernizedCProgram.write_state_text(ModernizedCProgram.state, "original-commit", ModernizedCProgram.oid_to_hex(commit_oid));
		ModernizedCProgram.update_ref("am", "REBASE_HEAD", commit_oid, ((Object)0), (1 << 0), action_on_err.UPDATE_REFS_DIE_ON_ERR);
		return 0/**
		 * Applies current patch with git-apply. Returns 0 on success, -1 otherwise. If
		 * `index_file` is not NULL, the patch will be applied to that index.
		 */;
	}
	public int do_interactive() {
		((ModernizedCProgram.state.getMsg()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("state->msg", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1633));
		argv_array generatedArgs = cp.getArgs();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			byte[] reply = new byte[64];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram._("Commit Body is:"));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("--------------------------");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", ModernizedCProgram.state.getMsg());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("--------------------------"/*
					 * TRANSLATORS: Make sure to include [y], [n], [e], [v] and [a]
					 * in your translation. The program will only accept English
					 * input at this point.
					 */);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("Apply? [y]es/[n]o/[e]dit/[v]iew patch/[a]ccept all: "));
			if (!/*Error: Function owner not recognized*/fgets(reply, /*Error: sizeof expression not supported yet*/, (_iob[0]))) {
				ModernizedCProgram.die("unable to read from stdin; aborting");
			} 
			if (reply == (byte)'y' || reply == (byte)'Y') {
				return 0;
			}  else if (reply == (byte)'a' || reply == (byte)'A') {
				ModernizedCProgram.state.setInteractive(0);
				return 0;
			}  else if (reply == (byte)'n' || reply == (byte)'N') {
				return 1;
			}  else if (reply == (byte)'e' || reply == (byte)'E') {
				strbuf msg = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				if (!ModernizedCProgram.msg.launch_editor(ModernizedCProgram.am_path(ModernizedCProgram.state, "final-commit"), ((Object)0))) {
					ModernizedCProgram.free(ModernizedCProgram.state.getMsg());
					ModernizedCProgram.state.setMsg(ModernizedCProgram.msg.strbuf_detach(ModernizedCProgram.state.getMsg_len()));
				} 
				ModernizedCProgram.msg.strbuf_release();
			}  else if (reply == (byte)'v' || reply == (byte)'V') {
				byte pager = ModernizedCProgram.git_pager(1);
				child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
				if (!pager) {
					pager = "cat";
				} 
				cp.prepare_pager_args(pager);
				generatedArgs.argv_array_push(ModernizedCProgram.am_path(ModernizedCProgram.state, "patch"));
				cp/**
				 * Applies all queued mail.
				 *
				 * If `resume` is true, we are "resuming". The "msg" and authorship fields, as
				 * well as the state directory's "patch" file is used as-is for applying the
				 * patch and committing it.
				 */.run_command();
			} 
		}
	}
	public void am_run(int resume) {
		byte[] argv_gc_auto = new byte[]{"gc", "--auto", ((Object)0)};
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.am_path(ModernizedCProgram.state, "dirtyindex"));
		if (ModernizedCProgram.the_repository.repo_refresh_and_write_index((true), (false), (false), ((Object)0), ((Object)0), ((Object)0)) < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to write index file"));
		} 
		byte[] generatedBuf = sb.getBuf();
		if (ModernizedCProgram.repo_index_has_changes(ModernizedCProgram.the_repository, ((Object)0), sb)) {
			ModernizedCProgram.write_state_bool(ModernizedCProgram.state, "dirtyindex", 1);
			ModernizedCProgram.die(ModernizedCProgram._("Dirty index: cannot apply patches (dirty: %s)"), generatedBuf);
		} 
		sb.strbuf_release();
		if (!ModernizedCProgram.is_empty_or_missing_file(ModernizedCProgram.am_path(ModernizedCProgram.state, "rewritten"))) {
			((ModernizedCProgram.state.getRebasing()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("state->rebasing", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1782));
			ModernizedCProgram.copy_notes_for_rebase(ModernizedCProgram.state);
			ModernizedCProgram.run_post_rewrite_hook(ModernizedCProgram.state/*
				 * In rebasing mode, it's up to the caller to take care of
				 * housekeeping.
				 */);
		} 
		if (!ModernizedCProgram.state.getRebasing()) {
			ModernizedCProgram.am_destroy(ModernizedCProgram.state);
			ModernizedCProgram.the_repository.getObjects().close_object_store();
			ModernizedCProgram.run_command_v_opt(argv_gc_auto, 2/**
			 * Resume the current am session after patch application failure. The user did
			 * all the hard work, and we do not have to do any patch application. Just
			 * trust and commit what the user has in the index and working tree.
			 */);
		} 
	}
	public void am_resolve() {
		ModernizedCProgram.validate_resume_state(ModernizedCProgram.state);
		(_iob[1]).say(ModernizedCProgram.state, ModernizedCProgram._("Applying: %.*s"), ModernizedCProgram.linelen(ModernizedCProgram.state.getMsg()), ModernizedCProgram.state.getMsg());
		if (!ModernizedCProgram.repo_index_has_changes(ModernizedCProgram.the_repository, ((Object)0), ((Object)0))) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._("No changes - did you forget to use 'git add'?\nIf there is nothing left to stage, chances are that something else\nalready introduced the same changes; you might want to skip this patch."));
			ModernizedCProgram.die_user_resolve(ModernizedCProgram.state);
		} 
		if (ModernizedCProgram.unmerged_index(ModernizedCProgram.the_index)) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._("You still have unmerged paths in your index.\nYou should 'git add' each file with resolved conflicts to mark them as such.\nYou might run `git rm` on a file to accept \"deleted by them\" for it."));
			ModernizedCProgram.die_user_resolve(ModernizedCProgram.state);
		} 
		if (ModernizedCProgram.state.getInteractive()) {
			ModernizedCProgram.write_index_patch(ModernizedCProgram.state);
			if (ModernizedCProgram.state.do_interactive()) {
				;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/repo_rerere(ModernizedCProgram.the_repository, 0);
		ModernizedCProgram.do_commit(ModernizedCProgram.state);
		ModernizedCProgram.state.am_load();
		ModernizedCProgram.state.am_run(0/**
		 * Performs a checkout fast-forward from `head` to `remote`. If `reset` is
		 * true, any unmerged entries will be discarded. Returns 0 on success, -1 on
		 * failure.
		 */);
	}
	public void am_skip() {
		object_id head = new object_id();
		ModernizedCProgram.am_rerere_clear();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "HEAD", head)) {
			head.oidcpy(ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
		} 
		if (ModernizedCProgram.clean_index(head, head)) {
			ModernizedCProgram.die(ModernizedCProgram._("failed to clean index"));
		} 
		if (ModernizedCProgram.state.getRebasing()) {
			FILE fp = ModernizedCProgram.xfopen(ModernizedCProgram.am_path(ModernizedCProgram.state, "rewritten"), "a");
			((!ModernizedCProgram.is_null_oid(ModernizedCProgram.state.getOrig_commit())) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!is_null_oid(&state->orig_commit)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\am.c", 1981));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fp, "%s ", ModernizedCProgram.oid_to_hex(ModernizedCProgram.state.getOrig_commit()));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fp, "%s\n", ModernizedCProgram.oid_to_hex(head));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
		} 
		ModernizedCProgram.state.am_next();
		ModernizedCProgram.state.am_load();
		ModernizedCProgram.state.am_run(0/**
		 * Returns true if it is safe to reset HEAD to the ORIG_HEAD, false otherwise.
		 *
		 * It is not safe to reset HEAD when:
		 * 1. git-am previously failed because the index was dirty.
		 * 2. HEAD has moved since git-am previously failed.
		 */);
	}
	public void am_abort() {
		object_id curr_head = new object_id();
		object_id orig_head = new object_id();
		int has_curr_head;
		int has_orig_head;
		byte curr_branch;
		if (!ModernizedCProgram.safe_to_abort(ModernizedCProgram.state)) {
			ModernizedCProgram.am_destroy(ModernizedCProgram.state);
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.am_rerere_clear();
		curr_branch = curr_head.resolve_refdup("HEAD", 0, ((Object)0));
		has_curr_head = curr_branch && !ModernizedCProgram.is_null_oid(curr_head);
		if (!has_curr_head) {
			curr_head.oidcpy(ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
		} 
		has_orig_head = !ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, "ORIG_HEAD", orig_head);
		if (!has_orig_head) {
			orig_head.oidcpy(ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
		} 
		ModernizedCProgram.clean_index(curr_head, orig_head);
		if (has_orig_head) {
			ModernizedCProgram.update_ref("am --abort", "HEAD", orig_head, has_curr_head ? curr_head : ((Object)0), 0, action_on_err.UPDATE_REFS_DIE_ON_ERR);
		}  else if (curr_branch) {
			ModernizedCProgram.delete_ref(((Object)0), curr_branch, ((Object)0), (1 << 0));
		} 
		ModernizedCProgram.free(curr_branch);
		ModernizedCProgram.am_destroy(ModernizedCProgram.state);
	}
	public int show_patch() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte patch_path;
		int len;
		if (!ModernizedCProgram.is_null_oid(ModernizedCProgram.state.getOrig_commit())) {
			byte[] av = new byte[]{"show", ((Object)0), "--", ((Object)0)};
			byte new_oid_str;
			int ret;
			av[1] = new_oid_str = ModernizedCProgram.xstrdup(ModernizedCProgram.oid_to_hex(ModernizedCProgram.state.getOrig_commit()));
			ret = ModernizedCProgram.run_command_v_opt(av, 2);
			ModernizedCProgram.free(new_oid_str);
			return ret;
		} 
		patch_path = ModernizedCProgram.am_path(ModernizedCProgram.state, ModernizedCProgram.msgnum(ModernizedCProgram.state));
		len = sb.strbuf_read_file(patch_path, 0);
		if (len < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to read '%s'"), patch_path);
		} 
		ModernizedCProgram.setup_pager();
		byte[] generatedBuf = sb.getBuf();
		Object generatedLen = sb.getLen();
		ModernizedCProgram.write_in_full(1, generatedBuf, generatedLen);
		sb.strbuf_release();
		return 0/**
		 * parse_options() callback that validates and sets opt->value to the
		 * PATCH_FORMAT_* enum value corresponding to `arg`.
		 */;
	}
	public Byte getDir() {
		return dir;
	}
	public void setDir(Byte newDir) {
		dir = newDir;
	}
	public int getCur() {
		return cur;
	}
	public void setCur(int newCur) {
		cur = newCur;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int newLast) {
		last = newLast;
	}
	public Byte getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(Byte newAuthor_name) {
		author_name = newAuthor_name;
	}
	public Byte getAuthor_email() {
		return author_email;
	}
	public void setAuthor_email(Byte newAuthor_email) {
		author_email = newAuthor_email;
	}
	public Byte getAuthor_date() {
		return author_date;
	}
	public void setAuthor_date(Byte newAuthor_date) {
		author_date = newAuthor_date;
	}
	public Byte getMsg() {
		return msg;
	}
	public void setMsg(Byte newMsg) {
		msg = newMsg;
	}
	public Object getMsg_len() {
		return msg_len;
	}
	public void setMsg_len(Object newMsg_len) {
		msg_len = newMsg_len;
	}
	public object_id getOrig_commit() {
		return orig_commit;
	}
	public void setOrig_commit(object_id newOrig_commit) {
		orig_commit = newOrig_commit;
	}
	public int getPrec() {
		return prec;
	}
	public void setPrec(int newPrec) {
		prec = newPrec;
	}
	public int getInteractive() {
		return interactive;
	}
	public void setInteractive(int newInteractive) {
		interactive = newInteractive;
	}
	public int getThreeway() {
		return threeway;
	}
	public void setThreeway(int newThreeway) {
		threeway = newThreeway;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getSignoff() {
		return signoff;
	}
	public void setSignoff(int newSignoff) {
		signoff = newSignoff;
	}
	public int getUtf8() {
		return utf8;
	}
	public void setUtf8(int newUtf8) {
		utf8 = newUtf8;
	}
	public int getKeep() {
		return keep;
	}
	public void setKeep(int newKeep) {
		keep = newKeep;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int newMessage_id) {
		message_id = newMessage_id;
	}
	public int getScissors() {
		return scissors;
	}
	public void setScissors(int newScissors) {
		scissors = newScissors;
	}
	public argv_array getGit_apply_opts() {
		return git_apply_opts;
	}
	public void setGit_apply_opts(argv_array newGit_apply_opts) {
		git_apply_opts = newGit_apply_opts;
	}
	public Object getResolvemsg() {
		return resolvemsg;
	}
	public void setResolvemsg(Object newResolvemsg) {
		resolvemsg = newResolvemsg;
	}
	public int getCommitter_date_is_author_date() {
		return committer_date_is_author_date;
	}
	public void setCommitter_date_is_author_date(int newCommitter_date_is_author_date) {
		committer_date_is_author_date = newCommitter_date_is_author_date;
	}
	public int getIgnore_date() {
		return ignore_date;
	}
	public void setIgnore_date(int newIgnore_date) {
		ignore_date = newIgnore_date;
	}
	public int getAllow_rerere_autoupdate() {
		return allow_rerere_autoupdate;
	}
	public void setAllow_rerere_autoupdate(int newAllow_rerere_autoupdate) {
		allow_rerere_autoupdate = newAllow_rerere_autoupdate;
	}
	public Object getSign_commit() {
		return sign_commit;
	}
	public void setSign_commit(Object newSign_commit) {
		sign_commit = newSign_commit;
	}
	public int getRebasing() {
		return rebasing;
	}
	public void setRebasing(int newRebasing) {
		rebasing = newRebasing;
	}
}
/* state directory path */
