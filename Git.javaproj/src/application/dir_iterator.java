package application;

/*
 * Iterate over a directory tree.
 *
 * Iterate over a directory tree, recursively, including paths of all
 * types and hidden paths. Skip "." and ".." entries and don't follow
 * symlinks except for the original path. Note that the original path
 * is not included in the iteration.
 *
 * Every time dir_iterator_advance() is called, update the members of
 * the dir_iterator structure to reflect the next path in the
 * iteration. The order that paths are iterated over within a
 * directory is undefined, directory paths are always given before
 * their contents.
 *
 * A typical iteration looks like this:
 *
 *     int ok;
 *     unsigned int flags = DIR_ITERATOR_PEDANTIC;
 *     struct dir_iterator *iter = dir_iterator_begin(path, flags);
 *
 *     if (!iter)
 *             goto error_handler;
 *
 *     while ((ok = dir_iterator_advance(iter)) == ITER_OK) {
 *             if (want_to_stop_iteration()) {
 *                     ok = dir_iterator_abort(iter);
 *                     break;
 *             }
 *
 *             // Access information about the current path:
 *             if (S_ISDIR(iter->st.st_mode))
 *                     printf("%s is a directory\n", iter->relative_path);
 *     }
 *
 *     if (ok != ITER_DONE)
 *             handle_error();
 *
 * Callers are allowed to modify iter->path while they are working,
 * but they must restore it to its original contents before calling
 * dir_iterator_advance() again.
 */
/*
 * Flags for dir_iterator_begin:
 *
 * - DIR_ITERATOR_PEDANTIC: override dir-iterator's default behavior
 *   in case of an error at dir_iterator_advance(), which is to keep
 *   looking for a next valid entry. With this flag, resources are freed
 *   and ITER_ERROR is returned immediately. In both cases, a meaningful
 *   warning is emitted. Note: ENOENT errors are always ignored so that
 *   the API users may remove files during iteration.
 *
 * - DIR_ITERATOR_FOLLOW_SYMLINKS: make dir-iterator follow symlinks.
 *   i.e., linked directories' contents will be iterated over and
 *   iter->base.st will contain information on the referred files,
 *   not the symlinks themselves, which is the default behavior. Broken
 *   symlinks are ignored.
 *
 * Warning: circular symlinks are also followed when
 * DIR_ITERATOR_FOLLOW_SYMLINKS is set. The iteration may end up with
 * an ELOOP if they happen and DIR_ITERATOR_PEDANTIC is set.
 */
public class dir_iterator {
	private strbuf path;
	private Object relative_path;
	private Object basename;
	private stat st;
	
	public dir_iterator(strbuf path, Object relative_path, Object basename, stat st) {
		setPath(path);
		setRelative_path(relative_path);
		setBasename(basename);
		setSt(st);
	}
	public dir_iterator() {
	}
	
