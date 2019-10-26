package application;

public enum scld_error {
	SCLD_OK, 
	SCLD_FAILED, 
	SCLD_PERMS, 
	SCLD_EXISTS, 
	SCLD_VANISHED
}
/*
 * Callback function for raceproof_create_file(). This function is
 * expected to do something that makes dirname(path) permanent despite
 * the fact that other processes might be cleaning up empty
 * directories at the same time. Usually it will create a file named
 * path, but alternatively it could create another file in that
 * directory, or even chdir() into that directory. The function should
 * return 0 if the action was completed successfully. On error, it
 * should return a nonzero result and set errno.
 * raceproof_create_file() treats two errno values specially:
 *
 * - ENOENT -- dirname(path) does not exist. In this case,
 *             raceproof_create_file() tries creating dirname(path)
 *             (and any parent directories, if necessary) and calls
 *             the function again.
 *
 * - EISDIR -- the file already exists and is a directory. In this
 *             case, raceproof_create_file() removes the directory if
 *             it is empty (and recursively any empty directories that
 *             it contains) and calls the function again.
 *
 * Any other errno causes raceproof_create_file() to fail with the
 * callback's return value and errno.
 *
 * Obviously, this function should be OK with being called again if it
 * fails with ENOENT or EISDIR. In other scenarios it will not be
 * called again.
 */
