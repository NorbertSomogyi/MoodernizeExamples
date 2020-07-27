package application;

public class vfs_dir_ops {
	private Object opendir;
	private Object readdir;
	private Object closedir;
	
	public vfs_dir_ops(Object opendir, Object readdir, Object closedir) {
		setOpendir(opendir);
		setReaddir(readdir);
		setClosedir(closedir);
	}
	public vfs_dir_ops() {
	}
	
	public Object getOpendir() {
		return opendir;
	}
	public void setOpendir(Object newOpendir) {
		opendir = newOpendir;
	}
	public Object getReaddir() {
		return readdir;
	}
	public void setReaddir(Object newReaddir) {
		readdir = newReaddir;
	}
	public Object getClosedir() {
		return closedir;
	}
	public void setClosedir(Object newClosedir) {
		closedir = newClosedir;
	}
}
/**
 * @brief struct @c vfs_file_system_ops typedef
 */
/**
     * @brief Open a directory for reading with readdir
     *
     * @param[in]  dirp     pointer to open directory
     * @param[in]  name     null-terminated name of the dir to open, relative to the file system root, including a leading slash
     * @param[in]  abs_path null-terminated name of the dir to open, relative to the VFS root ("/")
     *
     * @return 0 on success
     * @return <0 on error
     */