	public int dir_iterator_advance() {
		dir_iterator_int iter = (dir_iterator_int)dir_iterator;
		dir_iterator generatedBase = iter.getBase();
		stat generatedSt = generatedBase.getSt();
		Object generatedSt_mode = generatedSt.getSt_mode();
		int generatedFlags = iter.getFlags();
		Object generatedLevels_nr = iter.getLevels_nr();
		if ((((generatedSt_mode) & -1024) == -1024) && iter.push_level()) {
			if ((._errno()) != 2 && generatedFlags & (1 << 0)) {
				;
			} 
			if (generatedLevels_nr == 0) {
				;
			} 
		} 
		dir_iterator_level generatedLevels = iter.getLevels();
		strbuf generatedPath = generatedBase.getPath();
		Object generatedPrefix_len = level.getPrefix_len();
		 generatedDir = level.getDir();
		dirent dirent = new dirent();
		byte generatedBuf = generatedPath.getBuf();
		Object generatedD_name = de.getD_name();
		while (/* Loop until we find an entry that we can give back to the caller. */1) {
			dirent de = new dirent();
			dir_iterator_level level = generatedLevels[generatedLevels_nr - 1];
			generatedPath.strbuf_setlen(generatedPrefix_len);
			(._errno()) = 0;
			de = dirent.readdir(generatedDir);
			if (!de) {
				if ((._errno())) {
					ModernizedCProgram.warning_errno("error reading directory '%s'", generatedBuf);
					if (generatedFlags & (1 << 0)) {
						;
					} 
				}  else if (iter.pop_level() == 0) {
					return dir_iterator.dir_iterator_abort();
				} 
				continue;
			} 
			if (ModernizedCProgram.is_dot_or_dotdot(generatedD_name)) {
				continue;
			} 
			if (ModernizedCProgram.prepare_next_entry_data(iter, de)) {
				if ((._errno()) != 2 && generatedFlags & (1 << 0)) {
					;
				} 
				continue;
			} 
			return 0;
		}
		return -2;
	}
	public int dir_iterator_abort() {
		dir_iterator_int iter = (dir_iterator_int)dir_iterator;
		Object generatedLevels_nr = iter.getLevels_nr();
		dir_iterator_level generatedLevels = iter.getLevels();
		 generatedDir = level.getDir();
		dir_iterator generatedBase = iter.getBase();
		strbuf generatedPath = generatedBase.getPath();
		Object generatedPrefix_len = level.getPrefix_len();
		byte generatedBuf = generatedPath.getBuf();
		for (; generatedLevels_nr; generatedLevels_nr--) {
			dir_iterator_level level = generatedLevels[generatedLevels_nr - 1];
			if (generatedDir && generatedDir.closedir()) {
				int saved_errno = (._errno());
				generatedPath.strbuf_setlen(generatedPrefix_len);
				(._errno()) = saved_errno;
				ModernizedCProgram.warning_errno("error closing directory '%s'", generatedBuf);
			} 
		}
		ModernizedCProgram.free(generatedLevels);
		generatedPath.strbuf_release();
		ModernizedCProgram.free(iter);
		return -1;
	}
	public dir_iterator dir_iterator_begin(Object path, int flags) {
		dir_iterator_int iter = ModernizedCProgram.xcalloc(1, );
		dir_iterator generatedBase = iter.getBase();
		dir_iterator dir_iterator = generatedBase;
		int saved_errno;
		strbuf generatedPath = generatedBase.getPath();
		generatedPath.strbuf_init(260);
		generatedPath.strbuf_addstr(path);
		Object generatedLevels_alloc = iter.getLevels_alloc();
		dir_iterator_level generatedLevels = iter.getLevels();
		do {
			if ((true) > generatedLevels_alloc) {
				if ((((generatedLevels_alloc) + 16) * 3 / 2) < (true)) {
					iter.setLevels_alloc((true));
				} else {
						iter.setLevels_alloc((((generatedLevels_alloc) + 16) * 3 / 2));
				} 
				(generatedLevels) = ModernizedCProgram.xrealloc((generatedLevels), ModernizedCProgram.st_mult(, (generatedLevels_alloc)));
			} 
		} while (0);
		iter.setLevels_nr(0);
		iter.setFlags(flags/*
			 * Note: stat already checks for NULL or empty strings and
			 * inexistent paths.
			 */);
		byte generatedBuf = generatedPath.getBuf();
		stat generatedSt = generatedBase.getSt();
		if (.stat(generatedBuf, generatedSt) < 0) {
			saved_errno = (._errno());
			;
		} 
		Object generatedSt_mode = generatedSt.getSt_mode();
		if (!(((generatedSt_mode) & -1024) == -1024)) {
			saved_errno = 20;
			;
		} 
		return dir_iterator;
		(._errno()) = saved_errno;
		return ((Object)0);
	}
	public strbuf getPath() {
		return path;
	}
	public void setPath(strbuf newPath) {
		path = newPath;
	}
	public Object getRelative_path() {
		return relative_path;
	}
	public void setRelative_path(Object newRelative_path) {
		relative_path = newRelative_path;
	}
	public Object getBasename() {
		return basename;
	}
	public void setBasename(Object newBasename) {
		basename = newBasename;
	}
	public stat getSt() {
		return st;
	}
	public void setSt(stat newSt) {
		st = newSt;
	}
}
/* The current path: */
/*
 * Advance the iterator to the first or next item and return ITER_OK.
 * If the iteration is exhausted, free the dir_iterator and any
 * resources associated with it and return ITER_DONE.
 *
 * It is a bug to use iterator or call this function again after it
 * has returned ITER_DONE or ITER_ERROR (which may be returned iff
 * the DIR_ITERATOR_PEDANTIC flag was set).
 */
