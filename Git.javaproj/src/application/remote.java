package application;

public class remote {
	private hashmap_entry ent;
	private Object name;
	private int origin;
	private int configured_in_repo;
	private Object foreign_vcs;
	private Object url;
	private int url_nr;
	private int url_alloc;
	private Object pushurl;
	private int pushurl_nr;
	private int pushurl_alloc;
	private refspec push;
	private refspec fetch;
	private int fetch_tags;
	private int skip_default_update;
	private int mirror;
	private int prune;
	private int prune_tags;
	private Object receivepack;
	private Object uploadpack;
	private Byte http_proxy;
	private Byte http_proxy_authmethod;
	
	public remote(hashmap_entry ent, Object name, int origin, int configured_in_repo, Object foreign_vcs, Object url, int url_nr, int url_alloc, Object pushurl, int pushurl_nr, int pushurl_alloc, refspec push, refspec fetch, int fetch_tags, int skip_default_update, int mirror, int prune, int prune_tags, Object receivepack, Object uploadpack, Byte http_proxy, Byte http_proxy_authmethod) {
		setEnt(ent);
		setName(name);
		setOrigin(origin);
		setConfigured_in_repo(configured_in_repo);
		setForeign_vcs(foreign_vcs);
		setUrl(url);
		setUrl_nr(url_nr);
		setUrl_alloc(url_alloc);
		setPushurl(pushurl);
		setPushurl_nr(pushurl_nr);
		setPushurl_alloc(pushurl_alloc);
		setPush(push);
		setFetch(fetch);
		setFetch_tags(fetch_tags);
		setSkip_default_update(skip_default_update);
		setMirror(mirror);
		setPrune(prune);
		setPrune_tags(prune_tags);
		setReceivepack(receivepack);
		setUploadpack(uploadpack);
		setHttp_proxy(http_proxy);
		setHttp_proxy_authmethod(http_proxy_authmethod);
	}
	public remote() {
	}
	
