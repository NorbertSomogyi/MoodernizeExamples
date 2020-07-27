package application;

/*
 * You _have_ to initialize a `struct repository_format` using
 * `= REPOSITORY_FORMAT_INIT` before calling `read_repository_format()`.
 */
public class repository_format {
	private int version;
	private int precious_objects;
	private Byte partial_clone;
	private int worktree_config;
	private int is_bare;
	private int hash_algo;
	private Byte work_tree;
	private string_list unknown_extensions;
	
	public repository_format(int version, int precious_objects, Byte partial_clone, int worktree_config, int is_bare, int hash_algo, Byte work_tree, string_list unknown_extensions) {
		setVersion(version);
		setPrecious_objects(precious_objects);
		setPartial_clone(partial_clone);
		setWorktree_config(worktree_config);
		setIs_bare(is_bare);
		setHash_algo(hash_algo);
		setWork_tree(work_tree);
		setUnknown_extensions(unknown_extensions);
	}
	public repository_format() {
	}
	
	public int read_and_verify_repository_format(Object commondir) {
		int ret = 0;
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		sb.strbuf_addf("%s/config", commondir);
		byte[] generatedBuf = sb.getBuf();
		format.read_repository_format(generatedBuf);
		sb.strbuf_setlen(0);
		if (sb.verify_repository_format(format) < 0) {
			ModernizedCProgram.warning("%s", generatedBuf);
			ret = -1;
		} 
		sb.strbuf_release();
		return ret/*
		 * Initialize 'repo' based on the provided 'gitdir'.
		 * Return 0 upon success and a non-zero value upon failure.
		 */;
	}
	public int check_repository_format_gently(Object gitdir, Integer nongit_ok) {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int has_common;
		has_common = sb.get_common_dir(gitdir);
		sb.strbuf_addstr("/config");
		byte[] generatedBuf = sb.getBuf();
		candidate.read_repository_format(generatedBuf);
		sb/*
			 * For historical use of check_repository_format() in git-init,
			 * we treat a missing config as a silent "ok", even when nongit_ok
			 * is unset.
			 */.strbuf_release();
		int generatedVersion = this.getVersion();
		if (generatedVersion < 0) {
			return 0;
		} 
		if (err.verify_repository_format(candidate) < 0) {
			if (nongit_ok) {
				ModernizedCProgram.warning("%s", generatedBuf);
				err.strbuf_release();
				nongit_ok = -1;
				return -1;
			} 
			ModernizedCProgram.die("%s", generatedBuf);
		} 
		int generatedPrecious_objects = this.getPrecious_objects();
		ModernizedCProgram.repository_format_precious_objects = generatedPrecious_objects;
		Byte generatedPartial_clone = this.getPartial_clone();
		ModernizedCProgram.set_repository_format_partial_clone(generatedPartial_clone);
		int generatedWorktree_config = this.getWorktree_config();
		ModernizedCProgram.repository_format_worktree_config = generatedWorktree_config;
		string_list generatedUnknown_extensions = this.getUnknown_extensions();
		generatedUnknown_extensions.string_list_clear(0);
		if (ModernizedCProgram.repository_format_worktree_config/*
				 * pick up core.bare and core.worktree from per-worktree
				 * config if present
				 */) {
			sb.strbuf_addf("%s/config.worktree", gitdir);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_from_file(read_worktree_config, generatedBuf, candidate);
			sb.strbuf_release();
			has_common = 0;
		} 
		int generatedIs_bare = this.getIs_bare();
		Byte generatedWork_tree = this.getWork_tree();
		if (!has_common) {
			if (generatedIs_bare != -1) {
				ModernizedCProgram.is_bare_repository_cfg = generatedIs_bare;
				if (ModernizedCProgram.is_bare_repository_cfg == 1) {
					ModernizedCProgram.inside_work_tree = -1;
				} 
			} 
			if (generatedWork_tree) {
				ModernizedCProgram.free(ModernizedCProgram.git_work_tree_cfg);
				ModernizedCProgram.git_work_tree_cfg = ModernizedCProgram.xstrdup(generatedWork_tree);
				ModernizedCProgram.inside_work_tree = -1;
			} 
		} 
		return 0;
	}
	public void init_repository_format() {
		repository_format fresh = new repository_format(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(format, fresh, /*Error: sizeof expression not supported yet*/);
	}
	public int read_repository_format(Object path) {
		format.clear_repository_format();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_from_file(check_repo_format, path, format);
		int generatedVersion = this.getVersion();
		if (generatedVersion == -1) {
			format.clear_repository_format();
		} 
		return generatedVersion;
	}
	public void clear_repository_format() {
		string_list generatedUnknown_extensions = this.getUnknown_extensions();
		generatedUnknown_extensions.string_list_clear(0);
		Byte generatedWork_tree = this.getWork_tree();
		ModernizedCProgram.free(generatedWork_tree);
		Byte generatedPartial_clone = this.getPartial_clone();
		ModernizedCProgram.free(generatedPartial_clone);
		format.init_repository_format();
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
	public int getPrecious_objects() {
		return precious_objects;
	}
	public void setPrecious_objects(int newPrecious_objects) {
		precious_objects = newPrecious_objects;
	}
	public Byte getPartial_clone() {
		return partial_clone;
	}
	public void setPartial_clone(Byte newPartial_clone) {
		partial_clone = newPartial_clone;
	}
	public int getWorktree_config() {
		return worktree_config;
	}
	public void setWorktree_config(int newWorktree_config) {
		worktree_config = newWorktree_config;
	}
	public int getIs_bare() {
		return is_bare;
	}
	public void setIs_bare(int newIs_bare) {
		is_bare = newIs_bare;
	}
	public int getHash_algo() {
		return hash_algo;
	}
	public void setHash_algo(int newHash_algo) {
		hash_algo = newHash_algo;
	}
	public Byte getWork_tree() {
		return work_tree;
	}
	public void setWork_tree(Byte newWork_tree) {
		work_tree = newWork_tree;
	}
	public string_list getUnknown_extensions() {
		return unknown_extensions;
	}
	public void setUnknown_extensions(string_list newUnknown_extensions) {
		unknown_extensions = newUnknown_extensions;
	}
}
