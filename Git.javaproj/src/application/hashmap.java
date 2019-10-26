package application;

public class hashmap {
	private hashmap_entry table;
	private Object cmpfn;
	private Object cmpfn_data;
	private int private_size;
	private int tablesize;
	private int grow_at;
	private int shrink_at;
	private int do_count_items;
	
	public hashmap(hashmap_entry table, Object cmpfn, Object cmpfn_data, int private_size, int tablesize, int grow_at, int shrink_at, int do_count_items) {
		setTable(table);
		setCmpfn(cmpfn);
		setCmpfn_data(cmpfn_data);
		setPrivate_size(private_size);
		setTablesize(tablesize);
		setGrow_at(grow_at);
		setShrink_at(shrink_at);
		setDo_count_items(do_count_items);
	}
	public hashmap() {
	}
	
	public Object anonymize_mem(Object generate, Object orig, Object len) {
		anonymized_entry key = new anonymized_entry();
		anonymized_entry ret = new anonymized_entry();
		Object generatedCmpfn = this.getCmpfn();
		if (!generatedCmpfn) {
			map.hashmap_init(anonymized_entry_cmp, ((Object)0), 0);
		} 
		hashmap_entry generatedHash = key.getHash();
		generatedHash.hashmap_entry_init(ModernizedCProgram.memhash(orig, len));
		key.setOrig(orig);
		key.setOrig_len(len);
		hashmap_entry hashmap_entry = new hashmap_entry();
		ret = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(map, generatedHash, ((Object)0)), ((size_t)generatedHash));
		if (!ret) {
			ret = ModernizedCProgram.xmalloc();
			generatedHash.hashmap_entry_init(generatedHash);
			ret.setOrig(ModernizedCProgram.xstrdup(orig));
			ret.setOrig_len(len);
			ret.setAnon(.generate(orig, len));
			ret.setAnon_len(len);
			generatedHash.hashmap_put(map);
		} 
		Object generatedAnon_len = ret.getAnon_len();
		len = generatedAnon_len;
		Object generatedAnon = ret.getAnon();
		return generatedAnon;
	}
	/* load factor in percent */
	public void alloc_table(int size) {
		this.setTablesize(size);
		this.setTable(ModernizedCProgram.xcalloc(size, ));
		this.setGrow_at((int)((uint64_t)size * 80 / /* calculate resize thresholds for new size */100));
		int generatedGrow_at = this.getGrow_at();
		if (size <= 64) {
			this.setShrink_at(0/*
					 * The shrink-threshold must be slightly smaller than
					 * (grow-threshold / resize-factor) to prevent erratic resizing,
					 * thus we divide by (resize-factor + 1).
					 */);
		} else {
				this.setShrink_at(generatedGrow_at / ((1 << 2) + 1));
		} 
	}
	public void rehash(int newsize) {
		int generatedTablesize = this.getTablesize();
		int i;
		int oldsize = generatedTablesize;
		hashmap_entry generatedTable = this.getTable();
		hashmap_entry oldtable = generatedTable;
		map.alloc_table(newsize);
		hashmap_entry generatedNext = e.getNext();
		for (i = 0; i < oldsize; i++) {
			hashmap_entry e = oldtable[i];
			while (e) {
				hashmap_entry next = generatedNext;
				int b = ModernizedCProgram.bucket(map, e);
				e.setNext(generatedTable[b]);
				generatedTable[b] = e;
				e = next;
			}
		}
		ModernizedCProgram.free(oldtable);
	}
	public void hashmap_init(Object equals_function, Object cmpfn_data, Object initial_size) {
		int size = 64;
		.memset(map, 0, );
		this.setCmpfn(equals_function ? equals_function : always_equal);
		this.setCmpfn_data(cmpfn_data);
		initial_size = (int)((uint64_t)initial_size * /* calculate initial table size and allocate the table */100 / 80);
		while (initial_size > size) {
			size <<=  2;
		}
		map.alloc_table(size/*
			 * Keep track of the number of items in the map and
			 * allow the map to automatically grow as necessary.
			 */);
		this.setDo_count_items(1);
	}
	public void hashmap_free_(Object entry_offset) {
		hashmap_entry generatedTable = this.getTable();
		if (!map || !generatedTable) {
			return ;
		} 
		hashmap_entry hashmap_entry = new hashmap_entry();
		if (entry_offset >= /* called by hashmap_free_entries */0) {
			hashmap_iter iter = new hashmap_iter();
			hashmap_entry e = new hashmap_entry();
			ModernizedCProgram.hashmap_iter_init(map, iter);
			while ((e = hashmap_entry.hashmap_iter_next(iter/*
						 * like container_of, but using caller-calculated
						 * offset (caller being hashmap_free_entries)
						 */))) {
				ModernizedCProgram.free((byte)e - entry_offset);
			}
		} 
		ModernizedCProgram.free(generatedTable);
		.memset(map, 0, );
	}
	public int hashmap_get_size() {
		int generatedDo_count_items = this.getDo_count_items();
		int generatedPrivate_size = this.getPrivate_size();
		if (generatedDo_count_items) {
			return generatedPrivate_size;
		} 
		ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\hashmap.h", 278, "hashmap_get_size: size not set");
		return 0/*
		 * Returns the hashmap entry for the specified key, or NULL if not found.
		 *
		 * `map` is the hashmap structure.
		 *
		 * `key` is a user data structure that starts with hashmap_entry that has at
		 * least been initialized with the proper hash code (via `hashmap_entry_init`).
		 *
		 * `keydata` is a data structure that holds just enough information to check
		 * for equality to a given entry.
		 *
		 * If the key data is variable-sized (e.g. a FLEX_ARRAY string) or quite large,
		 * it is undesirable to create a full-fledged entry structure on the heap and
		 * copy all the key data into the structure.
		 *
		 * In this case, the `keydata` parameter can be used to pass
		 * variable-sized key data directly to the comparison function, and the `key`
		 * parameter can be a stripped-down, fixed size entry structure allocated on the
		 * stack.
		 *
		 * If an entry with matching hash code is found, `key` and `keydata` are passed
		 * to `hashmap_cmp_fn` to decide whether the entry matches the key.
		 */;
	}
	/*
	 * returns the next equal pointer to @var, or NULL if not found.
	 * @var is a pointer of any type containing "struct hashmap_entry"
	 * @member is the name of the "struct hashmap_entry" field
	 */
	/*
	 * iterate @map starting from @var, where @var is a pointer of @type
	 * and @member is the name of the "struct hashmap_entry" field in @type
	 */
	/*
	 * Disable item counting and automatic rehashing when adding/removing items.
	 *
	 * Normally, the hashmap keeps track of the number of items in the map
	 * and uses it to dynamically resize it.  This (both the counting and
	 * the resizing) can cause problems when the map is being used by
	 * threaded callers (because the hashmap code does not know about the
	 * locking strategy used by the threaded callers and therefore, does
	 * not know how to protect the "private_size" counter).
	 */
	public void hashmap_disable_item_counting() {
		this.setDo_count_items(0/*
		 * Re-enable item couting when adding/removing items.
		 * If counting is currently disabled, it will force count them.
		 * It WILL NOT automatically rehash them.
		 */);
	}
	public void hashmap_enable_item_counting() {
		int n = 0;
		hashmap_iter iter = new hashmap_iter();
		int generatedDo_count_items = this.getDo_count_items();
		if (generatedDo_count_items) {
			return ;
		} 
		ModernizedCProgram.hashmap_iter_init(map, iter);
		hashmap_entry hashmap_entry = new hashmap_entry();
		while (hashmap_entry.hashmap_iter_next(iter)) {
			n++;
		}
		this.setDo_count_items(1);
		this.setPrivate_size(n/* String interning *//*
		 * Returns the unique, interned version of the specified string or data,
		 * similar to the `String.intern` API in Java and .NET, respectively.
		 * Interned strings remain valid for the entire lifetime of the process.
		 *
		 * Can be used as `[x]strdup()` or `xmemdupz` replacement, except that interned
		 * strings / data must not be modified or freed.
		 *
		 * Interned strings are best used for short strings with high probability of
		 * duplicates.
		 *
		 * Uses a hashmap to store the pool of interned strings.
		 */);
	}
	/* The argument "pass" is 1 for the first file, 2 for the second. */
	public void insert_record(Object xpp, int line, int pass) {
		Object generatedEnv = this.getEnv();
		xrecord_t records = pass == 1 ? generatedEnv.getXdf1().getRecs() : generatedEnv.getXdf2().getRecs();
		xrecord_t record = records[line - 1/*
			 * After xdl_prepare_env() (or more precisely, due to
			 * xdl_classify_record()), the "ha" member of the records (AKA lines)
			 * is _not_ the hash anymore, but a linearized version of it.  In
			 * other words, the "ha" member is guaranteed to start with 0 and
			 * the second record's ha can only be 0 or 1, etc.
			 *
			 * So we multiply ha by 2 in the hope that the hashing was
			 * "unique enough".
			 */];
		xrecord_t other = new xrecord_t();
		long generatedHa = record.getHa();
		Object generatedAlloc = this.getAlloc();
		int index = (int)((generatedHa << 1) % generatedAlloc);
		Object generatedEntries = this.getEntries();
		Object generatedPtr = record.getPtr();
		long generatedSize = record.getSize();
		Object generatedXpp = this.getXpp();
		while (generatedEntries[index].getLine1()) {
			other = generatedEnv.getXdf1().getRecs()[generatedEntries[index].getLine1() - 1];
			if (generatedEntries[index].getHash() != generatedHa || !ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, generatedXpp.getFlags())) {
				if (++index >= generatedAlloc) {
					index = 0;
				} 
				continue;
			} 
			if (pass == 2) {
				this.setHas_matches(1);
			} 
			if (pass == 1 || generatedEntries[index].getLine2()) {
				generatedEntries[index].setLine2(-1024);
			} else {
					generatedEntries[index].setLine2(line);
			} 
			return ;
		}
		if (pass == 2) {
			return ;
		} 
		generatedEntries[index].setLine1(line);
		generatedEntries[index].setHash(generatedHa);
		generatedEntries[index].setAnchor(ModernizedCProgram.is_anchor(xpp, generatedPtr));
		Object generatedFirst = this.getFirst();
		if (!generatedFirst) {
			this.setFirst(generatedEntries + index);
		} 
		Object generatedLast = this.getLast();
		if (generatedLast) {
			generatedLast.setNext(generatedEntries + index);
			generatedEntries[index].setPrevious(generatedLast);
		} 
		this.setLast(generatedEntries + index);
		Object generatedNr = this.getNr();
		generatedNr++;
	}
	public int match(int line1, int line2) {
		Object generatedEnv = this.getEnv();
		xrecord_t record1 = generatedEnv.getXdf1().getRecs()[line1 - 1];
		xrecord_t record2 = generatedEnv.getXdf2().getRecs()[line2 - 1];
		Object generatedPtr = record1.getPtr();
		long generatedSize = record1.getSize();
		Object generatedXpp = this.getXpp();
		return ModernizedCProgram.xdl_recmatch(generatedPtr, generatedSize, generatedPtr, generatedSize, generatedXpp.getFlags());
	}
	public int fall_back_to_classic_diff(int line1, int count1, int line2, int count2) {
		xpparam_t xpp = new xpparam_t();
		Object generatedXpp = this.getXpp();
		xpp.setFlags(generatedXpp.getFlags() & ~((1 << 14) | (1 << 15)));
		Object generatedEnv = this.getEnv();
		return generatedEnv.xdl_fall_back_diff(xpp, line1, count1, line2, count2/*
		 * Recursively find the longest common sequence of unique lines,
		 * and if none was found, ask xdl_do_diff() to do the job.
		 *
		 * This function assumes that env was prepared with xdl_prepare_env().
		 */);
		xpparam_t xpparam = new xpparam_t();
		xpparam.setFlags(xpp.getFlags() & ~((1 << 14) | (1 << 15)));
		return env.xdl_fall_back_diff(xpparam, line1, count1, line2, count2);
	}
	public void refname_hash_init() {
		map.hashmap_init(refname_hash_entry_cmp, ((Object)0), 0);
	}
	public int refname_hash_exists(Object refname) {
		hashmap_entry hashmap_entry = new hashmap_entry();
		return !!hashmap_entry.hashmap_get_from_hash(map, ModernizedCProgram.strhash(refname), refname);
	}
	public void add_left_or_right(Object path, Object content, int is_right) {
		pair_entry e = new pair_entry();
		pair_entry existing = new pair_entry();
		Object generatedPath = ((e)).getPath();
		do {
			size_t flex_array_len_ = (.strlen(path));
			((e)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedPath, ((path)), flex_array_len_);
		} while (0);
		hashmap_entry generatedEntry = e.getEntry();
		generatedEntry.hashmap_entry_init(ModernizedCProgram.strhash(path));
		hashmap_entry hashmap_entry = new hashmap_entry();
		existing = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(map, generatedEntry, ((Object)0)), ((size_t)generatedEntry));
		Object generatedLeft = e.getLeft();
		Object generatedRight = e.getRight();
		if (existing) {
			ModernizedCProgram.free(e);
			e = existing;
		} else {
				generatedLeft[0] = generatedRight[0] = (byte)'\0';
				ModernizedCProgram.hashmap_add(map, generatedEntry);
		} 
		.strlcpy(is_right ? generatedRight : generatedLeft, content, 260);
	}
	public void changed_files(Object index_path, Object workdir) {
		child_process update_index = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		child_process diff_files = new child_process(((Object)0), new child_process(ModernizedCProgram.empty_argv, 0, 0), new child_process(ModernizedCProgram.empty_argv, 0, 0));
		strbuf index_env = new strbuf(, , );
		strbuf buf = new strbuf(, , );
		byte git_dir = ModernizedCProgram.absolute_path(ModernizedCProgram.get_git_dir());
		byte[] env = new byte[]{((Object)0), ((Object)0)};
		FILE fp = new FILE();
		index_env.strbuf_addf("GIT_INDEX_FILE=%s", index_path);
		byte generatedBuf = index_env.getBuf();
		env[0] = generatedBuf;
		argv_array generatedArgs = update_index.getArgs();
		generatedArgs.argv_array_pushl("--git-dir", git_dir, "--work-tree", workdir, "update-index", "--really-refresh", "-q", "--unmerged", ((Object)0));
		update_index.setNo_stdin(1);
		update_index.setNo_stdout(1);
		update_index.setNo_stderr(1);
		update_index.setGit_cmd(1);
		update_index.setUse_shell(0);
		update_index.setClean_on_exit(1);
		update_index.setDir(workdir);
		update_index.setEnv(env);
		/* Ignore any errors of update-index */update_index.run_command();
		generatedArgs.argv_array_pushl("--git-dir", git_dir, "--work-tree", workdir, "diff-files", "--name-only", "-z", ((Object)0));
		diff_files.setNo_stdin(1);
		diff_files.setGit_cmd(1);
		diff_files.setUse_shell(0);
		diff_files.setClean_on_exit(1);
		diff_files.setOut(-1);
		diff_files.setDir(workdir);
		diff_files.setEnv(env);
		if (diff_files.start_command()) {
			ModernizedCProgram.die("could not obtain raw diff");
		} 
		int generatedOut = diff_files.getOut();
		fp = ModernizedCProgram.xfdopen(generatedOut, "r");
		Object generatedPath = ((entry)).getPath();
		hashmap_entry generatedEntry = entry.getEntry();
		while (!ModernizedCProgram.strbuf_getline_nul(buf, fp)) {
			path_entry entry = new path_entry();
			do {
				size_t flex_array_len_ = (.strlen(generatedBuf));
				((entry)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
				.memcpy((Object)generatedPath, ((generatedBuf)), flex_array_len_);
			} while (0);
			generatedEntry.hashmap_entry_init(ModernizedCProgram.strhash(generatedBuf));
			ModernizedCProgram.hashmap_add(result, generatedEntry);
		}
		.fclose(fp);
		if (diff_files.finish_command()) {
			ModernizedCProgram.die("diff-files did not exit properly");
		} 
		index_env.strbuf_release();
		buf.strbuf_release();
	}
	public void paths_and_oids_init() {
		map.hashmap_init(path_and_oids_cmp, ((Object)0), 0);
	}
	public void paths_and_oids_clear() {
		hashmap_iter iter = new hashmap_iter();
		path_and_oids_entry entry = new path_and_oids_entry();
		oidset generatedTrees = entry.getTrees();
		Byte generatedPath = entry.getPath();
		hashmap_entry hashmap_entry = new hashmap_entry();
		hashmap_entry hashmap_entry = new hashmap_entry();
		for (entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_first(map, iter), ((size_t)((int)0).getEnt())); entry; entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_iter_next(iter), ((size_t)((int)0).getEnt()))) {
			generatedTrees.oidset_clear();
			ModernizedCProgram.free(generatedPath);
		}
		map.hashmap_free_(((size_t)((path_and_oids_entry)0).getEnt()));
		;
	}
	public void paths_and_oids_insert(Object path, Object oid) {
		int hash = ModernizedCProgram.strhash(path);
		path_and_oids_entry key = new path_and_oids_entry();
		path_and_oids_entry entry = new path_and_oids_entry();
		hashmap_entry generatedEnt = key.getEnt();
		generatedEnt.hashmap_entry_init(hash);
		key.setPath((byte)/* use a shallow copy for the lookup */path);
		oidset generatedTrees = key.getTrees();
		generatedTrees.oidset_init(0);
		hashmap_entry hashmap_entry = new hashmap_entry();
		entry = ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(map, generatedEnt, ((Object)0)), ((size_t)generatedEnt));
		Byte generatedPath = key.getPath();
		if (!entry) {
			entry = ModernizedCProgram.xcalloc(1, );
			generatedEnt.hashmap_entry_init(hash);
			entry.setPath(ModernizedCProgram.xstrdup(generatedPath));
			generatedTrees.oidset_init(16);
			generatedEnt.hashmap_put(map);
		} 
		generatedTrees.oidset_insert(oid);
	}
	public hashmap_entry getTable() {
		return table;
	}
	public void setTable(hashmap_entry newTable) {
		table = newTable;
	}
	public Object getCmpfn() {
		return cmpfn;
	}
	public void setCmpfn(Object newCmpfn) {
		cmpfn = newCmpfn;
	}
	public Object getCmpfn_data() {
		return cmpfn_data;
	}
	public void setCmpfn_data(Object newCmpfn_data) {
		cmpfn_data = newCmpfn_data;
	}
	public int getPrivate_size() {
		return private_size;
	}
	public void setPrivate_size(int newPrivate_size) {
		private_size = newPrivate_size;
	}
	public int getTablesize() {
		return tablesize;
	}
	public void setTablesize(int newTablesize) {
		tablesize = newTablesize;
	}
	public int getGrow_at() {
		return grow_at;
	}
	public void setGrow_at(int newGrow_at) {
		grow_at = newGrow_at;
	}
	public int getShrink_at() {
		return shrink_at;
	}
	public void setShrink_at(int newShrink_at) {
		shrink_at = newShrink_at;
	}
	public int getDo_count_items() {
		return do_count_items;
	}
	public void setDo_count_items(int newDo_count_items) {
		do_count_items = newDo_count_items;
	}
}
