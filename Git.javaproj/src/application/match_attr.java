package application;

public class match_attr {
	private  u;
	private byte is_macro;
	private int num_attr;
	private Object state;
	
	public match_attr( u, byte is_macro, int num_attr, Object state) {
		setU(u);
		setIs_macro(is_macro);
		setNum_attr(num_attr);
		setState(state);
	}
	public match_attr() {
	}
	
	public match_attr parse_attr_line(Object line, Object src, int lineno, int macro_ok) {
		int namelen;
		int num_attr;
		int i;
		byte cp;
		byte name;
		byte states;
		match_attr res = ((Object)0);
		int is_macro;
		strbuf pattern = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		cp = line + /*Error: Function owner not recognized*/strspn(line, ModernizedCProgram.blank);
		if (!cp || cp == (byte)'#') {
			return ((Object)0);
		} 
		name = cp;
		byte[] generatedBuf = pattern.getBuf();
		Object generatedLen = pattern.getLen();
		if (cp == (byte)'"' && !pattern.unquote_c_style(name, states)) {
			name = generatedBuf;
			namelen = generatedLen;
		} else {
				namelen = /*Error: Function owner not recognized*/strcspn(name, ModernizedCProgram.blank);
				states = name + namelen;
		} 
		if (/*Error: Function owner not recognized*/strlen("[attr]") < namelen && ModernizedCProgram.starts_with(name, "[attr]")) {
			if (!macro_ok) {
				(_iob[2]).fprintf_ln(ModernizedCProgram._("%s not allowed: %s:%d"), name, src, lineno);
				;
			} 
			is_macro = 1;
			name += /*Error: Function owner not recognized*/strlen("[attr]");
			name += /*Error: Function owner not recognized*/strspn(name, ModernizedCProgram.blank);
			namelen = /*Error: Function owner not recognized*/strcspn(name, ModernizedCProgram.blank);
			if (!ModernizedCProgram.attr_name_valid(name, namelen)) {
				ModernizedCProgram.report_invalid_attr(name, namelen, src, lineno);
				;
			} 
		} else {
				is_macro = 0;
		} 
		states += /*Error: Function owner not recognized*/strspn(states, ModernizedCProgram.blank);
		for (; cp; /* First pass to count the attr_states */num_attr++) {
			cp = ModernizedCProgram.parse_attr(src, lineno, cp, ((Object)0));
			if (!cp) {
				;
			} 
		}
		res = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/ + /*Error: Unsupported expression*/ * num_attr + (is_macro ? 0 : namelen + 1));
		 generatedU = res.getU();
		Object generatedState = res.getState();
		Object generatedPat = generatedU.getPat();
		if (is_macro) {
			generatedU.setAttr(ModernizedCProgram.git_attr_internal(name, namelen));
		} else {
				byte p = (byte)(generatedState[num_attr]);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(p, name, namelen);
				generatedPat.setPattern(p);
				ModernizedCProgram.parse_path_pattern(generatedPat.getPattern(), generatedPat.getPatternlen(), generatedPat.getFlags(), generatedPat.getNowildcardlen());
				if (generatedPat.getFlags() & 16) {
					ModernizedCProgram.warning(ModernizedCProgram._("Negative patterns are ignored in git attributes\nUse '\\!' for literal leading exclamation."));
					;
				} 
		} 
		res.setIs_macro(is_macro);
		res.setNum_attr(num_attr);
		for (; cp; /* Second pass to fill the attr_states */i++) {
			cp = ModernizedCProgram.parse_attr(src, lineno, cp, (generatedState[i]));
		}
		pattern.strbuf_release();
		return res;
		ModernizedCProgram.free(res);
		return ((Object)0/*
		 * Like info/exclude and .gitignore, the attribute information can
		 * come from many places.
		 *
		 * (1) .gitattributes file of the same directory;
		 * (2) .gitattributes file of the parent directory if (1) does not have
		 *      any match; this goes recursively upwards, just like .gitignore.
		 * (3) $GIT_DIR/info/attributes, which overrides both of the above.
		 *
		 * In the same file, later entries override the earlier match, so in the
		 * global list, we would have entries from info/attributes the earliest
		 * (reading the file from top to bottom), .gitattributes of the root
		 * directory (again, reading the file from top to bottom) down to the
		 * current directory, and then scan the list backwards to find the first match.
		 * This is exactly the same as what is_excluded() does in dir.c to deal with
		 * .gitignore file and info/excludes file as a fallback.
		 */);
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
	public byte getIs_macro() {
		return is_macro;
	}
	public void setIs_macro(byte newIs_macro) {
		is_macro = newIs_macro;
	}
	public int getNum_attr() {
		return num_attr;
	}
	public void setNum_attr(int newNum_attr) {
		num_attr = newNum_attr;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
}
/*
 * Reallocate and reinitialize the array of all attributes (which is used in
 * the attribute collection process) in 'check' based on the global dictionary
 * of attributes.
 */
