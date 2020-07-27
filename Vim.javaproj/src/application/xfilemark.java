package application;

// Xtended file mark: also has a file name
public class xfilemark {
	private filemark fmark;
	private Object[] fname;
	
	public xfilemark(filemark fmark, Object[] fname) {
		setFmark(fmark);
		setFname(fname);
	}
	public xfilemark() {
	}
	
	public void fname2fnum() {
		char_u p = new char_u();
		Object[] generatedFname = this.getFname();
		file_buffer file_buffer = new file_buffer();
		if (generatedFname != ((Object)0/*
			 * First expand "~/" in the file name to the home directory.
			 * Don't expand the whole name, it may contain other '~' chars.
			 */)) {
			if (generatedFname[0] == (byte)'~' && (generatedFname[1] == (byte)'/' || generatedFname[1] == (byte)'\\')) {
				int len;
				ModernizedCProgram.expand_env((char_u)"~/", ModernizedCProgram.NameBuff, 1024);
				len = (int)/*Error: Function owner not recognized*/strlen((byte)(ModernizedCProgram.NameBuff));
				ModernizedCProgram.vim_strncpy(ModernizedCProgram.NameBuff + len, generatedFname + 2, 1024 - len - 1);
			} else {
					ModernizedCProgram.vim_strncpy(ModernizedCProgram.NameBuff, generatedFname, 1024 - 1);
			} 
			ModernizedCProgram.mch_dirname(ModernizedCProgram.IObuff, (1024 + /* Try to shorten the file name. */1));
			p = ModernizedCProgram.shorten_fname(ModernizedCProgram.NameBuff, ModernizedCProgram.IObuff);
			(Object)file_buffer.buflist_new(ModernizedCProgram.NameBuff, p, (linenr_T)1, /* buflist_new() will call fmarks_check_names() */0/*
			 * Check all file marks for a name that matches the file name in buf.
			 * May replace the name with an fnum.
			 * Used for marks that come from the .viminfo file.
			 */);
		} 
	}
	/*
	 * Return a pointer to the named file marks.
	 */
	public xfilemark get_namedfm() {
		return ModernizedCProgram.namedfm;
	}
	public filemark getFmark() {
		return fmark;
	}
	public void setFmark(filemark newFmark) {
		fmark = newFmark;
	}
	public Object[] getFname() {
		return fname;
	}
	public void setFname(Object[] newFname) {
		fname = newFname;
	}
}
