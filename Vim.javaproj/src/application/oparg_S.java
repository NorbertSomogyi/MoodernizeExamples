package application;

// The Python value for this window
// The Python value for this window
/*
 * Arguments for operators.
 */
public class oparg_S {
	private int op_type;
	private int regname;
	private int motion_type;
	private int motion_force;
	private int use_reg_one;
	private int inclusive;
	private int end_adjusted;
	private  start;
	private  end;
	private  cursor_start;
	private long line_count;
	private int empty;
	private int is_VIsual;
	private int block_mode;
	private Object start_vcol;
	private Object end_vcol;
	private long prev_opcount;
	private long prev_count0;
	
	public oparg_S(int op_type, int regname, int motion_type, int motion_force, int use_reg_one, int inclusive, int end_adjusted,  start,  end,  cursor_start, long line_count, int empty, int is_VIsual, int block_mode, Object start_vcol, Object end_vcol, long prev_opcount, long prev_count0) {
		setOp_type(op_type);
		setRegname(regname);
		setMotion_type(motion_type);
		setMotion_force(motion_force);
		setUse_reg_one(use_reg_one);
		setInclusive(inclusive);
		setEnd_adjusted(end_adjusted);
		setStart(start);
		setEnd(end);
		setCursor_start(cursor_start);
		setLine_count(line_count);
		setEmpty(empty);
		setIs_VIsual(is_VIsual);
		setBlock_mode(block_mode);
		setStart_vcol(start_vcol);
		setEnd_vcol(end_vcol);
		setPrev_opcount(prev_opcount);
		setPrev_count0(prev_count0);
	}
	public oparg_S() {
	}
	
