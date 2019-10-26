package application;

/* from where does this commit originate */
public enum commit_whence {
	FROM_COMMIT, 
	FROM_MERGE, 
	FROM_CHERRY_PICK
}
/* normal */
/* commit came from merge */
/* commit came from cherry-pick */
