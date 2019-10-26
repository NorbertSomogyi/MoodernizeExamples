package application;

/* See Documentation/technical/api-directory-listing.txt */
public class dir_entry {
	private int len;
	private Object name;
	
	public dir_entry(int len, Object name) {
		setLen(len);
		setName(name);
	}
	public dir_entry() {
	}
	
	public dir_entry dir_entry_new(Object pathname, int len) {
		dir_entry ent = new dir_entry();
		Object generatedName = (ent).getName();
		do {
			size_t flex_array_len_ = (len);
			(ent) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, (pathname), flex_array_len_);
		} while (0);
		ent.setLen(len);
		return ent;
	}
	public dir_entry dir_add_name(dir_struct dir, index_state istate, Object pathname, int len) {
		cache_entry cache_entry = new cache_entry();
		if (cache_entry.index_file_exists(istate, pathname, len, ModernizedCProgram.ignore_case)) {
			return ((Object)0);
		} 
		int generatedNr = dir.getNr();
		int generatedAlloc = dir.getAlloc();
		dir_entry generatedEntries = dir.getEntries();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					dir.setAlloc((generatedNr + 1));
				} else {
						dir.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedEntries) = ModernizedCProgram.xrealloc((generatedEntries), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		dir_entry dir_entry = new dir_entry();
		return generatedEntries[generatedNr++] = dir_entry.dir_entry_new(pathname, len);
	}
	public dir_entry dir_add_ignored(dir_struct dir, index_state istate, Object pathname, int len) {
		if (!ModernizedCProgram.index_name_is_other(istate, pathname, len)) {
			return ((Object)0);
		} 
		int generatedIgnored_nr = dir.getIgnored_nr();
		int generatedIgnored_alloc = dir.getIgnored_alloc();
		dir_entry generatedIgnored = dir.getIgnored();
		do {
			if ((generatedIgnored_nr + 1) > generatedIgnored_alloc) {
				if ((((generatedIgnored_alloc) + 16) * 3 / 2) < (generatedIgnored_nr + 1)) {
					dir.setIgnored_alloc((generatedIgnored_nr + 1));
				} else {
						dir.setIgnored_alloc((((generatedIgnored_alloc) + 16) * 3 / 2));
				} 
				(generatedIgnored) = ModernizedCProgram.xrealloc((generatedIgnored), ModernizedCProgram.st_mult(, (generatedIgnored_alloc)));
			} 
		} while (0);
		dir_entry dir_entry = new dir_entry();
		return generatedIgnored[generatedIgnored_nr++] = dir_entry.dir_entry_new(pathname, len);
	}
	public dir_entry find_dir_entry__hash(index_state istate, Object name, int namelen, int hash) {
		dir_entry key = new dir_entry();
		Object generatedEnt = key.getEnt();
		generatedEnt.hashmap_entry_init(hash);
		key.setNamelen(namelen);
		hashmap generatedDir_hash = istate.getDir_hash();
		hashmap_entry hashmap_entry = new hashmap_entry();
		return ModernizedCProgram.container_of_or_null_offset(hashmap_entry.hashmap_get(generatedDir_hash, generatedEnt, name), ((size_t)generatedEnt));
	}
	public dir_entry find_dir_entry(index_state istate, Object name, int namelen) {
		dir_entry dir_entry = new dir_entry();
		return dir_entry.find_dir_entry__hash(istate, name, namelen, ModernizedCProgram.memihash(name, namelen));
	}
	public dir_entry hash_dir_entry(index_state istate, cache_entry ce, int namelen) {
		dir_entry dir = new dir_entry();
		Object generatedName = ce.getName();
		while (namelen > 0 && !ModernizedCProgram.git_is_dir_sep(generatedName[namelen - /* get length of parent directory */1])) {
			namelen--;
		}
		if (namelen <= 0) {
			return ((Object)0);
		} 
		namelen--;
		dir_entry dir_entry = new dir_entry();
		dir = dir_entry.find_dir_entry(istate, generatedName, /* lookup existing entry for that directory */namelen);
		Object generatedEnt = dir.getEnt();
		hashmap generatedDir_hash = istate.getDir_hash();
		dir_entry dir_entry = new dir_entry();
		if (!dir) {
			do {
				size_t flex_array_len_ = (namelen);
				(dir) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
				.memcpy((Object)generatedName, (generatedName), flex_array_len_);
			} while (/* not found, create it and add to hash table */0);
			generatedEnt.hashmap_entry_init(ModernizedCProgram.memihash(generatedName, namelen));
			dir.setNamelen(namelen);
			ModernizedCProgram.hashmap_add(generatedDir_hash, generatedEnt);
			dir.setParent(dir_entry.hash_dir_entry(istate, ce, /* recursively add missing parent directories */namelen));
		} 
		return dir;
	}
	public dir_entry hash_dir_entry_with_parent_and_prefix(index_state istate, strbuf prefix) {
		dir_entry dir = new dir_entry();
		int hash;
		int lock_nr;
		/*
			 * Either we have a parent directory and path with slash(es)
			 * or the directory is an immediate child of the root directory.
			 */
		byte generatedBuf = prefix.getBuf();
		(((parent != ((Object)0)) ^ (.strchr(generatedBuf, (byte)'/') == ((Object)0))) ? (Object)0 : ._assert("(parent != NULL) ^ (strchr(prefix->buf, '/') == NULL)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\name-hash.c", 273));
		Object generatedEnt = this.getEnt();
		Object generatedNamelen = this.getNamelen();
		Object generatedLen = prefix.getLen();
		if (parent) {
			hash = ModernizedCProgram.memihash_cont(generatedEnt.getHash(), generatedBuf + generatedNamelen, generatedLen - generatedNamelen);
		} else {
				hash = ModernizedCProgram.memihash(generatedBuf, generatedLen);
		} 
		hashmap generatedDir_hash = istate.getDir_hash();
		lock_nr = ModernizedCProgram.compute_dir_lock_nr(generatedDir_hash, hash);
		ModernizedCProgram.lock_dir_mutex(lock_nr);
		dir_entry dir_entry = new dir_entry();
		dir = dir_entry.find_dir_entry__hash(istate, generatedBuf, generatedLen, hash);
		Object generatedName = (dir).getName();
		Object generatedNr = this.getNr();
		if (!dir) {
			do {
				size_t flex_array_len_ = (generatedLen);
				(dir) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
				.memcpy((Object)generatedName, (generatedBuf), flex_array_len_);
			} while (0);
			generatedEnt.hashmap_entry_init(hash);
			dir.setNamelen(generatedLen);
			dir.setParent(parent);
			ModernizedCProgram.hashmap_add(generatedDir_hash, generatedEnt);
			if (parent) {
				ModernizedCProgram.unlock_dir_mutex(lock_nr);
				lock_nr = ModernizedCProgram.compute_dir_lock_nr(generatedDir_hash, generatedEnt.getHash());
				ModernizedCProgram.lock_dir_mutex(lock_nr);
				generatedNr++;
			} 
		} 
		ModernizedCProgram.unlock_dir_mutex(lock_nr);
		return dir/*
		 * handle_range_1() and handle_range_dir() are derived from
		 * clear_ce_flags_1() and clear_ce_flags_dir() in unpack-trees.c
		 * and handle the iteration over the entire array of index entries.
		 * They use recursion for adjacent entries in the same parent
		 * directory.
		 */;
	}
	public void show_dir_entry(Object istate, Object tag) {
		int len = ModernizedCProgram.max_prefix_len;
		int generatedLen = this.getLen();
		if (len > generatedLen) {
			ModernizedCProgram.die("git ls-files: internal error - directory entry not superset of prefix");
		} 
		if (!ModernizedCProgram.dir_path_match(istate, ent, ModernizedCProgram.pathspec, len, ModernizedCProgram.ps_matched)) {
			return ;
		} 
		.fputs(tag, (_iob[1]));
		Object generatedName = this.getName();
		ModernizedCProgram.write_eolinfo(istate, ((Object)0), generatedName);
		ModernizedCProgram.write_name(generatedName);
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
