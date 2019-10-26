package application;

public class cache_def {
	private strbuf path;
	private int flags;
	private int track_flags;
	private int prefix_len_stat_func;
	
	public cache_def(strbuf path, int flags, int track_flags, int prefix_len_stat_func) {
		setPath(path);
		setFlags(flags);
		setTrack_flags(track_flags);
		setPrefix_len_stat_func(prefix_len_stat_func);
	}
	public cache_def() {
	}
	
	public void reset_lstat_cache() {
		strbuf generatedPath = this.getPath();
		generatedPath.strbuf_setlen(0);
		this.setFlags(0/*
			 * The track_flags and prefix_len_stat_func members is only
			 * set by the safeguard rule inside lstat_cache()
			 */);
	}
	/*
	 * Check if name 'name' of length 'len' has a symlink leading
	 * component, or if the directory exists and is real, or not.
	 *
	 * To speed up the check, some information is allowed to be cached.
	 * This can be indicated by the 'track_flags' argument, which also can
	 * be used to indicate that we should check the full path.
	 *
	 * The 'prefix_len_stat_func' parameter can be used to set the length
	 * of the prefix, where the cache should use the stat() function
	 * instead of the lstat() function to test each path component.
	 */
	public int lstat_cache_matchlen(Object name, int len, int ret_flags, int track_flags, int prefix_len_stat_func) {
		int match_len;
		int last_slash;
		int last_slash_dir;
		int previous_slash;
		int save_flags;
		int ret;
		stat st = new stat();
		int generatedTrack_flags = this.getTrack_flags();
		int generatedPrefix_len_stat_func = this.getPrefix_len_stat_func();
		strbuf generatedPath = this.getPath();
		byte generatedBuf = generatedPath.getBuf();
		Object generatedLen = generatedPath.getLen();
		int generatedFlags = this.getFlags();
		if (generatedTrack_flags != track_flags || generatedPrefix_len_stat_func != prefix_len_stat_func/*
				 * As a safeguard rule we clear the cache if the
				 * values of track_flags and/or prefix_len_stat_func
				 * does not match with the last supplied values.
				 */) {
			cache.reset_lstat_cache();
			this.setTrack_flags(track_flags);
			this.setPrefix_len_stat_func(prefix_len_stat_func);
			match_len = last_slash = 0/*
					 * Check to see if we have a match from the cache for
					 * the 2 "excluding" path types.
					 */;
		} else {
				match_len = last_slash = ModernizedCProgram.longest_path_match(name, len, generatedBuf, generatedLen, previous_slash);
				ret_flags = generatedFlags & track_flags & ((1 << 1) | (1 << 2));
				if (!(track_flags & (1 << 5)) && match_len == len) {
					match_len = last_slash = previous_slash;
				} 
				if (ret_flags && match_len == generatedLen) {
					return match_len/*
							 * If we now have match_len > 0, we would know that
							 * the matched part will always be a directory.
							 *
							 * Also, if we are tracking directories and 'name' is
							 * a substring of the cache on a path component basis,
							 * we can return immediately.
							 */;
				} 
				ret_flags = track_flags & (1 << 0);
				if (ret_flags && len == match_len) {
					return match_len/*
						 * Okay, no match from the cache so far, so now we have to
						 * check the rest of the path components.
						 */;
				} 
		} 
		ret_flags = (1 << 0);
		last_slash_dir = last_slash;
		if (len > generatedLen) {
			generatedPath.strbuf_grow(len - generatedLen);
		} 
		Object generatedSt_mode = st.getSt_mode();
		while (match_len < len) {
			do {
				generatedBuf[match_len] = name[match_len];
				match_len++;
			} while (match_len < len && name[match_len] != (byte)'/');
			if (match_len >= len && !(track_flags & (1 << 5))) {
				break;
			} 
			last_slash = match_len;
			generatedBuf[last_slash] = (byte)'\0';
			if (last_slash <= prefix_len_stat_func) {
				ret = .stat(generatedBuf, st);
			} else {
					ret = .lstat(generatedBuf, st);
			} 
			if (ret) {
				ret_flags = (1 << 3);
				if ((._errno()) == 2) {
					ret_flags |=  (1 << 1);
				} 
			}  else if ((((generatedSt_mode) & -1024) == -1024)) {
				last_slash_dir = last_slash;
				continue;
			}  else if (.S_ISLNK(generatedSt_mode)) {
				ret_flags = (1 << 2);
			} else {
					ret_flags = (1 << 4);
			} 
			break;
		}
		save_flags = ret_flags & track_flags & ((1 << 1) | (1 << 2));
		if (save_flags && last_slash > 0) {
			generatedBuf[last_slash] = (byte)'\0';
			generatedPath.setLen(last_slash);
			this.setFlags(save_flags);
		}  else if ((track_flags & (1 << 0)) && last_slash_dir > 0/*
				 * We have a separate test for the directory case,
				 * since it could be that we have found a symlink or a
				 * non-existing directory and the track_flags says
				 * that we cannot cache this fact, so the cache would
				 * then have been left empty in this case.
				 *
				 * But if we are allowed to track real directories, we
				 * can still cache the path components before the last
				 * one (the found symlink or non-existing component).
				 */) {
			generatedBuf[last_slash_dir] = (byte)'\0';
			generatedPath.setLen(last_slash_dir);
			this.setFlags((1 << 0));
		} else {
				cache.reset_lstat_cache();
		} 
		return match_len;
	}
	public int lstat_cache(Object name, int len, int track_flags, int prefix_len_stat_func) {
		int flags;
		(Object)cache.lstat_cache_matchlen(name, len, flags, track_flags, prefix_len_stat_func);
		return flags;
	}
	/*
	 * Return non-zero if path 'name' has a leading symlink component
	 */
	public int threaded_has_symlink_leading_path(Object name, int len) {
		return cache.lstat_cache(name, len, (1 << 2) | (1 << 0), 0) & (1 << 2/*
		 * Return non-zero if path 'name' has a leading symlink component
		 */);
	}
	public int threaded_check_leading_path(Object name, int len) {
		int flags;
		int match_len = cache.lstat_cache_matchlen(name, len, flags, (1 << 2) | (1 << 1) | (1 << 0), 0);
		if (flags & (1 << 1)) {
			return 0;
		}  else if (flags & (1 << 0)) {
			return -1;
		} else {
				return match_len/*
				 * Return non-zero if all path components of 'name' exists as a
				 * directory.  If prefix_len > 0, we will test with the stat()
				 * function instead of the lstat() function for a prefix length of
				 * 'prefix_len', thus we then allow for symlinks in the prefix part as
				 * long as those points to real existing directories.
				 */;
		} 
	}
	public int threaded_has_dirs_only_path(Object name, int len, int prefix_len) {
		return cache.lstat_cache(name, len, (1 << 0) | (1 << 5), prefix_len) & (1 << 0);
	}
	/*
	 * Returns the length (on a path component basis) of the longest
	 * common prefix match of 'name_a' and 'name_b'.
	 */
	public void cache_def_clear() {
		strbuf generatedPath = this.getPath();
		generatedPath.strbuf_release();
	}
	public strbuf getPath() {
		return path;
	}
	public void setPath(strbuf newPath) {
		path = newPath;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getTrack_flags() {
		return track_flags;
	}
	public void setTrack_flags(int newTrack_flags) {
		track_flags = newTrack_flags;
	}
	public int getPrefix_len_stat_func() {
		return prefix_len_stat_func;
	}
	public void setPrefix_len_stat_func(int newPrefix_len_stat_func) {
		prefix_len_stat_func = newPrefix_len_stat_func;
	}
}
