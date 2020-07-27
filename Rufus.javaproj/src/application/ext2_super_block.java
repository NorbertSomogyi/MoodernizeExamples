package application;

public class ext2_super_block {
	private Object s_inodes_count;
	private Object s_blocks_count;
	private Object s_r_blocks_count;
	private Object s_free_blocks_count;
	private Object s_free_inodes_count;
	private Object s_first_data_block;
	private Object s_log_block_size;
	private Object s_log_cluster_size;
	private Object s_blocks_per_group;
	private Object s_clusters_per_group;
	private Object s_inodes_per_group;
	private Object s_mtime;
	private Object s_wtime;
	private Object s_mnt_count;
	private Object s_max_mnt_count;
	private Object s_magic;
	private Object s_state;
	private Object s_errors;
	private Object s_minor_rev_level;
	private Object s_lastcheck;
	private Object s_checkinterval;
	private Object s_creator_os;
	private Object s_rev_level;
	private Object s_def_resuid;
	private Object s_def_resgid;
	private Object s_first_ino;
	private Object s_inode_size;
	private Object s_block_group_nr;
	private Object s_feature_compat;
	private Object s_feature_incompat;
	private Object s_feature_ro_compat;
	private Object s_uuid;
	private Object s_volume_name;
	private Object s_last_mounted;
	private Object s_algorithm_usage_bitmap;
	private Object s_prealloc_blocks;
	private Object s_prealloc_dir_blocks;
	private Object s_reserved_gdt_blocks;
	private Object s_journal_uuid;
	private Object s_journal_inum;
	private Object s_journal_dev;
	private Object s_last_orphan;
	private Object s_hash_seed;
	private Object s_def_hash_version;
	private Object s_jnl_backup_type;
	private Object s_desc_size;
	private Object s_default_mount_opts;
	private Object s_first_meta_bg;
	private Object s_mkfs_time;
	private Object s_jnl_blocks;
	private Object s_blocks_count_hi;
	private Object s_r_blocks_count_hi;
	private Object s_free_blocks_hi;
	private Object s_min_extra_isize;
	private Object s_want_extra_isize;
	private Object s_flags;
	private Object s_raid_stride;
	private Object s_mmp_update_interval;
	private Object s_mmp_block;
	private Object s_raid_stripe_width;
	private Object s_log_groups_per_flex;
	private Object s_checksum_type;
	private Object s_encryption_level;
	private Object s_reserved_pad;
	private Object s_kbytes_written;
	private Object s_snapshot_inum;
	private Object s_snapshot_id;
	private Object s_snapshot_r_blocks_count;
	private Object s_snapshot_list;
	private Object s_error_count;
	private Object s_first_error_time;
	private Object s_first_error_ino;
	private Object s_first_error_block;
	private Object s_first_error_func;
	private Object s_first_error_line;
	private Object s_last_error_time;
	private Object s_last_error_ino;
	private Object s_last_error_line;
	private Object s_last_error_block;
	private Object s_last_error_func;
	private Object s_mount_opts;
	private Object s_usr_quota_inum;
	private Object s_grp_quota_inum;
	private Object s_overhead_blocks;
	private Object s_backup_bgs;
	private Object s_encrypt_algos;
	private Object s_encrypt_pw_salt;
	private Object s_lpf_ino;
	private Object s_prj_quota_inum;
	private Object s_checksum_seed;
	private Object s_wtime_hi;
	private Object s_mtime_hi;
	private Object s_mkfs_time_hi;
	private Object s_lastcheck_hi;
	private Object s_first_error_time_hi;
	private Object s_last_error_time_hi;
	private Object s_pad;
	private Object s_encoding;
	private Object s_encoding_flags;
	private Object s_reserved;
	private Object s_checksum;
	
	public ext2_super_block(Object s_inodes_count, Object s_blocks_count, Object s_r_blocks_count, Object s_free_blocks_count, Object s_free_inodes_count, Object s_first_data_block, Object s_log_block_size, Object s_log_cluster_size, Object s_blocks_per_group, Object s_clusters_per_group, Object s_inodes_per_group, Object s_mtime, Object s_wtime, Object s_mnt_count, Object s_max_mnt_count, Object s_magic, Object s_state, Object s_errors, Object s_minor_rev_level, Object s_lastcheck, Object s_checkinterval, Object s_creator_os, Object s_rev_level, Object s_def_resuid, Object s_def_resgid, Object s_first_ino, Object s_inode_size, Object s_block_group_nr, Object s_feature_compat, Object s_feature_incompat, Object s_feature_ro_compat, Object s_uuid, Object s_volume_name, Object s_last_mounted, Object s_algorithm_usage_bitmap, Object s_prealloc_blocks, Object s_prealloc_dir_blocks, Object s_reserved_gdt_blocks, Object s_journal_uuid, Object s_journal_inum, Object s_journal_dev, Object s_last_orphan, Object s_hash_seed, Object s_def_hash_version, Object s_jnl_backup_type, Object s_desc_size, Object s_default_mount_opts, Object s_first_meta_bg, Object s_mkfs_time, Object s_jnl_blocks, Object s_blocks_count_hi, Object s_r_blocks_count_hi, Object s_free_blocks_hi, Object s_min_extra_isize, Object s_want_extra_isize, Object s_flags, Object s_raid_stride, Object s_mmp_update_interval, Object s_mmp_block, Object s_raid_stripe_width, Object s_log_groups_per_flex, Object s_checksum_type, Object s_encryption_level, Object s_reserved_pad, Object s_kbytes_written, Object s_snapshot_inum, Object s_snapshot_id, Object s_snapshot_r_blocks_count, Object s_snapshot_list, Object s_error_count, Object s_first_error_time, Object s_first_error_ino, Object s_first_error_block, Object s_first_error_func, Object s_first_error_line, Object s_last_error_time, Object s_last_error_ino, Object s_last_error_line, Object s_last_error_block, Object s_last_error_func, Object s_mount_opts, Object s_usr_quota_inum, Object s_grp_quota_inum, Object s_overhead_blocks, Object s_backup_bgs, Object s_encrypt_algos, Object s_encrypt_pw_salt, Object s_lpf_ino, Object s_prj_quota_inum, Object s_checksum_seed, Object s_wtime_hi, Object s_mtime_hi, Object s_mkfs_time_hi, Object s_lastcheck_hi, Object s_first_error_time_hi, Object s_last_error_time_hi, Object s_pad, Object s_encoding, Object s_encoding_flags, Object s_reserved, Object s_checksum) {
		setS_inodes_count(s_inodes_count);
		setS_blocks_count(s_blocks_count);
		setS_r_blocks_count(s_r_blocks_count);
		setS_free_blocks_count(s_free_blocks_count);
		setS_free_inodes_count(s_free_inodes_count);
		setS_first_data_block(s_first_data_block);
		setS_log_block_size(s_log_block_size);
		setS_log_cluster_size(s_log_cluster_size);
		setS_blocks_per_group(s_blocks_per_group);
		setS_clusters_per_group(s_clusters_per_group);
		setS_inodes_per_group(s_inodes_per_group);
		setS_mtime(s_mtime);
		setS_wtime(s_wtime);
		setS_mnt_count(s_mnt_count);
		setS_max_mnt_count(s_max_mnt_count);
		setS_magic(s_magic);
		setS_state(s_state);
		setS_errors(s_errors);
		setS_minor_rev_level(s_minor_rev_level);
		setS_lastcheck(s_lastcheck);
		setS_checkinterval(s_checkinterval);
		setS_creator_os(s_creator_os);
		setS_rev_level(s_rev_level);
		setS_def_resuid(s_def_resuid);
		setS_def_resgid(s_def_resgid);
		setS_first_ino(s_first_ino);
		setS_inode_size(s_inode_size);
		setS_block_group_nr(s_block_group_nr);
		setS_feature_compat(s_feature_compat);
		setS_feature_incompat(s_feature_incompat);
		setS_feature_ro_compat(s_feature_ro_compat);
		setS_uuid(s_uuid);
		setS_volume_name(s_volume_name);
		setS_last_mounted(s_last_mounted);
		setS_algorithm_usage_bitmap(s_algorithm_usage_bitmap);
		setS_prealloc_blocks(s_prealloc_blocks);
		setS_prealloc_dir_blocks(s_prealloc_dir_blocks);
		setS_reserved_gdt_blocks(s_reserved_gdt_blocks);
		setS_journal_uuid(s_journal_uuid);
		setS_journal_inum(s_journal_inum);
		setS_journal_dev(s_journal_dev);
		setS_last_orphan(s_last_orphan);
		setS_hash_seed(s_hash_seed);
		setS_def_hash_version(s_def_hash_version);
		setS_jnl_backup_type(s_jnl_backup_type);
		setS_desc_size(s_desc_size);
		setS_default_mount_opts(s_default_mount_opts);
		setS_first_meta_bg(s_first_meta_bg);
		setS_mkfs_time(s_mkfs_time);
		setS_jnl_blocks(s_jnl_blocks);
		setS_blocks_count_hi(s_blocks_count_hi);
		setS_r_blocks_count_hi(s_r_blocks_count_hi);
		setS_free_blocks_hi(s_free_blocks_hi);
		setS_min_extra_isize(s_min_extra_isize);
		setS_want_extra_isize(s_want_extra_isize);
		setS_flags(s_flags);
		setS_raid_stride(s_raid_stride);
		setS_mmp_update_interval(s_mmp_update_interval);
		setS_mmp_block(s_mmp_block);
		setS_raid_stripe_width(s_raid_stripe_width);
		setS_log_groups_per_flex(s_log_groups_per_flex);
		setS_checksum_type(s_checksum_type);
		setS_encryption_level(s_encryption_level);
		setS_reserved_pad(s_reserved_pad);
		setS_kbytes_written(s_kbytes_written);
		setS_snapshot_inum(s_snapshot_inum);
		setS_snapshot_id(s_snapshot_id);
		setS_snapshot_r_blocks_count(s_snapshot_r_blocks_count);
		setS_snapshot_list(s_snapshot_list);
		setS_error_count(s_error_count);
		setS_first_error_time(s_first_error_time);
		setS_first_error_ino(s_first_error_ino);
		setS_first_error_block(s_first_error_block);
		setS_first_error_func(s_first_error_func);
		setS_first_error_line(s_first_error_line);
		setS_last_error_time(s_last_error_time);
		setS_last_error_ino(s_last_error_ino);
		setS_last_error_line(s_last_error_line);
		setS_last_error_block(s_last_error_block);
		setS_last_error_func(s_last_error_func);
		setS_mount_opts(s_mount_opts);
		setS_usr_quota_inum(s_usr_quota_inum);
		setS_grp_quota_inum(s_grp_quota_inum);
		setS_overhead_blocks(s_overhead_blocks);
		setS_backup_bgs(s_backup_bgs);
		setS_encrypt_algos(s_encrypt_algos);
		setS_encrypt_pw_salt(s_encrypt_pw_salt);
		setS_lpf_ino(s_lpf_ino);
		setS_prj_quota_inum(s_prj_quota_inum);
		setS_checksum_seed(s_checksum_seed);
		setS_wtime_hi(s_wtime_hi);
		setS_mtime_hi(s_mtime_hi);
		setS_mkfs_time_hi(s_mkfs_time_hi);
		setS_lastcheck_hi(s_lastcheck_hi);
		setS_first_error_time_hi(s_first_error_time_hi);
		setS_last_error_time_hi(s_last_error_time_hi);
		setS_pad(s_pad);
		setS_encoding(s_encoding);
		setS_encoding_flags(s_encoding_flags);
		setS_reserved(s_reserved);
		setS_checksum(s_checksum);
	}
	public ext2_super_block() {
	}
	
