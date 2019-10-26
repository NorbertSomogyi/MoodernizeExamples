package application;

public class ext4_new_group_input {
	private Object group;
	private Object block_bitmap;
	private Object inode_bitmap;
	private Object inode_table;
	private Object blocks_count;
	private Object reserved_blocks;
	private Object unused;
	
	public ext4_new_group_input(Object group, Object block_bitmap, Object inode_bitmap, Object inode_table, Object blocks_count, Object reserved_blocks, Object unused) {
		setGroup(group);
		setBlock_bitmap(block_bitmap);
		setInode_bitmap(inode_bitmap);
		setInode_table(inode_table);
		setBlocks_count(blocks_count);
		setReserved_blocks(reserved_blocks);
		setUnused(unused);
	}
	public ext4_new_group_input() {
	}
	
	public Object getGroup() {
		return group;
	}
	public void setGroup(Object newGroup) {
		group = newGroup;
	}
	public Object getBlock_bitmap() {
		return block_bitmap;
	}
	public void setBlock_bitmap(Object newBlock_bitmap) {
		block_bitmap = newBlock_bitmap;
	}
	public Object getInode_bitmap() {
		return inode_bitmap;
	}
	public void setInode_bitmap(Object newInode_bitmap) {
		inode_bitmap = newInode_bitmap;
	}
	public Object getInode_table() {
		return inode_table;
	}
	public void setInode_table(Object newInode_table) {
		inode_table = newInode_table;
	}
	public Object getBlocks_count() {
		return blocks_count;
	}
	public void setBlocks_count(Object newBlocks_count) {
		blocks_count = newBlocks_count;
	}
	public Object getReserved_blocks() {
		return reserved_blocks;
	}
	public void setReserved_blocks(Object newReserved_blocks) {
		reserved_blocks = newReserved_blocks;
	}
	public Object getUnused() {
		return unused;
	}
	public void setUnused(Object newUnused) {
		unused = newUnused;
	}
}
