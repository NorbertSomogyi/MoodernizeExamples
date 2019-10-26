package application;

public class wt_status_state {
	private int merge_in_progress;
	private int am_in_progress;
	private int am_empty_patch;
	private int rebase_in_progress;
	private int rebase_interactive_in_progress;
	private int cherry_pick_in_progress;
	private int bisect_in_progress;
	private int revert_in_progress;
	private int detached_at;
	private Byte branch;
	private Byte onto;
	private Byte detached_from;
	private object_id detached_oid;
	private object_id revert_head_oid;
	private object_id cherry_pick_head_oid;
	
	public wt_status_state(int merge_in_progress, int am_in_progress, int am_empty_patch, int rebase_in_progress, int rebase_interactive_in_progress, int cherry_pick_in_progress, int bisect_in_progress, int revert_in_progress, int detached_at, Byte branch, Byte onto, Byte detached_from, object_id detached_oid, object_id revert_head_oid, object_id cherry_pick_head_oid) {
		setMerge_in_progress(merge_in_progress);
		setAm_in_progress(am_in_progress);
		setAm_empty_patch(am_empty_patch);
		setRebase_in_progress(rebase_in_progress);
		setRebase_interactive_in_progress(rebase_interactive_in_progress);
		setCherry_pick_in_progress(cherry_pick_in_progress);
		setBisect_in_progress(bisect_in_progress);
		setRevert_in_progress(revert_in_progress);
		setDetached_at(detached_at);
		setBranch(branch);
		setOnto(onto);
		setDetached_from(detached_from);
		setDetached_oid(detached_oid);
		setRevert_head_oid(revert_head_oid);
		setCherry_pick_head_oid(cherry_pick_head_oid);
	}
	public wt_status_state() {
	}
	
	public int wt_status_check_rebase(Object wt) {
		stat st = new stat();
		Object generatedSt_size = st.getSt_size();
		if (!.stat(ModernizedCProgram.worktree_git_path(wt, "rebase-apply"), st)) {
			if (!.stat(ModernizedCProgram.worktree_git_path(wt, "rebase-apply/applying"), st)) {
				ModernizedCProgram.state.setAm_in_progress(1);
				if (!.stat(ModernizedCProgram.worktree_git_path(wt, "rebase-apply/patch"), st) && !generatedSt_size) {
					ModernizedCProgram.state.setAm_empty_patch(1);
				} 
			} else {
					ModernizedCProgram.state.setRebase_in_progress(1);
					ModernizedCProgram.state.setBranch(ModernizedCProgram.get_branch(wt, "rebase-apply/head-name"));
					ModernizedCProgram.state.setOnto(ModernizedCProgram.get_branch(wt, "rebase-apply/onto"));
			} 
		}  else if (!.stat(ModernizedCProgram.worktree_git_path(wt, "rebase-merge"), st)) {
			if (!.stat(ModernizedCProgram.worktree_git_path(wt, "rebase-merge/interactive"), st)) {
				ModernizedCProgram.state.setRebase_interactive_in_progress(1);
			} else {
					ModernizedCProgram.state.setRebase_in_progress(1);
			} 
			ModernizedCProgram.state.setBranch(ModernizedCProgram.get_branch(wt, "rebase-merge/head-name"));
			ModernizedCProgram.state.setOnto(ModernizedCProgram.get_branch(wt, "rebase-merge/onto"));
		} else {
				return 0;
		} 
		return 1;
	}
	public int wt_status_check_bisect(Object wt) {
		stat st = new stat();
		if (!.stat(ModernizedCProgram.worktree_git_path(wt, "BISECT_LOG"), st)) {
			ModernizedCProgram.state.setBisect_in_progress(1);
			ModernizedCProgram.state.setBranch(ModernizedCProgram.get_branch(wt, "BISECT_START"));
			return 1;
		} 
		return 0;
	}
	public int getMerge_in_progress() {
		return merge_in_progress;
	}
	public void setMerge_in_progress(int newMerge_in_progress) {
		merge_in_progress = newMerge_in_progress;
	}
	public int getAm_in_progress() {
		return am_in_progress;
	}
	public void setAm_in_progress(int newAm_in_progress) {
		am_in_progress = newAm_in_progress;
	}
	public int getAm_empty_patch() {
		return am_empty_patch;
	}
	public void setAm_empty_patch(int newAm_empty_patch) {
		am_empty_patch = newAm_empty_patch;
	}
	public int getRebase_in_progress() {
		return rebase_in_progress;
	}
	public void setRebase_in_progress(int newRebase_in_progress) {
		rebase_in_progress = newRebase_in_progress;
	}
	public int getRebase_interactive_in_progress() {
		return rebase_interactive_in_progress;
	}
	public void setRebase_interactive_in_progress(int newRebase_interactive_in_progress) {
		rebase_interactive_in_progress = newRebase_interactive_in_progress;
	}
	public int getCherry_pick_in_progress() {
		return cherry_pick_in_progress;
	}
	public void setCherry_pick_in_progress(int newCherry_pick_in_progress) {
		cherry_pick_in_progress = newCherry_pick_in_progress;
	}
	public int getBisect_in_progress() {
		return bisect_in_progress;
	}
	public void setBisect_in_progress(int newBisect_in_progress) {
		bisect_in_progress = newBisect_in_progress;
	}
	public int getRevert_in_progress() {
		return revert_in_progress;
	}
	public void setRevert_in_progress(int newRevert_in_progress) {
		revert_in_progress = newRevert_in_progress;
	}
	public int getDetached_at() {
		return detached_at;
	}
	public void setDetached_at(int newDetached_at) {
		detached_at = newDetached_at;
	}
	public Byte getBranch() {
		return branch;
	}
	public void setBranch(Byte newBranch) {
		branch = newBranch;
	}
	public Byte getOnto() {
		return onto;
	}
	public void setOnto(Byte newOnto) {
		onto = newOnto;
	}
	public Byte getDetached_from() {
		return detached_from;
	}
	public void setDetached_from(Byte newDetached_from) {
		detached_from = newDetached_from;
	}
	public object_id getDetached_oid() {
		return detached_oid;
	}
	public void setDetached_oid(object_id newDetached_oid) {
		detached_oid = newDetached_oid;
	}
	public object_id getRevert_head_oid() {
		return revert_head_oid;
	}
	public void setRevert_head_oid(object_id newRevert_head_oid) {
		revert_head_oid = newRevert_head_oid;
	}
	public object_id getCherry_pick_head_oid() {
		return cherry_pick_head_oid;
	}
	public void setCherry_pick_head_oid(object_id newCherry_pick_head_oid) {
		cherry_pick_head_oid = newCherry_pick_head_oid;
	}
}
