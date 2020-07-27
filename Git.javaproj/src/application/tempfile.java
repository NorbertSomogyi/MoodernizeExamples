package application;

/*
 * Handle temporary files.
 *
 * The tempfile API allows temporary files to be created, deleted, and
 * atomically renamed. Temporary files that are still active when the
 * program ends are cleaned up automatically. Lockfiles (see
 * "lockfile.h") are built on top of this API.
 *
 *
 * Calling sequence
 * ----------------
 *
 * The caller:
 *
 * * Attempts to create a temporary file by calling
 *   `create_tempfile()`. The resources used for the temporary file are
 *   managed by the tempfile API.
 *
 * * Writes new content to the file by either:
 *
 *   * writing to the `tempfile->fd` file descriptor
 *
 *   * calling `fdopen_tempfile()` to get a `FILE` pointer for the
 *     open file and writing to the file using stdio.
 *
 *   Note that the file descriptor created by create_tempfile()
 *   is marked O_CLOEXEC, so the new contents must be written by
 *   the current process, not any spawned one.
 *
 * When finished writing, the caller can:
 *
 * * Close the file descriptor and remove the temporary file by
 *   calling `delete_tempfile()`.
 *
 * * Close the temporary file and rename it atomically to a specified
 *   filename by calling `rename_tempfile()`. This relinquishes
 *   control of the file.
 *
 * * Close the file descriptor without removing or renaming the
 *   temporary file by calling `close_tempfile_gently()`, and later call
 *   `delete_tempfile()` or `rename_tempfile()`.
 *
 * After the temporary file is renamed or deleted, the `tempfile`
 * object is no longer valid and should not be reused.
 *
 * If the program exits before `rename_tempfile()` or
 * `delete_tempfile()` is called, an `atexit(3)` handler will close
 * and remove the temporary file.
 *
 * If you need to close the file descriptor yourself, do so by calling
 * `close_tempfile_gently()`. You should never call `close(2)` or `fclose(3)`
 * yourself, otherwise the `struct tempfile` structure would still
 * think that the file descriptor needs to be closed, and a later
 * cleanup would result in duplicate calls to `close(2)`. Worse yet,
 * if you close and then later open another file descriptor for a
 * completely different purpose, then the unrelated file descriptor
 * might get closed.
 *
 *
 * Error handling
 * --------------
 *
 * `create_tempfile()` returns an allocated tempfile on success or NULL
 * on failure. On errors, `errno` describes the reason for failure.
 *
 * `rename_tempfile()` and `close_tempfile_gently()` return 0 on success.
 * On failure they set `errno` appropriately and return -1.
 * `delete_tempfile()` and `rename` (but not `close`) do their best to
 * delete the temporary file before returning.
 */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
/* See "mks_tempfile functions" above. */
public class tempfile {
	private Object list;
	private Object active;
	private Object fd;
	private Object fp;
	private Object owner;
	private strbuf filename;
	
	public tempfile(Object list, Object active, Object fd, Object fp, Object owner, strbuf filename) {
		setList(list);
		setActive(active);
		setFd(fd);
		setFp(fp);
		setOwner(owner);
		setFilename(filename);
	}
	public tempfile() {
	}
	
