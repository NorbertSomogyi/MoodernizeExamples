package application;

public class child_process {
	private Object argv;
	private argv_array args;
	private argv_array env_array;
	private Object pid;
	private int trace2_child_id;
	private Object trace2_child_us_start;
	private Object trace2_child_class;
	private Object trace2_hook_name;
	private int in;
	private int out;
	private int err;
	private Object dir;
	private Object env;
	private int no_stdin;
	private int no_stdout;
	private int no_stderr;
	private int git_cmd;
	private int silent_exec_failure;
	private int stdout_to_stderr;
	private int use_shell;
	private int clean_on_exit;
	private int wait_after_clean;
	private Object clean_on_exit_handler;
	private Object clean_on_exit_handler_cbdata;
	
	public child_process(Object argv, argv_array args, argv_array env_array, Object pid, int trace2_child_id, Object trace2_child_us_start, Object trace2_child_class, Object trace2_hook_name, int in, int out, int err, Object dir, Object env, int no_stdin, int no_stdout, int no_stderr, int git_cmd, int silent_exec_failure, int stdout_to_stderr, int use_shell, int clean_on_exit, int wait_after_clean, Object clean_on_exit_handler, Object clean_on_exit_handler_cbdata) {
		setArgv(argv);
		setArgs(args);
		setEnv_array(env_array);
		setPid(pid);
		setTrace2_child_id(trace2_child_id);
		setTrace2_child_us_start(trace2_child_us_start);
		setTrace2_child_class(trace2_child_class);
		setTrace2_hook_name(trace2_hook_name);
		setIn(in);
		setOut(out);
		setErr(err);
		setDir(dir);
		setEnv(env);
		setNo_stdin(no_stdin);
		setNo_stdout(no_stdout);
		setNo_stderr(no_stderr);
		setGit_cmd(git_cmd);
		setSilent_exec_failure(silent_exec_failure);
		setStdout_to_stderr(stdout_to_stderr);
		setUse_shell(use_shell);
		setClean_on_exit(clean_on_exit);
		setWait_after_clean(wait_after_clean);
		setClean_on_exit_handler(clean_on_exit_handler);
		setClean_on_exit_handler_cbdata(clean_on_exit_handler_cbdata);
	}
	public child_process() {
	}
	
