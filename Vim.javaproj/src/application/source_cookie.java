package application;

/*
 * Structure used to store info for each sourced file.
 * It is shared between do_source() and getsourceline().
 * This is required, because it needs to be handed to do_cmdline() and
 * sourcing can be done recursively.
 */
public class source_cookie {
	private _iobuf fp;
	private Object nextline;
	private Object sourcing_lnum;
	private int finished;
	private int fileformat;
	private int error;
	private Object breakpoint;
	private Object fname;
	private int dbg_tick;
	private int level;
	private  conv;
	
	public source_cookie(_iobuf fp, Object nextline, Object sourcing_lnum, int finished, int fileformat, int error, Object breakpoint, Object fname, int dbg_tick, int level,  conv) {
		setFp(fp);
		setNextline(nextline);
		setSourcing_lnum(sourcing_lnum);
		setFinished(finished);
		setFileformat(fileformat);
		setError(error);
		setBreakpoint(breakpoint);
		setFname(fname);
		setDbg_tick(dbg_tick);
		setLevel(level);
		setConv(conv);
	}
	public source_cookie() {
	}
	
	public Object get_one_sourceline() {
		garray_T ga = new garray_T();
		int len;
		int c;
		char_u buf = new char_u();
		// CR-LF foundint has_cr;
		int have_read = 0;
		// use a growarray to store the sourced line// use a growarray to store the sourced linega.ga_init2(1, 250);
		// Loop until there is a finished line (or end-of-file).// Loop until there is a finished line (or end-of-file).++ModernizedCProgram.sp.getSourcing_lnum();
		Object generatedGa_data = ga.getGa_data();
		int generatedGa_len = ga.getGa_len();
		int generatedGa_maxlen = ga.getGa_maxlen();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			if (ga.ga_grow(120) == 0) {
				break;
			} 
			buf = (char_u)generatedGa_data;
			if (/*Error: Function owner not recognized*/fgets((byte)buf + generatedGa_len, generatedGa_maxlen - generatedGa_len, ModernizedCProgram.sp.getFp()) == ((Object)0)) {
				break;
			} 
			len = generatedGa_len + (int)/*Error: Function owner not recognized*/strlen((byte)(buf + generatedGa_len));
			if ((len == 1 || (len >= 2 && buf[len - 2] == (byte)'\n')) && ModernizedCProgram.sp.getFileformat() == 1 && buf[len - 1] == 26) {
				buf[len - 1] = (byte)'\000';
				break;
			} 
			have_read = 1;
			ga.setGa_len(len);
			if (generatedGa_maxlen - generatedGa_len == 1 && buf[len - 1] != (byte)'\n') {
				continue;
			} 
			if (len >= 1 && buf[len - 1] == (byte)'\n') {
				has_cr = (len >= 2 && buf[len - 2] == (byte)'\r');
				if (ModernizedCProgram.sp.getFileformat() == -1) {
					if (has_cr) {
						ModernizedCProgram.sp.setFileformat(1);
					} else {
							ModernizedCProgram.sp.setFileformat(0);
					} 
				} 
				if (ModernizedCProgram.sp.getFileformat() == 1) {
					if (has_cr) {
						buf[len - 2] = (byte)'\n';
						--len;
						--generatedGa_len;
					} else {
							if (!ModernizedCProgram.sp.getError()) {
								ModernizedCProgram.msg_source(ModernizedCProgram.highlight_attr[(int)(.HLF_W)]);
								ModernizedCProgram.emsg(((byte)("W15: Warning: Wrong line separator, ^M may be missing")));
							} 
							ModernizedCProgram.sp.setError(1);
							ModernizedCProgram.sp.setFileformat(0);
					} 
				} 
				for (c = len - 2; c >= 0 && buf[c] == 22; c--) {
					;
				}
				if ((len & 1) != (c & 1)) {
					++ModernizedCProgram.sp.getSourcing_lnum();
					continue;
				} 
				buf[len - 1] = (byte)'\000';
			} 
			ModernizedCProgram.line_breakcheck();
			break;
		}
		if (have_read) {
			return (char_u)generatedGa_data;
		} 
		ModernizedCProgram.vim_free(generatedGa_data);
		return ((Object)0/*
		 * Get one full line from a sourced file.
		 * Called by do_cmdline() when it's called from do_source().
		 *
		 * Return a pointer to the line in allocated memory.
		 * Return NULL for end-of-file or some error.
		 */);
	}
	public _iobuf getFp() {
		return fp;
	}
	public void setFp(_iobuf newFp) {
		fp = newFp;
	}
	public Object getNextline() {
		return nextline;
	}
	public void setNextline(Object newNextline) {
		nextline = newNextline;
	}
	public Object getSourcing_lnum() {
		return sourcing_lnum;
	}
	public void setSourcing_lnum(Object newSourcing_lnum) {
		sourcing_lnum = newSourcing_lnum;
	}
	public int getFinished() {
		return finished;
	}
	public void setFinished(int newFinished) {
		finished = newFinished;
	}
	public int getFileformat() {
		return fileformat;
	}
	public void setFileformat(int newFileformat) {
		fileformat = newFileformat;
	}
	public int getError() {
		return error;
	}
	public void setError(int newError) {
		error = newError;
	}
	public Object getBreakpoint() {
		return breakpoint;
	}
	public void setBreakpoint(Object newBreakpoint) {
		breakpoint = newBreakpoint;
	}
	public Object getFname() {
		return fname;
	}
	public void setFname(Object newFname) {
		fname = newFname;
	}
	public int getDbg_tick() {
		return dbg_tick;
	}
	public void setDbg_tick(int newDbg_tick) {
		dbg_tick = newDbg_tick;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public  getConv() {
		return conv;
	}
	public void setConv( newConv) {
		conv = newConv;
	}
}
