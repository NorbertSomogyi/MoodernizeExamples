package application;

public class pattern_list {
	private int nr;
	private int alloc;
	private Byte filebuf;
	private Object src;
	private path_pattern patterns;
	
	public pattern_list(int nr, int alloc, Byte filebuf, Object src, path_pattern patterns) {
		setNr(nr);
		setAlloc(alloc);
		setFilebuf(filebuf);
		setSrc(src);
		setPatterns(patterns);
	}
	public pattern_list() {
	}
	
	public void add_pattern(Object string, Object base, int baselen, int srcpos) {
		path_pattern pattern = new path_pattern();
		int patternlen;
		int flags;
		int nowildcardlen;
		ModernizedCProgram.parse_path_pattern(string, patternlen, flags, nowildcardlen);
		if (flags & 8) {
			do {
				size_t flex_array_len_ = (patternlen);
				(pattern) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
				.memcpy((pattern) + 1, (string), flex_array_len_);
				(pattern).setPattern((Object)((pattern) + 1));
			} while (0);
		} else {
				pattern = ModernizedCProgram.xmalloc();
				pattern.setPattern(string);
		} 
		pattern.setPatternlen(patternlen);
		pattern.setNowildcardlen(nowildcardlen);
		pattern.setBase(base);
		pattern.setBaselen(baselen);
		pattern.setFlags(flags);
		pattern.setSrcpos(srcpos);
		int generatedNr = this.getNr();
		int generatedAlloc = this.getAlloc();
		path_pattern generatedPatterns = this.getPatterns();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					this.setAlloc((generatedNr + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedPatterns) = ModernizedCProgram.xrealloc((generatedPatterns), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		generatedPatterns[generatedNr++] = pattern;
		pattern.setPl(pl);
	}
	public void clear_pattern_list() {
		int i;
		int generatedNr = this.getNr();
		path_pattern generatedPatterns = this.getPatterns();
		for (i = 0; i < generatedNr; i++) {
			ModernizedCProgram.free(generatedPatterns[i]);
		}
		ModernizedCProgram.free(generatedPatterns);
		Byte generatedFilebuf = this.getFilebuf();
		ModernizedCProgram.free(generatedFilebuf);
		.memset(pl, 0, );
	}
	public int add_patterns_from_buffer(Byte buf, Object size, Object base, int baselen) {
		int i;
		int lineno = 1;
		byte entry;
		this.setFilebuf(buf);
		Byte generatedFilebuf = this.getFilebuf();
		if (ModernizedCProgram.skip_utf8_bom(buf, size)) {
			size -= buf - generatedFilebuf;
		} 
		entry = buf;
		for (i = 0; i < size; i++) {
			if (buf[i] == (byte)'\n') {
				if (entry != buf + i && entry[0] != (byte)'#') {
					buf[i - (i && buf[i - 1] == (byte)'\r')] = 0;
					ModernizedCProgram.trim_trailing_spaces(entry);
					pl.add_pattern(entry, base, baselen, lineno);
				} 
				lineno++;
				entry = buf + i + 1;
			} 
		}
		return 0;
	}
	public pattern_list add_pattern_list(dir_struct dir, int group_type, Object src) {
		pattern_list pl = new pattern_list();
		exclude_list_group group = new exclude_list_group();
		Object generatedExclude_list_group = dir.getExclude_list_group();
		group = generatedExclude_list_group[group_type];
		int generatedNr = group.getNr();
		int generatedAlloc = group.getAlloc();
		pattern_list generatedPl = group.getPl();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					group.setAlloc((generatedNr + 1));
				} else {
						group.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedPl) = ModernizedCProgram.xrealloc((generatedPl), ModernizedCProgram.st_mult(, (generatedAlloc)));
			} 
		} while (0);
		pl = generatedPl[generatedNr++];
		.memset(pl, 0, );
		pl.setSrc(src);
		return pl/*
		 * Used to set up core.excludesfile and .git/info/exclude lists.
		 */;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public Byte getFilebuf() {
		return filebuf;
	}
	public void setFilebuf(Byte newFilebuf) {
		filebuf = newFilebuf;
	}
	public Object getSrc() {
		return src;
	}
	public void setSrc(Object newSrc) {
		src = newSrc;
	}
	public path_pattern getPatterns() {
		return patterns;
	}
	public void setPatterns(path_pattern newPatterns) {
		patterns = newPatterns;
	}
}
