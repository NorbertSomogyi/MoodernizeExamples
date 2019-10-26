package application;

public enum peel_status {
	PEEL_PEELED, 
	PEEL_INVALID, 
	PEEL_NON_TAG, 
	PEEL_IS_SYMREF, 
	PEEL_BROKEN
}
/*
 * Copy the reflog message msg to sb while cleaning up the whitespaces.
 * Especially, convert LF to space, because reflog file is one line per entry.
 */
