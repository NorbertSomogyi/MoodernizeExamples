package application;

/* normal/shared refs inside refs/        */
public enum ref_type {
	REF_TYPE_PER_WORKTREE, 
	REF_TYPE_PSEUDOREF, 
	REF_TYPE_MAIN_PSEUDOREF, 
	REF_TYPE_OTHER_PSEUDOREF, 
	REF_TYPE_NORMAL
}
/* refs inside refs/ but not shared       */
/* refs outside refs/ in current worktree */
/* pseudo refs from the main worktree     */
/* pseudo refs from other worktrees       */
