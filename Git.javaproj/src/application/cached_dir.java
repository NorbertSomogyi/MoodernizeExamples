package application;

/*
 * Support data structure for our opendir/readdir/closedir wrappers
 */
public class cached_dir {
	private  fdir;
	private untracked_cache_dir[] untracked;
	private int nr_files;
	private int nr_dirs;
	private dirent de;
	private Object file;
	private untracked_cache_dir ucd;
	
	public cached_dir( fdir, untracked_cache_dir[] untracked, int nr_files, int nr_dirs, dirent de, Object file, untracked_cache_dir ucd) {
		setFdir(fdir);
		setUntracked(untracked);
		setNr_files(nr_files);
		setNr_dirs(nr_dirs);
		setDe(de);
		setFile(file);
		setUcd(ucd);
	}
	public cached_dir() {
	}
	
	public int read_cached_dir() {
		 generatedFdir = this.getFdir();
		dirent dirent = new dirent();
		dirent generatedDe = this.getDe();
		if (generatedFdir) {
			this.setDe(dirent.readdir(generatedFdir));
			if (!generatedDe) {
				return -1;
			} 
			return 0;
		} 
		int generatedNr_dirs = this.getNr_dirs();
		untracked_cache_dir[] generatedUntracked = this.getUntracked();
		int generatedDirs_nr = generatedUntracked.getDirs_nr();
		untracked_cache_dir[][] generatedDirs = generatedUntracked.getDirs();
		int generatedRecurse = d.getRecurse();
		while (generatedNr_dirs < generatedDirs_nr) {
			untracked_cache_dir d = generatedDirs[generatedNr_dirs];
			if (!generatedRecurse) {
				generatedNr_dirs++;
				continue;
			} 
			this.setUcd(d);
			generatedNr_dirs++;
			return 0;
		}
		this.setUcd(((Object)0));
		int generatedNr_files = this.getNr_files();
		int generatedUntracked_nr = generatedUntracked.getUntracked_nr();
		if (generatedNr_files < generatedUntracked_nr) {
			untracked_cache_dir d = generatedUntracked;
			this.setFile(generatedUntracked[generatedNr_files++]);
			return 0;
		} 
		return -1;
	}
	public void close_cached_dir() {
		 generatedFdir = this.getFdir();
		if (generatedFdir) {
			generatedFdir.closedir();
		} 
		untracked_cache_dir[] generatedUntracked = this.getUntracked();
		if (generatedUntracked) {
			generatedUntracked.setValid(1);
			generatedUntracked.setRecurse(1/*
			 * Read a directory tree. We currently ignore anything but
			 * directories, regular files and symlinks. That's because git
			 * doesn't handle them at all yet. Maybe that will change some
			 * day.
			 *
			 * Also, we ignore the name ".git" (even if it is not a directory).
			 * That likely will not change.
			 *
			 * If 'stop_at_first_file' is specified, 'path_excluded' is returned
			 * to signal that a file was found. This is the least significant value that
			 * indicates that a file was encountered that does not depend on the order of
			 * whether an untracked or exluded path was encountered first.
			 *
			 * Returns the most significant path_treatment value encountered in the scan.
			 * If 'stop_at_first_file' is specified, `path_excluded` is the most
			 * significant path_treatment value that will be returned.
			 */);
		} 
	}
	public  getFdir() {
		return fdir;
	}
	public void setFdir( newFdir) {
		fdir = newFdir;
	}
	public untracked_cache_dir[] getUntracked() {
		return untracked;
	}
	public void setUntracked(untracked_cache_dir[] newUntracked) {
		untracked = newUntracked;
	}
	public int getNr_files() {
		return nr_files;
	}
	public void setNr_files(int newNr_files) {
		nr_files = newNr_files;
	}
	public int getNr_dirs() {
		return nr_dirs;
	}
	public void setNr_dirs(int newNr_dirs) {
		nr_dirs = newNr_dirs;
	}
	public dirent getDe() {
		return de;
	}
	public void setDe(dirent newDe) {
		de = newDe;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public untracked_cache_dir getUcd() {
		return ucd;
	}
	public void setUcd(untracked_cache_dir newUcd) {
		ucd = newUcd;
	}
}
