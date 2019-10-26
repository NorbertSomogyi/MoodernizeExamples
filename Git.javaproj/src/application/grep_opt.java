package application;

public class grep_opt {
	private grep_pat pattern_list;
	private grep_pat pattern_tail;
	private grep_pat header_list;
	private grep_pat header_tail;
	private grep_expr pattern_expression;
	private repository repo;
	private Object prefix;
	private int prefix_length;
	private Object regexp;
	private int linenum;
	private int columnnum;
	private int invert;
	private int ignore_case;
	private int status_only;
	private int name_only;
	private int unmatch_name_only;
	private int count;
	private int word_regexp;
	private int fixed;
	private int all_match;
	private int debug;
	private int binary;
	private int allow_textconv;
	private int extended;
	private int use_reflog_filter;
	private int pcre1;
	private int pcre2;
	private int relative;
	private int pathname;
	private int null_following_name;
	private int only_matching;
	private int color;
	private int max_depth;
	private int funcname;
	private int funcbody;
	private int extended_regexp_option;
	private int pattern_type_option;
	private int ignore_locale;
	private Object colors;
	private int pre_context;
	private int post_context;
	private int last_shown;
	private int show_hunk_mark;
	private int file_break;
	private int heading;
	private Object priv;
	private Object output;
	private Object output_priv;
	
	public grep_opt(grep_pat pattern_list, grep_pat pattern_tail, grep_pat header_list, grep_pat header_tail, grep_expr pattern_expression, repository repo, Object prefix, int prefix_length, Object regexp, int linenum, int columnnum, int invert, int ignore_case, int status_only, int name_only, int unmatch_name_only, int count, int word_regexp, int fixed, int all_match, int debug, int binary, int allow_textconv, int extended, int use_reflog_filter, int pcre1, int pcre2, int relative, int pathname, int null_following_name, int only_matching, int color, int max_depth, int funcname, int funcbody, int extended_regexp_option, int pattern_type_option, int ignore_locale, Object colors, int pre_context, int post_context, int last_shown, int show_hunk_mark, int file_break, int heading, Object priv, Object output, Object output_priv) {
		setPattern_list(pattern_list);
		setPattern_tail(pattern_tail);
		setHeader_list(header_list);
		setHeader_tail(header_tail);
		setPattern_expression(pattern_expression);
		setRepo(repo);
		setPrefix(prefix);
		setPrefix_length(prefix_length);
		setRegexp(regexp);
		setLinenum(linenum);
		setColumnnum(columnnum);
		setInvert(invert);
		setIgnore_case(ignore_case);
		setStatus_only(status_only);
		setName_only(name_only);
		setUnmatch_name_only(unmatch_name_only);
		setCount(count);
		setWord_regexp(word_regexp);
		setFixed(fixed);
		setAll_match(all_match);
		setDebug(debug);
		setBinary(binary);
		setAllow_textconv(allow_textconv);
		setExtended(extended);
		setUse_reflog_filter(use_reflog_filter);
		setPcre1(pcre1);
		setPcre2(pcre2);
		setRelative(relative);
		setPathname(pathname);
		setNull_following_name(null_following_name);
		setOnly_matching(only_matching);
		setColor(color);
		setMax_depth(max_depth);
		setFuncname(funcname);
		setFuncbody(funcbody);
		setExtended_regexp_option(extended_regexp_option);
		setPattern_type_option(pattern_type_option);
		setIgnore_locale(ignore_locale);
		setColors(colors);
		setPre_context(pre_context);
		setPost_context(post_context);
		setLast_shown(last_shown);
		setShow_hunk_mark(show_hunk_mark);
		setFile_break(file_break);
		setHeading(heading);
		setPriv(priv);
		setOutput(output);
		setOutput_priv(output_priv);
	}
	public grep_opt() {
	}
	
