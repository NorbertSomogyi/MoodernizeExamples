package application;

/*
 *  linux/include/linux/ext2_fs.h
 *
 * Copyright (C) 1992, 1993, 1994, 1995
 * Remy Card (card@masi.ibp.fr)
 * Laboratoire MASI - Institut Blaise Pascal
 * Universite Pierre et Marie Curie (Paris VI)
 *
 *  from
 *
 *  linux/include/linux/minix_fs.h
 *
 *  Copyright (C) 1991, 1992  Linus Torvalds
 */
/* Changed from linux/types.h */
/* gcc 4.7 miscompiles packed structures in MS-bitfield mode */
/*
 * The second extended filesystem constants/structures
 */
/*
 * Define EXT2FS_DEBUG to produce debug messages
 */
/*
 * Define EXT2_PREALLOCATE to preallocate data blocks for expanding files
 */
/*
 * The second extended file system version
 */
/*
 * Special inode numbers
 */
/* Bad blocks inode */
/* Root inode */
/* User quota inode */
/* Group quota inode */
/* Boot loader inode */
/* Undelete directory inode */
/* Reserved group descriptors inode */
/* Journal inode */
/* The "exclude" inode, for snapshots */
/* Used by non-upstream feature */
/* First non-reserved inode for old ext2 filesystems */
/*
 * The second extended file system magic number
 */
/* Assume that user mode programs are passing in an ext2fs superblock, not
 * a kernel struct super_block.  This will allow us to call the feature-test
 * macros from user land. */
/*
 * Maximal count of links to a file
 */
/*
 * Macro-instructions used to manage several block sizes
 */
/* 1024 */
/* 65536 */
/*
 * Macro-instructions used to manage allocation clusters
 */
/* 512MB  */
/*
 * Macro-instructions used to manage fragments
 *
 * Note: for backwards compatibility only, for the dump program.
 * Ext2/3/4 will never support fragments....
 */
/*
 * ACL structures
 */
/* Header of Access Control Lists */
public class ext2_acl_header {
	private Object aclh_size;
	private Object aclh_file_count;
	private Object aclh_acle_count;
	private Object aclh_first_acle;
	
	public ext2_acl_header(Object aclh_size, Object aclh_file_count, Object aclh_acle_count, Object aclh_first_acle) {
		setAclh_size(aclh_size);
		setAclh_file_count(aclh_file_count);
		setAclh_acle_count(aclh_acle_count);
		setAclh_first_acle(aclh_first_acle);
	}
	public ext2_acl_header() {
	}
	
	public Object getAclh_size() {
		return aclh_size;
	}
	public void setAclh_size(Object newAclh_size) {
		aclh_size = newAclh_size;
	}
	public Object getAclh_file_count() {
		return aclh_file_count;
	}
	public void setAclh_file_count(Object newAclh_file_count) {
		aclh_file_count = newAclh_file_count;
	}
	public Object getAclh_acle_count() {
		return aclh_acle_count;
	}
	public void setAclh_acle_count(Object newAclh_acle_count) {
		aclh_acle_count = newAclh_acle_count;
	}
	public Object getAclh_first_acle() {
		return aclh_first_acle;
	}
	public void setAclh_first_acle(Object newAclh_first_acle) {
		aclh_first_acle = newAclh_first_acle;
	}
}
