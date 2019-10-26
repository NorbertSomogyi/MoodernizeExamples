package application;

public class ext4_group_desc {
	private Object bg_block_bitmap;
	private Object bg_inode_bitmap;
	private Object bg_inode_table;
	private Object bg_free_blocks_count;
	private Object bg_free_inodes_count;
	private Object bg_used_dirs_count;
	private Object bg_flags;
	private Object bg_exclude_bitmap_lo;
	private Object bg_block_bitmap_csum_lo;
	private Object bg_inode_bitmap_csum_lo;
	private Object bg_itable_unused;
	private Object bg_checksum;
	private Object bg_block_bitmap_hi;
	private Object bg_inode_bitmap_hi;
	private Object bg_inode_table_hi;
	private Object bg_free_blocks_count_hi;
	private Object bg_free_inodes_count_hi;
	private Object bg_used_dirs_count_hi;
	private Object bg_itable_unused_hi;
	private Object bg_exclude_bitmap_hi;
	private Object bg_block_bitmap_csum_hi;
	private Object bg_inode_bitmap_csum_hi;
	private Object bg_reserved;
	
	public ext4_group_desc(Object bg_block_bitmap, Object bg_inode_bitmap, Object bg_inode_table, Object bg_free_blocks_count, Object bg_free_inodes_count, Object bg_used_dirs_count, Object bg_flags, Object bg_exclude_bitmap_lo, Object bg_block_bitmap_csum_lo, Object bg_inode_bitmap_csum_lo, Object bg_itable_unused, Object bg_checksum, Object bg_block_bitmap_hi, Object bg_inode_bitmap_hi, Object bg_inode_table_hi, Object bg_free_blocks_count_hi, Object bg_free_inodes_count_hi, Object bg_used_dirs_count_hi, Object bg_itable_unused_hi, Object bg_exclude_bitmap_hi, Object bg_block_bitmap_csum_hi, Object bg_inode_bitmap_csum_hi, Object bg_reserved) {
		setBg_block_bitmap(bg_block_bitmap);
		setBg_inode_bitmap(bg_inode_bitmap);
		setBg_inode_table(bg_inode_table);
		setBg_free_blocks_count(bg_free_blocks_count);
		setBg_free_inodes_count(bg_free_inodes_count);
		setBg_used_dirs_count(bg_used_dirs_count);
		setBg_flags(bg_flags);
		setBg_exclude_bitmap_lo(bg_exclude_bitmap_lo);
		setBg_block_bitmap_csum_lo(bg_block_bitmap_csum_lo);
		setBg_inode_bitmap_csum_lo(bg_inode_bitmap_csum_lo);
		setBg_itable_unused(bg_itable_unused);
		setBg_checksum(bg_checksum);
		setBg_block_bitmap_hi(bg_block_bitmap_hi);
		setBg_inode_bitmap_hi(bg_inode_bitmap_hi);
		setBg_inode_table_hi(bg_inode_table_hi);
		setBg_free_blocks_count_hi(bg_free_blocks_count_hi);
		setBg_free_inodes_count_hi(bg_free_inodes_count_hi);
		setBg_used_dirs_count_hi(bg_used_dirs_count_hi);
		setBg_itable_unused_hi(bg_itable_unused_hi);
		setBg_exclude_bitmap_hi(bg_exclude_bitmap_hi);
		setBg_block_bitmap_csum_hi(bg_block_bitmap_csum_hi);
		setBg_inode_bitmap_csum_hi(bg_inode_bitmap_csum_hi);
		setBg_reserved(bg_reserved);
	}
	public ext4_group_desc() {
	}
	