	public tempfile mks_tempfile_s(Object filename_template, int suffixlen) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_sm(filename_template, suffixlen, 600);
	}
	public tempfile mks_tempfile_m(Object filename_template, int mode) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_sm(filename_template, 0, mode);
	}
	public tempfile mks_tempfile(Object filename_template) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_sm(filename_template, 0, 600);
	}
	public tempfile mks_tempfile_ts(Object filename_template, int suffixlen) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_tsm(filename_template, suffixlen, 600);
	}
	public tempfile mks_tempfile_tm(Object filename_template, int mode) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_tsm(filename_template, 0, mode);
	}
	public tempfile mks_tempfile_t(Object filename_template) {
		tempfile tempfile = new tempfile();
		return tempfile.mks_tempfile_tsm(filename_template, 0, 600);
	}
	public tempfile xmks_tempfile(Object filename_template) {
		tempfile tempfile = new tempfile();
		return tempfile.xmks_tempfile_m(filename_template, 600/*
		 * Associate a stdio stream with the temporary file (which must still
		 * be open). Return `NULL` (*without* deleting the file) on error. The
		 * stream is closed automatically when `close_tempfile_gently()` is called or
		 * when the file is deleted or renamed.
		 */);
	}
	public int is_tempfile_active() {
		Object generatedActive = this.getActive();
		return tempfile && generatedActive;
	}
	public tempfile new_tempfile() {
		tempfile tempfile = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		tempfile.setFd(-1);
		tempfile.setFp(((Object)0));
		tempfile.setActive(0);
		tempfile.setOwner(0);
		Object generatedList = tempfile.getList();
		(generatedList).setNext((generatedList).setPrev((generatedList)));
		strbuf generatedFilename = tempfile.getFilename();
		generatedFilename.strbuf_init(0);
		return tempfile;
	}
	public void activate_tempfile() {
		int initialized;
		if (tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 111, "activate_tempfile called for active object");
		} 
		if (!initialized) {
			ModernizedCProgram.sigchain_push_common(remove_tempfiles_on_signal);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/atexit(remove_tempfiles_on_exit);
			initialized = 1;
		} 
		Object generatedList = this.getList();
		ModernizedCProgram.volatile_list_add(generatedList, ModernizedCProgram.tempfile_list);
		this.setOwner(/*Error: Function owner not recognized*/getpid());
		this.setActive(1);
	}
	public void deactivate_tempfile() {
		this.setActive(0);
		strbuf generatedFilename = this.getFilename();
		generatedFilename.strbuf_release();
		Object generatedList = this.getList();
		ModernizedCProgram.volatile_list_del(generatedList);
		ModernizedCProgram.free(tempfile);
	}
	public tempfile create_tempfile(Object path) {
		tempfile tempfile = new tempfile();
		tempfile tempfile = tempfile.new_tempfile();
		strbuf generatedFilename = tempfile.getFilename();
		generatedFilename.strbuf_add_absolute_path(path);
		byte[] generatedBuf = generatedFilename.getBuf();
		tempfile.setFd(/*Error: Function owner not recognized*/open(generatedBuf, 2 | -1024 | -1024 | 0, 666));
		Object generatedFd = tempfile.getFd();
		if (false && generatedFd < 0 && (/*Error: Function owner not recognized*/_errno()) == 22) {
			tempfile.setFd(/*Error: Function owner not recognized*/open(generatedBuf, 2 | -1024 | -1024, 666));
		} 
		if (generatedFd < 0) {
			tempfile.deactivate_tempfile();
			return ((Object)0);
		} 
		tempfile.activate_tempfile();
		if (ModernizedCProgram.adjust_shared_perm(generatedBuf)) {
			int save_errno = (/*Error: Function owner not recognized*/_errno());
			();
			tempfile.delete_tempfile();
			(/*Error: Function owner not recognized*/_errno()) = save_errno;
			return ((Object)0);
		} 
		return tempfile;
	}
	public tempfile register_tempfile(Object path) {
		tempfile tempfile = new tempfile();
		tempfile tempfile = tempfile.new_tempfile();
		strbuf generatedFilename = tempfile.getFilename();
		generatedFilename.strbuf_add_absolute_path(path);
		tempfile.activate_tempfile();
		return tempfile;
	}
	public tempfile mks_tempfile_sm(Object filename_template, int suffixlen, int mode) {
		tempfile tempfile = new tempfile();
		tempfile tempfile = tempfile.new_tempfile();
		strbuf generatedFilename = tempfile.getFilename();
		generatedFilename.strbuf_add_absolute_path(filename_template);
		byte[] generatedBuf = generatedFilename.getBuf();
		tempfile.setFd(ModernizedCProgram.git_mkstemps_mode(generatedBuf, suffixlen, mode));
		Object generatedFd = tempfile.getFd();
		if (generatedFd < 0) {
			tempfile.deactivate_tempfile();
			return ((Object)0);
		} 
		tempfile.activate_tempfile();
		return tempfile;
	}
	public tempfile mks_tempfile_tsm(Object filename_template, int suffixlen, int mode) {
		tempfile tempfile = new tempfile();
		tempfile tempfile = tempfile.new_tempfile();
		byte tmpdir;
		tmpdir = /*Error: Function owner not recognized*/getenv("TMPDIR");
		if (!tmpdir) {
			tmpdir = "/tmp";
		} 
		strbuf generatedFilename = tempfile.getFilename();
		generatedFilename.strbuf_addf("%s/%s", tmpdir, filename_template);
		byte[] generatedBuf = generatedFilename.getBuf();
		tempfile.setFd(ModernizedCProgram.git_mkstemps_mode(generatedBuf, suffixlen, mode));
		Object generatedFd = tempfile.getFd();
		if (generatedFd < 0) {
			tempfile.deactivate_tempfile();
			return ((Object)0);
		} 
		tempfile.activate_tempfile();
		return tempfile;
	}
	public tempfile xmks_tempfile_m(Object filename_template, int mode) {
		tempfile tempfile = new tempfile();
		strbuf full_template = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		full_template.strbuf_add_absolute_path(filename_template);
		byte[] generatedBuf = full_template.getBuf();
		tempfile tempfile = new tempfile();
		tempfile = tempfile.mks_tempfile_m(generatedBuf, mode);
		if (!tempfile) {
			ModernizedCProgram.die_errno("Unable to create temporary file '%s'", generatedBuf);
		} 
		full_template.strbuf_release();
		return tempfile;
	}
	public _iobuf fdopen_tempfile(Object mode) {
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 219, "fdopen_tempfile() called for inactive object");
		} 
		Object generatedFp = this.getFp();
		if (generatedFp) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 221, "fdopen_tempfile() called for open object");
		} 
		Object generatedFd = this.getFd();
		this.setFp(/*Error: Function owner not recognized*/fdopen(generatedFd, mode));
		return generatedFp;
	}
	public Object get_tempfile_path() {
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 230, "get_tempfile_path() called for inactive object");
		} 
		strbuf generatedFilename = this.getFilename();
		byte[] generatedBuf = generatedFilename.getBuf();
		return generatedBuf;
	}
	public int get_tempfile_fd() {
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 237, "get_tempfile_fd() called for inactive object");
		} 
		Object generatedFd = this.getFd();
		return generatedFd;
	}
	public _iobuf get_tempfile_fp() {
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 244, "get_tempfile_fp() called for inactive object");
		} 
		Object generatedFp = this.getFp();
		return generatedFp;
	}
	public int close_tempfile_gently() {
		int fd;
		FILE fp = new FILE();
		int err;
		Object generatedFd = this.getFd();
		if (!tempfile.is_tempfile_active() || generatedFd < 0) {
			return 0;
		} 
		fd = generatedFd;
		Object generatedFp = this.getFp();
		fp = generatedFp;
		this.setFd(-1);
		Object generated_flag = (fp).get_flag();
		if (fp) {
			this.setFp(((Object)0));
			if ((generated_flag & -1024)) {
				err = -1;
				if (!/*Error: Function owner not recognized*/fclose(fp)) {
					(/*Error: Function owner not recognized*/_errno()) = 5;
				} 
			} else {
					err = /*Error: Function owner not recognized*/fclose(fp);
			} 
		} else {
				err = /*Error: Function owner not recognized*/close(fd);
		} 
		return err ? -1 : 0;
	}
	public int reopen_tempfile() {
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 279, "reopen_tempfile called for an inactive object");
		} 
		Object generatedFd = this.getFd();
		if (0 <= generatedFd) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 281, "reopen_tempfile called for an open object");
		} 
		strbuf generatedFilename = this.getFilename();
		byte[] generatedBuf = generatedFilename.getBuf();
		this.setFd(/*Error: Function owner not recognized*/open(generatedBuf, 1 | -1024));
		return generatedFd;
	}
	public int rename_tempfile(Object path) {
		tempfile tempfile = tempfile_p;
		if (!tempfile.is_tempfile_active()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tempfile.c", 291, "rename_tempfile called for inactive object");
		} 
		if (tempfile.close_tempfile_gently()) {
			tempfile_p.delete_tempfile();
			return -1;
		} 
		strbuf generatedFilename = tempfile.getFilename();
		byte[] generatedBuf = generatedFilename.getBuf();
		if (/*Error: Function owner not recognized*/rename(generatedBuf, path)) {
			int save_errno = (/*Error: Function owner not recognized*/_errno());
			tempfile_p.delete_tempfile();
			(/*Error: Function owner not recognized*/_errno()) = save_errno;
			return -1;
		} 
		tempfile.deactivate_tempfile();
		tempfile_p = ((Object)0);
		return 0;
	}
	public void delete_tempfile() {
		tempfile tempfile = tempfile_p;
		if (!tempfile.is_tempfile_active()) {
			return /*Error: Unsupported expression*/;
		} 
		tempfile.close_tempfile_gently();
		strbuf generatedFilename = tempfile.getFilename();
		byte[] generatedBuf = generatedFilename.getBuf();
		ModernizedCProgram.unlink_or_warn(generatedBuf);
		tempfile.deactivate_tempfile();
		tempfile_p = ((Object)0);
	}
	public Object getList() {
		return list;
	}
	public void setList(Object newList) {
		list = newList;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getFd() {
		return fd;
	}
	public void setFd(Object newFd) {
		fd = newFd;
	}
	public Object getFp() {
		return fp;
	}
	public void setFp(Object newFp) {
		fp = newFp;
	}
	public Object getOwner() {
		return owner;
	}
	public void setOwner(Object newOwner) {
		owner = newOwner;
	}
	public strbuf getFilename() {
		return filename;
	}
	public void setFilename(strbuf newFilename) {
		filename = newFilename;
	}
}
/*
 * Register an existing file as a tempfile, meaning that it will be
 * deleted when the program exits. The tempfile is considered closed,
 * but it can be worked with like any other closed tempfile (for
 * example, it can be opened using reopen_tempfile()).
 */
/*
 * mks_tempfile functions
 *
 * The following functions attempt to create and open temporary files
 * with names derived automatically from a template, in the manner of
 * mkstemps(), and arrange for them to be deleted if the program ends
 * before they are deleted explicitly. There is a whole family of such
 * functions, named according to the following pattern:
 *
 *     x?mks_tempfile_t?s?m?()
 *
 * The optional letters have the following meanings:
 *
 *   x - die if the temporary file cannot be created.
 *
 *   t - create the temporary file under $TMPDIR (as opposed to
 *       relative to the current directory). When these variants are
 *       used, template should be the pattern for the filename alone,
 *       without a path.
 *
 *   s - template includes a suffix that is suffixlen characters long.
 *
 *   m - the temporary file should be created with the specified mode
 *       (otherwise, the mode is set to 0600).
 *
 * None of these functions modify template. If the caller wants to
 * know the (absolute) path of the file that was created, it can be
 * read from tempfile->filename.
 *
 * On success, the functions return a tempfile whose "fd" member is open
 * for writing the temporary file. On errors, they return NULL and set
 * errno appropriately (except for the "x" variants, which die() on
 * errors).
 */
