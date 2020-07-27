package application;

/*
 * File write-locks as used by Git.
 *
 * The lockfile API serves two purposes:
 *
 * * Mutual exclusion and atomic file updates. When we want to change
 *   a file, we create a lockfile `<filename>.lock`, write the new
 *   file contents into it, and then rename the lockfile to its final
 *   destination `<filename>`. We create the `<filename>.lock` file
 *   with `O_CREAT|O_EXCL` so that we can notice and fail if somebody
 *   else has already locked the file, then atomically rename the
 *   lockfile to its final destination to commit the changes and
 *   unlock the file.
 *
 * * Automatic cruft removal. If the program exits after we lock a
 *   file but before the changes have been committed, we want to make
 *   sure that we remove the lockfile. This is done by remembering the
 *   lockfiles we have created in a linked list and setting up an
 *   `atexit(3)` handler and a signal handler that clean up the
 *   lockfiles. This mechanism ensures that outstanding lockfiles are
 *   cleaned up if the program exits (including when `die()` is
 *   called) or if the program is terminated by a signal.
 *
 * Please note that lockfiles only block other writers. Readers do not
 * block, but they are guaranteed to see either the old contents of
 * the file or the new contents of the file (assuming that the
 * filesystem implements `rename(2)` atomically).
 *
 * Most of the heavy lifting is done by the tempfile module (see
 * "tempfile.h").
 *
 * Calling sequence
 * ----------------
 *
 * The caller:
 *
 * * Allocates a `struct lock_file` with whatever storage duration you
 *   desire. The struct does not have to be initialized before being
 *   used, but it is good practice to do so using by setting it to
 *   all-zeros (or using the LOCK_INIT macro). This puts the object in a
 *   consistent state that allows you to call rollback_lock_file() even
 *   if the lock was never taken (in which case it is a noop).
 *
 * * Attempts to create a lockfile by calling `hold_lock_file_for_update()`.
 *
 * * Writes new content for the destination file by either:
 *
 *   * writing to the file descriptor returned by the
 *     `hold_lock_file_for_*()` functions (also available via
 *     `lock->fd`).
 *
 *   * calling `fdopen_lock_file()` to get a `FILE` pointer for the
 *     open file and writing to the file using stdio.
 *
 *   Note that the file descriptor returned by hold_lock_file_for_update()
 *   is marked O_CLOEXEC, so the new contents must be written by the
 *   current process, not a spawned one.
 *
 * When finished writing, the caller can:
 *
 * * Close the file descriptor and rename the lockfile to its final
 *   destination by calling `commit_lock_file()` or
 *   `commit_lock_file_to()`.
 *
 * * Close the file descriptor and remove the lockfile by calling
 *   `rollback_lock_file()`.
 *
 * * Close the file descriptor without removing or renaming the
 *   lockfile by calling `close_lock_file_gently()`, and later call
 *   `commit_lock_file()`, `commit_lock_file_to()`,
 *   `rollback_lock_file()`, or `reopen_lock_file()`.
 *
 * After the lockfile is committed or rolled back, the `lock_file`
 * object can be discarded or reused.
 *
 * If the program exits before `commit_lock_file()`,
 * `commit_lock_file_to()`, or `rollback_lock_file()` is called, the
 * tempfile module will close and remove the lockfile, thereby rolling
 * back any uncommitted changes.
 *
 * If you need to close the file descriptor you obtained from a
 * `hold_lock_file_for_*()` function yourself, do so by calling
 * `close_lock_file_gently()`. See "tempfile.h" for more information.
 *
 *
 * Under the covers, a lockfile is just a tempfile with a few helper
 * functions. In particular, the state diagram and the cleanup
 * machinery are all implemented in the tempfile module.
 *
 *
 * Error handling
 * --------------
 *
 * The `hold_lock_file_for_*()` functions return a file descriptor on
 * success or -1 on failure (unless `LOCK_DIE_ON_ERROR` is used; see
 * "flags" below). On errors, `errno` describes the reason for
 * failure. Errors can be reported by passing `errno` to
 * `unable_to_lock_message()` or `unable_to_lock_die()`.
 *
 * Similarly, `commit_lock_file`, `commit_lock_file_to`, and
 * `close_lock_file` return 0 on success. On failure they set `errno`
 * appropriately and return -1. The `commit` variants (but not `close`)
 * do their best to delete the temporary file before returning.
 */
