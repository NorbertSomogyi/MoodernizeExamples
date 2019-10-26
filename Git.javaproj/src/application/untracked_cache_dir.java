package application;

public class untracked_cache_dir {
	private untracked_cache_dir dirs;
	private Byte untracked;
	private stat_data stat_data;
	private int untracked_alloc;
	private int dirs_nr;
	private int dirs_alloc;
	private int untracked_nr;
	private int check_only;
	private int valid;
	private int recurse;
	private object_id exclude_oid;
	private Object name;
	
	public untracked_cache_dir(untracked_cache_dir dirs, Byte untracked, stat_data stat_data, int untracked_alloc, int dirs_nr, int dirs_alloc, int untracked_nr, int check_only, int valid, int recurse, object_id exclude_oid, Object name) {
		setDirs(dirs);
		setUntracked(untracked);
		setStat_data(stat_data);
		setUntracked_alloc(untracked_alloc);
		setDirs_nr(dirs_nr);
		setDirs_alloc(dirs_alloc);
		setUntracked_nr(untracked_nr);
		setCheck_only(check_only);
		setValid(valid);
		setRecurse(recurse);
		setExclude_oid(exclude_oid);
		setName(name);
	}
	public untracked_cache_dir() {
	}
	
	public untracked_cache_dir lookup_untracked(untracked_cache uc, Object name, int len) {
		int first;
		int last;
		untracked_cache_dir d = new untracked_cache_dir();
		if (!dir) {
			return ((Object)0);
		} 
		if (len && name[len - 1] == (byte)'/') {
			len--;
		} 
		first = 0;
		int generatedDirs_nr = this.getDirs_nr();
		last = generatedDirs_nr;
		untracked_cache_dir generatedDirs = this.getDirs();
		Object generatedName = d.getName();
		while (last > first) {
			int cmp;
			int next = first + ((last - first) >> 1);
			d = generatedDirs[next];
			cmp = .strncmp(name, generatedName, len);
			if (!cmp && .strlen(generatedName) > len) {
				cmp = -1;
			} 
			if (!cmp) {
				return d;
			} 
			if (cmp < 0) {
				last = next;
				continue;
			} 
			first = next + 1;
		}
		int generatedDir_created = uc.getDir_created();
		generatedDir_created++;
		do {
			size_t flex_array_len_ = (len);
			(d) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, (name), flex_array_len_);
		} while (0);
		int generatedDirs_alloc = this.getDirs_alloc();
		do {
			if ((generatedDirs_nr + 1) > generatedDirs_alloc) {
				if ((((generatedDirs_alloc) + 16) * 3 / 2) < (generatedDirs_nr + 1)) {
					this.setDirs_alloc((generatedDirs_nr + 1));
				} else {
						this.setDirs_alloc((((generatedDirs_alloc) + 16) * 3 / 2));
				} 
				(generatedDirs) = ModernizedCProgram.xrealloc((generatedDirs), ModernizedCProgram.st_mult(, (generatedDirs_alloc)));
			} 
		} while (0);
		ModernizedCProgram.move_array((generatedDirs + first + 1), (generatedDirs + first), (generatedDirs_nr - first),  + ( - 1));
		generatedDirs_nr++;
		generatedDirs[first] = d;
		return d;
	}
	public void do_invalidate_gitignore() {
		int i;
		this.setValid(0);
		this.setUntracked_nr(0);
		int generatedDirs_nr = this.getDirs_nr();
		untracked_cache_dir generatedDirs = this.getDirs();
		for (i = 0; i < generatedDirs_nr; i++) {
			generatedDirs[i].do_invalidate_gitignore();
		}
	}
	public void add_untracked(Object name) {
		if (!dir) {
			return ;
		} 
		int generatedUntracked_nr = this.getUntracked_nr();
		int generatedUntracked_alloc = this.getUntracked_alloc();
		Byte generatedUntracked = this.getUntracked();
		do {
			if ((generatedUntracked_nr + 1) > generatedUntracked_alloc) {
				if ((((generatedUntracked_alloc) + 16) * 3 / 2) < (generatedUntracked_nr + 1)) {
					this.setUntracked_alloc((generatedUntracked_nr + 1));
				} else {
						this.setUntracked_alloc((((generatedUntracked_alloc) + 16) * 3 / 2));
				} 
				(generatedUntracked) = ModernizedCProgram.xrealloc((generatedUntracked), ModernizedCProgram.st_mult(, (generatedUntracked_alloc)));
			} 
		} while (0);
		generatedUntracked[generatedUntracked_nr++] = ModernizedCProgram.xstrdup(name);
	}
	public untracked_cache_dir validate_untracked_cache(dir_struct dir, int base_len, Object pathspec) {
		untracked_cache_dir root = new untracked_cache_dir();
		int untracked_cache_disabled = -1;
		untracked_cache generatedUntracked = dir.getUntracked();
		if (!generatedUntracked) {
			return ((Object)0);
		} 
		if (untracked_cache_disabled < 0) {
			untracked_cache_disabled = .git_env_bool("GIT_DISABLE_UNTRACKED_CACHE", 0);
		} 
		if (untracked_cache_disabled) {
			return ((Object)0/*
				 * We only support $GIT_DIR/info/exclude and core.excludesfile
				 * as the global ignore rule files. Any other additions
				 * (e.g. from command line) invalidate the cache. This
				 * condition also catches running setup_standard_excludes()
				 * before setting dir->untracked!
				 */);
		} 
		int generatedUnmanaged_exclude_files = dir.getUnmanaged_exclude_files();
		if (generatedUnmanaged_exclude_files) {
			return ((Object)0/*
				 * Optimize for the main use case only: whole-tree git
				 * status. More work involved in treat_leading_path() if we
				 * use cache on just a subset of the worktree. pathspec
				 * support could make the matter even worse.
				 */);
		} 
		if (base_len || (pathspec && pathspec.getNr())) {
			return ((Object)0);
		} 
		 generatedFlags = dir.getFlags();
		int generatedDir_flags = generatedUntracked.getDir_flags();
		if (generatedFlags != generatedDir_flags || !(generatedFlags & .DIR_SHOW_OTHER_DIRECTORIES) || (generatedFlags & (.DIR_SHOW_IGNORED | /* We don't support collecting ignore files */.DIR_SHOW_IGNORED_TOO | .DIR_COLLECT_IGNORED))) {
			return ((Object)0/*
				 * If we use .gitignore in the cache and now you change it to
				 * .gitexclude, everything will go wrong.
				 */);
		} 
		Object generatedExclude_per_dir = dir.getExclude_per_dir();
		if (generatedExclude_per_dir != generatedExclude_per_dir && .strcmp(generatedExclude_per_dir, generatedExclude_per_dir)) {
			return ((Object)0/*
				 * EXC_CMDL is not considered in the cache. If people set it,
				 * skip the cache.
				 */);
		} 
		Object generatedExclude_list_group = dir.getExclude_list_group();
		if (generatedExclude_list_group[0].getNr()) {
			return ((Object)0);
		} 
		if (!ModernizedCProgram.ident_in_untracked(generatedUntracked)) {
			ModernizedCProgram.warning(ModernizedCProgram._("untracked cache is disabled on this system or location"));
			return ((Object)0);
		} 
		untracked_cache_dir generatedRoot = generatedUntracked.getRoot();
		if (!generatedRoot) {
			int len = ;
			generatedUntracked.setRoot(ModernizedCProgram.xmalloc(ModernizedCProgram.len));
			.memset(generatedRoot, 0, ModernizedCProgram.len);
		} 
		root = generatedRoot;
		oid_stat generatedSs_info_exclude = dir.getSs_info_exclude();
		object_id generatedOid = generatedSs_info_exclude.getOid();
		if (!ModernizedCProgram.oideq(generatedOid, generatedOid)) {
			ModernizedCProgram.invalidate_gitignore(generatedUntracked, root);
			generatedUntracked.setSs_info_exclude(generatedSs_info_exclude);
		} 
		oid_stat generatedSs_excludes_file = dir.getSs_excludes_file();
		if (!ModernizedCProgram.oideq(generatedOid, generatedOid)) {
			ModernizedCProgram.invalidate_gitignore(generatedUntracked, root);
			generatedUntracked.setSs_excludes_file(generatedSs_excludes_file);
		} 
		root.setRecurse(/* Make sure this directory is not dropped out at saving phase */1);
		return root;
	}
	public void free_untracked() {
		int i;
		if (!ucd) {
			return ;
		} 
		int generatedDirs_nr = this.getDirs_nr();
		untracked_cache_dir generatedDirs = this.getDirs();
		for (i = 0; i < generatedDirs_nr; i++) {
			generatedDirs[i].free_untracked();
		}
		int generatedUntracked_nr = this.getUntracked_nr();
		Byte generatedUntracked = this.getUntracked();
		for (i = 0; i < generatedUntracked_nr; i++) {
			ModernizedCProgram.free(generatedUntracked[i]);
		}
		ModernizedCProgram.free(generatedUntracked);
		ModernizedCProgram.free(generatedDirs);
		ModernizedCProgram.free(ucd);
	}
	public untracked_cache_dir getDirs() {
		return dirs;
	}
	public void setDirs(untracked_cache_dir newDirs) {
		dirs = newDirs;
	}
	public Byte getUntracked() {
		return untracked;
	}
	public void setUntracked(Byte newUntracked) {
		untracked = newUntracked;
	}
	public stat_data getStat_data() {
		return stat_data;
	}
	public void setStat_data(stat_data newStat_data) {
		stat_data = newStat_data;
	}
	public int getUntracked_alloc() {
		return untracked_alloc;
	}
	public void setUntracked_alloc(int newUntracked_alloc) {
		untracked_alloc = newUntracked_alloc;
	}
	public int getDirs_nr() {
		return dirs_nr;
	}
	public void setDirs_nr(int newDirs_nr) {
		dirs_nr = newDirs_nr;
	}
	public int getDirs_alloc() {
		return dirs_alloc;
	}
	public void setDirs_alloc(int newDirs_alloc) {
		dirs_alloc = newDirs_alloc;
	}
	public int getUntracked_nr() {
		return untracked_nr;
	}
	public void setUntracked_nr(int newUntracked_nr) {
		untracked_nr = newUntracked_nr;
	}
	public int getCheck_only() {
		return check_only;
	}
	public void setCheck_only(int newCheck_only) {
		check_only = newCheck_only;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int newValid) {
		valid = newValid;
	}
	public int getRecurse() {
		return recurse;
	}
	public void setRecurse(int newRecurse) {
		recurse = newRecurse;
	}
	public object_id getExclude_oid() {
		return exclude_oid;
	}
	public void setExclude_oid(object_id newExclude_oid) {
		exclude_oid = newExclude_oid;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
/* Statistics */
