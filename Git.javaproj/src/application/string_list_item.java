package application;

/**
 * The string_list API offers a data structure and functions to handle
 * sorted and unsorted arrays of strings.  A "sorted" list is one whose
 * entries are sorted by string value in `strcmp()` order.
 *
 * The caller:
 *
 * . Allocates and clears a `struct string_list` variable.
 *
 * . Initializes the members. You might want to set the flag `strdup_strings`
 *   if the strings should be strdup()ed. For example, this is necessary
 *   when you add something like git_path("..."), since that function returns
 *   a static buffer that will change with the next call to git_path().
 *
 * If you need something advanced, you can manually malloc() the `items`
 * member (you need this if you add things later) and you should set the
 * `nr` and `alloc` members in that case, too.
 *
 * . Adds new items to the list, using `string_list_append`,
 *   `string_list_append_nodup`, `string_list_insert`,
 *   `string_list_split`, and/or `string_list_split_in_place`.
 *
 * . Can check if a string is in the list using `string_list_has_string` or
 *   `unsorted_string_list_has_string` and get it from the list using
 *   `string_list_lookup` for sorted lists.
 *
 * . Can sort an unsorted list using `string_list_sort`.
 *
 * . Can remove duplicate items from a sorted list using
 *   `string_list_remove_duplicates`.
 *
 * . Can remove individual items of an unsorted list using
 *   `unsorted_string_list_delete_item`.
 *
 * . Can remove items not matching a criterion from a sorted or unsorted
 *   list using `filter_string_list`, or remove empty strings using
 *   `string_list_remove_empty_items`.
 *
 * . Finally it should free the list using `string_list_clear`.
 *
 * Example:
 *
 *     struct string_list list = STRING_LIST_INIT_NODUP;
 *     int i;
 *
 *     string_list_append(&list, "foo");
 *     string_list_append(&list, "bar");
 *     for (i = 0; i < list.nr; i++)
 *             printf("%s\n", list.items[i].string)
 *
 * NOTE: It is more efficient to build an unsorted list and sort it
 * afterwards, instead of building a sorted list (`O(n log n)` instead of
 * `O(n^2)`).
 *
 * However, if you use the list to check if a certain string was added
 * already, you should not do that (using unsorted_string_list_has_string()),
 * because the complexity would be quadratic again (but with a worse factor).
 */
/**
 * Represents an item of the list. The `string` member is a pointer to the
 * string, and you may use the `util` member for any purpose, if you want.
 */
/** Callback function type for for_each_string_list */
public class string_list_item {
	private byte string;
	private Object util;
	
	public string_list_item(byte string, Object util) {
		setString(string);
		setUtil(util);
	}
	public string_list_item() {
	}
	
