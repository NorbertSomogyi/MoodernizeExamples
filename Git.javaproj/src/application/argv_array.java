package application;

public class argv_array {
	private Object[][] argv;
	private int argc;
	private int alloc;
	
	public argv_array(Object[][] argv, int argc, int alloc) {
		setArgv(argv);
		setArgc(argc);
		setAlloc(alloc);
	}
	public argv_array() {
	}
	
	public int sq_dequote_to_argv_internal(Byte arg, Object argv, Integer nr, Integer alloc) {
		byte next = arg;
		if (!arg) {
			return 0;
		} 
		do {
			byte dequoted = ModernizedCProgram.sq_dequote_step(next, next);
			if (!dequoted) {
				return -1;
			} 
			if (argv) {
				do {
					if ((nr + 1) > alloc) {
						if ((((alloc) + 16) * 3 / 2) < (nr + 1)) {
							alloc = (nr + 1);
						} else {
								alloc = (((alloc) + 16) * 3 / 2);
						} 
						(argv) = ModernizedCProgram.xrealloc((argv), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (alloc)));
					} 
				} while (0);
				(argv)[(nr)++] = dequoted;
			} 
			if (array) {
				array.argv_array_push(dequoted);
			} 
		} while (next);
		return 0;
	}
	public int sq_dequote_to_argv_array(Byte arg) {
		return array/* 1 means: quote as octal
		 * 0 means: quote as octal if (quote_path_fully)
		 * -1 means: never quote
		 * c: quote as "\\c"
		 */.sq_dequote_to_argv_internal(arg, ((Object)0), ((Object)0), ((Object)0));
	}
	public void push_ssh_options(argv_array env, ssh_variant variant, Object port, protocol_version version, int flags) {
		if (ssh_variant.variant == ssh_variant.VARIANT_SSH && protocol_version.version > 0) {
			ModernizedCProgram.args.argv_array_push("-o");
			ModernizedCProgram.args.argv_array_push("SendEnv=GIT_PROTOCOL");
			env.argv_array_pushf("GIT_PROTOCOL=version=%d", protocol_version.version);
		} 
		if (flags & (-1024 << 2)) {
			switch (ssh_variant.variant) {
			case ssh_variant.VARIANT_SSH:
			case ssh_variant.VARIANT_SIMPLE:
					ModernizedCProgram.die(ModernizedCProgram._("ssh variant 'simple' does not support -4"));
			case ssh_variant.VARIANT_TORTOISEPLINK:
					ModernizedCProgram.args.argv_array_push("-4");
			case ssh_variant.VARIANT_AUTO:
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\connect.c", 1121, "VARIANT_AUTO passed to push_ssh_options");
			case ssh_variant.VARIANT_PLINK:
			case ssh_variant.VARIANT_PUTTY:
			}
		}  else if (flags & (-1024 << 3)) {
			switch (ssh_variant.variant) {
			case ssh_variant.VARIANT_TORTOISEPLINK:
					ModernizedCProgram.args.argv_array_push("-6");
			case ssh_variant.VARIANT_SIMPLE:
					ModernizedCProgram.die(ModernizedCProgram._("ssh variant 'simple' does not support -6"));
			case ssh_variant.VARIANT_PUTTY:
			case ssh_variant.VARIANT_PLINK:
			case ssh_variant.VARIANT_AUTO:
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\connect.c", 1133, "VARIANT_AUTO passed to push_ssh_options");
			case ssh_variant.VARIANT_SSH:
			}
		} 
		if (ssh_variant.variant == ssh_variant.VARIANT_TORTOISEPLINK) {
			ModernizedCProgram.args.argv_array_push("-batch");
		} 
		if (port) {
			switch (ssh_variant.variant) {
			case ssh_variant.VARIANT_SSH:
					ModernizedCProgram.args.argv_array_push("-p");
					break;
			case ssh_variant.VARIANT_PLINK:
			case ssh_variant.VARIANT_SIMPLE:
					ModernizedCProgram.die(ModernizedCProgram._("ssh variant 'simple' does not support setting port"));
			case ssh_variant.VARIANT_TORTOISEPLINK:
					ModernizedCProgram.args.argv_array_push("-P");
			case ssh_variant.VARIANT_PUTTY:
			case ssh_variant.VARIANT_AUTO:
					ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\connect.c", 1150, "VARIANT_AUTO passed to push_ssh_options");
			}
			ModernizedCProgram.args.argv_array_push(port);
		} 
	}
	public void read_bisect_paths() {
		strbuf str = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte filename = ModernizedCProgram.git_path_bisect_names();
		FILE fp = ModernizedCProgram.xfopen(filename, "r");
		byte[] generatedBuf = str.getBuf();
		while (ModernizedCProgram.strbuf_getline_lf(str, fp) != (true)) {
			str.strbuf_trim();
			if (array.sq_dequote_to_argv_array(generatedBuf)) {
				ModernizedCProgram.die(ModernizedCProgram._("Badly quoted content in file '%s': %s"), filename, generatedBuf);
			} 
		}
		str.strbuf_release();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(fp);
	}
	public Object getenv_safe(Object name) {
		byte value = /*Error: Function owner not recognized*/getenv(name);
		if (!value) {
			return ((Object)0);
		} 
		argv.argv_array_push(value);
		Object[][] generatedArgv = this.getArgv();
		int generatedArgc = this.getArgc();
		return generatedArgv[generatedArgc - 1];
	}
	public void env_append(Object key, Object val) {
		strbuf quoted = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte old;
		/*
			 * Avoid quoting if it's not necessary, for maximum compatibility
			 * with older parsers which don't understand the quoting.
			 */
		byte[] generatedBuf = quoted.getBuf();
		if (val == (byte)'"' || /*Error: Function owner not recognized*/strchr(val, (byte)':')) {
			quoted.strbuf_addch((byte)'"');
			ModernizedCProgram.quote_c_style(val, quoted, ((Object)0), 1);
			quoted.strbuf_addch((byte)'"');
			val = generatedBuf;
		} 
		old = /*Error: Function owner not recognized*/getenv(key);
		if (!old) {
			env.argv_array_pushf("%s=%s", key, val);
		} else {
				env.argv_array_pushf("%s=%s%c%s", key, old, (byte)':', val);
		} 
		quoted.strbuf_release();
	}
	public void env_replace(Object key, Object val) {
		env.argv_array_pushf("%s=%s", key, val);
	}
	public void add_options_to_argv() {
		if (ModernizedCProgram.dry_run) {
			argv.argv_array_push("--dry-run");
		} 
		if (ModernizedCProgram.prune != -1) {
			argv.argv_array_push(ModernizedCProgram.prune ? "--prune" : "--no-prune");
		} 
		if (ModernizedCProgram.prune_tags != -1) {
			argv.argv_array_push(ModernizedCProgram.prune_tags ? "--prune-tags" : "--no-prune-tags");
		} 
		if (ModernizedCProgram.update_head_ok) {
			argv.argv_array_push("--update-head-ok");
		} 
		if (ModernizedCProgram.force) {
			argv.argv_array_push("--force");
		} 
		if (ModernizedCProgram.keep) {
			argv.argv_array_push("--keep");
		} 
		if (ModernizedCProgram.recurse_submodules == .RECURSE_SUBMODULES_ON) {
			argv.argv_array_push("--recurse-submodules");
		}  else if (ModernizedCProgram.recurse_submodules == .RECURSE_SUBMODULES_ON_DEMAND) {
			argv.argv_array_push("--recurse-submodules=on-demand");
		} 
		if (ModernizedCProgram.tags == .TAGS_SET) {
			argv.argv_array_push("--tags");
		}  else if (ModernizedCProgram.tags == .TAGS_UNSET) {
			argv.argv_array_push("--no-tags");
		} 
		if (ModernizedCProgram.verbosity >= 2) {
			argv.argv_array_push("-v");
		} 
		if (ModernizedCProgram.verbosity >= 1) {
			argv.argv_array_push("-v");
		}  else if (ModernizedCProgram.verbosity < 0) {
			argv.argv_array_push("-q");
		} 
	}
	public void expand_ref_prefix(Object prefix) {
		byte p;
		int len = /*Error: Function owner not recognized*/strlen(prefix);
		for (p = ModernizedCProgram.ref_rev_parse_rules; p; p++) {
			prefixes.argv_array_pushf(p, len, prefix/*
			 * *string and *len will only be substituted, and *string returned (for
			 * later free()ing) if the string passed in is a magic short-hand form
			 * to name a branch.
			 */);
		}
	}
	public void prepare_submodule_repo_env_no_git_dir() {
		byte var;
		for (var = ModernizedCProgram.local_repo_env; var; var++) {
			if (/*Error: Function owner not recognized*/strcmp(var, "GIT_CONFIG_PARAMETERS")) {
				out.argv_array_push(var);
			} 
		}
	}
	public void prepare_submodule_repo_env() {
		out.prepare_submodule_repo_env_no_git_dir();
		out.argv_array_pushf("%s=%s", "GIT_DIR", ".git");
	}
	public void prepare_submodule_repo_env_in_gitdir() {
		out.prepare_submodule_repo_env_no_git_dir();
		out.argv_array_pushf("%s=.", "GIT_DIR"/*
		 * Initialize a repository struct for a submodule based on the provided 'path'.
		 *
		 * Unlike repo_submodule_init, this tolerates submodules not present
		 * in .gitmodules. This function exists only to preserve historical behavior,
		 *
		 * Returns the repository struct on success,
		 * NULL when the submodule is not present.
		 */);
	}
	public Object prepare_git_cmd(Object argv) {
		out.argv_array_push("git");
		out.argv_array_pushv(argv);
		Object[][] generatedArgv = this.getArgv();
		return generatedArgv;
	}
	public Object push_to_deploy(Byte sha1, Object work_tree) {
		byte[] update_refresh = new byte[]{"update-index", "-q", "--ignore-submodules", "--refresh", ((Object)0)};
		byte[] diff_files = new byte[]{"diff-files", "--quiet", "--ignore-submodules", "--", ((Object)0)};
		byte[] diff_index = new byte[]{"diff-index", "--quiet", "--cached", "--ignore-submodules", ((Object)0), "--", ((Object)0)};
		byte[] read_tree = new byte[]{"read-tree", "-u", "-m", ((Object)0), ((Object)0)};
		child_process child = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		child.setArgv(update_refresh);
		Object[][] generatedArgv = this.getArgv();
		child.setEnv(generatedArgv);
		child.setDir(work_tree);
		child.setNo_stdin(1);
		child.setStdout_to_stderr(1);
		child.setGit_cmd(1);
		if (child.run_command()) {
			return "Up-to-date check failed";
		} 
		/* run_command() does not clean up completely; reinitialize */child.child_process_init();
		child.setArgv(diff_files);
		child.setEnv(generatedArgv);
		child.setDir(work_tree);
		child.setNo_stdin(1);
		child.setStdout_to_stderr(1);
		child.setGit_cmd(1);
		if (child.run_command()) {
			return "Working directory has unstaged changes";
		} 
		diff_index[4] = ModernizedCProgram.head_has_history() ? "HEAD" : ModernizedCProgram.empty_tree_oid_hex();
		child.child_process_init();
		child.setArgv(diff_index);
		child.setEnv(generatedArgv);
		child.setNo_stdin(1);
		child.setNo_stdout(1);
		child.setStdout_to_stderr(0);
		child.setGit_cmd(1);
		if (child.run_command()) {
			return "Working directory has staged changes";
		} 
		read_tree[3] = ModernizedCProgram.hash_to_hex(sha1);
		child.child_process_init();
		child.setArgv(read_tree);
		child.setEnv(generatedArgv);
		child.setDir(work_tree);
		child.setNo_stdin(1);
		child.setNo_stdout(1);
		child.setStdout_to_stderr(0);
		child.setGit_cmd(1);
		if (child.run_command()) {
			return "Could not update working tree to new HEAD";
		} 
		return ((Object)0);
	}
	public Object push_to_checkout(Byte hash, Object work_tree) {
		env.argv_array_pushf("GIT_WORK_TREE=%s", ModernizedCProgram.absolute_path(work_tree));
		Object[][] generatedArgv = this.getArgv();
		if (ModernizedCProgram.run_hook_le(generatedArgv, ModernizedCProgram.push_to_checkout_hook, ModernizedCProgram.hash_to_hex(hash), ((Object)0))) {
			return "push-to-checkout hook declined";
		} else {
				return ((Object)0);
		} 
	}
	public Object prepare_shell_cmd(Object[][] argv) {
		if (!argv[0]) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 268, "shell command is empty");
		} 
		if (/*Error: Function owner not recognized*/strcspn(argv[0], "|&;<>()$`\\\"' \t\n*?[#~=%") != /*Error: Function owner not recognized*/strlen(argv[0])) {
			out.argv_array_push("sh");
			out.argv_array_push("-c"/*
					 * If we have no extra arguments, we do not even need to
					 * bother with the "$@" magic.
					 */);
			if (!argv[1]) {
				out.argv_array_push(argv[0]);
			} else {
					out.argv_array_pushf("%s \"$@\"", argv[0]);
			} 
		} 
		out.argv_array_pushv(argv);
		Object[][] generatedArgv = this.getArgv();
		return generatedArgv;
	}
	/* errno */
	/* write(2) on buf smaller than PIPE_BUF (min 512) is atomic: */
	/*
	 * parent will make it look like the child spewed a fatal error and died
	 * this is needed to prevent changes to t0061.
	 */
	/* this runs in the parent process */
	public int read_env_script() {
		byte name;
		byte email;
		byte date;
		if (ModernizedCProgram.read_author_script(ModernizedCProgram.rebase_path_author_script(), name, email, date, 0)) {
			return -1;
		} 
		env.argv_array_pushf("GIT_AUTHOR_NAME=%s", name);
		env.argv_array_pushf("GIT_AUTHOR_EMAIL=%s", email);
		env.argv_array_pushf("GIT_AUTHOR_DATE=%s", date);
		ModernizedCProgram.free(name);
		ModernizedCProgram.free(email);
		ModernizedCProgram.free(date);
		return 0;
	}
	public void add_pathspecs(Object ps) {
		int i;
		for (i = 0; i < ps.getNr(); i++) {
			ModernizedCProgram.args.argv_array_push(ps.getItems()[i].getOriginal());
		}
	}
	public void parse_graph_colors_config(Object string) {
		byte end;
		byte start;
		start = string;
		end = string + /*Error: Function owner not recognized*/strlen(string);
		while (start < end) {
			byte comma = ModernizedCProgram.gitstrchrnul(start, (byte)',');
			byte[] color = new byte[75];
			if (!ModernizedCProgram.color_parse_mem(start, comma - start, color)) {
				colors.argv_array_push(color);
			} else {
					ModernizedCProgram.warning(ModernizedCProgram._("ignore invalid color '%.*s' in log.graphColors"), (int)(comma - start), start);
			} 
			start = comma + 1;
		}
		colors.argv_array_push("\033[m");
	}
	public void argv_push_verbosity() {
		int verbosity;
		for (verbosity = ModernizedCProgram.opt_verbosity; verbosity > 0; verbosity--) {
			arr.argv_array_push("-v");
		}
		for (verbosity = ModernizedCProgram.opt_verbosity; verbosity < 0; verbosity++) {
			arr.argv_array_push("-q"/**
			 * Pushes "-f" switches into arr to match the opt_force level.
			 */);
		}
	}
	public void argv_push_force() {
		int force = ModernizedCProgram.opt_force;
		while (force-- > 0) {
			arr.argv_array_push("-f"/**
			 * Sets the GIT_REFLOG_ACTION environment variable to the concatenation of argv
			 */);
		}
	}
	public void setup_pager_env() {
		byte argv;
		int i;
		byte pager_env = ModernizedCProgram.xstrdup(PAGER_ENV);
		int n = ModernizedCProgram.split_cmdline(pager_env, argv);
		if (n < 0) {
			ModernizedCProgram.die("malformed build-time PAGER_ENV: %s", ModernizedCProgram.split_cmdline_strerror(n));
		} 
		for (i = 0; i < n; i++) {
			byte cp = /*Error: Function owner not recognized*/strchr(argv[i], (byte)'=');
			if (!cp) {
				ModernizedCProgram.die("malformed build-time PAGER_ENV");
			} 
			cp = (byte)'\0';
			if (!/*Error: Function owner not recognized*/getenv(argv[i])) {
				cp = (byte)'=';
				env.argv_array_push(argv[i]);
			} 
		}
		ModernizedCProgram.free(pager_env);
		ModernizedCProgram.free(argv);
	}
	public void refspec_ref_prefixes(Object rs) {
		int i;
		for (i = 0; i < rs.getNr(); i++) {
			refspec_item item = rs.getItems()[i];
			byte prefix = ((Object)0);
			if (item.getExact_sha1()) {
				continue;
			} 
			if (rs.getFetch() == 1) {
				ModernizedCProgram.prefix = item.getSrc();
			}  else if (item.getDst()) {
				ModernizedCProgram.prefix = item.getDst();
			}  else if (item.getSrc() && !item.getExact_sha1()) {
				ModernizedCProgram.prefix = item.getSrc();
			} 
			if (ModernizedCProgram.prefix) {
				if (item.getPattern()) {
					byte glob = /*Error: Function owner not recognized*/strchr(ModernizedCProgram.prefix, (byte)'*');
					ref_prefixes.argv_array_pushf("%.*s", (int)(glob - ModernizedCProgram.prefix), ModernizedCProgram.prefix);
				} else {
						ref_prefixes.expand_ref_prefix(ModernizedCProgram.prefix);
				} 
			} 
		}
	}
	public void argv_array_init() {
		this.setArgv(ModernizedCProgram.empty_argv);
		this.setArgc(0);
		this.setAlloc(0);
	}
	public void argv_array_push_nodup(Object value) {
		Object[][] generatedArgv = this.getArgv();
		if (generatedArgv == ModernizedCProgram.empty_argv) {
			this.setArgv(((Object)0));
		} 
		int generatedArgc = this.getArgc();
		int generatedAlloc = this.getAlloc();
		do {
			if ((generatedArgc + 2) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedArgc + 2)) {
					this.setAlloc((generatedArgc + 2));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedArgv) = ModernizedCProgram.xrealloc((generatedArgv), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
			} 
		} while (0);
		generatedArgv[generatedArgc++] = value;
		generatedArgv[generatedArgc] = ((Object)0);
	}
	public Object argv_array_push(Object value) {
		array.argv_array_push_nodup(ModernizedCProgram.xstrdup(value));
		Object[][] generatedArgv = this.getArgv();
		int generatedArgc = this.getArgc();
		return generatedArgv[generatedArgc - 1];
	}
	public Object argv_array_pushf(Object fmt) {
		va_list ap = new va_list();
		strbuf v = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, fmt);
		v.strbuf_vaddf(fmt, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		array.argv_array_push_nodup(v.strbuf_detach(((Object)0)));
		Object[][] generatedArgv = this.getArgv();
		int generatedArgc = this.getArgc();
		return generatedArgv[generatedArgc - 1];
	}
	public void argv_array_pushl() {
		va_list ap = new va_list();
		byte arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, array);
		while ((arg = (int)ap)) {
			array.argv_array_push(arg);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
	}
	public void argv_array_pushv(Object argv) {
		for (; argv; argv++) {
			array.argv_array_push(argv);
		}
	}
	public void argv_array_pop() {
		int generatedArgc = this.getArgc();
		if (!generatedArgc) {
			return /*Error: Unsupported expression*/;
		} 
		Object[][] generatedArgv = this.getArgv();
		ModernizedCProgram.free((byte)generatedArgv[generatedArgc - 1]);
		generatedArgv[generatedArgc - 1] = ((Object)0);
		generatedArgc--;
	}
	public void argv_array_split(Object to_split) {
		while (((ModernizedCProgram.sane_ctype[(byte)(to_split)] & (true)) != 0)) {
			to_split++;
		}
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			byte p = to_split;
			if (!p) {
				break;
			} 
			while (p && !((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
				p++;
			}
			array.argv_array_push_nodup(ModernizedCProgram.xstrndup(to_split, p - to_split));
			while (((ModernizedCProgram.sane_ctype[(byte)(p)] & (true)) != 0)) {
				p++;
			}
			to_split = p;
		}
	}
	public void argv_array_clear() {
		Object[][] generatedArgv = this.getArgv();
		int generatedArgc = this.getArgc();
		if (generatedArgv != ModernizedCProgram.empty_argv) {
			int i;
			for (i = 0; i < generatedArgc; i++) {
				ModernizedCProgram.free((byte)generatedArgv[i]);
			}
			ModernizedCProgram.free(generatedArgv);
		} 
		array.argv_array_init();
	}
	public Object argv_array_detach() {
		Object[][] generatedArgv = this.getArgv();
		if (generatedArgv == ModernizedCProgram.empty_argv) {
			return ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
		} else {
				byte ret = generatedArgv;
				array.argv_array_init();
				return ret;
		} 
	}
	public Object[][] getArgv() {
		return argv;
	}
	public void setArgv(Object[][] newArgv) {
		argv = newArgv;
	}
	public int getArgc() {
		return argc;
	}
	public void setArgc(int newArgc) {
		argc = newArgc;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
}
