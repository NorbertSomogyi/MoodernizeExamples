package application;

/* the pathspec pattern satisfies GFNM_ONESTAR */
public class pathspec {
	private int nr;
	private int has_wildcard;
	private int recursive;
	private int recurse_submodules;
	private int magic;
	private int max_depth;
	private pathspec_item[] items;
	
	public pathspec(int nr, int has_wildcard, int recursive, int recurse_submodules, int magic, int max_depth, pathspec_item[] items) {
		setNr(nr);
		setHas_wildcard(has_wildcard);
		setRecursive(recursive);
		setRecurse_submodules(recurse_submodules);
		setMagic(magic);
		setMax_depth(max_depth);
		setItems(items);
	}
	public pathspec() {
	}
	
	public void parse_args(Object[][] argv, Object prefix, int patch_mode, Object rev_ret) {
		byte rev = "HEAD";
		object_id unused = new object_id();
		/*
			 * Possible arguments are:
			 *
			 * git reset [-opts] [<rev>]
			 * git reset [-opts] <tree> [<paths>...]
			 * git reset [-opts] <tree> -- [<paths>...]
			 * git reset [-opts] -- [<paths>...]
			 * git reset [-opts] <paths>...
			 *
			 * At this point, argv points immediately after [-opts].
			 */
		if (argv[0]) {
			if (!/*Error: Function owner not recognized*/strcmp(argv[0], "--")) {
				/* reset to HEAD, possibly with paths */argv++;
			}  else if (argv[1] && !/*Error: Function owner not recognized*/strcmp(argv[1], "--")) {
				rev = argv[0];
				argv += 2/*
						 * Otherwise, argv[0] could be either <rev> or <paths> and
						 * has to be unambiguous. If there is a single argument, it
						 * can not be a tree
						 */;
			}  else if ((!argv[1] && !ModernizedCProgram.repo_get_oid_committish(ModernizedCProgram.the_repository, argv[0], unused)) || (argv[1] && !ModernizedCProgram.repo_get_oid_treeish(ModernizedCProgram.the_repository, argv[0], unused/*
						 * Ok, argv[0] looks like a commit/tree; it should not
						 * be a filename.
						 */))) {
				ModernizedCProgram.verify_non_filename(prefix, argv[0]);
				rev = argv++;
			} else {
					ModernizedCProgram.verify_filename(prefix, argv[0], /* Otherwise we treat this as a filename */1);
			} 
		} 
		rev_ret = rev;
		if (ModernizedCProgram.the_repository.repo_read_index() < 0) {
			ModernizedCProgram.die(ModernizedCProgram._("index file corrupt"));
		} 
		ModernizedCProgram.pathspec.parse_pathspec(0, (1 << 1) | (patch_mode ? (1 << 4) : 0), prefix, argv);
	}
	public void parse_pathspec(int magic_mask, int flags, Object prefix, Object[][] argv) {
		pathspec_item item = new pathspec_item();
		byte entry = argv ? argv : ((Object)0);
		int i;
		int n;
		int prefixlen;
		int nr_exclude = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.pathspec, 0, /*Error: sizeof expression not supported yet*/);
		if (flags & (1 << 2)) {
			ModernizedCProgram.pathspec.getMagic() |=  (1 << 1);
		} 
		if (!entry && !/* No arguments, no prefix -> no pathspec */prefix) {
			return /*Error: Unsupported expression*/;
		} 
		if ((flags & (1 << 0)) && (flags & (1 << 1))) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 547, "PATHSPEC_PREFER_CWD and PATHSPEC_PREFER_FULL are incompatible");
		} 
		int generatedLen = item.getLen();
		if (!/* No arguments with prefix -> prefix pathspec */entry) {
			if (flags & (1 << 1)) {
				return /*Error: Unsupported expression*/;
			} 
			if (!(flags & (1 << 0))) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 555, "PATHSPEC_PREFER_CWD requires arguments");
			} 
			ModernizedCProgram.pathspec.setItems(item = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
			item.setMatch(ModernizedCProgram.xstrdup(prefix));
			item.setOriginal(ModernizedCProgram.xstrdup(prefix));
			item.setNowildcard_len(item.setLen(/*Error: Function owner not recognized*/strlen(prefix)));
			item.setPrefix(generatedLen);
			ModernizedCProgram.pathspec.setNr(1);
			return /*Error: Unsupported expression*/;
		} 
		n = 0;
		while (argv[n]) {
			if (argv[n] == (byte)'\0') {
				ModernizedCProgram.die("empty string is not a valid pathspec. please use . instead if you meant to match all paths");
			} 
			n++;
		}
		ModernizedCProgram.pathspec.setNr(n);
		(ModernizedCProgram.pathspec.getItems()) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (n + 1)));
		item = ModernizedCProgram.pathspec.getItems();
		prefixlen = prefix ? /*Error: Function owner not recognized*/strlen(prefix) : 0;
		for (i = 0; i < n; i++) {
			entry = argv[i];
			item + i.init_pathspec_item(flags, prefix, prefixlen, entry);
			if (item[i].getMagic() & (1 << 5)) {
				nr_exclude++;
			} 
			if (item[i].getMagic() & magic_mask) {
				ModernizedCProgram.unsupported_magic(entry, item[i].getMagic() & magic_mask);
			} 
			if ((flags & (1 << 3)) && ModernizedCProgram.has_symlink_leading_path(item[i].getMatch(), generatedLen)) {
				ModernizedCProgram.die(ModernizedCProgram._("pathspec '%s' is beyond a symbolic link"), entry);
			} 
			if (item[i].getPathspec_item() < item[i].getPathspec_item()) {
				ModernizedCProgram.pathspec.setHas_wildcard(1);
			} 
			ModernizedCProgram.pathspec.getMagic() |=  item[i].getPathspec_item();
		}
		if (nr_exclude == n) {
			int plen = (!(flags & (1 << 0))) ? 0 : prefixlen;
			item + n.init_pathspec_item(0, prefix, plen, "");
			ModernizedCProgram.pathspec.getNr()++;
		} 
		if (ModernizedCProgram.pathspec.getMagic() & (1 << 1)) {
			if (flags & (1 << 5)) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 611, "PATHSPEC_MAXDEPTH_VALID and PATHSPEC_KEEP_ORDER are incompatible");
			} 
			ModernizedCProgram.sane_qsort((ModernizedCProgram.pathspec.getItems()), (ModernizedCProgram.pathspec.getNr()), /*Error: sizeof expression not supported yet*/, pathspec_item_cmp);
		} 
	}
	public void copy_pathspec(Object src) {
		int i;
		int j;
		dst = src;
		pathspec_item[] generatedItems = this.getItems();
		int generatedNr = this.getNr();
		(generatedItems) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedNr)));
		ModernizedCProgram.copy_array((generatedItems), (generatedItems), (generatedNr), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
		Byte generatedMatch = s.getMatch();
		Byte generatedOriginal = s.getOriginal();
		attr_match[] generatedAttr_match = d.getAttr_match();
		int generatedAttr_match_nr = d.getAttr_match_nr();
		attr_check generatedAttr_check = s.getAttr_check();
		attr_check attr_check = new attr_check();
		for (i = 0; i < generatedNr; i++) {
			pathspec_item d = generatedItems[i];
			pathspec_item s = generatedItems[i];
			d.setMatch(ModernizedCProgram.xstrdup(generatedMatch));
			d.setOriginal(ModernizedCProgram.xstrdup(generatedOriginal));
			(generatedAttr_match) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAttr_match_nr)));
			ModernizedCProgram.copy_array((generatedAttr_match), (generatedAttr_match), (generatedAttr_match_nr), /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
			for (j = 0; j < generatedAttr_match_nr; j++) {
				byte value = generatedAttr_match[j].getValue();
				generatedAttr_match[j].setValue(ModernizedCProgram.xstrdup_or_null(value));
			}
			d.setAttr_check(attr_check.attr_check_dup(generatedAttr_check));
		}
	}
	public void clear_pathspec() {
		int i;
		int j;
		for (i = 0; i < ModernizedCProgram.pathspec.getNr(); i++) {
			ModernizedCProgram.free(ModernizedCProgram.pathspec.getItems()[i].getMatch());
			ModernizedCProgram.free(ModernizedCProgram.pathspec.getItems()[i].getOriginal());
			for (j = 0; j < ModernizedCProgram.pathspec.getItems()[i].getAttr_match_nr(); j++) {
				ModernizedCProgram.free(ModernizedCProgram.pathspec.getItems()[i].getAttr_match()[j].getValue());
			}
			ModernizedCProgram.free(ModernizedCProgram.pathspec.getItems()[i].getAttr_match());
			if (ModernizedCProgram.pathspec.getItems()[i].getAttr_check()) {
				ModernizedCProgram.pathspec.getItems()[i].getAttr_check().attr_check_free();
			} 
		}
		do {
			ModernizedCProgram.free(ModernizedCProgram.pathspec.getItems());
			(ModernizedCProgram.pathspec.getItems()) = ((Object)0);
		} while (0);
		ModernizedCProgram.pathspec.setNr(0);
	}
	public void chmod_pathspec(byte flip) {
		int i;
		Object generatedName = ce.getName();
		for (i = 0; i < (ModernizedCProgram.the_index.getCache_nr()); i++) {
			cache_entry ce = (ModernizedCProgram.the_index.getCache())[i];
			if (ModernizedCProgram.pathspec && !ModernizedCProgram.ce_path_match(ModernizedCProgram.the_index, ce, ModernizedCProgram.pathspec, ((Object)0))) {
				continue;
			} 
			if (ModernizedCProgram.chmod_index_entry(ModernizedCProgram.the_index, (ce), (flip)) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "cannot chmod %cx '%s'\n", flip, generatedName);
			} 
		}
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getHas_wildcard() {
		return has_wildcard;
	}
	public void setHas_wildcard(int newHas_wildcard) {
		has_wildcard = newHas_wildcard;
	}
	public int getRecursive() {
		return recursive;
	}
	public void setRecursive(int newRecursive) {
		recursive = newRecursive;
	}
	public int getRecurse_submodules() {
		return recurse_submodules;
	}
	public void setRecurse_submodules(int newRecurse_submodules) {
		recurse_submodules = newRecurse_submodules;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public int getMax_depth() {
		return max_depth;
	}
	public void setMax_depth(int newMax_depth) {
		max_depth = newMax_depth;
	}
	public pathspec_item[] getItems() {
		return items;
	}
	public void setItems(pathspec_item[] newItems) {
		items = newItems;
	}
}
