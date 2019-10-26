package application;

// Next AutoPat in AutoPat list; MUST
public class AutoPat {
	private AutoPat next;
	private Object pat;
	private regprog reg_prog;
	private AutoCmd cmds;
	private int group;
	private int patlen;
	private int buflocal_nr;
	private byte allow_dirs;
	private byte last;
	
	public AutoPat(AutoPat next, Object pat, regprog reg_prog, AutoCmd cmds, int group, int patlen, int buflocal_nr, byte allow_dirs, byte last) {
		setNext(next);
		setPat(pat);
		setReg_prog(reg_prog);
		setCmds(cmds);
		setGroup(group);
		setPatlen(patlen);
		setBuflocal_nr(buflocal_nr);
		setAllow_dirs(allow_dirs);
		setLast(last);
	}
	public AutoPat() {
	}
	
	public void show_autocmd(auto_event event) {
		AutoCmd ac = new AutoCmd();
		// Check for "got_int" (here and at various places below), which is set
		// when "q" has been hit for the "--more--" promptif (got_int) {
			return ;
		} 
		// pattern has been removedif (ModernizedCProgram.ap.getPat() == ((Object)0)) {
			return ;
		} 
		ModernizedCProgram.msg_putchar((byte)'\n');
		if (got_int) {
			return ;
		} 
		if (event != ModernizedCProgram.last_event || ModernizedCProgram.ap.getGroup() != ModernizedCProgram.last_group) {
			if (ModernizedCProgram.ap.getGroup() != -1) {
				if ((((char_u)ModernizedCProgram.augroups.getGa_data())[ModernizedCProgram.ap.getGroup()]) == ((Object)0)) {
					ModernizedCProgram.msg_puts_attr((byte)ModernizedCProgram.get_deleted_augroup(), ModernizedCProgram.highlight_attr[(int)(.HLF_E)]);
				} else {
						ModernizedCProgram.msg_puts_attr((byte)(((char_u)ModernizedCProgram.augroups.getGa_data())[ModernizedCProgram.ap.getGroup()]), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
				} 
				ModernizedCProgram.msg_puts("  ");
			} 
			ModernizedCProgram.msg_puts_attr((byte)ModernizedCProgram.event_nr2name(event), ModernizedCProgram.highlight_attr[(int)(.HLF_T)]);
			ModernizedCProgram.last_event = event;
			ModernizedCProgram.last_group = ModernizedCProgram.ap.getGroup();
			ModernizedCProgram.msg_putchar((byte)'\n');
			if (got_int) {
				return ;
			} 
		} 
		ModernizedCProgram.msg_col = 4;
		ModernizedCProgram.msg_outtrans(ModernizedCProgram.ap.getPat());
		Object generatedCmd = ac.getCmd();
		 generatedScript_ctx = ac.getScript_ctx();
		AutoCmd generatedNext = ac.getNext();
		for (ac = ModernizedCProgram.ap.getCmds(); ac != ((Object)0); ac = generatedNext) {
			if (generatedCmd != ((Object)0)) {
				if (ModernizedCProgram.msg_col >= 14) {
					ModernizedCProgram.msg_putchar((byte)'\n');
				} 
				ModernizedCProgram.msg_col = 14;
				if (got_int) {
					return ;
				} 
				ModernizedCProgram.msg_outtrans(generatedCmd);
				if (ModernizedCProgram.p_verbose > 0) {
					generatedScript_ctx.last_set_msg();
				} 
				if (got_int) {
					return ;
				} 
				if (generatedNext != ((Object)0)) {
					ModernizedCProgram.msg_putchar((byte)'\n');
					if (got_int) {
						return ;
					} 
				} 
			} 
		}
	}
	/*
	 * Mark an autocommand pattern for deletion.
	 */
	public void au_remove_pat() {
		do {
			if ((ModernizedCProgram.ap.getPat()) != ((Object)0)) {
				ModernizedCProgram.vim_free(ModernizedCProgram.ap.getPat());
				(ModernizedCProgram.ap.getPat()) = ((Object)0);
			} 
		} while (0);
		ModernizedCProgram.ap.setBuflocal_nr(-1);
		ModernizedCProgram.au_need_clean = 1/*
		 * Mark all commands for a pattern for deletion.
		 */;
	}
	public void au_remove_cmds() {
		AutoCmd ac = new AutoCmd();
		Object generatedCmd = ac.getCmd();
		AutoCmd generatedNext = ac.getNext();
		for (ac = ModernizedCProgram.ap.getCmds(); ac != ((Object)0); ac = generatedNext) {
			do {
				if ((generatedCmd) != ((Object)0)) {
					ModernizedCProgram.vim_free(generatedCmd);
					(generatedCmd) = ((Object)0);
				} 
			} while (0);
		}
		ModernizedCProgram.au_need_clean = 1;
	}
	public AutoPat getNext() {
		return next;
	}
	public void setNext(AutoPat newNext) {
		next = newNext;
	}
	public Object getPat() {
		return pat;
	}
	public void setPat(Object newPat) {
		pat = newPat;
	}
	public regprog getReg_prog() {
		return reg_prog;
	}
	public void setReg_prog(regprog newReg_prog) {
		reg_prog = newReg_prog;
	}
	public AutoCmd getCmds() {
		return cmds;
	}
	public void setCmds(AutoCmd newCmds) {
		cmds = newCmds;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int newGroup) {
		group = newGroup;
	}
	public int getPatlen() {
		return patlen;
	}
	public void setPatlen(int newPatlen) {
		patlen = newPatlen;
	}
	public int getBuflocal_nr() {
		return buflocal_nr;
	}
	public void setBuflocal_nr(int newBuflocal_nr) {
		buflocal_nr = newBuflocal_nr;
	}
	public byte getAllow_dirs() {
		return allow_dirs;
	}
	public void setAllow_dirs(byte newAllow_dirs) {
		allow_dirs = newAllow_dirs;
	}
	public byte getLast() {
		return last;
	}
	public void setLast(byte newLast) {
		last = newLast;
	}
}
// be the first entry.
