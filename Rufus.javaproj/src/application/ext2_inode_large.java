package application;

public class ext2_inode_large {
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
	private Object i_extra_isize;
	private Object i_checksum_hi;
	private Object i_ctime_extra;
	private Object i_mtime_extra;
	private Object i_atime_extra;
	private Object i_crtime;
	private Object i_crtime_extra;
	private Object i_version_hi;
	private Object i_projid;
	
	public ext2_inode_large(Object i_mode, Object i_uid, Object i_size, Object i_atime, Object i_ctime, Object i_mtime, Object i_dtime, Object i_gid, Object i_links_count, Object i_blocks, Object i_flags,  osd1, Object i_block, Object i_generation, Object i_file_acl, Object i_size_high, Object i_faddr,  osd2, Object i_extra_isize, Object i_checksum_hi, Object i_ctime_extra, Object i_mtime_extra, Object i_atime_extra, Object i_crtime, Object i_crtime_extra, Object i_version_hi, Object i_projid) {
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
		setI_extra_isize(i_extra_isize);
		setI_checksum_hi(i_checksum_hi);
		setI_ctime_extra(i_ctime_extra);
		setI_mtime_extra(i_mtime_extra);
		setI_atime_extra(i_atime_extra);
		setI_crtime(i_crtime);
		setI_crtime_extra(i_crtime_extra);
		setI_version_hi(i_version_hi);
		setI_projid(i_projid);
	}
	public ext2_inode_large() {
	}
	
