package application;

// default autocmd group
// erroneous autocmd group
// all autocmd groups
/*
 * struct used to keep status while executing autocommands for an event.
 */
// chain of active apc-s for auto-invalidation
public class AutoPatCmd {
	private AutoPat curpat;
	private AutoCmd nextcmd;
	private int group;
	private Object fname;
	private Object sfname;
	private Object tail;
	private auto_event event;
	private int arg_bufnr;
	private AutoPatCmd next;
	
	public AutoPatCmd(AutoPat curpat, AutoCmd nextcmd, int group, Object fname, Object sfname, Object tail, auto_event event, int arg_bufnr, AutoPatCmd next) {
		setCurpat(curpat);
		setNextcmd(nextcmd);
		setGroup(group);
		setFname(fname);
		setSfname(sfname);
		setTail(tail);
		setEvent(event);
		setArg_bufnr(arg_bufnr);
		setNext(next);
	}
	public AutoPatCmd() {
	}
	
	public void auto_next_pat(int stop_at_last) {
		// stop when 'last' flag is setAutoPat ap = new AutoPat();
		AutoCmd cp = new AutoCmd();
		char_u name = new char_u();
		byte s;
		do {
			if ((sourcing_name) != ((Object)0)) {
				ModernizedCProgram.vim_free(sourcing_name);
				(sourcing_name) = ((Object)0);
			} 
		} while (0);
		Object generatedPat = ap.getPat();
		AutoCmd generatedCmds = ap.getCmds();
		int generatedGroup = this.getGroup();
		int generatedBuflocal_nr = ap.getBuflocal_nr();
		regprog generatedReg_prog = ap.getReg_prog();
		Object generatedFname = this.getFname();
		Object generatedSfname = this.getSfname();
		Object generatedTail = this.getTail();
		byte generatedAllow_dirs = ap.getAllow_dirs();
		int generatedArg_bufnr = this.getArg_bufnr();
		auto_event generatedEvent = this.getEvent();
		int generatedPatlen = ap.getPatlen();
		AutoCmd generatedNext = cp.getNext();
		AutoPat generatedCurpat = this.getCurpat();
		byte generatedLast = ap.getLast();
		for (ap = generatedCurpat; ap != ((Object)0) && !got_int; ap = generatedNext) {
			this.setCurpat(((Object)0));
			if (generatedPat != ((Object)0) && generatedCmds != ((Object)0) && (generatedGroup == -3 || generatedGroup == generatedGroup)) {
				if (generatedBuflocal_nr == 0 ? (generatedReg_prog.match_file_pat(((Object)0), generatedFname, generatedSfname, generatedTail, generatedAllow_dirs)) : generatedBuflocal_nr == generatedArg_bufnr) {
					name = ModernizedCProgram.event_nr2name(generatedEvent);
					s = ((byte)("%s Autocommands for \"%s\""));
					sourcing_name = ModernizedCProgram.alloc(/*Error: Function owner not recognized*/strlen((byte)(s)) + /*Error: Function owner not recognized*/strlen((byte)(name)) + generatedPatlen + 1);
					if (sourcing_name != ((Object)0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)sourcing_name, s, (byte)name, (byte)generatedPat);
						if (ModernizedCProgram.p_verbose >= 8) {
							ModernizedCProgram.verbose_enter();
							ModernizedCProgram.smsg(((byte)("Executing %s")), sourcing_name);
							ModernizedCProgram.verbose_leave();
						} 
					} 
					this.setCurpat(ap);
					this.setNextcmd(generatedCmds);
					for (cp = generatedCmds; generatedNext != ((Object)0); cp = generatedNext) {
						cp.setLast(0);
					}
					cp.setLast(1);
				} 
				ModernizedCProgram.line_breakcheck();
				if (generatedCurpat != ((Object)0)) {
					break;
				} 
			} 
			if (stop_at_last && generatedLast) {
				break;
			} 
		}
	}
	public AutoPat getCurpat() {
		return curpat;
	}
	public void setCurpat(AutoPat newCurpat) {
		curpat = newCurpat;
	}
	public AutoCmd getNextcmd() {
		return nextcmd;
	}
	public void setNextcmd(AutoCmd newNextcmd) {
		nextcmd = newNextcmd;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int newGroup) {
		group = newGroup;
	}
	public Object getFname() {
		return fname;
	}
	public void setFname(Object newFname) {
		fname = newFname;
	}
	public Object getSfname() {
		return sfname;
	}
	public void setSfname(Object newSfname) {
		sfname = newSfname;
	}
	public Object getTail() {
		return tail;
	}
	public void setTail(Object newTail) {
		tail = newTail;
	}
	public auto_event getEvent() {
		return event;
	}
	public void setEvent(auto_event newEvent) {
		event = newEvent;
	}
	public int getArg_bufnr() {
		return arg_bufnr;
	}
	public void setArg_bufnr(int newArg_bufnr) {
		arg_bufnr = newArg_bufnr;
	}
	public AutoPatCmd getNext() {
		return next;
	}
	public void setNext(AutoPatCmd newNext) {
		next = newNext;
	}
}
