package application;

public class brain_server_db_hash {
	private Object brain_session;
	private brain_server_hash_long long_buf;
	private Object long_alloc;
	private Object long_cnt;
	private int hb;
	private Object mux_hr;
	private Object mux_hg;
	private Object write_hashes;
	
	public brain_server_db_hash(Object brain_session, brain_server_hash_long long_buf, Object long_alloc, Object long_cnt, int hb, Object mux_hr, Object mux_hg, Object write_hashes) {
		setBrain_session(brain_session);
		setLong_buf(long_buf);
		setLong_alloc(long_alloc);
		setLong_cnt(long_cnt);
		setHb(hb);
		setMux_hr(mux_hr);
		setMux_hg(mux_hg);
		setWrite_hashes(write_hashes);
	}
	public brain_server_db_hash() {
	}
	
	public void brain_server_db_hash_init(Object brain_session) {
		this.setBrain_session(brain_session);
		this.setHb(0);
		this.setLong_cnt(0);
		this.setLong_buf((null));
		this.setLong_alloc(0);
		this.setWrite_hashes(0);
		this.setMux_hr(/*Error: Function owner not recognized*/CreateMutexA((null), 0, (null)));
		this.setMux_hg(/*Error: Function owner not recognized*/CreateMutexA((null), 0, (null)));
	}
	public boolean brain_server_db_hash_realloc(Object new_long_cnt) {
		Object generatedLong_cnt = this.getLong_cnt();
		Object generatedLong_alloc = this.getLong_alloc();
		brain_server_hash_long generatedLong_buf = this.getLong_buf();
		if ((generatedLong_cnt + new_long_cnt) > generatedLong_alloc) {
			i64 realloc_size_total = (i64)ModernizedCProgram.mydivc64((u64)new_long_cnt, (u64)ModernizedCProgram.BRAIN_SERVER_REALLOC_HASH_SIZE) * ModernizedCProgram.BRAIN_SERVER_REALLOC_HASH_SIZE;
			brain_server_hash_long_t long_buf = (brain_server_hash_long_t)ModernizedCProgram.hcrealloc(generatedLong_buf, generatedLong_alloc * /*Error: Unsupported expression*/, realloc_size_total * /*Error: Unsupported expression*/);
			if (long_buf == (null)) {
				return 0;
			} 
			this.setLong_buf(long_buf);
			generatedLong_alloc += realloc_size_total;
		} 
		return 1;
	}
	public void brain_server_db_hash_free() {
		Object generatedMux_hg = this.getMux_hg();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(generatedMux_hg);
		Object generatedMux_hr = this.getMux_hr();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(generatedMux_hr);
		brain_server_hash_long generatedLong_buf = this.getLong_buf();
		ModernizedCProgram.hcfree(generatedLong_buf);
		this.setHb(0);
		this.setLong_cnt(0);
		this.setLong_buf((null));
		this.setLong_alloc(0);
		this.setWrite_hashes(0);
		this.setBrain_session(0);
	}
	public boolean brain_server_read_hash_dump(Object file) {
		hc_timer_t timer_dump = new hc_timer_t();
		ModernizedCProgram.hc_timer_set(timer_dump)// read from file;// read from file
		stat sb = new stat();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(sb, 0, /*Error: Unsupported expression*/);
		if (/*Error: Function owner not recognized*/stat(file, sb) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen(file, "rb") == 0) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		Object generatedSt_size = sb.getSt_size();
		i64 temp_cnt = (u64)generatedSt_size / /*Error: Unsupported expression*/;
		if (brain_server_db_hash.brain_server_db_hash_realloc(temp_cnt) == 0) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			fp.hc_fclose();
			return 0;
		} 
		brain_server_hash_long generatedLong_buf = this.getLong_buf();
		size_t nread = fp.hc_fread(generatedLong_buf, /*Error: Unsupported expression*/, temp_cnt);
		if (nread != (size_t)temp_cnt) {
			(_iob[2]).brain_logging(0, "%s: only %I64u bytes read\n", file, (u64)nread * /*Error: Unsupported expression*/);
			fp.hc_fclose();
			return 0;
		} 
		this.setLong_cnt(temp_cnt);
		this.setWrite_hashes(0);
		fp.hc_fclose();
		double ms = ModernizedCProgram.hc_timer_get(timer_dump);
		Object generatedBrain_session = this.getBrain_session();
		(_iob[1]).brain_logging(0, "Read %I64u bytes from session 0x%08x in %.2f ms\n", (u64)generatedSt_size, generatedBrain_session, ms);
		return 1;
	}
	public boolean brain_server_write_hash_dump(Object file) {
		Object generatedWrite_hashes = this.getWrite_hashes();
		if (generatedWrite_hashes == 0) {
			return 1;
		} 
		hc_timer_t timer_dump = new hc_timer_t();
		ModernizedCProgram.hc_timer_set(timer_dump)// write to file;// write to file
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen(file, "wb") == 0) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		brain_server_hash_long generatedLong_buf = this.getLong_buf();
		Object generatedLong_cnt = this.getLong_cnt();
		size_t nwrite = fp.hc_fwrite(generatedLong_buf, /*Error: Unsupported expression*/, generatedLong_cnt);
		if (nwrite != (size_t)generatedLong_cnt) {
			(_iob[2]).brain_logging(0, "%s: only %I64u bytes written\n", file, (u64)nwrite * /*Error: Unsupported expression*/);
			fp.hc_fclose();
			return 0;
		} 
		fp.hc_fclose();
		this.setWrite_hashes(0)// stats;// stats
		double ms = ModernizedCProgram.hc_timer_get(timer_dump);
		stat sb = new stat();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(sb, 0, /*Error: Unsupported expression*/);
		if (/*Error: Function owner not recognized*/stat(file, sb) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		Object generatedSt_size = sb.getSt_size();
		Object generatedBrain_session = this.getBrain_session();
		(_iob[1]).brain_logging(0, "Wrote %I64u bytes from session 0x%08x in %.2f ms\n", (u64)generatedSt_size, generatedBrain_session, ms);
		return 1;
	}
	public Object getBrain_session() {
		return brain_session;
	}
	public void setBrain_session(Object newBrain_session) {
		brain_session = newBrain_session;
	}
	public brain_server_hash_long getLong_buf() {
		return long_buf;
	}
	public void setLong_buf(brain_server_hash_long newLong_buf) {
		long_buf = newLong_buf;
	}
	public Object getLong_alloc() {
		return long_alloc;
	}
	public void setLong_alloc(Object newLong_alloc) {
		long_alloc = newLong_alloc;
	}
	public Object getLong_cnt() {
		return long_cnt;
	}
	public void setLong_cnt(Object newLong_cnt) {
		long_cnt = newLong_cnt;
	}
	public int getHb() {
		return hb;
	}
	public void setHb(int newHb) {
		hb = newHb;
	}
	public Object getMux_hr() {
		return mux_hr;
	}
	public void setMux_hr(Object newMux_hr) {
		mux_hr = newMux_hr;
	}
	public Object getMux_hg() {
		return mux_hg;
	}
	public void setMux_hg(Object newMux_hg) {
		mux_hg = newMux_hg;
	}
	public Object getWrite_hashes() {
		return write_hashes;
	}
	public void setWrite_hashes(Object newWrite_hashes) {
		write_hashes = newWrite_hashes;
	}
}
