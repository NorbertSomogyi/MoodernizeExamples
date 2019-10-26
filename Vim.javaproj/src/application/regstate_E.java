package application;

// definition	number		   opnd?    meaning
//	End of program or NOMATCH operand.
//	Match "" at beginning of line.
//	Match "" at end of line.
// node Match this alternative, or the
//	next...
//	Match "", "next" ptr points backward.
// str	Match this string.
//	Match empty string.
// node Match this (simple) thing 0 or more
//	times.
// node Match this (simple) thing 1 or more
//	times.
// node match the operand zero-width
// node check for no match with operand
// node look behind for a match with operand
// node look behind for no match with operand
// node match the operand here
// node Match this (simple) thing between m and
//	n times (\{m,n\}).
//	Match "" after [^a-zA-Z0-9_]
//	Match "" at    [^a-zA-Z0-9_]
// nr nr  define the min & max for BRACE_SIMPLE
//	and BRACE_COMPLEX.
//	Match line-break
//	End position for BEHIND or NOBEHIND
// character classes: 20-48 normal, 50-78 include a line-break
//	Match any one character.
// str	Match any character in this string.
// str	Match any character not in this
//	string.
//	Match identifier char
//	Match identifier char but no digit
//	Match keyword char
//	Match word char but no digit
//	Match file name char
//	Match file name char but no digit
//	Match printable char
//	Match printable char but no digit
//	Match whitespace char
//	Match non-whitespace char
//	Match digit char
//	Match non-digit char
//	Match hex char
//	Match non-hex char
//	Match octal char
//	Match non-octal char
//	Match word char
//	Match non-word char
//	Match head char
//	Match non-head char
//	Match alpha char
//	Match non-alpha char
//	Match lowercase char
//	Match non-lowercase char
//	Match uppercase char
//	Match non-uppercase char
// -89	 Mark this point in input as start of
//	 \( subexpr.  MOPEN + 0 marks start of
//	 match.
// -99	 Analogous to MOPEN.  MCLOSE + 0 marks
//	 end of match.
// -109 node Match same string again \1-\9
// -119	 Mark this point in input as start of
//	 \z( subexpr.
// -129	 Analogous to ZOPEN.
// -139 node Match external submatch \z1-\z9
// -149 node Match nodes between m & n times
//	Mark this point in input as start of
//	\%( subexpr.
//	Analogous to NOPEN.
// mbc	Match one multi-byte character
//	Match "" at beginning of file.
//	Match "" at end of file.
//	Match location of cursor.
// nr cmp  Match line number
// nr cmp  Match column number
// nr cmp  Match virtual column number
// mark cmp  Match mark position
//	Match Visual area
// any composing characters
// Known never to match null string.
// Simple enough to be STAR/PLUS operand.
// Starts with * or +.
// Contains some \n.
// Contains "\@<=" or "\@<!".
// Worst case.
// Complex \{...} count
// Code-emit pointer, or JUST_CALC_SIZE
// Code size.
// TRUE when offset out of range
// flags, TRUE if end of () found
// Minimums for complex brace repeats
// Maximums for complex brace repeats
// Current counts for complex brace repeats
// only do one char for EXACTLY
// When making changes to classchars also change nfa_classcodes.
// Values for rs_state in regitem_T.
public enum regstate_E {
	RS_NOPEN, 
	RS_MOPEN, 
	RS_MCLOSE, 
	RS_BRANCH, 
	RS_BRCPLX_MORE, 
	RS_BRCPLX_LONG, 
	RS_BRCPLX_SHORT, 
	RS_NOMATCH, 
	RS_BEHIND1, 
	RS_BEHIND2, 
	RS_STAR_LONG, 
	RS_STAR_SHORT
}
// NOPEN and NCLOSE
// MOPEN + [0-9]
// MCLOSE + [0-9]
// ZOPEN + [0-9]
// ZCLOSE + [0-9]
// BRANCH
// BRACE_COMPLEX and trying one more match
// BRACE_COMPLEX and trying longest match
// BRACE_COMPLEX and trying shortest match
// NOMATCH
// BEHIND / NOBEHIND matching rest
