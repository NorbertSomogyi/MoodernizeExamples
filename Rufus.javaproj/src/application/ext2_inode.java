package application;

/*
 * Structure of an inode on the disk
 */
/* __GNU__ */
/* defined(__KERNEL__) || defined(__linux__) */
public class ext2_inode {
	private Object i_mode;
	private Object i_uid;
	private Object i_size;
	private Object i_atime;
	private Object i_ctime;
	private Object i_mtime;
	private Object i_dtime;
	private Object i_gid;
	private Object i_links_count;
	private Object i_blocks;
	private Object i_flags;
	private  osd1;
	private Object i_block;
	private Object i_generation;
	private Object i_file_acl;
	private Object i_size_high;
	private Object i_faddr;
	private  osd2;
	
	public ext2_inode(Object i_mode, Object i_uid, Object i_size, Object i_atime, Object i_ctime, Object i_mtime, Object i_dtime, Object i_gid, Object i_links_count, Object i_blocks, Object i_flags,  osd1, Object i_block, Object i_generation, Object i_file_acl, Object i_size_high, Object i_faddr,  osd2) {
		setI_mode(i_mode);
		setI_uid(i_uid);
		setI_size(i_size);
		setI_atime(i_atime);
		setI_ctime(i_ctime);
		setI_mtime(i_mtime);
		setI_dtime(i_dtime);
		setI_gid(i_gid);
		setI_links_count(i_links_count);
		setI_blocks(i_blocks);
		setI_flags(i_flags);
		setOsd1(osd1);
		setI_block(i_block);
		setI_generation(i_generation);
		setI_file_acl(i_file_acl);
		setI_size_high(i_size_high);
		setI_faddr(i_faddr);
		setOsd2(osd2);
	}
	public ext2_inode() {
	}
	