	/*
	 * findmatch - find the matching paren or brace
	 *
	 * Improvement over vi: Braces inside quotes are ignored.
	 */
	public  findmatch(int initc) {
		return oap.findmatchlimit(initc, 0, 0/*
		 * Return TRUE if the character before "linep[col]" equals "ch".
		 * Return FALSE if "col" is zero.
		 * Update "*prevcol" to the column of the previous character, unless "prevcol"
		 * is NULL.
		 * Handles multibyte string correctly.
		 */);
	}
	public  findmatchlimit(int initc, int flags, int maxtravel) {
		/* current search position */pos_T pos = new pos_T();
		int findc = /* matching brace */0;
		int c;
		int count = /* cumulative number of braces */0;
		int backwards = /* init for gcc */0;
		int raw_string = /* search for raw string */0;
		int inquote = /* TRUE when inside quotes */0;
		/* pointer to current line */char_u linep = new char_u();
		char_u ptr = new char_u();
		/* check for quotes in current line */int do_quotes;
		/* do_quotes value at start position */int at_start;
		int hash_dir = /* Direction searched for # things */0;
		int comment_dir = /* Direction searched for comments */0;
		/* Where last slash-star was found */pos_T match_pos = new pos_T();
		/* start position is in quotes */int start_in_quotes;
		int traveled = /* how far we've searched so far */0;
		int ignore_cend = /* ignore comment end */0;
		/* vi compatible matching */int cpo_match;
		/* don't recognize backslashes */int cpo_bsl;
		int match_escaped = /* search for escaped match */0;
		/* Direction to search */int dir;
		int comment_col = /* start of / / comment */INT_MAX;
		int lispcomm = /* inside of Lisp-style comment */0;
		Object generatedB_p_lisp = curbuf.getB_p_lisp();
		int lisp = generatedB_p_lisp;
		pos = ModernizedCProgram.curwin.getW_cursor();
		pos.setColadd(0);
		Object generatedLnum = pos.getLnum();
		linep = ModernizedCProgram.ml_get(generatedLnum);
		cpo_match = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'%') != ((Object)0));
		cpo_bsl = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'M') != ((Object)0));
		if (flags & /* Direction to search when initc is '/', '*' or '#' */-1024) {
			dir = (true);
		}  else if (flags & -1024) {
			dir = 1;
		} else {
				dir = 0/*
				     * if initc given, look in the table for the matching character
				     * '/' and '*' are special cases: look for start or end of comment.
				     * When '/' is used, we ignore running backwards into an star-slash, for
				     * "[*" command, we just want to find any comment.
				     */;
		} 
		Object generatedCol = pos.getCol();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (initc == (byte)'/' || initc == (byte)'*' || initc == (byte)'R') {
			comment_dir = dir;
			if (initc == (byte)'/') {
				ignore_cend = 1;
			} 
			backwards = (dir == 1) ? 0 : 1;
			raw_string = (initc == (byte)'R');
			initc = (byte)'\000';
		}  else if (initc != (byte)'#' && initc != (byte)'\000') {
			ModernizedCProgram.find_mps_values(initc, findc, backwards, 1);
			if (findc == (byte)'\000') {
				return ((Object)0);
			} 
		} else {
				if (initc == /*
					 * Either initc is '#', or no initc was given and we need to look
					 * under the cursor.
					 */(byte)'#') {
					hash_dir = dir/*
						     * initc was not given, must look for something to match under
						     * or near the cursor.
						     * Only check for special things when 'cpo' doesn't have '%'.
						     */;
				} else {
						if (!cpo_match) {
							ptr = ModernizedCProgram.skipwhite(/* Are we before or at #if, #else etc.? */linep);
							if (ptr == (byte)'#' && generatedCol <= (colnr_T)(ptr - linep)) {
								ptr = ModernizedCProgram.skipwhite(ptr + 1);
								if (.strncmp((byte)(ptr), (byte)("if"), (size_t)(true)) == 0 || .strncmp((byte)(ptr), (byte)("endif"), (size_t)(true)) == 0 || .strncmp((byte)(ptr), (byte)("el"), (size_t)(true)) == 0) {
									hash_dir = 1;
								} 
							}  else if (linep[generatedCol] == /* Are we on a comment? */(byte)'/') {
								if (linep[generatedCol + 1] == (byte)'*') {
									comment_dir = 1;
									backwards = 0;
									generatedCol++;
								}  else if (generatedCol > 0 && linep[generatedCol - 1] == (byte)'*') {
									comment_dir = (true);
									backwards = 1;
									generatedCol--;
								} 
							}  else if (linep[generatedCol] == (byte)'*') {
								if (linep[generatedCol + 1] == (byte)'/') {
									comment_dir = (true);
									backwards = 1;
								}  else if (generatedCol > 0 && linep[generatedCol - 1] == (byte)'/') {
									comment_dir = 1;
									backwards = 0;
								} 
							} 
						} 
						if (!hash_dir && !/*
							     * If we are not on a comment or the # at the start of a line, then
							     * look for brace anywhere on this line after the cursor.
							     */comment_dir/*
								 * Find the brace under or after the cursor.
								 * If beyond the end of the line, use the last character in
								 * the line.
								 */) {
							if (linep[generatedCol] == (byte)'\000' && generatedCol) {
								--generatedCol;
							} 
							for (; ; ) {
								initc = (has_mbyte ? .mb_ptr2char(linep + generatedCol) : (int)(linep + generatedCol));
								if (initc == (byte)'\000') {
									break;
								} 
								ModernizedCProgram.find_mps_values(initc, findc, backwards, 0);
								if (findc) {
									break;
								} 
								generatedCol += .mb_ptr2len(linep + generatedCol);
							}
							if (!findc) {
								if (!cpo_match && ModernizedCProgram.skipwhite(linep) == /* no brace in the line, maybe use "  #if" then */(byte)'#') {
									hash_dir = 1;
								} else {
										return ((Object)0);
								} 
							}  else if (!cpo_bsl) {
								int col;
								int bslcnt = 0;
								for (col = generatedCol; ModernizedCProgram.check_prevcol(linep, col, (byte)'\\', /* Set "match_escaped" if there are an odd number of
										     * backslashes. */col); ) {
									bslcnt++;
								}
								match_escaped = (bslcnt & 1);
							} 
						} 
				} 
				if (hash_dir/*
					     * Look for matching #if, #else, #elif, or #endif
					     */) {
					if (oap != ((Object)0)) {
						this.setMotion_type(/* Linewise for this case only */1);
					} 
					if (initc != (byte)'#') {
						ptr = ModernizedCProgram.skipwhite(ModernizedCProgram.skipwhite(linep) + 1);
						if (.strncmp((byte)(ptr), (byte)("if"), (size_t)(true)) == 0 || .strncmp((byte)(ptr), (byte)("el"), (size_t)(true)) == 0) {
							hash_dir = 1;
						}  else if (.strncmp((byte)(ptr), (byte)("endif"), (size_t)(true)) == 0) {
							hash_dir = -1;
						} else {
								return ((Object)0);
						} 
					} 
					pos.setCol(0);
					while (!got_int) {
						if (hash_dir > 0) {
							if (generatedLnum == generatedMl_line_count) {
								break;
							} 
						}  else if (generatedLnum == 1) {
							break;
						} 
						generatedLnum += hash_dir;
						linep = ModernizedCProgram.ml_get(generatedLnum);
						ModernizedCProgram.line_breakcheck();
						ptr = ModernizedCProgram.skipwhite(linep);
						if (ptr != (byte)'#') {
							continue;
						} 
						pos.setCol((colnr_T)(ptr - linep));
						ptr = ModernizedCProgram.skipwhite(ptr + 1);
						if (hash_dir > 0) {
							if (.strncmp((byte)(ptr), (byte)("if"), (size_t)(true)) == 0) {
								count++;
							}  else if (.strncmp((byte)(ptr), (byte)("el"), (size_t)(true)) == 0) {
								if (count == 0) {
									return pos;
								} 
							}  else if (.strncmp((byte)(ptr), (byte)("endif"), (size_t)(true)) == 0) {
								if (count == 0) {
									return pos;
								} 
								count--;
							} 
						} else {
								if (.strncmp((byte)(ptr), (byte)("if"), (size_t)(true)) == 0) {
									if (count == 0) {
										return pos;
									} 
									count--;
								}  else if (initc == (byte)'#' && .strncmp((byte)(ptr), (byte)("el"), (size_t)(true)) == 0) {
									if (count == 0) {
										return pos;
									} 
								}  else if (.strncmp((byte)(ptr), (byte)("endif"), (size_t)(true)) == 0) {
									count++;
								} 
						} 
					}
					return ((Object)0);
				} 
		} 
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rl() && ModernizedCProgram.vim_strchr((char_u)"()[]{}<>", initc) != ((Object)/* This is just guessing: when 'rightleft' is set, search for a matching
		     * paren/brace in the other direction. */0)) {
			backwards = !backwards;
		} 
		do_quotes = -1;
		start_in_quotes = 2;
		do {
			(match_pos).setLnum(0);
			(match_pos).setCol(0);
			(match_pos).setColadd(0);
		} while (0);
		if ((backwards && /* backward search: Check if this line contains a single-line comment */comment_dir) || lisp) {
			comment_col = ModernizedCProgram.check_linecomment(linep);
		} 
		if (lisp && comment_col != INT_MAX && generatedCol > (colnr_T)comment_col) {
			lispcomm = /* find match inside this comment */1;
		} 
		while (!got_int/*
			 * Go to the next position, forward or backward. We could use
			 * inc() and dec() here, but that is much slower
			 */) {
			if (backwards) {
				if (lispcomm && generatedCol < (colnr_T)/* char to match is inside of comment, don't search outside */comment_col) {
					break;
				} 
				if (generatedCol == /* at start of line, go to prev. one */0) {
					if (generatedLnum == /* start of file */1) {
						break;
					} 
					--generatedLnum;
					if (maxtravel > 0 && ++traveled > maxtravel) {
						break;
					} 
					linep = ModernizedCProgram.ml_get(generatedLnum);
					pos.setCol((colnr_T).strlen((byte)(/* pos.col on trailing NUL */linep)));
					do_quotes = -1;
					ModernizedCProgram.line_breakcheck();
					if (/* Check if this line contains a single-line comment */comment_dir || lisp) {
						comment_col = ModernizedCProgram.check_linecomment(linep);
					} 
					if (lisp && comment_col != /* skip comment */INT_MAX) {
						pos.setCol(comment_col);
					} 
				} else {
						--generatedCol;
						if (has_mbyte) {
							generatedCol -= .UNRECOGNIZEDFUNCTIONNAME(linep, linep + generatedCol);
						} 
				} 
			} else {
					if (linep[generatedCol] == /* forward search */(byte)'\000'/* at end of line, go to next one */ || (lisp && comment_col != /* don't search for match in comment */INT_MAX && generatedCol == (colnr_T)comment_col)) {
						if (generatedLnum == generatedMl_line_count || /* line is exhausted and comment with it,
									 * don't search for match in code */lispcomm) {
							break;
						} 
						++generatedLnum;
						if (maxtravel && traveled++ > maxtravel) {
							break;
						} 
						linep = ModernizedCProgram.ml_get(generatedLnum);
						pos.setCol(0);
						do_quotes = -1;
						ModernizedCProgram.line_breakcheck();
						if (/* find comment pos in new line */lisp) {
							comment_col = ModernizedCProgram.check_linecomment(linep);
						} 
					} else {
							if (has_mbyte) {
								generatedCol += .UNRECOGNIZEDFUNCTIONNAME(linep + generatedCol);
							} else {
									++generatedCol;
							} 
					} 
			} 
			if (generatedCol == 0 && (flags & /*
				 * If FM_BLOCKSTOP given, stop at a '{' or '}' in column 0.
				 */-1024) && (linep[0] == (byte)'{' || linep[0] == (byte)'}')) {
				if (linep[0] == findc && count == /* match! */0) {
					return pos;
				} 
				break;
			} 
			if (comment_dir) {
				if (comment_dir == /* Note: comments do not nest, and we ignore quotes in them *//* TODO: ignore comment brackets inside strings */1) {
					if (linep[generatedCol] == (byte)'*' && linep[generatedCol + 1] == (byte)'/') {
						generatedCol++;
						return pos/* Searching backwards */;
					} 
				} else {
						if (generatedCol == /*
								 * A comment may contain / * or / /, it may also start or end
								 * with / * /.	Ignore a / * after / / and after *.
								 */0) {
							continue;
						}  else if (raw_string) {
							if (linep[generatedCol - 1] == (byte)'R' && linep[generatedCol] == (byte)'"' && ModernizedCProgram.vim_strchr(linep + generatedCol + 1, (byte)'(') != ((Object)0/* Possible start of raw string. Now that we have the
										 * delimiter we can check if it ends before where we
										 * started searching, or before the previously found
										 * raw string start. */)) {
								if (!pos.find_rawstring_end(linep, count > 0 ? match_pos : ModernizedCProgram.curwin.getW_cursor())) {
									count++;
									match_pos = pos;
									generatedCol--;
								} 
								linep = ModernizedCProgram.ml_get(generatedLnum);
							} 
						}  else if (linep[generatedCol - 1] == (byte)'/' && linep[generatedCol] == (byte)'*' && (generatedCol == 1 || linep[generatedCol - 2] != (byte)'*') && (int)generatedCol < comment_col) {
							count++;
							match_pos = pos;
							generatedCol--;
						}  else if (linep[generatedCol - 1] == (byte)'*' && linep[generatedCol] == (byte)'/') {
							if (count > 0) {
								pos = match_pos;
							}  else if (generatedCol > 1 && linep[generatedCol - 2] == (byte)'/' && (int)generatedCol <= comment_col) {
								generatedCol -= 2;
							}  else if (ignore_cend) {
								continue;
							} else {
									return ((Object)0);
							} 
							return pos;
						} 
				} 
				continue;
			} 
			if (cpo_match) {
				do_quotes = 0;
			}  else if (do_quotes == -1/*
				     * Count the number of quotes in the line, skipping \" and '"'.
				     * Watch out for "\\".
				     */) {
				at_start = do_quotes;
				for (ptr = linep; ptr; ++ptr) {
					if (ptr == linep + generatedCol + backwards) {
						at_start = (do_quotes & 1);
					} 
					if (ptr == (byte)'"' && (ptr == linep || ptr[-1] != (byte)'\'' || ptr[1] != (byte)'\'')) {
						++do_quotes;
					} 
					if (ptr == (byte)'\\' && ptr[1] != (byte)'\000') {
						++ptr;
					} 
				}
				do_quotes &=  /* result is 1 with even number of quotes */1/*
					     * If we find an uneven count, check current line and previous
					     * one for a '\' at the end.
					     */;
				if (!do_quotes) {
					inquote = 0;
					if (ptr[-1] == (byte)'\\') {
						do_quotes = 1;
						if (start_in_quotes == 2) {
							inquote = /* Do we need to use at_start here? */1;
							start_in_quotes = 1;
						}  else if (backwards) {
							inquote = 1;
						} 
					} 
					if (generatedLnum > 1) {
						ptr = ModernizedCProgram.ml_get(generatedLnum - 1);
						if (ptr && (ptr + .strlen((byte)(ptr)) - 1) == (byte)'\\') {
							do_quotes = 1;
							if (start_in_quotes == 2) {
								inquote = at_start;
								if (inquote) {
									start_in_quotes = 1;
								} 
							}  else if (!backwards) {
								inquote = 1;
							} 
						} 
						linep = ModernizedCProgram.ml_get(generatedLnum);
					} 
				} 
			} 
			if (start_in_quotes == 2) {
				start_in_quotes = 0/*
					 * If 'smartmatch' is set:
					 *   Things inside quotes are ignored by setting 'inquote'.  If we
					 *   find a quote without a preceding '\' invert 'inquote'.  At the
					 *   end of a line not ending in '\' we reset 'inquote'.
					 *
					 *   In lines with an uneven number of quotes (without preceding '\')
					 *   we do not know which part to ignore. Therefore we only set
					 *   inquote if the number of quotes in a line is even, unless this
					 *   line or the previous one ends in a '\'.  Complicated, isn't it?
					 */;
			} 
			c = (has_mbyte ? .mb_ptr2char(linep + generatedCol) : (int)(linep + generatedCol));
			switch (c) {
			case (byte)'"'/* a quote that is preceded with an odd number of backslashes is
				     * ignored */:
					if (do_quotes) {
						int col;
						for (col = generatedCol - 1; col >= 0; --col) {
							if (linep[col] != (byte)'\\') {
								break;
							} 
						}
						if ((((int)generatedCol - 1 - col) & 1) == 0) {
							inquote = !inquote;
							start_in_quotes = 0;
						} 
					} 
					break;
			case (byte)'\000':
					if (generatedCol == 0 || linep[generatedCol - 1] != /* at end of line without trailing backslash, reset inquote */(byte)'\\') {
						inquote = 0;
						start_in_quotes = 0;
					} 
					break;
			case (byte)'\'':
					if (!cpo_match && initc != (byte)'\'' && findc != (byte)'\'') {
						if (backwards) {
							if (generatedCol > 1) {
								if (linep[generatedCol - 2] == (byte)'\'') {
									generatedCol -= 2;
									break;
								}  else if (linep[generatedCol - 2] == (byte)'\\' && generatedCol > 2 && linep[generatedCol - 3] == (byte)'\'') {
									generatedCol -= 3;
									break;
								} 
							} 
						}  else if (linep[generatedCol + /* forward search */1]) {
							if (linep[generatedCol + 1] == (byte)'\\' && linep[generatedCol + 2] && linep[generatedCol + 3] == (byte)'\'') {
								generatedCol += 3;
								break;
							}  else if (linep[generatedCol + 2] == (byte)'\'') {
								generatedCol += 2;
								break;
							} 
						} 
					} 
			default:
					if (generatedB_p_lisp && ModernizedCProgram.vim_strchr((char_u)"(){}[]", c) != ((Object)0) && generatedCol > 1 && ModernizedCProgram.check_prevcol(linep, generatedCol, (byte)'\\', ((Object)0)) && ModernizedCProgram.check_prevcol(linep, generatedCol - 1, (byte)'#', ((Object)0))) {
						break;
					} 
					if ((!inquote || start_in_quotes == /* Check for match outside of quotes, and inside of
						     * quotes when the start is also inside of quotes. */1) && (c == initc || c == findc)) {
						int col;
						int bslcnt = 0;
						if (!cpo_bsl) {
							for (col = generatedCol; ModernizedCProgram.check_prevcol(linep, col, (byte)'\\', col); ) {
								bslcnt++;
							}
						} 
						if (cpo_bsl || (bslcnt & 1) == /* Only accept a match when 'M' is in 'cpo' or when escaping
								 * is what we expect. */match_escaped) {
							if (c == initc) {
								count++;
							} else {
									if (count == 0) {
										return pos;
									} 
									count--;
							} 
						} 
					} 
			}
		}
		if (comment_dir == (true) && count > 0) {
			pos = match_pos;
			return pos;
		} 
		return (pos_T)((Object)/* never found it */0/*
		 * Check if line[] contains a / / comment.
		 * Return MAXCOL if not, otherwise return the column.
		 * TODO: skip strings.
		 */);
	}
	public int current_word(long count, int include, int bigword) {
		/* TRUE: include word and white space *//* FALSE == word, TRUE == WORD */pos_T start_pos = new pos_T();
		pos_T pos = new pos_T();
		int inclusive = 1;
		int include_white = 0;
		ModernizedCProgram.cls_bigword = bigword;
		do {
			(start_pos).setLnum(0);
			(start_pos).setCol(0);
			(start_pos).setColadd(0);
		} while (0);
		if (VIsual_active && ModernizedCProgram.p_sel == (byte)'e' && (((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
			ModernizedCProgram.dec_cursor();
		} 
		if (!VIsual_active || (((ModernizedCProgram.curwin.getW_cursor()).getLnum() == (ModernizedCProgram.VIsual).getLnum()) && ((ModernizedCProgram.curwin.getW_cursor()).getCol() == (ModernizedCProgram.VIsual).getCol()) && ((ModernizedCProgram.curwin.getW_cursor()).getColadd() == (ModernizedCProgram.VIsual).getColadd()))) {
			ModernizedCProgram.back_in_line();
			start_pos = ModernizedCProgram.curwin.getW_cursor();
			if ((ModernizedCProgram.cls() == 0) == include) {
				if (ModernizedCProgram.end_word(-1024, bigword, 1, 1) == 0) {
					return 0/*
						     * If the start is not on white space, and white space should be
						     * included ("word	 "), or start is on white space and white
						     * space should not be included ("	 "), find start of word.
						     * If we end up in the first column of the next line (single char
						     * word) back up to end of the line.
						     */;
				} 
			} else {
					ModernizedCProgram.fwd_word(-1024, bigword, 1);
					if (ModernizedCProgram.curwin.getW_cursor().getCol() == 0) {
						ModernizedCProgram.curwin.getW_cursor().decl();
					} else {
							ModernizedCProgram.oneleft();
					} 
					if (include) {
						include_white = 1;
					} 
			} 
			if (VIsual_active) {
				ModernizedCProgram.VIsual = /* should do something when inclusive == FALSE ! */start_pos;
				ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
			} else {
					this.setStart(start_pos);
					this.setMotion_type(0);
			} 
			--count;
		} 
		while (count > /*
		     * When count is still > 0, extend with more objects.
		     */0) {
			inclusive = 1;
			if (VIsual_active && (((ModernizedCProgram.curwin.getW_cursor()).getLnum() != (ModernizedCProgram.VIsual).getLnum()) ? (ModernizedCProgram.curwin.getW_cursor()).getLnum() < (ModernizedCProgram.VIsual).getLnum() : (ModernizedCProgram.curwin.getW_cursor()).getCol() != (ModernizedCProgram.VIsual).getCol() ? (ModernizedCProgram.curwin.getW_cursor()).getCol() < (ModernizedCProgram.VIsual).getCol() : (ModernizedCProgram.curwin.getW_cursor()).getColadd() < (ModernizedCProgram.VIsual).getColadd())) {
				if (ModernizedCProgram.curwin.getW_cursor().decl() == -1) {
					return 0;
				} 
				if (include != (ModernizedCProgram.cls() != 0)) {
					if (ModernizedCProgram.bck_word(-1024, bigword, 1) == 0) {
						return 0;
					} 
				} else {
						if (ModernizedCProgram.bckend_word(-1024, bigword, 1) == 0) {
							return 0;
						} 
						(Object)ModernizedCProgram.curwin.getW_cursor().incl();
				} 
			} else {
					if (ModernizedCProgram.curwin.getW_cursor().incl() == -/*
						     * Move cursor forward one word and/or white area.
						     */1) {
						return 0;
					} 
					if (include != (ModernizedCProgram.cls() == 0)) {
						if (ModernizedCProgram.fwd_word(-1024, bigword, 1) == 0 && count > 1) {
							return 0/*
									 * If end is just past a new-line, we don't want to include
									 * the first character on the line.
									 * Put cursor on last char of white.
									 */;
						} 
						if (ModernizedCProgram.oneleft() == 0) {
							inclusive = 0;
						} 
					} else {
							if (ModernizedCProgram.end_word(-1024, bigword, 1, 1) == 0) {
								return 0;
							} 
					} 
			} 
			--count;
		}
		if (include_white && (ModernizedCProgram.cls() != 0 || (ModernizedCProgram.curwin.getW_cursor().getCol() == 0 && !inclusive/*
			 * If we don't include white space at the end, move the start
			 * to include some white space there. This makes "daw" work
			 * better on the last word in a sentence (and "2daw" on last-but-one
			 * word).  Also when "2daw" deletes "word." at the end of the line
			 * (cursor is at start of next line).
			 * But don't delete white space at start of line (indent).
			 */))) {
			pos = ModernizedCProgram.curwin.getW_cursor();
			ModernizedCProgram.curwin.setW_cursor(start_pos);
			if (ModernizedCProgram.oneleft() == 1) {
				ModernizedCProgram.back_in_line();
				if (ModernizedCProgram.cls() == 0 && ModernizedCProgram.curwin.getW_cursor().getCol() > 0) {
					if (VIsual_active) {
						ModernizedCProgram.VIsual = ModernizedCProgram.curwin.getW_cursor();
					} else {
							this.setStart(ModernizedCProgram.curwin.getW_cursor());
					} 
				} 
			} 
			ModernizedCProgram.curwin.setW_cursor(/* put cursor back at end */pos);
		} 
		if (VIsual_active) {
			if (ModernizedCProgram.p_sel == (byte)'e' && inclusive && ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd()) || (((ModernizedCProgram.VIsual).getLnum() == (ModernizedCProgram.curwin.getW_cursor()).getLnum()) && ((ModernizedCProgram.VIsual).getCol() == (ModernizedCProgram.curwin.getW_cursor()).getCol()) && ((ModernizedCProgram.VIsual).getColadd() == (ModernizedCProgram.curwin.getW_cursor()).getColadd())))) {
				ModernizedCProgram.inc_cursor();
			} 
			if (VIsual_mode == (byte)'V') {
				VIsual_mode = (byte)'v';
				redraw_cmdline = /* show mode later */1;
			} 
		} else {
				this.setInclusive(inclusive);
		} 
		return 1/*
		 * Find sentence(s) under the cursor, cursor at end.
		 * When Visual active, extend it by one or more sentences.
		 */;
	}
	public int current_sent(long count, int include) {
		pos_T start_pos = new pos_T();
		pos_T pos = new pos_T();
		int start_blank;
		int c;
		int at_start_sent;
		long ncount;
		start_pos = ModernizedCProgram.curwin.getW_cursor();
		pos = start_pos;
		ModernizedCProgram.findsent(1, /* Find start of next sentence. */-1024/*
		     * When the Visual area is bigger than one character: Extend it.
		     */);
		Object generatedLnum = (start_pos).getLnum();
		Object generatedCol = (start_pos).getCol();
		Object generatedColadd = (start_pos).getColadd();
		while () {
			pos.incl();
		}
		if (((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) {
			start_blank = 1;
			/* go back to first blank */start_pos.find_first_blank();
		} else {
				start_blank = 0;
				ModernizedCProgram.findsent((true), -1024);
				start_pos = ModernizedCProgram.curwin.getW_cursor();
		} 
		if (include) {
			ncount = count * 2;
		} else {
				ncount = count;
				if (start_blank) {
					--ncount;
				} 
		} 
		if (ncount > 0) {
			ModernizedCProgram.findsent_forward(ncount, 1);
		} else {
				ModernizedCProgram.curwin.getW_cursor().decl();
		} 
		if (include/*
			 * If the blank in front of the sentence is included, exclude the
			 * blanks at the end of the sentence, go back to the first blank.
			 * If there are no trailing blanks, try to include leading blanks.
			 */) {
			if (start_blank) {
				ModernizedCProgram.curwin.getW_cursor().find_first_blank();
				c = ModernizedCProgram.curwin.getW_cursor().gchar_pos();
				if (((c) == (byte)' ' || (c) == (byte)'\t')) {
					ModernizedCProgram.curwin.getW_cursor().decl();
				} 
			}  else if () {
				start_pos.find_first_blank();
			} 
		} 
		if (VIsual_active) {
			if (((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) {
				;
			} 
			if (ModernizedCProgram.p_sel == (byte)'e') {
				++generatedCol;
			} 
			ModernizedCProgram.VIsual = start_pos;
			VIsual_mode = (byte)'v';
			redraw_cmdline = /* show mode later */1;
			ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
		} else {
				if (ModernizedCProgram.curwin.getW_cursor().incl() == -/* include a newline after the sentence, if there is one */1) {
					this.setInclusive(1);
				} else {
						this.setInclusive(0);
				} 
				this.setStart(start_pos);
				this.setMotion_type(0);
		} 
		return 1/*
		 * Find block under the cursor, cursor at end.
		 * "what" and "other" are two matching parenthesis/brace/etc.
		 */;
	}
	public int current_block(long count, int include, int what, int other) {
		/* '(', '{', etc. *//* ')', '}', etc. */pos_T old_pos = new pos_T();
		pos_T pos = ((Object)0);
		pos_T start_pos = new pos_T();
		pos_T end_pos = new pos_T();
		pos_T old_start = new pos_T();
		pos_T old_end = new pos_T();
		char_u save_cpo = new char_u();
		int sol = /* '{' at start of line */0;
		old_pos = ModernizedCProgram.curwin.getW_cursor();
		old_end = ModernizedCProgram.curwin.getW_cursor();
		old_start = old_end/*
		     * If we start on '(', '{', ')', '}', etc., use the whole block inclusive.
		     */;
		if (!VIsual_active || (((ModernizedCProgram.VIsual).getLnum() == (ModernizedCProgram.curwin.getW_cursor()).getLnum()) && ((ModernizedCProgram.VIsual).getCol() == (ModernizedCProgram.curwin.getW_cursor()).getCol()) && ((ModernizedCProgram.VIsual).getColadd() == (ModernizedCProgram.curwin.getW_cursor()).getColadd()))) {
			ModernizedCProgram.setpcmark();
			if (what == /* ignore indent */(byte)'{') {
				while (ModernizedCProgram.inindent(1)) {
					if (ModernizedCProgram.inc_cursor() != 0) {
						break;
					} 
				}
			} 
			if (ModernizedCProgram.gchar_cursor() == what) {
				++ModernizedCProgram.curwin.getW_cursor().getCol();
			} 
		}  else if ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
			old_start = ModernizedCProgram.VIsual;
			ModernizedCProgram.curwin.setW_cursor(/* cursor at low end of Visual */ModernizedCProgram.VIsual);
		} else {
				old_end = ModernizedCProgram.VIsual/*
				     * Search backwards for unclosed '(', '{', etc..
				     * Put this position in start_pos.
				     * Ignore quotes here.  Keep the "M" flag in 'cpo', as that is what the
				     * user wants.
				     */;
		} 
		save_cpo = ModernizedCProgram.p_cpo;
		ModernizedCProgram.p_cpo = (char_u)(ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'M') != ((Object)0) ? "%M" : "%");
		while (count-- > 0) {
			if ((pos = ((Object)0).findmatch(what)) == ((Object)0)) {
				break;
			} 
			ModernizedCProgram.curwin.setW_cursor(pos);
			start_pos = /* the findmatch for end_pos will overwrite *pos */pos;
		}
		ModernizedCProgram.p_cpo = save_cpo/*
		     * Search for matching ')', '}', etc.
		     * Put this position in curwin->w_cursor.
		     */;
		if (pos == ((Object)0) || (end_pos = ((Object)0).findmatch(other)) == ((Object)0)) {
			ModernizedCProgram.curwin.setW_cursor(old_pos);
			return 0;
		} 
		ModernizedCProgram.curwin.setW_cursor(end_pos/*
		     * Try to exclude the '(', '{', ')', '}', etc. when "include" is FALSE.
		     * If the ending '}', ')' or ']' is only preceded by indent, skip that
		     * indent.  But only if the resulting area is not smaller than what we
		     * started with.
		     */);
		Object generatedLnum = (start_pos).getLnum();
		Object generatedCol = (start_pos).getCol();
		Object generatedColadd = (start_pos).getColadd();
		while (!include) {
			start_pos.incl();
			sol = (ModernizedCProgram.curwin.getW_cursor().getCol() == 0);
			ModernizedCProgram.curwin.getW_cursor().decl();
			while (ModernizedCProgram.inindent(1)) {
				sol = 1;
				if (ModernizedCProgram.curwin.getW_cursor().decl() != 0) {
					break;
				} 
			}
			if (!((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) && !((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) && VIsual_active) {
				ModernizedCProgram.curwin.setW_cursor(old_start);
				ModernizedCProgram.curwin.getW_cursor().decl();
				if ((pos = ((Object)0).findmatch(what)) == ((Object)0)) {
					ModernizedCProgram.curwin.setW_cursor(old_pos);
					return 0;
				} 
				start_pos = pos;
				ModernizedCProgram.curwin.setW_cursor(pos);
				if ((end_pos = ((Object)0).findmatch(other)) == ((Object)0)) {
					ModernizedCProgram.curwin.setW_cursor(old_pos);
					return 0;
				} 
				ModernizedCProgram.curwin.setW_cursor(end_pos);
			} else {
					break;
			} 
		}
		if (VIsual_active) {
			if (ModernizedCProgram.p_sel == (byte)'e') {
				ModernizedCProgram.curwin.getW_cursor().inc();
			} 
			if (sol && ModernizedCProgram.gchar_cursor() != (byte)'\000') {
				ModernizedCProgram.curwin.getW_cursor().inc();
			} 
			ModernizedCProgram.VIsual = start_pos;
			VIsual_mode = (byte)'v';
			ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
			.showmode();
		} else {
				this.setStart(start_pos);
				this.setMotion_type(0);
				this.setInclusive(0);
				if (sol) {
					ModernizedCProgram.curwin.getW_cursor().incl();
				}  else if ((((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) || ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd)))) {
					this.setInclusive(/* Include the character under the cursor. */1);
				} else {
						ModernizedCProgram.curwin.setW_cursor(/* End is before the start (no text in between <>, [], etc.): don't
							     * operate on any text. */start_pos);
				} 
		} 
		return 1/*
		 * Return TRUE if the cursor is on a "<aaa>" tag.  Ignore "<aaa/>".
		 * When "end_tag" is TRUE return TRUE if the cursor is on "</aaa>".
		 */;
	}
	/* TRUE == include white space */
	public int current_tagblock(long count_arg, int include) {
		long count = /* TRUE == include white space */count_arg;
		long n;
		pos_T old_pos = new pos_T();
		pos_T start_pos = new pos_T();
		pos_T end_pos = new pos_T();
		pos_T old_start = new pos_T();
		pos_T old_end = new pos_T();
		char_u spat = new char_u();
		char_u epat = new char_u();
		char_u p = new char_u();
		char_u cp = new char_u();
		int len;
		int r;
		int do_include = include;
		int save_p_ws = ModernizedCProgram.p_ws;
		int retval = 0;
		int is_inclusive = 1;
		ModernizedCProgram.p_ws = 0;
		old_pos = ModernizedCProgram.curwin.getW_cursor();
		old_end = ModernizedCProgram.curwin.getW_cursor();
		old_start = old_end;
		if (!VIsual_active || ModernizedCProgram.p_sel == (byte)'e') {
			/* old_end is inclusive */old_end/*
			     * If we start on "<aaa>" select that block.
			     */.decl();
		} 
		if (!VIsual_active || (((ModernizedCProgram.VIsual).getLnum() == (ModernizedCProgram.curwin.getW_cursor()).getLnum()) && ((ModernizedCProgram.VIsual).getCol() == (ModernizedCProgram.curwin.getW_cursor()).getCol()) && ((ModernizedCProgram.VIsual).getColadd() == (ModernizedCProgram.curwin.getW_cursor()).getColadd()))) {
			ModernizedCProgram.setpcmark();
			while (ModernizedCProgram.inindent(/* ignore indent */1)) {
				if (ModernizedCProgram.inc_cursor() != 0) {
					break;
				} 
			}
			if (ModernizedCProgram.in_html_tag(0)) {
				while (ModernizedCProgram.ml_get_cursor() != /* cursor on start tag, move to its '>' */(byte)'>') {
					if (ModernizedCProgram.inc_cursor() < 0) {
						break;
					} 
				}
			}  else if (ModernizedCProgram.in_html_tag(1)) {
				while (ModernizedCProgram.ml_get_cursor() != /* cursor on end tag, move to just before it */(byte)'<') {
					if (ModernizedCProgram.dec_cursor() < 0) {
						break;
					} 
				}
				ModernizedCProgram.dec_cursor();
				old_end = ModernizedCProgram.curwin.getW_cursor();
			} 
		}  else if ((((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd())) {
			old_start = ModernizedCProgram.VIsual;
			ModernizedCProgram.curwin.setW_cursor(/* cursor at low end of Visual */ModernizedCProgram.VIsual);
		} else {
				old_end = ModernizedCProgram.VIsual;
		} 
		start_pos = ModernizedCProgram.curwin.getW_cursor();
		ModernizedCProgram.inc_cursor();
		p = ModernizedCProgram.ml_get_cursor();
		for (cp = p; cp != (byte)'\000' && cp != (byte)'>' && !((cp) == (byte)' ' || (cp) == (byte)'\t'); cp += .UNRECOGNIZEDFUNCTIONNAME(cp)) {
			;
		}
		len = (int)(cp - p);
		if (len == 0) {
			ModernizedCProgram.curwin.setW_cursor(old_pos);
			;
		} 
		spat = ModernizedCProgram.alloc(len + 31);
		epat = ModernizedCProgram.alloc(len + 9);
		if (spat == ((Object)0) || epat == ((Object)0)) {
			ModernizedCProgram.vim_free(spat);
			ModernizedCProgram.vim_free(epat);
			ModernizedCProgram.curwin.setW_cursor(old_pos);
			;
		} 
		.sprintf((byte)spat, "<%.*s\\>\\%%(\\s\\_[^>]\\{-}[^/]>\\|>\\)\\c", len, p);
		.sprintf((byte)epat, "</%.*s>\\c", len, p);
		r = ((Object)0).do_searchpair(spat, (char_u)"", epat, 1, 0, ((Object)0), (linenr_T)0, -1024);
		ModernizedCProgram.vim_free(spat);
		ModernizedCProgram.vim_free(epat);
		Object generatedLnum = (old_end).getLnum();
		Object generatedCol = (old_end).getCol();
		Object generatedColadd = (old_end).getColadd();
		if (r < 1 || (((ModernizedCProgram.curwin.getW_cursor()).getLnum() != generatedLnum) ? generatedLnum < generatedLnum : (ModernizedCProgram.curwin.getW_cursor()).getCol() != generatedCol ? generatedCol < generatedCol : (ModernizedCProgram.curwin.getW_cursor()).getColadd() < generatedColadd)) {
			count = 1;
			ModernizedCProgram.curwin.setW_cursor(start_pos);
			;
		} 
		if (do_include) {
			while (ModernizedCProgram.ml_get_cursor() != /* Include up to the '>'. */(byte)'>') {
				if (ModernizedCProgram.inc_cursor() < 0) {
					break;
				} 
			}
		} else {
				char_u c = ModernizedCProgram.ml_get_cursor();
				if (c == (byte)'<' && !VIsual_active && generatedCol == 0) {
					is_inclusive = /* do not decrement cursor */0;
				}  else if (c == (byte)'<') {
					ModernizedCProgram.dec_cursor();
				} 
		} 
		end_pos = ModernizedCProgram.curwin.getW_cursor();
		if (!do_include) {
			ModernizedCProgram.curwin.setW_cursor(/* Exclude the start tag. */start_pos);
			while (ModernizedCProgram.inc_cursor() >= 0) {
				if (ModernizedCProgram.ml_get_cursor() == (byte)'>') {
					ModernizedCProgram.inc_cursor();
					start_pos = ModernizedCProgram.curwin.getW_cursor();
					break;
				} 
			}
			ModernizedCProgram.curwin.setW_cursor(end_pos);
			if (VIsual_active && ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd)) && ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) {
				do_include = 1;
				ModernizedCProgram.curwin.setW_cursor(old_start);
				count = count_arg;
				;
			} 
		} 
		if (VIsual_active) {
			if (((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
				ModernizedCProgram.curwin.setW_cursor(start_pos);
			}  else if (ModernizedCProgram.p_sel == (byte)'e') {
				ModernizedCProgram.inc_cursor();
			} 
			ModernizedCProgram.VIsual = start_pos;
			VIsual_mode = (byte)'v';
			ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
			.showmode();
		} else {
				this.setStart(start_pos);
				this.setMotion_type(0);
				if (((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
					ModernizedCProgram.curwin.setW_cursor(/* End is before the start: there is no text between tags; operate
						     * on an empty area. */start_pos);
					this.setInclusive(0);
				} else {
						this.setInclusive(is_inclusive);
				} 
		} 
		retval = 1;
		return retval;
	}
	public int current_par(long count, int include, int type) {
		/* TRUE == include white space *//* 'p' for paragraph, 'S' for section */linenr_T start_lnum = new linenr_T();
		linenr_T end_lnum = new linenr_T();
		int white_in_front;
		int dir;
		int start_is_white;
		int prev_start_is_white;
		int retval = 1;
		int do_white = 0;
		int t;
		int i;
		if (type == /* not implemented yet */(byte)'S') {
			return 0;
		} 
		start_lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
		white_in_front = ModernizedCProgram.linewhite(/*
		     * First move back to the start_lnum of the paragraph or white lines
		     */start_lnum);
		while (start_lnum > 1) {
			if (/* stop at first white line */white_in_front) {
				if (!ModernizedCProgram.linewhite(start_lnum - 1)) {
					break;
				} 
			} else {
					if (ModernizedCProgram.linewhite(start_lnum - 1) || ModernizedCProgram.startPS(start_lnum, 0, /* stop at first non-white line of start of paragraph */0)) {
						break;
					} 
			} 
			--start_lnum;
		}
		end_lnum = /*
		     * Move past the end of any white lines.
		     */start_lnum;
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		while (end_lnum <= generatedMl_line_count && ModernizedCProgram.linewhite(end_lnum)) {
			++end_lnum;
		}
		--end_lnum;
		i = count;
		if (!include && white_in_front) {
			--i;
		} 
		while (i--) {
			if (end_lnum == generatedMl_line_count) {
				return 0;
			} 
			if (!include) {
				do_white = ModernizedCProgram.linewhite(end_lnum + 1);
			} 
			if (include || !do_white) {
				++end_lnum/*
					     * skip to end of paragraph
					     */;
				while (end_lnum < generatedMl_line_count && !ModernizedCProgram.linewhite(end_lnum + 1) && !ModernizedCProgram.startPS(end_lnum + 1, 0, 0)) {
					++end_lnum;
				}
			} 
			if (i == 0 && white_in_front && include) {
				break;
			} 
			if (include || do_white) {
				while (end_lnum < generatedMl_line_count && ModernizedCProgram.linewhite(end_lnum + 1)) {
					++end_lnum/*
					     * If there are no empty lines at the end, try to find some empty lines at
					     * the start (unless that has been done already).
					     */;
				}
			} 
		}
		if (!white_in_front && !ModernizedCProgram.linewhite(end_lnum) && include) {
			while (start_lnum > 1 && ModernizedCProgram.linewhite(start_lnum - 1)) {
				--start_lnum;
			}
		} 
		 generatedStart = this.getStart();
		if (VIsual_active) {
			if (VIsual_mode == (byte)'V' && start_lnum == ModernizedCProgram.curwin.getW_cursor().getLnum()) {
				;
			} 
			if (ModernizedCProgram.VIsual.getLnum() != start_lnum) {
				ModernizedCProgram.VIsual.setLnum(start_lnum);
				ModernizedCProgram.VIsual.setCol(0);
			} 
			VIsual_mode = (byte)'V';
			ModernizedCProgram.redraw_curbuf_later(/* update the inversion */20);
			.showmode();
		} else {
				generatedStart.setLnum(start_lnum);
				generatedStart.setCol(0);
				this.setMotion_type(1);
		} 
		ModernizedCProgram.curwin.getW_cursor().setLnum(end_lnum);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		return 1/*
		 * Search quote char from string line[col].
		 * Quote character escaped by one of the characters in "escape" is not counted
		 * as a quote.
		 * Returns column number of "quotechar" or -1 when not found.
		 */;
	}
	public int current_quote(long count, int include, int quotechar) {
		char_u line = ModernizedCProgram.ml_get_curline();
		int col_end;
		int col_start = ModernizedCProgram.curwin.getW_cursor().getCol();
		int inclusive = 0;
		// Visual selection <= 1 charint vis_empty = 1;
		// Visual starts before cursorint vis_bef_curs = 0;
		// Looks like "i'" done beforeint inside_quotes = 0;
		// Has quote inside selectionint selected_quote = 0;
		int i;
		// restore VIsual on abortint restore_vis_bef = 0;
		if (/* Correct cursor when 'selection' is "exclusive". */VIsual_active) {
			if (ModernizedCProgram.VIsual.getLnum() != ModernizedCProgram.curwin.getW_cursor().getLnum()) {
				return 0;
			} 
			vis_bef_curs = (((ModernizedCProgram.VIsual).getLnum() != (ModernizedCProgram.curwin.getW_cursor()).getLnum()) ? (ModernizedCProgram.VIsual).getLnum() < (ModernizedCProgram.curwin.getW_cursor()).getLnum() : (ModernizedCProgram.VIsual).getCol() != (ModernizedCProgram.curwin.getW_cursor()).getCol() ? (ModernizedCProgram.VIsual).getCol() < (ModernizedCProgram.curwin.getW_cursor()).getCol() : (ModernizedCProgram.VIsual).getColadd() < (ModernizedCProgram.curwin.getW_cursor()).getColadd());
			if (ModernizedCProgram.p_sel == (byte)'e') {
				if (!vis_bef_curs) {
					pos_T t = ModernizedCProgram.curwin.getW_cursor();
					ModernizedCProgram.curwin.setW_cursor(ModernizedCProgram.VIsual);
					ModernizedCProgram.VIsual = t;
					vis_bef_curs = 1;
					restore_vis_bef = 1;
				} 
				ModernizedCProgram.dec_cursor();
			} 
			vis_empty = (((ModernizedCProgram.VIsual).getLnum() == (ModernizedCProgram.curwin.getW_cursor()).getLnum()) && ((ModernizedCProgram.VIsual).getCol() == (ModernizedCProgram.curwin.getW_cursor()).getCol()) && ((ModernizedCProgram.VIsual).getColadd() == (ModernizedCProgram.curwin.getW_cursor()).getColadd()));
		} 
		if (!vis_empty) {
			if (/* Check if the existing selection exactly spans the text inside
				 * quotes. */vis_bef_curs) {
				inside_quotes = ModernizedCProgram.VIsual.getCol() > 0 && line[ModernizedCProgram.VIsual.getCol() - 1] == quotechar && line[ModernizedCProgram.curwin.getW_cursor().getCol()] != (byte)'\000' && line[ModernizedCProgram.curwin.getW_cursor().getCol() + 1] == quotechar;
				i = ModernizedCProgram.VIsual.getCol();
				col_end = ModernizedCProgram.curwin.getW_cursor().getCol();
			} else {
					inside_quotes = ModernizedCProgram.curwin.getW_cursor().getCol() > 0 && line[ModernizedCProgram.curwin.getW_cursor().getCol() - 1] == quotechar && line[ModernizedCProgram.VIsual.getCol()] != (byte)'\000' && line[ModernizedCProgram.VIsual.getCol() + 1] == quotechar;
					i = ModernizedCProgram.curwin.getW_cursor().getCol();
					col_end = ModernizedCProgram.VIsual.getCol();
			} 
			while (i <= /* Find out if we have a quote in the selection. */col_end) {
				if (line[i++] == quotechar) {
					selected_quote = 1;
					break;
				} 
			}
		} 
		Object generatedB_p_qe = curbuf.getB_p_qe();
		if (!vis_empty && line[col_start] == quotechar) {
			if (/* Already selecting something and on a quote character.  Find the
				 * next quoted string. */vis_bef_curs) {
				col_start = ModernizedCProgram.find_next_quote(line, col_start + 1, quotechar, ((Object)/* Assume we are on a closing quote: move to after the next
					     * opening quote. */0));
				if (col_start < 0) {
					;
				} 
				col_end = ModernizedCProgram.find_next_quote(line, col_start + 1, quotechar, generatedB_p_qe);
				if (col_end < 0) {
					col_end = /* We were on a starting quote perhaps? */col_start;
					col_start = ModernizedCProgram.curwin.getW_cursor().getCol();
				} 
			} else {
					col_end = ModernizedCProgram.find_prev_quote(line, col_start, quotechar, ((Object)0));
					if (line[col_end] != quotechar) {
						;
					} 
					col_start = ModernizedCProgram.find_prev_quote(line, col_end, quotechar, generatedB_p_qe);
					if (line[col_start] != quotechar) {
						col_start = /* We were on an ending quote perhaps? */col_end;
						col_end = ModernizedCProgram.curwin.getW_cursor().getCol();
					} 
			} 
		}  else if (line[col_start] == quotechar || !vis_empty) {
			int first_col = col_start;
			if (!vis_empty) {
				if (vis_bef_curs) {
					first_col = ModernizedCProgram.find_next_quote(line, col_start, quotechar, ((Object)0));
				} else {
						first_col = ModernizedCProgram.find_prev_quote(line, col_start, quotechar, ((Object)0/* The cursor is on a quote, we don't know if it's the opening or
							 * closing quote.  Search from the start of the line to find out.
							 * Also do this when there is a Visual area, a' may leave the cursor
							 * in between two strings. */));
				} 
			} 
			col_start = 0;
			for (; ; ) {
				col_start = ModernizedCProgram.find_next_quote(line, col_start, quotechar, ((Object)/* Find open quote character. */0));
				if (col_start < 0 || col_start > first_col) {
					;
				} 
				col_end = ModernizedCProgram.find_next_quote(line, col_start + 1, /* Find close quote character. */quotechar, generatedB_p_qe);
				if (col_end < 0) {
					;
				} 
				if (col_start <= first_col && first_col <= col_end) {
					break;
				} 
				col_start = col_end + 1;
			}
		} else {
				col_start = ModernizedCProgram.find_prev_quote(line, col_start, quotechar, generatedB_p_qe);
				if (line[col_start] != quotechar) {
					col_start = ModernizedCProgram.find_next_quote(line, col_start, quotechar, ((Object)/* No quote before the cursor, look after the cursor. */0));
					if (col_start < 0) {
						;
					} 
				} 
				col_end = ModernizedCProgram.find_next_quote(line, col_start + 1, /* Find close quote character. */quotechar, generatedB_p_qe);
				if (col_end < 0) {
					;
				} 
		} 
		if (/* When "include" is TRUE, include spaces after closing quote or before
		     * the starting quote. */include) {
			if (((line[col_end + 1]) == (byte)' ' || (line[col_end + 1]) == (byte)'\t')) {
				while (((line[col_end + 1]) == (byte)' ' || (line[col_end + 1]) == (byte)'\t')) {
					++col_end;
				}
			} else {
					while (col_start > 0 && ((line[col_start - 1]) == (byte)' ' || (line[col_start - 1]) == (byte)'\t')) {
						--col_start;
					}
			} 
		} 
		if (!include && count < 2 && (vis_empty || !/* Set start position.  After vi" another i" must include the ".
		     * For v2i" include the quotes. */inside_quotes)) {
			++col_start;
		} 
		ModernizedCProgram.curwin.getW_cursor().setCol(col_start);
		if (VIsual_active/* Set the start of the Visual area when the Visual area was empty, we
			 * were just inside quotes or the Visual area didn't start at a quote
			 * and didn't include a quote.
			 */) {
			if (vis_empty || (vis_bef_curs && !selected_quote && (inside_quotes || (line[ModernizedCProgram.VIsual.getCol()] != quotechar && (ModernizedCProgram.VIsual.getCol() == 0 || line[ModernizedCProgram.VIsual.getCol() - 1] != quotechar))))) {
				ModernizedCProgram.VIsual = ModernizedCProgram.curwin.getW_cursor();
				ModernizedCProgram.redraw_curbuf_later(20);
			} 
		} else {
				this.setStart(ModernizedCProgram.curwin.getW_cursor());
				this.setMotion_type(0);
		} 
		ModernizedCProgram.curwin.getW_cursor().setCol(/* Set end position. */col_end);
		if ((include || count > /* After vi" another i" must include the ". */1 || (!vis_empty && inside_quotes)) && ModernizedCProgram.inc_cursor() == 2) {
			inclusive = 1;
		} 
		if (VIsual_active) {
			if (vis_empty || vis_bef_curs) {
				if (ModernizedCProgram.p_sel != /* decrement cursor when 'selection' is not exclusive */(byte)'e') {
					ModernizedCProgram.dec_cursor();
				} 
			} else {
					if (/* Cursor is at start of Visual area.  Set the end of the Visual
						     * area when it was just inside quotes or it didn't end at a
						     * quote. */inside_quotes || (!selected_quote && line[ModernizedCProgram.VIsual.getCol()] != quotechar && (line[ModernizedCProgram.VIsual.getCol()] == (byte)'\000' || line[ModernizedCProgram.VIsual.getCol() + 1] != quotechar))) {
						ModernizedCProgram.dec_cursor();
						ModernizedCProgram.VIsual = ModernizedCProgram.curwin.getW_cursor();
					} 
					ModernizedCProgram.curwin.getW_cursor().setCol(col_start);
			} 
			if (VIsual_mode == (byte)'V') {
				VIsual_mode = (byte)'v';
				redraw_cmdline = /* show mode later */1;
			} 
		} else {
				this.setInclusive(/* Set inclusive and other oap's flags. */inclusive);
		} 
		return 1;
		return 0;
	}
	public void op_reindent(Object how) {
		long i;
		char_u l = new char_u();
		int amount;
		linenr_T first_changed = 0;
		linenr_T last_changed = 0;
		linenr_T start_lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
		int generatedB_p_ma = curbuf.getB_p_ma();
		// Don't even try when 'modifiable' is off.if (!generatedB_p_ma) {
			ModernizedCProgram.emsg(((byte)(e_modifiable)));
			return ;
		} 
		long generatedLine_count = this.getLine_count();
		for (i = generatedLine_count; --i >= 0 && !got_int; ) {
			if (i > 1 && (i % 50 == 0 || i == generatedLine_count - 1) && generatedLine_count > ModernizedCProgram.p_report) {
				ModernizedCProgram.smsg(((byte)("%ld lines to indent... ")), i);
			} 
			if (i != generatedLine_count - 1 || generatedLine_count == 1 || how != get_lisp_indent) {
				l = ModernizedCProgram.skipwhite(ModernizedCProgram.ml_get_curline());
				if (l == (byte)'\000') {
					amount = 0;
				} else {
						amount = .how();
				} 
				if (amount >= 0 && ModernizedCProgram.set_indent(amount, 4)) {
					if (first_changed == 0) {
						first_changed = ModernizedCProgram.curwin.getW_cursor().getLnum();
					} 
					last_changed = ModernizedCProgram.curwin.getW_cursor().getLnum();
				} 
			} 
			++ModernizedCProgram.curwin.getW_cursor().getLnum();
			ModernizedCProgram.curwin.getW_cursor().setCol(0);
		}// it's a slow thing to do, so give feedback so there's no worry that
		// put cursor on first non-blank of indented line// put cursor on first non-blank of indented lineModernizedCProgram.curwin.getW_cursor().setLnum(start_lnum);
		ModernizedCProgram.beginline(2 | 4)// Mark changed lines so that they will be redrawn.  When Visual;// Mark changed lines so that they will be redrawn.  When Visual
		int generatedIs_VIsual = this.getIs_VIsual();
		// highlighting was present, need to continue until the last line.  When// there is no change still need to remove the Visual highlighting.if (last_changed != 0) {
			ModernizedCProgram.changed_lines(first_changed, 0, generatedIs_VIsual ? start_lnum + generatedLine_count : last_changed + 1, -1024);
		}  else if (generatedIs_VIsual) {
			ModernizedCProgram.redraw_curbuf_later(20);
		} 
		if (generatedLine_count > ModernizedCProgram.p_report) {
			i = generatedLine_count - (i + 1);
			ModernizedCProgram.smsg((((i) == 1) ? (byte)("%ld line indented ") : (byte)("%ld lines indented ")), i);
		} 
		 generatedStart = this.getStart();
		// set '[ and '] marks// set '[ and '] markscurbuf.setB_op_start(generatedStart);
		 generatedEnd = this.getEnd();
		curbuf.setB_op_end(generatedEnd)// defined(FEAT_LISP) || defined(FEAT_CINDENT);// defined(FEAT_LISP) || defined(FEAT_CINDENT)
	}
	public void normal_cmd(int toplevel) {
		/* TRUE when called from main() *//* command arguments */cmdarg_T ca = new cmdarg_T();
		int c;
		int ctrl_w = /* got CTRL-W command */0;
		int old_col = ModernizedCProgram.curwin.getW_curswant();
		/* need to call out_flush() */int need_flushbuf;
		/* cursor position before command */pos_T old_pos = new pos_T();
		int mapped_len;
		int old_mapped_len = 0;
		int idx;
		int set_prevcount = 0;
		.memset((ca), (false), ());
		ca.setOap(oap/* Use a count remembered from before entering an operator.  After typing
		     * "3d" we return from normal_cmd() and come back here, the "3" is
		     * remembered in "opcount". */);
		ca.setOpcount(opcount/*
		     * If there is an operator pending, then the command we take this time
		     * will terminate it. Finish_op tells us to finish the operation before
		     * returning this time (unless the operation was cancelled).
		     */);
		c = finish_op;
		int generatedOp_type = this.getOp_type();
		finish_op = (generatedOp_type != 0);
		if (finish_op != c) {
			ModernizedCProgram.ui_cursor_shape();
		} 
		int generatedRegname = this.getRegname();
		if (!finish_op && !generatedRegname) {
			ca.setOpcount(0);
			set_prevcount = 1;
		} 
		long generatedPrev_opcount = this.getPrev_opcount();
		long generatedPrev_count0 = this.getPrev_count0();
		if (generatedPrev_opcount > 0 || generatedPrev_count0 > /* Restore counts from before receiving K_CURSORHOLD.  This means after
		     * typing "3", handling K_CURSORHOLD and then typing "2" we get "32", not
		     * "3 * 2". */0) {
			ca.setOpcount(generatedPrev_opcount);
			ca.setCount0(generatedPrev_count0);
			this.setPrev_opcount(0);
			this.setPrev_count0(0);
		} 
		mapped_len = ModernizedCProgram.typebuf_maplen();
		State = (-1024 + -1024/* allow scrolling here */);
		if (toplevel && ModernizedCProgram.readbuf1_empty()) {
			ca.set_vcount_ca(set_prevcount);
		} 
		c = ModernizedCProgram.safe_vgetc();
		do {
			if (p_langmap && (ModernizedCProgram.get_real_state() != -1024) && (p_lrm || (!p_lrm && ModernizedCProgram.KeyTyped)) && !ModernizedCProgram.KeyStuffed && (c) >= 0) {
				if ((c) < 256) {
					c = langmap_mapchar[c];
				} else {
						c = ModernizedCProgram.langmap_adjust_mb(c);
				} 
			} 
		} while (0/*
		     * If a mapping was started in Visual or Select mode, remember the length
		     * of the mapping.  This is used below to not return to Insert mode for as
		     * long as the mapping is being executed.
		     */);
		if (restart_edit == 0) {
			old_mapped_len = 0;
		}  else if (old_mapped_len || (VIsual_active && mapped_len == 0 && ModernizedCProgram.typebuf_maplen() > 0)) {
			old_mapped_len = ModernizedCProgram.typebuf_maplen();
		} 
		if (c == (byte)'\000') {
			c = (-((true) + ((int)(((byte)'X')) << 8/*
			     * In Select mode, typed text replaces the selection.
			     */)));
		} 
		if (VIsual_active && VIsual_select && (ModernizedCProgram.vim_isprintc(c) || c == (byte)'\012' || c == (byte)'\015' || c == (-(((byte)'K') + ((int)((byte)'A') << 8/* Fake a "c"hange command.  When "restart_edit" is set (e.g., because
			 * 'insertmode' is set) fake a "d"elete command, Insert mode will
			 * restart automatically.
			 * Insert the typed character in the typeahead buffer, so that it can
			 * be mapped in Insert mode.  Required for ":lmap" to work. */))))) {
			ModernizedCProgram.ins_char_typebuf(c);
			if (restart_edit != 0) {
				c = (byte)'d';
			} else {
					c = (byte)'c';
			} 
			msg_nowait = /* don't delay going to insert mode */1;
			old_mapped_len = /* do go to Insert mode */0;
		} 
		need_flushbuf = ModernizedCProgram.add_to_showcmd(c);
		long generatedOpcount = ca.getOpcount();
		long generatedCount0 = ca.getCount0();
		if (c == (-((true) + ((int)(key_extra.KE_CURSORHOLD) << 8)))) {
			this.setPrev_opcount(generatedOpcount);
			this.setPrev_count0(generatedCount0);
		}  else if (generatedOpcount != 0/*
			 * If we're in the middle of an operator (including after entering a
			 * yank buffer with '"') AND we had a count before the operator, then
			 * that count overrides the current value of ca.count0.
			 * What this means effectively, is that commands like "3dw" get turned
			 * into "d3w" which makes things fall into place pretty neatly.
			 * If you give a count before AND after the operator, they are
			 * multiplied.
			 */) {
			if (generatedCount0) {
				generatedCount0 *= generatedOpcount;
			} else {
					ca.setCount0(generatedOpcount);
			} 
		} 
		ca.setOpcount(generatedCount0);
		ca.setCount1((generatedCount0 == 0 ? 1 : generatedCount0));
		long generatedCount1 = ca.getCount1();
		if (toplevel && ModernizedCProgram.readbuf1_empty()) {
			ModernizedCProgram.set_vcount(generatedCount0, generatedCount1, set_prevcount/*
			     * Find the command character in the table of commands.
			     * For CTRL-W we already got nchar when looking for a count.
			     */);
		} 
		if (ctrl_w) {
			ca.setNchar(c);
			ca.setCmdchar(23);
		} else {
				ca.setCmdchar(c);
		} 
		int generatedCmdchar = ca.getCmdchar();
		idx = generatedCmdchar.find_command();
		if (idx < 0) {
			/* Not a known command: beep. */oap.clearopbeep();
			;
		} 
		if (ModernizedCProgram.text_locked() && (nv_cmds[idx].getCmd_flags() & -1024)) {
			/* This command is not allowed while editing a cmdline: beep. */oap.clearopbeep();
			ModernizedCProgram.text_locked_msg();
			;
		} 
		if ((nv_cmds[idx].getCmd_flags() & -1024) && ModernizedCProgram.curbuf_locked()) {
			;
		} 
		if (VIsual_active) {
			if (/* when 'keymodel' contains "stopsel" may stop Select/Visual mode */km_stopsel && (nv_cmds[idx].getCmd_flags() & -1024) && !(mod_mask & -1024)) {
				ModernizedCProgram.end_visual_mode();
				ModernizedCProgram.redraw_curbuf_later(20);
			} 
			if (/* Keys that work different when 'keymodel' contains "startsel" */km_startsel) {
				if (nv_cmds[idx].getCmd_flags() & -1024) {
					ca.unshift_special();
					idx = generatedCmdchar.find_command();
					if (idx < 0) {
						/* Just in case */oap.clearopbeep();
						;
					} 
				}  else if ((nv_cmds[idx].getCmd_flags() & -1024) && (mod_mask & -1024)) {
					mod_mask &=  ~-1024;
				} 
			} 
		} 
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rl() && ModernizedCProgram.KeyTyped && !ModernizedCProgram.KeyStuffed && (nv_cmds[idx].getCmd_flags() & -1024/* Invert horizontal movements and operations.  Only when typed by the
			 * user directly, not when the result of a mapping or "x" translated
			 * to "dl". */)) {
			switch (generatedCmdchar) {
			case (-((true) + ((int)(key_extra.KE_C_RIGHT) << 8))):
					ca.setCmdchar((-((true) + ((int)(key_extra.KE_C_LEFT) << 8))));
					break;
			case (-(((byte)'#') + ((int)((byte)'4') << 8))):
					ca.setCmdchar((-(((byte)'%') + ((int)((byte)'i') << 8))));
					break;
			case (byte)'<':
					ca.setCmdchar((byte)'>');
					break;
			case (-((true) + ((int)(key_extra.KE_C_LEFT) << 8))):
					ca.setCmdchar((-((true) + ((int)(key_extra.KE_C_RIGHT) << 8))));
					break;
			case (-(((byte)'k') + ((int)((byte)'r') << 8))):
					ca.setCmdchar((-(((byte)'k') + ((int)((byte)'l') << 8))));
					break;
			case (-(((byte)'%') + ((int)((byte)'i') << 8))):
					ca.setCmdchar((-(((byte)'#') + ((int)((byte)'4') << 8))));
					break;
			case (byte)'>':
					ca.setCmdchar((byte)'<');
					break;
			case (byte)'h':
					ca.setCmdchar((byte)'l');
					break;
			case (byte)'l':
					ca.setCmdchar((byte)'h');
					break;
			case (-(((byte)'k') + ((int)((byte)'l') << 8))):
					ca.setCmdchar((-(((byte)'k') + ((int)((byte)'r') << 8))));
					break;
			}
			idx = generatedCmdchar.find_command();
		} 
		int generatedNchar = ca.getNchar();
		int generatedExtra_char = ca.getExtra_char();
		long generatedB_p_iminsert = curbuf.getB_p_iminsert();
		oparg_S generatedOap = ca.getOap();
		int generatedNcharC1 = ca.getNcharC1();
		if ((nv_cmds[idx].getCmd_flags() & /*
		     * Get an additional character if we need one.
		     */-1024) && (((nv_cmds[idx].getCmd_flags() & (-1024 | -1024)) == (-1024 | -1024) && generatedOp_type == 0) || (nv_cmds[idx].getCmd_flags() & (-1024 | -1024)) == (-1024 | -1024) || (generatedCmdchar == (byte)'q' && generatedOp_type == 0 && reg_recording == 0 && reg_executing == 0) || ((generatedCmdchar == (byte)'a' || generatedCmdchar == (byte)'i') && (generatedOp_type != 0 || VIsual_active)))) {
			int cp;
			int repl = /* get character for replace mode */0;
			int lit = /* get extra character literally */0;
			int langmap_active = /* using :lmap mappings */0;
			int lang;
			int save_smd;
			++no_mapping;
			++/* no mapping for nchar, but allow key codes */allow_keys/* Don't generate a CursorHold event here, most commands can't handle
				 * it, e.g., nv_replace(), nv_csearch(). */;
			did_cursorhold = 1;
			if (generatedCmdchar == (byte)'g'/*
				     * For 'g' get the next character now, so that we can check for
				     * "gr", "g'" and "g`".
				     */) {
				ca.setNchar(ModernizedCProgram.plain_vgetc());
				do {
					if (p_langmap && (true) && (p_lrm || (!p_lrm && ModernizedCProgram.KeyTyped)) && !ModernizedCProgram.KeyStuffed && (generatedNchar) >= 0) {
						if ((generatedNchar) < 256) {
							ca.setNchar(langmap_mapchar[generatedNchar]);
						} else {
								ca.setNchar(ModernizedCProgram.langmap_adjust_mb(generatedNchar));
						} 
					} 
				} while (0);
				need_flushbuf |=  ModernizedCProgram.add_to_showcmd(generatedNchar);
				if (generatedNchar == (byte)'r' || generatedNchar == (byte)'\'' || generatedNchar == (byte)'`' || generatedNchar == 28) {
					cp = generatedExtra_char;
					if (generatedNchar != (byte)'r') {
						lit = /* get it literally */1;
					} else {
							repl = /* get it in replace mode */1;
					} 
				} else {
						cp = ((Object)/* no third character needed */0);
				} 
			} else {
					if (generatedCmdchar == /* get it in replace mode */(byte)'r') {
						repl = 1;
					} 
					cp = generatedNchar;
			} 
			lang = (repl || (nv_cmds[idx].getCmd_flags() & -1024/*
				 * Get a second or third character.
				 */));
			if (cp != ((Object)0)) {
				if (repl) {
					State = (-1024 + /* pretend Replace mode */-1024);
					ModernizedCProgram.ui_cursor_shape();
				} 
				if (lang && generatedB_p_iminsert == 1) {
					--/* Allow mappings defined with ":lmap". */no_mapping;
					--allow_keys;
					if (repl) {
						State = (-1024 + -1024);
					} else {
							State = -1024;
					} 
					langmap_active = 1;
				} 
				save_smd = ModernizedCProgram.p_smd;
				ModernizedCProgram.p_smd = /* Don't let the IM code show the mode here */0;
				if (lang && generatedB_p_iminsert == 2) {
					ModernizedCProgram.im_set_active(1);
				} 
				cp = ModernizedCProgram.plain_vgetc();
				if (langmap_active) {
					++/* Undo the decrement done above */no_mapping;
					++allow_keys;
					State = (-1024 + -1024);
				} 
				if (lang) {
					if (generatedB_p_iminsert != 1) {
						ModernizedCProgram.im_save_status(generatedB_p_iminsert);
					} 
					ModernizedCProgram.im_set_active(0);
				} 
				ModernizedCProgram.p_smd = save_smd;
				State = (-1024 + -1024);
				need_flushbuf |=  ModernizedCProgram.add_to_showcmd(cp);
				if (!lit) {
					if (cp == /* Typing CTRL-K gets a digraph. */11 && ((nv_cmds[idx].getCmd_flags() & -1024) || cp == generatedExtra_char) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'D') == ((Object)0)) {
						c = ModernizedCProgram.get_digraph(0);
						if (c > 0) {
							cp = c;
							ModernizedCProgram.del_from_showcmd(/* Guessing how to update showcmd here... */3);
							need_flushbuf |=  ModernizedCProgram.add_to_showcmd(cp);
						} 
					} 
					do {
						if (p_langmap && (!lang) && (p_lrm || (!p_lrm && ModernizedCProgram.KeyTyped)) && !ModernizedCProgram.KeyStuffed && (cp) >= 0) {
							if ((cp) < 256) {
								cp = langmap_mapchar[cp];
							} else {
									cp = ModernizedCProgram.langmap_adjust_mb(cp);
							} 
						} 
					} while (/* adjust chars > 127, except after "tTfFr" commands */0);
					if (p_hkmap && lang && /* adjust Hebrew mapped char */ModernizedCProgram.KeyTyped) {
						cp = ModernizedCProgram.hkmap(cp);
					} 
				} 
				if (cp == generatedExtra_char && generatedNchar == 28 && (generatedExtra_char == 14 || generatedExtra_char == 7)) {
					ca.setCmdchar(28);
					ca.setNchar(generatedExtra_char);
					idx = generatedCmdchar.find_command();
				}  else if ((generatedNchar == (byte)'n' || generatedNchar == (byte)'N') && generatedCmdchar == (byte)'g') {
					generatedOap.setOp_type(ModernizedCProgram.get_op_type(cp, (byte)'\000'));
				}  else if (cp == 28) {
					long towait = (ModernizedCProgram.p_ttm >= 0 ? ModernizedCProgram.p_ttm : ModernizedCProgram.p_tm);
					while ((c = ModernizedCProgram.vpeekc()) <= 0 && towait > /* There is a busy wait here when typing "f<C-\>" and then
							 * something different from CTRL-N.  Can't be avoided. */-1024) {
						ModernizedCProgram.do_sleep(towait > -1024 ? -1024 : towait);
						towait -= -1024;
					}
					if (c > 0) {
						c = ModernizedCProgram.plain_vgetc();
						if (c != 14 && c != 7) {
							ModernizedCProgram.vungetc(c);
						} else {
								ca.setCmdchar(28);
								ca.setNchar(c);
								idx = generatedCmdchar.find_command();
						} 
					} 
				} 
				--/* When getting a text character and the next character is a
					     * multi-byte character, it could be a composing character.
					     * However, don't wait for it to arrive. Also, do enable mapping,
					     * because if it's put back with vungetc() it's too late to apply
					     * mapping. */no_mapping;
				while (enc_utf8 && lang && (c = ModernizedCProgram.vpeekc()) > 0 && (c >= -1024 || ModernizedCProgram.mb_bytelen_tab[ModernizedCProgram.vpeekc()] > 1)) {
					c = ModernizedCProgram.plain_vgetc();
					if (!ModernizedCProgram.utf_iscomposing(c)) {
						ModernizedCProgram.vungetc(/* it wasn't, put it back */c);
						break;
					}  else if (generatedNcharC1 == 0) {
						ca.setNcharC1(c);
					} else {
							ca.setNcharC2(c);
					} 
				}
				++no_mapping;
			} 
			--no_mapping;
			--allow_keys/*
			     * Flush the showcmd characters onto the screen so we can see them while
			     * the command is being executed.  Only do this when the shown command was
			     * actually displayed, otherwise this will slow down a lot when executing
			     * mappings.
			     */;
		} 
		if (need_flushbuf) {
			ModernizedCProgram.out_flush();
		} 
		if (generatedCmdchar != (-((true) + ((int)(key_extra.KE_IGNORE) << 8)))) {
			did_cursorhold = 0;
		} 
		State = -1024;
		if (generatedNchar == (byte)'\033') {
			oap.clearop();
			if (restart_edit == 0 && ModernizedCProgram.goto_im()) {
				restart_edit = (byte)'a';
			} 
			;
		} 
		if (generatedCmdchar != (-((true) + ((int)(key_extra.KE_IGNORE) << 8)))) {
			msg_didout = /* don't scroll screen up for normal command */0;
			ModernizedCProgram.msg_col = 0;
		} 
		old_pos = ModernizedCProgram.curwin.getW_cursor();
		if (!VIsual_active && /* When 'keymodel' contains "startsel" some keys start Select/Visual
		     * mode. */km_startsel) {
			if (nv_cmds[idx].getCmd_flags() & -1024) {
				ModernizedCProgram.start_selection();
				ca.unshift_special();
				idx = generatedCmdchar.find_command();
			}  else if ((nv_cmds[idx].getCmd_flags() & -1024) && (mod_mask & -1024)) {
				ModernizedCProgram.start_selection();
				mod_mask &=  ~-1024;
			} 
		} 
		ca.setArg(nv_cmds[idx].getCmd_arg());
		.UNRECOGNIZEDFUNCTIONNAME(ca/*
		     * If we didn't start or finish an operator, reset oap->regname, unless we
		     * need it later.
		     */);
		if (!finish_op && !generatedOp_type && (idx < 0 || !(nv_cmds[idx].getCmd_flags() & -1024))) {
			oap.clearop();
			{ 
				int regname = 0/* Adjust the register according to 'clipboard', so that when
					     * "unnamed" is present it becomes '*' or '+' instead of '"'. */;
				ModernizedCProgram.adjust_clip_reg(regname);
				ModernizedCProgram.set_reg_var(regname);
			}
		} 
		if (old_mapped_len > /* Get the length of mapped chars again after typing a count, second
		     * character or "z333<cr>". */0) {
			old_mapped_len = ModernizedCProgram.typebuf_maplen();
		} 
		ca.do_pending_operator(old_col, 0/*
		     * Wait for a moment when a message is displayed that will be overwritten
		     * by the mode message.
		     * In Visual mode and with "^O" in Insert mode, a short message will be
		     * overwritten by the mode message.  Wait a bit, until a key is hit.
		     * In Visual mode, it's more important to keep the Visual area updated
		     * than keeping a message (e.g. from a /pat search).
		     * Only do this if the command was typed, not from a mapping.
		     * Don't wait when emsg_silent is non-zero.
		     * Also wait a bit after an error message, e.g. for "^O:".
		     * Don't redraw the screen, it would remove the message.
		     */);
		Object generatedLnum = old_pos.getLnum();
		Object generatedCol = old_pos.getCol();
		int generatedRetval = ca.getRetval();
		if (((ModernizedCProgram.p_smd && msg_silent == 0 && (restart_edit != 0 || (VIsual_active && generatedLnum == generatedLnum && generatedCol == generatedCol)) && (clear_cmdline || redraw_cmdline) && (msg_didout || (msg_didany && msg_scroll)) && !msg_nowait && ModernizedCProgram.KeyTyped) || (restart_edit != 0 && !VIsual_active && (msg_scroll || emsg_on_display))) && generatedRegname == 0 && !(generatedRetval & 1) && ModernizedCProgram.stuff_empty() && ModernizedCProgram.typebuf_typed() && emsg_silent == 0 && !did_wait_return && generatedOp_type == 0) {
			int save_State = State;
			if (restart_edit != /* Draw the cursor with the right shape here */0) {
				State = -1024;
			} 
			if (must_redraw && keep_msg != ((Object)0) && !/* If need to redraw, and there is a "keep_msg", redraw before the
				 * delay */emsg_on_display) {
				char_u kmsg = new char_u();
				kmsg = keep_msg;
				keep_msg = ((Object)0);
				ModernizedCProgram.update_screen(0);
				keep_msg = kmsg;
				kmsg = ModernizedCProgram.vim_strsave(keep_msg);
				if (kmsg != ((Object)0)) {
					ModernizedCProgram.msg_attr((byte)kmsg, keep_msg_attr);
					ModernizedCProgram.vim_free(kmsg);
				} 
			} 
			.setcursor();
			ModernizedCProgram.cursor_on();
			ModernizedCProgram.out_flush();
			if (msg_scroll || emsg_on_display) {
				ModernizedCProgram.ui_delay(-1024, /* wait at least one second */1);
			} 
			ModernizedCProgram.ui_delay(-1024, /* wait up to three seconds */0);
			State = save_State;
			msg_scroll = 0;
			emsg_on_display = 0/*
			     * Finish up after executing a Normal mode command.
			     */;
		} 
		c = /* Reset finish_op, in case it was set */finish_op;
		finish_op = 0;
		if (c || generatedCmdchar == /* Redraw the cursor with another shape, if we were in Operator-pending
		     * mode or did a replace command. */(byte)'r') {
			ModernizedCProgram.ui_cursor_shape();
		} 
		if (generatedOp_type == 0 && generatedRegname == 0 && generatedCmdchar != (-((true) + ((int)(key_extra.KE_CURSORHOLD) << 8)))) {
			ModernizedCProgram.clear_showcmd();
		} 
		ModernizedCProgram.checkpcmark();
		Object generatedSearchbuf = ca.getSearchbuf();
		ModernizedCProgram.vim_free(generatedSearchbuf);
		if (has_mbyte) {
			ModernizedCProgram.mb_adjust_cursor();
		} 
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scb() && toplevel) {
			ModernizedCProgram.validate_cursor();
			ModernizedCProgram.do_check_scrollbind(1);
		} 
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_crb() && toplevel) {
			ModernizedCProgram.validate_cursor();
			ModernizedCProgram.do_check_cursorbind();
		} 
		if (generatedOp_type == /*
		     * May restart edit(), if we got here with CTRL-O in Insert mode (but not
		     * if still inside a mapping that started in Visual mode).
		     * May switch from Visual to Select mode after CTRL-O command.
		     */0 && ((restart_edit != 0 && !VIsual_active && old_mapped_len == 0) || ModernizedCProgram.restart_VIsual_select == 1) && !(generatedRetval & 1) && ModernizedCProgram.stuff_empty() && generatedRegname == 0) {
			if (ModernizedCProgram.restart_VIsual_select == 1) {
				VIsual_select = 1;
				.showmode();
				ModernizedCProgram.restart_VIsual_select = 0;
			} 
			if (restart_edit != 0 && !VIsual_active && old_mapped_len == 0) {
				(Object)ModernizedCProgram.edit(restart_edit, 0, -1024);
			} 
		} 
		if (ModernizedCProgram.restart_VIsual_select == 2) {
			ModernizedCProgram.restart_VIsual_select = 1;
		} 
		opcount = generatedOpcount;
	}
	public int checkclearop() {
		int generatedOp_type = this.getOp_type();
		if (generatedOp_type == 0) {
			return 0;
		} 
		oap.clearopbeep();
		return 1/*
		 * Check for operator or Visual active.  Clear active operator.
		 *
		 * Return TRUE if operator or Visual was active.
		 */;
	}
	public int checkclearopq() {
		int generatedOp_type = this.getOp_type();
		if (generatedOp_type == 0 && !VIsual_active) {
			return 0;
		} 
		oap.clearopbeep();
		return 1;
	}
	public void clearop() {
		this.setOp_type(0);
		this.setRegname(0);
		this.setMotion_force((byte)'\000');
		this.setUse_reg_one(0);
	}
	public void clearopbeep() {
		oap.clearop();
		ModernizedCProgram.beep_flush();
	}
	public void nv_gd(int nchar, int thisblock) {
		/* 1 for "1gd" and "1gD" */int len;
		char_u ptr = new char_u();
		int generatedOp_type = this.getOp_type();
		if ((len = ModernizedCProgram.find_ident_under_cursor(ptr, 1)) == 0 || ModernizedCProgram.find_decl(ptr, len, nchar == (byte)'d', thisblock, -1024) == 0) {
			oap.clearopbeep();
		}  else if ((fdo_flags & -1024) && ModernizedCProgram.KeyTyped && generatedOp_type == 0) {
			ModernizedCProgram.foldOpenCursor();
		} 
	}
	public int nv_screengo(int dir, long dist) {
		int linelen = ModernizedCProgram.linetabsize(ModernizedCProgram.ml_get_curline());
		int retval = 1;
		int atend = 0;
		int n;
		/* margin offset for first screen line */int col_off1;
		/* margin offset for wrapped screen line */int col_off2;
		/* text width for first screen line */int width1;
		/* test width for wrapped screen line */int width2;
		this.setMotion_type(0);
		this.setInclusive((ModernizedCProgram.curwin.getW_curswant() == INT_MAX));
		col_off1 = ModernizedCProgram.curwin_col_off();
		col_off2 = col_off1 - ModernizedCProgram.curwin_col_off2();
		width1 = ModernizedCProgram.curwin.getW_width() - col_off1;
		width2 = ModernizedCProgram.curwin.getW_width() - col_off2;
		if (width2 == 0) {
			width2 = /* avoid divide by zero */1;
		} 
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (ModernizedCProgram.curwin.getW_width() != 0/*
		       * Instead of sticking at the last character of the buffer line we
		       * try to stick in the last column of the screen.
		       */) {
			if (ModernizedCProgram.curwin.getW_curswant() == INT_MAX) {
				atend = 1;
				ModernizedCProgram.validate_virtcol();
				if (width1 <= 0) {
					ModernizedCProgram.curwin.setW_curswant(0);
				} else {
						ModernizedCProgram.curwin.setW_curswant(width1 - 1);
						if (ModernizedCProgram.curwin.getW_virtcol() > ModernizedCProgram.curwin.getW_curswant()) {
							ModernizedCProgram.curwin.getW_curswant() += ((ModernizedCProgram.curwin.getW_virtcol() - ModernizedCProgram.curwin.getW_curswant() - 1) / width2 + 1) * width2;
						} 
				} 
			} else {
					if (linelen > width1) {
						n = ((linelen - width1 - 1) / width2 + 1) * width2 + width1;
					} else {
							n = width1;
					} 
					if (ModernizedCProgram.curwin.getW_curswant() >= (colnr_T)n) {
						ModernizedCProgram.curwin.setW_curswant(n - 1);
					} 
			} 
			while (dist--) {
				if (dir == (true)) {
					if ((long)ModernizedCProgram.curwin.getW_curswant() >= width1) {
						ModernizedCProgram.curwin.getW_curswant() -= width2;
					} else {
							if (ModernizedCProgram.curwin.getW_cursor().getLnum() == /* to previous line */1) {
								retval = 0;
								break;
							} 
							--ModernizedCProgram.curwin.getW_cursor().getLnum();
							if (!(fdo_flags & /* Move to the start of a closed fold.  Don't do that when
									 * 'foldopen' contains "all": it will open in a moment. */-1024)) {
								(Object)ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)0));
							} 
							linelen = ModernizedCProgram.linetabsize(ModernizedCProgram.ml_get_curline());
							if (linelen > width1) {
								ModernizedCProgram.curwin.getW_curswant() += (((linelen - width1 - 1) / width2) + 1) * width2;
							} 
					} 
				} else {
						if (linelen > /* dir == FORWARD */width1) {
							n = ((linelen - width1 - 1) / width2 + 1) * width2 + width1;
						} else {
								n = width1;
						} 
						if (ModernizedCProgram.curwin.getW_curswant() + width2 < (colnr_T)n) {
							ModernizedCProgram.curwin.getW_curswant() += /* move forward within line */width2;
						} else {
								(Object)ModernizedCProgram.hasFolding(ModernizedCProgram.curwin.getW_cursor().getLnum(), ((Object)/* to next line *//* Move to the end of a closed fold. */0), ModernizedCProgram.curwin.getW_cursor().getLnum());
								if (ModernizedCProgram.curwin.getW_cursor().getLnum() == generatedMl_line_count) {
									retval = 0;
									break;
								} 
								ModernizedCProgram.curwin.getW_cursor().getLnum()++;
								ModernizedCProgram.curwin.getW_curswant() %= width2;
								if (ModernizedCProgram.curwin.getW_curswant() >= width1) {
									ModernizedCProgram.curwin.getW_curswant() -= width2;
								} 
								linelen = ModernizedCProgram.linetabsize(ModernizedCProgram.ml_get_curline());
						} 
				} 
			}
		} 
		if (ModernizedCProgram.virtual_active() && atend) {
			ModernizedCProgram.coladvance(INT_MAX);
		} else {
				ModernizedCProgram.coladvance(ModernizedCProgram.curwin.getW_curswant());
		} 
		if (ModernizedCProgram.curwin.getW_cursor().getCol() > 0 && ModernizedCProgram.curwin.getW_onebuf_opt().getWo_wrap()) {
			colnr_T virtcol = new colnr_T();
			ModernizedCProgram.validate_virtcol();
			virtcol = ModernizedCProgram.curwin.getW_virtcol();
			if (virtcol > (colnr_T)width1 && p_sbr != (byte)'\000') {
				virtcol -= ModernizedCProgram.vim_strsize(p_sbr);
			} 
			if (virtcol > ModernizedCProgram.curwin.getW_curswant() && (ModernizedCProgram.curwin.getW_curswant() < (colnr_T)width1 ? (ModernizedCProgram.curwin.getW_curswant() > (colnr_T)width1 / 2) : ((ModernizedCProgram.curwin.getW_curswant() - width1) % width2 > (colnr_T)width2 / 2))) {
				--ModernizedCProgram.curwin.getW_cursor().getCol();
			} 
		} 
		if (atend) {
			ModernizedCProgram.curwin.setW_curswant(/* stick in the last column */INT_MAX);
		} 
		return retval/*
		 * Handle CTRL-E and CTRL-Y commands: scroll a line up or down.
		 * cap->arg must be TRUE for CTRL-E.
		 */;
	}
	public void adjust_cursor() {
		if (ModernizedCProgram.curwin.getW_cursor().getCol() > 0 && ModernizedCProgram.gchar_cursor() == (byte)'\000' && (!VIsual_active || ModernizedCProgram.p_sel == (byte)'o') && !ModernizedCProgram.virtual_active() && (ModernizedCProgram.ve_flags & 8) == 0) {
			--ModernizedCProgram.curwin.getW_cursor().getCol();
			if (/* prevent cursor from moving on the trail byte */has_mbyte) {
				ModernizedCProgram.mb_adjust_cursor();
			} 
			this.setInclusive(1/*
			 * "0" and "^" commands.
			 * cap->arg is the argument for beginline().
			 */);
		} 
	}
	/* The cursor cannot remain on the NUL when:
	     * - the column is > 0
	     * - not in Visual mode or 'selection' is "o"
	     * - 'virtualedit' is not "all" and not "onemore".
	     */
	public int op_yank(int deleting, int mess) {
		// index in y_array[]long y_idx;
		// copy of y_currentyankreg_T curr = new yankreg_T();
		// new yank register when appendingyankreg_T newreg = new yankreg_T();
		char_u new_ptr = new char_u();
		// current line numberlinenr_T lnum = new linenr_T();
		long j;
		int generatedMotion_type = this.getMotion_type();
		int yanktype = generatedMotion_type;
		long generatedLine_count = this.getLine_count();
		long yanklines = generatedLine_count;
		 generatedEnd = this.getEnd();
		Object generatedLnum = generatedEnd.getLnum();
		linenr_T yankendlnum = generatedLnum;
		char_u p = new char_u();
		char_u pnew = new char_u();
		block_def bd = new block_def();
		int generatedRegname = this.getRegname();
		// check for read-only registerif (generatedRegname != 0 && !ModernizedCProgram.valid_yank_reg(generatedRegname, 1)) {
			ModernizedCProgram.beep_flush();
			return 0;
		} 
		// black hole: nothing to doif (generatedRegname == (byte)'_') {
			return 1;
		} 
		Object generatedAvailable = clip_star.getAvailable();
		if (!generatedAvailable && generatedRegname == (byte)'*') {
			this.setRegname(0);
		}  else if (!generatedAvailable && generatedRegname == (byte)'+') {
			this.setRegname(0);
		} 
		// op_delete() already set y_currentif (!deleting) {
			ModernizedCProgram.get_yank_register(generatedRegname, 1);
		} 
		curr = ModernizedCProgram.y_current// append to existing contents;// append to existing contents
		if (ModernizedCProgram.y_append && ModernizedCProgram.y_current.getY_array() != ((Object)0)) {
			ModernizedCProgram.y_current = newreg;
		} else {
				ModernizedCProgram.free_yank_all();
		} 
		 generatedStart = this.getStart();
		Object generatedCol = generatedStart.getCol();
		int generatedInclusive = this.getInclusive();
		int generatedIs_VIsual = this.getIs_VIsual();
		int generatedBlock_mode = this.getBlock_mode();
		// operator is not inclusive, the yank is always linewise.if (generatedMotion_type == 0 && generatedCol == 0 && !generatedInclusive && (!generatedIs_VIsual || ModernizedCProgram.p_sel == (byte)'o') && !generatedBlock_mode && generatedCol == 0 && yanklines > 1) {
			yanktype = 1;
			--yankendlnum;
			--yanklines;
		} 
		ModernizedCProgram.y_current.setY_size(yanklines);
		// set the yank register type// set the yank register typeModernizedCProgram.y_current.setY_type(yanktype);
		ModernizedCProgram.y_current.setY_width(0);
		ModernizedCProgram.y_current.setY_array(ModernizedCProgram.lalloc_clear( * yanklines, 1));
		if (ModernizedCProgram.y_current.getY_array() == ((Object)0)) {
			ModernizedCProgram.y_current = curr;
			return 0;
		} 
		ModernizedCProgram.y_current.setY_time_set(ModernizedCProgram.vim_time());
		y_idx = 0;
		lnum = generatedLnum;
		Object generatedEnd_vcol = this.getEnd_vcol();
		Object generatedStart_vcol = this.getStart_vcol();
		if (generatedBlock_mode) {
			ModernizedCProgram.y_current.setY_type(2);
			ModernizedCProgram.y_current.setY_width(generatedEnd_vcol - generatedStart_vcol);
			if (ModernizedCProgram.curwin.getW_curswant() == INT_MAX && ModernizedCProgram.y_current.getY_width() > 0) {
				ModernizedCProgram.y_current.getY_width()--;
			} 
		} 
		Object generatedColadd = generatedStart.getColadd();
		for (; lnum <= yankendlnum; ) {
			switch (ModernizedCProgram.y_current.getY_type()) {
			case 2:
					ModernizedCProgram.block_prep(oap, bd, lnum, 0);
					if (bd.yank_copy_line(y_idx) == 0) {
						;
					} 
					break;
			case 1:
					if ((ModernizedCProgram.y_current.getY_array()[y_idx] = ModernizedCProgram.vim_strsave(ModernizedCProgram.ml_get(lnum))) == ((Object)0)) {
						;
					} 
					break;
			case 0:
					{ 
						colnr_T startcol = 0;
						colnr_T endcol = INT_MAX;
						int is_oneChar = 0;
						colnr_T cs = new colnr_T();
						colnr_T ce = new colnr_T();
						p = ModernizedCProgram.ml_get(lnum);
						bd.setStartspaces(0);
						bd.setEndspaces(0);
						if (lnum == generatedLnum) {
							startcol = generatedCol;
							if (virtual_op) {
								ModernizedCProgram.getvcol(ModernizedCProgram.curwin, generatedStart, cs, ((Object)0), ce);
								if (ce != cs && generatedColadd > 0) {
									bd.setStartspaces((ce - cs + 1) - generatedColadd);
									startcol++;
								} 
							} 
						} 
						if (lnum == generatedLnum) {
							endcol = generatedCol;
							if (virtual_op) {
								ModernizedCProgram.getvcol(ModernizedCProgram.curwin, generatedEnd, cs, ((Object)0), ce);
								if (p[endcol] == (byte)'\000' || (cs + generatedColadd < ce && .UNRECOGNIZEDFUNCTIONNAME(p, p + endcol) == 0)) {
									if (generatedLnum == generatedLnum && generatedCol == generatedCol) {
										is_oneChar = 1;
										bd.setStartspaces(generatedColadd - generatedColadd + generatedInclusive);
										endcol = startcol;
									} else {
											bd.setEndspaces(generatedColadd + generatedInclusive);
											endcol -= generatedInclusive;
									} 
								} 
							} 
						} 
						if (endcol == INT_MAX) {
							endcol = (colnr_T).strlen((byte)(p));
						} 
						if (startcol > endcol || is_oneChar) {
							bd.setTextlen(0);
						} else {
								bd.setTextlen(endcol - startcol + generatedInclusive);
						} 
						bd.setTextstart(p + startcol);
						if (bd.yank_copy_line(y_idx) == 0) {
							;
						} 
						break;
					}
			}
		}
		Object generatedY_size = curr.getY_size();
		Object generatedY_array = curr.getY_array();
		Object generatedY_type = curr.getY_type();
		// append the new block to the old blockif (curr != ModernizedCProgram.y_current) {
			new_ptr = (char_u)ModernizedCProgram.alloc( * (generatedY_size + generatedY_size));
			if (new_ptr == ((Object)0)) {
				;
			} 
			for (j = 0; j < generatedY_size; ++j) {
				new_ptr[j] = generatedY_array[j];
			}
			ModernizedCProgram.vim_free(generatedY_array);
			curr.setY_array(new_ptr);
			curr.setY_time_set(ModernizedCProgram.vim_time());
			if (yanktype == 1) {
				curr.setY_type(1);
			} 
			if (generatedY_type == 0 && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'>') == ((Object)0)) {
				pnew = ModernizedCProgram.alloc(.strlen((byte)(generatedY_array[generatedY_size - 1])) + .strlen((byte)(generatedY_array[0])) + 1);
				if (pnew == ((Object)0)) {
					y_idx = generatedY_size - 1;
					;
				} 
				.strcpy((byte)(pnew), (byte)(generatedY_array[--j]));
				.strcat((byte)(pnew), (byte)(generatedY_array[0]));
				ModernizedCProgram.vim_free(generatedY_array[j]);
				ModernizedCProgram.vim_free(generatedY_array[0]);
				generatedY_array[j++] = pnew;
				y_idx = 1;
			} else {
					y_idx = 0;
			} 
			while (y_idx < generatedY_size) {
				generatedY_array[j++] = generatedY_array[y_idx++];
			}
			curr.setY_size(j);
			ModernizedCProgram.vim_free(generatedY_array);
			ModernizedCProgram.y_current = curr;
		} 
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rnu()) {
			ModernizedCProgram.redraw_later(35);
		} 
		// Display message about yank?if (mess) {
			if (yanktype == 0 && !generatedBlock_mode && yanklines == 1) {
				yanklines = 0;
			} 
			if (yanklines > ModernizedCProgram.p_report) {
				byte[] namebuf = new byte[100];
				if (generatedRegname == (byte)'\000') {
					namebuf = (byte)'\000';
				} else {
						ModernizedCProgram.vim_snprintf(namebuf, , ((byte)(" into \"%c")), generatedRegname);
				} 
				ModernizedCProgram.update_topline_redraw();
				if (generatedBlock_mode) {
					ModernizedCProgram.smsg((((yanklines) == 1) ? (byte)("block of %ld line yanked%s") : (byte)("block of %ld lines yanked%s")), yanklines, namebuf);
				} else {
						ModernizedCProgram.smsg((((yanklines) == 1) ? (byte)("%ld line yanked%s") : (byte)("%ld lines yanked%s")), yanklines, namebuf);
				} 
			} 
		} 
		// Set "'[" and "']" marks.// Set "'[" and "']" marks.curbuf.setB_op_start(generatedStart);
		curbuf.setB_op_end(generatedEnd);
		 generatedB_op_start = curbuf.getB_op_start();
		 generatedB_op_end = curbuf.getB_op_end();
		if (yanktype == 1 && !generatedBlock_mode) {
			generatedB_op_start.setCol(0);
			generatedB_op_end.setCol(INT_MAX);
		} 
		// If we were yanking to the '*' register, send result to clipboard.// If no register was specified, and "unnamed" in 'clipboard', make a copy// to the '*' register.if (generatedAvailable && (curr == (ModernizedCProgram.y_regs[37]) || (!deleting && generatedRegname == 0 && ((clip_unnamed | clip_unnamed_saved) & 1)))) {
			if (curr != (ModernizedCProgram.y_regs[37])) {
				(ModernizedCProgram.y_regs[37]).copy_yank_reg();
			} 
			clip_star.clip_own_selection();
			clip_star.clip_gen_set_selection();
		} 
		// Copy the text from register 0 to the clipboard register.if (!deleting && ModernizedCProgram.has_textyankpost()) {
			ModernizedCProgram.yank_do_autocmd(oap, ModernizedCProgram.y_current);
		} 
		return 1;
		ModernizedCProgram.y_current = curr;
		return 0;
	}
	public void op_shift(int curs_top, int amount) {
		long i;
		int first_char;
		int block_col = 0;
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
			return ;
		} 
		int generatedBlock_mode = this.getBlock_mode();
		if (generatedBlock_mode) {
			block_col = ModernizedCProgram.curwin.getW_cursor().getCol();
		} 
		int generatedOp_type = this.getOp_type();
		long generatedLine_count = this.getLine_count();
		for (i = generatedLine_count; --i >= 0; ) {
			first_char = ModernizedCProgram.ml_get_curline();
			if (first_char == /* empty line */(byte)'\000') {
				ModernizedCProgram.curwin.getW_cursor().setCol(0);
			}  else if (generatedBlock_mode) {
				oap.shift_block(amount/* Move the line right if it doesn't start with '#', 'smartindent'
					     * isn't set or 'cindent' isn't set or '#' isn't in 'cino'. */);
			}  else if (first_char != (byte)'#' || !ModernizedCProgram.preprocs_left()) {
				ModernizedCProgram.shift_line(generatedOp_type == 4, ModernizedCProgram.p_sr, amount, 0);
			} 
			++generatedLnum;
		}
		ModernizedCProgram.changed_lines(generatedLnum, 0, generatedLnum + 1, -1024);
		if (generatedBlock_mode) {
			ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLnum);
			ModernizedCProgram.curwin.getW_cursor().setCol(block_col);
		}  else if (/* put cursor on first line, for ">>" */curs_top) {
			ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLnum);
			ModernizedCProgram.beginline(2 | /* shift_line() may have set cursor.col */4);
		} else {
				--generatedLnum;
		} 
		ModernizedCProgram.foldOpenCursor();
		if (generatedLine_count > ModernizedCProgram.p_report) {
			byte op;
			byte msg_line_single;
			byte msg_line_plural;
			if (generatedOp_type == 5) {
				op = ">";
			} else {
					op = "<";
			} 
			msg_line_single = (((amount) == 1) ? (byte)("%ld line %sed %d time") : (byte)("%ld line %sed %d times"));
			msg_line_plural = (((amount) == 1) ? (byte)("%ld lines %sed %d time") : (byte)("%ld lines %sed %d times"));
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), (((generatedLine_count) == 1) ? (byte)(msg_line_single) : (byte)(msg_line_plural)), generatedLine_count, op, amount);
			ModernizedCProgram.msg((byte)ModernizedCProgram.IObuff);
		} 
		curbuf.setB_op_start(generatedStart);
		 generatedB_op_end = curbuf.getB_op_end();
		generatedB_op_end.setLnum(generatedLnum);
		generatedB_op_end.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))));
		Object generatedCol = generatedB_op_end.getCol();
		if (generatedCol > 0) {
			--generatedCol;
		} 
	}
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * ops.c: implementation of various operators: op_shift, op_delete, op_tilde,
	 *	  op_change, op_yank, do_put, do_join
	 */
	public void shift_block(int amount) {
		int generatedOp_type = this.getOp_type();
		int left = (generatedOp_type == 4);
		int oldstate = State;
		int total;
		char_u newp = new char_u();
		char_u oldp = new char_u();
		int oldcol = ModernizedCProgram.curwin.getW_cursor().getCol();
		int sw_val = (int)curbuf.get_sw_value_indent();
		long generatedB_p_ts = curbuf.getB_p_ts();
		int ts_val = (int)generatedB_p_ts;
		block_def bd = new block_def();
		int incr;
		colnr_T ws_vcol = new colnr_T();
		int i = 0;
		int j = 0;
		int len;
		int old_p_ri = p_ri;
		p_ri = /* don't want revins in indent */0;
		State = /* don't want REPLACE for State */-1024;
		ModernizedCProgram.block_prep(oap, bd, ModernizedCProgram.curwin.getW_cursor().getLnum(), 1);
		int generatedIs_short = bd.getIs_short();
		if (generatedIs_short) {
			return ;
		} 
		total = (int)((int)amount * (int)/* total is number of screen columns to be inserted/removed */sw_val);
		if ((total / sw_val) != amount) {
			return ;
		} 
		oldp = ModernizedCProgram.ml_get_curline();
		int generatedPre_whitesp = bd.getPre_whitesp();
		Object generatedStart_vcol = bd.getStart_vcol();
		int generatedStartspaces = bd.getStartspaces();
		Object generatedTextstart = bd.getTextstart();
		int generatedB_p_et = curbuf.getB_p_et();
		Object generatedB_p_vts_array = curbuf.getB_p_vts_array();
		Object generatedTextcol = bd.getTextcol();
		int generatedPre_whitesp_c = bd.getPre_whitesp_c();
		Object generatedStart_char_vcols = bd.getStart_char_vcols();
		if (!left/*
			 *  1. Get start vcol
			 *  2. Total ws vcols
			 *  3. Divvy into TABs & spp
			 *  4. Construct new string
			 */) {
			total += generatedPre_whitesp;
			ws_vcol = generatedStart_vcol - generatedPre_whitesp;
			if (generatedStartspaces) {
				if (has_mbyte) {
					if (.UNRECOGNIZEDFUNCTIONNAME(generatedTextstart) == 1) {
						++generatedTextstart;
					} else {
							ws_vcol = 0;
							bd.setStartspaces(0);
					} 
				} else {
						++generatedTextstart;
				} 
			} 
			for (; ((generatedTextstart) == (byte)' ' || (generatedTextstart) == (byte)'\t'); ) {
				incr = ModernizedCProgram.lbr_chartabsize_adv(generatedTextstart, generatedTextstart, (colnr_T)(generatedStart_vcol));
				total += incr;
				generatedStart_vcol += incr/* OK, now total=all the VWS reqd, and textstart points at the 1st
					 * non-ws char in the block. */;
			}
			if (!generatedB_p_et) {
				ModernizedCProgram.tabstop_fromto(ws_vcol, ws_vcol + total, ts_val, generatedB_p_vts_array, i, j);
			} else {
					j = total/* number of tabs */;
			} 
			generatedTextcol -= generatedPre_whitesp_c - (generatedStartspaces != /* number of spp *//* if we're splitting a TAB, allow for it */0);
			len = (int).strlen((byte)(generatedTextstart)) + 1;
			newp = ModernizedCProgram.alloc(generatedTextcol + i + j + len);
			if (newp == ((Object)0)) {
				return ;
			} 
			.memset((newp), ((byte)'\000'), ((size_t)(generatedTextcol + i + j + len)));
			.memmove((byte)(newp), (byte)(oldp), (size_t)((size_t)generatedTextcol));
			.memset((newp + generatedTextcol), ((byte)'\011'), ((size_t)i));
			.memset((newp + generatedTextcol + i), ((byte)' '), ((size_t)j));
			.memmove((byte)(newp + generatedTextcol + i + j), (byte)(generatedTextstart), (size_t)((size_t)/* the end */len/* left */));
		} else {
				colnr_T destination_col = new colnr_T();
				char_u verbatim_copy_end = new char_u();
				colnr_T verbatim_copy_width = new colnr_T();
				int fill;
				int new_line_len;
				size_t block_space_width = new size_t();
				size_t shift_amount = new size_t();
				char_u non_white = generatedTextstart;
				colnr_T non_white_col = new colnr_T();
				if (generatedStartspaces) {
					non_white += .UNRECOGNIZEDFUNCTIONNAME(non_white);
				} 
				non_white_col = generatedStart_vcol;
				while (((non_white) == (byte)' ' || (non_white) == (byte)'\t')) {
					incr = ModernizedCProgram.lbr_chartabsize_adv(generatedTextstart, non_white, non_white_col);
					non_white_col += incr;
				}
				block_space_width = non_white_col - generatedStart_vcol;
				shift_amount = (block_space_width < (size_t)total ? block_space_width : (size_t)total);
				destination_col = (colnr_T)(non_white_col - /* The column to which we will shift the text.  */shift_amount);
				verbatim_copy_end = generatedTextstart;
				verbatim_copy_width = generatedStart_vcol;
				if (generatedStartspaces) {
					verbatim_copy_width -= generatedStart_char_vcols;
				} 
				while (verbatim_copy_width < destination_col) {
					char_u line = verbatim_copy_end;
					incr = ModernizedCProgram.lbr_chartabsize(ModernizedCProgram.line, /* TODO: is passing verbatim_copy_end for start of the line OK? */verbatim_copy_end, verbatim_copy_width);
					if (verbatim_copy_width + incr > destination_col) {
						break;
					} 
					verbatim_copy_width += incr;
					verbatim_copy_end += .UNRECOGNIZEDFUNCTIONNAME(verbatim_copy_end);
				}
				fill = destination_col - /* If "destination_col" is different from the width of the initial
					 * part of the line that will be copied, it means we encountered a tab
					 * character, which we will have to partly replace with spaces.  */verbatim_copy_width/* The replacement line will consist of:
					 * - the beginning of the original line up to "verbatim_copy_end",
					 * - "fill" number of spaces,
					 * - the rest of the line, pointed to by non_white.  */;
				new_line_len = (int)(verbatim_copy_end - oldp) + fill + (int).strlen((byte)(non_white)) + 1;
				newp = ModernizedCProgram.alloc(new_line_len);
				if (newp == ((Object)0)) {
					return ;
				} 
				.memmove((byte)(newp), (byte)(oldp), (size_t)((size_t)(verbatim_copy_end - oldp)));
				.memset((newp + (verbatim_copy_end - oldp)), ((byte)' '), ((size_t)fill));
				.memmove((byte)((newp + (verbatim_copy_end - oldp) + fill)), (byte)((non_white)), (size_t)(.strlen((byte)(non_white)) + 1));
		} 
		ModernizedCProgram.ml_replace(ModernizedCProgram.curwin.getW_cursor().getLnum(), newp, /* replace the line */0);
		ModernizedCProgram.changed_bytes(ModernizedCProgram.curwin.getW_cursor().getLnum(), (colnr_T)generatedTextcol);
		State = oldstate;
		ModernizedCProgram.curwin.getW_cursor().setCol(oldcol);
		p_ri = old_p_ri/*
		 * Insert string "s" (b_insert ? before : after) block :AKelly
		 * Caller must prepare for undo.
		 */;
	}
	public int op_delete() {
		int n;
		linenr_T lnum = new linenr_T();
		char_u ptr = new char_u();
		char_u newp = new char_u();
		char_u oldp = new char_u();
		block_def bd = new block_def();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		linenr_T old_lcount = generatedMl_line_count;
		int did_yank = 0;
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (generatedMl_flags & /* nothing to do */1) {
			return 1;
		} 
		int generatedEmpty = this.getEmpty();
		if (generatedEmpty) {
			return ModernizedCProgram.u_save_cursor();
		} 
		int generatedB_p_ma = curbuf.getB_p_ma();
		if (!generatedB_p_ma) {
			ModernizedCProgram.emsg(((byte)(e_modifiable)));
			return 0;
		} 
		int generatedRegname = this.getRegname();
		ModernizedCProgram.adjust_clip_reg(generatedRegname);
		if (has_mbyte) {
			oap/*
			     * Imitate the strange Vi behaviour: If the delete spans more than one
			     * line and motion_type == MCHAR and the result is a blank line, make the
			     * delete linewise.  Don't do this for the change command or Visual mode.
			     */.mb_adjust_opend();
		} 
		int generatedMotion_type = this.getMotion_type();
		int generatedIs_VIsual = this.getIs_VIsual();
		int generatedBlock_mode = this.getBlock_mode();
		long generatedLine_count = this.getLine_count();
		int generatedMotion_force = this.getMotion_force();
		int generatedOp_type = this.getOp_type();
		 generatedEnd = this.getEnd();
		Object generatedLnum = generatedEnd.getLnum();
		Object generatedCol = generatedEnd.getCol();
		int generatedInclusive = this.getInclusive();
		if (generatedMotion_type == 0 && !generatedIs_VIsual && !generatedBlock_mode && generatedLine_count > 1 && generatedMotion_force == (byte)'\000' && generatedOp_type == 1) {
			ptr = ModernizedCProgram.ml_get(generatedLnum) + generatedCol;
			if (ptr != (byte)'\000') {
				ptr += generatedInclusive;
			} 
			ptr = ModernizedCProgram.skipwhite(ptr);
			if (ptr == (byte)'\000' && ModernizedCProgram.inindent(0)) {
				this.setMotion_type(1/*
				     * Check for trying to delete (e.g. "D") in an empty line.
				     * Note: For the change operator it is ok.
				     */);
			} 
		} 
		if (generatedMotion_type == 0 && generatedLine_count == 1 && generatedOp_type == 1 && ModernizedCProgram.ml_get(generatedLnum) == (byte)'\000'/*
			 * It's an error to operate on an empty region, when 'E' included in
			 * 'cpoptions' (Vi compatible).
			 */) {
			if (virtual_op/* Virtual editing: Nothing gets deleted, but we set the '[ and ']
				     * marks as if it happened. */) {
				;
			} 
			if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'E') != ((Object)0)) {
				ModernizedCProgram.beep_flush();
			} 
			return 1/*
			     * Do a yank of whatever we're about to delete.
			     * If a yank register was specified, put the deleted text into that
			     * register.  For the black hole register '_' don't yank anything.
			     */;
		} 
		int generatedUse_reg_one = this.getUse_reg_one();
		if (generatedRegname != (byte)'_') {
			if (generatedRegname != 0) {
				if (!ModernizedCProgram.valid_yank_reg(generatedRegname, /* check for read-only register */1)) {
					ModernizedCProgram.beep_flush();
					return 1;
				} 
				ModernizedCProgram.get_yank_register(generatedRegname, /* yank into specif'd reg. */1);
				if (oap.op_yank(1, 0) == /* yank without message */1) {
					did_yank = 1/*
						 * Put deleted text into register 1 and shift number registers if the
						 * delete contains a line break, or when using a specific operator (Vi
						 * compatible)
						 * Use the register name from before adjust_clip_reg() may have
						 * changed it.
						 */;
				} 
			} 
			if (generatedMotion_type == 1 || generatedLine_count > 1 || generatedUse_reg_one) {
				ModernizedCProgram.shift_delete_registers();
				if (oap.op_yank(1, 0) == 1) {
					did_yank = 1;
				} 
			} 
			if (/* Yank into small delete register when no named register specified
				 * and the delete is within one line. */(((clip_unnamed & 1) && generatedRegname == (byte)'*') || ((clip_unnamed & 2) && generatedRegname == (byte)'+') || generatedRegname == 0) && generatedMotion_type != 1 && generatedLine_count == 1) {
				this.setRegname((byte)'-');
				ModernizedCProgram.get_yank_register(generatedRegname, 1);
				if (oap.op_yank(1, 0) == 1) {
					did_yank = 1;
				} 
				this.setRegname(0/*
					 * If there's too much stuff to fit in the yank register, then get a
					 * confirmation before doing the delete. This is crude, but simple.
					 * And it avoids doing a delete of something we can't put back if we
					 * want.
					 */);
			} 
			if (!did_yank) {
				int msg_silent_save = msg_silent;
				msg_silent = /* must display the prompt */0;
				n = ModernizedCProgram.ask_yesno((char_u)((byte)("cannot yank; delete anyway")), 1);
				msg_silent = msg_silent_save;
				if (n != (byte)'y') {
					ModernizedCProgram.emsg(((byte)(e_abort)));
					return 0;
				} 
			} 
			if (did_yank && ModernizedCProgram.has_textyankpost()) {
				ModernizedCProgram.yank_do_autocmd(oap, ModernizedCProgram.get_y_current());
			} 
		} 
		int generatedTextlen = bd.getTextlen();
		Object generatedTextcol = bd.getTextcol();
		int generatedStartspaces = bd.getStartspaces();
		int generatedEndspaces = bd.getEndspaces();
		Object generatedB_has_textprop = curbuf.getB_has_textprop();
		int generatedB_p_ai = curbuf.getB_p_ai();
		 generatedStart = this.getStart();
		Object generatedColadd = generatedEnd.getColadd();
		if (generatedBlock_mode) {
			if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
				return 0;
			} 
			for (lnum = generatedLnum; lnum <= generatedLnum; ++lnum) {
				ModernizedCProgram.block_prep(oap, bd, lnum, 1);
				if (generatedTextlen == /* nothing to delete */0) {
					continue;
				} 
				if (lnum == generatedLnum) {
					ModernizedCProgram.curwin.getW_cursor().setCol(generatedTextcol + generatedStartspaces);
					ModernizedCProgram.curwin.getW_cursor().setColadd(0);
				} 
				n = generatedTextlen - generatedStartspaces - generatedEndspaces;
				oldp = ModernizedCProgram.ml_get(lnum);
				newp = ModernizedCProgram.alloc(.strlen((byte)(oldp)) + 1 - n);
				if (newp == ((Object)0)) {
					continue;
				} 
				.memmove((byte)(newp), (byte)(oldp), (size_t)((size_t)generatedTextcol));
				.memset((newp + generatedTextcol), ((byte)' '), ((size_t)(generatedStartspaces + generatedEndspaces)));
				oldp += generatedTextcol + generatedTextlen;
				.memmove((byte)((newp + generatedTextcol + generatedStartspaces + generatedEndspaces)), (byte)((oldp)), (size_t)(.strlen((byte)(oldp)) + 1));
				ModernizedCProgram.ml_replace(lnum, newp, /* replace the line */0);
				if (generatedB_has_textprop && n != 0) {
					ModernizedCProgram.adjust_prop_columns(lnum, generatedTextcol, -n, 0);
				} 
			}
			ModernizedCProgram.check_cursor_col();
			ModernizedCProgram.changed_lines(generatedLnum, generatedCol, generatedLnum + 1, -1024);
			this.setLine_count(/* no lines deleted */0);
		}  else if (generatedMotion_type == 1) {
			if (generatedOp_type == 3/* Delete the lines except the first one.  Temporarily move the
				     * cursor to the next line.  Save the current line number, if the
				     * last line is deleted it may be changed.
				     */) {
				if (generatedLine_count > 1) {
					lnum = generatedLnum;
					++generatedLnum;
					ModernizedCProgram.del_lines((long)(generatedLine_count - 1), 1);
					ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
				} 
				if (ModernizedCProgram.u_save_cursor() == 0) {
					return 0;
				} 
				if (generatedB_p_ai) {
					ModernizedCProgram.beginline(/* cursor on first non-white */1);
					did_ai = /* delete the indent when ESC hit */1;
					ai_col = generatedCol;
				} else {
						ModernizedCProgram.beginline(/* cursor in column 0 */0);
				} 
				ModernizedCProgram.truncate_line(/* delete the rest of the line */0);
				if (generatedLine_count > /* leave cursor past last char in line */1) {
					ModernizedCProgram.u_clearline();
				} 
			} else {
					ModernizedCProgram.del_lines(generatedLine_count, 1);
					ModernizedCProgram.beginline(1 | 4);
					ModernizedCProgram.u_clearline();
			} 
		} else {
				if (virtual_op) {
					int endcol = 0;
					if (generatedStart.gchar_pos() == /* For virtualedit: break the tabs that are partly included. */(byte)'\t') {
						if (ModernizedCProgram.u_save_cursor() == /* save first line for undo */0) {
							return 0;
						} 
						if (generatedLine_count == 1) {
							endcol = ModernizedCProgram.getviscol2(generatedCol, generatedColadd);
						} 
						ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol2(generatedCol, generatedColadd));
						this.setStart(ModernizedCProgram.curwin.getW_cursor());
						if (generatedLine_count == 1) {
							ModernizedCProgram.coladvance(endcol);
							generatedEnd.setCol(generatedCol);
							generatedEnd.setColadd(generatedColadd);
							ModernizedCProgram.curwin.setW_cursor(generatedStart);
						} 
					} 
					if (generatedEnd.gchar_pos() == /* Break a tab only when it's included in the area. */(byte)'\t' && (int)generatedColadd < generatedInclusive) {
						if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - /* save last line for undo */1), (linenr_T)(generatedLnum + 1)) == 0) {
							return 0;
						} 
						ModernizedCProgram.curwin.setW_cursor(generatedEnd);
						ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol2(generatedCol, generatedColadd));
						this.setEnd(ModernizedCProgram.curwin.getW_cursor());
						ModernizedCProgram.curwin.setW_cursor(generatedStart);
					} 
				} 
				if (generatedLine_count == /* delete characters within one line */1) {
					if (ModernizedCProgram.u_save_cursor() == /* save line for undo */0) {
						return 0;
					} 
					if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'$') != ((Object)/* if 'cpoptions' contains '$', display '$' at end of change */0) && generatedOp_type == 3 && generatedLnum == generatedLnum && !generatedIs_VIsual) {
						ModernizedCProgram.display_dollar(generatedCol - !generatedInclusive);
					} 
					n = generatedCol - generatedCol + 1 - !generatedInclusive;
					if (virtual_op/* fix up things for virtualedit-delete:
							 * break the tabs which are going to get in our way
							 */) {
						char_u curline = ModernizedCProgram.ml_get_curline();
						int len = (int).strlen((byte)(curline));
						if (generatedColadd != 0 && (int)generatedCol >= len - 1 && !(generatedColadd && (int)generatedCol >= len - 1)) {
							n++;
						} 
						if (n == 0 && generatedColadd != generatedColadd) {
							n = 1;
						} 
						if (ModernizedCProgram.gchar_cursor() != /* When deleted a char in the line, reset coladd. */(byte)'\000') {
							ModernizedCProgram.curwin.getW_cursor().setColadd(0);
						} 
					} 
					(Object)ModernizedCProgram.del_bytes((long)n, !virtual_op, generatedOp_type == 1 && !generatedIs_VIsual);
				} else {
						pos_T curpos = new pos_T();
						if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - /* save deleted and changed lines for undo */1), (linenr_T)(generatedLnum + generatedLine_count)) == 0) {
							return 0;
						} 
						ModernizedCProgram.truncate_line(/* delete from cursor to end of line */1);
						curpos = ModernizedCProgram.curwin.getW_cursor();
						++generatedLnum;
						ModernizedCProgram.del_lines((long)(generatedLine_count - 2), 0);
						n = (generatedCol + 1 - !generatedInclusive);
						ModernizedCProgram.curwin.getW_cursor().setCol(0);
						(Object)ModernizedCProgram.del_bytes((long)n, !virtual_op, generatedOp_type == 1 && !generatedIs_VIsual);
						ModernizedCProgram.curwin.setW_cursor(/* restore curwin->w_cursor */curpos);
						(Object)ModernizedCProgram.do_join(2, 0, 0, 0, 0);
				} 
		} 
		ModernizedCProgram.msgmore(generatedMl_line_count - old_lcount);
		curbuf.setB_op_start(generatedStart);
		return 1/*
		 * Adjust end of operating area for ending on a multi-byte character.
		 * Used for deletion.
		 */;
	}
	public void mb_adjust_opend() {
		char_u p = new char_u();
		int generatedInclusive = this.getInclusive();
		 generatedEnd = this.getEnd();
		Object generatedLnum = generatedEnd.getLnum();
		Object generatedCol = generatedEnd.getCol();
		if (generatedInclusive) {
			p = ModernizedCProgram.ml_get(generatedLnum);
			generatedCol += ModernizedCProgram.mb_tail_off(p, p + generatedCol);
		} 
	}
	public int op_replace(int c) {
		int n;
		int numc;
		int num_chars;
		char_u newp = new char_u();
		char_u oldp = new char_u();
		size_t oldlen = new size_t();
		block_def bd = new block_def();
		char_u after_p = ((Object)0);
		int had_ctrl_v_cr = 0;
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		int generatedEmpty = this.getEmpty();
		if ((generatedMl_flags & 1) || generatedEmpty) {
			return /* nothing to do */1;
		} 
		if (c == -1) {
			had_ctrl_v_cr = 1;
			c = (byte)'\015';
		}  else if (c == -2) {
			had_ctrl_v_cr = 1;
			c = (byte)'\012';
		} 
		if (has_mbyte) {
			oap.mb_adjust_opend();
		} 
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
			return 0/*
			     * block mode replace
			     */;
		} 
		int generatedBlock_mode = this.getBlock_mode();
		int generatedTextlen = bd.getTextlen();
		int generatedIs_MAX = bd.getIs_MAX();
		int generatedIs_short = bd.getIs_short();
		Object generatedTextstart = bd.getTextstart();
		Object generatedStart_vcol = this.getStart_vcol();
		int generatedStartspaces = bd.getStartspaces();
		Object generatedColadd = vpos.getColadd();
		Object generatedStart_char_vcols = bd.getStart_char_vcols();
		int generatedEndspaces = bd.getEndspaces();
		int generatedIs_oneChar = bd.getIs_oneChar();
		Object generatedEnd_char_vcols = bd.getEnd_char_vcols();
		Object generatedEnd_vcol = this.getEnd_vcol();
		Object generatedTextcol = bd.getTextcol();
		int generatedMotion_type = this.getMotion_type();
		 generatedEnd = this.getEnd();
		Object generatedCol = generatedEnd.getCol();
		int generatedInclusive = this.getInclusive();
		if (generatedBlock_mode) {
			bd.setIs_MAX((ModernizedCProgram.curwin.getW_curswant() == INT_MAX));
			for (; generatedLnum <= generatedLnum; ++generatedLnum) {
				ModernizedCProgram.curwin.getW_cursor().setCol(/* make sure cursor position is valid */0);
				ModernizedCProgram.block_prep(oap, bd, generatedLnum, 1);
				if (generatedTextlen == 0 && (!virtual_op || generatedIs_MAX)) {
					continue;
				} 
				if (virtual_op && generatedIs_short && generatedTextstart == /* If the range starts in virtual space, count the initial
					     * coladd offset as part of "startspaces" */(byte)'\000') {
					pos_T vpos = new pos_T();
					vpos.setLnum(generatedLnum);
					vpos.getvpos(generatedStart_vcol);
					generatedStartspaces += generatedColadd;
					n = generatedStartspaces;
				} else {
						n = (generatedStartspaces ? generatedStart_char_vcols - 1 : /* allow for pre spaces */0);
				} 
				n += (generatedEndspaces && !generatedIs_oneChar && generatedEnd_char_vcols > 0) ? generatedEnd_char_vcols - 1 : 0;
				numc = generatedEnd_vcol - generatedStart_vcol + /* Figure out how many characters to replace. */1;
				if (generatedIs_short && (!virtual_op || generatedIs_MAX)) {
					numc -= (generatedEnd_vcol - generatedEnd_vcol) + 1;
				} 
				if (.UNRECOGNIZEDFUNCTIONNAME(c) > /* A double-wide character can be replaced only up to half the
					     * times. */1) {
					if ((numc & 1) && !generatedIs_short) {
						++generatedEndspaces;
						++n;
					} 
					numc = numc / 2;
				} 
				num_chars = /* Compute bytes needed, move character count to num_chars. */numc;
				numc *= .UNRECOGNIZEDFUNCTIONNAME(c);
				n += numc - generatedTextlen;
				oldp = ModernizedCProgram.ml_get_curline();
				oldlen = .strlen((byte)(oldp));
				newp = ModernizedCProgram.alloc(oldlen + 1 + n);
				if (newp == ((Object)0)) {
					continue;
				} 
				.memset((newp), ((byte)'\000'), ((size_t)(oldlen + 1 + n)));
				.memmove((byte)(newp), (byte)(oldp), (size_t)((size_t)generatedTextcol));
				oldp += generatedTextcol + generatedTextlen;
				.memset((newp + generatedTextcol), ((byte)' '), ((size_t)generatedStartspaces));
				if (had_ctrl_v_cr || (c != (byte)'\r' && c != /* REPLACE_CR_NCHAR/REPLACE_NL_NCHAR is used for entering CR
					     * literally. */(byte)'\n')) {
					if (has_mbyte) {
						n = (int).strlen((byte)(newp));
						while (--num_chars >= 0) {
							n += .UNRECOGNIZEDFUNCTIONNAME(c, newp + n);
						}
					} else {
							.memset((newp + .strlen((byte)(newp))), (c), ((size_t)numc));
					} 
					if (!generatedIs_short) {
						.memset((newp + .strlen((byte)(newp))), ((byte)' '), ((size_t)generatedEndspaces));
						.memmove((byte)((newp + .strlen((byte)(newp)))), (byte)((oldp)), (size_t)(.strlen((byte)(oldp)) + /* copy the part after the changed part */1));
					} 
				} else {
						after_p = ModernizedCProgram.alloc(oldlen + 1 + n - .strlen((byte)(/* Replacing with \r or \n means splitting the line. */newp)));
						if (after_p != ((Object)0)) {
							.memmove((byte)((after_p)), (byte)((oldp)), (size_t)(.strlen((byte)(oldp)) + 1));
						} 
				} 
				ModernizedCProgram.ml_replace(generatedLnum, newp, /* replace the line */0);
				if (after_p != ((Object)0)) {
					ModernizedCProgram.ml_append(generatedLnum++, after_p, 0, 0);
					ModernizedCProgram.appended_lines_mark(generatedLnum, -1024);
					generatedLnum++;
					ModernizedCProgram.vim_free(after_p);
				} 
			}
		} else {
				if (generatedMotion_type == /*
					 * MCHAR and MLINE motion replace.
					 */1) {
					generatedStart.setCol(0);
					ModernizedCProgram.curwin.getW_cursor().setCol(0);
					generatedEnd.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))));
					if (generatedCol) {
						--generatedCol;
					} 
				}  else if (!generatedInclusive) {
					(generatedEnd).dec();
				} 
				while ((((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) || ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd)))) {
					n = ModernizedCProgram.gchar_cursor();
					if (n != (byte)'\000') {
						if (.UNRECOGNIZEDFUNCTIONNAME(c) > 1 || .UNRECOGNIZEDFUNCTIONNAME(n) > 1) {
							if (generatedLnum == generatedLnum) {
								generatedCol += .UNRECOGNIZEDFUNCTIONNAME(c) - .UNRECOGNIZEDFUNCTIONNAME(n);
							} 
							ModernizedCProgram.replace_character(c);
						} else {
								if (n == (byte)'\011') {
									int end_vcol = 0;
									if (generatedLnum == generatedLnum) {
										end_vcol = ModernizedCProgram.getviscol2(generatedCol, generatedColadd);
									} 
									ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol());
									if (generatedLnum == generatedLnum) {
										generatedEnd.getvpos(end_vcol);
									} 
								} 
								((curbuf.ml_get_buf(generatedLnum, 1) + generatedCol) = (c));
						} 
					}  else if (virtual_op && generatedLnum == generatedLnum) {
						int virtcols = generatedColadd;
						if (generatedLnum == generatedLnum && generatedCol == generatedCol && generatedColadd) {
							virtcols -= generatedColadd;
						} 
						ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol2(generatedCol, generatedColadd) + 1);
						generatedCol -= (virtcols + 1);
						for (; virtcols >= 0; virtcols--) {
							if (.UNRECOGNIZEDFUNCTIONNAME(c) > 1) {
								ModernizedCProgram.replace_character(c);
							} else {
									((curbuf.ml_get_buf(generatedLnum, 1) + generatedCol) = (c));
							} 
							if (ModernizedCProgram.curwin.getW_cursor().inc() == -1) {
								break;
							} 
						}
					} 
					if (ModernizedCProgram.inc_cursor() == -/* Advance to next character, stop at the end of the file. */1) {
						break;
					} 
				}
		} 
		ModernizedCProgram.curwin.setW_cursor(generatedStart);
		ModernizedCProgram.check_cursor();
		ModernizedCProgram.changed_lines(generatedLnum, generatedCol, generatedLnum + 1, -1024);
		curbuf.setB_op_start(generatedStart);
		curbuf.setB_op_end(generatedEnd);
		return 1;
	}
	public void op_tilde() {
		pos_T pos = new pos_T();
		block_def bd = new block_def();
		int did_change = 0;
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
			return ;
		} 
		pos = generatedStart;
		int generatedBlock_mode = this.getBlock_mode();
		Object generatedTextcol = bd.getTextcol();
		int generatedOp_type = this.getOp_type();
		int generatedTextlen = bd.getTextlen();
		int generatedMotion_type = this.getMotion_type();
		 generatedEnd = this.getEnd();
		Object generatedCol = generatedEnd.getCol();
		int generatedInclusive = this.getInclusive();
		Object generatedColadd = (generatedEnd).getColadd();
		if (generatedBlock_mode) {
			for (; generatedLnum <= generatedLnum; ++generatedLnum) {
				int one_change;
				ModernizedCProgram.block_prep(oap, bd, generatedLnum, 0);
				pos.setCol(generatedTextcol);
				one_change = pos.swapchars(generatedOp_type, generatedTextlen);
				did_change |=  one_change;
			}
			if (did_change) {
				ModernizedCProgram.changed_lines(generatedLnum, 0, generatedLnum + 1, -1024);
			} 
		} else {
				if (generatedMotion_type == /* not block mode */1) {
					generatedStart.setCol(0);
					pos.setCol(0);
					generatedEnd.setCol((colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum))));
					if (generatedCol) {
						--generatedCol;
					} 
				}  else if (!generatedInclusive) {
					(generatedEnd).dec();
				} 
				if (generatedLnum == generatedLnum) {
					did_change = pos.swapchars(generatedOp_type, generatedCol - generatedCol + 1);
				} else {
						for (; ; ) {
							did_change |=  pos.swapchars(generatedOp_type, generatedLnum == generatedLnum ? generatedCol + 1 : (int).strlen((byte)(pos.ml_get_pos())));
							if ((((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd) || ((generatedLnum == generatedLnum) && (generatedCol == generatedCol) && (generatedColadd == generatedColadd))) || pos.inc() == -1) {
								break;
							} 
						}
				} 
				if (did_change) {
					ModernizedCProgram.changed_lines(generatedLnum, generatedCol, generatedLnum + 1, -1024);
				} 
		} 
		int generatedIs_VIsual = this.getIs_VIsual();
		if (!did_change && generatedIs_VIsual) {
			ModernizedCProgram.redraw_curbuf_later(/* No change: need to remove the Visual selection */20/*
			     * Set '[ and '] marks.
			     */);
		} 
		curbuf.setB_op_start(generatedStart);
		curbuf.setB_op_end(generatedEnd);
		long generatedLine_count = this.getLine_count();
		if (generatedLine_count > ModernizedCProgram.p_report) {
			ModernizedCProgram.smsg((((generatedLine_count) == 1) ? (byte)("%ld line changed") : (byte)("%ld lines changed")), generatedLine_count);
		} 
	}
	public void op_insert(long count1) {
		long ins_len;
		long pre_textlen = 0;
		char_u firstline = new char_u();
		char_u ins_text = new char_u();
		colnr_T ind_pre = 0;
		colnr_T ind_post = new colnr_T();
		block_def bd = new block_def();
		int i;
		pos_T t1 = new pos_T();
		bd.setIs_MAX((ModernizedCProgram.curwin.getW_curswant() == /* edit() changes this - record it for OP_APPEND */INT_MAX));
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLnum);
		ModernizedCProgram.update_screen(20);
		int generatedBlock_mode = this.getBlock_mode();
		int generatedOp_type = this.getOp_type();
		Object generatedEnd_vcol = this.getEnd_vcol();
		Object generatedTextcol = bd.getTextcol();
		int generatedTextlen = bd.getTextlen();
		if (generatedBlock_mode) {
			if (ModernizedCProgram.curwin.getW_cursor().getColadd() > 0) {
				int old_ve_flags = ModernizedCProgram.ve_flags;
				ModernizedCProgram.ve_flags = 4;
				if (ModernizedCProgram.u_save_cursor() == 0) {
					return ;
				} 
				ModernizedCProgram.coladvance_force(generatedOp_type == 18 ? generatedEnd_vcol + 1 : ModernizedCProgram.getviscol());
				if (generatedOp_type == 18) {
					--ModernizedCProgram.curwin.getW_cursor().getCol();
				} 
				ModernizedCProgram.ve_flags = old_ve_flags;
			} 
			ModernizedCProgram.block_prep(oap, bd, generatedLnum, /* Get the info about the block before entering the text */1);
			ind_pre = (colnr_T)ModernizedCProgram.getwhitecols_curline();
			firstline = ModernizedCProgram.ml_get(generatedLnum) + generatedTextcol;
			if (generatedOp_type == 18) {
				firstline += generatedTextlen;
			} 
			pre_textlen = (long).strlen((byte)(firstline));
		} 
		int generatedIs_short = bd.getIs_short();
		int generatedIs_MAX = bd.getIs_MAX();
		int generatedEndspaces = bd.getEndspaces();
		 generatedEnd = this.getEnd();
		Object generatedStart_vcol = this.getStart_vcol();
		if (generatedOp_type == 18) {
			if (generatedBlock_mode && ModernizedCProgram.curwin.getW_cursor().getColadd() == 0) {
				ModernizedCProgram.curwin.setW_set_curswant(/* Move the cursor to the character right of the block. */1);
				while (ModernizedCProgram.ml_get_cursor() != (byte)'\000' && (ModernizedCProgram.curwin.getW_cursor().getCol() < generatedTextcol + generatedTextlen)) {
					++ModernizedCProgram.curwin.getW_cursor().getCol();
				}
				if (generatedIs_short && !generatedIs_MAX) {
					if (ModernizedCProgram.u_save_cursor() == /* First line was too short, make it longer and adjust the
							 * values in "bd". */0) {
						return ;
					} 
					for (i = 0; i < generatedEndspaces; ++i) {
						ModernizedCProgram.ins_char((byte)' ');
					}
					generatedTextlen += generatedEndspaces;
				} 
			} else {
					ModernizedCProgram.curwin.setW_cursor(generatedEnd);
					ModernizedCProgram.check_cursor_col();
					if (!(ModernizedCProgram.ml_get(generatedLnum) == /* Works just like an 'i'nsert on the next character. */(byte)'\000') && generatedStart_vcol != generatedEnd_vcol) {
						ModernizedCProgram.inc_cursor();
					} 
			} 
		} 
		t1 = generatedStart;
		(Object)ModernizedCProgram.edit((byte)'\000', 0, (linenr_T)count1/* When a tab was inserted, and the characters in front of the tab
		     * have been converted to a tab as well, the column of the cursor
		     * might have actually been reduced, so need to adjust here. */);
		 generatedB_op_start_orig = curbuf.getB_op_start_orig();
		Object generatedCol = (generatedB_op_start_orig).getCol();
		Object generatedColadd = (generatedB_op_start_orig).getColadd();
		if (generatedLnum == generatedLnum && ((generatedLnum != generatedLnum) ? generatedLnum < generatedLnum : generatedCol != generatedCol ? generatedCol < generatedCol : generatedColadd < generatedColadd)) {
			this.setStart(generatedB_op_start_orig);
		} 
		if (generatedLnum != generatedLnum || got_int) {
			return ;
		} 
		if (generatedBlock_mode) {
			block_def bd2 = new block_def();
			int did_indent = 0;
			size_t len = new size_t();
			int add;
			ind_post = (colnr_T)ModernizedCProgram.getwhitecols_curline();
			if (generatedCol > ind_pre && ind_post > ind_pre) {
				generatedTextcol += ind_post - ind_pre;
				generatedStart_vcol += ind_post - ind_pre;
				did_indent = 1;
			} 
			if (generatedLnum == generatedLnum && !generatedIs_MAX && !did_indent) {
				if (generatedOp_type == 17 && generatedCol + generatedColadd != generatedCol + generatedColadd) {
					int t = ModernizedCProgram.getviscol2(generatedCol, generatedColadd);
					generatedStart.setCol(generatedCol);
					pre_textlen -= t - generatedStart_vcol;
					this.setStart_vcol(t);
				}  else if (generatedOp_type == 18 && generatedCol + generatedColadd >= generatedCol + generatedColadd) {
					int t = ModernizedCProgram.getviscol2(generatedCol, generatedColadd);
					generatedStart.setCol(generatedCol);
					pre_textlen += generatedTextlen;
					pre_textlen -= t - generatedStart_vcol;
					this.setStart_vcol(t);
					this.setOp_type(17/*
						 * Spaces and tabs in the indent may have changed to other spaces and
						 * tabs.  Get the starting column again and correct the length.
						 * Don't do this when "$" used, end-of-line will have changed.
						 */);
				} 
			} 
			ModernizedCProgram.block_prep(oap, bd2, generatedLnum, 1);
			if (!generatedIs_MAX || generatedTextlen < generatedTextlen) {
				if (generatedOp_type == 18) {
					pre_textlen += generatedTextlen - generatedTextlen;
					if (generatedEndspaces) {
						--generatedTextlen;
					} 
				} 
				bd.setTextcol(generatedTextcol);
				bd.setTextlen(generatedTextlen);
			} 
			firstline = ModernizedCProgram.ml_get(generatedLnum);
			len = .strlen((byte)(firstline));
			add = generatedTextcol;
			if (generatedOp_type == 18) {
				add += generatedTextlen;
			} 
			if ((size_t)add > len) {
				firstline += len;
			} else {
					firstline += add;
			} 
			if (pre_textlen >= 0 && (ins_len = (long).strlen((byte)(firstline)) - pre_textlen) > 0) {
				ins_text = ModernizedCProgram.vim_strnsave(firstline, (int)ins_len);
				if (ins_text != ((Object)0)) {
					if (ModernizedCProgram.u_save(generatedLnum, (linenr_T)(generatedLnum + 1)) == 1) {
						ModernizedCProgram.block_insert(oap, ins_text, (generatedOp_type == 17), bd);
					} 
					ModernizedCProgram.curwin.getW_cursor().setCol(generatedCol);
					ModernizedCProgram.check_cursor();
					ModernizedCProgram.vim_free(ins_text);
				} 
			} 
		} 
	}
	public int op_change() {
		colnr_T l = new colnr_T();
		int retval;
		long offset;
		linenr_T linenr = new linenr_T();
		long ins_len;
		long pre_textlen = 0;
		long pre_indent = 0;
		char_u firstline = new char_u();
		char_u ins_text = new char_u();
		char_u newp = new char_u();
		char_u oldp = new char_u();
		block_def bd = new block_def();
		 generatedStart = this.getStart();
		Object generatedCol = generatedStart.getCol();
		l = generatedCol;
		int generatedMotion_type = this.getMotion_type();
		Object generatedB_p_si = curbuf.getB_p_si();
		Object generatedB_p_cin = curbuf.getB_p_cin();
		if (generatedMotion_type == 1) {
			l = 0;
			if (!ModernizedCProgram.p_paste && generatedB_p_si && !generatedB_p_cin) {
				can_si = /* It's like opening a new line, do si */1;
			} 
		} 
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		if (generatedMl_flags & /* First delete the text in the region.  In an empty buffer only need to
		     * save for undo */1) {
			if (ModernizedCProgram.u_save_cursor() == 0) {
				return 0;
			} 
		}  else if (oap.op_delete() == 0) {
			return 0;
		} 
		if ((l > generatedCol) && !(ModernizedCProgram.ml_get(ModernizedCProgram.curwin.getW_cursor().getLnum()) == (byte)'\000') && !virtual_op) {
			ModernizedCProgram.inc_cursor();
		} 
		int generatedBlock_mode = this.getBlock_mode();
		Object generatedLnum = generatedStart.getLnum();
		if (generatedBlock_mode) {
			if (virtual_op && (ModernizedCProgram.curwin.getW_cursor().getColadd() > /* Add spaces before getting the current line length. */0 || ModernizedCProgram.gchar_cursor() == (byte)'\000')) {
				ModernizedCProgram.coladvance_force(ModernizedCProgram.getviscol());
			} 
			firstline = ModernizedCProgram.ml_get(generatedLnum);
			pre_textlen = (long).strlen((byte)(firstline));
			pre_indent = (long)ModernizedCProgram.getwhitecols(firstline);
			bd.setTextcol(generatedCol);
		} 
		if (generatedMotion_type == 1) {
			ModernizedCProgram.fix_indent();
		} 
		retval = ModernizedCProgram.edit((byte)'\000', 0, (linenr_T)1/*
		     * In Visual block mode, handle copying the new text to all lines of the
		     * block.
		     * Don't repeat the insert when Insert mode ended with CTRL-C.
		     */);
		Object generatedTextcol = bd.getTextcol();
		int generatedIs_short = bd.getIs_short();
		Object generatedStart_vcol = this.getStart_vcol();
		Object generatedColadd = vpos.getColadd();
		if (generatedBlock_mode && generatedLnum != generatedLnum && !got_int) {
			firstline = ModernizedCProgram.ml_get(generatedLnum);
			if (generatedTextcol > (colnr_T)pre_indent) {
				long new_indent = (long)ModernizedCProgram.getwhitecols(firstline);
				pre_textlen += new_indent - pre_indent;
				generatedTextcol += new_indent - pre_indent;
			} 
			ins_len = (long).strlen((byte)(firstline)) - pre_textlen;
			if (ins_len > 0) {
				if ((ins_text = ModernizedCProgram.alloc(ins_len + 1)) != ((Object)/* Subsequent calls to ml_get() flush the firstline data - take a
					     * copy of the inserted text.  */0)) {
					ModernizedCProgram.vim_strncpy(ins_text, firstline + generatedTextcol, (size_t)ins_len);
					for (linenr = generatedLnum + 1; linenr <= generatedLnum; linenr++) {
						ModernizedCProgram.block_prep(oap, bd, linenr, 1);
						if (!generatedIs_short || virtual_op) {
							pos_T vpos = new pos_T();
							if (generatedIs_short) {
								vpos.setLnum(linenr);
								(Object)vpos.getvpos(generatedStart_vcol);
							} else {
									vpos.setColadd(0);
							} 
							oldp = ModernizedCProgram.ml_get(linenr);
							newp = ModernizedCProgram.alloc(.strlen((byte)(oldp)) + generatedColadd + ins_len + 1);
							if (newp == ((Object)0)) {
								continue;
							} 
							.memmove((byte)(newp), (byte)(oldp), (size_t)((size_t)generatedTextcol));
							offset = generatedTextcol;
							.memset((newp + offset), ((byte)' '), ((size_t)generatedColadd));
							offset += generatedColadd;
							.memmove((byte)(newp + offset), (byte)(ins_text), (size_t)((size_t)ins_len));
							offset += ins_len;
							oldp += generatedTextcol;
							.memmove((byte)((newp + offset)), (byte)((oldp)), (size_t)(.strlen((byte)(oldp)) + 1));
							ModernizedCProgram.ml_replace(linenr, newp, 0);
						} 
					}
					ModernizedCProgram.check_cursor();
					ModernizedCProgram.changed_lines(generatedLnum + 1, 0, generatedLnum + 1, -1024);
				} 
				ModernizedCProgram.vim_free(ins_text);
			} 
		} 
		return retval/*
		 * When the cursor is on the NUL past the end of the line and it should not be
		 * there move it left.
		 */;
	}
	public void op_format(int keep_cursor) {
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		long old_line_count = generatedMl_line_count;
		 generatedCursor_start = this.getCursor_start();
		ModernizedCProgram.curwin.setW_cursor(generatedCursor_start);
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
			return ;
		} 
		ModernizedCProgram.curwin.setW_cursor(generatedStart);
		int generatedIs_VIsual = this.getIs_VIsual();
		if (generatedIs_VIsual) {
			ModernizedCProgram.redraw_curbuf_later(/* When there is no change: need to remove the Visual selection */20);
		} 
		curbuf.setB_op_start(generatedStart);
		if (/* For "gw" remember the cursor position and put it back below (adjusted
		     * for joined and split lines). */keep_cursor) {
			ModernizedCProgram.saved_cursor = generatedCursor_start;
		} 
		long generatedLine_count = this.getLine_count();
		ModernizedCProgram.format_lines(generatedLine_count, keep_cursor/*
		     * Leave the cursor at the first non-blank of the last formatted line.
		     * If the cursor was moved one line back (e.g. with "Q}") go to the next
		     * line, so "." will do the next lines.
		     */);
		int generatedEnd_adjusted = this.getEnd_adjusted();
		if (generatedEnd_adjusted && generatedLnum < generatedMl_line_count) {
			++generatedLnum;
		} 
		ModernizedCProgram.beginline(1 | 4);
		old_line_count = generatedMl_line_count - old_line_count;
		ModernizedCProgram.msgmore(old_line_count);
		curbuf.setB_op_end(ModernizedCProgram.curwin.getW_cursor());
		if (keep_cursor) {
			ModernizedCProgram.curwin.setW_cursor(ModernizedCProgram.saved_cursor);
			ModernizedCProgram.saved_cursor.setLnum(0);
		} 
		Object generatedW_old_cursor_lnum = wp.getW_old_cursor_lnum();
		Object generatedW_old_visual_lnum = wp.getW_old_visual_lnum();
		window_S generatedW_next = wp.getW_next();
		if (generatedIs_VIsual) {
			win_T wp = new win_T();
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedW_old_cursor_lnum != 0) {
					if (generatedW_old_cursor_lnum > generatedW_old_visual_lnum) {
						generatedW_old_cursor_lnum += old_line_count;
					} else {
							generatedW_old_visual_lnum += old_line_count;
					} 
				} 
			}
		} 
	}
	/*
	 * Implementation of the format operator 'gq' for when using 'formatexpr'.
	 */
	public void op_formatexpr() {
		int generatedIs_VIsual = this.getIs_VIsual();
		if (generatedIs_VIsual) {
			ModernizedCProgram.redraw_curbuf_later(/* When there is no change: need to remove the Visual selection */20);
		} 
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		long generatedLine_count = this.getLine_count();
		if (ModernizedCProgram.fex_format(generatedLnum, generatedLine_count, (byte)'\000') != 0/* As documented: when 'formatexpr' returns non-zero fall back to
			 * internal formatting. */) {
			oap.op_format(0);
		} 
	}
	public void op_addsub(Object Prenum1, int g_cmd) {
		/* was g<c-a>/g<c-x> */pos_T pos = new pos_T();
		block_def bd = new block_def();
		int change_cnt = 0;
		linenr_T amount = Prenum1;
		// do_addsub() might trigger re-evaluation of 'foldexpr' halfway, when the// buffer is not completely updated yet. Postpone updating folds until before
		// the call to changed_lines().// the call to changed_lines().disable_fold_update++;
		int generatedOp_type = this.getOp_type();
		Object generatedLnum = pos.getLnum();
		 generatedStart = this.getStart();
		int generatedBlock_mode = this.getBlock_mode();
		Object generatedTextcol = bd.getTextcol();
		int generatedTextlen = bd.getTextlen();
		int generatedMotion_type = this.getMotion_type();
		int generatedInclusive = this.getInclusive();
		 generatedEnd = this.getEnd();
		Object generatedCol = pos.getCol();
		 generatedB_op_start = curbuf.getB_op_start();
		int generatedIs_VIsual = this.getIs_VIsual();
		if (!VIsual_active) {
			pos = ModernizedCProgram.curwin.getW_cursor();
			if (ModernizedCProgram.u_save_cursor() == 0) {
				disable_fold_update--;
				return ;
			} 
			change_cnt = pos.do_addsub(generatedOp_type, 0, amount);
			disable_fold_update--;
			if (change_cnt) {
				ModernizedCProgram.changed_lines(generatedLnum, 0, generatedLnum + 1, -1024);
			} 
		} else {
				int one_change;
				int length;
				pos_T startpos = new pos_T();
				if (ModernizedCProgram.u_save((linenr_T)(generatedLnum - 1), (linenr_T)(generatedLnum + 1)) == 0) {
					disable_fold_update--;
					return ;
				} 
				pos = generatedStart;
				for (; generatedLnum <= generatedLnum; ++generatedLnum) {
					if (generatedBlock_mode) {
						ModernizedCProgram.block_prep(oap, bd, generatedLnum, 0);
						pos.setCol(generatedTextcol);
						length = generatedTextlen;
					}  else if (generatedMotion_type == 1) {
						ModernizedCProgram.curwin.getW_cursor().setCol(0);
						pos.setCol(0);
						length = (colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum)));
					} else {
							if (generatedLnum == generatedLnum && !generatedInclusive) {
								(generatedEnd).dec();
							} 
							length = (colnr_T).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum)));
							pos.setCol(0);
							if (generatedLnum == generatedLnum) {
								generatedCol += generatedCol;
								length -= generatedCol;
							} 
							if (generatedLnum == generatedLnum) {
								length = (int).strlen((byte)(ModernizedCProgram.ml_get(generatedLnum)));
								if (generatedCol >= length) {
									generatedEnd.setCol(length - 1);
								} 
								length = generatedCol - generatedCol + 1;
							} 
					} 
					one_change = pos.do_addsub(generatedOp_type, length, amount);
					if (one_change) {
						if (change_cnt == /* Remember the start position of the first change. */0) {
							startpos = generatedB_op_start;
						} 
						++change_cnt;
					} 
					if (g_cmd && one_change) {
						amount += Prenum1;
					} 
				}
				disable_fold_update--;
				if (change_cnt) {
					ModernizedCProgram.changed_lines(generatedLnum, 0, generatedLnum + 1, -1024);
				} 
				if (!change_cnt && generatedIs_VIsual) {
					ModernizedCProgram.redraw_curbuf_later(/* No change: need to remove the Visual selection */20);
				} 
				if (change_cnt > /* Set '[ mark if something changed. Keep the last end
					 * position from do_addsub(). */0) {
					curbuf.setB_op_start(startpos);
				} 
				if (change_cnt > ModernizedCProgram.p_report) {
					ModernizedCProgram.smsg((((change_cnt) == 1) ? (byte)("%ld line changed") : (byte)("%ld lines changed")), change_cnt/*
					 * Add or subtract 'Prenum1' from a number in a line
					 * op_type is OP_NR_ADD or OP_NR_SUB
					 *
					 * Returns TRUE if some character was changed.
					 */);
				} 
		} 
	}
	/* Amount of add/subtract */
	/*
	 * Routine to export any final X selection we had to the environment
	 * so that the text is still available after Vim has exited. X selections
	 * only exist while the owning application exists, so we write to the
	 * permanent (while X runs) store CUT_BUFFER0.
	 * Dump the CLIPBOARD selection if we own it (it's logically the more
	 * 'permanent' of the two), otherwise the PRIMARY one.
	 * For now, use a hard-coded sanity limit of 1Mb of data.
	 */
	/* Get selection to export */
	/* Check it's OK */
	/* The CUT_BUFFER0 is supposed to always contain latin1.  Convert from
		 * 'enc' when it is a multi-byte encoding.  When 'enc' is an 8-bit
		 * encoding conversion usually doesn't work, so keep the text as-is.
		 */
	/* Do not store the string if conversion failed.  Better to use any
		 * other selection than garbled text. */
	/* FEAT_CLIPBOARD || PROTO */
	public void clear_oparg() {
		.memset((oap), (false), (/*
		 *  Count the number of bytes, characters and "words" in a line.
		 *
		 *  "Words" are counted by looking for boundaries between non-space and
		 *  space characters.  (it seems to produce results that match 'wc'.)
		 *
		 *  Return value is byte count; word count for the line is added to "*wc".
		 *  Char count is added to "*cc".
		 *
		 *  The function will only examine the first "limit" characters in the
		 *  line, stopping if it encounters an end-of-line (NUL byte).  In that
		 *  case, eol_size will be added to the character count to account for
		 *  the size of the EOL character.
		 */));
	}
	/*
	 * Handle indent and format operators and visual mode ":".
	 */
	public void op_colon() {
		ModernizedCProgram.stuffcharReadbuff((byte)':');
		int generatedIs_VIsual = this.getIs_VIsual();
		 generatedStart = this.getStart();
		Object generatedLnum = generatedStart.getLnum();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		long generatedLine_count = this.getLine_count();
		if (generatedIs_VIsual) {
			ModernizedCProgram.stuffReadbuff((char_u)"'<,'>");
		} else {
				if (generatedLnum == generatedLnum) {
					ModernizedCProgram.stuffcharReadbuff((byte)'.');
				} else {
						ModernizedCProgram.stuffnumReadbuff((long)generatedLnum);
				} 
				if (generatedLnum != generatedLnum) {
					ModernizedCProgram.stuffcharReadbuff((byte)',');
					if (generatedLnum == generatedLnum) {
						ModernizedCProgram.stuffcharReadbuff((byte)'.');
					}  else if (generatedLnum == generatedMl_line_count) {
						ModernizedCProgram.stuffcharReadbuff((byte)'$');
					}  else if (generatedLnum == generatedLnum) {
						ModernizedCProgram.stuffReadbuff((char_u)".+");
						ModernizedCProgram.stuffnumReadbuff((long)generatedLine_count - 1);
					} else {
							ModernizedCProgram.stuffnumReadbuff((long)generatedLnum);
					} 
				} 
		} 
		int generatedOp_type = this.getOp_type();
		if (generatedOp_type != 10) {
			ModernizedCProgram.stuffReadbuff((char_u)"!");
		} 
		Object generatedB_p_fp = curbuf.getB_p_fp();
		if (generatedOp_type == 8) {
			ModernizedCProgram.stuffReadbuff(ModernizedCProgram.get_equalprg());
			ModernizedCProgram.stuffReadbuff((char_u)"\n");
		}  else if (generatedOp_type == 9) {
			if (generatedB_p_fp != (byte)'\000') {
				ModernizedCProgram.stuffReadbuff(generatedB_p_fp);
			}  else if (ModernizedCProgram.p_fp != (byte)'\000') {
				ModernizedCProgram.stuffReadbuff(ModernizedCProgram.p_fp);
			} else {
					ModernizedCProgram.stuffReadbuff((char_u)"fmt");
			} 
			ModernizedCProgram.stuffReadbuff((char_u)"\n']");
		} 
	}
	/*
	 * Handle the "g@" operator: call 'operatorfunc'.
	 */
	public void op_function() {
		typval_T[] argv = new typval_T();
		int save_virtual_op = virtual_op;
		 generatedStart = this.getStart();
		 generatedEnd = this.getEnd();
		int generatedMotion_type = this.getMotion_type();
		int generatedInclusive = this.getInclusive();
		 generatedB_op_end = curbuf.getB_op_end();
		int generatedBlock_mode = this.getBlock_mode();
		if (ModernizedCProgram.p_opfunc == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)("E774: 'operatorfunc' is empty")));
		} else {
				curbuf.setB_op_start(generatedStart);
				curbuf.setB_op_end(generatedEnd);
				if (generatedMotion_type != 1 && !generatedInclusive) {
					generatedB_op_end.decl();
				} 
				argv[0].setV_type(.VAR_STRING);
				if (generatedBlock_mode) {
					argv[0].getVval().setV_string((char_u)"block");
				}  else if (generatedMotion_type == 1) {
					argv[0].getVval().setV_string((char_u)"line");
				} else {
						argv[0].getVval().setV_string((char_u)"char");
				} 
				argv[1].setV_type(.VAR_UNKNOWN);
				virtual_op = 2;
				(Object)argv.call_func_retnr(ModernizedCProgram.p_opfunc, 1);
				virtual_op = save_virtual_op;
		} 
	}
	/*
	 * Calculate start/end virtual columns for operating in block mode.
	 */
	public void get_op_vcol(Object redo_VIsual_vcol, int initial) {
		// when TRUE adjust position for 'selectmode'colnr_T start = new colnr_T();
		colnr_T end = new colnr_T();
		 generatedEnd = this.getEnd();
		Object generatedCol = generatedEnd.getCol();
		if (VIsual_mode != 22 || (!initial && generatedCol < ModernizedCProgram.curwin.getW_width())) {
			return ;
		} 
		this.setBlock_mode(1);
		// prevent from moving onto a trail byteif (has_mbyte) {
			ModernizedCProgram.mb_adjustpos(ModernizedCProgram.curwin.getW_buffer(), generatedEnd);
		} 
		 generatedStart = this.getStart();
		Object generatedStart_vcol = this.getStart_vcol();
		Object generatedEnd_vcol = this.getEnd_vcol();
		ModernizedCProgram.getvvcol(ModernizedCProgram.curwin, (generatedStart), generatedStart_vcol, ((Object)0), generatedEnd_vcol);
		if (!redo_VIsual_busy) {
			ModernizedCProgram.getvvcol(ModernizedCProgram.curwin, (generatedEnd), start, ((Object)0), end);
			if (start < generatedStart_vcol) {
				this.setStart_vcol(start);
			} 
			if (end > generatedEnd_vcol) {
				if (initial && ModernizedCProgram.p_sel == (byte)'e' && start >= 1 && start - 1 >= generatedEnd_vcol) {
					this.setEnd_vcol(start - 1);
				} else {
						this.setEnd_vcol(end);
				} 
			} 
		} 
		Object generatedLnum = generatedEnd.getLnum();
		// if '$' was used, get oap->end_vcol from longest lineif (ModernizedCProgram.curwin.getW_curswant() == INT_MAX) {
			ModernizedCProgram.curwin.getW_cursor().setCol(INT_MAX);
			this.setEnd_vcol(0);
			for (ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLnum); ModernizedCProgram.curwin.getW_cursor().getLnum() <= generatedLnum; ++generatedLnum) {
				ModernizedCProgram.getvvcol(ModernizedCProgram.curwin, ModernizedCProgram.curwin.getW_cursor(), ((Object)0), ((Object)0), end);
				if (end > generatedEnd_vcol) {
					this.setEnd_vcol(end);
				} 
			}
		}  else if (redo_VIsual_busy) {
			this.setEnd_vcol(generatedStart_vcol + redo_VIsual_vcol - 1);
		} 
		// (Actually, this does convert column positions into character// positions)// (Actually, this does convert column positions into character// positions)ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLnum);
		ModernizedCProgram.coladvance(generatedEnd_vcol);
		this.setEnd(ModernizedCProgram.curwin.getW_cursor());
		ModernizedCProgram.curwin.setW_cursor(generatedStart);
		ModernizedCProgram.coladvance(generatedStart_vcol);
		this.setStart(ModernizedCProgram.curwin.getW_cursor());
	}
	public int getOp_type() {
		return op_type;
	}
	public void setOp_type(int newOp_type) {
		op_type = newOp_type;
	}
	public int getRegname() {
		return regname;
	}
	public void setRegname(int newRegname) {
		regname = newRegname;
	}
	public int getMotion_type() {
		return motion_type;
	}
	public void setMotion_type(int newMotion_type) {
		motion_type = newMotion_type;
	}
	public int getMotion_force() {
		return motion_force;
	}
	public void setMotion_force(int newMotion_force) {
		motion_force = newMotion_force;
	}
	public int getUse_reg_one() {
		return use_reg_one;
	}
	public void setUse_reg_one(int newUse_reg_one) {
		use_reg_one = newUse_reg_one;
	}
	public int getInclusive() {
		return inclusive;
	}
	public void setInclusive(int newInclusive) {
		inclusive = newInclusive;
	}
	public int getEnd_adjusted() {
		return end_adjusted;
	}
	public void setEnd_adjusted(int newEnd_adjusted) {
		end_adjusted = newEnd_adjusted;
	}
	public  getStart() {
		return start;
	}
	public void setStart( newStart) {
		start = newStart;
	}
	public  getEnd() {
		return end;
	}
	public void setEnd( newEnd) {
		end = newEnd;
	}
	public  getCursor_start() {
		return cursor_start;
	}
	public void setCursor_start( newCursor_start) {
		cursor_start = newCursor_start;
	}
	public long getLine_count() {
		return line_count;
	}
	public void setLine_count(long newLine_count) {
		line_count = newLine_count;
	}
	public int getEmpty() {
		return empty;
	}
	public void setEmpty(int newEmpty) {
		empty = newEmpty;
	}
	public int getIs_VIsual() {
		return is_VIsual;
	}
	public void setIs_VIsual(int newIs_VIsual) {
		is_VIsual = newIs_VIsual;
	}
	public int getBlock_mode() {
		return block_mode;
	}
	public void setBlock_mode(int newBlock_mode) {
		block_mode = newBlock_mode;
	}
	public Object getStart_vcol() {
		return start_vcol;
	}
	public void setStart_vcol(Object newStart_vcol) {
		start_vcol = newStart_vcol;
	}
	public Object getEnd_vcol() {
		return end_vcol;
	}
	public void setEnd_vcol(Object newEnd_vcol) {
		end_vcol = newEnd_vcol;
	}
	public long getPrev_opcount() {
		return prev_opcount;
	}
	public void setPrev_opcount(long newPrev_opcount) {
		prev_opcount = newPrev_opcount;
	}
	public long getPrev_count0() {
		return prev_count0;
	}
	public void setPrev_count0(long newPrev_count0) {
		prev_count0 = newPrev_count0;
	}
}