	public Object ext2fs_blocks_count() {
		Object generatedExt2_super_block = this.getExt2_super_block();
		return generatedExt2_super_block | (super.ext2fs_has_feature_64bit() ? ()generatedExt2_super_block << 32 : 0/*
		 * Set the fs block count
		 */);
	}
	public void ext2fs_blocks_count_set(Object blk) {
		this.setExt2_super_block(blk);
		if (super.ext2fs_has_feature_64bit()) {
			this.setExt2_super_block(()blk >> 32/*
			 * Add to the current fs block count
			 */);
		} 
	}
	public void ext2fs_blocks_count_add(Object blk) {
		 tmp = new ();
		tmp = super.ext2fs_blocks_count() + blk;
		super.ext2fs_blocks_count_set(tmp/*
		 * Return the fs reserved block count
		 */);
	}
	public Object ext2fs_r_blocks_count() {
		Object generatedExt2_super_block = this.getExt2_super_block();
		return generatedExt2_super_block | (super.ext2fs_has_feature_64bit() ? ()generatedExt2_super_block << 32 : 0/*
		 * Set the fs reserved block count
		 */);
	}
	public void ext2fs_r_blocks_count_set(Object blk) {
		this.setExt2_super_block(blk);
		if (super.ext2fs_has_feature_64bit()) {
			this.setExt2_super_block(()blk >> 32/*
			 * Add to the current reserved fs block count
			 */);
		} 
	}
	public void ext2fs_r_blocks_count_add(Object blk) {
		 tmp = new ();
		tmp = super.ext2fs_r_blocks_count() + blk;
		super.ext2fs_r_blocks_count_set(tmp/*
		 * Return the fs free block count
		 */);
	}
	public Object ext2fs_free_blocks_count() {
		Object generatedExt2_super_block = this.getExt2_super_block();
		return generatedExt2_super_block | (super.ext2fs_has_feature_64bit() ? ()generatedExt2_super_block << 32 : 0/*
		 * Set the fs free block count
		 */);
	}
	public void ext2fs_free_blocks_count_set(Object blk) {
		this.setExt2_super_block(blk);
		if (super.ext2fs_has_feature_64bit()) {
			this.setExt2_super_block(()blk >> 32/*
			 * Add to the current free fs block count
			 */);
		} 
	}
	public void ext2fs_free_blocks_count_add(Object blk) {
		 tmp = new ();
		tmp = super.ext2fs_free_blocks_count() + blk;
		super.ext2fs_free_blocks_count_set(tmp/*
		 * Get a pointer to a block group descriptor.  We need the explicit
		 * pointer to the group desc for code that swaps block group
		 * descriptors before writing them out, as it wants to make a copy and
		 * do the swap there.
		 */);
	}
	/* Project quota */
	/* Needs recovery */
	/* Journal device */
	/* >2GB or 3-lvl htree */
	/* data in inode */
	public int ext2fs_has_feature_dir_prealloc() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_dir_prealloc() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_dir_prealloc() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_imagic_inodes() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_imagic_inodes() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_imagic_inodes() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_journal() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_journal() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_journal() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_xattr() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_xattr() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_xattr() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_resize_inode() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_resize_inode() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_resize_inode() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_dir_index() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_dir_index() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_dir_index() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_lazy_bg() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_lazy_bg() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_lazy_bg() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_exclude_bitmap() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_exclude_bitmap() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_exclude_bitmap() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_sparse_super2() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		return ((generatedS_feature_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_sparse_super2() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat |=  -1024;
	}
	public void ext2fs_clear_feature_sparse_super2() {
		Object generatedS_feature_compat = (sb).getS_feature_compat();
		generatedS_feature_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_sparse_super() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_sparse_super() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_sparse_super() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_large_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_large_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_large_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_huge_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_huge_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_huge_file() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_gdt_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_gdt_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_gdt_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_dir_nlink() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_dir_nlink() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_dir_nlink() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_extra_isize() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_extra_isize() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_extra_isize() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_has_snapshot() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_has_snapshot() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_has_snapshot() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_quota() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_quota() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_quota() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_bigalloc() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_bigalloc() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_bigalloc() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_metadata_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_metadata_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_metadata_csum() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_replica() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_replica() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_replica() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_readonly() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_readonly() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_readonly() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_project() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_project() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_project() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_shared_blocks() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_shared_blocks() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_shared_blocks() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_verity() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		return ((generatedS_feature_ro_compat & -1024) != 0);
	}
	public void ext2fs_set_feature_verity() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat |=  -1024;
	}
	public void ext2fs_clear_feature_verity() {
		Object generatedS_feature_ro_compat = (sb).getS_feature_ro_compat();
		generatedS_feature_ro_compat &=  ~-1024;
	}
	public int ext2fs_has_feature_compression() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_compression() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_compression() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_filetype() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_filetype() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_filetype() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_journal_needs_recovery() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_journal_needs_recovery() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_journal_needs_recovery() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_journal_dev() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_journal_dev() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_journal_dev() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_meta_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_meta_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_meta_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_extents() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_extents() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_extents() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_64bit() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_64bit() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_64bit() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_mmp() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_mmp() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_mmp() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_flex_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_flex_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_flex_bg() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_ea_inode() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_ea_inode() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_ea_inode() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_dirdata() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_dirdata() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_dirdata() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_csum_seed() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_csum_seed() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_csum_seed() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_largedir() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_largedir() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_largedir() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_inline_data() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_inline_data() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_inline_data() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_encrypt() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	public void ext2fs_set_feature_encrypt() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_encrypt() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public int ext2fs_has_feature_fname_encoding() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		return ((generatedS_feature_incompat & -1024) != 0);
	}
	/*
	 * Default values for user and/or group using reserved blocks
	 */
	/*
	 * Default mount options
	 */
	public void ext2fs_set_feature_fname_encoding() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat |=  -1024;
	}
	public void ext2fs_clear_feature_fname_encoding() {
		Object generatedS_feature_incompat = (sb).getS_feature_incompat();
		generatedS_feature_incompat &=  ~-1024;
	}
	public Object write_primary_superblock(Object fs) {
		 old_super = new ();
		 new_super = new ();
		int check_idx;
		int write_idx;
		int size;
		 retval = new ();
		old_super = ()fs.getOrig_super();
		new_super = ()super;
		for (check_idx = 0; check_idx < 1024 / 2; check_idx++) {
			if (old_super[check_idx] == new_super[check_idx]) {
				continue;
			} 
			write_idx = check_idx;
			for (check_idx++; check_idx < 1024 / 2; check_idx++) {
				if (old_super[check_idx] == new_super[check_idx]) {
					break;
				} 
			}
			size = 2 * (check_idx - write_idx);
			retval = ModernizedCProgram.io_channel_write_byte(fs.getIo(), 1024 + (2 * write_idx), size, new_super + write_idx);
			if (retval == EXT2_ET_UNIMPLEMENTED) {
				;
			} 
			if (retval) {
				return retval;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(fs.getOrig_super(), super, 1024);
		return 0;
	}
	public Object write_backup_super(Object fs, Object group, Object group_block) {
		 retval = new ();
		 sgrp = group;
		if (sgrp > ((1 << 16) - 1)) {
			sgrp = (1 << 16) - 1;
		} 
		this.setS_block_group_nr(/*Error: Function owner not recognized*/ext2fs_cpu_to_le16(sgrp));
		retval = super_shadow.ext2fs_superblock_csum_set(fs);
		if (retval) {
			return retval;
		} 
		return ModernizedCProgram.io_channel_write_blk64(fs.getIo(), group_block, -1024, super_shadow);
	}
	public int ext2fs_verify_csum_type(Object fs) {
		if (!fs.getSuper().ext2fs_has_feature_metadata_csum()) {
			return 1;
		} 
		Object generatedS_checksum_type = this.getS_checksum_type();
		return generatedS_checksum_type == 1;
	}
	public Object ext2fs_superblock_csum(Object fs) {
		int offset = ((size_t)((ext2_super_block)0).getS_checksum());
		return ModernizedCProgram.ext2fs_crc32c_le(~0, (byte)sb, offset);
	}
	/* NOTE: The input to this function MUST be in LE order */
	public int ext2fs_superblock_csum_verify(Object fs) {
		 flag = new ();
		 calculated = new ();
		if (fs.getFlags() & -1024) {
			flag = -1024;
		} else {
				flag = /*Error: Function owner not recognized*/ext2fs_cpu_to_le32(-1024);
		} 
		if (!((fs.getSuper()).getS_feature_ro_compat() & (flag))) {
			return 1;
		} 
		calculated = sb.ext2fs_superblock_csum(fs);
		Object generatedS_checksum = this.getS_checksum();
		return /*Error: Function owner not recognized*/ext2fs_le32_to_cpu(generatedS_checksum) == calculated;
	}
	/* NOTE: The input to this function MUST be in LE order */
	public Object ext2fs_superblock_csum_set(Object fs) {
		 flag = new ();
		 crc = new ();
		if (fs.getFlags() & -1024) {
			flag = -1024;
		} else {
				flag = /*Error: Function owner not recognized*/ext2fs_cpu_to_le32(-1024);
		} 
		if (!((fs.getSuper()).getS_feature_ro_compat() & (flag))) {
			return 0;
		} 
		crc = sb.ext2fs_superblock_csum(fs);
		this.setS_checksum(/*Error: Function owner not recognized*/ext2fs_cpu_to_le32(crc));
		return 0;
	}
	public Object ext2fs_initialize(Object name, int flags, Object manager, Object ret_fs) {
		ext2_filsys fs = new ext2_filsys();
		 retval = new ();
		ext2_super_block super = new ext2_super_block();
		int rem;
		int overhead = 0;
		int ipg;
		 i = new ();
		 free_blocks = new ();
		 numblocks = new ();
		int rsv_gdt;
		int csum_flag;
		int bigalloc_flag;
		int io_flags;
		int has_bg;
		int reserved_inos;
		byte buf = 0;
		byte c;
		double reserved_ratio;
		byte time_env;
		if (!param || !param.ext2fs_blocks_count()) {
			return EXT2_ET_INVALID_ARGUMENT;
		} 
		retval = ModernizedCProgram.ext2fs_get_mem(/*Error: Unsupported expression*/, fs);
		if (retval) {
			return retval;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(fs, 0, /*Error: Unsupported expression*/);
		fs.setMagic(EXT2_ET_MAGIC_EXT2FS_FILSYS);
		fs.setFlags(flags | -1024);
		fs.setUmask(22);
		fs.setDefault_bitmap_type(2);
		time_env = /*Error: Function owner not recognized*/getenv("E2FSPROGS_FAKE_TIME");
		if (time_env) {
			fs.setNow(/*Error: Function owner not recognized*/strtoul(time_env, ((Object)0), 0));
		} 
		io_flags = IO_FLAG_RW;
		if (flags & -1024) {
			io_flags |=  IO_FLAG_EXCLUSIVE;
		} 
		if (flags & -1024) {
			io_flags |=  IO_FLAG_DIRECT_IO;
		} 
		io_flags |=  -1024;
		retval = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(name, io_flags, fs.getIo());
		if (retval) {
			;
		} 
		fs.setImage_io(fs.getIo());
		fs.getIo().setApp_data(fs);
		retval = ModernizedCProgram.ext2fs_get_mem(/*Error: Function owner not recognized*/strlen(name) + 1, fs.getDevice_name());
		if (retval) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(fs.getDevice_name(), name);
		retval = ModernizedCProgram.ext2fs_get_mem(1024, super);
		if (retval) {
			;
		} 
		fs.setSuper(super);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(super, 0, 1024);
		super.setS_magic(-1024);
		super.setS_state(-1024);
		bigalloc_flag = param.ext2fs_has_feature_bigalloc();
		Object generatedS_log_block_size = this.getS_log_block_size();
		(super.setS_log_block_size(generatedS_log_block_size));
		Object generatedS_log_cluster_size = this.getS_log_cluster_size();
		if (bigalloc_flag) {
			(super.setS_log_cluster_size(generatedS_log_cluster_size ? generatedS_log_cluster_size : (generatedS_log_block_size + 4)));
			if (generatedS_log_block_size > generatedS_log_cluster_size) {
				retval = EXT2_ET_INVALID_ARGUMENT;
				;
			} 
		} else {
				super.setS_log_cluster_size(generatedS_log_block_size);
		} 
		Object generatedS_first_data_block = this.getS_first_data_block();
		(super.setS_first_data_block(generatedS_first_data_block ? generatedS_first_data_block : (generatedS_log_cluster_size ? 0 : 1)));
		Object generatedS_max_mnt_count = this.getS_max_mnt_count();
		(super.setS_max_mnt_count(generatedS_max_mnt_count ? generatedS_max_mnt_count : (false)));
		Object generatedS_errors = this.getS_errors();
		(super.setS_errors(generatedS_errors ? generatedS_errors : (true)));
		Object generatedS_feature_compat = this.getS_feature_compat();
		(super.setS_feature_compat(generatedS_feature_compat ? generatedS_feature_compat : (false)));
		Object generatedS_feature_incompat = this.getS_feature_incompat();
		(super.setS_feature_incompat(generatedS_feature_incompat ? generatedS_feature_incompat : (false)));
		Object generatedS_feature_ro_compat = this.getS_feature_ro_compat();
		(super.setS_feature_ro_compat(generatedS_feature_ro_compat ? generatedS_feature_ro_compat : (false)));
		Object generatedS_default_mount_opts = this.getS_default_mount_opts();
		(super.setS_default_mount_opts(generatedS_default_mount_opts ? generatedS_default_mount_opts : (false)));
		Object generatedS_first_meta_bg = this.getS_first_meta_bg();
		(super.setS_first_meta_bg(generatedS_first_meta_bg ? generatedS_first_meta_bg : (false)));
		Object generatedS_raid_stride = this.getS_raid_stride();
		(super.setS_raid_stride(generatedS_raid_stride ? generatedS_raid_stride : (/* default stride size: 0 */false)));
		Object generatedS_raid_stripe_width = this.getS_raid_stripe_width();
		(super.setS_raid_stripe_width(generatedS_raid_stripe_width ? generatedS_raid_stripe_width : (/* default stripe width: 0 */false)));
		Object generatedS_log_groups_per_flex = this.getS_log_groups_per_flex();
		(super.setS_log_groups_per_flex(generatedS_log_groups_per_flex ? generatedS_log_groups_per_flex : (false)));
		Object generatedS_flags = this.getS_flags();
		(super.setS_flags(generatedS_flags ? generatedS_flags : (false)));
		Object generatedS_backup_bgs = super.getS_backup_bgs();
		(generatedS_backup_bgs[0] = generatedS_backup_bgs[0]);
		(generatedS_backup_bgs[1] = generatedS_backup_bgs[1]);
		Object generatedS_encoding = this.getS_encoding();
		(super.setS_encoding(generatedS_encoding));
		Object generatedS_encoding_flags = this.getS_encoding_flags();
		(super.setS_encoding_flags(generatedS_encoding_flags));
		if (generatedS_feature_incompat & ~(-1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | (false) | -1024 | -1024 | -1024 | -1024 | -1024 | -1024)) {
			retval = EXT2_ET_UNSUPP_FEATURE;
			;
		} 
		if (generatedS_feature_ro_compat & ~(-1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024 | -1024)) {
			retval = EXT2_ET_RO_UNSUPP_FEATURE;
			;
		} 
		Object generatedS_rev_level = this.getS_rev_level();
		(super.setS_rev_level(generatedS_rev_level ? generatedS_rev_level : (false)));
		Object generatedS_first_ino = this.getS_first_ino();
		Object generatedS_inode_size = this.getS_inode_size();
		Object generatedS_min_extra_isize = this.getS_min_extra_isize();
		Object generatedS_want_extra_isize = this.getS_want_extra_isize();
		if (generatedS_rev_level >= 1) {
			(super.setS_first_ino(generatedS_first_ino ? generatedS_first_ino : (true)));
			(super.setS_inode_size(generatedS_inode_size ? generatedS_inode_size : (true)));
			if (generatedS_inode_size >= /*Error: Unsupported expression*/) {
				int extra_isize = /*Error: Unsupported expression*/ - 128;
				(super.setS_min_extra_isize(generatedS_min_extra_isize ? generatedS_min_extra_isize : (extra_isize)));
				(super.setS_want_extra_isize(generatedS_want_extra_isize ? generatedS_want_extra_isize : (extra_isize)));
			} 
		} else {
				super.setS_first_ino(11);
				super.setS_inode_size(128);
		} 
		Object generatedS_checkinterval = this.getS_checkinterval();
		(super.setS_checkinterval(generatedS_checkinterval ? generatedS_checkinterval : (false)));
		super.setS_mkfs_time(super.setS_lastcheck(fs.getNow() ? fs.getNow() : /*Error: Function owner not recognized*/time(((Object)0))));
		super.setS_creator_os(0);
		fs.setFragsize(fs.setBlocksize(((1 << 10) << generatedS_log_block_size)));
		fs.setCluster_ratio_bits(generatedS_log_cluster_size - generatedS_log_block_size);
		Object generatedS_blocks_per_group = this.getS_blocks_per_group();
		Object generatedS_clusters_per_group = this.getS_clusters_per_group();
		if (bigalloc_flag) {
			long bpg;
			if (generatedS_blocks_per_group && generatedS_clusters_per_group && ((generatedS_clusters_per_group * (-1024 << (fs).getCluster_ratio_bits())) != generatedS_blocks_per_group)) {
				retval = EXT2_ET_INVALID_ARGUMENT;
				;
			} 
			if (generatedS_clusters_per_group) {
				(super.setS_clusters_per_group(generatedS_clusters_per_group));
			}  else if (generatedS_blocks_per_group) {
				super.setS_clusters_per_group(generatedS_blocks_per_group / (-1024 << (fs).getCluster_ratio_bits()));
			}  else if (generatedS_log_cluster_size + 15 < 32) {
				super.setS_clusters_per_group(fs.getBlocksize() * 8);
			} else {
					super.setS_clusters_per_group((fs.getBlocksize() - 1) * 8);
			} 
			if (generatedS_clusters_per_group > (((int)1 << 16) - 8)) {
				super.setS_clusters_per_group((((int)1 << 16) - 8));
			} 
			bpg = (((long)generatedS_clusters_per_group) << (fs).getCluster_ratio_bits());
			if (bpg >= (((long)1) << 32)) {
				retval = EXT2_ET_INVALID_ARGUMENT;
				;
			} 
			super.setS_blocks_per_group(bpg);
		} else {
				(super.setS_blocks_per_group(generatedS_blocks_per_group ? generatedS_blocks_per_group : (fs.getBlocksize() * 8)));
				if (generatedS_blocks_per_group > ((((int)1 << 16) - 8) * (((1 << 10) << generatedS_log_cluster_size) / ((1 << 10) << generatedS_log_block_size)))) {
					super.setS_blocks_per_group(((((int)1 << 16) - 8) * (((1 << 10) << generatedS_log_cluster_size) / ((1 << 10) << generatedS_log_block_size))));
				} 
				super.setS_clusters_per_group(generatedS_blocks_per_group);
		} 
		super.ext2fs_blocks_count_set(param.ext2fs_blocks_count() & ~(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((-1024 << (fs).getCluster_ratio_bits()) - 1)));
		super.ext2fs_r_blocks_count_set(param.ext2fs_r_blocks_count());
		if (super.ext2fs_r_blocks_count() >= param.ext2fs_blocks_count()) {
			retval = EXT2_ET_INVALID_ARGUMENT;
			;
		} 
		Object generatedS_mmp_update_interval = this.getS_mmp_update_interval();
		(super.setS_mmp_update_interval(generatedS_mmp_update_interval ? generatedS_mmp_update_interval : (false/*
			 * If we're creating an external journal device, we don't need
			 * to bother with the rest.
			 */)));
		if (super.ext2fs_has_feature_journal_dev()) {
			fs.setGroup_desc_count(0);
			ModernizedCProgram.ext2fs_mark_super_dirty(fs);
			ret_fs = fs;
			return 0;
		} 
		if (fs.getGroup_desc_count() == 0) {
			retval = EXT2_ET_TOOSMALL;
			;
		} 
		Object generatedS_desc_size = this.getS_desc_size();
		(super.setS_desc_size(generatedS_desc_size ? generatedS_desc_size : (super.ext2fs_has_feature_64bit() ? 64 : 0)));
		if (((generatedS_feature_incompat & -1024) ? generatedS_desc_size : 32) == 0) {
			retval = EXT2_ET_UNEXPECTED_BLOCK_SIZE;
			;
		} 
		fs.setDesc_blocks(ModernizedCProgram.ext2fs_div_ceil(fs.getGroup_desc_count(), (((1 << 10) << generatedS_log_block_size) / ((generatedS_feature_incompat & -1024) ? generatedS_desc_size : 32))));
		i = fs.getBlocksize() >= 4096 ? 1 : 4096 / fs.getBlocksize();
		Object generatedS_inodes_count = this.getS_inodes_count();
		if (super.ext2fs_has_feature_64bit() && (super.ext2fs_blocks_count() / i) >= (-1024 << 32)) {
			(super.setS_inodes_count(generatedS_inodes_count ? generatedS_inodes_count : (~-1024)));
		} else {
				(super.setS_inodes_count(generatedS_inodes_count ? generatedS_inodes_count : (super.ext2fs_blocks_count() / i/*
					 * Make sure we have at least EXT2_FIRST_INO + 1 inodes, so
					 * that we have enough inodes for the filesystem(!)
					 */)));
		} 
		if (generatedS_inodes_count < ((generatedS_rev_level == 0) ? 11 : generatedS_first_ino) + 1) {
			super.setS_inodes_count(((generatedS_rev_level == 0) ? 11 : generatedS_first_ino) + 1/*
				 * There should be at least as many inodes as the user
				 * requested.  Figure out how many inodes per group that
				 * should be.  But make sure that we don't allocate more than
				 * one bitmap's worth of inodes each group.
				 */);
		} 
		ipg = ModernizedCProgram.ext2fs_div_ceil(generatedS_inodes_count, fs.getGroup_desc_count());
		if (ipg > fs.getBlocksize() * 8) {
			if (!bigalloc_flag && generatedS_blocks_per_group >= 256) {
				generatedS_blocks_per_group -= /* Try again with slightly different parameters */8;
				super.ext2fs_blocks_count_set(param.ext2fs_blocks_count());
				super.setS_clusters_per_group(generatedS_blocks_per_group);
				;
			} else {
					retval = EXT2_ET_TOO_MANY_INODES;
					;
			} 
		} 
		if (ipg > (int)(((int)1 << 16) - (((1 << 10) << generatedS_log_block_size) / ((generatedS_rev_level == 0) ? 128 : generatedS_inode_size)))) {
			ipg = (((int)1 << 16) - (((1 << 10) << generatedS_log_block_size) / ((generatedS_rev_level == 0) ? 128 : generatedS_inode_size)));
		} 
		Object generatedS_inodes_per_group = super.getS_inodes_per_group();
		fs.setInode_blocks_per_group((((generatedS_inodes_per_group * ((generatedS_rev_level == 0) ? 128 : generatedS_inode_size)) + ((1 << 10) << generatedS_log_block_size) - 1) / ((1 << 10) << generatedS_log_block_size)));
		super.setS_inodes_per_group(((fs.getInode_blocks_per_group() * ((1 << 10) << generatedS_log_block_size)) / ((generatedS_rev_level == 0) ? 128 : generatedS_inode_size)));
		if (generatedS_inodes_per_group < 8) {
			super.setS_inodes_per_group(8);
		} 
		generatedS_inodes_per_group &=  ~7;
		fs.setInode_blocks_per_group((((generatedS_inodes_per_group * ((generatedS_rev_level == 0) ? 128 : generatedS_inode_size)) + ((1 << 10) << generatedS_log_block_size) - 1) / ((1 << 10) << generatedS_log_block_size)));
		if (()generatedS_inodes_per_group * fs.getGroup_desc_count() > ~-1024) {
			ipg--;
			;
		} 
		super.setS_inodes_count(generatedS_inodes_per_group * fs.getGroup_desc_count());
		super.setS_free_inodes_count(generatedS_inodes_count);
		if (super.ext2fs_has_feature_resize_inode()) {
			rsv_gdt = ModernizedCProgram.calc_reserved_gdt_blocks(fs);
		} else {
				rsv_gdt = 0;
		} 
		Object generatedS_reserved_gdt_blocks = this.getS_reserved_gdt_blocks();
		(super.setS_reserved_gdt_blocks(generatedS_reserved_gdt_blocks ? generatedS_reserved_gdt_blocks : (rsv_gdt)));
		if (generatedS_reserved_gdt_blocks > (((1 << 10) << generatedS_log_block_size) / /*Error: Unsupported expression*/)) {
			retval = EXT2_ET_RES_GDT_BLOCKS;
			;
		} 
		if (generatedS_reserved_gdt_blocks + fs.getDesc_blocks() > generatedS_blocks_per_group * 3 / 4) {
			fs.getSuper().ext2fs_set_feature_meta_bg();
			fs.getSuper().ext2fs_clear_feature_resize_inode();
			(super.setS_reserved_gdt_blocks(generatedS_reserved_gdt_blocks ? generatedS_reserved_gdt_blocks : (false/*
				 * Calculate the maximum number of bookkeeping blocks per
				 * group.  It includes the superblock, the block group
				 * descriptors, the block bitmap, the inode bitmap, the inode
				 * table, and the reserved gdt blocks.
				 */)));
		} 
		overhead = (int)(3 + fs.getInode_blocks_per_group() + generatedS_reserved_gdt_blocks);
		if (fs.getSuper().ext2fs_has_feature_meta_bg()) {
			overhead++;
		} else {
				overhead += fs.getDesc_blocks();
		} 
		if (overhead > generatedS_blocks_per_group) {
			retval = EXT2_ET_TOO_MANY_INODES;
			;
		} 
		overhead = (int)(2 + fs.getInode_blocks_per_group());
		has_bg = 0;
		if (super/*
				 * We have to do this manually since
				 * super->s_backup_bgs hasn't been set up yet.
				 */.ext2fs_has_feature_sparse_super2()) {
			if (fs.getGroup_desc_count() == 2) {
				has_bg = generatedS_backup_bgs[0] != 0;
			} else {
					has_bg = generatedS_backup_bgs[1] != 0;
			} 
		} else {
				has_bg = ModernizedCProgram.ext2fs_bg_has_super(fs, fs.getGroup_desc_count() - 1);
		} 
		if (has_bg) {
			overhead += 1 + fs.getDesc_blocks() + generatedS_reserved_gdt_blocks;
		} 
		rem = ((super.ext2fs_blocks_count() - generatedS_first_data_block) % generatedS_blocks_per_group);
		if ((fs.getGroup_desc_count() == 1) && rem && (rem < overhead)) {
			retval = EXT2_ET_TOOSMALL;
			;
		} 
		if (rem && (rem < overhead + 50)) {
			super.ext2fs_blocks_count_set(super.ext2fs_blocks_count() - rem/*
					 * If blocks count is changed, we need to recalculate
					 * reserved blocks count not to exceed 50%.
					 */);
			reserved_ratio = 100.0 * param.ext2fs_r_blocks_count() / param.ext2fs_blocks_count();
			super.ext2fs_r_blocks_count_set(reserved_ratio * super.ext2fs_blocks_count() / 100.0);
			;
		} 
		if (/* Set up the locations of the backup superblocks */super.ext2fs_has_feature_sparse_super2()) {
			if (generatedS_backup_bgs[0] >= fs.getGroup_desc_count()) {
				generatedS_backup_bgs[0] = fs.getGroup_desc_count() - 1;
			} 
			if (generatedS_backup_bgs[1] >= fs.getGroup_desc_count()) {
				generatedS_backup_bgs[1] = fs.getGroup_desc_count() - 1;
			} 
			if (generatedS_backup_bgs[0] == generatedS_backup_bgs[1]) {
				generatedS_backup_bgs[1] = 0;
			} 
			if (generatedS_backup_bgs[0] > generatedS_backup_bgs[1]) {
				 t = generatedS_backup_bgs[0];
				generatedS_backup_bgs[0] = generatedS_backup_bgs[1];
				generatedS_backup_bgs[1] = t;
			} 
		} 
		retval = ModernizedCProgram.ext2fs_get_mem(/*Error: Function owner not recognized*/strlen(fs.getDevice_name()) + 80, buf);
		if (retval) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(buf, "block bitmap for ");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat(buf, fs.getDevice_name());
		retval = ModernizedCProgram.ext2fs_allocate_subcluster_bitmap(fs, buf, fs.getBlock_map());
		if (retval) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(buf, "inode bitmap for ");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat(buf, fs.getDevice_name());
		retval = ModernizedCProgram.ext2fs_allocate_inode_bitmap(fs, buf, fs.getInode_map());
		if (retval) {
			;
		} 
		ModernizedCProgram.ext2fs_free_mem(buf);
		retval = ModernizedCProgram.ext2fs_get_array(fs.getDesc_blocks(), fs.getBlocksize(), fs.getGroup_desc());
		if (retval) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(fs.getGroup_desc(), 0, (size_t)fs.getDesc_blocks() * fs.getBlocksize());
		free_blocks = 0;
		csum_flag = ModernizedCProgram.ext2fs_has_group_desc_csum(fs);
		reserved_inos = generatedS_first_ino;
		for (i = 0; i < fs.getGroup_desc_count(); i/*
				 * Don't set the BLOCK_UNINIT group for the last group
				 * because the block bitmap needs to be padded.
				 */++) {
			if (csum_flag) {
				if (i != fs.getGroup_desc_count() - 1) {
					ModernizedCProgram.ext2fs_bg_flags_set(fs, i, -1024);
				} 
				ModernizedCProgram.ext2fs_bg_flags_set(fs, i, -1024);
				numblocks = generatedS_inodes_per_group;
				if (reserved_inos) {
					if (numblocks > reserved_inos) {
						numblocks -= reserved_inos;
						reserved_inos = 0;
					} else {
							reserved_inos -= numblocks;
							numblocks = 0;
					} 
				} 
				ModernizedCProgram.ext2fs_bg_itable_unused_set(fs, i, numblocks);
			} 
			numblocks = ModernizedCProgram.ext2fs_reserve_super_and_bgd(fs, i, fs.getBlock_map());
			if (generatedS_log_groups_per_flex) {
				numblocks += 2 + fs.getInode_blocks_per_group();
			} 
			free_blocks += numblocks;
			ModernizedCProgram.ext2fs_bg_free_blocks_count_set(fs, i, numblocks);
			ModernizedCProgram.ext2fs_bg_free_inodes_count_set(fs, i, generatedS_inodes_per_group);
			ModernizedCProgram.ext2fs_bg_used_dirs_count_set(fs, i, 0);
			ModernizedCProgram.ext2fs_group_desc_csum_set(fs, i);
		}
		free_blocks &=  ~((-1024 << (fs).getCluster_ratio_bits()) - 1);
		super.ext2fs_free_blocks_count_set(free_blocks);
		c = (byte)255// coverity[dead_error_condition];// coverity[dead_error_condition]
		if (((int)c) == -1) {
			generatedS_flags |=  -1024;
		} else {
				generatedS_flags |=  -1024;
		} 
		ModernizedCProgram.ext2fs_mark_super_dirty(fs);
		ModernizedCProgram.ext2fs_mark_bb_dirty(fs);
		ModernizedCProgram.ext2fs_mark_ib_dirty(fs);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/io_channel_set_blksize(fs.getIo(), fs.getBlocksize());
		ret_fs = fs;
		return 0;
		ModernizedCProgram.ext2fs_free(fs);
		return retval;
	}
	public Object getS_inodes_count() {
		return s_inodes_count;
	}
	public void setS_inodes_count(Object newS_inodes_count) {
		s_inodes_count = newS_inodes_count;
	}
	public Object getS_blocks_count() {
		return s_blocks_count;
	}
	public void setS_blocks_count(Object newS_blocks_count) {
		s_blocks_count = newS_blocks_count;
	}
	public Object getS_r_blocks_count() {
		return s_r_blocks_count;
	}
	public void setS_r_blocks_count(Object newS_r_blocks_count) {
		s_r_blocks_count = newS_r_blocks_count;
	}
	public Object getS_free_blocks_count() {
		return s_free_blocks_count;
	}
	public void setS_free_blocks_count(Object newS_free_blocks_count) {
		s_free_blocks_count = newS_free_blocks_count;
	}
	public Object getS_free_inodes_count() {
		return s_free_inodes_count;
	}
	public void setS_free_inodes_count(Object newS_free_inodes_count) {
		s_free_inodes_count = newS_free_inodes_count;
	}
	public Object getS_first_data_block() {
		return s_first_data_block;
	}
	public void setS_first_data_block(Object newS_first_data_block) {
		s_first_data_block = newS_first_data_block;
	}
	public Object getS_log_block_size() {
		return s_log_block_size;
	}
	public void setS_log_block_size(Object newS_log_block_size) {
		s_log_block_size = newS_log_block_size;
	}
	public Object getS_log_cluster_size() {
		return s_log_cluster_size;
	}
	public void setS_log_cluster_size(Object newS_log_cluster_size) {
		s_log_cluster_size = newS_log_cluster_size;
	}
	public Object getS_blocks_per_group() {
		return s_blocks_per_group;
	}
	public void setS_blocks_per_group(Object newS_blocks_per_group) {
		s_blocks_per_group = newS_blocks_per_group;
	}
	public Object getS_clusters_per_group() {
		return s_clusters_per_group;
	}
	public void setS_clusters_per_group(Object newS_clusters_per_group) {
		s_clusters_per_group = newS_clusters_per_group;
	}
	public Object getS_inodes_per_group() {
		return s_inodes_per_group;
	}
	public void setS_inodes_per_group(Object newS_inodes_per_group) {
		s_inodes_per_group = newS_inodes_per_group;
	}
	public Object getS_mtime() {
		return s_mtime;
	}
	public void setS_mtime(Object newS_mtime) {
		s_mtime = newS_mtime;
	}
	public Object getS_wtime() {
		return s_wtime;
	}
	public void setS_wtime(Object newS_wtime) {
		s_wtime = newS_wtime;
	}
	public Object getS_mnt_count() {
		return s_mnt_count;
	}
	public void setS_mnt_count(Object newS_mnt_count) {
		s_mnt_count = newS_mnt_count;
	}
	public Object getS_max_mnt_count() {
		return s_max_mnt_count;
	}
	public void setS_max_mnt_count(Object newS_max_mnt_count) {
		s_max_mnt_count = newS_max_mnt_count;
	}
	public Object getS_magic() {
		return s_magic;
	}
	public void setS_magic(Object newS_magic) {
		s_magic = newS_magic;
	}
	public Object getS_state() {
		return s_state;
	}
	public void setS_state(Object newS_state) {
		s_state = newS_state;
	}
	public Object getS_errors() {
		return s_errors;
	}
	public void setS_errors(Object newS_errors) {
		s_errors = newS_errors;
	}
	public Object getS_minor_rev_level() {
		return s_minor_rev_level;
	}
	public void setS_minor_rev_level(Object newS_minor_rev_level) {
		s_minor_rev_level = newS_minor_rev_level;
	}
	public Object getS_lastcheck() {
		return s_lastcheck;
	}
	public void setS_lastcheck(Object newS_lastcheck) {
		s_lastcheck = newS_lastcheck;
	}
	public Object getS_checkinterval() {
		return s_checkinterval;
	}
	public void setS_checkinterval(Object newS_checkinterval) {
		s_checkinterval = newS_checkinterval;
	}
	public Object getS_creator_os() {
		return s_creator_os;
	}
	public void setS_creator_os(Object newS_creator_os) {
		s_creator_os = newS_creator_os;
	}
	public Object getS_rev_level() {
		return s_rev_level;
	}
	public void setS_rev_level(Object newS_rev_level) {
		s_rev_level = newS_rev_level;
	}
	public Object getS_def_resuid() {
		return s_def_resuid;
	}
	public void setS_def_resuid(Object newS_def_resuid) {
		s_def_resuid = newS_def_resuid;
	}
	public Object getS_def_resgid() {
		return s_def_resgid;
	}
	public void setS_def_resgid(Object newS_def_resgid) {
		s_def_resgid = newS_def_resgid;
	}
	public Object getS_first_ino() {
		return s_first_ino;
	}
	public void setS_first_ino(Object newS_first_ino) {
		s_first_ino = newS_first_ino;
	}
	public Object getS_inode_size() {
		return s_inode_size;
	}
	public void setS_inode_size(Object newS_inode_size) {
		s_inode_size = newS_inode_size;
	}
	public Object getS_block_group_nr() {
		return s_block_group_nr;
	}
	public void setS_block_group_nr(Object newS_block_group_nr) {
		s_block_group_nr = newS_block_group_nr;
	}
	public Object getS_feature_compat() {
		return s_feature_compat;
	}
	public void setS_feature_compat(Object newS_feature_compat) {
		s_feature_compat = newS_feature_compat;
	}
	public Object getS_feature_incompat() {
		return s_feature_incompat;
	}
	public void setS_feature_incompat(Object newS_feature_incompat) {
		s_feature_incompat = newS_feature_incompat;
	}
	public Object getS_feature_ro_compat() {
		return s_feature_ro_compat;
	}
	public void setS_feature_ro_compat(Object newS_feature_ro_compat) {
		s_feature_ro_compat = newS_feature_ro_compat;
	}
	public Object getS_uuid() {
		return s_uuid;
	}
	public void setS_uuid(Object newS_uuid) {
		s_uuid = newS_uuid;
	}
	public Object getS_volume_name() {
		return s_volume_name;
	}
	public void setS_volume_name(Object newS_volume_name) {
		s_volume_name = newS_volume_name;
	}
	public Object getS_last_mounted() {
		return s_last_mounted;
	}
	public void setS_last_mounted(Object newS_last_mounted) {
		s_last_mounted = newS_last_mounted;
	}
	public Object getS_algorithm_usage_bitmap() {
		return s_algorithm_usage_bitmap;
	}
	public void setS_algorithm_usage_bitmap(Object newS_algorithm_usage_bitmap) {
		s_algorithm_usage_bitmap = newS_algorithm_usage_bitmap;
	}
	public Object getS_prealloc_blocks() {
		return s_prealloc_blocks;
	}
	public void setS_prealloc_blocks(Object newS_prealloc_blocks) {
		s_prealloc_blocks = newS_prealloc_blocks;
	}
	public Object getS_prealloc_dir_blocks() {
		return s_prealloc_dir_blocks;
	}
	public void setS_prealloc_dir_blocks(Object newS_prealloc_dir_blocks) {
		s_prealloc_dir_blocks = newS_prealloc_dir_blocks;
	}
	public Object getS_reserved_gdt_blocks() {
		return s_reserved_gdt_blocks;
	}
	public void setS_reserved_gdt_blocks(Object newS_reserved_gdt_blocks) {
		s_reserved_gdt_blocks = newS_reserved_gdt_blocks;
	}
	public Object getS_journal_uuid() {
		return s_journal_uuid;
	}
	public void setS_journal_uuid(Object newS_journal_uuid) {
		s_journal_uuid = newS_journal_uuid;
	}
	public Object getS_journal_inum() {
		return s_journal_inum;
	}
	public void setS_journal_inum(Object newS_journal_inum) {
		s_journal_inum = newS_journal_inum;
	}
	public Object getS_journal_dev() {
		return s_journal_dev;
	}
	public void setS_journal_dev(Object newS_journal_dev) {
		s_journal_dev = newS_journal_dev;
	}
	public Object getS_last_orphan() {
		return s_last_orphan;
	}
	public void setS_last_orphan(Object newS_last_orphan) {
		s_last_orphan = newS_last_orphan;
	}
	public Object getS_hash_seed() {
		return s_hash_seed;
	}
	public void setS_hash_seed(Object newS_hash_seed) {
		s_hash_seed = newS_hash_seed;
	}
	public Object getS_def_hash_version() {
		return s_def_hash_version;
	}
	public void setS_def_hash_version(Object newS_def_hash_version) {
		s_def_hash_version = newS_def_hash_version;
	}
	public Object getS_jnl_backup_type() {
		return s_jnl_backup_type;
	}
	public void setS_jnl_backup_type(Object newS_jnl_backup_type) {
		s_jnl_backup_type = newS_jnl_backup_type;
	}
	public Object getS_desc_size() {
		return s_desc_size;
	}
	public void setS_desc_size(Object newS_desc_size) {
		s_desc_size = newS_desc_size;
	}
	public Object getS_default_mount_opts() {
		return s_default_mount_opts;
	}
	public void setS_default_mount_opts(Object newS_default_mount_opts) {
		s_default_mount_opts = newS_default_mount_opts;
	}
	public Object getS_first_meta_bg() {
		return s_first_meta_bg;
	}
	public void setS_first_meta_bg(Object newS_first_meta_bg) {
		s_first_meta_bg = newS_first_meta_bg;
	}
	public Object getS_mkfs_time() {
		return s_mkfs_time;
	}
	public void setS_mkfs_time(Object newS_mkfs_time) {
		s_mkfs_time = newS_mkfs_time;
	}
	public Object getS_jnl_blocks() {
		return s_jnl_blocks;
	}
	public void setS_jnl_blocks(Object newS_jnl_blocks) {
		s_jnl_blocks = newS_jnl_blocks;
	}
	public Object getS_blocks_count_hi() {
		return s_blocks_count_hi;
	}
	public void setS_blocks_count_hi(Object newS_blocks_count_hi) {
		s_blocks_count_hi = newS_blocks_count_hi;
	}
	public Object getS_r_blocks_count_hi() {
		return s_r_blocks_count_hi;
	}
	public void setS_r_blocks_count_hi(Object newS_r_blocks_count_hi) {
		s_r_blocks_count_hi = newS_r_blocks_count_hi;
	}
	public Object getS_free_blocks_hi() {
		return s_free_blocks_hi;
	}
	public void setS_free_blocks_hi(Object newS_free_blocks_hi) {
		s_free_blocks_hi = newS_free_blocks_hi;
	}
	public Object getS_min_extra_isize() {
		return s_min_extra_isize;
	}
	public void setS_min_extra_isize(Object newS_min_extra_isize) {
		s_min_extra_isize = newS_min_extra_isize;
	}
	public Object getS_want_extra_isize() {
		return s_want_extra_isize;
	}
	public void setS_want_extra_isize(Object newS_want_extra_isize) {
		s_want_extra_isize = newS_want_extra_isize;
	}
	public Object getS_flags() {
		return s_flags;
	}
	public void setS_flags(Object newS_flags) {
		s_flags = newS_flags;
	}
	public Object getS_raid_stride() {
		return s_raid_stride;
	}
	public void setS_raid_stride(Object newS_raid_stride) {
		s_raid_stride = newS_raid_stride;
	}
	public Object getS_mmp_update_interval() {
		return s_mmp_update_interval;
	}
	public void setS_mmp_update_interval(Object newS_mmp_update_interval) {
		s_mmp_update_interval = newS_mmp_update_interval;
	}
	public Object getS_mmp_block() {
		return s_mmp_block;
	}
	public void setS_mmp_block(Object newS_mmp_block) {
		s_mmp_block = newS_mmp_block;
	}
	public Object getS_raid_stripe_width() {
		return s_raid_stripe_width;
	}
	public void setS_raid_stripe_width(Object newS_raid_stripe_width) {
		s_raid_stripe_width = newS_raid_stripe_width;
	}
	public Object getS_log_groups_per_flex() {
		return s_log_groups_per_flex;
	}
	public void setS_log_groups_per_flex(Object newS_log_groups_per_flex) {
		s_log_groups_per_flex = newS_log_groups_per_flex;
	}
	public Object getS_checksum_type() {
		return s_checksum_type;
	}
	public void setS_checksum_type(Object newS_checksum_type) {
		s_checksum_type = newS_checksum_type;
	}
	public Object getS_encryption_level() {
		return s_encryption_level;
	}
	public void setS_encryption_level(Object newS_encryption_level) {
		s_encryption_level = newS_encryption_level;
	}
	public Object getS_reserved_pad() {
		return s_reserved_pad;
	}
	public void setS_reserved_pad(Object newS_reserved_pad) {
		s_reserved_pad = newS_reserved_pad;
	}
	public Object getS_kbytes_written() {
		return s_kbytes_written;
	}
	public void setS_kbytes_written(Object newS_kbytes_written) {
		s_kbytes_written = newS_kbytes_written;
	}
	public Object getS_snapshot_inum() {
		return s_snapshot_inum;
	}
	public void setS_snapshot_inum(Object newS_snapshot_inum) {
		s_snapshot_inum = newS_snapshot_inum;
	}
	public Object getS_snapshot_id() {
		return s_snapshot_id;
	}
	public void setS_snapshot_id(Object newS_snapshot_id) {
		s_snapshot_id = newS_snapshot_id;
	}
	public Object getS_snapshot_r_blocks_count() {
		return s_snapshot_r_blocks_count;
	}
	public void setS_snapshot_r_blocks_count(Object newS_snapshot_r_blocks_count) {
		s_snapshot_r_blocks_count = newS_snapshot_r_blocks_count;
	}
	public Object getS_snapshot_list() {
		return s_snapshot_list;
	}
	public void setS_snapshot_list(Object newS_snapshot_list) {
		s_snapshot_list = newS_snapshot_list;
	}
	public Object getS_error_count() {
		return s_error_count;
	}
	public void setS_error_count(Object newS_error_count) {
		s_error_count = newS_error_count;
	}
	public Object getS_first_error_time() {
		return s_first_error_time;
	}
	public void setS_first_error_time(Object newS_first_error_time) {
		s_first_error_time = newS_first_error_time;
	}
	public Object getS_first_error_ino() {
		return s_first_error_ino;
	}
	public void setS_first_error_ino(Object newS_first_error_ino) {
		s_first_error_ino = newS_first_error_ino;
	}
	public Object getS_first_error_block() {
		return s_first_error_block;
	}
	public void setS_first_error_block(Object newS_first_error_block) {
		s_first_error_block = newS_first_error_block;
	}
	public Object getS_first_error_func() {
		return s_first_error_func;
	}
	public void setS_first_error_func(Object newS_first_error_func) {
		s_first_error_func = newS_first_error_func;
	}
	public Object getS_first_error_line() {
		return s_first_error_line;
	}
	public void setS_first_error_line(Object newS_first_error_line) {
		s_first_error_line = newS_first_error_line;
	}
	public Object getS_last_error_time() {
		return s_last_error_time;
	}
	public void setS_last_error_time(Object newS_last_error_time) {
		s_last_error_time = newS_last_error_time;
	}
	public Object getS_last_error_ino() {
		return s_last_error_ino;
	}
	public void setS_last_error_ino(Object newS_last_error_ino) {
		s_last_error_ino = newS_last_error_ino;
	}
	public Object getS_last_error_line() {
		return s_last_error_line;
	}
	public void setS_last_error_line(Object newS_last_error_line) {
		s_last_error_line = newS_last_error_line;
	}
	public Object getS_last_error_block() {
		return s_last_error_block;
	}
	public void setS_last_error_block(Object newS_last_error_block) {
		s_last_error_block = newS_last_error_block;
	}
	public Object getS_last_error_func() {
		return s_last_error_func;
	}
	public void setS_last_error_func(Object newS_last_error_func) {
		s_last_error_func = newS_last_error_func;
	}
	public Object getS_mount_opts() {
		return s_mount_opts;
	}
	public void setS_mount_opts(Object newS_mount_opts) {
		s_mount_opts = newS_mount_opts;
	}
	public Object getS_usr_quota_inum() {
		return s_usr_quota_inum;
	}
	public void setS_usr_quota_inum(Object newS_usr_quota_inum) {
		s_usr_quota_inum = newS_usr_quota_inum;
	}
	public Object getS_grp_quota_inum() {
		return s_grp_quota_inum;
	}
	public void setS_grp_quota_inum(Object newS_grp_quota_inum) {
		s_grp_quota_inum = newS_grp_quota_inum;
	}
	public Object getS_overhead_blocks() {
		return s_overhead_blocks;
	}
	public void setS_overhead_blocks(Object newS_overhead_blocks) {
		s_overhead_blocks = newS_overhead_blocks;
	}
	public Object getS_backup_bgs() {
		return s_backup_bgs;
	}
	public void setS_backup_bgs(Object newS_backup_bgs) {
		s_backup_bgs = newS_backup_bgs;
	}
	public Object getS_encrypt_algos() {
		return s_encrypt_algos;
	}
	public void setS_encrypt_algos(Object newS_encrypt_algos) {
		s_encrypt_algos = newS_encrypt_algos;
	}
	public Object getS_encrypt_pw_salt() {
		return s_encrypt_pw_salt;
	}
	public void setS_encrypt_pw_salt(Object newS_encrypt_pw_salt) {
		s_encrypt_pw_salt = newS_encrypt_pw_salt;
	}
	public Object getS_lpf_ino() {
		return s_lpf_ino;
	}
	public void setS_lpf_ino(Object newS_lpf_ino) {
		s_lpf_ino = newS_lpf_ino;
	}
	public Object getS_prj_quota_inum() {
		return s_prj_quota_inum;
	}
	public void setS_prj_quota_inum(Object newS_prj_quota_inum) {
		s_prj_quota_inum = newS_prj_quota_inum;
	}
	public Object getS_checksum_seed() {
		return s_checksum_seed;
	}
	public void setS_checksum_seed(Object newS_checksum_seed) {
		s_checksum_seed = newS_checksum_seed;
	}
	public Object getS_wtime_hi() {
		return s_wtime_hi;
	}
	public void setS_wtime_hi(Object newS_wtime_hi) {
		s_wtime_hi = newS_wtime_hi;
	}
	public Object getS_mtime_hi() {
		return s_mtime_hi;
	}
	public void setS_mtime_hi(Object newS_mtime_hi) {
		s_mtime_hi = newS_mtime_hi;
	}
	public Object getS_mkfs_time_hi() {
		return s_mkfs_time_hi;
	}
	public void setS_mkfs_time_hi(Object newS_mkfs_time_hi) {
		s_mkfs_time_hi = newS_mkfs_time_hi;
	}
	public Object getS_lastcheck_hi() {
		return s_lastcheck_hi;
	}
	public void setS_lastcheck_hi(Object newS_lastcheck_hi) {
		s_lastcheck_hi = newS_lastcheck_hi;
	}
	public Object getS_first_error_time_hi() {
		return s_first_error_time_hi;
	}
	public void setS_first_error_time_hi(Object newS_first_error_time_hi) {
		s_first_error_time_hi = newS_first_error_time_hi;
	}
	public Object getS_last_error_time_hi() {
		return s_last_error_time_hi;
	}
	public void setS_last_error_time_hi(Object newS_last_error_time_hi) {
		s_last_error_time_hi = newS_last_error_time_hi;
	}
	public Object getS_pad() {
		return s_pad;
	}
	public void setS_pad(Object newS_pad) {
		s_pad = newS_pad;
	}
	public Object getS_encoding() {
		return s_encoding;
	}
	public void setS_encoding(Object newS_encoding) {
		s_encoding = newS_encoding;
	}
	public Object getS_encoding_flags() {
		return s_encoding_flags;
	}
	public void setS_encoding_flags(Object newS_encoding_flags) {
		s_encoding_flags = newS_encoding_flags;
	}
	public Object getS_reserved() {
		return s_reserved;
	}
	public void setS_reserved(Object newS_reserved) {
		s_reserved = newS_reserved;
	}
	public Object getS_checksum() {
		return s_checksum;
	}
	public void setS_checksum(Object newS_checksum) {
		s_checksum = newS_checksum;
	}
}
