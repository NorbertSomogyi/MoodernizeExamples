package application;

public class Set_bad_block_procToExt2fs_bg_free_blocks_count_set {
	
	
	private static int set_bad_block_proc(Object fs, Object block_nr, Object blockcnt, Object ref_block, int ref_offset, Object priv_data) {
		set_badblock_record rec = (set_badblock_record)priv_data;
		 retval = new ();
		 blk = new ();
		Object generatedBb_iter = rec.getBb_iter();
		int generatedBad_block_count = rec.getBad_block_count();
		ModernizedCProgram.ext2fs_block_alloc_stats2(fs, blk, +/*
			 * Update block counts
			 */1);
		block_nr = blk;
		return 1;
	}
	public static void ext2fs_block_alloc_stats2(Object fs, Object blk, int inuse) {
		int group = ModernizedCProgram.ext2fs_group_of_blk2(fs, blk);
		if (blk >= fs.getSuper().ext2fs_blocks_count()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/com_err("ext2fs_block_alloc_stats", 0, "Illegal block number: %lu", (long)blk);
			return /*Error: Unsupported expression*/;
		} 
		if (inuse > 0) {
			ModernizedCProgram.ext2fs_mark_block_bitmap2(fs.getBlock_map(), blk);
		} else {
				ModernizedCProgram.ext2fs_unmark_block_bitmap2(fs.getBlock_map(), blk);
		} 
		ModernizedCProgram.ext2fs_bg_free_blocks_count_set(fs, group, ModernizedCProgram.ext2fs_bg_free_blocks_count(fs, group) - inuse);
		ModernizedCProgram.ext2fs_bg_flags_clear(fs, group, -1024);
		ModernizedCProgram.ext2fs_group_desc_csum_set(fs, group);
		fs.getSuper().ext2fs_free_blocks_count_add(-inuse * /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(-1024 << (fs).getCluster_ratio_bits()));
		ModernizedCProgram.ext2fs_mark_super_dirty(fs);
		ModernizedCProgram.ext2fs_mark_bb_dirty(fs);
		if (fs.getBlock_alloc_stats()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fs, ()blk, inuse);
		} 
	}
	private static void ext2fs_bg_free_blocks_count_set(Object fs, Object group, Object n) {
		ext4_group_desc gdp = new ext4_group_desc();
		ext4_group_desc ext4_group_desc = new ext4_group_desc();
		gdp = ext4_group_desc.ext4fs_group_desc(fs, fs.getGroup_desc(), group);
		gdp.setExt4_group_desc(n);
		if (fs.getSuper().ext2fs_has_feature_64bit()) {
			gdp.setExt4_group_desc(()n >> 16/*
			 * Return the free inodes count of a group
			 */);
		} 
	}
}
