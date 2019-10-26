package application;

public class files_ref_store {
	private ref_store base;
	private int store_flags;
	private Byte gitdir;
	private Byte gitcommondir;
	private ref_cache loose;
	private ref_store packed_ref_store;
	
	public files_ref_store(ref_store base, int store_flags, Byte gitdir, Byte gitcommondir, ref_cache loose, ref_store packed_ref_store) {
		setBase(base);
		setStore_flags(store_flags);
		setGitdir(gitdir);
		setGitcommondir(gitcommondir);
		setLoose(loose);
		setPacked_ref_store(packed_ref_store);
	}
	public files_ref_store() {
	}
	
	public void clear_loose_ref_cache() {
		ref_cache generatedLoose = this.getLoose();
		if (generatedLoose) {
			generatedLoose.free_ref_cache();
			this.setLoose(((Object)0/*
			 * Create a new submodule ref cache and add it to the internal
			 * set of caches.
			 */));
		} 
	}
	public void files_assert_main_repository(Object caller) {
		int generatedStore_flags = this.getStore_flags();
		if (generatedStore_flags & (1 << 3)) {
			return ;
		} 
		ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\files-backend.c", 125, "operation %s only allowed for main ref store", caller/*
		 * Downcast ref_store to files_ref_store. Die if ref_store is not a
		 * files_ref_store. required_flags is compared with ref_store's
		 * store_flags to ensure the ref_store has all required capabilities.
		 * "caller" is used in any necessary error messages.
		 */);
	}
	public files_ref_store files_downcast(ref_store ref_store, int required_flags, Object caller) {
		files_ref_store refs = new files_ref_store();
		Object generatedBe = ref_store.getBe();
		if (generatedBe != ModernizedCProgram.refs_be_files) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\files-backend.c", 142, "ref_store is type \"%s\" not \"files\" in %s", generatedBe.getName(), caller);
		} 
		refs = (files_ref_store)ref_store;
		int generatedStore_flags = refs.getStore_flags();
		if ((generatedStore_flags & required_flags) != required_flags) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\files-backend.c", 148, "operation %s requires abilities 0x%x, but only have 0x%x", caller, required_flags, generatedStore_flags);
		} 
		return refs;
	}
	public void try_remove_empty_parents(Object refname, int flags) {
		strbuf buf = new strbuf(, , );
		strbuf sb = new strbuf(, , );
		byte p;
		byte q;
		int i;
		buf.strbuf_addstr(refname);
		byte generatedBuf = buf.getBuf();
		p = generatedBuf;
		for (i = 0; i < 2; /* refs/{heads,tags,...}/ */i++) {
			while (p && p != (byte)'/') {
				p++;
			}
			while (p == /* tolerate duplicate slashes; see check_refname_format() */(byte)'/') {
				p++;
			}
		}
		Object generatedLen = buf.getLen();
		q = generatedBuf + generatedLen;
		while (flags & (.REMOVE_EMPTY_PARENTS_REF | .REMOVE_EMPTY_PARENTS_REFLOG)) {
			while (q > p && q != (byte)'/') {
				q--;
			}
			while (q > p && (q - 1) == (byte)'/') {
				q--;
			}
			if (q == p) {
				break;
			} 
			buf.strbuf_setlen(q - generatedBuf);
			sb.strbuf_setlen(0);
			ModernizedCProgram.files_ref_path(refs, sb, generatedBuf);
			if ((flags & .REMOVE_EMPTY_PARENTS_REF) && .rmdir(generatedBuf)) {
				flags &=  ~.REMOVE_EMPTY_PARENTS_REF;
			} 
			sb.strbuf_setlen(0);
			ModernizedCProgram.files_reflog_path(refs, sb, generatedBuf);
			if ((flags & .REMOVE_EMPTY_PARENTS_REFLOG) && .rmdir(generatedBuf)) {
				flags &=  ~.REMOVE_EMPTY_PARENTS_REFLOG;
			} 
		}
		buf.strbuf_release();
		sb.strbuf_release();
	}
	public int rename_tmp_log(Object newrefname) {
		strbuf path = new strbuf(, , );
		strbuf tmp = new strbuf(, , );
		rename_cb cb = new rename_cb();
		int ret;
		ModernizedCProgram.files_reflog_path(refs, path, newrefname);
		ModernizedCProgram.files_reflog_path(refs, tmp, "refs/.tmp-renamed-log");
		byte generatedBuf = tmp.getBuf();
		cb.setTmp_renamed_log(generatedBuf);
		ret = ModernizedCProgram.raceproof_create_file(generatedBuf, rename_tmp_log_callback, cb);
		if (ret) {
			if ((._errno()) == 21) {
				();
			} else {
					();
			} 
		} 
		path.strbuf_release();
		tmp.strbuf_release();
		return ret;
	}
	public ref_store getBase() {
		return base;
	}
	public void setBase(ref_store newBase) {
		base = newBase;
	}
	public int getStore_flags() {
		return store_flags;
	}
	public void setStore_flags(int newStore_flags) {
		store_flags = newStore_flags;
	}
	public Byte getGitdir() {
		return gitdir;
	}
	public void setGitdir(Byte newGitdir) {
		gitdir = newGitdir;
	}
	public Byte getGitcommondir() {
		return gitcommondir;
	}
	public void setGitcommondir(Byte newGitcommondir) {
		gitcommondir = newGitcommondir;
	}
	public ref_cache getLoose() {
		return loose;
	}
	public void setLoose(ref_cache newLoose) {
		loose = newLoose;
	}
	public ref_store getPacked_ref_store() {
		return packed_ref_store;
	}
	public void setPacked_ref_store(ref_store newPacked_ref_store) {
		packed_ref_store = newPacked_ref_store;
	}
}
