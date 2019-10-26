package application;

public class wt_status_change_data {
	private int worktree_status;
	private int index_status;
	private int stagemask;
	private int mode_head;
	private int mode_index;
	private int mode_worktree;
	private object_id oid_head;
	private object_id oid_index;
	private int rename_status;
	private int rename_score;
	private Byte rename_source;
	private int dirty_submodule;
	private int new_submodule_commits;
	
	public wt_status_change_data(int worktree_status, int index_status, int stagemask, int mode_head, int mode_index, int mode_worktree, object_id oid_head, object_id oid_index, int rename_status, int rename_score, Byte rename_source, int dirty_submodule, int new_submodule_commits) {
		setWorktree_status(worktree_status);
		setIndex_status(index_status);
		setStagemask(stagemask);
		setMode_head(mode_head);
		setMode_index(mode_index);
		setMode_worktree(mode_worktree);
		setOid_head(oid_head);
		setOid_index(oid_index);
		setRename_status(rename_status);
		setRename_score(rename_score);
		setRename_source(rename_source);
		setDirty_submodule(dirty_submodule);
		setNew_submodule_commits(new_submodule_commits);
	}
	public wt_status_change_data() {
	}
	
	public byte short_submodule_status() {
		int generatedNew_submodule_commits = this.getNew_submodule_commits();
		if (generatedNew_submodule_commits) {
			return (byte)'M';
		} 
		int generatedDirty_submodule = this.getDirty_submodule();
		if (generatedDirty_submodule & 2) {
			return (byte)'m';
		} 
		if (generatedDirty_submodule & 1) {
			return (byte)'?';
		} 
		int generatedWorktree_status = this.getWorktree_status();
		return generatedWorktree_status;
	}
	/*
	 * Convert various submodule status values into a
	 * fixed-length string of characters in the buffer provided.
	 */
	public void wt_porcelain_v2_submodule_state(Byte sub) {
		int generatedMode_head = this.getMode_head();
		int generatedMode_index = this.getMode_index();
		int generatedMode_worktree = this.getMode_worktree();
		int generatedNew_submodule_commits = this.getNew_submodule_commits();
		int generatedDirty_submodule = this.getDirty_submodule();
		if ((((generatedMode_head) & -1024) == 160000) || (((generatedMode_index) & -1024) == 160000) || (((generatedMode_worktree) & -1024) == 160000)) {
			sub[0] = (byte)'S';
			sub[1] = generatedNew_submodule_commits ? (byte)'C' : (byte)'.';
			sub[2] = (generatedDirty_submodule & 2) ? (byte)'M' : (byte)'.';
			sub[3] = (generatedDirty_submodule & 1) ? (byte)'U' : (byte)'.';
		} else {
				sub[0] = (byte)'N';
				sub[1] = (byte)'.';
				sub[2] = (byte)'.';
				sub[3] = (byte)'.';
		} 
		sub[4] = 0/*
		 * Fix-up changed entries before we print them.
		 */;
	}
	public int getWorktree_status() {
		return worktree_status;
	}
	public void setWorktree_status(int newWorktree_status) {
		worktree_status = newWorktree_status;
	}
	public int getIndex_status() {
		return index_status;
	}
	public void setIndex_status(int newIndex_status) {
		index_status = newIndex_status;
	}
	public int getStagemask() {
		return stagemask;
	}
	public void setStagemask(int newStagemask) {
		stagemask = newStagemask;
	}
	public int getMode_head() {
		return mode_head;
	}
	public void setMode_head(int newMode_head) {
		mode_head = newMode_head;
	}
	public int getMode_index() {
		return mode_index;
	}
	public void setMode_index(int newMode_index) {
		mode_index = newMode_index;
	}
	public int getMode_worktree() {
		return mode_worktree;
	}
	public void setMode_worktree(int newMode_worktree) {
		mode_worktree = newMode_worktree;
	}
	public object_id getOid_head() {
		return oid_head;
	}
	public void setOid_head(object_id newOid_head) {
		oid_head = newOid_head;
	}
	public object_id getOid_index() {
		return oid_index;
	}
	public void setOid_index(object_id newOid_index) {
		oid_index = newOid_index;
	}
	public int getRename_status() {
		return rename_status;
	}
	public void setRename_status(int newRename_status) {
		rename_status = newRename_status;
	}
	public int getRename_score() {
		return rename_score;
	}
	public void setRename_score(int newRename_score) {
		rename_score = newRename_score;
	}
	public Byte getRename_source() {
		return rename_source;
	}
	public void setRename_source(Byte newRename_source) {
		rename_source = newRename_source;
	}
	public int getDirty_submodule() {
		return dirty_submodule;
	}
	public void setDirty_submodule(int newDirty_submodule) {
		dirty_submodule = newDirty_submodule;
	}
	public int getNew_submodule_commits() {
		return new_submodule_commits;
	}
	public void setNew_submodule_commits(int newNew_submodule_commits) {
		new_submodule_commits = newNew_submodule_commits;
	}
}
