package application;

public class unix_sockaddr_context {
	private Byte orig_dir;
	
	public unix_sockaddr_context(Byte orig_dir) {
		setOrig_dir(orig_dir);
	}
	public unix_sockaddr_context() {
	}
	
	public void unix_sockaddr_cleanup() {
		if (!ModernizedCProgram.ctx.getOrig_dir()) {
			return /*Error: Unsupported expression*/;
		} 
		if (/*Error: Function owner not recognized*/chdir(ModernizedCProgram.ctx.getOrig_dir()) < 0) {
			ModernizedCProgram.die("unable to restore original working directory");
		} 
		ModernizedCProgram.free(ModernizedCProgram.ctx.getOrig_dir());
	}
	public int unix_sockaddr_init(Object sa, Object path) {
		int size = /*Error: Function owner not recognized*/strlen(path) + 1;
		ModernizedCProgram.ctx.setOrig_dir(((Object)0));
		if (size > /*Error: sizeof expression not supported yet*/) {
			byte slash = ModernizedCProgram.git_find_last_dir_sep(path);
			byte dir;
			strbuf cwd = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			if (!slash) {
				(/*Error: Function owner not recognized*/_errno()) = 38;
				return -1;
			} 
			dir = path;
			path = slash + 1;
			size = /*Error: Function owner not recognized*/strlen(path) + 1;
			if (size > /*Error: sizeof expression not supported yet*/) {
				(/*Error: Function owner not recognized*/_errno()) = 38;
				return -1;
			} 
			if (cwd.strbuf_getcwd()) {
				return -1;
			} 
			ModernizedCProgram.ctx.setOrig_dir(cwd.strbuf_detach(((Object)0)));
			if (ModernizedCProgram.chdir_len(dir, slash - dir) < 0) {
				return -1;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(sa, 0, /*Error: sizeof expression not supported yet*/);
		sa.setSun_family(1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(sa.getSun_path(), path, size);
		return 0;
	}
	public Byte getOrig_dir() {
		return orig_dir;
	}
	public void setOrig_dir(Byte newOrig_dir) {
		orig_dir = newOrig_dir;
	}
}
