package application;

public class path_pattern {
	private pattern_list pl;
	private Object pattern;
	private int patternlen;
	private int nowildcardlen;
	private Object base;
	private int baselen;
	private int flags;
	private int srcpos;
	
	public path_pattern(pattern_list pl, Object pattern, int patternlen, int nowildcardlen, Object base, int baselen, int flags, int srcpos) {
		setPl(pl);
		setPattern(pattern);
		setPatternlen(patternlen);
		setNowildcardlen(nowildcardlen);
		setBase(base);
		setBaselen(baselen);
		setFlags(flags);
		setSrcpos(srcpos);
	}
	public path_pattern() {
	}
	
	public path_pattern last_matching_pattern_from_list(Object pathname, int pathlen, Object basename, int dtype, pattern_list pl, index_state istate) {
		path_pattern res = ((Object)/* undecided */0);
		int i;
		int generatedNr = pl.getNr();
		if (!generatedNr) {
			return ((Object)/* undefined */0);
		} 
		path_pattern generatedPatterns = pl.getPatterns();
		for (i = generatedNr - 1; 0 <= i; i--) {
			path_pattern pattern = generatedPatterns[i];
			byte exclude = ModernizedCProgram.pattern.getPattern();
			int prefix = ModernizedCProgram.pattern.getNowildcardlen();
			if (ModernizedCProgram.pattern.getFlags() & 8) {
				if (dtype == 0) {
					dtype = ModernizedCProgram.get_dtype(((Object)0), istate, pathname, pathlen);
				} 
				if (dtype != 1) {
					continue;
				} 
			} 
			if (ModernizedCProgram.pattern.getFlags() & 1) {
				if (ModernizedCProgram.match_basename(basename, pathlen - (basename - pathname), exclude, ModernizedCProgram.prefix, ModernizedCProgram.pattern.getPatternlen(), ModernizedCProgram.pattern.getFlags())) {
					res = ModernizedCProgram.pattern;
					break;
				} 
				continue;
			} 
			((ModernizedCProgram.pattern.getBaselen() == 0 || ModernizedCProgram.pattern.getBase()[ModernizedCProgram.pattern.getBaselen() - 1] == (byte)'/') ? (Object)0 : ._assert("pattern->baselen == 0 || pattern->base[pattern->baselen - 1] == '/'", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\dir.c", 1073));
			if (ModernizedCProgram.match_pathname(pathname, pathlen, ModernizedCProgram.pattern.getBase(), ModernizedCProgram.pattern.getBaselen() ? ModernizedCProgram.pattern.getBaselen() - 1 : 0, exclude, ModernizedCProgram.prefix, ModernizedCProgram.pattern.getPatternlen(), ModernizedCProgram.pattern.getFlags())) {
				res = ModernizedCProgram.pattern;
				break;
			} 
		}
		return res/*
		 * Scan the list of patterns to determine if the ordered list
		 * of patterns matches on 'pathname'.
		 *
		 * Return 1 for a match, 0 for not matched and -1 for undecided.
		 */;
	}
	public path_pattern last_matching_pattern_from_lists(dir_struct dir, index_state istate, Object pathname, int pathlen, Object basename, Integer dtype_p) {
		int i;
		int j;
		exclude_list_group group = new exclude_list_group();
		path_pattern pattern = new path_pattern();
		Object generatedExclude_list_group = dir.getExclude_list_group();
		pattern_list generatedPl = group.getPl();
		path_pattern path_pattern = new path_pattern();
		int generatedNr = group.getNr();
		for (i = 0; i <= 2; i++) {
			group = generatedExclude_list_group[i];
			for (j = generatedNr - 1; j >= 0; j--) {
				pattern = path_pattern.last_matching_pattern_from_list(pathname, pathlen, basename, dtype_p, generatedPl[j], istate);
				if (pattern) {
					return pattern;
				} 
			}
		}
		return ((Object)0/*
		 * Loads the per-directory exclude list for the substring of base
		 * which has a char length of baselen.
		 */);
	}
	public path_pattern last_matching_pattern(dir_struct dir, index_state istate, Object pathname, Integer dtype_p) {
		int pathlen = .strlen(pathname);
		byte basename = .strrchr(pathname, (byte)'/');
		basename = (basename) ? basename + 1 : pathname;
		ModernizedCProgram.prep_exclude(dir, istate, pathname, basename - pathname);
		path_pattern generatedPattern = dir.getPattern();
		if (generatedPattern) {
			return generatedPattern;
		} 
		path_pattern path_pattern = new path_pattern();
		return path_pattern.last_matching_pattern_from_lists(dir, istate, pathname, pathlen, basename, dtype_p/*
		 * Loads the exclude lists for the directory containing pathname, then
		 * scans all exclude lists to determine whether pathname is excluded.
		 * Returns 1 if true, otherwise 0.
		 */);
	}
	public void output_pattern(Object path) {
		byte bang = (ModernizedCProgram.pattern && ModernizedCProgram.pattern.getFlags() & 16) ? "!" : "";
		byte slash = (ModernizedCProgram.pattern && ModernizedCProgram.pattern.getFlags() & 8) ? "/" : "";
		if (!ModernizedCProgram.nul_term_line) {
			if (!ModernizedCProgram.verbose) {
				(_iob[1]).write_name_quoted(path, (byte)'\n');
			} else {
					if (ModernizedCProgram.pattern) {
						ModernizedCProgram.quote_c_style(ModernizedCProgram.pattern.getPl().getPattern_list(), ((Object)0), (_iob[1]), 0);
						.printf(":%d:%s%s%s\t", ModernizedCProgram.pattern.getSrcpos(), bang, ModernizedCProgram.pattern.getPattern(), slash);
					} else {
							.printf("::\t");
					} 
					ModernizedCProgram.quote_c_style(path, ((Object)0), (_iob[1]), 0);
					.fputc((byte)'\n', (_iob[1]));
			} 
		} else {
				if (!ModernizedCProgram.verbose) {
					.printf("%s%c", path, (byte)'\0');
				} else {
						if (ModernizedCProgram.pattern) {
							.printf("%s%c%d%c%s%s%s%c%s%c", ModernizedCProgram.pattern.getPl().getPattern_list(), (byte)'\0', ModernizedCProgram.pattern.getSrcpos(), (byte)'\0', bang, ModernizedCProgram.pattern.getPattern(), slash, (byte)'\0', path, (byte)'\0');
						} else {
								.printf("%c%c%c%s%c", (byte)'\0', (byte)'\0', (byte)'\0', path, (byte)'\0');
						} 
				} 
		} 
	}
	public pattern_list getPl() {
		return pl;
	}
	public void setPl(pattern_list newPl) {
		pl = newPl;
	}
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public int getPatternlen() {
		return patternlen;
	}
	public void setPatternlen(int newPatternlen) {
		patternlen = newPatternlen;
	}
	public int getNowildcardlen() {
		return nowildcardlen;
	}
	public void setNowildcardlen(int newNowildcardlen) {
		nowildcardlen = newNowildcardlen;
	}
	public Object getBase() {
		return base;
	}
	public void setBase(Object newBase) {
		base = newBase;
	}
	public int getBaselen() {
		return baselen;
	}
	public void setBaselen(int newBaselen) {
		baselen = newBaselen;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getSrcpos() {
		return srcpos;
	}
	public void setSrcpos(int newSrcpos) {
		srcpos = newSrcpos;
	}
}
/*
	 * This allows callers of last_matching_pattern() etc.
	 * to determine the origin of the matching pattern.
	 */
/*
 * The contents of the per-directory exclude files are lazily read on
 * demand and then cached in memory, one per exclude_stack struct, in
 * order to avoid opening and parsing each one every time that
 * directory is traversed.
 */
