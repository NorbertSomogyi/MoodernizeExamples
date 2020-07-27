package application;

public class regprog {
	private regengine engine;
	private int regflags;
	private int re_engine;
	private int re_flags;
	private int re_in_use;
	
	public regprog(regengine engine, int regflags, int re_engine, int re_flags, int re_in_use) {
		setEngine(engine);
		setRegflags(regflags);
		setRe_engine(re_engine);
		setRe_flags(re_flags);
		setRe_in_use(re_in_use);
	}
	public regprog() {
	}
	
	public int match_file_pat(Object pattern, Object fname, Object sfname, Object tail, int allow_dirs) {
		/* short file name or NULL *//* tail of path *//* allow matching with dir */regmatch_T regmatch = new regmatch_T();
		int result = 0;
		regmatch.setRm_ic(/* ignore case if 'fileignorecase' is set */ModernizedCProgram.p_fic);
		regprog regprog = new regprog();
		if (prog != ((Object)0)) {
			regmatch.setRegprog(prog);
		} else {
				regmatch.setRegprog(regprog.vim_regcomp(pattern, 1/*
				     * Try for a match with the pattern with:
				     * 1. the full file name, when the pattern has a '/'.
				     * 2. the short file name, when the pattern has a '/'.
				     * 3. the tail of the file name, when the pattern has no '/'.
				     */));
		} 
		Object generatedRegprog = regmatch.getRegprog();
		if (generatedRegprog != ((Object)0) && ((allow_dirs && (regmatch.vim_regexec(fname, (colnr_T)0) || (sfname != ((Object)0) && regmatch.vim_regexec(sfname, (colnr_T)0)))) || (!allow_dirs && regmatch.vim_regexec(tail, (colnr_T)0)))) {
			result = 1;
		} 
		if (prog != ((Object)0)) {
			prog = generatedRegprog;
		} else {
				generatedRegprog.vim_regfree();
		} 
		return result/*
		 * Return TRUE if a file matches with a pattern in "list".
		 * "list" is a comma-separated list of patterns, like 'wildignore'.
		 * "sfname" is the short file name or NULL, "ffname" the long file name.
		 */;
	}
	/* pattern to match with */
	/* pre-compiled regprog or NULL */
	/* full path of file name */
	/*
	 * Return TRUE if compiled regular expression "prog" can match a line break.
	 */
	public int re_multiline() {
		int generatedRegflags = this.getRegflags();
		return (generatedRegflags & 4/*
		 * Check for an equivalence class name "[=a=]".  "pp" points to the '['.
		 * Returns a character representing the class. Zero means that no item was
		 * recognized.  Otherwise "pp" is advanced to after the item.
		 */);
	}
	/*
	 * Compile a regular expression into internal code.
	 * Returns the program in allocated memory.
	 * Use vim_regfree() to free the memory.
	 * Returns NULL for an error.
	 */
	public regprog vim_regcomp(Object expr_arg, int re_flags) {
		regprog_T prog = ((Object)0);
		char_u expr = expr_arg;
		int save_called_emsg;
		ModernizedCProgram.regexp_engine = ModernizedCProgram.p_re;
		if (/*Error: Function owner not recognized*/strncmp((byte)(expr), (byte)("\\%#="), (size_t)(true)) == /* Check for prefix "\%#=", that sets the regexp engine */0) {
			int newengine = expr[4] - (byte)'0';
			if (newengine == 0 || newengine == 1 || newengine == 2) {
				ModernizedCProgram.regexp_engine = expr[4] - (byte)'0';
				expr += 5;
			} else {
					ModernizedCProgram.emsg(((byte)("E864: \\%#= can only be followed by 0, 1, or 2. The automatic engine will be used ")));
					ModernizedCProgram.regexp_engine = 0;
			} 
		} 
		// reg_iswordc() uses rex.reg_buf// reg_iswordc() uses rex.reg_bufModernizedCProgram.rex.setReg_buf(curbuf/*
		     * First try the NFA engine, unless backtracking was requested.
		     */);
		save_called_emsg = ModernizedCProgram.called_emsg;
		ModernizedCProgram.called_emsg = 0;
		if (ModernizedCProgram.regexp_engine != 1) {
			prog = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(expr, re_flags + (ModernizedCProgram.regexp_engine == 0 ? 8 : 0));
		} else {
				prog = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(expr, re_flags);
		} 
		if (prog == ((Object)/* Check for error compiling regexp with initial engine. */0/* debugging log for NFA */)) {
			if (ModernizedCProgram.regexp_engine == 0 && !/*
				 * If the NFA engine failed, try the backtracking engine.
				 * The NFA engine also fails for patterns that it can't handle well
				 * but are still valid patterns, thus a retry should work.
				 * But don't try if an error message was given.
				 */ModernizedCProgram.called_emsg) {
				ModernizedCProgram.regexp_engine = 1;
				prog = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(expr, re_flags);
			} 
		} 
		ModernizedCProgram.called_emsg |=  save_called_emsg;
		if (prog != ((Object)0)) {
			prog.setRe_engine(/* Store the info needed to call regcomp() again when the engine turns
				 * out to be very slow when executing it. */ModernizedCProgram.regexp_engine);
			prog.setRe_flags(re_flags);
		} 
		return prog/*
		 * Free a compiled regexp program, returned by vim_regcomp().
		 */;
	}
	public void vim_regfree() {
		if (prog != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(prog);
		} 
	}
	public int vim_regexec_prog(int ignore_case, Object line, Object col) {
		int r;
		regmatch_T regmatch = new regmatch_T();
		regmatch.setRegprog(prog);
		regmatch.setRm_ic(ignore_case);
		r = regmatch.vim_regexec_string(line, col, 0);
		Object generatedRegprog = regmatch.getRegprog();
		prog = generatedRegprog;
		return r/*
		 * Note: "rmp->regprog" may be freed and changed.
		 * Return TRUE if there is a match, FALSE if not.
		 */;
	}
	public regengine getEngine() {
		return engine;
	}
	public void setEngine(regengine newEngine) {
		engine = newEngine;
	}
	public int getRegflags() {
		return regflags;
	}
	public void setRegflags(int newRegflags) {
		regflags = newRegflags;
	}
	public int getRe_engine() {
		return re_engine;
	}
	public void setRe_engine(int newRe_engine) {
		re_engine = newRe_engine;
	}
	public int getRe_flags() {
		return re_flags;
	}
	public void setRe_flags(int newRe_flags) {
		re_flags = newRe_flags;
	}
	public int getRe_in_use() {
		return re_in_use;
	}
	public void setRe_in_use(int newRe_in_use) {
		re_in_use = newRe_in_use;
	}
}
