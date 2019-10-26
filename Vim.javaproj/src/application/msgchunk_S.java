package application;

public class msgchunk_S {
	private msgchunk_S sb_next;
	private msgchunk_S sb_prev;
	private byte sb_eol;
	private int sb_msg_col;
	private int sb_attr;
	private Object sb_text;
	
	public msgchunk_S(msgchunk_S sb_next, msgchunk_S sb_prev, byte sb_eol, int sb_msg_col, int sb_attr, Object sb_text) {
		setSb_next(sb_next);
		setSb_prev(sb_prev);
		setSb_eol(sb_eol);
		setSb_msg_col(sb_msg_col);
		setSb_attr(sb_attr);
		setSb_text(sb_text);
	}
	public msgchunk_S() {
	}
	
	public msgchunk_S msg_sb_start() {
		msgchunk_T mp = mps;
		msgchunk_S generatedSb_prev = mp.getSb_prev();
		byte generatedSb_eol = generatedSb_prev.getSb_eol();
		while (mp != ((Object)0) && generatedSb_prev != ((Object)0) && !generatedSb_eol) {
			mp = generatedSb_prev;
		}
		return mp/*
		 * Mark the last message chunk as finishing the line.
		 */;
	}
	public msgchunk_S disp_sb_line(int row) {
		msgchunk_T mp = smp;
		char_u p = new char_u();
		int generatedSb_msg_col = mp.getSb_msg_col();
		Object generatedSb_text = mp.getSb_text();
		int generatedSb_attr = mp.getSb_attr();
		byte generatedSb_eol = mp.getSb_eol();
		msgchunk_S generatedSb_next = mp.getSb_next();
		for (; ; ) {
			ModernizedCProgram.msg_row = row;
			ModernizedCProgram.msg_col = generatedSb_msg_col;
			p = generatedSb_text;
			if (p == /* don't display the line break */(byte)'\n') {
				++p;
			} 
			ModernizedCProgram.msg_puts_display(p, -1, generatedSb_attr, 1);
			if (generatedSb_eol || generatedSb_next == ((Object)0)) {
				break;
			} 
			mp = generatedSb_next;
		}
		return generatedSb_next;
	}
	public msgchunk_S getSb_next() {
		return sb_next;
	}
	public void setSb_next(msgchunk_S newSb_next) {
		sb_next = newSb_next;
	}
	public msgchunk_S getSb_prev() {
		return sb_prev;
	}
	public void setSb_prev(msgchunk_S newSb_prev) {
		sb_prev = newSb_prev;
	}
	public byte getSb_eol() {
		return sb_eol;
	}
	public void setSb_eol(byte newSb_eol) {
		sb_eol = newSb_eol;
	}
	public int getSb_msg_col() {
		return sb_msg_col;
	}
	public void setSb_msg_col(int newSb_msg_col) {
		sb_msg_col = newSb_msg_col;
	}
	public int getSb_attr() {
		return sb_attr;
	}
	public void setSb_attr(int newSb_attr) {
		sb_attr = newSb_attr;
	}
	public Object getSb_text() {
		return sb_text;
	}
	public void setSb_text(Object newSb_text) {
		sb_text = newSb_text;
	}
}
