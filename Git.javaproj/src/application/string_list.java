package application;

public class string_list {
	private string_list_item[] items;
	private int nr;
	private int alloc;
	private int strdup_strings;
	private Object cmp;
	
	public string_list(string_list_item[] items, int nr, int alloc, int strdup_strings, Object cmp) {
		setItems(items);
		setNr(nr);
		setAlloc(alloc);
		setStrdup_strings(strdup_strings);
		setCmp(cmp);
	}
	public string_list() {
	}
	
	public void string_list_init(int strdup_strings) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.list, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.list.setStrdup_strings(strdup_strings);
		slp.setItem(((Object)0));
		slp.setNitems(0);
		slp.setNitems_max(0);
	}
	/* returns -1-index if already exists */
	public int add_entry(int insert_at, Object string) {
		int exact_match = 0;
		int index = insert_at != -1 ? insert_at : ModernizedCProgram.get_entry_index(ModernizedCProgram.list, string, exact_match);
		if (exact_match) {
			return -1 - index;
		} 
		do {
			if ((ModernizedCProgram.list.getNr() + 1) > ModernizedCProgram.list.getAlloc()) {
				if ((((ModernizedCProgram.list.getAlloc()) + 16) * 3 / 2) < (ModernizedCProgram.list.getNr() + 1)) {
					ModernizedCProgram.list.setAlloc((ModernizedCProgram.list.getNr() + 1));
				} else {
						ModernizedCProgram.list.setAlloc((((ModernizedCProgram.list.getAlloc()) + 16) * 3 / 2));
				} 
				(ModernizedCProgram.list.getItems()) = ModernizedCProgram.xrealloc((ModernizedCProgram.list.getItems()), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.list.getAlloc())));
			} 
		} while (0);
		if (index < ModernizedCProgram.list.getNr()) {
			ModernizedCProgram.move_array((ModernizedCProgram.list.getItems() + index + 1), (ModernizedCProgram.list.getItems() + index), (ModernizedCProgram.list.getNr() - index), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		} 
		ModernizedCProgram.list.getItems()[index].setString(ModernizedCProgram.list.getStrdup_strings() ? ModernizedCProgram.xstrdup(string) : (byte)string);
		ModernizedCProgram.list.getItems()[index].setUtil(((Object)0));
		ModernizedCProgram.list.getNr()++;
		return index;
		index_state generatedResult = o.getResult();
		cache_entry cache_entry = new cache_entry();
		ModernizedCProgram.do_add_entry(o, cache_entry.dup_cache_entry(ce, generatedResult), set, clear/*
		 * add error messages on path <path>
		 * corresponding to the type <e> with the message <msg>
		 * indicating if it should be display in porcelain or not
		 */);
	}
	public void string_list_remove(Object string, int free_util) {
		int exact_match;
		int i = ModernizedCProgram.get_entry_index(ModernizedCProgram.list, string, exact_match);
		if (exact_match) {
			if (ModernizedCProgram.list.getStrdup_strings()) {
				ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getString());
			} 
			if (free_util) {
				ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getUtil());
			} 
			ModernizedCProgram.list.getNr()--;
			ModernizedCProgram.move_array((ModernizedCProgram.list.getItems() + i), (ModernizedCProgram.list.getItems() + i + 1), (ModernizedCProgram.list.getNr() - i), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		} 
	}
	public void string_list_remove_duplicates(int free_util) {
		if (ModernizedCProgram.list.getNr() > 1) {
			int src;
			int dst;
			compare_strings_fn cmp = ModernizedCProgram.list.getCmp() ? ModernizedCProgram.list.getCmp() : strcmp;
			for (src = dst = 1; src < ModernizedCProgram.list.getNr(); src++) {
				if (!ModernizedCProgram.cmp(ModernizedCProgram.list.getItems()[dst - 1].getString(), ModernizedCProgram.list.getItems()[src].getString())) {
					if (ModernizedCProgram.list.getStrdup_strings()) {
						ModernizedCProgram.free(ModernizedCProgram.list.getItems()[src].getString());
					} 
					if (free_util) {
						ModernizedCProgram.free(ModernizedCProgram.list.getItems()[src].getUtil());
					} 
				} else {
						ModernizedCProgram.list.getItems()[dst++] = ModernizedCProgram.list.getItems()[src];
				} 
			}
			ModernizedCProgram.list.setNr(dst);
		} 
	}
	public int for_each_string_list(Object fn, Object cb_data) {
		int i;
		int ret = 0;
		for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
			if ((ret = /*Error: Function owner not recognized*/fn(ModernizedCProgram.list.getItems()[i], cb_data))) {
				break;
			} 
		}
		return ret;
	}
	public void filter_string_list(int free_util, Object want, Object cb_data) {
		int src;
		int dst = 0;
		for (src = 0; src < ModernizedCProgram.list.getNr(); src++) {
			if (/*Error: Function owner not recognized*/want(ModernizedCProgram.list.getItems()[src], cb_data)) {
				ModernizedCProgram.list.getItems()[dst++] = ModernizedCProgram.list.getItems()[src];
			} else {
					if (ModernizedCProgram.list.getStrdup_strings()) {
						ModernizedCProgram.free(ModernizedCProgram.list.getItems()[src].getString());
					} 
					if (free_util) {
						ModernizedCProgram.free(ModernizedCProgram.list.getItems()[src].getUtil());
					} 
			} 
		}
		ModernizedCProgram.list.setNr(dst);
	}
	public void string_list_remove_empty_items(int free_util) {
		ModernizedCProgram.list.filter_string_list(free_util, item_is_not_empty, ((Object)0));
	}
	public void string_list_clear(int free_util) {
		if (ModernizedCProgram.list.getItems()) {
			int i;
			if (ModernizedCProgram.list.getStrdup_strings()) {
				for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
					ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getString());
				}
			} 
			if (free_util) {
				for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
					ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getUtil());
				}
			} 
			ModernizedCProgram.free(ModernizedCProgram.list.getItems());
		} 
		ModernizedCProgram.list.setItems(((Object)0));
		ModernizedCProgram.list.setNr(ModernizedCProgram.list.setAlloc(0));
	}
	public void string_list_clear_func(Object clearfunc) {
		if (ModernizedCProgram.list.getItems()) {
			int i;
			if (clearfunc) {
				for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clearfunc(ModernizedCProgram.list.getItems()[i].getUtil(), ModernizedCProgram.list.getItems()[i].getString());
				}
			} 
			if (ModernizedCProgram.list.getStrdup_strings()) {
				for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
					ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getString());
				}
			} 
			ModernizedCProgram.free(ModernizedCProgram.list.getItems());
		} 
		ModernizedCProgram.list.setItems(((Object)0));
		ModernizedCProgram.list.setNr(ModernizedCProgram.list.setAlloc(0));
	}
	public void string_list_sort() {
		string_list_sort_ctx sort_ctx = new string_list_sort_ctx(ModernizedCProgram.list.getCmp() ? ModernizedCProgram.list.getCmp() : strcmp);
		do {
			if (ModernizedCProgram.git_qsort_s((ModernizedCProgram.list.getItems()), (ModernizedCProgram.list.getNr()), /*Error: sizeof expression not supported yet*/, cmp_items, sort_ctx)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\string-list.c", 239, "qsort_s() failed");
			} 
		} while (0);
		Object[][] generatedItem = slp.getItem();
		Object generatedNitems = slp.getNitems();
		ModernizedCProgram.sane_qsort((generatedItem), (generatedNitems), /*Error: sizeof expression not supported yet*/, cmp_string);
	}
	public int unsorted_string_list_has_string(Object string) {
		string_list_item string_list_item = new string_list_item();
		return string_list_item.unsorted_string_list_lookup(ModernizedCProgram.list, string) != ((Object)0);
	}
	public void unsorted_string_list_delete_item(int i, int free_util) {
		if (ModernizedCProgram.list.getStrdup_strings()) {
			ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getString());
		} 
		if (free_util) {
			ModernizedCProgram.free(ModernizedCProgram.list.getItems()[i].getUtil());
		} 
		ModernizedCProgram.list.getItems()[i] = ModernizedCProgram.list.getItems()[ModernizedCProgram.list.getNr() - 1];
		ModernizedCProgram.list.getNr()--;
	}
	public int string_list_split(Object string, int delim, int maxsplit) {
		int count = 0;
		byte p = string;
		byte end;
		if (!ModernizedCProgram.list.getStrdup_strings()) {
			ModernizedCProgram.die("internal error in string_list_split(): list->strdup_strings must be set");
		} 
		string_list_item string_list_item = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			count++;
			if (maxsplit >= 0 && count > maxsplit) {
				string_list_item.string_list_append(ModernizedCProgram.list, p);
				return count;
			} 
			end = /*Error: Function owner not recognized*/strchr(p, delim);
			if (end) {
				string_list_item.string_list_append_nodup(ModernizedCProgram.list, ModernizedCProgram.xmemdupz(p, end - p));
				p = end + 1;
			} else {
					string_list_item.string_list_append(ModernizedCProgram.list, p);
					return count;
			} 
		}
	}
	public int string_list_split_in_place(Byte string, int delim, int maxsplit) {
		int count = 0;
		byte p = string;
		byte end;
		if (ModernizedCProgram.list.getStrdup_strings()) {
			ModernizedCProgram.die("internal error in string_list_split_in_place(): list->strdup_strings must not be set");
		} 
		string_list_item string_list_item = new string_list_item();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			count++;
			if (maxsplit >= 0 && count > maxsplit) {
				string_list_item.string_list_append(ModernizedCProgram.list, p);
				return count;
			} 
			end = /*Error: Function owner not recognized*/strchr(p, delim);
			if (end) {
				end = (byte)'\0';
				string_list_item.string_list_append(ModernizedCProgram.list, p);
				p = end + 1;
			} else {
					string_list_item.string_list_append(ModernizedCProgram.list, p);
					return count;
			} 
		}
	}
	/*
	 * "diff --no-index" support
	 * Copyright (c) 2007 by Johannes Schindelin
	 * Copyright (c) 2008 by Junio C Hamano
	 */
	public int read_directory_contents(Object path) {
		DIR dir = new DIR();
		dirent e = new dirent();
		if (!(dir = ModernizedCProgram.opendir(path))) {
			return ();
		} 
		dirent dirent = new dirent();
		Object generatedD_name = e.getD_name();
		string_list_item string_list_item = new string_list_item();
		while ((e = dirent.readdir(dir))) {
			if (!ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				string_list_item.string_list_insert(ModernizedCProgram.list, generatedD_name);
			} 
		}
		dir.closedir();
		return 0/*
		 * This should be "(standard input)" or something, but it will
		 * probably expose many more breakages in the way no-index code
		 * is bolted onto the diff callchain.
		 */;
	}
	public void exclude_helpers_from_list() {
		int i = 0;
		while (i < ModernizedCProgram.list.getNr()) {
			if (/*Error: Function owner not recognized*/strstr(ModernizedCProgram.list.getItems()[i].getString(), "--")) {
				ModernizedCProgram.list.unsorted_string_list_delete_item(i, 0);
			} else {
					i++;
			} 
		}
	}
	public void list_builtins(int exclude_option) {
		int i;
		string_list_item string_list_item = new string_list_item();
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			if (exclude_option && (ModernizedCProgram.commands[i].getOption() & exclude_option)) {
				continue;
			} 
			string_list_item.string_list_append(out, ModernizedCProgram.commands[i].getCmd());
		}
	}
	public void handle_tags_and_duplicates() {
		commit commit = new commit();
		int i;
		string_list_item[] generatedItems = this.getItems();
		object generatedObject = commit.getObject();
		object_id generatedOid = generatedObject.getOid();
		int generatedType = object.getType();
		int generatedNr = this.getNr();
		for (i = generatedNr - 1; i >= 0; i--) {
			byte name = generatedItems[i].getString();
			object object = generatedItems[i].getUtil();
			int mark;
			switch (generatedType) {
			case object_type.OBJ_COMMIT:
					if (ModernizedCProgram.anonymize) {
						name = ModernizedCProgram.anonymize_refname(name);
					} 
					commit = (commit)/* create refs pointing to already seen commits */object.rewrite_commit();
					if (!commit/*
									 * Neither this object nor any of its
									 * ancestors touch any relevant paths, so
									 * it has been filtered to nothing.  Delete
									 * it.
									 */) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("reset %s\nfrom %s\n\n", name, ModernizedCProgram.oid_to_hex(ModernizedCProgram.null_oid));
						continue;
					} 
					mark = generatedObject.get_object_mark();
					if (!mark/*
									 * Getting here means we have a commit which
									 * was excluded by a negative refspec (e.g.
									 * fast-export ^master master).  If we are
									 * referencing excluded commits, set the ref
									 * to the exact commit.  Otherwise, the user
									 * wants the branch exported but every commit
									 * in its history to be deleted, which basically
									 * just means deletion of the ref.
									 */) {
						if (!ModernizedCProgram.reference_excluded_commits) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(/* delete the ref */"reset %s\nfrom %s\n\n", name, ModernizedCProgram.oid_to_hex(ModernizedCProgram.null_oid));
							continue;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("reset %s\nfrom %s\n\n", /* set ref to commit using oid, not mark */name, ModernizedCProgram.oid_to_hex(generatedOid));
						continue;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("reset %s\nfrom :%d\n\n", name, mark);
					ModernizedCProgram.show_progress();
					break;
			case object_type.OBJ_TAG:
					(tag)object.handle_tag(name);
					break;
			}
		}
	}
	public int populate_maildir_list(Object path) {
		DIR dir = new DIR();
		dirent dent = new dirent();
		byte name = ((Object)0);
		byte[] subs = new byte[]{"cur", "new", ((Object)0)};
		byte sub;
		int ret = -1;
		dirent dirent = new dirent();
		Object generatedD_name = dent.getD_name();
		string_list_item string_list_item = new string_list_item();
		for (sub = subs; sub; ++sub) {
			ModernizedCProgram.free(name);
			name = ModernizedCProgram.xstrfmt("%s/%s", path, sub);
			if ((dir = ModernizedCProgram.opendir(name)) == ((Object)0)) {
				if ((/*Error: Function owner not recognized*/_errno()) == 2) {
					continue;
				} 
				();
				;
			} 
			while ((dent = dirent.readdir(dir)) != ((Object)0)) {
				if (generatedD_name[0] == (byte)'.') {
					continue;
				} 
				ModernizedCProgram.free(name);
				name = ModernizedCProgram.xstrfmt("%s/%s", sub, generatedD_name);
				string_list_item.string_list_insert(ModernizedCProgram.list, name);
			}
			dir.closedir();
		}
		ret = 0;
		return ret;
	}
	public void parse_one_symref_info(Object val, int len) {
		byte sym;
		byte target;
		string_list_item item = new string_list_item();
		if (!len) {
			return /*Error: Unsupported expression*/;
		} 
		sym = ModernizedCProgram.xmemdupz(val, /* e.g. "symref=HEAD:refs/heads/master" */len);
		target = /*Error: Function owner not recognized*/strchr(sym, (byte)':');
		if (!target/* just "symref=something" */) {
			;
		} 
		(target++) = (byte)'\0';
		if (ModernizedCProgram.check_refname_format(sym, 1) || ModernizedCProgram.check_refname_format(target, 1/* "symref=bogus:pair */)) {
			;
		} 
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_append_nodup(symref, sym);
		item.setUtil(target);
		return /*Error: Unsupported expression*/;
		return /*Error: Unsupported expression*/;
	}
	public void print_error_files(Object main_msg, Object hints_msg, Integer errs) {
		int generatedNr = this.getNr();
		string_list_item[] generatedItems = this.getItems();
		if (generatedNr) {
			int i;
			strbuf err_msg = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			err_msg.strbuf_addstr(main_msg);
			for (i = 0; i < generatedNr; i++) {
				err_msg.strbuf_addf("\n    %s", generatedItems[i].getString());
			}
			if (ModernizedCProgram.advice_rm_hints) {
				err_msg.strbuf_addstr(hints_msg);
			} 
			errs = ();
			err_msg.strbuf_release();
		} 
	}
	public int async_query_available_blobs(Object cmd) {
		int err;
		byte line;
		cmd2process entry = new cmd2process();
		child_process process = new child_process();
		strbuf filter_status = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		((ModernizedCProgram.subprocess_map_initialized) ? (Object)0 : /*Error: Function owner not recognized*/_assert("subprocess_map_initialized", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\convert.c", 927));
		subprocess_entry subprocess_entry = new subprocess_entry();
		entry = (cmd2process)subprocess_entry.subprocess_find_entry(ModernizedCProgram.subprocess_map, cmd);
		if (!entry) {
			();
			return 0;
		} 
		subprocess_entry generatedSubprocess = entry.getSubprocess();
		child_process generatedProcess = generatedSubprocess.getProcess();
		process = generatedProcess;
		ModernizedCProgram.sigchain_push(SIGPIPE, ((__p_sig_fn_t)1));
		int generatedIn = process.getIn();
		err = ModernizedCProgram.packet_write_fmt_gently(generatedIn, "command=list_available_blobs\n");
		if (err) {
			;
		} 
		err = ModernizedCProgram.packet_flush_gently(generatedIn);
		if (err) {
			;
		} 
		int generatedOut = process.getOut();
		string_list_item string_list_item = new string_list_item();
		while ((line = ModernizedCProgram.packet_read_line(generatedOut, ((Object)0)))) {
			byte path;
			if (ModernizedCProgram.skip_prefix(line, "pathname=", ModernizedCProgram.path)) {
				string_list_item.string_list_insert(available_paths, ModernizedCProgram.xstrdup(ModernizedCProgram.path));
			} else {
					;
			} 
		}
		err = filter_status.subprocess_read_status(generatedOut);
		if (err) {
			;
		} 
		byte[] generatedBuf = filter_status.getBuf();
		err = /*Error: Function owner not recognized*/strcmp(generatedBuf, "success");
		if (err) {
			entry.handle_filter_error(filter_status, 0);
		} 
		return !err;
	}
	public int read_dir_paths(Object path) {
		DIR dh = new DIR();
		dirent de = new dirent();
		dh = ModernizedCProgram.opendir(path);
		if (!dh) {
			return -1;
		} 
		dirent dirent = new dirent();
		Object generatedD_name = de.getD_name();
		string_list_item string_list_item = new string_list_item();
		while ((de = dirent.readdir(dh))) {
			if (generatedD_name[0] != (byte)'.') {
				string_list_item.string_list_append(out, generatedD_name);
			} 
		}
		dh.closedir();
		return 0;
	}
	public int add_remote_or_group(Object name) {
		int prev_nr = ModernizedCProgram.list.getNr();
		remote_group_data g = new remote_group_data();
		g.setName(name);
		g.setList(ModernizedCProgram.list);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config(get_remote_group, g);
		string_list_item string_list_item = new string_list_item();
		if (ModernizedCProgram.list.getNr() == prev_nr) {
			remote remote = /*Error: Function owner not recognized*/remote_get(name);
			if (!/*Error: Function owner not recognized*/remote_is_configured(ModernizedCProgram.remote, 0)) {
				return 0;
			} 
			string_list_item.string_list_append(ModernizedCProgram.list, ModernizedCProgram.remote.getName());
		} 
		return 1;
	}
	public int fetch_multiple(int max_children) {
		int i;
		int result = 0;
		argv_array argv = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		if (!ModernizedCProgram.append && !ModernizedCProgram.dry_run) {
			int errcode = ModernizedCProgram.truncate_fetch_head();
			if (errcode) {
				return errcode;
			} 
		} 
		argv.argv_array_pushl("fetch", "--append", "--no-auto-gc", ((Object)0));
		argv.add_options_to_argv();
		Object[][] generatedArgv = argv.getArgv();
		if (max_children != 1 && ModernizedCProgram.list.getNr() != 1) {
			parallel_fetch_state state = new parallel_fetch_state(generatedArgv, ModernizedCProgram.list, 0, 0);
			argv.argv_array_push("--end-of-options");
			result = ModernizedCProgram.run_processes_parallel_tr2(max_children, fetch_next_remote, fetch_failed_to_start, fetch_finished, ModernizedCProgram.state, "fetch", "parallel/fetch");
			if (!result) {
				result = ModernizedCProgram.state.getResult();
			} 
		} else {
				for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
					byte name = ModernizedCProgram.list.getItems()[i].getString();
					argv.argv_array_push(name);
					if (ModernizedCProgram.verbosity >= 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram._("Fetching %s\n"), name);
					} 
					if (ModernizedCProgram.run_command_v_opt(generatedArgv, 2)) {
						();
						result = 1;
					} 
					argv.argv_array_pop();
				}
		} 
		argv.argv_array_clear();
		return !!result/*
		 * Fetching from the promisor remote should use the given filter-spec
		 * or inherit the default filter-spec from the config.
		 */;
	}
	public void add_repack_all_option() {
		if (ModernizedCProgram.prune_expire && !/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.prune_expire, "now")) {
			ModernizedCProgram.repack.argv_array_push("-a");
		} else {
				ModernizedCProgram.repack.argv_array_push("-A");
				if (ModernizedCProgram.prune_expire) {
					ModernizedCProgram.repack.argv_array_pushf("--unpack-unreachable=%s", ModernizedCProgram.prune_expire);
				} 
		} 
		if (keep_pack) {
			keep_pack.for_each_string_list(keep_one_pack, ((Object)0));
		} 
	}
	public int delete_refs(Object msg, int flags) {
		ref_store ref_store = new ref_store();
		return ModernizedCProgram.refs_delete_refs(ref_store.get_main_ref_store(ModernizedCProgram.the_repository), msg, refnames, flags);
	}
	public void free_submodules_oids() {
		string_list_item item = new string_list_item();
		string_list_item[] generatedItems = (submodules).getItems();
		int generatedNr = (submodules).getNr();
		Object generatedUtil = item.getUtil();
		for (item = generatedItems; item && item < generatedItems + generatedNr; ++item) {
			(oid_array)generatedUtil.oid_array_clear();
		}
		submodules.string_list_clear(1);
	}
	public void list_aliases() {
		config_alias_data data = new config_alias_data(((Object)0), ((Object)0), ModernizedCProgram.list);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/read_early_config(config_alias_cb, data);
	}
	public int clone_submodule(Object path, Object gitdir, Object url, Object depth, int dissociate, int quiet, int progress) {
		child_process cp = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		argv_array generatedArgs = cp.getArgs();
		generatedArgs.argv_array_push("clone");
		generatedArgs.argv_array_push("--no-checkout");
		if (quiet) {
			generatedArgs.argv_array_push("--quiet");
		} 
		if (progress) {
			generatedArgs.argv_array_push("--progress");
		} 
		if (depth && depth) {
			generatedArgs.argv_array_pushl("--depth", depth, ((Object)0));
		} 
		int generatedNr = this.getNr();
		string_list_item[] generatedItems = (reference).getItems();
		byte[] generatedString = item.getString();
		if (generatedNr) {
			string_list_item item = new string_list_item();
			for (item = generatedItems; item && item < generatedItems + generatedNr; ++item) {
				generatedArgs.argv_array_pushl("--reference", generatedString, ((Object)0));
			}
		} 
		if (dissociate) {
			generatedArgs.argv_array_push("--dissociate");
		} 
		if (gitdir && gitdir) {
			generatedArgs.argv_array_pushl("--separate-git-dir", gitdir, ((Object)0));
		} 
		generatedArgs.argv_array_push("--");
		generatedArgs.argv_array_push(url);
		generatedArgs.argv_array_push(path);
		cp.setGit_cmd(1);
		argv_array generatedEnv_array = cp.getEnv_array();
		generatedEnv_array.prepare_submodule_repo_env();
		cp.setNo_stdin(1);
		return cp.run_command();
	}
	public void prepare_possible_alternates(Object sm_name) {
		byte sm_alternate = ((Object)0);
		byte error_strategy = ((Object)0);
		submodule_alternate_setup sas = new submodule_alternate_setup(((Object)0), SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_IGNORE, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_string("submodule.alternateLocation", sm_alternate);
		if (!sm_alternate) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_get_string("submodule.alternateErrorStrategy", error_strategy);
		if (!error_strategy) {
			error_strategy = ModernizedCProgram.xstrdup("die");
		} 
		sas.setSubmodule_name(sm_name);
		sas.setReference(reference);
		if (!/*Error: Function owner not recognized*/strcmp(error_strategy, "die")) {
			sas.setError_mode(SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_DIE);
		}  else if (!/*Error: Function owner not recognized*/strcmp(error_strategy, "info")) {
			sas.setError_mode(SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_INFO);
		}  else if (!/*Error: Function owner not recognized*/strcmp(error_strategy, "ignore")) {
			sas.setError_mode(SUBMODULE_ALTERNATE_ERROR_MODE.SUBMODULE_ALTERNATE_ERROR_IGNORE);
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("Value '%s' for submodule.alternateErrorStrategy is not recognized"), error_strategy);
		} 
		if (!/*Error: Function owner not recognized*/strcmp(sm_alternate, "superproject")) {
			ModernizedCProgram.foreach_alt_odb(add_possible_reference_from_superproject, sas);
		}  else if (!/*Error: Function owner not recognized*/strcmp(sm_alternate, "no")) {
			;
		} else {
				ModernizedCProgram.die(ModernizedCProgram._("Value '%s' for submodule.alternateLocation is not recognized"), sm_alternate);
		} 
		ModernizedCProgram.free(sm_alternate);
		ModernizedCProgram.free(error_strategy);
	}
	public void list_config_item(Object prefix, Object str) {
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_append_nodup(ModernizedCProgram.list, ModernizedCProgram.xstrfmt("%s.%s", prefix, str));
	}
	/*
	 * Parse an argument into a string list.  arg should either be a
	 * ':'-separated list of strings, or "-" to indicate an empty string
	 * list (as opposed to "", which indicates a string list containing a
	 * single empty string).  list->strdup_strings must be set.
	 */
	public void parse_string_list(Object arg) {
		if (!/*Error: Function owner not recognized*/strcmp(arg, "-")) {
			return /*Error: Unsupported expression*/;
		} 
		(Object)ModernizedCProgram.list.string_list_split(arg, (byte)':', -1);
	}
	public string_list get_parameters() {
		string_list_item string_list_item = new string_list_item();
		string_list_item string_list_item = new string_list_item();
		Object generatedUtil = i.getUtil();
		if (!ModernizedCProgram.query_params) {
			byte query = /*Error: Function owner not recognized*/getenv("QUERY_STRING");
			ModernizedCProgram.query_params = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
			while (query && query) {
				byte name = ModernizedCProgram.url_decode_parameter_name(query);
				byte value = ModernizedCProgram.url_decode_parameter_value(query);
				string_list_item i = new string_list_item();
				i = string_list_item.string_list_lookup(ModernizedCProgram.query_params, name);
				if (!i) {
					i = string_list_item.string_list_insert(ModernizedCProgram.query_params, name);
				} else {
						ModernizedCProgram.free(generatedUtil);
				} 
				i.setUtil(value);
			}
		} 
		return ModernizedCProgram.query_params;
	}
	public string_list resolve_undo_read(Object data, long size) {
		string_list resolve_undo = new string_list();
		size_t len = new size_t();
		byte endptr;
		int i;
		int rawsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		resolve_undo = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
		resolve_undo.setStrdup_strings(1);
		string_list_item string_list_item = new string_list_item();
		Object generatedUtil = lost.getUtil();
		Object generatedMode = ui.getMode();
		Object generatedOid = ui.getOid();
		while (size) {
			string_list_item lost = new string_list_item();
			resolve_undo_info ui = new resolve_undo_info();
			len = /*Error: Function owner not recognized*/strlen(data) + 1;
			if (size <= len) {
				;
			} 
			lost = string_list_item.string_list_insert(resolve_undo, data);
			if (!generatedUtil) {
				lost.setUtil(ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
			} 
			ui = generatedUtil;
			size -= len;
			data += len;
			for (i = 0; i < 3; i++) {
				generatedMode[i] = /*Error: Function owner not recognized*/strtoul(data, endptr, 8);
				if (!endptr || endptr == data || endptr) {
					;
				} 
				len = (endptr + 1) - (byte)data;
				if (size <= len) {
					;
				} 
				size -= len;
				data += len;
			}
			for (i = 0; i < 3; i++) {
				if (!generatedMode[i]) {
					continue;
				} 
				if (size < rawsz) {
					;
				} 
				generatedOid[i].oidread((byte)data);
				size -= rawsz;
				data += rawsz;
			}
		}
		return resolve_undo;
		();
		return ((Object)0);
	}
	public void write_config() {
		int i;
		int generatedNr = this.getNr();
		string_list_item[] generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			if (/*Error: Function owner not recognized*/git_config_parse_parameter(generatedItems[i].getString(), write_one_config, ((Object)0)) < 0) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to write parameters to config file"));
			} 
		}
	}
	public void list_config_advices(Object prefix) {
		int i;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			ModernizedCProgram.list.list_config_item(prefix, advice_config[i].getName());
		}
	}
	public int longest_ancestor_length(Object[] path) {
		int i;
		int max_len = -1;
		if (!/*Error: Function owner not recognized*/strcmp(path, "/")) {
			return -1;
		} 
		int generatedNr = this.getNr();
		string_list_item[] generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			byte ceil = generatedItems[i].getString();
			int len = /*Error: Function owner not recognized*/strlen(ceil);
			if (ModernizedCProgram.len == 1 && ceil[0] == (byte)'/') {
				ModernizedCProgram.len = /* root matches anything, with length 0 */0;
			}  else if (!/*Error: Function owner not recognized*/strncmp(path, ceil, ModernizedCProgram.len) && path[ModernizedCProgram.len] == (byte)'/') {
				;
			} else {
					continue;
			} 
			if (ModernizedCProgram.len > max_len) {
				max_len = ModernizedCProgram.len;
			} 
		}
		return max_len;
	}
	public int list_paths(Object with_tree, Object pattern) {
		int i;
		int ret;
		byte m;
		if (!pattern.getNr()) {
			return 0;
		} 
		m = ModernizedCProgram.xcalloc(1, pattern.getNr());
		if (with_tree) {
			byte max_prefix = ModernizedCProgram.common_prefix(pattern);
			ModernizedCProgram.the_index.overlay_tree_on_index(with_tree, max_prefix);
			ModernizedCProgram.free(max_prefix);
		} 
		string_list_item string_list_item = new string_list_item();
		for (i = 0; i < (ModernizedCProgram.the_index.getCache_nr()); i++) {
			cache_entry ce = (ModernizedCProgram.the_index.getCache())[i];
			string_list_item item = new string_list_item();
			if (ce.getCe_flags() & (1 << 16)) {
				continue;
			} 
			if (!ModernizedCProgram.ce_path_match(ModernizedCProgram.the_index, ce, pattern, m)) {
				continue;
			} 
			item = string_list_item.string_list_insert(ModernizedCProgram.list, ce.getName());
			if (((ce).getCe_flags() & (1 << 30))) {
				item.setUtil(/* better a valid pointer than a fake one */item);
			} 
		}
		ret = ModernizedCProgram.report_path_error(m, pattern);
		ModernizedCProgram.free(m);
		return ret;
	}
	public void add_remove_files() {
		int i;
		Object generatedUtil = p.getUtil();
		byte[] generatedString = p.getString();
		for (i = 0; i < ModernizedCProgram.list.getNr(); i++) {
			stat st = new stat();
			string_list_item p = (ModernizedCProgram.list.getItems()[i]);
			if (generatedUtil) {
				continue;
			} 
			if (!/*Error: Function owner not recognized*/lstat(generatedString, st)) {
				if (ModernizedCProgram.add_to_index(ModernizedCProgram.the_index, (generatedString), (st), (false))) {
					ModernizedCProgram.die(ModernizedCProgram._("updating files failed"));
				} 
			} else {
					ModernizedCProgram.the_index.remove_file_from_index((generatedString));
			} 
		}
	}
	public void list_config_color_status_slots(Object prefix) {
		int i;
		byte[] extra = new byte[]{"added"};
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			ModernizedCProgram.list.list_config_item(prefix, extra[i]);
		}
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			if (ModernizedCProgram.color_status_slots[i]) {
				ModernizedCProgram.list.list_config_item(prefix, ModernizedCProgram.color_status_slots[i]);
			} 
		}
	}
	public int read_rebase_todolist(Object fname) {
		strbuf line = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		FILE f = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.git_path("%s", fname), "r");
		if (!f) {
			if ((/*Error: Function owner not recognized*/_errno()) == 2) {
				return -1;
			} 
			ModernizedCProgram.die_errno("Could not open file %s for reading", ModernizedCProgram.git_path("%s", fname));
		} 
		Object generatedLen = line.getLen();
		byte[] generatedBuf = line.getBuf();
		string_list_item string_list_item = new string_list_item();
		while (!ModernizedCProgram.strbuf_getline_lf(line, f)) {
			if (generatedLen && generatedBuf[0] == ModernizedCProgram.comment_line_char) {
				continue;
			} 
			line.strbuf_trim();
			if (!generatedLen) {
				continue;
			} 
			line.abbrev_sha1_in_line();
			string_list_item.string_list_append(lines, generatedBuf);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(f);
		line.strbuf_release();
		return 0;
	}
	public void find_longest_prefixes(Object patterns) {
		argv_array sorted = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
		strbuf prefix = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		sorted.argv_array_pushv(patterns);
		Object[][] generatedArgv = sorted.getArgv();
		int generatedArgc = sorted.getArgc();
		ModernizedCProgram.sane_qsort((generatedArgv), (generatedArgc), /*Error: sizeof expression not supported yet*/, qsort_strcmp);
		ModernizedCProgram.find_longest_prefixes_1(out, prefix, generatedArgv, generatedArgc);
		sorted.argv_array_clear();
		prefix/*
		 * This is the same as for_each_fullref_in(), but it tries to iterate
		 * only over the patterns we'll care about. Note that it _doesn't_ do a full
		 * pattern match, so the callback still has to match each ref individually.
		 */.strbuf_release();
	}
	public int parse_key_value_squoted(Byte buf) {
		string_list_item string_list_item = new string_list_item();
		while (buf) {
			string_list_item item = new string_list_item();
			byte np;
			byte cp = /*Error: Function owner not recognized*/strchr(buf, (byte)'=');
			if (!cp) {
				np = ModernizedCProgram.gitstrchrnul(buf, (byte)'\n');
				return ();
			} 
			np = ModernizedCProgram.gitstrchrnul(cp, (byte)'\n');
			cp++ = (byte)'\0';
			item = string_list_item.string_list_append(ModernizedCProgram.list, buf);
			buf = np + (np == (byte)'\n');
			np = (byte)'\0';
			cp = ModernizedCProgram.sq_dequote(cp);
			if (!cp) {
				return ();
			} 
			item.setUtil(ModernizedCProgram.xstrdup(cp));
		}
		return 0/**
		 * Reads and parses the state directory's "author-script" file, and sets name,
		 * email and date accordingly.
		 * Returns 0 on success, -1 if the file could not be parsed.
		 *
		 * The author script is of the format:
		 *
		 *	GIT_AUTHOR_NAME='$author_name'
		 *	GIT_AUTHOR_EMAIL='$author_email'
		 *	GIT_AUTHOR_DATE='$author_date'
		 *
		 * where $author_name, $author_email and $author_date are quoted. We are strict
		 * with our parsing, as the file was meant to be eval'd in the now-removed
		 * git-am.sh/git-rebase--interactive.sh scripts, and thus if the file differs
		 * from what this function expects, it is better to bail out than to do
		 * something that the user does not expect.
		 */;
	}
	public int add_exec_commands() {
		byte todo_file = ModernizedCProgram.rebase_path_todo();
		todo_list todo_list = new todo_list(new todo_list(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/));
		int res;
		strbuf generatedBuf = todo_list.getBuf();
		if (generatedBuf.strbuf_read_file(todo_file, 0) < 0) {
			return ();
		} 
		if (ModernizedCProgram.todo_list_parse_insn_buffer(ModernizedCProgram.the_repository, generatedBuf, todo_list)) {
			todo_list.todo_list_release();
			return ();
		} 
		ModernizedCProgram.todo_list_add_exec_commands(todo_list, ModernizedCProgram.commands);
		res = ModernizedCProgram.todo_list_write_to_file(ModernizedCProgram.the_repository, todo_list, todo_file, ((Object)0), ((Object)0), -1, 0);
		todo_list.todo_list_release();
		if (res) {
			return ();
		} 
		return 0;
	}
	public void split_exec_commands(Object cmd) {
		if (cmd && cmd) {
			ModernizedCProgram.commands.string_list_split(cmd, (byte)'\n', -1);
			ModernizedCProgram.commands.string_list_remove_empty_items(/* rebase.c adds a new line to cmd after every command,
					 * so here the last command is always empty */0);
		} 
	}
	public void list_config_color_sideband_slots(Object prefix) {
		int i;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			ModernizedCProgram.list.list_config_item(prefix, ModernizedCProgram.keywords[i].getKeyword());
		}
	}
	public void list_config_color_decorate_slots(Object prefix) {
		int i;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			if (ModernizedCProgram.color_decorate_slots[i]) {
				ModernizedCProgram.list.list_config_item(prefix, ModernizedCProgram.color_decorate_slots[i]);
			} 
		}
	}
	public void die_with_unpushed_submodules() {
		int i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("The following submodule paths contain changes that can\nnot be found on any remote:\n"));
		int generatedNr = this.getNr();
		string_list_item[] generatedItems = this.getItems();
		for (i = 0; i < generatedNr; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "  %s\n", generatedItems[i].getString());
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram._("\nPlease try\n\n	git push --recurse-submodules=on-demand\n\nor cd to the path and use\n\n	git push\n\nto push them to a remote.\n\n"));
		needs_pushing.string_list_clear(0);
		ModernizedCProgram.die(ModernizedCProgram._("Aborting."));
	}
	public int ref_excluded(Object path) {
		string_list_item item = new string_list_item();
		if (!ModernizedCProgram.ref_excludes) {
			return 0;
		} 
		byte[] generatedString = item.getString();
		for (item = (ModernizedCProgram.ref_excludes).getItems(); item && item < (ModernizedCProgram.ref_excludes).getItems() + (ModernizedCProgram.ref_excludes).getNr(); ++item) {
			if (!ModernizedCProgram.wildmatch(generatedString, path, 0)) {
				return 1;
			} 
		}
		return 0;
	}
	public void clear_ref_exclusion() {
		if (ref_excludes_p) {
			ref_excludes_p.string_list_clear(0);
			ModernizedCProgram.free(ref_excludes_p);
		} 
		ref_excludes_p = ((Object)0);
	}
	public void add_ref_exclusion(Object exclude) {
		if (!ref_excludes_p) {
			ref_excludes_p = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/);
			(ref_excludes_p).setStrdup_strings(1);
		} 
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_append(ref_excludes_p, exclude);
	}
	public void add_mapping(Byte new_name, Byte new_email, Byte old_name, Byte old_email) {
		mailmap_entry me = new mailmap_entry();
		string_list_item item = new string_list_item();
		if (old_email == ((Object)0)) {
			old_email = new_email;
			new_email = ((Object)0);
		} 
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_insert(map, old_email);
		Object generatedUtil = item.getUtil();
		string_list generatedNamemap = me.getNamemap();
		if (generatedUtil) {
			me = (mailmap_entry)generatedUtil;
		} else {
				me = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
				generatedNamemap.setStrdup_strings(1);
				generatedNamemap.setCmp(namemap_cmp);
				item.setUtil(me);
		} 
		Byte generatedName = me.getName();
		Byte generatedEmail = me.getEmail();
		if (old_name == ((Object)0)) {
			ModernizedCProgram.debug_mm("mailmap: adding (simple) entry for '%s'\n", old_email);
			if (/* Replace current name and new email for simple entry */new_name) {
				ModernizedCProgram.free(generatedName);
				me.setName(ModernizedCProgram.xstrdup(new_name));
			} 
			if (new_email) {
				ModernizedCProgram.free(generatedEmail);
				me.setEmail(ModernizedCProgram.xstrdup(new_email));
			} 
		} else {
				mailmap_info mi = ModernizedCProgram.xcalloc(1, /*Error: Unsupported expression*/);
				ModernizedCProgram.debug_mm("mailmap: adding (complex) entry for '%s'\n", old_email);
				mi.setName(ModernizedCProgram.xstrdup_or_null(new_name));
				mi.setEmail(ModernizedCProgram.xstrdup_or_null(new_email));
				string_list_item.string_list_insert(generatedNamemap, old_name).setUtil(mi);
		} 
		ModernizedCProgram.debug_mm("mailmap:  '%s' <%s> -> '%s' <%s>\n", ModernizedCProgram.debug_str(old_name), old_email, ModernizedCProgram.debug_str(new_name), ModernizedCProgram.debug_str(new_email));
	}
	public void read_mailmap_line(byte[] buffer, Byte repo_abbrev) {
		byte name1 = ((Object)0);
		byte email1 = ((Object)0);
		byte name2 = ((Object)0);
		byte email2 = ((Object)0);
		if (buffer[0] == (byte)'#') {
			byte[] abbrev = "# repo-abbrev:";
			int abblen = /*Error: sizeof expression not supported yet*/ - 1;
			int len = /*Error: Function owner not recognized*/strlen(buffer);
			if (!repo_abbrev) {
				return /*Error: Unsupported expression*/;
			} 
			if (ModernizedCProgram.len && buffer[ModernizedCProgram.len - 1] == (byte)'\n') {
				buffer[--ModernizedCProgram.len] = 0;
			} 
			if (!/*Error: Function owner not recognized*/strncmp(buffer, ModernizedCProgram.abbrev, abblen)) {
				byte cp;
				ModernizedCProgram.free(repo_abbrev);
				for (cp = buffer + abblen; ((ModernizedCProgram.sane_ctype[(byte)(cp)] & (true)) != 0); cp++) {
					;
				}
				repo_abbrev = ModernizedCProgram.xstrdup(cp);
			} 
			return /*Error: Unsupported expression*/;
		} 
		if ((name2 = ModernizedCProgram.parse_name_and_email(buffer, name1, email1, 0)) != ((Object)0)) {
			ModernizedCProgram.parse_name_and_email(name2, name2, email2, 1);
		} 
		if (email1) {
			map.add_mapping(name1, email1, name2, email2);
		} 
	}
	public int read_mailmap_file(Object filename, Byte repo_abbrev) {
		byte[] buffer = new byte[1024];
		FILE f = new FILE();
		if (!filename) {
			return 0;
		} 
		f = /*Error: Function owner not recognized*/fopen(filename, "r");
		if (!f) {
			if ((/*Error: Function owner not recognized*/_errno()) == 2) {
				return 0;
			} 
			return ();
		} 
		while (/*Error: Function owner not recognized*/fgets(buffer, /*Error: sizeof expression not supported yet*/, f) != ((Object)0)) {
			map.read_mailmap_line(buffer, repo_abbrev);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(f);
		return 0;
	}
	public void read_mailmap_string(Byte buf, Byte repo_abbrev) {
		while (buf) {
			byte end = ModernizedCProgram.gitstrchrnul(buf, (byte)'\n');
			if (end) {
				end++ = (byte)'\0';
			} 
			map.read_mailmap_line(buf, repo_abbrev);
			buf = end;
		}
	}
	public int read_mailmap_blob(Object name, Byte repo_abbrev) {
		object_id oid = new object_id();
		byte buf;
		long size;
		object_type type;
		if (!name) {
			return 0;
		} 
		if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, name, oid) < 0) {
			return 0;
		} 
		buf = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, size);
		if (!buf) {
			return ();
		} 
		if (object_type.type != object_type.OBJ_BLOB) {
			return ();
		} 
		map.read_mailmap_string(buf, repo_abbrev);
		ModernizedCProgram.free(buf);
		return 0;
	}
	public int read_mailmap(Byte repo_abbrev) {
		int err = 0;
		this.setStrdup_strings(1);
		this.setCmp(namemap_cmp);
		if (!ModernizedCProgram.git_mailmap_blob && ModernizedCProgram.is_bare_repository()) {
			ModernizedCProgram.git_mailmap_blob = "HEAD:.mailmap";
		} 
		err |=  map.read_mailmap_file(".mailmap", repo_abbrev);
		if (ModernizedCProgram.startup_info.getHave_repository()) {
			err |=  map.read_mailmap_blob(ModernizedCProgram.git_mailmap_blob, repo_abbrev);
		} 
		err |=  map.read_mailmap_file(ModernizedCProgram.git_mailmap_file, repo_abbrev);
		return err;
	}
	public void clear_mailmap() {
		int generatedNr = this.getNr();
		ModernizedCProgram.debug_mm("mailmap: clearing %d entries...\n", generatedNr);
		this.setStrdup_strings(1);
		map.string_list_clear_func(free_mailmap_entry);
		ModernizedCProgram.debug_mm("mailmap: cleared\n"/*
		 * Look for an entry in map that match string[0:len]; string[len]
		 * does not have to be NUL (but it could be).
		 */);
	}
	public int map_user(Object email, Object emaillen, Object name, Object namelen) {
		string_list_item item = new string_list_item();
		mailmap_entry me = new mailmap_entry();
		ModernizedCProgram.debug_mm("map_user: map '%.*s' <%.*s>\n", (int)namelen, ModernizedCProgram.debug_str(name), (int)emaillen, ModernizedCProgram.debug_str(email));
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.lookup_prefix(map, email, emaillen);
		Object generatedUtil = item.getUtil();
		string_list generatedNamemap = me.getNamemap();
		int generatedNr = generatedNamemap.getNr();
		if (item != ((Object)0)) {
			me = (mailmap_entry)generatedUtil;
			if (generatedNr) {
				string_list_item subitem = new string_list_item();
				subitem = string_list_item.lookup_prefix(generatedNamemap, name, namelen);
				if (subitem) {
					item = subitem;
				} 
			} 
		} 
		Byte generatedName = mi.getName();
		Byte generatedEmail = mi.getEmail();
		if (item != ((Object)0)) {
			mailmap_info mi = (mailmap_info)generatedUtil;
			if (generatedName == ((Object)0) && generatedEmail == ((Object)0)) {
				ModernizedCProgram.debug_mm("map_user:  -- (no simple mapping)\n");
				return 0;
			} 
			if (generatedEmail) {
				email = generatedEmail;
				emaillen = /*Error: Function owner not recognized*/strlen(email);
			} 
			if (generatedName) {
				name = generatedName;
				namelen = /*Error: Function owner not recognized*/strlen(name);
			} 
			ModernizedCProgram.debug_mm("map_user:  to '%.*s' <%.*s>\n", (int)namelen, ModernizedCProgram.debug_str(name), (int)emaillen, ModernizedCProgram.debug_str(email));
			return 1;
		} 
		ModernizedCProgram.debug_mm("map_user:  --\n");
		return 0;
	}
	public void record_person_from_buf(int which, Object buffer) {
		byte name_buf;
		byte name;
		byte name_end;
		string_list_item elem = new string_list_item();
		byte field;
		field = (which == (byte)'a') ? "\nauthor " : "\ncommitter ";
		name = /*Error: Function owner not recognized*/strstr(buffer, field);
		if (!name) {
			return /*Error: Unsupported expression*/;
		} 
		name += /*Error: Function owner not recognized*/strlen(field);
		name_end = ModernizedCProgram.gitstrchrnul(name, (byte)'<');
		if (name_end) {
			name_end--;
		} 
		while (((ModernizedCProgram.sane_ctype[(byte)(name_end)] & (true)) != 0) && name <= name_end) {
			name_end--;
		}
		if (name_end < name) {
			return /*Error: Unsupported expression*/;
		} 
		name_buf = ModernizedCProgram.xmemdupz(name, name_end - name + 1);
		string_list_item string_list_item = new string_list_item();
		elem = string_list_item.string_list_lookup(people, name_buf);
		string_list_item string_list_item = new string_list_item();
		if (!elem) {
			elem = string_list_item.string_list_insert(people, name_buf);
			elem.setUtil((Object)0);
		} 
		Object generatedUtil = (elem).getUtil();
		elem.setUtil((Object)(((intptr_t)(generatedUtil)) + 1));
		ModernizedCProgram.free(name_buf);
	}
	public void get_non_kept_pack_filenames(Object extra_keep) {
		DIR dir = new DIR();
		dirent e = new dirent();
		byte fname;
		if (!(dir = ModernizedCProgram.opendir(ModernizedCProgram.packdir))) {
			return /*Error: Unsupported expression*/;
		} 
		dirent dirent = new dirent();
		Object generatedD_name = e.getD_name();
		string_list_item string_list_item = new string_list_item();
		while ((e = dirent.readdir(dir)) != ((Object)0)) {
			size_t len = new size_t();
			int i;
			for (i = 0; i < extra_keep.getNr(); i++) {
				if (!ModernizedCProgram.fspathcmp(generatedD_name, extra_keep.getItems()[i].getString())) {
					break;
				} 
			}
			if (extra_keep.getNr() > 0 && i < extra_keep.getNr()) {
				continue;
			} 
			if (!ModernizedCProgram.strip_suffix(generatedD_name, ".pack", ModernizedCProgram.len)) {
				continue;
			} 
			fname = ModernizedCProgram.xmemdupz(generatedD_name, ModernizedCProgram.len);
			if (!ModernizedCProgram.file_exists(ModernizedCProgram.mkpath("%s/%s.keep", ModernizedCProgram.packdir, fname))) {
				string_list_item.string_list_append_nodup(fname_list, fname);
			} else {
					ModernizedCProgram.free(fname);
			} 
		}
		dir.closedir();
	}
	public void repack_promisor_objects(Object args) {
		child_process cmd = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		FILE out = new FILE();
		strbuf line = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		cmd.prepare_pack_objects(args);
		cmd.setIn(-1/*
			 * NEEDSWORK: Giving pack-objects only the OIDs without any ordering
			 * hints may result in suboptimal deltas in the resulting pack. See if
			 * the OIDs can be sent with fake paths such that pack-objects can use a
			 * {type -> existing pack order} ordering when computing deltas instead
			 * of a {type -> size} ordering, which may produce better deltas.
			 */);
		ModernizedCProgram.for_each_packed_object(write_oid, cmd, for_each_object_flags.FOR_EACH_OBJECT_PROMISOR_ONLY);
		int generatedIn = cmd.getIn();
		if (generatedIn == -1/* No packed objects; cmd was never started */) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedIn);
		int generatedOut = cmd.getOut();
		out = ModernizedCProgram.xfdopen(generatedOut, "r");
		Object generatedLen = line.getLen();
		byte[] generatedBuf = line.getBuf();
		string_list_item string_list_item = new string_list_item();
		while (ModernizedCProgram.strbuf_getline_lf(line, out) != (true)) {
			byte promisor_name;
			int fd;
			if (generatedLen != ModernizedCProgram.the_repository.getHash_algo().getHexsz()) {
				ModernizedCProgram.die(ModernizedCProgram._("repack: Expecting full hex object ID lines only from pack-objects."));
			} 
			string_list_item.string_list_append(ModernizedCProgram.names, generatedBuf);
			promisor_name = ModernizedCProgram.mkpathdup("%s-%s.promisor", ModernizedCProgram.packtmp, generatedBuf);
			fd = /*Error: Function owner not recognized*/open(promisor_name, -1024 | -1024 | 1, 600);
			if (fd < 0) {
				ModernizedCProgram.die_errno(ModernizedCProgram._("unable to create '%s'"), promisor_name);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			ModernizedCProgram.free(promisor_name);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(out);
		if (cmd.finish_command()) {
			ModernizedCProgram.die(ModernizedCProgram._("could not finish pack-objects to repack promisor objects"));
		} 
	}
	public void check_mailmap(Object contact) {
		byte name;
		byte mail;
		size_t namelen = new size_t();
		size_t maillen = new size_t();
		ident_split ident = new ident_split();
		if (ident.split_ident_line(contact, /*Error: Function owner not recognized*/strlen(contact))) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to parse contact: %s"), contact);
		} 
		Object generatedName_begin = ident.getName_begin();
		name = generatedName_begin;
		Object generatedName_end = ident.getName_end();
		namelen = generatedName_end - generatedName_begin;
		Object generatedMail_begin = ident.getMail_begin();
		mail = generatedMail_begin;
		Object generatedMail_end = ident.getMail_end();
		maillen = generatedMail_end - generatedMail_begin;
		mailmap.map_user(mail, maillen, name, namelen);
		if (namelen) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%.*s ", (int)namelen, name);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("<%.*s>\n", (int)maillen, mail);
	}
	public void list_config_color_interactive_slots(Object prefix) {
		int i;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			if (ModernizedCProgram.color_interactive_slots[i]) {
				ModernizedCProgram.list.list_config_item(prefix, ModernizedCProgram.color_interactive_slots[i]);
			} 
		}
	}
	public void pretty_print_menus() {
		int local_colopts = 0;
		column_options copts = new column_options();
		local_colopts = -1024 | 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(copts, 0, /*Error: sizeof expression not supported yet*/);
		copts.setIndent("  ");
		copts.setPadding(2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/print_columns(menu_list, local_colopts, copts);
	}
	public string_list_item[] getItems() {
		return items;
	}
	public void setItems(string_list_item[] newItems) {
		items = newItems;
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
	public int getStrdup_strings() {
		return strdup_strings;
	}
	public void setStrdup_strings(int newStrdup_strings) {
		strdup_strings = newStrdup_strings;
	}
	public Object getCmp() {
		return cmp;
	}
	public void setCmp(Object newCmp) {
		cmp = newCmp;
	}
}
