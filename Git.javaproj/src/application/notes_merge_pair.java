package application;

public class notes_merge_pair {
	private object_id obj;
	private object_id base;
	private object_id local;
	private object_id remote;
	
	public notes_merge_pair(object_id obj, object_id base, object_id local, object_id remote) {
		setObj(obj);
		setBase(base);
		setLocal(local);
		setRemote(remote);
	}
	public notes_merge_pair() {
	}
	
	public notes_merge_pair find_notes_merge_pair_pos(int len, object_id obj, int insert_new, int occupied) {
		int last_index;
		int i = last_index < len ? last_index : len - 1;
		int prev_cmp = 0;
		int cmp = -1;
		while (i >= 0 && i < len) {
			cmp = ModernizedCProgram.oidcmp(obj, ModernizedCProgram.list[i].getObj());
			if (!/* obj belongs @ i */cmp) {
				break;
			}  else if (cmp < 0 && prev_cmp <= /* obj belongs < i */0) {
				i--;
			}  else if (cmp < /* obj belongs between i-1 and i */0) {
				break;
			}  else if (cmp > 0 && prev_cmp >= /* obj belongs > i */0) {
				i++;
			} else {
					/* if (cmp > 0) *//* obj belongs between i and i+1 */i++;
					break;
			} 
			prev_cmp = cmp;
		}
		if (i < 0) {
			i = 0/* obj belongs at, or immediately preceding, index i (0 <= i <= len) */;
		} 
		if (!cmp) {
			occupied = 1;
		} else {
				occupied = 0;
				if (insert_new && i < len) {
					ModernizedCProgram.move_array((ModernizedCProgram.list + i + 1), (ModernizedCProgram.list + i), (len - i),  + ( - 1));
					.memset(ModernizedCProgram.list + i, 0, );
				} 
		} 
		last_index = i;
		return ModernizedCProgram.list + i;
	}
	public notes_merge_pair diff_tree_remote(notes_merge_options o, Object base, Object remote, int num_changes) {
		diff_options opt = new diff_options();
		notes_merge_pair changes = new notes_merge_pair();
		int i;
		int len = 0;
		do {
			if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
				ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 130, "\tdiff_tree_remote(base = %.7s, remote = %.7s)\n", ModernizedCProgram.oid_to_hex(base), ModernizedCProgram.oid_to_hex(remote));
			} 
		} while (0);
		repository generatedRepo = o.getRepo();
		.repo_diff_setup(generatedRepo, opt);
		diff_flags generatedFlags = opt.getFlags();
		generatedFlags.setRecursive(1);
		opt.setOutput_format(-1024);
		.diff_setup_done(opt);
		opt.diff_tree_oid(base, remote, "");
		.diffcore_std(opt);
		changes = ModernizedCProgram.xcalloc(ModernizedCProgram.diff_queued_diff.getNr(), );
		diff_filespec generatedOne = p.getOne();
		Byte generatedPath = generatedOne.getPath();
		byte generatedStatus = p.getStatus();
		object_id generatedOid = generatedOne.getOid();
		object_id generatedObj = mp.getObj();
		object_id generatedRemote = mp.getRemote();
		object_id generatedBase = mp.getBase();
		object_id generatedLocal = mp.getLocal();
		for (i = 0; i < ModernizedCProgram.diff_queued_diff.getNr(); i++) {
			diff_filepair p = ModernizedCProgram.diff_queued_diff.getQueue()[i];
			notes_merge_pair mp = new notes_merge_pair();
			int occupied;
			object_id obj = new object_id();
			if (ModernizedCProgram.verify_notes_filepair(p, obj)) {
				do {
					if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
						ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 151, "\t\tCannot merge entry '%s' (%c): %.7s -> %.7s. Skipping!\n", generatedPath, generatedStatus, ModernizedCProgram.oid_to_hex(generatedOid), ModernizedCProgram.oid_to_hex(generatedOid));
					} 
				} while (0);
				continue;
			} 
			mp = changes.find_notes_merge_pair_pos(len, obj, 1, occupied);
			if (occupied) {
				((ModernizedCProgram.oideq(generatedObj, obj)) ? (Object)0 : ._assert("oideq(&mp->obj, &obj)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", /* We've found an addition/deletion pair */157));
				if (ModernizedCProgram.is_null_oid(generatedOid)) {
					((ModernizedCProgram.is_null_oid(generatedRemote)) ? (Object)0 : ._assert("is_null_oid(&mp->remote)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 159));
					generatedRemote.oidcpy(generatedOid);
				}  else if (ModernizedCProgram.is_null_oid(generatedOid)) {
					((ModernizedCProgram.is_null_oid(generatedBase)) ? (Object)0 : ._assert("is_null_oid(&mp->base)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 162));
					generatedBase.oidcpy(generatedOid);
				} else {
						((!"Invalid existing change recorded") ? (Object)0 : ._assert("!\"Invalid existing change recorded\"", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 165));
				} 
			} else {
					generatedObj.oidcpy(obj);
					generatedBase.oidcpy(generatedOid);
					generatedLocal.oidcpy(ModernizedCProgram.uninitialized);
					generatedRemote.oidcpy(generatedOid);
					len++;
			} 
			do {
				if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
					ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\notes-merge.c", 175, "\t\tStored remote change for %s: %.7s -> %.7s\n", ModernizedCProgram.oid_to_hex(generatedObj), ModernizedCProgram.oid_to_hex(generatedBase), ModernizedCProgram.oid_to_hex(generatedRemote));
				} 
			} while (0);
		}
		.diff_flush(opt);
		pathspec generatedPathspec = opt.getPathspec();
		generatedPathspec.clear_pathspec();
		num_changes = len;
		return changes;
	}
	public object_id getObj() {
		return obj;
	}
	public void setObj(object_id newObj) {
		obj = newObj;
	}
	public object_id getBase() {
		return base;
	}
	public void setBase(object_id newBase) {
		base = newBase;
	}
	public object_id getLocal() {
		return local;
	}
	public void setLocal(object_id newLocal) {
		local = newLocal;
	}
	public object_id getRemote() {
		return remote;
	}
	public void setRemote(object_id newRemote) {
		remote = newRemote;
	}
}
/*
	 * Both diff_tree_remote() and diff_tree_local() tend to process
	 * merge_pairs in ascending order. Therefore, cache last returned
	 * index, and search sequentially from there until the appropriate
	 * position is found.
	 *
	 * Since inserts only happen from diff_tree_remote() (which mainly
	 * _appends_), we don't care that inserting into the middle of the
	 * list is expensive (using memmove()).
	 */
/*
	 * Return 0 if change is successfully resolved (stored in notes_tree).
	 * Return 1 is change results in a conflict (NOT stored in notes_tree,
	 * but instead written to NOTES_MERGE_WORKTREE with conflict markers).
	 */
