package application;

/* Enable untracked file cache if set */
public class untracked_cache {
	private oid_stat ss_info_exclude;
	private oid_stat ss_excludes_file;
	private Object exclude_per_dir;
	private strbuf ident;
	private int dir_flags;
	private untracked_cache_dir root;
	private int dir_created;
	private int gitignore_invalidated;
	private int dir_invalidated;
	private int dir_opened;
	private int use_fsmonitor;
	
	public untracked_cache(oid_stat ss_info_exclude, oid_stat ss_excludes_file, Object exclude_per_dir, strbuf ident, int dir_flags, untracked_cache_dir root, int dir_created, int gitignore_invalidated, int dir_invalidated, int dir_opened, int use_fsmonitor) {
		setSs_info_exclude(ss_info_exclude);
		setSs_excludes_file(ss_excludes_file);
		setExclude_per_dir(exclude_per_dir);
		setIdent(ident);
		setDir_flags(dir_flags);
		setRoot(root);
		setDir_created(dir_created);
		setGitignore_invalidated(gitignore_invalidated);
		setDir_invalidated(dir_invalidated);
		setDir_opened(dir_opened);
		setUse_fsmonitor(use_fsmonitor);
	}
	public untracked_cache() {
	}
	
	public void set_untracked_ident() {
		strbuf generatedIdent = this.getIdent();
		generatedIdent.strbuf_setlen(0);
		generatedIdent.strbuf_addstr(ModernizedCProgram.get_ident_string());
		generatedIdent.strbuf_addch(0);
	}
	public void free_untracked_cache() {
		untracked_cache_dir generatedRoot = this.getRoot();
		if (uc) {
			generatedRoot.free_untracked();
		} 
		ModernizedCProgram.free(uc);
	}
	public untracked_cache read_untracked_extension(Object data, long sz) {
		untracked_cache uc = new untracked_cache();
		read_data rd = new read_data();
		byte next = data;
		byte end = (byte)data + sz;
		byte ident;
		int ident_len;
		ssize_t len = new ssize_t();
		byte exclude_per_dir;
		int hashsz = ModernizedCProgram.the_repository.getHash_algo().getRawsz();
		int offset = ;
		int exclude_per_dir_offset = offset + 2 * hashsz;
		if (sz <= 1 || end[-1] != (byte)'\0') {
			return ((Object)0);
		} 
		end--;
		ident_len = ModernizedCProgram.decode_varint(next);
		if (next + ident_len > end) {
			return ((Object)0);
		} 
		ident = (byte)next;
		next += ident_len;
		if (next + exclude_per_dir_offset + 1 > end) {
			return ((Object)0);
		} 
		uc = ModernizedCProgram.xcalloc(1, );
		strbuf generatedIdent = uc.getIdent();
		generatedIdent.strbuf_init(ident_len);
		generatedIdent.strbuf_add(ident, ident_len);
		oid_stat generatedSs_info_exclude = uc.getSs_info_exclude();
		generatedSs_info_exclude.load_oid_stat(next + ((size_t)((ondisk_untracked_cache)0).getInfo_exclude_stat()), next + offset);
		oid_stat generatedSs_excludes_file = uc.getSs_excludes_file();
		generatedSs_excludes_file.load_oid_stat(next + ((size_t)((ondisk_untracked_cache)0).getExcludes_file_stat()), next + offset + hashsz);
		uc.setDir_flags(.get_be32(next + ((size_t)((ondisk_untracked_cache)0).getDir_flags())));
		exclude_per_dir = (byte)next + exclude_per_dir_offset;
		uc.setExclude_per_dir(ModernizedCProgram.xstrdup(exclude_per_dir));
		next += exclude_per_dir_offset + .strlen(exclude_per_dir) + /* NUL after exclude_per_dir is covered by sizeof(*ouc) */1;
		if (next >= end) {
			;
		} 
		len = ModernizedCProgram.decode_varint(next);
		if (next > end || len == 0) {
			;
		} 
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		rd.setValid(ewah_bitmap.ewah_new());
		rd.setCheck_only(ewah_bitmap.ewah_new());
		rd.setSha1_valid(ewah_bitmap.ewah_new());
		rd.setData(next);
		rd.setEnd(end);
		rd.setIndex(0);
		untracked_cache_dir generatedUcd = rd.getUcd();
		(generatedUcd) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(, (len)));
		untracked_cache_dir generatedRoot = uc.getRoot();
		int generatedIndex = rd.getIndex();
		if (ModernizedCProgram.read_one_dir(generatedRoot, rd) || generatedIndex != len) {
			;
		} 
		Object generatedData = rd.getData();
		next = generatedData;
		ewah_bitmap generatedValid = rd.getValid();
		len = generatedValid.ewah_read_mmap(next, end - next);
		if (len < 0) {
			;
		} 
		next += len;
		ewah_bitmap generatedCheck_only = rd.getCheck_only();
		len = generatedCheck_only.ewah_read_mmap(next, end - next);
		if (len < 0) {
			;
		} 
		next += len;
		ewah_bitmap generatedSha1_valid = rd.getSha1_valid();
		len = generatedSha1_valid.ewah_read_mmap(next, end - next);
		if (len < 0) {
			;
		} 
		generatedCheck_only.ewah_each_bit(set_check_only, rd);
		rd.setData(next + len);
		generatedValid.ewah_each_bit(read_stat, rd);
		generatedSha1_valid.ewah_each_bit(read_oid, rd);
		next = generatedData;
		generatedValid.ewah_free();
		generatedCheck_only.ewah_free();
		generatedSha1_valid.ewah_free();
		return uc;
	}
	public oid_stat getSs_info_exclude() {
		return ss_info_exclude;
	}
	public void setSs_info_exclude(oid_stat newSs_info_exclude) {
		ss_info_exclude = newSs_info_exclude;
	}
	public oid_stat getSs_excludes_file() {
		return ss_excludes_file;
	}
	public void setSs_excludes_file(oid_stat newSs_excludes_file) {
		ss_excludes_file = newSs_excludes_file;
	}
	public Object getExclude_per_dir() {
		return exclude_per_dir;
	}
	public void setExclude_per_dir(Object newExclude_per_dir) {
		exclude_per_dir = newExclude_per_dir;
	}
	public strbuf getIdent() {
		return ident;
	}
	public void setIdent(strbuf newIdent) {
		ident = newIdent;
	}
	public int getDir_flags() {
		return dir_flags;
	}
	public void setDir_flags(int newDir_flags) {
		dir_flags = newDir_flags;
	}
	public untracked_cache_dir getRoot() {
		return root;
	}
	public void setRoot(untracked_cache_dir newRoot) {
		root = newRoot;
	}
	public int getDir_created() {
		return dir_created;
	}
	public void setDir_created(int newDir_created) {
		dir_created = newDir_created;
	}
	public int getGitignore_invalidated() {
		return gitignore_invalidated;
	}
	public void setGitignore_invalidated(int newGitignore_invalidated) {
		gitignore_invalidated = newGitignore_invalidated;
	}
	public int getDir_invalidated() {
		return dir_invalidated;
	}
	public void setDir_invalidated(int newDir_invalidated) {
		dir_invalidated = newDir_invalidated;
	}
	public int getDir_opened() {
		return dir_opened;
	}
	public void setDir_opened(int newDir_opened) {
		dir_opened = newDir_opened;
	}
	public int getUse_fsmonitor() {
		return use_fsmonitor;
	}
	public void setUse_fsmonitor(int newUse_fsmonitor) {
		use_fsmonitor = newUse_fsmonitor;
	}
}