	public Object ext2fs_free_ext_attr(Object fs, Object ino) {
		ext2_ext_attr_header header = new ext2_ext_attr_header();
		Object block_buf = ((Object)0);
		 blk = new ();
		 err = new ();
		ext2_inode_large i = new ext2_inode_large();
		if (inode == ((Object)/* Read inode? */0)) {
			err = (ext2_inode)i.ext2fs_read_inode_full(fs, ino, );
			if (err) {
				return err;
			} 
			inode = i;
		} 
		blk = ModernizedCProgram.ext2fs_file_acl_block(fs, (ext2_inode)/* Do we already have an EA block? */inode);
		if (blk == 0) {
			return 0;
		} 
		if ((blk < fs.getSuper().getS_first_data_block()) || (blk >= fs.getSuper().ext2fs_blocks_count())) {
			err = EXT2_ET_BAD_EA_BLOCK_NUM;
			;
		} 
		err = ModernizedCProgram.ext2fs_get_mem(fs.getBlocksize(), block_buf);
		if (err) {
			;
		} 
		err = ModernizedCProgram.ext2fs_read_ext_attr3(fs, blk, block_buf, ino);
		if (err) {
			;
		} 
		header = (ext2_ext_attr_header)/* We only know how to deal with v2 EA blocks */block_buf;
		Object generatedH_magic = header.getH_magic();
		if (generatedH_magic != -1024) {
			err = EXT2_ET_BAD_EA_HEADER;
			;
		} 
		Object generatedH_refcount = header.getH_refcount();
		generatedH_refcount--;
		err = ModernizedCProgram.ext2fs_write_ext_attr3(fs, blk, block_buf, ino);
		if (err) {
			;
		} 
		(ext2_inode)inode.ext2fs_file_acl_block_set(fs, /* Erase link to block */0);
		if (generatedH_refcount == 0) {
			ModernizedCProgram.ext2fs_block_alloc_stats2(fs, blk, -1);
		} 
		err = (ext2_inode)inode.ext2fs_iblk_sub_blocks(fs, 1);
		if (err) {
			;
		} 
		if (inode == /* Write inode? */i) {
			err = (ext2_inode)i.ext2fs_write_inode_full(fs, ino, );
			if (err) {
				;
			} 
		} 
	}
	public Object prep_ea_block_for_write(Object fs, Object ino) {
		ext2_ext_attr_header header = new ext2_ext_attr_header();
		Object block_buf = ((Object)0);
		 blk = new ();
		 goal = new ();
		 err = new ();
		blk = ModernizedCProgram.ext2fs_file_acl_block(fs, (ext2_inode)/* Do we already have an EA block? */inode);
		Object generatedH_magic = header.getH_magic();
		Object generatedH_refcount = header.getH_refcount();
		if (blk != 0) {
			if ((blk < fs.getSuper().getS_first_data_block()) || (blk >= fs.getSuper().ext2fs_blocks_count())) {
				err = EXT2_ET_BAD_EA_BLOCK_NUM;
				;
			} 
			err = ModernizedCProgram.ext2fs_get_mem(fs.getBlocksize(), block_buf);
			if (err) {
				;
			} 
			err = ModernizedCProgram.ext2fs_read_ext_attr3(fs, blk, block_buf, ino);
			if (err) {
				;
			} 
			header = (ext2_ext_attr_header)/* We only know how to deal with v2 EA blocks */block_buf;
			if (generatedH_magic != -1024) {
				err = EXT2_ET_BAD_EA_HEADER;
				;
			} 
			if (generatedH_refcount == /* Single-user block.  We're done here. */1) {
				;
			} 
			generatedH_refcount--;
			err = ModernizedCProgram.ext2fs_write_ext_attr3(fs, blk, block_buf, ino);
			if (err) {
				;
			} 
		} else {
				err = (ext2_inode)/* No block, we must increment i_blocks */inode.ext2fs_iblk_add_blocks(fs, 1);
				if (err) {
					;
				} 
		} 
		goal = (ext2_inode)inode.ext2fs_find_inode_goal(fs, ino, /* Allocate a block */0);
		err = ModernizedCProgram.ext2fs_alloc_block2(fs, goal, ((Object)0), blk);
		if (err) {
			;
		} 
		(ext2_inode)inode.ext2fs_file_acl_block_set(fs, blk);
	}
	public Object ext2fs_inode_csum(Object fs, Object inum, Object crc, int has_hi) {
		 gen = new ();
		ext2_inode_large desc = inode;
		size_t size = (((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size());
		 old_lo = new ();
		 old_hi = 0;
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		old_lo = generatedLinux2.getL_i_checksum_lo();
		generatedLinux2.setL_i_checksum_lo(0);
		Object generatedI_checksum_hi = this.getI_checksum_hi();
		if (has_hi) {
			old_hi = generatedI_checksum_hi;
			this.setI_checksum_hi(0);
		} 
		inum = .ext2fs_cpu_to_le32(inum);
		Object generatedI_generation = this.getI_generation();
		gen = generatedI_generation;
		crc = ModernizedCProgram.ext2fs_crc32c_le(fs.getCsum_seed(), (byte)inum, );
		crc = ModernizedCProgram.ext2fs_crc32c_le(crc, (byte)gen, );
		crc = ModernizedCProgram.ext2fs_crc32c_le(crc, (byte)desc, size);
		generatedLinux2.setL_i_checksum_lo(old_lo);
		if (has_hi) {
			this.setI_checksum_hi(old_hi);
		} 
		return 0;
	}
	public int ext2fs_inode_csum_verify(Object fs, Object inum) {
		 retval = new ();
		 provided = new ();
		 calculated = new ();
		int i;
		int has_hi;
		byte cp;
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 1;
		} 
		Object generatedI_extra_isize = this.getI_extra_isize();
		has_hi = ((((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size()) > 128 && generatedI_extra_isize >= (((size_t)((ext2_inode_large)0).getI_checksum_hi()) +  - 128));
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		provided = .ext2fs_le16_to_cpu(generatedLinux2.getL_i_checksum_lo());
		retval = inode.ext2fs_inode_csum(fs, inum, calculated, has_hi);
		if (retval) {
			return 0;
		} 
		Object generatedI_checksum_hi = this.getI_checksum_hi();
		if (has_hi) {
			 hi = .ext2fs_le16_to_cpu(generatedI_checksum_hi);
			provided |=  hi << 16;
		} else {
				calculated &=  -1024;
		} 
		if (provided == calculated) {
			return 1/*
				 * If the checksum didn't match, it's possible it was due to
				 * the inode being all zero's.  It's unlikely this is the
				 * case, but it can happen.  So check for it here.  (We only
				 * check the base inode since that's good enough, and it's not
				 * worth the bother to figure out how much of the extended
				 * inode, if any, is present.)
				 */;
		} 
		for (; i < ; ) {
			if (cp) {
				return 0;
			} 
		}
		return /* Inode must have been all zero's */1;
	}
	public Object ext2fs_inode_csum_set(Object fs, Object inum) {
		 retval = new ();
		 crc = new ();
		int has_hi;
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 0;
		} 
		Object generatedI_extra_isize = this.getI_extra_isize();
		has_hi = ((((fs.getSuper()).getS_rev_level() == 0) ? 128 : (fs.getSuper()).getS_inode_size()) > 128 && generatedI_extra_isize >= (((size_t)((ext2_inode_large)0).getI_checksum_hi()) +  - 128));
		retval = inode.ext2fs_inode_csum(fs, inum, crc, has_hi);
		if (retval) {
			return retval;
		} 
		 generatedOsd2 = this.getOsd2();
		Object generatedLinux2 = generatedOsd2.getLinux2();
		generatedLinux2.setL_i_checksum_lo(.ext2fs_cpu_to_le16(crc & -1024));
		if (has_hi) {
			this.setI_checksum_hi(.ext2fs_cpu_to_le16(crc >> 16));
		} 
		return 0;
	}
	public int block_map_looks_insane(Object fs) {
		int i;
		int bad;
		Object generatedI_flags = this.getI_flags();
		if ((generatedI_flags & /* We're only interested in block mapped files, dirs, and symlinks */-1024) || (generatedI_flags & -1024)) {
			return 0;
		} 
		Object generatedI_mode = this.getI_mode();
		if (!(((generatedI_mode) & 170000) == 100000) && !(((generatedI_mode) & 170000) == 120000) && !(((generatedI_mode) & 170000) == 40000)) {
			return 0;
		} 
		Object generatedI_size = (inode).getI_size();
		Object generatedI_block = this.getI_block();
		if ((((generatedI_mode) & 170000) == 120000) && (generatedI_size | (.UNRECOGNIZEDFUNCTIONNAME(inode).getI_size_high() << 32)) <= ) {
			return 0;
		} 
		Object generatedI_links_count = this.getI_links_count();
		if (generatedI_links_count == /* Unused inodes probably aren't insane */0) {
			return 0;
		} 
		for (; i < (((12 + 1) + 1) + 1); /* See if more than half the block maps are insane */i++) {
			if (generatedI_block[i] != 0 && (generatedI_block[i] < fs.getSuper().getS_first_data_block() || generatedI_block[i] >= fs.getSuper().ext2fs_blocks_count())) {
				bad++;
			} 
		}
		return bad > (((12 + 1) + 1) + 1) / 2;
	}
	public int extent_head_looks_insane() {
		Object generatedI_flags = this.getI_flags();
		Object generatedI_block = this.getI_block();
		if (!(generatedI_flags & -1024) || ModernizedCProgram.ext2fs_extent_header_verify(generatedI_block, ) == 0) {
			return 0;
		} 
		return 1/*
		 * Check all the inodes that we just read into the buffer.  Record what we
		 * find here -- currently, we can observe that all checksums are ok; more
		 * than half the inodes are insane; or no conclusions at all.
		 */;
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
	public Object getI_extra_isize() {
		return i_extra_isize;
	}
	public void setI_extra_isize(Object newI_extra_isize) {
		i_extra_isize = newI_extra_isize;
	}
	public Object getI_checksum_hi() {
		return i_checksum_hi;
	}
	public void setI_checksum_hi(Object newI_checksum_hi) {
		i_checksum_hi = newI_checksum_hi;
	}
	public Object getI_ctime_extra() {
		return i_ctime_extra;
	}
	public void setI_ctime_extra(Object newI_ctime_extra) {
		i_ctime_extra = newI_ctime_extra;
	}
	public Object getI_mtime_extra() {
		return i_mtime_extra;
	}
	public void setI_mtime_extra(Object newI_mtime_extra) {
		i_mtime_extra = newI_mtime_extra;
	}
	public Object getI_atime_extra() {
		return i_atime_extra;
	}
	public void setI_atime_extra(Object newI_atime_extra) {
		i_atime_extra = newI_atime_extra;
	}
	public Object getI_crtime() {
		return i_crtime;
	}
	public void setI_crtime(Object newI_crtime) {
		i_crtime = newI_crtime;
	}
	public Object getI_crtime_extra() {
		return i_crtime_extra;
	}
	public void setI_crtime_extra(Object newI_crtime_extra) {
		i_crtime_extra = newI_crtime_extra;
	}
	public Object getI_version_hi() {
		return i_version_hi;
	}
	public void setI_version_hi(Object newI_version_hi) {
		i_version_hi = newI_version_hi;
	}
	public Object getI_projid() {
		return i_projid;
	}
	public void setI_projid(Object newI_projid) {
		i_projid = newI_projid;
	}
}