public class lock_file {
	private tempfile tempfile;
	
	public lock_file(tempfile tempfile) {
		setTempfile(tempfile);
	}
	public lock_file() {
	}
	
	/* Make sure errno contains a meaningful value on error */
	public int lock_file(Object path, int flags) {
		strbuf filename = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		filename.strbuf_addstr(path);
		if (!(flags & 2)) {
			filename.resolve_symlink();
		} 
		filename.strbuf_addstr(".lock");
		byte[] generatedBuf = filename.getBuf();
		tempfile tempfile = new tempfile();
		this.setTempfile(tempfile.create_tempfile(generatedBuf));
		filename.strbuf_release();
		tempfile generatedTempfile = this.getTempfile();
		Object generatedFd = generatedTempfile.getFd();
		return generatedTempfile ? generatedFd : -1/*
		 * Constants defining the gaps between attempts to lock a file. The
		 * first backoff period is approximately INITIAL_BACKOFF_MS
		 * milliseconds. The longest backoff period is approximately
		 * (BACKOFF_MAX_MULTIPLIER * INITIAL_BACKOFF_MS) milliseconds.
		 */;
	}
	/*
	 * Try locking path, retrying with quadratic backoff for at least
	 * timeout_ms milliseconds. If timeout_ms is 0, try locking the file
	 * exactly once. If timeout_ms is -1, try indefinitely.
	 */
	public int lock_file_timeout(Object path, int flags, long timeout_ms) {
		int n = 1;
		int multiplier = 1;
		long remaining_ms = 0;
		int random_initialized = 0;
		if (timeout_ms == 0) {
			return lk.lock_file(path, flags);
		} 
		if (!random_initialized) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/srand((int)/*Error: Function owner not recognized*/getpid());
			random_initialized = 1;
		} 
		if (timeout_ms > 0) {
			remaining_ms = timeout_ms;
		} 
		while (1) {
			long backoff_ms;
			long wait_ms;
			int fd;
			fd = lk.lock_file(path, flags);
			if (fd >= 0) {
				return /* success */fd;
			}  else if ((/*Error: Function owner not recognized*/_errno()) != 17) {
				return -/* failure other than lock held */1;
			}  else if (timeout_ms > 0 && remaining_ms <= 0) {
				return -/* failure due to timeout */1;
			} 
			backoff_ms = multiplier * -1024;
			wait_ms = (750 + /*Error: Function owner not recognized*/rand() % 500) * backoff_ms / /* back off for between 0.75*backoff_ms and 1.25*backoff_ms */1000;
			ModernizedCProgram.sleep_millisec(wait_ms);
			remaining_ms -= wait_ms;
			multiplier += 2 * n + /* Recursion: (n+1)^2 = n^2 + 2n + 1 */1;
			if (multiplier > 1000) {
				multiplier = 1000;
			} else {
					n++;
			} 
		}
	}
	/* This should return a meaningful errno on failure */
	public int hold_lock_file_for_update_timeout(Object path, int flags, long timeout_ms) {
		int fd = lk.lock_file_timeout(path, flags, timeout_ms);
		if (fd < 0) {
			if (flags & 1) {
				ModernizedCProgram.unable_to_lock_die(path, (/*Error: Function owner not recognized*/_errno()));
			} 
			if (flags & 4) {
				strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
				ModernizedCProgram.buf.unable_to_lock_message(path, (/*Error: Function owner not recognized*/_errno()));
				();
				ModernizedCProgram.buf.strbuf_release();
			} 
		} 
		return fd;
	}
	public Byte get_locked_file_path() {
		strbuf ret = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		tempfile generatedTempfile = this.getTempfile();
		ret.strbuf_addstr(generatedTempfile.get_tempfile_path());
		Object generatedLen = ret.getLen();
		byte[] generatedBuf = ret.getBuf();
		if (generatedLen <= 5 || /*Error: Function owner not recognized*/strcmp(generatedBuf + generatedLen - 5, ".lock")) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\lockfile.c", 196, "get_locked_file_path() called for malformed lock object");
		} 
		ret.strbuf_setlen(generatedLen - /* remove ".lock": */5);
		return ret.strbuf_detach(((Object)0));
	}
	public int commit_lock_file() {
		byte result_path = lk.get_locked_file_path();
		if (lk.commit_lock_file_to(result_path)) {
			int save_errno = (/*Error: Function owner not recognized*/_errno());
			ModernizedCProgram.free(result_path);
			(/*Error: Function owner not recognized*/_errno()) = save_errno;
			return -1;
		} 
		ModernizedCProgram.free(result_path);
		return 0;
	}
	public int commit_locked_index() {
		if (ModernizedCProgram.alternate_index_output) {
			return lk.commit_lock_file_to(ModernizedCProgram.alternate_index_output);
		} else {
				return lk.commit_lock_file();
		} 
	}
	public void setup_alternate_shallow(Object alternate_shallow_file, Object extra) {
		strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int fd;
		fd = shallow_lock.hold_lock_file_for_update(ModernizedCProgram.the_repository.git_path_shallow(), 1);
		ModernizedCProgram.the_repository.check_shallow_file_for_update();
		byte[] generatedBuf = sb.getBuf();
		Object generatedLen = sb.getLen();
		if (sb.write_shallow_commits(0, extra)) {
			if (ModernizedCProgram.write_in_full(fd, generatedBuf, generatedLen) < 0) {
				ModernizedCProgram.die_errno("failed to write to %s", shallow_lock.get_lock_file_path());
			} 
			alternate_shallow_file = shallow_lock/*
					 * is_repository_shallow() sees empty string as "no
					 * shallow file".
					 */.get_lock_file_path();
		} else {
				alternate_shallow_file = "";
		} 
		sb.strbuf_release();
	}
	public int hold_lock_file_for_update(Object path, int flags) {
		return lk.hold_lock_file_for_update_timeout(path, flags, 0/*
		 * Return a nonzero value iff `lk` is currently locked.
		 */);
	}
	public int is_lock_file_locked() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.is_tempfile_active();
	}
	public Object fdopen_lock_file(Object mode) {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.fdopen_tempfile(mode/*
		 * Return the path of the lockfile. The return value is a pointer to a
		 * field within the lock_file object and should not be freed.
		 */);
	}
	public Object get_lock_file_path() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.get_tempfile_path();
	}
	public int get_lock_file_fd() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.get_tempfile_fd();
	}
	public Object get_lock_file_fp() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.get_tempfile_fp();
	}
	public int close_lock_file_gently() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.close_tempfile_gently();
	}
	public int reopen_lock_file() {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.reopen_tempfile();
	}
	public int commit_lock_file_to(Object path) {
		tempfile generatedTempfile = this.getTempfile();
		return generatedTempfile.rename_tempfile(path/*
		 * Roll back `lk`: close the file descriptor and/or file pointer and
		 * remove the lockfile. It is a NOOP to call `rollback_lock_file()`
		 * for a `lock_file` object that has already been committed or rolled
		 * back.
		 */);
	}
	public void rollback_lock_file() {
		tempfile generatedTempfile = this.getTempfile();
		generatedTempfile.delete_tempfile();
	}
	public tempfile getTempfile() {
		return tempfile;
	}
	public void setTempfile(tempfile newTempfile) {
		tempfile = newTempfile;
	}
}
/*
 * Attempt to create a lockfile for the file at `path` and return a
 * file descriptor for writing to it, or -1 on error. The flags
 * argument and error handling are described above.
 */