	public ext4_group_desc ext4fs_group_desc(Object fs, opaque_ext2_group_desc gdp, Object group) {
		ext2_group_desc ext2_group_desc = new ext2_group_desc();
		return (ext4_group_desc)ext2_group_desc.ext2fs_group_desc(fs, gdp, group/*
		 * Return the block bitmap checksum of a group
		 */);
	}
	public Object getBg_block_bitmap() {
		return bg_block_bitmap;
	}
	public void setBg_block_bitmap(Object newBg_block_bitmap) {
		bg_block_bitmap = newBg_block_bitmap;
	}
	public Object getBg_inode_bitmap() {
		return bg_inode_bitmap;
	}
	public void setBg_inode_bitmap(Object newBg_inode_bitmap) {
		bg_inode_bitmap = newBg_inode_bitmap;
	}
	public Object getBg_inode_table() {
		return bg_inode_table;
	}
	public void setBg_inode_table(Object newBg_inode_table) {
		bg_inode_table = newBg_inode_table;
	}
	public Object getBg_free_blocks_count() {
		return bg_free_blocks_count;
	}
	public void setBg_free_blocks_count(Object newBg_free_blocks_count) {
		bg_free_blocks_count = newBg_free_blocks_count;
	}
	public Object getBg_free_inodes_count() {
		return bg_free_inodes_count;
	}
	public void setBg_free_inodes_count(Object newBg_free_inodes_count) {
		bg_free_inodes_count = newBg_free_inodes_count;
	}
	public Object getBg_used_dirs_count() {
		return bg_used_dirs_count;
	}
	public void setBg_used_dirs_count(Object newBg_used_dirs_count) {
		bg_used_dirs_count = newBg_used_dirs_count;
	}
	public Object getBg_flags() {
		return bg_flags;
	}
	public void setBg_flags(Object newBg_flags) {
		bg_flags = newBg_flags;
	}
	public Object getBg_exclude_bitmap_lo() {
		return bg_exclude_bitmap_lo;
	}
	public void setBg_exclude_bitmap_lo(Object newBg_exclude_bitmap_lo) {
		bg_exclude_bitmap_lo = newBg_exclude_bitmap_lo;
	}
	public Object getBg_block_bitmap_csum_lo() {
		return bg_block_bitmap_csum_lo;
	}
	public void setBg_block_bitmap_csum_lo(Object newBg_block_bitmap_csum_lo) {
		bg_block_bitmap_csum_lo = newBg_block_bitmap_csum_lo;
	}
	public Object getBg_inode_bitmap_csum_lo() {
		return bg_inode_bitmap_csum_lo;
	}
	public void setBg_inode_bitmap_csum_lo(Object newBg_inode_bitmap_csum_lo) {
		bg_inode_bitmap_csum_lo = newBg_inode_bitmap_csum_lo;
	}
	public Object getBg_itable_unused() {
		return bg_itable_unused;
	}
	public void setBg_itable_unused(Object newBg_itable_unused) {
		bg_itable_unused = newBg_itable_unused;
	}
	public Object getBg_checksum() {
		return bg_checksum;
	}
	public void setBg_checksum(Object newBg_checksum) {
		bg_checksum = newBg_checksum;
	}
	public Object getBg_block_bitmap_hi() {
		return bg_block_bitmap_hi;
	}
	public void setBg_block_bitmap_hi(Object newBg_block_bitmap_hi) {
		bg_block_bitmap_hi = newBg_block_bitmap_hi;
	}
	public Object getBg_inode_bitmap_hi() {
		return bg_inode_bitmap_hi;
	}
	public void setBg_inode_bitmap_hi(Object newBg_inode_bitmap_hi) {
		bg_inode_bitmap_hi = newBg_inode_bitmap_hi;
	}
	public Object getBg_inode_table_hi() {
		return bg_inode_table_hi;
	}
	public void setBg_inode_table_hi(Object newBg_inode_table_hi) {
		bg_inode_table_hi = newBg_inode_table_hi;
	}
	public Object getBg_free_blocks_count_hi() {
		return bg_free_blocks_count_hi;
	}
	public void setBg_free_blocks_count_hi(Object newBg_free_blocks_count_hi) {
		bg_free_blocks_count_hi = newBg_free_blocks_count_hi;
	}
	public Object getBg_free_inodes_count_hi() {
		return bg_free_inodes_count_hi;
	}
	public void setBg_free_inodes_count_hi(Object newBg_free_inodes_count_hi) {
		bg_free_inodes_count_hi = newBg_free_inodes_count_hi;
	}
	public Object getBg_used_dirs_count_hi() {
		return bg_used_dirs_count_hi;
	}
	public void setBg_used_dirs_count_hi(Object newBg_used_dirs_count_hi) {
		bg_used_dirs_count_hi = newBg_used_dirs_count_hi;
	}
	public Object getBg_itable_unused_hi() {
		return bg_itable_unused_hi;
	}
	public void setBg_itable_unused_hi(Object newBg_itable_unused_hi) {
		bg_itable_unused_hi = newBg_itable_unused_hi;
	}
	public Object getBg_exclude_bitmap_hi() {
		return bg_exclude_bitmap_hi;
	}
	public void setBg_exclude_bitmap_hi(Object newBg_exclude_bitmap_hi) {
		bg_exclude_bitmap_hi = newBg_exclude_bitmap_hi;
	}
	public Object getBg_block_bitmap_csum_hi() {
		return bg_block_bitmap_csum_hi;
	}
	public void setBg_block_bitmap_csum_hi(Object newBg_block_bitmap_csum_hi) {
		bg_block_bitmap_csum_hi = newBg_block_bitmap_csum_hi;
	}
	public Object getBg_inode_bitmap_csum_hi() {
		return bg_inode_bitmap_csum_hi;
	}
	public void setBg_inode_bitmap_csum_hi(Object newBg_inode_bitmap_csum_hi) {
		bg_inode_bitmap_csum_hi = newBg_inode_bitmap_csum_hi;
	}
	public Object getBg_reserved() {
		return bg_reserved;
	}
	public void setBg_reserved(Object newBg_reserved) {
		bg_reserved = newBg_reserved;
	}
}
