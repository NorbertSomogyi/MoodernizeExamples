package application;

public enum branch_track {
	BRANCH_TRACK_UNSPECIFIED, 
	BRANCH_TRACK_NEVER, 
	BRANCH_TRACK_REMOTE, 
	BRANCH_TRACK_ALWAYS, 
	BRANCH_TRACK_EXPLICIT, 
	BRANCH_TRACK_OVERRIDE
}
/* Functions for acting on the information about branches. */
/*
 * Creates a new branch, where:
 *
 *   - r is the repository to add a branch to
 *
 *   - name is the new branch name
 *
 *   - start_name is the name of the existing branch that the new branch should
 *     start from
 *
 *   - force enables overwriting an existing (non-head) branch
 *
 *   - clobber_head_ok allows the currently checked out (hence existing)
 *     branch to be overwritten; without 'force', it has no effect.
 *
 *   - reflog creates a reflog for the branch
 *
 *   - quiet suppresses tracking information
 *
 *   - track causes the new branch to be configured to merge the remote branch
 *     that start_name is a tracking branch for (if any).
 *
 */
/*
 * Check if 'name' can be a valid name for a branch; die otherwise.
 * Return 1 if the named branch already exists; return 0 otherwise.
 * Fill ref with the full refname for the branch.
 */
