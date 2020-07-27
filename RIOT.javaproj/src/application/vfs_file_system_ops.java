package application;

public class vfs_file_system_ops {
	private Object format;
	private Object mount;
	private Object umount;
	private Object rename;
	private Object unlink;
	private Object mkdir;
	private Object rmdir;
	private Object stat;
	private Object statvfs;
	private Object fstatvfs;
	
	public vfs_file_system_ops(Object format, Object mount, Object umount, Object rename, Object unlink, Object mkdir, Object rmdir, Object stat, Object statvfs, Object fstatvfs) {
		setFormat(format);
		setMount(mount);
		setUmount(umount);
		setRename(rename);
		setUnlink(unlink);
		setMkdir(mkdir);
		setRmdir(rmdir);
		setStat(stat);
		setStatvfs(statvfs);
		setFstatvfs(fstatvfs);
	}
	public vfs_file_system_ops() {
	}
	
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getMount() {
		return mount;
	}
	public void setMount(Object newMount) {
		mount = newMount;
	}
	public Object getUmount() {
		return umount;
	}
	public void setUmount(Object newUmount) {
		umount = newUmount;
	}
	public Object getRename() {
		return rename;
	}
	public void setRename(Object newRename) {
		rename = newRename;
	}
	public Object getUnlink() {
		return unlink;
	}
	public void setUnlink(Object newUnlink) {
		unlink = newUnlink;
	}
	public Object getMkdir() {
		return mkdir;
	}
	public void setMkdir(Object newMkdir) {
		mkdir = newMkdir;
	}
	public Object getRmdir() {
		return rmdir;
	}
	public void setRmdir(Object newRmdir) {
		rmdir = newRmdir;
	}
	public Object getStat() {
		return stat;
	}
	public void setStat(Object newStat) {
		stat = newStat;
	}
	public Object getStatvfs() {
		return statvfs;
	}
	public void setStatvfs(Object newStatvfs) {
		statvfs = newStatvfs;
	}
	public Object getFstatvfs() {
		return fstatvfs;
	}
	public void setFstatvfs(Object newFstatvfs) {
		fstatvfs = newFstatvfs;
	}
}
/**
 * @brief struct @c vfs_mount_struct typedef
 */
/**
     * @brief Format the file system on the given mount point
     *
     * @param[in]   mountp  file system to format
     *
     * @return 0 on success
     * @return <0 on error
     */
