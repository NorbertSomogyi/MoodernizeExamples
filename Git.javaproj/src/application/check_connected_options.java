package application;

public class check_connected_options {
	private int quiet;
	private Object shallow_file;
	private transport transport;
	private int err_fd;
	private int progress;
	private Object env;
	private int is_deepening_fetch;
	private int check_refs_only;
	
	public check_connected_options(int quiet, Object shallow_file, transport transport, int err_fd, int progress, Object env, int is_deepening_fetch, int check_refs_only) {
		setQuiet(quiet);
		setShallow_file(shallow_file);
		setTransport(transport);
		setErr_fd(err_fd);
		setProgress(progress);
		setEnv(env);
		setIs_deepening_fetch(is_deepening_fetch);
		setCheck_refs_only(check_refs_only);
	}
	public check_connected_options() {
	}
	
	/*
	 * If we feed all the commits we want to verify to this command
	 *
	 *  $ git rev-list --objects --stdin --not --all
	 *
	 * and if it does not error out, that means everything reachable from
	 * these commits locally exists and is connected to our existing refs.
	 * Note that this does _not_ validate the individual objects.
	 *
	 * Returns 0 if everything is connected, non-zero otherwise.
	 */
	public int check_connected(Object fn, Object cb_data) {
		child_process rev_list = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		check_connected_options defaults = new check_connected_options(0);
		byte[] commit = new byte[(2 * 32) + 1];
		object_id oid = new object_id();
		int err = 0;
		packed_git new_pack = ((Object)0);
		transport transport = new transport();
		size_t base_len = new size_t();
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		if (!opt) {
			opt = defaults;
		} 
		transport generatedTransport = this.getTransport();
		transport = generatedTransport;
		int generatedErr_fd = this.getErr_fd();
		if (.fn(cb_data, oid)) {
			if (generatedErr_fd) {
				.close(generatedErr_fd);
			} 
			return err;
		} 
		git_transport_options generatedSmart_options = transport.getSmart_options();
		int generatedSelf_contained_and_connected = generatedSmart_options.getSelf_contained_and_connected();
		Byte generatedPack_lockfile = transport.getPack_lockfile();
		byte generatedBuf = idx_file.getBuf();
		Object generatedLen = idx_file.getLen();
		packed_git packed_git = new packed_git();
		if (transport && generatedSmart_options && generatedSelf_contained_and_connected && generatedPack_lockfile && ModernizedCProgram.strip_suffix(generatedPack_lockfile, ".keep", base_len)) {
			strbuf idx_file = new strbuf(, , );
			idx_file.strbuf_add(generatedPack_lockfile, base_len);
			idx_file.strbuf_addstr(".idx");
			new_pack = packed_git.add_packed_git(generatedBuf, generatedLen, 1);
			idx_file.strbuf_release();
		} 
		int generatedCheck_refs_only = this.getCheck_refs_only();
		if (generatedCheck_refs_only) {
			do {
				if (!ModernizedCProgram.the_repository.repo_has_object_file(oid)) {
					return 1;
				} 
			} while (!.fn(cb_data, oid));
			return 0;
		} 
		Object generatedShallow_file = this.getShallow_file();
		argv_array generatedArgs = rev_list.getArgs();
		if (generatedShallow_file) {
			generatedArgs.argv_array_push("--shallow-file");
			generatedArgs.argv_array_push(generatedShallow_file);
		} 
		generatedArgs.argv_array_push("rev-list");
		generatedArgs.argv_array_push("--objects");
		generatedArgs.argv_array_push("--stdin");
		if (ModernizedCProgram.has_promisor_remote()) {
			generatedArgs.argv_array_push("--exclude-promisor-objects");
		} 
		int generatedIs_deepening_fetch = this.getIs_deepening_fetch();
		if (!generatedIs_deepening_fetch) {
			generatedArgs.argv_array_push("--not");
			generatedArgs.argv_array_push("--all");
		} 
		generatedArgs.argv_array_push("--quiet");
		generatedArgs.argv_array_push("--alternate-refs");
		int generatedProgress = this.getProgress();
		if (generatedProgress) {
			generatedArgs.argv_array_pushf("--progress=%s", ModernizedCProgram._("Checking connectivity"));
		} 
		rev_list.setGit_cmd(1);
		Object generatedEnv = this.getEnv();
		rev_list.setEnv(generatedEnv);
		rev_list.setIn(-1);
		rev_list.setNo_stdout(1);
		int generatedQuiet = this.getQuiet();
		if (generatedErr_fd) {
			rev_list.setErr(generatedErr_fd);
		} else {
				rev_list.setNo_stderr(generatedQuiet);
		} 
		if (rev_list.start_command()) {
			return ();
		} 
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		commit[hexsz] = (byte)'\n';
		Object generatedHash = oid.getHash();
		int generatedIn = rev_list.getIn();
		do {
			if (new_pack && new_pack.find_pack_entry_one(generatedHash)) {
				continue;
			} 
			.memcpy(commit, ModernizedCProgram.oid_to_hex(oid), hexsz);
			if (ModernizedCProgram.write_in_full(generatedIn, commit, hexsz + 1) < 0) {
				if ((._errno()) != 32 && (._errno()) != 22) {
					();
				} 
				err = -1;
				break;
			} 
		} while (!.fn(cb_data, oid));/*
				 * If index-pack already checked that:
				 * - there are no dangling pointers in the new pack
				 * - the pack is self contained
				 * Then if the updated ref is in the new pack, then we
				 * are sure the ref is good and not sending it to
				 * rev-list for verification.
				 */
		if (.close(generatedIn)) {
			err = ();
		} 
		ModernizedCProgram.sigchain_pop(SIGPIPE);
		return rev_list.finish_command() || err;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public Object getShallow_file() {
		return shallow_file;
	}
	public void setShallow_file(Object newShallow_file) {
		shallow_file = newShallow_file;
	}
	public transport getTransport() {
		return transport;
	}
	public void setTransport(transport newTransport) {
		transport = newTransport;
	}
	public int getErr_fd() {
		return err_fd;
	}
	public void setErr_fd(int newErr_fd) {
		err_fd = newErr_fd;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int newProgress) {
		progress = newProgress;
	}
	public Object getEnv() {
		return env;
	}
	public void setEnv(Object newEnv) {
		env = newEnv;
	}
	public int getIs_deepening_fetch() {
		return is_deepening_fetch;
	}
	public void setIs_deepening_fetch(int newIs_deepening_fetch) {
		is_deepening_fetch = newIs_deepening_fetch;
	}
	public int getCheck_refs_only() {
		return check_refs_only;
	}
	public void setCheck_refs_only(int newCheck_refs_only) {
		check_refs_only = newCheck_refs_only;
	}
}
/* Avoid printing any errors to stderr. */
/* CONNECTED_H */
