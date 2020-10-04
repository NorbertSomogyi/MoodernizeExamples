package application;

public class Ext2fs_clear_block_uninitToExt2fs_mark_bb_dirty {
	
	
	/*
	 * alloc.c --- allocate new inodes, blocks for ext2fs
	 *
	 * Copyright (C) 1993, 1994, 1995, 1996 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	/*
	 * Clear the uninit block bitmap flag if necessary
	 */
	public static void ext2fs_clear_block_uninit(Object fs, Object group) {
		if (group >= fs.getGroup_desc_count() || !ModernizedCProgram.ext2fs_has_group_desc_csum(fs) || !(ModernizedCProgram.ext2fs_bg_flags_test(fs, group, -1024))) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.ext2fs_bg_flags_clear(fs, group, /* uninit block bitmaps are now initialized in read_bitmaps() */-1024);
		ModernizedCProgram.ext2fs_group_desc_csum_set(fs, group);
		ModernizedCProgram.ext2fs_mark_super_dirty(fs);
		ModernizedCProgram.ext2fs_mark_bb_dirty(fs/*
		 * Check for uninit inode bitmaps and deal with them appropriately
		 */);
	}
	public static void ext2fs_bg_flags_clear(Object fs, Object group, Object bg_flags) {
		ext4_group_desc gdp = new ext4_group_desc();
		ext4_group_desc ext4_group_desc = new ext4_group_desc();
		gdp = ext4_group_desc.ext4fs_group_desc(fs, fs.getGroup_desc(), group);
		Object generatedExt4_group_desc = gdp.getExt4_group_desc();
		generatedExt4_group_desc &=  ~bg_flags;
		return /*Error: Unsupported expression*/;/*
		 * Get the checksum for this block group
		 */
	}
	public static void ext2fs_group_desc_csum_set(Object fs, Object group) {
		if (!ModernizedCProgram.ext2fs_has_group_desc_csum(fs)) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.ext2fs_bg_checksum_set(fs, group, ModernizedCProgram.ext2fs_group_desc_csum(fs, /* ext2fs_bg_checksum_set() sets the actual checksum field but
			 * does not calculate the checksum itself. */group));
	}
	private static void ext2fs_bg_checksum_set(Object fs, Object group, Object checksum) {
		ext4_group_desc gdp = new ext4_group_desc();
		ext4_group_desc ext4_group_desc = new ext4_group_desc();
		gdp = ext4_group_desc.ext4fs_group_desc(fs, fs.getGroup_desc(), group);
		gdp.setExt4_group_desc(checksum);
		return /*Error: Unsupported expression*/;/*
		 * Get the acl block of a file
		 */
	}
	/*
	 * Mark a filesystem superblock as dirty
	 */
	public static void ext2fs_mark_super_dirty(Object fs) {
		fs.getFlags() |=  -1024 | -1024/*
		 * Mark a filesystem as changed
		 */;
	}
	public static void ext2fs_mark_bb_dirty(Object fs) {
		fs.getFlags() |=  -1024 | -1024/*
		 * Check to see if a filesystem's inode bitmap is dirty
		 */;
	}
}
