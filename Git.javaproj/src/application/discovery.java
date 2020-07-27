package application;

public class discovery {
	private Byte service;
	private Byte buf_alloc;
	private Byte buf;
	private Object len;
	private ref refs;
	private oid_array shallow;
	private protocol_version version;
	private int proto_git;
	
	public discovery(Byte service, Byte buf_alloc, Byte buf, Object len, ref refs, oid_array shallow, protocol_version version, int proto_git) {
		setService(service);
		setBuf_alloc(buf_alloc);
		setBuf(buf);
		setLen(len);
		setRefs(refs);
		setShallow(shallow);
		setVersion(version);
		setProto_git(proto_git);
	}
	public discovery() {
	}
	
	public void free_discovery() {
		oid_array generatedShallow = this.getShallow();
		object_id[] generatedOid = generatedShallow.getOid();
		Byte generatedBuf_alloc = this.getBuf_alloc();
		ref generatedRefs = this.getRefs();
		Byte generatedService = this.getService();
		if (d) {
			if (d == ModernizedCProgram.last_discovery) {
				ModernizedCProgram.last_discovery = ((Object)0);
			} 
			ModernizedCProgram.free(generatedOid);
			ModernizedCProgram.free(generatedBuf_alloc);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_refs(generatedRefs);
			ModernizedCProgram.free(generatedService);
			ModernizedCProgram.free(d);
		} 
	}
	public discovery discover_refs(Object service, int for_push) {
		strbuf type = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf charset = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf buffer = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf refs_url = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf effective_url = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf protocol_header = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		string_list extra_headers = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		discovery last = ModernizedCProgram.last_discovery;
		int http_ret;
		int maybe_smart = 0;
		http_get_options http_options = new http_get_options();
		protocol_version version = ModernizedCProgram.get_protocol_version_config();
		Byte generatedService = last.getService();
		if (last && !/*Error: Function owner not recognized*/strcmp(service, generatedService)) {
			return last;
		} 
		last.free_discovery();
		refs_url.strbuf_addf("%sinfo/refs", ModernizedCProgram.url.getBuf());
		if ((ModernizedCProgram.starts_with(ModernizedCProgram.url.getBuf(), "http://") || ModernizedCProgram.starts_with(ModernizedCProgram.url.getBuf(), "https://")) && /*Error: Function owner not recognized*/git_env_bool("GIT_SMART_HTTP", 1)) {
			maybe_smart = 1;
			if (!/*Error: Function owner not recognized*/strchr(ModernizedCProgram.url.getBuf(), (byte)'?')) {
				refs_url.strbuf_addch((byte)'?');
			} else {
					refs_url.strbuf_addch((byte)'&');
			} 
			refs_url.strbuf_addf("service=%s", service/*
				 * NEEDSWORK: If we are trying to use protocol v2 and we are planning
				 * to perform a push, then fallback to v0 since the client doesn't know
				 * how to push yet using v2.
				 */);
		} 
		if (protocol_version.version == protocol_version.protocol_v2 && !/*Error: Function owner not recognized*/strcmp("git-receive-pack", service)) {
			protocol_version.version = protocol_version.protocol_v0;
		} 
		byte[] generatedBuf = protocol_header.getBuf();
		string_list_item string_list_item = new string_list_item();
		if (/* Add the extra Git-Protocol header */protocol_header.get_protocol_http_header(protocol_version.version)) {
			string_list_item.string_list_append(extra_headers, generatedBuf);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(http_options, 0, /*Error: sizeof expression not supported yet*/);
		http_options.setContent_type(type);
		http_options.setCharset(charset);
		http_options.setEffective_url(effective_url);
		http_options.setBase_url(ModernizedCProgram.url);
		http_options.setExtra_headers(extra_headers);
		http_options.setInitial_request(1);
		http_options.setNo_cache(1);
		http_ret = ModernizedCProgram.http_get_strbuf(generatedBuf, buffer, http_options);
		switch (http_ret) {
		case 5:
				type.show_http_message(charset, buffer);
				ModernizedCProgram.die(ModernizedCProgram._("Authentication failed for '%s'"), ModernizedCProgram.transport_anonymize_url(generatedBuf));
		case 0:
				break;
		case 1:
				type.show_http_message(charset, buffer);
				ModernizedCProgram.die(ModernizedCProgram._("repository '%s' not found"), ModernizedCProgram.transport_anonymize_url(generatedBuf));
		default:
				type.show_http_message(charset, buffer);
				ModernizedCProgram.die(ModernizedCProgram._("unable to access '%s': %s"), ModernizedCProgram.transport_anonymize_url(generatedBuf), ModernizedCProgram.curl_errorstr);
		}
		if (ModernizedCProgram.options.getVerbosity() && !ModernizedCProgram.starts_with(generatedBuf, generatedBuf)) {
			byte u = ModernizedCProgram.transport_anonymize_url(generatedBuf);
			ModernizedCProgram.warning(ModernizedCProgram._("redirecting to %s"), u);
			ModernizedCProgram.free(u);
		} 
		last = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		last.setService(ModernizedCProgram.xstrdup(service));
		Object generatedLen = last.getLen();
		last.setBuf_alloc(buffer.strbuf_detach(generatedLen));
		Byte generatedBuf_alloc = last.getBuf_alloc();
		last.setBuf(generatedBuf_alloc);
		if (maybe_smart) {
			ModernizedCProgram.check_smart_http(last, service, type);
		} 
		int generatedProto_git = last.getProto_git();
		ref ref = new ref();
		ref ref = new ref();
		if (generatedProto_git) {
			last.setRefs(ref.parse_git_refs(last, for_push));
		} else {
				last.setRefs(ref.parse_info_refs(last));
		} 
		refs_url.strbuf_release();
		type.strbuf_release();
		charset.strbuf_release();
		effective_url.strbuf_release();
		buffer.strbuf_release();
		protocol_header.strbuf_release();
		extra_headers.string_list_clear(0);
		ModernizedCProgram.last_discovery = last;
		return last;
	}
	public int push_git(int nr_spec, Object[][] specs) {
		rpc_state rpc = new rpc_state();
		int i;
		int err;
		argv_array args = new argv_array();
		string_list_item cas_option = new string_list_item();
		strbuf preamble = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf rpc_result = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		args.argv_array_init();
		args.argv_array_pushl("send-pack", "--stateless-rpc", "--helper-status", ((Object)0));
		if (ModernizedCProgram.options.getThin()) {
			args.argv_array_push("--thin");
		} 
		if (ModernizedCProgram.options.getDry_run()) {
			args.argv_array_push("--dry-run");
		} 
		if (ModernizedCProgram.options.getPush_cert() == 2) {
			args.argv_array_push("--signed=yes");
		}  else if (ModernizedCProgram.options.getPush_cert() == 1) {
			args.argv_array_push("--signed=if-asked");
		} 
		if (ModernizedCProgram.options.getAtomic()) {
			args.argv_array_push("--atomic");
		} 
		if (ModernizedCProgram.options.getVerbosity() == 0) {
			args.argv_array_push("--quiet");
		}  else if (ModernizedCProgram.options.getVerbosity() > 1) {
			args.argv_array_push("--verbose");
		} 
		for (i = 0; i < ModernizedCProgram.options.getPush_options().getNr(); i++) {
			args.argv_array_pushf("--push-option=%s", ModernizedCProgram.options.getPush_options().getItems()[i].getString());
		}
		args.argv_array_push(ModernizedCProgram.options.getProgress() ? "--progress" : "--no-progress");
		byte[] generatedString = cas_option.getString();
		for (cas_option = (ModernizedCProgram.cas_options).getItems(); cas_option && cas_option < (ModernizedCProgram.cas_options).getItems() + (ModernizedCProgram.cas_options).getNr(); ++cas_option) {
			args.argv_array_push(generatedString);
		}
		args.argv_array_push(ModernizedCProgram.url.getBuf());
		args.argv_array_push("--stdin");
		for (i = 0; i < nr_spec; i++) {
			preamble.packet_buf_write("%s\n", specs[i]);
		}
		preamble.packet_buf_flush();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(rpc, 0, /*Error: sizeof expression not supported yet*/);
		;
		Object generatedLen = rpc_result.getLen();
		byte[] generatedBuf = rpc_result.getBuf();
		if (generatedLen) {
			ModernizedCProgram.write_or_die(1, generatedBuf, generatedLen);
		} 
		rpc_result.strbuf_release();
		preamble.strbuf_release();
		args.argv_array_clear();
		return err;
	}
	public Byte getService() {
		return service;
	}
	public void setService(Byte newService) {
		service = newService;
	}
	public Byte getBuf_alloc() {
		return buf_alloc;
	}
	public void setBuf_alloc(Byte newBuf_alloc) {
		buf_alloc = newBuf_alloc;
	}
	public Byte getBuf() {
		return buf;
	}
	public void setBuf(Byte newBuf) {
		buf = newBuf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public ref getRefs() {
		return refs;
	}
	public void setRefs(ref newRefs) {
		refs = newRefs;
	}
	public oid_array getShallow() {
		return shallow;
	}
	public void setShallow(oid_array newShallow) {
		shallow = newShallow;
	}
	public protocol_version getVersion() {
		return version;
	}
	public void setVersion(protocol_version newVersion) {
		version = newVersion;
	}
	public int getProto_git() {
		return proto_git;
	}
	public void setProto_git(int newProto_git) {
		proto_git = newProto_git;
	}
}
