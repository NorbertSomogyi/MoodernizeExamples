package application;

public class condstack {
	private Object cs_flags;
	private Object cs_pending;
	private  cs_pend;
	private Object cs_forinfo;
	private Object cs_line;
	private int cs_idx;
	private int cs_looplevel;
	private int cs_trylevel;
	private eslist_elem cs_emsg_silent_list;
	private byte cs_lflags;
	
	public condstack(Object cs_flags, Object cs_pending,  cs_pend, Object cs_forinfo, Object cs_line, int cs_idx, int cs_looplevel, int cs_trylevel, eslist_elem cs_emsg_silent_list, byte cs_lflags) {
		setCs_flags(cs_flags);
		setCs_pending(cs_pending);
		setCs_pend(cs_pend);
		setCs_forinfo(cs_forinfo);
		setCs_line(cs_line);
		setCs_idx(cs_idx);
		setCs_looplevel(cs_looplevel);
		setCs_trylevel(cs_trylevel);
		setCs_emsg_silent_list(cs_emsg_silent_list);
		setCs_lflags(cs_lflags);
	}
	public condstack() {
	}
	
	/*
	 * Avoid optimisation bug in VC++ version 6.0
	 */
	public Object do_one_cmd(Object cmdlinep, int sourcing, Object fgetline, Object cookie) {
		/* argument for fgetline() */char_u p = new char_u();
		linenr_T lnum = new linenr_T();
		long n;
		byte errormsg = ((Object)/* error message */0);
		char_u after_modifier = ((Object)0);
		/* Ex command arguments */exarg_T ea = new exarg_T();
		int save_msg_scroll = msg_scroll;
		cmdmod_T save_cmdmod = new cmdmod_T();
		int save_reg_executing = reg_executing;
		/* set when Not Implemented */int ni;
		char_u cmd = new char_u();
		.memset((ea), (false), ());
		ea.setLine1(1);
		ea.setLine2(1);
		++ex_nesting_level;
		if (/* When the last file has not been edited :q has to be typed twice. */ModernizedCProgram.quitmore && !ModernizedCProgram.getline_equal(fgetline, cookie, /* avoid that a function call in 'statusline' does this */get_func_line) && !ModernizedCProgram.getline_equal(fgetline, cookie, /* avoid that an autocommand, e.g. QuitPre, does this */getnextac)) {
			--ModernizedCProgram.quitmore/*
			     * Reset browse, confirm, etc..  They are restored when returning, for
			     * recursive calls.
			     */;
		} 
		save_cmdmod = ModernizedCProgram.cmdmod;
		if ((cmdlinep)[0] == (byte)'#' && (cmdlinep)[1] == /* "#!anything" is handled like a comment. */(byte)'!') {
			;
		} 
		if (ModernizedCProgram.p_verbose >= 16) {
			ModernizedCProgram.msg_verbose_cmd(0, cmdlinep/*
			 * 1. Skip comment lines and leading white space and colons.
			 * 2. Handle command modifiers.
			 */);
		} 
		// The "ea" structure holds the arguments that can be used.// The "ea" structure holds the arguments that can be used.ea.setCmd(cmdlinep);
		ea.setCmdlinep(cmdlinep);
		ea.setGetline(fgetline);
		ea.setCookie(cookie);
		ea.setCstack(cstack);
		if (ea.parse_command_modifiers(errormsg, 0) == 0) {
			;
		} 
		Object generatedCmd = ea.getCmd();
		after_modifier = generatedCmd;
		int generatedCs_idx = this.getCs_idx();
		Object generatedCs_flags = this.getCs_flags();
		ea.setSkip(ModernizedCProgram.did_emsg || got_int || did_throw || (generatedCs_idx >= 0 && !(generatedCs_flags[generatedCs_idx] & -1024)));
		cmd = generatedCmd;
		ea.setCmd(ModernizedCProgram.skip_range(generatedCmd, ((Object)0)));
		if (generatedCmd == (byte)'*' && ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'*') == ((Object)0)) {
			ea.setCmd(ModernizedCProgram.skipwhite(generatedCmd + 1));
		} 
		p = ea.find_command(((Object)0));
		int generatedSkip = ea.getSkip();
		CMD_index generatedCmdidx = ea.getCmdidx();
		// Count this line for profiling if skip is TRUE.if (do_profiling == 1 && (!generatedSkip || generatedCs_idx == 0 || (generatedCs_idx > 0 && (generatedCs_flags[generatedCs_idx - 1] & -1024)))) {
			int skip = ModernizedCProgram.did_emsg || got_int || did_throw;
			if (generatedCmdidx == CMD_index.CMD_catch) {
				skip = !skip && !(generatedCs_idx >= 0 && (generatedCs_flags[generatedCs_idx] & -1024) && !(generatedCs_flags[generatedCs_idx] & -1024));
			}  else if (generatedCmdidx == CMD_index.CMD_else || generatedCmdidx == CMD_index.CMD_elseif) {
				skip = skip || !(generatedCs_idx >= 0 && !(generatedCs_flags[generatedCs_idx] & (-1024 | -1024)));
			}  else if (generatedCmdidx == CMD_index.CMD_finally) {
				skip = 0;
			}  else if (generatedCmdidx != CMD_index.CMD_endif && generatedCmdidx != CMD_index.CMD_endfor && generatedCmdidx != CMD_index.CMD_endtry && generatedCmdidx != CMD_index.CMD_endwhile) {
				skip = generatedSkip;
			} 
			if (!skip) {
				if (ModernizedCProgram.getline_equal(fgetline, cookie, get_func_line)) {
					ModernizedCProgram.func_line_exec(ModernizedCProgram.getline_cookie(fgetline, cookie));
				}  else if (ModernizedCProgram.getline_equal(fgetline, cookie, getsourceline)) {
					ModernizedCProgram.script_line_exec();
				} 
			} 
		} 
		/* May go to debug mode.  If this happens and the ">quit" debug command is
		     * used, throw an interrupt exception and skip the next command. */ea.dbg_check_breakpoint();
		if (!generatedSkip && got_int) {
			ea.setSkip(1);
			(Object)cstack/*
			 * 4. parse a range specifier of the form: addr [,addr] [;addr] ..
			 *
			 * where 'addr' is:
			 *
			 * %	      (entire file)
			 * $  [+-NUM]
			 * 'x [+-NUM] (where x denotes a currently defined mark)
			 * .  [+-NUM]
			 * [+-NUM]..
			 * NUM
			 *
			 * The ea.cmd pointer is updated to point to the first character following the
			 * range spec. If an initial address is found, but no second, the upper bound
			 * is equal to the lower.
			 */.do_intthrow();
		} 
		// ea.addr_type for user commands is set by find_ucmdif (!((int)(generatedCmdidx) < 0)) {
			if (generatedCmdidx != CMD_index.CMD_SIZE) {
				ea.setAddr_type(cmdnames[(int)generatedCmdidx].getCmd_addr_type());
			} else {
					ea.setAddr_type(.ADDR_LINES);
			} 
			if (generatedCmdidx == CMD_index.CMD_wincmd && p != ((Object)0)) {
				ea.get_wincmd_addr_type(ModernizedCProgram.skipwhite(p));
			} 
			if ((generatedCmdidx == CMD_index.CMD_cc || generatedCmdidx == CMD_index.CMD_ll) && curbuf.bt_quickfix()) {
				ea.setAddr_type(.ADDR_OTHER);
			} 
		} 
		ea.setCmd(cmd);
		if (ea.parse_cmd_address(errormsg, 0) == 0) {
			;
		} 
		ea.setCmd(ModernizedCProgram.skipwhite(generatedCmd));
		while (generatedCmd == (byte)':') {
			ea.setCmd(ModernizedCProgram.skipwhite(generatedCmd + 1/*
			     * If we got a line, but no command, then go to the line.
			     * If we find a '|' or '\n' we set ea.nextcmd.
			     */));
		}
		Object generatedLine1 = ea.getLine1();
		Object generatedLine2 = ea.getLine2();
		int generatedAddr_count = ea.getAddr_count();
		memline generatedB_ml = curbuf.getB_ml();
		Object generatedMl_line_count = generatedB_ml.getMl_line_count();
		if (generatedCmd == (byte)'\000' || generatedCmd == (byte)'"' || (ea.setNextcmd(ModernizedCProgram.check_nextcmd(generatedCmd))) != ((Object)0/*
			 * strange vi behaviour:
			 * ":3"		jumps to line 3
			 * ":3|..."	prints line 3
			 * ":|"		prints current line
			 */)) {
			if (generatedSkip) {
				;
			} 
			if (generatedCmd == (byte)'|' || (exmode_active && generatedLine1 != generatedLine2)) {
				ea.setCmdidx(CMD_index.CMD_print);
				ea.setArgt(-1024 + -1024 + -1024);
				if ((errormsg = ea.invalid_range()) == ((Object)0)) {
					ea.correct_range();
					ea.ex_print();
				} 
			}  else if (generatedAddr_count != 0) {
				if (generatedLine2 > generatedMl_line_count) {
					if (ModernizedCProgram.vim_strchr(ModernizedCProgram.p_cpo, (byte)'-') != ((Object)/* With '-' in 'cpoptions' a line number past the file is an
							 * error, otherwise put it at the end of the file. */0)) {
						ea.setLine2(-1);
					} else {
							ea.setLine2(generatedMl_line_count);
					} 
				} 
				if (generatedLine2 < 0) {
					errormsg = ((byte)(e_invrange));
				} else {
						if (generatedLine2 == 0) {
							ModernizedCProgram.curwin.getW_cursor().setLnum(1);
						} else {
								ModernizedCProgram.curwin.getW_cursor().setLnum(generatedLine2);
						} 
						ModernizedCProgram.beginline(2 | 4);
				} 
			} 
			;
		} 
		if (p != ((Object)0) && generatedCmdidx == CMD_index.CMD_SIZE && !generatedSkip && ((int)(generatedCmd) - (byte)'A' < 26) && ModernizedCProgram.has_cmdundefined()) {
			int ret;
			p = generatedCmd;
			while (((((int)(p) - (byte)'A' < 26) || ((int)(p) - (byte)'a' < 26)) || ((int)(p) - (byte)'0' < 10))) {
				++p;
			}
			p = ModernizedCProgram.vim_strnsave(generatedCmd, (int)(p - generatedCmd));
			ret = ((Object)0).apply_autocmds(auto_event.EVENT_CMDUNDEFINED, p, p, 1);
			ModernizedCProgram.vim_free(p/* If the autocommands did something and didn't cause an error, try
				 * finding the command again. */);
			p = (ret && !ModernizedCProgram.aborting()) ? ea.find_command(((Object)0)) : generatedCmd;
		} 
		if (p == ((Object)0)) {
			if (!generatedSkip) {
				errormsg = ((byte)("E464: Ambiguous use of user-defined command"));
			} 
			;
		} 
		// Check for wrong commands.if (p == (byte)'!' && generatedCmd[1] == 151 && generatedCmd[0] == 78 && !((int)(generatedCmdidx) < 0)) {
			errormsg = ModernizedCProgram.uc_fun_cmd();
			;
		} 
		if (generatedCmdidx == CMD_index.CMD_SIZE) {
			if (!generatedSkip) {
				.strcpy((byte)(ModernizedCProgram.IObuff), (byte)(((byte)("E492: Not an editor command"))));
				if (!sourcing) {
					if (after_modifier != ((Object)/* If the modifier was parsed OK the error must be in the
							 * following command */0)) {
						ModernizedCProgram.append_command(after_modifier);
					} else {
							ModernizedCProgram.append_command(cmdlinep);
					} 
				} 
				errormsg = (byte)ModernizedCProgram.IObuff;
				ModernizedCProgram.did_emsg_syntax = 1;
			} 
			;
		} 
		ni = (!((int)(generatedCmdidx) < 0) && (cmdnames[generatedCmdidx].getCmd_func() == ex_ni || cmdnames[generatedCmdidx].getCmd_func() == ModernizedCProgram.ex_script_ni/*
		     * When the expression evaluation is disabled, recognize the ":if" and
		     * ":endif" commands and ignore everything in between it.
		     *//*
		     * When the expression evaluation is disabled, recognize the ":if" and
		     * ":endif" commands and ignore everything in between it.
		     */));
		if (p == (byte)'!' && generatedCmdidx != /* forced commands */CMD_index.CMD_substitute && generatedCmdidx != CMD_index.CMD_smagic && generatedCmdidx != CMD_index.CMD_snomagic) {
			++p;
			ea.setForceit(1);
		} else {
				ea.setForceit(0/*
				 * 6. Parse arguments.  Then check for errors.
				 */);
		} 
		if (!((int)(generatedCmdidx) < 0)) {
			ea.setArgt((long)cmdnames[(int)generatedCmdidx].getCmd_argt());
		} 
		long generatedArgt = ea.getArgt();
		int generatedB_p_ma = curbuf.getB_p_ma();
		if (!generatedSkip) {
			if (sandbox != 0 && !(generatedArgt & -1024)) {
				errormsg = ((byte)(e_sandbox));
				;
			} 
			if (restricted != 0 && (generatedArgt & -1024)) {
				errormsg = ((byte)("E981: Command not allowed in rvim"));
				;
			} 
			if (!generatedB_p_ma && (generatedArgt & -1024)) {
				errormsg = ((byte)(/* Command not allowed in non-'modifiable' buffer */e_modifiable));
				;
			} 
			if (ModernizedCProgram.text_locked() && !(generatedArgt & -1024) && !((int)(generatedCmdidx) < 0)) {
				errormsg = ((byte)(ModernizedCProgram.get_text_locked_msg()));
				;
			} 
			if (!(generatedArgt & -1024) && generatedCmdidx != CMD_index.CMD_checktime && generatedCmdidx != CMD_index.CMD_edit && generatedCmdidx != CMD_index.CMD_file && !((int)(generatedCmdidx) < 0) && ModernizedCProgram.curbuf_locked()) {
				;
			} 
			if (!ni && !(generatedArgt & -1024) && generatedAddr_count > 0) {
				errormsg = ((byte)(/* no range allowed */e_norange));
				;
			} 
		} 
		int generatedForceit = ea.getForceit();
		// no <!> allowedif (!ni && !(generatedArgt & -1024) && generatedForceit) {
			errormsg = ((byte)(e_nobang));
			;
		} 
		if (!generatedSkip && !ni && (generatedArgt & -1024/*
			 * If the range is backwards, ask for confirmation and, if given, swap
			 * ea.line1 & ea.line2 so it's forwards again.
			 * When global command is busy, don't ask, will fail below.
			 */)) {
			if (!global_busy && generatedLine1 > generatedLine2) {
				if (msg_silent == 0) {
					if (sourcing || exmode_active) {
						errormsg = ((byte)("E493: Backwards range given"));
						;
					} 
					if (ModernizedCProgram.ask_yesno((char_u)((byte)("Backwards range given, OK to swap")), 0) != (byte)'y') {
						;
					} 
				} 
				lnum = generatedLine1;
				ea.setLine1(generatedLine2);
				ea.setLine2(lnum);
			} 
			if ((errormsg = ea.invalid_range()) != ((Object)0)) {
				;
			} 
		} 
		 generatedAddr_type = ea.getAddr_type();
		if ((generatedAddr_type == .ADDR_OTHER) && generatedAddr_count == 0) {
			ea.setLine2(1);
		} 
		// default is 1, not cursor
		ea.correct_range();
		if (((generatedArgt & -1024) || generatedAddr_count >= 2) && !global_busy && generatedAddr_type == .ADDR_LINES) {
			(Object)ModernizedCProgram.hasFolding(generatedLine1, generatedLine1, ((Object)/* Put the first line at the start of a closed fold, put the last line
				 * at the end of a closed fold. */0));
			(Object)ModernizedCProgram.hasFolding(generatedLine2, ((Object)0), generatedLine2);
		} 
		p = ea.replace_makeprg(p, /*
		     * For the ":make" and ":grep" commands we insert the 'makeprg'/'grepprg'
		     * option here, so things like % get expanded.
		     */cmdlinep);
		if (p == ((Object)0)) {
			;
		} 
		if (generatedCmdidx == CMD_index.CMD_bang) {
			ea.setArg(p);
		} else {
				ea.setArg(ModernizedCProgram.skipwhite(p));
		} 
		Object generatedArg = ea.getArg();
		// ":file" cannot be run with an argument when "curbuf_lock" is setif (generatedCmdidx == CMD_index.CMD_file && generatedArg != (byte)'\000' && ModernizedCProgram.curbuf_locked()) {
			;
		} 
		if (generatedArgt & -1024) {
			while (generatedArg[0] == (byte)'+' && generatedArg[1] == (byte)'+') {
				if (ea.getargopt() == 0 && !ni) {
					errormsg = ((byte)(e_invarg));
					;
				} 
			}
		} 
		if (generatedCmdidx == CMD_index.CMD_write || generatedCmdidx == CMD_index.CMD_update) {
			if (generatedArg == /* append */(byte)'>') {
				if (++generatedArg != /* typed wrong */(byte)'>') {
					errormsg = ((byte)("E494: Use w or w>>"));
					;
				} 
				ea.setArg(ModernizedCProgram.skipwhite(generatedArg + 1));
				ea.setAppend(1);
			}  else if (generatedArg == (byte)'!' && generatedCmdidx == /* :w !filter */CMD_index.CMD_write) {
				++generatedArg;
				ea.setUsefilter(1);
			} 
		} 
		if (generatedCmdidx == CMD_index.CMD_read) {
			if (generatedForceit) {
				ea.setUsefilter(/* :r! filter if ea.forceit */1);
				ea.setForceit(0);
			}  else if (generatedArg == /* :r !filter */(byte)'!') {
				++generatedArg;
				ea.setUsefilter(1);
			} 
		} 
		int generatedAmount = ea.getAmount();
		if (generatedCmdidx == CMD_index.CMD_lshift || generatedCmdidx == CMD_index.CMD_rshift) {
			ea.setAmount(1);
			while (generatedArg == generatedCmd) {
				++generatedArg;
				++generatedAmount;
			}
			ea.setArg(ModernizedCProgram.skipwhite(generatedArg));
		} 
		int generatedUsefilter = ea.getUsefilter();
		if ((generatedArgt & -1024) && !generatedUsefilter) {
			ea.setDo_ecmd_cmd(ModernizedCProgram.getargcmd(generatedArg));
		} 
		if ((generatedArgt & -1024) && !generatedUsefilter) {
			ea/*
			     * Check for <newline> to end a shell command.
			     * Also do this for ":read !cmd", ":write !cmd" and ":global".
			     * Any others?
			     */.separate_nextcmd();
		}  else if (generatedCmdidx == CMD_index.CMD_bang || generatedCmdidx == CMD_index.CMD_terminal || generatedCmdidx == CMD_index.CMD_global || generatedCmdidx == CMD_index.CMD_vglobal || generatedUsefilter) {
			for (p = generatedArg; p; ++p/* Remove one backslash before a newline, so that it's possible to
				     * pass a newline to the shell and also a newline that is preceded
				     * with a backslash.  This makes it impossible to end a shell
				     * command in a backslash, but that doesn't appear useful.
				     * Halving the number of backslashes is incompatible with previous
				     * versions. */) {
				if (p == (byte)'\\' && p[1] == (byte)'\n') {
					.memmove((byte)((p)), (byte)((p + 1)), (size_t)(.strlen((byte)(p + 1)) + 1));
				}  else if (p == (byte)'\n') {
					ea.setNextcmd(p + 1);
					p = (byte)'\000';
					break;
				} 
			}
		} 
		file_buffer generatedB_next = buf.getB_next();
		memfile generatedMl_mfp = generatedB_ml.getMl_mfp();
		int generatedB_fnum = buf.getB_fnum();
		file_buffer generatedB_prev = buf.getB_prev();
		if ((generatedArgt & -1024) && generatedAddr_count == 0) {
			buf_T buf = new buf_T();
			ea.setLine1(1);
			switch (generatedAddr_type) {
			case .ADDR_ARGUMENTS:
					if (((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()) == 0) {
						ea.setLine1(ea.setLine2(0));
					} else {
							ea.setLine2(((ModernizedCProgram.curwin).getW_alist().getAl_ga().getGa_len()));
					} 
					break;
			case .ADDR_TABS_RELATIVE:
					ea.setLine2(1);
					break;
			case .ADDR_LOADED_BUFFERS:
					buf = firstbuf;
					while (generatedB_next != ((Object)0) && generatedMl_mfp == ((Object)0)) {
						buf = generatedB_next;
					}
					ea.setLine1(generatedB_fnum);
					buf = lastbuf;
					while (generatedB_prev != ((Object)0) && generatedMl_mfp == ((Object)0)) {
						buf = generatedB_prev;
					}
					ea.setLine2(generatedB_fnum);
					break;
			case .ADDR_QUICKFIX:
					ModernizedCProgram.iemsg(((byte)("INTERNAL: Cannot use EX_DFLALL with ADDR_NONE, ADDR_UNSIGNED or ADDR_QUICKFIX")));
					break;
			case .ADDR_UNSIGNED:
			case .ADDR_BUFFERS:
					ea.setLine1(generatedB_fnum);
					ea.setLine2(generatedB_fnum);
					break;
			case .ADDR_WINDOWS:
					ea.setLine2(((Object)0).current_win_nr());
					break;
			case .ADDR_TABS:
					ea.setLine2(((Object)0).current_tab_nr());
					break;
			case .ADDR_QUICKFIX_VALID:
					ea.setLine2(ea.qf_get_valid_size());
					if (generatedLine2 == 0) {
						ea.setLine2(1);
					} 
					break;
			case .ADDR_OTHER:
					ea.setLine2(generatedMl_line_count);
					break;
			case .ADDR_LINES:
			case .ADDR_NONE:
			}
		} 
		if ((generatedArgt & /* accept numbered register only when no count allowed (:put) */-1024) && generatedArg != (byte)'\000' && (!((int)(generatedCmdidx) < 0) || generatedArg != /* Do not allow register = for user commands */(byte)'=') && !((generatedArgt & -1024) && ((int)(generatedArg) - (byte)'0' < 10/* check these explicitly for a more specific error message *//* check these explicitly for a more specific error message */))) {
			if (ModernizedCProgram.valid_yank_reg(generatedArg, (generatedCmdidx != CMD_index.CMD_put && !((int)(generatedCmdidx) < 0)))) {
				ea.setRegname(generatedArg++);
				if (generatedArg[-1] == (byte)'=' && generatedArg[0] != /* for '=' register: accept the rest of the line as an expression */(byte)'\000') {
					ModernizedCProgram.set_expr_line(ModernizedCProgram.vim_strsave(generatedArg));
					generatedArg += .strlen((byte)(generatedArg));
				} 
				ea.setArg(ModernizedCProgram.skipwhite(generatedArg));
			} 
		} 
		if ((generatedArgt & -1024) && ((int)(generatedArg) - (byte)'0' < /*
		     * Check for a count.  When accepting a EX_BUFNAME, don't use "123foo" as a
		     * count, it's a buffer name.
		     */10) && (!(generatedArgt & -1024) || (p = ModernizedCProgram.skipdigits(generatedArg)) == (byte)'\000' || ((p) == (byte)' ' || (p) == (byte)'\t'))) {
			n = ModernizedCProgram.getdigits(generatedArg);
			ea.setArg(ModernizedCProgram.skipwhite(generatedArg));
			if (n <= 0 && !ni && (generatedArgt & -1024) == 0) {
				errormsg = ((byte)(e_zerocount));
				;
			} 
			if (generatedAddr_type != .ADDR_LINES) {
				ea.setLine2(n);
				if (generatedAddr_count == 0) {
					ea.setAddr_count(1);
				} 
			} else {
					ea.setLine1(generatedLine2);
					generatedLine2 += n - 1;
					++generatedAddr_count;
					if (generatedLine2 > generatedMl_line_count) {
						ea.setLine2(generatedMl_line_count);
					} 
			} 
		} 
		if (generatedArgt & /*
		     * Check for flags: 'l', 'p' and '#'.
		     */-1024) {
			ea.get_flags();
		} 
		if (!ni && !(generatedArgt & -1024) && generatedArg != (byte)'\000' && generatedArg != (byte)'"' && (generatedArg != (byte)'|' || (generatedArgt & -1024) == 0)) {
			errormsg = ((byte)(e_trailing));
			;
		} 
		if (!ni && (generatedArgt & -1024) && generatedArg == (byte)'\000') {
			errormsg = ((byte)(e_argreq));
			;
		} 
		if (generatedSkip) {
			switch (generatedCmdidx) {
			case CMD_index.CMD_endif:
			case CMD_index.CMD_hide:
			case CMD_index.CMD_tcl:
			case CMD_index.CMD_keepmarks:
			case CMD_index.CMD_perl:
			case CMD_index.CMD_throw:
			case CMD_index.CMD_noswapfile:
			case CMD_index.CMD_for:
			case CMD_index.CMD_dsearch:
			case CMD_index.CMD_ilist:
			case CMD_index.CMD_wincmd:
					break;
			case CMD_index.CMD_keepalt:
			case CMD_index.CMD_keepjumps:
			case CMD_index.CMD_belowright:
			case CMD_index.CMD_return:
			case CMD_index.CMD_aboveleft:
			case CMD_index.CMD_echo:
			case CMD_index.CMD_let:
			case CMD_index.CMD_help:
			case CMD_index.CMD_snomagic:
			case CMD_index.CMD_echomsg:
			case CMD_index.CMD_execute:
			case CMD_index.CMD_python:
			case CMD_index.CMD_echoerr:
			case CMD_index.CMD_endtry:
			case CMD_index.CMD_lua:
			case CMD_index.CMD_vertical:
			case CMD_index.CMD_confirm:
			case CMD_index.CMD_dlist:
			case CMD_index.CMD_leftabove:
			case CMD_index.CMD_keeppatterns:
			case CMD_index.CMD_topleft:
			case CMD_index.CMD_py3:
			case CMD_index.CMD_python3:
			case CMD_index.CMD_noautocmd:
			case CMD_index.CMD_browse:
			case CMD_index.CMD_filter:
			case CMD_index.CMD_verbose:
			case CMD_index.CMD_psearch:
			case CMD_index.CMD_ruby:
			case CMD_index.CMD_rightbelow:
			case CMD_index.CMD_tab:
			case CMD_index.CMD_dsplit:
			case /* commands that need evaluation */CMD_index.CMD_while:
			case CMD_index.CMD_catch:
			case CMD_index.CMD_unlet:
			case CMD_index.CMD_silent:
			case CMD_index.CMD_else:
			case CMD_index.CMD_djump:
			case CMD_index.CMD_isearch:
			case CMD_index.CMD_lockmarks:
			case CMD_index.CMD_isplit:
			case CMD_index.CMD_smagic:
			case CMD_index.CMD_function:
					break;
			case CMD_index.CMD_echon:
			case CMD_index.CMD_syntax:
			case CMD_index.CMD_finally:
			case CMD_index.CMD_delfunction:
			case CMD_index.CMD_endfor:
			case CMD_index.CMD_and:
			case CMD_index.CMD_match:
			case CMD_index.CMD_endwhile:
			case CMD_index.CMD_mzscheme:
			case CMD_index.CMD_ijump:
			case CMD_index.CMD_elseif:
			case CMD_index.CMD_if:
			case CMD_index.CMD_call:
			case CMD_index.CMD_try:
			case CMD_index.CMD_substitute:
			case CMD_index.CMD_botright:
			case CMD_index.CMD_tilde:
			default:
					;
			}
		} 
		if (generatedArgt & -1024) {
			if (ea.expand_filename(cmdlinep, errormsg) == 0) {
				;
			} 
		} 
		if ((generatedArgt & -1024) && generatedArg != (byte)'\000' && generatedAddr_count == 0 && !((int)(generatedCmdidx) < 0/*
			 * :bdelete, :bwipeout and :bunload take several arguments, separated
			 * by spaces: find next space (skipping over escaped characters).
			 * The others take one argument: ignore trailing spaces.
			 */)) {
			if (generatedCmdidx == CMD_index.CMD_bdelete || generatedCmdidx == CMD_index.CMD_bwipeout || generatedCmdidx == CMD_index.CMD_bunload) {
				p = ModernizedCProgram.skiptowhite_esc(generatedArg);
			} else {
					p = generatedArg + .strlen((byte)(generatedArg));
					while (p > generatedArg && ((p[-1]) == (byte)' ' || (p[-1]) == (byte)'\t')) {
						--p;
					}
			} 
			ea.setLine2(ModernizedCProgram.buflist_findpat(generatedArg, p, (generatedArgt & -1024) != 0, 0, 0));
			if (generatedLine2 < /* failed */0) {
				;
			} 
			ea.setAddr_count(1);
			ea.setArg(ModernizedCProgram.skipwhite(p));
		} 
		int generatedDid_esilent = ea.getDid_esilent();
		if (generatedCmdidx == CMD_index.CMD_try && generatedDid_esilent > /* The :try command saves the emsg_silent flag, reset it here when
		     * ":silent! try" was used, it should only apply to :try itself. */0) {
			emsg_silent -= generatedDid_esilent;
			if (emsg_silent < 0) {
				emsg_silent = 0;
			} 
			ea.setDid_esilent(0/*
			 * 7. Execute the command.
			 */);
		} 
		Byte generatedErrmsg = ea.getErrmsg();
		if (((int)(generatedCmdidx) < 0/*
			 * Execute a user-defined command.
			 */)) {
			ea.do_ucmd();
		} else {
				ea.setErrmsg(((Object)/*
					 * Call the function to execute the builtin command.
					 */0));
				.UNRECOGNIZEDFUNCTIONNAME(ea);
				if (generatedErrmsg != ((Object)0)) {
					errormsg = ((byte)(generatedErrmsg));
				} 
		} 
		if (need_rethrow) {
			cstack.do_throw();
		}  else if (check_cstack) {
			if (ModernizedCProgram.source_finished(fgetline, cookie)) {
				ea.do_finish(1);
			}  else if (ModernizedCProgram.getline_equal(fgetline, cookie, get_func_line) && ModernizedCProgram.current_func_returned()) {
				ea.do_return(1, 0, ((Object)0));
			} 
		} 
		need_rethrow = check_cstack = 0;
		if (errormsg != ((Object)0) && errormsg != (byte)'\000' && !ModernizedCProgram.did_emsg) {
			if (sourcing) {
				if (errormsg != (byte)ModernizedCProgram.IObuff) {
					.strcpy((byte)(ModernizedCProgram.IObuff), (byte)(errormsg));
					errormsg = (byte)ModernizedCProgram.IObuff;
				} 
				ModernizedCProgram.append_command(cmdlinep);
			} 
			ModernizedCProgram.emsg(errormsg);
		} 
		cstack.do_errthrow((generatedCmdidx != CMD_index.CMD_SIZE && !((int)(generatedCmdidx) < 0)) ? cmdnames[(int)generatedCmdidx].getCmd_name() : (char_u)((Object)0));
		long generatedVerbose_save = ea.getVerbose_save();
		if (generatedVerbose_save >= 0) {
			ModernizedCProgram.p_verbose = generatedVerbose_save;
		} 
		ModernizedCProgram.free_cmdmod();
		ModernizedCProgram.cmdmod = save_cmdmod;
		reg_executing = save_reg_executing;
		int generatedSave_msg_silent = ea.getSave_msg_silent();
		if (generatedSave_msg_silent != -1) {
			if (!ModernizedCProgram.did_emsg || msg_silent > generatedSave_msg_silent) {
				msg_silent = generatedSave_msg_silent;
			} 
			emsg_silent -= generatedDid_esilent;
			if (emsg_silent < 0) {
				emsg_silent = 0/* Restore msg_scroll, it's set by file I/O commands, even when no
					 * message is actually displayed. */;
			} 
			msg_scroll = save_msg_scroll;
			if (ModernizedCProgram.redirecting()) {
				ModernizedCProgram.msg_col = 0;
			} 
		} 
		Object generatedDid_sandbox = ea.getDid_sandbox();
		if (generatedDid_sandbox) {
			--sandbox;
		} 
		Object generatedNextcmd = ea.getNextcmd();
		if (generatedNextcmd && generatedNextcmd == /* not really a next command */(byte)'\000') {
			ea.setNextcmd(((Object)0));
		} 
		--ex_nesting_level;
		return generatedNextcmd;/*
		 * Parse and skip over command modifiers:
		 * - update eap->cmd
		 * - store flags in "cmdmod".
		 * - Set ex_pressedreturn for an empty command line.
		 * - set msg_silent for ":silent"
		 * - set 'eventignore' to "all" for ":noautocmd"
		 * - set p_verbose for ":verbose"
		 * - Increment "sandbox" for ":sandbox"
		 * When "skip_only" is TRUE the global variables are not changed, except for
		 * "cmdmod".
		 * Return FAIL when the command is not to be executed.
		 * May set "errormsg" to an error message.
		 */
	}
	public void do_errthrow(Object cmdname) {
		if (ModernizedCProgram.cause_abort) {
			ModernizedCProgram.cause_abort = 0;
			force_abort = 1;
		} 
		if (msg_list == ((Object)0) || msg_list == ((Object)/* If no exception is to be thrown or the conversion should be done after
		     * returning to a previous invocation of do_one_cmd(), do nothing. */0)) {
			return ;
		} 
		if (ModernizedCProgram.throw_exception(msg_list, .ET_ERROR, cmdname) == 0) {
			msg_list.free_msglist();
		} else {
				if (cstack != ((Object)0)) {
					cstack.do_throw();
				} else {
						need_rethrow = 1;
				} 
		} 
		msg_list = ((Object)0/*
		 * do_intthrow(): Replace the current exception by an interrupt or interrupt
		 * exception if appropriate.  Return TRUE if the current exception is discarded,
		 * FALSE otherwise.
		 */);
	}
	/*
	     * Ensure that all commands in nested function calls and sourced files
	     * are aborted immediately.
	     */
	public int do_intthrow() {
		if (!got_int || (trylevel == 0 && !did_throw)) {
			return 0/* avoid warning for condition always true *//*
				 * The interrupt aborts everything except for executing finally clauses.
				 * Discard any user or error or interrupt exception currently being
				 * thrown.
				 */;
		} 
		 generatedType = current_exception.getType();
		{ 
			if (/*
				 * Throw an interrupt exception, so that everything will be aborted
				 * (except for executing finally clauses), until the interrupt exception
				 * is caught; if still uncaught at the top level, the script processing
				 * will be terminated then.  -  If an interrupt exception is already
				 * being thrown, do nothing.
				 *
				 */did_throw) {
				if (generatedType == .ET_INTERRUPT) {
					return 0;
				} 
				ModernizedCProgram.discard_current_exception();
			} 
			if (ModernizedCProgram.throw_exception("Vim:Interrupt", .ET_INTERRUPT, ((Object)0)) != 0) {
				cstack.do_throw();
			} 
		}
		return 1/*
		 * Get an exception message that is to be stored in current_exception->value.
		 */;
	}
	/*
	     * If no interrupt occurred or no try conditional is active and no exception
	     * is being thrown, do nothing (for compatibility of non-EH scripts).
	     */
	public void do_throw() {
		int idx;
		int inactivate_try = 0/*
		     * Cleanup and inactivate up to the next surrounding try conditional that
		     * is not in its finally clause.  Normally, do not inactivate the try
		     * conditional itself, so that its ACTIVE flag can be tested below.  But
		     * if a previous error or interrupt has not been converted to an exception,
		     * inactivate the try conditional, too, as if the conversion had been done,
		     * and reset the did_emsg or got_int flag, so this won't happen again at
		     * the next surrounding try conditional.
		     */;
		idx = cstack.cleanup_conditionals(0, inactivate_try);
		Object generatedCs_flags = this.getCs_flags();
		 generatedCs_pend = this.getCs_pend();
		Object generatedCsp_ex = generatedCs_pend.getCsp_ex();
		if (idx >= 0/*
			 * If this try conditional is active and we are before its first
			 * ":catch", set THROWN so that the ":catch" commands will check
			 * whether the exception matches.  When the exception came from any of
			 * the catch clauses, it will be made pending at the ":finally" (if
			 * present) and rethrown at the ":endtry".  This will also happen if
			 * the try conditional is inactive.  This is the case when we are
			 * throwing an exception due to an error or interrupt on the way from
			 * a preceding ":continue", ":break", ":return", ":finish", error or
			 * interrupt (not converted to an exception) to the finally clause or
			 * from a preceding throw of a user or error or interrupt exception to
			 * the matching catch clause or the finally clause.
			 */) {
			if (!(generatedCs_flags[idx] & -1024)) {
				if (generatedCs_flags[idx] & -1024) {
					generatedCs_flags[idx] |=  -1024/* THROWN may have already been set for a catchable exception
							 * that has been discarded.  Ensure it is reset for the new
							 * exception. */;
				} else {
						generatedCs_flags[idx] &=  ~-1024;
				} 
			} 
			generatedCs_flags[idx] &=  ~-1024;
			generatedCsp_ex[idx] = current_exception/* TODO: Add optimization below.  Not yet done because of interface
			     * problems to eval.c and ex_cmds2.c. (Servatius) */;
		} 
		/*
			 * There are no catch clauses to check or finally clauses to execute.
			 * End the current script or function.  The exception will be rethrown
			 * in the caller.
			 *//*
			 * There are no catch clauses to check or finally clauses to execute.
			 * End the current script or function.  The exception will be rethrown
			 * in the caller.
			 */did_throw = 1/*
		 * ":try"
		 */;
	}
	public int cleanup_conditionals(int searched_cond, int inclusive) {
		int idx;
		int stop = 0;
		Object generatedCs_flags = this.getCs_flags();
		Object generatedCs_pending = this.getCs_pending();
		 generatedCs_pend = this.getCs_pend();
		Object generatedCsp_rv = generatedCs_pend.getCsp_rv();
		Object generatedCsp_ex = generatedCs_pend.getCsp_ex();
		eslist_elem generatedCs_emsg_silent_list = this.getCs_emsg_silent_list();
		eslist_elem generatedNext = elem.getNext();
		int generatedSaved_emsg_silent = elem.getSaved_emsg_silent();
		int generatedCs_idx = this.getCs_idx();
		for (idx = generatedCs_idx; idx >= 0; --idx) {
			if (generatedCs_flags[idx] & -1024/*
				     * Discard anything pending in a finally clause and continue the
				     * search.  There may also be a pending ":continue", ":break",
				     * ":return", or ":finish" before the finally clause.  We must not
				     * discard it, unless an error or interrupt occurred afterwards.
				     */) {
				if (ModernizedCProgram.did_emsg || got_int || (generatedCs_flags[idx] & -1024)) {
					switch (generatedCs_pending[idx]) {
					case 0:
							break;
					case 32:
							ModernizedCProgram.report_discard_pending(generatedCs_pending[idx], ((Object)0));
							generatedCs_pending[idx] = 0;
							break;
					case 16:
					case 8:
					case 24:
							ModernizedCProgram.report_discard_pending(24, generatedCsp_rv[idx]);
							ModernizedCProgram.discard_pending_return(generatedCsp_rv[idx]);
							generatedCs_pending[idx] = 0;
							break;
					default:
							if (generatedCs_flags[idx] & -1024) {
								if (generatedCs_pending[idx] & 4/* Cancel the pending exception.  This is in the
												 * finally clause, so that the stack of the
												 * caught exceptions is not involved. */) {
									(except_T)generatedCsp_ex[idx].discard_exception(0);
								} else {
										ModernizedCProgram.report_discard_pending(generatedCs_pending[idx], ((Object)0));
								} 
								generatedCs_pending[idx] = 0;
							} 
							break;
					}
				} 
				if (!(generatedCs_flags[idx] & -1024)) {
					if ((generatedCs_flags[idx] & -1024) && (generatedCs_flags[idx] & -1024)) {
						(except_T)generatedCsp_ex[idx/* Stop at this try conditional - except the try block never
								 * got active (because of an inactive surrounding conditional
								 * or when the ":try" appeared after an error or interrupt or
								 * throw). */].finish_exception();
					} 
					if (generatedCs_flags[idx] & -1024) {
						if (searched_cond == 0 && !inclusive) {
							break;
						} 
						stop = 1;
					} 
				} 
			} 
			if (generatedCs_flags[idx] & /* Stop on the searched conditional type (even when the surrounding
				 * conditional is not active or something has been made pending).
				 * If "inclusive" is TRUE and "searched_cond" is CSF_TRY|CSF_SILENT,
				 * check first whether "emsg_silent" needs to be restored. */searched_cond) {
				if (!inclusive) {
					break;
				} 
				stop = 1;
			} 
			generatedCs_flags[idx] &=  ~-1024;
			if (stop && searched_cond != (-1024 | -1024)) {
				break;
			} 
			if ((generatedCs_flags[idx] & -1024) && (generatedCs_flags[idx] & -1024)) {
				eslist_T elem = new eslist_T();
				elem = generatedCs_emsg_silent_list;
				this.setCs_emsg_silent_list(generatedNext);
				emsg_silent = generatedSaved_emsg_silent;
				ModernizedCProgram.vim_free(elem);
				generatedCs_flags[idx] &=  ~-1024;
			} 
			if (stop) {
				break;
			} 
		}
		return idx/*
		 * Return an appropriate error message for a missing endwhile/endfor/endif.
		 */;
	}
	public Byte get_end_emsg() {
		Object generatedCs_flags = this.getCs_flags();
		int generatedCs_idx = this.getCs_idx();
		if (generatedCs_flags[generatedCs_idx] & -1024) {
			return e_endwhile;
		} 
		if (generatedCs_flags[generatedCs_idx] & -1024) {
			return e_endfor;
		} 
		return e_endif/*
		 * Rewind conditionals until index "idx" is reached.  "cond_type" and
		 * "cond_level" specify a conditional type and the address of a level variable
		 * which is to be decremented with each skipped conditional of the specified
		 * type.
		 * Also free "for info" structures where needed.
		 */;
	}
	/*
	 * Exception handling terms:
	 *
	 *	:try		":try" command		\
	 *	    ...		try block		|
	 *	:catch RE	":catch" command	|
	 *	    ...		catch clause		|- try conditional
	 *	:finally	":finally" command	|
	 *	    ...		finally clause		|
	 *	:endtry		":endtry" command	/
	 *
	 * The try conditional may have any number of catch clauses and at most one
	 * finally clause.  A ":throw" command can be inside the try block, a catch
	 * clause, the finally clause, or in a function called or script sourced from
	 * there or even outside the try conditional.  Try conditionals may be nested.
	 */
	/*
	 * Configuration whether an exception is thrown on error or interrupt.  When
	 * the preprocessor macros below evaluate to FALSE, an error (did_emsg) or
	 * interrupt (got_int) under an active try conditional terminates the script
	 * after the non-active finally clauses of all active try conditionals have been
	 * executed.  Otherwise, errors and/or interrupts are converted into catchable
	 * exceptions (did_throw additionally set), which terminate the script only if
	 * not caught.  For user exceptions, only did_throw is set.  (Note: got_int can
	 * be set asynchronously afterwards by a SIGINT, so did_throw && got_int is not
	 * a reliant test that the exception currently being thrown is an interrupt
	 * exception.  Similarly, did_emsg can be set afterwards on an error in an
	 * (unskipped) conditional command inside an inactive conditional, so did_throw
	 * && did_emsg is not a reliant test that the exception currently being thrown
	 * is an error exception.)  -  The macros can be defined as expressions checking
	 * for a variable that is allowed to be changed during execution of a script.
	 */
	public void rewind_conditionals(int idx, int cond_type, int cond_level) {
		int generatedCs_idx = this.getCs_idx();
		Object generatedCs_flags = this.getCs_flags();
		Object generatedCs_forinfo = this.getCs_forinfo();
		while (generatedCs_idx > idx) {
			if (generatedCs_flags[generatedCs_idx] & cond_type) {
				--cond_level;
			} 
			if (generatedCs_flags[generatedCs_idx] & -1024) {
				ModernizedCProgram.free_for_info(generatedCs_forinfo[generatedCs_idx]);
			} 
			--generatedCs_idx;
		}
	}
	public Object getCs_flags() {
		return cs_flags;
	}
	public void setCs_flags(Object newCs_flags) {
		cs_flags = newCs_flags;
	}
	public Object getCs_pending() {
		return cs_pending;
	}
	public void setCs_pending(Object newCs_pending) {
		cs_pending = newCs_pending;
	}
	public  getCs_pend() {
		return cs_pend;
	}
	public void setCs_pend( newCs_pend) {
		cs_pend = newCs_pend;
	}
	public Object getCs_forinfo() {
		return cs_forinfo;
	}
	public void setCs_forinfo(Object newCs_forinfo) {
		cs_forinfo = newCs_forinfo;
	}
	public Object getCs_line() {
		return cs_line;
	}
	public void setCs_line(Object newCs_line) {
		cs_line = newCs_line;
	}
	public int getCs_idx() {
		return cs_idx;
	}
	public void setCs_idx(int newCs_idx) {
		cs_idx = newCs_idx;
	}
	public int getCs_looplevel() {
		return cs_looplevel;
	}
	public void setCs_looplevel(int newCs_looplevel) {
		cs_looplevel = newCs_looplevel;
	}
	public int getCs_trylevel() {
		return cs_trylevel;
	}
	public void setCs_trylevel(int newCs_trylevel) {
		cs_trylevel = newCs_trylevel;
	}
	public eslist_elem getCs_emsg_silent_list() {
		return cs_emsg_silent_list;
	}
	public void setCs_emsg_silent_list(eslist_elem newCs_emsg_silent_list) {
		cs_emsg_silent_list = newCs_emsg_silent_list;
	}
	public byte getCs_lflags() {
		return cs_lflags;
	}
	public void setCs_lflags(byte newCs_lflags) {
		cs_lflags = newCs_lflags;
	}
}
