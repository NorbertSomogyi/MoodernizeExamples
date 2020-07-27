package application;

public class receive_hook_feed_state {
	private command cmd;
	private int skip_broken;
	private strbuf buf;
	private Object push_options;
	
	public receive_hook_feed_state(command cmd, int skip_broken, strbuf buf, Object push_options) {
		setCmd(cmd);
		setSkip_broken(skip_broken);
		setBuf(buf);
		setPush_options(push_options);
	}
	public receive_hook_feed_state() {
	}
	
	public int run_and_feed_hook(Object hook_name, Object feed) {
		child_process proc = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		async muxer = new async();
		byte[] argv = new byte[2];
		int code;
		argv[0] = ModernizedCProgram.find_hook(hook_name);
		if (!argv[0]) {
			return 0;
		} 
		argv[1] = ((Object)0);
		proc.setArgv(argv);
		proc.setIn(-1);
		proc.setStdout_to_stderr(1);
		proc.setTrace2_hook_name(hook_name);
		Object generatedPush_options = this.getPush_options();
		argv_array generatedEnv_array = proc.getEnv_array();
		if (generatedPush_options) {
			int i;
			for (i = 0; i < generatedPush_options.getNr(); i++) {
				generatedEnv_array.argv_array_pushf("GIT_PUSH_OPTION_%d=%s", i, generatedPush_options.getItems()[i].getString());
			}
			generatedEnv_array.argv_array_pushf("GIT_PUSH_OPTION_COUNT=%d", generatedPush_options.getNr());
		} else {
				generatedEnv_array.argv_array_pushf("GIT_PUSH_OPTION_COUNT");
		} 
		if (ModernizedCProgram.tmp_objdir) {
			generatedEnv_array.argv_array_pushv(ModernizedCProgram.tmp_objdir_env(ModernizedCProgram.tmp_objdir));
		} 
		int generatedIn = muxer.getIn();
		if (ModernizedCProgram.use_sideband) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(muxer, 0, /*Error: sizeof expression not supported yet*/);
			muxer.setProc(copy_to_sideband);
			muxer.setIn(-1);
			code = muxer.start_async();
			if (code) {
				return code;
			} 
			proc.setErr(generatedIn);
		} 
		proc.prepare_push_cert_sha1();
		code = proc.start_command();
		if (code) {
			if (ModernizedCProgram.use_sideband) {
				muxer.finish_async();
			} 
			return code;
		} 
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		while (1) {
			byte buf;
			size_t n = new size_t();
			if (/*Error: Function owner not recognized*/feed(feed_state, ModernizedCProgram.buf, n)) {
				break;
			} 
			if (ModernizedCProgram.write_in_full(generatedIn, ModernizedCProgram.buf, n) < 0) {
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedIn);
		if (ModernizedCProgram.use_sideband) {
			muxer.finish_async();
		} 
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		return proc.finish_command();
	}
	public command getCmd() {
		return cmd;
	}
	public void setCmd(command newCmd) {
		cmd = newCmd;
	}
	public int getSkip_broken() {
		return skip_broken;
	}
	public void setSkip_broken(int newSkip_broken) {
		skip_broken = newSkip_broken;
	}
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
	public Object getPush_options() {
		return push_options;
	}
	public void setPush_options(Object newPush_options) {
		push_options = newPush_options;
	}
}
