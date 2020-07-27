package application;

/* Parses and returns the tree in the given ent, chasing tags and commits. */
public class tree {
	private object object;
	private Object buffer;
	private long size;
	
	public tree(object object, Object buffer, long size) {
		setObject(object);
		setBuffer(buffer);
		setSize(size);
	}
	public tree() {
	}
	
	public int parse_tree() {
		return tree.parse_tree_gently(0);
	}
	public tree lookup_tree(repository r, Object oid) {
		object object = new object();
		object obj = object.lookup_object(r, oid);
		if (!obj) {
			return r.create_object(oid, r.alloc_tree_node());
		} 
		return ModernizedCProgram.object_as_type(r, obj, object_type.OBJ_TREE, 0);
	}
	public int parse_tree_buffer(Object buffer, long size) {
		object generatedObject = this.getObject();
		int generatedParsed = generatedObject.getParsed();
		if (generatedParsed) {
			return 0;
		} 
		generatedObject.setParsed(1);
		this.setBuffer(buffer);
		this.setSize(size);
		return 0;
	}
	public int parse_tree_gently(int quiet_on_missing) {
		object_type type;
		Object buffer;
		long size;
		object generatedObject = this.getObject();
		int generatedParsed = generatedObject.getParsed();
		if (generatedParsed) {
			return 0;
		} 
		object_id generatedOid = generatedObject.getOid();
		buffer = ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, size);
		if (!buffer) {
			return quiet_on_missing ? -1 : ();
		} 
		if (object_type.type != object_type.OBJ_TREE) {
			ModernizedCProgram.free(buffer);
			return ();
		} 
		return item.parse_tree_buffer(buffer, size);
	}
	public void free_tree_buffer() {
		Object generatedBuffer = this.getBuffer();
		do {
			ModernizedCProgram.free(generatedBuffer);
			(generatedBuffer) = ((Object)0);
		} while (0);
		this.setSize(0);
		object generatedObject = this.getObject();
		generatedObject.setParsed(0);
	}
	public tree parse_tree_indirect(Object oid) {
		repository r = ModernizedCProgram.the_repository;
		object object = new object();
		object obj = object.parse_object(r, oid);
		return (tree)obj.repo_peel_to_type(r, ((Object)0), 0, object_type.OBJ_TREE);
	}
	public int fast_forward_to(tree remote, int reset) {
		lock_file lock_file = new lock_file(((Object)0));
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc[] t = new tree_desc();
		if (head.parse_tree() || remote.parse_tree()) {
			return -1;
		} 
		ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock_file), (true));
		ModernizedCProgram.the_index.refresh_index((true), ((Object)0), ((Object)0), ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
		opts.setHead_idx(1);
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		opts.setUpdate(1);
		opts.setMerge(1);
		opts.setReset(reset);
		opts.setFn(ModernizedCProgram.twoway_merge);
		Object generatedBuffer = this.getBuffer();
		long generatedSize = this.getSize();
		t[0].init_tree_desc(generatedBuffer, generatedSize);
		t[1].init_tree_desc(generatedBuffer, generatedSize);
		if (ModernizedCProgram.unpack_trees(2, t, opts)) {
			lock_file.rollback_lock_file();
			return -1;
		} 
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_index, lock_file, (1 << 0))) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to write new index file"));
		} 
		return 0/**
		 * Merges a tree into the index. The index's stat info will take precedence
		 * over the merged tree's. Returns 0 on success, -1 on failure.
		 */;
		ref_transaction transaction = new ref_transaction();
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf err = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		r.repo_read_index();
		if (/*Error: Function owner not recognized*/checkout_fast_forward(r, ModernizedCProgram.from, to, 1)) {
			return -/* the callee should have complained already */1;
		} 
		sb.strbuf_addf(ModernizedCProgram._("%s: fast-forward"), ModernizedCProgram._(ModernizedCProgram.action_name(opts)));
		ref_transaction ref_transaction = new ref_transaction();
		transaction = ref_transaction.ref_transaction_begin(err);
		byte[] generatedBuf = sb.getBuf();
		if (!transaction || ModernizedCProgram.ref_transaction_update(transaction, "HEAD", to, unborn && !ModernizedCProgram.is_rebase_i(opts) ? ModernizedCProgram.null_oid : ModernizedCProgram.from, 0, generatedBuf, err) || ModernizedCProgram.ref_transaction_commit(transaction, err)) {
			transaction.ref_transaction_free();
			();
			sb.strbuf_release();
			err.strbuf_release();
			return -1;
		} 
		sb.strbuf_release();
		err.strbuf_release();
		transaction.ref_transaction_free();
		ModernizedCProgram.update_abort_safety_file();
		return 0;
	}
	public int merge_tree() {
		lock_file lock_file = new lock_file(((Object)0));
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc[] t = new tree_desc();
		if (tree.parse_tree()) {
			return -1;
		} 
		ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock_file), (true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
		opts.setHead_idx(1);
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		opts.setMerge(1);
		opts.setFn(ModernizedCProgram.oneway_merge);
		Object generatedBuffer = this.getBuffer();
		long generatedSize = this.getSize();
		t[0].init_tree_desc(generatedBuffer, generatedSize);
		if (ModernizedCProgram.unpack_trees(1, t, opts)) {
			lock_file.rollback_lock_file();
			return -1;
		} 
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_index, lock_file, (1 << 0))) {
			ModernizedCProgram.die(ModernizedCProgram._("unable to write new index file"));
		} 
		return 0/**
		 * Clean the index without touching entries that are not modified between
		 * `head` and `remote`.
		 */;
	}
	public int read_tree_some(Object pathspec) {
		ModernizedCProgram.read_tree_recursive(ModernizedCProgram.the_repository, tree, "", 0, 0, pathspec, update_some, ((Object)0/* update the index with the given tree's info
			 * for all args, expanding wildcards, and exit
			 * with any non-zero return code.
			 */));
		return 0;
	}
	public int reset_tree(Object o, int worktree, Integer writeout_error) {
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc tree_desc = new tree_desc();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
		opts.setHead_idx(-1);
		opts.setUpdate(worktree);
		opts.setSkip_unmerged(!worktree);
		opts.setReset(1);
		opts.setMerge(1);
		opts.setFn(ModernizedCProgram.oneway_merge);
		opts.setVerbose_update(o.getShow_progress());
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		tree.parse_tree();
		Object generatedBuffer = this.getBuffer();
		long generatedSize = this.getSize();
		tree_desc.init_tree_desc(generatedBuffer, generatedSize);
		switch (ModernizedCProgram.unpack_trees(1, tree_desc, opts)) {
		case -2:
				writeout_error = 1/*
						 * We return 0 nevertheless, as the index is all right
						 * and more importantly we have made best efforts to
						 * update paths in the work tree, and we cannot revert
						 * them.
						 */;
		case /* fallthrough */0:
				return 0;
		default:
				return 128;
		}
		int nr_trees = 1;
		unpack_trees_options opts = new unpack_trees_options();
		tree_desc[] t = new tree_desc();
		tree tree = new tree();
		lock_file lock_file = new lock_file(((Object)0));
		ModernizedCProgram.the_repository.repo_read_index_preload((((Object)0)), 0);
		if (ModernizedCProgram.the_index.refresh_index((true), ((Object)0), ((Object)0), ((Object)0))) {
			return -1;
		} 
		ModernizedCProgram.repo_hold_locked_index(ModernizedCProgram.the_repository, (lock_file), (true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
		tree tree = new tree();
		tree = tree.parse_tree_indirect(i_tree);
		if (tree.parse_tree()) {
			return -1;
		} 
		Object generatedBuffer = this.getBuffer();
		long generatedSize = this.getSize();
		t.init_tree_desc(generatedBuffer, generatedSize);
		opts.setHead_idx(1);
		opts.setSrc_index(ModernizedCProgram.the_index);
		opts.setDst_index(ModernizedCProgram.the_index);
		opts.setMerge(1);
		opts.setReset(reset);
		opts.setUpdate(update);
		opts.setFn(ModernizedCProgram.oneway_merge);
		if (ModernizedCProgram.unpack_trees(nr_trees, t, opts)) {
			return -1;
		} 
		if (ModernizedCProgram.write_locked_index(ModernizedCProgram.the_index, lock_file, (1 << 0))) {
			return ();
		} 
		return 0;
	}
	public tree empty_tree(repository r) {
		tree tree = new tree();
		return tree.lookup_tree(r, ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree());
	}
	public tree write_in_core_index_as_tree(repository repo) {
		object_id o = new object_id();
		int was_valid;
		int ret;
		index_state generatedIndex = repo.getIndex();
		index_state index_state = generatedIndex;
		cache_tree generatedCache_tree = index_state.getCache_tree();
		was_valid = generatedCache_tree && generatedCache_tree.cache_tree_fully_valid();
		ret = ModernizedCProgram.write_index_as_tree_internal(o, index_state, was_valid, 0, ((Object)0));
		int generatedCache_nr = index_state.getCache_nr();
		cache_entry[][] generatedCache = index_state.getCache();
		if (ret == (true)) {
			int i;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "BUG: There are unmerged index entries:\n");
			for (i = 0; i < generatedCache_nr; i++) {
				cache_entry ce = generatedCache[i];
				if ((((true) & (ce).getCe_flags()) >> 12)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "BUG: %d %.*s\n", (((true) & (ce).getCe_flags()) >> 12), (int)((ce).getCe_namelen()), ce.getName());
				} 
			}
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\cache-tree.c", 660, "unmerged index entries when writing inmemory index");
		} 
		object_id generatedOid = generatedCache_tree.getOid();
		tree tree = new tree();
		return tree.lookup_tree(repo, generatedOid);
	}
	/* Diff two trees. */
	public int stdin_diff_trees(Object p) {
		object_id oid = new object_id();
		tree tree2 = new tree();
		if (!((ModernizedCProgram.sane_ctype[(byte)(p++)] & (true)) != 0) || oid.parse_oid_hex(p, p) || p) {
			return ();
		} 
		tree tree = new tree();
		tree2 = tree.lookup_tree(ModernizedCProgram.the_repository, oid);
		if (!tree2 || tree2.parse_tree()) {
			return -1;
		} 
		object generatedObject = this.getObject();
		object_id generatedOid = generatedObject.getOid();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s %s\n", ModernizedCProgram.oid_to_hex(generatedOid), ModernizedCProgram.oid_to_hex(generatedOid));
		ModernizedCProgram.log_tree_opt.getDiffopt().diff_tree_oid(generatedOid, generatedOid, "");
		ModernizedCProgram.log_tree_opt.log_tree_diff_flush();
		return 0;
	}
	public object getObject() {
		return object;
	}
	public void setObject(object newObject) {
		object = newObject;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}
