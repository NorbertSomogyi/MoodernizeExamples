package application;

public class oid_stat {
	private stat_data stat;
	private object_id oid;
	private int valid;
	
	public oid_stat(stat_data stat, object_id oid, int valid) {
		setStat(stat);
		setOid(oid);
		setValid(valid);
	}
	public oid_stat() {
	}
	
	public int do_read_blob(Object oid, Object size_out, Byte data_out) {
		object_type type;
		long sz;
		byte data;
		size_out = 0;
		data_out = ((Object)0);
		data = ModernizedCProgram.the_repository.repo_read_object_file(oid, object_type.type, sz);
		if (!data || object_type.type != object_type.OBJ_BLOB) {
			ModernizedCProgram.free(data);
			return -1;
		} 
		stat_data generatedStat = this.getStat();
		object_id generatedOid = this.getOid();
		if (oid_stat) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedStat, 0, /*Error: sizeof expression not supported yet*/);
			generatedOid.oidcpy(oid);
		} 
		if (sz == 0) {
			ModernizedCProgram.free(data);
			return 0;
		} 
		if (data[sz - 1] != (byte)'\n') {
			data = ModernizedCProgram.xrealloc(data, ModernizedCProgram.st_add(sz, 1));
			data[sz++] = (byte)'\n';
		} 
		size_out = ModernizedCProgram.xsize_t(sz);
		data_out = data;
		return 1;
	}
	public int read_skip_worktree_file_from_index(Object istate, Object path, Object size_out, Byte data_out) {
		int pos;
		int len;
		len = /*Error: Function owner not recognized*/strlen(path);
		pos = ModernizedCProgram.index_name_pos(istate, path, len);
		if (pos < 0) {
			return -1;
		} 
		if (!((istate.getCache()[pos]).getCe_flags() & (1 << 30))) {
			return -1;
		} 
		return oid_stat.do_read_blob(istate.getCache()[pos].getOid(), size_out, data_out/*
		 * Frees memory within pl which was allocated for exclude patterns and
		 * the file buffer.  Does not free pl itself.
		 */);
	}
	public void load_oid_stat(Object data, Object sha1) {
		stat_data generatedStat = this.getStat();
		generatedStat.stat_data_from_disk(data);
		object_id generatedOid = this.getOid();
		Object generatedHash = generatedOid.getHash();
		ModernizedCProgram.hashcpy(generatedHash, sha1);
		this.setValid(1);
	}
	public stat_data getStat() {
		return stat;
	}
	public void setStat(stat_data newStat) {
		stat = newStat;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int newValid) {
		valid = newValid;
	}
}
