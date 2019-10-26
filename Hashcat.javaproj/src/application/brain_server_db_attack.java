package application;

public class brain_server_db_attack {
	private Object brain_attack;
	private brain_server_attack_short short_buf;
	private Object short_alloc;
	private Object short_cnt;
	private brain_server_attack_long long_buf;
	private Object long_alloc;
	private Object long_cnt;
	private int ab;
	private Object mux_ar;
	private Object mux_ag;
	private Object write_attacks;
	
	public brain_server_db_attack(Object brain_attack, brain_server_attack_short short_buf, Object short_alloc, Object short_cnt, brain_server_attack_long long_buf, Object long_alloc, Object long_cnt, int ab, Object mux_ar, Object mux_ag, Object write_attacks) {
		setBrain_attack(brain_attack);
		setShort_buf(short_buf);
		setShort_alloc(short_alloc);
		setShort_cnt(short_cnt);
		setLong_buf(long_buf);
		setLong_alloc(long_alloc);
		setLong_cnt(long_cnt);
		setAb(ab);
		setMux_ar(mux_ar);
		setMux_ag(mux_ag);
		setWrite_attacks(write_attacks);
	}
	public brain_server_db_attack() {
	}
	
	public void brain_server_db_attack_init(Object brain_attack) {
		this.setBrain_attack(brain_attack);
		this.setAb(0);
		this.setShort_cnt(0);
		this.setShort_buf(((Object)0));
		this.setShort_alloc(0);
		this.setLong_cnt(0);
		this.setLong_buf(((Object)0));
		this.setLong_alloc(0);
		this.setWrite_attacks(0);
		this.setMux_ar(.CreateMutexA(((Object)0), 0, ((Object)0)));
		this.setMux_ag(.CreateMutexA(((Object)0), 0, ((Object)0)));
	}
	public boolean brain_server_db_attack_realloc(Object new_long_cnt, Object new_short_cnt) {
		Object generatedLong_cnt = this.getLong_cnt();
		Object generatedLong_alloc = this.getLong_alloc();
		brain_server_attack_long generatedLong_buf = this.getLong_buf();
		if ((generatedLong_cnt + new_long_cnt) > generatedLong_alloc) {
			i64 realloc_size_total = (i64)ModernizedCProgram.mydivc64((u64)new_long_cnt, (u64)ModernizedCProgram.BRAIN_SERVER_REALLOC_ATTACK_SIZE) * ModernizedCProgram.BRAIN_SERVER_REALLOC_ATTACK_SIZE;
			brain_server_attack_long_t long_buf = (brain_server_attack_long_t)ModernizedCProgram.hcrealloc(generatedLong_buf, generatedLong_alloc * , realloc_size_total * );
			if (long_buf == ((Object)0)) {
				return 0;
			} 
			this.setLong_buf(long_buf);
			generatedLong_alloc += realloc_size_total;
		} 
		Object generatedShort_cnt = this.getShort_cnt();
		Object generatedShort_alloc = this.getShort_alloc();
		brain_server_attack_short generatedShort_buf = this.getShort_buf();
		if ((generatedShort_cnt + new_short_cnt) > generatedShort_alloc) {
			i64 realloc_size_total = (i64)ModernizedCProgram.mydivc64((u64)new_short_cnt, (u64)ModernizedCProgram.BRAIN_SERVER_REALLOC_ATTACK_SIZE) * ModernizedCProgram.BRAIN_SERVER_REALLOC_ATTACK_SIZE;
			brain_server_attack_short_t short_buf = (brain_server_attack_short_t)ModernizedCProgram.hcrealloc(generatedShort_buf, generatedShort_alloc * , realloc_size_total * );
			if (short_buf == ((Object)0)) {
				return 0;
			} 
			this.setShort_buf(short_buf);
			generatedShort_alloc += realloc_size_total;
		} 
		return 1;
	}
	public void brain_server_db_attack_free() {
		Object generatedMux_ag = this.getMux_ag();
		.CloseHandle(generatedMux_ag);
		Object generatedMux_ar = this.getMux_ar();
		.CloseHandle(generatedMux_ar);
		brain_server_attack_long generatedLong_buf = this.getLong_buf();
		ModernizedCProgram.hcfree(generatedLong_buf);
		brain_server_attack_short generatedShort_buf = this.getShort_buf();
		ModernizedCProgram.hcfree(generatedShort_buf);
		this.setAb(0);
		this.setLong_cnt(0);
		this.setLong_buf(((Object)0));
		this.setLong_alloc(0);
		this.setShort_cnt(0);
		this.setShort_buf(((Object)0));
		this.setShort_alloc(0);
		this.setBrain_attack(0);
		this.setWrite_attacks(0);
	}
	public boolean brain_server_read_attack_dump(Object file) {
		hc_timer_t timer_dump = new hc_timer_t();
		ModernizedCProgram.hc_timer_set(timer_dump)// read from file;// read from file
		stat sb = new stat();
		.memset(sb, 0, );
		if (.stat(file, sb) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, .strerror((._errno())));
			return 0;
		} 
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen(file, "rb") == 0) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, .strerror((._errno())));
			return 0;
		} 
		Object generatedSt_size = sb.getSt_size();
		i64 temp_cnt = (u64)generatedSt_size / ;
		if (brain_server_db_attack.brain_server_db_attack_realloc(temp_cnt, 0) == 0) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			fp.hc_fclose();
			return 0;
		} 
		brain_server_attack_long generatedLong_buf = this.getLong_buf();
		size_t nread = fp.hc_fread(generatedLong_buf, , temp_cnt);
		if (nread != (size_t)temp_cnt) {
			(_iob[2]).brain_logging(0, "%s: only %I64u bytes read\n", file, (u64)nread * );
			fp.hc_fclose();
			return 0;
		} 
		this.setLong_cnt(temp_cnt);
		this.setWrite_attacks(0);
		fp.hc_fclose();
		double ms = ModernizedCProgram.hc_timer_get(timer_dump);
		Object generatedBrain_attack = this.getBrain_attack();
		(_iob[1]).brain_logging(0, "Read %I64u bytes from attack 0x%08x in %.2f ms\n", (u64)generatedSt_size, generatedBrain_attack, ms);
		return 1;
	}
	public boolean brain_server_write_attack_dump(Object file) {
		Object generatedWrite_attacks = this.getWrite_attacks();
		if (generatedWrite_attacks == 0) {
			return 1;
		} 
		hc_timer_t timer_dump = new hc_timer_t();
		ModernizedCProgram.hc_timer_set(timer_dump)// write to file;// write to file
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen(file, "wb") == 0) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, .strerror((._errno())));
			return 0;
		} 
		brain_server_attack_long generatedLong_buf = this.getLong_buf();
		Object generatedLong_cnt = this.getLong_cnt();
		// storing should not include reserved attacks only finishedsize_t nwrite = fp.hc_fwrite(generatedLong_buf, , generatedLong_cnt);
		if (nwrite != (size_t)generatedLong_cnt) {
			(_iob[2]).brain_logging(0, "%s: only %I64u bytes written\n", file, (u64)nwrite * );
			fp.hc_fclose();
			return 0;
		} 
		fp.hc_fclose();
		this.setWrite_attacks(0)// stats;// stats
		double ms = ModernizedCProgram.hc_timer_get(timer_dump);
		stat sb = new stat();
		.memset(sb, 0, );
		if (.stat(file, sb) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", file, .strerror((._errno())));
			return 0;
		} 
		Object generatedSt_size = sb.getSt_size();
		Object generatedBrain_attack = this.getBrain_attack();
		(_iob[1]).brain_logging(0, "Wrote %I64u bytes from attack 0x%08x in %.2f ms\n", (u64)generatedSt_size, generatedBrain_attack, ms);
		return 1;
	}
	public Object getBrain_attack() {
		return brain_attack;
	}
	public void setBrain_attack(Object newBrain_attack) {
		brain_attack = newBrain_attack;
	}
	public brain_server_attack_short getShort_buf() {
		return short_buf;
	}
	public void setShort_buf(brain_server_attack_short newShort_buf) {
		short_buf = newShort_buf;
	}
	public Object getShort_alloc() {
		return short_alloc;
	}
	public void setShort_alloc(Object newShort_alloc) {
		short_alloc = newShort_alloc;
	}
	public Object getShort_cnt() {
		return short_cnt;
	}
	public void setShort_cnt(Object newShort_cnt) {
		short_cnt = newShort_cnt;
	}
	public brain_server_attack_long getLong_buf() {
		return long_buf;
	}
	public void setLong_buf(brain_server_attack_long newLong_buf) {
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
	public int getAb() {
		return ab;
	}
	public void setAb(int newAb) {
		ab = newAb;
	}
	public Object getMux_ar() {
		return mux_ar;
	}
	public void setMux_ar(Object newMux_ar) {
		mux_ar = newMux_ar;
	}
	public Object getMux_ag() {
		return mux_ag;
	}
	public void setMux_ag(Object newMux_ag) {
		mux_ag = newMux_ag;
	}
	public Object getWrite_attacks() {
		return write_attacks;
	}
	public void setWrite_attacks(Object newWrite_attacks) {
		write_attacks = newWrite_attacks;
	}
}
