package application;

public class dir_struct {
	private int nr;
	private int alloc;
	private int ignored_nr;
	private int ignored_alloc;
	private  flags;
	private dir_entry entries;
	private dir_entry ignored;
	private Object exclude_per_dir;
	private Object exclude_list_group;
	private exclude_stack exclude_stack;
	private path_pattern pattern;
	private strbuf basebuf;
	private untracked_cache untracked;
	private oid_stat ss_info_exclude;
	private oid_stat ss_excludes_file;
	private int unmanaged_exclude_files;
	
	public dir_struct(int nr, int alloc, int ignored_nr, int ignored_alloc,  flags, dir_entry entries, dir_entry ignored, Object exclude_per_dir, Object exclude_list_group, exclude_stack exclude_stack, path_pattern pattern, strbuf basebuf, untracked_cache untracked, oid_stat ss_info_exclude, oid_stat ss_excludes_file, int unmanaged_exclude_files) {
		setNr(nr);
		setAlloc(alloc);
		setIgnored_nr(ignored_nr);
		setIgnored_alloc(ignored_alloc);
		setFlags(flags);
		setEntries(entries);
		setIgnored(ignored);
		setExclude_per_dir(exclude_per_dir);
		setExclude_list_group(exclude_list_group);
		setExclude_stack(exclude_stack);
		setPattern(pattern);
		setBasebuf(basebuf);
		setUntracked(untracked);
		setSs_info_exclude(ss_info_exclude);
		setSs_excludes_file(ss_excludes_file);
		setUnmanaged_exclude_files(unmanaged_exclude_files);
	}
	public dir_struct() {
	}
	
