package application;

/*
 * Structure of a blocks group descriptor
 */
public class ext2_group_desc {
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
	
	public ext2_group_desc(Object bg_block_bitmap, Object bg_inode_bitmap, Object bg_inode_table, Object bg_free_blocks_count, Object bg_free_inodes_count, Object bg_used_dirs_count, Object bg_flags, Object bg_exclude_bitmap_lo, Object bg_block_bitmap_csum_lo, Object bg_inode_bitmap_csum_lo, Object bg_itable_unused, Object bg_checksum) {
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
	}
	public ext2_group_desc() {
	}
	
	public ext2_group_desc ext2fs_group_desc(Object fs, opaque_ext2_group_desc gdp, Object group) {
		int desc_size = .EXT2_DESC_SIZE(fs.getSuper()) & ~7;
		return (ext2_group_desc)((byte)gdp + group * desc_size);
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
}
