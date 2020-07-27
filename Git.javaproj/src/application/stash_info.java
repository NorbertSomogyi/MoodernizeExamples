package application;

public class stash_info {
	private object_id w_commit;
	private object_id b_commit;
	private object_id i_commit;
	private object_id u_commit;
	private object_id w_tree;
	private object_id b_tree;
	private object_id i_tree;
	private object_id u_tree;
	private strbuf revision;
	private int is_stash_ref;
	private int has_u;
	
	public stash_info(object_id w_commit, object_id b_commit, object_id i_commit, object_id u_commit, object_id w_tree, object_id b_tree, object_id i_tree, object_id u_tree, strbuf revision, int is_stash_ref, int has_u) {
		setW_commit(w_commit);
		setB_commit(b_commit);
		setI_commit(i_commit);
		setU_commit(u_commit);
		setW_tree(w_tree);
		setB_tree(b_tree);
		setI_tree(i_tree);
		setU_tree(u_tree);
		setRevision(revision);
		setIs_stash_ref(is_stash_ref);
		setHas_u(has_u);
	}
	public stash_info() {
	}
	
	public void free_stash_info() {
		strbuf generatedRevision = this.getRevision();
		generatedRevision.strbuf_release();
	}
	public void assert_stash_like(Object revision) {
		object_id generatedB_commit = this.getB_commit();
		object_id generatedW_tree = this.getW_tree();
		object_id generatedB_tree = this.getB_tree();
		object_id generatedI_tree = this.getI_tree();
		if (generatedB_commit.get_oidf("%s^1", revision) || generatedW_tree.get_oidf("%s:", revision) || generatedB_tree.get_oidf("%s^1:", revision) || generatedI_tree.get_oidf("%s^2:", revision)) {
			ModernizedCProgram.die(ModernizedCProgram._("'%s' is not a stash-like commit"), revision);
		} 
	}
	public int get_stash_info(int argc, Object[][] argv) {
		int ret;
		byte end_of_rev;
		byte expanded_ref;
		byte revision;
		byte commit = ((Object)0);
		object_id dummy = new object_id();
		strbuf symbolic = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte[] generatedBuf = refs_msg.getBuf();
		if (argc > 1) {
			int i;
			strbuf refs_msg = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			for (i = 0; i < argc; i++) {
				refs_msg.strbuf_addf(" '%s'", argv[i]);
			}
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Too many revisions specified:%s"), generatedBuf);
			refs_msg.strbuf_release();
			return -1;
		} 
		if (argc == 1) {
			commit = argv[0];
		} 
		strbuf generatedRevision = this.getRevision();
		generatedRevision.strbuf_init(0);
		if (!commit) {
			if (!ModernizedCProgram.ref_exists(ModernizedCProgram.ref_stash)) {
				info.free_stash_info();
				(_iob[2]).fprintf_ln(ModernizedCProgram._("No stash entries found."));
				return -1;
			} 
			generatedRevision.strbuf_addf("%s@{0}", ModernizedCProgram.ref_stash);
		}  else if (/*Error: Function owner not recognized*/strspn(commit, "0123456789") == /*Error: Function owner not recognized*/strlen(commit)) {
			generatedRevision.strbuf_addf("%s@{%s}", ModernizedCProgram.ref_stash, commit);
		} else {
				generatedRevision.strbuf_addstr(commit);
		} 
		revision = generatedBuf;
		object_id generatedW_commit = this.getW_commit();
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, revision, generatedW_commit)) {
			();
			info.free_stash_info();
			return -1;
		} 
		info.assert_stash_like(revision);
		object_id generatedU_tree = this.getU_tree();
		this.setHas_u(!generatedU_tree.get_oidf("%s^3:", revision));
		end_of_rev = ModernizedCProgram.gitstrchrnul(revision, (byte)'@');
		symbolic.strbuf_add(revision, end_of_rev - revision);
		Object generatedLen = symbolic.getLen();
		ret = dummy.dwim_ref(generatedBuf, generatedLen, expanded_ref);
		symbolic.strbuf_release();
		switch (ret) {
		case 1:
				this.setIs_stash_ref(!/*Error: Function owner not recognized*/strcmp(expanded_ref, ModernizedCProgram.ref_stash));
				break;
		case /* Not found, but valid ref */0:
				this.setIs_stash_ref(0);
				break;
		default:
				info.free_stash_info();
		}
		ModernizedCProgram.free(expanded_ref);
		return !(ret == 0 || ret == 1);
	}
	public int do_apply_stash(Object prefix, int index, int quiet) {
		int ret;
		int has_index = index;
		merge_options o = new merge_options();
		object_id c_tree = new object_id();
		object_id index_tree = new object_id();
		commit result = new commit();
		object_id[] bases = new object_id();
		ModernizedCProgram.the_repository.repo_read_index_preload((((Object)0)), 0);
		if (ModernizedCProgram.the_repository.repo_refresh_and_write_index((true), (false), (false), ((Object)0), ((Object)0), ((Object)0))) {
			return -1;
		} 
		if (/*Error: Function owner not recognized*/write_cache_as_tree(c_tree, 0, ((Object)0))) {
			return ();
		} 
		object_id generatedB_tree = this.getB_tree();
		object_id generatedI_tree = this.getI_tree();
		object_id generatedW_commit = this.getW_commit();
		if (index) {
			if (ModernizedCProgram.oideq(generatedB_tree, generatedI_tree) || ModernizedCProgram.oideq(c_tree, generatedI_tree)) {
				has_index = 0;
			} else {
					strbuf out = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
					if (ModernizedCProgram.diff_tree_binary(out, generatedW_commit)) {
						out.strbuf_release();
						return ();
					} 
					ret = out.apply_cached();
					out.strbuf_release();
					if (ret) {
						return ();
					} 
					ModernizedCProgram.the_index.discard_index();
					ModernizedCProgram.the_repository.repo_read_index();
					if (/*Error: Function owner not recognized*/write_cache_as_tree(index_tree, 0, ((Object)0))) {
						return ();
					} 
					ModernizedCProgram.reset_head();
					ModernizedCProgram.the_index.discard_index();
					ModernizedCProgram.the_repository.repo_read_index();
			} 
		} 
		int generatedHas_u = this.getHas_u();
		object_id generatedU_tree = this.getU_tree();
		if (generatedHas_u && generatedU_tree.restore_untracked()) {
			return ();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/init_merge_options(o, ModernizedCProgram.the_repository);
		o.setBranch1("Updated upstream");
		o.setBranch2("Stashed changes");
		if (ModernizedCProgram.oideq(generatedB_tree, c_tree)) {
			o.setBranch1("Version stash was based on");
		} 
		if (quiet) {
			o.setVerbosity(0);
		} 
		int generatedVerbosity = o.getVerbosity();
		Object generatedBranch1 = o.getBranch1();
		Object generatedBranch2 = o.getBranch2();
		if (generatedVerbosity >= 3) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._("Merging %s with %s"), generatedBranch1, generatedBranch2);
		} 
		bases[0] = generatedB_tree;
		object_id generatedW_tree = this.getW_tree();
		ret = /*Error: Function owner not recognized*/merge_recursive_generic(o, c_tree, generatedW_tree, 1, bases, result);
		if (ret) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/repo_rerere(ModernizedCProgram.the_repository, 0);
			if (index) {
				(_iob[2]).fprintf_ln(ModernizedCProgram._("Index was not unstashed."));
			} 
			return ret;
		} 
		if (has_index) {
			if (index_tree.reset_tree(0, 0)) {
				return -1;
			} 
		} else {
				strbuf out = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				if (ModernizedCProgram.get_newly_staged(out, c_tree)) {
					out.strbuf_release();
					return -1;
				} 
				if (c_tree.reset_tree(0, 1)) {
					out.strbuf_release();
					return -1;
				} 
				ret = out.update_index();
				out.strbuf_release();
				if (ret) {
					return -1;
				} 
				ModernizedCProgram.the_index.discard_index();
		} 
		argv_array generatedEnv_array = cp.getEnv_array();
		argv_array generatedArgs = cp.getArgs();
		if (quiet) {
			if (ModernizedCProgram.the_repository.repo_refresh_and_write_index((true), (false), (false), ((Object)0), ((Object)0), ((Object)0))) {
				ModernizedCProgram.warning("could not refresh index");
			} 
		} else {
				child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
						 * Status is quite simple and could be replaced with calls to
						 * wt_status in the future, but it adds complexities which may
						 * require more tests.
						 */));
				cp.setGit_cmd(1);
				cp.setDir(prefix);
				generatedEnv_array.argv_array_pushf("GIT_WORK_TREE=%s", ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_work_tree()));
				generatedEnv_array.argv_array_pushf("GIT_DIR=%s", ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_dir()));
				generatedArgs.argv_array_push("status");
				cp.run_command();
		} 
		return 0;
	}
	public int do_drop_stash(int quiet) {
		int ret;
		child_process cp_reflog = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0/*
			 * reflog does not provide a simple function for deleting refs. One will
			 * need to be added to avoid implementing too much reflog code here
			 */));
		cp_reflog.setGit_cmd(1);
		argv_array generatedArgs = cp_reflog.getArgs();
		generatedArgs.argv_array_pushl("reflog", "delete", "--updateref", "--rewrite", ((Object)0));
		strbuf generatedRevision = this.getRevision();
		byte[] generatedBuf = generatedRevision.getBuf();
		generatedArgs.argv_array_push(generatedBuf);
		ret = cp_reflog.run_command();
		object_id generatedW_commit = this.getW_commit();
		if (!ret) {
			if (!quiet) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("Dropped %s (%s)"), generatedBuf, ModernizedCProgram.oid_to_hex(generatedW_commit));
			} 
		} else {
				return ();
		} 
		cp.setGit_cmd(/*
			 * This could easily be replaced by get_oid, but currently it will throw
			 * a fatal error when a reflog is empty, which we can not recover from.
			 */1);
		cp.setNo_stdout(/* Even though --quiet is specified, rev-parse still outputs the hash */1);
		generatedArgs.argv_array_pushl("rev-parse", "--verify", "--quiet", ((Object)0));
		generatedArgs.argv_array_pushf("%s@{0}", ModernizedCProgram.ref_stash);
		ret = cp.run_command();
		if (/* do_clear_stash if we just dropped the last stash entry */ret) {
			ModernizedCProgram.do_clear_stash();
		} 
		return 0;
	}
	public void assert_stash_ref() {
		int generatedIs_stash_ref = this.getIs_stash_ref();
		if (!generatedIs_stash_ref) {
			();
			info.free_stash_info();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\stash.c", 585, (true)));
		} 
	}
	public int stash_working_tree(Object ps) {
		int ret = 0;
		rev_info rev = new rev_info();
		child_process cp_upd_index = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf diff_output = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		index_state istate = new index_state(((Object)0));
		ModernizedCProgram.repo_init_revisions(ModernizedCProgram.the_repository, rev, ((Object)0));
		pathspec generatedPrune_data = rev.getPrune_data();
		generatedPrune_data.copy_pathspec(ps);
		ModernizedCProgram.set_alternate_index_output(ModernizedCProgram.stash_index_path.getBuf());
		object_id generatedI_tree = this.getI_tree();
		if (generatedI_tree.reset_tree(0, 0)) {
			ret = -1;
			;
		} 
		ModernizedCProgram.set_alternate_index_output(((Object)0));
		diff_options generatedDiffopt = rev.getDiffopt();
		generatedDiffopt.setOutput_format(-1024);
		generatedDiffopt.setFormat_callback(add_diff_to_buf);
		generatedDiffopt.setFormat_callback_data(diff_output);
		pathspec generatedPathspec = generatedDiffopt.getPathspec();
		if (ModernizedCProgram.the_repository.repo_read_index_preload((generatedPathspec), 0) < 0) {
			ret = -1;
			;
		} 
		object_id generatedB_commit = this.getB_commit();
		object object = new object();
		ModernizedCProgram.add_pending_object(rev, object.parse_object(ModernizedCProgram.the_repository, generatedB_commit), "");
		if (rev.run_diff_index(0)) {
			ret = -1;
			;
		} 
		cp_upd_index.setGit_cmd(1);
		argv_array generatedArgs = cp_upd_index.getArgs();
		generatedArgs.argv_array_pushl("update-index", "-z", "--add", "--remove", "--stdin", ((Object)0));
		argv_array generatedEnv_array = cp_upd_index.getEnv_array();
		generatedEnv_array.argv_array_pushf("GIT_INDEX_FILE=%s", ModernizedCProgram.stash_index_path.getBuf());
		byte[] generatedBuf = diff_output.getBuf();
		Object generatedLen = diff_output.getLen();
		if (ModernizedCProgram.pipe_command(cp_upd_index, generatedBuf, generatedLen, ((Object)0), 0, ((Object)0), 0)) {
			ret = -1;
			;
		} 
		object_id generatedW_tree = this.getW_tree();
		if (ModernizedCProgram.write_index_as_tree(generatedW_tree, istate, generatedBuf, 0, ((Object)0))) {
			ret = -1;
			;
		} 
		do {
		} while (0);
		object_array generatedPending = rev.getPending();
		generatedPending.object_array_clear();
		generatedPrune_data.clear_pathspec();
		diff_output.strbuf_release();
		ModernizedCProgram.remove_path(generatedBuf);
		return ret;
	}
	public object_id getW_commit() {
		return w_commit;
	}
	public void setW_commit(object_id newW_commit) {
		w_commit = newW_commit;
	}
	public object_id getB_commit() {
		return b_commit;
	}
	public void setB_commit(object_id newB_commit) {
		b_commit = newB_commit;
	}
	public object_id getI_commit() {
		return i_commit;
	}
	public void setI_commit(object_id newI_commit) {
		i_commit = newI_commit;
	}
	public object_id getU_commit() {
		return u_commit;
	}
	public void setU_commit(object_id newU_commit) {
		u_commit = newU_commit;
	}
	public object_id getW_tree() {
		return w_tree;
	}
	public void setW_tree(object_id newW_tree) {
		w_tree = newW_tree;
	}
	public object_id getB_tree() {
		return b_tree;
	}
	public void setB_tree(object_id newB_tree) {
		b_tree = newB_tree;
	}
	public object_id getI_tree() {
		return i_tree;
	}
	public void setI_tree(object_id newI_tree) {
		i_tree = newI_tree;
	}
	public object_id getU_tree() {
		return u_tree;
	}
	public void setU_tree(object_id newU_tree) {
		u_tree = newU_tree;
	}
	public strbuf getRevision() {
		return revision;
	}
	public void setRevision(strbuf newRevision) {
		revision = newRevision;
	}
	public int getIs_stash_ref() {
		return is_stash_ref;
	}
	public void setIs_stash_ref(int newIs_stash_ref) {
		is_stash_ref = newIs_stash_ref;
	}
	public int getHas_u() {
		return has_u;
	}
	public void setHas_u(int newHas_u) {
		has_u = newHas_u;
	}
}
