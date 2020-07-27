package application;

/*
 * Structure of a directory entry
 */
public class ext2_dir_entry {
	private Object inode;
	private Object rec_len;
	private Object name_len;
	private Object name;
	
	public ext2_dir_entry(Object inode, Object rec_len, Object name_len, Object name) {
		setInode(inode);
		setRec_len(rec_len);
		setName_len(name_len);
		setName(name);
	}
	public ext2_dir_entry() {
	}
	
	/*
	 * dir_iterate.c --- ext2fs directory iteration operations
	 *
	 * Copyright (C) 1993, 1994, 1994, 1995, 1996, 1997 Theodore Ts'o.
	 *
	 * %Begin-Header%
	 * This file may be redistributed under the terms of the GNU Library
	 * General Public License, version 2.
	 * %End-Header%
	 */
	public Object ext2fs_get_rec_len(Object fs, Integer rec_len) {
		Object generatedRec_len = this.getRec_len();
		int len = generatedRec_len;
		if (fs.getBlocksize() < 65536) {
			rec_len = len;
		}  else if (len == ((1 << 16) - 1) || len == 0) {
			rec_len = fs.getBlocksize();
		} else {
				rec_len = (len & 65532) | ((len & 3) << 16);
		} 
		return 0;
	}
	public Object ext2fs_set_rec_len(Object fs, int len) {
		if ((len > fs.getBlocksize()) || (fs.getBlocksize() > (1 << 18)) || (len & 3)) {
			return 22;
		} 
		if (len < 65536) {
			this.setRec_len(len);
			return 0;
		} 
		if (len == fs.getBlocksize()) {
			if (fs.getBlocksize() == 65536) {
				this.setRec_len(((1 << 16) - 1));
			} else {
					this.setRec_len(0);
			} 
		} else {
				this.setRec_len((len & 65532) | ((len >> 16) & 3));
		} 
		return 0/*
		 * This function checks to see whether or not a potential deleted
		 * directory entry looks valid.  What we do is check the deleted entry
		 * and each successive entry to make sure that they all look valid and
		 * that the last deleted entry ends at the beginning of the next
		 * undeleted entry.  Returns 1 if the deleted entry looks valid, zero
		 * if not valid.
		 */;
	}
	public int xlate_func(Object dir, int entry, int offset, int blocksize, Byte buf, Object priv_data) {
		xlate xl = (xlate)priv_data;
		Object generatedReal_private = xl.getReal_private();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dirent, offset, blocksize, buf, generatedReal_private);
		xlate xl = (xlate)priv_data;
		Object generatedReal_private = xl.getReal_private();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs, blocknr, (int)blockcnt, generatedReal_private);
	}
	public int ext2fs_dirent_has_tail(Object fs) {
		return ModernizedCProgram.__get_dirent_tail(fs, dirent, ((Object)0), 0) == 0;
	}
	public Object ext2fs_dirent_csum(Object fs, Object inum, Object crc, int size) {
		 retval = new ();
		byte buf = (byte)dirent;
		 gen = new ();
		ext2_inode inode = new ext2_inode();
		retval = inode.ext2fs_read_inode(fs, inum);
		if (retval) {
			return retval;
		} 
		inum = /*Error: Function owner not recognized*/ext2fs_cpu_to_le32(inum);
		Object generatedI_generation = inode.getI_generation();
		gen = /*Error: Function owner not recognized*/ext2fs_cpu_to_le32(generatedI_generation);
		crc = ModernizedCProgram.ext2fs_crc32c_le(fs.getCsum_seed(), (byte)inum, /*Error: sizeof expression not supported yet*/);
		crc = ModernizedCProgram.ext2fs_crc32c_le(crc, (byte)gen, /*Error: sizeof expression not supported yet*/);
		crc = ModernizedCProgram.ext2fs_crc32c_le(crc, (byte)buf, size);
		return 0;
	}
	public int ext2fs_dirent_csum_verify(Object fs, Object inum) {
		 retval = new ();
		 calculated = new ();
		ext2_dir_entry_tail t = new ext2_dir_entry_tail();
		retval = ModernizedCProgram.__get_dirent_tail(fs, dirent, t, 1);
		if (retval) {
			return 1/*
				 * The checksum field is overlaid with the dirent->name field
				 * so the swapfs.c functions won't change the endianness.
				 */;
		} 
		retval = dirent.ext2fs_dirent_csum(fs, inum, calculated, (byte)t - (byte)dirent);
		if (retval) {
			return 0;
		} 
		Object generatedDet_checksum = t.getDet_checksum();
		return /*Error: Function owner not recognized*/ext2fs_le32_to_cpu(generatedDet_checksum) == calculated;
	}
	public Object ext2fs_dirent_csum_set(Object fs, Object inum) {
		 retval = new ();
		 crc = new ();
		ext2_dir_entry_tail t = new ext2_dir_entry_tail();
		retval = ModernizedCProgram.__get_dirent_tail(fs, dirent, t, 1);
		if (retval) {
			return retval;
		} 
		retval = dirent.ext2fs_dirent_csum(fs, inum, /* swapfs.c functions don't change the checksum endianness */crc, (byte)t - (byte)dirent);
		if (retval) {
			return retval;
		} 
		t.setDet_checksum(/*Error: Function owner not recognized*/ext2fs_cpu_to_le32(crc));
		return 0;
	}
	public int ext2fs_dx_csum_verify(Object fs, Object inum) {
		 calculated = new ();
		 retval = new ();
		ext2_dx_countlimit c = new ext2_dx_countlimit();
		ext2_dx_tail t = new ext2_dx_tail();
		int count_offset;
		int limit;
		int count;
		retval = ModernizedCProgram.__get_dx_countlimit(fs, dirent, c, count_offset, 1);
		if (retval) {
			return 1;
		} 
		Object generatedLimit = c.getLimit();
		limit = /*Error: Function owner not recognized*/ext2fs_le16_to_cpu(generatedLimit);
		Object generatedCount = c.getCount();
		count = /*Error: Function owner not recognized*/ext2fs_le16_to_cpu(generatedCount);
		if (count_offset + (limit * /*Error: Unsupported expression*/) > fs.getBlocksize() - /*Error: Unsupported expression*/) {
			return 0;
		} 
		t = (ext2_dx_tail)(((ext2_dx_entry)c) + /* htree structs are accessed in LE order */limit);
		retval = ModernizedCProgram.ext2fs_dx_csum(fs, inum, dirent, calculated, count_offset, count, t);
		if (retval) {
			return 0;
		} 
		Object generatedDt_checksum = t.getDt_checksum();
		return /*Error: Function owner not recognized*/ext2fs_le32_to_cpu(generatedDt_checksum) == calculated;
	}
	public Object ext2fs_dx_csum_set(Object fs, Object inum) {
		 crc = new ();
		 retval = 0;
		ext2_dx_countlimit c = new ext2_dx_countlimit();
		ext2_dx_tail t = new ext2_dx_tail();
		int count_offset;
		int limit;
		int count;
		retval = ModernizedCProgram.__get_dx_countlimit(fs, dirent, c, count_offset, 1);
		if (retval) {
			return retval;
		} 
		Object generatedLimit = c.getLimit();
		limit = /*Error: Function owner not recognized*/ext2fs_le16_to_cpu(generatedLimit);
		Object generatedCount = c.getCount();
		count = /*Error: Function owner not recognized*/ext2fs_le16_to_cpu(generatedCount);
		if (count_offset + (limit * /*Error: Unsupported expression*/) > fs.getBlocksize() - /*Error: Unsupported expression*/) {
			return EXT2_ET_DIR_NO_SPACE_FOR_CSUM;
		} 
		t = (ext2_dx_tail)(((ext2_dx_entry)c) + limit);
		retval = ModernizedCProgram.ext2fs_dx_csum(fs, inum, dirent, crc, count_offset, count, /* htree structs are accessed in LE order */t);
		if (retval) {
			return retval;
		} 
		t.setDt_checksum(/*Error: Function owner not recognized*/ext2fs_cpu_to_le32(crc));
		return retval;
	}
	public int ext2fs_dir_block_csum_verify(Object fs, Object inum) {
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 1;
		} 
		if (ModernizedCProgram.__get_dirent_tail(fs, dirent, ((Object)0), 1) == 0) {
			return dirent.ext2fs_dirent_csum_verify(fs, inum);
		} 
		if (ModernizedCProgram.__get_dx_countlimit(fs, dirent, ((Object)0), ((Object)0), 1) == 0) {
			return dirent.ext2fs_dx_csum_verify(fs, inum);
		} 
		return 0;
	}
	public Object ext2fs_dir_block_csum_set(Object fs, Object inum) {
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 0;
		} 
		if (ModernizedCProgram.__get_dirent_tail(fs, dirent, ((Object)0), 1) == 0) {
			return dirent.ext2fs_dirent_csum_set(fs, inum);
		} 
		if (ModernizedCProgram.__get_dx_countlimit(fs, dirent, ((Object)0), ((Object)0), 1) == 0) {
			return dirent.ext2fs_dx_csum_set(fs, inum);
		} 
		if (fs.getFlags() & -1024) {
			return 0;
		} 
		return EXT2_ET_DIR_NO_SPACE_FOR_CSUM;
	}
	public int link_proc(int offset, int blocksize, Byte buf, Object priv_data) {
		link_struct ls = (link_struct)priv_data;
		ext2_dir_entry next = new ext2_dir_entry();
		int rec_len;
		int min_rec_len;
		int curr_rec_len;
		int ret = 0;
		int csum_size = 0;
		ext2_dir_entry_tail t = new ext2_dir_entry_tail();
		int generatedDone = ls.getDone();
		if (generatedDone) {
			return 2;
		} 
		int generatedNamelen = ls.getNamelen();
		rec_len = (((generatedNamelen) + 8 + (4 - 1)) & ~(4 - 1));
		Object generatedFs = ls.getFs();
		ls.setErr(dirent.ext2fs_get_rec_len(generatedFs, curr_rec_len));
		Object generatedErr = ls.getErr();
		if (generatedErr) {
			return 2;
		} 
		if (generatedFs.getSuper().ext2fs_has_feature_metadata_csum()) {
			csum_size = /*Error: Unsupported expression*//*
				 * See if the following directory entry (if any) is unused;
				 * if so, absorb it into this one.
				 */;
		} 
		next = (ext2_dir_entry)(buf + offset + curr_rec_len);
		Object generatedInode = next.getInode();
		Object generatedRec_len = next.getRec_len();
		if ((offset + (int)curr_rec_len < blocksize - (8 + csum_size)) && (generatedInode == 0) && (offset + (int)curr_rec_len + (int)generatedRec_len <= blocksize)) {
			curr_rec_len += generatedRec_len;
			ls.setErr(dirent.ext2fs_set_rec_len(generatedFs, curr_rec_len));
			if (generatedErr) {
				return 2;
			} 
			ret = 1/*
				 * Since ext2fs_link blows away htree data, we need to be
				 * careful -- if metadata_csum is enabled and we're passed in
				 * a dirent that contains htree data, we need to create the
				 * fake entry at the end of the block that hides the checksum.
				 */;
		} 
		if (/* De-convert a dx_node block */csum_size && curr_rec_len == generatedFs.getBlocksize() && !generatedInode) {
			curr_rec_len -= csum_size;
			ls.setErr(dirent.ext2fs_set_rec_len(generatedFs, curr_rec_len));
			if (generatedErr) {
				return 2;
			} 
			t = ((ext2_dir_entry_tail)(((byte)(buf)) + (generatedFs.getBlocksize()) - /*Error: Unsupported expression*/));
			t.ext2fs_initialize_dirent_tail(generatedFs);
			ret = 1;
		} 
		Object generatedName = this.getName();
		if (/* De-convert a dx_root block */csum_size && curr_rec_len == generatedFs.getBlocksize() - (((true) + 8 + (4 - 1)) & ~(4 - 1)) && offset == (((true) + 8 + (4 - 1)) & ~(4 - 1)) && generatedName[0] == (byte)'.' && generatedName[1] == (byte)'.') {
			curr_rec_len -= csum_size;
			ls.setErr(dirent.ext2fs_set_rec_len(generatedFs, curr_rec_len));
			if (generatedErr) {
				return 2;
			} 
			t = ((ext2_dir_entry_tail)(((byte)(buf)) + (generatedFs.getBlocksize()) - /*Error: Unsupported expression*/));
			t.ext2fs_initialize_dirent_tail(generatedFs);
			ret = 1/*
				 * If the directory entry is used, see if we can split the
				 * directory entry to make room for the new name.  If so,
				 * truncate it and return.
				 */;
		} 
		if (generatedInode) {
			min_rec_len = (((ModernizedCProgram.ext2fs_dirent_name_len(dirent)) + 8 + (4 - 1)) & ~(4 - 1));
			if (curr_rec_len < (min_rec_len + rec_len)) {
				return ret;
			} 
			rec_len = curr_rec_len - min_rec_len;
			ls.setErr(dirent.ext2fs_set_rec_len(generatedFs, min_rec_len));
			if (generatedErr) {
				return 2;
			} 
			next = (ext2_dir_entry)(buf + offset + generatedRec_len);
			next.setInode(0);
			ModernizedCProgram.ext2fs_dirent_set_name_len(next, 0);
			ModernizedCProgram.ext2fs_dirent_set_file_type(next, 0);
			ls.setErr(next.ext2fs_set_rec_len(generatedFs, rec_len));
			if (generatedErr) {
				return 2;
			} 
			return 1/*
				 * If we get this far, then the directory entry is not used.
				 * See if we can fit the request entry in.  If so, do it.
				 */;
		} 
		if (curr_rec_len < rec_len) {
			return ret;
		} 
		this.setInode(generatedInode);
		ModernizedCProgram.ext2fs_dirent_set_name_len(dirent, generatedNamelen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(generatedName, generatedName, generatedNamelen);
		ext2_super_block generatedSb = ls.getSb();
		int generatedFlags = ls.getFlags();
		if (generatedSb.ext2fs_has_feature_filetype()) {
			ModernizedCProgram.ext2fs_dirent_set_file_type(dirent, generatedFlags & -1024);
		} 
		generatedDone++;
		return 2 | 1/*
		 * Note: the low 3 bits of the flags field are used as the directory
		 * entry filetype.
		 */;
	}
	public int lookup_proc(int offset, int blocksize, Byte buf, Object priv_data) {
		lookup_struct ls = (lookup_struct)priv_data;
		int generatedLen = ls.getLen();
		if (generatedLen != ModernizedCProgram.ext2fs_dirent_name_len(dirent)) {
			return 0;
		} 
		Object generatedName = ls.getName();
		if (/*Error: Function owner not recognized*/strncmp(generatedName, generatedName, ModernizedCProgram.ext2fs_dirent_name_len(dirent))) {
			return 0;
		} 
		Object generatedInode = ls.getInode();
		generatedInode = generatedInode;
		int generatedFound = ls.getFound();
		generatedFound++;
		return 2;
	}
	public Object getInode() {
		return inode;
	}
	public void setInode(Object newInode) {
		inode = newInode;
	}
	public Object getRec_len() {
		return rec_len;
	}
	public void setRec_len(Object newRec_len) {
		rec_len = newRec_len;
	}
	public Object getName_len() {
		return name_len;
	}
	public void setName_len(Object newName_len) {
		name_len = newName_len;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
