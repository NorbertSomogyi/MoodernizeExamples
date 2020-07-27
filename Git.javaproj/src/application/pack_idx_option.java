package application;

/* "\377tOc" */
public class pack_idx_option {
	private int flags;
	private Object version;
	private Object off32_limit;
	private int anomaly_alloc;
	private int anomaly_nr;
	private Object[] anomaly;
	
	public pack_idx_option(int flags, Object version, Object off32_limit, int anomaly_alloc, int anomaly_nr, Object[] anomaly) {
		setFlags(flags);
		setVersion(version);
		setOff32_limit(off32_limit);
		setAnomaly_alloc(anomaly_alloc);
		setAnomaly_nr(anomaly_nr);
		setAnomaly(anomaly);
	}
	public pack_idx_option() {
	}
	
	public void read_idx_option(Object pack_name) {
		packed_git packed_git = new packed_git();
		packed_git p = packed_git.add_packed_git(pack_name, /*Error: Function owner not recognized*/strlen(pack_name), 1);
		if (!p) {
			ModernizedCProgram.die(ModernizedCProgram._("Cannot open existing pack file '%s'"), pack_name);
		} 
		if (p.open_pack_index()) {
			ModernizedCProgram.die(ModernizedCProgram._("Cannot open existing pack idx file for '%s'"), pack_name);
		} 
		int generatedIndex_version = p.getIndex_version();
		this.setVersion(generatedIndex_version);
		Object generatedVersion = this.getVersion();
		if (generatedVersion == 2) {
			ModernizedCProgram.read_v2_anomalous_offsets(p, opts/*
				 * Get rid of the idx file as we do not need it anymore.
				 * NEEDSWORK: extract this bit from free_pack_by_name() in
				 * sha1-file.c, perhaps?  It shouldn't matter very much as we
				 * know we haven't installed this pack (hence we never have
				 * read anything from it).
				 */);
		} 
		p.close_pack_index();
		ModernizedCProgram.free(p);
	}
	public void reset_pack_idx_option() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(opts, 0, /*Error: sizeof expression not supported yet*/);
		this.setVersion(2);
		this.setOff32_limit(-1024);
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getOff32_limit() {
		return off32_limit;
	}
	public void setOff32_limit(Object newOff32_limit) {
		off32_limit = newOff32_limit;
	}
	public int getAnomaly_alloc() {
		return anomaly_alloc;
	}
	public void setAnomaly_alloc(int newAnomaly_alloc) {
		anomaly_alloc = newAnomaly_alloc;
	}
	public int getAnomaly_nr() {
		return anomaly_nr;
	}
	public void setAnomaly_nr(int newAnomaly_nr) {
		anomaly_nr = newAnomaly_nr;
	}
	public Object[] getAnomaly() {
		return anomaly;
	}
	public void setAnomaly(Object[] newAnomaly) {
		anomaly = newAnomaly;
	}
}
