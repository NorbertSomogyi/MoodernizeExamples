package application;

/* not struct vfs_mount because of name collision with the function */
public class vfs_mount_struct {
	private Object list_entry;
	private Object fs;
	private Object[] mount_point;
	private Object mount_point_len;
	private Object open_files;
	private Object private_data;
	
	public vfs_mount_struct(Object list_entry, Object fs, Object[] mount_point, Object mount_point_len, Object open_files, Object private_data) {
		setList_entry(list_entry);
		setFs(fs);
		setMount_point(mount_point);
		setMount_point_len(mount_point_len);
		setOpen_files(open_files);
		setPrivate_data(private_data);
	}
	public vfs_mount_struct() {
	}
	
	public int check_mount() {
		Object generatedFs = this.getFs();
		Object[] generatedMount_point = this.getMount_point();
		if ((mountp == ((Object)0)) || (generatedFs == ((Object)0)) || (generatedMount_point == ((Object)0))) {
			return -22;
		} 
		Object generatedPrivate_data = this.getPrivate_data();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mount: -> \"%s\" (%p), %p\n", generatedMount_point, (Object)generatedMount_point, generatedPrivate_data);
		if (generatedMount_point[0] != (byte)'/') {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs: check_mount: not absolute mount_point path\n");
			return -22;
		} 
		this.setMount_point_len(/*Error: Function owner not recognized*/strlen(generatedMount_point));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._mount_mutex);
		Object generatedList_entry = this.getList_entry();
		 found = /*Error: Function owner not recognized*/clist_find(ModernizedCProgram._vfs_mounts_list, generatedList_entry);
		if (found != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(/* Same mount is already mounted */ModernizedCProgram._mount_mutex);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs: check_mount: Already mounted\n");
			return -16;
		} 
		return 0;
	}
	public int vfs_format() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_format: %p\n", (Object)mountp);
		int ret = mountp.check_mount();
		if (ret < 0) {
			return ret;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
		Object generatedFs = this.getFs();
		if (generatedFs.getFs_op() != ((Object)0)) {
			if (generatedFs.getFs_op().getFormat() != ((Object)0)) {
				return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp);
			} 
		} 
		return -/* Format operation not supported */ENOTSUP;
	}
	public int vfs_mount() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mount: %p\n", (Object)mountp);
		int ret = mountp.check_mount();
		if (ret < 0) {
			return ret;
		} 
		Object generatedFs = this.getFs();
		if (generatedFs.getFs_op() != ((Object)0)) {
			if (generatedFs.getFs_op().getMount() != ((Object)0)) {
				int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/* yes, a file system driver does not need to implement mount/umount */mountp);
				if (res < 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mount: error %d\n", res);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
					return res;
				} 
			} 
		} 
		Object generatedList_entry = this.getList_entry();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clist_rpush(ModernizedCProgram._vfs_mounts_list, generatedList_entry);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mount: mount done\n");
		return 0;
	}
	public int vfs_umount() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_umount: %p\n", (Object)mountp);
		int ret = mountp.check_mount();
		switch (ret) {
		case -16/* -EBUSY returned when fs is mounted, just continue */:
				break;
		case 0:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_umount: not mounted\n");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
				return -22;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_umount: invalid fs\n");
				return -22;
		}
		Object[] generatedMount_point = this.getMount_point();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_umount: -> \"%s\" open=%d\n", generatedMount_point, /*Error: Unsupported expression*/);
		if (/*Error: Unsupported expression*/ > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
			return -16;
		} 
		Object generatedFs = this.getFs();
		if (generatedFs.getFs_op() != ((Object)0)) {
			if (generatedFs.getFs_op().getUmount() != ((Object)0)) {
				int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp);
				if (res < 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_umount: ERR %d!\n", /* umount failed */res);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
					return res;
				} 
			} 
		} 
		Object generatedList_entry = this.getList_entry();
		 node = /*Error: Function owner not recognized*/clist_remove(ModernizedCProgram._vfs_mounts_list, generatedList_entry);
		if (node == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* not found */"vfs_umount: ERR not mounted!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
			return -22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
		return 0;
	}
	public int _init_fd(int fd, Object f_op, int flags, Object private_data) {
		fd = ModernizedCProgram._allocate_fd(fd);
		if (fd < 0) {
			return fd;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		filp.setMp(mountp);
		filp.setF_op(f_op);
		filp.setFlags(flags);
		filp.setPos(0);
		Object generatedPrivate_data = filp.getPrivate_data();
		generatedPrivate_data.setPtr(private_data);
		return fd;
	}
	/**
	 * @internal
	 * @brief Find the file system associated with the file name @p name, and
	 * increment the open_files counter
	 *
	 * A pointer to the vfs_mount_t associated with the found mount will be written to @p mountpp.
	 * A pointer to the mount point-relative file name will be written to @p rel_path.
	 *
	 * @param[out] mountpp   write address of the found mount to this pointer
	 * @param[in]  name      absolute path to file
	 * @param[out] rel_path  (optional) output pointer for relative path
	 *
	 * @return mount index on success
	 * @return <0 on error
	 */
	public int _find_mount(Object[] name, Object rel_path) {
		size_t longest_match = 0;
		size_t name_len = /*Error: Function owner not recognized*/strlen(name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._mount_mutex);
		 node = ModernizedCProgram._vfs_mounts_list.getNext();
		if (node == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(/* list empty */ModernizedCProgram._mount_mutex);
			return -2;
		} 
		vfs_mount_t mountp = ((Object)0);
		Object generatedMount_point_len = it.getMount_point_len();
		Object[] generatedMount_point = it.getMount_point();
		do {
			node = node.getNext();
			vfs_mount_t it = /*Error: Function owner not recognized*/container_of(node, , list_entry);
			size_t len = generatedMount_point_len;
			if (len < longest_match/* Already found a longer prefix */) {
				continue;
			} 
			if (len > name_len/* path name is shorter than the mount point name */) {
				continue;
			} 
			if ((len > 1) && (name[len] != (byte)'/') && (name[len] != (byte)'\0'/* name does not have a directory separator where mount point name ends */)) {
				continue;
			} 
			if (/*Error: Function owner not recognized*/strncmp(name, generatedMount_point, len) == 0/* mount_point is a prefix of name */) {
				if (len > /* special check for mount_point == "/" */1) {
					longest_match = len;
				} 
				mountp = it;
			} 
		} while (node != ModernizedCProgram._vfs_mounts_list.getNext());
		if (mountp == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(/* not found */ModernizedCProgram._mount_mutex);
			return -2;
		} 
		Object generatedOpen_files = mountp.getOpen_files();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_add((generatedOpen_files), (true), /* Increment open files counter for this mount */5);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._mount_mutex);
		mountpp = mountp;
		if (rel_path != ((Object)0)) {
			rel_path = name + longest_match;
		} 
		return 0;
	}
	/**
	 * @internal
	 * @brief Check that a given fd number is valid
	 *
	 * @param[in]  fd    fd to check
	 *
	 * @return 0 if the fd is valid
	 * @return <0 if the fd is not valid
	 */
	public Object getList_entry() {
		return list_entry;
	}
	public void setList_entry(Object newList_entry) {
		list_entry = newList_entry;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public Object[] getMount_point() {
		return mount_point;
	}
	public void setMount_point(Object[] newMount_point) {
		mount_point = newMount_point;
	}
	public Object getMount_point_len() {
		return mount_point_len;
	}
	public void setMount_point_len(Object newMount_point_len) {
		mount_point_len = newMount_point_len;
	}
	public Object getOpen_files() {
		return open_files;
	}
	public void setOpen_files(Object newOpen_files) {
		open_files = newOpen_files;
	}
	public Object getPrivate_data() {
		return private_data;
	}
	public void setPrivate_data(Object newPrivate_data) {
		private_data = newPrivate_data;
	}
}
/**
 * @brief A file system driver
 */
