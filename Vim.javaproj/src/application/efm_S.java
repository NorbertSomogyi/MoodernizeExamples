package application;

// maximum number of % recognized
/*
 * Structure used to hold the info of one part of 'errorformat'
 */
public class efm_S {
	private regprog prog;
	private efm_S next;
	private Object addr;
	private Object prefix;
	private Object flags;
	private int conthere;
	
	public efm_S(regprog prog, efm_S next, Object addr, Object prefix, Object flags, int conthere) {
		setProg(prog);
		setNext(next);
		setAddr(addr);
		setPrefix(prefix);
		setFlags(flags);
		setConthere(conthere);
	}
	public efm_S() {
	}
	
	public Object efmpat_to_regpat(Object[] efmpat, Object regpat, int idx, int round) {
		char_u srcptr = new char_u();
		Object generatedAddr = this.getAddr();
		if (generatedAddr[idx]) {
			ModernizedCProgram.semsg(((byte)("E372: Too many %%%c in format string")), efmpat);
			return ((Object)0);
		} 
		Object generatedPrefix = this.getPrefix();
		if ((idx && idx < 6 && ModernizedCProgram.vim_strchr((char_u)"DXOPQ", generatedPrefix) != ((Object)0)) || (idx == 6 && ModernizedCProgram.vim_strchr((char_u)"OPQ", generatedPrefix) == ((Object)0))) {
			ModernizedCProgram.semsg(((byte)("E373: Unexpected %%%c in format string")), efmpat);
			return ((Object)0);
		} 
		generatedAddr[idx] = (char_u)++round;
		regpat++ = (byte)'\\';
		regpat++ = (byte)'(';
		if (efmpat == (byte)'f') {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(regpat), (byte)("\\%(\\a:\\)\\="));
			regpat += 10;
		} 
		// Also match "c:" in the file name, even when
		if (efmpat == (byte)'f' && efmpat[1] != (byte)'\000') {
			if (efmpat[1] != (byte)'\\' && efmpat[1] != (byte)'%') {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(regpat), (byte)(".\\{-1,}"));
				regpat += 7;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(regpat), (byte)("\\f\\+"));
					regpat += 4;
			} 
		} else {
				srcptr = (char_u)fmt_pat[idx].getPattern();
				while ((regpat = srcptr++) != (byte)'\000') {
					++regpat;
				}
		} 
		regpat++ = (byte)'\\';
		regpat++ = (byte)')';
		return regpat/*
		 * Convert a scanf like format in 'errorformat' to a regular expression.
		 * Returns a pointer to the location after the pattern.
		 */;
	}
	public Object efm_analyze_prefix(Object efmp) {
		if (ModernizedCProgram.vim_strchr((char_u)"+-", efmp) != ((Object)0)) {
			this.setFlags(efmp++);
		} 
		if (ModernizedCProgram.vim_strchr((char_u)"DXAEWICZGOPQ", efmp) != ((Object)0)) {
			this.setPrefix(efmp);
		} else {
				ModernizedCProgram.semsg(((byte)("E376: Invalid %%%c in format string prefix")), efmp);
				return ((Object)0);
		} 
		return efmp/*
		 * Converts a 'errorformat' string part in 'efm' to a regular expression
		 * pattern.  The resulting regex pattern is returned in "regpat". Additional
		 * information about the 'erroformat' pattern is returned in "fmt_ptr".
		 * Returns OK or FAIL.
		 */;
	}
	public int efm_to_regpat(Object efm, int len, Object regpat) {
		char_u ptr = new char_u();
		char_u efmp = new char_u();
		int round;
		int idx = 0;
		// Build a regexp pattern for a 'errorformat' option part// Build a regexp pattern for a 'errorformat' option partptr = regpat;
		ptr++ = (byte)'^';
		round = 0;
		for (efmp = efm; efmp < efm + len; ++efmp) {
			if (efmp == (byte)'%') {
				++efmp;
				for (idx = 0; idx < 11; ++idx) {
					if (fmt_pat[idx].getConvchar() == efmp) {
						break;
					} 
				}
				if (idx < 11) {
					ptr = fmt_ptr.efmpat_to_regpat(efmp, ptr, idx, round);
					if (ptr == ((Object)0)) {
						return 0;
					} 
					round++;
				}  else if (efmp == (byte)'*') {
					++efmp;
					ptr = ModernizedCProgram.scanf_fmt_to_regpat(efmp, efm, len, ptr);
					if (ptr == ((Object)0)) {
						return 0;
					} 
				}  else if (ModernizedCProgram.vim_strchr((char_u)"%\\.^$~[", efmp) != ((Object)0)) {
					ptr++ = efmp;
				}  else if (efmp == (byte)'#') {
					ptr++ = (byte)'*';
				}  else if (efmp == (byte)'>') {
					this.setConthere(1);
				}  else if (efmp == efm + 1) {
					efmp = fmt_ptr.efm_analyze_prefix(efmp);
					if (efmp == ((Object)0)) {
						return 0;
					} 
				} else {
						ModernizedCProgram.semsg(((byte)("E377: Invalid %%%c in format string")), efmp);
						return 0;
				} 
			} else {
					if (efmp == (byte)'\\' && efmp + 1 < efm + len) {
						++efmp;
					}  else if (ModernizedCProgram.vim_strchr((char_u)".*^$~[", efmp) != ((Object)0)) {
						ptr++ = (byte)'\\';
					} 
					if (efmp) {
						ptr++ = efmp;
					} 
			} 
		}
		ptr++ = (byte)'$';
		ptr = (byte)'\000';
		return 1/*
		 * Free the 'errorformat' information list
		 */;
	}
	public void free_efm_list() {
		efm_T efm_ptr = new efm_T();
		efm_S generatedNext = efm_ptr.getNext();
		regprog generatedProg = efm_ptr.getProg();
		for (efm_ptr = efm_first; efm_ptr != ((Object)0); efm_ptr = efm_first) {
			efm_first = generatedNext;
			generatedProg.vim_regfree();
			ModernizedCProgram.vim_free(efm_ptr);
		}
		ModernizedCProgram.fmt_start = ((Object)0/*
		 * Compute the size of the buffer used to convert a 'errorformat' pattern into
		 * a regular expression pattern.
		 */);
	}
	public efm_S parse_efm_option(Object[] efm) {
		efm_T fmt_ptr = ((Object)0);
		efm_T fmt_first = ((Object)0);
		efm_T fmt_last = ((Object)0);
		char_u fmtstr = ((Object)0);
		int len;
		int sz;
		// Each part of the format string is copied and modified from errorformat// to regex prog.  Only a few % characters are allowed.
		// Get some space to modify the format string into.// Get some space to modify the format string into.sz = ModernizedCProgram.efm_regpat_bufsz(efm);
		if ((fmtstr = ModernizedCProgram.alloc(sz)) == ((Object)0)) {
			;
		} 
		regprog regprog = new regprog();
		while (efm[0] != (byte)'\000') {
			fmt_ptr = (efm_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/);
			if (fmt_ptr == ((Object)0)) {
				;
			} 
			if (fmt_first == ((Object)0)) {
				fmt_first = fmt_ptr;
			} else {
					fmt_last.setNext(fmt_ptr);
			} 
			fmt_last = fmt_ptr;
			len = ModernizedCProgram.efm_option_part_len(efm);
			if (fmt_ptr.efm_to_regpat(efm, len, fmtstr) == 0) {
				;
			} 
			if ((fmt_ptr.setProg(regprog.vim_regcomp(fmtstr, 1 + 2))) == ((Object)0)) {
				;
			} 
			efm = ModernizedCProgram.skip_to_option_part(efm + len);
		}
		// nothing foundif (fmt_first == ((Object)0)) {
			ModernizedCProgram.emsg(((byte)("E378: 'errorformat' contains no pattern")));
		} 
		;
		return fmt_first;
	}
	public regprog getProg() {
		return prog;
	}
	public void setProg(regprog newProg) {
		prog = newProg;
	}
	public efm_S getNext() {
		return next;
	}
	public void setNext(efm_S newNext) {
		next = newNext;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public Object getPrefix() {
		return prefix;
	}
	public void setPrefix(Object newPrefix) {
		prefix = newPrefix;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public int getConthere() {
		return conthere;
	}
	public void setConthere(int newConthere) {
		conthere = newConthere;
	}
}
