package application;

/* deflate.h -- internal compression state
 * Copyright (C) 1995-2016 Jean-loup Gailly
 * For conditions of distribution and use, see copyright notice in zlib.h
 */
/* WARNING: this file should *not* be used by applications. It is
   part of the implementation of the compression library and is
   subject to change. Applications should only use zlib.h.
 */
/* @(#) $Id$ */
/* define NO_GZIP when compiling if you want to disable gzip header and
   trailer creation by deflate().  NO_GZIP would be used to avoid linking in
   the crc code when it is not needed.  For shared libraries, gzip encoding
   should be left enabled. */
/* ===========================================================================
 * Internal compression state.
 */
/* number of length codes, not counting the special END_BLOCK code */
/* number of literal bytes 0..255 */
/* number of Literal or Length codes, including the END_BLOCK code */
/* number of distance codes */
/* number of codes used to transfer the bit lengths */
/* maximum heap size */
/* All codes must not exceed MAX_BITS bits */
/* size of bit buffer in bi_buf */
/* zlib header -> BUSY_STATE */
/* gzip header -> BUSY_STATE | EXTRA_STATE */
/* gzip extra block -> NAME_STATE */
/* gzip file name -> COMMENT_STATE */
/* gzip comment -> HCRC_STATE */
/* gzip header CRC -> BUSY_STATE */
/* deflate -> FINISH_STATE */
/* stream complete */
/* Stream status */
/* Data structure describing a single value and its code string. */
public class ct_data_s {
	private  fc;
	private  dl;
	
	public ct_data_s( fc,  dl) {
		setFc(fc);
		setDl(dl);
	}
	public ct_data_s() {
	}
	
	public void gen_codes(int max_code, Object bl_count) {
		ush[] next_code = new ush();
		int code = /* running code value */0;
		/* bit index */int bits;
		/* code index */int n;
		/* The distribution counts are first used to generate the code values
		     * without bit reversal.
		     */
		for (bits = 1; bits <= 15; bits++) {
			code = (code + bl_count[bits - 1]) << 1;
			next_code[bits] = (ush)code/* Check that the bit counts in bl_count are consistent. The last code
			     * must be all ones.
			     */;
		}
		;
		;
		for (n = 0; n <= max_code; n++) {
			int len = tree[n].getDl().getLen();
			if (len == 0) {
				continue;
			} 
			tree[n].getFc().setCode((ush)ModernizedCProgram.bi_reverse(next_code[len]++, /* Now reverse the bits */len));
			;
		}
	}
	/* the tree to decorate */
	/* largest code with non zero frequency */
	public  getFc() {
		return fc;
	}
	public void setFc( newFc) {
		fc = newFc;
	}
	public  getDl() {
		return dl;
	}
	public void setDl( newDl) {
		dl = newDl;
	}
}
