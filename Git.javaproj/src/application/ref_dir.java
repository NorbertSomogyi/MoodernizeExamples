package application;

/* if (flags&REF_DIR) */
public class ref_dir {
	private int nr;
	private int alloc;
	private int sorted;
	private ref_cache cache;
	private ref_entry entries;
	
	public ref_dir(int nr, int alloc, int sorted, ref_cache cache, ref_entry entries) {
		setNr(nr);
		setAlloc(alloc);
		setSorted(sorted);
		setCache(cache);
		setEntries(entries);
	}
	public ref_dir() {
	}
	
	public void add_per_worktree_entries_to_dir(Object dirname) {
		byte[] prefixes = new byte[]{"refs/bisect/", "refs/worktree/", "refs/rewritten/"};
		int ip;
		if (.strcmp(dirname, "refs/")) {
			return ;
		} 
		ref_cache generatedCache = this.getCache();
		ref_entry ref_entry = new ref_entry();
		for (ip = 0; ip < ( /  + ( - 1)); ip++) {
			byte prefix = prefixes[ip];
			int prefix_len = .strlen(ModernizedCProgram.prefix);
			ref_entry child_entry = new ref_entry();
			int pos;
			pos = dir.search_ref_dir(ModernizedCProgram.prefix, ModernizedCProgram.prefix_len);
			if (pos >= 0) {
				continue;
			} 
			child_entry = ref_entry.create_dir_entry(generatedCache, ModernizedCProgram.prefix, ModernizedCProgram.prefix_len, 1);
			ModernizedCProgram.add_entry_to_dir(dir, child_entry/*
			 * Read the loose references from the namespace dirname into dir
			 * (without recursing).  dirname must end with '/'.  dir must be the
			 * directory entry corresponding to dirname.
			 */);
		}
	}
	public ref_dir get_ref_dir(ref_entry entry) {
		ref_dir dir = new ref_dir();
		byte generatedFlag = entry.getFlag();
		((generatedFlag & -1024) ? (Object)0 : ._assert("entry->flag & REF_DIR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ref-cache.c", 22));
		 generatedU = entry.getU();
		Object generatedSubdir = generatedU.getSubdir();
		dir = generatedSubdir;
		ref_cache generatedCache = dir.getCache();
		Object generatedFill_ref_dir = generatedCache.getFill_ref_dir();
		ref_store generatedRef_store = generatedCache.getRef_store();
		Object generatedName = entry.getName();
		if (generatedFlag & -1024) {
			if (!generatedFill_ref_dir) {
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ref-cache.c", 26, "incomplete ref_store without fill_ref_dir function");
			} 
			.UNRECOGNIZEDFUNCTIONNAME(generatedRef_store, dir, generatedName);
			generatedFlag &=  ~-1024;
		} 
		return dir;
	}
	public void clear_ref_dir() {
		int i;
		int generatedNr = this.getNr();
		ref_entry generatedEntries = this.getEntries();
		for (i = 0; i < generatedNr; i++) {
			generatedEntries[i].free_ref_entry();
		}
		do {
			ModernizedCProgram.free(generatedEntries);
			(generatedEntries) = ((Object)0);
		} while (0);
		this.setSorted(this.setNr(this.setAlloc(0)));
	}
	public int search_ref_dir(Object refname, Object len) {
		ref_entry r = new ref_entry();
		string_slice key = new string_slice();
		int generatedNr = this.getNr();
		if (refname == ((Object)0) || !generatedNr) {
			return -1;
		} 
		dir.sort_ref_dir();
		key.setLen(len);
		key.setStr(refname);
		ref_entry generatedEntries = this.getEntries();
		r = .bsearch(key, generatedEntries, generatedNr, , ref_entry_cmp_sslice);
		if (r == ((Object)0)) {
			return -1;
		} 
		return r - generatedEntries;
	}
	public ref_dir search_for_subdir(Object subdirname, Object len, int mkdir) {
		int entry_index = dir.search_ref_dir(subdirname, len);
		ref_entry entry = new ref_entry();
		ref_cache generatedCache = this.getCache();
		ref_entry ref_entry = new ref_entry();
		ref_entry generatedEntries = this.getEntries();
		if (entry_index == -1) {
			if (!mkdir) {
				return ((Object)0/*
						 * Since dir is complete, the absence of a subdir
						 * means that the subdir really doesn't exist;
						 * therefore, create an empty record for it but mark
						 * the record complete.
						 */);
			} 
			entry = ref_entry.create_dir_entry(generatedCache, subdirname, len, 0);
			ModernizedCProgram.add_entry_to_dir(dir, entry);
		} else {
				entry = generatedEntries[entry_index];
		} 
		ref_dir ref_dir = new ref_dir();
		return ref_dir.get_ref_dir(entry/*
		 * If refname is a reference name, find the ref_dir within the dir
		 * tree that should hold refname. If refname is a directory name
		 * (i.e., it ends in '/'), then return that ref_dir itself. dir must
		 * represent the top-level directory and must already be complete.
		 * Sort ref_dirs and recurse into subdirectories as necessary. If
		 * mkdir is set, then create any missing directories; otherwise,
		 * return NULL if the desired directory cannot be found.
		 */);
	}
	public ref_dir find_containing_dir(Object refname, int mkdir) {
		byte slash;
		for (slash = .strchr(refname, (byte)'/'); slash; slash = .strchr(slash + 1, (byte)'/')) {
			size_t dirnamelen = slash - refname + 1;
			ref_dir subdir = new ref_dir();
			subdir = dir.search_for_subdir(refname, dirnamelen, mkdir);
			if (!subdir) {
				dir = ((Object)0);
				break;
			} 
			dir = subdir;
		}
		return dir;
	}
	public int remove_entry_from_dir(Object refname) {
		int refname_len = .strlen(refname);
		int entry_index;
		ref_entry entry = new ref_entry();
		int is_dir = refname[refname_len - 1] == (byte)'/';
		if (is_dir/*
				 * refname represents a reference directory.  Remove
				 * the trailing slash; otherwise we will get the
				 * directory *representing* refname rather than the
				 * one *containing* it.
				 */) {
			byte dirname = ModernizedCProgram.xmemdupz(refname, refname_len - 1);
			dir = dir.find_containing_dir(dirname, 0);
			ModernizedCProgram.free(dirname);
		} else {
				dir = dir.find_containing_dir(refname, 0);
		} 
		if (!dir) {
			return -1;
		} 
		entry_index = dir.search_ref_dir(refname, refname_len);
		if (entry_index == -1) {
			return -1;
		} 
		ref_entry generatedEntries = this.getEntries();
		entry = generatedEntries[entry_index];
		int generatedNr = this.getNr();
		ModernizedCProgram.move_array((generatedEntries[entry_index]), (generatedEntries[entry_index + 1]), (generatedNr - entry_index - 1),  + ( - 1));
		generatedNr--;
		int generatedSorted = this.getSorted();
		if (generatedSorted > entry_index) {
			generatedSorted--;
		} 
		entry.free_ref_entry();
		return generatedNr;
	}
	public void sort_ref_dir() {
		int i;
		int j;
		ref_entry last = ((Object)0/*
			 * This check also prevents passing a zero-length array to qsort(),
			 * which is a problem on some platforms.
			 */);
		int generatedSorted = this.getSorted();
		int generatedNr = this.getNr();
		if (generatedSorted == generatedNr) {
			return ;
		} 
		ref_entry generatedEntries = this.getEntries();
		ModernizedCProgram.sane_qsort((generatedEntries), (generatedNr), , ref_entry_cmp);
		for (; j < generatedNr; /* Remove any duplicates: */j++) {
			ref_entry entry = generatedEntries[j];
			if (last && ModernizedCProgram.is_dup_ref(last, entry)) {
				entry.free_ref_entry();
			} else {
					last = generatedEntries[i++] = entry;
			} 
		}
		this.setSorted(this.setNr(i));
	}
	public void prime_ref_dir(Object prefix) {
		int i;
		int generatedNr = this.getNr();
		ref_entry generatedEntries = this.getEntries();
		byte generatedFlag = entry.getFlag();
		ref_dir ref_dir = new ref_dir();
		Object generatedName = entry.getName();
		for (i = 0; i < generatedNr; i++) {
			ref_entry entry = generatedEntries[i];
			if (!(generatedFlag & -1024)) {
			}  else if (!/* Not a directory; no need to recurse. */prefix) {
				ref_dir.get_ref_dir(entry).prime_ref_dir(((Object)/* Recurse in any case: */0));
			} else {
					switch (ModernizedCProgram.overlaps_prefix(generatedName, prefix)) {
					case prefix_state.PREFIX_CONTAINS_DIR/*
									 * Recurse, and from here down we
									 * don't have to check the prefix
									 * anymore:
									 */:
							ref_dir.get_ref_dir(entry).prime_ref_dir(((Object)0));
							break;
					case prefix_state.PREFIX_EXCLUDES_DIR/* No need to prime this directory. */:
							break;
					case prefix_state.PREFIX_WITHIN_DIR:
							ref_dir.get_ref_dir(entry).prime_ref_dir(prefix);
							break;
					}
			} 
		}
	}
	/*
		 * The hard work of loading loose refs is done by get_ref_dir(), so we
		 * just need to recurse through all of the sub-directories. We do not
		 * even need to care about sorting, as traversal order does not matter
		 * to us.
		 */
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
	public int getSorted() {
		return sorted;
	}
	public void setSorted(int newSorted) {
		sorted = newSorted;
	}
	public ref_cache getCache() {
		return cache;
	}
	public void setCache(ref_cache newCache) {
		cache = newCache;
	}
	public ref_entry getEntries() {
		return entries;
	}
	public void setEntries(ref_entry newEntries) {
		entries = newEntries;
	}
}
/*
 * Create a struct ref_entry object for the specified dirname.
 * dirname is the name of the directory with a trailing slash (e.g.,
 * "refs/heads/") or "" for the top-level directory.
 */
