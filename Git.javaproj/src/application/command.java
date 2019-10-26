package application;

public class command {
	private command next;
	private Object error_string;
	private int skip_update;
	private int did_not_exist;
	private int index;
	private object_id old_oid;
	private object_id new_oid;
	private Object ref_name;
	
	public command(command next, Object error_string, int skip_update, int did_not_exist, int index, object_id old_oid, object_id new_oid, Object ref_name) {
		setNext(next);
		setError_string(error_string);
		setSkip_update(skip_update);
		setDid_not_exist(did_not_exist);
		setIndex(index);
		setOld_oid(old_oid);
		setNew_oid(new_oid);
		setRef_name(ref_name);
	}
	public command() {
	}
	
	public int run_receive_hook(Object hook_name, int skip_broken, Object push_options) {
		receive_hook_feed_state state = new receive_hook_feed_state();
		int status;
		strbuf generatedBuf = state.getBuf();
		generatedBuf.strbuf_init(0);
		state.setCmd(ModernizedCProgram.commands);
		state.setSkip_broken(skip_broken);
		if (ModernizedCProgram.feed_receive_hook(state, ((Object)0), ((Object)0))) {
			return 0;
		} 
		state.setCmd(ModernizedCProgram.commands);
		state.setPush_options(push_options);
		status = state.run_and_feed_hook(hook_name, feed_receive_hook);
		generatedBuf.strbuf_release();
		return status;
	}
	public int run_update_hook() {
		byte[] argv = new byte[5];
		child_process proc = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		int code;
		argv[0] = ModernizedCProgram.find_hook("update");
		if (!argv[0]) {
			return 0;
		} 
		Object generatedRef_name = this.getRef_name();
		argv[1] = generatedRef_name;
		object_id generatedOld_oid = this.getOld_oid();
		argv[2] = ModernizedCProgram.oid_to_hex(generatedOld_oid);
		object_id generatedNew_oid = this.getNew_oid();
		argv[3] = ModernizedCProgram.oid_to_hex(generatedNew_oid);
		argv[4] = ((Object)0);
		proc.setNo_stdin(1);
		proc.setStdout_to_stderr(1);
		proc.setErr(ModernizedCProgram.use_sideband ? -1 : 0);
		proc.setArgv(argv);
		proc.setTrace2_hook_name("update");
		code = proc.start_command();
		if (code) {
			return code;
		} 
		int generatedErr = proc.getErr();
		if (ModernizedCProgram.use_sideband) {
			ModernizedCProgram.copy_to_sideband(generatedErr, -1, ((Object)0));
		} 
		return proc.finish_command();
	}
	public void run_update_post_hook() {
		command cmd = new command();
		child_process proc = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		byte hook;
		hook = ModernizedCProgram.find_hook("post-update");
		if (!hook) {
			return ;
		} 
		Object generatedError_string = cmd.getError_string();
		int generatedDid_not_exist = cmd.getDid_not_exist();
		argv_array generatedArgs = proc.getArgs();
		int generatedArgc = generatedArgs.getArgc();
		Object generatedRef_name = cmd.getRef_name();
		command generatedNext = cmd.getNext();
		for (cmd = ModernizedCProgram.commands; cmd; cmd = generatedNext) {
			if (generatedError_string || generatedDid_not_exist) {
				continue;
			} 
			if (!generatedArgc) {
				generatedArgs.argv_array_push(hook);
			} 
			generatedArgs.argv_array_push(generatedRef_name);
		}
		if (!generatedArgc) {
			return ;
		} 
		proc.setNo_stdin(1);
		proc.setStdout_to_stderr(1);
		proc.setErr(ModernizedCProgram.use_sideband ? -1 : 0);
		proc.setTrace2_hook_name("post-update");
		int generatedErr = proc.getErr();
		if (!proc.start_command()) {
			if (ModernizedCProgram.use_sideband) {
				ModernizedCProgram.copy_to_sideband(generatedErr, -1, ((Object)0));
			} 
			proc.finish_command();
		} 
	}
	public void check_aliased_updates() {
		command cmd = new command();
		string_list ref_list = new string_list(((Object)0), 0, 0, 0, ((Object)0));
		Object generatedRef_name = cmd.getRef_name();
		command generatedNext = cmd.getNext();
		for (cmd = ModernizedCProgram.commands; cmd; cmd = generatedNext) {
			string_list_item item = ref_list.string_list_append(generatedRef_name);
			item.setUtil((Object)cmd);
		}
		ref_list.string_list_sort();
		Object generatedError_string = cmd.getError_string();
		for (cmd = ModernizedCProgram.commands; cmd; cmd = generatedNext) {
			if (!generatedError_string) {
				ModernizedCProgram.check_aliased_update(cmd, ref_list);
			} 
		}
		ref_list.string_list_clear(0);
	}
	public void reject_updates_to_hidden() {
		strbuf refname_full = new strbuf(, , );
		size_t prefix_len = new size_t();
		command cmd = new command();
		refname_full.strbuf_addstr(ModernizedCProgram.get_git_namespace());
		Object generatedLen = refname_full.getLen();
		prefix_len = generatedLen;
		Object generatedError_string = cmd.getError_string();
		Object generatedRef_name = cmd.getRef_name();
		byte generatedBuf = refname_full.getBuf();
		object_id generatedNew_oid = cmd.getNew_oid();
		command generatedNext = cmd.getNext();
		for (cmd = ModernizedCProgram.commands; cmd; cmd = generatedNext) {
			if (generatedError_string) {
				continue;
			} 
			refname_full.strbuf_setlen(prefix_len);
			refname_full.strbuf_addstr(generatedRef_name);
			if (!ModernizedCProgram.ref_is_hidden(generatedRef_name, generatedBuf)) {
				continue;
			} 
			if (ModernizedCProgram.is_null_oid(generatedNew_oid)) {
				cmd.setError_string("deny deleting a hidden ref");
			} else {
					cmd.setError_string("deny updating a hidden ref");
			} 
		}
		refname_full.strbuf_release();
	}
	public int should_process_cmd() {
		Object generatedError_string = this.getError_string();
		int generatedSkip_update = this.getSkip_update();
		return !generatedError_string && !generatedSkip_update;
	}
	public command queue_command(Object line, int linelen) {
		object_id old_oid = new object_id();
		object_id new_oid = new object_id();
		command cmd = new command();
		byte refname;
		int reflen;
		byte p;
		if (old_oid.parse_oid_hex(line, p) || p++ != (byte)' ' || new_oid.parse_oid_hex(p, p) || p++ != (byte)' ') {
			ModernizedCProgram.die("protocol error: expected old/new/ref, got '%s'", line);
		} 
		refname = p;
		reflen = linelen - (p - line);
		Object generatedRef_name = (cmd).getRef_name();
		do {
			size_t flex_array_len_ = (reflen);
			(cmd) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedRef_name, (refname), flex_array_len_);
		} while (0);
		object_id generatedOld_oid = cmd.getOld_oid();
		generatedOld_oid.oidcpy(old_oid);
		object_id generatedNew_oid = cmd.getNew_oid();
		generatedNew_oid.oidcpy(new_oid);
		tail = cmd;
		command generatedNext = cmd.getNext();
		return generatedNext;
	}
	public command read_head_info(packet_reader reader, oid_array shallow) {
		command commands = ((Object)0);
		command p = commands;
		int generatedPktlen = reader.getPktlen();
		Object generatedLine = reader.getLine();
		int generatedOptions = reader.getOptions();
		packet_read_status generatedStatus = reader.getStatus();
		for (; ; ) {
			int linelen;
			if (reader.packet_reader_read() != packet_read_status.PACKET_READ_NORMAL) {
				break;
			} 
			if (generatedPktlen > 8 && ModernizedCProgram.starts_with(generatedLine, "shallow ")) {
				object_id oid = new object_id();
				if (oid.get_oid_hex(generatedLine + 8)) {
					ModernizedCProgram.die("protocol error: expected shallow sha, got '%s'", generatedLine + 8);
				} 
				shallow.oid_array_append(oid);
				continue;
			} 
			linelen = .strlen(generatedLine);
			if (linelen < generatedPktlen) {
				byte feature_list = generatedLine + linelen + 1;
				if (ModernizedCProgram.parse_feature_request(feature_list, "report-status")) {
					ModernizedCProgram.report_status = 1;
				} 
				if (ModernizedCProgram.parse_feature_request(feature_list, "side-band-64k")) {
					ModernizedCProgram.use_sideband = 65520;
				} 
				if (ModernizedCProgram.parse_feature_request(feature_list, "quiet")) {
					ModernizedCProgram.quiet = 1;
				} 
				if (ModernizedCProgram.advertise_atomic_push && ModernizedCProgram.parse_feature_request(feature_list, "atomic")) {
					ModernizedCProgram.use_atomic = 1;
				} 
				if (ModernizedCProgram.advertise_push_options && ModernizedCProgram.parse_feature_request(feature_list, "push-options")) {
					ModernizedCProgram.use_push_options = 1;
				} 
			} 
			if (!.strcmp(generatedLine, "push-cert")) {
				int true_flush = 0;
				int saved_options = generatedOptions;
				generatedOptions &=  ~(-1024 << 1);
				for (; ; ) {
					reader.packet_reader_read();
					if (generatedStatus == packet_read_status.PACKET_READ_FLUSH) {
						true_flush = 1;
						break;
					} 
					if (generatedStatus != packet_read_status.PACKET_READ_NORMAL) {
						ModernizedCProgram.die("protocol error: got an unexpected packet");
					} 
					if (!.strcmp(generatedLine, "push-cert-end\n")) {
						break;
					} 
					ModernizedCProgram.push_cert.strbuf_addstr(generatedLine);
				}
				reader.setOptions(saved_options);
				if (true_flush) {
					break;
				} 
				continue;
			} 
			p = p.queue_command(generatedLine, linelen);
		}
		if (ModernizedCProgram.push_cert.getLen()) {
			ModernizedCProgram.queue_commands_from_cert(p, ModernizedCProgram.push_cert);
		} 
		return commands;
	}
	public int delete_only() {
		command cmd = new command();
		object_id generatedNew_oid = cmd.getNew_oid();
		command generatedNext = cmd.getNext();
		for (cmd = ModernizedCProgram.commands; cmd; cmd = generatedNext) {
			if (!ModernizedCProgram.is_null_oid(generatedNew_oid)) {
				return 0;
			} 
		}
		return 1;
	}
	public command getNext() {
		return next;
	}
	public void setNext(command newNext) {
		next = newNext;
	}
	public Object getError_string() {
		return error_string;
	}
	public void setError_string(Object newError_string) {
		error_string = newError_string;
	}
	public int getSkip_update() {
		return skip_update;
	}
	public void setSkip_update(int newSkip_update) {
		skip_update = newSkip_update;
	}
	public int getDid_not_exist() {
		return did_not_exist;
	}
	public void setDid_not_exist(int newDid_not_exist) {
		did_not_exist = newDid_not_exist;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public object_id getOld_oid() {
		return old_oid;
	}
	public void setOld_oid(object_id newOld_oid) {
		old_oid = newOld_oid;
	}
	public object_id getNew_oid() {
		return new_oid;
	}
	public void setNew_oid(object_id newNew_oid) {
		new_oid = newNew_oid;
	}
	public Object getRef_name() {
		return ref_name;
	}
	public void setRef_name(Object newRef_name) {
		ref_name = newRef_name;
	}
}
