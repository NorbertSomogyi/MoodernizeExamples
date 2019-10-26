package application;

/* This data structure represents a compiled pattern.  Before calling
   the pattern compiler, the fields `buffer', `allocated', `fastmap',
   `translate', and `no_sub' can be set.  After the pattern has been
   compiled, the `re_nsub' field is available.  All other fields are
   private to the regex routines.  */
public class re_pattern_buffer {
	private Byte buffer;
	private long allocated;
	private long used;
	private Object syntax;
	private Byte fastmap;
	private Byte translate;
	private Object re_nsub;
	private int can_be_null;
	private int regs_allocated;
	private int fastmap_accurate;
	private int no_sub;
	private int not_bol;
	private int not_eol;
	private int newline_anchor;
	
	public re_pattern_buffer(Byte buffer, long allocated, long used, Object syntax, Byte fastmap, Byte translate, Object re_nsub, int can_be_null, int regs_allocated, int fastmap_accurate, int no_sub, int not_bol, int not_eol, int newline_anchor) {
		setBuffer(buffer);
		setAllocated(allocated);
		setUsed(used);
		setSyntax(syntax);
		setFastmap(fastmap);
		setTranslate(translate);
		setRe_nsub(re_nsub);
		setCan_be_null(can_be_null);
		setRegs_allocated(regs_allocated);
		setFastmap_accurate(fastmap_accurate);
		setNo_sub(no_sub);
		setNot_bol(not_bol);
		setNot_eol(not_eol);
		setNewline_anchor(newline_anchor);
	}
	public re_pattern_buffer() {
	}
	
	public Object find_funcname_matching_regexp(Object xecfg, Object start) {
		int reg_error;
		regmatch_t[] match = new regmatch_t();
		while (1) {
			byte bol;
			byte eol;
			reg_error = ModernizedCProgram.regexec(ModernizedCProgram.regexp, start, 1, match, 0);
			if (reg_error == .REG_NOMATCH) {
				return ((Object)0);
			}  else if (reg_error) {
				byte[] errbuf = new byte[1024];
				ModernizedCProgram.regerror(reg_error, ModernizedCProgram.regexp, errbuf, 1024);
				ModernizedCProgram.die("-L parameter: regexec() failed: %s", errbuf);
			} 
			bol = start + match[0].getRm_so();
			eol = start + match[0].getRm_eo();
			while (bol > start && bol != (byte)'\n') {
				bol--;
			}
			if (bol == (byte)'\n') {
				bol++;
			} 
			while (eol && eol != (byte)'\n') {
				eol++;
			}
			if (eol == (byte)'\n') {
				eol++;
			} 
			if (ModernizedCProgram.match_funcname(xecfg, (byte)bol, (byte)/* is it a funcname line? */eol)) {
				return bol;
			} 
			start = eol;
		}
	}
	public int contains(Object mf, Object kws) {
		int cnt;
		long sz;
		byte data;
		sz = mf.getSize();
		data = mf.getPtr();
		cnt = 0;
		Object generatedRm_eo = regmatch.getRm_eo();
		Object generatedRm_so = regmatch.getRm_so();
		Object generatedSize = kwsm.getSize();
		if (ModernizedCProgram.regexp) {
			regmatch_t regmatch = new regmatch_t();
			int flags = 0;
			while (sz && data && !regmatch.regexec_buf(ModernizedCProgram.regexp, data, sz, 1, flags)) {
				flags |=  1;
				data += generatedRm_eo;
				sz -= generatedRm_eo;
				if (sz && data && generatedRm_so == generatedRm_eo) {
					data++;
					sz--;
				} 
				cnt++;
			}
		} else {
				while (/* Classic exact string match */sz) {
					kwsmatch kwsm = new kwsmatch();
					size_t offset = kwsm.kwsexec(kws, data, sz);
					if (ModernizedCProgram.offset == -1) {
						break;
					} 
					sz -= ModernizedCProgram.offset + generatedSize[0];
					data += ModernizedCProgram.offset + generatedSize[0];
					cnt++;
				}
		} 
		return cnt;
	}
	public void regcomp_or_die(Object needle, int cflags) {
		int err = ModernizedCProgram.regcomp(regex, needle, cflags);
		if (err) {
			byte[] errbuf = new byte[/* The POSIX.2 people are surely sick */1024];
			ModernizedCProgram.regerror(err, regex, errbuf, 1024);
			ModernizedCProgram.die("invalid regex: %s", errbuf);
		} 
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public long getAllocated() {
		return allocated;
	}
	public void setAllocated(long newAllocated) {
		allocated = newAllocated;
	}
	public long getUsed() {
		return used;
	}
	public void setUsed(long newUsed) {
		used = newUsed;
	}
	public Object getSyntax() {
		return syntax;
	}
	public void setSyntax(Object newSyntax) {
		syntax = newSyntax;
	}
	public Byte getFastmap() {
		return fastmap;
	}
	public void setFastmap(Byte newFastmap) {
		fastmap = newFastmap;
	}
	public Byte getTranslate() {
		return translate;
	}
	public void setTranslate(Byte newTranslate) {
		translate = newTranslate;
	}
	public Object getRe_nsub() {
		return re_nsub;
	}
	public void setRe_nsub(Object newRe_nsub) {
		re_nsub = newRe_nsub;
	}
	public int getCan_be_null() {
		return can_be_null;
	}
	public void setCan_be_null(int newCan_be_null) {
		can_be_null = newCan_be_null;
	}
	public int getRegs_allocated() {
		return regs_allocated;
	}
	public void setRegs_allocated(int newRegs_allocated) {
		regs_allocated = newRegs_allocated;
	}
	public int getFastmap_accurate() {
		return fastmap_accurate;
	}
	public void setFastmap_accurate(int newFastmap_accurate) {
		fastmap_accurate = newFastmap_accurate;
	}
	public int getNo_sub() {
		return no_sub;
	}
	public void setNo_sub(int newNo_sub) {
		no_sub = newNo_sub;
	}
	public int getNot_bol() {
		return not_bol;
	}
	public void setNot_bol(int newNot_bol) {
		not_bol = newNot_bol;
	}
	public int getNot_eol() {
		return not_eol;
	}
	public void setNot_eol(int newNot_eol) {
		not_eol = newNot_eol;
	}
	public int getNewline_anchor() {
		return newline_anchor;
	}
	public void setNewline_anchor(int newNewline_anchor) {
		newline_anchor = newNewline_anchor;
	}
}
/* Space that holds the compiled pattern.  It is declared as
     `unsigned char *' because its elements are sometimes used as
     array indexes.  */
/* Type for byte offsets within the string.  POSIX mandates this.  */
/* Compile a fastmap for the compiled pattern in BUFFER; used to
   accelerate searches.  Return 0 if successful and -2 if was an
   internal error.  */
