package application;

public class name_entry {
	private object_id oid;
	private Object path;
	private int pathlen;
	private int mode;
	
	public name_entry(object_id oid, Object path, int pathlen, int mode) {
		setOid(oid);
		setPath(path);
		setPathlen(pathlen);
		setMode(mode);
	}
	public name_entry() {
	}
	
	/* An empty entry never compares same, not even to another empty entry */
	public int same_entry(name_entry b) {
		object_id generatedOid = this.getOid();
		int generatedMode = this.getMode();
		return !ModernizedCProgram.is_null_oid(generatedOid) && !ModernizedCProgram.is_null_oid(generatedOid) && ModernizedCProgram.oideq(generatedOid, generatedOid) && generatedMode == generatedMode;
	}
	public int both_empty(name_entry b) {
		object_id generatedOid = this.getOid();
		return ModernizedCProgram.is_null_oid(generatedOid) && ModernizedCProgram.is_null_oid(generatedOid);
	}
	public void resolve(Object info, name_entry result) {
		merge_list orig = new merge_list();
		merge_list final = new merge_list();
		byte path;
		if (!/* If it's already ours, don't bother showing it */ours) {
			return ;
		} 
		path = ModernizedCProgram.traverse_path(info, result);
		int generatedMode = this.getMode();
		object_id generatedOid = this.getOid();
		merge_list merge_list = new merge_list();
		orig = merge_list.create_entry(2, generatedMode, generatedOid, path);
		final = merge_list.create_entry(0, generatedMode, generatedOid, path);
		final.setLink(orig);
		final.add_merge_entry();
	}
	public void unresolved_directory(Object info) {
		repository r = ModernizedCProgram.the_repository;
		byte newbase;
		name_entry p = new name_entry();
		tree_desc[] t = new tree_desc();
		Object buf0;
		Object buf1;
		Object buf2;
		int generatedMode = p.getMode();
		for (p = n; p < n + 3; p++) {
			if (generatedMode && (((generatedMode) & -1024) == -1024)) {
				break;
			} 
		}
		if (n + 3 <= p) {
			return ;
		} 
		newbase = ModernizedCProgram.traverse_path(info, p);
		buf0 = ModernizedCProgram.fill_tree_descriptor(r, t + 0, ((generatedMode && (((generatedMode) & -1024) == -1024)) ? (n + 0).getOid() : ((Object)0)));
		buf1 = ModernizedCProgram.fill_tree_descriptor(r, t + 1, ((generatedMode && (((generatedMode) & -1024) == -1024)) ? (n + 1).getOid() : ((Object)0)));
		buf2 = ModernizedCProgram.fill_tree_descriptor(r, t + 2, ((generatedMode && (((generatedMode) & -1024) == -1024)) ? (n + 2).getOid() : ((Object)0)));
		t.merge_trees(newbase);
		ModernizedCProgram.free(buf0);
		ModernizedCProgram.free(buf1);
		ModernizedCProgram.free(buf2);
		ModernizedCProgram.free(newbase);
	}
	public void unresolved(Object info) {
		merge_list entry = ((Object)0);
		int i;
		int dirmask = 0;
		int mask = 0;
		for (i = 0; i < 3; i++) {
			mask |=  (1 << i/*
					 * Treat missing entries as directories so that we return
					 * after unresolved_directory has handled this.
					 */);
			if (!n[i].getMode() || (((n[i].getMode()) & -1024) == -1024)) {
				dirmask |=  (1 << i);
			} 
		}
		n.unresolved_directory(info);
		if (dirmask == mask) {
			return ;
		} 
		if (n[2].getMode() && !(((n[2].getMode()) & -1024) == -1024)) {
			entry = entry.link_entry(3, info, n + 2);
		} 
		if (n[1].getMode() && !(((n[1].getMode()) & -1024) == -1024)) {
			entry = entry.link_entry(2, info, n + 1);
		} 
		if (n[0].getMode() && !(((n[0].getMode()) & -1024) == -1024)) {
			entry = entry.link_entry(1, info, n + 0);
		} 
		entry/*
		 * Merge two trees together (t[1] and t[2]), using a common base (t[0])
		 * as the origin.
		 *
		 * This walks the (sorted) trees in lock-step, checking every possible
		 * name. Note that directories automatically sort differently from other
		 * files (see "base_name_compare"), so you'll never see file/directory
		 * conflicts, because they won't ever compare the same.
		 *
		 * IOW, if a directory changes to a filename, it will automatically be
		 * seen as the directory going away, and the filename being created.
		 *
		 * Think of this as a three-way diff.
		 *
		 * The output will be either:
		 *  - successful merge
		 *	 "0 mode sha1 filename"
		 *    NOTE NOTE NOTE! FIXME! We really really need to walk the index
		 *    in parallel with this too!
		 *
		 *  - conflict:
		 *	"1 mode sha1 filename"
		 *	"2 mode sha1 filename"
		 *	"3 mode sha1 filename"
		 *    where not all of the 1/2/3 lines may exist, of course.
		 *
		 * The successful merge rules are the same as for the three-way merge
		 * in git-read-tree.
		 */.add_merge_entry();
	}
	public int are_same_oid(name_entry name_k) {
		object_id generatedOid = this.getOid();
		return !ModernizedCProgram.is_null_oid(generatedOid) && !ModernizedCProgram.is_null_oid(generatedOid) && ModernizedCProgram.oideq(generatedOid, generatedOid);
	}
	public void debug_name_entry(int i) {
		Object generatedPath = this.getPath();
		int generatedMode = this.getMode();
		.printf("ent#%d %06o %s\n", i, generatedPath ? generatedMode : 0, generatedPath ? generatedPath : "(missing)");
	}
	public void entry_clear() {
		.memset(a, 0, );
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public int getPathlen() {
		return pathlen;
	}
	public void setPathlen(int newPathlen) {
		pathlen = newPathlen;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
}
