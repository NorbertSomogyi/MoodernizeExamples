package application;

/* enough.c -- determine the maximum size of inflate's Huffman code tables over
 * all possible valid and complete Huffman codes, subject to a length limit.
 * Copyright (C) 2007, 2008, 2012 Mark Adler
 * Version 1.4  18 August 2012  Mark Adler
 */
/* Version history:
   1.0   3 Jan 2007  First version (derived from codecount.c version 1.4)
   1.1   4 Jan 2007  Use faster incremental table usage computation
                     Prune examine() search on previously visited states
   1.2   5 Jan 2007  Comments clean up
                     As inflate does, decrease root for short codes
                     Refuse cases where inflate would increase root
   1.3  17 Feb 2008  Add argument for initial root table size
                     Fix bug for initial root table size == max - 1
                     Use a macro to compute the history index
   1.4  18 Aug 2012  Avoid shifts more than bits in type (caused endless loop!)
                     Clean up comparisons of different types
                     Clean up code indentation
 */
/*
   Examine all possible Huffman codes for a given number of symbols and a
   maximum code length in bits to determine the maximum table size for zilb's
   inflate.  Only complete Huffman codes are counted.

   Two codes are considered distinct if the vectors of the number of codes per
   length are not identical.  So permutations of the symbol assignments result
   in the same code for the counting, as do permutations of the assignments of
   the bit values to the codes (i.e. only canonical codes are counted).

   We build a code from shorter to longer lengths, determining how many symbols
   are coded at each length.  At each step, we have how many symbols remain to
   be coded, what the last code length used was, and how many bit patterns of
   that length remain unused. Then we add one to the code length and double the
   number of unused patterns to graduate to the next code length.  We then
   assign all portions of the remaining symbols to that code length that
   preserve the properties of a correct and eventually complete code.  Those
   properties are: we cannot use more bit patterns than are available; and when
   all the symbols are used, there are exactly zero possible bit patterns
   remaining.

   The inflate Huffman decoding algorithm uses two-level lookup tables for
   speed.  There is a single first-level table to decode codes up to root bits
   in length (root == 9 in the current inflate implementation).  The table
   has 1 << root entries and is indexed by the next root bits of input.  Codes
   shorter than root bits have replicated table entries, so that the correct
   entry is pointed to regardless of the bits that follow the short code.  If
   the code is longer than root bits, then the table entry points to a second-
   level table.  The size of that table is determined by the longest code with
   that root-bit prefix.  If that longest code has length len, then the table
   has size 1 << (len - root), to index the remaining bits in that set of
   codes.  Each subsequent root-bit prefix then has its own sub-table.  The
   total number of table entries required by the code is calculated
   incrementally as the number of codes at each bit length is populated.  When
   all of the codes are shorter than root bits, then root is reduced to the
   longest code length, resulting in a single, smaller, one-level table.

   The inflate algorithm also provides for small values of root (relative to
   the log2 of the number of symbols), where the shortest code has more bits
   than root.  In that case, root is increased to the length of the shortest
   code.  This program, by design, does not handle that case, so it is verified
   that the number of symbols is less than 2^(root + 1).

   In order to speed up the examination (by about ten orders of magnitude for
   the default arguments), the intermediate states in the build-up of a code
   are remembered and previously visited branches are pruned.  The memory
   required for this will increase rapidly with the total number of symbols and
   the maximum code length in bits.  However this is a very small price to pay
   for the vast speedup.

   First, all of the possible Huffman codes are counted, and reachable
   intermediate states are noted by a non-zero count in a saved-results array.
   Second, the intermediate states that lead to (root + 1) bit or longer codes
   are used to look at all sub-codes from those junctures for their inflate
   memory usage.  (The amount of memory used is not affected by the number of
   codes of root bits or less in length.)  Third, the visited states in the
   construction of those sub-codes and the associated calculation of the table
   size is recalled in order to avoid recalculating from the same juncture.
   Beginning the code examination at (root + 1) bit codes, which is enabled by
   identifying the reachable nodes, accounts for about six of the orders of
   magnitude of improvement for the default arguments.  About another four
   orders of magnitude come from not revisiting previous states.  Out of
   approximately 2x10^16 possible Huffman codes, only about 2x10^6 sub-codes
   need to be examined to cover all of the possible table memory usage cases
   for the default arguments of 286 symbols limited to 15-bit codes.

   Note that an unsigned long long type is used for counting.  It is quite easy
   to exceed the capacity of an eight-byte integer with a large number of
   symbols and a large maximum code length, so multiple-precision arithmetic
   would need to replace the unsigned long long arithmetic in that case.  This
   program will abort if an overflow occurs.  The big_t type identifies where
   the counting takes place.

   An unsigned long long type is also used for calculating the number of
   possible codes remaining at the maximum length.  This limits the maximum
   code length to the number of bits in a long long minus the number of bits
   needed to represent the symbols in a flat code.  The code_t type identifies
   where the bit pattern counting takes place.
 */
/* special data types */
/* type for code counting */
/* type for bit pattern counting */
/* type for been here check */
/* The array for tracking visited states, done[], is itself indexed identically
   to the num[] array as described above for the (syms, left, len) triplet.
   Each element in the array is further indexed by the (mem, rem) doublet,
   where mem is the amount of inflate table space used so far, and rem is the
   remaining unused entries in the current inflate sub-table.  Each indexed
   element is simply one bit indicating whether the state has been visited or
   not.  Since the ranges for mem and rem are not known a priori, each bit
   vector is of a variable size, and grows as needed to accommodate the visited
   states.  mem and rem are used to calculate a single index in a triangular
   array.  Since the range of mem is expected in the default case to be about
   ten times larger than the range of rem, the array is skewed to reduce the
   memory usage, with eight times the range for mem than for rem.  See the
   calculations for offset and bit in beenhere() for the details.

   For the deflate example of 286 symbols limited to 15-bit codes, the bit
   vectors grow to total approximately 21 MB, in addition to the 4.3 MB done[]
   array itself.
 */
/* Globals to avoid propagating constants or constant pointers recursively */
/* maximum allowed bit length for the codes */
/* size of base code table in bits */
/* largest code table so far */
/* number of elements in num and done */
/* number of symbols assigned to each bit length */
/* saved results array for code counting */
/* states already evaluated array */
public class tab {
	private Object len;
	private Byte vec;
	
	public tab(Object len, Byte vec) {
		setLen(len);
		setVec(vec);
	}
	public tab() {
	}
	
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Byte getVec() {
		return vec;
	}
	public void setVec(Byte newVec) {
		vec = newVec;
	}
}
/* Index function for num[] and done[] */
