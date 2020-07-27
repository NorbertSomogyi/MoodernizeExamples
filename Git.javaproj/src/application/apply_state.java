package application;

public class apply_state {
	private Object prefix;
	private lock_file lock_file;
	private int apply;
	private int cached;
	private int check;
	private int check_index;
	private int update_index;
	private int ita_only;
	private int diffstat;
	private int numstat;
	private int summary;
	private int allow_overlap;
	private int apply_in_reverse;
	private int apply_with_reject;
	private int no_add;
	private int threeway;
	private int unidiff_zero;
	private int unsafe_paths;
	private repository repo;
	private Object index_file;
	private apply_verbosity apply_verbosity;
	private Object fake_ancestor;
	private Object patch_input_file;
	private int line_termination;
	private strbuf root;
	private int p_value;
	private int p_value_known;
	private int p_context;
	private string_list limit_by_name;
	private int has_include;
	private int linenr;
	private string_list symlink_changes;
	private int max_change;
	private int max_len;
	private string_list fn_table;
	private Object saved_error_routine;
	private Object saved_warn_routine;
	private apply_ws_error_action ws_error_action;
	private apply_ws_ignore ws_ignore_action;
	private Object whitespace_option;
	private int whitespace_error;
	private int squelch_whitespace_errors;
	private int applied_after_fixing_ws;
	
	public apply_state(Object prefix, lock_file lock_file, int apply, int cached, int check, int check_index, int update_index, int ita_only, int diffstat, int numstat, int summary, int allow_overlap, int apply_in_reverse, int apply_with_reject, int no_add, int threeway, int unidiff_zero, int unsafe_paths, repository repo, Object index_file, apply_verbosity apply_verbosity, Object fake_ancestor, Object patch_input_file, int line_termination, strbuf root, int p_value, int p_value_known, int p_context, string_list limit_by_name, int has_include, int linenr, string_list symlink_changes, int max_change, int max_len, string_list fn_table, Object saved_error_routine, Object saved_warn_routine, apply_ws_error_action ws_error_action, apply_ws_ignore ws_ignore_action, Object whitespace_option, int whitespace_error, int squelch_whitespace_errors, int applied_after_fixing_ws) {
		setPrefix(prefix);
		setLock_file(lock_file);
		setApply(apply);
		setCached(cached);
		setCheck(check);
		setCheck_index(check_index);
		setUpdate_index(update_index);
		setIta_only(ita_only);
		setDiffstat(diffstat);
		setNumstat(numstat);
		setSummary(summary);
		setAllow_overlap(allow_overlap);
		setApply_in_reverse(apply_in_reverse);
		setApply_with_reject(apply_with_reject);
		setNo_add(no_add);
		setThreeway(threeway);
		setUnidiff_zero(unidiff_zero);
		setUnsafe_paths(unsafe_paths);
		setRepo(repo);
		setIndex_file(index_file);
		setApply_verbosity(apply_verbosity);
		setFake_ancestor(fake_ancestor);
		setPatch_input_file(patch_input_file);
		setLine_termination(line_termination);
		setRoot(root);
		setP_value(p_value);
		setP_value_known(p_value_known);
		setP_context(p_context);
		setLimit_by_name(limit_by_name);
		setHas_include(has_include);
		setLinenr(linenr);
		setSymlink_changes(symlink_changes);
		setMax_change(max_change);
		setMax_len(max_len);
		setFn_table(fn_table);
		setSaved_error_routine(saved_error_routine);
		setSaved_warn_routine(saved_warn_routine);
		setWs_error_action(ws_error_action);
		setWs_ignore_action(ws_ignore_action);
		setWhitespace_option(whitespace_option);
		setWhitespace_error(whitespace_error);
		setSquelch_whitespace_errors(squelch_whitespace_errors);
		setApplied_after_fixing_ws(applied_after_fixing_ws);
	}
	public apply_state() {
	}
	
