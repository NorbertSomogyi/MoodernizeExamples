package application;

/*
 * This handles recursive filename detection with exclude
 * files, index knowledge etc..
 *
 * See Documentation/technical/api-directory-listing.txt
 *
 * Copyright (C) Linus Torvalds, 2005-2006
 *		 Junio Hamano, 2005-2006
 */
/*
 * Tells read_directory_recursive how a file or directory should be treated.
 * Values are ordered by significance, e.g. if a directory contains both
 * excluded and untracked files, it is listed as untracked because
 * path_untracked > path_excluded.
 */
public enum path_treatment {
	path_none, 
	path_recurse, 
	path_excluded, 
	path_untracked
}