	public int add_files(int flags) {
		int i;
		int exit_status = 0;
		int generatedIgnored_nr = this.getIgnored_nr();
		dir_entry generatedIgnored = this.getIgnored();
		if (generatedIgnored_nr) {
			.fprintf((_iob[2]), ModernizedCProgram._(ModernizedCProgram.ignore_error));
			for (i = 0; i < generatedIgnored_nr; i++) {
				.fprintf((_iob[2]), "%s\n", generatedIgnored[i].getName());
			}
			.fprintf((_iob[2]), ModernizedCProgram._("Use -f if you really want to add them.\n"));
			exit_status = 1;
		} 
		int generatedNr = this.getNr();
		dir_entry generatedEntries = this.getEntries();
		for (i = 0; i < generatedNr; i++) {
			if (ModernizedCProgram.the_index.add_file_to_index(generatedEntries[i].getName(), flags)) {
				if (!ModernizedCProgram.ignore_add_errors) {
					ModernizedCProgram.die(ModernizedCProgram._("adding files failed"));
				} 
				exit_status = 1;
			} else {
					ModernizedCProgram.check_embedded_repo(generatedEntries[i].getName());
			} 
		}
		return exit_status;
	}
	public void add_patterns_from_file(Object fname) {
		int generatedUnmanaged_exclude_files = this.getUnmanaged_exclude_files();
		generatedUnmanaged_exclude_files++;
		ModernizedCProgram.add_patterns_from_file_1(dir, fname, ((Object)0));
	}
	public void setup_standard_excludes() {
		this.setExclude_per_dir(".gitignore");
		if (!/* core.excludesfile defaulting to $XDG_CONFIG_HOME/git/ignore */ModernizedCProgram.excludes_file) {
			ModernizedCProgram.excludes_file = ModernizedCProgram.xdg_config_home("ignore");
		} 
		untracked_cache generatedUntracked = this.getUntracked();
		oid_stat generatedSs_excludes_file = this.getSs_excludes_file();
		if (ModernizedCProgram.excludes_file && !ModernizedCProgram.access_or_warn(ModernizedCProgram.excludes_file, 4, 0)) {
			ModernizedCProgram.add_patterns_from_file_1(dir, ModernizedCProgram.excludes_file, generatedUntracked ? generatedSs_excludes_file : ((Object)0));
		} 
		oid_stat generatedSs_info_exclude = this.getSs_info_exclude();
		if (ModernizedCProgram.startup_info.getHave_repository()) {
			byte path = ModernizedCProgram.git_path_info_exclude();
			if (!ModernizedCProgram.access_or_warn(ModernizedCProgram.path, 4, 0)) {
				ModernizedCProgram.add_patterns_from_file_1(dir, ModernizedCProgram.path, generatedUntracked ? generatedSs_info_exclude : ((Object)0));
			} 
		} 
	}
	public void clear_directory() {
		int i;
		int j;
		exclude_list_group group = new exclude_list_group();
		pattern_list pl = new pattern_list();
		exclude_stack stk = new exclude_stack();
		Object generatedExclude_list_group = this.getExclude_list_group();
		int generatedNr = group.getNr();
		pattern_list generatedPl = group.getPl();
		Object generatedSrc = pl.getSrc();
		for (i = 0; i <= 2; i++) {
			group = generatedExclude_list_group[i];
			for (j = 0; j < generatedNr; j++) {
				pl = generatedPl[j];
				if (i == 1) {
					ModernizedCProgram.free((byte)generatedSrc);
				} 
				pl.clear_pattern_list();
			}
			ModernizedCProgram.free(generatedPl);
		}
		exclude_stack generatedExclude_stack = this.getExclude_stack();
		stk = generatedExclude_stack;
		exclude_stack generatedPrev = stk.getPrev();
		while (stk) {
			exclude_stack prev = generatedPrev;
			ModernizedCProgram.free(stk);
			stk = prev;
		}
		strbuf generatedBasebuf = this.getBasebuf();
		generatedBasebuf.strbuf_release();
	}
	public int check_ignore(Object prefix, int argc, Object argv) {
		byte full_path;
		byte seen;
		int num_ignored = 0;
		int i;
		path_pattern pattern = new path_pattern();
		pathspec pathspec = new pathspec();
		if (!argc) {
			if (!ModernizedCProgram.quiet) {
				.fprintf((_iob[2]), "no pathspec given.\n");
			} 
			return 0/*
				 * check-ignore just needs paths. Magic beyond :/ is really
				 * irrelevant.
				 */;
		} 
		pathspec.parse_pathspec(((1 << 0) | (1 << 1) | (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5) | (1 << 6)) & ~(1 << 0), (1 << 3) | (1 << 5), prefix, argv);
		ModernizedCProgram.die_path_inside_submodule(ModernizedCProgram.the_index, pathspec/*
			 * look for pathspecs matching entries in the index, since these
			 * should not be ignored, in order to be consistent with
			 * 'git status', 'git add' etc.
			 */);
		seen = ModernizedCProgram.find_pathspecs_matching_against_index(pathspec, ModernizedCProgram.the_index);
		int generatedNr = pathspec.getNr();
		pathspec_item generatedItems = pathspec.getItems();
		path_pattern path_pattern = new path_pattern();
		for (i = 0; i < generatedNr; i++) {
			full_path = generatedItems[i].getMatch();
			pattern = ((Object)0);
			if (!seen[i]) {
				int dtype = 0;
				pattern = path_pattern.last_matching_pattern(dir, ModernizedCProgram.the_index, full_path, dtype);
			} 
			if (!ModernizedCProgram.quiet && (pattern || ModernizedCProgram.show_non_matching)) {
				pattern.output_pattern(generatedItems[i].getOriginal());
			} 
			if (pattern) {
				num_ignored++;
			} 
		}
		ModernizedCProgram.free(seen);
		return num_ignored;
	}
	public int check_ignore_stdin_paths(Object prefix) {
		strbuf buf = new strbuf(, , );
		strbuf unquoted = new strbuf(, , );
		byte[] pathspec = new byte[]{((Object)0), ((Object)0)};
		strbuf_getline_fn getline_fn = new strbuf_getline_fn();
		int num_ignored = 0;
		getline_fn = ModernizedCProgram.nul_term_line ? ModernizedCProgram.strbuf_getline_nul : ModernizedCProgram.strbuf_getline_lf;
		byte generatedBuf = buf.getBuf();
		while (.getline_fn(buf, (_iob[0])) != (true)) {
			if (!ModernizedCProgram.nul_term_line && generatedBuf[0] == (byte)'"') {
				unquoted.strbuf_setlen(0);
				if (unquoted.unquote_c_style(generatedBuf, ((Object)0))) {
					ModernizedCProgram.die("line is badly quoted");
				} 
				buf.strbuf_swap(unquoted);
			} 
			pathspec[0] = generatedBuf;
			num_ignored += dir.check_ignore(prefix, 1, (byte)pathspec);
			(_iob[1]).maybe_flush_or_die("check-ignore to stdout");
		}
		buf.strbuf_release();
		unquoted.strbuf_release();
		return num_ignored;
	}
	public void correct_untracked_entries() {
		int src;
		int dst;
		int ign;
		int generatedNr = this.getNr();
		int generatedIgnored_nr = this.getIgnored_nr();
		dir_entry generatedEntries = this.getEntries();
		dir_entry generatedIgnored = this.getIgnored();
		for (src = dst = ign = 0; src < generatedNr; src++) {
			while (ign < generatedIgnored_nr && 0 <= ModernizedCProgram.cmp_dir_entry(generatedEntries[src], generatedIgnored[ign])) {
				ign++;
			}
			if (ign < generatedIgnored_nr && ModernizedCProgram.check_dir_entry_contains(generatedEntries[src], generatedIgnored[ign])) {
				ModernizedCProgram.free(generatedEntries[/* entries[src] contains an ignored path, so we drop it */src]);
			} else {
					dir_entry ent = generatedEntries[src++];
					generatedEntries[dst++] = /* entries[src] does not contain an ignored path, so we keep it */ent;
					while (src < generatedNr && ModernizedCProgram.check_dir_entry_contains(ent, generatedEntries[src])) {
						ModernizedCProgram.free(generatedEntries[src++]);
					}
					/* compensate for the outer loop's loop control */src--;
			} 
		}
		this.setNr(dst);
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getIgnored_nr() {
		return ignored_nr;
	}
	public void setIgnored_nr(int newIgnored_nr) {
		ignored_nr = newIgnored_nr;
	}
	public int getIgnored_alloc() {
		return ignored_alloc;
	}
	public void setIgnored_alloc(int newIgnored_alloc) {
		ignored_alloc = newIgnored_alloc;
	}
	public  getFlags() {
		return flags;
	}
	public void setFlags( newFlags) {
		flags = newFlags;
	}
	public dir_entry getEntries() {
		return entries;
	}
	public void setEntries(dir_entry newEntries) {
		entries = newEntries;
	}
	public dir_entry getIgnored() {
		return ignored;
	}
	public void setIgnored(dir_entry newIgnored) {
		ignored = newIgnored;
	}
	public Object getExclude_per_dir() {
		return exclude_per_dir;
	}
	public void setExclude_per_dir(Object newExclude_per_dir) {
		exclude_per_dir = newExclude_per_dir;
	}
	public Object getExclude_list_group() {
		return exclude_list_group;
	}
	public void setExclude_list_group(Object newExclude_list_group) {
		exclude_list_group = newExclude_list_group;
	}
	public exclude_stack getExclude_stack() {
		return exclude_stack;
	}
	public void setExclude_stack(exclude_stack newExclude_stack) {
		exclude_stack = newExclude_stack;
	}
	public path_pattern getPattern() {
		return pattern;
	}
	public void setPattern(path_pattern newPattern) {
		pattern = newPattern;
	}
	public strbuf getBasebuf() {
		return basebuf;
	}
	public void setBasebuf(strbuf newBasebuf) {
		basebuf = newBasebuf;
	}
	public untracked_cache getUntracked() {
		return untracked;
	}
	public void setUntracked(untracked_cache newUntracked) {
		untracked = newUntracked;
	}
	public oid_stat getSs_info_exclude() {
		return ss_info_exclude;
	}
	public void setSs_info_exclude(oid_stat newSs_info_exclude) {
		ss_info_exclude = newSs_info_exclude;
	}
	public oid_stat getSs_excludes_file() {
		return ss_excludes_file;
	}
	public void setSs_excludes_file(oid_stat newSs_excludes_file) {
		ss_excludes_file = newSs_excludes_file;
	}
	public int getUnmanaged_exclude_files() {
		return unmanaged_exclude_files;
	}
	public void setUnmanaged_exclude_files(int newUnmanaged_exclude_files) {
		unmanaged_exclude_files = newUnmanaged_exclude_files;
	}
}
