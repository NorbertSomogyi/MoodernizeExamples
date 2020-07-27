package application;

public class dir_iterator_int {
	private dir_iterator base;
	private Object levels_nr;
	private Object levels_alloc;
	private dir_iterator_level[] levels;
	private int flags;
	
	public dir_iterator_int(dir_iterator base, Object levels_nr, Object levels_alloc, dir_iterator_level[] levels, int flags) {
		setBase(base);
		setLevels_nr(levels_nr);
		setLevels_alloc(levels_alloc);
		setLevels(levels);
		setFlags(flags);
	}
	public dir_iterator_int() {
	}
	
	public int push_level() {
		dir_iterator_level level = new dir_iterator_level();
		Object generatedLevels_nr = this.getLevels_nr();
		Object generatedLevels_alloc = this.getLevels_alloc();
		dir_iterator_level[] generatedLevels = this.getLevels();
		do {
			if ((generatedLevels_nr + 1) > generatedLevels_alloc) {
				if ((((generatedLevels_alloc) + 16) * 3 / 2) < (generatedLevels_nr + 1)) {
					this.setLevels_alloc((generatedLevels_nr + 1));
				} else {
						this.setLevels_alloc((((generatedLevels_alloc) + 16) * 3 / 2));
				} 
				(generatedLevels) = ModernizedCProgram.xrealloc((generatedLevels), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedLevels_alloc)));
			} 
		} while (0);
		level = generatedLevels[generatedLevels_nr++];
		dir_iterator generatedBase = this.getBase();
		strbuf generatedPath = generatedBase.getPath();
		byte[] generatedBuf = generatedPath.getBuf();
		Object generatedLen = generatedPath.getLen();
		if (!ModernizedCProgram.git_is_dir_sep(generatedBuf[generatedLen - 1])) {
			generatedPath.strbuf_addch((byte)'/');
		} 
		level.setPrefix_len(generatedLen);
		level.setDir(ModernizedCProgram.opendir(generatedBuf));
		 generatedDir = level.getDir();
		if (!generatedDir) {
			int saved_errno = (/*Error: Function owner not recognized*/_errno());
			if ((/*Error: Function owner not recognized*/_errno()) != 2) {
				ModernizedCProgram.warning_errno("error opening directory '%s'", generatedBuf);
			} 
			generatedLevels_nr--;
			(/*Error: Function owner not recognized*/_errno()) = saved_errno;
			return -1;
		} 
		return 0/*
		 * Pop the top level on the iter stack, releasing any resources associated
		 * with it. Return the new value of iter->levels_nr.
		 */;
	}
	public int pop_level() {
		dir_iterator_level[] generatedLevels = this.getLevels();
		Object generatedLevels_nr = this.getLevels_nr();
		dir_iterator_level level = generatedLevels[generatedLevels_nr - 1];
		 generatedDir = level.getDir();
		dir_iterator generatedBase = this.getBase();
		strbuf generatedPath = generatedBase.getPath();
		byte[] generatedBuf = generatedPath.getBuf();
		if (generatedDir && generatedDir.closedir()) {
			ModernizedCProgram.warning_errno("error closing directory '%s'", generatedBuf);
		} 
		level.setDir(((Object)0));
		return --generatedLevels_nr;
	}
	public dir_iterator getBase() {
		return base;
	}
	public void setBase(dir_iterator newBase) {
		base = newBase;
	}
	public Object getLevels_nr() {
		return levels_nr;
	}
	public void setLevels_nr(Object newLevels_nr) {
		levels_nr = newLevels_nr;
	}
	public Object getLevels_alloc() {
		return levels_alloc;
	}
	public void setLevels_alloc(Object newLevels_alloc) {
		levels_alloc = newLevels_alloc;
	}
	public dir_iterator_level[] getLevels() {
		return levels;
	}
	public void setLevels(dir_iterator_level[] newLevels) {
		levels = newLevels;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
