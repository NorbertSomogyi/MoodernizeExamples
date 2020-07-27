package application;

/*
 * Copyright (c) 2003,2004 Cluster File Systems, Inc, info@clusterfs.com
 * Written by Alex Tomas <alex@clusterfs.com>
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
/*
 * ext3_inode has i_block array (total 60 bytes)
 * first 4 bytes are used to store:
 *  - tree depth (0 mean there is no tree yet. all extents in the inode)
 *  - number of alive extents in the inode
 */
/*
 * This is extent tail on-disk structure.
 * All other extent structures are 12 bytes long.  It turns out that
 * block_size % 12 >= 4 for at least all powers of 2 greater than 512, which
 * covers all valid ext4 block sizes.  Therefore, this tail structure can be
 * crammed into the end of the block without having to rebalance the tree.
 */
public class ext3_extent_tail {
	private Object et_checksum;
	
	public ext3_extent_tail(Object et_checksum) {
		setEt_checksum(et_checksum);
	}
	public ext3_extent_tail() {
	}
	
	public ext3_extent_tail get_extent_tail(Object h) {
		return (ext3_extent_tail)(((byte)h) + (/*Error: Unsupported expression*/ + (/*Error: Unsupported expression*/ * /*Error: Function owner not recognized*/ext2fs_le16_to_cpu((h).getEh_max()))));
	}
	public Object getEt_checksum() {
		return et_checksum;
	}
	public void setEt_checksum(Object newEt_checksum) {
		et_checksum = newEt_checksum;
	}
}
