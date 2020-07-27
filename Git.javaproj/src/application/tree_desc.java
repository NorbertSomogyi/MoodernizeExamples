package application;

public class tree_desc {
	private Object buffer;
	private name_entry entry;
	private int size;
	
	public tree_desc(Object buffer, name_entry entry, int size) {
		setBuffer(buffer);
		setEntry(entry);
		setSize(size);
	}
	public tree_desc() {
	}
	
	public void add_pbase_object(Object[] name, int cmplen, Object fullname) {
		name_entry entry = new name_entry();
		int cmp;
		int generatedMode = entry.getMode();
		Object generatedPath = entry.getPath();
		object_id generatedOid = entry.getOid();
		pbase_tree_cache pbase_tree_cache = new pbase_tree_cache();
		Object generatedTree_data = this.getTree_data();
		long generatedTree_size = this.getTree_size();
		while (ModernizedCProgram.tree_entry(tree, entry)) {
			if ((((generatedMode) & -1024) == 160000)) {
				continue;
			} 
			cmp = ModernizedCProgram.tree_entry_len(entry) != cmplen ? 1 : /*Error: Function owner not recognized*/memcmp(name, generatedPath, cmplen);
			if (cmp > 0) {
				continue;
			} 
			if (cmp < 0) {
				return /*Error: Unsupported expression*/;
			} 
			if (name[cmplen] != (byte)'/') {
				ModernizedCProgram.add_object_entry(generatedOid, ModernizedCProgram.object_type(generatedMode), fullname, 1);
				return /*Error: Unsupported expression*/;
			} 
			if ((((generatedMode) & -1024) == -1024)) {
				tree_desc sub = new tree_desc();
				pbase_tree_cache tree = new pbase_tree_cache();
				byte down = name + cmplen + 1;
				int downlen = ModernizedCProgram.name_cmp_len(down);
				tree = pbase_tree_cache.pbase_tree_get(generatedOid);
				if (!tree) {
					return /*Error: Unsupported expression*/;
				} 
				sub.init_tree_desc(generatedTree_data, generatedTree_size);
				sub.add_pbase_object(down, downlen, fullname);
				tree.pbase_tree_put();
			} 
		}
	}
	public Object tree_entry_extract(Object pathp, Integer modep) {
		name_entry generatedEntry = this.getEntry();
		Object generatedPath = generatedEntry.getPath();
		pathp = generatedPath;
		int generatedMode = generatedEntry.getMode();
		modep = generatedMode;
		object_id generatedOid = generatedEntry.getOid();
		return generatedOid;
	}
	public void merge_trees(Object base) {
		traverse_info info = new traverse_info();
		info.setup_traverse_info(base);
		info.setFn(threeway_callback);
		ModernizedCProgram.traverse_trees(ModernizedCProgram.the_index, 3, t, info);
	}
	public int tree_entry_pathcmp(tree_desc t2) {
		name_entry e1 = new name_entry();
		name_entry e2 = new name_entry();
		int cmp;
		int generatedSize = this.getSize();
		if (!generatedSize) {
			return generatedSize ? 1 : 0;
		}  else if (!generatedSize) {
			return -1;
		} 
		name_entry generatedEntry = this.getEntry();
		e1 = generatedEntry;
		e2 = generatedEntry;
		Object generatedPath = e1.getPath();
		int generatedMode = e1.getMode();
		cmp = ModernizedCProgram.base_name_compare(generatedPath, ModernizedCProgram.tree_entry_len(e1), generatedMode, generatedPath, ModernizedCProgram.tree_entry_len(e2), generatedMode);
		return cmp/*
		 * convert path -> opt->diff_*() callbacks
		 *
		 * emits diff to first parent only, and tells diff tree-walker that we are done
		 * with p and it can be freed.
		 */;
	}
	/* ∀ pi=p[imin]  pi↓ */
	public void update_tp_entries(int nparent) {
		int i;
		for (i = 0; i < nparent; ++i) {
			if (!(tp[i].getEntry().getMode() & -1024)) {
				tp[i].update_tree_entry();
			} 
		}
	}
	public void init_tree_desc(Object buffer, long size) {
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte[] generatedBuf = err.getBuf();
		if (ModernizedCProgram.init_tree_desc_internal(desc, buffer, size, err)) {
			ModernizedCProgram.die("%s", generatedBuf);
		} 
		err.strbuf_release();
	}
	public int init_tree_desc_gently(Object buffer, long size) {
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int result = ModernizedCProgram.init_tree_desc_internal(desc, buffer, size, err);
		if (result) {
			();
		} 
		err.strbuf_release();
		return result;
	}
	public void update_tree_entry() {
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte[] generatedBuf = err.getBuf();
		if (ModernizedCProgram.update_tree_entry_internal(desc, err)) {
			ModernizedCProgram.die("%s", generatedBuf);
		} 
		err.strbuf_release();
	}
	public int update_tree_entry_gently() {
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (ModernizedCProgram.update_tree_entry_internal(desc, err)) {
			();
			err.strbuf_release();
			this.setSize(/* Stop processing this tree after error */0);
			return -1;
		} 
		err.strbuf_release();
		return 0;
	}
	public Object fill_tree_desc_strict(Object hash) {
		Object buffer;
		object_type type;
		long size;
		buffer = ModernizedCProgram.the_repository.repo_read_object_file(hash, object_type.type, size);
		if (!buffer) {
			ModernizedCProgram.die("unable to read tree (%s)", ModernizedCProgram.oid_to_hex(hash));
		} 
		if (object_type.type != object_type.OBJ_TREE) {
			ModernizedCProgram.die("%s is not a tree", ModernizedCProgram.oid_to_hex(hash));
		} 
		desc.init_tree_desc(buffer, size);
		return buffer;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public name_entry getEntry() {
		return entry;
	}
	public void setEntry(name_entry newEntry) {
		entry = newEntry;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
}
