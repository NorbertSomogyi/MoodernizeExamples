package application;

public class worktree {
	private Byte path;
	private Byte id;
	private Byte head_ref;
	private Byte lock_reason;
	private object_id head_oid;
	private int is_detached;
	private int is_bare;
	private int is_current;
	private int lock_reason_valid;
	
	public worktree(Byte path, Byte id, Byte head_ref, Byte lock_reason, object_id head_oid, int is_detached, int is_bare, int is_current, int lock_reason_valid) {
		setPath(path);
		setId(id);
		setHead_ref(head_ref);
		setLock_reason(lock_reason);
		setHead_oid(head_oid);
		setIs_detached(is_detached);
		setIs_bare(is_bare);
		setIs_current(is_current);
		setLock_reason_valid(lock_reason_valid);
	}
	public worktree() {
	}
	
	public void show_worktree_porcelain() {
		Byte generatedPath = this.getPath();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("worktree %s\n", generatedPath);
		int generatedIs_bare = this.getIs_bare();
		object_id generatedHead_oid = this.getHead_oid();
		int generatedIs_detached = this.getIs_detached();
		Byte generatedHead_ref = this.getHead_ref();
		if (generatedIs_bare) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("bare\n");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("HEAD %s\n", ModernizedCProgram.oid_to_hex(generatedHead_oid));
				if (generatedIs_detached) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("detached\n");
				}  else if (generatedHead_ref) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("branch %s\n", generatedHead_ref);
				} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n");
	}
	public void show_worktree(int path_maxlen, int abbrev_len) {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Byte generatedPath = this.getPath();
		int cur_path_len = /*Error: Function owner not recognized*/strlen(generatedPath);
		int path_adj = cur_path_len - ModernizedCProgram.utf8_strwidth(generatedPath);
		sb.strbuf_addf("%-*s ", 1 + path_maxlen + path_adj, generatedPath);
		int generatedIs_bare = this.getIs_bare();
		object_id generatedHead_oid = this.getHead_oid();
		int generatedIs_detached = this.getIs_detached();
		Byte generatedHead_ref = this.getHead_ref();
		if (generatedIs_bare) {
			sb.strbuf_addstr("(bare)");
		} else {
				sb.strbuf_addf("%-*s ", abbrev_len, ModernizedCProgram.the_repository.repo_find_unique_abbrev(generatedHead_oid, ModernizedCProgram.default_abbrev));
				if (generatedIs_detached) {
					sb.strbuf_addstr("(detached HEAD)");
				}  else if (generatedHead_ref) {
					byte ref = ModernizedCProgram.shorten_unambiguous_ref(generatedHead_ref, 0);
					sb.strbuf_addf("[%s]", ref);
					ModernizedCProgram.free(ref);
				} else {
						sb.strbuf_addstr("(error)");
				} 
		} 
		byte[] generatedBuf = sb.getBuf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", generatedBuf);
		sb.strbuf_release();
	}
	public void measure_widths(Integer abbrev, Integer maxlen) {
		int i;
		for (i = 0; wt[i]; i++) {
			int sha1_len;
			int path_len = /*Error: Function owner not recognized*/strlen(wt[i].getPath());
			if (path_len > maxlen) {
				maxlen = path_len;
			} 
			sha1_len = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.the_repository.repo_find_unique_abbrev(wt[i].getHead_oid(), abbrev));
			if (sha1_len > abbrev) {
				abbrev = sha1_len;
			} 
		}
	}
	public void check_clean_worktree(Object original_path) {
		argv_array child_env = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		child_process cp = new child_process();
		byte[] buf = new byte[1];
		int ret;
		/*
			 * Until we sort this out, all submodules are "dirty" and
			 * will abort this function.
			 */
		ModernizedCProgram.validate_no_submodules(wt);
		Byte generatedPath = this.getPath();
		child_env.argv_array_pushf("%s=%s/.git", "GIT_DIR", generatedPath);
		child_env.argv_array_pushf("%s=%s", "GIT_WORK_TREE", generatedPath);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cp, 0, /*Error: sizeof expression not supported yet*/);
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_pushl("status", "--porcelain", "--ignore-submodules=none", ((Object)0));
		Object[][] generatedArgv = child_env.getArgv();
		cp.setEnv(generatedArgv);
		cp.setGit_cmd(1);
		cp.setDir(generatedPath);
		cp.setOut(-1);
		ret = cp.start_command();
		if (ret) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to run 'git status' on '%s'"), original_path);
		} 
		int generatedOut = cp.getOut();
		ret = ModernizedCProgram.xread(generatedOut, buf, /*Error: sizeof expression not supported yet*/);
		if (ret) {
			ModernizedCProgram.die(ModernizedCProgram._("'%s' contains modified or untracked files, use --force to delete it"), original_path);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedOut);
		ret = cp.finish_command();
		if (ret) {
			ModernizedCProgram.die_errno(ModernizedCProgram._("failed to run 'git status' on '%s', code %d"), original_path, ret);
		} 
	}
	public int delete_git_work_tree() {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret = 0;
		Byte generatedPath = this.getPath();
		sb.strbuf_addstr(generatedPath);
		if (sb.remove_dir_recursively(0)) {
			();
			ret = -1;
		} 
		sb.strbuf_release();
		return ret;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getId() {
		return id;
	}
	public void setId(Byte newId) {
		id = newId;
	}
	public Byte getHead_ref() {
		return head_ref;
	}
	public void setHead_ref(Byte newHead_ref) {
		head_ref = newHead_ref;
	}
	public Byte getLock_reason() {
		return lock_reason;
	}
	public void setLock_reason(Byte newLock_reason) {
		lock_reason = newLock_reason;
	}
	public object_id getHead_oid() {
		return head_oid;
	}
	public void setHead_oid(object_id newHead_oid) {
		head_oid = newHead_oid;
	}
	public int getIs_detached() {
		return is_detached;
	}
	public void setIs_detached(int newIs_detached) {
		is_detached = newIs_detached;
	}
	public int getIs_bare() {
		return is_bare;
	}
	public void setIs_bare(int newIs_bare) {
		is_bare = newIs_bare;
	}
	public int getIs_current() {
		return is_current;
	}
	public void setIs_current(int newIs_current) {
		is_current = newIs_current;
	}
	public int getLock_reason_valid() {
		return lock_reason_valid;
	}
	public void setLock_reason_valid(int newLock_reason_valid) {
		lock_reason_valid = newLock_reason_valid;
	}
}
/*
 * Returns 1 if linked worktrees exist, 0 otherwise.
 */
/*
 * Similar to head_ref() for all HEADs _except_ one from the current
 * worktree, which is covered by head_ref().
 */
