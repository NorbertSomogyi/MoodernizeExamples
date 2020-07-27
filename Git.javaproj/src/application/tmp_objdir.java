package application;

public class tmp_objdir {
	private strbuf path;
	private argv_array env;
	
	public tmp_objdir(strbuf path, argv_array env) {
		setPath(path);
		setEnv(env);
	}
	public tmp_objdir() {
	}
	
	public void tmp_objdir_free() {
		strbuf generatedPath = this.getPath();
		generatedPath.strbuf_release();
		argv_array generatedEnv = this.getEnv();
		generatedEnv.argv_array_clear();
		ModernizedCProgram.free(t);
	}
	public int tmp_objdir_destroy_1(int on_signal) {
		int err;
		if (!t) {
			return 0;
		} 
		if (t == ModernizedCProgram.the_tmp_objdir) {
			ModernizedCProgram.the_tmp_objdir = ((Object)0/*
				 * This may use malloc via strbuf_grow(), but we should
				 * have pre-grown t->path sufficiently so that this
				 * doesn't happen in practice.
				 */);
		} 
		strbuf generatedPath = this.getPath();
		err = generatedPath.remove_dir_recursively(0/*
			 * When we are cleaning up due to a signal, we won't bother
			 * freeing memory; it may cause a deadlock if the signal
			 * arrived while libc's allocator lock is held.
			 */);
		if (!on_signal) {
			t.tmp_objdir_free();
		} 
		return err;
	}
	public int tmp_objdir_destroy() {
		return t.tmp_objdir_destroy_1(0);
	}
	public tmp_objdir tmp_objdir_create() {
		int installed_handlers;
		tmp_objdir t = new tmp_objdir();
		if (ModernizedCProgram.the_tmp_objdir) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\tmp-objdir.c", 130, "only one tmp_objdir can be used at a time");
		} 
		t = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		strbuf generatedPath = t.getPath();
		generatedPath.strbuf_init(0);
		argv_array generatedEnv = t.getEnv();
		generatedEnv.argv_array_init();
		generatedPath.strbuf_addf("%s/incoming-XXXXXX", ModernizedCProgram.get_object_directory());
		generatedPath.strbuf_grow(1024);
		byte[] generatedBuf = generatedPath.getBuf();
		if (!/*Error: Function owner not recognized*/mkdtemp(generatedBuf)) {
			/* free, not destroy, as we never touched the filesystem */t.tmp_objdir_free();
			return ((Object)0);
		} 
		ModernizedCProgram.the_tmp_objdir = t;
		if (!installed_handlers) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/atexit(remove_tmp_objdir);
			ModernizedCProgram.sigchain_push_common(remove_tmp_objdir_on_signal);
			installed_handlers++;
		} 
		if (ModernizedCProgram.setup_tmp_objdir(generatedBuf)) {
			t.tmp_objdir_destroy();
			return ((Object)0);
		} 
		generatedEnv.env_append("GIT_ALTERNATE_OBJECT_DIRECTORIES", ModernizedCProgram.absolute_path(ModernizedCProgram.get_object_directory()));
		generatedEnv.env_replace("GIT_OBJECT_DIRECTORY", ModernizedCProgram.absolute_path(generatedBuf));
		generatedEnv.env_replace("GIT_QUARANTINE_PATH", ModernizedCProgram.absolute_path(generatedBuf));
		return t/*
		 * Make sure we copy packfiles and their associated metafiles in the correct
		 * order. All of these ends_with checks are slightly expensive to do in
		 * the midst of a sorting routine, but in practice it shouldn't matter.
		 * We will have a relatively small number of packfiles to order, and loose
		 * objects exit early in the first line.
		 */;
	}
	public int tmp_objdir_migrate() {
		strbuf src = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		strbuf dst = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int ret;
		if (!t) {
			return 0;
		} 
		strbuf generatedPath = this.getPath();
		src.strbuf_addbuf(generatedPath);
		dst.strbuf_addstr(ModernizedCProgram.get_object_directory());
		ret = src.migrate_paths(dst);
		src.strbuf_release();
		dst.strbuf_release();
		t.tmp_objdir_destroy();
		return ret;
	}
	public strbuf getPath() {
		return path;
	}
	public void setPath(strbuf newPath) {
		path = newPath;
	}
	public argv_array getEnv() {
		return env;
	}
	public void setEnv(argv_array newEnv) {
		env = newEnv;
	}
}