	public int prefix_cb(Object cb_data) {
		byte prefix = (byte)cb_data;
		byte generatedString = this.getString();
		return ModernizedCProgram.starts_with(generatedString, prefix);
	}
	public int remove_available_paths(Object cb_data) {
		string_list available_paths = cb_data;
		string_list_item available = new string_list_item();
		byte generatedString = this.getString();
		string_list_item string_list_item = new string_list_item();
		available = string_list_item.string_list_lookup(available_paths, generatedString);
		if (available) {
			available.setUtil((Object)generatedString);
		} 
		return !available;
	}
	public int add_remote_to_show_info(Object cb_data) {
		show_info info = cb_data;
		byte generatedString = this.getString();
		int n = .strlen(generatedString);
		int generatedWidth = info.getWidth();
		if (n > generatedWidth) {
			info.setWidth(n);
		} 
		string_list generatedList = info.getList();
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_insert(generatedList, generatedString);
		return 0;
	}
	public int show_remote_info_item(Object cb_data) {
		show_info info = cb_data;
		ref_states generatedStates = info.getStates();
		ref_states states = generatedStates;
		byte generatedString = this.getString();
		byte name = generatedString;
		int generatedQueried = states.getQueried();
		string_list generatedNew_refs = states.getNew_refs();
		remote generatedRemote = states.getRemote();
		Object generatedName = generatedRemote.getName();
		string_list generatedTracked = states.getTracked();
		string_list generatedStale = states.getStale();
		int generatedWidth = info.getWidth();
		if (generatedQueried) {
			byte fmt = "%s";
			byte arg = "";
			if (ModernizedCProgram.string_list_has_string(generatedNew_refs, name)) {
				fmt = ModernizedCProgram._(" new (next fetch will store in remotes/%s)");
				arg = generatedName;
			}  else if (ModernizedCProgram.string_list_has_string(generatedTracked, name)) {
				arg = ModernizedCProgram._(" tracked");
			}  else if (ModernizedCProgram.string_list_has_string(generatedStale, name)) {
				arg = ModernizedCProgram._(" stale (use 'git remote prune' to remove)");
			} else {
					arg = ModernizedCProgram._(" ???");
			} 
			.printf("    %-*s", generatedWidth, name);
			.printf(fmt, arg);
			.printf("\n");
		} else {
				.printf("    %s\n", name);
		} 
		return 0;
	}
	public int add_local_to_show_info(Object cb_data) {
		show_info show_info = cb_data;
		ref_states generatedStates = show_info.getStates();
		ref_states states = generatedStates;
		Object generatedUtil = this.getUtil();
		branch_info branch_info = generatedUtil;
		string_list_item item = new string_list_item();
		int n;
		string_list generatedMerge = branch_info.getMerge();
		int generatedNr = generatedMerge.getNr();
		Byte generatedRemote_name = branch_info.getRemote_name();
		remote generatedRemote = states.getRemote();
		Object generatedName = generatedRemote.getName();
		if (!generatedNr || !generatedRemote_name || .strcmp(generatedName, generatedRemote_name)) {
			return 0;
		} 
		byte generatedString = this.getString();
		int generatedWidth = show_info.getWidth();
		if ((n = .strlen(generatedString)) > generatedWidth) {
			show_info.setWidth(n);
		} 
		 generatedRebase = branch_info.getRebase();
		if (generatedRebase) {
			show_info.setAny_rebase(1);
		} 
		string_list generatedList = show_info.getList();
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_insert(generatedList, generatedString);
		item.setUtil(branch_info);
		return 0;
	}
	public int show_local_info_item(Object cb_data) {
		show_info show_info = cb_data;
		Object generatedUtil = this.getUtil();
		branch_info branch_info = generatedUtil;
		string_list generatedMerge = branch_info.getMerge();
		string_list merge = generatedMerge;
		int generatedWidth = show_info.getWidth();
		int width = generatedWidth + 4;
		int i;
		 generatedRebase = branch_info.getRebase();
		int generatedNr = generatedMerge.getNr();
		if (generatedRebase && generatedNr > 1) {
			();
			return 0;
		} 
		byte generatedString = this.getString();
		.printf("    %-*s ", generatedWidth, generatedString);
		int generatedAny_rebase = show_info.getAny_rebase();
		if (generatedRebase) {
			byte msg;
			if (generatedRebase == .INTERACTIVE_REBASE) {
				ModernizedCProgram.msg = ModernizedCProgram._("rebases interactively onto remote %s");
			}  else if (generatedRebase == .REBASE_MERGES) {
				ModernizedCProgram.msg = ModernizedCProgram._("rebases interactively (with merges) onto remote %s");
			} else {
					ModernizedCProgram.msg = ModernizedCProgram._("rebases onto remote %s");
			} 
			ModernizedCProgram.printf_ln(ModernizedCProgram.msg, generatedString);
			return 0;
		}  else if (generatedAny_rebase) {
			ModernizedCProgram.printf_ln(ModernizedCProgram._(" merges with remote %s"), generatedString);
			width++;
		} else {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("merges with remote %s"), generatedString);
		} 
		for (i = 1; i < generatedNr; i++) {
			.printf(ModernizedCProgram._("%-*s    and with remote %s\n"), width, "", generatedString);
		}
		return 0;
	}
	public int add_push_to_show_info(Object cb_data) {
		show_info show_info = cb_data;
		Object generatedUtil = this.getUtil();
		push_info push_info = generatedUtil;
		string_list_item item = new string_list_item();
		int n;
		byte generatedString = this.getString();
		int generatedWidth = show_info.getWidth();
		if ((n = .strlen(generatedString)) > generatedWidth) {
			show_info.setWidth(n);
		} 
		Byte generatedDest = push_info.getDest();
		int generatedWidth2 = show_info.getWidth2();
		if ((n = .strlen(generatedDest)) > generatedWidth2) {
			show_info.setWidth2(n);
		} 
		string_list generatedList = show_info.getList();
		item = generatedList.string_list_append(generatedString);
		item.setUtil(generatedUtil);
		return 0/*
		 * Sorting comparison for a string list that has push_info
		 * structs in its util field
		 */;
	}
	public int show_push_info_item(Object cb_data) {
		show_info show_info = cb_data;
		Object generatedUtil = this.getUtil();
		push_info push_info = generatedUtil;
		byte generatedString = this.getString();
		byte src = generatedString;
		byte status = ((Object)0);
		 generatedStatus = push_info.getStatus();
		switch (generatedStatus) {
		case .PUSH_STATUS_CREATE:
				status = ModernizedCProgram._("create");
				break;
		case .PUSH_STATUS_UPTODATE:
				status = ModernizedCProgram._("up to date");
				break;
		case .PUSH_STATUS_FASTFORWARD:
				status = ModernizedCProgram._("fast-forwardable");
				break;
		case .PUSH_STATUS_OUTOFDATE:
				status = ModernizedCProgram._("local out of date");
				break;
		case .PUSH_STATUS_NOTQUERIED:
				break;
		case .PUSH_STATUS_DELETE:
				status = ModernizedCProgram._("delete");
				src = ModernizedCProgram._("(none)");
				break;
		}
		int generatedForced = push_info.getForced();
		int generatedWidth = show_info.getWidth();
		int generatedWidth2 = show_info.getWidth2();
		Byte generatedDest = push_info.getDest();
		if (status) {
			if (generatedForced) {
				ModernizedCProgram.printf_ln(ModernizedCProgram._("    %-*s forces to %-*s (%s)"), generatedWidth, src, generatedWidth2, generatedDest, status);
			} else {
					ModernizedCProgram.printf_ln(ModernizedCProgram._("    %-*s pushes to %-*s (%s)"), generatedWidth, src, generatedWidth2, generatedDest, status);
			} 
		} else {
				if (generatedForced) {
					ModernizedCProgram.printf_ln(ModernizedCProgram._("    %-*s forces to %s"), generatedWidth, src, generatedDest);
				} else {
						ModernizedCProgram.printf_ln(ModernizedCProgram._("    %-*s pushes to %s"), generatedWidth, src, generatedDest);
				} 
		} 
		return 0;
	}
	public void wt_porcelain_v2_fix_up_changed() {
		Object generatedUtil = this.getUtil();
		wt_status_change_data d = generatedUtil;
		int generatedIndex_status = d.getIndex_status();
		int generatedMode_head = d.getMode_head();
		int generatedMode_index = d.getMode_index();
		object_id generatedOid_head = d.getOid_head();
		object_id generatedOid_index = d.getOid_index();
		if (!generatedIndex_status) {
			((generatedMode_head == 0) ? (Object)0 : ._assert("d->mode_head == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2126));
			d.setMode_head(generatedMode_index);
			generatedOid_head.oidcpy(generatedOid_index);
		} 
		int generatedWorktree_status = d.getWorktree_status();
		int generatedMode_worktree = d.getMode_worktree();
		if (!generatedWorktree_status) {
			((generatedMode_worktree == 0) ? (Object)0 : ._assert("d->mode_worktree == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\wt-status.c", 2147));
			d.setMode_worktree(generatedMode_index);
		} 
	}
	public string_list_item string_list_insert(string_list list, Object string) {
		int index = list.add_entry(-1, string);
		if (index < 0) {
			index = -1 - index;
		} 
		string_list_item generatedItems = list.getItems();
		return generatedItems + index;
	}
	public string_list_item string_list_lookup(string_list list, Object string) {
		int exact_match;
		int i = ModernizedCProgram.get_entry_index(list, string, exact_match);
		if (!exact_match) {
			return ((Object)0);
		} 
		string_list_item generatedItems = list.getItems();
		return generatedItems + i;
	}
	public int item_is_not_empty(Object unused) {
		byte generatedString = this.getString();
		return generatedString != (byte)'\0';
	}
	public string_list_item string_list_append_nodup(string_list list, Byte string) {
		string_list_item retval = new string_list_item();
		int generatedNr = list.getNr();
		int generatedAlloc = list.getAlloc();
		string_list_item generatedItems = list.getItems();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					list.setAlloc((generatedNr + 1));
				} else {
						list.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedItems) = ModernizedCProgram.xrealloc((generatedItems), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		retval = generatedItems[generatedNr++];
		retval.setString(string);
		retval.setUtil(((Object)0));
		return retval;
	}
	public string_list_item unsorted_string_list_lookup(string_list list, Object string) {
		string_list_item item = new string_list_item();
		Object generatedCmp = list.getCmp();
		compare_strings_fn cmp = generatedCmp ? generatedCmp : strcmp;
		string_list_item generatedItems = (list).getItems();
		int generatedNr = (list).getNr();
		byte generatedString = item.getString();
		for (item = generatedItems; item && item < generatedItems + generatedNr; ++item) {
			if (!ModernizedCProgram.cmp(string, generatedString)) {
				return item;
			} 
		}
		return ((Object)0);
	}
	public int canonicalize_ceiling_entry(Object cb_data) {
		int empty_entry_found = cb_data;
		byte generatedString = this.getString();
		byte ceil = generatedString;
		if (!ceil) {
			empty_entry_found = 1;
			return 0;
		}  else if (!ModernizedCProgram.is_absolute_path(ceil)) {
			return 0;
		}  else if (empty_entry_found) {
			return /* Keep entry but do not canonicalize it */1;
		} else {
				byte real_path = ModernizedCProgram.real_pathdup(ceil, 0);
				if (!ModernizedCProgram.real_path) {
					return 0;
				} 
				ModernizedCProgram.free(generatedString);
				this.setString(ModernizedCProgram.real_path);
				return 1;
		} 
	}
	/*
	 * A "string_list_each_func_t" function that normalizes an entry from
	 * GIT_CEILING_DIRECTORIES.  If the path is unusable for some reason,
	 * die with an explanation.
	 */
	public int normalize_ceiling_entry(Object unused) {
		byte generatedString = this.getString();
		byte ceil = generatedString;
		if (!ceil) {
			ModernizedCProgram.die("Empty path is not supported");
		} 
		if (!ModernizedCProgram.is_absolute_path(ceil)) {
			ModernizedCProgram.die("Path \"%s\" is not absolute", ceil);
		} 
		if (ModernizedCProgram.normalize_path_copy(ceil, ceil) < 0) {
			ModernizedCProgram.die("Path \"%s\" could not be normalized", ceil);
		} 
		return 1;
	}
	public string_list_item lookup_prefix(string_list map, Object string, Object len) {
		int i = ModernizedCProgram.string_list_find_insert_index(map, string, 1);
		string_list_item generatedItems = map.getItems();
		if (i < 0) {
			i = -1 - /* exact match */i;
			if (!string[len]) {
				return generatedItems[i/*
						 * that map entry matches exactly to the string, including
						 * the cruft at the end beyond "len".  That is not a match
						 * with string[0:len] that we are looking for.
						 */];
			} 
		}  else if (!string[len/*
				 * asked with the whole string, and got nothing.  No
				 * matching entry can exist in the map.
				 */]) {
			return ((Object)0/*
				 * i is at the exact match to an overlong key, or location the
				 * overlong key would be inserted, which must come after the
				 * real location of the key if one exists.
				 */);
		} 
		int generatedNr = map.getNr();
		while (0 <= --i && i < generatedNr) {
			int cmp = .strncasecmp(generatedItems[i].getString(), string, len);
			if (cmp < 0/*
						 * "i" points at a key definitely below the prefix;
						 * the map does not have string[0:len] in it.
						 */) {
				break;
			}  else if (!cmp && !generatedItems[i].getString()[len]) {
				return generatedItems[/* found it */i/*
						 * otherwise, the string at "i" may be string[0:len]
						 * followed by a string that sorts later than string[len:];
						 * keep trying.
						 */];
			} 
		}
		return ((Object)0);
	}
	public int keep_one_pack(Object data) {
		byte generatedString = this.getString();
		ModernizedCProgram.repack.argv_array_pushf("--keep-pack=%s", .basename(generatedString));
		return 0;
	}
	public int add_one_reference(Object cb_data) {
		strbuf err = new strbuf(, , );
		int required = cb_data;
		byte generatedString = this.getString();
		byte ref_git = err.compute_alternate_path(generatedString);
		byte generatedBuf = err.getBuf();
		if (!ref_git) {
			if (required) {
				ModernizedCProgram.die("%s", generatedBuf);
			} else {
					.fprintf((_iob[2]), ModernizedCProgram._("info: Could not add alternate for '%s': %s\n"), generatedString, generatedBuf);
			} 
		} else {
				strbuf sb = new strbuf(, , );
				sb.strbuf_addf("%s/objects", ref_git);
				ModernizedCProgram.add_to_alternates_file(generatedBuf);
				sb.strbuf_release();
		} 
		err.strbuf_release();
		ModernizedCProgram.free(ref_git);
		return 0;
	}
	public void normalize_glob_ref(Object prefix, Object pattern) {
		strbuf normalized_pattern = new strbuf(, , );
		if (pattern == (byte)'/') {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\refs.c", 503, "pattern must not start with '/'");
		} 
		if (prefix) {
			normalized_pattern.strbuf_addstr(prefix);
		}  else if (!ModernizedCProgram.starts_with(pattern, "refs/")) {
			normalized_pattern.strbuf_addstr("refs/");
		} 
		normalized_pattern.strbuf_addstr(pattern);
		normalized_pattern.strbuf_strip_suffix("/");
		this.setString(normalized_pattern.strbuf_detach(((Object)0)));
		byte generatedString = this.getString();
		this.setUtil(ModernizedCProgram.has_glob_specials(pattern) ? ((Object)0) : generatedString);
		normalized_pattern.strbuf_release();
	}
	public byte getString() {
		return string;
	}
	public void setString(byte newString) {
		string = newString;
	}
	public Object getUtil() {
		return util;
	}
	public void setUtil(Object newUtil) {
		util = newUtil;
	}
}
/**
 * Apply `want` to each item in `list`, retaining only the ones for which
 * the function returns true.  If `free_util` is true, call free() on
 * the util members of any items that have to be deleted.  Preserve
 * the order of the items that are retained.
 */
/**
 * Remove the given string from the sorted list.  If the string
 * doesn't exist, the list is not altered.
 */
/*
 * Remove all but the first of consecutive entries with the same
 * string value.  If free_util is true, call free() on the util
 * members of any items that have to be deleted.
 */
/**
 * Like string_list_append(), except string is never copied.  When
 * list->strdup_strings is set, this function can be used to hand
 * ownership of a malloc()ed string to list without making an extra
 * copy.
 */
/**
 * Sort the list's entries by string value in `strcmp()` order.
 */
/**
 * Remove an item from a string_list. The `string` pointer of the
 * items will be freed in case the `strdup_strings` member of the
 * string_list is set. The third parameter controls if the `util`
 * pointer of the items should be freed or not.
 */
