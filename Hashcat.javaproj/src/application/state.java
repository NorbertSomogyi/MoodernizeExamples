package application;

/*
 * puff.c
 * Copyright (C) 2002-2013 Mark Adler
 * For conditions of distribution and use, see copyright notice in puff.h
 * version 2.3, 21 Jan 2013
 *
 * puff.c is a simple inflate written to be an unambiguous way to specify the
 * deflate format.  It is not written for speed but rather simplicity.  As a
 * side benefit, this code might actually be useful when small code is more
 * important than speed, such as bootstrap applications.  For typical deflate
 * data, zlib's inflate() is about four times as fast as puff().  zlib's
 * inflate compiles to around 20K on my machine, whereas puff.c compiles to
 * around 4K on my machine (a PowerPC using GNU cc).  If the faster decode()
 * function here is used, then puff() is only twice as slow as zlib's
 * inflate().
 *
 * All dynamically allocated memory comes from the stack.  The stack required
 * is less than 2K bytes.  This code is compatible with 16-bit int's and
 * assumes that long's are at least 32 bits.  puff.c uses the short data type,
 * assumed to be 16 bits, for arrays in order to conserve memory.  The code
 * works whether integers are stored big endian or little endian.
 *
 * In the comments below are "Format notes" that describe the inflate process
 * and document some of the less obvious aspects of the format.  This source
 * code is meant to supplement RFC 1951, which formally describes the deflate
 * format:
 *
 *    http://www.zlib.org/rfc-deflate.html
 */
/*
 * Change history:
 *
 * 1.0  10 Feb 2002     - First version
 * 1.1  17 Feb 2002     - Clarifications of some comments and notes
 *                      - Update puff() dest and source pointers on negative
 *                        errors to facilitate debugging deflators
 *                      - Remove longest from struct huffman -- not needed
 *                      - Simplify offs[] index in construct()
 *                      - Add input size and checking, using longjmp() to
 *                        maintain easy readability
 *                      - Use short data type for large arrays
 *                      - Use pointers instead of long to specify source and
 *                        destination sizes to avoid arbitrary 4 GB limits
 * 1.2  17 Mar 2002     - Add faster version of decode(), doubles speed (!),
 *                        but leave simple version for readabilty
 *                      - Make sure invalid distances detected if pointers
 *                        are 16 bits
 *                      - Fix fixed codes table error
 *                      - Provide a scanning mode for determining size of
 *                        uncompressed data
 * 1.3  20 Mar 2002     - Go back to lengths for puff() parameters [Gailly]
 *                      - Add a puff.h file for the interface
 *                      - Add braces in puff() for else do [Gailly]
 *                      - Use indexes instead of pointers for readability
 * 1.4  31 Mar 2002     - Simplify construct() code set check
 *                      - Fix some comments
 *                      - Add FIXLCODES #define
 * 1.5   6 Apr 2002     - Minor comment fixes
 * 1.6   7 Aug 2002     - Minor format changes
 * 1.7   3 Mar 2003     - Added test code for distribution
 *                      - Added zlib-like license
 * 1.8   9 Jan 2004     - Added some comments on no distance codes case
 * 1.9  21 Feb 2008     - Fix bug on 16-bit integer architectures [Pohland]
 *                      - Catch missing end-of-block symbol error
 * 2.0  25 Jul 2008     - Add #define to permit distance too far back
 *                      - Add option in TEST code for puff to write the data
 *                      - Add option in TEST code to skip input bytes
 *                      - Allow TEST code to read from piped stdin
 * 2.1   4 Apr 2010     - Avoid variable initialization for happier compilers
 *                      - Avoid unsigned comparisons for even happier compilers
 * 2.2  25 Apr 2010     - Fix bug in variable initializations [Oberhumer]
 *                      - Add const where appropriate [Oberhumer]
 *                      - Split if's and ?'s for coverage testing
 *                      - Break out test code to separate file
 *                      - Move NIL to puff.h
 *                      - Allow incomplete code only if single code length is 1
 *                      - Add full code coverage test to Makefile
 * 2.3  21 Jan 2013     - Check for invalid code length codes in dynamic blocks
 */
/* for setjmp(), longjmp(), and jmp_buf */
/* prototype for puff() */
/* for local function definitions */
/*
 * Maximums for allocations and loops.  It is not useful to change these --
 * they are fixed by the deflate format.
 */
