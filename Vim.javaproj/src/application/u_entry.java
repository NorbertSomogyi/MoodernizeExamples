package application;

public class u_entry {
	private u_entry ue_next;
	private Object ue_top;
	private Object ue_bot;
	private Object ue_lcount;
	private [] ue_array;
	private long ue_size;
	
	public u_entry(u_entry ue_next, Object ue_top, Object ue_bot, Object ue_lcount, [] ue_array, long ue_size) {
		setUe_next(ue_next);
		setUe_top(ue_top);
		setUe_bot(ue_bot);
		setUe_lcount(ue_lcount);
		setUe_array(ue_array);
		setUe_size(ue_size);
	}
	public u_entry() {
	}
	
	public u_entry unserialize_uep( bi, Integer error, Object file_name) {
		int i;
		u_entry_T uep = new u_entry_T();
		undoline_T array = ((Object)0);
		char_u line = new char_u();
		int line_len;
		uep = ModernizedCProgram.lalloc(/*Error: Unsupported expression*/, 0);
		if (uep == ((Object)0)) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((uep), (false), (/*Error: Unsupported expression*/));
		uep.setUe_top(bi.undo_read_4c());
		uep.setUe_bot(bi.undo_read_4c());
		uep.setUe_lcount(bi.undo_read_4c());
		uep.setUe_size(bi.undo_read_4c());
		long generatedUe_size = uep.getUe_size();
		if (generatedUe_size > 0) {
			if (generatedUe_size < LONG_MAX / (int)/*Error: Unsupported expression*/) {
				array = ModernizedCProgram.lalloc(/*Error: Unsupported expression*/ * generatedUe_size, 0);
			} 
			if (array == ((Object)0)) {
				error = 1;
				return uep;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((array), (false), (/*Error: Unsupported expression*/ * generatedUe_size));
		} 
		uep.setUe_array(array);
		for (i = 0; i < generatedUe_size; ++i) {
			line_len = bi.undo_read_4c();
			if (line_len >= 0) {
				line = bi.read_string_decrypt(line_len);
			} else {
					line = ((Object)0);
					ModernizedCProgram.corruption_error("line length", file_name);
			} 
			if (line == ((Object)0)) {
				error = 1;
				return uep;
			} 
			array[i].setUl_line(line);
			array[i].setUl_len(line_len + 1);
		}
		return uep/*
		 * Serialize "pos".
		 */;
	}
	public u_entry u_get_headentry() {
		u_header generatedB_u_newhead = curbuf.getB_u_newhead();
		u_entry generatedUh_entry = generatedB_u_newhead.getUh_entry();
		if (generatedB_u_newhead == ((Object)0) || generatedUh_entry == ((Object)0)) {
			ModernizedCProgram.iemsg(((byte)("E439: undo list corrupt")));
			return ((Object)0);
		} 
		return generatedUh_entry;
	}
	public void u_freeentry(long n) {
		[] generatedUe_array = this.getUe_array();
		while (n > 0) {
			ModernizedCProgram.vim_free(generatedUe_array[--n].getUl_line());
		}
		ModernizedCProgram.vim_free((char_u)generatedUe_array);
		ModernizedCProgram.vim_free((char_u)uep/*
		 * invalidate the undo buffer; called when storage has already been released
		 */);
	}
	public u_entry getUe_next() {
		return ue_next;
	}
	public void setUe_next(u_entry newUe_next) {
		ue_next = newUe_next;
	}
	public Object getUe_top() {
		return ue_top;
	}
	public void setUe_top(Object newUe_top) {
		ue_top = newUe_top;
	}
	public Object getUe_bot() {
		return ue_bot;
	}
	public void setUe_bot(Object newUe_bot) {
		ue_bot = newUe_bot;
	}
	public Object getUe_lcount() {
		return ue_lcount;
	}
	public void setUe_lcount(Object newUe_lcount) {
		ue_lcount = newUe_lcount;
	}
	public [] getUe_array() {
		return ue_array;
	}
	public void setUe_array([] newUe_array) {
		ue_array = newUe_array;
	}
	public long getUe_size() {
		return ue_size;
	}
	public void setUe_size(long newUe_size) {
		ue_size = newUe_size;
	}
}