	/**
	 * Convenience wrapper around pipe_command for the common case
	 * of capturing only stdout.
	 */
	public int capture_command(Object out, Object hint) {
		return ModernizedCProgram.pipe_command(cmd, ((Object)0), 0, out, hint, ((Object)0), 0/*
		 * The purpose of the following functions is to feed a pipe by running
		 * a function asynchronously and providing output that the caller reads.
		 *
		 * It is expected that no synchronization and mutual exclusion between
		 * the caller and the feed function is necessary so that the function
		 * can run in a thread without interfering with the caller.
		 */);
	}
	public void trace2_child_start_fl(Object file, int line) {
		tr2_tgt tgt_j = new tr2_tgt();
		int j;
		uint64_t us_now = new uint64_t();
		uint64_t us_elapsed_absolute = new uint64_t();
		if (!ModernizedCProgram.trace2_enabled) {
			return ;
		} 
		us_now = ModernizedCProgram.getnanotime() / 1000;
		us_elapsed_absolute = ModernizedCProgram.tr2tls_absolute_elapsed(us_now);
		this.setTrace2_child_id(ModernizedCProgram.tr2tls_locked_increment(ModernizedCProgram.tr2_next_child_id));
		this.setTrace2_child_us_start(us_now);
		Object generatedTr2_tgt = tgt_j.getTr2_tgt();
		for (; tgt_j; ) {
			if (ModernizedCProgram.tr2_dst_trace_want(generatedTr2_tgt)) {
				if (generatedTr2_tgt) {
					.UNRECOGNIZEDFUNCTIONNAME(file, line, us_elapsed_absolute, cmd);
				} 
			} 
		}
	}
	public void trace2_child_exit_fl(Object file, int line, int child_exit_code) {
		tr2_tgt tgt_j = new tr2_tgt();
		int j;
		uint64_t us_now = new uint64_t();
		uint64_t us_elapsed_absolute = new uint64_t();
		uint64_t us_elapsed_child = new uint64_t();
		if (!ModernizedCProgram.trace2_enabled) {
			return ;
		} 
		us_now = ModernizedCProgram.getnanotime() / 1000;
		us_elapsed_absolute = ModernizedCProgram.tr2tls_absolute_elapsed(us_now);
		Object generatedTrace2_child_us_start = this.getTrace2_child_us_start();
		if (generatedTrace2_child_us_start) {
			us_elapsed_child = us_now - generatedTrace2_child_us_start;
		} else {
				us_elapsed_child = 0;
		} 
		Object generatedTr2_tgt = tgt_j.getTr2_tgt();
		int generatedTrace2_child_id = this.getTrace2_child_id();
		Object generatedPid = this.getPid();
		for (; tgt_j; ) {
			if (ModernizedCProgram.tr2_dst_trace_want(generatedTr2_tgt)) {
				if (generatedTr2_tgt) {
					.UNRECOGNIZEDFUNCTIONNAME(file, line, us_elapsed_absolute, generatedTrace2_child_id, generatedPid, child_exit_code, us_elapsed_child);
				} 
			} 
		}
	}
	public int git_connection_is_socket() {
		return conn == ModernizedCProgram.no_fork;
	}
	public child_process git_tcp_connect(Integer fd, Byte host, int flags) {
		int sockfd = ModernizedCProgram.git_tcp_connect_sock(host, flags);
		fd[0] = sockfd;
		fd[1] = .dup(sockfd);
		return ModernizedCProgram.no_fork;
	}
	public child_process git_proxy_connect(Integer fd, Byte host) {
		byte port = "9418";
		child_process proxy = new child_process();
		ModernizedCProgram.get_host_and_port(host, port);
		if (ModernizedCProgram.looks_like_command_line_option(host)) {
			ModernizedCProgram.die(ModernizedCProgram._("strange hostname '%s' blocked"), host);
		} 
		if (ModernizedCProgram.looks_like_command_line_option(port)) {
			ModernizedCProgram.die(ModernizedCProgram._("strange port '%s' blocked"), port);
		} 
		proxy = ModernizedCProgram.xmalloc();
		proxy.child_process_init();
		argv_array generatedArgs = proxy.getArgs();
		generatedArgs.argv_array_push(ModernizedCProgram.git_proxy_command);
		generatedArgs.argv_array_push(host);
		generatedArgs.argv_array_push(port);
		proxy.setIn(-1);
		proxy.setOut(-1);
		if (proxy.start_command()) {
			ModernizedCProgram.die(ModernizedCProgram._("cannot start proxy %s"), ModernizedCProgram.git_proxy_command);
		} 
		int generatedOut = proxy.getOut();
		fd[0] = generatedOut;
		int generatedIn = proxy.getIn();
		fd[1] = generatedIn;
		return proxy;
	}
	public child_process git_connect_git(Integer fd, Byte hostandport, Object path, Object prog, protocol_version version, int flags) {
		child_process conn = new child_process();
		strbuf request = new strbuf(, , );
		byte target_host = .getenv("GIT_OVERRIDE_VIRTUAL_HOST");
		if (target_host) {
			target_host = ModernizedCProgram.xstrdup(target_host);
		} else {
				target_host = ModernizedCProgram.xstrdup(hostandport);
		} 
		ModernizedCProgram.transport_check_allowed("git"/*
			 * These underlying connection commands die() if they
			 * cannot connect.
			 */);
		child_process child_process = new child_process();
		child_process child_process = new child_process();
		if (ModernizedCProgram.git_use_proxy(hostandport)) {
			conn = child_process.git_proxy_connect(fd, hostandport);
		} else {
				conn = child_process.git_tcp_connect(fd, hostandport, flags/*
					 * Separate original protocol components prog and path
					 * from extended host header with a NUL byte.
					 *
					 * Note: Do not add any other headers here!  Doing so
					 * will cause older git-daemon servers to crash.
					 */);
		} 
		request.strbuf_addf("%s %s%chost=%s%c", prog, path, 0, target_host, 0);
		if (protocol_version.version > /* If using a new version put that stuff here after a second null byte */0) {
			request.strbuf_addch((byte)'\0');
			request.strbuf_addf("version=%d%c", protocol_version.version, (byte)'\0');
		} 
		byte generatedBuf = request.getBuf();
		Object generatedLen = request.getLen();
		ModernizedCProgram.packet_write(fd[1], generatedBuf, generatedLen);
		ModernizedCProgram.free(target_host);
		request.strbuf_release();
		return conn/*
		 * Append the appropriate environment variables to `env` and options to
		 * `args` for running ssh in Git's SSH-tunneled transport.
		 */;
	}
	/* Prepare a child_process for use by Git's SSH-tunneled transport. */
	public void fill_ssh_args(Object ssh_host, Object port, protocol_version version, int flags) {
		byte ssh;
		ssh_variant variant;
		if (ModernizedCProgram.looks_like_command_line_option(ssh_host)) {
			ModernizedCProgram.die(ModernizedCProgram._("strange hostname '%s' blocked"), ssh_host);
		} 
		ssh = ModernizedCProgram.get_ssh_command();
		if (ssh) {
			ssh_variant.variant = ModernizedCProgram.determine_ssh_variant(ssh, 1/*
					 * GIT_SSH is the no-shell version of
					 * GIT_SSH_COMMAND (and must remain so for
					 * historical compatibility).
					 */);
		} else {
				this.setUse_shell(0);
				ssh = .getenv("GIT_SSH");
				if (!ssh) {
					ssh = "ssh";
				} 
				ssh_variant.variant = ModernizedCProgram.determine_ssh_variant(ssh, 0);
		} 
		int generatedUse_shell = this.getUse_shell();
		argv_array generatedArgs = detect.getArgs();
		argv_array generatedEnv_array = detect.getEnv_array();
		if (ssh_variant.variant == ssh_variant.VARIANT_AUTO) {
			child_process detect = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
			detect.setUse_shell(generatedUse_shell);
			detect.setNo_stdin(detect.setNo_stdout(detect.setNo_stderr(1)));
			generatedArgs.argv_array_push(ssh);
			generatedArgs.argv_array_push("-G");
			generatedArgs.push_ssh_options(generatedEnv_array, ssh_variant.VARIANT_SSH, port, protocol_version.version, flags);
			generatedArgs.argv_array_push(ssh_host);
			ssh_variant.variant = detect.run_command() ? ssh_variant.VARIANT_SIMPLE : ssh_variant.VARIANT_SSH;
		} 
		generatedArgs.argv_array_push(ssh);
		generatedArgs.push_ssh_options(generatedEnv_array, ssh_variant.variant, port, protocol_version.version, flags);
		generatedArgs.argv_array_push(ssh_host/*
		 * This returns the dummy child_process `no_fork` if the transport protocol
		 * does not need fork(2), or a struct child_process object if it does.  Once
		 * done, finish the connection with finish_connect() with the value returned
		 * from this function (it is safe to call finish_connect() with NULL to
		 * support the former case).
		 *
		 * If it returns, the connect is successful; it just dies on errors (this
		 * will hopefully be changed in a libification effort, to return NULL when
		 * the connection failed).
		 */);
	}
	public child_process git_connect(Integer fd, Object url, Object prog, int flags) {
		byte hostandport;
		byte path;
		child_process conn = new child_process();
		protocol protocol;
		protocol_version version = ModernizedCProgram.get_protocol_version_config();
		if (protocol_version.version == protocol_version.protocol_v2 && !.strcmp("git-receive-pack", prog)) {
			protocol_version.version = protocol_version.protocol_v0/* Without this we cannot rely on waitpid() to tell
				 * what happened to our children.
				 */;
		} 
		.signal(SIGCHLD, ((__p_sig_fn_t)0));
		protocol.protocol = ModernizedCProgram.parse_connect_url(url, hostandport, path);
		child_process child_process = new child_process();
		argv_array generatedEnv_array = conn.getEnv_array();
		argv_array generatedArgs = conn.getArgs();
		byte generatedBuf = cmd.getBuf();
		int generatedOut = conn.getOut();
		int generatedIn = conn.getIn();
		if ((flags & (-1024 << 1)) && (protocol.protocol != protocol.PROTO_SSH)) {
			.printf("Diag: url=%s\n", url ? url : "NULL");
			.printf("Diag: protocol=%s\n", ModernizedCProgram.prot_name(protocol.protocol));
			.printf("Diag: hostandport=%s\n", hostandport ? hostandport : "NULL");
			.printf("Diag: path=%s\n", path ? path : "NULL");
			conn = ((Object)0);
		}  else if (protocol.protocol == protocol.PROTO_GIT) {
			conn = child_process.git_connect_git(fd, hostandport, path, prog, protocol_version.version, flags);
			conn.setTrace2_child_class("transport/git");
		} else {
				strbuf cmd = new strbuf(, , );
				byte var;
				conn = ModernizedCProgram.xmalloc();
				conn.child_process_init();
				if (ModernizedCProgram.looks_like_command_line_option(path)) {
					ModernizedCProgram.die(ModernizedCProgram._("strange pathname '%s' blocked"), path);
				} 
				cmd.strbuf_addstr(prog);
				cmd.strbuf_addch((byte)' ');
				cmd.sq_quote_buf(path);
				for (var = ModernizedCProgram.local_repo_env; var; /* remove repo-local variables from the environment */var++) {
					generatedEnv_array.argv_array_push(var);
				}
				conn.setUse_shell(1);
				conn.setIn(conn.setOut(-1));
				if (protocol.protocol == protocol.PROTO_SSH) {
					byte ssh_host = hostandport;
					byte port = ((Object)0);
					ModernizedCProgram.transport_check_allowed("ssh");
					ModernizedCProgram.get_host_and_port(ssh_host, ModernizedCProgram.port);
					if (!ModernizedCProgram.port) {
						ModernizedCProgram.port = ModernizedCProgram.get_port(ssh_host);
					} 
					if (flags & (-1024 << 1)) {
						.printf("Diag: url=%s\n", url ? url : "NULL");
						.printf("Diag: protocol=%s\n", ModernizedCProgram.prot_name(protocol.protocol));
						.printf("Diag: userandhost=%s\n", ssh_host ? ssh_host : "NULL");
						.printf("Diag: port=%s\n", ModernizedCProgram.port ? ModernizedCProgram.port : "NONE");
						.printf("Diag: path=%s\n", path ? path : "NULL");
						ModernizedCProgram.free(hostandport);
						ModernizedCProgram.free(path);
						ModernizedCProgram.free(conn);
						cmd.strbuf_release();
						return ((Object)0);
					} 
					conn.setTrace2_child_class("transport/ssh");
					conn.fill_ssh_args(ssh_host, ModernizedCProgram.port, protocol_version.version, flags);
				} else {
						ModernizedCProgram.transport_check_allowed("file");
						conn.setTrace2_child_class("transport/file");
						if (protocol_version.version > 0) {
							generatedEnv_array.argv_array_pushf("GIT_PROTOCOL=version=%d", protocol_version.version);
						} 
				} 
				generatedArgs.argv_array_push(generatedBuf);
				if (conn.start_command()) {
					ModernizedCProgram.die(ModernizedCProgram._("unable to fork"));
				} 
				fd[0] = generatedOut;
				fd[1] = generatedIn;
				cmd.strbuf_release();
		} 
		ModernizedCProgram.free(hostandport);
		ModernizedCProgram.free(path);
		return conn;
	}
	public int finish_connect() {
		int code;
		if (!conn || conn.git_connection_is_socket()) {
			return 0;
		} 
		code = conn.finish_command();
		ModernizedCProgram.free(conn);
		return code;
	}
	public void prepare_pack_objects(Object args) {
		argv_array generatedArgs = this.getArgs();
		generatedArgs.argv_array_push("pack-objects");
		if (args.getWindow()) {
			generatedArgs.argv_array_pushf("--window=%s", args.getWindow());
		} 
		if (args.getWindow_memory()) {
			generatedArgs.argv_array_pushf("--window-memory=%s", args.getWindow_memory());
		} 
		if (args.getDepth()) {
			generatedArgs.argv_array_pushf("--depth=%s", args.getDepth());
		} 
		if (args.getThreads()) {
			generatedArgs.argv_array_pushf("--threads=%s", args.getThreads());
		} 
		if (args.getMax_pack_size()) {
			generatedArgs.argv_array_pushf("--max-pack-size=%s", args.getMax_pack_size());
		} 
		if (args.getNo_reuse_delta()) {
			generatedArgs.argv_array_pushf("--no-reuse-delta");
		} 
		if (args.getNo_reuse_object()) {
			generatedArgs.argv_array_pushf("--no-reuse-object");
		} 
		if (args.getLocal()) {
			generatedArgs.argv_array_push("--local");
		} 
		if (args.getQuiet()) {
			generatedArgs.argv_array_push("--quiet");
		} 
		if (ModernizedCProgram.delta_base_offset) {
			generatedArgs.argv_array_push("--delta-base-offset");
		} 
		generatedArgs.argv_array_push(ModernizedCProgram.packtmp);
		this.setGit_cmd(1);
		this.setOut(-1/*
		 * Write oid to the given struct child_process's stdin, starting it first if
		 * necessary.
		 */);
	}
	public void subprocess_exit_handler() {
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		.close(ModernizedCProgram.process.getIn());
		.close(ModernizedCProgram.process.getOut());
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		/* Finish command will wait until the shutdown is complete. */ModernizedCProgram.process.finish_command();
	}
	public int handshake_version(Object welcome_prefix, Integer versions, int chosen_version) {
		int version_scratch;
		int i;
		byte line;
		byte p;
		if (!chosen_version) {
			chosen_version = version_scratch;
		} 
		if (ModernizedCProgram.packet_write_fmt_gently(ModernizedCProgram.process.getIn(), "%s-client\n", welcome_prefix)) {
			return ();
		} 
		for (i = 0; versions[i]; i++) {
			if (ModernizedCProgram.packet_write_fmt_gently(ModernizedCProgram.process.getIn(), "version=%d\n", versions[i])) {
				return ();
			} 
		}
		if (ModernizedCProgram.packet_flush_gently(ModernizedCProgram.process.getIn())) {
			return ();
		} 
		if (!(line = ModernizedCProgram.packet_read_line(ModernizedCProgram.process.getOut(), ((Object)0))) || !ModernizedCProgram.skip_prefix(line, welcome_prefix, p) || .strcmp(p, "-server")) {
			return ();
		} 
		if (!(line = ModernizedCProgram.packet_read_line(ModernizedCProgram.process.getOut(), ((Object)0))) || !ModernizedCProgram.skip_prefix(line, "version=", p) || ModernizedCProgram.strtol_i(p, 10, chosen_version)) {
			return ();
		} 
		if ((line = ModernizedCProgram.packet_read_line(ModernizedCProgram.process.getOut(), ((Object)0)))) {
			return ();
		} 
		for (i = 0; versions[i]; /* Check to make sure that the version received is supported */i++) {
			if (versions[i] == chosen_version) {
				break;
			} 
		}
		if (!versions[i]) {
			return ();
		} 
		return 0;
	}
	public void child_process_init() {
		.memset(child, 0, );
		argv_array generatedArgs = this.getArgs();
		generatedArgs.argv_array_init();
		argv_array generatedEnv_array = this.getEnv_array();
		generatedEnv_array.argv_array_init();
	}
	public void child_process_clear() {
		argv_array generatedArgs = this.getArgs();
		generatedArgs.argv_array_clear();
		argv_array generatedEnv_array = this.getEnv_array();
		generatedEnv_array.argv_array_clear();
	}
	public void mark_child_for_cleanup(Object pid) {
		child_to_clean p = ModernizedCProgram.xmalloc();
		p.setPid(pid);
		p.setProcess(ModernizedCProgram.process);
		p.setNext(ModernizedCProgram.children_to_clean);
		ModernizedCProgram.children_to_clean = p;
		if (!ModernizedCProgram.installed_child_cleanup_handler) {
			.atexit(cleanup_children_on_exit);
			ModernizedCProgram.sigchain_push_common(cleanup_children_on_signal);
			ModernizedCProgram.installed_child_cleanup_handler = 1;
		} 
	}
	public int start_command() {
		int need_in;
		int need_out;
		int need_err;
		int[] fdin = new int[2];
		int[] fdout = new int[2];
		int[] fderr = new int[2];
		int failed_errno;
		byte str;
		Object generatedArgv = this.getArgv();
		if (!generatedArgv) {
			this.setArgv(generatedArgv);
		} 
		Object generatedEnv = this.getEnv();
		if (!generatedEnv) {
			this.setEnv(generatedArgv);
		} 
		int generatedNo_stdin = this.getNo_stdin();
		int generatedIn = this.getIn();
		need_in = !generatedNo_stdin && generatedIn < 0;
		int generatedOut = this.getOut();
		if (need_in) {
			if (ModernizedCProgram.pipe(fdin) < 0) {
				failed_errno = (._errno());
				if (generatedOut > 0) {
					.close(generatedOut);
				} 
				str = "standard input";
				;
			} 
			this.setIn(fdin[1]);
		} 
		int generatedNo_stdout = this.getNo_stdout();
		int generatedStdout_to_stderr = this.getStdout_to_stderr();
		need_out = !generatedNo_stdout && !generatedStdout_to_stderr && generatedOut < 0;
		if (need_out) {
			if (ModernizedCProgram.pipe(fdout) < 0) {
				failed_errno = (._errno());
				if (need_in) {
					ModernizedCProgram.close_pair(fdin);
				}  else if (generatedIn) {
					.close(generatedIn);
				} 
				str = "standard output";
				;
			} 
			this.setOut(fdout[0]);
		} 
		int generatedNo_stderr = this.getNo_stderr();
		int generatedErr = this.getErr();
		need_err = !generatedNo_stderr && generatedErr < 0;
		(cmd).trace2_child_start_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 735);
		ModernizedCProgram.trace_run_command(cmd);
		.fflush(((Object)0))/*
			 * NOTE: In order to prevent deadlocking when using threads special
			 * care should be taken with the function calls made in between the
			 * fork() and exec() calls.  No calls should be made to functions which
			 * require acquiring a lock (e.g. malloc) as the lock could have been
			 * held by another thread at the time of forking, causing the lock to
			 * never be released in the child process.  This means only
			 * Async-Signal-Safe functions are permitted in the child.
			 *//*
				 * Ensure the default die/error/warn routines do not get
				 * called, they can take stdio locks and malloc.
				 *//*
				 * restore default signal handlers here, in case
				 * we catch a signal right before execve below
				 *//* ignored signals get reset to SIG_DFL on execve *//*
				 * Attempt to exec using the command and arguments starting at
				 * argv.argv[1].  argv.argv[0] contains SHELL_PATH which will
				 * be used in the event exec failed with ENOEXEC at which point
				 * we will try to interpret the command using 'sh'.
				 */;/*
			 * NOTE: In order to prevent deadlocking when using threads special
			 * care should be taken with the function calls made in between the
			 * fork() and exec() calls.  No calls should be made to functions which
			 * require acquiring a lock (e.g. malloc) as the lock could have been
			 * held by another thread at the time of forking, causing the lock to
			 * never be released in the child process.  This means only
			 * Async-Signal-Safe functions are permitted in the child.
			 *//*
				 * Ensure the default die/error/warn routines do not get
				 * called, they can take stdio locks and malloc.
				 *//*
				 * restore default signal handlers here, in case
				 * we catch a signal right before execve below
				 *//* ignored signals get reset to SIG_DFL on execve *//*
				 * Attempt to exec using the command and arguments starting at
				 * argv.argv[1].  argv.argv[0] contains SHELL_PATH which will
				 * be used in the event exec failed with ENOEXEC at which point
				 * we will try to interpret the command using 'sh'.
				 */
		int generatedGit_cmd = this.getGit_cmd();
		int generatedUse_shell = this.getUse_shell();
		Object generatedDir = this.getDir();
		Object generatedPid = this.getPid();
		int generatedSilent_exec_failure = this.getSilent_exec_failure();
		int generatedClean_on_exit = this.getClean_on_exit();
		{ 
			int fhin = 0;
			int fhout = 1;
			int fherr = 2;
			byte sargv = generatedArgv;
			argv_array nargv = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
			if (generatedNo_stdin) {
				fhin = .open("/dev/null", 2);
			}  else if (need_in) {
				fhin = .dup(fdin[0]);
			}  else if (generatedIn) {
				fhin = .dup(generatedIn);
			} 
			if (generatedNo_stderr) {
				fherr = .open("/dev/null", 2);
			}  else if (need_err) {
				fherr = .dup(fderr[1]);
			}  else if (generatedErr > 2) {
				fherr = .dup(generatedErr);
			} 
			if (generatedNo_stdout) {
				fhout = .open("/dev/null", 2);
			}  else if (generatedStdout_to_stderr) {
				fhout = .dup(fherr);
			}  else if (need_out) {
				fhout = .dup(fdout[1]);
			}  else if (generatedOut > 1) {
				fhout = .dup(generatedOut);
			} 
			if (generatedGit_cmd) {
				this.setArgv(nargv.prepare_git_cmd(generatedArgv));
			}  else if (generatedUse_shell) {
				this.setArgv(nargv.prepare_shell_cmd(generatedArgv));
			} 
			this.setPid(ModernizedCProgram.mingw_spawnvpe(generatedArgv[0], generatedArgv, (byte)generatedEnv, generatedDir, fhin, fhout, fherr));
			failed_errno = (._errno());
			if (generatedPid < 0 && (!generatedSilent_exec_failure || (._errno()) != 2)) {
				();
			} 
			if (generatedClean_on_exit && generatedPid >= 0) {
				cmd.mark_child_for_cleanup(generatedPid);
			} 
			nargv.argv_array_clear();
			this.setArgv(sargv);
			if (fhin != 0) {
				.close(fhin);
			} 
			if (fhout != 1) {
				.close(fhout);
			} 
			if (fherr != 2) {
				.close(fherr);
			} 
		}
		/*
			 * Wait for child's exec. If the exec succeeds (or if fork()
			 * failed), EOF is seen immediately by the parent. Otherwise, the
			 * child process sends a child_err struct.
			 * Note that use of this infrastructure is completely advisory,
			 * therefore, we keep error checks minimal.
			 *//*
				 * At this point we know that fork() succeeded, but exec()
				 * failed. Errors have been reported to our stderr.
				 */if (generatedPid < 0) {
			(cmd).trace2_child_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 950, (true));
			if (need_in) {
				ModernizedCProgram.close_pair(fdin);
			}  else if (generatedIn) {
				.close(generatedIn);
			} 
			if (need_out) {
				ModernizedCProgram.close_pair(fdout);
			}  else if (generatedOut) {
				.close(generatedOut);
			} 
			if (need_err) {
				ModernizedCProgram.close_pair(fderr);
			}  else if (generatedErr) {
				.close(generatedErr);
			} 
			cmd.child_process_clear();
			(._errno()) = failed_errno;
			return -1;
		} 
		if (need_in) {
			.close(fdin[0]);
		}  else if (generatedIn) {
			.close(generatedIn);
		} 
		if (need_out) {
			.close(fdout[1]);
		}  else if (generatedOut) {
			.close(generatedOut);
		} 
		if (need_err) {
			.close(fderr[1]);
		}  else if (generatedErr) {
			.close(generatedErr);
		} 
		return 0;
	}
	public int finish_command() {
		Object generatedPid = this.getPid();
		Object generatedArgv = this.getArgv();
		int ret = ModernizedCProgram.wait_or_whine(generatedPid, generatedArgv[0], 0);
		(cmd).trace2_child_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 990, (ret));
		cmd.child_process_clear();
		return ret;
	}
	public int finish_command_in_signal() {
		Object generatedPid = this.getPid();
		Object generatedArgv = this.getArgv();
		int ret = ModernizedCProgram.wait_or_whine(generatedPid, generatedArgv[0], 1);
		(cmd).trace2_child_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 998, (ret));
		return ret;
	}
	public int run_command() {
		int code;
		int generatedOut = this.getOut();
		int generatedErr = this.getErr();
		if (generatedOut < 0 || generatedErr < 0) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\run-command.c", 1008, "run_command with a pipe can cause deadlock");
		} 
		code = cmd.start_command();
		if (code) {
			return code;
		} 
		return cmd.finish_command();
	}
	public int run_command_silent_on_success() {
		strbuf buf = new strbuf(, , );
		int rc;
		this.setStdout_to_stderr(1);
		rc = ModernizedCProgram.pipe_command(cmd, ((Object)0), 0, ((Object)0), 0, buf, 0);
		byte generatedBuf = buf.getBuf();
		if (rc) {
			.fputs(generatedBuf, (_iob[2]));
		} 
		buf.strbuf_release();
		return rc/*
		 * If we are cherry-pick, and if the merge did not result in
		 * hand-editing, we will hit this commit and inherit the original
		 * author date and name.
		 *
		 * If we are revert, or if our cherry-pick results in a hand merge,
		 * we had better say that the current user is responsible for that.
		 *
		 * An exception is when run_git_commit() is called during an
		 * interactive rebase: in that case, we will want to retain the
		 * author metadata.
		 */;
	}
	public child_process subprocess_get_child_process(subprocess_entry entry) {
		child_process generatedProcess = entry.getProcess();
		return generatedProcess;
	}
	public void prepare_push_cert_sha1() {
		int already_done;
		if (!ModernizedCProgram.push_cert.getLen()) {
			return ;
		} 
		if (!already_done) {
			int bogs;
			already_done = 1;
			if (ModernizedCProgram.push_cert_oid.write_object_file(ModernizedCProgram.push_cert.getBuf(), ModernizedCProgram.push_cert.getLen(), "blob")) {
				ModernizedCProgram.push_cert_oid.oidclr();
			} 
			.memset(ModernizedCProgram.sigcheck, (byte)'\0', );
			bogs = ModernizedCProgram.parse_signature(ModernizedCProgram.push_cert.getBuf(), ModernizedCProgram.push_cert.getLen());
			ModernizedCProgram.sigcheck.check_signature(ModernizedCProgram.push_cert.getBuf(), bogs, ModernizedCProgram.push_cert.getBuf() + bogs, ModernizedCProgram.push_cert.getLen() - bogs);
			ModernizedCProgram.nonce_status = ModernizedCProgram.check_nonce(ModernizedCProgram.push_cert.getBuf(), bogs);
		} 
		argv_array generatedEnv_array = this.getEnv_array();
		if (!ModernizedCProgram.is_null_oid(ModernizedCProgram.push_cert_oid)) {
			generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT=%s", ModernizedCProgram.oid_to_hex(ModernizedCProgram.push_cert_oid));
			generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_SIGNER=%s", ModernizedCProgram.sigcheck.getSigner() ? ModernizedCProgram.sigcheck.getSigner() : "");
			generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_KEY=%s", ModernizedCProgram.sigcheck.getKey() ? ModernizedCProgram.sigcheck.getKey() : "");
			generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_STATUS=%c", ModernizedCProgram.sigcheck.getResult());
			if (ModernizedCProgram.push_cert_nonce) {
				generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_NONCE=%s", ModernizedCProgram.push_cert_nonce);
				generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_NONCE_STATUS=%s", ModernizedCProgram.nonce_status);
				if (ModernizedCProgram.nonce_status == ModernizedCProgram.NONCE_SLOP) {
					generatedEnv_array.argv_array_pushf("GIT_PUSH_CERT_NONCE_SLOP=%ld", ModernizedCProgram.nonce_stamp_slop);
				} 
			} 
		} 
	}
	public void fill_alternate_refs_command(Object repo_path) {
		byte value;
		argv_array generatedArgs = this.getArgs();
		if (!.git_config_get_value("core.alternateRefsCommand", value)) {
			this.setUse_shell(1);
			generatedArgs.argv_array_push(value);
			generatedArgs.argv_array_push(repo_path);
		} else {
				this.setGit_cmd(1);
				generatedArgs.argv_array_pushf("--git-dir=%s", repo_path);
				generatedArgs.argv_array_push("for-each-ref");
				generatedArgs.argv_array_push("--format=%(objectname)");
				if (!.git_config_get_value("core.alternateRefsPrefixes", value)) {
					generatedArgs.argv_array_push("--");
					generatedArgs.argv_array_split(value);
				} 
		} 
		this.setEnv(ModernizedCProgram.local_repo_env);
		this.setOut(-1);
	}
	public int run_service_command() {
		argv_array generatedArgs = this.getArgs();
		generatedArgs.argv_array_push(".");
		this.setGit_cmd(1);
		this.setErr(-1);
		if (cld.start_command()) {
			return -1;
		} 
		.close(0);
		.close(1);
		int generatedErr = this.getErr();
		ModernizedCProgram.copy_to_log(generatedErr);
		return cld.finish_command();
	}
	public child_process get_helper(transport transport) {
		Object generatedData = transport.getData();
		helper_data data = generatedData;
		strbuf buf = new strbuf(, , );
		child_process helper = new child_process();
		int duped;
		int code;
		child_process generatedHelper = data.getHelper();
		if (generatedHelper) {
			return generatedHelper;
		} 
		helper = ModernizedCProgram.xmalloc();
		helper.child_process_init();
		helper.setIn(-1);
		helper.setOut(-1);
		helper.setErr(0);
		argv_array generatedArgs = helper.getArgs();
		Object generatedName = data.getName();
		generatedArgs.argv_array_pushf("git-remote-%s", generatedName);
		generatedArgs.argv_array_push(generatedName);
		Object generatedUrl = transport.getUrl();
		generatedArgs.argv_array_push(ModernizedCProgram.remove_ext_force(generatedUrl));
		helper.setGit_cmd(0);
		helper.setSilent_exec_failure(1);
		argv_array generatedEnv_array = helper.getEnv_array();
		if (ModernizedCProgram.have_git_dir()) {
			generatedEnv_array.argv_array_pushf("%s=%s", "GIT_DIR", ModernizedCProgram.get_git_dir());
		} 
		Object generatedArgv = generatedArgs.getArgv();
		helper.setTrace2_child_class(generatedArgv[/* "remote-<name>" */0]);
		code = helper.start_command();
		if (code < 0 && (._errno()) == 2) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to find remote helper for '%s'"), generatedName);
		}  else if (code != 0) {
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport-helper.c", 146, (code)));
		} 
		data.setHelper(helper);
		data.setNo_disconnect_req(0);
		refspec generatedRs = data.getRs();
		generatedRs.refspec_init(1/*
			 * Open the output as FILE* so strbuf_getline_*() family of
			 * functions can be used.
			 * Do this with duped fd because fclose() will close the fd,
			 * and stuff like taking over will require the fd to remain.
			 */);
		int generatedOut = helper.getOut();
		duped = .dup(generatedOut);
		if (duped < 0) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("can't dup helper output fd"));
		} 
		data.setOut(ModernizedCProgram.xfdopen(duped, "r"));
		int generatedIn = helper.getIn();
		ModernizedCProgram.write_constant(generatedIn, "capabilities\n");
		byte generatedBuf = buf.getBuf();
		while (1) {
			byte capname;
			byte arg;
			int mandatory = 0;
			if (ModernizedCProgram.recvline(data, buf)) {
				.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport-helper.c", 169, (true)));
			} 
			if (!generatedBuf) {
				break;
			} 
			if (generatedBuf == (byte)'*') {
				capname = generatedBuf + 1;
				mandatory = 1;
			} else {
					capname = generatedBuf;
			} 
			if (ModernizedCProgram.debug) {
				.fprintf((_iob[2]), "Debug: Got cap %s\n", capname);
			} 
			if (!.strcmp(capname, "fetch")) {
				data.setFetch(1);
			}  else if (!.strcmp(capname, "option")) {
				data.setOption(1);
			}  else if (!.strcmp(capname, "push")) {
				data.setPush(1);
			}  else if (!.strcmp(capname, "import")) {
				data.setImport(1);
			}  else if (!.strcmp(capname, "bidi-import")) {
				data.setBidi_import(1);
			}  else if (!.strcmp(capname, "export")) {
				data.setExport(1);
			}  else if (!.strcmp(capname, "check-connectivity")) {
				data.setCheck_connectivity(1);
			}  else if (ModernizedCProgram.skip_prefix(capname, "refspec ", arg)) {
				generatedRs.refspec_append(arg);
			}  else if (!.strcmp(capname, "connect")) {
				data.setConnect(1);
			}  else if (!.strcmp(capname, "stateless-connect")) {
				data.setStateless_connect(1);
			}  else if (!.strcmp(capname, "signed-tags")) {
				data.setSigned_tags(1);
			}  else if (ModernizedCProgram.skip_prefix(capname, "export-marks ", arg)) {
				data.setExport_marks(ModernizedCProgram.xstrdup(arg));
			}  else if (ModernizedCProgram.skip_prefix(capname, "import-marks ", arg)) {
				data.setImport_marks(ModernizedCProgram.xstrdup(arg));
			}  else if (ModernizedCProgram.starts_with(capname, "no-private-update")) {
				data.setNo_private_update(1);
			}  else if (mandatory) {
				ModernizedCProgram.die(ModernizedCProgram._("unknown mandatory capability %s; this remote helper probably needs newer version of Git"), capname);
			} 
		}
		int generatedNr = generatedRs.getNr();
		int generatedImport = data.getImport();
		int generatedBidi_import = data.getBidi_import();
		int generatedExport = data.getExport();
		if (!generatedNr && (generatedImport || generatedBidi_import || generatedExport)) {
			ModernizedCProgram.warning(ModernizedCProgram._("this remote helper should implement refspec capability"));
		} 
		buf.strbuf_release();
		if (ModernizedCProgram.debug) {
			.fprintf((_iob[2]), "Debug: Capabilities complete.\n");
		} 
		transport.standard_options();
		return generatedHelper;
	}
	public void prepare_pager_args(Object pager) {
		ModernizedCProgram.pager_process.getArgs().argv_array_push(pager);
		ModernizedCProgram.pager_process.setUse_shell(1);
		ModernizedCProgram.pager_process.getEnv_array().setup_pager_env();
		ModernizedCProgram.pager_process.setTrace2_child_class("pager");
	}
	public Object getArgv() {
		return argv;
	}
	public void setArgv(Object newArgv) {
		argv = newArgv;
	}
	public argv_array getArgs() {
		return args;
	}
	public void setArgs(argv_array newArgs) {
		args = newArgs;
	}
	public argv_array getEnv_array() {
		return env_array;
	}
	public void setEnv_array(argv_array newEnv_array) {
		env_array = newEnv_array;
	}
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public int getTrace2_child_id() {
		return trace2_child_id;
	}
	public void setTrace2_child_id(int newTrace2_child_id) {
		trace2_child_id = newTrace2_child_id;
	}
	public Object getTrace2_child_us_start() {
		return trace2_child_us_start;
	}
	public void setTrace2_child_us_start(Object newTrace2_child_us_start) {
		trace2_child_us_start = newTrace2_child_us_start;
	}
	public Object getTrace2_child_class() {
		return trace2_child_class;
	}
	public void setTrace2_child_class(Object newTrace2_child_class) {
		trace2_child_class = newTrace2_child_class;
	}
	public Object getTrace2_hook_name() {
		return trace2_hook_name;
	}
	public void setTrace2_hook_name(Object newTrace2_hook_name) {
		trace2_hook_name = newTrace2_hook_name;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int newIn) {
		in = newIn;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int newOut) {
		out = newOut;
	}
	public int getErr() {
		return err;
	}
	public void setErr(int newErr) {
		err = newErr;
	}
	public Object getDir() {
		return dir;
	}
	public void setDir(Object newDir) {
		dir = newDir;
	}
	public Object getEnv() {
		return env;
	}
	public void setEnv(Object newEnv) {
		env = newEnv;
	}
	public int getNo_stdin() {
		return no_stdin;
	}
	public void setNo_stdin(int newNo_stdin) {
		no_stdin = newNo_stdin;
	}
	public int getNo_stdout() {
		return no_stdout;
	}
	public void setNo_stdout(int newNo_stdout) {
		no_stdout = newNo_stdout;
	}
	public int getNo_stderr() {
		return no_stderr;
	}
	public void setNo_stderr(int newNo_stderr) {
		no_stderr = newNo_stderr;
	}
	public int getGit_cmd() {
		return git_cmd;
	}
	public void setGit_cmd(int newGit_cmd) {
		git_cmd = newGit_cmd;
	}
	public int getSilent_exec_failure() {
		return silent_exec_failure;
	}
	public void setSilent_exec_failure(int newSilent_exec_failure) {
		silent_exec_failure = newSilent_exec_failure;
	}
	public int getStdout_to_stderr() {
		return stdout_to_stderr;
	}
	public void setStdout_to_stderr(int newStdout_to_stderr) {
		stdout_to_stderr = newStdout_to_stderr;
	}
	public int getUse_shell() {
		return use_shell;
	}
	public void setUse_shell(int newUse_shell) {
		use_shell = newUse_shell;
	}
	public int getClean_on_exit() {
		return clean_on_exit;
	}
	public void setClean_on_exit(int newClean_on_exit) {
		clean_on_exit = newClean_on_exit;
	}
	public int getWait_after_clean() {
		return wait_after_clean;
	}
	public void setWait_after_clean(int newWait_after_clean) {
		wait_after_clean = newWait_after_clean;
	}
	public Object getClean_on_exit_handler() {
		return clean_on_exit_handler;
	}
	public void setClean_on_exit_handler(Object newClean_on_exit_handler) {
		clean_on_exit_handler = newClean_on_exit_handler;
	}
	public Object getClean_on_exit_handler_cbdata() {
		return clean_on_exit_handler_cbdata;
	}
	public void setClean_on_exit_handler_cbdata(Object newClean_on_exit_handler_cbdata) {
		clean_on_exit_handler_cbdata = newClean_on_exit_handler_cbdata;
	}
}
/**
 * This callback is called whenever there are problems starting
 * a new process.
 *
 * You must not write to stdout or stderr in this function. Add your
 * message to the strbuf out instead, which will be printed without
 * messing up the output of the other parallel processes.
 *
 * pp_cb is the callback cookie as passed into run_processes_parallel,
 * pp_task_cb is the callback cookie as passed into get_next_task_fn.
 *
 * Return 0 to continue the parallel processing. To abort return non zero.
 * To send a signal to other child processes for abortion, return
 * the negative signal number.
 */
/**
 * This callback is called on every child process that finished processing.
 *
 * You must not write to stdout or stderr in this function. Add your
 * message to the strbuf out instead, which will be printed without
 * messing up the output of the other parallel processes.
 *
 * pp_cb is the callback cookie as passed into run_processes_parallel,
 * pp_task_cb is the callback cookie as passed into get_next_task_fn.
 *
 * Return 0 to continue the parallel processing.  To abort return non zero.
 * To send a signal to other child processes for abortion, return
 * the negative signal number.
 */