	/* Signalled when we are finished with everything. */
	public void add_work(Object gs) {
		ModernizedCProgram.grep_lock();
		while ((ModernizedCProgram.todo_end + 1) % ( /  + ( - 1)) == ModernizedCProgram.todo_done) {
			.pthread_cond_wait(ModernizedCProgram.cond_write, ModernizedCProgram.grep_mutex);
		}
		ModernizedCProgram.todo[ModernizedCProgram.todo_end].setSource(gs);
		int generatedBinary = this.getBinary();
		repository generatedRepo = this.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		if (generatedBinary != 2) {
			.grep_source_load_driver(ModernizedCProgram.todo[ModernizedCProgram.todo_end].getSource(), generatedIndex);
		} 
		ModernizedCProgram.todo[ModernizedCProgram.todo_end].setDone(0);
		ModernizedCProgram.todo[ModernizedCProgram.todo_end].getOut().strbuf_setlen(0);
		ModernizedCProgram.todo_end = (ModernizedCProgram.todo_end + 1) % ( /  + ( - 1));
		.pthread_cond_signal(ModernizedCProgram.cond_add);
		ModernizedCProgram.grep_unlock();
	}
	public void strbuf_out(Object buf, Object size) {
		Object generatedOutput_priv = this.getOutput_priv();
		work_item w = generatedOutput_priv;
		strbuf generatedOut = w.getOut();
		generatedOut.strbuf_add(buf, size);
	}
	public void start_threads() {
		int i;
		.pthread_mutex_init(ModernizedCProgram.grep_mutex, ((Object)0));
		.pthread_mutex_init(ModernizedCProgram.grep_read_mutex, ((Object)0));
		.pthread_mutex_init(ModernizedCProgram.grep_attr_mutex, ((Object)0));
		.pthread_cond_init(ModernizedCProgram.cond_add, ((Object)0));
		.pthread_cond_init(ModernizedCProgram.cond_write, ((Object)0));
		.pthread_cond_init(ModernizedCProgram.cond_result, ((Object)0));
		ModernizedCProgram.grep_use_locks = 1;
		for (i = 0; i < ( /  + ( - 1)); i++) {
			ModernizedCProgram.todo[i].getOut().strbuf_init(0);
		}
		ModernizedCProgram.threads = ModernizedCProgram.xcalloc(ModernizedCProgram.num_threads, );
		for (i = 0; i < ModernizedCProgram.num_threads; i++) {
			int err;
			grep_opt o = .grep_opt_dup(opt);
			o.setOutput(strbuf_out);
			if (i) {
				o.setDebug(0);
			} 
			.compile_grep_patterns(o);
			ModernizedCProgram.err = ModernizedCProgram.threads[i].pthread_create(((Object)0), run, o);
			if (ModernizedCProgram.err) {
				ModernizedCProgram.die(ModernizedCProgram._("grep: failed to create thread: %s"), .strerror(ModernizedCProgram.err));
			} 
		}
	}
	public int grep_oid(Object oid, Object filename, int tree_name_len, Object path) {
		strbuf pathbuf = new strbuf(, , );
		grep_source gs = new grep_source();
		int generatedRelative = this.getRelative();
		int generatedPrefix_length = this.getPrefix_length();
		Object generatedPrefix = this.getPrefix();
		if (generatedRelative && generatedPrefix_length) {
			pathbuf.quote_path_relative(filename + tree_name_len, generatedPrefix);
			pathbuf.strbuf_insert(0, filename, tree_name_len);
		} else {
				pathbuf.strbuf_addstr(filename);
		} 
		byte generatedBuf = pathbuf.getBuf();
		.grep_source_init(gs, grep_source_type.GREP_SOURCE_OID, generatedBuf, path, oid);
		pathbuf.strbuf_release();
		if (ModernizedCProgram.num_threads > 1/*
				 * add_work() copies gs and thus assumes ownership of
				 * its fields, so do not call grep_source_clear()
				 */) {
			opt.add_work(gs);
			return 0;
		} else {
				int hit;
				hit = .grep_source(opt, gs);
				.grep_source_clear(gs);
				return hit;
		} 
	}
	public int grep_file(Object filename) {
		strbuf buf = new strbuf(, , );
		grep_source gs = new grep_source();
		int generatedRelative = this.getRelative();
		int generatedPrefix_length = this.getPrefix_length();
		Object generatedPrefix = this.getPrefix();
		if (generatedRelative && generatedPrefix_length) {
			buf.quote_path_relative(filename, generatedPrefix);
		} else {
				buf.strbuf_addstr(filename);
		} 
		byte generatedBuf = buf.getBuf();
		.grep_source_init(gs, grep_source_type.GREP_SOURCE_FILE, generatedBuf, filename, filename);
		buf.strbuf_release();
		if (ModernizedCProgram.num_threads > 1/*
				 * add_work() copies gs and thus assumes ownership of
				 * its fields, so do not call grep_source_clear()
				 */) {
			opt.add_work(gs);
			return 0;
		} else {
				int hit;
				hit = .grep_source(opt, gs);
				.grep_source_clear(gs);
				return hit;
		} 
	}
	public void append_path(Object data, Object len) {
		Object generatedOutput_priv = this.getOutput_priv();
		string_list path_list = generatedOutput_priv;
		if (len == 1 && (byte)data == (byte)'\0') {
			return ;
		} 
		path_list.string_list_append(ModernizedCProgram.xstrndup(data, len));
	}
	public void run_pager(Object prefix) {
		Object generatedOutput_priv = this.getOutput_priv();
		string_list path_list = generatedOutput_priv;
		child_process child = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		int i;
		int status;
		int generatedNr = path_list.getNr();
		argv_array generatedArgs = child.getArgs();
		string_list_item generatedItems = path_list.getItems();
		for (i = 0; i < generatedNr; i++) {
			generatedArgs.argv_array_push(generatedItems[i].getString());
		}
		child.setDir(prefix);
		child.setUse_shell(1);
		status = child.run_command();
		if (status) {
			.exit(ModernizedCProgram.trace2_cmd_exit_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\grep.c", 394, (status)));
		} 
	}
	public int grep_submodule(Object pathspec, Object oid, Object filename, Object path, int cached) {
		repository subrepo = new repository();
		repository generatedRepo = this.getRepo();
		repository superproject = generatedRepo;
		submodule sub = superproject.submodule_from_path(ModernizedCProgram.null_oid, path);
		grep_opt subopt = new grep_opt();
		int hit;
		/*
			 * NEEDSWORK: submodules functions need to be protected because they
			 * access the object store via config_from_gitmodules(): the latter
			 * uses get_oid() which, for now, relies on the global the_repository
			 * object.
			 */
		ModernizedCProgram.grep_read_lock();
		if (!superproject.is_submodule_active(path)) {
			ModernizedCProgram.grep_read_unlock();
			return 0;
		} 
		if (subrepo.repo_submodule_init(superproject, sub)) {
			ModernizedCProgram.grep_read_unlock();
			return 0;
		} 
		subrepo/*
			 * NEEDSWORK: This adds the submodule's object directory to the list of
			 * alternates for the single in-memory object store.  This has some bad
			 * consequences for memory (processed objects will never be freed) and
			 * performance (this increases the number of pack files git has to pay
			 * attention to, to the sum of the number of pack files in all the
			 * repositories processed so far).  This can be removed once the object
			 * store is no longer global and instead is a member of the repository
			 * object.
			 */.repo_read_gitmodules();
		raw_object_store generatedObjects = subrepo.getObjects();
		object_directory generatedOdb = generatedObjects.getOdb();
		Byte generatedPath = generatedOdb.getPath();
		ModernizedCProgram.add_to_alternates_memory(generatedPath);
		ModernizedCProgram.grep_read_unlock();
		.memcpy(subopt, opt, );
		subopt.setRepo(subrepo);
		object object = new object();
		object_id generatedOid = object.getOid();
		Object generatedLen = base.getLen();
		int generatedType = object.getType();
		if (oid) {
			object object = new object();
			tree_desc tree = new tree_desc();
			Object data;
			long size;
			strbuf base = new strbuf(, , );
			object = object.parse_object_or_die(oid, ModernizedCProgram.oid_to_hex(oid));
			ModernizedCProgram.grep_read_lock();
			data = ModernizedCProgram.read_object_with_reference(subrepo, generatedOid, ModernizedCProgram.tree_type, size, ((Object)0));
			ModernizedCProgram.grep_read_unlock();
			if (!data) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to read tree (%s)"), ModernizedCProgram.oid_to_hex(generatedOid));
			} 
			base.strbuf_addstr(filename);
			base.strbuf_addch((byte)'/');
			tree.init_tree_desc(data, size);
			hit = ModernizedCProgram.grep_tree(subopt, pathspec, tree, base, generatedLen, generatedType == object_type.OBJ_COMMIT);
			base.strbuf_release();
			ModernizedCProgram.free(data);
		} else {
				hit = subopt.grep_cache(pathspec, cached);
		} 
		subrepo.repo_clear();
		return hit;
	}
	public int grep_cache(Object pathspec, int cached) {
		repository generatedRepo = this.getRepo();
		repository repo = generatedRepo;
		int hit = 0;
		int nr;
		strbuf name = new strbuf(, , );
		int name_base_len = 0;
		Byte generatedSubmodule_prefix = repo.getSubmodule_prefix();
		if (generatedSubmodule_prefix) {
			name_base_len = .strlen(generatedSubmodule_prefix);
			name.strbuf_addstr(generatedSubmodule_prefix);
		} 
		if (repo.repo_read_index() < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("index file corrupt"));
		} 
		index_state generatedIndex = repo.getIndex();
		int generatedCache_nr = generatedIndex.getCache_nr();
		cache_entry generatedCache = generatedIndex.getCache();
		byte generatedBuf = name.getBuf();
		Object generatedLen = name.getLen();
		int generatedStatus_only = this.getStatus_only();
		for (nr = 0; nr < generatedCache_nr; nr++) {
			cache_entry ce = generatedCache[nr];
			name.strbuf_setlen(name_base_len);
			name.strbuf_addstr(ce.getName());
			if ((((ce.getCe_mode()) & -1024) == -1024) && ModernizedCProgram.match_pathspec(generatedIndex, pathspec, generatedBuf, generatedLen, 0, ((Object)0), (((ce.getCe_mode()) & -1024) == -1024) || (((ce.getCe_mode()) & -1024) == 160000/*
						 * If CE_VALID is on, we assume worktree file and its
						 * cache entry are identical, even if worktree file has
						 * been modified, so use cache version instead
						 */))) {
				if (cached || (ce.getCe_flags() & (true)) || ((ce).getCe_flags() & (1 << 30))) {
					if ((((true) & (ce).getCe_flags()) >> 12) || ((ce).getCe_flags() & (1 << 29))) {
						continue;
					} 
					hit |=  opt.grep_oid(ce.getOid(), generatedBuf, 0, generatedBuf);
				} else {
						hit |=  opt.grep_file(generatedBuf);
				} 
			}  else if (ModernizedCProgram.recurse_submodules && (((ce.getCe_mode()) & -1024) == 160000) && ModernizedCProgram.submodule_path_match(generatedIndex, pathspec, generatedBuf, ((Object)0))) {
				hit |=  opt.grep_submodule(pathspec, ((Object)0), ce.getName(), ce.getName(), cached);
			} else {
					continue;
			} 
			if ((((true) & (ce).getCe_flags()) >> 12)) {
				do {
					nr++;
				} while (nr < generatedCache_nr && !.strcmp(ce.getName(), generatedCache[nr].getName()));
				/* compensate for loop control */nr--;
			} 
			if (hit && generatedStatus_only) {
				break;
			} 
		}
		name.strbuf_release();
		return hit;
	}
	public int grep_objects(Object pathspec, Object list) {
		int i;
		int hit = 0;
		int nr = list.getNr();
		repository generatedRepo = this.getRepo();
		object_id generatedOid = real_obj.getOid();
		int generatedStatus_only = this.getStatus_only();
		for (i = 0; i < nr; i++) {
			object real_obj = new object();
			real_obj = .deref_tag(generatedRepo, list.getObjects()[i].getItem(), ((Object)0), 0);
			if (/* load the gitmodules file for this rev */ModernizedCProgram.recurse_submodules) {
				generatedRepo.submodule_free();
				ModernizedCProgram.gitmodules_config_oid(generatedOid);
			} 
			if (ModernizedCProgram.grep_object(opt, pathspec, real_obj, list.getObjects()[i].getName(), list.getObjects()[i].getPath())) {
				hit = 1;
				if (generatedStatus_only) {
					break;
				} 
			} 
		}
		return hit;
	}
	public int grep_directory(Object pathspec, int exc_std, int use_index) {
		dir_struct dir = new dir_struct();
		int i;
		int hit = 0;
		.memset(dir, 0, );
		 generatedFlags = dir.getFlags();
		if (!use_index) {
			generatedFlags |=  .DIR_NO_GITLINKS;
		} 
		if (exc_std) {
			dir.setup_standard_excludes();
		} 
		repository generatedRepo = this.getRepo();
		index_state generatedIndex = generatedRepo.getIndex();
		ModernizedCProgram.fill_directory(dir, generatedIndex, pathspec);
		int generatedNr = dir.getNr();
		dir_entry generatedEntries = dir.getEntries();
		int generatedStatus_only = this.getStatus_only();
		for (i = 0; i < generatedNr; i++) {
			if (!ModernizedCProgram.dir_path_match(generatedIndex, generatedEntries[i], pathspec, 0, ((Object)0))) {
				continue;
			} 
			hit |=  opt.grep_file(generatedEntries[i].getName());
			if (hit && generatedStatus_only) {
				break;
			} 
		}
		return hit;
	}
	public grep_pat getPattern_list() {
		return pattern_list;
	}
	public void setPattern_list(grep_pat newPattern_list) {
		pattern_list = newPattern_list;
	}
	public grep_pat getPattern_tail() {
		return pattern_tail;
	}
	public void setPattern_tail(grep_pat newPattern_tail) {
		pattern_tail = newPattern_tail;
	}
	public grep_pat getHeader_list() {
		return header_list;
	}
	public void setHeader_list(grep_pat newHeader_list) {
		header_list = newHeader_list;
	}
	public grep_pat getHeader_tail() {
		return header_tail;
	}
	public void setHeader_tail(grep_pat newHeader_tail) {
		header_tail = newHeader_tail;
	}
	public grep_expr getPattern_expression() {
		return pattern_expression;
	}
	public void setPattern_expression(grep_expr newPattern_expression) {
		pattern_expression = newPattern_expression;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public int getPrefix_length() {
		return prefix_length;
	}
	public void setPrefix_length(int newPrefix_length) {
		prefix_length = newPrefix_length;
	}
	public Object getRegexp() {
		return regexp;
	}
	public void setRegexp(Object newRegexp) {
		regexp = newRegexp;
	}
	public int getLinenum() {
		return linenum;
	}
	public void setLinenum(int newLinenum) {
		linenum = newLinenum;
	}
	public int getColumnnum() {
		return columnnum;
	}
	public void setColumnnum(int newColumnnum) {
		columnnum = newColumnnum;
	}
	public int getInvert() {
		return invert;
	}
	public void setInvert(int newInvert) {
		invert = newInvert;
	}
	public int getIgnore_case() {
		return ignore_case;
	}
	public void setIgnore_case(int newIgnore_case) {
		ignore_case = newIgnore_case;
	}
	public int getStatus_only() {
		return status_only;
	}
	public void setStatus_only(int newStatus_only) {
		status_only = newStatus_only;
	}
	public int getName_only() {
		return name_only;
	}
	public void setName_only(int newName_only) {
		name_only = newName_only;
	}
	public int getUnmatch_name_only() {
		return unmatch_name_only;
	}
	public void setUnmatch_name_only(int newUnmatch_name_only) {
		unmatch_name_only = newUnmatch_name_only;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getWord_regexp() {
		return word_regexp;
	}
	public void setWord_regexp(int newWord_regexp) {
		word_regexp = newWord_regexp;
	}
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int newFixed) {
		fixed = newFixed;
	}
	public int getAll_match() {
		return all_match;
	}
	public void setAll_match(int newAll_match) {
		all_match = newAll_match;
	}
	public int getDebug() {
		return debug;
	}
	public void setDebug(int newDebug) {
		debug = newDebug;
	}
	public int getBinary() {
		return binary;
	}
	public void setBinary(int newBinary) {
		binary = newBinary;
	}
	public int getAllow_textconv() {
		return allow_textconv;
	}
	public void setAllow_textconv(int newAllow_textconv) {
		allow_textconv = newAllow_textconv;
	}
	public int getExtended() {
		return extended;
	}
	public void setExtended(int newExtended) {
		extended = newExtended;
	}
	public int getUse_reflog_filter() {
		return use_reflog_filter;
	}
	public void setUse_reflog_filter(int newUse_reflog_filter) {
		use_reflog_filter = newUse_reflog_filter;
	}
	public int getPcre1() {
		return pcre1;
	}
	public void setPcre1(int newPcre1) {
		pcre1 = newPcre1;
	}
	public int getPcre2() {
		return pcre2;
	}
	public void setPcre2(int newPcre2) {
		pcre2 = newPcre2;
	}
	public int getRelative() {
		return relative;
	}
	public void setRelative(int newRelative) {
		relative = newRelative;
	}
	public int getPathname() {
		return pathname;
	}
	public void setPathname(int newPathname) {
		pathname = newPathname;
	}
	public int getNull_following_name() {
		return null_following_name;
	}
	public void setNull_following_name(int newNull_following_name) {
		null_following_name = newNull_following_name;
	}
	public int getOnly_matching() {
		return only_matching;
	}
	public void setOnly_matching(int newOnly_matching) {
		only_matching = newOnly_matching;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int newColor) {
		color = newColor;
	}
	public int getMax_depth() {
		return max_depth;
	}
	public void setMax_depth(int newMax_depth) {
		max_depth = newMax_depth;
	}
	public int getFuncname() {
		return funcname;
	}
	public void setFuncname(int newFuncname) {
		funcname = newFuncname;
	}
	public int getFuncbody() {
		return funcbody;
	}
	public void setFuncbody(int newFuncbody) {
		funcbody = newFuncbody;
	}
	public int getExtended_regexp_option() {
		return extended_regexp_option;
	}
	public void setExtended_regexp_option(int newExtended_regexp_option) {
		extended_regexp_option = newExtended_regexp_option;
	}
	public int getPattern_type_option() {
		return pattern_type_option;
	}
	public void setPattern_type_option(int newPattern_type_option) {
		pattern_type_option = newPattern_type_option;
	}
	public int getIgnore_locale() {
		return ignore_locale;
	}
	public void setIgnore_locale(int newIgnore_locale) {
		ignore_locale = newIgnore_locale;
	}
	public Object getColors() {
		return colors;
	}
	public void setColors(Object newColors) {
		colors = newColors;
	}
	public int getPre_context() {
		return pre_context;
	}
	public void setPre_context(int newPre_context) {
		pre_context = newPre_context;
	}
	public int getPost_context() {
		return post_context;
	}
	public void setPost_context(int newPost_context) {
		post_context = newPost_context;
	}
	public int getLast_shown() {
		return last_shown;
	}
	public void setLast_shown(int newLast_shown) {
		last_shown = newLast_shown;
	}
	public int getShow_hunk_mark() {
		return show_hunk_mark;
	}
	public void setShow_hunk_mark(int newShow_hunk_mark) {
		show_hunk_mark = newShow_hunk_mark;
	}
	public int getFile_break() {
		return file_break;
	}
	public void setFile_break(int newFile_break) {
		file_break = newFile_break;
	}
	public int getHeading() {
		return heading;
	}
	public void setHeading(int newHeading) {
		heading = newHeading;
	}
	public Object getPriv() {
		return priv;
	}
	public void setPriv(Object newPriv) {
		priv = newPriv;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
	public Object getOutput_priv() {
		return output_priv;
	}
	public void setOutput_priv(Object newOutput_priv) {
		output_priv = newOutput_priv;
	}
}
