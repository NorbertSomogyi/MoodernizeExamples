package application;

/*
 * Generic (non-filesystem layout specific) extents structure
 */
public class ext2fs_extent {
	private Object e_pblk;
	private Object e_lblk;
	private Object e_len;
	private Object e_flags;
	
	public ext2fs_extent(Object e_pblk, Object e_lblk, Object e_len, Object e_flags) {
		setE_pblk(e_pblk);
		setE_lblk(e_lblk);
		setE_len(e_len);
		setE_flags(e_flags);
	}
	public ext2fs_extent() {
	}
	
	public Object ext2fs_extent_get(Object handle, int flags) {
		extent_path path = new extent_path();
		extent_path newpath = new extent_path();
		ext3_extent_header eh = new ext3_extent_header();
		ext3_extent_idx ix = 0;
		ext3_extent ex = new ext3_extent();
		 retval = new ();
		 blk = new ();
		 end_blk = new ();
		int orig_op;
		int op;
		int failed_csum = 0;
		if (!(handle) || (handle).getMagic() != (EXT2_ET_MAGIC_EXTENT_HANDLE)) {
			return (EXT2_ET_MAGIC_EXTENT_HANDLE);
		} 
		if (!handle.getPath()) {
			return EXT2_ET_NO_CURRENT_NODE;
		} 
		orig_op = op = flags & -1024;
		int generatedVisit_num = path.getVisit_num();
		int generatedLeft = path.getLeft();
		if ((orig_op == -1024) || (orig_op == -1024)) {
			if (handle.getLevel() < handle.getMax_depth()) {
				if (generatedVisit_num == /* interior node */0) {
					generatedVisit_num++;
					op = -1024;
				}  else if (generatedLeft > 0) {
					op = -1024;
				}  else if (handle.getLevel() > 0) {
					op = -1024;
				} else {
						return EXT2_ET_EXTENT_NO_NEXT;
				} 
			} else {
					if (generatedLeft > /* leaf node */0) {
						op = -1024;
					}  else if (handle.getLevel() > 0) {
						op = -1024;
					} else {
							return EXT2_ET_EXTENT_NO_NEXT;
					} 
			} 
			if (op != -1024) {
			} 
		} 
		int generatedEntries = path.getEntries();
		if ((orig_op == -1024) || (orig_op == -1024)) {
			if (handle.getLevel() < handle.getMax_depth()) {
				if (generatedVisit_num > /* interior node */0) {
					op = /* path->visit_num = 0; */-1024;
				}  else if (generatedLeft < generatedEntries - 1) {
					op = -1024;
				}  else if (handle.getLevel() > 0) {
					op = -1024;
				} else {
						return EXT2_ET_EXTENT_NO_PREV;
				} 
			} else {
					if (generatedLeft < generatedEntries - /* leaf node */1) {
						op = -1024;
					}  else if (handle.getLevel() > 0) {
						op = -1024;
					} else {
							return EXT2_ET_EXTENT_NO_PREV;
					} 
			} 
			if (op != -1024) {
			} 
		} 
		if (orig_op == -1024) {
			if ((handle.getLevel() < handle.getMax_depth()) && (generatedLeft == 0)) {
				op = -1024;
			} else {
					op = -1024;
			} 
		} 
		Object generatedCurr = path.getCurr();
		Byte generatedBuf = path.getBuf();
		Object generatedExt3_extent_idx = ix.getExt3_extent_idx();
		Object generatedExt3_extent_header = eh.getExt3_extent_header();
		Object generatedEnd_blk = path.getEnd_blk();
		switch (op) {
		case -1024:
		case /* fallthrough */-1024:
				path.setLeft(generatedEntries);
				path.setCurr(0);
		case -1024:
				if (!generatedCurr || (handle.getLevel() >= handle.getMax_depth())) {
					return EXT2_ET_EXTENT_NO_DOWN;
				} 
				ix = generatedCurr;
				newpath = path + 1;
				if (!generatedBuf) {
					retval = ModernizedCProgram.ext2fs_get_mem(handle.getFs().getBlocksize(), generatedBuf);
					if (retval) {
						return retval;
					} 
				} 
				blk = .ext2fs_le32_to_cpu(generatedExt3_extent_idx) + (().ext2fs_le16_to_cpu(generatedExt3_extent_idx) << 32);
				if ((handle.getFs().getFlags() & -1024) && (handle.getFs().getIo() != handle.getFs().getImage_io())) {
					.memset(generatedBuf, 0, handle.getFs().getBlocksize());
				} else {
						retval = ModernizedCProgram.io_channel_read_blk64(handle.getFs().getIo(), blk, 1, generatedBuf);
						if (retval) {
							return retval;
						} 
				} 
				handle.getLevel()++;
				eh = (ext3_extent_header)generatedBuf;
				retval = ModernizedCProgram.ext2fs_extent_header_verify(eh, handle.getFs().getBlocksize());
				if (retval) {
					handle.getLevel()--;
					return retval;
				} 
				if (!(handle.getFs().getFlags() & -1024) && !ModernizedCProgram.ext2fs_extent_block_csum_verify(handle.getFs(), handle.getIno(), eh)) {
					failed_csum = 1;
				} 
				newpath.setLeft(newpath.setEntries(.ext2fs_le16_to_cpu(generatedExt3_extent_header)));
				newpath.setMax_entries(.ext2fs_le16_to_cpu(generatedExt3_extent_header));
				if (generatedLeft > 0) {
					ix++;
					newpath.setEnd_blk(.ext2fs_le32_to_cpu(generatedExt3_extent_idx));
				} else {
						newpath.setEnd_blk(generatedEnd_blk);
				} 
				path = newpath;
				if (op == -1024) {
					ix = .EXT_FIRST_INDEX((ext3_extent_header)eh);
					path.setCurr(ix);
					path.setLeft(generatedEntries - 1);
					path.setVisit_num(0);
				} else {
						ix = .EXT_LAST_INDEX((ext3_extent_header)eh);
						path.setCurr(ix);
						path.setLeft(0);
						if (handle.getLevel() < handle.getMax_depth()) {
							path.setVisit_num(1);
						} 
				} 
				break;
		case -1024:
				ix = generatedCurr;
				break;
		case -1024:
				eh = (ext3_extent_header)generatedBuf;
				path.setCurr(.EXT_LAST_EXTENT(eh));
				ix = generatedCurr;
				path.setLeft(0);
				path.setVisit_num(0);
				break;
		case -1024:
				if (handle.getLevel() <= 0) {
					return EXT2_ET_EXTENT_NO_UP;
				} 
				handle.getLevel()--;
				path--;
				ix = generatedCurr;
				if ((orig_op == -1024) || (orig_op == -1024)) {
					path.setVisit_num(0);
				} 
				break;
		case /* fallthrough */-1024:
				if (generatedLeft <= 0) {
					return EXT2_ET_EXTENT_NO_NEXT;
				} 
				if (generatedCurr) {
					ix = generatedCurr;
					ix++;
				} else {
						eh = (ext3_extent_header)generatedBuf;
						ix = .EXT_FIRST_INDEX(eh);
				} 
				generatedLeft--;
				path.setCurr(ix);
				path.setVisit_num(0);
				break;
		case -1024:
				if (!generatedCurr || generatedLeft + 1 >= generatedEntries) {
					return EXT2_ET_EXTENT_NO_PREV;
				} 
				ix = generatedCurr;
				ix--;
				path.setCurr(ix);
				generatedLeft++;
				if (handle.getLevel() < handle.getMax_depth()) {
					path.setVisit_num(1);
				} 
				break;
		case -1024:
				handle.setLevel(0);
				path = handle.getPath() + handle.getLevel();
		default:
				return EXT2_ET_OP_NOT_SUPPORTED;
		}
		if (!ix) {
			return EXT2_ET_NO_CURRENT_NODE;
		} 
		this.setE_flags(0);
		Object generatedExt3_extent = ex.getExt3_extent();
		Object generatedE_flags = this.getE_flags();
		Object generatedE_len = this.getE_len();
		Object generatedE_lblk = this.getE_lblk();
		if (handle.getLevel() == handle.getMax_depth()) {
			ex = (ext3_extent)ix;
			this.setE_pblk(.ext2fs_le32_to_cpu(generatedExt3_extent) + (().ext2fs_le16_to_cpu(generatedExt3_extent) << 32));
			this.setE_lblk(.ext2fs_le32_to_cpu(generatedExt3_extent));
			this.setE_len(.ext2fs_le16_to_cpu(generatedExt3_extent));
			generatedE_flags |=  -1024;
			if (generatedE_len > EXT_INIT_MAX_LEN) {
				generatedE_len -= EXT_INIT_MAX_LEN;
				generatedE_flags |=  -1024;
			} 
		} else {
				this.setE_pblk(.ext2fs_le32_to_cpu(generatedExt3_extent_idx) + (().ext2fs_le16_to_cpu(generatedExt3_extent_idx) << 32));
				this.setE_lblk(.ext2fs_le32_to_cpu(generatedExt3_extent_idx));
				if (generatedLeft > 0) {
					ix++;
					end_blk = .ext2fs_le32_to_cpu(generatedExt3_extent_idx);
				} else {
						end_blk = generatedEnd_blk;
				} 
				this.setE_len(end_blk - generatedE_lblk);
		} 
		if (generatedVisit_num) {
			generatedE_flags |=  -1024;
		} 
		if (((orig_op == -1024) || (orig_op == -1024)) && (handle.getLevel() != handle.getMax_depth())) {
			;
		} 
		if ((orig_op == -1024) && ((handle.getLevel() != handle.getMax_depth()) || (generatedLeft != 0))) {
			;
		} 
		if (failed_csum) {
			return EXT2_ET_EXTENT_CSUM_INVALID;
		} 
		return 0;
	}
	public Object ext2fs_extent_replace(Object handle, int flags) {
		extent_path path = new extent_path();
		ext3_extent_idx ix = new ext3_extent_idx();
		ext3_extent ex = new ext3_extent();
		if (!(handle) || (handle).getMagic() != (EXT2_ET_MAGIC_EXTENT_HANDLE)) {
			return (EXT2_ET_MAGIC_EXTENT_HANDLE);
		} 
		if (!(handle.getFs().getFlags() & -1024)) {
			return EXT2_ET_RO_FILSYS;
		} 
		if (!handle.getPath()) {
			return EXT2_ET_NO_CURRENT_NODE;
		} 
		path = handle.getPath() + handle.getLevel();
		Object generatedCurr = path.getCurr();
		if (!generatedCurr) {
			return EXT2_ET_NO_CURRENT_NODE;
		} 
		Object generatedE_lblk = this.getE_lblk();
		Object generatedE_pblk = this.getE_pblk();
		Object generatedE_flags = this.getE_flags();
		Object generatedE_len = this.getE_len();
		if (handle.getLevel() == handle.getMax_depth()) {
			ex = generatedCurr;
			ex.setExt3_extent(.ext2fs_cpu_to_le32(generatedE_lblk));
			ex.setExt3_extent(.ext2fs_cpu_to_le32(generatedE_pblk & -1024));
			ex.setExt3_extent(.ext2fs_cpu_to_le16(generatedE_pblk >> 32));
			if (generatedE_flags & -1024) {
				if (generatedE_len > EXT_UNINIT_MAX_LEN) {
					return EXT2_ET_EXTENT_INVALID_LENGTH;
				} 
				ex.setExt3_extent(.ext2fs_cpu_to_le16(generatedE_len + EXT_INIT_MAX_LEN));
			} else {
					if (generatedE_len > EXT_INIT_MAX_LEN) {
						return EXT2_ET_EXTENT_INVALID_LENGTH;
					} 
					ex.setExt3_extent(.ext2fs_cpu_to_le16(generatedE_len));
			} 
		} else {
				ix = generatedCurr;
				ix.setExt3_extent_idx(.ext2fs_cpu_to_le32(generatedE_pblk & -1024));
				ix.setExt3_extent_idx(.ext2fs_cpu_to_le16(generatedE_pblk >> 32));
				ix.setExt3_extent_idx(.ext2fs_cpu_to_le32(generatedE_lblk));
				ix.setExt3_extent_idx(0);
		} 
		ModernizedCProgram.update_path(handle);
		return 0;
	}
	public Object ext2fs_extent_insert(Object handle, int flags) {
		extent_path path = new extent_path();
		ext3_extent_idx ix = new ext3_extent_idx();
		ext3_extent_header eh = new ext3_extent_header();
		 retval = new ();
		if (!(handle) || (handle).getMagic() != (EXT2_ET_MAGIC_EXTENT_HANDLE)) {
			return (EXT2_ET_MAGIC_EXTENT_HANDLE);
		} 
		if (!(handle.getFs().getFlags() & -1024)) {
			return EXT2_ET_RO_FILSYS;
		} 
		if (!handle.getPath()) {
			return EXT2_ET_NO_CURRENT_NODE;
		} 
		path = handle.getPath() + handle.getLevel();
		int generatedEntries = path.getEntries();
		int generatedMax_entries = path.getMax_entries();
		if (generatedEntries >= generatedMax_entries) {
			if (flags & -1024) {
				return EXT2_ET_CANT_INSERT_EXTENT;
			} else {
					retval = ModernizedCProgram.extent_node_split(handle, 1);
					if (retval) {
						return retval;
					} 
					path = handle.getPath() + handle.getLevel();
			} 
		} 
		Byte generatedBuf = path.getBuf();
		eh = (ext3_extent_header)generatedBuf;
		Object generatedCurr = path.getCurr();
		int generatedLeft = path.getLeft();
		if (generatedCurr) {
			ix = generatedCurr;
			if (flags & -1024) {
				ix++;
				generatedLeft--;
			} 
		} else {
				ix = .EXT_FIRST_INDEX(eh);
				path.setLeft(-1);
		} 
		path.setCurr(ix);
		if (generatedLeft >= 0) {
			.memmove(ix + 1, ix, (generatedLeft + 1) * );
		} 
		generatedLeft++;
		generatedEntries++;
		eh = (ext3_extent_header)generatedBuf;
		eh.setExt3_extent_header(.ext2fs_cpu_to_le16(generatedEntries));
		retval = extent.ext2fs_extent_replace(handle, 0);
		if (retval) {
			;
		} 
		retval = ModernizedCProgram.update_path(handle);
		if (retval) {
			;
		} 
		return 0;
		return retval/*
		 * Sets the physical block for a logical file block in the extent tree.
		 *
		 * May: map unmapped, unmap mapped, or remap mapped blocks.
		 *
		 * Mapping an unmapped block adds a single-block extent.
		 *
		 * Unmapping first or last block modifies extent in-place
		 *  - But may need to fix parent's starts too in first-block case
		 *
		 * Mapping any unmapped block requires adding a (single-block) extent
		 * and inserting into proper point in tree.
		 *
		 * Modifying (unmapping or remapping) a block in the middle
		 * of an extent requires splitting the extent.
		 *  - Remapping case requires new single-block extent.
		 *
		 * Remapping first or last block adds an extent.
		 *
		 * We really need extent adding to be smart about merging.
		 */;
	}
	public Object getE_pblk() {
		return e_pblk;
	}
	public void setE_pblk(Object newE_pblk) {
		e_pblk = newE_pblk;
	}
	public Object getE_lblk() {
		return e_lblk;
	}
	public void setE_lblk(Object newE_lblk) {
		e_lblk = newE_lblk;
	}
	public Object getE_len() {
		return e_len;
	}
	public void setE_len(Object newE_len) {
		e_len = newE_len;
	}
	public Object getE_flags() {
		return e_flags;
	}
	public void setE_flags(Object newE_flags) {
		e_flags = newE_flags;
	}
}
