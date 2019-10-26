package application;

/* Returns a transport suitable for the url */
public class transport {
	private Object vtable;
	private remote remote;
	private Object url;
	private Object data;
	private Object remote_refs;
	private int got_remote_refs;
	private int cannot_reuse;
	private int cloning;
	private int stateless_rpc;
	private Object push_options;
	private Object server_options;
	private Byte pack_lockfile;
	private int verbose;
	private int progress;
	private git_transport_options smart_options;
	private transport_family family;
	
	public transport(Object vtable, remote remote, Object url, Object data, Object remote_refs, int got_remote_refs, int cannot_reuse, int cloning, int stateless_rpc, Object push_options, Object server_options, Byte pack_lockfile, int verbose, int progress, git_transport_options smart_options, transport_family family) {
		setVtable(vtable);
		setRemote(remote);
		setUrl(url);
		setData(data);
		setRemote_refs(remote_refs);
		setGot_remote_refs(got_remote_refs);
		setCannot_reuse(cannot_reuse);
		setCloning(cloning);
		setStateless_rpc(stateless_rpc);
		setPush_options(push_options);
		setServer_options(server_options);
		setPack_lockfile(pack_lockfile);
		setVerbose(verbose);
		setProgress(progress);
		setSmart_options(smart_options);
		setFamily(family);
	}
	public transport() {
	}
	
