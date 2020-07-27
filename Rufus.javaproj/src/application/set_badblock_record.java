package application;

/*
 * bb_inode.c --- routines to update the bad block inode.
 *
 * WARNING: This routine modifies a lot of state in the filesystem; if
 * this routine returns an error, the bad block inode may be in an
 * inconsistent state.
 *
 * Copyright (C) 1994, 1995 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class set_badblock_record {
	private Object bb_iter;
	private int bad_block_count;
	private Object[] ind_blocks;
	private int max_ind_blocks;
	private int ind_blocks_size;
	private int ind_blocks_ptr;
	private Byte block_buf;
	private Object err;
	
	public set_badblock_record(Object bb_iter, int bad_block_count, Object[] ind_blocks, int max_ind_blocks, int ind_blocks_size, int ind_blocks_ptr, Byte block_buf, Object err) {
		setBb_iter(bb_iter);
		setBad_block_count(bad_block_count);
		setInd_blocks(ind_blocks);
		setMax_ind_blocks(max_ind_blocks);
		setInd_blocks_size(ind_blocks_size);
		setInd_blocks_ptr(ind_blocks_ptr);
		setBlock_buf(block_buf);
		setErr(err);
	}
	public set_badblock_record() {
	}
	
	public Object getBb_iter() {
		return bb_iter;
	}
	public void setBb_iter(Object newBb_iter) {
		bb_iter = newBb_iter;
	}
	public int getBad_block_count() {
		return bad_block_count;
	}
	public void setBad_block_count(int newBad_block_count) {
		bad_block_count = newBad_block_count;
	}
	public Object[] getInd_blocks() {
		return ind_blocks;
	}
	public void setInd_blocks(Object[] newInd_blocks) {
		ind_blocks = newInd_blocks;
	}
	public int getMax_ind_blocks() {
		return max_ind_blocks;
	}
	public void setMax_ind_blocks(int newMax_ind_blocks) {
		max_ind_blocks = newMax_ind_blocks;
	}
	public int getInd_blocks_size() {
		return ind_blocks_size;
	}
	public void setInd_blocks_size(int newInd_blocks_size) {
		ind_blocks_size = newInd_blocks_size;
	}
	public int getInd_blocks_ptr() {
		return ind_blocks_ptr;
	}
	public void setInd_blocks_ptr(int newInd_blocks_ptr) {
		ind_blocks_ptr = newInd_blocks_ptr;
	}
	public Byte getBlock_buf() {
		return block_buf;
	}
	public void setBlock_buf(Byte newBlock_buf) {
		block_buf = newBlock_buf;
	}
	public Object getErr() {
		return err;
	}
	public void setErr(Object newErr) {
		err = newErr;
	}
}