	public int parse_whitespace_option(Object option) {
		if (!option) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.warn_on_ws_error);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "warn")) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.warn_on_ws_error);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "nowarn")) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.nowarn_ws_error);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "error")) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.die_on_ws_error);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "error-all")) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.die_on_ws_error);
			ModernizedCProgram.state.setSquelch_whitespace_errors(0);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "strip") || !/*Error: Function owner not recognized*/strcmp(option, "fix")) {
			ModernizedCProgram.state.setWs_error_action(apply_ws_error_action.correct_ws_error);
			return 0/*
				 * Please update $__git_whitespacelist in git-completion.bash
				 * when you add new options.
				 */;
		} 
		return ();
	}
	public int parse_ignorewhitespace_option(Object option) {
		if (!option || !/*Error: Function owner not recognized*/strcmp(option, "no") || !/*Error: Function owner not recognized*/strcmp(option, "false") || !/*Error: Function owner not recognized*/strcmp(option, "never") || !/*Error: Function owner not recognized*/strcmp(option, "none")) {
			ModernizedCProgram.state.setWs_ignore_action(apply_ws_ignore.ignore_ws_none);
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(option, "change")) {
			ModernizedCProgram.state.setWs_ignore_action(apply_ws_ignore.ignore_ws_change);
			return 0;
		} 
		return ();
	}
	public void clear_apply_state() {
		ModernizedCProgram.state.getLimit_by_name().string_list_clear(0);
		ModernizedCProgram.state.getSymlink_changes().string_list_clear(0);
		ModernizedCProgram.state.getRoot().strbuf_release();
	}
	public int check_apply_state(int force_apply) {
		int is_not_gitdir = !ModernizedCProgram.startup_info.getHave_repository();
		if (ModernizedCProgram.state.getApply_with_reject() && ModernizedCProgram.state.getThreeway()) {
			return ();
		} 
		if (ModernizedCProgram.state.getCached() && ModernizedCProgram.state.getThreeway()) {
			return ();
		} 
		if (ModernizedCProgram.state.getThreeway()) {
			if (is_not_gitdir) {
				return ();
			} 
			ModernizedCProgram.state.setCheck_index(1);
		} 
		if (ModernizedCProgram.state.getApply_with_reject()) {
			ModernizedCProgram.state.setApply(1);
			if (ModernizedCProgram.state.getApply_verbosity() == apply_verbosity.verbosity_normal) {
				ModernizedCProgram.state.setApply_verbosity(apply_verbosity.verbosity_verbose);
			} 
		} 
		if (!force_apply && (ModernizedCProgram.state.getDiffstat() || ModernizedCProgram.state.getNumstat() || ModernizedCProgram.state.getSummary() || ModernizedCProgram.state.getCheck() || ModernizedCProgram.state.getFake_ancestor())) {
			ModernizedCProgram.state.setApply(0);
		} 
		if (ModernizedCProgram.state.getCheck_index() && is_not_gitdir) {
			return ();
		} 
		if (ModernizedCProgram.state.getCached()) {
			if (is_not_gitdir) {
				return ();
			} 
			ModernizedCProgram.state.setCheck_index(1);
		} 
		if (ModernizedCProgram.state.getIta_only() && (ModernizedCProgram.state.getCheck_index() || is_not_gitdir)) {
			ModernizedCProgram.state.setIta_only(0);
		} 
		if (ModernizedCProgram.state.getCheck_index()) {
			ModernizedCProgram.state.setUnsafe_paths(0);
		} 
		if (ModernizedCProgram.state.getApply_verbosity() <= apply_verbosity.verbosity_silent) {
			ModernizedCProgram.state.setSaved_error_routine(/*Error: Function owner not recognized*/get_error_routine());
			ModernizedCProgram.state.setSaved_warn_routine(/*Error: Function owner not recognized*/get_warn_routine());
			ModernizedCProgram.set_error_routine(mute_routine);
			ModernizedCProgram.set_warn_routine(mute_routine);
		} 
		return 0;
	}
	public void set_default_whitespace_mode() {
		if (!ModernizedCProgram.state.getWhitespace_option() && !ModernizedCProgram.apply_default_whitespace) {
			ModernizedCProgram.state.setWs_error_action((ModernizedCProgram.state.getApply() ? apply_ws_error_action.warn_on_ws_error : apply_ws_error_action.nowarn_ws_error/*
			 * This represents one "hunk" from a patch, starting with
			 * "@@ -oldpos,oldlines +newpos,newlines @@" marker.  The
			 * patch text is pointed at by patch, and its byte length
			 * is stored in size.  leading and trailing are the number
			 * of context lines.
			 */));
		} 
	}
	public int guess_p_value(Object nameline) {
		byte name;
		byte cp;
		int val = -1;
		if (ModernizedCProgram.is_dev_null(nameline)) {
			return -1;
		} 
		name = ModernizedCProgram.state.getRoot().find_name_traditional(nameline, ((Object)0), 0);
		if (!name) {
			return -1;
		} 
		cp = /*Error: Function owner not recognized*/strchr(name, (byte)'/');
		if (!cp) {
			val = 0;
		}  else if (ModernizedCProgram.state.getPrefix()) {
			if (ModernizedCProgram.starts_with(name, ModernizedCProgram.state.getPrefix())) {
				val = ModernizedCProgram.count_slashes(ModernizedCProgram.state.getPrefix());
			} else {
					cp++;
					if (ModernizedCProgram.starts_with(cp, ModernizedCProgram.state.getPrefix())) {
						val = ModernizedCProgram.count_slashes(ModernizedCProgram.state.getPrefix()) + 1;
					} 
			} 
		} 
		ModernizedCProgram.free(name);
		return val/*
		 * Does the ---/+++ line have the POSIX timestamp after the last HT?
		 * GNU diff puts epoch there to signal a creation/deletion event.  Is
		 * this such a timestamp?
		 */;
	}
	public void record_ws_error(int result, Object line, int len, int linenr) {
		byte err;
		if (!result) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.state.getWhitespace_error()++;
		if (ModernizedCProgram.state.getSquelch_whitespace_errors() && ModernizedCProgram.state.getSquelch_whitespace_errors() < ModernizedCProgram.state.getWhitespace_error()) {
			return /*Error: Unsupported expression*/;
		} 
		err = ModernizedCProgram.whitespace_error_string(result);
		if (ModernizedCProgram.state.getApply_verbosity() > apply_verbosity.verbosity_silent) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%d: %s.\n%.*s\n", ModernizedCProgram.state.getPatch_input_file(), linenr, err, len, line);
		} 
		ModernizedCProgram.free(err);
	}
	public void check_whitespace(Object line, int len, int ws_rule) {
		int result = ModernizedCProgram.ws_check(line + 1, len - 1, ws_rule);
		ModernizedCProgram.state.record_ws_error(result, line + 1, len - 2, ModernizedCProgram.state.getLinenr());
	}
	public void prefix_one(Byte name) {
		byte old_name = name;
		if (!old_name) {
			return /*Error: Unsupported expression*/;
		} 
		name = ModernizedCProgram.prefix_filename(ModernizedCProgram.state.getPrefix(), name);
		ModernizedCProgram.free(old_name);
	}
	public void add_name_limit(Object name, int exclude) {
		string_list_item it = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		it = string_list_item.string_list_append(ModernizedCProgram.state.getLimit_by_name(), name);
		it.setUtil(exclude ? ((Object)0) : (Object)1);
	}
	public int check_to_create(Object new_name, int ok_if_exists) {
		stat nst = new stat();
		if (ModernizedCProgram.state.getCheck_index() && ModernizedCProgram.index_name_pos(ModernizedCProgram.state.getRepo().getIndex(), new_name, /*Error: Function owner not recognized*/strlen(new_name)) >= 0 && !ok_if_exists) {
			return 1;
		} 
		if (ModernizedCProgram.state.getCached()) {
			return 0;
		} 
		Object generatedSt_mode = nst.getSt_mode();
		if (!/*Error: Function owner not recognized*/lstat(new_name, nst)) {
			if ((((generatedSt_mode) & -1024) == -1024) || ok_if_exists) {
				return 0/*
						 * A leading component of new_name might be a symlink
						 * that is going to be removed with this patch, but
						 * still pointing at somewhere that has the path.
						 * In such a case, path "new_name" does not exist as
						 * far as git is concerned.
						 */;
			} 
			if (ModernizedCProgram.has_symlink_leading_path(new_name, /*Error: Function owner not recognized*/strlen(new_name))) {
				return 0;
			} 
			return 2;
		}  else if (!ModernizedCProgram.is_missing_file_error((/*Error: Function owner not recognized*/_errno()))) {
			return ();
		} 
		return 0;
	}
	public Object register_symlink_changes(Object path, Object what) {
		string_list_item ent = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		ent = string_list_item.string_list_lookup(ModernizedCProgram.state.getSymlink_changes(), path);
		string_list_item string_list_item = new string_list_item();
		if (!ent) {
			ent = string_list_item.string_list_insert(ModernizedCProgram.state.getSymlink_changes(), path);
			ent.setUtil((Object)0);
		} 
		Object generatedUtil = ent.getUtil();
		ent.setUtil((Object)(what | ((uintptr_t)generatedUtil)));
		return (uintptr_t)generatedUtil;
	}
	public Object check_symlink_changes(Object path) {
		string_list_item ent = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		ent = string_list_item.string_list_lookup(ModernizedCProgram.state.getSymlink_changes(), path);
		if (!ent) {
			return 0;
		} 
		Object generatedUtil = ent.getUtil();
		return (uintptr_t)generatedUtil;
	}
	public int path_is_beyond_symlink(Object name_) {
		int ret;
		strbuf name = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		((name_ != (byte)'\0') ? (Object)0 : /*Error: Function owner not recognized*/_assert("*name_ != '\\0'", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\apply.c", 3846));
		name.strbuf_addstr(name_);
		ret = ModernizedCProgram.path_is_beyond_symlink_1(ModernizedCProgram.state, name);
		name.strbuf_release();
		return ret;
	}
	public int read_apply_cache() {
		if (ModernizedCProgram.state.getIndex_file()) {
			return ModernizedCProgram.state.getRepo().getIndex().read_index_from(ModernizedCProgram.state.getIndex_file(), ModernizedCProgram.get_git_dir());
		} else {
				return ModernizedCProgram.state.getRepo().repo_read_index();
		} 
	}
	public int add_index_file(Object path, int mode, Object buf, long size) {
		stat st = new stat();
		cache_entry ce = new cache_entry();
		int namelen = /*Error: Function owner not recognized*/strlen(path);
		cache_entry cache_entry = new cache_entry();
		ce = cache_entry.make_empty_cache_entry(ModernizedCProgram.state.getRepo().getIndex(), namelen);
		Object generatedName = ce.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedName, path, namelen);
		ce.setCe_mode(ModernizedCProgram.create_ce_mode(mode));
		ce.setCe_flags(ModernizedCProgram.create_ce_flags(0));
		ce.setCe_namelen(namelen);
		int generatedCe_flags = ce.getCe_flags();
		object_id generatedOid = ce.getOid();
		if (ModernizedCProgram.state.getIta_only()) {
			generatedCe_flags |=  (1 << 29);
			ce.set_object_name_for_intent_to_add_entry();
		}  else if ((((mode) & -1024) == 160000)) {
			byte s;
			if (!ModernizedCProgram.skip_prefix(buf, "Subproject commit ", s) || generatedOid.get_oid_hex(s)) {
				ce.discard_cache_entry();
				return ();
			} 
		} else {
				if (!ModernizedCProgram.state.getCached()) {
					if (/*Error: Function owner not recognized*/lstat(path, st) < 0) {
						ce.discard_cache_entry();
						return ();
					} 
					ModernizedCProgram.fill_stat_cache_info(ModernizedCProgram.state.getRepo().getIndex(), ce, st);
				} 
				if (generatedOid.write_object_file(buf, size, ModernizedCProgram.blob_type) < 0) {
					ce.discard_cache_entry();
					return ();
				} 
		} 
		if (ModernizedCProgram.add_index_entry(ModernizedCProgram.state.getRepo().getIndex(), ce, 1) < 0) {
			ce.discard_cache_entry();
			return ();
		} 
		return 0/*
		 * Returns:
		 *  -1 if an unrecoverable error happened
		 *   0 if everything went well
		 *   1 if a recoverable error happened
		 */;
	}
	public int try_create_file(Object path, int mode, Object buf, long size) {
		int fd;
		int res;
		strbuf nbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Object generatedSt_mode = st.getSt_mode();
		if ((((mode) & -1024) == 160000)) {
			stat st = new stat();
			if (!/*Error: Function owner not recognized*/lstat(path, st) && (((generatedSt_mode) & -1024) == -1024)) {
				return 0;
			} 
			return !!/*Error: Function owner not recognized*/mkdir(path, 777);
		} 
		if (ModernizedCProgram.has_symlinks && /*Error: Function owner not recognized*/S_ISLNK(mode/* Although buf:size is counted string, it also is NUL
				 * terminated.
				 */)) {
			return !!ModernizedCProgram.symlink(buf, path);
		} 
		fd = /*Error: Function owner not recognized*/open(path, -1024 | -1024 | 1, (mode & 100) ? 777 : 666);
		if (fd < 0) {
			return 1;
		} 
		Object generatedLen = nbuf.getLen();
		byte[] generatedBuf = nbuf.getBuf();
		if (nbuf.convert_to_working_tree(ModernizedCProgram.state.getRepo().getIndex(), path, buf, size)) {
			size = generatedLen;
			buf = generatedBuf;
		} 
		res = ModernizedCProgram.write_in_full(fd, buf, size) < 0;
		if (res) {
			();
		} 
		nbuf.strbuf_release();
		if (/*Error: Function owner not recognized*/close(fd) < 0 && !res) {
			return ();
		} 
		return res ? -1 : 0/*
		 * We optimistically assume that the directories exist,
		 * which is true 99% of the time anyway. If they don't,
		 * we create them and try again.
		 *
		 * Returns:
		 *   -1 on error
		 *   0 otherwise
		 */;
	}
	public int create_one_file(Byte path, int mode, Object buf, long size) {
		int res;
		if (ModernizedCProgram.state.getCached()) {
			return 0;
		} 
		res = ModernizedCProgram.state.try_create_file(path, mode, buf, size);
		if (res < 0) {
			return -1;
		} 
		if (!res) {
			return 0;
		} 
		if ((/*Error: Function owner not recognized*/_errno()) == 2) {
			if (ModernizedCProgram.safe_create_leading_directories(path)) {
				return 0;
			} 
			res = ModernizedCProgram.state.try_create_file(path, mode, buf, size);
			if (res < 0) {
				return -1;
			} 
			if (!res) {
				return 0;
			} 
		} 
		Object generatedSt_mode = st.getSt_mode();
		if ((/*Error: Function owner not recognized*/_errno()) == 17 || (/*Error: Function owner not recognized*/_errno()) == 13/* We may be trying to create a file where a directory
				 * used to be.
				 */) {
			stat st = new stat();
			if (!/*Error: Function owner not recognized*/lstat(path, st) && (!(((generatedSt_mode) & -1024) == -1024) || !/*Error: Function owner not recognized*/rmdir(path))) {
				(/*Error: Function owner not recognized*/_errno()) = 17;
			} 
		} 
		if ((/*Error: Function owner not recognized*/_errno()) == 17) {
			int nr = /*Error: Function owner not recognized*/getpid();
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				byte[] newpath = new byte[260];
				ModernizedCProgram.mksnpath(newpath, /*Error: sizeof expression not supported yet*/, "%s~%u", path, nr);
				res = ModernizedCProgram.state.try_create_file(newpath, mode, buf, size);
				if (res < 0) {
					return -1;
				} 
				if (!res) {
					if (!/*Error: Function owner not recognized*/rename(newpath, path)) {
						return 0;
					} 
					ModernizedCProgram.unlink_or_warn(newpath);
					break;
				} 
				if ((/*Error: Function owner not recognized*/_errno()) != 17) {
					break;
				} 
				++nr;
			}
		} 
		return ();
	}
	public int apply_patch(int fd, Object filename, int options) {
		size_t offset = new size_t();
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		patch list = ((Object)0);
		patch listp = ModernizedCProgram.list;
		int skipped_patch = 0;
		int res = 0;
		int flush_attributes = 0;
		ModernizedCProgram.state.setPatch_input_file(filename);
		if (buf.read_patch_file(fd) < 0) {
			return -128;
		} 
		offset = 0;
		Object generatedLen = buf.getLen();
		byte[] generatedBuf = buf.getBuf();
		patch generatedNext = patch.getNext();
		Byte generatedNew_name = patch.getNew_name();
		Byte generatedOld_name = patch.getOld_name();
		while (offset < generatedLen) {
			patch patch = new patch();
			int nr;
			patch = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
			patch.setInaccurate_eof(!!(options & (1 << 0)));
			patch.setRecount(!!(options & (1 << 1)));
			nr = ModernizedCProgram.parse_chunk(ModernizedCProgram.state, generatedBuf + offset, generatedLen - offset, patch);
			if (nr < 0) {
				patch.free_patch();
				if (nr == -128) {
					res = -128;
					;
				} 
				break;
			} 
			if (ModernizedCProgram.state.getApply_in_reverse()) {
				patch.reverse_patches();
			} 
			if (ModernizedCProgram.use_patch(ModernizedCProgram.state, patch)) {
				ModernizedCProgram.patch_stats(ModernizedCProgram.state, patch);
				listp = patch;
				listp = generatedNext;
				if ((generatedNew_name && ModernizedCProgram.ends_with_path_components(generatedNew_name, ".gitattributes")) || (generatedOld_name && ModernizedCProgram.ends_with_path_components(generatedOld_name, ".gitattributes"))) {
					flush_attributes = 1;
				} 
			} else {
					if (ModernizedCProgram.state.getApply_verbosity() > apply_verbosity.verbosity_normal) {
						ModernizedCProgram.say_patch_name((_iob[2]), ModernizedCProgram._("Skipped patch '%s'."), patch);
					} 
					patch.free_patch();
					skipped_patch++;
			} 
			offset += nr;
		}
		if (!list && !skipped_patch) {
			();
			res = -128;
			;
		} 
		if (ModernizedCProgram.state.getWhitespace_error() && (ModernizedCProgram.state.getWs_error_action() == apply_ws_error_action.die_on_ws_error)) {
			ModernizedCProgram.state.setApply(0);
		} 
		ModernizedCProgram.state.setUpdate_index((ModernizedCProgram.state.getCheck_index() || ModernizedCProgram.state.getIta_only()) && ModernizedCProgram.state.getApply());
		if (ModernizedCProgram.state.getUpdate_index() && !ModernizedCProgram.state.getLock_file().is_lock_file_locked()) {
			if (ModernizedCProgram.state.getIndex_file()) {
				ModernizedCProgram.state.getLock_file().hold_lock_file_for_update(ModernizedCProgram.state.getIndex_file(), 1);
			} else {
					ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.state.getRepo(), ModernizedCProgram.state.getLock_file(), 1);
			} 
		} 
		if (ModernizedCProgram.state.getCheck_index() && ModernizedCProgram.state.read_apply_cache() < 0) {
			();
			res = -128;
			;
		} 
		if (ModernizedCProgram.state.getCheck() || ModernizedCProgram.state.getApply()) {
			int r = ModernizedCProgram.check_patch_list(ModernizedCProgram.state, list);
			if (r == -128) {
				res = -128;
				;
			} 
			if (r < 0 && !ModernizedCProgram.state.getApply_with_reject()) {
				res = -1;
				;
			} 
		} 
		if (ModernizedCProgram.state.getApply()) {
			int write_res = ModernizedCProgram.write_out_results(ModernizedCProgram.state, list);
			if (write_res < 0) {
				res = -128;
				;
			} 
			if (write_res > 0) {
				res = ModernizedCProgram.state.getApply_with_reject() ? -1 : /* with --3way, we still need to write the index out */1;
				;
			} 
		} 
		if (ModernizedCProgram.state.getFake_ancestor() && ModernizedCProgram.build_fake_ancestor(ModernizedCProgram.state, list)) {
			res = -128;
			;
		} 
		if (ModernizedCProgram.state.getDiffstat() && ModernizedCProgram.state.getApply_verbosity() > apply_verbosity.verbosity_silent) {
			ModernizedCProgram.stat_patch_list(ModernizedCProgram.state, list);
		} 
		if (ModernizedCProgram.state.getNumstat() && ModernizedCProgram.state.getApply_verbosity() > apply_verbosity.verbosity_silent) {
			ModernizedCProgram.numstat_patch_list(ModernizedCProgram.state, list);
		} 
		if (ModernizedCProgram.state.getSummary() && ModernizedCProgram.state.getApply_verbosity() > apply_verbosity.verbosity_silent) {
			list.summary_patch_list();
		} 
		if (flush_attributes) {
			ModernizedCProgram.reset_parsed_attributes();
		} 
		buf.strbuf_release();
		ModernizedCProgram.state.getFn_table().string_list_clear(0);
		return res;
	}
	public int apply_all_patches(int argc, Object[][] argv, int options) {
		int i;
		int res;
		int errs = 0;
		int read_stdin = 1;
		for (i = 0; i < argc; i++) {
			byte arg = argv[i];
			byte to_free = ((Object)0);
			int fd;
			if (!/*Error: Function owner not recognized*/strcmp(arg, "-")) {
				res = ModernizedCProgram.state.apply_patch(0, "<stdin>", options);
				if (res < 0) {
					;
				} 
				errs |=  res;
				read_stdin = 0;
				continue;
			} else {
					arg = to_free = ModernizedCProgram.prefix_filename(ModernizedCProgram.state.getPrefix(), arg);
			} 
			fd = /*Error: Function owner not recognized*/open(arg, 0);
			if (fd < 0) {
				();
				res = -128;
				ModernizedCProgram.free(to_free);
				;
			} 
			read_stdin = 0;
			ModernizedCProgram.state.set_default_whitespace_mode();
			res = ModernizedCProgram.state.apply_patch(fd, arg, options);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			ModernizedCProgram.free(to_free);
			if (res < 0) {
				;
			} 
			errs |=  res;
		}
		ModernizedCProgram.state.set_default_whitespace_mode();
		if (read_stdin) {
			res = ModernizedCProgram.state.apply_patch(0, "<stdin>", options);
			if (res < 0) {
				;
			} 
			errs |=  res;
		} 
		if (ModernizedCProgram.state.getWhitespace_error()) {
			if (ModernizedCProgram.state.getSquelch_whitespace_errors() && ModernizedCProgram.state.getSquelch_whitespace_errors() < ModernizedCProgram.state.getWhitespace_error()) {
				int squelched = ModernizedCProgram.state.getWhitespace_error() - ModernizedCProgram.state.getSquelch_whitespace_errors();
				ModernizedCProgram.warning(ModernizedCProgram.Q_("squelched %d whitespace error", "squelched %d whitespace errors", squelched), squelched);
			} 
			if (ModernizedCProgram.state.getWs_error_action() == apply_ws_error_action.die_on_ws_error) {
				();
				res = -128;
				;
			} 
			if (ModernizedCProgram.state.getApplied_after_fixing_ws() && ModernizedCProgram.state.getApply()) {
				ModernizedCProgram.warning(ModernizedCProgram.Q_("%d line applied after fixing whitespace errors.", "%d lines applied after fixing whitespace errors.", ModernizedCProgram.state.getApplied_after_fixing_ws()), ModernizedCProgram.state.getApplied_after_fixing_ws());
			}  else if (ModernizedCProgram.state.getWhitespace_error()) {
				ModernizedCProgram.warning(ModernizedCProgram.Q_("%d line adds whitespace errors.", "%d lines add whitespace errors.", ModernizedCProgram.state.getWhitespace_error()), ModernizedCProgram.state.getWhitespace_error());
			} 
		} 
		if (ModernizedCProgram.state.getUpdate_index()) {
			res = ModernizedCProgram.write_locked_index(ModernizedCProgram.state.getRepo().getIndex(), ModernizedCProgram.state.getLock_file(), (1 << 0));
			if (res) {
				();
				res = -128;
				;
			} 
		} 
		res = !!errs;
		if (ModernizedCProgram.state.getApply_verbosity() <= apply_verbosity.verbosity_silent) {
			ModernizedCProgram.set_error_routine(ModernizedCProgram.state.getSaved_error_routine());
			ModernizedCProgram.set_warn_routine(ModernizedCProgram.state.getSaved_warn_routine());
		} 
		if (res > -1) {
			return res;
		} 
		return (res == -1 ? 1 : 128);
	}
	public int apply_parse_options(int argc, Object argv, Integer force_apply, Integer options, Object apply_usage) {
		option[] builtin_apply_options = new option[]{new option(parse_opt_type.OPTION_CALLBACK, 0, "exclude", ModernizedCProgram.state, ("path"), ("don't apply changes matching the given path"), parse_opt_option_flags.PARSE_OPT_NONEG, apply_option_parse_exclude), new option(parse_opt_type.OPTION_CALLBACK, 0, "include", ModernizedCProgram.state, ("path"), ("apply changes matching the given path"), parse_opt_option_flags.PARSE_OPT_NONEG, apply_option_parse_include), new option(parse_opt_type.OPTION_CALLBACK, (byte)'p', ((Object)0), ModernizedCProgram.state, ("num"), ("remove <num> leading slashes from traditional diff paths"), 0, apply_option_parse_p), new option(parse_opt_type.OPTION_SET_INT, (false), ("no-add"), (ModernizedCProgram.state.getNo_add()), ((Object)0), (("ignore additions made by the patch")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("stat"), (ModernizedCProgram.state.getDiffstat()), ((Object)0), (("instead of applying the patch, output diffstat for the input")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_CALLBACK, (false), ("allow-binary-replacement"), ((Object)0), ((Object)0), ("no-op (backward compatibility)"), parse_opt_option_flags.PARSE_OPT_HIDDEN | parse_opt_option_flags.PARSE_OPT_NOARG, ModernizedCProgram.parse_opt_noop_cb), new option(parse_opt_type.OPTION_CALLBACK, (false), ("binary"), ((Object)0), ((Object)0), ("no-op (backward compatibility)"), parse_opt_option_flags.PARSE_OPT_HIDDEN | parse_opt_option_flags.PARSE_OPT_NOARG, ModernizedCProgram.parse_opt_noop_cb), new option(parse_opt_type.OPTION_SET_INT, (false), ("numstat"), (ModernizedCProgram.state.getNumstat()), ((Object)0), (("show number of added and deleted lines in decimal notation")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("summary"), (ModernizedCProgram.state.getSummary()), ((Object)0), (("instead of applying the patch, output a summary for the input")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("check"), (ModernizedCProgram.state.getCheck()), ((Object)0), (("instead of applying the patch, see if the patch is applicable")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("index"), (ModernizedCProgram.state.getCheck_index()), ((Object)0), (("make sure the patch is applicable to the current index")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'N'), ("intent-to-add"), (ModernizedCProgram.state.getIta_only()), ((Object)0), (("mark new files with `git add --intent-to-add`")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("cached"), (ModernizedCProgram.state.getCached()), ((Object)0), (("apply a patch without touching the working tree")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("unsafe-paths"), (ModernizedCProgram.state.getUnsafe_paths()), ((Object)0), (("accept a patch that touches outside the working area")), parse_opt_option_flags.PARSE_OPT_NOARG | (parse_opt_option_flags.PARSE_OPT_NOCOMPLETE), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("apply"), (force_apply), ((Object)0), (("also apply the patch (use with --stat/--summary/--check)")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, ((byte)'3'), ("3way"), (ModernizedCProgram.state.getThreeway()), ((Object)0), (("attempt three-way merge if a patch does not apply")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_FILENAME, (false), ("build-fake-ancestor"), (ModernizedCProgram.state.getFake_ancestor()), ("file"), (("build a temporary index based on embedded index information"))), new option(parse_opt_type.OPTION_SET_INT, ((byte)'z'), (((Object)0)), (ModernizedCProgram.state.getLine_termination()), ((Object)0), (("paths are separated with NUL character")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (/* Think twice before adding "--nul" synonym to this */(byte)'\0')), new option(parse_opt_type.OPTION_INTEGER, ((byte)'C'), (((Object)0)), (ModernizedCProgram.state.getP_context()), ("n"), (("ensure at least <n> lines of context match")), (false)), new option(parse_opt_type.OPTION_CALLBACK, 0, "whitespace", ModernizedCProgram.state, ("action"), ("detect new or modified lines that have whitespace errors"), 0, apply_option_parse_whitespace), new option(parse_opt_type.OPTION_CALLBACK, 0, "ignore-space-change", ModernizedCProgram.state, ((Object)0), ("ignore changes in whitespace when finding context"), parse_opt_option_flags.PARSE_OPT_NOARG, apply_option_parse_space_change), new option(parse_opt_type.OPTION_CALLBACK, 0, "ignore-whitespace", ModernizedCProgram.state, ((Object)0), ("ignore changes in whitespace when finding context"), parse_opt_option_flags.PARSE_OPT_NOARG, apply_option_parse_space_change), new option(parse_opt_type.OPTION_SET_INT, ((byte)'R'), ("reverse"), (ModernizedCProgram.state.getApply_in_reverse()), ((Object)0), (("apply the patch in reverse")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("unidiff-zero"), (ModernizedCProgram.state.getUnidiff_zero()), ((Object)0), (("don't expect at least one line of context")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("reject"), (ModernizedCProgram.state.getApply_with_reject()), ((Object)0), (("leave the rejected hunks in corresponding *.rej files")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_SET_INT, (false), ("allow-overlap"), (ModernizedCProgram.state.getAllow_overlap()), ((Object)0), (("allow overlapping hunks")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), (true)), new option(parse_opt_type.OPTION_COUNTUP, ((byte)'v'), ("verbose"), ((ModernizedCProgram.state.getApply_verbosity())), ((Object)0), ((("be verbose"))), parse_opt_option_flags.PARSE_OPT_NOARG | (false)), new option(parse_opt_type.OPTION_BIT, (false), ("inaccurate-eof"), (options), ((Object)0), (("tolerate incorrectly detected missing new-line at the end of file")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), ((1 << 0))), new option(parse_opt_type.OPTION_BIT, (false), ("recount"), (options), ((Object)0), (("do not trust the line counts in the hunk headers")), parse_opt_option_flags.PARSE_OPT_NOARG | (false), ((Object)0), ((1 << 1))), new option(parse_opt_type.OPTION_CALLBACK, 0, "directory", ModernizedCProgram.state, ("root"), ("prepend <root> to all filenames"), 0, apply_option_parse_directory), new option(parse_opt_type.OPTION_END)};
		return ModernizedCProgram.parse_options(argc, argv, ModernizedCProgram.state.getPrefix(), builtin_apply_options, apply_usage, 0);
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public lock_file getLock_file() {
		return lock_file;
	}
	public void setLock_file(lock_file newLock_file) {
		lock_file = newLock_file;
	}
	public int getApply() {
		return apply;
	}
	public void setApply(int newApply) {
		apply = newApply;
	}
	public int getCached() {
		return cached;
	}
	public void setCached(int newCached) {
		cached = newCached;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int newCheck) {
		check = newCheck;
	}
	public int getCheck_index() {
		return check_index;
	}
	public void setCheck_index(int newCheck_index) {
		check_index = newCheck_index;
	}
	public int getUpdate_index() {
		return update_index;
	}
	public void setUpdate_index(int newUpdate_index) {
		update_index = newUpdate_index;
	}
	public int getIta_only() {
		return ita_only;
	}
	public void setIta_only(int newIta_only) {
		ita_only = newIta_only;
	}
	public int getDiffstat() {
		return diffstat;
	}
	public void setDiffstat(int newDiffstat) {
		diffstat = newDiffstat;
	}
	public int getNumstat() {
		return numstat;
	}
	public void setNumstat(int newNumstat) {
		numstat = newNumstat;
	}
	public int getSummary() {
		return summary;
	}
	public void setSummary(int newSummary) {
		summary = newSummary;
	}
	public int getAllow_overlap() {
		return allow_overlap;
	}
	public void setAllow_overlap(int newAllow_overlap) {
		allow_overlap = newAllow_overlap;
	}
	public int getApply_in_reverse() {
		return apply_in_reverse;
	}
	public void setApply_in_reverse(int newApply_in_reverse) {
		apply_in_reverse = newApply_in_reverse;
	}
	public int getApply_with_reject() {
		return apply_with_reject;
	}
	public void setApply_with_reject(int newApply_with_reject) {
		apply_with_reject = newApply_with_reject;
	}
	public int getNo_add() {
		return no_add;
	}
	public void setNo_add(int newNo_add) {
		no_add = newNo_add;
	}
	public int getThreeway() {
		return threeway;
	}
	public void setThreeway(int newThreeway) {
		threeway = newThreeway;
	}
	public int getUnidiff_zero() {
		return unidiff_zero;
	}
	public void setUnidiff_zero(int newUnidiff_zero) {
		unidiff_zero = newUnidiff_zero;
	}
	public int getUnsafe_paths() {
		return unsafe_paths;
	}
	public void setUnsafe_paths(int newUnsafe_paths) {
		unsafe_paths = newUnsafe_paths;
	}
	public repository getRepo() {
		return repo;
	}
	public void setRepo(repository newRepo) {
		repo = newRepo;
	}
	public Object getIndex_file() {
		return index_file;
	}
	public void setIndex_file(Object newIndex_file) {
		index_file = newIndex_file;
	}
	public apply_verbosity getApply_verbosity() {
		return apply_verbosity;
	}
	public void setApply_verbosity(apply_verbosity newApply_verbosity) {
		apply_verbosity = newApply_verbosity;
	}
	public Object getFake_ancestor() {
		return fake_ancestor;
	}
	public void setFake_ancestor(Object newFake_ancestor) {
		fake_ancestor = newFake_ancestor;
	}
	public Object getPatch_input_file() {
		return patch_input_file;
	}
	public void setPatch_input_file(Object newPatch_input_file) {
		patch_input_file = newPatch_input_file;
	}
	public int getLine_termination() {
		return line_termination;
	}
	public void setLine_termination(int newLine_termination) {
		line_termination = newLine_termination;
	}
	public strbuf getRoot() {
		return root;
	}
	public void setRoot(strbuf newRoot) {
		root = newRoot;
	}
	public int getP_value() {
		return p_value;
	}
	public void setP_value(int newP_value) {
		p_value = newP_value;
	}
	public int getP_value_known() {
		return p_value_known;
	}
	public void setP_value_known(int newP_value_known) {
		p_value_known = newP_value_known;
	}
	public int getP_context() {
		return p_context;
	}
	public void setP_context(int newP_context) {
		p_context = newP_context;
	}
	public string_list getLimit_by_name() {
		return limit_by_name;
	}
	public void setLimit_by_name(string_list newLimit_by_name) {
		limit_by_name = newLimit_by_name;
	}
	public int getHas_include() {
		return has_include;
	}
	public void setHas_include(int newHas_include) {
		has_include = newHas_include;
	}
	public int getLinenr() {
		return linenr;
	}
	public void setLinenr(int newLinenr) {
		linenr = newLinenr;
	}
	public string_list getSymlink_changes() {
		return symlink_changes;
	}
	public void setSymlink_changes(string_list newSymlink_changes) {
		symlink_changes = newSymlink_changes;
	}
	public int getMax_change() {
		return max_change;
	}
	public void setMax_change(int newMax_change) {
		max_change = newMax_change;
	}
	public int getMax_len() {
		return max_len;
	}
	public void setMax_len(int newMax_len) {
		max_len = newMax_len;
	}
	public string_list getFn_table() {
		return fn_table;
	}
	public void setFn_table(string_list newFn_table) {
		fn_table = newFn_table;
	}
	public Object getSaved_error_routine() {
		return saved_error_routine;
	}
	public void setSaved_error_routine(Object newSaved_error_routine) {
		saved_error_routine = newSaved_error_routine;
	}
	public Object getSaved_warn_routine() {
		return saved_warn_routine;
	}
	public void setSaved_warn_routine(Object newSaved_warn_routine) {
		saved_warn_routine = newSaved_warn_routine;
	}
	public apply_ws_error_action getWs_error_action() {
		return ws_error_action;
	}
	public void setWs_error_action(apply_ws_error_action newWs_error_action) {
		ws_error_action = newWs_error_action;
	}
	public apply_ws_ignore getWs_ignore_action() {
		return ws_ignore_action;
	}
	public void setWs_ignore_action(apply_ws_ignore newWs_ignore_action) {
		ws_ignore_action = newWs_ignore_action;
	}
	public Object getWhitespace_option() {
		return whitespace_option;
	}
	public void setWhitespace_option(Object newWhitespace_option) {
		whitespace_option = newWhitespace_option;
	}
	public int getWhitespace_error() {
		return whitespace_error;
	}
	public void setWhitespace_error(int newWhitespace_error) {
		whitespace_error = newWhitespace_error;
	}
	public int getSquelch_whitespace_errors() {
		return squelch_whitespace_errors;
	}
	public void setSquelch_whitespace_errors(int newSquelch_whitespace_errors) {
		squelch_whitespace_errors = newSquelch_whitespace_errors;
	}
	public int getApplied_after_fixing_ws() {
		return applied_after_fixing_ws;
	}
	public void setApplied_after_fixing_ws(int newApplied_after_fixing_ws) {
		applied_after_fixing_ws = newApplied_after_fixing_ws;
	}
}
