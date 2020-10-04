package application;

/*
 * inode.c --- utility routines to read and write inodes
 *
 * Copyright (C) 1993, 1994, 1995, 1996, 1997 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class ext2_struct_inode_scan {
	private Object magic;
	private Object fs;
	private Object current_inode;
	private Object current_block;
	private Object current_group;
	private Object inodes_left;
	private Object blocks_left;
	private Object groups_left;
	private Object inode_buffer_blocks;
	private Byte inode_buffer;
	private int inode_size;
	private Byte ptr;
	private int bytes_left;
	private Byte temp_buffer;
	private Object done_group;
	private Object done_group_data;
	private int bad_block_ptr;
	private int scan_flags;
	private Object[] reserved;
	
	public ext2_struct_inode_scan(Object magic, Object fs, Object current_inode, Object current_block, Object current_group, Object inodes_left, Object blocks_left, Object groups_left, Object inode_buffer_blocks, Byte inode_buffer, int inode_size, Byte ptr, int bytes_left, Byte temp_buffer, Object done_group, Object done_group_data, int bad_block_ptr, int scan_flags, Object[] reserved) {
		setMagic(magic);
		setFs(fs);
		setCurrent_inode(current_inode);
		setCurrent_block(current_block);
		setCurrent_group(current_group);
		setInodes_left(inodes_left);
		setBlocks_left(blocks_left);
		setGroups_left(groups_left);
		setInode_buffer_blocks(inode_buffer_blocks);
		setInode_buffer(inode_buffer);
		setInode_size(inode_size);
		setPtr(ptr);
		setBytes_left(bytes_left);
		setTemp_buffer(temp_buffer);
		setDone_group(done_group);
		setDone_group_data(done_group_data);
		setBad_block_ptr(bad_block_ptr);
		setScan_flags(scan_flags);
		setReserved(reserved);
	}
	public ext2_struct_inode_scan() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public Object getCurrent_inode() {
		return current_inode;
	}
	public void setCurrent_inode(Object newCurrent_inode) {
		current_inode = newCurrent_inode;
	}
	public Object getCurrent_block() {
		return current_block;
	}
	public void setCurrent_block(Object newCurrent_block) {
		current_block = newCurrent_block;
	}
	public Object getCurrent_group() {
		return current_group;
	}
	public void setCurrent_group(Object newCurrent_group) {
		current_group = newCurrent_group;
	}
	public Object getInodes_left() {
		return inodes_left;
	}
	public void setInodes_left(Object newInodes_left) {
		inodes_left = newInodes_left;
	}
	public Object getBlocks_left() {
		return blocks_left;
	}
	public void setBlocks_left(Object newBlocks_left) {
		blocks_left = newBlocks_left;
	}
	public Object getGroups_left() {
		return groups_left;
	}
	public void setGroups_left(Object newGroups_left) {
		groups_left = newGroups_left;
	}
	public Object getInode_buffer_blocks() {
		return inode_buffer_blocks;
	}
	public void setInode_buffer_blocks(Object newInode_buffer_blocks) {
		inode_buffer_blocks = newInode_buffer_blocks;
	}
	public Byte getInode_buffer() {
		return inode_buffer;
	}
	public void setInode_buffer(Byte newInode_buffer) {
		inode_buffer = newInode_buffer;
	}
	public int getInode_size() {
		return inode_size;
	}
	public void setInode_size(int newInode_size) {
		inode_size = newInode_size;
	}
	public Byte getPtr() {
		return ptr;
	}
	public void setPtr(Byte newPtr) {
		ptr = newPtr;
	}
	public int getBytes_left() {
		return bytes_left;
	}
	public void setBytes_left(int newBytes_left) {
		bytes_left = newBytes_left;
	}
	public Byte getTemp_buffer() {
		return temp_buffer;
	}
	public void setTemp_buffer(Byte newTemp_buffer) {
		temp_buffer = newTemp_buffer;
	}
	public Object getDone_group() {
		return done_group;
	}
	public void setDone_group(Object newDone_group) {
		done_group = newDone_group;
	}
	public Object getDone_group_data() {
		return done_group_data;
	}
	public void setDone_group_data(Object newDone_group_data) {
		done_group_data = newDone_group_data;
	}
	public int getBad_block_ptr() {
		return bad_block_ptr;
	}
	public void setBad_block_ptr(int newBad_block_ptr) {
		bad_block_ptr = newBad_block_ptr;
	}
	public int getScan_flags() {
		return scan_flags;
	}
	public void setScan_flags(int newScan_flags) {
		scan_flags = newScan_flags;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
}