	/*
	 * valid_blk.c --- does the inode have valid blocks?
	 *
	 * Copyright 1997 by Theodore Ts'o
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	/*
	 * This function returns 1 if the inode's block entries actually
	 * contain block entries.
	 */
	public int ext2fs_inode_has_valid_blocks2(Object fs) {
		Object generatedI_mode = this.getI_mode();
		if (!(((generatedI_mode) & 170000) == 40000) && !(((generatedI_mode) & 170000) == 100000) && !(((generatedI_mode) & 170000) == 120000)) {
			return 0/*
				 * If the symbolic link is a "fast symlink", then the symlink
				 * target is stored in the block entries.
				 */;
		} 
		Object generatedI_blocks = this.getI_blocks();
		Object generatedI_size = this.getI_size();
		Object generatedI_block = this.getI_block();
		if ((((generatedI_mode) & 170000) == 120000)) {
			if (ModernizedCProgram.ext2fs_file_acl_block(fs, inode) == 0) {
				if (generatedI_blocks == /* With no EA block, we can rely on i_blocks */0) {
					return 0;
				} 
			} else {
					if (generatedI_size >= (((12 + 1) + 1) + 1) * /* With an EA block, life gets more tricky */4) {
						return /* definitely using i_block[] */1;
					} 
					if (generatedI_size > 4 && generatedI_block[1] == 0) {
						return /* definitely using i_block[] */1;
					} 
					return /* Probably a fast symlink */0;
			} 
		} 
		Object generatedI_flags = this.getI_flags();
		if (generatedI_flags & /*
			 * If this inode has inline data, it shouldn't have valid block
			 * entries.
			 */-1024) {
			return 0;
		} 
		return 1;
	}
	/*
		 * Only directories, regular files, and some symbolic links
		 * have valid block entries.
		 */
	public int ext2fs_inode_has_valid_blocks() {
		return inode.ext2fs_inode_has_valid_blocks2(((Object)0));
	}
	public Object ext2fs_get_ea_inode_hash() {
		Object generatedI_atime = this.getI_atime();
		return generatedI_atime;
	}
	public void ext2fs_set_ea_inode_hash(Object hash) {
		this.setI_atime(hash);
	}
	public Object ext2fs_get_ea_inode_ref() {
		Object generatedI_ctime = this.getI_ctime();
		 generatedOsd1 = this.getOsd1();
		Object generatedLinux1 = generatedOsd1.getLinux1();
		return (()generatedI_ctime << 32) | generatedLinux1.getL_i_version();
	}
	public void ext2fs_set_ea_inode_ref(Object ref_count) {
		this.setI_ctime(.UNRECOGNIZEDFUNCTIONNAME(ref_count >> 32));
		 generatedOsd1 = this.getOsd1();
		Object generatedLinux1 = generatedOsd1.getLinux1();
		generatedLinux1.setL_i_version(()ref_count);
	}
	public Object ext2fs_inline_data_dir_expand(Object fs, Object ino, Byte buf, Object size) {
		 retval = new ();
		 blk = new ();
		byte blk_buf;
		retval = ModernizedCProgram.ext2fs_get_memzero(fs.getBlocksize(), blk_buf);
		if (retval) {
			return retval;
		} 
		retval = ModernizedCProgram.ext2fs_inline_data_convert_dir(fs, ino, blk_buf, buf, /* Adjust the rec_len */size);
		if (retval) {
			;
		} 
		retval = ModernizedCProgram.ext2fs_new_block2(fs, 0, 0, /* Allocate a new block */blk);
		if (retval) {
			;
		} 
		retval = ModernizedCProgram.ext2fs_write_dir_block4(fs, blk, blk_buf, 0, ino);
		if (retval) {
			;
		} 
		Object generatedI_flags = this.getI_flags();
		if (fs.getSuper().ext2fs_has_feature_extents()) {
			generatedI_flags |=  -1024;
		} 
		generatedI_flags &=  ~-1024;
		retval = inode.ext2fs_iblk_add_blocks(fs, 1);
		if (retval) {
			;
		} 
		this.setI_size(fs.getBlocksize());
		retval = inode.ext2fs_bmap2(fs, ino, 0, -1024, 0, 0, blk);
		if (retval) {
			;
		} 
		retval = inode.ext2fs_write_inode(fs, ino);
		if (retval) {
			;
		} 
		ModernizedCProgram.ext2fs_block_alloc_stats(fs, blk, +1);
		return retval;
	}
	public Object ext2fs_inline_data_file_expand(Object fs, Object ino, Byte buf, Object size) {
		ext2_file_t e2_file = new ext2_file_t();
		 retval = new ();
		Object generatedI_block = this.getI_block();
		.memset(generatedI_block, 0, );
		Object generatedI_flags = this.getI_flags();
		if (fs.getSuper().ext2fs_has_feature_extents()) {
			ext2_extent_handle_t handle = new ext2_extent_handle_t();
			generatedI_flags &=  ~-1024;
			retval = inode.ext2fs_extent_open2(fs, ino, handle);
			if (retval) {
				return retval;
			} 
			ModernizedCProgram.ext2fs_extent_free(handle);
		} 
		generatedI_flags &=  ~-1024;
		this.setI_size(0);
		retval = inode.ext2fs_write_inode(fs, ino);
		if (retval) {
			return retval;
		} 
		retval = ModernizedCProgram.ext2fs_file_open(fs, ino, -1024, /* Write out the block buffer */e2_file);
		if (retval) {
			return retval;
		} 
		retval = ModernizedCProgram.ext2fs_file_write(e2_file, buf, size, 0);
		ModernizedCProgram.ext2fs_file_close(e2_file);
		return retval;
	}
	public Object ext2fs_inline_data_get(Object fs, Object ino, Object buf, Object size) {
		ext2_inode inode_buf = new ext2_inode();
		ext2_inline_data data = new ext2_inline_data();
		 retval = new ();
		if (!inode) {
			retval = inode_buf.ext2fs_read_inode(fs, ino);
			if (retval) {
				return retval;
			} 
			inode = inode_buf;
		} 
		data.setFs(fs);
		data.setIno(ino);
		retval = data.ext2fs_inline_data_ea_get();
		if (retval) {
			return retval;
		} 
		Object generatedI_block = this.getI_block();
		.memcpy(buf, (Object)generatedI_block, (( * (((12 + 1) + 1) + 1))));
		Object generatedEa_size = data.getEa_size();
		Object generatedEa_data = data.getEa_data();
		if (generatedEa_size > 0) {
			.memcpy((byte)buf + (( * (((12 + 1) + 1) + 1))), generatedEa_data, generatedEa_size);
		} 
		if (size) {
			size = (( * (((12 + 1) + 1) + 1))) + generatedEa_size;
		} 
		ModernizedCProgram.ext2fs_free_mem(generatedEa_data);
		return 0;
	}
	public Object ext2fs_inline_data_set(Object fs, Object ino, Object buf, Object size) {
		ext2_inode inode_buf = new ext2_inode();
		ext2_inline_data data = new ext2_inline_data(, );
		 retval = new ();
		size_t free_ea_size = new size_t();
		size_t existing_size = new size_t();
		size_t free_inode_size = new size_t();
		if (!inode) {
			retval = inode_buf.ext2fs_read_inode(fs, ino);
			if (retval) {
				return retval;
			} 
			inode = inode_buf;
		} 
		Object generatedI_block = this.getI_block();
		if (size <= (( * (((12 + 1) + 1) + 1)))) {
			.memcpy((Object)generatedI_block, buf, size);
		} else {
				retval = ModernizedCProgram.ext2fs_xattr_inode_max_size(fs, ino, free_ea_size);
				if (retval) {
					return retval;
				} 
				retval = ModernizedCProgram.ext2fs_inline_data_size(fs, ino, existing_size);
				if (retval) {
					return retval;
				} 
				if (existing_size < (( * (((12 + 1) + 1) + 1)))) {
					free_inode_size = (( * (((12 + 1) + 1) + 1))) - existing_size;
				} else {
						free_inode_size = 0;
				} 
				if (size != existing_size && size > existing_size + free_ea_size + free_inode_size) {
					return EXT2_ET_INLINE_DATA_NO_SPACE;
				} 
				.memcpy((Object)generatedI_block, buf, (( * (((12 + 1) + 1) + 1))));
				if (size > (( * (((12 + 1) + 1) + 1)))) {
					data.setEa_size(size - (( * (((12 + 1) + 1) + 1))));
				} 
				data.setEa_data((byte)buf + (( * (((12 + 1) + 1) + 1))));
		} 
		retval = inode.ext2fs_write_inode(fs, ino);
		if (retval) {
			return retval;
		} 
		return data/*
		 * The length of buffer is set to 64 because in inode's i_block member it only
		 * can save 60 bytes.  Thus this value can let the data being saved in extra
		 * space.
		 */.ext2fs_inline_data_ea_set();
	}
	public Object claim_range(Object fs, Object blk, Object len) {
		 clusters = new ();
		clusters = (len + (-1024 << (fs).getCluster_ratio_bits()) - 1) / (-1024 << (fs).getCluster_ratio_bits());
		ModernizedCProgram.ext2fs_block_alloc_stats_range(fs, blk, clusters * (-1024 << (fs).getCluster_ratio_bits()), +1);
		return inode.ext2fs_iblk_add_blocks(fs, clusters);
	}
	public Object extent_fallocate(Object fs, int flags, Object ino, Object goal, Object start, Object len) {
		ext2_extent_handle_t handle = new ext2_extent_handle_t();
		ext2fs_extent left_extent = new ext2fs_extent();
		ext2fs_extent right_extent = new ext2fs_extent();
		ext2fs_extent left_adjacent = new ext2fs_extent();
		ext2fs_extent right_adjacent = new ext2fs_extent();
		 err = new ();
		 range_start = new ();
		 range_end = 0;
		 end = new ();
		 next = new ();
		 count = new ();
		 goal_distance = new ();
		end = start + len - 1;
		err = inode.ext2fs_extent_open2(fs, ino, handle);
		if (err) {
			return err/*
				 * Find the extent closest to the start of the alloc range.  We don't
				 * check the return value because _goto() sets the current node to the
				 * next-lowest extent if 'start' is in a hole; or the next-highest
				 * extent if there aren't any lower ones; or doesn't set a current node
				 * if there was a real error reading the extent tree.  In that case,
				 * _get() will error out.
				 */;
		} 
		err = left_extent.ext2fs_extent_get(handle, -1024);
		if (err == EXT2_ET_NO_CURRENT_NODE) {
			 max_blocks = fs.getSuper().ext2fs_blocks_count();
			if (goal == ~-1024) {
				goal = inode.ext2fs_find_inode_goal(fs, ino, start);
			} 
			err = ModernizedCProgram.ext2fs_find_first_zero_block_bitmap2(fs.getBlock_map(), goal, max_blocks - 1, goal);
			goal += start;
			err = ModernizedCProgram.ext_falloc_helper(fs, flags, ino, inode, handle, ((Object)0), ((Object)0), start, len, goal);
			;
		}  else if (err) {
			;
		} 
		ModernizedCProgram.dbg_print_extent("ext_falloc initial", left_extent);
		Object generatedE_lblk = left_extent.getE_lblk();
		Object generatedE_len = left_extent.getE_len();
		next = generatedE_lblk + generatedE_len;
		Object generatedE_pblk = left_extent.getE_pblk();
		if (generatedE_lblk > start) {
			goal = generatedE_pblk - (generatedE_lblk - /* The nearest extent we found was beyond start??? */start);
			err = ModernizedCProgram.ext_falloc_helper(fs, flags, ino, inode, handle, ((Object)0), left_extent, start, generatedE_lblk - start, goal);
			if (err) {
				;
			} 
			;
		}  else if (next >= start) {
			range_start = next;
			left_adjacent = left_extent;
		} else {
				range_start = start;
				left_adjacent = ((Object)0);
		} 
		goal = generatedE_pblk + (range_start - generatedE_lblk);
		do {
			err = right_extent.ext2fs_extent_get(handle, -1024);
			;
			ModernizedCProgram.dbg_print_extent("ext_falloc next", right_extent);
			if (!err && generatedE_lblk <= generatedE_lblk) {
				err = EXT2_ET_EXTENT_NO_NEXT;
			} 
			if (err && err != EXT2_ET_EXTENT_NO_NEXT) {
				;
			} 
			if (err == EXT2_ET_EXTENT_NO_NEXT || generatedE_lblk > end + 1) {
				range_end = end;
				right_adjacent = ((Object)0);
			} else {
					range_end = generatedE_lblk - /* Handle right_extent.e_lblk <= end */1;
					right_adjacent = right_extent;
			} 
			goal_distance = range_start - next;
			if (err != EXT2_ET_EXTENT_NO_NEXT && goal_distance > (range_end - generatedE_lblk)) {
				goal = generatedE_pblk - (generatedE_lblk - range_start);
			} 
			;
			err = 0;
			if (range_start <= range_end) {
				count = range_end - range_start + 1;
				err = ModernizedCProgram.ext_falloc_helper(fs, flags, ino, inode, handle, left_adjacent, right_adjacent, range_start, count, goal);
				if (err) {
					;
				} 
			} 
			if (range_end == end) {
				break;
			} 
			err = ModernizedCProgram.ext2fs_extent_goto(handle, generatedE_lblk);
			if (err) {
				;
			} 
			next = generatedE_lblk + generatedE_len;
			left_extent = right_extent;
			left_adjacent = left_extent;
			range_start = next;
			goal = generatedE_pblk + (range_start - generatedE_lblk);
		} while (range_end < end);
		return err/*
		 * Map physical blocks to a range of logical blocks within a file.  The range
		 * of logical blocks are (start, start + len).  If there are already extents,
		 * the mappings will try to extend the mappings; otherwise, it will try to map
		 * start as if logical block 0 points to goal.  If goal is ~0ULL, then the goal
		 * is calculated based on the inode group.
		 *
		 * Flags:
		 * - EXT2_FALLOCATE_ZERO_BLOCKS: Zero the blocks that are allocated.
		 * - EXT2_FALLOCATE_FORCE_INIT: Create only initialized extents.
		 * - EXT2_FALLOCATE_FORCE_UNINIT: Create only uninitialized extents.
		 * - EXT2_FALLOCATE_INIT_BEYOND_EOF: Create extents beyond EOF.
		 *
		 * If neither FORCE_INIT nor FORCE_UNINIT are specified, this function will
		 * try to expand any extents it finds, zeroing blocks as necessary.
		 */;
	}
	public Object ext2fs_fallocate(Object fs, int flags, Object ino, Object goal, Object start, Object len) {
		ext2_inode inode_buf = new ext2_inode();
		 blk = new ();
		 x = new ();
		 err = 0;
		if (((flags & (true)) && (flags & (true))) || (flags & ~(true))) {
			return EXT2_ET_INVALID_ARGUMENT;
		} 
		if (len > fs.getSuper().ext2fs_blocks_count()) {
			return EXT2_ET_BLOCK_ALLOC_FAIL;
		}  else if (len == 0) {
			return 0;
		} 
		if (!/* Read inode structure if necessary */inode) {
			err = inode_buf.ext2fs_read_inode(fs, ino);
			if (err) {
				return err;
			} 
			inode = inode_buf;
		} 
		;
		Object generatedI_flags = this.getI_flags();
		if (generatedI_flags & -1024) {
			err = inode.extent_fallocate(fs, flags, ino, goal, start, len);
			;
		} 
		for (blk = start; blk < start + len; /* XXX: Allocate a bunch of blocks the slow way */blk++) {
			err = ModernizedCProgram.ext2fs_print_progress(blk, start + /* For Rufus usage */len);
			if (err) {
				return err;
			} 
			err = inode.ext2fs_bmap2(fs, ino, ((Object)0), 0, blk, 0, x);
			if (err) {
				return err;
			} 
			if (x) {
				continue;
			} 
			err = inode.ext2fs_bmap2(fs, ino, ((Object)0), -1024 | -1024 | -1024, blk, 0, x);
			if (err) {
				return err;
			} 
		}
		return err;
	}
	public Object ext2fs_inode_data_blocks(Object fs) {
		return ()inode.ext2fs_inode_data_blocks2(fs);
	}
	public ext2_inode ext2fs_inode(Object large_inode) {
		return (ext2_inode)/* It is always safe to convert large inode to a small inode */large_inode;
	}
	public Object ext2fs_file_open2(Object fs, Object ino, int flags, Object ret) {
		ext2_file_t file = new ext2_file_t();
		 retval = new ();
		/*
			 * Don't let caller create or open a file for writing if the
			 * filesystem is read-only.
			 */
		if ((flags & (-1024 | -1024)) && !(fs.getFlags() & -1024)) {
			return EXT2_ET_RO_FILSYS;
		} 
		retval = ModernizedCProgram.ext2fs_get_mem(, file);
		if (retval) {
			return retval;
		} 
		.memset(file, 0, );
		file.setMagic(EXT2_ET_MAGIC_EXT2_FILE);
		file.setFs(fs);
		file.setIno(ino);
		file.setFlags(flags & -1024);
		if (inode) {
			.memcpy(file.getInode(), inode, );
		} else {
				retval = file.getInode().ext2fs_read_inode(fs, ino);
				if (retval) {
					;
				} 
		} 
		retval = ModernizedCProgram.ext2fs_get_array(3, fs.getBlocksize(), file.getBuf());
		if (retval) {
			;
		} 
		ret = file;
		return 0;
		ModernizedCProgram.ext2fs_free_mem(file);
		return retval;
	}
	public ext2_inode ext2fs_file_get_inode(Object file) {
		if (file.getMagic() != EXT2_ET_MAGIC_EXT2_FILE) {
			return ((Object)0);
		} 
		return file.getInode();
	}
	/*
	 * i_block.c --- Manage the i_block field for i_blocks
	 *
	 * Copyright (C) 2008 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	public Object ext2fs_iblk_add_blocks(Object fs, Object num_blocks) {
		Object generatedI_blocks = this.getI_blocks();
		long b = generatedI_blocks;
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		if (fs.getSuper().ext2fs_has_feature_huge_file()) {
			b += ((long)generatedLinux2.getL_i_blocks_hi()) << 32;
		} 
		Object generatedI_flags = this.getI_flags();
		if (!fs.getSuper().ext2fs_has_feature_huge_file() || !(generatedI_flags & -1024)) {
			num_blocks *= fs.getBlocksize() / 512;
		} 
		num_blocks *= (-1024 << (fs).getCluster_ratio_bits());
		b += num_blocks;
		if (fs.getSuper().ext2fs_has_feature_huge_file()) {
			generatedLinux2.setL_i_blocks_hi(b >> 32);
		}  else if (b > -1024) {
			return EOVERFLOW;
		} 
		this.setI_blocks(b & -1024);
		return 0;
	}
	public Object ext2fs_iblk_sub_blocks(Object fs, Object num_blocks) {
		Object generatedI_blocks = this.getI_blocks();
		long b = generatedI_blocks;
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		if (fs.getSuper().ext2fs_has_feature_huge_file()) {
			b += ((long)generatedLinux2.getL_i_blocks_hi()) << 32;
		} 
		Object generatedI_flags = this.getI_flags();
		if (!fs.getSuper().ext2fs_has_feature_huge_file() || !(generatedI_flags & -1024)) {
			num_blocks *= fs.getBlocksize() / 512;
		} 
		num_blocks *= (-1024 << (fs).getCluster_ratio_bits());
		if (num_blocks > b) {
			return EOVERFLOW;
		} 
		b -= num_blocks;
		if (fs.getSuper().ext2fs_has_feature_huge_file()) {
			generatedLinux2.setL_i_blocks_hi(b >> 32);
		} 
		this.setI_blocks(b & -1024);
		return 0;
	}
	public Object ext2fs_iblk_set(Object fs, Object b) {
		Object generatedI_flags = this.getI_flags();
		if (!fs.getSuper().ext2fs_has_feature_huge_file() || !(generatedI_flags & -1024)) {
			b *= fs.getBlocksize() / 512;
		} 
		b *= (-1024 << (fs).getCluster_ratio_bits());
		this.setI_blocks(b & -1024);
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		if (fs.getSuper().ext2fs_has_feature_huge_file()) {
			generatedLinux2.setL_i_blocks_hi(b >> 32);
		}  else if (b >> 32) {
			return EOVERFLOW;
		} 
		return 0;
	}
	public Object ind_punch(Object fs, Byte block_buf, Object p, int level, Object start, Object count, int max) {
		 retval = new ();
		 b = new ();
		int i;
		 offset = new ();
		 incr = new ();
		int freed = 0;
		incr = -1024 << ((((fs.getSuper()).getS_log_block_size() + 10) - 2) * level);
		for (; i < max; ) {
			if (offset >= start + count) {
				break;
			} 
			if (p == 0 || (offset + incr) <= start) {
				continue;
			} 
			b = p;
			if (level > 0) {
				 start2 = new ();
				retval = ModernizedCProgram.ext2fs_read_ind_block(fs, b, block_buf);
				if (retval) {
					return retval;
				} 
				start2 = (start > offset) ? start - offset : 0;
				retval = inode.ind_punch(fs, block_buf + fs.getBlocksize(), ()block_buf, level - 1, start2, count - offset, fs.getBlocksize() >> 2);
				if (retval) {
					return retval;
				} 
				retval = ModernizedCProgram.ext2fs_write_ind_block(fs, b, block_buf);
				if (retval) {
					return retval;
				} 
				if (!ModernizedCProgram.check_zero_block(block_buf, fs.getBlocksize())) {
					continue;
				} 
			} 
			ModernizedCProgram.ext2fs_block_alloc_stats(fs, b, -1);
			p = 0;
			freed++;
		}
		return inode.ext2fs_iblk_sub_blocks(fs, freed);
	}
	public Object ext2fs_punch_ind(Object fs, Byte block_buf, Object start, Object end) {
		 retval = new ();
		byte buf = 0;
		int level;
		int num = 12;
		Object generatedI_block = this.getI_block();
		 bp = generatedI_block;
		 addr_per_block = new ();
		 max = 12;
		 count = new ();
		if (start > (()~/* Check start/end don't overflow the 2^32-1 indirect block limit */-1024)) {
			return 0;
		} 
		if (end >= (()~-1024) || end - start + 1 >= (()~-1024)) {
			count = (()~-1024) - start;
		} else {
				count = end - start + 1;
		} 
		if (!block_buf) {
			retval = ModernizedCProgram.ext2fs_get_array(3, fs.getBlocksize(), buf);
			if (retval) {
				return retval;
			} 
			block_buf = buf;
		} 
		addr_per_block = ()fs.getBlocksize() >> 2;
		for (level = 0; level < 4; ) {
			if (start < max) {
				retval = inode.ind_punch(fs, block_buf, bp, level, start, count, num);
				if (retval) {
					;
				} 
				if (count > max) {
					count -= max - start;
				} else {
						break;
				} 
				start = 0;
			} else {
					start -= max;
			} 
			bp += num;
			if (level == 0) {
				num = 1;
				max = 1;
			} 
		}
		retval = 0;
		return retval;
	}
	/* Free a range of blocks, respecting cluster boundaries */
	public Object punch_extent_blocks(Object fs, Object ino, Object lfree_start, Object free_start, Object free_count, int freed) {
		 pblk = new ();
		int freed_now = 0;
		 cluster_freed = new ();
		 retval = 0;
		if ((-1024 << (fs).getCluster_ratio_bits()) == /* No bigalloc?  Just free each block. */1) {
			freed += free_count;
			while (free_count-- > 0) {
				ModernizedCProgram.ext2fs_block_alloc_stats2(fs, free_start++, -1);
			}
			return retval/*
				 * Try to free up to the next cluster boundary.  We assume that all
				 * blocks in a logical cluster map to blocks from the same physical
				 * cluster, and that the offsets within the [pl]clusters match.
				 */;
		} 
		if (free_start & ((-1024 << (fs).getCluster_ratio_bits()) - 1)) {
			retval = inode.ext2fs_map_cluster_block(fs, ino, lfree_start, pblk);
			if (retval) {
				;
			} 
			if (!pblk) {
				ModernizedCProgram.ext2fs_block_alloc_stats2(fs, free_start, -1);
				freed_now++;
			} 
			cluster_freed = (-1024 << (fs).getCluster_ratio_bits()) - (free_start & ((-1024 << (fs).getCluster_ratio_bits()) - 1));
			if (cluster_freed > free_count) {
				cluster_freed = free_count;
			} 
			free_count -= cluster_freed;
			free_start += cluster_freed;
			lfree_start += cluster_freed;
		} 
		while (free_count > 0 && free_count >= (int)(-1024 << (fs).getCluster_ratio_bits())) {
			ModernizedCProgram.ext2fs_block_alloc_stats2(fs, free_start, -1);
			freed_now++;
			cluster_freed = (-1024 << (fs).getCluster_ratio_bits());
			free_count -= cluster_freed;
			free_start += cluster_freed;
			lfree_start += cluster_freed;
		}
		if (free_count > /* Try to free the last cluster. */0) {
			retval = inode.ext2fs_map_cluster_block(fs, ino, lfree_start, pblk);
			if (retval) {
				;
			} 
			if (!pblk) {
				ModernizedCProgram.ext2fs_block_alloc_stats2(fs, free_start, -1);
				freed_now++;
			} 
		} 
		return retval;
	}
	public Object ext2fs_punch_extent(Object fs, Object ino, Object start, Object end) {
		ext2_extent_handle_t handle = 0;
		ext2fs_extent extent = new ext2fs_extent();
		 retval = new ();
		 free_start = new ();
		 next = new ();
		 lfree_start = new ();
		 free_count = new ();
		 newlen = new ();
		int freed = 0;
		int op;
		retval = inode.ext2fs_extent_open2(fs, ino, handle);
		if (retval) {
			return retval/*
				 * Find the extent closest to the start of the punch range.  We don't
				 * check the return value because _goto() sets the current node to the
				 * next-lowest extent if 'start' is in a hole, and doesn't set a
				 * current node if there was a real error reading the extent tree.
				 * In that case, _get() will error out.
				 *
				 * Note: If _get() returns 'no current node', that simply means that
				 * there aren't any blocks mapped past this point in the file, so we're
				 * done.
				 */;
		} 
		retval = ModernizedCProgram.ext2fs_extent_goto(handle, start);
		if (retval) {
			;
		} 
		retval = extent.ext2fs_extent_get(handle, -1024);
		if (retval == EXT2_ET_NO_CURRENT_NODE) {
			retval = 0;
			;
		}  else if (retval) {
			;
		} 
		Object generatedE_lblk = extent.getE_lblk();
		Object generatedE_len = extent.getE_len();
		Object generatedE_pblk = extent.getE_pblk();
		Object generatedE_flags = extent.getE_flags();
		do {
		} while (0);
		retval = inode.ext2fs_iblk_sub_blocks(fs, freed);
		return retval;
	}
	public Object ext2fs_punch_inline_data(Object fs, Object ino, Object start, Object end) {
		 retval = new ();
		/*
			 * In libext2fs ext2fs_punch is based on block unit.  So that
			 * means that if start > 0 we don't need to do nothing.  Due
			 * to this we will remove all inline data in ext2fs_punch()
			 * now.
			 */
		if (start > 0) {
			return 0;
		} 
		Object generatedI_block = this.getI_block();
		.memset((byte)generatedI_block, 0, (( * (((12 + 1) + 1) + 1))));
		this.setI_size(0);
		retval = inode.ext2fs_write_inode(fs, ino);
		if (retval) {
			return retval;
		} 
		return ModernizedCProgram.ext2fs_inline_data_ea_remove(fs, ino/*
		 * Deallocate all logical _blocks_ starting at start to end, inclusive.
		 * If end is ~0ULL, then this is effectively truncate.
		 */);
	}
	public Object ext2fs_punch(Object fs, Object ino, Byte block_buf, Object start, Object end) {
		 retval = new ();
		ext2_inode inode_buf = new ext2_inode();
		if (start > end) {
			return 22;
		} 
		if (!/* Read inode structure if necessary */inode) {
			retval = inode_buf.ext2fs_read_inode(fs, ino);
			if (retval) {
				return retval;
			} 
			inode = inode_buf;
		} 
		Object generatedI_flags = this.getI_flags();
		if (generatedI_flags & -1024) {
			return inode.ext2fs_punch_inline_data(fs, ino, start, end);
		}  else if (generatedI_flags & -1024) {
			retval = inode.ext2fs_punch_extent(fs, ino, start, end);
		} else {
				retval = inode.ext2fs_punch_ind(fs, block_buf, start, end);
		} 
		if (retval) {
			return retval;
		} 
		return inode.ext2fs_write_inode(fs, ino);
	}
	public Object implied_cluster_alloc(Object fs, Object ino, Object handle, Object lblk, Object phys_blk) {
		 base_block = new ();
		 pblock = 0;
		int i;
		if (!fs.getSuper().ext2fs_has_feature_bigalloc()) {
			return 0;
		} 
		base_block = lblk & ~((-1024 << (fs).getCluster_ratio_bits()) - 1/*
			 * Except for the logical block (lblk) that was passed in, search all
			 * blocks in this logical cluster for a mapping to a physical cluster.
			 * If any such map exists, calculate the physical block that maps to
			 * the logical block and return that.
			 *
			 * The old code wouldn't even look if (block % cluster_ratio) == 0;
			 * this is incorrect if we're allocating blocks in reverse order.
			 */);
		for (i = 0; i < (-1024 << (fs).getCluster_ratio_bits()); i++) {
			if (base_block + i == lblk) {
				continue;
			} 
			inode.extent_bmap(fs, ino, handle, 0, 0, base_block + i, 0, 0, pblock);
			if (pblock) {
				break;
			} 
		}
		if (pblock == 0) {
			return 0;
		} 
		phys_blk = pblock - i + (lblk - base_block);
		return 0;
	}
	/* Try to map a logical block to an already-allocated physical cluster. */
	public Object ext2fs_map_cluster_block(Object fs, Object ino, Object lblk, Object pblk) {
		ext2_extent_handle_t handle = new ext2_extent_handle_t();
		 retval = new ();
		pblk = /* Need bigalloc and extents to be enabled */0;
		Object generatedI_flags = this.getI_flags();
		if (!fs.getSuper().ext2fs_has_feature_bigalloc() || !(generatedI_flags & -1024)) {
			return 0;
		} 
		retval = inode.ext2fs_extent_open2(fs, ino, handle);
		if (retval) {
			;
		} 
		retval = inode.implied_cluster_alloc(fs, ino, handle, lblk, pblk);
		if (retval) {
			;
		} 
	}
	public Object extent_bmap(Object fs, Object ino, Object handle, Byte block_buf, int bmap_flags, Object block, int ret_flags, Integer blocks_alloc, Object phys_blk) {
		blk_alloc_ctx alloc_ctx = new blk_alloc_ctx();
		ext2fs_extent extent = new ext2fs_extent();
		int offset;
		 retval = 0;
		 blk64 = 0;
		int alloc = 0;
		int set_flags;
		set_flags = bmap_flags & -1024 ? -1024 : 0;
		if (bmap_flags & -1024) {
			retval = ModernizedCProgram.ext2fs_extent_set_bmap(handle, block, phys_blk, set_flags);
			return retval;
		} 
		retval = ModernizedCProgram.ext2fs_extent_goto(handle, block);
		if (retval) {
			if (retval == /* If the extent is not found, return phys_blk = 0 */EXT2_ET_EXTENT_NOT_FOUND) {
				extent.setE_lblk(block);
				;
			} 
			return retval;
		} 
		retval = extent.ext2fs_extent_get(handle, -1024);
		if (retval) {
			return retval;
		} 
		Object generatedE_lblk = extent.getE_lblk();
		offset = block - generatedE_lblk;
		Object generatedE_len = extent.getE_len();
		Object generatedE_pblk = extent.getE_pblk();
		Object generatedE_flags = extent.getE_flags();
		if (block >= generatedE_lblk && (offset <= generatedE_len)) {
			phys_blk = generatedE_pblk + offset;
			if (ret_flags && generatedE_flags & -1024) {
				ret_flags |=  -1024;
			} 
		} 
		return 0;
	}
	public int ext2fs_file_block_offset_too_big(Object fs, Object offset) {
		 addr_per_block = new ();
		 max_map_block = new ();
		if (offset >= (-1024 << 32) - /* Kernel seems to cut us off at 4294967294 blocks */1) {
			return 1;
		} 
		Object generatedI_flags = this.getI_flags();
		if (generatedI_flags & -1024) {
			return 0;
		} 
		addr_per_block = fs.getBlocksize() >> 2;
		max_map_block = addr_per_block;
		max_map_block += addr_per_block * addr_per_block;
		max_map_block += addr_per_block * addr_per_block * addr_per_block;
		max_map_block += 12;
		return offset >= max_map_block;
	}
	public Object ext2fs_bmap2(Object fs, Object ino, Byte block_buf, int bmap_flags, Object block, int ret_flags, Object phys_blk) {
		ext2_inode inode_buf = new ext2_inode();
		ext2_extent_handle_t handle = 0;
		 addr_per_block = new ();
		 b = new ();
		 blk32 = new ();
		 b64 = new ();
		byte buf = 0;
		 retval = 0;
		int blocks_alloc = 0;
		int inode_dirty = 0;
		blk_alloc_ctx alloc_ctx = new blk_alloc_ctx(, , , );
		if (!(bmap_flags & -1024)) {
			phys_blk = 0;
		} 
		if (ret_flags) {
			ret_flags = 0;
		} 
		if (!/* Read inode structure if necessary */inode) {
			retval = inode_buf.ext2fs_read_inode(fs, ino);
			if (retval) {
				return retval;
			} 
			inode = inode_buf;
		} 
		addr_per_block = ()fs.getBlocksize() >> 2;
		if (inode.ext2fs_file_block_offset_too_big(fs, block)) {
			return EXT2_ET_FILE_TOO_BIG/*
				 * If an inode has inline data, that means that it doesn't have
				 * any blocks and we shouldn't map any blocks for it.
				 */;
		} 
		Object generatedI_flags = this.getI_flags();
		if (generatedI_flags & -1024) {
			return EXT2_ET_INLINE_DATA_NO_BLOCK;
		} 
		if (!block_buf) {
			retval = ModernizedCProgram.ext2fs_get_array(2, fs.getBlocksize(), buf);
			if (retval) {
				return retval;
			} 
			block_buf = buf;
		} 
		if (generatedI_flags & -1024) {
			retval = inode.ext2fs_extent_open2(fs, ino, handle);
			if (retval) {
				;
			} 
			retval = inode.extent_bmap(fs, ino, handle, block_buf, bmap_flags, block, ret_flags, blocks_alloc, phys_blk);
			;
		} 
		Object generatedI_block = (inode).getI_block();
		if (block < 12) {
			if (bmap_flags & -1024) {
				b = phys_blk;
				(generatedI_block[(block)]) = b;
				inode_dirty++;
				;
			} 
			phys_blk = (generatedI_block[(block)]);
			b = block ? (generatedI_block[(block - 1)]) : inode.ext2fs_find_inode_goal(fs, ino, block);
			if ((phys_blk == 0) && (bmap_flags & -1024)) {
				b64 = b;
				retval = alloc_ctx.ext2fs_alloc_block3(fs, b64, block_buf, b64);
				b = b64;
				if (retval) {
					;
				} 
				(generatedI_block[(block)]) = b;
				blocks_alloc++;
				phys_blk = b;
			} 
			;
		} 
		block -= /* Indirect block */12;
		blk32 = phys_blk;
		if (block < addr_per_block) {
			b = (generatedI_block[(true)]);
			if (!b) {
				if (!(bmap_flags & -1024)) {
					if (bmap_flags & -1024) {
						retval = EXT2_ET_SET_BMAP_NO_IND;
					} 
					;
				} 
				b = (generatedI_block[(12 - 1)]);
				b64 = b;
				retval = alloc_ctx.ext2fs_alloc_block3(fs, b64, block_buf, b64);
				b = b64;
				if (retval) {
					;
				} 
				(generatedI_block[(true)]) = b;
				blocks_alloc++;
			} 
			retval = ModernizedCProgram.block_ind_bmap(fs, bmap_flags, b, block_buf, blocks_alloc, block, blk32);
			if (retval == 0) {
				phys_blk = blk32;
			} 
			;
		} 
		block -= /* Doubly indirect block  */addr_per_block;
		if (block < addr_per_block * addr_per_block) {
			b = (generatedI_block[((12 + 1))]);
			if (!b) {
				if (!(bmap_flags & -1024)) {
					if (bmap_flags & -1024) {
						retval = EXT2_ET_SET_BMAP_NO_IND;
					} 
					;
				} 
				b = (generatedI_block[(true)]);
				b64 = b;
				retval = alloc_ctx.ext2fs_alloc_block3(fs, b64, block_buf, b64);
				b = b64;
				if (retval) {
					;
				} 
				(generatedI_block[((12 + 1))]) = b;
				blocks_alloc++;
			} 
			retval = ModernizedCProgram.block_dind_bmap(fs, bmap_flags, b, block_buf, blocks_alloc, block, blk32);
			if (retval == 0) {
				phys_blk = blk32;
			} 
			;
		} 
		block -= addr_per_block * /* Triply indirect block */addr_per_block;
		b = (generatedI_block[(((12 + 1) + 1))]);
		if (!b) {
			if (!(bmap_flags & -1024)) {
				if (bmap_flags & -1024) {
					retval = EXT2_ET_SET_BMAP_NO_IND;
				} 
				;
			} 
			b = (generatedI_block[((12 + 1))]);
			b64 = b;
			retval = alloc_ctx.ext2fs_alloc_block3(fs, b64, block_buf, b64);
			b = b64;
			if (retval) {
				;
			} 
			(generatedI_block[(((12 + 1) + 1))]) = b;
			blocks_alloc++;
		} 
		retval = ModernizedCProgram.block_tind_bmap(fs, bmap_flags, b, block_buf, blocks_alloc, block, blk32);
		if (retval == 0) {
			phys_blk = blk32;
		} 
		if (buf) {
			ModernizedCProgram.ext2fs_free_mem(buf);
		} 
		if (handle) {
			ModernizedCProgram.ext2fs_extent_free(handle);
		} 
		if ((retval == 0) && (blocks_alloc || inode_dirty)) {
			inode.ext2fs_iblk_add_blocks(fs, blocks_alloc);
			retval = inode.ext2fs_write_inode(fs, ino);
		} 
		return retval;
	}
	/*
	 * bmap.c --- logical to physical block mapping
	 *
	 * Copyright (C) 1997 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	public Object ext2fs_bmap(Object fs, Object ino, Byte block_buf, int bmap_flags, Object block, Object phys_blk) {
		 ret = new ();
		 ret_blk = phys_blk;
		ret = inode.ext2fs_bmap2(fs, ino, block_buf, bmap_flags, block, 0, ret_blk);
		if (ret) {
			return ret;
		} 
		if (ret_blk >= ((long)1 << 32)) {
			return EOVERFLOW;
		} 
		phys_blk = ret_blk;
		return 0;
	}
	public Object ext2fs_extent_open2(Object fs, Object ino, Object ret_handle) {
		ext2_extent_handle handle = new ext2_extent_handle();
		 retval = new ();
		int i;
		ext3_extent_header eh = new ext3_extent_header();
		if (!(fs) || (fs).getMagic() != (EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return (EXT2_ET_MAGIC_EXT2FS_FILSYS);
		} 
		if (!inode) {
			if ((ino == 0) || (ino > fs.getSuper().getS_inodes_count())) {
				return EXT2_ET_BAD_INODE_NUM;
			} 
		} 
		retval = ModernizedCProgram.ext2fs_get_mem(, handle);
		if (retval) {
			return retval;
		} 
		.memset(handle, 0, );
		handle.setIno(ino);
		handle.setFs(fs);
		ext2_inode generatedInodebuf = handle.getInodebuf();
		ext2_inode generatedInode = handle.getInode();
		if (inode) {
			handle.setInode(inode);
		} else {
				handle.setInode(generatedInodebuf);
				retval = generatedInode.ext2fs_read_inode(fs, ino);
				if (retval) {
					;
				} 
		} 
		Object generatedI_block = generatedInode.getI_block();
		eh = (ext3_extent_header)generatedI_block[0];
		for (i = 0; i < (((12 + 1) + 1) + 1); i++) {
			if (generatedI_block[i]) {
				break;
			} 
		}
		Object generatedI_flags = generatedInode.getI_flags();
		if (i >= (((12 + 1) + 1) + 1)) {
			eh.setExt3_extent_header(.ext2fs_cpu_to_le16(EXT3_EXT_MAGIC));
			eh.setExt3_extent_header(0);
			eh.setExt3_extent_header(0);
			i = ( - ) / ;
			eh.setExt3_extent_header(.ext2fs_cpu_to_le16(i));
			generatedI_flags |=  -1024;
		} 
		if (!(generatedI_flags & -1024)) {
			retval = EXT2_ET_INODE_NOT_EXTENT;
			;
		} 
		retval = ModernizedCProgram.ext2fs_extent_header_verify(eh, );
		if (retval) {
			;
		} 
		Object generatedExt3_extent_header = eh.getExt3_extent_header();
		handle.setMax_depth(.ext2fs_le16_to_cpu(generatedExt3_extent_header));
		handle.setType(.ext2fs_le16_to_cpu(generatedExt3_extent_header));
		int generatedMax_depth = handle.getMax_depth();
		handle.setMax_paths(generatedMax_depth + 1);
		int generatedMax_paths = handle.getMax_paths();
		extent_path generatedPath = handle.getPath();
		retval = ModernizedCProgram.ext2fs_get_memzero(generatedMax_paths * , generatedPath);
		generatedPath[0].setBuf((byte)generatedI_block);
		generatedPath[0].setLeft(generatedPath[0].setEntries(.ext2fs_le16_to_cpu(generatedExt3_extent_header)));
		generatedPath[0].setMax_entries(.ext2fs_le16_to_cpu(generatedExt3_extent_header));
		generatedPath[0].setCurr(0);
		Object generatedI_size = (generatedInode).getI_size();
		generatedPath[0].setEnd_blk(((generatedI_size | (.UNRECOGNIZEDFUNCTIONNAME(generatedInode).getI_size_high() << 32)) + fs.getBlocksize() - 1) >> ((fs.getSuper()).getS_log_block_size() + 10));
		generatedPath[0].setVisit_num(1);
		handle.setLevel(0);
		handle.setMagic(EXT2_ET_MAGIC_EXTENT_HANDLE);
		ret_handle = handle;
		return 0;
		return retval/*
		 * This function is responsible for (optionally) moving through the
		 * extent tree and then returning the current extent
		 */;
	}
	public Object ext2fs_fix_extents_checksums(Object fs, Object ino) {
		ext2_extent_handle_t handle = new ext2_extent_handle_t();
		ext2fs_extent extent = new ext2fs_extent();
		 errcode = new ();
		int save_flags = fs.getFlags();
		Object generatedI_flags = this.getI_flags();
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum() || (inode && !(generatedI_flags & -1024))) {
			return 0;
		} 
		errcode = inode.ext2fs_extent_open2(fs, ino, handle);
		if (errcode) {
			if (errcode == EXT2_ET_INODE_NOT_EXTENT) {
				errcode = 0;
			} 
			return errcode;
		} 
		fs.getFlags() &=  ~-1024;
		errcode = extent.ext2fs_extent_get(handle, -1024);
		if (errcode) {
			;
		} 
		Object generatedE_flags = extent.getE_flags();
		do {
			if (generatedE_flags & /* Skip to the end of a block of leaf nodes */-1024) {
				errcode = extent.ext2fs_extent_get(handle, -1024);
				if (errcode) {
					break;
				} 
			} 
			errcode = extent.ext2fs_extent_get(handle, -1024);
			if (errcode == EXT2_ET_EXTENT_CSUM_INVALID) {
				errcode = ModernizedCProgram.update_path(handle);
			} 
		} while (errcode == 0);
		ModernizedCProgram.ext2fs_extent_free(handle);
		fs.setFlags(save_flags);
		return errcode/*
		 * Override debugfs's prompt
		 */;
	}
	public Object ext2fs_inode_data_blocks2(Object fs) {
		Object generatedExt2_inode = this.getExt2_inode();
		return (generatedExt2_inode | (fs.getSuper().ext2fs_has_feature_huge_file() ? ()generatedExt2_inode.getLinux2().getL_i_blocks_hi() << 32 : 0)) - (generatedExt2_inode ? .EXT2_CLUSTER_SIZE(fs.getSuper()) >> 9 : 0/*
		 * Return the inode i_blocks count
		 */);
	}
	public Object ext2fs_inode_i_blocks(Object fs) {
		Object generatedExt2_inode = this.getExt2_inode();
		return (generatedExt2_inode | (fs.getSuper().ext2fs_has_feature_huge_file() ? ()generatedExt2_inode.getLinux2().getL_i_blocks_hi() << 32 : 0/*
		 * Return the fs block count
		 */));
	}
	public void ext2fs_file_acl_block_set(Object fs, Object blk) {
		this.setExt2_inode(blk);
		Object generatedExt2_inode = this.getExt2_inode();
		if (fs && fs.getSuper().ext2fs_has_feature_64bit()) {
			generatedExt2_inode.getLinux2().setL_i_file_acl_high(()blk >> 32/*
			 * Set the size of the inode
			 */);
		} 
	}
	public Object ext2fs_inode_size_set(Object fs, Object size) {
		Object generatedExt2_inode = this.getExt2_inode();
		if (!(((generatedExt2_inode) & 170000) == 100000) && (size >> /* Only regular files get to be larger than 4GB */32)) {
			return EXT2_ET_FILE_TOO_BIG;
		} 
		if ((((generatedExt2_inode) & 170000) == /* If we're writing a large file, set the large_file flag */100000) && ModernizedCProgram.ext2fs_needs_large_file_feature(size) && (!fs.getSuper().ext2fs_has_feature_large_file() || fs.getSuper().getExt2_super_block() == EXT2_GOOD_OLD_REV)) {
			fs.getSuper().ext2fs_set_feature_large_file();
			ModernizedCProgram.ext2fs_update_dynamic_rev(fs);
			ModernizedCProgram.ext2fs_mark_super_dirty(fs);
		} 
		this.setExt2_inode(size & -1024);
		this.setExt2_inode((size >> 32));
		return 0;
	}
	public Object ext2fs_find_inode_goal(Object fs, Object ino, Object lblk) {
		 group = new ();
		 log_flex = new ();
		ext2fs_extent extent = new ext2fs_extent();
		ext2_extent_handle_t handle = ((Object)0);
		 err = new ();
		/* Make sure data stored in inode->i_block is neither fast symlink nor
			 * inline data.
			 */
		Object generatedI_flags = this.getI_flags();
		if (inode == ((Object)0) || inode.ext2fs_is_fast_symlink() || generatedI_flags & -1024) {
			;
		} 
		Object generatedE_pblk = extent.getE_pblk();
		Object generatedE_lblk = extent.getE_lblk();
		if (generatedI_flags & -1024) {
			err = inode.ext2fs_extent_open2(fs, ino, handle);
			if (err) {
				;
			} 
			err = ModernizedCProgram.ext2fs_extent_goto2(handle, 0, lblk);
			if (err) {
				;
			} 
			err = extent.ext2fs_extent_get(handle, -1024);
			if (err) {
				;
			} 
			ModernizedCProgram.ext2fs_extent_free(handle);
			return generatedE_pblk + (lblk - generatedE_lblk);
		} 
		Object generatedI_block = this.getI_block();
		if (generatedI_block[/* block mapped file; see if block zero is mapped? */0]) {
			return generatedI_block[0];
		} 
		log_flex = fs.getSuper().getS_log_groups_per_flex();
		group = ModernizedCProgram.ext2fs_group_of_ino(fs, ino);
		if (log_flex) {
			group = group & ~((1 << (log_flex)) - 1);
		} 
		return ModernizedCProgram.ext2fs_group_first_block2(fs, group/*
		 * Starting at _goal_, scan around the filesystem to find a run of free blocks
		 * that's at least _len_ blocks long.  Possible flags:
		 * - EXT2_NEWRANGE_EXACT_GOAL: The range of blocks must start at _goal_.
		 * - EXT2_NEWRANGE_MIN_LENGTH: do not return a allocation shorter than _len_.
		 * - EXT2_NEWRANGE_ZERO_BLOCKS: Zero blocks pblk to pblk+plen before returning.
		 *
		 * The starting block is returned in _pblk_ and the length is returned via
		 * _plen_.  The blocks are not marked in the bitmap; the caller must mark
		 * however much of the returned run they actually use, hopefully via
		 * ext2fs_block_alloc_stats_range().
		 *
		 * This function can return a range that is longer than what was requested.
		 */);
	}
	public ext2_inode EXT2_INODE(ext2_inode_large large_inode) {
		return (ext2_inode)large_inode/*
		 * File system states
		 *//* Unmounted cleanly *//* Errors detected *//* Orphans being recovered *//*
		 * Misc. filesystem flags
		 */;
	}
	public int ext2fs_is_fast_symlink() {
		Object generatedI_mode = this.getI_mode();
		Object generatedI_size = (inode).getI_size();
		Object generatedI_block = this.getI_block();
		return (((generatedI_mode) & 170000) == 120000) && (generatedI_size | (.UNRECOGNIZEDFUNCTIONNAME(inode).getI_size_high() << 32)) && (generatedI_size | (.UNRECOGNIZEDFUNCTIONNAME(inode).getI_size_high() << 32)) < ;
	}
	public Object ext2fs_get_next_inode_full(Object scan, Object ino, int bufsize) {
		 retval = new ();
		int extra_bytes = 0;
		int length;
		ext2_inode_large iptr = (ext2_inode_large)inode;
		byte iblock_status;
		int iblk;
		if (!(scan) || (scan).getMagic() != (EXT2_ET_MAGIC_INODE_SCAN)) {
			return (EXT2_ET_MAGIC_INODE_SCAN);
		} 
		length = (((scan.getFs().getSuper()).getS_rev_level() == 0) ? 128 : (scan.getFs().getSuper()).getS_inode_size());
		iblock_status = ((scan).getTemp_buffer() + (scan).getInode_size());
		if ((scan.getScan_flags() & -1024) && (ModernizedCProgram.ext2fs_bg_flags_test(scan.getFs(), scan.getCurrent_group(), -1024))) {
			;
		} 
		if (scan.getInodes_left() == 0) {
			;
		} 
		if (scan.getCurrent_block() == 0) {
			if (scan.getScan_flags() & -1024) {
				;
			} else {
					return EXT2_ET_MISSING_INODE_TABLE;
			} 
		} 
		if (scan.getBytes_left() < scan.getInode_size()) {
			if (scan.getBytes_left()) {
				.memcpy(scan.getTemp_buffer(), scan.getPtr(), scan.getBytes_left());
			} 
			extra_bytes = scan.getBytes_left();
			retval = ModernizedCProgram.get_next_blocks(scan);
			if (retval) {
				return retval/*
						 * XXX test  Need check for used inode somehow.
						 * (Note: this is hard.)
						 */;
			} 
		} 
		if (bufsize < length) {
			retval = ModernizedCProgram.ext2fs_get_mem(length, iptr);
			if (retval) {
				return retval;
			} 
		} 
		retval = 0;
		iblk = scan.getCurrent_inode() % ((scan.getFs().getSuper()).getS_inodes_per_group()) / (((1 << 10) << (scan.getFs().getSuper()).getS_log_block_size()) / (((scan.getFs().getSuper()).getS_rev_level() == 0) ? 128 : (scan.getFs().getSuper()).getS_inode_size())) % scan.getInode_buffer_blocks();
		if (extra_bytes) {
			.memcpy(scan.getTemp_buffer() + extra_bytes, scan.getPtr(), scan.getInode_size() - extra_bytes);
			scan.getPtr() += scan.getInode_size() - extra_bytes;
			scan.getBytes_left() -= scan.getInode_size() - extra_bytes;
			if (!(iblock_status[iblk] & /* Verify the inode checksum. */1) && !(scan.getFs().getFlags() & -1024) && !(ext2_inode_large)scan.getTemp_buffer().ext2fs_inode_csum_verify(scan.getFs(), scan.getCurrent_inode() + 1)) {
				retval = EXT2_ET_INODE_CSUM_INVALID;
			} 
			.memcpy(iptr, scan.getTemp_buffer(), length);
			if (scan.getScan_flags() & -1024) {
				retval = EXT2_ET_BAD_BLOCK_IN_INODE_TABLE;
			} 
			scan.getScan_flags() &=  ~-1024;
		} else {
				if (!(iblock_status[iblk] & /* Verify the inode checksum. */1) && !(scan.getFs().getFlags() & -1024) && !(ext2_inode_large)scan.getPtr().ext2fs_inode_csum_verify(scan.getFs(), scan.getCurrent_inode() + 1)) {
					retval = EXT2_ET_INODE_CSUM_INVALID;
				} 
				.memcpy(iptr, scan.getPtr(), length);
				scan.getPtr() += scan.getInode_size();
				scan.getBytes_left() -= scan.getInode_size();
				if (scan.getScan_flags() & -1024) {
					retval = EXT2_ET_BAD_BLOCK_IN_INODE_TABLE;
				} 
		} 
		if ((iblock_status[iblk] & 2) && (retval == 0 || retval == EXT2_ET_INODE_CSUM_INVALID)) {
			retval = EXT2_ET_INODE_IS_GARBAGE;
		} 
		scan.getInodes_left()--;
		scan.getCurrent_inode()++;
		ino = scan.getCurrent_inode();
		if (iptr != (ext2_inode_large)inode) {
			.memcpy(inode, iptr, bufsize);
			ModernizedCProgram.ext2fs_free_mem(iptr);
		} 
		return retval;
	}
	public Object ext2fs_get_next_inode(Object scan, Object ino) {
		return inode.ext2fs_get_next_inode_full(scan, ino, /*
		 * Functions to read and write a single inode.
		 */);
	}
	public Object ext2fs_read_inode2(Object fs, Object ino, int bufsize, int flags) {
		 block_nr = new ();
		 group = new ();
		long block;
		long offset;
		byte ptr;
		 retval = new ();
		int i;
		int clen;
		int inodes_per_block;
		 io = new ();
		int length = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		ext2_inode_large iptr = new ext2_inode_large();
		int cache_slot;
		int fail_csum;
		if (!(fs) || (fs).getMagic() != (EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return (EXT2_ET_MAGIC_EXT2FS_FILSYS);
		} 
		if (fs.getRead_inode() && ((bufsize == ) || ((((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size()) == ))) {
			retval = .UNRECOGNIZEDFUNCTIONNAME(fs, ino, inode);
			if (retval != EXT2_ET_CALLBACK_NOTHANDLED) {
				return retval;
			} 
		} 
		if ((ino == 0) || (ino > fs.getSuper().getS_inodes_count())) {
			return EXT2_ET_BAD_INODE_NUM;
		} 
		if (!fs.getIcache()) {
			retval = ModernizedCProgram.ext2fs_create_inode_cache(fs, 4);
			if (retval) {
				return retval;
			} 
		} 
		for (i = 0; i < fs.getIcache().getCache_size(); /* Check to see if it's in the inode cache */i++) {
			if (fs.getIcache().getCache()[i].getExt2_inode_cache_ent() == ino) {
				.memcpy(inode, fs.getIcache().getCache()[i].getExt2_inode_cache_ent(), (bufsize > length) ? length : bufsize);
				return 0;
			} 
		}
		if (fs.getFlags() & -1024) {
			inodes_per_block = fs.getBlocksize() / (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
			block_nr = .ext2fs_le32_to_cpu(fs.getImage_header().getExt2_image_hdr()) / fs.getBlocksize();
			block_nr += (ino - 1) / inodes_per_block;
			offset = ((ino - 1) % inodes_per_block) * (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
			io = fs.getImage_io();
		} else {
				group = (ino - 1) / ((fs.getSuper()).getS_inodes_per_group());
				if (group > fs.getGroup_desc_count()) {
					return EXT2_ET_BAD_INODE_NUM;
				} 
				offset = ((ino - 1) % ((fs.getSuper()).getS_inodes_per_group())) * (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
				block = offset >> ((fs.getSuper()).getS_log_block_size() + 10);
				block_nr = ModernizedCProgram.ext2fs_inode_table_loc(fs, group);
				if (!block_nr) {
					return EXT2_ET_MISSING_INODE_TABLE;
				} 
				if ((block_nr < fs.getSuper().getS_first_data_block()) || (block_nr + fs.getInode_blocks_per_group() - 1 >= fs.getSuper().ext2fs_blocks_count())) {
					return EXT2_ET_GDESC_BAD_INODE_TABLE;
				} 
				block_nr += block;
				io = fs.getIo();
		} 
		offset &=  (((1 << 10) << (fs.getSuper()).getS_log_block_size()) - 1);
		cache_slot = (fs.getIcache().getCache_last() + 1) % fs.getIcache().getCache_size();
		iptr = (ext2_inode_large)fs.getIcache().getCache()[cache_slot].getExt2_inode_cache_ent();
		ptr = (byte)iptr;
		while (length) {
			clen = length;
			if ((offset + length) > fs.getBlocksize()) {
				clen = fs.getBlocksize() - offset;
			} 
			if (block_nr != fs.getIcache().getBuffer_blk()) {
				retval = ModernizedCProgram.io_channel_read_blk64(io, block_nr, 1, fs.getIcache().getBuffer());
				if (retval) {
					return retval;
				} 
				fs.getIcache().setBuffer_blk(block_nr);
			} 
			.memcpy(ptr, ((byte)fs.getIcache().getBuffer()) + (int)offset, clen);
			offset = 0;
			length -= clen;
			ptr += clen;
			block_nr++;
		}
		length = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		fail_csum = !/* Verify the inode checksum. */iptr.ext2fs_inode_csum_verify(fs, ino);
		if (!/* Update the inode cache bookkeeping */fail_csum) {
			fs.getIcache().setCache_last(cache_slot);
			fs.getIcache().getCache()[cache_slot].setExt2_inode_cache_ent(ino);
		} 
		.memcpy(inode, iptr, (bufsize > length) ? length : bufsize);
		if (!(fs.getFlags() & -1024) && !(flags & -1024) && fail_csum) {
			return EXT2_ET_INODE_CSUM_INVALID;
		} 
		return 0;
	}
	public Object ext2fs_read_inode_full(Object fs, Object ino, int bufsize) {
		return inode.ext2fs_read_inode2(fs, ino, bufsize, 0);
	}
	public Object ext2fs_read_inode(Object fs, Object ino) {
		return inode.ext2fs_read_inode2(fs, ino, , 0);
	}
	public Object ext2fs_write_inode2(Object fs, Object ino, int bufsize, int flags) {
		 block_nr = new ();
		 group = new ();
		long block;
		long offset;
		 retval = 0;
		ext2_inode_large w_inode = new ext2_inode_large();
		byte ptr;
		int i;
		int clen;
		int length = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		if (!(fs) || (fs).getMagic() != (EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return (EXT2_ET_MAGIC_EXT2FS_FILSYS);
		} 
		if (fs.getWrite_inode()) {
			retval = .UNRECOGNIZEDFUNCTIONNAME(fs, ino, inode);
			if (retval != EXT2_ET_CALLBACK_NOTHANDLED) {
				return retval;
			} 
		} 
		if ((ino == 0) || (ino > fs.getSuper().getS_inodes_count())) {
			return EXT2_ET_BAD_INODE_NUM;
		} 
		retval = ModernizedCProgram.ext2fs_get_mem(length, /* Prepare our shadow buffer for read/modify/byteswap/write */w_inode);
		if (retval) {
			return retval;
		} 
		if (bufsize < length) {
			retval = (ext2_inode)w_inode.ext2fs_read_inode2(fs, ino, length, -1024);
			if (retval) {
				;
			} 
		} 
		if (fs.getIcache()) {
			for (i = 0; i < fs.getIcache().getCache_size(); i++) {
				if (fs.getIcache().getCache()[i].getExt2_inode_cache_ent() == ino) {
					.memcpy(fs.getIcache().getCache()[i].getExt2_inode_cache_ent(), inode, (bufsize > length) ? length : bufsize);
					break;
				} 
			}
		} else {
				retval = ModernizedCProgram.ext2fs_create_inode_cache(fs, 4);
				if (retval) {
					;
				} 
		} 
		.memcpy(w_inode, inode, (bufsize > length) ? length : bufsize);
		if (!(fs.getFlags() & -1024)) {
			retval = EXT2_ET_RO_FILSYS;
			;
		} 
		if ((flags & -1024) == 0) {
			retval = w_inode.ext2fs_inode_csum_set(fs, ino);
			if (retval) {
				;
			} 
		} 
		group = (ino - 1) / ((fs.getSuper()).getS_inodes_per_group());
		offset = ((ino - 1) % ((fs.getSuper()).getS_inodes_per_group())) * (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		block = offset >> ((fs.getSuper()).getS_log_block_size() + 10);
		block_nr = ModernizedCProgram.ext2fs_inode_table_loc(fs, (int)group);
		if (!block_nr) {
			retval = EXT2_ET_MISSING_INODE_TABLE;
			;
		} 
		if ((block_nr < fs.getSuper().getS_first_data_block()) || (block_nr + fs.getInode_blocks_per_group() - 1 >= fs.getSuper().ext2fs_blocks_count())) {
			retval = EXT2_ET_GDESC_BAD_INODE_TABLE;
			;
		} 
		block_nr += block;
		offset &=  (((1 << 10) << (fs.getSuper()).getS_log_block_size()) - 1);
		ptr = (byte)w_inode;
		while (length) {
			clen = length;
			if ((offset + length) > fs.getBlocksize()) {
				clen = fs.getBlocksize() - offset;
			} 
			if (fs.getIcache().getBuffer_blk() != block_nr) {
				retval = ModernizedCProgram.io_channel_read_blk64(fs.getIo(), block_nr, 1, fs.getIcache().getBuffer());
				if (retval) {
					;
				} 
				fs.getIcache().setBuffer_blk(block_nr);
			} 
			.memcpy((byte)fs.getIcache().getBuffer() + (int)offset, ptr, clen);
			retval = ModernizedCProgram.io_channel_write_blk64(fs.getIo(), block_nr, 1, fs.getIcache().getBuffer());
			if (retval) {
				;
			} 
			offset = 0;
			ptr += clen;
			length -= clen;
			block_nr++;
		}
		fs.getFlags() |=  -1024;
		return retval;
	}
	public Object ext2fs_write_inode_full(Object fs, Object ino, int bufsize) {
		return inode.ext2fs_write_inode2(fs, ino, bufsize, 0);
	}
	public Object ext2fs_write_inode(Object fs, Object ino) {
		return inode.ext2fs_write_inode2(fs, ino, , 0/*
		 * This function should be called when writing a new inode.  It makes
		 * sure that extra part of large inodes is initialized properly.
		 */);
	}
	public Object ext2fs_write_new_inode(Object fs, Object ino) {
		ext2_inode buf = new ext2_inode();
		int size = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		ext2_inode_large large_inode = new ext2_inode_large();
		 retval = new ();
		 t = fs.getNow() ? fs.getNow() : .time(((Object)0));
		Object generatedI_ctime = this.getI_ctime();
		if (!generatedI_ctime) {
			this.setI_ctime(t);
		} 
		Object generatedI_mtime = this.getI_mtime();
		if (!generatedI_mtime) {
			this.setI_mtime(t);
		} 
		Object generatedI_atime = this.getI_atime();
		if (!generatedI_atime) {
			this.setI_atime(t);
		} 
		if (size == ) {
			return inode.ext2fs_write_inode_full(fs, ino, );
		} 
		buf = .malloc(size);
		if (!buf) {
			return 12;
		} 
		.memset(buf, 0, size);
		buf = inode;
		large_inode = (ext2_inode_large)buf;
		large_inode.setI_extra_isize( - 128);
		Object generatedI_crtime = large_inode.getI_crtime();
		if (!generatedI_crtime) {
			large_inode.setI_crtime(t);
		} 
		retval = buf.ext2fs_write_inode_full(fs, ino, size);
		.free(buf);
		return retval;
	}
	public Object getI_mode() {
		return i_mode;
	}
	public void setI_mode(Object newI_mode) {
		i_mode = newI_mode;
	}
	public Object getI_uid() {
		return i_uid;
	}
	public void setI_uid(Object newI_uid) {
		i_uid = newI_uid;
	}
	public Object getI_size() {
		return i_size;
	}
	public void setI_size(Object newI_size) {
		i_size = newI_size;
	}
	public Object getI_atime() {
		return i_atime;
	}
	public void setI_atime(Object newI_atime) {
		i_atime = newI_atime;
	}
	public Object getI_ctime() {
		return i_ctime;
	}
	public void setI_ctime(Object newI_ctime) {
		i_ctime = newI_ctime;
	}
	public Object getI_mtime() {
		return i_mtime;
	}
	public void setI_mtime(Object newI_mtime) {
		i_mtime = newI_mtime;
	}
	public Object getI_dtime() {
		return i_dtime;
	}
	public void setI_dtime(Object newI_dtime) {
		i_dtime = newI_dtime;
	}
	public Object getI_gid() {
		return i_gid;
	}
	public void setI_gid(Object newI_gid) {
		i_gid = newI_gid;
	}
	public Object getI_links_count() {
		return i_links_count;
	}
	public void setI_links_count(Object newI_links_count) {
		i_links_count = newI_links_count;
	}
	public Object getI_blocks() {
		return i_blocks;
	}
	public void setI_blocks(Object newI_blocks) {
		i_blocks = newI_blocks;
	}
	public Object getI_flags() {
		return i_flags;
	}
	public void setI_flags(Object newI_flags) {
		i_flags = newI_flags;
	}
	public  getOsd1() {
		return osd1;
	}
	public void setOsd1( newOsd1) {
		osd1 = newOsd1;
	}
	public Object getI_block() {
		return i_block;
	}
	public void setI_block(Object newI_block) {
		i_block = newI_block;
	}
	public Object getI_generation() {
		return i_generation;
	}
	public void setI_generation(Object newI_generation) {
		i_generation = newI_generation;
	}
	public Object getI_file_acl() {
		return i_file_acl;
	}
	public void setI_file_acl(Object newI_file_acl) {
		i_file_acl = newI_file_acl;
	}
	public Object getI_size_high() {
		return i_size_high;
	}
	public void setI_size_high(Object newI_size_high) {
		i_size_high = newI_size_high;
	}
	public Object getI_faddr() {
		return i_faddr;
	}
	public void setI_faddr(Object newI_faddr) {
		i_faddr = newI_faddr;
	}
	public  getOsd2() {
		return osd2;
	}
	public void setOsd2( newOsd2) {
		osd2 = newOsd2;
	}
}
/* Signed dirhash in use */
/* Unsigned dirhash in use */
/* OK for use on development code */
/* This is a snapshot image */
/* Snapshot inodes corrupted */
/* Exclude bitmaps corrupted */
/*
 * Mount flags
 */
/* Do mount-time checks */
/* Create files with directory's group */
/* Some debugging messages */
/* Continue on errors */
/* Remount fs ro on errors */
/* Panic on errors */
/* Mimics the Minix statfs */
/* Disable 32-bit UIDs */
/*
 * Maximal mount counts between two filesystem checks
 */
/* Allow 20 mounts */
/* Don't use interval check */
/*
 * Behaviour when detecting errors
 */
