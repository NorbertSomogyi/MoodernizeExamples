package application;

/*
 * LZMA2 definitions
 *
 * Authors: Lasse Collin <lasse.collin@tukaani.org>
 *          Igor Pavlov <http://7-zip.org/>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */
/* Range coder constants */
/*
 * Maximum number of position states. A position state is the lowest pb
 * number of bits of the current uncompressed offset. In some places there
 * are different sets of probabilities for different position states.
 */
/*
 * This enum is used to track which LZMA symbols have occurred most recently
 * and in which order. This information is used to predict the next symbol.
 *
 * Symbols:
 *  - Literal: One 8-bit byte
 *  - Match: Repeat a chunk of data at some distance
 *  - Long repeat: Multi-byte match at a recently seen distance
 *  - Short repeat: One-byte repeat at a recently seen distance
 *
 * The symbol names are in from STATE_oldest_older_previous. REP means
 * either short or long repeated match, and NONLIT means any non-literal.
 */
public enum lzma_state {
	STATE_LIT_LIT, 
	STATE_MATCH_LIT_LIT, 
	STATE_REP_LIT_LIT, 
	STATE_SHORTREP_LIT_LIT, 
	STATE_MATCH_LIT, 
	STATE_REP_LIT, 
	STATE_SHORTREP_LIT, 
	STATE_LIT_MATCH, 
	STATE_LIT_LONGREP, 
	STATE_LIT_SHORTREP, 
	STATE_NONLIT_MATCH, 
	STATE_NONLIT_REP
}
/* Total number of states */
/* The lowest 7 states indicate that the previous state was a literal. */
/* Indicate that the latest symbol was a literal. */
/* Indicate that the latest symbol was a match. */
/* Indicate that the latest state was a long repeated match. */
/* Indicate that the latest symbol was a short match. */
/* Test if the previous symbol was a literal. */
/* Each literal coder is divided in three sections:
 *   - 0x001-0x0FF: Without match byte
 *   - 0x101-0x1FF: With match byte; match bit is 0
 *   - 0x201-0x2FF: With match byte; match bit is 1
 *
 * Match byte is used when the previous LZMA symbol was something else than
 * a literal (that is, it was some kind of match).
 */
/* Maximum number of literal coders */
/* Minimum length of a match is two bytes. */
/* Match length is encoded with 4, 5, or 10 bits.
 *
 * Length   Bits
 *  2-9      4 = Choice=0 + 3 bits
 * 10-17     5 = Choice=1 + Choice2=0 + 3 bits
 * 18-273   10 = Choice=1 + Choice2=1 + 8 bits
 */
/*
 * Maximum length of a match is 273 which is a result of the encoding
 * described above.
 */
/*
 * Different sets of probabilities are used for match distances that have
 * very short match length: Lengths of 2, 3, and 4 bytes have a separate
 * set of probabilities for each length. The matches with longer length
 * use a shared set of probabilities.
 */
/*
 * Get the index of the appropriate probability array for decoding
 * the distance slot.
 */
/*
 * The highest two bits of a 32-bit match distance are encoded using six bits.
 * This six-bit value is called a distance slot. This way encoding a 32-bit
 * value takes 6-36 bits, larger values taking more bits.
 */
/* Match distances up to 127 are fully encoded using probabilities. Since
 * the highest two bits (distance slot) are always encoded using six bits,
 * the distances 0-3 don't need any additional bits to encode, since the
 * distance slot itself is the same as the actual distance. DIST_MODEL_START
 * indicates the first distance slot where at least one additional bit is
 * needed.
 */
/*
 * Match distances greater than 127 are encoded in three pieces:
 *   - distance slot: the highest two bits
 *   - direct bits: 2-26 bits below the highest two bits
 *   - alignment bits: four lowest bits
 *
 * Direct bits don't use any probabilities.
 *
 * The distance slot value of 14 is for distances 128-191.
 */
/* Distance slots that indicate a distance <= 127. */
/*
 * For match distances greater than 127, only the highest two bits and the
 * lowest four bits (alignment) is encoded using probabilities.
 */
/* Total number of all probability variables */
/*
 * LZMA remembers the four most recent match distances. Reusing these
 * distances tends to take less space than re-encoding the actual
 * distance value.
 */
