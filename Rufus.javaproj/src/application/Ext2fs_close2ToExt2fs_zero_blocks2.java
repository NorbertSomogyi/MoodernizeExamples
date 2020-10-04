package application;

public class Ext2fs_close2ToExt2fs_zero_blocks2 {
	
	
	private static Object ext2fs_close2(Object fs, int flags) {
		 retval = new ();
		int meta_blks;
		 stats = 0;
		if (!(fs) || (fs).getMagic() != (EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return (EXT2_ET_MAGIC_EXT2FS_FILSYS);
		} 
		if (fs.getWrite_bitmaps()) {
			retval = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs);
			if (retval) {
				return retval;
			} 
		} 
		if (fs.getSuper().getS_kbytes_written() && fs.getIo().getManager().getGet_stats()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs.getIo(), stats);
		} 
		if (stats && stats.getBytes_written() && (fs.getFlags() & -1024)) {
			fs.getSuper().getS_kbytes_written() += stats.getBytes_written() >> 10;
			meta_blks = fs.getDesc_blocks() + 1;
			if (!(fs.getFlags() & -1024)) {
				fs.getSuper().getS_kbytes_written() += meta_blks / (fs.getBlocksize() / 1024);
			} 
			if ((fs.getFlags() & -1024) == 0) {
				fs.getFlags() |=  -1024 | -1024;
			} 
		} 
		if (fs.getFlags() & -1024) {
			retval = ModernizedCProgram.ext2fs_flush2(fs, flags);
			if (retval) {
				return retval;
			} 
		} 
		retval = ModernizedCProgram.ext2fs_mmp_stop(fs);
		if (retval) {
			return retval;
		} 
		ModernizedCProgram.ext2fs_free(fs);
		return 0;
	}
	/*
	 * freefs.c --- free an ext2 filesystem
	 *
	 * Copyright (C) 1993, 1994, 1995, 1996 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	public static void ext2fs_free(Object fs) {
		if (!fs || (fs.getMagic() != EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return /*Error: Unsupported expression*/;
		} 
		if (fs.getImage_io() != fs.getIo()) {
			if (fs.getImage_io()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/io_channel_close(fs.getImage_io());
			} 
		} 
		if (fs.getIo()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/io_channel_close(fs.getIo());
		} 
		if (fs.getDevice_name()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getDevice_name());
		} 
		if (fs.getSuper()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getSuper());
		} 
		if (fs.getOrig_super()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getOrig_super());
		} 
		if (fs.getGroup_desc()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getGroup_desc());
		} 
		if (fs.getBlock_map()) {
			ModernizedCProgram.ext2fs_free_block_bitmap(fs.getBlock_map());
		} 
		if (fs.getInode_map()) {
			ModernizedCProgram.ext2fs_free_inode_bitmap(fs.getInode_map());
		} 
		if (fs.getImage_header()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getImage_header());
		} 
		if (fs.getBadblocks()) {
			ModernizedCProgram.ext2fs_badblocks_list_free(fs.getBadblocks());
		} 
		fs.setBadblocks(0);
		if (fs.getDblist()) {
			ModernizedCProgram.ext2fs_free_dblist(fs.getDblist());
		} 
		if (fs.getIcache()) {
			fs.getIcache().ext2fs_free_inode_cache();
		} 
		if (fs.getMmp_buf()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getMmp_buf());
		} 
		if (fs.getMmp_cmp()) {
			ModernizedCProgram.ext2fs_free_mem(fs.getMmp_cmp());
		} 
		if (fs.getBlock_sha_map()) {
			fs.getBlock_sha_map().ext2fs_hashmap_free();
		} 
		fs.setMagic(0);
		// coverity[check_return]// coverity[check_return]ModernizedCProgram.ext2fs_zero_blocks2((null), 0, 0, (null), (null));
		ModernizedCProgram.ext2fs_free_mem(fs/*
		 * This procedure frees a badblocks list.
		 */);
	}
	private static Object ext2fs_zero_blocks2(Object fs, Object blk, int num, Object ret_blk, Integer ret_count) {
		int j;
		int count;
		Object buf;
		int stride_length = 0;
		 retval = new ();
		if (!/* If fs is null, clean up the static buffer and return */fs) {
			if (buf) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(buf);
				buf = 0;
				stride_length = 0;
			} 
			return 0;
		} 
		if (num <= /* Deal with zeroing less than 1 block */0) {
			return 0;
		} 
		retval = ModernizedCProgram.io_channel_zeroout(fs.getIo(), blk, /* Try a zero out command, if supported */num);
		if (retval == 0) {
			return 0;
		} 
		if (num > stride_length && stride_length < (4194304 / (int)fs.getBlocksize())) {
			Object p;
			int new_stride = num;
			if (new_stride > (4194304 / (int)fs.getBlocksize())) {
				new_stride = (4194304 / (int)fs.getBlocksize());
			} 
			p = /*Error: Function owner not recognized*/realloc(buf, fs.getBlocksize() * new_stride);
			if (!p) {
				return EXT2_ET_NO_MEMORY;
			} 
			buf = p;
			stride_length = new_stride;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, fs.getBlocksize() * stride_length);
		} 
		j = /* OK, do the write loop */0;
		while (j < num) {
			if (blk % stride_length) {
				count = stride_length - (blk % stride_length);
				if (count > (num - j)) {
					count = num - j;
				} 
			} else {
					count = num - j;
					if (count > stride_length) {
						count = stride_length;
					} 
			} 
			retval = ModernizedCProgram.io_channel_write_blk64(fs.getIo(), blk, count, buf);
			if (retval) {
				if (ret_count) {
					ret_count = count;
				} 
				if (ret_blk) {
					ret_blk = blk;
				} 
				return retval;
			} 
			j += count;
			blk += count;
		}
		return 0;
	}
}
