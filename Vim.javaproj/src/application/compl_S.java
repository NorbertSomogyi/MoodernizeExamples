package application;

// Message for CTRL-X mode, index is ctrl_x_mode.
// CTRL_X_NORMAL, ^P/^N compl.
// CTRL_X_SCROLL: depends on state
// CTRL_X_FINISHED
// CTRL_X_EVAL doesn't use msg.
// CTRL_X_SCROLL
// CTRL_X_FINISHED
// CTRL_X_LOCAL_MSG only used in "ctrl_x_msgs"
// "abbr"
// "menu"
// "kind"
// "info"
// "user data"
// Number of entries
/*
 * Structure used to store one match for insert completion.
 */
public class compl_S {
	private compl_S cp_next;
	private compl_S cp_prev;
	private Object[] cp_str;
	private Object cp_text;
	private Object cp_fname;
	private int cp_flags;
	private int cp_number;
	
	public compl_S(compl_S cp_next, compl_S cp_prev, Object[] cp_str, Object cp_text, Object cp_fname, int cp_flags, int cp_number) {
		setCp_next(cp_next);
		setCp_prev(cp_prev);
		setCp_str(cp_str);
		setCp_text(cp_text);
		setCp_fname(cp_fname);
		setCp_flags(cp_flags);
		setCp_number(cp_number);
	}
	public compl_S() {
	}
	
	public int ins_compl_equal(Object str, int len) {
		int generatedCp_flags = this.getCp_flags();
		if (generatedCp_flags & 8) {
			return 1;
		} 
		Object[] generatedCp_str = this.getCp_str();
		if (generatedCp_flags & 16) {
			return ModernizedCProgram.vim_strnicmp((byte)(generatedCp_str), (byte)(str), (size_t)((size_t)len)) == 0;
		} 
		return /*Error: Function owner not recognized*/strncmp((byte)(generatedCp_str), (byte)(str), (size_t)((size_t)len)) == 0/*
		 * Reduce the longest common string for match "match".
		 */;
	}
	public void ins_compl_longest_match() {
		char_u p = new char_u();
		char_u s = new char_u();
		int c1;
		int c2;
		int had_match;
		Object[] generatedCp_str = this.getCp_str();
		int generatedCp_flags = this.getCp_flags();
		if (ModernizedCProgram.compl_leader == ((Object)0)) {
			ModernizedCProgram.compl_leader = ModernizedCProgram.vim_strsave(generatedCp_str);
			if (ModernizedCProgram.compl_leader != ((Object)0)) {
				had_match = (ModernizedCProgram.curwin.getW_cursor().getCol() > ModernizedCProgram.compl_col);
				ModernizedCProgram.ins_compl_delete();
				ModernizedCProgram.ins_bytes(ModernizedCProgram.compl_leader + ModernizedCProgram.ins_compl_len());
				ModernizedCProgram.ins_redraw(0);
				if (!had_match) {
					ModernizedCProgram.ins_compl_delete();
				} 
				ModernizedCProgram.compl_used_match = 0;
			} 
		} else {
				p = ModernizedCProgram.compl_leader;
				s = generatedCp_str;
				while (p != (byte)'\000') {
					if (has_mbyte) {
						c1 = /*Error: Function owner not recognized*/mb_ptr2char(p);
						c2 = /*Error: Function owner not recognized*/mb_ptr2char(s);
					} else {
							c1 = p;
							c2 = s;
					} 
					if ((generatedCp_flags & 16) ? (ModernizedCProgram.vim_tolower(c1) != ModernizedCProgram.vim_tolower(c2)) : (c1 != c2)) {
						break;
					} 
					if (has_mbyte) {
						p += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(p);
						s += /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(s);
					} else {
							++p;
							++s;
					} 
				}
				if (p != (byte)'\000') {
					p = (byte)'\000';
					had_match = (ModernizedCProgram.curwin.getW_cursor().getCol() > ModernizedCProgram.compl_col);
					ModernizedCProgram.ins_compl_delete();
					ModernizedCProgram.ins_bytes(ModernizedCProgram.compl_leader + ModernizedCProgram.ins_compl_len());
					ModernizedCProgram.ins_redraw(0);
					if (!had_match) {
						ModernizedCProgram.ins_compl_delete();
					} 
				} 
				ModernizedCProgram.compl_used_match = 0/*
				 * Add an array of matches to the list of matches.
				 * Frees matches[].
				 */;
		} 
	}
	public compl_S getCp_next() {
		return cp_next;
	}
	public void setCp_next(compl_S newCp_next) {
		cp_next = newCp_next;
	}
	public compl_S getCp_prev() {
		return cp_prev;
	}
	public void setCp_prev(compl_S newCp_prev) {
		cp_prev = newCp_prev;
	}
	public Object[] getCp_str() {
		return cp_str;
	}
	public void setCp_str(Object[] newCp_str) {
		cp_str = newCp_str;
	}
	public Object getCp_text() {
		return cp_text;
	}
	public void setCp_text(Object newCp_text) {
		cp_text = newCp_text;
	}
	public Object getCp_fname() {
		return cp_fname;
	}
	public void setCp_fname(Object newCp_fname) {
		cp_fname = newCp_fname;
	}
	public int getCp_flags() {
		return cp_flags;
	}
	public void setCp_flags(int newCp_flags) {
		cp_flags = newCp_flags;
	}
	public int getCp_number() {
		return cp_number;
	}
	public void setCp_number(int newCp_number) {
		cp_number = newCp_number;
	}
}
