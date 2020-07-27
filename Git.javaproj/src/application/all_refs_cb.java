package application;

public class all_refs_cb {
	private int all_flags;
	private int warned_bad_reflog;
	private rev_info all_revs;
	private Object name_for_errormsg;
	private worktree wt;
	
	public all_refs_cb(int all_flags, int warned_bad_reflog, rev_info all_revs, Object name_for_errormsg, worktree wt) {
		setAll_flags(all_flags);
		setWarned_bad_reflog(warned_bad_reflog);
		setAll_revs(all_revs);
		setName_for_errormsg(name_for_errormsg);
		setWt(wt);
	}
	public all_refs_cb() {
	}
	
	public void add_other_reflogs_to_pending() {
		worktree worktrees = new worktree();
		worktree p = new worktree();
		worktrees = /*Error: Function owner not recognized*/get_worktrees(0);
		int generatedIs_current = wt.getIs_current();
		ref_store ref_store = new ref_store();
		for (p = worktrees; p; p++) {
			worktree wt = p;
			if (generatedIs_current) {
				continue;
			} 
			this.setWt(wt);
			ref_store.get_worktree_ref_store(wt).refs_for_each_reflog(handle_one_reflog, cb);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free_worktrees(worktrees);
	}
	public int getAll_flags() {
		return all_flags;
	}
	public void setAll_flags(int newAll_flags) {
		all_flags = newAll_flags;
	}
	public int getWarned_bad_reflog() {
		return warned_bad_reflog;
	}
	public void setWarned_bad_reflog(int newWarned_bad_reflog) {
		warned_bad_reflog = newWarned_bad_reflog;
	}
	public rev_info getAll_revs() {
		return all_revs;
	}
	public void setAll_revs(rev_info newAll_revs) {
		all_revs = newAll_revs;
	}
	public Object getName_for_errormsg() {
		return name_for_errormsg;
	}
	public void setName_for_errormsg(Object newName_for_errormsg) {
		name_for_errormsg = newName_for_errormsg;
	}
	public worktree getWt() {
		return wt;
	}
	public void setWt(worktree newWt) {
		wt = newWt;
	}
}
