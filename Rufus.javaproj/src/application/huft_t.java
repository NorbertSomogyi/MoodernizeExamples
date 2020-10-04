package application;

/* vi: set sw=4 ts=4: */
/*
 * gunzip implementation for busybox
 *
 * Based on GNU gzip v1.2.4 Copyright (C) 1992-1993 Jean-loup Gailly.
 *
 * Originally adjusted for busybox by Sven Rudolph <sr1@inf.tu-dresden.de>
 * based on gzip sources
 *
 * Adjusted further by Erik Andersen <andersen@codepoet.org> to support
 * files as well as stdin/stdout, and to generally behave itself wrt
 * command line handling.
 *
 * General cleanup to better adhere to the style guide and make use of standard
 * busybox functions by Glenn McGrath
 *
 * read_gz interface + associated hacking by Laurence Anderson
 *
 * Fixed huft_build() so decoding end-of-block code does not grab more bits
 * than necessary (this is required by unzip applet), added inflate_cleanup()
 * to free leaked bytebuffer memory (used in unzip.c), and some minor style
 * guide cleanups by Ed Clark
 *
 * gzip (GNU zip) -- compress files with zip algorithm and 'compress' interface
 * Copyright (C) 1992-1993 Jean-loup Gailly
 * The unzip code was written and put in the public domain by Mark Adler.
 * Portions of the lzw code are derived from the public domain 'compress'
 * written by Spencer Thomas, Joe Orost, James Woods, Jim McKie, Steve Davies,
 * Ken Turkowski, Dave Mack and Peter Jannesen.
 *
 * See the file algorithm.doc for the compression algorithms and file formats.
 *
 * Licensed under GPLv2 or later, see file LICENSE in this source tree.
 */
/* pointer to next level of table */
public class huft_t {
	private byte e;
	private byte b;
	private  v;
	
	public huft_t(byte e, byte b,  v) {
		setE(e);
		setB(b);
		setV(v);
	}
	public huft_t() {
	}
	
