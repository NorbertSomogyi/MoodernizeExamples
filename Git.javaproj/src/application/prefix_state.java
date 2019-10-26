package application;

/*
 * Return a `prefix_state` constant describing the relationship
 * between the directory with the specified `dirname` and `prefix`.
 */
public enum prefix_state {
	PREFIX_CONTAINS_DIR, 
	PREFIX_WITHIN_DIR, 
	PREFIX_EXCLUDES_DIR
}
/* All refs within the directory would match prefix: */
/* Some, but not all, refs within the directory might match prefix: */
/* No refs within the directory could possibly match prefix: */
/*
	 * The index of the current entry within dir (which might
	 * itself be a directory). If index == -1, then the iteration
	 * hasn't yet begun. If index == dir->nr, then the iteration
	 * through this level is over.
	 */
