package application;

public enum mmap_strategy {
	MMAP_NONE, 
	MMAP_TEMPORARY, 
	MMAP_OK
}
/*
	 * Don't use mmap() at all for reading `packed-refs`.
	 */
/*
	 * Can use mmap() for reading `packed-refs`, but the file must
	 * not remain mmapped. This is the usual option on Windows,
	 * where you cannot rename a new version of a file onto a file
	 * that is currently mmapped.
	 */
