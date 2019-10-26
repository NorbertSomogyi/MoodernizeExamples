package application;

public class syn_pattern {
	private byte sp_type;
	private byte sp_syncing;
	private int sp_syn_match_id;
	private int sp_off_flags;
	private Object sp_offsets;
	private int sp_flags;
	private int sp_cchar;
	private int sp_ic;
	private int sp_sync_idx;
	private int sp_line_id;
	private int sp_startcol;
	private Integer sp_cont_list;
	private Integer sp_next_list;
	private sp_syn sp_syn;
	private Object sp_pattern;
	private regprog sp_prog;
	private  sp_time;
	
	public syn_pattern(byte sp_type, byte sp_syncing, int sp_syn_match_id, int sp_off_flags, Object sp_offsets, int sp_flags, int sp_cchar, int sp_ic, int sp_sync_idx, int sp_line_id, int sp_startcol, Integer sp_cont_list, Integer sp_next_list, sp_syn sp_syn, Object sp_pattern, regprog sp_prog,  sp_time) {
		setSp_type(sp_type);
		setSp_syncing(sp_syncing);
		setSp_syn_match_id(sp_syn_match_id);
		setSp_off_flags(sp_off_flags);
		setSp_offsets(sp_offsets);
		setSp_flags(sp_flags);
		setSp_cchar(sp_cchar);
		setSp_ic(sp_ic);
		setSp_sync_idx(sp_sync_idx);
		setSp_line_id(sp_line_id);
		setSp_startcol(sp_startcol);
		setSp_cont_list(sp_cont_list);
		setSp_next_list(sp_next_list);
		setSp_syn(sp_syn);
		setSp_pattern(sp_pattern);
		setSp_prog(sp_prog);
		setSp_time(sp_time);
	}
	public syn_pattern() {
	}
	