	public void huft_free() {
		huft_t q = new huft_t();
		while (/* Go through linked list, freeing from the malloced (t[-1]) address. */p) {
			q = (--p).getV().getT();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(p);
			p = q;
		}
	}
	public int huft_build(Object[] b, Object n, Object s, Object[] d, Object[] e, Integer m) {
		/* counter for codes of length k */int a;
		int[] c = new int[.BMAX + /* bit length count table */1];
		/* length of end-of-block code (value 256) */int eob_len;
		/* i repeats in table every f entries */int f;
		/* maximum code length */int g;
		/* table level */int htl;
		/* counter, current code */int i;
		/* counter */int j;
		/* number of bits in current code */int k;
		/* pointer into c[], b[], or v[] */Integer p;
		/* points to current table */huft_t[] q = new huft_t();
		/* table entry for structure assignment */huft_t r = new huft_t();
		huft_t[][] u = new huft_t();
		int[] v = new int[/* values in order of bit length */.N_MAX];
		int[] ws = new int[.BMAX + /* bits decoded stack */1];
		/* bits decoded */int w;
		int[] x = new int[.BMAX + /* bit offsets, then code stack */1];
		/* pointer into x */Integer xp;
		/* number of dummy codes added */int y;
		/* number of entries in current table */int z;
		eob_len = n > 256 ? b[256] : /* Length of EOB code, if any */.BMAX;
		t = (null);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(c, 0, /*Error: sizeof expression not supported yet*/);
		p = (int)/* cast allows us to reuse p for pointing to b */b;
		i = n;
		do {
			c[/* assume all entries <= BMAX */p]++;
			/* can't combine with above line (Solaris bug) */p++;
		} while (--i);
		if (c[0] == /* null input - all zero length codes */n) {
			m = 0;
			return 2;
		} 
		for (j = 1; (j <= .BMAX) && (c[j] == 0); /* Find minimum and maximum length, bound *m by those */j++) {
			continue;
		}
		k = /* minimum code length */j;
		for (i = .BMAX; (c[i] == 0) && i; i--) {
			continue;
		}
		g = /* maximum code length */i;
		m = (m < j) ? j : ((m > i) ? i : m);
		for (y = 1 << j; j < i; ) {
			y -= c[j];
			if (y < 0) {
				return /* bad input: more codes than bits */2;
			} 
		}
		y -= c[i];
		if (y < 0) {
			return 2;
		} 
		c[i] += y;
		x[1] = j = /* Generate starting offsets into the value table for each length */0;
		p = c + 1;
		xp = x + 2;
		while (--/* note that i == g from above */i) {
			j += p++;
			xp++ = j;
		}
		p = (int)/* Make a table of values in order of bit lengths */b;
		i = 0;
		do {
			j = p++;
			if (j != 0) {
				v[x[j]++] = i;
			} 
		} while (++i < n);
		x[0] = i = /* Generate the Huffman codes and for each, make the table entries *//* first Huffman code is zero */0;
		p = /* grab values in bit order */v;
		htl = -/* no tables yet--level -1 */1;
		w = ws[0] = /* bits decoded */0;
		u[0] = (null);
		q = (null);
		z = /* ditto */0;
		 generatedV = q.getV();
		Object generatedT = generatedV.getT();
		for (; k <= g; /* go through the bit lengths (k already is bits in shortest code) */k++) {
			a = c[k];
			while (a/* here i is the Huffman code of length k bits for value *p */--) {
				while (k > ws[htl + /* make tables up to required level */1]) {
					w = ws[++htl];
					z = g - /* compute minimum size table less than or equal to *m bits */w;
					z = z > m ? m : /* upper limit on table size */z;
					j = k - w;
					f = 1 << j;
					if (f > a + /* try a k-w bit table */1) {
						f -= a + /* too few codes for k-w bit table *//* deduct codes from patterns left */1;
						xp = c + k;
						while (++j < /* try smaller tables up to z bits */z) {
							f <<=  1;
							if (f <= ++xp) {
								break;
							} 
							f -= /* else deduct codes from patterns */xp;
						}
					} 
					j = ((w + j) > (int)eob_len && w < (int)eob_len) ? eob_len - w : /* make EOB code end at table */j;
					z = 1 << /* table entries for j-bit table */j;
					ws[htl + 1] = w + /* set bits decoded in stack */j;
					q = /*Error: Function owner not recognized*/calloc((z + 1) * /*Error: Unsupported expression*/, /* allocate and link in new table */1);
					t = q + /* link to list for huft_free() */1;
					t = (generatedT);
					u[htl] = ++/* table starts after link */q;
					if (/* connect to last table, if there is one */htl) {
						x[htl] = /* save pattern for backing up */i;
						r.setB((byte)(w - ws[htl - /* bits to dump before this table */1]));
						r.setE((byte)(16 + /* bits in this table */j));
						generatedV.setT(/* pointer to this table */q);
						j = (i & ((1 << w) - 1)) >> ws[htl - 1];
						u[htl - 1][j] = /* connect to last table */r;
					} 
				}
				r.setB((byte)(k - /* set up table entry in r */w));
				if (p >= v + n) {
					r.setE(/* out of values--invalid code */99);
				}  else if (p < s) {
					r.setE((byte)(p < 256 ? 16 : /* 256 is EOB code */15));
					generatedV.setN((int)(/* simple code is just the value */p++));
				} else {
						r.setE((byte)e[p - /* non-simple--look up in lists */s]);
						generatedV.setN(d[p++ - s]);
				} 
				f = 1 << (k - /* fill code-like entries with r */w);
				for (j = i >> w; j < z; j += f) {
					q[j] = r;
				}
				for (j = 1 << (k - 1); i & j; j >>=  /* backwards increment the k-bit code i */1) {
					i ^=  j;
				}
				i ^=  j;
				while ((i & ((1 << w) - 1)) != x[/* backup over finished tables */htl]) {
					w = ws[--htl];
				}
			}
		}
		m = ws[/* return actual size of base table */1];
		return y != 0 && g != /* Return 1 if we were given an incomplete table */1/*
		 * inflate (decompress) the codes in a deflated (compressed) block.
		 * Return an error code or zero if it all goes ok.
		 *
		 * tl, td: literal/length and distance decoder tables
		 * bl, bd: number of bits decoded by tl[] and td[]
		 */;
	}
	public byte getE() {
		return e;
	}
	public void setE(byte newE) {
		e = newE;
	}
	public byte getB() {
		return b;
	}
	public void setB(byte newB) {
		b = newB;
	}
	public  getV() {
		return v;
	}
	public void setV( newV) {
		v = newV;
	}
}
