package application;

public class cache_tree {
	private int entry_count;
	private object_id oid;
	private int subtree_nr;
	private int subtree_alloc;
	private cache_tree_sub down;
	
	public cache_tree(int entry_count, object_id oid, int subtree_nr, int subtree_alloc, cache_tree_sub down) {
		setEntry_count(entry_count);
		setOid(oid);
		setSubtree_nr(subtree_nr);
		setSubtree_alloc(subtree_alloc);
		setDown(down);
	}
	public cache_tree() {
	}
	
	public cache_tree cache_tree() {
		cache_tree it = ModernizedCProgram.xcalloc(1, );
		it.setEntry_count(-1);
		return it;
	}
	public void cache_tree_free() {
		int i;
		cache_tree it = it_p;
		if (!it) {
			return ;
		} 
		int generatedSubtree_nr = it.getSubtree_nr();
		cache_tree_sub generatedDown = it.getDown();
		for (i = 0; i < generatedSubtree_nr; i++) {
			if (generatedDown[i]) {
				generatedDown[i].getCache_tree().cache_tree_free();
				ModernizedCProgram.free(generatedDown[i]);
			} 
		}
		ModernizedCProgram.free(generatedDown);
		ModernizedCProgram.free(it);
		it_p = ((Object)0);
	}
	public int subtree_pos(Object path, int pathlen) {
		cache_tree_sub generatedDown = this.getDown();
		cache_tree_sub down = generatedDown;
		int lo;
		int hi;
		lo = 0;
		int generatedSubtree_nr = this.getSubtree_nr();
		hi = generatedSubtree_nr;
		Object generatedName = mdl.getName();
		int generatedNamelen = mdl.getNamelen();
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			cache_tree_sub mdl = down[mi];
			int cmp = ModernizedCProgram.subtree_name_cmp(path, pathlen, generatedName, generatedNamelen);
			if (!cmp) {
				return mi;
			} 
			if (cmp < 0) {
				hi = mi;
			} else {
					lo = mi + 1;
			} 
		}
		return -lo - 1;
	}
	public int do_invalidate_path(Object path) {
		byte slash;
		int namelen;
		cache_tree_sub down = new cache_tree_sub();
		if (!it) {
			return 0;
		} 
		slash = ModernizedCProgram.gitstrchrnul(path, (byte)'/');
		namelen = slash - path;
		this.setEntry_count(-1);
		cache_tree_sub generatedDown = this.getDown();
		int generatedSubtree_nr = this.getSubtree_nr();
		if (!slash) {
			int pos;
			pos = it.subtree_pos(path, namelen);
			if (0 <= pos) {
				generatedDown[pos].getCache_tree().cache_tree_free();
				ModernizedCProgram.free(generatedDown[pos/* 0 1 2 3 4 5
							 *       ^     ^subtree_nr = 6
							 *       pos
							 * move 4 and 5 up one place (2 entries)
							 * 2 = 6 - 3 - 1 = subtree_nr - pos - 1
							 */]);
				ModernizedCProgram.move_array((generatedDown + pos), (generatedDown + pos + 1), (generatedSubtree_nr - pos - 1),  + ( - 1));
				generatedSubtree_nr--;
			} 
			return 1;
		} 
		cache_tree_sub cache_tree_sub = new cache_tree_sub();
		down = cache_tree_sub.find_subtree(it, path, namelen, 0);
		cache_tree generatedCache_tree = down.getCache_tree();
		if (down) {
			generatedCache_tree.do_invalidate_path(slash + 1);
		} 
		return 1;
	}
	/* a/b/c
		 * ==> invalidate self
		 * ==> find "a", have it invalidate "b/c"
		 * a
		 * ==> invalidate self
		 * ==> if "a" exists as a subtree, remove it.
		 */
	public void discard_unused_subtrees() {
		cache_tree_sub generatedDown = this.getDown();
		cache_tree_sub down = generatedDown;
		int generatedSubtree_nr = this.getSubtree_nr();
		int nr = generatedSubtree_nr;
		int dst;
		int src;
		int generatedUsed = s.getUsed();
		cache_tree generatedCache_tree = s.getCache_tree();
		for (dst = src = 0; src < nr; src++) {
			cache_tree_sub s = down[src];
			if (generatedUsed) {
				down[dst++] = s;
			} else {
					generatedCache_tree.cache_tree_free();
					ModernizedCProgram.free(s);
					generatedSubtree_nr--;
			} 
		}
	}
	public int cache_tree_fully_valid() {
		int i;
		if (!it) {
			return 0;
		} 
		int generatedEntry_count = this.getEntry_count();
		object_id generatedOid = this.getOid();
		if (generatedEntry_count < 0 || !ModernizedCProgram.the_repository.repo_has_object_file(generatedOid)) {
			return 0;
		} 
		int generatedSubtree_nr = this.getSubtree_nr();
		cache_tree_sub generatedDown = this.getDown();
		for (i = 0; i < generatedSubtree_nr; i++) {
			if (!generatedDown[i].getCache_tree().cache_tree_fully_valid()) {
				return 0;
			} 
		}
		return 1;
	}
	public cache_tree cache_tree_read(Object buffer, long size) {
		if (buffer[0]) {
			return ((Object)/* not the whole tree */0);
		} 
		return size.read_one(buffer);
	}
	public cache_tree cache_tree_find(Object path) {
		if (!it) {
			return ((Object)0);
		} 
		cache_tree_sub cache_tree_sub = new cache_tree_sub();
		cache_tree generatedCache_tree = sub.getCache_tree();
		while (path) {
			byte slash;
			cache_tree_sub sub = new cache_tree_sub();
			slash = ModernizedCProgram.gitstrchrnul(path, (byte)'/'/*
					 * Between path and slash is the name of the subtree
					 * to look for.
					 */);
			sub = cache_tree_sub.find_subtree(it, path, slash - path, 0);
			if (!sub) {
				return ((Object)0);
			} 
			it = generatedCache_tree;
			path = slash;
			while (path == (byte)'/') {
				path++;
			}
		}
		return it;
	}
	public cache_tree find_cache_tree_from_traversal(traverse_info info) {
		cache_tree our_parent = new cache_tree();
		traverse_info generatedPrev = info.getPrev();
		if (!generatedPrev) {
			return root;
		} 
		our_parent = root.find_cache_tree_from_traversal(generatedPrev);
		Object generatedName = info.getName();
		return our_parent.cache_tree_find(generatedName);
	}
	public void dump_one(Object pfx, Object x) {
		int generatedEntry_count = this.getEntry_count();
		int generatedSubtree_nr = this.getSubtree_nr();
		object_id generatedOid = this.getOid();
		if (generatedEntry_count < 0) {
			.printf("%-40s %s%s (%d subtrees)\n", "invalid", x, pfx, generatedSubtree_nr);
		} else {
				.printf("%s %s%s (%d entries, %d subtrees)\n", ModernizedCProgram.oid_to_hex(generatedOid), x, pfx, generatedEntry_count, generatedSubtree_nr);
		} 
	}
	public int dump_cache_tree(cache_tree ref, Object pfx) {
		int i;
		int errs = 0;
		if (!it || !ref) {
			return /* missing in either */0;
		} 
		int generatedEntry_count = this.getEntry_count();
		object_id generatedOid = this.getOid();
		int generatedSubtree_nr = ref.getSubtree_nr();
		if (generatedEntry_count < 0) {
			it.dump_one(pfx, /* invalid */"");
			ref.dump_one(pfx, "#(ref) ");
		} else {
				it.dump_one(pfx, "");
				if (!ModernizedCProgram.oideq(generatedOid, generatedOid) || generatedEntry_count != generatedEntry_count || generatedSubtree_nr != generatedSubtree_nr) {
					ref.dump_one(pfx, /* claims to be valid but is lying */"#(ref) ");
					errs = 1;
				} 
		} 
		cache_tree_sub generatedDown = this.getDown();
		Object generatedName = down.getName();
		cache_tree_sub cache_tree_sub = new cache_tree_sub();
		int generatedNamelen = down.getNamelen();
		cache_tree generatedCache_tree = down.getCache_tree();
		for (i = 0; i < generatedSubtree_nr; i++) {
			byte[] path = new byte[260];
			cache_tree_sub down = generatedDown[i];
			cache_tree_sub rdwn = new cache_tree_sub();
			rdwn = cache_tree_sub.cache_tree_sub(ref, generatedName);
			ModernizedCProgram.xsnprintf(ModernizedCProgram.path, , "%s%.*s/", pfx, generatedNamelen, generatedName);
			if (generatedCache_tree.dump_cache_tree(generatedCache_tree, ModernizedCProgram.path)) {
				errs = 1;
			} 
		}
		return errs;
	}
	public int fsck_cache_tree() {
		int i;
		int err = 0;
		if (ModernizedCProgram.verbose) {
			(_iob[2]).fprintf_ln(ModernizedCProgram._("Checking cache tree"));
		} 
		int generatedEntry_count = this.getEntry_count();
		object_id generatedOid = this.getOid();
		object object = new object();
		int generatedFlags = obj.getFlags();
		int generatedType = obj.getType();
		if (0 <= generatedEntry_count) {
			object obj = object.parse_object(ModernizedCProgram.the_repository, generatedOid);
			if (!obj) {
				();
				ModernizedCProgram.errors_found |=  10;
				return 1;
			} 
			generatedFlags |=  -1024;
			if (ModernizedCProgram.name_objects) {
				ModernizedCProgram.fsck_walk_options.getObject_names().add_decoration(obj, ModernizedCProgram.xstrdup(":"));
			} 
			obj.mark_object_reachable();
			if (generatedType != object_type.OBJ_TREE) {
				err |=  obj.objerror(ModernizedCProgram._("non-tree in cache-tree"));
			} 
		} 
		int generatedSubtree_nr = this.getSubtree_nr();
		cache_tree_sub generatedDown = this.getDown();
		for (i = 0; i < generatedSubtree_nr; i++) {
			err |=  generatedDown[i].getCache_tree().fsck_cache_tree();
		}
		return err;
	}
	public int getEntry_count() {
		return entry_count;
	}
	public void setEntry_count(int newEntry_count) {
		entry_count = newEntry_count;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getSubtree_nr() {
		return subtree_nr;
	}
	public void setSubtree_nr(int newSubtree_nr) {
		subtree_nr = newSubtree_nr;
	}
	public int getSubtree_alloc() {
		return subtree_alloc;
	}
	public void setSubtree_alloc(int newSubtree_alloc) {
		subtree_alloc = newSubtree_alloc;
	}
	public cache_tree_sub getDown() {
		return down;
	}
	public void setDown(cache_tree_sub newDown) {
		down = newDown;
	}
}