	public void set_option(Object name, Object value) {
		int r = transport.transport_set_option(name, value);
		Object generatedUrl = this.getUrl();
		if (r < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("Option \"%s\" value \"%s\" is not valid for %s"), name, value, generatedUrl);
		} 
		if (r > 0) {
			ModernizedCProgram.warning(ModernizedCProgram._("Option \"%s\" is ignored for %s\n"), name, generatedUrl);
		} 
		byte generatedBuf = val.getBuf();
		string_list_item string_list_item = new string_list_item();
		if (!.strcmp(name, "verbosity")) {
			byte end;
			int v = .strtol(value, end, 10);
			if (value == end || end) {
				return -1;
			} 
			ModernizedCProgram.options.setVerbosity(v);
			return 0;
		}  else if (!.strcmp(name, "progress")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setProgress(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setProgress(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "depth")) {
			byte end;
			long v = .strtoul(value, end, 10);
			if (value == end || end) {
				return -1;
			} 
			ModernizedCProgram.options.setDepth(v);
			return 0;
		}  else if (!.strcmp(name, "deepen-since")) {
			ModernizedCProgram.options.setDeepen_since(ModernizedCProgram.xstrdup(value));
			return 0;
		}  else if (!.strcmp(name, "deepen-not")) {
			ModernizedCProgram.options.getDeepen_not().string_list_append(value);
			return 0;
		}  else if (!.strcmp(name, "deepen-relative")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setDeepen_relative(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setDeepen_relative(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "followtags")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setFollowtags(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setFollowtags(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "dry-run")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setDry_run(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setDry_run(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "check-connectivity")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setCheck_self_contained_and_connected(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setCheck_self_contained_and_connected(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "cas")) {
			strbuf val = new strbuf(, , );
			val.strbuf_addf("--force-with-lease=%s", value);
			ModernizedCProgram.cas_options.string_list_append(generatedBuf);
			val.strbuf_release();
			return 0;
		}  else if (!.strcmp(name, "cloning")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setCloning(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setCloning(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "update-shallow")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setUpdate_shallow(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setUpdate_shallow(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "pushcert")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setPush_cert(2);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setPush_cert(0);
			}  else if (!.strcmp(value, "if-asked")) {
				ModernizedCProgram.options.setPush_cert(1);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "atomic")) {
			if (!.strcmp(value, "true")) {
				ModernizedCProgram.options.setAtomic(1);
			}  else if (!.strcmp(value, "false")) {
				ModernizedCProgram.options.setAtomic(0);
			} else {
					return -1;
			} 
			return 0;
		}  else if (!.strcmp(name, "push-option")) {
			if (value != (byte)'"') {
				ModernizedCProgram.options.getPush_options().string_list_append(value);
			} else {
					strbuf unquoted = new strbuf(, , );
					if (unquoted.unquote_c_style(value, ((Object)0)) < 0) {
						ModernizedCProgram.die(ModernizedCProgram._("invalid quoting in push-option value: '%s'"), value);
					} 
					string_list_item.string_list_append_nodup(ModernizedCProgram.options.getPush_options(), unquoted.strbuf_detach(((Object)0)));
			} 
			return 0;
		}  else if (!.strcmp(name, /* LIBCURL_VERSION_NUM >= 0x070a08 */"from-promisor")) {
			ModernizedCProgram.options.setFrom_promisor(1);
			return 0;
		}  else if (!.strcmp(name, "no-dependents")) {
			ModernizedCProgram.options.setNo_dependents(1);
			return 0;
		}  else if (!.strcmp(name, "filter")) {
			ModernizedCProgram.options.setFilter(ModernizedCProgram.xstrdup(value));
			return 0;
		} else {
				return /* unsupported */1;
		} 
	}
	public transport prepare_transport(remote remote, int deepen) {
		transport transport = new transport();
		transport transport = new transport();
		transport = transport.transport_get(remote, ((Object)0));
		transport.transport_set_verbosity(ModernizedCProgram.verbosity, ModernizedCProgram.progress);
		transport.setFamily(transport_family.family);
		if (ModernizedCProgram.upload_pack) {
			transport.set_option("uploadpack", ModernizedCProgram.upload_pack);
		} 
		if (ModernizedCProgram.keep) {
			transport.set_option("keep", "yes");
		} 
		if (ModernizedCProgram.depth) {
			transport.set_option("depth", ModernizedCProgram.depth);
		} 
		if (deepen && ModernizedCProgram.deepen_since) {
			transport.set_option("deepen-since", ModernizedCProgram.deepen_since);
		} 
		if (deepen && ModernizedCProgram.deepen_not.getNr()) {
			transport.set_option("deepen-not", (byte)ModernizedCProgram.deepen_not);
		} 
		if (ModernizedCProgram.deepen_relative) {
			transport.set_option("deepen-relative", "yes");
		} 
		if (ModernizedCProgram.update_shallow) {
			transport.set_option("updateshallow", "yes");
		} 
		if (ModernizedCProgram.filter_options.getChoice()) {
			byte spec = ModernizedCProgram.filter_options.expand_list_objects_filter_spec();
			transport.set_option("filter", spec);
			transport.set_option("from-promisor", "1");
		} 
		git_transport_options generatedSmart_options = transport.getSmart_options();
		if (ModernizedCProgram.negotiation_tip.getNr()) {
			if (generatedSmart_options) {
				generatedSmart_options.add_negotiation_tips();
			} else {
					ModernizedCProgram.warning("Ignoring --negotiation-tip because the protocol does not support it.");
			} 
		} 
		return transport;
	}
	public int close_bundle() {
		Object generatedData = this.getData();
		bundle_transport_data data = generatedData;
		int generatedFd = data.getFd();
		if (generatedFd > 0) {
			.close(generatedFd);
		} 
		ModernizedCProgram.free(data);
		return 0;
	}
	public int connect_setup(int for_push) {
		Object generatedData = this.getData();
		git_transport_data data = generatedData;
		int generatedVerbose = this.getVerbose();
		int flags = generatedVerbose > 0 ? (-1024 << 0) : 0;
		child_process generatedConn = data.getConn();
		if (generatedConn) {
			return 0;
		} 
		transport_family generatedFamily = this.getFamily();
		switch (generatedFamily) {
		case transport_family.TRANSPORT_FAMILY_ALL:
				break;
		case transport_family.TRANSPORT_FAMILY_IPV6:
				flags |=  (-1024 << 3);
				break;
		case transport_family.TRANSPORT_FAMILY_IPV4:
				flags |=  (-1024 << 2);
				break;
		}
		Object generatedFd = data.getFd();
		Object generatedUrl = this.getUrl();
		git_transport_options generatedOptions = data.getOptions();
		Object generatedReceivepack = generatedOptions.getReceivepack();
		Object generatedUploadpack = generatedOptions.getUploadpack();
		child_process child_process = new child_process();
		data.setConn(child_process.git_connect(generatedFd, generatedUrl, for_push ? generatedReceivepack : generatedUploadpack, flags));
		return 0;
	}
	public void die_if_server_options() {
		Object generatedServer_options = this.getServer_options();
		if (!generatedServer_options || !generatedServer_options.getNr()) {
			return ;
		} 
		ModernizedCProgram.advise(ModernizedCProgram._("see protocol.version in 'git help config' for more details"));
		ModernizedCProgram.die(ModernizedCProgram._("server options require protocol version 2 or later"/*
		 * Obtains the protocol version from the transport and writes it to
		 * transport->data->version, first connecting if not already connected.
		 *
		 * If the protocol version is one that allows skipping the listing of remote
		 * refs, and must_list_refs is 0, the listing of remote refs is skipped and
		 * this function returns NULL. Otherwise, this function returns the list of
		 * remote refs.
		 */));
	}
	public int connect_git(Object name, Object executable, Integer fd) {
		Object generatedData = this.getData();
		git_transport_data data = generatedData;
		Object generatedFd = data.getFd();
		Object generatedUrl = this.getUrl();
		child_process child_process = new child_process();
		data.setConn(child_process.git_connect(generatedFd, generatedUrl, executable, 0));
		fd[0] = generatedFd[0];
		fd[1] = generatedFd[1];
		return 0;
	}
	public int disconnect_git() {
		Object generatedData = this.getData();
		git_transport_data data = generatedData;
		child_process generatedConn = data.getConn();
		int generatedGot_remote_heads = data.getGot_remote_heads();
		Object generatedFd = data.getFd();
		if (generatedConn) {
			if (generatedGot_remote_heads) {
				ModernizedCProgram.packet_flush(generatedFd[1]);
			} 
			.close(generatedFd[0]);
			.close(generatedFd[1]);
			generatedConn.finish_connect();
		} 
		ModernizedCProgram.free(data);
		return 0;
	}
	public transport transport_get(remote remote, Object url) {
		byte helper;
		transport ret = ModernizedCProgram.xcalloc(1, );
		ret.setProgress(.isatty(2));
		if (!remote) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\transport.c", 926, "No remote provided to transport_get()");
		} 
		ret.setGot_remote_refs(0);
		ret.setRemote(remote);
		Object generatedForeign_vcs = remote.getForeign_vcs();
		helper = generatedForeign_vcs;
		Object generatedUrl = remote.getUrl();
		if (!url && generatedUrl) {
			url = generatedUrl[0];
		} 
		ret.setUrl(url);
		if (/* maybe it is a foreign URL? */url) {
			byte p = url;
			while (ModernizedCProgram.is_urlschemechar(p == url, p)) {
				p++;
			}
			if (ModernizedCProgram.starts_with(p, "::")) {
				helper = ModernizedCProgram.xstrndup(url, p - url);
			} 
		} 
		git_transport_options generatedOptions = data.getOptions();
		if (helper) {
			ret.transport_helper_init(helper);
		}  else if (ModernizedCProgram.starts_with(url, "rsync:")) {
			ModernizedCProgram.die(ModernizedCProgram._("git-over-rsync is no longer supported"));
		}  else if (ModernizedCProgram.url_is_local_not_ssh(url) && ModernizedCProgram.is_file(url) && .is_bundle(url, 1)) {
			bundle_transport_data data = ModernizedCProgram.xcalloc(1, );
			ModernizedCProgram.transport_check_allowed("file");
			ret.setData(data);
			ret.setVtable(ModernizedCProgram.bundle_vtable);
			ret.setSmart_options(((Object)0));
		}  else if (!ModernizedCProgram.is_url(url) || ModernizedCProgram.starts_with(url, "file://") || ModernizedCProgram.starts_with(url, "git://") || ModernizedCProgram.starts_with(url, "ssh://") || ModernizedCProgram.starts_with(url, /* deprecated - do not use */"git+ssh://") || ModernizedCProgram.starts_with(url, /* deprecated - do not use */"ssh+git://"/*
				 * These are builtin smart transports; "allowed" transports
				 * will be checked individually in git_connect.
				 */)) {
			git_transport_data data = ModernizedCProgram.xcalloc(1, );
			ret.setData(data);
			ret.setVtable(ModernizedCProgram.builtin_smart_vtable);
			ret.setSmart_options((generatedOptions));
			data.setConn(((Object)0));
			data.setGot_remote_heads(0);
		} else {
				int len = ModernizedCProgram.external_specification_len(/* Unknown protocol in URL. Pass to external handler. */url);
				byte handler = ModernizedCProgram.xmemdupz(url, ModernizedCProgram.len);
				ret.transport_helper_init(handler);
		} 
		git_transport_options generatedSmart_options = ret.getSmart_options();
		Object generatedUploadpack = remote.getUploadpack();
		Object generatedReceivepack = remote.getReceivepack();
		if (generatedSmart_options) {
			generatedSmart_options.setThin(1);
			generatedSmart_options.setUploadpack("git-upload-pack");
			if (generatedUploadpack) {
				generatedSmart_options.setUploadpack(generatedUploadpack);
			} 
			generatedSmart_options.setReceivepack("git-receive-pack");
			if (generatedReceivepack) {
				generatedSmart_options.setReceivepack(generatedReceivepack);
			} 
		} 
		return ret;
	}
	public int transport_set_option(Object name, Object value) {
		int git_reports = 1;
		int protocol_reports = 1;
		git_transport_options generatedSmart_options = this.getSmart_options();
		if (generatedSmart_options) {
			git_reports = generatedSmart_options.set_git_option(name, value);
		} 
		Object generatedVtable = this.getVtable();
		if (generatedVtable.getSet_option()) {
			protocol_reports = .UNRECOGNIZEDFUNCTIONNAME(transport, name, value);
		} 
		if (!git_reports || !/* If either report is 0, report 0 (success). */protocol_reports) {
			return 0;
		} 
		if ((git_reports == -1) || (protocol_reports == -/* If either reports -1 (invalid value), report -1. */1)) {
			return -1;
		} 
		return /* Otherwise if both report unknown, report unknown. */1;
	}
	public void transport_set_verbosity(int verbosity, int force_progress) {
		if (verbosity >= 1) {
			this.setVerbose(verbosity <= 3 ? verbosity : 3);
		} 
		if (verbosity < 0) {
			this.setVerbose(-1/**
				 * Rules used to determine whether to report progress (processing aborts
				 * when a rule is satisfied):
				 *
				 *   . Report progress, if force_progress is 1 (ie. --progress).
				 *   . Don't report progress, if force_progress is 0 (ie. --no-progress).
				 *   . Don't report progress, if verbosity < 0 (ie. -q/--quiet ).
				 *   . Report progress if isatty(2) is 1.
				 **/);
		} 
		if (force_progress >= 0) {
			this.setProgress(!!force_progress);
		} else {
				this.setProgress(verbosity >= 0 && .isatty(2));
		} 
	}
	public Object transport_get_remote_refs(Object ref_prefixes) {
		int generatedGot_remote_refs = this.getGot_remote_refs();
		if (!generatedGot_remote_refs) {
			this.setRemote_refs(.UNRECOGNIZEDFUNCTIONNAME(transport, 0, ref_prefixes));
			this.setGot_remote_refs(1);
		} 
		Object generatedRemote_refs = this.getRemote_refs();
		return generatedRemote_refs;
	}
	public void transport_unlock_pack() {
		Byte generatedPack_lockfile = this.getPack_lockfile();
		if (generatedPack_lockfile) {
			ModernizedCProgram.unlink_or_warn(generatedPack_lockfile);
			do {
				ModernizedCProgram.free(generatedPack_lockfile);
				(generatedPack_lockfile) = ((Object)0);
			} while (0);
		} 
	}
	public int transport_connect(Object name, Object exec, Integer fd) {
		Object generatedVtable = this.getVtable();
		if (generatedVtable.getConnect()) {
			return .UNRECOGNIZEDFUNCTIONNAME(transport, name, exec, fd);
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("operation not supported by protocol"));
		} 
	}
	public int transport_disconnect() {
		int ret = 0;
		Object generatedVtable = this.getVtable();
		if (generatedVtable.getDisconnect()) {
			ret = .UNRECOGNIZEDFUNCTIONNAME(transport);
		} 
		ModernizedCProgram.free(transport);
		return ret/*
		 * Strip username (and password) from a URL and return
		 * it in a newly allocated string.
		 */;
	}
	public void update_remote_refs(Object refs, Object mapped_refs, Object remote_head_points_at, Object branch_top, Object msg, int check_connectivity, int check_refs_only) {
		ref rm = mapped_refs;
		int generatedProgress = this.getProgress();
		if (check_connectivity) {
			check_connected_options opt = new check_connected_options(0);
			opt.setTransport(transport);
			opt.setProgress(generatedProgress);
			opt.setCheck_refs_only(!!check_refs_only);
			if (opt.check_connected(iterate_ref_map, rm)) {
				ModernizedCProgram.die(ModernizedCProgram._("remote did not send all necessary objects"));
			} 
		} 
		if (refs) {
			ModernizedCProgram.write_remote_refs(mapped_refs);
			if (ModernizedCProgram.option_single_branch && !ModernizedCProgram.option_no_tags) {
				ModernizedCProgram.write_followtags(refs, msg);
			} 
		} 
		if (remote_head_points_at && !ModernizedCProgram.option_bare) {
			strbuf head_ref = new strbuf(, , );
			ModernizedCProgram.head_ref.strbuf_addstr(branch_top);
			ModernizedCProgram.head_ref.strbuf_addstr("HEAD");
			if (ModernizedCProgram.create_symref(ModernizedCProgram.head_ref.getBuf(), remote_head_points_at.getPeer_ref().getName(), msg) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to update %s"), ModernizedCProgram.head_ref.getBuf());
			} 
			ModernizedCProgram.head_ref.strbuf_release();
		} 
	}
	public void do_take_over() {
		helper_data data = new helper_data();
		Object generatedData = this.getData();
		data = (helper_data)generatedData;
		child_process generatedHelper = data.getHelper();
		ModernizedCProgram.transport_take_over(transport, generatedHelper);
		_iobuf generatedOut = data.getOut();
		.fclose(generatedOut);
		ModernizedCProgram.free(data);
	}
	public int disconnect_helper() {
		Object generatedData = this.getData();
		helper_data data = generatedData;
		int res = 0;
		child_process generatedHelper = data.getHelper();
		int generatedNo_disconnect_req = data.getNo_disconnect_req();
		int generatedIn = generatedHelper.getIn();
		int generatedOut = generatedHelper.getOut();
		if (generatedHelper) {
			if (ModernizedCProgram.debug) {
				.fprintf((_iob[2]), "Debug: Disconnecting.\n");
			} 
			if (!generatedNo_disconnect_req) {
				ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
				ModernizedCProgram.xwrite(generatedIn, "\n", 1);
				ModernizedCProgram.sigchain_pop(SIGPIPE);
			} 
			.close(generatedIn);
			.close(generatedOut);
			.fclose(generatedOut);
			res = generatedHelper.finish_command();
			do {
				ModernizedCProgram.free(generatedHelper);
				(generatedHelper) = ((Object)0);
			} while (0);
		} 
		return res;
	}
	public int set_helper_option(Object name, Object value) {
		Object generatedData = this.getData();
		helper_data data = generatedData;
		strbuf buf = new strbuf(, , );
		int i;
		int ret;
		int is_bool = 0;
		child_process child_process = new child_process();
		child_process.get_helper(transport);
		int generatedOption = data.getOption();
		if (!generatedOption) {
			return 1;
		} 
		if (!.strcmp(name, "deepen-not")) {
			return ModernizedCProgram.string_list_set_helper_option(data, name, (string_list)value);
		} 
		for (i = 0; i < ( /  + ( - 1)); i++) {
			if (!.strcmp(name, ModernizedCProgram.unsupported_options[i])) {
				return 1;
			} 
		}
		for (i = 0; i < ( /  + ( - 1)); i++) {
			if (!.strcmp(name, ModernizedCProgram.boolean_options[i])) {
				is_bool = 1;
				break;
			} 
		}
		buf.strbuf_addf("option %s ", name);
		if (is_bool) {
			buf.strbuf_addstr(value ? "true" : "false");
		} else {
				ModernizedCProgram.quote_c_style(value, buf, ((Object)0), 0);
		} 
		buf.strbuf_addch((byte)'\n');
		ret = ModernizedCProgram.strbuf_set_helper_option(data, buf);
		buf.strbuf_release();
		return ret;
	}
	public void standard_options() {
		byte[] buf = new byte[16];
		int generatedVerbose = this.getVerbose();
		int v = generatedVerbose;
		int generatedProgress = this.getProgress();
		t.set_helper_option("progress", generatedProgress ? "true" : "false");
		ModernizedCProgram.xsnprintf(buf, , "%d", v + 1);
		t.set_helper_option("verbosity", buf);
		transport_family generatedFamily = this.getFamily();
		switch (generatedFamily) {
		case transport_family.TRANSPORT_FAMILY_IPV4:
				t.set_helper_option("family", "ipv4");
				break;
		case transport_family.TRANSPORT_FAMILY_IPV6:
				t.set_helper_option("family", "ipv6");
				break;
		case transport_family.TRANSPORT_FAMILY_ALL/*
				 * this is already the default,
				 * do not break old remote helpers by setting "all" here
				 */:
				break;
		}
	}
	public int release_helper() {
		int res = 0;
		Object generatedData = this.getData();
		helper_data data = generatedData;
		refspec generatedRs = data.getRs();
		generatedRs.refspec_clear();
		res = transport.disconnect_helper();
		ModernizedCProgram.free(generatedData);
		return res;
	}
	public int process_connect_service(Object name, Object exec) {
		Object generatedData = this.getData();
		helper_data data = generatedData;
		strbuf cmdbuf = new strbuf(, , );
		int ret = 0/*
			 * Handle --upload-pack and friends. This is fire and forget...
			 * just warn if it fails.
			 */;
		if (.strcmp(name, exec)) {
			int r = transport.set_helper_option("servpath", exec);
			if (r > 0) {
				ModernizedCProgram.warning(ModernizedCProgram._("setting remote service path not supported by protocol"));
			}  else if (r < 0) {
				ModernizedCProgram.warning(ModernizedCProgram._("invalid remote service path"));
			} 
		} 
		int generatedConnect = data.getConnect();
		int generatedStateless_connect = data.getStateless_connect();
		if (generatedConnect) {
			cmdbuf.strbuf_addf("connect %s\n", name);
			ret = ModernizedCProgram.run_connect(transport, cmdbuf);
		}  else if (generatedStateless_connect && (ModernizedCProgram.get_protocol_version_config() == protocol_version.protocol_v2) && !.strcmp("git-upload-pack", name)) {
			cmdbuf.strbuf_addf("stateless-connect %s\n", name);
			ret = ModernizedCProgram.run_connect(transport, cmdbuf);
			if (ret) {
				this.setStateless_rpc(1);
			} 
		} 
		cmdbuf.strbuf_release();
		return ret;
	}
	public int process_connect(int for_push) {
		Object generatedData = this.getData();
		helper_data data = generatedData;
		byte name;
		byte exec;
		name = for_push ? "git-receive-pack" : "git-upload-pack";
		git_transport_options generatedTransport_options = data.getTransport_options();
		Object generatedReceivepack = generatedTransport_options.getReceivepack();
		Object generatedUploadpack = generatedTransport_options.getUploadpack();
		if (for_push) {
			exec = generatedReceivepack;
		} else {
				exec = generatedUploadpack;
		} 
		return transport.process_connect_service(name, exec);
	}
	public int connect_helper(Object name, Object exec, Integer fd) {
		Object generatedData = this.getData();
		helper_data data = generatedData;
		child_process child_process = new child_process();
		child_process.get_helper(/* Get_helper so connect is inited. */transport);
		int generatedConnect = data.getConnect();
		if (!generatedConnect) {
			ModernizedCProgram.die(ModernizedCProgram._("operation not supported by protocol"));
		} 
		if (!transport.process_connect_service(name, exec)) {
			ModernizedCProgram.die(ModernizedCProgram._("can't connect to subservice %s"), name);
		} 
		child_process generatedHelper = data.getHelper();
		int generatedOut = generatedHelper.getOut();
		fd[0] = generatedOut;
		int generatedIn = generatedHelper.getIn();
		fd[1] = generatedIn;
		return 0;
	}
	public void set_common_push_options(Object name, int flags) {
		if (flags & (1 << 2)) {
			if (transport.set_helper_option("dry-run", "true") != 0) {
				ModernizedCProgram.die(ModernizedCProgram._("helper %s does not support dry-run"), name);
			} 
		}  else if (flags & (1 << 11)) {
			if (transport.set_helper_option("pushcert", "true") != 0) {
				ModernizedCProgram.die(ModernizedCProgram._("helper %s does not support --signed"), name);
			} 
		}  else if (flags & (1 << 12)) {
			if (transport.set_helper_option("pushcert", "if-asked") != 0) {
				ModernizedCProgram.die(ModernizedCProgram._("helper %s does not support --signed=if-asked"), name);
			} 
		} 
		if (flags & (1 << 13)) {
			if (transport.set_helper_option("atomic", "true") != 0) {
				ModernizedCProgram.die(ModernizedCProgram._("helper %s does not support --atomic"), name);
			} 
		} 
		Object generatedPush_options = this.getPush_options();
		byte generatedString = item.getString();
		if (flags & (1 << 14)) {
			string_list_item item = new string_list_item();
			for (item = (generatedPush_options).getItems(); item && item < (generatedPush_options).getItems() + (generatedPush_options).getNr(); ++item) {
				if (transport.set_helper_option("push-option", generatedString) != 0) {
					ModernizedCProgram.die(ModernizedCProgram._("helper %s does not support 'push-option'"), name);
				} 
			}
		} 
	}
	public int transport_helper_init(Object name) {
		helper_data data = ModernizedCProgram.xcalloc(1, );
		data.setName(name);
		ModernizedCProgram.transport_check_allowed(name);
		if (.getenv("GIT_TRANSPORT_HELPER_DEBUG")) {
			ModernizedCProgram.debug = 1;
		} 
		this.setData(data);
		this.setVtable(ModernizedCProgram.vtable);
		git_transport_options generatedTransport_options = data.getTransport_options();
		this.setSmart_options((generatedTransport_options));
		return 0/*
		 * Linux pipes can buffer 65536 bytes at once (and most platforms can
		 * buffer less), so attempt reads and writes with up to that size.
		 */;
	}
	public Object getVtable() {
		return vtable;
	}
	public void setVtable(Object newVtable) {
		vtable = newVtable;
	}
	public remote getRemote() {
		return remote;
	}
	public void setRemote(remote newRemote) {
		remote = newRemote;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getRemote_refs() {
		return remote_refs;
	}
	public void setRemote_refs(Object newRemote_refs) {
		remote_refs = newRemote_refs;
	}
	public int getGot_remote_refs() {
		return got_remote_refs;
	}
	public void setGot_remote_refs(int newGot_remote_refs) {
		got_remote_refs = newGot_remote_refs;
	}
	public int getCannot_reuse() {
		return cannot_reuse;
	}
	public void setCannot_reuse(int newCannot_reuse) {
		cannot_reuse = newCannot_reuse;
	}
	public int getCloning() {
		return cloning;
	}
	public void setCloning(int newCloning) {
		cloning = newCloning;
	}
	public int getStateless_rpc() {
		return stateless_rpc;
	}
	public void setStateless_rpc(int newStateless_rpc) {
		stateless_rpc = newStateless_rpc;
	}
	public Object getPush_options() {
		return push_options;
	}
	public void setPush_options(Object newPush_options) {
		push_options = newPush_options;
	}
	public Object getServer_options() {
		return server_options;
	}
	public void setServer_options(Object newServer_options) {
		server_options = newServer_options;
	}
	public Byte getPack_lockfile() {
		return pack_lockfile;
	}
	public void setPack_lockfile(Byte newPack_lockfile) {
		pack_lockfile = newPack_lockfile;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
	public git_transport_options getSmart_options() {
		return smart_options;
	}
	public void setSmart_options(git_transport_options newSmart_options) {
		smart_options = newSmart_options;
	}
	public transport_family getFamily() {
		return family;
	}
	public void setFamily(transport_family newFamily) {
		family = newFamily;
	}
}
/*
 * Check whether a transport is allowed by the environment.
 *
 * Type should generally be the URL scheme, as described in
 * Documentation/git.txt
 *
 * from_user specifies if the transport was given by the user.  If unknown pass
 * a -1 to read from the environment to determine if the transport was given by
 * the user.
 *
 */
