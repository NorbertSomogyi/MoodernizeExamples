package application;

public class checkout_opts {
	private int patch_mode;
	private int quiet;
	private int merge;
	private int force;
	private int force_detach;
	private int implicit_detach;
	private int writeout_stage;
	private int overwrite_ignore;
	private int ignore_skipworktree;
	private int ignore_other_worktrees;
	private int show_progress;
	private int count_checkout_paths;
	private int overlay_mode;
	private int dwim_new_local_branch;
	private int discard_changes;
	private int accept_ref;
	private int accept_pathspec;
	private int switch_branch_doing_nothing_is_ok;
	private int only_merge_on_switching_branches;
	private int can_switch_when_in_progress;
	private int orphan_from_empty_tree;
	private int empty_pathspec_ok;
	private int checkout_index;
	private int checkout_worktree;
	private Object ignore_unmerged_opt;
	private int ignore_unmerged;
	private Object new_branch;
	private Object new_branch_force;
	private Object new_orphan_branch;
	private int new_branch_log;
	private branch_track track;
	private diff_options diff_options;
	private Byte conflict_style;
	private int branch_exists;
	private Object prefix;
	private pathspec pathspec;
	private Object from_treeish;
	private tree source_tree;
	
	public checkout_opts(int patch_mode, int quiet, int merge, int force, int force_detach, int implicit_detach, int writeout_stage, int overwrite_ignore, int ignore_skipworktree, int ignore_other_worktrees, int show_progress, int count_checkout_paths, int overlay_mode, int dwim_new_local_branch, int discard_changes, int accept_ref, int accept_pathspec, int switch_branch_doing_nothing_is_ok, int only_merge_on_switching_branches, int can_switch_when_in_progress, int orphan_from_empty_tree, int empty_pathspec_ok, int checkout_index, int checkout_worktree, Object ignore_unmerged_opt, int ignore_unmerged, Object new_branch, Object new_branch_force, Object new_orphan_branch, int new_branch_log, branch_track track, diff_options diff_options, Byte conflict_style, int branch_exists, Object prefix, pathspec pathspec, Object from_treeish, tree source_tree) {
		setPatch_mode(patch_mode);
		setQuiet(quiet);
		setMerge(merge);
		setForce(force);
		setForce_detach(force_detach);
		setImplicit_detach(implicit_detach);
		setWriteout_stage(writeout_stage);
		setOverwrite_ignore(overwrite_ignore);
		setIgnore_skipworktree(ignore_skipworktree);
		setIgnore_other_worktrees(ignore_other_worktrees);
		setShow_progress(show_progress);
		setCount_checkout_paths(count_checkout_paths);
		setOverlay_mode(overlay_mode);
		setDwim_new_local_branch(dwim_new_local_branch);
		setDiscard_changes(discard_changes);
		setAccept_ref(accept_ref);
		setAccept_pathspec(accept_pathspec);
		setSwitch_branch_doing_nothing_is_ok(switch_branch_doing_nothing_is_ok);
		setOnly_merge_on_switching_branches(only_merge_on_switching_branches);
		setCan_switch_when_in_progress(can_switch_when_in_progress);
		setOrphan_from_empty_tree(orphan_from_empty_tree);
		setEmpty_pathspec_ok(empty_pathspec_ok);
		setCheckout_index(checkout_index);
		setCheckout_worktree(checkout_worktree);
		setIgnore_unmerged_opt(ignore_unmerged_opt);
		setIgnore_unmerged(ignore_unmerged);
		setNew_branch(new_branch);
		setNew_branch_force(new_branch_force);
		setNew_orphan_branch(new_orphan_branch);
		setNew_branch_log(new_branch_log);
		setTrack(track);
		setDiff_options(diff_options);
		setConflict_style(conflict_style);
		setBranch_exists(branch_exists);
		setPrefix(prefix);
		setPathspec(pathspec);
		setFrom_treeish(from_treeish);
		setSource_tree(source_tree);
	}
	public checkout_opts() {
	}
	