	public void put_pattern(Byte s, int c, int attr) {
		long n;
		int mask;
		int first;
		byte sepchars = "/+=-#@\"|'^&";
		int i;
		int generatedSp_syn_match_id = this.getSp_syn_match_id();
		if (ModernizedCProgram.last_matchgroup != generatedSp_syn_match_id) {
			ModernizedCProgram.last_matchgroup = generatedSp_syn_match_id;
			ModernizedCProgram.msg_puts_attr("matchgroup", attr);
			ModernizedCProgram.msg_putchar((byte)'=');
			if (ModernizedCProgram.last_matchgroup == 0) {
				ModernizedCProgram.msg_outtrans((char_u)"NONE");
			} else {
					ModernizedCProgram.msg_outtrans(ModernizedCProgram.highlight_group_name(ModernizedCProgram.last_matchgroup - 1));
			} 
			ModernizedCProgram.msg_putchar((byte)' ');
		} 
		ModernizedCProgram.msg_puts_attr(s, /* output the name of the pattern and an '=' or ' ' */attr);
		ModernizedCProgram.msg_putchar(c);
		Object generatedSp_pattern = this.getSp_pattern();
		for (i = 0; ModernizedCProgram.vim_strchr(generatedSp_pattern, sepchars[i]) != ((Object)/* output the pattern, in between a char that is not in the pattern */0); ) {
			if (sepchars[++i] == (byte)'\000') {
				i = /* no good char found, just use the first one */0;
				break;
			} 
		}
		ModernizedCProgram.msg_putchar(sepchars[i]);
		ModernizedCProgram.msg_outtrans(generatedSp_pattern);
		ModernizedCProgram.msg_putchar(sepchars[i]);
		first = /* output any pattern options */1;
		int generatedSp_off_flags = this.getSp_off_flags();
		Object generatedSp_offsets = this.getSp_offsets();
		for (i = 0; i < 7; ++i) {
			mask = (1 << i);
			if (generatedSp_off_flags & (mask + (mask << 7))) {
				if (!first) {
					ModernizedCProgram.msg_putchar(/* separate with commas */(byte)',');
				} 
				ModernizedCProgram.msg_puts(ModernizedCProgram.spo_name_tab[i]);
				n = generatedSp_offsets[i];
				if (i != 6) {
					if (generatedSp_off_flags & mask) {
						ModernizedCProgram.msg_putchar((byte)'s');
					} else {
							ModernizedCProgram.msg_putchar((byte)'e');
					} 
					if (n > 0) {
						ModernizedCProgram.msg_putchar((byte)'+');
					} 
				} 
				if (n || i == 6) {
					ModernizedCProgram.msg_outnum(n);
				} 
				first = 0;
			} 
		}
		ModernizedCProgram.msg_putchar((byte)' '/*
		 * List or clear the keywords for one syntax group.
		 * Return TRUE if the header has been printed.
		 */);
	}
	public Object get_syn_pattern(Object arg) {
		char_u end = new char_u();
		int p;
		int idx;
		char_u cpo_save = new char_u();
		if (arg == ((Object)0) || arg[0] == (byte)'\000' || arg[1] == (byte)'\000' || arg[2] == /* need at least three chars */(byte)'\000') {
			return ((Object)0);
		} 
		end = ModernizedCProgram.skip_regexp(arg + 1, arg, 1, ((Object)0));
		if (end != /* end delimiter not found */arg) {
			ModernizedCProgram.semsg(((byte)("E401: Pattern delimiter not found: %s")), arg);
			return ((Object)0);
		} 
		if ((this.setSp_pattern(ModernizedCProgram.vim_strnsave(arg + 1, (int)(end - arg - 1)))) == ((Object)/* store the pattern and compiled regexp program */0)) {
			return ((Object)0);
		} 
		cpo_save = /* Make 'cpoptions' empty, to avoid the 'l' flag */ModernizedCProgram.p_cpo;
		ModernizedCProgram.p_cpo = (char_u)"";
		Object generatedSp_pattern = this.getSp_pattern();
		regprog regprog = new regprog();
		this.setSp_prog(regprog.vim_regcomp(generatedSp_pattern, 1));
		ModernizedCProgram.p_cpo = cpo_save;
		regprog generatedSp_prog = this.getSp_prog();
		if (generatedSp_prog == ((Object)0)) {
			return ((Object)0);
		} 
		this.setSp_ic(ModernizedCProgram.curwin.getW_s().getB_syn_ic());
		 generatedSp_time = this.getSp_time();
		generatedSp_time.syn_clear_time();
		++/*
		     * Check for a match, highlight or region offset.
		     */end;
		Object generatedSp_offsets = this.getSp_offsets();
		int generatedSp_off_flags = this.getSp_off_flags();
		do {
			for (idx = 7; --idx >= 0; ) {
				if (.strncmp((byte)(end), (byte)(ModernizedCProgram.spo_name_tab[idx]), (size_t)(true)) == 0) {
					break;
				} 
			}
			if (idx >= 0) {
				p = (generatedSp_offsets[idx]);
				if (idx != 6) {
					switch (end[3]) {
					case (byte)'e':
							idx += 7;
							break;
					case (byte)'b':
							break;
					case (byte)'s':
							break;
					default:
							idx = -1;
							break;
					}
				} 
				if (idx >= 0) {
					generatedSp_off_flags |=  (1 << idx);
					if (idx == /* lc=99 */6) {
						end += 3;
						p = ModernizedCProgram.getdigits(end);
						if (!(generatedSp_off_flags & (1 << /* "lc=" offset automatically sets "ms=" offset */0))) {
							generatedSp_off_flags |=  (1 << 0);
							generatedSp_offsets[0] = p;
						} 
					} else {
							end += /* yy=x+99 */4;
							if (end == (byte)'+') {
								++end;
								p = ModernizedCProgram.getdigits(/* positive offset */end);
							}  else if (end == (byte)'-') {
								++end;
								p = -ModernizedCProgram.getdigits(/* negative offset */end);
							} 
					} 
					if (end != (byte)',') {
						break;
					} 
					++end;
				} 
			} 
		} while (idx >= 0);
		if (!ModernizedCProgram.ends_excmd(end) && !((end) == (byte)' ' || (end) == (byte)'\t')) {
			ModernizedCProgram.semsg(((byte)("E402: Garbage after pattern: %s")), arg);
			return ((Object)0);
		} 
		return ModernizedCProgram.skipwhite(end/*
		 * Handle ":syntax sync .." command.
		 */);
	}
	public byte getSp_type() {
		return sp_type;
	}
	public void setSp_type(byte newSp_type) {
		sp_type = newSp_type;
	}
	public byte getSp_syncing() {
		return sp_syncing;
	}
	public void setSp_syncing(byte newSp_syncing) {
		sp_syncing = newSp_syncing;
	}
	public int getSp_syn_match_id() {
		return sp_syn_match_id;
	}
	public void setSp_syn_match_id(int newSp_syn_match_id) {
		sp_syn_match_id = newSp_syn_match_id;
	}
	public int getSp_off_flags() {
		return sp_off_flags;
	}
	public void setSp_off_flags(int newSp_off_flags) {
		sp_off_flags = newSp_off_flags;
	}
	public Object getSp_offsets() {
		return sp_offsets;
	}
	public void setSp_offsets(Object newSp_offsets) {
		sp_offsets = newSp_offsets;
	}
	public int getSp_flags() {
		return sp_flags;
	}
	public void setSp_flags(int newSp_flags) {
		sp_flags = newSp_flags;
	}
	public int getSp_cchar() {
		return sp_cchar;
	}
	public void setSp_cchar(int newSp_cchar) {
		sp_cchar = newSp_cchar;
	}
	public int getSp_ic() {
		return sp_ic;
	}
	public void setSp_ic(int newSp_ic) {
		sp_ic = newSp_ic;
	}
	public int getSp_sync_idx() {
		return sp_sync_idx;
	}
	public void setSp_sync_idx(int newSp_sync_idx) {
		sp_sync_idx = newSp_sync_idx;
	}
	public int getSp_line_id() {
		return sp_line_id;
	}
	public void setSp_line_id(int newSp_line_id) {
		sp_line_id = newSp_line_id;
	}
	public int getSp_startcol() {
		return sp_startcol;
	}
	public void setSp_startcol(int newSp_startcol) {
		sp_startcol = newSp_startcol;
	}
	public Integer getSp_cont_list() {
		return sp_cont_list;
	}
	public void setSp_cont_list(Integer newSp_cont_list) {
		sp_cont_list = newSp_cont_list;
	}
	public Integer getSp_next_list() {
		return sp_next_list;
	}
	public void setSp_next_list(Integer newSp_next_list) {
		sp_next_list = newSp_next_list;
	}
	public sp_syn getSp_syn() {
		return sp_syn;
	}
	public void setSp_syn(sp_syn newSp_syn) {
		sp_syn = newSp_syn;
	}
	public Object getSp_pattern() {
		return sp_pattern;
	}
	public void setSp_pattern(Object newSp_pattern) {
		sp_pattern = newSp_pattern;
	}
	public regprog getSp_prog() {
		return sp_prog;
	}
	public void setSp_prog(regprog newSp_prog) {
		sp_prog = newSp_prog;
	}
	public  getSp_time() {
		return sp_time;
	}
	public void setSp_time( newSp_time) {
		sp_time = newSp_time;
	}
}
