package application;

public class u_header {
	private  uh_next;
	private  uh_prev;
	private  uh_alt_next;
	private  uh_alt_prev;
	private long uh_seq;
	private int uh_walk;
	private u_entry uh_entry;
	private u_entry uh_getbot_entry;
	private  uh_cursor;
	private long uh_cursor_vcol;
	private int uh_flags;
	private Object uh_namedm;
	private  uh_visual;
	private Object uh_time;
	private long uh_save_nr;
	
	public u_header( uh_next,  uh_prev,  uh_alt_next,  uh_alt_prev, long uh_seq, int uh_walk, u_entry uh_entry, u_entry uh_getbot_entry,  uh_cursor, long uh_cursor_vcol, int uh_flags, Object uh_namedm,  uh_visual, Object uh_time, long uh_save_nr) {
		setUh_next(uh_next);
		setUh_prev(uh_prev);
		setUh_alt_next(uh_alt_next);
		setUh_alt_prev(uh_alt_prev);
		setUh_seq(uh_seq);
		setUh_walk(uh_walk);
		setUh_entry(uh_entry);
		setUh_getbot_entry(uh_getbot_entry);
		setUh_cursor(uh_cursor);
		setUh_cursor_vcol(uh_cursor_vcol);
		setUh_flags(uh_flags);
		setUh_namedm(uh_namedm);
		setUh_visual(uh_visual);
		setUh_time(uh_time);
		setUh_save_nr(uh_save_nr);
	}
	public u_header() {
	}
	