/* maximum bits in a code */
/* maximum number of literal/length codes */
/* maximum number of distance codes */
/* maximum codes lengths to read */
/* number of fixed literal/length codes */
/* input and output state */
public class state {
	private byte[] out;
	private long outlen;
	private long outcnt;
	private Object[] in;
	private long inlen;
	private long incnt;
	private int bitbuf;
	private int bitcnt;
	private Object env;
	
	public state(byte[] out, long outlen, long outcnt, Object[] in, long inlen, long incnt, int bitbuf, int bitcnt, Object env) {
		setOut(out);
		setOutlen(outlen);
		setOutcnt(outcnt);
		setIn(in);
		setInlen(inlen);
		setIncnt(incnt);
		setBitbuf(bitbuf);
		setBitcnt(bitcnt);
		setEnv(env);
	}
	public state() {
	}
	
	public int bits(int need) {
		/* bit accumulator (can use up to 20 bits) */long val;
		int generatedBitbuf = this.getBitbuf();
		val = generatedBitbuf;
		int generatedBitcnt = this.getBitcnt();
		long generatedIncnt = this.getIncnt();
		long generatedInlen = this.getInlen();
		Object generatedEnv = this.getEnv();
		Object[] generatedIn = this.getIn();
		while (generatedBitcnt < need) {
			if (generatedIncnt == generatedInlen) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(generatedEnv, /* out of input */1);
			} 
			val |=  (long)(generatedIn[generatedIncnt++]) << generatedBitcnt;
			generatedBitcnt += 8;
		}
		this.setBitbuf((int)(val >> /* drop need bits and update buffer, always zero to seven bits left */need));
		generatedBitcnt -= need;
		return (int)(val & ((-1024 << need) - /* return need bits, zeroing the bits above that */1/*
		 * Process a stored block.
		 *
		 * Format notes:
		 *
		 * - After the two-bit stored block type (00), the stored block length and
		 *   stored bytes are byte-aligned for fast copying.  Therefore any leftover
		 *   bits in the byte that has the last bit of the type, as many as seven, are
		 *   discarded.  The value of the discarded bits are not defined and should not
		 *   be checked against any expectation.
		 *
		 * - The second inverted copy of the stored block length does not have to be
		 *   checked, but it's probably a good idea to do so anyway.
		 *
		 * - A stored block can have zero length.  This is sometimes used to byte-align
		 *   subsets of the compressed data for random access or partial recovery.
		 */));
		/* bit accumulator */int val;
		int generatedBitbuf = this.getBitbuf();
		val = generatedBitbuf;
		int generatedBitcnt = this.getBitcnt();
		Object generatedLeft = this.getLeft();
		Object generatedInhow = this.getInhow();
		Object[] generatedIn = this.getIn();
		Object generatedEnv = this.getEnv();
		while (generatedBitcnt < need) {
			if (generatedLeft == 0) {
				this.setLeft(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedInhow, (generatedIn)));
				if (generatedLeft == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/longjmp(generatedEnv, /* out of input */1);
				} 
			} 
			val |=  (int)((generatedIn)++) << generatedBitcnt;
			generatedLeft--;
			generatedBitcnt += 8;
		}
		this.setBitbuf(val >> /* drop need bits and update buffer, always zero to seven bits left */need);
		generatedBitcnt -= need;
		return val & ((1 << need) - /* return need bits, zeroing the bits above that */1/*
		 * Huffman code decoding tables.  count[1..MAXBITS] is the number of symbols of
		 * each length, which for a canonical code are stepped through in order.
		 * symbol[] are the symbol values in canonical order, where the number of
		 * entries is the sum of the counts in count[].  The decoding process can be
		 * seen in the function decode() below.
		 */);
	}
	public int stored() {
		/* length of stored block */int len;
		this.setBitbuf(/* discard leftover bits from current byte (assumes s->bitcnt < 8) */0);
		this.setBitcnt(0);
		long generatedIncnt = this.getIncnt();
		long generatedInlen = this.getInlen();
		if (generatedIncnt + 4 > generatedInlen) {
			return /* not enough input */2;
		} 
		Object[] generatedIn = this.getIn();
		len = generatedIn[generatedIncnt++];
		len |=  generatedIn[generatedIncnt++] << 8;
		if (generatedIn[generatedIncnt++] != (~len & -1024) || generatedIn[generatedIncnt++] != ((~len >> 8) & -1024)) {
			return -/* didn't match complement! */2;
		} 
		if (generatedIncnt + len > generatedInlen) {
			return /* not enough input */2;
		} 
		byte[] generatedOut = this.getOut();
		long generatedOutcnt = this.getOutcnt();
		long generatedOutlen = this.getOutlen();
		if (generatedOut != ((byte)0)) {
			if (generatedOutcnt + len > generatedOutlen) {
				return /* not enough output space */1;
			} 
			while (len--) {
				generatedOut[generatedOutcnt++] = generatedIn[generatedIncnt++];
			}
		} else {
				generatedOutcnt += /* just scanning */len;
				generatedIncnt += len;
		} 
		return /* done with a valid stored block */0/*
		 * Huffman code decoding tables.  count[1..MAXBITS] is the number of symbols of
		 * each length, which for a canonical code are stepped through in order.
		 * symbol[] are the symbol values in canonical order, where the number of
		 * entries is the sum of the counts in count[].  The decoding process can be
		 * seen in the function decode() below.
		 */;
	}
	public int codes(Object lencode, Object distcode) {
		/* decoded symbol */int symbol;
		/* length for copy */int len;
		/* distance for copy */int dist;
		int[] lens = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258};
		int[] lext = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
		int[] dists = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
		int[] dext = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
		byte[] generatedOut = this.getOut();
		long generatedOutcnt = this.getOutcnt();
		long generatedOutlen = this.getOutlen();
		/* decode literals and length/distance pairs */do {
			symbol = /*Error: Function owner not recognized*/decode(s, lencode);
			if (symbol < 0) {
				return /* invalid symbol */symbol;
			} 
			if (symbol < /* literal: symbol is the byte */256) {
				if (generatedOut != ((byte)/* write out the literal */0)) {
					if (generatedOutcnt == generatedOutlen) {
						return 1;
					} 
					generatedOut[generatedOutcnt] = symbol;
				} 
				generatedOutcnt++;
			}  else if (symbol > /* length */256) {
				symbol -= /* get and compute length */257;
				if (symbol >= 29) {
					return -/* invalid fixed code */10;
				} 
				len = lens[symbol] + s.bits(lext[symbol]);
				symbol = /*Error: Function owner not recognized*/decode(s, /* get and check distance */distcode);
				if (symbol < 0) {
					return /* invalid symbol */symbol;
				} 
				dist = dists[symbol] + s.bits(dext[symbol]);
				if (dist > generatedOutcnt) {
					return -/* distance too far back */11;
				} 
				if (generatedOut != ((byte)/* copy length bytes from distance bytes back */0)) {
					if (generatedOutcnt + len > generatedOutlen) {
						return 1;
					} 
					while (len--) {
						generatedOut[generatedOutcnt] = generatedOut[generatedOutcnt - dist];
						generatedOutcnt++;
					}
				} else {
						generatedOutcnt += len;
				} 
			} 
		} while (symbol != /* end of block symbol */256);
		return /* done with a valid fixed or dynamic block */0/*
		 * Process a fixed codes block.
		 *
		 * Format notes:
		 *
		 * - This block type can be useful for compressing small amounts of data for
		 *   which the size of the code descriptions in a dynamic block exceeds the
		 *   benefit of custom codes for that block.  For fixed codes, no bits are
		 *   spent on code descriptions.  Instead the code lengths for literal/length
		 *   codes and distance codes are fixed.  The specific lengths for each symbol
		 *   can be seen in the "for" loops below.
		 *
		 * - The literal/length code is complete, but has two symbols that are invalid
		 *   and should result in an error if received.  This cannot be implemented
		 *   simply as an incomplete code since those two symbols are in the "middle"
		 *   of the code.  They are eight bits long and the longest literal/length\
		 *   code is nine bits.  Therefore the code must be constructed with those
		 *   symbols, and the invalid symbols must be detected after decoding.
		 *
		 * - The fixed distance codes also have two invalid symbols that should result
		 *   in an error if received.  Since all of the distance codes are the same
		 *   length, this can be implemented as an incomplete code.  Then the invalid
		 *   codes are detected while decoding.
		 */;
	}
	public int fixed() {
		int virgin = 1;
		int[] lencnt = new int[15 + 1];
		int[] lensym = new int[288];
		int[] distcnt = new int[15 + 1];
		int[] distsym = new int[30];
		huffman lencode = new huffman();
		huffman distcode = new huffman();
		if (/* build fixed huffman tables if first call (may not be thread safe) */virgin) {
			int symbol;
			int[] lengths = new int[288];
			lencode.setCount(/* construct lencode and distcode */lencnt);
			lencode.setSymbol(lensym);
			distcode.setCount(distcnt);
			distcode.setSymbol(distsym);
			for (symbol = 0; symbol < 144; /* literal/length table */symbol++) {
				lengths[symbol] = 8;
			}
			for (; symbol < 256; symbol++) {
				lengths[symbol] = 9;
			}
			for (; symbol < 280; symbol++) {
				lengths[symbol] = 7;
			}
			for (; symbol < 288; symbol++) {
				lengths[symbol] = 8;
			}
			lencode.construct(lengths, 288);
			for (symbol = 0; symbol < 30; /* distance table */symbol++) {
				lengths[symbol] = 5;
			}
			distcode.construct(lengths, 30);
			virgin = /* do this just once */0;
		} 
		return s.codes(lencode, /* decode data until end-of-block code */distcode/*
		 * Process a dynamic codes block.
		 *
		 * Format notes:
		 *
		 * - A dynamic block starts with a description of the literal/length and
		 *   distance codes for that block.  New dynamic blocks allow the compressor to
		 *   rapidly adapt to changing data with new codes optimized for that data.
		 *
		 * - The codes used by the deflate format are "canonical", which means that
		 *   the actual bits of the codes are generated in an unambiguous way simply
		 *   from the number of bits in each code.  Therefore the code descriptions
		 *   are simply a list of code lengths for each symbol.
		 *
		 * - The code lengths are stored in order for the symbols, so lengths are
		 *   provided for each of the literal/length symbols, and for each of the
		 *   distance symbols.
		 *
		 * - If a symbol is not used in the block, this is represented by a zero as
		 *   as the code length.  This does not mean a zero-length code, but rather
		 *   that no code should be created for this symbol.  There is no way in the
		 *   deflate format to represent a zero-length code.
		 *
		 * - The maximum number of bits in a code is 15, so the possible lengths for
		 *   any code are 1..15.
		 *
		 * - The fact that a length of zero is not permitted for a code has an
		 *   interesting consequence.  Normally if only one symbol is used for a given
		 *   code, then in fact that code could be represented with zero bits.  However
		 *   in deflate, that code has to be at least one bit.  So for example, if
		 *   only a single distance base symbol appears in a block, then it will be
		 *   represented by a single code of length one, in particular one 0 bit.  This
		 *   is an incomplete code, since if a 1 bit is received, it has no meaning,
		 *   and should result in an error.  So incomplete distance codes of one symbol
		 *   should be permitted, and the receipt of invalid codes should be handled.
		 *
		 * - It is also possible to have a single literal/length code, but that code
		 *   must be the end-of-block code, since every dynamic block has one.  This
		 *   is not the most efficient way to create an empty block (an empty fixed
		 *   block is fewer bits), but it is allowed by the format.  So incomplete
		 *   literal/length codes of one symbol should also be permitted.
		 *
		 * - If there are only literal codes and no lengths, then there are no distance
		 *   codes.  This is represented by one distance code with zero bits.
		 *
		 * - The list of up to 286 length/literal lengths and up to 30 distance lengths
		 *   are themselves compressed using Huffman codes and run-length encoding.  In
		 *   the list of code lengths, a 0 symbol means no code, a 1..15 symbol means
		 *   that length, and the symbols 16, 17, and 18 are run-length instructions.
		 *   Each of 16, 17, and 18 are follwed by extra bits to define the length of
		 *   the run.  16 copies the last length 3 to 6 times.  17 represents 3 to 10
		 *   zero lengths, and 18 represents 11 to 138 zero lengths.  Unused symbols
		 *   are common, hence the special coding for zero lengths.
		 *
		 * - The symbols for 0..18 are Huffman coded, and so that code must be
		 *   described first.  This is simply a sequence of up to 19 three-bit values
		 *   representing no code (0) or the code length for that symbol (1..7).
		 *
		 * - A dynamic block starts with three fixed-size counts from which is computed
		 *   the number of literal/length code lengths, the number of distance code
		 *   lengths, and the number of code length code lengths (ok, you come up with
		 *   a better name!) in the code descriptions.  For the literal/length and
		 *   distance codes, lengths after those provided are considered zero, i.e. no
		 *   code.  The code length code lengths are received in a permuted order (see
		 *   the order[] array below) to make a short code length code length list more
		 *   likely.  As it turns out, very short and very long codes are less likely
		 *   to be seen in a dynamic code description, hence what may appear initially
		 *   to be a peculiar ordering.
		 *
		 * - Given the number of literal/length code lengths (nlen) and distance code
		 *   lengths (ndist), then they are treated as one long list of nlen + ndist
		 *   code lengths.  Therefore run-length coding can and often does cross the
		 *   boundary between the two sets of lengths.
		 *
		 * - So to summarize, the code description at the start of a dynamic block is
		 *   three counts for the number of code lengths for the literal/length codes,
		 *   the distance codes, and the code length codes.  This is followed by the
		 *   code length code lengths, three bits each.  This is used to construct the
		 *   code length code which is used to read the remainder of the lengths.  Then
		 *   the literal/length code lengths and distance lengths are read as a single
		 *   set of lengths using the code length codes.  Codes are constructed from
		 *   the resulting two sets of lengths, and then finally you can start
		 *   decoding actual compressed data in the block.
		 *
		 * - For reference, a "typical" size for the code description in a dynamic
		 *   block is around 80 bytes.
		 */);
	}
	public int dynamic() {
		/* number of lengths in descriptor */int nlen;
		int ndist;
		int ncode;
		/* index of lengths[] */int index;
		/* construct() return value */int err;
		int[] lengths = new int[(286 + /* descriptor code lengths */30)];
		int[] lencnt = new int[15 + 1];
		int[] lensym = new int[/* lencode memory */286];
		int[] distcnt = new int[15 + 1];
		int[] distsym = new int[/* distcode memory */30];
		/* length and distance codes */huffman lencode = new huffman();
		huffman distcode = new huffman();
		int[] order = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
		lencode.setCount(/* construct lencode and distcode */lencnt);
		lencode.setSymbol(lensym);
		distcode.setCount(distcnt);
		distcode.setSymbol(distsym);
		nlen = s.bits(5) + /* get number of lengths in each table, check lengths */257;
		ndist = s.bits(5) + 1;
		ncode = s.bits(4) + 4;
		if (nlen > 286 || ndist > 30) {
			return -/* bad counts */3;
		} 
		for (index = 0; index < ncode; /* read code length code lengths (really), missing lengths are zero */index++) {
			lengths[order[index]] = s.bits(3);
		}
		for (; index < 19; index++) {
			lengths[order[index]] = 0;
		}
		err = lencode.construct(lengths, /* build huffman table for code lengths codes (use lencode temporarily) */19);
		if (err != /* require complete code set here */0) {
			return -4;
		} 
		index = /* read length/literal and distance code length tables */0;
		while (index < nlen + ndist) {
			int symbol;
			int len;
			symbol = /*Error: Function owner not recognized*/decode(s, lencode);
			if (symbol < 0) {
				return /* invalid symbol */symbol;
			} 
			if (symbol < /* length in 0..15 */16) {
				lengths[index++] = symbol;
			} else {
					len = /* repeat instruction *//* assume repeating zeros */0;
					if (symbol == /* repeat last length 3..6 times */16) {
						if (index == 0) {
							return -/* no last length! */5;
						} 
						len = lengths[index - /* last length */1];
						symbol = 3 + s.bits(2);
					}  else if (symbol == /* repeat zero 3..10 times */17) {
						symbol = 3 + s.bits(3);
					} else {
							symbol = 11 + s.bits(/* == 18, repeat zero 11..138 times */7);
					} 
					if (index + symbol > nlen + ndist) {
						return -/* too many lengths! */6;
					} 
					while (/* repeat last or zero symbol times */symbol--) {
						lengths[index++] = len;
					}
			} 
		}
		if (lengths[256] == /* check for end-of-block code -- there better be one! */0) {
			return -9;
		} 
		err = lencode.construct(lengths, /* build huffman table for literal/length codes */nlen);
		int[] generatedCount = lencode.getCount();
		if (err && (err < 0 || nlen != generatedCount[0] + generatedCount[1])) {
			return -/* incomplete code ok only for single length 1 code */7;
		} 
		err = distcode.construct(lengths + nlen, /* build huffman table for distance codes */ndist);
		if (err && (err < 0 || ndist != generatedCount[0] + generatedCount[1])) {
			return -/* incomplete code ok only for single length 1 code */8;
		} 
		return s.codes(lencode, /* decode data until end-of-block code */distcode/*
		 * Inflate source to dest.  On return, destlen and sourcelen are updated to the
		 * size of the uncompressed data and the size of the deflate data respectively.
		 * On success, the return value of puff() is zero.  If there is an error in the
		 * source data, i.e. it is not in the deflate format, then a negative value is
		 * returned.  If there is not enough input available or there is not enough
		 * output space, then a positive error is returned.  In that case, destlen and
		 * sourcelen are not updated to facilitate retrying from the beginning with the
		 * provision of more input data or more output space.  In the case of invalid
		 * inflate data (a negative error), the dest and source pointers are updated to
		 * facilitate the debugging of deflators.
		 *
		 * puff() also has a mode to determine the size of the uncompressed output with
		 * no output written.  For this dest must be (unsigned char *)0.  In this case,
		 * the input value of *destlen is ignored, and on return *destlen is set to the
		 * size of the uncompressed output.
		 *
		 * The return codes are:
		 *
		 *   2:  available inflate data did not terminate
		 *   1:  output space exhausted before completing inflate
		 *   0:  successful inflate
		 *  -1:  invalid block type (type == 3)
		 *  -2:  stored block length did not match one's complement
		 *  -3:  dynamic block code description: too many length or distance codes
		 *  -4:  dynamic block code description: code lengths codes incomplete
		 *  -5:  dynamic block code description: repeat lengths with no first length
		 *  -6:  dynamic block code description: repeat more than specified lengths
		 *  -7:  dynamic block code description: invalid literal/length code lengths
		 *  -8:  dynamic block code description: invalid distance code lengths
		 *  -9:  dynamic block code description: missing end-of-block code
		 * -10:  invalid literal/length or distance code in fixed or dynamic block
		 * -11:  distance is too far back in fixed or dynamic block
		 *
		 * Format notes:
		 *
		 * - Three bits are read for each block to determine the kind of block and
		 *   whether or not it is the last block.  Then the block is decoded and the
		 *   process repeated if it was not the last block.
		 *
		 * - The leftover bits in the last byte of the deflate data after the last
		 *   block (if it was a fixed or dynamic block) are undefined and have no
		 *   expected values to check.
		 */);
	}
	public int decomp() {
		/* true if literals are coded */int lit;
		/* log2(dictionary size) - 6 */int dict;
		/* decoded symbol, extra bits for distance */int symbol;
		/* length for copy */int len;
		/* distance for copy */int dist;
		/* copy counter */int copy;
		/* copy pointers */byte from;
		byte to;
		int virgin = /* build tables once */1;
		int[] litcnt = new int[13 + 1];
		int[] litsym = new int[/* litcode memory */256];
		int[] lencnt = new int[13 + 1];
		int[] lensym = new int[/* lencode memory */16];
		int[] distcnt = new int[13 + 1];
		int[] distsym = new int[/* distcode memory */64];
		huffman litcode = new huffman(litcnt, /* length code */litsym);
		huffman lencode = new huffman(lencnt, /* length code */lensym);
		huffman distcode = new huffman(distcnt, /* distance code */distsym/* bit lengths of literal codes */);
		byte[] litlen = new byte[]{11, 124, 8, 7, 28, 7, 188, 13, 76, 4, 10, 8, 12, 10, 12, 10, 8, 23, 8, 9, 7, 6, 7, 8, 7, 6, 55, 8, 23, 24, 12, 11, 7, 9, 11, 12, 6, 7, 22, 5, 7, 24, 6, 11, 9, 6, 7, 22, 7, 11, 38, 7, 9, 8, 25, 11, 8, 11, 9, 12, 8, 12, 5, 38, 5, 38, 5, 11, 7, 5, 6, 21, 6, 10, 53, 8, 7, 24, 10, 27, 44, 253, 253, 253, 252, 252, 252, 13, 12, 45, 12, 45, 12, 61, 12, 45, 44, 173};
		byte[] lenlen = new byte[]{2, 35, 36, 53, 38, /* bit lengths of length codes 0..15 */23};
		byte[] distlen = new byte[]{2, 20, 53, 230, 247, 151, /* bit lengths of distance codes 0..63 */248};
		int[] base = new int[]{3, 2, 4, 5, 6, 7, 8, 9, 10, 12, 16, 24, 40, 72, 136, 264};
		byte[] extra = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8};
		if (/* set up decoding tables (once--might not be thread-safe) */virgin) {
			litcode.construct(litlen, /*Error: sizeof expression not supported yet*/);
			lencode.construct(lenlen, /*Error: sizeof expression not supported yet*/);
			distcode.construct(distlen, /*Error: sizeof expression not supported yet*/);
			virgin = 0;
		} 
		lit = s.bits(/* read header */8);
		if (lit > 1) {
			return -1;
		} 
		dict = s.bits(8);
		if (dict < 4 || dict > 6) {
			return -2;
		} 
		Object generatedFirst = this.getFirst();
		Object generatedNext = this.getNext();
		byte[] generatedOut = this.getOut();
		Object generatedOuthow = this.getOuthow();
		/* decode literals and length/distance pairs */do {
			if (s.bits(1)) {
				symbol = /*Error: Function owner not recognized*/decode(s, /* get length */lencode);
				len = base[symbol] + s.bits(extra[symbol]);
				if (len == /* end code */519) {
					break;
				} 
				symbol = len == 2 ? 2 : /* get distance */dict;
				dist = /*Error: Function owner not recognized*/decode(s, distcode) << symbol;
				dist += s.bits(symbol);
				dist++;
				if (generatedFirst && dist > generatedNext) {
					return -/* distance too far back */3;
				} 
				do {
					to = generatedOut + generatedNext;
					from = to - dist;
					copy = 4096;
					if (generatedNext < dist) {
						from += copy;
						copy = dist;
					} 
					copy -= generatedNext;
					if (copy > len) {
						copy = len;
					} 
					len -= copy;
					generatedNext += copy;
					do {
						to++ = from++;
					} while (--copy);
					if (generatedNext == 4096) {
						if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOuthow, generatedOut, generatedNext)) {
							return 1;
						} 
						this.setNext(0);
						this.setFirst(0);
					} 
				} while (len != 0);
			} else {
					symbol = lit ? /*Error: Function owner not recognized*/decode(s, litcode) : s.bits(/* get literal and write it */8);
					generatedOut[generatedNext++] = symbol;
					if (generatedNext == 4096) {
						if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOuthow, generatedOut, generatedNext)) {
							return 1;
						} 
						this.setNext(0);
						this.setFirst(0);
					} 
			} 
		} while (1);
		return 0;
	}
	public byte[] getOut() {
		return out;
	}
	public void setOut(byte[] newOut) {
		out = newOut;
	}
	public long getOutlen() {
		return outlen;
	}
	public void setOutlen(long newOutlen) {
		outlen = newOutlen;
	}
	public long getOutcnt() {
		return outcnt;
	}
	public void setOutcnt(long newOutcnt) {
		outcnt = newOutcnt;
	}
	public Object[] getIn() {
		return in;
	}
	public void setIn(Object[] newIn) {
		in = newIn;
	}
	public long getInlen() {
		return inlen;
	}
	public void setInlen(long newInlen) {
		inlen = newInlen;
	}
	public long getIncnt() {
		return incnt;
	}
	public void setIncnt(long newIncnt) {
		incnt = newIncnt;
	}
	public int getBitbuf() {
		return bitbuf;
	}
	public void setBitbuf(int newBitbuf) {
		bitbuf = newBitbuf;
	}
	public int getBitcnt() {
		return bitcnt;
	}
	public void setBitcnt(int newBitcnt) {
		bitcnt = newBitcnt;
	}
	public Object getEnv() {
		return env;
	}
	public void setEnv(Object newEnv) {
		env = newEnv;
	}
}
/* output state */
