package application;

/* rename/copy similarity minimum (50%) */
/* minimum for break to happen (50%) */
/* maximum for break-merge to happen (60%) */
/* do not break a file smaller than this */
public class diff_filespec {
	private object_id oid;
	private Byte path;
	private Object data;
	private Object cnt_data;
	private long size;
	private int count;
	private int rename_used;
	private int mode;
	private int oid_valid;
	private int should_free;
	private int should_munmap;
	private int dirty_submodule;
	private int is_stdin;
	private int has_more_entries;
	private int is_binary;
	private userdiff_driver driver;
	
	public diff_filespec(object_id oid, Byte path, Object data, Object cnt_data, long size, int count, int rename_used, int mode, int oid_valid, int should_free, int should_munmap, int dirty_submodule, int is_stdin, int has_more_entries, int is_binary, userdiff_driver driver) {
		setOid(oid);
		setPath(path);
		setData(data);
		setCnt_data(cnt_data);
		setSize(size);
		setCount(count);
		setRename_used(rename_used);
		setMode(mode);
		setOid_valid(oid_valid);
		setShould_free(should_free);
		setShould_munmap(should_munmap);
		setDirty_submodule(dirty_submodule);
		setIs_stdin(is_stdin);
		setHas_more_entries(has_more_entries);
		setIs_binary(is_binary);
		setDriver(driver);
	}
	public diff_filespec() {
	}
	
	public int find_rename_dst() {
		int first;
		int last;
		first = 0;
		last = ModernizedCProgram.rename_dst_nr;
		Byte generatedPath = this.getPath();
		while (last > first) {
			int next = first + ((last - first) >> 1);
			diff_rename_dst dst = (rename_dst[next]);
			int cmp = .strcmp(generatedPath, generatedPath);
			if (!cmp) {
				return next;
			} 
			if (cmp < 0) {
				last = next;
				continue;
			} 
			first = next + 1;
		}
		return -first - 1;
	}
	public int add_rename_dst() {
		int first = two.find_rename_dst();
		if (first >= 0) {
			return -1;
		} 
		first = -first - 1;
		do {
			if ((ModernizedCProgram.rename_dst_nr + 1) > ModernizedCProgram.rename_dst_alloc) {
				if ((((ModernizedCProgram.rename_dst_alloc) + 16) * 3 / 2) < (ModernizedCProgram.rename_dst_nr + 1)) {
					ModernizedCProgram.rename_dst_alloc = (ModernizedCProgram.rename_dst_nr + 1);
				} else {
						ModernizedCProgram.rename_dst_alloc = (((ModernizedCProgram.rename_dst_alloc) + 16) * 3 / 2);
				} 
				(rename_dst) = ModernizedCProgram.xrealloc((rename_dst), ModernizedCProgram.st_mult(, (ModernizedCProgram.rename_dst_alloc)));
			} 
		} while (/* insert to make it at "first" */0);
		ModernizedCProgram.rename_dst_nr++;
		if (first < ModernizedCProgram.rename_dst_nr) {
			ModernizedCProgram.move_array((rename_dst + first + 1), (rename_dst + first), (ModernizedCProgram.rename_dst_nr - first - 1),  + ( - 1));
		} 
		Byte generatedPath = this.getPath();
		rename_dst[first].setTwo(.alloc_filespec(generatedPath));
		object_id generatedOid = this.getOid();
		int generatedOid_valid = this.getOid_valid();
		int generatedMode = this.getMode();
		.fill_filespec(rename_dst[first].getTwo(), generatedOid, generatedOid_valid, generatedMode);
		rename_dst[first].setPair(((Object)0));
		return 0;
	}
	public int basename_same(diff_filespec dst) {
		Byte generatedPath = this.getPath();
		int src_len = .strlen(generatedPath);
		int dst_len = .strlen(generatedPath);
		while (src_len && dst_len) {
			byte c1 = generatedPath[--src_len];
			byte c2 = generatedPath[--dst_len];
			if (c1 != c2) {
				return 0;
			} 
			if (c1 == (byte)'/') {
				return 1;
			} 
		}
		return (!src_len || generatedPath[src_len - 1] == (byte)'/') && (!dst_len || generatedPath[dst_len - 1] == (byte)'/');
	}
	public int populate_from_stdin() {
		strbuf buf = new strbuf(, , );
		size_t size = 0;
		if (buf.strbuf_read(0, 0) < 0) {
			return ();
		} 
		this.setShould_munmap(0);
		this.setData(buf.strbuf_detach(size));
		this.setSize(size);
		this.setShould_free(1);
		this.setIs_stdin(1);
		return 0;
	}
	public diff_filespec noindex_filespec(Object name, int mode) {
		diff_filespec s = new diff_filespec();
		if (!name) {
			name = "/dev/null";
		} 
		s = .alloc_filespec(name);
		.fill_filespec(s, ModernizedCProgram.null_oid, 0, mode);
		if (name == ModernizedCProgram.file_from_standard_input) {
			s.populate_from_stdin();
		} 
		return s;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getCnt_data() {
		return cnt_data;
	}
	public void setCnt_data(Object newCnt_data) {
		cnt_data = newCnt_data;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getRename_used() {
		return rename_used;
	}
	public void setRename_used(int newRename_used) {
		rename_used = newRename_used;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public int getOid_valid() {
		return oid_valid;
	}
	public void setOid_valid(int newOid_valid) {
		oid_valid = newOid_valid;
	}
	public int getShould_free() {
		return should_free;
	}
	public void setShould_free(int newShould_free) {
		should_free = newShould_free;
	}
	public int getShould_munmap() {
		return should_munmap;
	}
	public void setShould_munmap(int newShould_munmap) {
		should_munmap = newShould_munmap;
	}
	public int getDirty_submodule() {
		return dirty_submodule;
	}
	public void setDirty_submodule(int newDirty_submodule) {
		dirty_submodule = newDirty_submodule;
	}
	public int getIs_stdin() {
		return is_stdin;
	}
	public void setIs_stdin(int newIs_stdin) {
		is_stdin = newIs_stdin;
	}
	public int getHas_more_entries() {
		return has_more_entries;
	}
	public void setHas_more_entries(int newHas_more_entries) {
		has_more_entries = newHas_more_entries;
	}
	public int getIs_binary() {
		return is_binary;
	}
	public void setIs_binary(int newIs_binary) {
		is_binary = newIs_binary;
	}
	public userdiff_driver getDriver() {
		return driver;
	}
	public void setDriver(userdiff_driver newDriver) {
		driver = newDriver;
	}
}