	public void u_free_uhp() {
		u_entry_T nuep = new u_entry_T();
		u_entry_T uep = new u_entry_T();
		u_entry generatedUh_entry = this.getUh_entry();
		uep = generatedUh_entry;
		u_entry generatedUe_next = uep.getUe_next();
		long generatedUe_size = uep.getUe_size();
		while (uep != ((Object)0)) {
			nuep = generatedUe_next;
			uep.u_freeentry(generatedUe_size);
			uep = nuep;
		}
		ModernizedCProgram.vim_free(uhp/*
		 * Write a sequence of bytes to the undo file.
		 * Buffers and encrypts as needed.
		 * Returns OK or FAIL.
		 */);
	}
	public u_header unserialize_uhp( bi, Object file_name) {
		u_header_T uhp = new u_header_T();
		int i;
		u_entry_T uep = new u_entry_T();
		u_entry_T last_uep = new u_entry_T();
		int c;
		int error;
		uhp = ModernizedCProgram.lalloc(/*Error: Unsupported expression*/, 0);
		if (uhp == ((Object)0)) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uhp), (false), (/*Error: Unsupported expression*/));
		 generatedUh_next = uhp.getUh_next();
		generatedUh_next.setSeq(bi.undo_read_4c());
		 generatedUh_prev = uhp.getUh_prev();
		generatedUh_prev.setSeq(bi.undo_read_4c());
		 generatedUh_alt_next = uhp.getUh_alt_next();
		generatedUh_alt_next.setSeq(bi.undo_read_4c());
		 generatedUh_alt_prev = uhp.getUh_alt_prev();
		generatedUh_alt_prev.setSeq(bi.undo_read_4c());
		uhp.setUh_seq(bi.undo_read_4c());
		long generatedUh_seq = uhp.getUh_seq();
		if (generatedUh_seq <= 0) {
			ModernizedCProgram.corruption_error("uh_seq", file_name);
			ModernizedCProgram.vim_free(uhp);
			return ((Object)0);
		} 
		 generatedUh_cursor = uhp.getUh_cursor();
		bi.unserialize_pos(generatedUh_cursor);
		uhp.setUh_cursor_vcol(bi.undo_read_4c());
		uhp.setUh_flags(bi.undo_read_2c());
		Object generatedUh_namedm = uhp.getUh_namedm();
		for (i = 0; i < ((byte)'z' - (byte)'a' + 1); ++i) {
			bi.unserialize_pos(generatedUh_namedm[i]);
		}
		 generatedUh_visual = uhp.getUh_visual();
		bi.unserialize_visualinfo(generatedUh_visual);
		uhp.setUh_time(bi.undo_read_time());
		/* Optional fields. */for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			int len = bi.undo_read_byte();
			int what;
			if (len == (true)) {
				ModernizedCProgram.corruption_error("truncated", file_name);
				uhp.u_free_uhp();
				return ((Object)0);
			} 
			if (len == 0) {
				break;
			} 
			what = bi.undo_read_byte();
			switch (what) {
			case 1:
					uhp.setUh_save_nr(bi.undo_read_4c());
					break;
			default:
					while (--len >= /* field not supported, skip */0) {
						(Object)bi.undo_read_byte();
					}
			}
		}
		last_uep = ((Object)/* Unserialize the uep list. */0);
		u_entry u_entry = new u_entry();
		while ((c = bi.undo_read_2c()) == -1024) {
			error = 0;
			uep = u_entry.unserialize_uep(bi, error, file_name);
			if (last_uep == ((Object)0)) {
				uhp.setUh_entry(uep);
			} else {
					last_uep.setUe_next(uep);
			} 
			last_uep = uep;
			if (uep == ((Object)0) || error) {
				uhp.u_free_uhp();
				return ((Object)0);
			} 
		}
		if (c != -1024) {
			ModernizedCProgram.corruption_error("entry end", file_name);
			uhp.u_free_uhp();
			return ((Object)0);
		} 
		return uhp/*
		 * Serialize "uep".
		 */;
	}
	public void u_unch_branch() {
		u_header_T uh = new u_header_T();
		int generatedUh_flags = uh.getUh_flags();
		 generatedUh_alt_next = uh.getUh_alt_next();
		Object generatedPtr = generatedUh_alt_next.getPtr();
		for (uh = uhp; uh != ((Object)0); uh = generatedPtr) {
			generatedUh_flags |=  -1024;
			if (generatedPtr != ((Object)0)) {
				generatedPtr.u_unch_branch();
			} 
		}
	}
	public  getUh_next() {
		return uh_next;
	}
	public void setUh_next( newUh_next) {
		uh_next = newUh_next;
	}
	public  getUh_prev() {
		return uh_prev;
	}
	public void setUh_prev( newUh_prev) {
		uh_prev = newUh_prev;
	}
	public  getUh_alt_next() {
		return uh_alt_next;
	}
	public void setUh_alt_next( newUh_alt_next) {
		uh_alt_next = newUh_alt_next;
	}
	public  getUh_alt_prev() {
		return uh_alt_prev;
	}
	public void setUh_alt_prev( newUh_alt_prev) {
		uh_alt_prev = newUh_alt_prev;
	}
	public long getUh_seq() {
		return uh_seq;
	}
	public void setUh_seq(long newUh_seq) {
		uh_seq = newUh_seq;
	}
	public int getUh_walk() {
		return uh_walk;
	}
	public void setUh_walk(int newUh_walk) {
		uh_walk = newUh_walk;
	}
	public u_entry getUh_entry() {
		return uh_entry;
	}
	public void setUh_entry(u_entry newUh_entry) {
		uh_entry = newUh_entry;
	}
	public u_entry getUh_getbot_entry() {
		return uh_getbot_entry;
	}
	public void setUh_getbot_entry(u_entry newUh_getbot_entry) {
		uh_getbot_entry = newUh_getbot_entry;
	}
	public  getUh_cursor() {
		return uh_cursor;
	}
	public void setUh_cursor( newUh_cursor) {
		uh_cursor = newUh_cursor;
	}
	public long getUh_cursor_vcol() {
		return uh_cursor_vcol;
	}
	public void setUh_cursor_vcol(long newUh_cursor_vcol) {
		uh_cursor_vcol = newUh_cursor_vcol;
	}
	public int getUh_flags() {
		return uh_flags;
	}
	public void setUh_flags(int newUh_flags) {
		uh_flags = newUh_flags;
	}
	public Object getUh_namedm() {
		return uh_namedm;
	}
	public void setUh_namedm(Object newUh_namedm) {
		uh_namedm = newUh_namedm;
	}
	public  getUh_visual() {
		return uh_visual;
	}
	public void setUh_visual( newUh_visual) {
		uh_visual = newUh_visual;
	}
	public Object getUh_time() {
		return uh_time;
	}
	public void setUh_time(Object newUh_time) {
		uh_time = newUh_time;
	}
	public long getUh_save_nr() {
		return uh_save_nr;
	}
	public void setUh_save_nr(long newUh_save_nr) {
		uh_save_nr = newUh_save_nr;
	}
}
// The following have a pointer and a number. The number is used when
