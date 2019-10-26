package application;

public class traverse_info {
	private Object traverse_path;
	private traverse_info prev;
	private Object name;
	private Object namelen;
	private int mode;
	private Object pathlen;
	private pathspec pathspec;
	private long df_conflicts;
	private Object fn;
	private Object data;
	private int show_all_errors;
	
	public traverse_info(Object traverse_path, traverse_info prev, Object name, Object namelen, int mode, Object pathlen, pathspec pathspec, long df_conflicts, Object fn, Object data, int show_all_errors) {
		setTraverse_path(traverse_path);
		setPrev(prev);
		setName(name);
		setNamelen(namelen);
		setMode(mode);
		setPathlen(pathlen);
		setPathspec(pathspec);
		setDf_conflicts(df_conflicts);
		setFn(fn);
		setData(data);
		setShow_all_errors(show_all_errors);
	}
	public traverse_info() {
	}
	
	public void restore_cache_bottom(int bottom) {
		Object generatedData = this.getData();
		unpack_trees_options o = generatedData;
		int generatedDiff_index_cached = o.getDiff_index_cached();
		if (generatedDiff_index_cached) {
			return ;
		} 
		o.setCache_bottom(bottom);
	}
	public int switch_cache_bottom() {
		Object generatedData = this.getData();
		unpack_trees_options o = generatedData;
		int ret;
		int pos;
		int generatedDiff_index_cached = o.getDiff_index_cached();
		if (generatedDiff_index_cached) {
			return 0;
		} 
		int generatedCache_bottom = o.getCache_bottom();
		ret = generatedCache_bottom;
		traverse_info generatedPrev = this.getPrev();
		Object generatedName = this.getName();
		Object generatedNamelen = this.getNamelen();
		pos = generatedPrev.find_cache_pos(generatedName, generatedNamelen);
		index_state generatedSrc_index = o.getSrc_index();
		int generatedCache_nr = generatedSrc_index.getCache_nr();
		if (pos < -1) {
			o.setCache_bottom(-2 - pos);
		}  else if (pos < 0) {
			o.setCache_bottom(generatedCache_nr);
		} 
		return ret;
	}
	public int traverse_by_cache_tree(int pos, int nr_entries, int nr_names) {
		cache_entry[] src = new cache_entry[]{((Object)0)};
		Object generatedData = this.getData();
		unpack_trees_options o = generatedData;
		cache_entry tree_ce = ((Object)0);
		int ce_len = 0;
		int i;
		int d;
		int generatedMerge = o.getMerge();
		if (!generatedMerge) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\unpack-trees.c", 719, "We need cache-tree to do this optimization"/*
				 * Do what unpack_callback() and unpack_nondirectories() normally
				 * do. But we walk all paths in an iterative loop instead.
				 *
				 * D/F conflicts and higher stage entries are not a concern
				 * because cache-tree would be invalidated and we would never
				 * get here in the first place.
				 */);
		} 
		index_state generatedSrc_index = o.getSrc_index();
		cache_entry generatedCache = generatedSrc_index.getCache();
		object_id generatedOid = tree_ce.getOid();
		Object generatedName = tree_ce.getName();
		for (i = 0; i < nr_entries; i++) {
			int new_ce_len;
			int len;
			int rc;
			src[0] = generatedCache[pos + i];
			ModernizedCProgram.len = ((src[0]).getCe_namelen());
			new_ce_len = (((size_t)((cache_entry)0).getName()) + (ModernizedCProgram.len) + 1);
			if (new_ce_len > ce_len) {
				new_ce_len <<=  1;
				tree_ce = ModernizedCProgram.xrealloc(tree_ce, new_ce_len);
				.memset(tree_ce, 0, new_ce_len);
				ce_len = new_ce_len;
				tree_ce.setCe_flags(ModernizedCProgram.create_ce_flags(0));
				for (d = 1; d <= nr_names; d++) {
					src[d] = tree_ce;
				}
			} 
			tree_ce.setCe_mode(src[0].getCe_mode());
			tree_ce.setCe_namelen(ModernizedCProgram.len);
			generatedOid.oidcpy(generatedOid);
			.memcpy(generatedName, generatedName, ModernizedCProgram.len + 1);
			ModernizedCProgram.rc = o.call_unpack_fn((cache_entry)src);
			if (ModernizedCProgram.rc < 0) {
				ModernizedCProgram.free(tree_ce);
				return ModernizedCProgram.rc;
			} 
			ModernizedCProgram.mark_ce_used(src[0], o);
		}
		ModernizedCProgram.free(tree_ce);
		int generatedDebug_unpack = o.getDebug_unpack();
		if (generatedDebug_unpack) {
			.printf("Unpacked %d entries from %s to %s using cache-tree\n", nr_entries, generatedName, generatedName);
		} 
		return 0;
	}
	public int find_cache_pos(Object p, Object p_len) {
		int pos;
		Object generatedData = this.getData();
		unpack_trees_options o = generatedData;
		index_state generatedSrc_index = o.getSrc_index();
		index_state index = generatedSrc_index;
		Object generatedPathlen = this.getPathlen();
		int pfxlen = generatedPathlen;
		int generatedCache_nr = index.getCache_nr();
		cache_entry generatedCache = index.getCache();
		int generatedCache_bottom = o.getCache_bottom();
		Object generatedTraverse_path = this.getTraverse_path();
		for (pos = generatedCache_bottom; pos < generatedCache_nr; pos++) {
			cache_entry ce = generatedCache[pos];
			byte ce_name;
			byte ce_slash;
			int cmp;
			int ce_len;
			if (ce.getCe_flags() & (1 << 24/*
						 * cache_bottom entry is already unpacked, so
						 * we can never match it; don't check it
						 * again.
						 */)) {
				if (pos == generatedCache_bottom) {
					++generatedCache_bottom;
				} 
				continue;
			} 
			if (!ModernizedCProgram.ce_in_traverse_path(ce, info/*
						 * Check if we can skip future cache checks
						 * (because we're already past all possible
						 * entries in the traverse path).
						 */)) {
				if (generatedTraverse_path) {
					if (.strncmp(ce.getName(), generatedTraverse_path, generatedPathlen) > 0) {
						break;
					} 
				} 
				continue;
			} 
			ce_name = ce.getName() + pfxlen;
			ce_slash = .strchr(ce_name, (byte)'/');
			if (ce_slash) {
				ce_len = ce_slash - ce_name;
			} else {
					ce_len = ((ce).getCe_namelen()) - pfxlen;
			} 
			cmp = ModernizedCProgram.name_compare(p, p_len, ce_name, ce_len/*
					 * Exact match; if we have a directory we need to
					 * delay returning it.
					 */);
			if (!cmp) {
				return ce_slash ? -2 - pos : pos;
			} 
			if (0 < cmp) {
				continue;
			} 
			if (p_len < ce_len && !.memcmp(ce_name, p, p_len) && ce_name[p_len] < (byte)'/') {
				continue;
			} 
			break;
		}
		return -1;
	}
	public void debug_path() {
		traverse_info generatedPrev = this.getPrev();
		Object generatedName = generatedPrev.getName();
		if (generatedPrev) {
			generatedPrev.debug_path();
			if (generatedName) {
				.putchar((byte)'/');
			} 
		} 
		.printf("%s", generatedName);
	}
	public void setup_traverse_info(Object base) {
		size_t pathlen = .strlen(base);
		traverse_info dummy = new traverse_info();
		.memset(info, 0, );
		if (pathlen && base[pathlen - 1] == (byte)'/') {
			pathlen--;
		} 
		this.setPathlen(pathlen ? pathlen + 1 : 0);
		this.setName(base);
		this.setNamelen(pathlen);
		if (pathlen) {
			this.setPrev(dummy);
		} 
	}
	public Object getTraverse_path() {
		return traverse_path;
	}
	public void setTraverse_path(Object newTraverse_path) {
		traverse_path = newTraverse_path;
	}
	public traverse_info getPrev() {
		return prev;
	}
	public void setPrev(traverse_info newPrev) {
		prev = newPrev;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getNamelen() {
		return namelen;
	}
	public void setNamelen(Object newNamelen) {
		namelen = newNamelen;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public Object getPathlen() {
		return pathlen;
	}
	public void setPathlen(Object newPathlen) {
		pathlen = newPathlen;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public long getDf_conflicts() {
		return df_conflicts;
	}
	public void setDf_conflicts(long newDf_conflicts) {
		df_conflicts = newDf_conflicts;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getShow_all_errors() {
		return show_all_errors;
	}
	public void setShow_all_errors(int newShow_all_errors) {
		show_all_errors = newShow_all_errors;
	}
}
