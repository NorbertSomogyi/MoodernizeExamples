package application;

/* more */
public class tree_entry {
	private tree_content tree;
	private atom_str name;
	private Object versions;
	
	public tree_entry(tree_content tree, atom_str name, Object versions) {
		setTree(tree);
		setName(name);
		setVersions(versions);
	}
	public tree_entry() {
	}
	
	public tree_entry new_tree_entry() {
		tree_entry e = new tree_entry();
		if (!ModernizedCProgram.avail_tree_entry) {
			int n = ModernizedCProgram.tree_entry_alloc;
			ModernizedCProgram.tree_entry_allocd += n * /*Error: Unsupported expression*/;
			(e) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (n)));
			ModernizedCProgram.avail_tree_entry = e;
			while (n-- > 1) {
				((Object)e) = e + 1;
				e++;
			}
			((Object)e) = ((Object)0);
		} 
		e = ModernizedCProgram.avail_tree_entry;
		ModernizedCProgram.avail_tree_entry = ((Object)e);
		return e;
	}
	public void release_tree_entry() {
		tree_content generatedTree = this.getTree();
		if (generatedTree) {
			generatedTree.release_tree_content_recursive();
		} 
		((Object)e) = ModernizedCProgram.avail_tree_entry;
		ModernizedCProgram.avail_tree_entry = e;
	}
	public void load_tree() {
		Object generatedVersions = this.getVersions();
		object_id oid = generatedVersions[1].getOid();
		object_entry myoe = new object_entry();
		tree_content t = new tree_content();
		long size;
		byte buf;
		byte c;
		tree_content tree_content = new tree_content();
		this.setTree(t = tree_content.new_tree_content(8));
		if (ModernizedCProgram.is_null_oid(oid)) {
			return /*Error: Unsupported expression*/;
		} 
		object_entry object_entry = new object_entry();
		myoe = object_entry.find_object(oid);
		Object generatedPack_id = myoe.getPack_id();
		byte generatedType = myoe.getType();
		Object generatedDepth = myoe.getDepth();
		if (myoe && generatedPack_id != ((1 << 16) - 1)) {
			if (generatedType != object_type.OBJ_TREE) {
				ModernizedCProgram.die("Not a tree: %s", ModernizedCProgram.oid_to_hex(oid));
			} 
			t.setDelta_depth(generatedDepth);
			buf = myoe.gfi_unpack_entry(size);
			if (!buf) {
				ModernizedCProgram.die("Can't load tree %s", ModernizedCProgram.oid_to_hex(oid));
			} 
		} else {
				object_type type;
				buf = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, size);
				if (!buf || object_type.type != object_type.OBJ_TREE) {
					ModernizedCProgram.die("Can't load tree %s", ModernizedCProgram.oid_to_hex(oid));
				} 
		} 
		c = buf;
		tree_entry tree_entry = new tree_entry();
		int generatedEntry_count = t.getEntry_count();
		int generatedEntry_capacity = t.getEntry_capacity();
		Object generatedEntries = t.getEntries();
		atom_str atom_str = new atom_str();
		atom_str generatedName = e.getName();
		int generatedStr_len = generatedName.getStr_len();
		while (c != (buf + size)) {
			tree_entry e = tree_entry.new_tree_entry();
			if (generatedEntry_count == generatedEntry_capacity) {
				this.setTree(t = t.grow_tree_content(generatedEntry_count));
			} 
			generatedEntries[generatedEntry_count++] = e;
			e.setTree(((Object)0));
			c = ModernizedCProgram.get_mode(c, generatedVersions[1].getMode());
			if (!c) {
				ModernizedCProgram.die("Corrupt mode in %s", ModernizedCProgram.oid_to_hex(oid));
			} 
			generatedVersions[0].setMode(generatedVersions[1].getMode());
			e.setName(atom_str.to_atom(c, /*Error: Function owner not recognized*/strlen(c)));
			c += generatedStr_len + 1;
			ModernizedCProgram.hashcpy(generatedVersions[0].getOid().getHash(), (byte)c);
			ModernizedCProgram.hashcpy(generatedVersions[1].getOid().getHash(), (byte)c);
			c += ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		}
		ModernizedCProgram.free(buf);
	}
	public void store_tree() {
		tree_content t = new tree_content();
		int i;
		int j;
		int del;
		last_object lo = new last_object(new last_object(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/), 0, 0, /* no_swap */1);
		object_entry le = ((Object)0);
		Object generatedVersions = this.getVersions();
		if (!ModernizedCProgram.is_null_oid(generatedVersions[1].getOid())) {
			return /*Error: Unsupported expression*/;
		} 
		tree_content generatedTree = this.getTree();
		if (!generatedTree) {
			root.load_tree();
		} 
		t = generatedTree;
		int generatedEntry_count = t.getEntry_count();
		Object generatedEntries = t.getEntries();
		for (i = 0; i < generatedEntry_count; i++) {
			if (generatedTree) {
				generatedEntries[i].store_tree();
			} 
		}
		object_entry object_entry = new object_entry();
		if (!(generatedVersions[0].getMode() & S_ISUID)) {
			le = object_entry.find_object(generatedVersions[0].getOid());
		} 
		Object generatedPack_id = le.getPack_id();
		pack_idx_entry generatedIdx = le.getIdx();
		Object generatedOffset = generatedIdx.getOffset();
		int generatedDelta_depth = t.getDelta_depth();
		if ((((generatedVersions[0].getMode()) & -1024) == -1024) && le && generatedPack_id == ModernizedCProgram.pack_id) {
			ModernizedCProgram.mktree(t, 0, ModernizedCProgram.old_tree);
			lo.setData(ModernizedCProgram.old_tree);
			lo.setOffset(generatedOffset);
			lo.setDepth(generatedDelta_depth);
		} 
		ModernizedCProgram.mktree(t, 1, ModernizedCProgram.new_tree);
		ModernizedCProgram.store_object(object_type.OBJ_TREE, ModernizedCProgram.new_tree, lo, generatedVersions[1].getOid(), 0);
		int generatedDepth = lo.getDepth();
		t.setDelta_depth(generatedDepth);
		for (; i < generatedEntry_count; i++) {
			tree_entry e = generatedEntries[i];
			if (generatedVersions[1].getMode()) {
				generatedVersions[0].setMode(generatedVersions[1].getMode());
				generatedVersions[0].getOid().oidcpy(generatedVersions[1].getOid());
				generatedEntries[j++] = e;
			} else {
					e.release_tree_entry();
					del++;
			} 
		}
		generatedEntry_count -= del;
	}
	public int tree_content_remove(Object p, tree_entry backup_leaf, int allow_root) {
		tree_content t = new tree_content();
		byte slash1;
		int i;
		int n;
		tree_entry e = new tree_entry();
		slash1 = ModernizedCProgram.gitstrchrnul(p, (byte)'/');
		n = slash1 - p;
		tree_content generatedTree = this.getTree();
		if (!generatedTree) {
			root.load_tree();
		} 
		if (!p && allow_root) {
			e = root;
			;
		} 
		t = generatedTree;
		int generatedEntry_count = t.getEntry_count();
		Object generatedEntries = t.getEntries();
		atom_str generatedName = e.getName();
		int generatedStr_len = generatedName.getStr_len();
		Object generatedStr_dat = generatedName.getStr_dat();
		Object generatedVersions = e.getVersions();
		for (i = 0; i < generatedEntry_count; i++) {
			e = generatedEntries[i];
			if (generatedStr_len == n && !ModernizedCProgram.fspathncmp(p, generatedStr_dat, n)) {
				if (slash1 && !(((generatedVersions[1].getMode()) & -1024) == -1024/*
								 * If p names a file in some subdirectory, and a
								 * file or symlink matching the name of the
								 * parent directory of p exists, then p cannot
								 * exist and need not be deleted.
								 */)) {
					return 1;
				} 
				if (!slash1 || !(((generatedVersions[1].getMode()) & -1024) == -1024)) {
					;
				} 
				if (!generatedTree) {
					e.load_tree();
				} 
				if (e.tree_content_remove(slash1 + 1, backup_leaf, 0)) {
					for (n = 0; n < generatedEntry_count; n++) {
						if (generatedVersions[1].getMode()) {
							generatedVersions[1].getOid().oidclr();
							return 1;
						} 
					}
					backup_leaf = ((Object)0);
					;
				} 
				return 0;
			} 
		}
		return 0;
		e.setTree(((Object)0));
		generatedVersions[1].setMode(0);
		generatedVersions[1].getOid().oidclr();
		generatedVersions[1].getOid().oidclr();
		return 1;
	}
	public int tree_content_get(Object p, tree_entry leaf, int allow_root) {
		tree_content t = new tree_content();
		byte slash1;
		int i;
		int n;
		tree_entry e = new tree_entry();
		slash1 = ModernizedCProgram.gitstrchrnul(p, (byte)'/');
		n = slash1 - p;
		if (!n && !allow_root) {
			ModernizedCProgram.die("Empty path component found in input");
		} 
		tree_content generatedTree = this.getTree();
		if (!generatedTree) {
			root.load_tree();
		} 
		if (!n) {
			e = root;
			;
		} 
		t = generatedTree;
		int generatedEntry_count = t.getEntry_count();
		Object generatedEntries = t.getEntries();
		atom_str generatedName = e.getName();
		int generatedStr_len = generatedName.getStr_len();
		Object generatedStr_dat = generatedName.getStr_dat();
		Object generatedVersions = e.getVersions();
		for (i = 0; i < generatedEntry_count; i++) {
			e = generatedEntries[i];
			if (generatedStr_len == n && !ModernizedCProgram.fspathncmp(p, generatedStr_dat, n)) {
				if (!slash1) {
					;
				} 
				if (!(((generatedVersions[1].getMode()) & -1024) == -1024)) {
					return 0;
				} 
				if (!generatedTree) {
					e.load_tree();
				} 
				return e.tree_content_get(slash1 + 1, leaf, 0);
			} 
		}
		return 0;
		if (generatedTree && ModernizedCProgram.is_null_oid(generatedVersions[1].getOid())) {
			leaf.setTree(generatedTree.dup_tree_content());
		} else {
				leaf.setTree(((Object)0));
		} 
		return 1;
	}
	public Object do_change_note_fanout(tree_entry root, Byte hex_oid, int hex_oid_len, byte[] fullpath, int fullpath_len, byte fanout) {
		tree_content t = new tree_content();
		tree_entry e = new tree_entry();
		tree_entry leaf = new tree_entry();
		int i;
		int tmp_hex_oid_len;
		int tmp_fullpath_len;
		uintmax_t num_notes = 0;
		object_id oid = new object_id();
		byte[] realpath = new byte[(2 * 32) + (((2 * 32) / 2) - 1) + /* hex oid + '/' between each pair of hex digits + NUL */1];
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		tree_content generatedTree = root.getTree();
		if (!generatedTree) {
			root.load_tree();
		} 
		t = generatedTree;
		int generatedEntry_count = t.getEntry_count();
		Object generatedEntries = t.getEntries();
		atom_str generatedName = e.getName();
		int generatedStr_len = generatedName.getStr_len();
		Object generatedVersions = e.getVersions();
		Object generatedStr_dat = generatedName.getStr_dat();
		for (i = 0; t && i < generatedEntry_count; i++) {
			e = generatedEntries[i];
			tmp_hex_oid_len = hex_oid_len + generatedStr_len;
			tmp_fullpath_len = fullpath_len/*
					 * We're interested in EITHER existing note entries (entries
					 * with exactly 40 hex chars in path, not including directory
					 * separators), OR directory entries that may contain note
					 * entries (with < 40 hex chars in path).
					 * Also, each path component in a note entry must be a multiple
					 * of 2 chars.
					 */;
			if (!generatedVersions[1].getMode() || tmp_hex_oid_len > hexsz || generatedStr_len % 2) {
				continue;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(hex_oid + hex_oid_len, generatedStr_dat, generatedStr_len);
			if (tmp_fullpath_len) {
				fullpath[tmp_fullpath_len++] = (byte)'/';
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(fullpath + tmp_fullpath_len, generatedStr_dat, generatedStr_len);
			tmp_fullpath_len += generatedStr_len;
			fullpath[tmp_fullpath_len] = (byte)'\0';
			if (tmp_hex_oid_len == hexsz && !oid.get_oid_hex(hex_oid)) {
				if (fanout == /* This is a note entry */-1024) {
					/* Counting mode, no rename */num_notes++;
					continue;
				} 
				ModernizedCProgram.construct_path_with_fanout(hex_oid, fanout, realpath);
				if (!/*Error: Function owner not recognized*/strcmp(fullpath, realpath)) {
					/* Note entry is in correct location */num_notes++;
					continue;
				} 
				if (!orig_root.tree_content_remove(fullpath, leaf, /* Rename fullpath to realpath */0)) {
					ModernizedCProgram.die("Failed to remove path %s", fullpath);
				} 
				ModernizedCProgram.tree_content_set(orig_root, realpath, generatedVersions[1].getOid(), generatedVersions[1].getMode(), generatedTree);
			}  else if ((((generatedVersions[1].getMode()) & -1024) == -1024)) {
				num_notes += orig_root.do_change_note_fanout(/* This is a subdir that may contain note entries */e, hex_oid, tmp_hex_oid_len, fullpath, tmp_fullpath_len, fanout);
			} 
			t = generatedTree;
		}
		return num_notes;
	}
	public Object change_note_fanout(byte fanout) {
		byte[] hex_oid = new byte[(2 * 32)];
		byte[] path = new byte[(2 * 32) + ((2 * 32) / 2) - 1 + 1];
		return root.do_change_note_fanout(root, hex_oid, 0, path, 0, fanout/*
		 * Given a pointer into a string, parse a mark reference:
		 *
		 *   idnum ::= ':' bigint;
		 *
		 * Return the first character after the value in *endptr.
		 *
		 * Complain if the following character is not what is expected,
		 * either a space or end of the string.
		 */);
	}
	/*
		 * The size of path is due to one slash between every two hex digits,
		 * plus the terminating NUL.  Note that there is no slash at the end, so
		 * the number of slashes is one less than half the number of hex
		 * characters.
		 */
	public tree_content getTree() {
		return tree;
	}
	public void setTree(tree_content newTree) {
		tree = newTree;
	}
	public atom_str getName() {
		return name;
	}
	public void setName(atom_str newName) {
		name = newName;
	}
	public Object getVersions() {
		return versions;
	}
	public void setVersions(Object newVersions) {
		versions = newVersions;
	}
}
