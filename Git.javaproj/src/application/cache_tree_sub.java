package application;

public class cache_tree_sub {
	private cache_tree cache_tree;
	private int count;
	private int namelen;
	private int used;
	private Object name;
	
	public cache_tree_sub(cache_tree cache_tree, int count, int namelen, int used, Object name) {
		setCache_tree(cache_tree);
		setCount(count);
		setNamelen(namelen);
		setUsed(used);
		setName(name);
	}
	public cache_tree_sub() {
	}
	
	public cache_tree_sub find_subtree(cache_tree it, Object path, int pathlen, int create) {
		cache_tree_sub down = new cache_tree_sub();
		int pos = it.subtree_pos(path, pathlen);
		cache_tree_sub generatedDown = it.getDown();
		if (0 <= pos) {
			return generatedDown[pos];
		} 
		if (!create) {
			return ((Object)0);
		} 
		pos = -pos - 1;
		int generatedSubtree_nr = it.getSubtree_nr();
		int generatedSubtree_alloc = it.getSubtree_alloc();
		do {
			if ((generatedSubtree_nr + 1) > generatedSubtree_alloc) {
				if ((((generatedSubtree_alloc) + 16) * 3 / 2) < (generatedSubtree_nr + 1)) {
					it.setSubtree_alloc((generatedSubtree_nr + 1));
				} else {
						it.setSubtree_alloc((((generatedSubtree_alloc) + 16) * 3 / 2));
				} 
				(generatedDown) = ModernizedCProgram.xrealloc((generatedDown), ModernizedCProgram.st_mult(, (generatedSubtree_alloc)));
			} 
		} while (0);
		generatedSubtree_nr++;
		Object generatedName = (down).getName();
		do {
			size_t flex_array_len_ = (pathlen);
			(down) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, (path), flex_array_len_);
		} while (0);
		down.setCache_tree(((Object)0));
		down.setNamelen(pathlen);
		if (pos < generatedSubtree_nr) {
			ModernizedCProgram.move_array((generatedDown + pos + 1), (generatedDown + pos), (generatedSubtree_nr - pos - 1),  + ( - 1));
		} 
		generatedDown[pos] = down;
		return down;
	}
	public cache_tree_sub cache_tree_sub(cache_tree it, Object path) {
		int pathlen = .strlen(path);
		cache_tree_sub cache_tree_sub = new cache_tree_sub();
		return cache_tree_sub.find_subtree(it, path, pathlen, 1);
	}
	public cache_tree getCache_tree() {
		return cache_tree;
	}
	public void setCache_tree(cache_tree newCache_tree) {
		cache_tree = newCache_tree;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getNamelen() {
		return namelen;
	}
	public void setNamelen(int newNamelen) {
		namelen = newNamelen;
	}
	public int getUsed() {
		return used;
	}
	public void setUsed(int newUsed) {
		used = newUsed;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
