package application;

public class Xattr_create_ea_inodeToExt2fs_bg_free_inodes_count_set {
	
	
	private static Object xattr_create_ea_inode(Object fs, Object value, Object value_len, Object ea_ino) {
		ext2_inode inode = new ext2_inode();
		 ino = new ();
		ext2_file_t file = new ext2_file_t();
		 hash = new ();
		 ret = new ();
		ret = ModernizedCProgram.ext2fs_new_inode(fs, 0, 0, 0, ino);
		if (ret) {
			return ret;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(inode, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedI_flags = inode.getI_flags();
		generatedI_flags |=  -1024;
		if (fs.getSuper().ext2fs_has_feature_extents()) {
			generatedI_flags |=  -1024;
		} 
		inode.setI_size(0);
		inode.setI_mode(100000 | 600);
		inode.setI_links_count(1);
		ret = inode.ext2fs_write_new_inode(fs, ino);
		if (ret) {
			return ret/*
				 * ref_count and hash utilize inode's i_*time fields.
				 * ext2fs_write_new_inode() call above initializes these fields with
				 * current time. That's why ref count and hash updates are done
				 * separately below.
				 */;
		} 
		inode.ext2fs_set_ea_inode_ref(1);
		hash = ModernizedCProgram.ext2fs_crc32c_le(fs.getCsum_seed(), value, value_len);
		inode.ext2fs_set_ea_inode_hash(hash);
		ret = inode.ext2fs_write_inode(fs, ino);
		if (ret) {
			return ret;
		} 
		ret = ModernizedCProgram.ext2fs_file_open(fs, ino, -1024, file);
		if (ret) {
			return ret;
		} 
		ret = ModernizedCProgram.ext2fs_file_write(file, value, value_len, (null));
		ModernizedCProgram.ext2fs_file_close(file);
		if (ret) {
			return ret;
		} 
		ModernizedCProgram.ext2fs_inode_alloc_stats2(fs, ino, 1, /* inuse *//* isdir */0);
		ea_ino = ino;
		return 0;
	}
	public static Object ext2fs_file_close(Object file) {
		 retval = new ();
		if (!(file) || (file).getMagic() != (EXT2_ET_MAGIC_EXT2_FILE)) {
			return (EXT2_ET_MAGIC_EXT2_FILE);
		} 
		retval = ModernizedCProgram.ext2fs_file_flush(file);
		if (file.getBuf()) {
			ModernizedCProgram.ext2fs_free_mem(file.getBuf());
		} 
		ModernizedCProgram.ext2fs_free_mem(file);
		return retval;
	}
	/*
	 * alloc_stats.c --- Update allocation statistics for ext2fs
	 *
	 * Copyright (C) 2001 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	public static void ext2fs_inode_alloc_stats2(Object fs, Object ino, int inuse, int isdir) {
		int group = ModernizedCProgram.ext2fs_group_of_ino(fs, ino);
		if (ino > fs.getSuper().getS_inodes_count()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/com_err("ext2fs_inode_alloc_stats2", 0, "Illegal inode number: %lu", (long)ino);
			return /*Error: Unsupported expression*/;
		} 
		if (inuse > 0) {
			ModernizedCProgram.ext2fs_mark_inode_bitmap2(fs.getInode_map(), ino);
		} else {
				ModernizedCProgram.ext2fs_unmark_inode_bitmap2(fs.getInode_map(), ino);
		} 
		ModernizedCProgram.ext2fs_bg_free_inodes_count_set(fs, group, ModernizedCProgram.ext2fs_bg_free_inodes_count(fs, group) - inuse);
		if (isdir) {
			ModernizedCProgram.ext2fs_bg_used_dirs_count_set(fs, group, ModernizedCProgram.ext2fs_bg_used_dirs_count(fs, group) + inuse);
		} 
		ModernizedCProgram.ext2fs_bg_flags_clear(fs, group, /* We don't strictly need to be clearing the uninit flag if inuse < 0
			 * (i.e. freeing inodes) but it also means something is bad. */-1024);
		if (ModernizedCProgram.ext2fs_has_group_desc_csum(fs)) {
			 first_unused_inode = fs.getSuper().getS_inodes_per_group() - ModernizedCProgram.ext2fs_bg_itable_unused(fs, group) + group * fs.getSuper().getS_inodes_per_group() + 1;
			if (ino >= first_unused_inode) {
				ModernizedCProgram.ext2fs_bg_itable_unused_set(fs, group, group * fs.getSuper().getS_inodes_per_group() + fs.getSuper().getS_inodes_per_group() - ino);
			} 
			ModernizedCProgram.ext2fs_group_desc_csum_set(fs, group);
		} 
		fs.getSuper().getS_free_inodes_count() -= inuse;
		ModernizedCProgram.ext2fs_mark_super_dirty(fs);
		ModernizedCProgram.ext2fs_mark_ib_dirty(fs);
	}
	private static void ext2fs_bg_free_inodes_count_set(Object fs, Object group, Object n) {
		ext4_group_desc gdp = new ext4_group_desc();
		ext4_group_desc ext4_group_desc = new ext4_group_desc();
		gdp = ext4_group_desc.ext4fs_group_desc(fs, fs.getGroup_desc(), group);
		gdp.setExt4_group_desc(n);
		if (fs.getSuper().ext2fs_has_feature_64bit()) {
			gdp.setExt4_group_desc(()n >> 16/*
			 * Return the used dirs count of a group
			 */);
		} 
	}
}