	public int getPatch_mode() {
		return patch_mode;
	}
	public void setPatch_mode(int newPatch_mode) {
		patch_mode = newPatch_mode;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getMerge() {
		return merge;
	}
	public void setMerge(int newMerge) {
		merge = newMerge;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int newForce) {
		force = newForce;
	}
	public int getForce_detach() {
		return force_detach;
	}
	public void setForce_detach(int newForce_detach) {
		force_detach = newForce_detach;
	}
	public int getImplicit_detach() {
		return implicit_detach;
	}
	public void setImplicit_detach(int newImplicit_detach) {
		implicit_detach = newImplicit_detach;
	}
	public int getWriteout_stage() {
		return writeout_stage;
	}
	public void setWriteout_stage(int newWriteout_stage) {
		writeout_stage = newWriteout_stage;
	}
	public int getOverwrite_ignore() {
		return overwrite_ignore;
	}
	public void setOverwrite_ignore(int newOverwrite_ignore) {
		overwrite_ignore = newOverwrite_ignore;
	}
	public int getIgnore_skipworktree() {
		return ignore_skipworktree;
	}
	public void setIgnore_skipworktree(int newIgnore_skipworktree) {
		ignore_skipworktree = newIgnore_skipworktree;
	}
	public int getIgnore_other_worktrees() {
		return ignore_other_worktrees;
	}
	public void setIgnore_other_worktrees(int newIgnore_other_worktrees) {
		ignore_other_worktrees = newIgnore_other_worktrees;
	}
	public int getShow_progress() {
		return show_progress;
	}
	public void setShow_progress(int newShow_progress) {
		show_progress = newShow_progress;
	}
	public int getCount_checkout_paths() {
		return count_checkout_paths;
	}
	public void setCount_checkout_paths(int newCount_checkout_paths) {
		count_checkout_paths = newCount_checkout_paths;
	}
	public int getOverlay_mode() {
		return overlay_mode;
	}
	public void setOverlay_mode(int newOverlay_mode) {
		overlay_mode = newOverlay_mode;
	}
	public int getDwim_new_local_branch() {
		return dwim_new_local_branch;
	}
	public void setDwim_new_local_branch(int newDwim_new_local_branch) {
		dwim_new_local_branch = newDwim_new_local_branch;
	}
	public int getDiscard_changes() {
		return discard_changes;
	}
	public void setDiscard_changes(int newDiscard_changes) {
		discard_changes = newDiscard_changes;
	}
	public int getAccept_ref() {
		return accept_ref;
	}
	public void setAccept_ref(int newAccept_ref) {
		accept_ref = newAccept_ref;
	}
	public int getAccept_pathspec() {
		return accept_pathspec;
	}
	public void setAccept_pathspec(int newAccept_pathspec) {
		accept_pathspec = newAccept_pathspec;
	}
	public int getSwitch_branch_doing_nothing_is_ok() {
		return switch_branch_doing_nothing_is_ok;
	}
	public void setSwitch_branch_doing_nothing_is_ok(int newSwitch_branch_doing_nothing_is_ok) {
		switch_branch_doing_nothing_is_ok = newSwitch_branch_doing_nothing_is_ok;
	}
	public int getOnly_merge_on_switching_branches() {
		return only_merge_on_switching_branches;
	}
	public void setOnly_merge_on_switching_branches(int newOnly_merge_on_switching_branches) {
		only_merge_on_switching_branches = newOnly_merge_on_switching_branches;
	}
	public int getCan_switch_when_in_progress() {
		return can_switch_when_in_progress;
	}
	public void setCan_switch_when_in_progress(int newCan_switch_when_in_progress) {
		can_switch_when_in_progress = newCan_switch_when_in_progress;
	}
	public int getOrphan_from_empty_tree() {
		return orphan_from_empty_tree;
	}
	public void setOrphan_from_empty_tree(int newOrphan_from_empty_tree) {
		orphan_from_empty_tree = newOrphan_from_empty_tree;
	}
	public int getEmpty_pathspec_ok() {
		return empty_pathspec_ok;
	}
	public void setEmpty_pathspec_ok(int newEmpty_pathspec_ok) {
		empty_pathspec_ok = newEmpty_pathspec_ok;
	}
	public int getCheckout_index() {
		return checkout_index;
	}
	public void setCheckout_index(int newCheckout_index) {
		checkout_index = newCheckout_index;
	}
	public int getCheckout_worktree() {
		return checkout_worktree;
	}
	public void setCheckout_worktree(int newCheckout_worktree) {
		checkout_worktree = newCheckout_worktree;
	}
	public Object getIgnore_unmerged_opt() {
		return ignore_unmerged_opt;
	}
	public void setIgnore_unmerged_opt(Object newIgnore_unmerged_opt) {
		ignore_unmerged_opt = newIgnore_unmerged_opt;
	}
	public int getIgnore_unmerged() {
		return ignore_unmerged;
	}
	public void setIgnore_unmerged(int newIgnore_unmerged) {
		ignore_unmerged = newIgnore_unmerged;
	}
	public Object getNew_branch() {
		return new_branch;
	}
	public void setNew_branch(Object newNew_branch) {
		new_branch = newNew_branch;
	}
	public Object getNew_branch_force() {
		return new_branch_force;
	}
	public void setNew_branch_force(Object newNew_branch_force) {
		new_branch_force = newNew_branch_force;
	}
	public Object getNew_orphan_branch() {
		return new_orphan_branch;
	}
	public void setNew_orphan_branch(Object newNew_orphan_branch) {
		new_orphan_branch = newNew_orphan_branch;
	}
	public int getNew_branch_log() {
		return new_branch_log;
	}
	public void setNew_branch_log(int newNew_branch_log) {
		new_branch_log = newNew_branch_log;
	}
	public branch_track getTrack() {
		return track;
	}
	public void setTrack(branch_track newTrack) {
		track = newTrack;
	}
	public diff_options getDiff_options() {
		return diff_options;
	}
	public void setDiff_options(diff_options newDiff_options) {
		diff_options = newDiff_options;
	}
	public Byte getConflict_style() {
		return conflict_style;
	}
	public void setConflict_style(Byte newConflict_style) {
		conflict_style = newConflict_style;
	}
	public int getBranch_exists() {
		return branch_exists;
	}
	public void setBranch_exists(int newBranch_exists) {
		branch_exists = newBranch_exists;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public pathspec getPathspec() {
		return pathspec;
	}
	public void setPathspec(pathspec newPathspec) {
		pathspec = newPathspec;
	}
	public Object getFrom_treeish() {
		return from_treeish;
	}
	public void setFrom_treeish(Object newFrom_treeish) {
		from_treeish = newFrom_treeish;
	}
	public tree getSource_tree() {
		return source_tree;
	}
	public void setSource_tree(tree newSource_tree) {
		source_tree = newSource_tree;
	}
}
