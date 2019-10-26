package application;

/*
 * blkmap64_ba.c --- Simple bitarray implementation for bitmaps
 *
 * Copyright (C) 2008 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Public
 * License.
 * %End-Header%
 */
/*
 * Private data for bit array implementation of bitmap ops.
 * Currently, this is just a pointer to our big flat hunk of memory,
 * exactly equivalent to the old-skool char * bitmap member.
 */
public class ext2fs_ba_private_struct {
	private Byte bitarray;
	
	public ext2fs_ba_private_struct(Byte bitarray) {
		setBitarray(bitarray);
	}
	public ext2fs_ba_private_struct() {
	}
	
	public Byte getBitarray() {
		return bitarray;
	}
	public void setBitarray(Byte newBitarray) {
		bitarray = newBitarray;
	}
}
