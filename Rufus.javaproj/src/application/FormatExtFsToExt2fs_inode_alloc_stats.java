package application;

public class FormatExtFsToExt2fs_inode_alloc_stats {
	
	
	private static Object FormatExtFs(Object DriveIndex, Object PartitionOffset, Object BlockSize, Object FSName, Object Label, Object Flags) {
		// Mostly taken from mke2fs.confdouble reserve_ratio = 0.05;
		ext2fs_default_t[] ext2fs_default = new ext2fs_default_t[]{new ext2fs_default_t(3 * -1024, 1024, 128, 3), new ext2fs_default_t(512 * -1024, 1024, 128, 2), new ext2fs_default_t(4 * -1024, 4096, 256, 2), new ext2fs_default_t(16 * -1024, 4096, 256, 3), new ext2fs_default_t(1024 * -1024, 4096, 256, 4)};
		// "floppy"// "small"// "default"// "big"
		// "huge"BOOL ret = 0;
		Byte volume_name = (null);
		int i;
		int count;
		ext2_super_block features = new ext2_super_block(0);
		 manager = nt_io_manager();
		 journal_size = new ();
		 size = 0;
		 cur = new ();
		 ext2fs = (null);
		 r = new ();
		uint8_t buf = (null);
		// Create a 32 MB disk image file to test// Set to nonzero so we can detect init issues
		volume_name = AltGetLogicalName(DriveIndex, PartitionOffset, 0, 1);
		if ((volume_name == (null)) | (/*Error: Function owner not recognized*/strlen(FSName) != 4) || (/*Error: Function owner not recognized*/strncmp(FSName, "ext", 3) != 0)) {
			FormatStatus = -1024 | (3 << 16) | -1024;
			;
		} 
		if (/*Error: Function owner not recognized*/strchr(volume_name, (byte)' ') != (null)) {
			_uprintf("Notice: Using physical device to access partition data");
		} 
		if ((/*Error: Function owner not recognized*/strcmp(FSName, FileSystemLabel[fs_type.FS_EXT2]) != 0) && (/*Error: Function owner not recognized*/strcmp(FSName, FileSystemLabel[fs_type.FS_EXT3]) != 0)) {
			if (/*Error: Function owner not recognized*/strcmp(FSName, FileSystemLabel[fs_type.FS_EXT4]) == 0) {
				_uprintf("ext4 file system is not supported, defaulting to ext3");
			} else {
					_uprintf("Invalid ext file system version requested, defaulting to ext3");
			} 
		} 
		if ((/*Error: Function owner not recognized*/strcmp(FSName, FileSystemLabel[fs_type.FS_EXT2]) != 0) && (/*Error: Function owner not recognized*/strcmp(FSName, FileSystemLabel[fs_type.FS_EXT3]) != 0)) {
			FSName = FileSystemLabel[fs_type.FS_EXT3];
		} 
		PrintStatusInfo(1, 1, 0, 3222, FSName);
		UpdateProgressWithInfo(action_type.OP_INIT, (int)1, (uint64_t)(uintptr_t)(null), 0);
		;
		// Figure out the volume size and block size// Figure out the volume size and block sizer = ext2fs_get_device_size2(volume_name, -1024, size);
		if ((r != 0) || (size == 0)) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not read device size: %s", error_message(r));
			;
		} 
		size *= -1024;
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			if (size < ext2fs_default[i].getMax_size()) {
				break;
			} 
		}
		((i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/)) ? null : /*Error: Function owner not recognized*/_assert("i < ARRAYSIZE(ext2fs_default)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\format.c", 916))// NB: We validated that BlockSize is a power of two in FormatPartition();// NB: We validated that BlockSize is a power of two in FormatPartition()
		if (BlockSize == 0) {
			BlockSize = ext2fs_default[i].getBlock_size();
		} 
		size /= BlockSize;
		Object generatedExt2_super_block = features.getExt2_super_block();
		for (features.setExt2_super_block(0); /*Error: Function owner not recognized*/EXT2_BLOCK_SIZE_BITS(features) <= EXT2_MAX_BLOCK_LOG_SIZE; generatedExt2_super_block++) {
			if (/*Error: Function owner not recognized*/EXT2_BLOCK_SIZE(features) == BlockSize) {
				break;
			} 
		}
		((/*Error: Function owner not recognized*/EXT2_BLOCK_SIZE_BITS(features) <= EXT2_MAX_BLOCK_LOG_SIZE) ? null : /*Error: Function owner not recognized*/_assert("EXT2_BLOCK_SIZE_BITS(&features) <= EXT2_MAX_BLOCK_LOG_SIZE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\format.c", 925));
		// Set the blocks, reserved blocks and inodes// Set the blocks, reserved blocks and inodesfeatures.ext2fs_blocks_count_set(size);
		features.ext2fs_r_blocks_count_set(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(reserve_ratio * size));
		features.setExt2_super_block(1);
		features.setExt2_super_block(ext2fs_default[i].getInode_size());
		features.setExt2_super_block(((features.ext2fs_blocks_count() >> ext2fs_default[i].getInode_ratio()) > -1024) ? -1024 : (uint32_t)(features.ext2fs_blocks_count() >> ext2fs_default[i].getInode_ratio()));
		_uprintf("%d possible inodes out of %lld blocks (block size = %d)", generatedExt2_super_block, size, /*Error: Function owner not recognized*/EXT2_BLOCK_SIZE(features));
		_uprintf("%lld blocks (%0.1f%%) reserved for the super user", features.ext2fs_r_blocks_count(), reserve_ratio * 100.0);
		// Set features// Set featuresfeatures.ext2fs_set_feature_xattr();
		features.ext2fs_set_feature_resize_inode();
		features.ext2fs_set_feature_dir_index();
		features.ext2fs_set_feature_filetype();
		features.ext2fs_set_feature_sparse_super();
		features.ext2fs_set_feature_large_file();
		if (FSName[3] != (byte)'2') {
			features.ext2fs_set_feature_journal();
		} 
		generatedExt2_super_block[0] = ~0;
		features.setExt2_super_block(EXT2_DEFM_XATTR_USER | EXT2_DEFM_ACL);
		// Now that we have set our base features, initialize a virtual superblock// Now that we have set our base features, initialize a virtual superblockr = features.ext2fs_initialize(volume_name, EXT2_FLAG_EXCLUSIVE | EXT2_FLAG_64BITS, manager, ext2fs);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not initialize %s features: %s", FSName, error_message(r));
			;
		} 
		// Zero 16 blocks of data from the start of our volume// Zero 16 blocks of data from the start of our volumebuf = /*Error: Function owner not recognized*/calloc(16, ext2fs.getIo().getBlock_size());
		((buf != (null)) ? null : /*Error: Function owner not recognized*/_assert("buf != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Rufus\\src\\format.c", 959));
		r = io_channel_write_blk64(ext2fs.getIo(), 0, 16, buf);
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)buf);
			buf = (null);
		} while (0);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not zero %s superblock area: %s", FSName, error_message(r));
			;
		} 
		// Finish setting up the file systemdo {
			(Object)(/*Error: Function owner not recognized*/CoCreateGuid((GUID)ext2fs.getSuper().getS_uuid()));
		} while (0);
		ext2fs_init_csum_seed(ext2fs);
		ext2fs.getSuper().setS_def_hash_version(EXT2_HASH_HALF_MD4);
		do {
			(Object)(/*Error: Function owner not recognized*/CoCreateGuid((GUID)ext2fs.getSuper().getS_hash_seed()));
		} while (0);
		ext2fs.getSuper().setS_max_mnt_count(-1);
		ext2fs.getSuper().setS_creator_os(EXT2_OS_WINDOWS);
		ext2fs.getSuper().setS_errors(EXT2_ERRORS_CONTINUE);
		if (Label != (null)) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ext2fs.getSuper().getS_volume_name(), Label, (((size_t)(((((byte)Label) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(Label)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)Label) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(Label)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))));
				((byte)ext2fs.getSuper().getS_volume_name())[(((size_t)(((((byte)Label) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(Label)) + 1)) < ((size_t)(/*Error: sizeof expression not supported yet*/)) ? ((size_t)(((((byte)Label) == (null)) ? 0 : /*Error: Function owner not recognized*/strlen(Label)) + 1)) : ((size_t)(/*Error: sizeof expression not supported yet*/))) - 1] = 0;
			} while (0);
		} 
		r = ext2fs_allocate_tables(ext2fs);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not allocate %s tables: %s", FSName, error_message(r));
			;
		} 
		r = ext2fs_convert_subcluster_bitmap(ext2fs, ext2fs.getBlock_map());
		if (r != 0) {
			_uprintf("Could set %s cluster bitmap: %s", FSName, error_message(r));
			;
		} 
		ext2_percent_start = 0.0;
		ext2_percent_share = (FSName[3] == (byte)'2') ? 1.0 : 0.5;
		_uprintf("Creating %d inode sets: [1 marker = %0.1f set(s)]", ext2fs.getGroup_desc_count(), (((double)ext2fs.getGroup_desc_count() / ext2_max_marker) > (1.0) ? ((double)ext2fs.getGroup_desc_count() / ext2_max_marker) : (1.0)));
		for (i = 0; i < (int)ext2fs.getGroup_desc_count(); i++) {
			if (ext2fs_print_progress((int64_t)i, (int64_t)ext2fs.getGroup_desc_count())) {
				;
			} 
			cur = ext2fs_inode_table_loc(ext2fs, i);
			count = ext2fs_div_ceil((ext2fs.getSuper().getS_inodes_per_group() - ext2fs_bg_itable_unused(ext2fs, i)) * /*Error: Function owner not recognized*/EXT2_BLOCK_SIZE(ext2fs.getSuper()), /*Error: Function owner not recognized*/EXT2_BLOCK_SIZE(ext2fs.getSuper()));
			r = ext2fs_zero_blocks2(ext2fs, cur, count, cur, count);
			if (r != 0) {
				FormatStatus = ext2_last_winerror(-1024);
				_uprintf("\r\nCould not zero inode set at position %llu (%d blocks): %s", cur, count, error_message(r));
				;
			} 
		}
		_uprintfs("\r\n");
		// Create root and lost+found dirs// Create root and lost+found dirsr = ext2fs_mkdir(ext2fs, EXT2_ROOT_INO, EXT2_ROOT_INO, 0);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Failed to create %s root dir: %s", FSName, error_message(r));
			;
		} 
		ext2fs.setUmask(77);
		r = ext2fs_mkdir(ext2fs, EXT2_ROOT_INO, 0, "lost+found");
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Failed to create %s 'lost+found' dir: %s", FSName, error_message(r));
			;
		} 
		// Create bitmapsfor (i = EXT2_ROOT_INO + 1; i < (int)/*Error: Function owner not recognized*/EXT2_FIRST_INODE(ext2fs.getSuper()); i++) {
			ext2fs_inode_alloc_stats(ext2fs, i, 1);
		}
		ext2fs_mark_ib_dirty(ext2fs);
		r = ext2fs_mark_inode_bitmap2(ext2fs.getInode_map(), EXT2_BAD_INO);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not set inode bitmaps: %s", error_message(r));
			;
		} 
		ext2fs_inode_alloc_stats(ext2fs, EXT2_BAD_INO, 1);
		r = ext2fs_update_bb_inode(ext2fs, (null));
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not set inode stats: %s", error_message(r));
			;
		} 
		if (FSName[3] != (byte)'2') {
			ext2_percent_start = 0.5;
			journal_size = ext2fs_default_journal_size(ext2fs.getSuper().ext2fs_blocks_count());
			journal_size /= 2;
			_uprintf("Creating %d journal blocks: [1 marker = %0.1f block(s)]", journal_size, (((double)journal_size / ext2_max_marker) > (1.0) ? ((double)journal_size / ext2_max_marker) : (1.0)));
			r = ext2fs_add_journal_inode(ext2fs, journal_size, EXT2_MKJOURNAL_NO_MNT_CHECK | ((Flags & -1024) ? EXT2_MKJOURNAL_LAZYINIT : 0));
			_uprintfs("\r\n");
			if (r != 0) {
				FormatStatus = ext2_last_winerror(-1024);
				_uprintf("Could not create %s journal: %s", FSName, error_message(r));
				;
			} 
		} 
		// Create the journal
		// Create a 'persistence.conf' file if requiredif (Flags & -1024) {
			Byte name = "persistence.conf";
			byte[] data = "/ union\n";
			int written = 0;
			int fsize = /*Error: sizeof expression not supported yet*/ - 1;
			 ext2fd = new ();
			 inode_id = new ();
			uint32_t ctime = (uint32_t)/*Error: Function owner not recognized*/time(0);
			ext2_inode inode = new ext2_inode(0);
			inode.setExt2_inode(100644);
			inode.setExt2_inode(1);
			inode.setExt2_inode(ctime);
			inode.setExt2_inode(ctime);
			inode.setExt2_inode(ctime);
			inode.setExt2_inode(fsize);
			ext2fs_namei(ext2fs, EXT2_ROOT_INO, EXT2_ROOT_INO, name, inode_id);
			ext2fs_new_inode(ext2fs, EXT2_ROOT_INO, 10755, 0, inode_id);
			ext2fs_link(ext2fs, EXT2_ROOT_INO, name, inode_id, EXT2_FT_REG_FILE);
			ext2fs_inode_alloc_stats(ext2fs, inode_id, 1);
			inode.ext2fs_write_new_inode(ext2fs, inode_id);
			ext2fs_file_open(ext2fs, inode_id, EXT2_FILE_WRITE, ext2fd);
			if ((ext2fs_file_write(ext2fd, data, fsize, written) != 0) || (written != fsize)) {
				_uprintf("Error: Could not create '%s' file", name);
			} else {
					_uprintf("Created '%s' file", name);
			} 
			ext2fs_file_close(ext2fd);
		} 
		// You *do* want the LF at the end of the "/ union" line, else Debian Live bails out...
		// Finally we can call close() to get the file system gets created// Finally we can call close() to get the file system gets createdr = ext2fs_close(ext2fs);
		if (r != 0) {
			FormatStatus = ext2_last_winerror(-1024);
			_uprintf("Could not create %s volume: %s", FSName, error_message(r));
			;
		} 
		UpdateProgressWithInfo(action_type.OP_FORMAT, 3217, 100, 100);
		_uprintf("Done");
		ret = 1;
		ext2fs_free(ext2fs);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
		return ret/*
		 * Call on VDS to format a partition
		 */;
	}
	private static void _uprintfs(Object str) {
		wchar_t wstr = new wchar_t();
		wstr = utf8_to_wchar(str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/OutputDebugStringW(wstr);
		if ((hLog != (null)) && (hLog != (HANDLE)(true))) {
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 177, (true), (true)));
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 194, 0, (LPARAM)(LPCTSTR)(wstr)));
			((Object)/*Error: Function owner not recognized*/SendMessageA((hLog), 182, (WPARAM)(false), (LPARAM)(((int)(DWORD)/*Error: Function owner not recognized*/SendMessageA((hLog), 186, 0, 0)))));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(wstr);
	}
	public static void ext2fs_mark_ib_dirty(Object fs) {
		fs.getFlags() |=  -1024 | -1024/*
		 * Mark the block bitmap as dirty
		 */;
	}
	private static void ext2fs_inode_alloc_stats(Object fs, Object ino, int inuse) {
		ext2fs_inode_alloc_stats2(fs, ino, inuse, 0);
	}
}
