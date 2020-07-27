package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 */
/*
 * This file defines the Ex commands.
 * When DO_DECLARE_EXCMD is defined, the table with ex command names and
 * options results.
 * When DO_DECLARE_EXCMD is NOT defined, the enum with all the Ex commands
 * results.
 * This clever trick was invented by Ron Aaron.
 */
/*
 * When adding an Ex command:
 * 1. Add an entry in the table below.  Keep it sorted on the shortest
 *    version of the command name that works.  If it doesn't start with a
 *    lower case letter, add it at the end.
 * 2. Run "make cmdidxs" to re-generate ex_cmdidxs.h.
 * 3. Add a "case: CMD_xxx" in the big switch in ex_docmd.c.
 * 4. Add an entry in the index for Ex commands at ":help ex-cmd-index".
 * 5. Add documentation in ../doc/xxx.txt.  Add a tag for both the short and
 *    long name of the command.
 */
// allow a linespecs
// allow a ! after the command name
// allow extra args after command name
// expand wildcards in extra part
// no spaces allowed in the extra part
// default file range is 1,$
// extend range to include whole fold also
// when less than two numbers given
// argument required
// check for trailing vertical bar
// allow "x for register designation
// allow count in argument, after command
// no trailing comment allowed
// zero line number allowed
// do not remove CTRL-V from argument
// allow "+command" argument
// accepts buffer name
// accepts unlisted buffer too
// allow "++opt=val" argument
// allowed in the sandbox
// allowed in cmdline window; when missing
// disallows editing another buffer when
// curbuf_lock is set
// forbidden in non-'modifiable' buffer
// allow flags after count in argument
// forbidden in restricted mode
// multiple extra files allowed
// 1 file, defaults to current file
// one extra word allowed
/*
 * values for cmd_addr_type
 */
/*
 * values for cmd_addr_type
 */
// buffer line numbers
// window number
// argument number
// buffer number of loaded buffer
// buffer number
// tab page number
// Tab page that only relative
// quickfix list valid entry number
// quickfix list entry number
// positive count or zero, defaults to 1
// something else, use line number for '$', '%', etc.
// no range used
public class exarg {
	private Object[] arg;
	private Object nextcmd;
	private Object[] cmd;
	private Object cmdlinep;
	private CMD_index cmdidx;
	private long argt;
	private int skip;
	private int forceit;
	private int addr_count;
	private Object line1;
	private Object line2;
	private  addr_type;
	private int flags;
	private Object do_ecmd_cmd;
	private Object do_ecmd_lnum;
	private int append;
	private int usefilter;
	private int amount;
	private int regname;
	private int force_bin;
	private int read_edit;
	private int force_ff;
	private int force_enc;
	private int bad_char;
	private int useridx;
	private Byte errmsg;
	private Object getline;
	private Object cookie;
	private long verbose_save;
	private int save_msg_silent;
	private int did_esilent;
	
	public exarg(Object[] arg, Object nextcmd, Object[] cmd, Object cmdlinep, CMD_index cmdidx, long argt, int skip, int forceit, int addr_count, Object line1, Object line2,  addr_type, int flags, Object do_ecmd_cmd, Object do_ecmd_lnum, int append, int usefilter, int amount, int regname, int force_bin, int read_edit, int force_ff, int force_enc, int bad_char, int useridx, Byte errmsg, Object getline, Object cookie, long verbose_save, int save_msg_silent, int did_esilent) {
		setArg(arg);
		setNextcmd(nextcmd);
		setCmd(cmd);
		setCmdlinep(cmdlinep);
		setCmdidx(cmdidx);
		setArgt(argt);
		setSkip(skip);
		setForceit(forceit);
		setAddr_count(addr_count);
		setLine1(line1);
		setLine2(line2);
		setAddr_type(addr_type);
		setFlags(flags);
		setDo_ecmd_cmd(do_ecmd_cmd);
		setDo_ecmd_lnum(do_ecmd_lnum);
		setAppend(append);
		setUsefilter(usefilter);
		setAmount(amount);
		setRegname(regname);
		setForce_bin(force_bin);
		setRead_edit(read_edit);
		setForce_ff(force_ff);
		setForce_enc(force_enc);
		setBad_char(bad_char);
		setUseridx(useridx);
		setErrmsg(errmsg);
		setGetline(getline);
		setCookie(cookie);
		setVerbose_save(verbose_save);
		setSave_msg_silent(save_msg_silent);
		setDid_esilent(did_esilent);
	}
	public exarg() {
	}
	
	public void ex_version() {
		Object[] generatedArg = this.getArg();
		if (generatedArg == (byte)'\000') {
			ModernizedCProgram.msg_putchar((byte)'\n');
			ModernizedCProgram.list_version();
		} 
	}
	/*
	     * Ignore a ":version 9.99" command.
	     */
	public void ex_intro() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screenclear();
		ModernizedCProgram.intro_message(1);
		ModernizedCProgram.wait_return(1);
	}
	public void do_ascii() {
		int c;
		int cval;
		byte[] buf1 = new byte[20];
		byte[] buf2 = new byte[20];
		char_u[] buf3 = new char_u();
		char_u dig = new char_u();
		int[] cc = new int[6];
		int ci = 0;
		int len;
		if (enc_utf8) {
			c = ModernizedCProgram.utfc_ptr2char(ModernizedCProgram.ml_get_cursor(), cc);
		} else {
				c = ModernizedCProgram.gchar_cursor();
		} 
		if (c == (byte)'\000') {
			ModernizedCProgram.msg("NUL");
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.IObuff[0] = (byte)'\000';
		if (!has_mbyte || (enc_dbcs != 0 && c < -1024) || c < -1024) {
			if (c == /* NUL is stored as NL */(byte)'\012') {
				c = (byte)'\000';
			} 
			if (c == (byte)'\015' && curbuf.get_fileformat() == 2) {
				cval = /* NL is stored as CR */(byte)'\012';
			} else {
					cval = c;
			} 
			if (ModernizedCProgram.vim_isprintc_strict(c) && (c < (byte)' ' || c > (byte)'~')) {
				ModernizedCProgram.transchar_nonprint(buf3, c);
				ModernizedCProgram.vim_snprintf(buf1, /*Error: sizeof expression not supported yet*/, "  <%s>", (byte)buf3);
			} else {
					buf1[0] = (byte)'\000';
			} 
			if (c >= -1024) {
				ModernizedCProgram.vim_snprintf(buf2, /*Error: sizeof expression not supported yet*/, "  <M-%s>", (byte)ModernizedCProgram.transchar(c & -1024));
			} else {
					buf2[0] = (byte)'\000';
			} 
			dig = ModernizedCProgram.get_digraph_for_char(cval);
			if (dig != ((Object)0)) {
				ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("<%s>%s%s  %d,  Hex %02x,  Oct %03o, Digr %s")), ModernizedCProgram.transchar(c), buf1, buf2, cval, cval, cval, dig);
			} else {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("<%s>%s%s  %d,  Hex %02x,  Octal %03o")), ModernizedCProgram.transchar(c), buf1, buf2, cval, cval, cval);
			} 
			if (enc_utf8) {
				c = cc[ci++];
			} else {
					c = 0;
			} 
		} 
		while (has_mbyte && (c >= -1024 || (enc_utf8 && c >= /* Repeat for combining characters. */-1024))) {
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff));
			if (len > /* This assumes every multi-byte char is printable... */0) {
				ModernizedCProgram.IObuff[len++] = (byte)' ';
			} 
			ModernizedCProgram.IObuff[len++] = (byte)'<';
			if (enc_utf8 && ModernizedCProgram.utf_iscomposing(c)) {
				ModernizedCProgram.IObuff[len++] = /* draw composing char on top of a space */(byte)' ';
			} 
			len += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(c, ModernizedCProgram.IObuff + len);
			dig = ModernizedCProgram.get_digraph_for_char(c);
			if (dig != ((Object)0)) {
				ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff + len, (1024 + 1) - len, c < -1024 ? ((byte)("> %d, Hex %04x, Oct %o, Digr %s")) : ((byte)("> %d, Hex %08x, Oct %o, Digr %s")), c, c, c, dig);
			} else {
					ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff + len, (1024 + 1) - len, c < -1024 ? ((byte)("> %d, Hex %04x, Octal %o")) : ((byte)("> %d, Hex %08x, Octal %o")), c, c, c);
			} 
			if (ci == 6) {
				break;
			} 
			if (enc_utf8) {
				c = cc[ci++];
			} else {
					c = 0;
			} 
		}
		ModernizedCProgram.msg((byte)ModernizedCProgram.IObuff/*
		 * ":left", ":center" and ":right": align text.
		 */);
	}
	public void ex_align() {
		pos_T save_curpos = new pos_T();
		int len;
		int indent = 0;
		int new_indent;
		int has_tab;
		int width;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rl()) {
			if (generatedCmdidx == /* switch left and right aligning */CMD_index.CMD_right) {
				this.setCmdidx(CMD_index.CMD_left);
			}  else if (generatedCmdidx == CMD_index.CMD_left) {
				this.setCmdidx(CMD_index.CMD_right);
			} 
		} 
		Object[] generatedArg = this.getArg();
		width = /*Error: Function owner not recognized*/atoi((byte)generatedArg);
		save_curpos = ModernizedCProgram.curwin.getW_cursor();
		long generatedB_p_tw = curbuf.getB_p_tw();
		long generatedB_p_wm = curbuf.getB_p_wm();
		if (generatedCmdidx == /* width is used for new indent */CMD_index.CMD_left) {
			if (width >= 0) {
				indent = width/*
					 * if 'textwidth' set, use it
					 * else if 'wrapmargin' set, use it
					 * if invalid value, use 80
					 */;
			} 
		} else {
				if (width <= 0) {
					width = generatedB_p_tw;
				} 
				if (width == 0 && generatedB_p_wm > 0) {
					width = ModernizedCProgram.curwin.getW_width() - generatedB_p_wm;
				} 
				if (width <= 0) {
					width = 80;
				} 
		} 
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (ModernizedCProgram.u_save((linenr_T)(generatedLine1 - 1), (linenr_T)(generatedLine2 + 1)) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		for (ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1); ModernizedCProgram.curwin.getW_cursor().getLnum() <= generatedLine2; ++ModernizedCProgram.curwin.getW_cursor().getLnum()) {
			if (generatedCmdidx == /* left align */CMD_index.CMD_left) {
				new_indent = indent;
			} else {
					has_tab = /* avoid uninit warnings */0;
					len = ModernizedCProgram.linelen(generatedCmdidx == CMD_index.CMD_right ? has_tab : ((Object)0)) - ModernizedCProgram.get_indent();
					if (len <= /* skip blank lines */0) {
						continue;
					} 
					if (generatedCmdidx == CMD_index.CMD_center) {
						new_indent = (width - len) / 2;
					} else {
							new_indent = width - /* right align */len/*
									 * Make sure that embedded TABs don't make the text go too far
									 * to the right.
									 */;
							if (has_tab) {
								while (new_indent > 0) {
									(Object)ModernizedCProgram.set_indent(new_indent, 0);
									if (ModernizedCProgram.linelen(((Object)0)) <= width/*
												     * Now try to move the line as much as possible to
												     * the right.  Stop when it moves too far.
												     */) {
										do {
											(Object)ModernizedCProgram.set_indent(++new_indent, 0);
										} while (ModernizedCProgram.linelen(((Object)0)) <= width);
										--new_indent;
										break;
									} 
									--new_indent;
								}
							} 
					} 
			} 
			if (new_indent < 0) {
				new_indent = 0;
			} 
			(Object)ModernizedCProgram.set_indent(new_indent, /* set indent */0);
		}
		ModernizedCProgram.changed_lines(generatedLine1, 0, generatedLine2 + 1, -1024);
		ModernizedCProgram.curwin.setW_cursor(save_curpos);
		ModernizedCProgram.beginline(1 | 4/*
		 * Get the length of the current line, excluding trailing white space.
		 */);
	}
	public void ex_sort() {
		regmatch_T regmatch = new regmatch_T();
		int len;
		linenr_T lnum = new linenr_T();
		long maxlen = 0;
		sorti_T nrs = new sorti_T();
		Object generatedLine2 = this.getLine2();
		Object generatedLine1 = this.getLine1();
		size_t count = (size_t)(generatedLine2 - generatedLine1 + 1);
		size_t i = new size_t();
		char_u p = new char_u();
		char_u s = new char_u();
		char_u s2 = new char_u();
		/* temporary character storage */char_u c = new char_u();
		int unique = 0;
		long deleted;
		colnr_T start_col = new colnr_T();
		colnr_T end_col = new colnr_T();
		int sort_what = 0;
		int format_found = 0;
		// Buffer contents changed.int change_occurred = 0;
		if (count <= /* Sorting one line is really quick! */1) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.u_save((linenr_T)(generatedLine1 - 1), (linenr_T)(generatedLine2 + 1)) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.sortbuf1 = ((Object)0);
		ModernizedCProgram.sortbuf2 = ((Object)0);
		regmatch.setRegprog(((Object)0));
		nrs = (sorti_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (count));
		if (nrs == ((Object)0)) {
			;
		} 
		ModernizedCProgram.sort_abort = ModernizedCProgram.sort_ic = ModernizedCProgram.sort_rx = ModernizedCProgram.sort_nr = 0;
		ModernizedCProgram.sort_flt = 0;
		Object generatedRegprog = regmatch.getRegprog();
		regprog regprog = new regprog();
		Object[] generatedArg = this.getArg();
		for (p = generatedArg; p != (byte)'\000'; ++p) {
			if (((p) == (byte)' ' || (p) == (byte)'\t')) {
				;
			}  else if (p == (byte)'i') {
				ModernizedCProgram.sort_ic = 1;
			}  else if (p == (byte)'r') {
				ModernizedCProgram.sort_rx = 1;
			}  else if (p == (byte)'n') {
				ModernizedCProgram.sort_nr = 1;
				++format_found;
			}  else if (p == (byte)'f') {
				ModernizedCProgram.sort_flt = 1;
				++format_found;
			}  else if (p == (byte)'b') {
				sort_what = -1024 + -1024;
				++format_found;
			}  else if (p == (byte)'o') {
				sort_what = -1024 + -1024;
				++format_found;
			}  else if (p == (byte)'x') {
				sort_what = -1024 + -1024;
				++format_found;
			}  else if (p == (byte)'u') {
				unique = 1;
			}  else if (p == /* comment start */(byte)'"') {
				break;
			}  else if (ModernizedCProgram.check_nextcmd(p) != ((Object)0)) {
				this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
				break;
			}  else if (!(((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) && generatedRegprog == ((Object)0)) {
				s = ModernizedCProgram.skip_regexp(p + 1, p, 1, ((Object)0));
				if (s != p) {
					ModernizedCProgram.emsg(((byte)(e_invalpat)));
					;
				} 
				s = (byte)'\000';
				if (s == p + /* Use last search pattern if sort pattern is empty. */1) {
					if (ModernizedCProgram.last_search_pat() == ((Object)0)) {
						ModernizedCProgram.emsg(((byte)(e_noprevre)));
						;
					} 
					regmatch.setRegprog(regprog.vim_regcomp(ModernizedCProgram.last_search_pat(), 1));
				} else {
						regmatch.setRegprog(regprog.vim_regcomp(p + 1, 1));
				} 
				if (generatedRegprog == ((Object)0)) {
					;
				} 
				p = /* continue after the regexp */s;
				regmatch.setRm_ic(ModernizedCProgram.p_ic);
			} else {
					ModernizedCProgram.semsg(((byte)(e_invarg2)), p);
					;
			} 
		}
		if (format_found > /* Can only have one of 'n', 'b', 'o' and 'x'. */1) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
			;
		} 
		ModernizedCProgram.sort_nr += /* From here on "sort_nr" is used as a flag for any integer number
		     * sorting. */sort_what/*
		     * Make an array with all line numbers.  This avoids having to copy all
		     * the lines into allocated memory.
		     * When sorting on strings "start_col_nr" is the offset in the line, for
		     * numbers sorting it's the number to sort on.  This means the pattern
		     * matching and number conversion only has to be done once per line.
		     * Also get the longest line length for allocating "sortbuf".
		     */;
		Object generatedStartp = regmatch.getStartp();
		Object generatedEndp = regmatch.getEndp();
		for (lnum = generatedLine1; lnum <= generatedLine2; ++lnum) {
			s = ModernizedCProgram.ml_get(lnum);
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(s));
			if (maxlen < len) {
				maxlen = len;
			} 
			start_col = 0;
			end_col = len;
			if (generatedRegprog != ((Object)0) && regmatch.vim_regexec(s, 0)) {
				if (ModernizedCProgram.sort_rx) {
					start_col = (colnr_T)(generatedStartp[0] - s);
					end_col = (colnr_T)(generatedEndp[0] - s);
				} else {
						start_col = (colnr_T)(generatedEndp[0] - s);
				} 
			}  else if (generatedRegprog != ((Object)0)) {
				end_col = 0;
			} 
			if (ModernizedCProgram.sort_nr || ModernizedCProgram.sort_flt) {
				s2 = s + /* Make sure vim_str2nr doesn't read any digits past the end
					     * of the match, by temporarily terminating the string there */end_col;
				c = s2;
				s2 = (byte)'\000';
				p = s + /* Sorting on number: Store the number itself. */start_col;
				if (ModernizedCProgram.sort_nr) {
					if (sort_what & -1024) {
						s = ModernizedCProgram.skiptohex(p);
					}  else if (sort_what & -1024) {
						s = ModernizedCProgram.skiptobin(p);
					} else {
							s = ModernizedCProgram.skiptodigit(p);
					} 
					if (s > p && s[-1] == (byte)'-') {
						--/* include preceding negative sign */s;
					} 
					if (s == (byte)'\000') {
						nrs[lnum - generatedLine1].getSt_u().getNum().setIs_number(/* line without number should sort before any number */0);
						nrs[lnum - generatedLine1].getSt_u().getNum().setValue(0);
					} else {
							nrs[lnum - generatedLine1].getSt_u().getNum().setIs_number(1);
							ModernizedCProgram.vim_str2nr(s, ((Object)0), ((Object)0), sort_what, nrs[lnum - generatedLine1].getSt_u().getNum().getValue(), ((Object)0), 0, 0);
					} 
				} else {
						s = ModernizedCProgram.skipwhite(p);
						if (s == (byte)'+') {
							s = ModernizedCProgram.skipwhite(s + 1);
						} 
						if (s == (byte)'\000') {
							nrs[lnum - generatedLine1].getSt_u().setValue_flt(-((double)/* empty line should sort before any number */-1024.0));
						} else {
								nrs[lnum - generatedLine1].getSt_u().setValue_flt(/*Error: Function owner not recognized*/strtod((byte)s, ((Object)0)));
						} 
				} 
				s2 = c;
			} else {
					nrs[lnum - generatedLine1].getSt_u().getLine().setStart_col_nr(/* Store the column to sort at. */start_col);
					nrs[lnum - generatedLine1].getSt_u().getLine().setEnd_col_nr(end_col);
			} 
			nrs[lnum - generatedLine1].setLnum(lnum);
			if (generatedRegprog != ((Object)0)) {
				ModernizedCProgram.fast_breakcheck();
			} 
			if (got_int) {
				;
			} 
		}
		ModernizedCProgram.sortbuf1 = ModernizedCProgram.alloc(maxlen + /* Allocate a buffer that can hold the longest line. */1);
		if (ModernizedCProgram.sortbuf1 == ((Object)0)) {
			;
		} 
		ModernizedCProgram.sortbuf2 = ModernizedCProgram.alloc(maxlen + 1);
		if (ModernizedCProgram.sortbuf2 == ((Object)0)) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort((Object)nrs, count, /*Error: Unsupported expression*/, /* Sort the array of line numbers.  Note: can't be interrupted! */ModernizedCProgram.sort_compare);
		if (ModernizedCProgram.sort_abort) {
			;
		} 
		lnum = generatedLine2;
		int generatedForceit = this.getForceit();
		for (i = 0; i < count; ++i) {
			linenr_T get_lnum = nrs[generatedForceit ? count - i - 1 : i].getLnum();
			if (get_lnum + ((linenr_T)count - 1) != lnum) {
				change_occurred = 1;
			} 
			s = ModernizedCProgram.ml_get(get_lnum);
			if (!unique || i == 0 || (ModernizedCProgram.sort_ic ? ModernizedCProgram.vim_stricmp((byte)(s), (byte)(ModernizedCProgram.sortbuf1)) : /*Error: Function owner not recognized*/strcmp((byte)(s), (byte)(ModernizedCProgram.sortbuf1))) != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.sortbuf1), (byte)(s));
				if (ModernizedCProgram.ml_append(lnum++, ModernizedCProgram.sortbuf1, (colnr_T)0, 0) == 0) {
					break;
				} 
			} 
			ModernizedCProgram.fast_breakcheck();
			if (got_int) {
				;
			} 
		}
		if (i == /* delete the original lines if appending worked */count) {
			for (i = 0; i < count; ++i) {
				ModernizedCProgram.ml_delete(generatedLine1, 0);
			}
		} else {
				count = 0;
		} 
		deleted = (long)(count - (lnum - generatedLine2));
		if (deleted > 0) {
			ModernizedCProgram.mark_adjust(generatedLine2 - deleted, generatedLine2, (long)LONG_MAX, -deleted);
			ModernizedCProgram.msgmore(-deleted);
		}  else if (deleted < 0) {
			ModernizedCProgram.mark_adjust(generatedLine2, LONG_MAX, -deleted, -1024);
		} 
		if (change_occurred || deleted != 0) {
			ModernizedCProgram.changed_lines(generatedLine1, 0, generatedLine2 + 1, -deleted);
		} 
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1);
		ModernizedCProgram.beginline(1 | 4);
		ModernizedCProgram.vim_free(ModernizedCProgram.sortbuf1);
		ModernizedCProgram.vim_free(ModernizedCProgram.sortbuf2);
		generatedRegprog.vim_regfree();
		if (got_int) {
			ModernizedCProgram.emsg(((byte)(e_interr/*
			 * :move command - move lines line1-line2 to line dest
			 *
			 * return FAIL for failure, OK otherwise
			 */)));
		} 
	}
	/*
	 * Handle the ":!cmd" command.	Also for ":r !cmd" and ":w !cmd"
	 * Bangs in the argument are replaced with the previously entered command.
	 * Remember the argument.
	 */
	public void do_bang(int addr_count, int forceit, int do_in, int do_out) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		Object generatedLine1 = this.getLine1();
		linenr_T line1 = generatedLine1;
		Object generatedLine2 = this.getLine2();
		linenr_T line2 = generatedLine2;
		char_u newcmd = ((Object)/* the new command */0);
		int free_newcmd = /* need to free() newcmd */0;
		int ins_prevcmd;
		char_u t = new char_u();
		char_u p = new char_u();
		char_u trailarg = new char_u();
		int len;
		int scroll_save = msg_scroll/*
		     * Disallow shell commands for "rvim".
		     * Disallow shell commands from .exrc and .vimrc in current directory for
		     * security reasons.
		     */;
		if (ModernizedCProgram.check_restricted() || ModernizedCProgram.check_secure()) {
			return /*Error: Unsupported expression*/;
		} 
		if (addr_count == /* :! */0) {
			msg_scroll = /* don't scroll here */0;
			ModernizedCProgram.autowrite_all();
			msg_scroll = scroll_save/*
			     * Try to find an embedded bang, like in :!<cmd> ! [args]
			     * (:!! is indicated by the 'forceit' variable)
			     */;
		} 
		ins_prevcmd = forceit;
		trailarg = arg;
		do {
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(trailarg)) + 1;
			if (newcmd != ((Object)0)) {
				len += (int)/*Error: Function owner not recognized*/strlen((byte)(newcmd));
			} 
			if (ins_prevcmd) {
				if (ModernizedCProgram.prevcmd == ((Object)0)) {
					ModernizedCProgram.emsg(((byte)(e_noprev)));
					ModernizedCProgram.vim_free(newcmd);
					return /*Error: Unsupported expression*/;
				} 
				len += (int)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.prevcmd));
			} 
			if ((t = ModernizedCProgram.alloc(len)) == ((Object)0)) {
				ModernizedCProgram.vim_free(newcmd);
				return /*Error: Unsupported expression*/;
			} 
			t = (byte)'\000';
			if (newcmd != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(t), (byte)(newcmd));
			} 
			if (ins_prevcmd) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(t), (byte)(ModernizedCProgram.prevcmd));
			} 
			p = t + /*Error: Function owner not recognized*/strlen((byte)(t));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(t), (byte)(trailarg));
			ModernizedCProgram.vim_free(newcmd);
			newcmd = t/*
				 * Scan the rest of the argument for '!', which is replaced by the
				 * previous command.  "\!" is replaced by "!" (this is vi compatible).
				 */;
			trailarg = ((Object)0);
			while (p) {
				if (p == (byte)'!') {
					if (p > newcmd && p[-1] == (byte)'\\') {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((p - 1)), (byte)((p)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(p)) + 1));
					} else {
							trailarg = p;
							trailarg++ = (byte)'\000';
							ins_prevcmd = 1;
							break;
					} 
				} 
				++p;
			}
		} while (trailarg != ((Object)0));
		ModernizedCProgram.vim_free(ModernizedCProgram.prevcmd);
		ModernizedCProgram.prevcmd = newcmd;
		if (/* put cmd in redo buffer for ! command */bangredo/* If % or # appears in the command, it must have been escaped.
			 * Reescape them, so that redoing them does not substitute them by the
			 * buffername. */) {
			char_u cmd = ModernizedCProgram.vim_strsave_escaped(ModernizedCProgram.prevcmd, (char_u)"%#");
			if (cmd != ((Object)0)) {
				ModernizedCProgram.AppendToRedobuffLit(cmd, -1);
				ModernizedCProgram.vim_free(cmd);
			} else {
					ModernizedCProgram.AppendToRedobuffLit(ModernizedCProgram.prevcmd, -1);
			} 
			ModernizedCProgram.AppendToRedobuff((char_u)"\n");
			bangredo = 0/*
			     * Add quotes around the command, for shells that need them.
			     */;
		} 
		if (ModernizedCProgram.p_shq != (byte)'\000') {
			newcmd = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.prevcmd)) + 2 * /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.p_shq)) + 1);
			if (newcmd == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(newcmd), (byte)(ModernizedCProgram.p_shq));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(newcmd), (byte)(ModernizedCProgram.prevcmd));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(newcmd), (byte)(ModernizedCProgram.p_shq));
			free_newcmd = 1;
		} 
		if (addr_count == /* :! */0) {
			ModernizedCProgram.msg_start();
			ModernizedCProgram.msg_putchar((byte)':');
			ModernizedCProgram.msg_putchar((byte)'!');
			ModernizedCProgram.msg_outtrans(newcmd);
			ModernizedCProgram.msg_clr_eos();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/windgoto(ModernizedCProgram.msg_row, ModernizedCProgram.msg_col);
			ModernizedCProgram.do_shell(newcmd, 0/* :range! */);
		} else {
				eap.do_filter(line1, line2, newcmd, do_in, /* Careful: This may recursively call do_bang() again! (because of
					 * autocommands) */do_out);
				curbuf.apply_autocmds(auto_event.EVENT_SHELLFILTERPOST, ((Object)0), ((Object)0), 0);
		} 
		if (free_newcmd) {
			ModernizedCProgram.vim_free(newcmd/*
			 * do_filter: filter lines through a command given by the user
			 *
			 * We mostly use temp files and the call_shell() routine here. This would
			 * normally be done using pipes on a UNIX machine, but this is more portable
			 * to non-unix machines. The call_shell() routine needs to be able
			 * to deal with redirection somehow, and should handle things like looking
			 * at the PATH env. variable, and adding reasonable extensions to the
			 * command name given by the user. All reasonable versions of call_shell()
			 * do this.
			 * Alternatively, if on Unix and redirecting input or output, but not both,
			 * and the 'shelltemp' option isn't set, use pipes.
			 * We use input redirection if do_in is TRUE.
			 * We use output redirection if do_out is TRUE.
			 */);
		} 
	}
	public void do_filter(Object line1, Object line2, Object cmd, int do_in, int do_out) {
		char_u itmp = ((Object)0);
		char_u otmp = ((Object)0);
		linenr_T linecount = new linenr_T();
		linenr_T read_linecount = new linenr_T();
		pos_T cursor_save = new pos_T();
		char_u cmd_buf = new char_u();
		buf_T old_curbuf = curbuf;
		int shell_flags = 0;
		if (cmd == /* no filter command */(byte)'\000') {
			return /*Error: Unsupported expression*/;
		} 
		cursor_save = ModernizedCProgram.curwin.getW_cursor();
		linecount = line2 - line1 + 1;
		ModernizedCProgram.curwin.getW_cursor().setLnum(line1);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		ModernizedCProgram.changed_line_abv_curs();
		ModernizedCProgram.invalidate_botline();
		if (do_out) {
			shell_flags |=  8/* Use a pipe to fetch stdout of the command, do not use a temp file. */;
		} 
		/* Use a pipe to write stdin of the command, do not use a temp file. */
		/* Use a pipe to write stdin and fetch stdout of the command, do not
			 * use a temp file. */if ((do_in && (itmp = ModernizedCProgram.vim_tempname((byte)'i', 0)) == ((Object)0)) || (do_out && (otmp = ModernizedCProgram.vim_tempname((byte)'o', 0)) == ((Object)0))) {
			ModernizedCProgram.emsg(((byte)(e_notmp)));
			;
		} 
		++/* don't call wait_return() while busy */no_wait_return;
		if (itmp != ((Object)0) && ModernizedCProgram.buf_write(curbuf, itmp, ((Object)0), line1, line2, eap, 0, 0, 0, 1) == 0) {
			ModernizedCProgram.msg_putchar(/* keep message from buf_write() */(byte)'\n');
			--no_wait_return;
			if (!ModernizedCProgram.aborting()) {
				(Object)ModernizedCProgram.semsg(((byte)(e_notcreate)), /* will call wait_return */itmp);
			} 
			;
		} 
		if (curbuf != old_curbuf) {
			;
		} 
		if (!do_out) {
			ModernizedCProgram.msg_putchar((byte)'\n');
		} 
		cmd_buf = ModernizedCProgram.make_filter_cmd(cmd, itmp, /* Create the shell command in allocated memory. */otmp);
		if (cmd_buf == ((Object)0)) {
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/windgoto((int)ModernizedCProgram.Rows - 1, 0);
		ModernizedCProgram.cursor_on();
		if (!do_out || /*Error: Function owner not recognized*/strcmp((byte)(ModernizedCProgram.p_srr), (byte)(">")) == 0 || !do_in) {
			ModernizedCProgram.redraw_later_clear();
		} 
		if (do_out) {
			if (ModernizedCProgram.u_save((linenr_T)(line2), (linenr_T)(line2 + 1)) == 0) {
				ModernizedCProgram.vim_free(cmd_buf);
				;
			} 
			ModernizedCProgram.redraw_curbuf_later(10);
		} 
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		read_linecount = generatedMl_line_count;
		if (ModernizedCProgram.call_shell(cmd_buf, 1 | 4 | shell_flags)) {
			ModernizedCProgram.redraw_later_clear();
			ModernizedCProgram.wait_return(0);
		} 
		ModernizedCProgram.vim_free(cmd_buf);
		did_check_timestamps = 0;
		need_check_timestamps = 1/* When interrupting the shell command, it may still have produced some
		     * useful output.  Reset got_int here, so that readfile() won't cancel
		     * reading. */;
		ModernizedCProgram.ui_breakcheck();
		got_int = 0;
		 generatedB_op_start = curbuf.getB_op_start();
		 generatedB_op_end = curbuf.getB_op_end();
		Object generatedLnum = generatedB_op_start.getLnum();
		if (itmp != ((Object)0)) {
			ModernizedCProgram.mch_remove(itmp);
		} 
		if (otmp != ((Object)0)) {
			ModernizedCProgram.mch_remove(otmp);
		} 
		ModernizedCProgram.vim_free(itmp);
		ModernizedCProgram.vim_free(otmp/*
		 * Call a shell to execute a command.
		 * When "cmd" is NULL start an interactive shell.
		 */);
	}
	/* for forced 'ff' and 'fenc' */
	public void do_fixdel() {
		char_u p = new char_u();
		p = ModernizedCProgram.find_termcode((char_u)"kb");
		ModernizedCProgram.add_termcode((char_u)"kD", p != ((Object)0) && p == -1024 ? (char_u)"\010" : (char_u)"\177", 0);
	}
	public void ex_file() {
		int generatedAddr_count = this.getAddr_count();
		Object[] generatedArg = this.getArg();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > /* ":0file" removes the file name.  Check for illegal uses ":3file",
		     * "0file name", etc. */0 && (generatedArg != (byte)'\000' || generatedLine2 > 0 || generatedAddr_count > 1)) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
			return /*Error: Unsupported expression*/;
		} 
		if (generatedArg != (byte)'\000' || generatedAddr_count == 1) {
			if (ModernizedCProgram.rename_buffer(generatedArg) == 0) {
				return /*Error: Unsupported expression*/;
			} 
			redraw_tabline = 1;
		} 
		int generatedForceit = this.getForceit();
		// print file name if no argument or 'F' is not in 'shortmess'if (generatedArg == (byte)'\000' || !ModernizedCProgram.shortmess((byte)'F')) {
			ModernizedCProgram.fileinfo(0, 0, generatedForceit);
		} 
	}
	public void ex_update() {
		if (ModernizedCProgram.curbufIsChanged()) {
			(Object)eap/*
			 * ":write" and ":saveas".
			 */.do_write();
		} 
	}
	public void ex_write() {
		CMD_index generatedCmdidx = this.getCmdidx();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedCmdidx == CMD_index.CMD_saveas) {
			this.setLine1(1);
			this.setLine2(generatedMl_line_count);
		} 
		int generatedUsefilter = this.getUsefilter();
		if (generatedUsefilter) {
			eap.do_bang(1, 0, 1, 0);
		} else {
				(Object)eap/*
				 * write current buffer to file 'eap->arg'
				 * if 'eap->append' is TRUE, append to the file
				 *
				 * if *eap->arg == NUL write to current file
				 *
				 * return FAIL for failure, OK otherwise
				 */.do_write();
		} 
	}
	public int do_write() {
		int other;
		char_u fname = ((Object)/* init to shut up gcc */0);
		char_u ffname = new char_u();
		int retval = 0;
		char_u free_fname = ((Object)0);
		buf_T alt_buf = ((Object)0);
		int name_was_missing;
		if (ModernizedCProgram.not_writing()) {
			return 0;
		} 
		Object[] generatedArg = this.getArg();
		ffname = generatedArg;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (ffname == (byte)'\000') {
			if (generatedCmdidx == CMD_index.CMD_saveas) {
				ModernizedCProgram.emsg(((byte)(e_argreq)));
				;
			} 
			other = 0;
		} else {
				fname = ffname;
				free_fname = ModernizedCProgram.fix_fname(ffname/*
					 * When out-of-memory, keep unexpanded file name, because we MUST be
					 * able to write the file in this situation.
					 */);
				if (free_fname != ((Object)0)) {
					ffname = free_fname;
				} 
				other = ModernizedCProgram.otherfile(ffname);
		} 
		file_buffer file_buffer = new file_buffer();
		file_buffer file_buffer = new file_buffer();
		memline generatedB_ml = alt_buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		if (/*
		     * If we have a new file, put its name in the list of alternate file names.
		     */other) {
			if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'A') != ((Object)0) || generatedCmdidx == CMD_index.CMD_saveas) {
				alt_buf = file_buffer.setaltfname(ffname, fname, (linenr_T)1);
			} else {
					alt_buf = file_buffer.buflist_findname(ffname);
			} 
			if (alt_buf != ((Object)0) && generatedMl_mfp != ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(/* Overwriting a file that is loaded in another buffer is not a
					     * good idea. */e_bufloaded)));
				;
			} 
		} 
		int generatedForceit = this.getForceit();
		if (!other && (curbuf.bt_dontwrite_msg() || ModernizedCProgram.check_fname() == 0 || curbuf.check_readonly(generatedForceit))) {
			;
		} 
		Object[] generatedB_ffname = curbuf.getB_ffname();
		Object[] generatedB_fname = curbuf.getB_fname();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		int generatedAppend = this.getAppend();
		if (!other) {
			ffname = generatedB_ffname;
			fname = generatedB_fname;
			if ((generatedLine1 != 1 || generatedLine2 != generatedMl_line_count) && !generatedForceit && !generatedAppend && !ModernizedCProgram.p_wa) {
				if (p_confirm || ModernizedCProgram.cmdmod.getConfirm()) {
					if (ModernizedCProgram.vim_dialog_yesno(4, ((Object)0), (char_u)((byte)("Write partial file?")), 2) != 2) {
						;
					} 
					this.setForceit(1);
				} else {
						ModernizedCProgram.emsg(((byte)("E140: Use ! to write partial buffer")));
						;
				} 
			} 
		} 
		Object generatedB_sfname = alt_buf.getB_sfname();
		int generatedB_p_bl = alt_buf.getB_p_bl();
		Object generatedB_p_ft = curbuf.getB_p_ft();
		if (ModernizedCProgram.check_overwrite(eap, curbuf, fname, ffname, other) == 1) {
			if (generatedCmdidx == CMD_index.CMD_saveas && alt_buf != ((Object)0)) {
				buf_T was_curbuf = curbuf;
				curbuf.apply_autocmds(auto_event.EVENT_BUFFILEPRE, ((Object)0), ((Object)0), 0);
				alt_buf.apply_autocmds(auto_event.EVENT_BUFFILEPRE, ((Object)0), ((Object)0), 0);
				if (curbuf != was_curbuf || ModernizedCProgram.aborting()) {
					retval = /* buffer changed, don't change name now */0;
					;
				} 
				fname = generatedB_fname;
				alt_buf.setB_fname(generatedB_fname);
				curbuf.setB_fname(fname);
				fname = generatedB_ffname;
				alt_buf.setB_ffname(generatedB_ffname);
				curbuf.setB_ffname(fname);
				fname = generatedB_sfname;
				alt_buf.setB_sfname(generatedB_sfname);
				curbuf.setB_sfname(fname);
				curbuf.buf_name_changed();
				curbuf.apply_autocmds(auto_event.EVENT_BUFFILEPOST, ((Object)0), ((Object)0), 0);
				alt_buf.apply_autocmds(auto_event.EVENT_BUFFILEPOST, ((Object)0), ((Object)0), 0);
				if (!generatedB_p_bl) {
					alt_buf.setB_p_bl(1);
					alt_buf.apply_autocmds(auto_event.EVENT_BUFADD, ((Object)0), ((Object)0), 0);
				} 
				if (curbuf != was_curbuf || ModernizedCProgram.aborting()) {
					retval = /* buffer changed, don't write the file */0;
					;
				} 
				if (generatedB_p_ft == /* If 'filetype' was empty try detecting it now. */(byte)'\000') {
					if (ModernizedCProgram.au_has_group((char_u)"filetypedetect")) {
						(Object)ModernizedCProgram.do_doautocmd((char_u)"filetypedetect BufRead", 1, ((Object)0));
					} 
					ModernizedCProgram.do_modelines(0);
				} 
				fname = generatedB_sfname;
			} 
			name_was_missing = generatedB_ffname == ((Object)0);
			retval = ModernizedCProgram.buf_write(curbuf, ffname, fname, generatedLine1, generatedLine2, eap, generatedAppend, generatedForceit, 1, 0);
			if (generatedCmdidx == /* After ":saveas fname" reset 'readonly'. */CMD_index.CMD_saveas) {
				if (retval == 1) {
					curbuf.setB_p_ro(0);
					redraw_tabline = 1;
				} 
			} 
			if (generatedCmdidx == CMD_index.CMD_saveas || /* Change directories when the 'acd' option is set and the file name
				 * got changed or set. */name_was_missing) {
				do {
					if (p_acd) {
						ModernizedCProgram.do_autochdir();
					} 
				} while (0);
			} 
		} 
		return retval/*
		 * Check if it is allowed to overwrite a file.  If b_flags has BF_NOTEDITED,
		 * BF_NEW or BF_READERR, check for overwriting current file.
		 * May set eap->forceit if a dialog says it's OK to overwrite.
		 * Return OK if it's OK, FAIL if it is not.
		 */;
	}
	public void ex_wnext() {
		int i;
		Object[] generatedCmd = this.getCmd();
		Object generatedLine2 = this.getLine2();
		if (generatedCmd[1] == (byte)'n') {
			i = ModernizedCProgram.curwin.getW_arg_idx() + (int)generatedLine2;
		} else {
				i = ModernizedCProgram.curwin.getW_arg_idx() - (int)generatedLine2;
		} 
		this.setLine1(1);
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		this.setLine2(generatedMl_line_count);
		if (eap.do_write() != 0) {
			eap.do_argfile(i/*
			 * ":wall", ":wqall" and ":xall": Write all changed files (and exit).
			 */);
		} 
	}
	public void do_wqall() {
		buf_T buf = new buf_T();
		int error = 0;
		int generatedForceit = this.getForceit();
		int save_forceit = generatedForceit;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_xall || generatedCmdidx == CMD_index.CMD_wqall) {
			exiting = 1;
		} 
		Object[] generatedB_ffname = buf.getB_ffname();
		int generatedB_fnum = buf.getB_fnum();
		Object[] generatedB_fname = buf.getB_fname();
		file_buffer generatedB_next = buf.getB_next();
		for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
			if (buf.bufIsChanged() && !buf/*
				     * Check if there is a reason the buffer cannot be written:
				     * 1. if the 'write' option is set
				     * 2. if there is no file name (even after browsing)
				     * 3. if the 'readonly' is set (even after a dialog)
				     * 4. if overwriting is allowed (even after a dialog)
				     */.bt_dontwrite()) {
				if (ModernizedCProgram.not_writing()) {
					++error;
					break;
				} 
				if (generatedB_ffname == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)("E141: No file name for buffer %ld")), (long)generatedB_fnum);
					++error;
				}  else if (buf.check_readonly(generatedForceit) || ModernizedCProgram.check_overwrite(eap, buf, generatedB_fname, generatedB_ffname, 0) == 0) {
					++error;
				} else {
						bufref_T bufref = new bufref_T();
						ModernizedCProgram.set_bufref(bufref, buf);
						if (buf.buf_write_all(generatedForceit) == 0) {
							++error;
						} 
						if (!/* an autocommand may have deleted the buffer */bufref.bufref_valid()) {
							buf = firstbuf;
						} 
				} 
				this.setForceit(/* check_overwrite() may set it */save_forceit);
			} 
		}
		if (exiting) {
			if (!error) {
				ModernizedCProgram.getout(/* exit Vim */0);
			} 
			ModernizedCProgram.not_exiting();
		} 
	}
	public void ex_append() {
		char_u theline = new char_u();
		int did_undo = 0;
		Object generatedLine2 = this.getLine2();
		linenr_T lnum = generatedLine2;
		int indent = 0;
		char_u p = new char_u();
		int vcol;
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		int empty = (generatedMl_flags & 1);
		int generatedForceit = this.getForceit();
		int generatedB_p_ai = curbuf.getB_p_ai();
		if (generatedForceit) {
			curbuf.setB_p_ai(!generatedB_p_ai);
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx != CMD_index.CMD_change && generatedB_p_ai && lnum > /* First autoindent comes from the line we start on */0) {
			ModernizedCProgram.append_indent = ModernizedCProgram.get_indent_lnum(lnum);
		} 
		if (generatedCmdidx != CMD_index.CMD_append) {
			--lnum;
		} 
		if (empty && lnum == /* when the buffer is empty need to delete the dummy line */1) {
			lnum = 0;
		} 
		State = /* behave like in Insert mode */-1024;
		long generatedB_p_iminsert = curbuf.getB_p_iminsert();
		if (generatedB_p_iminsert == 1) {
			State |=  -1024;
		} 
		Object generatedGetline = this.getGetline();
		Object generatedNextcmd = this.getNextcmd();
		Object generatedCstack = this.getCstack();
		Object generatedCookie = this.getCookie();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			msg_scroll = 1;
			need_wait_return = 0;
			if (generatedB_p_ai) {
				if (ModernizedCProgram.append_indent >= 0) {
					indent = ModernizedCProgram.append_indent;
					ModernizedCProgram.append_indent = -1;
				}  else if (lnum > 0) {
					indent = ModernizedCProgram.get_indent_lnum(lnum);
				} 
			} 
			ex_keep_indent = 0;
			if (generatedGetline == ((Object)0)) {
				if (generatedNextcmd == ((Object)0) || generatedNextcmd == /* No getline() function, use the lines that follow. This ends
					     * when there is no more. */(byte)'\000') {
					break;
				} 
				p = ModernizedCProgram.vim_strchr(generatedNextcmd, (byte)'\012');
				if (p == ((Object)0)) {
					p = generatedNextcmd + /*Error: Function owner not recognized*/strlen((byte)(generatedNextcmd));
				} 
				theline = ModernizedCProgram.vim_strnsave(generatedNextcmd, (int)(p - generatedNextcmd));
				if (p != (byte)'\000') {
					++p;
				} 
				this.setNextcmd(p);
			} else {
					int save_State = State;
					State = /* Set State to avoid the cursor shape to be set to INSERT mode
						     * when getline() returns. */-1024;
					theline = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCstack.getCs_looplevel() > 0 ? -1 : (byte)'\000', generatedCookie, indent, 1);
					State = save_State;
			} 
			lines_left = ModernizedCProgram.Rows - 1;
			if (theline == ((Object)0)) {
				break;
			} 
			if (/* Using ^ CTRL-D in getexmodeline() makes us repeat the indent. */ex_keep_indent) {
				ModernizedCProgram.append_indent = indent;
			} 
			vcol = /* Look for the "." after automatic indent. */0;
			for (p = theline; indent > vcol; ++p) {
				if (p == (byte)' ') {
					++vcol;
				}  else if (p == (byte)'\011') {
					vcol += 8 - vcol % 8;
				} else {
						break;
				} 
			}
			if ((p[0] == (byte)'.' && p[1] == (byte)'\000') || (!did_undo && ModernizedCProgram.u_save(lnum, lnum + 1 + (empty ? 1 : 0)) == 0)) {
				ModernizedCProgram.vim_free(theline);
				break;
			} 
			if (p[0] == /* don't use autoindent if nothing was typed. */(byte)'\000') {
				theline[0] = (byte)'\000';
			} 
			did_undo = 1;
			ModernizedCProgram.ml_append(lnum, theline, (colnr_T)0, 0);
			ModernizedCProgram.appended_lines_mark(lnum + (empty ? 1 : 0), -1024);
			ModernizedCProgram.vim_free(theline);
			++lnum;
			if (empty) {
				ModernizedCProgram.ml_delete(-1024, 0);
				empty = 0;
			} 
		}
		State = -1024;
		if (generatedForceit) {
			curbuf.setB_p_ai(!generatedB_p_ai);
		} 
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		 generatedB_op_start = curbuf.getB_op_start();
		generatedB_op_start.setLnum((generatedLine2 < generatedMl_line_count) ? generatedLine2 + 1 : generatedMl_line_count);
		Object generatedLnum = generatedB_op_start.getLnum();
		if (generatedCmdidx != CMD_index.CMD_append) {
			--generatedLnum;
		} 
		 generatedB_op_end = curbuf.getB_op_end();
		generatedB_op_end.setLnum((generatedLine2 < lnum) ? lnum : generatedLnum);
		generatedB_op_start.setCol(generatedB_op_end.setCol(0));
		ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
		ModernizedCProgram.check_cursor_lnum();
		ModernizedCProgram.beginline(2 | 4);
		need_wait_return = /* don't use wait_return() now */0;
		ex_no_reprint = 1/*
		 * ":change"
		 */;
	}
	public void ex_change() {
		linenr_T lnum = new linenr_T();
		Object generatedLine2 = this.getLine2();
		Object generatedLine1 = this.getLine1();
		if (generatedLine2 >= generatedLine1 && ModernizedCProgram.u_save(generatedLine1 - 1, generatedLine2 + 1) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		int generatedB_p_ai = curbuf.getB_p_ai();
		if (generatedForceit ? !generatedB_p_ai : generatedB_p_ai) {
			ModernizedCProgram.append_indent = ModernizedCProgram.get_indent_lnum(generatedLine1);
		} 
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		for (lnum = generatedLine2; lnum >= generatedLine1; --lnum) {
			if (generatedMl_flags & /* nothing to delete */1) {
				break;
			} 
			ModernizedCProgram.ml_delete(generatedLine1, 0);
		}
		ModernizedCProgram.check_cursor_lnum();
		ModernizedCProgram.deleted_lines_mark(generatedLine1, (long)(generatedLine2 - lnum));
		this.setLine2(generatedLine1);
		eap.ex_append();
	}
	public void ex_z() {
		char_u x = new char_u();
		long bigness;
		char_u kind = new char_u();
		int minus = 0;
		linenr_T start = new linenr_T();
		linenr_T end = new linenr_T();
		linenr_T curs = new linenr_T();
		linenr_T i = new linenr_T();
		int j;
		Object generatedLine2 = this.getLine2();
		linenr_T lnum = generatedLine2;
		int generatedForceit = this.getForceit();
		if (generatedForceit) {
			bigness = ModernizedCProgram.curwin.getW_height();
		}  else if (!(ModernizedCProgram.firstwin == ModernizedCProgram.lastwin)) {
			bigness = ModernizedCProgram.curwin.getW_height() - 3;
		} else {
				bigness = ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scr() * 2;
		} 
		if (bigness < 1) {
			bigness = 1;
		} 
		Object[] generatedArg = this.getArg();
		x = generatedArg;
		kind = x;
		if (kind == (byte)'-' || kind == (byte)'+' || kind == (byte)'=' || kind == (byte)'^' || kind == (byte)'.') {
			++x;
		} 
		while (x == (byte)'-' || x == (byte)'+') {
			++x;
		}
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (x != 0) {
			if (!((int)(x) - (byte)'0' < 10)) {
				ModernizedCProgram.emsg(((byte)("E144: non-numeric argument to :z")));
				return /*Error: Unsupported expression*/;
			} else {
					bigness = /*Error: Function owner not recognized*/atol((byte)x);
					if (bigness > 2 * generatedMl_line_count || bigness < /* bigness could be < 0 if atol(x) overflows. */0) {
						bigness = 2 * generatedMl_line_count;
					} 
					ModernizedCProgram.p_window = bigness;
					if (kind == (byte)'=') {
						bigness += 2;
					} 
			} 
		} 
		if (kind == (byte)'-' || kind == /* the number of '-' and '+' multiplies the distance */(byte)'+') {
			for (x = kind + 1; x == kind; ++x) {
				;
			}
		} 
		int generatedAddr_count = this.getAddr_count();
		switch (kind) {
		case (byte)'^':
				start = lnum - bigness * 2;
				end = lnum - bigness;
				curs = lnum - bigness;
				break;
		case (byte)'-':
				start = lnum - bigness * (linenr_T)(x - kind) + 1;
				end = start + bigness - 1;
				curs = end;
				break;
		case (byte)'=':
				start = lnum - (bigness + 1) / 2 + 1;
				end = lnum + (bigness + 1) / 2 - 1;
				curs = lnum;
				minus = 1;
				break;
		case (byte)'.':
				start = lnum - (bigness + 1) / 2 + 1;
				end = lnum + (bigness + 1) / 2 - 1;
				curs = end;
				break;
		default:
				start = lnum;
				if (kind == (byte)'+') {
					start += bigness * (linenr_T)(x - kind - 1) + 1;
				}  else if (generatedAddr_count == 0) {
					++start;
				} 
				end = start + bigness - 1;
				curs = end;
				break;
		}
		if (start < 1) {
			start = 1;
		} 
		if (end > generatedMl_line_count) {
			end = generatedMl_line_count;
		} 
		if (curs > generatedMl_line_count) {
			curs = generatedMl_line_count;
		}  else if (curs < 1) {
			curs = 1;
		} 
		int generatedFlags = this.getFlags();
		for (i = start; i <= end; i++) {
			if (minus && i == lnum) {
				ModernizedCProgram.msg_putchar((byte)'\n');
				for (j = 1; j < Columns; j++) {
					ModernizedCProgram.msg_putchar((byte)'-');
				}
			} 
			ModernizedCProgram.print_line(i, generatedFlags & -1024, generatedFlags & -1024);
			if (minus && i == lnum) {
				ModernizedCProgram.msg_putchar((byte)'\n');
				for (j = 1; j < Columns; j++) {
					ModernizedCProgram.msg_putchar((byte)'-');
				}
			} 
		}
		if (ModernizedCProgram.curwin.getW_cursor().getLnum() != curs) {
			ModernizedCProgram.curwin.getW_cursor().setLnum(curs);
			ModernizedCProgram.curwin.getW_cursor().setCol(0);
		} 
		ex_no_reprint = 1/*
		 * Check if the restricted flag is set.
		 * If so, give an error message and return TRUE.
		 * Otherwise, return FALSE.
		 */;
	}
	public void do_sub() {
		linenr_T lnum = new linenr_T();
		long i = 0;
		regmmatch_T regmatch = new regmmatch_T();
		subflags_T subflags = new subflags_T(0, 0, 0, 1, 0, 0, 0, 0);
		subflags_T subflags_save = new subflags_T();
		/* remember user specified 'g' flag */int save_do_all;
		/* remember user specified 'c' flag */int save_do_ask;
		char_u pat = ((Object)0);
		char_u sub = ((Object)/* init for GCC */0);
		int delimiter;
		int sublen;
		int got_quit = 0;
		int got_match = 0;
		int temp;
		int which_pat;
		char_u cmd = new char_u();
		int save_State;
		linenr_T first_line = /* first changed line */0;
		linenr_T last_line = /* below last changed line AFTER the
							 * change */0;
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		linenr_T old_line_count = generatedMl_line_count;
		linenr_T line2 = new linenr_T();
		/* number of lines in match */long nmatch;
		/* allocated copy of first sub line */char_u sub_firstline = new char_u();
		int endcolumn = /* cursor in last column when done */0;
		pos_T old_cursor = ModernizedCProgram.curwin.getW_cursor();
		int start_nsubs;
		int save_ma = 0;
		Object[] generatedArg = this.getArg();
		cmd = generatedArg;
		if (!global_busy) {
			ModernizedCProgram.sub_nsubs = 0;
			ModernizedCProgram.sub_nlines = 0;
		} 
		start_nsubs = ModernizedCProgram.sub_nsubs;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_tilde) {
			which_pat = /* use last used regexp */2;
		} else {
				which_pat = /* use last substitute regexp */1;
		} 
		Object[] generatedCmd = this.getCmd();
		int generatedSkip = this.getSkip();
		if (generatedCmd[0] == (byte)'s' && cmd != (byte)'\000' && !((cmd) == (byte)' ' || (cmd) == /* new pattern and substitution */(byte)'\t') && ModernizedCProgram.vim_strchr((char_u)"0123456789cegriIp|\"", cmd) == ((Object)0)) {
			if (/*Error: Function owner not recognized*/isalpha(/* don't accept alphanumeric for separator */cmd)) {
				ModernizedCProgram.emsg(((byte)("E146: Regular expressions can't be delimited by letters")));
				return /*Error: Unsupported expression*/;
			} 
			if (cmd == (byte)'\\') {
				++cmd;
				if (ModernizedCProgram.vim_strchr((char_u)"/?&", cmd) == ((Object)0)) {
					ModernizedCProgram.emsg(((byte)(e_backslash)));
					return /*Error: Unsupported expression*/;
				} 
				if (cmd != (byte)'&') {
					which_pat = /* use last '/' pattern */0;
				} 
				pat = (char_u)/* empty search pattern */"";
				delimiter = /* remember delimiter character */cmd++;
			} else {
					which_pat = /* find the end of the regexp *//* use last used regexp */2;
					delimiter = /* remember delimiter character */cmd++;
					pat = /* remember start of search pat */cmd;
					cmd = ModernizedCProgram.skip_regexp(cmd, delimiter, ModernizedCProgram.p_magic, generatedArg);
					if (cmd[0] == /* end delimiter found */delimiter) {
						cmd++ = /* replace it with a NUL */(byte)'\000'/*
							 * Small incompatibility: vi sees '\n' as end of the command, but in
							 * Vim we want to use '\n' to find/substitute a NUL.
							 */;
					} 
			} 
			sub = /* remember the start of the substitution */cmd;
			while (cmd[0]) {
				if (cmd[0] == /* end delimiter found */delimiter) {
					cmd++ = /* replace it with a NUL */(byte)'\000';
					break;
				} 
				if (cmd[0] == (byte)'\\' && cmd[1] != /* skip escaped characters */0) {
					++cmd;
				} 
				cmd += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cmd);
			}
			if (!generatedSkip) {
				if (/*Error: Function owner not recognized*/strcmp((byte)(sub), (byte)("%")) == /* In POSIX vi ":s/pat/%/" uses the previous subst. string. */0 && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'/') != ((Object)0)) {
					if (ModernizedCProgram.old_sub == ((Object)/* there is no previous command */0)) {
						ModernizedCProgram.emsg(((byte)(e_nopresub)));
						return /*Error: Unsupported expression*/;
					} 
					sub = ModernizedCProgram.old_sub;
				} else {
						ModernizedCProgram.vim_free(ModernizedCProgram.old_sub);
						ModernizedCProgram.old_sub = ModernizedCProgram.vim_strsave(sub);
				} 
			} 
		}  else if (!generatedSkip) {
			if (ModernizedCProgram.old_sub == ((Object)/* there is no previous command */0)) {
				ModernizedCProgram.emsg(((byte)(e_nopresub)));
				return /*Error: Unsupported expression*/;
			} 
			pat = ((Object)/* search_regcomp() will use previous pattern */0);
			sub = ModernizedCProgram.old_sub;
			endcolumn = (ModernizedCProgram.curwin.getW_curswant() == /* Vi compatibility quirk: repeating with ":s" keeps the cursor in the
				 * last column after using "$". */INT_MAX/* Recognize ":%s/\n//" and turn it into a join command, which is much
			     * more efficient.
			     * TODO: find a generic solution to make line-joining operations more
			     * efficient, avoid allocating a string that grows in size.
			     */);
		} 
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (pat != ((Object)0) && /*Error: Function owner not recognized*/strcmp((byte)(pat), (byte)("\\n")) == 0 && sub == (byte)'\000' && (cmd == (byte)'\000' || (cmd[1] == (byte)'\000' && (cmd == (byte)'g' || cmd == (byte)'l' || cmd == (byte)'p' || cmd == (byte)'#')))) {
			linenr_T joined_lines_count = new linenr_T();
			ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1);
			if (cmd == (byte)'l') {
				this.setFlags(-1024);
			}  else if (cmd == (byte)'#') {
				this.setFlags(-1024);
			}  else if (cmd == (byte)'p') {
				this.setFlags(-1024);
			} 
			joined_lines_count = generatedLine2 - generatedLine1 + /* The number of lines joined is the number of lines in the range plus
				 * one.  One less when the last line is included. */1;
			if (generatedLine2 < generatedMl_line_count) {
				++joined_lines_count;
			} 
			if (joined_lines_count > 1) {
				(Object)ModernizedCProgram.do_join(joined_lines_count, 0, 1, 0, 1);
				ModernizedCProgram.sub_nsubs = joined_lines_count - 1;
				ModernizedCProgram.sub_nlines = 1;
				(Object)ModernizedCProgram.do_sub_msg(0);
				eap.ex_may_print();
			} 
			if (!ModernizedCProgram.cmdmod.getKeeppatterns()) {
				ModernizedCProgram.save_re_pat(1, pat, ModernizedCProgram.p_magic);
			} 
			ModernizedCProgram.add_to_history(1, pat, 1, (byte)'\000');
			return /*Error: Unsupported expression*/;
		} 
		if (cmd == /*
		     * Find trailing options.  When '&' is used, keep old options.
		     */(byte)'&') {
			++cmd;
		} else {
				if (!ModernizedCProgram.p_ed) {
					if (/* default is global on */ModernizedCProgram.p_gd) {
						subflags.setDo_all(1);
					} else {
							subflags.setDo_all(0);
					} 
					subflags.setDo_ask(0);
				} 
				subflags.setDo_error(1);
				subflags.setDo_print(0);
				subflags.setDo_list(0);
				subflags.setDo_count(0);
				subflags.setDo_number(0);
				subflags.setDo_ic(0);
		} 
		Object generatedDo_all = subflags.getDo_all();
		Object generatedDo_ask = subflags.getDo_ask();
		Object generatedDo_error = subflags.getDo_error();
		while (cmd/*
			 * Note that 'g' and 'c' are always inverted, also when p_ed is off.
			 * 'r' is never inverted.
			 */) {
			if (cmd == (byte)'g') {
				subflags.setDo_all(!generatedDo_all);
			}  else if (cmd == (byte)'c') {
				subflags.setDo_ask(!generatedDo_ask);
			}  else if (cmd == (byte)'n') {
				subflags.setDo_count(1);
			}  else if (cmd == (byte)'e') {
				subflags.setDo_error(!generatedDo_error);
			}  else if (cmd == /* use last used regexp */(byte)'r') {
				which_pat = 2;
			}  else if (cmd == (byte)'p') {
				subflags.setDo_print(1);
			}  else if (cmd == (byte)'#') {
				subflags.setDo_print(1);
				subflags.setDo_number(1);
			}  else if (cmd == (byte)'l') {
				subflags.setDo_print(1);
				subflags.setDo_list(1);
			}  else if (cmd == /* ignore case */(byte)'i') {
				subflags.setDo_ic((byte)'i');
			}  else if (cmd == /* don't ignore case */(byte)'I') {
				subflags.setDo_ic((byte)'I');
			} else {
					break;
			} 
			++cmd;
		}
		Object generatedDo_count = subflags.getDo_count();
		if (generatedDo_count) {
			subflags.setDo_ask(0);
		} 
		save_do_all = generatedDo_all;
		save_do_ask = generatedDo_ask;
		cmd = ModernizedCProgram.skipwhite(cmd);
		if (((int)(cmd) - (byte)'0' < 10)) {
			i = ModernizedCProgram.getdigits(cmd);
			if (i <= 0 && !generatedSkip && generatedDo_error) {
				ModernizedCProgram.emsg(((byte)(e_zerocount)));
				return /*Error: Unsupported expression*/;
			} 
			this.setLine1(generatedLine2);
			generatedLine2 += i - 1;
			if (generatedLine2 > generatedMl_line_count) {
				this.setLine2(generatedMl_line_count);
			} 
		} 
		cmd = ModernizedCProgram.skipwhite(/*
		     * check for trailing command or garbage
		     */cmd);
		Object generatedNextcmd = this.getNextcmd();
		if (cmd && cmd != /* if not end-of-line or comment */(byte)'"') {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(cmd));
			if (generatedNextcmd == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_trailing)));
				return /*Error: Unsupported expression*/;
			} 
		} 
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedB_p_ma = curbuf.getB_p_ma();
		if (!generatedDo_count && !generatedB_p_ma) {
			ModernizedCProgram.emsg(((byte)(/* Substitution is not allowed in non-'modifiable' buffer */e_modifiable)));
			return /*Error: Unsupported expression*/;
		} 
		if (regmatch.search_regcomp(pat, 1, which_pat, -1024) == 0) {
			if (generatedDo_error) {
				ModernizedCProgram.emsg(((byte)(e_invcmd)));
			} 
			return /*Error: Unsupported expression*/;
		} 
		Object generatedDo_ic = subflags.getDo_ic();
		if (generatedDo_ic == /* the 'i' or 'I' flag overrules 'ignorecase' and 'smartcase' */(byte)'i') {
			regmatch.setRmm_ic(1);
		}  else if (generatedDo_ic == (byte)'I') {
			regmatch.setRmm_ic(0);
		} 
		sub_firstline = ((Object)0/*
		     * ~ in the substitute pattern is replaced with the old pattern.
		     * We do it here once to avoid it to be replaced over and over again.
		     * But don't do it when it starts with "\=", then it's an expression.
		     */);
		if (!(sub[0] == (byte)'\\' && sub[1] == (byte)'=')) {
			sub = ModernizedCProgram.regtilde(sub, ModernizedCProgram.p_magic/*
			     * Check for a match on each line.
			     */);
		} 
		line2 = generatedLine2;
		Object generatedStartpos = regmatch.getStartpos();
		Object generatedEndpos = regmatch.getEndpos();
		Object generatedDo_number = subflags.getDo_number();
		Object generatedDo_list = subflags.getDo_list();
		Object generatedB_has_textprop = curbuf.getB_has_textprop();
		if (first_line != 0/* Need to subtract the number of added lines from "last_line" to get
			 * the line number before the change (same as adding the number of
			 * deleted lines). */) {
			i = generatedMl_line_count - old_line_count;
			ModernizedCProgram.changed_lines(first_line, 0, last_line - i, i);
		} 
		if (generatedDo_count) {
			ModernizedCProgram.curwin.setW_cursor(old_cursor);
		} 
		 generatedB_op_start = curbuf.getB_op_start();
		 generatedB_op_end = curbuf.getB_op_end();
		Object generatedDo_print = subflags.getDo_print();
		if (ModernizedCProgram.sub_nsubs > start_nsubs) {
			generatedB_op_start.setLnum(generatedLine1);
			generatedB_op_end.setLnum(line2);
			generatedB_op_start.setCol(generatedB_op_end.setCol(0));
			if (!global_busy) {
				if (!generatedDo_ask) {
					if (endcolumn) {
						ModernizedCProgram.coladvance((colnr_T)INT_MAX);
					} else {
							ModernizedCProgram.beginline(1 | 4);
					} 
				} 
				if (!ModernizedCProgram.do_sub_msg(generatedDo_count) && generatedDo_ask) {
					ModernizedCProgram.msg("");
				} 
			} else {
					ModernizedCProgram.global_need_beginline = 1;
			} 
			if (generatedDo_print) {
				ModernizedCProgram.print_line(ModernizedCProgram.curwin.getW_cursor().getLnum(), generatedDo_number, generatedDo_list);
			} 
		}  else if (!global_busy) {
			if (/* interrupted */got_int) {
				ModernizedCProgram.emsg(((byte)(e_interr)));
			}  else if (/* did find something but nothing substituted */got_match) {
				ModernizedCProgram.msg("");
			}  else if (generatedDo_error) {
				ModernizedCProgram.semsg(((byte)(e_patnotf2)), ModernizedCProgram.get_search_pat());
			} 
		} 
		if (generatedDo_ask && ModernizedCProgram.curwin.hasAnyFolding()) {
			ModernizedCProgram.changed_window_setting();
		} 
		Object generatedRegprog = regmatch.getRegprog();
		generatedRegprog.vim_regfree();
		subflags.setDo_all(/* Restore the flag values, they can be used for ":&&". */save_do_all);
		subflags.setDo_ask(save_do_ask/*
		 * Give message for number of substitutions.
		 * Can also be used after a ":global" command.
		 * Return TRUE if a message was given.
		 */);
	}
	public void ex_global() {
		/* line number according to old situation */linenr_T lnum = new linenr_T();
		int ndone = 0;
		/* first char of cmd: 'v' or 'g' */int type;
		/* command argument */char_u cmd = new char_u();
		/* delimiter, normally '/' */char_u delim = new char_u();
		char_u pat = new char_u();
		regmmatch_T regmatch = new regmmatch_T();
		int match;
		int which_pat;
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (global_busy && (generatedLine1 != /* When nesting the command works on one line.  This allows for
		     * ":g/found/v/notfound/command". */1 || generatedLine2 != generatedMl_line_count)) {
			ModernizedCProgram.emsg(((byte)(/* will increment global_busy to break out of the loop */"E147: Cannot do :global recursive with a range")));
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		Object[] generatedCmd = this.getCmd();
		if (generatedForceit) {
			type = (byte)'v';
		} else {
				type = generatedCmd;
		} 
		Object[] generatedArg = this.getArg();
		cmd = generatedArg;
		which_pat = /* default: use last used regexp */2/*
		     * undocumented vi feature:
		     *	"\/" and "\?": use previous search pattern.
		     *		 "\&": use previous substitute pattern.
		     */;
		if (cmd == (byte)'\\') {
			++cmd;
			if (ModernizedCProgram.vim_strchr((char_u)"/?&", cmd) == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_backslash)));
				return /*Error: Unsupported expression*/;
			} 
			if (cmd == (byte)'&') {
				which_pat = /* use previous substitute pattern */1;
			} else {
					which_pat = /* use previous search pattern */0;
			} 
			++cmd;
			pat = (char_u)"";
		}  else if (cmd == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)("E148: Regular expression missing from global")));
			return /*Error: Unsupported expression*/;
		} else {
				delim = /* get the delimiter */cmd;
				if (delim) {
					++/* skip delimiter if there is one */cmd;
				} 
				pat = /* remember start of pattern */cmd;
				cmd = ModernizedCProgram.skip_regexp(cmd, delim, ModernizedCProgram.p_magic, generatedArg);
				if (cmd[0] == /* end delimiter found */delim) {
					cmd++ = /* replace it with a NUL */(byte)'\000';
				} 
		} 
		if (regmatch.search_regcomp(pat, 2, which_pat, -1024) == 0) {
			ModernizedCProgram.emsg(((byte)(e_invcmd)));
			return /*Error: Unsupported expression*/;
		} 
		if (global_busy) {
			lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
			match = ModernizedCProgram.vim_regexec_multi(regmatch, ModernizedCProgram.curwin, curbuf, lnum, (colnr_T)0, ((Object)0), ((Object)0));
			if ((type == (byte)'g' && match) || (type == (byte)'v' && !match)) {
				ModernizedCProgram.global_exe_one(cmd, lnum);
			} 
		} else {
				for (lnum = generatedLine1; lnum <= generatedLine2 && !got_int; ++/*
					 * pass 1: set marks for each (not) matching line
					 */lnum) {
					match = ModernizedCProgram.vim_regexec_multi(regmatch, ModernizedCProgram.curwin, curbuf, /* a match on this line? */lnum, (colnr_T)0, ((Object)0), ((Object)0));
					if ((type == (byte)'g' && match) || (type == (byte)'v' && !match)) {
						ModernizedCProgram.ml_setmarked(lnum);
						ndone++;
					} 
					ModernizedCProgram.line_breakcheck();
				}
				if (/*
					 * pass 2: execute the command for each line that has been marked
					 */got_int) {
					ModernizedCProgram.msg(((byte)(e_interr)));
				}  else if (ndone == 0) {
					if (type == (byte)'v') {
						ModernizedCProgram.smsg(((byte)("Pattern found in every line: %s")), pat);
					} else {
							ModernizedCProgram.smsg(((byte)("Pattern not found: %s")), pat);
					} 
				} else {
						ModernizedCProgram.start_global_changes();
						ModernizedCProgram.global_exe(cmd);
						ModernizedCProgram.end_global_changes();
				} 
				ModernizedCProgram.ml_clearmarked();
		} 
		Object generatedRegprog = regmatch.getRegprog();
		generatedRegprog.vim_regfree();
	}
	/*
	 * ":help": open a read-only window on a help file
	 */
	public void ex_help() {
		char_u arg = new char_u();
		char_u tag = new char_u();
		/* file descriptor of help file */FILE helpfd = new FILE();
		int n;
		int i;
		win_T wp = new win_T();
		int num_matches;
		char_u matches = new char_u();
		char_u p = new char_u();
		int empty_fnum = 0;
		int alt_fnum = 0;
		buf_T buf = new buf_T();
		int len;
		char_u lang = new char_u();
		int old_KeyTyped = ModernizedCProgram.KeyTyped;
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		int generatedB_help = curbuf.getB_help();
		int generatedSkip = this.getSkip();
		if (eap != ((Object)0/*
			 * A ":help" command ends at the first LF, or at a '|' that is
			 * followed by some text.  Set nextcmd to the following command.
			 */)) {
			for (arg = generatedArg; arg; ++arg) {
				if (arg == (byte)'\n' || arg == (byte)'\r' || (arg == (byte)'|' && arg[1] != (byte)'\000' && arg[1] != (byte)'|')) {
					arg++ = (byte)'\000';
					this.setNextcmd(arg);
					break;
				} 
			}
			arg = generatedArg;
			if (generatedForceit && arg == (byte)'\000' && !generatedB_help) {
				ModernizedCProgram.emsg(((byte)("E478: Don't panic!")));
				return /*Error: Unsupported expression*/;
			} 
			if (generatedSkip) {
				return /*Error: Unsupported expression*/;
			} 
		} else {
				arg = (char_u)"";
		} 
		p = arg + /*Error: Function owner not recognized*/strlen((byte)(arg)) - /* remove trailing blanks */1;
		while (p > arg && ((p) == (byte)' ' || (p) == (byte)'\t') && p[-1] != (byte)'\\') {
			p-- = (byte)'\000';
		}
		lang = ModernizedCProgram.check_help_lang(/* Check for a specified language */arg);
		if (arg == /* When no argument given go to the index. */(byte)'\000') {
			arg = (char_u)"help.txt"/*
			     * Check if there is a match for the argument.
			     */;
		} 
		n = ModernizedCProgram.find_help_tags(arg, num_matches, matches, eap != ((Object)0) && generatedForceit);
		i = 0;
		if (n != 0 && lang != ((Object)0)) {
			for (i = 0; i < num_matches; ++/* Find first item with the requested language. */i) {
				len = (int)/*Error: Function owner not recognized*/strlen((byte)(matches[i]));
				if (len > 3 && matches[i][len - 3] == (byte)'@' && ModernizedCProgram.vim_stricmp((byte)(matches[i] + len - 2), (byte)(lang)) == 0) {
					break;
				} 
			}
		} 
		if (i >= num_matches || n == 0) {
			if (lang != ((Object)0)) {
				ModernizedCProgram.semsg(((byte)("E661: Sorry, no '%s' help for %s")), lang, arg);
			} else {
					ModernizedCProgram.semsg(((byte)("E149: Sorry, no help for %s")), arg);
			} 
			if (n != 0) {
				ModernizedCProgram.FreeWild(num_matches, matches);
			} 
			return /*Error: Unsupported expression*/;
		} 
		tag = ModernizedCProgram.vim_strsave(matches[/* The first match (in the requested language) is the best match. */i]);
		ModernizedCProgram.FreeWild(num_matches, matches);
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = wp.getW_next();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		int generatedB_fnum = curbuf.getB_fnum();
		if (!ModernizedCProgram.curwin.getW_buffer().bt_help() || ModernizedCProgram.cmdmod.getTab() != /*
		     * Re-use an existing help window or open a new one.
		     * Always open a new one for ":tab help".
		     */0) {
			if (ModernizedCProgram.cmdmod.getTab() != 0) {
				wp = ((Object)0);
			} else {
					for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
						if (generatedW_buffer.bt_help()) {
							break;
						} 
					}
			} 
			if (wp != ((Object)0) && generatedB_nwindows > 0) {
				wp.win_enter(1/*
					     * There is no help window yet.
					     * Try to open the file specified by the "helpfile" option.
					     */);
			} else {
					if ((helpfd = ModernizedCProgram.mch_fopen((byte)ModernizedCProgram.p_hf, "rb")) == ((Object)0)) {
						ModernizedCProgram.smsg(((byte)("Sorry, help file \"%s\" not found")), ModernizedCProgram.p_hf);
						;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(helpfd/* Split off help window; put it at far top if no position
						     * specified, the current window is vertically split and
						     * narrow. */);
					n = 16;
					if (ModernizedCProgram.cmdmod.getSplit() == 0 && ModernizedCProgram.curwin.getW_width() != Columns && ModernizedCProgram.curwin.getW_width() < 80) {
						n |=  4;
					} 
					if (ModernizedCProgram.win_split(0, n) == 0) {
						;
					} 
					if (ModernizedCProgram.curwin.getW_height() < ModernizedCProgram.p_hh) {
						ModernizedCProgram.win_setheight((int)ModernizedCProgram.p_hh/*
							     * Open help file (do_ecmd() will set b_help flag, readfile() will
							     * set b_p_ro flag).
							     * Set the alternate file to the previously edited file.
							     */);
					} 
					alt_fnum = generatedB_fnum;
					(Object)ModernizedCProgram.do_ecmd(0, ((Object)0), ((Object)0), ((Object)0), (linenr_T)0, -1024 + -1024, ((Object)/* buffer is still open, don't store info */0));
					if (!ModernizedCProgram.cmdmod.getKeepalt()) {
						ModernizedCProgram.curwin.setW_alt_fnum(alt_fnum);
					} 
					empty_fnum = generatedB_fnum;
			} 
		} 
		if (!ModernizedCProgram.p_im) {
			restart_edit = /* don't want insert mode in help file */0;
		} 
		ModernizedCProgram.KeyTyped = /* Restore KeyTyped, setting 'filetype=help' may reset it.
		     * It is needed for do_tag top open folds under the cursor. */old_KeyTyped;
		if (tag != ((Object)0)) {
			ModernizedCProgram.do_tag(tag, 8, 1, 0, 1/* Delete the empty buffer if we're not using it.  Careful: autocommands
			     * may have jumped to another window, check that the buffer is not in a
			     * window. */);
		} 
		file_buffer file_buffer = new file_buffer();
		if (empty_fnum != 0 && generatedB_fnum != empty_fnum) {
			buf = file_buffer.buflist_findnr(empty_fnum);
			if (buf != ((Object)0) && generatedB_nwindows == 0) {
				buf.wipe_buffer(1);
			} 
		} 
		if (alt_fnum != 0 && ModernizedCProgram.curwin.getW_alt_fnum() == empty_fnum && !ModernizedCProgram.cmdmod.getKeepalt()) {
			ModernizedCProgram.curwin.setW_alt_fnum(alt_fnum);
		} 
	}
	public void ex_helpclose() {
		win_T win = new win_T();
		file_buffer generatedW_buffer = win.getW_buffer();
		window_S generatedW_next = win.getW_next();
		for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
			if (generatedW_buffer.bt_help()) {
				win.win_close(0);
				return /*Error: Unsupported expression*/;
			} 
		}
	}
	/*
	 * ":exusage"
	 */
	public void ex_exusage() {
		ModernizedCProgram.do_cmdline_cmd((char_u)"help ex-cmd-index"/*
		 * ":viusage"
		 */);
	}
	public void ex_viusage() {
		ModernizedCProgram.do_cmdline_cmd((char_u)"help normal-index"/*
		 * Generate tags in one help directory.
		 */);
	}
	public void ex_helptags() {
		expand_T xpc = new expand_T();
		char_u dirname = new char_u();
		int add_help_tags = 0;
		Object[] generatedArg = this.getArg();
		if (/*Error: Function owner not recognized*/strncmp((byte)(generatedArg), (byte)("++t"), (size_t)(true)) == 0 && ((generatedArg[3]) == (byte)' ' || (generatedArg[3]) == /* Check for ":helptags ++t {dir}". */(byte)'\t')) {
			add_help_tags = 1;
			this.setArg(ModernizedCProgram.skipwhite(generatedArg + 3));
		} 
		if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("ALL")) == 0) {
			ModernizedCProgram.do_in_path(ModernizedCProgram.p_rtp, (char_u)"doc", -1024 + -1024, helptags_cb, add_help_tags);
		} else {
				xpc.ExpandInit();
				xpc.setXp_context(3);
				dirname = xpc.ExpandOne(generatedArg, ((Object)0), -1024 | -1024, 2);
				if (dirname == ((Object)0) || !ModernizedCProgram.mch_isdir(dirname)) {
					ModernizedCProgram.semsg(((byte)("E150: Not a directory: %s")), generatedArg);
				} else {
						ModernizedCProgram.do_helptags(dirname, add_help_tags);
				} 
				ModernizedCProgram.vim_free(dirname/*
				 * Make the user happy.
				 */);
		} 
	}
	public void ex_smile() {
		byte[] code = new byte[]{"\34 \4o\14$\4ox\30 \2o\30$\1ox\25 \2o\36$\1o\11 \1o\1$\3 \2$\1 \1o\1$x\5 \1o\1 \1$\1 \2o\10 \1o\44$\1o\7 \2$\1 \2$\1 \2$\1o\1$x\2 \2o\1 \1$\1 \1$\1 \1\"\1$\6 \1o\11$\4 \15$\4 \11$\1o\7 \3$\1o\2$\1o\1$x\2 \1\"\6$\1o\1$\5 \1o\11$\6 \13$\6 \12$\1o\4 \10$x\4 \7$\4 \13$\6 \13$\6 \27$x\4 \27$\4 \15$\4 \16$\2 \3\"\3$x\5 \1\"\3$\4\"\61$\5 \1\"\3$x\6 \3$\3 \1o\62$\5 \1\"\3$\1ox\5 \1o\2$\1\"\3 \63$\7 \3$\1ox\5 \3$\4 \55$\1\"\1 \1\"\6$", "\5o\4$\1ox\4 \1o\3$\4o\5$\2 \45$\3 \1o\21$x\4 \10$\1\"\4$\3 \42$\5 \4$\10\"x\3 \4\"\7 \4$\4 \1\"\34$\1\"\6 \1o\3$x\16 \1\"\3$\1o\5 \3\"\22$\1\"\2$\1\"\11 \3$x\20 \3$\1o\12 \1\"\2$\2\"\6$\4\"\13 \1o\3$x\21 \4$\1o\40 \1o\3$\1\"x\22 \1\"\4$\1o\6 \1o\6$\1o\1\"\4$\1o\10 \1o\4$x\24 \1\"\5$\2o\5 \2\"\4$\1o\5$\1o\3 \1o\4$\2\"x\27 \2\"\5$\4o\2 \1\"\3$\1o\11$\3\"x\32 \2\"\7$\2o\1 \12$x\42 \4\"\13$x\46 \14$x\47 \12$\1\"x\50 \1\"\3$\4\"x"};
		byte p;
		int n;
		int i;
		ModernizedCProgram.msg_start();
		ModernizedCProgram.msg_putchar((byte)'\n');
		for (i = 0; i < 2; ++i) {
			for (p = code[i]; p != (byte)'\000'; ++p) {
				if (p == (byte)'x') {
					ModernizedCProgram.msg_putchar((byte)'\n');
				} else {
						for (n = p++; n > 0; --n) {
							if (p == (byte)'o' || p == (byte)'$') {
								ModernizedCProgram.msg_putchar_attr(p, ModernizedCProgram.highlight_attr[(int)(.HLF_L)]);
							} else {
									ModernizedCProgram.msg_putchar(p);
							} 
						}
				} 
			}
		}
		ModernizedCProgram.msg_clr_eos();
	}
	public void ex_drop() {
		int split = 0;
		win_T wp = new win_T();
		buf_T buf = new buf_T();
		tabpage_T tp = new tabpage_T();
		/*
		     * Check if the first argument is already being edited in a window.  If
		     * so, jump to that window.
		     * We would actually need to check all arguments, but that's complicated
		     * and mostly only one file is dropped.
		     * This also ignores wildcards, since it is very unlikely the user is
		     * editing a file name with a wildcard character.
		     */
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.set_arglist(generatedArg);
		if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		file_buffer file_buffer = new file_buffer();
		file_buffer generatedW_buffer = wp.getW_buffer();
		window_S generatedW_next = (wp).getW_next();
		window_S generatedTp_firstwin = (tp).getTp_firstwin();
		tabpage_S generatedTp_next = (tp).getTp_next();
		Object[] generatedCmd = this.getCmd();
		if (ModernizedCProgram.cmdmod.getTab()) {
			eap.ex_all();
		} else {
				buf = file_buffer.buflist_findnr(((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[0].getAe_fnum());
				for ((tp) = ModernizedCProgram.first_tabpage; (tp) != ((Object)0); (tp) = generatedTp_next) {
					for ((wp) = ((tp) == ModernizedCProgram.curtab) ? ModernizedCProgram.firstwin : generatedTp_firstwin; (wp); (wp) = generatedW_next) {
						if (generatedW_buffer == buf) {
							ModernizedCProgram.goto_tabpage_win(tp, wp);
							ModernizedCProgram.curwin.setW_arg_idx(0);
							return /*Error: Unsupported expression*/;
						} 
					}
				}
				if (!curbuf.buf_hide()) {
					++emsg_off;
					split = curbuf.check_changed(1 | 16);
					--emsg_off;
				} 
				if (/* Fake a ":sfirst" or ":first" command edit the first argument. */split) {
					this.setCmdidx(CMD_index.CMD_sfirst);
					generatedCmd[0] = (byte)'s';
				} else {
						this.setCmdidx(CMD_index.CMD_first);
				} 
				eap/*
				 * Skip over the pattern argument of ":vimgrep /pat/[g][j]".
				 * Put the start of the pattern in "*s", unless "s" is NULL.
				 * If "flags" is not NULL put the flags in it: VGR_GLOBAL, VGR_NOJUMP.
				 * If "s" is not NULL terminate the pattern with a NUL.
				 * Return a pointer to the char just past the pattern plus flags.
				 */.ex_rewind();
		} 
	}
	public void ex_oldfiles() {
		listvar_S listvar_S = new listvar_S();
		list_T l = listvar_S.get_vim_var_list(57);
		listitem_T li = new listitem_T();
		int nr = 0;
		char_u fname = new char_u();
		 generatedLi_tv = li.getLi_tv();
		listitem_S generatedLi_next = li.getLi_next();
		listitem_S generatedLv_first = l.getLv_first();
		if (l == ((Object)0)) {
			ModernizedCProgram.msg(((byte)("No old files")));
		} else {
				ModernizedCProgram.msg_start();
				msg_scroll = 1;
				for (li = generatedLv_first; li != ((Object)0) && !got_int; li = generatedLi_next) {
					++nr;
					fname = generatedLi_tv.tv_get_string();
					if (!ModernizedCProgram.message_filtered(fname)) {
						ModernizedCProgram.msg_outnum((long)nr);
						ModernizedCProgram.msg_puts(": ");
						ModernizedCProgram.msg_outtrans(fname);
						ModernizedCProgram.msg_clr_eos();
						ModernizedCProgram.msg_putchar((byte)'\n');
						ModernizedCProgram.out_flush();
						ModernizedCProgram.ui_breakcheck();
					} 
				}
				got_int = /* Assume "got_int" was set to truncate the listing. */0;
				if (ModernizedCProgram.cmdmod.getBrowse()) {
					quit_more = 0;
					nr = ModernizedCProgram.prompt_for_number(0);
					ModernizedCProgram.msg_starthere();
					if (nr > 0) {
						char_u p = listvar_S.get_vim_var_list(57).list_find_str((long)nr);
						if (p != ((Object)0)) {
							p = ModernizedCProgram.expand_env_save(p);
							this.setArg(p);
							this.setCmdidx(CMD_index.CMD_edit);
							ModernizedCProgram.cmdmod.setBrowse(0);
							ModernizedCProgram.do_exedit(eap, ((Object)0));
							ModernizedCProgram.vim_free(p);
						} 
					} 
				} 
		} 
	}
	public void ex_hardcopy() {
		linenr_T lnum = new linenr_T();
		int collated_copies;
		int uncollated_copies;
		prt_settings_T settings = new prt_settings_T();
		long_u bytes_to_print = 0;
		int page_line;
		int jobsplit;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((settings), (false), (/*Error: Unsupported expression*/));
		settings.setHas_color(1)/* Expand things like "%.ps". */;/* Expand things like "%.ps". */
		Object[] generatedB_fname = curbuf.getB_fname();
		Object generatedB_sfname = curbuf.getB_sfname();
		int generatedForceit = this.getForceit();
		if (/*
		     * Initialise for printing.  Ask the user for settings, unless forceit is
		     * set.
		     * The mch_print_init() code should set up margins if applicable. (It may
		     * not be a real printer - for example the engine might generate HTML or
		     * PS.)
		     */settings.mch_print_init(generatedB_fname == ((Object)0) ? (char_u)curbuf.buf_spname() : generatedB_sfname == ((Object)0) ? generatedB_fname : generatedB_sfname, generatedForceit) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		if (t_colors > 1) {
			settings.setModec((byte)'c');
		} else {
				settings.setModec((byte)'t');
		} 
		Object generatedHas_color = settings.getHas_color();
		if (!ModernizedCProgram.curwin.syntax_present()) {
			settings.setDo_syntax(0);
		}  else if (printer_opts[5].getPresent() && (((printer_opts[5].getString()[0]) < (byte)'A' || (printer_opts[5].getString()[0]) > (byte)'Z') ? (printer_opts[5].getString()[0]) : (printer_opts[5].getString()[0]) + ((byte)'a' - (byte)'A')) != (byte)'a') {
			settings.setDo_syntax(((((printer_opts[5].getString()[0]) < (byte)'A' || (printer_opts[5].getString()[0]) > (byte)'Z') ? (printer_opts[5].getString()[0]) : (printer_opts[5].getString()[0]) + ((byte)'a' - (byte)'A')) == (byte)'y'));
		} else {
				settings.setDo_syntax(generatedHas_color);
		} 
		Object generatedNumber = settings.getNumber();
		generatedNumber.setFg_color((long_u)/* Set up printing attributes for line numbers */0);
		generatedNumber.setBg_color((long_u)-1024);
		generatedNumber.setBold(0);
		generatedNumber.setItalic(1);
		generatedNumber.setUnderline(0/*
		     * Syntax highlighting of line numbers.
		     */);
		Object generatedDo_syntax = settings.getDo_syntax();
		Object generatedModec = settings.getModec();
		if (ModernizedCProgram.prt_use_number() && generatedDo_syntax) {
			int id;
			id = ModernizedCProgram.syn_name2id((char_u)"LineNr");
			if (id > 0) {
				id = ModernizedCProgram.syn_get_final_id(id);
			} 
			generatedNumber.prt_get_attr(id, generatedModec);
		} 
		Object generatedLine2 = this.getLine2();
		Object generatedLine1 = this.getLine1();
		for (lnum = generatedLine1; lnum <= generatedLine2; /*
		     * Estimate the total lines to be printed
		     */lnum++) {
			bytes_to_print += (long_u)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.skipwhite(ModernizedCProgram.ml_get(lnum))));
		}
		if (bytes_to_print == 0) {
			ModernizedCProgram.msg(((byte)("No text to be printed")));
			;
		} 
		ModernizedCProgram.curr_bg = (long_u)/* Set colors and font to normal. */-1024;
		ModernizedCProgram.curr_fg = (long_u)-1024;
		ModernizedCProgram.curr_italic = 2;
		ModernizedCProgram.curr_bold = 2;
		ModernizedCProgram.curr_underline = 2;
		ModernizedCProgram.prt_set_fg((long_u)0);
		ModernizedCProgram.prt_set_bg((long_u)-1024);
		ModernizedCProgram.prt_set_font(0, 0, 0);
		ModernizedCProgram.current_syn_id = -1;
		jobsplit = (printer_opts[12].getPresent() && (((printer_opts[12].getString()[0]) < (byte)'A' || (printer_opts[12].getString()[0]) > (byte)'Z') ? (printer_opts[12].getString()[0]) : (printer_opts[12].getString()[0]) + ((byte)'a' - (byte)'A')) == (byte)'y');
		if (!settings.mch_print_begin()) {
			;
		} 
		ModernizedCProgram.page_count = 0;
		Object generatedN_collated_copies = settings.getN_collated_copies();
		Object generatedFile_line = prtpos.getFile_line();
		Object generatedN_uncollated_copies = settings.getN_uncollated_copies();
		Object generatedDuplex = settings.getDuplex();
		Object generatedUser_abort = settings.getUser_abort();
		Object generatedBytes_printed = prtpos.getBytes_printed();
		Object generatedLines_per_page = settings.getLines_per_page();
		Object generatedColumn = prtpos.getColumn();
		Object generatedFf = prtpos.getFf();
		Object generatedJobname = settings.getJobname();
		for (collated_copies = 0; collated_copies < generatedN_collated_copies; collated_copies++) {
			prt_pos_T prtpos = new prt_pos_T();
			prt_pos_T page_prtpos = new prt_pos_T();
			int side;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((page_prtpos), (false), (/*Error: Unsupported expression*/));
			page_prtpos.setFile_line(generatedLine1);
			prtpos = page_prtpos;
			if (jobsplit && collated_copies > 0) {
				/* Splitting jobs: Stop a previous job and start a new one. */settings.mch_print_end();
				if (!settings.mch_print_begin()) {
					;
				} 
			} 
			for (ModernizedCProgram.page_count = 0; generatedFile_line <= generatedLine2; ++/*
				 * Loop over all pages in the print job: 1 2 3 ...
				 */ModernizedCProgram.page_count/*
				     * Loop over uncollated copies: 1 1 1, 2 2 2, 3 3 3, ...
				     * For duplex: 12 12 12 34 34 34, ...
				     */) {
				for (uncollated_copies = 0; uncollated_copies < generatedN_uncollated_copies; uncollated_copies++) {
					prtpos = /* Set the print position to the start of this page. */page_prtpos/*
							 * Do front and rear side of a page.
							 */;
					for (side = 0; side <= generatedDuplex; ++side/*
							     * Print one page.
							     */) {
						ModernizedCProgram.ui_breakcheck();
						if (got_int || generatedUser_abort) {
							;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff, ((byte)("Printing page %d (%d%%)")), ModernizedCProgram.page_count + 1 + side, generatedBytes_printed > 1000000 ? (int)(generatedBytes_printed / (bytes_to_print / 100)) : (int)((generatedBytes_printed * 100) / bytes_to_print));
						if (!ModernizedCProgram.mch_print_begin_page(ModernizedCProgram.IObuff)) {
							;
						} 
						if (generatedN_collated_copies > 1) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff + /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), ((byte)(" Copy %d of %d")), collated_copies + 1, generatedN_collated_copies);
						} 
						ModernizedCProgram.prt_message(ModernizedCProgram.IObuff/*
								     * Output header if required
								     */);
						if (ModernizedCProgram.prt_header_height() > 0) {
							settings.prt_header(ModernizedCProgram.page_count + 1 + side, generatedFile_line);
						} 
						for (page_line = 0; page_line < generatedLines_per_page; ++page_line) {
							prtpos.setColumn(settings.hardcopy_line(page_line, prtpos));
							if (generatedColumn == 0) {
								generatedBytes_printed += /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.skipwhite(ModernizedCProgram.ml_get(generatedFile_line))));
								if (++generatedFile_line > generatedLine2) {
									break;
								} 
							}  else if (generatedFf) {
								break;
							} 
						}
						if (!ModernizedCProgram.mch_print_end_page()) {
							;
						} 
						if (generatedFile_line > generatedLine2) {
							break;
						} 
					}
					if (generatedFile_line > generatedLine2 && generatedDuplex && side == 0 && uncollated_copies + 1 < generatedN_uncollated_copies) {
						if (!ModernizedCProgram.mch_print_blank_page()) {
							;
						} 
					} 
				}
				if (generatedDuplex && generatedFile_line <= generatedLine2) {
					++ModernizedCProgram.page_count;
				} 
				page_prtpos = /* Remember the position where the next page starts. */prtpos;
			}
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Printed: %s")), generatedJobname);
			ModernizedCProgram.prt_message(ModernizedCProgram.IObuff);
		}
		settings.mch_print_end();
	}
	public Object script_get(Object[] cmd) {
		char_u theline = new char_u();
		byte end_pattern = ((Object)0);
		byte[] dot = ".";
		garray_T ga = new garray_T();
		Object generatedGetline = this.getGetline();
		if (cmd[0] != (byte)'<' || cmd[1] != (byte)'<' || generatedGetline == ((Object)0)) {
			return ((Object)0);
		} 
		ga.ga_init2(1, -1024);
		if (cmd[2] != (byte)'\000') {
			end_pattern = (byte)ModernizedCProgram.skipwhite(cmd + 2);
		} else {
				end_pattern = dot;
		} 
		Object generatedCstack = this.getCstack();
		Object generatedCookie = this.getCookie();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			theline = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCstack.getCs_looplevel() > 0 ? -1 : (byte)'\000', generatedCookie, 0, 1);
			if (theline == ((Object)0) || /*Error: Function owner not recognized*/strcmp((byte)(end_pattern), (byte)(theline)) == 0) {
				ModernizedCProgram.vim_free(theline);
				break;
			} 
			ga.ga_concat(theline);
			ga.ga_append((byte)'\n');
			ModernizedCProgram.vim_free(theline);
		}
		ga.ga_append((byte)'\000');
		Object generatedGa_data = ga.getGa_data();
		return (char_u)generatedGa_data;
	}
	/*
	 * ":eval".
	 */
	public void ex_eval() {
		typval_T tv = new typval_T();
		Object[] generatedArg = this.getArg();
		Object generatedNextcmd = this.getNextcmd();
		int generatedSkip = this.getSkip();
		if (tv.eval0(generatedArg, generatedNextcmd, !generatedSkip) == 1) {
			tv/*
			 * ":if".
			 */.clear_tv();
		} 
	}
	public void ex_if() {
		int error;
		int skip;
		int result;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		Object[] generatedArg = this.getArg();
		Object generatedNextcmd = this.getNextcmd();
		if (generatedCs_idx == 50 - 1) {
			this.setErrmsg("E579: :if nesting too deep");
		} else {
				++generatedCs_idx;
				generatedCs_flags[generatedCs_idx] = 0/*
					 * Don't do something after an error, interrupt, or throw, or when there
					 * is a surrounding conditional and it was not active.
					 */;
				skip = ModernizedCProgram.did_emsg || got_int || did_throw || (generatedCs_idx > 0 && !(generatedCs_flags[generatedCs_idx - 1] & -1024));
				result = ModernizedCProgram.eval_to_bool(generatedArg, error, generatedNextcmd, skip);
				if (!skip && !error) {
					if (result) {
						generatedCs_flags[generatedCs_idx] = -1024 | -1024;
					} 
				} else {
						generatedCs_flags[generatedCs_idx] = /* set TRUE, so this conditional will never get active */-1024/*
						 * ":endif".
						 */;
				} 
		} 
	}
	public void ex_endif() {
		did_endif = 1;
		Object generatedCstack = this.getCstack();
		if (generatedCstack.getCs_idx() < 0 || (generatedCstack.getCs_flags()[generatedCstack.getCs_idx()] & (-1024 | -1024 | -1024))) {
			this.setErrmsg("E580: :endif without :if"/*
				 * When debugging or a breakpoint was encountered, display the debug
				 * prompt (if not already done).  This shows the user that an ":endif"
				 * is executed when the ":if" or a previous ":elseif" was not TRUE.
				 * Handle a ">quit" debug command as if an interrupt had occurred before
				 * the ":endif".  That is, throw an interrupt exception if appropriate.
				 * Doing this here prevents an exception for a parsing error being
				 * discarded by throwing the interrupt exception later on.
				 */);
		} else {
				if (!(generatedCstack.getCs_flags()[generatedCstack.getCs_idx()] & -1024) && eap.dbg_check_skipped()) {
					(Object)generatedCstack.do_intthrow();
				} 
				--generatedCstack.getCs_idx();
		} 
	}
	public void ex_else() {
		int error;
		int skip;
		int result;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		skip = ModernizedCProgram.did_emsg || got_int || did_throw || (generatedCs_idx > 0 && !(generatedCs_flags[generatedCs_idx - 1] & -1024));
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCs_idx < 0 || (generatedCs_flags[generatedCs_idx] & (-1024 | -1024 | -1024))) {
			if (generatedCmdidx == CMD_index.CMD_else) {
				this.setErrmsg("E581: :else without :if");
				return /*Error: Unsupported expression*/;
			} 
			this.setErrmsg("E582: :elseif without :if");
			skip = 1;
		}  else if (generatedCs_flags[generatedCs_idx] & -1024) {
			if (generatedCmdidx == CMD_index.CMD_else) {
				this.setErrmsg("E583: multiple :else");
				return /*Error: Unsupported expression*/;
			} 
			this.setErrmsg("E584: :elseif after :else");
			skip = 1;
		} 
		Byte generatedErrmsg = this.getErrmsg();
		if (skip || generatedCs_flags[generatedCs_idx] & /* if skipping or the ":if" was TRUE, reset ACTIVE, otherwise set it */-1024) {
			if (generatedErrmsg == ((Object)0)) {
				generatedCs_flags[generatedCs_idx] = -1024;
			} 
			skip = /* don't evaluate an ":elseif" */1;
		} else {
				generatedCs_flags[generatedCs_idx] = -1024/*
				     * When debugging or a breakpoint was encountered, display the debug prompt
				     * (if not already done).  This shows the user that an ":else" or ":elseif"
				     * is executed when the ":if" or previous ":elseif" was not TRUE.  Handle
				     * a ">quit" debug command as if an interrupt had occurred before the
				     * ":else" or ":elseif".  That is, set "skip" and throw an interrupt
				     * exception if appropriate.  Doing this here prevents that an exception
				     * for a parsing errors is discarded when throwing the interrupt exception
				     * later on.
				     */;
		} 
		if (!skip && eap.dbg_check_skipped() && got_int) {
			(Object)cstack.do_intthrow();
			skip = 1;
		} 
		Object[] generatedArg = this.getArg();
		Object generatedNextcmd = this.getNextcmd();
		if (generatedCmdidx == CMD_index.CMD_elseif) {
			result = ModernizedCProgram.eval_to_bool(generatedArg, error, generatedNextcmd, skip/* When throwing error exceptions, we want to throw always the first
				 * of several errors in a row.  This is what actually happens when
				 * a conditional error was detected above and there is another failure
				 * when parsing the expression.  Since the skip flag is set in this
				 * case, the parsing error will be ignored by emsg(). */);
			if (!skip && !error) {
				if (result) {
					generatedCs_flags[generatedCs_idx] = -1024 | -1024;
				} else {
						generatedCs_flags[generatedCs_idx] = 0;
				} 
			}  else if (generatedErrmsg == ((Object)0)) {
				generatedCs_flags[generatedCs_idx] = /* set TRUE, so this conditional will never get active */-1024;
			} 
		} else {
				generatedCs_flags[generatedCs_idx] |=  -1024/*
				 * Handle ":while" and ":for".
				 */;
		} 
	}
	public void ex_while() {
		int error;
		int skip;
		int result;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_idx = cstack.getCs_idx();
		byte generatedCs_lflags = cstack.getCs_lflags();
		int generatedCs_looplevel = cstack.getCs_looplevel();
		Object generatedCs_line = cstack.getCs_line();
		Object generatedCs_flags = cstack.getCs_flags();
		CMD_index generatedCmdidx = this.getCmdidx();
		Object[] generatedArg = this.getArg();
		Object generatedNextcmd = this.getNextcmd();
		Object generatedCs_forinfo = cstack.getCs_forinfo();
		if (generatedCs_idx == 50 - 1) {
			this.setErrmsg("E585: :while/:for nesting too deep"/*
				 * The loop flag is set when we have jumped back from the matching
				 * ":endwhile" or ":endfor".  When not set, need to initialise this
				 * cstack entry.
				 */);
		} else {
				if ((generatedCs_lflags & 1) == 0) {
					++generatedCs_idx;
					++generatedCs_looplevel;
					generatedCs_line[generatedCs_idx] = -1;
				} 
				generatedCs_flags[generatedCs_idx] = generatedCmdidx == CMD_index.CMD_while ? -1024 : -1024/*
					 * Don't do something after an error, interrupt, or throw, or when
					 * there is a surrounding conditional and it was not active.
					 */;
				skip = ModernizedCProgram.did_emsg || got_int || did_throw || (generatedCs_idx > 0 && !(generatedCs_flags[generatedCs_idx - 1] & -1024));
				if (generatedCmdidx == CMD_index.CMD_while/*
					     * ":while bool-expr"
					     */) {
					result = ModernizedCProgram.eval_to_bool(generatedArg, error, generatedNextcmd, skip);
				} else {
						Object fi;
						if ((generatedCs_lflags & 1) != 0) {
							fi = generatedCs_forinfo[generatedCs_idx];
							error = 0;
						} else {
								fi = ModernizedCProgram.eval_for_line(generatedArg, error, generatedNextcmd, /* Evaluate the argument and get the info in a structure. */skip);
								generatedCs_forinfo[generatedCs_idx] = fi;
						} 
						if (!error && fi != ((Object)0) && !/* use the element at the start of the list and advance */skip) {
							result = ModernizedCProgram.next_for_item(fi, generatedArg);
						} else {
								result = 0;
						} 
						if (!result) {
							ModernizedCProgram.free_for_info(fi);
							generatedCs_forinfo[generatedCs_idx] = ((Object)0/*
								 * If this cstack entry was just initialised and is active, set the
								 * loop flag, so do_cmdline() will set the line number in cs_line[].
								 * If executing the command a second time, clear the loop flag.
								 */);
						} 
				} 
				if (!skip && !error && result) {
					generatedCs_flags[generatedCs_idx] |=  (-1024 | -1024);
					generatedCs_lflags ^=  1;
				} else {
						generatedCs_lflags &=  ~1/* If the ":while" evaluates to FALSE or ":for" is past the end of
							     * the list, show the debug prompt at the ":endwhile"/":endfor" as
							     * if there was a ":break" in a ":while"/":for" evaluating to
							     * TRUE. */;
						if (!skip && !error) {
							generatedCs_flags[generatedCs_idx] |=  -1024;
						} 
				} 
		} 
	}
	/*
	 * ":continue"
	 */
	public void ex_continue() {
		int idx;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_looplevel = cstack.getCs_looplevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		int generatedCs_trylevel = cstack.getCs_trylevel();
		byte generatedCs_lflags = cstack.getCs_lflags();
		Object generatedCs_pending = cstack.getCs_pending();
		if (generatedCs_looplevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg("E586: :continue without :while or :for"/* Try to find the matching ":while".  This might stop at a try
				 * conditional not in its finally clause (which is then to be executed
				 * next).  Therefor, inactivate all conditionals except the ":while"
				 * itself (if reached). */);
		} else {
				idx = cstack.cleanup_conditionals(-1024 | -1024, 0);
				if (idx >= 0 && (generatedCs_flags[idx] & (-1024 | -1024))) {
					cstack.rewind_conditionals(idx, -1024, generatedCs_trylevel);
					generatedCs_lflags |=  /* let do_cmdline() handle it */4;
				} else {
						generatedCs_pending[idx] = /* If a try conditional not in its finally clause is reached first,
							     * make the ":continue" pending for execution at the ":endtry". */16;
						ModernizedCProgram.report_make_pending(16, ((Object)0));
				} 
		} 
	}
	/*
	 * ":break"
	 */
	public void ex_break() {
		int idx;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_looplevel = cstack.getCs_looplevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		Object generatedCs_pending = cstack.getCs_pending();
		if (generatedCs_looplevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg("E587: :break without :while or :for"/* Inactivate conditionals until the matching ":while" or a try
				 * conditional not in its finally clause (which is then to be
				 * executed next) is found.  In the latter case, make the ":break"
				 * pending for execution at the ":endtry". */);
		} else {
				idx = cstack.cleanup_conditionals(-1024 | -1024, 1);
				if (idx >= 0 && !(generatedCs_flags[idx] & (-1024 | -1024))) {
					generatedCs_pending[idx] = 8;
					ModernizedCProgram.report_make_pending(8, ((Object)0));
				} 
		} 
	}
	/*
	 * ":endwhile" and ":endfor"
	 */
	public void ex_endwhile() {
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int idx;
		byte err;
		int csf;
		int fl;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_endwhile) {
			err = e_while;
			csf = -1024;
		} else {
				err = e_for;
				csf = -1024;
		} 
		int generatedCs_looplevel = cstack.getCs_looplevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		int generatedCs_trylevel = cstack.getCs_trylevel();
		byte generatedCs_lflags = cstack.getCs_lflags();
		if (generatedCs_looplevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg(err);
		} else {
				fl = generatedCs_flags[generatedCs_idx];
				if (!(fl & csf)) {
					if (fl & /* If we are in a ":while" or ":for" but used the wrong endloop
						     * command, do not rewind to the next enclosing ":for"/":while". */-1024) {
						this.setErrmsg(((byte)("E732: Using :endfor with :while")));
					}  else if (fl & -1024) {
						this.setErrmsg(((byte)("E733: Using :endwhile with :for")));
					} 
				} 
				if (!(fl & (-1024 | -1024))) {
					if (!(fl & -1024)) {
						this.setErrmsg(e_endif);
					}  else if (fl & -1024) {
						this.setErrmsg(e_endtry);
					} 
					for (idx = generatedCs_idx; idx > 0; --/* Try to find the matching ":while" and report what's missing. */idx) {
						fl = generatedCs_flags[idx];
						if ((fl & -1024) && !(fl & -1024)) {
							this.setErrmsg(/* Give up at a try conditional not in its finally clause.
									     * Ignore the ":endwhile"/":endfor". */err);
							return /*Error: Unsupported expression*/;
						} 
						if (fl & csf) {
							break;
						} 
					}
					(Object)cstack.cleanup_conditionals(-1024 | -1024, /* Cleanup and rewind all contained (and unclosed) conditionals. */0);
					cstack.rewind_conditionals(idx, -1024, generatedCs_trylevel);
				}  else if (generatedCs_flags[generatedCs_idx] & -1024 && !(generatedCs_flags[generatedCs_idx] & -1024) && eap.dbg_check_skipped()) {
					(Object)cstack/*
						 * Set loop flag, so do_cmdline() will jump back to the matching
						 * ":while" or ":for".
						 */.do_intthrow();
				} 
				generatedCs_lflags |=  2;
		} 
	}
	/*
	 * ":throw expr"
	 */
	public void ex_throw() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u value = new char_u();
		Object generatedNextcmd = this.getNextcmd();
		int generatedSkip = this.getSkip();
		if (arg != (byte)'\000' && arg != (byte)'|' && arg != (byte)'\n') {
			value = ModernizedCProgram.eval_to_string_skip(arg, generatedNextcmd, generatedSkip);
		} else {
				ModernizedCProgram.emsg(((byte)(e_argreq)));
				value = ((Object)0);
		} 
		Object generatedCstack = this.getCstack();
		if (!generatedSkip && value != ((Object)/* On error or when an exception is thrown during argument evaluation, do
		     * not throw. */0)) {
			if (ModernizedCProgram.throw_exception(value, .ET_USER, ((Object)0)) == 0) {
				ModernizedCProgram.vim_free(value);
			} else {
					generatedCstack.do_throw();
			} 
		} 
	}
	public void ex_try() {
		int skip;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_idx = cstack.getCs_idx();
		int generatedCs_trylevel = cstack.getCs_trylevel();
		Object generatedCs_flags = cstack.getCs_flags();
		Object generatedCs_pending = cstack.getCs_pending();
		eslist_elem generatedCs_emsg_silent_list = cstack.getCs_emsg_silent_list();
		if (generatedCs_idx == 50 - 1) {
			this.setErrmsg("E601: :try nesting too deep");
		} else {
				++generatedCs_idx;
				++generatedCs_trylevel;
				generatedCs_flags[generatedCs_idx] = -1024;
				generatedCs_pending[generatedCs_idx] = 0/*
					 * Don't do something after an error, interrupt, or throw, or when there
					 * is a surrounding conditional and it was not active.
					 */;
				skip = ModernizedCProgram.did_emsg || got_int || did_throw || (generatedCs_idx > 0 && !(generatedCs_flags[generatedCs_idx - 1] & -1024));
				if (!skip/* Set ACTIVE and TRUE.  TRUE means that the corresponding ":catch"
					     * commands should check for a match if an exception is thrown and
					     * that the finally clause needs to be executed. */) {
					generatedCs_flags[generatedCs_idx] |=  -1024 | -1024/*
						     * ":silent!", even when used in a try conditional, disables
						     * displaying of error messages and conversion of errors to
						     * exceptions.  When the silent commands again open a try
						     * conditional, save "emsg_silent" and reset it so that errors are
						     * again converted to exceptions.  The value is restored when that
						     * try conditional is left.  If it is left normally, the commands
						     * following the ":endtry" are again silent.  If it is left by
						     * a ":continue", ":break", ":return", or ":finish", the commands
						     * executed next are again silent.  If it is left due to an
						     * aborting error, an interrupt, or an exception, restoring
						     * "emsg_silent" does not matter since we are already in the
						     * aborting state and/or the exception has already been thrown.
						     * The effect is then just freeing the memory that was allocated
						     * to save the value.
						     */;
					if (emsg_silent) {
						eslist_T elem = new eslist_T();
						elem = (eslist_elem)ModernizedCProgram.alloc(/*Error: Unsupported expression*/);
						if (elem == ((Object)0)) {
							ModernizedCProgram.emsg(((byte)(e_outofmem)));
						} else {
								elem.setSaved_emsg_silent(emsg_silent);
								elem.setNext(generatedCs_emsg_silent_list);
								cstack.setCs_emsg_silent_list(elem);
								generatedCs_flags[generatedCs_idx] |=  -1024;
								emsg_silent = 0;
						} 
					} 
				} 
		} 
	}
	/*
	 * ":catch /{pattern}/" and ":catch"
	 */
	public void ex_catch() {
		int idx = 0;
		int give_up = 0;
		int skip = 0;
		int caught = 0;
		char_u end = new char_u();
		int save_char = 0;
		char_u save_cpo = new char_u();
		regmatch_T regmatch = new regmatch_T();
		int prev_got_int;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		char_u pat = new char_u();
		int generatedCs_trylevel = cstack.getCs_trylevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		int generatedCs_looplevel = cstack.getCs_looplevel();
		if (generatedCs_trylevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg("E603: :catch without :try");
			give_up = 1;
		} else {
				if (!(generatedCs_flags[generatedCs_idx] & -1024)) {
					this.setErrmsg(/* Report what's missing if the matching ":try" is not in its
						     * finally clause. */cstack.get_end_emsg());
					skip = 1;
				} 
				for (idx = generatedCs_idx; idx > 0; --idx) {
					if (generatedCs_flags[idx] & -1024) {
						break;
					} 
				}
				if (generatedCs_flags[idx] & -1024) {
					this.setErrmsg(/* Give up for a ":catch" after ":finally" and ignore it.
						     * Just parse. */"E604: :catch after :finally");
					give_up = 1;
				} else {
						cstack.rewind_conditionals(idx, -1024 | -1024, generatedCs_looplevel);
				} 
		} 
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.ends_excmd(generatedArg)) {
			pat = (char_u)".*";
			end = ((Object)0);
			this.setNextcmd(ModernizedCProgram.find_nextcmd(generatedArg));
		} else {
				pat = generatedArg + 1;
				end = ModernizedCProgram.skip_regexp(pat, generatedArg, 1, ((Object)0));
		} 
		regprog regprog = new regprog();
		Object generatedRegprog = regmatch.getRegprog();
		Byte generatedValue = current_exception.getValue();
		 generatedCs_pend = cstack.getCs_pend();
		Object generatedCsp_ex = generatedCs_pend.getCsp_ex();
		if (!give_up/*
			 * Don't do something when no exception has been thrown or when the
			 * corresponding try block never got active (because of an inactive
			 * surrounding conditional or after an error or interrupt or throw).
			 */) {
			if (!did_throw || !(generatedCs_flags[idx] & -1024)) {
				skip = 1/*
					 * Check for a match only if an exception is thrown but not caught by
					 * a previous ":catch".  An exception that has replaced a discarded
					 * exception is not checked (THROWN is not set then).
					 */;
			} 
			if (!skip && (generatedCs_flags[idx] & -1024) && !(generatedCs_flags[idx] & -1024)) {
				if (end != ((Object)0) && end != (byte)'\000' && !ModernizedCProgram.ends_excmd(ModernizedCProgram.skipwhite(end + 1))) {
					ModernizedCProgram.emsg(((byte)(e_trailing)));
					return /*Error: Unsupported expression*/;
				} 
				if (!eap.dbg_check_skipped() || !cstack.do_intthrow()) {
					if (end != ((Object)/* Terminate the pattern and avoid the 'l' flag in 'cpoptions'
							 * while compiling it. */0)) {
						save_char = end;
						end = (byte)'\000';
					} 
					save_cpo = ModernizedCProgram.p_cpo;
					ModernizedCProgram.p_cpo = (char_u)""/* Disable error messages, it will make current_exception
							 * invalid. */;
					++emsg_off;
					regmatch.setRegprog(regprog.vim_regcomp(pat, 1 + 2));
					--emsg_off;
					regmatch.setRm_ic(0);
					if (end != ((Object)0)) {
						end = save_char;
					} 
					ModernizedCProgram.p_cpo = save_cpo;
					if (generatedRegprog == ((Object)0)) {
						ModernizedCProgram.semsg(((byte)(e_invarg2)), pat/*
								     * Save the value of got_int and reset it.  We don't want
								     * a previous interruption cancel matching, only hitting
								     * CTRL-C while matching should abort it.
								     */);
					} else {
							prev_got_int = got_int;
							got_int = 0;
							caught = regmatch.vim_regexec_nl((char_u)generatedValue, (colnr_T)0);
							got_int |=  prev_got_int;
							generatedRegprog.vim_regfree();
					} 
				} 
			} 
			if (caught) {
				generatedCs_flags[idx] |=  -1024 | /* Make this ":catch" clause active and reset did_emsg, got_int,
					     * and did_throw.  Put the exception on the caught stack. */-1024;
				ModernizedCProgram.did_emsg = got_int = did_throw = 0;
				(except_T)generatedCsp_ex[idx/* It's mandatory that the current exception is stored in the cstack
					     * so that it can be discarded at the next ":catch", ":finally", or
					     * ":endtry" or when the catch clause is left by a ":continue",
					     * ":break", ":return", ":finish", error, interrupt, or another
					     * exception. */].catch_exception();
				if (generatedCsp_ex[generatedCs_idx] != current_exception) {
					ModernizedCProgram.internal_error("ex_catch()"/*
						     * If there is a preceding catch clause and it caught the exception,
						     * finish the exception now.  This happens also after errors except
						     * when this ":catch" was after the ":finally" or not within
						     * a ":try".  Make the try conditional inactive so that the
						     * following catch clauses are skipped.  On an error or interrupt
						     * after the preceding try block or catch clause was left by
						     * a ":continue", ":break", ":return", or ":finish", discard the
						     * pending action.
						     */);
				} 
			} else {
					cstack.cleanup_conditionals(-1024, 1);
			} 
		} 
		if (end != ((Object)0)) {
			this.setNextcmd(ModernizedCProgram.find_nextcmd(end/*
			 * ":finally"
			 */));
		} 
	}
	public void ex_finally() {
		int idx;
		int skip = 0;
		int pending = 0;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_trylevel = cstack.getCs_trylevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		int generatedCs_looplevel = cstack.getCs_looplevel();
		Object generatedCs_pending = cstack.getCs_pending();
		 generatedCs_pend = cstack.getCs_pend();
		Object generatedCsp_rv = generatedCs_pend.getCsp_rv();
		Object generatedCsp_ex = generatedCs_pend.getCsp_ex();
		byte generatedCs_lflags = cstack.getCs_lflags();
		if (generatedCs_trylevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg("E606: :finally without :try");
		} else {
				if (!(generatedCs_flags[generatedCs_idx] & -1024)) {
					this.setErrmsg(cstack.get_end_emsg());
					for (idx = generatedCs_idx - 1; idx > 0; --idx) {
						if (generatedCs_flags[idx] & -1024) {
							break;
						} 
					}
					pending = 1;
				} else {
						idx = generatedCs_idx;
				} 
				if (generatedCs_flags[idx] & -1024) {
					this.setErrmsg(/* Give up for a multiple ":finally" and ignore it. */"E607: multiple :finally");
					return /*Error: Unsupported expression*/;
				} 
				cstack.rewind_conditionals(idx, -1024 | -1024, generatedCs_looplevel);
				skip = !(generatedCs_flags[generatedCs_idx] & -1024);
				if (!skip/* When debugging or a breakpoint was encountered, display the
					     * debug prompt (if not already done).  The user then knows that the
					     * finally clause is executed. */) {
					if (eap/* Handle a ">quit" debug command as if an interrupt had
							 * occurred before the ":finally".  That is, discard the
							 * original exception and replace it by an interrupt
							 * exception. */.dbg_check_skipped()) {
						(Object)cstack/*
							     * If there is a preceding catch clause and it caught the exception,
							     * finish the exception now.  This happens also after errors except
							     * when this is a multiple ":finally" or one not within a ":try".
							     * After an error or interrupt, this also discards a pending
							     * ":continue", ":break", ":finish", or ":return" from the preceding
							     * try block or catch clause.
							     */.do_intthrow();
					} 
					cstack.cleanup_conditionals(-1024, 0/*
						     * Make did_emsg, got_int, did_throw pending.  If set, they overrule
						     * a pending ":continue", ":break", ":return", or ":finish".  Then
						     * we have particularly to discard a pending return value (as done
						     * by the call to cleanup_conditionals() above when did_emsg or
						     * got_int is set).  The pending values are restored by the
						     * ":endtry", except if there is a new error, interrupt, exception,
						     * ":continue", ":break", ":return", or ":finish" in the following
						     * finally clause.  A missing ":endwhile", ":endfor" or ":endif"
						     * detected here is treated as if did_emsg and did_throw had
						     * already been set, respectively in case that the error is not
						     * converted to an exception, did_throw had already been unset.
						     * We must not set did_emsg here since that would suppress the
						     * error message.
						     */);
					if (pending == 1 || ModernizedCProgram.did_emsg || got_int || did_throw) {
						if (generatedCs_pending[generatedCs_idx] == 24) {
							ModernizedCProgram.report_discard_pending(24, generatedCsp_rv[generatedCs_idx]);
							ModernizedCProgram.discard_pending_return(generatedCsp_rv[generatedCs_idx]);
						} 
						if (pending == 1 && !ModernizedCProgram.did_emsg) {
							pending |=  (true) ? 4 : 0;
						} else {
								pending |=  did_throw ? 4 : 0;
						} 
						pending |=  ModernizedCProgram.did_emsg ? 1 : 0;
						pending |=  got_int ? 2 : 0;
						generatedCs_pending[generatedCs_idx] = pending/* It's mandatory that the current exception is stored in the
								 * cstack so that it can be rethrown at the ":endtry" or be
								 * discarded if the finally clause is left by a ":continue",
								 * ":break", ":return", ":finish", error, interrupt, or another
								 * exception.  When emsg() is called for a missing ":endif" or
								 * a missing ":endwhile"/":endfor" detected here, the
								 * exception will be discarded. */;
						if (did_throw && generatedCsp_ex[generatedCs_idx] != current_exception) {
							ModernizedCProgram.internal_error("ex_finally()"/*
								     * Set CSL_HAD_FINA, so do_cmdline() will reset did_emsg,
								     * got_int, and did_throw and make the finally clause active.
								     * This will happen after emsg() has been called for a missing
								     * ":endif" or a missing ":endwhile"/":endfor" detected here, so
								     * that the following finally clause will be executed even then.
								     */);
						} 
					} 
					generatedCs_lflags |=  8;
				} 
		} 
	}
	/*
	 * ":endtry"
	 */
	public void ex_endtry() {
		int idx;
		int skip;
		int rethrow = 0;
		int pending = 0;
		Object rettv = ((Object)0);
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		int generatedCs_trylevel = cstack.getCs_trylevel();
		int generatedCs_idx = cstack.getCs_idx();
		Object generatedCs_flags = cstack.getCs_flags();
		int generatedCs_looplevel = cstack.getCs_looplevel();
		Object generatedCs_pending = cstack.getCs_pending();
		 generatedCs_pend = cstack.getCs_pend();
		Object generatedCsp_rv = generatedCs_pend.getCsp_rv();
		Object generatedCsp_ex = generatedCs_pend.getCsp_ex();
		if (generatedCs_trylevel <= 0 || generatedCs_idx < 0) {
			this.setErrmsg("E602: :endtry without :try"/*
				 * Don't do something after an error, interrupt or throw in the try
				 * block, catch clause, or finally clause preceding this ":endtry" or
				 * when an error or interrupt occurred after a ":continue", ":break",
				 * ":return", or ":finish" in a try block or catch clause preceding this
				 * ":endtry" or when the try block never got active (because of an
				 * inactive surrounding conditional or after an error or interrupt or
				 * throw) or when there is a surrounding conditional and it has been
				 * made inactive by a ":continue", ":break", ":return", or ":finish" in
				 * the finally clause.  The latter case need not be tested since then
				 * anything pending has already been discarded. */);
		} else {
				skip = ModernizedCProgram.did_emsg || got_int || did_throw || !(generatedCs_flags[generatedCs_idx] & -1024);
				if (!(generatedCs_flags[generatedCs_idx] & -1024)) {
					this.setErrmsg(cstack.get_end_emsg());
					idx = generatedCs_idx;
					do {
						--idx;
					} while (idx > 0 && !(generatedCs_flags[idx] & -1024));
					cstack.rewind_conditionals(idx, -1024 | -1024, generatedCs_looplevel);
					skip = 1/*
						     * If an exception is being thrown, discard it to prevent it from
						     * being rethrown at the end of this function.  It would be
						     * discarded by the error message, anyway.  Resets did_throw.
						     * This does not affect the script termination due to the error
						     * since "trylevel" is decremented after emsg() has been called.
						     */;
					if (did_throw) {
						ModernizedCProgram.discard_current_exception();
					} 
				} else {
						idx = generatedCs_idx;
						if (did_throw && (generatedCs_flags[idx] & -1024) && !(generatedCs_flags[idx] & -1024)) {
							rethrow = 1/* If there was no finally clause, show the user when debugging or
								 * a breakpoint was encountered that the end of the try conditional has
								 * been reached: display the debug prompt (if not already done).  Do
								 * this on normal control flow or when an exception was thrown, but not
								 * on an interrupt or error not converted to an exception or when
								 * a ":break", ":continue", ":return", or ":finish" is pending.  These
								 * actions are carried out immediately.
								 */;
						} 
				} 
				if ((rethrow || (!skip && !(generatedCs_flags[idx] & -1024) && !generatedCs_pending[idx])) && eap/* Handle a ">quit" debug command as if an interrupt had occurred
					     * before the ":endtry".  That is, throw an interrupt exception and
					     * set "skip" and "rethrow". */.dbg_check_skipped()) {
					if (got_int) {
						skip = 1;
						(Object)cstack/* The do_intthrow() call may have reset did_throw or
								 * cstack->cs_pending[idx].*/.do_intthrow();
						rethrow = 0;
						if (did_throw && !(generatedCs_flags[idx] & -1024)) {
							rethrow = 1/*
								 * If a ":return" is pending, we need to resume it after closing the
								 * try conditional; remember the return value.  If there was a finally
								 * clause making an exception pending, we need to rethrow it.  Make it
								 * the exception currently being thrown.
								 */;
						} 
					} 
				} 
				if (!skip) {
					pending = generatedCs_pending[idx];
					generatedCs_pending[idx] = 0;
					if (pending == 24) {
						rettv = generatedCsp_rv[idx];
					}  else if (pending & 4) {
						current_exception = generatedCsp_ex[idx/*
							 * Discard anything pending on an error, interrupt, or throw in the
							 * finally clause.  If there was no ":finally", discard a pending
							 * ":continue", ":break", ":return", or ":finish" if an error or
							 * interrupt occurred afterwards, but before the ":endtry" was reached.
							 * If an exception was caught by the last of the catch clauses and there
							 * was no finally clause, finish the exception now.  This happens also
							 * after errors except when this ":endtry" is not within a ":try".
							 * Restore "emsg_silent" if it has been reset by this try conditional.
							 */];
					} 
				} 
				(Object)cstack.cleanup_conditionals(-1024 | -1024, 1);
				--generatedCs_idx;
				--generatedCs_trylevel;
				if (!skip) {
					ModernizedCProgram.report_resume_pending(pending, (pending == 24) ? rettv : (pending & 4) ? (Object)current_exception : ((Object)0));
					switch (pending) {
					case 8:
							eap.ex_break();
							break;
					case 0:
							break;
					case 16:
							eap.ex_continue();
							break;
					case 24:
							eap.do_return(0, 0, rettv);
							break;
					case 32:
							eap.do_finish(0);
							break;
					default:
							if (pending & 1) {
								ModernizedCProgram.did_emsg = 1;
							} 
							if (pending & 2) {
								got_int = 1;
							} 
							if (pending & 4) {
								rethrow = 1;
							} 
							break;
					}
				} 
				if (rethrow) {
					/* Rethrow the current exception (within this cstack). */cstack/*
					 * enter_cleanup() and leave_cleanup()
					 *
					 * Functions to be called before/after invoking a sequence of autocommands for
					 * cleanup for a failed command.  (Failure means here that a call to emsg()
					 * has been made, an interrupt occurred, or there is an uncaught exception
					 * from a previous autocommand execution of the same command.)
					 *
					 * Call enter_cleanup() with a pointer to a cleanup_T and pass the same
					 * pointer to leave_cleanup().  The cleanup_T structure stores the pending
					 * error/interrupt/exception state.
					 */.do_throw();
				} 
		} 
	}
	public void ex_endfunction() {
		ModernizedCProgram.emsg(((byte)("E193: :endfunction not inside a function"/*
		 * Return TRUE if the string "p" looks like a ":while" or ":for" command.
		 */)));
	}
	public int readfile(Object[] fname, Object sfname, Object from, Object lines_to_skip, Object lines_to_read, int flags) {
		int fd = /* can be NULL! */0;
		int newfile = (flags & -1024);
		int check_readonly;
		int filtering = (flags & -1024);
		int read_stdin = (flags & -1024);
		int read_buffer = (flags & -1024);
		int read_fifo = (flags & -1024);
		int generatedRead_edit = this.getRead_edit();
		int set_options = newfile || read_buffer || (eap != ((Object)0) && generatedRead_edit);
		linenr_T read_buf_lnum = /* next line to read from curbuf */1;
		colnr_T read_buf_col = /* next char to read from this line */0;
		char_u c = new char_u();
		linenr_T lnum = from;
		char_u ptr = ((Object)/* pointer into read buffer */0);
		char_u buffer = ((Object)/* read buffer */0);
		char_u new_buffer = ((Object)/* init to shut up gcc */0);
		char_u line_start = ((Object)/* init to shut up gcc */0);
		/* buffer was empty before reading */int wasempty;
		colnr_T len = new colnr_T();
		long size = 0;
		char_u p = new char_u();
		off_T filesize = 0;
		int skip_read = 0;
		char_u cryptkey = ((Object)0);
		int did_ask_for_key = 0;
		context_sha256_T sha_ctx = new context_sha256_T();
		int read_undo_file = 0;
		int split = /* number of split lines */0/* file size is unknown */;
		linenr_T linecnt = new linenr_T();
		int error = /* errors encountered */0;
		int ff_error = -/* file format with errors */1;
		long linerest = /* remaining chars in line */0;
		/* protection bits for swap file */int perm;
		int fileformat = /* end-of-line format */0;
		int keep_fileformat = 0;
		stat_T st = new stat_T();
		int file_readonly;
		linenr_T skip_count = 0;
		linenr_T read_count = 0;
		int msg_save = msg_scroll;
		linenr_T read_no_eol_lnum = /* non-zero lnum when last line of
							 * last read was missing the eol */0;
		int try_mac;
		int try_dos;
		int try_unix;
		int file_rewind = 0;
		int can_retry;
		linenr_T conv_error = /* line nr with conversion error */0;
		linenr_T illegal_byte = /* line nr with illegal byte */0;
		int keep_dest_enc = /* don't retry when char doesn't fit
							   in destination encoding */0;
		int bad_char_behavior = (byte)'?'/* BAD_KEEP, BAD_DROP or character to
							 * replace with */;
		char_u tmpname = ((Object)/* name of 'charconvert' output file */0);
		int fio_flags = 0;
		/* fileencoding to use */char_u fenc = new char_u();
		/* fenc_next is in allocated memory */int fenc_alloced;
		char_u fenc_next = ((Object)/* next item in 'fencs' or NULL */0);
		int advance_fenc = 0;
		long real_size = 0/* descriptor for iconv() or -1 */;
		int converted = /* TRUE when iconv() failed and trying
							   'charconvert' next *//* TRUE if conversion done */0;
		int notconverted = /* TRUE if conversion wanted but it
							   wasn't possible */0;
		char_u[] conv_rest = new char_u();
		int conv_restlen = /* nr of bytes in conv_rest[] */0;
		buf_T old_curbuf = new buf_T();
		char_u old_b_ffname = new char_u();
		char_u old_b_fname = new char_u();
		int using_b_ffname;
		int using_b_fname;
		au_did_filetype = /* reset before triggering any autocommands */0;
		curbuf.setB_no_eol_lnum(/* in case it was set by the previous read */0/*
		     * If there is no file name yet, use the one for the read file.
		     * BF_NOTEDITED is set to reflect this.
		     * Don't do this for a read from a filter.
		     * Only do this when 'cpoptions' contains the 'f' flag.
		     */);
		Object[] generatedB_ffname = curbuf.getB_ffname();
		if (generatedB_ffname == ((Object)0) && !filtering && fname != ((Object)0) && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'f') != ((Object)0) && !(flags & -1024)) {
			if (ModernizedCProgram.set_rw_fname(fname, sfname) == 0) {
				return 0/* Remember the initial values of curbuf, curbuf->b_ffname and
				     * curbuf->b_fname to detect whether they are altered as a result of
				     * executing nasty autocommands.  Also check if "fname" and "sfname"
				     * point to one of these values. */;
			} 
		} 
		old_curbuf = curbuf;
		old_b_ffname = generatedB_ffname;
		Object[] generatedB_fname = curbuf.getB_fname();
		old_b_fname = generatedB_fname;
		using_b_ffname = (fname == generatedB_ffname) || (sfname == generatedB_ffname);
		using_b_fname = (fname == generatedB_fname) || (sfname == generatedB_fname);
		ex_no_reprint = /* After reading a file the cursor line changes but we don't want to
		     * display the line. */1;
		need_fileinfo = /* don't display the file info for another buffer now */0/*
		     * For Unix: Use the short file name whenever possible.
		     * Avoids problems with networks and when directory names are changed.
		     * Don't do this for MS-DOS, a "cd" in a sub-shell may have moved us to
		     * another directory, which we don't detect.
		     */;
		if (sfname == ((Object)0)) {
			sfname = fname;
		} 
		 generatedB_op_start = curbuf.getB_op_start();
		if (!filtering && !read_stdin && !/*
		     * The BufReadCmd and FileReadCmd events intercept the reading process by
		     * executing the associated commands instead.
		     */read_buffer) {
			pos_T pos = new pos_T();
			pos = generatedB_op_start;
			generatedB_op_start.setLnum(((from == 0) ? 1 : /* Set '[ mark to the line above where the lines go (line 1 if zero). */from));
			generatedB_op_start.setCol(0);
			if (newfile) {
				if (ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_BUFREADCMD, ((Object)0), sfname, 0, curbuf, eap)) {
					return ModernizedCProgram.aborting() ? 0 : 1;
				} 
			}  else if (ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_FILEREADCMD, sfname, sfname, 0, ((Object)0), eap)) {
				return ModernizedCProgram.aborting() ? 0 : 1;
			} 
			curbuf.setB_op_start(pos);
		} 
		int generatedB_help = curbuf.getB_help();
		if ((ModernizedCProgram.shortmess((byte)'o') || generatedB_help) && ModernizedCProgram.p_verbose == 0) {
			msg_scroll = /* overwrite previous file message */0;
		} else {
				msg_scroll = /* don't overwrite previous file message */1/*
				     * If the name ends in a path separator, we can't open it.  Check here,
				     * because reading the file may actually work, but then creating the swap
				     * file may destroy it!  Reported on MS-DOS and Win 95.
				     * If the name is too long we might crash further on, quit here.
				     */;
		} 
		if (fname != ((Object)0) && fname != (byte)'\000') {
			p = fname + /*Error: Function owner not recognized*/strlen((byte)(fname));
			if (ModernizedCProgram.after_pathsep(fname, p) || /*Error: Function owner not recognized*/strlen((byte)(fname)) >= 1024) {
				curbuf.filemess(fname, (char_u)((byte)("Illegal file name")), 0);
				ModernizedCProgram.msg_end();
				msg_scroll = msg_save;
				return 0;
			} 
		} 
		if (!read_stdin && !read_buffer && !read_fifo/*
			 * On Unix it is possible to read a directory, so we have to
			 * check for it before the mch_open().
			 *//* not a regular file ... *//* ... or fifo *//* ... or socket *//* ... or a character special file named /dev/fd/<n> */) {
			if (!p_odev && ModernizedCProgram.mch_nodetype(fname) == /*
				 * MS-Windows allows opening a device, but we will probably get stuck
				 * trying to read it.
				 */1) {
				curbuf.filemess(fname, (char_u)((byte)("is a device (disabled with 'opendevice' option)")), 0);
				ModernizedCProgram.msg_end();
				msg_scroll = msg_save;
				return 0;
			} 
		} 
		/* Set default or forced 'fileformat' and 'binary'. */eap/*
		     * When opening a new file we take the readonly flag from the file.
		     * Default is r/w, can be set to r/o below.
		     * Don't reset it when in readonly mode
		     * Only set/reset b_p_ro when BF_CHECK_RO is set.
		     */.set_file_options(set_options);
		int generatedB_flags = curbuf.getB_flags();
		check_readonly = (newfile && (generatedB_flags & -1024));
		if (check_readonly && !readonlymode) {
			curbuf.setB_p_ro(0);
		} 
		long generatedB_mtime = curbuf.getB_mtime();
		if (newfile && !read_stdin && !read_buffer && !read_fifo) {
			if ((st).vim_stat(((byte)fname)) >= /* Remember time of file. */0) {
				ModernizedCProgram.buf_store_time(curbuf, st, fname);
				curbuf.setB_mtime_read(generatedB_mtime);
			} else {
					curbuf.setB_mtime(0);
					curbuf.setB_mtime_read(0);
					curbuf.setB_orig_size(0);
					curbuf.setB_orig_mode(0);
			} 
			generatedB_flags &=  ~(-1024 | /* Reset the "new file" flag.  It will be set again below when the
				 * file doesn't exist. */-1024/*
			 * for UNIX: check readonly with perm and mch_access()
			 * for Amiga: check readonly by trying to open the file for writing
			 */);
		} 
		file_readonly = 0;
		if (read_stdin) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmode(0, /* Force binary I/O on stdin to avoid CR-LF -> LF conversion. */-1024);
		}  else if (!read_buffer) {
			if (ModernizedCProgram.mch_access((byte)fname, 2)) {
				file_readonly = 1;
			} 
			fd = ModernizedCProgram.mch_open((byte)fname, 0 | 0, 0);
		} 
		/* try to open ro */if (fd < /* cannot open at all */0) {
			int isdir_f;
			msg_scroll = msg_save/*
				 * On Amiga we can't open a directory, check here.
				 *//*
				 * On Amiga we can't open a directory, check here.
				 */;
			isdir_f = (ModernizedCProgram.mch_isdir(fname));
			perm = ModernizedCProgram.mch_getperm(/* check if the file exists */fname);
			if (isdir_f) {
				curbuf.filemess(sfname, (char_u)((byte)("is a directory")), 0);
				curbuf.setB_p_ro(/* must use "w!" now */1);
			}  else if (newfile) {
				if (perm < 0 && (/*Error: Function owner not recognized*/_errno()) == 2) {
					generatedB_flags |=  /*
							     * Set the 'new-file' flag, so that when the file has
							     * been created by someone else, a ":w" will complain.
							     */-1024/* Create a swap file now, so that other Vims are warned
							     * that we are editing this file.  Don't do this for a
							     * "nofile" or "nowrite" buffer type. */;
					if (!curbuf.bt_dontwrite()) {
						ModernizedCProgram.check_need_swap(newfile);
						if (curbuf != /* SwapExists autocommand may mess things up */old_curbuf || (using_b_ffname && (old_b_ffname != generatedB_ffname)) || (using_b_fname && (old_b_fname != generatedB_fname))) {
							ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_auchangedbuf)));
							return 0;
						} 
					} 
					if (ModernizedCProgram.dir_of_file_exists(fname)) {
						curbuf.filemess(sfname, (char_u)((byte)("[New File]")), 0);
					} else {
							curbuf.filemess(sfname, (char_u)((byte)("[New DIRECTORY]")), 0);
					} 
					ModernizedCProgram.check_marks_read();
					if (eap != ((Object)/* Set forced 'fileencoding'.  */0)) {
						eap.set_forced_fenc();
					} 
					ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_BUFNEWFILE, sfname, sfname, 0, curbuf, eap);
					/* remember the current fileformat */curbuf.save_file_ff();
					if (ModernizedCProgram.aborting()) {
						return 0;
					} 
					return /* a new file is not an error */1;
				} else {
						curbuf.filemess(sfname, (char_u)(((/*Error: Function owner not recognized*/_errno()) == 27) ? ((byte)("[File too big]")) : ((byte)("[Permission Denied]"))), 0);
						curbuf.setB_p_ro(/* must use "w!" now */1);
				} 
			} 
			return 0/*
			     * Only set the 'ro' flag for readonly files the first time they are
			     * loaded.	Help files always get readonly mode
			     */;
		} 
		if ((check_readonly && file_readonly) || generatedB_help) {
			curbuf.setB_p_ro(1);
		} 
		if (set_options) {
			if (!/* Don't change 'eol' if reading from buffer as it will already be
				 * correctly set when reading stdin. */read_buffer) {
				curbuf.setB_p_eol(1);
				curbuf.setB_start_eol(1);
			} 
			curbuf.setB_p_bomb(0);
			curbuf.setB_start_bomb(0/* Create a swap file now, so that other Vims are warned that we are
			     * editing this file.
			     * Don't do this for a "nofile" or "nowrite" buffer type. */);
		} 
		if (!curbuf.bt_dontwrite()) {
			ModernizedCProgram.check_need_swap(newfile);
			if (!read_stdin && (curbuf != old_curbuf || (using_b_ffname && (old_b_ffname != generatedB_ffname)) || (using_b_fname && (old_b_fname != generatedB_fname)))) {
				ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_auchangedbuf)));
				if (!read_buffer) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
				} 
				return 0/* Set swap file protection bits after creating it. */;
			} 
		} 
		// If "Quit" selected at ATTENTION dialog, don't load the fileif (swap_exists_action == 2) {
			if (!read_buffer && !read_stdin) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
			} 
			return 0;
		} 
		++/* don't wait for return yet */no_wait_return/*
		     * Set '[ mark to the line above where the lines go (line 1 if zero).
		     */;
		generatedB_op_start.setLnum(((from == 0) ? 1 : from));
		generatedB_op_start.setCol(0);
		try_mac = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'m') != ((Object)0));
		try_dos = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'d') != ((Object)0));
		try_unix = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'x') != ((Object)0));
		if (!read_buffer) {
			int m = msg_scroll;
			int n = ModernizedCProgram.msg_scrolled/*
				 * The file must be closed again, the autocommands may want to change
				 * the file before reading it.
				 */;
			if (!read_stdin) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(/* ignore errors */fd/*
					 * The output from the autocommands should not overwrite anything and
					 * should not be overwritten: Set msg_scroll, restore its value if no
					 * output was done.
					 */);
			} 
			msg_scroll = 1;
			if (filtering) {
				ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_FILTERREADPRE, ((Object)0), sfname, 0, curbuf, eap);
			}  else if (read_stdin) {
				ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_STDINREADPRE, ((Object)0), sfname, 0, curbuf, eap);
			}  else if (newfile) {
				ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_BUFREADPRE, ((Object)0), sfname, 0, curbuf, eap);
			} else {
					ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_FILEREADPRE, sfname, sfname, 0, ((Object)0), eap);
			} 
			try_mac = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'m') != ((Object)/* autocommands may have changed it */0));
			try_dos = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'d') != ((Object)0));
			try_unix = (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_ffs, (byte)'x') != ((Object)0));
			if (ModernizedCProgram.msg_scrolled == n) {
				msg_scroll = ModernizedCProgram.m;
			} 
			if (ModernizedCProgram.aborting()) {
				--no_wait_return;
				msg_scroll = msg_save;
				curbuf.setB_p_ro(/* must use "w!" now */1);
				return 0/*
					 * Don't allow the autocommands to change the current buffer.
					 * Try to re-open the file.
					 *
					 * Don't allow the autocommands to change the buffer name either
					 * (cd for example) if it invalidates fname or sfname.
					 */;
			} 
			if (!read_stdin && (curbuf != old_curbuf || (using_b_ffname && (old_b_ffname != generatedB_ffname)) || (using_b_fname && (old_b_fname != generatedB_fname)) || (fd = ModernizedCProgram.mch_open((byte)fname, 0 | 0, 0)) < 0)) {
				--no_wait_return;
				msg_scroll = msg_save;
				if (fd < 0) {
					ModernizedCProgram.emsg(((byte)("E200: *ReadPre autocommands made the file unreadable")));
				} else {
						ModernizedCProgram.emsg(((byte)("E201: *ReadPre autocommands must not change current buffer")));
				} 
				curbuf.setB_p_ro(/* must use "w!" now */1);
				return 0;
			} 
		} 
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		wasempty = (generatedMl_flags & /* Autocommands may add lines to the file, need to check if it is empty */1);
		if (!recoverymode && !filtering && !(flags & -1024/*
			 * Show the user that we are busy reading the input.  Sometimes this
			 * may take a while.  When reading from stdin another program may
			 * still be running, don't move the cursor to the last line, unless
			 * always using the GUI.
			 */)) {
			if (read_stdin) {
				if (!ModernizedCProgram.is_not_a_term()) {
					ModernizedCProgram.mch_msg(((byte)("Vim: Reading from stdin...\n"/* Also write a message in the GUI window, if there is one. */)));
				} 
			}  else if (!read_buffer) {
				curbuf.filemess(sfname, (char_u)"", 0);
			} 
		} 
		msg_scroll = /* overwrite the file message */0/*
		     * Set linecnt now, before the "retry" caused by a wrong guess for
		     * fileformat, and after the autocommands, which may change them.
		     */;
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		linecnt = generatedMl_line_count;
		int generatedBad_char = this.getBad_char();
		if (eap != ((Object)0) && generatedBad_char != /* "++bad=" argument. */0) {
			bad_char_behavior = generatedBad_char;
			if (set_options) {
				curbuf.setB_bad_char(generatedBad_char);
			} 
		} else {
				curbuf.setB_bad_char(0/*
				     * Decide which 'encoding' to use or use first.
				     */);
		} 
		int generatedForce_enc = this.getForce_enc();
		Object[] generatedCmd = this.getCmd();
		int generatedB_p_bin = curbuf.getB_p_bin();
		Object generatedB_p_fenc = curbuf.getB_p_fenc();
		if (eap != ((Object)0) && generatedForce_enc != 0) {
			fenc = ModernizedCProgram.enc_canonize(generatedCmd + generatedForce_enc);
			fenc_alloced = 1;
			keep_dest_enc = 1;
		}  else if (generatedB_p_bin) {
			fenc = (char_u)/* binary: don't convert */"";
			fenc_alloced = 0;
		}  else if (generatedB_help) {
			char_u[] firstline = new char_u();
			int fc;
			fenc = (char_u)"latin1";
			c = enc_utf8;
			if (!c && !read_stdin) {
				fc = fname[/*Error: Function owner not recognized*/strlen((byte)(fname)) - 1];
				if ((((fc) < (byte)'A' || (fc) > (byte)'Z') ? (fc) : (fc) + ((byte)'a' - (byte)'A')) == (byte)'x') {
					len = ModernizedCProgram.read_eintr(fd, firstline, /* Read the first line (and a bit more).  Immediately rewind to
							 * the start of the file.  If the read() fails "len" is -1. */80);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lseek64(fd, (off_T)-1024, 0);
					for (p = firstline; p < firstline + len; ++p) {
						if (p >= -1024) {
							c = 1;
							break;
						} 
					}
				} 
			} 
			if (c) {
				fenc_next = fenc;
				fenc = (char_u)"utf-8"/* When the file is utf-8 but a character doesn't fit in
					     * 'encoding' don't retry.  In help text editing utf-8 bytes
					     * doesn't make sense. */;
				if (!enc_utf8) {
					keep_dest_enc = 1;
				} 
			} 
			fenc_alloced = 0;
		}  else if (ModernizedCProgram.p_fencs == (byte)'\000') {
			fenc = generatedB_p_fenc;
			fenc_alloced = 0;
		} else {
				fenc_next = /* try items in 'fileencodings' */ModernizedCProgram.p_fencs;
				fenc = ModernizedCProgram.next_fenc(fenc_next, fenc_alloced/*
				     * Jump back here to retry reading the file in different ways.
				     * Reasons to retry:
				     * - encoding conversion failed: try another one from "fenc_next"
				     * - BOM detected and fenc was set, need to setup conversion
				     * - "fileformat" check failed: try another
				     *
				     * Variables set for special retry actions:
				     * "file_rewind"	Rewind the file to start reading it again.
				     * "advance_fenc"	Advance "fenc" using "fenc_next".
				     * "skip_read"	Re-use already read bytes (BOM detected).
				     * "did_iconv"	iconv() conversion failed, try 'charconvert'.
				     * "keep_fileformat" Don't reset "fileformat".
				     *
				     * Other status indicators:
				     * "tmpname"	When != NULL did conversion with 'charconvert'.
				     *			Output file has to be deleted afterwards.
				     * "iconv_fd"	When != -1 did conversion with iconv().
				     */);
		} 
		int generatedForce_ff = this.getForce_ff();
		if (keep_fileformat) {
			keep_fileformat = 0;
		} else {
				if (eap != ((Object)0) && generatedForce_ff != 0) {
					fileformat = ModernizedCProgram.get_fileformat_force(curbuf, eap);
					try_unix = try_dos = try_mac = 0;
				}  else if (generatedB_p_bin) {
					fileformat = /* binary: use Unix format */0;
				}  else if (ModernizedCProgram.p_ffs == (byte)'\000') {
					fileformat = /* use format from buffer */curbuf.get_fileformat();
				} else {
						fileformat = -/* detect from file */1;
				} 
		} 
		/* aborted conversion with iconv(), close the descriptor */if (advance_fenc/*
			 * Try the next entry in 'fileencodings'.
			 */) {
			advance_fenc = 0;
			if (eap != ((Object)0) && generatedForce_enc != 0) {
				notconverted = /* Conversion given with "++cc=" wasn't possible, read
					     * without conversion. */1;
				conv_error = 0;
				if (fenc_alloced) {
					ModernizedCProgram.vim_free(fenc);
				} 
				fenc = (char_u)"";
				fenc_alloced = 0;
			} else {
					if (fenc_alloced) {
						ModernizedCProgram.vim_free(fenc);
					} 
					if (fenc_next != ((Object)0)) {
						fenc = ModernizedCProgram.next_fenc(fenc_next, fenc_alloced);
					} else {
							fenc = (char_u)"";
							fenc_alloced = 0;
					} 
			} 
			if (tmpname != ((Object)0)) {
				ModernizedCProgram.mch_remove(/* delete converted file */tmpname);
				do {
					if ((tmpname) != ((Object)0)) {
						ModernizedCProgram.vim_free(tmpname);
						(tmpname) = ((Object)0);
					} 
				} while (0);
			} 
		} 
		fio_flags = /*
		     * Conversion may be required when the encoding of the file is different
		     * from 'encoding' or 'encoding' is UTF-16, UCS-2 or UCS-4.
		     */0;
		converted = ModernizedCProgram.need_conversion(fenc);
		if (converted) {
			if (/*Error: Function owner not recognized*/strcmp((byte)(fenc), (byte)("ucs-bom")) == /* "ucs-bom" means we need to check the first bytes of the file
				 * for a BOM. */0) {
				fio_flags = -1024/*
					 * Check if UCS-2/4 or Latin1 to UTF-8 conversion needs to be
					 * done.  This is handled below after read().  Prepare the
					 * fio_flags to avoid having to parse the string each time.
					 * Also check for Unicode to Latin1 conversion, because iconv()
					 * appears not to handle this correctly.  This works just like
					 * conversion to UTF-8 except how the resulting character is put in
					 * the buffer.
					 */;
			}  else if (enc_utf8 || /*Error: Function owner not recognized*/strcmp((byte)(ModernizedCProgram.p_enc), (byte)("latin1")) == 0) {
				fio_flags = ModernizedCProgram.get_fio_flags(fenc/*
					 * Conversion from an MS-Windows codepage to UTF-8 or another codepage
					 * is handled with MultiByteToWideChar().
					 */);
			} 
			if (fio_flags == 0) {
				fio_flags = ModernizedCProgram.get_win_fio_flags(fenc/* Conversion from Apple MacRoman to latin1 or UTF-8 */);
			} 
			if (fio_flags == 0 && !read_stdin && !read_buffer && p_ccv != /*
				 * Use the 'charconvert' expression when conversion is required
				 * and we can't do it internally or with iconv().
				 */(byte)'\000' && !read_fifo) {
				if (tmpname == ((Object)/* Skip conversion when it's already done (retry for wrong
					     * "fileformat"). */0)) {
					tmpname = ModernizedCProgram.readfile_charconvert(fname, fenc, fd);
					if (tmpname == ((Object)0)) {
						advance_fenc = /* Conversion failed.  Try another one. */1;
						if (fd < 0) {
							ModernizedCProgram.emsg(((byte)(/* Re-opening the original file failed! */"E202: Conversion made file unreadable!")));
							error = 1;
							;
						} 
						;
					} 
				} 
			} else {
					if (fio_flags == 0) {
						advance_fenc = /* Conversion wanted but we can't.
								 * Try the next conversion in 'fileencodings' */1;
						;
					} 
			} 
		} 
		can_retry = (fenc != (byte)'\000' && !read_stdin && !read_fifo && !/* Set "can_retry" when it's possible to rewind the file and try with
		     * another "fenc" value.  It's FALSE when no other "fenc" to try, reading
		     * stdin or fixed at a specific encoding. */keep_dest_enc);
		Object generatedB_p_udf = curbuf.getB_p_udf();
		Object generatedB_cryptstate = curbuf.getB_cryptstate();
		if (!skip_read) {
			linerest = 0;
			filesize = 0;
			skip_count = lines_to_skip;
			read_count = lines_to_read;
			conv_restlen = 0;
			read_undo_file = (newfile && (flags & -1024) == 0 && generatedB_ffname != ((Object)0) && generatedB_p_udf && !filtering && !read_fifo && !read_stdin && !read_buffer);
			if (read_undo_file) {
				sha_ctx.sha256_start();
			} 
			if (generatedB_cryptstate != ((Object)0)) {
				generatedB_cryptstate.crypt_free_state();
				curbuf.setB_cryptstate(((Object)0));
			} 
		} 
		int generatedB_p_eol = curbuf.getB_p_eol();
		int generatedB_p_bomb = curbuf.getB_p_bomb();
		if (!error && !got_int && linerest != 0 && !(!generatedB_p_bin && fileformat == 1 && line_start == 26 && ptr == line_start + 1)) {
			if (/* remember for when writing */set_options) {
				curbuf.setB_p_eol(0);
			} 
			ptr = (byte)'\000';
			len = (colnr_T)(ptr - line_start + 1);
			if (ModernizedCProgram.ml_append(lnum, line_start, len, newfile) == 0) {
				error = 1;
			} else {
					if (read_undo_file) {
						sha_ctx.sha256_update(line_start, len);
					} 
					read_no_eol_lnum = ++lnum;
			} 
		} 
		if (set_options) {
			/* remember the current file format */curbuf.save_file_ff();
		} 
		if (generatedB_cryptstate != ((Object)0)) {
			generatedB_cryptstate.crypt_free_state();
			curbuf.setB_cryptstate(((Object)0));
		} 
		Object generatedB_p_key = curbuf.getB_p_key();
		if (cryptkey != ((Object)0) && cryptkey != generatedB_p_key) {
			ModernizedCProgram.crypt_free_key(cryptkey/* Don't set cryptkey to NULL, it's used below as a flag that
			     * encryption was used. */);
		} 
		if (/* If editing a new file: set 'fenc' for the current buffer.
		     * Also for ":read ++edit file". */set_options) {
			ModernizedCProgram.set_string_option_direct((char_u)"fenc", -1, fenc, 1 | 4, 0);
		} 
		if (fenc_alloced) {
			ModernizedCProgram.vim_free(fenc);
		} 
		if (!read_buffer && !read_stdin) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(/* errors are ignored */fd);
		} 
		ModernizedCProgram.vim_free(buffer);
		if (read_stdin) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(/* Use stderr for stdin, makes shell commands work. */0);
			ModernizedCProgram.vim_ignored = /*Error: Function owner not recognized*/dup(2);
		} 
		if (tmpname != ((Object)0)) {
			ModernizedCProgram.mch_remove(/* delete converted file */tmpname);
			ModernizedCProgram.vim_free(tmpname);
		} 
		--/* may wait for return now */no_wait_return/*
		     * In recovery mode everything but autocommands is skipped.
		     */;
		int generatedB_p_ro = curbuf.getB_p_ro();
		 generatedB_op_end = curbuf.getB_op_end();
		if (!recoverymode) {
			if (newfile && wasempty && !(generatedMl_flags & /* need to delete the last line, which comes from the empty buffer */1)) {
				ModernizedCProgram.ml_delete(generatedMl_line_count, 0);
				--linecnt;
			} 
			linecnt = generatedMl_line_count - linecnt;
			if (filesize == 0) {
				linecnt = 0;
			} 
			if (newfile || read_buffer) {
				ModernizedCProgram.redraw_curbuf_later(40);
				/* After reading the text into the buffer the diff info needs to
					     * be updated. */curbuf.diff_invalidate();
				/* All folds in the window are invalid now.  Mark them for update
					     * before triggering autocommands. */ModernizedCProgram.curwin.foldUpdateAll();
			}  else if (/* appended at least one line */linecnt) {
				ModernizedCProgram.appended_lines_mark(from, linecnt/*
					 * If we were reading from the same terminal as where messages go,
					 * the screen will have been messed up.
					 * Switch on raw mode now and clear the screen.
					 *//*
					 * If we were reading from the same terminal as where messages go,
					 * the screen will have been messed up.
					 * Switch on raw mode now and clear the screen.
					 */);
			} 
			if (read_stdin) {
				ModernizedCProgram.settmode(/* set to raw mode */2);
				ModernizedCProgram.starttermcap();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/screenclear();
			} 
			if (got_int) {
				if (!(flags & -1024)) {
					curbuf.filemess(sfname, (char_u)((byte)(e_interr)), 0);
					if (newfile) {
						curbuf.setB_p_ro(/* must use "w!" now */1);
					} 
				} 
				msg_scroll = msg_save;
				ModernizedCProgram.check_marks_read();
				return /* an interrupt isn't really an error */1;
			} 
			if (!filtering && !(flags & -1024)) {
				curbuf.msg_add_fname(/* fname in IObuff with quotes */sfname);
				c = 0/* fifo */;
				if (generatedB_p_ro) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(ModernizedCProgram.shortmess((byte)'r') ? ((byte)("[RO]")) : ((byte)("[readonly]"))));
					c = 1;
				} 
				if (read_no_eol_lnum) {
					ModernizedCProgram.msg_add_eol();
					c = 1;
				} 
				if (ff_error == 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[CR missing]"))));
					c = 1;
				} 
				if (split) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[long lines split]"))));
					c = 1;
				} 
				if (notconverted) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[NOT converted]"))));
					c = 1;
				}  else if (converted) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[converted]"))));
					c = 1;
				} 
				if (cryptkey != ((Object)0)) {
					curbuf.crypt_append_msg();
					c = 1;
				} 
				if (conv_error != 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff + /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), ((byte)("[CONVERSION ERROR in line %ld]")), (long)conv_error);
					c = 1;
				}  else if (illegal_byte > 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff + /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), ((byte)("[ILLEGAL BYTE in line %ld]")), (long)illegal_byte);
					c = 1;
				}  else if (error) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("[READ ERRORS]"))));
					c = 1;
				} 
				if (ModernizedCProgram.msg_add_fileformat(fileformat)) {
					c = 1;
				} 
				if (cryptkey != ((Object)0)) {
					ModernizedCProgram.msg_add_lines(c, (long)linecnt, filesize - ModernizedCProgram.crypt_get_header_len(curbuf.crypt_get_method_nr()));
				} else {
						ModernizedCProgram.msg_add_lines(c, (long)linecnt, filesize);
				} 
				do {
					if ((keep_msg) != ((Object)0)) {
						ModernizedCProgram.vim_free(keep_msg);
						(keep_msg) = ((Object)0);
					} 
				} while (0);
				msg_scrolled_ign = 1/* Don't show the message when reading stdin, it would end up in a
					     * message box (which might be shown when exiting!) */;
				{ 
					if (ModernizedCProgram.msg_col > 0) {
						ModernizedCProgram.msg_putchar((byte)'\r');
					} 
					p = (char_u)ModernizedCProgram.msg_trunc_attr((byte)ModernizedCProgram.IObuff, 0, 0);
				}
				if (read_stdin || read_buffer || restart_edit != 0 || (ModernizedCProgram.msg_scrolled != 0 && !need_wait_return/* Need to repeat the message after redrawing when:
						 * - When reading from stdin (the screen will be cleared next).
						 * - When restart_edit is set (otherwise there will be a delay
						 *   before redrawing).
						 * - When the screen was scrolled but there is no wait-return
						 *   prompt. */)) {
					ModernizedCProgram.set_keep_msg(p, 0);
				} 
				msg_scrolled_ign = 0;
			} 
			if (newfile && (/* with errors writing the file requires ":w!" */error || conv_error != 0 || (illegal_byte > 0 && bad_char_behavior != -1))) {
				curbuf.setB_p_ro(1);
			} 
			ModernizedCProgram.u_clearline();
			if (exmode_active) {
				ModernizedCProgram.curwin.getW_cursor().setLnum(from + linecnt);
			} else {
					ModernizedCProgram.curwin.getW_cursor().setLnum(from + 1);
			} 
			ModernizedCProgram.check_cursor_lnum();
			ModernizedCProgram.beginline(1 | /* on first non-blank */4/*
				 * Set '[ and '] marks to the newly read lines.
				 */);
			generatedB_op_start.setLnum(from + 1);
			generatedB_op_start.setCol(0);
			generatedB_op_end.setLnum(from + linecnt);
			generatedB_op_end.setCol(0/*
				 * Work around a weird problem: When a file has two links (only
				 * possible on NTFS) and we write through one link, then stat() it
				 * through the other link, the timestamp information may be wrong.
				 * It's correct again after reading the file, thus reset the timestamp
				 * here.
				 */);
			if (newfile && !read_stdin && !read_buffer && (st).vim_stat(((byte)fname)) >= 0) {
				ModernizedCProgram.buf_store_time(curbuf, st, fname);
				curbuf.setB_mtime_read(generatedB_mtime);
			} 
		} 
		msg_scroll = msg_save;
		ModernizedCProgram.check_marks_read();
		curbuf.setB_no_eol_lnum(read_no_eol_lnum);
		if (flags & /* When reloading a buffer put the cursor at the first line that is
		     * different. */-1024) {
			ModernizedCProgram.u_find_first_changed();
		} 
		if (/*
		     * When opening a new file locate undo info and read it.
		     */read_undo_file) {
			char_u[] hash = new char_u();
			sha_ctx.sha256_finish(hash);
			ModernizedCProgram.u_read_undo(((Object)0), hash, fname);
		} 
		Object generatedB_p_ft = curbuf.getB_p_ft();
		if (!read_stdin && !read_fifo && (!read_buffer || sfname != ((Object)0))) {
			int m = msg_scroll;
			int n = ModernizedCProgram.msg_scrolled;
			if (/* Save the fileformat now, otherwise the buffer will be considered
				 * modified if the format/encoding was automatically detected. */set_options) {
				curbuf/*
					 * The output from the autocommands should not overwrite anything and
					 * should not be overwritten: Set msg_scroll, restore its value if no
					 * output was done.
					 */.save_file_ff();
			} 
			msg_scroll = 1;
			if (filtering) {
				ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_FILTERREADPOST, ((Object)0), sfname, 0, curbuf, eap);
			}  else if (newfile || (read_buffer && sfname != ((Object)0))) {
				ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_BUFREADPOST, ((Object)0), sfname, 0, curbuf, eap);
				if (!au_did_filetype && generatedB_p_ft != (byte)'\000'/*
						 * EVENT_FILETYPE was not triggered but the buffer already has a
						 * filetype. Trigger EVENT_FILETYPE using the existing filetype.
						 */) {
					curbuf.apply_autocmds(auto_event.EVENT_FILETYPE, generatedB_p_ft, generatedB_fname, 1);
				} 
			} else {
					ModernizedCProgram.apply_autocmds_exarg(auto_event.EVENT_FILEREADPOST, sfname, sfname, 0, ((Object)0), eap);
			} 
			if (ModernizedCProgram.msg_scrolled == n) {
				msg_scroll = ModernizedCProgram.m;
			} 
			if (ModernizedCProgram.aborting()) {
				return 0;
			} 
		} 
		if (recoverymode && error) {
			return 0;
		} 
		return 1/*
		 * Returns TRUE if the file name argument is of the form "/dev/fd/\d\+",
		 * which is the name of files used for process substitution output by
		 * some shells on some operating systems, e.g., bash on SunOS.
		 * Do not accept "/dev/fd/[012]", opening these may hang Vim.
		 */;
	}
	public void set_file_options(int set_options) {
		int generatedForce_ff = this.getForce_ff();
		if (/* set default 'fileformat' */set_options) {
			if (eap != ((Object)0) && generatedForce_ff != 0) {
				ModernizedCProgram.set_fileformat(ModernizedCProgram.get_fileformat_force(curbuf, eap), 4);
			}  else if (ModernizedCProgram.p_ffs != (byte)'\000') {
				ModernizedCProgram.set_fileformat(ModernizedCProgram.default_fileformat(), 4);
			} 
		} 
		int generatedForce_bin = this.getForce_bin();
		int generatedB_p_bin = curbuf.getB_p_bin();
		if (eap != ((Object)0) && generatedForce_bin != /* set or reset 'binary' */0) {
			int oldval = generatedB_p_bin;
			curbuf.setB_p_bin((generatedForce_bin == 1));
			ModernizedCProgram.set_options_bin(oldval, generatedB_p_bin, 4/*
			 * Set forced 'fileencoding'.
			 */);
		} 
	}
	public void set_forced_fenc() {
		int generatedForce_enc = this.getForce_enc();
		Object[] generatedCmd = this.getCmd();
		if (generatedForce_enc != 0) {
			char_u fenc = ModernizedCProgram.enc_canonize(generatedCmd + generatedForce_enc);
			if (fenc != ((Object)0)) {
				ModernizedCProgram.set_string_option_direct((char_u)"fenc", -1, fenc, 1 | 4, 0);
			} 
			ModernizedCProgram.vim_free(fenc/*
			 * Find next fileencoding to use from 'fileencodings'.
			 * "pp" points to fenc_next.  It's advanced to the next item.
			 * When there are no more items, an empty string is returned and *pp is set to
			 * NULL.
			 * When *pp is not set to NULL, the result is in allocated memory and "alloced"
			 * is set to TRUE.
			 */);
		} 
	}
	public int tclinit() {
		byte[] varname = new byte[/* Tcl_LinkVar requires writeable varname */64];
		byte name;
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (!ModernizedCProgram.tclinfo.getInterp()) {
			 interp = new ();
			 ch1 = new ();
			 ch2 = new ();
			ch1 = /*Error: Function owner not recognized*/Tcl_CreateChannel(ModernizedCProgram.tcl_channel_type, "vimout", (()1), TCL_WRITABLE);
			ch2 = /*Error: Function owner not recognized*/Tcl_CreateChannel(ModernizedCProgram.tcl_channel_type, "vimerr", (()2), TCL_WRITABLE);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetStdChannel(ch1, TCL_STDOUT);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetStdChannel(ch2, TCL_STDERR);
			interp = /*Error: Function owner not recognized*/Tcl_CreateInterp();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_Preserve(interp);
			if (/*Error: Function owner not recognized*/Tcl_Init(interp) == TCL_ERROR) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_Release(interp);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_DeleteInterp(interp);
				return 0/* VIM sure is interactive */;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetChannelOption(interp, ch1, "-buffering", "line");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetChannelOption(interp, ch1, "-translation", "lf");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetChannelOption(interp, ch2, "-buffering", "line");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetChannelOption(interp, ch2, "-translation", "lf");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_DeleteCommand(interp, /* replace standard Tcl exit command */"exit");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "exit", exitcmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::buffer", /* new commands, in ::vim namespace */buffercmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::window", windowcmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::command", commandcmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::beep", beepcmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::option", optioncmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_CreateObjCommand(interp, "::vim::expr", exprcmd, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((Object)0), ()((Object)0));
			ModernizedCProgram.tclinfo.setLbase(/* "lbase" variable */1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::lbase");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getLbase(), TCL_LINK_INT);
			ModernizedCProgram.tclinfo.setRange_start(generatedLine1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::range(start)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getRange_start(), TCL_LINK_INT | TCL_LINK_READ_ONLY);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::range(begin)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getRange_start(), TCL_LINK_INT | TCL_LINK_READ_ONLY);
			ModernizedCProgram.tclinfo.setRange_end(generatedLine2);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::range(end)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getRange_end(), TCL_LINK_INT | TCL_LINK_READ_ONLY);
			ModernizedCProgram.tclinfo.setCurbuf(/*Error: Function owner not recognized*/Tcl_Alloc(/* "current" variable */64));
			ModernizedCProgram.tclinfo.setCurwin(/*Error: Function owner not recognized*/Tcl_Alloc(64));
			name = curbuf.tclgetbuffer(interp);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(ModernizedCProgram.tclinfo.getCurbuf(), name);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::current(buffer)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getCurbuf(), TCL_LINK_STRING | TCL_LINK_READ_ONLY);
			name = ModernizedCProgram.curwin.tclgetwindow(interp);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(ModernizedCProgram.tclinfo.getCurwin(), name);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(varname, "::vim::current(window)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(interp, varname, (byte)ModernizedCProgram.tclinfo.getCurwin(), TCL_LINK_STRING | TCL_LINK_READ_ONLY);
			ModernizedCProgram.tclinfo.setInterp(interp);
		} else {
				ModernizedCProgram.tclinfo.setRange_start(((generatedLine1) - (ModernizedCProgram.tclinfo.getLbase() == /* Interpreter already exists, just update variables */0)));
				ModernizedCProgram.tclinfo.setRange_end(((generatedLine2) - (ModernizedCProgram.tclinfo.getLbase() == 0)));
				ModernizedCProgram.tclupdatevars();
		} 
		ModernizedCProgram.tclinfo.setExitvalue(0);
		return 1;
	}
	public void ex_tcl() {
		char_u script = new char_u();
		int err;
		Object[] generatedArg = this.getArg();
		script = eap.script_get(generatedArg);
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			err = eap.tclinit();
			if (err == 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_AllowExceptions(ModernizedCProgram.tclinfo.getInterp());
				if (script == ((Object)0)) {
					err = /*Error: Function owner not recognized*/Tcl_Eval(ModernizedCProgram.tclinfo.getInterp(), (byte)generatedArg);
				} else {
						err = /*Error: Function owner not recognized*/Tcl_Eval(ModernizedCProgram.tclinfo.getInterp(), (byte)script);
				} 
				err = ModernizedCProgram.tclexit(err);
			} 
		} 
		ModernizedCProgram.vim_free(script/*
		 * ":tclfile"
		 */);
	}
	public void ex_tclfile() {
		Object[] generatedArg = this.getArg();
		byte file = (byte)generatedArg;
		int err;
		err = eap.tclinit();
		if (err == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_AllowExceptions(ModernizedCProgram.tclinfo.getInterp());
			err = /*Error: Function owner not recognized*/Tcl_EvalFile(ModernizedCProgram.tclinfo.getInterp(), file);
			err = ModernizedCProgram.tclexit(err/*
			 * ":tcldo"
			 */);
		} 
	}
	public void ex_tcldo() {
		byte script;
		byte line;
		int err;
		int rs;
		int re;
		int lnum;
		byte[] var_lnum = new byte[/* must be writeable memory */64];
		byte[] var_line = new byte[64];
		linenr_T first_line = 0;
		linenr_T last_line = 0;
		buf_T was_curbuf = curbuf;
		Object generatedLine1 = this.getLine1();
		rs = generatedLine1;
		Object generatedLine2 = this.getLine2();
		re = generatedLine2;
		Object[] generatedArg = this.getArg();
		script = (byte)generatedArg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(var_lnum, "lnum");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(var_line, "line");
		err = eap.tclinit();
		if (err != 1) {
			return /*Error: Unsupported expression*/;
		} 
		lnum = ((rs) - (ModernizedCProgram.tclinfo.getLbase() == 0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_LinkVar(ModernizedCProgram.tclinfo.getInterp(), var_lnum, (byte)lnum, TCL_LINK_INT | TCL_LINK_READ_ONLY);
		err = TCL_OK;
		if (ModernizedCProgram.u_save((linenr_T)(rs - 1), (linenr_T)(re + 1)) != 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetResult(ModernizedCProgram.tclinfo.getInterp(), ((byte)("cannot save undo information")), TCL_STATIC);
			err = TCL_ERROR;
		} 
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		while (err == TCL_OK && rs <= re) {
			if ((linenr_T)rs > generatedMl_line_count) {
				break;
			} 
			line = (byte)curbuf.ml_get_buf((linenr_T)rs, 0);
			if (!line) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetResult(ModernizedCProgram.tclinfo.getInterp(), ((byte)("cannot get line")), TCL_STATIC);
				err = TCL_ERROR;
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetVar(ModernizedCProgram.tclinfo.getInterp(), var_line, line, 0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_AllowExceptions(ModernizedCProgram.tclinfo.getInterp());
			err = /*Error: Function owner not recognized*/Tcl_Eval(ModernizedCProgram.tclinfo.getInterp(), script);
			if (err != TCL_OK || /*Error: Function owner not recognized*/Tcl_InterpDeleted(ModernizedCProgram.tclinfo.getInterp()) || curbuf != was_curbuf) {
				break;
			} 
			line = (byte)/*Error: Function owner not recognized*/Tcl_GetVar(ModernizedCProgram.tclinfo.getInterp(), var_line, 0);
			if (line) {
				if (ModernizedCProgram.ml_replace((linenr_T)rs, (char_u)line, 1) != 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_SetResult(ModernizedCProgram.tclinfo.getInterp(), ((byte)("cannot replace line")), TCL_STATIC);
					err = TCL_ERROR;
					break;
				} 
				if (first_line == 0) {
					first_line = rs;
				} 
				last_line = rs;
			} 
			++rs;
			++lnum;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_UpdateLinkedVar(ModernizedCProgram.tclinfo.getInterp(), var_lnum);
		}
		if (first_line) {
			ModernizedCProgram.changed_lines(first_line, 0, last_line + 1, (long)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_UnsetVar(ModernizedCProgram.tclinfo.getInterp(), var_line, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_UnlinkVar(ModernizedCProgram.tclinfo.getInterp(), var_lnum);
		if (err == TCL_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Tcl_ResetResult(ModernizedCProgram.tclinfo.getInterp());
		} 
		(Object)ModernizedCProgram.tclexit(err);
	}
	public void ex_retab() {
		linenr_T lnum = new linenr_T();
		int got_tab = 0;
		long num_spaces = 0;
		long num_tabs;
		long len;
		long col;
		long vcol;
		long start_col = /* For start of white-space string */0;
		long start_vcol = /* For start of white-space string */0;
		long old_len;
		char_u ptr = new char_u();
		char_u new_line = (char_u)/* init to non-NULL */1;
		/* called u_save for current line */int did_undo;
		int new_vts_array = ((Object)0);
		/* string value of tab argument */char_u new_ts_str = new char_u();
		int save_list;
		linenr_T first_line = /* first changed line */0;
		linenr_T last_line = /* last changed line */0;
		save_list = ModernizedCProgram.curwin.getW_onebuf_opt().getWo_list();
		ModernizedCProgram.curwin.getW_onebuf_opt().setWo_list(/* don't want list mode here */0);
		Object[] generatedArg = this.getArg();
		new_ts_str = generatedArg;
		if (!ModernizedCProgram.tabstop_set(generatedArg, new_vts_array)) {
			return /*Error: Unsupported expression*/;
		} 
		while (ModernizedCProgram.vim_isdigit((generatedArg)) || (generatedArg) == (byte)',') {
			++(generatedArg);
		}
		Object generatedB_p_vts_array = curbuf.getB_p_vts_array();
		// allocated, or new_vts_array points to an existing array and new_ts_str// is null.if (new_vts_array == ((Object)0)) {
			new_vts_array = generatedB_p_vts_array;
			new_ts_str = ((Object)0);
		} else {
				new_ts_str = ModernizedCProgram.vim_strnsave(new_ts_str, generatedArg - new_ts_str);
		} 
		Object generatedLine2 = this.getLine2();
		int generatedForceit = this.getForceit();
		int generatedB_p_et = curbuf.getB_p_et();
		long generatedB_p_ts = curbuf.getB_p_ts();
		Object generatedLine1 = this.getLine1();
		for (lnum = generatedLine1; !got_int && lnum <= generatedLine2; ++lnum) {
			ptr = ModernizedCProgram.ml_get(lnum);
			col = 0;
			vcol = 0;
			did_undo = 0;
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (((ptr[col]) == (byte)' ' || (ptr[col]) == (byte)'\t')) {
					if (!got_tab && num_spaces == 0) {
						start_vcol = /* First consecutive white-space */vcol;
						start_col = col;
					} 
					if (ptr[col] == (byte)' ') {
						num_spaces++;
					} else {
							got_tab = 1;
					} 
				} else {
						if (got_tab || (generatedForceit && num_spaces > 1/* Retabulate this string of white-space */)) {
							len = num_spaces = vcol - /* len is virtual length of white string */start_vcol;
							num_tabs = 0;
							if (!generatedB_p_et) {
								int t;
								int s;
								ModernizedCProgram.tabstop_fromto(start_vcol, vcol, generatedB_p_ts, new_vts_array, t, s);
								num_tabs = t;
								num_spaces = s;
							} 
							if (generatedB_p_et || got_tab || (num_spaces + num_tabs < len)) {
								if (did_undo == 0) {
									did_undo = 1;
									if (ModernizedCProgram.u_save((linenr_T)(lnum - 1), (linenr_T)(lnum + 1)) == 0) {
										new_line = ((Object)/* flag out-of-memory */0);
										break;
									} 
								} 
								len = num_spaces + /* len is actual number of white characters used */num_tabs;
								old_len = (long)/*Error: Function owner not recognized*/strlen((byte)(ptr));
								new_line = ModernizedCProgram.alloc(old_len - col + start_col + len + 1);
								if (new_line == ((Object)0)) {
									break;
								} 
								if (start_col > 0) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(new_line), (byte)(ptr), (size_t)((size_t)start_col));
								} 
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(new_line + start_col + len), (byte)(ptr + col), (size_t)((size_t)(old_len - col + 1)));
								ptr = new_line + start_col;
								for (col = 0; col < len; col++) {
									ptr[col] = (col < num_tabs) ? (byte)'\t' : (byte)' ';
								}
								ModernizedCProgram.ml_replace(lnum, new_line, 0);
								if (first_line == 0) {
									first_line = lnum;
								} 
								last_line = lnum;
								ptr = new_line;
								col = start_col + len;
							} 
						} 
						got_tab = 0;
						num_spaces = 0;
				} 
				if (ptr[col] == (byte)'\000') {
					break;
				} 
				vcol += ModernizedCProgram.chartabsize(ptr + col, (colnr_T)vcol);
				if (has_mbyte) {
					col += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ptr + col);
				} else {
						++col;
				} 
			}
			if (new_line == ((Object)/* out of memory */0)) {
				break;
			} 
			ModernizedCProgram.line_breakcheck();
		}
		if (got_int) {
			ModernizedCProgram.emsg(((byte)(e_interr)));
		} 
		// If a single value was given then it can be considered equal to// either the value of 'tabstop' or the value of 'vartabstop'.if (ModernizedCProgram.tabstop_count(generatedB_p_vts_array) == 0 && ModernizedCProgram.tabstop_count(new_vts_array) == 1 && generatedB_p_ts == ModernizedCProgram.tabstop_first(new_vts_array)) {
			;
		}  else if (ModernizedCProgram.tabstop_count(generatedB_p_vts_array) > 0 && ModernizedCProgram.tabstop_eq(generatedB_p_vts_array, new_vts_array)) {
			;
		} else {
				ModernizedCProgram.redraw_curbuf_later(40);
		} 
		if (first_line != 0) {
			ModernizedCProgram.changed_lines(first_line, 0, last_line + 1, -1024);
		} 
		ModernizedCProgram.curwin.getW_onebuf_opt().setWo_list(/* restore 'list' */save_list);
		if (new_ts_str != ((Object)/* set the new tabstop */0)) {
			int old_vts_ary = generatedB_p_vts_array;
			if (ModernizedCProgram.tabstop_count(old_vts_ary) > 0 || ModernizedCProgram.tabstop_count(new_vts_array) > 1) {
				ModernizedCProgram.set_string_option_direct((char_u)"vts", -1, new_ts_str, 1 | 4, 0);
				curbuf.setB_p_vts_array(new_vts_array);
				ModernizedCProgram.vim_free(old_vts_ary);
			} else {
					curbuf.setB_p_ts(ModernizedCProgram.tabstop_first(new_vts_array));
					ModernizedCProgram.vim_free(new_vts_array);
			} 
			ModernizedCProgram.vim_free(new_ts_str);
		} 
		// If 'vartabstop' is in use or if the value given to retab has more
		ModernizedCProgram.coladvance(ModernizedCProgram.curwin.getW_curswant());
		ModernizedCProgram.u_clearline();
	}
	public void ex_sign() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u p = new char_u();
		int idx;
		sign_T sp = new sign_T();
		buf_T buf = ((Object)0);
		// Parse the subcommand.// Parse the subcommand.p = ModernizedCProgram.skiptowhite(arg);
		idx = ModernizedCProgram.sign_cmd_idx(arg, p);
		if (idx == 6) {
			ModernizedCProgram.semsg(((byte)("E160: Unknown sign command: %s")), arg);
			return /*Error: Unsupported expression*/;
		} 
		arg = ModernizedCProgram.skipwhite(p);
		sign generatedSn_next = sp.getSn_next();
		if (idx <= 2) {
			if (idx == 2 && arg == (byte)'\000') {
				for (sp = ModernizedCProgram.first_sign; sp != ((Object)0) && !got_int; sp = generatedSn_next) {
					sp.sign_list_defined();
				}
			}  else if (arg == (byte)'\000') {
				ModernizedCProgram.emsg(((byte)("E156: Missing sign name")));
			} else {
					char_u name = new char_u();
					p = ModernizedCProgram.skiptowhite(arg);
					if (p != (byte)'\000') {
						p++ = (byte)'\000';
					} 
					while (arg[0] == (byte)'0' && arg[1] != (byte)'\000') {
						++arg;
					}
					name = ModernizedCProgram.vim_strsave(arg);
					if (idx == 0) {
						ModernizedCProgram.sign_define_cmd(name, p);
					}  else if (idx == 2) {
						ModernizedCProgram.sign_list_by_name(name);
					} else {
							ModernizedCProgram.sign_undefine_by_name(name, 1);
					} 
					ModernizedCProgram.vim_free(name);
					return /*Error: Unsupported expression*/;
			} 
		} else {
				int id = -1;
				linenr_T lnum = -1;
				char_u sign_name = ((Object)0);
				char_u group = ((Object)0);
				int prio = 10;
				if (buf.parse_sign_cmd_args(idx, arg, sign_name, id, group, prio, lnum) == 0) {
					return /*Error: Unsupported expression*/;
				} 
				if (idx == 3) {
					buf.sign_place_cmd(lnum, sign_name, id, group, prio);
				}  else if (idx == 4) {
					buf.sign_unplace_cmd(lnum, sign_name, id, group);
				}  else if (idx == 5) {
					buf.sign_jump_cmd(lnum, sign_name, id, group/*
					 * Return information about a specified sign
					 */);
				} 
		} 
	}
	/*
	 * ":dis" and ":registers": Display the contents of the yank registers.
	 */
	public void ex_display() {
		int i;
		int n;
		long j;
		char_u p = new char_u();
		yankreg_T yb = new yankreg_T();
		int name;
		int attr;
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int clen;
		if (arg != ((Object)0) && arg == (byte)'\000') {
			arg = ((Object)0);
		} 
		attr = ModernizedCProgram.highlight_attr[(int)(.HLF_8)];
		// Highlight title// Highlight titleModernizedCProgram.msg_puts_title(((byte)("\n--- Registers ---")));
		Object generatedY_array = yb.getY_array();
		Object generatedY_size = yb.getY_size();
		Object generatedY_type = yb.getY_type();
		for (i = -1; i < (37 + 1) && !got_int; ++i) {
			name = ModernizedCProgram.get_register_name(i);
			if (arg != ((Object)0) && ModernizedCProgram.vim_strchr(arg, name) == ((Object)0) && (name != (byte)'*' || ModernizedCProgram.vim_strchr(arg, (byte)'+') == ((Object)0))) {
				continue;
			} 
			ModernizedCProgram.adjust_clip_reg(name);
			(Object)ModernizedCProgram.may_get_selection(name);
			if (i == -1) {
				if (ModernizedCProgram.y_previous != ((Object)0)) {
					yb = ModernizedCProgram.y_previous;
				} else {
						yb = (ModernizedCProgram.y_regs[0]);
				} 
			} else {
					yb = (ModernizedCProgram.y_regs[i]);
			} 
			if (name == ModernizedCProgram.vim_tolower(redir_reg) || (redir_reg == (byte)'"' && yb == ModernizedCProgram.y_previous)) {
				continue;
			} 
			if (generatedY_array != ((Object)0)) {
				ModernizedCProgram.msg_putchar((byte)'\n');
				ModernizedCProgram.msg_putchar((byte)'"');
				ModernizedCProgram.msg_putchar(name);
				ModernizedCProgram.msg_puts("   ");
				n = (int)Columns - 6;
				for (j = 0; j < generatedY_size && n > 1; ++j) {
					if (j) {
						ModernizedCProgram.msg_puts_attr("^J", attr);
						n -= 2;
					} 
					for (p = generatedY_array[j]; p && (n -= ModernizedCProgram.ptr2cells(p)) >= 0; ++p) {
						clen = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
						ModernizedCProgram.msg_outtrans_len(p, clen);
						p += clen - 1;
					}
				}
				if (n > 1 && generatedY_type == 1) {
					ModernizedCProgram.msg_puts_attr("^J", attr);
				} 
				ModernizedCProgram.out_flush();
			} 
			ModernizedCProgram.ui_breakcheck();
		}
		// display last inserted textif ((p = ModernizedCProgram.get_last_insert()) != ((Object)0) && (arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)'.') != ((Object)0)) && !got_int) {
			ModernizedCProgram.msg_puts("\n\".   ");
			ModernizedCProgram.dis_msg(p, 1);
		} 
		// display last command lineif (last_cmdline != ((Object)0) && (arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)':') != ((Object)0)) && !got_int) {
			ModernizedCProgram.msg_puts("\n\":   ");
			ModernizedCProgram.dis_msg(last_cmdline, 0);
		} 
		Object[] generatedB_fname = curbuf.getB_fname();
		// display current file nameif (generatedB_fname != ((Object)0) && (arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)'%') != ((Object)0)) && !got_int) {
			ModernizedCProgram.msg_puts("\n\"%   ");
			ModernizedCProgram.dis_msg(generatedB_fname, 0);
		} 
		// display alternate file nameif ((arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)'%') != ((Object)0)) && !got_int) {
			char_u fname = new char_u();
			linenr_T dummy = new linenr_T();
			if (ModernizedCProgram.buflist_name_nr(0, fname, dummy) != 0) {
				ModernizedCProgram.msg_puts("\n\"#   ");
				ModernizedCProgram.dis_msg(fname, 0);
			} 
		} 
		// display last search patternif (ModernizedCProgram.last_search_pat() != ((Object)0) && (arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)'/') != ((Object)0)) && !got_int) {
			ModernizedCProgram.msg_puts("\n\"/   ");
			ModernizedCProgram.dis_msg(ModernizedCProgram.last_search_pat(), 0);
		} 
		// display last used expressionif (ModernizedCProgram.expr_line != ((Object)0) && (arg == ((Object)0) || ModernizedCProgram.vim_strchr(arg, (byte)'=') != ((Object)0)) && !got_int) {
			ModernizedCProgram.msg_puts("\n\"=   ");
			ModernizedCProgram.dis_msg(ModernizedCProgram.expr_line, 0/*
			 * display a string for do_dis()
			 * truncate at end of screen line
			 */);
		} 
	}
	public void ex_echo() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		typval_T rettv = new typval_T();
		char_u tofree = new char_u();
		char_u p = new char_u();
		int needclr = 1;
		int atstart = 1;
		char_u[] numbuf = new char_u();
		int did_emsg_before = ModernizedCProgram.did_emsg;
		int called_emsg_before = ModernizedCProgram.called_emsg;
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			++emsg_skip;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		while (arg != (byte)'\000' && arg != (byte)'|' && arg != (byte)'\n' && !got_int) {
			need_clr_eos = /* If eval1() causes an error message the text from the command may
				 * still need to be cleared. E.g., "echo 22,44". */needclr;
			p = arg;
			if (rettv.eval1(arg, !generatedSkip) == 0/*
				     * Report the invalid expression unless the expression evaluation
				     * has been cancelled due to an aborting error, an interrupt, or an
				     * exception.
				     */) {
				if (!ModernizedCProgram.aborting() && ModernizedCProgram.did_emsg == did_emsg_before && ModernizedCProgram.called_emsg == called_emsg_before) {
					ModernizedCProgram.semsg(((byte)(e_invexpr2)), p);
				} 
				need_clr_eos = 0;
				break;
			} 
			need_clr_eos = 0;
			if (!generatedSkip) {
				if (atstart) {
					atstart = 0/* Call msg_start() after eval1(), evaluating the expression
							 * may cause a message to appear. */;
					if (generatedCmdidx == CMD_index.CMD_echo/* Mark the saved text as finishing the line, so that what
							     * follows is displayed on a new line when scrolling back
							     * at the more prompt. */) {
						ModernizedCProgram.msg_sb_eol();
						ModernizedCProgram.msg_start();
					} 
				}  else if (generatedCmdidx == CMD_index.CMD_echo) {
					ModernizedCProgram.msg_puts_attr(" ", ModernizedCProgram.echo_attr);
				} 
				p = rettv.echo_string(tofree, numbuf, ModernizedCProgram.get_copyID());
				if (p != ((Object)0)) {
					for (; p != (byte)'\000' && !got_int; ++p) {
						if (p == (byte)'\n' || p == (byte)'\r' || p == (byte)'\011') {
							if (p != (byte)'\011' && needclr) {
								ModernizedCProgram.msg_clr_eos();
								needclr = 0;
							} 
							ModernizedCProgram.msg_putchar_attr(p, ModernizedCProgram.echo_attr);
						} else {
								if (has_mbyte) {
									int i = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
									(Object)ModernizedCProgram.msg_outtrans_len_attr(p, i, ModernizedCProgram.echo_attr);
									p += i - 1;
								} else {
										(Object)ModernizedCProgram.msg_outtrans_len_attr(p, 1, ModernizedCProgram.echo_attr);
								} 
						} 
					}
				} 
				ModernizedCProgram.vim_free(tofree);
			} 
			rettv.clear_tv();
			arg = ModernizedCProgram.skipwhite(arg);
		}
		this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
		if (generatedSkip) {
			--emsg_skip;
		} else {
				if (/* remove text that may still be there from the command */needclr) {
					ModernizedCProgram.msg_clr_eos();
				} 
				if (generatedCmdidx == CMD_index.CMD_echo) {
					ModernizedCProgram.msg_end();
				} 
		} 
	}
	public void ex_echohl() {
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.echo_attr = ModernizedCProgram.syn_name2attr(generatedArg);
	}
	public void ex_execute() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		typval_T rettv = new typval_T();
		int ret = 1;
		char_u p = new char_u();
		garray_T ga = new garray_T();
		int len;
		int save_did_emsg;
		ga.ga_init2(1, 80);
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			++emsg_skip;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedGa_len = ga.getGa_len();
		Object generatedGa_data = ga.getGa_data();
		while (arg != (byte)'\000' && arg != (byte)'|' && arg != (byte)'\n') {
			ret = rettv.eval1_emsg(arg, !generatedSkip);
			if (ret == 0) {
				break;
			} 
			if (!generatedSkip) {
				char_u[] buf = new char_u();
				if (generatedCmdidx == CMD_index.CMD_execute) {
					p = rettv.tv_get_string_buf(buf);
				} else {
						p = rettv.tv_stringify(buf);
				} 
				len = (int)/*Error: Function owner not recognized*/strlen((byte)(p));
				if (ga.ga_grow(len + 2) == 0) {
					rettv.clear_tv();
					ret = 0;
					break;
				} 
				if (generatedGa_len) {
					((char_u)(generatedGa_data))[generatedGa_len++] = (byte)' ';
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)((char_u)(generatedGa_data) + generatedGa_len), (byte)(p));
				generatedGa_len += len;
			} 
			rettv.clear_tv();
			arg = ModernizedCProgram.skipwhite(arg);
		}
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (ret != 0 && generatedGa_data != ((Object)0)) {
			if (generatedCmdidx == CMD_index.CMD_echomsg || generatedCmdidx == CMD_index.CMD_echoerr/* Mark the already saved text as finishing the line, so that what
				     * follows is displayed on a new line when scrolling back at the
				     * more prompt. */) {
				ModernizedCProgram.msg_sb_eol();
			} 
			if (generatedCmdidx == CMD_index.CMD_echomsg) {
				ModernizedCProgram.msg_attr(generatedGa_data, ModernizedCProgram.echo_attr);
				ModernizedCProgram.out_flush();
			}  else if (generatedCmdidx == CMD_index.CMD_echoerr) {
				save_did_emsg = /* We don't want to abort following commands, restore did_emsg. */ModernizedCProgram.did_emsg;
				ModernizedCProgram.emsg(generatedGa_data);
				if (!force_abort) {
					ModernizedCProgram.did_emsg = save_did_emsg;
				} 
			}  else if (generatedCmdidx == CMD_index.CMD_execute) {
				ModernizedCProgram.do_cmdline((char_u)generatedGa_data, generatedGetline, generatedCookie, -1024 | -1024);
			} 
		} 
		ga.ga_clear();
		if (generatedSkip) {
			--emsg_skip;
		} 
		this.setNextcmd(ModernizedCProgram.check_nextcmd(arg/*
		 * Skip over the name of an option: "&option", "&g:option" or "&l:option".
		 * "arg" points to the "&" or '+' when called, to "option" when returning.
		 * Returns NULL when no option name found.  Otherwise pointer to the char
		 * after the option name.
		 */));
	}
	public void ex_py3() {
		char_u script = new char_u();
		Object[] generatedArg = this.getArg();
		script = eap.script_get(generatedArg);
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			if (p_pyx == 0) {
				p_pyx = 3;
			} 
			ModernizedCProgram.DoPyCommand(script == ((Object)0) ? (byte)generatedArg : (byte)script, (rangeinitializer)init_range_cmd, (runner)run_cmd, (Object)eap);
		} 
		ModernizedCProgram.vim_free(script);
	}
	/*
	 * ":py3file"
	 */
	public void ex_py3file() {
		byte[] buffer = new byte[2048];
		byte file;
		byte p;
		int i;
		if (p_pyx == 0) {
			p_pyx = 3/* Have to do it like this. PyRun_SimpleFile requires you to pass a
			     * stdio file pointer, but Vim and the Python DLL are compiled with
			     * different options under Windows, meaning that stdio pointers aren't
			     * compatible between the two. Yuk.
			     *
			     * construct: exec(compile(open('a_filename', 'rb').read(), 'a_filename', 'exec'))
			     *
			     * Using bytes so that Python can detect the source encoding as it normally
			     * does. The doc does not say "compile" accept bytes, though.
			     *
			     * We need to escape any backslashes or single quotes in the file name, so that
			     * Python won't mangle the file name.
			     */;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(buffer, "exec(compile(open('");
		p = buffer + /* size of "exec(compile(open('" */19;
		Object[] generatedArg = this.getArg();
		for (i = 0; i < 2; ++i) {
			file = (byte)generatedArg;
			while (file && p < buffer + (2048 - 3)) {
				if (file == (byte)'\\' || file == (byte)'\'') {
					p++ = (byte)'\\';
				} 
				p++ = file++;
			}
			if (file != /* If we didn't finish the file name, we hit a buffer overflow */(byte)'\0') {
				return /*Error: Unsupported expression*/;
			} 
			if (i == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(p, "','rb').read(),'");
				p += 16;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(p, "','exec'))");
					p += 10;
			} 
		}
		ModernizedCProgram.DoPyCommand(/* Execute the file */buffer, (rangeinitializer)init_range_cmd, (runner)run_cmd, (Object)eap);
	}
	public void ex_py3do() {
		if (p_pyx == 0) {
			p_pyx = 3;
		} 
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.DoPyCommand((byte)generatedArg, (rangeinitializer)init_range_cmd, (runner)run_do, (Object)eap/******************************************************
		 * 2. Python output stream: writes output via [e]msg().
		 */);
	}
	public void get_wincmd_addr_type(Object arg) {
		switch (arg) {
		case (byte)'n':
		case (byte)'}':
		case (byte)'q':
		case (byte)'f':
		case (byte)']':
		case 2:
		case (byte)'g':
		case (byte)'K':
		case 9:
		case (byte)'R':
		case (byte)'-':
		case 8:
		case (byte)'H':
		case (byte)'x':
		case (byte)'P':
		case (byte)'d':
		case (byte)'s':
		case (byte)'v':
		case (byte)'=':
		case 19:
		case 4:
				this.setAddr_type(.ADDR_OTHER);
				break;
		case 10:
		case 11:
		case (byte)'T':
		case (byte)'F':
		case (byte)'<':
		case 23:
		case (byte)'r':
		case (byte)'i':
		case (byte)'W':
		case (byte)'\015':
				this.setAddr_type(.ADDR_NONE);
				break;
		case 24:
				this.setAddr_type(.ADDR_WINDOWS);
				break;
		case 15:
		case 6:
		case (byte)'p':
		case (byte)'c':
		case (byte)'k':
		case 30:
		case 12:
		case 31:
		case (byte)'J':
		case 3:
		case 17:
		case (byte)'+':
		case (byte)'t':
		case (byte)'b':
		case (byte)'L':
		case 14:
		case 18:
		case (byte)'_':
		case 29:
		case (byte)'l':
		case 16:
		case (byte)'h':
		case 7:
		case 22:
		case 20:
		case 26:
		case (byte)'o':
		case (byte)'|':
		case (byte)'S':
		case (byte)'>':
		case (byte)'z':
		case (byte)'^':
				this.setAddr_type(.ADDR_BUFFERS);
				break;
		case (byte)'w':
		case (byte)'j':
		}
	}
	public void do_exmap(int isabbrev) {
		int mode;
		char_u cmdp = new char_u();
		Object[] generatedCmd = this.getCmd();
		cmdp = generatedCmd;
		int generatedForceit = this.getForceit();
		mode = ModernizedCProgram.get_map_mode(cmdp, generatedForceit || isabbrev);
		Object[] generatedArg = this.getArg();
		switch (ModernizedCProgram.do_map((cmdp == (byte)'n') ? 2 : (cmdp == (byte)'u'), generatedArg, mode, isabbrev)) {
		case 1:
				ModernizedCProgram.emsg(((byte)(e_invarg)));
				break;
		case 2:
				ModernizedCProgram.emsg((isabbrev ? ((byte)(e_noabbr)) : ((byte)(e_nomap))));
				break;
		}
	}
	public void ex_abbreviate() {
		// almost the same as mapping// almost the same as mappingeap.do_exmap(1/*
		 * ":map" and friends.
		 */);
	}
	public void ex_map() {
		Object[] generatedCmd = this.getCmd();
		// If we are sourcing .exrc or .vimrc in current directory we// print the mappings for security reasons.if (secure) {
			secure = 2;
			ModernizedCProgram.msg_outtrans(generatedCmd);
			ModernizedCProgram.msg_putchar((byte)'\n');
		} 
		eap.do_exmap(0/*
		 * ":unmap" and friends.
		 */);
	}
	public void ex_unmap() {
		eap.do_exmap(0/*
		 * ":mapclear" and friends.
		 */);
	}
	public void ex_mapclear() {
		Object[] generatedCmd = this.getCmd();
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.map_clear(generatedCmd, generatedArg, generatedForceit, 0/*
		 * ":abclear" and friends.
		 */);
	}
	public void ex_abclear() {
		Object[] generatedCmd = this.getCmd();
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.map_clear(generatedCmd, generatedArg, 1, 1);
	}
	public void ex_loadkeymap() {
		char_u line = new char_u();
		char_u p = new char_u();
		char_u s = new char_u();
		kmap_T kp = new kmap_T();
		char_u[] buf = new char_u();
		int i;
		char_u save_cpo = ModernizedCProgram.p_cpo;
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (!ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getsourceline)) {
			ModernizedCProgram.emsg(((byte)("E105: Using :loadkeymap not in a sourced file")));
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.keymap_unload();
		curbuf.setB_kmap_state(0);
		Object generatedB_kmap_ga = curbuf.getB_kmap_ga();
		generatedB_kmap_ga.ga_init2((int)/*Error: Unsupported expression*/, 20);
		ModernizedCProgram.p_cpo = (char_u)/* Set 'cpoptions' to "C" to avoid line continuation. */"C"/*
		     * Get each line of the sourced file, break at the end.
		     */;
		Object generatedFrom = kp.getFrom();
		Object generatedTo = kp.getTo();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			line = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(0, generatedCookie, 0, 1);
			if (line == ((Object)0)) {
				break;
			} 
			p = ModernizedCProgram.skipwhite(line);
			if (p != (byte)'"' && p != (byte)'\000' && generatedB_kmap_ga.ga_grow(1) == 1) {
				kp = (kmap_T)generatedB_kmap_ga.getGa_data() + generatedB_kmap_ga.getGa_len();
				s = ModernizedCProgram.skiptowhite(p);
				kp.setFrom(ModernizedCProgram.vim_strnsave(p, (int)(s - p)));
				p = ModernizedCProgram.skipwhite(s);
				s = ModernizedCProgram.skiptowhite(p);
				kp.setTo(ModernizedCProgram.vim_strnsave(p, (int)(s - p)));
				if (generatedFrom == ((Object)0) || generatedTo == ((Object)0) || /*Error: Function owner not recognized*/strlen((byte)(generatedFrom)) + /*Error: Function owner not recognized*/strlen((byte)(generatedTo)) >= 200 || generatedFrom == (byte)'\000' || generatedTo == (byte)'\000') {
					if (generatedTo != ((Object)0) && generatedTo == (byte)'\000') {
						ModernizedCProgram.emsg(((byte)("E791: Empty keymap entry")));
					} 
					ModernizedCProgram.vim_free(generatedFrom);
					ModernizedCProgram.vim_free(generatedTo);
				} else {
						++generatedB_kmap_ga.getGa_len();
				} 
			} 
			ModernizedCProgram.vim_free(line);
		}
		for (i = 0; i < generatedB_kmap_ga.getGa_len(); ++/*
		     * setup ":lnoremap" to map the keys
		     */i) {
			ModernizedCProgram.vim_snprintf((byte)buf, /*Error: sizeof expression not supported yet*/, "<buffer> %s %s", generatedFrom, generatedTo);
			(Object)ModernizedCProgram.do_map(2, buf, -1024, 0);
		}
		ModernizedCProgram.p_cpo = save_cpo;
		Object generatedB_kmap_state = curbuf.getB_kmap_state();
		generatedB_kmap_state |=  2;
		ModernizedCProgram.status_redraw_curbuf();
	}
	public void ex_viminfo() {
		char_u save_viminfo = new char_u();
		save_viminfo = p_viminfo;
		if (p_viminfo == (byte)'\000') {
			p_viminfo = (char_u)"'100";
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		if (generatedCmdidx == CMD_index.CMD_rviminfo) {
			if (ModernizedCProgram.read_viminfo(generatedArg, 1 | 2 | (generatedForceit ? 4 : 0)) == 0) {
				ModernizedCProgram.emsg(((byte)("E195: Cannot open viminfo file for reading")));
			} 
		} else {
				ModernizedCProgram.write_viminfo(generatedArg, generatedForceit);
		} 
		p_viminfo = save_viminfo// FEAT_VIMINFO;// FEAT_VIMINFO
	}
	public void ex_command() {
		char_u name = new char_u();
		char_u end = new char_u();
		char_u p = new char_u();
		long argt = 0;
		long def = -1;
		int flags = 0;
		int compl = 0;
		char_u compl_arg = ((Object)0);
		cmd_addr_T addr_type_arg = .ADDR_NONE;
		Object[] generatedArg = this.getArg();
		int has_attr = (generatedArg[0] == (byte)'-');
		int name_len;
		p = generatedArg;
		// Check for attributeswhile (p == (byte)'-') {
			++p;
			end = ModernizedCProgram.skiptowhite(p);
			if (ModernizedCProgram.uc_scan_attr(p, end - p, argt, def, flags, compl, compl_arg, addr_type_arg) == 0) {
				return /*Error: Unsupported expression*/;
			} 
			p = ModernizedCProgram.skipwhite(end);
		}
		// Get the name (if any) and skip to the following argument// Get the name (if any) and skip to the following argumentname = p;
		if ((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26))) {
			while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10))) {
				++p;
			}
		} 
		if (!ModernizedCProgram.ends_excmd(p) && !((p) == (byte)' ' || (p) == (byte)'\t')) {
			ModernizedCProgram.emsg(((byte)("E182: Invalid command name")));
			return /*Error: Unsupported expression*/;
		} 
		end = p;
		name_len = (int)(end - name)// If there is nothing after the name, and no attributes were specified,;// If there is nothing after the name, and no attributes were specified,
		// we are listing commands// we are listing commandsp = ModernizedCProgram.skipwhite(end);
		int generatedForceit = this.getForceit();
		if (!has_attr && ModernizedCProgram.ends_excmd(p)) {
			ModernizedCProgram.uc_list(name, end - name);
		}  else if (!((int)(name) - (byte)'A' < 26)) {
			ModernizedCProgram.emsg(((byte)("E183: User defined commands must start with an uppercase letter")));
			return /*Error: Unsupported expression*/;
		}  else if ((name_len == 1 && name == (byte)'X') || (name_len <= 4 && /*Error: Function owner not recognized*/strncmp((byte)(name), (byte)("Next"), (size_t)(name_len > 4 ? 4 : name_len)) == 0)) {
			ModernizedCProgram.emsg(((byte)("E841: Reserved name, cannot be used for user defined command")));
			return /*Error: Unsupported expression*/;
		} else {
				ModernizedCProgram.uc_add_command(name, end - name, p, argt, def, flags, compl, compl_arg, addr_type_arg, generatedForceit);
		} 
	}
	public void ex_comclear() {
		ModernizedCProgram.ucmds.uc_clear();
		growarray generatedB_ucmds = curbuf.getB_ucmds();
		if (curbuf != ((Object)0)) {
			generatedB_ucmds.uc_clear();
		} 
	}
	public void ex_delcommand() {
		int i = 0;
		ucmd_T cmd = ((Object)0);
		int cmp = -1;
		garray_T gap = new garray_T();
		growarray generatedB_ucmds = curbuf.getB_ucmds();
		gap = generatedB_ucmds;
		int generatedGa_len = gap.getGa_len();
		Object generatedGa_data = (gap).getGa_data();
		Object[] generatedArg = this.getArg();
		Object generatedUc_name = cmd.getUc_name();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			for (i = 0; i < generatedGa_len; ++i) {
				cmd = (((ucmd_T)(generatedGa_data))[i]);
				cmp = /*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)(generatedUc_name));
				if (cmp <= 0) {
					break;
				} 
			}
			if (gap == ModernizedCProgram.ucmds || cmp == 0) {
				break;
			} 
			gap = ModernizedCProgram.ucmds;
		}
		if (cmp != 0) {
			ModernizedCProgram.semsg(((byte)("E184: No such user-defined command: %s")), generatedArg);
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.vim_free(generatedUc_name);
		Object generatedUc_rep = cmd.getUc_rep();
		ModernizedCProgram.vim_free(generatedUc_rep);
		Object generatedUc_compl_arg = cmd.getUc_compl_arg();
		ModernizedCProgram.vim_free(generatedUc_compl_arg);
		--generatedGa_len;
		if (i < generatedGa_len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(cmd), (byte)(cmd + 1), (size_t)((generatedGa_len - i) * /*Error: Unsupported expression*//*
			 * Split and quote args for <f-args>.
			 */));
		} 
	}
	public void do_ucmd() {
		char_u buf = new char_u();
		char_u p = new char_u();
		char_u q = new char_u();
		char_u start = new char_u();
		char_u end = ((Object)0);
		char_u ksp = new char_u();
		size_t len = new size_t();
		size_t totlen = new size_t();
		size_t split_len = 0;
		char_u split_buf = ((Object)0);
		ucmd_T cmd = new ucmd_T();
		sctx_T save_current_sctx = current_sctx;
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedUseridx = this.getUseridx();
		growarray generatedB_ucmds = curbuf.getB_ucmds();
		Object generatedGa_data = (generatedB_ucmds).getGa_data();
		if (generatedCmdidx == CMD_index.CMD_USER) {
			cmd = (((ucmd_T)(ModernizedCProgram.ucmds.getGa_data()))[generatedUseridx]);
		} else {
				cmd = (((ucmd_T)(generatedGa_data))[generatedUseridx]);
		} 
		buf = ((Object)0);
		Object generatedUc_rep = cmd.getUc_rep();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			p = generatedUc_rep;
			q = buf;
			totlen = 0;
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				start = ModernizedCProgram.vim_strchr(p, (byte)'<');
				if (start != ((Object)0)) {
					end = ModernizedCProgram.vim_strchr(start + 1, (byte)'>');
				} 
				if (buf != ((Object)0)) {
					for (ksp = p; ksp != (byte)'\000' && ksp != (true); ++ksp) {
						;
					}
					if (ksp == (true) && (start == ((Object)0) || ksp < start || end == ((Object)0)) && ((ksp[1] == 254 && ksp[2] == ((byte)'X')))) {
						len = ksp - p;
						if (len > 0) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(q), (byte)(p), (size_t)(len));
							q += len;
						} 
						q++ = ksp[1] == 254 ? (true) : -1024;
						p = ksp + 3;
						continue;
					} 
				} 
				if (start == ((Object)0) || end == ((Object)0)) {
					break;
				} 
				++end;
				len = start - p;
				if (buf == ((Object)0)) {
					totlen += len;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(q), (byte)(p), (size_t)(len));
						q += len;
				} 
				len = ModernizedCProgram.uc_check_code(start, end - start, q, cmd, eap, split_buf, split_len);
				if (len == (size_t)-1) {
					p = start + 1;
					len = 1;
				} else {
						p = end;
				} 
				if (buf == ((Object)0)) {
					totlen += len;
				} else {
						q += len;
				} 
			}
			if (buf != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(q), (byte)(p));
				break;
			} 
			totlen += /*Error: Function owner not recognized*/strlen((byte)(p));
			buf = ModernizedCProgram.alloc(totlen + 1);
			if (buf == ((Object)0)) {
				ModernizedCProgram.vim_free(split_buf);
				return /*Error: Unsupported expression*/;
			} 
		}
		 generatedUc_script_ctx = cmd.getUc_script_ctx();
		Object generatedSc_sid = generatedUc_script_ctx.getSc_sid();
		current_sctx.setSc_sid(generatedSc_sid);
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		(Object)ModernizedCProgram.do_cmdline(buf, generatedGetline, generatedCookie, -1024 | -1024 | -1024);
		current_sctx = save_current_sctx;
		ModernizedCProgram.vim_free(buf);
		ModernizedCProgram.vim_free(split_buf);
	}
	public void gui_mch_find_dialog() {
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.gui.getIn_use()) {
			ModernizedCProgram.find_replace_dialog_create(generatedArg, 0);
		} 
		if (!ModernizedCProgram.gui.getIn_use()) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.find_replace_dialog_create(generatedArg, 0);
	}
	public void gui_mch_replace_dialog() {
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.gui.getIn_use()) {
			ModernizedCProgram.find_replace_dialog_create(generatedArg, 1/*
			 * Callback for actions of the find and replace dialogs
			 */);
		} 
		if (!ModernizedCProgram.gui.getIn_use()) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.find_replace_dialog_create(generatedArg, 1/*
		 * Synchronize all gui elements, which are dependant upon the
		 * main text font used. Those are in esp. the find/replace dialogs.
		 * If you don't understand why this should be needed, please try to
		 * search for "pi\xea\xb6\xe6" in iso8859-2.
		 */);
	}
	public void ex_helpfind() {
		ModernizedCProgram.do_cmdline_cmd((char_u)/* This will fail when menus are not loaded.  Well, it's only for
		     * backwards compatibility anyway. */"emenu ToolBar.FindHelp");
	}
	/* We just want to suppress the warnings. */
	/* http://bugzilla.gnome.org/show_bug.cgi?id=664587 */
	public void ex_profile() {
		char_u e = new char_u();
		int len;
		Object[] generatedArg = this.getArg();
		e = ModernizedCProgram.skiptowhite(generatedArg);
		len = (int)(e - generatedArg);
		e = ModernizedCProgram.skipwhite(e);
		if (len == 5 && /*Error: Function owner not recognized*/strncmp((byte)(generatedArg), (byte)("start"), (size_t)(true)) == 0 && e != (byte)'\000') {
			ModernizedCProgram.vim_free(ModernizedCProgram.profile_fname);
			ModernizedCProgram.profile_fname = ModernizedCProgram.expand_env_save_opt(e, 1);
			do_profiling = 1;
			ModernizedCProgram.profile_zero(ModernizedCProgram.prof_wait_time);
			ModernizedCProgram.set_vim_var_nr(36, -1024);
		}  else if (do_profiling == 0) {
			ModernizedCProgram.emsg(((byte)("E750: First use \":profile start {fname}\"")));
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("pause")) == 0) {
			if (do_profiling == 1) {
				ModernizedCProgram.profile_start(ModernizedCProgram.pause_time);
			} 
			do_profiling = 2;
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("continue")) == 0) {
			if (do_profiling == 2) {
				ModernizedCProgram.profile_end(ModernizedCProgram.pause_time);
				ModernizedCProgram.profile_add(ModernizedCProgram.prof_wait_time, ModernizedCProgram.pause_time);
			} 
			do_profiling = 1;
		} else {
				eap.ex_breakadd();
		} 
	}
	public void ex_loadview() {
		char_u fname = new char_u();
		Object[] generatedArg = this.getArg();
		fname = ModernizedCProgram.get_view_file(generatedArg);
		if (fname != ((Object)0)) {
			ModernizedCProgram.do_source(fname, 0, 0);
			ModernizedCProgram.vim_free(fname);
		} 
		/*
		 * Generate a script that can be used to restore the current editing session.
		 * Save the value of v:this_session before running :mksession in order to make
		 * automagic session save fully transparent.  Return TRUE on success.
		 */
	}
	// Build an ex command line to create a script that restores the current
	// session if executed.  Escape the filename to avoid nasty surprises.
	// Use a reasonable hardcoded set of 'sessionoptions' flags to avoid
	// unpredictable effects when the session is saved automatically.  Also,
	// we definitely need SSOP_GLOBALS to be able to restore v:this_session.
	// Don't use SSOP_BUFFERS to prevent the buffer list from becoming
	// enormously large if the GNOME session feature is used regularly.
	// Reopen the file and append a command to restore v:this_session,
	// as if this save never happened.	This is to avoid conflicts with
	// the user's own sessions.  FIXME: It's probably less hackish to add
	// a "stealth" flag to 'sessionoptions' -- gotta ask Bram.
	// FEAT_SESSION
	// use NL only in put_eol()
	public void ex_mkrc() {
		FILE fd = new FILE();
		int failed = 0;
		char_u fname = new char_u();
		int view_session = 0;
		// using 'viewdir'?int using_vdir = 0;
		char_u viewFile = ((Object)0);
		int flagp;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_mksession || generatedCmdidx == CMD_index.CMD_mkview) {
			view_session = 1;
		} 
		// Use the short file name until ":lcd" is used.  We also don't use the// short file name when 'acd' is set, that is checked later.// Use the short file name until ":lcd" is used.  We also don't use the// short file name when 'acd' is set, that is checked later.ModernizedCProgram.did_lcd = 0;
		Object[] generatedArg = this.getArg();
		// ":mkview" or ":mkview 9": generate file name with 'viewdir'if (generatedCmdidx == CMD_index.CMD_mkview && (generatedArg == (byte)'\000' || (ModernizedCProgram.vim_isdigit(generatedArg) && generatedArg[1] == (byte)'\000'))) {
			this.setForceit(1);
			fname = ModernizedCProgram.get_view_file(generatedArg);
			if (fname == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
			viewFile = fname;
			using_vdir = 1;
		}  else if (generatedArg != (byte)'\000') {
			fname = generatedArg;
		}  else if (generatedCmdidx == CMD_index.CMD_mkvimrc) {
			fname = (char_u)"_vimrc";
		}  else if (generatedCmdidx == CMD_index.CMD_mksession) {
			fname = (char_u)"Session.vim";
		} else {
				fname = (char_u)"_exrc";
		} 
		// since dialog already asked// When using 'viewdir' may have to create the directory.if (using_vdir && !ModernizedCProgram.mch_isdir(p_vdir)) {
			ModernizedCProgram.vim_mkdir_emsg(p_vdir, 755);
		} 
		int generatedForceit = this.getForceit();
		fd = ModernizedCProgram.open_exfile(fname, generatedForceit, "wb");
		if (fd != ((Object)0)) {
			if (generatedCmdidx == CMD_index.CMD_mkview) {
				flagp = vop_flags;
			} else {
					flagp = ssop_flags;
			} 
			if (view_session && (flagp & -1024)) {
				ModernizedCProgram.mksession_nl = 1;
			} 
			if (generatedCmdidx == CMD_index.CMD_mkvimrc) {
				(Object)fd.put_line("version 6.0");
			} 
			if (generatedCmdidx == CMD_index.CMD_mksession) {
				if (fd.put_line("let SessionLoad = 1") == 0) {
					failed = 1;
				} 
			} 
			if (generatedCmdidx != CMD_index.CMD_mkview) {
				if (ModernizedCProgram.p_cp) {
					(Object)fd.put_line("if !&cp | set cp | endif");
				} else {
						(Object)fd.put_line("if &cp | set nocp | endif");
				} 
			} 
			if (!view_session || (generatedCmdidx == CMD_index.CMD_mksession && (flagp & -1024))) {
				failed |=  (ModernizedCProgram.makemap(fd, ((Object)0)) == 0 || fd.makeset(2, 0) == 0);
			} 
			if (!failed && view_session) {
				if (fd.put_line("let s:so_save = &so | let s:siso_save = &siso | set so=0 siso=0") == 0) {
					failed = 1;
				} 
				if (generatedCmdidx == CMD_index.CMD_mksession) {
					char_u dirnow = new char_u();
					dirnow = ModernizedCProgram.alloc(1024);
					if (dirnow == ((Object)0)) {
						failed = 1;
					} else {
							if (ModernizedCProgram.mch_dirname(dirnow, 1024) == 0 || ModernizedCProgram.mch_chdir((byte)dirnow) != 0) {
								dirnow = (byte)'\000';
							} 
							if (dirnow != (byte)'\000' && (ssop_flags & -1024)) {
								if (ModernizedCProgram.vim_chdirfile(fname, ((Object)0)) == 1) {
									ModernizedCProgram.shorten_fnames(1);
								} 
							}  else if (dirnow != (byte)'\000' && (ssop_flags & -1024) && globaldir != ((Object)0)) {
								if (ModernizedCProgram.mch_chdir((byte)globaldir) == 0) {
									ModernizedCProgram.shorten_fnames(1);
								} 
							} 
							failed |=  (fd.makeopens(dirnow) == 0);
							if (dirnow != (byte)'\000' && ((ssop_flags & -1024) || ((ssop_flags & -1024) && globaldir != ((Object)0)))) {
								if (ModernizedCProgram.mch_chdir((byte)dirnow) != 0) {
									ModernizedCProgram.emsg(((byte)(e_prev_dir)));
								} 
								ModernizedCProgram.shorten_fnames(1);
							} 
							ModernizedCProgram.vim_free(dirnow);
					} 
				} else {
						failed |=  (ModernizedCProgram.put_view(fd, ModernizedCProgram.curwin, !using_vdir, flagp, -1) == 0);
				} 
				if (fd.put_line("let &so = s:so_save | let &siso = s:siso_save") == 0) {
					failed = 1;
				} 
				if (no_hlsearch && fd.put_line("nohlsearch") == 0) {
					failed = 1;
				} 
				if (fd.put_line("doautoall SessionLoadPost") == 0) {
					failed = 1;
				} 
				if (generatedCmdidx == CMD_index.CMD_mksession) {
					if (fd.put_line("unlet SessionLoad") == 0) {
						failed = 1;
					} 
				} 
			} 
			if (fd.put_line("\" vim: set ft=vim :") == 0) {
				failed = 1;
			} 
			failed |=  /*Error: Function owner not recognized*/fclose(fd);
			if (failed) {
				ModernizedCProgram.emsg(((byte)(e_write)));
			}  else if (generatedCmdidx == CMD_index.CMD_mksession) {
				char_u tbuf = new char_u();
				tbuf = ModernizedCProgram.alloc(1024);
				if (tbuf != ((Object)0)) {
					if (ModernizedCProgram.vim_FullName(fname, tbuf, 1024, 0) == 1) {
						ModernizedCProgram.set_vim_var_string(7, tbuf, -1);
					} 
					ModernizedCProgram.vim_free(tbuf);
				} 
			} 
			ModernizedCProgram.mksession_nl = 0;
		} 
		ModernizedCProgram.vim_free(viewFile);
	}
	/*
	 * ":[N]match {group} {pattern}"
	 * Sets nextcmd to the start of the next command, if any.  Also called when
	 * skipping commands to find the next command.
	 */
	public void ex_match() {
		char_u p = new char_u();
		char_u g = ((Object)0);
		char_u end = new char_u();
		int c;
		int id;
		Object generatedLine2 = this.getLine2();
		if (generatedLine2 <= 3) {
			id = generatedLine2;
		} else {
				ModernizedCProgram.emsg(((byte)(e_invcmd)));
				return /*Error: Unsupported expression*/;
		} 
		int generatedSkip = this.getSkip();
		// First clear any old pattern.if (!generatedSkip) {
			ModernizedCProgram.curwin.match_delete(id, 0);
		} 
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.ends_excmd(generatedArg)) {
			end = generatedArg;
		}  else if ((ModernizedCProgram.vim_strnicmp((byte)(generatedArg), (byte)("none"), (size_t)(true)) == 0 && (((generatedArg[4]) == (byte)' ' || (generatedArg[4]) == (byte)'\t') || ModernizedCProgram.ends_excmd(generatedArg[4])))) {
			end = generatedArg + 4;
		} else {
				p = ModernizedCProgram.skiptowhite(generatedArg);
				if (!generatedSkip) {
					g = ModernizedCProgram.vim_strnsave(generatedArg, (int)(p - generatedArg));
				} 
				p = ModernizedCProgram.skipwhite(p);
				if (p == (byte)'\000') {
					ModernizedCProgram.vim_free(g);
					ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
					return /*Error: Unsupported expression*/;
				} 
				end = ModernizedCProgram.skip_regexp(p + 1, p, 1, ((Object)0));
				if (!generatedSkip) {
					if (end != (byte)'\000' && !ModernizedCProgram.ends_excmd(ModernizedCProgram.skipwhite(end + 1))) {
						ModernizedCProgram.vim_free(g);
						this.setErrmsg(e_trailing);
						return /*Error: Unsupported expression*/;
					} 
					if (end != p) {
						ModernizedCProgram.vim_free(g);
						ModernizedCProgram.semsg(((byte)(e_invarg2)), p);
						return /*Error: Unsupported expression*/;
					} 
					c = end;
					end = (byte)'\000';
					ModernizedCProgram.match_add(ModernizedCProgram.curwin, g, p + 1, 10, id, ((Object)0), ((Object)0));
					ModernizedCProgram.vim_free(g);
					end = c;
				} 
		} 
		this.setNextcmd(ModernizedCProgram.find_nextcmd(end));
	}
	// The names of packages that once were loaded are remembered.
	public void ex_runtime() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u p = ModernizedCProgram.skiptowhite(arg);
		int len = (int)(p - arg);
		int generatedForceit = this.getForceit();
		int flags = generatedForceit ? -1024 : 0;
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("START"), (size_t)(len)) == 0) {
			flags += -1024 + -1024;
			arg = ModernizedCProgram.skipwhite(arg + len);
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("OPT"), (size_t)(len)) == 0) {
			flags += -1024 + -1024;
			arg = ModernizedCProgram.skipwhite(arg + len);
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("PACK"), (size_t)(len)) == 0) {
			flags += -1024 + -1024 + -1024;
			arg = ModernizedCProgram.skipwhite(arg + len);
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("ALL"), (size_t)(len)) == 0) {
			flags += -1024 + -1024;
			arg = ModernizedCProgram.skipwhite(arg + len);
		} 
		ModernizedCProgram.source_runtime(arg, flags);
	}
	public void ex_packloadall() {
		int generatedForceit = this.getForceit();
		if (!did_source_packages || generatedForceit) {
			ModernizedCProgram.add_pack_start_dirs();
			ModernizedCProgram.load_start_packages();
		} 
		// First do a round to add all directories to 'runtimepath', then load
	}
	public void ex_packadd() {
		byte plugpat = "pack/*/%s/%s";
		int len;
		byte pat;
		int round;
		int res = 1;
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		// Round 1: use "start", round 2: use "opt".for (round = 1; round <= 2; ++round) {
			if (round == 1 && did_source_packages) {
				continue;
			} 
			len = (int)/*Error: Function owner not recognized*/strlen((byte)(plugpat)) + (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)) + 5;
			pat = ModernizedCProgram.alloc(len);
			if (pat == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
			ModernizedCProgram.vim_snprintf(pat, len, plugpat, round == 1 ? "start" : "opt", generatedArg);
			res = ModernizedCProgram.do_in_path(ModernizedCProgram.p_pp, (char_u)pat, -1024 + -1024 + (round == 2 && res == 0 ? -1024 : 0), add_pack_plugin, generatedForceit ? ModernizedCProgram.APP_ADD_DIR : ModernizedCProgram.APP_BOTH);
			ModernizedCProgram.vim_free(pat/*
			 * Sort "gap" and remove duplicate entries.  "gap" is expected to contain a
			 * list of file names in allocated memory.
			 */);
		}
	}
	public void cmd_source(Object fname) {
		int generatedForceit = this.getForceit();
		Object generatedNextcmd = this.getNextcmd();
		Object generatedCstack = this.getCstack();
		if (fname == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_argreq)));
		}  else if (eap != ((Object)0) && generatedForceit) {
			ModernizedCProgram.openscript(fname, global_busy || listcmd_busy || generatedNextcmd != ((Object)0) || generatedCstack.getCs_idx() >= 0);
		}  else if (ModernizedCProgram.do_source(fname, 0, 0) == 0) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), fname/*
			 * ":source {fname}"
			 */);
		} 
	}
	public void ex_source() {
		Object[] generatedArg = this.getArg();
		eap/*
		 * ":options"
		 */.cmd_source(generatedArg);
	}
	public void ex_options() {
		ModernizedCProgram.vim_setenv((char_u)"OPTWIN_CMD", (char_u)(ModernizedCProgram.cmdmod.getTab() ? "tab" : (ModernizedCProgram.cmdmod.getSplit() & 2) ? "vert" : ""));
		((Object)0/*
		 * ":source" and associated commands.
		 */).cmd_source((char_u)"$VIMRUNTIME/optwin.vim");
	}
	/*
	 * ":scriptnames"
	 */
	public void ex_scriptnames() {
		int i;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		int generatedGa_len = script_items.getGa_len();
		Object generatedGa_data = script_items.getGa_data();
		if (generatedAddr_count > 0) {
			if (generatedLine2 < 1 || generatedLine2 > generatedGa_len) {
				ModernizedCProgram.emsg(((byte)(e_invarg)));
			} else {
					this.setArg((((scriptitem_T)generatedGa_data)[(generatedLine2) - 1]).getSn_name());
					ModernizedCProgram.do_exedit(eap, ((Object)0));
			} 
			return /*Error: Unsupported expression*/;
		} 
		for (i = 1; i <= generatedGa_len && !got_int; ++i) {
			if ((((scriptitem_T)generatedGa_data)[(i) - 1]).getSn_name() != ((Object)0)) {
				((Object)0).home_replace((((scriptitem_T)generatedGa_data)[(i) - 1]).getSn_name(), ModernizedCProgram.NameBuff, 1024, 1);
				ModernizedCProgram.smsg("%3d: %s", i, ModernizedCProgram.NameBuff);
			} 
		}
	}
	public void ex_scriptencoding() {
		source_cookie sp = new source_cookie();
		char_u name = new char_u();
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (!ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getsourceline)) {
			ModernizedCProgram.emsg(((byte)("E167: :scriptencoding used outside of a sourced file")));
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		if (generatedArg != (byte)'\000') {
			name = ModernizedCProgram.enc_canonize(generatedArg);
			if (name == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
		} else {
				name = generatedArg;
		} 
		// Setup for conversion from the specified encoding to 'encoding'.// Setup for conversion from the specified encoding to 'encoding'.sp = (source_cookie)ModernizedCProgram.getline_cookie(generatedGetline, generatedCookie);
		 generatedConv = sp.getConv();
		generatedConv.convert_setup(name, ModernizedCProgram.p_enc);
		if (name != generatedArg) {
			ModernizedCProgram.vim_free(name/*
			 * ":scriptversion": Set Vim script version for a sourced script.
			 */);
		} 
	}
	public void ex_scriptversion() {
		int nr;
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (!ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getsourceline)) {
			ModernizedCProgram.emsg(((byte)("E984: :scriptversion used outside of a sourced file")));
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		nr = ModernizedCProgram.getdigits(generatedArg);
		if (nr == 0 || generatedArg != (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
		}  else if (nr > 4) {
			ModernizedCProgram.semsg(((byte)("E999: scriptversion not supported: %d")), nr);
		} else {
				current_sctx.setSc_version(nr);
		} 
	}
	/*
	 * ":finish": Mark a sourced file as finished.
	 */
	public void ex_finish() {
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getsourceline)) {
			eap.do_finish(0);
		} else {
				ModernizedCProgram.emsg(((byte)("E168: :finish used outside of a sourced file"/*
				 * Mark a sourced file as finished.  Possibly makes the ":finish" pending.
				 * Also called for a pending finish at the ":endtry" or after returning from
				 * an extra do_cmdline().  "reanimate" is used in the latter case.
				 */)));
		} 
	}
	public void do_finish(int reanimate) {
		int idx;
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (reanimate) {
			((source_cookie)ModernizedCProgram.getline_cookie(generatedGetline, generatedCookie)).setFinished(0);
		} 
		Object generatedCstack = this.getCstack();
		// In this case, make the ":finish" pending for execution at the ":endtry".// Otherwise, finish normally.// In this case, make the ":finish" pending for execution at the ":endtry".// Otherwise, finish normally.idx = generatedCstack.cleanup_conditionals(0, 1);
		if (idx >= 0) {
			generatedCstack.getCs_pending()[idx] = 32;
			ModernizedCProgram.report_make_pending(32, ((Object)0));
		} else {
				((source_cookie)ModernizedCProgram.getline_cookie(generatedGetline, generatedCookie)).setFinished(1/*
				 * Return TRUE when a sourced file had the ":finish" command: Don't give error
				 * message for missing ":endif".
				 * Return FALSE when not sourcing a file.
				 */);
		} 
	}
	public void ex_spellrepall() {
		pos_T pos = ModernizedCProgram.curwin.getW_cursor();
		char_u frompat = new char_u();
		int addlen;
		char_u line = new char_u();
		char_u p = new char_u();
		int save_ws = ModernizedCProgram.p_ws;
		linenr_T prev_lnum = 0;
		if (repl_from == ((Object)0) || repl_to == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E752: No previous spell replacement")));
			return /*Error: Unsupported expression*/;
		} 
		addlen = (int)(/*Error: Function owner not recognized*/strlen((byte)(repl_to)) - /*Error: Function owner not recognized*/strlen((byte)(repl_from)));
		frompat = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(repl_from)) + 7);
		if (frompat == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)frompat, "\\V\\<%s\\>", repl_from);
		ModernizedCProgram.p_ws = 0;
		ModernizedCProgram.sub_nsubs = 0;
		ModernizedCProgram.sub_nlines = 0;
		ModernizedCProgram.curwin.getW_cursor().setLnum(0);
		while (!got_int) {
			if (ModernizedCProgram.do_search(((Object)0), (byte)'/', frompat, -1024, -1024, ((Object)0)) == 0 || ModernizedCProgram.u_save_cursor() == 0) {
				break;
			} 
			line = ModernizedCProgram.ml_get_curline();
			if (addlen <= 0 || /*Error: Function owner not recognized*/strncmp((byte)(line + ModernizedCProgram.curwin.getW_cursor().getCol()), (byte)(repl_to), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(repl_to)))) != 0) {
				p = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(line)) + addlen + 1);
				if (p == ((Object)0)) {
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(p), (byte)(line), (size_t)(ModernizedCProgram.curwin.getW_cursor().getCol()));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(p + ModernizedCProgram.curwin.getW_cursor().getCol()), (byte)(repl_to));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(p), (byte)(line + ModernizedCProgram.curwin.getW_cursor().getCol() + /*Error: Function owner not recognized*/strlen((byte)(repl_from))));
				ModernizedCProgram.ml_replace(ModernizedCProgram.curwin.getW_cursor().getLnum(), p, 0);
				ModernizedCProgram.changed_bytes(ModernizedCProgram.curwin.getW_cursor().getLnum(), ModernizedCProgram.curwin.getW_cursor().getCol());
				if (ModernizedCProgram.curwin.getW_cursor().getLnum() != prev_lnum) {
					++ModernizedCProgram.sub_nlines;
					prev_lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
				} 
				++ModernizedCProgram.sub_nsubs;
			} 
			ModernizedCProgram.curwin.getW_cursor().getCol() += (colnr_T)/*Error: Function owner not recognized*/strlen((byte)(repl_to));
		}
		ModernizedCProgram.p_ws = save_ws;
		ModernizedCProgram.curwin.setW_cursor(pos);
		ModernizedCProgram.vim_free(frompat);
		if (ModernizedCProgram.sub_nsubs == 0) {
			ModernizedCProgram.semsg(((byte)("E753: Not found: %s")), repl_from);
		} else {
				ModernizedCProgram.do_sub_msg(0/*
				 * Make a copy of "word", with the first letter upper or lower cased, to
				 * "wcopy[MAXWLEN]".  "word" must not be empty.
				 * The result is NUL terminated.
				 */);
		} 
	}
	public void ex_spellinfo() {
		int lpi;
		langp_T lp = new langp_T();
		char_u p = new char_u();
		if (ModernizedCProgram.curwin.no_spell_checking()) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.msg_start();
		slang_S generatedLp_slang = lp.getLp_slang();
		Object generatedSl_fname = generatedLp_slang.getSl_fname();
		Object generatedSl_info = generatedLp_slang.getSl_info();
		for (lpi = 0; lpi < ModernizedCProgram.curwin.getW_s().getB_langp().getGa_len() && !got_int; ++lpi) {
			lp = (((langp_T)(ModernizedCProgram.curwin.getW_s().getB_langp()).getGa_data()) + (lpi));
			ModernizedCProgram.msg_puts("file: ");
			ModernizedCProgram.msg_puts((byte)generatedSl_fname);
			ModernizedCProgram.msg_putchar((byte)'\n');
			p = generatedSl_info;
			if (p != ((Object)0)) {
				ModernizedCProgram.msg_puts((byte)p);
				ModernizedCProgram.msg_putchar((byte)'\n');
			} 
		}
		ModernizedCProgram.msg_end()/* pattern starts with capital */;/* pattern starts with capital */
	}
	/* pattern is all capitals */
	/*
	 * ":spelldump"
	 */
	public void ex_spelldump() {
		char_u spl = new char_u();
		long dummy;
		if (ModernizedCProgram.curwin.no_spell_checking()) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.get_option_value((char_u)"spl", dummy, spl, 4);
		ModernizedCProgram.do_cmdline_cmd((char_u)/* Create a new empty buffer in a new window. */"new");
		ModernizedCProgram.set_option_value((char_u)"spell", 1, (char_u)"", /* enable spelling locally in the new window */4);
		ModernizedCProgram.set_option_value((char_u)"spl", dummy, spl, 4);
		ModernizedCProgram.vim_free(spl);
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (!(generatedMl_line_count == 1 && ModernizedCProgram.ml_get((linenr_T)1) == (byte)'\000')) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		ModernizedCProgram.spell_dump_compl(((Object)0), 0, ((Object)0), generatedForceit ? 2 : 0);
		if (generatedMl_line_count > /* Delete the empty line that we started with. */1) {
			ModernizedCProgram.ml_delete(generatedMl_line_count, 0);
		} 
		ModernizedCProgram.redraw_later(40/*
		 * Go through all possible words and:
		 * 1. When "pat" is NULL: dump a list of all words in the current buffer.
		 *	"ic" and "dir" are not used.
		 * 2. When "pat" is not NULL: add matching words to insert mode completion.
		 */);
	}
	public void ex_undolist() {
		garray_T ga = new garray_T();
		u_header_T uhp = new u_header_T();
		int mark;
		int nomark;
		int changes = 1;
		int i;
		/*
		     * 1: walk the tree to find all leafs, put the info in "ga".
		     * 2: sort the lines
		     * 3: display the list
		     */
		mark = ++ModernizedCProgram.lastmark;
		nomark = ++ModernizedCProgram.lastmark;
		ga.ga_init2((int)/*Error: Unsupported expression*/, 20);
		u_header generatedB_u_oldhead = curbuf.getB_u_oldhead();
		uhp = generatedB_u_oldhead;
		 generatedUh_prev = uhp.getUh_prev();
		Object generatedPtr = generatedUh_prev.getPtr();
		int generatedUh_walk = uhp.getUh_walk();
		long generatedUh_seq = uhp.getUh_seq();
		Object generatedUh_time = uhp.getUh_time();
		long generatedUh_save_nr = uhp.getUh_save_nr();
		Object generatedGa_data = ga.getGa_data();
		int generatedGa_len = ga.getGa_len();
		while (uhp != ((Object)0)) {
			if (generatedPtr == ((Object)0) && generatedUh_walk != nomark && generatedUh_walk != mark) {
				if (ga.ga_grow(1) == 0) {
					break;
				} 
				ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%6ld %7d  ", generatedUh_seq, changes);
				ModernizedCProgram.u_add_time(ModernizedCProgram.IObuff + /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), (1024 + 1) - /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), generatedUh_time);
				if (generatedUh_save_nr > 0) {
					while (/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)) < 33) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(" "));
					}
					ModernizedCProgram.vim_snprintf_add((byte)ModernizedCProgram.IObuff, (1024 + 1), "  %3ld", generatedUh_save_nr);
				} 
				((char_u)(generatedGa_data))[generatedGa_len++] = ModernizedCProgram.vim_strsave(ModernizedCProgram.IObuff);
			} 
			uhp.setUh_walk(mark);
			if (generatedPtr != ((Object)0) && generatedUh_walk != /* go down in the tree if we haven't been there */nomark && generatedUh_walk != mark) {
				uhp = generatedPtr;
				++changes;
			}  else if (generatedPtr != ((Object)/* go to alternate branch if we haven't been there */0) && generatedUh_walk != nomark && generatedUh_walk != mark) {
				uhp = generatedPtr;
			}  else if (generatedPtr != ((Object)0) && generatedPtr == ((Object)/* go up in the tree if we haven't been there and we are at the
				 * start of alternate branches */0) && generatedUh_walk != nomark && generatedUh_walk != mark) {
				uhp = generatedPtr;
				--changes;
			} else {
					uhp.setUh_walk(/* need to backtrack; mark this node as done */nomark);
					if (generatedPtr != ((Object)0)) {
						uhp = generatedPtr;
					} else {
							uhp = generatedPtr;
							--changes;
					} 
			} 
		}
		if (generatedGa_len == 0) {
			ModernizedCProgram.msg(((byte)("Nothing to undo")));
		} else {
				ModernizedCProgram.sort_strings((char_u)generatedGa_data, generatedGa_len);
				ModernizedCProgram.msg_start();
				ModernizedCProgram.msg_puts_attr(((byte)("number changes  when               saved")), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
				for (i = 0; i < generatedGa_len && !got_int; ++i) {
					ModernizedCProgram.msg_putchar((byte)'\n');
					if (got_int) {
						break;
					} 
					ModernizedCProgram.msg_puts(((byte)generatedGa_data)[i]);
				}
				ModernizedCProgram.msg_end();
				ga/*
				 * Put the timestamp of an undo header in "buf[buflen]" in a nice format.
				 */.ga_clear_strings();
		} 
	}
	public void ex_undojoin() {
		u_header generatedB_u_newhead = curbuf.getB_u_newhead();
		if (generatedB_u_newhead == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		u_header generatedB_u_curhead = curbuf.getB_u_curhead();
		if (generatedB_u_curhead != ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E790: undojoin is not allowed after undo")));
			return /*Error: Unsupported expression*/;
		} 
		int generatedB_u_synced = curbuf.getB_u_synced();
		if (!generatedB_u_synced) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.get_undolevel() < 0) {
			return /*Error: Unsupported expression*/;
		} else {
				curbuf.setB_u_synced(/* Append next change to the last entry */0/*
				 * Called after writing or reloading the file and setting b_changed to FALSE.
				 * Now an undo means that the buffer is modified.
				 */);
		} 
	}
	public void ex_ruby() {
		int state;
		byte script = ((Object)0);
		Object[] generatedArg = this.getArg();
		script = (byte)eap.script_get(generatedArg);
		int generatedSkip = this.getSkip();
		if (!generatedSkip && ModernizedCProgram.ensure_ruby_initialized()) {
			if (script == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_eval_string_protect((byte)generatedArg, state);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_eval_string_protect(script, state);
			} 
			if (state) {
				ModernizedCProgram.error_print(state);
			} 
		} 
		ModernizedCProgram.vim_free(script/*
		 *  In Ruby 1.9 or later, ruby String object has encoding.
		 *  conversion buffer string of vim to ruby String object using
		 *  VIM encoding option.
		 */);
	}
	public void ex_rubydo() {
		int state;
		linenr_T i = new linenr_T();
		buf_T was_curbuf = curbuf;
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.ensure_ruby_initialized()) {
			if (ModernizedCProgram.u_save(generatedLine1 - 1, generatedLine2 + 1) != 1) {
				return /*Error: Unsupported expression*/;
			} 
			for (i = generatedLine1; i <= generatedLine2; i++) {
				 line = new ();
				if (i > generatedMl_line_count) {
					break;
				} 
				ModernizedCProgram.line = ModernizedCProgram.vim_str2rb_enc_str((byte)ModernizedCProgram.ml_get(i));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_lastline_set(ModernizedCProgram.line);
				ModernizedCProgram.eval_enc_string_protect((byte)generatedArg, state);
				if (state) {
					ModernizedCProgram.error_print(state);
					break;
				} 
				if (was_curbuf != curbuf) {
					break;
				} 
				ModernizedCProgram.line = /*Error: Function owner not recognized*/rb_lastline_get();
				if (!/*Error: Function owner not recognized*/NIL_P(ModernizedCProgram.line)) {
					if (/*Error: Function owner not recognized*/TYPE(ModernizedCProgram.line) != T_STRING) {
						ModernizedCProgram.emsg(((byte)("E265: $_ must be an instance of String")));
						return /*Error: Unsupported expression*/;
					} 
					ModernizedCProgram.ml_replace(i, (char_u)/*Error: Function owner not recognized*/STR2CSTR(ModernizedCProgram.line), 1);
					ModernizedCProgram.changed();
				} 
			}
			ModernizedCProgram.check_cursor();
			ModernizedCProgram.update_curbuf(40);
		} 
	}
	public void ex_rubyfile() {
		int state;
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.ensure_ruby_initialized()) {
			 file_to_load = /*Error: Function owner not recognized*/rb_str_new2((byte)generatedArg);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rb_protect(rb_load_wrap, file_to_load, state);
			if (state) {
				ModernizedCProgram.error_print(state);
			} 
		} 
	}
	/*
	 * ":doautoall": execute autocommands for each loaded buffer.
	 */
	public void ex_doautoall() {
		int retval;
		aco_save_T aco = new aco_save_T();
		buf_T buf = new buf_T();
		bufref_T bufref = new bufref_T();
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int call_do_modelines = ModernizedCProgram.check_nomodeline(arg);
		int did_aucmd;
		/*
		     * This is a bit tricky: For some commands curwin->w_buffer needs to be
		     * equal to curbuf, but for some buffers there may not be a window.
		     * So we change the buffer for the current window for a moment.  This
		     * gives problems when the autocommands make changes to the list of
		     * buffers or windows...
		     */
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_next = buf.getB_next();
		for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
			if (generatedMl_mfp != ((Object)0)) {
				ModernizedCProgram.aucmd_prepbuf(aco, buf);
				ModernizedCProgram.set_bufref(bufref, buf);
				retval = ModernizedCProgram.do_doautocmd(arg, 0, did_aucmd);
				if (call_do_modelines && did_aucmd) {
					ModernizedCProgram.do_modelines(ModernizedCProgram.curwin == ModernizedCProgram.aucmd_win ? 32 : 0);
				} 
				aco.aucmd_restbuf();
				if (retval == 0 || !bufref.bufref_valid()) {
					break;
				} 
			} 
		}
		// just in case lines got deleted// just in case lines got deletedModernizedCProgram.check_cursor();
	}
	public void ex_mkspell() {
		int fcount;
		char_u fnames = new char_u();
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int ascii = 0;
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("-ascii"), (size_t)(true)) == 0) {
			ascii = 1;
			arg = ModernizedCProgram.skipwhite(arg + 6);
		} 
		int generatedForceit = this.getForceit();
		if (ModernizedCProgram.get_arglist_exp(arg, fcount, fnames, 0) == /* Expand all the remaining arguments (e.g., $VIMRUNTIME). */1) {
			ModernizedCProgram.mkspell(fcount, fnames, ascii, generatedForceit, 0);
			ModernizedCProgram.FreeWild(fcount, fnames/*
			 * Create the .sug file.
			 * Uses the soundfold info in "spin".
			 * Writes the file with the name "wfname", with ".spl" changed to ".sug".
			 */);
		} 
	}
	public void ex_spell() {
		Object[] generatedArg = this.getArg();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedForceit = this.getForceit();
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.spell_add_word(generatedArg, (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)), generatedCmdidx == CMD_index.CMD_spellwrong ? 1 : generatedCmdidx == CMD_index.CMD_spellrare ? 2 : 0, generatedForceit ? 0 : (int)generatedLine2, generatedCmdidx == CMD_index.CMD_spellundo/*
		 * Add "word[len]" to 'spellfile' as a good, rare or bad word.
		 */);
	}
	public void syn_cmd_conceal(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u next = new char_u();
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		next = ModernizedCProgram.skiptowhite(arg);
		if (arg == (byte)'\000') {
			if (ModernizedCProgram.curwin.getW_s().getB_syn_conceal()) {
				ModernizedCProgram.msg(((byte)("syntax conceal on")));
			} else {
					ModernizedCProgram.msg(((byte)("syntax conceal off")));
			} 
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("on"), (size_t)(true)) == 0 && next - arg == 2) {
			ModernizedCProgram.curwin.getW_s().setB_syn_conceal(1);
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("off"), (size_t)(true)) == 0 && next - arg == 3) {
			ModernizedCProgram.curwin.getW_s().setB_syn_conceal(0);
		} else {
				ModernizedCProgram.semsg(((byte)("E390: Illegal argument: %s")), arg/*
				 * Handle ":syntax case" command.
				 */);
		} 
	}
	public void syn_cmd_case(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u next = new char_u();
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		next = ModernizedCProgram.skiptowhite(arg);
		if (arg == (byte)'\000') {
			if (ModernizedCProgram.curwin.getW_s().getB_syn_ic()) {
				ModernizedCProgram.msg(((byte)("syntax case ignore")));
			} else {
					ModernizedCProgram.msg(((byte)("syntax case match")));
			} 
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("match"), (size_t)(true)) == 0 && next - arg == 5) {
			ModernizedCProgram.curwin.getW_s().setB_syn_ic(0);
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("ignore"), (size_t)(true)) == 0 && next - arg == 6) {
			ModernizedCProgram.curwin.getW_s().setB_syn_ic(1);
		} else {
				ModernizedCProgram.semsg(((byte)("E390: Illegal argument: %s")), arg/*
				 * Handle ":syntax spell" command.
				 */);
		} 
	}
	public void syn_cmd_spell(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u next = new char_u();
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		next = ModernizedCProgram.skiptowhite(arg);
		if (arg == (byte)'\000') {
			if (ModernizedCProgram.curwin.getW_s().getB_syn_spell() == 1) {
				ModernizedCProgram.msg(((byte)("syntax spell toplevel")));
			}  else if (ModernizedCProgram.curwin.getW_s().getB_syn_spell() == 2) {
				ModernizedCProgram.msg(((byte)("syntax spell notoplevel")));
			} else {
					ModernizedCProgram.msg(((byte)("syntax spell default")));
			} 
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("toplevel"), (size_t)(true)) == 0 && next - arg == 8) {
			ModernizedCProgram.curwin.getW_s().setB_syn_spell(1);
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("notoplevel"), (size_t)(true)) == 0 && next - arg == 10) {
			ModernizedCProgram.curwin.getW_s().setB_syn_spell(2);
		}  else if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("default"), (size_t)(true)) == 0 && next - arg == 7) {
			ModernizedCProgram.curwin.getW_s().setB_syn_spell(0);
		} else {
				ModernizedCProgram.semsg(((byte)("E390: Illegal argument: %s")), arg);
				return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.curwin.redraw_win_later(/* assume spell checking changed, force a redraw */40/*
		 * Handle ":syntax iskeyword" command.
		 */);
	}
	public void syn_cmd_iskeyword(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u[] save_chartab = new char_u();
		char_u save_isk = new char_u();
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		arg = ModernizedCProgram.skipwhite(arg);
		Object generatedB_chartab = curbuf.getB_chartab();
		Object generatedB_p_isk = curbuf.getB_p_isk();
		if (arg == (byte)'\000') {
			ModernizedCProgram.msg_puts("\n");
			if (ModernizedCProgram.curwin.getW_s().getB_syn_isk() != empty_option) {
				ModernizedCProgram.msg_puts(((byte)("syntax iskeyword ")));
				ModernizedCProgram.msg_outtrans(ModernizedCProgram.curwin.getW_s().getB_syn_isk());
			} else {
					ModernizedCProgram.msg_outtrans((char_u)((byte)("syntax iskeyword not set")));
			} 
		} else {
				if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("clear"), (size_t)(true)) == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(ModernizedCProgram.curwin.getW_s().getB_syn_chartab()), (byte)(generatedB_chartab), (size_t)((size_t)32));
					ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_syn_isk());
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(save_chartab), (byte)(generatedB_chartab), (size_t)((size_t)32));
						save_isk = generatedB_p_isk;
						curbuf.setB_p_isk(ModernizedCProgram.vim_strsave(arg));
						curbuf.buf_init_chartab(0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(ModernizedCProgram.curwin.getW_s().getB_syn_chartab()), (byte)(generatedB_chartab), (size_t)((size_t)32));
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(generatedB_chartab), (byte)(save_chartab), (size_t)((size_t)32));
						ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_syn_isk());
						ModernizedCProgram.curwin.getW_s().setB_syn_isk(generatedB_p_isk);
						curbuf.setB_p_isk(save_isk);
				} 
		} 
		ModernizedCProgram.curwin.redraw_win_later(40/*
		 * Clear all syntax info for one buffer.
		 */);
	}
	public void syn_cmd_clear(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u arg_end = new char_u();
		int id;
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.curwin.getW_s().getB_syn_topgrp() != 0) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.ends_excmd(arg/*
			 * No argument: Clear all syntax items.
			 */)) {
			if (syncing) {
				ModernizedCProgram.syntax_sync_clear();
			} else {
					ModernizedCProgram.curwin.getW_s().syntax_clear();
					if (ModernizedCProgram.curwin.getW_s() == ModernizedCProgram.curwin.getW_buffer().getB_s()) {
						ModernizedCProgram.do_unlet((char_u)"b:current_syntax", 1);
					} 
					ModernizedCProgram.do_unlet((char_u)"w:current_syntax", 1);
			} 
		} else {
				while (!ModernizedCProgram.ends_excmd(/*
					 * Clear the group IDs that are in the argument.
					 */arg)) {
					arg_end = ModernizedCProgram.skiptowhite(arg);
					if (arg == (byte)'@') {
						id = ModernizedCProgram.syn_scl_namen2id(arg + 1, (int)(arg_end - arg - 1));
						if (id == 0) {
							ModernizedCProgram.semsg(((byte)("E391: No such syntax cluster: %s")), arg);
							break;
						} else {
								int scl_id = id - 23000;
								do {
									if ((((syn_cluster_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_clusters().getGa_data()))[scl_id].getScl_list()) != ((Object)0)) {
										ModernizedCProgram.vim_free(((syn_cluster_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_clusters().getGa_data()))[scl_id].getScl_list());
										(((syn_cluster_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_clusters().getGa_data()))[scl_id].getScl_list()) = ((Object)0);
									} 
								} while (0);
						} 
					} else {
							id = ModernizedCProgram.syn_namen2id(arg, (int)(arg_end - arg));
							if (id == 0) {
								ModernizedCProgram.semsg(((byte)(e_nogroup)), arg);
								break;
							} else {
									ModernizedCProgram.syn_clear_one(id, syncing);
							} 
					} 
					arg = ModernizedCProgram.skipwhite(arg_end);
				}
		} 
		ModernizedCProgram.redraw_curbuf_later(35);
		ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
	}
	public void syn_cmd_on(int syncing) {
		eap.syn_cmd_onoff("syntax"/*
		 * Handle ":syntax enable" command.
		 */);
	}
	public void syn_cmd_enable(int syncing) {
		ModernizedCProgram.set_internal_string_var((char_u)"syntax_cmd", (char_u)"enable");
		eap.syn_cmd_onoff("syntax");
		ModernizedCProgram.do_unlet((char_u)"g:syntax_cmd", 1/*
		 * Handle ":syntax reset" command.
		 * It actually resets highlighting, not syntax.
		 */);
	}
	public void syn_cmd_reset(int syncing) {
		Object[] generatedArg = this.getArg();
		this.setNextcmd(ModernizedCProgram.check_nextcmd(generatedArg));
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			ModernizedCProgram.set_internal_string_var((char_u)"syntax_cmd", (char_u)"reset");
			ModernizedCProgram.do_cmdline_cmd((char_u)"runtime! syntax/syncolor.vim");
			ModernizedCProgram.do_unlet((char_u)"g:syntax_cmd", 1/*
			 * Handle ":syntax manual" command.
			 */);
		} 
	}
	public void syn_cmd_manual(int syncing) {
		eap.syn_cmd_onoff("manual"/*
		 * Handle ":syntax off" command.
		 */);
	}
	public void syn_cmd_off(int syncing) {
		eap.syn_cmd_onoff("nosyntax");
	}
	public void syn_cmd_onoff(Byte name) {
		char_u[] buf = new char_u();
		Object[] generatedArg = this.getArg();
		this.setNextcmd(ModernizedCProgram.check_nextcmd(generatedArg));
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(buf), (byte)("so "));
			ModernizedCProgram.vim_snprintf((byte)buf + 3, /*Error: sizeof expression not supported yet*/ - 3, "$VIMRUNTIME\\syntax\\%s.vim", name);
			ModernizedCProgram.do_cmdline_cmd(buf/*
			 * Handle ":syntax [list]" command: list current syntax words.
			 */);
		} 
	}
	public void syn_cmd_list(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int id;
		char_u arg_end = new char_u();
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.curwin.syntax_present()) {
			ModernizedCProgram.msg(((byte)(ModernizedCProgram.msg_no_items)));
			return /*Error: Unsupported expression*/;
		} 
		if (syncing) {
			if (ModernizedCProgram.curwin.getW_s().getB_syn_sync_flags() & -1024) {
				ModernizedCProgram.msg_puts(((byte)("syncing on C-style comments")));
				ModernizedCProgram.syn_lines_msg();
				ModernizedCProgram.syn_match_msg();
				return /*Error: Unsupported expression*/;
			}  else if (!(ModernizedCProgram.curwin.getW_s().getB_syn_sync_flags() & -1024)) {
				if (ModernizedCProgram.curwin.getW_s().getB_syn_sync_minlines() == 0) {
					ModernizedCProgram.msg_puts(((byte)("no syncing")));
				} else {
						ModernizedCProgram.msg_puts(((byte)("syncing starts ")));
						ModernizedCProgram.msg_outnum(ModernizedCProgram.curwin.getW_s().getB_syn_sync_minlines());
						ModernizedCProgram.msg_puts(((byte)(" lines before top line")));
						ModernizedCProgram.syn_match_msg();
				} 
				return /*Error: Unsupported expression*/;
			} 
			ModernizedCProgram.msg_puts_title(((byte)("\n--- Syntax sync items ---")));
			if (ModernizedCProgram.curwin.getW_s().getB_syn_sync_minlines() > 0 || ModernizedCProgram.curwin.getW_s().getB_syn_sync_maxlines() > 0 || ModernizedCProgram.curwin.getW_s().getB_syn_sync_linebreaks() > 0) {
				ModernizedCProgram.msg_puts(((byte)("\nsyncing on items")));
				ModernizedCProgram.syn_lines_msg();
				ModernizedCProgram.syn_match_msg();
			} 
		} else {
				ModernizedCProgram.msg_puts_title(((byte)("\n--- Syntax items ---")));
		} 
		if (ModernizedCProgram.ends_excmd(arg/*
			 * No argument: List all group IDs and all syntax clusters.
			 */)) {
			for (id = 1; id <= ModernizedCProgram.highlight_num_groups() && !got_int; ++id) {
				ModernizedCProgram.syn_list_one(id, syncing, 0);
			}
			for (id = 0; id < ModernizedCProgram.curwin.getW_s().getB_syn_clusters().getGa_len() && !got_int; ++id) {
				ModernizedCProgram.syn_list_cluster(id);
			}
		} else {
				while (!ModernizedCProgram.ends_excmd(arg) && !/*
					 * List the group IDs and syntax clusters that are in the argument.
					 */got_int) {
					arg_end = ModernizedCProgram.skiptowhite(arg);
					if (arg == (byte)'@') {
						id = ModernizedCProgram.syn_scl_namen2id(arg + 1, (int)(arg_end - arg - 1));
						if (id == 0) {
							ModernizedCProgram.semsg(((byte)("E392: No such syntax cluster: %s")), arg);
						} else {
								ModernizedCProgram.syn_list_cluster(id - 23000);
						} 
					} else {
							id = ModernizedCProgram.syn_namen2id(arg, (int)(arg_end - arg));
							if (id == 0) {
								ModernizedCProgram.semsg(((byte)(e_nogroup)), arg);
							} else {
									ModernizedCProgram.syn_list_one(id, syncing, 1);
							} 
					} 
					arg = ModernizedCProgram.skipwhite(arg_end);
				}
		} 
		this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
	}
	/*
	 * Handle ":syntax include [@{group-name}] filename" command.
	 */
	public void syn_cmd_include(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int sgl_id = 1;
		char_u group_name_end = new char_u();
		char_u rest = new char_u();
		byte errormsg = ((Object)0);
		int prev_toplvl_grp;
		int prev_syn_inc_tag;
		int source = 0;
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		if (arg[0] == (byte)'@') {
			++arg;
			rest = ModernizedCProgram.get_group_name(arg, group_name_end);
			if (rest == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)("E397: Filename required")));
				return /*Error: Unsupported expression*/;
			} 
			sgl_id = ModernizedCProgram.syn_check_cluster(arg, (int)(group_name_end - arg));
			if (sgl_id == 0) {
				return /*Error: Unsupported expression*/;
			} 
			this.setArg(/* separate_nextcmd() and expand_filename() depend on this */rest/*
			     * Everything that's left, up to the next command, should be the
			     * filename to include.
			     */);
		} 
		long generatedArgt = this.getArgt();
		generatedArgt |=  (-1024 | -1024);
		eap.separate_nextcmd();
		if (generatedArg == (byte)'<' || generatedArg == (byte)'$' || ModernizedCProgram.mch_isFullName(generatedArg)) {
			source = 1;
			if (eap.expand_filename(ModernizedCProgram.syn_cmdlinep, errormsg) == 0) {
				if (errormsg != ((Object)0)) {
					ModernizedCProgram.emsg(errormsg);
				} 
				return /*Error: Unsupported expression*/;
			} 
		} 
		if (ModernizedCProgram.running_syn_inc_tag >= /*
		     * Save and restore the existing top-level grouplist id and ":syn
		     * include" tag around the actual inclusion.
		     */999) {
			ModernizedCProgram.emsg(((byte)("E847: Too many syntax includes")));
			return /*Error: Unsupported expression*/;
		} 
		prev_syn_inc_tag = ModernizedCProgram.current_syn_inc_tag;
		ModernizedCProgram.current_syn_inc_tag = ++ModernizedCProgram.running_syn_inc_tag;
		prev_toplvl_grp = ModernizedCProgram.curwin.getW_s().getB_syn_topgrp();
		ModernizedCProgram.curwin.getW_s().setB_syn_topgrp(sgl_id);
		if (source ? ModernizedCProgram.do_source(generatedArg, 0, 0) == 0 : ModernizedCProgram.source_runtime(generatedArg, -1024) == 0) {
			ModernizedCProgram.semsg(((byte)(e_notopen)), generatedArg);
		} 
		ModernizedCProgram.curwin.getW_s().setB_syn_topgrp(prev_toplvl_grp);
		ModernizedCProgram.current_syn_inc_tag = prev_syn_inc_tag/*
		 * Handle ":syntax keyword {group-name} [{option}] keyword .." command.
		 */;
	}
	public void syn_cmd_keyword(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u group_name_end = new char_u();
		int syn_id;
		char_u rest = new char_u();
		char_u keyword_copy = ((Object)0);
		char_u p = new char_u();
		char_u kw = new char_u();
		syn_opt_arg_T syn_opt_arg = new syn_opt_arg_T();
		int cnt;
		int conceal_char = (byte)'\000';
		rest = ModernizedCProgram.get_group_name(arg, group_name_end);
		int generatedSkip = this.getSkip();
		Object generatedFlags = syn_opt_arg.getFlags();
		Object generatedCont_in_list = syn_opt_arg.getCont_in_list();
		Object generatedNext_list = syn_opt_arg.getNext_list();
		if (rest != ((Object)0)) {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(rest));
		} else {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), arg);
		} 
		ModernizedCProgram.redraw_curbuf_later(35);
		ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
	}
	public void syn_cmd_match(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u group_name_end = new char_u();
		char_u rest = new char_u();
		/* the item found in the line */synpat_T item = new synpat_T();
		int syn_id;
		int idx;
		syn_opt_arg_T syn_opt_arg = new syn_opt_arg_T();
		int sync_idx = 0;
		int conceal_char = (byte)'\000';
		rest = ModernizedCProgram.get_group_name(arg, /* Isolate the group name, check for validity */group_name_end);
		syn_opt_arg.setFlags(/* Get options before the pattern */0);
		syn_opt_arg.setKeyword(0);
		syn_opt_arg.setSync_idx(syncing ? sync_idx : ((Object)0));
		syn_opt_arg.setHas_cont_list(1);
		syn_opt_arg.setCont_list(((Object)0));
		syn_opt_arg.setCont_in_list(((Object)0));
		syn_opt_arg.setNext_list(((Object)0));
		int generatedSkip = this.getSkip();
		rest = syn_opt_arg.get_syn_options(rest, conceal_char, generatedSkip);
		ModernizedCProgram.init_syn_patterns();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((item), (false), (/*Error: sizeof expression not supported yet*/));
		rest = item.get_syn_pattern(rest);
		Object generatedFlags = syn_opt_arg.getFlags();
		if (/*Error: Function owner not recognized*/vim_regcomp_had_eol() && !(generatedFlags & -1024)) {
			generatedFlags |=  -1024;
		} 
		rest = syn_opt_arg.get_syn_options(rest, conceal_char, generatedSkip);
		Object generatedCont_list = syn_opt_arg.getCont_list();
		Object generatedCont_in_list = syn_opt_arg.getCont_in_list();
		Object generatedNext_list = syn_opt_arg.getNext_list();
		if (rest != ((Object)/* all arguments are valid */0/*
			 * Check for trailing command and illegal trailing arguments.
			 */)) {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(rest));
			if (!ModernizedCProgram.ends_excmd(rest) || generatedSkip) {
				rest = ((Object)0);
			}  else if (ModernizedCProgram.curwin.getW_s().getB_syn_patterns().ga_grow(1) != 0 && (syn_id = ModernizedCProgram.syn_check_group(arg, (int)(group_name_end - arg))) != 0) {
				ModernizedCProgram.syn_incl_toplevel(syn_id, generatedFlags);
				idx = ModernizedCProgram.curwin.getW_s().getB_syn_patterns().getGa_len();
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx] = item;
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_syncing(syncing);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_type(1);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setId(syn_id);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setInc_tag(ModernizedCProgram.current_syn_inc_tag);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_flags(generatedFlags);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_sync_idx(sync_idx);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_cont_list(generatedCont_list);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setCont_in_list(generatedCont_in_list);
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_cchar(conceal_char);
				if (generatedCont_in_list != ((Object)0)) {
					ModernizedCProgram.curwin.getW_s().setB_syn_containedin(1);
				} 
				((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_next_list(generatedNext_list);
				++ModernizedCProgram.curwin.getW_s().getB_syn_patterns().getGa_len();
				if (generatedFlags & (-1024 | /* remember that we found a match for syncing on */-1024)) {
					ModernizedCProgram.curwin.getW_s().getB_syn_sync_flags() |=  -1024;
				} 
				if (generatedFlags & -1024) {
					++ModernizedCProgram.curwin.getW_s().getB_syn_folditems();
				} 
				ModernizedCProgram.redraw_curbuf_later(35);
				ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
				return /*Error: Unsupported expression*/;
			} 
		} 
		regprog generatedSp_prog = item.getSp_prog();
		generatedSp_prog.vim_regfree();
		Object generatedSp_pattern = item.getSp_pattern();
		ModernizedCProgram.vim_free(generatedSp_pattern);
		ModernizedCProgram.vim_free(generatedCont_list);
		ModernizedCProgram.vim_free(generatedCont_in_list);
		ModernizedCProgram.vim_free(generatedNext_list);
		if (rest == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), arg/*
			 * Handle ":syntax region {group-name} [matchgroup={group-name}]
			 *		start {start} .. [skip {skip}] end {end} .. [{options}]".
			 */);
		} 
	}
	public void syn_cmd_region(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u group_name_end = new char_u();
		/* next arg, NULL on error */char_u rest = new char_u();
		char_u key_end = new char_u();
		char_u key = ((Object)0);
		char_u p = new char_u();
		int item;
		Object pat_ptrs;
		pat_ptr ppp = new pat_ptr();
		pat_ptr ppp_next = new pat_ptr();
		int pat_count = /* nr of syn_patterns found */0;
		int syn_id;
		int matchgroup_id = 0;
		int not_enough = /* not enough arguments */0;
		int illegal = /* illegal arguments */0;
		int success = 0;
		int idx;
		syn_opt_arg_T syn_opt_arg = new syn_opt_arg_T();
		int conceal_char = (byte)'\000';
		rest = ModernizedCProgram.get_group_name(arg, /* Isolate the group name, check for validity */group_name_end);
		pat_ptrs[0] = ((Object)0);
		pat_ptrs[1] = ((Object)0);
		pat_ptrs[2] = ((Object)0);
		ModernizedCProgram.init_syn_patterns();
		syn_opt_arg.setFlags(0);
		syn_opt_arg.setKeyword(0);
		syn_opt_arg.setSync_idx(((Object)0));
		syn_opt_arg.setHas_cont_list(1);
		syn_opt_arg.setCont_list(((Object)0));
		syn_opt_arg.setCont_in_list(((Object)0));
		syn_opt_arg.setNext_list(((Object)0/*
		     * get the options, patterns and matchgroup.
		     */));
		int generatedSkip = this.getSkip();
		syn_pattern generatedPp_synp = ppp.getPp_synp();
		Object generatedFlags = syn_opt_arg.getFlags();
		int generatedSp_flags = generatedPp_synp.getSp_flags();
		while (rest != ((Object)0) && !ModernizedCProgram.ends_excmd(rest)) {
			rest = syn_opt_arg.get_syn_options(rest, conceal_char, generatedSkip);
			if (rest == ((Object)0) || ModernizedCProgram.ends_excmd(rest)) {
				break;
			} 
			key_end = /* must be a pattern or matchgroup then */rest;
			while (key_end && !((key_end) == (byte)' ' || (key_end) == (byte)'\t') && key_end != (byte)'=') {
				++key_end;
			}
			ModernizedCProgram.vim_free(key);
			key = ModernizedCProgram.vim_strnsave_up(rest, (int)(key_end - rest));
			if (key == ((Object)/* out of memory */0)) {
				rest = ((Object)0);
				break;
			} 
			if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("MATCHGROUP")) == 0) {
				item = 3;
			}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("START")) == 0) {
				item = 0;
			}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("END")) == 0) {
				item = 2;
			}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("SKIP")) == 0) {
				if (pat_ptrs[1] != ((Object)/* one skip pattern allowed */0)) {
					illegal = 1;
					break;
				} 
				item = 1;
			} else {
					break;
			} 
			rest = ModernizedCProgram.skipwhite(key_end);
			if (rest != (byte)'=') {
				rest = ((Object)0);
				ModernizedCProgram.semsg(((byte)("E398: Missing '=': %s")), arg);
				break;
			} 
			rest = ModernizedCProgram.skipwhite(rest + 1);
			if (rest == (byte)'\000') {
				not_enough = 1;
				break;
			} 
			if (item == 3) {
				p = ModernizedCProgram.skiptowhite(rest);
				if ((p - rest == 4 && /*Error: Function owner not recognized*/strncmp((byte)(rest), (byte)("NONE"), (size_t)(true)) == 0) || generatedSkip) {
					matchgroup_id = 0;
				} else {
						matchgroup_id = ModernizedCProgram.syn_check_group(rest, (int)(p - rest));
						if (matchgroup_id == 0) {
							illegal = 1;
							break;
						} 
				} 
				rest = ModernizedCProgram.skipwhite(p/*
					     * Allocate room for a syn_pattern, and link it in the list of
					     * syn_patterns for this item, at the start (because the list is
					     * used from end to start).
					     */);
			} else {
					ppp = (pat_ptr)ModernizedCProgram.alloc(/*Error: Unsupported expression*/);
					if (ppp == ((Object)0)) {
						rest = ((Object)0);
						break;
					} 
					ppp.setPp_next(pat_ptrs[item]);
					pat_ptrs[item] = ppp;
					ppp.setPp_synp((synpat_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/));
					if (generatedPp_synp == ((Object)0)) {
						rest = ((Object)0);
						break;
					} 
					if (item == /* Enable the appropriate \z specials. */0) {
						reg_do_extmatch = 1;
					}  else if (item == 1 || item == 2) {
						reg_do_extmatch = 2;
					} 
					rest = generatedPp_synp.get_syn_pattern(rest);
					reg_do_extmatch = 0;
					if (item == 2 && /*Error: Function owner not recognized*/vim_regcomp_had_eol() && !(generatedFlags & -1024)) {
						generatedSp_flags |=  -1024;
					} 
					ppp.setPp_matchgroup_id(matchgroup_id);
					++pat_count;
			} 
		}
		ModernizedCProgram.vim_free(key);
		if (illegal || not_enough) {
			rest = ((Object)0/*
			     * Must have a "start" and "end" pattern.
			     */);
		} 
		if (rest != ((Object)0) && (pat_ptrs[0] == ((Object)0) || pat_ptrs[2] == ((Object)0))) {
			not_enough = 1;
			rest = ((Object)0);
		} 
		int generatedPp_matchgroup_id = ppp.getPp_matchgroup_id();
		Object generatedCont_list = syn_opt_arg.getCont_list();
		Object generatedCont_in_list = syn_opt_arg.getCont_in_list();
		Object generatedNext_list = syn_opt_arg.getNext_list();
		pat_ptr generatedPp_next = ppp.getPp_next();
		if (rest != ((Object)0/*
			 * Check for trailing garbage or command.
			 * If OK, add the item.
			 */)) {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(rest));
			if (!ModernizedCProgram.ends_excmd(rest) || generatedSkip) {
				rest = ((Object)0);
			}  else if ((ModernizedCProgram.curwin.getW_s().getB_syn_patterns()).ga_grow(pat_count) != 0 && (syn_id = ModernizedCProgram.syn_check_group(arg, (int)(group_name_end - arg))) != 0) {
				ModernizedCProgram.syn_incl_toplevel(syn_id, generatedFlags);
				idx = ModernizedCProgram.curwin.getW_s().getB_syn_patterns().getGa_len();
				for (item = 0; item <= 2; ++item) {
					for (ppp = pat_ptrs[item]; ppp != ((Object)0); ppp = generatedPp_next) {
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx] = (generatedPp_synp);
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_syncing(syncing);
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_type((item == 0) ? 2 : (item == 1) ? 4 : 3);
						generatedSp_flags |=  generatedFlags;
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setId(syn_id);
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setInc_tag(ModernizedCProgram.current_syn_inc_tag);
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_syn_match_id(generatedPp_matchgroup_id);
						((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_cchar(conceal_char);
						if (item == 0) {
							((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_cont_list(generatedCont_list);
							((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].getSp_syn().setCont_in_list(generatedCont_in_list);
							if (generatedCont_in_list != ((Object)0)) {
								ModernizedCProgram.curwin.getW_s().setB_syn_containedin(1);
							} 
							((synpat_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_patterns().getGa_data()))[idx].setSp_next_list(generatedNext_list);
						} 
						++ModernizedCProgram.curwin.getW_s().getB_syn_patterns().getGa_len();
						++idx;
						if (generatedFlags & -1024) {
							++ModernizedCProgram.curwin.getW_s().getB_syn_folditems();
						} 
					}
				}
				ModernizedCProgram.redraw_curbuf_later(35);
				ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
				success = /* don't free the progs and patterns now */1;
			} 
		} 
		regprog generatedSp_prog = generatedPp_synp.getSp_prog();
		Object generatedSp_pattern = generatedPp_synp.getSp_pattern();
		for (item = 0; item <= 2; ++/*
		     * Free the allocated memory.
		     */item) {
			for (ppp = pat_ptrs[item]; ppp != ((Object)0); ppp = ppp_next) {
				if (!success && generatedPp_synp != ((Object)0)) {
					generatedSp_prog.vim_regfree();
					ModernizedCProgram.vim_free(generatedSp_pattern);
				} 
				ModernizedCProgram.vim_free(generatedPp_synp);
				ppp_next = generatedPp_next;
				ModernizedCProgram.vim_free(ppp);
			}
		}
		if (!success) {
			ModernizedCProgram.vim_free(generatedCont_list);
			ModernizedCProgram.vim_free(generatedCont_in_list);
			ModernizedCProgram.vim_free(generatedNext_list);
			if (not_enough) {
				ModernizedCProgram.semsg(((byte)("E399: Not enough arguments: syntax region %s")), arg);
			}  else if (illegal || rest == ((Object)0)) {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), arg/*
				 * A simple syntax group ID comparison function suitable for use in qsort()
				 */);
			} 
		} 
	}
	public void syn_cmd_cluster(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u group_name_end = new char_u();
		char_u rest = new char_u();
		int scl_id;
		int clstr_list;
		int got_clstr = 0;
		int opt_len;
		int list_op;
		this.setNextcmd(ModernizedCProgram.find_nextcmd(arg));
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			return /*Error: Unsupported expression*/;
		} 
		rest = ModernizedCProgram.get_group_name(arg, group_name_end);
		if (rest != ((Object)0)) {
			scl_id = ModernizedCProgram.syn_check_cluster(arg, (int)(group_name_end - arg));
			if (scl_id == 0) {
				return /*Error: Unsupported expression*/;
			} 
			scl_id -= 23000;
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				if (ModernizedCProgram.vim_strnicmp((byte)(rest), (byte)("add"), (size_t)(true)) == 0 && (((rest[3]) == (byte)' ' || (rest[3]) == (byte)'\t') || rest[3] == (byte)'=')) {
					opt_len = 3;
					list_op = 2;
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(rest), (byte)("remove"), (size_t)(true)) == 0 && (((rest[6]) == (byte)' ' || (rest[6]) == (byte)'\t') || rest[6] == (byte)'=')) {
					opt_len = 6;
					list_op = 3;
				}  else if (ModernizedCProgram.vim_strnicmp((byte)(rest), (byte)("contains"), (size_t)(true)) == 0 && (((rest[8]) == (byte)' ' || (rest[8]) == (byte)'\t') || rest[8] == (byte)'=')) {
					opt_len = 8;
					list_op = 1;
				} else {
						break;
				} 
				clstr_list = ((Object)0);
				if (ModernizedCProgram.get_id_list(rest, opt_len, clstr_list, generatedSkip) == 0) {
					ModernizedCProgram.semsg(((byte)(e_invarg2)), rest);
					break;
				} 
				if (scl_id >= 0) {
					ModernizedCProgram.syn_combine_list(((syn_cluster_T)((ModernizedCProgram.curwin.getW_s()).getB_syn_clusters().getGa_data()))[scl_id].getScl_list(), clstr_list, list_op);
				} else {
						ModernizedCProgram.vim_free(clstr_list);
				} 
				got_clstr = 1;
			}
			if (got_clstr) {
				ModernizedCProgram.redraw_curbuf_later(35);
				ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
			} 
		} 
		if (!got_clstr) {
			ModernizedCProgram.emsg(((byte)("E400: No cluster specified")));
		} 
		if (rest == ((Object)0) || !ModernizedCProgram.ends_excmd(rest)) {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), arg/*
			 * On first call for current buffer: Init growing array.
			 */);
		} 
	}
	public void syn_cmd_sync(int syncing) {
		Object[] generatedArg = this.getArg();
		char_u arg_start = generatedArg;
		char_u arg_end = new char_u();
		char_u key = ((Object)0);
		char_u next_arg = new char_u();
		int illegal = 0;
		int finished = 0;
		long n;
		char_u cpo_save = new char_u();
		if (ModernizedCProgram.ends_excmd(arg_start)) {
			eap.syn_cmd_list(1);
			return /*Error: Unsupported expression*/;
		} 
		int generatedSkip = this.getSkip();
		regprog regprog = new regprog();
		while (!ModernizedCProgram.ends_excmd(arg_start)) {
			arg_end = ModernizedCProgram.skiptowhite(arg_start);
			next_arg = ModernizedCProgram.skipwhite(arg_end);
			ModernizedCProgram.vim_free(key);
			key = ModernizedCProgram.vim_strnsave_up(arg_start, (int)(arg_end - arg_start));
			if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("CCOMMENT")) == 0) {
				if (!generatedSkip) {
					ModernizedCProgram.curwin.getW_s().getB_syn_sync_flags() |=  -1024;
				} 
				if (!ModernizedCProgram.ends_excmd(next_arg)) {
					arg_end = ModernizedCProgram.skiptowhite(next_arg);
					if (!generatedSkip) {
						ModernizedCProgram.curwin.getW_s().setB_syn_sync_id(ModernizedCProgram.syn_check_group(next_arg, (int)(arg_end - next_arg)));
					} 
					next_arg = ModernizedCProgram.skipwhite(arg_end);
				}  else if (!generatedSkip) {
					ModernizedCProgram.curwin.getW_s().setB_syn_sync_id(ModernizedCProgram.syn_name2id((char_u)"Comment"));
				} 
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(key), (byte)("LINES"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(key), (byte)("MINLINES"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(key), (byte)("MAXLINES"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(key), (byte)("LINEBREAKS"), (size_t)(true)) == 0) {
				if (key[4] == (byte)'S') {
					arg_end = key + 6;
				}  else if (key[0] == (byte)'L') {
					arg_end = key + 11;
				} else {
						arg_end = key + 9;
				} 
				if (arg_end[-1] != (byte)'=' || !((int)(arg_end) - (byte)'0' < 10)) {
					illegal = 1;
					break;
				} 
				n = ModernizedCProgram.getdigits(arg_end);
				if (!generatedSkip) {
					if (key[4] == (byte)'B') {
						ModernizedCProgram.curwin.getW_s().setB_syn_sync_linebreaks(n);
					}  else if (key[1] == (byte)'A') {
						ModernizedCProgram.curwin.getW_s().setB_syn_sync_maxlines(n);
					} else {
							ModernizedCProgram.curwin.getW_s().setB_syn_sync_minlines(n);
					} 
				} 
			}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("FROMSTART")) == 0) {
				if (!generatedSkip) {
					ModernizedCProgram.curwin.getW_s().setB_syn_sync_minlines(LONG_MAX);
					ModernizedCProgram.curwin.getW_s().setB_syn_sync_maxlines(0);
				} 
			}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("LINECONT")) == 0) {
				if (next_arg == /* missing pattern */(byte)'\000') {
					illegal = 1;
					break;
				} 
				if (ModernizedCProgram.curwin.getW_s().getB_syn_linecont_pat() != ((Object)0)) {
					ModernizedCProgram.emsg(((byte)("E403: syntax sync: line continuations pattern specified twice")));
					finished = 1;
					break;
				} 
				arg_end = ModernizedCProgram.skip_regexp(next_arg + 1, next_arg, 1, ((Object)0));
				if (arg_end != /* end delimiter not found */next_arg) {
					illegal = 1;
					break;
				} 
				if (!generatedSkip) {
					if ((ModernizedCProgram.curwin.getW_s().setB_syn_linecont_pat(ModernizedCProgram.vim_strnsave(next_arg + /* store the pattern and compiled regexp program */1, (int)(arg_end - next_arg - 1)))) == ((Object)0)) {
						finished = 1;
						break;
					} 
					ModernizedCProgram.curwin.getW_s().setB_syn_linecont_ic(ModernizedCProgram.curwin.getW_s().getB_syn_ic());
					cpo_save = /* Make 'cpoptions' empty, to avoid the 'l' flag */ModernizedCProgram.p_cpo;
					ModernizedCProgram.p_cpo = (char_u)"";
					ModernizedCProgram.curwin.getW_s().setB_syn_linecont_prog(regprog.vim_regcomp(ModernizedCProgram.curwin.getW_s().getB_syn_linecont_pat(), 1));
					ModernizedCProgram.p_cpo = cpo_save;
					ModernizedCProgram.curwin.getW_s().getB_syn_linecont_time().syn_clear_time();
					if (ModernizedCProgram.curwin.getW_s().getB_syn_linecont_prog() == ((Object)0)) {
						do {
							if ((ModernizedCProgram.curwin.getW_s().getB_syn_linecont_pat()) != ((Object)0)) {
								ModernizedCProgram.vim_free(ModernizedCProgram.curwin.getW_s().getB_syn_linecont_pat());
								(ModernizedCProgram.curwin.getW_s().getB_syn_linecont_pat()) = ((Object)0);
							} 
						} while (0);
						finished = 1;
						break;
					} 
				} 
				next_arg = ModernizedCProgram.skipwhite(arg_end + 1);
			} else {
					this.setArg(next_arg);
					if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("MATCH")) == 0) {
						eap.syn_cmd_match(1);
					}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("REGION")) == 0) {
						eap.syn_cmd_region(1);
					}  else if (/*Error: Function owner not recognized*/strcmp((byte)(key), (byte)("CLEAR")) == 0) {
						eap.syn_cmd_clear(1);
					} else {
							illegal = 1;
					} 
					finished = 1;
					break;
			} 
			arg_start = next_arg;
		}
		ModernizedCProgram.vim_free(key);
		if (illegal) {
			ModernizedCProgram.semsg(((byte)("E404: Illegal arguments: %s")), arg_start);
		}  else if (!finished) {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(arg_start));
			ModernizedCProgram.redraw_curbuf_later(35);
			ModernizedCProgram.curwin.getW_s().syn_stack_free_all();
		} 
	}
	public void ex_syntax() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u subcmd_end = new char_u();
		char_u subcmd_name = new char_u();
		int i;
		Object generatedCmdlinep = this.getCmdlinep();
		ModernizedCProgram.syn_cmdlinep = generatedCmdlinep;
		for (subcmd_end = arg; (((int)(subcmd_end) - (byte)'A' < 26) || ((int)(subcmd_end) - (byte)'a' < 26)); ++/* isolate subcommand name */subcmd_end) {
			;
		}
		subcmd_name = ModernizedCProgram.vim_strnsave(arg, (int)(subcmd_end - arg));
		int generatedSkip = this.getSkip();
		if (subcmd_name != ((Object)0)) {
			if (generatedSkip) {
				++emsg_skip;
			} 
			for (i = 0; /*Error: Unsupported expression*/; ++i) {
				if (ModernizedCProgram.subcommands[i].getName() == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)("E410: Invalid :syntax subcommand: %s")), subcmd_name);
					break;
				} 
				if (/*Error: Function owner not recognized*/strcmp((byte)(subcmd_name), (byte)((char_u)ModernizedCProgram.subcommands[i].getName())) == 0) {
					this.setArg(ModernizedCProgram.skipwhite(subcmd_end));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(eap, 0);
					break;
				} 
			}
			ModernizedCProgram.vim_free(subcmd_name);
			if (generatedSkip) {
				--emsg_skip;
			} 
		} 
	}
	public void ex_ownsyntax() {
		char_u old_value = new char_u();
		char_u new_value = new char_u();
		if (ModernizedCProgram.curwin.getW_s() == ModernizedCProgram.curwin.getW_buffer().getB_s()) {
			ModernizedCProgram.curwin.setW_s((synblock_T)ModernizedCProgram.alloc(/*Error: Unsupported expression*/));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.curwin.getW_s(), 0, /*Error: Unsupported expression*/);
			ModernizedCProgram.curwin.getW_s().getB_keywtab().hash_init();
			ModernizedCProgram.curwin.getW_s().getB_keywtab_ic().hash_init();
			ModernizedCProgram.curwin.getW_onebuf_opt().setWo_spell(/* TODO: keep the spell checking as it was. *//* No spell checking */0);
			ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_p_spc());
			ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_p_spf());
			ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_p_spl());
			ModernizedCProgram.clear_string_option(ModernizedCProgram.curwin.getW_s().getB_syn_isk());
		} 
		old_value = ModernizedCProgram.get_var_value((char_u)/* save value of b:current_syntax */"b:current_syntax");
		if (old_value != ((Object)0)) {
			old_value = ModernizedCProgram.vim_strsave(old_value);
		} 
		Object[] generatedArg = this.getArg();
		Object[] generatedB_fname = curbuf.getB_fname();
		/* Apply the "syntax" autocommand event, this finds and loads the syntax
		     * file. */curbuf.apply_autocmds(auto_event.EVENT_SYNTAX, generatedArg, generatedB_fname, 1);
		new_value = ModernizedCProgram.get_var_value((char_u)/* move value of b:current_syntax to w:current_syntax */"b:current_syntax");
		if (new_value != ((Object)0)) {
			ModernizedCProgram.set_internal_string_var((char_u)"w:current_syntax", new_value);
		} 
		if (old_value == ((Object)/* restore value of b:current_syntax */0)) {
			ModernizedCProgram.do_unlet((char_u)"b:current_syntax", 1);
		} else {
				ModernizedCProgram.set_internal_string_var((char_u)"b:current_syntax", old_value);
				ModernizedCProgram.vim_free(old_value);
		} 
	}
	/*
	 * ":syntime".
	 */
	public void ex_syntime() {
		Object[] generatedArg = this.getArg();
		if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("on")) == 0) {
			ModernizedCProgram.syn_time_on = 1;
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("off")) == 0) {
			ModernizedCProgram.syn_time_on = 0;
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("clear")) == 0) {
			ModernizedCProgram.syntime_clear();
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("report")) == 0) {
			ModernizedCProgram.syntime_report();
		} else {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
		} 
	}
	public void do_tags() {
		int i;
		char_u name = new char_u();
		taggy_T tagstack = ModernizedCProgram.curwin.getW_tagstack();
		int tagstackidx = ModernizedCProgram.curwin.getW_tagstackidx();
		int tagstacklen = ModernizedCProgram.curwin.getW_tagstacklen();
		ModernizedCProgram.msg_puts_title(((byte)(/* Highlight title */"\n  # TO tag         FROM line  in file/text")));
		int generatedB_fnum = curbuf.getB_fnum();
		for (i = 0; i < tagstacklen; ++i) {
			if (tagstack[i].getTagname() != ((Object)0)) {
				name = (tagstack[i].getFmark()).fm_getname(30);
				if (name == ((Object)/* file name not available */0)) {
					continue;
				} 
				ModernizedCProgram.msg_putchar((byte)'\n');
				ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%c%2d %2d %-15s %5ld  ", i == tagstackidx ? (byte)'>' : (byte)' ', i + 1, tagstack[i].getCur_match() + 1, tagstack[i].getTagname(), tagstack[i].getFmark().getMark().getLnum());
				ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
				ModernizedCProgram.msg_outtrans_attr(name, tagstack[i].getFmark().getFnum() == generatedB_fnum ? ModernizedCProgram.highlight_attr[(int)(.HLF_D)] : 0);
				ModernizedCProgram.vim_free(name);
			} 
			ModernizedCProgram.out_flush();
		}
		if (tagstackidx == /* idx at top of stack */tagstacklen) {
			ModernizedCProgram.msg_puts("\n>"/*
			 * Compare two strings, for length "len", ignoring case the ASCII way.
			 * return 0 for match, < 0 for smaller, > 0 for bigger
			 * Make sure case is folded to uppercase in comparison (like for 'sort -f')
			 */);
		} 
	}
	public void ex_menu() {
		char_u menu_path = new char_u();
		int modes;
		char_u map_to = new char_u();
		int noremap;
		int silent = 0;
		int special = 0;
		int unmenu;
		char_u map_buf = new char_u();
		char_u arg = new char_u();
		char_u p = new char_u();
		int i;
		int[] pri_tab = new int[10 + 1];
		int enable = /* TRUE for "menu enable", FALSE for "menu
						     * disable */2;
		vimmenu_T menuarg = new vimmenu_T();
		vimmenu_T root_menu_ptr = new vimmenu_T();
		Object[] generatedCmd = this.getCmd();
		int generatedForceit = this.getForceit();
		modes = ModernizedCProgram.get_menu_cmd_modes(generatedCmd, generatedForceit, noremap, unmenu);
		Object[] generatedArg = this.getArg();
		arg = generatedArg;
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<script>"), (size_t)(true)) == 0) {
				noremap = -2;
				arg = ModernizedCProgram.skipwhite(arg + 8);
				continue;
			} 
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<silent>"), (size_t)(true)) == 0) {
				silent = 1;
				arg = ModernizedCProgram.skipwhite(arg + 8);
				continue;
			} 
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("<special>"), (size_t)(true)) == 0) {
				special = 1;
				arg = ModernizedCProgram.skipwhite(arg + 9);
				continue;
			} 
			break;
		}
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("icon="), (size_t)(true)) == /* Locate an optional "icon=filename" argument. */0) {
			arg += 5;
			while (arg != (byte)'\000' && arg != (byte)' ') {
				if (arg == (byte)'\\') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((arg)), (byte)((arg + 1)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(arg + 1)) + 1));
				} 
				arg += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(arg);
			}
			if (arg != (byte)'\000') {
				arg++ = (byte)'\000';
				arg = ModernizedCProgram.skipwhite(arg);
			} 
		} 
		for (p = arg; p; ++/*
		     * Fill in the priority table.
		     */p) {
			if (!((int)(p) - (byte)'0' < 10) && p != (byte)'.') {
				break;
			} 
		}
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (((p) == (byte)' ' || (p) == (byte)'\t')) {
			for (i = 0; i < 10 && !((arg) == (byte)' ' || (arg) == (byte)'\t'); ++i) {
				pri_tab[i] = ModernizedCProgram.getdigits(arg);
				if (pri_tab[i] == 0) {
					pri_tab[i] = 500;
				} 
				if (arg == (byte)'.') {
					++arg;
				} 
			}
			arg = ModernizedCProgram.skipwhite(arg);
		}  else if (generatedAddr_count && generatedLine2 != 0) {
			pri_tab[0] = generatedLine2;
			i = 1;
		} else {
				i = 0;
		} 
		while (i < 10) {
			pri_tab[i++] = 500;
		}
		pri_tab[10] = -/* mark end of the table */1/*
		     * Check for "disable" or "enable" argument.
		     */;
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("enable"), (size_t)(true)) == 0 && ((arg[6]) == (byte)' ' || (arg[6]) == (byte)'\t')) {
			enable = 1;
			arg = ModernizedCProgram.skipwhite(arg + 6);
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("disable"), (size_t)(true)) == 0 && ((arg[7]) == (byte)' ' || (arg[7]) == (byte)'\t')) {
			enable = 0;
			arg = ModernizedCProgram.skipwhite(arg + 7);
		} 
		if (arg == /*
		     * If there is no argument, display all menus.
		     */(byte)'\000') {
			ModernizedCProgram.show_menus(arg, modes);
			return /*Error: Unsupported expression*/;
		} 
		menu_path = arg;
		if (menu_path == (byte)'.') {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), menu_path);
			;
		} 
		map_to = ModernizedCProgram.menu_translate_tab_and_shift(arg/*
		     * If there is only a menu name, display menus with that name.
		     */);
		if (map_to == (byte)'\000' && !unmenu && enable == 2) {
			ModernizedCProgram.show_menus(menu_path, modes);
			;
		}  else if (map_to != (byte)'\000' && (unmenu || enable != 2)) {
			ModernizedCProgram.emsg(((byte)(e_trailing)));
			;
		} 
		root_menu_ptr = ModernizedCProgram.get_root_menu(menu_path);
		if (root_menu_ptr == ModernizedCProgram.curwin.getW_winbar()) {
			ModernizedCProgram.redraw_later(/* Assume the window toolbar menu will change. */40);
		} 
		Object generatedNoremap = menuarg.getNoremap();
		Object generatedSilent = menuarg.getSilent();
		if (enable != 2/*
			 * Change sensitivity of the menu.
			 * For the PopUp menu, remove a menu for each mode separately.
			 * Careful: menu_nable_recurse() changes menu_path.
			 */) {
			if (/*Error: Function owner not recognized*/strcmp((byte)(menu_path), (byte)("*")) == /* meaning: do all menus */0) {
				menu_path = (char_u)"";
			} 
			if (ModernizedCProgram.menu_is_popup(menu_path)) {
				for (i = 0; i < 7; ++i) {
					if (modes & (1 << i)) {
						p = ModernizedCProgram.popup_mode_name(menu_path, i);
						if (p != ((Object)0)) {
							root_menu_ptr.menu_nable_recurse(p, ((1 << 7) - 1), enable);
							ModernizedCProgram.vim_free(p);
						} 
					} 
				}
			} 
			root_menu_ptr.menu_nable_recurse(menu_path, modes, enable);
		}  else if (unmenu/*
			 * Delete menu(s).
			 */) {
			if (/*Error: Function owner not recognized*/strcmp((byte)(menu_path), (byte)("*")) == /* meaning: remove all menus */0) {
				menu_path = (char_u)""/*
					 * For the PopUp menu, remove a menu for each mode separately.
					 */;
			} 
			if (ModernizedCProgram.menu_is_popup(menu_path)) {
				for (i = 0; i < 7; ++i) {
					if (modes & (1 << i)) {
						p = ModernizedCProgram.popup_mode_name(menu_path, i);
						if (p != ((Object)0)) {
							root_menu_ptr.remove_menu(p, ((1 << 7) - 1), 1);
							ModernizedCProgram.vim_free(p);
						} 
					} 
				}
			} 
			root_menu_ptr.remove_menu(menu_path, modes, /* Careful: remove_menu() changes menu_path */0);
		} else {
				if (ModernizedCProgram.vim_stricmp((byte)(map_to), (byte)("<nop>")) == /*
					 * Add menu(s).
					 * Replace special key codes.
					 *//* "<Nop>" means nothing */0) {
					map_to = (char_u)"";
					map_buf = ((Object)0);
				}  else if (modes & (1 << 7)) {
					map_buf = ((Object)/* Menu tips are plain text. */0);
				} else {
						map_to = ModernizedCProgram.replace_termcodes(map_to, map_buf, 2 | (special ? 4 : 0), ((Object)0));
				} 
				menuarg.setModes(modes);
				generatedNoremap[0] = noremap;
				generatedSilent[0] = silent;
				menuarg.add_menu_path(menu_path, pri_tab, map_to);
				if (ModernizedCProgram.menu_is_popup(/*
					 * For the PopUp menu, add a menu for each mode separately.
					 */menu_path)) {
					for (i = 0; i < 7; ++i) {
						if (modes & (1 << i)) {
							p = ModernizedCProgram.popup_mode_name(menu_path, i);
							if (p != ((Object)0)) {
								menuarg.setModes(/* Include all modes, to make ":amenu" work */modes);
								menuarg.add_menu_path(p, pri_tab, map_to);
								ModernizedCProgram.vim_free(p);
							} 
						} 
					}
				} 
				ModernizedCProgram.vim_free(map_buf/* If the menubar height changed, resize the window */);
		} 
		if (root_menu_ptr == ModernizedCProgram.curwin.getW_winbar()) {
			int h = ModernizedCProgram.curwin.winbar_height();
			if (h != ModernizedCProgram.curwin.getW_winbar_height()) {
				if (h == 0) {
					++ModernizedCProgram.curwin.getW_height();
				}  else if (ModernizedCProgram.curwin.getW_height() > 0) {
					--ModernizedCProgram.curwin.getW_height();
				} 
				ModernizedCProgram.curwin.setW_winbar_height(h);
			} 
		} 
	}
	/* Ex command arguments */
	public void ex_emenu() {
		vimmenu_T menu = new vimmenu_T();
		char_u name = new char_u();
		char_u saved_name = new char_u();
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u p = new char_u();
		int gave_emsg = 0;
		int mode_idx = -1;
		if (arg[0] && ((arg[1]) == (byte)' ' || (arg[1]) == (byte)'\t')) {
			switch (arg[0]) {
			case (byte)'i':
					mode_idx = 4;
					break;
			case (byte)'t':
					mode_idx = 6;
					break;
			case (byte)'n':
					mode_idx = 0;
					break;
			case (byte)'v':
					mode_idx = 1;
					break;
			case (byte)'c':
					mode_idx = 5;
					break;
			case (byte)'s':
					mode_idx = 2;
					break;
			case (byte)'o':
					mode_idx = 3;
					break;
			default:
					ModernizedCProgram.semsg(((byte)(e_invarg2)), arg);
					return /*Error: Unsupported expression*/;
			}
			arg = ModernizedCProgram.skipwhite(arg + 2);
		} 
		saved_name = ModernizedCProgram.vim_strsave(arg);
		if (saved_name == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		menu = ModernizedCProgram.get_root_menu(saved_name);
		name = saved_name;
		Object generatedChildren = menu.getChildren();
		Object generatedNext = menu.getNext();
		while (name) {
			p = ModernizedCProgram.menu_name_skip(/* Find in the menu hierarchy */name);
			while (menu != ((Object)0)) {
				if (menu.menu_name_equal(name)) {
					if (p == (byte)'\000' && generatedChildren != ((Object)0)) {
						ModernizedCProgram.emsg(((byte)("E333: Menu path must lead to a menu item")));
						gave_emsg = 1;
						menu = ((Object)0);
					}  else if (p != (byte)'\000' && generatedChildren == ((Object)0)) {
						ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_notsubmenu)));
						menu = ((Object)0);
					} 
					break;
				} 
				menu = generatedNext;
			}
			if (menu == ((Object)0) || p == (byte)'\000') {
				break;
			} 
			menu = generatedChildren;
			name = p;
		}
		ModernizedCProgram.vim_free(saved_name);
		if (menu == ((Object)0)) {
			if (!gave_emsg) {
				ModernizedCProgram.semsg(((byte)("E334: Menu not found: %s")), arg);
			} 
			return /*Error: Unsupported expression*/;
		} 
		// Found the menu, so execute.// Found the menu, so execute.ModernizedCProgram.execute_menu(eap, menu, mode_idx/*
		 * Handle a click in the window toolbar of "wp" at column "col".
		 */);
	}
	public void ex_menutranslate() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		menutrans_T tp = new menutrans_T();
		int i;
		char_u from = new char_u();
		char_u from_noamp = new char_u();
		char_u to = new char_u();
		if (ModernizedCProgram.menutrans_ga.getGa_itemsize() == 0) {
			ModernizedCProgram.menutrans_ga.ga_init2((int)/*Error: Unsupported expression*/, 5/*
			     * ":menutrans clear": clear all translations.
			     */);
		} 
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("clear"), (size_t)(true)) == 0 && ModernizedCProgram.ends_excmd(ModernizedCProgram.skipwhite(arg + 5))) {
			tp = (menutrans_T)ModernizedCProgram.menutrans_ga.getGa_data();
			for (i = 0; i < ModernizedCProgram.menutrans_ga.getGa_len(); ++i) {
				ModernizedCProgram.vim_free(tp[i].getFrom());
				ModernizedCProgram.vim_free(tp[i].getFrom_noamp());
				ModernizedCProgram.vim_free(tp[i].getTo());
			}
			ModernizedCProgram.menutrans_ga.ga_clear();
			ModernizedCProgram.del_menutrans_vars();
		} else {
				from = /* ":menutrans from to": add translation */arg;
				arg = ModernizedCProgram.menu_skip_part(arg);
				to = ModernizedCProgram.skipwhite(arg);
				arg = (byte)'\000';
				arg = ModernizedCProgram.menu_skip_part(to);
				if (arg == to) {
					ModernizedCProgram.emsg(((byte)(e_invarg)));
				} else {
						if (ModernizedCProgram.menutrans_ga.ga_grow(1) == 1) {
							tp = (menutrans_T)ModernizedCProgram.menutrans_ga.getGa_data();
							from = ModernizedCProgram.vim_strsave(from);
							if (from != ((Object)0)) {
								from_noamp = ModernizedCProgram.menu_text(from, ((Object)0), ((Object)0));
								to = ModernizedCProgram.vim_strnsave(to, (int)(arg - to));
								if (from_noamp != ((Object)0) && to != ((Object)0)) {
									ModernizedCProgram.menu_translate_tab_and_shift(from);
									ModernizedCProgram.menu_translate_tab_and_shift(to);
									ModernizedCProgram.menu_unescape_name(from);
									ModernizedCProgram.menu_unescape_name(to);
									tp[ModernizedCProgram.menutrans_ga.getGa_len()].setFrom(from);
									tp[ModernizedCProgram.menutrans_ga.getGa_len()].setFrom_noamp(from_noamp);
									tp[ModernizedCProgram.menutrans_ga.getGa_len()].setTo(to);
									++ModernizedCProgram.menutrans_ga.getGa_len();
								} else {
										ModernizedCProgram.vim_free(from);
										ModernizedCProgram.vim_free(from_noamp);
										ModernizedCProgram.vim_free(to);
								} 
							} 
						} 
				} 
		} 
	}
	public void ex_gui() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		if (arg[0] == (byte)'-' && (arg[1] == (byte)'f' || arg[1] == (byte)'b') && (arg[2] == (byte)'\000' || ((arg[2]) == (byte)' ' || (arg[2]) == (byte)'\t'))) {
			ModernizedCProgram.gui.setDofork((arg[1] == (byte)'b'));
			this.setArg(ModernizedCProgram.skipwhite(generatedArg + 2));
		} 
		if (!ModernizedCProgram.gui.getIn_use()) {
			ModernizedCProgram.msg_clr_eos_force();
			ModernizedCProgram.gui_start(((Object)0));
		} 
		if (!ModernizedCProgram.ends_excmd(generatedArg)) {
			eap.ex_next();
		} 
		/*
		 * This is shared between Athena, Motif and GTK.
		 */
	}
	/*
	 * Callback function for do_in_runtimepath().
	 */
	/*
	 * Find the path of bitmap "name" with extension "ext" in 'runtimepath'.
	 * Return FAIL for failure and OK if buffer[MAXPATHL] contains the result.
	 */
	/*
	 * Given the name of the "icon=" argument, try finding the bitmap file for the
	 * icon.  If it is an absolute path name, use it as it is.  Otherwise append
	 * "ext" and search for it in 'runtimepath'.
	 * The result is put in "buffer[MAXPATHL]".  If something fails "buffer"
	 * contains "name".
	 */
	/* avoid putting up a message box with blanks only */
	/* Truncate a very long message, it will go off-screen. */
	/*
	 * Return TRUE if still starting up and there is no place to enter text.
	 * For GTK and X11 we check if stderr is not a tty, which means we were
	 * (probably) started from the desktop.  Also check stdin, "vim >& file" does
	 * allow typing on stdin.
	 */
	/*
	 * Update the current window and the screen.
	 */
	/* Trigger CursorMoved if the cursor moved. */
	/* may need to update the screen */
	/*
	 * Get the text to use in a find/replace dialog.  Uses the last search pattern
	 * if the argument is empty.
	 * Returns an allocated string.
	 */
	/* return: TRUE if \< \> found */
	/* return: TRUE if \C found */
	/* Remove "\V" */
	/* Recognize "\c" and "\C" and remove. */
	/* Recognize "\<text\>" and remove. */
	/* Recognize "\/" or "\?" and remove. */
	/*
	 * Handle the press of a button in the find-replace dialog.
	 * Return TRUE when something was added to the input buffer.
	 */
	/* one of FRD_REPLACE, FRD_FINDNEXT, etc. */
	/* Search downwards. */
	/* When the screen is being updated we should not change buffers and
	     * windows structures, it may cause freed memory to be used.  Also don't
	     * do this recursively (pressing "Find" quickly several times. */
	/* refuse replace when text cannot be changed */
	/* escape / and \ */
	/* escape / and \ */
	/* Do the replacement when the text at the cursor matches.  Thus no
		 * replacement is done if the cursor was moved! */
	/* Clear the command line to remove any old "No match"
			 * error. */
	/* A button was pressed thus undo should be synced. */
	/* A button was pressed, thus undo should be synced. */
	/* Search for the next match.
		 * Don't skip text under cursor for single replace. */
	/* We need to escape '?' if and only if we are searching in the up
		     * direction */
	/* don't let an error message set msg_scroll */
	/* Don't want to pass did_emsg to other code, it may cause disabling
	     * syntax HL if we were busy redrawing. */
	/* update the screen */
	/* overwrite any message */
	/* don't wait for return */
	/*
	 * Jump to the window at specified point (x, y).
	 */
	/*
	 * Function passed to handle_drop() for the actions to be done after the
	 * argument list has been updated.
	 */
	/* If Shift held down, change to first file's directory.  If the first
	     * item is a directory, change to that directory (and let the explorer
	     * plugin show the contents). */
	/* Update the screen display */
	/*
	 * Process file drop.  Mouse cursor position, key modifiers, name of files
	 * and count of files are given.  Argument "fnames[count]" has full pathnames
	 * of dropped files, they will be freed in this function, and caller can't use
	 * fnames after call this function.
	 */
	/*
	     * This function is called by event handlers.  Just in case we get a
	     * second event before the first one is handled, ignore the second one.
	     * Not sure if this can ever happen, just in case.
	     */
	/*
	     * When the cursor is at the command line, add the file names to the
	     * command line, don't edit the files.
	     */
	/* We don't know what command is used thus we can't be sure
			 * about which characters need to be escaped.  Only escape the
			 * most common ones. */
	/* Go to the window under mouse cursor, then shorten given "fnames" by
		 * current window, because a window can have local current dir. */
	/* If Shift held down, remember the first item. */
	/* Handle the drop, :edit or :split to get to the file.  This also
		 * frees fnames[].  Skip this if there is only one item, it's a
		 * directory and Shift is held down. */
	public void ex_python() {
		char_u script = new char_u();
		Object[] generatedArg = this.getArg();
		script = eap.script_get(generatedArg);
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			if (p_pyx == 0) {
				p_pyx = 2;
			} 
			ModernizedCProgram.DoPyCommand(script == ((Object)0) ? (byte)generatedArg : (byte)script, (rangeinitializer)init_range_cmd, (runner)run_cmd, (Object)eap);
		} 
		ModernizedCProgram.vim_free(script);
	}
	/*
	 * ":pyfile"
	 */
	public void ex_pyfile() {
		byte[] buffer = new byte[1024];
		Object[] generatedArg = this.getArg();
		byte file = (byte)generatedArg;
		byte p;
		if (p_pyx == 0) {
			p_pyx = 2/* Have to do it like this. PyRun_SimpleFile requires you to pass a
			     * stdio file pointer, but Vim and the Python DLL are compiled with
			     * different options under Windows, meaning that stdio pointers aren't
			     * compatible between the two. Yuk.
			     *
			     * Put the string "execfile('file')" into buffer. But, we need to
			     * escape any backslashes or single quotes in the file name, so that
			     * Python won't mangle the file name.
			     */;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(buffer, "execfile('");
		p = buffer + /* size of "execfile('" */10;
		while (file && p < buffer + (1024 - 3)) {
			if (file == (byte)'\\' || file == (byte)'\'') {
				p++ = (byte)'\\';
			} 
			p++ = file++;
		}
		if (file != /* If we didn't finish the file name, we hit a buffer overflow */(byte)'\0') {
			return /*Error: Unsupported expression*/;
		} 
		p++ = /* Put in the terminating "')" and a null */(byte)'\'';
		p++ = (byte)')';
		p++ = (byte)'\0';
		ModernizedCProgram.DoPyCommand(/* Execute the file */buffer, (rangeinitializer)init_range_cmd, (runner)run_cmd, (Object)eap);
	}
	public void ex_pydo() {
		if (p_pyx == 0) {
			p_pyx = 2;
		} 
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.DoPyCommand((byte)generatedArg, (rangeinitializer)init_range_cmd, (runner)run_do, (Object)eap/******************************************************
		 * 2. Python output stream: writes output via [e]msg().
		 */);
	}
	// "eap" can be NULL
	public void ex_diffupdate() {
		int idx_orig;
		int idx_new;
		diffio_T diffio = new diffio_T();
		int had_diffs = ModernizedCProgram.curtab.getTp_first_diff() != ((Object)0);
		if (ModernizedCProgram.diff_busy) {
			ModernizedCProgram.diff_need_update = 1;
			return /*Error: Unsupported expression*/;
		} 
		// Delete all diffblocks.// Delete all diffblocks.ModernizedCProgram.curtab.diff_clear();
		ModernizedCProgram.curtab.setTp_diff_invalid(0);
		// Use the first buffer as the original text.for (idx_orig = 0; idx_orig < 8; ++idx_orig) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[idx_orig] != ((Object)0)) {
				break;
			} 
		}
		if (idx_orig == 8) {
			;
		} 
		// Only need to do something when there is another buffer.for (idx_new = idx_orig + 1; idx_new < 8; ++idx_new) {
			if (ModernizedCProgram.curtab.getTp_diffbuf()[idx_new] != ((Object)0)) {
				break;
			} 
		}
		if (idx_new == 8) {
			;
		} 
		/*Error: Function owner not recognized*/// Only use the internal method if it did not fail for one of the buffers./*Error: Function owner not recognized*/// Only use the internal method if it did not fail for one of the buffers.memset((diffio), (false), (/*Error: sizeof expression not supported yet*/));
		diffio.setDio_internal(ModernizedCProgram.diff_internal() && !ModernizedCProgram.diff_internal_failed());
		ModernizedCProgram.diff_try_update(diffio, idx_orig, eap);
		Object generatedDio_internal = diffio.getDio_internal();
		if (generatedDio_internal && ModernizedCProgram.diff_internal_failed()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((diffio), (false), (/*Error: sizeof expression not supported yet*/));
			ModernizedCProgram.diff_try_update(diffio, idx_orig, eap);
		} 
		// force updating cursor position on screen// force updating cursor position on screenModernizedCProgram.curwin.getW_valid_cursor().setLnum(0);
	}
	public void ex_diffpatch() {
		/* name of original temp file */char_u tmp_orig = new char_u();
		/* name of patched temp file */char_u tmp_new = new char_u();
		char_u buf = ((Object)0);
		size_t buflen = new size_t();
		win_T old_curwin = ModernizedCProgram.curwin;
		char_u newname = ((Object)/* name of patched file buffer */0);
		stat_T st = new stat_T();
		char_u esc_name = ((Object)0);
		/* operation cancelled *//* operation cancelled */tmp_orig = ModernizedCProgram.vim_tempname((byte)'o', /* don't let do_ecmd() browse again *//* We need two temp file names. */0);
		tmp_new = ModernizedCProgram.vim_tempname((byte)'n', 0);
		if (tmp_orig == ((Object)0) || tmp_new == ((Object)0)) {
			;
		} 
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (ModernizedCProgram.buf_write(curbuf, tmp_orig, ((Object)/* Write the current buffer to "tmp_orig". */0), (linenr_T)1, generatedMl_line_count, ((Object)0), 0, 0, 0, 1) == 0) {
			;
		} 
		Object[] generatedArg = this.getArg();
		esc_name = ModernizedCProgram.vim_strsave_shellescape(generatedArg, 1, 1);
		if (esc_name == ((Object)0)) {
			;
		} 
		buflen = /*Error: Function owner not recognized*/strlen((byte)(tmp_orig)) + /*Error: Function owner not recognized*/strlen((byte)(esc_name)) + /*Error: Function owner not recognized*/strlen((byte)(tmp_new)) + 16;
		buf = ModernizedCProgram.alloc(buflen);
		if (buf == ((Object)0)) {
			;
		} 
		if (p_pex != (byte)'\000') {
			ModernizedCProgram.eval_patch(/* Use 'patchexpr' to generate the new file. */tmp_orig, generatedArg, tmp_new);
		} else {
				ModernizedCProgram.vim_snprintf((byte)buf, buflen, /* Build the patch command and execute it.  Ignore errors.  Switch to
					 * cooked mode to allow the user to respond to prompts. */"patch -o %s %s < %s", tmp_new, tmp_orig, esc_name);
				ModernizedCProgram.block_autocmds();
				(Object)ModernizedCProgram.call_shell(buf, 1 | 4);
				ModernizedCProgram.unblock_autocmds();
		} 
		ModernizedCProgram.redraw_later(/* patch probably has written over the screen */50);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(buf), (byte)(/* Delete any .orig or .rej file created. */tmp_new));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(buf), (byte)(".orig"));
		ModernizedCProgram.mch_remove(buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(buf), (byte)(tmp_new));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(buf), (byte)(".rej"));
		ModernizedCProgram.mch_remove(buf);
		Object generated_stat64 = st.get_stat64();
		Object[] generatedB_fname = curbuf.getB_fname();
		if ((st).vim_stat(((byte)tmp_new)) < 0 || generated_stat64 == /* Only continue if the output file was created. */0) {
			ModernizedCProgram.emsg(((byte)("E816: Cannot read patch output")));
		} else {
				if (generatedB_fname != ((Object)0)) {
					newname = ModernizedCProgram.vim_strnsave(generatedB_fname, (int)(/*Error: Function owner not recognized*/strlen((byte)(generatedB_fname)) + 4));
					if (newname != ((Object)0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(newname), (byte)(".new"));
					} 
				} 
				ModernizedCProgram.cmdmod.setTab(/* don't use a new tab page, each tab page has its own diffs */0);
				if (ModernizedCProgram.win_split(0, (ModernizedCProgram.diff_flags & -1024) ? 2 : 0) != 0) {
					this.setCmdidx(/* Pretend it was a ":split fname" command */CMD_index.CMD_split);
					this.setArg(tmp_new);
					ModernizedCProgram.do_exedit(eap, old_curwin);
					if (ModernizedCProgram.curwin != old_curwin && /* check that split worked and editing tmp_new */old_curwin.win_valid()) {
						ModernizedCProgram.curwin.diff_win_options(/* Set 'diff', 'scrollbind' on and 'wrap' off. */1);
						old_curwin.diff_win_options(1);
						if (newname != ((Object)0)) {
							this.setArg(/* do a ":file filename.new" on the patched buffer */newname);
							eap.ex_file();
							if (ModernizedCProgram.au_has_group((char_u)/* Do filetype detection with the new name. */"filetypedetect")) {
								ModernizedCProgram.do_cmdline_cmd((char_u)":doau filetypedetect BufRead");
							} 
						} 
					} 
				} 
		} 
		ModernizedCProgram.vim_free(tmp_orig);
		if (tmp_new != ((Object)0)) {
			ModernizedCProgram.mch_remove(tmp_new);
		} 
		ModernizedCProgram.vim_free(tmp_new);
		ModernizedCProgram.vim_free(newname);
		ModernizedCProgram.vim_free(buf);
		ModernizedCProgram.vim_free(esc_name);
	}
	/*
	 * Split the window and edit another file, setting options to show the diffs.
	 */
	public void ex_diffsplit() {
		win_T old_curwin = ModernizedCProgram.curwin;
		bufref_T old_curbuf = new bufref_T();
		ModernizedCProgram.set_bufref(old_curbuf, curbuf);
		ModernizedCProgram.validate_cursor();
		ModernizedCProgram.curwin.set_fraction();
		ModernizedCProgram.cmdmod.setTab(/* don't use a new tab page, each tab page has its own diffs */0);
		Object generatedBr_buf = old_curbuf.getBr_buf();
		 generatedW_cursor = old_curwin.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		if (ModernizedCProgram.win_split(0, (ModernizedCProgram.diff_flags & -1024) ? 2 : 0) != 0) {
			this.setCmdidx(/* Pretend it was a ":split fname" command */CMD_index.CMD_split);
			ModernizedCProgram.curwin.getW_onebuf_opt().setWo_diff(1);
			ModernizedCProgram.do_exedit(eap, old_curwin);
			if (ModernizedCProgram.curwin != /* split must have worked */old_curwin) {
				ModernizedCProgram.curwin.diff_win_options(/* Set 'diff', 'scrollbind' on and 'wrap' off. */1);
				if (old_curwin.win_valid()) {
					old_curwin.diff_win_options(1);
					if (old_curbuf.bufref_valid()) {
						generatedW_cursor.setLnum(generatedBr_buf.diff_get_corresponding_line(generatedLnum));
					} 
				} 
				ModernizedCProgram.curwin.scroll_to_fraction(ModernizedCProgram.curwin.getW_height());
			} 
		} 
	}
	/*
	 * Set options to show diffs for the current window.
	 */
	public void ex_diffthis() {
		ModernizedCProgram.curwin.diff_win_options(/* Set 'diff', 'scrollbind' on and 'wrap' off. */1);
	}
	public void ex_diffoff() {
		win_T wp = new win_T();
		int diffwin = 0;
		int generatedForceit = this.getForceit();
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_diff = generatedW_onebuf_opt.getWo_diff();
		Object generatedWo_diff_saved = generatedW_onebuf_opt.getWo_diff_saved();
		Object generatedWo_scb = generatedW_onebuf_opt.getWo_scb();
		Object generatedWo_scb_save = generatedW_onebuf_opt.getWo_scb_save();
		Object generatedWo_crb = generatedW_onebuf_opt.getWo_crb();
		Object generatedWo_crb_save = generatedW_onebuf_opt.getWo_crb_save();
		Object generatedWo_wrap = generatedW_onebuf_opt.getWo_wrap();
		Object generatedWo_wrap_save = generatedW_onebuf_opt.getWo_wrap_save();
		Object generatedWo_fdm = generatedW_onebuf_opt.getWo_fdm();
		Object generatedWo_fdm_save = generatedW_onebuf_opt.getWo_fdm_save();
		Object generatedWo_fdc = generatedW_onebuf_opt.getWo_fdc();
		Object generatedWo_fdc_save = generatedW_onebuf_opt.getWo_fdc_save();
		Object generatedWo_fdl = generatedW_onebuf_opt.getWo_fdl();
		Object generatedWo_fdl_save = generatedW_onebuf_opt.getWo_fdl_save();
		Object generatedWo_fen = generatedW_onebuf_opt.getWo_fen();
		Object generatedWo_fen_save = generatedW_onebuf_opt.getWo_fen_save();
		window_S generatedW_next = wp.getW_next();
		for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
			if (generatedForceit ? generatedWo_diff : wp == ModernizedCProgram.curwin/* Set 'diff' off. If option values were saved in
				     * diff_win_options(), restore the ones whose settings seem to have
				     * been left over from diff mode.  */) {
				wp.set_diff_option(0);
				if (generatedWo_diff_saved) {
					if (generatedWo_scb) {
						generatedW_onebuf_opt.setWo_scb(generatedWo_scb_save);
					} 
					if (generatedWo_crb) {
						generatedW_onebuf_opt.setWo_crb(generatedWo_crb_save);
					} 
					if (!generatedWo_wrap) {
						generatedW_onebuf_opt.setWo_wrap(generatedWo_wrap_save);
					} 
					ModernizedCProgram.free_string_option(generatedWo_fdm);
					generatedW_onebuf_opt.setWo_fdm(ModernizedCProgram.vim_strsave(generatedWo_fdm_save ? generatedWo_fdm_save : (char_u)"manual"));
					if (generatedWo_fdc == diff_foldcolumn) {
						generatedW_onebuf_opt.setWo_fdc(generatedWo_fdc_save);
					} 
					if (generatedWo_fdl == 0) {
						generatedW_onebuf_opt.setWo_fdl(generatedWo_fdl_save);
					} 
					if (generatedWo_fen) {
						generatedW_onebuf_opt.setWo_fen(wp.foldmethodIsManual() ? 0 : generatedWo_fen_save);
					} 
					wp.foldUpdateAll();
				} 
				wp.setW_topfill(/* remove filler lines */0);
				/* make sure topline is not halfway a fold and cursor is
					     * invalidated */wp.changed_window_setting_win();
				/* Note: 'sbo' is not restored, it's a global option. */wp.diff_buf_adjust();
			} 
			diffwin |=  generatedWo_diff;
		}
		if (generatedForceit) {
			ModernizedCProgram.diff_buf_clear();
		} 
		if (!diffwin && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_sbo, (byte)'h') != ((Object)/* Remove "hor" from from 'scrollopt' if there are no diff windows left. */0)) {
			ModernizedCProgram.do_cmdline_cmd((char_u)"set sbo-=hor"/*
			 * Read the diff output and add each entry to the diff list.
			 */);
		} 
	}
	public void ex_diffgetput() {
		linenr_T lnum = new linenr_T();
		int count;
		linenr_T off = 0;
		diff_T dp = new diff_T();
		diff_T dprev = new diff_T();
		diff_T dfree = new diff_T();
		int idx_cur;
		int idx_other;
		int idx_from;
		int idx_to;
		int i;
		int added;
		char_u p = new char_u();
		aco_save_T aco = new aco_save_T();
		buf_T buf = new buf_T();
		int start_skip;
		int end_skip;
		int new_count;
		int buf_empty;
		int found_not_ma = 0;
		idx_cur = /* Find the current buffer in the list of diff buffers. */curbuf.diff_buf_idx();
		if (idx_cur == 8) {
			ModernizedCProgram.emsg(((byte)("E99: Current buffer is not in diff mode")));
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		CMD_index generatedCmdidx = this.getCmdidx();
		file_buffer file_buffer = new file_buffer();
		if (generatedArg == (byte)'\000') {
			for (idx_other = 0; idx_other < 8; ++/* No argument: Find the other buffer in the list of diff buffers. */idx_other) {
				if (ModernizedCProgram.curtab.getTp_diffbuf()[idx_other] != curbuf && ModernizedCProgram.curtab.getTp_diffbuf()[idx_other] != ((Object)0)) {
					if (generatedCmdidx != CMD_index.CMD_diffput || ModernizedCProgram.curtab.getTp_diffbuf()[idx_other].getB_p_ma()) {
						break;
					} 
					found_not_ma = 1;
				} 
			}
			if (idx_other == 8) {
				if (found_not_ma) {
					ModernizedCProgram.emsg(((byte)("E793: No other buffer in diff mode is modifiable")));
				} else {
						ModernizedCProgram.emsg(((byte)("E100: No other buffer in diff mode")));
				} 
				return /*Error: Unsupported expression*/;
			} 
			for (i = idx_other + 1; i < 8; ++/* Check that there isn't a third buffer in the list */i) {
				if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != curbuf && ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && (generatedCmdidx != CMD_index.CMD_diffput || ModernizedCProgram.curtab.getTp_diffbuf()[i].getB_p_ma())) {
					ModernizedCProgram.emsg(((byte)("E101: More than two buffers in diff mode, don't know which one to use")));
					return /*Error: Unsupported expression*/;
				} 
			}
		} else {
				p = generatedArg + /*Error: Function owner not recognized*/strlen((byte)(generatedArg));
				while (p > generatedArg && ((p[-1]) == (byte)' ' || (p[-1]) == (byte)'\t')) {
					--p;
				}
				for (i = 0; ModernizedCProgram.vim_isdigit(generatedArg[i]) && generatedArg + i < p; ++i) {
					;
				}
				if (generatedArg + i == /* digits only */p) {
					i = /*Error: Function owner not recognized*/atol((byte)generatedArg);
				} else {
						i = ModernizedCProgram.buflist_findpat(generatedArg, p, 0, 1, 0);
						if (i < 0) {
							return /*Error: Unsupported expression*/;
						} 
				} 
				buf = file_buffer.buflist_findnr(i);
				if (buf == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)("E102: Can't find buffer \"%s\"")), generatedArg);
					return /*Error: Unsupported expression*/;
				} 
				if (buf == curbuf) {
					return /*Error: Unsupported expression*/;
				} 
				idx_other = buf.diff_buf_idx();
				if (idx_other == 8) {
					ModernizedCProgram.semsg(((byte)("E103: Buffer \"%s\" is not in diff mode")), generatedArg);
					return /*Error: Unsupported expression*/;
				} 
		} 
		ModernizedCProgram.diff_busy = 1;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine1 = this.getLine1();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count == /* When no range given include the line above or below the cursor. */0) {
			if (generatedCmdidx == /* Make it possible that ":diffget" on the last line gets line below
				 * the cursor line when there is no difference above the cursor. */CMD_index.CMD_diffget && generatedLine1 == generatedMl_line_count && ModernizedCProgram.curwin.diff_check(generatedLine1) == 0 && (generatedLine1 == 1 || ModernizedCProgram.curwin.diff_check(generatedLine1 - 1) == 0)) {
				++generatedLine2;
			}  else if (generatedLine1 > 0) {
				--generatedLine1;
			} 
		} 
		if (generatedCmdidx == CMD_index.CMD_diffget) {
			idx_from = idx_other;
			idx_to = idx_cur;
		} else {
				idx_from = idx_cur;
				idx_to = idx_other/* Need to make the other buffer the current buffer to be able to make
					 * changes in it. */;
				ModernizedCProgram.aucmd_prepbuf(aco, ModernizedCProgram.curtab.getTp_diffbuf()[/* set curwin/curbuf to buf and save a few things */idx_other]);
		} 
		int generatedB_changed = curbuf.getB_changed();
		if (!generatedB_changed) {
			ModernizedCProgram.change_warning(0);
			if (curbuf.diff_buf_idx() != idx_to) {
				ModernizedCProgram.emsg(((byte)("E787: Buffer changed unexpectedly")));
				;
			} 
		} 
		dprev = ((Object)0);
		Object generatedDf_lnum = dp.getDf_lnum();
		Object generatedDf_count = dp.getDf_count();
		Object generatedDf_next = dp.getDf_next();
		for (dp = ModernizedCProgram.curtab.getTp_first_diff(); dp != ((Object)0); /*Error: Unsupported expression*/) {
			if (generatedDf_lnum[idx_cur] > generatedLine2 + off) {
				break;
			} 
			dfree = ((Object)0);
			lnum = generatedDf_lnum[idx_to];
			count = generatedDf_count[idx_to];
			if (generatedDf_lnum[idx_cur] + generatedDf_count[idx_cur] > generatedLine1 + off && ModernizedCProgram.u_save(lnum - 1, lnum + count) != 0) {
				start_skip = /* Inside the specified range and saving for undo worked. */0;
				end_skip = 0;
				if (generatedAddr_count > 0) {
					start_skip = generatedLine1 + off - generatedDf_lnum[/* A range was specified: check if lines need to be skipped. */idx_cur];
					if (start_skip > 0) {
						if (start_skip > /* range starts below start of current diff block */count) {
							lnum += count;
							count = 0;
						} else {
								count -= start_skip;
								lnum += start_skip;
						} 
					} else {
							start_skip = 0;
					} 
					end_skip = generatedDf_lnum[idx_cur] + generatedDf_count[idx_cur] - 1 - (generatedLine2 + off);
					if (end_skip > 0) {
						if (idx_cur == /* range ends above end of current/from diff block *//* :diffput */idx_from) {
							i = generatedDf_count[idx_cur] - start_skip - end_skip;
							if (count > i) {
								count = i;
							} 
						} else {
								count -= /* :diffget */end_skip;
								end_skip = generatedDf_count[idx_from] - start_skip - count;
								if (end_skip < 0) {
									end_skip = 0;
								} 
						} 
					} else {
							end_skip = 0;
					} 
				} 
				buf_empty = (generatedMl_line_count == 1 && ModernizedCProgram.ml_get((linenr_T)1) == (byte)'\000');
				added = 0;
				for (i = 0; i < count; ++i) {
					buf_empty = generatedMl_line_count == /* remember deleting the last line of the buffer */1;
					ModernizedCProgram.ml_delete(lnum, 0);
					--added;
				}
				for (i = 0; i < generatedDf_count[idx_from] - start_skip - end_skip; ++i) {
					linenr_T nr = new linenr_T();
					nr = generatedDf_lnum[idx_from] + start_skip + i;
					if (nr > generatedMl_line_count) {
						break;
					} 
					p = ModernizedCProgram.vim_strsave(ModernizedCProgram.curtab.getTp_diffbuf()[idx_from].ml_get_buf(nr, 0));
					if (p != ((Object)0)) {
						ModernizedCProgram.ml_append(lnum + i - 1, p, 0, 0);
						ModernizedCProgram.vim_free(p);
						++added;
						if (buf_empty && generatedMl_line_count == 2) {
							buf_empty = /* Added the first line into an empty buffer, need to
										 * delete the dummy empty line. */0;
							ModernizedCProgram.ml_delete((linenr_T)2, 0);
						} 
					} 
				}
				new_count = generatedDf_count[idx_to] + added;
				generatedDf_count[idx_to] = new_count;
				if (start_skip == 0 && end_skip == 0) {
					for (i = 0; i < 8; ++/* Check if there are any other buffers and if the diff is
							 * equal in them. */i) {
						if (ModernizedCProgram.curtab.getTp_diffbuf()[i] != ((Object)0) && i != idx_from && i != idx_to && !dp.diff_equal_entry(idx_from, i)) {
							break;
						} 
					}
					if (i == 8) {
						dfree = /* delete the diff entry, the buffers are now equal here */dp;
						dp = generatedDf_next;
						if (dprev == ((Object)0)) {
							ModernizedCProgram.curtab.setTp_first_diff(dp);
						} else {
								dprev.setDf_next(dp);
						} 
					} 
				} 
				if (added != /* Adjust marks.  This will change the following entries! */0) {
					ModernizedCProgram.mark_adjust(lnum, lnum + count - 1, (long)LONG_MAX, (long)added);
					if (ModernizedCProgram.curwin.getW_cursor().getLnum() >= lnum) {
						if (ModernizedCProgram.curwin.getW_cursor().getLnum() >= lnum + /* Adjust the cursor position if it's in/after the changed
								     * lines. */count) {
							ModernizedCProgram.curwin.getW_cursor().getLnum() += added;
						}  else if (added < 0) {
							ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
						} 
					} 
				} 
				ModernizedCProgram.changed_lines(lnum, 0, lnum + count, (long)added);
				if (dfree != ((Object)0)) {
					dfree.diff_fold_update(/* Diff is deleted, update folds in other windows. */idx_to);
					ModernizedCProgram.vim_free(dfree);
				} else {
						generatedDf_count[idx_to] = /* mark_adjust() may have changed the count in a wrong way */new_count;
				} 
				if (idx_cur == /* When changing the current buffer, keep track of line numbers */idx_to) {
					off += added;
				} 
			} 
			if (dfree == ((Object)/* If before the range or not deleted, go to next diff. */0)) {
				dprev = dp;
				dp = generatedDf_next;
			} 
		}
		if (generatedCmdidx != /* restore curwin/curbuf and a few other things */CMD_index.CMD_diffget/* Syncing undo only works for the current buffer, but we change
			 * another buffer.  Sync undo if the command was typed.  This isn't
			 * 100% right when ":diffput" is used in a function or mapping. */) {
			if (ModernizedCProgram.KeyTyped) {
				ModernizedCProgram.u_sync(0);
			} 
			aco.aucmd_restbuf();
		} 
		if (ModernizedCProgram.diff_need_update) {
			((Object)0).ex_diffupdate();
		} 
		// position.  When there were filler lines the topline has become// invalid.// position.  When there were filler lines the topline has become// invalid.ModernizedCProgram.check_cursor();
		ModernizedCProgram.changed_line_abv_curs();
		if (ModernizedCProgram.diff_need_update) {
			ModernizedCProgram.diff_need_update = 0;
		} else {
				ModernizedCProgram.diff_redraw(0);
				curbuf/*
				 * Update folds for all diff buffers for entry "dp".
				 * Skip buffer with index "skip_idx".
				 * When there are no diffs, all folds are removed.
				 */.apply_autocmds(auto_event.EVENT_DIFFUPDATED, ((Object)0), ((Object)0), 0);
		} 
		// redraw already done by ex_diffupdate()
	}
	public void ex_let() {
		eap.ex_let_const(0/*
		 * ":const"			list all variable values
		 * ":const var1 var2"		list variable values
		 * ":const var = expr"		assignment command.
		 * ":const [var1, var2] = expr"	unpack list.
		 */);
	}
	public void ex_const() {
		eap.ex_let_const(1);
	}
	public void ex_let_const(int is_const) {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u expr = ((Object)0);
		typval_T rettv = new typval_T();
		int i;
		int var_count = 0;
		int semicolon = 0;
		char_u[] op = new char_u();
		char_u argend = new char_u();
		int first = 1;
		int concat;
		argend = ModernizedCProgram.skip_var_list(arg, var_count, semicolon);
		if (argend == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		// for var.='str'if (argend > arg && argend[-1] == (byte)'.') {
			--argend;
		} 
		expr = ModernizedCProgram.skipwhite(argend);
		Object generatedSc_version = current_sctx.getSc_version();
		concat = expr[0] == (byte)'.' && ((expr[1] == (byte)'=' && generatedSc_version < 2) || (expr[1] == (byte)'.' && expr[2] == (byte)'='));
		int generatedSkip = this.getSkip();
		listvar_S listvar_S = new listvar_S();
		Object generatedNextcmd = this.getNextcmd();
		if (expr != (byte)'=' && !((ModernizedCProgram.vim_strchr((char_u)"+-*/%", expr) != ((Object)0) && expr[1] == (byte)'=') || concat)) {
			if (arg == (byte)'[') {
				ModernizedCProgram.emsg(((byte)(e_invarg)));
			}  else if (expr[0] == (byte)'.') {
				ModernizedCProgram.emsg(((byte)("E985: .= is not supported with script version 2")));
			}  else if (!ModernizedCProgram.ends_excmd(arg)) {
				arg = eap.list_arg_vars(arg, first);
			}  else if (!generatedSkip) {
				ModernizedCProgram.list_glob_vars(first);
				ModernizedCProgram.list_buf_vars(first);
				ModernizedCProgram.list_win_vars(first);
				ModernizedCProgram.list_tab_vars(first);
				ModernizedCProgram.list_script_vars(first);
				ModernizedCProgram.list_func_vars(first);
				ModernizedCProgram.list_vim_vars(first);
			} 
			this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
		}  else if (expr[0] == (byte)'=' && expr[1] == (byte)'<' && expr[2] == (byte)'<') {
			list_T l = new list_T();
			ModernizedCProgram.l = listvar_S.heredoc_get(eap, expr + 3);
			if (ModernizedCProgram.l != ((Object)0)) {
				ModernizedCProgram.rettv_list_set(rettv, ModernizedCProgram.l);
				if (!generatedSkip) {
					op[0] = (byte)'=';
					op[1] = (byte)'\000';
					(Object)rettv.ex_let_vars(generatedArg, 0, semicolon, var_count, is_const, op);
				} 
				rettv.clear_tv();
			} 
		} else {
				op[0] = (byte)'=';
				op[1] = (byte)'\000';
				if (expr != (byte)'=') {
					if (ModernizedCProgram.vim_strchr((char_u)"+-*/%.", expr) != ((Object)0)) {
						op[0] = expr;
						if (expr[0] == (byte)'.' && expr[1] == (byte)'.') {
							++expr;
						} 
					} 
					expr = ModernizedCProgram.skipwhite(expr + 2);
				} else {
						expr = ModernizedCProgram.skipwhite(expr + 1);
				} 
				if (generatedSkip) {
					++emsg_skip;
				} 
				i = rettv.eval0(expr, generatedNextcmd, !generatedSkip);
				if (generatedSkip) {
					if (i != 0) {
						rettv.clear_tv();
					} 
					--emsg_skip;
				}  else if (i != 0) {
					(Object)rettv.ex_let_vars(generatedArg, 0, semicolon, var_count, is_const, op);
					rettv/*
					 * Assign the typevalue "tv" to the variable or variables at "arg_start".
					 * Handles both "var" with any type and "[var, var; var]" with a list type.
					 * When "op" is not NULL it points to a string with characters that
					 * must appear after the variable(s).  Use "+", "-" or "." for add, subtract
					 * or concatenate.
					 * Returns OK or FAIL;
					 */.clear_tv();
				} 
		} 
	}
	public Object list_arg_vars(Object arg, Integer first) {
		int error = 0;
		int len;
		char_u name = new char_u();
		char_u name_start = new char_u();
		char_u arg_subsc = new char_u();
		char_u tofree = new char_u();
		typval_T tv = new typval_T();
		int generatedSkip = this.getSkip();
		Object generatedV_type = tv.getV_type();
		while (!ModernizedCProgram.ends_excmd(arg) && !got_int) {
			if (error || generatedSkip) {
				arg = ModernizedCProgram.find_name_end(arg, ((Object)0), ((Object)0), 1 | 2);
				if (!((arg) == (byte)' ' || (arg) == (byte)'\t') && !ModernizedCProgram.ends_excmd(arg)) {
					emsg_severe = 1;
					ModernizedCProgram.emsg(((byte)(e_trailing)));
					break;
				} 
			} else {
					name_start = name = arg;
					len = ModernizedCProgram.get_name_len(arg, tofree, 1, 1);
					if (len <= 0) {
						if (len < 0 && !ModernizedCProgram.aborting()) {
							emsg_severe = 1;
							ModernizedCProgram.semsg(((byte)(e_invarg2)), arg);
							break;
						} 
						error = 1;
					} else {
							if (tofree != ((Object)0)) {
								name = tofree;
							} 
							if (ModernizedCProgram.get_var_tv(name, len, tv, ((Object)0), 1, 0) == 0) {
								error = 1;
							} else {
									arg_subsc = arg;
									if (tv.handle_subscript(arg, 1, 1, name, name) == 0) {
										error = 1;
									} else {
											if (arg == arg_subsc && len == 2 && name[1] == (byte)':') {
												switch (name) {
												case (byte)'l':
														ModernizedCProgram.list_func_vars(first);
														break;
												case (byte)'t':
														ModernizedCProgram.list_tab_vars(first);
														break;
												case (byte)'v':
														ModernizedCProgram.list_vim_vars(first);
														break;
												case (byte)'g':
														ModernizedCProgram.list_glob_vars(first);
														break;
												case (byte)'w':
														ModernizedCProgram.list_win_vars(first);
														break;
												case (byte)'s':
														ModernizedCProgram.list_script_vars(first);
														break;
												case (byte)'b':
														ModernizedCProgram.list_buf_vars(first);
														break;
												default:
														ModernizedCProgram.semsg(((byte)("E738: Can't list variables for %s")), name);
												}
											} else {
													char_u[] numbuf = new char_u();
													char_u tf = new char_u();
													int c;
													char_u s = new char_u();
													s = tv.echo_string(tf, numbuf, 0);
													c = arg;
													arg = (byte)'\000';
													ModernizedCProgram.list_one_var_a("", arg == arg_subsc ? name : name_start, generatedV_type, s == ((Object)0) ? (char_u)"" : s, first);
													arg = c;
													ModernizedCProgram.vim_free(tf);
											} 
											tv.clear_tv();
									} 
							} 
					} 
					ModernizedCProgram.vim_free(tofree);
			} 
			arg = ModernizedCProgram.skipwhite(arg);
		}
		return arg/*
		 * Set one item of ":let var = expr" or ":let [v1, v2] = list" to its value.
		 * Returns a pointer to the char just after the var name.
		 * Returns NULL if there is an error.
		 */;
	}
	public void ex_unlet() {
		Object[] generatedArg = this.getArg();
		eap.ex_unletlock(generatedArg, 0/*
		 * ":lockvar" and ":unlockvar" commands
		 */);
	}
	public void ex_lockvar() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int deep = 2;
		int generatedForceit = this.getForceit();
		if (generatedForceit) {
			deep = -1;
		}  else if (ModernizedCProgram.vim_isdigit(arg)) {
			deep = ModernizedCProgram.getdigits(arg);
			arg = ModernizedCProgram.skipwhite(arg);
		} 
		eap.ex_unletlock(arg, deep/*
		 * ":unlet", ":lockvar" and ":unlockvar" are quite similar.
		 */);
	}
	public void ex_unletlock(Object argstart, int deep) {
		char_u arg = argstart;
		char_u name_end = new char_u();
		int error = 0;
		lval_T lv = new lval_T();
		int generatedSkip = this.getSkip();
		Object[] generatedLl_name = lv.getLl_name();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedForceit = this.getForceit();
		do {
			if (arg == (byte)'$') {
				char_u name = ++arg;
				if (ModernizedCProgram.get_env_len(arg) == 0) {
					ModernizedCProgram.semsg(((byte)(e_invarg2)), name - 1);
					return /*Error: Unsupported expression*/;
				} 
				ModernizedCProgram.vim_unsetenv(name);
				arg = ModernizedCProgram.skipwhite(arg);
				continue;
			} 
			name_end = ModernizedCProgram.get_lval(arg, ((Object)0), lv, 1, generatedSkip || error, 0, 2);
			if (generatedLl_name == ((Object)0)) {
				error = 1;
			} 
			if (name_end == ((Object)0) || (!((name_end) == (byte)' ' || (name_end) == (byte)'\t') && !ModernizedCProgram.ends_excmd(name_end))) {
				if (name_end != ((Object)0)) {
					emsg_severe = 1;
					ModernizedCProgram.emsg(((byte)(e_trailing)));
				} 
				if (!(generatedSkip || error)) {
					lv.clear_lval();
				} 
				break;
			} 
			if (!error && !generatedSkip) {
				if (generatedCmdidx == CMD_index.CMD_unlet) {
					if (lv.do_unlet_var(name_end, generatedForceit) == 0) {
						error = 1;
					} 
				} else {
						if (lv.do_lock_var(name_end, deep, generatedCmdidx == CMD_index.CMD_lockvar) == 0) {
							error = 1;
						} 
				} 
			} 
			if (!generatedSkip) {
				lv.clear_lval();
			} 
			arg = ModernizedCProgram.skipwhite(name_end);
		} while (!ModernizedCProgram.ends_excmd(arg));
		this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
	}
	public Object set_cmdarg(Object oldarg) {
		char_u oldval = new char_u();
		char_u newval = new char_u();
		int len;
		oldval = vimvars[21].getVv_di().getDi_tv().getVval().getV_string();
		if (eap == ((Object)0)) {
			ModernizedCProgram.vim_free(oldval);
			vimvars[21].getVv_di().getDi_tv().getVval().setV_string(oldarg);
			return ((Object)0);
		} 
		int generatedForce_bin = this.getForce_bin();
		if (generatedForce_bin == 1) {
			len = 6;
		}  else if (generatedForce_bin == 2) {
			len = 8;
		} else {
				len = 0;
		} 
		int generatedRead_edit = this.getRead_edit();
		if (generatedRead_edit) {
			len += 7;
		} 
		int generatedForce_ff = this.getForce_ff();
		if (generatedForce_ff != 0) {
			len += 10;
		} 
		int generatedForce_enc = this.getForce_enc();
		Object[] generatedCmd = this.getCmd();
		if (generatedForce_enc != 0) {
			len += (int)/*Error: Function owner not recognized*/strlen((byte)(generatedCmd + generatedForce_enc)) + 7;
		} 
		int generatedBad_char = this.getBad_char();
		if (generatedBad_char != 0) {
			len += 7 + 4;
		} 
		newval = ModernizedCProgram.alloc(len + 1);
		if (newval == ((Object)0)) {
			return ((Object)0);
		} 
		if (generatedForce_bin == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)newval, " ++bin");
		}  else if (generatedForce_bin == 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)newval, " ++nobin");
		} else {
				newval = (byte)'\000';
		} 
		if (generatedRead_edit) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(newval), (byte)(" ++edit"));
		} 
		if (generatedForce_ff != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)newval + /*Error: Function owner not recognized*/strlen((byte)(newval)), " ++ff=%s", generatedForce_ff == (byte)'u' ? "unix" : generatedForce_ff == (byte)'d' ? "dos" : "mac");
		} 
		if (generatedForce_enc != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)newval + /*Error: Function owner not recognized*/strlen((byte)(newval)), " ++enc=%s", generatedCmd + generatedForce_enc);
		} 
		if (generatedBad_char == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(newval + /*Error: Function owner not recognized*/strlen((byte)(newval))), (byte)(" ++bad=keep"));
		}  else if (generatedBad_char == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(newval + /*Error: Function owner not recognized*/strlen((byte)(newval))), (byte)(" ++bad=drop"));
		}  else if (generatedBad_char != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)newval + /*Error: Function owner not recognized*/strlen((byte)(newval)), " ++bad=%c", generatedBad_char);
		} 
		vimvars[21].getVv_di().getDi_tv().getVval().setV_string(newval);
		return oldval/*
		 * Get the value of internal variable "name".
		 * Return OK or FAIL.  If OK is returned "rettv" must be cleared.
		 */;
	}
	public void ex_messages() {
		msg_hist p = new msg_hist();
		char_u s = new char_u();
		int c = 0;
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("clear")) == 0) {
			int keep = generatedAddr_count == 0 ? 0 : generatedLine2;
			while (ModernizedCProgram.msg_hist_len > keep) {
				(Object)ModernizedCProgram.delete_first_msg();
			}
			return /*Error: Unsupported expression*/;
		} 
		if (generatedArg != (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
			return /*Error: Unsupported expression*/;
		} 
		msg_hist_off = 1;
		p = ModernizedCProgram.first_msg_hist;
		msg_hist generatedNext = p.getNext();
		if (generatedAddr_count != 0) {
			for (; p != ((Object)0) && !got_int; p = generatedNext) {
				c++;
			}
			c -= generatedLine2;
			for (p = ModernizedCProgram.first_msg_hist; p != ((Object)0) && !got_int && c > /* Skip without number of messages specified */0; ) {
				;
			}
		} 
		if (p == ModernizedCProgram.first_msg_hist) {
			s = (char_u)/*Error: Function owner not recognized*/getenv((byte)((char_u)"LANG"));
			if (s != ((Object)0) && s != (byte)'\000') {
				ModernizedCProgram.msg_attr(((byte)("Messages maintainer: Bram Moolenaar <Bram@vim.org>")), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
			} 
		} 
		Object generatedMsg = p.getMsg();
		int generatedAttr = p.getAttr();
		for (; p != ((Object)0) && !got_int; p = generatedNext) {
			if (generatedMsg != ((Object)0)) {
				ModernizedCProgram.msg_attr((byte)generatedMsg, generatedAttr);
			} 
		}
		msg_hist_off = 0/*
		 * Call this after prompting the user.  This will avoid a hit-return message
		 * and a delay.
		 */;
	}
	public int parse_command_modifiers(Byte errormsg, int skip_only) {
		char_u p = new char_u();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((ModernizedCProgram.cmdmod), (false), (/*Error: sizeof expression not supported yet*/));
		this.setVerbose_save(-1);
		this.setSave_msg_silent(-1);
		Object[] generatedCmd = this.getCmd();
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		regprog regprog = new regprog();
		Object generatedDid_sandbox = this.getDid_sandbox();
		int generatedSave_msg_silent = this.getSave_msg_silent();
		int generatedDid_esilent = this.getDid_esilent();
		int generatedSkip = this.getSkip();
		long generatedVerbose_save = this.getVerbose_save();
		// Repeat until no more command modifiers are found.for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			while (generatedCmd == (byte)' ' || generatedCmd == (byte)'\t' || generatedCmd == (byte)':') {
				++generatedCmd;
			}
			if (generatedCmd == (byte)'\000' && /* in ex mode, an empty line works like :+ */exmode_active && (ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getexmodeline) || ModernizedCProgram.getline_equal(generatedGetline, generatedCookie, getexline)) && ModernizedCProgram.curwin.getW_cursor().getLnum() < generatedMl_line_count) {
				this.setCmd((char_u)"+");
				if (!skip_only) {
					ModernizedCProgram.ex_pressedreturn = 1;
				} 
			} 
			if (generatedCmd == /* ignore comment and empty lines */(byte)'"') {
				return 0;
			} 
			if (generatedCmd == (byte)'\000') {
				if (!skip_only) {
					ModernizedCProgram.ex_pressedreturn = 1;
				} 
				return 0;
			} 
			p = ModernizedCProgram.skip_range(generatedCmd, ((Object)0));
			switch (p) {
			case (byte)'b':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "belowright", 3)) {
						ModernizedCProgram.cmdmod.getSplit() |=  32;
						continue;
					} 
					if (ModernizedCProgram.checkforcmd(generatedCmd, "browse", 3)) {
						ModernizedCProgram.cmdmod.setBrowse(1);
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "botright", 2)) {
						break;
					} 
					ModernizedCProgram.cmdmod.getSplit() |=  8;
					continue;
			case (byte)'t':
					if (ModernizedCProgram.checkforcmd(p, "tab", 3)) {
						if (!skip_only) {
							long tabnr = eap.get_address(generatedCmd, .ADDR_TABS, generatedSkip, skip_only, 0, 1);
							if (tabnr == LONG_MAX) {
								ModernizedCProgram.cmdmod.setTab(ModernizedCProgram.curtab.tabpage_index() + 1);
							} else {
									if (tabnr < 0 || tabnr > ((Object)0).current_tab_nr()) {
										errormsg = ((byte)(e_invrange));
										return 0;
									} 
									ModernizedCProgram.cmdmod.setTab(tabnr + 1);
							} 
						} 
						this.setCmd(p);
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "topleft", 2)) {
						break;
					} 
					ModernizedCProgram.cmdmod.getSplit() |=  4;
					continue;
			case /* only accept ":filter {pat} cmd" */(byte)'f':
					{ 
						char_u reg_pat = new char_u();
						if (!ModernizedCProgram.checkforcmd(p, "filter", 4) || p == (byte)'\000' || ModernizedCProgram.ends_excmd(p)) {
							break;
						} 
						if (p == (byte)'!') {
							ModernizedCProgram.cmdmod.setFilter_force(1);
							p = ModernizedCProgram.skipwhite(p + 1);
							if (p == (byte)'\000' || ModernizedCProgram.ends_excmd(p)) {
								break;
							} 
						} 
						if (skip_only) {
							p = ModernizedCProgram.skip_vimgrep_pat(p, ((Object)0), ((Object)0));
						} else {
								p = ModernizedCProgram.skip_vimgrep_pat(p, reg_pat, ((Object)0));
						} 
						if (p == ((Object)0) || p == (byte)'\000') {
							break;
						} 
						if (!skip_only) {
							ModernizedCProgram.cmdmod.getFilter_regmatch().setRegprog(regprog.vim_regcomp(reg_pat, 1));
							if (ModernizedCProgram.cmdmod.getFilter_regmatch().getRegprog() == ((Object)0)) {
								break;
							} 
						} 
						this.setCmd(p);
						continue;
					}
			case (byte)'h':
					if (p != generatedCmd || !ModernizedCProgram.checkforcmd(p, "hide", /* ":hide" and ":hide | cmd" are not modifiers */3) || p == (byte)'\000' || ModernizedCProgram.ends_excmd(p)) {
						break;
					} 
					this.setCmd(p);
					ModernizedCProgram.cmdmod.setHide(1);
					continue;
			case (byte)'n':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "noautocmd", 3)) {
						if (ModernizedCProgram.cmdmod.getSave_ei() == ((Object)0) && !skip_only) {
							ModernizedCProgram.cmdmod.setSave_ei(ModernizedCProgram.vim_strsave(/* Set 'eventignore' to "all". Restore the
											 * existing option value later. */ModernizedCProgram.p_ei));
							ModernizedCProgram.set_string_option_direct((char_u)"ei", -1, (char_u)"all", 1, -6);
						} 
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "noswapfile", 3)) {
						break;
					} 
					ModernizedCProgram.cmdmod.setNoswapfile(1);
					continue;
			case (byte)'c':
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "confirm", 4)) {
						break;
					} 
					ModernizedCProgram.cmdmod.setConfirm(1);
					continue;
			case (byte)'u':
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "unsilent", 3)) {
						break;
					} 
					if (!skip_only) {
						if (generatedSave_msg_silent == -1) {
							this.setSave_msg_silent(msg_silent);
						} 
						msg_silent = 0;
					} 
					continue;
			case (byte)'k':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "keepmarks", 3)) {
						ModernizedCProgram.cmdmod.setKeepmarks(1);
						continue;
					} 
					if (ModernizedCProgram.checkforcmd(generatedCmd, "keepalt", 5)) {
						ModernizedCProgram.cmdmod.setKeepalt(1);
						continue;
					} 
					if (ModernizedCProgram.checkforcmd(generatedCmd, "keeppatterns", 5)) {
						ModernizedCProgram.cmdmod.setKeeppatterns(1);
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "keepjumps", 5)) {
						break;
					} 
					ModernizedCProgram.cmdmod.setKeepjumps(1);
					continue;
			case (byte)'v':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "vertical", 4)) {
						ModernizedCProgram.cmdmod.getSplit() |=  2;
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(p, "verbose", 4)) {
						break;
					} 
					if (!skip_only) {
						if (generatedVerbose_save < 0) {
							this.setVerbose_save(ModernizedCProgram.p_verbose);
						} 
						if (ModernizedCProgram.vim_isdigit(generatedCmd)) {
							ModernizedCProgram.p_verbose = /*Error: Function owner not recognized*/atoi((byte)generatedCmd);
						} else {
								ModernizedCProgram.p_verbose = 1;
						} 
					} 
					this.setCmd(p);
					continue;
			case (byte)'r':
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "rightbelow", 6)) {
						break;
					} 
					ModernizedCProgram.cmdmod.getSplit() |=  32;
					continue;
			case (byte)'s':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "sandbox", 3)) {
						if (!skip_only) {
							if (!generatedDid_sandbox) {
								++sandbox;
							} 
							this.setDid_sandbox(1);
						} 
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "silent", 3)) {
						break;
					} 
					if (!skip_only) {
						if (generatedSave_msg_silent == -1) {
							this.setSave_msg_silent(msg_silent);
						} 
						++msg_silent;
					} 
					if (generatedCmd == (byte)'!' && !((generatedCmd[-1]) == (byte)' ' || (generatedCmd[-1]) == (byte)'\t')) {
						this.setCmd(ModernizedCProgram.skipwhite(generatedCmd + /* ":silent!", but not "silent !cmd" */1));
						if (!skip_only) {
							++emsg_silent;
							++generatedDid_esilent;
						} 
					} 
					continue;
			case (byte)'l':
					if (ModernizedCProgram.checkforcmd(generatedCmd, "lockmarks", 3)) {
						ModernizedCProgram.cmdmod.setLockmarks(1);
						continue;
					} 
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "leftabove", 5)) {
						break;
					} 
					ModernizedCProgram.cmdmod.getSplit() |=  64;
					continue;
			case (byte)'a':
					if (!ModernizedCProgram.checkforcmd(generatedCmd, "aboveleft", /* When adding an entry, also modify cmd_exists(). */3)) {
						break;
					} 
					ModernizedCProgram.cmdmod.getSplit() |=  64;
					continue;
			}
			break;
		}
		return 1/*
		 * Free contents of "cmdmod".
		 */;
	}
	public int parse_cmd_address(Byte errormsg, int silent) {
		int address_count = 1;
		linenr_T lnum = new linenr_T();
		Object generatedLine2 = this.getLine2();
		int generatedB_fnum = curbuf.getB_fnum();
		 generatedAddr_type = this.getAddr_type();
		Object[] generatedCmd = this.getCmd();
		int generatedSkip = this.getSkip();
		int generatedAddr_count = this.getAddr_count();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		file_buffer generatedB_next = buf.getB_next();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_prev = buf.getB_prev();
		CMD_index generatedCmdidx = this.getCmdidx();
		Object generatedLnum = fp.getLnum();
		// Repeat for all ',' or ';' separated addresses.for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			this.setLine1(generatedLine2);
			switch (generatedAddr_type) {
			case .ADDR_LINES:
			case .ADDR_BUFFERS:
					this.setLine2(generatedB_fnum);
					break;
			case .ADDR_QUICKFIX_VALID:
					this.setLine2(eap.qf_get_cur_valid_idx());
					break;
			case .ADDR_NONE:
					break;
			case .ADDR_TABS_RELATIVE:
			case .ADDR_OTHER:
					this.setLine2(ModernizedCProgram.curwin.getW_cursor().getLnum());
					break;
			case .ADDR_ARGUMENTS:
					this.setLine2(ModernizedCProgram.curwin.getW_arg_idx() + 1);
					if (generatedLine2 > ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
						this.setLine2(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()));
					} 
					break;
			case .ADDR_LOADED_BUFFERS:
			case .ADDR_UNSIGNED:
					this.setLine2(1);
					break;
			case .ADDR_WINDOWS:
					this.setLine2(ModernizedCProgram.curwin.current_win_nr());
					break;
			case .ADDR_TABS:
					this.setLine2(ModernizedCProgram.curtab.current_tab_nr());
					break;
			case .ADDR_QUICKFIX:
					this.setLine2(eap.qf_get_cur_idx());
					break;
			}
			this.setCmd(ModernizedCProgram.skipwhite(generatedCmd));
			lnum = eap.get_address(generatedCmd, generatedAddr_type, generatedSkip, silent, generatedAddr_count == 0, address_count++);
			if (generatedCmd == ((Object)0)) {
				return 0;
			} 
			if (lnum == LONG_MAX) {
				if (generatedCmd == (byte)'%') {
					++generatedCmd;
					switch (generatedAddr_type) {
					case .ADDR_LINES:
					case .ADDR_OTHER:
							this.setLine1(1);
							this.setLine2(generatedMl_line_count);
							break;
					case .ADDR_UNSIGNED:
					case .ADDR_QUICKFIX_VALID:
							this.setLine1(1);
							this.setLine2(eap.qf_get_valid_size());
							if (generatedLine2 == 0) {
								this.setLine2(1);
							} 
							break;
					case .ADDR_NONE:
							break;
					case .ADDR_BUFFERS:
							this.setLine1(generatedB_fnum);
							this.setLine2(generatedB_fnum);
							break;
					case .ADDR_TABS:
							if (((int)(generatedCmdidx) < 0)) {
								this.setLine1(1);
								this.setLine2(generatedAddr_type == .ADDR_WINDOWS ? ((Object)0).current_win_nr() : ((Object)0).current_tab_nr());
							} else {
									errormsg = ((byte)(e_invrange));
									return 0;
							} 
							break;
					case .ADDR_QUICKFIX:
							errormsg = ((byte)(e_invrange));
							return 0;
					case .ADDR_TABS_RELATIVE:
					case .ADDR_ARGUMENTS:
							if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) == 0) {
								this.setLine1(this.setLine2(0));
							} else {
									this.setLine1(1);
									this.setLine2(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()));
							} 
							break;
					case .ADDR_LOADED_BUFFERS:
							{ 
								buf_T buf = firstbuf;
								while (generatedB_next != ((Object)0) && generatedMl_mfp == ((Object)0)) {
									buf = generatedB_next;
								}
								this.setLine1(generatedB_fnum);
								buf = lastbuf;
								while (generatedB_prev != ((Object)0) && generatedMl_mfp == ((Object)0)) {
									buf = generatedB_prev;
								}
								this.setLine2(generatedB_fnum);
								break;
							}
					case .ADDR_WINDOWS:
					}
					++generatedAddr_count;
				}  else if (generatedCmd == (byte)'*' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'*') == ((Object)0)) {
					pos_T fp = new pos_T();
					if (generatedAddr_type != .ADDR_LINES) {
						errormsg = ((byte)(e_invrange));
						return 0;
					} 
					++generatedCmd;
					if (!generatedSkip) {
						fp = ModernizedCProgram.getmark((byte)'<', 0);
						if (fp.check_mark() == 0) {
							return 0;
						} 
						this.setLine1(generatedLnum);
						fp = ModernizedCProgram.getmark((byte)'>', 0);
						if (fp.check_mark() == 0) {
							return 0;
						} 
						this.setLine2(generatedLnum);
						++generatedAddr_count;
					} 
				} 
			} else {
					this.setLine2(lnum);
			} 
			generatedAddr_count++;
			if (generatedCmd == (byte)';') {
				if (!generatedSkip) {
					ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
					ModernizedCProgram.check_cursor();
				} 
			}  else if (generatedCmd != (byte)',') {
				break;
			} 
			++generatedCmd;
		}
		// One address given: set start and end lines.if (generatedAddr_count == 1) {
			this.setLine1(generatedLine2);
			if (lnum == LONG_MAX) {
				this.setAddr_count(0);
			} 
		} 
		return 1/*
		 * Check for an Ex command with optional tail.
		 * If there is a match advance "pp" to the argument and return TRUE.
		 */;
	}
	public Object get_address(Object ptr,  addr_type_arg, int skip, int silent, int to_other_file, int address_count) {
		// no errors or side effects// flag: may jump to other file// 1 for first address, >1 after commacmd_addr_T addr_type = addr_type_arg;
		int c;
		int i;
		long n;
		char_u cmd = new char_u();
		pos_T pos = new pos_T();
		pos_T fp = new pos_T();
		linenr_T lnum = new linenr_T();
		buf_T buf = new buf_T();
		cmd = ModernizedCProgram.skipwhite(ptr);
		lnum = LONG_MAX;
		int generatedB_fnum = curbuf.getB_fnum();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_prev = buf.getB_prev();
		Object generatedLnum = fp.getLnum();
		do {
			switch (cmd) {
			case /* '.' - Cursor position */(byte)'.':
					++cmd;
					switch (addr_type) {
					case .ADDR_QUICKFIX:
							lnum = eap.qf_get_cur_idx();
							break;
					case .ADDR_WINDOWS:
							lnum = ModernizedCProgram.curwin.current_win_nr();
							break;
					case .ADDR_LOADED_BUFFERS:
					case .ADDR_ARGUMENTS:
							lnum = ModernizedCProgram.curwin.getW_arg_idx() + 1;
							break;
					case .ADDR_TABS:
							lnum = ModernizedCProgram.curtab.current_tab_nr();
							break;
					case .ADDR_BUFFERS:
							lnum = generatedB_fnum;
							break;
					case .ADDR_NONE:
					case .ADDR_QUICKFIX_VALID:
							lnum = eap.qf_get_cur_valid_idx();
							break;
					case .ADDR_TABS_RELATIVE:
					case .ADDR_LINES:
					case .ADDR_OTHER:
							lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
							break;
					case .ADDR_UNSIGNED:
							ModernizedCProgram.addr_error(addr_type);
							cmd = ((Object)0);
							;
							break;
					}
					break;
			case (byte)'/':
			case /* '$' - last line */(byte)'$':
					++cmd;
					switch (addr_type) {
					case .ADDR_BUFFERS:
							lnum = generatedB_fnum;
							break;
					case .ADDR_TABS:
							lnum = ((Object)0).current_tab_nr();
							break;
					case .ADDR_NONE:
					case .ADDR_LOADED_BUFFERS:
							buf = lastbuf;
							while (generatedMl_mfp == ((Object)0)) {
								if (generatedB_prev == ((Object)0)) {
									break;
								} 
								buf = generatedB_prev;
							}
							lnum = generatedB_fnum;
							break;
					case .ADDR_UNSIGNED:
							ModernizedCProgram.addr_error(addr_type);
							cmd = ((Object)0);
							;
							break;
					case .ADDR_QUICKFIX:
							lnum = eap.qf_get_size();
							if (lnum == 0) {
								lnum = 1;
							} 
							break;
					case .ADDR_WINDOWS:
							lnum = ((Object)0).current_win_nr();
							break;
					case .ADDR_ARGUMENTS:
							lnum = ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len());
							break;
					case .ADDR_LINES:
					case .ADDR_OTHER:
							lnum = generatedMl_line_count;
							break;
					case .ADDR_TABS_RELATIVE:
					case .ADDR_QUICKFIX_VALID:
							lnum = eap.qf_get_valid_size();
							if (lnum == 0) {
								lnum = 1;
							} 
							break;
					}
					break;
			case /* ''' - mark */(byte)'\'':
					if (++cmd == (byte)'\000') {
						cmd = ((Object)0);
						;
					} 
					if (addr_type != .ADDR_LINES) {
						ModernizedCProgram.addr_error(addr_type);
						cmd = ((Object)0);
						;
					} 
					if (skip) {
						++cmd;
					} else {
							fp = ModernizedCProgram.getmark(cmd, to_other_file && cmd[1] == /* Only accept a mark in another file when it is
									     * used by itself: ":'M". */(byte)'\000');
							++cmd;
							if (fp == (pos_T)-1) {
								lnum = ModernizedCProgram.curwin.getW_cursor().getLnum();
							} else {
									if (fp.check_mark() == 0) {
										cmd = ((Object)0);
										;
									} 
									lnum = generatedLnum;
							} 
					} 
					break;
			case /* "\?", "\/" or "\&", repeat search */(byte)'\\':
					++cmd;
					if (addr_type != .ADDR_LINES) {
						ModernizedCProgram.addr_error(addr_type);
						cmd = ((Object)0);
						;
					} 
					if (cmd == (byte)'&') {
						i = 1;
					}  else if (cmd == (byte)'?' || cmd == (byte)'/') {
						i = 0;
					} else {
							ModernizedCProgram.emsg(((byte)(e_backslash)));
							cmd = ((Object)0);
							;
					} 
					if (!skip/*
							     * When search follows another address, start from
							     * there.
							     */) {
						if (lnum != LONG_MAX) {
							pos.setLnum(lnum);
						} else {
								pos.setLnum(generatedLnum);
						} 
						if (cmd != (byte)'?') {
							pos.setCol(INT_MAX);
						} else {
								pos.setCol(0);
						} 
						pos.setColadd(0);
						if (ModernizedCProgram.searchit(ModernizedCProgram.curwin, curbuf, pos, ((Object)0), cmd == (byte)'?' ? (true) : 1, (char_u)"", -1024, -1024, i, ((Object)0)) != 0) {
							lnum = generatedLnum;
						} else {
								cmd = ((Object)0);
								;
						} 
					} 
					++cmd;
					break;
			case /* '/' or '?' - search */(byte)'?':
					c = cmd++;
					if (addr_type != .ADDR_LINES) {
						ModernizedCProgram.addr_error(addr_type);
						cmd = ((Object)0);
						;
					} 
					if (/* skip "/pat/" */skip) {
						cmd = ModernizedCProgram.skip_regexp(cmd, c, (int)ModernizedCProgram.p_magic, ((Object)0));
						if (cmd == c) {
							++cmd;
						} 
					} else {
							int flags;
							pos = ModernizedCProgram.curwin.getW_cursor();
							if (lnum != LONG_MAX) {
								ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
							} 
							if (c == (byte)'/' && generatedLnum > 0) {
								ModernizedCProgram.curwin.getW_cursor().setCol(INT_MAX);
							} else {
									ModernizedCProgram.curwin.getW_cursor().setCol(0);
							} 
							ModernizedCProgram.searchcmdlen = 0;
							flags = silent ? 0 : -1024 | -1024;
							if (!ModernizedCProgram.do_search(((Object)0), c, cmd, -1024, flags, ((Object)0))) {
								ModernizedCProgram.curwin.setW_cursor(pos);
								cmd = ((Object)0);
								;
							} 
							lnum = generatedLnum;
							ModernizedCProgram.curwin.setW_cursor(pos);
							cmd += /* adjust command string pointer */ModernizedCProgram.searchcmdlen;
					} 
					break;
			default:
					if (((int)(cmd) - (byte)'0' < /* absolute line number */10)) {
						lnum = ModernizedCProgram.getdigits(cmd);
					} 
			}
			for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
				cmd = ModernizedCProgram.skipwhite(cmd);
				if (cmd != (byte)'-' && cmd != (byte)'+' && !((int)(cmd) - (byte)'0' < 10)) {
					break;
				} 
				if (lnum == LONG_MAX) {
					switch (addr_type) {
					case .ADDR_LINES:
					case .ADDR_TABS_RELATIVE:
							lnum = 1;
							break;
					case .ADDR_ARGUMENTS:
							lnum = ModernizedCProgram.curwin.getW_arg_idx() + 1;
							break;
					case .ADDR_QUICKFIX_VALID:
							lnum = eap.qf_get_cur_valid_idx();
							break;
					case .ADDR_UNSIGNED:
							lnum = 0;
							break;
					case .ADDR_TABS:
							lnum = ModernizedCProgram.curtab.current_tab_nr();
							break;
					case .ADDR_QUICKFIX:
							lnum = eap.qf_get_cur_idx();
							break;
					case .ADDR_OTHER:
							lnum = generatedLnum;
							break;
					case .ADDR_WINDOWS:
							lnum = ModernizedCProgram.curwin.current_win_nr();
							break;
					case .ADDR_LOADED_BUFFERS:
					case .ADDR_BUFFERS:
							lnum = generatedB_fnum;
							break;
					case .ADDR_NONE:
					}
				} 
				if (((int)(cmd) - (byte)'0' < 10)) {
					i = /* "number" is same as "+number" */(byte)'+';
				} else {
						i = cmd++;
				} 
				if (!((int)(cmd) - (byte)'0' < /* '+' is '+1', but '+0' is not '+1' */10)) {
					n = 1;
				} else {
						n = ModernizedCProgram.getdigits(cmd);
				} 
				if (addr_type == .ADDR_TABS_RELATIVE) {
					ModernizedCProgram.emsg(((byte)(e_invrange)));
					cmd = ((Object)0);
					;
				}  else if (addr_type == .ADDR_LOADED_BUFFERS || addr_type == .ADDR_BUFFERS) {
					lnum = ModernizedCProgram.compute_buffer_local_count(addr_type, lnum, (i == (byte)'-') ? -1 * n : n);
				} else {
						if (addr_type == .ADDR_LINES && (i == (byte)'-' || i == /* Relative line addressing, need to adjust for folded lines
								 * now, but only do it after the first address. */(byte)'+') && address_count >= 2) {
							(Object)ModernizedCProgram.hasFolding(lnum, ((Object)0), lnum);
						} 
						if (i == (byte)'-') {
							lnum -= n;
						} else {
								lnum += n;
						} 
				} 
			}
		} while (cmd == (byte)'/' || cmd == (byte)'?');
		return lnum/*
		 * Get flags from an Ex command argument.
		 */;
	}
	// only skip the address, don't use it
	public void get_flags() {
		Object[] generatedArg = this.getArg();
		int generatedFlags = this.getFlags();
		while (ModernizedCProgram.vim_strchr((char_u)"lp#", generatedArg) != ((Object)0)) {
			if (generatedArg == (byte)'l') {
				generatedFlags |=  -1024;
			}  else if (generatedArg == (byte)'p') {
				generatedFlags |=  -1024;
			} else {
					generatedFlags |=  -1024;
			} 
			this.setArg(ModernizedCProgram.skipwhite(generatedArg + 1/*
			 * Function called for command which is Not Implemented.  NI!
			 */));
		}
	}
	public void ex_ni() {
		int generatedSkip = this.getSkip();
		if (!generatedSkip) {
			this.setErrmsg("E319: Sorry, the command is not available in this version"/*
			 * Function called for script command which is Not Implemented.  NI!
			 * Skips over ":perl <<EOF" constructs.
			 */);
		} 
	}
	public void ex_script_ni() {
		int generatedSkip = this.getSkip();
		Object[] generatedArg = this.getArg();
		if (!generatedSkip) {
			eap.ex_ni();
		} else {
				ModernizedCProgram.vim_free(eap.script_get(generatedArg));
		} 
	}
	public Byte invalid_range() {
		buf_T buf = new buf_T();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (generatedLine1 < 0 || generatedLine2 < 0 || generatedLine1 > generatedLine2) {
			return ((byte)(e_invrange));
		} 
		long generatedArgt = this.getArgt();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		CMD_index generatedCmdidx = this.getCmdidx();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_next = buf.getB_next();
		int generatedB_fnum = buf.getB_fnum();
		file_buffer generatedB_prev = buf.getB_prev();
		 generatedAddr_type = this.getAddr_type();
		if (generatedArgt & -1024) {
			switch (generatedAddr_type) {
			case .ADDR_WINDOWS:
					if (generatedLine2 > ((Object)0).current_win_nr()) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_LINES:
					if (generatedLine2 > generatedMl_line_count + (generatedCmdidx == CMD_index.CMD_diffget)) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_TABS_RELATIVE:
			case .ADDR_ARGUMENTS:
					if (generatedLine2 > ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) + (!((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()))) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_OTHER:
					break;
			case .ADDR_UNSIGNED:
					if (generatedLine2 < 0) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_QUICKFIX:
					if (generatedLine2 <= 0) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_LOADED_BUFFERS:
					buf = firstbuf;
					while (generatedMl_mfp == ((Object)0)) {
						if (generatedB_next == ((Object)0)) {
							return ((byte)(e_invrange));
						} 
						buf = generatedB_next;
					}
					if (generatedLine1 < generatedB_fnum) {
						return ((byte)(e_invrange));
					} 
					buf = lastbuf;
					while (generatedMl_mfp == ((Object)0)) {
						if (generatedB_prev == ((Object)0)) {
							return ((byte)(e_invrange));
						} 
						buf = generatedB_prev;
					}
					if (generatedLine2 > generatedB_fnum) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_QUICKFIX_VALID:
					if ((generatedLine2 != 1 && generatedLine2 > eap.qf_get_valid_size()) || generatedLine2 < 0) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_BUFFERS:
					if (generatedLine1 < 1 || generatedLine2 > ModernizedCProgram.get_highest_fnum()) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_TABS:
					if (generatedLine2 > ((Object)0).current_tab_nr()) {
						return ((byte)(e_invrange));
					} 
					break;
			case .ADDR_NONE:
					break;
			}
		} 
		return ((Object)0/*
		 * Correct the range for zero line number, if required.
		 */);
	}
	public void correct_range() {
		long generatedArgt = this.getArgt();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		// zero in range not allowedif (!(generatedArgt & -1024)) {
			if (generatedLine1 == 0) {
				this.setLine1(1);
			} 
			if (generatedLine2 == 0) {
				this.setLine2(1/*
				 * For a ":vimgrep" or ":vimgrepadd" command return a pointer past the
				 * pattern.  Otherwise return eap->arg.
				 */);
			} 
		} 
	}
	public Object skip_grep_pat() {
		Object[] generatedArg = this.getArg();
		char_u p = generatedArg;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (p != (byte)'\000' && (generatedCmdidx == CMD_index.CMD_vimgrep || generatedCmdidx == CMD_index.CMD_lvimgrep || generatedCmdidx == CMD_index.CMD_vimgrepadd || generatedCmdidx == CMD_index.CMD_lvimgrepadd || ModernizedCProgram.grep_internal(generatedCmdidx))) {
			p = ModernizedCProgram.skip_vimgrep_pat(p, ((Object)0), ((Object)0));
			if (p == ((Object)0)) {
				p = generatedArg;
			} 
		} 
		return p/*
		 * For the ":make" and ":grep" commands insert the 'makeprg'/'grepprg' option
		 * in the command line, so that things like % get expanded.
		 */;
	}
	public Object replace_makeprg(Object p, Object cmdlinep) {
		char_u new_cmdline = new char_u();
		char_u program = new char_u();
		char_u pos = new char_u();
		char_u ptr = new char_u();
		int len;
		int i;
		/*
		     * Don't do it when ":vimgrep" is used for ":grep".
		     */
		CMD_index generatedCmdidx = this.getCmdidx();
		Object generatedB_p_gp = curbuf.getB_p_gp();
		Object generatedB_p_mp = curbuf.getB_p_mp();
		if ((generatedCmdidx == CMD_index.CMD_make || generatedCmdidx == CMD_index.CMD_lmake || generatedCmdidx == CMD_index.CMD_grep || generatedCmdidx == CMD_index.CMD_lgrep || generatedCmdidx == CMD_index.CMD_grepadd || generatedCmdidx == CMD_index.CMD_lgrepadd) && !ModernizedCProgram.grep_internal(generatedCmdidx)) {
			if (generatedCmdidx == CMD_index.CMD_grep || generatedCmdidx == CMD_index.CMD_lgrep || generatedCmdidx == CMD_index.CMD_grepadd || generatedCmdidx == CMD_index.CMD_lgrepadd) {
				if (generatedB_p_gp == (byte)'\000') {
					program = p_gp;
				} else {
						program = generatedB_p_gp;
				} 
			} else {
					if (generatedB_p_mp == (byte)'\000') {
						program = p_mp;
					} else {
							program = generatedB_p_mp;
					} 
			} 
			p = ModernizedCProgram.skipwhite(p);
			if ((pos = (char_u)/*Error: Function owner not recognized*/strstr((byte)program, "$*")) != ((Object)0)) {
				i = /* replace $* by given arguments */1;
				while ((pos = (char_u)/*Error: Function owner not recognized*/strstr((byte)pos + 2, "$*")) != ((Object)0)) {
					++i;
				}
				len = (int)/*Error: Function owner not recognized*/strlen((byte)(p));
				new_cmdline = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(program)) + i * (len - 2) + 1);
				if (new_cmdline == ((Object)0)) {
					return ((Object)/* out of memory */0);
				} 
				ptr = new_cmdline;
				while ((pos = (char_u)/*Error: Function owner not recognized*/strstr((byte)program, "$*")) != ((Object)0)) {
					i = (int)(pos - program);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy((byte)(ptr), (byte)(program), (size_t)(i));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ptr += i), (byte)(p));
					ptr += len;
					program = pos + 2;
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ptr), (byte)(program));
			} else {
					new_cmdline = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(program)) + /*Error: Function owner not recognized*/strlen((byte)(p)) + 2);
					if (new_cmdline == ((Object)0)) {
						return ((Object)/* out of memory */0);
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(new_cmdline), (byte)(program));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(new_cmdline), (byte)(" "));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(new_cmdline), (byte)(p));
			} 
			ModernizedCProgram.msg_make(p);
			ModernizedCProgram.vim_free(/* 'eap->cmd' is not set here, because it is not used at CMD_make */cmdlinep);
			cmdlinep = new_cmdline;
			p = new_cmdline;
		} 
		return p/*
		 * Expand file name in Ex command argument.
		 * When an error is detected, "errormsgp" is set to a non-NULL pointer.
		 * Return FAIL for failure, OK otherwise.
		 */;
	}
	public int expand_filename(Object cmdlinep, Byte errormsgp) {
		/* need to expand wildcards */int has_wildcards;
		char_u repl = new char_u();
		int srclen;
		char_u p = new char_u();
		int n;
		int escaped;
		p = /* Skip a regexp pattern for ":vimgrep[add] pat file..." */eap.skip_grep_pat();
		has_wildcards = ModernizedCProgram.mch_has_wildcard(/*
		     * Decide to expand wildcards *before* replacing '%', '#', etc.  If
		     * the file name contains a wildcard it should not cause expanding.
		     * (it will be expanded anyway if there is a wildcard before replacing).
		     */p);
		Object[] generatedArg = this.getArg();
		Object generatedDo_ecmd_lnum = this.getDo_ecmd_lnum();
		int generatedUsefilter = this.getUsefilter();
		CMD_index generatedCmdidx = this.getCmdidx();
		long generatedArgt = this.getArgt();
		while (p != (byte)'\000') {
			if (p[0] == (byte)'`' && p[1] == /* Skip over `=expr`, wildcards in it are not expanded. */(byte)'=') {
				p += 2;
				(Object)ModernizedCProgram.skip_expr(p);
				if (p == (byte)'`') {
					++p;
				} 
				continue;
			} 
			if (ModernizedCProgram.vim_strchr((char_u)"%#<", p) == ((Object)0)) {
				++p;
				continue;
			} 
			repl = ModernizedCProgram.eval_vars(p, generatedArg, srclen, (generatedDo_ecmd_lnum), errormsgp, escaped);
			if (errormsgp != ((Object)/* error detected */0)) {
				return 0;
			} 
			if (repl == ((Object)/* no match found */0)) {
				p += srclen;
				continue;
			} 
			if (ModernizedCProgram.vim_strchr(repl, (byte)'$') != ((Object)0) || ModernizedCProgram.vim_strchr(repl, (byte)'~') != ((Object)/* Wildcards won't be expanded below, the replacement is taken
				 * literally.  But do expand "~/file", "~user/file" and "$HOME/file". */0)) {
				char_u l = repl;
				repl = ModernizedCProgram.expand_env_save(repl);
				ModernizedCProgram.vim_free(ModernizedCProgram.l/* Need to escape white space et al. with a backslash.
					 * Don't do this for:
					 * - replacement that already has been escaped: "##"
					 * - shell commands (may have to use quotes instead).
					 * - non-unix systems when there is a single argument (spaces don't
					 *   separate arguments then).
					 */);
			} 
			if (!generatedUsefilter && !escaped && generatedCmdidx != CMD_index.CMD_bang && generatedCmdidx != CMD_index.CMD_grep && generatedCmdidx != CMD_index.CMD_grepadd && generatedCmdidx != CMD_index.CMD_hardcopy && generatedCmdidx != CMD_index.CMD_lgrep && generatedCmdidx != CMD_index.CMD_lgrepadd && generatedCmdidx != CMD_index.CMD_lmake && generatedCmdidx != CMD_index.CMD_make && generatedCmdidx != CMD_index.CMD_terminal && !(generatedArgt & -1024)) {
				char_u l = new char_u();
				char_u nobslash = (char_u)/* Don't escape a backslash here, because rem_backslash() doesn't
					     * remove it later. */" \t\"|";
				for (ModernizedCProgram.l = repl; ModernizedCProgram.l; ++ModernizedCProgram.l) {
					if (ModernizedCProgram.vim_strchr(nobslash, ModernizedCProgram.l) != ((Object)0)) {
						ModernizedCProgram.l = ModernizedCProgram.vim_strsave_escaped(repl, nobslash);
						if (ModernizedCProgram.l != ((Object)0)) {
							ModernizedCProgram.vim_free(repl);
							repl = ModernizedCProgram.l;
						} 
						break;
					} 
				}
			} 
			if ((generatedUsefilter || generatedCmdidx == /* For a shell command a '!' must be escaped. */CMD_index.CMD_bang || generatedCmdidx == CMD_index.CMD_terminal) && ModernizedCProgram.vim_strpbrk(repl, (char_u)"!") != ((Object)0)) {
				char_u l = new char_u();
				ModernizedCProgram.l = ModernizedCProgram.vim_strsave_escaped(repl, (char_u)"!");
				if (ModernizedCProgram.l != ((Object)0)) {
					ModernizedCProgram.vim_free(repl);
					repl = ModernizedCProgram.l;
				} 
			} 
			p = eap.repl_cmdline(p, srclen, repl, cmdlinep);
			ModernizedCProgram.vim_free(repl);
			if (p == ((Object)0)) {
				return 0/*
				     * One file argument: Expand wildcards.
				     * Don't do this with ":r !command" or ":w !command".
				     */;
			} 
		}
		if ((generatedArgt & -1024) && !generatedUsefilter) {
			for (n = 1; n <= 2; ++n) {
				if (n == 2/*
						 * Halve the number of backslashes (this is Vi compatible).
						 * For Unix and OS/2, when wildcards are expanded, this is
						 * done by ExpandOne() below.
						 */) {
					ModernizedCProgram.backslash_halve(generatedArg);
				} 
				if (has_wildcards) {
					if (n == 1/*
							     * First loop: May expand environment variables.  This
							     * can be done much faster with expand_env() than with
							     * something else (e.g., calling a shell).
							     * After expanding environment variables, check again
							     * if there are still wildcards present.
							     */) {
						if (ModernizedCProgram.vim_strchr(generatedArg, (byte)'$') != ((Object)0) || ModernizedCProgram.vim_strchr(generatedArg, (byte)'~') != ((Object)0)) {
							ModernizedCProgram.expand_env_esc(generatedArg, ModernizedCProgram.NameBuff, 1024, 1, 1, ((Object)0));
							has_wildcards = ModernizedCProgram.mch_has_wildcard(ModernizedCProgram.NameBuff);
							p = ModernizedCProgram.NameBuff;
						} else {
								p = ((Object)0/* n == 2 */);
						} 
					} else {
							expand_T xpc = new expand_T();
							int options = -1024 | -1024 | -1024;
							xpc.ExpandInit();
							xpc.setXp_context(2);
							if (ModernizedCProgram.p_wic) {
								ModernizedCProgram.options += -1024;
							} 
							p = xpc.ExpandOne(generatedArg, ((Object)0), ModernizedCProgram.options, 2);
							if (p == ((Object)0)) {
								return 0;
							} 
					} 
					if (p != ((Object)0)) {
						(Object)eap.repl_cmdline(generatedArg, (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)), p, cmdlinep);
						if (n == /* p came from ExpandOne() */2) {
							ModernizedCProgram.vim_free(p);
						} 
					} 
				} 
			}
		} 
		return 1/*
		 * Replace part of the command line, keeping eap->cmd, eap->arg and
		 * eap->nextcmd correct.
		 * "src" points to the part that is to be replaced, of length "srclen".
		 * "repl" is the replacement string.
		 * Returns a pointer to the character after the replaced string.
		 * Returns NULL for failure.
		 */;
	}
	public Object repl_cmdline(Object src, int srclen, Object repl, Object cmdlinep) {
		int len;
		int i;
		char_u new_cmdline = new char_u();
		/*
		     * The new command line is build in new_cmdline[].
		     * First allocate it.
		     * Careful: a "+cmd" argument may have been NUL terminated.
		     */
		len = (int)/*Error: Function owner not recognized*/strlen((byte)(repl));
		i = (int)(src - cmdlinep) + (int)/*Error: Function owner not recognized*/strlen((byte)(src + srclen)) + len + 3;
		Object generatedNextcmd = this.getNextcmd();
		if (generatedNextcmd != ((Object)0)) {
			i += (int)/*Error: Function owner not recognized*/strlen((byte)(generatedNextcmd));
		} 
		if ((new_cmdline = ModernizedCProgram.alloc(i)) == ((Object)0)) {
			return ((Object)/* out of memory! */0/*
			     * Copy the stuff before the expanded part.
			     * Copy the expanded stuff.
			     * Copy what came after the expanded part.
			     * Copy the next commands, if there are any.
			     */);
		} 
		i = (int)(src - /* length of part before match */cmdlinep);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(new_cmdline), (byte)(cmdlinep), (size_t)((size_t)i));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(new_cmdline + i), (byte)(repl), (size_t)((size_t)len));
		i += /* remember the end of the string */len;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(new_cmdline + i), (byte)(src + srclen));
		src = new_cmdline + /* remember where to continue */i;
		if (generatedNextcmd != ((Object)/* append next command */0)) {
			i = (int)/*Error: Function owner not recognized*/strlen((byte)(new_cmdline)) + 1;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(new_cmdline + i), (byte)(generatedNextcmd));
			this.setNextcmd(new_cmdline + i);
		} 
		Object[] generatedCmd = this.getCmd();
		this.setCmd(new_cmdline + (generatedCmd - cmdlinep));
		Object[] generatedArg = this.getArg();
		this.setArg(new_cmdline + (generatedArg - cmdlinep));
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0) && generatedDo_ecmd_cmd != ModernizedCProgram.dollar_command) {
			this.setDo_ecmd_cmd(new_cmdline + (generatedDo_ecmd_cmd - cmdlinep));
		} 
		ModernizedCProgram.vim_free(cmdlinep);
		cmdlinep = new_cmdline;
		return src/*
		 * Check for '|' to separate commands and '"' to start comments.
		 */;
	}
	public void separate_nextcmd() {
		char_u p = new char_u();
		p = eap.skip_grep_pat();
		long generatedArgt = this.getArgt();
		CMD_index generatedCmdidx = this.getCmdidx();
		Object[] generatedArg = this.getArg();
		for (; p; p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p)) {
			if (p == 22) {
				if (generatedArgt & (-1024 | -1024)) {
					++/* skip CTRL-V and next char */p;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((p)), (byte)((p + 1)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(p + 1)) + /* remove CTRL-V and skip next char */1));
				} 
				if (p == /* stop at NUL after CTRL-V */(byte)'\000') {
					break;
				} 
			}  else if (p[0] == (byte)'`' && p[1] == (byte)'=' && (generatedArgt & /* Skip over `=expr` when wildcards are expanded. */-1024)) {
				p += 2;
				(Object)ModernizedCProgram.skip_expr(p);
			}  else if ((p == (byte)'"' && !(generatedArgt & /* Check for '"': start of comment or '|': next command *//* :@" and :*" do not start a comment!
				 * :redir @" doesn't either. */-1024) && ((generatedCmdidx != CMD_index.CMD_at && generatedCmdidx != CMD_index.CMD_star) || p != generatedArg) && (generatedCmdidx != CMD_index.CMD_redir || p != generatedArg + 1 || p[-1] != (byte)'@')) || p == (byte)'|' || p == (byte)'\n'/*
				     * We remove the '\' before the '|', unless EX_CTRLV is used
				     * AND 'b' is present in 'cpoptions'.
				     */) {
				if ((ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'b') == ((Object)0) || !(generatedArgt & -1024)) && (p - 1) == (byte)'\\') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((p - 1)), (byte)((p)), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(p)) + /* remove the '\' */1));
					--p;
				} else {
						this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
						p = (byte)'\000';
						break;
				} 
			} 
		}
		if (!(generatedArgt & /* remove trailing spaces */-1024)) {
			ModernizedCProgram.del_trailing_spaces(generatedArg);
		} 
	}
	public int get_bad_opt(Object[] p) {
		if (ModernizedCProgram.vim_stricmp((byte)(p), (byte)("keep")) == 0) {
			this.setBad_char(-1);
		}  else if (ModernizedCProgram.vim_stricmp((byte)(p), (byte)("drop")) == 0) {
			this.setBad_char(-2);
		}  else if (ModernizedCProgram.mb_bytelen_tab[p] == 1 && p[1] == (byte)'\000') {
			this.setBad_char(p);
		} else {
				return 0;
		} 
		return 1/*
		 * Get "++opt=arg" argument.
		 * Return FAIL or OK.
		 */;
	}
	public int getargopt() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg + 2;
		int pp = ((Object)0);
		int bad_char_idx;
		char_u p = new char_u();
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("bin"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("nobin"), (size_t)(true)) == /* ":edit ++[no]bin[ary] file" */0) {
			if (arg == (byte)'n') {
				arg += 2;
				this.setForce_bin(2);
			} else {
					this.setForce_bin(1);
			} 
			if (!ModernizedCProgram.checkforcmd(arg, "binary", 3)) {
				return 0;
			} 
			this.setArg(ModernizedCProgram.skipwhite(arg));
			return 1;
		} 
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("edit"), (size_t)(true)) == /* ":read ++edit file" */0) {
			this.setRead_edit(1);
			this.setArg(ModernizedCProgram.skipwhite(arg + 4));
			return 1;
		} 
		int generatedForce_ff = this.getForce_ff();
		int generatedForce_enc = this.getForce_enc();
		if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("ff"), (size_t)(true)) == 0) {
			arg += 2;
			pp = generatedForce_ff;
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("fileformat"), (size_t)(true)) == 0) {
			arg += 10;
			pp = generatedForce_ff;
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("enc"), (size_t)(true)) == 0) {
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("encoding"), (size_t)(true)) == 0) {
				arg += 8;
			} else {
					arg += 3;
			} 
			pp = generatedForce_enc;
		}  else if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("bad"), (size_t)(true)) == 0) {
			arg += 3;
			pp = bad_char_idx;
		} 
		if (pp == ((Object)0) || arg != (byte)'=') {
			return 0;
		} 
		++arg;
		Object[] generatedCmd = this.getCmd();
		pp = (int)(arg - generatedCmd);
		arg = ModernizedCProgram.skip_cmd_arg(arg, 0);
		this.setArg(ModernizedCProgram.skipwhite(arg));
		arg = (byte)'\000';
		if (pp == generatedForce_ff) {
			if (ModernizedCProgram.check_ff_value(generatedCmd + generatedForce_ff) == 0) {
				return 0;
			} 
			this.setForce_ff(generatedCmd[generatedForce_ff]);
		}  else if (pp == generatedForce_enc) {
			for (p = generatedCmd + generatedForce_enc; p != (byte)'\000'; ++/* Make 'fileencoding' lower case. */p) {
				p = (((p) < (byte)'A' || (p) > (byte)'Z') ? (p) : (p) + ((byte)'a' - (byte)'A'));
			}
		} else {
				if (eap.get_bad_opt(generatedCmd + bad_char_idx) == /* Check ++bad= argument.  Must be a single-byte character, "keep" or
					 * "drop". */0) {
					return 0;
				} 
		} 
		return 1;
	}
	public void ex_autocmd() {
		CMD_index generatedCmdidx = this.getCmdidx();
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		if (secure) {
			secure = 2;
			this.setErrmsg(e_curdir);
		}  else if (generatedCmdidx == CMD_index.CMD_autocmd) {
			ModernizedCProgram.do_autocmd(generatedArg, generatedForceit);
		} else {
				ModernizedCProgram.do_augroup(generatedArg, generatedForceit);
		} 
	}
	/*
	     * Disallow autocommands from .exrc and .vimrc in current
	     * directory for security reasons.
	     */
	public void ex_doautocmd() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int call_do_modelines = ModernizedCProgram.check_nomodeline(arg);
		int did_aucmd;
		(Object)ModernizedCProgram.do_doautocmd(arg, 1, did_aucmd);
		if (call_do_modelines && /* Only when there is no <nomodeline>. */did_aucmd) {
			ModernizedCProgram.do_modelines(0/*
			 * :[N]bunload[!] [N] [bufname] unload buffer
			 * :[N]bdelete[!] [N] [bufname] delete buffer from buffer list
			 * :[N]bwipeout[!] [N] [bufname] delete buffer really
			 */);
		} 
	}
	public void ex_bunload() {
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		int generatedForceit = this.getForceit();
		this.setErrmsg(ModernizedCProgram.do_bufdel(generatedCmdidx == CMD_index.CMD_bdelete ? 3 : generatedCmdidx == CMD_index.CMD_bwipeout ? 4 : 2, generatedArg, generatedAddr_count, (int)generatedLine1, (int)generatedLine2, generatedForceit));
	}
	public void ex_buffer() {
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedArg) {
			this.setErrmsg(e_trailing);
		} else {
				if (generatedAddr_count == /* default is current buffer */0) {
					eap.goto_buffer(0, 1, 0);
				} else {
						eap.goto_buffer(1, 1, (int)generatedLine2);
				} 
				if (generatedDo_ecmd_cmd != ((Object)0)) {
					ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
				} 
		} 
	}
	public void ex_bmodified() {
		Object generatedLine2 = this.getLine2();
		eap.goto_buffer(3, 1, (int)generatedLine2);
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
		} 
	}
	public void ex_bnext() {
		Object generatedLine2 = this.getLine2();
		eap.goto_buffer(0, 1, (int)generatedLine2);
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
		} 
	}
	public void ex_bprevious() {
		Object generatedLine2 = this.getLine2();
		eap.goto_buffer(0, (true), (int)generatedLine2);
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
		} 
	}
	public void ex_brewind() {
		eap.goto_buffer(1, 1, 0);
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
		} 
	}
	public void ex_blast() {
		eap.goto_buffer(2, (true), 0);
		Object generatedDo_ecmd_cmd = this.getDo_ecmd_cmd();
		if (generatedDo_ecmd_cmd != ((Object)0)) {
			ModernizedCProgram.do_cmdline_cmd(generatedDo_ecmd_cmd);
		} 
	}
	public void ex_colorscheme() {
		Object[] generatedArg = this.getArg();
		if (generatedArg == (byte)'\000') {
			char_u expr = ModernizedCProgram.vim_strsave((char_u)"g:colors_name");
			char_u p = ((Object)0);
			if (expr != ((Object)0)) {
				++emsg_off;
				p = ModernizedCProgram.eval_to_string(expr, ((Object)0), 0);
				--emsg_off;
				ModernizedCProgram.vim_free(expr);
			} 
			if (p != ((Object)0)) {
				ModernizedCProgram.msg((byte)p);
				ModernizedCProgram.vim_free(p);
			} else {
					ModernizedCProgram.msg("default");
			} 
		}  else if (ModernizedCProgram.load_colors(generatedArg) == 0) {
			ModernizedCProgram.semsg(((byte)("E185: Cannot find color scheme '%s'")), generatedArg);
		}  else if (ModernizedCProgram.has_vtp_working()) {
			ModernizedCProgram.update_screen(50);
			ModernizedCProgram.redrawcmd();
		} 
	}
	public void ex_highlight() {
		Object[] generatedArg = this.getArg();
		Object[] generatedCmd = this.getCmd();
		if (generatedArg == (byte)'\000' && generatedCmd[2] == (byte)'!') {
			ModernizedCProgram.msg(((byte)("Greetings, Vim user!")));
		} 
		int generatedForceit = this.getForceit();
		ModernizedCProgram.do_highlight(generatedArg, generatedForceit, 0/*
		 * Call this function if we thought we were going to exit, but we won't
		 * (because of an error).  May need to restore the terminal mode.
		 */);
	}
	public void ex_quit() {
		win_T wp = new win_T();
		if (cmdwin_type != 0) {
			cmdwin_result = 3;
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.text_locked()) {
			ModernizedCProgram.text_locked_msg();
			return /*Error: Unsupported expression*/;
		} 
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		window_S generatedW_next = wp.getW_next();
		if (generatedAddr_count > 0) {
			int wnr = generatedLine2;
			for (wp = ModernizedCProgram.firstwin; generatedW_next != ((Object)0); wp = generatedW_next) {
				if (--wnr <= 0) {
					break;
				} 
			}
		} else {
				wp = ModernizedCProgram.curwin;
		} 
		if (ModernizedCProgram.curbuf_locked()) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		if (wp.before_quit_autocmds(0, generatedForceit)) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.check_more(0, generatedForceit) == 1 && ModernizedCProgram.only_one_window()) {
			exiting = 1;
		} 
		file_buffer generatedW_buffer = wp.getW_buffer();
		if ((!generatedW_buffer.buf_hide() && generatedW_buffer.check_changed((ModernizedCProgram.p_awa ? 1 : 0) | (generatedForceit ? 4 : 0) | 16)) || ModernizedCProgram.check_more(1, generatedForceit) == 0 || (ModernizedCProgram.only_one_window() && ModernizedCProgram.check_changed_any(generatedForceit, 1))) {
			ModernizedCProgram.not_exiting();
		} else {
				if (ModernizedCProgram.only_one_window() && ((ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) || generatedAddr_count == 0)) {
					ModernizedCProgram.getout(0);
				} 
				ModernizedCProgram.not_exiting();
				wp.win_close(!generatedW_buffer.buf_hide() || generatedForceit);
		} 
	}
	public void ex_cquit() {
		ModernizedCProgram.getout(/* this does not always pass on the exit code to the Manx
				   compiler. why? */1/*
		 * ":qall": try to quit all windows
		 */);
	}
	public void ex_quit_all() {
		int generatedForceit = this.getForceit();
		if (cmdwin_type != 0) {
			if (generatedForceit) {
				cmdwin_result = (-((true) + ((int)(key_extra.KE_XF1) << /* ex_window() takes care of this */8)));
			} else {
					cmdwin_result = (-((true) + ((int)(key_extra.KE_XF2) << 8)));
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.text_locked()) {
			ModernizedCProgram.text_locked_msg();
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.curwin.before_quit_autocmds(1, generatedForceit)) {
			return /*Error: Unsupported expression*/;
		} 
		exiting = 1;
		if (generatedForceit || !ModernizedCProgram.check_changed_any(0, 0)) {
			ModernizedCProgram.getout(0);
		} 
		ModernizedCProgram.not_exiting();
	}
	public void ex_close() {
		win_T win = new win_T();
		int winnr = 0;
		int generatedAddr_count = this.getAddr_count();
		int generatedForceit = this.getForceit();
		Object generatedLine2 = this.getLine2();
		window_S generatedW_next = win.getW_next();
		if (cmdwin_type != 0) {
			cmdwin_result = 3;
		}  else if (!ModernizedCProgram.text_locked() && !ModernizedCProgram.curbuf_locked()) {
			if (generatedAddr_count == 0) {
				ModernizedCProgram.ex_win_close(generatedForceit, ModernizedCProgram.curwin, ((Object)0));
			} else {
					for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
						winnr++;
						if (winnr == generatedLine2) {
							break;
						} 
					}
					if (win == ((Object)0)) {
						win = ModernizedCProgram.lastwin;
					} 
					ModernizedCProgram.ex_win_close(generatedForceit, win, ((Object)0));
			} 
		} 
	}
	/*
	 * ":pclose": Close any preview window.
	 */
	public void ex_pclose() {
		win_T win = new win_T();
		 generatedW_onebuf_opt = win.getW_onebuf_opt();
		Object generatedWo_pvw = generatedW_onebuf_opt.getWo_pvw();
		int generatedForceit = this.getForceit();
		window_S generatedW_next = win.getW_next();
		// First close any normal window.for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
			if (generatedWo_pvw) {
				ModernizedCProgram.ex_win_close(generatedForceit, win, ((Object)0));
				return /*Error: Unsupported expression*/;
			} 
		}
		// Also when 'previewpopup' is empty, it might have been cleared.// Also when 'previewpopup' is empty, it might have been cleared.ModernizedCProgram.popup_close_preview();
	}
	public int get_tabpage_arg() {
		int tab_number;
		CMD_index generatedCmdidx = this.getCmdidx();
		int unaccept_arg0 = (generatedCmdidx == CMD_index.CMD_tabmove) ? 0 : 1;
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		Object generatedCmdlinep = this.getCmdlinep();
		if (generatedArg && generatedArg != (byte)'\000') {
			char_u p = generatedArg;
			char_u p_save = new char_u();
			int relative = /* argument +N/-N means: go to N places to the
						      * right/left relative to the current position. */0;
			if (p == (byte)'-') {
				relative = -1;
				p++;
			}  else if (p == (byte)'+') {
				relative = 1;
				p++;
			} 
			p_save = p;
			tab_number = ModernizedCProgram.getdigits(p);
			if (relative == 0) {
				if (/*Error: Function owner not recognized*/strcmp((byte)(p), (byte)("$")) == 0) {
					tab_number = ((Object)0).current_tab_nr();
				}  else if (p == p_save || p_save == (byte)'-' || p != (byte)'\000' || tab_number > ((Object)0).current_tab_nr()) {
					this.setErrmsg(/* No numbers as argument. */e_invarg);
					;
				} 
			} else {
					if (p_save == (byte)'\000') {
						tab_number = 1;
					}  else if (p == p_save || p_save == (byte)'-' || p != (byte)'\000' || tab_number == 0) {
						this.setErrmsg(/* No numbers as argument. */e_invarg);
						;
					} 
					tab_number = tab_number * relative + ModernizedCProgram.curtab.tabpage_index();
					if (!unaccept_arg0 && relative == -1) {
						--tab_number;
					} 
			} 
			if (tab_number < unaccept_arg0 || tab_number > ((Object)0).current_tab_nr()) {
				this.setErrmsg(e_invarg);
			} 
		}  else if (generatedAddr_count > 0) {
			if (unaccept_arg0 && generatedLine2 == 0) {
				this.setErrmsg(e_invrange);
				tab_number = 0;
			} else {
					tab_number = generatedLine2;
					if (!unaccept_arg0 && ModernizedCProgram.skipwhite(generatedCmdlinep) == (byte)'-') {
						--tab_number;
						if (tab_number < unaccept_arg0) {
							this.setErrmsg(e_invarg);
						} 
					} 
			} 
		} else {
				switch (generatedCmdidx) {
				case CMD_index.CMD_tabnext:
						tab_number = ModernizedCProgram.curtab.tabpage_index() + 1;
						if (tab_number > ((Object)0).current_tab_nr()) {
							tab_number = 1;
						} 
						break;
				case CMD_index.CMD_tabmove:
						tab_number = ((Object)0).current_tab_nr();
						break;
				default:
						tab_number = ModernizedCProgram.curtab.tabpage_index();
				}
		} 
	}
	public void ex_tabclose() {
		tabpage_T tp = new tabpage_T();
		int tab_number;
		Byte generatedErrmsg = this.getErrmsg();
		tabpage_S tabpage_S = new tabpage_S();
		int generatedForceit = this.getForceit();
		if (cmdwin_type != 0) {
			cmdwin_result = (-((true) + ((int)(key_extra.KE_IGNORE) << 8)));
		}  else if (ModernizedCProgram.first_tabpage.getTp_next() == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E784: Cannot close last tab page")));
		} else {
				tab_number = eap.get_tabpage_arg();
				if (generatedErrmsg == ((Object)0)) {
					tp = tabpage_S.find_tabpage(tab_number);
					if (tp == ((Object)0)) {
						ModernizedCProgram.beep_flush();
						return /*Error: Unsupported expression*/;
					} 
					if (tp != ModernizedCProgram.curtab) {
						tp.tabpage_close_other(generatedForceit);
						return /*Error: Unsupported expression*/;
					}  else if (!ModernizedCProgram.text_locked() && !ModernizedCProgram.curbuf_locked()) {
						ModernizedCProgram.tabpage_close(generatedForceit);
					} 
				} 
		} 
	}
	/*
	 * ":tabonly": close all tab pages except the current one
	 */
	public void ex_tabonly() {
		tabpage_T tp = new tabpage_T();
		int done;
		int tab_number;
		Byte generatedErrmsg = this.getErrmsg();
		frame_S generatedTp_topframe = tp.getTp_topframe();
		int generatedForceit = this.getForceit();
		tabpage_S generatedTp_next = tp.getTp_next();
		if (cmdwin_type != 0) {
			cmdwin_result = (-((true) + ((int)(key_extra.KE_IGNORE) << 8)));
		}  else if (ModernizedCProgram.first_tabpage.getTp_next() == ((Object)0)) {
			ModernizedCProgram.msg(((byte)("Already only one tab page")));
		} else {
				tab_number = eap.get_tabpage_arg();
				if (generatedErrmsg == ((Object)0)) {
					ModernizedCProgram.goto_tabpage(tab_number/* Repeat this up to a 1000 times, because autocommands may
							 * mess up the lists. */);
					for (done = 0; done < 1000; ++done) {
						for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0); tp = generatedTp_next) {
							if (generatedTp_topframe != ModernizedCProgram.topframe) {
								tp.tabpage_close_other(generatedForceit);
								if (/* if we failed to close it quit */tp.valid_tabpage()) {
									done = 1000/* start over, "tp" is now invalid */;
								} 
								break;
							} 
						}
						if (generatedTp_next == ((Object)0)) {
							break;
						} 
					}
				} 
		} 
	}
	public void ex_only() {
		win_T wp = new win_T();
		int wnr;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		window_S generatedW_next = wp.getW_next();
		if (generatedAddr_count > 0) {
			wnr = generatedLine2;
			for (wp = ModernizedCProgram.firstwin; --wnr > 0; /*Error: Unsupported expression*/) {
				if (generatedW_next == ((Object)0)) {
					break;
				} else {
						wp = generatedW_next;
				} 
			}
			wp.win_goto();
		} 
		int generatedForceit = this.getForceit();
		ModernizedCProgram.close_others(1, generatedForceit);
	}
	public void ex_hide() {
		int generatedSkip = this.getSkip();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		window_S generatedW_next = win.getW_next();
		if (!generatedSkip) {
			if (generatedAddr_count == 0) {
				ModernizedCProgram.curwin.win_close(/* don't free buffer */0);
			} else {
					int winnr = 0;
					win_T win = new win_T();
					for (win = ModernizedCProgram.firstwin; win != ((Object)0); win = generatedW_next) {
						winnr++;
						if (winnr == generatedLine2) {
							break;
						} 
					}
					if (win == ((Object)0)) {
						win = ModernizedCProgram.lastwin;
					} 
					win.win_close(0);
			} 
		} 
	}
	/*
	 * ":stop" and ":suspend": Suspend Vim.
	 */
	public void ex_stop() {
		int generatedForceit = this.getForceit();
		if (!ModernizedCProgram.check_restricted()) {
			if (!generatedForceit) {
				ModernizedCProgram.autowrite_all();
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/windgoto((int)ModernizedCProgram.Rows - 1, 0);
			ModernizedCProgram.out_char((byte)'\n');
			ModernizedCProgram.out_flush();
			ModernizedCProgram.stoptermcap();
			ModernizedCProgram.out_flush();
			ModernizedCProgram.mch_restore_title((1 | /* restore window titles */2));
			ModernizedCProgram.ui_suspend();
			ModernizedCProgram.maketitle();
			ModernizedCProgram.resettitle();
			ModernizedCProgram.starttermcap();
			ModernizedCProgram.scroll_start();
			ModernizedCProgram.redraw_later_clear();
			ModernizedCProgram.shell_resized();
		} 
	}
	/*
	     * Disallow suspending for "rvim".
	     */
	public void ex_exit() {
		if (cmdwin_type != 0) {
			cmdwin_result = 3;
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.text_locked()) {
			ModernizedCProgram.text_locked_msg();
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		if (ModernizedCProgram.curwin.before_quit_autocmds(0, generatedForceit)) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.check_more(0, generatedForceit) == 1 && ModernizedCProgram.only_one_window()) {
			exiting = 1;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		if (((generatedCmdidx == CMD_index.CMD_wq || ModernizedCProgram.curbufIsChanged()) && eap.do_write() == 0) || ModernizedCProgram.check_more(1, generatedForceit) == 0 || (ModernizedCProgram.only_one_window() && ModernizedCProgram.check_changed_any(generatedForceit, 0))) {
			ModernizedCProgram.not_exiting();
		} else {
				if (ModernizedCProgram.only_one_window()) {
					ModernizedCProgram.getout(0);
				} 
				ModernizedCProgram.not_exiting();
				ModernizedCProgram.curwin.win_close(!ModernizedCProgram.curwin.getW_buffer().buf_hide());
		} 
	}
	public void ex_print() {
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		Object generatedLine1 = this.getLine1();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedFlags = this.getFlags();
		Object generatedLine2 = this.getLine2();
		if (generatedMl_flags & 1) {
			ModernizedCProgram.emsg(((byte)(e_emptybuf)));
		} else {
				for (; !got_int; ModernizedCProgram.ui_breakcheck()) {
					ModernizedCProgram.print_line(generatedLine1, (generatedCmdidx == CMD_index.CMD_number || generatedCmdidx == CMD_index.CMD_pound || (generatedFlags & -1024)), generatedCmdidx == CMD_index.CMD_list || (generatedFlags & -1024));
					if (++generatedLine1 > generatedLine2) {
						break;
					} 
					ModernizedCProgram.out_flush();
				}
				ModernizedCProgram.setpcmark();
				ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
				ModernizedCProgram.beginline(2 | 4);
		} 
		ex_no_reprint = 1;
	}
	public void ex_goto() {
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.goto_byte(generatedLine2);
	}
	public void ex_shell() {
		ModernizedCProgram.do_shell(((Object)0), 0);
	}
	// Setting the argument list may cause screen updates and being called
	// recursively.  Avoid that by setting drop_busy.
	/* Check whether the current buffer is changed. If so, we will need
	     * to split the current window or data could be lost.
	     * We don't need to check if the 'hidden' option is set, as in this
	     * case the buffer won't be lost.
	     */
	/* When splitting the window, create a new alist.  Otherwise the
		 * existing one is overwritten. */
	/*
	     * Set up the new argument list.
	     */
	/*
	     * Move to the first file.
	     */
	/* Fake up a minimal "next" command for do_argfile() */
	/* do_ecmd() may set need_start_insertmode, but since we never left Insert
	     * mode that is not needed here. */
	/* Restore msg_scroll, otherwise a following command may cause scrolling
	     * unexpectedly.  The screen will be redrawn by the caller, thus
	     * msg_scroll being set by displaying a message is irrelevant. */
	/*
	 * Handle a file drop. The code is here because a drop is *nearly* like an
	 * :args command, but not quite (we have a list of exact filenames, so we
	 * don't want to (a) parse a command line, or (b) expand wildcards). So the
	 * code is very similar to :args and hence needs access to a lot of the static
	 * functions in this file.
	 *
	 * The "filev" list must have been allocated using alloc(), as should each item
	 * in the list. This function takes over responsibility for freeing the "filev"
	 * list.
	 */
	// the number of files dropped
	// the list of files dropped
	// force splitting the window
	// to be called after setting the argument
	// list
	// argument for "callback" (allocated)
	// Cannot handle recursive drops, finish the pending one.
	// When calling handle_drop() more than once in a row we only use the last
	// one.
	// Postpone this when:
	// - editing the command line
	// - not possible to change the current buffer
	// - updating the screen
	// As it may change buffers and window structures that are in use and cause
	// freed memory to be used.
	/*
	 * To be called when text is unlocked, curbuf is unlocked or updating_screen is
	 * reset: Handle a postponed drop.
	 */
	/*
	 * ":preserve".
	 */
	public void ex_preserve() {
		int generatedB_flags = curbuf.getB_flags();
		generatedB_flags |=  -1024;
		curbuf.ml_preserve(1/*
		 * ":recover".
		 */);
	}
	public void ex_recover() {
		recoverymode = /* Set recoverymode right away to avoid the ATTENTION prompt. */1;
		int generatedForceit = this.getForceit();
		Object[] generatedArg = this.getArg();
		if (!curbuf.check_changed((ModernizedCProgram.p_awa ? 1 : 0) | 2 | (generatedForceit ? 4 : 0) | 16) && (generatedArg == (byte)'\000' || curbuf.setfname(generatedArg, ((Object)0), 1) == 1)) {
			ModernizedCProgram.ml_recover(1);
		} 
		recoverymode = 0/*
		 * Command modifier used in a wrong way.
		 */;
	}
	public void ex_wrongmodifier() {
		this.setErrmsg(e_invcmd/*
		 * :sview [+command] file	split window with new file, read-only
		 * :split [[+command] file]	split window with current or new file
		 * :vsplit [[+command] file]	split window vertically with current or new file
		 * :new [[+command] file]	split window with no or new file
		 * :vnew [[+command] file]	split vertically window with no or new file
		 * :sfind [+command] file	split window with file in 'path'
		 *
		 * :tabedit			open new Tab page with empty window
		 * :tabedit [+command] file	open new Tab page and edit "file"
		 * :tabnew [[+command] file]	just like :tabedit
		 * :tabfind [+command] file	open new Tab page and find "file"
		 */);
	}
	public void ex_splitview() {
		win_T old_curwin = ModernizedCProgram.curwin;
		char_u fname = ((Object)0);
		CMD_index generatedCmdidx = this.getCmdidx();
		int use_tab = generatedCmdidx == CMD_index.CMD_tabedit || generatedCmdidx == CMD_index.CMD_tabfind || generatedCmdidx == CMD_index.CMD_tabnew;
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		if (curbuf.bt_quickfix() && ModernizedCProgram.cmdmod.getTab() == /* A ":split" in the quickfix window works like ":new".  Don't want two
		     * quickfix windows.  But it's OK when doing ":tab split". */0) {
			if (generatedCmdidx == CMD_index.CMD_split) {
				this.setCmdidx(CMD_index.CMD_new);
			} 
			if (generatedCmdidx == CMD_index.CMD_vsplit) {
				this.setCmdidx(CMD_index.CMD_vnew);
			} 
		} 
		Object[] generatedArg = this.getArg();
		Object[] generatedB_ffname = curbuf.getB_ffname();
		if (generatedCmdidx == CMD_index.CMD_sfind || generatedCmdidx == CMD_index.CMD_tabfind) {
			fname = ModernizedCProgram.find_file_in_path(generatedArg, (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)), 1, 1, generatedB_ffname);
			if (fname == ((Object)0)) {
				;
			} 
			this.setArg(fname);
		} 
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		file_buffer generatedW_buffer = old_curwin.getW_buffer();
		int generatedB_fnum = curbuf.getB_fnum();
		Object[] generatedCmd = this.getCmd();
		/* No browsing supported but we do have the file explorer:
			     * Edit the directory. *//* Don't browse again in do_ecmd(). */if (/*
		     * Either open new tab page or split the window.
		     */use_tab) {
			if (ModernizedCProgram.win_new_tabpage(ModernizedCProgram.cmdmod.getTab() != 0 ? ModernizedCProgram.cmdmod.getTab() : generatedAddr_count == 0 ? 0 : (int)generatedLine2 + 1) != 0) {
				ModernizedCProgram.do_exedit(eap, old_curwin);
				if (ModernizedCProgram.curwin != /* set the alternate buffer for the window we came from */old_curwin && old_curwin.win_valid() && generatedW_buffer != curbuf && !ModernizedCProgram.cmdmod.getKeepalt()) {
					old_curwin.setW_alt_fnum(generatedB_fnum);
				} 
			} 
		}  else if (ModernizedCProgram.win_split(generatedAddr_count > 0 ? (int)generatedLine2 : 0, generatedCmd == (byte)'v' ? 2 : 0) != 0) {
			if (generatedArg != /* Reset 'scrollbind' when editing another file, but keep it when
				 * doing ":split" without arguments. */(byte)'\000') {
				do {
					(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_scb(0);
					(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_crb(0);
				} while (0);
			} else {
					ModernizedCProgram.do_check_scrollbind(0);
			} 
			ModernizedCProgram.do_exedit(eap, old_curwin);
		} 
	}
	public void ex_tabnext() {
		int tab_number;
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		Byte generatedErrmsg = this.getErrmsg();
		CMD_index generatedCmdidx = this.getCmdidx();
		switch (generatedCmdidx) {
		case CMD_index.CMD_tabNext:
				if (generatedArg && generatedArg != (byte)'\000') {
					char_u p = generatedArg;
					char_u p_save = p;
					tab_number = ModernizedCProgram.getdigits(p);
					if (p == p_save || p_save == (byte)'-' || p != (byte)'\000' || tab_number == 0) {
						this.setErrmsg(/* No numbers as argument. */e_invarg);
						return /*Error: Unsupported expression*/;
					} 
				} else {
						if (generatedAddr_count == 0) {
							tab_number = 1;
						} else {
								tab_number = generatedLine2;
								if (tab_number < 1) {
									this.setErrmsg(e_invrange);
									return /*Error: Unsupported expression*/;
								} 
						} 
				} 
				ModernizedCProgram.goto_tabpage(-tab_number);
				break;
		case CMD_index.CMD_tabrewind:
				ModernizedCProgram.goto_tabpage(1);
				break;
		case CMD_index.CMD_tabprevious:
		case CMD_index.CMD_tablast:
				ModernizedCProgram.goto_tabpage(9999);
				break;
		case CMD_index.CMD_tabfirst:
		default:
				tab_number = eap.get_tabpage_arg();
				if (generatedErrmsg == ((Object)0)) {
					ModernizedCProgram.goto_tabpage(tab_number);
				} 
				break;
		}
	}
	public void ex_tabmove() {
		int tab_number;
		tab_number = eap.get_tabpage_arg();
		Byte generatedErrmsg = this.getErrmsg();
		if (generatedErrmsg == ((Object)0)) {
			ModernizedCProgram.tabpage_move(tab_number/*
			 * :tabs command: List tabs and their contents.
			 */);
		} 
	}
	public void ex_tabs() {
		tabpage_T tp = new tabpage_T();
		win_T wp = new win_T();
		int tabcount = 1;
		ModernizedCProgram.msg_start();
		msg_scroll = 1;
		window_S generatedTp_firstwin = tp.getTp_firstwin();
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object[] generatedB_fname = generatedW_buffer.getB_fname();
		window_S generatedW_next = wp.getW_next();
		tabpage_S generatedTp_next = tp.getTp_next();
		for (tp = ModernizedCProgram.first_tabpage; tp != ((Object)0) && !got_int; tp = generatedTp_next) {
			ModernizedCProgram.msg_putchar((byte)'\n');
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), ((byte)("Tab page %d")), tabcount++);
			ModernizedCProgram.msg_outtrans_attr(ModernizedCProgram.IObuff, ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
			ModernizedCProgram.out_flush();
			ModernizedCProgram.ui_breakcheck();
			if (tp == ModernizedCProgram.curtab) {
				wp = ModernizedCProgram.firstwin;
			} else {
					wp = generatedTp_firstwin;
			} 
			for (; wp != ((Object)0) && !got_int; wp = generatedW_next) {
				ModernizedCProgram.msg_putchar((byte)'\n');
				ModernizedCProgram.msg_putchar(wp == ModernizedCProgram.curwin ? (byte)'>' : (byte)' ');
				ModernizedCProgram.msg_putchar((byte)' ');
				ModernizedCProgram.msg_putchar(generatedW_buffer.bufIsChanged() ? (byte)'+' : (byte)' ');
				ModernizedCProgram.msg_putchar((byte)' ');
				if (generatedW_buffer.buf_spname() != ((Object)0)) {
					ModernizedCProgram.vim_strncpy(ModernizedCProgram.IObuff, generatedW_buffer.buf_spname(), (1024 + 1) - 1);
				} else {
						generatedW_buffer.home_replace(generatedB_fname, ModernizedCProgram.IObuff, (1024 + 1), 1);
				} 
				ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
				ModernizedCProgram.out_flush();
				ModernizedCProgram.ui_breakcheck();
			}
		}
	}
	public void ex_mode() {
		Object[] generatedArg = this.getArg();
		if (generatedArg == (byte)'\000') {
			ModernizedCProgram.shell_resized();
		} else {
				ModernizedCProgram.mch_screenmode(generatedArg);
		} 
	}
	public void ex_resize() {
		int n;
		win_T wp = ModernizedCProgram.curwin;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		window_S generatedW_next = wp.getW_next();
		if (generatedAddr_count > 0) {
			n = generatedLine2;
			for (wp = ModernizedCProgram.firstwin; generatedW_next != ((Object)0) && --n > 0; wp = generatedW_next) {
				;
			}
		} 
		Object[] generatedArg = this.getArg();
		n = /*Error: Function owner not recognized*/atol((byte)generatedArg);
		if (ModernizedCProgram.cmdmod.getSplit() & 2) {
			if (generatedArg == (byte)'-' || generatedArg == (byte)'+') {
				n += ModernizedCProgram.curwin.getW_width();
			}  else if (n == 0 && generatedArg[0] == /* default is very wide */(byte)'\000') {
				n = 9999;
			} 
			wp.win_setwidth_win((int)n);
		} else {
				if (generatedArg == (byte)'-' || generatedArg == (byte)'+') {
					n += ModernizedCProgram.curwin.getW_height();
				}  else if (n == 0 && generatedArg[0] == /* default is very high */(byte)'\000') {
					n = 9999;
				} 
				wp/*
				 * ":find [+command] <file>" command.
				 */.win_setheight_win((int)n);
		} 
	}
	public void ex_find() {
		char_u fname = new char_u();
		int count;
		Object[] generatedArg = this.getArg();
		Object[] generatedB_ffname = curbuf.getB_ffname();
		fname = ModernizedCProgram.find_file_in_path(generatedArg, (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)), 1, 1, generatedB_ffname);
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > 0) {
			count = generatedLine2;
			while (fname != ((Object)0) && --count > 0) {
				ModernizedCProgram.vim_free(fname);
				fname = ModernizedCProgram.find_file_in_path(((Object)0), 0, 1, 0, generatedB_ffname);
			}
		} 
		if (fname != ((Object)0)) {
			this.setArg(fname);
			ModernizedCProgram.do_exedit(eap, ((Object)0));
			ModernizedCProgram.vim_free(fname);
		} 
	}
	/*
	 * ":open" simulation: for now just work like ":visual".
	 */
	public void ex_open() {
		regmatch_T regmatch = new regmatch_T();
		char_u p = new char_u();
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
		ModernizedCProgram.beginline(2 | 4);
		Object[] generatedArg = this.getArg();
		regprog regprog = new regprog();
		Object generatedRegprog = regmatch.getRegprog();
		Object generatedStartp = regmatch.getStartp();
		if (generatedArg == (byte)'/') {
			++generatedArg;
			p = ModernizedCProgram.skip_regexp(generatedArg, (byte)'/', ModernizedCProgram.p_magic, ((Object)0));
			p = (byte)'\000';
			regmatch.setRegprog(regprog.vim_regcomp(generatedArg, ModernizedCProgram.p_magic ? 1 : 0));
			if (generatedRegprog != ((Object)0)) {
				regmatch.setRm_ic(ModernizedCProgram.p_ic);
				p = ModernizedCProgram.ml_get_curline();
				if (regmatch.vim_regexec(p, (colnr_T)0)) {
					ModernizedCProgram.curwin.getW_cursor().setCol((colnr_T)(generatedStartp[0] - p));
				} else {
						ModernizedCProgram.emsg(((byte)(e_nomatch)));
				} 
				generatedRegprog.vim_regfree();
			} 
			generatedArg += /*Error: Function owner not recognized*/strlen((byte)(generatedArg));
		} 
		ModernizedCProgram.check_cursor();
		this.setCmdidx(CMD_index.CMD_visual);
		ModernizedCProgram.do_exedit(eap, ((Object)0/*
		 * ":edit", ":badd", ":visual".
		 */));
	}
	public void ex_edit() {
		ModernizedCProgram.do_exedit(eap, ((Object)0/*
		 * ":edit <file>" command and alikes.
		 */));
	}
	public void ex_nogui() {
		this.setErrmsg(e_nogvim);
	}
	public void ex_popup() {
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.pum_make_popup(generatedArg, generatedForceit);
	}
	public void ex_swapname() {
		memline generatedB_ml = curbuf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		Object generatedMf_fname = generatedMl_mfp.getMf_fname();
		if (generatedMl_mfp == ((Object)0) || generatedMf_fname == ((Object)0)) {
			ModernizedCProgram.msg(((byte)("No swap file")));
		} else {
				ModernizedCProgram.msg((byte)generatedMf_fname);
		} 
	}
	public void ex_syncbind() {
		win_T wp = new win_T();
		win_T save_curwin = ModernizedCProgram.curwin;
		buf_T save_curbuf = curbuf;
		long topline;
		long y;
		linenr_T old_linenr = ModernizedCProgram.curwin.getW_cursor().getLnum();
		ModernizedCProgram.setpcmark();
		 generatedW_onebuf_opt = wp.getW_onebuf_opt();
		Object generatedWo_scb = generatedW_onebuf_opt.getWo_scb();
		file_buffer generatedW_buffer = wp.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		window_S generatedW_next = wp.getW_next();
		if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scb()) {
			topline = ModernizedCProgram.curwin.getW_topline();
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
				if (generatedWo_scb && generatedW_buffer) {
					y = generatedMl_line_count - ModernizedCProgram.get_scrolloff_value();
					if (topline > y) {
						topline = y;
					} 
				} 
			}
			if (topline < 1) {
				topline = 1;
			} 
		} else {
				topline = 1;
		} 
		for (ModernizedCProgram.curwin = ModernizedCProgram.firstwin; ModernizedCProgram.curwin != ((Object)0); ModernizedCProgram.curwin = generatedW_next) {
			if (generatedWo_scb) {
				curbuf = generatedW_buffer;
				y = topline - ModernizedCProgram.curwin.getW_topline();
				if (y > 0) {
					ModernizedCProgram.scrollup(y, 1);
				} else {
						ModernizedCProgram.scrolldown(-y, 1);
				} 
				ModernizedCProgram.curwin.setW_scbind_pos(topline);
				ModernizedCProgram.redraw_later(10);
				ModernizedCProgram.cursor_correct();
				ModernizedCProgram.curwin.setW_redr_status(1);
			} 
		}
		ModernizedCProgram.curwin = save_curwin;
		curbuf = save_curbuf;
		if (generatedWo_scb) {
			did_syncbind = 1;
			ModernizedCProgram.checkpcmark();
			if (old_linenr != ModernizedCProgram.curwin.getW_cursor().getLnum()) {
				char_u[] ctrl_o = new char_u();
				ctrl_o[0] = 15;
				ctrl_o[1] = 0;
				ModernizedCProgram.ins_typebuf(ctrl_o, -1, 0, 1, 0);
			} 
		} 
	}
	public void ex_read() {
		int i;
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		int empty = (generatedMl_flags & 1);
		linenr_T lnum = new linenr_T();
		int generatedUsefilter = this.getUsefilter();
		Object generatedLine2 = this.getLine2();
		Object[] generatedArg = this.getArg();
		Object[] generatedB_ffname = curbuf.getB_ffname();
		Object[] generatedB_fname = curbuf.getB_fname();
		file_buffer file_buffer = new file_buffer();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedUsefilter) {
			eap.do_bang(1, 0, 0, 1);
		} else {
				if (ModernizedCProgram.u_save(generatedLine2, (linenr_T)(generatedLine2 + 1)) == 0) {
					return /*Error: Unsupported expression*/;
				} 
				if (generatedArg == (byte)'\000') {
					if (ModernizedCProgram.check_fname() == /* check for no file name */0) {
						return /*Error: Unsupported expression*/;
					} 
					i = eap.readfile(generatedB_ffname, generatedB_fname, generatedLine2, (linenr_T)0, (linenr_T)LONG_MAX, 0);
				} else {
						if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'a') != ((Object)0)) {
							(Object)file_buffer.setaltfname(generatedArg, generatedArg, (linenr_T)1);
						} 
						i = eap.readfile(generatedArg, ((Object)0), generatedLine2, (linenr_T)0, (linenr_T)LONG_MAX, 0);
				} 
				if (i != 1) {
					if (!ModernizedCProgram.aborting()) {
						ModernizedCProgram.semsg(((byte)(e_notopen)), generatedArg);
					} 
				} else {
						if (empty && exmode_active) {
							if (generatedLine2 == /* Delete the empty line that remains.  Historically ex does
									 * this but vi doesn't. */0) {
								lnum = generatedMl_line_count;
							} else {
									lnum = 1;
							} 
							if (ModernizedCProgram.ml_get(lnum) == (byte)'\000' && ModernizedCProgram.u_savedel(lnum, -1024) == 1) {
								ModernizedCProgram.ml_delete(lnum, 0);
								if (ModernizedCProgram.curwin.getW_cursor().getLnum() > 1 && ModernizedCProgram.curwin.getW_cursor().getLnum() >= lnum) {
									--ModernizedCProgram.curwin.getW_cursor().getLnum();
								} 
								ModernizedCProgram.deleted_lines_mark(lnum, -1024);
							} 
						} 
						ModernizedCProgram.redraw_curbuf_later(10);
				} 
		} 
	}
	public void ex_cd() {
		char_u new_dir = new char_u();
		Object[] generatedArg = this.getArg();
		new_dir = generatedArg;
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedForceit = this.getForceit();
		// for non-UNIX ":cd" means: print current directoryif (new_dir == (byte)'\000') {
			((Object)0).ex_pwd();
		} else {
				cdscope_T scope = .CDSCOPE_GLOBAL;
				if (generatedCmdidx == CMD_index.CMD_lcd || generatedCmdidx == CMD_index.CMD_lchdir) {
					scope = .CDSCOPE_WINDOW;
				}  else if (generatedCmdidx == CMD_index.CMD_tcd || generatedCmdidx == CMD_index.CMD_tchdir) {
					scope = .CDSCOPE_TABPAGE;
				} 
				if (ModernizedCProgram.changedir_func(new_dir, generatedForceit, scope)) {
					if (ModernizedCProgram.KeyTyped || ModernizedCProgram.p_verbose >= 5) {
						eap.ex_pwd();
					} 
				} 
		} 
	}
	/*
	 * ":pwd".
	 */
	public void ex_pwd() {
		if (ModernizedCProgram.mch_dirname(ModernizedCProgram.NameBuff, 1024) == 1) {
			ModernizedCProgram.slash_adjust(ModernizedCProgram.NameBuff);
			ModernizedCProgram.msg((byte)ModernizedCProgram.NameBuff);
		} else {
				ModernizedCProgram.emsg(((byte)("E187: Unknown"/*
				 * ":=".
				 */)));
		} 
	}
	public void ex_equal() {
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.smsg("%ld", (long)generatedLine2);
		eap.ex_may_print();
	}
	public void ex_sleep() {
		int n;
		long len;
		if (ModernizedCProgram.cursor_valid()) {
			n = (ModernizedCProgram.curwin.getW_winrow() + ModernizedCProgram.curwin.getW_winbar_height()) + ModernizedCProgram.curwin.getW_wrow() - ModernizedCProgram.msg_scrolled;
			if (n >= 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/windgoto((int)n, ModernizedCProgram.curwin.getW_wincol() + ModernizedCProgram.curwin.getW_wcol());
			} 
		} 
		Object generatedLine2 = this.getLine2();
		len = generatedLine2;
		Object[] generatedArg = this.getArg();
		switch (generatedArg) {
		case (byte)'\000':
				len *= -1024;
				break;
		case (byte)'m':
				break;
		default:
				ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
				return /*Error: Unsupported expression*/;
		}
		ModernizedCProgram.do_sleep(len/*
		 * Sleep for "msec" milliseconds, but keep checking for a CTRL-C every second.
		 */);
	}
	public void ex_winsize() {
		int w;
		int h;
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u p = new char_u();
		w = ModernizedCProgram.getdigits(arg);
		arg = ModernizedCProgram.skipwhite(arg);
		p = arg;
		h = ModernizedCProgram.getdigits(arg);
		if (p != (byte)'\000' && arg == (byte)'\000') {
			ModernizedCProgram.set_shellsize(w, h, 1);
		} else {
				ModernizedCProgram.emsg(((byte)("E465: :winsize requires two number arguments")));
		} 
	}
	public void ex_wincmd() {
		int xchar = (byte)'\000';
		char_u p = new char_u();
		Object[] generatedArg = this.getArg();
		if (generatedArg == (byte)'g' || generatedArg == 7) {
			if (generatedArg[1] == /* CTRL-W g and CTRL-W CTRL-G  have an extra command character */(byte)'\000') {
				ModernizedCProgram.emsg(((byte)(e_invarg)));
				return /*Error: Unsupported expression*/;
			} 
			xchar = generatedArg[1];
			p = generatedArg + 2;
		} else {
				p = generatedArg + 1;
		} 
		this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
		p = ModernizedCProgram.skipwhite(p);
		Object generatedNextcmd = this.getNextcmd();
		int generatedSkip = this.getSkip();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (p != (byte)'\000' && p != (byte)'"' && generatedNextcmd == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
		}  else if (!generatedSkip) {
			postponed_split_flags = ModernizedCProgram.cmdmod.getSplit();
			postponed_split_tab = ModernizedCProgram.cmdmod.getTab();
			ModernizedCProgram.do_window(generatedArg, generatedAddr_count > 0 ? generatedLine2 : -1024, xchar);
			postponed_split_flags = 0;
			postponed_split_tab = 0;
		} 
	}
	/*
	 * ":winpos".
	 */
	public void ex_winpos() {
		int x;
		int y;
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u p = new char_u();
		if (arg == (byte)'\000') {
			if (ModernizedCProgram.mch_get_winpos(x, y) != 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff, ((byte)("Window position: X %d, Y %d")), x, y);
				ModernizedCProgram.msg((byte)ModernizedCProgram.IObuff);
			} else {
					ModernizedCProgram.emsg(((byte)("E188: Obtaining window position not implemented for this platform")));
			} 
		} else {
				x = ModernizedCProgram.getdigits(arg);
				arg = ModernizedCProgram.skipwhite(arg);
				p = arg;
				y = ModernizedCProgram.getdigits(arg);
				if (p == (byte)'\000' || arg != (byte)'\000') {
					ModernizedCProgram.emsg(((byte)("E466: :winpos requires two number arguments")));
					return /*Error: Unsupported expression*/;
				} 
				ModernizedCProgram.mch_set_winpos(x, y);
		} 
	}
	/*
	 * Handle command that work like operators: ":delete", ":yank", ":>" and ":<".
	 */
	public void ex_operators() {
		oparg_T oa = new oparg_T();
		oa.clear_oparg();
		int generatedRegname = this.getRegname();
		oa.setRegname(generatedRegname);
		Object generatedLine1 = this.getLine1();
		 generatedStart = oa.getStart();
		generatedStart.setLnum(generatedLine1);
		Object generatedLine2 = this.getLine2();
		 generatedEnd = oa.getEnd();
		generatedEnd.setLnum(generatedLine2);
		oa.setLine_count(generatedLine2 - generatedLine1 + 1);
		oa.setMotion_type(1);
		virtual_op = 0;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx != /* position cursor for undo */CMD_index.CMD_yank) {
			ModernizedCProgram.setpcmark();
			ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1);
			ModernizedCProgram.beginline(2 | 4);
		} 
		if (VIsual_active) {
			ModernizedCProgram.end_visual_mode();
		} 
		int generatedAmount = this.getAmount();
		switch (generatedCmdidx) {
		case CMD_index.CMD_yank:
				oa.setOp_type(2);
				(Object)oa.op_yank(0, 1);
				break;
		case CMD_index.CMD_delete:
				oa.setOp_type(1);
				oa.op_delete();
				break;
		default:
				if ((generatedCmdidx == CMD_index.CMD_rshift) ^ ModernizedCProgram.curwin.getW_onebuf_opt().getWo_rl()) {
					oa.setOp_type(5);
				} else {
						oa.setOp_type(4);
				} 
				oa.op_shift(0, generatedAmount);
				break;
		}
		virtual_op = 2;
		eap/*
		 * ":put".
		 */.ex_may_print();
	}
	public void ex_put() {
		Object generatedLine2 = this.getLine2();
		if (generatedLine2 == /* ":0put" works like ":1put!". */0) {
			this.setLine2(1);
			this.setForceit(1);
		} 
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
		int generatedRegname = this.getRegname();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.do_put(generatedRegname, generatedForceit ? (true) : 1, -1024, 8 | 4/*
		 * Handle ":copy" and ":move".
		 */);
	}
	public void ex_copymove() {
		long n;
		Object[] generatedArg = this.getArg();
		 generatedAddr_type = this.getAddr_type();
		n = eap.get_address(generatedArg, generatedAddr_type, 0, 0, 0, 1);
		if (generatedArg == ((Object)/* error detected */0)) {
			this.setNextcmd(((Object)0));
			return /*Error: Unsupported expression*/;
		} 
		eap/*
		     * move or copy lines from 'eap->line1'-'eap->line2' to below line 'n'
		     */.get_flags();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (n == LONG_MAX || n < 0 || n > generatedMl_line_count) {
			ModernizedCProgram.emsg(((byte)(e_invrange)));
			return /*Error: Unsupported expression*/;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (generatedCmdidx == CMD_index.CMD_move) {
			if (ModernizedCProgram.do_move(generatedLine1, generatedLine2, n) == 0) {
				return /*Error: Unsupported expression*/;
			} 
		} else {
				ModernizedCProgram.ex_copy(generatedLine1, generatedLine2, n);
		} 
		ModernizedCProgram.u_clearline();
		ModernizedCProgram.beginline(2 | 4);
		eap/*
		 * Print the current line if flags were given to the Ex command.
		 */.ex_may_print();
	}
	public void ex_may_print() {
		int generatedFlags = this.getFlags();
		if (generatedFlags != 0) {
			ModernizedCProgram.print_line(ModernizedCProgram.curwin.getW_cursor().getLnum(), (generatedFlags & -1024), (generatedFlags & -1024));
			ex_no_reprint = 1/*
			 * ":smagic" and ":snomagic".
			 */;
		} 
	}
	public void ex_submagic() {
		int magic_save = ModernizedCProgram.p_magic;
		CMD_index generatedCmdidx = this.getCmdidx();
		ModernizedCProgram.p_magic = (generatedCmdidx == CMD_index.CMD_smagic);
		eap.do_sub();
		ModernizedCProgram.p_magic = magic_save/*
		 * ":join".
		 */;
	}
	public void ex_join() {
		Object generatedLine1 = this.getLine1();
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1);
		Object generatedLine2 = this.getLine2();
		int generatedAddr_count = this.getAddr_count();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedLine1 == generatedLine2) {
			if (generatedAddr_count >= /* :2,2join does nothing */2) {
				return /*Error: Unsupported expression*/;
			} 
			if (generatedLine2 == generatedMl_line_count) {
				ModernizedCProgram.beep_flush();
				return /*Error: Unsupported expression*/;
			} 
			++generatedLine2;
		} 
		int generatedForceit = this.getForceit();
		(Object)ModernizedCProgram.do_join(generatedLine2 - generatedLine1 + 1, !generatedForceit, 1, 1, 1);
		ModernizedCProgram.beginline(1 | 4);
		eap/*
		 * ":[addr]@r" or ":[addr]*r": execute register
		 */.ex_may_print();
	}
	public void ex_at() {
		int c;
		int prev_len = ModernizedCProgram.typebuf.getTb_len();
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
		ModernizedCProgram.check_cursor_col();
		Object[] generatedArg = this.getArg();
		c = generatedArg;
		Object[] generatedCmd = this.getCmd();
		if (c == (byte)'\000' || (c == (byte)'*' && generatedCmd == (byte)'*')) {
			c = (byte)'@';
		} 
		if (ModernizedCProgram.do_execreg(c, 1, ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'e') != ((Object)0), /* Put the register in the typeahead buffer with the "silent" flag. */1) == 0) {
			ModernizedCProgram.beep_flush();
		} else {
				int save_efr = exec_from_reg;
				exec_from_reg = 1/*
					 * Execute from the typeahead buffer.
					 * Continue until the stuff buffer is empty and all added characters
					 * have been consumed.
					 */;
				while (!ModernizedCProgram.stuff_empty() || ModernizedCProgram.typebuf.getTb_len() > prev_len) {
					(Object)ModernizedCProgram.do_cmdline(((Object)0), getexline, ((Object)0), -1024 | -1024);
				}
				exec_from_reg = save_efr/*
				 * ":!".
				 */;
		} 
	}
	public void ex_bang() {
		int generatedAddr_count = this.getAddr_count();
		int generatedForceit = this.getForceit();
		eap.do_bang(generatedAddr_count, generatedForceit, 1, 1/*
		 * ":undo".
		 */);
	}
	public void ex_undo() {
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count == /* :undo 123 */1) {
			ModernizedCProgram.undo_time(generatedLine2, 0, 0, 1);
		} else {
				ModernizedCProgram.u_undo(1);
		} 
	}
	public void ex_wundo() {
		char_u[] hash = new char_u();
		ModernizedCProgram.u_compute_hash(hash);
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		curbuf.u_write_undo(generatedArg, generatedForceit, hash);
	}
	public void ex_rundo() {
		char_u[] hash = new char_u();
		ModernizedCProgram.u_compute_hash(hash);
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.u_read_undo(generatedArg, hash, ((Object)0/*
		 * ":redo".
		 */));
	}
	public void ex_redo() {
		ModernizedCProgram.u_redo(1/*
		 * ":earlier" and ":later".
		 */);
	}
	public void ex_later() {
		long count = 0;
		int sec = 0;
		int file = 0;
		Object[] generatedArg = this.getArg();
		char_u p = generatedArg;
		if (p == (byte)'\000') {
			count = 1;
		}  else if (/*Error: Function owner not recognized*/isdigit(p)) {
			count = ModernizedCProgram.getdigits(p);
			switch (p) {
			case (byte)'m':
					++p;
					sec = 1;
					count *= 60;
					break;
			case (byte)'s':
					++p;
					sec = 1;
					break;
			case (byte)'h':
					++p;
					sec = 1;
					count *= 60 * 60;
					break;
			case (byte)'f':
					++p;
					file = 1;
					break;
			case (byte)'d':
					++p;
					sec = 1;
					count *= 24 * 60 * 60;
					break;
			}
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		if (p != (byte)'\000') {
			ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
		} else {
				ModernizedCProgram.undo_time(generatedCmdidx == CMD_index.CMD_earlier ? -count : count, sec, file, 0/*
				 * ":redir": start/stop redirection.
				 */);
		} 
	}
	public void ex_redir() {
		byte mode;
		char_u fname = new char_u();
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		if (redir_execute) {
			ModernizedCProgram.emsg(((byte)("E930: Cannot use :redir inside execute()")));
			return /*Error: Unsupported expression*/;
		} 
		int generatedForceit = this.getForceit();
		if (ModernizedCProgram.vim_stricmp((byte)(generatedArg), (byte)("END")) == 0) {
			ModernizedCProgram.close_redir();
		} else {
				if (arg == (byte)'>') {
					++arg;
					if (arg == (byte)'>') {
						++arg;
						mode = "a";
					} else {
							mode = "w";
					} 
					arg = ModernizedCProgram.skipwhite(arg);
					ModernizedCProgram.close_redir();
					fname = ModernizedCProgram.expand_env_save(/* Expand environment variables and "~/". */arg);
					if (fname == ((Object)0)) {
						return /*Error: Unsupported expression*/;
					} 
					redir_fd = ModernizedCProgram.open_exfile(fname, generatedForceit, /* since dialog already asked */mode);
					ModernizedCProgram.vim_free(fname);
				}  else if (arg == (byte)'@') {
					ModernizedCProgram.close_redir();
					++arg;
					if ((((int)(arg) - (byte)'A' < 26) || ((int)(arg) - (byte)'a' < 26)) || arg == (byte)'*' || arg == (byte)'+' || arg == (byte)'"') {
						redir_reg = arg++;
						if (arg == (byte)'>' && arg[1] == /* append */(byte)'>') {
							arg += 2;
						} else {
								if (arg == /* Can use both "@a" and "@a>". */(byte)'>') {
									arg/* Make register empty when not using @A-@Z and the
											     * command is valid. */++;
								} 
								if (arg == (byte)'\000' && !/*Error: Function owner not recognized*/isupper(redir_reg)) {
									ModernizedCProgram.write_reg_contents(redir_reg, (char_u)"", -1, 0);
								} 
						} 
					} 
					if (arg != (byte)'\000') {
						redir_reg = 0;
						ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
					} 
				}  else if (arg == (byte)'=' && arg[1] == (byte)'>') {
					int append;
					ModernizedCProgram.close_redir();
					arg += 2;
					if (arg == (byte)'>') {
						++arg;
						append = 1;
					} else {
							append = 0;
					} 
					if (ModernizedCProgram.var_redir_start(ModernizedCProgram.skipwhite(arg), append) == 1) {
						redir_vname = 1;
					} 
				} else {
						ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
				} 
		} 
		if (redir_fd != ((Object)/* Make sure redirection is not off.  Can happen for cmdline completion
		     * that indirectly invokes a command to catch its output. */0) || redir_reg || redir_vname) {
			redir_off = 0/*
			 * ":redraw": force redraw
			 */;
		} 
	}
	public void ex_redraw() {
		int r = RedrawingDisabled;
		int p = ModernizedCProgram.p_lz;
		RedrawingDisabled = 0;
		ModernizedCProgram.p_lz = 0;
		ModernizedCProgram.validate_cursor();
		ModernizedCProgram.update_topline();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.update_screen(generatedForceit ? 50 : VIsual_active ? 20 : 0);
		if (need_maketitle) {
			ModernizedCProgram.maketitle();
		} 
		ModernizedCProgram.resize_console_buf();
		RedrawingDisabled = r;
		ModernizedCProgram.p_lz = p;
		msg_didout = /* Reset msg_didout, so that a message that's there is overwritten. */0;
		ModernizedCProgram.msg_col = 0;
		need_wait_return = /* No need to wait after an intentional redraw. */0;
		ModernizedCProgram.out_flush();
	}
	public void ex_redrawstatus() {
		int r = RedrawingDisabled;
		int p = ModernizedCProgram.p_lz;
		RedrawingDisabled = 0;
		ModernizedCProgram.p_lz = 0;
		int generatedForceit = this.getForceit();
		if (generatedForceit) {
			ModernizedCProgram.status_redraw_all();
		} else {
				ModernizedCProgram.status_redraw_curbuf();
		} 
		ModernizedCProgram.update_screen(VIsual_active ? 20 : 0);
		RedrawingDisabled = r;
		ModernizedCProgram.p_lz = p;
		ModernizedCProgram.out_flush();
	}
	public void ex_redrawtabline() {
		int r = RedrawingDisabled;
		int p = ModernizedCProgram.p_lz;
		RedrawingDisabled = 0;
		ModernizedCProgram.p_lz = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/draw_tabline();
		RedrawingDisabled = r;
		ModernizedCProgram.p_lz = p;
		ModernizedCProgram.out_flush();
	}
	public void ex_mark() {
		pos_T pos = new pos_T();
		Object[] generatedArg = this.getArg();
		Object generatedLine2 = this.getLine2();
		if (generatedArg == /* No argument? */(byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_argreq)));
		}  else if (generatedArg[1] != /* more than one character? */(byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_trailing)));
		} else {
				pos = ModernizedCProgram.curwin.getW_cursor();
				ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
				ModernizedCProgram.beginline(1 | 4);
				if (ModernizedCProgram.setmark(generatedArg) == /* set mark */0) {
					ModernizedCProgram.emsg(((byte)("E191: Argument must be a letter or forward/backward quote")));
				} 
				ModernizedCProgram.curwin.setW_cursor(/* restore curwin->w_cursor */pos/*
				 * Update w_topline, w_leftcol and the cursor position.
				 */);
		} 
	}
	public void ex_normal() {
		save_state_T save_state = new save_state_T();
		char_u arg = ((Object)0);
		int l;
		char_u p = new char_u();
		if (ex_normal_lock > 0) {
			ModernizedCProgram.emsg(((byte)(e_secure)));
			return /*Error: Unsupported expression*/;
		} 
		if (ex_normal_busy >= ModernizedCProgram.p_mmd) {
			ModernizedCProgram.emsg(((byte)("E192: Recursive use of :normal too deep")));
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		if (has_mbyte) {
			int len = 0;
			for (p = generatedArg; p != (byte)'\000'; ++/* Count the number of characters to be escaped. */p) {
				for (l = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p) - 1; l > 0; --/* leadbyte CSI */l) {
					if (++p == (/* trailbyte K_SPECIAL or CSI */true)) {
						len += 2;
					} 
				}
			}
			if (len > 0) {
				arg = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(generatedArg)) + len + 1);
				if (arg != ((Object)0)) {
					len = 0;
					for (p = generatedArg; p != (byte)'\000'; ++p) {
						arg[len++] = p;
						for (l = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p) - 1; l > 0; --l) {
							arg[len++] = ++p;
							if (p == (true)) {
								arg[len++] = 254;
								arg[len++] = ((byte)'X');
							} 
						}
						arg[len] = (byte)'\000';
					}
				} 
			} 
		} 
		++ex_normal_busy;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		int generatedForceit = this.getForceit();
		if (save_state/*
			 * Repeat the :normal command for each line in the range.  When no
			 * range given, execute it just once, without positioning the cursor
			 * first.
			 */.save_current_state()) {
			do {
				if (generatedAddr_count != 0) {
					ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine1++);
					ModernizedCProgram.curwin.getW_cursor().setCol(0);
					ModernizedCProgram.curwin.check_cursor_moved();
				} 
				ModernizedCProgram.exec_normal_cmd(arg != ((Object)0) ? arg : generatedArg, generatedForceit ? -1 : 0, 0);
			} while (generatedAddr_count > 0 && generatedLine1 <= generatedLine2 && !got_int);
		} 
		ModernizedCProgram.update_topline_cursor();
		save_state.restore_current_state();
		--ex_normal_busy;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setmouse();
		ModernizedCProgram.ui_cursor_shape();
		ModernizedCProgram.vim_free(arg/*
		 * ":startinsert", ":startreplace" and ":startgreplace"
		 */);
	}
	public void ex_startinsert() {
		int generatedForceit = this.getForceit();
		if (generatedForceit) {
			if (!ModernizedCProgram.curwin.getW_cursor().getLnum()) {
				ModernizedCProgram.curwin.getW_cursor().setLnum(1);
			} 
			ModernizedCProgram.set_cursor_for_append_to_line();
		} 
		// Ignore the command when already in Insert mode.  Inserting an// expression register that invokes a function can do this.if (State & -1024) {
			return /*Error: Unsupported expression*/;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_startinsert) {
			restart_edit = (byte)'a';
		}  else if (generatedCmdidx == CMD_index.CMD_startreplace) {
			restart_edit = (byte)'R';
		} else {
				restart_edit = (byte)'V';
		} 
		if (!generatedForceit) {
			if (generatedCmdidx == CMD_index.CMD_startinsert) {
				restart_edit = (byte)'i';
			} 
			ModernizedCProgram.curwin.setW_curswant(0/*
			 * ":stopinsert"
			 */);
		} 
	}
	public void ex_stopinsert() {
		restart_edit = 0;
		ModernizedCProgram.stop_insert_mode = 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/clearmode();
	}
	public void ex_checkpath() {
		int generatedForceit = this.getForceit();
		ModernizedCProgram.find_pattern_in_path(((Object)0), 0, 0, 0, 0, 3, -1024, generatedForceit ? 4 : 1, (linenr_T)1, (linenr_T)LONG_MAX/*
		 * ":psearch"
		 */);
	}
	public void ex_psearch() {
		g_do_tagpreview = p_pvh;
		eap.ex_findpat();
		g_do_tagpreview = 0;
	}
	public void ex_findpat() {
		int whole = 1;
		long n;
		char_u p = new char_u();
		int action;
		CMD_index generatedCmdidx = this.getCmdidx();
		switch (cmdnames[generatedCmdidx].getCmd_name()[2]) {
		case /* ":psearch", ":isearch" and ":dsearch" */(byte)'e':
				if (cmdnames[generatedCmdidx].getCmd_name()[0] == (byte)'p') {
					action = 2;
				} else {
						action = 1;
				} 
				break;
		case /* ":ilist" and ":dlist" */(byte)'i':
				action = 4;
				break;
		case /* ":ijump" and ":djump" */(byte)'u':
				action = 2;
				break;
		default:
				action = 3;
				break;
		}
		n = 1;
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.vim_isdigit(generatedArg)) {
			n = ModernizedCProgram.getdigits(generatedArg);
			this.setArg(ModernizedCProgram.skipwhite(generatedArg));
		} 
		if (generatedArg == /* Match regexp, not just whole words */(byte)'/') {
			whole = 0;
			++generatedArg;
			p = ModernizedCProgram.skip_regexp(generatedArg, (byte)'/', ModernizedCProgram.p_magic, ((Object)0));
			if (p) {
				p++ = (byte)'\000';
				p = ModernizedCProgram.skipwhite(p);
				if (!ModernizedCProgram.ends_excmd(/* Check for trailing illegal characters */p)) {
					this.setErrmsg(e_trailing);
				} else {
						this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
				} 
			} 
		} 
		int generatedSkip = this.getSkip();
		int generatedForceit = this.getForceit();
		Object[] generatedCmd = this.getCmd();
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (!generatedSkip) {
			ModernizedCProgram.find_pattern_in_path(generatedArg, 0, (int)/*Error: Function owner not recognized*/strlen((byte)(generatedArg)), whole, !generatedForceit, generatedCmd == (byte)'d' ? 2 : 1, n, action, generatedLine1, generatedLine2);
		} 
	}
	/*
	 * ":ptag", ":ptselect", ":ptjump", ":ptnext", etc.
	 */
	public void ex_ptag() {
		g_do_tagpreview = /* will be reset to 0 in ex_tag_cmd() */p_pvh;
		CMD_index generatedCmdidx = this.getCmdidx();
		eap.ex_tag_cmd(cmdnames[generatedCmdidx].getCmd_name() + 1/*
		 * ":pedit"
		 */);
	}
	public void ex_pedit() {
		win_T curwin_save = ModernizedCProgram.curwin;
		// Open the preview window or popup and make it the current window.// Open the preview window or popup and make it the current window.g_do_tagpreview = p_pvh;
		ModernizedCProgram.prepare_tagpreview(1, 1, 0);
		// Edit the file.// Edit the file.ModernizedCProgram.do_exedit(eap, ((Object)0));
		if (ModernizedCProgram.curwin != curwin_save && curwin_save.win_valid()) {
			ModernizedCProgram.validate_cursor();
			ModernizedCProgram.redraw_later(10);
			curwin_save.win_enter(1);
		}  else if (((ModernizedCProgram.curwin).getW_popup_flags() != 0)) {
			ModernizedCProgram.firstwin.win_enter(1);
		} 
		g_do_tagpreview = 0/*
		 * ":stag", ":stselect" and ":stjump".
		 */;
	}
	public void ex_stag() {
		postponed_split = -1;
		postponed_split_flags = ModernizedCProgram.cmdmod.getSplit();
		postponed_split_tab = ModernizedCProgram.cmdmod.getTab();
		CMD_index generatedCmdidx = this.getCmdidx();
		eap.ex_tag_cmd(cmdnames[generatedCmdidx].getCmd_name() + 1);
		postponed_split_flags = 0;
		postponed_split_tab = 0/*
		 * ":tag", ":tselect", ":tjump", ":tnext", etc.
		 */;
	}
	public void ex_tag() {
		CMD_index generatedCmdidx = this.getCmdidx();
		eap.ex_tag_cmd(cmdnames[generatedCmdidx].getCmd_name());
	}
	public void ex_tag_cmd(Object[] name) {
		int cmd;
		switch (name[1]) {
		case (byte)'l':
				cmd = /* ":tlast" */6;
				break;
		case (byte)'o':
				cmd = /* ":pop" */2;
				break;
		case /* ":tfirst" */(byte)'f':
		case (byte)'s':
				cmd = /* ":tselect" */7;
				break;
		case (byte)'j':
				cmd = /* ":tjump" */9;
				break;
		case (byte)'p':
				cmd = /* ":tprevious" */4;
				break;
		case (byte)'N':
				cmd = /* ":tNext" */4;
				break;
		case (byte)'n':
				cmd = /* ":tnext" */3;
				break;
		case (byte)'r':
				cmd = /* ":trewind" */5;
				break;
		default:
				cmd = 1;
				break;
		}
		if (name[0] == (byte)'l') {
			cmd = 11;
		} 
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.do_tag(generatedArg, cmd, generatedAddr_count > 0 ? (int)generatedLine2 : 1, generatedForceit, 1/*
		 * Check "str" for starting with a special cmdline variable.
		 * If found return one of the SPEC_ values and set "*usedlen" to the length of
		 * the variable.  Otherwise return -1 and "*usedlen" is unchanged.
		 */);
	}
	public void ex_behave() {
		Object[] generatedArg = this.getArg();
		if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("mswin")) == 0) {
			ModernizedCProgram.set_option_value((char_u)"selection", -1024, (char_u)"exclusive", 0);
			ModernizedCProgram.set_option_value((char_u)"selectmode", -1024, (char_u)"mouse,key", 0);
			ModernizedCProgram.set_option_value((char_u)"mousemodel", -1024, (char_u)"popup", 0);
			ModernizedCProgram.set_option_value((char_u)"keymodel", -1024, (char_u)"startsel,stopsel", 0);
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(generatedArg), (byte)("xterm")) == 0) {
			ModernizedCProgram.set_option_value((char_u)"selection", -1024, (char_u)"inclusive", 0);
			ModernizedCProgram.set_option_value((char_u)"selectmode", -1024, (char_u)"", 0);
			ModernizedCProgram.set_option_value((char_u)"mousemodel", -1024, (char_u)"extend", 0);
			ModernizedCProgram.set_option_value((char_u)"keymodel", -1024, (char_u)"", 0);
		} else {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), generatedArg);
		} 
	}
	public void ex_filetype() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int plugin = 0;
		int indent = 0;
		if (generatedArg == (byte)'\000') {
			ModernizedCProgram.smsg(/* Print current status. */"filetype detection:%s  plugin:%s  indent:%s", ModernizedCProgram.filetype_detect ? "ON" : "OFF", ModernizedCProgram.filetype_plugin ? (ModernizedCProgram.filetype_detect ? "ON" : "(on)") : "OFF", ModernizedCProgram.filetype_indent ? (ModernizedCProgram.filetype_detect ? "ON" : "(on)") : "OFF");
			return /*Error: Unsupported expression*/;
		} 
		/* Accept "plugin" and "indent" in any order. */for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("plugin"), (size_t)(true)) == 0) {
				plugin = 1;
				arg = ModernizedCProgram.skipwhite(arg + 6);
				continue;
			} 
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("indent"), (size_t)(true)) == 0) {
				indent = 1;
				arg = ModernizedCProgram.skipwhite(arg + 6);
				continue;
			} 
			break;
		}
		if (/*Error: Function owner not recognized*/strcmp((byte)(arg), (byte)("on")) == 0 || /*Error: Function owner not recognized*/strcmp((byte)(arg), (byte)("detect")) == 0) {
			if (arg == (byte)'o' || !ModernizedCProgram.filetype_detect) {
				ModernizedCProgram.source_runtime((char_u)"filetype.vim", -1024);
				ModernizedCProgram.filetype_detect = 1;
				if (plugin) {
					ModernizedCProgram.source_runtime((char_u)"ftplugin.vim", -1024);
					ModernizedCProgram.filetype_plugin = 1;
				} 
				if (indent) {
					ModernizedCProgram.source_runtime((char_u)"indent.vim", -1024);
					ModernizedCProgram.filetype_indent = 1;
				} 
			} 
			if (arg == (byte)'d') {
				(Object)ModernizedCProgram.do_doautocmd((char_u)"filetypedetect BufRead", 1, ((Object)0));
				ModernizedCProgram.do_modelines(0);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp((byte)(arg), (byte)("off")) == 0) {
			if (plugin || indent) {
				if (plugin) {
					ModernizedCProgram.source_runtime((char_u)"ftplugof.vim", -1024);
					ModernizedCProgram.filetype_plugin = 0;
				} 
				if (indent) {
					ModernizedCProgram.source_runtime((char_u)"indoff.vim", -1024);
					ModernizedCProgram.filetype_indent = 0;
				} 
			} else {
					ModernizedCProgram.source_runtime((char_u)"ftoff.vim", -1024);
					ModernizedCProgram.filetype_detect = 0;
			} 
		} else {
				ModernizedCProgram.semsg(((byte)(e_invarg2)), arg/*
				 * ":setfiletype [FALLBACK] {name}"
				 */);
		} 
	}
	public void ex_setfiletype() {
		Object[] generatedArg = this.getArg();
		if (!did_filetype) {
			char_u arg = generatedArg;
			if (/*Error: Function owner not recognized*/strncmp((byte)(arg), (byte)("FALLBACK "), (size_t)(true)) == 0) {
				arg += 9;
			} 
			ModernizedCProgram.set_option_value((char_u)"filetype", -1024, arg, 4);
			if (arg != generatedArg) {
				did_filetype = 0;
			} 
		} 
	}
	public void ex_digraphs() {
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		if (generatedArg != (byte)'\000') {
			ModernizedCProgram.putdigraph(generatedArg);
		} else {
				ModernizedCProgram.listdigraphs(generatedForceit);
		} 
	}
	public void ex_set() {
		int flags = 0;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_setlocal) {
			flags = 4;
		}  else if (generatedCmdidx == CMD_index.CMD_setglobal) {
			flags = 2;
		} 
		Object[] generatedArg = this.getArg();
		(Object)ModernizedCProgram.do_set(generatedArg, flags);
	}
	public void ex_nohlsearch() {
		ModernizedCProgram.set_no_hlsearch(1);
		ModernizedCProgram.redraw_all_later(35);
	}
	/*
	 * ":X": Get crypt key
	 */
	public void ex_X() {
		ModernizedCProgram.crypt_check_current_method();
		(Object)ModernizedCProgram.crypt_get_key(1, 1);
	}
	public void ex_fold() {
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		if (ModernizedCProgram.foldManualAllowed(1)) {
			ModernizedCProgram.foldCreate(generatedLine1, generatedLine2);
		} 
	}
	public void ex_foldopen() {
		Object generatedLine1 = this.getLine1();
		Object generatedLine2 = this.getLine2();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedForceit = this.getForceit();
		ModernizedCProgram.opFoldRange(generatedLine1, generatedLine2, generatedCmdidx == CMD_index.CMD_foldopen, generatedForceit, 0);
	}
	public void ex_folddo() {
		linenr_T lnum = new linenr_T();
		ModernizedCProgram.start_global_changes();
		Object generatedLine2 = this.getLine2();
		CMD_index generatedCmdidx = this.getCmdidx();
		Object generatedLine1 = this.getLine1();
		for (lnum = generatedLine1; lnum <= generatedLine2; ++/* First set the marks for all lines closed/open. */lnum) {
			if (ModernizedCProgram.hasFolding(lnum, ((Object)0), ((Object)0)) == (generatedCmdidx == CMD_index.CMD_folddoclosed)) {
				ModernizedCProgram.ml_setmarked(lnum);
			} 
		}
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.global_exe(generatedArg);
		ModernizedCProgram.ml_clearmarked();
		ModernizedCProgram.end_global_changes();
	}
	public void ex_args() {
		int i;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx != CMD_index.CMD_args) {
			(ModernizedCProgram.curwin).getW_alist().alist_unlink();
			if (generatedCmdidx == CMD_index.CMD_argglobal) {
				(ModernizedCProgram.curwin).setW_alist(ModernizedCProgram.global_alist);
			} else {
					ModernizedCProgram.alist_new();
			} 
		} 
		Object[] generatedArg = this.getArg();
		int generatedGa_len = gap.getGa_len();
		if (generatedArg != (byte)'\000') {
			eap.ex_next();
		}  else if (generatedCmdidx == CMD_index.CMD_args) {
			if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) > 0) {
				char_u items = (char_u)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())));
				if (items != ((Object)0)) {
					ModernizedCProgram.gotocmdline(1);
					for (i = 0; i < ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()); ++i) {
						items[i] = ((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[i].alist_name();
					}
					ModernizedCProgram.list_in_columns(items, ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()), ModernizedCProgram.curwin.getW_arg_idx());
					ModernizedCProgram.vim_free(items);
				} 
			} 
		}  else if (generatedCmdidx == CMD_index.CMD_arglocal) {
			garray_T gap = ModernizedCProgram.curwin.getW_alist().getAl_ga();
			if (gap.ga_grow((ModernizedCProgram.global_alist.getAl_ga().getGa_len())) == 1) {
				for (i = 0; i < (ModernizedCProgram.global_alist.getAl_ga().getGa_len()); ++i) {
					if (((aentry_T)ModernizedCProgram.global_alist.getAl_ga().getGa_data())[i].getAe_fname() != ((Object)0)) {
						((aentry_T)((ModernizedCProgram.curwin.getW_alist()).getAl_ga().getGa_data()))[generatedGa_len].setAe_fname(ModernizedCProgram.vim_strsave(((aentry_T)ModernizedCProgram.global_alist.getAl_ga().getGa_data())[i].getAe_fname()));
						((aentry_T)((ModernizedCProgram.curwin.getW_alist()).getAl_ga().getGa_data()))[generatedGa_len].setAe_fnum(((aentry_T)ModernizedCProgram.global_alist.getAl_ga().getGa_data())[i].getAe_fnum());
						++generatedGa_len;
					} 
				}
			} 
		} 
		// ":args file ..": define new argument list, handle like ":next"
	}
	/*
	 * ":previous", ":sprevious", ":Next" and ":sNext".
	 */
	public void ex_previous() {
		Object generatedLine2 = this.getLine2();
		// If past the last one already, go to the last one.if (ModernizedCProgram.curwin.getW_arg_idx() - (int)generatedLine2 >= ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
			eap.do_argfile(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) - 1);
		} else {
				eap.do_argfile(ModernizedCProgram.curwin.getW_arg_idx() - (int)generatedLine2);
		} 
	}
	public void ex_rewind() {
		eap.do_argfile(0/*
		 * ":last" and ":slast".
		 */);
	}
	public void ex_last() {
		eap.do_argfile(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) - 1/*
		 * ":argument" and ":sargument".
		 */);
	}
	public void ex_argument() {
		int i;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > 0) {
			i = generatedLine2 - 1;
		} else {
				i = ModernizedCProgram.curwin.getW_arg_idx();
		} 
		eap.do_argfile(i/*
		 * Edit file "argn" of the argument lists.
		 */);
	}
	public void do_argfile(int argn) {
		int other;
		char_u p = new char_u();
		int old_arg_idx = ModernizedCProgram.curwin.getW_arg_idx();
		if (ModernizedCProgram.error_if_popup_window()) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedCmd = this.getCmd();
		int generatedForceit = this.getForceit();
		CMD_index generatedCmdidx = this.getCmdidx();
		if (argn < 0 || argn >= ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
			if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) <= 1) {
				ModernizedCProgram.emsg(((byte)("E163: There is only one file to edit")));
			}  else if (argn < 0) {
				ModernizedCProgram.emsg(((byte)("E164: Cannot go before first file")));
			} else {
					ModernizedCProgram.emsg(((byte)("E165: Cannot go beyond last file")));
			} 
		} else {
				ModernizedCProgram.setpcmark();
				if (generatedCmd == (byte)'s' || ModernizedCProgram.cmdmod.getTab() != 0) {
					if (ModernizedCProgram.win_split(0, 0) == 0) {
						return /*Error: Unsupported expression*/;
					} 
					do {
						(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_scb(0);
						(ModernizedCProgram.curwin).getW_onebuf_opt().setWo_crb(0);
					} while (0);
				} else {
						other = 1;
						if (curbuf.buf_hide()) {
							p = ModernizedCProgram.fix_fname(((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[argn].alist_name());
							other = ModernizedCProgram.otherfile(p);
							ModernizedCProgram.vim_free(p);
						} 
						if ((!curbuf.buf_hide() || !other) && curbuf.check_changed(1 | (other ? 0 : 2) | (generatedForceit ? 4 : 0) | 16)) {
							return /*Error: Unsupported expression*/;
						} 
				} 
				ModernizedCProgram.curwin.setW_arg_idx(argn);
				if (argn == ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) - 1 && ModernizedCProgram.curwin.getW_alist() == ModernizedCProgram.global_alist) {
					arg_had_last = 1;
				} 
				if (ModernizedCProgram.do_ecmd(0, ((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[ModernizedCProgram.curwin.getW_arg_idx()].alist_name(), ((Object)0), eap, (linenr_T)-1, (ModernizedCProgram.curwin.getW_buffer().buf_hide() ? -1024 : 0) + (generatedForceit ? -1024 : 0), ModernizedCProgram.curwin) == 0) {
					ModernizedCProgram.curwin.setW_arg_idx(old_arg_idx);
				}  else if (generatedCmdidx != CMD_index.CMD_argdo) {
					ModernizedCProgram.setmark((byte)'\''/*
					 * ":next", and commands that behave like it.
					 */);
				} 
		} 
	}
	public void ex_next() {
		int i;
		// check for changed buffer now, if this fails the argument list is not
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedForceit = this.getForceit();
		Object[] generatedArg = this.getArg();
		Object generatedLine2 = this.getLine2();
		// redefined.if (curbuf.buf_hide() || generatedCmdidx == CMD_index.CMD_snext || !curbuf.check_changed(1 | (generatedForceit ? 4 : 0) | 16)) {
			if (generatedArg != (byte)'\000') {
				if (ModernizedCProgram.do_arglist(generatedArg, 1, 0, 1) == 0) {
					return /*Error: Unsupported expression*/;
				} 
				i = 0;
			} else {
					i = ModernizedCProgram.curwin.getW_arg_idx() + (int)generatedLine2;
			} 
			eap.do_argfile(i/*
			 * ":argedit"
			 */);
		} 
	}
	public void ex_argedit() {
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		int i = generatedAddr_count ? (int)generatedLine2 : ModernizedCProgram.curwin.getW_arg_idx() + 1;
		// Whether curbuf will be reused, curbuf->b_ffname will be set.
		int curbuf_is_reusable = ModernizedCProgram.curbuf_reusable();
		Object[] generatedArg = this.getArg();
		if (ModernizedCProgram.do_arglist(generatedArg, 2, i, 1) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.maketitle();
		memline generatedB_ml = curbuf.getB_ml();
		int generatedMl_flags = generatedB_ml.getMl_flags();
		Object[] generatedB_ffname = curbuf.getB_ffname();
		if (ModernizedCProgram.curwin.getW_arg_idx() == 0 && (generatedMl_flags & 1) && (generatedB_ffname == ((Object)0) || curbuf_is_reusable)) {
			i = 0;
		} 
		if (i < ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
			eap.do_argfile(i/*
			 * ":argadd"
			 */);
		} 
	}
	public void ex_argadd() {
		Object[] generatedArg = this.getArg();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		ModernizedCProgram.do_arglist(generatedArg, 2, generatedAddr_count > 0 ? (int)generatedLine2 : ModernizedCProgram.curwin.getW_arg_idx() + 1, 0);
		ModernizedCProgram.maketitle();
	}
	public void ex_argdelete() {
		int i;
		int n;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		Object generatedLine1 = this.getLine1();
		Object[] generatedArg = this.getArg();
		if (generatedAddr_count > 0) {
			if (generatedLine2 > ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
				this.setLine2(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()));
			} 
			n = generatedLine2 - generatedLine1 + 1;
			if (generatedArg != (byte)'\000') {
				ModernizedCProgram.emsg(((byte)(e_invarg)));
			}  else if (n <= 0) {
				if (generatedLine1 != 1 || generatedLine2 != 0) {
					ModernizedCProgram.emsg(((byte)(e_invrange)));
				} 
			} else {
					for (i = generatedLine1; i <= generatedLine2; ++i) {
						ModernizedCProgram.vim_free(((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data())[i - 1].getAe_fname());
					}
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)(((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data()) + generatedLine1 - 1), (byte)(((aentry_T)(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_data()) + generatedLine2), (size_t)((size_t)((((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) - generatedLine2) * /*Error: Unsupported expression*/)));
					(ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len() -= n;
					if (ModernizedCProgram.curwin.getW_arg_idx() >= generatedLine2) {
						ModernizedCProgram.curwin.getW_arg_idx() -= n;
					}  else if (ModernizedCProgram.curwin.getW_arg_idx() > generatedLine1) {
						ModernizedCProgram.curwin.setW_arg_idx(generatedLine1);
					} 
					if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) == 0) {
						ModernizedCProgram.curwin.setW_arg_idx(0);
					}  else if (ModernizedCProgram.curwin.getW_arg_idx() >= ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
						ModernizedCProgram.curwin.setW_arg_idx(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) - 1);
					} 
			} 
		}  else if (generatedArg == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_argreq)));
		} else {
				ModernizedCProgram.do_arglist(generatedArg, 3, 0, 0);
		} 
		ModernizedCProgram.maketitle();
	}
	public void ex_all() {
		int generatedAddr_count = this.getAddr_count();
		if (generatedAddr_count == 0) {
			this.setLine2(9999);
		} 
		Object generatedLine2 = this.getLine2();
		int generatedForceit = this.getForceit();
		CMD_index generatedCmdidx = this.getCmdidx();
		ModernizedCProgram.do_arg_all((int)generatedLine2, generatedForceit, generatedCmdidx == CMD_index.CMD_drop/*
		 * Concatenate all files in the argument list, separated by spaces, and return
		 * it in one allocated string.
		 * Spaces and backslashes in the file names are escaped with a backslash.
		 * Returns NULL when out of memory.
		 */);
	}
	public int read_buffer(int read_stdin, int flags) {
		int retval = /* extra flags for readfile() */1;
		linenr_T line_count = new linenr_T();
		/*
		     * Read from the buffer which the text is already filled in and append at
		     * the end.  This makes it possible to retry when 'fileformat' or
		     * 'fileencoding' was guessed wrong.
		     */
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		line_count = generatedMl_line_count;
		Object[] generatedB_ffname = curbuf.getB_ffname();
		Object[] generatedB_fname = curbuf.getB_fname();
		retval = eap.readfile(read_stdin ? ((Object)0) : generatedB_ffname, read_stdin ? ((Object)0) : generatedB_fname, (linenr_T)line_count, (linenr_T)0, (linenr_T)LONG_MAX, flags | -1024);
		if (retval == 1) {
			while (--line_count >= /* Delete the binary lines. */0) {
				ModernizedCProgram.ml_delete((linenr_T)1, 0);
			}
		} else {
				while (generatedMl_line_count > /* Delete the converted lines. */line_count) {
					ModernizedCProgram.ml_delete(line_count, 0);
				}
		} 
		ModernizedCProgram.curwin.getW_cursor().setLnum(/* Put the cursor on the first line. */1);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		if (read_stdin) {
			if (!readonlymode && !(generatedMl_line_count == 1 && ModernizedCProgram.ml_get((linenr_T)1) == /* Set or reset 'modified' before executing autocommands, so that
				 * it can be changed there. */(byte)'\000')) {
				ModernizedCProgram.changed();
			}  else if (retval == 1) {
				curbuf.unchanged(0, 1);
			} 
			if (retval == 1) {
				curbuf.apply_autocmds_retval(auto_event.EVENT_STDINREADPOST, ((Object)0), ((Object)0), 0, retval);
			} 
		} 
		return retval/*
		 * Ensure buffer "buf" is loaded.  Does not trigger the swap-exists action.
		 */;
	}
	/* read file from stdin, otherwise fifo */
	/* for forced 'ff' and 'fenc' or NULL */
	public int open_buffer(int read_stdin, int flags) {
		int retval = /* extra flags for readfile() */1;
		bufref_T old_curbuf = new bufref_T();
		long generatedB_p_tw = curbuf.getB_p_tw();
		long old_tw = generatedB_p_tw;
		int read_fifo = 0/*
		     * The 'readonly' flag is only set when BF_NEVERLOADED is being reset.
		     * When re-entering the same buffer, it should not change, because the
		     * user may have reset the flag by hand.
		     */;
		Object[] generatedB_ffname = curbuf.getB_ffname();
		int generatedB_flags = curbuf.getB_flags();
		if (readonlymode && generatedB_ffname != ((Object)0) && (generatedB_flags & -1024)) {
			curbuf.setB_p_ro(1);
		} 
		memline generatedB_ml = curbuf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer generatedB_next = curbuf.getB_next();
		if (curbuf.ml_open() == 0/*
			 * There MUST be a memfile, otherwise we can't do anything
			 * If we can't create one for the current buffer, take another buffer
			 */) {
			ModernizedCProgram.close_buffer(((Object)0), curbuf, 0, 0);
			for (curbuf = firstbuf; curbuf != ((Object)0); curbuf = generatedB_next) {
				if (generatedMl_mfp != ((Object)0)) {
					break;
				} 
			}
			if (curbuf == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)("E82: Cannot allocate any buffer, exiting...")));
				v_dying = 2;
				ModernizedCProgram.getout(2);
			} 
			ModernizedCProgram.emsg(((byte)("E83: Cannot allocate buffer, using other one...")));
			curbuf.enter_buffer();
			if (old_tw != generatedB_p_tw) {
				ModernizedCProgram.curwin.check_colorcolumn();
			} 
			return 0;
		} 
		ModernizedCProgram.set_bufref(old_curbuf, /* The autocommands in readfile() may change the buffer, but only AFTER
		     * reading the file. */curbuf);
		ModernizedCProgram.modified_was_set = 0;
		ModernizedCProgram.curwin.setW_valid(/* mark cursor position as being invalid */0);
		Object[] generatedB_fname = curbuf.getB_fname();
		int generatedB_p_bin = curbuf.getB_p_bin();
		if (generatedB_ffname != ((Object)0)) {
			int old_msg_silent = msg_silent;
			if (ModernizedCProgram.shortmess((byte)'F')) {
				msg_silent = 1;
			} 
			retval = eap.readfile(generatedB_ffname, generatedB_fname, (linenr_T)0, (linenr_T)0, (linenr_T)LONG_MAX, flags | -1024 | (read_fifo ? -1024 : 0));
			msg_silent = old_msg_silent;
			if (/* Help buffer is filtered. */curbuf.bt_help()) {
				ModernizedCProgram.fix_help_buffer();
			} 
		}  else if (read_stdin) {
			int save_bin = generatedB_p_bin;
			curbuf.setB_p_bin(1);
			retval = ((Object)0).readfile(((Object)0), ((Object)0), (linenr_T)0, (linenr_T)0, (linenr_T)LONG_MAX, flags | (-1024 + -1024));
			curbuf.setB_p_bin(save_bin);
			if (retval == 1) {
				retval = eap.read_buffer(1, flags);
			} 
		} 
		if (generatedB_flags & /* if first time loading this buffer, init b_chartab[] */-1024) {
			(Object)curbuf.buf_init_chartab(0);
			curbuf/*
			     * Set/reset the Changed flag first, autocmds may change the buffer.
			     * Apply the automatic commands, before processing the modelines.
			     * So the modelines have priority over autocommands.
			     */.parse_cino();
		} 
		if ((got_int && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'i') != ((Object)/* When reading stdin, the buffer contents always needs writing, so set
		     * the changed flag.  Unless in readonly mode: "ls | gview -".
		     * When interrupted and 'cpoptions' contains 'i' set changed flag. */0)) || /* ":set modified" used in autocmd */ModernizedCProgram.modified_was_set || (ModernizedCProgram.aborting() && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'i') != ((Object)0))) {
			ModernizedCProgram.changed();
		}  else if (retval == 1 && !read_stdin && !read_fifo) {
			curbuf.unchanged(0, 1);
		} 
		/* keep this fileformat */curbuf.save_file_ff();
		dictitem16_S generatedB_ct_di = (curbuf).getB_ct_di();
		 generatedDi_tv = generatedB_ct_di.getDi_tv();
		Object generatedVval = generatedDi_tv.getVval();
		curbuf.setB_last_changedtick((generatedVval.getV_number()));
		curbuf.setB_last_changedtick_pum((generatedVval.getV_number()));
		if (ModernizedCProgram.aborting()) {
			generatedB_flags |=  -1024;
		} 
		/* Need to update automatic folding.  Do this before the autocommands,
		     * they may use the fold info. */ModernizedCProgram.curwin.foldUpdateAll();
		if (!(ModernizedCProgram.curwin.getW_valid() & /* need to set w_topline, unless some autocommand already did that. */-1024)) {
			ModernizedCProgram.curwin.setW_topline(1);
			ModernizedCProgram.curwin.setW_topfill(0);
		} 
		curbuf.apply_autocmds_retval(auto_event.EVENT_BUFENTER, ((Object)0), ((Object)0), 0, retval);
		Object generatedBr_buf = old_curbuf.getBr_buf();
		if (retval == 1/*
			 * The autocommands may have changed the current buffer.  Apply the
			 * modelines to the correct buffer, if it still exists and is loaded.
			 */) {
			if (old_curbuf.bufref_valid() && generatedMl_mfp != ((Object)0)) {
				aco_save_T aco = new aco_save_T();
				ModernizedCProgram.aucmd_prepbuf(aco, generatedBr_buf);
				ModernizedCProgram.do_modelines(0);
				generatedB_flags &=  ~(-1024 | -1024);
				curbuf.apply_autocmds_retval(auto_event.EVENT_BUFWINENTER, ((Object)0), ((Object)0), 0, retval);
				/* restore curwin/curbuf and a few other things */aco.aucmd_restbuf();
			} 
		} 
		return retval/*
		 * Store "buf" in "bufref" and set the free count.
		 */;
	}
	/* read file from stdin */
	/* for forced 'ff' and 'fenc' or NULL */
	public void goto_buffer(int start, int dir, int count) {
		bufref_T old_curbuf = new bufref_T();
		ModernizedCProgram.set_bufref(old_curbuf, curbuf);
		swap_exists_action = 1;
		Object[] generatedCmd = this.getCmd();
		int generatedForceit = this.getForceit();
		(Object)ModernizedCProgram.do_buffer(generatedCmd == (byte)'s' ? 1 : 0, start, dir, count, generatedForceit);
		if (swap_exists_action == 2 && generatedCmd == (byte)'s') {
			cleanup_T cs = new cleanup_T();
			/* Reset the error/interrupt/exception state here so that
				 * aborting() returns FALSE when closing a window. */cs.enter_cleanup();
			ModernizedCProgram.curwin.win_close(/* Quitting means closing the split window, nothing else. */1);
			swap_exists_action = 0;
			swap_exists_did_quit = 1;
			/* Restore the error/interrupt/exception state if not discarded by a
				 * new aborting error, interrupt, or uncaught exception. */cs.leave_cleanup();
		} else {
				old_curbuf/*
				 * Handle the situation of swap_exists_action being set.
				 * It is allowed for "old_curbuf" to be NULL or invalid.
				 */.handle_swap_exists();
		} 
	}
	public void buflist_list() {
		buf_T buf = new buf_T();
		int len;
		int i;
		int ro_char;
		int changed_char;
		int generatedB_p_bl = buf.getB_p_bl();
		int generatedForceit = this.getForceit();
		Object[] generatedArg = this.getArg();
		int generatedB_flags = buf.getB_flags();
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		int generatedB_nwindows = buf.getB_nwindows();
		int generatedB_p_ma = buf.getB_p_ma();
		int generatedB_p_ro = buf.getB_p_ro();
		int generatedB_fnum = buf.getB_fnum();
		Object[] generatedB_fname = buf.getB_fname();
		file_buffer generatedB_next = buf.getB_next();
		for (buf = firstbuf; buf != ((Object)0) && !got_int; buf = generatedB_next) {
			if ((!generatedB_p_bl && !generatedForceit && !ModernizedCProgram.vim_strchr(generatedArg, /* skip unlisted buffers, unless ! was used */(byte)'u')) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'u') && generatedB_p_bl) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'+') && ((generatedB_flags & -1024) || !buf.bufIsChanged())) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'a') && (generatedMl_mfp == ((Object)0) || generatedB_nwindows == 0)) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'h') && (generatedMl_mfp == ((Object)0) || generatedB_nwindows != 0)) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'-') && generatedB_p_ma) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'=') && !generatedB_p_ro) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'x') && !(generatedB_flags & -1024)) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'%') && buf != curbuf) || (ModernizedCProgram.vim_strchr(generatedArg, (byte)'#') && (buf == curbuf || ModernizedCProgram.curwin.getW_alt_fnum() != generatedB_fnum))) {
				continue;
			} 
			if (buf.buf_spname() != ((Object)0)) {
				ModernizedCProgram.vim_strncpy(ModernizedCProgram.NameBuff, buf.buf_spname(), 1024 - 1);
			} else {
					buf.home_replace(generatedB_fname, ModernizedCProgram.NameBuff, 1024, 1);
			} 
			if (ModernizedCProgram.message_filtered(ModernizedCProgram.NameBuff)) {
				continue;
			} 
			changed_char = (generatedB_flags & -1024) ? (byte)'x' : (buf.bufIsChanged() ? (byte)'+' : (byte)' ');
			ro_char = !generatedB_p_ma ? (byte)'-' : (generatedB_p_ro ? (byte)'=' : (byte)' ');
			ModernizedCProgram.msg_putchar((byte)'\n');
			len = ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1) - 20, "%3d%c%c%c%c%c \"%s\"", generatedB_fnum, generatedB_p_bl ? (byte)' ' : (byte)'u', buf == curbuf ? (byte)'%' : (ModernizedCProgram.curwin.getW_alt_fnum() == generatedB_fnum ? (byte)'#' : (byte)' '), generatedMl_mfp == ((Object)0) ? (byte)' ' : (generatedB_nwindows == 0 ? (byte)'h' : (byte)'a'), ro_char, changed_char, ModernizedCProgram.NameBuff);
			if (len > (1024 + 1) - 20) {
				len = (1024 + 1) - 20;
			} 
			i = 40 - ModernizedCProgram.vim_strsize(/* put "line 999" in column 40 or after the file name */ModernizedCProgram.IObuff);
			do {
				ModernizedCProgram.IObuff[len++] = (byte)' ';
			} while (--i > 0 && len < (1024 + 1) - 18);
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff + len, (size_t)((1024 + 1) - len), ((byte)("line %ld")), buf == curbuf ? ModernizedCProgram.curwin.getW_cursor().getLnum() : (long)buf.buflist_findlnum());
			ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
			ModernizedCProgram.out_flush();
			ModernizedCProgram.ui_breakcheck();
		}
	}
	/*
	 * Open a window for a number of buffers.
	 */
	public void ex_buffer_all() {
		buf_T buf = new buf_T();
		win_T wp = new win_T();
		win_T wpnext = new win_T();
		int split_ret = 1;
		int p_ea_save;
		int open_wins = 0;
		int r;
		/* Maximum number of windows to open. */int count;
		/* When TRUE also load inactive buffers. */int all;
		int had_tab = ModernizedCProgram.cmdmod.getTab();
		tabpage_T tpnext = new tabpage_T();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count == /* make as many windows as possible */0) {
			count = 9999;
		} else {
				count = generatedLine2;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_unhide || generatedCmdidx == CMD_index.CMD_sunhide) {
			all = 0;
		} else {
				all = 1;
		} 
		ModernizedCProgram.setpcmark();
		if (had_tab > /*
		     * Close superfluous windows (two windows for the same buffer).
		     * Also close windows that are not full-width.
		     */0) {
			ModernizedCProgram.first_tabpage.goto_tabpage_tp(1, 1);
		} 
		window_S generatedW_next = wp.getW_next();
		file_buffer generatedW_buffer = wp.getW_buffer();
		int generatedB_nwindows = generatedW_buffer.getB_nwindows();
		int generatedW_height = wp.getW_height();
		int generatedW_status_height = wp.getW_status_height();
		int generatedW_width = wp.getW_width();
		int generatedW_closing = wp.getW_closing();
		int generatedB_locked = generatedW_buffer.getB_locked();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			tpnext = ModernizedCProgram.curtab.getTp_next();
			for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = wpnext) {
				wpnext = generatedW_next;
				if ((generatedB_nwindows > 1 || ((ModernizedCProgram.cmdmod.getSplit() & 2) ? generatedW_height + generatedW_status_height < ModernizedCProgram.Rows - ModernizedCProgram.p_ch - ModernizedCProgram.tabline_height() : generatedW_width != Columns) || (had_tab > 0 && wp != ModernizedCProgram.firstwin)) && !(ModernizedCProgram.firstwin == ModernizedCProgram.lastwin) && !(generatedW_closing || generatedB_locked > 0)) {
					wp.win_close(0);
					wpnext = /* just in case an autocommand does
										   something strange with windows */ModernizedCProgram.firstwin;
					tpnext = /* start all over... */ModernizedCProgram.first_tabpage;
					open_wins = 0;
				} else {
						++open_wins;
				} 
			}
			if (had_tab == 0 || tpnext == ((Object)/* Without the ":tab" modifier only do the current tab page. */0)) {
				break;
			} 
			tpnext.goto_tabpage_tp(1, 1/*
			     * Go through the buffer list.  When a buffer doesn't have a window yet,
			     * open one.  Otherwise move the window to the right position.
			     * Watch out for autocommands that delete buffers or windows!
			     */);
		}
		++/* Don't execute Win/Buf Enter/Leave autocommands here. */autocmd_no_enter;
		ModernizedCProgram.lastwin.win_enter(0);
		++autocmd_no_leave;
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		int generatedB_p_bl = buf.getB_p_bl();
		file_buffer generatedB_next = buf.getB_next();
		for (buf = firstbuf; buf != ((Object)0) && open_wins < count; buf = generatedB_next) {
			if ((!all && generatedMl_mfp == ((Object)0)) || !generatedB_p_bl) {
				continue;
			} 
			if (had_tab != 0) {
				if (generatedB_nwindows > /* With the ":tab" modifier don't move the window. */0) {
					wp = /* buffer has a window, skip it */ModernizedCProgram.lastwin;
				} else {
						wp = ((Object)0);
				} 
			} else {
					for (wp = ModernizedCProgram.firstwin; wp != ((Object)0); wp = generatedW_next) {
						if (generatedW_buffer == buf) {
							break;
						} 
					}
					if (wp != ((Object)/* If the buffer already has a window, move it */0)) {
						wp.win_move_after(ModernizedCProgram.curwin);
					} 
			} 
			if (wp == ((Object)0) && split_ret == 1) {
				bufref_T bufref = new bufref_T();
				ModernizedCProgram.set_bufref(bufref, buf);
				p_ea_save = /* Split the window and put the buffer in it */ModernizedCProgram.p_ea;
				ModernizedCProgram.p_ea = /* use space from all windows */1;
				split_ret = ModernizedCProgram.win_split(0, 1 | 32);
				++open_wins;
				ModernizedCProgram.p_ea = p_ea_save;
				if (split_ret == 0) {
					continue;
				} 
				swap_exists_action = /* Open the buffer in this window. */1;
				buf.set_curbuf(0);
				if (!bufref.bufref_valid()) {
					swap_exists_action = /* autocommands deleted the buffer!!! */0;
					break;
				} 
				if (swap_exists_action == 2) {
					cleanup_T cs = new cleanup_T();
					/* Reset the error/interrupt/exception state here so that
							 * aborting() returns FALSE when closing a window. */cs.enter_cleanup();
					ModernizedCProgram.curwin.win_close(/* User selected Quit at ATTENTION prompt; close this window. */1);
					--open_wins;
					swap_exists_action = 0;
					swap_exists_did_quit = 1;
					/* Restore the error/interrupt/exception state if not
							 * discarded by a new aborting error, interrupt, or uncaught
							 * exception. */cs.leave_cleanup();
				} else {
						((Object)0).handle_swap_exists();
				} 
			} 
			ModernizedCProgram.ui_breakcheck();
			if (got_int) {
				(Object)ModernizedCProgram.vgetc();
				break;
			} 
			if (ModernizedCProgram.aborting()) {
				break;
			} 
			if (had_tab > 0 && ((Object)0).tabpage_index() <= /* When ":tab" was used open a new tab for a new window repeatedly. */ModernizedCProgram.p_tpm) {
				ModernizedCProgram.cmdmod.setTab(9999);
			} 
		}
		--autocmd_no_enter;
		ModernizedCProgram.firstwin.win_enter(/* back to first window */0);
		--autocmd_no_leave/*
		     * Close superfluous windows.
		     */;
		window_S generatedW_prev = wp.getW_prev();
		for (wp = ModernizedCProgram.lastwin; open_wins > count; /*Error: Unsupported expression*/) {
			r = (generatedW_buffer.buf_hide() || !generatedW_buffer.bufIsChanged() || generatedW_buffer.autowrite(0) == 1);
			if (!wp.win_valid()) {
				wp = /* BufWrite Autocommands made the window invalid, start over */ModernizedCProgram.lastwin;
			}  else if (r) {
				wp.win_close(!generatedW_buffer.buf_hide());
				--open_wins;
				wp = ModernizedCProgram.lastwin;
			} else {
					wp = generatedW_prev;
					if (wp == ((Object)0)) {
						break;
					} 
			} 
		}
	}
	/*
	 * :history command - print a history
	 */
	public void ex_history() {
		histentry_T hist = new histentry_T();
		int histype1 = 0;
		int histype2 = 0;
		int hisidx1 = 1;
		int hisidx2 = -1;
		int idx;
		int i;
		int j;
		int k;
		char_u end = new char_u();
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		if (ModernizedCProgram.hislen == 0) {
			ModernizedCProgram.msg(((byte)("'history' option is zero")));
			return /*Error: Unsupported expression*/;
		} 
		if (!(((int)(arg) - (byte)'0' < 10) || arg == (byte)'-' || arg == (byte)',')) {
			end = arg;
			while ((((int)(end) - (byte)'A' < 26) || ((int)(end) - (byte)'a' < 26)) || ModernizedCProgram.vim_strchr((char_u)":=@>/?", end) != ((Object)0)) {
				end++;
			}
			i = end;
			end = (byte)'\000';
			histype1 = ModernizedCProgram.get_histtype(arg);
			if (histype1 == -1) {
				if (ModernizedCProgram.vim_strnicmp((byte)(arg), (byte)("all"), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(arg)))) == 0) {
					histype1 = 0;
					histype2 = 5 - 1;
				} else {
						end = i;
						ModernizedCProgram.emsg(((byte)(e_trailing)));
						return /*Error: Unsupported expression*/;
				} 
			} else {
					histype2 = histype1;
			} 
			end = i;
		} else {
				end = arg;
		} 
		if (!ModernizedCProgram.get_list_range(end, hisidx1, hisidx2) || end != (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_trailing)));
			return /*Error: Unsupported expression*/;
		} 
		for (; !got_int && histype1 <= histype2; ++histype1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(ModernizedCProgram.IObuff), (byte)("\n      #  "));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(/*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(ModernizedCProgram.history_names[histype1]))), (byte)(" history"));
			ModernizedCProgram.msg_puts_title((byte)ModernizedCProgram.IObuff);
			idx = ModernizedCProgram.hisidx[histype1];
			hist = ModernizedCProgram.history[histype1];
			j = hisidx1;
			k = hisidx2;
			if (j < 0) {
				j = (-j > ModernizedCProgram.hislen) ? 0 : hist[(ModernizedCProgram.hislen + j + idx + 1) % ModernizedCProgram.hislen].getHisnum();
			} 
			if (k < 0) {
				k = (-k > ModernizedCProgram.hislen) ? 0 : hist[(ModernizedCProgram.hislen + k + idx + 1) % ModernizedCProgram.hislen].getHisnum();
			} 
			if (idx >= 0 && j <= k) {
				for (i = idx + 1; !got_int; ++i) {
					if (i == ModernizedCProgram.hislen) {
						i = 0;
					} 
					if (hist[i].getHisstr() != ((Object)0) && hist[i].getHisnum() >= j && hist[i].getHisnum() <= k) {
						ModernizedCProgram.msg_putchar((byte)'\n');
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff, "%c%6d  ", i == idx ? (byte)'>' : (byte)' ', hist[i].getHisnum());
						if (ModernizedCProgram.vim_strsize(hist[i].getHisstr()) > (int)Columns - 10) {
							ModernizedCProgram.trunc_string(hist[i].getHisstr(), ModernizedCProgram.IObuff + /*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)), (int)Columns - 10, (1024 + 1) - (int)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.IObuff)));
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)(ModernizedCProgram.IObuff), (byte)(hist[i].getHisstr()));
						} 
						ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
						ModernizedCProgram.out_flush();
					} 
					if (i == idx) {
						break;
					} 
				}
			} 
		}
	}
	public void qf_list() {
		qf_list_T qfl = new qf_list_T();
		qfline_T qfp = new qfline_T();
		int i;
		int idx1 = 1;
		int idx2 = -1;
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int plus = 0;
		int generatedForceit = this.getForceit();
		// if not :cl!, only showint all = generatedForceit;
		// recognised errors
		qf_info_T qi = new qf_info_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		if (qi.qf_stack_empty() || qf_list_S.qf_get_curlist(qi).qf_list_empty()) {
			ModernizedCProgram.emsg(((byte)(e_quickfix)));
			return /*Error: Unsupported expression*/;
		} 
		if (arg == (byte)'+') {
			++arg;
			plus = 1;
		} 
		if (!ModernizedCProgram.get_list_range(arg, idx1, idx2) || arg != (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_trailing)));
			return /*Error: Unsupported expression*/;
		} 
		qfl = qf_list_S.qf_get_curlist(qi);
		int generatedQf_index = qfl.getQf_index();
		int generatedQf_count = qfl.getQf_count();
		if (plus) {
			i = generatedQf_index;
			idx2 = i + idx1;
			idx1 = i;
		} else {
				i = generatedQf_count;
				if (idx1 < 0) {
					idx1 = (-idx1 > i) ? 0 : idx1 + i + 1;
				} 
				if (idx2 < 0) {
					idx2 = (-idx2 > i) ? 0 : idx2 + i + 1;
				} 
		} 
		// Shorten all the file names, so that it is easy to read// Shorten all the file names, so that it is easy to readModernizedCProgram.shorten_fnames(0)// Get the attributes for the different quickfix highlight items.  Note;// Get the attributes for the different quickfix highlight items.  Note
		// that this depends on syntax items defined in the qf.vim syntax file// that this depends on syntax items defined in the qf.vim syntax fileModernizedCProgram.qfFileAttr = ModernizedCProgram.syn_name2attr((char_u)"qfFileName");
		if (ModernizedCProgram.qfFileAttr == 0) {
			ModernizedCProgram.qfFileAttr = ModernizedCProgram.highlight_attr[(int)(.HLF_D)];
		} 
		ModernizedCProgram.qfSepAttr = ModernizedCProgram.syn_name2attr((char_u)"qfSeparator");
		if (ModernizedCProgram.qfSepAttr == 0) {
			ModernizedCProgram.qfSepAttr = ModernizedCProgram.highlight_attr[(int)(.HLF_D)];
		} 
		ModernizedCProgram.qfLineAttr = ModernizedCProgram.syn_name2attr((char_u)"qfLineNr");
		if (ModernizedCProgram.qfLineAttr == 0) {
			ModernizedCProgram.qfLineAttr = ModernizedCProgram.highlight_attr[(int)(.HLF_N)];
		} 
		int generatedQf_nonevalid = qfl.getQf_nonevalid();
		if (generatedQf_nonevalid) {
			all = 1;
		} 
		Object generatedQf_valid = qfp.getQf_valid();
		for (; !got_int && i <= generatedQf_count && qfp != ((Object)0); ) {
			if ((generatedQf_valid || all) && idx1 <= i && i <= idx2) {
				qfp.qf_list_entry(i, i == generatedQf_index);
			} 
			ModernizedCProgram.ui_breakcheck();
		}
	}
	public void qf_age() {
		qf_info_T qi = new qf_info_T();
		int count;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count != 0) {
			count = generatedLine2;
		} else {
				count = 1;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedQf_curlist = qi.getQf_curlist();
		int generatedQf_listcount = qi.getQf_listcount();
		while (count--) {
			if (generatedCmdidx == CMD_index.CMD_colder || generatedCmdidx == CMD_index.CMD_lolder) {
				if (generatedQf_curlist == 0) {
					ModernizedCProgram.emsg(((byte)("E380: At bottom of quickfix stack")));
					break;
				} 
				--generatedQf_curlist;
			} else {
					if (generatedQf_curlist >= generatedQf_listcount - 1) {
						ModernizedCProgram.emsg(((byte)("E381: At top of quickfix stack")));
						break;
					} 
					++generatedQf_curlist;
			} 
		}
		qi.qf_msg(generatedQf_curlist, "");
		ModernizedCProgram.qf_update_buffer(qi, ((Object)0/*
		 * Display the information about all the quickfix/location lists in the stack
		 */));
	}
	public void qf_history() {
		qf_info_S qf_info_S = new qf_info_S();
		qf_info_T qi = qf_info_S.qf_cmd_get_stack(eap, 0);
		int i;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		int generatedQf_listcount = qi.getQf_listcount();
		int generatedQf_curlist = qi.getQf_curlist();
		if (generatedAddr_count > 0) {
			if (qi == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)(e_loclist)));
				return /*Error: Unsupported expression*/;
			} 
			if (generatedLine2 > 0 && generatedLine2 <= generatedQf_listcount) {
				qi.setQf_curlist(generatedLine2 - 1);
				qi.qf_msg(generatedQf_curlist, "");
				ModernizedCProgram.qf_update_buffer(qi, ((Object)0));
			} else {
					ModernizedCProgram.emsg(((byte)(e_invrange)));
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (qi.qf_stack_empty()) {
			ModernizedCProgram.msg(((byte)("No entries")));
		} else {
				for (i = 0; i < generatedQf_listcount; ++i) {
					qi.qf_msg(i, i == generatedQf_curlist ? "> " : "  "/*
					 * Free all the entries in the error list "idx". Note that other information
					 * associated with the list like context and title are not freed.
					 */);
				}
		} 
	}
	public void ex_cwindow() {
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		win_T win = new win_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi);
		window_S window_S = new window_S();
		// Look for an existing quickfix window.// Look for an existing quickfix window.win = window_S.qf_find_win(qi)// If a quickfix window is open but we have no errors to display,;// If a quickfix window is open but we have no errors to display,
		int generatedQf_nonevalid = qfl.getQf_nonevalid();
		// close the window.  If a quickfix window is not open, then open// it if we have errors; otherwise, leave it closed.if (qi.qf_stack_empty() || generatedQf_nonevalid || qfl.qf_list_empty()) {
			if (win != ((Object)0)) {
				eap.ex_cclose();
			} 
		}  else if (win == ((Object)0)) {
			eap/*
			 * ":cclose": close the window showing the list of errors.
			 * ":lclose": close the window showing the location list
			 */.ex_copen();
		} 
	}
	public void ex_cclose() {
		win_T win = ((Object)0);
		qf_info_T qi = new qf_info_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 0)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		window_S window_S = new window_S();
		// Find existing quickfix window and close it.// Find existing quickfix window and close it.win = window_S.qf_find_win(qi);
		if (win != ((Object)0)) {
			win.win_close(0/*
			 * Set "w:quickfix_title" if "qi" has a title.
			 */);
		} 
	}
	public void ex_copen() {
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		int height;
		int status = 0;
		int lnum;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.incr_quickfix_busy();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count != 0) {
			height = generatedLine2;
		} else {
				height = 10;
		} 
		// stop Visual mode// stop Visual modeModernizedCProgram.reset_VIsual_and_resel();
		// Find an existing quickfix window, or open a new one.if (ModernizedCProgram.cmdmod.getTab() == 0) {
			status = qi.qf_goto_cwindow(generatedAddr_count != 0, height, ModernizedCProgram.cmdmod.getSplit() & 2);
		} 
		if (status == 0) {
			if (qi.qf_open_new_cwindow(height) == 0) {
				ModernizedCProgram.decr_quickfix_busy();
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi);
		qfl.qf_set_title_var()// Save the current index here, as updating the quickfix buffer may free;// Save the current index here, as updating the quickfix buffer may free
		int generatedQf_index = qfl.getQf_index();
		// the quickfix list// the quickfix listlnum = generatedQf_index;
		// Fill the buffer with the quickfix list.// Fill the buffer with the quickfix list.ModernizedCProgram.qf_fill_buffer(qfl, curbuf, ((Object)0));
		ModernizedCProgram.decr_quickfix_busy();
		ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
		ModernizedCProgram.curwin.getW_cursor().setCol(0);
		ModernizedCProgram.check_cursor();
		// scroll to show the line// scroll to show the lineModernizedCProgram.update_topline();
	}
	public void ex_cbottom() {
		qf_info_T qi = new qf_info_T();
		win_T win = new win_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		window_S window_S = new window_S();
		win = window_S.qf_find_win(qi);
		 generatedW_cursor = win.getW_cursor();
		Object generatedLnum = generatedW_cursor.getLnum();
		file_buffer generatedW_buffer = win.getW_buffer();
		memline generatedB_ml = generatedW_buffer.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (win != ((Object)0) && generatedLnum != generatedMl_line_count) {
			win.qf_win_goto(generatedMl_line_count);
		} 
	}
	public void ex_make() {
		char_u fname = new char_u();
		char_u cmd = new char_u();
		char_u enc = ((Object)0);
		win_T wp = ((Object)0);
		qf_info_T qi = ModernizedCProgram.ql_info;
		int res;
		char_u au_name = ((Object)0);
		int_u save_qfid = new int_u();
		CMD_index generatedCmdidx = this.getCmdidx();
		// Redirect ":grep" to ":vimgrep" if 'grepprg' is "internal".if (ModernizedCProgram.grep_internal(generatedCmdidx)) {
			eap.ex_vimgrep();
			return /*Error: Unsupported expression*/;
		} 
		au_name = ModernizedCProgram.make_get_auname(generatedCmdidx);
		Object[] generatedB_fname = curbuf.getB_fname();
		if (au_name != ((Object)0) && curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, generatedB_fname, 1)) {
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		Object generatedB_p_menc = curbuf.getB_p_menc();
		enc = (generatedB_p_menc != (byte)'\000') ? generatedB_p_menc : ModernizedCProgram.p_menc;
		if (ModernizedCProgram.is_loclist_cmd(generatedCmdidx)) {
			wp = ModernizedCProgram.curwin;
		} 
		ModernizedCProgram.autowrite_all();
		fname = ModernizedCProgram.get_mef_name();
		if (fname == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		// in case it's not unique// in case it's not uniqueModernizedCProgram.mch_remove(fname);
		Object[] generatedArg = this.getArg();
		cmd = ModernizedCProgram.make_get_fullcmd(generatedArg, fname);
		if (cmd == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		// let the shell know if we are redirecting output or not// let the shell know if we are redirecting output or notModernizedCProgram.do_shell(cmd, p_sp != (byte)'\000' ? 8 : 0)// read window status report and redraw before message;// read window status report and redraw before message
		ModernizedCProgram.incr_quickfix_busy();
		Object generatedCmdlinep = this.getCmdlinep();
		res = wp.qf_init(fname, (generatedCmdidx != CMD_index.CMD_make && generatedCmdidx != CMD_index.CMD_lmake) ? p_gefm : p_efm, (generatedCmdidx != CMD_index.CMD_grepadd && generatedCmdidx != CMD_index.CMD_lgrepadd), ModernizedCProgram.qf_cmdtitle(generatedCmdlinep), enc);
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedW_llist_ref = wp.getW_llist_ref();
		Object generatedW_llist = wp.getW_llist();
		if (wp != ((Object)0)) {
			qi = ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0)) ? generatedW_llist_ref : generatedW_llist);
			if (qi == ((Object)0)) {
				;
			} 
		} 
		qf_list_S qf_list_S = new qf_list_S();
		if (res >= 0) {
			qf_list_S.qf_get_curlist(qi).qf_list_changed();
		} 
		// check for autocommands changing the current quickfix list.// check for autocommands changing the current quickfix list.save_qfid = qf_list_S.qf_get_curlist(qi).getQf_id();
		if (au_name != ((Object)0)) {
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPOST, au_name, generatedB_fname, 1);
		} 
		int generatedForceit = this.getForceit();
		if (res > 0 && !generatedForceit && wp.qflist_valid(save_qfid)) {
			qi.qf_jump_first(save_qfid, 0);
		} 
		// display the first error
		ModernizedCProgram.mch_remove(fname);
		ModernizedCProgram.vim_free(fname);
		ModernizedCProgram.vim_free(cmd/*
		 * Returns the number of entries in the current quickfix/location list.
		 */);
	}
	public int qf_get_size() {
		qf_info_T qi = new qf_info_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 0)) == ((Object)0)) {
			return 0;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		return qf_list_S.qf_get_curlist(qi).getQf_count();
	}
	public int qf_get_valid_size() {
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		qfline_T qfp = new qfline_T();
		int i;
		int sz = 0;
		int prev_fnum = 0;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 0)) == ((Object)0)) {
			return 0;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi);
		int generatedQf_count = qfl.getQf_count();
		Object generatedQf_valid = qfp.getQf_valid();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedQf_fnum = qfp.getQf_fnum();
		for (; !got_int && i <= generatedQf_count && qfp != ((Object)0); ) {
			if (generatedQf_valid) {
				if (generatedCmdidx == CMD_index.CMD_cdo || generatedCmdidx == CMD_index.CMD_ldo) {
					sz++;
				}  else if (generatedQf_fnum > 0 && generatedQf_fnum != prev_fnum) {
					sz++;
					prev_fnum = generatedQf_fnum;
				} 
			} 
		}
		return sz/*
		 * Returns the current index of the quickfix/location list.
		 * Returns 0 if there is an error.
		 */;
	}
	public int qf_get_cur_idx() {
		qf_info_T qi = new qf_info_T();
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 0)) == ((Object)0)) {
			return 0;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		return qf_list_S.qf_get_curlist(qi).getQf_index();
	}
	public int qf_get_cur_valid_idx() {
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		qfline_T qfp = new qfline_T();
		int i;
		int eidx = 0;
		int prev_fnum = 0;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 0)) == ((Object)0)) {
			return 1;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi);
		qfline_S generatedQf_start = qfl.getQf_start();
		qfp = generatedQf_start;
		// check if the list has valid errorsif (!qfl.qf_list_has_valid_entries()) {
			return 1;
		} 
		int generatedQf_index = qfl.getQf_index();
		Object generatedQf_valid = qfp.getQf_valid();
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedQf_fnum = qfp.getQf_fnum();
		for (i = 1; i <= generatedQf_index && qfp != ((Object)0); ) {
			if (generatedQf_valid) {
				if (generatedCmdidx == CMD_index.CMD_cfdo || generatedCmdidx == CMD_index.CMD_lfdo) {
					if (generatedQf_fnum > 0 && generatedQf_fnum != prev_fnum) {
						eidx++;
						prev_fnum = generatedQf_fnum;
					} 
				} else {
						eidx++;
				} 
			} 
		}
		return eidx ? eidx : 1/*
		 * Get the 'n'th valid error entry in the quickfix or location list.
		 * Used by :cdo, :ldo, :cfdo and :lfdo commands.
		 * For :cdo and :ldo returns the 'n'th valid error entry.
		 * For :cfdo and :lfdo returns the 'n'th valid file entry.
		 */;
	}
	public void ex_cc() {
		qf_info_T qi = new qf_info_T();
		int errornr;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedAddr_count > 0) {
			errornr = (int)generatedLine2;
		} else {
				switch (generatedCmdidx) {
				case CMD_index.CMD_lrewind:
				case CMD_index.CMD_cfirst:
				case CMD_index.CMD_cc:
				case CMD_index.CMD_ll:
						errornr = 0;
						break;
				case CMD_index.CMD_crewind:
				case CMD_index.CMD_lfirst:
						errornr = 1;
						break;
				default:
						errornr = 32767;
				}
		} 
		qf_list_S qf_list_S = new qf_list_S();
		Object generatedLine1 = this.getLine1();
		// For cdo and ldo commands, jump to the nth valid error.// For cfdo and lfdo commands, jump to the nth valid file entry.if (generatedCmdidx == CMD_index.CMD_cdo || generatedCmdidx == CMD_index.CMD_ldo || generatedCmdidx == CMD_index.CMD_cfdo || generatedCmdidx == CMD_index.CMD_lfdo) {
			errornr = qf_list_S.qf_get_curlist(qi).qf_get_nth_valid_entry(generatedAddr_count > 0 ? (int)generatedLine1 : 1, generatedCmdidx == CMD_index.CMD_cfdo || generatedCmdidx == CMD_index.CMD_lfdo);
		} 
		int generatedForceit = this.getForceit();
		qi.qf_jump(0, errornr, generatedForceit);
	}
	public void ex_cnext() {
		qf_info_T qi = new qf_info_T();
		int errornr;
		int dir;
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedAddr_count = this.getAddr_count();
		CMD_index generatedCmdidx = this.getCmdidx();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > 0 && (generatedCmdidx != CMD_index.CMD_cdo && generatedCmdidx != CMD_index.CMD_ldo && generatedCmdidx != CMD_index.CMD_cfdo && generatedCmdidx != CMD_index.CMD_lfdo)) {
			errornr = (int)generatedLine2;
		} else {
				errornr = 1;
		} 
		// Depending on the command jump to either next or previous entry/file.switch (generatedCmdidx) {
		case CMD_index.CMD_ldo:
				dir = 1;
				break;
		case CMD_index.CMD_cdo:
		case CMD_index.CMD_cNfile:
		case CMD_index.CMD_cprevious:
		case CMD_index.CMD_lpfile:
		case CMD_index.CMD_cfdo:
		case CMD_index.CMD_lfdo:
				dir = 3;
				break;
		case CMD_index.CMD_cNext:
		case CMD_index.CMD_lNext:
				dir = (true);
				break;
		case CMD_index.CMD_lnext:
		case CMD_index.CMD_cnext:
		case CMD_index.CMD_lprevious:
		case CMD_index.CMD_lnfile:
		case CMD_index.CMD_lNfile:
				dir = (true);
				break;
		case CMD_index.CMD_cpfile:
		case CMD_index.CMD_cnfile:
		default:
				dir = 1;
				break;
		}
		int generatedForceit = this.getForceit();
		qi.qf_jump(dir, errornr, generatedForceit);
	}
	public void ex_cbelow() {
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		int dir;
		int buf_has_flag;
		int errornr = 0;
		pos_T pos = new pos_T();
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > 0 && generatedLine2 <= 0) {
			ModernizedCProgram.emsg(((byte)(e_invrange)));
			return /*Error: Unsupported expression*/;
		} 
		CMD_index generatedCmdidx = this.getCmdidx();
		// Check whether the current buffer has any quickfix entriesif (generatedCmdidx == CMD_index.CMD_cabove || generatedCmdidx == CMD_index.CMD_cbelow || generatedCmdidx == CMD_index.CMD_cbefore || generatedCmdidx == CMD_index.CMD_cafter) {
			buf_has_flag = 1;
		} else {
				buf_has_flag = 2;
		} 
		Object generatedB_has_qf_entry = curbuf.getB_has_qf_entry();
		if (!(generatedB_has_qf_entry & buf_has_flag)) {
			ModernizedCProgram.emsg(((byte)(e_quickfix)));
			return /*Error: Unsupported expression*/;
		} 
		qf_info_S qf_info_S = new qf_info_S();
		if ((qi = qf_info_S.qf_cmd_get_stack(eap, 1)) == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		qfl = qf_list_S.qf_get_curlist(qi)// check if the list has valid errors;// check if the list has valid errors
		if (!qfl.qf_list_has_valid_entries()) {
			ModernizedCProgram.emsg(((byte)(e_quickfix)));
			return /*Error: Unsupported expression*/;
		} 
		if (generatedCmdidx == CMD_index.CMD_cbelow || generatedCmdidx == CMD_index.CMD_lbelow || generatedCmdidx == CMD_index.CMD_cafter || generatedCmdidx == CMD_index.CMD_lafter) {
			dir = 1;
		} else {
				dir = (true);
		} 
		pos = ModernizedCProgram.curwin.getW_cursor()// A quickfix entry column number is 1 based whereas cursor column;// A quickfix entry column number is 1 based whereas cursor column
		Object generatedCol = pos.getCol();
		// number is 0 based. Adjust the column number.// number is 0 based. Adjust the column number.generatedCol++;
		int generatedB_fnum = curbuf.getB_fnum();
		errornr = ModernizedCProgram.qf_find_nth_adj_entry(qfl, generatedB_fnum, pos, generatedAddr_count > 0 ? generatedLine2 : 0, dir, generatedCmdidx == CMD_index.CMD_cbelow || generatedCmdidx == CMD_index.CMD_lbelow || generatedCmdidx == CMD_index.CMD_cabove || generatedCmdidx == CMD_index.CMD_labove);
		if (errornr > 0) {
			qi.qf_jump(0, errornr, 0);
		} else {
				ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_no_more_items/*
				 * Return the autocmd name for the :cfile Ex commands
				 */)));
		} 
	}
	public void ex_cfile() {
		char_u enc = ((Object)0);
		win_T wp = ((Object)0);
		qf_info_T qi = ModernizedCProgram.ql_info;
		char_u au_name = ((Object)0);
		// init for gccint_u save_qfid = 0;
		int res;
		CMD_index generatedCmdidx = this.getCmdidx();
		au_name = ModernizedCProgram.cfile_get_auname(generatedCmdidx);
		if (au_name != ((Object)0)) {
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, ((Object)0), 0);
		} 
		Object generatedB_p_menc = curbuf.getB_p_menc();
		enc = (generatedB_p_menc != (byte)'\000') ? generatedB_p_menc : ModernizedCProgram.p_menc;
		Object[] generatedArg = this.getArg();
		if (generatedArg != (byte)'\000') {
			ModernizedCProgram.set_string_option_direct((char_u)"ef", -1, generatedArg, 1, 0);
		} 
		if (ModernizedCProgram.is_loclist_cmd(generatedCmdidx)) {
			wp = ModernizedCProgram.curwin;
		} 
		ModernizedCProgram.incr_quickfix_busy()// This function is used by the :cfile, :cgetfile and :caddfile// commands.// :cfile always creates a new quickfix list and jumps to the// first error.;// This function is used by the :cfile, :cgetfile and :caddfile// commands.// :cfile always creates a new quickfix list and jumps to the// first error.
		Object generatedCmdlinep = this.getCmdlinep();
		// :cgetfile creates a new quickfix list but doesn't jump to the// first error.// :caddfile adds to an existing quickfix list. If there is no// quickfix list then a new list is created.// :cgetfile creates a new quickfix list but doesn't jump to the// first error.// :caddfile adds to an existing quickfix list. If there is no// quickfix list then a new list is created.res = wp.qf_init(p_ef, p_efm, (generatedCmdidx != CMD_index.CMD_caddfile && generatedCmdidx != CMD_index.CMD_laddfile), ModernizedCProgram.qf_cmdtitle(generatedCmdlinep), enc);
		file_buffer generatedW_buffer = wp.getW_buffer();
		Object generatedW_llist_ref = wp.getW_llist_ref();
		Object generatedW_llist = wp.getW_llist();
		if (wp != ((Object)0)) {
			qi = ((generatedW_buffer.bt_quickfix() && generatedW_llist_ref != ((Object)0)) ? generatedW_llist_ref : generatedW_llist);
			if (qi == ((Object)0)) {
				ModernizedCProgram.decr_quickfix_busy();
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_list_S qf_list_S = new qf_list_S();
		if (res >= 0) {
			qf_list_S.qf_get_curlist(qi).qf_list_changed();
		} 
		save_qfid = qf_list_S.qf_get_curlist(qi).getQf_id();
		if (au_name != ((Object)0)) {
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPOST, au_name, ((Object)0), 0);
		} 
		int generatedForceit = this.getForceit();
		// free the list.if (res > 0 && (generatedCmdidx == CMD_index.CMD_cfile || generatedCmdidx == CMD_index.CMD_lfile) && wp.qflist_valid(save_qfid)) {
			qi.qf_jump_first(save_qfid, generatedForceit);
		} 
		ModernizedCProgram.decr_quickfix_busy();
	}
	public void ex_vimgrep() {
		regmmatch_T regmatch = new regmmatch_T();
		int fcount;
		char_u fnames = new char_u();
		char_u fname = new char_u();
		char_u title = new char_u();
		char_u s = new char_u();
		char_u p = new char_u();
		int fi;
		qf_info_T qi = new qf_info_T();
		qf_list_T qfl = new qf_list_T();
		int_u save_qfid = new int_u();
		win_T wp = ((Object)0);
		buf_T buf = new buf_T();
		int duplicate_name = 0;
		int using_dummy;
		int redraw_for_dummy = 0;
		int found_match;
		buf_T first_match_buf = ((Object)0);
		time_t seconds = 0;
		aco_save_T aco = new aco_save_T();
		int flags = 0;
		long tomatch;
		char_u dirname_start = ((Object)0);
		char_u dirname_now = ((Object)0);
		char_u target_dir = ((Object)0);
		char_u au_name = ((Object)0);
		CMD_index generatedCmdidx = this.getCmdidx();
		au_name = ModernizedCProgram.vgr_get_auname(generatedCmdidx);
		Object[] generatedB_fname = curbuf.getB_fname();
		if (au_name != ((Object)0) && curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, generatedB_fname, 1)) {
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_info_S qf_info_S = new qf_info_S();
		qi = qf_info_S.qf_cmd_get_or_alloc_stack(eap, wp);
		if (qi == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count > 0) {
			tomatch = generatedLine2;
		} else {
				tomatch = LONG_MAX;
		} 
		// Get the search pattern: either white-separated or enclosed in //// Get the search pattern: either white-separated or enclosed in //regmatch.setRegprog(((Object)0));
		Object generatedCmdlinep = this.getCmdlinep();
		title = ModernizedCProgram.vim_strsave(ModernizedCProgram.qf_cmdtitle(generatedCmdlinep));
		Object[] generatedArg = this.getArg();
		p = ModernizedCProgram.skip_vimgrep_pat(generatedArg, s, flags);
		if (p == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)(e_invalpat)));
			;
		} 
		regmatch.vgr_init_regmatch(s);
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedRegprog == ((Object)0)) {
			;
		} 
		p = ModernizedCProgram.skipwhite(p);
		if (p == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)("E683: File name missing or invalid pattern")));
			;
		} 
		if ((generatedCmdidx != CMD_index.CMD_grepadd && generatedCmdidx != CMD_index.CMD_lgrepadd && generatedCmdidx != CMD_index.CMD_vimgrepadd && generatedCmdidx != CMD_index.CMD_lvimgrepadd) || qi.qf_stack_empty()) {
			qi.qf_new_list(title != ((Object)0) ? title : ModernizedCProgram.qf_cmdtitle(generatedCmdlinep));
		} 
		// parse the list of argumentsif (ModernizedCProgram.get_arglist_exp(p, fcount, fnames, 1) == 0) {
			;
		} 
		if (fcount == 0) {
			ModernizedCProgram.emsg(((byte)(e_nomatch)));
			;
		} 
		dirname_start = ModernizedCProgram.alloc_id(1024, .aid_qf_dirname_start);
		dirname_now = ModernizedCProgram.alloc_id(1024, .aid_qf_dirname_now);
		if (dirname_start == ((Object)0) || dirname_now == ((Object)0)) {
			ModernizedCProgram.FreeWild(fcount, fnames);
			;
		} 
		// Remember the current directory, because a BufRead autocommand that does// ":lcd %:p:h" changes the meaning of short path names.// Remember the current directory, because a BufRead autocommand that does// ":lcd %:p:h" changes the meaning of short path names.ModernizedCProgram.mch_dirname(dirname_start, 1024);
		ModernizedCProgram.incr_quickfix_busy()// Remember the current quickfix list identifier, so that we can check for;// Remember the current quickfix list identifier, so that we can check for
		qf_list_S qf_list_S = new qf_list_S();
		// autocommands changing the current quickfix list.// autocommands changing the current quickfix list.save_qfid = qf_list_S.qf_get_curlist(qi).getQf_id();
		seconds = (time_t)0;
		file_buffer file_buffer = new file_buffer();
		memline generatedB_ml = buf.getB_ml();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		file_buffer file_buffer = new file_buffer();
		Object[] generatedB_p_bh = buf.getB_p_bh();
		int generatedB_flags = buf.getB_flags();
		Object generatedB_p_ft = buf.getB_p_ft();
		for (fi = 0; fi < fcount && !got_int && tomatch > 0; ++fi) {
			fname = ModernizedCProgram.shorten_fname1(fnames[fi]);
			if (/*Error: Function owner not recognized*/time(((Object)0)) > seconds) {
				seconds = /*Error: Function owner not recognized*/time(((Object)0));
				ModernizedCProgram.vgr_display_fname(fname);
			} 
			buf = file_buffer.buflist_findname_exp(fnames[fi]);
			if (buf == ((Object)0) || generatedMl_mfp == ((Object)0)) {
				duplicate_name = (buf != ((Object)0));
				using_dummy = 1;
				redraw_for_dummy = 1;
				buf = file_buffer.vgr_load_dummy_buf(fname, dirname_start, dirname_now);
			} else {
					using_dummy = 0;
			} 
			if (!ModernizedCProgram.vgr_qflist_valid(wp, qi, save_qfid, ModernizedCProgram.qf_cmdtitle(generatedCmdlinep))) {
				ModernizedCProgram.FreeWild(fcount, fnames);
				ModernizedCProgram.decr_quickfix_busy();
				;
			} 
			save_qfid = qf_list_S.qf_get_curlist(qi).getQf_id();
			if (buf == ((Object)0)) {
				if (!got_int) {
					ModernizedCProgram.smsg(((byte)("Cannot open file \"%s\"")), fname);
				} 
			} else {
					found_match = ModernizedCProgram.vgr_match_buflines(qf_list_S.qf_get_curlist(qi), fname, buf, regmatch, tomatch, duplicate_name, flags);
					if (using_dummy) {
						if (found_match && first_match_buf == ((Object)0)) {
							first_match_buf = buf;
						} 
						if (duplicate_name) {
							buf.wipe_dummy_buffer(dirname_start);
							buf = ((Object)0);
						}  else if (!ModernizedCProgram.cmdmod.getHide() || generatedB_p_bh[0] == (byte)'u' || generatedB_p_bh[0] == (byte)'w' || generatedB_p_bh[0] == (byte)'d') {
							if (!found_match) {
								buf.wipe_dummy_buffer(dirname_start);
								buf = ((Object)0);
							}  else if (buf != first_match_buf || (flags & 2)) {
								buf.unload_dummy_buffer(dirname_start);
								generatedB_flags &=  ~-1024;
								buf = ((Object)0);
							} 
						} 
						if (buf != ((Object)0)) {
							generatedB_flags &=  ~-1024;
							if (buf == first_match_buf && target_dir == ((Object)0) && /*Error: Function owner not recognized*/strcmp((byte)(dirname_start), (byte)(dirname_now)) != 0) {
								target_dir = ModernizedCProgram.vim_strsave(dirname_now);
							} 
							ModernizedCProgram.aucmd_prepbuf(aco, buf);
							buf.apply_autocmds(auto_event.EVENT_FILETYPE, generatedB_p_ft, generatedB_fname, 1);
							ModernizedCProgram.do_modelines(32);
							aco.aucmd_restbuf();
						} 
					} 
			} 
		}
		ModernizedCProgram.FreeWild(fcount, fnames);
		qfl = qf_list_S.qf_get_curlist(qi);
		qfl.setQf_nonevalid(0);
		qfline_S generatedQf_start = qfl.getQf_start();
		qfl.setQf_ptr(generatedQf_start);
		qfl.setQf_index(1);
		qfl.qf_list_changed();
		ModernizedCProgram.qf_update_buffer(qi, ((Object)0));
		if (au_name != ((Object)0)) {
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPOST, au_name, generatedB_fname, 1);
		} 
		// is still valid.if (!wp.qflist_valid(save_qfid) || qi.qf_restore_list(save_qfid) == 0) {
			ModernizedCProgram.decr_quickfix_busy();
			;
		} 
		int generatedForceit = this.getForceit();
		// Jump to first match.if (!qf_list_S.qf_get_curlist(qi).qf_list_empty()) {
			if ((flags & 2) == 0) {
				ModernizedCProgram.vgr_jump_to_match(qi, generatedForceit, redraw_for_dummy, first_match_buf, target_dir);
			} 
		} else {
				ModernizedCProgram.semsg(((byte)(e_nomatch2)), s);
		} 
		ModernizedCProgram.decr_quickfix_busy()// If we loaded a dummy buffer into the current window, the autocommands;// If we loaded a dummy buffer into the current window, the autocommands
		// may have messed up things, need to redraw and recompute folds.if (redraw_for_dummy) {
			ModernizedCProgram.curwin.foldUpdateAll();
		} 
		ModernizedCProgram.vim_free(dirname_now);
		ModernizedCProgram.vim_free(dirname_start);
		ModernizedCProgram.vim_free(target_dir);
		generatedRegprog.vim_regfree();
	}
	public void ex_cbuffer() {
		buf_T buf = ((Object)0);
		qf_info_T qi = new qf_info_T();
		char_u au_name = ((Object)0);
		int res;
		int_u save_qfid = new int_u();
		win_T wp = ((Object)0);
		char_u qf_title = new char_u();
		linenr_T line1 = new linenr_T();
		linenr_T line2 = new linenr_T();
		CMD_index generatedCmdidx = this.getCmdidx();
		au_name = ModernizedCProgram.cbuffer_get_auname(generatedCmdidx);
		Object[] generatedB_fname = curbuf.getB_fname();
		if (au_name != ((Object)0) && curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, generatedB_fname, 1)) {
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_info_S qf_info_S = new qf_info_S();
		// Must come after autocommands.// Must come after autocommands.qi = qf_info_S.qf_cmd_get_or_alloc_stack(eap, wp);
		if (qi == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.cbuffer_process_args(eap, buf, line1, line2) == 0) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedCmdlinep = this.getCmdlinep();
		qf_title = ModernizedCProgram.qf_cmdtitle(generatedCmdlinep);
		Object generatedB_sfname = buf.getB_sfname();
		if (generatedB_sfname) {
			ModernizedCProgram.vim_snprintf((byte)ModernizedCProgram.IObuff, (1024 + 1), "%s (%s)", (byte)qf_title, (byte)generatedB_sfname);
			qf_title = ModernizedCProgram.IObuff;
		} 
		ModernizedCProgram.incr_quickfix_busy();
		int generatedQf_curlist = qi.getQf_curlist();
		res = ModernizedCProgram.qf_init_ext(qi, generatedQf_curlist, ((Object)0), buf, ((Object)0), p_efm, (generatedCmdidx != CMD_index.CMD_caddbuffer && generatedCmdidx != CMD_index.CMD_laddbuffer), line1, line2, qf_title, ((Object)0));
		if (qi.qf_stack_empty()) {
			ModernizedCProgram.decr_quickfix_busy();
			return /*Error: Unsupported expression*/;
		} 
		qf_list_S qf_list_S = new qf_list_S();
		if (res >= 0) {
			qf_list_S.qf_get_curlist(qi).qf_list_changed();
		} 
		// check for autocommands changing the current quickfix list.// check for autocommands changing the current quickfix list.save_qfid = qf_list_S.qf_get_curlist(qi).getQf_id();
		if (au_name != ((Object)0)) {
			buf_T curbuf_old = curbuf;
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPOST, au_name, generatedB_fname, 1);
			if (curbuf != curbuf_old) {
				res = 0;
			} 
		} 
		int generatedForceit = this.getForceit();
		// free the list.if (res > 0 && (generatedCmdidx == CMD_index.CMD_cbuffer || generatedCmdidx == CMD_index.CMD_lbuffer) && wp.qflist_valid(save_qfid)) {
			qi.qf_jump_first(save_qfid, generatedForceit);
		} 
		ModernizedCProgram.decr_quickfix_busy();
	}
	public void ex_cexpr() {
		typval_T tv = new typval_T();
		qf_info_T qi = new qf_info_T();
		char_u au_name = ((Object)0);
		int res;
		int_u save_qfid = new int_u();
		win_T wp = ((Object)0);
		CMD_index generatedCmdidx = this.getCmdidx();
		au_name = ModernizedCProgram.cexpr_get_auname(generatedCmdidx);
		Object[] generatedB_fname = curbuf.getB_fname();
		if (au_name != ((Object)0) && curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, generatedB_fname, 1)) {
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_info_S qf_info_S = new qf_info_S();
		qi = qf_info_S.qf_cmd_get_or_alloc_stack(eap, wp);
		if (qi == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedArg = this.getArg();
		// use it to fill the errorlist.// use it to fill the errorlist.tv = ModernizedCProgram.eval_expr(generatedArg, ((Object)0));
		Object generatedV_type = tv.getV_type();
		Object generatedVval = tv.getVval();
		int generatedQf_curlist = qi.getQf_curlist();
		Object generatedCmdlinep = this.getCmdlinep();
		qf_list_S qf_list_S = new qf_list_S();
		int generatedForceit = this.getForceit();
	}
	public void ex_helpgrep() {
		regmatch_T regmatch = new regmatch_T();
		char_u save_cpo = new char_u();
		qf_info_T qi = ModernizedCProgram.ql_info;
		int new_qi = 0;
		char_u au_name = ((Object)0);
		char_u lang = ((Object)0);
		CMD_index generatedCmdidx = this.getCmdidx();
		switch (generatedCmdidx) {
		case CMD_index.CMD_helpgrep:
				au_name = (char_u)"helpgrep";
				break;
		case CMD_index.CMD_lhelpgrep:
				au_name = (char_u)"lhelpgrep";
				break;
		default:
				break;
		}
		Object[] generatedB_fname = curbuf.getB_fname();
		if (au_name != ((Object)0) && curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPRE, au_name, generatedB_fname, 1)) {
			if (ModernizedCProgram.aborting()) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		qf_info_S qf_info_S = new qf_info_S();
		if (ModernizedCProgram.is_loclist_cmd(generatedCmdidx)) {
			qi = qf_info_S.hgr_get_ll(new_qi);
			if (qi == ((Object)0)) {
				return /*Error: Unsupported expression*/;
			} 
		} 
		// Make 'cpoptions' empty, the 'l' flag should not be used here.// Make 'cpoptions' empty, the 'l' flag should not be used here.save_cpo = ModernizedCProgram.p_cpo;
		ModernizedCProgram.p_cpo = empty_option;
		ModernizedCProgram.incr_quickfix_busy();
		Object[] generatedArg = this.getArg();
		// Check for a specified language// Check for a specified languagelang = ModernizedCProgram.check_help_lang(generatedArg);
		regprog regprog = new regprog();
		regmatch.setRegprog(regprog.vim_regcomp(generatedArg, 1 + 2));
		regmatch.setRm_ic(0);
		Object generatedRegprog = regmatch.getRegprog();
		Object generatedCmdlinep = this.getCmdlinep();
		qf_list_S qf_list_S = new qf_list_S();
		qfline_S generatedQf_start = qfl.getQf_start();
		if (generatedRegprog != ((Object)0)) {
			qf_list_T qfl = new qf_list_T();
			qi.qf_new_list(ModernizedCProgram.qf_cmdtitle(generatedCmdlinep));
			qfl = qf_list_S.qf_get_curlist(qi);
			ModernizedCProgram.hgr_search_in_rtp(qfl, regmatch, lang);
			generatedRegprog.vim_regfree();
			qfl.setQf_nonevalid(0);
			qfl.setQf_ptr(generatedQf_start);
			qfl.setQf_index(1);
			qfl.qf_list_changed();
			ModernizedCProgram.qf_update_buffer(qi, ((Object)0));
		} 
		if (ModernizedCProgram.p_cpo == empty_option) {
			ModernizedCProgram.p_cpo = save_cpo;
		} else {
				ModernizedCProgram.free_string_option(save_cpo);
		} 
		 generatedQfl_type = qi.getQfl_type();
		file_buffer file_buffer = new file_buffer();
		if (au_name != ((Object)0)) {
			curbuf.apply_autocmds(auto_event.EVENT_QUICKFIXCMDPOST, au_name, generatedB_fname, 1);
			if (!new_qi && (generatedQfl_type == .QFLT_LOCATION) && file_buffer.qf_find_buf(qi) == ((Object)0)) {
				ModernizedCProgram.decr_quickfix_busy();
				return /*Error: Unsupported expression*/;
			} 
		} 
		// Jump to first match.if (!qf_list_S.qf_get_curlist(qi).qf_list_empty()) {
			qi.qf_jump(0, 0, 0);
		} else {
				ModernizedCProgram.semsg(((byte)(e_nomatch2)), generatedArg);
		} 
		ModernizedCProgram.decr_quickfix_busy();
		if (generatedCmdidx == CMD_index.CMD_lhelpgrep) {
			if (!ModernizedCProgram.curwin.getW_buffer().bt_help() || ModernizedCProgram.curwin.getW_llist() == qi) {
				if (new_qi) {
					qi.ll_free_all();
				} 
			}  else if (ModernizedCProgram.curwin.getW_llist() == ((Object)0)) {
				ModernizedCProgram.curwin.setW_llist(qi/* FEAT_QUICKFIX */);
			} 
		} 
		// If the help window is not opened or if it already points to the
	}
	public void ex_function() {
		char_u theline = new char_u();
		char_u line_to_free = ((Object)0);
		int j;
		int c;
		int saved_did_emsg;
		int saved_wait_return = need_wait_return;
		char_u name = ((Object)0);
		char_u p = new char_u();
		char_u arg = new char_u();
		char_u line_arg = ((Object)0);
		garray_T newargs = new garray_T();
		garray_T default_args = new garray_T();
		garray_T newlines = new garray_T();
		int varargs = 0;
		int flags = 0;
		ufunc_T fp = new ufunc_T();
		int overwrite = 0;
		int indent;
		int nesting;
		dictitem_T v = new dictitem_T();
		funcdict_T fudi = new funcdict_T();
		int func_nr = /* number for nameless function */0;
		int paren;
		hashtab_T ht = new hashtab_T();
		int todo;
		hashitem_T hi = new hashitem_T();
		int do_concat = 1;
		linenr_T sourcing_lnum_off = new linenr_T();
		linenr_T sourcing_lnum_top = new linenr_T();
		int is_heredoc = 0;
		char_u skip_until = ((Object)0);
		char_u heredoc_trimmed = ((Object)0/*
		     * ":function" without argument: list functions.
		     */);
		Object[] generatedArg = this.getArg();
		int generatedSkip = this.getSkip();
		Object generatedHi_key = (hi).getHi_key();
		Object generatedUf_name = fp.getUf_name();
		if (ModernizedCProgram.ends_excmd(generatedArg)) {
			if (!generatedSkip) {
				todo = (int)ModernizedCProgram.func_hashtab.getHt_used();
				for (hi = ModernizedCProgram.func_hashtab.getHt_array(); todo > 0 && !got_int; ++hi) {
					if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
						--todo;
						fp = ((ufunc_T)((generatedHi_key) - ((size_t)((ufunc_T)0).getUf_name())));
						if (ModernizedCProgram.message_filtered(generatedUf_name)) {
							continue;
						} 
						if (!ModernizedCProgram.func_name_refcount(generatedUf_name)) {
							fp.list_func_head(0);
						} 
					} 
				}
			} 
			this.setNextcmd(ModernizedCProgram.check_nextcmd(generatedArg));
			return /*Error: Unsupported expression*/;
		} 
		regprog regprog = new regprog();
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedArg == /*
		     * ":function /pat": list functions matching pattern.
		     */(byte)'/') {
			p = ModernizedCProgram.skip_regexp(generatedArg + 1, (byte)'/', 1, ((Object)0));
			if (!generatedSkip) {
				regmatch_T regmatch = new regmatch_T();
				c = p;
				p = (byte)'\000';
				regmatch.setRegprog(regprog.vim_regcomp(generatedArg + 1, 1));
				p = c;
				if (generatedRegprog != ((Object)0)) {
					regmatch.setRm_ic(ModernizedCProgram.p_ic);
					todo = (int)ModernizedCProgram.func_hashtab.getHt_used();
					for (hi = ModernizedCProgram.func_hashtab.getHt_array(); todo > 0 && !got_int; ++hi) {
						if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
							--todo;
							fp = ((ufunc_T)((generatedHi_key) - ((size_t)generatedUf_name)));
							if (!/*Error: Function owner not recognized*/isdigit(generatedUf_name) && regmatch.vim_regexec(generatedUf_name, 0)) {
								fp.list_func_head(0);
							} 
						} 
					}
					generatedRegprog.vim_regfree();
				} 
			} 
			if (p == (byte)'/') {
				++p;
			} 
			this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
			return /*Error: Unsupported expression*/;
		} 
		p = generatedArg;
		name = ModernizedCProgram.trans_function_name(p, generatedSkip, 4, fudi, ((Object)0));
		paren = (ModernizedCProgram.vim_strchr(p, (byte)'(') != ((Object)0));
		Object generatedFd_dict = fudi.getFd_dict();
		Object generatedFd_newkey = fudi.getFd_newkey();
		if (name == ((Object)0) && (generatedFd_dict == ((Object)0) || !paren) && !generatedSkip) {
			if (!ModernizedCProgram.aborting()) {
				if (!generatedSkip && generatedFd_newkey != ((Object)0)) {
					ModernizedCProgram.semsg(((byte)(e_dictkey)), generatedFd_newkey);
				} 
				ModernizedCProgram.vim_free(generatedFd_newkey);
				return /*Error: Unsupported expression*/;
			} else {
					this.setSkip(1);
			} 
		} 
		saved_did_emsg = /* An error in a function call during evaluation of an expression in magic
		     * braces should not cause the function not to be defined. */ModernizedCProgram.did_emsg;
		ModernizedCProgram.did_emsg = 0/*
		     * ":function func" with only function name: list function.
		     */;
		Object generatedNextcmd = this.getNextcmd();
		Object generatedUf_lines = fp.getUf_lines();
		if (!paren) {
			if (!ModernizedCProgram.ends_excmd(ModernizedCProgram.skipwhite(p))) {
				ModernizedCProgram.emsg(((byte)(e_trailing)));
				;
			} 
			this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
			if (generatedNextcmd != ((Object)0)) {
				p = (byte)'\000';
			} 
			if (!generatedSkip && !got_int) {
				fp = ModernizedCProgram.find_func(name);
				if (fp != ((Object)0)) {
					fp.list_func_head(1);
					for (j = 0; j < generatedUf_lines.getGa_len() && !got_int; ++j) {
						if (((char_u)(generatedUf_lines.getGa_data()))[j] == ((Object)0)) {
							continue;
						} 
						ModernizedCProgram.msg_putchar((byte)'\n');
						ModernizedCProgram.msg_outnum((long)(j + 1));
						if (j < 9) {
							ModernizedCProgram.msg_putchar((byte)' ');
						} 
						if (j < 99) {
							ModernizedCProgram.msg_putchar((byte)' ');
						} 
						ModernizedCProgram.msg_prt_line(((char_u)(generatedUf_lines.getGa_data()))[j], 0);
						ModernizedCProgram.out_flush();
						ModernizedCProgram.ui_breakcheck();
					}
					if (!got_int) {
						ModernizedCProgram.msg_putchar((byte)'\n');
						ModernizedCProgram.msg_puts("   endfunction");
					} 
				} else {
						ModernizedCProgram.emsg_funcname("E123: Undefined function: %s", name);
				} 
			} 
			;
		} 
		p = ModernizedCProgram.skipwhite(/*
		     * ":function name(arg1, arg2)" Define function.
		     */p);
		if (p != (byte)'(') {
			if (!generatedSkip) {
				ModernizedCProgram.semsg(((byte)("E124: Missing '(': %s")), generatedArg);
				;
			} 
			if (ModernizedCProgram.vim_strchr(p, (byte)'(') != ((Object)/* attempt to continue by skipping some text */0)) {
				p = ModernizedCProgram.vim_strchr(p, (byte)'(');
			} 
		} 
		p = ModernizedCProgram.skipwhite(p + 1);
		newlines.ga_init2((int)/*Error: Unsupported expression*/, 3);
		Object generatedFd_di = fudi.getFd_di();
		if (!generatedSkip) {
			if (name != ((Object)/* Check the name of the function.  Unless it's a dictionary function
				 * (that we are overwriting). */0)) {
				arg = name;
			} else {
					arg = generatedFd_newkey;
			} 
			if (arg != ((Object)0) && (generatedFd_di == ((Object)0) || (generatedFd_di.getDi_tv().getV_type() != .VAR_FUNC && generatedFd_di.getDi_tv().getV_type() != .VAR_PARTIAL))) {
				if (arg == (true)) {
					j = 3;
				} else {
						j = 0;
				} 
				while (arg[j] != (byte)'\000' && (j == 0 ? ModernizedCProgram.eval_isnamec1(arg[j]) : ModernizedCProgram.eval_isnamec(arg[j]))) {
					++j;
				}
				if (arg[j] != (byte)'\000') {
					ModernizedCProgram.emsg_funcname((byte)e_invarg2, arg);
				} 
			} 
			if (generatedFd_dict != ((Object)0) && generatedFd_dict.getDv_scope() == /* Disallow using the g: dict. */2) {
				ModernizedCProgram.emsg(((byte)("E862: Cannot use g: here")));
			} 
		} 
		if (newargs.get_function_args(p, (byte)')', varargs, default_args, generatedSkip) == 0) {
			;
		} 
		/* find extra arguments "range", "dict", "abort" and "closure" */for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			p = ModernizedCProgram.skipwhite(p);
			if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("range"), (size_t)(true)) == 0) {
				flags |=  -1024;
				p += 5;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("dict"), (size_t)(true)) == 0) {
				flags |=  -1024;
				p += 4;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("abort"), (size_t)(true)) == 0) {
				flags |=  -1024;
				p += 5;
			}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("closure"), (size_t)(true)) == 0) {
				flags |=  -1024;
				p += 7;
				if (ModernizedCProgram.current_funccal == ((Object)0)) {
					ModernizedCProgram.emsg_funcname("E932: Closure function should not be at top level: %s", name == ((Object)0) ? (char_u)"" : name);
					;
				} 
			} else {
					break;
			} 
		}
		if (p == /* When there is a line break use what follows for the function body.
		     * Makes 'exe "func Test()\n...\nendfunc"' work. */(byte)'\n') {
			line_arg = p + 1;
		}  else if (p != (byte)'\000' && p != (byte)'"' && !generatedSkip && !ModernizedCProgram.did_emsg) {
			ModernizedCProgram.emsg(((byte)(e_trailing/*
			     * Read the body of the function, until ":endfunction" is found.
			     */)));
		} 
		int generatedForceit = this.getForceit();
		if (ModernizedCProgram.KeyTyped/* Check if the function already exists, don't let the user type the
			 * whole function before telling him it doesn't work!  For a script we
			 * need to skip the body to be able to find what follows. */) {
			if (!generatedSkip && !generatedForceit) {
				if (generatedFd_dict != ((Object)0) && generatedFd_newkey == ((Object)0)) {
					ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_funcdict)));
				}  else if (name != ((Object)0) && ModernizedCProgram.find_func(name) != ((Object)0)) {
					ModernizedCProgram.emsg_funcname(ModernizedCProgram.e_funcexts, name);
				} 
			} 
			if (!generatedSkip && ModernizedCProgram.did_emsg) {
				;
			} 
			ModernizedCProgram.msg_putchar(/* don't overwrite the function name */(byte)'\n');
			ModernizedCProgram.cmdline_row = ModernizedCProgram.msg_row;
		} 
		// Save the starting line number.// Save the starting line number.sourcing_lnum_top = sourcing_lnum;
		indent = 2;
		nesting = 0;
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		Object generatedCmdlinep = this.getCmdlinep();
		Object generatedGa_data = newlines.getGa_data();
		int generatedGa_len = newlines.getGa_len();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (ModernizedCProgram.KeyTyped) {
				msg_scroll = 1;
				saved_wait_return = 0;
			} 
			need_wait_return = 0;
			if (line_arg != ((Object)0)) {
				theline = /* Use eap->arg, split up in parts by line breaks. */line_arg;
				p = ModernizedCProgram.vim_strchr(theline, (byte)'\n');
				if (p == ((Object)0)) {
					line_arg += /*Error: Function owner not recognized*/strlen((byte)(line_arg));
				} else {
						p = (byte)'\000';
						line_arg = p + 1;
				} 
			} else {
					ModernizedCProgram.vim_free(line_to_free);
					if (generatedGetline == ((Object)0)) {
						theline = ModernizedCProgram.getcmdline((byte)':', -1024, indent, do_concat);
					} else {
							theline = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((byte)':', generatedCookie, indent, do_concat);
					} 
					line_to_free = theline;
			} 
			if (ModernizedCProgram.KeyTyped) {
				lines_left = ModernizedCProgram.Rows - 1;
			} 
			if (theline == ((Object)0)) {
				ModernizedCProgram.emsg(((byte)("E126: Missing :endfunction")));
				;
			} 
			sourcing_lnum_off = ModernizedCProgram.get_sourced_lnum(generatedGetline, generatedCookie);
			if (sourcing_lnum < sourcing_lnum_off) {
				sourcing_lnum_off -= sourcing_lnum;
			} else {
					sourcing_lnum_off = 0;
			} 
			if (skip_until != ((Object)0)) {
				if (heredoc_trimmed == ((Object)0) || (is_heredoc && ModernizedCProgram.skipwhite(theline) == theline) || /*Error: Function owner not recognized*/strncmp((byte)(theline), (byte)(heredoc_trimmed), (size_t)(/*Error: Function owner not recognized*/strlen((byte)(heredoc_trimmed)))) == 0) {
					if (heredoc_trimmed == ((Object)0)) {
						p = theline;
					}  else if (is_heredoc) {
						p = ModernizedCProgram.skipwhite(theline) == theline ? theline : theline + /*Error: Function owner not recognized*/strlen((byte)(heredoc_trimmed));
					} else {
							p = theline + /*Error: Function owner not recognized*/strlen((byte)(heredoc_trimmed));
					} 
					if (/*Error: Function owner not recognized*/strcmp((byte)(p), (byte)(skip_until)) == 0) {
						do {
							if ((skip_until) != ((Object)0)) {
								ModernizedCProgram.vim_free(skip_until);
								(skip_until) = ((Object)0);
							} 
						} while (0);
						do {
							if ((heredoc_trimmed) != ((Object)0)) {
								ModernizedCProgram.vim_free(heredoc_trimmed);
								(heredoc_trimmed) = ((Object)0);
							} 
						} while (0);
						do_concat = 1;
						is_heredoc = 0;
					} 
				} 
			} else {
					for (p = theline; ((p) == (byte)' ' || (p) == (byte)'\t') || p == (byte)':'; ++/* skip ':' and blanks*/p) {
						;
					}
					if (ModernizedCProgram.checkforcmd(p, "endfunction", 4) && nesting-- == /* Check for "endfunction". */0) {
						char_u nextcmd = ((Object)0);
						if (p == (byte)'|') {
							nextcmd = p + 1;
						}  else if (line_arg != ((Object)0) && ModernizedCProgram.skipwhite(line_arg) != (byte)'\000') {
							nextcmd = line_arg;
						}  else if (p != (byte)'\000' && p != (byte)'"' && ModernizedCProgram.p_verbose > 0) {
							ModernizedCProgram.give_warning2((char_u)((byte)("W22: Text found after :endfunction: %s")), p, 1);
						} 
						if (nextcmd != ((Object)0/* Another command follows. If the line came from "eap" we
								     * can simply point into it, otherwise we need to change
								     * "eap->cmdlinep". */)) {
							this.setNextcmd(nextcmd);
							if (line_to_free != ((Object)0)) {
								ModernizedCProgram.vim_free(generatedCmdlinep);
								generatedCmdlinep = line_to_free;
								line_to_free = ((Object)0);
							} 
						} 
						break;
					} 
					if (indent > 2 && /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("end"), (size_t)(true)) == /* Increase indent inside "if", "while", "for" and "try", decrease
						     * at "end". */0) {
						indent -= 2;
					}  else if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("if"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("wh"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("for"), (size_t)(true)) == 0 || /*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("try"), (size_t)(true)) == 0) {
						indent += 2;
					} 
					if (ModernizedCProgram.checkforcmd(p, "function", /* Check for defining a function inside this function. */2)) {
						if (p == (byte)'!') {
							p = ModernizedCProgram.skipwhite(p + 1);
						} 
						p += ModernizedCProgram.eval_fname_script(p);
						ModernizedCProgram.vim_free(ModernizedCProgram.trans_function_name(p, 1, 0, ((Object)0), ((Object)0)));
						if (ModernizedCProgram.skipwhite(p) == (byte)'(') {
							++nesting;
							indent += 2;
						} 
					} 
					p = ModernizedCProgram.skip_range(p, ((Object)/* Check for ":append", ":change", ":insert". */0));
					if ((p[0] == (byte)'a' && (!(((int)(p[1]) - (byte)'A' < 26) || ((int)(p[1]) - (byte)'a' < 26)) || p[1] == (byte)'p')) || (p[0] == (byte)'c' && (!(((int)(p[1]) - (byte)'A' < 26) || ((int)(p[1]) - (byte)'a' < 26)) || (p[1] == (byte)'h' && (!(((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || (p[2] == (byte)'a' && (/*Error: Function owner not recognized*/strncmp((byte)(p[3]), (byte)("nge"), (size_t)(true)) != 0 || !(((int)(p[6]) - (byte)'A' < 26) || ((int)(p[6]) - (byte)'a' < 26)))))))) || (p[0] == (byte)'i' && (!(((int)(p[1]) - (byte)'A' < 26) || ((int)(p[1]) - (byte)'a' < 26)) || (p[1] == (byte)'n' && (!(((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || (p[2] == (byte)'s')))))) {
						skip_until = ModernizedCProgram.vim_strsave((char_u)".");
					} 
					arg = ModernizedCProgram.skipwhite(ModernizedCProgram.skiptowhite(/* Check for ":python <<EOF", ":tcl <<EOF", etc. */p));
					if (arg[0] == (byte)'<' && arg[1] == (byte)'<' && ((p[0] == (byte)'p' && p[1] == (byte)'y' && (!((((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || ((int)(p[2]) - (byte)'0' < 10)) || p[2] == (byte)'t' || ((p[2] == (byte)'3' || p[2] == (byte)'x') && !(((int)(p[3]) - (byte)'A' < 26) || ((int)(p[3]) - (byte)'a' < 26))))) || (p[0] == (byte)'p' && p[1] == (byte)'e' && (!(((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || p[2] == (byte)'r')) || (p[0] == (byte)'t' && p[1] == (byte)'c' && (!(((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || p[2] == (byte)'l')) || (p[0] == (byte)'l' && p[1] == (byte)'u' && p[2] == (byte)'a' && !(((int)(p[3]) - (byte)'A' < 26) || ((int)(p[3]) - (byte)'a' < 26))) || (p[0] == (byte)'r' && p[1] == (byte)'u' && p[2] == (byte)'b' && (!(((int)(p[3]) - (byte)'A' < 26) || ((int)(p[3]) - (byte)'a' < 26)) || p[3] == (byte)'y')) || (p[0] == (byte)'m' && p[1] == (byte)'z' && (!(((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || p[2] == (byte)'s')))) {
						p = ModernizedCProgram.skipwhite(arg + /* ":python <<" continues until a dot, like ":append" */2);
						if (p == (byte)'\000') {
							skip_until = ModernizedCProgram.vim_strsave((char_u)".");
						} else {
								skip_until = ModernizedCProgram.vim_strsave(p);
						} 
					} 
					arg = ModernizedCProgram.skipwhite(ModernizedCProgram.skiptowhite(p));
					arg = ModernizedCProgram.skipwhite(ModernizedCProgram.skiptowhite(arg));
					if (arg[0] == (byte)'=' && arg[1] == (byte)'<' && arg[2] == (byte)'<' && ((p[0] == (byte)'l' && p[1] == (byte)'e' && (!((((int)(p[2]) - (byte)'A' < 26) || ((int)(p[2]) - (byte)'a' < 26)) || ((int)(p[2]) - (byte)'0' < 10)) || (p[2] == (byte)'t' && !((((int)(p[3]) - (byte)'A' < 26) || ((int)(p[3]) - (byte)'a' < 26)) || ((int)(p[3]) - (byte)'0' < 10))))))) {
						p = ModernizedCProgram.skipwhite(arg + 3);
						if (/*Error: Function owner not recognized*/strncmp((byte)(p), (byte)("trim"), (size_t)(true)) == 0) {
							p = ModernizedCProgram.skipwhite(p + 4);
							heredoc_trimmed = ModernizedCProgram.vim_strnsave(theline, (int)(ModernizedCProgram.skipwhite(theline) - theline));
						} 
						skip_until = ModernizedCProgram.vim_strnsave(p, (int)(ModernizedCProgram.skiptowhite(p) - p));
						do_concat = 0;
						is_heredoc = 1;
					} 
			} 
			if (newlines.ga_grow(1 + sourcing_lnum_off) == /* Add the line to the function. */0) {
				;
			} 
			p = ModernizedCProgram.vim_strsave(theline);
			if (p == ((Object)0)) {
				;
			} 
			((char_u)(generatedGa_data))[generatedGa_len++] = p;
			while (sourcing_lnum_off-- > /* Add NULL lines for continuation lines, so that the line count is
				 * equal to the index in the growarray.   */0) {
				((char_u)(generatedGa_data))[generatedGa_len++] = ((Object)0);
			}
			if (line_arg != ((Object)0) && line_arg == /* Check for end of eap->arg. */(byte)'\000') {
				line_arg = ((Object)0);
			} 
		}
		if (generatedSkip || /* Don't define the function when skipping commands or when an error was
		     * detected. */ModernizedCProgram.did_emsg) {
			;
		} 
		dictitem_S dictitem_S = new dictitem_S();
		 generatedDi_tv = v.getDi_tv();
		Object generatedV_type = generatedDi_tv.getV_type();
		Object generatedUf_script_ctx = fp.getUf_script_ctx();
		Object generatedSc_sid = current_sctx.getSc_sid();
		Object generatedSc_seq = current_sctx.getSc_seq();
		Object generatedUf_calls = fp.getUf_calls();
		Object generatedUf_refcount = fp.getUf_refcount();
		Object generatedUf_flags = fp.getUf_flags();
		Object generatedV_lock = generatedDi_tv.getV_lock();
		if (generatedFd_dict == ((Object)0)) {
			v = dictitem_S.find_var(name, ht, 0);
			if (v != ((Object)0) && generatedV_type == .VAR_FUNC) {
				ModernizedCProgram.emsg_funcname("E707: Function name conflicts with variable: %s", name);
				;
			} 
			fp = ModernizedCProgram.find_func(name);
			if (fp != ((Object)0)) {
				if (!generatedForceit && (generatedUf_script_ctx.getSc_sid() != generatedSc_sid || generatedUf_script_ctx.getSc_seq() == generatedSc_seq)) {
					ModernizedCProgram.emsg_funcname(ModernizedCProgram.e_funcexts, name);
					;
				} 
				if (generatedUf_calls > 0) {
					ModernizedCProgram.emsg_funcname("E127: Cannot redefine function %s: It is in use", name);
					;
				} 
				if (generatedUf_refcount > 1) {
					--generatedUf_refcount;
					generatedUf_flags |=  -1024;
					fp = ((Object)0);
					overwrite = 1;
				} else {
						do {
							if ((name) != ((Object)0)) {
								ModernizedCProgram.vim_free(name);
								(name) = ((Object)0);
							} 
						} while (/* redefine existing function */0);
						fp.func_clear_items();
						fp.setUf_profiling(0);
						fp.setUf_prof_initialized(0);
				} 
			} 
		} else {
				byte[] numbuf = new byte[20];
				fp = ((Object)0);
				if (generatedFd_newkey == ((Object)0) && !generatedForceit) {
					ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_funcdict)));
					;
				} 
				if (generatedFd_di == ((Object)0)) {
					if (ModernizedCProgram.var_check_lock(generatedFd_dict.getDv_lock(), generatedArg, /* Can't add a function to a locked dictionary */0)) {
						;
					} 
				}  else if (ModernizedCProgram.var_check_lock(generatedV_lock, generatedArg, /* Can't change an existing function if it is locked */0)) {
					;
				} 
				ModernizedCProgram.vim_free(/* Give the function a sequential number.  Can only be used with a
					 * Funcref! */name);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(numbuf, "%d", ++func_nr);
				name = ModernizedCProgram.vim_strsave((char_u)numbuf);
				if (name == ((Object)0)) {
					;
				} 
		} 
		dictitem_S dictitem_S = new dictitem_S();
		Object generatedVval = generatedDi_tv.getVval();
		hashitem_S hashitem_S = new hashitem_S();
		if (fp == ((Object)0)) {
			if (generatedFd_dict == ((Object)0) && ModernizedCProgram.vim_strchr(name, (byte)'#') != ((Object)0)) {
				int slen;
				int plen;
				char_u scriptname = new char_u();
				j = /* Check that the autoload name matches the script name. */0;
				if (sourcing_name != ((Object)0)) {
					scriptname = ModernizedCProgram.autoload_name(name);
					if (scriptname != ((Object)0)) {
						p = ModernizedCProgram.vim_strchr(scriptname, (byte)'/');
						plen = (int)/*Error: Function owner not recognized*/strlen((byte)(p));
						slen = (int)/*Error: Function owner not recognized*/strlen((byte)(sourcing_name));
						if (slen > plen && ModernizedCProgram.vim_fnamecmp((char_u)(p), (char_u)(sourcing_name + slen - plen)) == 0) {
							j = 1;
						} 
						ModernizedCProgram.vim_free(scriptname);
					} 
				} 
				if (j == 0) {
					ModernizedCProgram.semsg(((byte)("E746: Function name does not match script file name: %s")), name);
					;
				} 
			} 
			fp = ModernizedCProgram.alloc_clear(((size_t)generatedUf_name) + /*Error: Function owner not recognized*/strlen((byte)(name)) + 1);
			if (fp == ((Object)0)) {
				;
			} 
			if (generatedFd_dict != ((Object)0)) {
				if (generatedFd_di == ((Object)0)) {
					fudi.setFd_di(dictitem_S.dictitem_alloc(generatedFd_newkey));
					if (generatedFd_di == ((Object)0)) {
						ModernizedCProgram.vim_free(fp);
						;
					} 
					if (ModernizedCProgram.dict_add(generatedFd_dict, generatedFd_di) == 0) {
						ModernizedCProgram.vim_free(generatedFd_di);
						ModernizedCProgram.vim_free(fp);
						;
					} 
				} else {
						generatedDi_tv.clear_tv();
				} 
				generatedDi_tv.setV_type(.VAR_FUNC);
				generatedVval.setV_string(ModernizedCProgram.vim_strsave(name));
				flags |=  /* behave like "dict" was used */-1024;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(generatedUf_name), (byte)(/* insert the new function in the function list */name));
			if (overwrite) {
				hi = hashitem_S.hash_find(ModernizedCProgram.func_hashtab, name);
				hi.setHi_key((generatedUf_name));
			}  else if (ModernizedCProgram.func_hashtab.hash_add((generatedUf_name)) == 0) {
				ModernizedCProgram.vim_free(fp);
				;
			} 
			fp.setUf_refcount(1);
		} 
		fp.setUf_args(newargs);
		fp.setUf_def_args(default_args);
		fp.setUf_lines(newlines);
		if ((flags & -1024) != 0) {
			if (fp.register_closure() == 0) {
				;
			} 
		} else {
				fp.setUf_scoped(((Object)0));
		} 
		if (ModernizedCProgram.prof_def_func()) {
			fp.func_do_profile();
		} 
		fp.setUf_varargs(varargs);
		if (sandbox) {
			flags |=  -1024;
		} 
		fp.setUf_flags(flags);
		fp.setUf_calls(0);
		fp.setUf_script_ctx(current_sctx);
		generatedUf_script_ctx.getSc_lnum() += sourcing_lnum_top;
		;
		default_args.ga_clear_strings();
		ModernizedCProgram.vim_free(line_to_free);
		ModernizedCProgram.vim_free(generatedFd_newkey);
		ModernizedCProgram.vim_free(name);
		ModernizedCProgram.did_emsg |=  saved_did_emsg;
		need_wait_return |=  saved_wait_return/*
		 * Return 5 if "p" starts with "<SID>" or "<SNR>" (ignoring case).
		 * Return 2 if "p" starts with "s:".
		 * Return 0 otherwise.
		 */;
	}
	public void ex_delfunction() {
		ufunc_T fp = ((Object)0);
		char_u p = new char_u();
		char_u name = new char_u();
		funcdict_T fudi = new funcdict_T();
		Object[] generatedArg = this.getArg();
		p = generatedArg;
		int generatedSkip = this.getSkip();
		name = ModernizedCProgram.trans_function_name(p, generatedSkip, 0, fudi, ((Object)0));
		Object generatedFd_newkey = fudi.getFd_newkey();
		ModernizedCProgram.vim_free(generatedFd_newkey);
		Object generatedFd_dict = fudi.getFd_dict();
		if (name == ((Object)0)) {
			if (generatedFd_dict != ((Object)0) && !generatedSkip) {
				ModernizedCProgram.emsg(((byte)(ModernizedCProgram.e_funcref)));
			} 
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.ends_excmd(ModernizedCProgram.skipwhite(p))) {
			ModernizedCProgram.vim_free(name);
			ModernizedCProgram.emsg(((byte)(e_trailing)));
			return /*Error: Unsupported expression*/;
		} 
		this.setNextcmd(ModernizedCProgram.check_nextcmd(p));
		Object generatedNextcmd = this.getNextcmd();
		if (generatedNextcmd != ((Object)0)) {
			p = (byte)'\000';
		} 
		if (!generatedSkip) {
			fp = ModernizedCProgram.find_func(name);
		} 
		ModernizedCProgram.vim_free(name);
		int generatedForceit = this.getForceit();
		Object generatedUf_calls = fp.getUf_calls();
		Object generatedFd_di = fudi.getFd_di();
		Object generatedUf_refcount = fp.getUf_refcount();
		Object generatedUf_name = fp.getUf_name();
		Object generatedUf_flags = fp.getUf_flags();
		if (!generatedSkip) {
			if (fp == ((Object)0)) {
				if (!generatedForceit) {
					ModernizedCProgram.semsg(((byte)(ModernizedCProgram.e_nofunc)), generatedArg);
				} 
				return /*Error: Unsupported expression*/;
			} 
			if (generatedUf_calls > 0) {
				ModernizedCProgram.semsg(((byte)("E131: Cannot delete function %s: It is in use")), generatedArg);
				return /*Error: Unsupported expression*/;
			} 
			if (generatedFd_dict != ((Object)0)) {
				ModernizedCProgram.dictitem_remove(generatedFd_dict, generatedFd_di);
			} else {
					if (generatedUf_refcount > (ModernizedCProgram.func_name_refcount(generatedUf_name) ? 0 : 1)) {
						if (/* Function is still referenced somewhere.  Don't free it but
								 * do remove it from the hashtable. */fp.func_remove()) {
							generatedUf_refcount--;
						} 
						generatedUf_flags |=  -1024;
					} else {
							fp.func_clear_free(0/*
							 * Unreference a Function: decrement the reference count and free it when it
							 * becomes zero.
							 */);
					} 
			} 
		} 
	}
	public void ex_return() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		typval_T rettv = new typval_T();
		int returning = 0;
		if (ModernizedCProgram.current_funccal == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E133: :return not inside a function")));
			return /*Error: Unsupported expression*/;
		} 
		int generatedSkip = this.getSkip();
		if (generatedSkip) {
			++emsg_skip;
		} 
		this.setNextcmd(((Object)0));
		Object generatedNextcmd = this.getNextcmd();
		if ((arg != (byte)'\000' && arg != (byte)'|' && arg != (byte)'\n') && rettv.eval0(arg, generatedNextcmd, !generatedSkip) != 0) {
			if (!generatedSkip) {
				returning = eap.do_return(0, 1, rettv);
			} else {
					rettv.clear_tv();
			} 
		}  else if (!generatedSkip) {
			ModernizedCProgram.update_force_abort();
			if (!ModernizedCProgram.aborting()) {
				returning = eap.do_return(0, 1, ((Object)0));
			} 
		} 
		if (/* When skipping or the return gets pending, advance to the next command
		     * in this line (!returning).  Otherwise, ignore the rest of the line.
		     * Following lines will be ignored by get_func_line(). */returning) {
			this.setNextcmd(((Object)0));
		}  else if (generatedNextcmd == ((Object)/* no argument */0)) {
			this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
		} 
		if (generatedSkip) {
			--emsg_skip/*
			 * ":1,25call func(arg1, arg2)"	function call.
			 */;
		} 
	}
	public void ex_call() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		char_u startarg = new char_u();
		char_u name = new char_u();
		char_u tofree = new char_u();
		int len;
		typval_T rettv = new typval_T();
		linenr_T lnum = new linenr_T();
		int doesrange;
		int failed = 0;
		funcdict_T fudi = new funcdict_T();
		partial_T partial = ((Object)0);
		int generatedSkip = this.getSkip();
		Object generatedNextcmd = this.getNextcmd();
		if (generatedSkip) {
			++emsg_skip;
			if (rettv.eval0(generatedArg, generatedNextcmd, 0) != 0) {
				rettv.clear_tv();
			} 
			--emsg_skip;
			return /*Error: Unsupported expression*/;
		} 
		tofree = ModernizedCProgram.trans_function_name(arg, generatedSkip, 1, fudi, partial);
		Object generatedFd_newkey = fudi.getFd_newkey();
		if (generatedFd_newkey != ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(e_dictkey)), generatedFd_newkey);
			ModernizedCProgram.vim_free(generatedFd_newkey);
		} 
		if (tofree == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedFd_dict = fudi.getFd_dict();
		if (generatedFd_dict != ((Object)/* Increase refcount on dictionary, it could get deleted when evaluating
		     * the arguments. */0)) {
			++generatedFd_dict.getDv_refcount();
		} 
		len = (int)/*Error: Function owner not recognized*/strlen((byte)(tofree));
		name = partial != ((Object)0) ? ((Object)0) : partial.deref_func_name(tofree, len, 0);
		startarg = ModernizedCProgram.skipwhite(/* Skip white space to allow ":call func ()".  Not good, but required for
		     * backward compatibility. */arg);
		rettv.setV_type(/* clear_tv() uses this */.VAR_UNKNOWN);
		if (startarg != (byte)'(') {
			ModernizedCProgram.semsg(((byte)(e_missingparen)), generatedArg);
			;
		} 
		Object generatedLine2 = this.getLine2();
		Object generatedLine1 = this.getLine1();
		if (generatedSkip) {
			++emsg_skip;
			lnum = generatedLine2;
		} else {
				lnum = generatedLine1;
		} 
		int generatedAddr_count = this.getAddr_count();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		for (; lnum <= generatedLine2; ++lnum) {
			funcexe_T funcexe = new funcexe_T();
			if (!generatedSkip && generatedAddr_count > 0) {
				if (lnum > generatedMl_line_count) {
					ModernizedCProgram.emsg(((byte)(e_invrange)));
					break;
				} 
				ModernizedCProgram.curwin.getW_cursor().setLnum(lnum);
				ModernizedCProgram.curwin.getW_cursor().setCol(0);
				ModernizedCProgram.curwin.getW_cursor().setColadd(0);
			} 
			arg = startarg;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((funcexe), (false), (/*Error: sizeof expression not supported yet*/));
			funcexe.setFirstline(generatedLine1);
			funcexe.setLastline(generatedLine2);
			funcexe.setDoesrange(doesrange);
			funcexe.setEvaluate(!generatedSkip);
			funcexe.setPartial(partial);
			funcexe.setSelfdict(generatedFd_dict);
			if (rettv.get_func_tv(name, -1, arg, funcexe) == 0) {
				failed = 1;
				break;
			} 
			if (ModernizedCProgram.has_watchexpr()) {
				eap.dbg_check_breakpoint();
			} 
			if (rettv.handle_subscript(arg, !generatedSkip, 1, name, name) == 0) {
				failed = 1;
				break;
			} 
			rettv.clear_tv();
			if (doesrange || generatedSkip) {
				break;
			} 
			if (ModernizedCProgram.aborting()) {
				break;
			} 
		}
		if (generatedSkip) {
			--emsg_skip;
		} 
		if (!failed) {
			if (!ModernizedCProgram.ends_excmd(/* Check for trailing illegal characters and a following command. */arg)) {
				emsg_severe = 1;
				ModernizedCProgram.emsg(((byte)(e_trailing)));
			} else {
					this.setNextcmd(ModernizedCProgram.check_nextcmd(arg));
			} 
		} 
		ModernizedCProgram.vim_free(tofree/*
		 * Return from a function.  Possibly makes the return pending.  Also called
		 * for a pending return at the ":endtry" or after returning from an extra
		 * do_cmdline().  "reanimate" is used in the latter case.  "is_cmd" is set
		 * when called due to a ":return" command.  "rettv" may point to a typval_T
		 * with the return rettv.  Returns TRUE when the return can be carried out,
		 * FALSE when the return gets pending.
		 */);
	}
	public int do_return(int reanimate, int is_cmd, Object rettv) {
		int idx;
		Object generatedCstack = this.getCstack();
		condstack cstack = generatedCstack;
		if (reanimate) {
			ModernizedCProgram.current_funccal.setReturned(/* Undo the return. */0/*
			     * Cleanup (and inactivate) conditionals, but stop when a try conditional
			     * not in its finally clause (which then is to be executed next) is found.
			     * In this case, make the ":return" pending for execution at the ":endtry".
			     * Otherwise, return normally.
			     */);
		} 
		idx = generatedCstack.cleanup_conditionals(0, 1);
		Object generatedCs_pending = cstack.getCs_pending();
		 generatedCs_pend = cstack.getCs_pend();
		Object generatedCsp_rv = generatedCs_pend.getCsp_rv();
		if (idx >= 0) {
			generatedCs_pending[idx] = 24;
			if (!is_cmd && !reanimate/* A pending return again gets pending.  "rettv" points to an
				     * allocated variable with the rettv of the original ":return"'s
				     * argument if present or is NULL else. */) {
				generatedCsp_rv[idx] = rettv;
			} else {
					if (/* When undoing a return in order to make it pending, get the stored
						     * return rettv. */reanimate) {
						rettv = ModernizedCProgram.current_funccal.getRettv();
					} 
					if (rettv != ((Object)0)) {
						if ((generatedCsp_rv[idx] = ModernizedCProgram.alloc_tv()) != ((Object)/* Store the value of the pending return. */0)) {
							(typval_T)generatedCsp_rv[idx] = (typval_T)rettv;
						} else {
								ModernizedCProgram.emsg(((byte)(e_outofmem)));
						} 
					} else {
							generatedCsp_rv[idx] = ((Object)0);
					} 
					if (reanimate/* The pending return value could be overwritten by a ":return"
							 * without argument in a finally clause; reset the default
							 * return value. */) {
						ModernizedCProgram.current_funccal.getRettv().setV_type(.VAR_NUMBER);
						ModernizedCProgram.current_funccal.getRettv().getVval().setV_number(0);
					} 
			} 
			ModernizedCProgram.report_make_pending(24, rettv);
		} else {
				ModernizedCProgram.current_funccal.setReturned(1/* If the return is carried out now, store the return value.  For
					 * a return immediately after reanimation, the value is already
					 * there. */);
				if (!reanimate && rettv != ((Object)0)) {
					ModernizedCProgram.current_funccal.getRettv().clear_tv();
					ModernizedCProgram.current_funccal.getRettv() = (typval_T)rettv;
					if (!is_cmd) {
						ModernizedCProgram.vim_free(rettv);
					} 
				} 
		} 
		return idx < 0/*
		 * Free the variable with a pending return value.
		 */;
	}
	public void ex_debug() {
		int debug_break_level_save = debug_break_level;
		debug_break_level = 9999;
		Object[] generatedArg = this.getArg();
		ModernizedCProgram.do_cmdline_cmd(generatedArg);
		debug_break_level = debug_break_level_save;
	}
	/*
	 * Go to debug mode when a breakpoint was encountered or "ex_nesting_level" is
	 * at or below the break level.  But only when the line is actually
	 * executed.  Return TRUE and set breakpoint_name for skipped commands that
	 * decide to execute something themselves.
	 * Called from do_one_cmd() before executing a command.
	 */
	public void dbg_check_breakpoint() {
		char_u p = new char_u();
		ModernizedCProgram.debug_skipped = 0;
		int generatedSkip = this.getSkip();
		Object[] generatedCmd = this.getCmd();
		if (ModernizedCProgram.debug_breakpoint_name != ((Object)0)) {
			if (!generatedSkip) {
				if (ModernizedCProgram.debug_breakpoint_name[0] == (true) && ModernizedCProgram.debug_breakpoint_name[1] == 253 && ModernizedCProgram.debug_breakpoint_name[2] == (int)key_extra.KE_SNR) {
					p = (char_u)"<SNR>";
				} else {
						p = (char_u)"";
				} 
				ModernizedCProgram.smsg(((byte)("Breakpoint in \"%s%s\" line %ld")), p, ModernizedCProgram.debug_breakpoint_name + (p == (byte)'\000' ? 0 : 3), (long)ModernizedCProgram.debug_breakpoint_lnum);
				ModernizedCProgram.debug_breakpoint_name = ((Object)0);
				ModernizedCProgram.do_debug(generatedCmd);
			} else {
					ModernizedCProgram.debug_skipped = 1;
					ModernizedCProgram.debug_skipped_name = ModernizedCProgram.debug_breakpoint_name;
					ModernizedCProgram.debug_breakpoint_name = ((Object)0);
			} 
		}  else if (ex_nesting_level <= debug_break_level) {
			if (!generatedSkip) {
				ModernizedCProgram.do_debug(generatedCmd);
			} else {
					ModernizedCProgram.debug_skipped = 1;
					ModernizedCProgram.debug_skipped_name = ((Object)0/*
					 * Go to debug mode if skipped by dbg_check_breakpoint() because eap->skip was
					 * set.  Return TRUE when the debug mode is entered this time.
					 */);
			} 
		} 
	}
	public int dbg_check_skipped() {
		int prev_got_int;
		if (ModernizedCProgram.debug_skipped) {
			prev_got_int = got_int;
			got_int = 0;
			ModernizedCProgram.debug_breakpoint_name = ModernizedCProgram.debug_skipped_name;
			this.setSkip(0);
			(Object)eap.dbg_check_breakpoint();
			this.setSkip(1);
			got_int |=  prev_got_int;
			return 1;
		} 
		// Save the value of got_int and reset it.  We don't want a previous
		return 0/*
		 * The list of breakpoints: dbg_breakp.
		 * This is a grow-array of structs.
		 */;
	}
	public void ex_breakadd() {
		debuggy bp = new debuggy();
		char_u pat = new char_u();
		garray_T gap = new garray_T();
		gap = ModernizedCProgram.dbg_breakp;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_profile) {
			gap = ModernizedCProgram.prof_ga;
		} 
		Object[] generatedArg = this.getArg();
		Object generatedGa_data = gap.getGa_data();
		int generatedGa_len = gap.getGa_len();
		int generatedForceit = this.getForceit();
		int generatedDbg_type = bp.getDbg_type();
		Object generatedDbg_name = bp.getDbg_name();
		regprog regprog = new regprog();
		regprog generatedDbg_prog = bp.getDbg_prog();
		Object generatedDbg_lnum = bp.getDbg_lnum();
		if (gap.dbg_parsearg(generatedArg) == 1) {
			bp = (((debuggy)generatedGa_data)[generatedGa_len]);
			bp.setDbg_forceit(generatedForceit);
			if (generatedDbg_type != 3) {
				pat = ModernizedCProgram.file_pat_to_reg_pat(generatedDbg_name, ((Object)0), ((Object)0), 0);
				if (pat != ((Object)0)) {
					bp.setDbg_prog(regprog.vim_regcomp(pat, 1 + 2));
					ModernizedCProgram.vim_free(pat);
				} 
				if (pat == ((Object)0) || generatedDbg_prog == ((Object)0)) {
					ModernizedCProgram.vim_free(generatedDbg_name);
				} else {
						if (generatedDbg_lnum == 0) {
							bp.setDbg_lnum(1);
						} 
						if (generatedCmdidx != CMD_index.CMD_profile) {
							(((debuggy)generatedGa_data)[generatedGa_len]).setDbg_nr(++ModernizedCProgram.last_breakp);
							++debug_tick;
						} 
						++generatedGa_len;
				} 
			} else {
					(((debuggy)generatedGa_data)[generatedGa_len++]).setDbg_nr(++ModernizedCProgram.last_breakp);
					++debug_tick;
			} 
		} 
	}
	/*
	 * ":debuggreedy".
	 */
	public void ex_debuggreedy() {
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		if (generatedAddr_count == 0 || generatedLine2 != 0) {
			ModernizedCProgram.debug_greedy = 1;
		} else {
				ModernizedCProgram.debug_greedy = 0/*
				 * ":breakdel" and ":profdel".
				 */;
		} 
	}
	public void ex_breakdel() {
		debuggy bp = new debuggy();
		debuggy bpi = new debuggy();
		int nr;
		int todel = -1;
		int del_all = 0;
		int i;
		linenr_T best_lnum = 0;
		garray_T gap = new garray_T();
		gap = ModernizedCProgram.dbg_breakp;
		CMD_index generatedCmdidx = this.getCmdidx();
		if (generatedCmdidx == CMD_index.CMD_profdel) {
			gap = ModernizedCProgram.prof_ga;
		} 
		Object[] generatedArg = this.getArg();
		int generatedGa_len = gap.getGa_len();
		Object generatedGa_data = gap.getGa_data();
		int generatedDbg_type = bp.getDbg_type();
		Object generatedDbg_name = bp.getDbg_name();
		Object generatedDbg_lnum = bp.getDbg_lnum();
		if (ModernizedCProgram.vim_isdigit(generatedArg)) {
			nr = /*Error: Function owner not recognized*/atol((byte)generatedArg);
			for (i = 0; i < generatedGa_len; ++i) {
				if ((((debuggy)generatedGa_data)[i]).getDbg_nr() == nr) {
					todel = i;
					break;
				} 
			}
		}  else if (generatedArg == (byte)'*') {
			todel = 0;
			del_all = 1;
		} else {
				if (gap.dbg_parsearg(generatedArg) == 0) {
					return /*Error: Unsupported expression*/;
				} 
				bp = (((debuggy)generatedGa_data)[generatedGa_len]);
				for (i = 0; i < generatedGa_len; ++i) {
					bpi = (((debuggy)generatedGa_data)[i]);
					if (generatedDbg_type == generatedDbg_type && /*Error: Function owner not recognized*/strcmp((byte)(generatedDbg_name), (byte)(generatedDbg_name)) == 0 && (generatedDbg_lnum == generatedDbg_lnum || (generatedDbg_lnum == 0 && (best_lnum == 0 || generatedDbg_lnum < best_lnum)))) {
						todel = i;
						best_lnum = generatedDbg_lnum;
					} 
				}
				ModernizedCProgram.vim_free(generatedDbg_name);
		} 
		if (todel < 0) {
			ModernizedCProgram.semsg(((byte)("E161: Breakpoint not found: %s")), generatedArg);
		} else {
				while (generatedGa_len > 0) {
					ModernizedCProgram.vim_free(generatedDbg_name);
					if (generatedDbg_type == 3 && (((debuggy)generatedGa_data)[todel]).getDbg_val() != ((Object)0)) {
						(((debuggy)generatedGa_data)[todel]).getDbg_val().free_tv();
					} 
					(((debuggy)generatedGa_data)[todel]).getDbg_prog().vim_regfree();
					--generatedGa_len;
					if (todel < generatedGa_len) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove((byte)((((debuggy)generatedGa_data)[todel])), (byte)((((debuggy)generatedGa_data)[todel + 1])), (size_t)((generatedGa_len - todel) * /*Error: Unsupported expression*/));
					} 
					if (generatedCmdidx == CMD_index.CMD_breakdel) {
						++debug_tick;
					} 
					if (!del_all) {
						break;
					} 
				}
				if (generatedGa_len == 0) {
					gap/*
					 * ":breaklist".
					 */.ga_clear();
				} 
		} 
	}
	public void ex_breaklist() {
		debuggy bp = new debuggy();
		int i;
		int generatedDbg_type = bp.getDbg_type();
		Object generatedDbg_name = bp.getDbg_name();
		int generatedDbg_nr = bp.getDbg_nr();
		Object generatedDbg_lnum = bp.getDbg_lnum();
		if (ModernizedCProgram.dbg_breakp.getGa_len() == 0) {
			ModernizedCProgram.msg(((byte)("No breakpoints defined")));
		} else {
				for (i = 0; i < ModernizedCProgram.dbg_breakp.getGa_len(); ++i) {
					bp = (((debuggy)ModernizedCProgram.dbg_breakp.getGa_data())[i]);
					if (generatedDbg_type == 2) {
						((Object)0).home_replace(generatedDbg_name, ModernizedCProgram.NameBuff, 1024, 1);
					} 
					if (generatedDbg_type != 3) {
						ModernizedCProgram.smsg(((byte)("%3d  %s %s  line %ld")), generatedDbg_nr, generatedDbg_type == 1 ? "func" : "file", generatedDbg_type == 1 ? generatedDbg_name : ModernizedCProgram.NameBuff, (long)generatedDbg_lnum);
					} else {
							ModernizedCProgram.smsg(((byte)("%3d  expr %s")), generatedDbg_nr, generatedDbg_name);
					} 
				}
		} 
	}
	public void ex_listdo() {
		int i;
		win_T wp = new win_T();
		tabpage_T tp = new tabpage_T();
		buf_T buf = curbuf;
		int next_fnum = 0;
		char_u save_ei = ((Object)0);
		char_u p_shm_save = new char_u();
		int qf_size = 0;
		int qf_idx;
		CMD_index generatedCmdidx = this.getCmdidx();
		int generatedB_flags = buf.getB_flags();
		file_buffer generatedB_next = buf.getB_next();
		if (generatedCmdidx != CMD_index.CMD_windo && generatedCmdidx != CMD_index.CMD_tabdo) {
			save_ei = ModernizedCProgram.au_event_disable(/* Don't do syntax HL autocommands.  Skipping the syntax file is a
				 * great speed improvement. */",Syntax");
			for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
				generatedB_flags &=  ~-1024;
			}
			buf = curbuf;
		} 
		ModernizedCProgram.start_global_changes();
		int generatedForceit = this.getForceit();
		Object generatedLine1 = this.getLine1();
		window_S generatedW_next = wp.getW_next();
		tabpage_S generatedTp_next = tp.getTp_next();
		int generatedB_fnum = buf.getB_fnum();
		int generatedB_p_bl = buf.getB_p_bl();
		Object generatedLine2 = this.getLine2();
		int generatedAddr_count = this.getAddr_count();
		Object[] generatedArg = this.getArg();
		Object generatedGetline = this.getGetline();
		Object generatedCookie = this.getCookie();
		if (generatedCmdidx == CMD_index.CMD_windo || generatedCmdidx == CMD_index.CMD_tabdo || curbuf.buf_hide() || !curbuf.check_changed(1 | (generatedForceit ? 4 : 0) | 16)) {
			i = 0;
			wp = /* start at the eap->line1 argument/window/buffer */ModernizedCProgram.firstwin;
			tp = ModernizedCProgram.first_tabpage;
			switch (generatedCmdidx) {
			case CMD_index.CMD_tabdo:
					for (; tp != ((Object)0) && i + 1 < generatedLine1; tp = generatedTp_next) {
						i++;
					}
					break;
			case CMD_index.CMD_windo:
					for (; wp != ((Object)0) && i + 1 < generatedLine1; wp = generatedW_next) {
						i++;
					}
					break;
			case CMD_index.CMD_argdo:
					i = generatedLine1 - 1;
					break;
			default:
					break;
			}
			if (generatedCmdidx == /* set pcmark now */CMD_index.CMD_bufdo) {
				for (buf = firstbuf; buf != ((Object)0) && (generatedB_fnum < generatedLine1 || !generatedB_p_bl); buf = generatedB_next) {
					if (generatedB_fnum > generatedLine2) {
						buf = ((Object)0);
						break;
					} 
				}
				if (buf != ((Object)0)) {
					eap.goto_buffer(1, 1, generatedB_fnum);
				} 
			}  else if (generatedCmdidx == CMD_index.CMD_cdo || generatedCmdidx == CMD_index.CMD_ldo || generatedCmdidx == CMD_index.CMD_cfdo || generatedCmdidx == CMD_index.CMD_lfdo) {
				qf_size = eap.qf_get_valid_size();
				if (qf_size <= 0 || generatedLine1 > qf_size) {
					buf = ((Object)0);
				} else {
						eap.ex_cc();
						buf = curbuf;
						i = generatedLine1 - 1;
						if (generatedAddr_count <= 0) {
							this.setLine2(/* default is all the quickfix/location list entries */qf_size);
						} 
				} 
			} else {
					ModernizedCProgram.setpcmark();
			} 
			listcmd_busy = /* avoids setting pcmark below */1;
			while (!got_int && buf != ((Object)0)) {
				if (generatedCmdidx == CMD_index.CMD_argdo) {
					if (i == ((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len())) {
						break;
					} 
					if (ModernizedCProgram.curwin.getW_arg_idx() != i || !ModernizedCProgram.curwin.editing_arg_idx()) {
						p_shm_save = ModernizedCProgram.vim_strsave(/* Clear 'shm' to avoid that the file message overwrites
								     * any output from the command. */ModernizedCProgram.p_shm);
						ModernizedCProgram.set_option_value((char_u)"shm", -1024, (char_u)"", 0);
						eap.do_argfile(i);
						ModernizedCProgram.set_option_value((char_u)"shm", -1024, p_shm_save, 0);
						ModernizedCProgram.vim_free(p_shm_save);
					} 
					if (ModernizedCProgram.curwin.getW_arg_idx() != i) {
						break;
					} 
				}  else if (generatedCmdidx == CMD_index.CMD_windo) {
					if (!/* go to window "wp" */wp.win_valid()) {
						break;
					} 
					wp.win_goto();
					if (ModernizedCProgram.curwin != wp) {
						break;
					} 
					wp = generatedW_next;
				}  else if (generatedCmdidx == CMD_index.CMD_tabdo) {
					if (!/* go to window "tp" */tp.valid_tabpage()) {
						break;
					} 
					tp.goto_tabpage_tp(1, 1);
					tp = generatedTp_next;
				}  else if (generatedCmdidx == CMD_index.CMD_bufdo) {
					next_fnum = -/* Remember the number of the next listed buffer, in case
							 * ":bwipe" is used or autocommands do something strange. */1;
					for (buf = generatedB_next; buf != ((Object)0); buf = generatedB_next) {
						if (generatedB_p_bl) {
							next_fnum = generatedB_fnum;
							break;
						} 
					}
				} 
				++i;
				ModernizedCProgram.do_cmdline(generatedArg, generatedGetline, generatedCookie, -1024 + -1024);
				if (generatedCmdidx == CMD_index.CMD_bufdo) {
					if (next_fnum < 0 || next_fnum > generatedLine2) {
						break;
					} 
					for (buf = firstbuf; buf != ((Object)0); buf = generatedB_next) {
						if (generatedB_fnum == next_fnum) {
							break;
						} 
					}
					if (buf == ((Object)0)) {
						break;
					} 
					p_shm_save = ModernizedCProgram.vim_strsave(/* Go to the next buffer.  Clear 'shm' to avoid that the file
							 * message overwrites any output from the command. */ModernizedCProgram.p_shm);
					ModernizedCProgram.set_option_value((char_u)"shm", -1024, (char_u)"", 0);
					eap.goto_buffer(1, 1, next_fnum);
					ModernizedCProgram.set_option_value((char_u)"shm", -1024, p_shm_save, 0);
					ModernizedCProgram.vim_free(p_shm_save);
					if (generatedB_fnum != /* If autocommands took us elsewhere, quit here. */next_fnum) {
						break;
					} 
				} 
				if (generatedCmdidx == CMD_index.CMD_cdo || generatedCmdidx == CMD_index.CMD_ldo || generatedCmdidx == CMD_index.CMD_cfdo || generatedCmdidx == CMD_index.CMD_lfdo) {
					if (i >= qf_size || i >= generatedLine2) {
						break;
					} 
					qf_idx = eap.qf_get_cur_idx();
					eap.ex_cnext();
					if (eap.qf_get_cur_idx() == /* If jumping to the next quickfix entry fails, quit here */qf_idx) {
						break;
					} 
				} 
				if (generatedCmdidx == CMD_index.CMD_windo) {
					ModernizedCProgram.validate_cursor();
					if (ModernizedCProgram.curwin.getW_onebuf_opt().getWo_scb()) {
						ModernizedCProgram.do_check_scrollbind(1);
					} 
				} 
				if (generatedCmdidx == CMD_index.CMD_windo || generatedCmdidx == CMD_index.CMD_tabdo) {
					if (i + 1 > generatedLine2) {
						break;
					} 
				} 
				if (generatedCmdidx == CMD_index.CMD_argdo && i >= generatedLine2) {
					break;
				} 
			}
			listcmd_busy = 0;
		} 
		int generatedB_nwindows = buf.getB_nwindows();
		Object generatedB_p_syn = curbuf.getB_p_syn();
		Object[] generatedB_fname = curbuf.getB_fname();
		if (save_ei != ((Object)0)) {
			buf_T bnext = new buf_T();
			aco_save_T aco = new aco_save_T();
			ModernizedCProgram.au_event_restore(save_ei);
			for (buf = firstbuf; buf != ((Object)0); buf = bnext) {
				bnext = generatedB_next;
				if (generatedB_nwindows > 0 && (generatedB_flags & -1024)) {
					generatedB_flags &=  ~-1024;
					if (buf == curbuf) {
						curbuf.apply_autocmds(auto_event.EVENT_SYNTAX, generatedB_p_syn, generatedB_fname, 1);
					} else {
							ModernizedCProgram.aucmd_prepbuf(aco, buf);
							buf.apply_autocmds(auto_event.EVENT_SYNTAX, generatedB_p_syn, generatedB_fname, 1);
							aco.aucmd_restbuf();
					} 
					bnext = firstbuf;
				} 
			}
		} 
		ModernizedCProgram.end_global_changes();
	}
	/*
	 * ":compiler[!] {name}"
	 */
	public void ex_compiler() {
		char_u buf = new char_u();
		char_u old_cur_comp = ((Object)0);
		char_u p = new char_u();
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		if (generatedArg == (byte)'\000') {
			ModernizedCProgram.do_cmdline_cmd((char_u)/* List all compiler scripts. */"echo globpath(&rtp, 'compiler/*.vim')"/* ) keep the indenter happy... */);
		} else {
				buf = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(generatedArg)) + 14);
				if (buf != ((Object)0)) {
					if (generatedForceit) {
						ModernizedCProgram.do_cmdline_cmd(/* ":compiler! {name}" sets global options */(char_u)"command -nargs=* CompilerSet set <args>"/* ":compiler! {name}" sets local options.
								 * To remain backwards compatible "current_compiler" is always
								 * used.  A user's compiler plugin may set it, the distributed
								 * plugin will then skip the settings.  Afterwards set
								 * "b:current_compiler" and restore "current_compiler".
								 * Explicitly prepend "g:" to make it work in a function. */);
					} else {
							old_cur_comp = ModernizedCProgram.get_var_value((char_u)"g:current_compiler");
							if (old_cur_comp != ((Object)0)) {
								old_cur_comp = ModernizedCProgram.vim_strsave(old_cur_comp);
							} 
							ModernizedCProgram.do_cmdline_cmd((char_u)"command -nargs=* CompilerSet setlocal <args>");
					} 
					ModernizedCProgram.do_unlet((char_u)"g:current_compiler", 1);
					ModernizedCProgram.do_unlet((char_u)"b:current_compiler", 1);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)buf, "compiler/%s.vim", generatedArg);
					if (ModernizedCProgram.source_runtime(buf, -1024) == 0) {
						ModernizedCProgram.semsg(((byte)("E666: compiler not supported: %s")), generatedArg);
					} 
					ModernizedCProgram.vim_free(buf);
					ModernizedCProgram.do_cmdline_cmd((char_u)":delcommand CompilerSet");
					p = ModernizedCProgram.get_var_value((char_u)/* Set "b:current_compiler" from "current_compiler". */"g:current_compiler");
					if (p != ((Object)0)) {
						ModernizedCProgram.set_internal_string_var((char_u)"b:current_compiler", p);
					} 
					if (!generatedForceit) {
						if (old_cur_comp != ((Object)0)) {
							ModernizedCProgram.set_internal_string_var((char_u)"g:current_compiler", old_cur_comp);
							ModernizedCProgram.vim_free(old_cur_comp);
						} else {
								ModernizedCProgram.do_unlet((char_u)"g:current_compiler", 1);
						} 
					} 
				} 
		} 
	}
	/*
	 * Detect Python 3 or 2, and initialize 'pyxversion'.
	 */
	/*
	 * Does a file contain one of the following strings at the beginning of any
	 * line?
	 * "#!(any string)python2"  => returns 2
	 * "#!(any string)python3"  => returns 3
	 * "# requires python 2.x"  => returns 2
	 * "# requires python 3.x"  => returns 3
	 * otherwise return 0.
	 */
	/* Check shebang. */
	/*
	 * Source a python file using the requested python version.
	 */
	/* user didn't choose a preference, 'pyx' is used */
	/*
	     * now source, if required python version is not supported show
	     * unobtrusive message.
	     */
	/*
	 * ":pyxfile {fname}"
	 */
	/*
	 * ":pyx"
	 */
	/*
	 * ":pyxdo"
	 */
	/*
	 * ":checktime [buffer]"
	 */
	public void ex_checktime() {
		buf_T buf = new buf_T();
		int save_no_check_timestamps = no_check_timestamps;
		no_check_timestamps = 0;
		int generatedAddr_count = this.getAddr_count();
		Object generatedLine2 = this.getLine2();
		file_buffer file_buffer = new file_buffer();
		if (generatedAddr_count == /* default is all buffers */0) {
			ModernizedCProgram.check_timestamps(0);
		} else {
				buf = file_buffer.buflist_findnr((int)generatedLine2);
				if (buf != ((Object)/* cannot happen? */0)) {
					(Object)buf.buf_check_timestamp(0);
				} 
		} 
		no_check_timestamps = save_no_check_timestamps;
	}
	/*
	 * ":language":  Set the language (locale).
	 */
	public void ex_language() {
		byte loc;
		char_u p = new char_u();
		char_u name = new char_u();
		int what = 0;
		byte whatstr = "";
		Object[] generatedArg = this.getArg();
		name = generatedArg;
		p = ModernizedCProgram.skiptowhite(generatedArg);
		if ((p == (byte)'\000' || ((p) == (byte)' ' || (p) == (byte)'\t')) && p - generatedArg >= 3) {
			if (ModernizedCProgram.vim_strnicmp((byte)(generatedArg), (byte)("messages"), (size_t)(p - generatedArg)) == 0) {
				what = 6789;
				name = ModernizedCProgram.skipwhite(p);
				whatstr = "messages ";
			}  else if (ModernizedCProgram.vim_strnicmp((byte)(generatedArg), (byte)("ctype"), (size_t)(p - generatedArg)) == 0) {
				what = 2;
				name = ModernizedCProgram.skipwhite(p);
				whatstr = "ctype ";
			}  else if (ModernizedCProgram.vim_strnicmp((byte)(generatedArg), (byte)("time"), (size_t)(p - generatedArg)) == 0) {
				what = 5;
				name = ModernizedCProgram.skipwhite(p);
				whatstr = "time ";
			} 
		} 
		if (name == (byte)'\000') {
			if (what == 6789) {
				p = ModernizedCProgram.get_mess_env();
			} else {
					p = (char_u)/*Error: Function owner not recognized*/setlocale(what, ((Object)0));
			} 
			if (p == ((Object)0) || p == (byte)'\000') {
				p = (char_u)"Unknown";
			} 
			ModernizedCProgram.smsg(((byte)("Current %slanguage: \"%s\"")), whatstr, p);
		} else {
				if (what == 6789) {
					loc = "";
				} else {
						loc = /*Error: Function owner not recognized*/setlocale(what, (byte)name);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setlocale(4, /* Make sure strtod() uses a decimal point, not a comma. */"C");
				} 
				if (loc == ((Object)0)) {
					ModernizedCProgram.semsg(((byte)("E197: Cannot set language to \"%s\"")), name/* Need to do this for GNU gettext, otherwise cached translations
						     * will be used again. */);
				} else {
						ModernizedCProgram.vim_setenv((char_u)"LC_ALL", (char_u)/* Reset $LC_ALL, otherwise it would overrule everything. */"");
						if (what != 5/* Tell gettext() what to translate to.  It apparently doesn't
								 * use the currently effective locale.  Also do this when
								 * FEAT_GETTEXT isn't defined, so that shell commands use this
								 * value. */) {
							if (what == 0) {
								ModernizedCProgram.vim_setenv((char_u)"LANG", name);
								ModernizedCProgram.vim_setenv((char_u)"LANGUAGE", (char_u)/* Clear $LANGUAGE because GNU gettext uses it. */""/* Apparently MS-Windows printf() may cause a crash when
										     * we give it 8-bit text while it's expecting text in the
										     * current locale.  This call avoids that. */);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/setlocale(2, "C");
							} 
							if (what != 2) {
								char_u mname = new char_u();
								mname = ModernizedCProgram.gettext_lang(name);
								ModernizedCProgram.vim_setenv((char_u)"LC_MESSAGES", mname);
								ModernizedCProgram.set_helplang_default(mname);
							} 
						} 
						ModernizedCProgram.set_lang_var();
						ModernizedCProgram.maketitle();
				} 
		} 
	}
	public void ex_marks() {
		Object[] generatedArg = this.getArg();
		char_u arg = generatedArg;
		int i;
		char_u name = new char_u();
		if (arg != ((Object)0) && arg == (byte)'\000') {
			arg = ((Object)0);
		} 
		ModernizedCProgram.curwin.getW_pcmark().show_one_mark((byte)'\'', arg, ((Object)0), 1);
		Object generatedB_namedm = curbuf.getB_namedm();
		for (i = 0; i < ((byte)'z' - (byte)'a' + 1); ++i) {
			generatedB_namedm[i].show_one_mark(i + (byte)'a', arg, ((Object)0), 1);
		}
		int generatedB_fnum = curbuf.getB_fnum();
		for (i = 0; i < ((byte)'z' - (byte)'a' + 1) + 10; ++i) {
			if (ModernizedCProgram.namedfm[i].getFmark().getFnum() != 0) {
				name = ModernizedCProgram.namedfm[i].getFmark().fm_getname(15);
			} else {
					name = ModernizedCProgram.namedfm[i].getFname();
			} 
			if (name != ((Object)0)) {
				ModernizedCProgram.namedfm[i].getFmark().getMark().show_one_mark(i >= ((byte)'z' - (byte)'a' + 1) ? i - ((byte)'z' - (byte)'a' + 1) + (byte)'0' : i + (byte)'A', arg, name, ModernizedCProgram.namedfm[i].getFmark().getFnum() == generatedB_fnum);
				if (ModernizedCProgram.namedfm[i].getFmark().getFnum() != 0) {
					ModernizedCProgram.vim_free(name);
				} 
			} 
		}
		 generatedB_last_cursor = curbuf.getB_last_cursor();
		generatedB_last_cursor.show_one_mark((byte)'"', arg, ((Object)0), 1);
		 generatedB_op_start = curbuf.getB_op_start();
		generatedB_op_start.show_one_mark((byte)'[', arg, ((Object)0), 1);
		 generatedB_op_end = curbuf.getB_op_end();
		generatedB_op_end.show_one_mark((byte)']', arg, ((Object)0), 1);
		 generatedB_last_insert = curbuf.getB_last_insert();
		generatedB_last_insert.show_one_mark((byte)'^', arg, ((Object)0), 1);
		 generatedB_last_change = curbuf.getB_last_change();
		generatedB_last_change.show_one_mark((byte)'.', arg, ((Object)0), 1);
		 generatedB_visual = curbuf.getB_visual();
		Object generatedVi_start = generatedB_visual.getVi_start();
		generatedVi_start.show_one_mark((byte)'<', arg, ((Object)0), 1);
		Object generatedVi_end = generatedB_visual.getVi_end();
		generatedVi_end.show_one_mark((byte)'>', arg, ((Object)0), 1);
		((Object)0).show_one_mark(-1, arg, ((Object)0), 0);
	}
	public void ex_delmarks() {
		char_u p = new char_u();
		int from;
		int to;
		int i;
		int lower;
		int digit;
		int n;
		Object[] generatedArg = this.getArg();
		int generatedForceit = this.getForceit();
		Object generatedB_namedm = curbuf.getB_namedm();
		 generatedB_last_cursor = curbuf.getB_last_cursor();
		 generatedB_last_insert = curbuf.getB_last_insert();
		 generatedB_last_change = curbuf.getB_last_change();
		 generatedB_op_start = curbuf.getB_op_start();
		 generatedB_op_end = curbuf.getB_op_end();
		 generatedB_visual = curbuf.getB_visual();
		Object generatedVi_start = generatedB_visual.getVi_start();
		Object generatedVi_end = generatedB_visual.getVi_end();
		if (generatedArg == (byte)'\000' && generatedForceit) {
			/* clear all marks */curbuf.clrallmarks();
		}  else if (generatedForceit) {
			ModernizedCProgram.emsg(((byte)(e_invarg)));
		}  else if (generatedArg == (byte)'\000') {
			ModernizedCProgram.emsg(((byte)(e_argreq)));
		} else {
				for (p = generatedArg; p != (byte)'\000'; ++/* clear specified marks only */p) {
					lower = ((int)(p) - (byte)'a' < 26);
					digit = ((int)(p) - (byte)'0' < 10);
					if (lower || digit || ((int)(p) - (byte)'A' < 26)) {
						if (p[1] == (byte)'-') {
							from = /* clear range of marks */p;
							to = p[2];
							if (!(lower ? ((int)(p[2]) - (byte)'a' < 26) : (digit ? ((int)(p[2]) - (byte)'0' < 10) : ((int)(p[2]) - (byte)'A' < 26))) || to < from) {
								ModernizedCProgram.semsg(((byte)(e_invarg2)), p);
								return /*Error: Unsupported expression*/;
							} 
							p += 2;
						} else {
								from = to = /* clear one lower case mark */p;
						} 
						for (i = from; i <= to; ++i) {
							if (lower) {
								generatedB_namedm[i - (byte)'a'].setLnum(0);
							} else {
									if (digit) {
										n = i - (byte)'0' + ((byte)'z' - (byte)'a' + 1);
									} else {
											n = i - (byte)'A';
									} 
									ModernizedCProgram.namedfm[n].getFmark().getMark().setLnum(0);
									do {
										if ((ModernizedCProgram.namedfm[n].getFname()) != ((Object)0)) {
											ModernizedCProgram.vim_free(ModernizedCProgram.namedfm[n].getFname());
											(ModernizedCProgram.namedfm[n].getFname()) = ((Object)0);
										} 
									} while (0);
									ModernizedCProgram.namedfm[n].setTime_set(0);
							} 
						}
					} else {
							switch (p) {
							case (byte)'"':
									generatedB_last_cursor.setLnum(0);
									break;
							case (byte)'[':
									generatedB_op_start.setLnum(0);
									break;
							case (byte)']':
									generatedB_op_end.setLnum(0);
									break;
							case (byte)'^':
									generatedB_last_insert.setLnum(0);
									break;
							case (byte)'.':
									generatedB_last_change.setLnum(0);
									break;
							case (byte)'>':
									generatedVi_end.setLnum(0);
									break;
							case (byte)' ':
									break;
							case (byte)'<':
									generatedVi_start.setLnum(0);
									break;
							default:
									ModernizedCProgram.semsg(((byte)(e_invarg2)), p);
									return /*Error: Unsupported expression*/;
							}
					} 
				}
		} 
	}
	/*
	 * print the jumplist
	 */
	public void ex_jumps() {
		int i;
		char_u name = new char_u();
		ModernizedCProgram.curwin.cleanup_jumplist(1);
		ModernizedCProgram.msg_puts_title(((byte)(/* Highlight title */"\n jump line  col file/text")));
		int generatedB_fnum = curbuf.getB_fnum();
		for (i = 0; i < ModernizedCProgram.curwin.getW_jumplistlen() && !got_int; ++i) {
			if (ModernizedCProgram.curwin.getW_jumplist()[i].getFmark().getMark().getLnum() != 0) {
				name = ModernizedCProgram.curwin.getW_jumplist()[i].getFmark().fm_getname(16);
				if (name == ((Object)0) || ModernizedCProgram.message_filtered(name)) {
					ModernizedCProgram.vim_free(name);
					continue;
				} 
				ModernizedCProgram.msg_putchar((byte)'\n');
				if (got_int) {
					ModernizedCProgram.vim_free(name);
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff, "%c %2d %5ld %4d ", i == ModernizedCProgram.curwin.getW_jumplistidx() ? (byte)'>' : (byte)' ', i > ModernizedCProgram.curwin.getW_jumplistidx() ? i - ModernizedCProgram.curwin.getW_jumplistidx() : ModernizedCProgram.curwin.getW_jumplistidx() - i, ModernizedCProgram.curwin.getW_jumplist()[i].getFmark().getMark().getLnum(), ModernizedCProgram.curwin.getW_jumplist()[i].getFmark().getMark().getCol());
				ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
				ModernizedCProgram.msg_outtrans_attr(name, ModernizedCProgram.curwin.getW_jumplist()[i].getFmark().getFnum() == generatedB_fnum ? ModernizedCProgram.highlight_attr[(int)(.HLF_D)] : 0);
				ModernizedCProgram.vim_free(name);
				ModernizedCProgram.ui_breakcheck();
			} 
			ModernizedCProgram.out_flush();
		}
		if (ModernizedCProgram.curwin.getW_jumplistidx() == ModernizedCProgram.curwin.getW_jumplistlen()) {
			ModernizedCProgram.msg_puts("\n>");
		} 
	}
	public void ex_clearjumps() {
		ModernizedCProgram.curwin.free_jumplist();
		ModernizedCProgram.curwin.setW_jumplistlen(0);
		ModernizedCProgram.curwin.setW_jumplistidx(0/*
		 * print the changelist
		 */);
	}
	public void ex_changes() {
		int i;
		char_u name = new char_u();
		ModernizedCProgram.msg_puts_title(((byte)(/* Highlight title */"\nchange line  col text")));
		Object generatedB_changelistlen = curbuf.getB_changelistlen();
		Object generatedB_changelist = curbuf.getB_changelist();
		for (i = 0; i < generatedB_changelistlen && !got_int; ++i) {
			if (generatedB_changelist[i].getLnum() != 0) {
				ModernizedCProgram.msg_putchar((byte)'\n');
				if (got_int) {
					break;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ModernizedCProgram.IObuff, "%c %3d %5ld %4d ", i == ModernizedCProgram.curwin.getW_changelistidx() ? (byte)'>' : (byte)' ', i > ModernizedCProgram.curwin.getW_changelistidx() ? i - ModernizedCProgram.curwin.getW_changelistidx() : ModernizedCProgram.curwin.getW_changelistidx() - i, (long)generatedB_changelist[i].getLnum(), generatedB_changelist[i].getCol());
				ModernizedCProgram.msg_outtrans(ModernizedCProgram.IObuff);
				name = generatedB_changelist[i].mark_line(17);
				if (name == ((Object)0)) {
					break;
				} 
				ModernizedCProgram.msg_outtrans_attr(name, ModernizedCProgram.highlight_attr[(int)(.HLF_D)]);
				ModernizedCProgram.vim_free(name);
				ModernizedCProgram.ui_breakcheck();
			} 
			ModernizedCProgram.out_flush();
		}
		if (ModernizedCProgram.curwin.getW_changelistidx() == generatedB_changelistlen) {
			ModernizedCProgram.msg_puts("\n>");
		} 
	}
	/* When ignoring events don't show the menu. */
	/* Add the string cmd into input buffer */
	/*
	 * Show or hide the tabline.
	 */
	/*
	 * Return TRUE when tabline is displayed.
	 */
	/*
	 * Update the labels of the tabline.
	 */
	/* For older compilers.  We assume this never changes. */
	// Enable unicode support
	/* Disable redraw for tab updates to eliminate O(N^2) draws. */
	/* Add a label for each tab page.  They all contain the same text area. */
	/* Add the tab */
	/* Remove any old labels. */
	/* Re-enable redraw and redraw. */
	/*
	 * Set the current tab to "nr".  First tab is 1.
	 */
	/*
	 * ":simalt" command.
	 */
	public void ex_simalt() {
		Object[] generatedArg = this.getArg();
		char_u keys = generatedArg;
		int fill_typebuf = 0;
		char_u[] key_name = new char_u();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/PostMessageA(ModernizedCProgram.s_hwnd, 274, (WPARAM)-1024, (LPARAM)0);
		while (keys) {
			if (keys == (byte)'~') {
				keys = /* for showing system menu */(byte)' ';
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/PostMessageA(ModernizedCProgram.s_hwnd, 258, (WPARAM)keys, (LPARAM)0);
			keys++;
			fill_typebuf = 1;
		}
		if (fill_typebuf) {
			key_name[0] = (/* Put a NOP in the typeahead buffer so that the message will get
				 * processed. */true);
			key_name[1] = 253;
			key_name[2] = key_extra.KE_NOP;
			key_name[3] = (byte)'\000';
			typebuf_was_filled = 1;
			(Object)ModernizedCProgram.ins_typebuf(key_name, -1, 0, 1, 0/*
			 * Create the find & replace dialogs.
			 * You can't have both at once: ":find" when replace is showing, destroys
			 * the replace dialog first, and the other way around.
			 */);
		} 
	}
	public Object[] getArg() {
		return arg;
	}
	public void setArg(Object[] newArg) {
		arg = newArg;
	}
	public Object getNextcmd() {
		return nextcmd;
	}
	public void setNextcmd(Object newNextcmd) {
		nextcmd = newNextcmd;
	}
	public Object[] getCmd() {
		return cmd;
	}
	public void setCmd(Object[] newCmd) {
		cmd = newCmd;
	}
	public Object getCmdlinep() {
		return cmdlinep;
	}
	public void setCmdlinep(Object newCmdlinep) {
		cmdlinep = newCmdlinep;
	}
	public CMD_index getCmdidx() {
		return cmdidx;
	}
	public void setCmdidx(CMD_index newCmdidx) {
		cmdidx = newCmdidx;
	}
	public long getArgt() {
		return argt;
	}
	public void setArgt(long newArgt) {
		argt = newArgt;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int newSkip) {
		skip = newSkip;
	}
	public int getForceit() {
		return forceit;
	}
	public void setForceit(int newForceit) {
		forceit = newForceit;
	}
	public int getAddr_count() {
		return addr_count;
	}
	public void setAddr_count(int newAddr_count) {
		addr_count = newAddr_count;
	}
	public Object getLine1() {
		return line1;
	}
	public void setLine1(Object newLine1) {
		line1 = newLine1;
	}
	public Object getLine2() {
		return line2;
	}
	public void setLine2(Object newLine2) {
		line2 = newLine2;
	}
	public  getAddr_type() {
		return addr_type;
	}
	public void setAddr_type( newAddr_type) {
		addr_type = newAddr_type;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getDo_ecmd_cmd() {
		return do_ecmd_cmd;
	}
	public void setDo_ecmd_cmd(Object newDo_ecmd_cmd) {
		do_ecmd_cmd = newDo_ecmd_cmd;
	}
	public Object getDo_ecmd_lnum() {
		return do_ecmd_lnum;
	}
	public void setDo_ecmd_lnum(Object newDo_ecmd_lnum) {
		do_ecmd_lnum = newDo_ecmd_lnum;
	}
	public int getAppend() {
		return append;
	}
	public void setAppend(int newAppend) {
		append = newAppend;
	}
	public int getUsefilter() {
		return usefilter;
	}
	public void setUsefilter(int newUsefilter) {
		usefilter = newUsefilter;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int newAmount) {
		amount = newAmount;
	}
	public int getRegname() {
		return regname;
	}
	public void setRegname(int newRegname) {
		regname = newRegname;
	}
	public int getForce_bin() {
		return force_bin;
	}
	public void setForce_bin(int newForce_bin) {
		force_bin = newForce_bin;
	}
	public int getRead_edit() {
		return read_edit;
	}
	public void setRead_edit(int newRead_edit) {
		read_edit = newRead_edit;
	}
	public int getForce_ff() {
		return force_ff;
	}
	public void setForce_ff(int newForce_ff) {
		force_ff = newForce_ff;
	}
	public int getForce_enc() {
		return force_enc;
	}
	public void setForce_enc(int newForce_enc) {
		force_enc = newForce_enc;
	}
	public int getBad_char() {
		return bad_char;
	}
	public void setBad_char(int newBad_char) {
		bad_char = newBad_char;
	}
	public int getUseridx() {
		return useridx;
	}
	public void setUseridx(int newUseridx) {
		useridx = newUseridx;
	}
	public Byte getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(Byte newErrmsg) {
		errmsg = newErrmsg;
	}
	public Object getGetline() {
		return getline;
	}
	public void setGetline(Object newGetline) {
		getline = newGetline;
	}
	public Object getCookie() {
		return cookie;
	}
	public void setCookie(Object newCookie) {
		cookie = newCookie;
	}
	public long getVerbose_save() {
		return verbose_save;
	}
	public void setVerbose_save(long newVerbose_save) {
		verbose_save = newVerbose_save;
	}
	public int getSave_msg_silent() {
		return save_msg_silent;
	}
	public void setSave_msg_silent(int newSave_msg_silent) {
		save_msg_silent = newSave_msg_silent;
	}
	public int getDid_esilent() {
		return did_esilent;
	}
	public void setDid_esilent(int newDid_esilent) {
		did_esilent = newDid_esilent;
	}
}
/*
 * This array maps ex command names to command codes.
 * The order in which command names are listed below is significant --
 * ambiguous abbreviations are always resolved to be the first possible match
 * (e.g. "r" is taken to mean "read", not "rewind", because "read" comes
 * before "rewind").
 * Not supported commands are included to avoid ambiguities.
 */