	public void http_init(Object url, int proactive_auth) {
		byte low_speed_limit;
		byte low_speed_time;
		byte normalized_url;
		urlmatch_config config = new urlmatch_config(new urlmatch_config(((Object)0), 0, 0, 1, ((Object)0)));
		config.setSection("http");
		config.setKey(((Object)0));
		config.setCollect_fn(http_options);
		config.setCascade_fn(ModernizedCProgram.git_default_config);
		config.setCb(((Object)0));
		ModernizedCProgram.http_is_verbose = 0;
		url_info generatedUrl = config.getUrl();
		normalized_url = generatedUrl.url_normalize(url);
		.git_config(ModernizedCProgram.urlmatch_config_entry, config);
		ModernizedCProgram.free(normalized_url);
		string_list generatedVars = config.getVars();
		generatedVars.string_list_clear(1);
	}
	public int add_known_remote(Object cb_data) {
		known_remotes all = cb_data;
		known_remote r = new known_remote();
		remote generatedTo_delete = all.getTo_delete();
		Object generatedName = generatedTo_delete.getName();
		if (!.strcmp(generatedName, generatedName)) {
			return 0;
		} 
		r = ModernizedCProgram.xmalloc();
		r.setRemote(ModernizedCProgram.remote);
		known_remote generatedList = all.getList();
		r.setNext(generatedList);
		all.setList(r);
		return 0;
	}
	public int migrate_file() {
		strbuf buf = new strbuf(, , );
		int i;
		buf.strbuf_addf("remote.%s.url", ModernizedCProgram.remote.getName());
		byte generatedBuf = buf.getBuf();
		for (i = 0; i < ModernizedCProgram.remote.getUrl_nr(); i++) {
			.git_config_set_multivar(generatedBuf, ModernizedCProgram.remote.getUrl()[i], "^$", 0);
		}
		buf.strbuf_setlen(0);
		buf.strbuf_addf("remote.%s.push", ModernizedCProgram.remote.getName());
		for (i = 0; i < ModernizedCProgram.remote.getPush().getRaw_nr(); i++) {
			.git_config_set_multivar(generatedBuf, ModernizedCProgram.remote.getPush().getRaw()[i], "^$", 0);
		}
		buf.strbuf_setlen(0);
		buf.strbuf_addf("remote.%s.fetch", ModernizedCProgram.remote.getName());
		for (i = 0; i < ModernizedCProgram.remote.getFetch().getRaw_nr(); i++) {
			.git_config_set_multivar(generatedBuf, ModernizedCProgram.remote.getFetch().getRaw()[i], "^$", 0);
		}
		if (ModernizedCProgram.remote.getOrigin() == .REMOTE_REMOTES) {
			ModernizedCProgram.unlink_or_warn(ModernizedCProgram.git_path("remotes/%s", ModernizedCProgram.remote.getName()));
		}  else if (ModernizedCProgram.remote.getOrigin() == .REMOTE_BRANCHES) {
			ModernizedCProgram.unlink_or_warn(ModernizedCProgram.git_path("branches/%s", ModernizedCProgram.remote.getName()));
		} 
		buf.strbuf_release();
		return 0;
	}
	public int get_one_entry(Object priv) {
		string_list list = priv;
		strbuf url_buf = new strbuf(, , );
		byte url;
		int i;
		int url_nr;
		if (ModernizedCProgram.remote.getUrl_nr() > 0) {
			url_buf.strbuf_addf("%s (fetch)", ModernizedCProgram.remote.getUrl()[0]);
			list.string_list_append(ModernizedCProgram.remote.getName()).setUtil(url_buf.strbuf_detach(((Object)0)));
		} else {
				list.string_list_append(ModernizedCProgram.remote.getName()).setUtil(((Object)0));
		} 
		if (ModernizedCProgram.remote.getPushurl_nr()) {
			url = ModernizedCProgram.remote.getPushurl();
			url_nr = ModernizedCProgram.remote.getPushurl_nr();
		} else {
				url = ModernizedCProgram.remote.getUrl();
				url_nr = ModernizedCProgram.remote.getUrl_nr();
		} 
		for (i = 0; i < url_nr; i++) {
			url_buf.strbuf_addf("%s (push)", url[i]);
			list.string_list_append(ModernizedCProgram.remote.getName()).setUtil(url_buf.strbuf_detach(((Object)0)));
		}
		return 0;
	}
	public void add_branches(Object branches, Object key) {
		byte remotename = ModernizedCProgram.remote.getName();
		int mirror = ModernizedCProgram.remote.getMirror();
		strbuf refspec = new strbuf(, , );
		for (; branches; branches++) {
			refspec.add_branch(key, branches, remotename, mirror);
		}
		refspec.strbuf_release();
	}
	public int get_one_remote_for_fetch(Object priv) {
		string_list list = priv;
		if (!ModernizedCProgram.remote.getSkip_default_update()) {
			list.string_list_append(ModernizedCProgram.remote.getName());
		} 
		return 0;
	}
	public void fetch_one_setup_partial() {
		if (ModernizedCProgram.filter_options.getNo_filter()) {
			return ;
		} 
		if (!ModernizedCProgram.has_promisor_remote() && !ModernizedCProgram.filter_options.getChoice()) {
			return ;
		} 
		if (ModernizedCProgram.filter_options.getChoice()) {
			ModernizedCProgram.filter_options.partial_clone_register(ModernizedCProgram.remote.getName());
			return ;
		} 
		if (!ModernizedCProgram.filter_options.getChoice()) {
			ModernizedCProgram.filter_options.partial_clone_get_default_filter_spec(ModernizedCProgram.remote.getName());
		} 
		return ;
	}
	/*
		 * Explicit --no-filter argument overrides everything, regardless
		 * of any prior partial clones and fetches.
		 */
	public int fetch_one(int argc, Object argv, int prune_tags_ok) {
		refspec rs = new refspec();
		int i;
		int exit_code;
		int maybe_prune_tags;
		int remote_via_config = .remote_is_configured(ModernizedCProgram.remote, 0);
		if (!ModernizedCProgram.remote) {
			ModernizedCProgram.die(ModernizedCProgram._("No remote repository specified.  Please, specify either a URL or a\nremote name from which new revisions should be fetched."));
		} 
		transport transport = new transport();
		ModernizedCProgram.gtransport = transport.prepare_transport(ModernizedCProgram.remote, 1);
		if (ModernizedCProgram.prune < 0) {
			if (0 <= ModernizedCProgram.remote.getPrune()) {
				ModernizedCProgram.prune = ModernizedCProgram.remote.getPrune();
			}  else if (0 <= ModernizedCProgram.fetch_prune_config) {
				ModernizedCProgram.prune = ModernizedCProgram.fetch_prune_config;
			} else {
					ModernizedCProgram.prune = 0;
			} 
		} 
		if (ModernizedCProgram.prune_tags < 0) {
			if (0 <= ModernizedCProgram.remote.getPrune_tags()) {
				ModernizedCProgram.prune_tags = ModernizedCProgram.remote.getPrune_tags();
			}  else if (0 <= ModernizedCProgram.fetch_prune_tags_config) {
				ModernizedCProgram.prune_tags = ModernizedCProgram.fetch_prune_tags_config;
			} else {
					ModernizedCProgram.prune_tags = 0;
			} 
		} 
		maybe_prune_tags = prune_tags_ok && ModernizedCProgram.prune_tags;
		if (maybe_prune_tags && remote_via_config) {
			ModernizedCProgram.remote.getFetch().refspec_append("refs/tags/*:refs/tags/*");
		} 
		if (maybe_prune_tags && (argc || !remote_via_config)) {
			rs.refspec_append("refs/tags/*:refs/tags/*");
		} 
		for (i = 0; i < argc; i++) {
			if (!.strcmp(argv[i], "tag")) {
				byte tag;
				i++;
				if (i >= argc) {
					ModernizedCProgram.die(ModernizedCProgram._("You need to specify a tag name."));
				} 
				tag = ModernizedCProgram.xstrfmt("refs/tags/%s:refs/tags/%s", argv[i], argv[i]);
				rs.refspec_append(tag);
				ModernizedCProgram.free(tag);
			} else {
					rs.refspec_append(argv[i]);
			} 
		}
		if (ModernizedCProgram.server_options.getNr()) {
			ModernizedCProgram.gtransport.setServer_options(ModernizedCProgram.server_options);
		} 
		ModernizedCProgram.sigchain_push_common(unlock_pack_on_signal);
		.atexit(unlock_pack);
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		exit_code = ModernizedCProgram.do_fetch(ModernizedCProgram.gtransport, rs);
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		rs.refspec_clear();
		ModernizedCProgram.gtransport.transport_disconnect();
		ModernizedCProgram.gtransport = ((Object)0);
		return exit_code;
	}
	public int push_url_of_remote(Object url_p) {
		if (ModernizedCProgram.remote.getPushurl_nr()) {
			url_p = ModernizedCProgram.remote.getPushurl();
			return ModernizedCProgram.remote.getPushurl_nr();
		} 
		url_p = ModernizedCProgram.remote.getUrl();
		return ModernizedCProgram.remote.getUrl_nr();
	}
	public int is_workflow_triangular() {
		remote fetch_remote = .remote_get(((Object)0));
		return (fetch_remote && fetch_remote != ModernizedCProgram.remote);
	}
	public void setup_default_push_refspecs() {
		branch branch = .branch_get(((Object)0));
		int triangular = ModernizedCProgram.remote.is_workflow_triangular();
		switch (push_default_type.push_default) {
		case push_default_type.PUSH_DEFAULT_MATCHING:
				ModernizedCProgram.rs.refspec_append(":");
				break;
		case push_default_type.PUSH_DEFAULT_UPSTREAM:
				ModernizedCProgram.setup_push_upstream(ModernizedCProgram.remote, branch, triangular, 0);
				break;
		case push_default_type.PUSH_DEFAULT_NOTHING:
				ModernizedCProgram.die(ModernizedCProgram._("You didn't specify any refspecs to push, and push.default is \"nothing\"."));
				break;
		case push_default_type.PUSH_DEFAULT_SIMPLE:
				if (triangular) {
					ModernizedCProgram.setup_push_current(ModernizedCProgram.remote, branch);
				} else {
						ModernizedCProgram.setup_push_upstream(ModernizedCProgram.remote, branch, triangular, 1);
				} 
				break;
		case push_default_type.PUSH_DEFAULT_UNSPECIFIED:
		case push_default_type.PUSH_DEFAULT_CURRENT:
				ModernizedCProgram.setup_push_current(ModernizedCProgram.remote, branch);
				break;
		default:
		}
	}
	public int do_push(Object repo, int flags, Object push_options) {
		int i;
		int errs;
		byte url;
		int url_nr;
		refspec push_refspec = ModernizedCProgram.rs;
		if (push_options.getNr()) {
			flags |=  (1 << 14);
		} 
		int generatedNr = push_refspec.getNr();
		if (!generatedNr && !(flags & (1 << 0))) {
			if (generatedNr) {
				push_refspec = ModernizedCProgram.remote.getPush();
			}  else if (!(flags & (1 << 3))) {
				ModernizedCProgram.remote.setup_default_push_refspecs();
			} 
		} 
		errs = 0;
		url_nr = ModernizedCProgram.remote.push_url_of_remote(url);
		transport transport = new transport();
		if (url_nr) {
			for (i = 0; i < url_nr; i++) {
				transport transport = transport.transport_get(ModernizedCProgram.remote, url[i]);
				if (flags & (1 << 14)) {
					transport.setPush_options(push_options);
				} 
				if (ModernizedCProgram.push_with_options(transport, push_refspec, flags)) {
					errs++;
				} 
			}
		} else {
				transport transport = transport.transport_get(ModernizedCProgram.remote, ((Object)0));
				if (flags & (1 << 14)) {
					transport.setPush_options(push_options);
				} 
				if (ModernizedCProgram.push_with_options(transport, push_refspec, flags)) {
					errs++;
				} 
		} 
		return !!errs;
	}
	public int get_only_remote(Object cb_data) {
		byte remote_name = cb_data;
		if (remote_name) {
			return -1;
		} 
		remote_name = ModernizedCProgram.remote.getName();
		return 0/**
		 * Dies with the appropriate reason for why there are no merge candidates:
		 *
		 * 1. We fetched from a specific remote, and a refspec was given, but it ended
		 *    up not fetching anything. This is usually because the user provided a
		 *    wildcard refspec which had no matches on the remote end.
		 *
		 * 2. We fetched from a non-default remote, but didn't specify a branch to
		 *    merge. We can't use the configured one because it applies to the default
		 *    remote, thus the user must specify the branches to merge.
		 *
		 * 3. We fetched from the branch's or repo's default remote, but:
		 *
		 *    a. We are not on a branch, so there will never be a configured branch to
		 *       merge with.
		 *
		 *    b. We are on a branch, but there is no configured branch to merge with.
		 *
		 * 4. We fetched from the branch's or repo's default remote, but the configured
		 *    branch to merge didn't get fetched. (Either it doesn't exist, or wasn't
		 *    part of the configured fetch refspec.)
		 */;
	}
	public int find_tracked_branch(Object priv) {
		tracking tracking = priv;
		refspec_item generatedSpec = tracking.getSpec();
		int generatedMatches = tracking.getMatches();
		byte generatedSrc = generatedSpec.getSrc();
		if (!.remote_find_tracking(ModernizedCProgram.remote, generatedSpec)) {
			if (++generatedMatches == 1) {
				tracking.setSrc(generatedSrc);
				tracking.setRemote(ModernizedCProgram.remote.getName());
			} else {
					ModernizedCProgram.free(generatedSrc);
					do {
						ModernizedCProgram.free(generatedSrc);
						(generatedSrc) = ((Object)0);
					} while (0);
			} 
			generatedSpec.setSrc(((Object)0));
		} 
		return 0;
	}
	public int check_tracking_branch(Object cb_data) {
		byte tracking_branch = cb_data;
		refspec_item query = new refspec_item();
		.memset(query, 0, );
		query.setDst(tracking_branch);
		return !.remote_find_tracking(ModernizedCProgram.remote, query);
	}
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int newOrigin) {
		origin = newOrigin;
	}
	public int getConfigured_in_repo() {
		return configured_in_repo;
	}
	public void setConfigured_in_repo(int newConfigured_in_repo) {
		configured_in_repo = newConfigured_in_repo;
	}
	public Object getForeign_vcs() {
		return foreign_vcs;
	}
	public void setForeign_vcs(Object newForeign_vcs) {
		foreign_vcs = newForeign_vcs;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public int getUrl_nr() {
		return url_nr;
	}
	public void setUrl_nr(int newUrl_nr) {
		url_nr = newUrl_nr;
	}
	public int getUrl_alloc() {
		return url_alloc;
	}
	public void setUrl_alloc(int newUrl_alloc) {
		url_alloc = newUrl_alloc;
	}
	public Object getPushurl() {
		return pushurl;
	}
	public void setPushurl(Object newPushurl) {
		pushurl = newPushurl;
	}
	public int getPushurl_nr() {
		return pushurl_nr;
	}
	public void setPushurl_nr(int newPushurl_nr) {
		pushurl_nr = newPushurl_nr;
	}
	public int getPushurl_alloc() {
		return pushurl_alloc;
	}
	public void setPushurl_alloc(int newPushurl_alloc) {
		pushurl_alloc = newPushurl_alloc;
	}
	public refspec getPush() {
		return push;
	}
	public void setPush(refspec newPush) {
		push = newPush;
	}
	public refspec getFetch() {
		return fetch;
	}
	public void setFetch(refspec newFetch) {
		fetch = newFetch;
	}
	public int getFetch_tags() {
		return fetch_tags;
	}
	public void setFetch_tags(int newFetch_tags) {
		fetch_tags = newFetch_tags;
	}
	public int getSkip_default_update() {
		return skip_default_update;
	}
	public void setSkip_default_update(int newSkip_default_update) {
		skip_default_update = newSkip_default_update;
	}
	public int getMirror() {
		return mirror;
	}
	public void setMirror(int newMirror) {
		mirror = newMirror;
	}
	public int getPrune() {
		return prune;
	}
	public void setPrune(int newPrune) {
		prune = newPrune;
	}
	public int getPrune_tags() {
		return prune_tags;
	}
	public void setPrune_tags(int newPrune_tags) {
		prune_tags = newPrune_tags;
	}
	public Object getReceivepack() {
		return receivepack;
	}
	public void setReceivepack(Object newReceivepack) {
		receivepack = newReceivepack;
	}
	public Object getUploadpack() {
		return uploadpack;
	}
	public void setUploadpack(Object newUploadpack) {
		uploadpack = newUploadpack;
	}
	public Byte getHttp_proxy() {
		return http_proxy;
	}
	public void setHttp_proxy(Byte newHttp_proxy) {
		http_proxy = newHttp_proxy;
	}
	public Byte getHttp_proxy_authmethod() {
		return http_proxy_authmethod;
	}
	public void setHttp_proxy_authmethod(Byte newHttp_proxy_authmethod) {
		http_proxy_authmethod = newHttp_proxy_authmethod;
	}
}
