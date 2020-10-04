package application;

/* vi: set sw=4 ts=4: */
/* Small bzip2 deflate implementation, by Rob Landley (rob@landley.net).

   Based on bzip2 decompression code by Julian R Seward (jseward@acm.org),
   which also acknowledges contributions by Mike Burrows, David Wheeler,
   Peter Fenwick, Alistair Moffat, Radford Neal, Ian H. Witten,
   Robert Sedgewick, and Jon L. Bentley.

   Licensed under GPLv2 or later, see file LICENSE in this source tree.
*/
/*
	Size and speed optimizations by Manuel Novoa III  (mjn3@codepoet.org).

	More efficient reading of Huffman codes, a streamlined read_bunzip()
	function, and various other tweaks.  In (limited) tests, approximately
	20% faster than bzcat on x86 and about 10% faster on arm.

	Note that about 2/3 of the time is spent in read_bunzip() reversing
	the Burrows-Wheeler transformation.  Much of that time is delay
	resulting from cache misses.

	(2010 update by vda: profiled "bzcat <84mbyte.bz2 >/dev/null"
	on x86-64 CPU with L2 > 1M: get_next_block is hotter than read_bunzip:
	%time seconds   calls function
	71.01   12.69     444 get_next_block
	28.65    5.12   93065 read_bunzip
	00.22    0.04 7736490 get_bits
	00.11    0.02      47 dealloc_bunzip
	00.00    0.00   93018 full_write
	...)


	I would ask that anyone benefiting from this work, especially those
	using it in commercial products, consider making a donation to my local
	non-profit hospice organization (www.hospiceacadiana.com) in the name of
	the woman I loved, Toni W. Hagan, who passed away Feb. 12, 2003.

	Manuel
 */
/* Constants for Huffman coding */
/* 64 would have been more efficient */
/* Longest Huffman code allowed */
/* 256 literals + RUNA + RUNB */
/* Status return values */
/* Other housekeeping constants */
/* This is what we know about each Huffman coding group */
public class group_data {
	private Object[] limit;
	private Object[] base;
	private Object[] permute;
	private int minLen;
	private int maxLen;
	
	public group_data(Object[] limit, Object[] base, Object[] permute, int minLen, int maxLen) {
		setLimit(limit);
		setBase(base);
		setPermute(permute);
		setMinLen(minLen);
		setMaxLen(maxLen);
	}
	public group_data() {
	}
	
	public Object[] getLimit() {
		return limit;
	}
	public void setLimit(Object[] newLimit) {
		limit = newLimit;
	}
	public Object[] getBase() {
		return base;
	}
	public void setBase(Object[] newBase) {
		base = newBase;
	}
	public Object[] getPermute() {
		return permute;
	}
	public void setPermute(Object[] newPermute) {
		permute = newPermute;
	}
	public int getMinLen() {
		return minLen;
	}
	public void setMinLen(int newMinLen) {
		minLen = newMinLen;
	}
	public int getMaxLen() {
		return maxLen;
	}
	public void setMaxLen(int newMaxLen) {
		maxLen = newMaxLen;
	}
}
