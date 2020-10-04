package application;

/*
 * Special flag in the ext2 inode i_flag field that means that this is
 * a new inode.  (So that ext2_write_inode() can clear extra fields.)
 */
/*
 * Flags for mkjournal
 */
/* create V1 superblock (deprecated) */
/* don't zero journal inode before use*/
/* don't check mount status */
/*
 * Magic "block count" return values for the block iterator function.
 */
public class blk_alloc_ctx {
	private Object ino;
	private ext2_inode inode;
	private Object lblk;
	private int flags;
	
	public blk_alloc_ctx(Object ino, ext2_inode inode, Object lblk, int flags) {
		setIno(ino);
		setInode(inode);
		setLblk(lblk);
		setFlags(flags);
	}
	public blk_alloc_ctx() {
	}
	
	public Object ext2fs_new_block3(Object fs, Object goal, Object map, Object ret) {
		 retval = new ();
		 b = 0;
		 gab = new ();
		 gab2 = new ();
		if (!(fs) || (fs).getMagic() != (EXT2_ET_MAGIC_EXT2FS_FILSYS)) {
			return (EXT2_ET_MAGIC_EXT2FS_FILSYS);
		} 
		if (!map/*
				 * In case there are clients out there whose get_alloc_block
				 * handlers call ext2fs_new_block2 with a NULL block map,
				 * temporarily swap out the function pointer so that we don't
				 * end up in an infinite loop.
				 */) {
			if (fs.getGet_alloc_block2()) {
				gab2 = fs.getGet_alloc_block2();
				fs.setGet_alloc_block2((null));
				retval = /*Error: Function owner not recognized*/gab2(fs, goal, b, ctx);
				fs.setGet_alloc_block2(gab2);
				;
			}  else if (fs.getGet_alloc_block()) {
				gab = fs.getGet_alloc_block();
				fs.setGet_alloc_block((null));
				retval = /*Error: Function owner not recognized*/gab(fs, goal, b);
				fs.setGet_alloc_block(gab);
				;
			} 
		} 
		if (!map) {
			map = fs.getBlock_map();
		} 
		if (!map) {
			return EXT2_ET_NO_BLOCK_BITMAP;
		} 
		if (!goal || (goal >= fs.getSuper().ext2fs_blocks_count())) {
			goal = fs.getSuper().getS_first_data_block();
		} 
		goal &=  ~((-1024 << (fs).getCluster_ratio_bits()) - 1);
		retval = ModernizedCProgram.ext2fs_find_first_zero_block_bitmap2(map, goal, fs.getSuper().ext2fs_blocks_count() - 1, b);
		if ((retval == 2) && (goal != fs.getSuper().getS_first_data_block())) {
			retval = ModernizedCProgram.ext2fs_find_first_zero_block_bitmap2(map, fs.getSuper().getS_first_data_block(), goal - 1, b);
		} 
		if (retval) {
			return retval;
		} 
		ModernizedCProgram.ext2fs_clear_block_uninit(fs, ModernizedCProgram.ext2fs_group_of_blk2(fs, b));
		ret = b;
		return 0;
	}
	public Object ext2fs_alloc_block3(Object fs, Object goal, Byte block_buf, Object ret) {
		 retval = new ();
		 block = new ();
		if (fs.getGet_alloc_block2()) {
			retval = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs, goal, block, ctx);
			if (retval) {
				;
			} 
		}  else if (fs.getGet_alloc_block()) {
			retval = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs, goal, block);
			if (retval) {
				;
			} 
		} else {
				if (!fs.getBlock_map()) {
					retval = ModernizedCProgram.ext2fs_read_block_bitmap(fs);
					if (retval) {
						;
					} 
				} 
				retval = ctx.ext2fs_new_block3(fs, goal, 0, block);
				if (retval) {
					;
				} 
		} 
		if (block_buf) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(block_buf, 0, fs.getBlocksize());
			retval = ModernizedCProgram.io_channel_write_blk64(fs.getIo(), block, 1, block_buf);
		} else {
				retval = ModernizedCProgram.ext2fs_zero_blocks2(fs, block, 1, (null), (null));
		} 
		if (retval) {
			;
		} 
		ModernizedCProgram.ext2fs_block_alloc_stats2(fs, block, +1);
		ret = block;
	}
	public Object getIno() {
		return ino;
	}
	public void setIno(Object newIno) {
		ino = newIno;
	}
	public ext2_inode getInode() {
		return inode;
	}
	public void setInode(ext2_inode newInode) {
		inode = newInode;
	}
	public Object getLblk() {
		return lblk;
	}
	public void setLblk(Object newLblk) {
		lblk = newLblk;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
