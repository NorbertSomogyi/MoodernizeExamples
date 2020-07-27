package application;

public class huffman {
	private int[] count;
	private int[] symbol;
	
	public huffman(int[] count, int[] symbol) {
		setCount(count);
		setSymbol(symbol);
	}
	public huffman() {
	}
	
	public int construct(Object[] length, int n) {
		/* current symbol when stepping through length[] */int symbol;
		/* current length when stepping through h->count[] */int len;
		/* number of possible codes left of current length */int left;
		int[] offs = new int[15 + /* offsets in symbol table for each length */1];
		int[] generatedCount = this.getCount();
		for (len = 0; len <= 15; /* count number of codes of each length */len++) {
			generatedCount[len] = 0;
		}
		for (symbol = 0; symbol < n; symbol++) {
			(generatedCount[length[/* assumes lengths are within bounds */symbol]])++;
		}
		if (generatedCount[0] == /* no codes! */n) {
			return /* complete, but decode() will fail */0;
		} 
		left = /* check for an over-subscribed or incomplete set of lengths *//* one possible code of zero length */1;
		for (len = 1; len <= 15; len++) {
			left <<=  /* one more bit, double codes left */1;
			left -= generatedCount[/* deduct count from possible codes */len];
			if (left < 0) {
				return /* over-subscribed--return negative */left/* left > 0 means incomplete */;
			} 
		}
		offs[1] = /* generate offsets into symbol table for each length for sorting */0;
		for (len = 1; len < 15; len++) {
			offs[len + 1] = offs[len] + generatedCount[len/*
			     * put symbols in table sorted by length, by symbol order within each
			     * length
			     */];
		}
		int[] generatedSymbol = this.getSymbol();
		for (symbol = 0; symbol < n; symbol++) {
			if (length[symbol] != 0) {
				generatedSymbol[offs[length[symbol]]++] = symbol;
			} 
		}
		return /* return zero for complete set, positive for incomplete set */left/*
		 * Decode literal/length and distance codes until an end-of-block code.
		 *
		 * Format notes:
		 *
		 * - Compressed data that is after the block type if fixed or after the code
		 *   description if dynamic is a combination of literals and length/distance
		 *   pairs terminated by and end-of-block code.  Literals are simply Huffman
		 *   coded bytes.  A length/distance pair is a coded length followed by a
		 *   coded distance to represent a string that occurs earlier in the
		 *   uncompressed data that occurs again at the current location.
		 *
		 * - Literals, lengths, and the end-of-block code are combined into a single
		 *   code of up to 286 symbols.  They are 256 literals (0..255), 29 length
		 *   symbols (257..285), and the end-of-block symbol (256).
		 *
		 * - There are 256 possible lengths (3..258), and so 29 symbols are not enough
		 *   to represent all of those.  Lengths 3..10 and 258 are in fact represented
		 *   by just a length symbol.  Lengths 11..257 are represented as a symbol and
		 *   some number of extra bits that are added as an integer to the base length
		 *   of the length symbol.  The number of extra bits is determined by the base
		 *   length symbol.  These are in the static arrays below, lens[] for the base
		 *   lengths and lext[] for the corresponding number of extra bits.
		 *
		 * - The reason that 258 gets its own symbol is that the longest length is used
		 *   often in highly redundant files.  Note that 258 can also be coded as the
		 *   base value 227 plus the maximum extra value of 31.  While a good deflate
		 *   should never do this, it is not an error, and should be decoded properly.
		 *
		 * - If a length is decoded, including its extra bits if any, then it is
		 *   followed a distance code.  There are up to 30 distance symbols.  Again
		 *   there are many more possible distances (1..32768), so extra bits are added
		 *   to a base value represented by the symbol.  The distances 1..4 get their
		 *   own symbol, but the rest require extra bits.  The base distances and
		 *   corresponding number of extra bits are below in the static arrays dist[]
		 *   and dext[].
		 *
		 * - Literal bytes are simply written to the output.  A length/distance pair is
		 *   an instruction to copy previously uncompressed bytes to the output.  The
		 *   copy is from distance bytes back in the output stream, copying for length
		 *   bytes.
		 *
		 * - Distances pointing before the beginning of the output data are not
		 *   permitted.
		 *
		 * - Overlapped copies, where the length is greater than the distance, are
		 *   allowed and common.  For example, a distance of one and a length of 258
		 *   simply copies the last byte 258 times.  A distance of four and a length of
		 *   twelve copies the last four bytes three times.  A simple forward copy
		 *   ignoring whether the length is greater than the distance or not implements
		 *   this correctly.  You should not use memcpy() since its behavior is not
		 *   defined for overlapped arrays.  You should not use memmove() or bcopy()
		 *   since though their behavior -is- defined for overlapping arrays, it is
		 *   defined to do the wrong thing in this case.
		 */;
		/* current symbol when stepping through length[] */int symbol;
		/* current length when stepping through h->count[] */int len;
		/* number of possible codes left of current length */int left;
		int[] offs = new int[13 + /* offsets in symbol table for each length */1];
		int[] length = new int[/* code lengths */256];
		symbol = /* convert compact repeat counts into symbol bit length list */0;
		do {
			len = rep++;
			left = (len >> 4) + 1;
			len &=  15;
			do {
				length[symbol++] = len;
			} while (--left);
		} while (--n);
		n = symbol;
		int[] generatedCount = this.getCount();
		for (len = 0; len <= 13; /* count number of codes of each length */len++) {
			generatedCount[len] = 0;
		}
		for (symbol = 0; symbol < n; symbol++) {
			(generatedCount[length[/* assumes lengths are within bounds */symbol]])++;
		}
		if (generatedCount[0] == /* no codes! */n) {
			return /* complete, but decode() will fail */0;
		} 
		left = /* check for an over-subscribed or incomplete set of lengths *//* one possible code of zero length */1;
		for (len = 1; len <= 13; len++) {
			left <<=  /* one more bit, double codes left */1;
			left -= generatedCount[/* deduct count from possible codes */len];
			if (left < 0) {
				return /* over-subscribed--return negative */left/* left > 0 means incomplete */;
			} 
		}
		offs[1] = /* generate offsets into symbol table for each length for sorting */0;
		for (len = 1; len < 13; len++) {
			offs[len + 1] = offs[len] + generatedCount[len/*
			     * put symbols in table sorted by length, by symbol order within each
			     * length
			     */];
		}
		int[] generatedSymbol = this.getSymbol();
		for (symbol = 0; symbol < n; symbol++) {
			if (length[symbol] != 0) {
				generatedSymbol[offs[length[symbol]]++] = symbol;
			} 
		}
		return /* return zero for complete set, positive for incomplete set */left/*
		 * Decode PKWare Compression Library stream.
		 *
		 * Format notes:
		 *
		 * - First byte is 0 if literals are uncoded or 1 if they are coded.  Second
		 *   byte is 4, 5, or 6 for the number of extra bits in the distance code.
		 *   This is the base-2 logarithm of the dictionary size minus six.
		 *
		 * - Compressed data is a combination of literals and length/distance pairs
		 *   terminated by an end code.  Literals are either Huffman coded or
		 *   uncoded bytes.  A length/distance pair is a coded length followed by a
		 *   coded distance to represent a string that occurs earlier in the
		 *   uncompressed data that occurs again at the current location.
		 *
		 * - A bit preceding a literal or length/distance pair indicates which comes
		 *   next, 0 for literals, 1 for length/distance.
		 *
		 * - If literals are uncoded, then the next eight bits are the literal, in the
		 *   normal bit order in the stream, i.e. no bit-reversal is needed. Similarly,
		 *   no bit reversal is needed for either the length extra bits or the distance
		 *   extra bits.
		 *
		 * - Literal bytes are simply written to the output.  A length/distance pair is
		 *   an instruction to copy previously uncompressed bytes to the output.  The
		 *   copy is from distance bytes back in the output stream, copying for length
		 *   bytes.
		 *
		 * - Distances pointing before the beginning of the output data are not
		 *   permitted.
		 *
		 * - Overlapped copies, where the length is greater than the distance, are
		 *   allowed and common.  For example, a distance of one and a length of 518
		 *   simply copies the last byte 518 times.  A distance of four and a length of
		 *   twelve copies the last four bytes three times.  A simple forward copy
		 *   ignoring whether the length is greater than the distance or not implements
		 *   this correctly.
		 */;
	}
	public int[] getCount() {
		return count;
	}
	public void setCount(int[] newCount) {
		count = newCount;
	}
	public int[] getSymbol() {
		return symbol;
	}
	public void setSymbol(int[] newSymbol) {
		symbol = newSymbol;
	}
}
